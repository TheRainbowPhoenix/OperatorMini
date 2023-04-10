//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Stack;
import java.util.TimeZone;
import java.util.Vector;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.io.SocketConnection;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;
import javax.microedition.rms.RecordComparator;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordFilter;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public final class e implements Runnable {
    static boolean x;
    static String C;
    static boolean V;
    private static char[][] Code;
    private e k;
    private static g Code;
    static boolean J;
    public long Code;
    public boolean Z;
    public String d;
    static e I = new e((byte)0);
    private static boolean aH;
    public String Code;
    static int a;
    private Connection Code;
    private e B;
    private static int aK = 256;
    B J;
    private int U;
    boolean j;
    private static String[] J = null;
    static int c;
    private char[] Code;
    static int J;
    private static final int[] Z;
    private I Code;
    private byte[] B;
    private int M;
    B I;
    private int N;
    B Z;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private byte[] I;
    private int[] J;
    private int V;
    int Code;
    static int[] I;
    private String r;
    static int G = 0;
    static String I;
    static Vector a = new Vector();
    static Vector I = new Vector();
    static String Z;
    static long a;
    static long J = 0L;
    static long B = 0L;
    static long Z = 32768L;
    static String J;
    static long c;
    static String B;
    static String a;
    static String[] I = new String[3];
    static String b;
    static int n;
    static String c;
    static String k = "";
    static String n = "";
    static final int[] Code;
    private int[] B;
    private int[] C;
    private e C;
    private static Integer Code;
    private e Z;
    private byte[] Z;
    private static e[] Code;
    private DataInputStream Code;
    private static e[] I;
    private byte[] J;
    private static byte[] C;
    private static long d;
    private static long g;
    static long C;
    private static byte[] a = null;
    private static boolean aG;
    public B Code;
    static Vector C = null;
    private e J;
    private String[] Z;
    static int d = 400;
    private Vector c;
    private byte Code;
    private static byte I;
    public static String e;
    private static int Y;
    static int I;
    private static int W;
    private static boolean bg;
    private static int aX = 0;
    private static boolean aI;
    private static int aM = -1;
    private static boolean br = false;
    private static boolean aJ;
    private static boolean aK;
    static boolean A;
    static boolean Code;
    private static byte J;
    private static int X;
    private static byte Z;
    private static String s;
    private static String t;
    public boolean I;
    public Vector Code;
    private DataOutputStream Code;
    private DataInputStream I;
    private DataOutputStream I;
    private e e;
    private long e;
    private e c;
    private long f;
    private e a;
    private e b;
    private boolean aN;
    public Object[] Code;
    private boolean aL;
    public boolean B;
    public boolean C;
    static Hashtable Code;
    public Object[] I;
    private e d;
    private e f;
    private static Object Code;
    static boolean a;
    private static boolean aM;
    public boolean b;
    private static Vector b;
    static int Z;
    private static Random Code = new Random(System.currentTimeMillis());
    static long b;
    static int B;
    e Code;
    private Image Code;
    private static int aL;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    int C;
    static boolean c;
    private int ag;
    static int f;
    static boolean aF = false;
    private String v;
    private int ah;
    private StringBuffer Code;
    private Vector d;
    private Vector e;
    private int ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    static boolean F;
    private int an;
    private boolean aO;
    private int ao;
    private int ap;
    private boolean aP;
    private String u;
    static int m = 0;
    private int aq;
    private int ar;
    private int as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private int ay;
    private int az;
    private Image I;
    private int aA;
    private int aB;
    private Image Z;
    private boolean aQ;
    private int aC;
    boolean d;
    private boolean aR;
    private boolean aS;
    private int aD;
    private int aE;
    private int aF;
    private int aG;
    private boolean aT;
    private boolean aU;
    private int aH;
    private int aI;
    private int aJ;
    boolean e;
    private boolean aV;
    private static Image J;
    static boolean G;
    boolean f;
    boolean g;
    boolean h;
    private static e g;
    private static e h;
    private static int[] h;
    private static int[] i = new int[]{0, 5, 3, 6};
    private static e i;
    private static int[] j = new int[]{1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    private static e j;
    private static int[] a;
    private static int[] b;
    private short[] Code;
    private short[] I;
    boolean i;
    static String[] Code;
    static int b = -1;
    static String f;
    static long I;
    private static boolean aW;
    private static boolean aX;
    static boolean k;
    static boolean l;
    static int l = 1;
    private static boolean aY;
    private static boolean aZ;
    static int k = -1;
    private static boolean ba;
    static boolean m;
    private static boolean bb = true;
    static boolean n;
    static boolean o;
    static boolean p;
    static boolean q;
    static boolean r;
    static String p = "";
    static String m = "";
    static boolean s;
    static boolean t;
    static int t = 0;
    private static int ba = -1;
    private static boolean bc;
    static boolean u;
    static boolean v;
    static boolean w;
    static boolean y;
    static boolean z;
    static boolean D;
    static boolean E;
    private static boolean bd;
    private static boolean be;
    private static boolean bf;
    static boolean H;
    static boolean K;
    static boolean L;
    static boolean M;
    static boolean N;
    static boolean O;
    static boolean P;
    static boolean Q;
    static boolean R;
    static boolean S;
    static String g;
    static String h;
    static int e = 2;
    private static boolean bh;
    static boolean am = true;
    static boolean T;
    static boolean U;
    static boolean W;
    static boolean X;
    static boolean Y;
    static boolean aa;
    static int g = -1;
    static int h = -1;
    static boolean ab;
    static boolean ac;
    static boolean ad;
    static boolean ae;
    private static boolean bi;
    static boolean af;
    static boolean ag;
    static int i = -1;
    static int j = 1;
    static boolean ah;
    static boolean ai;
    static boolean aj;
    private static boolean bj;
    private static boolean bk = true;
    private static boolean bl;
    static boolean ak;
    static boolean al;
    static boolean an = false;
    private static boolean bm = false;
    private static boolean bn = false;
    static boolean ao = true;
    static boolean ap;
    static boolean aq;
    static boolean ar = false;
    static boolean as;
    static boolean at;
    static boolean au = true;
    private static boolean bo = false;
    private static boolean bp = false;
    static boolean av = true;
    static int o = 0;
    static int p = 0;
    static boolean aw;
    static boolean ax = true;
    static boolean ay = true;
    static int q = 0;
    static boolean az = false;
    static boolean aA = true;
    static int r = -1;
    static boolean aB = true;
    static String i = "classic";
    static int s;
    static String j;
    static int u = 0;
    static int v = -1;
    static int w = 0;
    static boolean aC = false;
    static String l = "";
    static String o = "";
    static int x = 0;
    static int y = 0;
    static int z = -2;
    static Vector Z = null;
    static Vector J = null;
    static Vector B = new Vector();
    static int A = 0;
    static boolean aD = false;
    static String q = "";
    private static String w = null;
    static Hashtable I = new Hashtable();
    private static Hashtable Z;
    private static Hashtable B = null;
    private static Object[] Z = null;
    private static int aN;
    private static Hashtable J;
    static int D = -1;
    static boolean aE;
    static Font[] Code;
    static final byte[] Code = new byte[8];
    private static byte[] c;
    private static int[] c = new int[64];
    private static byte[] b = new byte[8];
    private static boolean bq = false;
    private static byte[][] Code;
    private static Hashtable C;
    private static Image B;
    private static int aO;
    static int E;
    private static Stack Code = new Stack();
    private static J Code;
    static int F = -1;
    private static int aP;
    private static int aQ;
    private static int aR;
    private static int bb;
    private static int aS;
    private static int aT;
    private static int aU;
    private static Image C;
    private static Image a;
    private static int aV;
    private static int aW;
    private static int[] d = null;
    private static int[] e;
    private static int[] f;
    private static int[] g;
    private static Vector f = null;
    static int H;
    private static int aY;
    private static boolean bs;
    private static int aZ = -1;
    public static int K = -1;
    public static int L = -1;

    static void i() {
        String var0 = (f = Browser.Code.getAppProperty("Operette-UA")) == null ? "" : f.toLowerCase();
        String var1 = (var1 = Code("microedition.platform")) == null ? "" : var1.toLowerCase();
        String var2 = (var2 = Code("device.model")) == null ? "" : var2.toLowerCase();
        int var3;
        r = (var3 = Browser.Code.numAlphaLevels()) > 2;
        s = var3 >= 16;
        t = var3 > 4;
        o = Code.Code.hasPointerEvents();
        p = Code.Code.hasPointerMotionEvents();
        if (!(as = Code(new char[]{'נ', 'ס', 'ע'}))) {
            as = Code(new char[]{'ب', 'ت', 'ث'});
        }

        if (System.getProperty("microedition.pim.version") != null && Code("javax.microedition.pim.PIM") && Browser.Code.checkPermission("javax.microedition.pim.ContactList.read") != 0) {
            an = true;
        }

        Y = System.getProperty("microedition.io.file.FileConnection.version") != null;
        g = Browser.Code.checkPermission("javax.microedition.io.Connector.file.read");
        h = Browser.Code.checkPermission("javax.microedition.io.Connector.file.write");
        if (var0.indexOf("sagem") >= 0) {
            b = 5;
            W = true;
            an = false;
        }

        if (var1.startsWith("vs")) {
            b = 8;
        }

        if (!var1.startsWith("rim wireless") && !var1.startsWith("blackberry")) {
            if (var1.indexOf("nokia") < 0 && !var1.equals("siemens_sx1") && !var1.equals("sendo x") && !var1.equals("panasonic x700")) {
                if (Code("com.siemens.mp.lcdui.Image")) {
                    b = 2;
                } else if (!Code("com.motorola.phonebook.PhoneBookRecord") && !Code("com.motorola.Dialer") && !Code("com.motorola.phone.Dialer") && !Code("com.motorola.graphics.j3d.Light") && !Code("com.motorola.lwt.ComponentScreen") && !Code("com.motorola.game.GameScreen") && !Code("com.motorola.funlight.FunLight") && !Code("com.motorola.multimedia.Lighting") && !Code("com.motorola.io.ConnectorEvent") && !Code("com.motorola.extensions.ScalableJPGImage") && Code("batterylevel") == null && Code("BatteryLevel") == null && !Code("com.mot.iden.multimedia.Lighting")) {
                    if (var1.indexOf("sonyericsson") >= 0 || var1.equals("symbian os") || var1.startsWith("w302") || (Code("com.sonyericsson.IMEI") != null || Code("com.sonyericsson.imei") != null) && !var1.startsWith("sonimxp3.20")) {
                        b = 3;
                    } else if (!Code("com.samsung.util.AudioClip") && !Code("com.samsung.util.LCDLight") && !Code("com.samsung.util.SM") && !Code("com.samsung.util.SMS") && !Code("com.samsung.util.Vibration") && !var2.startsWith("sgh")) {
                        label878: {
                            if (var1.startsWith("sagem")) {
                                W = false;
                                b = 5;
                            } else if (!var1.startsWith("micromax") && !var1.startsWith("nexiannx-g868") && !var1.equals("nexian") && !var1.startsWith("maui")) {
                                break label878;
                            }

                            an = false;
                        }
                    } else {
                        b = 4;
                    }
                } else {
                    b = 1;
                }
            } else {
                b = 0;
            }
        } else {
            b = 7;
        }

        boolean var4 = Code("com.jblend.util.Case");
        String var5 = Code("microedition.profiles");
        int var6 = Code.Code.getWidth();
        int var7 = Code.Code.getHeight();
        int var8 = Browser.Code.numColors();
        String var9;
        boolean var25 = (var9 = Code("microedition.configuration")) != null && var9.indexOf("CLDC-1.1") >= 0;
        if (var6 <= 128 && b != 3) {
            ar = true;
        }

        boolean var10;
        label864: {
            var10 = false;
            switch(b) {
                case 0:
                    e = 4;
                    if (var1.indexOf("e61") != -1 || var1.indexOf("e62") != -1 || var1.indexOf("e63") != -1 || var1.indexOf("e71") != -1 || var1.indexOf("e72") != -1 || var1.startsWith("nokia9300/") || var1.startsWith("nokia9300i/") || var1.startsWith("nokia9500/")) {
                        e = 10;
                        bh = true;
                    }

                    if (var1.startsWith("nokian") || var1.startsWith("nokiae") || System.getProperty("com.nokia.mid.ui.version") != null || var1.startsWith("nokia6124") || var1.startsWith("nokia6120") || var1.startsWith("nokia6121") || var1.startsWith("nokia5700") || var1.startsWith("nokia6110") || var1.startsWith("nokia5500")) {
                        bh = true;
                    }

                    if (var1.startsWith("nokiae90-1/")) {
                        bh = false;
                    }

                    if (!o) {
                        break label864;
                    }
                    break;
                case 1:
                    if (Code("com.mot.iden.multimedia.Lighting")) {
                        e = 6;
                    } else {
                        e = 5;
                    }

                    if (!o) {
                        break label864;
                    }
                    break;
                case 2:
                    e = 7;
                    if (var1.startsWith("sk6r")) {
                        e = 0;
                    }
                    break label864;
                case 3:
                    if (var1.indexOf("t270") == -1 && var1.indexOf("t280") == -1) {
                        bh = true;
                    }

                    e = 3;
                    if (var1.indexOf("symbian") >= 0) {
                        e = 0;
                    } else if (var1.indexOf("p910") >= 0) {
                        e = 0;
                    } else if (var1.indexOf("m600") >= 0 || var1.indexOf("p1") >= 0 || var1.indexOf("p9") >= 0) {
                        e = 10;
                    }
                    break label864;
                case 4:
                    if (var1.startsWith("gt-m8800")) {
                        f = 1;
                    }

                    if (var2.endsWith("sgh-l700")) {
                        m = 1;
                    }

                    e = 8;
                    if (var0.indexOf("sgh-d900") != -1) {
                        bh = true;
                    }

                    if (var0.startsWith("samsung-sgh-e380")) {
                        an = false;
                    }
                    break label864;
                case 5:
                case 6:
                default:
                    e = 2;
                    if (o && var1.indexOf("emulator") == -1) {
                        f = 1;
                    }

                    if (var1.startsWith("lg-kc550")) {
                        f = 0;
                        bh = true;
                        break label864;
                    }

                    if (b == 8 && var1.startsWith("vs")) {
                        break label864;
                    }

                    if (var1.indexOf("motoq") >= 0) {
                        bh = false;
                        e = 10;
                        f = 1;
                        S = true;
                        break label864;
                    }

                    if (var1.indexOf("palm treo 700w") >= 0) {
                        bh = true;
                        e = 10;
                        S = true;
                        break label864;
                    }

                    if (!var4 && !var1.equals("jbed-fastdac") && var1.indexOf("windows") < 0 && var1.indexOf("intent") < 0 && (!var1.equals("jbed") || var7 <= 128 || var6 <= 128)) {
                        break label864;
                    }
                    break;
                case 7:
                    e = 0;
                    bh = true;
                    break label864;
            }

            f = 1;
        }

        if (Code("com.sprintpcs.util.System") && e == 2) {
            e = 9;
            bh = true;
        }

        if (b == 0) {
            if (var6 < 176) {
                aX = true;
            }

            if (var6 == 176) {
                k = true;
                bh = true;
                aK = 150;
            }

            if (var6 == 240 && var7 == 248 && var25) {
                ba = true;
            }

            if (var1.startsWith("nokiae65-1/") && I(var1, "/0633.18.02") <= 0 || var1.startsWith("nokia5500d/") && I(var1, "/04.60") <= 0 || var1.startsWith("nokiae50-1/") && I(var1, "/07.13.0.0") <= 0 || var1.startsWith("nokiae61i-1/") && I(var1, "/0633.22.05") <= 0) {
                X = true;
            }

            if (var1.startsWith("nokia3230/")) {
                A = true;
            }

            if (var1.startsWith("nokia6260/")) {
                y = true;
                ai = true;
            }

            if (var1.startsWith("nokia6600/")) {
                A = true;
                w = true;
                y = true;
                ai = true;
            }

            if (var1.startsWith("nokia6620/")) {
                y = true;
                ai = true;
            }

            if (var1.startsWith("nokia6630/")) {
                D = true;
                if (I(var1, "/6.03.40") < 0) {
                    Y = false;
                }
            }

            if (var1.startsWith("nokia6670/")) {
                y = true;
                ai = true;
            }

            if (var1.startsWith("nokia6680/")) {
                ac = true;
            }

            if (var1.startsWith("nokia7610/")) {
                A = true;
                y = true;
                ai = true;
            }

            if (var1.startsWith("nokia7710/")) {
                A = true;
                y = true;
                ai = true;
            }

            if (var1.startsWith("nokia9300/") || var1.startsWith("nokia9300i/")) {
                y = true;
                ai = true;
                O = true;
            }

            if (var1.startsWith("nokia9500/")) {
                y = true;
                ai = true;
                O = true;
            }

            if (var1.startsWith("nokiae90-1/")) {
                O = true;
            }

            if (var1.startsWith("nokiae66-1/") || var1.startsWith("nokian82/") || var1.startsWith("nokia5800d-1/") || var1.startsWith("nokian79-1/")) {
                Q = true;
                aj = true;
            }

            if (var1.startsWith("nokian72/") || var1.startsWith("nokian70/") || var1.startsWith("nokian70-1/")) {
                x = true;
            }

            g = "rtyfghvbnmuj";
            h = "1234567890*#";
        }

        if (b == 3) {
            if (var6 <= 176) {
                aX = true;
            }

            if (var1.indexOf("p990") >= 0 || var1.indexOf("m600") >= 0 || var1.indexOf("w950") >= 0) {
                U = true;
                if (var1.indexOf("p990") < 0) {
                    V = true;
                }
            }

            if (var1.indexOf("p910") >= 0) {
                G = true;
                u = true;
                ai = true;
            }

            if (var1.indexOf("symbian") >= 0) {
                u = true;
                ai = true;
            }

            if (Code("javax.wireless.messaging.MultipartMessage") && !Code("javax.microedition.amms.GlobalManager")) {
                c = 2475;
            }

            if (var1.startsWith("sonyericssonp1") || var1.startsWith("sonyericssonm600")) {
                g = "ertyuidfghjkcxvbnm �￼";
                h = "1122334455667788990*#";
            }

            if (var6 <= 176) {
                z = true;
                Image var11;
                Graphics var12;
                (var12 = (var11 = Image.createImage(1, 1)).getGraphics()).setColor(0);
                var12.fillRect(0, 0, 1, 1);
                int[] var13;
                (var13 = new int[1])[0] = -1;
                Image.createRGBImage(var13, 1, 1, false);
                var13[0] = -2147483648;
                Image var14 = Image.createRGBImage(var13, 1, 1, true);
                var12.drawImage(var14, 0, 0, 20);
                var11.getRGB(var13, 0, 1, 0, 0, 1, 1);
                if ((var13[0] & 255) > 16) {
                    r = false;
                    s = false;
                }
            }
        }

        if (b == 1) {
            Y = Y && g != 0 && h != 0;
            T = true;
            c = 1024;
            aL = 290;
            if (var6 <= 176) {
                l = true;
            }

            if (var1.indexOf("symbian") >= 0) {
                u = true;
                ai = true;
            }

            if (var4) {
                r = false;
                s = false;
                t = false;
                g = "ertdfgxcv+zb";
                h = "1234567890*#";
            }

            if (Code("com.mot.iden.multimedia.Lighting")) {
                aW = true;
                ai = true;
                ah = true;
                m = true;
                n = true;
                q = true;
                bc = true;
                s = false;
            }
        }

        if (b == 4) {
            bk = false;
            if (var2.endsWith("sgh-gt-b2700")) {
                o = false;
                p = false;
            }

            if (var2.startsWith("sgh-g400")) {
                o = false;
                p = false;
            }

            if (var1.startsWith("s7220")) {
                o = false;
                p = false;
            }

            if (var1.startsWith("s7350")) {
                o = false;
                p = false;
            }

            if (var1.equals("j2me") && var3 == 2 && var25 && var6 == 240 && var7 == 286 && var8 == 65536) {
                be = true;
                c = 256;
            }

            if (var6 == 240 && var7 == 279 && var8 == 65536 && var3 == 256 && var25) {
                F = true;
            }

            bd = true;
            if (var6 == 320 && var7 == 186 && var8 == 65536 && var3 == 65536) {
                ad = true;
            }

            if (var6 == 128 && var7 == 144 || var6 == 176 && var7 == 204 || var6 == 220 && var7 == 160) {
                aW = true;
            }

            if (var1.startsWith("gt-m8800")) {
                P = true;
            }

            if (var1.startsWith("sgh-p310") || var0.indexOf("x820") != -1 || var0.indexOf("sghd830") != -1 || var0.indexOf("sgh-e25") != -1) {
                Y = false;
            }

            if (var0.indexOf("sgh-e250") != -1 || var0.indexOf("sgh-e370") != -1 || var0.indexOf("sgh-d900") != -1 || var0.indexOf("sphm500") != -1 || var0.indexOf("sphm610") != -1 || var0.indexOf("spha800") != -1 || var0.indexOf("spha900") != -1) {
                S = true;
            }

            if (var1.startsWith("sgh-t459")) {
                aa = true;
                c = 1024;
            }

            if (var1.startsWith("samsung gt-c3510") || var1.startsWith("samsung gt-b3410") || var1.startsWith("samsung gt-b5722") || var1.startsWith("samsung sgh-d980")) {
                o = true;
                p = true;
            }
        }

        if (var1.indexOf("sxg75") < 0 && var1.indexOf("ef81") < 0) {
            if (b == 2) {
                aY = true;
                m = true;
                ai = true;
                S = true;
                H = true;
                if (var6 < 176) {
                    aX = true;
                }

                if (var1.indexOf("s68") >= 0) {
                    E = true;
                }

                if (var1.indexOf("el71") >= 0 || var1.indexOf("e71") >= 0) {
                    bg = true;
                }

                if (var1.indexOf("c6") >= 0 || var1.indexOf("cx6") >= 0 || var1.indexOf("m6") >= 0 || var1.indexOf("sl75") >= 0) {
                    aj = true;
                }
            }
        } else {
            ba = true;
            b = 2;
        }

        if (b == 8 && var1.startsWith("vs")) {
            T = true;
            af = true;
        }

        if (b == 7) {
            H = true;
            g = "wersdfzxc\u0089aq";
            h = "1234567890*#";
            af = true;
            R = true;
            aj = true;
            var10 = true;
        }

        if (b == -1) {
            if (var1.startsWith("wx320kr") || var1.startsWith("wx340k") || var1.startsWith("wx333k")) {
                af = true;
            }

            if (var1.startsWith("windows ce")) {
                ba = true;
                if (!Code.Code.hasPointerEvents() || var1.indexOf("palm treo 700w") >= 0) {
                    af = true;
                }

                bi = true;
            }

            if (!var4) {
                if (var1.equals("j2me")) {
                    ba = true;
                    if (var6 == 128 && var7 == 129) {
                        v = true;
                    }
                }
            } else {
                T = true;
                if (var1.equals("j2me") && var6 == 320 && var7 == 186 || var6 == 240 && var7 == 268 || var6 == 320 && var7 == 250) {
                    Font var18 = Font.getFont(64, 0, 8);
                    Font var23 = Font.getFont(64, 1, 8);
                    Font var26 = Font.getFont(64, 1, 16);
                    if (var23.stringWidth(Code((int)7)) <= var18.stringWidth(Code((int)7))) {
                        if (var23.stringWidth(Code((int)7)) > var26.stringWidth(Code((int)7))) {
                            n = true;
                        } else {
                            bq = true;
                            Code = new byte[6][2048];

                            for(int var19 = 0; var19 < 6; ++var19) {
                                for(int var24 = 0; var24 < 2048; ++var24) {
                                    Code[var19][var24] = -1;
                                }
                            }
                        }
                    }
                }
            }

            if (var1.equals("jbed")) {
                bf = true;
                if (var6 == 128 && (var7 == 110 || var7 == 142)) {
                    v = true;
                }

                if (var0.startsWith("semc-venus")) {
                    m = 1;
                    ak = true;
                }
            }

            if (var1.equals("jbed-fastdac")) {
                af = true;
                ba = true;
                c = 260;
            }

            if (var1.equals("intent jte")) {
                if (!Code.Code.hasPointerEvents()) {
                    af = true;
                }

                ag = true;
            }

            if (var1.equals("jbed-fastbcc") && var6 == 240 && var7 == 325 && var8 == 65536 && var3 == 256 && var25) {
                m = 2;
                o = true;
                p = true;
            }

            if (var1.startsWith("maui") || var1.startsWith("fly-sx210")) {
                aj = true;
            }

            if (var1.startsWith("lg-kc910")) {
                P = true;
            }

            if (var1.startsWith("lg-kc550")) {
                o = false;
                p = false;
            }

            if (var1.startsWith("htc touch diamond p3700") || var1.startsWith("htc touch pro t7272") || var1.startsWith("htc touch hd t8282")) {
                m = 2;
            }

            if (var1.startsWith("htc s740")) {
                ak = true;
                bl = true;
                aj = true;
            }

            if (var1.startsWith("htc touch pro t7272")) {
                ak = true;
            }

            if (var1.startsWith("amoi8512")) {
                al = true;
            }

            if (var0.indexOf("t-mobile vairy touch ii/") >= 0) {
                o = true;
                p = true;
            }
        }

        if (Code("com.sprintpcs.util.System") || var5 != null && var5.indexOf("SPRINTPCS-1.0") >= 0) {
            if (var1.endsWith("sph-m800") || var1.endsWith("sph-m810")) {
                e = 0;
                ba = true;
                R = true;
            }

            var10 = true;
            if (b == -1) {
                if (var6 == 176 && (var7 == 177 || var7 == 182) || var6 == 128 && var7 == 136) {
                    T = true;
                }

                if (var6 == 176 && var7 == 185 && var8 == 65536 && var3 == 256) {
                    t = false;
                }

                if (Code.Code.hasRepeatEvents() && var3 == 256) {
                    S = true;
                }
            }
        }

        if (!var10) {
            if (Code("javax.wireless.messaging.MessageConnection") && Code("javax.wireless.messaging.TextMessage")) {
                ab = true;
            } else {
                ab = false;
            }
        }

        if (var0.indexOf("spha900") == -1 && var0.indexOf("spha920") == -1) {
            Image var15;
            Graphics var16 = (var15 = Image.createImage(10, 20)).getGraphics();
            Image var21 = Image.createImage(10, 10);
            Sprite var20 = new Sprite(var21);
            Graphics var22 = var21.getGraphics();
            var20.setTransform(5);
            var22.setColor(0);
            var22.fillRect(0, 0, 5, 5);
            var20.setPosition(0, 0);
            var20.paint(var16);
            var22.setColor(16777215);
            var22.fillRect(0, 0, 10, 10);
            var22.setColor(0);
            var22.fillRect(5, 0, 5, 5);
            var20.setPosition(0, 10);
            var20.paint(var16);
            int[] var17 = new int[1];
            var15.getRGB(var17, 0, 1, 9, 19, 1, 1);
            if ((var17[0] & 16777215) != 0) {
                aj = true;
            }

        } else {
            bj = true;
        }
    }

    static String Code(int var0, boolean var1) {
        String var2 = null;
        String var3 = null;
        switch(var0) {
            case 0:
                var2 = I(80);
                var3 = Code((int)24);
                break;
            case 1:
                var2 = I(90);
                var3 = Code((int)7);
            case 2:
            default:
                break;
            case 3:
                var2 = I(119);
                var3 = Code((int)52);
                break;
            case 4:
                var2 = I(65);
                var3 = Code((int)42);
                break;
            case 5:
                var2 = I(86);
                var3 = Code((int)16);
                break;
            case 6:
                var2 = "nint:" + I(77);
                var3 = Code((int)49);
                break;
            case 7:
                var2 = "nint:dialog:" + I(89);
                var3 = Code((int)105);
                break;
            case 8:
                var2 = I(73);
                var3 = Code((int)9);
                break;
            case 9:
                var2 = I(109);
                var3 = Code((int)47);
                break;
            case 10:
                var2 = I(83);
                var3 = Code((int)5);
                break;
            case 11:
                var2 = I(82);
                var3 = Code((int)32);
                break;
            case 12:
                var2 = I(127);
                var3 = Code((int)141);
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                Object[] var4;
                if ((var4 = Code(J, var0 - 13)) != null && !Code(var4)) {
                    var2 = "ext:" + var4[0];
                    String var5;
                    if ((var5 = (var5 = (String)var4[1]) != null && var5.length() != 0 ? var5 : var2).startsWith("http://")) {
                        var5 = var5.substring(7);
                    } else if (var5.startsWith("https://")) {
                        var5 = var5.substring(8);
                    }

                    if (var5.startsWith("www.")) {
                        var5 = var5.substring(4);
                    }

                    var3 = var5;
                }
                break;
            case 22:
                var2 = "feed:start//" + System.currentTimeMillis();
                var3 = Code((int)34);
                break;
            case 23:
                if (aj) {
                    return null;
                }

                var2 = I(39);
                var3 = Code((int)176);
                break;
            case 24:
                var2 = I(120);
                var3 = Code((int)51);
                break;
            case 25:
                var3 = Code((int)226);
                var2 = I(153);
                break;
            case 26:
                var3 = Code((int)227);
                var2 = I(154);
                break;
            case 27:
                var3 = Code((int)231);
                var2 = I(158);
                break;
            case 28:
                var3 = Code((int)229);
                var2 = I(156);
                break;
            case 29:
                var3 = Code((int)236);
                var2 = I(159);
                break;
            case 30:
                var3 = Code((int)230);
                var2 = I(157);
                break;
            case 31:
                var3 = Code((int)13);
                var2 = I(162);
                break;
            case 32:
                var3 = Code((int)228);
                var2 = I(155);
                break;
            case 33:
                var3 = Code((int)89);
                var2 = I(161);
                break;
            case 34:
                var3 = Code((int)232);
                var2 = I(81);
                break;
            case 35:
                if (z < 0) {
                    return null;
                }

                var3 = Code((int)233);
                var2 = I(151);
                break;
            case 36:
                if (n <= 0) {
                    return null;
                }

                var3 = Code((int)234);
                var2 = I(150);
                break;
            case 37:
                var3 = Code((int)235);
                var2 = I(152);
                break;
            case 38:
                var3 = Code((int)97);
                var2 = "dialog:" + I(33);
                break;
            case 39:
                var3 = Code((int)225);
                var2 = I(160);
                break;
            case 40:
                var2 = "bottomOverlay:" + I(165);
                var3 = Code((int)256);
                break;
            case 41:
                var2 = "addTab:";
                var3 = Code((int)248);
                break;
            case 42:
                var2 = "closeTab:" + Code.Z();
                var3 = Code((int)250);
                break;
            case 43:
                var2 = "moveToLeftTab:";
                var3 = Code((int)253);
                break;
            case 44:
                var2 = "moveToRightTab:";
                var3 = Code((int)254);
        }

        return var1 ? var3 : var2;
    }

    static void Code(Graphics var0, int var1, int var2, int var3, int var4, int var5, boolean var6) {
        int var7;
        if ((var7 = var5 >>> 24) != 0) {
            if (var7 >= 254) {
                Code(var0, var1, var2, var3, var4, var5);
            } else if (r) {
                if (aV != var5 || aW != var7) {
                    int var8;
                    for(var8 = 0; var8 < c.length; ++var8) {
                        c[var8] = var5;
                    }

                    if (z) {
                        if (d == null || d.length != 64) {
                            d = new int[64];

                            for(var8 = 0; var8 < d.length; ++var8) {
                                d[var8] = -1;
                            }
                        }

                        Image.createRGBImage(d, 8, 8, false);
                    }

                    if (!y) {
                        C = Image.createRGBImage(c, 8, 8, true);
                    }

                    aV = var5;
                    aW = var7;
                    if (var6) {
                        e = new int[]{var7, var7, var7, var7, (var7 << 1) / 3, var7, var7, var7, var7, var7 / 3, var7, var7, var7, (var7 << 1) / 3, 0, var7, var7, (var7 << 1) / 3, 0, 0, (var7 << 1) / 3, var7 / 3, 0, 0, 0};

                        for(var7 = 0; var7 < e.length; ++var7) {
                            e[var7] = var5 & 16777215 | e[var7] << 24;
                        }

                        if (y) {
                            h = new int[25];
                            f = new int[25];
                            g = new int[25];
                            var5 = 0;

                            for(var7 = 0; var7 < 5; ++var7) {
                                for(var8 = 0; var8 < 5; ++var8) {
                                    h[var5] = e[(4 - var7) * 5 + (4 - var8)];
                                    g[var5] = e[(4 - var7) * 5 + var8];
                                    f[var5++] = e[var7 * 5 + (4 - var8)];
                                }
                            }
                        } else {
                            a = Image.createRGBImage(e, 5, 5, true);
                        }
                    }
                }

                if (var6) {
                    var3 -= 10;
                    var1 += 5;
                }

                I(var0, var1, var2, var3, var4);

                for(var5 = var1; var5 < var1 + var3; var5 += 8) {
                    var7 = var2;

                    while(var7 < var2 + var4) {
                        if (y) {
                            var0.drawRGB(c, 0, 8, var5, var7, 8, 8, true);
                            var7 += 8;
                        } else {
                            var0.drawImage(C, var5, var7, 20);
                            var7 += 8;
                        }
                    }
                }

                Z(var0);
                if (var6) {
                    var3 += 10;
                    var1 -= 5;
                    var4 -= 10;
                    var2 += 5;
                    I(var0, var1, var2, var3, var4);
                    var5 = var2;

                    while(var5 < var2 + var4) {
                        if (y) {
                            var0.drawRGB(c, 0, 8, var1 - 3, var5, 8, 8, true);
                            var0.drawRGB(c, 0, 8, var1 + var3 - 5, var5, 8, 8, true);
                            var5 += 8;
                        } else {
                            var0.drawImage(C, var1 - 3, var5, 20);
                            var0.drawImage(C, var1 + var3 - 5, var5, 20);
                            var5 += 8;
                        }
                    }

                    Z(var0);
                    var4 += 10;
                    var2 -= 5;
                    I(var0, var1, var2, var3, var4);
                    if (y) {
                        var0.drawRGB(g, 0, 5, var1 + var3 - 5, var2, 5, 5, true);
                        var0.drawRGB(e, 0, 5, var1 + var3 - 5, var2 + var4 - 5, 5, 5, true);
                        var0.drawRGB(h, 0, 5, var1, var2, 5, 5, true);
                        var0.drawRGB(f, 0, 5, var1, var2 + var4 - 5, 5, 5, true);
                    } else {
                        var0.drawRegion(a, 0, 0, 5, 5, 3, var1, var2, 20);
                        var0.drawRegion(a, 0, 0, 5, 5, 6, var1 + var3 - 5, var2, 20);
                        var0.drawRegion(a, 0, 0, 5, 5, 5, var1, var2 + var4 - 5, 20);
                        var0.drawRegion(a, 0, 0, 5, 5, 0, var1 + var3 - 5, var2 + var4 - 5, 20);
                    }

                    Z(var0);
                }

            }
        }
    }

    private static void U() {
        k = "";
        l = "";
        m = "";
        n = "";
        o = "";
        aC = false;
    }

    static {
        (C = new Hashtable(6)).put("http", new Integer(80));
        C.put("https", new Integer(443));
        C.put("ftp", new Integer(21));
        C.put("rtsp", new Integer(554));
        Code = new Integer(0);
        new Stack();
        a = new int[29];
        b = new int[30];
        g = new e("i", "*", 0, "/firsttime-nhorizon/*", 1);
        h = new e("server", "*", 0, "setup", 1);
        i = new e(0, 0, "mini4cn.opera-mini.net", 80, 1080, "8c60d2a6811f85366af231ae416831b09409b614e9cfa8fde8d8577e892636e0e0b7a151f9601b930bf527ea8a22bfe6fb5f72506bd3e81b3b55d189af17e35b2d7ea61d84ba4e62cf1c01789edb2c3f3c00fc3c09ee1fc9627367294727e52af4c990516d8d7aad4e00d6ab50cd8ca63705df0af243e666dad282d6514b656780e108d591cf78920f7bdee21ed1419a080655ca2acdadc4e64dba01b5accf73", "mini4cn.opera-mini.net");
        B = 6;
        c = true;
        I = -1;
        Code = true;
        Z = -1;
        J = -1;
        s = "";
        t = "";
        Code = new Hashtable();
        Code = new Object();
        Y = -1;
        b = new Vector(2);
        J = -1;
        C = new byte[0];
        B = "";
        a = "";
        Code = new int[]{553648128, 1090519040, -2130706432, -1593835520};
        Z = Code((byte[])Code("428a2f9871374491b5c0fbcfe9b5dba53956c25b59f111f1923f82a4ab1c5ed5d807aa9812835b01243185be550c7dc372be5d7480deb1fe9bdc06a7c19bf174e49b69c1efbe47860fc19dc6240ca1cc2de92c6f4a7484aa5cb0a9dc76f988da983e5152a831c66db00327c8bf597fc7c6e00bf3d5a7914706ca63511429296727b70a852e1b21384d2c6dfc53380d13650a7354766a0abb81c2c92e92722c85a2bfe8a1a81a664bc24b8b70c76c51a3d192e819d6990624f40e3585106aa07019a4c1161e376c082748774c34b0bcb5391c0cb34ed8aa4a5b9cca4f682e6ff3748f82ee78a5636f84c878148cc7020890befffaa4506cebbef9a3f7c67178f2"), (int)0, (int)256);
    }

    static void e() {
        Code var0;
        synchronized(var0 = Code.Code){}
        boolean var3 = false;

        char[][] var10000;
        label94: {
            try {
                var3 = true;
                switch(c()) {
                    case 0:
                    case 1:
                    default:
                        var3 = false;
                        break;
                    case 2:
                        Code = Code("\u0001\u0004\u00020 0\u00171./:_-~%$?=&!+#*@,;\\'()1\u0001**\u0001##");
                        var3 = false;
                        return;
                    case 3:
                        Code = Code("\u0000\f\u00020+0\u00171./:_-~%$?=&!+#*@,;\\'()1\u00042abc2\u00043def3\u00044ghi4\u00045jkl5\u00046mno6\u00057pqrs7\u00048tuv8\u00059wxyz9\u0000*\u0003# *#");
                        var3 = false;
                        return;
                    case 4:
                        Code = Code("\u0001\u0002\u00020 0\u0000#");
                        var3 = false;
                        return;
                    case 5:
                        Code = Code("\u0001\u0003\u000100\u0001* \u0000#");
                        var3 = false;
                        return;
                    case 6:
                        Code = Code("\u0001\u0002\u00170./:_-~%$?=&!+#*@,;\\'()0\u0001# ");
                        var3 = false;
                        return;
                    case 7:
                        Code = Code("\u0001\u0003\u00170./:_-~%$?=&!+#*@,;\\'()0\u00021 1\u0000#");
                        var3 = false;
                        return;
                    case 8:
                        Code = Code("\u0001\u0002\u000100\u0001# ");
                        var3 = false;
                        return;
                    case 9:
                        Code = Code("\u0001\u0002\u000100\u0001# ");
                        var3 = false;
                        return;
                    case 10:
                        var10000 = Code("\u0002\u0000");
                        var3 = false;
                        break label94;
                }
            } finally {
                if (var3) {
                    ;
                }
            }

            Code = null;
            return;
        }

        Code = var10000;
    }

    static String Code(String var0, String var1) {
        if (var0 != null && var1 != null) {
            if ((var0 = '&' + var0 + '&').indexOf('&' + var1 + '&') >= 0) {
                return "";
            }

            int var2;
            if ((var2 = var0.indexOf('&' + var1 + '=')) >= 0) {
                int var3 = var2 + var1.length() + 2;
                return C(var0.substring(var3, var0.indexOf(38, var3)));
            }
        }

        return null;
    }

    private static String I(String var0, String var1) {
        String var10000;
        int var2;
        int var3;
        if (var0 == null) {
            var10000 = null;
        } else {
            var2 = var0.length();
            var3 = var0.indexOf(":/");
            int var4 = var0.indexOf(58);
            if (var3 >= 0 && var3 <= 10) {
                var10000 = var0;
            } else {
                label108: {
                    if (var4 != -1 && var3 == -1) {
                        if (var4 + 1 == var2) {
                            var10000 = var0;
                            break label108;
                        }

                        char var6;
                        if ((var6 = var0.charAt(var4 + 1)) < '0' || var6 > '9') {
                            var10000 = var0;
                            break label108;
                        }
                    }

                    var10000 = "http://" + var0;
                }
            }
        }

        var0 = var10000;
        if (var10000 == null) {
            return "";
        } else {
            var2 = var0.indexOf("https://");
            var3 = var0.indexOf(47, var2 + 8);
            StringBuffer var9 = new StringBuffer(var0);
            if (var1 != null && var1.length() > 0 && var2 == -1) {
                int var5;
                if ((var5 = var1.indexOf("={\"c\":")) != -1) {
                    var1 = var1.substring(0, var5);
                }

                var1 = J(var1);
                var9.append('?').append(var1);
            }

            if (var2 != -1 && var3 != -1) {
                var9.delete(var3, var9.length());
            }

            boolean var7 = false;
            boolean var8 = false;

            for(var3 = var9.length() - 1; var3 >= 0; --var3) {
                char var10;
                if ((var10 = var9.charAt(var3)) >= '!' && var10 <= '~' && "\"#;<>[]^`{|}~\\".indexOf(var10) < 0) {
                    if (var10 == '=') {
                        var7 = true;
                    } else if (var10 == '&') {
                        var8 = false;
                        var7 = false;
                    } else if (var10 == '.') {
                        var8 = true;
                    }

                    if (var3 > var0.length() && var7 && var8) {
                        var9.deleteCharAt(var3);
                    }
                } else {
                    var9.deleteCharAt(var3);
                }
            }

            var9.setLength(127);
            if (var9.charAt(126) == '%') {
                var9.setLength(126);
            } else if (var9.charAt(125) == '%') {
                var9.setLength(125);
            }

            return var9.toString().trim();
        }
    }

    private void H() {
        this.E();
        this.c.x();
        int var1 = ((this.B[1] & 255) << 2) + 128;
        int var2 = this.B[2] & 255;
        this.B(5, var2 + 166 + var1);
        this.D();
        this.c.Z = new byte[var2 + 1];
        C = this.c.Z;
        System.arraycopy(this.B, 2, this.c.Z, 0, var2 + 1);
        int[] var3 = Code((byte[])this.B, (int)(var2 + 3), (int)160);
        int[] var4 = Code(this.B, var2 + 163, var1);
        byte[] var10001 = this.B;
        var1 += var2 + 163;
        byte[] var5 = var10001;
        this.c.Code = (long)Z(var10001, var1) << 32 | (long)Z(var5, var1 + 4) & 4294967295L;
        this.c.B = var3;
        this.c.C = var4;
        if (!aG) {
            d = System.currentTimeMillis() - (this.c.Code - 1209600000L);
            aG = true;
        }

    }

    static void Code(Runnable var0) {
        (new Thread(var0)).start();
    }

    static void Code(e var0) {
        I var1;
        (var1 = new I(42)).Code = var0;
        Code.Code.Code.schedule(var1, 100L, 100L);
    }

    private e(byte[] var1, int var2) {
        this.j = true;
        this.g = true;
        super();
        this.J = new e((byte)0);
        this.Z = new byte[64];
        this.J = new byte[64];
        this.I = new byte[32];
        System.arraycopy(var1, var2, this.Z, 0, 32);
        System.arraycopy(var1, var2, this.J, 0, 32);

        for(int var3 = 0; var3 < 64; ++var3) {
            byte[] var10000 = this.J;
            var10000[var3] = (byte)(var10000[var3] ^ 54);
            var10000 = this.Z;
            var10000[var3] = (byte)(var10000[var3] ^ 92);
        }

        this.J.Code((byte[])this.J, (int)0, (int)64);
    }

    private int g() {
        while(this.P >= this.aG) {
            this.k.f(true);
        }

        ++this.U;
        return this.B[this.P++] & 255;
    }

    private void Z(byte[] var1, int var2) {
        for(int var3 = var2; var3 < 64; ++var3) {
            this.J[var3] = 0;
        }

        System.arraycopy(var1, 0, this.J, 0, Math.min(64, var2));
        this.B.I(this.J, 0, 64);
        this.B.Z(this.Z, 0, 32);
    }

    private void Z(byte[] var1, int var2, int var3) {
        this.J.Code(this.I);
        this.J.Code((byte[])this.Z, (int)0, (int)64);
        this.J.Code((byte[])this.I, (int)0, (int)32);
        this.J.Code(this.I);
        System.arraycopy(this.I, 0, var1, var2, var3);
        this.J.Code((byte[])this.J, (int)0, (int)64);
    }

    private static void J(int var0, byte[] var1, int var2) {
        var1[var2] = (byte)(var0 >> 24);
        var1[var2 + 1] = (byte)(var0 >>> 16);
        var1[var2 + 2] = (byte)(var0 >>> 8);
        var1[var2 + 3] = (byte)var0;
    }

    private void J(byte[] var1, int var2, int var3) {
        int var5;
        for(int var4 = var2; var4 < var3; var4 += var5 + 6) {
            var5 = I(var1, var4 + 4);
            this.B.C(this.U++);
            this.B.I(var1, var4 + 4, var5 + 2);
            this.B.Z(var1, var4, 4);
        }

        this.e.B(var1, var2, var3 - var2);
    }

    public static void Code(int var0, byte[] var1, int var2) {
        var1[var2] = (byte)(var0 >> 8);
        var1[var2 + 1] = (byte)var0;
    }

    private int[] Code(int var1) {
        return this.Code(this.aG, var1);
    }

    public static int Code(int var0, int var1, int var2) {
        return Math.max(Math.min(var0, var2), var1);
    }

    final boolean Code(int var1, int var2) {
        if (this.Code((int)16)) {
            return var1 >= this.U && var1 <= this.U + this.R && var2 >= this.N && var2 <= this.N + this.az + this.av;
        } else {
            return var1 >= this.U && var1 <= this.U + this.R && var2 >= this.N && var2 <= this.N + this.S;
        }
    }

    private synchronized boolean h() {
        return this.N > 0 && (this.Code >= this.f ? Math.max(this.Code, this.e) + 240000L : (this.i() ? this.f : Math.max(this.f, this.e)) + (long)this.N) - System.currentTimeMillis() < 0L;
    }

    static long Code(boolean var0, boolean var1) {
        long var2 = System.currentTimeMillis();
        if (var1) {
            var2 += (long)(o * 60 * 60 * 1000 + p * 60 * 1000);
        }

        if (var0) {
            var2 += 1800000L;
        }

        return var2;
    }

    static void Code(DataOutputStream var0, int var1) {
        var0.writeShort(var1 >> 8);
        var0.write(var1);
    }

    final int Z() {
        return this.M;
    }

    private e(String var1) {
        this.j = true;
        super();
        this.Code = var1;
    }

    final boolean Z() {
        return this.Z;
    }

    public final e Code() {
        return this.C;
    }

    public static void I(int var0, byte[] var1, int var2) {
        var1[var2] = (byte)(var0 >> 24);
        var1[var2 + 1] = (byte)(var0 >> 16);
        var1[var2 + 2] = (byte)(var0 >> 8);
        var1[var2 + 3] = (byte)var0;
    }

    public static void Z(int var0, byte[] var1, int var2) {
        var1[var2] = (byte)(var0 >> 16);
        var1[var2 + 1] = (byte)(var0 >> 8);
        var1[var2 + 2] = (byte)var0;
    }

    private static synchronized void I(byte[] var0) {
        I.Code((byte[])var0, (int)0, (int)var0.length);
    }

    private void I(byte[] var1, int var2, int var3) {
        this.J.Code(var1, var2, var3);
    }

    private e(byte var1) {
        this.I = new byte[4];
        this.J = new int[64];
        this.v();
    }

    static char[] Code(int var0) {
        if (J == null) {
            return null;
        } else {
            String var1;
            return (var1 = (String)J.get(new Integer(var0))) == null ? null : var1.toCharArray();
        }
    }

    private static int J(String var0) {
        int var1 = 0;

        for(int var2 = 0; var2 < var0.length(); ++var2) {
            var1 = var1 * 31 + var0.charAt(var2);
        }

        return var1;
    }

    private void Code(byte var1) {
        this.I[this.U++] = var1;
        if (this.U == this.I.length) {
            this.Code((byte[])this.I, (int)0);
            this.U = 0;
        }

        ++this.Code;
    }

    private void v() {
        this.Code = 0;
        this.U = 0;

        int var1;
        for(var1 = 0; var1 < this.I.length; ++var1) {
            this.I[var1] = 0;
        }

        this.V = 0;

        for(var1 = 0; var1 < this.J.length; ++var1) {
            this.J[var1] = 0;
        }

        this.M = 1779033703;
        this.N = -1150833019;
        this.O = 1013904242;
        this.P = -1521486534;
        this.Q = 1359893119;
        this.R = -1694144372;
        this.S = 528734635;
        this.T = 1541459225;
    }

    static Vector Code(int var0) {
        switch(var0) {
            case 52:
                return J;
            case 101:
                return Z;
            case 141:
                return a;
            default:
                return C;
        }
    }

    private static int Z(String var0) {
        int var1 = 0;
        int var2 = 0;

        while(true) {
            while(var2 < var0.length()) {
                char var3;
                if ((var3 = var0.charAt(var2)) > 0 && var3 <= 127) {
                    ++var1;
                    ++var2;
                } else if (var3 > 2047) {
                    var1 += 3;
                    ++var2;
                } else {
                    var1 += 2;
                    ++var2;
                }
            }

            return var1;
        }
    }

    private void B(int var1) {
        this.Code((byte)(var1 >> 24));
        this.Code((byte)(var1 >>> 16));
        this.Code((byte)(var1 >>> 8));
        this.Code((byte)var1);
    }

    private static int a(int var0) {
        switch((var0 & 255) >> 4) {
            case 12:
            case 13:
                return 2;
            case 14:
                return 3;
            case 15:
                return 4;
            default:
                return 1;
        }
    }

    static void Code(StringBuffer var0, String var1) {
        var0.ensureCapacity(var0.length() + var1.length());
        int var2 = 0;

        while(var2 < var1.length()) {
            char var3;
            if ((var3 = var1.charAt(var2)) == 0) {
                var0.append("%00");
                ++var2;
            } else if ("%&=".indexOf(var3) >= 0) {
                var0.append('%').append(Integer.toString(var3, 16));
                ++var2;
            } else {
                var0.append(var3);
                ++var2;
            }
        }

    }

    private void K() {
        if (this.aV && this.Code((int)1)) {
            if (this.Code == null && J != null) {
                this.Code = J;
                J = null;
            }

            if (this.Code == null || this.V != this.Code.getWidth() || this.S != this.Code.getHeight()) {
                this.Code = null;
                int var10001 = this.V;
                int var10002 = this.S;

                Image var3;
                try {
                    var3 = Image.createImage(var10001, var10002);
                } finally {
                    ;
                }

                this.Code = var3;
                this.aN = true;
            }
        }
    }

    final boolean J() {
        return this.Code((int)56);
    }

    private void e(boolean var1) {
        this.Code(var1, 0);
    }

    static void u() {
        J((int)System.currentTimeMillis());
    }

    static synchronized e Code(byte[] var0) {
        J(aY++);
        I.Code(var0);
        I.Code((byte[])var0, (int)0, (int)32);
        e var1;
        (var1 = new e('\u0000')).I((byte[])var0, 0);
        byte[] var2 = C;
        var1.Z(var2, var2.length);
        var1.J(var0, 0);
        return var1;
    }

    private boolean Code(long var1) {
        return this.Code < var1 || this.Code - 1814400000L > var1;
    }

    public final String Code() {
        return this.d + this.Code.substring(0, 8);
    }

    private void Code(byte[] var1, int var2, int var3) {
        while(this.U != 0 && var3 > 0) {
            this.Code(var1[var2]);
            ++var2;
            --var3;
        }

        while(var3 > this.I.length) {
            this.Code(var1, var2);
            var2 += this.I.length;
            var3 -= this.I.length;
            this.Code += this.I.length;
        }

        while(var3 > 0) {
            this.Code(var1[var2]);
            ++var2;
            --var3;
        }

    }

    public static void Code(int var0) {
        if (var0 != W) {
            b(0);
            W = var0;
            aI = true;
        }

    }

    private static int d() {
        String var10000 = System.getProperty("com.sonyericsson.net.mcc");

        try {
            return Integer.parseInt(var10000);
        } finally {
            return -1;
        }
    }

    public static String Code(byte[] var0, int var1) {
        int var2 = I(var0, var1);
        var1 += 2;
        return Code(var0, var1, var1 + var2);
    }

    private static int b(int var0) {
        int var1 = 0;
        if (var0 > 0) {
            var1 = 1;
        }

        if (var0 >= 10) {
            var1 = (var0 - 1) / 9 + 1;
        } else if (var0 > 0) {
            var1 = 1;
        }

        return var1;
    }

    private void Code(String var1, Vector var2) {
        for(int var3 = 0; var3 < var2.size(); ++var3) {
            Object var4 = null;
            String var5;
            if (var2 == Code.Code) {
                var5 = (String)var2.elementAt(var3);
            } else {
                var5 = (String)Code(var2, var3)[0];
                var4 = Code(var2, var3)[2];
            }

            int var8 = var5.indexOf("://");
            int var9 = var5.indexOf("www.");
            byte var10 = 0;
            if (Code((String)var5, (String)"http://", 0) && !Code((String)var1, (String)"http://", 0)) {
                var10 = 7;
            }

            if (((Code((String)var5, (String)var1, var10) ? 0 : (var9 == 0 && Code(var5, var1, var10 + 4) ? 4 : (var8 != -1 && Code(var5, var1, var8 + 3) ? var8 + 3 : (var8 != -1 && var9 == var8 + 3 && Code(var5, var1, var9 + 4) ? var9 + 7 : -1)))) != -1 || var1.length() == 0) && !var5.equals("www.")) {
                int var6 = 0;
                int var7 = 0;
                if (Code((String)var5, (String)"http://", 0)) {
                    var6 += 7;
                }

                if (var5.charAt(var5.length() - 1) == '/') {
                    var8 = (var8 = var5.indexOf("://")) == -1 ? var6 : var8 + 3;
                    if (var5.indexOf(47, var8) == var5.length() - 1) {
                        ++var7;
                    }
                }

                String var10000 = var5.substring(var6, var5.length() - var7);
                Vector var14 = this.e;
                Vector var16 = this.c;
                String var17 = var10000;
                String var18 = (var8 = var10000.indexOf("://")) == -1 ? var17 : var17.substring(var8 + 3);
                int var19 = 0;

                while(true) {
                    if (var19 >= var16.size()) {
                        var16.addElement(var17);
                        var14.addElement(var4);
                        break;
                    }

                    String var11;
                    int var12;
                    String var13 = (var12 = (var11 = (String)var16.elementAt(var19)).indexOf("://")) == -1 ? var11 : var11.substring(var12 + 3);
                    int var20 = var17.compareTo(var11);
                    int var21 = var18.compareTo(var13);
                    if (var20 == 0) {
                        break;
                    }

                    if (var21 < 0 || var21 == 0 && (var20 < 0 && var12 != -1 || var8 == -1)) {
                        var16.insertElementAt(var17, var19);
                        var14.insertElementAt(var4, var19);
                        break;
                    }

                    ++var19;
                }
            }

            if (this.c.size() > 50) {
                this.c.removeElementAt(this.c.size() - 1);
                this.e.removeElementAt(this.c.size() - 1);
            }
        }

    }

    private static String Code(int var0, int var1) {
        return (var0 == 0 ? "" : "" + (char)var0) + (char)var1;
    }

    static char[] Code(String var0) {
        char[] var1 = new char[2];
        if (I(var0, "speeddial:")) {
            var0 = var0.substring(12);
        }

        int var2;
        char var3;
        for(var2 = 0; var2 < 10; ++var2) {
            var3 = "0123456789".charAt(var2);
            String var4;
            if ((var4 = Code(0, (int)var3, false)) != null && (var4.equals(var0) || var4.equals("ext:" + var0) || var4.equals("nint:" + var0) || var4.startsWith("feed:start") && var0.startsWith("feed:start"))) {
                var1[0] = var3;
                return var1;
            }
        }

        for(var2 = 0; var2 < 2; ++var2) {
            var3 = "#*".charAt(var2);

            for(int var7 = 0; var7 < 16; ++var7) {
                char var5 = "1234567890#*↑↓←→".charAt(var7);
                String var6;
                if ((var6 = Code(var3, (int)var5, false)) != null && (var6.equals(var0) || var6.equals("ext:" + var0) || var6.equals("nint:" + var0) || var6.startsWith("feed:start") && var0.startsWith("feed:start"))) {
                    var1[0] = var3;
                    var1[1] = var5;
                    return var1;
                }
            }
        }

        return var1;
    }

    private e(byte[] var1) {
        this.j = true;
        this.i = true;
        super();
        this.M = 6;
        this.Code = new short[574];
        this.I = new short[62];
        this.J = new byte[288];
        this.Z = var1;
        this.af = var1.length;
        if (b[0] == 0) {
            b[0] = 1;
            b[1] = 2;

            int var3;
            for(var3 = 1; var3 < 29; ++var3) {
                b[var3 + 1] = (1 << var3 / 2) + (1 << (var3 - 1) / 2) + 1;
            }

            var3 = 0;

            for(int var2 = 3; var3 < 28; ++var3) {
                a[var3] = var2;
                var2 += var3 < 8 ? 1 : 1 << (var3 - 4) / 4;
            }

            a[28] = 258;
        }

    }

    public e() {
        this.j = true;
        this.i = true;
        this(new byte['耀']);
    }

    static String[] Code(String var0) {
        String[] var1 = new String[2];
        Object[] var2 = Code(var0, false);
        var1[0] = (String)var2[1] + ':' + var2[2];
        var1[1] = "http://10.0.0.172:80" + (String)var2[3] + (String)var2[4];
        return var1;
    }

    static synchronized void J(int var0) {
        I.B(var0);
    }

    private synchronized void y() {
        if (!this.d() && this.C != null) {
            e var1;
            byte[] var2;
            int var3;
            if (this.B != null) {
                var1 = new e((byte)0);
                if ((var2 = Code(Code(this.B, this.J)))[0] != 0 || var2[1] != 1 || var2[var2.length - 32 - 1] != 0) {
                    this.x();
                    return;
                }

                for(var3 = 2; var3 < var2.length - 32 - 2; ++var3) {
                    if (var2[var3] != -1) {
                        this.x();
                        return;
                    }
                }

                var1.B((int)(this.Code >> 32));
                var1.B((int)this.Code);
                var1.Code((byte[])Code(this.C), (int)0, (int)(this.C.length << 2));
                var1.Code(var2);

                for(int var4 = 0; var4 < 32; ++var4) {
                    if (var2[var4] != var2[var4 + var2.length - 32]) {
                        this.x();
                        return;
                    }
                }

                this.B = null;
                if (I[1] != null) {
                    C(false);
                }
            }

            if (this.I == null) {
                var1 = Code(this.B);
                var2 = new byte[this.C.length << 2];

                for(var3 = 2; var3 < var2.length - 32; ++var3) {
                    while(var2[var3] == 0) {
                        var1.J(var2, var3);
                    }
                }

                var2[0] = 0;
                var2[1] = 2;
                var2[var2.length - 32 - 1] = 0;
                var1.J(var2, var2.length - 32);
                this.Z.I(var2, var2.length - 32);
                var1.I(var2, var2.length - 32);
                this.I = Code(Code(Code((byte[])var2, (int)0, (int)var2.length), this.C));
                this.V = 0;
            }

        } else {
            this.x();
        }
    }

    public static int Code(byte[] var0, int var1, char[] var2, int var3, int var4) {
        while(var4 > 0) {
            int var5 = B(var0, var1);
            int var6 = a(var0[var1]);
            var4 -= var6;
            var1 += var6;
            if (var5 <= 65535) {
                var2[var3++] = (char)var5;
            } else {
                var2[var3++] = (char)('\ud800' | var5 - 65536 >> 10);
                var2[var3++] = (char)('\udc00' | var5 & 1023);
            }
        }

        return var3;
    }

    private static String Code(byte[] var0, int var1, int var2) {
        StringBuffer var3;
        for(var3 = new StringBuffer(var2 - var1); var1 < var2; var1 += a(var0[var1])) {
            int var4;
            if ((var4 = B(var0, var1)) <= 65535) {
                var3.append((char)var4);
            } else {
                var3.append((char)('\ud800' | var4 - 65536 >> 10));
                var3.append((char)('\udc00' | var4 & 'Ͽ'));
            }
        }

        return var3.toString();
    }

    public static int J(byte[] var0, int var1) {
        return ((var0[var1] & 255) << 16) + ((var0[var1 + 1] & 255) << 8) + (var0[var1 + 2] & 255);
    }

    private void Code(byte[] var1, int var2) {
        this.J[this.V++] = (var1[var2] & 255) << 24 | (var1[var2 + 1] & 255) << 16 | (var1[var2 + 2] & 255) << 8 | var1[var2 + 3] & 255;
        if (this.V == 16) {
            this.w();
        }

    }

    public static void Code() {
        Object var0;
        synchronized(var0 = Code){}
        if (!aK) {
            byte var10000 = -1;
            Object var10001 = null;
            boolean var8 = false;

            int var1;
            int var11;
            try {
                var8 = true;
                Code((byte)var10000, (String)var10001);
                I((byte)-1, (String)null);
                ++X;
                Code = true;
                var1 = 0;
                var11 = b.size();
                var8 = false;
            } finally {
                if (var8) {
                    ;
                }
            }

            int var2 = var11;

            while(var1 < var2) {
                Vector var12 = b;
                int var13 = var1;

                try {
                    e var3;
                    if ((var3 = (e)var12.elementAt(var13)) != null) {
                        var3.I |= true;
                        var3.Code(false, 0);
                    }
                } finally {
                    ++var1;
                }
            }
        }

    }

    public static void Code(boolean var0) {
        Object var1;
        synchronized(var1 = Code){}
        if (ae != var0) {
            ae = var0;

            try {
                Code();
            } finally {
                ;
            }
        }

    }

    private static int I(int var0, int var1, int var2) {
        return ((var0 >>> 6 | var0 << 26) ^ (var0 >>> 11 | var0 << 21) ^ (var0 >>> 25 | var0 << 7)) + (var0 & var1 ^ ~var0 & var2);
    }

    public static boolean I() {
        return aK;
    }

    private void Code(byte[] var1) {
        int var2 = this.Code << 3;
        this.Code((byte)-128);

        while(this.U != 0) {
            this.Code((byte)0);
        }

        if (this.V > 14) {
            this.w();
        }

        this.J[15] = var2;
        this.w();
        J(this.M, var1, 0);
        J(this.N, var1, 4);
        J(this.O, var1, 8);
        J(this.P, var1, 12);
        J(this.Q, var1, 16);
        J(this.R, var1, 20);
        J(this.S, var1, 24);
        J(this.T, var1, 28);
        this.v();
    }

    private void w() {
        int var1;
        int var2;
        for(var1 = 16; var1 <= 63; ++var1) {
            this.J[var1] = (((var2 = this.J[var1 - 2]) >>> 17 | var2 << 15) ^ (var2 >>> 19 | var2 << 13) ^ var2 >>> 10) + this.J[var1 - 7] + (((var2 = this.J[var1 - 15]) >>> 7 | var2 << 25) ^ (var2 >>> 18 | var2 << 14) ^ var2 >>> 3) + this.J[var1 - 16];
        }

        var1 = this.M;
        var2 = this.N;
        int var3 = this.O;
        int var4 = this.P;
        int var5 = this.Q;
        int var6 = this.R;
        int var7 = this.S;
        int var8 = this.T;
        int var9 = 0;

        for(int var10 = 0; var10 < 8; ++var10) {
            var8 += I(var5, var6, var7) + Z[var9] + this.J[var9++];
            var4 += var8;
            var8 += Z(var1, var2, var3);
            var7 += I(var4, var5, var6) + Z[var9] + this.J[var9++];
            var3 += var7;
            var7 += Z(var8, var1, var2);
            var6 += I(var3, var4, var5) + Z[var9] + this.J[var9++];
            var2 += var6;
            var6 += Z(var7, var8, var1);
            var5 += I(var2, var3, var4) + Z[var9] + this.J[var9++];
            var1 += var5;
            var5 += Z(var6, var7, var8);
            var4 += I(var1, var2, var3) + Z[var9] + this.J[var9++];
            var8 += var4;
            var4 += Z(var5, var6, var7);
            var3 += I(var8, var1, var2) + Z[var9] + this.J[var9++];
            var7 += var3;
            var3 += Z(var4, var5, var6);
            var2 += I(var7, var8, var1) + Z[var9] + this.J[var9++];
            var6 += var2;
            var2 += Z(var3, var4, var5);
            var1 += I(var6, var7, var8) + Z[var9] + this.J[var9++];
            var5 += var1;
            var1 += Z(var2, var3, var4);
        }

        this.M += var1;
        this.N += var2;
        this.O += var3;
        this.P += var4;
        this.Q += var5;
        this.R += var6;
        this.S += var7;
        this.T += var8;
        this.V = 0;

        for(var1 = 0; var1 < 16; ++var1) {
            this.J[var1] = 0;
        }

    }

    final void Code(int var1, int var2, String var3) {
        Object[] var4;
        int var5;
        if ((var5 = ((String)(var4 = this.Code.I())[0]).indexOf(35)) >= 0) {
            var4[0] = ((String)var4[0]).substring(0, var5);
        }

        var4[0] = var4[0] + "#" + var3;
        int[] var6;
        int[] var10000 = var6 = (int[])var4[7];
        var10000[2] += var1 - var6[0];
        var6[3] += var2 - var6[1];
        var6[0] = var1;
        var6[1] = var2;
        this.Code(var4, (String)null, false, false, false, false, (Hashtable)null);
    }

    static void Code(Object var0) {
        synchronized(var0){}
        Object var10000 = var0;

        try {
            var10000.notifyAll();
        } finally {
            ;
        }

    }

    static void Code(Object var0, int var1) {
        synchronized(var0){}
        Object var10000 = var0;
        long var10001 = (long)var1;

        try {
            var10000.wait(var10001);
        } catch (InterruptedException var5) {
        } finally {
            ;
        }

    }

    public final void Z(boolean var1) {
        if (!this.l()) {
            this.aU = false;
        } else if (var1 ^ this.aU) {
            if (!var1 || !Code.Code.C() && (this.Code == null || this.Code.C > 4) && (this.I == null || this.I.C > 4)) {
                if (!this.Code.Z()) {
                    this.aU = var1;
                    this.aG = -1;
                    this.aT = false;
                    if (!var1) {
                        if (this.Code != null) {
                            this.Code.Code = this.aD;
                            this.Code.I = this.aE;
                            this.Code.B = this.aF;
                            return;
                        }

                        Code.B = this.aD;
                        Code.C = this.aE;
                        Code.a = this.aF;
                        return;
                    }

                    if (this.Code != null) {
                        this.aD = this.Code.Code;
                        this.aE = this.Code.I;
                        this.aF = this.Code.B;
                    } else {
                        this.aD = Code.B;
                        this.aE = Code.C;
                        this.aF = Code.a;
                    }

                    this.aH = 255;
                    this.aI = this.aJ = 50;
                    this.af = (int)System.currentTimeMillis();
                    Code.e();
                }

            }
        }
    }

    private static synchronized void Code(DataOutputStream var0) {
        var0.writeBoolean(Code);
        var0.writeByte(Z);
        var0.writeByte(J);
        var0.writeUTF(t == null ? "" : t);
        var0.writeUTF(s == null ? "" : s);
        var0.writeByte(I);
        var0.writeByte(Code.size());
        Enumeration var1 = Code.keys();

        while(var1.hasMoreElements()) {
            String var2 = (String)var1.nextElement();
            var0.writeUTF(var2);
            e var3 = (e)((Object[])Code.get(var2))[0];
            Code(var0, var3.J);
            var0.writeLong(var3.Code);
            var0.write(var3.J);
            var0.write(var3.Z.length);
            var0.write(var3.Z);
            if (I[1] == null) {
                var0.writeInt(0);
            } else {
                Code(var0, var3.B);
                Code(var0, var3.C);
            }
        }

    }

    private static synchronized void I(DataInputStream var0) {
        Code = var0.readBoolean();
        Z = var0.readByte();
        J = var0.readByte();
        String var1;
        t = (var1 = var0.readUTF()).length() == 0 ? null : var1;
        s = (var1 = var0.readUTF()).length() == 0 ? null : var1;
        I = var0.readByte();
        byte var6 = var0.readByte();

        for(int var2 = 0; var2 < var6; ++var2) {
            String var3 = var0.readUTF();
            e var4;
            (var4 = new e(Code(var0))).Code = var0.readLong();
            var0.readFully(var4.J);
            int var5;
            if ((var5 = var0.readUnsignedByte()) != 0) {
                var0.readFully(var4.Z = new byte[var5]);
                C = var4.Z;
            }

            var4.B = Code(var0);
            var4.C = Code(var0);
            if (!var4.d()) {
                Object[] var7;
                (var7 = new Object[2])[0] = var4;
                var7[1] = "";
                Code.put(var3, var7);
            }
        }

    }

    private boolean d() {
        if (!aA) {
            return false;
        } else {
            long var1 = System.currentTimeMillis();
            return this.Code(var1) && this.Code(var1 - d);
        }
    }

    private boolean e() {
        return (this.R & 1) != 0;
    }

    final void J() {
        this.Code(false, false, (Hashtable)null);
    }

    private void C(byte[] var1, int var2, int var3) {
        this.B = var1;
        this.P = var2;
        this.aG = var2 + var3;
    }

    private void Code(boolean var1, int var2) {
        if (this.J(var2)) {
            if (var1) {
                this.run();
                return;
            }

            Code((Runnable)this);
        }

    }

    private boolean j() {
        // $FF: Couldn't be decompiled
    }

    private static void F() {
        b(0);
        Code((byte)-2, (String)null);
        I((byte)-2, (String)null);
        I = -1;
        C(false);
    }

    private void J(byte[] var1, int var2) {
        this.B.I(this.Z, 0, 32);
        this.B.I(this.J, 0, 64);
        this.B.Z(var1, var2, 32);
        this.B.I(this.Z, 0, 32);
        this.B.Z(this.Z, 0, 32);
    }

    private static int Z(int var0, int var1, int var2) {
        return ((var0 >>> 2 | var0 << 30) ^ (var0 >>> 13 | var0 << 19) ^ (var0 >>> 22 | var0 << 10)) + (var0 & var1 ^ var0 & var2 ^ var1 & var2);
    }

    public final void d() {
        this.aT = true;
    }

    private e(char var1) {
        this.j = true;
        this.g = true;
        super();
        this.J = new byte[64];
        this.Z = new byte[32];
    }

    private e(int var1, byte var2, boolean var3) {
        this.j = true;
        this.g = true;
        this.aN = true;
        super();
        this.Code = new Vector();
        this.B = new byte[1024];
        this.Code = new Object[104];
        this.C = new int[104];
        this.b = false;
        this.Q = var1;
        if (var3) {
            this.C = I(var1);
            this.b = true;
        } else {
            this.C = Code(var1);
        }

        var3 = false;
        int var5;
        int var10000;
        if ((var5 = d()) == 460) {
            var10000 = 1;
        } else {
            label109: {
                if (var5 == -1) {
                    String var8;
                    int var6 = (var8 = Code((int)0).r).indexOf(46);
                    int var7 = var8.indexOf("cn");
                    var5 = var8.indexOf("china");
                    if (var7 >= 0 && var7 < var6 || var5 >= 0 && var5 < var6) {
                        var10000 = 1;
                        break label109;
                    }

                    if ((var8 = System.getProperty("wireless.messaging.sms.smsc")) != null) {
                        var10000 = !var8.startsWith("+86") && !var8.startsWith("0086") ? 0 : 1;
                        break label109;
                    }

                    if (Z(1).length() == 0 && (var8 = System.getProperty("microedition.locale")) != null) {
                        var10000 = var8.toLowerCase().endsWith("cn");
                        break label109;
                    }
                }

                var10000 = 0;
            }
        }

        var5 = var10000;
        this.Z = new String[var5 + 2];
        String[] var10;
        byte var10001;
        String var10002;
        if (!this.C.g()) {
            var10 = this.Z;
            var10001 = 0;
            var10002 = "socket://" + this.C.r + ":" + this.C.N;
        } else {
            var10 = this.Z;
            var10001 = 0;
            var10002 = "socket://do_not_use_me:0";
        }

        var10[var10001] = var10002;
        if (var5 != 0) {
            this.Z[1] = "http://10.0.0.172:80/";
        }

        this.Z[this.Z.length - 1] = this.Z();
        if (this.Z.length != I) {
            I = this.Z.length;
            Code();
            var3 = true;
        }

        String var4 = this.C.Code();
        Object[] var9;
        if ((var9 = (Object[])Code.get(var4)) != null) {
            this.I = var9;
            this.c = (e)var9[0];
        } else {
            this.c = new e(Code((byte[])Code(this.C.Code), (int)0, (int)160));
            this.I = new Object[2];
            this.I[0] = this.c;
            this.I[1] = "";
            Code.put(var4, this.I);
            var3 = true;
        }

        if (var3) {
            C(false);
        }

        this.Code = var2 != -1 ? var2 : (Z >= 0 && !this.C.g() ? Z : (J >= 0 ? J : 1));
        this.z();
        this.Z = aA && H >= 160;
        if (b.size() <= var1) {
            b.setSize(var1 + 1);
        }

        b.setElementAt(this, var1);
    }

    private static char[][] Code(String var0) {
        char[][] var1;
        switch(var0.charAt(0)) {
            case '\u0000':
            default:
                var1 = new char[1][1];
                break;
            case '\u0001':
                var1 = Code("\u0000\f\u00020+0\u00171./:_-~%$?=&!+#*@,;\\'()1\u00042abc2\u00043def3\u00044ghi4\u00045jkl5\u00046mno6\u00057pqrs7\u00048tuv8\u00059wxyz9\u0000*\u0003# *#");
                break;
            case '\u0002':
                (var1 = new char[1][1])[0][0] = 1;
                break;
            case '\u0003':
                (var1 = new char[25][])[0] = new char[1];
                var1[0][0] = 1;
                String var2 = "QWERTYUIOPASDFGHJKZXCVBN";
                var2 = var2 + var2.toLowerCase();

                for(int var3 = 1; var3 <= 24; ++var3) {
                    var1[var3] = new char[3];
                    var1[var3][0] = var1[var3][1] = var2.charAt(2 * (var3 - 1));
                    var1[var3][2] = var2.charAt(2 * (var3 - 1) + 1);
                }
        }

        char var7;
        char[][] var8 = new char[(var7 = var0.charAt(1)) + var1.length][];
        System.arraycopy(var1, 0, var8, 0, var1.length);
        int var4 = 2;

        for(int var5 = 0; var5 < var7; ++var5) {
            int var6 = var0.charAt(var4++) + 1;
            var8[var1.length + var5] = new char[var6];
            var0.getChars(var4, var4 + var6, var8[var1.length + var5], 0);
            var4 += var6;
        }

        return var8;
    }

    private static void A() {
        Object var0;
        synchronized(var0 = Code){}
        if (!aK) {
            Throwable var10000;
            label200: {
                boolean var10001;
                if (aI) {
                    aI = false;

                    try {
                        Code();
                    } catch (Throwable var8) {
                        var10000 = var8;
                        var10001 = false;
                        break label200;
                    }
                }

                label195:
                try {
                    if (Code == null) {
                        return;
                    }

                    int var9;
                    e var2 = Code(var9 = Code.Code());
                    if (Z == -2 && J == -2) {
                        Code((byte)-1, (String)null);
                        I((byte)-1, (String)null);
                    }

                    if (var2.g() && J == -2) {
                        I((byte)-1, (String)null);
                    }

                    if ((var2.g() && J == -1 || !var2.g() && (Z == -1 || Z == -2 && J == -1)) && !aJ) {
                        ++X;
                        I = -1;
                        Code = true;
                        aJ = true;
                    }

                    Code(var9, (byte)((Code << 1) + -1), false);
                    return;
                } catch (Throwable var7) {
                    var10000 = var7;
                    var10001 = false;
                    break label195;
                }
            }

            Throwable var1 = var10000;
            throw var1;
        }
    }

    static synchronized void C(boolean var0) {
        int var1 = 0;
        boolean var2 = false;

        while(true) {
            if (var2) {
                if (var1 >= 2) {
                    break;
                }
            } else if (var1 > 0) {
                break;
            }

            J var3 = new J();

            try {
                DataOutputStream var4;
                (var4 = new DataOutputStream(var3)).write(9);
                var4.writeUTF(Z(1));
                var4.writeUTF(":");
                var4.write(aA << 1);
                var4.writeBoolean(H >= 160);
                var4.write(new byte[14]);
                var4.write(59);
                var4.writeBoolean(aq);
                var4.writeInt(l);
                var4.writeBoolean(ap);
                var4.writeBoolean(az);
                var4.writeBoolean(av);
                var4.writeBoolean(aw);
                var4.writeInt(o);
                var4.writeInt(p);
                var4.writeInt(i);
                var4.writeInt(k);
                var4.writeLong(I);
                var4.writeLong(B);
                var4.writeUTF(q);
                var4.writeInt(q);
                var4.writeInt(aM);
                var4.writeInt(m);
                var4.writeBoolean(false);
                var4.write((aB ^ 1) << 1);
                var4.writeInt(r);
                var4.writeBoolean(aB);
                var4.writeUTF(i);
                var4.writeBoolean(ao);
                var4.write(ae << 1);
                var4.write(-1);
                var4.writeBoolean(true);
                byte[] var5 = new byte[32];
                I.Code(var5);
                I.Code((byte[])var5, (int)0, (int)32);
                var4.write(var5);
                var4.writeLong(0L);
                var4.writeLong(0L);
                var4.write(0);
                var4.writeShort(0);
                var4.writeShort(0);
                var4.writeBoolean(bm);
                var4.writeBoolean(ar);
                var4.writeBoolean(ax);
                var4.writeBoolean(K);
                var4.writeBoolean(M && !bj);
                var4.writeBoolean(L);
                var4.writeUTF(Code.J);
                var4.writeInt(Code.Code);
                var4.writeInt(Code.I);
                var4.writeBoolean(Code.B);
                var4.writeBoolean(Code.Z);
                var4.writeUTF(Code.Z);
                var4.writeUTF(Code.I);
                var4.write(Code.J);
                var4.writeBoolean(false);
                var4.writeBoolean(false);
                int var9 = Code.Code.size();
                var4.write(var9);

                for(int var6 = 0; var6 < var9; ++var6) {
                    var4.writeUTF((String)Code.Code.elementAt(var6));
                }

                var4.writeBoolean(false);
                var4.writeBoolean(false);
                var4.writeBoolean(false);
                var4.writeBoolean(false);
                var4.writeInt(f);
                var4.writeUTF(p);
                var4.writeBoolean(false);
                var4.writeByte(a.size());

                for(var9 = 0; var9 < a.size(); ++var9) {
                    Object[] var10 = (Object[])a.elementAt(var9);
                    var4.writeUTF((String)var10[0]);
                    var4.writeUTF((String)var10[1]);
                    byte[] var11 = (byte[])var10[2];
                    var4.writeShort(var11.length);
                    var4.write(var11);
                }

                var4.writeBoolean(false);
                var4.writeBoolean(false);
                var4.writeInt(s);
                var4.writeUTF(j != null ? j : "");
                var4.writeByte(ay);
                var4.writeInt(t);
                Code(var4, I);
                var4.writeInt(0);
                var4.writeBoolean(false);
                var4.writeByte(0);
                var4.writeByte(aD);
                var4.writeInt(A);
                Code(var4, B);
                I(var4);
                Code(var4);
                var4.writeInt(0);
                var4.writeBoolean(au);
                var4.writeInt(z);
                var4.writeBoolean(bp);
                var4.writeInt(u);
                var4.writeInt(v);
                var4.write(Code.Z);
                var4.writeInt(w);
                var4.writeUTF(k);
                var4.writeUTF(l);
                var4.writeUTF(m);
                var4.writeUTF(n);
                var4.writeUTF(o);
                var4.writeBoolean(aG);
                var4.writeLong(d);
                var4.writeLong(C);
                var4.writeLong(a);
                var4.writeLong(g);
                var4.writeInt(x);
                var4.writeInt(y);
                var4.writeInt(Code.m);
            } catch (IOException var8) {
            }

            if (!Code("s", var3.toByteArray(), (Vector)null, (boolean)var0)) {
                var2 = true;
                Code.Code.B((var0 << 1) + 1);
                Code.Code.removeAllElements();
                String var10000 = "h1";

                try {
                    RecordStore.deleteRecordStore(var10000);
                } catch (RecordStoreException var7) {
                }

                Code(v, "b");
                v = -1;
            }

            ++var1;
        }

    }

    private static synchronized void ab() {
        int var0 = 0;
        boolean var1 = false;

        while(true) {
            if (var1) {
                if (var0 >= 2) {
                    break;
                }
            } else if (var0 > 0) {
                break;
            }

            J var2 = new J();

            label45: {
                boolean var10001;
                DataOutputStream var3;
                Enumeration var4;
                try {
                    (var3 = new DataOutputStream(var2)).write(2);
                    var3.writeByte(I.size());
                    var4 = I.keys();
                } catch (IOException var8) {
                    var10001 = false;
                    break label45;
                }

                while(true) {
                    try {
                        if (!var4.hasMoreElements()) {
                            break;
                        }

                        Object var5 = var4.nextElement();
                        var3.writeUTF((String)var5);
                        var3.writeInt((Integer)I.get(var5));
                    } catch (IOException var7) {
                        var10001 = false;
                        break;
                    }
                }
            }

            if (!Code("sh", var2.toByteArray(), (Vector)null, false)) {
                var1 = true;
                Code.Code.B(1);
                Code.Code.removeAllElements();
                String var10000 = "h1";

                try {
                    RecordStore.deleteRecordStore(var10000);
                } catch (RecordStoreException var6) {
                }
            }

            ++var0;
        }

    }

    static boolean Code(String var0, Vector var1) {
        boolean var2 = false;
        if (var1 == null) {
            return false;
        } else {
            boolean var3 = false;
            int var4 = 0;
            Vector var5 = new Vector(var1.size());

            while(true) {
                if (var3) {
                    if (var4 >= 2) {
                        break;
                    }
                } else if (var4 > 0) {
                    break;
                }

                int var6;
                int var10000 = var6 = 0;
                Vector var10001 = var1;

                try {
                    while(var10000 < var10001.size()) {
                        J var7 = new J();
                        DataOutputStream var8 = new DataOutputStream(var7);
                        Object[] var9 = (Object[])var1.elementAt(var6);
                        var8.write(var6);
                        var8.writeUTF((String)var9[0]);
                        var8.writeUTF((String)var9[1] != null ? (String)var9[1] : (String)var9[0]);
                        byte[] var10;
                        if ((var10 = (byte[])var9[2]) != null && (!l || !"h1".equals(var0) || var6 >= var1.size() - 3)) {
                            var8.writeShort(var10.length);
                            var8.write(var10);
                        } else {
                            var8.writeShort(0);
                        }

                        if (var9[3] == null) {
                            var8.writeUTF("");
                        } else if (var9[3] instanceof String) {
                            var8.writeUTF((String)var9[3]);
                        } else if (!var0.equals("b1") && !var0.equals("sp")) {
                            if (var0.equals("u")) {
                                var8.write(Code((Object[])var9, (int)3));
                                if ((Code((Object[])var9, (int)3) & 8) != 0) {
                                    var8.write(1);
                                    var8.writeByte((byte)Code((Object[])var9, (int)9));
                                }
                            } else {
                                var8.write(Code((Object[])var9, (int)3));
                            }
                        } else {
                            var8.write(Code((Object[])var9, (int)3) | 8);
                            var8.write(3);
                            var8.write(Code((Object[])var9, (int)5));
                            var8.write(Code((Object[])var9, (int)6));
                            var8.write((byte[])var9[7]);
                            var8.write((byte[])var9[8]);
                            var8.writeByte((byte)Code((Object[])var9, (int)9));
                            var8.writeInt(Code((Object[])var9, (int)10));
                        }

                        var5.addElement(var7.toByteArray());
                        ++var6;
                        var10000 = var6;
                        var10001 = var1;
                    }

                    if (!(var2 = Code(var0, (byte[])null, var5, false))) {
                        var3 = true;
                        Code.Code.B(1);
                    }
                } catch (IOException var11) {
                    var3 = true;
                    ++var4;
                    continue;
                }

                ++var4;
            }

            return var2;
        }
    }

    static void Z(int var0) {
        H += var0;
        if (aF) {
            Code.Code.b();
            if (H >= 160) {
                aF = false;
                C(false);
                Code((Object)I);
            }
        }

    }

    static String Code(String var0, boolean var1) {
        if (var0 == null) {
            return var0;
        } else {
            StringBuffer var2 = new StringBuffer(var0.length());
            int var3 = 0;

            while(true) {
                while(true) {
                    while(var3 < var0.length()) {
                        char var4;
                        if ((var4 = var0.charAt(var3)) <= 127) {
                            if (var1 && var4 == ' ') {
                                var2.append('+');
                                ++var3;
                            } else if (var4 != '%' && var4 > ' ') {
                                if (var1 && "&=?#:".indexOf(var4) >= 0) {
                                    Code(var2, var4);
                                    ++var3;
                                } else {
                                    var2.append(var4);
                                    ++var3;
                                }
                            } else {
                                Code(var2, var4);
                                ++var3;
                            }
                        } else {
                            if (var4 > 2047) {
                                Code((StringBuffer)var2, (char)('à' | var4 >> 12 & '\u000f'));
                                Code((StringBuffer)var2, (char)('\u0080' | var4 >> 6 & '?'));
                            } else {
                                Code((StringBuffer)var2, (char)('À' | var4 >> 6 & '\u001f'));
                            }

                            Code((StringBuffer)var2, (char)('\u0080' | var4 & '?'));
                            ++var3;
                        }
                    }

                    return var2.toString();
                }
            }
        }
    }

    private void z() {
        if (this.Z[this.Code].indexOf("10.0.0.172") != -1) {
            aH = true;
        } else {
            aH = false;
        }
    }

    static Calendar Code(boolean var0, boolean var1) {
        Calendar var2;
        (var2 = Calendar.getInstance(TimeZone.getDefault())).setTime(new Date(Code(var0, var1)));
        return var2;
    }

    static Object[] Code(Vector var0, int var1) {
        return var0 != null ? (Object[])var0.elementAt(var1) : null;
    }

    private void f(boolean var1) {
        label89:
        while(true) {
            this.B(0, 6);
            this.f.B(this.B, 0, 6);
            int var2;
            if ((var2 = I((byte[])this.B, 4)) > 1014) {
                throw new IOException();
            }

            this.B(6, var2);
            this.Code = System.currentTimeMillis();
            this.f.B(this.B, 6, var2);
            this.d.C(this.S++);
            this.d.I(this.B, 4, var2 + 2);
            this.d.Z(this.B, 1020, 4);
            if (this.B[1020] != this.B[0] || this.B[1021] != this.B[1] || this.B[1022] != this.B[2] || this.B[1023] != this.B[3]) {
                throw new IOException();
            }

            byte var3 = this.B[6];
            byte var4 = this.B[7];
            var2 -= 2;
            switch(var3) {
                case 4:
                    this.e(true);
                    break;
                case 5:
                    byte var11 = this.B[8];
                    g var10 = new g();
                    this.Code.addElement(var10);
                    var10.Code(this, var4);
                    if (var11 == 1) {
                        I var12;
                        (var12 = new I(30)).Code = var10;
                        Code((Runnable)var12);
                        break;
                    }

                    var10.close();
                    break;
                case 7:
                    this.a(var4);
                case 8:
                case 12:
                case 13:
                case 14:
                case 16:
                case 18:
                case 19:
                default:
                    break;
                case 9:
                    this.R = Math.max(this.R - 1, 0);
                    g var9;
                    if ((var9 = this.Code((int)var4)) != null) {
                        var9.I();
                    }

                    b(false);
                    break;
                case 11:
                    this.a.k = this;
                    this.a.C(this.B, 8, var2);
                    if (var1) {
                        return;
                    }
                case 6:
                case 10:
                    g var13 = this.Code((int)var4);
                    int var5 = 8;
                    int var6 = 0;

                    while(var13 != null) {
                        while(true) {
                            if (var13.Code() != null) {
                                int var7 = Math.min(var13.J(), var2);
                                switch(var3) {
                                    case 6:
                                        var13.J();
                                        Code(var13, true);
                                        if (this.Z && !this.i()) {
                                            this.b = this.a;
                                        }
                                        continue label89;
                                    case 10:
                                        System.arraycopy(this.B, var5, var13.Code(), var13.Z(), var7);
                                        var6 = (var7 - var2 | -(var7 - var2)) >>> 31 ^ 1;
                                        var13.J(var7);
                                        break;
                                    case 11:
                                        int var10000 = var7 = this.a.Code(var13.Code(), var13.Z(), var13.J());
                                        var6 = (var10000 | -var10000) >>> 31 ^ 1;
                                        var13.J(this.a.U);
                                }

                                var13.Code(var7);
                                var5 += var7;
                                var2 -= var7;
                                break;
                            }

                            if (var13.Z()) {
                                var13 = null;
                                break;
                            }

                            Code((Object)var13, (int)1000);
                        }

                        if (var6 != 0) {
                            continue label89;
                        }
                    }

                    if (var3 != 11) {
                        break;
                    }

                    while(true) {
                        if (this.a.Code((byte[])null, (int)0, (int)1024) <= 0) {
                            continue label89;
                        }
                    }
                case 15:
                    if (!this.Z) {
                        break;
                    }

                    if (this.J != null) {
                        System.arraycopy(this.B, 8, this.J, 0, 8);
                        this.I = true;
                        this.e(true);
                        return;
                    }

                    this.J = new byte[8];
                    System.arraycopy(this.B, 8, this.J, 0, 8);
                    break;
                case 17:
                    this.a = new e();
                    break;
                case 20:
                    String var8 = Code((byte[])this.B, (int)8, (int)(var2 + 8));
                    Code((Runnable)(new e(var8)));
            }
        }
    }

    static String I() {
        return a ? (aM ? "*" : "") + Y : null;
    }

    private e(String var1, String var2, int var3, String var4, int var5) {
        this.j = true;
        this.g = true;
        super();
        this.r = var1;
        this.Code = var2;
        this.Q = var3;
        this.d = var4;
        this.N = var5;
    }

    private e(int var1, int var2, String var3, int var4, int var5, String var6, String var7) {
        this.j = true;
        this.g = true;
        super();
        this.V = var1;
        this.R = var2;
        this.r = var3;
        this.S = var4;
        this.N = var5;
        this.Code = var6;
        this.d = var7;
    }

    private static void Code(int[] var0, int[] var1) {
        int var2 = var0.length - Code((int)0, (int[])var0);
        int var3 = var1.length - Code((int)0, (int[])var1);
        int var4 = var0.length - var2 - (var1.length - var3);
        int[] var5 = new int[var1.length - var3 + var4];

        for(var4 <<= 5; var4 >= 0; --var4) {
            int[] var6 = var5;
            int[] var8 = var1;
            int var9 = var4 >>> 5;
            int var7 = var4 & 31;
            int var10 = var1.length - var3;
            int var11;
            int var12;
            if (var7 == 0) {
                System.arraycopy(var1, var3, var5, var5.length - var10 - var9, var10);
            } else {
                var11 = 32 - var7;
                if ((var12 = var1[var3] >>> var11) != 0) {
                    ++var9;
                }

                int var13 = var5.length - var10 - var9;
                if (var12 != 0) {
                    var5[var13++] = var12;
                }

                var12 = var1[var3];

                for(int var14 = var3 + 1; var14 < var10; ++var14) {
                    int var15 = var8[var14];
                    var6[var13++] = var12 << var7 | var15 >>> var11;
                    var12 = var15;
                }

                var6[var13] = var8[var10 + var3 - 1] << var7;
            }

            int var16 = var6.length - var10 - var9;

            while(true) {
                int[] var17 = var5;
                int[] var19 = var0;
                var10 = var0.length - Code(var2, var0);
                int var18 = var5.length - Code(var16, var5);
                if (var0.length - var10 != var5.length - var18) {
                    if (var0.length - var10 - (var5.length - var18) < 0) {
                        break;
                    }
                } else {
                    while(var10 < var19.length - 1 && var19[var10] == var17[var18]) {
                        ++var10;
                        ++var18;
                    }

                    if ((int)(((long)var19[var10] & 4294967295L) - ((long)var17[var18] & 4294967295L) >> 63) < 0) {
                        break;
                    }
                }

                var17 = var5;
                var18 = var16;
                var19 = var0;
                var10 = var0.length - 1;
                var11 = var5.length - 1;
                var12 = 0;

                long var20;
                do {
                    var20 = ((long)var19[var10] & 4294967295L) - ((long)var17[var11--] & 4294967295L) + (long)var12;
                    var19[var10--] = (int)var20;
                    var12 = (int)(var20 >> 63);
                } while(var11 >= var18);

                while(var10 >= var2 && var20 < 0L) {
                    var20 = ((long)var19[var10] & 4294967295L) + (long)var12;
                    var19[var10--] = (int)var20;
                }
            }
        }

    }

    private static int[] Code(int[] var0, int[] var1) {
        int[] var2 = new int[var1.length];
        int[] var3;
        Code(var3 = new int[var1.length << 1], var0, var0);
        Code(var3, var1);
        System.arraycopy(var3, var3.length - var2.length, var2, 0, var2.length);

        for(int var4 = 0; var4 < var3.length; ++var4) {
            var3[var4] = 0;
        }

        Code(var3, var2, var0);
        Code(var3, var1);
        System.arraycopy(var3, var3.length - var2.length, var2, 0, var2.length);
        return var2;
    }

    private static int[] Code(int[] var0, int[] var1, int[] var2) {
        for(int var3 = var2.length - 1; var3 >= 0; --var3) {
            long var4 = (long)var2[var3] & 4294967295L;
            long var6 = 0L;

            for(int var8 = var1.length - 1; var8 >= 0; --var8) {
                var6 += var4 * ((long)var1[var8] & 4294967295L) + ((long)var0[var3 + var8 + 1] & 4294967295L);
                var0[var3 + var8 + 1] = (int)var6;
                var6 >>>= 32;
            }

            var0[var3] = (int)var6;
        }

        return var0;
    }

    e(B var1, String var2) {
        this.j = true;
        this.g = true;
        super();
        this.Code = var1;
        this.r = var2;
    }

    private static int Code(int var0, int[] var1) {
        while(true) {
            if (var1[var0] == 0) {
                ++var0;
                if (var0 != var1.length) {
                    continue;
                }

                return 0;
            }

            return var1.length - var0;
        }
    }

    private e(int[] var1) {
        this.j = true;
        this.g = true;
        super();
        this.Z = new e('\u0000');
        this.Z = new byte[0];
        this.J = new byte[8];
        this.B = new byte[32];
        this.J = var1;
    }

    private void C(int var1) {
        this.J.B(var1);
    }

    private synchronized void x() {
        this.C = null;
        this.B = null;
        this.I = null;
        System.arraycopy(this.B, 0, this.J, 0, 8);
    }

    private void I(byte[] var1, int var2) {
        this.B = new e(var1, var2);
    }

    private synchronized int Code(e var1) {
        if (this.I == null) {
            return -1;
        } else {
            byte[] var2;
            (var2 = var1.B)[0] = (byte)(this.V >> 16);
            var2[1] = (byte)this.V;
            this.Z.Z(var2, 2);
            this.Z.J(var2, 0);
            var1.B = new e(var2, 0);
            var1.B.I(this.J, 0, 8);
            this.Z.J(var2, 0);
            var1.d = new e(var2, 0);
            var1.d.I(this.J, 0, 8);
            this.Z.J(var2, 0);
            var1.e = new e(var2, (byte)0);
            var1.e.B(var2, 0, 1024);
            this.Z.J(var2, 0);
            var1.f = new e(var2, (byte)0);
            var1.f.B(var2, 0, 1024);
            return this.V++;
        }
    }

    private static void I(byte var0, String var1) {
        J = var0;
        t = var1;
    }

    private synchronized void J(g var1) {
        this.Z(var1);
        var1.Code();
        I(var1);
    }

    private static int Code(int var0, byte[] var1, int var2) {
        if (var0 <= 127) {
            var1[var2] = (byte)var0;
            return 1;
        } else if (var0 <= 2047) {
            var1[var2++] = (byte)(192 | var0 >> 6);
            var1[var2] = (byte)(128 | var0 & 63);
            return 2;
        } else {
            var1[var2++] = (byte)(224 | var0 >> 12);
            var1[var2++] = (byte)(128 | var0 >> 6 & 63);
            var1[var2] = (byte)(128 | var0 & 63);
            return 3;
        }
    }

    private static int B(byte[] var0, int var1) {
        switch(a(var0[var1])) {
            case 1:
                return var0[var1];
            case 2:
                return (var0[var1] & 31) << 6 | var0[var1 + 1] & 63;
            case 3:
                return (var0[var1] & 15) << 12 | (var0[var1 + 1] & 63) << 6 | var0[var1 + 2] & 63;
            default:
                return (var0[var1] & 7) << 18 | (var0[var1 + 1] & 63) << 12 | (var0[var1 + 2] & 63) << 6 | var0[var1 + 3] & 63;
        }
    }

    private byte[] Code(g var1, int var2) {
        Object var3;
        synchronized(var3 = Code){}
        g var10000 = var1;

        try {
            Object[] var4 = var10000.Code();
            int[] var5 = var1.Code();
            I.Z();
            String var6 = (String)var4[53];
            int var7;
            if ("myopera:async".equals(var6)) {
                J = false;

                for(var7 = 0; var7 < var4.length; ++var7) {
                    var4[var7] = this.Code[var7];
                    var5[var7] = this.C[var7];
                }

                if (this.i()) {
                    var4[53] = "server:test";
                } else {
                    var4[53] = "myopera:sync";
                }

                var4[38] = null;
            }

            var7 = 0;
            String var8 = this.J();
            int var9;
            if (!this.aL) {
                byte[] var26 = (var8 + "\u0000" + Z + "\u0000").getBytes();
                var7 = 41 + var26.length + this.c.Z.length + (this.Z() ? Z(1).length() : 0) + (this.Code == null ? 2 : 0) + this.c.I.length;
                this.a = this.b;
                this.b = null;
                if (this.R > 0) {
                    this.J = null;
                    this.a = null;
                    this.R = 0;
                }

                if (this.J != null) {
                    var7 += 8 + this.J.length;
                } else {
                    for(var9 = 0; var9 < 104; ++var9) {
                        this.Code[var9] = null;
                        this.C[var9] = 0;
                    }

                    this.a = null;
                    J = false;
                }

                if (this.a == null) {
                    var7 += 8;
                }
            }

            if (this.C.f()) {
                var4[77] = null;
                var4[73] = null;
                var4[79] = null;
            }

            var5[0] = 12;
            var4[40] = var8;
            var4[33] = Z(2);
            if (c == null) {
                b(false);
            }

            var4[6] = c;
            String var29 = Browser.Code.getAppProperty("OM-Install-Referrer");
            var4[100] = var29 != null ? var29 : "";
            var9 = 4;

            int var10;
            int var11;
            for(var10 = 0; var10 < 104; ++var10) {
                if (var4[var10] == null) {
                    if (this.C[var10] != var5[var10] || this.Code[var10] != null) {
                        if (var5[var10] <= 254) {
                            var9 += 4;
                        } else {
                            var9 += 7;
                        }
                    }
                } else if (var4[var10] instanceof byte[] && (!(this.Code[var10] instanceof byte[]) || !I((byte[])var4[var10], (byte[])this.Code[var10]))) {
                    var9 += 7 + ((byte[])var4[var10]).length;
                } else if ((this.Code[var10] == null || !var4[var10].equals(this.Code[var10])) && var4[var10] instanceof String) {
                    var11 = Z((String)var4[var10]);
                    var9 += var11 + (var11 <= 254 ? 4 : 7);
                }
            }

            var7 += var9 + 16 + 8 * (var9 / '\ufff9');
            J var30 = null;
            int var14;
            if (var6.equals("myopera:logout") || (var6.startsWith("myopera:login") || var6.startsWith("myopera:signup")) && (!J || Code.Code != Code.Z) || Code.Z && (!J || Code.B || Code.Code != Code.I)) {
                Code(Z);
                boolean var31 = var6.startsWith("myopera:login") || (Code.J & 1) != 0;
                boolean var12 = var6.startsWith("myopera:login") || (Code.J & 2) != 0;
                var30 = new J();
                DataOutputStream var13;
                (var13 = new DataOutputStream(var30)).write(6);
                var13.writeUTF(Code.J);
                var13.writeInt(Code.Code);
                var13.write(Code.J | var6.equals("myopera:logout") << 3);
                var13.writeUTF(Code.I);
                var13.writeUTF(Code.Z);
                var14 = var30.size();
                var13.writeShort(0);
                int var15 = 0;
                int var33 = var12 ? Z.size() : 0;
                byte var16 = 0;
                var11 = var33 + (var31 ? J.size() : 0);
                boolean var17 = false;

                for(int var18 = 0; var18 < var11; ++var18) {
                    Object[] var19;
                    if (var18 < var33) {
                        var19 = (Object[])Z.elementAt(var18);
                    } else {
                        var19 = (Object[])J.elementAt(var18 - var33);
                        var16 = 1;
                    }

                    int var20;
                    if ((var20 = Code((Object[])var19, (int)5)) != 83) {
                        ++var15;
                        if (var20 == 97) {
                            var19[5] = new Integer(65);
                            var20 = 65;
                            var17 = true;
                        }

                        int var21 = var16 == 0 ? 0 : var18 - var33 + 1;
                        var13.write(var21);
                        var13.write(var20);
                        var20 = var16 * -3 + 31;
                        var13.write(var20);
                        if (var16 == 0) {
                            var13.write((byte[])var19[7], 0, 16);
                        }

                        if ((var20 & 2) != 0) {
                            var13.write((byte[])var19[8], 0, 16);
                        }

                        if (var16 != 0 && (Code((Object[])var19, (int)9) & 2) != 0) {
                            var13.writeUTF("");
                            var13.writeUTF("");
                            var13.writeShort(0);
                        } else {
                            var13.writeUTF((String)var19[0]);
                            var13.writeUTF((String)var19[1]);
                            byte[] var37;
                            if ((var37 = (byte[])var19[2]) != null && var37.length != 0) {
                                var13.writeShort(var37.length);
                                var13.write(var37, 0, var37.length);
                            } else {
                                var13.writeShort(0);
                            }
                        }
                    }
                }

                Code(var15, var30.Code(), var14);
                if (var17) {
                    Code(Z, false);
                    Code(J, false);
                }

                var7 += 25 + var30.size() + 8 * (var30.size() / 1014);
            }

            J var32 = new J(var7);
            DataOutputStream var34 = new DataOutputStream(var32);
            int var35 = 0;
            if (!this.aL) {
                byte var36 = 0;
                if (this.Code == null) {
                    var34.write(1);
                    var34.write(2);
                    var36 = 2;
                }

                var34.write(1);
                var34.write(this.c.B, 0, 8);
                var34.writeInt(this.c.J[0]);
                var34.write(this.c.Z);
                var34.writeShort(var2);
                var34.write(this.c.I);
                var2 = var32.size();
                var34.writeUTF(this.Z() ? Z(1) : "");
                this.B.I(var32.Code(), var36, var32.size() - var36);
                this.d.I(var32.Code(), var36, var32.size() - var36);
                this.B.Z(var32.Code(), var32.size(), 16);
                var32.Code(var32.size() + 16);
                this.e.B(var32.Code(), var2, var32.size() - var2);
                var35 = var32.size();
                byte[] var24 = (var8 + "\u0000" + Z + "\u0000").getBytes();
                Code(var32, 128, 3, var24.length);
                var34.write(var24);
                if (this.J != null) {
                    Code(var32, 15, 0, 8);
                    var34.write(this.J);
                }

                if (this.a == null) {
                    Code(var32, 16, 0, 0);
                }
            }

            if (var30 != null) {
                Code(var32, 5, 0, 1);
                var34.write(1);
                var2 = var30.size();

                for(int var27 = 0; var27 < var2; var27 += 1014) {
                    var14 = Math.min(var2 - var27, 1014);
                    Code(var32, 10, 0, var14);
                    System.arraycopy(var30.Code(), var27, var32.Code(), var32.size(), var14);
                    var32.Code(var32.size() + var14);
                }

                Code(var32, 6, 0, 0);
                J = true;
                Code.Z = Code.Code;
            }

            if ("myopera:logout".equals(var6)) {
                J = false;
            }

            ++this.R;
            Code(var32, 5, var1.I(), 0);
            Code(var32, 22, var1.I(), Math.min(var9, 65529));
            var34.writeInt(var9 - 4 + Code(var1.Code(false)));

            for(var2 = 0; var2 < 104; ++var2) {
                int var25;
                if (var4[var2] == null) {
                    if (this.C[var2] != var5[var2] || this.Code[var2] != null) {
                        if ((var25 = var5[var2]) <= 254) {
                            var34.write(2);
                            var34.writeShort(var2);
                            var34.write(var25);
                        } else {
                            var34.write(3);
                            var34.writeShort(var2);
                            var34.writeInt(var25);
                        }
                    }
                } else if (var4[var2] instanceof byte[] && (!(this.Code[var2] instanceof byte[]) || !I((byte[])var4[var2], (byte[])this.Code[var2]))) {
                    var34.write(1);
                    var34.writeShort(var2);
                    var34.writeInt(((byte[])var4[var2]).length);
                    var34.write((byte[])var4[var2]);
                } else if ((this.Code[var2] == null || !var4[var2].equals(this.Code[var2])) && var4[var2] instanceof String) {
                    if (Z((String)var4[var2]) <= 254) {
                        var34.write(0);
                        var34.write(var2 >> 16);
                        var25 = var32.size();
                        var34.writeUTF((String)var4[var2]);
                        var32.Code()[var25] = (byte)var2;
                    } else {
                        var34.write(1);
                        var34.writeShort(var2);
                        byte[] var28 = new byte[Z(var6 = (String)var4[var2])];
                        var10 = 0;

                        for(var14 = 0; var14 < var6.length(); ++var14) {
                            var10 += Code(var6.charAt(var14), var28, var10);
                        }

                        var34.writeInt(var28.length);
                        var34.write(var28);
                    }
                }

                this.Code[var2] = var4[var2];
                this.C[var2] = var5[var2];
            }

            var2 = var32.size() - var9;

            while(var9 > 65529) {
                System.arraycopy(var32.Code(), var2 + '\ufff9', var32.Code(), var2 + '\ufff9' + 8, var9 - '\ufff9');
                var2 += 65537;
                var9 -= 65529;
                var32.Code(var2 - 8);
                Code(var32, 22, var1.I(), Math.min(var9, 65529));
            }

            this.J(var32.Code(), var35, var7);
            this.aL = true;
            byte[] var38 = var32.Code();
            return var38;
        } finally {
            ;
        }
    }

    public static int Code(byte[] var0, int var1) {
        return (var0[var1] << 8) + (var0[var1 + 1] & 255);
    }

    public static int I(byte[] var0, int var1) {
        return ((var0[var1] & 255) << 8) + (var0[var1 + 1] & 255);
    }

    private void B(int var1, int var2) {
        this.Code.readFully(this.B, var1, var2);
        J += (long)var2;
        B += (long)var2;
        Code((long)var2, 0L, 0L);
    }

    private static void Code(J var0, int var1, int var2, int var3) {
        var0.Code(var0.size() + 8);
        Code(var0.Code(), var0.size() - 8, var1, var2, var3);
    }

    private static void Code(byte[] var0, int var1, int var2, int var3, int var4) {
        var0[var1 + 4] = (byte)(var4 + 2 >> 8);
        var0[var1 + 4 + 1] = (byte)(var4 + 2);
        var0[var1 + 4 + 2] = (byte)var2;
        var0[var1 + 4 + 3] = (byte)var3;
    }

    public static int Z(byte[] var0, int var1) {
        return (var0[var1] << 24) + ((var0[var1 + 1] & 255) << 16) + ((var0[var1 + 2] & 255) << 8) + (var0[var1 + 3] & 255);
    }

    private synchronized void Z(g var1) {
        if (var1 != null) {
            this.Code.removeElement(var1);
        }

    }

    private boolean f() {
        return (this.R & 4) != 0;
    }

    private void B(byte[] var1, int var2) {
        this.Code.write(var1, 0, var2);
        J += (long)var2;
        B += (long)var2;
        if (this.i()) {
            this.Code.flush();
        }

        this.e = System.currentTimeMillis();
    }

    private boolean g() {
        return this.N == 0;
    }

    private static e Code(int var0, byte var1, boolean var2) {
        Object var3;
        synchronized(var3 = Code){}
        Vector var10000 = b;
        boolean var5 = false;

        e var7;
        try {
            var5 = true;
            if (var10000.size() > var0 && b.elementAt(var0) != null) {
                var7 = (e)b.elementAt(var0);
                Code(Code);
                var5 = false;
            } else {
                Code((Runnable)(var7 = new e(var0, var1, var2)));
                var5 = false;
            }
        } finally {
            if (var5) {
                ;
            }
        }

        return var7;
    }

    public static boolean Code() {
        return aH;
    }

    private String Z() {
        return "http://" + this.C.r + ":" + this.C.S + "/";
    }

    private String J() {
        return (String)this.I[1];
    }

    static g Code(Object[] var0, int[] var1, int var2) {
        g var3;
        I(var3 = new g(var0, var1, var2));
        A();
        return var3;
    }

    private g Code() {
        Object var1;
        synchronized(var1 = Code){}
        e var10000 = this;
        boolean var5 = false;

        try {
            var5 = true;
            if (!var10000.i() && this == b.elementAt(this.Q)) {
                b.setElementAt((Object)null, this.Q);
            }

            while(Code == null || Code != null && this.Q != Code.Code()) {
                if (this.C) {
                    for(int var2 = 0; var2 < this.Code.size(); ++var2) {
                        g var3;
                        if ((var3 = (g)this.Code.elementAt(var2)).B() != 0) {
                            return var3;
                        }
                    }
                }

                this.C = false;
                Code((Object)Code, (int)0);
                if (this.B) {
                    A();
                    return null;
                }
            }

            if (this.B) {
                A();
                return null;
            } else {
                g var7;
                Code = (var7 = Code).Code();

                int var8;
                for(var8 = 1; this.Code(var8) != null; ++var8) {
                }

                this.Code.addElement(var7);
                var7.Code(this, var8);
                A();
                var5 = false;
                return var7;
            }
        } finally {
            if (var5) {
                ;
            }
        }
    }

    final synchronized void Code(B var1) {
        if (var1 == this.Code || var1 == this.I || var1.c || var1.d) {
            switch(var1.C) {
                case 1:
                    Code.Code.c();
                    return;
                case 2:
                    Code.Code.b();
                    return;
                case 3:
                default:
                    break;
                case 4:
                    this.Code(this.I, false);
                    this.I = null;
                    if (!var1.c && !var1.d) {
                        this.R();
                        return;
                    }
                    break;
                case 5:
                case 6:
                case 7:
                    boolean var2 = this.I == null;
                    this.I = null;
                    if (!var1.I()) {
                        Code.Code.d();
                    }

                    B var3;
                    if (!bo && !var1.I() && !var1.C && !var1.e && !"server:setup".equals(var1.Code)) {
                        String var4;
                        if ((var4 = Z(1)) != null && var4 != "") {
                            byte[] var13 = var4.getBytes();
                            e var5;
                            (var5 = new e((byte)0)).Code((byte[])var13, (int)0, (int)var13.length);
                            var13 = new byte[32];
                            var5.Code(var13);
                            var4 = I(var13, var13.length);
                        } else {
                            var4 = "0";
                        }

                        if (!bo && var4 != null && !var4.equals("0")) {
                            String var14 = "j2me";
                            String var6 = Browser.Code.getAppProperty("Ping-CID");
                            String var7 = Browser.Code.getAppProperty("OM-Campaign");
                            StringBuffer var8;
                            (var8 = new StringBuffer("http://union.oupeng.com/stat.php?")).append("act=" + (bp ? "0" : "1"));
                            var8.append("&f=" + (var6 == null ? "0" : var6));
                            var8.append("&uid=" + var4);
                            var8.append("&platform=" + var14);
                            var8.append("&version=4.6.32741");
                            var8.append("&campaign=" + (var7 == null ? "0" : var7));
                            Object[] var15;
                            (var15 = new Object[11])[0] = var8.toString();
                            (var3 = new B(this)).d = true;
                            var3.Code(var15);
                            Code((Runnable)var3);
                            bo = true;
                            if (!bp) {
                                bp = true;
                                C(false);
                            }
                        }
                    }

                    if (var1.C == 5 && this.Code((int)1)) {
                        if (var1.c && !at) {
                            at = true;
                            this.aN = true;
                            a();
                            return;
                        }

                        if (at) {
                            at = false;
                        }
                    }

                    a();
                    if (bg) {
                        I var12 = new I(12);
                        Code.Code.Code.schedule(var12, 4000L);
                    }

                    if (var1.C == 5 && !this.aL && var1.a()) {
                        synchronized(var3 = this.Code){}
                        e var10000 = this;
                        B var10001 = var1;

                        try {
                            var10000.r = var10001.J();
                            if (!at && this.r != null) {
                                Object[] var11;
                                (var11 = new Object[11])[0] = this.r;
                                this.Z = new B(this);
                                this.Z.c = true;
                                this.Z.Code(var11);
                                at = false;
                                Code((Runnable)this.Z);
                            }
                        } finally {
                            ;
                        }
                    }

                    if (this.d) {
                        if (var2) {
                            this.d = false;
                            return;
                        }

                        if (this == Code.I()) {
                            this.d = false;
                            if (this.Code != null) {
                                this.Code(true, false, (Hashtable)null);
                            }
                        }
                    }
            }

        }
    }

    private void R() {
        if (this.Z != null) {
            if (!at && this.Z.C < 5) {
                this.Z.C();
            }

            this.Z = null;
            at = false;
        }

    }

    private void Code(Object[] var1, String var2, boolean var3, boolean var4, Hashtable var5, String var6) {
        this.I = new B(this);
        this.I.Code = var4;
        if (var1 != null) {
            this.I.Code(var1);
        }

        if (var5 != null) {
            this.I.Code = var5;
        }

        if (var6 != null) {
            this.I.Code = var6;
        }

        this.I.I = var3;
        this.I.Code(var2, var4);
    }

    public final int b() {
        return this.aG;
    }

    final void I(boolean var1) {
        if (this.Code == 16) {
            this.Q = Code.Code(this.Q, 0, -this.aC, this.af);
        } else {
            if (this.Code != null) {
                this.Code.J(var1);
            }

            this.P -= this.ab;
            this.ab = Code.Code(this.ab, 0, this.ae, this.af);
            this.P += this.ab;
            if (this.a()) {
                this.aI = Code.Code(this.aJ, this.af);
            }

        }
    }

    static void Code(int var0, int var1, int var2) {
        if (var0 == 0 && var1 >= 48 && var1 <= 57 && "0".indexOf((char)var1) == -1 || "#*".indexOf(var0) != -1 && "1234567890#*↑↓←→".indexOf(var1) != -1) {
            Code(Code(var0, var1), var2);
        }
    }

    static String Code(int var0, int var1, boolean var2) {
        String var3 = Code(var0, var1);
        return I.containsKey(var3) ? Code((Integer)I.get(var3), var2) : null;
    }

    private static void b(int var0) {
        synchronized(Code){}

        g var10000;
        for(; Code != null; Code = var10000) {
            var10000 = Code;
            int var10001 = var0;
            boolean var3 = false;

            try {
                var3 = true;
                var10000.I(var10001);
                var10000 = Code.Code();
                var3 = false;
            } finally {
                if (var3) {
                    ;
                }
            }
        }

    }

    private static void I(g var0) {
        Object var1;
        synchronized(var1 = Code){}
        g var10000 = var0;
        g var10001 = Code;
        boolean var3 = false;

        try {
            var3 = true;
            var10000.Code(var10001);
            var3 = false;
        } finally {
            if (var3) {
                ;
            }
        }

        Code = var0;
    }

    static void Code(g var0, boolean var1) {
        Object var2;
        synchronized(var2 = Code){}
        g var10000 = var0;
        boolean var5 = false;

        try {
            var5 = true;
            if (var10000.Z()) {
                var5 = false;
                return;
            }

            var0.I(0);
            e var3;
            if ((var3 = var0.Code()) != null) {
                if (var3.i()) {
                    var3.C = true;
                    var0.Z(var1 + 6);
                    Code(Code);
                    var5 = false;
                } else {
                    var5 = false;
                }

                return;
            }

            if (Code == null) {
                var5 = false;
                return;
            }

            var10000 = Code.Code(var0);
            var5 = false;
        } finally {
            if (var5) {
                ;
            }
        }

        Code = var10000;
    }

    private synchronized void a(int var1) {
        this.Z(this.Code(var1));
    }

    private synchronized g Code(int var1) {
        for(int var2 = 0; var2 < this.Code.size(); ++var2) {
            g var3;
            if ((var3 = (g)this.Code.elementAt(var2)).I() == var1) {
                return var3;
            }
        }

        return null;
    }

    static Image Code(char var0, int var1) {
        return Code(Code(var0, var1), false);
    }

    final e I() {
        return this.Code;
    }

    private boolean J(int var1) {
        Object var2;
        synchronized(var2 = Code){}
        Vector var10000 = b;
        int var10001 = this.Q;
        boolean var7 = false;

        try {
            var7 = true;
            if (var10000.elementAt(var10001) == this) {
                b.setElementAt((Object)null, this.Q);
            }

            boolean var3 = Code || this.I;
            int var4 = 0;

            while(true) {
                while(var4 < this.Code.size()) {
                    g var5;
                    if (!(var5 = (g)this.Code.elementAt(var4)).Z() && !var5.Code() && (var3 || !var5.I())) {
                        if (!var3) {
                            var5.Z();
                        }

                        this.J(var5);
                        ++var4;
                    } else {
                        var5.I(var1);
                        ++var4;
                    }
                }

                this.Code.removeAllElements();
                if (!this.B) {
                    this.B = true;
                    this.Code = null;
                    this.Code = null;
                    A();
                    Code(Code);
                    var7 = false;
                    return true;
                }

                var7 = false;
                return false;
            }
        } finally {
            if (var7) {
                ;
            }
        }
    }

    public final void run() {
        // $FF: Couldn't be decompiled
    }

    private void B(g var1) {
        if (var1 != null) {
            Hashtable var2;
            if ((var2 = var1.Code(true)) != null) {
                int var3 = Thread.currentThread().getPriority();
                Thread.currentThread().setPriority(1);
                int var4;
                Z = var4 = Code(var2);
                J = 0;
                J var5 = new J(4104);
                DataOutputStream var6 = new DataOutputStream(var5);
                Code(var5, 22, var1.I(), 7);
                var6.write(1);
                var6.writeShort(9);
                var6.writeInt(var4 - 7);
                this.J(var5.Code(), 0, 15);
                this.B(var5.Code(), 15);
                var5.Code(0);
                InputStream var55 = null;
                Hashtable var10000 = var2;

                InputStream var59;
                label499: {
                    Throwable var58;
                    label491: {
                        Enumeration var7;
                        boolean var10001;
                        try {
                            var7 = var10000.keys();
                        } catch (Throwable var53) {
                            var58 = var53;
                            var10001 = false;
                            break label491;
                        }

                        label488:
                        while(true) {
                            int var10;
                            int var56;
                            byte[] var57;
                            try {
                                if (!var7.hasMoreElements()) {
                                    break label499;
                                }

                                String var8 = (String)var7.nextElement();
                                Object[] var9 = (Object[])var2.get(var8);
                                var10 = Z(var8) + Z((String)var9[0]) + 8;
                                Code(var5, 22, var1.I(), var10);
                                var6.writeUTF(var8);
                                var6.writeUTF((String)var9[0]);
                                var56 = (Integer)var9[1];
                                var6.writeInt(var56);
                                this.J(var5.Code(), 0, var10 + 8);
                                this.B(var5.Code(), var10 + 8);
                                var5.Code(0);
                                var55 = a.Code((String)var9[2]).openInputStream();
                                var57 = var5.Code();
                                var10 = 0;
                            } catch (Throwable var51) {
                                var58 = var51;
                                var10001 = false;
                                break;
                            }

                            while(true) {
                                try {
                                    int var11;
                                    if (var1.Z() || (var11 = var55.read(var57, 8, 4096)) < 0 || var10 >= var56) {
                                        break;
                                    }

                                    var10 += var11;
                                    J += var11;
                                    Code((byte[])var57, 0, 22, var1.I(), var11);
                                    this.J(var57, 0, var11 + 8);
                                    this.B(var57, var11 + 8);
                                } catch (Throwable var52) {
                                    var58 = var52;
                                    var10001 = false;
                                    break label488;
                                }
                            }

                            var59 = var55;

                            try {
                                var59.close();
                            } finally {
                                ;
                            }
                        }
                    }

                    Throwable var54 = var58;
                    J = -1;
                    var59 = var55;

                    try {
                        var59.close();
                    } finally {
                        ;
                    }

                    Thread.currentThread().setPriority(var3);
                    Code.Code.b();
                    throw var54;
                }

                J = -1;
                var59 = var55;

                try {
                    var59.close();
                } finally {
                    ;
                }

                Thread.currentThread().setPriority(var3);
                Code.Code.b();
            }
        }
    }

    private synchronized void c(int var1) {
        this.f = System.currentTimeMillis();
        this.N = var1;
    }

    private synchronized void D() {
        this.E();
        this.N = 0;
    }

    private synchronized void E() {
        if (this.B) {
            throw new IOException();
        } else {
            this.Code = System.currentTimeMillis();
        }
    }

    final synchronized void Code(g var1) {
        if (this.h()) {
            this.Code(false, 2);
            if (var1.Z()) {
                throw new IOException();
            }
        }

    }

    final int Code() {
        return this.V;
    }

    private static int Code(Hashtable var0) {
        if (var0 == null) {
            return 0;
        } else {
            int var1 = 7;

            String var3;
            Object[] var4;
            for(Enumeration var2 = var0.keys(); var2.hasMoreElements(); var1 = var1 + 2 + Z(var3) + 2 + Z((String)var4[0]) + 4 + (Integer)var4[1]) {
                var3 = (String)var2.nextElement();
                var4 = (Object[])var0.get(var3);
            }

            return var1;
        }
    }

    private void Code(g var1, byte[] var2) {
        String var3;
        int var4;
        String var5;
        if ((var4 = (var3 = this.Z[this.Code]).indexOf(59)) >= 0) {
            var5 = var3.substring(var4);
            var3 = var3.substring(0, var4);
        } else {
            var5 = "";
        }

        Y = this.Q;
        aM = this.b;
        if (this.i()) {
            if (this.Code == null) {
                SocketConnection var16 = (SocketConnection)Connector.open(var3 + var5, 3, bi ^ true);
                this.Code = var16;
                if (bk) {
                    var16.setSocketOption((byte)1, 0);
                }

                this.Code = var16.openDataOutputStream();
                this.I = this.Code;
                this.Code = var16.openDataInputStream();
                this.I = this.Code;
            }

            this.B(var2, var2.length);
            this.B(var1);
        } else {
            String var13 = "";
            String var6;
            if (var1 != null) {
                Object[] var14;
                var6 = (String)(var14 = var1.Code())[53];
                var13 = (String)var14[42];
            } else {
                var6 = "server:test";
            }

            if ((this.C.R & 2) != 0) {
                var13 = I(var6, var13);
                if (var6 == null || !var6.startsWith("b:") && !var6.startsWith("javascript:")) {
                    if ("".equals(var13)) {
                        if (var6 != null) {
                            var13 = var6;
                        } else {
                            var13 = "internal";
                        }
                    }
                } else {
                    var13 = I((String)((String)var1.Code()[38]), (String)null);
                }

                var3 = var3 + var13;
            }

            HttpConnection var17 = (HttpConnection)Connector.open(var3 + var5, 3, bi ^ true);
            this.Code = var17;
            var17.setRequestMethod("POST");
            if (var3.startsWith("http://10.0.0.172")) {
                var3 = Code(this.Z())[0];
                var17.setRequestProperty("X-Online-Host", var3);
            }

            var17.setRequestProperty("Content-Type", "application/xml");
            this.Code = var17.openDataOutputStream();
            this.I = this.Code;
            this.B(var2, var2.length);
            this.B(var1);
            this.Code.close();
            this.Code = null;
            this.Code = var17.openDataInputStream();
            this.I = this.Code;
            int var9;
            if ((var9 = var17.getResponseCode()) != 301 && var9 != 302 && var9 != 303 && var9 != 307) {
                if (var9 == 403) {
                    this.V = 2;

                    label215: {
                        label214: {
                            String var10000;
                            try {
                                StringBuffer var11 = new StringBuffer();
                                int var15 = 0;

                                while((var4 = this.Code.read()) > 32) {
                                    ++var15;
                                    if (var15 > 256) {
                                        break;
                                    }

                                    var11.append((char)var4);
                                    if (var15 == 4 && !var11.toString().toLowerCase().equals("http")) {
                                        var11.setLength(0);
                                        break;
                                    }
                                }

                                if (var11.length() <= 0) {
                                    break label214;
                                }

                                var10000 = var11.toString();
                            } finally {
                                ;
                            }

                            e = var10000;
                            break label215;
                        }

                        e = null;
                    }

                    this.Code(false, 4);
                    e var12 = null;
                    if (var1.Code() != null && var1.Code().Code() != null) {
                        var12 = var1.Code().Code();
                    }

                    Code.Code.Code(var12, I(62));
                }

            } else {
                this.V = 1;
                String var10;
                if (var1 != null && this.C.e() && (var10 = var17.getHeaderField("Location")) != null && var10.length() > 0) {
                    if (var1.Code(var10)) {
                        this.J(var1);
                        A();
                    } else {
                        var1.close();
                    }
                }

                this.e(false);
            }
        }
    }

    private boolean i() {
        return this.Z[this.Code].startsWith("socket://");
    }

    private static void Code(byte var0, String var1) {
        Z = var0;
        s = var1;
    }

    private void G() {
        boolean var10001;
        if (aH) {
            String var10000 = this.Code;

            try {
                String[] var1 = Code(var10000);
                this.r = var1[0];
                this.Code = var1[1];
            } catch (Throwable var8) {
                var10001 = false;
                return;
            }
        }

        try {
            HttpConnection var9 = (HttpConnection)Connector.open(this.Code, 3, false);
            if (a) {
                var9.setRequestProperty("Test-Header", "debug");
            }

            if (this.r != null) {
                var9.setRequestProperty("X-Online-Host", this.r);
            }

            var9.openDataInputStream().close();
            int var2;
            if ((var2 = var9.getResponseCode()) >= 301 && var2 <= 303 || var2 == 307) {
                this.Code = var9.getHeaderField("Location");
                this.run();
            }

            var9.close();
        } catch (Throwable var7) {
            var10001 = false;
            return;
        }
    }

    private boolean Code(g var1) {
        if (this.B[0] == 72 && this.B[1] == 84 && this.B[2] == 84 && this.B[3] == 80) {
            this.B(5, 7);
            e var10000;
            String var10001;
            if (!this.C.e() || this.B[8] != 32 || this.B[9] != 51 || this.B[10] != 48 || this.B[11] != 49 && this.B[11] != 50 && this.B[11] != 51 && this.B[11] != 55) {
                if (this.B[8] == 32 && this.B[9] == 52 && this.B[10] == 48 && this.B[11] == 51) {
                    this.V = 2;
                    StringBuffer var18 = new StringBuffer();
                    var10000 = this;
                    var10001 = null;

                    try {
                        var10000.Z(var10001);
                        int var20 = 0;

                        while(true) {
                            ++var20;
                            if (var20 > 256) {
                                break;
                            }

                            this.B(0, 1);
                            if (this.B[0] <= 32) {
                                break;
                            }

                            var18.append((char)this.B[0]);
                            if (var20 == 4 && !var18.toString().toLowerCase().equals("http")) {
                                var18.setLength(0);
                                break;
                            }
                        }
                    } finally {
                        ;
                    }

                    e = var18.length() > 4 ? var18.toString() : null;
                    this.Code(false, 4);
                    e var19 = null;
                    if (var1.Code() != null && var1.Code().Code() != null) {
                        var19 = var1.Code().Code();
                    }

                    Code.Code.Code(var19, I(62));
                    return true;
                } else {
                    return false;
                }
            } else {
                this.V = 1;
                String var2 = null;
                var10000 = this;
                var10001 = "location";

                String var21;
                try {
                    var21 = var10000.Z(var10001);
                } finally {
                    ;
                }

                var2 = var21;
                if (var2 != null && var2.length() != 0) {
                    if (var1 != null) {
                        if (var1.Code(var2)) {
                            this.J(var1);
                            A();
                        } else {
                            var1.close();
                        }
                    }

                    Object var3;
                    synchronized(var3 = Code){}

                    g var22;
                    for(g var4 = Code; var4 != null; var4 = var22) {
                        var22 = var4;
                        boolean var8 = false;

                        try {
                            var8 = true;
                            if (var22.Code() == this.Q && !var4.Z() && var4 != var1) {
                                if (var4.Code(var2)) {
                                    A();
                                } else {
                                    var4.close();
                                }
                            }

                            var22 = var4.Code();
                            var8 = false;
                        } finally {
                            if (var8) {
                                ;
                            }
                        }
                    }

                    this.Code(false, 0);
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }

    private String Z(String var1) {
        StringBuffer var2 = new StringBuffer();

        while(true) {
            this.B(0, 1);
            if (this.B[0] == 13) {
                this.B(0, 1);
            }

            if (this.B[0] == 10) {
                if (var2.length() == 0) {
                    if (var1 != null) {
                    }

                    return null;
                }

                String var3;
                int var4;
                if (var1 != null && (var4 = (var3 = var2.toString()).indexOf(58)) >= 0 && var3.toLowerCase().startsWith(var1)) {
                    return var3.substring(var4 + 1).trim();
                }

                var2.setLength(0);
            } else {
                var2.append((char)this.B[0]);
            }
        }
    }

    private static String J(String var0) {
        StringBuffer var1 = new StringBuffer();
        int var2 = 0;

        while(true) {
            while(var2 < var0.length()) {
                char var3;
                if (((var3 = var0.charAt(var2)) <= '/' || var3 >= ':') && (var3 <= '@' || var3 >= '[') && (var3 <= '`' || var3 >= '{') && "-_.~".indexOf(var3) == -1 && "%&=".indexOf(var3) == -1) {
                    var1.append('%').append(Integer.toString(var3, 16));
                    ++var2;
                } else {
                    var1.append(var3);
                    ++var2;
                }
            }

            return var1.toString();
        }
    }

    final void Code(boolean var1, String var2, String var3) {
        I var4;
        (var4 = new I(38)).Code = this;
        var4.Z = var3;
        var4.B = var2;
        var2 = I(60);
        var4.J = var1 ? "overlay:" + var2 : var2;
        Code((Runnable)var4);
    }

    private void b(int var1, int var2) {
        if (Code != null) {
            if (var1 != -6 && var1 != -7) {
                if (var1 == -11 && e == 2) {
                    var1 = 49;
                }

                boolean var3 = this.al != -1 && this.ak == var1 && System.currentTimeMillis() - this.Code < 1000L;
                boolean var4 = false;
                boolean var5 = true;
                if (this.al != -1 && !var3) {
                    var4 = this.Code(true);
                }

                switch(var1) {
                    case -8:
                        if (this.aO) {
                            this.Code = new StringBuffer();
                        } else if ((var4 || this.ai == -1) && this.Code.length() > 0 && this.am > 0) {
                            this.Code.deleteCharAt(--this.am);
                        }

                        this.ai = -1;
                        break;
                    case -7:
                    case -6:
                    case -4:
                    case -3:
                    case -2:
                    case -1:
                    case 0:
                    case 3:
                    case 4:
                    default:
                        if ((var2 = Code(var1, this.al, var2 > 0)) != -1) {
                            if (this.aO) {
                                this.Code = new StringBuffer();
                            }

                            if (var2 != 8 && var2 != 127) {
                                this.al = (char)var2;
                                if (!B(var1)) {
                                    var4 = this.Code(true);
                                } else {
                                    var5 = false;
                                }
                            } else {
                                if ((var4 || this.ai == -1) && this.Code.length() > 0 && this.am > 0) {
                                    this.Code.deleteCharAt(--this.am);
                                }

                                this.ai = -1;
                            }
                        }
                        break;
                    case -5:
                        this.Code = null;
                        if (!var4) {
                            if (this.ai != -1 && this.ai == this.c.size() - 1) {
                                Code.Code.J(this.u);
                            } else {
                                Code.Code.I(this);
                                String var6;
                                if (this.ai != -1 && this.c.size() != 0) {
                                    if (this.ai == this.c.size() - 2) {
                                        Code.Code.Z((String)Code((Vector)C, (int)0)[0], this.u);
                                        var6 = this.u;
                                    } else {
                                        Code.Code.Z(var6 = (String)this.c.elementAt(this.ai));
                                    }
                                } else {
                                    Code.Code.Z(var6 = this.u);
                                }

                                B var7;
                                if ((var7 = this.Code.Code) != null && var6 != null && I(var7.Code) == 65) {
                                    var7.Code.put("o:a", var6);
                                }
                            }

                            var5 = false;
                        }
                        break;
                    case 1:
                        if (!var4) {
                            e var10000;
                            int var10001;
                            if (this.ai < 0) {
                                var10000 = this;
                                var10001 = this.c.size();
                            } else {
                                var10000 = this;
                                var10001 = this.ai;
                            }

                            var10000.ai = var10001 - 1;
                            if (this.c.size() == 0) {
                                var5 = true;
                            } else {
                                var5 = false;
                            }
                        }
                        break;
                    case 2:
                        if (this.ai != -1 && this.ai < this.c.size() - 2) {
                            this.Code = new StringBuffer((String)this.c.elementAt(this.ai));
                            this.ai = -1;
                        }

                        this.am = Math.max(0, this.am - 1);
                        break;
                    case 5:
                        if (this.aO) {
                            this.am = this.Code.length();
                        } else if (!var4) {
                            if (this.ai != -1 && this.ai < this.c.size() - 2) {
                                this.Code = new StringBuffer((String)this.c.elementAt(this.ai));
                                this.ai = -1;
                                this.am = this.Code.length();
                            } else {
                                this.am = Math.min(this.Code.length(), this.am + 1);
                            }
                        }
                        break;
                    case 6:
                        if (!var4) {
                            if (this.aO) {
                                this.am = this.Code.length();
                            } else if (this.ai >= this.c.size() - 1) {
                                this.ai = -1;
                            } else {
                                ++this.ai;
                            }

                            if (this.c.size() == 0) {
                                var5 = true;
                            } else {
                                var5 = false;
                            }
                        }
                }

                if (var5) {
                    this.J(var4);
                }

                this.f();
                this.aO = false;
                this.Code = System.currentTimeMillis();
                this.ak = var1;
            }
        }
    }

    final void Code(int var1, int var2) {
        if (this.Code((int)16)) {
            this.b(var1, var2);
        } else if (this.Code != null) {
            if (this.Code((int)2) && var1 > 48 && var1 <= 57) {
                var1 -= 48;
                if (this.Code.Code(var1 - 1)) {
                    this.Code.B(false);
                }

            } else {
                int var3;
                if (this.a() && var1 >= 48 && var1 <= 57) {
                    if (!Code.a() && !this.aT) {
                        if (var1 >= 48 && var1 <= 57) {
                            var1 -= 48;
                            e var5;
                            Vector var6;
                            int var10000 = (var5 = this).Code != null && (var6 = var5.Code.Code()) != null ? var6.size() : 0;
                            var3 = var10000;
                            int var4 = b(var10000);
                            if (this.aG >= 0) {
                                if ((var1 += this.aG * 10) - var4 < var3) {
                                    this.aG = var1;
                                    if (this.aG - var4 >= var3) {
                                        this.Z(false);
                                    }

                                    if (var1 - var4 >= 0) {
                                        this.aT = true;
                                        return;
                                    }
                                }

                                return;
                            }

                            if (var1 != 0) {
                                this.aG = var1;
                                if ((var1 = this.aG - var4) >= var3) {
                                    this.Z(false);
                                }

                                if (var1 < var3 && var1 >= 0) {
                                    this.aT = true;
                                    return;
                                }

                                return;
                            }
                        }

                        this.Z(false);
                    }

                } else {
                    this.Code.g();
                    var3 = this.Code.h();
                    switch(var1) {
                        case -10:
                            this.Code.Code(0, var3, true, true);
                        case -8:
                        case -7:
                        case -6:
                        case -4:
                        case -3:
                        case -2:
                        case -1:
                        case 0:
                        case 3:
                        case 4:
                        default:
                            return;
                        case -9:
                            this.Code.Code(0, -var3, true, true);
                            return;
                        case -5:
                            this.Code.c();
                            return;
                        case 1:
                            this.Code.Code(0, -1, var2);
                            return;
                        case 2:
                            if (this.Code((int)2)) {
                                Code.Code.I(this);
                                return;
                            }

                            this.Code.Code(-1, 0, var2);
                            return;
                        case 5:
                            if (this.Code((int)2)) {
                                this.Code.b();
                                return;
                            }

                            this.Code.Code(1, 0, var2);
                            return;
                        case 6:
                            this.Code.Code(0, 1, var2);
                    }
                }
            }
        }
    }

    final void I(Graphics var1) {
        if (!this.a()) {
            I(var1, this.U, this.N, this.V, this.I());
            this.Code.I(var1, this.U, this.N);
        }
    }

    static String Code(int var0, String var1, int var2, String var3) {
        if (var3 == null) {
            var3 = "...";
        }

        var1 = var1.substring(0, Math.min(var1.length(), 4096));
        if (Code(var0, var1) <= var2) {
            return var1;
        } else {
            var2 -= Code(var0, var3);
            char[] var4 = var1.toCharArray();
            var0 = I(var0, var4, var4.length, var2);
            return var1.substring(0, var0) + var3;
        }
    }

    final boolean Code(int var1) {
        return (var1 & this.Code) != 0;
    }

    final void I(int var1, int var2) {
        if (this.e) {
            this.ag = -1;
            this.Code(false, false, (Hashtable)null);
        } else {
            boolean var3 = this.Code((int)16);
            this.aP = false;
            if (this.Code == null && !var3) {
                this.ag = -1;
            } else {
                var1 -= this.U;
                var2 -= this.N;
                if (var3) {
                    if (this.al != -1 && this.Code(true)) {
                        this.J(true);
                        this.f();
                        this.ag = -1;
                    } else if (var3 && this.au < this.c.size() && var1 >= this.V - 4 && var1 <= this.V - 4 + B) {
                        if (var2 < this.Code(var3)) {
                            this.ag = 1;
                            this.aj = Math.max(0, this.aj - (this.at - 1));
                        } else if (var2 < this.Code(var3) + this.I(var3)) {
                            this.ag = 2;
                            this.ah = var2;
                            this.ap = this.aj;
                        } else {
                            this.ag = 3;
                            this.aj = Math.min(this.c.size() - this.au, this.aj + (this.at - 1));
                        }
                    } else {
                        this.ag = 0;
                        this.ao = var2;
                        this.ap = this.aj;
                    }
                } else if (var1 >= this.V) {
                    if (var2 < this.Code(var3)) {
                        this.ag = 1;
                        this.Code.Code(0, -this.Code.h(), false, true);
                    } else if (var2 < this.Code(var3) + this.I(var3)) {
                        this.ag = 2;
                        this.ah = var2 - this.Code(var3);
                    } else {
                        this.ag = 3;
                        this.Code.Code(0, this.Code.h(), false, true);
                    }
                } else if (var2 >= this.I()) {
                    if (var1 < this.e()) {
                        this.ag = 4;
                        this.Code.Code(-this.Code.g(), 0, true, true);
                    } else if (var1 < this.e() + this.f()) {
                        this.ag = 5;
                        this.ah = var1 - this.e();
                    } else {
                        this.ag = 6;
                        this.Code.Code(this.Code.g(), 0, true, true);
                    }
                } else {
                    this.ag = 0;
                    this.Code.J(var1, var2);
                }
            }
        }
    }

    private static synchronized boolean m() {
        if (a != 0) {
            T();
            C(false);
            return true;
        } else {
            return false;
        }
    }

    final int I() {
        if (this.R != this.V && this.Code != null && this.Code.a() > this.V) {
            return this.Code((int)5) && this.U + this.S < Code.f ? this.S - B + 1 : this.S - B;
        } else {
            return this.S;
        }
    }

    private void M() {
        this.Code.Code.put("s", "1");
        this.Code(this.Code.Code, this.Code.Code, this.Code.Code(), this.Code.I);
    }

    final void Code(boolean var1, boolean var2, Hashtable var3) {
        if (this.e) {
            if (this.Code != null && this.Code[0] != null) {
                this.Code(this.Code, this.v, false, false, false, false, (Hashtable)null);
                this.Code = null;
                this.v = null;
                this.e = false;
                a();
            }

        } else if (this.Code != null) {
            this.Code(this.Code.Code(), this.Code.J, true, var2, var1, false, var3);
        }
    }

    e(int var1, e var2, boolean var3) {
        this.j = true;
        this.g = true;
        this.f = true;
        super();
        this.Code = new Vector(30);
        this.T = -1;
        this.O = -1;
        this.I = false;
        this.d = "";
        this.C = false;
        this.ai = -1;
        this.aj = 0;
        this.ak = 2147483647;
        this.Code = 0L;
        this.al = -1;
        this.Code = null;
        this.Z = false;
        this.am = 0;
        this.an = 0;
        this.aO = false;
        this.d = false;
        this.aG = -1;
        this.aT = false;
        this.aU = false;
        this.v = null;
        this.Code = null;
        this.e = false;
        this.aV = true;
        this.Code = var1;
        this.Code = var2;
        this.aV = var3;
        if (var1 == 16) {
            this.c = new Vector();
            this.d = new Vector();
            this.e = new Vector();
            this.aA = B(0);
            this.aB = this.aA + 5;
            this.I = this.Z = Code(Code.J, 0, Code.J.length, 256, (Object[])null);
            this.aQ = Code.e > 128;
            this.aC = Math.max(this.aA, this.Z.getHeight()) + 5;
            boolean var4 = var2.Code != null && I(var2.Code.Code) == 65;
            if (var2.Code != null && var2.Code.Code != null && I(var2.Code.Code) == -1 && !var2.Code.Code.startsWith("myopera:") && !var2.Code.Code.startsWith("feed:") && !var2.Code.Code.startsWith("sk:") && !var2.Code.Code.startsWith("share:")) {
                this.Code = new StringBuffer(var2.Code.Code);
                this.aO = true;
            } else {
                String var6 = "www.";
                if (var4) {
                    var2.Code.Z(true);
                    Object var5;
                    if ((var5 = var2.Code.Code.get("o:a")) != null && var5 instanceof String) {
                        var6 = (String)var5;
                    }
                }

                this.Code = new StringBuffer(var6);
                this.am = this.Code.length();
            }

            if (!var4) {
                this.af = (int)System.currentTimeMillis();
                Code.e();
                this.Q = -this.aC - 9;
            }
        }

        this.I();
    }

    final synchronized void Code(String var1, String var2, String var3) {
        this.Code(var1, var2, var3, (Hashtable)null);
    }

    final int a() {
        return Code(this.Code.f(), 0, this.I() - 1);
    }

    final void I(int var1) {
        if (this.Code != null) {
            this.Code.Code(var1);
        }

    }

    final void I() {
        this.U = 0;
        this.N = Code.Code.J() ? Code.c : 0;
        this.R = Code.e;
        this.S = Code.f - (Code.Code.B() ? Code.b : 0) - this.N;
        this.M = this.V = this.R - B;
        int var1 = 0;
        int var2 = 0;
        if (this.Code != null) {
            var1 = this.Code.B();
            var2 = this.Code.C();
        }

        if (this.Code((int)16)) {
            this.R = this.Code.M;
            this.M = this.V = this.R - B;
            if (this.c.size() > 0) {
                this.J(false);
            }

            this.f();
        } else if (this.Code((int)2)) {
            int var3 = af ? 0 : Code.b;
            this.M = this.R;
            this.R = this.V = var1;
            this.S = Math.min(var2, Code.f);
            int var4;
            int var5;
            if (this.Code.Code((int)2)) {
                if ((var4 = this.Code.U + this.Code.R - 6) + this.R > Code.e && this.Code.U - this.R + 6 >= 0) {
                    var4 = this.Code.U - this.R + 6;
                }

                if ((var5 = this.Code.N + this.Code.a() - 10) + this.S > Code.f - var3) {
                    var5 += 20 - this.S;
                }
            } else if (this.Code != null && I(this.Code.Code) == 123) {
                var4 = this.Code.U + this.Code.C();
                var5 = this.Code.N + this.Code.a();
            } else {
                var4 = N ? Code.e - this.R : 0;
                if (N) {
                    var5 = Code.c - 4;
                } else {
                    var5 = Code.f + 4;
                }
            }

            this.U = Code(var4, 0, Code.e - this.R);
            var4 = N && this.k() ? var5 : Math.max(var5, this.N);
            this.N = Code(var4, 0, Code.f - var3 - this.S + 4);
        }

        if (this.Code((int)40)) {
            this.M = Code.e * 9 / 10;
            this.R = this.V = Math.min(var1, this.M);
            this.S = Math.min(var2, (Code.f << 3) / 10);
            if (var2 > this.S) {
                this.R += B;
            }

            this.U = (Code.e - this.R) / 2;
            this.N = (Code.f - this.S) / 2;
            if (this.Code != null) {
                this.Code.I(0, this.I() - this.I(false));
            }
        }

        if (this.Code((int)32)) {
            this.U = 0;
            this.R = this.V = this.M = Code.e;
            this.S = Math.min(var2, Code.f / 2);
            this.N = Code.f - this.S - (Code.Code.B() ? Code.b : 0);
        }

        this.K();
        if (this.Code != null) {
            this.Code.Code(0, 0, false, false);
            if (I(this.Code.Code) == 165) {
                this.Code.B();
            }
        }

    }

    final synchronized void Code(String var1, String var2, String var3, Hashtable var4) {
        if (var1.length() != 0) {
            if (this.Code != null && this.T >= 0) {
                this.Code.Code();
            }

            int var5 = I(var1);
            int var6 = -1;
            if (this.Code != null) {
                var6 = I(this.Code.Code);
            }

            if (I(var1, "menu:")) {
                Code.Code.Code(I(var1), var3, 2, this);
            } else if (I(var1, "si:")) {
                this.Code.Code.Code(I(var1));
                Code.Code.I(this);
                Code.Code.I(this.Code);
            } else if (this.Code((int)16) && var5 == 132) {
                this.b(-8, 0);
            } else if (this.Code != null && this.Code((int)2)) {
                if (var5 == 115) {
                    this.Code.c();
                } else {
                    Code.Code.I(this);
                    if (var5 != 114 || this.Code.Code((int)2)) {
                        this.Code.Code(var1, var2, var3);
                    }

                    if (var5 == 129 && this.Code.Code((int)16)) {
                        Code.Code.I(this.Code);
                    }

                }
            } else if (this.Code != null && this.Code((int)40) && var6 == 76) {
                Code.Code.I(this);
                if (var5 != 114) {
                    this.Code.Code(var1, var2, var3);
                }

            } else {
                if (I(var1, "nint:")) {
                    if (this.Code != null && this.Code.I()) {
                        return;
                    }

                    var5 = I(var1 = I(var1));
                }

                if (I(var1, "dialog:")) {
                    Code.Code.Code(I(var1), var3, 4, this);
                } else if (I(var1, "bottomOverlay:")) {
                    e var15;
                    if (I(var1 = I(var1)) != 165 || (var15 = Code.Code(40)) == null || var15.Code == null || I(var15.Code.Code) != 165) {
                        Code.Code.Code(var1, var3, 32, this);
                    }
                } else if (I(var1, "overlay:")) {
                    Code.Code.Code(I(var1), var3, 8, this);
                } else if (I(var1, "openp:")) {
                    Code.Code.I(this);
                    Code.Code.I(I(var1));
                } else if (I(var1, "get:")) {
                    I var14;
                    (var14 = new I(37)).I = I(var1);
                    var14.Code = this;
                    var14.Code = this.Code.Code;
                    Code((Runnable)var14);
                } else {
                    I var11;
                    if (I(var1, "cwd:")) {
                        a.Code(I(var1));
                        (var11 = new I(36)).Code = this;
                        Code((Runnable)var11);
                    } else if (I(var1, "put:")) {
                        var1 = I(var1);
                        C var19;
                        (var19 = new C(this, var1)).setPriority(1);
                        var19.start();
                    } else if (I(var1, "mkdir:")) {
                        Code.Code(Code((int)171), "New_Folder", 0, false);
                    } else if (I(var1, "open:") && I(var2) != -1) {
                        this.I = new B(this);
                        var1 = I(var1);
                        this.I.Code(var1.substring(var1.indexOf(58) + 1));
                    } else if (I(var1, "sets:")) {
                        a.Code(true);
                        Code.Code.I(this);
                        Code.Code.I(I(134), "r");
                    } else if (I(var1, "set:")) {
                        (var11 = new I(39)).Code = Code.Code(1);
                        Code((Runnable)var11);
                        Code.Code.I(this);
                    } else {
                        boolean var7 = false;
                        if (I(var1, "tssr:")) {
                            ar ^= true;
                            var5 = I(var1 = I(var1));
                        }

                        if (I(var1, "openNewTab:")) {
                            boolean var10 = false;
                            if (I(var1 = I(var1), "openBackgroud:")) {
                                var10 = true;
                                var1 = I(var1);
                            }

                            var3 = null;
                            String var16 = null;

                            e var17;
                            for(var17 = this; var17 != null && !var17.Code((int)1); var17 = var17.Code) {
                            }

                            if (var17 != null) {
                                var3 = var17.Code.Code;
                                var16 = var17.Code.Code();
                            }

                            Code.Code.Code(var1, var3, var16, var10);
                        } else {
                            if (I(var1, "timg:")) {
                                var7 = true;
                                var5 = I(var1 = I(var1));
                            }

                            int var12;
                            if (this.Code != null && this.Code.f) {
                                if (var5 == 115) {
                                    this.Code.B(false);
                                } else if (var6 == 60 && var5 == 116) {
                                    this.Code.B(false);
                                } else if (var6 == 60 && var5 == 81 && a.Code != null) {
                                    this.Code((String)"cwd:..", (String)null, (String)null);
                                } else {
                                    if (var5 == 113) {
                                        this.Code.Code.Code(B.Code(this.Code.Code), false);
                                    } else if (var5 != 114) {
                                        if (var6 == 54) {
                                            var12 = Integer.parseInt(var1);
                                            if (B.Code != Z && B.Code != Code.Z) {
                                                B.c = var12 - 1;
                                            } else {
                                                System.arraycopy((Object[])B.Code.elementAt(var12), 0, B.Code, 0, 3);
                                                this.Code.Code.J = "keep";
                                                this.Code.J();
                                            }
                                        } else {
                                            this.Code.Code.Code(var1, false);
                                        }
                                    }

                                    Code.Code.I(this);
                                }
                            } else if (var5 == 115 && this.Code != null) {
                                this.Code.c();
                            } else {
                                this.C = var5;
                                label483:
                                switch(var5) {
                                    case 39:
                                        if (!(this.Code != null ? (this.Code.Code != null ? this.Code.Code : "") : "").startsWith("server:")) {
                                            Code.Code.Code(M ^ true);
                                        }
                                        break;
                                    case 40:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 50:
                                    case 52:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                    case 58:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case 76:
                                    case 77:
                                    case 78:
                                    case 84:
                                    case 85:
                                    case 86:
                                    case 87:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case 95:
                                    case 99:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 111:
                                    case 112:
                                    case 115:
                                    case 118:
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case 128:
                                    case 129:
                                    case 132:
                                    case 133:
                                    case 135:
                                    case 136:
                                    case 139:
                                    case 141:
                                    case 143:
                                    case 144:
                                    case 145:
                                    case 148:
                                    default:
                                        if (I(var1, "bookmark:")) {
                                            Code.Code.Code(this, "ext:" + (String)Code(Z, Code(var1))[0]);
                                        } else if (I(var1, "search:")) {
                                            q = Code(var1);
                                            Code.Code((String)Code(C, q)[1], "", 0, false);
                                        } else if (I(var1, "speeddial:")) {
                                            if (Code(Code(J, Code(var1)))) {
                                                Code.Code.Code(this, "dialog:" + I(52));
                                            } else if (!(var1 = (String)Code(J, Code(var1))[0]).equals("www.")) {
                                                Code.Code.Code(this, "ext:" + var1);
                                            }
                                        } else if (I(var1, "spl:")) {
                                            Code.Code.Code(this, "ext:" + (String)Code(I, Code(var1))[0]);
                                        } else if (I(var1) == 65 && !aA) {
                                            Code.Code.Code(this, var1);
                                        } else if (I(var1, "addTab:")) {
                                            if (this.Code((int)40)) {
                                                Code.Code.I(this);
                                            }

                                            Code.Code.f();
                                        } else if (I(var1, "moveToLeftTab:")) {
                                            Code.Code.Z(-1);
                                        } else if (I(var1, "moveToRightTab:")) {
                                            Code.Code.Z(1);
                                        } else if (I(var1, "closeTab:")) {
                                            this.Z(var1);
                                        } else if (I(var1, "showTab:")) {
                                            e var22 = this;
                                            byte var23 = 40;

                                            try {
                                                if (var22.Code((int)var23)) {
                                                    Code.Code.I(this);
                                                }

                                                Code.Code.I(Integer.parseInt(I(var1)));
                                            } catch (NumberFormatException var8) {
                                            }
                                        } else {
                                            Object[] var18;
                                            if (I(var1, "history:")) {
                                                var18 = (Object[])Code.Z.elementAt(Code(var1));
                                            } else {
                                                if (I(var1, "ext:") && (var1 = I(var1)).length() == 0) {
                                                    return;
                                                }

                                                if (at && this.Z != null && var1.equals(this.r)) {
                                                    this.S();
                                                    return;
                                                }

                                                this.R();
                                                (var18 = new Object[11])[0] = var1;
                                                var18[3] = var3;
                                                var18[7] = new int[6];
                                                var18[10] = var4;
                                            }

                                            this.Code(var18, var2, false, var7, false, false, (Hashtable)null);
                                        }
                                        break;
                                    case 41:
                                        this.Code((Vector)C, (int)-1);
                                        break;
                                    case 42:
                                        this.Code((Vector)C, (int)1);
                                        break;
                                    case 49:
                                        if (Code.Z) {
                                            (var11 = new I(31)).Code = this;
                                            Code((Runnable)var11);
                                        }
                                        break;
                                    case 51:
                                        if (this.Code != null) {
                                            this.Code.h();
                                        }
                                        break;
                                    case 53:
                                        if (Z(var3, "b")) {
                                            B.Code[0] = Code(var3, "b");
                                        }

                                        this.Code((String)("server:gettitle?u=" + (String)B.Code[0]), (String)null, (String)null);
                                        break;
                                    case 59:
                                        this.Code.I(false);
                                        break;
                                    case 63:
                                        if (this.Code.a) {
                                            Code.Code.Code(this, "share:list?url=" + Code(this.Code.Code, true) + "&title=" + Code(this.Code.I, true));
                                        }
                                        break;
                                    case 79:
                                        Browser.Code();
                                        return;
                                    case 80:
                                        if (this.Code != null) {
                                            this.Code.B = null;
                                        }

                                        if (c() != 0) {
                                            this.b();
                                            Code.Code.Code("", (String)null, 16, this);
                                        } else {
                                            Code.Code.J("www.");
                                        }
                                        break;
                                    case 81:
                                        this.C(-1, 0);
                                        break;
                                    case 82:
                                        if (this.I(1)) {
                                            this.C(1, 0);
                                        } else if (at) {
                                            this.S();
                                        }
                                        break;
                                    case 83:
                                        this.Code(true, var7, (Hashtable)null);
                                        break;
                                    case 92:
                                    case 93:
                                    case 96:
                                        this.M();
                                        break;
                                    case 94:
                                        String var20 = this.Code != null ? this.Code.Z() : null;
                                        var1 = var20;
                                        if (var20 != null && var1.length() > 0 && !var1.startsWith("myopera:///b/f/")) {
                                            this.Code(var1 + "/c/", this.Code.Code, this.Code.Code());
                                        }
                                        break;
                                    case 97:
                                        this.Code((Vector)Z, (int)-1);
                                        break;
                                    case 98:
                                        this.Code((Vector)Z, (int)1);
                                        break;
                                    case 110:
                                        this.O();
                                        break;
                                    case 113:
                                        if (this.Code((int)16)) {
                                            this.Code((int)-5, (int)0);
                                        } else if (var6 == 60 && this.Code != null) {
                                            c = false;
                                            this.Code(false, (String)null, this.Code.Z);
                                        } else {
                                            Code.Code.I(this);
                                        }
                                        break;
                                    case 114:
                                        Code.J = false;
                                        if (!this.Code((int)1)) {
                                            if (Y) {
                                                a.Code();
                                            }

                                            Code.Code.I(this);
                                        } else {
                                            if (var6 == 148) {
                                                if (aE && this.Code != null) {
                                                    this.Code.C(false);
                                                    return;
                                                }

                                                g(false);
                                            }

                                            this.C(-1, 65);
                                        }
                                        break;
                                    case 116:
                                        if (var6 == 73) {
                                            this.Code.Z();
                                            this.C(-1, 0);
                                        } else if (var6 == 148) {
                                            g(true);
                                            this.C(-1, 0);
                                        } else if (var6 != 101 && var6 != 100 && var6 != 45 && var6 != 44 && var6 != 52 && var6 != 89 && var6 != 141) {
                                            if (var6 == 47) {
                                                this.Code.Code(C);
                                                q = C.size() - 1;
                                                Code.Code.Code(this, I(109));
                                            } else if (var6 == 135) {
                                                Code.Code.I(this);
                                                (var11 = new I(41)).Code = (B)B.Code[8];
                                                var11.Code = this;
                                                var11.Z = this.Code.Code();
                                                var11.C = (String)this.Code.Code.get("a");
                                                Code((Runnable)var11);
                                            } else {
                                                this.M();
                                            }
                                        } else {
                                            Code.Code.I(this);
                                            B var10000;
                                            Vector var21;
                                            if (var6 != 100 && var6 != 89) {
                                                var10000 = this.Code;
                                                var21 = var6 == 52 ? J : (var6 == 141 ? a : (var6 > 47 ? Z : C));
                                            } else if (B.c >= 0) {
                                                var10000 = this.Code;
                                                var21 = J;
                                            } else {
                                                var10000 = this.Code;
                                                var21 = Z;
                                            }

                                            var10000.Code(var21);
                                            if (var6 != 89) {
                                                this.Code.B = true;
                                                this.Code.Code(true, false, (Hashtable)null);
                                            }

                                            if (var6 > 47) {
                                                Code.J = false;
                                                if (Code.Code != Code.I) {
                                                    this.Code((String)I(49), (String)null, (String)null);
                                                }
                                            }
                                        }
                                        break;
                                    case 117:
                                        this.Code.I(true);
                                        break;
                                    case 119:
                                        this.Code.d();
                                        break;
                                    case 120:
                                        Code.Code.a();
                                        break;
                                    case 121:
                                        switch(var6) {
                                            case 32:
                                                Code.Code.removeAllElements();
                                                Code.Z.removeAllElements();
                                                Code.g();
                                                I("h1");
                                                Code.Code.Code(Code.Z);
                                                C(false);
                                                Code.Code.I(this);
                                                Code.Code.I(I(65));
                                                break label483;
                                            case 33:
                                                Code.Code.I(this);
                                                Code.Code.I("server:reset");
                                                break label483;
                                            case 43:
                                            case 50:
                                            case 99:
                                            case 139:
                                                var12 = this.Code.B();
                                                if (var6 == 139) {
                                                    Object[] var9 = Code(a, var12);
                                                    I var13;
                                                    (var13 = new I(40)).I = (String)var9[0];
                                                    Code((Runnable)var13);
                                                }

                                                I(var6 == 99 ? Z : (var6 == 50 ? J : (var6 == 139 ? a : C)), var12);
                                                Code.Code.I(this);
                                                this.Code.B = true;
                                                this.Code.Code(true, false, (Hashtable)null);
                                                if (var6 == 99 || var6 == 50) {
                                                    Code.J = false;
                                                    if (Code.Code != Code.I) {
                                                        this.Code((String)I(49), (String)null, (String)null);
                                                    }
                                                }
                                                break label483;
                                            case 46:
                                                Code.Code.I(this);
                                                Code.Code.I(I(127));
                                                break label483;
                                            case 126:
                                                Code.Code.I(this);
                                                this.Code.J();
                                                break label483;
                                            case 144:
                                                Code.Code.I(this);
                                                Code.Z(false);
                                                break label483;
                                            default:
                                                this.M();
                                                break label483;
                                        }
                                    case 122:
                                        Code.J = false;
                                        if (!Code.Code.I(this)) {
                                            this.C(-1, 65);
                                        }

                                        if (var6 == 126) {
                                            am = false;
                                        }
                                        break;
                                    case 127:
                                        Code.Code(Code((int)141), this.d, 0, false);
                                        break;
                                    case 130:
                                        Code.Code.J(this.u);
                                        break;
                                    case 131:
                                        this.Code("");
                                        break;
                                    case 134:
                                        if (a.Code(false)) {
                                            this.Code((String)("dialog:" + I(135)), (String)null, (String)var3);
                                        } else {
                                            this.Code(true, "", "s=1&r=1");
                                        }
                                        break;
                                    case 137:
                                        this.Code((Vector)a, (int)-1);
                                        break;
                                    case 138:
                                        this.Code((Vector)a, (int)1);
                                        break;
                                    case 140:
                                        this.Code(true, (String)null, "s=1&r=2");
                                        break;
                                    case 142:
                                        Code();
                                        Code.Code.Code(this, "server:setup");
                                        break;
                                    case 146:
                                        (var11 = new I(6)).Code = o;
                                        if ((var2 = Browser.Code.getAppProperty("OM-Upgrade")) != null) {
                                            StringBuffer var10001 = (new StringBuffer()).append(var11.Code);
                                            int var10002 = var11.Code.indexOf(63) - -1;
                                            var11.Code = var10001.append((char)(((var10002 | -var10002) >>> 31) * -25 + 63)).append(var2).toString();
                                        }

                                        Code((Runnable)var11);
                                        Code.Code.I(this);
                                        Code.Code.I(I(65));
                                        U();
                                        break;
                                    case 147:
                                        Code.Code.I(this);
                                        Code.Code.I(I(65));
                                        U();
                                        C(false);
                                        break;
                                    case 149:
                                        Code.Code.Code();
                                        a(false);
                                        Code.Code(148, false);
                                        break;
                                    case 150:
                                        V();
                                        break;
                                    case 151:
                                        W();
                                        this.aR = true;
                                        this.aN = true;
                                        a();
                                        break;
                                    case 152:
                                        X();
                                        break;
                                    case 153:
                                        this.Code.Code(false);
                                        break;
                                    case 154:
                                        this.Code.Code(0, -this.Code.h(), true, true);
                                        break;
                                    case 155:
                                        this.Code.Code(0, this.Code.h(), true, true);
                                        break;
                                    case 156:
                                        this.Code.Code(-this.Code.g(), 0, true, true);
                                        break;
                                    case 157:
                                        this.Code.Code(this.Code.g(), 0, true, true);
                                        break;
                                    case 158:
                                        Code.Code.I(true);
                                        break;
                                    case 159:
                                        if (!this.Code.Z()) {
                                            this.C = 117;
                                        }

                                        this.Code.I(this.Code.Z() ^ true);
                                        break;
                                    case 160:
                                        if (!this.aU && this.l()) {
                                            this.Z(true);
                                        }
                                        break;
                                    case 161:
                                        aa();
                                        break;
                                    case 162:
                                        Y();
                                }

                                this.C = var5;
                            }
                        }
                    }
                }
            }
        }
    }

    private void O() {
        if (Y && Code.Code.Code >= 0) {
            Code.Code.Code = true;
            a.Code();
        } else {
            B var1;
            if ((var1 = this.Code()) != null && var1.C != 5 && !var1.I()) {
                var1.C();
            }

        }
    }

    final B Code() {
        return this.Code != null && this.Code.C <= 4 ? this.Code : this.I;
    }

    final boolean Code(e var1) {
        return var1.Code(this.U, this.N) && var1.Code(this.U + this.R, this.N + this.S);
    }

    final boolean B() {
        return this.I() != this.S;
    }

    final boolean C() {
        return this.V != this.R;
    }

    final int J() {
        return this.S;
    }

    public static void Code(Connection var0) {
        Connection var10000 = var0;

        try {
            var10000.close();
        } finally {
            return;
        }
    }

    private void S() {
        if (this.Z != null) {
            this.Z.c = false;
            this.B = false;
            this.Code(this.Z, false);
            this.Code(this.Z);
        }

    }

    private boolean l() {
        return this.Code != null && (this.Code((int)1) || I(this.Code.Code) == 165) && !this.Code.Z();
    }

    private void Z(String var1) {
        var1 = I(var1);
        boolean var2 = false;
        boolean var3 = this.Code != null && I(this.Code.Code) == 165;
        Code var10000;
        String var10001;
        if (!"".equals(var1)) {
            label57: {
                var10000 = Code.Code;
                var10001 = var1;

                try {
                    var10000.Code(Integer.parseInt(var10001));
                } catch (NumberFormatException var6) {
                    break label57;
                }

                var2 = true;
            }
        } else if (var3 && (var1 = this.Code.Z()) != null) {
            boolean var4 = true;
            if (var1.startsWith("showTab:")) {
                var1 = var1.substring(8);
            } else if (var1.startsWith("closeTab:")) {
                var1 = var1.substring(9);
            } else {
                var4 = false;
            }

            if (var4) {
                label58: {
                    var10000 = Code.Code;
                    var10001 = var1;

                    try {
                        var10000.Code(Integer.parseInt(var10001));
                    } catch (NumberFormatException var5) {
                        break label58;
                    }

                    var2 = true;
                }
            }
        }

        if (var3 && var2) {
            this.Code(true, false, (Hashtable)null);
            this.I();
            a();
        }

    }

    private void Code(Object[] var1, String var2, boolean var3, boolean var4, boolean var5, boolean var6, Hashtable var7) {
        this.N();
        this.aL = false;
        B var8;
        if ((var8 = B.Code(var1)) != null && var8.Code() && var8.Code() != this) {
            var1 = B.Code(var1);
            var8 = null;
        }

        if (!var3 && var8 != null) {
            var8.Code(this);
            var8.Code(var1);
            this.Code(var8, var6);
            this.aL = true;
            this.Code(var8);
        } else {
            this.Code(var1, var2, var4, var5, var7, (String)null);
        }
    }

    private static int I(String var0, String var1) {
        return var0 != null && var0.indexOf(47) != -1 && var1.indexOf(47) != -1 ? var0.substring(var0.indexOf(47)).compareTo(var1.substring(var1.indexOf(47))) : 0;
    }

    static int c() {
        boolean var0 = bl && Code.g > Code.h;
        if (f == 0) {
            return var0 ? 0 : e;
        } else {
            return 0;
        }
    }

    private static boolean Code(String var0) {
        String var10000 = var0;
        boolean var2 = false;

        try {
            var2 = true;
            Class.forName(var10000);
            var2 = false;
        } finally {
            if (var2) {
                return false;
            }
        }

        return true;
    }

    private static void I(Vector var0, int var1) {
        if (var0 != null) {
            Object[] var2 = Code(var0, var1);
            boolean var3;
            if ((var3 = var0 == J) && (Code((Object[])var2, (int)9) & 2) != 0) {
                Code.Code((Integer)var2[10], true);
            }

            var2[1] = "";
            var2[0] = var3 ? "www." : "";
            var2[2] = null;
            if (var3) {
                var2[10] = new Integer(0);
                var2[9] = new Integer(0);
            }

            if (Code((Object[])var2, (int)5) == 97) {
                if (!var3) {
                    var0.removeElementAt(var1);
                } else {
                    var2[5] = new Integer(83);
                }
            } else if (var0 == a) {
                var0.removeElementAt(var1);
            } else {
                var2[5] = new Integer(82);
            }

            Code(var0, true);
            Code.Code.Code(var0);
        }

    }

    public static void Code(Vector var0, boolean var1) {
        if (var0 == a) {
            C(false);
        } else {
            if (var1 && (var0 == Z || var0 == J)) {
                if (!Code.Z || var0 == Z && (Code.J & 2) != 0 || var0 == J && (Code.J & 1) != 0) {
                    ++Code.Code;
                }

                C(false);
            }

            Code(var0 == Z ? "b1" : (var0 == C ? "u" : "sp"), var0);
            if (var0 == J) {
                Code.I = true;
            }

        }
    }

    static int Code(int var0, int var1, boolean var2) {
        if (Code != null) {
            for(int var3 = Code.length - 1; var3 > 0; --var3) {
                if (Code[var3][0] == (char)var0) {
                    var0 = Code[var3].length - 1;
                    if (var2 && var0 > 1) {
                        return Code[var3][var0];
                    }

                    for(int var7 = 1; var7 < var0 && var1 != -1; ++var7) {
                        if (Code[var3][var7] == (char)var1) {
                            return Code[var3][var7 + 1];
                        }
                    }

                    if (var0 > 0) {
                        return Code[var3][1];
                    }

                    return -1;
                }
            }

            if ((Code[0][0] & 1) == 0 || var0 != 8 && (var0 < 32 || var0 > 255)) {
                if ((Code[0][0] & 2) != 0 || var0 < 32) {
                    return -1;
                } else {
                    Code var10000 = Code.Code;
                    int var10001 = var0;

                    boolean var8;
                    try {
                        String var6;
                        if ((var6 = var10000.getKeyName(var10001)).length() == 1 && Character.toLowerCase(var6.charAt(0)) == Character.toLowerCase((char)var0)) {
                            return var0;
                        }

                        if (var0 != 32) {
                            return -1;
                        }

                        var8 = var6.toLowerCase().equals("space");
                    } finally {
                        ;
                    }

                    if (!var8) {
                        return -1;
                    } else {
                        return var0;
                    }
                }
            } else {
                return var0;
            }
        } else {
            return -1;
        }
    }

    final void f() {
        this.u = this.Code.toString();
        this.Code = new char[this.Code.length()];
        this.Code.getChars(0, this.Code.length(), this.Code, 0);
        this.am = Math.min(this.am, this.Code.length());
        this.aq = Code((int)0, (String)this.u);
        this.ar = this.al == -1 ? 0 : Code((char)this.al);
        this.as = Code(0, this.Code, 0, this.am);
        this.az = this.aC + 4;
        this.at = (this.S - this.az - 7) / this.aB;
        this.au = Math.min(this.at, this.c.size());
        this.av = 2 + this.au * this.aB;
        byte[] var10000 = this.ai >= 0 && this.ai < this.c.size() - 1 ? (byte[])this.e.elementAt(this.ai) : null;
        byte[] var1 = var10000;
        if (var10000 == null) {
            this.I = this.Z;
        } else {
            this.I = Code((byte[])var1, (Object)var1);
        }

        this.aw = this.R - 10;
        this.ax = this.aQ ? this.Z.getWidth() + 5 : 2;
        this.ay = Math.max(Code('M'), this.aw / 10) + 2;
        this.an = Code(this.an, -this.as, this.aw - this.ax - this.ay - this.as - this.ar);
        this.an = Math.max(this.an, Math.min(0, this.aw - this.ax - this.ay - this.aq));
        this.aj = Code(this.aj, this.ai - this.au + 1, Code(this.ai, 0, this.c.size() - this.au));
    }

    private void a(int var1, int var2) {
        this.I(var1, var2);
        this.ag = -1;
    }

    private static int Code(Vector var0, String var1) {
        for(int var2 = 0; var2 < var0.size(); ++var2) {
            Object[] var3;
            if (!I((Object[])(var3 = Code(var0, var2)), 1) && var1.equals(var3[1])) {
                return var2;
            }
        }

        return -1;
    }

    final void J(int var1, int var2) {
        this.C = -1;
        boolean var3 = this.Code((int)16);
        var1 -= this.U;
        var2 -= this.N;
        if (var3) {
            if (this.ag == 2) {
                this.aj = Code(this.ap + (this.c.size() - this.au) * (var2 - this.ah) / (this.av - this.I(true)), 0, this.c.size() - this.au);
            } else if (this.ag == 0 && var2 > this.az && Math.abs(var2 - this.ao) > 6) {
                this.aP = true;
                this.aj = Code(this.ap - 2 * (var2 - this.ao) / this.aB, 0, this.c.size() - this.au);
            }

            a();
        } else if (this.ag == 2) {
            this.Code.I(var2 - this.ah, this.I() - this.I(false));
        } else if (this.ag == 5) {
            this.Code.Z(var1 - this.ah, this.V - this.f());
        } else {
            if (this.ag == 0) {
                this.Code.B(var1, var2);
            }

        }
    }

    private static boolean Code(Object[] var0, Vector var1) {
        String var3 = (String)var0[0];

        for(int var2 = 0; var2 < var1.size(); ++var2) {
            if (((String)((Object[])var1.elementAt(var2))[0]).equals(var3)) {
                return true;
            }
        }

        return false;
    }

    private static boolean B(int var0) {
        for(int var1 = Code.length - 1; var1 > 0; --var1) {
            if (Code[var1][0] == (char)var0) {
                if (Code[var1].length > 2) {
                    return true;
                }

                return false;
            }
        }

        return false;
    }

    private int c(int var1) {
        return var1 * this.aI / 100;
    }

    final void Z() {
        this.L();
        Vector var1;
        if ((var1 = Code.Z) != null) {
            for(int var2 = var1.size() - 1; var2 >= 0; --var2) {
                B var3;
                if ((var3 = (B)((Object[])var1.elementAt(var2))[8]) != null && var3.Code() == this) {
                    var3.Code((e)null);
                }
            }
        }

        this.C = true;
    }

    final void B() {
        if (this.ag == 0 && !this.Code((int)16)) {
            this.Code.f();
        }

    }

    private void L() {
        this.O();
        this.R();
    }

    private void N() {
        this.O();
        if (this.Code != null) {
            this.Code.i();
        }

    }

    final void b() {
        if (this.Code != null && !this.aS) {
            Code(this.Code.getGraphics(), 0, 0, this.Code.getWidth(), this.Code.getHeight(), 553648128, false);
            this.aS = true;
        }
    }

    final void C() {
        if (this.Code((int)16)) {
            if (bh) {
                Code.B = 36;
                Code.C = 10;
            } else {
                Code.B = 25;
                if (this.am > 0 && this.aq > 0) {
                    Code.C = 26;
                }
            }

            Code.a = 23;
        } else {
            Code.B = 0;
            Code.C = this.I(-1) * -19 + 23;
            Code.a = 23;
            if (this.Code != null) {
                if (this.Code.B()) {
                    Code.a = 27;
                } else if (this.Code.C()) {
                    Code.a = 29;
                } else if (this.Code.b() && !aE) {
                    Code.a = 29;
                }

                if (this.Code.J()) {
                    if (ax) {
                        Code.C = 12;
                    } else if (this.T > 0 && ((Object[])this.Code.elementAt(this.T - 1))[8] == this.Code) {
                        Code.C = 4;
                    }
                }

                if (I(60).equals(this.Code.Code)) {
                    String var1;
                    if (!I(var1 = this.Code.Z(), "cwd:") && !I(var1, "get:")) {
                        if (I(var1, "put:")) {
                            this.Code.Code = 7;
                        }
                    } else {
                        this.Code.Code = 1;
                    }
                }

                if (this.Code.Code >= 0) {
                    Code.B = this.Code.Code;
                }

                if (this.Code.I >= 0) {
                    Code.C = this.Code.I;
                }

                if (this.Code.B >= 0) {
                    Code.a = this.Code.B;
                }
            }

        }
    }

    static boolean Code(Object[] var0, int var1) {
        return (Code((Object[])var0, (int)3) & var1) != 0;
    }

    final void J(boolean var1) {
        this.c = new Vector();
        this.e = new Vector();
        String var2 = new String(this.Code);
        if (this.Code.length() > 0) {
            if (var2.indexOf(32) < 0) {
                this.Code(var2, Code.Code);
                this.Code(var2, Code.Z);
                this.Code(var2, J);
                this.Code(var2, Z);
                if (this.Code.length() == 1 && this.Code.charAt(0) == 'w') {
                    this.c.insertElementAt("www.", 0);
                    this.e.insertElementAt((Object)null, 0);
                }

                int var3 = var2.indexOf(46);
                int var4 = var2.indexOf("www.");
                if (w.length() > 0 && this.Code.charAt(this.Code.length() - 1) == '.' && (var3 != this.Code.length() - 1 || var3 < 3 || var4 == -1 || var4 == var3 - 4) && var2.indexOf(47, var3) == -1 && var2.indexOf(32) == -1) {
                    for(var3 = 0; (var4 = w.indexOf(44, var3)) != -1; var3 = var4 + 1) {
                        this.c.insertElementAt(var2 + w.substring(var3, var4), 0);
                        this.e.insertElementAt((Object)null, 0);
                    }
                }
            }

            this.c.addElement(Code((int)158, (String)this.Code.toString()));
            this.e.addElement(Code((Vector)C, (int)0)[2]);
        }

        label81: {
            e var10000;
            byte var10001;
            label43: {
                this.c.addElement(Code((int)159));
                this.e.addElement((Object)null);
                if (this.c.size() == 0) {
                    var10000 = this;
                } else {
                    if (!var1) {
                        break label81;
                    }

                    var10000 = this;
                    if (this.c.size() > 2 || this.c.size() == 2 && var2.indexOf(32) >= 0) {
                        var10001 = 0;
                        break label43;
                    }
                }

                var10001 = -1;
            }

            var10000.ai = var10001;
            this.aj = 0;
        }

        this.d = new Vector();
        this.d.setSize(this.c.size());
    }

    final void Z(int var1, int var2) {
        if (this.ag == 0) {
            if (this.Code((int)16)) {
                if (var2 - this.N < this.az && this.ao < this.az) {
                    if (!this.aO && this.c.size() != 0) {
                        if (this.ai >= 0 && this.ai < this.c.size() - 2) {
                            this.Code = new StringBuffer((String)this.c.elementAt(this.ai));
                            this.J(true);
                            this.f();
                        }
                    } else {
                        this.aO = false;
                        this.J(true);
                        this.f();
                    }

                    var2 = this.U + 4 + this.ax + this.an;

                    int var3;
                    for(var3 = 0; var3 < this.Code.length && Code(0, this.Code, 0, var3) + Code(this.Code[var3]) / 2 + var2 < var1; ++var3) {
                    }

                    this.am = var3;
                    this.ai = -1;
                    this.f();
                    a();
                    return;
                }

                if (!this.aP) {
                    var1 = (this.ao - this.az) / this.aB;
                    var2 = (var2 - this.N - this.az) / this.aB;
                    if (var1 == var2 && var2 >= 0 && var2 < this.au) {
                        if (this.ai == var2 + this.aj) {
                            this.b(-5, 0);
                        } else {
                            this.ai = var2 + this.aj;
                            this.f();
                        }
                    }

                    a();
                    return;
                }
            } else {
                this.Code.g();
            }
        }

    }

    private static String Code(String var0, int var1) {
        int var2;
        if ((var2 = var0.indexOf(46)) > 0) {
            var0 = var0.substring(0, var2) + '-' + var1 + var0.substring(var2);
        }

        return var0;
    }

    final boolean Code(boolean var1) {
        if (this.al == -1 || !var1 && System.currentTimeMillis() - this.Code < 1000L) {
            return false;
        } else {
            this.Code.insert(this.am, (char)this.al);
            ++this.am;
            this.al = -1;
            return true;
        }
    }

    static int Code(String var0) {
        int var1;
        if ((var1 = (var0 = I(var0)).indexOf(58)) != -1) {
            var0 = var0.substring(0, var1);
        }

        return Integer.parseInt(var0);
    }

    final void Code(String var1) {
        this.Code = new StringBuffer(var1);
        this.J(true);
        this.am = this.Code.length();
        this.f();
    }

    private static Image Code(int var0, boolean var1, int var2) {
        Object[] var5;
        if (var1) {
            var5 = Code.Code;
        } else {
            var5 = Code.I;
        }

        var0 = Math.max(Math.min(var0, Code.l), Code.k) - Code.k;
        Image[] var3 = (Image[])var5[var0];
        int var4 = var0;

        while(var3 == null) {
            if (var0 < var5.length - 1) {
                ++var0;
            }

            if (var4 > 0) {
                --var4;
            }

            if (var5[var0] != null) {
                var3 = (Image[])var5[var0];
            } else if (var5[var4] != null) {
                var3 = (Image[])var5[var4];
            }
        }

        return var3[var2];
    }

    final void Code(String var1, Hashtable var2) {
        if (this.Code != null) {
            this.N();
            this.Code((Object[])null, this.Code.J, false, true, var2, var1);
        }
    }

    final boolean I(int var1) {
        if (var1 == -1 && this.Code != null && this.Code.B) {
            var1 = 0;
        }

        return this.T + var1 >= 0 && this.T + var1 < this.Code.size();
    }

    private void C(int var1, int var2) {
        boolean var3 = var1 < 0;
        if (var1 == -1 && this.Code != null && this.Code.B) {
            var1 = 0;
        }

        if (!this.I(var1)) {
            if (var2 > 0) {
                Code.Code.Code(this, I(var2));
            }

        } else {
            this.O = this.T + var1;
            Object[] var4 = (Object[])this.Code.elementAt(this.O);
            this.Code(var4, (String)null, false, false, this.I, var3, (Hashtable)null);
        }
    }

    final void Code(Vector var1, int var2) {
        int var3 = this.B();
        if (var1 == Z) {
            Object[] var5;
            if (Code((Object[])(var5 = (Object[])Z.elementAt(var3)), (int)5) != 97) {
                var5[5] = new Integer(77);
                int var6 = Code((Object[])var5, (int)6);
                var5[6] = new Integer(var6 | 2);
            }

            Code(var1, var3, var3 + var2);
            if (Code.Code == null) {
                if (Code.Code != Code.I) {
                    I.I();
                }
            } else {
                Code.Code.Code = System.currentTimeMillis() + 10000L;
            }
        } else {
            Code(var1, var3, var3 + var2);
        }

        this.Code((int)(var2 > 0 ? 6 : 1), (int)0);
        this.B = true;
        this.Code(true, false, (Hashtable)null);
        Code.Code.Code(var1);
    }

    public static void Code(Vector var0) {
        if (var0.size() > 0) {
            byte[] var1 = new byte[16];

            for(int var2 = 0; var2 < var0.size(); ++var2) {
                if (Code((Object[])((Object[])var0.elementAt(var2)), (int)5) != 82) {
                    byte[] var3 = (byte[])((Object[])var0.elementAt(var2))[8];
                    if (!Code(var1, var3)) {
                        ((Object[])var0.elementAt(var2))[8] = var1;
                    }

                    var1 = (byte[])((Object[])var0.elementAt(var2))[7];
                }
            }
        }

    }

    final int C() {
        return Code(this.Code.e(), 0, this.V - 1);
    }

    final int B() {
        String var1;
        return !I(var1 = this.Code.I(), "bookmark:") && !I(var1, "speeddial:") && !I(var1, "search:") && !I(var1, "open:") ? -1 : Code(var1);
    }

    private void Code(B var1, boolean var2) {
        boolean var3 = true;
        if (var1 != null) {
            if (this.Code != var1) {
                if (this.Code == null) {
                    if (!var2) {
                        var1.I(true);
                    }
                } else {
                    this.Code.Code();
                    if (this.Code != null) {
                        Graphics var4 = this.Code.getGraphics();
                        this.ac = 0;
                        this.ad = 0;
                        Code((Graphics)var4, 0, 0, this.Code.getWidth(), this.Code.getHeight(), 16777215);
                        if (!R) {
                            this.Code.Z(var4, -this.Code.c(), -this.Code.d());
                        }

                        if (this.B) {
                            this.aN = true;
                            this.B = false;
                        } else {
                            I.I = true;
                            this.ab = this.O >= this.T && (this.T < 0 || !this.Code.B) ? this.Code.getWidth() : -this.Code.getWidth();
                            this.ae = this.ab;
                            this.af = (int)System.currentTimeMillis();
                        }
                    }

                    if (z > 0) {
                        this.aR = true;
                        this.P();
                    }

                    if (!o) {
                        Code.Code.I(false);
                    }

                    this.I(0);
                    B var10000;
                    boolean var10001;
                    if (!ax) {
                        var10000 = var1;
                        var10001 = false;
                    } else if (var1.b && !var2 && ax && !var1.Code) {
                        var10000 = var1;
                        var10001 = true;
                    } else if (var1.Code) {
                        var10000 = var1;
                        var10001 = var1.Code != null && var1.Code[4] == 1;
                    } else {
                        var10000 = var1;
                        var10001 = var1.Z();
                    }

                    var10000.I(var10001);
                    var1.e();
                    this.P = var1.c();
                    this.aa = var1.d();
                }

                var1.e();
                if (var2 && this.Code != null && I(this.Code.Code) == 73) {
                    var3 = false;
                }

                this.Code = var1;
                this.Code.J();
                I.J();
                Code.e();
            }

            if (var3) {
                e var5 = this;
                Object[] var7;
                Code.Code(var7 = this.Code.Code());
                if (!this.Code.B) {
                    if (!this.Code.I()) {
                        this.I = Code();
                        this.I[1] = this.Code.I;
                        this.I[0] = this.Code.Code;
                        this.I[2] = this.Code.Code;
                    }

                    if (this.O == this.T) {
                        var3 = false;
                        if (this.T >= 0) {
                            Object[] var9 = (Object[])this.Code.elementAt(this.T);
                            if (this.Code.I() && var9 != null && var7 != null && var9.length > 0 && var7.length > 0 && var7[0] != null && var7[0].equals(var9[0])) {
                                var3 = true;
                            }
                        }

                        if (!this.Code.Code && !var3 && this.Code.b) {
                            ++this.T;
                            this.Code.setSize(this.T + 1);
                        }

                        if (this.T > 30) {
                            this.Code.removeElementAt(0);
                            --this.T;
                        }

                        this.O = this.T;
                    }

                    this.T = this.O;
                    this.Code.setElementAt(var7, this.T);
                }

                for(int var8 = 0; var8 < var5.Code.size(); ++var8) {
                }

                for(int var6 = 0; var6 < Code.Z.size(); ++var6) {
                }
            }

            if (this.Code != null) {
                this.Code.I();
            }

        }
    }

    static void a() {
        if (R) {
            I.Code();
        } else {
            Code.Code.repaint();
        }
    }

    private void P() {
        if (z > 0 && this.Code != null && this.aR) {
            Code((Graphics)this.Code.getGraphics(), 0, 0, this.Code.getWidth(), this.Code.getHeight());
            this.aR = false;
        }
    }

    final void Code(int var1, int var2, int var3, int var4) {
        int var10000 = this.U + var1;
        int var10001 = this.N + var2;
        var1 = var4;
        var2 = var3;
        var3 = var10001;
        var4 = var10000;
        if (M) {
            var3 = Code.f - var3 - var1;
            int var5 = var4;
            int var6 = var2;
            var4 = var3;
            var3 = var5;
            var2 = var1;
            var1 = var6;
        }

        if (R) {
            I.Code(var4, var3, var2, var1);
        } else {
            Code.Code.repaint(var4, var3, var2, var1);
        }
    }

    private boolean k() {
        return !this.Code.Code((int)2) && this.Code != null && I(this.Code.Code) != 123;
    }

    private void J(Graphics var1) {
        if (this.Code != null) {
            boolean var2 = this.k();
            int var3 = this.N + 4 - this.Code.d();
            int var4 = this.Code.b() - 8;
            Code(var1, this.U, var3, this.R, var4, I[3]);
            int var8;
            int var9;
            if (!var2 || !N) {
                Graphics var5;
                int var7;
                if (var3 > 0) {
                    var5 = var1;
                    if (!s) {
                        Z(var1, this.U, this.U + this.R - 1, this.N + 3, -1);
                        if (var2) {
                            Code((Graphics)var1, this.U, this.N, 4, 4, I[3]);
                            var1.setColor(I[20]);
                            var1.drawLine(this.U, this.N - 1, this.U + 3, this.N - 1);
                        }
                    } else {
                        var7 = this.U;
                        var8 = var3 - 4 - 6;
                        var9 = this.U + this.R - 4;
                        if (!var2) {
                            var7 += 4;
                            var1.drawImage(Code.Z, this.U - 6, var8, 0);
                        }

                        for(int var6 = var7; var6 < var9; ++var6) {
                            var5.drawImage(Code.J, var6, var8, 0);
                        }

                        var5.drawImage(Code.B, var9, var8, 0);
                    }
                }

                var5 = var1;
                e var13 = this;
                if (s) {
                    for(var7 = var3; var7 < var3 + var4; ++var7) {
                        var5.drawImage(Code.a, var13.U + var13.R, var7, 0);
                    }
                } else {
                    var1.setColor(I[20]);
                    var1.drawLine(this.U + this.R, var3, this.U + this.R, var3 + var4 - 1);
                }
            }

            if (!var2 || N) {
                int var12 = var3 + var4;
                Graphics var14 = var1;
                if (!s) {
                    Z(var1, this.U, this.U + this.R - 1, var12, 1);
                    if (var2) {
                        Code((Graphics)var1, this.U + this.R - 4, var12, 4, 4, I[3]);
                        var1.setColor(I[20]);
                        var1.drawLine(this.U + this.R - 4, var12 + 4, this.U + this.R + 1, var12 + 4);
                    }
                } else {
                    var8 = this.U + 4;
                    var9 = this.U + this.R;
                    if (!var2) {
                        var9 -= 4;
                        var1.drawImage(Code.b, var9, var12, 0);
                    }

                    for(int var10 = var8; var10 < var9; ++var10) {
                        var14.drawImage(Code.c, var10, var12, 0);
                    }

                    var14.drawImage(Code.d, this.U - 6, var12, 0);
                }

                e var11 = this;
                if (s) {
                    for(var12 = var3; var12 < var3 + var4; ++var12) {
                        var1.drawImage(Code.C, var11.U - 6, var12, 0);
                    }

                    return;
                }

                var1.setColor(I[20]);
                var1.drawLine(this.U - 1, var3, this.U - 1, var12 - 1);
            }

        }
    }

    private int f() {
        return Math.max(this.V * this.V / Math.max(this.Code.a(), this.V), 5);
    }

    private static void Z(Graphics var0, int var1, int var2, int var3, int var4) {
        var0.setColor(I[20]);
        var0.drawLine(var1, var3, var2, var3);
        int var5;
        var0.drawLine(var1, var5 = var3 + var4, var2, var5);
        var0.drawLine(var1 + 1, var5 += var4, var2 - 1, var5);
        var0.drawLine(var1 + 2, var5 += var4, var2 - 2, var5);
        var0.drawLine(var1 + 4, var5 += var4, var2 - 4, var5);
        var0.setColor(I[3]);
        var0.drawLine(var1 + 1, var3, var2 - 1, var3);
        var0.drawLine(var1 + 1, var3 += var4, var2 - 1, var3);
        var0.drawLine(var1 + 2, var3 += var4, var2 - 2, var3);
        int var6;
        var0.drawLine(var1 + 4, var6 = var3 + var4, var2 - 4, var6);
    }

    private static void Code(Graphics var0, int var1, int var2, int var3, int var4, boolean var5) {
        var0.setColor(I[18]);
        var0.drawLine(var1 + 2, var2 + 1, var1 + var3, var2 + 1);
        var0.drawLine(var1 + 1, var2 + 1, var1 + 1, var2 + var4 - 1);
        Code(var0, var1 + 2, var2 + 2, var3 - 1, var4 - 2, I[19]);
        var0.setColor(I[17]);
        if (var5) {
            var0.setColor(I[17]);
            var0.drawLine(var1, var2, var1, var2 + var4);
            var0.drawLine(var1 + var3, var2, var1 + var3, var2 + var4);
        } else {
            var0.drawLine(var1 + 1, var2, var1 + var3, var2);
            var0.drawLine(var1 + 1, var2 + var4, var1 + var3, var2 + var4);
        }
    }

    private int Code(boolean var1) {
        if (var1) {
            int var10000 = this.az + 1;
            return this.aj < 0 ? var10000 : var10000 + (this.av - this.I(true)) * this.aj / (this.c.size() - this.au);
        } else {
            return this.aa * (this.I() - this.I(false)) / Math.max(Math.max(this.Code.b(), this.I()) - this.I(), 1);
        }
    }

    private int I(boolean var1) {
        return var1 ? Math.max(this.av * this.au / this.c.size(), o ? Math.max(this.av >> 3, 5) : 5) : Math.max(this.I() * this.I() / Math.max(this.Code.b(), this.I()), o ? Math.max(this.I() >> 3, 5) : 5);
    }

    private int e() {
        return this.P * (this.V - this.f()) / Math.max(Math.max(this.Code.a(), this.V) - this.V, 1);
    }

    private void B(Graphics var1) {
        I(var1, this.U, this.N, this.R, this.S);
        int var2 = this.V;
        int var3 = this.I();
        if (var2 != this.R) {
            var1.setColor(I[17]);
            var1.drawLine(this.U + var2, this.N, this.U + var2, this.N + var3 - 1);
            var1.setColor(I[22]);
            var1.drawLine(this.U + var2 + 1, this.N, this.U + var2 + 1, this.N + var3);
            var1.setColor(I[23]);
            var1.drawLine(this.U + var2 + 2, this.N, this.U + var2 + 2, this.N + var3 + 1);
            var1.setColor(I[24]);
            var1.drawLine(this.U + var2 + 3, this.N, this.U + var2 + 3, this.N + var3 + 2);
            Code(var1, this.U + var2 + 4, this.N, B - 4, var3 + 4, I[25]);
            Code(var1, this.U + var2, this.N + this.Code(false), B - 1, this.I(false), false);
            Code(var1, this.U + var2, this.N, B, var3);
        }

        if (var3 != this.S) {
            var1.setColor(I[17]);
            var1.drawLine(this.U, this.N + var3, this.U + var2, this.N + var3);
            var1.drawLine(this.U, this.N + this.S - 1, this.U + this.R, this.N + this.S - 1);
            var1.setColor(I[22]);
            var1.drawLine(this.U, this.N + var3 + 1, this.U + var2 + 1, this.N + var3 + 1);
            var1.setColor(I[23]);
            var1.drawLine(this.U, this.N + var3 + 2, this.U + var2 + 2, this.N + var3 + 2);
            var1.setColor(I[24]);
            var1.drawLine(this.U, this.N + var3 + 3, this.U + var2 + 3, this.N + var3 + 3);
            Code(var1, this.U, this.N + var3 + 4, this.R - 1, B - 5, I[25]);
            Code(var1, this.U + this.e(), this.N + var3, this.f(), B - 1, true);
            Code(var1, this.U, this.N + var3, this.R, B);
        }

        Z(var1);
    }

    static void Code(Graphics var0, int var1, int var2, int var3, int var4) {
        if (z > 0) {
            if (var3 > 0 && var4 > 0) {
                Code(var0, var1, var2, var3, var4, Code[z - 1], false);
            }
        }
    }

    final void c() {
        if (this.aS) {
            this.aN = true;
            this.aS = false;
        }

    }

    public final boolean a() {
        return this.aU && this.l();
    }

    private void Q() {
        if (this.aS) {
            this.aS = false;
            this.b();
        }

    }

    final void Code(Graphics var1) {
        if (this.Code == 2) {
            this.J(var1);
        }

        int var2;
        int var3;
        int var4;
        if (this.Code((int)32) && this.Code != null && I(this.Code.Code) == 165) {
            var3 = (var2 = B(1)) + 10;
            var4 = this.N - var3 - 1;
            I(var1, this.U, var4, this.R, var3 + 1);
            if (var1.getClipWidth() > 0) {
                String var5 = Code((int)256);
                I(var1, this.U, var4, this.R, var3, Code.Code[73], Code.Code[74]);
                var1.setColor(Code.Code[34]);
                Code(var1, 1, var5, (this.R - Code((int)1, (String)var5)) / 2, var4 + (var3 - var2) / 2, 20);
                var1.setColor(Code.Code[75]);
                var1.fillRect(this.U, var4 + var3, this.R, 1);
            }

            if (z > 0) {
                Code(var1, this.U, var4, this.R, var3 + 1, Code[z - 1], false);
            }

            Z(var1);
        }

        int var6;
        int var7;
        int var8;
        int var9;
        if (this.Code == 16) {
            var2 = this.N + this.Q;
            if (this.Code == null) {
                this.Code = new I(33);
                this.Code.Code = this;
                Code.Code.Code.schedule(this.Code, 100L, 100L);
            }

            if (this.Code.Code != null && I(this.Code.Code.Code) != 65) {
                Code(var1, this.U, var2, this.R, this.aC + 10, I[59], I[60]);
                if (Code.Code.I != null) {
                    I(var1, this.U, var2, this.R, this.S);
                    var1.drawImage(Code.Code.I, this.U, var2 + this.aC + 9, 0);
                    Z(var1);
                }
            } else {
                Code(var1, this.U, var2, this.R, this.aC + 9, I[61]);
            }

            Code(var1, this.U + 3, var2 + 5, this.aw + 4, this.aC, I[16]);
            var3 = I[7];
            var1.setColor(var3);
            var1.drawLine(this.U + 4, var2 + 5, this.U + 5 + this.aw, var2 + 5);
            var1.drawLine(this.U + 4, var2 + 4 + this.aC, this.U + 5 + this.aw, var2 + 4 + this.aC);
            var1.drawLine(this.U + 3, var2 + 5, this.U + 3, var2 + 4 + this.aC);
            var1.drawLine(this.U + 6 + this.aw, var2 + 5, this.U + 6 + this.aw, var2 + 4 + this.aC);
            var1.setColor(I[4]);
            var1.drawLine(this.U + 4, var2 + 6, this.U + 3 + this.aw + 2, var2 + 6);
            var1.setColor(I[5]);
            var1.drawLine(this.U + 4, var2 + 7, this.U + 3 + this.aw + 2, var2 + 7);
            var1.setColor(I[6]);
            var1.drawLine(this.U + 4, var2 + 8, this.U + 3 + this.aw + 2, var2 + 8);
            var3 = Math.max(0, (this.aC - this.I.getHeight()) / 2 + 1);
            var4 = (this.Z.getWidth() - this.I.getWidth()) / 2;
            if (this.aQ) {
                if (this.I == this.Z) {
                    var1.drawImage(this.I, this.U + 6, var2 + 5 + var3, 20);
                } else {
                    var1.drawImage(this.I, this.U + 6 + var4, var2 + 5 + var3, 20);
                }
            }

            if (this.al != -1) {
                var1.setColor(I[62]);
                var1.fillRect(this.U + 3 + this.ax + this.an + this.as, var2 + 8, this.ar + 2, this.aA);
                char[] var16;
                (var16 = new char[1])[0] = (char)this.al;
                var1.setColor(-16777216);
                Code(var1, 0, var16, 0, 1, this.U + 4 + this.ax + this.an + this.as, var2 + 8);
                this.aq += this.ar;
            } else if (!this.Z && !this.aO && this.ai == -1) {
                var1.setColor(I[63]);
                var1.drawLine(this.U + 4 + this.ax + this.an + this.as, var2 + 8, this.U + 4 + this.ax + this.an + this.as, var2 + 7 + this.aA);
            }

            I(var1, this.U + 4 + this.ax, var2 + 6, this.aw - this.ax + 2, this.aB + 2);
            var1.setColor(-16777216);
            if (this.ar > 0 && this.am < this.Code.length) {
                Code(var1, 0, this.Code, 0, this.am, this.U + 4 + this.ax + this.an, var2 + 8);
                Code(var1, 0, this.Code, this.am, this.Code.length - this.am, this.U + 4 + this.ax + this.an + this.as + this.ar, var2 + 8);
            } else {
                if (this.aO) {
                    Code(var1, this.U + 4 + this.ax + this.an, var2 + 8, this.aq, this.aA + 1, I[64]);
                    var1.setColor(-16777216);
                }

                Code(var1, 0, this.Code, 0, this.Code.length, this.U + 4 + this.ax + this.an, var2 + 8);
            }

            int var14;
            String var17;
            if (this.al == -1 && this.ai >= 0 && this.ai < this.c.size() - 2 && (var4 = Z(var17 = (String)this.c.elementAt(this.ai), this.u)) != -1) {
                var14 = Code((int)0, (String)var17.substring(var4 + this.Code.length()));
                Code(var1, this.U + 4 + this.ax + this.an + this.aq, var2 + 8, var14, this.aA + 1, I[64]);
                var1.setColor(-16777216);
                Code(var1, 0, var17.substring(var4 + this.Code.length()), this.U + 4 + this.ax + this.an + this.aq, var2 + 8, 20);
            }

            Z(var1);
            Code(var1, this.U, var2, this.R, this.aC + 9);
            if (this.c.size() > 0) {
                Code(var1, this.U + 3, var2 + this.az + 1, this.R - 7, this.av - 1, I[16]);
                var1.setColor(I[7]);
                var1.drawRect(this.U + 3, var2 + this.az, this.R - 7, this.av);
                if (s) {
                    var3 = this.U + 3;
                    var4 = var2 + this.az;
                    var14 = this.U + this.R - 3;
                    var6 = var4 + this.av + 1;
                    var1.drawImage(Code.e, var14, var4, 0);

                    for(var7 = var4 + 4; var7 < var6; ++var7) {
                        var1.drawImage(Code.f, var14, var7, 0);
                    }

                    var1.drawImage(Code.g, var14, var6, 0);

                    for(var7 = var3; var7 < var14; ++var7) {
                        var1.drawImage(Code.h, var7, var6, 0);
                    }

                    var1.drawImage(Code.i, var3 - 4, var6, 0);

                    for(var14 = var4 + 4; var14 < var6; ++var14) {
                        var1.drawImage(Code.j, var3 - 4, var14, 0);
                    }

                    var1.drawImage(Code.k, var3 - 4, var4, 0);
                }

                var3 = this.R - 8;
                if (this.au < this.c.size()) {
                    var3 -= B;
                    var14 = (var4 = var2 + this.az + 1) + this.av - 2;
                    var6 = this.U + this.V - 4;
                    var1.setColor(I[17]);
                    var1.drawLine(var6, var4, var6, var14);
                    var1.setColor(I[22]);
                    var1.drawLine(var6 + 1, var4, var6 + 1, var14);
                    var1.setColor(I[23]);
                    var1.drawLine(var6 + 2, var4, var6 + 2, var14);
                    var1.setColor(I[24]);
                    var1.drawLine(var6 + 3, var4, var6 + 3, var14);
                    Code(var1, var6 + 4, var4, B - 4, this.av - 1, I[25]);
                    Code(var1, var6, var2 + this.Code(true), B - 1, this.I(true) - 2, false);
                }

                var4 = Math.min(this.au, this.c.size());

                for(var14 = 0; var14 < var4; ++var14) {
                    var7 = (var6 = var2 + this.az + 1 + var14 * this.aB) + this.aB;
                    var9 = (var8 = this.U + 4) + var3 - 1;
                    if (this.ai == var14 + this.aj) {
                        var1.setColor(I[10]);
                        var1.drawLine(var8, var6, var9, var6);
                        Code(var1, var8, var6 + 1, var3, this.aB - 1, I[11], I[12]);
                        var1.setColor(I[13]);
                        var1.drawLine(var8, var7 - 1, var9, var7 - 1);
                        var1.setColor(I[14]);
                        var1.drawLine(var8, var7, var9, var7);
                        var7 = I[34];
                        if ((Code.Code[36] & 255) > 127) {
                            var7 = 16777215 - (var7 & 16777215);
                        }

                        var1.setColor(var7);
                    } else {
                        if (var14 + 1 < var4) {
                            var1.setColor(I[15]);
                            var1.drawLine(var8, var7, var9, var7);
                        }

                        var1.setColor(-16777216);
                    }

                    String var18;
                    if (this.d.elementAt(var14 + this.aj) == null) {
                        var18 = Code(0, (String)this.c.elementAt(var14 + this.aj), var3 - 1, "...");
                        this.d.setElementAt(var18, var14 + this.aj);
                    } else {
                        var18 = (String)this.d.elementAt(var14 + this.aj);
                    }

                    Code(var1, 0, var18, this.U + 6, var6 + (this.aB - this.aA) / 2, 20);
                }

                Code(var1, this.U + 3, var2 + this.az, this.R - 6, this.av + 1);
            }

        } else if (this.Code != null && this.Code.C >= 4) {
            B var12;
            synchronized(var12 = this.Code){}
            B var10000 = this.Code;

            try {
                var3 = var10000.c() - this.P;
                var4 = this.Code.d() - this.aa;
                this.P += var3;
                this.aa += var4;
                this.B(var1);
                I(var1, this.U, this.N, this.Code(), this.I());
                if (var1.getClipWidth() > 0 && var1.getClipHeight() > 0) {
                    if (this.Code != null) {
                        Graphics var13 = this.Code.getGraphics();
                        this.ac = (this.ac + var3) % this.Code.getWidth();
                        if (this.ac < 0) {
                            this.ac += this.Code.getWidth();
                        }

                        this.ad = (this.ad + var4) % this.Code.getHeight();
                        if (this.ad < 0) {
                            this.ad += this.Code.getHeight();
                        }

                        if (this.C == 117) {
                            this.aN = true;
                        }

                        if (this.aN || var3 != 0 && var4 != 0 || var4 != 0 && this.ac != 0 || var3 != 0 && this.ad != 0) {
                            this.aN = true;
                            this.aR = true;
                        } else {
                            this.Code.Code(this.ab - this.P, -this.aa);
                            var6 = var3 > 0 ? this.Code.getWidth() - var3 : 0;
                            var7 = var4 > 0 ? this.Code.getHeight() - var4 : 0;
                            var8 = var4 == 0 ? Math.abs(var3) : this.Code.getWidth();
                            var3 = var3 == 0 ? Math.abs(var4) : this.Code.getHeight();
                            if (var8 == 0) {
                                var6 = this.Code.d;
                                var7 = this.Code.e;
                                var8 = this.Code.f;
                                var3 = this.Code.g;
                            } else if (this.Code.f > 0 && this.Code.g > 0 && Code(this.Code.d, this.Code.e, this.Code.f, this.Code.g, 0, 0, this.Code.getWidth(), this.Code.getHeight())) {
                                if (this.Code.d < var6) {
                                    var8 += var6 - this.Code.d;
                                    var6 = this.Code.d;
                                }

                                var8 = Math.max(var6 + var8, this.Code.d + this.Code.f) - var6;
                                if (this.Code.e < var7) {
                                    var3 += var7 - this.Code.e;
                                    var7 = this.Code.e;
                                }

                                var3 = Math.max(var7 + var3, this.Code.e + this.Code.g) - var7;
                            }

                            var4 = this.Code.getWidth() - this.ac;
                            var9 = this.Code.getHeight() - this.ad;
                            if (var6 < var4 && var6 + var8 > var4) {
                                if (var7 < var9 && var7 + var3 > var9) {
                                    this.aN = true;
                                    this.aR = true;
                                } else {
                                    this.J(var13, var6, var7, var4 - var6, var3);
                                    this.J(var13, var4, var7, var8 - var4 + var6, var3);
                                }
                            } else if (var7 < var9 && var7 + var3 > var9) {
                                this.J(var13, var6, var7, var8, var9 - var7);
                                this.J(var13, var6, var9, var8, var3 - var9 + var7);
                            } else {
                                this.J(var13, var6, var7, var8, var3);
                            }
                        }

                        if (this.aN) {
                            this.aN = false;
                            if (this.ab > 0) {
                                this.ac = this.Code.getWidth() - this.ab;
                            } else {
                                this.ac = -this.ab;
                            }

                            this.ad = 0;
                            var13.setClip(Math.max(0, -this.ab), 0, Math.min(this.Code.getWidth(), this.Code.getWidth() - this.ab), this.Code.getHeight());
                            Code((Graphics)var13, 0, 0, this.Code.getWidth(), this.Code.getHeight(), 16777215);
                            this.Code.Z(var13, -this.P, -this.aa);
                            this.Q();
                        }

                        this.P();
                        if (this.ac != 0) {
                            var1.drawImage(this.Code, this.U - this.ac, this.N, 20);
                            I(var1, this.U + this.Code.getWidth() - this.ac, this.N, this.ac, this.I());
                            var1.drawImage(this.Code, this.U + this.Code.getWidth() - this.ac, this.N, 20);
                            Z(var1);
                        } else {
                            var1.drawImage(this.Code, this.U, this.N - this.ad, 20);
                            I(var1, this.U, this.N + this.Code.getHeight() - this.ad, this.Code(), this.ad);
                            var1.drawImage(this.Code, this.U, this.N + this.Code.getHeight() - this.ad, 20);
                            Z(var1);
                        }
                    } else {
                        this.ab = 0;
                        if (this.Code((int)1) || this.Code((int)4)) {
                            Code(var1, var1.getClipX(), var1.getClipY(), var1.getClipWidth(), var1.getClipHeight(), 16777215);
                        }

                        if (this.Code((int)40)) {
                            boolean var15 = true;
                            var4 = -637534209 & I[42];
                            if (this.Code((int)32)) {
                                var15 = false;
                                var4 = I[72];
                            }

                            if (r) {
                                Code(var1, this.U, this.N, this.Code(), this.S, var4, var15);
                            } else if (var15) {
                                I(var1, this.U, this.N, this.Code(), this.S, I[43]);
                            } else {
                                Code(var1, this.U, this.N, this.Code(), this.S, I[43]);
                            }
                        }

                        this.Code.Z(var1, this.U - this.P, this.N - this.aa);
                        this.Q();
                        if (!this.Code((int)2)) {
                            Code(var1, this.U, this.N, this.Code(), this.I());
                        }
                    }

                    this.C(var1);
                    if (this.Code((int)2)) {
                        Code(var1, this.U, this.N, this.Code(), this.I());
                    }

                    if ((this.aG >= 0 || !this.a()) && !this.a()) {
                        this.Code.Code(var1, this.U + this.ab - this.P, this.N - this.aa);
                    }
                }

                Z(var1);
            } finally {
                ;
            }

        } else if (z > 0) {
            Code(var1, this.U, this.N, this.R, this.S, f(Code[z - 1]));
        } else {
            Code(var1, this.U, this.N, this.R, this.S, 16777215);
        }
    }

    private int[] Code(int var1, int var2) {
        int[] var3 = null;
        Vector var4 = this.Code.Code();
        if ((var1 -= var2) >= 0 && var4 != null && var4.size() > 0 && var1 < var4.size()) {
            Enumeration var7 = var4.elements();

            while(var7.hasMoreElements()) {
                int[] var8 = (int[])var7.nextElement();
                if (var1 == var8[4]) {
                    var3 = new int[2];
                    var1 = var8[0] < 0 ? 0 : var8[0];
                    var2 = var8[1] < 0 ? 0 : var8[1];
                    int var5 = var8[0] < 0 ? var8[2] + var8[0] : var8[2];
                    int var6 = var8[1] < 0 ? var8[3] + var8[1] : var8[3];
                    var3[0] = var8[0] < 0 ? 0 : var1 + Math.min(Code.j, var5) / 2;
                    var3[1] = var8[1] < 0 ? 0 : var2 + Math.min(Code.i, var6) / 2;
                    if (var3[0] >= this.V) {
                        var3[0] = var1 + 1;
                    }

                    if (var3[1] >= this.I()) {
                        var3[1] = var2 + 1;
                    }
                    break;
                }
            }
        }

        return var3;
    }

    private int Code(short[] var1) {
        short var2;
        for(var2 = 0; var2 >= 0; --this.ac) {
            if (this.ac == 0) {
                this.O = this.g();
                this.ac = 8;
            }

            var2 = var1[var2 + (this.O & 1)];
            this.O >>>= 1;
        }

        return var2 & 4095;
    }

    static String I(String var0) {
        return var0.substring(var0.indexOf(58) + 1);
    }

    static void Code(int var0, String var1, boolean var2) {
        if (I[var0] == null || !I[var0].equals(var1)) {
            I[var0] = var1;
            if (var0 == 1 && var2) {
                C(false);
            }
        }

    }

    private void C(Graphics var1) {
        if (this.a()) {
            Vector var2;
            int var3 = (var2 = this.Code.Code()) == null ? 0 : var2.size();
            if (var2 != null && var3 > 0) {
                var3 = b(var3);
                this.Code.Code = 23;
                this.Code.I = 10;
                this.Code.B = 23;
                Enumeration var18 = var2.elements();

                while(var18.hasMoreElements()) {
                    int[] var4;
                    int var5 = (var4 = (int[])var18.nextElement())[0];
                    int var6 = var4[1];
                    int var7 = var4[2];
                    int var8 = var4[3];
                    int var19 = var4[4] + var3;
                    boolean var9 = false;
                    int var10 = 1;
                    int var11 = 0;
                    int var12;
                    if (var19 >= 10) {
                        var10 = 0;
                        var12 = var19;

                        while(var12 > 0) {
                            var12 /= 10;
                            ++var10;
                            if (this.aG > 0 && var12 == this.aG && !var9) {
                                var9 = true;
                                var11 = var10;
                            }
                        }
                    }

                    var12 = this.U + var5 + 2;
                    int var13 = this.N + var6;
                    int var14 = var10 * Code.j;
                    int var15 = Code.i;
                    if (var5 < 0) {
                        var12 = this.U + var5 + var7 - var14;
                    }

                    if (var6 < 0) {
                        var13 = this.N + var6 + var8 - var15;
                    }

                    int[] var21;
                    (var21 = new int[var10])[0] = 0;
                    if (var19 > 0) {
                        var6 = var19;

                        for(var7 = var10 - 1; var6 > 0; --var7) {
                            var21[var7] = var6 % 10;
                            var6 /= 10;
                        }
                    }

                    this.c(Code.j);
                    var8 = (var7 = Code(var6 = this.c(var15), true, 0).getWidth()) * var10;
                    var15 = (var14 = var10 * (Code.j - var7) / 2) * Code.i / (Code.j * var10);
                    var12 += var14;
                    var13 += var15;
                    Image var22;
                    if (!var9 && var19 != this.aG) {
                        if (this.aG < 0) {
                            for(var11 = 0; var11 < var10; ++var11) {
                                var22 = Code(var6, true, var21[var11]);
                                var1.drawImage(var22, var12 + var7 * var11, var13, 20);
                                Code(var1, var12 + var7 * var11, var13, var22.getWidth(), var22.getHeight());
                            }
                        }
                    } else {
                        var11 = var10 - var11;

                        for(var14 = 0; var14 < var11; ++var14) {
                            Image var23 = Code(var6, false, var21[var14]);
                            var1.drawImage(var23, var12 + var7 * var14, var13, 20);
                            Code(var1, var12 + var7 * var14, var13, var23.getWidth(), var23.getHeight());
                        }

                        while(var11 < var10) {
                            var22 = Code(var6, true, var21[var11]);
                            var1.drawImage(var22, var12 + var7 * var11, var13, 20);
                            Code(var1, var12 + var7 * var11, var13, var22.getWidth(), var22.getHeight());
                            ++var11;
                        }
                    }

                    if (this.aG < 0 || var9 || var19 == this.aG) {
                        if (this.aH == 255) {
                            Graphics var24 = var1;
                            if (r && !bc) {
                                var8 += var12;
                                var5 = var13 + var6 + 1;

                                for(var11 = var13 - 1; var11 < var5; ++var11) {
                                    var24.drawImage(Code.a, var8, var11, 0);
                                }

                                var24.drawImage(Code.g, var8, var5, 0);

                                for(var11 = var12 + 4; var11 < var8; ++var11) {
                                    var24.drawImage(Code.h, var11, var5, 0);
                                }

                                var24.drawImage(Code.i, var12, var5, 0);
                            }
                        }

                        var5 = 6447714 | this.aH << 24;
                        var7 = var10 * var7;
                        var1.setColor(var5);
                        var1.drawLine(var12, var13 - 1, var12 + var7 - 1, var13 - 1);
                        Code((Graphics)var1, var12, var13 - 1, var7, 1);
                        var1.drawLine(var12 + var7, var13, var12 + var7, var13 + var6 - 1);
                        Code((Graphics)var1, var12 + var7, var13, 1, var6);
                        var1.drawLine(var12, var13 + var6, var12 + var7 - 1, var13 + var6);
                        Code((Graphics)var1, var12, var13 + var6, var7, 1);
                        var1.drawLine(var12 - 1, var13, var12 - 1, var13 + var6 - 1);
                        Code((Graphics)var1, var12 - 1, var13, 1, var6);
                        var1.setColor(11447982);
                        var1.drawLine(var12 - 1, var13 - 1, var12 - 1, var13 - 1);
                        Code((Graphics)var1, var12 - 1, var13 - 1, 1, 1);
                        var1.drawLine(var12 + var7, var13 - 1, var12 + var7, var13 - 1);
                        Code((Graphics)var1, var12 + var7, var13 - 1, 1, 1);
                        var1.drawLine(var12 - 1, var13 + var6, var12 - 1, var13 + var6);
                        Code((Graphics)var1, var12 - 1, var13 + var6, 1, 1);
                        var1.drawLine(var12 + var7, var13 + var6, var12 + var7, var13 + var6);
                        Code((Graphics)var1, var12 + var7, var13 + var6, 1, 1);
                    }

                    if (this.aG == var19 && (var21 = this.Code(var3)) != null) {
                        this.a(this.U + var21[0], this.N + var21[1]);
                    }

                    if (var9 && this.aG * 10 == var19 && !this.aT && (var4 = this.Code(var19, var3)) != null) {
                        this.a(this.U + var4[0], this.N + var4[1]);
                    }
                }

                if (this.aT) {
                    if (this.aG >= 0) {
                        if (this.Code != null) {
                            Vector var20 = this.Code.Code();
                            int var16;
                            if ((var16 = this.aG - var3) >= 0 && var20 != null && var20.size() > 0 && var16 < var20.size()) {
                                this.Code.Code(var16);
                            }
                        }

                        int[] var17 = this.Code(var3);
                        this.Z(false);
                        if (var17 != null) {
                            this.I(this.U + var17[0], this.N + var17[1]);
                            this.Z(this.U + var17[0], this.N + var17[1]);
                        }
                    }

                    this.Z(false);
                    if (R) {
                        I.Code();
                        return;
                    }

                    Code.Code.repaint();
                }
            }
        }

    }

    static boolean Code(int[] var0, int var1) {
        for(int var2 = 0; var2 < var0.length; ++var2) {
            if (var0[var2] == var1) {
                return true;
            }
        }

        return false;
    }

    private static String Z(int var0) {
        return I[var0] != null ? I[var0] : "";
    }

    private static byte[] Code(byte[] var0) {
        if (var0.length < aL) {
            byte[] var1 = new byte[aL];
            System.arraycopy(var0, 0, var1, 0, var0.length);
            return var1;
        } else {
            return var0;
        }
    }

    static int Code(Object[] var0, int var1) {
        return var1 < var0.length ? (Integer)var0[var1] : 0;
    }

    private static void I(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
        I(var0, var1, var2, var3, var4);
        Code(var0, var1, var2 + 5, var3, var4 - 10, var5);
        var5 = 20;

        for(int var6 = 0; var6 < 5; ++var6) {
            var5 = var5 / 2 + 1;
            var0.drawLine(var1 + (var5 >> 1), var2 + var6, var1 + var3 - (var5 >> 1) - 1, var2 + var6);
            var0.drawLine(var1 + (var5 >> 1), var2 + var4 - var6 - 1, var1 + var3 - (var5 >> 1) - 1, var2 + var4 - var6 - 1);
        }

        Z(var0);
    }

    static String Code(String var0) {
        if ((var0 = System.getProperty(var0)) != null) {
            I(var0.getBytes());
        }

        return var0;
    }

    private void J(Graphics var1, int var2, int var3, int var4, int var5) {
        if (var2 < 0) {
            var4 += var2;
            var2 = 0;
        }

        if (var3 < 0) {
            var5 += var3;
            var3 = 0;
        }

        var2 += this.ac;
        var3 += this.ad;
        int var6 = this.ac;
        int var7 = this.ad;
        if (var2 >= this.Code.getWidth()) {
            var2 -= this.Code.getWidth();
            var6 -= this.Code.getWidth();
            var4 = Math.min(var2 + var4, this.ac) - var2;
        }

        if (var3 >= this.Code.getHeight()) {
            var3 -= this.Code.getHeight();
            var7 -= this.Code.getHeight();
            var5 = Math.min(var3 + var5, this.ad) - var3;
        }

        var2 = Math.max(var2, -this.ab);
        var1.setClip(var2, var3, var4, var5);
        if (var1.getClipWidth() > 0 && var1.getClipHeight() > 0) {
            Code((Graphics)var1, 0, 0, this.Code.getWidth(), this.Code.getHeight(), 16777215);
            this.Code.Z(var1, this.ab + var6 - this.P, var7 - this.aa);
            if (this.aS) {
                Code(var1, 0, 0, this.Code.getWidth(), this.Code.getHeight(), 553648128, false);
            }
        }

        Code(var1, var2, var3, var4, var5);
    }

    final void g() {
        if (this.e) {
            this.Code = null;
        } else {
            B var1 = this.Code;
            if (this.I != null) {
                var1 = this.I;
            }

            if (var1 != null) {
                this.Code = var1.Code();
                this.Code[8] = null;
                this.Code[2] = null;
                this.v = var1.J;
            }

            this.L();

            for(int var2 = this.Code.size() - 1; var2 >= 0; --var2) {
                ((Object[])this.Code.elementAt(var2))[8] = null;
            }

            this.I = null;
            this.Code = null;
            this.J = null;
            this.Code = null;
            this.e = true;
        }
    }

    final void B(boolean var1) {
        if (this.aV != var1) {
            this.aV = var1;
            if (this.Code((int)1)) {
                if (var1) {
                    this.K();
                    this.aN = true;
                    if (this.e && this.Code == null) {
                        this.Code((String)I(169), (String)null, (String)null);
                        if (this.Code != null && this.Code[1] != null) {
                            this.Code.I = (String)this.Code[1];
                            return;
                        }
                    }
                } else {
                    if (this.Code != null) {
                        J = this.Code;
                        this.Code = null;
                    }

                    this.I(0);
                }
            }

        }
    }

    private void B(byte[] var1, int var2, int var3) {
        for(int var4 = 0; var4 < var3; ++var4) {
            this.M = this.M + 1 & 255;
            this.af = this.Z[this.M] + this.af & 255;
            byte var5 = this.Z[this.M];
            this.Z[this.M] = this.Z[this.af];
            this.Z[this.af] = var5;
            var1[var2 + var4] ^= this.Z[this.Z[this.M] + this.Z[this.af] & 255];
        }

    }

    private e(byte[] var1, byte var2) {
        this.j = true;
        this.h = true;
        super();
        this.Z = new byte[256];

        int var6;
        for(var6 = 0; var6 < 256; ++var6) {
            this.Z[var6] = (byte)var6;
        }

        var6 = 0;
        int var3 = 0;

        for(int var4 = 0; var4 < 256; ++var4) {
            var3 = var1[var6] + this.Z[var4] + var3 & 255;
            byte var5 = this.Z[var4];
            this.Z[var4] = this.Z[var3];
            this.Z[var3] = var5;
            var6 = (var6 + 1) % 32;
        }

    }

    private int Code(byte[] var1, int var2, int var3) {
        this.U = 0;
        if (this.aa == this.af) {
            this.aa = 0;
        }

        int var10000 = var3;
        var3 = this.af - this.aa;
        int var4 = var10000;
        var3 = var10000 < var3 ? var4 : var3;
        this.ad = this.aa + var3;

        label123:
        for(var3 = this.aa; this.ad != this.aa && this.P < this.aG; this.M = this.d(2)) {
            label115:
            switch(this.M) {
                case 0:
                    this.ac = 0;
                    this.T = this.d(16);
                    this.d(16);
                    this.M = 3;
                case 3:
                    while(true) {
                        if (this.T <= 0) {
                            break label115;
                        }

                        --this.T;
                        this.Z[this.aa++] = (byte)this.g();
                        if (this.ad == this.aa) {
                            break label123;
                        }
                    }
                case 1:
                    for(var4 = 0; var4 < 144; ++var4) {
                        this.J[var4] = 8;
                    }

                    while(var4 < 256) {
                        this.J[var4] = 9;
                        ++var4;
                    }

                    while(var4 < 280) {
                        this.J[var4] = 7;
                        ++var4;
                    }

                    while(var4 < 288) {
                        this.J[var4] = 8;
                        ++var4;
                    }

                    Code(this.J, 288, this.Code);

                    for(var4 = 0; var4 < 32; ++var4) {
                        this.J[var4] = 5;
                    }

                    Code(this.J, 32, this.I);
                    this.M = 4;
                case 4:
                    if (this.o()) {
                        break label123;
                    }
                    break;
                case 2:
                    var4 = this.d(5) + 257;
                    int var5 = this.d(5) + 1;
                    int var6 = this.d(4) + 4;

                    for(int var7 = 0; var7 < 19; ++var7) {
                        int var8;
                        if (var7 < 3) {
                            var8 = var7 + 16;
                        } else if (var7 == 3) {
                            var8 = 0;
                        } else if ((var7 & 1) == 1) {
                            var8 = 7 - (var7 - 5 >>> 1);
                        } else {
                            var8 = 8 + (var7 - 4 >>> 1);
                        }

                        this.J[var8] = var7 < var6 ? (byte)this.d(3) : 0;
                    }

                    short[] var9 = new short[36];
                    Code(this.J, 19, var9);
                    Code(this.Code(var9, var4), var4, this.Code);
                    Code(this.Code(var9, var5), var5, this.I);
                    this.M = 5;
                case 5:
                    if (this.o()) {
                        break label123;
                    }
                case 6:
                default:
                    break;
                case 7:
                    return 0;
            }

            if (this.ab == 1) {
                this.M = 7;
                break;
            }

            this.ab = this.d(1);
        }

        if (var1 != null) {
            System.arraycopy(this.Z, var3, var1, var2, this.aa - var3);
        }

        return this.aa - var3;
    }

    private static void T() {
        Code = new e[]{g, h};
        I = new e[0];
        j = null;
        a = 0;
    }

    static boolean b() {
        return g == 1;
    }

    private static synchronized void Code(int param0, DataInputStream param1, boolean param2) {
        // $FF: Couldn't be decompiled
    }

    private static synchronized void I(DataOutputStream var0) {
        var0.writeInt("mini4cn.opera-mini.net".hashCode());
        var0.writeInt(a);
        var0.writeByte(I.length);

        int var1;
        e var2;
        for(var1 = 0; var1 < I.length; ++var1) {
            var2 = I[var1];
            var0.writeByte(var2.V);
            var0.writeByte(var2.R);
            var0.writeUTF(var2.r);
            var0.writeShort(var2.S);
            var0.writeShort(var2.N);
            var0.writeUTF(var2.Code);
        }

        var0.writeByte(Code.length);

        for(var1 = 0; var1 < Code.length; ++var1) {
            var2 = Code[var1];
            var0.writeUTF(var2.r);
            var0.writeUTF(var2.Code);
            var0.writeShort(var2.Q);
            var0.writeUTF(var2.d);
            var0.writeByte(var2.N);
        }

    }

    private static void Code(DataOutputStream var0, int[] var1) {
        if (var1 != null) {
            var0.writeShort(var1.length);
            var0.write(Code(var1));
        } else {
            var0.writeShort(0);
        }
    }

    static void h() {
        if (Code == null) {
            T();
        }

    }

    private static synchronized void Z(DataInputStream var0) {
        int var1 = var0.readInt();
        Code(var0.readInt(), var0, true);
        if (var1 != "mini4cn.opera-mini.net".hashCode()) {
            T();
        }

    }

    private static String B(String var0) {
        int var1 = var0.indexOf(46);
        int var2 = var0.lastIndexOf(45, var1 - 1);
        String var10000 = var0;
        int var10001 = var2;
        int var10002 = var1;
        boolean var5 = false;

        try {
            var5 = true;
            int var3;
            if ((var3 = Integer.parseInt(var10000.substring(var10001, var10002))) < -255) {
                var5 = false;
                return var0;
            }

            if (var3 >= 0) {
                var5 = false;
                return var0;
            }

            var10000 = var0.substring(0, var2) + var0.substring(var1);
            var5 = false;
        } finally {
            if (var5) {
                return var0;
            }
        }

        var0 = var10000;
        return var0;
    }

    private static void Code(DataOutputStream var0, Vector var1) {
        int var2 = var1 != null ? var1.size() : 0;
        var0.writeByte(var2);
        int var3 = 0;

        while(var3 < var2) {
            Object[] var4 = Code(var1, var3);
            var0.writeUTF((String)var4[1]);
            var0.writeUTF((String)var4[0]);
            byte[] var5;
            if ((var5 = (byte[])var4[2]) != null) {
                var0.writeShort(var5.length);
                var0.write(var5);
                ++var3;
            } else {
                var0.writeShort(0);
                ++var3;
            }
        }

    }

    private static void Code(DataInputStream var0, int var1) {
        while(var1-- > 0) {
            J(var0.readInt());
        }

    }

    static String Code(int var0, String var1) {
        return Code(Code(var0), "%s", var1);
    }

    private static e Code(int var0) {
        String var1 = null;
        String var2 = null;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        e[] var7;
        (var7 = new e[3])[0] = i;
        var7[1] = j;
        int var8 = 0;

        e var10002;
        while(true) {
            if (var8 >= I.length) {
                var10002 = null;
                break;
            }

            if (I[var8].V == var0) {
                var10002 = I[var8];
                break;
            }

            ++var8;
        }

        var7[2] = var10002;
        var8 = 0;

        for(int var9 = 0; var9 < 3; ++var9) {
            e var10;
            if ((var10 = var7[var9]) != null) {
                if (var10.r.length() != 0) {
                    var2 = var1 = var10.r;
                    var8 = var9;
                }

                if (var10.Code.length() != 0) {
                    var4 = var10.Code;
                }

                var3 = var10.R;
                var5 = var10.S;
                var6 = var10.N;
            }
        }

        if (var8 == 2) {
            var2 = B(var2);
        } else if (var0 != 0) {
            var1 = Code(var1, var0);
        }

        return new e(var0, var3, var1, var5, var6, var4, var2);
    }

    static synchronized void Code(int var0, byte[] var1) {
        try {
            DataInputStream var4 = new DataInputStream(new ByteArrayInputStream(var1));
            Code(var0, var4, false);
            C(false);
        } finally {
            return;
        }
    }

    private static e I(int var0) {
        return new e(var0, i.R, Code((String)i.r, (int)1), i.S, i.N, i.Code, i.r);
    }

    public static int Code(String var0, String var1) {
        String var10000 = var0;
        boolean var10001 = true;
        boolean var9 = false;

        try {
            var9 = true;
            Object[] var11 = Code(var10000, var10001);

            for(int var2 = 0; var2 < Code.length; ++var2) {
                e var12 = Code[var2];
                String var13 = (String)var11[0];
                String var10002 = (String)var11[1];
                int var10003 = (Integer)var11[2];
                String var3 = (String)var11[3];
                int var4 = var10003;
                String var5 = var10002;
                String var6 = var13;
                e var7 = var12;
                if (J(var12.r, var6) && J(var7.Code, var5) && (var7.Q == 0 || var4 == var7.Q) && J(var7.d, var3)) {
                    if (Code[var2].N == 255) {
                        return Code((String)var1, (String)null);
                    }

                    var12 = Code[var2];
                    var9 = false;
                    return var12.N;
                }
            }

            return 0;
        } finally {
            if (var9) {
                return 0;
            }
        }
    }

    static String I(int var0) {
        return "o:" + (char)var0;
    }

    private byte[] Code(short[] var1, int var2) {
        byte[] var3 = new byte[var2];
        int var4 = 0;

        while(true) {
            while(var4 < var2) {
                int var5;
                if ((var5 = this.Code(var1)) < 16) {
                    var3[var4++] = (byte)var5;
                } else {
                    int var6 = this.d(var5 == 18 ? 7 : var5 - 14) + 3;
                    if (var5 == 18) {
                        var6 += 8;
                    }

                    byte var7;
                    if (var5 > 16) {
                        var7 = 0;
                    } else {
                        var7 = var3[var4 - 1];
                    }

                    while(var6-- > 0) {
                        var3[var4++] = var7;
                    }
                }
            }

            return var3;
        }
    }

    static void Code(Vector var0, Object[] var1, int var2) {
        if (var0 != null) {
            if (var0 == J) {
                if ((Code((Object[])var1, (int)9) & 2) != 0) {
                    Code.Code((Integer)var1[10], true);
                }

                var1[9] = new Integer(1);
                var1[10] = new Integer(0);
            }

            if (var0 == C) {
                Code(var1);
            }

            if (var2 + 1 > var0.size()) {
                var0.setSize(var2 + 1);
            }

            var0.setElementAt(var1, var2);
            Code(var0, true);
            Code.Code.Code(var0);
        }

    }

    private int d(int var1) {
        int var2 = 0;

        for(int var3 = 0; var3 < var1; ++var3) {
            if (this.ac == 0) {
                this.O = this.g();
                this.ac = 8;
            }

            var2 |= (this.O & 1) << var3;
            this.O >>>= 1;
            --this.ac;
        }

        return var2;
    }

    private static int Z(String var0, String var1) {
        int var2 = Math.max(0, 0);
        if (var1.length() == 0) {
            return var2;
        } else {
            if (var2 <= var0.length() - var1.length()) {
                for(int var3 = var2; var3 <= var0.length() - var1.length(); ++var3) {
                    if (Code(var0, var1, var2)) {
                        return var3;
                    }
                }
            }

            return -1;
        }
    }

    private static void Code(byte[] var0, int var1, short[] var2) {
        for(int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3] = 0;
        }

        short var9 = 2;
        int var4 = 0;

        for(int var5 = 1; var5 <= 16; ++var5) {
            for(short var6 = 0; var6 < var1; ++var6) {
                if (var0[var6] == var5) {
                    int var7 = 0;
                    int var8 = var5 - 1;

                    while(var8 >= 0) {
                        if ((var4 & 1 << var8) != 0) {
                            ++var7;
                        }

                        if (var8 == 0) {
                            break;
                        }

                        if (var2[var7] == 0) {
                            var2[var7] = var9;
                            var7 = var9;
                            var9 = (short)(var9 + 2);
                            --var8;
                        } else {
                            var7 = var2[var7];
                            --var8;
                        }
                    }

                    var2[var7] = (short)(var6 | '耀');
                    ++var4;
                }
            }

            var4 <<= 1;
        }

    }

    static Object[] Code() {
        Object[] var0;
        (var0 = new Object[11])[0] = "www.";
        var0[1] = "";
        var0[3] = new Integer(0);
        var0[4] = new Integer(3);
        var0[5] = new Integer(97);
        var0[6] = new Integer(0);
        var0[7] = I();
        var0[8] = Code();
        var0[9] = new Integer(0);
        var0[10] = new Integer(0);
        return var0;
    }

    private static void g(boolean var0) {
        if (var0) {
            I = Z;
            ab();
            Code.Code.Code(I);
        }

        J = null;
        Z = null;
    }

    static void Code(String var0, int var1) {
        if (aE) {
            Integer var4 = new Integer(var1);
            if (!J.containsKey(var4) || var0 != J.get(var4)) {
                Object var2 = null;
                Object var3 = null;
                if (J.containsKey(var4)) {
                    var2 = J.get(var4);
                    Z.remove(var2);
                    J.remove(var4);
                }

                if (var0 != null) {
                    if (Z.containsKey(var0)) {
                        var3 = Z.get(var0);
                        Z.remove(var0);
                        J.remove(var3);
                    }

                    Z.put(var0, var4);
                    J.put(var4, var0);
                    if (var2 != null && var3 != null) {
                        Z.put(var2, var3);
                        J.put(var3, var2);
                    }

                }
            }
        }
    }

    private boolean n() {
        while(true) {
            if (this.T-- > 0) {
                this.Z[this.aa++] = this.Z[this.ah++];
                if (this.ah == this.af) {
                    this.ah = 0;
                }

                if (this.ad != this.aa) {
                    continue;
                }

                return true;
            }

            return false;
        }
    }

    private boolean o() {
        if (this.T > 0 && this.n()) {
            return true;
        } else {
            do {
                int var1;
                if ((var1 = this.Code(this.Code)) == 256) {
                    return false;
                }

                if (var1 > 256) {
                    var1 -= 257;
                    this.T = a[var1];
                    if (var1 > 7 && var1 != 28) {
                        this.T += this.d(var1 / 4 - 1);
                    }

                    var1 = this.Code(this.I);
                    int var2 = b[var1];
                    if (var1 > 3) {
                        var2 += this.d(var1 / 2 - 1);
                    }

                    this.ah = this.aa - var2;
                    if (this.ah < 0) {
                        this.ah += this.af;
                    }

                    if (this.n()) {
                        return true;
                    }
                } else {
                    this.Z[this.aa++] = (byte)var1;
                }
            } while(this.ad != this.aa);

            return true;
        }
    }

    static void r() {
        String var10000 = "sh";

        try {
            byte[] var0;
            if ((var0 = (byte[])Code(var10000).firstElement()) != null) {
                ByteArrayInputStream var8 = new ByteArrayInputStream(var0);
                DataInputStream var9;
                int var1 = (var9 = new DataInputStream(var8)).readUnsignedByte();
                bn |= var1 < 2;
                byte var2 = var9.readByte();

                for(int var3 = 0; var3 < var2; ++var3) {
                    String var4 = var9.readUTF();
                    int var5 = var9.readInt();
                    I.put(var4, new Integer(var5));
                }

                if (var1 < 2) {
                    Code(I);
                }
            }

        } finally {
            return;
        }
    }

    static void j() {
        if (!ba) {
            Image var0;
            if ((var0 = I(6)) != null && var0.getWidth() == 1) {
                aZ = true;
            } else {
                aZ = false;
            }
        }
    }

    static void k() {
        System.gc();
        if (aW) {
            I = Runtime.getRuntime().freeMemory() * 10L / 8L;
        } else if (!aX || I <= 0L) {
            Vector var0 = new Vector(aK);
            int var1 = 0;

            label103: {
                boolean var10001;
                try {
                    System.gc();
                } catch (Throwable var7) {
                    var10001 = false;
                    break label103;
                }

                while(true) {
                    try {
                        if (var0.size() > aK) {
                            break;
                        }

                        var0.addElement(new byte[8192]);
                    } catch (Throwable var6) {
                        var10001 = false;
                        break;
                    }

                    ++var1;
                }
            }

            System.gc();
            I = (long)((var1 << 13) + 4);
        }
    }

    static boolean Code(String var0, String var1) {
        return (var0 = Browser.Code.getAppProperty(var0)) != null && var0.toLowerCase().indexOf(var1.toLowerCase()) != -1;
    }

    static void l() {
        // $FF: Couldn't be decompiled
    }

    static synchronized void m() {
        String var10000 = "s";
        boolean var6 = false;

        int var13;
        try {
            var6 = true;
            byte[] var0;
            if ((var0 = (byte[])Code(var10000).firstElement()) == null) {
                var6 = false;
                return;
            }

            ByteArrayInputStream var8 = new ByteArrayInputStream(var0);
            DataInputStream var9;
            int var1 = (var9 = new DataInputStream(var8)).readUnsignedByte();
            bn |= var1 < 9;
            String var10;
            if (var1 < 9) {
                Code(var9, 5L);
                var9.readUTF();
                Code(var9, 6L);
                if ((var10 = var9.readUTF()).length() == 64) {
                    I[1] = var10;
                }

                Code(var9, 2147483647);
                return;
            }

            if (var1 != 9) {
                Code(var9, 2147483647);
                return;
            }

            if ((var10 = var9.readUTF()).length() >= 64) {
                Code(1, (String)var10, false);
            }

            var9.readUTF();
            aA = var9.readByte() >= 2;
            H = var9.readBoolean() * 160;
            Code(var9, 14L);
            var1 = var9.readUnsignedByte();
            bn |= var1 < 59;
            if (var1 == 58) {
                var1 = 59;
            }

            if (var1 != 59) {
                Code(var9, 2147483647);
                return;
            }

            aq = var9.readBoolean();
            l = var9.readInt();
            ap = var9.readBoolean();
            az = var9.readBoolean();
            av = var9.readBoolean();
            aw = var9.readBoolean();
            o = var9.readInt();
            p = var9.readInt();
            if ((i = var9.readInt()) < j) {
                ah = true;
            }

            k = var9.readInt();
            I = var9.readLong();
            B = var9.readLong();
            q = var9.readUTF();
            q = var9.readInt();
            q = 0;
            aM = var9.readInt();
            m = var9.readInt();
            var9.readBoolean();
            byte var11 = var9.readByte();
            r = var9.readInt();
            if (var11 == 2) {
                aB = var9.readBoolean();
                i = var9.readUTF();
            } else {
                var9.readBoolean();
                var9.readUTF();
            }

            ao = var9.readBoolean();
            var13 = var9.readByte() - 2;
            ae = (boolean)((var13 | -var13) >>> 31 ^ 1);
            var9.readByte();
            var9.readBoolean();
            Code((DataInputStream)var9, (int)8);
            var9.readLong();
            var9.readLong();
            var1 = var9.readUnsignedByte();
            Code(var9, (long)var1);
            var1 = var9.readUnsignedShort() << 2;
            Code(var9, (long)var1);
            var1 = var9.readUnsignedShort() << 2;
            Code(var9, (long)var1);
            bm = var9.readBoolean();
            ar = var9.readBoolean();
            ax = var9.readBoolean();
            K = var9.readBoolean();
            M = var9.readBoolean();
            L = var9.readBoolean();
            Code.J = var9.readUTF();
            Code.Code = var9.readInt();
            Code.I = var9.readInt();
            Code.B = var9.readBoolean();
            Code.Z = var9.readBoolean();
            Code.Z = var9.readUTF();
            Code.I = var9.readUTF();
            Code.J = var9.readUnsignedByte();
            var9.readBoolean();
            var9.readBoolean();
            var11 = var9.readByte();

            int var2;
            for(var2 = 0; var2 < var11; ++var2) {
                Code.Code.addElement(var9.readUTF());
            }

            var9.readBoolean();
            var9.readBoolean();
            var9.readBoolean();
            var9.readBoolean();
            f = var9.readInt();
            p = var9.readUTF();
            var9.readBoolean();
            var11 = var9.readByte();
            var2 = 0;

            while(true) {
                if (var2 >= var11) {
                    var9.readBoolean();
                    var9.readBoolean();
                    s = var9.readInt();
                    j = var9.readUTF();
                    ay = (boolean)(var9.readByte() & 1);
                    t = var9.readInt();
                    I = Code(var9);
                    var9.readInt();
                    var9.readBoolean();
                    var1 = var9.readUnsignedByte();

                    for(var2 = 0; var2 < var1; ++var2) {
                        var9.readUTF();
                        var9.readUTF();
                        var9.readUTF();
                        var9.readUnsignedShort();
                        var9.readUnsignedShort();
                    }

                    var13 = var9.readByte() - 1;
                    aD = (boolean)((var13 | -var13) >>> 31 ^ 1);
                    A = var9.readInt();
                    B = Code(var9);
                    Z(var9);
                    I(var9);
                    var9.readInt();
                    au = var9.readBoolean();
                    z = var9.readInt();
                    bp = var9.readBoolean();
                    u = var9.readInt();
                    v = var9.readInt();
                    byte[] var12;
                    (var12 = new byte[((var1 = var9.readByte() & 255) << 2) + 1])[0] = (byte)var1;
                    var9.readFully(var12, 1, var1 << 2);
                    Code.Z = var12;
                    w = var9.readInt();
                    Code(var9);
                    aG = var9.readBoolean();
                    d = var9.readLong();
                    b = C = var9.readLong();
                    c = a = var9.readLong();
                    g = var9.readLong();
                    x = var9.readInt();
                    y = var9.readInt();
                    var13 = var9.readInt();
                    var6 = false;
                    break;
                }

                Object[] var3;
                (var3 = new Object[3])[0] = var9.readUTF();
                var3[1] = var9.readUTF();
                byte[] var4 = new byte[var9.readShort()];
                var9.readFully(var4);
                var3[2] = var4;
                a.addElement(var3);
                ++var2;
            }
        } finally {
            if (var6) {
                return;
            }
        }

        Code.m = var13;
    }

    private static InputStream Code(String var0) {
        return Runtime.getRuntime().getClass().getResourceAsStream(var0);
    }

    static void Code(DataInputStream var0) {
        k = var0.readUTF();
        l = var0.readUTF();
        m = var0.readUTF();
        n = var0.readUTF();
        o = var0.readUTF();
    }

    private static Vector Code(DataInputStream var0) {
        byte var1 = var0.readByte();
        Vector var2 = new Vector(var1);

        for(int var3 = 0; var3 < var1; ++var3) {
            Object[] var4;
            (var4 = new Object[4])[1] = var0.readUTF();
            var4[0] = var0.readUTF();
            short var5;
            if ((var5 = var0.readShort()) > 0) {
                byte[] var6 = new byte[var5];
                var0.readFully(var6, 0, var5);
                var4[2] = var6;
            }

            var2.addElement(var4);
        }

        return var2;
    }

    private static boolean I(Object[] var0, int var1) {
        return var0 != null && var0[9] != null && (Code((Object[])var0, (int)9) & var1) != 0;
    }

    static void Code(Vector var0, Object[] var1) {
        if (var0 != null && var1 != null) {
            if (var0 == C) {
                Code(var1);
            }

            var0.addElement(var1);
            Code(var0, true);
            Code.Code.Code(var0);
        }

    }

    static void Code(DataInputStream var0, boolean var1) {
        byte var2 = var0.readByte();
        Vector var3 = new Vector();

        int var4;
        for(var4 = 0; var4 < C.size(); ++var4) {
            Object[] var5 = Code(Code(C, var4));
            if (var1 != 0 || !I((Object[])var5, 2)) {
                var3.addElement(var5);
            }
        }

        var4 = 0;

        while(var4 < var2) {
            String var8 = var0.readUTF();
            int var6;
            Object[] var7;
            if ((var6 = Code(var3, var8)) != -1) {
                var7 = Code(var3, var6);
            } else {
                var7 = Code();
            }

            var7[1] = var8;
            var7[0] = var0.readUTF();
            if (var0.readByte() != 0) {
                byte[] var9 = new byte[var0.readShort() & '\uffff'];
                var0.readFully(var9);
                var7[2] = var9;
            }

            int var10 = (var7[3] != null ? Code((Object[])var7, (int)3) : 0) | var1 * -6 + 8;
            var7[3] = new Integer(var10);
            if (var1 != 0) {
                if (var6 > 0) {
                    var3.removeElementAt(var6);
                }

                var3.setElementAt(var7, 0);
                ++var4;
            } else {
                var7[9] = new Integer(2);
                if (var6 != -1) {
                    var3.setElementAt(var7, var6);
                    ++var4;
                } else {
                    var3.addElement(var7);
                    ++var4;
                }
            }
        }

        C = var3;
        Code("u", C);
    }

    static void q() {
        if (I != null && Z == null) {
            Z = new Hashtable();
            J = new Hashtable();
            Enumeration var0 = I.keys();

            while(var0.hasMoreElements()) {
                Object var1 = var0.nextElement();
                Object var2 = I.get(var1);
                Z.put(var1, var2);
                J.put(var2, var1);
            }

        }
    }

    static boolean c() {
        return (Integer)I.get("2") == 26 && (Integer)I.get("4") == 28 && (Integer)I.get("6") == 30 && (Integer)I.get("8") == 32;
    }

    static int I(String var0) {
        return var0 != null && var0.startsWith("o:") ? var0.charAt(2) : -1;
    }

    private static void Code(Vector var0, int var1, int var2) {
        if (var0 != null) {
            Object var3 = var0.elementAt(var1);
            Object var4 = var0.elementAt(var2);
            var0.setElementAt(var3, var2);
            var0.setElementAt(var4, var1);
            Code(var0, true);
            Code.Code.Code(var0);
        }

    }

    public static boolean Code(Vector var0) {
        int var1 = Code(var0, new byte[16], true);

        for(int var2 = 0; var2 < var0.size(); ++var2) {
            if (var1 == -1) {
                return false;
            }

            Object var3 = var0.elementAt(var1);
            if (var2 != var1) {
                var0.setElementAt(var0.elementAt(var2), var1);
                var0.setElementAt(var3, var2);
            }

            var1 = Code(var0, (byte[])((Object[])var3)[7], true);
        }

        return true;
    }

    public static int Code(int var0) {
        switch(var0) {
            case 1:
                return 8593;
            case 2:
                return 8592;
            case 3:
            case 4:
            default:
                return var0;
            case 5:
                return 8594;
            case 6:
                return 8595;
        }
    }

    static void n() {
        Z = Code(true, "b1", 0);
        J = Code(true, "sp", 0);
        C = Code(true, "u", 0);
        if (Z == null) {
            Z = new Vector();
        }

        boolean var0 = false;
        if (J == null) {
            J = new Vector();
            var0 = true;
        }

        while(J.size() < 9) {
            Object[] var1;
            (var1 = Code())[5] = new Integer(83);
            J.addElement(var1);
        }

        Vector var5;
        if (C == null) {
            C = Code(false, (String)null, 67);
        } else if (bn) {
            if ((var5 = Code(false, (String)null, 67)).size() > 0) {
                C.setElementAt(var5.elementAt(0), 0);
                x = 0;
            }

            Code(C, false);
        }

        if (!bm) {
            var5 = Code(false, (String)null, 66);
            int var2 = 0;

            for(int var3 = 0; var3 < var5.size(); ++var3) {
                Object[] var4;
                if (I((String)(var4 = (Object[])var5.elementAt(var3))[0]) == -1 && !Code(var4, Z)) {
                    if (Code((Object[])var4, (int)1)) {
                        if (var0) {
                            J.setElementAt(var4, var2++);
                        }
                    } else {
                        Z.addElement(var4);
                    }
                }
            }

            Code(Z, true);
            Code(J, true);
        }

        bm = true;
        o();
        Code.Code.Code(Z);
        Code.Code.Code(J);
        Code.Code.Code(C);
    }

    static void o() {
        if (aD) {
            B.removeAllElements();
        } else {
            for(int var0 = 0; var0 < B.size(); ++var0) {
                Object[] var1;
                (var1 = (Object[])B.elementAt(var0))[3] = Code(var1, J) ? new Object() : null;
            }

        }
    }

    private static byte[] Code() {
        if (a == null) {
            a = new byte[16];

            for(int var0 = 0; var0 < 16; ++var0) {
                a[var0] = -1;
            }
        }

        return a;
    }

    private static boolean I(byte[] var0, byte[] var1) {
        if (var0.length != var1.length) {
            return false;
        } else {
            for(int var2 = 0; var2 < var0.length; ++var2) {
                if (var0[var2] != var1[var2]) {
                    return false;
                }
            }

            return true;
        }
    }

    private static boolean Code(byte[] var0, byte[] var1) {
        if (var0 != null && var1 != null) {
            for(int var2 = 0; var2 < 16; ++var2) {
                if (var0[var2] != var1[var2]) {
                    return false;
                }
            }

            return true;
        } else {
            return false;
        }
    }

    private static byte[] I() {
        byte[] var0 = new byte[16];

        for(int var1 = 0; var1 < 16; ++var1) {
            var0[var1] = (byte)Code.nextInt();
        }

        return var0;
    }

    static int Code(Vector var0, byte[] var1, boolean var2) {
        for(int var3 = 0; var3 < var0.size(); ++var3) {
            if (Code(var1, (byte[])((Object[])var0.elementAt(var3))[var2 + 7])) {
                return var3;
            }
        }

        return -1;
    }

    static void Code(StringBuffer var0, char var1, char var2) {
        for(int var3 = 0; var3 < var0.length(); ++var3) {
            if (var0.charAt(var3) == var1) {
                if (var2 == 0) {
                    var0.deleteCharAt(var3);
                    --var3;
                } else {
                    var0.setCharAt(var3, var2);
                }
            }
        }

    }

    private static boolean Code(String var0, String var1, int var2) {
        if (var2 >= 0 && var2 <= var0.length() - var1.length()) {
            for(int var3 = var1.length() - 1; var3 >= 0; --var3) {
                if (Character.toLowerCase(var0.charAt(var3 + var2)) != Character.toLowerCase(var1.charAt(var3))) {
                    return false;
                }
            }

            return true;
        } else {
            return false;
        }
    }

    private static void Code(Hashtable var0) {
        String[] var1 = new String[]{Code((int)35, (int)8595), "5", Code((int)42, (int)8593), Code((int)42, (int)8595), Code((int)42, (int)8592), Code((int)42, (int)8594)};
        int[] var2 = new int[]{29, 40, 41, 42, 43, 44};

        for(int var3 = 0; var3 < var1.length; ++var3) {
            var0.put(var1[var3], new Integer(var2[var3]));
        }

    }

    static boolean Code(Object[] var0) {
        return (var0[0].equals("www.") || var0[0].equals("")) && var0[1].equals("");
    }

    static Object[] Code(Object[] var0) {
        Object[] var1 = new Object[var0.length];
        System.arraycopy(var0, 0, var1, 0, var0.length);
        return var1;
    }

    static Image Code(byte[] var0, Object var1) {
        int var2 = -1;
        if (var0 == null || var0.length == 0 || var1 == null) {
            var1 = var0 = Code.J;
        }

        if (k) {
            if (B == null) {
                B = new Hashtable(20);
                Z = new Object[20];
            }

            Image var3;
            if ((var3 = (Image)B.get(var1)) != null) {
                return var3;
            }

            for(int var6 = 0; var6 < 20; ++var6) {
                if (Z[var6] == null) {
                    var2 = var6;
                    break;
                }
            }

            if (var2 == -1) {
                var2 = (Code.nextInt() & 2147483647) % 20;
                B.remove(Z[var2]);
            }
        }

        Object[] var7 = new Object[3];
        Image var4 = Code(var0, 0, var0.length, 256, r && !bc ? null : var7);
        if (var7[0] != null) {
            if ((Integer)var7[2] != Code.d) {
                var7[0] = Code((int[])((int[])var7[0]), (Integer)var7[1], (Integer)var7[2], Code.d, 1, true);
                var7[1] = new Integer(Code.d);
                var7[2] = new Integer(Code.d);
            }

            int[] var5;
            (var5 = new int[1])[0] = 16777215;
            var4 = Code((Object[])var7, (int[])var5, 0);
        } else if (var4.getHeight() != Code.d && !bc) {
            var4 = Code(var4, 0, Code.d, 1, true);
        }

        if (k) {
            B.put(var1, var4);
            Z[var2] = var1;
        }

        return var4;
    }

    static String Code(String var0, String var1, String var2) {
        int var3;
        return (var3 = var0.indexOf(var1)) < 0 ? var0 : var0.substring(0, var3) + var2 + var0.substring(var3 + var1.length());
    }

    private static boolean J(String var0, String var1) {
        int var2 = var0.length();
        int var3 = var1.length();
        int var4 = 0;

        char var5;
        do {
            if (var2 == var4) {
                if (var3 == var4) {
                    return true;
                }

                return false;
            }

            if ((var5 = var0.charAt(var4)) == '*') {
                String var10000 = var0.substring(var4 + 1);
                var0 = var1.substring(var4);
                var1 = var10000;
                var2 = var0.length();
                var3 = 0;

                while(!J(var1, var0.substring(var3))) {
                    if (var2 <= var3++) {
                        return false;
                    }
                }

                return true;
            }
        } while(var4 < var3 && var5 == var1.charAt(var4++));

        return false;
    }

    static void c(boolean var0) {
        if (var0) {
            aX = 0;
        } else {
            aX = (aX + 1) % 12;
        }
    }

    private static void Code(Object[] var0) {
        int var1 = (var0[3] != null ? Code((Object[])var0, (int)3) : 0) | 8;
        var0[3] = new Integer(var1);
        var0[9] = new Integer(1);
    }

    static String Code(int param0) {
        // $FF: Couldn't be decompiled
    }

    static void a(boolean var0) {
        (Z = new Hashtable()).put("#1", new Integer(0));
        Z.put("#2", new Integer(1));
        Z.put("#3", new Integer(3));
        Z.put("#4", new Integer(4));
        Z.put("#5", new Integer(5));
        Z.put("#6", new Integer(6));
        Z.put("#7", new Integer(7));
        Z.put("#8", new Integer(8));
        Z.put("#9", new Integer(9));
        Z.put("#0", new Integer(10));
        Z.put("##", new Integer(11));
        Z.put("#*", new Integer(12));
        Z.put("*1", new Integer(13));
        Z.put("*2", new Integer(14));
        Z.put("*3", new Integer(15));
        Z.put("*4", new Integer(16));
        Z.put("*5", new Integer(17));
        Z.put("*6", new Integer(18));
        Z.put("*7", new Integer(19));
        Z.put("*8", new Integer(20));
        Z.put("*9", new Integer(21));
        Z.put("*0", new Integer(22));
        Z.put("*#", new Integer(23));
        Z.put("**", new Integer(24));
        Z.put("1", new Integer(25));
        Z.put("2", new Integer(26));
        Z.put("3", new Integer(27));
        Z.put("4", new Integer(28));
        Z.put("5", new Integer(29));
        Z.put("6", new Integer(30));
        Z.put("7", new Integer(31));
        Z.put("8", new Integer(32));
        Z.put("9", new Integer(33));
        Code(Z);
        Z.put("0", new Integer(39));
        if (var0) {
            g(true);
        } else {
            J = new Hashtable();
            Enumeration var3 = Z.keys();

            while(var3.hasMoreElements()) {
                Object var1 = var3.nextElement();
                Object var2 = Z.get(var1);
                J.put(var2, var1);
            }

        }
    }

    static boolean I(String var0, String var1) {
        return var0 == null ? false : var0.startsWith(var1);
    }

    static void s() {
        Code[I(0)] = b[I(0)] = -128;
        Code[I(1)] = b[I(1)] = -128;

        int var0;
        for(var0 = 0; var0 <= 14; ++var0) {
            I(I(0), Code.Code[var0].getLabel());
            I(I(1), Code.Code[var0].getLabel());
        }

        for(var0 = 20; var0 <= 23; ++var0) {
            I(I(0), Code(var0));
            I(I(1), Code(var0));
        }

        Code[6] = b[I(0)];
        Code[7] = b[I(1)];
        b[6] = b[I(0)];
        b[7] = b[I(1)];

        for(var0 = 0; var0 < 6; ++var0) {
            Code[var0] = b[var0] = -128;
            I(var0, "Å认千I[jg");
        }

        byte[] var10000 = Code;
        var10000[6] -= b[I(0)];
        var10000 = Code;
        var10000[7] -= b[I(1)];
        var10000 = b;
        var10000[6] -= b[I(0)];
        var10000 = b;
        var10000[7] -= b[I(1)];
    }

    private static int Z(int var0, char[] var1, int var2, int var3) {
        int var4 = 0;

        for(int var5 = var2; var5 < var2 + var3; ++var5) {
            var4 += Code(var0, var1[var5]);
        }

        return var4;
    }

    static void t() {
        if (k) {
            B = new Hashtable(20);
            Z = new Object[20];
            if (f != null) {
                f.removeAllElements();
                f.setSize(23);
                return;
            }
        } else {
            B = null;
            Z = null;
            f = null;
        }

    }

    private static Image Code(int var0, int var1, int var2, int var3, int var4) {
        Image var5;
        if (k && f != null && (var5 = (Image)f.elementAt(var2)) != null) {
            return var5;
        } else {
            Image var10;
            if (var1 == 0) {
                if ((var10 = I(var0)).getHeight() != var4) {
                    var10 = Code(var10, 0, var4, 1, true);
                }
            } else {
                var1 = i[var1];
                Image var10000 = Code(var0, 0, var3, var3, var4);
                var0 = var1;
                Image var11 = var10000;
                if (var1 == 0) {
                    var10 = var11;
                } else {
                    var3 = var11.getWidth();
                    var4 = var11.getHeight();
                    int[] var12 = new int[var3];
                    int[] var6 = new int[var3 * var4];

                    for(int var7 = 0; var7 < var4; ++var7) {
                        var11.getRGB(var12, 0, var3, 0, var7, var3, 1);

                        for(int var8 = 0; var8 < var3; ++var8) {
                            int var9 = var0 == 5 ? var4 - var7 - 1 + var8 * var4 : (var0 == 6 ? var7 + var4 * (var3 - var8 - 1) : var3 * var4 - (var7 * var3 + var8) - 1);
                            var6[var9] = var12[var8];
                        }
                    }

                    if (var0 != 5 && var0 != 6) {
                        var10 = Image.createRGBImage(var6, var3, var4, true);
                    } else {
                        var10 = Image.createRGBImage(var6, var4, var3, true);
                    }
                }
            }

            if (k) {
                if (f == null) {
                    (f = new Vector(23)).setSize(23);
                }

                f.setElementAt(var10, var2);
            }

            return var10;
        }
    }

    static Image Code(Image var0, int var1, int var2, int var3, int var4, int var5) {
        if (bc) {
            return Image.createImage(var0, var1, var2, var3, var4, var5);
        } else {
            int[] var6 = new int[var3 * var4];
            var0.getRGB(var6, 0, var3, var1, var2, var3, var4);
            int var7;
            if (var5 == 6) {
                var7 = var3;
                var3 = var4;
                var4 = var7;
            }

            if (!r) {
                for(var7 = 0; var7 < var6.length; ++var7) {
                    if (var6[var7] >>> 24 != 255) {
                        var6[var7] &= 16777215;
                    }
                }
            }

            return Image.createRGBImage(var6, var3, var4, true);
        }
    }

    private static void c(int var0, int var1) {
        aO = (aO <<= var1) | var0 & (1 << var1) - 1;
        aN += var1;

        while(aN >= 8) {
            aN -= 8;
            Code.write(aO >> aN);
        }

    }

    private static int Code(char var0) {
        return Code(I(0), var0);
    }

    private static void I(int var0, String var1) {
        if (var1.length() != 0) {
            if (var0 < 6) {
                Font var2;
                int var3 = (var2 = Code[var0]).stringWidth(var1);
                int var4 = var2.charWidth(var1.charAt(0));
                int var5 = var2.getHeight() + 10;
                Image var6;
                Graphics var7 = (var6 = Image.createImage(var3, var5)).getGraphics();
                int[] var8 = new int[var3];
                Code((Graphics)var7, 0, 0, var3, var5, 16777215);
                var6.getRGB(var8, 0, 1, 0, 0, 1, 1);
                int var9 = var8[0];
                var7.setColor(0);
                var7.setFont(var2);
                var7.drawString(var1, 0, 10, 0);
                int var13 = 0;
                int var14 = 0;
                boolean var15 = false;
                boolean var10 = false;

                for(int var11 = var5 - 1; var11 >= 0; --var11) {
                    var6.getRGB(var8, 0, var3, 0, var11, var3, 1);

                    for(int var12 = 0; var12 < var3; ++var12) {
                        if (var8[var12] != var9) {
                            if (!var15) {
                                var15 = true;
                                var14 = var11 + 1 - var5;
                            }

                            var10 = var12 >= var4;
                            var13 = -var11;
                        }
                    }
                }

                if (var10) {
                    ++var13;
                }

                Code[var0] = (byte)Math.max(Code[var0], var13 + 10);
                b[var0] = (byte)Math.max(b[var0], var14);
            }
        }
    }

    static void p() {
        String var0 = Code((int)215);
        Vector var1 = new Vector();
        int var2 = var0.length();
        int var3 = 0;
        boolean var4 = false;

        while(!var4 && var3 < var2 - 1) {
            int var5;
            if ((var5 = var0.indexOf(44, var3)) != -1 && var5 < var2) {
                var1.addElement(var0.substring(var3, var5));
                var3 = var5 + 1;
            } else {
                var4 = true;
            }
        }

        int var6;
        if ((var6 = var1.size()) > 0) {
            Code = new String[var6];

            for(var2 = 0; var2 < var6; ++var2) {
                Code[var2] = (String)var1.elementAt(var2);
            }
        }

    }

    static int I(int var0, char[] var1, int var2, int var3) {
        if (Code(var0, var1, 0, var2) <= var3) {
            return var2;
        } else {
            int var4 = 0;
            int var5 = 0;

            while(var2 - var4 > 1) {
                var5 = (var2 + var4) / 2;
                if (Code(var0, var1, 0, var5) >= var3) {
                    var2 = var5;
                } else {
                    var4 = var5;
                }
            }

            if (Code(var0, var1, 0, var5) > var3) {
                var5 = var4;
            }

            return var5;
        }
    }

    static Image Code(Image var0, int var1, int var2, int var3, boolean var4) {
        var1 = var0.getHeight() - var1;
        int var5;
        int[] var6 = new int[(var5 = var0.getWidth()) * var1];
        var0.getRGB(var6, 0, var5, 0, 0, var5, var1);
        int[] var10000 = Code(var6, var5, var1, var2, var3, var4);
        return Image.createRGBImage(var10000, var10000.length / var2, var2, true);
    }

    private static boolean Code(char[] var0) {
        String var1 = new String(var0);
        char var6 = var0[0];
        Font var2;
        Image var9;
        Graphics var3 = (var9 = Image.createImage(Math.max((var2 = Font.getDefaultFont()).charWidth(var6), 1), var2.getHeight())).getGraphics();
        int[] var4 = new int[var9.getWidth() * var9.getHeight()];
        int[] var5 = new int[var9.getWidth() * var9.getHeight()];
        var3.setColor(16777215);
        var3.fillRect(0, 0, var9.getWidth(), var9.getHeight());
        var3.setColor(0);
        var3.drawChar(var6, 0, 0, 20);
        var9.getRGB(var4, 0, var9.getWidth(), 0, 0, var9.getWidth(), var9.getHeight());
        var3.setColor(16777215);
        var3.fillRect(0, 0, var9.getWidth(), var9.getHeight());
        var3.setColor(0);
        var3.drawString(var1, 0, 0, 20);
        var9.getRGB(var5, 0, var9.getWidth(), 0, 0, var9.getWidth(), var9.getHeight());
        boolean var7 = false;

        for(int var8 = 0; var8 < var5.length; ++var8) {
            if (var5[var8] != var4[var8]) {
                var7 = true;
                break;
            }
        }

        return var7;
    }

    static int[] Code(int[] var0, int var1) {
        var1 &= 16777215;

        for(int var2 = 0; var2 < var0.length; ++var2) {
            if ((var0[var2] & 16777215) == 16777215) {
                var0[var2] = var0[var2] & -16777216 | var1;
            }
        }

        return var0;
    }

    static void Code(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        if (var3 > 0 && var4 > 0) {
            int var7 = var5 >> 8 & '\uff00';
            int var8 = var5 & '\uff00';
            var5 = var5 << 8 & '\uff00';
            int var9 = ((var6 >> 8 & '\uff00') - var7) / var4;
            int var10 = ((var6 & '\uff00') - var8) / var4;
            var6 = ((var6 << 8 & '\uff00') - var5) / var4;
            var3 = var1 + var3 - 1;

            for(var4 = var2 + var4 - 1; var2 < var4; ++var2) {
                var0.setColor((var7 & '\uff00') << 8 | var8 & '\uff00' | var5 >> 8);
                var0.drawLine(var1, var2, var3, var2);
                var7 += var9;
                var8 += var10;
                var5 += var6;
            }

        }
    }

    private static void I(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        if (var3 > 0 && var4 > 0) {
            int var7 = var5 >>> 16 & '\uff00';
            int var8 = var5 >> 8 & '\uff00';
            int var9 = var5 & '\uff00';
            var5 = var5 << 8 & '\uff00';
            int var10 = ((var6 >>> 16 & '\uff00') - var7) / var4;
            int var11 = ((var6 >> 8 & '\uff00') - var8) / var4;
            int var12 = ((var6 & '\uff00') - var9) / var4;
            var6 = ((var6 << 8 & '\uff00') - var5) / var4;
            int[] var13 = new int[var4];

            for(int var14 = 0; var14 < var4; ++var14) {
                int var15 = (var7 & '\uff00') << 16 | (var8 & '\uff00') << 8 | var9 & '\uff00' | var5 >> 8;
                var13[var14] = var15;
                var7 += var10;
                var8 += var11;
                var9 += var12;
                var5 += var6;
            }

            Image var16 = Image.createRGBImage(var13, 1, var4, true);

            for(var3 += var1; var1 < var3; ++var1) {
                var0.drawImage(var16, var1, var2, 20);
            }

        }
    }

    static int C(int var0) {
        long var4 = (long)var0;
        int var2 = (int)(-40960L * var4 / 100L);
        int var3 = (int)(-21504L * var4 / 100L);
        var0 = (int)(-7680L * var4 / 100L);
        int var1 = var2 + 'ꀀ';
        var2 = var3 + '촀';
        var0 += 15872;
        return (var1 & '\uff00') << 8 | var2 & '\uff00' | var0 >> 8;
    }

    private static int f(int var0) {
        int var1 = -1;
        Image var2;
        if (r && (var2 = Image.createImage(1, 1)) != null) {
            Code((Graphics)var2.getGraphics(), 0, 0, 1, 1, -1);
            Code(var2.getGraphics(), 0, 0, 1, 1, var0, false);
            int[] var3;
            (var3 = new int[1])[0] = -1;
            var2.getRGB(var3, 0, 1, 0, 0, 1, 1);
            var1 = var3[0];
        }

        return var1;
    }

    static boolean Z(int var0) {
        return (var0 & 1) != 0;
    }

    private static boolean Z(String var0, String var1) {
        return Code(var0, var1) != null;
    }

    private static void V() {
        if (n > 0) {
            if (!au) {
                au = true;
            } else {
                au = false;
            }
        }
    }

    private static void W() {
        if (z >= 0) {
            z = (z + 1) % (Code.length + 1);
        }
    }

    private static void X() {
        l = (l + 1) % 3;
    }

    private static void Y() {
        if (!aq) {
            aq = true;
        } else {
            aq = false;
        }
    }

    static int J(int var0) {
        return B(var0) + Code[var0 + 6] + b[var0 + 6];
    }

    private static void aa() {
        if (!ar) {
            ar = true;
        } else {
            ar = false;
        }
    }

    static int Z(int var0) {
        return var0 - (m << 1);
    }

    static int I(int var0) {
        return (Code((m << 1) + var0, 0, bb * -2 + 6) & -2) + (var0 & 1);
    }

    static int B(int var0) {
        var0 = I(var0);
        return Code[var0].getHeight() + Code[var0] + b[var0];
    }

    private static int e(int var0) {
        return Code[var0].getBaselinePosition() > 0 ? Code[var0].getBaselinePosition() : Code[var0].getHeight() + b[var0];
    }

    static int Code(int var0, char[] var1, int var2, int var3) {
        var0 = I(var0);
        return !bq ? Code[var0].charsWidth(var1, var2, var3) : Z(var0, var1, var2, var3);
    }

    static int Code(int var0, String var1) {
        var0 = I(var0);
        return !bq ? Code[var0].stringWidth(var1) : Z(var0, var1.toCharArray(), 0, var1.length());
    }

    private static int Code(int var0, char var1) {
        if (bq && var1 != ' ' && var1 <= 2047) {
            if (Code[var0][var1] != -1) {
                return Code[var0][var1];
            } else {
                int var2 = Code[Code.length - 1].getHeight();
                if (B == null) {
                    B = Image.createImage(32, var2);
                }

                Graphics var3;
                (var3 = B.getGraphics()).setColor(-1);
                var3.fillRect(0, 0, 32, var2);
                var3.setColor(0);
                var3.setFont(Code[var0]);
                var3.drawChar(var1, 0, 0, 20);
                int[] var6 = new int[var2 << 5];
                B.getRGB(var6, 0, 32, 0, 0, 32, var2);
                int var4 = var6[var6.length - 1];
                int var5 = 0;

                for(var2 = (var2 << 5) - 1; var2 >= 0; --var2) {
                    if (var6[var2] != var4) {
                        var5 = Math.max(var2 & 31, var5);
                        var2 &= -32;
                    }
                }

                return Code[var0][var1] = (byte)(var5 + 2);
            }
        } else {
            return Code[var0].charWidth(var1);
        }
    }

    static void Code(Graphics var0, int var1, char[] var2, int var3, int var4, int var5, int var6) {
        var1 = I(var1);
        var0.setFont(Code[var1]);
        if (be) {
            var0.drawString(new String(var2, var3, var4), var5, var6 + Code[var1], 20);
        } else {
            var0.drawChars(var2, var3, var4, var5, var6 + Code[var1], 20);
        }
    }

    static void Code(Graphics var0, int var1, String var2, int var3, int var4, int var5) {
        var1 = I(var1);
        var0.setFont(Code[var1]);
        var0.drawString(var2, var3, var4 + Code[var1], var5);
    }

    static void b(boolean var0) {
        if (var0 || c == null || c.length != 32) {
            e var1 = new e((byte)0);
            char[] var2 = new char[]{' ', 'm', 'i', '0', 'å', 'ا', 'ן', 'Ψ', 'ю', 'І', 'ぁ', '一', '㌏'};
            Code = new J(32);
            E = bb * -55248 + 220991;

            int var3;
            int var4;
            for(var3 = 0; var3 < 6; ++var3) {
                var4 = Math.max(0, B(var3 - (m << 1)) - e(var3) - Code[var3]);
                var4 = B(var3 - (m << 1)) - var4;
                Code.write(var4);
                Code.write(B(var3 - (m << 1)));

                for(var4 = 0; var4 < var2.length; ++var4) {
                    Code.write(Code(var3, var2[var4]));
                }

                var1.Code((byte[])Code.Code(), (int)0, (int)Code.size());
                Code.reset();
            }

            Code.Code(32);
            var1.Code(Code.Code());
            if (var0) {
                for(int var11 = 0; var11 < 6; ++var11) {
                    int var12 = Math.max(0, B(var11 - (m << 1)) - e(var11) - Code[var11]);
                    int var13 = B(var11 - (m << 1)) - var12;
                    Code.write(var11);
                    Code.write(var13);
                    Code.write(var12);
                    var12 = 1;
                    var13 = var11;
                    aN = 0;
                    aP = 4;
                    aQ = 1 << aP - 1;
                    var3 = 0;
                    var4 = 2147483647;
                    int var5 = 0;
                    int[] var6 = new int[]{1, 31, 2043, 2303, 7037, 7423, 12353, 12543, 13312, 19903, 19968, 40895, 42183, 42751, 55296, 64255, 65536};
                    int var7 = 0;

                    while(true) {
                        while(var12 <= 65535) {
                            int var8 = Code(var13, (char)(var12++));
                            ++F;
                            int var9 = var8 - var3;
                            var3 = var8;
                            var8 = Math.abs(var9);
                            if (var9 == var4 && var12 - 1 != var6[var7]) {
                                ++var5;
                            } else {
                                if (var5 > 0) {
                                    if (var5 < 4) {
                                        for(int var10 = 0; var10 < var5; ++var10) {
                                            c(var4, aP);
                                        }

                                        var5 = 0;
                                    } else {
                                        c(aQ, aP);
                                        if (var5 <= 1 << (aP << 1) - 1) {
                                            c(var5, aP << 1);
                                            var5 = 0;
                                        } else {
                                            c(2, aP << 1);
                                            c(var5, 16);
                                            var5 = 0;
                                        }
                                    }
                                }

                                while(var8 >>> aP - 1 != 0) {
                                    c(aQ, aP);
                                    c(1, aP << 1);
                                    ++aP;
                                    aQ = 1 << aP - 1;
                                }

                                c(var9, aP);
                                if (var12 - 1 == var6[var7]) {
                                    var9 = 0;
                                    c(0, aP);
                                    var5 = var6[var7 + 1] - var6[var7] - 1;
                                    var12 = var6[var7 + 1] + 1;
                                    var7 += 2;
                                }

                                var4 = var9;
                            }
                        }

                        if (var5 > 0) {
                            c(aQ, aP);
                            c(2, aP << 1);
                            c(var5, 16);
                        }

                        c(aQ, aP);
                        c(3, aP << 1);
                        if (aN != 0) {
                            Code.write(aO << 8 - aN);
                        }
                        break;
                    }
                }
            }

            c = Code.toByteArray();
            Code = null;
            F = -1;
        }
    }

    private static Object[] Code(String var0, boolean var1) {
        String var2 = "";

        for(var0 = var0.toLowerCase(); var0.startsWith("<"); var0 = var0.substring(var0.indexOf(62) + 1)) {
        }

        int var3;
        String var4;
        if ((var3 = var0.indexOf(58)) != -1 && (var4 = var0.substring(0, var3)).indexOf(46) == -1) {
            var0 = var0.substring(var3 + 1);
        } else {
            var4 = "http";
        }

        Integer var6;
        String var7;
        if (!C.containsKey(var4)) {
            var7 = "";
            var6 = Code;
        } else {
            if (var0.startsWith("//")) {
                var0 = var0.substring(2);
            }

            if ((var3 = var0.indexOf(63)) != -1) {
                var2 = var0.substring(var3);
                var0 = var0.substring(0, var3);
            }

            int var5;
            if ((var5 = var0.indexOf(47)) != -1) {
                var7 = var0.substring(0, var5);
                var0 = var0.substring(var5);
            } else {
                var7 = var0;
                var0 = "";
            }

            if ((var5 = var7.indexOf(64)) != -1) {
                var7 = var7.substring(var5 + 1);
            }

            if (var1 && var7.startsWith("www.")) {
                var7 = var7.substring(4);
            }

            if ((var5 = var7.indexOf(58)) != -1) {
                var6 = Integer.valueOf(var7.substring(var5 + 1));
                var7 = var7.substring(0, var5);
            } else {
                var6 = (Integer)C.get(var4);
            }
        }

        return new Object[]{var4, var7, var6, var0, var2};
    }

    public static Image Code(Object[] var0, int[] var1, int var2) {
        if (var0.length != 3) {
            return null;
        } else {
            int var3 = (Integer)var0[1];
            int var4 = (Integer)var0[2];
            int[] var13 = (int[])var0[0];
            int[] var5 = new int[var3 * var4];

            label42:
            for(int var6 = 0; var6 < var4; ++var6) {
                int var7 = Code(var6 + var2 + var1.length - var4 - 1, 0, var1.length - 1);
                int var8 = 0;

                while(true) {
                    while(true) {
                        if (var8 >= var3) {
                            continue label42;
                        }

                        int var9 = var6 * var3 + var8;
                        int var10 = (var13[var9] >>> 24) + 1;
                        int var11 = 16711680;
                        if (var10 > 4) {
                            for(int var12 = 0; var12 < 3; ++var12) {
                                var5[var9] |= var10 * (var13[var9] & var11) + (256 - var10) * (var1[var7] & var11) >>> 8 & var11;
                                var11 >>= 8;
                            }

                            ++var8;
                        } else if (var10 > 252) {
                            var5[var9] = var13[var9];
                            ++var8;
                        } else {
                            var5[var9] = var1[var7];
                            ++var8;
                        }
                    }
                }
            }

            return Image.createRGBImage(var5, var3, var4, false);
        }
    }

    static int[] Code(Image var0) {
        int var1 = var0.getHeight();
        int var2 = var0.getWidth();
        int[] var3 = new int[var1 * var2];
        var0.getRGB(var3, 0, var2, 0, 0, var2, var1);
        return var3;
    }

    static void Code(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
        var0.setColor(var5);
        if (bd) {
            I(var0, var1, var2, var3, var4);
            var1 = var0.getClipX();
            var2 = var0.getClipY();
            var3 = var0.getClipWidth();
            if ((var4 = var0.getClipHeight()) > 0 && var3 > 0) {
                var0.fillRect(var1, var2, var3, var4);
                var0.drawLine(var1, var2 + var4 - 1, var1 + var3 - 1, var2 + var4 - 1);
            }

            Z(var0);
        } else {
            var0.fillRect(var1, var2, var3, var4);
        }
    }

    static void Code(InputStream var0, long var1) {
        while(var1 > 0L) {
            var1 -= var0.skip(var1);
        }

    }

    static Image Code(byte[] var0, int var1, int var2, int var3, Object[] var4) {
        Image var5 = null;
        byte var6 = 0;
        int var28 = var6 + 1;

        while(true) {
            label548: {
                int var10000;
                boolean var10001;
                if (bf && var1 != 0) {
                    var10000 = var2;

                    try {
                        byte[] var7 = new byte[var10000];
                        System.arraycopy(var0, var1, var7, 0, var2);
                        var0 = var7;
                        var1 = 0;
                    } catch (Throwable var27) {
                        var10001 = false;
                        break label548;
                    }
                }

                try {
                    if (var0[var1] == 82 || var0[var1] == 67) {
                        byte[] var37 = var0;
                        int var38 = var1 + 1;

                        try {
                            byte var31 = var37[var38];
                            byte var32 = var0[var1 + 2];
                            int[] var33 = new int[var31 * var32];
                            int var10 = var1 + 3;
                            int var35;
                            if (var0[var1] == 82) {
                                for(var35 = 0; var35 < var31 * var32; var10 += 4) {
                                    var33[var35] = ((var0[var10] & 255) << 24) + ((var0[var10 + 1] & 255) << 16) + ((var0[var10 + 2] & 255) << 8) + (var0[var10 + 3] & 255);
                                    ++var35;
                                }
                            } else {
                                byte[] var34 = new byte[var31 * var32 << 1];
                                e var11;
                                (var11 = new e(var34)).C(var0, var1 + 3, var2 - 3);
                                var11.Code((byte[])null, (int)0, (int)var34.length);

                                for(var35 = 0; var35 < var31 * var32 << 1; ++var35) {
                                    int var12 = (var34[var35] & 240) >>> 4 | var34[var35] & 240;
                                    int var13 = (var34[var35] & 15) << 4 | var34[var35] & 15;
                                    ++var35;
                                    int var14 = (var34[var35] & 240) >>> 4 | var34[var35] & 240;
                                    int var15 = (var34[var35] & 15) << 4 | var34[var35] & 15;
                                    var33[var35 >> 1] = (var12 << 24) + (var13 << 16) + (var14 << 8) + var15;
                                }
                            }

                            if (var4 != null && var4.length == 3) {
                                var4[0] = var33;
                                var4[1] = new Integer(var31);
                                var4[2] = new Integer(var32);
                                return null;
                            }

                            return Image.createRGBImage(var33, var31, var32, true);
                        } finally {
                            return null;
                        }
                    }

                    if (!aZ && var0[var1] != -119) {
                        d var29 = new d();
                        if (var3 == 256) {
                            if (var29.Code(var0, var1, var2, 0, false) == 0 && var29.Code != 0 && var29.I != 0) {
                                var5 = Image.createRGBImage(var29.Code, var29.Code, var29.I, false);
                            }
                        } else {
                            if (ah) {
                                return null;
                            }

                            int var8;
                            for(var8 = 3; 256 >> var8 <= var3; --var8) {
                            }

                            int var9;
                            if (((var9 = var29.Code(var0, var1, var2, var8, true)) & -65536) >> var8 + 16 == 0 || (var9 & '\uffff') >> var8 == 0) {
                                return null;
                            }

                            if (var29.Code(var0, var1, var2, var8, false) == 0) {
                                int var30;
                                int[] var36 = Code((int[])var29.Code, var29.Code, var29.I, var30 = (var29.Z * var3 << 8) + '\uffff' >> 16, 1, false);
                                var5 = Image.createRGBImage(var36, var36.length / var30, var30, true);
                            }
                        }
                    } else {
                        var5 = Image.createImage(var0, var1, var2);
                        if (var3 != 256) {
                            if (y || u || ah) {
                                return null;
                            }

                            var5 = Code(var5, 0, (var5.getHeight() * var3 << 8) + '\uffff' >> 16, 1, (boolean)((var0[var1] - -119 | -(var0[var1] - -119)) >>> 31 ^ 1));
                        }
                    }

                    if (var5 == null) {
                        break label548;
                    }

                    var10000 = var5.getHeight();
                } catch (Throwable var26) {
                    var10001 = false;
                    break label548;
                }

                if (var10000 == 0) {
                    var5 = null;
                }
            }

            if (var5 != null || var28 >= 2) {
                return var5;
            }

            Code.Code.C(((var28 - 1 | -(var28 - 1)) >>> 31) * 3);
            ++var28;
        }
    }

    static int[] Code(int[] var0, int var1, int var2, int var3, int var4, boolean var5) {
        int var6 = Math.max(1, var1 * var3 / var2);
        int var7 = (var2 << 8) / var3;
        int[] var8 = new int[var6 * var3];

        for(int var9 = 0; var9 < var3; ++var9) {
            int var10 = Math.min(var9 * var7 / 256, var2);
            int var11 = var9 * var7 - (var10 << 8);

            for(int var12 = 0; var12 < var6; ++var12) {
                int var13 = Math.min(var12 * var7 / 256, var1);
                int var14 = var6 * var9 + var12;
                if (var4 == 1) {
                    int var15 = var12 * var7 - (var13 << 8);
                    int var16 = Math.min(var13 + 1, var1 - 1);
                    int var17 = Math.min(var10 + 1, var2 - 1);
                    int var18 = var0[var1 * var10 + var13];
                    int var19 = var0[var1 * var10 + var16];
                    var13 = var0[var1 * var17 + var13];
                    var16 = var0[var1 * var17 + var16];
                    var8[var14] = 0;
                    if (var5) {
                        var17 = 24;
                    } else {
                        var17 = 16;
                    }

                    while(var17 >= 0) {
                        var8[var14] += ((var18 >> var17 & 255) * (255 - var15) * (255 - var11) + (var19 >> var17 & 255) * var15 * (255 - var11) + (var13 >> var17 & 255) * (255 - var15) * var11 + (var16 >> var17 & 255) * var15 * var11) / '︁' << var17;
                        var17 -= 8;
                    }
                } else {
                    var8[var14] = var0[var1 * var10 + var13];
                }

                if (!var5) {
                    var8[var14] |= -16777216;
                }
            }
        }

        return var8;
    }

    static void I(Graphics var0, int var1, int var2, int var3, int var4) {
        if (br) {
            int[] var5;
            (var5 = new int[4])[0] = aR;
            var5[1] = aS;
            var5[2] = aT;
            var5[3] = aU;
            Code.push(var5);
        }

        br = true;
        aR = var0.getClipX();
        aS = var0.getClipY();
        aT = var0.getClipWidth();
        aU = var0.getClipHeight();
        Graphics var10000 = var0;
        int var10001 = var1;
        int var9 = var4;
        var1 = var3;
        var3 = var10001;
        Graphics var10 = var10000;
        int var11 = var10000.getClipX();
        int var6 = var10.getClipY();
        int var7 = var10.getClipWidth();
        int var8 = var10.getClipHeight();
        if (Code(var3, var2, var1, var9, var11, var6, var7, var8)) {
            var10.setClip(Math.max(var3, var11), Math.max(var2, var6), var3 < var11 ? (var3 + var1 > var11 + var7 ? var7 : var3 + var1 - var11) : (var11 + var7 > var3 + var1 ? var1 : var11 + var7 - var3), var2 < var6 ? (var2 + var9 > var6 + var8 ? var8 : var2 + var9 - var6) : (var6 + var8 > var2 + var9 ? var9 : var6 + var8 - var2));
        } else {
            var10.setClip(0, 0, 0, 0);
        }
    }

    private static String C(String var0) {
        StringBuffer var1;
        (var1 = new StringBuffer()).ensureCapacity(var0.length());

        int var2;
        while((var2 = var0.indexOf(37)) >= 0) {
            var1.append(var0.substring(0, var2)).append((char)Integer.parseInt(var0.substring(var2 + 1, var2 + 3), 16));
            var0 = var0.substring(var2 + 3, var0.length());
        }

        return var1.append(var0).toString();
    }

    private static byte[] Code(String var0) {
        byte[] var1 = new byte[var0.length() / 2];

        for(int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = (byte)Integer.parseInt(var0.substring(var2 << 1, (var2 << 1) + 2), 16);
        }

        return var1;
    }

    private static int Code(RecordStore var0, byte[] var1) {
        var1 = Code(var1);
        return var0.addRecord(var1, 0, var1.length);
    }

    static void Z(Graphics var0) {
        if (br) {
            br = false;
            var0.setClip(aR, aS, aT, aU);
        } else {
            int[] var1 = (int[])Code.pop();
            var0.setClip(var1[0], var1[1], var1[2], var1[3]);
        }
    }

    static boolean Code(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        return var0 < var4 + var6 && var0 + var2 > var4 && var1 < var5 + var7 && var1 + var3 > var5;
    }

    static boolean I(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        return var0 <= var4 && var0 + var2 >= var4 + var6 && var1 <= var5 && var1 + var3 >= var5 + var7;
    }

    static Image I(int var0) {
        int var10000 = var0;

        try {
            byte[] var2;
            if ((var2 = Code(var10000)).length == 0) {
                return null;
            } else {
                return var2[0] == 67 ? Code(var2, 0, var2.length, 256, (Object[])null) : Image.createImage(var2, 0, var2.length);
            }
        } catch (Exception var1) {
            return null;
        }
    }

    static byte[] Code(int var0) {
        DataInputStream var1 = null;
        boolean var23 = false;

        DataInputStream var10000;
        byte[] var2;
        label201: {
            try {
                var23 = true;
                var1 = new DataInputStream(Code((var0 & 64) == 0 ? "/t" : "/v"));
                var2 = new byte[var0 = Code(var0, var1)];
                var1.readFully(var2, 0, var0);
                var23 = false;
                break label201;
            } catch (Exception var27) {
                var23 = false;
            } finally {
                if (var23) {
                    var10000 = var1;

                    try {
                        var10000.close();
                    } finally {
                        ;
                    }

                }
            }

            var10000 = var1;

            try {
                var10000.close();
                return null;
            } finally {
                return null;
            }
        }

        byte[] var29 = var2;
        var10000 = var1;

        try {
            var10000.close();
            return var29;
        } finally {
            return var2;
        }
    }

    static void I(String var0) {
        String var10000 = var0;

        try {
            RecordStore.deleteRecordStore(var10000);
        } catch (RecordStoreException var1) {
        }
    }

    public static void Code(InputStream var0) {
        InputStream var10000 = var0;

        try {
            var10000.close();
        } finally {
            return;
        }
    }

    public static void Code(OutputStream var0) {
        OutputStream var10000 = var0;

        try {
            var10000.close();
        } finally {
            return;
        }
    }

    static String Code(long var0) {
        if (var0 < 1024L) {
            return var0 + " B";
        } else {
            var0 /= 1024L;
            return var0 + " kB";
        }
    }

    private static void Code(StringBuffer var0, char var1) {
        var0.append('%');
        if (var1 < 16) {
            var0.append('0');
        }

        var0.append(Integer.toHexString(var1));
    }

    private static int[] Code(DataInputStream var0) {
        int var1;
        if ((var1 = var0.readUnsignedShort()) == 0) {
            return null;
        } else {
            byte[] var2 = new byte[var1 << 2];
            var0.readFully(var2);
            return Code((byte[])var2, (int)0, (int)var2.length);
        }
    }

    private static byte[] Code(int[] var0) {
        byte[] var1;
        int var2 = (var1 = new byte[var0.length << 2]).length;

        while(true) {
            --var2;
            if (var2 < 0) {
                return var1;
            }

            var1[var2] = (byte)(var0[var2 / 4] >> 8 * (3 - var2 % 4));
        }
    }

    private static int[] Code(byte[] var0, int var1, int var2) {
        int[] var4;
        int var3 = (var4 = new int[var2 / 4]).length;

        while(true) {
            --var3;
            if (var3 < 0) {
                return var4;
            }

            var4[var3] = var0[var1 + (var3 << 2)] << 24 | (var0[var1 + (var3 << 2) + 1] & 255) << 16 | (var0[var1 + (var3 << 2) + 2] & 255) << 8 | var0[var1 + (var3 << 2) + 3] & 255;
        }
    }

    static String I(byte[] var0, int var1) {
        var1 = Math.min(var1, 128);
        StringBuffer var2 = new StringBuffer();

        for(int var3 = 0; var3 < var1; ++var3) {
            if ((var0[var3] & 255) < 16) {
                var2.append('0');
            }

            var2.append(Integer.toString(var0[var3] & 255, 16));
        }

        return var2.toString();
    }

    private static synchronized Vector Code(String var0) {
        RecordStore var1 = null;
        Vector var2 = new Vector();
        String var10000 = var0;
        boolean var10001 = false;

        RecordStore var26;
        label215: {
            int var3;
            int var23;
            try {
                (var1 = RecordStore.openRecordStore(var10000, var10001)).getSizeAvailable();
                if ("s".equals(var0)) {
                    RecordEnumeration var24 = var1.enumerateRecords((RecordFilter)null, (RecordComparator)null, false);
                    var3 = -1;
                    int var25 = var24.numRecords();

                    for(int var5 = 0; var5 < var25; ++var5) {
                        int var6 = var24.nextRecordId();
                        var3 = Math.max(var3, var6);
                    }

                    var2.addElement(var1.getRecord(var3));
                    break label215;
                }

                var23 = var1.getNumRecords();
                var3 = 1;
            } catch (Throwable var22) {
                var10001 = false;
                break label215;
            }

            label212:
            while(true) {
                while(true) {
                    try {
                        if (var3 > var23) {
                            break label212;
                        }

                        var26 = var1;
                        int var27 = var3;

                        try {
                            byte[] var4 = var26.getRecord(var27);
                            var2.addElement(var4);
                            break;
                        } catch (RecordStoreException var20) {
                        }
                    } catch (Throwable var21) {
                        var10001 = false;
                        break label212;
                    }

                    ++var3;
                }

                ++var3;
            }
        }

        var26 = var1;

        try {
            var26.closeRecordStore();
            return var2;
        } finally {
            return var2;
        }
    }

    public static Image Code(DataInputStream param0) {
        // $FF: Couldn't be decompiled
    }

    private static int Code(int var0, DataInputStream var1) {
        Code(var1, (long)(4 * (var0 & 63)));
        var0 = var1.readInt();
        int var2 = var1.readInt() + 4 - var0;
        Code(var1, (long)var0);
        return var2;
    }

    private static synchronized boolean Code(String var0, byte[] var1, Vector var2, boolean var3) {
        RecordStore var4 = null;
        boolean var5 = true;
        String var10000 = "s";
        String var10001 = var0;

        label273: {
            label272: {
                int var23;
                boolean var28;
                try {
                    if (var10000.equals(var10001) && (!aY || var3)) {
                        var23 = Code(var4 = RecordStore.openRecordStore(var0, true), var1);
                        RecordEnumeration var24;
                        int var25 = (var24 = var4.enumerateRecords((RecordFilter)null, (RecordComparator)null, false)).numRecords();
                        int var26 = 0;

                        while(true) {
                            if (var26 >= var25) {
                                break label273;
                            }

                            int var6;
                            if ((var6 = var24.nextRecordId()) != var23) {
                                var4.deleteRecord(var6);
                            }

                            ++var26;
                        }
                    }

                    var10000 = var0;

                    try {
                        RecordStore.deleteRecordStore(var10000);
                    } catch (RecordStoreException var20) {
                    }

                    var4 = RecordStore.openRecordStore(var0, true);
                    if (var1 != null) {
                        Code(var4, var1);
                        break label273;
                    }

                    if (var2 == null) {
                        break label273;
                    }

                    var23 = 0;
                } catch (Throwable var22) {
                    var28 = false;
                    break label272;
                }

                while(true) {
                    try {
                        if (var23 >= var2.size()) {
                            break label273;
                        }

                        var1 = (byte[])var2.elementAt(var23);
                        Code(var4, var1);
                    } catch (Throwable var21) {
                        var28 = false;
                        break;
                    }

                    ++var23;
                }
            }

            var5 = false;
        }

        RecordStore var27 = var4;

        try {
            var27.closeRecordStore();
            return var5;
        } finally {
            return false;
        }
    }

    static synchronized int Code(int param0, byte[] param1, String param2) {
        // $FF: Couldn't be decompiled
    }

    static void Code(long var0, long var2, long var4) {
        C += var0;
        a += var2;
        g += var4;
    }

    static Vector Code(boolean param0, String param1, int param2) {
        // $FF: Couldn't be decompiled
    }

    static void Code(int param0, String param1) {
        // $FF: Couldn't be decompiled
    }

    static byte[] Code(int var0, String var1) {
        RecordStore var2 = null;
        String var10000 = var1;
        boolean var10001 = true;
        boolean var12 = false;

        byte[] var17;
        try {
            var12 = true;
            var17 = (var2 = RecordStore.openRecordStore(var10000, var10001)).getRecord(var0);
            var12 = false;
        } finally {
            if (var12) {
                RecordStore var19 = var2;

                try {
                    var19.closeRecordStore();
                    return null;
                } finally {
                    return null;
                }
            }
        }

        byte[] var16 = var17;
        RecordStore var18 = var2;

        try {
            var18.closeRecordStore();
            return var16;
        } finally {
            return var16;
        }
    }

    static Image Code(int var0) {
        return Code(var0, 0, Code.d);
    }

    static Image Code(int var0, boolean var1) {
        if (var1) {
            if (var0 < 4) {
                var0 += 4;
            } else {
                var0 -= 4;
            }
        }

        return Code(-(var0 < 4 ? 1 : 0) + 102, var0 % 4, var0 + 15, 15 + (var0 < 4 ? 0 : 4), Code.d);
    }

    static Image Code(int var0, int var1, int var2) {
        return Code(var0 + G, var1, var0 - 89 + var1 * 3, var0 - 89, var2);
    }

    static Image Code() {
        return Code(92 + aX % 3, aX / 3, Code.d);
    }

    static boolean Code(char var0) {
        switch(var0) {
            case '←':
            case '↑':
            case '→':
            case '↓':
                return false;
            default:
                return true;
        }
    }

    static int Code(char var0, int var1) {
        byte var2 = 0;
        switch(var0) {
            case '←':
                var2 = 3;
                break;
            case '↑':
                var2 = 0;
                break;
            case '→':
                var2 = 1;
                break;
            case '↓':
                var2 = 2;
        }

        return ((var1 >> 16 & 255) * 30 + (var1 >> 8 & 255) * 59 + (var1 & 255) * 11) / 100 < 128 ? var2 : var2 + 4;
    }

    static DataInputStream Code(int var0) {
        DataInputStream var1 = new DataInputStream(Code((var0 & 64) == 0 ? "/t" : "/v"));
        Code(var0, var1);
        return var1;
    }

    static void d(boolean var0) {
        if (!var0) {
            C = 0L;
            a = 0L;
            g = 0L;
        }

        b = C;
        c = a;
    }

    private static int C(byte[] var0, int var1) {
        int var2 = 0;
        int var3 = 0;

        while(var3 < var1) {
            if (bs) {
                var2 = var2 << 8 | var0[bb++] & 255;
                ++var3;
            } else {
                var2 |= (var0[bb++] & 255) << (var3 << 3);
                ++var3;
            }
        }

        return var2;
    }

    private static void Z(byte[] var0) {
        bb = 0;
        bs = (char)var0[0] == 'M' && (char)var0[1] == 'M';
        bb += 4;
        bb = C(var0, 4);

        byte[] var1;
        do {
            var1 = var0;
            int var2 = C(var0, 2);
            int var3 = 0;

            while(var3 < var2) {
                int var4 = C(var1, 2);
                int var5 = C(var1, 2);
                var5 = j[var5 - 1];
                int var6 = C(var1, 4);
                int var7 = C(var1, 4);
                int var8 = var5 * var6;
                int var9 = bb;
                if (var8 > 4) {
                    bb = var7;
                    var7 = 0;
                } else {
                    bb -= 4;
                    var7 = 0;
                }

                for(; var7 < var6; ++var7) {
                    int var10 = C(var1, var5);
                    if (var4 != 259) {
                        if (var4 == 513) {
                            aZ = var10;
                        } else if (var4 == 514) {
                            ba = var10;
                        }
                    }
                }

                if (var8 > 4) {
                    bb = var9;
                    ++var3;
                } else {
                    bb += 4 - var8;
                    ++var3;
                }
            }
        } while((bb = C(var1, 4)) != 0);

    }
}
