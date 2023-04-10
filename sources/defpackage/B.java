package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* access modifiers changed from: package-private */
/* renamed from: B  reason: default package */
public class B implements Runnable {
    private static int[] B;
    private static int[] C;
    static Vector Code;

    /* renamed from: Code  reason: collision with other field name */
    private static char[] f0Code = new char[512];

    /* renamed from: Code  reason: collision with other field name */
    static Object[] f1Code;

    /* renamed from: Code  reason: collision with other field name */
    static Image[] f2Code;
    static Image[] I;
    private static int[] a;
    private static int aK = -1;
    private static int aL = -1;
    private static final int az = ((Font.getFont(64, 1, 16).getHeight() << 1) + 2);
    static int c = -1;
    private static int k = 16;
    private int A;

    /* renamed from: B  reason: collision with other field name */
    int f3B = -1;

    /* renamed from: B  reason: collision with other field name */
    String f4B;

    /* renamed from: B  reason: collision with other field name */
    private Hashtable f5B = new Hashtable();

    /* renamed from: B  reason: collision with other field name */
    private Vector f6B;

    /* renamed from: B  reason: collision with other field name */
    boolean f7B;

    /* renamed from: C  reason: collision with other field name */
    int f8C = 0;

    /* renamed from: C  reason: collision with other field name */
    String f9C;

    /* renamed from: C  reason: collision with other field name */
    private Hashtable f10C;

    /* renamed from: C  reason: collision with other field name */
    private Vector f11C;

    /* renamed from: C  reason: collision with other field name */
    boolean f12C;

    /* renamed from: Code  reason: collision with other field name */
    private char f13Code;

    /* renamed from: Code  reason: collision with other field name */
    int f14Code = -1;

    /* renamed from: Code  reason: collision with other field name */
    long f15Code = System.currentTimeMillis();

    /* renamed from: Code  reason: collision with other field name */
    private J f16Code;

    /* renamed from: Code  reason: collision with other field name */
    private e f17Code;

    /* renamed from: Code  reason: collision with other field name */
    private g f18Code;

    /* renamed from: Code  reason: collision with other field name */
    private DataOutputStream f19Code;

    /* renamed from: Code  reason: collision with other field name */
    private Integer f20Code;

    /* renamed from: Code  reason: collision with other field name */
    String f21Code;

    /* renamed from: Code  reason: collision with other field name */
    Hashtable f22Code = new Hashtable();

    /* renamed from: Code  reason: collision with other field name */
    Image f23Code;

    /* renamed from: Code  reason: collision with other field name */
    boolean f24Code;

    /* renamed from: Code  reason: collision with other field name */
    byte[] f25Code;

    /* renamed from: Code  reason: collision with other field name */
    int[] f26Code = new int[6];

    /* renamed from: Code  reason: collision with other field name */
    private String[] f27Code = null;

    /* renamed from: Code  reason: collision with other field name */
    boolean[] f28Code;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;

    /* renamed from: I  reason: collision with other field name */
    int f29I = -1;

    /* renamed from: I  reason: collision with other field name */
    private J f30I;

    /* renamed from: I  reason: collision with other field name */
    private DataOutputStream f31I;

    /* renamed from: I  reason: collision with other field name */
    String f32I;

    /* renamed from: I  reason: collision with other field name */
    Hashtable f33I;

    /* renamed from: I  reason: collision with other field name */
    private Vector f34I;

    /* renamed from: I  reason: collision with other field name */
    boolean f35I;

    /* renamed from: I  reason: collision with other field name */
    byte[] f36I;

    /* renamed from: I  reason: collision with other field name */
    int[] f37I;

    /* renamed from: I  reason: collision with other field name */
    private Object[] f38I = new Object[11];

    /* renamed from: I  reason: collision with other field name */
    private String[] f39I;
    int J = -1;

    /* renamed from: J  reason: collision with other field name */
    String f40J;

    /* renamed from: J  reason: collision with other field name */
    private Hashtable f41J = new Hashtable();

    /* renamed from: J  reason: collision with other field name */
    private Vector f42J;

    /* renamed from: J  reason: collision with other field name */
    boolean f43J;

    /* renamed from: J  reason: collision with other field name */
    private int[] f44J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    int Z = -1;

    /* renamed from: Z  reason: collision with other field name */
    private J f45Z;

    /* renamed from: Z  reason: collision with other field name */
    private DataOutputStream f46Z;

    /* renamed from: Z  reason: collision with other field name */
    String f47Z;

    /* renamed from: Z  reason: collision with other field name */
    private Hashtable f48Z = new Hashtable();

    /* renamed from: Z  reason: collision with other field name */
    private Vector f49Z = new Vector();

    /* renamed from: Z  reason: collision with other field name */
    boolean f50Z;

    /* renamed from: Z  reason: collision with other field name */
    private int[] f51Z;

    /* renamed from: a  reason: collision with other field name */
    public int f52a = 1;

    /* renamed from: a  reason: collision with other field name */
    String f53a;

    /* renamed from: a  reason: collision with other field name */
    private Vector f54a = null;

    /* renamed from: a  reason: collision with other field name */
    public boolean f55a = false;
    private int aA;
    private int aB;
    private int aC;
    private int aD;
    private int aE;
    private int aF;
    private int aG;
    private int aH;
    private int aI;
    private int aJ;
    private int aM;
    private int aN;
    private int aO;
    private int aP = -1;
    private int aQ = -1;
    private int aR = -1;
    private int aS = -1;
    private int aT = -1;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af = -1;
    private int ag = 0;
    private int ah = 40;
    private int ai = 25;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private int aq = 0;
    private int ar;
    private int as;
    private int at;
    private int au;
    private int av = 0;
    private int aw = 0;
    private int ax;
    private int ay;
    int b;

    /* renamed from: b  reason: collision with other field name */
    private String f56b;

    /* renamed from: b  reason: collision with other field name */
    boolean f57b = true;

    /* renamed from: c  reason: collision with other field name */
    private String f58c;

    /* renamed from: c  reason: collision with other field name */
    boolean f59c;
    int d;

    /* renamed from: d  reason: collision with other field name */
    private String f60d;

    /* renamed from: d  reason: collision with other field name */
    boolean f61d;
    int e;

    /* renamed from: e  reason: collision with other field name */
    boolean f62e = false;
    int f;

    /* renamed from: f  reason: collision with other field name */
    boolean f63f;
    int g;

    /* renamed from: g  reason: collision with other field name */
    boolean f64g = false;
    int h;

    /* renamed from: h  reason: collision with other field name */
    private boolean f65h;
    private int i = -1;

    /* renamed from: i  reason: collision with other field name */
    private boolean f66i;
    private int j;

    /* renamed from: j  reason: collision with other field name */
    private boolean f67j;

    /* renamed from: k  reason: collision with other field name */
    private boolean f68k;
    private int l;

    /* renamed from: l  reason: collision with other field name */
    private boolean f69l;
    private int m;

    /* renamed from: m  reason: collision with other field name */
    private boolean f70m;
    private int n;

    /* renamed from: n  reason: collision with other field name */
    private boolean f71n;
    private int o;

    /* renamed from: o  reason: collision with other field name */
    private boolean f72o;
    private int p;

    /* renamed from: p  reason: collision with other field name */
    private boolean f73p;
    private int q;

    /* renamed from: q  reason: collision with other field name */
    private boolean f74q;
    private int r;

    /* renamed from: r  reason: collision with other field name */
    private boolean f75r;
    private int s;

    /* renamed from: s  reason: collision with other field name */
    private boolean f76s;
    private int t;

    /* renamed from: t  reason: collision with other field name */
    private boolean f77t = false;
    private int u;

    /* renamed from: u  reason: collision with other field name */
    private boolean f78u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    B(e eVar) {
        Code(eVar);
        this.r = 256;
        this.s = this.r;
        this.j = Code.e;
    }

    private void A() {
        this.f14Code = 9;
        String I2 = Code.m73Code(1).f367Code.m46I();
        Code(new StringBuffer().append(e.m122Code(63)).append(":").toString(), 1, Code.f98Code[44]);
        S();
        Code(I2, 0, Code.f98Code[44]);
    }

    private synchronized int B(int i2) {
        this.aC = i2;
        t();
        int t2 = t();
        int i3 = 0;
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        while (t2 > 0) {
            Y();
            int min = Math.min(i6, this.d);
            i5 = Math.min(i5, this.e);
            int max = Math.max(i4, this.d + this.f);
            i3 = Math.max(i3, this.e + this.g);
            t2--;
            i4 = max;
            i6 = min;
        }
        af();
        this.d = i6;
        this.e = J(i5);
        this.f = i4 - i6;
        this.g = i3 - i5;
        return this.aC;
    }

    private String B() {
        String Code2 = e.m127Code(this.f36I, this.aC);
        this.aC = s() + this.aC;
        return Code2;
    }

    /* renamed from: B  reason: collision with other method in class */
    private void m0B(int i2) {
        int m2 = m() + this.ar + this.as;
        Code(0, this.au, m2, 1, Code.f98Code[57]);
        Code(0, (this.au + i2) - 1, m2, 1, Code.f98Code[58]);
        int i3 = Code.f98Code[55];
        int i4 = Code.f98Code[56];
        int i5 = 65280 & (i3 >> 8);
        int i6 = 65280 & i3;
        int i7 = 65280 & (i3 << 8);
        int i8 = i2 - 2;
        int i9 = (((i4 >> 8) & 65280) - i5) / i8;
        int i10 = ((65280 & i4) - i6) / i8;
        int i11 = (((i4 << 8) & 65280) - i7) / i8;
        int i12 = 0;
        int i13 = i6;
        int i14 = i5;
        int i15 = i7;
        while (i12 < i8) {
            Code(0, this.au + 1 + i12, m2, 1, -16777216 | ((65280 & i14) << 8) | (65280 & i13) | (i15 >> 8));
            i12++;
            i13 += i10;
            i14 += i9;
            i15 += i11;
        }
    }

    private void B(String str, String str2) {
        this.ax++;
        this.f19Code.writeUTF(str);
        this.f19Code.writeUTF(str2);
    }

    private String C() {
        String B2 = B();
        return (B2 == null || B2.length() <= 0 || B2.charAt(0) != 0) ? B2 : new StringBuffer().append(this.f58c).append(B2.substring(1, B2.length())).toString();
    }

    private void C(int i2) {
        S();
        this.au += i2;
    }

    private void C(int i2, int i3) {
        Code(e.m180I(i2), i3);
    }

    private synchronized int Code(int i2) {
        int i3;
        this.aC = i2;
        i3 = i2;
        while (true) {
            if ((this.aC < this.f36I.length && this.ak == this.f36I.length) || this.aC < this.ak - 16) {
                int i4 = this.aC;
                int t2 = t();
                switch (t2) {
                    case 76:
                        int p2 = p();
                        if (c() && p2 > 0) {
                            this.ae = p2;
                        }
                        this.ac = p();
                        this.ad = p();
                        if (this.f18Code != null && !this.f18Code.m268J() && this.f56b != null && !this.f56b.equals(e.f286a)) {
                            this.ae = 0;
                            this.ac = 0;
                            this.ad = 0;
                            break;
                        }
                    case 77:
                        int t3 = t();
                        int p3 = p();
                        if (this.aC + p3 > this.ak) {
                            break;
                        } else {
                            switch (t3) {
                                case 67:
                                    this.H = (p3 - 8) / 6;
                                    this.f51Z = new int[((s() << 1) + (this.H * 7))];
                                    this.K = t();
                                    this.F = s();
                                    this.G = p();
                                    boolean z2 = (this.f21Code == null || this.f21Code.indexOf(35) == -1) ? false : true;
                                    if (this.f57b && !this.f24Code) {
                                        if (m58Z()) {
                                            Code((this.F + (k() / 2)) - this.O, (this.G + (l() / 2)) - this.P, true);
                                        } else if (m54J() || !e.ax || z2) {
                                            Code(this.F - this.p, this.G - this.q, false, true);
                                        }
                                        m66e();
                                    }
                                    int i5 = this.H * 6;
                                    int i6 = 0;
                                    int i7 = 0;
                                    while (i6 / 6 < this.H) {
                                        int p4 = p();
                                        int i8 = i6 + 1;
                                        this.f51Z[i6] = i7;
                                        int i9 = i8 + 1;
                                        this.f51Z[i8] = p4;
                                        this.f51Z[i9] = i5;
                                        int i10 = i9 + 1 + 1;
                                        this.f51Z[i10] = t();
                                        i6 = i10 + 1 + 1;
                                        i5 += (s() * 2) + 1;
                                        i7 += p4;
                                    }
                                    ab();
                                    continue;
                                case 83:
                                    this.f27Code = new String[7];
                                    for (int i11 = 0; i11 < 7; i11++) {
                                        this.f27Code[i11] = B();
                                    }
                                    continue;
                                case 84:
                                    this.ag = p3 / 12;
                                    this.f44J = new int[p3];
                                    for (int i12 = 0; i12 < (this.ag << 2); i12++) {
                                        this.f44J[i12] = p();
                                    }
                                    continue;
                                case 115:
                                    this.f14Code = t();
                                    this.f29I = t();
                                    continue;
                                case 117:
                                    int o2 = o();
                                    if (!this.f12C) {
                                        this.ay = o2 + this.ay;
                                        break;
                                    } else {
                                        continue;
                                    }
                                default:
                                    this.aC += p3;
                                    continue;
                            }
                        }
                    case 83:
                        this.aC = p() + this.aC;
                        break;
                    default:
                        Y();
                        b(t2);
                        if (this.aC <= this.ak) {
                            if (!this.f12C) {
                                this.d = ((short) this.d) + this.aA;
                                this.e = ((this.e << 8) >> 8) + this.aB;
                                e.m143Code(this.d, this.f36I, i4 + 1);
                                e.Z(this.e, this.f36I, i4 + 3);
                                this.aA = this.d;
                                this.aB = this.e;
                            }
                            int i13 = this.aC;
                            int I2 = I(this.e, 0);
                            while (true) {
                                int i14 = this.f51Z[(I2 * 6) + 2];
                                while (this.f51Z[i14 + 2] != 0) {
                                    i14 += 2;
                                }
                                if (this.f51Z[i14] == 0) {
                                    this.f51Z[i14] = i4;
                                } else if (this.f51Z[i14 + 1] + this.K < i4) {
                                    i14 += 2;
                                    this.f51Z[i14] = i4;
                                }
                                this.f51Z[i14 + 1] = i13;
                                I2++;
                                if (I2 >= this.H || this.e + this.g <= this.f51Z[I2 * 6]) {
                                    I(this.d, this.e, this.f, this.g);
                                }
                            }
                            I(this.d, this.e, this.f, this.g);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
                i3 = this.aC;
            }
        }
        return i3;
    }

    private static int Code(int i2, int i3) {
        return ((i2 * i3) + 255) >> 8;
    }

    private int Code(int i2, int i3, int i4) {
        return (i2 >= this.L || i2 + i3 >= this.L) ? i2 < this.L ? this.L + (((i3 - (this.L - i2)) << 8) / i4) : ((i3 << 8) / i4) + i2 < this.L ? this.L + Code(i2 - this.L, i4) + i3 : ((i3 << 8) / i4) + i2 : i2 + i3;
    }

    private int Code(int i2, int i3, int i4, int i5, char c2, int i6, String str, String str2, int i7, int i8) {
        this.f31I.write(70);
        Code(this.f31I, i2, i3, i4, i5);
        this.f31I.writeInt(i8);
        this.f31I.write(c2);
        this.f31I.write(i6);
        this.f31I.writeUTF(str);
        this.f31I.writeUTF(str2);
        e.Code(this.f31I, i7);
        int size = this.f16Code.size();
        this.f19Code.write(70);
        Code(this.f19Code, i2, i3, i4, i5);
        this.f19Code.writeInt(0);
        this.f19Code.write(c2);
        this.f19Code.write(i6);
        this.f19Code.writeUTF(str);
        this.f19Code.writeUTF(str2);
        e.Code(this.f19Code, i7);
        return size;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ab, code lost:
        if (r22 != 105) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int Code(int r24, int r25, int r26, int r27, int r28, boolean r29) {
        /*
        // Method dump skipped, instructions count: 459
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.B.Code(int, int, int, int, int, boolean):int");
    }

    private int Code(String str, String str2, int i2, int i3, boolean z2, boolean z3) {
        int i4;
        int max = i3 == -1 ? 0 : Math.max(0, (e.B(i3) - 12) / 2);
        if ((i2 & 2) != 0) {
            i4 = i2 & -3;
            this.f22Code.put(str, str2);
        } else {
            i4 = i2;
        }
        if (z2) {
            a(12, (max << 1) + 12);
        }
        if (z3) {
            Code(this.at, this.au + max, 12, 12, -16777217 & Code.f98Code[16]);
        }
        Z(12, 12, max);
        int Code2 = Code(this.at, this.au + max, 12, 12, 'c', i4, str, str2, 0, 0);
        if (z2) {
            I("", Code2);
            Code(this.at + 1, this.au + 1 + max, 10, 10);
            T();
        }
        this.at += 13;
        return Code2;
    }

    private int Code(byte[] bArr) {
        int length = bArr.length;
        int size = this.f16Code.size();
        this.f19Code.writeShort(length);
        this.f19Code.write(bArr, 0, length);
        return size;
    }

    static B Code(Object[] objArr) {
        if (objArr.length <= 8) {
            return null;
        }
        return (B) objArr[8];
    }

    static e Code(B b2) {
        return b2.f17Code;
    }

    /* renamed from: Code  reason: collision with other method in class */
    private synchronized String m1Code(int i2, int i3) {
        String str;
        this.aC = i2;
        if (this.f36I[i2] == i3 || (i3 == 76 && this.f36I[i2] == 42)) {
            w();
            str = C();
        } else {
            str = "";
        }
        return str;
    }

    static String Code(Hashtable hashtable) {
        StringBuffer stringBuffer = new StringBuffer();
        Enumeration elements = hashtable.elements();
        while (elements.hasMoreElements()) {
            if (stringBuffer.length() != 0) {
                stringBuffer.append("\u0000");
            }
            stringBuffer.append((String) elements.nextElement());
        }
        return stringBuffer.toString();
    }

    /* renamed from: Code  reason: collision with other method in class */
    private synchronized Image m2Code(int i2, int i3, int i4) {
        Image Code2;
        int i5;
        int i6;
        int i7 = 0;
        byte[] bArr = null;
        synchronized (this) {
            int k2 = this.r < 128 ? (k() * 256) / this.l : 256;
            int i8 = k2 - 256;
            int i9 = ((((i8 | (-i8)) >>> 31) ^ 1) * 536870912) | i2;
            if (k2 != 256 && (i4 & 4) == 0) {
                i7 = 1073741824;
            }
            Integer num = new Integer(i7 | i9);
            if (this.f41J.containsKey(num)) {
                Code2 = null;
            } else if (this.f48Z.containsKey(num)) {
                Code2 = (Image) this.f48Z.get(num);
            } else if (i2 < 0 && (i2 > -6000 || i2 <= -7000)) {
                if (i2 > -1000) {
                    Code2 = i2 == -41 ? Code.f89Code.f152Code : e.Code(e.m162Code(-i2), new StringBuffer().append(i2).toString());
                } else if (i2 > -3000) {
                    Vector vector = i2 <= -2000 ? e.f234C : e.f282Z;
                    if (i2 <= -2000) {
                        i5 = -2000;
                        i6 = i2;
                    } else {
                        i5 = -1000;
                        i6 = i2;
                    }
                    byte[] bArr2 = (byte[]) e.Code(vector, i5 - i6)[2];
                    Code2 = e.Code(bArr2, (Object) bArr2);
                } else if (-3000 - i2 >= Code.f118Z.size() || -3000 - i2 < 0) {
                    if (-4000 - i2 != -1) {
                        if (-4000 - i2 < e.f269J.size() && -4000 - i2 >= 0) {
                            byte[] bArr3 = (byte[]) ((Object[]) e.f269J.elementAt(-4000 - i2))[2];
                            Code2 = e.Code(bArr3, (Object) bArr3);
                        } else if (-5000 - i2 < e.f287a.size() && -5000 - i2 >= 0) {
                            byte[] bArr4 = (byte[]) ((Object[]) e.f287a.elementAt(-5000 - i2))[2];
                            Code2 = e.Code(bArr4, (Object) bArr4);
                        } else if (-7000 - i2 >= e.f261I.size() || -7000 - i2 < 0) {
                            if (-8000 - i2 < e.f230B.size() && -8000 - i2 >= 0) {
                                byte[] bArr5 = (byte[]) ((Object[]) e.f230B.elementAt(-8000 - i2))[2];
                                Code2 = e.Code(bArr5, (Object) bArr5);
                            } else if (-9000 - i2 < Code.f103I.size() && -9000 - i2 >= 0) {
                                e eVar = (e) Code.f103I.elementAt(-9000 - i2);
                                if (eVar.m223Code() != null) {
                                    Code2 = e.m132Code();
                                } else if (eVar.f367Code == null || e.I(eVar.f367Code.f21Code) != 65) {
                                    if (eVar.f367Code != null) {
                                        bArr = eVar.f367Code.f25Code;
                                    }
                                    Code2 = e.Code(bArr, (Object) bArr);
                                } else {
                                    Code2 = e.m134Code(91);
                                }
                            } else if (i2 == -10000) {
                                Code2 = e.m134Code(89);
                            } else if (i2 == -10001) {
                                Code2 = e.m135Code(90, 0, Math.max(Code.d, e.B(0)));
                            } else if (i2 <= -11000 && i2 > -12000) {
                                Code2 = e.m136Code(-11000 - i2, this.f76s);
                            }
                        } else if (e.f344r) {
                            byte[] bArr6 = (byte[]) ((Object[]) e.f261I.elementAt(-7000 - i2))[2];
                            Image Code3 = e.Code(bArr6, 0, bArr6.length, 256, (Object[]) null);
                            Code2 = (Code3.getWidth() == 1 && Code3.getHeight() == 1) ? Code3 : e.Code(bArr6, (Object) bArr6);
                        }
                    }
                    Code2 = null;
                } else {
                    byte[] bArr7 = (byte[]) ((Object[]) Code.f118Z.elementAt(-3000 - i2))[2];
                    Code2 = e.Code(bArr7, (Object) bArr7);
                }
                if (k2 != 256) {
                    Code2 = e.Code(Code2, 0, Code(Code2.getHeight(), k2), 1, true);
                }
                if (i2 <= -9000 && i2 > -10000) {
                    int i10 = -9000 - i2;
                    if (this.f37I != null && this.f37I[i10] == 0) {
                        this.f37I[i10] = i3;
                    }
                } else if (i2 > -11000 || i2 <= -12000) {
                    Code(num, Code2);
                }
            } else if (i3 == 0) {
                if (i2 < -6000) {
                    Code2 = Code.f91Code.m109Code();
                } else {
                    Code2 = Code(num);
                    Code(num, Code2);
                }
            } else if (!e.f335m) {
                this.f5B.put(new Integer((num.intValue() & 1610612736) | i3), num);
                I.Code(this);
                Code2 = i2 < -6000 ? Code.f91Code.m109Code() : null;
            } else if (i2 < -6000 || (i2 + 2 <= this.ak && e.I(this.f36I, i2) + i2 <= this.ak)) {
                Code2 = Code(num);
                Code(num, Code2);
            } else {
                ad();
                Code2 = null;
            }
        }
        return Code2;
    }

    private Image Code(Integer num) {
        int k2 = (num.intValue() & 1073741824) != 0 ? (k() * 256) / this.l : 256;
        if (num.intValue() < 0) {
            return Code.f91Code.Code((Object[]) this.f6B.elementAt(-6000 - num.intValue()));
        }
        int intValue = num.intValue() & 536870911;
        return e.Code(this.f36I, intValue + 2, e.I(this.f36I, intValue), k2, (Object[]) null);
    }

    private void Code(byte b2, String str, String str2, boolean z2) {
        if (this.f38I[9] != null && this.f38I[9].equals(str2)) {
            this.af = this.aw;
        }
        this.aw++;
        this.f46Z.write(b2);
        if (z2) {
            this.ac = this.f45Z.size();
        }
        this.f46Z.writeUTF(str);
        this.f46Z.writeUTF(str2);
        this.av = this.f45Z.size();
        this.f46Z.write(0);
    }

    private void Code(byte b2, String str, String str2, boolean z2, int i2, int i3, int i4, int i5) {
        Code(b2, str, str2, z2);
        Code(this.f46Z, i2, i3, i4, i5);
        T();
    }

    private void Code(char c2, int i2, int i3, int i4) {
        if (!e.m153Code(c2)) {
            int Code2 = -11000 - e.Code(c2, i2);
            this.ak = this.f16Code.size();
            this.f36I = this.f16Code.Code();
            Image Code3 = m2Code(Code2, 0, 0);
            int width = Code3.getWidth();
            int height = Code3.getHeight();
            int i5 = i3 - (width / 2);
            int i6 = i4 - (height / 2);
            Code(i5, i6, width, height);
            I(Code2, i5, i6, width, height);
            return;
        }
        Code(String.valueOf(c2), 1, i2, i3 - (e.Code(1, String.valueOf(c2)) / 2), i4 - (e.B(1) / 2));
    }

    private void Code(int i2, int i3, int i4, int i5) {
        this.l = Math.max(this.l, i2 + i4);
        this.m = Math.max(i3 + i5, this.m);
        if (this.av > 0) {
            Code(this.f46Z, i2, i3, i4, i5);
        }
    }

    private void Code(int i2, int i3, int i4, int i5, int i6) {
        Code(i2, i3, i4, i5);
        this.f31I.write(66);
        Code(this.f31I, i2, i3, i4, i5);
        this.f31I.writeInt(i6);
    }

    private void Code(int i2, int i3, boolean z2) {
        int i4;
        int i5 = 0;
        this.O = e.Code(this.O + i2, 0, this.l - 1);
        this.P = e.Code(this.P + i3, 0, this.m - 1);
        ae();
        int i6 = this.p;
        if (z2) {
            i4 = 0;
            while (true) {
                if (i4 < this.ag) {
                    if (this.O > this.ah + this.f44J[i4 << 2] && this.O <= this.f44J[(i4 << 2) + 2] - this.ah && this.P > this.f44J[(i4 << 2) + 1] + 0 && this.P <= this.f44J[(i4 << 2) + 3]) {
                        break;
                    }
                    i4++;
                } else {
                    i4 = -1;
                    break;
                }
            }
            i6 = J(i4, i6);
        } else {
            i4 = -1;
        }
        if (i4 < 0) {
            i5 = 40;
        }
        c(e.Code(i6, (this.O + i5) - k(), this.O - i5), e.Code(this.q, Code(this.P, 50 - l(), this.r), Code(this.P, -50, this.r)));
    }

    private void Code(int i2, int i3, boolean z2, boolean z3, boolean z4) {
        String str = null;
        if (!z4) {
            str = e.m180I(i2);
            if (z2) {
                str = new StringBuffer().append("menu:").append(str).toString();
            }
            if (z3) {
                str = new StringBuffer().append("dialog:").append(str).toString();
            }
        }
        Code(str, i3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    private static void Code(int i2, int i3, byte[] bArr) {
        int i4 = 0;
        switch (i2) {
            case 0:
                e.t = i3;
                try {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
                    int readByte = dataInputStream.readByte() & 255;
                    Vector vector = new Vector(Math.min(1, readByte));
                    while (i4 < readByte) {
                        if (i4 == 0) {
                            Object[] objArr = new Object[4];
                            objArr[1] = dataInputStream.readUTF();
                            objArr[0] = dataInputStream.readUTF();
                            int readShort = dataInputStream.readShort() & 65535;
                            byte[] bArr2 = new byte[readShort];
                            dataInputStream.readFully(bArr2, 0, readShort);
                            objArr[2] = bArr2;
                            dataInputStream.skip((long) (dataInputStream.readShort() & 65535));
                            vector.addElement(objArr);
                            i4++;
                        } else {
                            dataInputStream.readUTF();
                            dataInputStream.readUTF();
                            dataInputStream.skip((long) (dataInputStream.readShort() & 65535));
                            dataInputStream.skip((long) (dataInputStream.readShort() & 65535));
                            i4++;
                        }
                    }
                    e.f261I = vector;
                    return;
                } catch (IOException e2) {
                    return;
                }
            case 1:
            case 2:
                int i5 = i2 - 1;
                boolean z2 = ((i5 | (-i5)) >>> 31) ^ 1;
                if (z2 != 0) {
                    e.x = i3;
                } else {
                    e.y = i3;
                }
                try {
                    e.Code(new DataInputStream(new ByteArrayInputStream(bArr)), z2);
                    return;
                } catch (Throwable th) {
                    return;
                }
            case 3:
                e.u = i3;
                DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(bArr));
                byte[] bArr3 = new byte[dataInputStream2.readShort()];
                if (bArr3.length > 0) {
                    dataInputStream2.readFully(bArr3, 0, bArr3.length);
                    if (!e.f333l) {
                        e.v = e.Code(e.v, bArr3, "b");
                        return;
                    }
                    return;
                }
                return;
            case 4:
                e.s = i3;
                e.f328j = new DataInputStream(new ByteArrayInputStream(bArr)).readUTF();
                return;
            case 15:
                e.A = i3;
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream(bArr));
                int readByte2 = dataInputStream3.readByte() & 255;
                Vector vector2 = new Vector(readByte2);
                while (i4 < readByte2) {
                    Object[] objArr2 = new Object[4];
                    objArr2[1] = dataInputStream3.readUTF();
                    objArr2[0] = dataInputStream3.readUTF();
                    int readShort2 = dataInputStream3.readShort() & 65535;
                    byte[] bArr4 = new byte[readShort2];
                    dataInputStream3.readFully(bArr4, 0, readShort2);
                    objArr2[2] = bArr4;
                    vector2.addElement(objArr2);
                    i4++;
                }
                e.f230B = vector2;
                e.o();
                return;
            case 17:
                if (i3 != e.a) {
                    e.Code(i3, bArr);
                    Code.m82Z();
                    e.m140Code(e.a);
                    return;
                }
                return;
            case 31:
                e.w = i3;
                e.m145Code(new DataInputStream(new ByteArrayInputStream(bArr)));
                return;
            default:
                return;
        }
    }

    private void Code(int i2, String str) {
        Code(new StringBuffer().append(e.m122Code(i2)).append(": ").toString(), 1, -16777216);
        Code(str, 0, -16777216);
        S();
    }

    private void Code(int i2, String str, boolean z2) {
        Code(str, "", (z2 ? 1 : 0) << 1, 0, true, false);
        int i3 = this.ar;
        this.at += 2;
        this.ar = this.at;
        Code(e.m122Code(i2), 0, -16777216);
        this.ar = i3;
        C(5);
    }

    private void Code(int i2, boolean z2, int i3) {
        this.ak = this.f16Code.size();
        this.f36I = this.f16Code.Code();
        Image Code2 = m2Code(i2, 0, 0);
        int width = Code2.getWidth();
        int height = Code2.getHeight();
        if (z2) {
            this.at = (j() / 2) - (width / 2);
            this.at = Math.max(0, this.at);
        }
        if (i3 >= 0) {
            this.au += (e.B(i3) - height) / 2;
        }
        a(width, height);
        I(i2, this.at, this.au, width, height);
        if (i3 >= 0) {
            this.au -= (e.B(i3) - height) / 2;
        }
        this.at += width;
    }

    private void Code(long j2, long j3) {
        if (j2 > j3) {
            j3 = j2;
        }
        Code(e.m122Code(240), 0, -16777216);
        int min = j3 == 0 ? 0 : Math.min(100 - ((int) ((100 * j2) / j3)), 99);
        Code(new StringBuffer().append(" ").append(min).append("% ").toString(), 1, min == 0 ? -16777216 : e.C(min));
        Code(e.m122Code(241), 0, -16777216);
        S();
        Code(new StringBuffer().append(e.m122Code(237)).append(" ").toString(), 0, -16777216);
        Code(e.Code(j2), 0, -16777216);
        S();
        Code(new StringBuffer().append(e.m122Code(238)).append(" ").toString(), 0, -16777216);
        Code(e.Code(j3), 0, -16777216);
        S();
    }

    /* renamed from: Code  reason: collision with other method in class */
    static void m3Code(B b2) {
        b2.a(5);
    }

    static void Code(B b2, DataInputStream dataInputStream) {
        b2.Code(dataInputStream);
    }

    private void Code(DataInputStream dataInputStream) {
        int i2;
        int i3 = 3;
        byte[] bArr = new byte[3];
        int i4 = 0;
        do {
            i4 += dataInputStream.read(bArr, i4, 3 - i4);
        } while (i4 < 3);
        this.al = e.J(bArr, 0);
        if (this.f17Code == Code.m79I()) {
            i2 = 0;
        } else {
            i2 = 0;
            i3 = 2;
        }
        while (true) {
            if (i2 > i3) {
                break;
            }
            try {
                this.f36I = new byte[this.al];
                break;
            } catch (Throwable th) {
                Code.f89Code.B(i2);
                i2++;
            }
        }
        if (this.f36I == null) {
            this.f36I = new byte[this.al];
        }
        this.ak = 0;
        int i5 = 0;
        while (this.al > this.ak) {
            this.ak += dataInputStream.read(this.f36I, this.ak, Math.min(1024, this.al - this.ak));
            I.Code(this);
            if (this.aj == 0) {
                int i6 = 11;
                int i7 = 0;
                while (true) {
                    if (i7 < 4) {
                        if (i6 + 2 >= this.ak) {
                            break;
                        }
                        i6 += e.Code(this.f36I, i6) + 2;
                        i7++;
                    } else {
                        if (this.ak >= i6 + 5) {
                            X();
                            i5 = this.aj;
                            if (this.f56b != null && this.f56b.startsWith("server:gettitle")) {
                                f1Code[1] = this.f32I;
                                f1Code[2] = this.f25Code;
                                this.f17Code.f367Code.f40J = "keep";
                                m28C();
                                this.f17Code.m242J();
                            }
                            m66e();
                            a(4);
                        }
                    }
                }
            }
            if (this.aj > 0) {
                i5 = Code(i5);
                c(1000);
            }
        }
    }

    private static void Code(DataOutputStream dataOutputStream, int i2, int i3, int i4, int i5) {
        dataOutputStream.writeShort(i2);
        e.Code(dataOutputStream, i3);
        dataOutputStream.writeShort(i4);
        e.Code(dataOutputStream, i5);
    }

    private synchronized void Code(Integer num, Image image) {
        if (image != null) {
            this.f48Z.put(num, image);
        } else {
            this.f41J.put(num, num);
        }
    }

    private void Code(String str, int i2) {
        Code(str, e.m122Code(i2));
    }

    private void Code(String str, int i2, int i3) {
        while (true) {
            int indexOf = str.indexOf(10);
            if (indexOf >= 0) {
                if (indexOf > 0) {
                    Code(str.substring(0, indexOf), i2, i3);
                }
                S();
                str = str.substring(indexOf + 1, str.length());
            } else {
                int Code2 = e.Code(i2, str);
                int j2 = (j() - Math.min(this.at, this.ar)) - this.as;
                if (Code2 > j2) {
                    int lastIndexOf = str.lastIndexOf(32, str.length());
                    while (lastIndexOf > 0 && e.Code(i2, str.substring(0, lastIndexOf)) > j2) {
                        lastIndexOf = str.substring(0, lastIndexOf).lastIndexOf(32);
                    }
                    if (lastIndexOf <= 0 || lastIndexOf == str.length()) {
                        if (m10Z(e.Code(i2, str.substring(0, 3)))) {
                            S();
                        }
                        int j3 = (j() - this.as) - this.at;
                        char[] charArray = str.toCharArray();
                        int max = Math.max(e.I(i2, charArray, charArray.length, j3), 1);
                        Code(str.substring(0, max), i2, i3);
                        str = str.substring(max);
                    } else {
                        Code(str.substring(0, lastIndexOf), i2, i3);
                        S();
                        str = str.substring(lastIndexOf + 1);
                    }
                } else {
                    int B2 = e.B(i2);
                    a(Code2, B2);
                    this.f31I.write(84);
                    Code(this.f31I, this.at, this.au, Code2, B2);
                    this.f31I.writeInt(i3);
                    this.f31I.write(e.I(i2));
                    this.f31I.writeUTF(str);
                    this.at = Code2 + this.at;
                    return;
                }
            }
        }
    }

    private void Code(String str, int i2, int i3, int i4, int i5) {
        int Code2 = e.Code(i2, str);
        int B2 = e.B(i2);
        Code(i4, i5, Code2, B2);
        this.f31I.write(84);
        Code(this.f31I, i4, i5, Code2, B2);
        this.f31I.writeInt(i3);
        this.f31I.write(e.I(i2));
        this.f31I.writeUTF(str);
    }

    private void Code(String str, String str2) {
        int i2 = 0;
        while (true) {
            int B2 = ((str == null || !e.m188I(str, "menu:")) ? 0 : ((e.B(0) + 4) / 3) + 2) + e.Code(0, str2) + this.at + this.as;
            if (B2 <= j()) {
                this.l = Math.max(this.l, B2);
                this.f42J.addElement(str);
                this.f42J.addElement(str2);
                return;
            }
            str2 = new StringBuffer().append(str2.substring(0, str2.length() - ((i2 * 3) + 1))).append("...").toString();
            i2 = 1;
        }
    }

    private void Code(String str, String str2, int i2) {
        if (m() - this.at < m() / 5) {
            S();
            C(5);
        }
        int m2 = m() - this.at;
        int B2 = e.B(0) + 6;
        a(m2, B2);
        Z(m2, B2, 0);
        int i3 = ((this.at + m2) - (B2 / 2)) - 6;
        int i4 = (this.au + (B2 / 2)) - 1;
        for (int i5 = 7; i5 > 0; i5 -= 2) {
            Code(i3, i4, i5, 1, -16777216);
            i3++;
            i4++;
        }
        I("", Code(this.at + 4, this.au + 3, m2 - 24, B2 - 2, 's', 0, str, str2, i2, -16777216));
        Code(this.at + 1, this.au + 1, m2 - 2, B2 - 2);
        T();
        this.at += m2;
    }

    private void Code(String str, String str2, int i2, boolean z2, boolean z3, boolean z4, int i3) {
        this.at = 4;
        this.au--;
        if (!(i2 == 0 || m2Code(i2, 0, 0) == null)) {
            Code(i2, false, 0);
            this.at += 4;
        }
        Code(e.Code(0, str2, m() - this.at, (String) null), 0, i3);
        if (z4) {
            m6I(m(), e.B(0) + 2, i3);
            this.at = m();
        }
        this.au++;
        int m2 = m() + this.ar + this.as;
        if (!z2) {
            Code((byte) 42, str2, str, z3, 0, this.au, m2, this.ap);
        }
        S();
        this.au++;
        Code(0, this.au, m2, 1, Code.f98Code[15]);
        C(4);
    }

    private void Code(String str, String str2, boolean z2) {
        Code(str2, "", (z2 ? 1 : 0) << 1, 0, true, false);
        int i2 = this.ar;
        this.at += 2;
        this.ar = this.at;
        Code(str, 0, -16777216);
        this.ar = i2;
        C(5);
    }

    private void Code(String str, String str2, byte[] bArr, int i2, int i3) {
        Code(str, str2, bArr, i2, i3, m());
    }

    private void Code(String str, String str2, byte[] bArr, int i2, int i3, int i4) {
        int i5;
        int i6;
        int B2 = e.B(0);
        int i7 = 0;
        int i8 = 0;
        if (bArr != null && bArr.length == 0) {
            bArr = null;
        }
        if (bArr != null) {
            i8 = Code(bArr);
            this.ak = this.f16Code.size();
            this.f36I = this.f16Code.Code();
            Image Code2 = m2Code(i8, 0, 0);
            int width = Code2.getWidth() + 3;
            int max = Math.max(0, (Code2.getHeight() - B2) / 2);
            i7 = Math.max(0, ((B2 - Code2.getHeight()) + 1) / 2);
            B2 = Math.max(B2, Code2.getHeight());
            i5 = max;
            i6 = width;
        } else {
            i5 = 0;
            i6 = 0;
        }
        int i9 = B2 + 5;
        a(i4, i9);
        Z(i4, i9, 0);
        if (bArr != null) {
            J(i8, this.at + 3, i7 + this.au + 3);
        }
        if ((i2 & 128) != 0) {
            int i10 = ((this.at + i4) - (i9 / 2)) - 6;
            int i11 = (this.au + (i9 / 2)) - 1;
            for (int i12 = 7; i12 > 0; i12 -= 2) {
                Code(i10, i11, i12, 1, -16777216);
                i10++;
                i11++;
            }
        }
        I("", Code(this.at + 3 + i6, this.au + 3 + i5, ((i4 - 4) - i6) - ((i2 & 128) != 0 ? i9 : 0), i9 - 4, 'x', i2, str, str2, 0, i3));
        Code(this.at + 1, this.au + 1, i4 - 2, i9 - 2);
        T();
        this.at += i4;
    }

    private void Code(Vector vector, boolean z2) {
        this.f63f = z2;
        this.f68k = true;
        this.f14Code = 2;
        if (this.f63f) {
            this.f32I = e.m122Code(41);
            this.f14Code = 1;
            this.f29I = 10;
        } else if (vector == e.f282Z) {
            this.f32I = e.m122Code(7);
            Code((Object[]) null, e.m180I(91), e.m122Code(33), -10, false, false, true, -16777216);
            if (Code.f120Z) {
                Code((Object[]) null, "myopera:///b", e.m122Code(179), -9, false, false, true, -16777216);
            }
            Code((Object[]) null, "myopera:///n", e.m122Code(180), -12, false, false, true, -16777216);
            if (e.f277Y) {
                Code((Object[]) null, e.m180I(136), e.m122Code(146), -9, false, false, true, -16777216);
            }
        } else if (vector == e.f269J) {
            this.f32I = e.m122Code(33);
        } else if (vector == e.f234C) {
            this.f32I = e.m122Code(47);
        } else if (vector == e.f287a) {
            this.f32I = e.m122Code(146);
        }
        Code(vector, false, -1);
    }

    private void Code(Vector vector, boolean z2, int i2) {
        int i3;
        boolean z3;
        boolean z4;
        String str;
        Object[] objArr;
        String str2;
        String stringBuffer;
        String str3 = null;
        if (vector == e.f282Z) {
            str3 = "bookmark:";
            i3 = -1000;
        } else if (vector == e.f234C) {
            str3 = "search:";
            i3 = -2000;
        } else if (vector == e.f269J) {
            str3 = "speeddial:";
            i3 = -4000;
        } else if (vector == Code.f118Z) {
            i3 = -3000;
        } else if (vector == e.f287a) {
            str3 = "open:";
            i3 = -5000;
        } else if (vector == e.f261I) {
            str3 = "spl:";
            i3 = -7000;
        } else {
            i3 = vector == e.f230B ? -8000 : -3999;
        }
        int min = i2 >= 0 ? Math.min(i2, vector.size()) : vector.size();
        int i4 = 0;
        while (i4 < min) {
            Object[] Code2 = e.Code(vector, i4);
            boolean z5 = (vector == Code.f118Z || vector == e.f287a || vector == e.f234C) ? false : e.Code(Code2, 5) == 82;
            if (vector == e.f230B) {
                if (Code2[3] != null) {
                    z5 |= true;
                }
                z3 = z5;
            } else {
                z3 = z5;
            }
            int i5 = -16777216;
            if (vector == e.f269J) {
                boolean Code3 = e.m159Code(Code2);
                if (!Code3 || z2) {
                    z4 = Code3;
                    str = null;
                } else {
                    z4 = Code3;
                    str = e.m122Code(128);
                }
            } else {
                z4 = false;
                str = null;
            }
            if (this.f63f) {
                String str4 = (String) Code2[1];
                objArr = null;
                if (!(vector == e.f282Z || vector == Code.f118Z || i4 <= 0)) {
                    z3 = false;
                    if (e.m159Code(e.Code(e.f269J, i4 - 1))) {
                        i5 = Code.f98Code[52];
                        str = str4;
                        str2 = "";
                    }
                }
                str = str4;
                str2 = "";
            } else {
                objArr = Code2;
                str2 = str3;
            }
            if ((!z2 || !z4) && (!z3 || vector == e.f269J)) {
                if (str2 == null) {
                    stringBuffer = null;
                } else {
                    stringBuffer = new StringBuffer().append(str2).append(i4).append(str2.length() > 0 ? ":" : "").toString();
                }
                Code(objArr, stringBuffer, str, i3 - i4, false, (vector == e.f234C && this.af == 0) ? i4 == e.q : false, false, i5);
            }
            i4++;
            str3 = str2;
        }
    }

    private void Code(Graphics graphics, int i2, int i3, int i4, int i5) {
        int I2 = I(i4, 5);
        int i6 = I2;
        int i7 = I2;
        while (i6 != this.H) {
            this.f51Z[(i6 * 6) + 3] = this.f51Z[(i6 * 6) + 2];
            if ((this.f51Z[(i6 * 6) + 4] & 1) == 0) {
                I(graphics, i2, i3, i7, i6 - 1);
                do {
                    i7++;
                    if (i7 == this.H) {
                        return;
                    }
                } while ((this.f51Z[(i7 * 6) + 4] & 1) == 0);
                i6 = i7 - 1;
            } else if (this.f51Z[(i6 * 6) + 5] > i5) {
                I(graphics, i2, i3, i7, i6 - 1);
                return;
            }
            i6++;
        }
        I(graphics, i2, i3, i7, i6 - 1);
    }

    private void Code(Graphics graphics, int i2, int i3, int i4, int i5, int i6, boolean z2, boolean z3) {
        int i7;
        int min;
        int i8;
        if (this.ae > 0) {
            this.aC = this.ae;
            t();
            int t2 = t();
            Vector vector = new Vector();
            int i9 = Integer.MAX_VALUE;
            while (true) {
                int i10 = t2 - 1;
                if (t2 <= 0) {
                    break;
                }
                Y();
                this.e = J(this.e);
                this.d--;
                this.e--;
                this.g++;
                if (i6 != 0) {
                    this.d -= 2;
                    this.e -= 2;
                    this.f += 4;
                    this.g += 3;
                }
                b(i2, i3);
                i9 = Math.min(i9, this.e);
                int i11 = this.d;
                int i12 = i11 + this.f;
                int i13 = 0;
                while (true) {
                    i8 = i13;
                    int intValue = i8 < vector.size() ? ((Integer) vector.elementAt(i8)).intValue() : 2147483646;
                    if (intValue >= i11) {
                        Integer num = new Integer(i11);
                        int i14 = i8 + 1;
                        vector.insertElementAt(num, i8);
                        int i15 = i14 + 1;
                        vector.insertElementAt(new Integer(this.e), i14);
                        int i16 = i15 + 1;
                        vector.insertElementAt(new Integer(this.e + this.g), i15);
                        int i17 = i16 + 1;
                        vector.insertElementAt(new Integer(1), i16);
                        i8 = i17 + 1;
                        vector.insertElementAt(new Integer((this.f <= 40 || this.g <= az) ? 0 : 1), i17);
                        i11 = Integer.MAX_VALUE;
                    }
                    if (intValue > i12) {
                        break;
                    }
                    i13 = i8 + 5;
                }
                vector.insertElementAt(new Integer((this.f <= 40 || this.g <= az) ? 0 : -1), i8);
                vector.insertElementAt(new Integer(-1), i8);
                vector.insertElementAt(new Integer(this.e + this.g), i8);
                vector.insertElementAt(new Integer(this.e), i8);
                vector.insertElementAt(new Integer(i12), i8);
                t2 = i10;
            }
            int i18 = i9;
            int i19 = i9;
            while (i18 != Integer.MAX_VALUE) {
                int i20 = Integer.MAX_VALUE;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                while (i23 < vector.size()) {
                    int intValue2 = ((Integer) vector.elementAt(i23)).intValue() + 1;
                    int i27 = i21 + i22;
                    int i28 = 0;
                    int i29 = i24;
                    int i30 = i25;
                    while (true) {
                        int i31 = i23 + 1;
                        vector.elementAt(i23);
                        int i32 = i31 + 1;
                        int intValue3 = ((Integer) vector.elementAt(i31)).intValue();
                        int i33 = i32 + 1;
                        int intValue4 = ((Integer) vector.elementAt(i32)).intValue();
                        int i34 = i33 + 1;
                        int intValue5 = ((Integer) vector.elementAt(i33)).intValue();
                        i7 = i34 + 1;
                        int intValue6 = ((Integer) vector.elementAt(i34)).intValue();
                        min = intValue3 > i18 ? Math.min(i20, intValue3) : i20;
                        if (intValue4 > i18) {
                            min = Math.min(min, intValue4);
                        }
                        if (intValue3 < i18 && intValue4 >= i18) {
                            i30 += intValue5;
                            i28 += intValue6;
                        }
                        if (intValue3 <= i18 && intValue4 > i18) {
                            i29 += intValue5;
                        }
                        if (i7 >= vector.size() || ((Integer) vector.elementAt(i7)).intValue() > intValue2) {
                            int i35 = intValue2 - 1;
                        } else {
                            i23 = i7;
                            i20 = min;
                        }
                    }
                    int i352 = intValue2 - 1;
                    if (i27 == 0 && i25 > 0) {
                        if (z3) {
                            graphics.setColor(Code.f98Code[10]);
                            graphics.drawLine(0, i19 - 1, this.l - 1, i19 - 1);
                            e.Code(graphics, 0, i19, this.l, i18 - i19, i4, i5);
                            graphics.setColor(Code.f98Code[13]);
                            graphics.drawLine(0, i18 - 1, this.l - 1, i18 - 1);
                            graphics.setColor(Code.f98Code[14]);
                            graphics.drawLine(0, i18, this.l - 1, i18);
                        } else if (i4 == i5) {
                            e.Code(graphics, i26 + 1, i19 + 1, i352 - i26, i18 - i19, i4, false);
                        } else {
                            e.Code(graphics, i26 + 1, i19 + 1, i352 - i26, i18 - i19, i4, i5);
                        }
                        if (z2) {
                            if (z3) {
                                this.f76s = true;
                                e.I(graphics, i26 + 1, i19 + 1, i352 - i26, (i18 - i19) - 1);
                                Z(graphics, i2, i3);
                                e.Z(graphics);
                                this.f76s = false;
                            } else {
                                e.I(graphics, i26 + 1, i19 + 1, i352 - i26, i18 - i19);
                                Z(graphics, i2, i3);
                                e.Z(graphics);
                            }
                        }
                        if (z3) {
                            if ((i4 >>> 24) > 254 && (i5 >>> 24) > 254) {
                                e.Code(graphics, 0, i19 - 1, this.l, (i18 - i19) + 2);
                            }
                        } else if (i4 == i5) {
                            if ((i4 >>> 24) > 254) {
                                e.Code(graphics, i26 + 1, i19 + 1, i352 - i26, i18 - i19);
                            }
                        } else if ((i4 >>> 24) > 254 && (i5 >>> 24) > 254) {
                            e.Code(graphics, i26 + 1, i19 + 1, i352 - i26, i18 - i19);
                        }
                    }
                    if (!z3) {
                        if ((((((-i25) | i25) >>> 31) ^ 1) ^ ((((-i30) | i30) >>> 31) ^ 1)) != 0) {
                            e.Code(graphics, i352, i19 + 1, 2, i18 - i19, i6, false);
                            if ((i6 >>> 24) > 254) {
                                e.Code(graphics, i352, i19 + 1, 2, i18 - i19);
                            }
                        }
                        if ((((((-i25) | i25) >>> 31) ^ 1) ^ ((((-i24) | i24) >>> 31) ^ 1)) != 0) {
                            e.Code(graphics, i26 + 1, i18, i352 - i26, 2, i6, false);
                            if ((i6 >>> 24) > 254) {
                                e.Code(graphics, i26 + 1, i18, i352 - i26, 2);
                            }
                        }
                    }
                    i23 = i7;
                    i22 = i28;
                    i21 = i27;
                    i24 = i29;
                    i25 = i30;
                    i26 = i352;
                    i20 = min;
                }
                i19 = i18;
                i18 = i20;
            }
        }
    }

    private void Code(Graphics graphics, int i2, int i3, int i4, int i5, boolean z2) {
        Code(graphics, i2, i3, i4, i4, i5, z2, false);
    }

    private void Code(Graphics graphics, char[] cArr, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = 1;
        int max = Math.max(i5 / e.B(i4), 1);
        int i9 = 0;
        while (i9 < i2 && i8 <= max) {
            int i10 = cArr[i9] - '\n';
            i8 += ((i10 | (-i10)) >>> 31) ^ 1;
            i9++;
        }
        if (this.r >= 200) {
            graphics.setColor(i3);
            i6 = i8;
        } else {
            if (B == null || B.length < Code.e * 2) {
                C = null;
                a = null;
                B = null;
                int[] iArr = new int[(Code.e * 2)];
                C = iArr;
                a = new int[iArr.length];
                B = new int[C.length];
                aK = -1;
                aL = -1;
                Random random = new Random(4711);
                for (int i11 = 0; i11 < (B.length >> 1); i11++) {
                    B[i11] = random.nextInt() & 127;
                    B[(B.length >> 1) + i11] = B[i11] + 64;
                }
            }
            int i12 = (e.m199Z(i4) ? 1 : 0) << 6;
            if (!(i12 == aL && i3 == aK)) {
                for (int i13 = 0; i13 < a.length; i13++) {
                    a[i13] = ((B[i13] + i12) << 24) | (16777215 & i3);
                }
                aL = i12;
                aK = i3;
            }
            i6 = i8;
        }
        while (i9 > 0) {
            int i14 = i6 - 1;
            int I2 = this.e + I((i5 * i14) / i8);
            int i15 = 0;
            if (i14 == 0) {
                i7 = 0;
            } else {
                i7 = i9;
                while (i7 > 0 && cArr[i7 - 1] != '\n') {
                    i15++;
                    i7--;
                }
                i9 = i15;
            }
            if (this.r >= 200) {
                e.Code(graphics, i4, cArr, i7, i9, this.d, I2);
            } else {
                int min = Math.min((C.length >> 1) - 1, I(e.Code(i4, cArr, i7, i9)));
                if (min <= 0 || I2 < 0) {
                    i9 = i7 - 1;
                    i6 = i14;
                } else {
                    int max2 = Math.max(min / i9, 1);
                    if (e.ah || !e.f344r || e.f349u) {
                        graphics.setColor(i3);
                        graphics.drawLine(this.d, I2, this.d + min, I2);
                    } else {
                        int length = (((i7 << 1) | ((i9 << 2) ^ min)) % ((C.length / 2) - min)) & -2;
                        for (int i16 = 0; i16 < min; i16++) {
                            C[i16] = a[length + i16];
                            C[min + i16] = a[(a.length >> 1) + length + i16];
                        }
                        for (int i17 = i7; i17 < i7 + i9; i17++) {
                            if (cArr[i17] == ' ') {
                                for (int i18 = 0; i18 < max2; i18++) {
                                    int i19 = ((i17 - i7) * max2) + i18;
                                    if (i19 < C.length) {
                                        C[i19] = 0;
                                    }
                                    int i20 = ((i17 - i7) * max2) + min + i18;
                                    if (i20 < C.length) {
                                        C[i20] = 0;
                                    }
                                }
                            }
                        }
                        int max3 = Math.max(0, -this.d);
                        if (min > max3) {
                            try {
                                graphics.drawRGB(C, max3, min - max3, this.d + max3, I2, min - max3, 2, true);
                            } catch (ArrayIndexOutOfBoundsException e2) {
                            }
                        }
                    }
                }
            }
            i9 = i7 - 1;
            i6 = i14;
        }
    }

    private void Code(Object[] objArr, String str, String str2, int i2, boolean z2, boolean z3, boolean z4, int i3) {
        String str3 = str2 == null ? "" : str2;
        String str4 = str == null ? "" : str;
        if (objArr != null) {
            str3 = new StringBuffer().append(str3).append((String) objArr[1]).toString();
            str4 = new StringBuffer().append(str4).append((String) objArr[0]).toString();
        }
        Code(str4, str3, i2, z2, z3, z4, i3);
    }

    private static boolean Code(e eVar, String str) {
        if (eVar != null && eVar.m231Code(1) && str != null && !str.equals("")) {
            if (str.startsWith("http:") || str.startsWith("https:") || e.m188I(str, "ext:") || e.m188I(str, "history:") || e.m188I(str, "bookmark:") || e.m188I(str, "spl:") || e.m188I(str, "open:")) {
                return true;
            }
            return (e.m188I(str, "speeddial:") && !e.m159Code(e.Code(e.f269J, e.Code(str)))) || str.startsWith("feed:") || str.startsWith("myopera:");
        }
    }

    private boolean Code(Graphics graphics) {
        return e.Code(this.d, this.e, this.f, this.g, graphics.getClipX(), graphics.getClipY(), graphics.getClipWidth(), graphics.getClipHeight());
    }

    /* renamed from: Code  reason: collision with other method in class */
    static Object[] m4Code(Object[] objArr) {
        Object[] objArr2 = new Object[11];
        int[] iArr = new int[6];
        System.arraycopy(objArr, 0, objArr2, 0, 11);
        System.arraycopy(objArr[7], 0, iArr, 0, 6);
        objArr2[7] = iArr;
        return objArr2;
    }

    private void D() {
        this.f3B = 28;
        this.f14Code = 9;
        this.f29I = 23;
        String Code2 = e.m126Code(this.f47Z, "a");
        String Code3 = e.m126Code(this.f47Z, "b");
        Code(Code2, 0, Code.f98Code[44]);
        C(5);
        if (Code3 != null) {
            Code(Code3, 0, Code.f98Code[44]);
        }
    }

    private void E() {
        e.aF = true;
        this.f29I = 23;
        this.f14Code = 23;
        Code(e.m122Code(85), 0, Code.f98Code[44]);
        C(5);
        Code(e.m122Code(86), 0, Code.f98Code[44]);
    }

    private void F() {
        this.f29I = 23;
        this.f14Code = 23;
        Code(e.m122Code(222), 0, Code.f98Code[44]);
    }

    private void G() {
        boolean equals = "1".equals(e.m126Code(this.f47Z, "s"));
        String Code2 = e.m126Code(this.f47Z, "r");
        int parseInt = Code2 != null ? Integer.parseInt(Code2) : 0;
        this.af = 0;
        this.f6B = Code.f91Code.m108Code(equals);
        this.f32I = a.Code();
        this.f63f = true;
        this.f14Code = 1;
        this.f29I = 10;
        Code(0, this.au, this.as + m() + this.ar, 1, 0);
        if (parseInt > 0) {
            Code(e.m122Code(155), 1, Code.f98Code[44]);
            S();
        }
        if (equals && !a.m106Code()) {
            String Code3 = e.m126Code(this.f47Z, "u");
            if (parseInt == 1) {
                Code((byte) 76, "new file", new StringBuffer().append("sets:").append(Code3).toString(), false);
            } else if (parseInt == 2) {
                Code((byte) 76, "new file", new StringBuffer().append("set:").append(Code3).toString(), false);
            } else {
                Code((byte) 76, "new file", new StringBuffer().append("put:").append(Code3).toString(), false);
            }
        }
        String str = "...";
        int lastIndexOf = this.f32I.lastIndexOf(47, this.f32I.length() - 2);
        if (lastIndexOf > 0) {
            str = new StringBuffer().append(str).append(this.f32I.substring(lastIndexOf)).toString();
        }
        Code(e.Code(0, this.f32I, m(), str), 0, Code.f98Code[44]);
        if (equals && !a.m106Code()) {
            T();
        }
        S();
        int i2 = this.ar;
        int i3 = this.au;
        this.au = i3 + 1;
        Code(i2, i3, m(), 1, Code.f98Code[45]);
        boolean b2 = e.b();
        int width = (!b2 || !a.f197I || equals) ? 0 : Code.f91Code.m109Code().getWidth() + 1;
        for (int i4 = 0; i4 < this.f6B.size(); i4++) {
            Object[] objArr = (Object[]) this.f6B.elementAt(i4);
            String str2 = (String) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            String str3 = null;
            if ((intValue & 4) != 0) {
                str3 = "+".equals(objArr[0]) ? "mkdir:" : "cwd:";
            } else if (!equals && (intValue & 1) != 0) {
                str3 = "get:";
            }
            if (str3 != null) {
                if (b2 && (intValue & 4) == 0) {
                    J(-6000 - i4, this.at, this.au);
                }
                int i5 = this.ar + width;
                this.ar = i5;
                this.at = i5;
                String str4 = (String) objArr[2];
                Code((byte) 76, str4, new StringBuffer().append(str3).append(str2).toString(), false);
                int i6 = this.au;
                String str5 = "...";
                int lastIndexOf2 = str4.lastIndexOf(47);
                if (lastIndexOf2 != -1) {
                    str5 = new StringBuffer().append(str5).append(str4.substring(lastIndexOf2)).toString();
                }
                Code(e.Code(0, str4, m(), str5), 0, (intValue & 4) != 0 ? Code.f98Code[44] : Code.f98Code[45]);
                if (b2 && (intValue & 4) == 0) {
                    S();
                    Code(new String(new char[]{0, (char) (((char) i4) + ' '), ' '}), 0, Code.f98Code[45]);
                }
                this.ar -= width;
                S();
                Code(this.ar + width, i6, m() - width, this.au - i6);
                T();
            }
        }
    }

    private void H() {
        this.f14Code = 39;
        this.f29I = 40;
        this.f3B = 23;
        this.f32I = e.f330k;
        int i2 = Code.f98Code[44];
        Code(this.f32I, 0, i2);
        C(5);
        Code(e.f332l, 0, i2);
        e.aC = true;
    }

    private int I(int i2) {
        return ((this.r * i2) + 255) >> 8;
    }

    private synchronized int I(int i2, int i3) {
        int max;
        int i4 = this.H;
        int i5 = -1;
        while (i4 - i5 > 1) {
            int i6 = (i5 + i4) >>> 1;
            if (this.f51Z[(i6 * 6) + i3] > i2) {
                i4 = i6;
            } else {
                i5 = i6;
            }
        }
        max = Math.max(i5, 0);
        while (max > 0 && this.f51Z[(max * 6) + i3] == this.f51Z[((max - 1) * 6) + i3]) {
            max--;
        }
        if (i3 == 5) {
            while ((this.f51Z[(max * 6) + 4] & 1) == 0) {
                max++;
            }
        }
        return max;
    }

    private int I(int i2, int i3, int i4) {
        int min = Math.min(0, i4) + i2;
        int abs = Math.abs(i4) + k();
        for (int i5 = 0; i5 < this.ag; i5++) {
            if (e.Code(min, this.ai + i3, abs, l() - (this.ai * 2), this.f44J[i5 << 2], this.f44J[(i5 << 2) + 1], this.f44J[(i5 << 2) + 2] - this.f44J[i5 << 2], this.f44J[(i5 << 2) + 3] - this.f44J[(i5 << 2) + 1])) {
                if (i4 > 0) {
                    if (this.f44J[(i5 << 2) + 2] > k() + i2) {
                        i4 = Math.min(i4, Math.max((this.f44J[(i5 << 2) + 2] - i2) - k(), this.f44J[i5 << 2] - i2));
                    }
                } else if (this.f44J[i5 << 2] < i2) {
                    i4 = Math.max(i4, Math.min(this.f44J[i5 << 2] - i2, (this.f44J[(i5 << 2) + 2] - i2) - k()));
                }
            }
        }
        return i4;
    }

    /* renamed from: I  reason: collision with other method in class */
    private void m5I(int i2) {
        int i3;
        int max = Math.max(e.B(0), i2) + 6;
        int i4 = 0;
        while (true) {
            if (i4 < this.f42J.size()) {
                String str = (String) this.f42J.elementAt(i4);
                if (str != null && e.m188I(str, "menu:")) {
                    this.l = Math.min(j(), this.l + (max / 3));
                    break;
                }
                i4 += 2;
            } else {
                break;
            }
        }
        int Code2 = e.Code(0, "*. ");
        this.l = Math.min(j(), this.l + Code2);
        int i5 = 0;
        int i6 = 0;
        while (i5 < this.f42J.size()) {
            int i7 = i5 + 1;
            String str2 = (String) this.f42J.elementAt(i5);
            int i8 = i7 + 1;
            String str3 = (String) this.f42J.elementAt(i7);
            if (str2 == null) {
                Code(str3, 0, Code.f98Code[35], this.at + Code2, this.au + 3);
            } else {
                i6++;
                if (i6 <= 9) {
                    str3 = new StringBuffer().append("*. ".replace('*', (char) (i6 + 48))).append(str3).toString();
                    i3 = 0;
                } else {
                    i3 = Code2;
                }
                Code(str3, 0, Code.f98Code[34], this.at + i3, this.au + 3);
                if (e.m188I(str2, "menu:")) {
                    m6I(this.l, max, Code.f98Code[34]);
                }
                Code((byte) 76, "", str2, false);
                Code(0, this.au, this.l, max);
                T();
            }
            this.au += max;
            i5 = i8;
            i6 = i6;
        }
        this.f42J = null;
        this.au--;
    }

    /* renamed from: I  reason: collision with other method in class */
    private void m6I(int i2, int i3, int i4) {
        for (int i5 = 1; i5 < i3 / 3; i5++) {
            Code((i2 - i5) - this.as, ((this.au + (i3 / 2)) - i5) + 1, 1, (i5 << 1) - 1, i4);
        }
    }

    private synchronized void I(int i2, int i3, int i4, int i5) {
        if (this.D <= 0 || this.E <= 0) {
            this.z = i2;
            this.A = i3;
            this.D = i4;
            this.E = i5;
        } else {
            int i6 = this.z + this.D;
            this.z = Math.min(this.z, i2);
            this.D = Math.max(i2 + i4, i6) - this.z;
            int i7 = this.A + this.E;
            this.A = Math.min(this.A, i3);
            this.E = Math.max(i3 + i5, i7) - this.A;
        }
    }

    private void I(int i2, int i3, int i4, int i5, int i6) {
        this.f31I.write(73);
        Code(this.f31I, i3, i4, i5, i6);
        this.f31I.writeInt(0);
        this.f31I.write(0);
        this.f31I.write(0);
        this.f31I.write(0);
        e.Code(this.f31I, i2);
    }

    static void I(e eVar) {
        if (e.H < 160 && e.aA) {
            eVar.m229Code(new StringBuffer().append("overlay:").append(e.m180I(40)).toString(), (String) null, (String) null);
            while (e.aF) {
                e.Code(e.f258I, 1000);
            }
            Code.f89Code.I(Code.m73Code(40));
        }
        if (e.H >= 160 && e.f264I[1] == null) {
            byte[] bArr = new byte[32];
            e.Code(bArr);
            e.Code(1, e.m183I(bArr, bArr.length), true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    private synchronized void I(Integer num, Image image) {
        int i2;
        this.f20Code = null;
        if (num != null) {
            Code(num, image);
            i2 = image != null ? num.intValue() : 0;
        } else {
            i2 = 0;
        }
        Enumeration keys = this.f5B.keys();
        while (keys.hasMoreElements()) {
            Integer num2 = (Integer) keys.nextElement();
            Integer num3 = (Integer) this.f5B.get(num2);
            int intValue = num2.intValue();
            int intValue2 = i2 - num3.intValue();
            if (Code(intValue, ((intValue2 | (-intValue2)) >>> 31) ^ 1, false, 1000) && !this.f48Z.containsKey(num3) && !this.f41J.containsKey(num3)) {
                int intValue3 = num3.intValue() & 536870912;
                if ((((intValue3 | (-intValue3)) >>> 31) ^ (m58Z() ? 1 : 0)) != 0 && (m49I() || this.ak >= (num3.intValue() & 536870911) + 2 + e.I(this.f36I, num3.intValue() & 536870911))) {
                    this.f20Code = num3;
                }
            }
        }
        if (this.f20Code != null) {
            I.Code(this);
        } else if (num != null) {
            I.f177Code = false;
            c(0);
        }
    }

    private void I(String str, int i2) {
        this.aw++;
        this.f46Z.write(73);
        this.f46Z.writeUTF(str);
        this.f46Z.writeShort(3);
        e.Code(this.f46Z, i2);
        this.av = this.f45Z.size();
        this.f46Z.write(0);
    }

    private void I(String str, String str2) {
        S();
        int i2 = this.au;
        int B2 = e.B(0) + 6;
        if (str2 != null) {
            Code((byte) 76, str, str2, false, 3, this.au + 2, this.l - 6, B2 - 4);
        }
        m0B(B2);
        C(3);
        Code(str, 1, -16777216);
        S();
        this.au = i2 + B2 + 4;
    }

    private void I(Vector vector) {
        String Code2;
        B b2;
        int i2;
        int i3;
        if (vector == e.f282Z || vector == e.f269J) {
            Code.f114J = true;
        }
        Q();
        int B2 = this.f17Code.m236I().B();
        if (vector == e.f282Z) {
            this.f32I = e.m122Code(26);
            Code2 = e.m122Code(27);
            b2 = this;
        } else if (vector == e.f234C) {
            this.f32I = e.m122Code(123);
            Code2 = e.m122Code(124);
            b2 = this;
        } else if (vector == e.f287a) {
            this.f32I = e.m122Code(150);
            Code2 = e.m122Code(151);
            b2 = this;
        } else {
            this.f32I = e.m122Code(125);
            Code2 = e.m122Code(126);
            b2 = this;
        }
        b2.Code(Code2, 0, -16777216);
        C(5);
        Object[] Code3 = e.Code(vector, B2);
        if (vector == e.f282Z) {
            i2 = -1000;
            i3 = B2;
        } else if (vector == e.f269J) {
            i2 = -4000;
            i3 = B2;
        } else if (vector == e.f287a) {
            i2 = -5000;
            i3 = B2;
        } else {
            i2 = -2000;
            i3 = B2;
        }
        Code(Code3, (String) null, (String) null, i2 - i3, true, false, false, Code.f98Code[52]);
    }

    private void I(Graphics graphics, int i2, int i3, int i4, int i5) {
        int i6;
        if (i5 >= 0) {
            int I2 = I(this.f51Z[(i4 * 6) + 5]) + i3;
            e.I(graphics, i2, I2, this.l, this.f51Z[i5 * 6] + this.f51Z[(i5 * 6) + 1]);
            int I3 = I2 - I(this.f51Z[i4 * 6]);
            this.aC = 0;
            while (true) {
                int i7 = Integer.MAX_VALUE;
                for (int i8 = i4; i8 <= i5; i8++) {
                    int i9 = this.f51Z[(i8 * 6) + 3];
                    while (true) {
                        if (this.f51Z[i9] == 0) {
                            break;
                        }
                        this.f51Z[(i8 * 6) + 3] = i9;
                        if (this.f51Z[i9 + 1] > this.aC) {
                            i7 = e.Code(i7, this.aC, this.f51Z[i9]);
                            break;
                        }
                        i9 += 2;
                    }
                }
                if (i7 != Integer.MAX_VALUE) {
                    int i10 = i7;
                    while (true) {
                        i6 = i10;
                        for (int i11 = i4; i11 <= i5; i11++) {
                            int i12 = this.f51Z[(i11 * 6) + 3];
                            while (this.f51Z[i12] != 0 && this.f51Z[i12] <= this.K + i6) {
                                this.f51Z[(i11 * 6) + 3] = i12;
                                i6 = Math.max(i6, this.f51Z[i12 + 1]);
                                i12 += 2;
                            }
                        }
                        if (i10 == i6) {
                            break;
                        }
                        i10 = i6;
                    }
                    Z(graphics, i2, I3, i7, i6);
                } else {
                    e.Z(graphics);
                    return;
                }
            }
        }
    }

    /* renamed from: I  reason: collision with other method in class */
    private boolean m7I(int i2) {
        return (this.aH & i2) != 0;
    }

    private int J(int i2) {
        int I2 = I(i2, 0);
        if ((this.f51Z[(I2 * 6) + 4] & 1) == 0) {
            return -1;
        }
        return this.f51Z[(I2 * 6) + 5] + (i2 - this.f51Z[I2 * 6]);
    }

    private int J(int i2, int i3) {
        if (i2 < 0) {
            return i3;
        }
        if (this.f44J[(i2 << 2) + 2] > k() + i3 && i3 < this.f44J[i2 << 2]) {
            i3 = Math.min(this.f44J[i2 << 2], this.f44J[(i2 << 2) + 2] - k());
        }
        return (this.f44J[i2 << 2] >= i3 || k() + i3 <= this.f44J[(i2 << 2) + 2]) ? i3 : Math.max(this.f44J[i2 << 2], this.f44J[(i2 << 2) + 2] - k());
    }

    /* renamed from: J  reason: collision with other method in class */
    private void m8J(int i2) {
        Q();
        this.f32I = "";
        String str = "";
        switch (i2) {
            case 32:
                this.f32I = e.m122Code(96);
                str = e.m122Code(98);
                break;
            case 33:
                this.f32I = e.m122Code(97);
                str = e.m122Code(99);
                break;
        }
        Code(str, 0, -16777216);
    }

    private void J(int i2, int i3, int i4) {
        this.ak = this.f16Code.size();
        this.f36I = this.f16Code.Code();
        Image Code2 = m2Code(i2, 0, 0);
        int width = Code2.getWidth();
        int height = Code2.getHeight();
        Code(i3, i4, width, height);
        I(i2, i3, i4, width, height);
    }

    private void J(String str, String str2) {
        int i2 = Code.f98Code[53];
        Code((byte) 76, str2, str, false);
        Code(str2, 0, i2);
        T();
    }

    private void J(Vector vector) {
        if (this.f54a != null && vector != null && this.f54a.size() > 0 && vector.size() > 0 && vector.size() == this.f54a.size()) {
            int size = vector.size();
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = i2 + 1;
                int[] iArr = (int[]) vector.elementAt(i2);
                while (i3 < size) {
                    int[] iArr2 = (int[]) vector.elementAt(i3);
                    if (iArr[1] > iArr2[1]) {
                        vector.setElementAt(iArr2, i2);
                        vector.setElementAt(iArr, i3);
                    } else {
                        iArr2 = iArr;
                    }
                    i3++;
                    iArr = iArr2;
                }
            }
            for (int i4 = 0; i4 < size; i4++) {
                ((int[]) this.f54a.elementAt(((int[]) vector.elementAt(i4))[0]))[4] = i4;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r20v0, resolved type: B */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void K() {
        /*
        // Method dump skipped, instructions count: 365
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.B.K():void");
    }

    private void L() {
        Q();
        this.f32I = e.m122Code(110);
        Code(e.m122Code(111), 0, Code.f98Code[44]);
        C(5);
        Code(e.m122Code(112), 0, Code.f98Code[44]);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: B */
    /* JADX DEBUG: Multi-variable search result rejected for r5v9, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void M() {
        /*
        // Method dump skipped, instructions count: 527
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.B.M():void");
    }

    private void N() {
        this.f3B = 28;
        this.f14Code = 9;
        this.f29I = 23;
        this.f32I = e.m122Code(139);
        Code(e.m124Code(258, String.valueOf(Code.m)), 0, Code.f98Code[44]);
    }

    private void O() {
        this.f7B = true;
        this.au = (l() / 2) - e.B(0);
        Code(e.m122Code(257), 0, -16777216);
    }

    private void P() {
        Q();
        this.f32I = e.m122Code(139);
        Code(new StringBuffer().append(e.m122Code(140)).append(" ").append(e.m122Code(136)).toString(), 0, Code.f98Code[44]);
    }

    private void Q() {
        this.f14Code = 5;
        this.f29I = 6;
        this.f3B = 28;
        this.f67j = true;
        this.f7B = true;
    }

    private void R() {
        Code(0, this.au - 4, this.as + m() + this.ar, 1, -1);
        this.au--;
    }

    private void S() {
        this.at = this.ar;
        this.au += this.ap + this.aq;
        this.ap = 0;
    }

    private void T() {
        this.f45Z.Code()[this.av] = (byte) ((this.f45Z.size() - this.av) / 10);
        this.av = 0;
    }

    private void U() {
        e.Z(this.ax, this.f16Code.Code(), this.ao);
    }

    private void V() {
        e.Code((InputStream) this.f18Code);
        this.f18Code = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v26, types: [int] */
    /* JADX WARN: Type inference failed for: r2v28, types: [int] */
    /* JADX WARN: Type inference failed for: r2v30, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37, types: [int] */
    /* JADX WARN: Type inference failed for: r3v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v65, types: [boolean] */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void W() {
        /*
        // Method dump skipped, instructions count: 926
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.B.W():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void X() {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.B.X():void");
    }

    private void Y() {
        this.d = s();
        this.e = p();
        this.f = s();
        this.g = p();
    }

    private int Z(int i2) {
        return (i2 << 8) / this.r;
    }

    private int Z(int i2, int i3) {
        for (int i4 = 0; i4 < this.ag; i4++) {
            if (e.Code(i2, i3 + this.ai, 1, l() - (this.ai * 2), this.f44J[i4 << 2], this.f44J[(i4 << 2) + 1], this.f44J[(i4 << 2) + 2] - this.f44J[i4 << 2], this.f44J[(i4 << 2) + 3] - this.f44J[(i4 << 2) + 1])) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: Z  reason: collision with other method in class */
    private void m9Z(int i2) {
        this.f14Code = 9;
        this.f3B = 23;
        this.f32I = "";
        int i3 = Code.f98Code[44];
        String str = "";
        if (i2 == 0) {
            str = e.m122Code(221);
            if (Browser.browser.getAppProperty("MIDlet-Jar-RSA-SHA1") != null) {
                str = e.m122Code(169);
            }
        } else if (i2 == 1) {
            this.f32I = e.m122Code(37);
            str = new StringBuffer().append(e.m122Code(153)).append(" ").append(e.m122Code(154)).toString();
        }
        if (this.f32I.length() > 0) {
            Code(this.f32I, 0, i3);
            C(5);
        }
        Code(str, 0, i3);
    }

    private void Z(int i2, int i3, int i4) {
        int i5 = Code.f98Code[7] & -16777217;
        Code(this.at + 1, this.au + i4, i2 - 2, 1, i5);
        Code(this.at + 1, ((this.au + i4) + i3) - 1, i2 - 2, 1, i5);
        Code(this.at, this.au + i4, 1, i3, i5);
        Code((this.at + i2) - 1, this.au + i4, 1, i3, i5);
        Code(this.at + 1, this.au + 1 + i4, i2 - 2, 1, -16777217 & Code.f98Code[4]);
        Code(this.at + 1, this.au + 2 + i4, i2 - 2, 1, -16777217 & Code.f98Code[5]);
        Code(this.at + 1, this.au + 3 + i4, i2 - 2, 1, -16777217 & Code.f98Code[6]);
    }

    private void Z(String str, String str2) {
        Code(str, str2, 0, false, false, false, -16777216);
    }

    private void Z(Vector vector) {
        if (vector == e.f282Z || vector == e.f269J || vector == null) {
            Code.f114J = true;
        }
        this.f14Code = 7;
        this.f29I = 10;
        this.f7B = true;
        String str = (String) f1Code[1];
        if (vector == e.f282Z || vector == null) {
            this.f32I = e.m122Code(7);
        } else if (vector == e.f269J) {
            this.f32I = e.m122Code(33);
        } else if (vector == e.f234C) {
            this.f32I = e.m122Code(47);
        } else if (vector == e.f287a) {
            this.f32I = e.m122Code(145);
        }
        I(e.m122Code(65), (String) null);
        Code("a", str, (byte[]) f1Code[2], 0, -16777216);
        C(5);
        if (vector != e.f287a) {
            I(e.m122Code(63), (String) null);
            Code("b", (String) f1Code[0], (byte[]) null, 48, -16777216);
            C(2);
            J(e.m180I(53), e.m122Code(129));
            C(5);
        } else if (vector.size() > 2 && c == -1) {
            Code("s", "1", 0, 0, true, false);
            Code(e.m122Code(157), 0, -16777216);
        }
        if (vector == e.f269J) {
            J(new StringBuffer().append("dialog:").append(e.m180I(54)).append("&l=b").toString(), e.m122Code(132));
            S();
            if (Code.f118Z.size() > 0) {
                J(new StringBuffer().append("dialog:").append(e.m180I(54)).append("&l=h").toString(), e.m122Code(133));
                S();
            }
        }
        if (vector == null) {
            Code(e.m122Code(33), 0, -16777216);
            S();
            C(2);
            if (Code == null) {
                vector = new Vector();
                Object[] Code2 = e.m174Code();
                Code2[1] = new StringBuffer().append("- ").append(e.m122Code(131)).append(" -").toString();
                vector.addElement(Code2);
                for (int i2 = 0; i2 < e.f269J.size(); i2++) {
                    Object[] Code3 = e.m176Code((Object[]) e.f269J.elementAt(i2));
                    if (e.m159Code(Code3)) {
                        Code3[1] = e.m122Code(130);
                    }
                    vector.addElement(Code3);
                }
                Code = vector;
                c = -1;
            }
            Code("$", "", (byte[]) null, 129, -16777216);
        }
        if (vector == e.f234C && str.length() == 0) {
            Code(e.m124Code(127, e.m122Code(108)), 0, Code.f98Code[52]);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private void Z(Graphics graphics, int i2, int i3, int i4, int i5) {
        Image image;
        Object[] objArr;
        int i6;
        this.aC = i4;
        while (this.aC < i5) {
            int t2 = t();
            if (t2 == 83 || t2 == 76 || t2 == 77) {
                b(t2);
            } else {
                Y();
                int i7 = this.g;
                b(i2, i3);
                if (Code(graphics)) {
                    int i8 = this.aC;
                    int r2 = r();
                    switch (t2) {
                        case 66:
                            e.Code(graphics, this.d, this.e, this.f, this.g, r2, false);
                            continue;
                        case 70:
                            int t3 = t();
                            int t4 = t();
                            String B2 = B();
                            String B3 = B();
                            int p2 = p();
                            String str = (String) this.f22Code.get(B2);
                            String str2 = str == null ? B3 : str;
                            char[] cArr = null;
                            switch (t3) {
                                case 97:
                                    char[] charArray = str2.toCharArray();
                                    int i9 = 0;
                                    int i10 = 1;
                                    boolean z2 = true;
                                    int i11 = 0;
                                    while (i11 < charArray.length) {
                                        if (charArray[i11] == '\n') {
                                            i9 = 0;
                                        } else if (charArray[i11] == ' ') {
                                            if (z2) {
                                                z2 = false;
                                                i9 = e.Code(0, charArray, 0, i11);
                                            }
                                            while (i11 + i10 < charArray.length && charArray[i11 + i10] != ' ') {
                                                i10++;
                                            }
                                            int Code2 = e.Code(0, charArray, i11, i10);
                                            if (i9 + Code2 > this.f) {
                                                charArray[i11] = '\n';
                                                i9 = 0;
                                            }
                                            i9 += Code2;
                                            i10 = 1;
                                        }
                                        i11++;
                                    }
                                    image = null;
                                    cArr = charArray;
                                    break;
                                case 99:
                                    int i12 = t4 & 2;
                                    if (((str != null ? 1 : 0) ^ ((i12 | (-i12)) >>> 31)) != 0) {
                                        if (!e.f343q) {
                                            if (I != null) {
                                                image = I[0];
                                                break;
                                            }
                                        } else {
                                            graphics.setColor(Code.f98Code[65]);
                                            graphics.drawLine(this.d + 1, this.e + 1, (this.d + this.f) - 2, (this.e + this.g) - 2);
                                            graphics.drawLine(this.d + 1, (this.e + this.g) - 2, (this.d + this.f) - 2, this.e + 1);
                                            image = null;
                                            break;
                                        }
                                    }
                                    image = null;
                                    break;
                                case 102:
                                    if (this.f33I != null && (objArr = (Object[]) this.f33I.get(B2)) != null) {
                                        cArr = new StringBuffer().append(objArr[0]).append(", ").append(((Integer) objArr[1]).intValue() / 1000).append(" kB").toString().toCharArray();
                                        image = null;
                                        break;
                                    } else {
                                        cArr = e.m122Code(182).toCharArray();
                                        image = null;
                                        break;
                                    }
                                    break;
                                case 112:
                                    if (!this.f49Z.contains(B2)) {
                                        this.f49Z.addElement(B2);
                                    }
                                    cArr = new char[str2.length()];
                                    for (int i13 = 0; i13 < cArr.length; i13++) {
                                        cArr[i13] = '*';
                                    }
                                    image = null;
                                    break;
                                case 114:
                                    if (str == null ? (t4 & 2) != 0 : str.equals(B3)) {
                                        if (!e.f343q) {
                                            if (I != null) {
                                                image = I[1];
                                                break;
                                            }
                                        } else {
                                            graphics.setColor(Code.f98Code[66]);
                                            graphics.fillArc(this.d + 1, this.e + 1, this.f - 3, this.g - 3, -90, 360);
                                            image = null;
                                            break;
                                        }
                                    }
                                    image = null;
                                    break;
                                case 115:
                                    int i14 = this.aC;
                                    this.aC = p2;
                                    int p3 = p();
                                    String stringBuffer = new StringBuffer().append("\u0000").append(str2).append("\u0000").toString();
                                    StringBuffer stringBuffer2 = new StringBuffer();
                                    while (true) {
                                        if (p3 > 0) {
                                            String B4 = B();
                                            String B5 = B();
                                            boolean z3 = stringBuffer.indexOf(new StringBuffer().append("\u0000").append(B4).append("\u0000").toString()) >= 0;
                                            if ((t4 & 4) != 0) {
                                                if (z3) {
                                                    stringBuffer2.append("*");
                                                }
                                                stringBuffer2.append(B5).append("\n");
                                            } else if (z3) {
                                                stringBuffer2.append(B5).append("\n");
                                            }
                                            p3--;
                                        }
                                    }
                                    this.aC = i14;
                                    cArr = stringBuffer2.toString().toCharArray();
                                    image = null;
                                    break;
                                case 120:
                                    cArr = str2.toCharArray();
                                    if (B2.equals("$")) {
                                        cArr = ((String) ((Object[]) Code.elementAt(c + 1))[1]).toCharArray();
                                        image = null;
                                        break;
                                    }
                                    image = null;
                                    break;
                                default:
                                    image = null;
                                    break;
                            }
                            if (cArr != null) {
                                e.I(graphics, this.d, this.e, this.f, this.g);
                                Code(graphics, cArr, cArr.length, r2, 0, i7);
                                e.Z(graphics);
                            }
                            if (image != null && this.r == 256) {
                                graphics.drawImage(image, this.d + (this.f / 2), this.e + (this.g / 2), 3);
                                break;
                            }
                            break;
                        case 73:
                            int t5 = this.d - t();
                            int t6 = this.e - t();
                            int t7 = t();
                            int q2 = q();
                            int i15 = (this.r >= 128 ? 4 : 2) & t7;
                            int i16 = ((i15 | (-i15)) >>> 31) ^ 1;
                            int i17 = t7 & 8;
                            int i18 = (i17 | (-i17)) >>> 31;
                            Image Code3 = i16 != 0 ? m2Code(this.N + q2, this.aC - 20, t7) : null;
                            if (i16 == 0 || Code3 == null) {
                                if (i16 != 0 || i18 != 0) {
                                    e.Code(graphics, this.d, this.e, this.f, this.g, r2 | -16777216, false);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                e.I(graphics, this.d, this.e, this.f, this.g);
                                int width = Code3.getWidth();
                                int height = Code3.getHeight();
                                if (t5 + width < graphics.getClipX()) {
                                    t5 = graphics.getClipX() - ((graphics.getClipX() - t5) % width);
                                }
                                if (t6 + height < graphics.getClipY()) {
                                    t6 = graphics.getClipY() - ((graphics.getClipY() - t6) % height);
                                }
                                int clipWidth = graphics.getClipWidth() + graphics.getClipX();
                                int clipHeight = graphics.getClipHeight() + graphics.getClipY();
                                for (int i19 = t5; i19 < clipWidth; i19 += width) {
                                    for (int i20 = t6; i20 < clipHeight; i20 += height) {
                                        graphics.drawImage(Code3, i19, i20, 20);
                                    }
                                }
                                e.Z(graphics);
                                continue;
                            }
                        case 84:
                            int Z2 = e.Z(t());
                            int s2 = s();
                            char[] cArr2 = f0Code;
                            if (s2 > f0Code.length) {
                                cArr2 = new char[s2];
                            }
                            int Code4 = e.Code(this.f36I, this.aC, cArr2, 0, s2);
                            if (m49I() && cArr2[0] == 0) {
                                int i21 = cArr2[1] - ' ';
                                String str3 = null;
                                if (this.f6B != null && i21 < this.f6B.size()) {
                                    str3 = (String) ((Object[]) this.f6B.elementAt(i21))[3];
                                }
                                cArr2 = str3 != null ? str3.toCharArray() : new char[]{' '};
                                Code4 = cArr2.length;
                                int i22 = this.f;
                                int Code5 = e.Code(Z2, cArr2, 0, Code4);
                                this.f = Code5;
                                if (i22 != Code5) {
                                    this.f36I[this.aC - 12] = (byte) (this.f >> 8);
                                    this.f36I[this.aC - 11] = (byte) this.f;
                                }
                            }
                            if (!e.at || this.f34I == null) {
                                i6 = r2;
                            } else {
                                i6 = r2;
                                for (int i23 = 0; i23 < this.f34I.size(); i23++) {
                                    if (((Integer) this.f34I.elementAt(i23)).intValue() == i8) {
                                        i6 = -33024;
                                    }
                                }
                            }
                            Code(graphics, cArr2, Code4, i6, Z2, i7);
                            Integer num = new Integer(this.aC - 7);
                            if (this.f10C != null && this.f10C.containsKey(num)) {
                                int[] iArr = (int[]) this.f10C.get(num);
                                for (int i24 = 0; i24 < iArr.length; i24++) {
                                    int i25 = iArr[i24] - this.aP;
                                    int i26 = ((i25 | (-i25)) >>> 31) ^ 1;
                                    int i27 = i26 != 0 ? Code.f98Code[69] : Code.f98Code[67];
                                    graphics.setColor(i26 != 0 ? Code.f98Code[70] : Code.f98Code[68]);
                                    int[] iArr2 = (int[]) this.f11C.elementAt(iArr[i24]);
                                    graphics.fillRect(this.d + iArr2[0], this.e + iArr2[1], iArr2[2], iArr2[3]);
                                    e.I(graphics, this.d + iArr2[0], this.e + iArr2[1], iArr2[2], iArr2[3]);
                                    Code(graphics, cArr2, Code4, i27, Z2, i7);
                                    e.Z(graphics);
                                }
                            }
                            this.aC += s2;
                            continue;
                    }
                } else {
                    b(t2);
                }
            }
        }
    }

    /* renamed from: Z  reason: collision with other method in class */
    private boolean m10Z(int i2) {
        return (this.at + i2) + this.as > j();
    }

    private void a(int i2) {
        if (i2 > this.f8C) {
            this.f8C = i2;
            if (i2 == 7 || i2 == 4 || i2 == 5 || i2 == 6) {
                if (i2 == 4 && this.f26Code != null && this.f26Code[4] == 1) {
                    I(true);
                }
                Code.f128b = false;
                e.Code((Object) Code.f89Code);
            }
            if (!e.aA && e.f286a.equals(this.f21Code)) {
                this.f14Code = 13;
                this.f29I = 14;
                this.f67j = true;
                this.f7B = true;
            }
            if (this.f17Code != null) {
                this.f17Code.Code(this);
            }
            if (i2 >= 5) {
                e.Code(0, (long) this.ay, 0);
                this.ay = 0;
            }
        }
    }

    private void a(int i2, int i3) {
        if (m10Z(i2)) {
            S();
        }
        this.l = Math.max(this.l, this.at + i2 + this.as);
        this.ap = Math.max(this.ap, i3);
        Code(this.at, this.au, i2, i3);
    }

    private void a(boolean z2) {
        int size = Code.f118Z.size();
        int min = z2 ? size - Math.min(3, size) : 0;
        for (int i2 = size - 1; i2 >= min; i2--) {
            Code((Object[]) Code.f118Z.elementAt(i2), new StringBuffer().append("history:").append(i2).append(":").toString(), (String) null, -3000 - i2, false, false, false, -16777216);
        }
    }

    private void aa() {
        this.f51Z = new int[9];
        this.f51Z[1] = this.m;
        this.f51Z[2] = 6;
        this.f51Z[4] = 3;
        this.H = 1;
    }

    private void ab() {
        int i2 = 0;
        this.L = 0;
        for (int i3 = 0; i3 < this.H; i3++) {
            this.f51Z[(i3 * 6) + 5] = i2;
            if ((this.f51Z[(i3 * 6) + 4] & 1) != 0) {
                i2 = this.f51Z[(i3 * 6) + 1] + i2;
                if ((this.f51Z[(i3 * 6) + 4] & 2) == 0) {
                    this.L += this.f51Z[(i3 * 6) + 1];
                }
            } else {
                i2 = i2;
            }
        }
        this.m = i2;
    }

    private void ac() {
        this.f77t = true;
        int s2 = s() + this.aC;
        while (this.aC < s2) {
            int t2 = t();
            int s3 = s();
            this.f51Z[(s3 * 6) + 4] = t2 | (this.f51Z[(s3 * 6) + 4] & -2);
        }
        ab();
        ad();
    }

    private void ad() {
        I(0, 0, Math.max(this.l, k()), Math.max(this.m, l()));
    }

    private void ae() {
        if (!c()) {
            this.ae = Code(this.O, this.P, 1, 1, 0, false);
        }
    }

    private void af() {
        this.aC = s() + this.aC;
        this.aC = s() + this.aC;
    }

    private void ag() {
        this.f14Code = ((e.aE ? 1 : 0) << 2) + 7;
        this.f29I = 10;
    }

    private void ah() {
        char[] Code2;
        this.f32I = e.aE ? e.m122Code(224) : e.m122Code(29);
        this.aq = 1;
        e.q();
        for (int i2 = 0; i2 < 45; i2++) {
            String Code3 = e.Code(i2, true);
            if (Code3 != null) {
                if (e.D != i2 || Code.f89Code.m88Code() == 0) {
                    Code2 = e.m166Code(i2);
                } else {
                    char[] cArr = {' ', ' '};
                    cArr[0] = (char) Code.f89Code.m88Code();
                    Code2 = cArr;
                }
                int B2 = e.B(1);
                int i3 = B2 + 2;
                int i4 = B2 + 2;
                int i5 = (i3 << 1) + 1;
                if (Code2 == null || Code2.length == 1) {
                    i3 = i5;
                }
                boolean z2 = (Code2 == null || "0".indexOf(Code2[0]) == -1) ? false : true;
                int i6 = z2 ? Code.f98Code[35] : Code.f98Code[26];
                if (Code2 == null) {
                    Code(this.at, this.au, i3, i4, i6);
                    this.at += i3;
                    this.at++;
                } else {
                    for (char c2 : Code2) {
                        Code(this.at, this.au, i3, i4, i6);
                        this.at += i3;
                        Code(c2, Code.f98Code[28], this.at - (i3 / 2), (this.au + (i4 / 2)) - 1);
                        this.at++;
                    }
                }
                this.at++;
                int i7 = this.ar;
                this.ar = this.at;
                Code(e.Code(0, Code3, m(), (String) null), 0, -16777216);
                this.ar = i7;
                this.au++;
                int m2 = m() + this.ar + this.as;
                if (!z2) {
                    Code((byte) 42, "", new StringBuffer().append("shortcut:").append(i2).toString(), false, 0, this.au, m2, this.ap);
                }
                C(1);
            }
        }
        C(6);
        if (!e.aE) {
            J(e.m180I(149), e.m122Code(223));
            C(2);
        }
        this.l = m() + this.ar + this.as;
        ag();
    }

    private void b(int i2) {
        switch (i2) {
            case 66:
                this.aC += 4;
                return;
            case 70:
                this.aC += 6;
                this.aC = s() + this.aC;
                this.aC = s() + this.aC + 3;
                return;
            case 73:
                this.aC += 10;
                return;
            case 76:
                this.aC += 9;
                return;
            case 77:
                this.aC++;
                this.aC = p() + this.aC;
                return;
            case 83:
                this.aC = p() + this.aC;
                return;
            case 84:
                this.aC += 5;
                this.aC = s() + this.aC;
                return;
            default:
                return;
        }
    }

    private void b(int i2, int i3) {
        this.d = I(this.d);
        this.e = I(this.e);
        this.f = I(this.f);
        this.g = I(this.g);
        if (this.f == 0) {
            this.f = 1;
        }
        if (this.g == 0) {
            this.g = 1;
        }
        this.d += i2;
        this.e += i3;
    }

    private synchronized void b(boolean z2) {
        if (c() && !z2) {
            int i2 = 0;
            this.aC = this.ae + 1;
            int t2 = t();
            int i3 = -1;
            int i4 = -1;
            while (t2 > 0) {
                Y();
                this.e = J(this.e);
                int min = Math.min(this.e + this.g, this.o + l()) - Math.max(this.e, this.o);
                if (min > i2) {
                    i4 = this.d + (this.f / 2);
                    i3 = this.e + (this.g / 2);
                } else {
                    min = i2;
                }
                t2--;
                i2 = min;
            }
            this.O = i4;
            this.P = i3;
        }
    }

    private void c(int i2) {
        if (this.D > 0 && ((int) System.currentTimeMillis()) - this.an >= i2) {
            this.an = (int) System.currentTimeMillis();
            if (this.f17Code != null) {
                e.a();
            }
        }
    }

    private void c(int i2, int i3) {
        int Code2 = e.Code(i2, 0, this.l - ((k() << 8) / this.s));
        int Code3 = e.Code(i3, 0, this.m - ((l() << 8) / this.s));
        if (this.p != Code2) {
            this.n = e.Code(Code.Code(this.n, this.p, this.t, this.u), 0, this.l - Z(k()));
            this.p = Code2;
            this.t = this.n;
            this.u = (int) System.currentTimeMillis();
        }
        if (this.q != Code3) {
            this.o = e.Code(Code.Code(this.o, this.q, this.v, this.w), 0, this.m - Z(l()));
            this.q = Code3;
            this.v = this.o;
            this.w = (int) System.currentTimeMillis();
        }
        if (m58Z()) {
            I.f179I = true;
        }
        Code.e();
    }

    private boolean c() {
        return this.f70m || this.l <= k();
    }

    private int j() {
        return this.f17Code != null ? this.f17Code.m244Z() : this.aF;
    }

    private int k() {
        return this.f17Code != null ? this.f17Code.m222Code() : this.aD;
    }

    /* renamed from: k  reason: collision with other method in class */
    private void m11k() {
        if (m7I(40)) {
            this.au += 2;
        }
        if (this.f45Z.size() != 0) {
            byte[] Code2 = this.f45Z.Code();
            int size = this.f16Code.size();
            int i2 = size;
            int i3 = 0;
            while (i3 != this.f45Z.size()) {
                i2 = this.f16Code.size();
                int i4 = i3 + 1;
                this.f19Code.write(Code2[i3]);
                if (i4 == this.ac) {
                    this.ae = i2;
                }
                int I2 = e.I(Code2, i4) + 2 + i4;
                int I3 = I2 + e.I(Code2, I2) + 2;
                int i5 = I3 - i4;
                byte b2 = Code2[I3];
                this.f19Code.write(b2);
                int i6 = b2 * 10;
                this.f19Code.write(Code2, I3 + 1, i6);
                i3 = I3 + i6 + 1;
                this.f19Code.write(Code2, i4, i5);
            }
            this.ac = size;
            this.ad = i2;
        }
        this.f45Z = null;
        this.f46Z = null;
        e.I(this.f30I.size() - 8, this.f30I.Code(), 4);
        int size2 = this.f16Code.size();
        this.al += (this.f30I.size() + size2) - 8;
        this.f36I = new byte[this.al];
        System.arraycopy(this.f16Code.Code(), 0, this.f36I, 0, size2);
        this.aj = size2;
        int i7 = 0;
        int i8 = size2;
        while (true) {
            int Z2 = e.Z(this.f30I.Code(), i7);
            int Z3 = e.Z(this.f30I.Code(), i7 + 4);
            System.arraycopy(this.f30I.Code(), i7 + 8, this.f36I, i8, Z3);
            i8 += Z3;
            if (Z2 < 0) {
                break;
            }
            i7 = Z2;
        }
        this.f16Code = null;
        this.f19Code = null;
        this.f30I = null;
        this.f31I = null;
        this.ak = this.al;
        this.m = Math.max(this.m, this.au);
        if (c()) {
            this.l = Math.min(this.l, j());
        }
        aa();
        this.f51Z[6] = this.aj;
        this.f51Z[7] = this.al;
        if (this.af >= 0) {
            m42Code(this.af);
        }
        if (this.ae > 0) {
            B(this.ae);
            int l2 = (this.e - (l() / 2)) + k;
            if (m7I(2)) {
                l2 = this.e == 4 ? 0 : this.e;
            }
            c(0, l2);
        }
        ae();
        if (this.ae <= 0) {
            this.ae = this.ac;
        }
        if (e.I(this.f21Code) == 165 && l() > 0) {
            m25B();
        }
        a(4);
        a(5);
    }

    private int l() {
        return this.f17Code != null ? this.f17Code.m235I() : this.aE;
    }

    /* renamed from: l  reason: collision with other method in class */
    private void m12l() {
        this.f32I = e.f259I;
        Code("o:a", "www.", Code.f115J, 49, Code.f98Code[54]);
        C(4);
        this.at += 6;
        while (e.q >= e.f234C.size()) {
            e.q--;
        }
        if (e.q >= 0) {
            Code("http://m.yahoo.com/opera/search?p=", (String) e.Code(e.f234C, e.q)[1], (byte[]) null, 129, Code.f98Code[54]);
        }
        C(4);
        if (e.ay && e.f261I.size() > 0) {
            C(2);
            Code(e.f261I, true, -1);
            R();
        }
        I(e.m122Code(7), e.m180I(90));
        Code((Object[]) null, new StringBuffer().append("feed:start//").append(System.currentTimeMillis()).toString(), e.m122Code(34), -7, false, false, false, -16777216);
        Code(e.f269J, true, -1);
        C(-4);
        m0B(4);
        C(8);
        if (e.ay) {
            Code(e.f230B, true, -1);
        }
        Code((Object[]) null, Code.f120Z ? "myopera:logout" : "myopera:login", Code.f120Z ? e.m124Code(177, Code.f117Z) : e.m122Code(178), -11, false, false, false, -16777216);
        if (Code.f118Z.size() > 0) {
            R();
            I(e.m122Code(16), e.m180I(86));
            a(true);
        }
        if (e.f277Y && !e.f287a.isEmpty()) {
            R();
            I(e.m122Code(146), e.m180I(136));
            Code(e.f287a, true, 3);
        }
    }

    private int m() {
        return (j() - this.ar) - this.as;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v40, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m  reason: collision with other method in class */
    private void m13m() {
        this.f14Code = 7;
        this.f3B = 23;
        this.f29I = 10;
        this.f7B = true;
        this.f32I = e.m122Code(9);
        this.au -= 5;
        I(e.m122Code(102), (String) null);
        Code(13, "a", e.aq);
        C(3);
        Code(new StringBuffer().append(e.m122Code(114)).append(":").toString(), 0, -16777216);
        int n2 = n();
        B("0", e.m122Code(115));
        B("1", e.m122Code(116));
        B("2", e.m122Code(117));
        U();
        this.at += 4;
        this.au -= 3;
        Code("c", String.valueOf(e.l), n2);
        C(8);
        C(3);
        Code(new StringBuffer().append(e.m122Code(79)).append(":").toString(), 0, -16777216);
        int n3 = n();
        B("0", e.m122Code(73));
        B("1", e.m122Code(74));
        B("2", e.m122Code(75));
        U();
        this.at += 4;
        this.au -= 3;
        Code("g", String.valueOf(e.m), n3);
        C(4);
        Code(89, "b", e.ar);
        if (e.n > 0) {
            Code(e.m122Code(214), "x", e.au);
        }
        I(e.m122Code(78), (String) null);
        if (e.z >= 0) {
            C(3);
            Code(new StringBuffer().append(e.m122Code(209)).append(":").toString(), 0, -16777216);
            int n4 = n();
            B("0", e.m122Code(213));
            B("1", e.m122Code(210));
            B("2", e.m122Code(211));
            B("3", e.m122Code(212));
            B("4", e.m122Code(243));
            U();
            this.at += 4;
            this.au -= 3;
            Code("y", String.valueOf(e.z), n4);
            C(6);
        }
        Code(new StringBuffer().append(e.m122Code(259)).append(":").toString(), 0, -16777216);
        this.at += 4;
        this.au -= 3;
        Code("mtc", Code.m > 0 ? String.valueOf(Code.m) : "", (byte[]) null, 16, -16777216, m() - this.at);
        C(6);
        J(new StringBuffer().append("sk:///l/").append(e.f325i).append("?version=").append(2).toString(), new StringBuffer().append(e.m122Code(138)).append("...").toString());
        C(5);
        Code(77, "d", e.ap);
        if (!e.aj) {
            Code(175, "m", e.M);
        }
        if (!e.f339o) {
            Code(107, "l", e.f273K);
        }
        Code(e.m122Code(118), "i", e.ax);
        if (e.e != 0) {
            String Code2 = e.m122Code(161);
            int i2 = e.f;
            Code(Code2, "u", ((i2 | (-i2)) >>> 31) ^ 1);
        }
        if (e.f261I.size() > 0 || e.f230B.size() > 0) {
            Code(e.m122Code(207), "z", e.ay);
        }
        if (!e.af) {
            Code(25, "e", e.aw);
            C(3);
            Code(e.m122Code(64), 0, -16777216);
            int n5 = n();
            Object Code3 = Code.Code(-1, true, (Calendar) null);
            int i3 = e.m129Code(false, false).get(12);
            Calendar Code4 = e.m129Code(false, false);
            Calendar Code5 = e.m129Code(true, false);
            int i4 = 0;
            int i5 = 0;
            while (i4 < 48) {
                String Code6 = Code.Code(i4 / 2, false, i3 >= 30 ? Code5 : Code4);
                B(String.valueOf(i4), Code6);
                int i6 = Code6.equals(Code3) ? i4 : i5;
                String Code7 = Code.Code(i4 / 2, false, i3 >= 30 ? Code4 : Code5);
                B(String.valueOf(i4 + 1), Code7);
                if (Code7.equals(Code3)) {
                    i6 = i4 + 1;
                }
                i4 += 2;
                i5 = i6;
            }
            U();
            this.at += 4;
            this.au -= 3;
            Code("k", String.valueOf(i5), n5);
            C(8);
        }
        I(e.m122Code(48), (String) null);
        C(3);
        Code(new StringBuffer().append(e.m122Code(50)).append(":").toString(), 0, -16777216);
        int n6 = n();
        if (!e.ad) {
            B("socket://", "Socket/HTTP");
        }
        B("http://", "HTTP");
        U();
        this.at += 4;
        this.au -= 3;
        Code("f", e.ae ? "http://" : "socket://", n6);
        C(6);
        J(e.m180I(142), new StringBuffer().append(e.m122Code(205)).append("...").toString());
        C(6);
        J(new StringBuffer().append("dialog:").append(e.m180I(33)).toString(), new StringBuffer().append(e.m122Code(97)).append("...").toString());
        C(6);
    }

    private int n() {
        this.ax = 0;
        this.ao = this.f16Code.size();
        e.Code(this.f19Code, 0);
        return this.ao;
    }

    /* renamed from: n  reason: collision with other method in class */
    private void m14n() {
        this.f14Code = 23;
        int i2 = -16777216;
        if (m7I(40)) {
            this.f29I = 10;
            i2 = Code.f98Code[44];
            this.at = this.ar;
        }
        this.f32I = e.m122Code(29);
        this.aq = 1;
        String Code2 = e.m126Code(this.f47Z, "a");
        String str = Code2 == null ? "#*" : Code2;
        this.f78u = false;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            for (int i4 = 0; i4 < 16; i4++) {
                char charAt2 = "1234567890#*↑↓←→".charAt(i4);
                String Code3 = e.m123Code((int) charAt, (int) charAt2, true);
                if (Code3 != null) {
                    this.f78u = true;
                    int B2 = e.B(1);
                    int Code4 = e.Code(1, String.valueOf(charAt));
                    int i5 = B2 + 2;
                    Code(this.at, this.au, i5, i5, Code.f98Code[26]);
                    this.at += i5;
                    Code(String.valueOf(charAt), 1, Code.f98Code[28], (this.at - (i5 / 2)) - (Code4 / 2), ((this.au + (i5 / 2)) - (B2 / 2)) - 1);
                    this.at++;
                    Code(this.at, this.au, i5, i5, Code.f98Code[26]);
                    this.at += i5;
                    Code(charAt2, Code.f98Code[28], this.at - (i5 / 2), (this.au + (i5 / 2)) - 1);
                    this.at += 2;
                    int i6 = this.ar;
                    this.ar = this.at;
                    Code(Code3, 0, i2);
                    this.ar = i6;
                    C(2);
                }
            }
        }
    }

    private int o() {
        this.aC += 4;
        return (this.f36I[this.aC - 4] << 24) + ((this.f36I[this.aC - 3] & 255) << 16) + ((this.f36I[this.aC - 2] & 255) << 8) + (this.f36I[this.aC - 1] & 255);
    }

    /* renamed from: o  reason: collision with other method in class */
    private void m15o() {
        this.f7B = true;
        this.f43J = true;
        this.f32I = e.m122Code(239);
        I(e.m122Code(67), (String) null);
        Code(Math.max(0L, e.C - e.f298b), Math.max(0L, e.f285a - e.f305c));
        J(e.m180I(164), new StringBuffer().append("[").append(e.m122Code(19)).append("]").toString());
        S();
        C(4);
        I(e.m122Code(68), (String) null);
        Code(e.C, e.f285a);
        J(e.m180I(104), new StringBuffer().append("[").append(e.m122Code(242)).append("]").toString());
        S();
        C(4);
    }

    private int p() {
        this.aC += 3;
        return ((this.f36I[this.aC - 3] & 255) << 16) + ((this.f36I[this.aC - 2] & 255) << 8) + (this.f36I[this.aC - 1] & 255);
    }

    /* renamed from: p  reason: collision with other method in class */
    private void m16p() {
        this.f14Code = 23;
        this.f32I = e.m122Code(45);
        B b2 = this.f17Code.f367Code;
        String str = b2.f21Code;
        if (!str.startsWith("<imgs>") && e.I(str) == -1) {
            this.f17Code.f388J = b2;
        }
        B b3 = this.f17Code.f388J;
        I(e.m122Code(81), (String) null);
        J(new StringBuffer().append("<imgs>").append(b3.f21Code).toString(), e.m122Code(80));
        C(5);
        I(e.m122Code(56), (String) null);
        Code(65, b3.f32I);
        Code(63, b3.f21Code);
        Code(58, e.Code((long) b3.am));
        Code(new StringBuffer().append(e.m122Code(57)).append(": ").toString(), 1, -16777216);
        if (b3.f25Code != null) {
            Code(Code(b3.f25Code), false, 1);
        } else {
            Code(e.m122Code(131), 0, -16777216);
        }
        C(5);
        I(e.m122Code(59), (String) null);
        if (b3.f52a < 2) {
            Code(60, e.m122Code(12));
            return;
        }
        Code(60, e.m122Code(11));
        if (b3.f27Code != null) {
            if (b3.f27Code[4].length() > 0) {
                Code(new StringBuffer().append(e.m122Code(94)).append(": ").toString(), 1, -16777216);
                Code(b3.f27Code[4], 0, -16777216);
                S();
            }
            Code(new StringBuffer().append(e.m122Code(119)).append(" ").toString(), 1, -16777216);
            Code(b3.f27Code[0], 0, -16777216);
            S();
            Code(new StringBuffer().append(e.m122Code(120)).append(" ").toString(), 1, -16777216);
            Code(b3.f27Code[6], 0, -16777216);
            S();
            Code(new StringBuffer().append(e.m122Code(121)).append(" ").toString(), 1, -16777216);
            Code(b3.f27Code[2], 0, -16777216);
            S();
            Code(new StringBuffer().append(e.m122Code(122)).append(" ").toString(), 1, -16777216);
            Code(b3.f27Code[3], 0, -16777216);
            S();
            S();
        }
    }

    private int q() {
        return (p() << 8) >> 8;
    }

    /* renamed from: q  reason: collision with other method in class */
    private void m17q() {
        if (!e.aA) {
            this.f14Code = 23;
            this.f29I = 14;
        }
        this.f7B = true;
        this.f43J = true;
        this.f32I = e.m122Code(37);
        Code(e.m122Code(83), 1, -16777216);
        C(5);
        String Code2 = e.m126Code(this.f47Z, "b");
        if (Code2 == null) {
            Code2 = e.m124Code(84, e.f299b);
        }
        Code(Code2, 0, -16777216);
        if (e.aA && !e.m122Code(87).equals(Code2)) {
            S();
            C(5);
            J(e.m180I(142), e.m122Code(205));
        }
        String str = this.f17Code.f372Code;
        if (str != null && e.aA) {
            S();
            C(5);
            J(str, e.m122Code(137));
        }
    }

    private int r() {
        int o2 = o();
        if (!this.f76s || (o2 >>> 24) == 254) {
            return o2;
        }
        return (16777215 - (o2 & 16777215)) | (-16777216 & o2);
    }

    /* renamed from: r  reason: collision with other method in class */
    private void m18r() {
        this.f43J = true;
        this.f7B = true;
        this.f32I = e.m122Code(189);
        Code(e.m122Code(189), 0, -16777216);
        if (e.f312e != null) {
            C(5);
            Code((byte) 87, e.f312e, e.f312e, false);
            Code(e.f312e, 0, Code.f98Code[53]);
            T();
        }
    }

    private int s() {
        this.aC += 2;
        return e.I(this.f36I, this.aC - 2);
    }

    /* renamed from: s  reason: collision with other method in class */
    private void m19s() {
        this.f43J = true;
        this.f7B = true;
        Q();
        Code(new StringBuffer().append(e.m122Code(144)).append(" ").append(e.m122Code(143)).toString(), 0, Code.f98Code[44]);
    }

    private int t() {
        byte[] bArr = this.f36I;
        int i2 = this.aC;
        this.aC = i2 + 1;
        return bArr[i2] & 255;
    }

    /* renamed from: t  reason: collision with other method in class */
    private void m20t() {
        this.f14Code = 1;
        this.f29I = 10;
        this.f68k = true;
        this.ar = 6;
        this.at = 6;
        this.as = 6;
        this.au = 4;
        this.f42J = new Vector();
    }

    private synchronized int u() {
        int i2 = 0;
        synchronized (this) {
            if (this.ae > 0) {
                this.aC = this.ac;
                while (this.aC < this.ae) {
                    i2++;
                    this.aC++;
                    this.aC = (t() * 10) + this.aC;
                    af();
                }
            }
        }
        return i2;
    }

    /* renamed from: u  reason: collision with other method in class */
    private void m21u() {
        m20t();
        e eVar = this.f17Code;
        while (eVar.m231Code(2)) {
            eVar = eVar.m236I();
        }
        if (eVar.f466e) {
            C(83, 5);
        }
        C(80, 39);
        B b2 = eVar.f367Code;
        if (eVar.m240I(1) || (e.at && eVar.f402Z != null)) {
            C(82, 32);
        }
        if (b2 != null && !b2.m49I()) {
            C(83, 5);
        }
        if (b2 == null || e.I(b2.f21Code) != 65) {
            C(65, 46);
        }
        Code("addTab:", 248);
        if (Code.I() > 1) {
            Code(new StringBuffer().append("bottomOverlay:").append(e.m180I(165)).toString(), 256);
        }
        C(90, 7);
        Code(67, 36, true, false, false);
        C(79, 10);
        m5I(0);
    }

    private int v() {
        while (this.aC <= this.ad) {
            int i2 = this.aC;
            t();
            int t2 = t();
            Y();
            this.aC = ((t2 * 10) - 10) + this.aC;
            af();
            if (this.f36I[i2] != 105 && (this.f51Z[(I(this.e, 0) * 6) + 4] & 1) != 0) {
                return i2;
            }
        }
        return this.aC;
    }

    /* renamed from: v  reason: collision with other method in class */
    private void m22v() {
        Vector vector;
        int i2;
        int i3;
        m20t();
        int B2 = Code.m73Code(1).B();
        int I2 = e.I(this.f17Code.m236I().f367Code.f21Code);
        if (I2 == 109) {
            vector = e.f234C;
            i2 = 1;
            i3 = 56;
        } else if (I2 == 90) {
            vector = e.f282Z;
            i2 = 0;
            i3 = 0;
        } else if (I2 == 136) {
            vector = e.f287a;
            i2 = 0;
            i3 = -40;
        } else {
            boolean z2 = B2 < 0 || e.m159Code(e.Code(e.f269J, B2));
            Code(52, 15, false, true, B2 < 0);
            Code(50, 19, false, true, z2);
            m5I(0);
            return;
        }
        boolean z3 = B2 < i2 || e.m160Code(e.Code(vector, B2), 2);
        if (vector != e.f287a) {
            Code(100 - i3, 44, false, true, false);
        }
        Code(101 - i3, 15, false, true, z3);
        Code(99 - i3, 14, false, true, z3);
        Code(97 - i3, 30, false, false, B2 <= i2);
        Code(98 - i3, 31, false, false, B2 == vector.size() + -1 || B2 < i2);
        if (vector == e.f287a) {
            Code(e.m180I(140), 156);
        }
        if (i3 == 0) {
            Code(49, 90, false, false, !Code.f120Z);
        }
        m5I(0);
    }

    private int w() {
        this.aC++;
        this.aC = (t() * 10) + this.aC;
        int i2 = this.aC;
        this.f9C = B();
        return i2;
    }

    /* renamed from: w  reason: collision with other method in class */
    private void m23w() {
        m20t();
        e eVar = this.f17Code;
        while (eVar.m231Code(2)) {
            eVar = eVar.m236I();
        }
        B b2 = eVar.f367Code;
        if (b2 != null && !b2.m49I()) {
            C(77, 45);
            Code(89, 8, false, true, false);
            if (b2.f55a) {
                C(63, 208);
            }
            C(127, 141);
            if (e.f277Y && !b2.f12C) {
                C(134, 145);
            }
        }
        C(86, 16);
        C(73, 9);
        C(163, 239);
        C(74, 35);
        m5I(0);
    }

    private void x() {
        m20t();
        C(113, 160);
        C(129, 1);
        m5I(0);
    }

    private void y() {
        int i2;
        m20t();
        int i3 = 0;
        B b2 = this.f17Code.m236I().f367Code;
        String I2 = b2.m46I();
        int i4 = 0;
        if (!b2.m49I()) {
            i4 = 15;
            this.at += 15;
        }
        if (Code(this.f17Code.m236I(), I2)) {
            Code(new StringBuffer().append("openNewTab:").append(I2).toString(), 251);
            Code(new StringBuffer().append("openNewTab:openBackgroud:").append(I2).toString(), 252);
        }
        int B2 = this.f17Code.m236I().B();
        if (e.m188I(I2, "bookmark:")) {
            Code(101, 15, false, true, false);
            Code(99, 14, false, true, false);
            i2 = 0;
        } else if (e.m188I(I2, "speeddial:")) {
            boolean z2 = B2 < 0 || e.m159Code(e.Code(e.f269J, B2));
            Code(52, 15, false, true, false);
            Code(50, 19, false, true, z2);
            i2 = 0;
        } else if (e.m188I(I2, "search:")) {
            Code(45, 15, false, true, B2 <= 0);
            Code(43, 14, false, true, B2 <= 0);
            i2 = 0;
        } else {
            if (!b2.m49I()) {
                i3 = 12;
                int i5 = this.au;
                int i6 = this.at;
                this.at -= i4;
                this.au += (((Math.max(e.B(0), 12) + 6) * this.f42J.size()) / 2) + 3;
                Code("fittoscreen", "on", (b2.f66i ? 1 : 0) << 1, 0, false, true);
                this.at = i6;
                this.au = i5;
                Code(new StringBuffer().append(e.ar == b2.f66i ? "tssr:" : "").append(e.m180I(83)).toString(), e.m122Code(89));
                if (!b2.f65h) {
                    Code(new StringBuffer().append(e.aq ? "" : "timg:").append(e.m180I(83)).toString(), e.m122Code(13));
                }
                C(83, 5);
                C(77, 94);
                if (I2 != null) {
                    Code(124, 95, true, false, false);
                }
                int Code2 = b2.Code(b2.O, b2.P, 1, 1, 0, true);
                if (Code2 != 0) {
                    Code(b2.m1Code(Code2, 105), e.m122Code(103));
                }
            }
            i2 = i3;
        }
        m5I(i2);
    }

    private void z() {
        m20t();
        e eVar = this.f17Code;
        while (eVar.m231Code(2)) {
            eVar = eVar.m236I();
        }
        String I2 = eVar.f367Code.m46I();
        this.f21Code = eVar.f367Code.f21Code;
        this.f32I = eVar.f367Code.f32I;
        this.f25Code = eVar.f367Code.f25Code;
        Code(I2, e.m122Code(91));
        Code(new StringBuffer().append("timg:").append(I2).toString(), e.m122Code((e.aq ? 1 : 0) + 92));
        Code(new StringBuffer().append("overlay:").append(e.m180I(37)).toString(), 94);
        m5I(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B  reason: collision with other method in class */
    public final int m24B() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B  reason: collision with other method in class */
    public final void m25B() {
        if (this.ae >= this.ac && this.ae <= this.ad) {
            B(this.ae);
            if (this.e >= 0) {
                int i2 = this.d;
                int i3 = this.e;
                int i4 = this.f;
                int i5 = this.g;
                m66e();
                b(-I(this.n), -I(this.o));
                if (!e.I(0, 0, k(), l(), this.d, this.e, this.f, this.g)) {
                    Code(((i4 / 2) + i2) - this.O, ((i5 / 2) + i3) - this.P, false);
                }
                m66e();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0313  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(int r19, int r20) {
        /*
        // Method dump skipped, instructions count: 867
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.B.B(int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    public final synchronized void B(boolean z2) {
        int i2;
        if (this.ae > 0 && this.f17Code != null && this.f17Code.f380I == null && !this.f64g && (!e.f277Y || Code.f91Code.f198Code < 0)) {
            if (!m62b()) {
                b(z2);
                this.aC = this.ae;
                this.b = this.f36I[this.aC];
                this.f9C = null;
                int w2 = w();
                switch (this.b) {
                    case 42:
                    case 76:
                        this.f17Code.Code(C(), this.f21Code, m31Code(), this.f33I);
                        break;
                    case 67:
                        ac();
                        this.ae = Code(this.O, this.P, 1, 1, 0, false);
                        break;
                    case 73:
                        this.aC += 2;
                        this.aC = p();
                        this.aC += 15;
                        this.b = t();
                        int t2 = t();
                        this.f4B = B();
                        String B2 = B();
                        if ((t2 & 8) != 0) {
                            B2 = "";
                        }
                        String str = (String) this.f22Code.get(this.f4B);
                        if (!this.f4B.equals("http://m.yahoo.com/opera/search?p=")) {
                            if (!this.f4B.equals("$")) {
                                String str2 = str == null ? B2 : str;
                                switch (t2 & 48) {
                                    case 16:
                                        i2 = 2;
                                        break;
                                    case 32:
                                        i2 = 3;
                                        break;
                                    case 48:
                                        i2 = 4;
                                        break;
                                    default:
                                        i2 = 0;
                                        break;
                                }
                                this.f75r = t2 & 1;
                                switch (this.b) {
                                    case 97:
                                        Code.Code((String) null, str2, 0, false);
                                        break;
                                    case 99:
                                        m43Code(str != null ? null : B2, false);
                                        break;
                                    case 102:
                                        this.f17Code.Code(true, this.f21Code, "s=0");
                                        break;
                                    case 112:
                                        if (!e.f353x) {
                                            Code.Code((String) null, str2, 65536 | i2, false);
                                            break;
                                        } else {
                                            Code.Code((String) null, str2, i2, false);
                                            break;
                                        }
                                    case 114:
                                        m43Code(B2, false);
                                        break;
                                    case 115:
                                        StringBuffer stringBuffer = new StringBuffer();
                                        e.Code(stringBuffer.append("a="), str2);
                                        stringBuffer.append("&b=").append(t2 & 4);
                                        this.ao = p();
                                        this.f17Code.m229Code(new StringBuffer().append("dialog:").append(e.m180I(112)).toString(), this.f21Code, stringBuffer.toString());
                                        break;
                                    case 120:
                                        if (i2 == 4) {
                                            if (e.c() != 0 && e.I(this.f21Code) == 65) {
                                                this.f17Code.m250b();
                                                Code.f89Code.Code("", (String) null, 16, this.f17Code);
                                                break;
                                            } else {
                                                Code.f89Code.J(str2);
                                                break;
                                            }
                                        } else {
                                            Code.Code((String) null, str2, i2, this.f9C != null && this.f9C.length() > 0);
                                            break;
                                        }
                                        break;
                                }
                            } else {
                                Code.f89Code.Code(this.f17Code, new StringBuffer().append("dialog:").append(e.m180I(54)).toString());
                                break;
                            }
                        } else {
                            Code.f89Code.Code(this.f17Code, e.m180I(109));
                            break;
                        }
                        break;
                    case 78:
                        this.aC += 2;
                        this.f17Code.Code(s(), p(), B());
                        break;
                    case 80:
                    case 87:
                    case 105:
                        String C2 = C();
                        I i3 = new I(6);
                        i3.f191Code = C2;
                        e.Code((Runnable) i3);
                        break;
                    case 83:
                        this.f4B = B();
                        this.f75r = true;
                        this.aC = w2;
                        m43Code(B(), true);
                        break;
                    case 119:
                        if (e.f277Y) {
                            this.f64g = true;
                            new C(this, C()).start();
                            break;
                        }
                        String C22 = C();
                        I i32 = new I(6);
                        i32.f191Code = C22;
                        e.Code((Runnable) i32);
                        break;
                }
            } else if (!z2) {
                C(!e.aE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B  reason: collision with other method in class */
    public final boolean m26B() {
        return m58Z() && this.r == this.s && this.P >= this.L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C  reason: collision with other method in class */
    public final int m27C() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C  reason: collision with other method in class */
    public final void m28C() {
        a(7);
        V();
    }

    /* access modifiers changed from: package-private */
    public final void C(boolean z2) {
        e.aE = z2;
        ag();
        Code.Code(148, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C  reason: collision with other method in class */
    public final synchronized boolean m29C() {
        boolean z2 = false;
        synchronized (this) {
            if (this.ae != 0 && this.f36I[this.ae] == 73) {
                int i2 = this.aC;
                this.aC = this.ae;
                w();
                this.aC += 2;
                this.aC = p();
                this.aC += 15;
                int t2 = t();
                this.aC = i2;
                if (t2 == 120 || t2 == 97 || t2 == 112 || t2 == 102 || t2 == 115) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    public final int Code() {
        if (this.f8C == 2) {
            return 4375;
        }
        return this.am;
    }

    public final int Code(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        this.f17Code.f460d = str;
        String lowerCase = str.toLowerCase();
        this.f11C = new Vector();
        this.aC = this.aj;
        while (this.aC < this.f36I.length) {
            int t2 = t();
            if (t2 == 84 || t2 == 66 || t2 == 73 || t2 == 70) {
                Y();
            }
            if (t2 == 84) {
                int i2 = this.aC;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                this.aC += 4;
                int Z2 = e.Z(t());
                String B2 = B();
                String lowerCase2 = B2.toLowerCase();
                if (lowerCase2.indexOf(lowerCase) != -1) {
                    for (int i7 = 0; i7 < B2.length(); i7++) {
                        if (B2.charAt(i7) == '\n') {
                            i6++;
                        }
                    }
                    for (int i8 = 0; i8 < lowerCase2.length(); i8++) {
                        if (lowerCase2.charAt(i8) == '\n') {
                            i3 = i8 + 1;
                            i5++;
                            i4 = 0;
                        } else {
                            int i9 = (i4 >= lowerCase.length() || lowerCase2.charAt(i8) != lowerCase.charAt(i4)) ? 0 : i4 + 1;
                            if (i9 == lowerCase.length()) {
                                int Code2 = e.Code(Z2, B2.substring(i3, (i8 - lowerCase.length()) + 1));
                                int[] iArr = {Code2, (this.g / (i6 + 1)) * i5, e.Code(Z2, B2.substring(i3, i8 + 1)) - Code2, this.g / (i6 + 1), this.d, this.e, i2};
                                int i10 = iArr[1] + iArr[5];
                                int size = this.f11C.size() - 1;
                                while (size >= 0) {
                                    int[] iArr2 = (int[]) this.f11C.elementAt(size);
                                    if (i10 >= iArr2[5] + iArr2[1]) {
                                        break;
                                    }
                                    size--;
                                }
                                this.f11C.insertElementAt(iArr, size + 1);
                                i4 = 0;
                            } else {
                                i4 = i9;
                            }
                        }
                    }
                }
            } else {
                b(t2);
            }
        }
        this.f10C = new Hashtable();
        for (int i11 = 0; i11 < this.f11C.size(); i11++) {
            Integer num = new Integer(((int[]) this.f11C.elementAt(i11))[6]);
            int[] iArr3 = {i11};
            if (this.f10C.containsKey(num)) {
                int[] iArr4 = (int[]) this.f10C.get(num);
                int[] iArr5 = new int[(iArr4.length + 1)];
                iArr5[iArr4.length] = i11;
                System.arraycopy(iArr4, 0, iArr5, 0, iArr4.length);
                iArr3 = iArr5;
            }
            this.f10C.put(num, iArr3);
        }
        return this.f11C.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final e m30Code() {
        return this.f17Code;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final synchronized String m31Code() {
        StringBuffer stringBuffer;
        stringBuffer = new StringBuffer();
        if (m7I(1)) {
            StringBuffer append = stringBuffer.append("x=").append(String.valueOf(this.O)).append("&y=");
            int i2 = this.P;
            int I2 = I(i2, 5);
            append.append(String.valueOf((i2 + this.f51Z[I2 * 6]) - this.f51Z[(I2 * 6) + 5]));
        }
        Enumeration keys = this.f22Code.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            if (!str.startsWith("o:")) {
                e.Code(stringBuffer.append("&"), str);
                e.Code(stringBuffer.append("="), this.f22Code.get(str).toString());
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: Code  reason: collision with other method in class */
    public final String m32Code(int i2) {
        int i3;
        if (this.f54a == null || this.f54a.size() <= 0) {
            return null;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.f54a.size()) {
                break;
            } else if (((int[]) this.f54a.elementAt(i4))[4] == i2) {
                i2 = i4;
                break;
            } else {
                i4++;
            }
        }
        int Z2 = Z(k());
        int Z3 = Z(l());
        int i5 = this.aC;
        this.aC = this.ac;
        int i6 = 0;
        while (this.aC <= this.ad) {
            int t2 = t();
            int t3 = t();
            if (t2 == 76) {
                int i7 = 0;
                int i8 = i6;
                while (i7 < t3) {
                    Y();
                    if (!e.Code(this.n, this.o, Z2, Z3, this.d, this.e, this.f, this.g)) {
                        i3 = i8;
                    } else if (i2 == i8) {
                        this.aC -= ((i7 + 1) * 10) + 2;
                        w();
                        String C2 = C();
                        this.aC = i5;
                        return C2;
                    } else {
                        i3 = i8 + 1;
                    }
                    i7++;
                    i8 = i3;
                }
                i6 = i8;
            } else {
                this.aC += t3 * 10;
            }
            af();
        }
        this.aC = i5;
        return null;
    }

    /* renamed from: Code  reason: collision with other method in class */
    public final Vector m33Code() {
        int i2;
        int i3;
        int J2;
        if (this.ac <= 0 || this.ad <= 0) {
            return null;
        }
        int Z2 = Z(k());
        int Z3 = Z(l());
        if (this.n == this.aQ && this.o == this.aR && Z2 == this.aS && Z3 == this.aT && !this.f77t) {
            return this.f54a;
        }
        if (this.f54a == null) {
            this.f54a = new Vector();
        } else {
            this.f54a.removeAllElements();
        }
        this.f77t = false;
        this.aQ = this.n;
        this.aR = this.o;
        this.aS = Z2;
        this.aT = Z3;
        int i4 = this.aC;
        this.aC = this.ac;
        Vector vector = !e.ar ? new Vector() : null;
        int Code2 = e.Code(e.m, "M") * 3;
        int i5 = 0;
        while (this.aC <= this.ad) {
            int t2 = t();
            int t3 = t();
            if (t2 == 76 || t2 == 67 || t2 == 42 || t2 == 78 || t2 == 87 || t2 == 119 || t2 == 80 || t2 == 73 || t2 == 83) {
                int i6 = 0;
                int i7 = 0;
                int i8 = i5;
                while (i7 < t3) {
                    Y();
                    if (i6 > 0 || (J2 = J(this.e)) < 0 || !e.Code(this.n, this.o, Z2, Z3, this.d, J2, this.f, this.g)) {
                        i2 = i6;
                        i3 = i8;
                    } else {
                        int i9 = i6 + 1;
                        int i10 = this.d - this.n;
                        int i11 = J2 - this.o;
                        if (i10 < 0 || this.f + i10 > k() || i11 < 0 || this.g + i11 > l()) {
                            int i12 = (this.g * 70) / 100;
                            if ((i11 < 0 && this.g + i11 < i12) || ((this.g + i11 > l() && l() - i11 < i12) || ((i10 < 0 && this.f + i10 < Code2) || (this.f + i10 > k() && k() - i10 < Code2)))) {
                                i2 = i9;
                                i3 = i8;
                            }
                        }
                        int[] iArr = {this.d - this.n, J2 - this.o, this.f, this.g, i8};
                        this.f54a.addElement(iArr);
                        if (vector != null) {
                            int[] iArr2 = new int[2];
                            iArr2[0] = i8;
                            iArr2[1] = (iArr[0] < 0 ? 0 : iArr[0]) + ((iArr[1] < 0 ? 0 : iArr[1]) * Z2);
                            vector.addElement(iArr2);
                        }
                        i3 = i8 + 1;
                        i2 = i9;
                    }
                    i7++;
                    i6 = i2;
                    i8 = i3;
                }
                i5 = i8;
            } else {
                this.aC += t3 * 10;
            }
            af();
        }
        this.aC = i4;
        J(vector);
        return this.f54a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final Image m34Code() {
        if ((this.f23Code == null || this.f23Code.getHeight() != Code.d) && this.f25Code != null) {
            Object[] objArr = new Object[3];
            e.Code(this.f25Code, 0, this.f25Code.length, 256, objArr);
            if (objArr[0] != null) {
                if (((Integer) objArr[2]).intValue() != Code.d) {
                    objArr[0] = e.Code((int[]) objArr[0], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue(), Code.d, 1, true);
                    objArr[1] = new Integer(Code.d);
                    objArr[2] = new Integer(Code.d);
                }
                this.f23Code = e.m138Code(objArr, Code.f89Code.f158I, -((Code.c - Code.d) / 2));
            }
        }
        return this.f23Code;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final void m35Code() {
        this.f26Code[0] = this.p;
        this.f26Code[1] = this.q;
        this.f26Code[2] = this.O;
        this.f26Code[3] = this.P;
        this.f26Code[4] = m58Z() ? 1 : 0;
        this.f26Code[5] = u();
        this.f38I[0] = this.f21Code;
        this.f38I[1] = this.f32I;
        this.f38I[2] = this.f25Code;
        this.f38I[3] = this.f47Z;
        this.f38I[4] = this.f56b;
        this.f38I[7] = this.f26Code;
        if (m49I() && (this.f36I[this.ae] == 76 || this.f36I[this.ae] == 42)) {
            int i2 = this.ae + 1;
            int i3 = ((this.f36I[i2] & 255) * 10) + i2 + 1;
            this.f38I[9] = e.m127Code(this.f36I, i3 + e.I(this.f36I, i3) + 2);
        }
        if (!this.f67j) {
            this.f38I[8] = this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final synchronized void m36Code(int i2) {
        if (i2 > 0) {
            this.f48Z.clear();
        } else if (i2 >= 0) {
            Hashtable hashtable = new Hashtable();
            Enumeration keys = this.f5B.keys();
            while (keys.hasMoreElements()) {
                Integer num = (Integer) keys.nextElement();
                Integer num2 = (Integer) this.f5B.get(num);
                if (this.f48Z.containsKey(num2) && Code(num.intValue(), false, true, 1000)) {
                    hashtable.put(num2, this.f48Z.get(num2));
                }
            }
            this.f48Z = hashtable;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final void m37Code(int i2, int i3) {
        this.d = this.z;
        this.e = J(this.A);
        this.f = this.D;
        this.g = this.E;
        if (this.D > 0 && this.E > 0) {
            b(i2, i3);
            this.e += this.L - I(this.L);
            if (this.e < this.L) {
                this.e = 0;
                this.g += this.L;
                this.f += this.D;
            }
        }
        this.D = 0;
        this.E = 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0080 A[EDGE_INSN: B:140:0x0080->B:36:0x0080 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0101 A[LOOP:0: B:29:0x0067->B:79:0x0101, LOOP_END] */
    /* renamed from: Code  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m38Code(int r13, int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 616
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.B.m38Code(int, int, int):void");
    }

    /* access modifiers changed from: package-private */
    public final void Code(int i2, int i3, boolean z2, boolean z3) {
        if (!m58Z() || !z2) {
            if (z3) {
                Code.f89Code.I(true);
            }
            if (i2 != 0) {
                i2 = I(this.p, this.q, i2);
            }
            this.O -= this.p;
            this.P -= this.q;
            c(this.p + i2, Code(this.q, i3, this.r));
            this.O += this.p;
            this.P += this.q;
            return;
        }
        if (this.P >= this.L && this.P + i3 < this.L) {
            this.O = I(this.O);
        } else if (this.P < this.L && this.P + i3 >= this.L) {
            this.O = Z(this.O);
        }
        Code(i2, i3, false);
    }

    /* access modifiers changed from: package-private */
    public final void Code(e eVar) {
        if (eVar == null && this.f17Code != null) {
            this.aF = this.f17Code.m244Z();
            this.aG = this.f17Code.m241J();
            this.aD = this.f17Code.m222Code();
            this.aE = this.f17Code.m235I();
        }
        this.f17Code = eVar;
        if (this.f17Code != null) {
            this.aH = this.f17Code.f365Code;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final void m39Code(String str) {
        this.f12C = true;
        e.Code((Runnable) new e(this, str));
    }

    /* access modifiers changed from: package-private */
    public final void Code(String str, int i2, Object obj) {
        if (this.f33I == null) {
            this.f33I = new Hashtable();
        }
        this.f33I.put(this.f4B, new Object[]{str, new Integer(i2), obj});
        m43Code(str, false);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0213 A[Catch:{ IOException -> 0x00bc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Code(java.lang.String r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 1248
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.B.Code(java.lang.String, boolean):void");
    }

    public final void Code(Vector vector) {
        Object[] objArr;
        Integer num;
        if (this.f22Code.get("a") != null) {
            f1Code[1] = this.f22Code.get("a");
        }
        if (this.f22Code.get("b") != null) {
            f1Code[0] = this.f22Code.get("b");
        }
        if (((String) f1Code[1]).length() == 0) {
            f1Code[1] = e.m122Code(72);
        }
        String Code2 = e.m126Code(m31Code(), "s");
        Object[] Code3 = c == -1 ? null : e.Code(vector, c);
        if (Code3 == null || !Code3[1].equals(f1Code[1]) || !Code3[0].equals(f1Code[0]) || !(((Code3[2] == null && f1Code[2] == null) || ((Code3[2] != null && Code3[2].equals(f1Code[2])) || (f1Code[2] != null && f1Code[2].equals(Code3[2])))) && vector == e.f287a && Code2 == null)) {
            if (vector == e.f269J) {
                int Code4 = e.Code(Code3, 5);
                if (Code4 == 97 || (Code4 == 83 && e.m159Code(Code3))) {
                    objArr = f1Code;
                    num = new Integer(97);
                } else {
                    objArr = f1Code;
                    num = new Integer(65);
                }
                objArr[5] = num;
                f1Code[6] = new Integer(28);
            } else if (!(e.Code(f1Code, 5) == 97 || vector == e.f287a)) {
                f1Code[5] = new Integer(77);
                f1Code[6] = new Integer(31);
            }
            if (Code2 != null && vector == e.f287a) {
                e.f287a.removeElementAt(c);
                e.f287a.insertElementAt(f1Code, 0);
                e.Code(e.f287a, true);
                Code.f89Code.Code(e.f287a);
            } else if (c == -1) {
                e.Code(vector, f1Code);
            } else {
                e.Code(vector, f1Code, c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void Code(Graphics graphics, int i2, int i3) {
        int i4 = this.r;
        if (this.P < this.L || this.ab != 0) {
            this.r = 256;
        }
        if (m7I(2)) {
            this.f76s = (Code.f98Code[36] & 255) > 127;
            Code(graphics, i2, i3, Code.f98Code[8], Code.f98Code[9], 0, true, false);
            this.f76s = false;
        } else if (this.f63f && m7I(40)) {
            Code(graphics, i2, i3, Code.f98Code[46], 0, true);
        } else if (Code.Code(e.m180I(66)) == null && (this.f63f || this.ab > 0 || c() || (!m58Z() && Code.Code(this) && !Code.f89Code.m97Z()))) {
            if (this.f36I[this.ae] == 42) {
                Code(graphics, i2, i3, Code.f98Code[11], Code.f98Code[12], -16777216, true, true);
            } else {
                Code(graphics, i2, i3, this.f36I[this.ae] == 73 ? 0 : 687865856 | (Code.f98Code[21] & 16777215), -16777216 | Code.f98Code[21], false);
            }
        }
        this.r = i4;
    }

    /* access modifiers changed from: package-private */
    public final void Code(boolean z2) {
        if (m41Code()) {
            if (z2) {
                this.f20Code = null;
            }
            if (this.f20Code == null) {
                I((Integer) null, (Image) null);
                return;
            }
            I.f177Code = true;
            I(this.f20Code, Code(this.f20Code));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final void m40Code(Object[] objArr) {
        this.f38I = objArr;
        this.f21Code = (String) objArr[0];
        this.f32I = (String) objArr[1];
        this.f25Code = (byte[]) objArr[2];
        this.f47Z = (String) objArr[3];
        if (objArr.length > 4) {
            this.f56b = (String) objArr[4];
            this.f26Code = (int[]) objArr[7];
            if (this.f26Code != null) {
                if (this.f24Code || e.I(this.f21Code) == 65) {
                    this.p = this.f26Code[0];
                    this.q = this.f26Code[1];
                    this.af = this.f26Code[5];
                }
                c(this.f26Code[0], this.f26Code[1]);
                this.O = this.f26Code[2];
                this.P = this.f26Code[3];
                return;
            }
            this.f26Code = new int[6];
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final boolean m41Code() {
        return this.f17Code != null && this.f17Code.f367Code == this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final boolean m42Code(int i2) {
        if (this.ac <= 0 || this.ad <= 0) {
            return false;
        }
        this.aC = this.ac;
        int i3 = 0;
        while (this.aC <= this.ad) {
            if (i3 == i2) {
                this.ae = this.aC;
                return true;
            }
            i3++;
            this.aC++;
            this.aC = (t() * 10) + this.aC;
            af();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean Code(int i2, boolean z2, boolean z3, int i3) {
        boolean z4;
        int i4 = i2 & 536870911;
        int i5 = this.d;
        int i6 = this.e;
        int i7 = this.f;
        int i8 = this.g;
        int i9 = this.aC;
        int i10 = this.r;
        int i11 = this.n;
        int i12 = this.o;
        if (z3) {
            this.r = (k() * 256) / this.l;
            this.n = e.Code(this.n, 0, this.l - ((k() << 8) / this.r));
            this.o = e.Code(this.o, 0, this.m - ((l() << 8) / this.r));
        }
        this.aC = i4;
        Y();
        this.e = J(this.e);
        z4 = false;
        if (this.e >= 0) {
            b(-I(this.n), -I(this.o));
            z4 = e.Code(this.d, this.e, this.f, this.g, 0, 0, k(), l());
            if (z4 && z2) {
                int i13 = this.d;
                int i14 = this.e;
                int i15 = this.f;
                int i16 = this.g;
                this.aC = i4;
                Y();
                I(this.d, this.e, this.f, this.g);
                if (i3 > 0) {
                    c(i3);
                } else if (this.D > 0 && this.f17Code != null) {
                    this.f17Code.Code(i13, i14, i15, i16);
                }
            }
        }
        this.d = i5;
        this.e = i6;
        this.f = i7;
        this.g = i8;
        this.aC = i9;
        this.r = i10;
        this.n = i11;
        this.o = i12;
        return z4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final boolean m43Code(String str, boolean z2) {
        if (this.f4B == null) {
            return false;
        }
        String str2 = this.f4B;
        this.f4B = null;
        this.f74q |= "u".equals(str2);
        if (str == null) {
            this.f22Code.remove(str2);
        } else {
            this.f22Code.put(str2, str);
        }
        ad();
        if (!this.f75r || this.f17Code == null) {
            return true;
        }
        String str3 = this.f21Code;
        String str4 = "";
        if (str2.equals("o:a")) {
            Code.f89Code.Z(str);
            return true;
        }
        switch (e.I(str3)) {
            case 65:
            case 118:
                str3 = new StringBuffer().append(str2).append(str).toString();
                break;
            default:
                str4 = m31Code();
                break;
        }
        if (z2) {
            this.f22Code.remove(str2);
        }
        this.f17Code.Code(str3, this.f21Code, str4, this.f33I);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final boolean m44Code(boolean z2) {
        if (this.f17Code == null || m7I(2) || this.f17Code.f380I != null || this.f21Code == null || this.f21Code.startsWith("myopera:") || this.f21Code.startsWith("sk:") || this.f21Code.startsWith("server:") || ((m49I() && ((e.I(this.f21Code) != 90 || !e.m188I(m1Code(this.ae, 76), "bookmark:")) && ((e.I(this.f21Code) != 91 || !e.m188I(m1Code(this.ae, 76), "speeddial:")) && ((e.I(this.f21Code) != 109 || !e.m188I(m1Code(this.ae, 76), "search:")) && !Code(this.f17Code, m1Code(this.ae, 76)))))) || !e.aA)) {
            return false;
        }
        b(z2);
        this.f17Code.m229Code(new StringBuffer().append("menu:").append(e.m180I(123)).toString(), (String) null, (String) null);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final Object[] m45Code() {
        m35Code();
        return this.f38I;
    }

    /* access modifiers changed from: package-private */
    public final int I() {
        if (this.f8C != 2) {
            return (this.am / 3) + ((Z() << 1) / 3);
        }
        this.aJ = Math.min(this.aJ + Math.max(((this.aI * 10) - this.aJ) / 5, 0) + 4, 1000);
        return this.aJ + 250;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I  reason: collision with other method in class */
    public final synchronized String m46I() {
        String str = null;
        synchronized (this) {
            if (this.ae > 0) {
                this.aC = this.ae;
                byte b2 = this.f36I[this.aC];
                w();
                if (b2 == 76 || b2 == 42) {
                    str = C();
                }
            }
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I  reason: collision with other method in class */
    public final void m47I() {
        if (this.f26Code != null) {
            if (this.f24Code) {
                this.p = this.f26Code[0];
                this.q = this.f26Code[1];
                this.af = this.f26Code[5];
            }
            c(this.f26Code[0], this.f26Code[1]);
            this.O = this.f26Code[2];
            this.P = this.f26Code[3];
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I  reason: collision with other method in class */
    public final void m48I(int i2, int i3) {
        if (i3 != 0) {
            Code(0, (((b() - l()) * i2) / i3) - d(), false, false);
            this.o = this.q;
        }
    }

    /* access modifiers changed from: package-private */
    public final void I(Graphics graphics, int i2, int i3) {
        char c2;
        if (m26B()) {
            int k2 = k();
            int l2 = l();
            int Code2 = e.Code(this.P - (l2 / 2), this.L, this.m - l2);
            int I2 = i2 + I(e.Code(J(Z(this.O, Code2), this.O - (k2 / 2)), 0, this.l - k2));
            int I3 = this.o < this.L ? ((I(Code2 - this.L) + i3) - this.o) + this.L : I(Code2 - this.o) + i3;
            int I4 = I(k2) - 1;
            int I5 = I(l2) - 1;
            if (!e.f348t || f2Code[5] == null) {
                graphics.setColor(0);
                graphics.drawRect(I2, I3, I4, I5);
                graphics.setColor(16777215);
                graphics.drawRect(I2 + 1, I3 + 1, I4 - 2, I5 - 2);
                c2 = 2;
            } else {
                int I6 = I(k());
                int I7 = I(l());
                int i4 = I6 > 9 ? I6 - 9 : 1;
                int i5 = I7 > 9 ? I7 - 9 : 1;
                int i6 = I6 > 9 ? 30 : I6 + 21;
                int i7 = I7 > 9 ? 30 : I7 + 21;
                e.I(graphics, I2 - 21, I3 - 21, i6, i7);
                graphics.drawImage(f2Code[5], I2 - 21, I3 - 21, 0);
                e.Z(graphics);
                e.I(graphics, I2 + i4, I3 - 21, 30, i7);
                graphics.drawImage(f2Code[5], (I2 + I6) - 59, I3 - 21, 0);
                e.Z(graphics);
                e.I(graphics, I2 - 21, I3 + i5, i6, 30);
                graphics.drawImage(f2Code[5], I2 - 21, (I3 + I7) - 63, 0);
                e.Z(graphics);
                e.I(graphics, I2 + i4, I3 + i5, 30, 30);
                graphics.drawImage(f2Code[5], (I2 + I6) - 59, (I3 + I7) - 63, 0);
                e.Z(graphics);
                if (i4 > 1) {
                    int i8 = (I6 - 18) / 19;
                    if (i8 > 0) {
                        for (int i9 = 0; i9 < i8; i9++) {
                            e.I(graphics, I2 + 9 + (i9 * 19), I3 - 21, 19, 30);
                            graphics.drawImage(f2Code[5], (I2 - 21) + (i9 * 19), I3 - 21, 0);
                            e.Z(graphics);
                            e.I(graphics, I2 + 9 + (i9 * 19), (I3 + I7) - 9, 19, 30);
                            graphics.drawImage(f2Code[5], (I2 - 21) + (i9 * 19), (I3 + I7) - 63, 0);
                            e.Z(graphics);
                        }
                    }
                    int i10 = (I6 - 18) - (i8 * 19);
                    if (i10 > 0) {
                        e.I(graphics, I2 + 9 + (i8 * 19), I3 - 21, i10, 30);
                        graphics.drawImage(f2Code[5], (I2 - 21) + (i8 * 19), I3 - 21, 0);
                        e.Z(graphics);
                        e.I(graphics, I2 + 9 + (i8 * 19), (I3 + I7) - 9, i10, 30);
                        graphics.drawImage(f2Code[5], (i8 * 19) + (I2 - 21), (I3 + I7) - 63, 0);
                        e.Z(graphics);
                    }
                }
                if (i5 > 1) {
                    int i11 = (I7 - 18) / 24;
                    if (i11 > 0) {
                        for (int i12 = 0; i12 < i11; i12++) {
                            e.I(graphics, I2 - 21, I3 + 9 + (i12 * 24), 30, 24);
                            graphics.drawImage(f2Code[5], I2 - 21, (I3 - 22) + (i12 * 24), 0);
                            e.Z(graphics);
                            e.I(graphics, (I2 + I6) - 9, I3 + 9 + (i12 * 24), 30, 24);
                            graphics.drawImage(f2Code[5], (I2 + I6) - 59, (I3 - 22) + (i12 * 24), 0);
                            e.Z(graphics);
                        }
                    }
                    int i13 = (I7 - 18) - (i11 * 24);
                    if (i13 > 0) {
                        e.I(graphics, I2 - 21, I3 + 9 + (i11 * 24), 30, i13);
                        graphics.drawImage(f2Code[5], I2 - 21, (I3 - 22) + (i11 * 24), 0);
                        e.Z(graphics);
                        e.I(graphics, (I2 + I6) - 9, I3 + 9 + (i11 * 24), 30, i13);
                        graphics.drawImage(f2Code[5], (I2 + I6) - 59, (i11 * 24) + (I3 - 22), 0);
                        e.Z(graphics);
                    }
                }
                if (e.f253F) {
                    graphics.setColor(0);
                    graphics.drawRect(I2, I3, I6 - 1, I7 - 1);
                    graphics.setColor(16777215);
                    graphics.drawRect(I2 + 1, I3 + 1, I6 - 3, I7 - 3);
                }
                c2 = 2;
            }
        } else if (c()) {
            e.Z(graphics);
            return;
        } else {
            B Code3 = this.f17Code.m223Code();
            c2 = ((Code3 == null || Code3.f8C >= 5) && !I.f177Code) ? this.ae > 0 ? (char) 1 : 0 : this.ae > 0 ? (char) 4 : 3;
        }
        e.Z(graphics);
        if (this.f17Code.f456b) {
            c2 = 0;
        }
        graphics.drawImage(f2Code[c2], (this.f17Code.C() + i2) - 5, (this.f17Code.m247a() + i3) - 3, 20);
    }

    /* access modifiers changed from: package-private */
    public final void I(boolean z2) {
        if (!z2) {
            this.s = 256;
            this.x = this.r;
            this.y = (int) System.currentTimeMillis();
            I.f179I = true;
            if (this.P >= this.L) {
                int k2 = k();
                int l2 = l();
                int Code2 = e.Code(this.P - (l2 / 2), this.L, this.m - l2);
                c(e.Code(J(Z(this.O, Code2), this.O - (k2 / 2)), 0, this.l - k2), Code2);
                ae();
            }
        } else if (m54J()) {
            this.s = (k() * 256) / this.l;
            this.x = this.r;
            this.y = (int) System.currentTimeMillis();
            I.f179I = true;
            c(0, this.P >= this.L ? Code(this.P, (-l()) / 2, this.s) : this.q);
        } else if (!m58Z()) {
            this.s = 256;
            m66e();
        }
        ad();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I  reason: collision with other method in class */
    public final boolean m49I() {
        return e.I(this.f21Code) != -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I  reason: collision with other method in class */
    public final Object[] m50I() {
        m35Code();
        return m4Code(this.f38I);
    }

    /* access modifiers changed from: package-private */
    public final int J() {
        return this.j;
    }

    /* renamed from: J  reason: collision with other method in class */
    public final String m51J() {
        int i2;
        int i3;
        int length = e.f247Code.length;
        if (m49I() || this.ac <= 0 || this.ad <= 0 || e.f247Code == null || length == 0) {
            return null;
        }
        int i4 = this.aC;
        for (int i5 = 0; i5 < length; i5++) {
            String lowerCase = e.f247Code[i5].toLowerCase();
            if (lowerCase == null || lowerCase.length() == 0) {
                return null;
            }
            this.aC = this.aj;
            while (this.aC < this.f36I.length) {
                int t2 = t();
                if (t2 == 84 || t2 == 66 || t2 == 73 || t2 == 70) {
                    Y();
                }
                if (t2 == 84) {
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = 0;
                    this.aC += 4;
                    int Z2 = e.Z(t());
                    String B2 = B();
                    String lowerCase2 = B2.toLowerCase();
                    if (lowerCase2.indexOf(lowerCase) != -1) {
                        for (int i9 = 0; i9 < B2.length(); i9++) {
                            i8 = B2.charAt(i9) == '\n' ? i8 + 1 : i8;
                        }
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            int i12 = i6;
                            if (i10 >= lowerCase2.length()) {
                                continue;
                                break;
                            }
                            if (lowerCase2.charAt(i10) == '\n') {
                                i12 = i10 + 1;
                                i2 = i11 + 1;
                                i3 = i7;
                            } else {
                                int i13 = (i7 >= lowerCase.length() || lowerCase2.charAt(i10) != lowerCase.charAt(i7)) ? 0 : i7 + 1;
                                if (i13 == lowerCase.length()) {
                                    int Code2 = e.Code(Z2, B2.substring(i12, (i10 - lowerCase.length()) + 1));
                                    int[] iArr = {this.d + Code2, this.e + ((this.g / (i8 + 1)) * i11), e.Code(Z2, B2.substring(i12, i10 + 1)) - Code2, this.g / (i8 + 1)};
                                    if (this.ac <= 0 || this.ad <= 0) {
                                        System.out.println("no focus data");
                                        i3 = 0;
                                        i2 = i11;
                                    } else {
                                        int i14 = this.aC;
                                        this.aC = this.ac;
                                        while (this.aC <= this.ad) {
                                            int t3 = t();
                                            int t4 = t();
                                            int i15 = this.aC;
                                            if (t3 == 76) {
                                                for (int i16 = 0; i16 < t4; i16++) {
                                                    Y();
                                                    if (e.Code(iArr[0], iArr[1], iArr[2], iArr[3], this.d, this.e, this.f, this.g)) {
                                                        this.aC -= ((i16 + 1) * 10) + 2;
                                                        w();
                                                        this.f60d = C();
                                                        this.aC = i15;
                                                        int[] iArr2 = new int[(t4 << 2)];
                                                        int i17 = t4;
                                                        int i18 = 0;
                                                        while (true) {
                                                            int i19 = i17 - 1;
                                                            if (i17 <= 0) {
                                                                break;
                                                            }
                                                            Y();
                                                            int i20 = i18 + 1;
                                                            iArr2[i18] = this.d;
                                                            int i21 = i20 + 1;
                                                            iArr2[i20] = this.e;
                                                            int i22 = i21 + 1;
                                                            iArr2[i21] = this.f;
                                                            i18 = i22 + 1;
                                                            iArr2[i22] = this.g;
                                                            i17 = i19;
                                                        }
                                                        this.f34I = new Vector();
                                                        this.aC = this.aj;
                                                        while (this.aC < this.f36I.length) {
                                                            int t5 = t();
                                                            if (t5 == 84 || t5 == 66 || t5 == 73 || t5 == 70) {
                                                                Y();
                                                            }
                                                            if (t5 == 84) {
                                                                int i23 = this.aC;
                                                                this.aC += 4;
                                                                e.Z(t());
                                                                B();
                                                                int i24 = 0;
                                                                while (i24 < iArr2.length) {
                                                                    int i25 = i24 + 1;
                                                                    int i26 = i25 + 1;
                                                                    int i27 = i26 + 1;
                                                                    int i28 = i27 + 1;
                                                                    if (e.I(iArr2[i24], iArr2[i25], iArr2[i26], iArr2[i27], this.d, this.e, this.f, this.g)) {
                                                                        this.f34I.addElement(new Integer(i23));
                                                                        i24 = i28;
                                                                    } else {
                                                                        i24 = i28;
                                                                    }
                                                                }
                                                            } else {
                                                                b(t5);
                                                            }
                                                        }
                                                        this.aC = i14;
                                                        this.aC = i4;
                                                        return this.f60d;
                                                    }
                                                }
                                                continue;
                                            } else {
                                                this.aC += t4 * 10;
                                            }
                                            af();
                                        }
                                        this.aC = i14;
                                        i3 = 0;
                                        i2 = i11;
                                    }
                                } else {
                                    i2 = i11;
                                    i3 = i13;
                                }
                            }
                            i6 = i12;
                            i10++;
                            i11 = i2;
                            i7 = i3;
                        }
                    } else {
                        continue;
                    }
                } else {
                    b(t2);
                }
            }
        }
        this.aC = i4;
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J  reason: collision with other method in class */
    public final void m52J() {
        Enumeration elements = this.f49Z.elements();
        while (elements.hasMoreElements()) {
            this.f22Code.remove(elements.nextElement());
        }
        this.f49Z.removeAllElements();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J  reason: collision with other method in class */
    public final void m53J(int i2, int i3) {
        this.V = i2;
        this.W = i3;
        this.P = Code(this.o, i3, this.r);
        int i4 = this.n;
        if (this.P >= this.L) {
            i2 = Z(i2);
        }
        this.O = i4 + i2;
        this.ae = (!m58Z() || this.P < this.L) ? Code(this.O, this.P, 1, 1, -1, false) : 0;
        this.ab = this.ae;
        this.f71n = false;
        this.f72o = false;
        this.f73p = false;
        if (this.f17Code.m248a()) {
            this.ab = 0;
            this.f73p = true;
            this.f72o = true;
        }
        if (this.ab > 0 && e.m188I(m1Code(this.ab, 76), "menu:")) {
            B(false);
        } else if (!this.f17Code.m248a()) {
            e.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void J(boolean z2) {
        if (this.s != this.r) {
            ad();
        }
        this.r = Code.Code(this.r, this.s, this.x, this.y);
        if (e.ah) {
            this.r = this.s;
        }
        if (!c() && !(this.T == 0 && this.U == 0)) {
            if (z2) {
                int currentTimeMillis = ((int) System.currentTimeMillis()) - this.Q;
                int Z2 = (this.R + (this.T * Z((currentTimeMillis / 2) + ((currentTimeMillis * currentTimeMillis) / 5000)))) - this.O;
                if (Math.abs(Z2) > Z(k() / 2)) {
                    Z2 = this.T * Z(k() / 2);
                }
                int Z3 = ((Z(((currentTimeMillis * currentTimeMillis) / 5000) + (currentTimeMillis / 2)) * this.U) + this.S) - this.P;
                if (Math.abs(Z3) > Z(l() / 2)) {
                    Z3 = this.U * Z(l() / 2);
                }
                if (this.P < this.L && this.P + Z3 >= this.L) {
                    this.O = Z(this.O);
                    this.R = this.O;
                }
                if (this.L > 0 && this.P >= this.L && this.P + Z3 < this.L) {
                    this.O = I(this.O);
                    this.R = this.O;
                }
                Code(Z2, Z3, false);
                this.n = this.p;
                this.o = this.q;
                Code.e();
            } else {
                Code(0, 0, true);
                this.T = 0;
                this.U = 0;
            }
        }
        this.n = Math.max(0, Math.min(this.l - Z(k()), Code.Code(this.n, this.p, this.t, this.u)));
        this.o = Math.max(0, Math.min(this.m - Z(l()), Code.Code(this.o, this.q, this.v, this.w)));
        if (this.P < this.L) {
            this.O = Math.min(this.O, I(this.l - 1));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J  reason: collision with other method in class */
    public final boolean m54J() {
        return !m58Z() && !m49I() && this.l != 0 && k() != 0 && (k() * 256) / this.l < 128;
    }

    /* access modifiers changed from: package-private */
    public final int Z() {
        if (this.f18Code != null) {
            return this.f18Code.a();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z  reason: collision with other method in class */
    public final synchronized String m55Z() {
        return m1Code(this.ae, 76);
    }

    /* renamed from: Z  reason: collision with other method in class */
    public final void m56Z() {
        int parseInt;
        e.ar = this.f22Code.containsKey("b");
        if (e.n > 0) {
            e.au = this.f22Code.containsKey("x");
        }
        e.ap = this.f22Code.containsKey("d");
        e.aw = this.f22Code.containsKey("e");
        e.ax = this.f22Code.containsKey("i");
        e.aq = this.f22Code.containsKey("a");
        if (this.f22Code.containsKey("c")) {
            e.l = Integer.parseInt((String) this.f22Code.get("c"));
        }
        if (this.f22Code.containsKey("g") && (parseInt = Integer.parseInt((String) this.f22Code.get("g"))) != e.m) {
            e.m = parseInt;
            Code.g();
            Code.f89Code.m89Code();
            Code.f89Code.m94I();
            this.f17Code.f384I = true;
        }
        Code.f89Code.Code(this.f22Code.containsKey("m"));
        if (this.f22Code.containsKey("l") ^ e.f273K) {
            Code.f89Code.m98a();
        }
        Object obj = this.f22Code.get("f");
        if (obj != null) {
            e.m148Code(obj.equals("http://"));
        }
        if (e.f261I.size() > 0 || e.f230B.size() > 0) {
            e.ay = this.f22Code.containsKey("z");
        }
        String str = (String) this.f22Code.get("k");
        if (str != null) {
            try {
                int parseInt2 = Integer.parseInt(str);
                int i2 = e.m129Code(false, false).get(11);
                int i3 = e.m129Code(false, false).get(12);
                e.o = (parseInt2 / 2) - i2;
                if (((parseInt2 & 1) != 0 || i3 >= 30) && ((parseInt2 & 1) != 1 || i3 < 30)) {
                    e.p = 30;
                    if (i3 >= 30) {
                        e.o--;
                    }
                } else {
                    e.p = 0;
                }
            } catch (NumberFormatException e2) {
            }
        }
        if (this.f74q) {
            e.f = !this.f22Code.containsKey("u");
            e.m206e();
        }
        Code.f89Code.i();
        if (e.z >= 0 && this.f22Code.containsKey("y")) {
            e.z = Integer.parseInt((String) this.f22Code.get("y"));
        }
        if (this.f22Code.containsKey("mtc")) {
            try {
                int parseInt3 = Integer.parseInt((String) this.f22Code.get("mtc"));
                if (parseInt3 > 0) {
                    Code.m = parseInt3;
                }
            } catch (NumberFormatException e3) {
            }
        }
        e.C(false);
        Code.J(73);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z  reason: collision with other method in class */
    public final void m57Z(int i2, int i3) {
        if (i3 != 0) {
            Code((((this.l - k()) * i2) / i3) - this.p, 0, false, false);
            this.n = this.p;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void Z(Graphics graphics, int i2, int i3) {
        int i4;
        this.an = (int) System.currentTimeMillis();
        this.f15Code = System.currentTimeMillis();
        if (this.L > 0) {
            boolean z2 = e.f335m;
            e.f335m = true;
            int i5 = this.r;
            this.r = 256;
            int min = Math.min(graphics.getClipY() - i3, this.m - 1);
            Code(graphics, i2, i3, min, Math.min((graphics.getClipHeight() + min) - 1, this.L - 1));
            this.r = i5;
            i4 = i3 + (this.L - I(this.L));
            e.f335m = z2;
        } else {
            i4 = i3;
        }
        int min2 = Math.min(Math.max(this.L, Z(graphics.getClipY() - i4)), this.m - 1);
        Code(graphics, i2, i4, min2, Math.min(Z(graphics.getClipHeight() - 1) + min2, this.m - 1));
    }

    /* access modifiers changed from: package-private */
    public final void Z(boolean z2) {
        if (z2) {
            this.ae = this.ac;
        }
        Code(0, -this.m, false, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z  reason: collision with other method in class */
    public final boolean m58Z() {
        return this.r != 256 && (k() * 256) / this.l <= this.r;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return I(this.l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public final void m59a() {
        if (!m54J()) {
            this.s = 256;
            m66e();
        } else if (this.r != 256 && (k() * 256) / this.l != this.r) {
            this.s = (k() * 256) / this.l;
            m66e();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public final boolean m60a() {
        return !m49I() && e.n > 0 && e.au && !e.f243Code && m7I(1) && this.l < 800;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return I(this.m - this.L) + this.L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: collision with other method in class */
    public final synchronized void m61b() {
        int i2 = 0;
        synchronized (this) {
            this.aC = this.ac;
            while (this.aC <= this.ad && i2 < this.ae) {
                int i3 = this.aC;
                w();
                if (e.m188I(B(), "menu:")) {
                    i2 = i3;
                }
            }
            if (i2 > 0) {
                this.ae = i2;
                B(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: collision with other method in class */
    public final boolean m62b() {
        return e.I(this.f21Code) == 148 && this.ae > 0 && i() != -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: collision with other method in class */
    public final int m63c() {
        return I(this.n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: collision with other method in class */
    public final void m64c() {
        if (!m58Z() || this.P < this.L) {
            B(false);
        } else {
            I(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        return this.o < this.L ? this.o : I(this.o - this.L) + this.L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: collision with other method in class */
    public final void m65d() {
        if (m58Z()) {
            if (this.P >= this.m - l()) {
                Code(0, (l() / 2) - this.P, false);
            } else if (!m58Z() || this.P >= this.G) {
                Code(0, ((this.m - (l() / 2)) + Z(1)) - this.P, false);
            } else {
                Code((this.F + (k() / 2)) - this.O, (this.G + (l() / 2)) - this.P, false);
            }
            Code.f89Code.I(false);
            return;
        }
        if (this.q >= this.m - l()) {
            Z(false);
        } else if (this.q < this.G) {
            Code(this.F - this.p, this.G - this.q, false, false);
        } else {
            Code(0, this.m, false, false);
        }
        Code.f89Code.I(true);
    }

    /* access modifiers changed from: package-private */
    public final int e() {
        return this.P < this.L ? this.O - m63c() : I(this.O - this.n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: collision with other method in class */
    public final void m66e() {
        this.r = this.s;
        this.n = this.p;
        this.o = this.q;
    }

    /* access modifiers changed from: package-private */
    public final int f() {
        return this.P < this.L ? this.P - d() : this.o < this.L ? (I(this.P - this.L) - this.o) + this.L : I(this.P - this.o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: collision with other method in class */
    public final void m67f() {
        if (!this.f72o && this.ab >= 0) {
            this.f71n = true;
            if (e.f341p) {
                boolean Code2 = m44Code(true);
                this.f72o = Code2;
                this.f73p = Code2;
                this.f71n = Code2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int g() {
        return k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: collision with other method in class */
    public final void m68g() {
        if (!this.f72o && this.ab == this.ae) {
            if (this.f71n) {
                m44Code(true);
            } else if (!m58Z() || this.P < this.L) {
                Code.f89Code.m93Code(this.f17Code);
                B(!m7I(2));
            } else {
                I(false);
            }
        }
        this.ab = 0;
    }

    /* access modifiers changed from: package-private */
    public final int h() {
        return l() - k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h  reason: collision with other method in class */
    public final void m69h() {
        int size = this.f11C.size();
        if (size != 0) {
            this.aP++;
            this.aP %= size;
            if (this.aP >= 0) {
                int[] iArr = (int[]) this.f11C.elementAt(this.aP);
                int i2 = iArr[0] + (iArr[2] / 2) + iArr[4];
                int i3 = (iArr[5] + (iArr[1] + iArr[3])) - 1;
                if ((this.f51Z[(I(i3, 0) * 6) + 4] & 1) == 0) {
                    this.ae = Code(0, J(i3), this.l, 10, this.ae, false);
                    if (this.ae != -1 && this.f36I[this.ae] == 67) {
                        B(false);
                    }
                }
                int J2 = J(i3);
                int i4 = this.ah;
                this.ah = 0;
                Code(i2 - this.O, J2 - this.P, true);
                this.ah = i4;
                if (m58Z()) {
                    I(false);
                }
                ad();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int i() {
        String Z2 = m55Z();
        if (Z2.startsWith("shortcut:")) {
            return Integer.parseInt(Z2.substring(9));
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i  reason: collision with other method in class */
    public final void m70i() {
        if (this.f17Code != null && this.f17Code.f456b) {
            this.f17Code.f360C = 0;
            this.f17Code.f456b = false;
            this.f11C = null;
            this.f10C = null;
            this.aP = -1;
            this.f14Code = this.Z;
            this.f3B = this.i;
            this.f29I = this.J;
            ad();
            c(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j  reason: collision with other method in class */
    public final void m71j() {
        if (this.f17Code != null) {
            switch (this.f13Code) {
                case 'l':
                    this.f17Code.Code(true, false, this.f22Code);
                    return;
                case 'r':
                    this.f17Code.Code(this.f53a, this.f53a.equals(this.f21Code) ? this.f22Code : null);
                    return;
                case 'u':
                    this.f17Code.Code(false, false, this.f22Code);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v81, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v64, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v99, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v103, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v123, types: [java.lang.Throwable] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r3[53] = r11.f21Code;
        r3[38] = r11.f40J;
        r3[42] = r11.f47Z;
        r4[56] = r11.f24Code ? 1 : 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        r3[1] = defpackage.e.m125Code("microedition.configuration");
        r3[2] = defpackage.e.m125Code("microedition.profiles");
        r3[3] = defpackage.e.m125Code("microedition.platform");
        r3[4] = defpackage.e.m125Code("microedition.locale");
        r3[5] = defpackage.e.m125Code("microedition.encoding");
        r4[74] = 109;
        r4[75] = 109;
        r3[54] = defpackage.Code.f92Code;
        r3[34] = defpackage.e.f280Z;
        r3[57] = defpackage.e.f228B;
        r4[52] = defpackage.e.b;
        r3[41] = defpackage.e.f314f;
        r3[49] = defpackage.e.f342q;
        r0 = ((((((-(defpackage.e.f344r ? 1 : 0)) + 2) | 4) | ((defpackage.e.ao ? 1 : 0) << 4)) | ((defpackage.e.as ? 1 : 0) << 11)) | ((defpackage.e.ab ? 1 : 0) << 13)) | 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ea, code lost:
        if (defpackage.e.f277Y == false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ec, code lost:
        r0 = r0 | 32768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00f0, code lost:
        r4[24] = r0;
        r4[43] = 16384;
        r4[14] = defpackage.e.m << 1;
        r4[19] = j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x010c, code lost:
        if (r11.f17Code == null) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x010e, code lost:
        r0 = r11.f17Code.m241J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0114, code lost:
        r4[20] = r0;
        r4[25] = defpackage.Code.e;
        r4[26] = defpackage.Code.f;
        r4[21] = ((defpackage.e.ar ? 1 : 0) * 15) + 100;
        r11.f66i = defpackage.e.ar;
        r3[22] = java.lang.String.valueOf(defpackage.e.f257I - defpackage.e.f279Z);
        r3[51] = java.lang.String.valueOf(defpackage.e.f257I);
        r0 = (defpackage.e.aq ? 1 : 0) - (r11.f35I ? 1 : 0);
        r11.f65h = (r0 | (-r0)) >>> 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0156, code lost:
        if (r11.f65h != false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0158, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0159, code lost:
        r4[23] = r0;
        r4[50] = r11.f21Code.equals("server:reset") ? 1 : 0;
        r4[16] = (int) ((defpackage.e.f257I - defpackage.e.f279Z) / 4);
        r3[9] = r11.f38I[10];
        r4[58] = (int) (defpackage.e.Code(false, true) / 1000);
        r3[59] = defpackage.e.m129Code(false, true).getTimeZone().getID();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x01a0, code lost:
        if (r11.f17Code == null) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01a2, code lost:
        r1 = r11.f17Code.f367Code;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01a7, code lost:
        if (r1 == null) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01a9, code lost:
        r4[62] = r1.M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01b1, code lost:
        if (r1.f39I == null) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01c2, code lost:
        if (defpackage.e.m126Code((java.lang.String) r3[42], r1.f39I[1]) == null) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01c4, code lost:
        r5 = new java.lang.StringBuffer((java.lang.String) r3[42]);
        r5.append("&");
        defpackage.e.Code(r5, r1.f39I[0]);
        r5.append("=");
        defpackage.e.Code(r5, defpackage.Z.Code());
        r3[42] = r5.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01f2, code lost:
        if (defpackage.e.an == false) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01f4, code lost:
        r4[43] = r4[43] | 134217728;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01fd, code lost:
        r4[43] = r4[43] | 1052672;
        r4[76] = 7;
        defpackage.Code.m82Z();
        r3[77] = defpackage.Code.f97Code;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x021d, code lost:
        if (r11.f21Code.startsWith("server:gettitle") != false) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0221, code lost:
        if (defpackage.Code.f106I == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0223, code lost:
        defpackage.Code.J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0228, code lost:
        if (defpackage.Code.f107I == null) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x022a, code lost:
        r3[73] = defpackage.Code.f107I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0233, code lost:
        if (defpackage.Code.f121Z.length <= 1) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0235, code lost:
        r3[79] = defpackage.Code.f121Z;
        defpackage.Code.f96Code = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x023d, code lost:
        r0 = defpackage.e.f328j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x023f, code lost:
        if (r0 == null) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0247, code lost:
        if (r0.equals("") == false) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0249, code lost:
        r0 = defpackage.Browser.Code.getAppProperty("OM-Campaign");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0251, code lost:
        if (r0 == null) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0259, code lost:
        if (r0.equals("") != false) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0261, code lost:
        if (r0.equals("debug") != false) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0263, code lost:
        r3[78] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0267, code lost:
        r3[103(0x67, float:1.44E-43)] = "o";
        r0 = defpackage.Browser.Code.getAppProperty("Ping-CID");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0275, code lost:
        if (r0 == null) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0279, code lost:
        if (r0 != "") goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x027b, code lost:
        r0 = "0";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x027d, code lost:
        r3[97] = r0;
        r11.f18Code = defpackage.e.Code(r3, r4, defpackage.e.Code((java.lang.String) r3[53], (java.lang.String) r3[38]));
        r11.f18Code.Code(r11);
        W();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02a3, code lost:
        r0 = r11.aG;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02a7, code lost:
        r0 = defpackage.e.l + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02ad, code lost:
        r1 = null;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 843
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.B.run():void");
    }
}
