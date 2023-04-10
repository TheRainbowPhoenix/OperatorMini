//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.DataInputStream;

public class d {
    private short[] J = new short[3];
    private int r;
    private int[] C = new int[3];
    private int[] e = new int[6];
    private int[] B = new int[3];
    private int J;
    public int Code;
    public int I;
    private int[] I;
    private static short[] Code;
    private static short[] I;
    private static short[] Z;
    private static int[] Z;
    private short[][] Code = new short[16][];
    private static int[] J;
    private byte[] Code;
    private int B;
    private int C;
    private int a;
    private int b;
    private int c;
    private int d;
    private int[] a = new int[3];
    private int e;
    private int f;
    private int[] f = new int[3];
    private int s;
    private int g;
    private int h;
    private int[] b = new int[3];
    private int i;
    private int[] c = new int[3];
    private int j;
    private int k;
    private int l;
    private int m;
    private int[] d = new int[3];
    private int n;
    private int o;
    private byte[][] Code = new byte[3][];
    private int p;
    int[] Code;
    private int q;
    int Z;
    private int[][] Code = new int[16][];
    private int[][] I = new int[16][];
    private byte[][] I = new byte[16][];
    private byte[][] Z = new byte[16][];
    private int[][] Z = new int[4][];
    private int t = -1;
    private int u;

    public final int Code(byte[] var1, int var2, int var3, int var4, boolean var5) {
        this.Code = var1;
        this.B = var2;
        this.C = var3;
        this.J = var4;
        int var6 = 0;

        label204:
        while(var6 == 0) {
            while(this.b > 0) {
                if (this.b >= this.C) {
                    this.b -= this.C;
                    return 0;
                }

                this.B += this.b;
                this.C -= this.b;
                this.b = 0;
            }

            switch(this.a) {
                case 0:
                    if (this.C < 2) {
                        return this.C;
                    }

                    this.B += 2;
                    this.C -= 2;
                    this.a = 1;
                    break;
                case 1:
                case 2:
                    if (this.C < 2) {
                        return this.C;
                    }

                    while(true) {
                        while(true) {
                            if (this.C < 2 || var6 != 0 || this.b != 0 || this.a != 1 && this.a != 2) {
                                continue label204;
                            }

                            if ((this.Code[this.B] & 255) != 255) {
                                ++this.B;
                                --this.C;
                            } else {
                                switch(this.Code[this.B + 1] & 255) {
                                    case 0:
                                    case 255:
                                        ++this.B;
                                        --this.C;
                                        break;
                                    case 192:
                                    case 193:
                                        if (this.C < 4) {
                                            return this.C;
                                        }

                                        this.c = (this.Code[this.B + 2] & 255) << 8 | this.Code[this.B + 3] & 255;
                                        if (this.C < 10) {
                                            return this.C;
                                        }

                                        this.B += 4;
                                        this.C -= 4;
                                        this.c -= 2;
                                        this.q = (this.Code[this.B + 3] & 255) << 8 | this.Code[this.B + 4] & 255;
                                        this.Z = (this.Code[this.B + 1] & 255) << 8 | this.Code[this.B + 2] & 255;
                                        if (var5) {
                                            this.a = 0;
                                            return this.q << 16 | this.Z;
                                        }

                                        this.Code = this.q >> this.J;
                                        this.I = this.Z >> this.J;
                                        this.Code = new int[this.Code * this.I];
                                        this.d = this.Code[this.B + 5] & 255;
                                        d var7 = this;

                                        for(var3 = 0; var3 < 3; ++var3) {
                                            var7.e[var3 << 1] = 0;
                                            var7.e[(var3 << 1) + 1] = 4;
                                        }

                                        var7.Z();
                                        this.B += 6;
                                        this.C -= 6;
                                        this.c -= 6;
                                        this.a = 3;
                                        break;
                                    case 196:
                                        var6 = this.I();
                                        break;
                                    case 217:
                                        this.B += 2;
                                        this.C -= 2;
                                        this.a = 6;
                                        break;
                                    case 218:
                                        if (this.C < 4) {
                                            return this.C;
                                        }

                                        this.c = (this.Code[this.B + 2] & 255) << 8 | this.Code[this.B + 3] & 255;
                                        if (this.C < this.c + 2) {
                                            return this.C;
                                        }

                                        this.i = this.Code[this.B + 4] & 255;
                                        this.B += 5;
                                        this.C -= 5;
                                        this.c -= 3;

                                        for(var2 = 0; var2 < this.i; ++var2) {
                                            var3 = this.Code[this.B] & 255;
                                            this.c[var2] = var2;

                                            for(var4 = 0; var4 < this.d; ++var4) {
                                                if (var3 == this.B[var4]) {
                                                    this.c[var2] = var4;
                                                    var4 = this.d;
                                                }
                                            }

                                            var3 = this.Code[this.B + 1] & 255;
                                            this.e[this.c[var2] << 1] = var3 >> 4;
                                            this.e[(this.c[var2] << 1) + 1] = 4 + (var3 & 15);
                                            this.B += 2;
                                            this.C -= 2;
                                            this.c -= 2;
                                        }

                                        this.Z();
                                        this.k = 0;
                                        this.j = 0;
                                        this.l = 0;
                                        this.p = 0;
                                        this.I();
                                        this.B += this.c;
                                        this.C -= this.c;
                                        this.a = 4;
                                        break;
                                    case 219:
                                        var6 = this.Z();
                                        break;
                                    case 221:
                                        if (this.C < 4) {
                                            return this.C;
                                        }

                                        this.b = (this.Code[this.B + 2] & 255) << 8 | this.Code[this.B + 3] & 255;
                                        if (this.C < 6) {
                                            return this.C;
                                        }

                                        this.m = (this.Code[this.B + 4] & 255) << 8 | this.Code[this.B + 5] & 255;
                                        this.l = 0;
                                        this.B += 6;
                                        this.C -= 6;
                                        this.b -= 4;
                                        break;
                                    default:
                                        if (this.C < 4) {
                                            return this.C;
                                        }

                                        this.b = (this.Code[this.B + 2] & 255) << 8 | this.Code[this.B + 3] & 255;
                                        this.B += 4;
                                        this.C -= 4;
                                        this.b -= 2;
                                }
                            }
                        }
                    }
                case 3:
                    if (this.C < this.d * 3) {
                        return this.C;
                    }

                    for(var2 = 0; var2 < this.d; ++var2) {
                        this.B[var2] = this.Code[this.B] & 255;
                        var4 = (var3 = this.Code[this.B + 1] & 255) & 15;
                        if ((var3 >>>= 4) > this.f) {
                            this.f = var3;
                        }

                        if (var4 > this.e) {
                            this.e = var4;
                        }

                        this.a[var2] = var3;
                        this.C[var2] = var4;
                        this.f[var2] = this.Code[this.B + 2] & 255;
                        this.B += 3;
                        this.C -= 3;
                        this.c -= 3;
                    }

                    if (this.c > 0) {
                        this.b = this.c;
                    }

                    var2 = 0;

                    while(var2 < this.d) {
                        this.b[var2] = ((this.q * this.a[var2] + this.f - 1) / this.f + 7) / 8;
                        if (this.J == 0) {
                            this.Code[var2] = new byte[64 * this.b[var2] * this.C[var2]];
                            ++var2;
                        } else {
                            this.Code[var2] = new byte[64 * this.C[var2] * this.a[var2]];
                            ++var2;
                        }
                    }

                    this.p = 0;
                    if (this.d > 1) {
                        this.g = (this.f << 3) * ((this.q + 8 * this.f - 1) / (this.f << 3));
                        this.h = (this.e << 3) * ((this.Z + 8 * this.e - 1) / (this.e << 3));
                    }

                    this.a = 2;
                    break;
                case 4:
                    var6 = this.Code();
                    break;
                case 5:
                    while(true) {
                        while(true) {
                            while(true) {
                                if (this.a != 5) {
                                    continue label204;
                                }

                                if (this.C < 2) {
                                    return this.C;
                                }

                                if ((this.Code[this.B] & 255) == 255 && this.Code[this.B + 1] != 0) {
                                    if ((this.Code[this.B + 1] & 255) >= 208 && (this.Code[this.B + 1] & 255) <= 215) {
                                        this.a = 4;
                                        this.B += 2;
                                        this.C -= 2;
                                    } else {
                                        this.a = 2;
                                    }
                                } else {
                                    ++this.B;
                                    --this.C;
                                }
                            }
                        }
                    }
                case 6:
                    return 0;
            }
        }

        if (var6 == -2) {
            return this.C;
        } else {
            return var6;
        }
    }

    private void J() {
        while(this.s <= 24 && this.C > 0) {
            int var1;
            if ((var1 = this.Code[this.B] & 255) == 255) {
                if (this.C < 2 || this.Code[this.B + 1] != 0) {
                    return;
                }

                ++this.B;
                --this.C;
            }

            ++this.B;
            --this.C;
            this.r |= var1 << 24 - this.s;
            this.s += 8;
        }

    }

    private void Code(boolean var1) {
        int var2;
        int var3 = (var2 = this.e << 3) * this.p;
        int[] var4 = new int[3];
        int[] var5 = new int[3];
        int[] var6 = new int[3];
        int[] var7 = new int[3];
        if (this.d == 3) {
            var4[0] = 0;
            var5[0] = (this.C[0] << 11) / this.e;
            var7[0] = (this.a[0] << 11) / this.f;
            var4[1] = 0;
            var5[1] = (this.C[1] << 11) / this.e;
            var7[1] = (this.a[1] << 11) / this.f;
            var4[2] = 0;
            var5[2] = (this.C[2] << 11) / this.e;
            var7[2] = (this.a[2] << 11) / this.f;
        }

        if (!var1) {
            this.u = this.q;
        } else {
            this.u = this.n == 0 ? this.q % (this.f << 3) : this.f << 3;
            if (this.u == 0) {
                this.u = this.f << 3;
            }
        }

        var7 = var1 ? this.I : this.Code;

        for(int var8 = 0; var8 < var2; ++var8) {
            if (var3 + var8 < this.Z && this.d == 3) {
                int var9 = (var3 + var8) * this.q;
                if (var1) {
                    var9 += ((this.b[0] + 1 & -2) << 3) - ((this.n / this.o + 1) * this.f << 3);
                    if (this.t == -1) {
                        this.t = var9;
                    }

                    var9 = var8 * this.f << 3;
                }

                int var10000 = var4[0] >> 11;
                int[] var10001;
                byte var10002;
                if (var1) {
                    var10001 = this.a;
                    var10002 = 0;
                } else {
                    var10001 = this.b;
                    var10002 = 0;
                }

                int var10 = var10000 * (var10001[var10002] << 3);
                var4[0] += var5[0];
                var6[0] = 0;
                var10000 = var4[1] >> 11;
                if (var1) {
                    var10001 = this.a;
                    var10002 = 1;
                } else {
                    var10001 = this.b;
                    var10002 = 1;
                }

                int var11 = var10000 * (var10001[var10002] << 3);
                var4[1] += var5[1];
                var6[1] = 0;
                var10000 = var4[2] >> 11;
                if (var1) {
                    var10001 = this.a;
                    var10002 = 2;
                } else {
                    var10001 = this.b;
                    var10002 = 2;
                }

                int var12 = var10000 * (var10001[var10002] << 3);
                var4[2] += var5[2];
                var6[2] = 0;
                if (this.a[0] == 2 && this.a[1] == 1 && this.a[2] == 1) {
                    int var13;
                    for(var13 = 0; var13 < this.u >> 1; ++var13) {
                        int var14 = this.Code[0][var10 + (var13 << 1)] & 255;
                        int var15 = this.Code[1][var11 + var13] & 255;
                        int var16 = this.Code[2][var12 + var13] & 255;
                        short var17 = I[var16];
                        short var18 = Z[var15];
                        var15 -= 128;
                        var16 -= 128;
                        var15 = var15 * 705 + var16 * 1463 + 1024 >> 11;
                        short var25 = Code[var14 + var17 + 256];
                        short var19 = Code[var14 - var15 + 256];
                        short var23 = Code[var14 + var18 + 256];
                        var7[var9++] = var25 << 16 | var19 << 8 | var23;
                        var14 = this.Code[0][var10 + (var13 << 1) + 1] & 255;
                        var25 = Code[var14 + var17 + 256];
                        short var24 = Code[var14 - var15 + 256];
                        var23 = Code[var14 + var18 + 256];
                        var7[var9++] = var25 << 16 | var24 << 8 | var23;
                    }

                    if ((this.q & 1) != 0 && this.n == 0) {
                        var13 = var1 ? 8 * this.f : this.q;
                        var10 = this.Code[0][var10 + var13 - 1] & 255;
                        var11 = this.Code[1][var11 + (var13 - 1 >> 1)] & 255;
                        var12 = this.Code[2][var12 + (var13 - 1 >> 1)] & 255;
                        short var22 = Code[var10 + Z[var11] + 256];
                        var11 -= 128;
                        var12 -= 128;
                        short var21 = Code[var10 - (var11 * 705 + var12 * 1463 + 1024 >> 11) + 256];
                        short var20 = Code[var10 + I[var12 + 128] + 256];
                        var7[var9] = var20 << 16 | var21 << 8 | var22;
                    }
                }
            }
        }

    }

    public d() {
        Code();
        this.a = 0;
        this.b = 0;
        this.d = 0;
        this.m = 0;

        for(int var1 = 0; var1 < 3; ++var1) {
            this.Code[var1] = null;
            this.Code[var1] = null;
            this.I[var1] = null;
            this.Code[var1] = null;
            this.I[var1] = null;
            this.Z[var1] = null;
        }

    }

    private void I() {
        int var1;
        if (this.i == 1) {
            var1 = this.c[this.j];
            this.n = ((this.a[var1] * this.q + this.f - 1) / this.f + 7) / 8;
            this.d[this.c[this.j]] = 0;
        } else {
            this.n = 0;

            for(var1 = 0; var1 < this.i; ++var1) {
                this.n += this.C[this.c[var1]] * this.a[this.c[var1]];
                this.d[this.c[var1]] = 0;
            }

            this.o = this.n;
            this.n *= this.g / (8 * this.f);
        }
    }

    private void Z() {
        for(int var1 = 0; var1 < 3; ++var1) {
            this.J[var1] = 0;
        }

        this.r = 0;
        this.s = 0;
    }

    private static synchronized void Code() {
        if (Code == null) {
            DataInputStream var0 = null;
            byte var10000 = 1;

            label200: {
                short var1;
                boolean var10001;
                int var2;
                try {
                    var0 = e.Code(var10000);
                    Code = new short[768];
                    I = new short[256];
                    Z = new short[256];
                    Z = new int[64];
                    J = new int[64];
                    var1 = 0;

                    for(var2 = 0; var2 < 768; ++var2) {
                        Code[var2] = var1 += var0.readShort();
                    }

                    var1 = 0;

                    for(var2 = 0; var2 < 256; ++var2) {
                        I[var2] = var1 += var0.readShort();
                    }

                    var1 = 0;

                    for(var2 = 0; var2 < 256; ++var2) {
                        Z[var2] = var1 += var0.readShort();
                    }

                    var1 = 0;
                    var2 = 0;

                    while(true) {
                        if (var2 >= 64) {
                            var1 = 0;
                            var2 = 0;
                            break;
                        }

                        Z[var2] = var1 += var0.readShort();
                        ++var2;
                    }
                } catch (Throwable var8) {
                    var10001 = false;
                    break label200;
                }

                while(true) {
                    label194: {
                        try {
                            if (var2 < 64) {
                                J[var2] = var1 += var0.readShort();
                                break label194;
                            }
                        } catch (Throwable var7) {
                            var10001 = false;
                            break;
                        }

                        e.Code(var0);
                        return;
                    }

                    ++var2;
                }
            }

            e.Code(var0);
        }

    }

    private int Z() {
        if (this.C < 4) {
            return -2;
        } else {
            int var1 = (this.Code[this.B + 2] & 255) << 8 | this.Code[this.B + 3] & 255;
            if (this.C < var1 + 2) {
                return -2;
            } else {
                this.B += 4;
                this.C -= 4;
                var1 -= 2;

                while(true) {
                    while(var1 > 0) {
                        int var10000 = this.Code[this.B] & 240;
                        int var2 = (var10000 | -var10000) >>> 31;
                        int var3 = this.Code[this.B] & 15;
                        ++this.B;
                        --this.C;
                        --var1;
                        this.Z[var3] = new int[64];
                        int var4;
                        if (var2 != 0) {
                            for(var2 = 0; var2 < 64; ++var2) {
                                var4 = Z[var2];
                                this.Z[var3][var2] = ((this.Code[this.B + (var4 << 1)] & 255) << 8 | this.Code[this.B + (var4 << 1) + 1] & 255) * J[var2];
                            }

                            this.B += 128;
                            this.C -= 128;
                            var1 -= 128;
                        } else {
                            for(var2 = 0; var2 < 64; ++var2) {
                                var4 = Z[var2];
                                this.Z[var3][var2] = (this.Code[this.B + var4] & 255) * J[var2];
                            }

                            this.B += 64;
                            this.C -= 64;
                            var1 -= 64;
                        }
                    }

                    return 0;
                }
            }
        }
    }

    private int I(int var1, int var2) {
        int var3 = var2 - 1;
        if ((var2 = this.Code(var2)) < 0) {
            return var2;
        } else {
            while(var3 < 16 && var2 > this.Code[var1][var3]) {
                ++var3;
                int var4;
                if ((var4 = this.Code(1)) < 0) {
                    return var4;
                }

                var2 = var2 << 1 | var4;
            }

            var2 = this.Code[var1][var3] + (var2 - this.I[var1][var3]);
            return this.I[var1][var2] & 255;
        }
    }

    private int I() {
        if (this.C < 4) {
            return -2;
        } else {
            int var1 = (this.Code[this.B + 2] & 255) << 8 | this.Code[this.B + 3] & 255;
            if (this.C < var1 + 2) {
                return -2;
            } else {
                var1 -= 2;
                this.B += 4;
                this.C -= 4;

                label126:
                while(var1 > 0) {
                    int var2 = this.Code[this.B] & 15 | (this.Code[this.B] & 16) >> 2;
                    ++this.B;
                    --this.C;
                    --var1;
                    int var3 = 0;
                    short[] var4 = new short[16];
                    int var5 = 0;

                    int var6;
                    for(var6 = 0; var6 < 16; ++var6) {
                        var4[var6] = (short)(this.Code[this.B + var6] & 255);
                        var5 += var4[var6];
                    }

                    int[] var11 = new int[var5 + 1];
                    int[] var10 = new int[var5];

                    int var7;
                    int var8;
                    for(var7 = 0; var7 < 16; ++var7) {
                        for(var8 = 1; var8 <= var4[var7]; ++var3) {
                            var11[var3] = var7 + 1;
                            ++var8;
                        }
                    }

                    var11[var3] = 0;
                    var7 = 0;
                    var8 = 0;
                    int var9 = var11[0];

                    while(true) {
                        do {
                            if (var11[var7] == 0) {
                                this.I[var2] = new int[16];
                                this.Code[var2] = new int[16];
                                this.Code[var2] = new short[16];
                                var6 = 0;
                                var7 = 0;

                                while(var7 < 16) {
                                    if (var4[var7] == 0) {
                                        this.Code[var2][var7] = -1;
                                        ++var7;
                                    } else {
                                        this.Code[var2][var7] = (short)var6;
                                        this.I[var2][var7] = var10[var6];
                                        var6 += var4[var7] - 1;
                                        this.Code[var2][var7] = var10[var6];
                                        ++var6;
                                        ++var7;
                                    }
                                }

                                this.B += 16;
                                this.C -= 16;
                                var1 -= 16;
                                this.I[var2] = new byte[var3];

                                for(var6 = 0; var6 < var3; ++var6) {
                                    this.I[var2][var6] = this.Code[this.B + var6];
                                }

                                this.B += var3;
                                this.C -= var3;
                                var1 -= var3;
                                this.Z[var2] = new byte[512];

                                for(var3 = 0; var3 < 256; ++var3) {
                                    this.Z[var2][var3] = 9;
                                }

                                var3 = 0;

                                for(var6 = 1; var6 <= 8; ++var6) {
                                    for(var7 = 0; var7 < var4[var6 - 1]; ++var7) {
                                        var8 = var10[var3] << 8 - var6;

                                        for(var9 = 0; var9 < 1 << 8 - var6; ++var9) {
                                            this.Z[var2][var8 | var9] = (byte)var6;
                                            this.Z[var2][256 + (var8 | var9)] = this.I[var2][var3];
                                        }

                                        ++var3;
                                    }
                                }
                                continue label126;
                            }

                            while(var11[var7] == var9) {
                                var10[var7] = var8++;
                                ++var7;
                            }
                        } while(var11[var7] == 0);

                        while(var11[var7] != var9) {
                            var8 <<= 1;
                            ++var9;
                        }
                    }
                }

                return 0;
            }
        }
    }

    private int Code() {
        short[] var1 = new short[64];
        if (this.J != 0 && this.I == null) {
            this.I = new int[this.e * this.f << 6];
        }

        do {
            int var2 = this.c[this.j];

            int var3;
            for(var3 = 0; var3 < 64; ++var3) {
                var1[var3] = 0;
            }

            short[] var13 = var1;
            d var4 = this;
            int var5 = this.C;
            int var6 = this.r;
            int var7 = this.s;
            int var8 = this.e[var2 << 1];
            int var10000;
            if ((var8 = this.I(var8)) < 0) {
                this.B -= var5 - this.C;
                this.C = var5;
                this.r = var6;
                this.s = var7;
                var10000 = var8;
            } else {
                int var9;
                if ((var9 = this.Code(var8)) < 0) {
                    this.B -= var5 - this.C;
                    this.C = var5;
                    this.r = var6;
                    this.s = var7;
                    var10000 = var9;
                } else {
                    label148: {
                        var8 = Code(var8, var9);
                        var1[0] = (short)(var8 + this.J[var2]);
                        var8 = this.e[(var2 << 1) + 1];
                        var9 = 1;

                        while(var9 < 64) {
                            int var10;
                            if ((var10 = var4.I(var8)) < 0) {
                                var4.B -= var5 - var4.C;
                                var4.C = var5;
                                var4.r = var6;
                                var4.s = var7;
                                var10000 = var10;
                                break label148;
                            }

                            int var11 = var10 & 15;
                            var10 >>= 4;
                            if (var11 == 0) {
                                if (var10 != 15) {
                                    break;
                                }

                                var9 += var10;
                                ++var9;
                            } else {
                                int var12;
                                if ((var12 = var4.Code(var11)) < 0) {
                                    var4.B -= var5 - var4.C;
                                    var4.C = var5;
                                    var4.r = var6;
                                    var4.s = var7;
                                    var10000 = var12;
                                    break label148;
                                }

                                if ((var9 += var10) >= 64) {
                                    var9 = 63;
                                }

                                var13[var9] = (short)Code(var11, var12);
                                ++var9;
                            }
                        }

                        var4.J[var2] = var13[0];
                        var10000 = 0;
                    }
                }
            }

            var3 = var10000;
            if (var10000 != 0) {
                return var3;
            }

            var3 = this.d[var2] / (this.C[var2] * this.a[var2]);
            int var14 = this.d[var2] % (this.C[var2] * this.a[var2]);
            if ((var3 = this.a[var2] * var3 + var14 % this.a[var2]) < this.b[var2]) {
                if (this.J == 0) {
                    var3 = var3 + (var14 / this.a[var2] * this.b[var2] << 3) << 3;
                    this.Code(var2, var1, this.Code[var2], var3, this.b[var2] << 3);
                } else {
                    var3 = var14 / this.a[var2] * (this.a[var2] << 6) + (var14 % this.a[var2] << 3);
                    this.Code(var2, var1, this.Code[var2], var3, this.a[var2] << 3);
                }
            }

            int var10002 = this.d[var2]++;
            --this.n;
            if (this.n % this.o == 0 && this.J != 0) {
                this.Code(true);
                d var15 = this;
                var14 = this.t % this.q;
                var5 = this.t / this.q;
                var14 >>= this.J;
                var14 += (var5 >>= this.J) * this.Code;
                var6 = 0;

                for(var7 = 0; var7 < var15.e << 3 >> var15.J && var7 + var5 < var15.I; ++var7) {
                    for(var8 = 0; var8 < var15.u >> var15.J; ++var8) {
                        var15.Code[var14 + var8] = var15.I[var6 + (var8 << var15.J)];
                    }

                    var14 += var15.Code;
                    var6 += var15.f << 3 << var15.J;
                }

                this.t = -1;
            }

            if (this.n == 0) {
                if (this.J == 0) {
                    this.Code(false);
                }

                ++this.p;
                if (this.i > 1 && this.p >= this.h / (8 * this.e) || this.i == 1 && this.p >= ((this.C[var2] * this.Z + this.e - 1) / this.e + 7) / 8) {
                    this.a = 2;
                    return 0;
                }

                this.I();
            }

            ++this.k;
            if (this.k >= this.C[var2] * this.a[var2] || this.i == 1) {
                this.k = 0;
                ++this.j;
                if (this.j >= this.i) {
                    this.j = 0;
                    ++this.l;
                }
            }
        } while(this.l != this.m || this.m <= 0);

        this.l = 0;
        this.Z();
        this.a = 5;
        return 0;
    }

    private int Code(int var1) {
        if (var1 == 0) {
            return 0;
        } else {
            if (this.s < var1) {
                this.J();
                if (this.s < var1) {
                    return -2;
                }
            }

            int var2 = this.r >>> 32 - var1;
            this.r <<= var1;
            this.s -= var1;
            return var2;
        }
    }

    private static int Code(int var0, int var1) {
        return var1 < 1 << var0 - 1 ? var1 + (-1 << var0) + 1 : var1;
    }

    private int I(int var1) {
        if (this.s < 8) {
            this.J();
            if (this.s < 8) {
                return this.I(var1, 1);
            }
        }

        int var2 = this.r >>> 24;
        byte var3;
        if ((var3 = this.Z[var1][var2]) <= 8) {
            this.r <<= var3;
            this.s -= var3;
            return this.Z[var1][var2 + 256] & 255;
        } else {
            return this.I(var1, 9);
        }
    }

    private void Code(int var1, short[] var2, byte[] var3, int var4, int var5) {
        int[] var6 = new int[64];
        int var7 = 0;

        while(true) {
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            int var14;
            while(var7 < 8) {
                if (var2[Z[var7 + 8]] == 0 && var2[Z[var7 + 16]] == 0 && var2[Z[var7 + 24]] == 0 && var2[Z[var7 + 32]] == 0 && var2[Z[var7 + 40]] == 0 && var2[Z[var7 + 48]] == 0 && var2[Z[var7 + 56]] == 0) {
                    var8 = var2[Z[var7]] * this.Z[this.f[var1]][var7];
                    var6[var7] = var8;
                    var6[var7 + 8] = var8;
                    var6[var7 + 16] = var8;
                    var6[var7 + 24] = var8;
                    var6[var7 + 32] = var8;
                    var6[var7 + 40] = var8;
                    var6[var7 + 48] = var8;
                    var6[var7 + 56] = var8;
                    ++var7;
                } else {
                    var6[var7] = var2[Z[var7]] * this.Z[this.f[var1]][var7];
                    var6[var7 + 8] = var2[Z[var7 + 8]] * this.Z[this.f[var1]][var7 + 8];
                    var6[var7 + 16] = var2[Z[var7 + 16]] * this.Z[this.f[var1]][var7 + 16];
                    var6[var7 + 24] = var2[Z[var7 + 24]] * this.Z[this.f[var1]][var7 + 24];
                    var6[var7 + 32] = var2[Z[var7 + 32]] * this.Z[this.f[var1]][var7 + 32];
                    var6[var7 + 40] = var2[Z[var7 + 40]] * this.Z[this.f[var1]][var7 + 40];
                    var6[var7 + 48] = var2[Z[var7 + 48]] * this.Z[this.f[var1]][var7 + 48];
                    var6[var7 + 56] = var2[Z[var7 + 56]] * this.Z[this.f[var1]][var7 + 56];
                    var8 = var6[var7];
                    var9 = var6[var7 + 32];
                    var10 = var6[var7 + 16] - var6[var7 + 48];
                    var11 = var6[var7 + 16] + var6[var7 + 48];
                    var12 = var8 - var9;
                    var10 = (var10 >> 8) * 362 - var11;
                    var13 = var12 - var10;
                    var10 += var12;
                    var9 = (var8 += var9) - var11;
                    var8 += var11;
                    var11 = var6[var7 + 40] - var6[var7 + 24];
                    var12 = var6[var7 + 8] + var6[var7 + 56];
                    var14 = var6[var7 + 24] + var6[var7 + 40];
                    int var15 = var12 + var14;
                    var12 = (var12 - var14 >> 8) * 362;
                    var14 = var6[var7 + 8] - var6[var7 + 56];
                    int var16 = (var11 + var14 >> 8) * 196;
                    var11 = (-var11 >> 8) * 277 - var16;
                    var12 = (var14 = (var14 >> 8) * 669 - var16 - var15) - var12;
                    var11 -= var12;
                    var6[var7] = var8 + var15;
                    var6[var7 + 8] = var10 + var14;
                    var6[var7 + 16] = var13 - var12;
                    var6[var7 + 24] = var9 - var11;
                    var6[var7 + 32] = var9 + var11;
                    var6[var7 + 40] = var13 + var12;
                    var6[var7 + 48] = var10 - var14;
                    var6[var7 + 56] = var8 - var15;
                    ++var7;
                }
            }

            for(var1 = 0; var1 < 64; var1 += 8) {
                if (var6[var1 + 1] == 0 && var6[var1 + 2] == 0 && var6[var1 + 3] == 0 && var6[var1 + 4] == 0 && var6[var1 + 5] == 0 && var6[var1 + 6] == 0 && var6[var1 + 7] == 0) {
                    byte var18 = (byte)Code[(var6[var1] + 1024 >> 11) + 128 + 256];
                    var3[var4] = var18;
                    var3[var4 + 1] = var18;
                    var3[var4 + 2] = var18;
                    var3[var4 + 3] = var18;
                    var3[var4 + 4] = var18;
                    var3[var4 + 5] = var18;
                    var3[var4 + 6] = var18;
                    var3[var4 + 7] = var18;
                } else {
                    int var17 = var6[var1];
                    var7 = var6[var1 + 4];
                    var8 = var6[var1 + 2] - var6[var1 + 6];
                    var9 = var6[var1 + 2] + var6[var1 + 6];
                    var10 = var17 - var7;
                    var8 = (var8 >> 8) * 362 - var9;
                    var11 = var10 - var8;
                    var8 += var10;
                    var7 = (var17 += var7) - var9;
                    var17 += var9;
                    var9 = var6[var1 + 5] - var6[var1 + 3];
                    var10 = var6[var1 + 1] + var6[var1 + 7];
                    var12 = var6[var1 + 3] + var6[var1 + 5];
                    var13 = var10 + var12;
                    var10 = (var10 - var12 >> 8) * 362;
                    var12 = var6[var1 + 1] - var6[var1 + 7];
                    var14 = (var9 + var12 >> 8) * 196;
                    var9 = (-var9 >> 8) * 277 - var14;
                    var10 = (var12 = (var12 >> 8) * 669 - var14 - var13) - var10;
                    var9 -= var10;
                    var3[var4] = (byte)Code[(var17 + var13 + 1024 >> 11) + 128 + 256];
                    var3[var4 + 1] = (byte)Code[(var8 + var12 + 1024 >> 11) + 128 + 256];
                    var3[var4 + 2] = (byte)Code[(var11 - var10 + 1024 >> 11) + 128 + 256];
                    var3[var4 + 3] = (byte)Code[(var7 - var9 + 1024 >> 11) + 128 + 256];
                    var3[var4 + 4] = (byte)Code[(var7 + var9 + 1024 >> 11) + 128 + 256];
                    var3[var4 + 5] = (byte)Code[(var11 + var10 + 1024 >> 11) + 128 + 256];
                    var3[var4 + 6] = (byte)Code[(var8 - var12 + 1024 >> 11) + 128 + 256];
                    var3[var4 + 7] = (byte)Code[(var17 - var13 + 1024 >> 11) + 128 + 256];
                }

                var4 += var5;
            }

            return;
        }
    }
}
