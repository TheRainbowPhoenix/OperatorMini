package defpackage;

/* renamed from: d  reason: default package */
public class d {
    private static short[] Code;
    private static short[] I;
    private static int[] J;
    private static int[] Z;

    /* renamed from: Z  reason: collision with other field name */
    private static short[] f202Z;
    private int B;

    /* renamed from: B  reason: collision with other field name */
    private int[] f203B = new int[3];
    private int C;

    /* renamed from: C  reason: collision with other field name */
    private int[] f204C = new int[3];

    /* renamed from: Code  reason: collision with other field name */
    public int f205Code;

    /* renamed from: Code  reason: collision with other field name */
    private byte[] f206Code;

    /* renamed from: Code  reason: collision with other field name */
    int[] f207Code;

    /* renamed from: Code  reason: collision with other field name */
    private byte[][] f208Code = new byte[3][];

    /* renamed from: Code  reason: collision with other field name */
    private int[][] f209Code = new int[16][];

    /* renamed from: Code  reason: collision with other field name */
    private short[][] f210Code = new short[16][];

    /* renamed from: I  reason: collision with other field name */
    public int f211I;

    /* renamed from: I  reason: collision with other field name */
    private int[] f212I;

    /* renamed from: I  reason: collision with other field name */
    private byte[][] f213I = new byte[16][];

    /* renamed from: I  reason: collision with other field name */
    private int[][] f214I = new int[16][];

    /* renamed from: J  reason: collision with other field name */
    private int f215J;

    /* renamed from: J  reason: collision with other field name */
    private short[] f216J = new short[3];

    /* renamed from: Z  reason: collision with other field name */
    int f217Z;

    /* renamed from: Z  reason: collision with other field name */
    private byte[][] f218Z = new byte[16][];

    /* renamed from: Z  reason: collision with other field name */
    private int[][] f219Z = new int[4][];
    private int a;

    /* renamed from: a  reason: collision with other field name */
    private int[] f220a = new int[3];
    private int b;

    /* renamed from: b  reason: collision with other field name */
    private int[] f221b = new int[3];
    private int c;

    /* renamed from: c  reason: collision with other field name */
    private int[] f222c = new int[3];
    private int d;

    /* renamed from: d  reason: collision with other field name */
    private int[] f223d = new int[3];
    private int e;

    /* renamed from: e  reason: collision with other field name */
    private int[] f224e = new int[6];
    private int f;

    /* renamed from: f  reason: collision with other field name */
    private int[] f225f = new int[3];
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t = -1;
    private int u;

    public d() {
        m111Code();
        this.a = 0;
        this.b = 0;
        this.d = 0;
        this.m = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            this.f208Code[i2] = null;
            this.f209Code[i2] = null;
            this.f214I[i2] = null;
            this.f210Code[i2] = null;
            this.f213I[i2] = null;
            this.f218Z[i2] = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        r14.f216J[r1] = r2[0];
        r0 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int Code() {
        /*
        // Method dump skipped, instructions count: 566
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.Code():int");
    }

    private int Code(int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.s < i2) {
            J();
            if (this.s < i2) {
                return -2;
            }
        }
        int i3 = this.r >>> (32 - i2);
        this.r <<= i2;
        this.s -= i2;
        return i3;
    }

    private static int Code(int i2, int i3) {
        return i3 < (1 << (i2 + -1)) ? (-1 << i2) + i3 + 1 : i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v3, types: [short] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: Code  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void m111Code() {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.m111Code():void");
    }

    private void Code(int i2, short[] sArr, byte[] bArr, int i3, int i4) {
        int[] iArr = new int[64];
        int i5 = 0;
        while (i5 < 8) {
            if (sArr[Z[i5 + 8]] == 0 && sArr[Z[i5 + 16]] == 0 && sArr[Z[i5 + 24]] == 0 && sArr[Z[i5 + 32]] == 0 && sArr[Z[i5 + 40]] == 0 && sArr[Z[i5 + 48]] == 0 && sArr[Z[i5 + 56]] == 0) {
                int i6 = sArr[Z[i5]] * this.f219Z[this.f225f[i2]][i5];
                iArr[i5] = i6;
                iArr[i5 + 8] = i6;
                iArr[i5 + 16] = i6;
                iArr[i5 + 24] = i6;
                iArr[i5 + 32] = i6;
                iArr[i5 + 40] = i6;
                iArr[i5 + 48] = i6;
                iArr[i5 + 56] = i6;
                i5++;
            } else {
                iArr[i5] = sArr[Z[i5]] * this.f219Z[this.f225f[i2]][i5];
                iArr[i5 + 8] = sArr[Z[i5 + 8]] * this.f219Z[this.f225f[i2]][i5 + 8];
                iArr[i5 + 16] = sArr[Z[i5 + 16]] * this.f219Z[this.f225f[i2]][i5 + 16];
                iArr[i5 + 24] = sArr[Z[i5 + 24]] * this.f219Z[this.f225f[i2]][i5 + 24];
                iArr[i5 + 32] = sArr[Z[i5 + 32]] * this.f219Z[this.f225f[i2]][i5 + 32];
                iArr[i5 + 40] = sArr[Z[i5 + 40]] * this.f219Z[this.f225f[i2]][i5 + 40];
                iArr[i5 + 48] = sArr[Z[i5 + 48]] * this.f219Z[this.f225f[i2]][i5 + 48];
                iArr[i5 + 56] = sArr[Z[i5 + 56]] * this.f219Z[this.f225f[i2]][i5 + 56];
                int i7 = iArr[i5];
                int i8 = iArr[i5 + 32];
                int i9 = iArr[i5 + 16] - iArr[i5 + 48];
                int i10 = iArr[i5 + 16] + iArr[i5 + 48];
                int i11 = i7 - i8;
                int i12 = ((i9 >> 8) * 362) - i10;
                int i13 = i11 - i12;
                int i14 = i12 + i11;
                int i15 = i7 + i8;
                int i16 = i15 - i10;
                int i17 = i15 + i10;
                int i18 = iArr[i5 + 40] - iArr[i5 + 24];
                int i19 = iArr[i5 + 8] + iArr[i5 + 56];
                int i20 = iArr[i5 + 24] + iArr[i5 + 40];
                int i21 = i19 + i20;
                int i22 = iArr[i5 + 8] - iArr[i5 + 56];
                int i23 = ((i18 + i22) >> 8) * 196;
                int i24 = (((i22 >> 8) * 669) - i23) - i21;
                int i25 = i24 - (((i19 - i20) >> 8) * 362);
                int i26 = ((((-i18) >> 8) * 277) - i23) - i25;
                iArr[i5] = i17 + i21;
                iArr[i5 + 8] = i14 + i24;
                iArr[i5 + 16] = i13 - i25;
                iArr[i5 + 24] = i16 - i26;
                iArr[i5 + 32] = i16 + i26;
                iArr[i5 + 40] = i13 + i25;
                iArr[i5 + 48] = i14 - i24;
                iArr[i5 + 56] = i17 - i21;
                i5++;
            }
        }
        for (int i27 = 0; i27 < 64; i27 += 8) {
            if (iArr[i27 + 1] == 0 && iArr[i27 + 2] == 0 && iArr[i27 + 3] == 0 && iArr[i27 + 4] == 0 && iArr[i27 + 5] == 0 && iArr[i27 + 6] == 0 && iArr[i27 + 7] == 0) {
                byte b2 = (byte) Code[((iArr[i27] + 1024) >> 11) + 128 + 256];
                bArr[i3] = b2;
                bArr[i3 + 1] = b2;
                bArr[i3 + 2] = b2;
                bArr[i3 + 3] = b2;
                bArr[i3 + 4] = b2;
                bArr[i3 + 5] = b2;
                bArr[i3 + 6] = b2;
                bArr[i3 + 7] = b2;
            } else {
                int i28 = iArr[i27];
                int i29 = iArr[i27 + 4];
                int i30 = iArr[i27 + 2] - iArr[i27 + 6];
                int i31 = iArr[i27 + 2] + iArr[i27 + 6];
                int i32 = i28 - i29;
                int i33 = ((i30 >> 8) * 362) - i31;
                int i34 = i32 - i33;
                int i35 = i33 + i32;
                int i36 = i28 + i29;
                int i37 = i36 - i31;
                int i38 = i36 + i31;
                int i39 = iArr[i27 + 5] - iArr[i27 + 3];
                int i40 = iArr[i27 + 1] + iArr[i27 + 7];
                int i41 = iArr[i27 + 3] + iArr[i27 + 5];
                int i42 = i40 + i41;
                int i43 = iArr[i27 + 1] - iArr[i27 + 7];
                int i44 = ((i39 + i43) >> 8) * 196;
                int i45 = (((i43 >> 8) * 669) - i44) - i42;
                int i46 = i45 - (((i40 - i41) >> 8) * 362);
                int i47 = ((((-i39) >> 8) * 277) - i44) - i46;
                bArr[i3] = (byte) Code[(((i38 + i42) + 1024) >> 11) + 128 + 256];
                bArr[i3 + 1] = (byte) Code[(((i35 + i45) + 1024) >> 11) + 128 + 256];
                bArr[i3 + 2] = (byte) Code[(((i34 - i46) + 1024) >> 11) + 128 + 256];
                bArr[i3 + 3] = (byte) Code[(((i37 - i47) + 1024) >> 11) + 128 + 256];
                bArr[i3 + 4] = (byte) Code[(((i37 + i47) + 1024) >> 11) + 128 + 256];
                bArr[i3 + 5] = (byte) Code[(((i46 + i34) + 1024) >> 11) + 128 + 256];
                bArr[i3 + 6] = (byte) Code[(((i35 - i45) + 1024) >> 11) + 128 + 256];
                bArr[i3 + 7] = (byte) Code[(((i38 - i42) + 1024) >> 11) + 128 + 256];
            }
            i3 += i4;
        }
    }

    private void Code(boolean z) {
        int[] iArr;
        char c2;
        int[] iArr2;
        char c3;
        int[] iArr3;
        char c4;
        int i2 = this.e << 3;
        int i3 = i2 * this.p;
        int[] iArr4 = new int[3];
        int[] iArr5 = new int[3];
        int[] iArr6 = new int[3];
        int[] iArr7 = new int[3];
        if (this.d == 3) {
            iArr4[0] = 0;
            iArr5[0] = (this.f204C[0] << 11) / this.e;
            iArr7[0] = (this.f220a[0] << 11) / this.f;
            iArr4[1] = 0;
            iArr5[1] = (this.f204C[1] << 11) / this.e;
            iArr7[1] = (this.f220a[1] << 11) / this.f;
            iArr4[2] = 0;
            iArr5[2] = (this.f204C[2] << 11) / this.e;
            iArr7[2] = (this.f220a[2] << 11) / this.f;
        }
        if (!z) {
            this.u = this.q;
        } else {
            this.u = this.n == 0 ? this.q % (this.f << 3) : this.f << 3;
            if (this.u == 0) {
                this.u = this.f << 3;
            }
        }
        int[] iArr8 = z ? this.f212I : this.f207Code;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i3 + i4 < this.f217Z && this.d == 3) {
                int i5 = (i3 + i4) * this.q;
                if (z) {
                    int i6 = i5 + ((((this.f221b[0] + 1) & -2) << 3) - ((((this.n / this.o) + 1) * this.f) << 3));
                    if (this.t == -1) {
                        this.t = i6;
                    }
                    i5 = (this.f * i4) << 3;
                }
                int i7 = iArr4[0] >> 11;
                if (z) {
                    iArr = this.f220a;
                    c2 = 0;
                } else {
                    iArr = this.f221b;
                    c2 = 0;
                }
                int i8 = i7 * (iArr[c2] << 3);
                iArr4[0] = iArr4[0] + iArr5[0];
                iArr6[0] = 0;
                int i9 = iArr4[1] >> 11;
                if (z) {
                    iArr2 = this.f220a;
                    c3 = 1;
                } else {
                    iArr2 = this.f221b;
                    c3 = 1;
                }
                int i10 = i9 * (iArr2[c3] << 3);
                iArr4[1] = iArr4[1] + iArr5[1];
                iArr6[1] = 0;
                int i11 = iArr4[2] >> 11;
                if (z) {
                    iArr3 = this.f220a;
                    c4 = 2;
                } else {
                    iArr3 = this.f221b;
                    c4 = 2;
                }
                int i12 = i11 * (iArr3[c4] << 3);
                iArr4[2] = iArr4[2] + iArr5[2];
                iArr6[2] = 0;
                if (this.f220a[0] == 2 && this.f220a[1] == 1 && this.f220a[2] == 1) {
                    int i13 = i5;
                    for (int i14 = 0; i14 < (this.u >> 1); i14++) {
                        int i15 = this.f208Code[0][(i14 << 1) + i8] & 255;
                        int i16 = this.f208Code[1][i10 + i14] & 255;
                        int i17 = this.f208Code[2][i12 + i14] & 255;
                        short s2 = I[i17];
                        short s3 = f202Z[i16];
                        int i18 = ((((i16 - 128) * 705) + ((i17 - 128) * 1463)) + 1024) >> 11;
                        int i19 = i13 + 1;
                        iArr8[i13] = Code[i15 + s3 + 256] | (Code[(i15 + s2) + 256] << 16) | (Code[(i15 - i18) + 256] << 8);
                        int i20 = this.f208Code[0][(i14 << 1) + i8 + 1] & 255;
                        i13 = i19 + 1;
                        iArr8[i19] = Code[i20 + s3 + 256] | (Code[(i20 - i18) + 256] << 8) | (Code[(i20 + s2) + 256] << 16);
                    }
                    if ((this.q & 1) != 0 && this.n == 0) {
                        int i21 = z ? this.f * 8 : this.q;
                        int i22 = this.f208Code[0][(i8 + i21) - 1] & 255;
                        int i23 = this.f208Code[1][i10 + ((i21 - 1) >> 1)] & 255;
                        short s4 = Code[f202Z[i23] + i22 + 256];
                        int i24 = (this.f208Code[2][((i21 - 1) >> 1) + i12] & 255) - 128;
                        iArr8[i13] = (Code[(I[i24 + 128] + i22) + 256] << 16) | (Code[(i22 - (((((i23 - 128) * 705) + (i24 * 1463)) + 1024) >> 11)) + 256] << 8) | s4;
                    }
                }
            }
        }
    }

    private int I() {
        if (this.C < 4) {
            return -2;
        }
        int i2 = ((this.f206Code[this.B + 2] & 255) << 8) | (this.f206Code[this.B + 3] & 255);
        if (this.C < i2 + 2) {
            return -2;
        }
        int i3 = i2 - 2;
        this.B += 4;
        this.C -= 4;
        while (i3 > 0) {
            int i4 = (this.f206Code[this.B] & 15) | ((this.f206Code[this.B] & 16) >> 2);
            this.B++;
            this.C--;
            int i5 = i3 - 1;
            short[] sArr = new short[16];
            int i6 = 0;
            for (int i7 = 0; i7 < 16; i7++) {
                sArr[i7] = this.f206Code[this.B + i7] & 255;
                i6 += sArr[i7];
            }
            int[] iArr = new int[(i6 + 1)];
            int[] iArr2 = new int[i6];
            int i8 = 0;
            for (int i9 = 0; i9 < 16; i9++) {
                int i10 = 1;
                while (i10 <= sArr[i9]) {
                    iArr[i8] = i9 + 1;
                    i10++;
                    i8++;
                }
            }
            iArr[i8] = 0;
            int i11 = iArr[0];
            int i12 = 0;
            int i13 = 0;
            while (iArr[i13] != 0) {
                while (iArr[i13] == i11) {
                    iArr2[i13] = i12;
                    i12++;
                    i13++;
                }
                if (iArr[i13] != 0) {
                    while (iArr[i13] != i11) {
                        i12 <<= 1;
                        i11++;
                    }
                }
            }
            this.f214I[i4] = new int[16];
            this.f209Code[i4] = new int[16];
            this.f210Code[i4] = new short[16];
            int i14 = 0;
            int i15 = 0;
            while (i14 < 16) {
                if (sArr[i14] == 0) {
                    this.f209Code[i4][i14] = -1;
                    i14++;
                } else {
                    this.f210Code[i4][i14] = (short) i15;
                    this.f214I[i4][i14] = iArr2[i15];
                    int i16 = i15 + (sArr[i14] - 1);
                    this.f209Code[i4][i14] = iArr2[i16];
                    i15 = i16 + 1;
                    i14++;
                }
            }
            this.B += 16;
            this.C -= 16;
            int i17 = i5 - 16;
            this.f213I[i4] = new byte[i8];
            for (int i18 = 0; i18 < i8; i18++) {
                this.f213I[i4][i18] = this.f206Code[this.B + i18];
            }
            this.B += i8;
            this.C -= i8;
            int i19 = i17 - i8;
            this.f218Z[i4] = new byte[512];
            for (int i20 = 0; i20 < 256; i20++) {
                this.f218Z[i4][i20] = 9;
            }
            int i21 = 0;
            for (int i22 = 1; i22 <= 8; i22++) {
                for (int i23 = 0; i23 < sArr[i22 - 1]; i23++) {
                    int i24 = iArr2[i21] << (8 - i22);
                    for (int i25 = 0; i25 < (1 << (8 - i22)); i25++) {
                        this.f218Z[i4][i24 | i25] = (byte) i22;
                        this.f218Z[i4][(i24 | i25) + 256] = this.f213I[i4][i21];
                    }
                    i21++;
                }
            }
            i3 = i19;
        }
        return 0;
    }

    private int I(int i2) {
        if (this.s < 8) {
            J();
            if (this.s < 8) {
                return I(i2, 1);
            }
        }
        int i3 = this.r >>> 24;
        byte b2 = this.f218Z[i2][i3];
        if (b2 > 8) {
            return I(i2, 9);
        }
        this.r <<= b2;
        this.s -= b2;
        return this.f218Z[i2][i3 + 256] & 255;
    }

    private int I(int i2, int i3) {
        int i4 = i3 - 1;
        int Code2 = Code(i3);
        if (Code2 < 0) {
            return Code2;
        }
        while (i4 < 16 && Code2 > this.f209Code[i2][i4]) {
            i4++;
            int Code3 = Code(1);
            if (Code3 < 0) {
                return Code3;
            }
            Code2 = Code3 | (Code2 << 1);
        }
        return this.f213I[i2][this.f210Code[i2][i4] + (Code2 - this.f214I[i2][i4])] & 255;
    }

    /* renamed from: I  reason: collision with other method in class */
    private void m112I() {
        if (this.i == 1) {
            this.n = (((((this.f220a[this.f222c[this.j]] * this.q) + this.f) - 1) / this.f) + 7) / 8;
            this.f223d[this.f222c[this.j]] = 0;
            return;
        }
        this.n = 0;
        for (int i2 = 0; i2 < this.i; i2++) {
            this.n += this.f204C[this.f222c[i2]] * this.f220a[this.f222c[i2]];
            this.f223d[this.f222c[i2]] = 0;
        }
        this.o = this.n;
        this.n *= this.g / (this.f * 8);
    }

    private void J() {
        while (this.s <= 24 && this.C > 0) {
            int i2 = this.f206Code[this.B] & 255;
            if (i2 == 255) {
                if (this.C >= 2 && this.f206Code[this.B + 1] == 0) {
                    this.B++;
                    this.C--;
                } else {
                    return;
                }
            }
            this.B++;
            this.C--;
            this.r = (i2 << (24 - this.s)) | this.r;
            this.s += 8;
        }
    }

    private int Z() {
        if (this.C < 4) {
            return -2;
        }
        int i2 = ((this.f206Code[this.B + 2] & 255) << 8) | (this.f206Code[this.B + 3] & 255);
        if (this.C < i2 + 2) {
            return -2;
        }
        this.B += 4;
        this.C -= 4;
        int i3 = i2 - 2;
        while (i3 > 0) {
            int i4 = this.f206Code[this.B] & 240;
            int i5 = (i4 | (-i4)) >>> 31;
            int i6 = this.f206Code[this.B] & 15;
            this.B++;
            this.C--;
            int i7 = i3 - 1;
            this.f219Z[i6] = new int[64];
            if (i5 != 0) {
                for (int i8 = 0; i8 < 64; i8++) {
                    int i9 = Z[i8];
                    this.f219Z[i6][i8] = ((this.f206Code[(i9 << 1) + this.B + 1] & 255) | ((this.f206Code[this.B + (i9 << 1)] & 255) << 8)) * J[i8];
                }
                this.B += 128;
                this.C -= 128;
                i3 = i7 - 128;
            } else {
                for (int i10 = 0; i10 < 64; i10++) {
                    this.f219Z[i6][i10] = (this.f206Code[Z[i10] + this.B] & 255) * J[i10];
                }
                this.B += 64;
                this.C -= 64;
                i3 = i7 - 64;
            }
        }
        return 0;
    }

    /* renamed from: Z  reason: collision with other method in class */
    private void m113Z() {
        for (int i2 = 0; i2 < 3; i2++) {
            this.f216J[i2] = 0;
        }
        this.r = 0;
        this.s = 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 265
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:72)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:46)
        */
    public final int Code(byte[] r7, int r8, int r9, int r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 1152
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.Code(byte[], int, int, int, boolean):int");
    }
}
