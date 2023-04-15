import sys
import struct
import io

class Parser():
    def __init__(self, fh):
        self.fh = fh

    def debug(self, typ, data):
        print(typ, repr(data), file=sys.stderr)
        return data

    def field(self, name):
        print(name, end=" = ", file=sys.stderr)

    def tell(self):
        return self.fh.tell()

    def read(self, length):
        buf = self.fh.read(length)
        if len(buf) < length:
            raise IOError("Hit EOF after %d/%d bytes"
                          % (len(buf), length))
        return self.debug("raw[%d]" % length, buf)

    def readByte(self):
        length = 1
        buf = self.fh.read(length)
        if len(buf) < length:
            raise IOError("Hit EOF after %d/%d bytes" % (len(buf), length))
        data, = struct.unpack('>B', buf)
        return self.debug("byte", data)

    def readShort(self):
        length = 2
        buf = self.fh.read(length)
        if len(buf) < length:
            raise IOError("Hit EOF after %d/%d bytes" % (len(buf), length))
        data, = struct.unpack('>H', buf)
        return self.debug("short", data)

    def read_chunk(self):
        length = self.readShort()
        buf = self.fh.read(length)
        if len(buf) < length:
            raise IOError("Hit EOF after %d/%d bytes"
                          % (len(buf), length))
        return self.debug("chunk[%d]" % length, buf)

    def read_medium(self):
        length = 3
        buf = self.fh.read(length)
        if len(buf) < length:
            raise IOError("Hit EOF after %d/%d bytes" % (len(buf), length))

        data_hi, data_lo = struct.unpack('>BH', buf)
        return self.debug("medium", (data_hi << 16) | data_lo)

    def read_blob(self):
        length = self.readShort()
        buf = self.fh.read(length)
        if len(buf) < length:
            raise IOError("Hit EOF after %d/%d bytes" % (len(buf), length))

        return self.debug("chunk[%d]" % length, buf)

    def readUTF(self):
        return self.read_string();

    def read_string(self):
        buf = self.read_chunk()
        return buf.decode('utf-8')

    def read_url(self, base=None):
        buf = self.read_string()
        if buf and buf[0] == "\0":
            if not base:
                base = self.url_base
            buf = base + buf[1:]
        return self.debug("-> url[%d]" % len(buf), buf)

    def read_color(self):
        a = self.readByte()
        r = self.readByte()
        g = self.readByte()
        b = self.readByte()
        return self.debug("-> color[argb]", (a, r, g, b))

    def read_coords(self, rel_to_abs=False):
        x = self.readShort()
        y = self.read_medium()
        if rel_to_abs:
            self.last_x = x = (self.last_x + x) & 0xFFFF
            self.last_y = y = (self.last_y + y) & 0xFFFFFF
        else:
            # in v15+, all positions are relative and never depend on
            # earlier absolute coordinates (which are only used for sizes)
            pass
        return self.debug("-> coords[%s]" % ("rel" if rel_to_abs else "abs"), (x, y))


with open("l", "rb") as f:
    raw = f.read()

current_locale = "en-US"
    
p = Parser(io.BytesIO(raw))

assert p.readShort() == 3
locales_count = p.readByte()
print(locales_count)

available_locales = [''] * locales_count  # new String[locales_count]
avail_locales_names = [''] * locales_count

b2 = -1
b3 = 0

while b3 < locales_count:
    ru = p.readUTF()
    print(ru, current_locale)
    
    if current_locale and ru.startswith(current_locale):
        current_locale = ru
        b2 = b3
    available_locales[b3] = ru
    
    b3 += 1

if b2 == -1:
    current_locale = available_locales[0]
    b = 0
else:
    b = b2

t_count = p.readShort() - 1

translations_resources = [''] * t_count

for locale_index in range(locales_count):
    avail_locales_names[locale_index] = p.readUTF()
    for t_i in range(t_count):
        t_str = p.readUTF()
        if locale_index == b:
            translations_resources[t_i] = t_str

import json

with open("translations_resources.json", "w") as f:
    f.write(json.dumps(translations_resources))
