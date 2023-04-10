import struct

with open("resources/t", "rb") as f:
    
    f1e = bytearray(225)  # related to sans80r.png
    f2f = bytearray(225)  # related to sans80b.png

    s = 0
    for i in range(225):
        try:
            d = f.read(2)
            s += int.from_bytes(d, byteorder='big')
            f1e[i] = s & 0xFF
            # f2f[i] = (s >> 8) & 0xFF
        except Exception as e:
            print(e)
            break
    
    s = 0
    for i in range(225):
        try:
            d = f.read(2)
            s2 = (s + int.from_bytes(d, byteorder='big')) & 0xFFFF
            s += int.from_bytes(d, byteorder='big')
            f2f[i] = s & 0xFF
            # f2f[i] = (s >> 8) & 0xFF
        except Exception as e:
            print(e)
            break
    
    print([i for i in f1e])
    print([i for i in f2f])
    
    f.seek(0)
    data = f.read()

f1e = []
f2f = []
s = 0

# lecture et stockage des valeurs pour f1e
for i in range(225):
    val = struct.unpack("<h", data[2*i:2*(i+1)])[0]
    s += val
    f1e.append(s & 0xFF)

s2 = 0

# lecture et stockage des valeurs pour f2f
for i in range(225):
    val = struct.unpack("<h", data[2*(i+225):2*(i+226)])[0]
    s2 += val
    f2f.append(s2 & 0xFF)

print(f1e)
print(f2f)