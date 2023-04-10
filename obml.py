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

    def read_byte(self):
        length = 1
        buf = self.fh.read(length)
        if len(buf) < length:
            raise IOError("Hit EOF after %d/%d bytes" % (len(buf), length))
        data, = struct.unpack('>B', buf)
        return self.debug("byte", data)

    def read_short(self):
        length = 2
        buf = self.fh.read(length)
        if len(buf) < length:
            raise IOError("Hit EOF after %d/%d bytes" % (len(buf), length))
        data, = struct.unpack('>H', buf)
        return self.debug("short", data)

    def read_chunk(self):
        length = self.read_short()
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
        length = self.read_short()
        buf = self.fh.read(length)
        if len(buf) < length:
            raise IOError("Hit EOF after %d/%d bytes" % (len(buf), length))

        return self.debug("chunk[%d]" % length, buf)

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
        a = self.read_byte()
        r = self.read_byte()
        g = self.read_byte()
        b = self.read_byte()
        return self.debug("-> color[argb]", (a, r, g, b))

    def read_coords(self, rel_to_abs=False):
        x = self.read_short()
        y = self.read_medium()
        if rel_to_abs:
            self.last_x = x = (self.last_x + x) & 0xFFFF
            self.last_y = y = (self.last_y + y) & 0xFFFFFF
        else:
            # in v15+, all positions are relative and never depend on
            # earlier absolute coordinates (which are only used for sizes)
            pass
        return self.debug("-> coords[%s]" % ("rel" if rel_to_abs else "abs"), (x, y))

def make_string(text):
    payload = text.encode('utf-8')
    size = len(payload)

    return size.to_bytes(2, 'big') + payload

MAGIC = b'\x02\xd3U\x10'
VER = b'\x0F'
CONST_240 = b'\x00\xF0'
VER_PAYLOAD = b'\x00\x00\x00\x00\x00\x00\x00\x00'
TITLE = b'\x00\x08WEB_PAGE'
EMPTY_CHUNK = b'\x00\x00'
REFER = b'\x00\x08REFERRER'

URL = make_string("http://classpaddev.github.io/")

raw = MAGIC + b'\x00\x00\x00' + VER + CONST_240 + VER_PAYLOAD + TITLE + EMPTY_CHUNK + REFER + URL

print(raw)

d = {}

f = Parser(io.BytesIO(raw))

f.field('magic')
f.read(4)
f.read(3)

f.field('version')
d['version'] = f.read_byte()

f.read_short()  # always 240
if d['version'] == 15:
    f.read(8)
elif d['version'] == 16:
    f.read(5)
else:
    raise IOError('Unknown version %d' % d['version'])

f.field('title')
d['title'] = f.read_string()

f.read_chunk()
# nil on v16, 'C\x10\x10...' on v15

f.field('referer')
d['referer'] = f.read_string()

f.field('url')
d['url'] = f.read_string()
if d['url'][0] == "\0":
    d['url'] = d['referer'] + d['url'][1:]

print(d["title"])
print(d["url"])
print()