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
    
    def readFully(self, size):
        length = 1 
        buf = self.fh.read(size)
        if len(buf) < size:
            raise IOError("Hit EOF after %d/%d bytes" % (len(buf), length))
        self.debug("fully", size)
        return buf
        

    def read_link(self):
        objArr = [0] * 5
        objArr[0] = self.readUTF()
        objArr[1] = self.readUTF()
        
        l = self.readShort()
        objArr[2] = self.readFully(l)
        objArr[3] = self.readByte()
        
        return objArr

with open("b", "rb") as f:
    raw = f.read()

z = False
    
p = Parser(io.BytesIO(raw))

# load_home_defaults_links
rb = p.readByte()

b = 0
i2 = 0

while b < rb:
    a2 = p.read_link()
    if a2:
        if z:
            pass # m93a(a2, false);
        
        print(a2)

    i = i2
    b += 1
    i2 = i
    