package p000;

import java.io.DataInputStream;

/* renamed from: j */
public final class C0009j {

    /* renamed from: a */
    private static short[] f93a = null;

    /* renamed from: b */
    private static int[] f94b = null;

    /* renamed from: b */
    private static short[] f95b = null;

    /* renamed from: c */
    private static int[] f96c = null;

    /* renamed from: c */
    private static short[] f97c = null;

    /* renamed from: a */
    public int f98a;

    /* renamed from: a */
    private byte[] f99a;

    /* renamed from: a */
    public int[] f100a;

    /* renamed from: a */
    private byte[][] f101a = new byte[3][];

    /* renamed from: a */
    private int[][] f102a = new int[16][];

    /* renamed from: a */
    private short[][] f103a = new short[16][];

    /* renamed from: b */
    public int f104b;

    /* renamed from: b */
    private byte[][] f105b = new byte[16][];

    /* renamed from: b */
    private int[][] f106b = new int[16][];

    /* renamed from: c */
    public int f107c;

    /* renamed from: c */
    private byte[][] f108c = new byte[16][];

    /* renamed from: c */
    private int[][] f109c = new int[4][];

    /* renamed from: d */
    public int f110d;

    /* renamed from: d */
    private int[] f111d = new int[3];

    /* renamed from: d */
    private short[] f112d = new short[3];

    /* renamed from: e */
    private int f113e;

    /* renamed from: e */
    private int[] f114e = new int[3];

    /* renamed from: f */
    private int f115f;

    /* renamed from: f */
    private int[] f116f = new int[3];

    /* renamed from: g */
    private int f117g;

    /* renamed from: g */
    private int[] f118g = new int[3];

    /* renamed from: h */
    private int f119h;

    /* renamed from: h */
    private int[] f120h = new int[3];

    /* renamed from: i */
    private int f121i;

    /* renamed from: i */
    private int[] f122i = new int[3];

    /* renamed from: j */
    private int f123j;

    /* renamed from: j */
    private int[] f124j = new int[6];

    /* renamed from: k */
    private int f125k;

    /* renamed from: k */
    private int[] f126k = new int[3];

    /* renamed from: l */
    private int f127l;

    /* renamed from: m */
    private int f128m;

    /* renamed from: n */
    private int f129n;

    /* renamed from: o */
    private int f130o;

    /* renamed from: p */
    private int f131p;

    /* renamed from: q */
    private int f132q;

    /* renamed from: r */
    private int f133r;

    /* renamed from: s */
    private int f134s;

    /* renamed from: t */
    private int f135t;

    /* renamed from: u */
    private int f136u;

    public C0009j() {
        if (f93a == null) {
            try {
                DataInputStream dataInputStream = new DataInputStream(C0010k.m61a("/t"));
                dataInputStream.skip(900);
                f93a = new short[768];
                f95b = new short[256];
                f97c = new short[256];
                f94b = new int[64];
                f96c = new int[64];
                short s = 0;
                for (int i = 0; i < 768; i++) {
                    short[] sArr = f93a;
                    s = (short) (s + dataInputStream.readShort());
                    sArr[i] = s;
                }
                short s2 = 0;
                for (int i2 = 0; i2 < 256; i2++) {
                    short[] sArr2 = f95b;
                    s2 = (short) (s2 + dataInputStream.readShort());
                    sArr2[i2] = s2;
                }
                short s3 = 0;
                for (int i3 = 0; i3 < 256; i3++) {
                    short[] sArr3 = f97c;
                    s3 = (short) (s3 + dataInputStream.readShort());
                    sArr3[i3] = s3;
                }
                int i4 = 0;
                for (int i5 = 0; i5 < 64; i5++) {
                    int[] iArr = f94b;
                    i4 = (short) (i4 + dataInputStream.readShort());
                    iArr[i5] = i4;
                }
                int i6 = 0;
                for (int i7 = 0; i7 < 64; i7++) {
                    int[] iArr2 = f96c;
                    i6 = (short) (i6 + dataInputStream.readShort());
                    iArr2[i7] = i6;
                }
            } catch (Throwable th) {
                return;
            }
        }
        this.f117g = 0;
        this.f119h = 0;
        this.f123j = 0;
        this.f134s = 0;
        for (int i8 = 0; i8 < 3; i8++) {
            this.f101a[i8] = null;
            this.f102a[i8] = null;
            this.f106b[i8] = null;
            this.f103a[i8] = null;
            this.f105b[i8] = null;
            this.f108c[i8] = null;
        }
    }

    /* renamed from: a */
    private int m37a() {
        short[] sArr = new short[64];
        while (true) {
            int i = this.f120h[this.f131p];
            for (int i2 = 0; i2 < 64; i2++) {
                sArr[i2] = 0;
            }
            int a = m40a(i, sArr);
            if (a != 0) {
                return a;
            }
            int i3 = this.f122i[i] / (this.f114e[i] * this.f116f[i]);
            int i4 = this.f122i[i] % (this.f114e[i] * this.f116f[i]);
            int i5 = (i3 * this.f116f[i]) + (i4 % this.f116f[i]);
            if (i5 < this.f118g[i]) {
                m42a(i, sArr, this.f101a[i], (i5 + ((i4 / this.f116f[i]) * this.f118g[i] * 8)) * 8, this.f118g[i] * 8);
            }
            int[] iArr = this.f122i;
            iArr[i] = iArr[i] + 1;
            this.f135t--;
            if (this.f135t == 0) {
                m41a();
                this.f136u++;
                if ((this.f130o <= 1 || this.f136u < this.f129n / (this.f125k * 8)) && (this.f130o != 1 || this.f136u < (((((this.f114e[i] * this.f104b) + this.f125k) - 1) / this.f125k) + 7) / 8)) {
                    m46b();
                }
            }
            this.f132q++;
            if (this.f132q >= this.f116f[i] * this.f114e[i] || this.f130o == 1) {
                this.f132q = 0;
                this.f131p++;
                if (this.f131p >= this.f130o) {
                    this.f131p = 0;
                    this.f133r++;
                }
            }
            if (this.f133r == this.f134s && this.f134s > 0) {
                this.f133r = 0;
                m50d();
                this.f117g = 5;
                return 0;
            }
        }
        this.f117g = 2;
        return 0;
    }

    /* renamed from: a */
    private int m38a(int i) {
        if (i == 0) {
            return 0;
        }
        if (this.f110d < i) {
            m51e();
            if (this.f110d < i) {
                return -2;
            }
        }
        int i2 = this.f107c >>> (32 - i);
        this.f107c <<= i;
        this.f110d -= i;
        return i2;
    }

    /* renamed from: a */
    private static int m39a(int i, int i2) {
        return i2 < (1 << (i + -1)) ? (-1 << i) + i2 + 1 : i2;
    }

    /* renamed from: a */
    private int m40a(int i, short[] sArr) {
        int i2;
        int i3 = this.f115f;
        int i4 = this.f107c;
        int i5 = this.f110d;
        int i6 = this.f124j[i * 2];
        if (this.f105b[i6] == null) {
            return -1;
        }
        int b = m44b(i6);
        if (b < 0) {
            this.f113e -= i3 - this.f115f;
            this.f115f = i3;
            this.f107c = i4;
            this.f110d = i5;
            return b;
        }
        int a = m38a(b);
        if (a < 0) {
            this.f113e -= i3 - this.f115f;
            this.f115f = i3;
            this.f107c = i4;
            this.f110d = i5;
            return a;
        }
        sArr[0] = (short) (m39a(b, a) + this.f112d[i]);
        int i7 = this.f124j[(i * 2) + 1];
        if (this.f105b[i7] == null) {
            return -1;
        }
        int i8 = 1;
        while (i8 < 64) {
            int b2 = m44b(i7);
            if (b2 < 0) {
                this.f113e -= i3 - this.f115f;
                this.f115f = i3;
                this.f107c = i4;
                this.f110d = i5;
                return b2;
            }
            int i9 = b2 & 15;
            int i10 = b2 >> 4;
            if (i9 != 0) {
                int a2 = m38a(i9);
                if (a2 < 0) {
                    this.f113e -= i3 - this.f115f;
                    this.f115f = i3;
                    this.f107c = i4;
                    this.f110d = i5;
                    return a2;
                }
                i2 = i10 + i8;
                if (i2 >= 64) {
                    i2 = 63;
                }
                sArr[i2] = (short) m39a(i9, a2);
            } else if (i10 == 15) {
                i2 = i10 + i8;
            } else if (i10 > 0) {
                return -1;
            } else {
                this.f112d[i] = sArr[0];
                return 0;
            }
            i8 = i2 + 1;
        }
        this.f112d[i] = sArr[0];
        return 0;
    }

    /* renamed from: a */
    private void m41a() {
        int i = this.f125k * 8;
        int i2 = i * this.f136u;
        int[] iArr = new int[3];
        int[] iArr2 = new int[3];
        int[] iArr3 = new int[3];
        int[] iArr4 = new int[3];
        if (this.f123j == 3) {
            iArr[0] = 0;
            iArr2[0] = (this.f114e[0] << 11) / this.f125k;
            iArr4[0] = (this.f116f[0] << 11) / this.f127l;
            iArr[1] = 0;
            iArr2[1] = (this.f114e[1] << 11) / this.f125k;
            iArr4[1] = (this.f116f[1] << 11) / this.f127l;
            iArr[2] = 0;
            iArr2[2] = (this.f114e[2] << 11) / this.f125k;
            iArr4[2] = (this.f116f[2] << 11) / this.f127l;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (i2 + i3 < this.f104b && this.f123j == 3) {
                int i4 = this.f98a * (i2 + i3);
                int i5 = (iArr[0] >> 11) * this.f118g[0] * 8;
                iArr[0] = iArr[0] + iArr2[0];
                iArr3[0] = 0;
                int i6 = (iArr[1] >> 11) * this.f118g[1] * 8;
                iArr[1] = iArr[1] + iArr2[1];
                iArr3[1] = 0;
                int i7 = (iArr[2] >> 11) * this.f118g[2] * 8;
                iArr[2] = iArr[2] + iArr2[2];
                iArr3[2] = 0;
                if (this.f116f[0] == 2 && this.f116f[1] == 1 && this.f116f[2] == 1) {
                    int i8 = this.f98a >> 1;
                    for (int i9 = 0; i9 < i8; i9++) {
                        int i10 = this.f101a[0][(i9 << 1) + i5] & 255;
                        int i11 = this.f101a[1][i6 + i9] & 255;
                        int i12 = this.f101a[2][i7 + i9] & 255;
                        short s = f95b[i12];
                        short s2 = f97c[i11];
                        int i13 = (((i11 - 128) * 705) + ((i12 - 128) * 1463)) >> 11;
                        int i14 = i4 + 1;
                        this.f100a[i4] = f93a[i10 + s2 + 256] | (f93a[(i10 + s) + 256] << 16) | (f93a[(i10 - i13) + 256] << 8);
                        int i15 = this.f101a[0][(i9 << 1) + i5 + 1] & 255;
                        short s3 = f93a[i15 + s + 256];
                        short s4 = f93a[(i15 - i13) + 256];
                        short s5 = f93a[i15 + s2 + 256];
                        i4 = i14 + 1;
                        this.f100a[i14] = (s3 << 16) | (s4 << 8) | s5;
                    }
                    if ((this.f98a & 1) != 0) {
                        int i16 = this.f101a[0][(this.f98a + i5) - 1] & 255;
                        int i17 = this.f101a[1][((this.f98a - 1) >> 1) + i6] & 255;
                        short s6 = f93a[f97c[i17] + i16 + 256];
                        int i18 = (this.f101a[2][((this.f98a - 1) >> 1) + i7] & 255) - 128;
                        this.f100a[i4] = (f93a[(i16 + f95b[i18 + 128]) + 256] << 16) | (f93a[(i16 - ((((i17 - 128) * 705) + (i18 * 1463)) >> 11)) + 256] << 8) | s6;
                    }
                } else if (this.f116f[0] == 1 && this.f116f[1] == 1 && this.f116f[2] == 1) {
                    int i19 = 0;
                    while (i19 < this.f98a) {
                        int i20 = this.f101a[0][i5 + i19] & 255;
                        int i21 = this.f101a[1][i6 + i19] & 255;
                        short s7 = f93a[f97c[i21] + i20 + 256];
                        int i22 = (this.f101a[2][i7 + i19] & 255) - 128;
                        this.f100a[i4] = (f93a[(i20 - ((((i21 - 128) * 705) + (i22 * 1463)) >> 11)) + 256] << 8) | (f93a[(i20 + f95b[i22 + 128]) + 256] << 16) | s7;
                        i19++;
                        i4++;
                    }
                } else {
                    int i23 = 0;
                    while (i23 < this.f98a) {
                        iArr3[0] = iArr3[0] + iArr4[0];
                        byte b = this.f101a[0][(iArr3[0] >> 11) + i5];
                        iArr3[1] = iArr3[1] + iArr4[1];
                        byte b2 = this.f101a[1][(iArr3[1] >> 11) + i6];
                        iArr3[2] = iArr3[2] + iArr4[2];
                        byte b3 = this.f101a[2][(iArr3[2] >> 11) + i7];
                        int i24 = b3 - 128;
                        this.f100a[i4] = (f93a[(b - ((((b2 - 128) * 705) + (i24 * 1463)) >> 11)) + 256] << 8) | (f93a[(b + f95b[i24 + 128]) + 256] << 16) | f93a[f97c[b2] + b + 256];
                        i23++;
                        i4++;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: short[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v163, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r3v218, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r3v221, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r3v224, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r3v227, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r3v230, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r3v233, resolved type: short */
    /* JADX DEBUG: Multi-variable search result rejected for r3v236, resolved type: short */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m42a(int i, short[] sArr, byte[] bArr, int i2, int i3) {
        int[] iArr = new int[64];
        for (int i4 = 0; i4 < 64; i4 += 8) {
            iArr[i4] = sArr[f94b[i4]] * this.f109c[this.f126k[i]][i4];
            iArr[i4 + 1] = sArr[f94b[i4 + 1]];
            iArr[i4 + 2] = sArr[f94b[i4 + 2]];
            iArr[i4 + 3] = sArr[f94b[i4 + 3]];
            iArr[i4 + 4] = sArr[f94b[i4 + 4]];
            iArr[i4 + 5] = sArr[f94b[i4 + 5]];
            iArr[i4 + 6] = sArr[f94b[i4 + 6]];
            iArr[i4 + 7] = sArr[f94b[i4 + 7]];
            if (iArr[i4 + 1] != 0 || iArr[i4 + 2] != 0 || iArr[i4 + 3] != 0 || iArr[i4 + 4] != 0 || iArr[i4 + 5] != 0 || iArr[i4 + 6] != 0 || iArr[i4 + 7] != 0) {
                int i5 = i4 + 1;
                iArr[i5] = iArr[i5] * this.f109c[this.f126k[i]][i4 + 1];
                int i6 = i4 + 2;
                iArr[i6] = iArr[i6] * this.f109c[this.f126k[i]][i4 + 2];
                int i7 = i4 + 3;
                iArr[i7] = iArr[i7] * this.f109c[this.f126k[i]][i4 + 3];
                int i8 = i4 + 4;
                iArr[i8] = iArr[i8] * this.f109c[this.f126k[i]][i4 + 4];
                int i9 = i4 + 5;
                iArr[i9] = iArr[i9] * this.f109c[this.f126k[i]][i4 + 5];
                int i10 = i4 + 6;
                iArr[i10] = iArr[i10] * this.f109c[this.f126k[i]][i4 + 6];
                int i11 = i4 + 7;
                iArr[i11] = iArr[i11] * this.f109c[this.f126k[i]][i4 + 7];
                int i12 = iArr[i4 + 1] + iArr[i4 + 7];
                int i13 = iArr[i4 + 3] + iArr[i4 + 5];
                int i14 = iArr[i4 + 1] - iArr[i4 + 7];
                iArr[i4 + 1] = iArr[i4 + 4];
                iArr[i4 + 4] = iArr[i4 + 5] - iArr[i4 + 3];
                iArr[i4 + 3] = iArr[i4 + 2] + iArr[i4 + 6];
                iArr[i4 + 2] = iArr[i4 + 2] - iArr[i4 + 6];
                iArr[i4 + 5] = i12 - i13;
                iArr[i4 + 6] = i14;
                iArr[i4 + 7] = i12 + i13;
            }
        }
        for (int i15 = 0; i15 < 8; i15++) {
            if (iArr[i15 + 8] != 0 || iArr[i15 + 16] != 0 || iArr[i15 + 24] != 0 || iArr[i15 + 32] != 0 || iArr[i15 + 40] != 0 || iArr[i15 + 48] != 0 || iArr[i15 + 56] != 0) {
                int i16 = iArr[i15 + 8] + iArr[i15 + 56];
                int i17 = iArr[i15 + 24] + iArr[i15 + 40];
                int i18 = iArr[i15 + 8] - iArr[i15 + 56];
                iArr[i15 + 8] = iArr[i15 + 32];
                iArr[i15 + 32] = iArr[i15 + 40] - iArr[i15 + 24];
                iArr[i15 + 24] = iArr[i15 + 16] + iArr[i15 + 48];
                iArr[i15 + 16] = iArr[i15 + 16] - iArr[i15 + 48];
                iArr[i15 + 40] = i16 - i17;
                iArr[i15 + 48] = i18;
                iArr[i15 + 56] = i16 + i17;
            }
        }
        int c = m48c(iArr[4] + iArr[6], 1567);
        iArr[2] = m48c(iArr[2], 2896);
        iArr[4] = (-m48c(iArr[4], 2217)) - c;
        iArr[5] = m48c(iArr[5], 2896);
        iArr[6] = m48c(iArr[6], 5352) - c;
        int c2 = m48c(iArr[12] + iArr[14], 1567);
        iArr[10] = m48c(iArr[10], 2896);
        iArr[12] = (-m48c(iArr[12], 2217)) - c2;
        iArr[13] = m48c(iArr[13], 2896);
        iArr[14] = m48c(iArr[14], 5352) - c2;
        int c3 = m48c(iArr[28] + iArr[30], 1567);
        iArr[26] = m48c(iArr[26], 2896);
        iArr[28] = (-m48c(iArr[28], 2217)) - c3;
        iArr[29] = m48c(iArr[29], 2896);
        iArr[30] = m48c(iArr[30], 5352) - c3;
        int c4 = m48c(iArr[60] + iArr[62], 1567);
        iArr[58] = m48c(iArr[58], 2896);
        iArr[60] = (-m48c(iArr[60], 2217)) - c4;
        iArr[61] = m48c(iArr[61], 2896);
        iArr[62] = m48c(iArr[62], 5352) - c4;
        int c5 = m48c(iArr[20] + iArr[22], 2217);
        iArr[16] = m48c(iArr[16], 2896);
        iArr[17] = m48c(iArr[17], 2896);
        iArr[18] = iArr[18] << 1;
        iArr[19] = m48c(iArr[19], 2896);
        iArr[20] = (-m48c(iArr[20], 3135)) - c5;
        iArr[21] = iArr[21] << 1;
        iArr[22] = m48c(iArr[22], 7568) - c5;
        iArr[23] = m48c(iArr[23], 2896);
        int c6 = m48c(iArr[44] + iArr[46], 2217);
        iArr[40] = m48c(iArr[40], 2896);
        iArr[41] = m48c(iArr[41], 2896);
        iArr[42] = iArr[42] << 1;
        iArr[43] = m48c(iArr[43], 2896);
        iArr[44] = (-m48c(iArr[44], 3135)) - c6;
        iArr[45] = iArr[45] << 1;
        iArr[46] = m48c(iArr[46], 7568) - c6;
        iArr[47] = m48c(iArr[47], 2896);
        int i19 = iArr[32];
        iArr[32] = (-m48c(i19, 3784)) - m48c(iArr[48], 1567);
        iArr[48] = (-m48c(i19, 1567)) + m48c(iArr[48], 3784);
        if (iArr[33] == 0 && iArr[34] == 0 && iArr[35] == 0 && iArr[36] == 0 && iArr[37] == 0 && iArr[38] == 0 && iArr[39] == 0) {
            iArr[33] = -m48c(iArr[49], 1567);
            iArr[49] = m48c(iArr[49], 3784);
            iArr[34] = -m48c(iArr[50], 2217);
            iArr[50] = m48c(iArr[50], 5352);
            iArr[35] = -m48c(iArr[51], 1567);
            iArr[51] = m48c(iArr[51], 3784);
            iArr[37] = -m48c(iArr[53], 2217);
            iArr[53] = m48c(iArr[53], 5352);
            iArr[39] = -m48c(iArr[55], 1567);
            iArr[55] = m48c(iArr[55], 3784);
            int c7 = m48c((-iArr[54]) + iArr[52], 2896);
            int c8 = m48c((-iArr[54]) - iArr[52], 2896);
            int i20 = iArr[54] << 1;
            int i21 = (-iArr[52]) << 1;
            iArr[36] = c7 + i20;
            iArr[38] = c8 - i21;
            iArr[52] = c8 + i21;
            iArr[54] = (-c7) + i20;
        } else {
            int i22 = iArr[33];
            iArr[33] = (-m48c(i22, 3784)) - m48c(iArr[49], 1567);
            iArr[49] = (-m48c(i22, 1567)) + m48c(iArr[49], 3784);
            int i23 = iArr[34];
            iArr[34] = (-m48c(i23, 5352)) - m48c(iArr[50], 2217);
            iArr[50] = (-m48c(i23, 2217)) + m48c(iArr[50], 5352);
            int i24 = iArr[35];
            iArr[35] = (-m48c(i24, 3784)) - m48c(iArr[51], 1567);
            iArr[51] = (-m48c(i24, 1567)) + m48c(iArr[51], 3784);
            int i25 = iArr[37];
            iArr[37] = (-m48c(i25, 5352)) - m48c(iArr[53], 2217);
            iArr[53] = (-m48c(i25, 2217)) + m48c(iArr[53], 5352);
            int i26 = iArr[39];
            iArr[39] = (-m48c(i26, 3784)) - m48c(iArr[55], 1567);
            iArr[55] = (-m48c(i26, 1567)) + m48c(iArr[55], 3784);
            int i27 = iArr[36] - iArr[54];
            int i28 = iArr[38] + iArr[52];
            int c9 = m48c(i27 + i28, 2896);
            int c10 = m48c(i27 - i28, 2896);
            int i29 = (iArr[36] + iArr[54]) << 1;
            int i30 = (iArr[38] - iArr[52]) << 1;
            iArr[36] = c9 + i29;
            iArr[38] = c10 - i30;
            iArr[52] = c10 + i30;
            iArr[54] = i29 + (-c9);
        }
        for (int i31 = 0; i31 < 64; i31 += 8) {
            int i32 = iArr[i31 + 7];
            int i33 = iArr[i31 + 6] - iArr[i31 + 7];
            int i34 = i33 - iArr[i31 + 5];
            int i35 = iArr[i31 + 0] - iArr[i31 + 1];
            int i36 = iArr[i31 + 2] - iArr[i31 + 3];
            int i37 = i35 + i36;
            int i38 = i35 - i36;
            int i39 = iArr[i31 + 0] + iArr[i31 + 1];
            int i40 = iArr[i31 + 3] + i39;
            int i41 = i39 - iArr[i31 + 3];
            int i42 = iArr[i31 + 4] - i34;
            iArr[i31 + 0] = i40 + i32;
            iArr[i31 + 1] = i37 + i33;
            iArr[i31 + 2] = i38 - i34;
            iArr[i31 + 3] = i41 - i42;
            iArr[i31 + 4] = i41 + i42;
            iArr[i31 + 5] = i34 + i38;
            iArr[i31 + 6] = i37 - i33;
            iArr[i31 + 7] = i40 - i32;
        }
        for (int i43 = 0; i43 < 8; i43++) {
            int i44 = iArr[i43 + 56];
            int i45 = iArr[i43 + 48] - iArr[i43 + 56];
            int i46 = i45 - iArr[i43 + 40];
            int i47 = iArr[i43 + 0] - iArr[i43 + 8];
            int i48 = iArr[i43 + 16] - iArr[i43 + 24];
            int i49 = i47 + i48;
            int i50 = i47 - i48;
            int i51 = iArr[i43 + 0] + iArr[i43 + 8];
            int i52 = iArr[i43 + 24] + i51;
            int i53 = i51 - iArr[i43 + 24];
            int i54 = iArr[i43 + 32] - i46;
            iArr[i43 + 0] = i52 + i44;
            iArr[i43 + 8] = i49 + i45;
            iArr[i43 + 16] = i50 - i46;
            iArr[i43 + 24] = i53 - i54;
            iArr[i43 + 32] = i53 + i54;
            iArr[i43 + 40] = i46 + i50;
            iArr[i43 + 48] = i49 - i45;
            iArr[i43 + 56] = i52 - i44;
        }
        for (int i55 = 0; i55 < 64; i55 += 8) {
            bArr[i2] = (byte) f93a[(iArr[i55] >> 11) + 128 + 256];
            bArr[i2 + 1] = (byte) f93a[(iArr[i55 + 1] >> 11) + 128 + 256];
            bArr[i2 + 2] = (byte) f93a[(iArr[i55 + 2] >> 11) + 128 + 256];
            bArr[i2 + 3] = (byte) f93a[(iArr[i55 + 3] >> 11) + 128 + 256];
            bArr[i2 + 4] = (byte) f93a[(iArr[i55 + 4] >> 11) + 128 + 256];
            bArr[i2 + 5] = (byte) f93a[(iArr[i55 + 5] >> 11) + 128 + 256];
            bArr[i2 + 6] = (byte) f93a[(iArr[i55 + 6] >> 11) + 128 + 256];
            bArr[i2 + 7] = (byte) f93a[(iArr[i55 + 7] >> 11) + 128 + 256];
            i2 += i3;
        }
    }

    /* renamed from: b */
    private int m43b() {
        int i;
        if (this.f115f < 4) {
            return -2;
        }
        int i2 = ((this.f99a[this.f113e + 2] & 255) << 8) | (this.f99a[this.f113e + 3] & 255);
        if (this.f115f < i2 + 2) {
            return -2;
        }
        int i3 = i2 - 2;
        this.f113e += 4;
        this.f115f -= 4;
        while (i3 > 0) {
            if (i3 < 17 || (i = this.f99a[this.f113e] & 15) >= 4 || (this.f99a[this.f113e] & 224) != 0) {
                return -1;
            }
            int i4 = i | ((this.f99a[this.f113e] & 16) >> 2);
            this.f113e++;
            this.f115f--;
            int i5 = i3 - 1;
            int i6 = 0;
            short[] sArr = new short[16];
            int i7 = 0;
            for (int i8 = 0; i8 < 16; i8++) {
                sArr[i8] = (short) (this.f99a[this.f113e + i8] & 255);
                i7 += sArr[i8];
            }
            int[] iArr = new int[(i7 + 1)];
            int[] iArr2 = new int[i7];
            for (int i9 = 0; i9 < 16; i9++) {
                int i10 = 1;
                while (i10 <= sArr[i9]) {
                    iArr[i6] = i9 + 1;
                    i10++;
                    i6++;
                }
            }
            iArr[i6] = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = iArr[0];
            while (iArr[i11] != 0) {
                while (iArr[i11] == i13) {
                    iArr2[i11] = i12;
                    i12++;
                    i11++;
                }
                if (iArr[i11] != 0) {
                    while (iArr[i11] != i13) {
                        i12 <<= 1;
                        i13++;
                    }
                }
            }
            this.f106b[i4] = new int[16];
            this.f102a[i4] = new int[16];
            this.f103a[i4] = new short[16];
            int i14 = 0;
            for (int i15 = 0; i15 < 16; i15++) {
                if (sArr[i15] == 0) {
                    this.f102a[i4][i15] = -1;
                } else {
                    this.f103a[i4][i15] = (short) i14;
                    this.f106b[i4][i15] = iArr2[i14];
                    int i16 = i14 + (sArr[i15] - 1);
                    this.f102a[i4][i15] = iArr2[i16];
                    i14 = i16 + 1;
                }
            }
            this.f113e += 16;
            this.f115f -= 16;
            int i17 = i5 - 16;
            if (i17 < i6) {
                return -1;
            }
            this.f105b[i4] = new byte[i6];
            for (int i18 = 0; i18 < i6; i18++) {
                this.f105b[i4][i18] = this.f99a[this.f113e + i18];
            }
            this.f113e += i6;
            this.f115f -= i6;
            int i19 = i17 - i6;
            this.f108c[i4] = new byte[512];
            for (int i20 = 0; i20 < 256; i20++) {
                this.f108c[i4][i20] = 9;
            }
            int i21 = 0;
            for (int i22 = 1; i22 <= 8; i22++) {
                for (int i23 = 0; i23 < sArr[i22 - 1]; i23++) {
                    int i24 = iArr2[i21] << (8 - i22);
                    for (int i25 = 0; i25 < (1 << (8 - i22)); i25++) {
                        this.f108c[i4][i24 | i25] = (byte) i22;
                        this.f108c[i4][(i24 | i25) + 256] = this.f105b[i4][i21];
                    }
                    i21++;
                }
            }
            i3 = i19;
        }
        return 0;
    }

    /* renamed from: b */
    private int m44b(int i) {
        if (this.f110d < 8) {
            m51e();
            if (this.f110d < 8) {
                return m45b(i, 1);
            }
        }
        int i2 = this.f107c >>> 24;
        byte b = this.f108c[i][i2];
        if (b > 8) {
            return m45b(i, 9);
        }
        this.f107c <<= b;
        this.f110d -= b;
        return this.f108c[i][i2 + 256] & 255;
    }

    /* renamed from: b */
    private int m45b(int i, int i2) {
        int i3 = i2 - 1;
        int a = m38a(i2);
        if (a < 0) {
            return a;
        }
        int i4 = a;
        while (i3 < 16 && i4 > this.f102a[i][i3]) {
            i3++;
            int a2 = m38a(1);
            if (a2 < 0) {
                return a2;
            }
            i4 = a2 | (i4 << 1);
        }
        if (i3 >= 16) {
            return -1;
        }
        return this.f105b[i][this.f103a[i][i3] + (i4 - this.f106b[i][i3])] & 255;
    }

    /* renamed from: b */
    private void m46b() {
        if (this.f130o == 1) {
            this.f135t = (((((this.f116f[this.f120h[this.f131p]] * this.f98a) + this.f127l) - 1) / this.f127l) + 7) / 8;
            this.f122i[this.f120h[this.f131p]] = 0;
            return;
        }
        this.f135t = 0;
        for (int i = 0; i < this.f130o; i++) {
            this.f135t += this.f114e[this.f120h[i]] * this.f116f[this.f120h[i]];
            this.f122i[this.f120h[i]] = 0;
        }
        this.f135t *= this.f128m / (this.f127l * 8);
    }

    /* renamed from: c */
    private int m47c() {
        int i;
        if (this.f115f < 4) {
            return -2;
        }
        int i2 = ((this.f99a[this.f113e + 2] & 255) << 8) | (this.f99a[this.f113e + 3] & 255);
        if (this.f115f < i2 + 2) {
            return -2;
        }
        this.f113e += 4;
        this.f115f -= 4;
        int i3 = i2 - 2;
        while (i3 > 0) {
            if (i3 < 65) {
                return -1;
            }
            if (!((this.f99a[this.f113e] & 240) == 0 || (this.f99a[this.f113e] & 240) == 16)) {
                return -1;
            }
            boolean z = (this.f99a[this.f113e] & 240) != 0;
            if (z && i3 < 129) {
                return -1;
            }
            int i4 = this.f99a[this.f113e] & 15;
            if (i4 >= 4) {
                return -1;
            }
            this.f113e++;
            this.f115f--;
            int i5 = i3 - 1;
            this.f109c[i4] = new int[64];
            if (z) {
                for (int i6 = 0; i6 < 64; i6++) {
                    int i7 = f94b[i6];
                    this.f109c[i4][i6] = ((this.f99a[(i7 * 2) + this.f113e + 1] & 255) | ((this.f99a[this.f113e + (i7 * 2)] & 255) << 8)) * f96c[i6];
                }
                this.f113e += 128;
                this.f115f -= 128;
                i = i5 - 128;
            } else {
                for (int i8 = 0; i8 < 64; i8++) {
                    this.f109c[i4][i8] = (this.f99a[f94b[i8] + this.f113e] & 255) * f96c[i8];
                }
                this.f113e += 64;
                this.f115f -= 64;
                i = i5 - 64;
            }
            i3 = i;
        }
        return 0;
    }

    /* renamed from: c */
    private static int m48c(int i, int i2) {
        return (i >> 8) * (i2 >> 3);
    }

    /* renamed from: c */
    private void m49c() {
        for (int i = 0; i < 3; i++) {
            this.f124j[i * 2] = 0;
            this.f124j[(i * 2) + 1] = 4;
        }
        m50d();
    }

    /* renamed from: d */
    private void m50d() {
        for (int i = 0; i < 3; i++) {
            this.f112d[i] = 0;
        }
        this.f107c = 0;
        this.f110d = 0;
    }

    /* renamed from: e */
    private void m51e() {
        while (this.f110d <= 24 && this.f115f > 0) {
            int i = this.f99a[this.f113e] & 255;
            if (i == 255) {
                if (this.f115f >= 2 && this.f99a[this.f113e + 1] == 0) {
                    this.f113e++;
                    this.f115f--;
                } else {
                    return;
                }
            }
            this.f113e++;
            this.f115f--;
            this.f107c = (i << (24 - this.f110d)) | this.f107c;
            this.f110d += 8;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 299
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:72)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:46)
        */
    /* renamed from: a */
    public final int mo27a(byte[] r12, int r13, int r14) {
        /*
        // Method dump skipped, instructions count: 1214
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0009j.mo27a(byte[], int, int):int");
    }
}
