//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

class B implements Runnable {
    boolean b = true;
    Hashtable Code = new Hashtable();
    boolean e = false;
    private String[] Code = null;
    private g Code;
    private Integer Code;
    private static char[] Code = new char[512];
    boolean[] Code;
    private e Code;
    String B;
    boolean Code;
    long Code = System.currentTimeMillis();
    String C;
    boolean I;
    private boolean h;
    private boolean i;
    static Image[] Code;
    byte[] I;
    String Code;
    private String[] I;
    private char Code;
    String a;
    int[] I;
    private J I;
    private String b;
    private String c;
    String I;
    String Z;
    String J;
    byte[] Code;
    Image Code;
    boolean Z;
    private int i = -1;
    boolean J;
    private boolean j;
    private int R;
    boolean B;
    private boolean k;
    private int o;
    int Code = -1;
    int I = -1;
    private boolean p;
    int Z = -1;
    int J = -1;
    int B = -1;
    private static final int az = 2 + (Font.getFont(64, 1, 16).getHeight() << 1);
    private int j;
    private boolean l;
    boolean C;
    int C = 0;
    public int a = 1;
    int e;
    public boolean a = false;
    int[] Code = new int[6];
    private Object[] I = new Object[11];
    private static int k = 16;
    private int l;
    private int m;
    private int n;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;
    private int A;
    private int D;
    private int E;
    private int F;
    private int G;
    private int[] Z;
    private int H;
    private int K;
    private int L;
    private int M;
    private int N;
    private Vector a = null;
    private boolean m;
    private Vector C;
    private int O;
    private boolean q;
    private int P;
    private int Q;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private int aa;
    private int ab;
    private boolean n;
    private boolean o;
    private int ac;
    private int ad;
    private int ae;
    private int af = -1;
    private int[] J;
    private int ag = 0;
    private int ah = 40;
    private int ai = 25;
    private int aj;
    private int ak;
    private int al;
    private Vector J;
    private int am;
    private Hashtable Z = new Hashtable();
    private Hashtable J = new Hashtable();
    boolean c;
    private String d;
    private Vector I;
    boolean d;
    private int an;
    private Vector Z = new Vector();
    int b;
    private boolean r;
    private int ao;
    Hashtable I;
    boolean f;
    private J Code;
    private DataOutputStream Code;
    private DataOutputStream I;
    private int ap;
    private int aq = 0;
    private int ar;
    private int as;
    private int at;
    private int au;
    private J Z;
    private DataOutputStream Z;
    private int av = 0;
    private int aw = 0;
    private int ax;
    private int ay;
    private boolean s;
    static Object[] Code;
    static int c = -1;
    static Vector Code;
    int d;
    int f;
    int g;
    private int aA;
    private int aB;
    private int aC;
    static Image[] I;
    int h;
    private int aD;
    private int aE;
    private int aF;
    private int aG;
    private int aH;
    private Vector B;
    private Hashtable B = new Hashtable();
    private int aI;
    private int aJ;
    private static int[] B;
    private static int[] C;
    private static int[] a;
    private static int aK = -1;
    private static int aL = -1;
    private int aM;
    private int aN;
    private int aO;
    boolean g = false;
    private Hashtable C;
    private int aP = -1;
    private int aQ = -1;
    private int aR = -1;
    private int aS = -1;
    private int aT = -1;
    private boolean t = false;
    private boolean u;

    private void ah() {
        this.I = e.aE ? e.Code(224) : e.Code(29);
        this.aq = 1;
        e.q();

        for(int var1 = 0; var1 < 45; ++var1) {
            B var3 = this;
            String var4;
            if ((var4 = e.Code(var1, true)) != null) {
                char[] var5;
                if (e.D == var1 && Code.Code.Code() != 0) {
                    (var5 = new char[]{' ', ' '})[0] = (char)Code.Code.Code();
                } else {
                    var5 = e.Code(var1);
                }

                int var6;
                int var7 = (var6 = e.B(1)) + 2;
                var6 += 2;
                int var8 = (var7 << 1) + 1;
                var7 = var5 != null && var5.length != 1 ? var7 : var8;
                boolean var14;
                int var9 = (var14 = var5 != null && "0".indexOf(var5[0]) != -1) ? Code.Code[35] : Code.Code[26];
                if (var5 == null) {
                    this.Code(this.at, this.au, var7, var6, var9);
                    this.at += var7;
                    ++this.at;
                } else {
                    for(int var10 = 0; var10 < var5.length; ++var10) {
                        char var11 = var5[var10];
                        var3.Code(var3.at, var3.au, var7, var6, var9);
                        var3.at += var7;
                        var3.Code(var11, Code.Code[28], var3.at - var7 / 2, var3.au + var6 / 2 - 1);
                        ++var3.at;
                    }
                }

                ++var3.at;
                int var13 = var3.ar;
                var3.ar = var3.at;
                var3.Code((String)e.Code(0, var4, var3.m(), (String)null), 0, -16777216);
                var3.ar = var13;
                ++var3.au;
                int var12 = var3.m() + var3.ar + var3.as;
                if (!var14) {
                    var3.Code((byte)42, "", "shortcut:" + var1, false, 0, var3.au, var12, var3.ap);
                }

                var3.C(1);
            }
        }

        this.C(6);
        if (!e.aE) {
            this.J(e.I(149), e.Code(223));
            this.C(2);
        }

        this.l = this.m() + this.ar + this.as;
        this.ag();
    }

    public void run() {
        // $FF: Couldn't be decompiled
    }

    private String C() {
        String var1;
        return (var1 = this.B()) != null && var1.length() > 0 && var1.charAt(0) == 0 ? this.c + var1.substring(1, var1.length()) : var1;
    }

    private void t() {
        this.Code = 1;
        this.I = 10;
        this.k = true;
        this.at = this.ar = 6;
        this.as = 6;
        this.au = 4;
        this.J = new Vector();
    }

    static String Code(Hashtable var0) {
        StringBuffer var1 = new StringBuffer();

        for(Enumeration var2 = var0.elements(); var2.hasMoreElements(); var1.append((String)var2.nextElement())) {
            if (var1.length() != 0) {
                var1.append("\u0000");
            }
        }

        return var1.toString();
    }

    final int i() {
        int var1 = -1;
        String var2;
        if ((var2 = this.Z()).startsWith("shortcut:")) {
            var1 = Integer.parseInt(var2.substring(9));
        }

        return var1;
    }

    private void ag() {
        this.Code = (e.aE << 2) + 7;
        this.I = 10;
    }

    final boolean b() {
        return e.I(this.Code) == 148 && this.ae > 0 && this.i() != -1;
    }

    private void p() {
        this.Code = 23;
        this.I = e.Code(45);
        B var1;
        String var2;
        if (!(var2 = (var1 = this.Code.Code).Code).startsWith("<imgs>") && e.I(var2) == -1) {
            this.Code.J = var1;
        }

        var1 = this.Code.J;
        this.I((String)e.Code(81), (String)null);
        this.J("<imgs>" + var1.Code, e.Code(80));
        this.C(5);
        this.I((String)e.Code(56), (String)null);
        this.Code(65, var1.I);
        this.Code(63, var1.Code);
        this.Code(58, e.Code((long)var1.am));
        this.Code((String)(e.Code(57) + ": "), 1, -16777216);
        if (var1.Code != null) {
            this.Code(this.Code(var1.Code), false, 1);
        } else {
            this.Code((String)e.Code(131), 0, -16777216);
        }

        this.C(5);
        this.I((String)e.Code(59), (String)null);
        if (var1.a < 2) {
            this.Code(60, e.Code(12));
        } else {
            this.Code(60, e.Code(11));
            if (var1.Code != null) {
                if (var1.Code[4].length() > 0) {
                    this.Code((String)(e.Code(94) + ": "), 1, -16777216);
                    this.Code((String)var1.Code[4], 0, -16777216);
                    this.S();
                }

                this.Code((String)(e.Code(119) + " "), 1, -16777216);
                this.Code((String)var1.Code[0], 0, -16777216);
                this.S();
                this.Code((String)(e.Code(120) + " "), 1, -16777216);
                this.Code((String)var1.Code[6], 0, -16777216);
                this.S();
                this.Code((String)(e.Code(121) + " "), 1, -16777216);
                this.Code((String)var1.Code[2], 0, -16777216);
                this.S();
                this.Code((String)(e.Code(122) + " "), 1, -16777216);
                this.Code((String)var1.Code[3], 0, -16777216);
                this.S();
                this.S();
            }

        }
    }

    private void z() {
        this.t();

        e var1;
        for(var1 = this.Code; var1.Code(2); var1 = var1.I()) {
        }

        String var2 = var1.Code.I();
        this.Code = var1.Code.Code;
        this.I = var1.Code.I;
        this.Code = var1.Code.Code;
        this.Code(var2, e.Code(91));
        this.Code("timg:" + var2, e.Code(e.aq + 92));
        this.Code("overlay:" + e.I(37), 94);
        this.I(0);
    }

    final void i() {
        if (this.Code != null && this.Code.b) {
            this.Code.C = 0;
            this.Code.b = false;
            this.C = null;
            this.C = null;
            this.aP = -1;
            this.Code = this.Z;
            this.B = this.i;
            this.I = this.J;
            this.ad();
            this.c(0);
        }

    }

    private boolean I(int var1) {
        return (var1 & this.aH) != 0;
    }

    private static boolean Code(e var0, String var1) {
        return var0 != null && var0.Code(1) && var1 != null && !var1.equals("") && (var1.startsWith("http:") || var1.startsWith("https:") || e.I(var1, "ext:") || e.I(var1, "history:") || e.I(var1, "bookmark:") || e.I(var1, "spl:") || e.I(var1, "open:") || e.I(var1, "speeddial:") && !e.Code(e.Code(e.J, e.Code(var1))) || var1.startsWith("feed:") || var1.startsWith("myopera:"));
    }

    private void A() {
        this.Code = 9;
        String var1 = Code.Code(1).Code.I();
        this.Code((String)(e.Code(63) + ":"), 1, Code.Code[44]);
        this.S();
        this.Code((String)var1, 0, Code.Code[44]);
    }

    private void Code(int var1, String var2) {
        this.Code((String)(e.Code(var1) + ": "), 1, -16777216);
        this.Code((String)var2, 0, -16777216);
        this.S();
    }

    private void Code(Vector var1, boolean var2) {
        this.f = var2;
        this.k = true;
        this.Code = 2;
        if (this.f) {
            this.I = e.Code(41);
            this.Code = 1;
            this.I = 10;
        } else if (var1 == e.Z) {
            this.I = e.Code(7);
            this.Code((Object[])null, e.I(91), e.Code(33), -10, false, false, true, -16777216);
            if (Code.Z) {
                this.Code((Object[])null, "myopera:///b", e.Code(179), -9, false, false, true, -16777216);
            }

            this.Code((Object[])null, "myopera:///n", e.Code(180), -12, false, false, true, -16777216);
            if (e.Y) {
                this.Code((Object[])null, e.I(136), e.Code(146), -9, false, false, true, -16777216);
            }
        } else if (var1 == e.J) {
            this.I = e.Code(33);
        } else if (var1 == e.C) {
            this.I = e.Code(47);
        } else if (var1 == e.a) {
            this.I = e.Code(146);
        }

        this.Code(var1, false, -1);
    }

    private void V() {
        e.Code(this.Code);
        this.Code = null;
    }

    static Object[] Code(Object[] var0) {
        Object[] var1 = new Object[11];
        int[] var2 = new int[6];
        System.arraycopy(var0, 0, var1, 0, 11);
        System.arraycopy(var0[7], 0, var2, 0, 6);
        var1[7] = var2;
        return var1;
    }

    B(e var1) {
        this.Code(var1);
        this.r = 256;
        this.s = this.r;
        this.j = Code.e;
    }

    final void Code(e var1) {
        if (var1 == null && this.Code != null) {
            this.aF = this.Code.Z();
            this.aG = this.Code.J();
            this.aD = this.Code.Code();
            this.aE = this.Code.I();
        }

        this.Code = var1;
        if (this.Code != null) {
            this.aH = this.Code.Code;
        }

    }

    static e Code(B var0) {
        return var0.Code;
    }

    final void j() {
        if (this.Code != null) {
            switch(this.Code) {
                case 'l':
                    this.Code.Code(true, false, this.Code);
                    return;
                case 'r':
                    this.Code.Code(this.a, this.a.equals(this.Code) ? this.Code : null);
                    return;
                case 'u':
                    this.Code.Code(false, false, this.Code);
                    return;
                default:
            }
        }
    }

    private void Code(String var1, int var2) {
        this.Code(var1, e.Code(var2));
    }

    final e Code() {
        return this.Code;
    }

    final boolean I() {
        return e.I(this.Code) != -1;
    }

    final void C() {
        this.a(7);
        this.V();
    }

    final boolean Code() {
        return this.Code != null && this.Code.Code == this;
    }

    final void Code(String var1, boolean var2) {
        this.Code = var2;
        this.J = var1;
        if (!this.I()) {
            Thread var7;
            (var7 = new Thread(this)).setPriority(10);
            var7.start();

            while(this.C == 0) {
                Thread.yield();
            }

        } else {
            int var6 = e.I(this.Code);
            B var8 = this;
            switch(var6) {
                case 129:
                case 130:
                case 131:
                case 132:
                    return;
                default:
                    B var3 = this;
                    this.Z = true;
                    this.j = true;
                    this.J = true;
                    this.m = true;
                    this.ar = 3;
                    this.as = 3;
                    this.l = 0;
                    B var10000 = this;
                    byte var10001 = 40;

                    try {
                        if (var10000.I(var10001)) {
                            var3.ar += 5;
                            var3.as += 5;
                            var3.au += 2;
                        }

                        var3.Code = new J(2000);
                        var3.Code = new DataOutputStream(var3.Code);
                        var3.I = new J(1000);
                        var3.I = new DataOutputStream(var3.I);
                        var3.Z = new J(1000);
                        var3.Z = new DataOutputStream(var3.Z);
                        var3.Code.write(0);
                        var3.I.writeInt(-1);
                        var3.I.writeInt(0);
                        var8.C(5);
                        int var4;
                        switch(var6) {
                            case 32:
                            case 33:
                                var8.J(var6);
                                break;
                            case 34:
                                var8.F();
                            case 35:
                            case 38:
                            case 39:
                            case 41:
                            case 42:
                            case 48:
                            case 49:
                            case 51:
                            case 53:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case 61:
                            case 63:
                            case 64:
                            case 69:
                            case 71:
                            case 72:
                            case 75:
                            case 78:
                            case 79:
                            case 80:
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                            case 87:
                            case 92:
                            case 93:
                            case 94:
                            case 95:
                            case 96:
                            case 97:
                            case 98:
                            case 102:
                            case 103:
                            case 105:
                            case 106:
                            case 107:
                            case 108:
                            case 110:
                            case 111:
                            case 113:
                            case 114:
                            case 115:
                            case 116:
                            case 117:
                            case 118:
                            case 119:
                            case 120:
                            case 121:
                            case 122:
                            case 125:
                            case 127:
                            case 129:
                            case 130:
                            case 131:
                            case 132:
                            case 133:
                            case 134:
                            case 137:
                            case 138:
                            case 140:
                            case 142:
                            case 146:
                            case 147:
                            case 149:
                            case 150:
                            case 151:
                            case 152:
                            case 153:
                            case 154:
                            case 155:
                            case 156:
                            case 157:
                            case 158:
                            case 159:
                            case 160:
                            case 161:
                            case 162:
                            case 166:
                            default:
                                break;
                            case 36:
                                var8.q();
                                break;
                            case 37:
                                var8.A();
                                break;
                            case 40:
                                var8.E();
                                break;
                            case 43:
                                var8.I(e.C);
                                break;
                            case 44:
                                if (!"keep".equals(var8.J)) {
                                    Code = e.Code();
                                    c = -1;
                                }

                                var8.Z(e.C);
                                break;
                            case 45:
                            case 52:
                            case 101:
                            case 141:
                                Vector var11 = e.Code(var6);
                                var4 = (var8.Code.I() != null ? var8.Code.I() : var8.Code).B();
                                if (!"keep".equals(var8.J)) {
                                    Code = e.Code(e.Code(var11, var4));
                                    c = var4;
                                }

                                var8.Z(var11);
                                break;
                            case 46:
                                var8.s();
                                break;
                            case 47:
                                if (!"keep".equals(var8.J)) {
                                    Code = e.Code();
                                    c = -1;
                                    Code[1] = var8.Code.Code.I;
                                    Code[0] = var8.Code.Code.C;
                                    Code[2] = var8.Code.Code.Code;
                                }

                                var8.Z(e.C);
                                break;
                            case 50:
                                var8.I(e.J);
                                break;
                            case 54:
                                int var10;
                                if ((var10 = var8.Code.indexOf(38)) >= 0) {
                                    char var12;
                                    if ((var12 = var8.Code.charAt(var10 + 3)) == 'h') {
                                        Code = Code.Z;
                                    } else if (var12 == 'b') {
                                        Code = e.Z;
                                    }

                                    var8.Code = var8.Code.substring(0, var10);
                                }

                                var8.Code(Code, true);
                                break;
                            case 60:
                                if (e.c && e.h != 1 && e.g != 1) {
                                    var8.Z(0);
                                    break;
                                }

                                var8.G();
                                break;
                            case 62:
                                var8.r();
                                break;
                            case 65:
                                var8.l();
                                break;
                            case 66:
                                var8.u();
                                break;
                            case 67:
                                var8.w();
                                break;
                            case 68:
                                var8.v();
                                break;
                            case 70:
                                var8.D();
                                break;
                            case 73:
                                var8.m();
                                break;
                            case 74:
                                var8.Code = 23;
                                var8.k = true;
                                var8.I = e.Code(35);
                                var8.Z(e.I(148), e.Code(29));
                                var8.S();
                                if (e.b != null && e.b.length() > 0) {
                                    var8.Z(e.b, e.Code(246));
                                    var8.S();
                                }

                                var8.Z(e.a, e.Code(244));
                                var8.S();
                                var8.Z(e.I(88), e.Code(2));
                                break;
                            case 76:
                                var8.n();
                                break;
                            case 77:
                                var8.p();
                                break;
                            case 86:
                                var8.Code = 11;
                                var8.k = true;
                                var8.I = e.Code(16);
                                var8.a(false);
                                break;
                            case 88:
                                var8.Code = 23;
                                var8.I = e.Code(2);
                                var4 = var8.Code(e.Code(69));
                                var8.Code(var4, true, -1);
                                var8.C(5);
                                var8.Code((String)e.Code(216), 0, -16777216);
                                var8.S();
                                var8.Code((String)"v. 4.6.32741", 0, -16777216);
                                var8.S();
                                var8.C(5);
                                var8.Code((String)(e.Code(219) + " (c) 2013 "), 0, -16777216);
                                var8.S();
                                var8.J(e.Code(218), e.Code(217));
                                var8.S();
                                var8.Code((String)e.Code(220), 0, -16777216);
                                var8.S();
                                var8.C(5);
                                var8.J("operette://H/thirdparties.html", e.Code(82));
                                break;
                            case 89:
                            case 100:
                                if (!"keep".equals(var8.J)) {
                                    Code = e.Code();
                                    e var9;
                                    if ((var9 = Code.Code(1)).I != null) {
                                        Code[1] = var9.I[1];
                                        Code[0] = var9.I[0];
                                        Code[2] = var9.I[2];
                                    }

                                    c = -1;
                                    Code = null;
                                }

                                var8.Z((Vector)null);
                                break;
                            case 90:
                                var8.Code(e.Z, false);
                                break;
                            case 91:
                                var8.Code(e.J, false);
                                break;
                            case 99:
                                var8.I(e.Z);
                                break;
                            case 104:
                                e.B = 0L;
                                e.d(false);
                                e.C(false);
                            case 164:
                                if (var6 == 164) {
                                    e.J = 0L;
                                    e.d(true);
                                    e.C(false);
                                }
                            case 163:
                                var8.o();
                                break;
                            case 109:
                                var8.Code(e.C, false);
                                break;
                            case 112:
                                var8.K();
                                break;
                            case 123:
                                var8.y();
                                break;
                            case 124:
                                var8.z();
                                break;
                            case 126:
                                var8.L();
                                break;
                            case 128:
                                var8.x();
                                break;
                            case 135:
                                Code = e.Code();
                                c = -1;
                                Code[1] = var8.Code.Code.Code.I;
                                Code[0] = var8.Code.Code.Code.Code;
                                Code[2] = var8.Code.Code.Code.Code;
                                Code[8] = var8.Code.Code.Code;
                                var8.Z(e.a);
                                break;
                            case 136:
                                var8.Code(e.a, false);
                                break;
                            case 139:
                                var8.I(e.a);
                                break;
                            case 143:
                                var8.Z(1);
                                break;
                            case 144:
                                var8.P();
                                break;
                            case 145:
                                var8.H();
                                break;
                            case 148:
                                var8.ah();
                                break;
                            case 165:
                                var8.M();
                                break;
                            case 167:
                                var8.N();
                                break;
                            case 168:
                                var8.B = true;
                                var8.I = "";
                                break;
                            case 169:
                                var8.O();
                        }

                        var8.C(5);
                        var8.k();
                        if (var6 == 76 && !var8.u) {
                            Code.Code.Code();
                        }
                    } catch (IOException var5) {
                        return;
                    }

            }
        }
    }

    private void Code(DataInputStream var1) {
        byte[] var2 = new byte[3];
        int var3 = 0;

        while((var3 += var1.read(var2, var3, 3 - var3)) < 3) {
        }

        this.al = e.J(var2, 0);
        byte var9;
        byte var11;
        if (this.Code == Code.I()) {
            var9 = 3;
            var11 = 0;
        } else {
            var9 = 2;
            var11 = 0;
        }

        if (var11 <= var9) {
            int var10001 = this.al;
            boolean var7 = false;

            byte[] var13;
            try {
                var7 = true;
                var13 = new byte[var10001];
                var7 = false;
            } finally {
                if (var7) {
                    Code.Code.B(var11);
                    var3 = var11 + 1;
                }
            }

            this.I = var13;
        }

        if (this.I == null) {
            this.I = new byte[this.al];
        }

        this.ak = 0;
        int var10 = 0;

        while(this.al > this.ak) {
            this.ak += var1.read(this.I, this.ak, Math.min(1024, this.al - this.ak));
            I.Code(this);
            if (this.aj == 0) {
                B var12 = this;
                int var4 = 11;
                int var5 = 0;

                while(true) {
                    if (var5 >= 4) {
                        var4 += 5;
                        if (var12.ak >= var4) {
                            this.X();
                            var10 = this.aj;
                            if (this.b != null && this.b.startsWith("server:gettitle")) {
                                Code[1] = this.I;
                                Code[2] = this.Code;
                                this.Code.Code.J = "keep";
                                this.C();
                                this.Code.J();
                            }

                            this.e();
                            this.a(4);
                        }
                        break;
                    }

                    if (var4 + 2 >= var12.ak) {
                        break;
                    }

                    var4 += e.Code(var12.I, var4) + 2;
                    ++var5;
                }
            }

            if (this.aj > 0) {
                var10 = this.Code(var10);
                this.c(1000);
            }
        }

    }

    private void b(int var1) {
        switch(var1) {
            case 66:
                this.aC += 4;
                return;
            case 70:
                this.aC += 6;
                this.aC += this.s();
                this.aC = this.s() + this.aC + 3;
                return;
            case 73:
                this.aC += 10;
                return;
            case 76:
                this.aC += 9;
                return;
            case 77:
                ++this.aC;
                this.aC += this.p();
            case 67:
            case 68:
            case 69:
            case 71:
            case 72:
            case 74:
            case 75:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            default:
                return;
            case 83:
                this.aC += this.p();
                return;
            case 84:
                this.aC += 5;
                this.aC += this.s();
        }
    }

    private void af() {
        this.aC += this.s();
        this.aC += this.s();
    }

    private int r() {
        int var1 = this.o();
        if (this.s && var1 >>> 24 != 254) {
            var1 = var1 & -16777216 | 16777215 - (var1 & 16777215);
        }

        return var1;
    }

    private void T() {
        this.Z.Code()[this.av] = (byte)((this.Z.size() - this.av) / 10);
        this.av = 0;
    }

    final void Code() {
        this.Code[0] = this.p;
        this.Code[1] = this.q;
        this.Code[2] = this.O;
        this.Code[3] = this.P;
        this.Code[4] = this.Z();
        this.Code[5] = this.u();
        this.I[0] = this.Code;
        this.I[1] = this.I;
        this.I[2] = this.Code;
        this.I[3] = this.Z;
        this.I[4] = this.b;
        this.I[7] = this.Code;
        if (this.I() && (this.I[this.ae] == 76 || this.I[this.ae] == 42)) {
            int var1 = this.ae;
            ++var1;
            var1 = (var1 += 10 * (this.I[var1++] & 255)) + e.I(this.I, var1);
            var1 += 2;
            this.I[9] = e.Code(this.I, var1);
        }

        if (!this.j) {
            this.I[8] = this;
        }

    }

    final void J() {
        Enumeration var1 = this.Z.elements();

        while(var1.hasMoreElements()) {
            this.Code.remove(var1.nextElement());
        }

        this.Z.removeAllElements();
    }

    private void Code(byte var1, String var2, String var3, boolean var4, int var5, int var6, int var7, int var8) {
        this.Code(var1, var2, var3, var4);
        Code(this.Z, var5, var6, var7, var8);
        this.T();
    }

    private void Z(int var1, int var2, int var3) {
        int var4 = Code.Code[7] & -16777217;
        this.Code(this.at + 1, this.au + var3, var1 - 2, 1, var4);
        this.Code(this.at + 1, this.au + var3 + var2 - 1, var1 - 2, 1, var4);
        this.Code(this.at, this.au + var3, 1, var2, var4);
        this.Code(this.at + var1 - 1, this.au + var3, 1, var2, var4);
        this.Code(this.at + 1, this.au + 1 + var3, var1 - 2, 1, Code.Code[4] & -16777217);
        this.Code(this.at + 1, this.au + 2 + var3, var1 - 2, 1, Code.Code[5] & -16777217);
        this.Code(this.at + 1, this.au + 3 + var3, var1 - 2, 1, Code.Code[6] & -16777217);
    }

    private void J(int var1, int var2, int var3) {
        this.ak = this.Code.size();
        this.I = this.Code.Code();
        Image var4;
        int var5 = (var4 = this.Code(var1, 0, 0)).getWidth();
        int var6 = var4.getHeight();
        this.Code(var2, var3, var5, var6);
        this.I(var1, var2, var3, var5, var6);
    }

    private void Code(char var1, int var2, int var3, int var4) {
        int var5;
        if (!e.Code(var1)) {
            int var6 = -11000 - e.Code(var1, var2);
            this.ak = this.Code.size();
            this.I = this.Code.Code();
            Image var7;
            var5 = (var7 = this.Code(var6, 0, 0)).getWidth();
            var2 = var7.getHeight();
            var3 -= var5 / 2;
            var4 -= var2 / 2;
            this.Code(var3, var4, var5, var2);
            this.I(var6, var3, var4, var5, var2);
        } else {
            var5 = e.Code(1, String.valueOf(var1));
            this.Code((String)String.valueOf(var1), 1, var2, var3 - var5 / 2, var4 - e.B(1) / 2);
        }
    }

    private int j() {
        return this.Code != null ? this.Code.Z() : this.aF;
    }

    private int k() {
        return this.Code != null ? this.Code.Code() : this.aD;
    }

    private int l() {
        return this.Code != null ? this.Code.I() : this.aE;
    }

    final void a() {
        if (!this.J()) {
            this.s = 256;
            this.e();
        } else {
            if (this.r != 256 && 256 * this.k() / this.l != this.r) {
                this.s = 256 * this.k() / this.l;
                this.e();
            }

        }
    }

    final int J() {
        return this.j;
    }

    final void d() {
        if (!this.Z()) {
            if (this.q >= this.m - this.l()) {
                this.Z(false);
            } else if (this.q < this.G) {
                this.Code(this.F - this.p, this.G - this.q, false, false);
            } else {
                this.Code(0, this.m, false, false);
            }

            Code.Code.I(true);
        } else {
            if (this.P >= this.m - this.l()) {
                this.Code(0, this.l() / 2 - this.P, false);
            } else if (this.Z() && this.P < this.G) {
                this.Code(this.F + this.k() / 2 - this.O, this.G + this.l() / 2 - this.P, false);
            } else {
                this.Code(0, this.m - this.l() / 2 + this.Z(1) - this.P, false);
            }

            Code.Code.I(false);
        }
    }

    private synchronized String Code(int var1, int var2) {
        this.aC = var1;
        if (this.I[var1] != var2 && (var2 != 76 || this.I[var1] != 42)) {
            return "";
        } else {
            this.w();
            return this.C();
        }
    }

    private void O() {
        this.B = true;
        this.au = this.l() / 2 - e.B(0);
        this.Code((String)e.Code(257), 0, -16777216);
    }

    final void B() {
        if (this.ae >= this.ac && this.ae <= this.ad) {
            this.B(this.ae);
            if (this.e >= 0) {
                int var1 = this.d;
                int var2 = this.e;
                int var3 = this.f;
                int var4 = this.g;
                this.e();
                this.b(-this.I(this.n), -this.I(this.o));
                if (!e.I(0, 0, this.k(), this.l(), this.d, this.e, this.f, this.g)) {
                    this.Code(var1 + var3 / 2 - this.O, var2 + var4 / 2 - this.P, false);
                }

                this.e();
            }
        }
    }

    final synchronized String Code() {
        StringBuffer var1 = new StringBuffer();
        if (this.I(1)) {
            StringBuffer var10000 = var1.append("x=").append(String.valueOf(this.O)).append("&y=");
            int var2 = this.P;
            int var4 = this.I(var2, 5);
            var10000.append(String.valueOf(var2 + this.Z[var4 * 6] - this.Z[var4 * 6 + 5]));
        }

        Enumeration var5 = this.Code.keys();

        while(var5.hasMoreElements()) {
            String var3;
            if (!(var3 = (String)var5.nextElement()).startsWith("o:")) {
                e.Code(var1.append("&"), var3);
                e.Code(var1.append("="), this.Code.get(var3).toString());
            }
        }

        return var1.toString();
    }

    private void U() {
        byte[] var1 = this.Code.Code();
        e.Z(this.ax, var1, this.ao);
    }

    final boolean Code(int var1) {
        if (this.ac > 0 && this.ad > 0) {
            this.aC = this.ac;
            int var2 = 0;

            while(this.aC <= this.ad) {
                if (var2 == var1) {
                    this.ae = this.aC;
                    return true;
                }

                ++var2;
                ++this.aC;
                this.aC += 10 * this.t();
                this.af();
            }

            return false;
        } else {
            return false;
        }
    }

    final void Code(String var1) {
        this.C = true;
        e.Code(new e(this, var1));
    }

    final Object[] Code() {
        this.Code();
        return this.I;
    }

    final Object[] I() {
        this.Code();
        return Code(this.I);
    }

    final void I() {
        if (this.Code != null) {
            if (this.Code) {
                this.p = this.Code[0];
                this.q = this.Code[1];
                this.af = this.Code[5];
            }

            this.c(this.Code[0], this.Code[1]);
            this.O = this.Code[2];
            this.P = this.Code[3];
        }

    }

    final void Code(Object[] var1) {
        this.I = var1;
        this.Code = (String)var1[0];
        this.I = (String)var1[1];
        this.Code = (byte[])var1[2];
        this.Z = (String)var1[3];
        if (var1.length > 4) {
            this.b = (String)var1[4];
            this.Code = (int[])var1[7];
            if (this.Code != null) {
                if (this.Code || e.I(this.Code) == 65) {
                    this.p = this.Code[0];
                    this.q = this.Code[1];
                    this.af = this.Code[5];
                }

                this.c(this.Code[0], this.Code[1]);
                this.O = this.Code[2];
                this.P = this.Code[3];
                return;
            }

            this.Code = new int[6];
        }

    }

    static B Code(Object[] var0) {
        return var0.length <= 8 ? null : (B)var0[8];
    }

    public final boolean a() {
        return !this.I() && e.n > 0 && e.au && !e.Code && this.I(1) && this.l < 800;
    }

    final Image Code() {
        if ((this.Code == null || this.Code.getHeight() != Code.d) && this.Code != null) {
            Object[] var1 = new Object[3];
            e.Code(this.Code, 0, this.Code.length, 256, var1);
            if (var1[0] != null) {
                if ((Integer)var1[2] != Code.d) {
                    var1[0] = e.Code((int[])var1[0], (Integer)var1[1], (Integer)var1[2], Code.d, 1, true);
                    var1[1] = new Integer(Code.d);
                    var1[2] = new Integer(Code.d);
                }

                int var2 = (Code.c - Code.d) / 2;
                this.Code = e.Code(var1, Code.Code.I, -var2);
            }
        }

        return this.Code;
    }

    final int I() {
        if (this.C == 2) {
            this.aJ = Math.min(this.aJ + Math.max((this.aI * 10 - this.aJ) / 5, 0) + 4, 1000);
            return this.aJ + 250;
        } else {
            return this.am / 3 + (this.Z() << 1) / 3;
        }
    }

    private synchronized void I(int var1, int var2, int var3, int var4) {
        if (this.D > 0 && this.E > 0) {
            int var5 = this.z + this.D;
            this.z = Math.min(this.z, var1);
            this.D = Math.max(var1 + var3, var5) - this.z;
            var1 = this.A + this.E;
            this.A = Math.min(this.A, var2);
            this.E = Math.max(var2 + var4, var1) - this.A;
        } else {
            this.z = var1;
            this.A = var2;
            this.D = var3;
            this.E = var4;
        }
    }

    private void k() {
        if (this.I(40)) {
            this.au += 2;
        }

        B var1 = this;
        int var3;
        int var4;
        if (this.Z.size() != 0) {
            byte[] var2 = this.Z.Code();
            var3 = 0;
            int var5 = var4 = this.Code.size();

            while(var3 != var1.Z.size()) {
                var5 = var1.Code.size();
                var1.Code.write(var2[var3++]);
                if (var3 == var1.ac) {
                    var1.ae = var5;
                }

                int var6 = var3;
                int var7 = (var3 = (var3 += e.I(var2, var3) + 2) + e.I(var2, var3) + 2) - var6;
                byte var8 = var2[var3];
                var1.Code.write(var8);
                int var11 = var8 * 10;
                var1.Code.write(var2, var3 + 1, var11);
                var3 += var11 + 1;
                var1.Code.write(var2, var6, var7);
            }

            var1.ac = var4;
            var1.ad = var5;
        }

        var1.Z = null;
        var1.Z = null;
        e.I(this.I.size() - 8, this.I.Code(), 4);
        int var9 = this.Code.size();
        this.al += var9 + this.I.size() - 8;
        this.I = new byte[this.al];
        System.arraycopy(this.Code.Code(), 0, this.I, 0, var9);
        this.aj = var9;
        int var10 = 0;

        do {
            var3 = e.Z(this.I.Code(), var10);
            var4 = e.Z(this.I.Code(), var10 + 4);
            System.arraycopy(this.I.Code(), var10 + 8, this.I, var9, var4);
            var9 += var4;
            var10 = var3;
        } while(var3 >= 0);

        this.Code = null;
        this.Code = null;
        this.I = null;
        this.I = null;
        this.ak = this.al;
        this.m = Math.max(this.m, this.au);
        if (this.c()) {
            this.l = Math.min(this.l, this.j());
        }

        this.aa();
        this.Z[6] = this.aj;
        this.Z[7] = this.al;
        if (this.af >= 0) {
            this.Code(this.af);
        }

        if (this.ae > 0) {
            this.B(this.ae);
            var9 = this.e - this.l() / 2 + k;
            if (this.I(2)) {
                if (this.e == 4) {
                    var9 = 0;
                } else {
                    var9 = this.e;
                }
            }

            this.c(0, var9);
        }

        this.ae();
        if (this.ae <= 0) {
            this.ae = this.ac;
        }

        if (e.I(this.Code) == 165 && this.l() > 0) {
            this.B();
        }

        this.a(4);
        this.a(5);
    }

    private void y() {
        this.t();
        byte var1 = 0;
        B var2;
        String var3 = (var2 = this.Code.I().Code).I();
        byte var4 = 0;
        if (!var2.I()) {
            var4 = 15;
            this.at += 15;
        }

        if (Code(this.Code.I(), var3)) {
            this.Code("openNewTab:" + var3, 251);
            this.Code("openNewTab:openBackgroud:" + var3, 252);
        }

        int var5 = this.Code.I().B();
        if (e.I(var3, "bookmark:")) {
            this.Code(101, 15, false, true, false);
            this.Code(99, 14, false, true, false);
        } else if (e.I(var3, "speeddial:")) {
            boolean var8 = var5 < 0 || e.Code(e.Code(e.J, var5));
            this.Code(52, 15, false, true, false);
            this.Code(50, 19, false, true, var8);
        } else if (e.I(var3, "search:")) {
            this.Code(45, 15, false, true, var5 <= 0);
            this.Code(43, 14, false, true, var5 <= 0);
        } else if (!var2.I()) {
            var1 = 12;
            var5 = Math.max(e.B(0), 12) + 6;
            int var6 = this.au;
            int var7 = this.at;
            this.at -= var4;
            this.au += var5 * this.J.size() / 2 + 3;
            this.Code("fittoscreen", "on", var2.i << 1, 0, false, true);
            this.at = var7;
            this.au = var6;
            this.Code((e.ar == var2.i ? "tssr:" : "") + e.I(83), e.Code(89));
            if (!var2.h) {
                this.Code((e.aq ? "" : "timg:") + e.I(83), e.Code(13));
            }

            this.C(83, 5);
            this.C(77, 94);
            if (var3 != null) {
                this.Code(124, 95, true, false, false);
            }

            int var9;
            if ((var9 = var2.Code(var2.O, var2.P, 1, 1, 0, true)) != 0) {
                this.Code(var2.Code(var9, 105), e.Code(103));
            }
        }

        this.I(var1);
    }

    private void w() {
        this.t();

        e var1;
        for(var1 = this.Code; var1.Code(2); var1 = var1.I()) {
        }

        B var2;
        if ((var2 = var1.Code) != null && !var2.I()) {
            this.C(77, 45);
            this.Code(89, 8, false, true, false);
            if (var2.a) {
                this.C(63, 208);
            }

            this.C(127, 141);
            if (e.Y && !var2.C) {
                this.C(134, 145);
            }
        }

        this.C(86, 16);
        this.C(73, 9);
        this.C(163, 239);
        this.C(74, 35);
        this.I(0);
    }

    private void l() {
        this.I = e.I;
        this.Code("o:a", "www.", Code.J, 49, Code.Code[54]);
        this.C(4);

        for(this.at += 6; e.q >= e.C.size(); --e.q) {
        }

        if (e.q >= 0) {
            Object[] var1 = e.Code(e.C, e.q);
            this.Code("http://m.yahoo.com/opera/search?p=", (String)var1[1], (byte[])null, 129, Code.Code[54]);
        }

        this.C(4);
        if (e.ay && e.I.size() > 0) {
            this.C(2);
            this.Code(e.I, true, -1);
            this.R();
        }

        this.I(e.Code(7), e.I(90));
        this.Code((Object[])null, "feed:start//" + System.currentTimeMillis(), e.Code(34), -7, false, false, false, -16777216);
        this.Code(e.J, true, -1);
        this.C(-4);
        this.B(4);
        this.C(8);
        if (e.ay) {
            this.Code(e.B, true, -1);
        }

        this.Code((Object[])null, Code.Z ? "myopera:logout" : "myopera:login", Code.Z ? e.Code(177, Code.Z) : e.Code(178), -11, false, false, false, -16777216);
        if (Code.Z.size() > 0) {
            this.R();
            this.I(e.Code(16), e.I(86));
            this.a(true);
        }

        if (e.Y && !e.a.isEmpty()) {
            this.R();
            this.I(e.Code(146), e.I(136));
            this.Code(e.a, true, 3);
        }

    }

    private void v() {
        this.t();
        byte var1 = 0;
        byte var2 = 0;
        int var3 = Code.Code(1).B();
        int var4;
        Vector var7;
        if ((var4 = e.I(this.Code.I().Code.Code)) == 109) {
            var7 = e.C;
            var2 = 1;
            var1 = 56;
        } else if (var4 == 90) {
            var7 = e.Z;
        } else {
            if (var4 != 136) {
                boolean var6 = var3 < 0 || e.Code(e.Code(e.J, var3));
                this.Code(52, 15, false, true, var3 < 0);
                this.Code(50, 19, false, true, var6);
                this.I(0);
                return;
            }

            var7 = e.a;
            var1 = -40;
        }

        boolean var5 = var3 < var2 || e.Code(e.Code(var7, var3), 2);
        if (var7 != e.a) {
            this.Code(100 - var1, 44, false, true, false);
        }

        this.Code(101 - var1, 15, false, true, var5);
        this.Code(99 - var1, 14, false, true, var5);
        this.Code(97 - var1, 30, false, false, var3 <= var2);
        this.Code(98 - var1, 31, false, false, var3 == var7.size() - 1 || var3 < var2);
        if (var7 == e.a) {
            this.Code(e.I(140), 156);
        }

        if (var1 == 0) {
            this.Code(49, 90, false, false, Code.Z ^ true);
        }

        this.I(0);
    }

    private void m() {
        this.Code = 7;
        this.B = 23;
        this.I = 10;
        this.B = true;
        this.I = e.Code(9);
        this.au -= 5;
        this.I((String)e.Code(102), (String)null);
        this.Code(13, "a", e.aq);
        this.C(3);
        this.Code((String)(e.Code(114) + ":"), 0, -16777216);
        int var1 = this.n();
        this.B("0", e.Code(115));
        this.B("1", e.Code(116));
        this.B("2", e.Code(117));
        this.U();
        this.at += 4;
        this.au -= 3;
        this.Code("c", String.valueOf(e.l), var1);
        this.C(8);
        this.C(3);
        this.Code((String)(e.Code(79) + ":"), 0, -16777216);
        var1 = this.n();
        this.B("0", e.Code(73));
        this.B("1", e.Code(74));
        this.B("2", e.Code(75));
        this.U();
        this.at += 4;
        this.au -= 3;
        this.Code("g", String.valueOf(e.m), var1);
        this.C(4);
        this.Code(89, "b", e.ar);
        if (e.n > 0) {
            this.Code(e.Code(214), "x", e.au);
        }

        this.I((String)e.Code(78), (String)null);
        if (e.z >= 0) {
            this.C(3);
            this.Code((String)(e.Code(209) + ":"), 0, -16777216);
            var1 = this.n();
            this.B("0", e.Code(213));
            this.B("1", e.Code(210));
            this.B("2", e.Code(211));
            this.B("3", e.Code(212));
            this.B("4", e.Code(243));
            this.U();
            this.at += 4;
            this.au -= 3;
            this.Code("y", String.valueOf(e.z), var1);
            this.C(6);
        }

        this.Code((String)(e.Code(259) + ":"), 0, -16777216);
        this.at += 4;
        this.au -= 3;
        this.Code("mtc", Code.m > 0 ? String.valueOf(Code.m) : "", (byte[])null, 16, -16777216, this.m() - this.at);
        this.C(6);
        this.J("sk:///l/" + e.i + "?version=" + 2, e.Code(138) + "...");
        this.C(5);
        this.Code(77, "d", e.ap);
        if (!e.aj) {
            this.Code(175, "m", e.M);
        }

        if (!e.o) {
            this.Code(107, "l", e.K);
        }

        this.Code(e.Code(118), "i", e.ax);
        if (e.e != 0) {
            String var10001 = e.Code(161);
            int var10003 = e.f;
            this.Code(var10001, "u", (boolean)((var10003 | -var10003) >>> 31 ^ 1));
        }

        if (e.I.size() > 0 || e.B.size() > 0) {
            this.Code(e.Code(207), "z", e.ay);
        }

        if (!e.af) {
            this.Code(25, "e", e.aw);
            this.C(3);
            this.Code((String)e.Code(64), 0, -16777216);
            var1 = this.n();
            String var2 = Code.Code(-1, true, (Calendar)null);
            int var3 = e.Code(false, false).get(12);
            Calendar var4 = e.Code(false, false);
            Calendar var5 = e.Code(true, false);
            int var6 = 0;

            for(int var7 = 0; var7 < 48; var7 += 2) {
                String var8 = Code.Code(var7 / 2, false, var3 >= 30 ? var5 : var4);
                this.B(String.valueOf(var7), var8);
                if (var8.equals(var2)) {
                    var6 = var7;
                }

                var8 = Code.Code(var7 / 2, false, var3 >= 30 ? var4 : var5);
                this.B(String.valueOf(var7 + 1), var8);
                if (var8.equals(var2)) {
                    var6 = var7 + 1;
                }
            }

            this.U();
            this.at += 4;
            this.au -= 3;
            this.Code("k", String.valueOf(var6), var1);
            this.C(8);
        }

        this.I((String)e.Code(48), (String)null);
        this.C(3);
        this.Code((String)(e.Code(50) + ":"), 0, -16777216);
        var1 = this.n();
        if (!e.ad) {
            this.B("socket://", "Socket/HTTP");
        }

        this.B("http://", "HTTP");
        this.U();
        this.at += 4;
        this.au -= 3;
        this.Code("f", e.ae ? "http://" : "socket://", var1);
        this.C(6);
        this.J(e.I(142), e.Code(205) + "...");
        this.C(6);
        this.J("dialog:" + e.I(33), e.Code(97) + "...");
        this.C(6);
    }

    private void o() {
        this.B = true;
        this.J = true;
        this.I = e.Code(239);
        this.I((String)e.Code(67), (String)null);
        this.Code(Math.max(0L, e.C - e.b), Math.max(0L, e.a - e.c));
        this.J(e.I(164), "[" + e.Code(19) + "]");
        this.S();
        this.C(4);
        this.I((String)e.Code(68), (String)null);
        this.Code(e.C, e.a);
        this.J(e.I(104), "[" + e.Code(242) + "]");
        this.S();
        this.C(4);
    }

    private void Code(String var1, String var2) {
        int var4;
        for(byte var3 = 0; (var4 = e.Code(0, var2) + (var1 != null && e.I(var1, "menu:") ? (e.B(0) + 4) / 3 + 2 : 0) + this.at + this.as) > this.j(); var3 = 1) {
            var2 = var2.substring(0, var2.length() - (var3 * 3 + 1)) + "...";
        }

        this.l = Math.max(this.l, var4);
        this.J.addElement(var1);
        this.J.addElement(var2);
    }

    public final void Z() {
        e.ar = this.Code.containsKey("b");
        if (e.n > 0) {
            e.au = this.Code.containsKey("x");
        }

        e.ap = this.Code.containsKey("d");
        e.aw = this.Code.containsKey("e");
        e.ax = this.Code.containsKey("i");
        e.aq = this.Code.containsKey("a");
        if (this.Code.containsKey("c")) {
            e.l = Integer.parseInt((String)this.Code.get("c"));
        }

        int var1;
        if (this.Code.containsKey("g") && (var1 = Integer.parseInt((String)this.Code.get("g"))) != e.m) {
            e.m = var1;
            Code.g();
            Code.Code.Code();
            Code.Code.I();
            this.Code.I = true;
        }

        Code.Code.Code(this.Code.containsKey("m"));
        if (this.Code.containsKey("l") ^ e.K) {
            Code.Code.a();
        }

        Object var6;
        if ((var6 = this.Code.get("f")) != null) {
            e.Code(var6.equals("http://"));
        }

        if (e.I.size() > 0 || e.B.size() > 0) {
            e.ay = this.Code.containsKey("z");
        }

        String var7;
        int var8;
        if ((var7 = (String)this.Code.get("k")) != null) {
            label94: {
                String var10000 = var7;

                int var2;
                try {
                    var1 = Integer.parseInt(var10000);
                    var2 = e.Code(false, false).get(11);
                    var8 = e.Code(false, false).get(12);
                } catch (NumberFormatException var5) {
                    break label94;
                }

                int var3 = var8;
                e.o = var1 / 2 - var2;
                if (((var1 & 1) != 0 || var3 >= 30) && ((var1 & 1) != 1 || var3 < 30)) {
                    e.p = 30;
                    if (var3 >= 30) {
                        --e.o;
                    }
                } else {
                    e.p = 0;
                }
            }
        }

        if (this.q) {
            e.f = this.Code.containsKey("u") ^ 1;
            e.e();
        }

        Code.Code.i();
        if (e.z >= 0 && this.Code.containsKey("y")) {
            e.z = Integer.parseInt((String)this.Code.get("y"));
        }

        if (this.Code.containsKey("mtc")) {
            label91: {
                Hashtable var9 = this.Code;
                String var10001 = "mtc";

                try {
                    var8 = Integer.parseInt((String)var9.get(var10001));
                } catch (NumberFormatException var4) {
                    break label91;
                }

                var1 = var8;
                if (var8 > 0) {
                    Code.m = var1;
                }
            }
        }

        e.C(false);
        Code.J(73);
    }

    private void S() {
        this.at = this.ar;
        this.au += this.ap + this.aq;
        this.ap = 0;
    }

    private void Code(int var1, boolean var2, int var3) {
        this.ak = this.Code.size();
        this.I = this.Code.Code();
        Image var4;
        int var5 = (var4 = this.Code(var1, 0, 0)).getWidth();
        int var6 = var4.getHeight();
        if (var2) {
            this.at = this.j() / 2 - var5 / 2;
            this.at = Math.max(0, this.at);
        }

        if (var3 >= 0) {
            this.au += (e.B(var3) - var6) / 2;
        }

        this.a(var5, var6);
        this.I(var1, this.at, this.au, var5, var6);
        if (var3 >= 0) {
            this.au -= (e.B(var3) - var6) / 2;
        }

        this.at += var5;
    }

    private void P() {
        this.Q();
        this.I = e.Code(139);
        this.Code((String)(e.Code(140) + " " + e.Code(136)), 0, Code.Code[44]);
    }

    private void a(int var1, int var2) {
        if (this.Z(var1)) {
            this.S();
        }

        this.l = Math.max(this.l, this.at + var1 + this.as);
        this.ap = Math.max(this.ap, var2);
        this.Code(this.at, this.au, var1, var2);
    }

    private void Code(long var1, long var3) {
        if (var1 > var3) {
            var3 = var1;
        }

        this.Code((String)e.Code(240), 0, -16777216);
        int var10000 = var3 == 0L ? 0 : Math.min(100 - (int)(var1 * 100L / var3), 99);
        int var5 = var10000;
        int var6 = var10000 == 0 ? -16777216 : e.C(var5);
        this.Code((String)(" " + var5 + "% "), 1, var6);
        this.Code((String)e.Code(241), 0, -16777216);
        this.S();
        this.Code((String)(e.Code(237) + " "), 0, -16777216);
        this.Code((String)e.Code(var1), 0, -16777216);
        this.S();
        this.Code((String)(e.Code(238) + " "), 0, -16777216);
        this.Code((String)e.Code(var3), 0, -16777216);
        this.S();
    }

    private void Code(int var1, String var2, boolean var3) {
        this.Code(var2, "", var3 << 1, 0, true, false);
        int var4 = this.ar;
        this.at += 2;
        this.ar = this.at;
        this.Code((String)e.Code(var1), 0, -16777216);
        this.ar = var4;
        this.C(5);
    }

    private int q() {
        return this.p() << 8 >> 8;
    }

    private static int Code(int var0, int var1) {
        return var0 * var1 + 255 >> 8;
    }

    private void Code(String var1, String var2, byte[] var3, int var4, int var5) {
        this.Code(var1, var2, var3, var4, var5, this.m());
    }

    private int w() {
        ++this.aC;
        this.aC += 10 * this.t();
        int var1 = this.aC;
        this.C = this.B();
        return var1;
    }

    private void n() {
        this.Code = 23;
        int var1 = -16777216;
        if (this.I(40)) {
            this.I = 10;
            var1 = Code.Code[44];
            this.at = this.ar;
        }

        this.I = e.Code(29);
        this.aq = 1;
        String var2;
        if ((var2 = e.Code(this.Z, "a")) == null) {
            var2 = "#*";
        }

        this.u = false;

        for(int var3 = 0; var3 < var2.length(); ++var3) {
            char var4 = var2.charAt(var3);

            for(int var5 = 0; var5 < 16; ++var5) {
                char var6 = "1234567890#*↑↓←→".charAt(var5);
                String var10;
                if ((var10 = e.Code(var4, var6, true)) != null) {
                    this.u = true;
                    int var11 = e.B(1);
                    int var12 = e.Code(1, String.valueOf(var4));
                    int var13 = var11 + 2;
                    this.Code(this.at, this.au, var13, var13, Code.Code[26]);
                    this.at += var13;
                    this.Code((String)String.valueOf(var4), 1, Code.Code[28], this.at - var13 / 2 - var12 / 2, this.au + var13 / 2 - var11 / 2 - 1);
                    ++this.at;
                    this.Code(this.at, this.au, var13, var13, Code.Code[26]);
                    this.at += var13;
                    this.Code(var6, Code.Code[28], this.at - var13 / 2, this.au + var13 / 2 - 1);
                    this.at += 2;
                    int var7 = this.ar;
                    this.ar = this.at;
                    this.Code((String)var10, 0, var1);
                    this.ar = var7;
                    this.C(2);
                }
            }
        }

    }

    private boolean Z(int var1) {
        return this.at + var1 + this.as > this.j();
    }

    private void N() {
        this.B = 28;
        this.Code = 9;
        this.I = 23;
        this.I = e.Code(139);
        this.Code((String)e.Code(258, String.valueOf(Code.m)), 0, Code.Code[44]);
    }

    private void L() {
        this.Q();
        this.I = e.Code(110);
        this.Code((String)e.Code(111), 0, Code.Code[44]);
        this.C(5);
        this.Code((String)e.Code(112), 0, Code.Code[44]);
    }

    private void Code(String var1, String var2, boolean var3) {
        this.Code(var2, "", var3 << 1, 0, true, false);
        int var4 = this.ar;
        this.at += 2;
        this.ar = this.at;
        this.Code((String)var1, 0, -16777216);
        this.ar = var4;
        this.C(5);
    }

    private void q() {
        if (!e.aA) {
            this.Code = 23;
            this.I = 14;
        }

        this.B = true;
        this.J = true;
        this.I = e.Code(37);
        this.Code((String)e.Code(83), 1, -16777216);
        this.C(5);
        String var1;
        if ((var1 = e.Code(this.Z, "b")) == null) {
            var1 = e.Code(84, e.b);
        }

        this.Code((String)var1, 0, -16777216);
        if (e.aA && !e.Code(87).equals(var1)) {
            this.S();
            this.C(5);
            this.J(e.I(142), e.Code(205));
        }

        if ((var1 = this.Code.Code) != null && e.aA) {
            this.S();
            this.C(5);
            this.J(var1, e.Code(137));
        }

    }

    private void r() {
        this.J = true;
        this.B = true;
        this.I = e.Code(189);
        this.Code((String)e.Code(189), 0, -16777216);
        if (e.e != null) {
            this.C(5);
            this.Code((byte)87, e.e, e.e, false);
            this.Code((String)e.e, 0, Code.Code[53]);
            this.T();
        }

    }

    private void s() {
        this.J = true;
        this.B = true;
        this.Q();
        this.Code((String)(e.Code(144) + " " + e.Code(143)), 0, Code.Code[44]);
    }

    private void I(int var1) {
        var1 = Math.max(e.B(0), var1) + 6;

        int var2;
        String var3;
        for(var2 = 0; var2 < this.J.size(); var2 += 2) {
            if ((var3 = (String)this.J.elementAt(var2)) != null && e.I(var3, "menu:")) {
                this.l = Math.min(this.j(), this.l + var1 / 3);
                break;
            }
        }

        var2 = 0;
        var3 = "*. ";
        int var4 = e.Code(0, var3);
        this.l = Math.min(this.j(), var4 + this.l);

        for(int var5 = 0; var5 < this.J.size(); this.au += var1) {
            String var6 = (String)this.J.elementAt(var5++);
            String var7 = (String)this.J.elementAt(var5++);
            if (var6 == null) {
                this.Code((String)var7, 0, Code.Code[35], this.at + var4, this.au + 3);
            } else {
                ++var2;
                int var8;
                if (var2 <= 9) {
                    var8 = 0;
                    var7 = var3.replace('*', (char)(var2 + 48)) + var7;
                } else {
                    var8 = var4;
                }

                this.Code((String)var7, 0, Code.Code[34], this.at + var8, this.au + 3);
                if (e.I(var6, "menu:")) {
                    this.I(this.l, var1, Code.Code[34]);
                }

                this.Code((byte)76, "", var6, false);
                this.Code((int)0, this.au, this.l, var1);
                this.T();
            }
        }

        this.J = null;
        this.au += -1;
    }

    private void C(int var1, int var2) {
        this.Code(e.I(var1), var2);
    }

    private void Code(int var1, int var2, boolean var3, boolean var4, boolean var5) {
        String var6 = null;
        if (!var5) {
            var6 = e.I(var1);
            if (var3) {
                var6 = "menu:" + var6;
            }

            if (var4) {
                var6 = "dialog:" + var6;
            }
        }

        this.Code(var6, var2);
    }

    private void u() {
        this.t();

        e var1;
        for(var1 = this.Code; var1.Code(2); var1 = var1.I()) {
        }

        if (var1.e) {
            this.C(83, 5);
        }

        this.C(80, 39);
        B var2 = var1.Code;
        if (var1.I(1) || e.at && var1.Z != null) {
            this.C(82, 32);
        }

        if (var2 != null && !var2.I()) {
            this.C(83, 5);
        }

        if (var2 == null || e.I(var2.Code) != 65) {
            this.C(65, 46);
        }

        this.Code("addTab:", 248);
        if (Code.I() > 1) {
            this.Code("bottomOverlay:" + e.I(165), 256);
        }

        this.C(90, 7);
        this.Code(67, 36, true, false, false);
        this.C(79, 10);
        this.I(0);
    }

    private void J(int var1) {
        this.Q();
        this.I = "";
        String var2 = "";
        switch(var1) {
            case 32:
                this.I = e.Code(96);
                var2 = e.Code(98);
                break;
            case 33:
                this.I = e.Code(97);
                var2 = e.Code(99);
        }

        this.Code((String)var2, 0, -16777216);
    }

    private void K() {
        this.f = true;
        B var1 = this.Code.I().Code;
        int var2 = e.Code(this.Z, "b").equals("0") ^ 1;
        this.Code = (var2 << 3) + 1;
        this.I = 10;
        this.I = e.Code(41);
        String var3 = "\u0000" + e.Code(this.Z, "a") + "\u0000";
        int var4 = var1.ao;
        int var5 = e.J(var1.I, var4);
        var4 += 3;
        int var6 = this.ar;

        for(int var7 = 0; var7 < var5; ++var7) {
            String var8 = e.Code(var1.I, var4);
            var4 += e.I(var1.I, var4) + 2;
            String var9 = e.Code(var1.I, var4);
            var4 += e.I(var1.I, var4) + 2;
            int var10 = this.au;
            int var11 = var3.indexOf("\u0000" + var8 + "\u0000") >= 0 ? 1 : 0;
            if (var2 != 0) {
                int var12 = this.Code(String.valueOf(var7), var8, var11 << 1, -1, false, false);
                this.at += 2;
                this.ar = this.at;
                this.Code(var9, var11, -16777216);
                this.S();
                this.I("", var12);
            } else {
                this.at = 5;
                this.ar += 10;
                this.Code((String)var9, 0, -16777216);
                this.S();
                this.Code((byte)42, "", var8, (boolean)var11);
            }

            this.ar = var6;
            this.Code(var6, var10, this.m(), this.au - var10);
            this.T();
            this.S();
            ++this.au;
            this.Code(0, this.au, this.m() + this.ar + this.as, 1, Code.Code[15]);
            this.C(4);
        }

    }

    private void x() {
        this.t();
        this.C(113, 160);
        this.C(129, 1);
        this.I(0);
    }

    private void D() {
        this.B = 28;
        this.Code = 9;
        this.I = 23;
        String var1 = e.Code(this.Z, "a");
        String var2 = e.Code(this.Z, "b");
        this.Code((String)var1, 0, Code.Code[44]);
        this.C(5);
        if (var2 != null) {
            this.Code((String)var2, 0, Code.Code[44]);
        }

    }

    private void Q() {
        this.Code = 5;
        this.I = 6;
        this.B = 28;
        this.j = true;
        this.B = true;
    }

    private int m() {
        return this.j() - this.ar - this.as;
    }

    private void E() {
        e.aF = true;
        this.Code = this.I = 23;
        this.Code((String)e.Code(85), 0, Code.Code[44]);
        this.C(5);
        this.Code((String)e.Code(86), 0, Code.Code[44]);
    }

    private void F() {
        this.Code = this.I = 23;
        this.Code((String)e.Code(222), 0, Code.Code[44]);
    }

    private void G() {
        boolean var1 = "1".equals(e.Code(this.Z, "s"));
        int var2 = 0;
        String var3;
        if ((var3 = e.Code(this.Z, "r")) != null) {
            var2 = Integer.parseInt(var3);
        }

        this.af = 0;
        this.B = Code.Code.Code(var1);
        this.I = a.Code();
        this.f = true;
        this.Code = 1;
        this.I = 10;
        this.Code(0, this.au, this.m() + this.ar + this.as, 1, 0);
        if (var2 > 0) {
            this.Code((String)e.Code(155), 1, Code.Code[44]);
            this.S();
        }

        if (var1 && !a.Code()) {
            var3 = e.Code(this.Z, "u");
            if (var2 == 1) {
                this.Code((byte)76, "new file", "sets:" + var3, false);
            } else if (var2 == 2) {
                this.Code((byte)76, "new file", "set:" + var3, false);
            } else {
                this.Code((byte)76, "new file", "put:" + var3, false);
            }
        }

        String var10 = "...";
        int var11;
        if ((var11 = this.I.lastIndexOf(47, this.I.length() - 2)) > 0) {
            var10 = var10 + this.I.substring(var11);
        }

        this.Code((String)e.Code(0, this.I, this.m(), var10), 0, Code.Code[44]);
        if (var1 && !a.Code()) {
            this.T();
        }

        this.S();
        this.Code(this.ar, this.au++, this.m(), 1, Code.Code[45]);
        boolean var12;
        var11 = (var12 = e.b()) && a.I && !var1 ? Code.Code.Code().getWidth() + 1 : 0;

        for(int var4 = 0; var4 < this.B.size(); ++var4) {
            Object[] var5;
            String var6 = (String)(var5 = (Object[])this.B.elementAt(var4))[0];
            int var7 = (Integer)var5[1];
            String var8 = null;
            if ((var7 & 4) != 0) {
                if ("+".equals(var5[0])) {
                    var8 = "mkdir:";
                } else {
                    var8 = "cwd:";
                }
            } else if (!var1 && (var7 & 1) != 0) {
                var8 = "get:";
            }

            if (var8 != null) {
                if (var12 && (var7 & 4) == 0) {
                    this.J(-6000 - var4, this.at, this.au);
                }

                this.at = this.ar += var11;
                String var13 = (String)var5[2];
                this.Code((byte)76, var13, var8 + var6, false);
                int var14 = this.au;
                var8 = "...";
                int var9;
                if ((var9 = var13.lastIndexOf(47)) != -1) {
                    var8 = var8 + var13.substring(var9);
                }

                this.Code((String)e.Code(0, var13, this.m(), var8), 0, (var7 & 4) != 0 ? Code.Code[44] : Code.Code[45]);
                if (var12 && (var7 & 4) == 0) {
                    this.S();
                    this.Code((String)(new String(new char[]{'\u0000', (char)(32 + (char)var4), ' '})), 0, Code.Code[45]);
                }

                this.ar -= var11;
                this.S();
                this.Code(this.ar + var11, var14, this.m() - var11, this.au - var14);
                this.T();
            }
        }

    }

    private void Z(int var1) {
        this.Code = 9;
        this.B = 23;
        this.I = "";
        int var2 = Code.Code[44];
        String var3 = "";
        if (var1 == 0) {
            var3 = e.Code(221);
            if (Browser.Code.getAppProperty("MIDlet-Jar-RSA-SHA1") != null) {
                var3 = e.Code(169);
            }
        } else if (var1 == 1) {
            this.I = e.Code(37);
            var3 = e.Code(153) + " " + e.Code(154);
        }

        if (this.I.length() > 0) {
            this.Code((String)this.I, 0, var2);
            this.C(5);
        }

        this.Code((String)var3, 0, var2);
    }

    private void H() {
        this.Code = 39;
        this.I = 40;
        this.B = 23;
        this.I = e.k;
        int var1 = Code.Code[44];
        this.Code((String)this.I, 0, var1);
        this.C(5);
        this.Code((String)e.l, 0, var1);
        e.aC = true;
    }

    private void I(Vector var1) {
        if (var1 == e.Z || var1 == e.J) {
            Code.J = true;
        }

        this.Q();
        int var2 = this.Code.I().B();
        B var10000;
        String var10001;
        if (var1 == e.Z) {
            this.I = e.Code(26);
            var10000 = this;
            var10001 = e.Code(27);
        } else if (var1 == e.C) {
            this.I = e.Code(123);
            var10000 = this;
            var10001 = e.Code(124);
        } else if (var1 == e.a) {
            this.I = e.Code(150);
            var10000 = this;
            var10001 = e.Code(151);
        } else {
            this.I = e.Code(125);
            var10000 = this;
            var10001 = e.Code(126);
        }

        var10000.Code((String)var10001, 0, -16777216);
        this.C(5);
        Object[] var3 = e.Code(var1, var2);
        short var10004;
        int var10005;
        if (var1 == e.Z) {
            var10004 = -1000;
            var10005 = var2;
        } else if (var1 == e.J) {
            var10004 = -4000;
            var10005 = var2;
        } else if (var1 == e.a) {
            var10004 = -5000;
            var10005 = var2;
        } else {
            var10004 = -2000;
            var10005 = var2;
        }

        this.Code(var3, (String)null, (String)null, var10004 - var10005, true, false, false, Code.Code[52]);
    }

    private void J(String var1, String var2) {
        String var10001 = var1;
        int var5 = Code.Code[53];
        String var3 = var10001;
        this.Code((byte)76, var2, var3, false);
        this.Code((String)var2, 0, var5);
        this.T();
    }

    private void Z(Vector var1) {
        if (var1 == e.Z || var1 == e.J || var1 == null) {
            Code.J = true;
        }

        this.Code = 7;
        this.I = 10;
        this.B = true;
        String var2 = (String)Code[1];
        if (var1 != e.Z && var1 != null) {
            if (var1 == e.J) {
                this.I = e.Code(33);
            } else if (var1 == e.C) {
                this.I = e.Code(47);
            } else if (var1 == e.a) {
                this.I = e.Code(145);
            }
        } else {
            this.I = e.Code(7);
        }

        this.I((String)e.Code(65), (String)null);
        this.Code("a", var2, (byte[])Code[2], 0, -16777216);
        this.C(5);
        if (var1 == e.a) {
            if (var1.size() > 2 && c == -1) {
                this.Code("s", "1", 0, 0, true, false);
                this.Code((String)e.Code(157), 0, -16777216);
            }
        } else {
            this.I((String)e.Code(63), (String)null);
            this.Code("b", (String)Code[0], (byte[])null, 48, -16777216);
            this.C(2);
            this.J(e.I(53), e.Code(129));
            this.C(5);
        }

        if (var1 == e.J) {
            this.J("dialog:" + e.I(54) + "&l=b", e.Code(132));
            this.S();
            if (Code.Z.size() > 0) {
                this.J("dialog:" + e.I(54) + "&l=h", e.Code(133));
                this.S();
            }
        }

        if (var1 == null) {
            this.Code((String)e.Code(33), 0, -16777216);
            this.S();
            this.C(2);
            if (Code == null) {
                var1 = new Vector();
                Object[] var3;
                (var3 = e.Code())[1] = "- " + e.Code(131) + " -";
                var1.addElement(var3);

                for(int var5 = 0; var5 < e.J.size(); ++var5) {
                    Object[] var4;
                    if (e.Code(var4 = e.Code((Object[])e.J.elementAt(var5)))) {
                        var4[1] = e.Code(130);
                    }

                    var1.addElement(var4);
                }

                Code = var1;
                c = -1;
            }

            this.Code("$", "", (byte[])null, 129, -16777216);
        }

        if (var1 == e.C && var2.length() == 0) {
            this.Code((String)e.Code(127, e.Code(108)), 0, Code.Code[52]);
        }

    }

    private synchronized int u() {
        if (this.ae <= 0) {
            return 0;
        } else {
            this.aC = this.ac;
            int var1 = 0;

            while(this.aC < this.ae) {
                ++var1;
                ++this.aC;
                this.aC += 10 * this.t();
                this.af();
            }

            return var1;
        }
    }

    private void J(Vector var1) {
        if (this.a != null && var1 != null && this.a.size() > 0 && var1.size() > 0 && var1.size() == this.a.size()) {
            int var2 = var1.size();

            int var3;
            int[] var4;
            for(var3 = 0; var3 < var2; ++var3) {
                var4 = (int[])var1.elementAt(var3);

                for(int var5 = var3 + 1; var5 < var2; ++var5) {
                    int[] var6 = (int[])var1.elementAt(var5);
                    if (var4[1] > var6[1]) {
                        var1.setElementAt(var6, var3);
                        var1.setElementAt(var4, var5);
                        var4 = var6;
                    }
                }
            }

            for(var3 = 0; var3 < var2; ((int[])this.a.elementAt(var4[0]))[4] = var3++) {
                var4 = (int[])var1.elementAt(var3);
            }

        }
    }

    private void a(boolean var1) {
        int var2 = Code.Z.size();
        int var3 = 0;
        if (var1) {
            var3 = var2 - Math.min(3, var2);
        }

        for(int var4 = var2 - 1; var4 >= var3; --var4) {
            this.Code((Object[])Code.Z.elementAt(var4), "history:" + var4 + ":", (String)null, -3000 - var4, false, false, false, -16777216);
        }

    }

    private int Code(byte[] var1) {
        byte[] var10001 = var1;
        int var5 = var1.length;
        byte[] var2 = var10001;
        int var4 = this.Code.size();
        this.Code.writeShort(var5);
        this.Code.write(var2, 0, var5);
        return var4;
    }

    public final void Code(Vector var1) {
        if (this.Code.get("a") != null) {
            Code[1] = this.Code.get("a");
        }

        if (this.Code.get("b") != null) {
            Code[0] = this.Code.get("b");
        }

        if (((String)Code[1]).length() == 0) {
            Code[1] = e.Code(72);
        }

        String var2 = e.Code(this.Code(), "s");
        Object[] var10000 = c == -1 ? null : e.Code(var1, c);
        Object[] var3 = var10000;
        if (var10000 == null || !var3[1].equals(Code[1]) || !var3[0].equals(Code[0]) || (var3[2] != null || Code[2] != null) && (var3[2] == null || !var3[2].equals(Code[2])) && (Code[2] == null || !Code[2].equals(var3[2])) || var1 != e.a || var2 != null) {
            if (var1 == e.J) {
                byte var10001;
                Integer var10002;
                int var4;
                if ((var4 = e.Code(var3, 5)) != 97 && (var4 != 83 || !e.Code(var3))) {
                    var10000 = Code;
                    var10001 = 5;
                    var10002 = new Integer(65);
                } else {
                    var10000 = Code;
                    var10001 = 5;
                    var10002 = new Integer(97);
                }

                var10000[var10001] = var10002;
                Code[6] = new Integer(28);
            } else if (e.Code(Code, 5) != 97 && var1 != e.a) {
                Code[5] = new Integer(77);
                Code[6] = new Integer(31);
            }

            if (var2 != null && var1 == e.a) {
                e.a.removeElementAt(c);
                e.a.insertElementAt(Code, 0);
                e.Code(e.a, true);
                Code.Code.Code(e.a);
            } else if (c == -1) {
                e.Code(var1, Code);
            } else {
                e.Code(var1, Code, c);
            }
        }
    }

    private void M() {
        this.Code = 41;
        this.I = 10;
        this.B = 23;
        this.j = true;
        this.B = true;
        this.k = true;
        this.l = this.j();
        this.au = 4;
        this.I = "";
        Vector var1 = Code.I;
        if (Code.b()) {
            e.c(true);
            this.Code = new boolean[var1.size()];
            this.I = new int[var1.size()];
            Code.Code(this.Code);
            e.Code(this.Code);
        }

        byte var2 = e.o;
        int var3 = Code.Z();
        int var4 = Code.Code[34];
        int var5 = var2 * 34 + 42;
        String var6 = e.Code(248);
        this.Code(-10000, false, 0);
        this.at += 4;
        this.Code((String)var6, 0, var4);
        this.Code((byte)var5, var6, "addTab:", false, var2 != 0 ? this.ar : 0, this.au, var2 != 0 ? this.at - this.ar : this.l, this.ap);
        this.C(5);
        int var12 = var2 != 0 ? this.Code(-10001, 0, 0).getWidth() : 0;
        int var7 = 0;

        for(int var8 = var1.size(); var7 < var8; ++var7) {
            e var9 = (e)var1.elementAt(var7);
            String var10 = null;
            B var11;
            if ((var11 = var9.I != null ? var9.I : var9.Code) != null) {
                if (e.I(var11.Code) == 65) {
                    var10 = e.Code(46);
                } else if (var11.I != null) {
                    var10 = var11.I;
                } else if (var11.Code != null) {
                    var10 = var11.Code;
                }
            } else if (var9.Code != null && var9.Code[1] != null) {
                if (e.I((String)var9.Code[0]) == 65) {
                    var10 = e.Code(46);
                } else {
                    var10 = (String)var9.Code[1];
                }
            }

            if (var10 == null || var10.length() == 0) {
                var10 = e.Code(72);
            }

            String var13 = var10;
            var10 = "showTab:" + var7;
            this.Code(-9000 - var7, false, 0);
            this.at += 4;
            var13 = e.Code(0, var13, this.ar + this.m() - this.at - var12, "");
            this.Code((String)var13, 0, var4);
            this.Code((byte)var5, var13, var10, (boolean)((var7 - var3 | -(var7 - var3)) >>> 31 ^ 1), var2 != 0 ? this.ar : 0, this.au, var2 != 0 ? this.at - this.ar : this.l, this.ap);
            if (var2 != 0) {
                var13 = e.Code(249);
                var10 = "closeTab:" + var7;
                this.at = this.ar + this.m() - var12;
                this.Code((byte)76, var13, var10, false);
                this.Code(-10001, false, 0);
                this.T();
            }

            if (var7 < var8 - 1) {
                this.C(5);
            }
        }

    }

    private void Code(String var1, String var2, int var3) {
        if (this.m() - this.at < this.m() / 5) {
            this.S();
            this.C(5);
        }

        int var4 = this.m() - this.at;
        int var5 = e.B(0) + 6;
        this.a(var4, var5);
        this.Z(var4, var5, 0);
        int var6 = this.at + var4 - var5 / 2 - 6;
        int var7 = this.au + var5 / 2 - 1;

        for(int var8 = 7; var8 > 0; var8 -= 2) {
            this.Code(var6, var7, var8, 1, -16777216);
            ++var6;
            ++var7;
        }

        int var9 = this.Code(this.at + 4, this.au + 3, var4 - 24, var5 - 2, 's', 0, var1, var2, var3, -16777216);
        this.I("", var9);
        this.Code(this.at + 1, this.au + 1, var4 - 2, var5 - 2);
        this.T();
        this.at += var4;
    }

    private void Code(String var1, String var2, byte[] var3, int var4, int var5, int var6) {
        int var7 = e.B(0);
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (var3 != null && var3.length == 0) {
            var3 = null;
        }

        if (var3 != null) {
            var11 = this.Code(var3);
            this.ak = this.Code.size();
            this.I = this.Code.Code();
            Image var12;
            var8 = (var12 = this.Code(var11, 0, 0)).getWidth() + 3;
            var9 = Math.max(0, (var12.getHeight() - var7) / 2);
            var10 = Math.max(0, (var7 - var12.getHeight() + 1) / 2);
            var7 = Math.max(var7, var12.getHeight());
        }

        var7 += 5;
        this.a(var6, var7);
        this.Z(var6, var7, 0);
        if (var3 != null) {
            this.J(var11, this.at + 3, this.au + 3 + var10);
        }

        if ((var4 & 128) != 0) {
            int var14 = this.at + var6 - var7 / 2 - 6;
            var10 = this.au + var7 / 2 - 1;

            for(var11 = 7; var11 > 0; var11 -= 2) {
                this.Code(var14, var10, var11, 1, -16777216);
                ++var14;
                ++var10;
            }
        }

        int var13 = this.Code(this.at + 3 + var8, this.au + 3 + var9, var6 - 4 - var8 - ((var4 & 128) != 0 ? var7 : 0), var7 - 4, 'x', var4, var1, var2, 0, var5);
        this.I("", var13);
        this.Code(this.at + 1, this.au + 1, var6 - 2, var7 - 2);
        this.T();
        this.at += var6;
    }

    private int Code(String var1, String var2, int var3, int var4, boolean var5, boolean var6) {
        var4 = var4 == -1 ? 0 : Math.max(0, (e.B(var4) - 12) / 2);
        if ((var3 & 2) != 0) {
            var3 &= -3;
            this.Code.put(var1, var2);
        }

        if (var5) {
            this.a(12, 12 + (var4 << 1));
        }

        if (var6) {
            this.Code(this.at, this.au + var4, 12, 12, Code.Code[16] & -16777217);
        }

        this.Z(12, 12, var4);
        int var7 = this.Code(this.at, this.au + var4, 12, 12, 'c', var3, var1, var2, 0, 0);
        if (var5) {
            this.I("", var7);
            this.Code((int)(this.at + 1), this.au + 1 + var4, 10, 10);
            this.T();
        }

        this.at += 13;
        return var7;
    }

    private void R() {
        this.Code(0, this.au - 4, this.m() + this.ar + this.as, 1, -1);
        --this.au;
    }

    private void Code(String var1, String var2, int var3, boolean var4, boolean var5, boolean var6, int var7) {
        this.at = 4;
        --this.au;
        if (var3 != 0 && this.Code(var3, 0, 0) != null) {
            this.Code(var3, false, 0);
            this.at += 4;
        }

        this.Code((String)e.Code(0, var2, this.m() - this.at, (String)null), 0, var7);
        if (var6) {
            this.I(this.m(), e.B(0) + 2, var7);
            this.at = this.m();
        }

        ++this.au;
        var3 = this.m() + this.ar + this.as;
        if (!var4) {
            this.Code((byte)42, var2, var1, var5, 0, this.au, var3, this.ap);
        }

        this.S();
        ++this.au;
        this.Code(0, this.au, var3, 1, Code.Code[15]);
        this.C(4);
    }

    private void B(int var1) {
        int var2 = this.m() + this.ar + this.as;
        this.Code(0, this.au, var2, 1, Code.Code[57]);
        this.Code(0, this.au + var1 - 1, var2, 1, Code.Code[58]);
        int var3 = Code.Code[55];
        int var4 = Code.Code[56];
        int var5 = var3 >> 8 & '\uff00';
        int var6 = var3 & '\uff00';
        var3 = var3 << 8 & '\uff00';
        var1 -= 2;
        int var7 = ((var4 >> 8 & '\uff00') - var5) / var1;
        int var8 = ((var4 & '\uff00') - var6) / var1;
        var4 = ((var4 << 8 & '\uff00') - var3) / var1;

        for(int var9 = 0; var9 < var1; ++var9) {
            int var10 = -16777216 | (var5 & '\uff00') << 8 | var6 & '\uff00' | var3 >> 8;
            this.Code(0, this.au + 1 + var9, var2, 1, var10);
            var5 += var7;
            var6 += var8;
            var3 += var4;
        }

    }

    private void Code(Vector var1, boolean var2, int var3) {
        String var4 = null;
        short var5;
        if (var1 == e.Z) {
            var4 = "bookmark:";
            var5 = -1000;
        } else if (var1 == e.C) {
            var4 = "search:";
            var5 = -2000;
        } else if (var1 == e.J) {
            var4 = "speeddial:";
            var5 = -4000;
        } else if (var1 == Code.Z) {
            var5 = -3000;
        } else if (var1 == e.a) {
            var4 = "open:";
            var5 = -5000;
        } else if (var1 == e.I) {
            var4 = "spl:";
            var5 = -7000;
        } else if (var1 == e.B) {
            var5 = -8000;
        } else {
            var5 = -3999;
        }

        var3 = var3 >= 0 ? Math.min(var3, var1.size()) : var1.size();

        for(int var6 = 0; var6 < var3; ++var6) {
            Object[] var7 = e.Code(var1, var6);
            boolean var8 = var1 != Code.Z && var1 != e.a && var1 != e.C ? e.Code(var7, 5) == 82 : false;
            if (var1 == e.B) {
                boolean var10000 = var8;
                if (var7[3] != null) {
                    var10000 = var8 | true;
                }

                var8 = var10000;
            }

            String var9 = null;
            boolean var10 = false;
            int var11 = -16777216;
            if (var1 == e.J && (var10 = e.Code(var7)) && !var2) {
                var9 = e.Code(128);
            }

            if (this.f) {
                var9 = (String)var7[1];
                var4 = "";
                var7 = null;
                if (var1 != e.Z && var1 != Code.Z && var6 > 0) {
                    var8 = false;
                    if (e.Code(e.Code(e.J, var6 - 1))) {
                        var11 = Code.Code[52];
                    }
                }
            }

            if ((!var2 || !var10) && (!var8 || var1 == e.J)) {
                this.Code(var7, var4 == null ? null : var4 + var6 + (var4.length() > 0 ? ":" : ""), var9, var5 - var6, false, var1 == e.C && this.af == 0 ? var6 == e.q : false, false, var11);
            }
        }

    }

    private void I(String var1, String var2) {
        this.S();
        int var3 = this.au;
        int var4 = e.B(0) + 6;
        if (var2 != null) {
            this.Code((byte)76, var1, var2, false, 3, this.au + 2, this.l - 6, var4 - 4);
        }

        this.B(var4);
        this.C(3);
        this.Code((String)var1, 1, -16777216);
        this.S();
        this.au = var3 + var4 + 4;
    }

    private static void Code(int var0, int var1, byte[] var2) {
        boolean var10001;
        int var3;
        Object[] var4;
        DataInputStream var37;
        int var5;
        byte[] var6;
        Vector var39;
        switch(var0) {
            case 0:
                e.t = var1;

                try {
                    var1 = (var37 = new DataInputStream(new ByteArrayInputStream(var2))).readByte() & 255;
                    var39 = new Vector(Math.min(1, var1));
                    var3 = 0;

                    while(var3 < var1) {
                        if (var3 == 0) {
                            (var4 = new Object[4])[1] = var37.readUTF();
                            var4[0] = var37.readUTF();
                            var6 = new byte[var5 = var37.readShort() & '\uffff'];
                            var37.readFully(var6, 0, var5);
                            var4[2] = var6;
                            var37.skip((long)(var37.readShort() & '\uffff'));
                            var39.addElement(var4);
                            ++var3;
                        } else {
                            var37.readUTF();
                            var37.readUTF();
                            var37.skip((long)(var37.readShort() & '\uffff'));
                            var37.skip((long)(var37.readShort() & '\uffff'));
                            ++var3;
                        }
                    }

                    e.I = var39;
                    return;
                } catch (IOException var35) {
                    var10001 = false;
                    return;
                }
            case 1:
            case 2:
                if ((var0 = (var0 - 1 | -(var0 - 1)) >>> 31 ^ 1) != 0) {
                    e.x = var1;
                } else {
                    e.y = var1;
                }

                try {
                    e.Code(new DataInputStream(new ByteArrayInputStream(var2)), (boolean)var0);
                    return;
                } catch (Throwable var34) {
                    var10001 = false;
                    return;
                }
            case 3:
                e.u = var1;

                try {
                    byte[] var38;
                    if ((var38 = new byte[(var37 = new DataInputStream(new ByteArrayInputStream(var2))).readShort()]).length > 0) {
                        var37.readFully(var38, 0, var38.length);
                        if (!e.l) {
                            e.v = e.Code(e.v, var38, "b");
                            return;
                        }
                    }
                    break;
                } catch (Throwable var36) {
                    var10001 = false;
                    return;
                }
            case 4:
                String var10000;
                try {
                    e.s = var1;
                    var10000 = (new DataInputStream(new ByteArrayInputStream(var2))).readUTF();
                } catch (Throwable var33) {
                    var10001 = false;
                    return;
                }

                e.j = var10000;
                return;
            case 15:
                try {
                    e.A = var1;
                    var1 = (var37 = new DataInputStream(new ByteArrayInputStream(var2))).readByte() & 255;
                    var39 = new Vector(var1);

                    for(var3 = 0; var3 < var1; ++var3) {
                        (var4 = new Object[4])[1] = var37.readUTF();
                        var4[0] = var37.readUTF();
                        var6 = new byte[var5 = var37.readShort() & '\uffff'];
                        var37.readFully(var6, 0, var5);
                        var4[2] = var6;
                        var39.addElement(var4);
                    }

                    e.B = var39;
                    e.o();
                    return;
                } catch (IOException var32) {
                    var10001 = false;
                    return;
                }
            case 17:
                if (var1 != e.a) {
                    e.Code(var1, var2);
                    Code.Z();
                    e.Code(e.a);
                    return;
                }
                break;
            case 31:
                try {
                    e.w = var1;
                    e.Code(new DataInputStream(new ByteArrayInputStream(var2)));
                    return;
                } catch (Throwable var31) {
                    var10001 = false;
                    return;
                }
        }

    }

    private void I(int var1, int var2, int var3) {
        for(int var4 = 1; var4 < var2 / 3; ++var4) {
            this.Code(var1 - var4 - this.as, this.au + var2 / 2 - var4 + 1, 1, (var4 << 1) - 1, var3);
        }

    }

    private void Z(String var1, String var2) {
        this.Code(var1, var2, 0, false, false, false, -16777216);
    }

    private void Code(Object[] var1, String var2, String var3, int var4, boolean var5, boolean var6, boolean var7, int var8) {
        if (var3 == null) {
            var3 = "";
        }

        if (var2 == null) {
            var2 = "";
        }

        if (var1 != null) {
            var3 = var3 + (String)var1[1];
            var2 = var2 + (String)var1[0];
        }

        this.Code(var2, var3, var4, var5, var6, var7, var8);
    }

    private void C(int var1) {
        this.S();
        this.au += var1;
    }

    private void Code(int var1, int var2, int var3, int var4) {
        this.l = Math.max(this.l, var1 + var3);
        this.m = Math.max(var2 + var4, this.m);
        if (this.av > 0) {
            Code(this.Z, var1, var2, var3, var4);
        }

    }

    private static void Code(DataOutputStream var0, int var1, int var2, int var3, int var4) {
        var0.writeShort(var1);
        e.Code(var0, var2);
        var0.writeShort(var3);
        e.Code(var0, var4);
    }

    private void Code(byte var1, String var2, String var3, boolean var4) {
        if (this.I[9] != null && this.I[9].equals(var3)) {
            this.af = this.aw;
        }

        ++this.aw;
        this.Z.write(var1);
        if (var4) {
            this.ac = this.Z.size();
        }

        this.Z.writeUTF(var2);
        this.Z.writeUTF(var3);
        this.av = this.Z.size();
        this.Z.write(0);
    }

    private void I(String var1, int var2) {
        ++this.aw;
        this.Z.write(73);
        this.Z.writeUTF(var1);
        this.Z.writeShort(3);
        e.Code(this.Z, var2);
        this.av = this.Z.size();
        this.Z.write(0);
    }

    private void I(int var1, int var2, int var3, int var4, int var5) {
        this.I.write(73);
        Code(this.I, var2, var3, var4, var5);
        this.I.writeInt(0);
        this.I.write(0);
        this.I.write(0);
        this.I.write(0);
        e.Code(this.I, var1);
    }

    private void Code(int var1, int var2, int var3, int var4, int var5) {
        this.Code(var1, var2, var3, var4);
        this.I.write(66);
        Code(this.I, var1, var2, var3, var4);
        this.I.writeInt(var5);
    }

    private void Code(String var1, int var2, int var3, int var4, int var5) {
        int var6 = e.Code(var2, var1);
        int var7 = e.B(var2);
        this.Code(var4, var5, var6, var7);
        this.I.write(84);
        Code(this.I, var4, var5, var6, var7);
        this.I.writeInt(var3);
        this.I.write(e.I(var2));
        this.I.writeUTF(var1);
    }

    private void Code(String var1, int var2, int var3) {
        while(true) {
            int var4;
            if ((var4 = var1.indexOf(10)) >= 0) {
                if (var4 > 0) {
                    this.Code(var1.substring(0, var4), var2, var3);
                }

                this.S();
                var1 = var1.substring(var4 + 1, var1.length());
                this = this;
            } else {
                var4 = e.Code(var2, var1);
                int var5 = this.j() - Math.min(this.at, this.ar) - this.as;
                if (var4 <= var5) {
                    var5 = e.B(var2);
                    this.a(var4, var5);
                    this.I.write(84);
                    Code(this.I, this.at, this.au, var4, var5);
                    this.I.writeInt(var3);
                    this.I.write(e.I(var2));
                    this.I.writeUTF(var1);
                    this.at += var4;
                    return;
                }

                for(var4 = var1.lastIndexOf(32, var1.length()); var4 > 0 && e.Code(var2, var1.substring(0, var4)) > var5; var4 = var1.substring(0, var4).lastIndexOf(32)) {
                }

                if (var4 > 0 && var4 != var1.length()) {
                    this.Code(var1.substring(0, var4), var2, var3);
                    this.S();
                    var1 = var1.substring(var4 + 1);
                    this = this;
                } else {
                    if (this.Z(e.Code(var2, var1.substring(0, 3)))) {
                        this.S();
                    }

                    var4 = this.j() - this.as - this.at;
                    char[] var6 = var1.toCharArray();
                    var4 = Math.max(e.I(var2, var6, var6.length, var4), 1);
                    this.Code(var1.substring(0, var4), var2, var3);
                    var1 = var1.substring(var4);
                    this = this;
                }
            }
        }
    }

    static void I(e var0) {
        if (e.H < 160 && e.aA) {
            var0.Code("overlay:" + e.I(40), (String)null, (String)null);

            while(e.aF) {
                e.Code(e.I, 1000);
            }

            Code.Code.I(Code.Code(40));
        }

        if (e.H >= 160 && e.I[1] == null) {
            byte[] var1;
            e.Code(var1 = new byte[32]);
            e.Code(1, e.I(var1, var1.length), true);
        }

    }

    private int Code(int var1, int var2, int var3, int var4, char var5, int var6, String var7, String var8, int var9, int var10) {
        this.I.write(70);
        Code(this.I, var1, var2, var3, var4);
        this.I.writeInt(var10);
        this.I.write(var5);
        this.I.write(var6);
        this.I.writeUTF(var7);
        this.I.writeUTF(var8);
        e.Code(this.I, var9);
        var10 = this.Code.size();
        this.Code.write(70);
        Code(this.Code, var1, var2, var3, var4);
        this.Code.writeInt(0);
        this.Code.write(var5);
        this.Code.write(var6);
        this.Code.writeUTF(var7);
        this.Code.writeUTF(var8);
        e.Code(this.Code, var9);
        return var10;
    }

    private int n() {
        this.ax = 0;
        this.ao = this.Code.size();
        e.Code(this.Code, 0);
        return this.ao;
    }

    private void B(String var1, String var2) {
        ++this.ax;
        this.Code.writeUTF(var1);
        this.Code.writeUTF(var2);
    }

    private void a(int var1) {
        if (var1 > this.C) {
            this.C = var1;
            if (var1 == 7 || var1 == 4 || var1 == 5 || var1 == 6) {
                if (var1 == 4 && this.Code != null && this.Code[4] == 1) {
                    this.I(true);
                }

                Code.b = false;
                e.Code(Code.Code);
            }

            if (!e.aA && e.a.equals(this.Code)) {
                this.Code = 13;
                this.I = 14;
                this.j = true;
                this.B = true;
            }

            if (this.Code != null) {
                this.Code.Code(this);
            }

            if (var1 >= 5) {
                e.Code(0L, (long)this.ay, 0L);
                this.ay = 0;
            }

        }
    }

    private void W() {
        DataInputStream var1;
        int var2;
        for(var1 = new DataInputStream(this.Code); (var2 = var1.readUnsignedByte()) == 255; this.aI = var1.readUnsignedByte()) {
            this.a(2);
        }

        this.am = var2 << 16 | var1.readUnsignedShort();
        this.a(3);
        if (this.d && this.C >= 3) {
            this.V();
        } else {
            var2 = (var1.readUnsignedByte() << 16) + var1.readUnsignedShort();

            int var5;
            for(int var3 = 0; var3 < var2; var3 += var5 + 3) {
                byte var4 = var1.readByte();
                var5 = var1.readUnsignedShort();
                int var6;
                int var18;
                int var23;
                switch(var4) {
                    case 35:
                        ++Code.Code;
                        Code.J = true;
                        Vector var19 = new Vector(9);

                        for(var6 = 0; var6 < 9; ++var6) {
                            var19.addElement(e.Code(e.Code(e.J, var6)));
                        }

                        boolean var22 = Code.I;
                        DataInputStream var10000 = var1;

                        try {
                            byte var25 = var10000.readByte();
                            int var29 = 0;

                            while(true) {
                                if (var29 >= var25) {
                                    if (!var22) {
                                        e.aD = true;
                                        e.o();
                                        e.J = var19;
                                        e.Code(var19, true);
                                        Code.Code.Code(e.J);
                                    }
                                    break;
                                }

                                byte var30 = var1.readByte();
                                int var10 = var1.readUnsignedShort();
                                byte[] var11 = null;
                                if (var10 > 0) {
                                    var11 = new byte[var10];
                                    var1.readFully(var11);
                                }

                                String var12 = var1.readUTF();
                                String var13 = var1.readUTF();
                                int var14 = var1.readInt();
                                if (var22) {
                                    ++var29;
                                } else {
                                    int var15 = var13.length() == 0 && var12.length() == 0 && var10 == 0 ? 1 : 0;
                                    if (var30 > 0 && var30 <= 9 && (var15 != 0 || var13.length() != 0 && var12.length() != 0 && var10 != 0) && (e.Code(e.Code(var19, var30 - 1), 9) & 1) == 0) {
                                        Object[] var31;
                                        if ((var10 = e.Code(var31 = e.Code(var19, var30 - 1), 5)) == 97) {
                                            var31[5] = new Integer(83);
                                        } else if (var10 == 83 && (e.Code(var31, 9) & 4) != 0) {
                                            var31[5] = new Integer(82);
                                        }

                                        var31[0] = var13;
                                        var31[1] = var12;
                                        var31[2] = var11;
                                        var31[9] = new Integer((var15 ^ 1) << 1);
                                        var31[10] = new Integer(var15 != 0 ? 0 : var14);
                                        ++var29;
                                    } else {
                                        Code.Code(new Integer(var14), false);
                                        ++var29;
                                    }
                                }
                            }
                        } finally {
                            ;
                        }

                        Code.J = false;
                        break;
                    case 99:
                        var4 = var1.readByte();

                        for(var6 = 0; var6 != var4; ++var6) {
                            short var7 = var1.readShort();
                            byte var8 = -1;
                            if (var7 == 1) {
                                var8 = var1.readByte();
                            }

                            var23 = var1.readInt();
                            byte[] var9 = new byte[var1.readUnsignedShort()];
                            var1.readFully(var9);
                            Code(var8, var23, var9);
                        }

                        Code.Z();
                        e.C(false);
                        break;
                    case 102:
                        var18 = Thread.currentThread().getPriority();
                        Thread.currentThread().setPriority(5);
                        Code.b = false;
                        this.Code.Code("overlay:" + e.I(34), (String)null, (String)null);
                        Code.Code.c();
                        this.Code.close();
                        this.l = true;
                        e.b(true);
                        Code.Code.I(Code.Code(40));
                        Code.Code.d();
                        Thread.currentThread().setPriority(var18);
                        break;
                    case 103:
                        Code.B();
                        break;
                    default:
                        if (!this.Code.J()) {
                            e.Code(var1, (long)var5);
                        } else {
                            String var20;
                            String var24;
                            switch(var4) {
                                case 67:
                                    var18 = var1.readUnsignedByte();
                                    this.j |= var18 & 1;
                                    this.B |= (var18 & 2 | -(var18 & 2)) >>> 31;
                                    this.J |= (var18 & 4 | -(var18 & 4)) >>> 31;
                                    break;
                                case 68:
                                    var20 = var1.readUTF();
                                    var24 = var1.readUTF();
                                    var1.readUTF();
                                    Code.Code.Code(var20, var24);
                                    break;
                                case 73:
                                    var4 = var1.readByte();
                                    String[] var28 = new String[var1.readByte()];

                                    for(var23 = 0; var23 < var28.length; ++var23) {
                                        var28[var23] = var1.readUTF();
                                    }

                                    if (var4 == 99 && var28.length == 2) {
                                        this.I = var28;
                                    }
                                    break;
                                case 75:
                                    var18 = var1.readUnsignedByte();
                                    var24 = var1.readUTF();
                                    if (var18 == 0) {
                                        e var21 = this.Code.I();
                                        ((Object[])e.Code.get(var21.Code()))[1] = var24;
                                    } else {
                                        e.Code(var18, var24, true);
                                    }
                                    break;
                                case 101:
                                    this.h = var1.readInt();
                                    this.Code = (char)var1.readByte();
                                    this.a = var1.readUTF();
                                    if (Code.Code() == this || Code.Code().Code() == this) {
                                        I.J();
                                    }
                                    break;
                                case 110:
                                    byte[] var27 = new byte[var18 = var1.readUnsignedShort()];
                                    e.i = var1.readUTF();
                                    var1.readFully(var27);
                                    if (var18 == 0) {
                                        e.aB = true;
                                    } else {
                                        e.aB = false;
                                        e.r = e.Code(e.r, var27, "b");
                                    }

                                    e.C(false);
                                    Code.h();
                                    I = null;
                                    Code.Code.Code();
                                    Code.Code.I();
                                    break;
                                case 112:
                                    var20 = var1.readUTF();
                                    I var26;
                                    (var26 = new I(6)).Code = var20;
                                    e.Code(var26);
                                    break;
                                case 114:
                                    var20 = var1.readUTF();
                                    this.C();
                                    this.Code.Code(var20, this.Code, (String)null);
                                    break;
                                case 115:
                                    var20 = var1.readUTF();
                                    var24 = var1.readUTF();
                                    (new f(var20, var24)).Code();
                                    break;
                                default:
                                    e.Code(var1, (long)var5);
                            }
                        }
                }
            }

            this.Code(var1);
            this.a(5);
        }
    }

    private synchronized void X() {
        this.aC = 0;
        int var1 = this.t();
        this.l = this.s();
        this.m = this.p();
        this.t();
        this.t();
        this.t();
        this.s();
        this.I = this.B();
        int var2;
        if ((var2 = this.s()) > 0) {
            this.Code = new byte[var2];
            byte[] var3 = this.Code;
            System.arraycopy(this.I, this.aC, var3, 0, var2);
            this.aC += var2;
        }

        this.c = this.B();
        this.b = this.Code;
        this.Code = this.C();
        var2 = this.t();
        this.b = (boolean)(var2 & 1);
        this.a = (var2 & 6) >>> 1;
        this.a = (boolean)((var2 & 16 | -(var2 & 16)) >>> 31);
        if (var1 >= 12) {
            this.M = this.t();
            this.N = this.p();
        }

        if (!this.b && this.Code.Code != null && this.Code.Code != this.Code.I) {
            this.n = this.p = this.Code.Code.n;
            this.o = this.q = this.Code.Code.o;
            this.O = this.Code.Code.O;
            this.P = this.Code.Code.P;
            this.Code.B = true;
            this.I(false);
        }

        this.Z = null;
        this.I = new Hashtable();
        this.aj = this.aC;
        this.aa();
    }

    final synchronized void b() {
        int var1 = 0;
        this.aC = this.ac;

        while(this.aC <= this.ad && var1 < this.ae) {
            int var2 = this.aC;
            this.w();
            if (e.I(this.B(), "menu:")) {
                var1 = var2;
            }
        }

        if (var1 > 0) {
            this.ae = var1;
            this.B(false);
        }

    }

    private void b(int var1, int var2) {
        this.d = this.I(this.d);
        this.e = this.I(this.e);
        this.f = this.I(this.f);
        this.g = this.I(this.g);
        if (this.f == 0) {
            this.f = 1;
        }

        if (this.g == 0) {
            this.g = 1;
        }

        this.d += var1;
        this.e += var2;
    }

    final int C() {
        return this.m;
    }

    private boolean Code(Graphics var1) {
        return e.Code(this.d, this.e, this.f, this.g, var1.getClipX(), var1.getClipY(), var1.getClipWidth(), var1.getClipHeight());
    }

    final synchronized boolean C() {
        if (this.ae != 0 && this.I[this.ae] == 73) {
            int var1 = this.aC;
            this.aC = this.ae;
            this.w();
            this.aC += 2;
            this.aC = this.p();
            this.aC += 15;
            int var2 = this.t();
            this.aC = var1;
            return var2 == 120 || var2 == 97 || var2 == 112 || var2 == 102 || var2 == 115;
        } else {
            return false;
        }
    }

    private void Code(Graphics var1, int var2, int var3, int var4, int var5, boolean var6) {
        this.Code(var1, var2, var3, var4, var4, var5, var6, false);
    }

    private Image Code(Integer var1) {
        int var2 = (var1 & 1073741824) != 0 ? 256 * this.k() / this.l : 256;
        if (var1 < 0) {
            return Code.Code.Code((Object[])this.B.elementAt(-6000 - var1));
        } else {
            int var4 = var1 & 536870911;
            int var3 = e.I(this.I, var4);
            return e.Code(this.I, var4 + 2, var3, var2, (Object[])null);
        }
    }

    private synchronized Image Code(int var1, int var2, int var3) {
        int var4 = 256;
        if (this.r < 128) {
            var4 = 256 * this.k() / this.l;
        }

        Integer var8 = new Integer(var1 | ((var4 - 256 | -(var4 - 256)) >>> 31 ^ 1) * 536870912 | (var4 != 256 && (var3 & 4) == 0 ? 1073741824 : 0));
        if (this.J.containsKey(var8)) {
            return null;
        } else if (this.Z.containsKey(var8)) {
            return (Image)this.Z.get(var8);
        } else if (var1 < 0 && (var1 > -6000 || var1 <= -7000)) {
            Image var10000;
            if (var1 > -1000) {
                var10000 = var1 == -41 ? Code.Code.Code : e.Code(e.Code(-var1), "" + var1);
            } else {
                byte[] var12;
                if (var1 > -3000) {
                    Vector var11 = var1 <= -2000 ? e.C : e.Z;
                    short var10001;
                    int var10002;
                    if (var1 <= -2000) {
                        var10001 = -2000;
                        var10002 = var1;
                    } else {
                        var10001 = -1000;
                        var10002 = var1;
                    }

                    var12 = (byte[])e.Code(var11, var10001 - var10002)[2];
                    var10000 = e.Code(var12, var12);
                } else if (-3000 - var1 < Code.Z.size() && -3000 - var1 >= 0) {
                    var12 = (byte[])((Object[])Code.Z.elementAt(-3000 - var1))[2];
                    var10000 = e.Code(var12, var12);
                } else {
                    label209: {
                        if (-4000 - var1 != -1) {
                            if (-4000 - var1 < e.J.size() && -4000 - var1 >= 0) {
                                var12 = (byte[])((Object[])e.J.elementAt(-4000 - var1))[2];
                                var10000 = e.Code(var12, var12);
                                break label209;
                            }

                            if (-5000 - var1 < e.a.size() && -5000 - var1 >= 0) {
                                var12 = (byte[])((Object[])e.a.elementAt(-5000 - var1))[2];
                                var10000 = e.Code(var12, var12);
                                break label209;
                            }

                            byte[] var5;
                            if (-7000 - var1 < e.I.size() && -7000 - var1 >= 0) {
                                if (e.r) {
                                    Image var10;
                                    var10000 = (var10 = e.Code(var5 = (byte[])((Object[])e.I.elementAt(-7000 - var1))[2], 0, var5.length, 256, (Object[])null)).getWidth() == 1 && var10.getHeight() == 1 ? var10 : e.Code(var5, var5);
                                    break label209;
                                }
                            } else {
                                if (-8000 - var1 < e.B.size() && -8000 - var1 >= 0) {
                                    var12 = (byte[])((Object[])e.B.elementAt(-8000 - var1))[2];
                                    var10000 = e.Code(var12, var12);
                                    break label209;
                                }

                                if (-9000 - var1 < Code.I.size() && -9000 - var1 >= 0) {
                                    var5 = null;
                                    e var6;
                                    if ((var6 = (e)Code.I.elementAt(-9000 - var1)).Code() != null) {
                                        var10000 = e.Code();
                                    } else if (var6.Code != null && e.I(var6.Code.Code) == 65) {
                                        var10000 = e.Code(91);
                                    } else {
                                        if (var6.Code != null) {
                                            var5 = var6.Code.Code;
                                        }

                                        var10000 = e.Code(var5, var5);
                                    }
                                    break label209;
                                }

                                if (var1 == -10000) {
                                    var10000 = e.Code(89);
                                    break label209;
                                }

                                if (var1 == -10001) {
                                    var10000 = e.Code(90, 0, Math.max(Code.d, e.B(0)));
                                    break label209;
                                }

                                if (var1 <= -11000 && var1 > -12000) {
                                    var10000 = e.Code(-11000 - var1, this.s);
                                    break label209;
                                }
                            }
                        }

                        var10000 = null;
                    }
                }
            }

            Image var9 = var10000;
            if (var4 != 256) {
                var9 = e.Code(var9, 0, Code(var9.getHeight(), var4), 1, true);
            }

            if (var1 <= -9000 && var1 > -10000) {
                var1 = -9000 - var1;
                if (this.I != null && this.I[var1] == 0) {
                    this.I[var1] = var2;
                }
            } else if (var1 > -11000 || var1 <= -12000) {
                this.Code(var8, var9);
            }

            return var9;
        } else {
            Image var7;
            if (var2 == 0) {
                if (var1 < -6000) {
                    return Code.Code.Code();
                } else {
                    var7 = this.Code(var8);
                    this.Code(var8, var7);
                    return var7;
                }
            } else if (!e.m) {
                this.B.put(new Integer(var2 | var8 & 1610612736), var8);
                I.Code(this);
                return var1 < -6000 ? Code.Code.Code() : null;
            } else if (var1 >= -6000 && (var1 + 2 > this.ak || var1 + e.I(this.I, var1) > this.ak)) {
                this.ad();
                return null;
            } else {
                var7 = this.Code(var8);
                this.Code(var8, var7);
                return var7;
            }
        }
    }

    final int Code() {
        return this.C == 2 ? 4375 : this.am;
    }

    final int Z() {
        return this.Code != null ? this.Code.a() : 0;
    }

    private synchronized void Code(Integer var1, Image var2) {
        if (var2 != null) {
            this.Z.put(var1, var2);
        } else {
            this.J.put(var1, var1);
        }
    }

    final synchronized void Code(int var1) {
        if (var1 > 0) {
            this.Z.clear();
        } else {
            if (var1 >= 0) {
                Hashtable var5 = new Hashtable();
                Enumeration var2 = this.B.keys();

                while(var2.hasMoreElements()) {
                    Integer var3 = (Integer)var2.nextElement();
                    Integer var4 = (Integer)this.B.get(var3);
                    if (this.Z.containsKey(var4) && this.Code(var3, false, true, 1000)) {
                        var5.put(var4, this.Z.get(var4));
                    }
                }

                this.Z = var5;
            }

        }
    }

    final void Z(boolean var1) {
        if (var1) {
            this.ae = this.ac;
        }

        this.Code(0, -this.m, false, false);
    }

    final void Code(String var1, int var2, Object var3) {
        if (this.I == null) {
            this.I = new Hashtable();
        }

        this.I.put(this.B, new Object[]{var1, new Integer(var2), var3});
        this.Code(var1, false);
    }

    private int v() {
        int var1;
        do {
            if (this.aC > this.ad) {
                return this.aC;
            }

            var1 = this.aC;
            this.t();
            int var2 = this.t();
            this.Y();
            this.aC += var2 * 10 - 10;
            this.af();
        } while(this.I[var1] == 105 || (this.Z[this.I(this.e, 0) * 6 + 4] & 1) == 0);

        return var1;
    }

    private boolean c() {
        return this.m || this.l <= this.k();
    }

    private synchronized void I(Integer var1, Image var2) {
        this.Code = null;
        int var3 = 0;
        if (var1 != null) {
            this.Code(var1, var2);
            if (var2 != null) {
                var3 = var1;
            } else {
                var3 = 0;
            }
        }

        Enumeration var6 = this.B.keys();

        while(true) {
            int var10000;
            Integer var5;
            do {
                do {
                    do {
                        int var10001;
                        int var10002;
                        do {
                            do {
                                if (!var6.hasMoreElements()) {
                                    if (this.Code != null) {
                                        I.Code(this);
                                        return;
                                    }

                                    if (var1 != null) {
                                        I.Code = false;
                                        this.c(0);
                                    }

                                    return;
                                }

                                Integer var4 = (Integer)var6.nextElement();
                                var5 = (Integer)this.B.get(var4);
                                var10001 = var4;
                                var10002 = var3 - var5;
                            } while(!this.Code(var10001, (boolean)((var10002 | -var10002) >>> 31 ^ 1), false, 1000));
                        } while(this.Z.containsKey(var5));
                    } while(this.J.containsKey(var5));

                    var10000 = var5 & 536870912;
                } while(((var10000 | -var10000) >>> 31 ^ this.Z()) == 0);
            } while(!this.I() && this.ak < (var5 & 536870911) + 2 + e.I(this.I, var5 & 536870911));

            this.Code = var5;
        }
    }

    final void Code(boolean var1) {
        if (this.Code()) {
            if (var1) {
                this.Code = null;
            }

            if (this.Code == null) {
                this.I((Integer)null, (Image)null);
            } else {
                I.Code = true;
                this.I(this.Code, this.Code(this.Code));
            }
        }
    }

    private void Y() {
        this.d = this.s();
        this.e = this.p();
        this.f = this.s();
        this.g = this.p();
    }

    private int o() {
        this.aC += 4;
        return (this.I[this.aC - 4] << 24) + ((this.I[this.aC - 3] & 255) << 16) + ((this.I[this.aC - 2] & 255) << 8) + (this.I[this.aC - 1] & 255);
    }

    private int p() {
        this.aC += 3;
        return ((this.I[this.aC - 3] & 255) << 16) + ((this.I[this.aC - 2] & 255) << 8) + (this.I[this.aC - 1] & 255);
    }

    private int s() {
        this.aC += 2;
        return e.I(this.I, this.aC - 2);
    }

    private int t() {
        return this.I[this.aC++] & 255;
    }

    private String B() {
        String var1 = e.Code(this.I, this.aC);
        this.aC += this.s();
        return var1;
    }

    private synchronized int Code(int var1) {
        label135:
        for(this.aC = var1; this.aC < this.I.length && this.ak == this.I.length || this.aC < this.ak - 16; var1 = this.aC) {
            int var2 = this.aC;
            int var3;
            int var4;
            switch(var3 = this.t()) {
                case 76:
                    var1 = this.p();
                    if (this.c() && var1 > 0) {
                        this.ae = var1;
                    }

                    this.ac = this.p();
                    this.ad = this.p();
                    if (this.Code != null && !this.Code.J() && this.b != null && !this.b.equals(e.a)) {
                        this.ae = 0;
                        this.ac = 0;
                        this.ad = 0;
                    }
                    break;
                case 77:
                    var2 = this.t();
                    var3 = this.p();
                    if (this.aC + var3 > this.ak) {
                        return var1;
                    }

                    switch(var2) {
                        case 67:
                            var3 -= 8;
                            this.H = var3 / 6;
                            this.Z = new int[(this.s() << 1) + this.H * 7];
                            this.K = this.t();
                            this.F = this.s();
                            this.G = this.p();
                            boolean var6 = false;
                            if (this.Code != null && this.Code.indexOf(35) != -1) {
                                var6 = true;
                            }

                            if (this.b && !this.Code) {
                                if (this.Z()) {
                                    this.Code(this.F + this.k() / 2 - this.O, this.G + this.l() / 2 - this.P, true);
                                } else if (this.J() || !e.ax || var6) {
                                    this.Code(this.F - this.p, this.G - this.q, false, true);
                                }

                                this.e();
                            }

                            var1 = this.H * 6;
                            var2 = 0;

                            for(var3 = 0; var3 / 6 < this.H; var2 += var4) {
                                var4 = this.p();
                                this.Z[var3++] = var2;
                                this.Z[var3++] = var4;
                                this.Z[var3++] = var1;
                                ++var3;
                                this.Z[var3++] = this.t();
                                ++var3;
                                var1 += 2 * this.s() + 1;
                            }

                            this.ab();
                            continue;
                        case 83:
                            this.Code = new String[7];
                            var1 = 0;

                            while(true) {
                                if (var1 >= 7) {
                                    continue label135;
                                }

                                this.Code[var1] = this.B();
                                ++var1;
                            }
                        case 84:
                            this.ag = var3 / 12;
                            this.J = new int[var3];
                            var1 = 0;

                            while(true) {
                                if (var1 >= this.ag << 2) {
                                    continue label135;
                                }

                                this.J[var1] = this.p();
                                ++var1;
                            }
                        case 115:
                            this.Code = this.t();
                            this.I = this.t();
                            continue;
                        case 117:
                            var1 = this.o();
                            if (!this.C) {
                                this.ay += var1;
                            }
                            continue;
                        default:
                            this.aC += var3;
                            continue;
                    }
                case 83:
                    this.aC += this.p();
                    break;
                default:
                    this.Y();
                    this.b(var3);
                    if (this.aC > this.ak) {
                        return var1;
                    }

                    if (!this.C) {
                        this.d = (short)this.d + this.aA;
                        this.e = (this.e << 8 >> 8) + this.aB;
                        e.Code(this.d, this.I, var2 + 1);
                        e.Z(this.e, this.I, var2 + 3);
                        this.aA = this.d;
                        this.aB = this.e;
                    }

                    var1 = this.aC;
                    var2 = var2;
                    B var7 = this;
                    var4 = this.I(this.e, 0);

                    do {
                        int var5;
                        for(var5 = var7.Z[var4 * 6 + 2]; var7.Z[var5 + 2] != 0; var5 += 2) {
                        }

                        if (var7.Z[var5] == 0) {
                            var7.Z[var5] = var2;
                        } else if (var7.Z[var5 + 1] + var7.K < var2) {
                            var5 += 2;
                            var7.Z[var5] = var2;
                        }

                        var7.Z[var5 + 1] = var1;
                        ++var4;
                    } while(var4 < var7.H && var7.e + var7.g > var7.Z[var4 * 6]);

                    this.I(this.d, this.e, this.f, this.g);
            }
        }

        return var1;
    }

    private void ae() {
        if (!this.c()) {
            this.ae = this.Code(this.O, this.P, 1, 1, 0, false);
        }

    }

    private synchronized void b(boolean var1) {
        if (this.c() && !var1) {
            int var6 = -1;
            int var2 = -1;
            int var3 = 0;
            this.aC = this.ae + 1;

            for(int var4 = this.t(); var4 > 0; --var4) {
                this.Y();
                this.e = this.J(this.e);
                int var5;
                if ((var5 = Math.min(this.e + this.g, this.o + this.l()) - Math.max(this.e, this.o)) > var3) {
                    var3 = var5;
                    var6 = this.d + this.f / 2;
                    var2 = this.e + this.g / 2;
                }
            }

            this.O = var6;
            this.P = var2;
        }
    }

    final void B(int var1, int var2) {
        if (!this.p) {
            if (this.I(2)) {
                this.ae = this.Code(var1 + this.n, var2 + this.o, 1, 1, -1, false);
                if (this.ae > 0 && this.ae != this.ab) {
                    Code.Code.Code(this.Code);
                    this.ab = this.ae;
                    if (e.I(this.Code(this.ab, 76), "menu:")) {
                        this.B(false);
                        return;
                    }
                }
            } else {
                int var4;
                if (this.ab >= 0 && (Math.abs(this.V - var1) > 6 || Math.abs(this.W - var2) > 6)) {
                    Vector var3;
                    if ((var3 = e.I(this.Code) == 90 && e.I(this.Code(this.ae, 76), "bookmark:") ? e.Z : (e.I(this.Code) == 109 && e.I(this.Code(this.ae, 76), "search:") ? e.C : null)) != null && this.ab > 0) {
                        var4 = e.Code(this.Code(this.ab, 76));
                        byte var5 = 0;
                        if (var3 == e.C) {
                            var5 = 1;
                        }

                        this.B(this.ab);
                        if (var4 >= var5 && (var2 + this.o < this.e && var4 > var5 || var2 + this.o > this.e + this.g && var4 + 1 < var3.size())) {
                            this.Code.Code(var3, var2 + this.o < this.e ? -1 : 1);
                            this.Code.Code.ab = this.Code.Code.ae;
                            this.Code.Code.V = var1;
                            this.Code.Code.W = var2;
                        }

                        this.Code.Code.o = true;
                    } else {
                        this.ae = 0;
                        this.ab = -1;
                        if (e.p) {
                            this.V = var1;
                            this.W = var2;
                        }

                        this.X = this.Y = this.p;
                        this.aa = this.W;
                    }
                }

                if (this.ab < 0) {
                    int var12 = this.V - var1 << 1;
                    var4 = this.Code(this.q, this.W - var2 << 1, this.r);
                    int var13 = this.p;
                    if (this.X == this.Y) {
                        if (Math.abs(this.W - this.aa) > 20) {
                            this.Y = -1;
                        } else if (var12 > 40) {
                            this.Y += this.I(var13, var4, this.l - this.k() - var13);
                        } else if (var12 < -40) {
                            this.X += this.I(var13, var4, -var13);
                        }
                    }

                    if (this.Y < this.X) {
                        B var6 = this;
                        int var7 = var13 + Math.min(0, 0 * this.k());
                        int var8 = (Math.abs(0) + 1) * this.k();
                        int var9 = -1;
                        int var10 = 2147483647;

                        for(int var11 = 0; var11 < var6.ag; ++var11) {
                            if (e.Code(var7, var4 + var6.ai, var8, var6.l() - 2 * var6.ai, var6.J[var11 << 2], var6.J[(var11 << 2) + 1], var6.J[(var11 << 2) + 2] - var6.J[var11 << 2], var6.J[(var11 << 2) + 3] - var6.J[(var11 << 2) + 1]) && Math.abs(var6.J(var11, var13) - var13) < var10) {
                                var9 = var11;
                                var10 = Math.abs(var6.J(var11, var13) - var13);
                            }
                        }

                        int var14 = Math.abs(var10) <= var6.k() - var6.ah ? var9 : -1;
                        if (Math.abs(var13 - this.J(var14, var13)) < this.k() / 2) {
                            var13 = this.J(var14, var13);
                        }
                    }

                    if (this.Y > this.X) {
                        var13 = e.Code(var13 + var12, this.X, this.Y);
                        this.V = var1;
                    }

                    this.c(var13, var4);
                    if (Math.abs(this.n - this.p) <= Math.abs(var12)) {
                        this.n = this.p;
                    }

                    this.o = this.q;
                    this.W = var2;
                }
            }

            this.P = this.Code(this.o, var2, this.r);
            this.O = this.n + (this.P >= this.L ? this.Z(var1) : var1);
            e.a();
        }

    }

    final synchronized void Code(int var1, int var2, int var3) {
        int var4;
        int var5;
        if (this.c()) {
            if (var1 != 0) {
                this.Code(0, var1 * this.h(), false, false);
            } else if (var3 >= 8 && this.q > 0 && this.q < this.m - this.l()) {
                this.Code(0, var2 * (var3 + 39), false, false);
            } else {
                boolean var7 = false;
                if (this.ae > 0) {
                    this.B(this.ae);
                    var7 = e.Code(0, this.e, 1, this.g, 0, this.q, 1, this.l());
                }

                if ((var3 = this.ac) > 0) {
                    this.aC = var3;
                    var3 = this.v();
                }

                var4 = var3;
                var5 = var3;
                if (var3 > 0 && var3 <= this.ad) {
                    int var6;
                    do {
                        var6 = var5;
                        var5 = var4;
                        var4 = this.B(var4);
                        this.aC = var4;
                        var4 = this.v();
                        this.B(var5);
                        if (var2 < 0) {
                            if (var7) {
                                if (var5 == this.ae || var4 == this.ae) {
                                    break;
                                }
                            } else if (this.e + this.g > this.q + this.l()) {
                                var5 = var6;
                                this.B(var6);
                                break;
                            }
                        } else if (var7) {
                            if (var5 > this.ae) {
                                break;
                            }
                        } else if (this.e >= this.q) {
                            break;
                        }
                    } while(var4 <= this.ad);

                    this.aC = var4;
                    var4 = var4 > this.ad ? var5 : this.ad;
                    var6 = this.q;
                    if (var2 < 0) {
                        if ((var5 == var3 || this.e < var6) && (var5 == this.ae || this.e + this.g < var6 + k) && var6 > 0) {
                            var6 -= 44;
                        }
                    } else if ((var5 == var4 || this.e + this.g > var6 + this.l()) && (var5 == this.ae || this.e > var6 + this.l() - k) && var6 + this.l() < this.m) {
                        var6 += 44;
                    }

                    if (this.k) {
                        if (var2 < 0 && this.q == 0 && (!var7 || this.ae == var3)) {
                            var6 = this.m - this.l();
                            var5 = var4;
                            this.ae = var4;
                        }

                        if (var2 > 0 && this.q + this.l() >= this.m && (!var7 || this.ae == var4)) {
                            var6 = 0;
                            var5 = var3;
                            this.ae = var3;
                        }

                        this.B(var5);
                    }

                    if (var6 == this.q) {
                        this.ae = var5;
                    }

                    this.c(this.p, var6);
                } else {
                    this.c(this.p, this.q + var2 * 44);
                }
            }
        } else {
            if (var3 < 5) {
                if (this.Z() && this.P >= this.L) {
                    if (this.L > 0 && this.P + var2 * (44 + (var3 << 1)) < this.L) {
                        this.O = this.I(this.O);
                        this.P = this.L - 1;
                        this.Code(var1, var2, var3);
                        return;
                    }

                    this.Code(var1 * (44 + (var3 << 1)), var2 * (44 + (var3 << 1)), false);
                    this.n = this.p;
                    this.o = this.q;
                    return;
                }

                var4 = this.O;
                var5 = this.P;
                if (var2 != 0) {
                    this.ae = this.Code(this.O - 1, this.P + var2, 3, var2 * 22, this.ae, false);
                } else {
                    this.ae = this.Code(this.O + var1, this.P, var1 * 22, 1, this.ae, false);
                }

                B var10000;
                int var10001;
                int var10002;
                boolean var10003;
                label213: {
                    if (this.P < this.L && this.P + (this.ae > 0 ? this.aN - this.P : var2 * 22) >= this.L) {
                        var10000 = this;
                        var10001 = this.Z(this.O) - this.O;
                        var10002 = this.Code(this.P, 22, this.r) - this.P;
                    } else {
                        if (this.ae > 0) {
                            var10000 = this;
                            var10001 = this.aM - this.O;
                            var10002 = e.Code(this.aN, this.P - 44, this.P + 44) - this.P;
                            var10003 = true;
                            break label213;
                        }

                        var10000 = this;
                        var10001 = var1 * 22;
                        var10002 = var2 * 22;
                        if (var3 < 5) {
                            var10003 = true;
                            break label213;
                        }
                    }

                    var10003 = false;
                }

                var10000.Code(var10001, var10002, var10003);
                if (Math.abs(this.p - this.n) <= Math.abs(var4 - this.O)) {
                    this.n = this.p;
                }

                if (Math.abs(this.q - this.o) <= Math.abs(var5 - this.P)) {
                    this.o = this.q;
                    return;
                }
            } else if (var3 == 5) {
                this.Q = (int)System.currentTimeMillis();
                this.R = this.O;
                this.S = this.P;
                this.T = var1;
                this.U = var2;
            }

        }
    }

    private synchronized int B(int var1) {
        int var2 = 2147483647;
        int var3 = 2147483647;
        int var4 = 0;
        int var5 = 0;
        this.aC = var1;
        this.t();

        for(var1 = this.t(); var1 > 0; --var1) {
            this.Y();
            var2 = Math.min(var2, this.d);
            var3 = Math.min(var3, this.e);
            var4 = Math.max(var4, this.d + this.f);
            var5 = Math.max(var5, this.e + this.g);
        }

        this.af();
        this.d = var2;
        this.e = this.J(var3);
        this.f = var4 - var2;
        this.g = var5 - var3;
        return this.aC;
    }

    final void I(Graphics var1, int var2, int var3) {
        int var4;
        int var10000;
        if (this.B()) {
            var4 = this.k();
            int var5 = this.l();
            int var6 = e.Code(this.P - var5 / 2, this.L, this.m - var5);
            int var7 = var2 + this.I(e.Code(this.J(this.Z(this.O, var6), this.O - var4 / 2), 0, this.l - var4));
            if (this.o < this.L) {
                var6 = var3 + this.I(var6 - this.L) - this.o + this.L;
            } else {
                var6 = var3 + this.I(var6 - this.o);
            }

            var4 = this.I(var4) - 1;
            var5 = this.I(var5) - 1;
            if (e.t && Code[5] != null) {
                var4 = var6;
                var5 = var7;
                Graphics var15 = var1;
                B var14;
                int var8 = this.I((var14 = this).k());
                var7 = var14.I(var14.l());
                int var9 = var8 > 9 ? var8 - 9 : 1;
                int var10 = var7 > 9 ? var7 - 9 : 1;
                int var11 = var8 > 9 ? 30 : var8 + 21;
                int var12 = var7 > 9 ? 30 : var7 + 21;
                e.I(var1, var5 - 21, var6 - 21, var11, var12);
                var1.drawImage(Code[5], var5 - 21, var6 - 21, 0);
                e.Z(var1);
                e.I(var1, var5 + var9, var6 - 21, 30, var12);
                var1.drawImage(Code[5], var5 + var8 - 59, var6 - 21, 0);
                e.Z(var1);
                e.I(var1, var5 - 21, var6 + var10, var11, 30);
                var1.drawImage(Code[5], var5 - 21, var6 + var7 - 63, 0);
                e.Z(var1);
                e.I(var1, var5 + var9, var6 + var10, 30, 30);
                var1.drawImage(Code[5], var5 + var8 - 59, var6 + var7 - 63, 0);
                e.Z(var1);
                if (var9 > 1) {
                    if ((var9 = (var8 - 18) / 19) > 0) {
                        for(var11 = 0; var11 < var9; ++var11) {
                            e.I(var15, var5 + 9 + var11 * 19, var4 - 21, 19, 30);
                            var15.drawImage(Code[5], var5 - 21 + var11 * 19, var4 - 21, 0);
                            e.Z(var15);
                            e.I(var15, var5 + 9 + var11 * 19, var4 + var7 - 9, 19, 30);
                            var15.drawImage(Code[5], var5 - 21 + var11 * 19, var4 + var7 - 63, 0);
                            e.Z(var15);
                        }
                    }

                    if ((var11 = var8 - 18 - var9 * 19) > 0) {
                        e.I(var15, var5 + 9 + var9 * 19, var4 - 21, var11, 30);
                        var15.drawImage(Code[5], var5 - 21 + var9 * 19, var4 - 21, 0);
                        e.Z(var15);
                        e.I(var15, var5 + 9 + var9 * 19, var4 + var7 - 9, var11, 30);
                        var15.drawImage(Code[5], var5 - 21 + var9 * 19, var4 + var7 - 63, 0);
                        e.Z(var15);
                    }
                }

                if (var10 > 1) {
                    if ((var9 = (var7 - 18) / 24) > 0) {
                        for(var10 = 0; var10 < var9; ++var10) {
                            e.I(var15, var5 - 21, var4 + 9 + var10 * 24, 30, 24);
                            var15.drawImage(Code[5], var5 - 21, var4 - 22 + var10 * 24, 0);
                            e.Z(var15);
                            e.I(var15, var5 + var8 - 9, var4 + 9 + var10 * 24, 30, 24);
                            var15.drawImage(Code[5], var5 + var8 - 59, var4 - 22 + var10 * 24, 0);
                            e.Z(var15);
                        }
                    }

                    if ((var10 = var7 - 18 - var9 * 24) > 0) {
                        e.I(var15, var5 - 21, var4 + 9 + var9 * 24, 30, var10);
                        var15.drawImage(Code[5], var5 - 21, var4 - 22 + var9 * 24, 0);
                        e.Z(var15);
                        e.I(var15, var5 + var8 - 9, var4 + 9 + var9 * 24, 30, var10);
                        var15.drawImage(Code[5], var5 + var8 - 59, var4 - 22 + var9 * 24, 0);
                        e.Z(var15);
                    }
                }

                if (e.F) {
                    var15.setColor(0);
                    var15.drawRect(var5, var4, var8 - 1, var7 - 1);
                    var15.setColor(16777215);
                    var15.drawRect(var5 + 1, var4 + 1, var8 - 3, var7 - 3);
                }

                var10000 = 2;
            } else {
                var1.setColor(0);
                var1.drawRect(var7, var6, var4, var5);
                var1.setColor(16777215);
                var1.drawRect(var7 + 1, var6 + 1, var4 - 2, var5 - 2);
                var10000 = 2;
            }
        } else {
            if (this.c()) {
                e.Z(var1);
                return;
            }

            B var13;
            var10000 = ((var13 = this.Code.Code()) == null || var13.C >= 5) && !I.Code ? (this.ae > 0 ? 1 : 0) : (this.ae > 0 ? 4 : 3);
        }

        var4 = var10000;
        e.Z(var1);
        if (this.Code.b) {
            var4 = 0;
        }

        var1.drawImage(Code[var4], this.Code.C() + var2 - 5, this.Code.a() + var3 - 3, 20);
    }

    private void c(int var1, int var2) {
        int var10000 = var1;
        int var10002 = this.l;
        int var10003 = this.k();
        var1 = this.s;
        var1 = e.Code(var10000, 0, var10002 - (var10003 << 8) / var1);
        var10000 = var2;
        var10002 = this.m;
        var10003 = this.l();
        var2 = this.s;
        var2 = e.Code(var10000, 0, var10002 - (var10003 << 8) / var2);
        if (this.p != var1) {
            this.n = e.Code(Code.Code(this.n, this.p, this.t, this.u), 0, this.l - this.Z(this.k()));
            this.p = var1;
            this.t = this.n;
            this.u = (int)System.currentTimeMillis();
        }

        if (this.q != var2) {
            this.o = e.Code(Code.Code(this.o, this.q, this.v, this.w), 0, this.m - this.Z(this.l()));
            this.q = var2;
            this.v = this.o;
            this.w = (int)System.currentTimeMillis();
        }

        if (this.Z()) {
            I.I = true;
        }

        Code.e();
    }

    private void Code(int var1, int var2, boolean var3) {
        this.O = e.Code(this.O + var1, 0, this.l - 1);
        this.P = e.Code(this.P + var2, 0, this.m - 1);
        this.ae();
        var1 = this.p;
        var2 = -1;
        if (var3) {
            B var4 = this;
            int var5 = 0;

            int var10000;
            while(true) {
                if (var5 >= var4.ag) {
                    var10000 = -1;
                    break;
                }

                if (var4.O > var4.ah + var4.J[var5 << 2] && var4.O <= var4.J[(var5 << 2) + 2] - var4.ah && var4.P > 0 + var4.J[(var5 << 2) + 1] && var4.P <= var4.J[(var5 << 2) + 3]) {
                    var10000 = var5;
                    break;
                }

                ++var5;
            }

            var2 = var10000;
            var1 = this.J(var2, var1);
        }

        var2 = var2 < 0 ? 40 : 0;
        var1 = e.Code(var1, this.O + var2 - this.k(), this.O - var2);
        var2 = e.Code(this.q, this.Code(this.P, 50 - this.l(), this.r), this.Code(this.P, -50, this.r));
        this.c(var1, var2);
    }

    private void ab() {
        int var1 = 0;
        this.L = 0;

        for(int var2 = 0; var2 < this.H; ++var2) {
            this.Z[var2 * 6 + 5] = var1;
            if ((this.Z[var2 * 6 + 4] & 1) != 0) {
                var1 += this.Z[var2 * 6 + 1];
                if ((this.Z[var2 * 6 + 4] & 2) == 0) {
                    this.L += this.Z[var2 * 6 + 1];
                }
            }
        }

        this.m = var1;
    }

    private void ac() {
        this.t = true;

        int var2;
        int var3;
        for(int var1 = this.s() + this.aC; this.aC < var1; this.Z[var3 * 6 + 4] = this.Z[var3 * 6 + 4] & -2 | var2) {
            var2 = this.t();
            var3 = this.s();
        }

        this.ab();
        this.ad();
    }

    final void Code(int var1, int var2) {
        this.d = this.z;
        this.e = this.J(this.A);
        this.f = this.D;
        this.g = this.E;
        if (this.D > 0 && this.E > 0) {
            this.b(var1, var2);
            this.e += this.L - this.I(this.L);
            if (this.e < this.L) {
                this.e = 0;
                this.g += this.L;
                this.f += this.D;
            }
        }

        this.D = 0;
        this.E = 0;
    }

    private void c(int var1) {
        if (this.D > 0 && (int)System.currentTimeMillis() - this.an >= var1) {
            this.an = (int)System.currentTimeMillis();
            if (this.Code != null) {
                e.a();
            }
        }

    }

    private int Code(int var1, int var2, int var3) {
        if (var1 < this.L && var1 + var2 < this.L) {
            return var1 + var2;
        } else if (var1 < this.L) {
            return this.L + (var2 - (this.L - var1) << 8) / var3;
        } else {
            return var1 + (var2 << 8) / var3 < this.L ? this.L + var2 + Code(var1 - this.L, var3) : var1 + (var2 << 8) / var3;
        }
    }

    final void I(boolean var1) {
        if (var1) {
            if (this.J()) {
                this.s = 256 * this.k() / this.l;
                this.x = this.r;
                this.y = (int)System.currentTimeMillis();
                I.I = true;
                this.c(0, this.P >= this.L ? this.Code(this.P, -this.l() / 2, this.s) : this.q);
            } else if (!this.Z()) {
                this.s = 256;
                this.e();
            }
        } else {
            this.s = 256;
            this.x = this.r;
            this.y = (int)System.currentTimeMillis();
            I.I = true;
            if (this.P >= this.L) {
                int var3 = this.k();
                int var2 = this.l();
                var2 = e.Code(this.P - var2 / 2, this.L, this.m - var2);
                var3 = e.Code(this.J(this.Z(this.O, var2), this.O - var3 / 2), 0, this.l - var3);
                this.c(var3, var2);
                this.ae();
            }
        }

        this.ad();
    }

    private void aa() {
        this.Z = new int[9];
        this.Z[1] = this.m;
        this.Z[2] = 6;
        this.Z[4] = 3;
        this.H = 1;
    }

    final boolean Z() {
        return this.r != 256 && 256 * this.k() / this.l <= this.r;
    }

    final synchronized boolean Code(int var1, boolean var2, boolean var3, int var4) {
        var1 &= 536870911;
        int var5 = this.d;
        int var6 = this.e;
        int var7 = this.f;
        int var8 = this.g;
        int var9 = this.aC;
        int var10 = this.r;
        int var11 = this.n;
        int var12 = this.o;
        if (var3) {
            this.r = 256 * this.k() / this.l;
            int var10001 = this.n;
            int var10003 = this.l;
            int var10004 = this.k();
            int var17 = this.r;
            this.n = e.Code(var10001, 0, var10003 - (var10004 << 8) / var17);
            var10001 = this.o;
            var10003 = this.m;
            var10004 = this.l();
            var17 = this.r;
            this.o = e.Code(var10001, 0, var10003 - (var10004 << 8) / var17);
        }

        this.aC = var1;
        this.Y();
        this.e = this.J(this.e);
        var3 = false;
        if (this.e >= 0) {
            this.b(-this.I(this.n), -this.I(this.o));
            if ((var3 = e.Code(this.d, this.e, this.f, this.g, 0, 0, this.k(), this.l())) && var2) {
                int var16 = this.d;
                int var13 = this.e;
                int var14 = this.f;
                int var15 = this.g;
                this.aC = var1;
                this.Y();
                this.I(this.d, this.e, this.f, this.g);
                if (var4 > 0) {
                    this.c(var4);
                } else if (this.D > 0 && this.Code != null) {
                    this.Code.Code(var16, var13, var14, var15);
                }
            }
        }

        this.d = var5;
        this.e = var6;
        this.f = var7;
        this.g = var8;
        this.aC = var9;
        this.r = var10;
        this.n = var11;
        this.o = var12;
        return var3;
    }

    final synchronized void Z(Graphics var1, int var2, int var3) {
        this.an = (int)System.currentTimeMillis();
        this.Code = System.currentTimeMillis();
        int var5;
        if (this.L > 0) {
            boolean var4 = e.m;
            e.m = true;
            var5 = this.r;
            this.r = 256;
            int var6;
            int var7 = Math.min((var6 = Math.min(var1.getClipY() - var3, this.m - 1)) + var1.getClipHeight() - 1, this.L - 1);
            this.Code(var1, var2, var3, var6, var7);
            this.r = var5;
            var3 += this.L - this.I(this.L);
            e.m = var4;
        }

        int var8;
        var5 = Math.min((var8 = Math.min(Math.max(this.L, this.Z(var1.getClipY() - var3)), this.m - 1)) + this.Z(var1.getClipHeight() - 1), this.m - 1);
        this.Code(var1, var2, var3, var8, var5);
    }

    private void ad() {
        this.I(0, 0, Math.max(this.l, this.k()), Math.max(this.m, this.l()));
    }

    final int c() {
        return this.I(this.n);
    }

    final int g() {
        return this.k();
    }

    final boolean J() {
        return !this.Z() && !this.I() && this.l != 0 && this.k() != 0 && 256 * this.k() / this.l < 128;
    }

    final void Code(Graphics var1, int var2, int var3) {
        int var4 = this.r;
        if (this.P < this.L || this.ab != 0) {
            this.r = 256;
        }

        if (this.I(2)) {
            this.s = (Code.Code[36] & 255) > 127;
            this.Code(var1, var2, var3, Code.Code[8], Code.Code[9], 0, true, false);
            this.s = false;
        } else if (this.f && this.I(40)) {
            this.Code(var1, var2, var3, Code.Code[46], 0, true);
        } else if (Code.Code(e.I(66)) == null && (this.f || this.ab > 0 || this.c() || !this.Z() && Code.Code(this) && !Code.Code.Z())) {
            if (this.I[this.ae] == 42) {
                this.Code(var1, var2, var3, Code.Code[11], Code.Code[12], -16777216, true, true);
            } else {
                int var5 = this.I[this.ae] == 73 ? 0 : 687865856 | Code.Code[21] & 16777215;
                this.Code(var1, var2, var3, var5, -16777216 | Code.Code[21], false);
            }
        }

        this.r = var4;
    }

    final int B() {
        return this.l;
    }

    final int a() {
        return this.I(this.l);
    }

    final int f() {
        if (this.P < this.L) {
            return this.P - this.d();
        } else {
            return this.o < this.L ? this.I(this.P - this.L) - this.o + this.L : this.I(this.P - this.o);
        }
    }

    final int b() {
        return this.I(this.m - this.L) + this.L;
    }

    final void C(boolean var1) {
        e.aE = var1;
        this.ag();
        Code.Code(148, false);
    }

    final int d() {
        return this.o < this.L ? this.o : this.I(this.o - this.L) + this.L;
    }

    final int e() {
        return this.P < this.L ? this.O - this.c() : this.I(this.O - this.n);
    }

    final int h() {
        return this.l() - k;
    }

    private int I(int var1) {
        return var1 * this.r + 255 >> 8;
    }

    private int Z(int var1) {
        return (var1 << 8) / this.r;
    }

    private int J(int var1) {
        int var2 = this.I(var1, 0);
        return (this.Z[var2 * 6 + 4] & 1) == 0 ? -1 : var1 - this.Z[var2 * 6] + this.Z[var2 * 6 + 5];
    }

    final boolean B() {
        return this.Z() && this.r == this.s && this.P >= this.L;
    }

    private synchronized int I(int var1, int var2) {
        int var3 = -1;
        int var4 = this.H;

        while(var4 - var3 > 1) {
            int var5 = var3 + var4 >>> 1;
            if (this.Z[var5 * 6 + var2] > var1) {
                var4 = var5;
            } else {
                var3 = var5;
            }
        }

        for(var1 = Math.max(var3, 0); var1 > 0 && this.Z[var1 * 6 + var2] == this.Z[(var1 - 1) * 6 + var2]; --var1) {
        }

        if (var2 == 5) {
            while((this.Z[var1 * 6 + 4] & 1) == 0) {
                ++var1;
            }
        }

        return var1;
    }

    private void Code(Graphics var1, int var2, int var3, int var4, int var5) {
        int var6;
        for(var6 = var4 = this.I(var4, 5); var6 != this.H; ++var6) {
            this.Z[var6 * 6 + 3] = this.Z[var6 * 6 + 2];
            if ((this.Z[var6 * 6 + 4] & 1) == 0) {
                this.I(var1, var2, var3, var4, var6 - 1);

                do {
                    ++var4;
                    if (var4 == this.H) {
                        return;
                    }
                } while((this.Z[var4 * 6 + 4] & 1) == 0);

                var6 = var4 - 1;
            } else if (this.Z[var6 * 6 + 5] > var5) {
                this.I(var1, var2, var3, var4, var6 - 1);
                return;
            }
        }

        this.I(var1, var2, var3, var4, var6 - 1);
    }

    private void I(Graphics var1, int var2, int var3, int var4, int var5) {
        if (var5 >= 0) {
            var3 += this.I(this.Z[var4 * 6 + 5]);
            e.I(var1, var2, var3, this.l, this.Z[var5 * 6] + this.Z[var5 * 6 + 1]);
            var3 -= this.I(this.Z[var4 * 6]);
            this.aC = 0;

            while(true) {
                int var6 = 2147483647;

                int var7;
                for(var7 = var4; var7 <= var5; ++var7) {
                    for(int var8 = this.Z[var7 * 6 + 3]; this.Z[var8] != 0; var8 += 2) {
                        this.Z[var7 * 6 + 3] = var8;
                        if (this.Z[var8 + 1] > this.aC) {
                            var6 = e.Code(var6, this.aC, this.Z[var8]);
                            break;
                        }
                    }
                }

                if (var6 == 2147483647) {
                    e.Z(var1);
                    return;
                }

                var7 = var6;

                do {
                    for(int var9 = var4; var9 <= var5; ++var9) {
                        for(int var10 = this.Z[var9 * 6 + 3]; this.Z[var10] != 0 && this.Z[var10] <= var7 + this.K; var10 += 2) {
                            this.Z[var9 * 6 + 3] = var10;
                            var7 = Math.max(var7, this.Z[var10 + 1]);
                        }
                    }
                } while(var7 != var7);

                this.Z(var1, var2, var3, var6, var7);
            }
        }
    }

    private void Z(Graphics var1, int var2, int var3, int var4, int var5) {
        this.aC = var4;

        while(true) {
            while(true) {
                while(true) {
                    while(this.aC < var5) {
                        if ((var4 = this.t()) != 83 && var4 != 76 && var4 != 77) {
                            this.Y();
                            int var6 = this.g;
                            this.b(var2, var3);
                            if (this.Code(var1)) {
                                int var7 = this.aC;
                                int var8 = this.r();
                                int var9;
                                int var11;
                                int var10000;
                                int var21;
                                switch(var4) {
                                    case 66:
                                        e.Code(var1, this.d, this.e, this.f, this.g, var8, false);
                                        break;
                                    case 70:
                                        var4 = this.t();
                                        var7 = this.t();
                                        String var19 = this.B();
                                        String var23 = this.B();
                                        var11 = this.p();
                                        String var24;
                                        String var28;
                                        if ((var24 = var28 = (String)this.Code.get(var19)) == null) {
                                            var24 = var23;
                                        }

                                        char[] var14;
                                        Image var15;
                                        var14 = null;
                                        var15 = null;
                                        label247:
                                        switch(var4) {
                                            case 97:
                                                var14 = var24.toCharArray();
                                                var4 = 0;
                                                var7 = 1;
                                                boolean var20 = true;

                                                for(var21 = 0; var21 < var14.length; ++var21) {
                                                    if (var14[var21] == '\n') {
                                                        var4 = 0;
                                                    } else if (var14[var21] == ' ') {
                                                        if (var20) {
                                                            var20 = false;
                                                            var4 = e.Code(0, var14, 0, var21);
                                                        }

                                                        while(var21 + var7 < var14.length && var14[var21 + var7] != ' ') {
                                                            ++var7;
                                                        }

                                                        var7 = e.Code(0, var14, var21, var7);
                                                        if (var4 + var7 > this.f) {
                                                            var14[var21] = '\n';
                                                            var4 = 0;
                                                        }

                                                        var4 += var7;
                                                        var7 = 1;
                                                    }
                                                }
                                            case 98:
                                            case 100:
                                            case 101:
                                            case 103:
                                            case 104:
                                            case 105:
                                            case 106:
                                            case 107:
                                            case 108:
                                            case 109:
                                            case 110:
                                            case 111:
                                            case 113:
                                            case 116:
                                            case 117:
                                            case 118:
                                            case 119:
                                            default:
                                                break;
                                            case 99:
                                                if (((var28 != null ? 1 : 0) ^ (var7 & 2 | -(var7 & 2)) >>> 31) != 0) {
                                                    if (e.q) {
                                                        var1.setColor(Code.Code[65]);
                                                        var1.drawLine(this.d + 1, this.e + 1, this.d + this.f - 2, this.e + this.g - 2);
                                                        var1.drawLine(this.d + 1, this.e + this.g - 2, this.d + this.f - 2, this.e + 1);
                                                    } else if (I != null) {
                                                        var15 = I[0];
                                                    }
                                                }
                                                break;
                                            case 102:
                                                Object[] var17;
                                                if (this.I != null && (var17 = (Object[])this.I.get(var19)) != null) {
                                                    var14 = (var17[0] + ", " + (Integer)var17[1] / 1000 + " kB").toCharArray();
                                                } else {
                                                    var14 = e.Code(182).toCharArray();
                                                }
                                                break;
                                            case 112:
                                                if (!this.Z.contains(var19)) {
                                                    this.Z.addElement(var19);
                                                }

                                                var14 = new char[var24.length()];
                                                var4 = 0;

                                                while(true) {
                                                    if (var4 >= var14.length) {
                                                        break label247;
                                                    }

                                                    var14[var4] = '*';
                                                    ++var4;
                                                }
                                            case 114:
                                                if (var28 != null) {
                                                    if (!var28.equals(var23)) {
                                                        break;
                                                    }
                                                } else if ((var7 & 2) == 0) {
                                                    break;
                                                }

                                                if (e.q) {
                                                    var1.setColor(Code.Code[66]);
                                                    var1.fillArc(this.d + 1, this.e + 1, this.f - 3, this.g - 3, -90, 360);
                                                } else if (I != null) {
                                                    var15 = I[1];
                                                }
                                                break;
                                            case 115:
                                                var4 = this.aC;
                                                this.aC = var11;
                                                var9 = this.p();
                                                var23 = "\u0000" + var24 + "\u0000";

                                                StringBuffer var27;
                                                for(var27 = new StringBuffer(); var9 > 0; --var9) {
                                                    var28 = this.B();
                                                    var24 = this.B();
                                                    boolean var29 = var23.indexOf("\u0000" + var28 + "\u0000") >= 0;
                                                    if ((var7 & 4) == 0) {
                                                        if (var29) {
                                                            var27.append(var24).append("\n");
                                                            break;
                                                        }
                                                    } else {
                                                        if (var29) {
                                                            var27.append("*");
                                                        }

                                                        var27.append(var24).append("\n");
                                                    }
                                                }

                                                this.aC = var4;
                                                var14 = var27.toString().toCharArray();
                                                break;
                                            case 120:
                                                var14 = var24.toCharArray();
                                                if (var19.equals("$")) {
                                                    var14 = ((String)((Object[])Code.elementAt(c + 1))[1]).toCharArray();
                                                }
                                        }

                                        if (var14 != null) {
                                            e.I(var1, this.d, this.e, this.f, this.g);
                                            this.Code(var1, var14, var14.length, var8, 0, var6);
                                            e.Z(var1);
                                        }

                                        if (var15 != null && this.r == 256) {
                                            var1.drawImage(var15, this.d + this.f / 2, this.e + this.g / 2, 3);
                                        }
                                        break;
                                    case 73:
                                        var4 = this.d - this.t();
                                        var6 = this.e - this.t();
                                        var7 = this.t();
                                        var9 = this.q();
                                        var10000 = var7 & (this.r >= 128 ? 4 : 2);
                                        var21 = (var10000 | -var10000) >>> 31 ^ 1;
                                        var11 = (var7 & 8 | -(var7 & 8)) >>> 31;
                                        Image var26 = null;
                                        if (var21 != 0) {
                                            var26 = this.Code(this.N + var9, this.aC - 20, var7);
                                        }

                                        if (var21 != 0 && var26 != null) {
                                            e.I(var1, this.d, this.e, this.f, this.g);
                                            var7 = var26.getWidth();
                                            var8 = var26.getHeight();
                                            if (var4 + var7 < var1.getClipX()) {
                                                var4 = var1.getClipX() - (var1.getClipX() - var4) % var7;
                                            }

                                            if (var6 + var8 < var1.getClipY()) {
                                                var6 = var1.getClipY() - (var1.getClipY() - var6) % var8;
                                            }

                                            var9 = var1.getClipX() + var1.getClipWidth();

                                            for(var21 = var1.getClipY() + var1.getClipHeight(); var4 < var9; var4 += var7) {
                                                for(var11 = var6; var11 < var21; var11 += var8) {
                                                    var1.drawImage(var26, var4, var11, 20);
                                                }
                                            }

                                            e.Z(var1);
                                        } else if (var21 != 0 || var11 != 0) {
                                            e.Code(var1, this.d, this.e, this.f, this.g, var8 | -16777216, false);
                                        }
                                        break;
                                    case 84:
                                        var4 = e.Z(this.t());
                                        var9 = this.s();
                                        char[] var10 = Code;
                                        if (var9 > Code.length) {
                                            var10 = new char[var9];
                                        }

                                        var11 = e.Code(this.I, this.aC, var10, 0, var9);
                                        if (this.I() && var10[0] == 0) {
                                            var21 = var10[1] - 32;
                                            String var22 = null;
                                            if (this.B != null && var21 < this.B.size()) {
                                                var22 = (String)((Object[])this.B.elementAt(var21))[3];
                                            }

                                            if (var22 != null) {
                                                var10 = var22.toCharArray();
                                            } else {
                                                var10 = new char[]{' '};
                                            }

                                            var11 = var10.length;
                                            if (this.f != (this.f = e.Code(var4, var10, 0, var11))) {
                                                this.I[this.aC - 12] = (byte)(this.f >> 8);
                                                this.I[this.aC - 11] = (byte)this.f;
                                            }
                                        }

                                        int var12;
                                        if (e.at && this.I != null) {
                                            for(var12 = 0; var12 < this.I.size(); ++var12) {
                                                if ((Integer)this.I.elementAt(var12) == var7) {
                                                    var8 = -33024;
                                                }
                                            }
                                        }

                                        this.Code(var1, var10, var11, var8, var4, var6);
                                        Integer var16 = new Integer(this.aC - 7);
                                        if (this.C != null && this.C.containsKey(var16)) {
                                            int[] var18 = (int[])this.C.get(var16);

                                            for(var8 = 0; var8 < var18.length; ++var8) {
                                                var10000 = var18[var8] - this.aP;
                                                int var13 = (var12 = (var10000 | -var10000) >>> 31 ^ 1) != 0 ? Code.Code[69] : Code.Code[67];
                                                var12 = var12 != 0 ? Code.Code[70] : Code.Code[68];
                                                var1.setColor(var12);
                                                int[] var25 = (int[])this.C.elementAt(var18[var8]);
                                                var1.fillRect(this.d + var25[0], this.e + var25[1], var25[2], var25[3]);
                                                e.I(var1, this.d + var25[0], this.e + var25[1], var25[2], var25[3]);
                                                this.Code(var1, var10, var11, var13, var4, var6);
                                                e.Z(var1);
                                            }
                                        }

                                        this.aC += var9;
                                }
                            } else {
                                this.b(var4);
                            }
                        } else {
                            this.b(var4);
                        }
                    }

                    return;
                }
            }
        }
    }

    private void Code(Graphics var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
        if (this.ae > 0) {
            this.aC = this.ae;
            this.t();
            int var9 = this.t();
            Vector var10 = new Vector();
            int var11 = 2147483647;

            int var12;
            int var13;
            int var14;
            int var15;
            while(var9-- > 0) {
                this.Y();
                this.e = this.J(this.e);
                --this.d;
                --this.e;
                ++this.g;
                if (var6 != 0) {
                    this.d -= 2;
                    this.e -= 2;
                    this.f += 4;
                    this.g += 3;
                }

                this.b(var2, var3);
                var11 = Math.min(var11, this.e);
                var13 = (var12 = this.d) + this.f;
                var14 = 0;

                while(true) {
                    var15 = 2147483646;
                    if (var14 < var10.size()) {
                        var15 = (Integer)var10.elementAt(var14);
                    }

                    if (var15 >= var12) {
                        var10.insertElementAt(new Integer(var12), var14++);
                        var10.insertElementAt(new Integer(this.e), var14++);
                        var10.insertElementAt(new Integer(this.e + this.g), var14++);
                        var10.insertElementAt(new Integer(1), var14++);
                        var10.insertElementAt(new Integer(this.f > 40 && this.g > az ? 1 : 0), var14++);
                        var12 = 2147483647;
                    }

                    if (var15 > var13) {
                        var10.insertElementAt(new Integer(this.f > 40 && this.g > az ? -1 : 0), var14);
                        var10.insertElementAt(new Integer(-1), var14);
                        var10.insertElementAt(new Integer(this.e + this.g), var14);
                        var10.insertElementAt(new Integer(this.e), var14);
                        var10.insertElementAt(new Integer(var13), var14);
                        break;
                    }

                    var14 += 5;
                }
            }

            for(var9 = var11; var11 != 2147483647; var11 = var12) {
                var12 = 2147483647;
                var13 = 0;
                var14 = 0;
                var15 = 0;
                int var16 = 0;
                int var17 = 0;

                int var21;
                for(int var18 = 0; var18 < var10.size(); var13 = var21) {
                    int var19 = var14;
                    var21 = (Integer)var10.elementAt(var18) + 1;
                    var16 += var17;
                    var17 = 0;

                    do {
                        var10.elementAt(var18++);
                        int var22 = (Integer)var10.elementAt(var18++);
                        int var23 = (Integer)var10.elementAt(var18++);
                        int var24 = (Integer)var10.elementAt(var18++);
                        int var25 = (Integer)var10.elementAt(var18++);
                        if (var22 > var11) {
                            var12 = Math.min(var12, var22);
                        }

                        if (var23 > var11) {
                            var12 = Math.min(var12, var23);
                        }

                        if (var22 < var11 && var23 >= var11) {
                            var14 += var24;
                            var17 += var25;
                        }

                        if (var22 <= var11 && var23 > var11) {
                            var15 += var24;
                        }
                    } while(var18 < var10.size() && (Integer)var10.elementAt(var18) <= var21);

                    --var21;
                    if (var16 == 0 && var14 > 0) {
                        if (var8) {
                            var1.setColor(Code.Code[10]);
                            var1.drawLine(0, var9 - 1, this.l - 1, var9 - 1);
                            e.Code(var1, 0, var9, this.l, var11 - var9, var4, var5);
                            var1.setColor(Code.Code[13]);
                            var1.drawLine(0, var11 - 1, this.l - 1, var11 - 1);
                            var1.setColor(Code.Code[14]);
                            var1.drawLine(0, var11, this.l - 1, var11);
                        } else if (var4 == var5) {
                            e.Code(var1, var13 + 1, var9 + 1, var21 - var13, var11 - var9, var4, false);
                        } else {
                            e.Code(var1, var13 + 1, var9 + 1, var21 - var13, var11 - var9, var4, var5);
                        }

                        if (var7) {
                            if (var8) {
                                this.s = true;
                                e.I(var1, var13 + 1, var9 + 1, var21 - var13, var11 - var9 - 1);
                                this.Z(var1, var2, var3);
                                e.Z(var1);
                                this.s = false;
                            } else {
                                e.I(var1, var13 + 1, var9 + 1, var21 - var13, var11 - var9);
                                this.Z(var1, var2, var3);
                                e.Z(var1);
                            }
                        }

                        if (var8) {
                            if (var4 >>> 24 > 254 && var5 >>> 24 > 254) {
                                e.Code(var1, 0, var9 - 1, this.l, var11 - var9 + 2);
                            }
                        } else if (var4 == var5) {
                            if (var4 >>> 24 > 254) {
                                e.Code(var1, var13 + 1, var9 + 1, var21 - var13, var11 - var9);
                            }
                        } else if (var4 >>> 24 > 254 && var5 >>> 24 > 254) {
                            e.Code(var1, var13 + 1, var9 + 1, var21 - var13, var11 - var9);
                        }
                    }

                    if (!var8) {
                        if (((var14 | -var14) >>> 31 ^ 1 ^ (var14 | -var14) >>> 31 ^ 1) != 0) {
                            e.Code(var1, var21, var9 + 1, 2, var11 - var9, var6, false);
                            if (var6 >>> 24 > 254) {
                                e.Code(var1, var21, var9 + 1, 2, var11 - var9);
                            }
                        }

                        if (((var19 | -var19) >>> 31 ^ 1 ^ (var15 | -var15) >>> 31 ^ 1) != 0) {
                            e.Code(var1, var13 + 1, var11, var21 - var13, 2, var6, false);
                            if (var6 >>> 24 > 254) {
                                e.Code(var1, var13 + 1, var11, var21 - var13, 2);
                            }
                        }
                    }
                }

                var9 = var11;
            }

        }
    }

    private synchronized int Code(int var1, int var2, int var3, int var4, int var5, boolean var6) {
        if (this.ac == 0) {
            return 0;
        } else {
            int var7;
            int var8;
            int var9;
            if (var4 < 0) {
                var7 = var3 + (-var4 - 1 << 1);
                var8 = var2 + var4 - 1;
                var9 = -var4;
            } else {
                var7 = var3 + (var4 - 1 << 1);
                var8 = var2;
                var9 = var4;
            }

            this.aM = 0;
            this.aN = 0;
            int var10 = var1 + var3 / 2 - var7 / 2;
            int var11 = 0;
            this.aO = 2147483647;
            this.aC = this.ac;

            while(this.aC <= this.ad) {
                int var12 = var9;
                int var13 = var7;
                int var14 = var8;
                int var15 = var10;
                B var16 = this;
                int var17 = 0;
                int var18 = this.aC;
                int var19 = this.t();

                for(int var20 = this.t(); var20 > 0; --var20) {
                    var16.Y();
                    var16.e = var16.J(var16.e);
                    if (var16.e >= 0 && e.Code(var16.d, var16.e, var16.f, var16.g, var15, var14, var13, var12)) {
                        if (var6) {
                            if (var19 != 105) {
                                continue;
                            }
                        } else if (var19 == 105) {
                            continue;
                        }

                        int var21 = var1 + var3 / 2;
                        if (var16.d + var16.f <= var21) {
                            var21 = var16.d + var16.f - 1;
                        } else if (var16.d > var21) {
                            var21 = var16.d;
                        }

                        int var22 = -1;
                        if (var4 < 0 && var16.e < var14 + var16.d + var16.f - var15 && var16.e < var14 - var16.d + var15 + var13) {
                            var22 = var14;
                            if (var16.e + (var16.g - 1) / 2 < var2 && var18 != var5) {
                                var22 = var16.e + (var16.g - 1) / 2;
                            }
                        }

                        if (var4 > 0 && var16.e + var16.g > var14 - var16.d - var16.f + var1 && var16.e + var16.g > var14 + var12 + var16.d - var15 - var13) {
                            var22 = var2 + var4 - 1;
                            if (var16.e + (var16.g - 1) / 2 > var2 && var18 != var5) {
                                var22 = var16.e + (var16.g - 1) / 2;
                            }
                        }

                        int var23;
                        if (var22 >= 0 && e.Code(var16.d, var16.e, var16.f, var16.g, var21, var22, 1, 1) && (var23 = (var1 + var3 / 2 - var21) * (var1 + var3 / 2 - var21) + (var2 - var22) * (var2 - var22)) < var16.aO) {
                            var16.aO = var23;
                            var16.aM = var21;
                            var16.aN = var22;
                            var17 = var18;
                        }
                    }
                }

                var16.af();
                if (var17 > 0) {
                    var11 = var17;
                }
            }

            return var11;
        }
    }

    private void Code(Graphics var1, char[] var2, int var3, int var4, int var5, int var6) {
        int var7 = 1;
        int var8 = Math.max(var6 / e.B(var5), 1);

        int var9;
        for(var9 = 0; var9 < var3 && var7 <= var8; ++var9) {
            var7 += (var2[var9] - 10 | -(var2[var9] - 10)) >>> 31 ^ 1;
        }

        var3 = var7;
        int var10;
        if (this.r >= 200) {
            var1.setColor(var4);
        } else {
            if (B == null || B.length < 2 * Code.e) {
                C = null;
                a = null;
                B = null;
                a = new int[(C = new int[2 * Code.e]).length];
                B = new int[C.length];
                aK = -1;
                aL = -1;
                Random var17 = new Random(4711L);

                for(var10 = 0; var10 < B.length >> 1; ++var10) {
                    B[var10] = var17.nextInt() & 127;
                    B[var10 + (B.length >> 1)] = B[var10] + 64;
                }
            }

            if ((var8 = e.Z(var5) << 6) != aL || var4 != aK) {
                for(var10 = 0; var10 < a.length; ++var10) {
                    a[var10] = var8 + B[var10] << 24 | var4 & 16777215;
                }

                aL = var8;
                aK = var4;
            }
        }

        while(true) {
            while(true) {
                if (var9 <= 0) {
                    return;
                }

                --var3;
                var8 = this.e + this.I(var6 * var3 / var7);
                var10 = 0;
                if (var3 == 0) {
                    var10 = var9;
                    var9 = 0;
                } else {
                    while(var9 > 0 && var2[var9 - 1] != '\n') {
                        ++var10;
                        --var9;
                    }
                }

                if (this.r >= 200) {
                    e.Code(var1, var5, var2, var9, var10, this.d, var8);
                    break;
                }

                int var11 = this.I(e.Code(var5, var2, var9, var10));
                if ((var11 = Math.min((C.length >> 1) - 1, var11)) > 0 && var8 >= 0) {
                    int var12 = Math.max(var11 / var10, 1);
                    if (!e.ah && e.r && !e.u) {
                        int var13 = (var9 << 1 | var10 << 2 ^ var11) % (C.length / 2 - var11) & -2;

                        int var14;
                        for(var14 = 0; var14 < var11; ++var14) {
                            C[var14] = a[var13 + var14];
                            C[var11 + var14] = a[(a.length >> 1) + var13 + var14];
                        }

                        for(var13 = var9; var13 < var9 + var10; ++var13) {
                            if (var2[var13] == ' ') {
                                for(var14 = 0; var14 < var12; ++var14) {
                                    int var15;
                                    if ((var15 = (var13 - var9) * var12 + var14) < C.length) {
                                        C[var15] = 0;
                                    }

                                    if ((var15 = (var13 - var9) * var12 + var11 + var14) < C.length) {
                                        C[var15] = 0;
                                    }
                                }
                            }
                        }

                        var10 = Math.max(0, -this.d);
                        if (var11 > var10) {
                            Graphics var10000 = var1;
                            int[] var10001 = C;
                            int var10002 = var10;
                            int var10003 = var11 - var10;
                            int var10004 = this.d + var10;
                            int var10005 = var8;
                            int var10006 = var11 - var10;
                            byte var10007 = 2;
                            boolean var10008 = true;

                            try {
                                var10000.drawRGB(var10001, var10002, var10003, var10004, var10005, var10006, var10007, var10008);
                            } catch (ArrayIndexOutOfBoundsException var16) {
                            }
                        }
                        break;
                    }

                    var1.setColor(var4);
                    var1.drawLine(this.d, var8, this.d + var11, var8);
                    break;
                }

                --var9;
            }

            --var9;
        }
    }

    private int I(int var1, int var2, int var3) {
        int var4 = var1 + Math.min(0, var3);
        int var5 = Math.abs(var3) + this.k();

        for(int var6 = 0; var6 < this.ag; ++var6) {
            if (e.Code(var4, var2 + this.ai, var5, this.l() - 2 * this.ai, this.J[var6 << 2], this.J[(var6 << 2) + 1], this.J[(var6 << 2) + 2] - this.J[var6 << 2], this.J[(var6 << 2) + 3] - this.J[(var6 << 2) + 1])) {
                if (var3 > 0) {
                    if (this.J[(var6 << 2) + 2] > var1 + this.k()) {
                        var3 = Math.min(var3, Math.max(this.J[(var6 << 2) + 2] - var1 - this.k(), this.J[var6 << 2] - var1));
                    }
                } else if (this.J[var6 << 2] < var1) {
                    var3 = Math.max(var3, Math.min(this.J[var6 << 2] - var1, this.J[(var6 << 2) + 2] - var1 - this.k()));
                }
            }
        }

        return var3;
    }

    private int Z(int var1, int var2) {
        for(int var3 = 0; var3 < this.ag; ++var3) {
            if (e.Code(var1, var2 + this.ai, 1, this.l() - 2 * this.ai, this.J[var3 << 2], this.J[(var3 << 2) + 1], this.J[(var3 << 2) + 2] - this.J[var3 << 2], this.J[(var3 << 2) + 3] - this.J[(var3 << 2) + 1])) {
                return var3;
            }
        }

        return -1;
    }

    private int J(int var1, int var2) {
        if (var1 >= 0) {
            if (this.J[(var1 << 2) + 2] > var2 + this.k() && var2 < this.J[var1 << 2]) {
                var2 = Math.min(this.J[var1 << 2], this.J[(var1 << 2) + 2] - this.k());
            }

            if (this.J[var1 << 2] < var2 && var2 + this.k() > this.J[(var1 << 2) + 2]) {
                var2 = Math.max(this.J[var1 << 2], this.J[(var1 << 2) + 2] - this.k());
            }
        }

        return var2;
    }

    final void I(int var1, int var2) {
        if (var2 != 0) {
            this.Code(0, (this.b() - this.l()) * var1 / var2 - this.d(), false, false);
            this.o = this.q;
        }

    }

    final void J(int var1, int var2) {
        this.V = var1;
        this.W = var2;
        this.P = this.Code(this.o, var2, this.r);
        this.O = this.n + (this.P >= this.L ? this.Z(var1) : var1);
        this.ae = this.Z() && this.P >= this.L ? 0 : this.Code(this.O, this.P, 1, 1, -1, false);
        this.ab = this.ae;
        this.n = false;
        this.o = false;
        this.p = false;
        if (this.Code.a()) {
            this.ab = 0;
            this.p = true;
            this.o = true;
        }

        if (this.ab > 0 && e.I(this.Code(this.ab, 76), "menu:")) {
            this.B(false);
        } else if (!this.Code.a()) {
            e.a();
        }
    }

    final void c() {
        if (this.Z() && this.P >= this.L) {
            this.I(false);
        } else {
            this.B(false);
        }
    }

    final void Z(int var1, int var2) {
        if (var2 != 0) {
            this.Code((this.l - this.k()) * var1 / var2 - this.p, 0, false, false);
            this.n = this.p;
        }

    }

    final void Code(int var1, int var2, boolean var3, boolean var4) {
        if (this.Z() && var3) {
            if (this.P >= this.L && this.P + var2 < this.L) {
                this.O = this.I(this.O);
            } else if (this.P < this.L && this.P + var2 >= this.L) {
                this.O = this.Z(this.O);
            }

            this.Code(var1, var2, false);
        } else {
            if (var4) {
                Code.Code.I(true);
            }

            if (var1 != 0) {
                var1 = this.I(this.p, this.q, var1);
            }

            this.O -= this.p;
            this.P -= this.q;
            this.c(this.p + var1, this.Code(this.q, var2, this.r));
            this.O += this.p;
            this.P += this.q;
        }
    }

    final void e() {
        this.r = this.s;
        this.n = this.p;
        this.o = this.q;
    }

    final void J(boolean var1) {
        if (this.s != this.r) {
            this.ad();
        }

        this.r = Code.Code(this.r, this.s, this.x, this.y);
        if (e.ah) {
            this.r = this.s;
        }

        if (!this.c() && (this.T != 0 || this.U != 0)) {
            if (var1) {
                int var3 = (int)System.currentTimeMillis() - this.Q;
                int var2;
                if (Math.abs(var2 = this.R + this.T * this.Z(var3 / 2 + var3 * var3 / 5000) - this.O) > this.Z(this.k() / 2)) {
                    var2 = this.T * this.Z(this.k() / 2);
                }

                if (Math.abs(var3 = this.S + this.U * this.Z(var3 / 2 + var3 * var3 / 5000) - this.P) > this.Z(this.l() / 2)) {
                    var3 = this.U * this.Z(this.l() / 2);
                }

                if (this.P < this.L && this.P + var3 >= this.L) {
                    this.O = this.Z(this.O);
                    this.R = this.O;
                }

                if (this.L > 0 && this.P >= this.L && this.P + var3 < this.L) {
                    this.O = this.I(this.O);
                    this.R = this.O;
                }

                this.Code(var2, var3, false);
                this.n = this.p;
                this.o = this.q;
                Code.e();
            } else {
                this.Code(0, 0, true);
                this.T = 0;
                this.U = 0;
            }
        }

        this.n = Math.max(0, Math.min(this.l - this.Z(this.k()), Code.Code(this.n, this.p, this.t, this.u)));
        this.o = Math.max(0, Math.min(this.m - this.Z(this.l()), Code.Code(this.o, this.q, this.v, this.w)));
        if (this.P < this.L) {
            this.O = Math.min(this.O, this.I(this.l - 1));
        }

    }

    final void f() {
        if (!this.o && this.ab >= 0) {
            this.n = true;
            if (e.p) {
                this.n = this.p = this.o = this.Code(true);
            }
        }

    }

    final void g() {
        if (!this.o && this.ab == this.ae) {
            if (this.n) {
                this.Code(true);
            } else if (this.Z() && this.P >= this.L) {
                this.I(false);
            } else {
                Code.Code.Code(this.Code);
                this.B(this.I(2) ^ true);
            }
        }

        this.ab = 0;
    }

    final boolean Code(boolean var1) {
        if (this.Code != null && !this.I(2) && this.Code.I == null && this.Code != null && !this.Code.startsWith("myopera:") && !this.Code.startsWith("sk:") && !this.Code.startsWith("server:") && (!this.I() || e.I(this.Code) == 90 && e.I(this.Code(this.ae, 76), "bookmark:") || e.I(this.Code) == 91 && e.I(this.Code(this.ae, 76), "speeddial:") || e.I(this.Code) == 109 && e.I(this.Code(this.ae, 76), "search:") || Code(this.Code, this.Code(this.ae, 76))) && e.aA) {
            this.b(var1);
            this.Code.Code("menu:" + e.I(123), (String)null, (String)null);
            return true;
        } else {
            return false;
        }
    }

    final boolean Code(String var1, boolean var2) {
        if (this.B == null) {
            return false;
        } else {
            String var3 = this.B;
            this.B = null;
            this.q |= "u".equals(var3);
            if (var1 == null) {
                this.Code.remove(var3);
            } else {
                this.Code.put(var3, var1);
            }

            this.ad();
            if (this.r && this.Code != null) {
                String var4 = this.Code;
                String var5 = "";
                if (var3.equals("o:a")) {
                    Code.Code.Z(var1);
                    return true;
                }

                switch(e.I(var4)) {
                    case 65:
                    case 118:
                        var4 = var3 + var1;
                        break;
                    default:
                        var5 = this.Code();
                }

                if (var2) {
                    this.Code.remove(var3);
                }

                this.Code.Code(var4, this.Code, var5, this.I);
            }

            return true;
        }
    }

    final synchronized String I() {
        if (this.ae <= 0) {
            return null;
        } else {
            this.aC = this.ae;
            byte var1 = this.I[this.aC];
            this.w();
            return var1 != 76 && var1 != 42 ? null : this.C();
        }
    }

    public final String Code(int var1) {
        if (this.a != null && this.a.size() > 0) {
            int var2;
            for(var2 = 0; var2 < this.a.size(); ++var2) {
                if (((int[])this.a.elementAt(var2))[4] == var1) {
                    var1 = var2;
                    break;
                }
            }

            var2 = this.Z(this.k());
            int var3 = this.Z(this.l());
            int var4 = this.aC;
            this.aC = this.ac;

            for(int var5 = 0; this.aC <= this.ad; this.af()) {
                int var6 = this.t();
                int var7 = this.t();
                if (var6 == 76) {
                    for(var6 = 0; var6 < var7; ++var6) {
                        this.Y();
                        if (e.Code(this.n, this.o, var2, var3, this.d, this.e, this.f, this.g)) {
                            if (var1 == var5) {
                                this.aC -= (var6 + 1) * 10 + 2;
                                this.w();
                                String var8 = this.C();
                                this.aC = var4;
                                return var8;
                            }

                            ++var5;
                        }
                    }
                } else {
                    this.aC += var7 * 10;
                }
            }

            this.aC = var4;
            return null;
        } else {
            return null;
        }
    }

    final synchronized String Z() {
        return this.Code(this.ae, 76);
    }

    final synchronized void B(boolean var1) {
        if (this.ae > 0 && this.Code != null && this.Code.I == null && !this.g && (!e.Y || Code.Code.Code < 0)) {
            if (this.b()) {
                if (!var1) {
                    this.C(e.aE ^ true);
                }

            } else {
                this.b(var1);
                this.aC = this.ae;
                this.b = this.I[this.aC];
                this.C = null;
                int var6 = this.w();
                String var7;
                switch(this.b) {
                    case 42:
                    case 76:
                        this.Code.Code(this.C(), this.Code, this.Code(), this.I);
                        return;
                    case 67:
                        this.ac();
                        this.ae = this.Code(this.O, this.P, 1, 1, 0, false);
                        break;
                    case 73:
                        this.aC += 2;
                        this.aC = this.p();
                        this.aC += 15;
                        this.b = this.t();
                        var6 = this.t();
                        this.B = this.B();
                        String var8 = this.B();
                        if ((var6 & 8) != 0) {
                            var8 = "";
                        }

                        String var3;
                        String var4 = var3 = (String)this.Code.get(this.B);
                        if (this.B.equals("http://m.yahoo.com/opera/search?p=")) {
                            Code.Code.Code(this.Code, e.I(109));
                            return;
                        }

                        if (this.B.equals("$")) {
                            Code.Code.Code(this.Code, "dialog:" + e.I(54));
                            return;
                        }

                        if (var4 == null) {
                            var4 = var8;
                        }

                        byte var5 = 0;
                        switch(var6 & 48) {
                            case 16:
                                var5 = 2;
                                break;
                            case 32:
                                var5 = 3;
                                break;
                            case 48:
                                var5 = 4;
                        }

                        this.r = (boolean)(var6 & 1);
                        switch(this.b) {
                            case 97:
                                Code.Code((String)null, var4, 0, false);
                                return;
                            case 98:
                            case 100:
                            case 101:
                            case 103:
                            case 104:
                            case 105:
                            case 106:
                            case 107:
                            case 108:
                            case 109:
                            case 110:
                            case 111:
                            case 113:
                            case 116:
                            case 117:
                            case 118:
                            case 119:
                            default:
                                return;
                            case 99:
                                this.Code(var3 != null ? null : var8, false);
                                return;
                            case 102:
                                this.Code.Code(true, this.Code, "s=0");
                                return;
                            case 112:
                                if (e.x) {
                                    Code.Code((String)null, var4, var5, false);
                                    return;
                                }

                                Code.Code((String)null, var4, var5 | 65536, false);
                                return;
                            case 114:
                                this.Code(var8, false);
                                return;
                            case 115:
                                StringBuffer var9;
                                e.Code((var9 = new StringBuffer()).append("a="), var4);
                                var9.append("&b=").append(var6 & 4);
                                this.ao = this.p();
                                this.Code.Code("dialog:" + e.I(112), this.Code, var9.toString());
                                return;
                            case 120:
                                if (var5 == 4) {
                                    if (e.c() != 0 && e.I(this.Code) == 65) {
                                        this.Code.b();
                                        Code.Code.Code("", (String)null, 16, this.Code);
                                        return;
                                    }

                                    Code.Code.J(var4);
                                    return;
                                }

                                Code.Code((String)null, var4, var5, this.C != null && this.C.length() > 0);
                                return;
                        }
                    case 78:
                        this.aC += 2;
                        this.Code.Code(this.s(), this.p(), this.B());
                        return;
                    case 83:
                        this.B = this.B();
                        this.r = true;
                        this.aC = var6;
                        this.Code(this.B(), true);
                        return;
                    case 119:
                        if (e.Y) {
                            this.g = true;
                            var7 = this.C();
                            (new C(this, var7)).start();
                            return;
                        }
                    case 80:
                    case 87:
                    case 105:
                        var7 = this.C();
                        I var2;
                        (var2 = new I(6)).Code = var7;
                        e.Code(var2);
                        return;
                }

            }
        }
    }

    public final Vector Code() {
        if (this.ac > 0 && this.ad > 0) {
            int var1 = this.Z(this.k());
            int var2 = this.Z(this.l());
            if (this.n == this.aQ && this.o == this.aR && var1 == this.aS && var2 == this.aT && !this.t) {
                return this.a;
            } else {
                if (this.a == null) {
                    this.a = new Vector();
                } else {
                    this.a.removeAllElements();
                }

                this.t = false;
                this.aQ = this.n;
                this.aR = this.o;
                this.aS = var1;
                this.aT = var2;
                int var3 = this.aC;
                this.aC = this.ac;
                int var4 = 0;
                Vector var5 = null;
                if (!e.ar) {
                    var5 = new Vector();
                }

                for(int var6 = e.Code(e.m, "M") * 3; this.aC <= this.ad; this.af()) {
                    int var7 = this.t();
                    int var8 = this.t();
                    if (var7 != 76 && var7 != 67 && var7 != 42 && var7 != 78 && var7 != 87 && var7 != 119 && var7 != 80 && var7 != 73 && var7 != 83) {
                        this.aC += var8 * 10;
                    } else {
                        var7 = 0;

                        for(int var9 = 0; var9 < var8; ++var9) {
                            this.Y();
                            int var10;
                            if (var7 <= 0 && (var10 = this.J(this.e)) >= 0 && e.Code(this.n, this.o, var1, var2, this.d, var10, this.f, this.g)) {
                                ++var7;
                                int var11 = this.d - this.n;
                                int var12 = var10 - this.o;
                                if (var11 < 0 || var11 + this.f > this.k() || var12 < 0 || var12 + this.g > this.l()) {
                                    int var13 = this.g * 70 / 100;
                                    if (var12 < 0 && this.g + var12 < var13 || var12 + this.g > this.l() && this.l() - var12 < var13 || var11 < 0 && this.f + var11 < var6 || var11 + this.f > this.k() && this.k() - var11 < var6) {
                                        continue;
                                    }
                                }

                                int[] var15;
                                (var15 = new int[5])[0] = this.d - this.n;
                                var15[1] = var10 - this.o;
                                var15[2] = this.f;
                                var15[3] = this.g;
                                var15[4] = var4;
                                this.a.addElement(var15);
                                if (var5 != null) {
                                    int[] var14;
                                    (var14 = new int[2])[0] = var4;
                                    var14[1] = (var15[0] < 0 ? 0 : var15[0]) + (var15[1] < 0 ? 0 : var15[1]) * var1;
                                    var5.addElement(var14);
                                }

                                ++var4;
                            }
                        }
                    }
                }

                this.aC = var3;
                this.J(var5);
                return this.a;
            }
        } else {
            return null;
        }
    }

    public final String J() {
        int var1 = e.Code.length;
        if (!this.I() && this.ac > 0 && this.ad > 0 && e.Code != null && var1 != 0) {
            int var2 = this.aC;
            int var3 = 0;

            label169:
            while(var3 < var1) {
                String var4;
                if ((var4 = e.Code[var3].toLowerCase()) == null || var4.length() == 0) {
                    return null;
                }

                this.aC = this.aj;

                while(true) {
                    int var5;
                    int var6;
                    int var7;
                    int var8;
                    int var9;
                    String var10;
                    String var11;
                    label128:
                    do {
                        while(this.aC < this.I.length) {
                            if ((var5 = this.t()) == 84 || var5 == 66 || var5 == 73 || var5 == 70) {
                                this.Y();
                            }

                            if (var5 == 84) {
                                var5 = 0;
                                var6 = 0;
                                var7 = 0;
                                var8 = 0;
                                this.aC += 4;
                                var9 = e.Z(this.t());
                                continue label128;
                            }

                            this.b(var5);
                        }

                        ++var3;
                        continue label169;
                    } while((var11 = (var10 = this.B()).toLowerCase()).indexOf(var4) == -1);

                    int var12;
                    for(var12 = 0; var12 < var10.length(); ++var12) {
                        if (var10.charAt(var12) == '\n') {
                            ++var8;
                        }
                    }

                    for(var12 = 0; var12 < var11.length(); ++var12) {
                        if (var11.charAt(var12) == '\n') {
                            var5 = var12 + 1;
                            ++var7;
                        } else {
                            if (var6 < var4.length() && var11.charAt(var12) == var4.charAt(var6)) {
                                ++var6;
                            } else {
                                var6 = 0;
                            }

                            if (var6 == var4.length()) {
                                var6 = e.Code(var9, var10.substring(var5, var12 - var4.length() + 1));
                                int var13 = e.Code(var9, var10.substring(var5, var12 + 1));
                                int[] var21 = new int[]{this.d + var6, this.e + this.g / (var8 + 1) * var7, var13 - var6, this.g / (var8 + 1)};
                                B var22 = this;
                                if (this.ac > 0 && this.ad > 0) {
                                    int var14 = this.aC;

                                    for(this.aC = this.ac; var22.aC <= var22.ad; var22.af()) {
                                        int var15 = var22.t();
                                        int var16 = var22.t();
                                        int var17 = var22.aC;
                                        if (var15 == 76) {
                                            for(var15 = 0; var15 < var16; ++var15) {
                                                var22.Y();
                                                if (e.Code(var21[0], var21[1], var21[2], var21[3], var22.d, var22.e, var22.f, var22.g)) {
                                                    var22.aC -= (var15 + 1) * 10 + 2;
                                                    var22.w();
                                                    var22.d = var22.C();
                                                    var22.aC = var17;
                                                    int[] var18 = new int[var16 << 2];

                                                    for(var3 = 0; var16-- > 0; var18[var3++] = var22.g) {
                                                        var22.Y();
                                                        var18[var3++] = var22.d;
                                                        var18[var3++] = var22.e;
                                                        var18[var3++] = var22.f;
                                                    }

                                                    B var20 = var22;
                                                    var22.I = new Vector();
                                                    var22.aC = var22.aj;

                                                    while(true) {
                                                        while(var20.aC < var20.I.length) {
                                                            int var19;
                                                            if ((var19 = var20.t()) == 84 || var19 == 66 || var19 == 73 || var19 == 70) {
                                                                var20.Y();
                                                            }

                                                            if (var19 == 84) {
                                                                var19 = var20.aC;
                                                                var20.aC += 4;
                                                                e.Z(var20.t());
                                                                var20.B();
                                                                var5 = 0;

                                                                while(var5 < var18.length) {
                                                                    var6 = var18[var5++];
                                                                    var7 = var18[var5++];
                                                                    var8 = var18[var5++];
                                                                    var9 = var18[var5++];
                                                                    if (e.I(var6, var7, var8, var9, var20.d, var20.e, var20.f, var20.g)) {
                                                                        var20.I.addElement(new Integer(var19));
                                                                    }
                                                                }
                                                            } else {
                                                                var20.b(var19);
                                                            }
                                                        }

                                                        var22.aC = var14;
                                                        this.aC = var2;
                                                        return this.d;
                                                    }
                                                }
                                            }
                                        } else {
                                            var22.aC += var16 * 10;
                                        }
                                    }

                                    var22.aC = var14;
                                    var6 = 0;
                                } else {
                                    System.out.println("no focus data");
                                    var6 = 0;
                                }
                            }
                        }
                    }
                }
            }

            this.aC = var2;
            return null;
        } else {
            return null;
        }
    }

    public final int Code(String var1) {
        if (var1 != null && var1.length() != 0) {
            this.Code.d = var1;
            var1 = var1.toLowerCase();
            this.C = new Vector();
            this.aC = this.aj;

            while(true) {
                int var2;
                int var3;
                int var4;
                int var5;
                int var6;
                int var7;
                String var8;
                String var9;
                int[] var18;
                label67:
                do {
                    while(this.aC < this.I.length) {
                        if ((var2 = this.t()) == 84 || var2 == 66 || var2 == 73 || var2 == 70) {
                            this.Y();
                        }

                        if (var2 == 84) {
                            var2 = this.aC;
                            var3 = 0;
                            var4 = 0;
                            var5 = 0;
                            var6 = 0;
                            this.aC += 4;
                            var7 = e.Z(this.t());
                            continue label67;
                        }

                        this.b(var2);
                    }

                    this.C = new Hashtable();

                    for(int var14 = 0; var14 < this.C.size(); ++var14) {
                        int[] var15 = (int[])this.C.elementAt(var14);
                        Integer var16 = new Integer(var15[6]);
                        int[] var17 = new int[]{var14};
                        if (this.C.containsKey(var16)) {
                            (var17 = new int[(var18 = (int[])this.C.get(var16)).length + 1])[var18.length] = var14;
                            System.arraycopy(var18, 0, var17, 0, var18.length);
                        }

                        this.C.put(var16, var17);
                    }

                    return this.C.size();
                } while((var9 = (var8 = this.B()).toLowerCase()).indexOf(var1) == -1);

                int var10;
                for(var10 = 0; var10 < var8.length(); ++var10) {
                    if (var8.charAt(var10) == '\n') {
                        ++var6;
                    }
                }

                for(var10 = 0; var10 < var9.length(); ++var10) {
                    if (var9.charAt(var10) == '\n') {
                        var3 = var10 + 1;
                        ++var5;
                        var4 = 0;
                    } else {
                        if (var4 < var1.length() && var9.charAt(var10) == var1.charAt(var4)) {
                            ++var4;
                        } else {
                            var4 = 0;
                        }

                        if (var4 == var1.length()) {
                            var4 = e.Code(var7, var8.substring(var3, var10 - var1.length() + 1));
                            int var11 = e.Code(var7, var8.substring(var3, var10 + 1));
                            var11 = (var18 = new int[]{var4, this.g / (var6 + 1) * var5, var11 - var4, this.g / (var6 + 1), this.d, this.e, var2})[1] + var18[5];

                            int var12;
                            for(var12 = this.C.size() - 1; var12 >= 0; --var12) {
                                int[] var13;
                                int var19 = (var13 = (int[])this.C.elementAt(var12))[1] + var13[5];
                                if (var11 >= var19) {
                                    break;
                                }
                            }

                            this.C.insertElementAt(var18, var12 + 1);
                            var4 = 0;
                        }
                    }
                }
            }
        } else {
            return 0;
        }
    }

    final void h() {
        int var1;
        if ((var1 = this.C.size()) != 0) {
            ++this.aP;
            this.aP %= var1;
            if (this.aP >= 0) {
                int[] var4;
                int var2 = (var4 = (int[])this.C.elementAt(this.aP))[0] + var4[2] / 2 + var4[4];
                var1 = var4[1] + var4[3] + var4[5] - 1;
                if ((this.Z[this.I(var1, 0) * 6 + 4] & 1) == 0) {
                    this.ae = this.Code(0, this.J(var1), this.l, 10, this.ae, false);
                    if (this.ae != -1 && this.I[this.ae] == 67) {
                        this.B(false);
                    }
                }

                var1 = this.J(var1);
                int var3 = this.ah;
                this.ah = 0;
                this.Code(var2 - this.O, var1 - this.P, true);
                this.ah = var3;
                if (this.Z()) {
                    this.I(false);
                }

                this.ad();
            }
        }
    }

    static void Code(B var0, DataInputStream var1) {
        var0.Code(var1);
    }

    static void Code(B var0) {
        var0.a(5);
    }
}
