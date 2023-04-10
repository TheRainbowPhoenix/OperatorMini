//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Stack;
import java.util.Vector;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.io.SocketConnection;
import javax.microedition.io.file.FileConnection;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextBox;
import javax.microedition.rms.RecordComparator;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordFilter;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public final class Code implements J, Runnable {
    private B B;
    private boolean bi;
    private boolean a;
    private Vector Code;
    private boolean d;
    private static byte[] I;
    private byte[] h;
    private byte[] f;
    private static long a;
    private static B Z;
    private static Code[] I;
    private long C;
    private static boolean aw;
    private static int j;
    private static int aj;
    private static int i;
    public static boolean Z;
    private static char[] I = new char[512];
    private a I;
    private Enumeration Code;
    private boolean y;
    private int C;
    private int[] y;
    private int a;
    private B a;
    private static byte[][] Code;
    private int b;
    private static int g;
    private a Code;
    private static int aX;
    private Command[] Code;
    private static int bs;
    private byte[] Code;
    private static int aC;
    private static int cc = -1;
    private static J[] Code;
    private String b;
    private static String g;
    private static String e;
    private static String f;
    private DataOutputStream Code;
    private static String i;
    private static int e;
    private static char Code = '*';
    private static RuntimeException Code;
    private static Z Code;
    private boolean b;
    private boolean c;
    private static String k;
    private byte Code;
    private byte I;
    private boolean B;
    private boolean C;
    private static int[] n;
    private static boolean[] Code;
    private static Code[] Code;
    private long Z;
    private static Code f;
    private static int[][] Code;
    private static char[][] Code;
    private static byte[][] I;
    private static Object[] Code;
    private int[] I;
    private static Code B;
    private static String[] Z = new String[]{"u", "h1", "r", "g", "eurls", "b", "se"};
    private static int ak;
    public static Code Z;
    private static int M;
    private static Hashtable Code;
    private static short[] Code;
    private static Code e;
    private static Hashtable c = new Hashtable();
    private static f Code;
    private Hashtable B;
    private static Object Code;
    private static int k;
    private static byte[] d;
    private static Vector J;
    private static int[] d;
    private static byte[] B;
    private static Hashtable C;
    private static boolean e;
    private static Object Z;
    private static int H;
    public static int[] Code;
    private static long J;
    private static String Z;
    public static Code I;
    private static Code M = new Code(false, (byte)0);
    private static int c;
    public static int Code;
    private static int d;
    private String c;
    public static boolean I;
    private static long I;
    private static short[] Z;
    private static long e;
    private static String C;
    public static int I;
    private static long d;
    private static int f;
    private J a;
    private Hashtable J;
    private static J Code;
    private Code L;
    private static Hashtable b = new Hashtable();
    private static B Code;
    private static B I;
    private static byte[] J;
    private static int[] C;
    private static B J;
    private static short[] J;
    private static byte[] e;
    private static boolean i;
    private static byte[] Z;
    private static boolean g;
    private static boolean k;
    private static boolean aA;
    private static int h;
    private static boolean l;
    private static int aq;
    private static byte[] o;
    private static int l;
    private static int m;
    private static boolean p;
    private static int T;
    private HttpConnection Code;
    private static int bu;
    private static int Q;
    private static boolean r;
    private static boolean h;
    private static int n;
    private static boolean q;
    private Code C;
    private static Code c;
    private static long c;
    private static int[] Z;
    private static int[] j;
    private static int u;
    private static boolean s;
    private int az;
    private static int[] s;
    private static int q;
    private static boolean o;
    private static int o;
    private static int p;
    private static byte[] q;
    private static long b = 500000L;
    private static int[] f;
    private static Vector B;
    public static int Z = 4;
    private static int r;
    private static int s;
    private static int bi;
    private static int t;
    private static int v;
    private static int w;
    private static int R;
    private static int aK;
    private static int x;
    private static int y;
    private static int z;
    private static int A;
    private static byte[] s;
    private static int[] J;
    private static int[] q;
    private static int[] B;
    private static byte[] u = new byte[366];
    private static int D;
    public static Code J;
    private static Code E;
    private static int E;
    private static Code x;
    private static int F;
    private static boolean m;
    private static boolean G;
    private static int G;
    private static int K;
    private static Code y;
    private static int[] c;
    private static int L;
    private static byte[] t = new byte[256];
    private static Code D;
    private static int bE = -1;
    private static int at;
    private static int N;
    private static boolean X;
    private static boolean O;
    private static int[] k;
    private static int O;
    private static boolean v;
    private boolean aQ;
    private int bl;
    private static int X;
    private static int[] b;
    private static int P;
    private static int S;
    private static int aD;
    private static int U;
    private int[] w;
    private static a Z;
    private Code K;
    private static int[] a;
    private static int V;
    private int[] x;
    private static int W;
    private static int Y;
    private static int aE;
    private static int aa;
    private static int cf;
    private static int ab;
    private static int ac;
    private static int ad;
    private static int ae;
    private Code v;
    private static byte c;
    private long B;
    private static int af;
    private static int bv;
    public static int J = -1;
    private static int ag;
    private static int ah;
    private static int ai;
    private static int al;
    private static int am;
    private static int[] m;
    private static boolean W;
    private static Code A = new Code((short)0, false);
    private static int an;
    private static int ao;
    private static int[] D = new int[366];
    private static int ap;
    private Code H;
    private static int ar;
    private static int as;
    private static Code a;
    private static int au;
    private static int av;
    private static int aw;
    private static Code p;
    private static TextBox Code;
    private static boolean D;
    public static Browser Code;
    private static int ax;
    private static int ay;
    private static byte[] c;
    private static Code b;
    public static String Code;
    private static byte[] C;
    public static Code Code;
    private static long Code;
    private static boolean f;
    private static int aA;
    private static int aB;
    private static boolean j;
    private static Vector I;
    private static Code d;
    public static boolean Code;
    private static int aF;
    private static int aG;
    private static int aH;
    private static int aI;
    private static boolean n;
    private static String J;
    private static Hashtable I;
    private static int[] e;
    private static Vector Z;
    private static C Code;
    private static byte[] n;
    private static byte[] b;
    private static int aJ;
    private static int cd = -1;
    private static byte[] a;
    private static int by = -1;
    private static int aL;
    private static int aM;
    private static int aN;
    private static int aO;
    private static int ci;
    private static int aP;
    private static int aQ;
    private static int aR;
    private static int aS;
    private static int aT;
    private static int aU;
    private static int aV;
    private static int aW;
    private static int aY;
    private static int aZ;
    private static int ba;
    private static int bA;
    private static int bB;
    private static int bb;
    private static int bc;
    private static int bd;
    private static int be;
    private static int bC;
    private static int bY;
    private static int bZ;
    private static int bf;
    private static int bg;
    private static boolean t;
    private char[] Code;
    private J I;
    private static int[] l;
    private static String B;
    public static String I;
    private static String a;
    private String d;
    private int[] g;
    private static byte B;
    private int[][] I;
    private Object[] I;
    private int[] h;
    private Code g;
    private byte[] g;
    private static byte[] i;
    private static boolean u;
    private B[] Code;
    private B[] I;
    private int bh;
    private Code O;
    private Code h;
    private Code i;
    private String m;
    private Code j;
    private Code k;
    private static Hashtable Z;
    private static Image Code;
    private SocketConnection Code;
    private static int[] i;
    private Code l;
    private Code m;
    private Code n;
    private static boolean S;
    private static int bD = -1;
    private boolean M;
    private static int bj;
    private int bk;
    private int bm;
    private int bn;
    private int bo;
    private static boolean aD;
    private int bp;
    private int bq;
    private static int cg;
    private int br;
    private static Code o;
    public static Display Code;
    private boolean w;
    private RecordStore Code;
    private boolean x;
    private String[] Code;
    private Code q;
    private static byte b;
    private Code F;
    private static byte a;
    private static byte J;
    private static byte Z;
    private static int bt;
    private static Code z;
    private static boolean z;
    private static boolean T;
    private static boolean aK;
    private static boolean A;
    private static boolean E;
    private short[][] Code;
    private static String h;
    private DataInputStream Code;
    private DataInputStream I;
    private DataOutputStream I;
    private J Z;
    private J J;
    private static String l = "-";
    private J B;
    private Code r;
    private Object[] Z;
    private Code s;
    private Code t;
    private Code u;
    private static boolean F;
    private static B C;
    private static Object I;
    private static boolean H;
    private static byte C;
    private static Object J;
    private static boolean K;
    private static J C;
    private boolean L;
    private static int bw;
    private static Code w;
    private int[] u;
    private boolean N;
    private static boolean ao;
    private static boolean P;
    private static int bx = -1;
    private static boolean Q = true;
    private static int ch;
    private static int bz;
    private static boolean R;
    private static boolean U;
    private static boolean V;
    private static boolean Y = true;
    private static boolean aa;
    private static boolean ab;
    private static boolean ac;
    private static int bF;
    private static boolean ad;
    private static boolean ae;
    private static boolean af = true;
    private static int bG = 2;
    private static boolean ag;
    private static int bH = 2;
    private static boolean ah;
    private static int bI = -1;
    private static int bJ = -1;
    private static int bK = 512;
    private static boolean ai;
    private static int bL;
    private static byte[] j;
    public static int B = -1;
    private static boolean aj;
    private static String[] I;
    private static boolean ak;
    private static int bM;
    private static String j;
    private static boolean al;
    private static boolean am;
    private static boolean an;
    private static byte[] k;
    private static byte[] l;
    private static boolean aC;
    private static byte[] m;
    private static int bN;
    private static int bO;
    private static int ca = 384;
    private static int bP;
    private static int bQ;
    private static int bR;
    private static int bS;
    private static int cb;
    private static int bT;
    private static int bU;
    private static int bV;
    private static int bW;
    private static int bX;
    private static byte[] p;
    private static Hashtable a;
    private static Integer Code;
    private int[] t;
    private static boolean ap;
    private static boolean aq;
    private static boolean ar;
    private static boolean as;
    private static boolean at;
    private static boolean au;
    private Font Code;
    private Thread[] Code;
    private static byte[] r;
    private static boolean av;
    private static boolean ax;
    private boolean aX;
    private static boolean ay;
    private static boolean az;
    private static boolean aB;
    private static int ce = 1;
    public static boolean J;
    private boolean aE;
    private boolean aF;
    private boolean aG;
    private boolean aH;
    private boolean aI;
    private boolean aJ;
    private Code[] Z;
    private Code G;
    private static int[] o;
    private boolean aL;
    private boolean aM;
    private boolean aN;
    private boolean aO;
    private FileConnection Code;
    private boolean aP;
    private Graphics Code;
    private static int[] p = new int[256];
    private Code[] J;
    private boolean aR;
    private static short[] I;
    private int ct;
    private static int[] r;
    private int cj;
    private int[] v;
    private int ck;
    private int cl;
    private int cq;
    private int cm;
    private int cr;
    private int cn;
    private int co;
    private int cp;
    private byte[][] Z;
    private int cs;
    private int[][] Z;
    private byte[][] J;
    private byte[][] B;
    private short[] B;
    private int cu;
    private int[] z;
    private int[][] J;
    private int cv;
    private int cw;
    private boolean aS;
    private boolean aT;
    private boolean aU;
    private boolean aV;
    private boolean aW;
    private boolean aY;
    private boolean aZ;
    private boolean ba;
    private boolean bb;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private int cx;
    private int cy;
    private int cz;
    private int cA;
    private int cB;
    private int cC;
    private int cD;
    private int cE;
    private Code N;
    private static B[] Z = new B[1];
    private boolean bh;
    private static int[] A = new int[3];
    private static B[] J = new B[1];
    private int cF;
    private int cG;
    private int cH;
    private int cI;
    private boolean bg;
    private int cJ;
    private boolean bj;
    private int cK;
    private boolean bc;
    private boolean bd;
    private boolean be;
    private boolean bf;
    private J b;
    private Code[] B;

    private void H() {
        p = new Code('\u0000', false);
        Code = new f();
        (Code = new J[6])[0] = Code(64, (int)0, 8);
        Code[1] = Code(64, (int)1, 8);
        Code[2] = Code(64, (int)0, 0);
        Code[3] = Code(64, (int)1, 0);
        Code[4] = Code(64, (int)0, 16);
        Code[5] = Code(64, (int)1, 16);
        if ((i = Code.getAppProperty("OM-UA")) == null) {
            i = Code.getAppProperty("DOWNLOADED_WITH_USER_AGENT");
        }

        String var1 = i == null ? "" : i.toLowerCase();
        String var2 = (var2 = g("microedition.platform")) == null ? "" : var2.toLowerCase();
        String var3 = (var3 = g("device.model")) == null ? "" : var3.toLowerCase();
        int var4;
        V = (var4 = Code.numAlphaLevels()) > 2;
        O = Code.hasPointerEvents();
        Code.hasPointerMotionEvents();
        az = g("microedition.io.file.FileConnection.version") != null;
        cc = Code.checkPermission("javax.microedition.io.Connector.file.read");
        cd = Code.checkPermission("javax.microedition.io.Connector.file.write");
        if (var1.indexOf("lg/ku800/") >= 0) {
            az = false;
        }

        if (var2.startsWith("vs")) {
            B = 8;
        }

        if (var2.indexOf("nokia") < 0 && !var2.equals("siemens_sx1") && !var2.equals("sendo x") && !var2.equals("panasonic x700")) {
            if (b("com.siemens.mp.lcdui.Image")) {
                B = 2;
            } else if (!b("com.motorola.phonebook.PhoneBookRecord") && !b("com.motorola.Dialer") && !b("com.motorola.phone.Dialer") && !b("com.motorola.graphics.j3d.Light") && !b("com.motorola.lwt.ComponentScreen") && !b("com.motorola.game.GameScreen") && !b("com.motorola.funlight.FunLight") && !b("com.motorola.multimedia.Lighting") && !b("com.motorola.io.ConnectorEvent") && !b("com.motorola.extensions.ScalableJPGImage") && g("batterylevel") == null && g("BatteryLevel") == null && !b("com.mot.iden.multimedia.Lighting")) {
                if (var2.indexOf("sonyericsson") < 0 && !var2.equals("symbian os") && g("com.sonyericsson.IMEI") == null && g("com.sonyericsson.imei") == null) {
                    if (!b("com.samsung.util.AudioClip") && !b("com.samsung.util.LCDLight") && !b("com.samsung.util.SM") && !b("com.samsung.util.SMS") && !b("com.samsung.util.Vibration") && !var3.startsWith("sgh")) {
                        if ("rolltech java".equals(var3)) {
                            B = 13;
                        }
                    } else {
                        B = 4;
                    }
                } else {
                    B = 3;
                }
            } else {
                B = 1;
            }
        } else {
            B = 0;
        }

        boolean var5 = b("com.jblend.util.Case");
        g("microedition.profiles");
        int var6 = Code.getWidth();
        int var7 = Code.getHeight();
        int var8 = Code.numColors();
        String var9;
        boolean var33 = (var9 = g("microedition.configuration")) != null && var9.indexOf("CLDC-1.1") >= 0;
        switch(B) {
            case 0:
                J = -4;
                if (var2.indexOf("e61") < 0 && var2.indexOf("e62") < 0 && var2.indexOf("e63") < 0 && var2.indexOf("e71") < 0 && var2.indexOf("e72") < 0 && !var2.startsWith("nokia9300/") && !var2.startsWith("nokia9300i/") && !var2.startsWith("nokia9500/") && !var2.startsWith("nokiac3-00/")) {
                    if (var2.indexOf("n97") >= 0) {
                        J = 2;
                        R = true;
                        Code = "qwertyuiopjh";
                        I = "1234567890*#";
                        Z = true;
                    } else if (var2.indexOf("e55") >= 0) {
                        J = 5;
                        R = true;
                        Code = "ertyuidfghjkcvbnm ";
                        I = "112233445566778890";
                        Z = true;
                    }
                } else {
                    J = 2;
                    R = true;
                    Code = "rtyfghvbnmuj";
                    I = "1234567890*#";
                    Z = true;
                }

                if (var2.startsWith("nokian") || var2.startsWith("nokiae") || g("com.nokia.mid.ui.version") != null || var2.startsWith("nokia6124") || var2.startsWith("nokia6120") || var2.startsWith("nokia6121") || var2.startsWith("nokia5700") || var2.startsWith("nokia6110") || var2.startsWith("nokia5500")) {
                    R = true;
                }

                if (var2.startsWith("nokiae90-1/")) {
                    R = false;
                    Z = true;
                }

                if (var2.startsWith("nokia301.")) {
                    P = true;
                }
                break;
            case 1:
                if (b("com.mot.iden.multimedia.Lighting")) {
                    J = -6;
                } else {
                    J = -5;
                }
                break;
            case 2:
                J = -7;
                if (var2.startsWith("sk6r")) {
                    J = 0;
                }
                break;
            case 3:
                if (var2.indexOf("t270") < 0 && var2.indexOf("t280") < 0) {
                    R = true;
                }

                J = -2;
                if (var2.indexOf("symbian") >= 0) {
                    J = 0;
                } else if (var2.indexOf("p910") >= 0) {
                    J = 0;
                } else if (var2.indexOf("m600") < 0 && var2.indexOf("p1") < 0 && var2.indexOf("p9") < 0) {
                    if (b("com.sonyericsson.iapinfo.AccessPointEvent")) {
                        J = -3;
                    }
                } else {
                    J = 2;
                }
                break;
            case 4:
                J = -8;
                break;
            default:
                J = -1;
                if (var2.indexOf("sunmicrosystems_wtk") >= 0) {
                    R = true;
                } else if (var2.startsWith("lg-kc550")) {
                    bA = 0;
                    R = true;
                } else if (!var2.startsWith("lg-gt360") && !var2.startsWith("lg-ks360")) {
                    if (B != 8 || !var2.startsWith("vs")) {
                        label3248: {
                            if (var2.indexOf("motoq") >= 0) {
                                R = false;
                                J = 2;
                            } else {
                                if (var2.indexOf("palm treo 700w") >= 0) {
                                    R = true;
                                    J = 2;
                                    break label3248;
                                }

                                if (!var5 && !var2.equals("jbed-fastdac") && var2.indexOf("windows") < 0 && var2.indexOf("intent") < 0 && (!var2.equals("jbed") || var7 <= 128 || var6 <= 128)) {
                                    break label3248;
                                }

                                if (O) {
                                    bA = 0;
                                    break label3248;
                                }
                            }

                            bA = 1;
                        }
                    }
                } else {
                    bA = 1;
                }
        }

        if (b("com.sprintpcs.util.System") && J == -1) {
            J = -9;
            R = true;
        }

        if (B == 0) {
            if (var6 < 176) {
                aq = true;
            }

            if (var6 <= 128) {
                bB = 13;
                bC = 13;
            } else if (var6 <= 176) {
                bB = 17;
                bC = 17;
            } else if (var6 <= 240) {
                bB = 22;
                bC = 22;
            } else {
                bB = 28;
                bC = 28;
            }

            if (var6 == 176) {
                R = true;
                ca = 150;
            }

            if (var6 == 240 && O) {
                ay = true;
            }

            if (var2.indexOf("3220") >= 0) {
                ac = true;
            }

            if (var2.startsWith("nokia6260/")) {
                ar = true;
            }

            if (var2.startsWith("nokia6600/")) {
                ar = true;
            }

            if (var2.startsWith("nokia6620/")) {
                ar = true;
            }

            if (var2.startsWith("nokia6630/")) {
                String var10 = "/6.03.40";
                if (var2 != null && var2.indexOf(47) >= 0 && var10.indexOf(47) >= 0 && var2.substring(var2.indexOf(47)).compareTo(var10.substring(var10.indexOf(47))) < 0) {
                    az = false;
                }

                aC = true;
            }

            if (var2.startsWith("nokia6670/")) {
                ar = true;
            }

            if (var2.startsWith("nokia6680/")) {
                aA = true;
            }

            if (var2.startsWith("nokia7610/")) {
                ar = true;
            }

            if (var2.startsWith("nokia7710/")) {
                ar = true;
            }

            if (var2.startsWith("nokia9300/") || var2.startsWith("nokia9300i/")) {
                ar = true;
            }

            if (var2.startsWith("nokia9500/")) {
                ar = true;
            }

            if (var2.startsWith("nokian72/") || var2.startsWith("nokian70/") || var2.startsWith("nokian70-1/")) {
                at = true;
            }
        }

        if (B == 3) {
            if (var6 <= 176) {
                aq = true;
            }

            bB = -22;
            bC = 22;
            if (var2.indexOf("p910") >= 0) {
                ax = true;
                as = true;
            }

            if (var2.indexOf("symbian") >= 0) {
                as = true;
            }

            if (b("javax.wireless.messaging.MultipartMessage") && !b("javax.microedition.amms.GlobalManager")) {
                cb = 2475;
            }

            if (var2.startsWith("sonyericssonp1") || var2.startsWith("sonyericssonm600")) {
                Code = "ertyuidfghjkcxvbnm �￼";
                I = "1122334455667788990*#";
            }

            if (var6 <= 176) {
                av = true;
            }

            if (var2.startsWith("sonyericssonm600") || var2.startsWith("sonyericssong608") || var2.startsWith("sonyericssong700") || var2.startsWith("sonyericssong900") || var2.startsWith("sonyericssong958") || var2.startsWith("sonyericssonw960") || var2.startsWith("sonyericssonp990") || var2.startsWith("sonyericssonp1c/") || var2.startsWith("sonyericssonp1i/")) {
                at = true;
            }

            au = true;
        }

        if (B == 1) {
            az = az && cc != 0 && cd != 0;
            cb = 1024;
            if (var2.indexOf("symbian") >= 0) {
                as = true;
            }

            if (var5) {
                V = false;
                Code = "ertdfgxcv+zb";
                I = "1234567890*#";
            }

            if (b("com.mot.iden.multimedia.Lighting")) {
                ap = true;
                T = true;
                U = true;
            }
        }

        if (B == 4) {
            Y = false;
            if (var3.endsWith("sgh-gt-b2700") || var3.startsWith("sgh-g400") || var3.startsWith("gt-c5510") || var3.startsWith("m7500") || var2.startsWith("s7220") || var2.startsWith("s7350") || var2.startsWith("sgh-t469") || var2.startsWith("sgh-t559") || var2.startsWith("samsung-gt-s7350i/")) {
                O = false;
            }

            if (var2.equals("j2me") && var4 == 2 && var33 && var6 == 240 && var7 == 286 && var8 == 65536) {
                S = true;
                cb = 256;
            }

            if (var2.startsWith("samsung-c3530/") || var2.startsWith("samsung-b3310/")) {
                aw = true;
            }

            if (var6 == 320 && var7 == 186 && var8 == 65536 && var4 == 65536) {
                al = true;
            }

            if (var6 == 128 && var7 == 144 || var6 == 176 && var7 == 204 || var6 == 220 && var7 == 160) {
                ap = true;
            }

            if (var2.startsWith("sgh-p310") || var1.indexOf("x820") >= 0 || var1.indexOf("sghd830") >= 0) {
                az = false;
            }

            if (var2.startsWith("samsung gt-c3510") || var2.startsWith("samsung gt-b3410") || var2.startsWith("samsung gt-b5722") || var2.startsWith("samsung sgh-d980")) {
                O = true;
            }
        }

        if (var2.indexOf("sxg75") < 0 && var2.indexOf("ef81") < 0) {
            if (B == 2) {
                U = true;
                if (var6 < 176) {
                    aq = true;
                }
            }
        } else {
            ag = true;
            B = 2;
        }

        if (B == 13 && "qwerty".equals(g("device.keypad"))) {
            J = 2;
            R = true;
            aD = true;
            J = true;
        }

        int var30;
        if (B == -1) {
            if (var2.startsWith("windows ce")) {
                ag = true;
                aB = true;
            }

            if (!var5) {
                if (var2.equals("j2me")) {
                    ag = true;
                }
            } else if (var2.equals("j2me") && var6 == 320 && var7 == 186 || var6 == 240 && var7 == 268 || var6 == 320 && var7 == 250) {
                J var29 = Code(64, (int)0, 8);
                J var31 = Code(64, (int)1, 8);
                J var34 = Code(64, (int)1, 16);
                if (var31.I("Abcdefg") <= var29.I("Abcdefg") && var31.I("Abcdefg") <= var34.I("Abcdefg")) {
                    ao = true;
                    I = new byte[6][2048];

                    for(var30 = 0; var30 < 6; ++var30) {
                        for(int var32 = 0; var32 < 2048; ++var32) {
                            I[var30][var32] = -1;
                        }
                    }
                }
            }

            if (var2.equals("jbed")) {
                ae = true;
            }

            if (var2.equals("jbed-fastdac")) {
                ag = true;
                cb = 260;
            }

            if (var2.equals("jbed-fastbcc") && var6 == 240 && var7 == 325 && var8 == 65536 && var4 == 256 && var33) {
                ce = 2;
                O = true;
            }

            if (var2.startsWith("lg-kc510") || var2.startsWith("lg-kc550") || var2.startsWith("lg-kf600") || var2.startsWith("lg-kf780")) {
                O = false;
            }

            if (Code(var2, "lg", "kf700") || Code(var2, "lg", "u250") || Code(var2, "lg", "ku250") || Code(var2, "lg", "ku380") || var1.indexOf("lg-ke800") >= 0 || var2.startsWith("sagem-my850c") || var2.startsWith("sagem-mc2007") || var1.indexOf("sagem-my700x") >= 0 || var1.indexOf("huawei-vf710") >= 0 || var1.indexOf("samsung-sphm520") >= 0 || var1.indexOf("samsung-plsm520") >= 0 || var1.indexOf("sgh-z710") >= 0) {
                az = false;
            }

            if (var1.indexOf("t-mobile vairy touch ii/") >= 0) {
                O = true;
            }
        }

        b("com.sprintpcs.util.System");
        Z("mc");
        Z("md");
        X();
        if (J((int)1).length() == 0 && (var1 = h()) != null) {
            Code(1, var1, true);
        }

        if (c("s")) {
            for(int var24 = 0; var24 < Z.length; ++var24) {
                c(Z[var24]);
            }
        }

        boolean var10001;
        if (ag) {
            af = false;
        } else {
            var1 = null;
            byte var10000 = 4;
            var10001 = false;

            B var35;
            try {
                var35 = Code(var10000, var10001);
            } finally {
                ;
            }

            B var25 = var35;
            if (var25 != null && var25.Code.getWidth() == 1) {
                af = true;
            } else {
                af = false;
            }
        }

        int var26;
        label3229: {
            System.gc();
            if (ap) {
                a = Runtime.getRuntime().freeMemory() * 10L / 8L;
            } else {
                if (aq && a > 0L) {
                    break label3229;
                }

                Vector var27 = new Vector(ca);
                var26 = 0;

                label2903: {
                    try {
                        System.gc();
                    } catch (Throwable var23) {
                        var10001 = false;
                        break label2903;
                    }

                    while(true) {
                        try {
                            if (var27.size() > ca) {
                                break;
                            }

                            var27.addElement(new byte[8192]);
                        } catch (Throwable var22) {
                            var10001 = false;
                            break;
                        }

                        ++var26;
                    }
                }

                System.gc();
                a = (long)((var26 << 13) + 4);
            }

            if (B == 0 && ca >= 256 && a < 2097152L) {
                W = true;
            }

            C((int)a);
        }

        ac();
        ab();
        Font var28;
        if ((var26 = (var28 = Font.getDefaultFont()).getFace()) == 0) {
            var26 = 32;
        }

        if ((var30 = var28.getSize()) != 16 && var30 != 0 && var30 != 8) {
            var30 = 0;
        }

        c(var26, var28.getStyle(), var30);
        if (!ax) {
            Code.setFullScreenMode(true);
        }

        if (System.getProperty("microedition.pim.version") != null && b("javax.microedition.pim.PIM")) {
            var1 = "javax.microedition.pim.ContactList.read";
            if (Code.checkPermission(var1) != 0) {
                aa = true;
            }
        }

        p.J(this);
        Code.setCurrent(Code);
    }

    private void z() {
        InputStream var2;
        int var3;
        if (this.b) {
            var2 = null;
            Code var67 = J;
            String var69 = this.b;
            String var10002 = this.d;

            byte[] var68;
            try {
                var68 = var67.Code(var69, var10002);
            } finally {
                ;
            }

            byte[] var61 = var68;
            Code.I();
            int var52 = J(this.b);
            if (var61 != null) {
                var3 = I(var61);
                O = var52;
                Z(var61, var3);
                var52 = O;
            } else {
                Z((byte[])null, 0);
            }

            Code.Code(var52, (int)7);
        } else {
            Code var1 = this;
            if (this.c) {
                this.h.ah();
            } else {
                byte var10000 = 0;
                byte var10001 = 20;

                label2324: {
                    boolean var64;
                    int var6;
                    boolean var57;
                    boolean var58;
                    boolean var59;
                    try {
                        I(var10000, (int)var10001);
                        var2 = Code("/a");
                        DataInputStream var53;
                        (var53 = new DataInputStream(var2)).readInt();
                        ao = var53.readUnsignedShort();
                        var3 = var53.readUnsignedShort();
                        int var4 = var53.readUnsignedShort();
                        int var5 = var53.readUnsignedShort();

                        for(d = new int[(aq = var3 + var4) + var5]; var4-- > 0; d[var3++] = var53.readInt()) {
                        }

                        Z = new int[var53.readUnsignedByte()];

                        for(var3 = 0; var3 < Z.length; ++var3) {
                            Z[var3] = var53.readUnsignedShort();
                        }

                        o = Z[1];
                        p = Z[6];
                        q = Z[7];
                        w = Z[2];
                        u = Z[9];
                        v = Z[10];
                        r = Z[12];
                        s = Z[13];
                        t = Z[14];
                        g();
                        a = new int[var53.readUnsignedByte()];

                        for(var3 = 0; var3 < a.length; ++var3) {
                            a[var3] = var53.readUnsignedByte() << 16 | var53.readUnsignedShort();
                        }

                        b = new int[var53.readUnsignedShort() << 2];

                        for(var3 = 0; var3 < b.length; var3 += 4) {
                            var4 = var53.readInt();
                            b[var3] = var4;
                            b[var3 + 1] = var4 + var53.readUnsignedShort();
                            b[var3 + 2] = var53.readUnsignedShort();
                            b[var3 + 3] = var4 + var53.readUnsignedShort();
                        }

                        c = new int[var53.readUnsignedByte()];

                        for(var3 = 0; var3 < c.length; ++var3) {
                            c[var3] = var53.readUnsignedByte() << 16 | var53.readUnsignedShort();
                        }

                        Code = new short[var53.readUnsignedByte()];

                        for(var3 = 0; var3 < Code.length; ++var3) {
                            Code[var3] = var53.readShort();
                        }

                        var3 = var53.readUnsignedByte() << 16 | var53.readUnsignedShort();
                        G = var53.readUnsignedByte() << 16 | var53.readUnsignedShort();
                        H = var53.readUnsignedByte() << 16 | var53.readUnsignedShort();
                        K = var53.readUnsignedByte() << 16 | var53.readUnsignedShort();
                        I = new byte[H + K];
                        var53.readFully(I, 0, I.length);
                        u(I.length * 100 / var3);
                        ai = 16384;
                        ak = 4;
                        g(1);
                        al = 32768;
                        an = 4;
                        Y = b(2, -2);
                        aa = b(2, -2);
                        ab = b(2, -2);
                        ap = al + 3;
                        i(0);
                        ac = R;
                        a((ad = b(3, p)) + -2, ad);
                        a(ad + 1, ac);
                        a(ad + 2, 0);
                        var4 = aq;
                        var6 = H + K;

                        while(var6 < var3) {
                            int var7 = var53.readByte() & 255;
                            ++var6;
                            if (var7 == 255) {
                                var7 += var53.readUnsignedShort();
                                var6 += 2;
                            }

                            int var8;
                            if (var7 == 0) {
                                var8 = ad;
                            } else {
                                i(var7);
                                var53.readFully(Z, S, var7);
                                a((var8 = b(3, p)) + -2, var8);
                                a(var8 + 1, R);
                                a(var8 + 2, J(R, var7));
                            }

                            d[var4++] = var8;
                            u((var6 += var7) * 100 / var3);
                        }

                        R = 0;
                        if (Z(ai) == null) {
                            l(ai >>> 14);
                        } else {
                            c(ai >>> 14, ai & 16383);
                            ai = (ai >>> 14) + 1 << 14;
                        }

                        ak = ((aj = ai) >>> 14) + 3;
                        ae = b(2, Z[22]);
                        int var54;
                        am = (var54 = (al >>> 15) + 1) << 15;
                        Code[var54] = Code[var54 - 1];
                        Code[var54 - 1] = new int[al & 32767];
                        System.arraycopy(Code[var54], 0, Code[var54 - 1], 0, al & 32767);
                        int var62 = am;
                        var54 = al & 32767;
                        var3 = var62;
                        Z(Code(var62), var3 & 32767, var54);
                        al = am;
                        a(Y, b(16, -1));
                        a(aa, b(16, -1));
                        a(ab, b(16, -1));

                        for(var54 = 0; var54 < var5; ++var54) {
                            V = d[aq + var54];
                            h(aa);
                        }

                        V = 0;
                        a(ae, Code("Out of memory"));
                        C(2, bE);
                        C(0, 0);
                        if (w() != 0) {
                            w();
                            var10001 = 1;
                        } else {
                            var10001 = 0;
                        }

                        C(1, var10001);
                        if (!X) {
                            String var55 = B("resolution");
                            if ("ri".equals(var55)) {
                                var55 = C();
                            }

                            if ("hqvga".equals(var55)) {
                                W = true;
                            }

                            var55 = "OM-Low-Mem";
                            if ("true".equals(Code.getAppProperty(var55)) && ab) {
                                W = true;
                            }

                            X = true;
                        }

                        C(3, W);
                        x();
                        C(4, x());
                        C(5, ce);
                        C(6, bH);
                        byte var56;
                        if (J == 0 && !O) {
                            var56 = 3;
                        } else if (bA == 0 && J != 0) {
                            var56 = 2;
                        } else {
                            var56 = 1;
                        }

                        C(7, var56);
                        C(8, O);
                        C(9, bD);
                        C(10, R & 1);
                        if (bB != 0 || bC != 0) {
                            a(var54 = a(2, 48), bB);
                            var3 = bC;
                            a(var54 + 1, var3);
                            d[ao + -1] = var54;
                        }

                        am = true;
                        an = true;
                        C(12, s() < 0 ? 1 : 0);
                        switch(s()) {
                            case -9:
                            case -8:
                            case -3:
                            case -2:
                                var10001 = 1;
                                break;
                            case -7:
                            case -6:
                            case -5:
                            case -4:
                            case -1:
                            default:
                                var10001 = 0;
                        }

                        C(13, var10001);
                        switch(s()) {
                            case -9:
                            case -8:
                            case -6:
                            case -2:
                            default:
                                var10001 = 42;
                                break;
                            case -7:
                            case -5:
                            case -4:
                            case -3:
                            case -1:
                                var10001 = 35;
                        }

                        C(14, var10001);
                        C(15, t());
                        int var66;
                        switch(s()) {
                            case -9:
                            case -8:
                            case -7:
                            case -6:
                            case -5:
                            case -1:
                            default:
                                var66 = t();
                                break;
                            case -4:
                            case -3:
                                var66 = 48;
                                break;
                            case -2:
                                var66 = 35;
                        }

                        C(16, var66);
                        switch(s()) {
                            case -9:
                            case -8:
                            case -7:
                            case -6:
                            case -5:
                            case -4:
                            case -2:
                            case -1:
                            default:
                                var10001 = 48;
                                break;
                            case -3:
                                var10001 = 42;
                        }

                        C(17, var10001);
                        C(11, C().equals("hqvga") ^ 1);
                        c.b((int)0);
                        var59 = false;
                        var3 = 0;
                        if (c.b((int)57) == 0) {
                            var59 = true;
                            var3 = (int)System.currentTimeMillis() + 200;
                        } else {
                            f();
                            Code = I();
                        }

                        Code.repaint();
                        var58 = true;
                        var57 = false;
                        var6 = 0;
                    } catch (Throwable var50) {
                        var64 = false;
                        break label2324;
                    }

                    while(true) {
                        try {
                            if (c()) {
                                break;
                            }

                            label2315: {
                                Throwable var65;
                                label2338: {
                                    synchronized(var1){}
                                    f = false;
                                    h = false;
                                    if (j) {
                                        f var63 = Code;

                                        try {
                                            if (!var63.Code()) {
                                                if (var58) {
                                                    var57 = true;
                                                    f = true;
                                                    h = true;
                                                } else {
                                                    j = false;
                                                    f = true;
                                                }
                                            }
                                        } catch (Throwable var48) {
                                            var65 = var48;
                                            var64 = false;
                                            break label2338;
                                        }
                                    }

                                    try {
                                        var1.notifyAll();
                                        if (var57) {
                                            break label2315;
                                        }
                                    } catch (Throwable var47) {
                                        var65 = var47;
                                        var64 = false;
                                        break label2338;
                                    }

                                    while(true) {
                                        try {
                                            while(f && !h) {
                                                var1.wait();
                                            }

                                            if (aA >= 0 || Code.I()) {
                                                break label2315;
                                            }

                                            if (j) {
                                                var57 = true;
                                                break label2315;
                                            }

                                            if (!g) {
                                                if (i && (var6 = aB - (int)System.currentTimeMillis()) <= 0) {
                                                    i = false;
                                                    aA = 1;
                                                    break label2315;
                                                }

                                                if (var59 && (var6 = var3 - (int)System.currentTimeMillis()) <= 0) {
                                                    var59 = false;
                                                    aA = 57;
                                                    break label2315;
                                                }

                                                if (var58 || l || m != n) {
                                                    var57 = true;
                                                    break label2315;
                                                }
                                            }

                                            if (g || !i && !var59) {
                                                var1.wait();
                                            } else {
                                                var1.wait((long)var6);
                                            }
                                        } catch (Throwable var46) {
                                            var65 = var46;
                                            var64 = false;
                                            break;
                                        }
                                    }
                                }

                                Throwable var60 = var65;
                                throw var60;
                            }

                            f = true;
                            if (var57) {
                                var57 = false;
                                var58 = false;
                                var1.m();
                            } else {
                                n();
                                var58 = true;
                                if (aA == 57) {
                                    if (c.b(aA) == 0) {
                                        var59 = true;
                                        var3 = (int)System.currentTimeMillis() + 200;
                                    } else {
                                        f();
                                        Code = I();
                                        h(v(), b.a());
                                    }
                                } else {
                                    c.b(aA);
                                }
                            }
                        } catch (Throwable var49) {
                            var64 = false;
                            break;
                        }

                        aA = -1;
                    }
                }

                f = true;
                h = false;
                Code((Object)var1);
                Enumeration var51 = Z.elements();

                while(var51.hasMoreElements()) {
                    ((C)var51.nextElement()).I();
                }

                Z.removeAllElements();
                Code.Code();
            }
        }
    }

    private static void t(int var0) {
        ++av;
        at = 0;
        au = 0;
        ay = var0 >= 0 ? var0 : 0;
        n(aC);

        for(var0 = 1; var0 < e.length; ++var0) {
            if (e[var0] != 0) {
                n(e[var0]);
            }
        }

        n(A);
        n(L);
        n(M);
        n(N);
        n(O);
        n(P);
        n(Q);
        n(T);
        n(U);
        n(V);
        o(R);
        o(W);
        o(X);
        Code((int[])J, 0, D);
        Code((int[])d, 0, ao);

        for(var0 = 0; var0 < F; var0 += 5) {
            n(C[var0]);
        }

        var0 = (ap & -32768) + Code[ap >>> 15].length;

        int var1;
        for(var1 = ap; var1 < var0; var1 += l(var1 + -3) + 3) {
            n(var1);
        }

        k();

        int var3;
        int var4;
        int var5;
        int var6;
        label4132:
        while(ax >= 0) {
            var1 = ax;
            boolean var2 = false;
            ax = -1;

            while(true) {
                while(var1 >= 0) {
                    var3 = var1;
                    var1 = l(var1 + -2);
                    var4 = l(var3);
                    var5 = l(var3 + 1);
                    var6 = l(var3 + 2);
                    if (var5 != 0 && l(var5 + -2) == 0) {
                        var5 = 0;
                    }

                    if (var6 != 0 && l(var6 + -2) == 0) {
                        var6 = 0;
                    }

                    if (var5 == 0 && var6 == 0) {
                        a(var3 + -2, ax);
                        ax = var3;
                    } else if (l(var4 + -2) == 0) {
                        n(var4);
                        k();
                        var2 = true;
                    }
                }

                if (var2) {
                    break;
                }

                ax = -1;
                break label4132;
            }
        }

        p(Y);
        p(aa);
        p(ab);
        k();
        var1 = am;
        int var21 = am >>> 15;

        while(true) {
            int var7;
            int var10000;
            int[] var22;
            label4108:
            while(Code[var21] != null) {
                var3 = 0;

                for(var22 = Code[var21]; var3 + 3 <= 32768; var3 += var5 + 3) {
                    var5 = var22[var3 + 3 + -3];
                    if ((var6 = var22[var3 + 3 + -1]) == 0) {
                        ++var21;
                        continue label4108;
                    }

                    boolean var29;
                    if (var22[var3 + 3 + -2] == 0) {
                        if (Code(var6)) {
                            ++aw;
                            Object var25;
                            var29 = (var25 = Code[var22[var3 + 3]]) instanceof Code;
                            if (var29) {
                                var29 = ((Code)var25).bj;
                                if (var29) {
                                    var29 = ((Code)var25).bi;
                                    if (var29) {
                                        if (((Code)var25).bh) {
                                            var29 = false;
                                        }

                                        if (var29) {
                                            if (((Code)var25).bg) {
                                                var29 = false;
                                            }

                                            if (var29) {
                                                var29 = ((Code)var25).bf;
                                                if (var29 && var29) {
                                                    if (((Code)var25).be) {
                                                        var29 = false;
                                                    }

                                                    if (var29 && var29) {
                                                        if (((Code)var25).bd) {
                                                            var29 = false;
                                                        }

                                                        if (var29) {
                                                            var29 = ((Code)var25).bc;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            if (var29) {
                                ((Code)var25).aC();
                            } else {
                                var29 = var25 instanceof Code;
                                if (var25 instanceof Code) {
                                    var29 = ((Code)var25).bj;
                                    if (var29) {
                                        var29 = ((Code)var25).bi;
                                        if (var29) {
                                            if (((Code)var25).bh) {
                                                var29 = false;
                                            }

                                            if (var29) {
                                                if (((Code)var25).bg) {
                                                    var29 = false;
                                                }

                                                if (var29) {
                                                    var29 = ((Code)var25).bf;
                                                    if (var29 && var29) {
                                                        if (((Code)var25).be) {
                                                            var29 = false;
                                                        }

                                                        if (var29 && var29) {
                                                            if (((Code)var25).bd) {
                                                                var29 = false;
                                                            }

                                                            if (var29) {
                                                                if (((Code)var25).bc) {
                                                                    var29 = false;
                                                                }

                                                                if (var29) {
                                                                    if (((Code)var25).bb) {
                                                                        var29 = false;
                                                                    }

                                                                    if (var29) {
                                                                        var29 = ((Code)var25).ba;
                                                                        if (var29) {
                                                                            if (((Code)var25).aZ) {
                                                                                var29 = false;
                                                                            }

                                                                            if (var29) {
                                                                                if (((Code)var25).aY) {
                                                                                    var29 = false;
                                                                                }

                                                                                if (var29 && var29) {
                                                                                    if (((Code)var25).aX) {
                                                                                        var29 = false;
                                                                                    }

                                                                                    if (var29) {
                                                                                        if (((Code)var25).aW) {
                                                                                            var29 = false;
                                                                                        }

                                                                                        if (var29) {
                                                                                            if (((Code)var25).aV) {
                                                                                                var29 = false;
                                                                                            }

                                                                                            if (var29) {
                                                                                                if (((Code)var25).aU) {
                                                                                                    var29 = false;
                                                                                                }

                                                                                                if (var29) {
                                                                                                    if (((Code)var25).aT) {
                                                                                                        var29 = false;
                                                                                                    }

                                                                                                    if (var29) {
                                                                                                        if (((Code)var25).aS) {
                                                                                                            var29 = false;
                                                                                                        }

                                                                                                        if (var29) {
                                                                                                            if (((Code)var25).aR) {
                                                                                                                var29 = false;
                                                                                                            }

                                                                                                            if (var29) {
                                                                                                                if (((Code)var25).aQ) {
                                                                                                                    var29 = false;
                                                                                                                }

                                                                                                                if (var29) {
                                                                                                                    if (((Code)var25).aP) {
                                                                                                                        var29 = false;
                                                                                                                    }

                                                                                                                    if (var29) {
                                                                                                                        if (((Code)var25).aO) {
                                                                                                                            var29 = false;
                                                                                                                        }

                                                                                                                        if (var29) {
                                                                                                                            if (((Code)var25).aN) {
                                                                                                                                var29 = false;
                                                                                                                            }

                                                                                                                            if (var29) {
                                                                                                                                if (((Code)var25).aM) {
                                                                                                                                    var29 = false;
                                                                                                                                }

                                                                                                                                if (var29) {
                                                                                                                                    if (((Code)var25).aL) {
                                                                                                                                        var29 = false;
                                                                                                                                    }

                                                                                                                                    if (var29) {
                                                                                                                                        if (((Code)var25).aJ) {
                                                                                                                                            var29 = false;
                                                                                                                                        }

                                                                                                                                        if (var29) {
                                                                                                                                            var29 = ((Code)var25).aI;
                                                                                                                                            if (var29 && var29) {
                                                                                                                                                if (((Code)var25).aH) {
                                                                                                                                                    var29 = false;
                                                                                                                                                }

                                                                                                                                                if (var29) {
                                                                                                                                                    if (((Code)var25).aG) {
                                                                                                                                                        var29 = false;
                                                                                                                                                    }

                                                                                                                                                    if (var29) {
                                                                                                                                                        if (((Code)var25).aF) {
                                                                                                                                                            var29 = false;
                                                                                                                                                        }

                                                                                                                                                        if (var29) {
                                                                                                                                                            if (((Code)var25).aE) {
                                                                                                                                                                var29 = false;
                                                                                                                                                            }

                                                                                                                                                            if (var29 && var29) {
                                                                                                                                                                if (((Code)var25).N) {
                                                                                                                                                                    var29 = false;
                                                                                                                                                                }

                                                                                                                                                                if (var29) {
                                                                                                                                                                    if (((Code)var25).M) {
                                                                                                                                                                        var29 = false;
                                                                                                                                                                    }

                                                                                                                                                                    if (var29) {
                                                                                                                                                                        if (((Code)var25).L) {
                                                                                                                                                                            var29 = false;
                                                                                                                                                                        }

                                                                                                                                                                        if (var29) {
                                                                                                                                                                            if (((Code)var25).y) {
                                                                                                                                                                                var29 = false;
                                                                                                                                                                            }

                                                                                                                                                                            if (var29) {
                                                                                                                                                                                if (((Code)var25).x) {
                                                                                                                                                                                    var29 = false;
                                                                                                                                                                                }

                                                                                                                                                                                if (var29) {
                                                                                                                                                                                    if (((Code)var25).w) {
                                                                                                                                                                                        var29 = false;
                                                                                                                                                                                    }

                                                                                                                                                                                    if (var29) {
                                                                                                                                                                                        if (((Code)var25).a) {
                                                                                                                                                                                            var29 = false;
                                                                                                                                                                                        }

                                                                                                                                                                                        if (var29) {
                                                                                                                                                                                            var29 = ((Code)var25).d;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }

                                if (var29) {
                                    ((Code)var25).x();
                                    I.removeElement(var25);
                                    if (var25 == d) {
                                        d = null;
                                    }
                                } else {
                                    var29 = var25 instanceof B;
                                    if (var25 instanceof B && ((B)var25).I) {
                                        var29 = false;
                                    }

                                    if (var29) {
                                        ((B)var25).Code = 0;
                                    }
                                }
                            }

                            if (var25 == Code && I == 0) {
                                if (au) {
                                    TextBox var32 = Code;
                                    String var10001 = "";

                                    try {
                                        var32.setString(var10001);
                                        Code.setMaxSize(1);
                                    } finally {
                                        ;
                                    }
                                } else {
                                    Code = null;
                                }
                            }

                            Code[var22[var3 + 3]] = null;
                        }
                    } else {
                        var7 = var5;
                        if (var6 == r || var6 == s) {
                            var7 = var22[var3 + 3] + 1;
                        }

                        if (var1 >>> 15 != var1 + 3 + var7 - 1 >> 15) {
                            var1 = (var1 >>> 15) + 1 << 15;
                        }

                        var22[var3 + 3 + -2] = var1 + 3;
                        if ((var21 << 15) + var3 != var1 && Code(var6)) {
                            var10000 = (var21 << 15) + var3 + 3;
                            var6 = var1 + 3;
                            Object var8;
                            var29 = (var8 = Code(var10000)) instanceof Code;
                            if (var29) {
                                var29 = ((Code)var8).bj;
                                if (var29) {
                                    var29 = ((Code)var8).bi;
                                    if (var29) {
                                        if (((Code)var8).bh) {
                                            var29 = false;
                                        }

                                        if (var29) {
                                            if (((Code)var8).bg) {
                                                var29 = false;
                                            }

                                            if (var29) {
                                                var29 = ((Code)var8).bf;
                                                if (var29 && var29) {
                                                    if (((Code)var8).be) {
                                                        var29 = false;
                                                    }

                                                    if (var29 && var29) {
                                                        if (((Code)var8).bd) {
                                                            var29 = false;
                                                        }

                                                        if (var29) {
                                                            var29 = ((Code)var8).bc;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            if (var29) {
                                ((Code)var8).cF = var6;
                            } else {
                                var29 = var8 instanceof Code;
                                if (var8 instanceof Code) {
                                    var29 = ((Code)var8).bj;
                                    if (var29) {
                                        var29 = ((Code)var8).bi;
                                        if (var29) {
                                            if (((Code)var8).bh) {
                                                var29 = false;
                                            }

                                            if (var29) {
                                                if (((Code)var8).bg) {
                                                    var29 = false;
                                                }

                                                if (var29) {
                                                    var29 = ((Code)var8).bf;
                                                    if (var29 && var29) {
                                                        if (((Code)var8).be) {
                                                            var29 = false;
                                                        }

                                                        if (var29 && var29) {
                                                            if (((Code)var8).bd) {
                                                                var29 = false;
                                                            }

                                                            if (var29) {
                                                                if (((Code)var8).bc) {
                                                                    var29 = false;
                                                                }

                                                                if (var29) {
                                                                    if (((Code)var8).bb) {
                                                                        var29 = false;
                                                                    }

                                                                    if (var29) {
                                                                        var29 = ((Code)var8).ba;
                                                                        if (var29) {
                                                                            if (((Code)var8).aZ) {
                                                                                var29 = false;
                                                                            }

                                                                            if (var29) {
                                                                                if (((Code)var8).aY) {
                                                                                    var29 = false;
                                                                                }

                                                                                if (var29 && var29) {
                                                                                    if (((Code)var8).aX) {
                                                                                        var29 = false;
                                                                                    }

                                                                                    if (var29) {
                                                                                        if (((Code)var8).aW) {
                                                                                            var29 = false;
                                                                                        }

                                                                                        if (var29) {
                                                                                            if (((Code)var8).aV) {
                                                                                                var29 = false;
                                                                                            }

                                                                                            if (var29) {
                                                                                                if (((Code)var8).aU) {
                                                                                                    var29 = false;
                                                                                                }

                                                                                                if (var29) {
                                                                                                    if (((Code)var8).aT) {
                                                                                                        var29 = false;
                                                                                                    }

                                                                                                    if (var29) {
                                                                                                        if (((Code)var8).aS) {
                                                                                                            var29 = false;
                                                                                                        }

                                                                                                        if (var29) {
                                                                                                            if (((Code)var8).aR) {
                                                                                                                var29 = false;
                                                                                                            }

                                                                                                            if (var29) {
                                                                                                                if (((Code)var8).aQ) {
                                                                                                                    var29 = false;
                                                                                                                }

                                                                                                                if (var29) {
                                                                                                                    if (((Code)var8).aP) {
                                                                                                                        var29 = false;
                                                                                                                    }

                                                                                                                    if (var29) {
                                                                                                                        if (((Code)var8).aO) {
                                                                                                                            var29 = false;
                                                                                                                        }

                                                                                                                        if (var29) {
                                                                                                                            if (((Code)var8).aN) {
                                                                                                                                var29 = false;
                                                                                                                            }

                                                                                                                            if (var29) {
                                                                                                                                if (((Code)var8).aM) {
                                                                                                                                    var29 = false;
                                                                                                                                }

                                                                                                                                if (var29) {
                                                                                                                                    if (((Code)var8).aL) {
                                                                                                                                        var29 = false;
                                                                                                                                    }

                                                                                                                                    if (var29) {
                                                                                                                                        if (((Code)var8).aJ) {
                                                                                                                                            var29 = false;
                                                                                                                                        }

                                                                                                                                        if (var29) {
                                                                                                                                            var29 = ((Code)var8).aI;
                                                                                                                                            if (var29 && var29) {
                                                                                                                                                if (((Code)var8).aH) {
                                                                                                                                                    var29 = false;
                                                                                                                                                }

                                                                                                                                                if (var29) {
                                                                                                                                                    if (((Code)var8).aG) {
                                                                                                                                                        var29 = false;
                                                                                                                                                    }

                                                                                                                                                    if (var29) {
                                                                                                                                                        if (((Code)var8).aF) {
                                                                                                                                                            var29 = false;
                                                                                                                                                        }

                                                                                                                                                        if (var29) {
                                                                                                                                                            if (((Code)var8).aE) {
                                                                                                                                                                var29 = false;
                                                                                                                                                            }

                                                                                                                                                            if (var29 && var29) {
                                                                                                                                                                if (((Code)var8).N) {
                                                                                                                                                                    var29 = false;
                                                                                                                                                                }

                                                                                                                                                                if (var29) {
                                                                                                                                                                    if (((Code)var8).M) {
                                                                                                                                                                        var29 = false;
                                                                                                                                                                    }

                                                                                                                                                                    if (var29) {
                                                                                                                                                                        if (((Code)var8).L) {
                                                                                                                                                                            var29 = false;
                                                                                                                                                                        }

                                                                                                                                                                        if (var29) {
                                                                                                                                                                            if (((Code)var8).y) {
                                                                                                                                                                                var29 = false;
                                                                                                                                                                            }

                                                                                                                                                                            if (var29) {
                                                                                                                                                                                if (((Code)var8).x) {
                                                                                                                                                                                    var29 = false;
                                                                                                                                                                                }

                                                                                                                                                                                if (var29) {
                                                                                                                                                                                    if (((Code)var8).w) {
                                                                                                                                                                                        var29 = false;
                                                                                                                                                                                    }

                                                                                                                                                                                    if (var29) {
                                                                                                                                                                                        if (((Code)var8).a) {
                                                                                                                                                                                            var29 = false;
                                                                                                                                                                                        }

                                                                                                                                                                                        if (var29) {
                                                                                                                                                                                            var29 = ((Code)var8).d;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }

                                if (var29) {
                                    ((Code)var8).bk = var6;
                                } else {
                                    var29 = var8 instanceof B;
                                    if (var8 instanceof B && ((B)var8).I) {
                                        var29 = false;
                                    }

                                    if (var29) {
                                        ((B)var8).Code = var6;
                                    }
                                }
                            }
                        }

                        var1 += var7 + 3;
                    }
                }

                ++var21;
            }

            for(var1 = an; Code[var1 - 2] == null; --var1) {
            }

            while(Code[var1 - 2] != null) {
                ++var1;
            }

            var21 = var1 << 15;
            var3 = an;

            while(var3 < Code.length && Code[var3] != null) {
                if ((var22 = Code[var3])[1] != 0) {
                    var22[1] = var21 + 3;
                    var21 += 32768;
                    ++var3;
                } else {
                    Code[var3] = null;
                    ++var3;
                }
            }

            var21 = aj;
            var3 = aj >>> 14;

            while(true) {
                byte[] var24;
                label4067:
                while(Code[var3] != null) {
                    var4 = 0;

                    for(var24 = Code[var3]; var4 + 6 <= 16384; var4 += var6 + 6) {
                        var6 = I(var24, var4 + 3);
                        if (var24[var4] == 0 && var24[var4 + 1] == 0) {
                            if (var24[var4 + 2] == 0) {
                                ++var3;
                                continue label4067;
                            }
                        } else {
                            if (var21 >>> 14 != var21 + 6 + var6 - 1 >> 14) {
                                var21 = (var21 >>> 14) + 1 << 14;
                            }

                            J(var21, var24, var4);
                            var21 += var6 + 6;
                        }
                    }

                    ++var3;
                }

                for(var21 = ak; Code[var21 - 2] == null; --var21) {
                }

                while(Code[var21 - 2] != null) {
                    ++var21;
                }

                var3 = var21 << 14;
                var4 = ak;

                while(var4 < Code.length && Code[var4] != null) {
                    if ((var24 = Code[var4])[0] == 0 && var24[1] == 0) {
                        Code[var4] = null;
                        ++var4;
                    } else {
                        J(var3, var24, 0);
                        var3 += 16384;
                        ++var4;
                    }
                }

                Z = null;
                aC = n(aC);

                for(var3 = 1; var3 < e.length; ++var3) {
                    if (e[var3] != 0) {
                        e[var3] = n(e[var3]);
                    }
                }

                s(Y);
                s(aa);
                s(ab);
                A = n(A);
                L = n(L);
                M = n(M);
                N = n(N);
                O = n(O);
                P = n(P);
                Q = n(Q);
                T = n(T);
                U = n(U);
                V = n(V);
                R = o(R);
                W = o(W);
                X = o(X);
                I((int[])J, 0, D);
                I((int[])d, 0, ao);

                for(var3 = 0; var3 < F; var3 += 5) {
                    C[var3] = n(C[var3]);
                }

                for(var3 = ap; var3 < var0; var3 += l(var3 + -3) + 3) {
                    s(var3);
                }

                var0 = am >>> 15;

                while(true) {
                    label4010:
                    while(Code[var0] != null) {
                        var3 = 0;

                        for(var22 = Code[var0]; var3 + 3 <= 32768; var3 += var22[var3 + 3 + -3] + 3) {
                            if (var22[var3 + 3 + -1] == 0) {
                                ++var0;
                                continue label4010;
                            }

                            if (var22[var3 + 3 + -2] != 0) {
                                s((var0 << 15) + var3 + 3);
                            }
                        }

                        ++var0;
                    }

                    int[] var26;
                    for(var0 = an; var0 < Code.length; ++var0) {
                        if ((var26 = Code[var0]) != null && var26[1] != 0) {
                            s((var0 << 15) + 3);
                        }
                    }

                    al = am;

                    label3992:
                    for(var0 = am >>> 15; Code[var0] != null; ++var0) {
                        var3 = 0;

                        for(var22 = Code[var0]; var3 + 3 <= 32768; var3 += var5 + 3) {
                            if (var22[var3 + 3 + -1] == 0) {
                                if (var3 == 0 && (var0 << 15) - al > 15000) {
                                    while(true) {
                                        if (Code[var0] == null) {
                                            break label3992;
                                        }

                                        Code[var0++] = null;
                                    }
                                }
                                break;
                            }

                            var5 = var22[var3 + 3 + -3];
                            if (var22[var3 + 3 + -2] != 0) {
                                var6 = var5;
                                if ((var7 = var22[var3 + 3 + -1]) == r || var7 == s) {
                                    var6 = var22[var3 + 3] + 1;
                                    var22[var3 + 3 + -3] = var6;
                                }

                                var7 = var22[var3 + 3 + -2] - 3;
                                var22[var3 + 3 + -2] = 0;
                                al = var7 + 3 + var6;
                                if ((var0 << 15) + var3 != var7) {
                                    System.arraycopy(var22, var3, Code(var7), var7 & 32767, var6 + 3);
                                }
                            }
                        }

                        if (al < (var0 << 15) + '耀') {
                            if (al < var0 << 15) {
                                Z((int[])var22, 0, var22.length);
                            } else {
                                Z(var22, al & 32767, var22.length - (al & 32767));
                            }
                        }
                    }

                    for(var0 = an; var0 < Code.length; ++var0) {
                        if ((var26 = Code[var0]) != null && (var4 = var26[1] >>> 15) != 0) {
                            var26[1] = 0;
                            Code[var0--] = Code[var4];
                            Code[var4] = var26;
                        }
                    }

                    an = var1;
                    ai = aj;

                    label3960:
                    for(var0 = aj >>> 14; Code[var0] != null; ++var0) {
                        var1 = 0;

                        byte[] var28;
                        for(var28 = Code[var0]; var1 + 6 <= 16384; var1 += var4 + 6) {
                            var4 = I(var28, var1 + 3);
                            if (var28[var1] == 0 && var28[var1 + 1] == 0) {
                                if (var28[var1 + 2] == 0) {
                                    if (var1 == 0 && (var0 << 14) - ai > 2000) {
                                        while(true) {
                                            if (Code[var0] == null) {
                                                break label3960;
                                            }

                                            Code[var0++] = null;
                                        }
                                    }
                                    break;
                                }
                            } else {
                                byte[] var27 = Z(var5 = I(var28, var1));
                                var7 = var5 & 16383;
                                var27[var7] = 0;
                                var27[var7 + 1] = 0;
                                var27[var7 + 2] = 1;
                                ai = var5 + 6 + var4;
                                if ((var0 << 14) + var1 != var5) {
                                    System.arraycopy(var28, var1 + 3, var27, var7 + 3, var4 + 6 - 3);
                                }
                            }
                        }

                        if (ai < (var0 << 14) + 16384) {
                            if (ai < var0 << 14) {
                                c(var28, 0, var28.length);
                            } else {
                                c(var28, ai & 16383, var28.length - (ai & 16383));
                            }
                        }
                    }

                    for(var0 = ak; var0 < Code.length; ++var0) {
                        byte[] var23;
                        if ((var23 = Code[var0]) != null) {
                            var3 = I((byte[])var23, 0) >>> 14;
                            var23[0] = 0;
                            var23[1] = 0;
                            if (var3 != 0) {
                                Code[var0--] = Code[var3];
                                Code[var3] = var23;
                            }
                        }
                    }

                    ak = var21;
                    boolean var31;
                    if ((al & 32767) >= 22768) {
                        var10000 = al + '耀';

                        try {
                            if (Code(var10000) == null) {
                                g(al + '耀' >>> 15);
                            }
                        } catch (Throwable var20) {
                            var31 = false;
                            return;
                        }
                    }

                    try {
                        if ((ai & 16383) >= 15384 && Z(ai + 16384) == null) {
                            l(ai + 16384 >>> 14);
                        }

                        return;
                    } catch (Throwable var19) {
                        var31 = false;
                        return;
                    }
                }
            }
        }
    }

    private B Code(byte[] var1, int var2, int var3, int var4, int var5, int var6, B[] var7, boolean var8) {
        if (var4 != 0 && var5 != 0 && var6 != 0) {
            B var9 = null;
            byte[] var10;
            if (ae && var2 != 0) {
                var10 = new byte[var3];
                System.arraycopy(var1, var2, var10, 0, var3);
                var1 = var10;
                var2 = 0;
            }

            int[] var19;
            int var27;
            if (var1[var2] != 82 && var1[var2] != 67 && var1[var2] != 88) {
                int var24;
                if (!af && var1[var2] != -119) {
                    int var11;
                    if (var6 == -1) {
                        var19 = new int[3];
                        int var21 = var2;
                        var10 = var1;
                        if (ae && var2 != 0) {
                            var19[0] = var19[1] = var19[2] = 0;
                            bY = 0;
                            bZ = 0;
                        } else if ((var3 < 4 || var1[var2] != 82) && var1[var2] != 67 && var1[var2] != 88) {
                            var11 = 0;
                            int var12 = 0;
                            if (var3 >= 23 && var1[var2] == -119) {
                                var11 = Code(var1, var2 + 16);
                                var12 = Code(var1, var2 + 20);
                            } else if (var1[var2] == -1 && var1[var2 + 1] == -40) {
                                int var13 = 2;

                                label219:
                                while(true) {
                                    while(true) {
                                        do {
                                            if (var13 >= var3 || var10[var21 + var13] != -1) {
                                                break label219;
                                            }

                                            ++var13;
                                        } while(var10[var21 + var13] == -1);

                                        if (var10[var21 + var13] == 0) {
                                            break label219;
                                        }

                                        if (var10[var21 + var13] != 1 && (var10[var21 + var13] < -48 || var10[var21 + var13] > -41)) {
                                            if (var10[var21 + var13] == -64 || var10[var21 + var13] == -62) {
                                                var11 = B(var10, var21 + var13 + 6);
                                                var12 = B(var10, var21 + var13 + 4);
                                                break label219;
                                            }

                                            ++var13;
                                            var13 += B(var10, var21 + var13);
                                        } else {
                                            ++var13;
                                        }
                                    }
                                }
                            }

                            var19[1] = var11 * var12 * Z;
                            bY = var11;
                            bZ = var12;
                            var19[0] = var19[2] = var19[1];
                        } else {
                            if (var1[var2] == 88) {
                                var19[0] = var1[var2 + 1] << 3 | (var1[var2 + 2] >>> 5 & 7) * ((var1[var2 + 2] & 31) << 6) | (var1[var2 + 3] >>> 2 & 63) * Z;
                            } else {
                                var19[0] = var1[var2 + 1] * var1[var2 + 2] * Z;
                            }

                            var19[1] = var19[2] = var19[0];
                            bY = 0;
                            bZ = 0;
                        }

                        var6 = bY;
                        var21 = bZ;
                        if (var6 <= 0) {
                            return null;
                        }

                        var6 = Math.max(Math.min(256, (var4 << 8) / var6), Math.min(256, (var5 << 8) / var21));
                    }

                    Code var23 = new Code(false, '\u0000');
                    if (var6 == 256) {
                        if (var23.Code(var1, var2, var3, 0, false) == 0 && var23.az != 0 && var23.b != 0) {
                            if (var23.az >= var4 && var23.b >= var5) {
                                var9 = this.Code(var23.x, var23.az, var23.b, false, var8);
                            } else {
                                var9 = this.Code((int[])var23.x, (int)var23.az, var23.b, var4, (int)var5, (int)1);
                            }
                        }
                    } else {
                        if (m()) {
                            return null;
                        }

                        var27 = (var24 = var23.Code(var1, var2, var3, 0, true)) >> 16;
                        var24 &= 65535;

                        for(var11 = 3; 256 >> var11 <= var6; --var11) {
                        }

                        if (var27 >> var11 == 0 || var24 >> var11 == 0) {
                            return null;
                        }

                        if (var23.Code(var1, var2, var3, var11, false) == 0) {
                            if (var4 == -1 || var5 == -1) {
                                var5 = (var24 * var6 << 8) + '\uffff' >> 16;
                                var4 = (var27 * var6 << 8) + '\uffff' >> 16;
                            }

                            byte var16 = 0;
                            if (var23.az < var4 || var23.b < var5) {
                                var16 = 1;
                            }

                            var9 = this.Code((int[])var23.x, (int)var23.az, var23.b, var4, (int)var5, (int)var16);
                        }
                    }
                } else {
                    byte var28 = 0;
                    int var10002 = var2;
                    var2 = var3;
                    var3 = var10002;
                    Image var17 = Image.createImage(var1, var3, var2);
                    var3 = (var1[var3] - -119 | -(var1[var3] - -119)) >>> 31 ^ 1;
                    B var18 = new B(var17, (boolean)var3);
                    if (var8) {
                        var3 = var18.Code.getWidth();
                        var24 = var18.Code.getHeight();
                        int[] var29 = new int[var3 * var24];
                        var18.Code(var29, var3, 0, 0, var3, var24);
                        var18 = this.Code(var29, var3, var24, var18.Code, true);
                    }

                    var9 = var18;
                    if (var6 == 256) {
                        var5 = var18.Code.getHeight();
                        var4 = var18.Code.getWidth();
                    } else if (var6 >= 0) {
                        var5 = (var18.Code.getHeight() * var6 << 8) + '\uffff' >> 16;
                        var4 = Math.max(1, var18.Code.getWidth() * var5 / var18.Code.getHeight());
                    }

                    if (var18.Code.getHeight() != var5 || var18.Code.getWidth() != var4) {
                        if (var7 != null) {
                            var7[0] = var18;
                        }

                        if (m()) {
                            return null;
                        }

                        if (var5 > var18.Code.getHeight() || var4 > var18.Code.getWidth()) {
                            if (var18.Code) {
                                var28 = 2;
                            } else {
                                var28 = 1;
                            }
                        }

                        var9 = var18.Code(0, 0, var18.Code.getWidth(), var18.Code.getHeight(), var4, var5, 0, 0, 0, 0, var28, var18.Code);
                    }
                }
            } else {
                if (var1[var2] == 88) {
                    var4 = var1[var2 + 1] << 3 | var1[var2 + 2] >>> 5 & 7;
                    var5 = (var1[var2 + 2] & 31) << 6 | var1[var2 + 3] >>> 2 & 63;
                } else {
                    var4 = var1[var2 + 1];
                    var5 = var1[var2 + 2];
                }

                var19 = new int[var4 * var5];
                if (var1[var2] == 82) {
                    var2 += 3;

                    for(var3 = 0; var3 < var4 * var5; var2 += 4) {
                        var19[var3] = ((var1[var2] & 255) << 24) + ((var1[var2 + 1] & 255) << 16) + ((var1[var2 + 2] & 255) << 8) + (var1[var2 + 3] & 255);
                        ++var3;
                    }
                } else {
                    int var14;
                    byte[] var20;
                    a var25;
                    int var26;
                    if (var1[var2] == 67) {
                        var20 = new byte[var4 * var5 << 1];
                        (var25 = new a()).Code(var20);
                        var25.I(var1, var2 + 3, var3 - 3);
                        var25.read((byte[])null, 0, var20.length);

                        for(var14 = 0; var14 < var4 * var5 << 1; ++var14) {
                            var2 = (var20[var14] & 240) >>> 4 | var20[var14] & 240;
                            var3 = (var20[var14] & 15) << 4 | var20[var14] & 15;
                            ++var14;
                            var26 = (var20[var14] & 240) >>> 4 | var20[var14] & 240;
                            var27 = (var20[var14] & 15) << 4 | var20[var14] & 15;
                            var19[var14 >> 1] = (var2 << 24) + (var3 << 16) + (var26 << 8) + var27;
                        }
                    } else {
                        var20 = new byte[var4 * var5 * 3];
                        (var25 = new a()).Code(var20);
                        var25.I(var1, var2 + 4, var3 - 4);
                        var25.read((byte[])null, 0, var20.length);

                        for(var14 = 0; var14 < var4 * var5 * 3; ++var14) {
                            var2 = var20[var14] & 252;
                            int var10000 = var20[var14] << 6 & 240;
                            ++var14;
                            var3 = var10000 | var20[var14] >> 2 & 60;
                            var10000 = var20[var14] << 4 & 240;
                            ++var14;
                            var26 = var10000 | var20[var14] >> 4 & 12;
                            var27 = (var20[var14] & 63) << 2;
                            var2 |= var2 >> 6;
                            var3 |= var3 >> 6;
                            var26 |= var26 >> 6;
                            var27 |= var27 >> 6;
                            var19[var14 / 3] = (var2 << 24) + (var3 << 16) + (var26 << 8) + var27;
                        }
                    }
                }

                var9 = this.Code(var19, var4, var5, true, var8);
            }

            if (var9 != null && var9.Code.getHeight() == 0) {
                throw new OutOfMemoryError("");
            } else {
                return var9;
            }
        } else {
            return null;
        }
    }

    private synchronized boolean v() {
        B[] var1 = this.aN ? this.N.Code : this.N.I;
        int var2 = this.aN ? 256 : this.H();
        int var3 = 0;
        int var4 = 0;

        boolean var5;
        int var7;
        int var8;
        int var10001;
        int var10002;
        int var10003;
        int var10004;
        while(true) {
            if (var4 >= this.N.az) {
                return false;
            }

            if (var1[var4] == null && (this.N.h[var3 + 2] & -2147483648) == 0 && this.c(var3) && this.b(this.N.h[var3 + 1])) {
                var5 = this.aE && this.N.h[var3 + 5] == 0;
                if (this.N.C <= 0) {
                    break;
                }

                var10001 = this.N.h[var3 + 1];
                var10003 = this.N.h[var3 + 5] >>> 16;
                var10004 = this.N.h[var3 + 5] & '\uffff';
                int[] var6 = A;
                var7 = var10004;
                var8 = var10003;
                int var10 = var10001;
                byte[] var10000 = this.g;
                var10001 = var10 + 2;
                var10002 = B(this.g, var10);
                var10004 = var8 == 0 ? -1 : var8;
                var7 = var7 == 0 ? -1 : var7;
                var8 = var10004;
                var10 = var10002;
                int var11 = var10001;
                byte[] var12 = var10000;
                boolean var13 = var8 != -1 && var7 != -1;
                if (ae && var11 != 0) {
                    var6[0] = var6[1] = var6[2] = 0;
                    bY = 0;
                    bZ = 0;
                } else if ((var10 < 4 || var12[var11] != 82) && var12[var11] != 67 && var12[var11] != 88) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    if (var10 >= 23 && var12[var11] == -119) {
                        var14 = Code(var12, var11 + 16);
                        var15 = Code(var12, var11 + 20);
                    } else if (var12[var11] == -1 && var12[var11 + 1] == -40) {
                        int var17 = 2;

                        label138:
                        while(true) {
                            while(true) {
                                do {
                                    if (var17 >= var10 || var12[var11 + var17] != -1) {
                                        break label138;
                                    }

                                    ++var17;
                                } while(var12[var11 + var17] == -1);

                                if (var12[var11 + var17] == 0) {
                                    break label138;
                                }

                                if (var12[var11 + var17] != 1 && (var12[var11 + var17] < -48 || var12[var11 + var17] > -41)) {
                                    if (var12[var11 + var17] == -64 || var12[var11 + var17] == -62) {
                                        var14 = B(var12, var11 + var17 + 6);
                                        var15 = B(var12, var11 + var17 + 4);
                                        break label138;
                                    }

                                    ++var17;
                                    var17 += B(var12, var11 + var17);
                                } else {
                                    ++var17;
                                }
                            }
                        }

                        var10 = var13 ? (var7 << 8) / var14 : var2;
                        if (!af && var10 < 256) {
                            for(var16 = 8; 256 / var16 <= var10; var16 /= 2) {
                            }
                        }
                    }

                    bY = var7;
                    bZ = var8;
                    var6[1] = var7 * var8 * Z;
                    if (var2 != 256) {
                        var6[0] = ((var7 * var2 - 1) / 256 + 1) * ((var8 * var2 - 1) / 256 + 1) * Z;
                        if (var16 > 0) {
                            var6[2] = var6[0] + var14 * var15 * Z / var16;
                        } else {
                            var6[2] = var6[0] + var6[1];
                        }
                    } else {
                        var6[0] = var6[2] = var6[1];
                    }
                } else {
                    if (var12[var11] == 88) {
                        var6[0] = var12[var11 + 1] << 3 | (var12[var11 + 2] >>> 5 & 7) * ((var12[var11 + 2] & 31) << 6) | (var12[var11 + 3] >>> 2 & 63) * Z;
                    } else {
                        var6[0] = var12[var11 + 1] * var12[var11 + 2] * Z;
                    }

                    var6[1] = var6[2] = var6[0];
                    bY = 0;
                    bZ = 0;
                }

                if (this.N.I(A[2])) {
                    if (var5 && var2 != 256 && !this.N.I(A[0] + A[1])) {
                        var5 = false;
                    }
                    break;
                }

                int[] var21 = this.N.h;
                var21[var3 + 2] |= -2147483648;
                this.R(var3);
            }

            ++var4;
            var3 += 6;
        }

        Code var22 = M;
        var10001 = this.N.h[var3];
        var10002 = this.N.h[var3 + 1];
        var10003 = var2;
        var10004 = this.N.h[var3 + 2] & 1073741823;
        int var10005 = this.N.h[var3 + 3];
        int var10006 = this.N.h[var3 + 5] >>> 16;
        var2 = this.N.h[var3 + 5] & '\uffff';
        var3 = var10006;
        var4 = var10005;
        int var19 = var10004;
        int var20 = var10003;
        var7 = var10002;
        var8 = var10001;
        Code var9 = var22;
        var22.aI = true;
        var9.bl = var8;
        var9.bh = var7;
        var9.az = var20;
        var9.C = var19;
        var9.bm = var4;
        var9.b = var2;
        var9.a = var3;
        var9.N = var5;
        return true;
    }

    private void ad() {
        // $FF: Couldn't be decompiled
    }

    public final void run() {
        // $FF: Couldn't be decompiled
    }

    public final void Code(Code var1) {
        Object var2;
        synchronized(var2 = Code){}
        Code var54;
        if (e) {
            synchronized(var2 = Code){}
            if (e) {
                var54 = var1;
                Graphics var56 = var1.Code;

                try {
                    var54.J(var56.getClipX(), var1.Code.getClipY(), var1.Code.getClipWidth(), var1.Code.getClipHeight(), 16777215);
                    e();
                    int var53 = m - h / 2 - 15 - J.Code.getHeight();
                    int var4;
                    if (Code != null && Code.Code.getHeight() <= var53) {
                        var4 = C(k * 40 / 100 - Code.Code.getHeight() / 2, 0, var53 - 15 - Code.Code.getHeight());
                        var1.Code(Code, (j - Code.Code.getWidth()) / 2, var4);
                        if ((var4 = var53 - var4 - Code.Code.getHeight()) < 15) {
                            var53 += (15 - var4) / 2;
                        }
                    }

                    var1.Code(J, (j - J.Code.getWidth()) / 2, var53);
                    var53 = Math.min(180, j * 95 / 100);
                    var4 = (j - var53) / 2;
                    Code(var1, I, var4, i, var53, h);
                    Code(var1, Z, var4, i, var53 * e / 1000, h);
                    if (Z != null) {
                        var1.Code(Z, (j - f) / 2, l, Code, 0);
                    }
                } finally {
                    ;
                }

                C(var1);
            }
        } else {
            boolean var52 = false;
            f = var1;
            Graphics var10000 = var1.Code;
            boolean var26 = false;

            boolean var10001;
            try {
                var26 = true;
                bb = var10000.getClipX();
                bc = f.Code.getClipY();
                bd = f.Code.getClipWidth();
                be = f.Code.getClipHeight();
                long var3 = System.currentTimeMillis();
                synchronized(this){}
                if (!f && !g) {
                    f = true;
                } else {
                    label744: {
                        j = true;
                        var54 = this;

                        Throwable var55;
                        label721: {
                            try {
                                var54.notifyAll();
                            } catch (Throwable var49) {
                                var55 = var49;
                                var10001 = false;
                                break label721;
                            }

                            while(true) {
                                try {
                                    if (!j) {
                                        break label744;
                                    }

                                    int var6;
                                    if ((var6 = (int)(var3 + 1000L - System.currentTimeMillis())) <= 0) {
                                        j = false;
                                        this.Code(bb, bc, bd, be);
                                        f = null;
                                        return;
                                    }

                                    this.wait((long)var6);
                                } catch (Throwable var48) {
                                    var55 = var48;
                                    var10001 = false;
                                    break;
                                }
                            }
                        }

                        Throwable var51 = var55;
                        throw var51;
                    }
                }

                var52 = true;
                I = false;
                aM = 0;
                aN = 0;
                aO = 0;
                aP = 0;
                aQ = 0;
                aR = 0;
                aS = 0;
                aT = 0;
                aU = 0;
                aV = 0;
                aW = 0;
                aX = 0;
                aY = 0;
                aZ = 0;
                ba = 0;
                bf = 0;
                bg = 0;
                this.w(aC);
                this.o();
                var52 = false;
                C(var1);
                var26 = false;
            } finally {
                if (var26) {
                    if (!var52) {
                        var54 = this;
                        boolean var19 = false;

                        try {
                            var19 = true;
                            var54.I();
                            var19 = false;
                        } finally {
                            if (var19) {
                                if (var52) {
                                    this.Z();
                                }

                                f = null;
                            }
                        }

                        var52 = true;
                    }

                    var54 = this;
                    var10001 = false;

                    try {
                        var54.J(var10001);
                        I((int)0);
                        c.b((int)60);
                    } finally {
                        ;
                    }
                }
            }

            if (var52) {
                this.Z();
            }

            f = null;
        }
    }

    private static void O(int var0) {
        bU = 0;
        bW = 4;
        bX = 1 << bW - 1;
        int var1 = 0;
        int var2 = 2147483647;
        int var3 = 0;
        int[] var4 = new int[]{1, 31, 128, 159, 2143, 2303, 6830, 6911, 7296, 7375, 11098, 11263, 11826, 11903, 13312, 19903, 19904, 19967, 19968, 40907, 40908, 40959, 42648, 42751, 42922, 43001, 43823, 43967, 44032, 55215, 55296, 63743, 65536};
        int var5 = 0;
        int var6 = 1;

        while(true) {
            while(var6 <= 65535) {
                int var7 = Code(var0, (char)(var6++));
                ++bT;
                int var8 = var7 - var1;
                var1 = var7;
                var7 = Math.abs(var8);
                if (var8 == var2 && var6 - 1 != var4[var5]) {
                    ++var3;
                } else {
                    if (var3 > 0) {
                        if (var3 < 4) {
                            for(int var9 = 0; var9 < var3; ++var9) {
                                j(var2, bW);
                            }

                            var3 = 0;
                        } else {
                            j(bX, bW);
                            if (var3 <= 1 << (bW << 1) - 1) {
                                j(var3, bW << 1);
                                var3 = 0;
                            } else {
                                j(2, bW << 1);
                                j(var3, 16);
                                var3 = 0;
                            }
                        }
                    }

                    while(var7 >>> bW - 1 != 0) {
                        j(bX, bW);
                        j(1, bW << 1);
                        ++bW;
                        bX = 1 << bW - 1;
                    }

                    j(var8, bW);
                    if (var6 - 1 == var4[var5]) {
                        var8 = 0;
                        j(0, bW);
                        var3 = var4[var5 + 1] - var4[var5] - 1;
                        var6 = var4[var5 + 1] + 1;
                        var5 += 2;
                    }

                    var2 = var8;
                }
            }

            if (var3 > 0) {
                j(bX, bW);
                j(2, bW << 1);
                j(var3, 16);
            }

            j(bX, bW);
            j(3, bW << 1);
            if (bU != 0) {
                Code.write(bV << 8 - bU);
            }

            return;
        }
    }

    private Code(String var1) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.bd = true;
        super();
        this.p = var1;
    }

    private void at() {
        String var2 = "ÖÅ认千I[jg";
        int var3 = this.I(var2);
        int var4 = this.Code(var2.charAt(0));
        int var5 = this.a() + 10;
        B var6;
        Code var7 = (var6 = Code(var3, var5)).Code();
        int[] var8 = new int[var3];
        var7.J(0, 0, var3, var5, 16777215);
        var6.Code(var8, 1, 0, 0, 1, 1);
        int var9 = var8[0];
        var7.Code(var2, 0, 10, this, 0);
        int var1 = 0;
        int var13 = 0;
        boolean var15 = false;
        boolean var10 = false;

        for(int var11 = var5 - 1; var11 >= 0; --var11) {
            var6.Code(var8, var3, 0, var11, var3, 1);

            for(int var12 = 0; var12 < var3; ++var12) {
                if (var8[var12] != var9) {
                    if (!var15) {
                        var15 = true;
                        var13 = var11 + 1 - var5;
                    }

                    var10 = var12 >= var4;
                    var1 = -var11;
                }
            }
        }

        if (var10) {
            ++var1;
        }

        byte[] var14;
        (var14 = new byte[2])[0] = (byte)(var1 + 10);
        var14[1] = (byte)var13;
        this.Code = var14[0];
        this.I = var14[1];
    }

    private static void ac() {
        System.gc();
        long var0 = Runtime.getRuntime().freeMemory();
        Image.createImage(100, 100);
        if ((var0 -= Runtime.getRuntime().freeMemory()) >= 0L) {
            if (var0 < 1000L) {
                Q = false;
                if (!W) {
                    aH = 2;
                }

                if (B == 0) {
                    Image[] var4 = new Image[500];

                    int var1;
                    for(var1 = 0; var1 < var4.length; ++var1) {
                        Image[] var10000 = var4;
                        int var10001 = var1;
                        byte var10002 = 100;
                        byte var10003 = 100;

                        int var6;
                        try {
                            var10000[var10001] = Image.createImage(var10002, var10003);
                            if (var4[var1].getWidth() == 0) {
                                break;
                            }

                            var6 = var4[var1].getHeight();
                        } finally {
                            ;
                        }

                        if (var6 == 0) {
                            break;
                        }
                    }

                    if (var1 < var4.length) {
                        by = var1 * 100 * 100 * Z / 1024;
                    }

                    for(var1 = 0; var1 < var4.length; ++var1) {
                        var4[var1] = null;
                    }
                }
            } else {
                Q = true;
                int var5;
                if ((var5 = (int)(var0 / 10000L)) > 0 && var5 <= 4) {
                    Z = var5;
                }
            }

        }
    }

    private Code(Code var1) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aV = true;
        super();
        this.C = var1;
        this.B = new B(var1);
        this.a = new B(var1);
        this.B = false;
    }

    private static int t() {
        switch(s()) {
            case -9:
            case -8:
            case -6:
            case -2:
                return 35;
            case -7:
            case -4:
            case -3:
            case -1:
            default:
                return 48;
            case -5:
                return 42;
        }
    }

    private void m() {
        if (m != n) {
            m = n;
            if (n) {
                c.b((int)48);
            } else {
                c.b((int)49);
            }
        }

        if (l) {
            if (C().equals("hqvga") && C == 0) {
                W();
            }

            l = false;
            int var1 = v();
            int var2 = b.a();
            h(var1, var2);
            int var3 = (var1 * var2 << 1) * Z / 1024;
            if (O) {
                var3 = var3 * 12 / 10;
            }

            bx = Math.max(Math.max(var3, (int)(a * 3L / 10240L)), 150 * Z);
            if (!Q && by > 0) {
                bz = (by - bx) * 9 / 10;
            }

            if (!Q && by > 0 && a <= 2097152L) {
                bz = (by - bx) * 5 / 10;
            }

            I(bx);
            c.b((int)59);
            I(var1);
            I(var2);
            c.b((int)50);
            if (o) {
                I((int)Code.Z());
                c.b((int)51);
            }

            c.b((int)46);
            Code((Object)this);
        } else {
            c.b((int)46);
        }

        if (k && !Code) {
            Code = true;
        }

        n();
    }

    private static int q() {
        if (aJ >= 4) {
            return -1;
        } else {
            if (Code != null) {
                boolean var0 = false;
                int var1;
                if ((var1 = Code.Code) == -1) {
                    var0 = true;
                } else {
                    if (var1 == 0) {
                        return 0;
                    }

                    var1 = Math.min(Code.I * 100 / var1, 99);
                    byte[] var2;
                    if ((var2 = Code.Code) == null) {
                        return var1;
                    }

                    String var16 = a();
                    String var3 = J != null ? J : J(var16);
                    Code var5;
                    (var5 = new Code((short)0, false)).a(var2, 0, var2.length);
                    byte[] var4 = new byte[32];
                    var5.I(var4);
                    int var18 = var4.length;
                    byte[] var19 = var4;
                    var18 = Math.min(var18, 128);
                    StringBuffer var6 = new StringBuffer();

                    for(int var7 = 0; var7 < var18; ++var7) {
                        if ((var19[var7] & 255) < 16) {
                            var6.append('0');
                        }

                        var6.append(Integer.toString(var19[var7] & 255, 16));
                    }

                    if (!var6.toString().equals(var3)) {
                        var0 = true;
                    } else {
                        label210: {
                            boolean var23;
                            if (J == null) {
                                var4 = new byte[0];
                                Code var20 = J;
                                String var10001 = "resource";
                                byte[] var10002 = var2;

                                try {
                                    var20.Code(var10001, var10002);
                                    J.Code("resource", var16.getBytes());
                                    J.Code("resource", var3.getBytes());
                                    J.Code("resource", var4);
                                    J.Code("resource", var4);
                                    r = (J = Code.Code) != null;
                                    B = null;
                                    break label210;
                                } catch (IOException var14) {
                                    var23 = false;
                                }
                            } else {
                                label188: {
                                    try {
                                        label180: {
                                            boolean var21;
                                            try {
                                                var21 = (new String(J.Code((String)"resource", (int)5))).equals(J);
                                            } catch (IOException var13) {
                                                byte[] var17 = new byte[0];
                                                J.Code("resource", var17);
                                                J.Code("resource", var17);
                                                break label180;
                                            }

                                            if (var21) {
                                                J = null;
                                                B = null;
                                                Code = null;
                                                return 0;
                                            }
                                        }

                                        J.Code((String)"resource", (int)4, (byte[])var2);
                                        J.Code((String)"resource", (int)5, (byte[])var3.getBytes());
                                    } catch (IOException var15) {
                                        var23 = false;
                                        break label188;
                                    }

                                    B = null;
                                    break label210;
                                }
                            }

                            aK = -3;
                            Code = null;
                            return -1;
                        }
                    }
                }

                if (var0) {
                    String var22 = "resource";

                    try {
                        RecordStore.deleteRecordStore(var22);
                    } finally {
                        ;
                    }

                    if (++aJ < 4) {
                        (Code = new C(B(), b())).start();
                        return 0;
                    }

                    aK = -2;
                    Code = null;
                    return -1;
                }

                Code = null;
            }

            return 100;
        }
    }

    public final void Code() {
        // $FF: Couldn't be decompiled
    }

    private static Object[] Code(String var0) {
        for(var0 = var0.toLowerCase(); var0.startsWith("<"); var0 = var0.substring(var0.indexOf(62) + 1)) {
        }

        int var1;
        String var2;
        if ((var1 = var0.indexOf(58)) != -1 && (var2 = var0.substring(0, var1)).indexOf(46) == -1) {
            var0 = var0.substring(var1 + 1);
        } else {
            var2 = "http";
        }

        Integer var3;
        String var5;
        if (!a.containsKey(var2)) {
            var5 = "";
            var3 = Code;
        } else {
            if (var0.startsWith("//")) {
                var0 = var0.substring(2);
            }

            if ((var1 = var0.indexOf(63)) != -1) {
                var0 = var0.substring(0, var1);
            }

            int var6;
            if ((var6 = var0.indexOf(47)) != -1) {
                var5 = var0.substring(0, var6);
                var0 = var0.substring(var6);
            } else {
                var5 = var0;
                var0 = "";
            }

            if ((var6 = var5.indexOf(64)) != -1) {
                var5 = var5.substring(var6 + 1);
            }

            if (var5.startsWith("www.")) {
                var5 = var5.substring(4);
            }

            int var4;
            if ((var4 = var5.indexOf(58)) != -1) {
                var3 = Integer.valueOf(var5.substring(var4 + 1));
                var5 = var5.substring(0, var4);
            } else {
                var3 = (Integer)a.get(var2);
            }
        }

        return new Object[]{var2, var5, var3, var0};
    }

    private static boolean Code(byte[] var0, int var1, byte[] var2, int var3, int var4) {
        while(true) {
            if (var4-- > 0) {
                if (var0[var1 + var4] == var2[var3 + var4]) {
                    continue;
                }

                return false;
            }

            return true;
        }
    }

    private static void Code(Runnable var0) {
        (new Thread(var0)).start();
    }

    private Code(byte var1) {
    }

    private Code(boolean var1) {
        this.d = true;
        this.b = true;
        this((byte)0);
        this.I = null;
        this.I = this.Code = 0;
        this.a = 0;
    }

    private Code(short var1) {
        this.d = true;
        this.a = true;
        this((byte)0);
        this.a = -1;
    }

    private Code(char var1) {
        this.d = true;
        this((byte)0);
        this.C = -1;
        this.a = -1;
        this.b = -1;
    }

    private static void Code(int var0, String var1, String var2, String var3, String var4, String var5, String var6, Code var7) {
        var7.w();
        int var10000 = var0;
        String var10001 = var1;
        String var10002 = var2;
        String var8 = var6;
        var1 = var5;
        var2 = var4;
        var4 = var10002;
        var5 = var10001;
        int var9 = var10000;
        Code(var5 != null ? Code.C(var5) : 0);
        Code(var4 != null ? Code.C(var4) : 0);
        Code(var3 != null ? Code.C(var3) : 0);
        Code(var2 != null ? Code.C(var2) : 0);
        Code(var1 != null ? Code.C(var1) : 0);
        Code(var8 != null ? Code.C(var8) : 0);
        I(var9);
        if ((var0 = var7.u()) == 0) {
            Code.Z();
        } else {
            Code.Code(var0, (int)24);
        }
    }

    private static char Code(char var0) {
        if (var0 >= ' ' && var0 <= 255) {
            return (char)(var0 - 32);
        } else if (var0 >= 1040 && var0 <= 1103 && aK) {
            return (char)(var0 - 816);
        } else {
            if (aK) {
                switch(var0) {
                    case 'Ё':
                        return 'Ġ';
                    case 'І':
                        return 'Ĩ';
                    case 'Ї':
                        return 'Ģ';
                    case 'Ў':
                        return 'Ĥ';
                    case 'ё':
                        return 'ġ';
                    case 'і':
                        return 'ĩ';
                    case 'ї':
                        return 'ģ';
                    case 'ў':
                        return 'ĥ';
                    case 'ґ':
                        return 'Ħ';
                    case 'Ғ':
                        return 'ħ';
                }
            }

            switch(var0) {
                case '–':
                    return 'v';
                case '—':
                    return 'w';
                case '‘':
                    return 'q';
                case '’':
                    return 'r';
                case '“':
                    return 's';
                case '”':
                    return 't';
                case '„':
                    return 'i';
                case '†':
                    return 'g';
                case '•':
                    return 'u';
                case '…':
                    return 'e';
                case '‰':
                    return 'h';
                case '€':
                    return 'f';
                case '™':
                    return 'j';
                default:
                    return (char)(cf - 1);
            }
        }
    }

    private static void a(Code var0) {
        var0.w();
        int var1;
        if ((var1 = var0.u()) == 0) {
            Code.Z();
        } else {
            Code.Code(var1, (int)17);
        }
    }

    private static int Code(int var0, DataInputStream var1) {
        Code((InputStream)var1, (int)(4 * (var0 & 32767)));
        var0 = var1.readInt();
        int var2 = var1.readInt() + 4 - var0;
        Code((InputStream)var1, (int)var0);
        return var2;
    }

    private static String a(String var0) {
        if (!var0.startsWith("file://")) {
            if (!var0.startsWith("/")) {
                var0 = "/" + var0;
            }

            var0 = "file://" + var0;
        }

        return var0;
    }

    public static String I(String var0) {
        if (var0 == null) {
            return null;
        } else {
            if (!var0.startsWith("file://")) {
                if (!var0.startsWith("/")) {
                    var0 = "/" + var0;
                }

                var0 = "file://" + var0;
            }

            return var0;
        }
    }

    public final String Z() {
        String var1 = null;
        if (this.b != null && !"".equals(this.b)) {
            var1 = this.b;
        }

        if (var1 == null || "".equals(var1)) {
            var1 = this.b.J();
        }

        if (var1 == null || "".equals(var1)) {
            Code var2 = null;
            Code[] var3;
            if ((var3 = this.Code()).length > 0) {
                var2 = var3[0];
            }

            if (var2 != null) {
                if (!(var1 = var2.c).endsWith("/")) {
                    var1 = var1 + "/";
                }

                var1 = var1 + "OperaSavedPages/";
            }
        }

        if (var1 == null || "".equals(var1)) {
            var1 = "OperaSavedPages/";
        }

        this.b = I(var1);
        return this.b;
    }

    private String Code(int var1, int var2) {
        if (var2 == -1) {
            var2 = 16;
        }

        String var3;
        if (!(var3 = this.Z()).endsWith("/")) {
            var3 = var3 + "/";
        }

        return var3 + var1 + ".obml" + var2;
    }

    private Object Code(int var1, String var2, String var3, int var4, String var5, String var6) {
        int var7 = Math.max(5524, var5.length());
        if (cb > 0) {
            var7 = cb;
        }

        if (var1 != -1) {
            var7 = Math.min(var7, var1);
        }

        TextBox var14;
        while(true) {
            if (var7 <= 255) {
                return null;
            }

            if (var5.length() > var7) {
                var5 = var5.substring(0, var7);
            }

            label132: {
                boolean var10001;
                if (!au) {
                    try {
                        Code = new TextBox("", var5, var7, u(var4));
                    } catch (Throwable var13) {
                        var10001 = false;
                        break label132;
                    }
                }

                label128:
                try {
                    (var14 = Code).setTitle("");
                    var14.setString("");
                    var4 = u(var4);
                    if (at) {
                        var4 &= -65537;
                    }

                    var14.setConstraints(var4);
                    var14.setMaxSize(var7);
                    var14.setString(var5);
                    break;
                } catch (Throwable var12) {
                    var10001 = false;
                    break label128;
                }
            }

            var7 -= var7 / 10;
        }

        var14.setTitle(var6 + " (" + var14.getMaxSize() + ")");
        this.Code(new Command(var3, 4, 0), new Command(var2, 3, 0));
        var14.setCommandListener(Code);
        Code.setCurrent(var14);
        return var14;
    }

    private static void C(Code var0) {
        if (H) {
            String var1 = (K ? "*" : "") + bv + ":" + l;
            if (C == null) {
                C = Code(64, (int)0, 0);
            }

            int var2 = (v() - C.I(var1)) / 2;
            var0.Code(var1, var2, 1, C, 16777088);
        }
    }

    private static synchronized void E(int var0) {
        if (bi != 0) {
            bi = (int)((3L * (long)bi + 7L * (long)var0) / 10L);
        } else {
            bi = var0;
        }
    }

    private static byte[] Code(String var0, byte[] var1, int var2, int var3) {
        int var4 = c(var0) + 2;
        byte[] var5 = new byte[var3 + var4 + 5];
        Code(var0, var5, var3);
        int var6 = var3 + var4;
        I(var4, var5, var6);
        var6 += 2;
        var5[var6++] = 1;
        I(32528, var5, var6);
        System.arraycopy(var1, var2, var5, 0, var3);
        return var5;
    }

    private static void h(int var0, int var1) {
        int var10000 = var0;
        var0 = var1;
        var1 = var10000;
        b = Code;
        if (Q) {
            b += (long)(Z * (var1 * var0 + '저' + 102400));
        } else if (W) {
            b += 409600L;
        }

        if (Q && a <= 2097152L) {
            bz = (int)((a - b) / 3072L);
        }

    }

    private static void M(int var0) {
        if (l == null || l.length < var0 << 1) {
            m = null;
            n = null;
            l = null;
            n = new int[(m = new int[var0 << 1]).length];
            l = new int[m.length];
            bN = -1;
            bO = -1;
            Random var2 = new Random(4711L);

            for(int var1 = 0; var1 < l.length >> 1; ++var1) {
                l[var1] = var2.nextInt() & 127;
                l[var1 + (l.length >> 1)] = l[var1] + 64;
            }
        }

    }

    private static void d() {
        B = b;
        String var10000 = "splash";

        boolean var10001;
        label307: {
            short var1;
            String var2;
            int var3;
            String var4;
            DataInputStream var21;
            try {
                if (!a(var10000)) {
                    break label307;
                }

                n = Code((byte[])J.Code((String)"splash", (int)1), (int)0);
                byte[] var0 = J.Code((String)"splash", (int)2);
                if ((var21 = new DataInputStream(new ByteArrayInputStream(var0))).readInt() != 1397764400) {
                    break label307;
                }

                var1 = var21.readShort();
                var2 = "";
                var3 = 0;

                while(true) {
                    if (var3 >= var1) {
                        var1 = var21.readShort();
                        var3 = 0;
                        break;
                    }

                    var4 = var21.readUTF();
                    short var5 = var21.readShort();

                    for(int var6 = 0; var6 < var5; ++var6) {
                        String var7 = var21.readUTF();
                        String var8 = var21.readUTF();
                        if (var4.equals("brand-logo") && var7.equals("bitmap")) {
                            var2 = var8;
                        }
                    }

                    ++var3;
                }
            } catch (Throwable var20) {
                var10001 = false;
                break label307;
            }

            label304:
            while(true) {
                try {
                    while(true) {
                        if (var3 >= var1) {
                            break label304;
                        }

                        var4 = var21.readUTF();
                        int var23 = var21.readInt();
                        if (!var4.equals(var2)) {
                            Code((InputStream)var21, (int)var23);
                            break;
                        }

                        byte[] var22 = new byte[var23];
                        var21.readFully(var22);
                        Code = Z.Code(var22, var22.length, true);
                        ++var3;
                    }
                } catch (Throwable var19) {
                    var10001 = false;
                    break;
                }

                ++var3;
            }
        }

        char var24 = '考';
        var10001 = true;

        label275: {
            B var25;
            try {
                J = Code(var24, var10001);
                I = Code(32772, true);
                Z = Code(32773, true);
                if (Code != null) {
                    break label275;
                }

                var25 = Code(32770, true);
            } finally {
                ;
            }

            Code = var25;
        }

        g = (Code = Code(64, (int)0, 8)).a();
        h = Math.max(I.Code.getHeight(), Z.Code.getHeight());
        e = true;
    }

    private static String I(int var0, int var1, int var2) {
        B(var2, var1);
        var1 = S;
        byte[] var11 = Z;
        int var3 = ((var0 << 2) + 2) / 3;
        int var4 = (4 - var3 % 4) % 4;
        byte[] var5 = new byte[var3 + var4];

        for(int var6 = 0; var6 < var3; ++var6) {
            int var7 = 0;

            for(int var8 = 0; var8 < 6; ++var8) {
                var7 <<= 1;
                int var9 = var6 * 6 + var8;
                byte var10 = 0;
                if (var9 / 8 < var0) {
                    var10 = var11[var1 + var9 / 8];
                }

                var7 |= var10 >> 7 - var9 % 8 & 1;
            }

            char var12;
            if (var7 < 26) {
                var12 = (char)(var7 + 65);
            } else if (var7 < 52) {
                var12 = (char)(97 + (var7 - 26));
            } else if (var7 < 62) {
                var12 = (char)(48 + (var7 - 52));
            } else if (var7 == 62) {
                var12 = '+';
            } else {
                var12 = '/';
            }

            var5[var6] = (byte)var12;
        }

        for(var0 = 0; var0 < var4; ++var0) {
            var5[var3 + var0] = 61;
        }

        return new String(var5);
    }

    private Object Code(RecordStore var1, String var2, int var3, int var4) {
        String var5 = null;
        RecordStore var10000 = var1;

        NullPointerException var16;
        label58: {
            RecordEnumeration var6;
            int var7;
            int var8;
            boolean var10001;
            try {
                var5 = var10000.getName();
                var7 = (var6 = var1.enumerateRecords((RecordFilter)null, (RecordComparator)null, false)).numRecords();
                var8 = 0;
            } catch (NullPointerException var13) {
                var16 = var13;
                var10001 = false;
                break label58;
            }

            while(true) {
                try {
                    if (var8 >= var7) {
                        return null;
                    }

                    int var9;
                    if ((var9 = var6.nextRecordId()) != 0) {
                        byte[] var10;
                        byte[] var11;
                        if ((var11 = var10 = var1.getRecord(var9)) != null && var11.length >= 3 && J(var11, var11.length - 2) == 32528 && var11[var11.length - 3] == 1) {
                            String var15 = Code(var10, I(var10));
                            if (var4 == 0 && var15.equals(var2)) {
                                return new Integer(var9);
                            }

                            if (var4 == 1 && var15.equals(var2)) {
                                return var10;
                            }

                            if (var4 == 2 && var15.charAt(0) - 33 == var3) {
                                var1.deleteRecord(var9);
                            }
                        } else {
                            var1.deleteRecord(var9);
                        }
                    }
                } catch (NullPointerException var12) {
                    var16 = var12;
                    var10001 = false;
                    break;
                }

                ++var8;
            }
        }

        NullPointerException var14 = var16;
        if ("b_6".equals(var5)) {
            this.Code(var1, true);
            RecordStore.deleteRecordStore(var5);
        }

        throw var14;
    }

    private void A(int var1) {
        this.k.F(var1);
    }

    private void I(B var1) {
        this.B.Code(var1);
    }

    private int f() {
        if (this.c) {
            return -1;
        } else if (this.b) {
            return -1;
        } else {
            return this.a ? this.a : this.C;
        }
    }

    private static boolean Code(String var0, String var1, String var2) {
        return var0.indexOf(var1 + "/" + var2) >= 0 || var0.indexOf(var1 + "-" + var2) >= 0;
    }

    private void Z(B var1) {
        this.a.Code(var1);
    }

    private synchronized void k(int var1, int var2) {
        J(var2, 0);
        System.arraycopy(this.t, var1 * 5, Code, Code, 5);
    }

    private static void Code(Code var0, B var1, int var2, int var3, int var4, int var5) {
        if (var5 > var1.Code.getHeight()) {
            var3 += (var5 - var1.Code.getHeight()) / 2;
        }

        var5 = var1.Code.getWidth();
        var5 = Math.min(var1.Code.getWidth() / 3, Math.min(var4 / 2, var5));
        var0.Code((B)var1, 0, 0, var5, var1.Code.getHeight(), var2, var3);
        var0.Code((B)var1, var1.Code.getWidth() - var5, 0, var5, var1.Code.getHeight(), var2 + var4 - var5, var3);
        var0.I(var1, var5, 0, var1.Code.getWidth() - (var5 << 1), var1.Code.getHeight(), var2 + var5, var3, var4 - (var5 << 1), var1.Code.getHeight());
    }

    private synchronized void B(boolean var1) {
        this.m.c = var1;
    }

    private void Code(Command var1, Command var2) {
        for(int var3 = 0; this.Code != null && var3 < this.Code.length; ++var3) {
            Code.removeCommand(this.Code[var3]);
        }

        this.Code = new Command[2];
        this.Code[0] = var1;
        this.Code[1] = var2;

        for(int var4 = 0; var4 < this.Code.length; ++var4) {
            Code.addCommand(this.Code[var4]);
        }

    }

    private byte[] Code(byte var1) {
        byte[] var2 = new byte[this.Code.length];
        byte[] var3 = new byte[this.Code.length];

        int var4;
        byte var5;
        for(var4 = 0; var4 < this.Code.length; ++var4) {
            var5 = Code(this.Code[var4]);
            var3[var4] = var5 == 4 ? 2 : var5;
            var2[var4] = var1;
        }

        byte var9 = var1;
        var5 = -128;
        Stack var6 = new Stack();
        int var7 = 0;

        int var8;
        byte[] var11;
        for(var8 = 0; var8 < this.Code.length; ++var8) {
            switch(this.Code[var8]) {
                case '\u202a':
                    var6.push(new byte[]{var9, var5});
                    var9 = (byte)(var9 + -(var9 & 1) + 2);
                    var5 = -128;
                    break;
                case '\u202b':
                    var6.push(new byte[]{var9, var5});
                    var9 = (byte)(var9 + (var9 & 1) + 1);
                    var5 = -128;
                    break;
                case '\u202c':
                    if (!var6.empty()) {
                        var9 = (var11 = (byte[])var6.pop())[0];
                        var5 = var11[1];
                    }
                    break;
                case '\u202d':
                    var6.push(new byte[]{var9, var5});
                    var9 = (byte)(var9 + -(var9 & 1) + 2);
                    var5 = 1;
                    break;
                case '\u202e':
                    var6.push(new byte[]{var9, var5});
                    var9 = (byte)(var9 + (var9 & 1) + 1);
                    var5 = 2;
                    break;
                default:
                    var2[var8] = var9;
                    if (var5 != -128) {
                        var3[var8] = var5;
                    }

                    ++var7;
            }
        }

        if (var7 < this.Code.length) {
            char[] var12 = new char[var7];
            var11 = new byte[var7];
            byte[] var10 = new byte[var7];
            var7 = 0;

            for(var8 = 0; var7 < this.Code.length; ++var7) {
                if (this.Code[var7] < 8234 || this.Code[var7] > 8238) {
                    var12[var8] = this.Code[var7];
                    var11[var8] = var2[var7];
                    var10[var8] = var3[var7];
                    ++var8;
                }
            }

            this.Code = var12;
            var2 = var11;
            var3 = var10;
        }

        var4 = 0;
        int var14 = 1;

        byte var15;
        for(byte var13 = var1; var4 < var2.length; var13 = var15) {
            for(var15 = var2[var4]; var14 < var2.length && var2[var14] == var15; ++var14) {
            }

            var13 = Code((byte)Math.max(var13, var15));
            byte var16 = Code((byte)Math.max(var14 < var2.length ? var2[var14] : var1, var15));
            Code(var3, var15, var4, var14, var13, var16);
            Code(var3, var2, var4, var14);
            var4 = var14;
        }

        return var2;
    }

    private static void V() {
        Object var0;
        synchronized(var0 = Z){}
        long var1 = d;
        long var3 = e;
        long var5 = c;
        c = 0L;
        e = 0L;
        d = 0L;
        long var7 = var1 - var5;
        Code.I();
        byte var10000 = 10;
        byte var10001 = 51;
        boolean var11 = false;

        try {
            var11 = true;
            int var13 = a(var10000, var10001);
            int var9 = (int)var1;
            a(var13, var9);
            int var14 = (int)(var1 >> 32);
            a(var13 + 1, var14);
            var14 = (int)var3;
            a(var13 + 2, var14);
            var14 = (int)(var3 >> 32);
            a(var13 + 3, var14);
            var14 = (int)var7;
            a(var13 + 4, var14);
            var14 = (int)(var7 >> 32);
            a(var13 + 5, var14);
            var14 = (int)var5;
            a(var13 + 8, var14);
            var14 = (int)(var5 >> 32);
            a(var13 + 9, var14);
            Code(var13);
            var11 = false;
        } finally {
            if (var11) {
                Code.Z();
                return;
            }
        }

        Code.v(6);
    }

    private static int[] Code(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        return new int[]{var0, var1, var2, var3, var4, var5, var6, var7, var8, var9};
    }

    public static int Code() {
        return (int)System.currentTimeMillis();
    }

    private void Code(B var1) {
        this.B.Code(var1);
    }

    public static String Code(int var0, String var1) {
        return (char)(var0 + 33) + var1;
    }

    public static void Code(int var0, String var1) {
        Code(var1 != null ? Code.C(var1) : 0);
        I(var0);
    }

    private static InputStream Code(String var0) {
        if ((var0 = var0).charAt(0) != '/') {
            var0 = "/" + var0;
        }

        return Code("Browser").getResourceAsStream(var0);
    }

    public static void C() {
        C((int)System.currentTimeMillis());
    }

    private Code(int var1, byte var2) {
        this.d = true;
        this.a = true;
        this((byte)0);
        this.a = var1;
    }

    private Code(Font var1) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aZ = true;
        super();
        this.Code = var1;
        this.at();
    }

    private Code(Code var1, byte var2) {
        this.bj = true;
        this.bi = true;
        super();
        this.C = var1;
        this.B = new B(var1);
    }

    public Code(Code var1, short var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        super();
        f = true;
        aA = -1;
        I = new Vector();
        o = true;
        Code = this;
        b = var1;
    }

    private static void Code(long var0, long var2, long var4) {
        Object var6;
        synchronized(var6 = Z){}
        d += var0;
        e += var2;
        c += var4;
    }

    private Code(Code var1, char var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        super();
        J = new int[1024];
        B = new int[1024];
        C = new int[1024];
        af = 11;
        Code = new RuntimeException();
        Code = new byte[16][];
        Code = new int[16][];
        ar = -1;
        J = new byte[16];
        Code = new Object[1024];
        av = 0;
        aw = 0;
        ax = -1;
        a = var1;
    }

    static {
        int[] var10000 = new int[]{1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
        I = new String[4];
        Z = new Object();
        J = new Object();
        k = "am,ar,as,az,bn,bs,cs,el,fa,gu,ha,he,hi,hr,hu,hy,ig,ja,ka,kk,km,kn,ko,ks,ky,lo,lt,lv,mk,ml,mn,mr,or,pa,pl,ps,ro,si,sk,sl,sr,ta,te,tg,th,tk,tr,ur,uz,vi,yo,zh-cn,zh-hk,zh-tw,";
        bN = -1;
        bO = -1;
        bP = 313;
        bQ = 33;
        bR = 275;
        n = new byte[32];
        o = new byte[32];
        p = new byte[]{34, 34, 35, 35, 37, 37, 39, 39};
        q = new byte[]{33, 34, 34, 35, 35, 36, 36, 37, 37, 38, 38, 38, 38, 39, 39, 40, 40, 40, 40, 41, 41, 42, 42, 42, 42, 43, 43, 43, 43, 44, 44, 44, 44, 45, 45, 45, 45, 46, 46, 46, 46, 47, 47, 48, 48, 49, 49, 50, 50, 51, 51, 51, 51, 52, 52, 52, 52, 53, 53, 53, 53, 54, 54, 54, 54, 55, 55, 55, 55, 56, 56, 56, 56, 57, 57, 57, 57, 58, 58, 58, 58, 65, 65, 65, 65, 66, 66, 66, 66, 67, 67, 67, 67, 68, 68, 68, 68, 69, 69, 69, 69, 70, 70, 70, 70, 71, 71, 71, 71, 72, 72, 73, 73, 74, 74, 74, 74};
        bY = -1;
        bZ = -1;
        (a = new Hashtable(6)).put("http", new Integer(80));
        a.put("https", new Integer(443));
        a.put("ftp", new Integer(21));
        a.put("rtsp", new Integer(554));
        Code = new Integer(0);
        w = new Code("i", "*", 0, "/firsttime/*", 1);
        x = new Code("server", "*", 0, "setup", 1);
        y = new Code(0, 0, "mini5.opera-mini.net", 80, 1080, "c1dd7ab77e2c967746fe10681026c920f864811321bcb8be6bbfa5a03fda4e16c9c8db3af280f7703366e778e93c55e7159a8852d2b1381e521a337f22b1406cddf41a3114aecb4f4bfe79e0c5aa2ba8824fc989cb8bdcbf8ec5cef5176bfd4059f229b91bfa025126b295f9c409e75f6f6415ee094fd7f5dfd395a1f431668c5a08e88de891dc4dd38d4e9aa9b9c00dc604a0428e3aa5a28ccfa75af099147b", "mini5.opera-mini.net");
        Z = -1;
        E = true;
        J = -1;
        B = -1;
        g = "";
        h = "";
        C = new Hashtable();
        G = false;
        I = new Object();
        bv = -1;
        B = new Vector(2);
        C = null;
        k = Code((byte[])Z("428a2f9871374491b5c0fbcfe9b5dba53956c25b59f111f1923f82a4ab1c5ed5d807aa9812835b01243185be550c7dc372be5d7480deb1fe9bdc06a7c19bf174e49b69c1efbe47860fc19dc6240ca1cc2de92c6f4a7484aa5cb0a9dc76f988da983e5152a831c66db00327c8bf597fc7c6e00bf3d5a7914706ca63511429296727b70a852e1b21384d2c6dfc53380d13650a7354766a0abb81c2c92e92722c85a2bfe8a1a81a664bc24b8b70c76c51a3d192e819d6990624f40e3585106aa07019a4c1161e376c082748774c34b0bcb5391c0cb34ed8aa4a5b9cca4f682e6ff3748f82ee78a5636f84c878148cc7020890befffaa4506cebbef9a3f7c67178f2"), 0, 256);
        o = new Code((short)0, '\u0000');
        Code = new TextBox("", "", 1, 0);
        e = "\u0003\u0001" + '\u0016' + "../:_-~%$?=&!+#*@,;\\'()";
        new Code('\u0000', (byte)0);
        Z = new Hashtable();
        i = new int[4];
        i = new byte[0];
        new Code((byte)0, 0);
        a = "";
        aH = 1;
        aI = -1;
        e = new int[32];
        f = new int[32];
        Z = new Vector();
        Code = new Object();
    }

    private static void Code(int[] var0, int var1, int var2, int var3, int var4, int var5, int[] var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13) {
        if (var3 != 0 && var4 != 0 && var9 != 0 && var10 != 0) {
            if (var3 == var9 && var4 == var10) {
                Code(var0, var1, var2, var5, var6, var7, var8, var11, var3, var4);
            } else {
                var1 += var2 * var5;
                var2 = var7 + var8 * var11;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var4 == 2 && var10 >= 2 && var3 == var9) {
                    for(var3 += var1; var1 < var3; ++var2) {
                        var4 = var0[var1];
                        var7 = var0[var1 + var5];
                        var8 = var4 >> 8 & 16711680;
                        var9 = var4 & 16711680;
                        var12 = var4 << 8 & 16711680;
                        var4 = var4 << 16 & 16711680;
                        int var22 = ((var7 >> 8 & 16711680) - var8) / (var10 - 1);
                        var14 = ((var7 & 16711680) - var9) / (var10 - 1);
                        var15 = ((var7 << 8 & 16711680) - var12) / (var10 - 1);
                        var7 = ((var7 << 16 & 16711680) - var4) / (var10 - 1);
                        var16 = 0;

                        for(var17 = var2; var16 < var10; var17 += var11) {
                            var6[var17] = (var8 & 16711680) << 8 | var9 & 16711680 | (var12 & 16711680) >> 8 | var4 >> 16;
                            var8 += var22;
                            var9 += var14;
                            var12 += var15;
                            var4 += var7;
                            ++var16;
                        }

                        ++var1;
                    }

                } else {
                    var7 = (var3 << 8) / var9;
                    var8 = (var4 << 8) / var10;
                    var12 = var7 <= 512 && var8 <= 512 ? var12 : 0;
                    --var3;
                    --var4;
                    if (var3 == 0 || var4 == 0 || var9 == 1 || var10 == 1) {
                        var12 = 0;
                    }

                    if (var12 == 1) {
                        for(var7 = 0; var7 < var10; ++var7) {
                            var12 = (var8 = (var7 * var4 << 8) / (var10 - 1)) & 255;
                            var8 >>>= 8;

                            for(var14 = 0; var14 < var9; ++var14) {
                                var16 = (var15 = (var14 * var3 << 8) / (var9 - 1)) & 255;
                                var15 >>>= 8;
                                var17 = var2 + var11 * var7 + var14;
                                int var18 = Math.min(var15 + 1, var3);
                                int var19 = Math.min(var8 + 1, var4);
                                int var20 = var0[var1 + var5 * var8 + var15];
                                int var21 = var0[var1 + var5 * var8 + var18];
                                var15 = var0[var1 + var5 * var19 + var15];
                                var18 = var0[var1 + var5 * var19 + var18];
                                var6[var17] = (var13 ? (var20 >>> 24) * (256 - var16) * (256 - var12) + (var21 >>> 24) * var16 * (256 - var12) + (var15 >>> 24) * (256 - var16) * var12 + (var18 >>> 24) * var16 * var12 >>> 16 << 24 : 0) + ((var20 >> 16 & 255) * (256 - var16) * (256 - var12) + (var21 >> 16 & 255) * var16 * (256 - var12) + (var15 >> 16 & 255) * (256 - var16) * var12 + (var18 >> 16 & 255) * var16 * var12 >>> 16 << 16) + ((var20 >> 8 & 255) * (256 - var16) * (256 - var12) + (var21 >> 8 & 255) * var16 * (256 - var12) + (var15 >> 8 & 255) * (256 - var16) * var12 + (var18 >> 8 & 255) * var16 * var12 >>> 16 << 8) + ((var20 & 255) * (256 - var16) * (256 - var12) + (var21 & 255) * var16 * (256 - var12) + (var15 & 255) * (256 - var16) * var12 + (var18 & 255) * var16 * var12 >>> 16);
                                if (!var13) {
                                    var6[var17] |= -16777216;
                                }
                            }
                        }
                    } else {
                        for(var12 = 0; var12 < var10; ++var12) {
                            var14 = Math.min(var12 * var8 >>> 8, var4);

                            for(var15 = 0; var15 < var9; ++var15) {
                                var16 = Math.min(var15 * var7 >>> 8, var3);
                                var17 = var2 + var11 * var12 + var15;
                                var6[var17] = var0[var1 + var5 * var14 + var16];
                                if (!var13) {
                                    var6[var17] |= -16777216;
                                }
                            }
                        }
                    }

                }
            }
        }
    }

    private static void Code(DataInputStream var0, int var1, Code var2) {
        int var3 = var0.read();
        int var4 = 1;
        int var5 = var3 & 1;
        int var6 = (var3 & 2 | -(var3 & 2)) >>> 31;
        var3 = (var3 & 4 | -(var3 & 4)) >>> 31;
        if (var6 != 0) {
            var2.w();
            I((int)0);
            Code.v(35);
        } else {
            Vector var32 = new Vector();

            int var7;
            int var8;
            int var9;
            int var10;
            byte[] var11;
            while(var4 < var1) {
                var7 = var0.read();
                var8 = var0.readUnsignedShort();
                var9 = var0.read();
                var10 = Code((DataInput)var0);
                var4 += var10 + 7;
                Code(var11 = new byte[var10 + 6], var7, var8, var9);
                var0.readFully(var11, 6, var10);
                var32.addElement(var11);
            }

            byte[] var29;
            label540: {
                Throwable var40;
                label539: {
                    boolean var10001;
                    int var27;
                    label538: {
                        var29 = new byte[var27 = var32.size()];
                        Object var31;
                        synchronized(var31 = J){}
                        if (k != null) {
                            byte[] var10000 = k;

                            try {
                                if (var10000.length != 0) {
                                    break label538;
                                }
                            } catch (Throwable var26) {
                                var40 = var26;
                                var10001 = false;
                                break label539;
                            }
                        }

                        try {
                            if (var5 == 0) {
                                return;
                            }
                        } catch (Throwable var25) {
                            var40 = var25;
                            var10001 = false;
                            break label539;
                        }
                    }

                    label530:
                    try {
                        boolean var33;
                        if (var5 == 0 && k != null) {
                            var33 = false;
                            l = new byte[k.length];
                            System.arraycopy(k, 0, l, 0, k.length);

                            for(var8 = 0; var8 < var27; ++var8) {
                                byte[] var35 = (byte[])var32.elementAt(var8);
                                boolean var37 = false;
                                var29[var8] = var35[2];

                                for(int var38 = 0; var38 < l.length / 3; ++var38) {
                                    if (var35[2] == l[var38 * 3]) {
                                        l[var38 * 3 + 1] = var35[3];
                                        l[var38 * 3 + 2] = var35[4];
                                        m[var38] = var35[5];
                                        if (!Code(var38, var35)) {
                                            var5 = 1;
                                            var29 = new byte[0];
                                            var27 = 0;
                                            var37 = true;
                                        } else {
                                            var37 = true;
                                        }
                                        break;
                                    }
                                }

                                if (!var37) {
                                    var9 = l.length / 3;
                                    var10 = 1;
                                    (var11 = new byte[var27 - var8])[0] = ((byte[])var32.elementAt(var8))[2];

                                    byte[] var12;
                                    for(var7 = var8 + 1; var7 < var27; ++var7) {
                                        var12 = (byte[])var32.elementAt(var7);
                                        boolean var13 = false;

                                        for(int var14 = 0; var14 < var9; ++var14) {
                                            if (var12[2] == l[var14 * 3]) {
                                                var13 = true;
                                                break;
                                            }
                                        }

                                        if (!var13) {
                                            var11[var10++] = ((byte[])var32.elementAt(var7))[2];
                                        }
                                    }

                                    byte[] var36 = new byte[(var9 + var10) * 3];
                                    var12 = new byte[var9 + var10];
                                    System.arraycopy(l, 0, var36, 0, var9 * 3);
                                    System.arraycopy(m, 0, var12, 0, var9);
                                    l = var36;
                                    m = var12;
                                    var33 = true;

                                    for(int var39 = 0; var39 < var10; ++var39) {
                                        l[(var9 + var39) * 3] = var11[var39];
                                    }

                                    --var8;
                                }
                            }
                        } else {
                            Y();
                            l = new byte[var27 * 3];
                            m = new byte[var27];

                            for(var7 = 0; var7 < var27; ++var7) {
                                byte[] var34 = (byte[])var32.elementAt(var7);
                                l[var7 * 3] = var34[2];
                                var29[var7] = var34[2];
                                if (!Code(var7, var34)) {
                                    var5 = 1;
                                    var29 = new byte[0];
                                    break;
                                }
                            }

                            var33 = true;
                        }

                        if (var33) {
                            X();
                            if (k == null) {
                                var5 = 1;
                                var29 = new byte[0];
                            }
                        } else {
                            aa();
                        }
                        break label540;
                    } catch (Throwable var24) {
                        var40 = var24;
                        var10001 = false;
                        break label530;
                    }
                }

                Throwable var28 = var40;
                throw var28;
            }

            var2.w();
            int var30 = var29.length;
            Code(Code.Z(var29, var30));
            I(var5);
            I(var3);
            Code.v(33);
        }
    }

    private byte[] Code(a var1, int var2) {
        Object var3;
        synchronized(var3 = I){}
        a var10000 = var1;

        try {
            Object[] var4 = var10000.Code();
            int[] var5 = var1.I();
            int var6 = 0;
            String var7 = (String)this.Z[1];
            int var8;
            if (!this.C) {
                byte[] var18 = (var7 + "\u0000hernskifers\u0000").getBytes();
                var6 = 41 + var18.length + this.r.f.length + J((int)1).length() + (this.Code == null ? 2 : 0) + this.r.Code.length;
                this.Z = this.J;
                this.J = null;
                if (this.bh > 0) {
                    this.h = null;
                    this.Z = null;
                    this.bh = 0;
                }

                if (this.h != null) {
                    var6 += 8 + this.h.length;
                } else {
                    for(var8 = 0; var8 < 110; ++var8) {
                        this.I[var8] = null;
                        this.h[var8] = 0;
                    }

                    this.Z = null;
                }

                if (this.Z == null) {
                    var6 += 8;
                }
            }

            if ((this.q.cD & 4) != 0) {
                var4[77] = null;
                var4[73] = null;
                var4[79] = null;
                var5[99] = 0;
                var4[86] = null;
                var4[94] = null;
                var5[85] = 0;
            }

            var5[0] = 16;
            var4[40] = var7;
            var4[33] = J((int)2);
            if (j == null) {
                a(false);
            }

            var4[6] = j;
            String var20 = "OM-Install-Referrer";
            var20 = Code.getAppProperty(var20);
            var4[100] = var20 != null ? var20 : "";
            var5[50] = ak;
            if (!this.I() || F) {
                var5[24] &= -131073;
            }

            var8 = 4;

            for(int var9 = 0; var9 < 110; ++var9) {
                if (var4[var9] == null) {
                    if (this.h[var9] != var5[var9] || this.I[var9] != null) {
                        if (var5[var9] <= 254) {
                            var8 += 4;
                        } else {
                            var8 += 7;
                        }
                    }
                } else if (var4[var9] instanceof byte[] && (!(this.I[var9] instanceof byte[]) || !Code((byte[])var4[var9], (byte[])this.I[var9]))) {
                    var8 += 7 + ((byte[])var4[var9]).length;
                } else if ((this.I[var9] == null || !var4[var9].equals(this.I[var9])) && var4[var9] instanceof String) {
                    int var10 = c((String)var4[var9]);
                    var8 += var10 + (var10 <= 254 ? 4 : 7);
                }
            }

            var6 += var8 + 16 + 8 * (var8 / '\ufff9');
            Z var21 = new Z(var6);
            DataOutputStream var22 = new DataOutputStream(var21);
            int var11 = 0;
            if (!this.C) {
                byte var23 = 0;
                if (this.Code == null) {
                    var22.write(1);
                    var22.write(2);
                    var23 = 2;
                }

                var22.write(1);
                var22.write(this.r.h, 0, 8);
                var22.writeInt(this.r.I[0]);
                var22.write(this.r.f);
                var22.writeShort(var2);
                var22.write(this.r.Code);
                var2 = var21.size();
                var22.writeUTF(J((int)1));
                this.s.B(var21.Code(), var23, var21.size() - var23);
                this.t.B(var21.Code(), var23, var21.size() - var23);
                this.s.C(var21.Code(), var21.size(), 16);
                var21.Code(var21.size() + 16);
                this.u.d(var21.Code(), var2, var21.size() - var2);
                var11 = var21.size();
                byte[] var17 = (var7 + "\u0000hernskifers\u0000").getBytes();
                Code((Z)var21, (int)128, 3, var17.length);
                var22.write(var17);
                if (this.h != null) {
                    Code((Z)var21, (int)15, 0, 8);
                    var22.write(this.h);
                }

                if (this.Z == null) {
                    Code((Z)var21, (int)16, 0, 0);
                }
            }

            ++this.bh;
            Code((Z)var21, (int)5, var1.Z(), 0);
            Code((Z)var21, (int)22, var1.Z(), Math.min(var8, 65529));
            var22.writeInt(var8 - 4 + Code(var1.Code(false)));

            for(var2 = 0; var2 < 110; ++var2) {
                int var19;
                if (var4[var2] == null) {
                    if (this.h[var2] != var5[var2] || this.I[var2] != null) {
                        if ((var19 = var5[var2]) <= 254) {
                            var22.write(2);
                            var22.writeShort(var2);
                            var22.write(var19);
                        } else {
                            var22.write(3);
                            var22.writeShort(var2);
                            var22.writeInt(var19);
                        }
                    }
                } else if (var4[var2] instanceof byte[] && (!(this.I[var2] instanceof byte[]) || !Code((byte[])var4[var2], (byte[])this.I[var2]))) {
                    var22.write(1);
                    var22.writeShort(var2);
                    var22.writeInt(((byte[])var4[var2]).length);
                    var22.write((byte[])var4[var2]);
                } else if ((this.I[var2] == null || !var4[var2].equals(this.I[var2])) && var4[var2] instanceof String) {
                    if (c((String)var4[var2]) <= 254) {
                        var22.write(0);
                        var22.write(var2 >> 16);
                        var19 = var21.size();
                        var22.writeUTF((String)var4[var2]);
                        var21.Code()[var19] = (byte)var2;
                    } else {
                        var22.write(1);
                        var22.writeShort(var2);
                        byte[] var12 = new byte[c(var7 = (String)var4[var2])];
                        int var13 = 0;

                        for(int var14 = 0; var14 < var7.length(); ++var14) {
                            var13 += Code(var7.charAt(var14), var12, var13);
                        }

                        var22.writeInt(var12.length);
                        var22.write(var12);
                    }
                }

                this.I[var2] = var4[var2];
                this.h[var2] = var5[var2];
            }

            var2 = var21.size() - var8;

            while(var8 > 65529) {
                var21.Code(var21.size() + 8);
                System.arraycopy(var21.Code(), var2 + '\ufff9', var21.Code(), var2 + '\ufff9' + 8, var8 - '\ufff9');
                var2 += 65537;
                var8 -= 65529;
                Code((byte[])var21.Code(), var2 - 8, 22, var1.Z(), Math.min(var8, 65529));
            }

            this.b(var21.Code(), var11, var6);
            this.C = true;
            byte[] var24 = var21.Code();
            return var24;
        } finally {
            ;
        }
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

    private static void Code(Z var0, int var1, int var2, int var3) {
        var0.Code(var0.size() + 8);
        Code(var0.Code(), var0.size() - 8, var1, var2, var3);
    }

    private static void Code(byte[] var0, byte[] var1, int var2, int var3) {
        for(; var2 < var3; ++var2) {
            if (var0[var2] == 1 && (var1[var2] & 1) != 0 || var0[var2] == 2 && (var1[var2] & 1) == 0) {
                ++var1[var2];
            } else if (var0[var2] == 16 || var0[var2] == 8) {
                var1[var2] = (byte)(var1[var2] + -(var1[var2] & 1) + 2);
            }
        }

    }

    private void w(int var1) {
        if (var1 != 0) {
            int var2 = l(var1 + -1);
            ++aM;
            ba += l(var1 + -3) + 3;
            int var3 = l(var1);
            int var4 = l(var1 + 1);
            bf += var3;
            bg += var4;
            int var10001 = var1;
            var1 = var2;
            var2 = var10001;
            Code var5 = this;
            int var10000 = var1;
            int[] var31 = Z;
            byte var10002 = 30;

            try {
                int var7;
                int var8;
                int var9;
                int var26;
                if (var10000 != var31[var10002] && var1 != Z[31]) {
                    if (var1 == Z[39]) {
                        ++aU;
                        f.Code((B)Code(l(var2 + 2)), bf, bg);
                    } else {
                        int var10;
                        int var11;
                        int var13;
                        int var14;
                        int var15;
                        int var22;
                        int var29;
                        if (var1 == Z[41]) {
                            ++aW;
                            B var25 = (B)Code(l(var2 + 2));
                            var22 = l(var2 + 3);
                            var26 = l(var2 + 5);
                            var7 = l(var2 + 6);
                            var8 = l(var2 + 7);
                            var9 = l(var2 + 8);
                            var10 = l(var2 + 9);
                            var2 = l(var2 + 10);
                            var11 = var25.Code.getWidth();
                            var29 = var25.Code.getHeight();
                            var13 = Math.min(var11 - var8, var10 - var8);
                            var14 = Math.min(var11 - var26, var10 - var13);
                            var15 = var7;
                            int var16 = var9;
                            if (var22 >>> 24 == 255) {
                                var15 = Math.min(var29 - var9, var2 - var9);
                                var16 = Math.min(var29 - var7, var2 - var15);
                            }

                            f.Code((B)var25, 0, 0, var13, var15, bf, bg);
                            f.Code((B)var25, var11 - var14, 0, var14, var15, bf + var10 - var14, bg);
                            f.Code((B)var25, 0, var29 - var16, var13, var16, bf, bg + var2 - var16);
                            f.Code(var25, var11 - var14, var29 - var16, var14, var16, bf + var10 - var14, bg + var2 - var16);
                            Code(var25, 0, var7, var26, var29 - var7 - var9, bf, bg + var15, var26, var2 - var15 - var16);
                            Code(var25, var26, 0, var11 - var26 - var8, var7, bf + var13, bg, var10 - var13 - var14, var7);
                            Code(var25, var11 - var8, var7, var8, var29 - var7 - var9, bf + var10 - var8, bg + var15, var8, var2 - var15 - var16);
                            Code(var25, var26, var29 - var9, var11 - var26 - var8, var9, bf + var13, bg + var2 - var9, var10 - var13 - var14, var9);
                            if (var22 >>> 24 == 255) {
                                f.J(bf + var26, bg + var7, var10 - var26 - var8, var2 - var7 - var9, var22);
                            } else {
                                Code(var25, var26, var7, var11 - var26 - var8, var29 - var7 - var9, bf + var26, bg + var7, var10 - var26 - var8, var2 - var7 - var9);
                            }
                        } else if (var1 == Z[37]) {
                            ++aS;
                            J var23 = (J)Code(l(var2 + 3));
                            f.Code(Code(l(var2 + 2)), bf, bg + var23.d(), var23, l(var2 + 4));
                        } else if (var1 == Z[38]) {
                            ++aT;
                            J var24 = (J)Code(l((var1 = l(var2 + 2)) + 1));
                            char[] var27;
                            var7 = (var27 = I(l(var1))).length;
                            if (((var1 = l(var1 + 8)) & 14) != 0) {
                                var7 = Code(var27, var1);
                            }

                            f.Code((char[])var27, 0, var7, bf, bg + var24.d(), (J)var24, l(var2 + 3));
                        } else if (var1 == Z[35]) {
                            ++aQ;
                            f.B(bf, bg, l(var2 + 2), l(var2 + 3), l(var2 + 4));
                        } else if (var1 == Z[36]) {
                            ++aR;
                            Code var30 = f;
                            var10001 = bf;
                            int var32 = bg;
                            int var10003 = l(var2 + 2);
                            int var10004 = l(var2 + 3);
                            int var10005 = l(var2 + 4);
                            var1 = l(var2 + 5);
                            var2 = var10005;
                            var22 = var10004;
                            var26 = var10003;
                            var7 = var32;
                            var8 = var10001;
                            Code var28 = var30;
                            if (var26 > 0 && var22 > 0) {
                                var10 = var2 & 16711680;
                                var11 = var2 << 8 & 16711680;
                                var29 = var2 << 16 & 16711680;
                                var2 = var2 >> 8 & 16711680;
                                var13 = ((var1 & 16711680) - var10) / (var22 - 1);
                                var14 = ((var1 << 8 & 16711680) - var11) / (var22 - 1);
                                var15 = ((var1 << 16 & 16711680) - var29) / (var22 - 1);
                                var1 = ((var1 >> 8 & 16711680) - var2) / (var22 - 1);
                                var26 = var8 + var26 - 1;

                                for(var22 += var7; var7 < var22; ++var7) {
                                    var28.Code.setColor((var2 & 16711680) << 8 | var10 & 16711680 | (var11 & 16711680) >> 8 | var29 >> 16);
                                    var28.Code.drawLine(var8, var7, var26, var7);
                                    var10 += var13;
                                    var11 += var14;
                                    var29 += var15;
                                    var2 += var1;
                                }
                            }
                        } else if (var1 == Z[40]) {
                            ++aV;
                            Code((B)Code(l(var2 + 2)), l(var2 + 5), l(var2 + 6), l(var2 + 7), l(var2 + 8), bf, bg, l(var2 + 3), l(var2 + 4));
                        } else if (var1 == Z[32]) {
                            ++aO;
                            var1 = bb;
                            var26 = bc;
                            var7 = bd;
                            var8 = be;
                            bb = Math.max(bf, bb);
                            bd = Math.min(var1 + bd, bf + l(var2 + 3)) - bb;
                            bc = Math.max(bg, bc);
                            be = Math.min(var26 + be, bg + l(var2 + 4)) - bc;
                            if (bd > 0 && be > 0) {
                                f.J(bb, bc, bd, be);
                                var5.w(l(var2 + 2));
                                f.J(var1, var26, var7, var8);
                            }

                            bb = var1;
                            bc = var26;
                            bd = var7;
                            be = var8;
                        } else if (var1 == Z[33]) {
                            ++aX;
                            if (l(var2 + 5) == 0) {
                                Code var21 = f;
                                var26 = bf;
                                var7 = bg;
                                var8 = bb;
                                var9 = bc;
                                var10 = bd;
                                var11 = be;
                                B var12;
                                bd = (var12 = (B)Code(l(var2 + 2))).Code.getWidth();
                                be = var12.Code.getHeight();
                                bb = 0;
                                bc = 0;
                                bf = 0;
                                bg = 0;
                                f = var12.Code();
                                var5.w(l(var2 + 3));
                                bb = var8;
                                bc = var9;
                                bd = var10;
                                be = var11;
                                bf = var26;
                                bg = var7;
                                f = var21;
                                a(var2 + 5, 1);
                            }

                            if ((var1 = l(var2 + 4)) != 0) {
                                var5.w(var1);
                            } else {
                                f.Code((B)Code(l(var2 + 2)), bf, bg);
                            }
                        } else if (var1 == Z[34]) {
                            ++aP;
                            f.Z(bf, bg, bf + l(var2 + 2), bg + l(var2 + 3), l(var2 + 4));
                        } else if (var1 == Z[66]) {
                            ++aY;
                            boolean var20 = true;
                            var22 = l(l(var2 + 2));
                            var26 = l(l(var2 + 3));
                            if (var22 != 0) {
                                if (!((Code)Code(var22)).C.Code(f, bf, bg, l(var2 + 4), var26)) {
                                    var20 = true;
                                } else {
                                    var20 = false;
                                }
                            }

                            if (var20) {
                                f.J(bf, bg, l(var2 + 4), be - (bg - bc), 16777215);
                            }
                        } else if (var1 == Z[29]) {
                            ++aZ;
                            var5.w(l(var2 + 2));
                        }
                    }
                } else {
                    --ba;
                    ++aN;
                    boolean var6 = false;
                    if (var1 == Z[31]) {
                        var10000 = l(var2 + 7) - 1;
                        if (((var10000 | -var10000) >>> 31 ^ 1) != 0) {
                            var1 = bf + l(var2 + 3);
                            var7 = bg + l(var2 + 4);
                            var8 = l(var2 + 5);
                            var9 = l(var2 + 6);
                            var6 = true;
                            if (var1 < bb + bd && var1 + var8 > bb && var7 < bc + be && var7 + var9 > bc) {
                                var6 = false;
                            }
                        }
                    }

                    if (!var6) {
                        var2 = l(var1 = l(var2 + 2));
                        Z(var1);
                        int[] var19 = Code;

                        for(var2 += var26 = Code; var26 < var2; ++var26) {
                            var5.w(var19[var26]);
                        }
                    }
                }
            } finally {
                bf -= var3;
                bg -= var4;
                return;
            }
        }
    }

    private static void n() {
        if (aF > 0) {
            if (!j || aD < bb || aE < bc || aD + aF > bb + bd || aE + aG > bc + be) {
                I(aD, aE, aF, aG);
            }

            aF = 0;
        }

    }

    private synchronized void Code(int var1, int var2, int var3, int var4) {
        if (var3 > 0 && var4 > 0 && var1 + var3 > 0 && var2 + var4 > 0 && var1 < v() && var2 < b.a()) {
            I = true;
            if (aF > 0) {
                int var5 = aD + aF;
                aD = Math.min(aD, var1);
                aF = Math.max(var1 + var3, var5) - aD;
                var1 = aE + aG;
                aE = Math.min(aE, var2);
                aG = Math.max(var2 + var4, var1) - aE;
                return;
            }

            aD = var1;
            aE = var2;
            aF = var3;
            aG = var4;
        }

    }

    private void U(int var1) {
        int var2 = l(var1);
        Z(var1);
        this.B.clear();

        for(var1 = 0; var1 < var2; var1 += 2) {
            this.B.put(f(Code(Code[Code + var1])), f(Code(Code[Code + var1 + 1])));
        }

    }

    private Code(boolean var1, Code var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aL = true;
        super();
        this.F = var2;
        byte var10000;
        boolean var10001;
        if (r == null) {
            DataInputStream var51 = null;
            var10000 = 0;

            byte[] var3;
            byte[] var4;
            DataInputStream var60;
            label979: {
                Throwable var59;
                label972: {
                    int var58;
                    try {
                        if (aK = (var51 = Code((int)var10000)).readByte() > 0) {
                            cf = 299;
                            cg = 14;
                        } else {
                            cf = 225;
                            cg = 10;
                        }

                        var3 = new byte[cf];
                        var4 = new byte[cf];
                        short var5 = 0;
                        b = var51.readByte();
                        cg = var51.readByte();
                        int var6 = 0;

                        while(true) {
                            if (var6 >= cf) {
                                c = var51.readByte();
                                cg = var51.readByte();
                                var58 = 0;
                                break;
                            }

                            var3[var6] = (byte)(var5 = (short)(var5 + var51.readByte()));
                            ++var6;
                        }
                    } catch (Throwable var48) {
                        var59 = var48;
                        var10001 = false;
                        break label972;
                    }

                    while(true) {
                        try {
                            if (var58 >= cf) {
                                break label979;
                            }

                            var4[var58] = (byte)(var3[var58] + var51.readByte());
                        } catch (Throwable var47) {
                            var59 = var47;
                            var10001 = false;
                            break;
                        }

                        ++var58;
                    }
                }

                Throwable var49 = var59;
                var60 = var51;

                try {
                    var60.close();
                } finally {
                    ;
                }

                throw var49;
            }

            r = var3;
            s = var4;
            var60 = var51;

            try {
                var60.close();
            } finally {
                ;
            }
        }

        var2 = null;
        B var55;
        B var61;
        if (var1) {
            var10000 = 2;
            var10001 = false;

            try {
                var61 = Code(var10000, var10001);
            } finally {
                ;
            }

            var55 = var61;
            this.h = s;
            a = c;
            this.br = 4;
        } else {
            var10000 = 3;
            var10001 = false;

            try {
                var61 = Code(var10000, var10001);
            } finally {
                ;
            }

            var55 = var61;
            this.h = r;
            a = b;
            this.br = 7;
        }

        if (var55 != null) {
            this.a = var55.Code.getWidth();
            this.bm = var55.Code.getHeight();
            this.Z = new Code[this.br];

            int var50;
            for(var50 = 0; var50 < this.br; ++var50) {
                this.Z[var50] = new Code(false, false);
            }

            this.bl = 0;
            int[] var52 = new int[this.a * this.bm];
            var55.Code(var52, this.a, 0, 0, this.a, this.bm);
            this.Code = new byte[this.a * this.bm];
            this.h = new int[8];
            int var56 = var52.length;

            int var53;
            for(var53 = 0; var53 < var56; ++var53) {
                this.Code[var53] = (byte)(7 - ((var52[var53] & 255) >> 5));
                this.h[this.Code[var53]] = 255 - (var52[var53] & 255);
            }

            this.h[0] = 0;
            if (!V) {
                for(var50 = 0; var50 < this.h.length; ++var50) {
                    this.h[var50] = var50 < 3 ? 0 : 255;
                }
            }

            this.g = new byte[cf];
            this.f = new byte[cf];
            byte var54 = 0;
            byte var57 = 0;

            for(var53 = 0; var53 < cf; ++var53) {
                if (var54 + this.h[var53] >= this.a) {
                    var54 = 0;
                    ++var57;
                }

                this.g[var53] = var54;
                this.f[var53] = var57;
                var54 += this.h[var53];
            }

            byte[] var62 = this.h;
            var62[0] = var62[0];
        }
    }

    private Object[] Code(int var1, int var2) {
        if (var1 == this.cj) {
            return this.Z;
        } else if (!e(var2)) {
            return null;
        } else {
            this.cj = var1;
            this.Z = null;
            String var219 = this.Code(var1, var2);
            Code var3 = null;
            InputStream var4 = null;
            DataInputStream var5 = null;
            Object[] var6 = null;
            J var10000 = this.b;
            String var10001 = var219;
            boolean var10002 = false;
            byte var10003 = 1;

            FileConnection var228;
            label2123: {
                DataInputStream var225;
                InputStream var226;
                Object[] var231;
                label2113: {
                    boolean var227;
                    label2124: {
                        label2125: {
                            int var224;
                            try {
                                var4 = (var3 = var10000.Code(var10001, var10002, var10003)).Code();
                                var5 = new DataInputStream(var4);
                                byte[] var220 = new byte[4];
                                int var7 = 0;

                                while(true) {
                                    if ((var7 += var5.read(var220, var7, 4 - var7)) >= 4) {
                                        var224 = Code((byte[])var220, (int)0);
                                        break;
                                    }
                                }
                            } catch (Throwable var217) {
                                var227 = false;
                                break label2125;
                            }

                            if (var224 != 47404304) {
                                label2126: {
                                    var225 = var5;

                                    try {
                                        var225.close();
                                    } finally {
                                        var226 = var4;
                                    }

                                    try {
                                        var226.close();
                                    } catch (Throwable var218) {
                                        var227 = false;
                                        break label2126;
                                    }

                                    var228 = var3.Code;
                                    break label2124;
                                }
                            } else {
                                label2127: {
                                    var225 = var5;
                                    byte var229 = 3;

                                    try {
                                        Code((InputStream)var225, (int)var229);
                                        var224 = var5.read();
                                    } catch (Throwable var216) {
                                        var227 = false;
                                        break label2125;
                                    }

                                    if (var224 == var2) {
                                        var1 = ((var2 - 15 | -(var2 - 15)) >>> 31) * -3 + 10;
                                        var225 = var5;
                                        int var230 = var1;

                                        try {
                                            Code((InputStream)var225, (int)var230);
                                            var219 = var5.readUTF();
                                            short var221;
                                            byte[] var223 = new byte[var221 = var5.readShort()];
                                            var5.readFully(var223, 0, var221);
                                            if (var221 == 0) {
                                                var223 = null;
                                            }

                                            String var222 = var5.readUTF();
                                            String var8;
                                            if ((var8 = var5.readUTF()) != null && var8.length() > 0 && var8.charAt(0) == 0) {
                                                var8 = var222 + var8.substring(1, var8.length());
                                            }

                                            var231 = new Object[]{var219, var8, var223};
                                            break label2113;
                                        } catch (Throwable var215) {
                                            var227 = false;
                                            break label2125;
                                        }
                                    }

                                    var225 = var5;

                                    try {
                                        var225.close();
                                    } finally {
                                        var226 = var4;
                                    }

                                    try {
                                        var226.close();
                                    } catch (Throwable var214) {
                                        var227 = false;
                                        break label2127;
                                    }

                                    var228 = var3.Code;

                                    try {
                                        e.Code(var228);
                                        return null;
                                    } catch (Throwable var213) {
                                        var227 = false;
                                        return null;
                                    }
                                }
                            }

                            var228 = var3.Code;
                            break label2124;
                        }

                        var225 = var5;

                        try {
                            var225.close();
                        } finally {
                            var226 = var4;
                        }

                        try {
                            var226.close();
                            break label2123;
                        } finally {
                            var228 = var3.Code;
                        }
                    }

                    try {
                        e.Code(var228);
                        return null;
                    } catch (Throwable var212) {
                        var227 = false;
                        return null;
                    }
                }

                var6 = var231;
                var225 = var5;

                try {
                    var225.close();
                } finally {
                    var226 = var4;
                }

                try {
                    var226.close();
                } finally {
                    var228 = var3.Code;
                }
            }

            try {
                e.Code(var228);
            } finally {
                ;
            }

            this.Z = var6;
            return var6;
        }
    }

    private void Code(a var1, DataInputStream var2, int var3, int var4) {
        this.ck = (var4 << 16 | var2.readUnsignedShort()) + var1.g() - var3;
        Code var10000 = this.K;
        var3 = this.ck;
        var10000.bo += var3;
        this.K.D(3);
        var3 = var1.g();
        long var45 = System.currentTimeMillis();
        int var6 = Code((DataInput)var2);
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;

        int var10;
        int var11;
        int var12;
        int var10001;
        Code var49;
        byte[] var56;
        label1593:
        while(var9 < var6) {
            if ((var10 = var2.readByte()) >= 0) {
                var11 = var2.readUnsignedShort();
                var9 += var11 + 3;
            } else {
                var11 = var2.readInt();
                var9 += var11 + 5;
            }

            String var13;
            int var14;
            int var15;
            byte var50;
            String var54;
            byte[] var55;
            String var58;
            byte[] var59;
            int var60;
            String var61;
            String var63;
            String var66;
            String var73;
            switch(var10 & 127) {
                case 35:
                    var50 = var2.readByte();
                    var11 = 0;

                    while(true) {
                        while(true) {
                            if (var11 >= var50) {
                                continue label1593;
                            }

                            byte var69 = var2.readByte();
                            var60 = var2.readUnsignedShort();
                            var59 = null;
                            if (var60 > 0) {
                                var59 = new byte[var60];
                                var2.readFully(var59);
                            }

                            var66 = var2.readUTF();
                            String var16 = var2.readUTF();
                            int var17 = var2.readInt();
                            if (var69 > 0 && var69 <= 9 && (var16.length() <= 0 && var66.length() <= 0 && var60 <= 0 || var16.length() != 0 && var59 != null && Code((byte[])var59, 0, var60))) {
                                this.K.w();
                                var10001 = var69 - 1;
                                byte[] var70 = var60 > 0 ? var59 : null;
                                int var67 = var10001;
                                Code(var66 != null ? Code.C(var66) : 0);
                                Code(var16 != null ? Code.C(var16) : 0);
                                Code(var70 != null ? Code.Z(var70, var60) : 0);
                                I(var17);
                                I(var67);
                                Code.v(31);
                                ++var11;
                            } else {
                                Code.x(var17);
                                ++var11;
                            }
                        }
                    }
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 66:
                case 69:
                case 71:
                case 74:
                case 77:
                case 81:
                case 82:
                case 83:
                case 84:
                case 86:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 100:
                case 104:
                case 105:
                case 106:
                case 107:
                case 109:
                case 110:
                case 113:
                default:
                    Code((InputStream)var2, (int)var11);
                    break;
                case 65:
                    var55 = new byte[var11];
                    var2.readFully(var55);
                    this.K.w();
                    var10 = var55.length;
                    Code(Code.Z(var55, var10));
                    Code.v(34);
                    break;
                case 67:
                    this.cr = var2.readUnsignedByte();
                    break;
                case 68:
                    var54 = var2.readUTF();
                    var61 = var2.readUTF();
                    var58 = var2.readUTF();
                    Code(0, var54, var61, var58, (String)null, (String)null, (String)null, this.K);
                    break;
                case 70:
                    this.c = var2.readUTF();
                    this.B = var2.readLong();
                    this.d = var2.readUTF();
                    this.b = var2.readUTF();
                    var50 = var2.readByte();
                    var11 = 0;

                    while(true) {
                        if (var11 >= var50) {
                            continue label1593;
                        }

                        char var64 = (char)var2.readByte();
                        var13 = var2.readUTF();
                        switch(var64) {
                            case 'o':
                                this.m = var13;
                                break;
                            case 's':
                                this.n = var13;
                        }

                        ++var11;
                    }
                case 72:
                    var54 = var2.readUTF();
                    var61 = var2.readUTF();
                    var58 = var2.readUTF();
                    if ((var13 = var2.readUTF()).equals("") && var58 != null) {
                        var63 = "auth_server=";
                        if ((var15 = var58.indexOf(var63)) >= 0) {
                            var14 = var15 + var63.length();
                            if ((var15 = var58.indexOf(38, var14)) > var14) {
                                var13 = var58.substring(var14, var15);
                            }
                        }
                    }

                    String var77 = var61;
                    var49 = this.K;
                    var61 = var58;
                    var58 = var77;
                    var49.w();
                    Code(var13 != null ? Code.C(var13) : 0);
                    Code(var54 != null ? Code.C(var54) : 0);
                    Code(var58 != null ? Code.C(var58) : 0);
                    Code(var61 != null ? Code.C(var61) : 0);
                    if ((var10 = var49.u()) == 0) {
                        Code.Z();
                    } else {
                        Code.Code(var10, (int)21);
                    }
                    break;
                case 73:
                    var50 = var2.readByte();
                    String[] var68 = new String[var2.readByte()];

                    for(var12 = 0; var12 < var68.length; ++var12) {
                        var68[var12] = var2.readUTF();
                    }

                    if (var50 == 99 && var68.length == 2) {
                        this.Code = var68;
                    }
                    break;
                case 75:
                    var10 = var2.readUnsignedByte();
                    var61 = var2.readUTF();
                    if (var10 == 0) {
                        var49 = var1.I();
                        ((Object[])C.get(var49.l()))[1] = var61;
                    } else {
                        Code(var10, var61, true);
                    }
                    break;
                case 76:
                    this.Code = var2.readByte();
                    this.bo = var2.readShort();
                    break;
                case 78:
                    var54 = var2.readUTF();
                    var61 = var2.readUTF();
                    var58 = var2.readUTF();
                    var13 = var2.readUTF();
                    var63 = var2.readUTF();
                    Code(1, var54, var61, var63, var58, var13, (String)null, this.K);
                    break;
                case 79:
                    var7 = new int[(var8 = (var11 - 2) / 9) * 3];
                    var2.readUnsignedShort();
                    var55 = new byte[var8 * 9];
                    var2.readFully(var55);
                    var11 = 0;

                    while(true) {
                        if (var11 >= var8) {
                            continue label1593;
                        }

                        var7[var11 * 3] = a(var55, var11 * 9);
                        var7[var11 * 3 + 1] = a(var55, var11 * 9 + 3);
                        var7[var11 * 3 + 2] = a(var55, var11 * 9 + 6);
                        ++var11;
                    }
                case 80:
                    var54 = var2.readUTF();
                    var61 = var2.readUTF();
                    var58 = var2.readUTF();
                    var13 = var2.readUTF();
                    var63 = var2.readUTF();
                    var66 = var2.readUTF();
                    Code(2, var54, var61, var66, var58, var13, var63, this.K);
                    break;
                case 85:
                    Code(var2, var11, this.K);
                    var10000 = this.K;
                    var10000.bq += var11;
                    break;
                case 87:
                    var2.readUTF();
                    var2.readUTF();
                    this.q = var2.readUTF();
                    this.r = var2.readUTF();
                    var50 = var2.readByte();
                    var11 = 0;

                    while(true) {
                        if (var11 >= var50) {
                            continue label1593;
                        }

                        var58 = var2.readUTF();
                        this.Code.addElement(var58);
                        ++var11;
                    }
                case 99:
                    var50 = var2.readByte();
                    var11 = 0;

                    while(true) {
                        while(true) {
                            if (var11 == var50) {
                                continue label1593;
                            }

                            short var53 = var2.readShort();
                            byte var57 = -1;
                            if (var53 == 1) {
                                var57 = var2.readByte();
                            }

                            var12 = var2.readInt();
                            var14 = var2.readUnsignedShort();
                            if (var57 == 4) {
                                bM = var12;
                                j = var2.readUTF();
                                I("md");
                                q();
                                this.K.w();
                                Code((var58 = j) != null ? Code.C(var58) : 0);
                                Code.v(29);
                                ++var11;
                            } else {
                                var59 = new byte[var14];
                                var2.readFully(var59);
                                var56 = var59;
                                var60 = var12;
                                switch(var57) {
                                    case 3:
                                        var73 = "splash";

                                        try {
                                            RecordStore.deleteRecordStore(var73);
                                        } finally {
                                            ;
                                        }

                                        var59 = new byte[4];
                                        Z(var12, var59, 0);
                                        var10000 = J;
                                        String var75 = "splash";
                                        byte[] var10002 = var59;

                                        try {
                                            var10000.Code(var75, var10002);
                                            n = var60;
                                            J.Code("splash", var56);
                                        } catch (IOException var42) {
                                        }

                                        q();
                                        break;
                                    case 17:
                                        if (var12 != bw) {
                                            I(var12, var59);
                                            q();
                                            G(bw);
                                        }
                                        break;
                                    default:
                                        Code.I();
                                        I((int)var57);
                                        I(var12);
                                        int var76;
                                        if (!Code(var57, var59, var59.length)) {
                                            var76 = 0;
                                        } else {
                                            var13 = null;
                                            var15 = var59.length;
                                            if (var57 == 31) {
                                                var13 = "OM-Upgrade";
                                                if ((var13 = Code.getAppProperty(var13)) != null) {
                                                    var15 += var13.length() + 2;
                                                }
                                            }

                                            Code var65 = Code;
                                            var76 = var15;

                                            try {
                                                f(var76);
                                            } catch (RuntimeException var37) {
                                                var65.Z();
                                                throw var37;
                                            } catch (Error var38) {
                                                var65.Z();
                                                throw var38;
                                            }

                                            System.arraycopy(var59, 0, Z, S, var59.length);
                                            if (var13 != null) {
                                                Code(var13, Z, S + var59.length);
                                            }

                                            var76 = Code.o();
                                        }

                                        Code(var76);
                                        Code.v(30);
                                }

                                ++var11;
                            }
                        }
                    }
                case 101:
                    var10 = var2.readInt();
                    byte var52 = var2.readByte();
                    var73 = var2.readUTF();
                    var49 = this.K;
                    var13 = var73;
                    var49.w();
                    Code(var13 != null ? Code.C(var13) : 0);
                    I(var10);
                    I((int)var52);
                    if ((var10 = var49.u()) == 0) {
                        Code.Z();
                    } else {
                        Code.Code(var10, (int)14);
                    }
                    break;
                case 102:
                    Code((InputStream)var2, (int)var11);
                    var10 = Thread.currentThread().getPriority();
                    Thread.currentThread().setPriority(1);
                    Code var51;
                    a var72 = (var51 = this.K).Code;

                    try {
                        var72.close();
                    } finally {
                        ;
                    }

                    var51.B = true;
                    a(true);
                    Thread.currentThread().setPriority(var10);
                    break;
                case 103:
                    if (!p) {
                        Code.r();
                        this.K.w();
                        Code.v(32);
                    }
                    break;
                case 108:
                    C.Code(var2.readInt());
                    break;
                case 111:
                    short var48 = var2.readShort();
                    if (this.aY) {
                        bj = this.K.a - var48;
                    }
                    break;
                case 112:
                    B(var2.readUTF());
                    break;
                case 114:
                    String var43 = var2.readUTF();
                    this.K.c = var43;
                    throw new RuntimeException();
            }
        }

        int var44 = (var2.readUnsignedByte() << 16) + var2.readUnsignedShort();
        this.K.bp = var44;
        byte var46 = 0;
        if (var46 <= 4) {
            var10001 = var44;
            boolean var36 = false;

            byte[] var79;
            try {
                var36 = true;
                var79 = new byte[var10001];
                var36 = false;
            } finally {
                if (var36) {
                    Code.I();
                    this.K.l.J(var46 > 1);
                    if (var46 == 0) {
                        if (this.C != null) {
                            this.C.d(false);
                        }

                        Code.Z();
                        var6 = var46 + 1;
                    }

                    if (this.C != null && this.C.cF == 0 && var46 >= aH) {
                        if (!this.C.aP) {
                            Code var47;
                            (var47 = this.C).g = null;
                            var47.cG = -1;
                            var47.cu = 0;
                        }

                        this.C.d(true);
                    }

                    I(0 + (var46 - 1));
                    Code.v(60);
                    var6 = var46 + 1;
                }
            }

            this.g = var79;
        }

        if (this.C != null && var8 > 0 && this.C.g == null) {
            this.g = null;
            throw new OutOfMemoryError();
        } else {
            if (this.g == null) {
                this.g = new byte[var44];
            }

            for(var6 = 0; var6 < var8; ++var6) {
                int var78 = var7[var6 * 3 + 1];
                int var10003 = var7[var6 * 3];
                var9 = var7[var6 * 3 + 2];
                var10 = var10003;
                var11 = var78;
                var56 = this.g;
                System.arraycopy(this.C.g, var10, var56, var11, var9);
            }

            this.C = null;
            this.U(bz << 10);
            this.C = 0;
            var6 = 0;
            var9 = 0;

            while(this.C < var44) {
                var10 = this.C;

                while(true) {
                    while(this.C - var10 < 1024 && this.C < var44) {
                        var11 = Math.min(1024, Math.min(var6 < var8 ? var7[var6 * 3 + 1] - this.C : 1024, var44 - this.C));
                        if (var6 < var8 && this.C == var7[var6 * 3 + 1]) {
                            this.C += var7[var6 * 3 + 2];
                            ++var6;
                        } else {
                            if ((var11 = var1.read(this.g, this.C, var11)) < 0) {
                                throw new EOFException();
                            }

                            this.C += var11;
                        }
                    }

                    if (this.aY) {
                        if (this.cq == 0 && this.u()) {
                            this.au();
                            var9 = this.cq;
                            this.c(true);
                            this.N.z(this.H());
                        }

                        if (this.cq > 0) {
                            this.ax();
                            var9 = this.M(var9);
                        }

                        if (this.M) {
                            this.M = false;
                            if (this.L && this.K.I[56] != 1) {
                                var49 = this.K;
                                var11 = this.bp;
                                var12 = this.bm;
                                var49.w();
                                I(var12);
                                I(var11);
                                if ((var10 = var49.u()) == 0) {
                                    Code.Z();
                                } else {
                                    Code.Code(var10, (int)16);
                                }
                            }
                        }
                    }
                    break;
                }
            }

            if ((var45 = System.currentTimeMillis() - var45) != 0L) {
                E((int)((long)(var1.g() - var3) * 1000L / var45));
            }

            if (this.aY) {
                if (this.cE != 0) {
                    a(this.K);
                    return;
                }
            } else {
                this.au();
                this.N.z(this.H());
                this.M(this.cq);
            }

        }
    }

    private void b(boolean var1) {
        int var2;
        int var3 = (var2 = this.br << 3) * this.cq;
        int[] var4 = new int[3];
        int[] var5 = new int[3];
        int[] var6 = new int[3];
        int[] var7 = new int[3];
        if (this.bm == 3) {
            var4[0] = 0;
            var5[0] = (this.I[0] << 11) / this.br;
            var7[0] = (this.t[0] << 11) / this.bq;
            var4[1] = 0;
            var5[1] = (this.I[1] << 11) / this.br;
            var7[1] = (this.t[1] << 11) / this.bq;
            var4[2] = 0;
            var5[2] = (this.I[2] << 11) / this.br;
            var7[2] = (this.t[2] << 11) / this.bq;
        }

        if (!var1) {
            this.cw = this.cr;
        } else {
            this.cw = this.co == 0 ? this.cr % (this.bq << 3) : this.bq << 3;
            if (this.cw == 0) {
                this.cw = this.bq << 3;
            }
        }

        int[] var8 = var1 ? this.h : this.x;

        for(int var9 = 0; var9 < var2; ++var9) {
            if (var3 + var9 < this.cs && this.bm == 3) {
                int var10 = (var3 + var9) * this.cr;
                if (var1) {
                    var10 += ((this.u[0] + 1 & -2) << 3) - ((this.co / this.cp + 1) * this.bq << 3);
                    if (this.cv == -1) {
                        this.cv = var10;
                    }

                    var10 = var9 * this.bq << 3;
                }

                int var10000 = var4[0] >> 11;
                int[] var10001;
                byte var10002;
                if (var1) {
                    var10001 = this.t;
                    var10002 = 0;
                } else {
                    var10001 = this.u;
                    var10002 = 0;
                }

                int var11 = var10000 * (var10001[var10002] << 3);
                var4[0] += var5[0];
                var6[0] = 0;
                var10000 = var4[1] >> 11;
                if (var1) {
                    var10001 = this.t;
                    var10002 = 1;
                } else {
                    var10001 = this.u;
                    var10002 = 1;
                }

                int var12 = var10000 * (var10001[var10002] << 3);
                var4[1] += var5[1];
                var6[1] = 0;
                var10000 = var4[2] >> 11;
                if (var1) {
                    var10001 = this.t;
                    var10002 = 2;
                } else {
                    var10001 = this.u;
                    var10002 = 2;
                }

                int var13 = var10000 * (var10001[var10002] << 3);
                var4[2] += var5[2];
                var6[2] = 0;
                int var14;
                int var15;
                int var16;
                int var17;
                short var18;
                short var24;
                short var27;
                if (this.t[0] == 2 && this.t[1] == 1 && this.t[2] == 1) {
                    for(var14 = 0; var14 < this.cw >> 1; ++var14) {
                        var15 = this.Z[0][var11 + (var14 << 1)] & 255;
                        var16 = this.Z[1][var12 + var14] & 255;
                        var17 = this.Z[2][var13 + var14] & 255;
                        var18 = Z[var17];
                        short var19 = J[var16];
                        var16 -= 128;
                        var17 -= 128;
                        var16 = var16 * 705 + var17 * 1463 + 1024 >> 11;
                        short var29 = I[var15 + var18 + 256];
                        short var20 = I[var15 - var16 + 256];
                        var24 = I[var15 + var19 + 256];
                        var8[var10++] = var29 << 16 | var20 << 8 | var24;
                        var15 = this.Z[0][var11 + (var14 << 1) + 1] & 255;
                        var29 = I[var15 + var18 + 256];
                        var27 = I[var15 - var16 + 256];
                        var24 = I[var15 + var19 + 256];
                        var8[var10++] = var29 << 16 | var27 << 8 | var24;
                    }

                    if ((this.cr & 1) != 0 && this.co == 0) {
                        var14 = var1 ? 8 * this.bq : this.cr;
                        var11 = this.Z[0][var11 + var14 - 1] & 255;
                        var12 = this.Z[1][var12 + (var14 - 1 >> 1)] & 255;
                        var13 = this.Z[2][var13 + (var14 - 1 >> 1)] & 255;
                        short var25 = I[var11 + J[var12] + 256];
                        var12 -= 128;
                        var13 -= 128;
                        short var22 = I[var11 - (var12 * 705 + var13 * 1463 + 1024 >> 11) + 256];
                        short var21 = I[var11 + Z[var13 + 128] + 256];
                        var8[var10] = var21 << 16 | var22 << 8 | var25;
                    }
                } else if (this.t[0] == 1 && this.t[1] == 1 && this.t[2] == 1) {
                    for(var14 = 0; var14 < this.cw; ++var14) {
                        var15 = this.Z[0][var11 + var14] & 255;
                        var16 = this.Z[1][var12 + var14] & 255;
                        var17 = this.Z[2][var13 + var14] & 255;
                        var18 = I[var15 + J[var16] + 256];
                        var16 -= 128;
                        var17 -= 128;
                        var27 = I[var15 - (var16 * 705 + var17 * 1463 + 1024 >> 11) + 256];
                        var24 = I[var15 + Z[var17 + 128] + 256];
                        var8[var10++] = var24 << 16 | var27 << 8 | var18;
                    }
                } else {
                    for(var14 = 0; var14 < this.cw; ++var14) {
                        var15 = var6[0] >> 11;
                        var6[0] += var7[0];
                        byte var23 = this.Z[0][var11 + var15];
                        var16 = var6[1] >> 11;
                        var6[1] += var7[1];
                        byte var26 = this.Z[1][var12 + var16];
                        var17 = var6[2] >> 11;
                        var6[2] += var7[2];
                        byte var28 = this.Z[2][var13 + var17];
                        var18 = I[var23 + J[var26] + 256];
                        var16 = var26 - 128;
                        var17 = var28 - 128;
                        var27 = I[var23 - (var16 * 705 + var17 * 1463 + 1024 >> 11) + 256];
                        var24 = I[var23 + Z[var17 + 128] + 256];
                        var8[var10++] = var24 << 16 | var27 << 8 | var18;
                    }
                }
            }
        }

    }

    private Code(int var1, int var2, String var3, int var4, int var5, String var6, String var7) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.be = true;
        super();
        this.cx = var1;
        this.cD = var2;
        this.c = var3;
        this.br = var4;
        this.cp = var5;
        this.m = var6;
        this.n = var7;
    }

    private Code(Code var1, int var2, int var3, int var4) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aW = true;
        super();
        this.C = var1;
        this.cq = var2;
        this.cv = var3;
        this.cn = var4;
    }

    private int Code(byte[] var1, int var2, int var3, int var4, boolean var5) {
        this.g = var1;
        this.bo = var2;
        this.bl = var3;
        this.bn = var4;
        int var16 = 0;

        label497:
        while(var16 == 0) {
            while(this.a > 0) {
                if (this.a >= this.bl) {
                    this.a -= this.bl;
                    return 0;
                }

                this.bo += this.a;
                this.bl -= this.a;
                this.a = 0;
            }

            int var6;
            int var8;
            int var9;
            int var10;
            int var11;
            int var10000;
            Code var17;
            int var21;
            switch(this.bh) {
                case 0:
                    if (this.bl < 2) {
                        return this.bl;
                    }

                    this.bo += 2;
                    this.bl -= 2;
                    this.bh = 1;
                    break;
                case 1:
                case 2:
                    if (this.bl < 2) {
                        return this.bl;
                    }

                    while(true) {
                        while(true) {
                            if (this.bl < 2 || var16 != 0 || this.a != 0 || this.bh != 1 && this.bh != 2) {
                                continue label497;
                            }

                            if ((this.g[this.bo] & 255) != 255) {
                                ++this.bo;
                                --this.bl;
                            } else {
                                switch(this.g[this.bo + 1] & 255) {
                                    case 0:
                                    case 255:
                                        ++this.bo;
                                        --this.bl;
                                        break;
                                    case 192:
                                    case 193:
                                        if (this.bl < 4) {
                                            return this.bl;
                                        }

                                        this.C = (this.g[this.bo + 2] & 255) << 8 | this.g[this.bo + 3] & 255;
                                        if (this.bl < 10) {
                                            return this.bl;
                                        }

                                        this.bo += 4;
                                        this.bl -= 4;
                                        this.C -= 2;
                                        this.cr = (this.g[this.bo + 3] & 255) << 8 | this.g[this.bo + 4] & 255;
                                        this.cs = (this.g[this.bo + 1] & 255) << 8 | this.g[this.bo + 2] & 255;
                                        if (var5) {
                                            this.bh = 0;
                                            return this.cr << 16 | this.cs;
                                        }

                                        this.az = this.cr >> this.bn;
                                        this.b = this.cs >> this.bn;
                                        this.x = new int[this.az * this.b];
                                        this.bm = this.g[this.bo + 5] & 255;
                                        Code var22 = this;

                                        for(var3 = 0; var3 < 3; ++var3) {
                                            var22.y[var3 << 1] = 0;
                                            var22.y[(var3 << 1) + 1] = 4;
                                        }

                                        var22.ar();
                                        this.bo += 6;
                                        this.bl -= 6;
                                        this.C -= 6;
                                        this.bh = 3;
                                        break;
                                    case 196:
                                        var17 = this;
                                        if (this.bl < 4) {
                                            var16 = -2;
                                        } else {
                                            var2 = (this.g[this.bo + 2] & 255) << 8 | this.g[this.bo + 3] & 255;
                                            if (this.bl < var2 + 2) {
                                                var16 = -2;
                                                continue;
                                            }

                                            var2 -= 2;
                                            this.bo += 4;
                                            this.bl -= 4;

                                            label483:
                                            while(var2 > 0) {
                                                var3 = var17.g[var17.bo] & 15 | (var17.g[var17.bo] & 16) >> 2;
                                                ++var17.bo;
                                                --var17.bl;
                                                --var2;
                                                var4 = 0;
                                                short[] var23 = new short[16];
                                                var21 = 0;

                                                for(var8 = 0; var8 < 16; ++var8) {
                                                    var23[var8] = (short)(var17.g[var17.bo + var8] & 255);
                                                    var21 += var23[var8];
                                                }

                                                int[] var25 = new int[var21 + 1];
                                                int[] var24 = new int[var21];

                                                for(var9 = 0; var9 < 16; ++var9) {
                                                    for(var10 = 1; var10 <= var23[var9]; ++var4) {
                                                        var25[var4] = var9 + 1;
                                                        ++var10;
                                                    }
                                                }

                                                var25[var4] = 0;
                                                var9 = 0;
                                                var10 = 0;
                                                var11 = var25[0];

                                                while(true) {
                                                    do {
                                                        if (var25[var9] == 0) {
                                                            var17.Z[var3] = new int[16];
                                                            var17.I[var3] = new int[16];
                                                            var17.Code[var3] = new short[16];
                                                            var8 = 0;
                                                            var9 = 0;

                                                            while(var9 < 16) {
                                                                if (var23[var9] == 0) {
                                                                    var17.I[var3][var9] = -1;
                                                                    ++var9;
                                                                } else {
                                                                    var17.Code[var3][var9] = (short)var8;
                                                                    var17.Z[var3][var9] = var24[var8];
                                                                    var8 += var23[var9] - 1;
                                                                    var17.I[var3][var9] = var24[var8];
                                                                    ++var8;
                                                                    ++var9;
                                                                }
                                                            }

                                                            var17.bo += 16;
                                                            var17.bl -= 16;
                                                            var2 -= 16;
                                                            var17.J[var3] = new byte[var4];

                                                            for(var8 = 0; var8 < var4; ++var8) {
                                                                var17.J[var3][var8] = var17.g[var17.bo + var8];
                                                            }

                                                            var17.bo += var4;
                                                            var17.bl -= var4;
                                                            var2 -= var4;
                                                            var17.B[var3] = new byte[512];

                                                            for(var4 = 0; var4 < 256; ++var4) {
                                                                var17.B[var3][var4] = 9;
                                                            }

                                                            var4 = 0;

                                                            for(var8 = 1; var8 <= 8; ++var8) {
                                                                for(var9 = 0; var9 < var23[var8 - 1]; ++var9) {
                                                                    var10 = var24[var4] << 8 - var8;

                                                                    for(var11 = 0; var11 < 1 << 8 - var8; ++var11) {
                                                                        var17.B[var3][var10 | var11] = (byte)var8;
                                                                        var17.B[var3][256 + (var10 | var11)] = var17.J[var3][var4];
                                                                    }

                                                                    ++var4;
                                                                }
                                                            }
                                                            continue label483;
                                                        }

                                                        while(var25[var9] == var11) {
                                                            var24[var9] = var10++;
                                                            ++var9;
                                                        }
                                                    } while(var25[var9] == 0);

                                                    while(var25[var9] != var11) {
                                                        var10 <<= 1;
                                                        ++var11;
                                                    }
                                                }
                                            }

                                            var16 = 0;
                                        }
                                        break;
                                    case 217:
                                        this.bo += 2;
                                        this.bl -= 2;
                                        this.bh = 6;
                                        break;
                                    case 218:
                                        if (this.bl < 4) {
                                            return this.bl;
                                        }

                                        this.C = (this.g[this.bo + 2] & 255) << 8 | this.g[this.bo + 3] & 255;
                                        if (this.bl < this.C + 2) {
                                            return this.bl;
                                        }

                                        this.cj = this.g[this.bo + 4] & 255;
                                        this.bo += 5;
                                        this.bl -= 5;
                                        this.C -= 3;

                                        for(var2 = 0; var2 < this.cj; ++var2) {
                                            var3 = this.g[this.bo] & 255;
                                            this.v[var2] = var2;

                                            for(var4 = 0; var4 < this.bm; ++var4) {
                                                if (var3 == this.g[var4]) {
                                                    this.v[var2] = var4;
                                                    var4 = this.bm;
                                                }
                                            }

                                            var3 = this.g[this.bo + 1] & 255;
                                            this.y[this.v[var2] << 1] = var3 >> 4;
                                            this.y[(this.v[var2] << 1) + 1] = 4 + (var3 & 15);
                                            this.bo += 2;
                                            this.bl -= 2;
                                            this.C -= 2;
                                        }

                                        this.ar();
                                        this.cl = 0;
                                        this.ck = 0;
                                        this.cm = 0;
                                        this.cq = 0;
                                        this.aq();
                                        this.bo += this.C;
                                        this.bl -= this.C;
                                        this.bh = 4;
                                        break;
                                    case 219:
                                        var17 = this;
                                        if (this.bl < 4) {
                                            var16 = -2;
                                        } else {
                                            var2 = (this.g[this.bo + 2] & 255) << 8 | this.g[this.bo + 3] & 255;
                                            if (this.bl < var2 + 2) {
                                                var16 = -2;
                                            } else {
                                                this.bo += 4;
                                                this.bl -= 4;
                                                var2 -= 2;

                                                while(true) {
                                                    while(var2 > 0) {
                                                        var10000 = var17.g[var17.bo] & 240;
                                                        var3 = (var10000 | -var10000) >>> 31;
                                                        var4 = var17.g[var17.bo] & 15;
                                                        ++var17.bo;
                                                        --var17.bl;
                                                        --var2;
                                                        var17.J[var4] = new int[64];
                                                        if (var3 != 0) {
                                                            for(var3 = 0; var3 < 64; ++var3) {
                                                                var6 = r[var3];
                                                                var17.J[var4][var3] = ((var17.g[var17.bo + (var6 << 1)] & 255) << 8 | var17.g[var17.bo + (var6 << 1) + 1] & 255) * s[var3];
                                                            }

                                                            var17.bo += 128;
                                                            var17.bl -= 128;
                                                            var2 -= 128;
                                                        } else {
                                                            for(var3 = 0; var3 < 64; ++var3) {
                                                                var6 = r[var3];
                                                                var17.J[var4][var3] = (var17.g[var17.bo + var6] & 255) * s[var3];
                                                            }

                                                            var17.bo += 64;
                                                            var17.bl -= 64;
                                                            var2 -= 64;
                                                        }
                                                    }

                                                    var16 = 0;
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 221:
                                        if (this.bl < 4) {
                                            return this.bl;
                                        }

                                        this.a = (this.g[this.bo + 2] & 255) << 8 | this.g[this.bo + 3] & 255;
                                        if (this.bl < 6) {
                                            return this.bl;
                                        }

                                        this.cn = (this.g[this.bo + 4] & 255) << 8 | this.g[this.bo + 5] & 255;
                                        this.cm = 0;
                                        this.bo += 6;
                                        this.bl -= 6;
                                        this.a -= 4;
                                        break;
                                    default:
                                        if (this.bl < 4) {
                                            return this.bl;
                                        }

                                        this.a = (this.g[this.bo + 2] & 255) << 8 | this.g[this.bo + 3] & 255;
                                        this.bo += 4;
                                        this.bl -= 4;
                                        this.a -= 2;
                                }
                            }
                        }
                    }
                case 3:
                    if (this.bl < this.bm * 3) {
                        return this.bl;
                    }

                    for(var2 = 0; var2 < this.bm; ++var2) {
                        this.g[var2] = this.g[this.bo] & 255;
                        var4 = (var3 = this.g[this.bo + 1] & 255) & 15;
                        if ((var3 >>>= 4) > this.bq) {
                            this.bq = var3;
                        }

                        if (var4 > this.br) {
                            this.br = var4;
                        }

                        this.t[var2] = var3;
                        this.I[var2] = var4;
                        this.z[var2] = this.g[this.bo + 2] & 255;
                        this.bo += 3;
                        this.bl -= 3;
                        this.C -= 3;
                    }

                    if (this.C > 0) {
                        this.a = this.C;
                    }

                    var2 = 0;

                    while(var2 < this.bm) {
                        this.u[var2] = ((this.cr * this.t[var2] + this.bq - 1) / this.bq + 7) / 8;
                        if (this.bn == 0) {
                            this.Z[var2] = new byte[64 * this.u[var2] * this.I[var2]];
                            ++var2;
                        } else {
                            this.Z[var2] = new byte[64 * this.I[var2] * this.t[var2]];
                            ++var2;
                        }
                    }

                    this.cq = 0;
                    if (this.bm > 1) {
                        this.bp = (this.bq << 3) * ((this.cr + 8 * this.bq - 1) / (this.bq << 3));
                        this.bk = (this.br << 3) * ((this.cs + 8 * this.br - 1) / (this.br << 3));
                    }

                    this.bh = 2;
                    break;
                case 4:
                    var17 = this;
                    short[] var18 = new short[64];
                    if (this.bn != 0 && this.h == null) {
                        this.h = new int[this.br * this.bq << 6];
                    }

                    do {
                        var3 = var17.v[var17.ck];

                        for(var4 = 0; var4 < 64; ++var4) {
                            var18[var4] = 0;
                        }

                        short[] var19 = var18;
                        Code var7 = var17;
                        var8 = var17.bl;
                        var9 = var17.ct;
                        var10 = var17.cu;
                        var11 = var17.y[var3 << 1];
                        if ((var11 = var17.A(var11)) < 0) {
                            var17.bo -= var8 - var17.bl;
                            var17.bl = var8;
                            var17.ct = var9;
                            var17.cu = var10;
                            var10000 = var11;
                        } else {
                            int var12;
                            if ((var12 = var17.z(var11)) < 0) {
                                var17.bo -= var8 - var17.bl;
                                var17.bl = var8;
                                var17.ct = var9;
                                var17.cu = var10;
                                var10000 = var12;
                            } else {
                                label530: {
                                    var11 = d(var11, var12);
                                    var18[0] = (short)(var11 + var17.B[var3]);
                                    var11 = var17.y[(var3 << 1) + 1];
                                    var12 = 1;

                                    while(var12 < 64) {
                                        int var13;
                                        if ((var13 = var7.A(var11)) < 0) {
                                            var7.bo -= var8 - var7.bl;
                                            var7.bl = var8;
                                            var7.ct = var9;
                                            var7.cu = var10;
                                            var10000 = var13;
                                            break label530;
                                        }

                                        int var14 = var13 & 15;
                                        var13 >>= 4;
                                        if (var14 == 0) {
                                            if (var13 != 15) {
                                                break;
                                            }

                                            var12 += var13;
                                            ++var12;
                                        } else {
                                            int var15;
                                            if ((var15 = var7.z(var14)) < 0) {
                                                var7.bo -= var8 - var7.bl;
                                                var7.bl = var8;
                                                var7.ct = var9;
                                                var7.cu = var10;
                                                var10000 = var15;
                                                break label530;
                                            }

                                            if ((var12 += var13) >= 64) {
                                                var12 = 63;
                                            }

                                            var19[var12] = (short)d(var14, var15);
                                            ++var12;
                                        }
                                    }

                                    var7.B[var3] = var19[0];
                                    var10000 = 0;
                                }
                            }
                        }

                        var4 = var10000;
                        if (var10000 != 0) {
                            var16 = var4;
                            continue label497;
                        }

                        var4 = var17.w[var3] / (var17.I[var3] * var17.t[var3]);
                        var6 = var17.w[var3] % (var17.I[var3] * var17.t[var3]);
                        if ((var4 = var17.t[var3] * var4 + var6 % var17.t[var3]) < var17.u[var3]) {
                            if (var17.bn == 0) {
                                var4 = var4 + (var6 / var17.t[var3] * var17.u[var3] << 3) << 3;
                                var17.Code(var3, var18, var17.Z[var3], var4, var17.u[var3] << 3);
                            } else {
                                var4 = var6 / var17.t[var3] * (var17.t[var3] << 6) + (var6 % var17.t[var3] << 3);
                                var17.Code(var3, var18, var17.Z[var3], var4, var17.t[var3] << 3);
                            }
                        }

                        int var10002 = var17.w[var3]++;
                        --var17.co;
                        if (var17.co % var17.cp == 0 && var17.bn != 0) {
                            var17.b(true);
                            Code var20 = var17;
                            var6 = var17.cv % var17.cr;
                            var21 = var17.cv / var17.cr;
                            var6 >>= var17.bn;
                            var6 += (var21 >>= var17.bn) * var17.az;
                            var8 = 0;

                            for(var9 = 0; var9 < var20.br << 3 >> var20.bn && var9 + var21 < var20.b; ++var9) {
                                for(var10 = 0; var10 < var20.cw >> var20.bn; ++var10) {
                                    var20.x[var6 + var10] = var20.h[var8 + (var10 << var20.bn)];
                                }

                                var6 += var20.az;
                                var8 += var20.bq << 3 << var20.bn;
                            }

                            var17.cv = -1;
                        }

                        if (var17.co == 0) {
                            if (var17.bn == 0) {
                                var17.b(false);
                            }

                            ++var17.cq;
                            if (var17.cj > 1 && var17.cq >= var17.bk / (8 * var17.br) || var17.cj == 1 && var17.cq >= ((var17.I[var3] * var17.cs + var17.br - 1) / var17.br + 7) / 8) {
                                var17.bh = 2;
                                var16 = 0;
                                continue label497;
                            }

                            var17.aq();
                        }

                        ++var17.cl;
                        if (var17.cl >= var17.I[var3] * var17.t[var3] || var17.cj == 1) {
                            var17.cl = 0;
                            ++var17.ck;
                            if (var17.ck >= var17.cj) {
                                var17.ck = 0;
                                ++var17.cm;
                            }
                        }
                    } while(var17.cm != var17.cn || var17.cn <= 0);

                    var17.cm = 0;
                    var17.ar();
                    var17.bh = 5;
                    var16 = 0;
                    break;
                case 5:
                    while(true) {
                        while(true) {
                            while(true) {
                                if (this.bh != 5) {
                                    continue label497;
                                }

                                if (this.bl < 2) {
                                    return this.bl;
                                }

                                if ((this.g[this.bo] & 255) == 255 && this.g[this.bo + 1] != 0) {
                                    if ((this.g[this.bo + 1] & 255) >= 208 && (this.g[this.bo + 1] & 255) <= 215) {
                                        this.bh = 4;
                                        this.bo += 2;
                                        this.bl -= 2;
                                    } else {
                                        this.bh = 2;
                                    }
                                } else {
                                    ++this.bo;
                                    --this.bl;
                                }
                            }
                        }
                    }
                case 6:
                    return 0;
            }
        }

        if (var16 == -2) {
            return this.bl;
        } else {
            return var16;
        }
    }

    private void aq() {
        int var1;
        if (this.cj == 1) {
            var1 = this.v[this.ck];
            this.co = ((this.t[var1] * this.cr + this.bq - 1) / this.bq + 7) / 8;
            this.w[this.v[this.ck]] = 0;
        } else {
            this.co = 0;

            for(var1 = 0; var1 < this.cj; ++var1) {
                this.co += this.I[this.v[var1]] * this.t[this.v[var1]];
                this.w[this.v[var1]] = 0;
            }

            this.cp = this.co;
            this.co *= this.bp / (8 * this.bq);
        }
    }

    private void as() {
        while(this.cu <= 24 && this.bl > 0) {
            int var1;
            if ((var1 = this.g[this.bo] & 255) == 255) {
                if (this.bl < 2 || this.g[this.bo + 1] != 0) {
                    return;
                }

                ++this.bo;
                --this.bl;
            }

            ++this.bo;
            --this.bl;
            this.ct |= var1 << 24 - this.cu;
            this.cu += 8;
        }

    }

    public static void B() {
        J = new Code((short)0, 0);
    }

    private boolean z() {
        return (this.cD & 1) != 0;
    }

    private boolean g() {
        return this.r() == 112;
    }

    private void ag() {
        Code((Runnable)(new Code(this, 0)));
    }

    private Code(byte var1, byte var2) {
        this.d = true;
        this.c = true;
        this((byte)0);
        this.a = -1;
    }

    private Code(boolean var1, byte var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aR = true;
        super();
        this.J = new Code[10];
        Code((Runnable)this);
    }

    private Code(J var1) {
        this.bj = true;
        this.bi = true;
        this.bg = true;
        super();
        this.B = new Code[10];
        this.b = var1;
    }

    public Code() {
        this.bj = true;
        this.bi = true;
        this.bh = true;
        super();
        this.h = new byte[64];
        this.Code = new byte[32];
    }

    private static int C(int var0, int var1, int var2) {
        return Math.max(Math.min(var0, var2), var1);
    }

    private static boolean J(int var0) {
        return (var0 & 1) != 0;
    }

    private void Code(int[] var1, int var2, int var3, int[] var4) {
        int var5 = this.K.b;
        int[][] var8 = (int[][])this.O.Code.elementAt(var5);

        for(int var6 = 0; var6 < var8.length; ++var6) {
            int[] var7 = var8[var6];
            if (var6 == 0) {
                var4[0] = var7[3] + var7[7];
                var4[2] = var7[5];
            } else {
                var4[0] = Math.min(var4[0], var7[3] + var7[7]);
                var4[2] += var7[5];
            }

            var4[1] = this.I(var1, var2, var3, var7[4] + var7[8]);
            var4[3] = var7[6];
        }

    }

    private synchronized void af() {
        // $FF: Couldn't be decompiled
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
                if (var2[r[var7 + 8]] == 0 && var2[r[var7 + 16]] == 0 && var2[r[var7 + 24]] == 0 && var2[r[var7 + 32]] == 0 && var2[r[var7 + 40]] == 0 && var2[r[var7 + 48]] == 0 && var2[r[var7 + 56]] == 0) {
                    var8 = var2[r[var7]] * this.J[this.z[var1]][var7];
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
                    var6[var7] = var2[r[var7]] * this.J[this.z[var1]][var7];
                    var6[var7 + 8] = var2[r[var7 + 8]] * this.J[this.z[var1]][var7 + 8];
                    var6[var7 + 16] = var2[r[var7 + 16]] * this.J[this.z[var1]][var7 + 16];
                    var6[var7 + 24] = var2[r[var7 + 24]] * this.J[this.z[var1]][var7 + 24];
                    var6[var7 + 32] = var2[r[var7 + 32]] * this.J[this.z[var1]][var7 + 32];
                    var6[var7 + 40] = var2[r[var7 + 40]] * this.J[this.z[var1]][var7 + 40];
                    var6[var7 + 48] = var2[r[var7 + 48]] * this.J[this.z[var1]][var7 + 48];
                    var6[var7 + 56] = var2[r[var7 + 56]] * this.J[this.z[var1]][var7 + 56];
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
                    byte var18 = (byte)I[(var6[var1] + 1024 >> 11) + 128 + 256];
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
                    var3[var4] = (byte)I[(var17 + var13 + 1024 >> 11) + 128 + 256];
                    var3[var4 + 1] = (byte)I[(var8 + var12 + 1024 >> 11) + 128 + 256];
                    var3[var4 + 2] = (byte)I[(var11 - var10 + 1024 >> 11) + 128 + 256];
                    var3[var4 + 3] = (byte)I[(var7 - var9 + 1024 >> 11) + 128 + 256];
                    var3[var4 + 4] = (byte)I[(var7 + var9 + 1024 >> 11) + 128 + 256];
                    var3[var4 + 5] = (byte)I[(var11 + var10 + 1024 >> 11) + 128 + 256];
                    var3[var4 + 6] = (byte)I[(var8 - var12 + 1024 >> 11) + 128 + 256];
                    var3[var4 + 7] = (byte)I[(var17 - var13 + 1024 >> 11) + 128 + 256];
                }

                var4 += var5;
            }

            return;
        }
    }

    private boolean x() {
        if (!this.aL) {
            return false;
        } else {
            return this.K.C == this;
        }
    }

    private byte Code() {
        if (this.c) {
            return 0;
        } else if (this.b) {
            return 4;
        } else {
            return (byte)(this.a ? 2 : 1);
        }
    }

    private void ak() {
        if (this.Code != null) {
            a var10000 = this.Code;

            try {
                var10000.close();
            } finally {
                ;
            }

            this.Code = null;
        }

        if (this.a != null) {
            J var7 = this.a;

            try {
                var7.close();
            } finally {
                ;
            }

            this.a = null;
        }

    }

    private int v(int var1) {
        return (var1 = var1 + 2 + this.C.E(var1)) < this.C.g.length && this.C.F(var1) == 84 ? var1 : -1;
    }

    public final synchronized void Code(int var1, int var2) {
        Code(var1);
        this.v(var2);
    }

    private int Code(DataInput var1, int var2) {
        if (this.c) {
            this.a = var1.readInt();
            this.Code = new byte[4];
            var1.readFully(this.Code);
            return 0;
        } else {
            DataInput var6 = var1;
            Code var3 = this;
            if (!this.b) {
                if (this.a) {
                    this.a = var1.readInt() + var2;
                    var1.readUnsignedByte();
                    var1.readInt();
                    return this.a;
                } else {
                    this.C = var1.readInt() + var2;
                    this.a = var1.readUnsignedShort();
                    this.b = var1.readUnsignedShort();
                    this.Code = new byte[this.a > this.b ? this.a : this.b];
                    var1.readFully(this.Code);
                    return this.C;
                }
            } else {
                int var4 = var1.readUnsignedByte();
                this.I = (byte)(var4 & 7);
                this.C = (boolean)((var4 & 8 | -(var4 & 8)) >>> 31 ^ 1);
                this.Code = (byte)((var4 & 112) >> 4);
                this.a = var1.readInt();
                short var7 = var1.readShort();
                this.I = new int[var7];
                this.I[0] = var1.readInt() + var2;

                for(int var5 = 1; var5 < var7; ++var5) {
                    var3.I[var5] = var6.readInt() + var3.I[var5 - 1];
                }

                return var3.I[0];
            }
        }
    }

    private void L() {
        int var1;
        int var2;
        for(var1 = 16; var1 <= 63; ++var1) {
            this.h[var1] = (((var2 = this.h[var1 - 2]) >>> 17 | var2 << 15) ^ (var2 >>> 19 | var2 << 13) ^ var2 >>> 10) + this.h[var1 - 7] + (((var2 = this.h[var1 - 15]) >>> 7 | var2 << 25) ^ (var2 >>> 18 | var2 << 14) ^ var2 >>> 3) + this.h[var1 - 16];
        }

        var1 = this.bp;
        var2 = this.bm;
        int var3 = this.bh;
        int var4 = this.bn;
        int var5 = this.bl;
        int var6 = this.bo;
        int var7 = this.a;
        int var8 = this.br;
        int var9 = 0;

        for(int var10 = 0; var10 < 8; ++var10) {
            var8 += J(var5, var6, var7) + k[var9] + this.h[var9++];
            var4 += var8;
            var8 += B(var1, var2, var3);
            var7 += J(var4, var5, var6) + k[var9] + this.h[var9++];
            var3 += var7;
            var7 += B(var8, var1, var2);
            var6 += J(var3, var4, var5) + k[var9] + this.h[var9++];
            var2 += var6;
            var6 += B(var7, var8, var1);
            var5 += J(var2, var3, var4) + k[var9] + this.h[var9++];
            var1 += var5;
            var5 += B(var6, var7, var8);
            var4 += J(var1, var2, var3) + k[var9] + this.h[var9++];
            var8 += var4;
            var4 += B(var5, var6, var7);
            var3 += J(var8, var1, var2) + k[var9] + this.h[var9++];
            var7 += var3;
            var3 += B(var4, var5, var6);
            var2 += J(var7, var8, var1) + k[var9] + this.h[var9++];
            var6 += var2;
            var2 += B(var3, var4, var5);
            var1 += J(var6, var7, var8) + k[var9] + this.h[var9++];
            var5 += var1;
            var1 += B(var2, var3, var4);
        }

        this.bp += var1;
        this.bm += var2;
        this.bh += var3;
        this.bn += var4;
        this.bl += var5;
        this.bo += var6;
        this.a += var7;
        this.br += var8;
        this.bq = 0;

        for(var1 = 0; var1 < 16; ++var1) {
            this.h[var1] = 0;
        }

    }

    private synchronized void y() {
        if (this.Code != null) {
            a var1 = this.Code;
            if (var1 != this.I) {
                this.br = 0;
            }

            this.bn += this.Code.g() - this.br;
            this.br = this.Code.g();
            this.I = var1;
        }

        if (this.C != null) {
            int var3 = this.bm;
            a(this.bk + 3, var3);
            var3 = this.bn;
            a(this.bk + 4, var3);
            var3 = this.bo;
            a(this.bk + 5, var3);
            var3 = this.bp;
            a(this.bk + 6, var3);
        }

    }

    private static boolean I(String var0, String var1) {
        int var2 = var1.length();
        int var3 = var0.length();
        int var4 = 0;
        int var5 = -1;
        if (var3 == 0 && var2 == 0) {
            return true;
        } else if (var3 == 0) {
            return false;
        } else {
            int var6;
            do {
                String var7 = (var6 = var0.indexOf(42, var5 + 1)) != -1 ? var0.substring(var5 + 1, var6) : var0.substring(var5 + 1);
                int var8;
                if ((var8 = var7.length() == 0 && var4 == var1.length() ? var4 : var1.indexOf(var7, var4)) == -1) {
                    return false;
                }

                if (var4 == 0 && var8 > 0 && var0.charAt(0) != '*') {
                    return false;
                }

                if (var5 == var3 - 1) {
                    return true;
                }

                var4 = var8 + var7.length();
                var5 = var6;
            } while(var4 < var2 || var6 != -1);

            return true;
        }
    }

    private B Code(int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        // $FF: Couldn't be decompiled
    }

    private static int Code(char[] var0, int var1, int var2, int var3) {
        int var4 = 0;

        for(int var5 = 0; var5 < var1; ++var5) {
            if (var0[var5] == '\n') {
                var4 = 0;
            } else if (var4 == 0 || var0[var5] == ' ') {
                int var6;
                for(var6 = 1; var5 + var6 < var1 && var0[var5 + var6] != ' ' && var0[var5 + var6] != '\n'; ++var6) {
                }

                int var7 = Code(var2, var0, var5, var6);
                if ((var4 += var7) > var3) {
                    if (var7 <= var3) {
                        var0[var5] = '\n';
                        var4 = var7;
                    } else {
                        if (var0[var5] == ' ') {
                            var0[var5] = '\n';
                        }

                        var7 = var5;
                        char[] var8 = var0;
                        int var10000;
                        if (var3 <= 0) {
                            var10000 = 0;
                        } else {
                            int var9 = var5;
                            if (var6 > 0) {
                                int var10 = var5;
                                int var11 = var5 + var6;
                                if (Code(var2, var0, var5, var6) <= var3) {
                                    var9 = var11;
                                } else {
                                    --var11;
                                    if (b(var0[var11])) {
                                        --var11;
                                    }

                                    var4 = 0;

                                    while(var10 < var11) {
                                        var9 = (var10 + var11) / 2;
                                        if (b(var8[var9])) {
                                            --var9;
                                        }

                                        if ((var4 = Code(var2, var8, var7, var9 - var7)) < var3) {
                                            if (a(var8[var9])) {
                                                var10 = var9 + 2;
                                            } else {
                                                var10 = var9 + 1;
                                            }
                                        } else {
                                            if (var4 == var3) {
                                                break;
                                            }

                                            var11 = var9;
                                        }
                                    }

                                    if (var4 > var3) {
                                        --var9;
                                        if (b(var8[var9])) {
                                            --var9;
                                        }
                                    }
                                }
                            }

                            var10000 = var9 - var7;
                        }

                        var4 = var10000;
                        if (var10000 != 0) {
                            if (var1 == var0.length) {
                                char[] var12 = new char[var0.length + 10];
                                System.arraycopy(var0, 0, var12, 0, var1);
                                var0 = var12;
                            }

                            var5 += var4;
                            System.arraycopy(var0, var5, var0, var5 + 1, var1 - var5);
                            var0[var5] = '\n';
                            ++var1;
                            var4 = 0;
                            continue;
                        }

                        var4 = 0;
                    }
                }

                var5 += var6 - 1;
            }
        }

        return var1;
    }

    private static byte Code(char var0) {
        if (" -=_/|\\:;.,،!?&$#'`´\"\t\n".indexOf(var0) < 0 && "()<>[]{}«»‘’“”‹›".indexOf(var0) < 0) {
            if (8234 <= var0 && var0 <= 8238) {
                return 64;
            } else if (var0 == 8207) {
                return 2;
            } else if (Z(var0)) {
                return 2;
            } else if (1632 <= var0 && var0 <= 1641) {
                return 16;
            } else if (J(var0)) {
                return 4;
            } else {
                return (byte)('0' <= var0 && var0 <= '9' ? 8 : 1);
            }
        } else {
            return -128;
        }
    }

    private static void j(int var0, int var1) {
        bV = (bV <<= var1) | var0 & (1 << var1) - 1;
        bU += var1;

        while(bU >= 8) {
            bU -= 8;
            Code.write(bV >> bU);
        }

    }

    private static void Code(Code var0, int var1, char[] var2, int var3, int var4, int var5, int var6, int var7) {
        if (var1 >= 6) {
            Z(var1).Code(var0, var2, var3, var4, var5, var6, var7);
        } else if (S) {
            var0.Code(new String(var2, var3, var4), var5, var6 + Code[var1].d(), Code[var1], var7);
        } else {
            var0.Code(var2, var3, var4, var5, var6 + Code[var1].d(), Code[var1], var7);
        }
    }

    private static String Code(byte[] var0, int var1, int var2) {
        return new String(Code(var0, var1, var2));
    }

    private void P(int var1) {
        if (this.G == null || this.G.I == null || this.G.cs != var1) {
            int var2;
            for(var2 = 0; var2 < this.br; ++var2) {
                if (var1 == this.Z[var2].cs && this.Z[var2].I != null) {
                    this.G = this.Z[var2];
                    return;
                }
            }

            this.bl = (this.bl + 1) % this.br;
            this.G = this.Z[this.bl];
            this.G.I = new B[cg];
            if (o == null || o.length < this.a * a) {
                o = new int[this.a * a];
            }

            this.G.cs = var1;
            this.G.x = new int[8];

            for(var2 = 0; var2 < 8; ++var2) {
                this.G.x[var2] = this.h[var2] << 24 | var1 & 16777215;
            }

        }
    }

    private int Code(Code var1, char var2, int var3, int var4) {
        if ((var2 = Code(var2)) != 0) {
            byte var9 = this.f[var2];
            Code var5 = this;
            if (this.G.I[var9] == null) {
                int var6 = a * this.a;
                int var7 = var9 * var6;

                for(int var8 = 0; var8 < var6; ++var8) {
                    o[var8] = var5.G.x[var5.Code[var8 + var7]];
                }

                var5.G.I[var9] = var5.F.Code(o, var5.a, a, true, false);
            }

            var1.Code((B)var5.G.I[var9], this.g[var2], 0, this.h[var2], a, var3, var4);
        }

        return this.h[var2];
    }

    private static byte Code(byte var0) {
        return (byte)((var0 & 1) == 0 ? 1 : 2);
    }

    private static int Code(Throwable var0, int var1, int var2) {
        if (ag != 0) {
            if (ah >= 0) {
                var2 = ah;
                ah = -1;
            }

            L = ag;
            ag = 0;
        } else if (var1 == 22) {
            L = ae;
        } else {
            L = b(2, Z[var1]);
            if (var0.getMessage() != null) {
                var1 = Code(var0.getMessage());
                a(L, var1);
            }
        }

        Throwable var10000 = var0;
        int var5 = var2;
        var1 = L;
        Throwable var6 = var10000;
        if (x < 0) {
            k();
        }

        af = 11;
        l();

        do {
            int var3;
            for(var3 = 0; var3 < b.length && b[var3 + 1] <= var5; var3 += 4) {
            }

            int var4;
            for(var4 = var3; var4 < b.length && b[var4 + 1] <= b[var3 + 1]; var4 += 4) {
            }

            while(var3 != var4) {
                var4 -= 4;
                if (b[var4] <= var5 && b[var4 + 1] > var5 && Z(l(var1 + -1), b[var4 + 2])) {
                    int var7 = y + c(x);
                    var5 = x;
                    D = var7 + ((I[var5] & 4) == 0 ? 3 : I[var5 + (I[var5] & 1) + (I[var5] >> 1 & 1) + 1] + 4);
                    var7 = z;
                    var5 = x;
                    var2 = I[var5] >> 6 & 3;
                    if ((I[var5] & 2) != 0) {
                        var2 += I[var5 + (I[var5] & 1) + 1];
                    }

                    var7 += var2;
                    var5 = x;
                    E = var7 + ((I[var5] & 8) == 0 ? 3 : I[var5 + (I[var5] & 1) + (I[var5] >> 1 & 1) + (I[var5] >> 2 & 1) + 1] + 4);
                    Code(var1);
                    return b[var4 + 3];
                }
            }

            var5 = k();
            if (x < 0) {
                ag = var1;
                ah = -1;
                throw var6;
            }
        } while(var5 >= 0);

        return -1;
    }

    private static int c(int var0) {
        int var1 = I[var0] >> 4 & 3;
        if ((I[var0] & 1) != 0) {
            var1 += I[var0 + 1];
        }

        return var1;
    }

    private static boolean b() {
        int var0 = as;

        do {
            if (Code[as] == null) {
                return true;
            }

            if (++as == Code.length) {
                as = 0;
            }
        } while(var0 != as);

        return false;
    }

    private static int I(char var0) {
        if (var0 < 256) {
            return t[var0];
        } else if (var0 >= '�') {
            return 0;
        } else {
            int var1 = 0;
            int var2 = D.length;

            while(true) {
                while(true) {
                    int var3 = (var2 + var1) / 2;
                    if (D[var3] <= var0) {
                        if (D[var3 + 1] > var0) {
                            return u[var3];
                        }

                        var1 = var3;
                    } else {
                        var2 = var3;
                    }
                }
            }
        }
    }

    private static void I(int var0, int var1) {
        Object var2;
        synchronized(var2 = Code){}
        c = var0 * 10;
        d = var1 * 10;
        byte var10000 = 0;

        try {
            a((int)var10000);
        } finally {
            ;
        }

    }

    private static void a(int var0) {
        Object var1;
        synchronized(var1 = Code){}
        if (e) {
            try {
                e();
                e = Math.min(c + (d - c) * var0 / 100, 1000);
                byte var10000 = 0;
                int var10001 = i;
                int var10002 = j;
                int var10003 = h;

                try {
                    I(var10000, var10001, var10002, var10003);
                } catch (NullPointerException var4) {
                }
            } finally {
                ;
            }
        }

    }

    private int t(int var1) {
        return Code((int[])this.h, (int)this.az, 6, var1);
    }

    private static void e() {
        if (j != v() || k != B.a()) {
            j = v();
            k = B.a();
            l = (l = (m = j > 225 ? k * 80 / 100 : k - 45) + h / 2) + Math.min(15, (k - l - g) / 2);
            i = m - h / 2;
        }
    }

    private static long I() {
        long var0 = (long)I.length + (long)(d.length << 2);

        int var2;
        for(var2 = 0; var2 < Code.length; ++var2) {
            if (Code[var2] != null) {
                var0 += (long)(Code[var2].length << 2);
            }
        }

        for(var2 = 0; var2 < Code.length; ++var2) {
            if (Code[var2] != null) {
                var0 += (long)Code[var2].length;
            }
        }

        return var0;
    }

    private int Z(int var1, int var2) {
        L = b(d(var2), var2);
        if ((var2 = d[var2 + 1]) < 0) {
            Code(L);
            var1 = I(var2, var1);
            Code(L);
            L = 0;
            return var1;
        } else {
            int var3 = c(var2);
            int var4 = D++ - var3;
            System.arraycopy(J, var4, J, var4 + 1, var3);
            J[var4] = L;
            var1 = I(L, var2, var1);
            L = 0;
            return var1;
        }
    }

    private static boolean Code(Code var0, char[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        boolean var9;
        if ((var9 = var5 > 0 && var4 >= var5 - 1) && var6 != 0 && var3 > 0 && var1[var2 + var3 - 1] == ' ') {
            --var3;
        }

        if (var0 != null) {
            var0.Code(var1, var4, var2, var2 + var3, var7);
            if (var9 && var6 != 0) {
                var0.y(var4);
            }
        } else {
            int var8 = var2 + var3;
            e(I(var1, var2, var8 - var2));
        }

        return var9;
    }

    private synchronized void x(int var1) {
        int var2;
        if (e == null) {
            var2 = 0;
            e = new byte[4];
        } else {
            var2 = e.length;

            for(int var3 = 0; var3 < var2; var3 += 4) {
                if (Code(e, var3) == var1) {
                    return;
                }
            }

            byte[] var5 = new byte[var2 + 4];
            System.arraycopy(e, 0, var5, 0, var2);
            e = var5;
        }

        e[var2] = (byte)((-16777216 & var1) >> 24);
        e[var2 + 1] = (byte)((16711680 & var1) >> 16);
        e[var2 + 2] = (byte)(('\uff00' & var1) >> 8);
        e[var2 + 3] = (byte)(255 & var1);
        if (d == null) {
            (d = new byte[1 + e.length])[0] = (byte)(e.length / 4);
            System.arraycopy(e, 0, d, 1, e.length);
            p = true;
        } else {
            byte[] var4 = new byte[d.length + 4];
            System.arraycopy(d, 0, var4, 0, d.length);
            System.arraycopy(e, var2, var4, d.length, 4);
            var4[0] = (byte)((var4.length - 1) / 4);
            d = var4;
            p = true;
        }
    }

    public static int[] Code(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
        if (var9 == 2) {
            var9 = 1;
        }

        int[] var11 = new int[var3 * var4];
        Code(var0, var5, 0, var1 - var5 - var7, var6, var1, var11, var5, 0, var3 - var5 - var7, var6, var3, var9, var10);
        Code(var0, var5, var6, var1 - var5 - var7, var2 - var6 - var8, var1, var11, var5, var6, var3 - var5 - var7, var4 - var6 - var8, var3, var9, var10);
        Code(var0, var5, var2 - var8, var1 - var5 - var7, var8, var1, var11, var5, var4 - var8, var3 - var5 - var7, var8, var3, var9, var10);
        Code(var0, 0, var6, var5, var2 - var6 - var8, var1, var11, 0, var6, var5, var4 - var6 - var8, var3, var9, var10);
        Code(var0, var1 - var7, var6, var7, var2 - var6 - var8, var1, var11, var3 - var7, var6, var7, var4 - var6 - var8, var3, var9, var10);
        Code(var0, 0, 0, var1, var11, 0, 0, var3, var5, var6);
        Code(var0, 0, var2 - var8, var1, var11, 0, var4 - var8, var3, var5, var8);
        Code(var0, var1 - var7, 0, var1, var11, var3 - var7, 0, var3, var7, var6);
        Code(var0, var1 - var7, var2 - var8, var1, var11, var3 - var7, var4 - var8, var3, var7, var8);
        return var11;
    }

    public final B Code(int[] var1, int var2, int var3, boolean var4, boolean var5) {
        if (var5 && this.bh < 262144) {
            int var15 = 0;

            for(int var6 = 0; var6 < var3; ++var6) {
                for(int var7 = 0; var7 < var2; ++var7) {
                    int var8;
                    int var9 = (var8 = var1[var15]) >> 16 & 255;
                    int var10 = var8 >> 8 & 255;
                    int var11 = var8 & 255;
                    int var12 = var9 & -8;
                    int var13 = var10 & -4;
                    int var14 = var11 & -8;
                    var12 |= var12 >> 5;
                    var13 |= var13 >> 6;
                    var14 |= var14 >> 5;
                    var1[var15] = var8 & -16777216 | var12 << 16 | var13 << 8 | var14;
                    var8 = var9 - var12;
                    var9 = var10 - var13;
                    var10 = var11 - var14;
                    var11 = var8 / 2;
                    var12 = var9 / 2;
                    var13 = var10 / 2;
                    if (var7 < var2 - 1) {
                        Code(var1, var15 + 1, var8 - var11, var9 - var12, var10 - var13);
                    }

                    if (var6 < var3 - 1) {
                        Code(var1, var15 + var2, var11, var12, var13);
                    }

                    ++var15;
                }
            }
        }

        return new B(Image.createRGBImage(var1, var2, var3, var4), var4);
    }

    private static void Code(int[] var0, int var1, int var2, int var3, int var4) {
        if (var2 != 0 || var3 != 0 || var4 != 0) {
            int var5;
            int var6 = (var5 = var0[var1]) >> 16 & 255;
            int var7 = var5 >> 8 & 255;
            int var8 = var5 & 255;
            if (var2 > 0) {
                var6 = Math.min(255, var6 + var2);
            } else if (var2 < 0) {
                var6 = Math.max(0, var6 + var2);
            }

            if (var3 > 0) {
                var7 = Math.min(255, var7 + var3);
            } else if (var3 < 0) {
                var7 = Math.max(0, var7 + var3);
            }

            if (var4 > 0) {
                var8 = Math.min(255, var8 + var4);
            } else if (var4 < 0) {
                var8 = Math.max(0, var8 + var4);
            }

            var0[var1] = var5 & -16777216 | var6 << 16 | var7 << 8 | var8;
        }
    }

    private static void Code(byte[] var0, byte var1, int var2, int var3, byte var4, byte var5) {
        for(int var6 = var2; var6 < var3; ++var6) {
            if (var0[var6] == -128) {
                int var7 = var6;

                do {
                    ++var6;
                } while(var6 < var3 && var0[var6] == -128);

                byte var8 = var7 > var2 ? var0[var7 - 1] : var4;
                byte var9 = var6 < var3 ? var0[var6] : var5;
                if (var8 == 1 && var9 == 1) {
                    var8 = 1;
                } else if ((var8 & 26) != 0 && (var9 & 26) != 0) {
                    var8 = 2;
                } else {
                    var8 = Code(var1);
                }

                while(var7 < var6) {
                    var0[var7] = var8;
                    ++var7;
                }
            }
        }

    }

    private static B Code(int var0, int var1) {
        return new B(Image.createImage(var0, var1), false);
    }

    private static boolean Code(char[] var0, int var1) {
        return var1 >= 0 && var1 < var0.length ? a(var0[var1]) : false;
    }

    private static int Code(int[] var0, int var1, int var2, int var3, int var4, int var5) {
        int var6 = -1;

        while(var2 - var6 > 1) {
            int var7 = var6 + var2 >>> 1;
            if ((var0[var1 + var7 * var3] & var4) < var5) {
                var6 = var7;
            } else {
                var2 = var7;
            }
        }

        return var2;
    }

    private static Code Code(int var0) {
        String var1 = null;
        String var2 = null;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        Code[] var7;
        (var7 = new Code[3])[0] = y;
        var7[1] = z;
        int var8 = 0;

        Code var10002;
        while(true) {
            if (var8 >= I.length) {
                var10002 = null;
                break;
            }

            if (I[var8].cx == var0) {
                var10002 = I[var8];
                break;
            }

            ++var8;
        }

        var7[2] = var10002;
        var8 = 0;

        for(int var9 = 0; var9 < 3; ++var9) {
            Code var10;
            if ((var10 = var7[var9]) != null) {
                if (var10.c.length() != 0) {
                    var2 = var1 = var10.c;
                    var8 = var9;
                }

                if (var10.m.length() != 0) {
                    var4 = var10.m;
                }

                var3 = var10.cD;
                var5 = var10.br;
                var6 = var10.cp;
            }
        }

        if (var8 == 2) {
            var2 = d(var2);
        } else if (var0 != 0) {
            var1 = Code(var1, var0);
        }

        return new Code(var0, var3, var1, var5, var6, var4, var2);
    }

    private void Code(char[] var1, int var2, int var3, int var4, int var5) {
        if (var3 == var4) {
            this.Code.addElement(new Code(0, var3, var4, var2, 0, var5));
        } else if (this.Code == null) {
            if (var3 < var4) {
                byte var12 = 0;

                for(int var13 = var3; var13 < var4; ++var13) {
                    if (Code(var1[var13])) {
                        var12 = 2;
                        break;
                    }
                }

                this.Code.addElement(new Code(0, var3, var4, var2, var12, var5));
            }

        } else {
            int var11 = var3;

            while(var11 < var4) {
                var3 = var11;
                int var10000 = this.Code[var11] & 1;
                int var6 = (var10000 - 1 | -(var10000 - 1)) >>> 31 ^ 1;
                byte var7 = 0;
                byte var8 = 1;

                byte var9;
                for(var9 = 0; var11 < var4 && this.Code[var11] == this.Code[var3]; ++var11) {
                    if (var9 == 0 && !ad && var6 != 0 && "()<>[]{}«»‘’“”‹›".indexOf(this.Code[var11]) >= 0) {
                        var9 = 1;
                    }

                    if (var8 != 0) {
                        label98: {
                            char var10;
                            if (((Z(var10 = this.Code[var11]) ? 2 : (B(var10) ? 4 : (C(var10) ? 8 : 0))) & bF) != 0) {
                                if (var6 != 1) {
                                    break label98;
                                }
                            } else if (var6 != 0) {
                                break label98;
                            }

                            var8 = 0;
                        }
                    }

                    if (var7 == 0 && Code(this.Code[var11])) {
                        var7 = 1;
                    }
                }

                var6 = var7 << 1 | var8 << 2 | var9 << 3;
                this.Code.addElement(new Code(this.Code[var3], var3, var11, var2, var6, var5));
            }

        }
    }

    private static boolean C(int var0) {
        return var0 > 0 && var0 <= 1114111 && (var0 < 55296 || var0 > 57343) && (var0 < 64976 || var0 > 65007) && (var0 & '\ufffe') != 65534;
    }

    private synchronized void aE() {
        this.O = null;
        this.K.d = null;
        this.K.b = -1;
    }

    private void y(int var1) {
        this.Code.addElement(new Code(var1));
    }

    private static boolean e(int var0) {
        return var0 == 15 || var0 == 16;
    }

    private synchronized void aB() {
    }

    private static boolean c(char var0) {
        return var0 == '\n' || var0 == '\r' || var0 == 11 || var0 == 133 || var0 == '\f' || var0 == 8232 || var0 == 8233;
    }

    private static boolean Code(char var0) {
        return c(var0) || var0 == 8206 || var0 == 8207;
    }

    public static void Code(int var0) {
        J[D++] = var0;
    }

    public static void I(int var0) {
        B[E++] = var0;
    }

    public static void Code(C var0) {
        Z.addElement(var0);
    }

    private static void f() {
        if (H > G) {
            int var10000 = G + K;

            byte[] var0;
            try {
                var0 = new byte[var10000];
                System.arraycopy(I, 0, var0, 0, G);
                System.arraycopy(I, H, var0, G, K);
            } finally {
                ;
            }

            H = G;
            I = var0;
        }
    }

    public static void B(int var0) {
        if (Z == null) {
            Z = new Code(var0, 0);
        }

    }

    private static Code Code(int var0, byte var1, boolean var2) {
        return new Code(var0, var1, var2);
    }

    private static J Code(int var0, int var1, int var2) {
        Integer var3 = new Integer(var0 | var1 | var2);
        Code var4;
        if ((var4 = (Code)Z.get(var3)) == null) {
            var4 = new Code(Font.getFont(var0, var1, var2));
            Z.put(var3, var4);
        }

        return var4;
    }

    private boolean Code(long var1) {
        return this.Z < var1 || this.Z - 1814400000L > var1;
    }

    private void b(int param1) {
        // $FF: Couldn't be decompiled
    }

    private Code(String var1, String var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        super();
        this.d = var1;
        this.c = a(var2);
    }

    private static int k() {
        D = y;
        E = z;
        F -= 5;
        x = C[F + 4];
        z = C[F + 2];
        y = C[F + 1];
        A = C[F];
        return C[F + 3];
    }

    private static int Code(byte[] var0) {
        return var0 == null ? 0 : Z((byte[])var0, 0, var0.length);
    }

    private static int m(int var0) {
        return I(Z(var0 - 3), var0 - 3 & 16383);
    }

    private static int i() {
        return B[E - 1];
    }

    private static int Code(int var0, int var1) {
        m(var0);
        return d[d[l(var0 + -1) + 2 + var1 / 8] + var1 % 8];
    }

    private static int Z(int var0, int var1, int var2) {
        m(var0);

        for(var0 = l(var0 + -1) + -2; f(var0) != var1; var0 -= g(var0)) {
        }

        return d[d[var0 - 1 - var2 / 8] + var2 % 8];
    }

    private int b(int var1) {
        this.b(var1);
        return j();
    }

    private static int d(int var0) {
        return d[var0 + -1] & '\uffff';
    }

    private static int g() {
        return J[D - 1];
    }

    private static int h() {
        return J[--D];
    }

    private static int j() {
        return B[--E];
    }

    private static boolean Code(int var0, byte[] var1, int var2) {
        int var10000 = var0;
        var0 = var2;
        var1 = var1;
        boolean var10001;
        int var3;
        int var4;
        switch(var10000) {
            case 0:
                if (var2 != 0) {
                    byte var62 = 0;
                    byte[] var63 = var1;
                    var2 = var62 + 1;
                    byte var64 = 0;

                    try {
                        var3 = var63[var64] & 255;
                        var4 = 0;

                        while(true) {
                            if (var4 >= var3) {
                                if (var2 == var0) {
                                    return true;
                                }
                                break;
                            }

                            int var5;
                            if ((var5 = B(var1, var2, var0 - var2)) < 0) {
                                break;
                            }

                            var2 += var5;
                            if ((var5 = B(var1, var2, var0 - var2)) <= 2) {
                                break;
                            }

                            var2 += var5;
                            if ((var5 = J(var1, var2, var0 - var2)) < 0) {
                                break;
                            }

                            var2 += var5;
                            if ((var5 = J(var1, var2, var0 - var2)) < 0) {
                                break;
                            }

                            var2 += var5;
                            ++var4;
                        }
                    } catch (Throwable var61) {
                        var10001 = false;
                        break;
                    }
                }

                try {
                    return false;
                } catch (Throwable var60) {
                    var10001 = false;
                    break;
                }
            case 2:
                try {
                    return Code(var1, var0, false);
                } catch (Throwable var59) {
                    var10001 = false;
                    break;
                }
            case 3:
            case 4:
            case 5:
                return false;
            case 18:
                try {
                    return Code(var1, var0, true);
                } catch (Throwable var58) {
                    var10001 = false;
                    break;
                }
            case 30:
                try {
                    if (var0 > 0) {
                        return true;
                    }

                    return false;
                } catch (Throwable var57) {
                    var10001 = false;
                    break;
                }
            case 31:
                try {
                    var2 = 0;
                    var3 = 0;
                } catch (Throwable var56) {
                    var10001 = false;
                    break;
                }

                while(true) {
                    label665: {
                        try {
                            if (var3 < 5) {
                                var10000 = B(var1, var2, var0 - var2);
                                break label665;
                            }
                        } catch (Throwable var55) {
                            var10001 = false;
                            return false;
                        }

                        if (var2 == var0) {
                            return true;
                        }
                        break;
                    }

                    var4 = var10000;
                    if (var10000 < 0) {
                        break;
                    }

                    var2 += var4;
                    ++var3;
                }

                return false;
            default:
                return false;
        }

        return false;
    }

    private static boolean Code(byte[] var0, int var1, boolean var2) {
        if (var1 == 0) {
            return false;
        } else {
            byte var3 = 0;
            int var7 = var3 + 1;
            int var4 = var0[0] & 255;

            for(int var5 = 0; var5 < var4; ++var5) {
                int var6;
                if ((var6 = B(var0, var7, var1 - var7)) < 0) {
                    return false;
                }

                var7 += var6;
                if ((var6 = B(var0, var7, var1 - var7)) <= 2) {
                    return false;
                }

                if ((var7 += var6) == var1) {
                    return false;
                }

                if (var0[0 + var7++] != 0) {
                    if ((var6 = J(var0, var7, var1 - var7)) < 0) {
                        return false;
                    }

                    var7 += var6;
                }

                if (var2) {
                    if ((var6 = B(var0, var7, var1 - var7)) < 0) {
                        return false;
                    }

                    var7 += var6;
                }
            }

            if (var7 == var1) {
                return true;
            } else {
                return false;
            }
        }
    }

    private static boolean a(int var0) {
        if (var0 >= 0) {
            return false;
        } else {
            return (var0 & '\uffff') == 0;
        }
    }

    private static boolean c() {
        return v;
    }

    private int M(int var1) {
        var1 = this.N(var1);
        if (this.x()) {
            this.f(true);
        }

        return var1;
    }

    private static int d(int var0, int var1) {
        return var1 < 1 << var0 - 1 ? var1 + (-1 << var0) + 1 : var1;
    }

    private static int I(int var0, char[] var1, int var2, int var3) {
        int var4 = 0;

        for(int var5 = var2; var5 < var2 + var3; ++var5) {
            var4 += I(var0, var1[var5]);
        }

        return var4;
    }

    private static void h(int var0) {
        T = l(var0);
        int var1 = c(var0, 2);
        int var2;
        var1 = (var2 = l(V + 2)) & var1 - 1;
        var1 = Code(T)[(T & 32767) + var1];

        while(true) {
            if (var1 == 0) {
                T = 0;
                b(var0, var2);
                return;
            }

            if (var0 == Y) {
                if (l(V + 1) == l(var1 + 1)) {
                    break;
                }
            } else {
                int var4 = l(V + 1);
                int var3 = l(var1 + 1);
                int var5 = m(var4);
                if (m(var3) == var5 && Code(var4, var3, var5)) {
                    break;
                }
            }

            var1 = l(var1);
        }

        V = var1;
        T = 0;
    }

    private static int l(int var0) {
        return Code(var0)[var0 & 32767];
    }

    private static String Code(int var0, int var1, int var2) {
        var0 = l(var0 + 1);
        if (var1 >= 0 && var2 >= var1) {
            byte[] var3 = Z(var0);
            int var4;
            var0 = (var4 = var0 & 16383) + m(var0);

            for(var2 -= var1; var1-- > 0; var4 += y(var3[var4])) {
                if (var4 == var0) {
                    af = 24;
                    throw Code;
                }
            }

            while(var2-- > 0) {
                if (var4 == var0) {
                    af = 24;
                    throw Code;
                }

                var4 += y(var3[var4]);
            }

            return Code(var3, var4, var4);
        } else {
            af = 19;
            throw Code;
        }
    }

    private static int b(int var0, int var1) {
        int var10000;
        if (var0 + 3 > 32768) {
            t(0);
            if (C()) {
                t(1);
            }

            var10000 = var0;
            boolean var10 = false;

            int var13;
            try {
                var10 = true;
                var10000 = j(var10000);
                var10 = false;
            } finally {
                if (var10) {
                    a.J(true);
                    var13 = j(var0);
                }
            }

            var13 = var10000;
            int[] var14;
            (var14 = Code[var13])[0] = var0;
            var14[2] = var1;
            return (var13 << 15) + 3;
        } else {
            int[] var2 = null;

            int var3;
            for(var3 = 0; var3 < 4; ++var3) {
                if ((al & 32767) + 3 + var0 > 32768) {
                    al = (al >>> 15) + 1 << 15;
                }

                if ((var2 = Code[al >>> 15]) != null) {
                    break;
                }

                if (var3 >= 2) {
                    if (var3 == 2) {
                        var10000 = al >>> 15;
                        boolean var7 = false;

                        int[] var15;
                        try {
                            var7 = true;
                            g(var10000);
                            var15 = Code[al >>> 15];
                            var7 = false;
                        } finally {
                            if (var7) {
                                a.J(true);
                                ++var3;
                            }
                        }

                        var2 = var15;
                    } else {
                        g(al >>> 15);
                        var2 = Code[al >>> 15];
                    }
                    break;
                }

                t(var3);
            }

            var3 = al + 3;
            int var4 = (al & 32767) + 3;
            al = var3 + var0;
            var2[var4 + -3] = var0;
            var2[var4 + -1] = var1;
            return var3;
        }
    }

    private static void k(int var0) {
        int var10000;
        if (var0 + 6 > 16384) {
            t(0);
            if (a()) {
                t(1);
            }

            var10000 = var0;

            try {
                j(var10000);
            } finally {
                a.J(true);
                j(var0);
                return;
            }
        } else {
            byte[] var1 = null;

            int var2;
            for(var2 = 0; var2 < 4; ++var2) {
                if ((ai & 16383) + 6 + var0 > 16384) {
                    ai = (ai >>> 14) + 1 << 14;
                }

                if ((var1 = Code[ai >>> 14]) != null) {
                    break;
                }

                if (var2 >= 2) {
                    if (var2 == 2) {
                        var10000 = ai >>> 14;
                        boolean var5 = false;

                        byte[] var10;
                        try {
                            var5 = true;
                            l(var10000);
                            var10 = Code[ai >>> 14];
                            var5 = false;
                        } finally {
                            if (var5) {
                                a.J(true);
                                ++var2;
                            }
                        }

                        var1 = var10;
                    } else {
                        l(ai >>> 14);
                        var1 = Code[ai >>> 14];
                    }
                    break;
                }

                t(var2);
            }

            var2 = ai & 16383;
            var1[var2 + 2] = 1;
            J(var0, var1, var2 + 3);
            R = ai + 6;
            Z = var1;
            S = var2 + 6;
            ai = R + var0;
        }
    }

    private static boolean I(int var0, int var1) {
        if (var0 != 0) {
            int var10000 = l(var0 + -1);
            var0 = var1;
            var1 = var10000;

            int var3;
            for(int var2 = var10000 + -2; (var3 = f(var2)) != 0; var2 -= g(var2)) {
                if (var3 == var0) {
                    return true;
                }
            }

            return Z(var1, var0);
        } else {
            return false;
        }
    }

    private static void Code(int var0, int var1, byte[] var2, int var3, int var4) {
        if (var4 > 0) {
            System.arraycopy(Z(var0), (var0 & 16383) + var1, var2, var3, var4);
        }

    }

    private static void f(int var0) {
        if (var0 == 0) {
            Z = Z(R = ac);
            S = R & 16383;
        } else {
            k(var0);
        }
    }

    private static boolean B() {
        return j() != 0;
    }

    private int Code(int var1, int var2, int var3) {
        if (var2 < 0) {
            Code(var1);
            return I(var2, var3);
        } else {
            return I(var1, var2, var3);
        }
    }

    private static int b(String var0) {
        String var10000 = var0;

        boolean var2;
        try {
            var2 = B(var10000);
        } catch (IOException var1) {
            return 2;
        }

        return var2 ? 1 : 0;
    }

    private boolean q() {
        return this.Code.size() > 0;
    }

    private static int e(int var0) {
        return d[var0 + -1] >> 16 & '\uffff';
    }

    private static boolean C() {
        return an >= Code.length - 1 || Code[Code.length - 1] != null;
    }

    private static void g() {
        int var0 = Z[0];

        int var1;
        for(var1 = 1; var1 < Z.length; ++var1) {
            if (Z[var1] > var0) {
                var0 = Z[var1];
            }
        }

        Code = new boolean[var0 + 1];
        var0 = Z[8];

        for(var1 = 0; var1 < Z.length; ++var1) {
            int var2 = Z[var1];
            Code[var2] = Z(var2, var0);
        }

    }

    private static int g(int var0) {
        return d[var0] >> 16 & '\uffff';
    }

    private static int I(int var0, int var1, int var2, int var3) {
        int var4 = var2;
        if (var0 == var1 - 1) {
            var4 = var2 - var3;
        }

        return Math.max(0, var4);
    }

    private static int f(int var0) {
        return -(d[var0] & '\uffff');
    }

    public final int d() {
        return this.aZ ? this.Code : 0;
    }

    private String l() {
        return this.n + this.m.substring(0, 8);
    }

    private static int I(int var0, int var1, int var2) {
        if (F + 10 >= C.length) {
            af = 23;
            throw Code;
        } else {
            C[F] = A;
            C[F + 1] = y;
            C[F + 2] = z;
            C[F + 3] = var2;
            C[F + 4] = x;
            F += 5;
            x = var1;
            y = D;
            z = E;
            byte var5 = I[var1];
            int var3 = 3;
            int var4 = 3;
            if (var5 != 0) {
                y -= var5 >> 4 & 3;
                if ((var5 & 1) != 0) {
                    ++var1;
                    y -= I[var1];
                }

                z -= var5 >> 6 & 3;
                if ((var5 & 2) != 0) {
                    ++var1;
                    z -= I[var1];
                }

                if ((var5 & 4) != 0) {
                    ++var1;
                    var3 = 3 + 1 + I[var1];
                }

                if ((var5 & 8) != 0) {
                    ++var1;
                    var4 = 3 + 1 + I[var1];
                }
            }

            while(var3-- > 0) {
                J[D++] = 0;
            }

            if ((E += var4) < B.length && D < J.length) {
                A = var0;
                return var1;
            } else {
                af = 23;
                throw Code;
            }
        }
    }

    private static int I(int param0, int param1) {
        // $FF: Couldn't be decompiled
    }

    private synchronized void O() {
        for(int var1 = 0; var1 < this.Code.size(); ++var1) {
            a var2;
            if (!(var2 = (a)this.Code.elementAt(var1)).Code()) {
                this.J(var2);
                --var1;
            }
        }

    }

    private static int u(int var0) {
        int var1;
        switch(var0 & 4095) {
            case 0:
            case 1:
            case 2:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            default:
                var1 = 0;
                break;
            case 3:
                var1 = 2;
                break;
            case 4:
                var1 = 1;
                break;
            case 5:
                var1 = 3;
                break;
            case 6:
                var1 = 4;
        }

        if ((4096 & var0) != 0) {
            var1 |= 65536;
        }

        if ((8192 & var0) != 0) {
            var1 |= 131072;
        }

        if ((16384 & var0) != 0) {
            var1 |= 262144;
        }

        if (('耀' & var0) != 0) {
            var1 |= 524288;
        }

        if ((65536 & var0) != 0) {
            var1 |= 1048576;
        }

        if ((131072 & var0) != 0) {
            var1 |= 2097152;
        }

        return var1;
    }

    public static int Code(String var0, String var1) {
        String var10000 = var0;
        boolean var9 = false;

        try {
            var9 = true;
            Object[] var11 = Code(var10000);

            for(int var2 = 0; var2 < Code.length; ++var2) {
                Code var12 = Code[var2];
                String var10001 = (String)var11[0];
                String var10002 = (String)var11[1];
                int var10003 = (Integer)var11[2];
                String var3 = (String)var11[3];
                int var4 = var10003;
                String var5 = var10002;
                String var6 = var10001;
                Code var7 = var12;
                if (I(var12.c, var6) && I(var7.d, var5) && (var7.cq == 0 || var4 == var7.cq) && I(var7.b, var3)) {
                    if (Code[var2].cv == 255) {
                        return Code((String)var1, (String)null);
                    }

                    var12 = Code[var2];
                    var9 = false;
                    return var12.cv;
                }
            }

            return 0;
        } finally {
            if (var9) {
                return 0;
            }
        }
    }

    private static void Code(int var0, int var1, boolean var2) {
        int var3 = l(var0);
        if (var1 <= l(var0 + -3) - 1) {
            Code = Code(var0);
            Code = (var0 & 32767) + 1;
            Z(Code, Code + var3, var1 - var3);
            a(var0, var1);
            Q = var0;
        } else {
            int var4 = Math.max(var1, var3 << 1);
            if (var2) {
                L = var0;
                Z(var4, var1);
                I(L, 1, Q, 1, var3);
                L = 0;
            } else {
                Z(var4, var1);
            }
        }
    }

    private void J(byte[] var1, int var2) {
        this.s = new Code(var1, var2, 32);
    }

    private static int I(char[] var0, int var1, int var2) {
        char[] var3 = var0;
        int var4 = 0;
        int var5 = 0;

        while(true) {
            while(var5 < var2) {
                char var6;
                if ((var6 = var3[var1 + var5]) >= '\ud800' && var6 <= '\udbff') {
                    var4 += 4;
                    ++var5;
                    ++var5;
                } else {
                    var4 += x(var6);
                    ++var5;
                }
            }

            k(var4);

            for(int var8 = 0; var8 < var2; ++var8) {
                if ((var4 = var0[var1 + var8]) >= 55296 && var4 <= 56319) {
                    int var10000 = 65536 + (var4 - '\ud800' << 10);
                    ++var8;
                    var4 = var10000 + (var0[var1 + var8] - '\udc00');
                }

                S += Code(var4, Z, S);
            }

            h();
            int var7 = V;
            V = 0;
            return var7;
        }
    }

    private static int Code(String var0, byte[] var1, int var2) {
        int var3 = 0;

        for(int var4 = 0; var4 < var0.length(); ++var4) {
            int var5;
            if ((var5 = var0.charAt(var4)) >= 55296 && var5 <= 56319) {
                int var10000 = 65536 + (var5 - '\ud800' << 10);
                ++var4;
                var5 = var10000 + (var0.charAt(var4) - '\udc00');
            }

            var3 += Code(var5, var1, var2 + var3 + 2);
        }

        I(var3, var1, var2);
        return var3;
    }

    private static int c(String var0) {
        int var1 = 0;
        int var2 = 0;

        while(true) {
            while(var2 < var0.length()) {
                char var3;
                if ((var3 = var0.charAt(var2)) >= '\ud800' && var3 <= '\udbff') {
                    var1 += 4;
                    ++var2;
                    ++var2;
                } else {
                    var1 += x(var3);
                    ++var2;
                }
            }

            return var1;
        }
    }

    private void d(int var1, int var2) {
        if (var1 <= 0) {
            this.C = 0;
            this.b = 0;
        } else {
            this.C = Math.max(1, var1 - var2);
            this.b = var2;
        }
    }

    private boolean i() {
        return this.Code != null && this.b < this.Code.size();
    }

    private static boolean Z(int var0, int var1) {
        do {
            if (var0 == var1) {
                return true;
            }
        } while((var0 = d[var0]) != 0);

        return false;
    }

    private void i(int var1, int var2) {
        this.Code.readFully(this.g, var1, var2);
        Code((long)var2, 0L, 0L);
    }

    private static int Code(byte[] var0, int var1, int var2, byte[] var3, int var4, int var5) {
        k(var2 + var5);
        System.arraycopy(var0, var1, Z, S, var2);
        System.arraycopy(var3, var4, Z, S + var2, var5);
        h();
        int var6 = V;
        V = 0;
        return var6;
    }

    private static int Code(byte[] var0, int var1, int var2) {
        Z(var0, var1, var2);
        int var3 = V;
        V = 0;
        return var3;
    }

    public static void Z(int var0) {
        Code = Code(var0);
        Code = (var0 & 32767) + 1;
    }

    private static boolean Code(int var0) {
        return var0 >= 0 && var0 < Code.length && Code[var0];
    }

    private static int I(byte[] var0, int var1, int var2) {
        int var3;
        for(var3 = 0; var2-- > 0; var3 = var3 * 33 + var0[var1 + var2]) {
        }

        return var3;
    }

    private static void c(int var0) {
        T = l(ab);
        int var1 = c(ab, 2);
        var1 = var0 & var1 - 1;

        for(var1 = Code(T)[(T & 32767) + var1]; var1 != 0; var1 = l(var1)) {
            if (l(var1 + 1) == L && l(var1 + 2) == var0) {
                V = var1;
                T = 0;
                return;
            }
        }

        T = 0;
        a((V = b(3, q)) + 1, L);
        a(V + 2, var0);
        b(ab, var0);
    }

    public static int Code(String var0) {
        k(c(var0));

        for(int var1 = 0; var1 < var0.length(); ++var1) {
            int var2;
            if ((var2 = var0.charAt(var1)) >= 55296 && var2 <= 56319) {
                int var10000 = 65536 + (var2 - '\ud800' << 10);
                ++var1;
                var2 = var10000 + (var0.charAt(var1) - '\udc00');
            }

            S += Code(var2, Z, S);
        }

        h();
        int var3 = V;
        V = 0;
        return var3;
    }

    private void ai() {
        this.bn = 3;
        this.aj();
    }

    private static int C(int var0, int var1) {
        int[] var2 = Code(var0);
        int var3 = (var0 & 32767) + 1;
        var0 = l(var0);

        for(int var4 = 0; var4 < var0; ++var4) {
            if (var2[var3 + var4] == var1) {
                return var4;
            }
        }

        return -1;
    }

    private static int Code(long var0) {
        a(V = b(2, w), (int)(var0 >> 32));
        a(V + 1, (int)var0);
        int var2 = V;
        V = 0;
        return var2;
    }

    public static String Code(int var0) {
        return Code(Z((var0 = l(var0 + 1)) - 2), var0 - 2 & 16383);
    }

    private static boolean Code(int var0, int var1, int var2) {
        return Code(Z(var0), var0 & 16383, Z(var1), var1 & 16383, var2);
    }

    private static char[] I(int var0) {
        m(var0);
        byte[] var10000 = Z((var0 = l(var0 + 1)) - 2);
        var0 = var0 - 2 & 16383;
        byte[] var1 = var10000;
        int var2 = B(var10000, var0);
        var0 += 2;
        return Code(var1, var0, var0 + var2);
    }

    private static void J(int var0, int var1) {
        Code = Code(var0);
        Code = (var0 & 32767) + 1 + var1;
    }

    private static void Z(int var0, int var1) {
        a(Q = b(var0 + 1, s), var1);
        Code = Code(Q);
        Code = (Q & 32767) + 1;
    }

    private static int n() {
        int var0 = b(2, t);
        int var1 = R;
        a(var0 + 1, var1);
        var1 = m(R);
        a(var0, var1);
        R = 0;
        return var0;
    }

    private static void i() {
        if (C()) {
            int[][] var0 = new int[Code.length << 1][];
            System.arraycopy(Code, 0, var0, 0, Code.length);
            Code = var0;
        }

    }

    private static long Code(int var0) {
        return (long)l(var0) << 32 | (long)l(var0 + 1) & 4294967295L;
    }

    private static int m() {
        int var0 = Q;
        Q = 0;
        return var0;
    }

    private static void h() {
        T = l(aa);
        int var0 = c(aa, 2);
        int var1 = m(R);
        int var2;
        var0 = (var2 = J(R, var1)) & var0 - 1;

        for(var0 = Code(T)[(T & 32767) + var0]; var0 != 0; var0 = l(var0)) {
            int var3;
            if (m(var3 = l(var0 + 1)) == var1 && Code(var3, R, var1)) {
                V = var0;
                T = 0;
                R = 0;
                return;
            }
        }

        T = 0;
        a((V = b(3, p)) + 1, R);
        R = 0;
        a(V + 2, var2);
        b(aa, var2);
    }

    private static int c(int var0, int var1) {
        int var2 = l(var0 + 1);
        int var3 = l(T + -3);
        if (var2 > var3 * 3 / 4) {
            var2 = b(var3 << 1, -1);
            a(var0, var2);
            int[] var12 = Code(T);
            int[] var4 = Code(var2);
            int var5 = T & 32767;
            int var6 = var2 & 32767;

            int var9;
            for(int var7 = 0; var7 < var3; ++var7) {
                for(int var8 = var12[var5 + var7]; var8 != 0; var8 = var9) {
                    var9 = l(var8);
                    a(var8, 0);
                    int var10 = var6 + (l(var8 + var1) & (var3 << 1) - 1);
                    int var11;
                    if ((var11 = var4[var10]) != 0) {
                        a(var8, var11);
                    }

                    var4[var10] = var8;
                }
            }

            T = var2;
            var3 <<= 1;
        }

        return var3;
    }

    private static int a(int var0, int var1) {
        return b(var0, Z[var1]);
    }

    private static void l() {
        L = 0;
        M = 0;
        Q = 0;
        T = 0;
        U = 0;
        V = 0;
        R = 0;
        W = 0;
        X = 0;
    }

    private static void Z(byte[] var0, int var1, int var2) {
        T = l(aa);
        int var3 = c(aa, 2);
        int var4;
        var3 = (var4 = I(var0, var1, var2)) & var3 - 1;

        for(var3 = Code(T)[(T & 32767) + var3]; var3 != 0; var3 = l(var3)) {
            int var5;
            if (m(var5 = l(var3 + 1)) == var2 && Code(Z(var5), var5 & 16383, var0, var1, var2)) {
                V = var3;
                T = 0;
                return;
            }
        }

        T = 0;
        V = b(3, p);
        k(var2);
        if (var2 > 0) {
            System.arraycopy(var0, var1, Z, S, var2);
        }

        a(V + 1, R);
        R = 0;
        a(V + 2, var4);
        b(aa, var4);
    }

    private static void d(int var0) {
        Q = B(var0, 0);
    }

    private static int Z(byte[] var0, int var1, int var2) {
        f(var2);
        System.arraycopy(var0, var1, Z, S, var2);
        return n();
    }

    private static int h(int var0) {
        return var0 >= 65 && var0 <= 90 ? var0 + 32 : var0;
    }

    private static void p(int var0) {
        int var1;
        if ((var1 = l(var0)) != 0) {
            int var2 = l(var0 + 1);
            int[] var3 = Code(var1);
            int var4 = var1 & 32767;
            int var5 = l(var1 + -3);

            while(true) {
                --var5;
                if (var5 < 0) {
                    n(var1);
                    a(var0 + 1, var2);
                    break;
                }

                int var6 = var4 + var5;
                int var7 = var3[var6];

                int var9;
                for(int[] var8 = var3; var7 != 0; var7 = var9) {
                    var9 = l(var7);
                    if (l(var7 + -2) != 0) {
                        var8 = Code(var7);
                        var6 = var7 & 32767;
                    } else {
                        var8[var6] = var9;
                        --var2;
                    }
                }
            }
        }

    }

    private static void k() {
        label86:
        while(true) {
            if (ar >= 0) {
                int var0 = ar;
                ar = l(ar + -2);
                int var1;
                if ((var1 = l(var0 + -1)) == -1) {
                    ++at;
                    au += l(var0 + -3) - 1;
                    Code(Code(var0), var0 & 32767, l(var0 + -3));
                    continue;
                }

                if (var1 == r) {
                    var1 = l(var0);
                    au += var1;
                    Code(Code(var0), (var0 & 32767) + 1, var1);
                    continue;
                }

                if (var1 == s) {
                    at += l(var0);
                    continue;
                }

                if (var1 == t) {
                    o(l(var0 + 1));
                    continue;
                }

                if (var1 == p) {
                    o(l(var0 + 1));
                    continue;
                }

                if (var1 == o) {
                    continue;
                }

                if (var1 == q) {
                    n(l(var0 + 1));
                    continue;
                }

                if (var1 == u) {
                    if (ay < l(var0 + 1)) {
                        n(l(var0));
                    }
                    continue;
                }

                int var2;
                if (var1 == v) {
                    if ((var1 = l(var0)) == 0) {
                        continue;
                    }

                    var2 = l(var0 + 1);
                    int var3 = l(var0 + 2);
                    if (var2 != 0) {
                        if (ay < l(var0 + 3)) {
                            n(var2);
                        }

                        if (l(var2 + -2) != 0) {
                            n(var1);
                            var2 = 0;
                        }
                    }

                    if (var3 != 0) {
                        if (ay < l(var0 + 3)) {
                            n(var3);
                        }

                        if (l(var3 + -2) != 0) {
                            n(var1);
                            var3 = 0;
                        }
                    }

                    if (var2 != 0 || var3 != 0) {
                        a(var0 + -2, ax);
                        ax = var0;
                    }
                    continue;
                }

                int var10000 = var0;
                var0 = var1;
                var1 = var10000;

                while(true) {
                    if (var0 == 0) {
                        continue label86;
                    }

                    var2 = d[var0];
                    Code(Code(var1), (var1 & 32767) + (var2 != 0 ? d(var2) : 0), e(var0));
                    var0 = var2;
                }
            }

            return;
        }
    }

    private Code(Code var1, int var2, int var3, String var4, String var5, String var6, int var7) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        super();
        this.C = var1;
        this.az = var2;
        this.C = var3;
        this.b = var4;
        this.c = var5;
        this.d = var6;
        this.b = var7;
    }

    private Code(String var1, String var2, int var3, String var4, int var5) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aX = true;
        super();
        this.c = var1;
        this.d = var2;
        this.cq = var3;
        this.b = var4;
        this.cv = var5;
    }

    private static J Code(String var0, String var1) {
        return new Code(var0, var1, aB ^ true);
    }

    public Code(String var1, byte var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        this.aH = true;
        super();
        this.c = var1;
    }

    public Code(int var1, boolean var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        this.aF = true;
        this((int)0, (short)0);
    }

    private int q(int var1) {
        return ((Code)this.Code.elementAt(var1)).C;
    }

    private static Code Code(Object var0) {
        return (Code)((Object[])var0)[0];
    }

    private synchronized int Code(Object var1) {
        return (Integer)((Object[])var1)[5];
    }

    private static byte[] I(int var0) {
        return Z(l(var0 + 1));
    }

    private static int J(int var0, int var1) {
        return I(Z(var0), var0 & 16383, var1);
    }

    private static int B(int var0, int var1) {
        a(var0 = b(var0 + 1, r), var1);
        return var0;
    }

    private static int l() {
        int var0 = Q;
        Q = 0;
        return var0;
    }

    private static void e(int var0) {
        L = var0;
        if ((var0 = l(Q)) >= l(Q + -3) - 1) {
            int var1 = B((var0 << 1) + 1, (var0 << 1) + 1);
            I(Q, 1, var1, 1, var0);
            Q = var1;
        }

        Code(Q)[(Q & 32767) + 1 + var0] = L;
        ++var0;
        a(Q, var0);
        L = 0;
    }

    private static int j(int var0) {
        i();

        int var1;
        for(var1 = an; Code[var1] != null; ++var1) {
        }

        Code[var1] = new int[var0 + 3];
        return var1;
    }

    public static int Code(int var0) {
        return l(var0);
    }

    private static void Code(InputStream var0, OutputStream var1, Code var2) {
        DataInputStream var8 = new DataInputStream(var0);
        DataOutputStream var11 = new DataOutputStream(var1);
        int var3 = 0;
        Code var4 = null;
        byte[] var5 = new byte[1024];
        Code var6;
        Code var7;
        (var7 = var6 = new Code((byte)0, '\u0000')).a = 1;
        var7.b = 0;
        var7.C = 0;
        var7.az = 0;
        Vector var14 = var2.Code;

        for(int var16 = 0; var16 < var14.size(); ++var16) {
            (var4 = (Code)var14.elementAt(var16)).Code();
            var4 = (Code)var4;
        }

        int var15;
        while((var15 = var8.read(var5)) >= 0) {
            var6.J(var5, 0, var15);
            var11.write(var5, 0, var15);
            var3 += var15;
        }

        var6.a %= 65521;
        var6.b %= 65521;
        int var9 = var6.b << 16 | var6.a;
        byte[] var12;
        (var12 = new byte[4])[3] = (byte)var9;
        var12[2] = (byte)(var9 >>> 8);
        var12[1] = (byte)(var9 >>> 16);
        var12[0] = (byte)(var9 >> 24);
        byte[] var10 = var12;
        if (var4.a != var3) {
            throw new IOException();
        } else if (var4.Code.length != var12.length) {
            throw new IOException();
        } else {
            for(int var13 = 0; var13 < var4.Code.length; ++var13) {
                if (var4.Code[var13] != var10[var13]) {
                    throw new IOException();
                }
            }

        }
    }

    private static void Z(int var0, byte[] var1, int var2) {
        var1[var2] = (byte)(var0 >> 24);
        var1[var2 + 1] = (byte)(var0 >> 16);
        var1[var2 + 2] = (byte)(var0 >> 8);
        var1[var2 + 3] = (byte)var0;
    }

    private synchronized void Code(boolean var1, int var2, int var3, int var4) {
        this.n.B = var1;
        if (var1) {
            this.m.B.Code(var4, var2, var3);
            this.n.I(this.m.B);
            this.n.Z(this.m.B);
        }

    }

    private static void B(int var0, int var1, int var2) {
        if (var1 < 0 || var2 < 0 || var1 + var2 > var0) {
            (new StringBuffer()).append("offset=").append(var1).append(" length=").append(var2).append(" size=").append(var0);
            af = 16;
            throw Code;
        }
    }

    private int p(int var1) {
        return ((Code)this.Code.elementAt(var1)).a;
    }

    private static void B(int var0, int var1) {
        Z = I(var0);
        S = i(var0) + var1;
    }

    private static byte[] Code(int var0) {
        int var1;
        byte[] var2 = new byte[var1 = l(var0)];
        Code(l(var0 + 1), 0, var2, 0, var1);
        return var2;
    }

    private int s(int var1) {
        return ((Code)this.Code.elementAt(var1)).br;
    }

    private synchronized String f() {
        return this.n.i();
    }

    private static int i(int var0) {
        return l(var0 + 1) & 16383;
    }

    private static void g(int var0) {
        i();
        Code[var0] = new int['耀'];
    }

    private void F(int var1) {
        this.Code((byte)(var1 >> 24));
        this.Code((byte)(var1 >>> 16));
        this.Code((byte)(var1 >>> 8));
        this.Code((byte)var1);
    }

    private void J(byte[] var1, int var2, int var3) {
        for(this.az += var3; var3-- > 0; this.b += this.a) {
            if (this.C++ == 2775) {
                this.a %= 65521;
                this.b %= 65521;
                this.C = 0;
            }

            this.a += var1[var2++] & 255;
        }

    }

    private static void I(int var0, int var1, int var2, int var3) {
        if (Code.B()) {
            Z(Code.getWidth() - var1 - var3, var0, var3, var2);
        } else {
            Z(var0, var1, var2, var3);
        }
    }

    private static void Z(int var0, int var1, int var2, int var3) {
        if (ay) {
            var2 = Code.getWidth() - var0;
        }

        Code.repaint(var0, var1, var2, var3);
    }

    private static Object Code(int var0) {
        return Code[l(var0)];
    }

    private static int[] Code(int var0) {
        return Code[var0 >>> 15];
    }

    private static void Code(int[] var0, int var1, int var2) {
        while(var2-- > 0) {
            n(var0[var1 + var2]);
        }

    }

    private static void u(int var0) {
        if (!Code) {
            a(var0);
        }

    }

    private static void G(int var0) {
        if (var0 != bt) {
            K(0);
            bt = var0;
            z = true;
        }

    }

    private static void I(int[] var0, int var1, int var2) {
        while(var2-- > 0) {
            int var3;
            if ((var3 = var0[var1 + var2]) >= am) {
                var0[var1 + var2] = l(var3 + -2);
            }
        }

    }

    private Code(char var1, int var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        super();
    }

    private static void a(int var0, int var1) {
        Code(var0)[var0 & 32767] = var1;
    }

    private static void I(int var0, int var1, int var2, int var3, int var4) {
        if (var4 > 0) {
            System.arraycopy(Code(var0), (var0 & 32767) + var1, Code(var2), (var2 & 32767) + var3, var4);
        }

    }

    private static int k(int var0) {
        return d[ao + var0];
    }

    private String i() {
        if (this.B && !this.B.Code() && !this.a.Code()) {
            B var1;
            B var2 = (var1 = B.Code(this.B, this.a)) != this.B ? this.B : this.a;
            StringBuffer var3 = new StringBuffer();
            var1 = new B(var1);

            while(var1.Code(var2) < 0) {
                String var5 = var1.Code.I();
                Code var6;
                var3.append((char)(var1.Code < var5.length() ? var5.charAt(var1.Code) : ((var6 = var1.Code.J()) == null ? '\u0000' : (var1.Code.Z(var6) ? ' ' : '\n'))));
                if (var1.I()) {
                    break;
                }
            }

            return var3.toString();
        } else {
            return "";
        }
    }

    private synchronized void I(Object var1) {
        Hashtable var2 = (Hashtable)((Object[])var1)[3];
        StringBuffer var3 = new StringBuffer();

        for(Enumeration var4 = var2.keys(); var4.hasMoreElements(); var3.append(var4.nextElement())) {
            if (var3.length() > 0) {
                var3.append('\u0000');
            }
        }

        this.I((Integer)((Object[])var1)[1], var3.toString());
    }

    private Code(boolean var1, short var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aT = true;
        super();
    }

    private synchronized void I(Object var1, int var2) {
        Hashtable var3 = (Hashtable)((Object[])var1)[3];
        if (!(Boolean)((Object[])var1)[4]) {
            var3.clear();
        }

        Integer var4 = new Integer(var2);
        if (!var3.containsKey(var4)) {
            var3.put(var4, var4);
        } else {
            var3.remove(var4);
        }
    }

    private synchronized boolean Code(Object var1, int var2) {
        return ((Hashtable)((Object[])var1)[3]).containsKey(new Integer(var2));
    }

    private static void Code(Vector var0, Object var1) {
        String var2 = ((String)((Object[])var1)[2]).toLowerCase();
        int var3;
        if ((var3 = var0.size() - 1) >= 0 && var2.compareTo(((String)((Object[])var0.lastElement())[2]).toLowerCase()) < 0) {
            while(var3 > 0 && var2.compareTo(((String)((Object[])var0.elementAt(var3 - 1))[2]).toLowerCase()) < 0) {
                --var3;
            }

            var0.insertElementAt(var1, var3);
        } else {
            var0.addElement(var1);
        }
    }

    public static String I(int var0) {
        return "b_" + var0;
    }

    private static void C(int var0, int var1) {
        d[ao + var0] = var1;
    }

    private static int Code(Hashtable var0) {
        if (var0 == null) {
            return 0;
        } else {
            int var1 = 7;

            String var3;
            Object[] var4;
            for(Enumeration var2 = var0.keys(); var2.hasMoreElements(); var1 = var1 + 2 + c(var3) + 2 + c((String)var4[0]) + 4 + (Integer)var4[1]) {
                var3 = (String)var2.nextElement();
                var4 = (Object[])var0.get(var3);
            }

            return var1;
        }
    }

    private void B(a var1) {
        if (var1 != null) {
            Hashtable var2;
            if ((var2 = var1.Code(true)) != null) {
                int var3 = Thread.currentThread().getPriority();
                Thread.currentThread().setPriority(1);
                Z var4 = new Z(4104);
                DataOutputStream var5 = new DataOutputStream(var4);
                Code((Z)var4, (int)22, var1.Z(), 7);
                var5.write(1);
                var5.writeShort(9);
                int var6 = Code(var2) - 7;
                var5.writeInt(var6);
                this.b(var4.Code(), 0, 15);
                this.I((byte[])var4.Code(), 15);
                var4.Code(0);
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
                                var10 = c(var8) + c((String)var9[0]) + 8;
                                Code((Z)var4, (int)22, var1.Z(), var10);
                                var5.writeUTF(var8);
                                var5.writeUTF((String)var9[0]);
                                var56 = (Integer)var9[1];
                                var5.writeInt(var56);
                                this.b(var4.Code(), 0, var10 + 8);
                                this.I(var4.Code(), var10 + 8);
                                var4.Code(0);
                                var55 = I.Code((String)var9[0], false, 1).Code();
                                var57 = var4.Code();
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
                                    Code((byte[])var57, 0, 22, var1.Z(), var11);
                                    this.b(var57, 0, var11 + 8);
                                    this.I(var57, var11 + 8);
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
                    var59 = var55;

                    try {
                        var59.close();
                    } finally {
                        ;
                    }

                    Thread.currentThread().setPriority(var3);
                    throw var54;
                }

                var59 = var55;

                try {
                    var59.close();
                } finally {
                    ;
                }

                Thread.currentThread().setPriority(var3);
            }
        }
    }

    public final boolean J() {
        return !I(this.I().charAt(0));
    }

    private static void b(int var0, int var1) {
        int var2;
        var1 = ((var2 = l(var0)) & 32767) + (var1 & l(var2 + -3) - 1);
        int[] var3 = Code(var2);
        a(V, var3[var1]);
        var3[var1] = V;
        var1 = l(var0 + 1) + 1;
        a(var0 + 1, var1);
    }

    private void I(InputStream var1) {
        boolean var2 = false;
        this.Code.removeAllElements();
        a var7;
        if ((var7 = new a(var1)).readByte() == 69 && var7.readByte() == 80) {
            int var3 = 0;

            while(true) {
                while(true) {
                    a var10000 = var7;

                    byte var9;
                    try {
                        var9 = var10000.readByte();
                    } catch (EOFException var6) {
                        if (!var2) {
                            throw new IOException();
                        }

                        return;
                    }

                    byte var4 = var9;
                    Code var8;
                    switch(var4) {
                        case 0:
                            if (var2) {
                                throw new IOException();
                            }

                            var8 = new Code((byte)0, (byte)0);
                            break;
                        case 1:
                            var8 = new Code('\u0000');
                            break;
                        case 2:
                            var8 = new Code((short)0);
                            break;
                        case 3:
                        default:
                            throw new IOException();
                        case 4:
                            var8 = new Code(false);
                    }

                    var3 = var8.Code((DataInput)var7, (int)var3);
                    boolean var10 = var8 instanceof Code;
                    if (((Code)var8).bj) {
                        var10 = false;
                    }

                    if (var10) {
                        var10 = ((Code)var8).d;
                    }

                    if (((Code)var8).c) {
                        var10 = false;
                    }

                    if (var10) {
                        var10 = ((Code)var8).b;
                    }

                    if (var10) {
                        var8 = (Code)var8;

                        for(int var5 = 0; var5 < var8.I.length; ++var5) {
                            this.Z(new Code(var8.I[var5], (byte)0));
                        }
                    } else {
                        if (((Code)var8).c) {
                            var2 = true;
                        }

                        this.Z(var8);
                    }
                }
            }
        } else {
            throw new IOException();
        }
    }

    private boolean t() {
        if (this.c == null) {
            this.I();
        }

        return !this.B;
    }

    private boolean A() {
        return this.cp == 0;
    }

    private boolean y() {
        return this.bq > 0;
    }

    private static byte[] Z(int var0) {
        return Code[var0 >>> 14];
    }

    public final boolean Z() {
        return this.c != null && this.c.length() > 0;
    }

    private OutputStream Code(long var1) {
        return this.Code.openOutputStream(var1);
    }

    private static void i(int var0) {
        if (var0 + 6 > 16384) {
            if (Code[ai >>> 14] != null) {
                c(ai >>> 14, ai & 16383);
                ai = (ai >>> 14) + 1 << 14;
            }

            Z = new byte[var0 + 6];
            Code[ai >>> 14] = Z;
            J(var0, Z, 3);
            R = ai + 6;
            S = 6;
            ai = (ai >>> 14) + 1 << 14;
        } else {
            if ((ai & 16383) + 6 + var0 > 16384) {
                c(ai >>> 14, ai & 16383);
                ai = (ai >>> 14) + 1 << 14;
            }

            if (Z(ai) == null) {
                ++ak;
                j();
                Code[ai >>> 14] = new byte[16384];
            }

            k(var0);
        }
    }

    private static void j(int var0) {
        j();

        int var1;
        for(var1 = ak; Code[var1] != null; ++var1) {
        }

        Z = new byte[var0 + 6];
        Code[var1] = Z;
        J(var0, Z, 3);
        R = (var1 << 14) + 6;
        S = 6;
    }

    private static void l(int var0) {
        j();
        Code[var0] = new byte[16384];
    }

    private static void n(int var0) {
        if (var0 >= am) {
            if (l(var0 + -2) != 0) {
                return;
            }

            a(var0 + -2, ar);
            ar = var0;
        }

    }

    private static int x() {
        return ac ? 6 : 7;
    }

    private synchronized a Code(int var1) {
        for(int var2 = 0; var2 < this.Code.size(); ++var2) {
            a var3;
            if ((var3 = (a)this.Code.elementAt(var2)).Z() == var1) {
                return var3;
            }
        }

        return null;
    }

    public final synchronized void Code(a var1) {
        if (this.o()) {
            this.Code(false, 2);
            if (var1.Z()) {
                throw new IOException();
            }
        }

    }

    private Code(byte var1, int var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        super();
    }

    private static void c(int var0, int var1) {
        ++ak;
        j();
        Code[var0 + 1] = Code[var0];
        Code[var0] = new byte[var1];
        System.arraycopy(Code[var0 + 1], 0, Code[var0], 0, var1);
        c(Code[var0 + 1], 0, 16384);
    }

    private synchronized void J(a var1) {
        this.Z(var1);
        var1.Code();
        I(var1);
    }

    private static boolean a() {
        return ak >= Code.length - 1 || Code[Code.length - 1] != null;
    }

    private static synchronized void Code(DataOutputStream var0) {
        var0.writeBoolean(E);
        var0.writeByte(-1);
        var0.writeByte(J);
        var0.writeByte(B);
        var0.writeUTF(h == null ? "" : h);
        var0.writeUTF(g == null ? "" : g);
        var0.writeByte(bs);
        var0.writeBoolean(G);
        var0.writeInt("mini5.opera-mini.net".hashCode());
        var0.writeBoolean(u);
        var0.writeLong(J);
        var0.writeByte(C.size());
        Enumeration var1 = C.keys();

        while(var1.hasMoreElements()) {
            String var2 = (String)var1.nextElement();
            var0.writeUTF(var2);
            Code var3 = (Code)((Object[])C.get(var2))[0];
            Code(var0, var3.I);
            var0.writeLong(var3.Z);
            var0.write(var3.g);
            var0.write(var3.f.length);
            var0.write(var3.f);
            if (I[1] == null) {
                var0.writeInt(0);
            } else {
                Code(var0, var3.g);
                Code(var0, var3.h);
            }
        }

    }

    private static int n(int var0) {
        return var0 >= am ? l(var0 + -2) : var0;
    }

    private static int Code(Hashtable var0, String var1) {
        int var2 = -1;
        int var3 = 0;

        int var4;
        do {
            if ((var4 = var1.indexOf(0, var3)) < 0) {
                var4 = var1.length();
            }

            String var10000 = var1;
            int var10001 = var3;
            int var10002 = var4;

            label33: {
                try {
                    var3 = Integer.parseInt(var10000.substring(var10001, var10002));
                    Integer var5 = new Integer(var3);
                    var0.put(var5, var5);
                } catch (Exception var6) {
                    break label33;
                }

                if (var3 < var2 || var2 < 0) {
                    var2 = var3;
                }
            }

            var3 = var4 + 1;
        } while(var4 < var1.length());

        return var2;
    }

    public static int Z(int var0) {
        return var0 > 0 && var0 < e.length ? e[var0] : 0;
    }

    private static void j() {
        if (a()) {
            byte[][] var0 = new byte[Code.length << 1][];
            System.arraycopy(Code, 0, var0, 0, Code.length);
            Code = var0;
        }

    }

    private static int y() {
        String var10000 = System.getProperty("com.sonyericsson.net.mcc");

        try {
            return Integer.parseInt(var10000);
        } finally {
            return -1;
        }
    }

    private static int Code(int var0, int var1, Object var2) {
        if (var2 == null) {
            return 0;
        } else {
            if (!b()) {
                t(0);
                if (!b()) {
                    t(1);
                    if (!b()) {
                        af = 22;
                        throw Code;
                    }
                }
            }

            a(var0 = b(var1, Z[var0]), as);
            Code[as] = var2;
            return var0;
        }
    }

    private static void m(int var0) {
        if (var0 == 0) {
            af = 21;
            throw Code;
        }
    }

    private static void q(int var0) {
        int var1;
        if ((var1 = l(var0)) >= am) {
            a(var0, l(var1 + -2));
        }

    }

    private static void o(int var0) {
        if (var0 >= aj) {
            Z(var0 -= 6)[var0 & 16383] = 1;
        }

    }

    private static int o(int var0) {
        return var0 >= aj ? I(Z(var0), (var0 & 16383) - 6) + 6 : var0;
    }

    private static void Code(DataOutputStream var0, int[] var1) {
        if (var1 != null) {
            var0.writeShort(var1.length);
            var0.write(Code(var1));
        } else {
            var0.writeShort(0);
        }
    }

    public final int C(int var1) {
        return this.b ? this.g[var1] : -1;
    }

    private static void r(int var0) {
        a(var0, o(l(var0)));
    }

    private static void s(int var0) {
        int var1;
        if ((var1 = l(var0 + -1)) == -1) {
            I(Code(var0), var0 & 32767, l(var0 + -3));
        } else if (var1 == r) {
            var1 = l(var0);
            I(Code(var0), (var0 & 32767) + 1, var1);
        } else if (var1 != s) {
            if (var1 == t) {
                r(var0 + 1);
            } else if (var1 == p) {
                r(var0 + 1);
                q(var0);
            } else if (var1 == -2) {
                q(var0);
            } else if (var1 == u) {
                if ((var1 = l(var0)) != 0 && l(var1 + -2) == 0) {
                    a(var0, 0);
                } else {
                    q(var0);
                }
            } else {
                int var2;
                if (var1 == v) {
                    var1 = l(var0);
                    var2 = l(var0 + 1);
                    int var3 = l(var0 + 2);
                    if (var2 != 0) {
                        if (l(var2 + -2) == 0) {
                            a(var0 + 1, 0);
                            var2 = 0;
                        } else {
                            q(var0 + 1);
                        }
                    }

                    if (var3 != 0) {
                        if (l(var3 + -2) == 0) {
                            a(var0 + 2, 0);
                            var3 = 0;
                        } else {
                            q(var0 + 2);
                        }
                    }

                    if (var1 != 0) {
                        if (var2 == 0 && var3 == 0 && l(var1 + -2) == 0) {
                            a(var0, 0);
                            return;
                        }

                        q(var0);
                    }

                } else {
                    int var10000 = var0;
                    var0 = var1;

                    for(var1 = var10000; var0 != 0; var0 = var2) {
                        var2 = d[var0];
                        I(Code(var1), (var1 & 32767) + (var2 != 0 ? d(var2) : 0), e(var0));
                    }

                }
            }
        }
    }

    private static String J(String var0) {
        if (Code == null) {
            Code = new Hashtable();
            byte[] var1 = I("/resources");
            String var5 = (new String(var1)).trim();

            int var4;
            for(int var2 = 0; var2 < var5.length(); var2 = var4 + 1) {
                int var3 = var5.indexOf(61, var2);
                if ((var4 = var5.indexOf(10, var3 + 1)) < 0) {
                    var4 = var5.length();
                }

                String var6 = var5.substring(var2, var3).trim();
                String var7 = var5.substring(var3 + 1, var4).trim();
                Code.put(var6, var7);
            }
        }

        return (String)Code.get(var0);
    }

    private void J(boolean var1) {
        I = System.currentTimeMillis();
        if (Q) {
            t(99);
        } else {
            int var5 = !var1 && aH >= 2 ? 0 : 1;
            int var2 = I.size();
            int var3 = 0;

            while(var3 < var2) {
                Code var4;
                if ((var4 = (Code)I.elementAt(var3)) != d) {
                    var4.C.d((boolean)var5);
                    ++var3;
                } else {
                    var4.C.d(false);
                    ++var3;
                }
            }

            t(var5 * 99);
        }

        System.gc();
        if (bz > 0) {
            this.p();
        }

    }

    private Code(byte var1, char var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        super();
    }

    private Code(byte var1, short var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        super();
        this.Code = new Vector();
    }

    private void Z(Code var1) {
        for(int var2 = this.Code.size(); var2 > 0; --var2) {
            Code var3 = (Code)this.Code.elementAt(var2 - 1);
            int var5;
            int var6;
            if ((var6 = (var5 = var1.f() - ((Code)var3).f()) == 0 ? var1.Code() - ((Code)var3).Code() : var5) == 0) {
                this.Code.insertElementAt(var1, var2);
                return;
            }

            if (var6 > 0) {
                this.Code.insertElementAt(var1, var2);
                return;
            }
        }

        this.Code.insertElementAt(var1, 0);
    }

    private synchronized void o() {
        h = true;
        aA = 47;
        this.notifyAll();
    }

    public final synchronized void I(boolean var1) {
        M(v());
        l = true;
        this.notifyAll();
        if (var1) {
            while(l) {
                Code((Object)this, (int)0);
            }
        }

    }

    private synchronized void v(int param1) {
        // $FF: Couldn't be decompiled
    }

    public final synchronized void Code(boolean var1) {
        n = var1;
        this.notifyAll();
    }

    public final synchronized void I() {
        while(f) {
            try {
                if (c()) {
                    g = false;
                    throw new RuntimeException();
                }

                g = true;
                this.wait();
            } catch (InterruptedException var1) {
                return;
            }
        }

        g = false;
        f = true;
    }

    public static int J(int var0) {
        if (var0 > 0 && var0 < e.length) {
            int var1 = e[var0];
            if (--f[var0] == 0) {
                e[var0] = 0;
            }

            return var1;
        } else {
            return 0;
        }
    }

    public static int I(int var0) {
        while(var0 != 0) {
            int var1;
            int var10002;
            for(var1 = 1; var1 < e.length; ++var1) {
                if (e[var1] == var0) {
                    var10002 = f[var1]++;
                    return var1;
                }
            }

            for(var1 = 1; var1 < e.length; ++var1) {
                if (e[var1] == 0) {
                    var10002 = f[var1]++;
                    e[var1] = var0;
                    return var1;
                }
            }

            int[] var2 = new int[e.length + 32];
            System.arraycopy(e, 0, var2, 0, e.length);
            e = var2;
            var2 = new int[f.length + 32];
            System.arraycopy(f, 0, var2, 0, f.length);
            f = var2;
        }

        return 0;
    }

    public final synchronized void Z() {
        D = 0;
        E = 0;
        l();
        f = false;
        this.notifyAll();
    }

    public final synchronized void J() {
        if (!f) {
            this.notifyAll();
        }

    }

    private int Z(byte[] var1, int var2) {
        byte[] var10000 = var1;
        byte var10001 = 0;
        int var10002 = var2;

        try {
            return Z((byte[])var10000, var10001, var10002);
        } catch (RuntimeException var3) {
            this.Z();
            throw var3;
        } catch (Error var4) {
            this.Z();
            throw var4;
        }
    }

    public static void J(int var0) {
        aA = var0;
    }

    private int I(long var1) {
        long var10000 = var1;

        try {
            return Code(var10000);
        } catch (RuntimeException var3) {
            this.Z();
            throw var3;
        } catch (Error var4) {
            this.Z();
            throw var4;
        }
    }

    private int C(String var1) {
        String var10000 = var1;

        try {
            return Code(var10000);
        } catch (RuntimeException var2) {
            this.Z();
            throw var2;
        } catch (Error var3) {
            this.Z();
            throw var3;
        }
    }

    private int o() {
        try {
            return n();
        } catch (RuntimeException var2) {
            this.Z();
            throw var2;
        } catch (Error var3) {
            this.Z();
            throw var3;
        }
    }

    private int p() {
        try {
            return m();
        } catch (RuntimeException var2) {
            this.Z();
            throw var2;
        } catch (Error var3) {
            this.Z();
            throw var3;
        }
    }

    private static byte[] I() {
        Code var10000 = J;
        String var10001 = "resource";
        byte var10002 = 1;

        try {
            byte[] var0 = var10000.Code((String)var10001, (int)var10002);
            var10000 = J;
            var10001 = "resource";
            var10002 = 4;

            byte[] var8;
            try {
                var8 = var10000.Code((String)var10001, (int)var10002);
            } catch (IOException var3) {
                return var0;
            }

            byte[] var1 = var8;
            if (var8 != null && var1.length != 0) {
                ByteArrayInputStream var9 = new ByteArrayInputStream(var0);
                ByteArrayInputStream var5 = new ByteArrayInputStream(var1);
                ByteArrayInputStream var7 = var9;
                Code var2;
                (var2 = new Code((byte)0, (short)0)).I((InputStream)var5);
                ByteArrayOutputStream var6 = new ByteArrayOutputStream();
                Code((InputStream)var7, (OutputStream)var6, (Code)var2);
                return var6.toByteArray();
            } else {
                return var0;
            }
        } catch (IOException var4) {
            return I("/v");
        }
    }

    public static void I(C var0) {
        Z.removeElement(var0);
    }

    private static String Z(String var0) {
        return var0.substring(var0.indexOf(45) + 1);
    }

    private static void Code(B var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        if (var3 > 0 && var4 > 0) {
            f.I(var0, var1, var2, var3, var4, var5, var6, var7, var8);
        }
    }

    private boolean h() {
        if (!ai) {
            return false;
        } else {
            long var1 = System.currentTimeMillis();
            return this.Code(var1) && this.Code(var1 - J);
        }
    }

    private static Code B() {
        try {
            return new Code(new e());
        } finally {
            az = false;
            return null;
        }
    }

    private static Hashtable Code() {
        // $FF: Couldn't be decompiled
    }

    private static String b() {
        return J(a());
    }

    private static String d() {
        if (C != null) {
            return C;
        } else {
            return B != null && B.length() >= 2 ? B.substring(0, 2) : "";
        }
    }

    private static String B() {
        String var0;
        return (var0 = J("server-url")) != null && !var0.equals("") ? var0 : "http://mini5resource.opera-mini.net";
    }

    private static String C() {
        int var0;
        if ((var0 = Math.min(v(), b.a())) >= 210 && !W) {
            if (var0 < 300) {
                return "qvga";
            } else if (var0 < 440) {
                return "hvga";
            } else {
                return var0 < 600 ? "vga" : "svga";
            }
        } else {
            return "hqvga";
        }
    }

    public static void Code(InputStream var0, int var1) {
        while(var1 > 0) {
            var1 = (int)((long)var1 - var0.skip((long)var1));
        }

    }

    private static String a() {
        return !O || Math.min(v(), b.a()) >= 210 && !W ? C() + "-" + (O ? "touch" : "keypad") : "qvga-touch";
    }

    private static String B(String var0) {
        return (String)Code().get(var0);
    }

    public static Code Code() {
        if (e != null && e.b) {
            return e;
        } else {
            DataInputStream var0 = new DataInputStream(new ByteArrayInputStream(Code()));

            try {
                (e = new Code((short)0, (byte)0)).Code(var0);
            } catch (IOException var1) {
                return null;
            }

            return e;
        }
    }

    public static Code I() {
        return o;
    }

    public static byte[] Code() {
        if (B != null) {
            return B;
        } else {
            e = null;
            return B = I();
        }
    }

    private void v() {
        this.Code = new Vector();
        Code[] var1 = this.i.Code();
        int var2 = 0;

        while(var2 < var1.length) {
            if (var1[var2] == null) {
                ++var2;
            } else {
                Code((Vector)this.Code, (Object)(new Object[]{var1[var2].c, new Integer(7), var1[var2].d, null}));
                ++var2;
            }
        }

    }

    private static void q() {
        int var0 = 0;
        if (b != null) {
            var0 = b[0];
        } else if (a != null) {
            var0 = a[0] - 3;
        }

        ByteArrayOutputStream var1 = new ByteArrayOutputStream((var0 + 3) * 5 + 1);
        DataOutputStream var2;
        DataOutputStream var10000 = var2 = new DataOutputStream(var1);
        int var10001 = var0 + 3;

        try {
            var10000.writeByte(var10001);
            if (b != null) {
                var2.write(b, 1, b.length - 1);
            }

            var2.writeByte(3);
            var2.writeInt(n);
            var2.writeByte(4);
            var2.writeInt(bM);
            var2.writeByte(17);
            var2.writeInt(bw);
        } catch (IOException var3) {
        }

        a = var1.toByteArray();
    }

    private static byte[] I(String param0) {
        // $FF: Couldn't be decompiled
    }

    private static int I(byte[] var0) {
        return var0.length - 5 - J(var0, var0.length - 5);
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

    private static int Code(B var0) {
        if (var0 != null) {
            if (var0.Code == 0) {
                var0.Code = Code(42, 1, (Object)var0);
            }

            return var0.Code;
        } else {
            return Code(42, 1, (Object)null);
        }
    }

    private Code(byte[] var1, int var2, int var3) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        super();
        this.k = new Code((short)0, false);
        this.Code = new byte[64];
        this.h = new byte[64];
        this.f = new byte[32];
        if (var3 > 64) {
            this.k.a(var1, var2, var3);
            var2 = 0;
            var3 = 64;
            var1 = new byte[64];
            this.k.I(var1);
            this.k.K();
        }

        System.arraycopy(var1, var2, this.Code, 0, var3);
        System.arraycopy(var1, var2, this.h, 0, var3);

        for(int var4 = 0; var4 < 64; ++var4) {
            byte[] var10000 = this.h;
            var10000[var4] = (byte)(var10000[var4] ^ 54);
            var10000 = this.Code;
            var10000[var4] = (byte)(var10000[var4] ^ 92);
        }

        this.k.a(this.h, 0, 64);
    }

    private void C(byte[] var1, int var2, int var3) {
        this.k.I(this.f);
        this.k.a(this.Code, 0, 64);
        this.k.a(this.f, 0, 32);
        this.k.I(this.f);
        System.arraycopy(this.f, 0, var1, var2, var3);
        this.k.a(this.h, 0, 64);
    }

    private synchronized void r() {
        e = null;
    }

    private Code(char var1, byte var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        super();
    }

    private void B(byte[] var1, int var2, int var3) {
        this.k.a(var1, var2, var3);
    }

    private static int Code(Code var0, int var1) {
        int var2;
        if (var0.w() && (var2 = var0.R()) <= var1) {
            return var2;
        } else {
            var0.d(false);
            if ((var2 = var0.R()) <= var1) {
                return var2;
            } else {
                var0.d(true);
                return var0.R();
            }
        }
    }

    private int r() {
        return this.b <= 0 ? 0 : this.C.S(this.b);
    }

    private int r(int var1) {
        return this.q(var1) - this.p(var1);
    }

    private void p() {
        if (!t) {
            int var1 = I.size();
            int var2;
            int var4;
            int var8;
            if (d != null) {
                var2 = bz << 10;
                Code var3;
                if ((var4 = (var3 = d.C).U(var2)) > var2) {
                    var4 = Code(var3, var2);
                }

                var8 = Math.max(var4, 0);
                var2 -= var8;
                if (var1 > 1) {
                    var2 /= var1 - 1;
                }
            } else {
                var2 = bz << 10;
                if (var1 > 0) {
                    var2 /= var1;
                }
            }

            var2 = Math.max(1, var2);
            var8 = 0;

            for(var4 = 0; var4 < var1; ++var4) {
                Code var5;
                if ((var5 = (Code)I.elementAt(var4)) != d) {
                    var5 = var5.C;
                    int var6 = Math.max(1, var2 + var8);
                    int var7;
                    if ((var7 = var5.U(var6)) > var6) {
                        var7 = Code(var5, var6);
                    }

                    if (var7 > var2) {
                        var8 -= var7 - var2;
                    } else {
                        var8 += var2 - var7;
                    }
                }
            }

            if (var8 < 0) {
                t = true;
                this.J(true);
                t = false;
            }

        }
    }

    private boolean d() {
        return this.b != null;
    }

    private boolean e() {
        return this.c != null;
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

    private Code(char[] var1, int var2, int var3, int var4, String var5, J var6) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        super();
        this.Code = -1;
        this.Code = new Vector();
        this.Code = var1;
        this.I = var6;

        int var8;
        for(var8 = 0; var8 < this.Code.length; ++var8) {
            byte var7;
            if ((var7 = Code(this.Code[var8])) == 1) {
                this.Code = 0;
            } else if ((var7 & 6) > 0) {
                if (this.Code < 0) {
                    this.Code = 1;
                }

                this.Code = this.Code(this.Code);
                break;
            }
        }

        if (this.Code < 0) {
            this.Code = 0;
            this.Code = null;
        }

        if (var2 == 0) {
            var2 = 2147483647;
        }

        if ((var4 & 1) == 0) {
            var8 = 0;
            var3 = this.Code.length;
            if ((var4 & 6) != 0) {
                var4 = (var4 & 4 | -(var4 & 4)) >>> 31;
                var2 = Code(this.Code, (boolean)var4, var2, var6.I(var5), var6);
                if (var4 != 0) {
                    var3 = var2;
                } else {
                    var8 = var2;
                }
            }

            if (var8 > 0) {
                this.y(0);
            }

            this.Code((char[])this.Code, 0, var8, var3, 0);
            if (var3 < this.Code.length) {
                this.y(0);
            }

        } else {
            var8 = (var4 & 4 | -(var4 & 4)) >>> 31;
            Code(this.Code, var2, var8 != 0 ? var3 / var6.b() : 0, var8 != 0 ? var6.I(var5) : 0, var6, this);
        }
    }

    private static int Code(char[] var0, int var1) {
        int var2;
        int var3;
        if ((var1 & 8) != 0) {
            for(var2 = 0; var2 < var0.length; ++var2) {
                if ((var3 = "()<>[]{}«»‘’“”‹›".indexOf(var0[var2])) >= 0) {
                    var0[var2] = "()<>[]{}«»‘’“”‹›".charAt((var3 & 1) == 0 ? var3 + 1 : var3 - 1);
                }
            }
        }

        if ((var1 & 4) != 0) {
            var3 = (var2 = var0.length) / 2;

            for(int var4 = 0; var4 < var3; ++var4) {
                char var5 = var0[var4];
                var0[var4] = var0[var2 - var4 - 1];
                var0[var2 - var4 - 1] = var5;
            }
        }

        var2 = var0.length;
        if ((var1 & 2) != 0) {
            var1 = 0;
            var2 = 0;

            while(var2 < var0.length) {
                if (Code(var0[var1])) {
                    System.arraycopy(var0, var1 + 1, var0, var1, var0.length - (var1 + 1));
                    ++var2;
                } else {
                    ++var1;
                    ++var2;
                }
            }

            var2 = var1;
        }

        return var2;
    }

    private static String c() {
        if (B == null) {
            B = B("locale");
        }

        return B;
    }

    private void z(int var1) {
        if (var1 != this.a) {
            this.I = new B[this.Code.length];
        }

        this.a = var1;
    }

    private boolean f() {
        int var1;
        return (var1 = this.r()) == 97 || var1 == 120 || var1 == 112 || var1 == 83 || var1 == 85;
    }

    private static boolean C(String param0) {
        // $FF: Couldn't be decompiled
    }

    private static boolean B(String var0) {
        String var1 = var0;
        boolean var2 = false;
        boolean var3 = false;
        if ((var0 = var0) != null && var0.startsWith("http://") && var0.indexOf("&url=rtsp://") >= 0) {
            var0 = var0.substring(var0.indexOf("rtsp://"));
        }

        String var10000 = var0;

        boolean var7;
        label35: {
            try {
                var7 = C(var10000);
            } catch (ConnectionNotFoundException var5) {
                int var6;
                if ((var6 = var1.indexOf("&url=rtsp://")) >= 0) {
                    var0 = var1.substring(0, var6);
                    var3 = true;
                    break label35;
                }

                throw new IOException();
            }

            var2 = var7;
        }

        if (var3) {
            var10000 = var0;

            try {
                var7 = C(var10000);
            } catch (ConnectionNotFoundException var4) {
                throw new IOException();
            }

            var2 = var7;
        }

        return var2;
    }

    private static void K(int var0) {
        synchronized(I){}

        a var10000;
        for(; Z != null; Z = var10000) {
            var10000 = Z;
            int var10001 = var0;
            boolean var3 = false;

            try {
                var3 = true;
                var10000.I(var10001);
                var10000 = Z.Code();
                var3 = false;
            } finally {
                if (var3) {
                    ;
                }
            }
        }

    }

    private static void Code(int[] var0, int var1, int var2, int var3, int[] var4, int var5, int var6, int var7, int var8, int var9) {
        if (var8 != 0) {
            for(int var10 = 0; var10 < var9; ++var10) {
                int[] var10000 = var0;
                int var10001 = var1 + (var2 + var10) * var3;
                int[] var10002 = var4;
                int var10003 = var5 + (var6 + var10) * var7;
                int var10004 = var8;

                try {
                    System.arraycopy(var10000, var10001, var10002, var10003, var10004);
                } catch (ArrayIndexOutOfBoundsException var11) {
                    return;
                }
            }

        }
    }

    private String e() {
        return (String)this.I[42];
    }

    private static String c(String var0) {
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

    private static String C(String var0) {
        char[] var2 = new char[var0.length()];

        for(int var1 = 0; var1 < var2.length; ++var1) {
            var2[var1] = '*';
        }

        return new String(var2);
    }

    private Code(char var1, char var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        super();
    }

    private void Code(boolean var1, int var2) {
        if (this.Z(var2)) {
            if (var1) {
                this.run();
                return;
            }

            Code((Runnable)this);
        }

    }

    private char[][] Code(String var1) {
        char[][] var2;
        switch(var1.charAt(0)) {
            case '\u0000':
            default:
                var2 = new char[1][1];
                break;
            case '\u0001':
                var2 = this.Code("\u0000\f\u00020+0\u00171./:_-~%$?=&!+#*@,;\\'()1\u00042abc2\u00043def3\u00044ghi4\u00045jkl5\u00046mno6\u00057pqrs7\u00048tuv8\u00059wxyz9\u0000*\u0003# *#");
                break;
            case '\u0002':
                (var2 = new char[1][1])[0][0] = 1;
                break;
            case '\u0003':
                (var2 = new char[25][])[0] = new char[1];
                var2[0][0] = 1;
                String var3 = "QWERTYUIOPASDFGHJKZXCVBN";
                var3 = var3 + var3.toLowerCase();

                for(int var4 = 1; var4 <= 24; ++var4) {
                    var2[var4] = new char[3];
                    var2[var4][0] = var2[var4][1] = var3.charAt(2 * (var4 - 1));
                    var2[var4][2] = var3.charAt(2 * (var4 - 1) + 1);
                }
        }

        char var8;
        char[][] var9 = new char[(var8 = var1.charAt(1)) + var2.length][];

        int var5;
        for(var5 = 0; var5 < var2.length; ++var5) {
            var9[var5] = var2[var5];
        }

        var5 = 2;

        for(int var6 = 0; var6 < var8; ++var6) {
            int var7 = var1.charAt(var5++) + 1;
            var9[var2.length + var6] = new char[var7];
            var1.getChars(var5, var5 + var7, var9[var2.length + var6], 0);
            var5 += var7;
        }

        return var9;
    }

    private boolean J(String var1) {
        if (this.c != null && var1 != null) {
            return this.c.equals(a(var1));
        } else {
            return this.c == null && var1 == null;
        }
    }

    public static boolean Code() {
        return (Code[0][0] & 2) == 0;
    }

    private void K() {
        this.C = 0;
        this.b = 0;

        int var1;
        for(var1 = 0; var1 < this.h.length; ++var1) {
            this.h[var1] = 0;
        }

        this.bq = 0;

        for(var1 = 0; var1 < this.h.length; ++var1) {
            this.h[var1] = 0;
        }

        this.bp = 1779033703;
        this.bm = -1150833019;
        this.bh = 1013904242;
        this.bn = -1521486534;
        this.bl = 1359893119;
        this.bo = -1694144372;
        this.a = 528734635;
        this.br = 1541459225;
    }

    private void E() {
        Enumeration var1 = this.Code.elements();

        while(var1.hasMoreElements()) {
            this.J.remove(var1.nextElement());
        }

        this.Code.removeAllElements();
    }

    private B Code(int var1, int var2, int var3) {
        if (var1 != 256) {
            var2 = this.P(var2);
            var3 = this.P(var3);
        }

        Integer var4 = new Integer(var2 << 16 | var3);
        B var5;
        if ((var5 = (B)c.get(var4)) == null) {
            boolean var10001;
            if (var1 == 256 && var2 == -1 && var3 == -1) {
                byte var10000 = 9;
                var10001 = false;

                try {
                    var5 = Code(var10000, var10001);
                } catch (Throwable var17) {
                    var10001 = false;
                    return var5;
                }
            } else {
                try {
                    var5 = (var5 = this.Code(256, (int)-1, -1)).Code(0, 0, var5.Code.getWidth(), var5.Code.getHeight(), var2, var3, 0, 0, 0, 0, 1, true);
                } catch (Throwable var16) {
                    var10001 = false;
                    return var5;
                }
            }

            try {
                c.put(var4, var5);
            } catch (Throwable var15) {
                var10001 = false;
                return var5;
            }
        }

        return var5;
    }

    public final String Code() {
        if (!this.Z()) {
            return null;
        } else {
            int var1;
            if ((var1 = this.c.indexOf(59)) < 0) {
                var1 = this.c.indexOf(10);
            }

            if (var1 >= 0) {
                String var2 = this.c.substring(0, var1);
                this.c = this.c.substring(var1 + 1);
                return var2;
            } else {
                String var3 = this.c;
                this.c = null;
                return var3;
            }
        }
    }

    private static boolean Code(int var0, String var1) {
        if ("cookies".equals(var1)) {
            if (var0 == 0) {
                aj = true;
                return true;
            } else {
                aj = false;
                return true;
            }
        } else if ("protocol".equals(var1)) {
            var0 = (var0 | -var0) >>> 31 ^ 1;
            Object var4;
            synchronized(var4 = I){}
            if (G != var0) {
                G = (boolean)var0;

                try {
                    R();
                    I("md");
                } finally {
                    ;
                }
            }

            return true;
        } else if ("landscape".equals(var1)) {
            if (var0 != aI) {
                aI = var0;
                var0 = (var0 - 1 | -(var0 - 1)) >>> 31 ^ 1;
                Code.Code((boolean)var0);
                l = true;
            }

            return true;
        } else if ("imagequality".equals(var1)) {
            bG = var0;
            return true;
        } else if ("fullscreen".equals(var1)) {
            return true;
        } else if ("eula_agreed".equals(var1)) {
            if ((ai = (boolean)((var0 | -var0) >>> 31)) && ah) {
                I("mc");
            }

            return true;
        } else {
            return false;
        }
    }

    public static char[] Code(int var0) {
        if (Code != null) {
            for(int var1 = Code.length - 1; var1 > 0; --var1) {
                if (Code[var1][0] == (char)var0) {
                    return Code[var1];
                }
            }

            if (var0 >= 32 || var0 == 10) {
                char[] var4;
                if ((Code[0][0] & 1) == 0 || var0 > 255 && var0 != 10) {
                    if (!Code()) {
                        return null;
                    }

                    f var10000 = Code;
                    int var10001 = var0;

                    try {
                        String var5;
                        if (((var5 = var10000.getKeyName(var10001)).length() != 1 || Character.toLowerCase(var5.charAt(0)) != Character.toLowerCase((char)var0)) && (var0 != 32 || !var5.toLowerCase().equals("space"))) {
                            return null;
                        }

                        (var4 = new char[2])[0] = var4[1] = (char)var0;
                        return var4;
                    } finally {
                        ;
                    }
                }

                (var4 = new char[2])[0] = var4[1] = (char)var0;
                return var4;
            }
        }

        return null;
    }

    private static int w(int param0) {
        // $FF: Couldn't be decompiled
    }

    private static void I(String var0) {
        boolean var8 = false;

        try {
            var8 = true;
            Z var1 = new Z();
            DataOutputStream var2 = new DataOutputStream(var1);
            if ("mc".equals(var0)) {
                var2.write(1);
                var2.writeUTF(ai ? J((int)1) : "");
                var2.writeBoolean(false);
            } else if ("md".equals(var0)) {
                var2.write(8);
                byte[] var3 = new byte[32];
                Code var4;
                synchronized(var4 = A){}
                Code var10000 = A;
                byte[] var10001 = var3;

                try {
                    var10000.I(var10001);
                    A.a(var3, 0, 32);
                } finally {
                    ;
                }

                var2.write(var3);
                var2.writeBoolean(false);
                Code(var2);
                var2.writeBoolean(ak);
                var2.writeInt(0);
                var2.writeInt(bG);
                var2.writeShort(bI);
                var2.writeShort(bJ);
                var2.writeInt(bM);
                var2.writeUTF(j != null ? j : "");
                var2.writeByte(C);
                var2.writeUTF("");
                var2.write(n, 0, 32);
                var2.write(o, 0, 32);
            }

            byte[] var18 = var1.toByteArray();
            String var19 = var0;

            try {
                RecordStore.deleteRecordStore(var19);
            } finally {
                ;
            }

            J.Code(var0, var18);
            var8 = false;
        } finally {
            if (var8) {
                return;
            }
        }

    }

    private static synchronized boolean r() {
        String var10000 = "trafficrouting";

        try {
            RecordStore.deleteRecordStore(var10000);
        } finally {
            ;
        }

        if (bw != 0) {
            U();
            return true;
        } else {
            return false;
        }
    }

    private void J(Code var1) {
        synchronized(var1){}
        boolean var4 = false;

        char[][] var10000;
        label66: {
            try {
                var4 = true;
                if (s() < 0) {
                    Code = this.Code("\u0000\u0000");
                    var4 = false;
                    return;
                }

                switch(s()) {
                    case 2:
                        Code = this.Code("\u0002\u0000");
                        var4 = false;
                        return;
                    case 5:
                        var10000 = this.Code(e);
                        var4 = false;
                        break label66;
                    default:
                        var4 = false;
                }
            } finally {
                if (var4) {
                    ;
                }
            }

            Code = null;
            return;
        }

        Code = var10000;
    }

    private static boolean Code(byte[] var0, int var1, int var2) {
        if (var2 <= 8) {
            return false;
        } else {
            return var0[var1++] == -119 && var0[var1++] == 80 && var0[var1++] == 78 && var0[var1++] == 71 && var0[var1++] == 13 && var0[var1++] == 10 && var0[var1++] == 26 && var0[var1] == 10;
        }
    }

    private static void Z(String param0) {
        // $FF: Couldn't be decompiled
    }

    private static boolean a(String var0) {
        String[] var1;
        if ((var1 = RecordStore.listRecordStores()) != null) {
            for(int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].equals(var0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static void c(int var0, int var1, int var2) {
        J var3 = Code(var0, var1, var2);
        String[] var4 = new String[]{"נסע", "بتث", "ﺑﻴﻦ"};

        for(var2 = 0; var2 < var4.length; ++var2) {
            if (Code(var4[var2], var4[var2].charAt(0), var3)) {
                bF |= 1 << var2 + 1;
                if (!ad) {
                    if (!Code(var4[var2].charAt(0) + "(", ')', var3)) {
                        ad = true;
                    } else {
                        ad = false;
                    }
                }
            }
        }

    }

    private synchronized void P() {
        this.Q();
        this.bm = 0;
    }

    public final void Z(boolean var1) {
        label78:
        while(true) {
            this.i(0, 6);
            this.v.d(this.g, 0, 6);
            int var2;
            if ((var2 = B(this.g, 4)) > 1014) {
                throw new IOException();
            }

            this.i(6, var2);
            this.Z = System.currentTimeMillis();
            this.v.d(this.g, 6, var2);
            this.t.A(this.bn++);
            this.t.B(this.g, 4, var2 + 2);
            this.t.C(this.g, 1020, 4);
            if (this.g[1020] != this.g[0] || this.g[1021] != this.g[1] || this.g[1022] != this.g[2] || this.g[1023] != this.g[3]) {
                throw new IOException();
            }

            byte var3 = this.g[6];
            byte var4 = this.g[7];
            var2 -= 2;
            switch(var3) {
                case 4:
                    this.C(true);
                case 5:
                case 8:
                case 12:
                case 13:
                case 14:
                case 16:
                case 18:
                case 19:
                default:
                    break;
                case 7:
                    this.H(var4);
                    break;
                case 9:
                    this.bh = Math.max(this.bh - 1, 0);
                    this.Code((int)var4).I();
                    a(false);
                    break;
                case 11:
                    this.Z.I(this);
                    this.Z.I(this.g, 8, var2);
                    if (var1) {
                        return;
                    }
                case 6:
                case 10:
                    a var9 = this.Code((int)var4);
                    int var5 = 8;
                    int var6 = 0;

                    while(var9 != null) {
                        while(true) {
                            if (var9.Code() != null) {
                                int var7 = Math.min(var9.B(), var2);
                                switch(var3) {
                                    case 6:
                                        var9.J();
                                        Code(var9, true);
                                        if (!this.I()) {
                                            this.J = this.Z;
                                        }

                                        if (this.h[50] == 1) {
                                            ak = false;
                                            I("md");
                                        }
                                        continue label78;
                                    case 10:
                                        System.arraycopy(this.g, var5, var9.Code(), var9.J(), var7);
                                        var6 = (var7 - var2 | -(var7 - var2)) >>> 31 ^ 1;
                                        var9.J(var7);
                                        break;
                                    case 11:
                                        int var10000 = var7 = this.Z.read(var9.Code(), var9.J(), var9.B());
                                        var6 = (var10000 | -var10000) >>> 31 ^ 1;
                                        var9.J(this.Z.e());
                                }

                                var9.Code(var7);
                                var5 += var7;
                                var2 -= var7;
                                break;
                            }

                            if (var9.Z()) {
                                var9 = null;
                                break;
                            }

                            Code((Object)var9, (int)1000);
                        }

                        if (var6 != 0) {
                            continue label78;
                        }
                    }

                    if (var3 != 11) {
                        break;
                    }

                    while(true) {
                        if (this.Z.read((byte[])null, 0, 1024) <= 0) {
                            continue label78;
                        }
                    }
                case 15:
                    if (this.h != null) {
                        System.arraycopy(this.g, 8, this.h, 0, 8);
                        this.a = true;
                        this.C(true);
                        return;
                    }

                    this.h = new byte[8];
                    System.arraycopy(this.g, 8, this.h, 0, 8);
                    break;
                case 17:
                    this.Z = new a();
                    this.Z.c();
                    break;
                case 20:
                    String var8 = Code((byte[])this.g, 8, var2 + 8);
                    Code((Runnable)(new Code(var8)));
            }
        }
    }

    private void b(byte[] var1, int var2, int var3) {
        int var5;
        for(int var4 = var2; var4 < var3; var4 += var5 + 6) {
            var5 = B(var1, var4 + 4);
            this.s.A(this.bl++);
            this.s.B(var1, var4 + 4, var5 + 2);
            this.s.C(var1, var4, 4);
        }

        this.u.d(var1, var2, var3 - var2);
    }

    private static void Code(byte[] var0, int var1, int var2, int var3, int var4) {
        var0[var1 + 4] = (byte)(var4 + 2 >> 8);
        var0[var1 + 4 + 1] = (byte)(var4 + 2);
        var0[var1 + 4 + 2] = (byte)var2;
        var0[var1 + 4 + 3] = (byte)var3;
    }

    private synchronized void L(int var1) {
        this.C = System.currentTimeMillis();
        this.bm = var1;
    }

    public final int a() {
        if (this.aZ) {
            return this.Code.getHeight();
        } else if (this.aL) {
            return a;
        } else {
            return Code.B() ? Code.getWidth() : Code.getHeight();
        }
    }

    private Code(int[] var1) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        super();
        this.g = new Code();
        this.f = new byte[0];
        this.g = new byte[8];
        this.h = new byte[32];
        this.I = var1;
    }

    private synchronized void I(int var1, boolean var2) {
        B var3;
        if (!(var3 = this.m.B).Code()) {
            Code var4;
            String var5;
            int var6;
            B var8;
            int var9;
            boolean var10;
            int var12;
            Code var13;
            int var14;
            Code var15;
            Code var10000;
            label239:
            switch(var1) {
                case 1:
                    var3.I = -2147483648;
                    var8 = var3;
                    var10 = true;
                    var14 = var3.Z();

                    while(true) {
                        if (var8.Code.J()) {
                            if (var8.Code > 0) {
                                --var8.Code;
                            } else if ((var13 = var8.Code.t() ? var8.Code.c() : var8.Code.b()) != null) {
                                var8.Code = var13.Code(var13.Code(var8.Code) ^ true);
                                var8.Code = var13;
                            } else {
                                var10 = false;
                            }
                        } else {
                            var12 = var8.Code.I().length();
                            if (var8.Code < var12 - 1) {
                                ++var8.Code;
                            } else {
                                var15 = var8.Code.t() ? var8.Code.c() : var8.Code.b();
                                if (var8.Code != var12 - 1 || var15 != null && !var8.Code.Code(var15)) {
                                    if (var15 == null) {
                                        var10 = false;
                                    } else {
                                        var8.Code = var15.Code(var8.Code == var12 && !var8.Code.Code(var15));
                                        var8.Code = var15;
                                    }
                                } else {
                                    var8.Code = var12;
                                }
                            }
                        }

                        if (!var10 || var8.Z() != var14) {
                            break label239;
                        }
                    }
                case 2:
                    var3.I = -2147483648;
                    var8 = var3;
                    var10 = true;
                    var14 = var3.Z();

                    while(true) {
                        if (!var8.Code.J()) {
                            if (var8.Code > 0) {
                                --var8.Code;
                            } else if ((var13 = var8.Code.t() ? var8.Code.a() : var8.Code.d()) != null) {
                                var8.Code = var13.I(var8.Code.Code(var8.Code) ^ true);
                                var8.Code = var13;
                            } else {
                                var10 = false;
                            }
                        } else {
                            var12 = var8.Code.I().length();
                            if (var8.Code < var12 - 1) {
                                ++var8.Code;
                            } else {
                                var15 = var8.Code.t() ? var8.Code.a() : var8.Code.d();
                                if (var8.Code == var12 - 1 && (var15 == null || var8.Code.Code(var15))) {
                                    var8.Code = var12;
                                } else if (var15 == null) {
                                    var10 = false;
                                } else {
                                    var8.Code = var15.I(var8.Code == var12 && !var15.Code(var8.Code));
                                    var8.Code = var15;
                                }
                            }
                        }

                        if (!var10 || var8.Z() != var14) {
                            break label239;
                        }
                    }
                case 3:
                    var9 = var3.I();
                    B var11 = var3;
                    var5 = var3.Code.I();
                    var6 = -1;

                    for(int var7 = var3.Code - 1; var7 >= 0; --var7) {
                        if (var5.charAt(var7) == '\n') {
                            var6 = var7;
                            break;
                        }
                    }

                    if (var6 != -1) {
                        for(var3.Code = var6; var11.Code > 0 && var5.charAt(var11.Code - 1) != '\n'; --var11.Code) {
                        }
                    } else {
                        var4 = null;
                        var6 = (var13 = var3.Code).cn;

                        while(true) {
                            if ((var13 = var13.C()) == null) {
                                var10000 = null;
                                break;
                            }

                            if (var13.cn + var13.G() - 1 < var6) {
                                var10000 = var13;
                                break;
                            }
                        }

                        while(true) {
                            var13 = var10000;
                            if (var10000 == null) {
                                if (var4 == null) {
                                    break label239;
                                }

                                var3.Code = var4;
                                var3.Code = 0;
                                var11 = var3;
                                var5 = var3.Code.I();

                                for(var6 = 0; var6 < var5.length(); ++var6) {
                                    if (var5.charAt(var6) == '\n') {
                                        var11.Code = var6 + 1;
                                    }
                                }
                                break;
                            }

                            if ((var15 = (var4 = var13).C()) != null && !var13.Z(var15)) {
                                var15 = null;
                            }

                            var10000 = var15;
                        }
                    }

                    var3.Code(var9);
                    break;
                case 4:
                    label257: {
                        var9 = var3.I();
                        var5 = var3.Code.I();
                        var6 = var3.Code;

                        while(true) {
                            if (var6 >= var5.length()) {
                                var12 = (var4 = var3.Code).cn + var4.G();

                                while(true) {
                                    if ((var4 = var4.J()) == null) {
                                        var10000 = null;
                                        break;
                                    }

                                    if (var4.cn >= var12) {
                                        var10000 = var4;
                                        break;
                                    }
                                }

                                var4 = var10000;
                                if (var10000 == null) {
                                    break label257;
                                }

                                var3.Code = var4;
                                var3.Code = 0;
                                break;
                            }

                            if (var5.charAt(var6) == '\n') {
                                var3.Code = var6 + 1;
                                break;
                            }

                            ++var6;
                        }

                        var3.Code(var9);
                    }
            }
        }

        if (this.n.B) {
            if (!var2) {
                this.n.I(this.m.B);
            }

            this.n.Z(this.m.B);
        }

    }

    private void A() {
        Code var1 = this.C;
        int var2 = 1;

        while(true) {
            DataInputStream var3 = new DataInputStream(this.Code);
            int var4 = this.Code.g();

            int var5;
            int var6;
            for(var5 = 0; (var6 = var3.readUnsignedByte()) == 255; this.bm = var5) {
                var5 = var3.readUnsignedByte();
                if (var2 == 1) {
                    this.D(2);
                }
            }

            if (var2 > 1) {
                var1 = new Code(this, this.C, false, this.b);
            }

            var1.Code(this.Code, var3, var4, var6);
            if (var2 > 1) {
                Code.I();
                this.C.L = null;
                Code var11 = var1;
                Code var12 = this;
                int var10000 = this.bk + 2;
                boolean var9 = false;

                Code var7;
                label128: {
                    boolean var13;
                    try {
                        var9 = true;
                        var6 = l(var10000);
                        if (var12.d != null && var6 != 0) {
                            var11.Code((String)var12.d, (int[])null, var6);
                        }

                        var7 = new Code(var11, (byte)0);
                        if (var12.m.c && var11.Code(var7, var6, var12.m)) {
                            var7.c = true;
                        }

                        var12.m = var7;
                        var7 = new Code(var11);
                        if (!var12.n.B) {
                            var9 = false;
                            break label128;
                        }

                        var13 = var11.I(var7, var6, var12.n);
                        var9 = false;
                    } finally {
                        if (var9) {
                            Code.Z();
                        }
                    }

                    if (var13) {
                        var7.B = true;
                    }
                }

                this.n = var7;
                this.C = var1;
                this.C.c(false);
            } else {
                Thread.currentThread().setPriority(1);
            }

            if (var5 == 100) {
                this.D(4);
            }

            ++var2;
        }
    }

    private Code(int var1) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aM = true;
        this.aH = true;
        this(0, 0, 0, var1, 1, 0);
    }

    private Code(int var1, int var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        this('\u0000', '\u0000');
        this.bh = var1;
    }

    private Code(char var1, boolean var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        this((char)'\u0000', (int)0);
    }

    private synchronized int I(Code var1) {
        if (this.Code == null) {
            return -1;
        } else {
            byte[] var2;
            (var2 = var1.g)[0] = (byte)(this.a >> 16);
            var2[1] = (byte)this.a;
            this.g.B(var2, 2);
            this.g.C(var2, 0);
            var1.s = new Code(var2, 0, 32);
            var1.s.B(this.g, 0, 8);
            this.g.C(var2, 0);
            var1.t = new Code(var2, 0, 32);
            var1.t.B(this.g, 0, 8);
            this.g.C(var2, 0);
            var1.u = new Code(var2);
            var1.u.d(var2, 0, 1024);
            this.g.C(var2, 0);
            var1.v = new Code(var2);
            var1.v.d(var2, 0, 1024);
            return this.a++;
        }
    }

    private static void Code(int var0, String var1, boolean var2) {
        if (I[var0] == null || !I[var0].equals(var1)) {
            I[var0] = var1;
            if (var0 == 1) {
                if (var2) {
                    ah = true;
                    I("mc");
                }

                N();
            }
        }

    }

    private void B(Code var1) {
        this.C = new Code(this, var1, true, this.b);
        this.m = new Code(this.C, (byte)0);
        this.n = new Code(this.C);
    }

    private static void Code(int var0, byte[] var1, int var2) {
        var1[var2] = (byte)(var0 >> 24);
        var1[var2 + 1] = (byte)(var0 >>> 16);
        var1[var2 + 2] = (byte)(var0 >>> 8);
        var1[var2 + 3] = (byte)var0;
    }

    private synchronized void Code(int[] var1, int var2) {
        B var3 = this.m.B;
        var1[var2++] = var3.Z();
        var1[var2++] = var3.J();
        var1[var2++] = var3.Code() ^ 1;
        var1[var2] = var3.B();
    }

    private static void Code(byte[] var0, int var1, int var2, int var3) {
        var0[0] = 1;
        var0[1] = 16;
        var0[2] = (byte)var1;
        var0[3] = (byte)(var2 >> 8);
        var0[4] = (byte)var2;
        var0[5] = (byte)var3;
    }

    private synchronized void s() {
        this.h = null;
        this.g = null;
        this.Code = null;
        System.arraycopy(this.h, 0, this.g, 0, 8);
    }

    private Code(byte var1, boolean var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        super();
        this.h = new int[1536];
        this.Code = new B[256];
        this.I = new B[256];
    }

    private synchronized void t() {
        if (!this.h() && this.h != null) {
            Code var1;
            byte[] var2;
            int var3;
            if (this.g != null) {
                var1 = new Code((short)0, false);
                if ((var2 = Code(Code(this.g, this.I)))[0] != 0 || var2[1] != 1 || var2[var2.length - 32 - 1] != 0) {
                    this.s();
                    return;
                }

                for(var3 = 2; var3 < var2.length - 32 - 2; ++var3) {
                    if (var2[var3] != -1) {
                        this.s();
                        return;
                    }
                }

                var1.F((int)(this.Z >> 32));
                var1.F((int)this.Z);
                var1.a(Code(this.h), 0, this.h.length << 2);
                var1.I(var2);

                for(int var4 = 0; var4 < 32; ++var4) {
                    if (var2[var4] != var2[var4 + var2.length - 32]) {
                        this.s();
                        return;
                    }
                }

                this.g = null;
                if (I[1] != null) {
                    I("md");
                }
            }

            if (this.Code == null) {
                var1 = Code(this.h);
                var2 = new byte[this.h.length << 2];

                for(var3 = 2; var3 < var2.length - 32; ++var3) {
                    while(var2[var3] == 0) {
                        var1.C(var2, var3);
                    }
                }

                var2[0] = 0;
                var2[1] = 2;
                var2[var2.length - 32 - 1] = 0;
                var1.C(var2, var2.length - 32);
                this.g.J(var2, var2.length - 32);
                var1.J(var2, var2.length - 32);
                this.Code = Code(Code(Code((byte[])var2, 0, var2.length), this.h));
                this.a = 0;
            }

        } else {
            this.s();
        }
    }

    private static void I(int var0, byte[] var1, int var2) {
        var1[var2] = (byte)(var0 >> 8);
        var1[var2 + 1] = (byte)var0;
    }

    private boolean s() {
        return this.Code.canWrite();
    }

    private boolean J(int var1, int var2) {
        return var1 < this.az && this.h[var1 * 6] == var2;
    }

    private static void Z(int[] var0, int var1, int var2) {
        while(var2-- > 0) {
            var0[var1 + var2] = 0;
        }

    }

    private void Code(Code var1, char[] var2, int var3, int var4, int var5, int var6, int var7) {
        var4 += var3;
        this.P(var7);

        while(var3 < var4) {
            var5 += this.Code(var1, var2[var3], var5, var6);
            ++var3;
        }

    }

    private boolean I(int var1) {
        if (this.C == 0) {
            return true;
        } else {
            return this.bh + var1 < this.C;
        }
    }

    private void Code(int var1, boolean var2, boolean var3) {
        B var4;
        if (var2 && (var4 = this.I[var1]) != null) {
            this.bh -= var4.Code();
            this.I[var1] = null;
        }

        if (var3 && (var4 = this.Code[var1]) != null) {
            this.bh -= var4.Code();
            this.Code[var1] = null;
        }

    }

    private boolean Code(int var1, boolean var2, B var3, B var4) {
        B[] var5;
        B[] var6;
        if (var2) {
            var6 = this.Code;
            var5 = this.I;
        } else {
            var6 = this.I;
            var5 = this.Code;
        }

        if (!this.Code(var6, var1, var3)) {
            return false;
        } else {
            if (var4 != null) {
                this.Code(var5, var1, var4);
            }

            return true;
        }
    }

    private static B[] Code(B[] var0, int var1) {
        B[] var2 = new B[var1];
        System.arraycopy(var0, 0, var2, 0, var0.length);
        return var2;
    }

    private InputStream Code() {
        return this.Code.openInputStream();
    }

    private boolean Code(B[] var1, int var2, B var3) {
        B var4;
        if ((var4 = var1[var2]) != null) {
            this.bh -= var4.Code();
            var1[var2] = null;
        }

        int var5 = var3.Code();
        if (!this.I(var5)) {
            return false;
        } else {
            var1[var2] = var3;
            this.bh += var5;
            return true;
        }
    }

    private static B I(int var0, boolean var1) {
        var0 |= 32768;
        byte var2 = 0;
        int var10000 = var0;
        boolean var10001 = var1;

        try {
            return Code(var10000, var10001);
        } finally {
            if (var2 == aH) {
                af = 22;
                throw Code;
            } else {
                Code.J(var2 > 0);
                int var5 = var2 + 1;
            }
        }
    }

    private static Vector Code(String param0) {
        // $FF: Couldn't be decompiled
    }

    private static void N() {
        Object var0;
        synchronized(var0 = I){}
        int var1 = 0;
        Vector var10000 = B;
        boolean var8 = false;

        int var11;
        try {
            var8 = true;
            var11 = var10000.size();
            var8 = false;
        } finally {
            if (var8) {
                ;
            }
        }

        int var2 = var11;

        while(var1 < var2) {
            var10000 = B;
            int var10001 = var1;

            try {
                Code var3;
                if ((var3 = (Code)var10000.elementAt(var10001)) != null) {
                    B.setElementAt((Object)null, var1);
                    var3.a = false;
                    var3.O();
                    if (var3.Code.isEmpty()) {
                        var3.Code(false, 0);
                    }
                }
            } finally {
                ++var1;
            }
        }

    }

    public static int B(String var0) {
        if (J(var0) == 0) {
            return 0;
        } else {
            String var10000 = var0.substring(0, var0.length() - 5 - 2);

            try {
                return Integer.parseInt(var10000);
            } catch (Exception var1) {
                return 0;
            }
        }
    }

    private boolean n() {
        return B.elementAt(this.b) != this;
    }

    private static int a(String var0) {
        byte[] var1 = new byte[(var0 = var0).length() * 3 / 4];
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;

        byte[] var10000;
        for(int var5 = 0; var5 < var0.length(); ++var5) {
            char var6;
            int var8;
            if ((var6 = var0.charAt(var5)) >= 'A' && var6 <= 'Z') {
                var8 = var6 - 65;
            } else if (var6 >= 'a' && var6 <= 'z') {
                var8 = var6 - 97 + 26;
            } else if (var6 >= '0' && var6 <= '9') {
                var8 = var6 - 48 + 52;
            } else if (var6 == '+') {
                var8 = 62;
            } else {
                if (var6 != '/') {
                    if (var6 != '=') {
                        var10000 = null;
                        return Code(var10000);
                    }
                    break;
                }

                var8 = 63;
            }

            var2 = var2 << 6 | var8;
            var3 += 6;
            if (var3 >= 8) {
                var1[var4] = (byte)(var2 >> var3 - 8);
                var2 ^= var1[var4++] << var3 - 8;
                var3 -= 8;
            }
        }

        if (var4 == var1.length) {
            var10000 = var1;
        } else {
            byte[] var7 = new byte[var4];
            System.arraycopy(var1, 0, var7, 0, var4);
            var10000 = var7;
        }

        return Code(var10000);
    }

    public static int J(String var0) {
        if (var0.length() > 7 && var0.indexOf(".obml") == var0.length() - 5 - 2) {
            String var10000 = var0.substring(var0.length() - 2);

            int var2;
            boolean var3;
            try {
                var3 = e(var2 = Integer.parseInt(var10000));
            } catch (Exception var1) {
                return 0;
            }

            if (var3) {
                return var2;
            }
        }

        return 0;
    }

    private void D(int var1) {
        if (this.bl != var1) {
            if (var1 == 3 && this.a == 0) {
                this.a = this.Code.h();
            }

            this.bl = var1;
            this.e(var1, 18);
        }

        if (var1 >= 4) {
            Code(0L, (long)this.bq, 0L);
            this.bq = 0;
        }

        V();
    }

    private Code(Code var1, int var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        this.c = true;
        super();
        this.h = var1;
    }

    private Code(Code var1, String var2, String var3) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        super();
        var2 = I(var2);
        this.i = var1;
        this.d = var2;
        this.c = var3;
        this.c = false;
        this.u();
    }

    private synchronized void x() {
        if (this.bk != 0) {
            this.D();
            this.bk = 0;
            this.C.aC();
        }

    }

    private static int s() {
        return bA == 0 ? J : 0;
    }

    private static byte[] J(int param0) {
        // $FF: Couldn't be decompiled
    }

    private int Code(RecordStore var1, String var2) {
        Integer var3;
        return (var3 = (Integer)this.Code((RecordStore)var1, (String)var2, 0, 0)) == null ? -1 : var3;
    }

    private byte[] Code(RecordStore var1, String var2) {
        return (byte[])this.Code((RecordStore)var1, (String)var2, 0, 1);
    }

    private B Code(byte[] var1, int var2, boolean var3) {
        return this.Code(var1, 0, var2, 256, (B[])null, var3);
    }

    private void Code(RecordStore var1, boolean var2) {
        if (var1 != null) {
            RecordStore var10000 = var1;
            RecordStore var10001 = this.Code;

            try {
                if (var10000.equals(var10001)) {
                    if (!var2) {
                        return;
                    }

                    this.Code = null;
                }

                var1.closeRecordStore();
            } finally {
                ;
            }
        }
    }

    private void Code(byte[] var1, int var2) {
        this.h[this.bq++] = (var1[var2] & 255) << 24 | (var1[var2 + 1] & 255) << 16 | (var1[var2 + 2] & 255) << 8 | var1[var2 + 3] & 255;
        if (this.bq == 16) {
            this.L();
        }

    }

    private void I(byte[] var1) {
        int var2 = this.C << 3;
        this.Code((byte)-128);

        while(this.b != 0) {
            this.Code((byte)0);
        }

        if (this.bq > 14) {
            this.L();
        }

        this.h[15] = var2;
        this.L();
        Code(this.bp, var1, 0);
        Code(this.bm, var1, 4);
        Code(this.bh, var1, 8);
        Code(this.bn, var1, 12);
        Code(this.bl, var1, 16);
        Code(this.bo, var1, 20);
        Code(this.a, var1, 24);
        Code(this.br, var1, 28);
        this.K();
    }

    private synchronized boolean o() {
        return this.bm > 0 && (this.Z >= this.C ? Math.max(this.Z, this.B) + 240000L : (this.I() ? this.C : Math.max(this.C, this.B)) + (long)this.bm) - System.currentTimeMillis() < 0L;
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

    private static String J(int var0) {
        return I[var0] != null ? I[var0] : "";
    }

    private static void J(int var0, byte[] var1, int var2) {
        var1[var2] = (byte)(var0 >> 16);
        var1[var2 + 1] = (byte)(var0 >> 8);
        var1[var2 + 2] = (byte)var0;
    }

    private boolean w() {
        if (this.L != null) {
            synchronized(this){}
            Code var10000 = this;

            try {
                var10000.aw();
            } finally {
                ;
            }

            return true;
        } else {
            return false;
        }
    }

    private static void Code(I var0, int var1, int var2, int var3) {
        int var4 = 0;
        I var10000 = (I)var3;
        byte[] var10001 = (byte[])var2;

        while(true) {
            try {
                B((int)var10000, (int)var10001);
                var10000 = var0;
                var10001 = Z;
                var0.write(var10001, S, var1);
                return;
            } finally {
                if (var4 == aH) {
                    ;
                } else {
                    Q = (int)var3;
                    Code.J(var4 > 0);
                    var3 = Q;
                    Q = 0;
                    ++var4;
                    continue;
                }
            }
        }
    }

    public final int I() {
        return this.Code.getResponseCode();
    }

    private void u() {
        this.b = 0;
        if (!this.d.endsWith("/")) {
            this.d = this.d + "/";
        }

        if (!this.d.equals("file:///") && !this.d.equals("file://localhost/")) {
            Code var10000 = this;
            Code var10001 = I;
            String var10002 = this.d;
            boolean var10003 = false;
            byte var10004 = 1;
            boolean var16 = false;

            String var2;
            FileConnection var22;
            label272: {
                Enumeration var23;
                try {
                    var16 = true;
                    var10000.j = var10001.Code(var10002, var10003, var10004);
                    var10000 = this;
                    var2 = this.c;
                    var23 = this.j.Code.list(var2, false);
                    var16 = false;
                } catch (IOException var19) {
                    var16 = false;
                    break label272;
                } finally {
                    if (var16) {
                        var22 = this.j.Code;

                        try {
                            e.Code(var22);
                        } finally {
                            ;
                        }

                    }
                }

                var10000.Code = var23;
            }

            var22 = this.j.Code;

            try {
                e.Code(var22);
            } finally {
                ;
            }

            if (this.Code != null) {
                this.Code = new Vector();
                Vector var1 = new Vector();

                while(this.Code.hasMoreElements()) {
                    var2 = (String)this.Code.nextElement();
                    int var3;
                    Code((Vector)(((var3 = 3 | var2.endsWith("/") << 2) & 4) == 0 ? this.Code : var1), (Object)(new Object[]{this.d + var2, new Integer(var3), var2, null}));
                }

                for(int var21 = 0; var21 < this.Code.size(); ++var21) {
                    var1.addElement(this.Code.elementAt(var21));
                }

                this.Code = var1;
            }
        } else {
            this.v();
        }
    }

    private boolean j() {
        Code var1 = null;
        Code var10000 = I;
        String var10001 = this.c;
        boolean var10002 = false;
        byte var10003 = 1;
        boolean var23 = false;

        boolean var29;
        FileConnection var30;
        label176: {
            try {
                var23 = true;
                var29 = (var1 = var10000.Code(var10001, var10002, var10003)).Code.exists();
                var23 = false;
                break label176;
            } catch (IOException var27) {
                var23 = false;
            } finally {
                if (var23) {
                    var30 = var1.Code;

                    try {
                        e.Code(var30);
                    } finally {
                        ;
                    }

                }
            }

            var30 = var1.Code;

            try {
                e.Code(var30);
                return false;
            } finally {
                return false;
            }
        }

        boolean var2 = var29;
        var30 = var1.Code;

        try {
            e.Code(var30);
            return var2;
        } finally {
            return var2;
        }
    }

    private boolean k() {
        Code var1 = null;
        Code var10000 = I;
        String var10001 = this.c;
        boolean var10002 = false;
        byte var10003 = 2;
        boolean var23 = false;

        boolean var29;
        FileConnection var30;
        label176: {
            try {
                var23 = true;
                var29 = (var1 = var10000.Code(var10001, var10002, var10003)).s();
                var23 = false;
                break label176;
            } catch (IOException var27) {
                var23 = false;
            } finally {
                if (var23) {
                    var30 = var1.Code;

                    try {
                        e.Code(var30);
                    } finally {
                        ;
                    }

                }
            }

            var30 = var1.Code;

            try {
                e.Code(var30);
                return false;
            } finally {
                return false;
            }
        }

        boolean var2 = var29;
        var30 = var1.Code;

        try {
            e.Code(var30);
            return var2;
        } finally {
            return var2;
        }
    }

    private int u() {
        return this.bk == 0 ? 0 : l(l(this.bk + 1));
    }

    private void w() {
        Code.I();
        synchronized(this){}
        if (this.bk == 0) {
            Code var10000 = Code;

            try {
                var10000.Z();
                throw new RuntimeException();
            } finally {
                ;
            }
        }
    }

    private static int[] I(int[] var0, int var1) {
        int[] var2 = new int[var1];
        System.arraycopy(var0, 0, var2, 0, var0.length);
        return var2;
    }

    private static void c(byte[] var0, int var1, int var2) {
        while(var2-- > 0) {
            var0[var1 + var2] = 0;
        }

    }

    public final int[] Code() {
        return this.b.Code();
    }

    private Code[] Code() {
        J var10000 = this.b;

        try {
            var10000.b();
        } finally {
            return this.B;
        }
    }

    private static boolean Code(byte[] var0, byte[] var1) {
        byte[] var10000 = var0;
        var0 = var1;
        var1 = var10000;
        if (var10000 == var0) {
            return true;
        } else {
            return var1 != null && var0 != null && var1.length == var0.length ? I(var1, 0, var0, 0, var1.length) : false;
        }
    }

    public final String Code(String var1) {
        return this.Code.getHeaderField(var1);
    }

    private B Code(int[] var1, int var2, int var3, int var4, int var5, int var6) {
        var1 = Code(var1, var2, var3, var4, var5, 0, 0, 0, 0, var6, false);
        return this.Code(var1, var1.length / var5, var5, true, true);
    }

    private B Code(byte[] var1, int var2, int var3, int var4, B[] var5, boolean var6) {
        return this.Code(var1, var2, var3, -1, -1, var4, var5, var6);
    }

    private Code(char var1, short var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        super();
    }

    private Code(short var1, byte var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        this.a = true;
        super();
    }

    private Code(String var1, String var2, int var3) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        this.b = true;
        super();
        this.b = var1;
        this.d = var2;
        this.b = var3;
    }

    private static int Z(Code var0) {
        Code[] var2;
        d((var2 = var0.Code()).length);
        int var1 = 0;

        while(var1 < var2.length) {
            if (var2[var1] == null) {
                ++var1;
            } else {
                e(Code(52, 1, (Object)var2[var1]));
                ++var1;
            }
        }

        return l();
    }

    private long Z() {
        return this.Code.fileSize();
    }

    private Code(Code var1, Object[] var2, int[] var3, Code var4, Hashtable var5, boolean var6) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        this.d = true;
        super();
        this.J = new Hashtable();
        this.Code = new Vector();
        this.d = null;
        this.b = -1;
        this.l = var1;
        this.I = var2;
        this.I = var3;
        if (var5 != null) {
            this.J = var5;
        }

        this.b = var6;
        this.C = var3[14];
        this.B(var4);
    }

    private void e(int var1, int var2) {
        Code.I();
        int var3;
        if ((var3 = this.u()) != 0) {
            I(var1);
            Code.Code(var3, var2);
        } else {
            Code.Z();
        }
    }

    private void D() {
        this.c = true;
        a var10000 = this.Code;

        try {
            var10000.close();
        } finally {
            ;
        }

        Code((Runnable)(new Code(false, (short)0)));
    }

    private synchronized void a(int var1, int var2, int var3) {
        int var10002 = var1;
        var1 = var2;
        var2 = var10002;
        this.n.B.Code(var3, var2, var1);
        this.m.Code(this.n.B);
    }

    private synchronized void b(int var1, int var2, int var3) {
        int var10002 = var1;
        var1 = var2;
        var2 = var10002;
        this.n.a.Code(var3, var2, var1);
        this.m.Code(this.n.a);
    }

    private synchronized void C(int var1, int var2, int var3) {
        B var4;
        (var4 = this.n.B).Code(var3, var1, var2);
        String var5 = var4.Code.I();
        if (var4.Code > var5.length()) {
            var4.Code = var5.length();
        }

        char var6;
        while(var4.Code > 0 && (var6 = var5.charAt(var4.Code - 1)) != ' ' && var6 != '\n') {
            --var4.Code;
        }

        (var4 = this.n.a).Code(var3, var1, var2);

        char var8;
        for(String var7 = var4.Code.I(); var4.Code < var7.length() && (var8 = var7.charAt(var4.Code)) != ' ' && var8 != '\n'; ++var4.Code) {
        }

        this.m.Code(this.n.a);
    }

    private static Code Z(int var0) {
        return J(var0) ? E : D;
    }

    private synchronized void Code(String var1, int var2, String var3) {
        switch(var2) {
            case 99:
                if (this.J.get(var3) == null) {
                    this.J.put(var3, var1);
                    return;
                }

                this.J.remove(var3);
                return;
            case 112:
                if (!this.J.containsKey(var3)) {
                    this.Code.addElement(var3);
                }
            case 83:
            case 85:
            case 97:
            case 114:
            case 120:
                if (var2 != 97 && var1 != null && var1.length() > 0) {
                    var1 = var1.replace('\r', ' ').replace('\n', ' ');
                }

                this.J.put(var3, var1);
                return;
            case 115:
                this.J.put(var3, var1.replace(' ', '\u0000'));
            default:
        }
    }

    private static boolean J(char var0) {
        return B(var0) || C(var0);
    }

    private synchronized boolean l() {
        Code var1;
        if ((var1 = this.n).B && !var1.B.Code() && !var1.a.Code()) {
            B var10000 = var1.B;
            B var3 = var1.a;
            B var2 = var10000;
            if (!var10000.Code() && !var3.Code()) {
                if (var2.Code(var3) == 0) {
                    return false;
                }
            } else if (var2.Code() == var3.Code()) {
                return false;
            }

            return true;
        } else {
            return false;
        }
    }

    private synchronized void f(int var1, int var2) {
        this.C.I(this.n.B, var1, var2);
    }

    private synchronized void g(int var1, int var2) {
        this.C.I(this.n.a, var1, var2);
    }

    private synchronized void F() {
        Code var1;
        (var1 = this.n).B.Code = null;
        var1.a.Code = null;
    }

    public final long Code() {
        return this.Code.getLength();
    }

    private static int z() {
        String var10000 = System.getProperty("com.sonyericsson.net.mnc");

        try {
            return Integer.parseInt(var10000);
        } finally {
            return -1;
        }
    }

    private synchronized void G() {
        Code var1;
        if ((var1 = this.n).B) {
            a = var1.i();
        }

    }

    private void Code(DataInputStream var1) {
        short var2 = var1.readShort();
        Code((InputStream)var1, (int)var2);
        var2 = var1.readShort();
        this.h = new int[var2];
        this.g = new int[var2];
        int var3 = var2 * 6 - 6;

        for(int var4 = 0; var4 < var2; ++var4) {
            var1.readShort();
            this.g[var4] = var1.readInt();
            this.h[var4] = var3;
            var3 += this.g[var4] - 6;
        }

        this.b = true;
    }

    private static int w() {
        return !aC && !W ? -1 : 0;
    }

    public final int B(int var1) {
        return this.b ? this.h[var1] : -1;
    }

    private static int v() {
        return Code.B() ? Code.getHeight() : Code.getWidth();
    }

    private static boolean m() {
        return ar || as || T;
    }

    private Code(short var1, char var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        this.w = true;
        super();
    }

    private Code(short var1, short var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        this.x = true;
        super();
    }

    private Code(short var1, int var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        this.x = true;
        this((short)0, (short)0);
    }

    private int Code(String var1, byte[] var2) {
        RecordStore var3 = null;
        Code var10000 = this;
        String var10001 = var1;
        boolean var10002 = true;
        boolean var6 = false;

        int var10;
        try {
            var6 = true;
            var10 = (var3 = var10000.Code(var10001, var10002)).addRecord(var2, 0, var2.length);
            var6 = false;
        } catch (RecordStoreException var7) {
            throw new IOException(var7.getMessage());
        } finally {
            if (var6) {
                this.Code(var3, true);
            }
        }

        int var9 = var10;
        this.Code(var3, true);
        return var9;
    }

    private boolean Code(String var1, String var2) {
        RecordStore var3 = null;
        Code var10000 = this;
        String var10001 = var1;
        boolean var10002 = true;
        boolean var6 = false;

        int var10;
        try {
            var6 = true;
            var3 = var10000.Code(var10001, var10002);
            var10 = this.Code(var3, var2);
            var6 = false;
        } catch (RecordStoreException var7) {
            throw new IOException(var7.getMessage());
        } finally {
            if (var6) {
                this.Code(var3, false);
            }
        }

        boolean var9;
        if (var10 != -1) {
            var9 = true;
        } else {
            var9 = false;
        }

        this.Code(var3, false);
        return var9;
    }

    private byte[] Code(String var1, String var2) {
        RecordStore var3 = null;
        Code var10000 = this;
        String var10001 = var1;
        boolean var10002 = true;
        boolean var6 = false;

        byte[] var10;
        try {
            var6 = true;
            var3 = var10000.Code(var10001, var10002);
            var10 = this.Code(var3, var2);
            var6 = false;
        } catch (RecordStoreException var7) {
            throw new IOException(var7.getMessage());
        } finally {
            if (var6) {
                this.Code(var3, false);
            }
        }

        byte[] var9 = var10;
        this.Code(var3, false);
        return var9;
    }

    private void Code(String var1, int var2, byte[] var3) {
        Code var10000 = this;
        String var10001 = var1;
        int var10002 = var2;
        byte[] var10003 = var3;

        try {
            var10000.I(var10001, var10002, var10003);
        } catch (IOException var4) {
            Y();
            this.I(var1, var2, var3);
        }
    }

    private byte[] Code(String var1, int var2) {
        RecordStore var3 = null;
        Code var10000 = this;
        String var10001 = var1;
        boolean var6;
        boolean var10002 = var6 = false;

        byte[] var10;
        try {
            var6 = true;
            (var3 = var10000.Code(var10001, var10002)).getSizeAvailable();
            var10 = var3.getRecord(var2);
            var6 = false;
        } catch (RecordStoreException var7) {
            throw new IOException(var7.getMessage());
        } finally {
            if (var6) {
                this.Code(var3, false);
            }
        }

        byte[] var9 = var10;
        this.Code(var3, false);
        return var9;
    }

    private void I(String var1, int var2, byte[] var3) {
        RecordStore var4 = null;
        Code var10000 = this;
        String var10001 = var1;
        boolean var10002 = true;

        try {
            (var4 = var10000.Code(var10001, var10002)).setRecord(var2, var3, 0, var3.length);
        } catch (RecordStoreException var7) {
            throw new IOException(var7.getMessage());
        } finally {
            this.Code(var4, true);
        }

    }

    public final a Code(String var1, String var2) {
        a var3 = null;
        RecordStore var4 = null;
        Code var10000 = this;
        String var10001 = var1;
        boolean var10002 = true;
        boolean var7 = false;

        label46: {
            int var11;
            a var12;
            DataInputStream var13;
            try {
                var7 = true;
                var4 = var10000.Code(var10001, var10002);
                byte[] var10;
                if ((var10 = this.Code(var4, var2)) == null) {
                    var7 = false;
                    break label46;
                }

                var11 = I(var10);
                var12 = var3 = new a((byte)0);
                var13 = new DataInputStream(new ByteArrayInputStream(var10, 0, var11));
                var7 = false;
            } catch (RecordStoreException var8) {
                throw new IOException(var8.getMessage());
            } finally {
                if (var7) {
                    this.Code(var4, false);
                }
            }

            var12.Code = var13;
            var3.Code = var11;
        }

        this.Code(var4, false);
        return var3;
    }

    public final void Code(String var1, String var2, byte[] var3, int var4, int var5) {
        Code var10000 = this;
        String var10001 = var1;
        String var10002 = var2;
        byte[] var10003 = var3;
        int var10004 = var4;
        int var10005 = var5;

        try {
            var10000.I(var10001, var10002, var10003, var10004, var10005);
        } catch (IOException var6) {
            Y();
            this.I(var1, var2, var3, var4, var5);
        }
    }

    private void I(String var1, String var2, byte[] var3, int var4, int var5) {
        RecordStore var6 = null;
        Code var10000 = this;
        String var10001 = var1;
        boolean var10002 = true;
        boolean var9 = false;

        try {
            var9 = true;
            var6 = var10000.Code(var10001, var10002);
            int var12;
            if ((var12 = this.Code(var6, var2)) > 0) {
                byte[] var14 = Code(var2, var3, var4, var5);
                var6.setRecord(var12, var14, 0, var14.length);
                var9 = false;
            } else {
                byte[] var13 = Code(var2, var3, var4, var5);
                var6.addRecord(var13, 0, var13.length);
                var9 = false;
            }
        } catch (RecordStoreException var10) {
            throw new IOException(var10.getMessage());
        } finally {
            if (var9) {
                this.Code(var6, true);
            }
        }

        this.Code(var6, true);
    }

    private RecordStore Code(String var1, boolean var2) {
        if ("b_6".equals(var1) && this.Code != null) {
            return this.Code;
        } else {
            RecordStore var3 = RecordStore.openRecordStore(var1, var2);
            if ("b_6".equals(var1)) {
                this.Code = var3;
            }

            return var3;
        }
    }

    private static synchronized void Code(int var0, byte[] var1) {
        DataInputStream var14 = new DataInputStream(new ByteArrayInputStream(var1));

        Code var2;
        int var3;
        Code[] var4;
        int var6;
        Code[] var15;
        IOException var10000;
        boolean var10001;
        try {
            U();
            var2 = null;
            var4 = new Code[var3 = var14.readUnsignedByte()];
            int var5 = 0;

            while(true) {
                if (var5 >= var3) {
                    (var15 = new Code[(var3 = var14.readUnsignedByte()) + 2])[0] = x;
                    var6 = 1;
                    break;
                }

                var6 = var14.readUnsignedByte();
                int var7 = var14.readUnsignedByte();
                String var8 = var14.readUTF();
                int var9 = var14.readUnsignedShort();
                int var10 = var14.readUnsignedShort();
                String var11 = var14.readUTF();
                var4[var5] = new Code(var6, var7, var8, var9, var10, var11, var8);
                if (var4[var5].cx == 255) {
                    var2 = var4[var5];
                }

                ++var5;
            }
        } catch (IOException var13) {
            var10000 = var13;
            var10001 = false;
            throw var10000;
        }

        while(true) {
            Code[] var16;
            int var17;
            Code var10002;
            try {
                if (var6 > var3) {
                    break;
                }

                var16 = var15;
                var17 = var6;
                var10002 = new Code(var14.readUTF(), var14.readUTF(), var14.readUnsignedShort(), var14.readUTF(), var14.readUnsignedByte());
            } catch (IOException var12) {
                var10000 = var12;
                var10001 = false;
                throw var10000;
            }

            var16[var17] = var10002;
            ++var6;
        }

        var15[var3 + 1] = w;
        z = var2;
        I = var4;
        Code = var15;
        bw = var0;
    }

    private static void U() {
        Code = new Code[]{w, x};
        I = new Code[0];
        z = null;
        bw = 0;
    }

    private Code(short var1, boolean var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        this.y = true;
        super();
        this.h = new byte[4];
        this.h = new int[64];
        this.K();
    }

    private void Code(byte var1) {
        this.h[this.b++] = var1;
        if (this.b == this.h.length) {
            this.Code((byte[])this.h, (int)0);
            this.b = 0;
        }

        ++this.C;
    }

    private void a(byte[] var1, int var2, int var3) {
        while(this.b != 0 && var3 > 0) {
            this.Code(var1[var2]);
            ++var2;
            --var3;
        }

        while(var3 > this.h.length) {
            this.Code(var1, var2);
            var2 += this.h.length;
            var3 -= this.h.length;
            this.C += this.h.length;
        }

        while(var3 > 0) {
            this.Code(var1[var2]);
            ++var2;
            --var3;
        }

    }

    private static int J(int var0, int var1, int var2) {
        return ((var0 >>> 6 | var0 << 26) ^ (var0 >>> 11 | var0 << 21) ^ (var0 >>> 25 | var0 << 7)) + (var0 & var1 ^ ~var0 & var2);
    }

    private static int B(int var0, int var1, int var2) {
        return ((var0 >>> 2 | var0 << 30) ^ (var0 >>> 13 | var0 << 19) ^ (var0 >>> 22 | var0 << 10)) + (var0 & var1 ^ var0 & var2 ^ var1 & var2);
    }

    public final Code Z() {
        return this.q;
    }

    private Code(int var1, byte var2, boolean var3) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        this.L = true;
        super();
        this.Code = new Vector();
        this.g = new byte[1024];
        this.I = new Object[110];
        this.h = new int[110];
        this.w = false;
        this.b = var1;
        if (var3) {
            this.q = I(var1);
            this.w = true;
        } else {
            this.q = Code(var1);
        }

        var3 = false;
        int var5;
        int var10000;
        if ((var5 = y()) == 460) {
            var10000 = 1;
        } else {
            label106: {
                if (var5 == -1) {
                    String var8;
                    int var6 = (var8 = Code((int)0).c).indexOf(46);
                    int var7 = var8.indexOf("cn");
                    var5 = var8.indexOf("china");
                    if (var7 >= 0 && var7 < var6 || var5 >= 0 && var5 < var6) {
                        var10000 = 1;
                        break label106;
                    }

                    if ((var8 = System.getProperty("wireless.messaging.sms.smsc")) != null) {
                        var10000 = !var8.startsWith("+86") && !var8.startsWith("0086") ? 0 : 1;
                        break label106;
                    }

                    if (J((int)1).length() == 0) {
                        if ((var8 = System.getProperty("microedition.locale")) != null) {
                            var10000 = var8.toLowerCase().endsWith("cn");
                            break label106;
                        }

                        if ((var8 = c()) != null && var8.toLowerCase().startsWith("zh")) {
                            var10000 = 1;
                            break label106;
                        }
                    }
                }

                var10000 = 0;
            }
        }

        var5 = var10000;
        this.Code = new String[var5 + 2];
        String[] var10;
        byte var10001;
        String var10002;
        if (!this.q.A()) {
            var10 = this.Code;
            var10001 = 0;
            var10002 = "socket://" + this.q.c + ":" + this.q.cp;
        } else {
            var10 = this.Code;
            var10001 = 0;
            var10002 = "socket://do_not_use_me:0";
        }

        var10[var10001] = var10002;
        if (var5 != 0) {
            this.Code[1] = "http://10.0.0.172:80/";
        }

        this.Code[this.Code.length - 1] = this.g();
        if (this.Code.length != bs) {
            bs = this.Code.length;
            R();
            var3 = true;
        }

        String var4 = this.q.l();
        Object[] var9;
        if ((var9 = (Object[])C.get(var4)) != null) {
            this.Z = var9;
            this.r = (Code)var9[0];
        } else {
            this.r = new Code(Code((byte[])Z(this.q.m), 0, 160));
            this.Z = new Object[2];
            this.Z[0] = this.r;
            this.Z[1] = "";
            C.put(var4, this.Z);
            var3 = true;
        }

        if (var3) {
            I("md");
        }

        this.Code = var2 != -1 ? var2 : (J >= 0 && !this.q.A() ? J : (B >= 0 ? B : 1));
        if (B.size() <= var1) {
            B.setSize(var1 + 1);
        }

        B.setElementAt(this, var1);
        Code((Runnable)this);
    }

    private String g() {
        return "http://" + this.q.c + ":" + this.q.br + "/";
    }

    public static a Code(Object[] var0, int[] var1, int var2) {
        a var3;
        I(var3 = new a(var0, var1, var2));
        M();
        return var3;
    }

    private a Code() {
        Object var1;
        synchronized(var1 = I){}
        Code var10000 = this;
        boolean var5 = false;

        try {
            var5 = true;
            if (!var10000.I() && this == B.elementAt(this.b)) {
                B.setElementAt((Object)null, this.b);
            }

            while(Z == null || Z != null && (this.b != Z.Code() || this.I() && this.n() && this != Z.Code())) {
                if (this.x) {
                    for(int var2 = 0; var2 < this.Code.size(); ++var2) {
                        a var3;
                        if ((var3 = (a)this.Code.elementAt(var2)).C() != 0) {
                            return var3;
                        }
                    }
                }

                this.x = false;
                Code((Object)I, (int)0);
                if (this.B) {
                    M();
                    return null;
                }
            }

            if (this.B) {
                M();
                return null;
            } else {
                a var7;
                Z = (var7 = Z).Code();

                int var8;
                for(var8 = 1; this.Code(var8) != null; ++var8) {
                }

                this.Code.addElement(var7);
                var7.Code(this, var8);
                M();
                var5 = false;
                return var7;
            }
        } finally {
            if (var5) {
                ;
            }
        }
    }

    private boolean p() {
        // $FF: Couldn't be decompiled
    }

    private static void S() {
        K(0);
        Code((byte)-2, (String)null);
        I((byte)-2, (String)null);
        Z = -1;
        I("md");
    }

    private Code(int var1, char var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        this.M = true;
        super();
        this.Code = new Vector();
        this.B = new Hashtable();
        this.bh = 0;
        this.bn = 0;
    }

    private static void I(a var0) {
        Object var1;
        synchronized(var1 = I){}
        a var10000 = var0;
        a var10001 = Z;
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

        Z = var0;
    }

    private static void R() {
        Object var0;
        synchronized(var0 = I){}
        if (!D) {
            byte var10000 = -1;
            Object var10001 = null;

            try {
                Code((byte)var10000, (String)var10001);
                I((byte)-1, (String)null);
                ++bu;
                E = true;
                N();
            } finally {
                ;
            }
        }

    }

    public final boolean I() {
        return this.Code[this.Code].startsWith("socket://");
    }

    private static void M() {
        Object var0;
        synchronized(var0 = I){}
        if (!D) {
            Throwable var10000;
            label232: {
                boolean var10001;
                if (z) {
                    z = false;

                    try {
                        R();
                    } catch (Throwable var8) {
                        var10000 = var8;
                        var10001 = false;
                        break label232;
                    }
                }

                label227:
                try {
                    if (Z == null) {
                        return;
                    }

                    int var9;
                    Code var2 = Code(var9 = Z.Code());
                    if (J == -2 && B == -2) {
                        Code((byte)-1, (String)null);
                        I((byte)-1, (String)null);
                    }

                    if (var2.A() && B == -2) {
                        I((byte)-1, (String)null);
                    }

                    if ((var2.A() && B == -1 || !var2.A() && (J == -1 || J == -2 && B == -1)) && !A) {
                        ++bu;
                        Z = -1;
                        E = true;
                        A = true;
                    }

                    if (B.size() > var9 && B.elementAt(var9) != null) {
                        Code(I);
                    } else {
                        Code(var9, (byte)((E << 1) + -1), false);
                    }

                    return;
                } catch (Throwable var7) {
                    var10000 = var7;
                    var10001 = false;
                    break label227;
                }
            }

            Throwable var1 = var10000;
            throw var1;
        }
    }

    public static void Code(a var0, boolean var1) {
        Object var2;
        synchronized(var2 = I){}
        a var10000 = var0;
        boolean var8 = false;

        try {
            label124: {
                var8 = true;
                if (!var10000.Z()) {
                    var0.I(0);
                    Code var3;
                    if ((var3 = var0.Code()) != null) {
                        boolean var4 = var3.n();

                        for(int var5 = 0; var4 && var5 < var3.Code.size(); ++var5) {
                            a var6;
                            if (!(var6 = (a)var3.Code.elementAt(var5)).Z() && var6.Code()) {
                                var4 = false;
                            }
                        }

                        if (!var4 && var3.I()) {
                            var3.x = true;
                            var0.Z(var1 + 6);
                            Code(I);
                            var8 = false;
                        } else {
                            var3.Code(false, 0);
                            var8 = false;
                        }

                        return;
                    }

                    if (Z != null) {
                        var10000 = Z.Code(var0);
                        var8 = false;
                        break label124;
                    }

                    var8 = false;
                    return;
                }

                var8 = false;
                return;
            }
        } finally {
            if (var8) {
                ;
            }
        }

        Z = var10000;
    }

    private synchronized void H(int var1) {
        this.Z(this.Code(var1));
    }

    private boolean Z(int var1) {
        Object var2;
        synchronized(var2 = I){}
        Vector var10000 = B;
        int var10001 = this.b;
        boolean var7 = false;

        try {
            var7 = true;
            if (var10000.elementAt(var10001) == this) {
                B.setElementAt((Object)null, this.b);
            }

            boolean var3 = E || this.a;
            int var4 = 0;

            while(true) {
                while(var4 < this.Code.size()) {
                    a var5;
                    if (!(var5 = (a)this.Code.elementAt(var4)).Z() && !var5.Code() && (var3 || !var5.I())) {
                        if (!var3) {
                            var5.Z();
                        }

                        var5.Code();
                        I(var5);
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
                    M();
                    Code(I);
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

    private synchronized void Z(a var1) {
        if (var1 != null) {
            this.Code.removeElement(var1);
        }

    }

    private static Code I(int var0) {
        return new Code(var0, y.cD, Code((String)y.c, (int)1), y.br, y.cp, y.m, y.c);
    }

    private void C(boolean var1) {
        this.Code(var1, 0);
    }

    private synchronized void Q() {
        if (this.B) {
            throw new IOException();
        } else {
            this.Z = System.currentTimeMillis();
        }
    }

    private void I(byte[] var1, int var2) {
        this.Code.write(var1, 0, var2);
        if (this.I()) {
            this.Code.flush();
        }

        this.B = System.currentTimeMillis();
    }

    private static void Code(byte var0, String var1) {
        J = var0;
        g = var1;
    }

    private static void I(byte var0, String var1) {
        B = var0;
        h = var1;
    }

    private void Code(a var1, byte[] var2) {
        String var3;
        int var4;
        if ((var4 = (var3 = this.Code[this.Code]).indexOf(59)) >= 0) {
            var3 = var3.substring(0, var4);
        }

        bv = this.b;
        K = this.w;
        if (this.I()) {
            if (this.Code == null) {
                Code var15 = new Code(var3, aB ^ true);
                this.B = var15;
                this.Code = var15.Code();
                this.I = this.Code;
                this.Code = var15.Code();
                this.I = this.Code;
            }

            this.I(var2, var2.length);
            if (var1 != null) {
                var1.B();
            }

            this.B(var1);
        } else {
            String var11 = "";
            String var5;
            if (var1 != null) {
                Object[] var12;
                var5 = (String)(var12 = var1.Code())[53];
                var11 = (String)var12[42];
            } else {
                var5 = "server:test";
            }

            if ((this.q.cD & 2) != 0) {
                var11 = Code(var5, var11);
                if (var5 == null || !var5.startsWith("b:") && !var5.startsWith("javascript:")) {
                    if ("".equals(var11)) {
                        if (var5 != null) {
                            var11 = var5;
                        } else {
                            var11 = "internal";
                        }
                    }
                } else {
                    var11 = Code((String)((String)var1.Code()[38]), (String)null);
                }

                var3 = var3 + var11;
            }

            J var16 = Code(var3, "POST");
            this.B = var16;
            if (var3.startsWith("http://10.0.0.172")) {
                Object[] var13 = Code(this.g());
                if ((var3 = (String)var13[1] + ":" + var13[2]) != null) {
                    var16.Code("X-Online-Host", var3);
                }
            }

            var16.Code("Content-Type", "application/xml");
            this.Code = var16.Code();
            this.I = this.Code;
            this.I(var2, var2.length);
            this.B(var1);
            this.Code.close();
            if (var1 != null) {
                var1.B();
            }

            this.Code = null;
            this.Code = var16.Code();
            this.I = this.Code;
            int var9;
            if ((var9 = var16.I()) != 301 && var9 != 302 && var9 != 303 && var9 != 307) {
                if (var9 == 403) {
                    this.bp = 2;

                    label214: {
                        String var10000;
                        label213: {
                            try {
                                StringBuffer var8 = new StringBuffer();
                                var9 = 0;

                                int var14;
                                while((var14 = this.Code.read()) > 32) {
                                    ++var9;
                                    if (var9 > 256) {
                                        break;
                                    }

                                    var8.append((char)var14);
                                    if (var9 == 4 && !var8.toString().toLowerCase().equals("http")) {
                                        var8.setLength(0);
                                        break;
                                    }
                                }

                                if (var8.length() > 0) {
                                    var10000 = var8.toString();
                                    break label213;
                                }
                            } finally {
                                ;
                            }

                            f = null;
                            break label214;
                        }

                        f = var10000;
                    }

                    this.Code(false, 4);
                }

            } else {
                this.bp = 1;
                String var10;
                if (var1 != null && this.q.z() && (var10 = var16.Code("Location")) != null && var10.length() > 0) {
                    if (var1.J(var10)) {
                        this.J(var1);
                        M();
                    } else {
                        var1.close();
                    }
                }

                this.C(false);
            }
        }
    }

    private boolean Code(a var1) {
        if (this.g[0] == 72 && this.g[1] == 84 && this.g[2] == 84 && this.g[3] == 80) {
            this.i(5, 7);
            Code var10000;
            String var10001;
            if (!this.q.z() || this.g[8] != 32 || this.g[9] != 51 || this.g[10] != 48 || this.g[11] != 49 && this.g[11] != 50 && this.g[11] != 51 && this.g[11] != 55) {
                if (this.g[8] == 32 && this.g[9] == 52 && this.g[10] == 48 && this.g[11] == 51) {
                    this.bp = 2;
                    StringBuffer var18 = new StringBuffer();
                    var10000 = this;
                    var10001 = null;

                    try {
                        var10000.b(var10001);
                        int var19 = 0;

                        while(true) {
                            ++var19;
                            if (var19 > 256) {
                                break;
                            }

                            this.i(0, 1);
                            if (this.g[0] <= 32) {
                                break;
                            }

                            var18.append((char)this.g[0]);
                            if (var19 == 4 && !var18.toString().toLowerCase().equals("http")) {
                                var18.setLength(0);
                                break;
                            }
                        }
                    } finally {
                        ;
                    }

                    f = var18.length() > 4 ? var18.toString() : null;
                    this.Code(false, 4);
                    return true;
                } else {
                    return false;
                }
            } else {
                this.bp = 1;
                String var2 = null;
                var10000 = this;
                var10001 = "location";

                String var20;
                try {
                    var20 = var10000.b(var10001);
                } finally {
                    ;
                }

                var2 = var20;
                if (var2 != null && var2.length() != 0) {
                    if (var1 != null) {
                        if (var1.J(var2)) {
                            this.J(var1);
                            M();
                        } else {
                            var1.close();
                        }
                    }

                    Object var3;
                    synchronized(var3 = I){}

                    a var21;
                    for(a var4 = Z; var4 != null; var4 = var21) {
                        var21 = var4;
                        boolean var8 = false;

                        try {
                            var8 = true;
                            if (var21.Code() == this.b && !var4.Z() && var4 != var1) {
                                if (var4.J(var2)) {
                                    M();
                                } else {
                                    var4.close();
                                }
                            }

                            var21 = var4.Code();
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

    private static String d(String var0) {
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

    private String b(String var1) {
        StringBuffer var2 = new StringBuffer();

        while(true) {
            this.i(0, 1);
            if (this.g[0] == 13) {
                this.i(0, 1);
            }

            if (this.g[0] == 10) {
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
                var2.append((char)this.g[0]);
            }
        }
    }

    private static String e(String var0) {
        StringBuffer var1 = new StringBuffer(var0.length());
        int var2 = 0;

        while(var2 < var0.length()) {
            char var3;
            if ((var3 = var0.charAt(var2)) == 0) {
                var1.append("%00");
                ++var2;
            } else if ("%&=;".indexOf(var3) >= 0) {
                var1.append('%').append(Integer.toString(var3, 16));
                ++var2;
            } else {
                var1.append(var3);
                ++var2;
            }
        }

        return var1.toString();
    }

    private static String Code(String var0, String var1) {
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

                var1 = c(var1);
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

    private void T() {
        this.Q();
        this.r.s();
        int var1 = ((this.g[1] & 255) << 2) + 128;
        int var2 = this.g[2] & 255;
        this.i(5, var2 + 166 + var1);
        this.P();
        this.r.f = new byte[var2 + 1];
        i = this.r.f;
        System.arraycopy(this.g, 2, this.r.f, 0, var2 + 1);
        int[] var3 = Code((byte[])this.g, var2 + 3, 160);
        int[] var4 = Code(this.g, var2 + 163, var1);
        byte[] var10001 = this.g;
        var1 += var2 + 163;
        byte[] var5 = var10001;
        this.r.Z = (long)Code(var10001, var1) << 32 | (long)Code(var5, var1 + 4) & 4294967295L;
        this.r.g = var3;
        this.r.h = var4;
        if (!u) {
            J = System.currentTimeMillis() - (this.r.Z - 1209600000L);
            u = true;
        }

    }

    private static String Code(String var0, int var1) {
        int var2;
        if ((var2 = var0.indexOf(46)) > 0) {
            var0 = var0.substring(0, var2) + '-' + var1 + var0.substring(var2);
        }

        return var0;
    }

    private static synchronized void I(int var0, byte[] var1) {
        int var10000 = var0;
        byte[] var10001 = var1;
        boolean var4 = false;

        try {
            var4 = true;
            Code(var10000, var10001);
            String var10 = "trafficrouting";

            try {
                RecordStore.deleteRecordStore(var10);
            } finally {
                ;
            }

            byte[] var9 = new byte[4];
            Z(bw, var9, 0);
            J.Code("trafficrouting", var9);
            J.Code("trafficrouting", var1);
            var4 = false;
        } finally {
            if (var4) {
                return;
            }
        }

    }

    public static int[] Code(int[] var0, int var1) {
        return var0.length < var1 ? I(var0, var1) : var0;
    }

    private static synchronized void Code(DataInputStream var0, int var1) {
        if (var1 <= 5) {
            var0.readUTF();
            var0.readByte();
            var0.readByte();
            var0.readBoolean();
            var0.readBoolean();
            var0.readLong();
            var0.skip(8L);
            var0.skip((long)var0.readUnsignedByte());
            var0.skip((long)(4 * var0.readUnsignedShort()));
            var0.skip((long)(4 * var0.readUnsignedShort()));
            if (var1 >= 4) {
                var0.readByte();
            }

        } else {
            E = var0.readBoolean();
            var0.readByte();
            J = var0.readByte();
            B = var0.readByte();
            String var2;
            h = (var2 = var0.readUTF()).length() == 0 ? null : var2;
            g = (var2 = var0.readUTF()).length() == 0 ? null : var2;
            bs = var0.readByte();
            if (var1 >= 7) {
                G = var0.readBoolean();
            }

            if (var0.readInt() != "mini5.opera-mini.net".hashCode()) {
                r();
            }

            u = true;
            if (var1 >= 8) {
                u = var0.readBoolean();
                J = var0.readLong();
            }

            byte var6 = var0.readByte();

            for(int var7 = 0; var7 < var6; ++var7) {
                String var3 = var0.readUTF();
                Code var4;
                (var4 = new Code(Code(var0))).Z = var0.readLong();
                var0.readFully(var4.g);
                int var5;
                if ((var5 = var0.readUnsignedByte()) != 0) {
                    var0.readFully(var4.f = new byte[var5]);
                    i = var4.f;
                }

                var4.g = Code(var0);
                var4.h = Code(var0);
                if (!var4.h()) {
                    Object[] var8;
                    (var8 = new Object[2])[0] = var4;
                    var8[1] = "";
                    C.put(var3, var8);
                }
            }

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

    private static int[] Code(DataInputStream var0) {
        int var1;
        if ((var1 = var0.readUnsignedShort()) == 0) {
            return null;
        } else {
            byte[] var2 = new byte[var1 << 2];
            var0.readFully(var2);
            return Code((byte[])var2, 0, var2.length);
        }
    }

    private static void Code(StringBuffer var0, char var1) {
        var0.append('%');
        if (var1 < 16) {
            var0.append('0');
        }

        var0.append(Integer.toHexString(var1));
    }

    private static int Code(int[] var0, int var1, int var2, int var3) {
        return Code((int[])var0, (int)0, var1, var2, (int)-1, (int)var3);
    }

    public static void Code(Object var0, int var1) {
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

    public static void Code(Object var0) {
        synchronized(var0){}
        Object var10000 = var0;

        try {
            var10000.notifyAll();
        } finally {
            ;
        }

    }

    private static String f(String var0) {
        StringBuffer var1;
        int var2;
        for(var1 = new StringBuffer(var0.length()); (var2 = var0.indexOf(37)) >= 0 && var2 + 3 <= var0.length(); var0 = var0.substring(var2 + 3, var0.length())) {
            var1.append(var0.substring(0, var2)).append((char)Integer.parseInt(var0.substring(var2 + 1, var2 + 3), 16));
        }

        return var1.append(var0).toString();
    }

    private static byte[] Z(String var0) {
        byte[] var1 = new byte[var0.length() / 2];

        for(int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = (byte)Integer.parseInt(var0.substring(var2 << 1, (var2 << 1) + 2), 16);
        }

        return var1;
    }

    private static boolean b(String var0) {
        return Code(var0) != null;
    }

    private static synchronized void ap() {
        // $FF: Couldn't be decompiled
    }

    private synchronized boolean Code(Code var1, int var2, Code var3) {
        if (var2 == 0) {
            return false;
        } else {
            var2 = H(var2);
            int[] var4 = Code;
            int var5 = Code + 2;
            int var6;
            if ((var6 = this.I(var4, var5, var2, var3.B.J())) < 0) {
                return false;
            } else {
                var1.B.Code(this.Code(var4, var5, var2, var3.B.Z(), var6), var3.B.Z(), var6);
                return true;
            }
        }
    }

    private static String Code(int var0, int var1, String var2) {
        int var3;
        String[] var4 = new String[var3 = l(var0)];
        Z(var0);

        for(var0 = 0; var0 < var3; ++var0) {
            var4[var0] = Code(Code[Code + var0]);
        }

        String[] var8 = new String[var3];
        Z(var1);

        for(var1 = 0; var1 < var3; ++var1) {
            var8[var1] = Code(Code[Code + var1]);
        }

        StringBuffer var9 = new StringBuffer(var2.length());
        int var5 = 0;

        while(var5 < var2.length()) {
            boolean var6 = false;

            for(int var7 = 0; var7 < var3; ++var7) {
                if (var2.startsWith(var8[var7], var5)) {
                    var9.append(var4[var7]);
                    var5 += var8[var7].length();
                    var6 = true;
                    break;
                }
            }

            if (!var6) {
                var9.append(var2.charAt(var5++));
            }
        }

        return var9.toString();
    }

    private static int Code(int var0, int var1, int var2, int var3, int var4, int var5) {
        O = var0;
        J var9 = (J)Code(O);
        String var10 = C(var1);
        char[] var13 = I(var5);
        Code var11 = new Code(var13, var4, var3, var2, var10, var9);
        d(0);

        for(var3 = 0; var3 < var11.Code.size(); ++var3) {
            P = a(9, 44);
            Object var12;
            boolean var10000 = (var12 = var11.Code.elementAt(var3)) instanceof Code;
            if (var10000) {
                var10000 = ((Code)var12).bj;
                if (var10000) {
                    var10000 = ((Code)var12).bi;
                    if (var10000) {
                        if (((Code)var12).bh) {
                            var10000 = false;
                        }

                        if (var10000) {
                            if (((Code)var12).bg) {
                                var10000 = false;
                            }

                            if (var10000) {
                                var10000 = ((Code)var12).bf;
                                if (var10000 && var10000) {
                                    if (((Code)var12).be) {
                                        var10000 = false;
                                    }

                                    if (var10000 && var10000) {
                                        if (((Code)var12).bd) {
                                            var10000 = false;
                                        }

                                        if (var10000) {
                                            if (((Code)var12).bc) {
                                                var10000 = false;
                                            }

                                            if (var10000) {
                                                if (((Code)var12).bb) {
                                                    var10000 = false;
                                                }

                                                if (var10000) {
                                                    var10000 = ((Code)var12).ba;
                                                    if (var10000) {
                                                        if (((Code)var12).aZ) {
                                                            var10000 = false;
                                                        }

                                                        if (var10000) {
                                                            if (((Code)var12).aY) {
                                                                var10000 = false;
                                                            }

                                                            if (var10000 && var10000) {
                                                                if (((Code)var12).aX) {
                                                                    var10000 = false;
                                                                }

                                                                if (var10000) {
                                                                    if (((Code)var12).aW) {
                                                                        var10000 = false;
                                                                    }

                                                                    if (var10000) {
                                                                        if (((Code)var12).aV) {
                                                                            var10000 = false;
                                                                        }

                                                                        if (var10000) {
                                                                            if (((Code)var12).aU) {
                                                                                var10000 = false;
                                                                            }

                                                                            if (var10000) {
                                                                                if (((Code)var12).aT) {
                                                                                    var10000 = false;
                                                                                }

                                                                                if (var10000) {
                                                                                    if (((Code)var12).aS) {
                                                                                        var10000 = false;
                                                                                    }

                                                                                    if (var10000) {
                                                                                        if (((Code)var12).aR) {
                                                                                            var10000 = false;
                                                                                        }

                                                                                        if (var10000) {
                                                                                            if (((Code)var12).aQ) {
                                                                                                var10000 = false;
                                                                                            }

                                                                                            if (var10000) {
                                                                                                if (((Code)var12).aP) {
                                                                                                    var10000 = false;
                                                                                                }

                                                                                                if (var10000) {
                                                                                                    if (((Code)var12).aO) {
                                                                                                        var10000 = false;
                                                                                                    }

                                                                                                    if (var10000) {
                                                                                                        if (((Code)var12).aN) {
                                                                                                            var10000 = false;
                                                                                                        }

                                                                                                        if (var10000) {
                                                                                                            var10000 = ((Code)var12).aM;
                                                                                                            if (var10000) {
                                                                                                                var10000 = ((Code)var12).aH;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            int var17;
            if (var10000) {
                var17 = P;
                var4 = var9.I(var10);
                a(var17 + 4, var4);
                var4 = Code(var10);
            } else {
                var17 = P;
                var4 = var3;
                Code var14 = var11;
                char[] var16;
                J var10001;
                int var10003;
                int var10004;
                if ((var11.s(var3) & 2) != 0) {
                    char[] var6 = new char[var11.Code.length];
                    int var7 = 0;

                    for(int var8 = var11.p(var3); var8 < var14.q(var4); ++var8) {
                        if (!Code(var14.Code[var8])) {
                            var6[var7++] = var14.Code[var8];
                        }
                    }

                    var10001 = var14.I;
                    var16 = var6;
                    var10003 = 0;
                    var10004 = var7;
                } else {
                    var10001 = var11.I;
                    var16 = var11.Code;
                    var10003 = var11.p(var3);
                    var10004 = var11.r(var3);
                }

                var4 = var10001.Code(var16, var10003, var10004);
                a(var17 + 4, var4);
                var4 = I(var11.Code, var11.p(var3), var11.r(var3));
            }

            a(P, var4);
            var17 = P;
            var4 = ((Code)var11.Code.elementAt(var3)).bq;
            a(var17 + 2, var4);
            var4 = O;
            a(P + 1, var4);
            var17 = P;
            var4 = ((Code)var11.Code.elementAt(var3)).bk;
            a(var17 + 3, var4);
            var17 = P;
            var4 = var9.b();
            a(var17 + 5, var4);
            var17 = P;
            var4 = ((Code)var11.Code.elementAt(var3)).bm;
            a(var17 + 6, var4);
            var17 = P;
            var4 = var11.s(var3);
            a(var17 + 8, var4);
            e(P);
        }

        O = 0;
        P = 0;
        a(var0 = a(2, 45), l());
        int var15 = var11.Code - 1;
        var1 = (var15 | -var15) >>> 31 ^ 1;
        a(var0 + 1, var1);
        return var0;
    }

    private synchronized void d(Code var1) {
        this.J[0] = var1;

        for(int var2 = 1; var2 < this.bo; ++var2) {
            this.J[var2] = null;
        }

        this.bo = 1;
        this.aF = true;
        this.B = true;
        if (this.bn == 0) {
            this.notify();
        }

    }

    public final int c() {
        return this.aZ ? this.Code.getBaselinePosition() : a;
    }

    private int Code(DataInputStream var1) {
        byte[] var2 = new byte[4];

        for(int var3 = 4; var1 != null && !this.aF && var3 > 0; var3 -= var1.read(var2, 4 - var3, var3)) {
        }

        return Code((byte[])var2, (int)0);
    }

    private static int E() {
        if (am && k != null) {
            Object var0;
            synchronized(var0 = J){}
            byte[] var10000 = k;

            try {
                f(var10000.length / 3);

                for(int var1 = 0; var1 < k.length; var1 += 3) {
                    Z[S + var1 / 3] = k[var1];
                }

                int var4 = n();
                return var4;
            } finally {
                ;
            }
        } else {
            return 0;
        }
    }

    private static int A() {
        Throwable var12;
        label128: {
            byte[] var0 = null;
            int var1 = 0;
            Object var2;
            synchronized(var2 = J){}
            boolean var10001;
            if (m != null) {
                byte var10000 = 6;

                try {
                    byte[] var3 = new byte[var10000];
                    var0 = new byte[m.length];

                    for(int var4 = 0; var4 < m.length; ++var4) {
                        if ((m[var4] & 1) != 0) {
                            var0[var1++] = k[var4 * 3];
                            k[var4 * 3 + 1] = 0;
                            k[var4 * 3 + 2] = 0;
                            Code((byte[])var3, (int)k[var4 * 3], 0, m[var4]);
                            if (!Code(var4, var3)) {
                                break;
                            }
                        }
                    }
                } catch (Throwable var10) {
                    var12 = var10;
                    var10001 = false;
                    break label128;
                }
            }

            label107:
            try {
                aa();
                return var1 > 0 ? Z((byte[])var0, 0, var1) : 0;
            } catch (Throwable var9) {
                var12 = var9;
                var10001 = false;
                break label107;
            }
        }

        Throwable var11 = var12;
        throw var11;
    }

    private static synchronized void a(boolean var0) {
        bT = 0;
        if (var0 || j == null || j.length != 32) {
            Code var1 = new Code((short)0, false);
            Code = new Z(bQ);
            ab();
            bS = (6 + ((ac ^ 1) << 1)) * 17312;
            int var2;
            if (var0) {
                var2 = bS;
                Code.I();
                I(var2);
                Code.v(26);
            }

            if (!ac) {
                if (!var0 || D != null && E != null) {
                    var1.F(-516829686);
                    var1.F(950495394);
                } else {
                    ac = true;
                }
            }

            for(var2 = 0; var2 < 6; ++var2) {
                N(var2);
            }

            var1.a(Code.Code(), 0, Code.size());
            Code.reset();
            Code((char[])Z((int)5), (int)5);
            var1.a(Code.Code(), 0, Code.size());
            Code.reset();
            byte[] var8 = (System.getProperty("microedition.platform") + System.getProperty("device.software.version")).getBytes();
            var1.a(var8, 0, var8.length);
            var8 = new byte[32];
            var1.I(var8);
            if (!Code(var8, n) || Code(o, new byte[32])) {
                n = var8;
                char[] var6 = Z((int)6);
                Code var9 = new Code((short)0, false);
                byte[][] var3 = new byte[3][32];
                int var4 = 0;

                do {
                    for(int var5 = 0; var5 < 6; ++var5) {
                        N(var5);
                        Code(5 == var5 ? I() : var6, var5);
                        var9.a(Code.Code(), 0, Code.size());
                        Code.reset();
                    }

                    if (!ac) {
                        Code.write(a - 2);
                        Code.write(2);
                        Code((char[])var6, (int)6);
                        Code.write(a - 2);
                        Code.write(2);
                        Code((char[])var6, (int)7);
                        var9.a(Code.Code(), 0, Code.size());
                        Code.reset();
                    }

                    var9.I(o);
                    System.arraycopy(o, 0, var3[var4 % var3.length], 0, 32);
                    ++var4;
                } while(P && var4 <= 10 && (!Code(var3[0], var3[1]) || !Code(var3[0], var3[2])));

                I("md");
            }

            Code.write(o, 0, 32);
            if (var0) {
                int var7;
                for(var7 = 0; var7 < 6; ++var7) {
                    Code.write(var7 >> 8 & 255);
                    Code.write(var7 & 255);
                    N(var7);
                    O(var7);
                }

                if (!ac) {
                    for(var7 = 6; var7 < 8; ++var7) {
                        Code.write(var7 >> 8 & 255);
                        Code.write(var7 & 255);
                        Code.write(a - 2);
                        Code.write(2);
                        O(var7);
                    }
                }
            }

            j = Code.toByteArray();
            Code = null;
            if (var0) {
                Code.I();
                Code.v(27);
            }

        }
    }

    private static B Code(int param0, int param1, int param2, boolean param3) {
        // $FF: Couldn't be decompiled
    }

    public final char[] Code() {
        if (this.Code == null) {
            this.Code = this.I().toCharArray();
        }

        return this.Code;
    }

    private boolean b(int var1) {
        return var1 + 2 <= this.C && var1 + B(this.g, var1) <= this.C;
    }

    private static String B(int var0) {
        if (var0 == 1) {
            return "b1";
        } else {
            return var0 == 2 ? "sp" : null;
        }
    }

    private static boolean Code(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        return var0 < var4 + var6 && var0 + var2 > var4 && var1 < var5 + var7 && var1 + var3 > var5;
    }

    private static Class Code(String var0) {
        String var10000 = var0;

        try {
            return Class.forName(var10000);
        } finally {
            return null;
        }
    }

    public static void C(int var0) {
        Code var1;
        synchronized(var1 = A){}
        Code var10000 = A;
        int var10001 = var0;

        try {
            var10000.F(var10001);
        } finally {
            ;
        }

    }

    private static void I(DataInputStream var0, int var1) {
        while(var1-- > 0) {
            C(var0.readInt());
        }

    }

    private static byte[] B(int var0) {
        Object var1;
        synchronized(var1 = J){}
        if (k == null) {
            return null;
        } else {
            int var2 = -1;
            int var3 = 0;

            while(true) {
                int var10000 = var3;
                byte[] var10001 = k;

                Throwable var84;
                label1305: {
                    boolean var86;
                    label1297: {
                        label1296: {
                            try {
                                if (var10000 >= var10001.length) {
                                    break label1297;
                                }

                                if (k[var3] != (byte)var0) {
                                    break label1296;
                                }

                                var10000 = var3 / 3;
                            } catch (Throwable var78) {
                                var84 = var78;
                                var86 = false;
                                break label1305;
                            }

                            var2 = var10000;
                            break label1297;
                        }

                        var3 += 3;
                        continue;
                    }

                    if (var2 < 0) {
                        return null;
                    }

                    var0 = 0;

                    while(true) {
                        Code var85 = J;
                        String var88 = "mo";
                        int var10002 = var2 + 2;

                        label1315: {
                            byte[] var80;
                            byte var87;
                            try {
                                var87 = (var80 = var85.Code(var88, var10002))[0];
                            } catch (Throwable var75) {
                                var86 = false;
                                break label1315;
                            }

                            if (var87 != 1) {
                                return null;
                            }

                            byte[] var89 = var80;
                            byte var90 = 1;

                            try {
                                var87 = var89[var90];
                            } catch (Throwable var74) {
                                var86 = false;
                                break label1315;
                            }

                            if (var87 != 16) {
                                return null;
                            }

                            if (l == null) {
                                var89 = k;
                                int var91 = var2 * 3;

                                try {
                                    if (var89[var91] != var80[2] || k[var2 * 3 + 1] != var80[3] || k[var2 * 3 + 2] != var80[4]) {
                                        l = new byte[k.length];
                                        System.arraycopy(k, 0, l, 0, k.length);
                                    }
                                } catch (Throwable var77) {
                                    var86 = false;
                                    break label1315;
                                }
                            }

                            label1272: {
                                try {
                                    if (l != null) {
                                        l[var2 * 3] = var80[2];
                                        l[var2 * 3 + 1] = var80[3];
                                        l[var2 * 3 + 2] = var80[4];
                                    }

                                    m[var2] = var80[5];
                                    if (var80.length != 6) {
                                        break label1272;
                                    }

                                    var89 = new byte[0];
                                } catch (Throwable var76) {
                                    var86 = false;
                                    break label1315;
                                }

                                return var89;
                            }

                            label1258:
                            try {
                                a var4;
                                (var4 = new a()).Code(new DataInputStream(new ByteArrayInputStream(var80, 6, var80.length - 6)));
                                DataInputStream var81;
                                int var82 = Code((DataInput)(var81 = new DataInputStream(var4)));
                                int var5 = 0;

                                int var6;
                                do {
                                    if (var5 >= var82) {
                                        byte[] var83 = new byte[Code((DataInput)var81)];
                                        var81.readFully(var83);
                                        return var83;
                                    }

                                    if ((var81.read() & 255 & 128) == 0) {
                                        var6 = var81.readUnsignedShort();
                                        var5 += var6 + 3;
                                    } else {
                                        var6 = var81.readInt();
                                        var5 += var6 + 5;
                                    }
                                } while(var81.skipBytes(var6) >= var6);

                                throw new EOFException();
                            } catch (Throwable var73) {
                                var86 = false;
                                break label1258;
                            }
                        }

                        if (var0 >= aH) {
                            try {
                                W();
                                aa();
                            } catch (Throwable var71) {
                                var84 = var71;
                                var86 = false;
                                break;
                            }

                            return null;
                        }

                        var85 = Code;

                        try {
                            var85.I();
                            Code.J(var0 > 0);
                            Code.Z();
                            ++var0;
                        } catch (Throwable var72) {
                            var84 = var72;
                            var86 = false;
                            break;
                        }
                    }
                }

                Throwable var79 = var84;
                throw var79;
            }
        }
    }

    private static String g(String var0) {
        if ((var0 = System.getProperty(var0)) != null) {
            byte[] var1 = var0.getBytes();
            Code var2;
            synchronized(var2 = A){}
            Code var10000 = A;
            byte[] var10001 = var1;
            byte var10002 = 0;
            byte[] var10003 = var1;

            try {
                var10000.a(var10001, var10002, var10003.length);
            } finally {
                ;
            }
        }

        return var0;
    }

    private static Code Code(byte[] var0) {
        Code var1;
        synchronized(var1 = A){}
        int var10000 = bL++;

        try {
            C(var10000);
            A.I(var0);
            A.a(var0, 0, 32);
        } finally {
            ;
        }

        (var1 = new Code()).J(var0, 0);
        byte[] var2 = i;
        var1.B(var2, var2.length);
        var1.C(var0, 0);
        return var1;
    }

    private static boolean I(char var0) {
        return Z(var0) || J(var0);
    }

    private static DataInputStream Code(int var0) {
        DataInputStream var1 = new DataInputStream(Code("/t"));
        Code(var0, var1);
        return var1;
    }

    private static void W() {
        if (C < 3) {
            ++C;
            Y();
        }

    }

    private static boolean Code(int var0, byte[] var1) {
        Object var2;
        synchronized(var2 = J){}
        int var3 = -1;
        Code var10000 = J;
        String var10001 = "mo";
        byte var10002 = 1;

        byte[] var4;
        label372: {
            byte var36;
            try {
                if ((var4 = var10000.Code((String)var10001, (int)var10002)).length != 1) {
                    break label372;
                }

                var36 = var4[0];
            } finally {
                ;
            }

            var3 = var36;
        }

        if (var3 == -1) {
            String var37 = "mo";

            try {
                RecordStore.deleteRecordStore(var37);
            } finally {
                ;
            }
        }

        boolean var38;
        boolean var39;
        if (var0 < var3) {
            var10000 = J;
            var10001 = "mo";
            int var40 = var0 + 2;
            byte[] var10003 = var1;

            label359:
            try {
                var10000.Code(var10001, var40, var10003);
                var38 = true;
                return var38;
            } catch (Throwable var33) {
                var39 = false;
                break label359;
            }
        } else {
            label383: {
                try {
                    (var4 = new byte[1])[0] = (byte)(var0 + 1);
                    if (var3 == -1) {
                        var3 = 0;
                        J.Code("mo", var4);
                    } else {
                        J.Code((String)"mo", (int)1, (byte[])var4);
                    }

                    while(true) {
                        if (var3 >= var0) {
                            J.Code("mo", var1);
                            break;
                        }

                        J.Code("mo", new byte[0]);
                        ++var3;
                    }
                } catch (Throwable var34) {
                    var39 = false;
                    break label383;
                }

                var38 = true;
                return var38;
            }
        }

        boolean var10 = false;

        try {
            var10 = true;
            Y();
            W();
            var10 = false;
        } finally {
            if (var10) {
                ;
            }
        }

        return false;
    }

    private static void X() {
        Throwable var117;
        label1375: {
            Object var0;
            synchronized(var0 = J){}
            boolean var10001;
            Code var118;
            String var120;
            if (k == null || m == null) {
                String var10000 = "mo";

                try {
                    if (!a(var10000)) {
                        return;
                    }

                    byte var1 = 0;
                    var118 = J;
                    var120 = "mo";
                    byte var10002 = 1;

                    label1351: {
                        byte var119;
                        try {
                            byte[] var2;
                            if ((var2 = var118.Code((String)var120, (int)var10002)).length != 1) {
                                break label1351;
                            }

                            var119 = var2[0];
                        } finally {
                            ;
                        }

                        var1 = var119;
                    }

                    if (var1 == 0) {
                        Y();
                        return;
                    }

                    l = new byte[var1 * 3];
                    m = new byte[var1];
                } catch (Throwable var113) {
                    var117 = var113;
                    var10001 = false;
                    break label1375;
                }
            }

            int var114;
            try {
                if (l == null) {
                    l = new byte[k.length];
                    System.arraycopy(k, 0, l, 0, k.length);
                }

                var114 = 0;
            } catch (Throwable var108) {
                var117 = var108;
                var10001 = false;
                break label1375;
            }

            label1345:
            while(true) {
                int var121;
                int var122;
                try {
                    var121 = var114;
                    var122 = l.length / 3;
                } catch (Throwable var107) {
                    var117 = var107;
                    var10001 = false;
                    break;
                }

                if (var121 >= var122) {
                    try {
                        aa();
                    } catch (Throwable var105) {
                        var117 = var105;
                        var10001 = false;
                        break;
                    }

                    return;
                }

                int var115 = 0;

                while(true) {
                    var118 = J;
                    var120 = "mo";
                    int var123 = var114 + 2;

                    label1371: {
                        byte[] var3;
                        try {
                            if ((var3 = var118.Code(var120, var123))[0] != 1) {
                                Y();
                                return;
                            }
                        } catch (Throwable var111) {
                            var10001 = false;
                            break label1371;
                        }

                        byte[] var124 = var3;
                        byte var126 = 1;

                        try {
                            if (var124[var126] != 16) {
                                Y();
                                return;
                            }
                        } catch (Throwable var110) {
                            var10001 = false;
                            break label1371;
                        }

                        var124 = l;
                        var122 = var114 * 3;
                        byte[] var125 = var3;
                        byte var10003 = 2;

                        try {
                            var124[var122] = var125[var10003];
                            l[var114 * 3 + 1] = var3[3];
                            l[var114 * 3 + 2] = var3[4];
                            m[var114] = var3[5];
                        } catch (Throwable var109) {
                            var10001 = false;
                            break label1371;
                        }

                        ++var114;
                        break;
                    }

                    if (var115 >= aH) {
                        try {
                            W();
                            Y();
                            return;
                        } catch (Throwable var104) {
                            var117 = var104;
                            var10001 = false;
                            break label1345;
                        }
                    }

                    var118 = Code;
                    var10001 = var115 > 0;

                    try {
                        var118.J(var10001);
                        ++var115;
                    } catch (Throwable var106) {
                        var117 = var106;
                        var10001 = false;
                        break label1345;
                    }
                }
            }
        }

        Throwable var116 = var117;
        throw var116;
    }

    public final int I(String var1) {
        if (this.aZ) {
            return this.Code.stringWidth(var1);
        } else {
            int var6 = var1.length();
            String var2 = var1;
            Code var3 = this;
            int var4 = 0;
            var6 = Math.min(var6, var1.length());

            for(int var5 = 0; var5 < var6; ++var5) {
                var4 += var3.h[Code(var2.charAt(var5))];
            }

            return var4;
        }
    }

    public final int Code(char[] var1, int var2, int var3) {
        if (this.aZ) {
            return this.Code.charsWidth(var1, var2, var3);
        } else {
            var2 = var2;
            char[] var7 = var1;
            Code var4 = this;
            int var5 = 0;

            for(int var6 = var2 + var3; var2 < var6; ++var2) {
                var5 += var4.h[Code(var7[var2])];
            }

            return var5;
        }
    }

    public final void I(String var1, String var2) {
        int var3 = this.B.length;
        if (this.cs >= var3) {
            Code[] var5 = new Code[var3 + 5];

            for(int var4 = 0; var4 < this.cs; ++var4) {
                var5[var4] = this.B[var4];
            }

            this.B = var5;
        }

        this.B[this.cs++] = new Code(var1, var2);
    }

    public static int a(int var0) {
        return var0 >= 6 ? a : Code[var0].b();
    }

    private static void Code(char[] var0, int var1) {
        for(int var2 = 0; var2 < var0.length; ++var2) {
            Code.write(Math.max(0, Code(var1, var0[var2])));
        }

    }

    private static void aa() {
        Object var0;
        synchronized(var0 = J){}
        if (l != null) {
            k = l;
            l = null;
        }

    }

    private static void Y() {
        Object var0;
        synchronized(var0 = J){}
        k = null;
        l = null;
        m = null;
        String var10000 = "mo";

        try {
            RecordStore.deleteRecordStore(var10000);
        } finally {
            ;
        }

    }

    private static void N(int var0) {
        int var1 = Math.max(0, Code[var0].b() - (Code[var0].c() > 0 ? Code[var0].c() : Code[var0].b() - Code[var0].d()) - Code[var0].d());
        var0 = Code[var0].b() - var1;
        Code.write(var0);
        Code.write(var1);
    }

    private void ah() {
        switch(this.bn) {
            case 1:
                this.Q(2);
                return;
            case 2:
            case 3:
                this.Q(4);
                return;
            case 4:
                if (this.bh == this.bo) {
                    this.Q(3);
                    return;
                } else {
                    this.Q(1);
                }
            default:
        }
    }

    private void ar() {
        for(int var1 = 0; var1 < 3; ++var1) {
            this.B[var1] = 0;
        }

        this.ct = 0;
        this.cu = 0;
    }

    private static void ab() {
        if (!ac && (D == null || E == null)) {
            String var0;
            if ((var0 = B("language")) != null && var0.length() > 0 && k.indexOf(var0 + ",") >= 0) {
                ac = true;
                return;
            }

            int var10000;
            int var10001;
            label71: {
                try {
                    D = new Code(false, Z);
                    E = new Code(true, Z);
                    var10000 = D.b();
                    var10001 = Code(64, (int)0, 8).b();
                    break label71;
                } catch (OutOfMemoryError var3) {
                } finally {
                    ;
                }

                System.gc();
                ac = true;
                j = null;
                return;
            }

            if (var10000 >= var10001) {
                ac = true;
                E = null;
                D = null;
                return;
            }
        }

    }

    private static boolean a(char var0) {
        return (var0 & '\uf800') == 55296;
    }

    private static boolean Code(String var0, char var1, J var2) {
        B var3;
        Code var4 = (var3 = Code(Math.max(var2.Code(var1) / 2, 1), var2.a())).Code();
        int[] var5 = new int[var3.Code.getWidth() * var3.Code.getHeight()];
        int[] var6 = new int[var3.Code.getWidth() * var3.Code.getHeight()];
        var4.J(0, 0, var3.Code.getWidth(), var3.Code.getHeight(), 16777215);
        var4.Code(var0, 0, 0, var2, 0);
        var3.Code(var5, var3.Code.getWidth(), 0, 0, var3.Code.getWidth(), var3.Code.getHeight());
        var4.J(0, 0, var3.Code.getWidth(), var3.Code.getHeight(), 16777215);
        var4.Code(var1, var2);
        var3.Code(var6, var3.Code.getWidth(), 0, 0, var3.Code.getWidth(), var3.Code.getHeight());
        return var5 != var6 && (var5.length != var6.length || !Code((int[])var5, 0, (int[])var6, 0, var5.length));
    }

    private static boolean B(char var0) {
        return 1536 <= var0 && var0 <= 1791;
    }

    private static boolean Z(char var0) {
        return 1424 <= var0 && var0 <= 1535;
    }

    private static boolean C(char var0) {
        return 'ﭐ' <= var0 && var0 <= '\ufdff' || 'ﹰ' <= var0 && var0 <= '\ufefe';
    }

    private static int B(byte[] var0, int var1) {
        return ((var0[var1] & 255) << 8) + (var0[var1 + 1] & 255);
    }

    public static int Code(int var0, char[] var1, int var2, int var3) {
        if (var0 >= 6) {
            return Z(var0).Code(var1, var2, var3);
        } else {
            return !ao ? Code[var0].Code(var1, var2, var3) : I(var0, var1, var2, var3);
        }
    }

    private static int Code(int var0, char var1) {
        return var0 >= 6 ? Z(var0).Code(var1) : I(var0, var1);
    }

    private static String i(String var0) {
        if (az) {
            Code var1 = I;
            boolean var8;
            if (var0 != null) {
                String var10000 = "";
                String var10001 = var0;

                try {
                    if (!var10000.equals(var10001)) {
                        var1.b = var0;
                        return null;
                    }
                } catch (Throwable var7) {
                    var8 = false;
                    return null;
                }
            }

            try {
                var1.b = null;
                var1.b = var1.Z();
                if ((var0 = var1.b.J()) == null) {
                    var0 = "";
                }

                return "dialog:" + var0;
            } catch (Throwable var6) {
                var8 = false;
                return null;
            }
        } else {
            return null;
        }
    }

    private static char[] Code(byte[] var0, int var1, int var2) {
        int var3 = var1;
        byte[] var4 = var0;

        int var5;
        for(var5 = 0; var3 < var2; ++var5) {
            int var6 = y(var4[var3]);
            var3 += var6;
            if (var6 == 4) {
                ++var5;
            }
        }

        char[] var7 = new char[var5];

        for(int var8 = 0; var1 < var2; var1 += y(var0[var1])) {
            if ((var5 = C(var0, var1)) <= 65535) {
                var7[var8++] = (char)var5;
            } else {
                var7[var8++] = (char)('\ud800' | var5 - 65536 >> 10);
                var7[var8++] = (char)('\udc00' | var5 & 1023);
            }
        }

        return var7;
    }

    private static String h(String var0) {
        StringBuffer var1 = null;

        for(int var2 = 0; var2 < var0.length(); ++var2) {
            char var3 = var0.charAt(var2);
            if ('ﺀ' <= var3 && var3 <= 'ﻼ') {
                if (var1 == null) {
                    var1 = new StringBuffer(var0);
                }

                if (var3 < 'ﻵ') {
                    var1.setCharAt(var2, (char)(1536 + (255 & q[var3 - 'ﺀ'])));
                } else {
                    var1.setCharAt(var2, 'ل');
                    ++var2;
                    var1.insert(var2, (char)(1536 + (255 & p[var3 - 'ﻵ'])));
                }
            }
        }

        if (var1 == null) {
            return var0;
        } else {
            return var1.toString();
        }
    }

    private static int Code(int var0, String var1) {
        if (var0 >= 6) {
            return Z(var0).I(var1);
        } else {
            return !ao ? Code[var0].I(var1) : I(var0, var1.toCharArray(), 0, var1.length());
        }
    }

    private static int I(int var0, char var1) {
        if (ao && var1 != ' ' && var1 <= 2047) {
            if (I[var0][var1] != -1) {
                return I[var0][var1];
            } else {
                int var2 = Code[Code.length - 1].a();
                if (C == null) {
                    C = Code(32, (int)var2);
                }

                Code var3;
                (var3 = C.Code()).J(0, 0, 32, var2, 16777215);
                var3.Code(var1, Code[var0]);
                int[] var6 = new int[var2 << 5];
                C.Code(var6, 32, 0, 0, 32, var2);
                int var4 = var6[var6.length - 1];
                int var5 = 0;

                for(var2 = (var2 << 5) - 1; var2 >= 0; --var2) {
                    if (var6[var2] != var4) {
                        var5 = Math.max(var2 & 31, var5);
                        var2 &= -32;
                    }
                }

                return I[var0][var1] = (byte)(var5 + 2);
            }
        } else {
            return Code[var0].Code(var1);
        }
    }

    private static int x(int var0) {
        if (var0 <= 127) {
            return 1;
        } else if (var0 <= 2047) {
            return 2;
        } else {
            return var0 <= 65535 ? 3 : 4;
        }
    }

    private static int Code(int var0, byte[] var1, int var2) {
        if (var0 <= 127) {
            var1[var2] = (byte)var0;
            return 1;
        } else if (var0 <= 2047) {
            var1[var2++] = (byte)(192 | var0 >> 6);
            var1[var2] = (byte)(128 | var0 & 63);
            return 2;
        } else if (var0 <= 65535) {
            var1[var2++] = (byte)(224 | var0 >> 12);
            var1[var2++] = (byte)(128 | var0 >> 6 & 63);
            var1[var2] = (byte)(128 | var0 & 63);
            return 3;
        } else {
            var1[var2++] = (byte)(240 | var0 >> 18);
            var1[var2++] = (byte)(128 | var0 >> 12 & 63);
            var1[var2++] = (byte)(128 | var0 >> 6 & 63);
            var1[var2] = (byte)(128 | var0 & 63);
            return 4;
        }
    }

    private static char[] Z(int var0) {
        byte[] var4;
        char[] var1 = new char[(var4 = J(var0)).length / 2];
        int var2 = 0;

        for(int var3 = 0; var3 < var4.length; var3 += 2) {
            var1[var2++] = (char)(var4[var3] << 8 | var4[var3 + 1] & 255);
        }

        return var1;
    }

    private static char[] I() {
        char[] var0 = new char[bP + bR];
        char[] var1 = Z((int)8);
        int var2 = bP;

        for(char var3 = 0; var3 < var1.length; var3 = (char)(var3 + 2)) {
            for(char var4 = var1[var3]; var4 <= var1[var3 + 1]; var0[var2++] = var4++) {
            }
        }

        char[] var10000 = Z((int)7);
        int var7 = 0;
        char[] var8 = var0;
        int var9 = bP;
        char[] var10 = var0;
        int var5 = 0;

        for(char[] var6 = var10000; var5 < var6.length || var9 < var10.length; var8[var7++] = var9 == var10.length ? var6[var5++] : (var5 != var6.length && var6[var5] < var10[var9] ? var6[var5++] : var10[var9++])) {
        }

        return var0;
    }

    private static B Code(int var0, boolean var1) {
        byte[] var2 = J(var0);
        return Z.Code(var2, var2.length, var1);
    }

    private static boolean b(char var0) {
        return (var0 & 'ﰀ') == 56320;
    }

    private static int Code(char[] var0, boolean var1, int var2, int var3, J var4) {
        if (var4.Code(var0, 0, var0.length) <= var2) {
            return var1 ? var0.length : 0;
        } else {
            int var5 = 0;
            int var6 = var0.length;
            int var7;
            if (var1) {
                while(var6 > 0) {
                    var7 = var6 / 2;
                    if (var4.Code(var0, 0, var7) + var3 <= var2) {
                        break;
                    }

                    var6 = var7;
                }

                while(var6 > 0 && var4.Code(var0, 0, var6) + var3 > var2) {
                    --var6;
                }

                return var6;
            } else {
                while(var5 < var6) {
                    var7 = var5 + (var6 - var5) / 2 + 1;
                    if (var4.Code(var0, var7, var6 - var7) + var3 <= var2) {
                        break;
                    }

                    var5 = var7;
                }

                while(var5 < var6 && var4.Code(var0, var5, var6 - var5) + var3 > var2) {
                    ++var5;
                }

                return var5;
            }
        }
    }

    private static I Code(String var0) {
        Code var10000 = I;
        String var10001 = var0;
        boolean var10002 = true;
        byte var10003 = 3;

        try {
            Code var3;
            return (var3 = var10000.Code(var10001, var10002, var10003)).s() ? I.Code(var3.Code(0L)) : null;
        } finally {
            return null;
        }
    }

    private static a Code(String var0) {
        Code var10000 = I;
        String var10001 = var0;

        try {
            var10000 = var10000.Z(var10001) ? I.Code(var0, false, 3) : null;
            Code var3 = var10000;
            return var10000 != null ? a.Code(var3.Code(), (int)var3.Z()) : null;
        } finally {
            return null;
        }
    }

    private static int Code(String var0, int var1) {
        String var2 = I(var1);
        var0 = Code(var1, var0);
        Code var10000 = J;
        String var10001 = var2;
        String var10002 = var0;

        try {
            byte[] var5;
            if ((var5 = var10000.Code(var10001, var10002)) != null) {
                var1 = I(var5);
                return Z((byte[])var5, 0, var1);
            } else {
                return 0;
            }
        } finally {
            return 0;
        }
    }

    private static boolean Code(String var0, int var1) {
        String var2 = I(var1);
        var0 = Code(var1, var0);
        Code var10000 = J;
        String var10001 = var2;
        String var10002 = var0;
        boolean var4 = false;

        boolean var6;
        try {
            var4 = true;
            var6 = var10000.Code(var10001, var10002);
            var4 = false;
        } finally {
            if (var4) {
                return false;
            }
        }

        return var6;
    }

    private static int D() {
        if (az) {
            Code var10000 = I;

            try {
                int[] var0;
                if ((var0 = var10000.Code()) != null) {
                    Z(var0.length, var0.length);
                    int var1 = Code;

                    for(int var2 = 0; var2 < var0.length; ++var2) {
                        if (var0[var2] != 0) {
                            Code[var1++] = var0[var2];
                        }
                    }

                    return m();
                }
            } finally {
                ;
            }
        }

        return 0;
    }

    private static int J(Code var0) {
        int var1;
        boolean var10001;
        int var19;
        label199: {
            var0 = var0.C;
            if (az) {
                var1 = 0;

                while(var1 < 5) {
                    String var10000 = var0.o;

                    try {
                        int var2;
                        if ((var2 = (var10000.hashCode() ^ (new Long(System.currentTimeMillis())).hashCode()) % 100000000) < 0) {
                            var2 = -var2;
                        }

                        if (var2 == 0) {
                            ++var1;
                        } else {
                            String var3 = I.Code(var2, (int)16);
                            int var17;
                            if ((var17 = I.Code(var0.g, var3)) == 0) {
                                var19 = var2;
                                break label199;
                            }

                            if (var17 == 2) {
                                break;
                            }

                            Code var18 = I;
                            var18.I(var18.Z());
                            ++var1;
                        }
                    } catch (Throwable var15) {
                        var10001 = false;
                        return 0;
                    }
                }
            }

            try {
                var19 = 0;
            } catch (Throwable var14) {
                var10001 = false;
                return 0;
            }
        }

        try {
            int var16 = var19;
            if (var19 != 0) {
                Z(2, (int)2);
                var1 = Code;
                Code[var1++] = var16;
                Code[var1] = 16;
                return m();
            } else {
                return 0;
            }
        } catch (Throwable var13) {
            var10001 = false;
            return 0;
        }
    }

    private Code(int var1, short var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        this.aF = true;
        super();
    }

    private Code(String var1, String var2, boolean var3) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aI = true;
        this.aG = true;
        super();
        this.Code = (HttpConnection)Connector.open(var1, 3, var3);
        this.Code.setRequestMethod(var2);
    }

    public final void Code(String var1, String var2) {
        this.Code.setRequestProperty(var1, var2);
    }

    private static Vector I(String param0) {
        // $FF: Couldn't be decompiled
    }

    private static String h() {
        String var10000 = "s";
        boolean var3 = false;

        String var7;
        int var8;
        try {
            var3 = true;
            byte[] var0;
            if ((var0 = (byte[])Code(var10000).firstElement()) == null) {
                var3 = false;
                return null;
            }

            ByteArrayInputStream var5 = new ByteArrayInputStream(var0);
            int var1;
            DataInputStream var6;
            if ((var1 = (var6 = new DataInputStream(var5)).readUnsignedByte()) < 9) {
                Code((InputStream)var6, (int)5);
                var6.readUTF();
                Code((InputStream)var6, (int)6);
                if ((var7 = var6.readUTF()).length() == 64) {
                    return var7;
                }

                var3 = false;
                return null;
            }

            if (var1 != 9) {
                var3 = false;
                return null;
            }

            var8 = (var7 = var6.readUTF()).length();
            var3 = false;
        } finally {
            if (var3) {
                return null;
            }
        }

        if (var8 >= 64) {
            return var7;
        } else {
            return null;
        }
    }

    private static boolean B(int var0) {
        String var15;
        if ((var15 = B(var0)) != null) {
            RecordStore var1 = null;
            String var10000 = var15;
            boolean var11;
            boolean var10001 = var11 = false;

            int var17;
            try {
                var11 = true;
                var17 = (var1 = RecordStore.openRecordStore(var10000, var10001)).getNumRecords();
                var11 = false;
            } finally {
                if (var11) {
                    RecordStore var19 = var1;

                    try {
                        var19.closeRecordStore();
                    } finally {
                        ;
                    }
                }
            }

            boolean var16;
            RecordStore var18;
            if (var17 > 0) {
                var16 = true;
                var18 = var1;
            } else {
                var16 = false;
                var18 = var1;
            }

            try {
                var18.closeRecordStore();
                return var16;
            } finally {
                return var16;
            }
        } else {
            return false;
        }
    }

    private static int C(byte[] var0, int var1) {
        switch(y(var0[var1])) {
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

    private static boolean c(String var0) {
        String var10000 = var0;

        try {
            RecordStore.deleteRecordStore(var10000);
            return true;
        } finally {
            return false;
        }
    }

    public static int I(byte[] var0, int var1) {
        return ((var0[var1] & 255) << 16) + ((var0[var1 + 1] & 255) << 8) + (var0[var1 + 2] & 255);
    }

    private static String Code(byte[] var0, int var1) {
        int var2 = B(var0, var1);
        var1 += 2;
        return Code(var0, var1, var1 + var2);
    }

    private Code(int var1, int var2, int var3, int var4, int var5, int var6) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aM = true;
        super();
        this.bk = var1;
        this.a = var2;
        this.C = var3;
        this.bm = var4;
        this.br = var5;
        this.bq = var6;
    }

    private static boolean I(byte[] var0, int var1, int var2) {
        var2 += var1;

        while(var1 < var2) {
            int var3;
            switch((var0[var1] & 255) >> 4) {
                case 8:
                case 9:
                case 10:
                case 11:
                    return false;
                case 12:
                case 13:
                    if (var1 + 2 <= var2 && (var0[var1 + 1] & 192) == 128) {
                        if ((var0[var1++] & 31) < 2) {
                            return false;
                        }

                        ++var1;
                        break;
                    }

                    return false;
                case 14:
                    if (var1 + 3 <= var2 && (var0[var1 + 1] & 192) == 128 && (var0[var1 + 2] & 192) == 128) {
                        if ((var3 = (var0[var1++] & 15) << 12 | (var0[var1++] & 63) << 6 | var0[var1++] & 63) < 2048) {
                            return false;
                        }

                        if (!C(var3)) {
                            return false;
                        }
                        break;
                    }

                    return false;
                case 15:
                    if (var1 + 4 <= var2 && (var0[var1 + 1] & 192) == 128 && (var0[var1 + 2] & 192) == 128 && (var0[var1 + 3] & 192) == 128) {
                        if ((var0[var1] & 8) != 0) {
                            return false;
                        }

                        if ((var3 = (var0[var1++] & 7) << 18 | (var0[var1++] & 63) << 12 | (var0[var1++] & 63) << 6 | var0[var1++] & 63) < 65536) {
                            return false;
                        }

                        if (!C(var3)) {
                            return false;
                        }
                        break;
                    }

                    return false;
                default:
                    if (var0[var1++] == 0) {
                        return false;
                    }
            }
        }

        return true;
    }

    private static boolean I(byte[] var0, int var1, byte[] var2, int var3, int var4) {
        while(true) {
            if (var4-- > 0) {
                if (var0[var1++] == var2[var3++]) {
                    continue;
                }

                return false;
            }

            return true;
        }
    }

    private static int J(byte[] var0, int var1) {
        return (var0[var1] << 8) + (var0[var1 + 1] & 255);
    }

    public static int Code(byte[] var0, int var1) {
        return (var0[var1] << 24) + ((var0[var1 + 1] & 255) << 16) + ((var0[var1 + 2] & 255) << 8) + (var0[var1 + 3] & 255);
    }

    private void J(int var1, int var2, int var3, int var4, int var5) {
        if (var3 > 0 && var4 > 0 && Code(var1, var2, var3, var4, this.Code.getClipX(), this.Code.getClipY(), this.Code.getClipWidth(), this.Code.getClipHeight())) {
            this.Code.setColor(var5);
            if (aw) {
                this.Code.fillRect(var1, var2, var3 / 2, var4);
                this.Code.fillRect(var1 + var3 / 2, var2, var3 - var3 / 2, var4);
                return;
            }

            this.Code.fillRect(var1, var2, var3, var4);
        }

    }

    private static boolean Code(int[] var0, int var1, int[] var2, int var3, int var4) {
        while(true) {
            if (var4-- > 0) {
                if (var0[var1++] == var2[var3++]) {
                    continue;
                }

                return false;
            }

            return true;
        }
    }

    private static int y(int var0) {
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

    private void aj() {
        this.aM = true;
        this.aF = true;
        this.ak();
    }

    private Code(Code var1, boolean var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aN = true;
        super();
        this.H = var1;
    }

    private Code(int var1, String var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aO = true;
        super();
        this.bo = -1;
        this.B = true;
        this.Code = new Thread[2];
        b.put(new Integer(var1), this);
        this.bl = var1;
        this.b = var2;
    }

    private static synchronized int d(String var0) {
        int var1 = ++ch;
        new Code(var1, var0);
        return var1;
    }

    private static Code J(int var0) {
        return (Code)b.get(new Integer(var0));
    }

    private void Code(String var1, String var2, boolean var3, int var4) {
        this.c = var1;
        this.d = var2;
        this.B = var3 ^ true;
        this.C = var4;
        this.aM = false;
        this.a = 0;
        Thread[] var7;
        synchronized(var7 = this.Code){}
        Thread[] var10000 = this.Code;
        byte var10001 = 0;

        try {
            if (var10000[var10001] == null) {
                this.Code[0] = new Thread(this);
                this.Code[0].start();
            } else if (this.Code[1] == null) {
                this.Code[1] = new Thread(this);
                this.Code[1].start();
            }
        } finally {
            ;
        }

    }

    private void ae() {
        Thread[] var1;
        synchronized(var1 = this.Code){}
        Thread[] var10000 = this.Code;
        byte var10001 = 0;
        Thread[] var10002 = this.Code;
        byte var10003 = 1;

        try {
            var10000[var10001] = var10002[var10003];
            this.Code[1] = null;
        } finally {
            ;
        }

    }

    private int P(int var1) {
        return var1 * v() / this.cj;
    }

    private void Q(int var1) {
        int var2 = this.bl;
        Code var10000 = Code;

        try {
            var10000.I();
            I(var2);
            I(var1);
            Code.v(28);
            V();
        } finally {
            return;
        }
    }

    private void al() {
        this.aH = false;
        I.Code(this.b);
    }

    private void Code(Image var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = var1.getWidth();
        int var9 = var1.getHeight();
        if (var6 == 0 && var7 == 0 && var4 == var8 && var5 == var9) {
            this.Code.drawImage(var1, var2, var3, 20);
        } else {
            int var10 = this.Code.getClipX();
            int var11 = this.Code.getClipY();
            int var12 = this.Code.getClipWidth();
            int var13 = this.Code.getClipHeight();
            int var14 = Math.max(var10, var2);
            int var15 = Math.max(var11, var3);
            int var16 = Math.min(var10 + var12, var2 + var4) - var14;
            int var17 = Math.min(var11 + var13, var3 + var5) - var15;
            this.J(var14, var15, var16, var17);
            var2 -= var6;
            var3 -= var7;
            var4 += var6;
            var5 += var7;
            var4 = Math.min(var2 + var4, var14 + var16);
            var5 = Math.min(var3 + var5, var15 + var17);
            var2 = var14 - (var14 - var2) % var8;

            for(var3 = var15 - (var15 - var3) % var9; var3 < var5; var3 += var9) {
                for(var6 = var2; var6 < var4; var6 += var8) {
                    this.Code.drawImage(var1, var6, var3, 20);
                }
            }

            this.J(var10, var11, var12, var13);
        }
    }

    public Code(FileConnection var1) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aP = true;
        super();
        this.Code = var1;
    }

    private synchronized void b(Code var1) {
        for(int var2 = 0; var2 < this.bo; ++var2) {
            if (this.J[var2] == var1) {
                this.J[var2] = this.J[--this.bo];
                this.J[this.bo] = null;
                if (var2 == 0) {
                    this.aF = false;
                    return;
                }
                break;
            }
        }

    }

    private void Code(B var1, int var2, int var3) {
        if (Code(var2, var3, var1.Code.getWidth(), var1.Code.getHeight(), this.Code.getClipX(), this.Code.getClipY(), this.Code.getClipWidth(), this.Code.getClipHeight())) {
            this.Code.drawImage(((B)var1).Code, var2, var3, 20);
        }

    }

    private void Code(B var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        if (var4 > 0 && var5 > 0 && Code(var6, var7, var4, var5, this.Code.getClipX(), this.Code.getClipY(), this.Code.getClipWidth(), this.Code.getClipHeight())) {
            this.Code.drawRegion(((B)var1).Code, var2, var3, var4, var5, 0, var6, var7, 20);
        }

    }

    private void I(B var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        this.Code(((B)var1).Code, var2, var3, var4, var5, var6, var7);
    }

    private void B(int var1, int var2, int var3, int var4) {
        int var5 = this.Code.getClipX();
        int var6 = this.Code.getClipY();
        int var7 = this.Code.getClipWidth();
        int var8 = this.Code.getClipHeight();
        if (Code(var1, var2, var3, var4, var5, var6, var7, var8)) {
            this.Code.setClip(Math.max(var1, var5), Math.max(var2, var6), var1 < var5 ? (var1 + var3 > var5 + var7 ? var7 : var1 + var3 - var5) : (var5 + var7 > var1 + var3 ? var3 : var5 + var7 - var1), var2 < var6 ? (var2 + var4 > var6 + var8 ? var8 : var2 + var4 - var6) : (var6 + var8 > var2 + var4 ? var4 : var6 + var8 - var2));
        } else {
            this.Code.setClip(0, 0, 0, 0);
        }
    }

    private void I(B var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        Image var18 = ((B)var1).Code;
        if (var8 == var4 && var9 == var5) {
            this.Code.drawRegion(var18, var2, var3, var4, var5, 0, var6, var7, 20);
        } else {
            int var10 = this.Code.getClipX();
            int var11 = this.Code.getClipY();
            int var12 = this.Code.getClipWidth();
            int var13 = this.Code.getClipHeight();
            int var14 = Math.max(var10, var6);
            int var15 = Math.max(var11, var7);
            int var16 = Math.min(var10 + var12, var6 + var8) - var14;
            int var17 = Math.min(var11 + var13, var7 + var9) - var15;
            this.J(var14, var15, var16, var17);
            var8 = Math.min(var6 + var8, var14 + var16);
            var9 = Math.min(var7 + var9, var15 + var17);
            var6 = var14 - (var14 - var6) % var4;

            for(var7 = var15 - (var15 - var7) % var5; var7 < var9; var7 += var5) {
                for(var14 = var6; var14 < var8; var14 += var4) {
                    this.Code.drawRegion(var18, var2, var3, var4, var5, 0, var14, var7, 20);
                }
            }

            this.J(var10, var11, var12, var13);
        }
    }

    private void J(int var1, int var2, int var3, int var4) {
        this.Code.setClip(var1, var2, var3, var4);
    }

    private void Z(int var1, int var2, int var3, int var4, int var5) {
        this.Code.setColor(var5);
        this.Code.drawLine(var1, var2, var3, var4);
    }

    public final int Code(Code var1) {
        return this.cq - var1.cq;
    }

    private void Code(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = this.Code.getClipX();
        int var9 = this.Code.getClipY();
        int var10 = this.Code.getClipWidth();
        int var11 = this.Code.getClipHeight();
        int var12 = Math.max(var8, var4);
        int var13 = Math.max(var9, var5);
        var6 = Math.min(var8 + var10, var4 + var6) - var12;
        var7 = Math.min(var9 + var11, var5 + var7) - var13;
        if (var6 > 0 && var7 > 0) {
            var2 += var12 - var4 + (var13 - var5) * var3;
            this.Code.drawRGB(var1, var2, var3, var12, var13, var6, var7, true);
        }

    }

    private void B(int var1, int var2, int var3, int var4, int var5) {
        int var6;
        if ((var6 = var5 >>> 24) != 0) {
            if (var6 >= 254) {
                this.J(var1, var2, var3, var4, var5);
            } else if (V) {
                if (var3 > 0 && var4 > 0 && Code(var1, var2, var3, var4, this.Code.getClipX(), this.Code.getClipY(), this.Code.getClipWidth(), this.Code.getClipHeight())) {
                    if (ci != var5) {
                        ci = var5;

                        for(var6 = 0; var6 < p.length; ++var6) {
                            p[var6] = var5;
                        }

                        if (av) {
                            if (q == null) {
                                q = new int[256];

                                for(var5 = 0; var5 < q.length; ++var5) {
                                    q[var5] = -1;
                                }
                            }

                            Z.Code(q, 16, 16, false, false);
                        }

                        if (!ar) {
                            Code = Image.createRGBImage(p, 16, 16, true);
                        }
                    }

                    if (ar) {
                        var5 = this.Code.getClipX();
                        var6 = this.Code.getClipY();
                        int var7 = this.Code.getClipWidth();
                        int var8 = this.Code.getClipHeight();
                        this.B(var1, var2, var3, var4);

                        for(int var9 = var2; var9 < var2 + var4; var9 += 16) {
                            for(int var10 = var1; var10 < var1 + var3; var10 += 16) {
                                this.Code((int[])p, 0, 16, var10, var9, 16, 16);
                            }
                        }

                        this.J(var5, var6, var7, var8);
                        return;
                    }

                    this.Code((Image)Code, var1, var2, var3, var4, 0, 0);
                }

            }
        }
    }

    private void Code(String var1, int var2, int var3, J var4, int var5) {
        boolean var10000 = var4 instanceof Code;
        if (var4 instanceof Code) {
            var10000 = ((Code)var4).bj;
            if (var10000) {
                var10000 = ((Code)var4).bi;
                if (var10000) {
                    if (((Code)var4).bh) {
                        var10000 = false;
                    }

                    if (var10000) {
                        if (((Code)var4).bg) {
                            var10000 = false;
                        }

                        if (var10000) {
                            var10000 = ((Code)var4).bf;
                            if (var10000 && var10000) {
                                if (((Code)var4).be) {
                                    var10000 = false;
                                }

                                if (var10000 && var10000) {
                                    if (((Code)var4).bd) {
                                        var10000 = false;
                                    }

                                    if (var10000) {
                                        if (((Code)var4).bc) {
                                            var10000 = false;
                                        }

                                        if (var10000) {
                                            if (((Code)var4).bb) {
                                                var10000 = false;
                                            }

                                            if (var10000) {
                                                var10000 = ((Code)var4).ba;
                                                if (var10000) {
                                                    if (((Code)var4).aZ) {
                                                        var10000 = false;
                                                    }

                                                    if (var10000) {
                                                        if (((Code)var4).aY) {
                                                            var10000 = false;
                                                        }

                                                        if (var10000 && var10000) {
                                                            if (((Code)var4).aX) {
                                                                var10000 = false;
                                                            }

                                                            if (var10000) {
                                                                if (((Code)var4).aW) {
                                                                    var10000 = false;
                                                                }

                                                                if (var10000) {
                                                                    if (((Code)var4).aV) {
                                                                        var10000 = false;
                                                                    }

                                                                    if (var10000) {
                                                                        if (((Code)var4).aU) {
                                                                            var10000 = false;
                                                                        }

                                                                        if (var10000) {
                                                                            if (((Code)var4).aT) {
                                                                                var10000 = false;
                                                                            }

                                                                            if (var10000) {
                                                                                if (((Code)var4).aS) {
                                                                                    var10000 = false;
                                                                                }

                                                                                if (var10000) {
                                                                                    if (((Code)var4).aR) {
                                                                                        var10000 = false;
                                                                                    }

                                                                                    if (var10000) {
                                                                                        if (((Code)var4).aQ) {
                                                                                            var10000 = false;
                                                                                        }

                                                                                        if (var10000) {
                                                                                            if (((Code)var4).aP) {
                                                                                                var10000 = false;
                                                                                            }

                                                                                            if (var10000) {
                                                                                                if (((Code)var4).aO) {
                                                                                                    var10000 = false;
                                                                                                }

                                                                                                if (var10000) {
                                                                                                    if (((Code)var4).aN) {
                                                                                                        var10000 = false;
                                                                                                    }

                                                                                                    if (var10000) {
                                                                                                        if (((Code)var4).aM) {
                                                                                                            var10000 = false;
                                                                                                        }

                                                                                                        if (var10000) {
                                                                                                            var10000 = ((Code)var4).aL;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (!var10000) {
            this.Code.setColor(var5);
            this.Code.setFont(((Code)var4).Code);
            this.Code.drawString(var1, var2, var3, 20);
        } else {
            Code var16 = (Code)var4;
            int var10003 = var2;
            var2 = var3;
            var3 = var10003;
            String var14 = var1;
            Code var15 = this;
            Code var6 = var16;
            int var7;
            if ((var7 = var1.length()) != 0) {
                int var8 = this.Code.getClipX();
                int var9 = this.Code.getClipY();
                int var10 = this.Code.getClipWidth();
                int var11 = this.Code.getClipHeight();
                var6.P(var5);
                int var13 = 0;

                while(var13 < var7) {
                    int var12 = var6.Code(var15, var14.charAt(var13), var3, var2);
                    if (var3 + var12 > 2147483647) {
                        var12 = Math.max(2147483647, var8);
                        var15.J(var12, var9, var10 + var8 - var12, var11);
                        --var13;
                        ++var13;
                    } else {
                        var3 += var12;
                        ++var13;
                    }
                }

                var15.J(var8, var9, var10, var11);
            }

        }
    }

    private void Code(char[] var1, int var2, int var3, int var4, int var5, J var6, int var7) {
        boolean var10000 = var6 instanceof Code;
        if (var6 instanceof Code) {
            var10000 = ((Code)var6).bj;
            if (var10000) {
                var10000 = ((Code)var6).bi;
                if (var10000) {
                    if (((Code)var6).bh) {
                        var10000 = false;
                    }

                    if (var10000) {
                        if (((Code)var6).bg) {
                            var10000 = false;
                        }

                        if (var10000) {
                            var10000 = ((Code)var6).bf;
                            if (var10000 && var10000) {
                                if (((Code)var6).be) {
                                    var10000 = false;
                                }

                                if (var10000 && var10000) {
                                    if (((Code)var6).bd) {
                                        var10000 = false;
                                    }

                                    if (var10000) {
                                        if (((Code)var6).bc) {
                                            var10000 = false;
                                        }

                                        if (var10000) {
                                            if (((Code)var6).bb) {
                                                var10000 = false;
                                            }

                                            if (var10000) {
                                                var10000 = ((Code)var6).ba;
                                                if (var10000) {
                                                    if (((Code)var6).aZ) {
                                                        var10000 = false;
                                                    }

                                                    if (var10000) {
                                                        if (((Code)var6).aY) {
                                                            var10000 = false;
                                                        }

                                                        if (var10000 && var10000) {
                                                            if (((Code)var6).aX) {
                                                                var10000 = false;
                                                            }

                                                            if (var10000) {
                                                                if (((Code)var6).aW) {
                                                                    var10000 = false;
                                                                }

                                                                if (var10000) {
                                                                    if (((Code)var6).aV) {
                                                                        var10000 = false;
                                                                    }

                                                                    if (var10000) {
                                                                        if (((Code)var6).aU) {
                                                                            var10000 = false;
                                                                        }

                                                                        if (var10000) {
                                                                            if (((Code)var6).aT) {
                                                                                var10000 = false;
                                                                            }

                                                                            if (var10000) {
                                                                                if (((Code)var6).aS) {
                                                                                    var10000 = false;
                                                                                }

                                                                                if (var10000) {
                                                                                    if (((Code)var6).aR) {
                                                                                        var10000 = false;
                                                                                    }

                                                                                    if (var10000) {
                                                                                        if (((Code)var6).aQ) {
                                                                                            var10000 = false;
                                                                                        }

                                                                                        if (var10000) {
                                                                                            if (((Code)var6).aP) {
                                                                                                var10000 = false;
                                                                                            }

                                                                                            if (var10000) {
                                                                                                if (((Code)var6).aO) {
                                                                                                    var10000 = false;
                                                                                                }

                                                                                                if (var10000) {
                                                                                                    if (((Code)var6).aN) {
                                                                                                        var10000 = false;
                                                                                                    }

                                                                                                    if (var10000) {
                                                                                                        if (((Code)var6).aM) {
                                                                                                            var10000 = false;
                                                                                                        }

                                                                                                        if (var10000) {
                                                                                                            var10000 = ((Code)var6).aL;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (var10000) {
            ((Code)var6).Code(this, var1, var2, var3, var4, var5, var7);
        } else {
            this.Code.setColor(var7);
            this.Code.setFont(((Code)var6).Code);
            this.Code.drawChars(var1, var2, var3, var4, var5, 20);
        }
    }

    private void Code(char var1, J var2) {
        boolean var10000 = var2 instanceof Code;
        if (var2 instanceof Code) {
            var10000 = ((Code)var2).bj;
            if (var10000) {
                var10000 = ((Code)var2).bi;
                if (var10000) {
                    if (((Code)var2).bh) {
                        var10000 = false;
                    }

                    if (var10000) {
                        if (((Code)var2).bg) {
                            var10000 = false;
                        }

                        if (var10000) {
                            var10000 = ((Code)var2).bf;
                            if (var10000 && var10000) {
                                if (((Code)var2).be) {
                                    var10000 = false;
                                }

                                if (var10000 && var10000) {
                                    if (((Code)var2).bd) {
                                        var10000 = false;
                                    }

                                    if (var10000) {
                                        if (((Code)var2).bc) {
                                            var10000 = false;
                                        }

                                        if (var10000) {
                                            if (((Code)var2).bb) {
                                                var10000 = false;
                                            }

                                            if (var10000) {
                                                var10000 = ((Code)var2).ba;
                                                if (var10000) {
                                                    if (((Code)var2).aZ) {
                                                        var10000 = false;
                                                    }

                                                    if (var10000) {
                                                        if (((Code)var2).aY) {
                                                            var10000 = false;
                                                        }

                                                        if (var10000 && var10000) {
                                                            if (((Code)var2).aX) {
                                                                var10000 = false;
                                                            }

                                                            if (var10000) {
                                                                if (((Code)var2).aW) {
                                                                    var10000 = false;
                                                                }

                                                                if (var10000) {
                                                                    if (((Code)var2).aV) {
                                                                        var10000 = false;
                                                                    }

                                                                    if (var10000) {
                                                                        if (((Code)var2).aU) {
                                                                            var10000 = false;
                                                                        }

                                                                        if (var10000) {
                                                                            if (((Code)var2).aT) {
                                                                                var10000 = false;
                                                                            }

                                                                            if (var10000) {
                                                                                if (((Code)var2).aS) {
                                                                                    var10000 = false;
                                                                                }

                                                                                if (var10000) {
                                                                                    if (((Code)var2).aR) {
                                                                                        var10000 = false;
                                                                                    }

                                                                                    if (var10000) {
                                                                                        if (((Code)var2).aQ) {
                                                                                            var10000 = false;
                                                                                        }

                                                                                        if (var10000) {
                                                                                            if (((Code)var2).aP) {
                                                                                                var10000 = false;
                                                                                            }

                                                                                            if (var10000) {
                                                                                                if (((Code)var2).aO) {
                                                                                                    var10000 = false;
                                                                                                }

                                                                                                if (var10000) {
                                                                                                    if (((Code)var2).aN) {
                                                                                                        var10000 = false;
                                                                                                    }

                                                                                                    if (var10000) {
                                                                                                        if (((Code)var2).aM) {
                                                                                                            var10000 = false;
                                                                                                        }

                                                                                                        if (var10000) {
                                                                                                            var10000 = ((Code)var2).aL;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (var10000) {
            Code var3;
            (var3 = (Code)var2).P(0);
            var3.Code((Code)this, (char)var1, 0, 0);
        } else {
            this.Code.setColor(0);
            this.Code.setFont(((Code)var2).Code);
            this.Code.drawChar(var1, 0, 0, 20);
        }
    }

    public Code(Graphics var1) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aQ = true;
        super();
        this.Code = var1;
    }

    private synchronized void c(Code var1) {
        if (!this.aF) {
            int var2;
            for(var2 = 0; var2 < this.bo && this.J[var2] != var1; ++var2) {
            }

            if (var2 == this.bo) {
                if (this.bo == this.J.length) {
                    this.J[this.bo - 1] = var1;
                } else {
                    this.J[this.bo++] = var1;
                }
            }
        }

        this.B = true;
        if (this.bn == 0) {
            this.notify();
        }

    }

    private synchronized void an() {
        ++this.bn;
    }

    public final void Code(Graphics var1) {
        this.Code = var1;
    }

    private synchronized void am() {
        while(this.bn > 0 || this.bo == 0 && this.C == null) {
            this.wait();
        }

        this.B = false;
        if (this.bo > 0 && (this.aF || this.C == null)) {
            this.C = this.J[0];
            this.J[0] = this.J[--this.bo];
            this.J[this.bo] = null;
            this.aF = false;
        }

    }

    private synchronized void ao() {
        --this.bn;
        if (this.bn == 0 && this.B) {
            this.notify();
        }

    }

    private Code(boolean var1, char var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aS = true;
        super();
        this.g = new int[3];
        this.I = new int[3];
        this.t = new int[3];
        this.u = new int[3];
        this.v = new int[3];
        this.w = new int[3];
        this.Z = new byte[3][];
        this.y = new int[6];
        this.I = new int[16][];
        this.Z = new int[16][];
        this.Code = new short[16][];
        this.J = new byte[16][];
        this.B = new byte[16][];
        this.B = new short[3];
        this.z = new int[3];
        this.J = new int[4][];
        this.cv = -1;
        ap();
        this.bh = 0;
        this.a = 0;
        this.bm = 0;
        this.cn = 0;

        for(int var3 = 0; var3 < 3; ++var3) {
            this.Z[var3] = null;
            this.I[var3] = null;
            this.Z[var3] = null;
            this.Code[var3] = null;
            this.J[var3] = null;
            this.B[var3] = null;
        }

    }

    private int e(int var1, int var2) {
        int var3 = var2 - 1;
        if ((var2 = this.z(var2)) < 0) {
            return var2;
        } else {
            while(var3 < 16 && var2 > this.I[var1][var3]) {
                ++var3;
                int var4;
                if ((var4 = this.z(1)) < 0) {
                    return var4;
                }

                var2 = var2 << 1 | var4;
            }

            var2 = this.Code[var1][var3] + (var2 - this.Z[var1][var3]);
            return this.J[var1][var2] & 255;
        }
    }

    private int z(int var1) {
        if (var1 == 0) {
            return 0;
        } else {
            if (this.cu < var1) {
                this.as();
                if (this.cu < var1) {
                    return -2;
                }
            }

            int var2 = this.ct >>> 32 - var1;
            this.ct <<= var1;
            this.cu -= var1;
            return var2;
        }
    }

    private int A(int var1) {
        if (this.cu < 8) {
            this.as();
            if (this.cu < 8) {
                return this.e(var1, 1);
            }
        }

        int var2 = this.ct >>> 24;
        byte var3;
        if ((var3 = this.B[var1][var2]) <= 8) {
            this.ct <<= var3;
            this.cu -= var3;
            return this.B[var1][var2 + 256] & 255;
        } else {
            return this.e(var1, 9);
        }
    }

    private Code(byte[] var1) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aU = true;
        super();
        this.g = new byte[256];

        int var2;
        for(var2 = 0; var2 < 256; ++var2) {
            this.g[var2] = (byte)var2;
        }

        var2 = 0;
        int var3 = 0;

        for(int var4 = 0; var4 < 256; ++var4) {
            var3 = var1[var2] + this.g[var4] + var3 & 255;
            byte var5 = this.g[var4];
            this.g[var4] = this.g[var3];
            this.g[var3] = var5;
            var2 = (var2 + 1) % 32;
        }

    }

    private synchronized int Code(Object var1, J var2, int var3) {
        int[] var4 = (int[])((Object[])var1)[2];
        this.cD = var4[var3];
        this.aA();
        return var2.I(this.j());
    }

    public final String I() {
        if (this.c == null) {
            int var1 = this.cq + 17;
            int var2 = this.C.F(var1++);

            while(var2 > 0) {
                if (this.C.F(var1++) == 114) {
                    this.B = true;
                    var1 += 2;
                    --var2;
                } else {
                    var1 += this.C.E(var1) + 2;
                    --var2;
                }
            }

            this.c = this.C.a(var1);
        }

        return this.c;
    }

    private static int Code(int var0, Object var1) {
        return var1 != null ? Code(var0, 1, (Object)var1) : 0;
    }

    public final int b() {
        return this.aZ ? this.a() + this.Code + this.I : a;
    }

    private void d(byte[] var1, int var2, int var3) {
        for(int var4 = 0; var4 < var3; ++var4) {
            this.cq = this.cq + 1 & 255;
            this.cv = this.g[this.cq] + this.cv & 255;
            byte var5 = this.g[this.cq];
            this.g[this.cq] = this.g[this.cv];
            this.g[this.cv] = var5;
            var1[var2 + var4] ^= this.g[this.g[this.cq] + this.g[this.cv] & 255];
        }

    }

    public final int J() {
        return this.cv;
    }

    public final Code J() {
        return this.C.I(this.cq, this.cv, this.cn);
    }

    public final int Z() {
        return this.cq;
    }

    public final int B() {
        return this.cn;
    }

    public final int C() {
        return this.C.E(this.cq + 15);
    }

    private int F() {
        return this.C.E(this.cq + 6);
    }

    private int G() {
        return this.C.D(this.cq + 8);
    }

    private synchronized Object Z(int var1) {
        this.T(var1);
        this.cD += 15;
        this.O();
        int var2 = this.O();
        String var3 = this.j();
        String var4 = this.j();
        this.cD = this.L();
        int var5;
        int[] var6 = new int[var5 = this.L()];

        for(int var7 = 0; var7 < var5; ++var7) {
            var6[var7] = this.cD;
            this.aA();
            this.aA();
        }

        if (this.K.J.containsKey(var3)) {
            var4 = (String)this.K.J.get(var3);
        }

        Hashtable var8 = new Hashtable();
        Integer var9 = new Integer(Code(var8, var4));
        return new Object[]{this, new Integer(var1), var6, var8, new Boolean((boolean)((var2 & 4 | -(var2 & 4)) >>> 31)), var9};
    }

    private synchronized int Z(int var1, char var2) {
        this.cD = var1 + 1;
        this.cD += 10 * this.O();
        this.cD += this.N();

        for(var1 = this.O(); var1 > 0; --var1) {
            if (this.O() == var2) {
                return this.cD;
            }

            this.cD += this.N();
        }

        return 0;
    }

    private boolean d(int var1) {
        var1 += 17;

        for(int var2 = this.F(var1++); var2 > 0; --var2) {
            if (this.F(var1++) == 116 && this.a(var1).equals("s")) {
                return true;
            }

            var1 += this.E(var1) + 2;
        }

        return false;
    }

    private synchronized int d(int var1, int var2, int var3) {
        var3 = G(var3);
        var1 = this.Z(Code, Code, var3, var1);
        d(2 * this.K.J.size() + 4);
        String var6 = "x";
        e(Code("x"));
        e(Code(String.valueOf(var2)));
        String var5 = "y";
        e(Code("y"));
        e(Code(String.valueOf(var1)));
        Enumeration var4 = this.K.J.keys();

        while(var4.hasMoreElements()) {
            if (!(var5 = (String)var4.nextElement()).startsWith("o:")) {
                e(Code(e(var5)));
                e(Code(e(this.K.J.get(var5).toString())));
            }
        }

        return l();
    }

    private Code(Code var1, Code var2, boolean var3, boolean var4) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.bc = true;
        super();
        this.bl = 1;
        this.u = new int[5];
        this.B = new Hashtable();
        this.Code = new Vector();
        this.N = new Code((byte)0, false);
        this.aE = true;
        this.J = null;
        if (var2 != null) {
            this.C = var2;
            this.L = var2.N;
        }

        this.K = var1;
        this.aY = var3;
        this.aP = var4;
        this.cs = var1.I[80];
        if (var2 != null && this.cs != var2.cs) {
            var2.d(true);
        }

    }

    private void aA() {
        this.cD += this.N();
    }

    private boolean Z(Code var1) {
        return Code(this.cn, this.G(), var1.cn, var1.G());
    }

    public final boolean I(Code var1) {
        return Code(this.cv, this.cn, this.F(), this.G(), var1.cv, var1.cn, var1.F(), var1.G());
    }

    private int Code(boolean var1) {
        return this.I().length() - this.I(var1);
    }

    private void J(String var1) {
        String var3 = "odp:component";
        int var4 = "odp:component".length();
        int var2 = var1.length() == var4 + 2 && var1.startsWith(var3) ? (var1.charAt(var4) - 65) * 26 + (var1.charAt(var4 + 1) - 65) : -1;
        this.aV = var2 < 0;
        int var36 = 0;

        Code var10000;
        while(var36 <= 4) {
            label563: {
                boolean var37;
                if (!this.aV) {
                    var10000 = this;
                    int var10001 = var2;

                    try {
                        var10000.g = B(var10001);
                    } catch (Throwable var35) {
                        var37 = false;
                        break label563;
                    }
                } else {
                    try {
                        this.g = I.Code(var1);
                    } catch (Throwable var34) {
                        var37 = false;
                        break label563;
                    }
                }

                label557:
                try {
                    if (this.g == null) {
                        if (this.aV) {
                            Code.I();
                            Code.v(5);
                        }

                        this.K.D(7);
                        return;
                    }
                    break;
                } catch (Throwable var33) {
                    var37 = false;
                    break label557;
                }
            }

            Code.I();
            this.K.l.J(var36 > 1);
            if (var36 == 0) {
                if (this.C != null) {
                    this.C.d(false);
                }

                Code.Z();
                ++var36;
            } else {
                I(0 + (var36 - 1));
                Code.v(60);
                ++var36;
            }
        }

        if (this.g == null) {
            this.K.D(7);
        } else {
            byte var38;
            if (!this.aV && this.g.length == 0) {
                synchronized(this){}
                this.cj = 1;
                this.cl = 0;
                this.cw = 0;
                this.f = null;
                this.cE = 0;
                this.p = "";
                this.o = "";
                this.L = false;
                this.bl = 0;
                this.aJ = false;
                this.az = 0;
                this.cm = 0;
                this.bn = 0;
                this.a = 2;
                this.cq = 2;
                var38 = 2;
                boolean var15 = false;

                byte[] var39;
                try {
                    var15 = true;
                    var39 = new byte[var38];
                    var15 = false;
                } finally {
                    if (var15) {
                        ;
                    }
                }

                this.g = var39;
                this.C = 2;
                this.M(this.cq);
                this.c(true);
                this.K.D(5);
            } else {
                var10000 = this;
                var38 = 0;

                try {
                    if (var10000.F(var38) != 16) {
                        this.K.D(7);
                    } else {
                        this.C = this.g.length;
                        this.au();
                        this.M(this.cq);
                        this.c(true);
                        if (this.cE != 0) {
                            a(this.K);
                        }

                        this.K.D(5);
                    }
                } finally {
                    this.K.D(7);
                    return;
                }
            }
        }
    }

    public static boolean Code(int var0, int var1, int var2, int var3) {
        return var0 < var2 + var3 && var0 + var1 > var2;
    }

    private static boolean I(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        if (!Code(var1, var3, var5, var7)) {
            return true;
        } else if (var0 < var4) {
            return var0 + var2 != var4;
        } else {
            return var0 != var4 + var6;
        }
    }

    private void d(boolean var1) {
        synchronized(this){}
        boolean var10001;
        Throwable var10;
        if (var1) {
            Code var10000 = this;

            label56:
            try {
                var10000.av();
                return;
            } catch (Throwable var7) {
                var10 = var7;
                var10001 = false;
                break label56;
            }
        } else {
            label59:
            try {
                this.e(true);
                return;
            } catch (Throwable var8) {
                var10 = var8;
                var10001 = false;
                break label59;
            }
        }

        Throwable var9 = var10;
        throw var9;
    }

    private Code(String var1, boolean var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.ba = true;
        this.aY = true;
        super();
        this.Code = (SocketConnection)Connector.open(var1, 3, var2);
        if (Y) {
            this.Code.setSocketOption((byte)1, 0);
        }

    }

    private void au() {
        synchronized(this){}
        this.cD = 0;
        Code var10000 = this;
        boolean var12 = false;

        int var10001;
        try {
            var12 = true;
            var10000.O();
            this.cj = this.N();
            this.cl = this.L();
            this.cw = this.N();
            if ((this.cr & 1) != 0) {
                this.cw = 0;
            }

            this.bn = this.cD;
            this.cD += this.N();
            int var2;
            if ((var2 = this.N()) > 0) {
                this.f = new byte[var2];
                byte[] var3 = this.f;
                System.arraycopy(this.g, this.cD, var3, 0, var2);
                this.cD += var2;
            }

            this.cm = this.cD;
            this.p = this.j();
            this.o = this.k();
            var2 = this.O();
            this.L = (boolean)(var2 & 1);
            this.bl = (var2 & 6) >>> 1;
            this.aJ = (boolean)((var2 & 16 | -(var2 & 16)) >>> 31);
            if (!this.aV) {
                this.aS = (boolean)((var2 & 8 | -(var2 & 8)) >>> 31);
                if (this.n != null || this.m != null) {
                    Code var14 = this.K;
                    byte var15 = this.aS;
                    long var4 = this.B;
                    String var6 = this.n;
                    String var7 = this.m;
                    String var8 = this.b;
                    String var9 = this.d;
                    String var10 = this.c;
                    var14.w();
                    Code(var10 != null ? Code.C(var10) : 0);
                    Code(var9 != null ? Code.C(var9) : 0);
                    Code(var8 != null ? Code.C(var8) : 0);
                    Code(var7 != null ? Code.C(var7) : 0);
                    Code(var6 != null ? Code.C(var6) : 0);
                    Code(Code.I(var4));
                    I((int)var15);
                    if ((var2 = var14.u()) == 0) {
                        Code.Z();
                    } else {
                        Code.Code(var2, (int)22);
                    }
                }
            }

            this.az = this.N();
            var10000 = this;
            var10001 = this.L();
            var12 = false;
        } finally {
            if (var12) {
                ;
            }
        }

        var10000.a = var10001;
        this.cq = this.cD;
    }

    private String j() {
        String var1 = this.a(this.cD);
        this.aA();
        return var1;
    }

    private String k() {
        String var1;
        return (var1 = this.j()) != null && var1.length() > 0 && var1.charAt(0) == 0 ? this.p + var1.substring(1, var1.length()) : var1;
    }

    private String a(int var1) {
        return Code(this.g, var1);
    }

    public final boolean Code(Code var1) {
        return I(this.cv, this.cn, this.F(), this.G(), var1.cv, var1.cn, var1.F(), var1.G());
    }

    private int K() {
        this.cD += 4;
        int var1 = this.cD - 4;
        return (this.g[var1] << 24) + ((this.g[var1 + 1] & 255) << 16) + ((this.g[var1 + 2] & 255) << 8) + (this.g[var1 + 3] & 255);
    }

    private boolean a(Code var1) {
        return this.cv > var1.cv;
    }

    private boolean I(int var1, int var2, int var3, int var4) {
        for(int var5 = 1; var5 < this.u[0]; var5 += 4) {
            if (Code(var1, var2, var3, var4, this.u[var5], this.u[var5 + 1], this.u[var5 + 2], this.u[var5 + 3])) {
                return true;
            }
        }

        return false;
    }

    private boolean B(Code var1) {
        return this.cn > var1.cn;
    }

    private boolean J(Code var1) {
        return this.cv < var1.cv;
    }

    private boolean C(Code var1) {
        return this.cn < var1.cn;
    }

    private Code C() {
        return this.C.B(this.cq);
    }

    public final boolean Code(int var1, int var2) {
        return Code(var1, var2, 1, 1, this.cv, this.cn, this.F(), this.G());
    }

    private B Code(int var1, int var2, int var3, int var4, int var5, int var6, B[] var7) {
        boolean var8 = false;
        var7 = this.aE && var3 <= 0 && var4 <= 0 ? var7 : null;
        if (var3 > 0 && var4 > 0) {
            if (var2 < 256 && var2 > 0) {
                var3 = Math.max(1, this.P(var5 + var3) - this.P(var5));
                var4 = Math.max(1, this.P(var6 + var4) - this.P(var6));
            }
        } else {
            var8 = true;
        }

        return var8 ? Z.Code(this.g, var1 + 2, B(this.g, var1), var2, var7, false) : Z.Code(this.g, var1 + 2, B(this.g, var1), var3, var4, -1, var7, false);
    }

    private int I(boolean var1) {
        if (this.J()) {
            return var1 ? 1 : 0;
        } else {
            return var1 ? this.I().length() - 1 : this.I().length();
        }
    }

    private Code b() {
        Code var1;
        if ((var1 = this.J()) == null || (!var1.Z(this) || !var1.J(this)) && !var1.B(this)) {
            return (var1 = this.C()) == null || (!var1.Z(this) || !var1.J(this)) && !var1.B(this) ? null : var1;
        } else {
            return var1;
        }
    }

    private Code a() {
        Code var1;
        if ((var1 = this.J()) == null || (!var1.Z(this) || !var1.a(this)) && !var1.B(this)) {
            return (var1 = this.C()) == null || (!var1.Z(this) || !var1.a(this)) && !var1.B(this) ? null : var1;
        } else {
            return var1;
        }
    }

    private Code c() {
        Code var1;
        if ((var1 = this.J()) == null || (!var1.Z(this) || !var1.J(this)) && !var1.C(this)) {
            return (var1 = this.C()) == null || (!var1.Z(this) || !var1.J(this)) && !var1.C(this) ? null : var1;
        } else {
            return var1;
        }
    }

    private synchronized void ax() {
        if (U) {
            B[] var1 = this.aN ? this.N.Code : this.N.I;
            int var2 = 0;

            for(int var3 = 0; var3 < this.N.az; var2 += 6) {
                int var4 = this.N.h[var2 + 1];
                if (var1[var3] == null && this.b(var4)) {
                    this.R(var2);
                }

                ++var3;
            }
        } else if (this.N.az > 0) {
            if (this.aP) {
                M.c(this);
                return;
            }

            M.d(this);
        }

    }

    private void av() {
        int var1 = 0;

        for(int var2 = 0; var2 < this.N.az; var1 += 6) {
            if (this.N.Code[var2] != null || this.N.I[var2] != null) {
                int[] var10000 = this.N.h;
                var10000[var1 + 2] |= -2147483648;
                this.N.Code(var2, true, true);
            }

            ++var2;
        }

    }

    private void e(boolean var1) {
        int var2 = 0;

        for(int var3 = 0; var3 < this.N.az; var2 += 6) {
            if (this.aN) {
                if (this.N.Code[var3] != null && !this.c(var2)) {
                    this.N.Code(var3, true, true);
                } else {
                    this.N.Code(var3, true, false);
                }
            } else if (this.N.I[var3] != null && !this.c(var2)) {
                this.N.Code(var3, true, true);
            } else if (!var1 && this.N.Code[var3] != null) {
                this.N.Code(var3, false, true);
            }

            ++var3;
        }

    }

    private void R(int var1) {
        this.C(this.N.h[var1 + 2] & 1073741823, this.N.h[var1 + 3], this.N.h[var1 + 4] >>> 16, this.N.h[var1 + 4] & '\uffff');
    }

    private static int e(String var0) {
        return var0 != null ? Code(var0) : 0;
    }

    private Code d() {
        Code var1;
        if ((var1 = this.J()) == null || (!var1.Z(this) || !var1.a(this)) && !var1.C(this)) {
            return (var1 = this.C()) == null || (!var1.Z(this) || !var1.a(this)) && !var1.C(this) ? null : var1;
        } else {
            return var1;
        }
    }

    private static String C(int var0) {
        return var0 != 0 ? Code(var0) : null;
    }

    private static Object I(int var0) {
        return var0 != 0 ? Code(var0) : null;
    }

    public final void close() {
        if (this.aY) {
            this.Code.close();
        } else if (this.aG) {
            this.Code.close();
        } else {
            this.Code = null;
        }
    }

    public final DataOutputStream Code() {
        return this.aY ? this.Code.openDataOutputStream() : this.Code.openDataOutputStream();
    }

    public final DataInputStream Code() {
        return this.aY ? this.Code.openDataInputStream() : this.Code.openDataInputStream();
    }

    public final int Code(char var1) {
        return this.aZ ? this.Code.charWidth(var1) : this.h[Code(var1)];
    }

    private Code(boolean var1, int var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.bb = true;
        super();
    }

    private Code(boolean var1, boolean var2) {
        this.bj = true;
        this.bi = true;
        this.bf = true;
        this.bb = true;
        this(false, (int)0);
    }

    private boolean u() {
        int var1 = 8;

        for(int var2 = 0; var2 < 4; ++var2) {
            if (var1 + 2 >= this.C) {
                return false;
            }

            var1 += this.E(var1) + 2;
        }

        var1 += 6;
        if (this.C >= var1) {
            return true;
        } else {
            return false;
        }
    }

    private void c(boolean var1) {
        if (var1) {
            this.K.w();
        }

        if (this.K.u() == 0) {
            Code.Z();
        } else {
            var1 = true;
            int var10000 = this.cj;

            try {
                I(var10000);
                I(this.cl);
                Code(this.K(this.bn));
                Code(Code(this.o));
                Code(Code(this.f));
                var10000 = this.cE;
                I((var10000 | -var10000) >>> 31);
                I((int)this.L);
                I(this.az);
                if (this.x()) {
                    Code(this.K.u());
                    Code var9 = c;
                    byte var10001 = 15;

                    try {
                        var9.b((int)var10001);
                    } finally {
                        ;
                    }

                    var1 = false;
                    this.f(false);
                } else {
                    var1 = false;
                    Code.Code(this.K.u(), (int)15);
                }
            } finally {
                if (var1) {
                    Code.Z();
                }

            }
        }
    }

    private int H() {
        return 256 * v() / this.cj;
    }

    private int M() {
        return this.L() << 8 >> 8;
    }

    private synchronized B Code(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        int var10 = this.N.t(var1);
        B[] var11 = var7 == 256 ? this.N.Code : this.N.I;
        Code var12;
        int var13;
        if (this.N.J(var10, var1)) {
            if (var11[var10] != null) {
                return var11[var10];
            }
        } else {
            if ((var12 = this.N).az == var12.Code.length) {
                var12.h = I(var12.h, (var12.az << 1) * 6);
                var12.Code = Code(var12.Code, var12.az << 1);
                var12.I = Code(var12.I, var12.az << 1);
            }

            var13 = var10 * 6;
            System.arraycopy(var12.h, var13, var12.h, var13 + 6, 6 * var12.az - var13);
            System.arraycopy(var12.Code, var10, var12.Code, var10 + 1, var12.az - var10);
            System.arraycopy(var12.I, var10, var12.I, var10 + 1, var12.az - var10);
            ++var12.az;
            var12.h[var13] = var1;
            var12.h[var13 + 1] = var2;
            var12.h[var13 + 4] = 0;
            var12.Code[var10] = var12.I[var10] = null;
        }

        int var15;
        if (this.L != null) {
            Code var10000 = this.L;
            var12 = this.N;
            var13 = var1;
            Code var14 = var10000;
            var1 = var10000.t(var1);
            if (var14.J(var1, var13)) {
                B var19;
                if ((var19 = var14.Code[var1]) != null) {
                    var15 = var19.Code();
                    var12.Code[var10] = var19;
                    var12.bh += var15;
                    if (var12.C > 0) {
                        var12.C += var15;
                        var12.b -= var15;
                    }
                }

                if (var7 == var14.a && (var19 = var14.I[var1]) != null) {
                    var15 = var19.Code();
                    var12.I[var10] = var19;
                    var12.bh += var15;
                    if (var12.C > 0) {
                        var12.C += var15;
                        var12.b -= var15;
                    }
                }

                if (var12.b < 0) {
                    var12.b = 0;
                }

                int[] var21 = var12.h;
                var21[var10 * 6 + 2] |= var14.h[var1 * 6 + 2] & -2147483648;
                if (var11[var10] != null) {
                    return var11[var10];
                }
            }
        }

        int var10001 = var5;
        int var10003 = var8 < 0 ? 0 : var8;
        var1 = var9 < 0 ? 0 : var9;
        var5 = var10003;
        int var18 = var10001;
        var12 = this.N;
        var13 = var10 * 6;
        if (var12.h[var13 + 4] == 0) {
            var12.h[var13 + 2] = var3;
            var12.h[var13 + 3] = var4;
            var12.h[var13 + 4] = var18 << 16 | var6;
        } else {
            int var20 = var12.h[var13 + 2] & 1073741823;
            var15 = var12.h[var13 + 3];
            int var16 = Math.min(var3, var20);
            int var17 = Math.min(var4, var15);
            var12.h[var13 + 4] = Math.max(var3 + var18, var20 + (var12.h[var13 + 4] >>> 16)) - var16 << 16 | Math.max(var4 + var6, var15 + (var12.h[var13 + 4] & '\uffff')) - var17;
            var12.h[var13 + 2] = var16 | var12.h[var13 + 2] & -1073741824;
            var12.h[var13 + 3] = var17;
        }

        var12.h[var13 + 5] = var5 << 16 | var1;
        return (U || (this.N.h[var13 + 2] & -2147483648) != 0) && this.b(var2) ? this.Code(var10, var2, var7, var8, var9, var3, var4) : null;
    }

    private boolean c(int var1) {
        return this.I(this.N.h[var1 + 2] & 1073741823, this.N.h[var1 + 3], this.N.h[var1 + 4] >>> 16, this.N.h[var1 + 4] & '\uffff');
    }

    private void aw() {
        if (this.N.C > 0 && this.N.b > 0) {
            this.N.d(this.N.C + this.N.b, 0);
        }

        this.L = null;
    }

    private int N() {
        this.cD += 2;
        return this.E(this.cD - 2);
    }

    private int L() {
        this.cD += 3;
        return this.D(this.cD - 3);
    }

    private static int a(byte[] var0, int var1) {
        return ((var0[var1] & 255) << 16) + ((var0[var1 + 1] & 255) << 8) + (var0[var1 + 2] & 255);
    }

    private static int Code(DataInput var0) {
        return var0.readUnsignedByte() << 16 | var0.readUnsignedShort();
    }

    private static int H(int var0) {
        int var1 = l(var0);
        J(var0, 0);
        return var1 - 2;
    }

    private static int G(int var0) {
        int var1 = l(var0) - 2;
        J(var0, 2);
        return var1;
    }

    private int D(int var1) {
        return a(this.g, var1);
    }

    private int E(int var1) {
        return ((this.g[var1] & 255) << 8) + (this.g[var1 + 1] & 255);
    }

    private synchronized Code B(int var1) {
        Code var2 = null;
        int var3 = this.cD;
        int var4 = this.cx;
        int var5 = this.cy;
        int var6 = -1;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        this.cD = this.cq;

        while(this.cD < var1) {
            int var11 = this.cD;
            int var12;
            switch(var12 = this.O()) {
                case 66:
                case 70:
                case 73:
                case 84:
                    this.az();
                    var9 += this.cx;
                    var10 += this.cy;
                    if (var12 == 84 && !this.d(var11)) {
                        var6 = var11;
                        var7 = var9;
                        var8 = var10;
                    }
                default:
                    this.T(var12);
            }
        }

        if (var6 > 0) {
            var2 = new Code(this, var6, var7, var8);
        }

        this.cx = var4;
        this.cy = var5;
        this.cD = var3;
        return var2;
    }

    private synchronized Code I(int var1, int var2, int var3) {
        int var4 = this.cD;
        int var5 = this.cx;
        int var6 = this.cy;
        int[] var7 = new int[]{var2, var3, 0, 0};
        Code var8 = null;

        while(var8 == null && var1 != -1) {
            this.cD = var1 + 1 + 10;
            this.T(84);
            if ((var1 = this.I(this.cD, var7)) != -1 && !this.d(var1)) {
                var8 = new Code(this, var1, var7[0], var7[1]);
            }
        }

        this.cx = var5;
        this.cy = var6;
        this.cD = var4;
        return var8;
    }

    private int O() {
        return this.F(this.cD++);
    }

    private int F(int var1) {
        return this.g[var1] & 255;
    }

    private void ay() {
        this.cx = this.N();
        this.cy = this.L();
        this.cz = this.N();
        this.cA = this.L();
    }

    private void az() {
        this.cx = (short)this.N();
        this.cy = this.M();
        this.cz = this.N();
        this.cA = this.L();
    }

    private synchronized boolean I(Code var1, int var2, Code var3) {
        if (var2 == 0) {
            return false;
        } else {
            var2 = H(var2);
            int[] var4 = Code;
            int var5 = Code + 2;
            int var6;
            if ((var6 = this.I(var4, var5, var2, var3.B.J())) < 0) {
                return false;
            } else {
                int var7;
                if ((var7 = this.I(var4, var5, var2, var3.a.J())) < 0) {
                    return false;
                } else {
                    var1.B.Code(this.Code(var4, var5, var2, var3.B.Z(), var6), var3.B.Z(), var6);
                    var1.a.Code(this.Code(var4, var5, var2, var3.a.Z(), var7), var3.a.Z(), var7);
                    return true;
                }
            }
        }
    }

    private synchronized void S(int var1) {
        int var2 = 0;
        var1 = H(var1);
        int[] var3 = Code;
        int var4 = Code + 2;
        var3[var4 + -1] = 0;

        for(int var5 = 0; var5 < var1; ++var5) {
            var3[var4 + var5] = var3[var4 + var5] & -16777216 | var2;
            if ((var3[var4 + var5] & -2147483648) != 0) {
                var2 += this.t[var5 * 5 + 1];
                if ((var3[var4 + var5] & 1073741824) == 0) {
                    var3[var4 + -1] += this.t[var5 * 5 + 1];
                }
            }
        }

        var3[var4 + -2] = var2;
    }

    public final synchronized Code Code(int var1, int var2, int var3) {
        var1 = H(var1);
        return this.Code(Code, Code + 2, var1, var2, var3);
    }

    private void T(int var1) {
        switch(var1) {
            case 66:
                this.cD += 4;
                return;
            case 70:
                this.cD += 6;
                this.cD += this.N();
                this.cD = this.N() + this.cD + 5;
                return;
            case 73:
                this.cD += 7;
                this.aD();
                return;
            case 76:
                this.cD += 9;
                return;
            case 77:
                ++this.cD;
                this.cD += this.L();
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
                this.cD += this.L();
                return;
            case 84:
                this.cD += 6;
                this.aD();
                this.cD += this.N();
        }
    }

    private Code Code(int[] var1, int var2, int var3, int var4, int var5) {
        Code var6 = null;
        int var7 = this.cD;
        int var8 = this.cx;
        int var9 = this.cy;
        int var10 = -1;
        int var11 = 0;
        int var12 = 0;
        int var13 = 2147483647;
        int var14 = 2147483647;
        boolean var15 = false;
        int[] var16 = var1;
        Code var17 = this;
        int var10000;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        if (this.z == null) {
            var10000 = -1;
        } else {
            var18 = 2147483647;
            var19 = -1;
            var20 = 0;

            while(true) {
                if (var20 >= var17.z.length) {
                    var10000 = var19;
                    break;
                }

                var21 = var17.z[var20];
                var22 = var17.I(var16, var2, var3, var17.z[var20 + 1]);
                var23 = var17.z[var20 + 2];
                int var24 = var17.z[var20 + 3];
                if (Code(var4, var5, 1, 1, var21, var22, var23, var24)) {
                    var10000 = var20;
                    break;
                }

                var21 = C(var4, var21, var21 + var23 - 1);
                var22 = C(var5, var22, var22 + var24 - 1);
                var21 = var4 - var21;
                var22 = var5 - var22;
                if ((var21 = var21 * var21 + var22 * var22) < var18) {
                    var18 = var21;
                    var19 = var20;
                }

                var20 += 5;
            }
        }

        int var30 = var10000;
        int var31 = 0;
        var18 = 0;
        var19 = this.cj;
        var20 = var1[var2 + -2];
        if (var30 >= 0) {
            var31 = this.z[var30];
            var18 = this.I(var1, var2, var3, this.z[var30 + 1]);
            var19 = this.z[var30 + 2];
            var20 = this.z[var30 + 3];
        }

        var30 = 0;
        var21 = 0;
        this.cD = this.cq;

        while(this.cD < this.g.length) {
            var22 = this.cD;
            switch(var23 = this.O()) {
                case 66:
                case 70:
                case 73:
                case 84:
                    this.az();
                    var30 += this.cx;
                    var21 += this.cy;
            }

            if (var23 == 84 && !this.d(var22)) {
                int var25 = this.I(var1, var2, var3, var21);
                int var26 = this.cz;
                int var27 = this.cA;
                if (var25 < 0) {
                    this.T(var23);
                    continue;
                }

                int var28;
                if (var4 < var30) {
                    var28 = var30 - var4;
                } else if (var4 >= var30 + var26) {
                    var28 = var4 - var30 - var26 + 1;
                } else {
                    var28 = 0;
                }

                int var29;
                if (var5 < var25) {
                    var29 = var25 - var5;
                } else if (var5 >= var25 + var27) {
                    var29 = var5 - var25 - var27 + 1;
                } else {
                    var29 = 0;
                }

                if (var28 == 0 && var29 == 0) {
                    var10 = var22;
                    var11 = var30;
                    var12 = var21;
                    break;
                }

                boolean var32 = Code(var31, var18, var19, var20, var30, var25, var26, var27);
                boolean var33 = var29 < var14 || var29 == var14 && var28 < var13;
                if (!var15 && (var32 || var33) || var15 && var32 && var33) {
                    var10 = var22;
                    var11 = var30;
                    var12 = var21;
                    var13 = var28;
                    var14 = var29;
                    var15 = var32;
                }
            }

            this.T(var23);
        }

        this.cx = var8;
        this.cy = var9;
        this.cD = var7;
        if (var10 > 0) {
            var6 = new Code(this, var10, var11, var12);
        }

        return var6;
    }

    private int I(int var1, int[] var2) {
        this.cD = var1;

        while(this.cD < this.C) {
            var1 = this.cD;
            int var3;
            switch(var3 = this.O()) {
                case 66:
                case 70:
                case 73:
                case 84:
                    this.az();
                    this.cx += var2[0];
                    this.cy += var2[1];
                    var2[0] = this.cx;
                    var2[1] = this.cy;
                default:
                    if (var3 == 84) {
                        return var1;
                    }

                    this.T(var3);
            }
        }

        return -1;
    }

    private int a(int var1, int var2, int var3) {
        this.t[var1] = var2;
        this.t[var1 + 1] = var3;
        this.t[var1 + 2] = this.cB;
        this.t[var1 + 3] = this.cC;
        return var1;
    }

    private int K(int var1) {
        return Code(this.g, var1 + 2, B(this.g, var1));
    }

    private int L(int var1) {
        int var2;
        return (var2 = B(this.g, var1)) > 0 && this.g[var1 + 2] == 0 ? Code(this.g, this.cm + 2, B(this.g, this.cm), this.g, var1 + 3, var2 - 1) : Code(this.g, var1 + 2, var2);
    }

    private int P() {
        while(this.cE == 0 || this.g == null) {
            if (this.C == null) {
                return 0;
            }

            this = this.C;
        }

        int var1 = a(this.g, this.cE);
        return Z(this.g, this.cE + 3, var1);
    }

    private void f(boolean var1) {
        if (var1) {
            this.K.w();
        }

        if (this.K.u() == 0) {
            Code.Z();
        } else {
            this.aL = false;
            int var6 = 2 + this.bk;
            Code var2 = Code;
            int var10000 = var6;
            int var10001 = var6;

            try {
                Z(var10000, var10001);
            } catch (RuntimeException var4) {
                var2.Z();
                throw var4;
            } catch (Error var5) {
                var2.Z();
                throw var5;
            }

            var6 = Code + 2;

            for(int var7 = 0; var7 < this.bk; ++var7) {
                int var3 = this.t[var7 * 5 + 4];
                Code[var6++] = (var3 & 1) * -2147483648 | ((var3 & 2 | -(var3 & 2)) >>> 31) * 1073741824;
            }

            Code(Code.p());
            Code.Code(this.K.u(), (int)20);
        }
    }

    private synchronized int N(int var1) {
        label92:
        for(this.cD = var1; this.cD < this.g.length && this.C == this.g.length || this.cD < this.C - 16; var1 = this.cD) {
            int var2 = this.cD;
            int var3;
            int var4;
            switch(var3 = this.O()) {
                case 76:
                    this.L();
                    this.cu = this.L();
                    this.ct = this.L();
                    break;
                case 77:
                    var2 = this.O();
                    var3 = this.L();
                    if (this.cD + var3 > this.C) {
                        return var1;
                    }

                    switch(var2) {
                        case 67:
                            var3 -= 8;
                            this.bk = var3 / 6;
                            this.t = new int[(this.N() << 2) + this.bk * 6];
                            this.cn = this.O();
                            this.bm = this.N();
                            this.bp = this.L();
                            this.M = true;
                            var1 = this.bk * 5;
                            var2 = 0;

                            for(var3 = 0; var3 / 5 < this.bk; var3 += 5) {
                                var4 = this.L();
                                this.t[var3] = var2;
                                this.t[var3 + 1] = var4;
                                this.t[var3 + 2] = var1;
                                this.t[var3 + 4] = this.O();
                                var1 += 4 * this.N() + 1;
                                var2 += var4;
                            }

                            this.aL = true;
                            continue;
                        case 73:
                            var1 = var3 / 11;
                            this.y = new int[var1 * 5];
                            var1 = 0;

                            while(true) {
                                if (var1 >= this.y.length) {
                                    continue label92;
                                }

                                this.y[var1] = this.O();
                                this.y[var1 + 1] = this.L();
                                this.y[var1 + 2] = this.L();
                                this.y[var1 + 3] = this.N();
                                this.y[var1 + 4] = this.N();
                                var1 += 5;
                            }
                        case 80:
                            var1 = this.O();
                            this.K.bh = var1;
                            continue;
                        case 84:
                            var1 = var3 / 12;
                            this.z = new int[var1 * 5];
                            var1 = 0;

                            while(true) {
                                if (var1 >= this.z.length) {
                                    continue label92;
                                }

                                this.z[var1] = this.L();
                                this.z[var1 + 1] = this.L();
                                this.z[var1 + 2] = this.L() - this.z[var1];
                                this.z[var1 + 3] = this.L() - this.z[var1 + 1];
                                var1 += 5;
                            }
                        case 116:
                            this.cE = this.cD - 3;
                            this.cD += var3;
                            continue;
                        case 117:
                            var1 = this.K();
                            if (!this.aV && !this.o.startsWith("odp:component")) {
                                Code var10000 = this.K;
                                var10000.bq += var1;
                            }
                            continue;
                        default:
                            this.cD += var3;
                            continue;
                    }
                case 83:
                    this.cD += this.L();
                    break;
                default:
                    this.az();
                    this.T(var3);
                    if (this.cD > this.C) {
                        return var1;
                    }

                    this.cx += this.cB;
                    this.cy += this.cC;
                    var1 = this.cD;
                    var2 = var2;
                    Code var6 = this;
                    var4 = this.g(this.cy, this.bk);

                    do {
                        int var5;
                        for(var5 = var6.t[var4 * 5 + 2]; var6.t[var5 + 4] != 0; var5 += 4) {
                        }

                        if (var6.t[var5] == 0) {
                            var6.a(var5, var2, var1);
                        } else if (var6.t[var5 + 1] + var6.cn >= var2) {
                            var6.t[var5 + 1] = var1;
                        } else {
                            var6.a(var5 + 4, var2, var1);
                        }

                        ++var4;
                    } while(var4 < var6.bk && var6.cy + var6.cA > var6.t[var4 * 5]);

                    this.cB = this.cx;
                    this.cC = this.cy;
                    this.C(this.cx, this.cy, this.cz, this.cA);
            }
        }

        return var1;
    }

    private synchronized int g(int var1, int var2) {
        int var3;
        for(var3 = Code((int[])this.t, (int)var2, 5, var1); var3 > 0 && (var3 == var2 || this.t[var3 * 5] == this.t[(var3 - 1) * 5] || this.t[var3 * 5] > var1); --var3) {
        }

        return var3;
    }

    private void C(int var1, int var2, int var3, int var4) {
        if (this.I(var1, var2, var3, var4)) {
            if (this.bq > 0) {
                int var5 = this.br + this.bq;
                this.br = Math.min(this.br, var1);
                this.bq = Math.max(var1 + var3, var5) - this.br;
                var1 = this.b + this.cv;
                this.b = Math.min(this.b, var2);
                this.cv = Math.max(var2 + var4, var1) - this.b;
                return;
            }

            this.br = var1;
            this.b = var2;
            this.bq = var3;
            this.cv = var4;
        }

    }

    private int O(int var1) {
        return var1 * this.co / this.cj;
    }

    private int Q(int var1) {
        return var1 * this.cj / this.co;
    }

    private int I(int[] var1, int var2, int var3, int var4) {
        if (var3 == 0) {
            return -1;
        } else {
            var3 = this.g(var4, var3);
            return (var1[var2 + var3] & -2147483648) == 0 ? -1 : var4 - this.t[var3 * 5] + (var1[var2 + var3] & 16777215);
        }
    }

    private int f(int var1, int var2) {
        return var1 * this.cj / var2;
    }

    private int R(int var1) {
        if (var1 == 0) {
            int var10000 = this.u[0];
            Z(var10000, var10000);
        } else {
            Code(var1, this.u[0], false);
        }

        System.arraycopy(this.u, 1, Code, Code, this.u[0]);
        return m();
    }

    private synchronized void a(int var1, int var2, int var3, int var4) {
        this.N.z(this.H());
        this.u[0] = var2 << 2;
        if (this.u[0] > this.u.length) {
            this.u = new int[1 + this.u[0]];
            this.u[0] = this.u.length - 1;
        }

        J(var1, 0);
        System.arraycopy(Code, Code, this.u, 1, this.u[0]);
        var1 = var3;
        int[] var16 = this.u;
        Code var17 = this;
        int[] var5;
        int var6;
        int var7;
        if (this.t != null) {
            var2 = H(var4);
            var5 = Code;
            var6 = Code + 2;
            var7 = var5[var6 + -1];
        } else {
            var2 = 0;
            var5 = null;
            var6 = 0;
            var7 = 0;
        }

        if (var3 == 0) {
            var16[0] = 0;
        } else {
            int var8 = 1;

            int var9;
            int var10;
            while(var8 < var16[0]) {
                if (var16[var8 + 3] == 0) {
                    var16[0] -= 4;
                    System.arraycopy(var16, var8 + 4, var16, var8, var16[0] + 1 - var8);
                    var8 += 4;
                } else {
                    var9 = var16[var8];
                    var10 = var16[var8 + 1];
                    var16[var8] = var17.f(var9, var1);
                    var16[var8 + 1] = var17.b(var10, var1, var7);
                    var16[var8 + 2] = var17.f(var9 + var16[var8 + 2], var1) - var16[var8];
                    var16[var8 + 3] = var17.b(var10 + var16[var8 + 3], var1, var7) - var16[var8 + 1];
                    var8 += 4;
                }
            }

            if (var17.t != null) {
                for(var1 = 1; var1 < var16[0]; var1 += 4) {
                    var7 = var16[var1 + 1];
                    if ((var8 = var17.J(var5, var6, var2, var7)) >= var2) {
                        var16[0] -= 4;
                        System.arraycopy(var16, var1 + 4, var16, var1, var16[0] + 1 - var1);
                        var1 -= 4;
                    } else {
                        var16[var1 + 1] = var7 + var17.t[var8 * 5] - (var5[var6 + var8] & 16777215);
                        boolean var18 = true;
                        var10 = (var5[var6 + var8] & 16777215) + var17.t[var8 * 5 + 1];

                        while(true) {
                            ++var8;
                            if (var8 >= var2 || var10 >= var7 + var16[var1 + 3]) {
                                if (!var18) {
                                    var16[0] -= 4;
                                    System.arraycopy(var16, var1 + 4, var16, var1, var16[0] + 1 - var1);
                                    var1 -= 4;
                                }
                                break;
                            }

                            if ((var5[var6 + var8] & -2147483648) == 0) {
                                if (var18) {
                                    var9 = var10 - var7;
                                    int var10003 = var16[var1];
                                    int var10004 = var16[var1 + 1];
                                    var7 = var16[var1 + 2];
                                    int var11 = var10004;
                                    int var12 = var10003;
                                    int[] var14 = var16;
                                    if (var16[0] + 4 >= var16.length) {
                                        int[] var15 = new int[var16.length + 8];
                                        System.arraycopy(var16, 0, var15, 0, var16.length);
                                        var14 = var15;
                                    }

                                    System.arraycopy(var14, var1, var14, var1 + 4, var14[0] + 1 - var1);
                                    var14[0] += 4;
                                    var14[var1] = var12;
                                    var14[var1 + 1] = var11;
                                    var14[var1 + 2] = var7;
                                    var14[var1 + 3] = var9;
                                    var16 = var14;
                                    var7 = var10;
                                    var1 += 4;
                                    var14[var1 + 3] -= var9;
                                    var18 = false;
                                }
                            } else {
                                if (!var18) {
                                    var16[var1 + 1] = var17.t[var8 * 5];
                                    var18 = true;
                                }

                                var10 += var17.t[var8 * 5 + 1];
                            }
                        }
                    }
                }
            }
        }

        this.u = var16;
        if (!U && this.u[0] > 0) {
            if (this.aP) {
                M.c(this);
                return;
            }

            M.d(this);
        }

    }

    private int b(int var1, int var2, int var3) {
        return var1 <= var3 ? var1 : (var1 - var3) * this.cj / var2 + var3;
    }

    private int Z(int[] var1, int var2, int var3, int var4) {
        int var5;
        return (var5 = this.J(var1, var2, var3, var4)) >= var3 ? this.cl : var4 + this.t[var5 * 5] - (var1[var2 + var5] & 16777215);
    }

    private synchronized int i(int var1, int var2) {
        var1 = this.T(var1);
        ++this.cD;
        this.az();
        this.cD += 4;
        int var3 = this.O();
        int var4;
        int var5 = (var4 = this.O()) & 8;
        String var6 = this.j();
        this.j();
        if (this.K.J.get(var6) != null) {
            var5 = 0;
        }

        int var16 = var4 & 1;
        switch(var3) {
            case 83:
            case 85:
            case 97:
            case 112:
            case 120:
                Z(3, (int)3);
                var1 = Code;
                Code[var1++] = var16;
                Code[var1++] = var5;
                Code[var1] = -1;
                return m();
            case 99:
            case 114:
                Z(1, (int)1);
                Code[Code] = var16;
                return m();
            case 115:
                this.cD = this.L();
                var3 = this.L();
                int var10001 = var1;
                var1 = this.cy;
                int var7 = this.cx;
                int var8 = var10001;
                Code var9 = this;
                int var10 = this.cD;
                int var11 = this.cz;
                int var12 = this.cA;
                int var13 = 0;
                int var14 = 0;
                this.cD = this.cq;

                while(var9.cD < var8) {
                    int var15;
                    switch(var15 = var9.O()) {
                        case 66:
                        case 70:
                        case 73:
                        case 84:
                            var9.az();
                            var13 += var9.cx;
                            var14 += var9.cy;
                        default:
                            var9.T(var15);
                    }
                }

                var9.cx = var7 + var13;
                var9.cy = var1 + var14;
                var9.cz = var11;
                var9.cA = var12;
                var9.cD = var10;
                var1 = G(var2);
                this.cy = this.I(Code, Code, var1, this.cy);
                Z(8, (int)8);
                var1 = Code;
                Code[var1++] = var16;
                Code[var1++] = var5;
                Code[var1++] = var3;
                Code[var1++] = (var4 & 4 | -(var4 & 4)) >>> 31;
                Code[var1++] = this.cx;
                Code[var1++] = this.cy;
                Code[var1++] = this.cz;
                Code[var1] = this.cA;
                return m();
            default:
                return 0;
        }
    }

    private void Code(Code var1, int var2, int var3, int var4, int var5, int[] var6, int var7) {
        if (var5 >= 0) {
            var3 += this.O(var6[var7 + var4] & 16777215);
            int var52 = var1.Code.getClipX();
            var7 = var1.Code.getClipY();
            int var8 = var1.Code.getClipWidth();
            int var9 = var1.Code.getClipHeight();
            var1.B(var2, var3, this.co, this.O(this.t[var5 * 5] + this.t[var5 * 5 + 1]));
            var3 -= this.O(this.t[var4 * 5]);
            int var10 = 0;
            int var11 = 0;
            this.cD = 0;

            label328:
            while(true) {
                int var12 = 2147483647;

                int var13;
                int var14;
                for(var13 = var4; var13 <= var5; ++var13) {
                    for(var14 = this.t[var13 * 5 + 3]; this.t[var14] != 0; var14 += 4) {
                        this.t[var13 * 5 + 3] = var14;
                        if (this.t[var14 + 1] > this.cD) {
                            var12 = C(var12, this.cD, this.t[var14]);
                            if (this.t[var14] == var12) {
                                var10 = this.t[var14 + 2];
                                var11 = this.t[var14 + 3];
                            }
                            break;
                        }
                    }
                }

                if (var12 == 2147483647) {
                    var1.J(var52, var7, var8, var9);
                    return;
                }

                var13 = var12;

                int var15;
                do {
                    for(var15 = var4; var15 <= var5; ++var15) {
                        for(int var16 = this.t[var15 * 5 + 3]; this.t[var16] != 0 && this.t[var16] <= var13 + this.cn; var16 += 4) {
                            this.t[var15 * 5 + 3] = var16;
                            var13 = Math.max(var13, this.t[var16 + 1]);
                        }
                    }
                } while(var13 != var13);

                int var10002 = var12;
                int var10003 = var13;
                var12 = var11;
                var13 = var10;
                var14 = var10003;
                var15 = var10002;
                Code var54 = var1;
                Code var17 = this;
                this.cD = var15;

                while(true) {
                    int var26;
                    char[] var55;
                    Code var56;
                    Vector var57;
                    Code var58;
                    int var59;
                    int var62;
                    int var63;
                    int var64;
                    do {
                        int var18;
                        char[] var22;
                        label315:
                        do {
                            while(true) {
                                while(true) {
                                    while(true) {
                                        if (var17.cD >= var14) {
                                            continue label328;
                                        }

                                        var15 = var17.cD;
                                        if ((var18 = var17.O()) != 83 && var18 != 76 && var18 != 77) {
                                            var17.az();
                                            var17.cx += var13;
                                            var17.cy += var12;
                                            var13 = var17.cx;
                                            var12 = var17.cy;
                                            int var19 = var17.cz;
                                            int var20 = var17.cA;
                                            var17.cz = var17.O(var17.cx + var17.cz);
                                            var17.cA = var17.O(var17.cy + var17.cA);
                                            var17.cx = var17.O(var17.cx);
                                            var17.cy = var17.O(var17.cy);
                                            var17.cz -= var17.cx;
                                            var17.cA -= var17.cy;
                                            var17.cx += var2;
                                            var17.cy += var3;
                                            if (Code(var17.cx, var17.cy, var17.cz, var17.cA, var54.Code.getClipX(), var54.Code.getClipY(), var54.Code.getClipWidth(), var54.Code.getClipHeight())) {
                                                int var21 = var17.K();
                                                int var10004;
                                                int var23;
                                                switch(var18) {
                                                    case 66:
                                                        var54.B(var17.cx, var17.cy, var17.cz, var17.cA, var21);
                                                        break;
                                                    case 70:
                                                        var17.Code(var54, var21, var19, var20);
                                                        break;
                                                    case 73:
                                                        var15 = 0;
                                                        var18 = 0;
                                                        var59 = var17.M();
                                                        var23 = 0;
                                                        var62 = -1;
                                                        var63 = -1;
                                                        var26 = var17.O();

                                                        while(var26 > 0) {
                                                            switch(var17.O()) {
                                                                case 99:
                                                                    var64 = var17.N();
                                                                    var23 = var17.K();
                                                                    var17.cD += var64 - 4;
                                                                    --var26;
                                                                    break;
                                                                case 111:
                                                                    var17.cD += 2;
                                                                    var15 = var17.N();
                                                                    var18 = var17.N();
                                                                    --var26;
                                                                    break;
                                                                case 122:
                                                                    var17.N();
                                                                    var62 = var17.N();
                                                                    var63 = var17.N();
                                                                    --var26;
                                                                    break;
                                                                default:
                                                                    var17.cD += var17.N();
                                                                    --var26;
                                                            }
                                                        }

                                                        if (var17.cz > 0 && var17.cA > 0) {
                                                            var10004 = var15;
                                                            int var10005 = var18;
                                                            int var10006 = var19;
                                                            int var10007 = var20;
                                                            var15 = var63;
                                                            var18 = var62;
                                                            var19 = var21;
                                                            var20 = var59;
                                                            var21 = var23;
                                                            var59 = var10007;
                                                            var23 = var10006;
                                                            var62 = var10005;
                                                            var63 = var10004;
                                                            var21 = var21 + (var15 << 10) + var18;
                                                            B var53;
                                                            if (var18 != -1 && var15 != -1) {
                                                                if (var17.aX) {
                                                                    var53 = var17.Code(var21, var17.a + var20, var13, var12, var23, var59, 256, var18, var15);
                                                                } else {
                                                                    var53 = var17.Code(var21, var17.a + var20, var13, var12, var23, var59, var17.H(), var18, var15);
                                                                }
                                                            } else if (var17.aX) {
                                                                var53 = var17.Code(var21, var17.a + var20, var13, var12, var23, var59, 256, -1, -1);
                                                            } else {
                                                                var53 = var17.Code(var21, var17.a + var20, var13, var12, var23, var59, var17.H(), var23, var59);
                                                            }

                                                            if (var53 != null) {
                                                                var54.I(var53, var17.cx, var17.cy, var17.cz, var17.cA, var63, var62);
                                                            } else {
                                                                var54.J(var17.cx, var17.cy, var17.cz, var17.cA, var19);
                                                            }
                                                        }
                                                        break;
                                                    case 84:
                                                        var18 = var17.N();
                                                        var19 = var17.O();

                                                        while(var19 > 0) {
                                                            if (var17.O() == 114) {
                                                                var17.N();
                                                                --var19;
                                                            } else {
                                                                var17.cD += var17.N();
                                                                --var19;
                                                            }
                                                        }

                                                        var19 = var17.N();
                                                        var22 = I;
                                                        if (var19 > I.length) {
                                                            var22 = new char[var19];
                                                        }

                                                        var23 = var19;
                                                        B var24 = 0;
                                                        char[] var25 = var22;
                                                        var26 = var17.cD;
                                                        byte[] var27 = var17.g;

                                                        int var28;
                                                        int var29;
                                                        while(var23 > 0) {
                                                            var28 = C(var27, var26);
                                                            var29 = y(var27[var26]);
                                                            var23 -= var29;
                                                            var26 += var29;
                                                            if (var28 <= 65535) {
                                                                var25[var24++] = (char)var28;
                                                            } else {
                                                                var62 = var24 + 1;
                                                                var25[var24] = (char)('\ud800' | var28 - 65536 >> 10);
                                                                var24 = var62 + 1;
                                                                var25[var62] = (char)('\udc00' | var28 & 1023);
                                                            }
                                                        }

                                                        var17.cD += var19;
                                                        var59 = var15;
                                                        if (var17.aX) {
                                                            int var70;
                                                            if (var17.K.n.B) {
                                                                Code var66;
                                                                B var10000 = (var66 = var17.K.n).B;
                                                                B var67 = var66.a;
                                                                B var68 = var10000;
                                                                if (!var10000.Code() && !var67.Code()) {
                                                                    B var30;
                                                                    var67 = (var30 = B.Code(var68, var67)) != var68 ? var68 : var67;
                                                                    if (var30.Code.cq <= var15 && var67.Code.cq >= var15 && !var17.d(var15)) {
                                                                        Code var78 = var17.K.n;
                                                                        var10002 = var17.cx;
                                                                        var10003 = var17.cy;
                                                                        var10004 = var17.cz;
                                                                        boolean var60 = I(var22[0]) ^ true;
                                                                        var62 = var20;
                                                                        var64 = var18;
                                                                        var67 = var24;
                                                                        char[] var69 = var22;
                                                                        var70 = var15;
                                                                        int var31 = var12;
                                                                        int var32 = var13;
                                                                        int var33 = var10004;
                                                                        int var34 = var10003;
                                                                        int var35 = var10002;
                                                                        Code var36 = var54;
                                                                        Code var37 = var78;
                                                                        if (var78.B && !var37.B.Code() && !var37.a.Code()) {
                                                                            int var38 = a(var18);
                                                                            int var39 = var20 / var38;
                                                                            char[] var40 = var22;
                                                                            int var41 = 1;

                                                                            int var42;
                                                                            for(var42 = 0; var42 < var67 && var41 <= var39; ++var42) {
                                                                                if (var40[var42] == '\n') {
                                                                                    ++var41;
                                                                                }
                                                                            }

                                                                            var39 = var41;
                                                                            int var71 = 0;

                                                                            for(var41 = 0; var41 < var39; ++var41) {
                                                                                var42 = var71;
                                                                                char[] var43 = var69;

                                                                                int var44;
                                                                                for(var44 = 0; var42 < var67 && var43[var42] != '\n'; ++var42) {
                                                                                    ++var44;
                                                                                }

                                                                                var42 = var44;
                                                                                var10000 = var37.B;
                                                                                B var45 = var37.a;
                                                                                B var46 = var10000;
                                                                                B var47;
                                                                                var45 = (var47 = B.Code(var10000, var45)) != var46 ? var46 : var45;
                                                                                int var72 = var71 + var44;
                                                                                int var75 = var47.Code.cq == var70 ? var47.Code : 0;
                                                                                int var74 = var45.Code.cq == var70 ? var45.Code : var72;
                                                                                if (var75 <= var72 && var74 >= var71) {
                                                                                    var72 = var34 + var37.C.O(var62 * var41 / var39);
                                                                                    var44 = (var45 = B.Code(var37.B, var37.a)).Code.cq != var70 ? 0 : Math.max(0, var45.Code - var71);
                                                                                    var74 = Code(var64, var69, var71, var44);
                                                                                    var10002 = var71 + var44;
                                                                                    B var81 = var37.B;
                                                                                    B var48 = var37.a;
                                                                                    B var49 = var81;
                                                                                    var44 = Code(var64, var69, var10002, ((var48 = B.Code(var81, var48) == var49 ? var48 : var49).Code.cq != var70 ? var42 : Math.min(var48.Code - var71, var42)) - var44);
                                                                                    var74 = var60 ? var35 + var74 : var35 + var33 - var74 - var44;
                                                                                    var36.J(var74, var72, var44, var38, -5189377);
                                                                                    if (var41 + 1 == var39) {
                                                                                        var10000 = var37.B;
                                                                                        var46 = var37.a;
                                                                                        var47 = var10000;
                                                                                        if (!var10000.Code() && !var46.Code()) {
                                                                                            var46 = B.Code(var47, var46) != var47 ? var47 : var46;
                                                                                            if (var70 < var46.Code.cq) {
                                                                                                Code var76 = var37.C.I(var70, var32, var31);
                                                                                                if (Code(var31 + var62 * var41 / var39, a(var64), var76.cn, var76.G())) {
                                                                                                    var10002 = var60 ? var74 + var44 : var74;
                                                                                                    var44 = var38;
                                                                                                    var75 = var72;
                                                                                                    int var77 = var10002;
                                                                                                    int var50 = var76.cn;
                                                                                                    int var51 = var76.G();
                                                                                                    if (var62 < var51) {
                                                                                                        var44 = var37.C.O(var50 + var51);
                                                                                                        var74 = var37.C.O(var50);
                                                                                                        var44 -= var74;
                                                                                                        var75 = var74 + var3;
                                                                                                    }

                                                                                                    var74 = var2 + var37.C.O(var76.cv);
                                                                                                    if (var77 < var74) {
                                                                                                        var36.J(var77, var75, var74 - var77 + 1, var44, -5189377);
                                                                                                    } else {
                                                                                                        var72 = var76.F();
                                                                                                        var36.J(var74 + var72, var75, var77 - (var74 + var72) + 1, var44, -5189377);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }

                                                                                var71 += var44 + 1;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }

                                                            Code var65;
                                                            if (!(var24 = var17.K.m.B).Code() && var24.Code.cq == var15 && !var17.d(var15) && (var65 = var17.K.m).c) {
                                                                var28 = var65.B.Z();
                                                                var29 = var65.B.J();
                                                                var70 = var65.B.B();
                                                                var28 = var65.C.O(var28) + var2;
                                                                var64 = var65.C.O(var29) + var3;
                                                                var54.J(var28 - 1, var64, 3, 1, var21);
                                                                var54.J(var28, var64, 1, var70, var21);
                                                                var54.J(var28 - 1, var64 + var70 - 1, 3, 1, var21);
                                                            }
                                                        }

                                                        var17.Code(var54, (char[])var22, (int)var24, var21, var18, var20);
                                                        continue label315;
                                                }
                                            } else {
                                                var17.T(var18);
                                            }
                                        } else {
                                            var17.T(var18);
                                        }
                                    }
                                }
                            }
                        } while(var17.O == null);

                        var15 = var18;
                        var55 = var22;
                        var56 = var54;
                        var58 = var17;
                    } while((var57 = (Vector)var17.O.B.get(new Integer(var59))) == null);

                    for(var59 = 0; var59 < var57.size(); ++var59) {
                        int[] var61;
                        int var79 = (var61 = (int[])var57.elementAt(var59))[9] - var58.K.b;
                        var63 = (var62 = (var79 | -var79) >>> 31 ^ 1) * -16711680 + 16772710;
                        var62 *= 16777215;
                        var26 = var58.cx + var58.O(var61[3]);
                        var64 = var58.cy + var58.O(var61[4]);
                        var56.J(var26, var64, var58.O(var61[5]), var58.O(var61[6]), var63);
                        Code(var56, var15, var55, var61[1], var61[2], var26, var64, var62);
                    }
                }
            }
        }
    }

    private synchronized void aC() {
        if (this.aP) {
            M.b(this);
        }

        this.cF = 0;
    }

    private synchronized int c(int var1, int var2, int var3) {
        this.cD = var3;
        this.O();
        int var4 = this.O();
        O = var1;
        P = var2;
        Z(var4 << 2, var4 << 2);
        var1 = Code;
        var2 = this.cD;

        int var5;
        for(var5 = 0; var5 < var4; ++var5) {
            this.ay();
            Code[var1++] = this.cx;
            Code[var1++] = this.cy;
            Code[var1++] = this.cz;
            Code[var1++] = this.cA;
        }

        var1 = m();
        var5 = O;
        int var6 = P;
        O = 0;
        P = 0;
        var6 = G(var6);
        int[] var7 = Code;
        int var8 = Code;
        this.cD = var2;

        for(var2 = 1; var4-- > 0; var2 += 4) {
            this.ay();
            this.cy = this.I(var7, var8, var6, this.cy);
            int var9 = this.cy;
            Code(var1)[(var1 & 32767) + 1 + var2] = var9;
        }

        this.cD += this.N();
        this.aD();
        a(var5 + 1, var3);
        a(var5, var1);
        return var5;
    }

    private synchronized boolean C(int var1, int var2) {
        if (!this.y()) {
            return false;
        } else {
            var2 = H(var2);
            int[] var3 = Code;
            int var4 = Code + 2;
            int var5 = this.I(var3, var4, var2, this.b);
            var2 = this.I(var3, var4, var2, this.b + this.cv);
            if (var5 == var2) {
                this.bq = 0;
                return false;
            } else {
                if (var5 < 0) {
                    var5 = Math.max(var2 - this.cv, 0);
                } else if (var2 < 0) {
                    var2 = Math.min(var5 + this.cv, var3[var4 + -2]);
                }

                J(var1, 0);
                Code[Code] = this.br;
                Code[Code + 1] = var5;
                Code[Code + 2] = this.bq;
                Code[Code + 3] = var2 - var5;
                this.bq = 0;
                return true;
            }
        }
    }

    private synchronized void I(B var1, int var2, int var3) {
        int var4 = var1.J();
        var3 = G(var3);
        var3 = this.I(Code, Code, var3, var4);
        J(var2, 0);
        Code[Code] = var1.Z();
        Code[Code + 1] = var3;
        Code[Code + 2] = var1.B();
    }

    private synchronized String c(int var1) {
        this.T(var1);
        this.cD += 15;
        var1 = this.O();
        int var2 = this.O();
        String var3 = this.j();
        var3 = (String)this.K.J.get(var3);
        switch(var1) {
            case 83:
            case 85:
            case 97:
            case 112:
            case 115:
            case 120:
                if (var3 == null) {
                    var3 = this.j();
                }

                return var3;
            case 99:
                if (((var3 != null ? 1 : 0) ^ (var2 & 2 | -(var2 & 2)) >>> 31) != 0) {
                    return "1";
                }

                return "0";
            default:
                return "";
        }
    }

    private int I(int var1, int var2, int var3, int var4, int var5, int var6) {
        if (this.z == null) {
            return 0;
        } else {
            int var7 = 0;
            var6 = G(var6);
            int[] var8 = Code;
            int var9 = Code;
            int var10 = 0;

            while(true) {
                while(var10 < this.z.length) {
                    this.z[var10 + 4] = this.I(var8, var9, var6, this.z[var10 + 1]);
                    if (this.z[var10 + 4] >= 0 && Code(var5, var4, var3, var2, this.z[var10], this.z[var10 + 4], this.z[var10 + 2], this.z[var10 + 3])) {
                        ++var7;
                        var10 += 5;
                    } else {
                        this.z[var10 + 4] = -1;
                        var10 += 5;
                    }
                }

                if (var1 == 0) {
                    Z(var7 << 2, var7 << 2);
                } else {
                    Code(var1, var7 << 2, false);
                }

                var1 = Code;

                for(var2 = 0; var2 < this.z.length; var2 += 5) {
                    if (this.z[var2 + 4] >= 0) {
                        Code[var1++] = this.z[var2];
                        Code[var1++] = this.z[var2 + 4];
                        Code[var1++] = this.z[var2 + 2];
                        Code[var1++] = this.z[var2 + 3];
                    }
                }

                return m();
            }
        }
    }

    private void aD() {
        for(int var1 = this.O(); var1 > 0; --var1) {
            ++this.cD;
            this.cD += this.N();
        }

    }

    private synchronized int J(int[] var1, int var2, int var3, int var4) {
        int var5;
        for(var5 = Code((int[])var1, (int)var2, var3, 1, (int)16777215, (int)var4); var5 > 0 && (var5 == var3 || (var1[var2 + var5] & 16777215) == (var1[var2 + var5 - 1] & 16777215) || (var1[var2 + var5] & 16777215) > var4); --var5) {
        }

        while(var5 < var3 && (var1[var2 + var5] & -2147483648) == 0) {
            ++var5;
        }

        return var5;
    }

    private synchronized boolean Code(Code var1, int var2, int var3, int var4, int var5) {
        M.an();
        Graphics var10000 = var1.Code;

        Throwable var21;
        label285: {
            int var6;
            int var7;
            int var8;
            int var9;
            boolean var10001;
            try {
                var6 = var10000.getClipX();
                var7 = var1.Code.getClipY();
                var8 = var1.Code.getClipWidth();
                var9 = var1.Code.getClipHeight();
                var1.J(var6, var7, var8, var9, 16777215);
            } catch (Throwable var19) {
                var21 = var19;
                var10001 = false;
                break label285;
            }

            if (this.t == null || this.g == null || var5 == 0) {
                this.co = var4;
                if (this.cj != 0) {
                    M.ao();
                    if (this.bh != this.co && this.co == this.cj && this.J != null) {
                        this.J.clear();
                        this.J = null;
                    }

                    return true;
                } else {
                    M.ao();
                    if (this.bh != this.co && this.co == this.cj && this.J != null) {
                        this.J.clear();
                        this.J = null;
                    }

                    return false;
                }
            }

            int var22 = var5;

            try {
                var5 = H(var22);
                int[] var10 = Code;
                int var11 = Code + 2;
                this.bh = this.co;
                this.co = var4;
                int var12 = this.O(var10[var11 + -2]);
                var1.B(var2, var3, var4, var12);
                if (var1.Code.getClipWidth() > 0 && var1.Code.getClipHeight() > 0) {
                    this.aN = var4 > this.cj / 2;
                    if (var10[var11 + -1] > 0) {
                        this.co = this.cj;
                        this.aX = true;
                        int var13 = Math.min((var12 = Math.min(var1.Code.getClipY() - var3, var10[var11 + -2] - 1)) + var1.Code.getClipHeight() - 1, var10[var11 + -1] - 1);
                        this.Code(var1, var2, var3, var12, var13, var10, var11, var5);
                        this.co = var4;
                        var3 += var10[var11 + -1] - this.O(var10[var11 + -1]);
                    }

                    this.aX = this.aN;
                    var12 = Math.min((var4 = Math.min(Math.max(var10[var11 + -1], this.Q(var1.Code.getClipY() - var3)), var10[var11 + -2] - 1)) + this.Q(var1.Code.getClipHeight()), var10[var11 + -2] - 1);
                    this.Code(var1, var2, var3, var4, var12, var10, var11, var5);
                }

                var1.J(var6, var7, var8, var9);
                if (!U) {
                    if (this.aP) {
                        M.c(this);
                    } else {
                        M.d(this);
                    }
                }
            } catch (Throwable var18) {
                var21 = var18;
                var10001 = false;
                break label285;
            }

            M.ao();
            if (this.bh != this.co && this.co == this.cj && this.J != null) {
                this.J.clear();
                this.J = null;
            }

            return true;
        }

        Throwable var20 = var21;
        M.ao();
        if (this.bh != this.co && this.co == this.cj && this.J != null) {
            this.J.clear();
            this.J = null;
        }

        throw var20;
    }

    private void Code(Code var1, char[] var2, int var3, int var4, int var5, int var6) {
        int var7 = 1;
        int var8 = Math.max(var6 / a(var5), 1);

        int var9;
        for(var9 = 0; var9 < var3 && var7 <= var8; ++var9) {
            var7 += (var2[var9] - 10 | -(var2[var9] - 10)) >>> 31 ^ 1;
        }

        for(var3 = var7; var9 > 0; --var9) {
            --var3;
            var8 = this.cy + this.O(var6 * var3 / var7);
            int var10 = 0;
            if (var3 == 0) {
                var10 = var9;
                var9 = 0;
            } else {
                while(var2[var9 - 1] != '\n') {
                    ++var10;
                    --var9;
                    if (var9 == 0) {
                        break;
                    }
                }
            }

            if (var10 > 0 && var2[var9 + var10 - 1] == '\r') {
                --var10;
            }

            v();
            int var10003 = var10;
            int var10005 = var8;
            var8 = this.cj;
            var10 = this.co;
            boolean var11 = this.aX;
            int var12 = var10005;
            int var13 = this.cx;
            int var14 = var10003;
            if (var11) {
                Code(var1, var5, var2, var9, var14, var13, var12, var4);
            } else {
                int var20 = var12;
                var12 = var13;
                var13 = var14;
                var14 = var9;
                char[] var15 = var2;
                M(var1.Code.getClipWidth());
                int var17;
                int var18;
                if ((var17 = J(var5) << 6) != bO || var4 != bN) {
                    for(var18 = 0; var18 < n.length; ++var18) {
                        n[var18] = var17 + l[var18] << 24 | var4 & 16777215;
                    }

                    bO = var17;
                    bN = var4;
                }

                var8 = ((Code(var5, var2, var9, var13) + 1) * var10 - 1) / var8;
                if ((var8 = Math.min((m.length >> 1) - 1, var8)) > 0 && var20 >= 0) {
                    var10 = Math.max(var8 / var13, 1);
                    if (!T && V && !as) {
                        var17 = (var9 << 1 | var13 << 2 ^ var8) % (m.length / 2 - var8) & -2;

                        for(var18 = 0; var18 < var8; ++var18) {
                            m[var18] = n[var17 + var18];
                            m[var8 + var18] = n[(n.length >> 1) + var17 + var18];
                        }

                        for(var17 = var9; var17 < var14 + var13; ++var17) {
                            if (var15[var17] == ' ') {
                                var18 = (var17 - var14) * var10;
                                int var19 = Math.min(var10, (m.length >> 1) - var18);
                                Z(m, var18, var19);
                                Z(m, var18 + var8, var19);
                            }
                        }

                        var10 = Math.max(0, -var12);
                        if (var8 > var10) {
                            var1.Code((int[])m, var10, var8 - var10, var12 + var10, var20, var8 - var10, 2);
                        }
                    } else {
                        var1.Z(var12, var20, var12 + var8, var20, var4);
                    }
                }
            }
        }

    }

    private void Code(Code var1, int var2, int var3, int var4, int var5, int[] var6, int var7, int var8) {
        if (var4 < var6[var7 + -2]) {
            if ((var4 = this.J(var6, var7, var8, var4)) != var8) {
                int var9;
                for(var9 = var4; var9 != var8; ++var9) {
                    this.t[var9 * 5 + 3] = this.t[var9 * 5 + 2];
                    if ((var6[var7 + var9] & -2147483648) == 0) {
                        this.Code(var1, var2, var3, var4, var9 - 1, var6, var7);

                        do {
                            ++var4;
                            if (var4 == var8) {
                                return;
                            }
                        } while((var6[var7 + var4] & -2147483648) == 0);

                        var9 = var4 - 1;
                    } else if ((var6[var7 + var9] & 16777215) > var5) {
                        this.Code(var1, var2, var3, var4, var9 - 1, var6, var7);
                        return;
                    }
                }

                this.Code(var1, var2, var3, var4, var9 - 1, var6, var7);
            }
        }
    }

    private void Code(Code var1, int var2, int var3, int var4) {
        int var5 = this.O();
        int var6 = this.O();
        String var7 = this.j();
        String var8 = this.j();
        int var9 = this.L();
        this.N();
        String var10;
        if (!this.Code.contains(var7) && !this.K.J.containsKey(var7)) {
            var10 = null;
            if (var7.equals(this.q)) {
                var10 = Integer.toString(0);
            } else if (var7.equals(this.r)) {
                var10 = Integer.toString(1);
            } else if (this.B.containsKey(var7)) {
                var10 = var7;
            }

            if (var10 != null) {
                String var10001 = var10;
                var10 = this.B.containsKey(var10) ? null : var8;
                String var12 = var10001;
                String var14 = null;
                if (var7 == null || this.Code.contains(var7) || this.K.J.containsKey(var7) || var10 != null && var10.length() != 0 && this.K.e() != null && this.K.e().indexOf(var7 + "=") != -1) {
                    if (var10 != null && var10.length() > 0) {
                        var14 = var10;
                    }
                } else {
                    var14 = (String)this.B.remove(var12);
                }

                if (var14 != null) {
                    this.K.Code(var14, var5, var7);
                }
            }
        }

        String var11;
        if ((var11 = var10 = (String)this.K.J.get(var7)) == null) {
            var11 = var8;
        }

        int var13;
        int var18;
        char[] var22;
        var22 = null;
        var13 = 0;
        label139:
        switch(var5) {
            case 83:
            case 85:
            case 120:
                var13 = (var22 = var11.toCharArray()).length;
                break;
            case 97:
                var3 = this.K.C;
                if ((var13 = var11.length()) > I.length) {
                    Integer var16 = new Integer(var11.hashCode());
                    if (this.J == null) {
                        this.J = new Hashtable();
                    }

                    boolean var17 = false;
                    if (this.J.containsKey(var16)) {
                        var22 = (char[])this.J.get(var16);
                        if (this.co != this.bh && (this.co == this.cj || this.co == v())) {
                            var17 = true;
                        }
                    } else {
                        var22 = new char[var13];
                        var17 = true;
                    }

                    if (var17) {
                        var11.getChars(0, var13, var22, 0);
                        var13 = Code(var22, var13, var3, this.Q(this.cz));
                        this.J.put(var16, var22);
                    }
                } else {
                    var22 = I;
                    var11.getChars(0, var13, var22, 0);
                    var13 = Code(var22, var13, var3, this.Q(this.cz));
                }
                break;
            case 99:
                if (((var10 != null ? 1 : 0) ^ (var6 & 2 | -(var6 & 2)) >>> 31) != 0) {
                    var1.Code(this.Code(this.aX ? 256 : this.H(), var3, var4), this.cx, this.cy);
                }
                break;
            case 102:
                if (this.K.B != null && this.K.B.containsKey(var7)) {
                    String var15;
                    if ((var5 = (var15 = (String)((Object[])this.K.B.get(var7))[0]).lastIndexOf(47)) >= 0 && var5 < var15.length()) {
                        var15 = var15.substring(var5 + 1);
                    }

                    var13 = (var22 = var15.toCharArray()).length;
                }
                break;
            case 112:
                var22 = new char[var13 = var11.length()];
                var3 = 0;

                while(true) {
                    if (var3 >= var22.length) {
                        break label139;
                    }

                    var22[var3] = Code;
                    ++var3;
                }
            case 114:
                if (var10 != null) {
                    if (!var10.equals(var8)) {
                        break;
                    }
                } else if ((var6 & 2) == 0) {
                    break;
                }

                int var23 = this.cx + 1;
                int var10002 = this.cy + 1;
                int var10003 = this.cz - 3;
                var3 = this.cA - 3;
                var5 = var10003;
                var6 = var10002;
                var18 = var23;
                var1.Code.setColor(4210752);
                var1.Code.fillArc(var18, var6, var5, var3, -90, 360);
                break;
            case 115:
                var3 = this.cD;
                this.cD = var9;
                var5 = this.L();
                var7 = "\u0000" + var11 + "\u0000";

                StringBuffer var19;
                for(var19 = new StringBuffer(); var5 > 0; --var5) {
                    String var20 = this.j();
                    var10 = this.j();
                    boolean var21 = var7.indexOf("\u0000" + var20 + "\u0000") >= 0;
                    if ((var6 & 4) == 0) {
                        if (var21) {
                            var19.append(var10).append("\n");
                            break;
                        }
                    } else {
                        if (var21) {
                            var19.append("*");
                        }

                        var19.append(var10).append("\n");
                    }
                }

                this.cD = var3;
                var13 = (var22 = var19.toString().toCharArray()).length;
        }

        if (var22 != null) {
            var3 = var1.Code.getClipX();
            var5 = var1.Code.getClipY();
            var6 = var1.Code.getClipWidth();
            var18 = var1.Code.getClipHeight();
            var1.B(this.cx, this.cy, this.cz, this.cA);
            this.Code(var1, var22, var13, var2, this.K.C, var4);
            var1.J(var3, var5, var6, var18);
        }

    }

    private int T(int var1) {
        this.cD = var1 + 1 + 1 + 10 * this.g[var1 + 1];
        this.cD += 2;
        return this.cD = this.L();
    }

    private synchronized int Code(int var1, int var2, int var3, int var4) {
        var3 = G(var3);
        var1 = this.Z(Code, Code, var3, var1);
        d(2 * this.K.J.size() + 6);
        String var7 = "x";
        e(Code("x"));
        e(Code(String.valueOf(var2)));
        String var5 = "y";
        e(Code("y"));
        e(Code(String.valueOf(var1)));
        if (this.F(var4) == 83) {
            this.cD = var4 + 2 + 10 * this.g[var4 + 1];
            e(Code(e(this.j())));
            var1 = ad;

            for(var2 = this.O(); var2 > 0; --var2) {
                if (this.O() == 116) {
                    var1 = Code(e(this.j()));
                    break;
                }

                this.cD += this.N();
            }

            e(var1);
        }

        Enumeration var6 = this.K.J.keys();

        while(var6.hasMoreElements()) {
            if (!(var5 = (String)var6.nextElement()).startsWith("o:")) {
                e(Code(e(var5)));
                e(Code(e(this.K.J.get(var5).toString())));
            }
        }

        return l();
    }

    private int Q() {
        int var1 = 0;

        for(int var2 = this.O(); var2 > 0; --var2) {
            switch(this.O()) {
                case 66:
                    var1 += 2;
                    break;
                case 70:
                    ++var1;
                    break;
                case 108:
                    var1 += 4;
                    break;
                case 114:
                    var1 += 8;
            }

            this.cD += this.N();
        }

        return var1;
    }

    private synchronized boolean B(int var1, int var2) {
        if (this.cG == -1) {
            return false;
        } else {
            int var3 = G(var2);
            int[] var4 = Code;
            int var5 = Code;
            this.cD = this.cG;

            while(this.cD <= this.ct) {
                this.cG = this.cD++;

                for(int var6 = this.O(); var6 > 0; --var6) {
                    this.ay();
                    this.cy = this.I(var4, var5, var3, this.cy);
                    if (this.cy < 0) {
                        this.cD += (var6 - 1) * 10;
                        break;
                    }

                    if (Code(this.cH, this.cI, this.cJ, this.cK, this.cx, this.cy, this.cz, this.cA)) {
                        this.c(var1, var2, this.cG);
                        this.cG = this.cD;
                        return true;
                    }
                }

                this.cD += this.N();
                this.aD();
            }

            return false;
        }
    }

    private synchronized int h(int var1, int var2) {
        if (var1 == 0) {
            return 0;
        } else {
            int var3;
            if ((var3 = l(var1)) == 0) {
                return 0;
            } else {
                J(var1, 0);
                var1 = var3 + Code;
                this.cD = this.cu;

                while(true) {
                    while(this.cD <= this.ct) {
                        var3 = this.cD++;
                        boolean var4 = false;

                        label45:
                        for(int var5 = this.O(); var5 > 0; --var5) {
                            this.ay();
                            int var6 = this.g(this.cy, this.bk);

                            for(int var7 = Code; var7 < var1; ++var7) {
                                if (Code[var7] == var6) {
                                    var4 = true;
                                    this.cD += (var5 - 1) * 10;
                                    break label45;
                                }
                            }
                        }

                        this.cD += this.N();
                        if (var4) {
                            for(int var8 = this.O(); var8 > 0; --var8) {
                                if (this.O() == 102) {
                                    O = var2;
                                    var1 = a(2, 64);
                                    var2 = O;
                                    O = 0;
                                    return this.c(var1, var2, var3);
                                }

                                this.cD += this.N();
                            }
                        } else {
                            this.aD();
                        }
                    }

                    return 0;
                }
            }
        }
    }

    private synchronized Code Z(int var1, int var2, int var3) {
        if (this.cu == 0) {
            return new Code(this, var1, var2, (String)null, (String)null, (String)null, 0);
        } else {
            String var4 = null;
            String var5 = null;
            String var6 = null;
            int var7 = 0;
            int var8 = 0;
            this.cD = this.cu;
            var3 = G(var3);
            int[] var9 = Code;
            int var10 = Code;

            while(this.cD <= this.ct) {
                int var11 = this.cD;
                int var12 = this.O();

                for(int var13 = this.O(); var13 > 0; --var13) {
                    this.ay();
                    this.cy = this.I(var9, var10, var3, this.cy);
                    if (this.cy >= 0 && Code(var1, var2, 1, 1, this.cx, this.cy, this.cz, this.cA)) {
                        this.cD += (var13 - 1) * 10;
                        var13 = this.cD;
                        switch(var12) {
                            case 73:
                                if (var7 == 0) {
                                    var7 = var11;
                                }
                                break;
                            case 76:
                                if (var4 == null) {
                                    var4 = this.k();
                                }
                                break;
                            case 78:
                                if (var4 == null) {
                                    this.cD += 7;
                                    var4 = this.o + "#" + this.j();
                                }
                                break;
                            case 83:
                                if (var8 == 0) {
                                    var8 = var11;
                                }
                                break;
                            case 105:
                                if (var5 == null) {
                                    var5 = this.k();
                                }

                                var11 = this.O();

                                while(var11 > 0 && var6 == null) {
                                    if (this.O() == 116) {
                                        var6 = this.j();
                                        --var11;
                                    } else {
                                        this.cD += this.N();
                                        --var11;
                                    }
                                }
                        }

                        this.cD = var13;
                        break;
                    }
                }

                this.cD += this.N();
                this.aD();
            }

            if (var7 != 0 || var8 != 0) {
                var4 = null;
                var5 = null;
            }

            return new Code(this, var1, var2, var4, var5, var6, var7);
        }
    }

    private static int B(byte[] var0, int var1, int var2) {
        if (var2 < 2) {
            return -1;
        } else {
            int var3;
            if ((var3 = B(var0, var1)) + 2 > var2) {
                return -1;
            } else {
                return !I(var0, var1 + 2, var3) ? -1 : var3 + 2;
            }
        }
    }

    private synchronized int Code(int var1, char var2, int var3) {
        int var4 = 0;
        var1 += 2 + 10 * this.g[var1 + 1];
        int var5;
        int var6;
        if (var2 == 0) {
            var6 = this.E(var1);
            var1 += 2;
            var4 = var6 + var1;
        } else {
            var1 += this.E(var1) + 2 + 1;

            for(var5 = this.g[var1 - 1]; var5 > 0; --var5) {
                if (this.F(var1++) == var2) {
                    var6 = this.E(var1);
                    var1 += 2;
                    var4 = var6 + var1;
                    break;
                }

                var1 += this.E(var1) + 2;
            }

            if (var4 < var1) {
                return 0;
            }
        }

        if (var3 == 0) {
            Z((var4 - var1) / 3, (var4 - var1) / 3);
        } else {
            Code(var3, (var4 - var1) / 3, false);
        }

        for(var6 = Code; var1 < var4; Code[var6++] = var3 << 16 | var5) {
            var3 = this.F(var1++);
            var5 = this.E(var1);
            var1 += 2;
        }

        return m();
    }

    private synchronized void I(int var1, String var2) {
        this.T(var1);
        this.cD += 15;
        var1 = this.O();
        ++this.cD;
        String var3 = this.j();
        this.K.Code(var2, var1, var3);
    }

    private static void Z(byte[] var0, int var1) {
        Code(var0 != null ? Code.Z(var0, var1) : 0);
    }

    private synchronized int S(int var1) {
        this.T(var1);
        this.cD += 15;
        return this.g[this.cD];
    }

    private synchronized String d(int var1) {
        this.T(var1);
        this.cD += 17;
        return this.j();
    }

    private synchronized int Code(Object var1, int var2) {
        int var3 = ((int[])((Object[])var1)[2])[var2];
        var2 = B(this.g, var3);
        return this.K(var3 + var2 + 2);
    }

    private synchronized String b(int var1) {
        this.T(var1);
        this.cD += 17;
        this.aA();
        return this.j();
    }

    private synchronized int Code(String var1, int[] var2, int var3) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        if (var2 != null) {
            var6 = G(var3);
            var4 = Code;
            var5 = Code;
        }

        if (var1.equals(this.K.d) && this.O != null) {
            if (!this.O.q()) {
                return 0;
            } else {
                this.K.b = this.K.b < this.O.Code.size() - 1 ? this.K.b + 1 : 0;
                if (var2 != null) {
                    this.Code(var4, var5, var6, var2);
                }

                return this.K.b != 0 ? 1 : 2;
            }
        } else {
            if (this.O != null) {
                this.aE();
            }

            this.K.d = var1;
            this.O = new Code(0, '\u0000');
            Code var10000 = this.O;
            var3 = this.cq;
            Code var8 = var10000;
            var10000.C = this;
            boolean var7 = false;

            for(int var9 = 0; var9 < var1.length(); ++var9) {
                if (J(var1.charAt(var9))) {
                    var7 = true;
                    break;
                }
            }

            int[] var38 = new int[]{var8.bh, var8.bn, 0, 0};

            int var10;
            for(var8.bp = var8.C.I(var3, var38); var8.bp != -1; var8.bp = var8.C.I(var10 + 2 + var8.C.E(var10), var38)) {
                var8.bh = var38[0];
                var8.bn = var38[1];
                boolean var34 = false;
                var10 = var8.bp + 17;

                for(int var11 = var8.C.F(var10++); var11 > 0; --var11) {
                    if (var8.C.F(var10++) == 116 && var8.C.a(var10).equals("s")) {
                        var34 = true;
                    }

                    var10 += var8.C.E(var10) + 2;
                }

                String var40 = var8.C.a(var10);
                if (var7) {
                    var1 = h(var1);
                    var40 = h(var40);
                }

                int var12 = var8.v(var10);

                for(var8.bm = 0; !var34 && var8.bm < var40.length(); ++var8.bm) {
                    int var10002 = var8.bp;
                    int var10003 = var8.bm;
                    int var10005 = var8.bh;
                    int var10006 = var8.bn;
                    int var10008 = var8.Code.size();
                    boolean var13 = var7;
                    int var14 = 1;
                    int var15 = var10008;
                    int var16 = var12;
                    int var17 = var10006;
                    int var18 = var10005;
                    String var19 = var40;
                    int var20 = var10003;
                    int var21 = var10002;
                    String var22 = var1;
                    Code var23 = var8;

                    int[][] var43;
                    int[][] var51;
                    label191:
                    while(true) {
                        int var25;
                        int var26;
                        int var27;
                        int var28;
                        int var29;
                        int var30;
                        if (var22.length() <= var19.length() - var20) {
                            if (!var19.regionMatches(true, var20, var22, 0, var22.length())) {
                                var51 = null;
                                break;
                            }

                            int var10001 = var23.bp;
                            var10002 = var23.bm;
                            var10003 = var23.bh;
                            int var10004 = var23.bn;
                            var10006 = var20 + var22.length();
                            int var42 = var14;
                            var14 = var15;
                            var15 = var10006;
                            var16 = var21;
                            var17 = var10004;
                            var18 = var10003;
                            int var44 = var10002;
                            var20 = var10001;
                            Code var45 = var23;
                            var43 = new int[var42][10];
                            int var46 = 0;

                            while(true) {
                                int var47 = var20 + 17;
                                boolean var48 = true;

                                for(var25 = var45.C.F(var47++); var25 > 0; --var25) {
                                    if (var45.C.F(var47++) == 114) {
                                        var48 = false;
                                    }

                                    var47 += var45.C.E(var47) + 2;
                                }

                                String var49 = var45.C.a(var47);
                                var26 = 0;
                                var27 = 0;

                                for(var28 = 0; var28 < var44; ++var28) {
                                    if (var49.charAt(var28) == '\n') {
                                        ++var26;
                                        var27 = var28 + 1;
                                    }
                                }

                                var29 = a(var28 = var45.C.E(var20 + 15));
                                var27 = Code(var28, var49.substring(var27, var44));
                                var30 = var44;
                                if (var20 == var16) {
                                    var16 = Code(var28, var49.substring(var44, var15));
                                    var15 -= var44;
                                    var43[var46] = Code(var20, var44, var15, var48 ? var27 : var45.C.E(var20 + 6) - var27 - var16, var29 * var26, var16, var29, var18, var17, var14);
                                    var51 = var43;
                                    break label191;
                                }

                                var47 = var45.v(var47);
                                int var31 = var18 + var45.C.E(var47 + 1);
                                int var32 = var17 + var45.C.D(var47 + 3);
                                var44 = Code(var28, var49.substring(var44, var49.length()));
                                var25 = var49.length() - var30;
                                var43[var46] = Code(var20, var30, var25, var48 ? var27 : 0, var29 * var26, var44, var29, var18, var17, var14);
                                var20 = var47;
                                var44 = 0;
                                var18 = var31;
                                var17 = var32;
                                ++var46;
                            }
                        }

                        if (var16 == -1 || !var19.regionMatches(true, var20, var22, 0, var19.length() - var20)) {
                            var51 = null;
                            break;
                        }

                        int var24 = var23.C.E(var21 + 6);
                        var21 = var23.C.D(var21 + 8);
                        var25 = var18 + var23.C.E(var16 + 1);
                        var26 = var17 + var23.C.D(var16 + 3);
                        var27 = var23.C.E(var16 + 6);
                        var28 = var23.C.D(var16 + 8);
                        var29 = var16 + 17;

                        for(var30 = var23.C.F(var29++); var30 > 0; --var30) {
                            ++var29;
                            var29 += var23.C.E(var29) + 2;
                        }

                        String var50 = var23.C.a(var29);
                        if (var13) {
                            var50 = h(var50);
                        }

                        var29 = var23.v(var29);
                        String var52;
                        if (I(var18, var17, var24, var21, var25, var26, var27, var28)) {
                            if (var22.charAt(var19.length() - var20) != ' ' || var22.length() <= var19.length() - var20 + 1) {
                                var51 = null;
                                break;
                            }

                            var52 = var22.substring(var19.length() - var20 + 1);
                            var10002 = var16;
                            ++var14;
                            var15 = var15;
                            var16 = var29;
                            var17 = var26;
                            var18 = var25;
                            var19 = var50;
                            var20 = 0;
                            var21 = var10002;
                            var22 = var52;
                            var23 = var23;
                        } else {
                            var52 = var22.substring(var19.length() - var20);
                            var10002 = var16;
                            ++var14;
                            var15 = var15;
                            var16 = var29;
                            var17 = var26;
                            var18 = var25;
                            var19 = var50;
                            var20 = 0;
                            var21 = var10002;
                            var22 = var52;
                            var23 = var23;
                        }
                    }

                    var43 = var51;
                    if (var51 != null) {
                        var8.Code.addElement(var43);
                    }
                }
            }

            Code var33 = var8;
            Enumeration var35 = var8.Code.elements();

            while(var35.hasMoreElements()) {
                int[][] var36 = (int[][])var35.nextElement();
                int var37 = 0;

                while(var37 < var36.length) {
                    var38 = var36[var37];
                    Integer var39 = new Integer(var38[0]);
                    if (var33.B.containsKey(var39)) {
                        ((Vector)var33.B.get(var39)).addElement(var38);
                        ++var37;
                    } else {
                        Vector var41;
                        (var41 = new Vector()).addElement(var38);
                        var33.B.put(var39, var41);
                        ++var37;
                    }
                }
            }

            if (this.O.q()) {
                if (this.K.b == -1) {
                    this.K.b = 0;
                }

                if (var2 != null) {
                    this.Code(var4, var5, var6, var2);
                }

                return 1;
            } else {
                return 0;
            }
        }
    }

    private int U(int var1) {
        int var2 = 0;
        if (Q && var1 > 0 && this.g != null) {
            var2 = 0 + this.g.length;
            if (this.t != null) {
                var2 += this.t.length << 2;
            }

            var1 = Math.max(1, var1 - var2);
        }

        if (this.L != null) {
            this.N.d(var1, this.L.bh);
            return var2 + this.N.bh + this.N.b;
        } else {
            this.N.d(var1, 0);
            return var2 + this.N.bh;
        }
    }

    private int R() {
        int var1 = 0;
        if (Q && this.g != null) {
            var1 = 0 + this.g.length;
            if (this.t != null) {
                var1 += this.t.length << 2;
            }
        }

        return this.L != null ? var1 + this.N.bh + this.N.b : var1 + this.N.bh;
    }

    private static int J(byte[] var0, int var1, int var2) {
        if (var2 < 2) {
            return -1;
        } else {
            int var3;
            if ((var3 = B(var0, var1)) + 2 > var2) {
                return -1;
            } else {
                return !Code(var0, var1 + 2, var3) ? -1 : var3 + 2;
            }
        }
    }

    private synchronized int S() {
        if (this.y == null) {
            return 0;
        } else {
            int var10000 = this.y.length;
            Z(var10000, var10000);
            System.arraycopy(this.y, 0, Code, Code, this.y.length);
            return m();
        }
    }

    private synchronized int T() {
        int var10000 = this.bk * 5;
        Z(var10000, var10000);
        System.arraycopy(this.t, 0, Code, Code, this.bk * 5);
        return m();
    }

    private synchronized int j(int var1, int var2) {
        if (this.y == null) {
            return 0;
        } else {
            int var3;
            var1 = (var3 = this.y[var1 * 5 + 1]) + this.y[var1 * 5 + 2];
            int var4;
            int var5 = var4 = this.g(var3, this.bk);

            while(true) {
                int var6;
                int var7 = (var6 = this.t[var5 * 5]) + this.t[var5 * 5 + 1];
                if (var6 < var3 || var7 > var1) {
                    if (var2 == 0) {
                        Z(var5 - var4, var5 - var4);
                        var1 = var4;
                    } else {
                        Code(var2, var5 - var4, false);
                        var1 = var4;
                    }

                    while(var1 < var5) {
                        Code[Code + (var1 - var4)] = var1++;
                    }

                    return m();
                }

                ++var5;
            }
        }
    }

    public static void Code(byte[] var0, int var1, int var2) {
        Code(var0 != null ? Code.Z(var0, var1) : 0);
        I((int)0);
        I(var2);
    }

    private static void Code(char[] var0, int var1, int var2, int var3, J var4, Code var5) {
        int var6 = 0;
        int var7 = var0.length;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;

        while(var6 < var7) {
            char var12 = var0[var6];
            char var13 = 0;
            if (var6 + 1 < var7) {
                var13 = var0[var6 + 1];
            }

            if (((I(var12) & 8) != 0 || (I(var13) & 4) != 0 || I(var12) == 0 && I(var13) == 0) && !c(var12) && var6 != var7 - 1) {
                ++var6;
            } else {
                byte var14 = 0;
                int var15 = c(var12) ? var12 : 0;
                if (var12 == '\r' && var13 == '\n') {
                    ++var6;
                    var14 = 2;
                    var15 = -1;
                } else if (var12 == ' ' || c(var12)) {
                    var14 = 1;
                }

                int var22 = var6 - var8 + 1;
                int var16 = var6 - var10 + 1;
                int var17;
                int var18 = var17 = var4.Code(var0, var10, var16);
                if (var14 != 0) {
                    var17 = var4.Code(var0, var10, var16 - var14);
                }

                if (var9 + var17 > I(var11, var2, var1, var3)) {
                    if (var8 != var10) {
                        var22 = var10 - var8;
                    } else if (var16 - var14 != 1 && (!a(var12) || var16 - var14 != 2)) {
                        var9 = I(var11, var2, var1, var3) - var9;
                        int var21 = var10 + Code(var0, var10) + 1;

                        for(var6 -= var14; var6 > var21; --var6) {
                            if (Code(var0, var6 - 1)) {
                                --var6;
                            }

                            if (var4.Code(var0, var10, var6 - var10) <= var9 || var6 <= var21) {
                                break;
                            }
                        }

                        var22 = Math.max(var6, var21) - var8;
                    }

                    if (Code(var5, var0, var8, var22, var11, var2, var3, 0)) {
                        break;
                    }

                    ++var11;
                    var6 = var10 = var8 += var22;
                    var9 = 0;
                } else if (!c(var12) && var6 != var7 - 1) {
                    var9 += var18;
                    var10 += var16;
                    ++var6;
                } else {
                    boolean var20 = c(var12) && var8 + var22 == var7;
                    byte var19 = var3 == 0 && var5 == null ? 0 : var14;
                    if (Code(var5, var0, var8, var22 - var19, var11, var2, var6 == var7 - 1 && !var20 ? 0 : var3, var15)) {
                        break;
                    }

                    ++var11;
                    var6 = var10 = var8 += var22;
                    var9 = 0;
                    if (var20) {
                        Code(var5, var0, 0, 0, var11, var2, 0, 0);
                        return;
                    }
                }
            }
        }

    }

    public static void a() {
        Code((int)0);
        Code((int)0);
        I((int)-1);
    }

    public static void Code(int var0, int var1, int var2) {
        I(var0);
        I(var1);
        I(var2);
    }

    public static void Z(int var0, int var1, int var2) {
        I(var0);
        I(var1);
        I(var2);
        I((int)0);
    }

    public static void Code(int var0, boolean var1) {
        Code(Z(var0));
        I((int)var1);
        I((int)1);
    }

    public static void Code(int var0, int var1, int var2, int var3, int var4) {
        Code((int)0);
        Code((int)0);
        I(var0);
        I((int)0);
        I(var1);
        I(var2);
        I(var3);
        I(var4);
    }

    public static void I(int var0, int var1, int var2) {
        I(var0);
        I(var1);
        I(var2);
        I((int)0);
    }

    public static void J(int var0, int var1, int var2) {
        I(var0);
        I(var1);
        I(var2);
        I((int)0);
    }

    public final byte[] Code(String var1) {
        return this.b.Code(var1);
    }

    public final boolean Code(String var1) {
        return this.b.Code(var1);
    }

    public final int Code(byte[] var1, String var2) {
        return this.b.Code(var1, var2);
    }

    public final boolean I(String var1) {
        return this.b.I(var1);
    }

    public final Code Code(String var1, boolean var2, int var3) {
        return this.b.Code(var1, var2, var3);
    }

    public final String Z(int var1) {
        return this.b.Z(var1);
    }

    public final String Code(Code var1, String var2) {
        return this.b.Code(var1, var2);
    }

    public final boolean Z(String var1) {
        return this.b.Z(var1);
    }

    public final long Code(String var1) {
        return this.b.Code(var1);
    }

    public final int Z(String var1) {
        return this.b.Z(var1);
    }

    public final Code Code(String var1) {
        for(int var2 = 0; var2 < this.cs; ++var2) {
            Code var3;
            if ((var3 = this.B[var2]).J(var1)) {
                return var3;
            }
        }

        return null;
    }

    public final void Code(String var1) {
        for(int var2 = 0; var2 < this.cs; ++var2) {
            if (this.B[var2].J(var1)) {
                while(var2 < this.cs - 1) {
                    this.B[var2] = this.B[var2 + 1];
                    ++var2;
                }

                this.B[--this.cs] = null;
            }
        }

    }

    public final long I(String var1) {
        return this.b.I(var1);
    }

    private void B(byte[] var1, int var2) {
        for(int var3 = var2; var3 < 64; ++var3) {
            this.h[var3] = 0;
        }

        System.arraycopy(var1, 0, this.h, 0, Math.min(64, var2));
        this.s.B(this.h, 0, 64);
        this.s.C(this.Code, 0, 32);
    }

    private void C(byte[] var1, int var2) {
        this.s.B(this.Code, 0, 32);
        this.s.B(this.h, 0, 64);
        this.s.C(var1, var2, 32);
        this.s.B(this.Code, 0, 32);
        this.s.C(this.Code, 0, 32);
    }
}
