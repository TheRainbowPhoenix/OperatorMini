package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: b */
public final class GZIPInputStream extends InputStream {

    /* renamed from: a */
    private static final int[] f15a = {31, 139};

    /* renamed from: a */
    private static short[] f16a;

    /* renamed from: b */
    private static final int[] f17b = {3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23, 27, 31, 35, 43, 51, 59, 67, 83, 99, 115, 131, 163, 195, 227, 258, 0, 0};

    /* renamed from: b */
    private static short[] f18b;

    /* renamed from: c */
    private static final int[] f19c = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0, 112, 112};

    /* renamed from: d */
    private static final int[] f20d = {1, 2, 3, 4, 5, 7, 9, 13, 17, 25, 33, 49, 65, 97, 129, 193, 257, 385, 513, 769, 1025, 1537, 2049, 3073, 4097, 6145, 8193, 12289, 16385, 24577};

    /* renamed from: e */
    private static final int[] f21e = {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};

    /* renamed from: e */
    private static final short[] f22e = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};

    /* renamed from: f */
    private static final int[] f23f = {3, 3, 11};

    /* renamed from: g */
    private static final int[] f24g = {2, 3, 7};

    /* renamed from: h */
    private static final int[] f25h = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* renamed from: a */
    private byte f26a;

    /* renamed from: a */
    public int f27a;

    /* renamed from: a */
    public InputStream f28a;

    /* renamed from: a */
    public boolean f29a;

    /* renamed from: a */
    public byte[] f30a;

    /* renamed from: b */
    private int f31b;

    /* renamed from: b */
    private boolean f32b;

    /* renamed from: b */
    private byte[] f33b = new byte[1];

    /* renamed from: c */
    private int f34c;

    /* renamed from: c */
    private boolean f35c;

    /* renamed from: c */
    private byte[] f36c;

    /* renamed from: c */
    private short[] f37c;

    /* renamed from: d */
    private int f38d;

    /* renamed from: d */
    private boolean f39d;

    /* renamed from: d */
    private byte[] f40d = new byte[32768];

    /* renamed from: d */
    private short[] f41d;

    /* renamed from: e */
    private int f42e;

    /* renamed from: e */
    private byte[] f43e;

    /* renamed from: f */
    private int f44f;

    /* renamed from: f */
    private byte[] f45f;

    /* renamed from: f */
    private short[] f46f;

    /* renamed from: g */
    private int f47g;

    /* renamed from: h */
    private int f48h;

    /* renamed from: i */
    private int f49i;

    /* renamed from: j */
    private int f50j;

    /* renamed from: k */
    private int f51k;

    /* renamed from: l */
    private int f52l;

    /* renamed from: m */
    private int f53m;

    /* renamed from: n */
    private int f54n;

    /* renamed from: o */
    private int f55o;

    /* renamed from: p */
    private int f56p;

    /* renamed from: q */
    private int f57q;

    /* renamed from: r */
    private int f58r;

    /* renamed from: s */
    private int f59s;

    /* renamed from: t */
    private int f60t;

    /* renamed from: u */
    private int f61u;

    /* renamed from: v */
    private int f62v;

    /* renamed from: w */
    private int f63w;

    static {
        byte[] bArr = new byte[288];
        int i = 0;
        while (i < 144) {
            bArr[i] = 8;
            i++;
        }
        while (i < 256) {
            bArr[i] = 9;
            i++;
        }
        while (i < 280) {
            bArr[i] = 7;
            i++;
        }
        while (i < 288) {
            bArr[i] = 8;
            i++;
        }
        f16a = m23a(bArr, 288);
        byte[] bArr2 = new byte[32];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr2[i2] = 5;
        }
        f18b = m23a(bArr2, 32);
    }

    public GZIPInputStream(InputStream inputStream, int i) throws IOException {
        this.f28a = inputStream;
        m20a(true);
        this.f27a = 0;
        if (i <= 0) {
            throw new IOException("size <= 0");
        }
        this.f30a = new byte[i];
    }

    /* renamed from: a */
    private int m13a() {
        return (this.f34c - this.f31b) + (this.f53m >> 3);
    }

    /* renamed from: a */
    private final int m14a(int i) {
        if (this.f53m < i) {
            if (this.f31b == this.f34c) {
                return -1;
            }
            int i2 = this.f52l;
            byte[] bArr = this.f36c;
            int i3 = this.f31b;
            this.f31b = i3 + 1;
            byte[] bArr2 = this.f36c;
            int i4 = this.f31b;
            this.f31b = i4 + 1;
            this.f52l = i2 | (((bArr[i3] & 255) | ((bArr2[i4] & 255) << 8)) << this.f53m);
            this.f53m += 16;
        }
        return this.f52l & ((1 << i) - 1);
    }

    /* renamed from: a */
    private int m15a(byte[] bArr, int i, int i2) throws IOException {
        while (true) {
            int c = m29c(bArr, i, i2);
            if (c > 0) {
                return c;
            }
            if (m22a() || m27b()) {
                return -1;
            }
            if (this.f31b == this.f34c) {
                m30c();
            }
        }
        return -1;
    }

    /* renamed from: a */
    private int m16a(short[] sArr) {
        int a = m14a(9);
        if (a < 0) {
            int i = this.f53m;
            short s = sArr[m14a(i)];
            if (s < 0 || (s & 15) > i) {
                return -1;
            }
            m19a(s & 15);
            return s >> 4;
        }
        short s2 = sArr[a];
        if (s2 >= 0) {
            m19a(s2 & 15);
            return s2 >> 4;
        }
        int i2 = -(s2 >> 4);
        int a2 = m14a(s2 & 15);
        if (a2 >= 0) {
            short s3 = sArr[(a2 >> 9) | i2];
            m19a(s3 & 15);
            return s3 >> 4;
        }
        int i3 = this.f53m;
        short s4 = sArr[i2 | (m14a(i3) >> 9)];
        if ((s4 & 15) > i3) {
            return -1;
        }
        m19a(s4 & 15);
        return s4 >> 4;
    }

    /* renamed from: a */
    private static final short m17a(int i) {
        return (short) ((f22e[i & 15] << 12) | (f22e[(i >> 4) & 15] << 8) | (f22e[(i >> 8) & 15] << 4) | f22e[i >> 12]);
    }

    /* renamed from: a */
    private void m18a() throws IOException {
        int read;
        int read2;
        int read3 = this.f28a.read();
        if (read3 < 0) {
            this.f29a = true;
            return;
        }
        int read4 = this.f28a.read();
        if (read3 == f15a[0] && read4 == f15a[1]) {
            int read5 = this.f28a.read();
            int read6 = this.f28a.read();
            if (read5 == 8 && (read6 & 224) == 0) {
                for (int i = 0; i < 6; i++) {
                    if (this.f28a.read() < 0) {
                        throw new IOException("Corrupt GZIP header");
                    }
                }
                if ((read6 & 4) != 0) {
                    int read7 = this.f28a.read();
                    if (read7 >= 0) {
                        int read8 = this.f28a.read();
                        if (read8 >= 0) {
                            int i2 = read7 + (read8 << 8);
                            while (true) {
                                int i3 = i2 - 1;
                                if (i2 == 0) {
                                    break;
                                } else if (this.f28a.read() < 0) {
                                    throw new IOException("Corrupt GZIP header");
                                } else {
                                    i2 = i3;
                                }
                            }
                        } else {
                            throw new IOException("Corrupt GZIP header");
                        }
                    } else {
                        throw new IOException("Corrupt GZIP header");
                    }
                }
                if ((read6 & 8) != 0) {
                    do {
                        read2 = this.f28a.read();
                        if (read2 != 0) {
                        }
                    } while (read2 >= 0);
                    throw new IOException("Corrupt GZIP header");
                }
                if ((read6 & 16) != 0) {
                    do {
                        read = this.f28a.read();
                        if (read != 0) {
                        }
                    } while (read >= 0);
                    throw new IOException("Corrupt GZIP header");
                }
                if ((read6 & 2) != 0) {
                    for (int i4 = 0; i4 < 2; i4++) {
                        if (this.f28a.read() < 0) {
                            throw new IOException("Corrupt GZIP header");
                        }
                    }
                }
                this.f32b = true;
                return;
            }
            throw new IOException("Corrupt GZIP header");
        }
        throw new IOException("Not in GZIP format");
    }

    /* renamed from: a */
    private final void m19a(int i) {
        this.f52l >>>= i;
        this.f53m -= i;
    }

    /* renamed from: a */
    private void m20a(boolean z) {
        this.f39d = z;
        this.f44f = z ? 2 : 0;
        this.f48h = 0;
        this.f38d = 0;
        this.f34c = 0;
        this.f31b = 0;
        this.f53m = 0;
        this.f52l = 0;
        this.f50j = 0;
        this.f51k = 0;
        this.f37c = null;
        this.f41d = null;
        this.f35c = false;
        this.f63w = 1;
    }

    /* renamed from: a */
    private void m21a(byte[] bArr, int i) {
        int i2 = this.f63w & 65535;
        int i3 = 65535 & (this.f63w >> 16);
        for (int i4 = 0; i4 < i; i4++) {
            i2 = (i2 + bArr[i4]) % 65521;
            i3 = (i3 + i2) % 65521;
        }
        this.f63w = (i3 << 16) + i2;
    }

    /* renamed from: a */
    private boolean m22a() {
        return this.f44f == 1 && this.f49i == 0;
    }

    /* renamed from: a */
    private static short[] m23a(byte[] bArr, int i) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        for (int i2 = 0; i2 <= 15; i2++) {
            iArr[i2] = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            byte b = bArr[i3];
            iArr[b] = iArr[b] + 1;
        }
        int i4 = 512;
        int i5 = 0;
        for (int i6 = 1; i6 <= 15; i6++) {
            iArr2[i6] = i5;
            i5 += iArr[i6] << (16 - i6);
            if (i6 > 9) {
                i4 += ((i5 & 1048448) - (iArr2[i6] & 1048448)) >> (16 - i6);
            }
        }
        short[] sArr = new short[i4];
        int i7 = 512;
        for (int i8 = 15; i8 > 9; i8--) {
            int i9 = i5 & 1048448;
            i5 -= iArr[i8] << (16 - i8);
            for (int i10 = i5 & 1048448; i10 < i9; i10 += 128) {
                sArr[m17a(i10)] = (short) (((-i7) << 4) | i8);
                i7 += 1 << (i8 - 9);
            }
        }
        for (int i11 = 0; i11 < i; i11++) {
            byte b2 = bArr[i11];
            if (b2 != 0) {
                int i12 = iArr2[b2];
                int a = m17a(i12);
                if (b2 <= 9) {
                    do {
                        sArr[a] = (short) ((i11 << 4) | b2);
                        a += 1 << b2;
                    } while (a < 512);
                } else {
                    short s = sArr[a & 511];
                    int i13 = 1 << (s & 15);
                    int i14 = -(s >> 4);
                    do {
                        sArr[(a >> 9) | i14] = (short) ((i11 << 4) | b2);
                        a += 1 << b2;
                    } while (a < i13);
                }
                iArr2[b2] = (1 << (16 - b2)) + i12;
            }
        }
        return sArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x015c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m24b() {
        /*
        // Method dump skipped, instructions count: 452
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.GZIPInputStream.m24b():int");
    }

    /* renamed from: b */
    private int m25b(byte[] bArr, int i, int i2) {
        if (i2 < 0 || (this.f53m & 7) != 0) {
            return -1;
        }
        int i3 = 0;
        while (this.f53m > 0 && i2 > 0) {
            bArr[i] = (byte) this.f52l;
            this.f52l >>>= 8;
            this.f53m -= 8;
            i2--;
            i3++;
            i++;
        }
        if (i2 == 0) {
            return i3;
        }
        int i4 = this.f34c - this.f31b;
        if (i2 > i4) {
            i2 = i4;
        }
        System.arraycopy(this.f36c, this.f31b, bArr, i, i2);
        this.f31b += i2;
        if (((this.f31b - this.f34c) & 1) != 0) {
            byte[] bArr2 = this.f36c;
            int i5 = this.f31b;
            this.f31b = i5 + 1;
            this.f52l = bArr2[i5] & 255;
            this.f53m = 8;
        }
        return i3 + i2;
    }

    /* renamed from: b */
    private void m26b() throws IOException {
        int i = 8;
        byte[] bArr = new byte[8];
        int a = m13a();
        if (a <= 8) {
            i = a;
        }
        System.arraycopy(this.f30a, this.f27a - m13a(), bArr, 0, i);
        int i2 = 8 - i;
        while (i2 > 0) {
            int read = this.f28a.read(bArr, 8 - i2, i2);
            if (read <= 0) {
                throw new IOException("Corrupt GZIP trailer");
            }
            i2 -= read;
        }
        if (((bArr[4] & 255) | ((bArr[5] & 255) << 8) | ((bArr[6] & 255) << 16) | (bArr[7] << 24)) != this.f48h) {
            throw new IOException("Corrupt GZIP trailer");
        }
        this.f29a = true;
    }

    /* renamed from: b */
    private boolean m27b() {
        return this.f44f == 12 && this.f51k == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0091 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m28c() {
        /*
        // Method dump skipped, instructions count: 326
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.GZIPInputStream.m28c():int");
    }

    /* renamed from: c */
    private int m29c(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (i2 != 0) {
            if (i >= 0 && i <= i + i2 && i + i2 <= bArr.length) {
                while (true) {
                    if (this.f44f != 11) {
                        int i7 = this.f50j;
                        if (i2 > this.f51k) {
                            i3 = this.f51k;
                        } else {
                            i7 = ((this.f50j - this.f51k) + i2) & 32767;
                            i3 = i2;
                        }
                        int i8 = i3 - i7;
                        if (i8 > 0) {
                            System.arraycopy(this.f40d, 32768 - i8, bArr, i, i8);
                            i4 = i8 + i;
                            i5 = i7;
                        } else {
                            i4 = i;
                            i5 = i3;
                        }
                        System.arraycopy(this.f40d, i7 - i5, bArr, i4, i5);
                        this.f51k -= i3;
                        if (this.f51k >= 0) {
                            m21a(bArr, i3);
                            i += i3;
                            i6 += i3;
                            this.f48h += i3;
                            i2 -= i3;
                            if (i2 == 0) {
                                break;
                            }
                        } else {
                            throw new IOException("Internal State Error");
                        }
                    }
                    int b = m24b();
                    if (b >= 0) {
                        if (b != 1 && (this.f51k <= 0 || this.f44f == 11)) {
                            break;
                        }
                    } else {
                        throw new IOException("Internal State Error");
                    }
                }
            } else {
                throw new IOException("Internal State Error");
            }
        }
        return i6;
    }

    /* renamed from: c */
    private void m30c() throws IOException {
        int i;
        this.f27a = this.f28a.read(this.f30a, 0, this.f30a.length);
        if (this.f27a < 0) {
            throw new IOException("Unexpected end of ZLIB input stream");
        } else if (this.f31b < this.f34c) {
            throw new IOException("Internal State Error");
        } else {
            int i2 = this.f27a + 0;
            if (i2 < 0 || i2 > this.f30a.length) {
                throw new IOException("Internal State Error");
            }
            if ((this.f27a & 1) != 0) {
                i = 1;
                this.f52l = ((this.f30a[0] & 255) << this.f53m) | this.f52l;
                this.f53m += 8;
            } else {
                i = 0;
            }
            this.f36c = this.f30a;
            this.f31b = i;
            this.f34c = i2;
            this.f38d += this.f27a;
        }
    }

    /* renamed from: d */
    private int m31d() {
        while (true) {
            switch (this.f56p) {
                case 0:
                    this.f57q = m14a(5);
                    if (this.f57q < 0) {
                        return 0;
                    }
                    this.f57q += 257;
                    m19a(5);
                    this.f56p = 1;
                case 1:
                    this.f58r = m14a(5);
                    if (this.f58r < 0) {
                        return 0;
                    }
                    this.f58r++;
                    m19a(5);
                    this.f60t = this.f57q + this.f58r;
                    this.f45f = new byte[this.f60t];
                    this.f56p = 2;
                case 2:
                    this.f59s = m14a(4);
                    if (this.f59s < 0) {
                        return 0;
                    }
                    this.f59s += 4;
                    m19a(4);
                    this.f43e = new byte[19];
                    this.f62v = 0;
                    this.f56p = 3;
                case 3:
                    while (this.f62v < this.f59s) {
                        int a = m14a(3);
                        if (a < 0) {
                            return 0;
                        }
                        m19a(3);
                        this.f43e[f25h[this.f62v]] = (byte) a;
                        this.f62v++;
                    }
                    this.f46f = m23a(this.f43e, this.f43e.length);
                    this.f43e = null;
                    this.f62v = 0;
                    this.f56p = 4;
                case 4:
                    while (true) {
                        int a2 = m16a(this.f46f);
                        if ((a2 & -16) == 0) {
                            byte[] bArr = this.f45f;
                            int i = this.f62v;
                            this.f62v = i + 1;
                            byte b = (byte) a2;
                            this.f26a = b;
                            bArr[i] = b;
                            if (this.f62v == this.f60t) {
                                break;
                            }
                        } else if (a2 >= 0) {
                            if (a2 >= 17) {
                                this.f26a = 0;
                            } else if (this.f62v == 0) {
                                return -1;
                            }
                            this.f61u = a2 - 16;
                            this.f56p = 5;
                            break;
                        } else {
                            return 0;
                        }
                    }
            }
            int i2 = f24g[this.f61u];
            int a3 = m14a(i2);
            if (a3 < 0) {
                return 0;
            }
            m19a(i2);
            int i3 = f23f[this.f61u] + a3;
            if (this.f62v + i3 > this.f60t) {
                return -1;
            }
            while (true) {
                int i4 = i3 - 1;
                if (i3 > 0) {
                    byte[] bArr2 = this.f45f;
                    int i5 = this.f62v;
                    this.f62v = i5 + 1;
                    bArr2[i5] = this.f26a;
                    i3 = i4;
                } else if (this.f62v != this.f60t) {
                    this.f56p = 4;
                }
            }
        }
        byte[] bArr3 = new byte[this.f57q];
        System.arraycopy(this.f45f, 0, bArr3, 0, this.f57q);
        this.f37c = m23a(bArr3, this.f57q);
        byte[] bArr4 = new byte[this.f58r];
        System.arraycopy(this.f45f, this.f57q, bArr4, 0, this.f58r);
        this.f41d = m23a(bArr4, this.f58r);
        return 1;
    }

    /* renamed from: d */
    private void m32d() {
        this.f52l >>= this.f53m & 7;
        this.f53m &= -8;
    }

    /* renamed from: e */
    private void m33e() {
        this.f56p = 0;
        this.f60t = 0;
        this.f59s = 0;
        this.f58r = 0;
        this.f57q = 0;
        this.f61u = 0;
        this.f26a = 0;
        this.f62v = 0;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return m27b() ? 0 : 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() throws IOException {
        this.f28a.close();
    }

    public final synchronized void mark(int i) {
        this.f28a.mark(i);
    }

    public final boolean markSupported() {
        return this.f28a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (read(this.f33b, 0, 1) == -1) {
            return -1;
        }
        return this.f33b[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f32b) {
            m18a();
        }
        if (this.f29a) {
            return -1;
        }
        int a = m15a(bArr, i, i2);
        if (!m27b()) {
            return a;
        }
        m26b();
        return a;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f28a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = 0;
        if (j < 0) {
            throw new IOException("negative skip length");
        }
        byte[] bArr = new byte[512];
        while (true) {
            if (j2 >= j) {
                break;
            }
            long j3 = j - j2;
            long read = (long) read(bArr, 0, j3 < ((long) bArr.length) ? (int) j3 : bArr.length);
            if (read == -1) {
                this.f29a = true;
                break;
            }
            j2 = read + j2;
        }
        return j2;
    }
}
