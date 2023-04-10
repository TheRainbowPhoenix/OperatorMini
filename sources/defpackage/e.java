package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
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
import javax.microedition.rms.RecordComparator;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordFilter;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/* renamed from: e  reason: default package */
public final class e implements Runnable {
    static int A = 0;

    /* renamed from: A  reason: collision with other field name */
    static boolean f226A;
    static int B = 6;

    /* renamed from: B  reason: collision with other field name */
    static long f227B = 0;

    /* renamed from: B  reason: collision with other field name */
    static String f228B = "";

    /* renamed from: B  reason: collision with other field name */
    private static Hashtable f229B = null;

    /* renamed from: B  reason: collision with other field name */
    static Vector f230B = new Vector();

    /* renamed from: B  reason: collision with other field name */
    private static Image f231B;
    static long C;

    /* renamed from: C  reason: collision with other field name */
    static String f232C;

    /* renamed from: C  reason: collision with other field name */
    private static Hashtable f233C;

    /* renamed from: C  reason: collision with other field name */
    static Vector f234C = null;

    /* renamed from: C  reason: collision with other field name */
    private static Image f235C;

    /* renamed from: C  reason: collision with other field name */
    private static byte[] f236C = new byte[0];
    private static J Code;

    /* renamed from: Code  reason: collision with other field name */
    private static g f237Code;

    /* renamed from: Code  reason: collision with other field name */
    private static Integer f238Code = new Integer(0);

    /* renamed from: Code  reason: collision with other field name */
    private static Object f239Code = new Object();

    /* renamed from: Code  reason: collision with other field name */
    static Hashtable f240Code = new Hashtable();

    /* renamed from: Code  reason: collision with other field name */
    private static Random f241Code = new Random(System.currentTimeMillis());

    /* renamed from: Code  reason: collision with other field name */
    private static Stack f242Code = new Stack();

    /* renamed from: Code  reason: collision with other field name */
    static boolean f243Code = true;

    /* renamed from: Code  reason: collision with other field name */
    static final byte[] f244Code = new byte[8];

    /* renamed from: Code  reason: collision with other field name */
    static final int[] f245Code = {553648128, 1090519040, -2130706432, -1593835520};

    /* renamed from: Code  reason: collision with other field name */
    private static e[] f246Code;

    /* renamed from: Code  reason: collision with other field name */
    static String[] f247Code;

    /* renamed from: Code  reason: collision with other field name */
    static Font[] f248Code;

    /* renamed from: Code  reason: collision with other field name */
    private static byte[][] f249Code;

    /* renamed from: Code  reason: collision with other field name */
    private static char[][] f250Code;
    static int D = -1;

    /* renamed from: D  reason: collision with other field name */
    static boolean f251D;
    static int E;

    /* renamed from: E  reason: collision with other field name */
    static boolean f252E;
    static int F = -1;

    /* renamed from: F  reason: collision with other field name */
    static boolean f253F;
    static int G = 0;

    /* renamed from: G  reason: collision with other field name */
    static boolean f254G;
    static int H;

    /* renamed from: H  reason: collision with other field name */
    static boolean f255H;
    private static byte I = -1;

    /* renamed from: I  reason: collision with other field name */
    static int f256I;

    /* renamed from: I  reason: collision with other field name */
    static long f257I;

    /* renamed from: I  reason: collision with other field name */
    static e f258I = new e((byte) 0);

    /* renamed from: I  reason: collision with other field name */
    static String f259I;

    /* renamed from: I  reason: collision with other field name */
    static Hashtable f260I = new Hashtable();

    /* renamed from: I  reason: collision with other field name */
    static Vector f261I = new Vector();

    /* renamed from: I  reason: collision with other field name */
    static int[] f262I;

    /* renamed from: I  reason: collision with other field name */
    private static e[] f263I;

    /* renamed from: I  reason: collision with other field name */
    static String[] f264I = new String[3];
    private static byte J = -1;

    /* renamed from: J  reason: collision with other field name */
    static int f265J = -1;

    /* renamed from: J  reason: collision with other field name */
    static long f266J = 0;

    /* renamed from: J  reason: collision with other field name */
    static String f267J;

    /* renamed from: J  reason: collision with other field name */
    private static Hashtable f268J;

    /* renamed from: J  reason: collision with other field name */
    static Vector f269J = null;

    /* renamed from: J  reason: collision with other field name */
    private static Image f270J;

    /* renamed from: J  reason: collision with other field name */
    static boolean f271J;

    /* renamed from: J  reason: collision with other field name */
    private static String[] f272J = null;
    public static int K = -1;

    /* renamed from: K  reason: collision with other field name */
    static boolean f273K;
    public static int L = -1;

    /* renamed from: L  reason: collision with other field name */
    static boolean f274L;
    static boolean M;
    static boolean N;
    static boolean O;
    static boolean P;
    static boolean Q;
    static boolean R;
    static boolean S;
    static boolean T;
    static boolean U;
    static boolean V;
    private static int W;

    /* renamed from: W  reason: collision with other field name */
    static boolean f275W;
    private static int X;

    /* renamed from: X  reason: collision with other field name */
    static boolean f276X;
    private static int Y = -1;

    /* renamed from: Y  reason: collision with other field name */
    static boolean f277Y;
    private static byte Z = -1;

    /* renamed from: Z  reason: collision with other field name */
    static int f278Z;

    /* renamed from: Z  reason: collision with other field name */
    static long f279Z = 32768;

    /* renamed from: Z  reason: collision with other field name */
    static String f280Z;

    /* renamed from: Z  reason: collision with other field name */
    private static Hashtable f281Z;

    /* renamed from: Z  reason: collision with other field name */
    static Vector f282Z = null;

    /* renamed from: Z  reason: collision with other field name */
    private static final int[] f283Z = m171Code(m164Code("428a2f9871374491b5c0fbcfe9b5dba53956c25b59f111f1923f82a4ab1c5ed5d807aa9812835b01243185be550c7dc372be5d7480deb1fe9bdc06a7c19bf174e49b69c1efbe47860fc19dc6240ca1cc2de92c6f4a7484aa5cb0a9dc76f988da983e5152a831c66db00327c8bf597fc7c6e00bf3d5a7914706ca63511429296727b70a852e1b21384d2c6dfc53380d13650a7354766a0abb81c2c92e92722c85a2bfe8a1a81a664bc24b8b70c76c51a3d192e819d6990624f40e3585106aa07019a4c1161e376c082748774c34b0bcb5391c0cb34ed8aa4a5b9cca4f682e6ff3748f82ee78a5636f84c878148cc7020890befffaa4506cebbef9a3f7c67178f2"), 0, 256);

    /* renamed from: Z  reason: collision with other field name */
    private static Object[] f284Z = null;
    static int a;

    /* renamed from: a  reason: collision with other field name */
    static long f285a;

    /* renamed from: a  reason: collision with other field name */
    static String f286a = "";

    /* renamed from: a  reason: collision with other field name */
    static Vector f287a = new Vector();

    /* renamed from: a  reason: collision with other field name */
    private static Image f288a;

    /* renamed from: a  reason: collision with other field name */
    static boolean f289a;

    /* renamed from: a  reason: collision with other field name */
    private static byte[] f290a = null;

    /* renamed from: a  reason: collision with other field name */
    private static int[] f291a = new int[29];
    static boolean aA = true;
    static boolean aB = true;
    static boolean aC = false;
    static boolean aD = false;
    static boolean aE;
    static boolean aF = false;
    private static boolean aG;
    private static boolean aH;
    private static boolean aI;
    private static boolean aJ;
    private static int aK = 256;

    /* renamed from: aK  reason: collision with other field name */
    private static boolean f292aK;
    private static int aL;
    private static int aM = -1;

    /* renamed from: aM  reason: collision with other field name */
    private static boolean f293aM;
    private static int aN;
    private static int aO;
    private static int aP;
    private static int aQ;
    private static int aR;
    private static int aS;
    private static int aT;
    private static int aU;
    private static int aV;
    private static int aW;

    /* renamed from: aW  reason: collision with other field name */
    private static boolean f294aW;
    private static int aX = 0;

    /* renamed from: aX  reason: collision with other field name */
    private static boolean f295aX;
    private static int aY;

    /* renamed from: aY  reason: collision with other field name */
    private static boolean f296aY;
    private static int aZ = -1;

    /* renamed from: aZ  reason: collision with other field name */
    private static boolean f297aZ;
    static boolean aa;
    static boolean ab;
    static boolean ac;
    static boolean ad;
    static boolean ae;
    static boolean af;
    static boolean ag;
    static boolean ah;
    static boolean ai;
    static boolean aj;
    static boolean ak;
    static boolean al;
    static boolean am = true;
    static boolean an = false;
    static boolean ao = true;
    static boolean ap;
    static boolean aq;
    static boolean ar = false;
    static boolean as;
    static boolean at;
    static boolean au = true;
    static boolean av = true;
    static boolean aw;
    static boolean ax = true;
    static boolean ay = true;
    static boolean az = false;
    static int b = -1;

    /* renamed from: b  reason: collision with other field name */
    static long f298b;

    /* renamed from: b  reason: collision with other field name */
    static String f299b;

    /* renamed from: b  reason: collision with other field name */
    private static Vector f300b = new Vector(2);

    /* renamed from: b  reason: collision with other field name */
    private static byte[] f301b = new byte[8];

    /* renamed from: b  reason: collision with other field name */
    private static int[] f302b = new int[30];
    private static int ba = -1;

    /* renamed from: ba  reason: collision with other field name */
    private static boolean f303ba;
    private static int bb;

    /* renamed from: bb  reason: collision with other field name */
    private static boolean f304bb = true;
    private static boolean bc;
    private static boolean bd;
    private static boolean be;
    private static boolean bf;
    private static boolean bg;
    private static boolean bh;
    private static boolean bi;
    private static boolean bj;
    private static boolean bk = true;
    private static boolean bl;
    private static boolean bm = false;
    private static boolean bn = false;
    private static boolean bo = false;
    private static boolean bp = false;
    private static boolean bq = false;
    private static boolean br = false;
    private static boolean bs;
    static int c;

    /* renamed from: c  reason: collision with other field name */
    static long f305c;

    /* renamed from: c  reason: collision with other field name */
    static String f306c;

    /* renamed from: c  reason: collision with other field name */
    static boolean f307c = true;

    /* renamed from: c  reason: collision with other field name */
    private static byte[] f308c;

    /* renamed from: c  reason: collision with other field name */
    private static int[] f309c = new int[64];
    static int d = 400;

    /* renamed from: d  reason: collision with other field name */
    private static long f310d;

    /* renamed from: d  reason: collision with other field name */
    private static int[] f311d = null;
    static int e = 2;

    /* renamed from: e  reason: collision with other field name */
    public static String f312e;

    /* renamed from: e  reason: collision with other field name */
    private static int[] f313e;
    static int f;

    /* renamed from: f  reason: collision with other field name */
    static String f314f;

    /* renamed from: f  reason: collision with other field name */
    private static Vector f315f = null;

    /* renamed from: f  reason: collision with other field name */
    private static int[] f316f;
    static int g = -1;

    /* renamed from: g  reason: collision with other field name */
    private static long f317g;

    /* renamed from: g  reason: collision with other field name */
    private static e f318g = new e("i", "*", 0, "/firsttime-nhorizon/*", 1);

    /* renamed from: g  reason: collision with other field name */
    static String f319g;

    /* renamed from: g  reason: collision with other field name */
    private static int[] f320g;
    static int h = -1;

    /* renamed from: h  reason: collision with other field name */
    private static e f321h = new e("server", "*", 0, "setup", 1);

    /* renamed from: h  reason: collision with other field name */
    static String f322h;

    /* renamed from: h  reason: collision with other field name */
    private static int[] f323h;
    static int i = -1;

    /* renamed from: i  reason: collision with other field name */
    private static e f324i = new e(0, 0, "mini4cn.opera-mini.net", 80, 1080, "8c60d2a6811f85366af231ae416831b09409b614e9cfa8fde8d8577e892636e0e0b7a151f9601b930bf527ea8a22bfe6fb5f72506bd3e81b3b55d189af17e35b2d7ea61d84ba4e62cf1c01789edb2c3f3c00fc3c09ee1fc9627367294727e52af4c990516d8d7aad4e00d6ab50cd8ca63705df0af243e666dad282d6514b656780e108d591cf78920f7bdee21ed1419a080655ca2acdadc4e64dba01b5accf73", "mini4cn.opera-mini.net");

    /* renamed from: i  reason: collision with other field name */
    static String f325i = "classic";

    /* renamed from: i  reason: collision with other field name */
    private static int[] f326i = {0, 5, 3, 6};
    static int j = 1;

    /* renamed from: j  reason: collision with other field name */
    private static e f327j;

    /* renamed from: j  reason: collision with other field name */
    static String f328j;

    /* renamed from: j  reason: collision with other field name */
    private static int[] f329j = {1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    static int k = -1;

    /* renamed from: k  reason: collision with other field name */
    static String f330k = "";

    /* renamed from: k  reason: collision with other field name */
    static boolean f331k;
    static int l = 1;

    /* renamed from: l  reason: collision with other field name */
    static String f332l = "";

    /* renamed from: l  reason: collision with other field name */
    static boolean f333l;
    static int m = 0;

    /* renamed from: m  reason: collision with other field name */
    static String f334m = "";

    /* renamed from: m  reason: collision with other field name */
    static boolean f335m;
    static int n;

    /* renamed from: n  reason: collision with other field name */
    static String f336n = "";

    /* renamed from: n  reason: collision with other field name */
    static boolean f337n;
    static int o = 0;

    /* renamed from: o  reason: collision with other field name */
    static String f338o = "";

    /* renamed from: o  reason: collision with other field name */
    static boolean f339o;
    static int p = 0;

    /* renamed from: p  reason: collision with other field name */
    static String f340p = "";

    /* renamed from: p  reason: collision with other field name */
    static boolean f341p;
    static int q = 0;

    /* renamed from: q  reason: collision with other field name */
    static String f342q = "";

    /* renamed from: q  reason: collision with other field name */
    static boolean f343q;
    static int r = -1;

    /* renamed from: r  reason: collision with other field name */
    static boolean f344r;
    static int s;

    /* renamed from: s  reason: collision with other field name */
    private static String f345s = "";

    /* renamed from: s  reason: collision with other field name */
    static boolean f346s;
    static int t = 0;

    /* renamed from: t  reason: collision with other field name */
    private static String f347t = "";

    /* renamed from: t  reason: collision with other field name */
    static boolean f348t;
    static int u = 0;

    /* renamed from: u  reason: collision with other field name */
    static boolean f349u;
    static int v = -1;

    /* renamed from: v  reason: collision with other field name */
    static boolean f350v;
    static int w = 0;

    /* renamed from: w  reason: collision with other field name */
    private static String f351w = null;

    /* renamed from: w  reason: collision with other field name */
    static boolean f352w;
    static int x = 0;

    /* renamed from: x  reason: collision with other field name */
    static boolean f353x;
    static int y = 0;

    /* renamed from: y  reason: collision with other field name */
    static boolean f354y;
    static int z = -2;

    /* renamed from: z  reason: collision with other field name */
    static boolean f355z;

    /* renamed from: B  reason: collision with other field name */
    private e f356B;

    /* renamed from: B  reason: collision with other field name */
    public boolean f357B;

    /* renamed from: B  reason: collision with other field name */
    private byte[] f358B;

    /* renamed from: B  reason: collision with other field name */
    private int[] f359B;

    /* renamed from: C  reason: collision with other field name */
    int f360C;

    /* renamed from: C  reason: collision with other field name */
    private e f361C;

    /* renamed from: C  reason: collision with other field name */
    public boolean f362C;

    /* renamed from: C  reason: collision with other field name */
    private int[] f363C;

    /* renamed from: Code  reason: collision with other field name */
    private byte f364Code;

    /* renamed from: Code  reason: collision with other field name */
    int f365Code;

    /* renamed from: Code  reason: collision with other field name */
    public long f366Code;

    /* renamed from: Code  reason: collision with other field name */
    public B f367Code;

    /* renamed from: Code  reason: collision with other field name */
    private I f368Code;

    /* renamed from: Code  reason: collision with other field name */
    e f369Code;

    /* renamed from: Code  reason: collision with other field name */
    private DataInputStream f370Code;

    /* renamed from: Code  reason: collision with other field name */
    private DataOutputStream f371Code;

    /* renamed from: Code  reason: collision with other field name */
    public String f372Code;

    /* renamed from: Code  reason: collision with other field name */
    private StringBuffer f373Code;

    /* renamed from: Code  reason: collision with other field name */
    public Vector f374Code;

    /* renamed from: Code  reason: collision with other field name */
    private Connection f375Code;

    /* renamed from: Code  reason: collision with other field name */
    private Image f376Code;

    /* renamed from: Code  reason: collision with other field name */
    private char[] f377Code;

    /* renamed from: Code  reason: collision with other field name */
    public Object[] f378Code;

    /* renamed from: Code  reason: collision with other field name */
    private short[] f379Code;

    /* renamed from: I  reason: collision with other field name */
    B f380I;

    /* renamed from: I  reason: collision with other field name */
    private DataInputStream f381I;

    /* renamed from: I  reason: collision with other field name */
    private DataOutputStream f382I;

    /* renamed from: I  reason: collision with other field name */
    private Image f383I;

    /* renamed from: I  reason: collision with other field name */
    public boolean f384I;

    /* renamed from: I  reason: collision with other field name */
    private byte[] f385I;

    /* renamed from: I  reason: collision with other field name */
    public Object[] f386I;

    /* renamed from: I  reason: collision with other field name */
    private short[] f387I;

    /* renamed from: J  reason: collision with other field name */
    B f388J;

    /* renamed from: J  reason: collision with other field name */
    private e f389J;

    /* renamed from: J  reason: collision with other field name */
    private byte[] f390J;

    /* renamed from: J  reason: collision with other field name */
    private int[] f391J;

    /* renamed from: M  reason: collision with other field name */
    private int f392M;

    /* renamed from: N  reason: collision with other field name */
    private int f393N;

    /* renamed from: O  reason: collision with other field name */
    private int f394O;

    /* renamed from: P  reason: collision with other field name */
    private int f395P;

    /* renamed from: Q  reason: collision with other field name */
    private int f396Q;

    /* renamed from: R  reason: collision with other field name */
    private int f397R;

    /* renamed from: S  reason: collision with other field name */
    private int f398S;

    /* renamed from: T  reason: collision with other field name */
    private int f399T;

    /* renamed from: U  reason: collision with other field name */
    private int f400U;

    /* renamed from: V  reason: collision with other field name */
    private int f401V;

    /* renamed from: Z  reason: collision with other field name */
    B f402Z;

    /* renamed from: Z  reason: collision with other field name */
    private e f403Z;

    /* renamed from: Z  reason: collision with other field name */
    private Image f404Z;

    /* renamed from: Z  reason: collision with other field name */
    public boolean f405Z;

    /* renamed from: Z  reason: collision with other field name */
    private byte[] f406Z;

    /* renamed from: Z  reason: collision with other field name */
    private String[] f407Z;

    /* renamed from: a  reason: collision with other field name */
    private e f408a;

    /* renamed from: aA  reason: collision with other field name */
    private int f409aA;

    /* renamed from: aB  reason: collision with other field name */
    private int f410aB;

    /* renamed from: aC  reason: collision with other field name */
    private int f411aC;

    /* renamed from: aD  reason: collision with other field name */
    private int f412aD;

    /* renamed from: aE  reason: collision with other field name */
    private int f413aE;

    /* renamed from: aF  reason: collision with other field name */
    private int f414aF;

    /* renamed from: aG  reason: collision with other field name */
    private int f415aG;

    /* renamed from: aH  reason: collision with other field name */
    private int f416aH;

    /* renamed from: aI  reason: collision with other field name */
    private int f417aI;

    /* renamed from: aJ  reason: collision with other field name */
    private int f418aJ;

    /* renamed from: aL  reason: collision with other field name */
    private boolean f419aL;

    /* renamed from: aN  reason: collision with other field name */
    private boolean f420aN;

    /* renamed from: aO  reason: collision with other field name */
    private boolean f421aO;

    /* renamed from: aP  reason: collision with other field name */
    private boolean f422aP;

    /* renamed from: aQ  reason: collision with other field name */
    private boolean f423aQ;

    /* renamed from: aR  reason: collision with other field name */
    private boolean f424aR;

    /* renamed from: aS  reason: collision with other field name */
    private boolean f425aS;

    /* renamed from: aT  reason: collision with other field name */
    private boolean f426aT;

    /* renamed from: aU  reason: collision with other field name */
    private boolean f427aU;

    /* renamed from: aV  reason: collision with other field name */
    private boolean f428aV;

    /* renamed from: aa  reason: collision with other field name */
    private int f429aa;

    /* renamed from: ab  reason: collision with other field name */
    private int f430ab;

    /* renamed from: ac  reason: collision with other field name */
    private int f431ac;

    /* renamed from: ad  reason: collision with other field name */
    private int f432ad;

    /* renamed from: ae  reason: collision with other field name */
    private int f433ae;

    /* renamed from: af  reason: collision with other field name */
    private int f434af;

    /* renamed from: ag  reason: collision with other field name */
    private int f435ag;

    /* renamed from: ah  reason: collision with other field name */
    private int f436ah;

    /* renamed from: ai  reason: collision with other field name */
    private int f437ai;

    /* renamed from: aj  reason: collision with other field name */
    private int f438aj;

    /* renamed from: ak  reason: collision with other field name */
    private int f439ak;

    /* renamed from: al  reason: collision with other field name */
    private int f440al;

    /* renamed from: am  reason: collision with other field name */
    private int f441am;

    /* renamed from: an  reason: collision with other field name */
    private int f442an;

    /* renamed from: ao  reason: collision with other field name */
    private int f443ao;

    /* renamed from: ap  reason: collision with other field name */
    private int f444ap;

    /* renamed from: aq  reason: collision with other field name */
    private int f445aq;

    /* renamed from: ar  reason: collision with other field name */
    private int f446ar;

    /* renamed from: as  reason: collision with other field name */
    private int f447as;

    /* renamed from: at  reason: collision with other field name */
    private int f448at;

    /* renamed from: au  reason: collision with other field name */
    private int f449au;

    /* renamed from: av  reason: collision with other field name */
    private int f450av;

    /* renamed from: aw  reason: collision with other field name */
    private int f451aw;

    /* renamed from: ax  reason: collision with other field name */
    private int f452ax;

    /* renamed from: ay  reason: collision with other field name */
    private int f453ay;

    /* renamed from: az  reason: collision with other field name */
    private int f454az;

    /* renamed from: b  reason: collision with other field name */
    private e f455b;

    /* renamed from: b  reason: collision with other field name */
    public boolean f456b;

    /* renamed from: c  reason: collision with other field name */
    private e f457c;

    /* renamed from: c  reason: collision with other field name */
    private Vector f458c;

    /* renamed from: d  reason: collision with other field name */
    private e f459d;

    /* renamed from: d  reason: collision with other field name */
    public String f460d;

    /* renamed from: d  reason: collision with other field name */
    private Vector f461d;

    /* renamed from: d  reason: collision with other field name */
    boolean f462d;

    /* renamed from: e  reason: collision with other field name */
    private long f463e;

    /* renamed from: e  reason: collision with other field name */
    private e f464e;

    /* renamed from: e  reason: collision with other field name */
    private Vector f465e;

    /* renamed from: e  reason: collision with other field name */
    boolean f466e;

    /* renamed from: f  reason: collision with other field name */
    private long f467f;

    /* renamed from: f  reason: collision with other field name */
    private e f468f;

    /* renamed from: f  reason: collision with other field name */
    boolean f469f;

    /* renamed from: g  reason: collision with other field name */
    boolean f470g;

    /* renamed from: h  reason: collision with other field name */
    boolean f471h;

    /* renamed from: i  reason: collision with other field name */
    boolean f472i;

    /* renamed from: j  reason: collision with other field name */
    boolean f473j;

    /* renamed from: k  reason: collision with other field name */
    private e f474k;

    /* renamed from: r  reason: collision with other field name */
    private String f475r;

    /* renamed from: u  reason: collision with other field name */
    private String f476u;

    /* renamed from: v  reason: collision with other field name */
    private String f477v;

    static {
        Hashtable hashtable = new Hashtable(6);
        f233C = hashtable;
        hashtable.put("http", new Integer(80));
        f233C.put("https", new Integer(443));
        f233C.put("ftp", new Integer(21));
        f233C.put("rtsp", new Integer(554));
        new Stack();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e() {
        this(new byte[32768]);
        this.f473j = true;
        this.f472i = true;
    }

    private e(byte b2) {
        this.f385I = new byte[4];
        this.f391J = new int[64];
        v();
    }

    private e(char c2) {
        this.f473j = true;
        this.f470g = true;
        this.f390J = new byte[64];
        this.f406Z = new byte[32];
    }

    private e(int i2, byte b2, boolean z2) {
        boolean z3;
        String property;
        String[] strArr;
        String str;
        boolean z4;
        boolean z5;
        boolean z6 = true;
        this.f473j = true;
        this.f470g = true;
        this.f420aN = true;
        this.f374Code = new Vector();
        this.f358B = new byte[1024];
        this.f378Code = new Object[104];
        this.f363C = new int[104];
        this.f456b = false;
        this.f396Q = i2;
        if (z2) {
            this.f361C = m179I(i2);
            this.f456b = true;
        } else {
            this.f361C = m118Code(i2);
        }
        int d2 = d();
        if (d2 == 460) {
            z3 = true;
        } else {
            if (d2 == -1) {
                String str2 = m118Code(0).f475r;
                int indexOf = str2.indexOf(46);
                int indexOf2 = str2.indexOf("cn");
                int indexOf3 = str2.indexOf("china");
                if ((indexOf2 < 0 || indexOf2 >= indexOf) && (indexOf3 < 0 || indexOf3 >= indexOf)) {
                    String property2 = System.getProperty("wireless.messaging.sms.smsc");
                    if (property2 != null) {
                        z3 = property2.startsWith("+86") || property2.startsWith("0086");
                    } else if (m194Z(1).length() == 0 && (property = System.getProperty("microedition.locale")) != null) {
                        z3 = property.toLowerCase().endsWith("cn");
                    }
                } else {
                    z3 = true;
                }
            }
            z3 = false;
        }
        int i3 = z3 ? 1 : 0;
        int i4 = z3 ? 1 : 0;
        int i5 = z3 ? 1 : 0;
        int i6 = z3 ? 1 : 0;
        int i7 = z3 ? 1 : 0;
        int i8 = z3 ? 1 : 0;
        int i9 = z3 ? 1 : 0;
        this.f407Z = new String[(i3 + 2)];
        if (!this.f361C.m209g()) {
            strArr = this.f407Z;
            str = new StringBuffer().append("socket://").append(this.f361C.f475r).append(":").append(this.f361C.f393N).toString();
        } else {
            strArr = this.f407Z;
            str = "socket://do_not_use_me:0";
        }
        strArr[0] = str;
        if (z3) {
            this.f407Z[1] = "http://10.0.0.172:80/";
        }
        this.f407Z[this.f407Z.length - 1] = Z();
        if (this.f407Z.length != f256I) {
            f256I = this.f407Z.length;
            m139Code();
            z4 = true;
        } else {
            z4 = false;
        }
        String Code2 = this.f361C.m225Code();
        Object[] objArr = (Object[]) f240Code.get(Code2);
        if (objArr != null) {
            this.f386I = objArr;
            this.f457c = (e) objArr[0];
            z5 = z4;
        } else {
            this.f457c = new e(m171Code(m164Code(this.f361C.f372Code), 0, 160));
            this.f386I = new Object[2];
            this.f386I[0] = this.f457c;
            this.f386I[1] = "";
            f240Code.put(Code2, this.f386I);
            z5 = true;
        }
        if (z5) {
            C(false);
        }
        this.f364Code = b2 == -1 ? (Z < 0 || this.f361C.m209g()) ? J >= 0 ? J : 1 : Z : b2;
        z();
        this.f405Z = (!aA || H < 160) ? false : z6;
        if (f300b.size() <= i2) {
            f300b.setSize(i2 + 1);
        }
        f300b.setElementAt(this, i2);
    }

    private e(int i2, int i3, String str, int i4, int i5, String str2, String str3) {
        this.f473j = true;
        this.f470g = true;
        this.f401V = i2;
        this.f397R = i3;
        this.f475r = str;
        this.f398S = i4;
        this.f393N = i5;
        this.f372Code = str2;
        this.f460d = str3;
    }

    e(int i2, e eVar, boolean z2) {
        String str;
        boolean z3 = false;
        this.f473j = true;
        this.f470g = true;
        this.f469f = true;
        this.f374Code = new Vector(30);
        this.f399T = -1;
        this.f394O = -1;
        this.f384I = false;
        this.f460d = "";
        this.f362C = false;
        this.f437ai = -1;
        this.f438aj = 0;
        this.f439ak = Integer.MAX_VALUE;
        this.f366Code = 0;
        this.f440al = -1;
        this.f368Code = null;
        this.f405Z = false;
        this.f441am = 0;
        this.f442an = 0;
        this.f421aO = false;
        this.f462d = false;
        this.f415aG = -1;
        this.f426aT = false;
        this.f427aU = false;
        this.f477v = null;
        this.f378Code = null;
        this.f466e = false;
        this.f428aV = true;
        this.f365Code = i2;
        this.f369Code = eVar;
        this.f428aV = z2;
        if (i2 == 16) {
            this.f458c = new Vector();
            this.f461d = new Vector();
            this.f465e = new Vector();
            this.f409aA = B(0);
            this.f410aB = this.f409aA + 5;
            Image Code2 = Code(Code.f115J, 0, Code.f115J.length, 256, (Object[]) null);
            this.f404Z = Code2;
            this.f383I = Code2;
            this.f423aQ = Code.e > 128;
            this.f411aC = Math.max(this.f409aA, this.f404Z.getHeight()) + 5;
            if (eVar.f367Code != null && I(eVar.f367Code.f21Code) == 65) {
                z3 = true;
            }
            if (eVar.f367Code == null || eVar.f367Code.f21Code == null || I(eVar.f367Code.f21Code) != -1 || eVar.f367Code.f21Code.startsWith("myopera:") || eVar.f367Code.f21Code.startsWith("feed:") || eVar.f367Code.f21Code.startsWith("sk:") || eVar.f367Code.f21Code.startsWith("share:")) {
                if (z3) {
                    eVar.f367Code.Z(true);
                    Object obj = eVar.f367Code.f22Code.get("o:a");
                    if (obj != null && (obj instanceof String)) {
                        str = (String) obj;
                        this.f373Code = new StringBuffer(str);
                        this.f441am = this.f373Code.length();
                    }
                }
                str = "www.";
                this.f373Code = new StringBuffer(str);
                this.f441am = this.f373Code.length();
            } else {
                this.f373Code = new StringBuffer(eVar.f367Code.f21Code);
                this.f421aO = true;
            }
            if (!z3) {
                this.f434af = (int) System.currentTimeMillis();
                Code.e();
                this.f396Q = (-this.f411aC) - 9;
            }
        }
        m237I();
    }

    e(B b2, String str) {
        this.f473j = true;
        this.f470g = true;
        this.f367Code = b2;
        this.f475r = str;
    }

    private e(String str) {
        this.f473j = true;
        this.f372Code = str;
    }

    private e(String str, String str2, int i2, String str3, int i3) {
        this.f473j = true;
        this.f470g = true;
        this.f475r = str;
        this.f372Code = str2;
        this.f396Q = i2;
        this.f460d = str3;
        this.f393N = i3;
    }

    private e(byte[] bArr) {
        int i2 = 0;
        this.f473j = true;
        this.f472i = true;
        this.f392M = 6;
        this.f379Code = new short[574];
        this.f387I = new short[62];
        this.f390J = new byte[288];
        this.f406Z = bArr;
        this.f434af = bArr.length;
        if (f302b[0] == 0) {
            f302b[0] = 1;
            f302b[1] = 2;
            for (int i3 = 1; i3 < 29; i3++) {
                f302b[i3 + 1] = (1 << (i3 / 2)) + (1 << ((i3 - 1) / 2)) + 1;
            }
            int i4 = 3;
            while (i2 < 28) {
                f291a[i2] = i4;
                int i5 = i2 < 8 ? 1 : 1 << ((i2 - 4) / 4);
                i2++;
                i4 = i5 + i4;
            }
            f291a[28] = 258;
        }
    }

    private e(byte[] bArr, byte b2) {
        this.f473j = true;
        this.f471h = true;
        this.f406Z = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            this.f406Z[i2] = (byte) i2;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < 256) {
            int i6 = (bArr[i5] + this.f406Z[i3] + i4) & 255;
            byte b3 = this.f406Z[i3];
            this.f406Z[i3] = this.f406Z[i6];
            this.f406Z[i6] = b3;
            i5 = (i5 + 1) % 32;
            i3++;
            i4 = i6;
        }
    }

    private e(byte[] bArr, int i2) {
        this.f473j = true;
        this.f470g = true;
        this.f389J = new e((byte) 0);
        this.f406Z = new byte[64];
        this.f390J = new byte[64];
        this.f385I = new byte[32];
        System.arraycopy(bArr, i2, this.f406Z, 0, 32);
        System.arraycopy(bArr, i2, this.f390J, 0, 32);
        for (int i3 = 0; i3 < 64; i3++) {
            byte[] bArr2 = this.f390J;
            bArr2[i3] = (byte) (bArr2[i3] ^ 54);
            byte[] bArr3 = this.f406Z;
            bArr3[i3] = (byte) (bArr3[i3] ^ 92);
        }
        this.f389J.m151Code(this.f390J, 0, 64);
    }

    private e(int[] iArr) {
        this.f473j = true;
        this.f470g = true;
        this.f403Z = new e((char) 0);
        this.f406Z = new byte[0];
        this.f390J = new byte[8];
        this.f358B = new byte[32];
        this.f391J = iArr;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [byte, int] */
    private static void A() {
        synchronized (f239Code) {
            if (!f292aK) {
                if (aI) {
                    aI = false;
                    m139Code();
                }
                if (f237Code != null) {
                    int Code2 = f237Code.Code();
                    e Code3 = m118Code(Code2);
                    if (Z == -2 && J == -2) {
                        Code((byte) -1, (String) null);
                        I((byte) -1, (String) null);
                    }
                    if (Code3.m209g() && J == -2) {
                        I((byte) -1, (String) null);
                    }
                    if (((Code3.m209g() && J == -1) || (!Code3.m209g() && (Z == -1 || (Z == -2 && J == -1)))) && !aJ) {
                        X++;
                        I = -1;
                        f243Code = true;
                        aJ = true;
                    }
                    Code(Code2, (byte) (((f243Code ? 1 : 0) << 1) - 1), false);
                }
            }
        }
    }

    static int B(int i2) {
        int I2 = I(i2);
        return f301b[I2] + f248Code[I2].getHeight() + f244Code[I2];
    }

    private static int B(byte[] bArr, int i2) {
        switch (a((int) bArr[i2])) {
            case 1:
                return bArr[i2];
            case 2:
                return ((bArr[i2] & 31) << 6) | (bArr[i2 + 1] & 63);
            case 3:
                return ((bArr[i2] & 15) << 12) | ((bArr[i2 + 1] & 63) << 6) | (bArr[i2 + 2] & 63);
            default:
                return ((bArr[i2] & 7) << 18) | ((bArr[i2 + 1] & 63) << 12) | ((bArr[i2 + 2] & 63) << 6) | (bArr[i2 + 3] & 63);
        }
    }

    private static String B(String str) {
        int indexOf = str.indexOf(46);
        int lastIndexOf = str.lastIndexOf(45, indexOf - 1);
        try {
            int parseInt = Integer.parseInt(str.substring(lastIndexOf, indexOf));
            return (parseInt < -255 || parseInt >= 0) ? str : new StringBuffer().append(str.substring(0, lastIndexOf)).append(str.substring(indexOf)).toString();
        } catch (Throwable th) {
            return str;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [byte, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: B  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m114B(int r2) {
        /*
            r1 = this;
            int r0 = r2 >> 24
            r1.Code(r0)
            int r0 = r2 >>> 16
            byte r0 = (byte) r0
            r1.Code(r0)
            int r0 = r2 >>> 8
            byte r0 = (byte) r0
            r1.Code(r0)
            byte r0 = (byte) r2
            r1.Code(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.m114B(int):void");
    }

    private void B(int i2, int i3) {
        this.f370Code.readFully(this.f358B, i2, i3);
        f266J += (long) i3;
        f227B += (long) i3;
        Code((long) i3, 0, 0);
    }

    private void B(g gVar) {
        Hashtable Code2;
        Throwable th;
        int read;
        if (gVar != null && (Code2 = gVar.Code(true)) != null) {
            int priority = Thread.currentThread().getPriority();
            Thread.currentThread().setPriority(1);
            int Code3 = Code(Code2);
            f278Z = Code3;
            f265J = 0;
            J j2 = new J(4104);
            DataOutputStream dataOutputStream = new DataOutputStream(j2);
            Code(j2, 22, gVar.I(), 7);
            dataOutputStream.write(1);
            dataOutputStream.writeShort(9);
            dataOutputStream.writeInt(Code3 - 7);
            J(j2.Code(), 0, 15);
            m115B(j2.Code(), 15);
            j2.Code(0);
            InputStream inputStream = null;
            try {
                Enumeration keys = Code2.keys();
                while (keys.hasMoreElements()) {
                    try {
                        String str = (String) keys.nextElement();
                        Object[] objArr = (Object[]) Code2.get(str);
                        int Z2 = Z((String) objArr[0]) + Z(str) + 8;
                        Code(j2, 22, gVar.I(), Z2);
                        dataOutputStream.writeUTF(str);
                        dataOutputStream.writeUTF((String) objArr[0]);
                        int intValue = ((Integer) objArr[1]).intValue();
                        dataOutputStream.writeInt(intValue);
                        J(j2.Code(), 0, Z2 + 8);
                        m115B(j2.Code(), Z2 + 8);
                        j2.Code(0);
                        inputStream = a.m103Code((String) objArr[2]).openInputStream();
                        byte[] Code4 = j2.Code();
                        int i2 = 0;
                        while (!gVar.m270Z() && (read = inputStream.read(Code4, 8, 4096)) >= 0 && i2 < intValue) {
                            i2 += read;
                            f265J += read;
                            Code(Code4, 0, 22, gVar.I(), read);
                            J(Code4, 0, read + 8);
                            m115B(Code4, read + 8);
                        }
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = inputStream;
                        f265J = -1;
                        try {
                            inputStream.close();
                        } catch (Throwable th4) {
                        }
                        Thread.currentThread().setPriority(priority);
                        Code.f89Code.m99b();
                        throw th;
                    }
                }
                f265J = -1;
                try {
                    inputStream.close();
                } catch (Throwable th5) {
                }
                Thread.currentThread().setPriority(priority);
                Code.f89Code.m99b();
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    private void B(Graphics graphics) {
        I(graphics, this.f400U, this.f393N, this.f397R, this.f398S);
        int i2 = this.f401V;
        int I2 = m235I();
        if (i2 != this.f397R) {
            graphics.setColor(f262I[17]);
            graphics.drawLine(this.f400U + i2, this.f393N, this.f400U + i2, (this.f393N + I2) - 1);
            graphics.setColor(f262I[22]);
            graphics.drawLine(this.f400U + i2 + 1, this.f393N, this.f400U + i2 + 1, this.f393N + I2);
            graphics.setColor(f262I[23]);
            graphics.drawLine(this.f400U + i2 + 2, this.f393N, this.f400U + i2 + 2, this.f393N + I2 + 1);
            graphics.setColor(f262I[24]);
            graphics.drawLine(this.f400U + i2 + 3, this.f393N, this.f400U + i2 + 3, this.f393N + I2 + 2);
            Code(graphics, this.f400U + i2 + 4, this.f393N, B - 4, I2 + 4, f262I[25]);
            Code(graphics, this.f400U + i2, Code(false) + this.f393N, B - 1, I(false), false);
            Code(graphics, this.f400U + i2, this.f393N, B, I2);
        }
        if (I2 != this.f398S) {
            graphics.setColor(f262I[17]);
            graphics.drawLine(this.f400U, this.f393N + I2, this.f400U + i2, this.f393N + I2);
            graphics.drawLine(this.f400U, (this.f393N + this.f398S) - 1, this.f400U + this.f397R, (this.f393N + this.f398S) - 1);
            graphics.setColor(f262I[22]);
            graphics.drawLine(this.f400U, this.f393N + I2 + 1, this.f400U + i2 + 1, this.f393N + I2 + 1);
            graphics.setColor(f262I[23]);
            graphics.drawLine(this.f400U, this.f393N + I2 + 2, this.f400U + i2 + 2, this.f393N + I2 + 2);
            graphics.setColor(f262I[24]);
            graphics.drawLine(this.f400U, this.f393N + I2 + 3, this.f400U + i2 + 3, this.f393N + I2 + 3);
            Code(graphics, this.f400U, this.f393N + I2 + 4, this.f397R - 1, B - 5, f262I[25]);
            Code(graphics, e() + this.f400U, this.f393N + I2, f(), B - 1, true);
            Code(graphics, this.f400U, this.f393N + I2, this.f397R, B);
        }
        Z(graphics);
    }

    /* renamed from: B  reason: collision with other method in class */
    private void m115B(byte[] bArr, int i2) {
        this.f371Code.write(bArr, 0, i2);
        f266J += (long) i2;
        f227B += (long) i2;
        if (m211i()) {
            this.f371Code.flush();
        }
        this.f463e = System.currentTimeMillis();
    }

    private void B(byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            this.f392M = (this.f392M + 1) & 255;
            this.f434af = (this.f406Z[this.f392M] + this.f434af) & 255;
            byte b2 = this.f406Z[this.f392M];
            this.f406Z[this.f392M] = this.f406Z[this.f434af];
            this.f406Z[this.f434af] = b2;
            bArr[i2 + i4] = (byte) (bArr[i2 + i4] ^ this.f406Z[(this.f406Z[this.f392M] + this.f406Z[this.f434af]) & 255]);
        }
    }

    /* renamed from: B  reason: collision with other method in class */
    private static boolean m116B(int i2) {
        for (int length = f250Code.length - 1; length > 0; length--) {
            if (f250Code[length][0] == ((char) i2)) {
                return f250Code[length].length > 2;
            }
        }
        return false;
    }

    static int C(int i2) {
        long j2 = (long) i2;
        int i3 = 40960 + ((int) ((-40960 * j2) / 100));
        return ((((int) ((j2 * -7680) / 100)) + 15872) >> 8) | ((i3 & 65280) << 8) | ((52480 + ((int) ((-21504 * j2) / 100))) & 65280);
    }

    private static int C(byte[] bArr, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            if (bs) {
                int i5 = i4 << 8;
                int i6 = bb;
                bb = i6 + 1;
                i3++;
                i4 = i5 | (bArr[i6] & 255);
            } else {
                int i7 = bb;
                bb = i7 + 1;
                i3++;
                i4 = ((bArr[i7] & 255) << (i3 << 3)) | i4;
            }
        }
        return i4;
    }

    private static String C(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.ensureCapacity(str.length());
        while (true) {
            int indexOf = str.indexOf(37);
            if (indexOf < 0) {
                return stringBuffer.append(str).toString();
            }
            stringBuffer.append(str.substring(0, indexOf)).append((char) Integer.parseInt(str.substring(indexOf + 1, indexOf + 3), 16));
            str = str.substring(indexOf + 3, str.length());
        }
    }

    /* renamed from: C  reason: collision with other method in class */
    private void m117C(int i2) {
        this.f389J.m114B(i2);
    }

    private void C(int i2, int i3) {
        boolean z2 = i2 < 0;
        if (i2 == -1 && this.f367Code != null && this.f367Code.f7B) {
            i2 = 0;
        }
        if (m240I(i2)) {
            this.f394O = this.f399T + i2;
            Code((Object[]) this.f374Code.elementAt(this.f394O), (String) null, false, false, this.f384I, z2, (Hashtable) null);
        } else if (i3 > 0) {
            Code.f89Code.Code(this, m180I(i3));
        }
    }

    private void C(Graphics graphics) {
        int[] Code2;
        int[] Code3;
        if (m248a()) {
            Vector Code4 = this.f367Code.m33Code();
            int size = Code4 == null ? 0 : Code4.size();
            if (Code4 != null && size > 0) {
                int b2 = b(size);
                this.f367Code.f14Code = 23;
                this.f367Code.f29I = 10;
                this.f367Code.f3B = 23;
                Enumeration elements = Code4.elements();
                while (elements.hasMoreElements()) {
                    int[] iArr = (int[]) elements.nextElement();
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int i4 = iArr[2];
                    int i5 = iArr[3];
                    int i6 = iArr[4] + b2;
                    boolean z2 = false;
                    int i7 = 1;
                    int i8 = 0;
                    if (i6 >= 10) {
                        int i9 = i6;
                        i7 = 0;
                        while (i9 > 0) {
                            i9 /= 10;
                            int i10 = i7 + 1;
                            if (this.f415aG <= 0 || i9 != this.f415aG || z2) {
                                i7 = i10;
                            } else {
                                z2 = true;
                                i8 = i10;
                                i7 = i10;
                            }
                        }
                    }
                    int i11 = this.f400U + i2 + 2;
                    int i12 = this.f393N + i3;
                    int i13 = Code.j * i7;
                    int i14 = Code.i;
                    int i15 = i2 < 0 ? ((this.f400U + i2) + i4) - i13 : i11;
                    if (i3 < 0) {
                        i12 = ((this.f393N + i3) + i5) - i14;
                    }
                    int[] iArr2 = new int[i7];
                    iArr2[0] = 0;
                    if (i6 > 0) {
                        int i16 = i7 - 1;
                        int i17 = i6;
                        while (i17 > 0) {
                            iArr2[i16] = i17 % 10;
                            i17 /= 10;
                            i16--;
                        }
                    }
                    c(Code.j);
                    int c2 = c(i14);
                    int width = Code(c2, true, 0).getWidth();
                    int i18 = width * i7;
                    int i19 = ((Code.j - width) * i7) / 2;
                    int i20 = i15 + i19;
                    int i21 = i12 + ((Code.i * i19) / (Code.j * i7));
                    if (z2 || i6 == this.f415aG) {
                        int i22 = i7 - i8;
                        for (int i23 = 0; i23 < i22; i23++) {
                            Image Code5 = Code(c2, false, iArr2[i23]);
                            graphics.drawImage(Code5, (width * i23) + i20, i21, 20);
                            Code(graphics, (width * i23) + i20, i21, Code5.getWidth(), Code5.getHeight());
                        }
                        while (i22 < i7) {
                            Image Code6 = Code(c2, true, iArr2[i22]);
                            graphics.drawImage(Code6, (width * i22) + i20, i21, 20);
                            Code(graphics, (width * i22) + i20, i21, Code6.getWidth(), Code6.getHeight());
                            i22++;
                        }
                    } else if (this.f415aG < 0) {
                        for (int i24 = 0; i24 < i7; i24++) {
                            Image Code7 = Code(c2, true, iArr2[i24]);
                            graphics.drawImage(Code7, (width * i24) + i20, i21, 20);
                            Code(graphics, (width * i24) + i20, i21, Code7.getWidth(), Code7.getHeight());
                        }
                    }
                    if (this.f415aG < 0 || z2 || i6 == this.f415aG) {
                        if (this.f416aH == 255 && f344r && !bc) {
                            int i25 = i20 + i18;
                            int i26 = i21 + c2 + 1;
                            for (int i27 = i21 - 1; i27 < i26; i27++) {
                                graphics.drawImage(Code.f124a, i25, i27, 0);
                            }
                            graphics.drawImage(Code.f137g, i25, i26, 0);
                            for (int i28 = i20 + 4; i28 < i25; i28++) {
                                graphics.drawImage(Code.f138h, i28, i26, 0);
                            }
                            graphics.drawImage(Code.f140i, i20, i26, 0);
                        }
                        int i29 = i7 * width;
                        graphics.setColor(6447714 | (this.f416aH << 24));
                        graphics.drawLine(i20, i21 - 1, (i20 + i29) - 1, i21 - 1);
                        Code(graphics, i20, i21 - 1, i29, 1);
                        graphics.drawLine(i20 + i29, i21, i20 + i29, (i21 + c2) - 1);
                        Code(graphics, i20 + i29, i21, 1, c2);
                        graphics.drawLine(i20, i21 + c2, (i20 + i29) - 1, i21 + c2);
                        Code(graphics, i20, i21 + c2, i29, 1);
                        graphics.drawLine(i20 - 1, i21, i20 - 1, (i21 + c2) - 1);
                        Code(graphics, i20 - 1, i21, 1, c2);
                        graphics.setColor(11447982);
                        graphics.drawLine(i20 - 1, i21 - 1, i20 - 1, i21 - 1);
                        Code(graphics, i20 - 1, i21 - 1, 1, 1);
                        graphics.drawLine(i20 + i29, i21 - 1, i20 + i29, i21 - 1);
                        Code(graphics, i20 + i29, i21 - 1, 1, 1);
                        graphics.drawLine(i20 - 1, i21 + c2, i20 - 1, i21 + c2);
                        Code(graphics, i20 - 1, i21 + c2, 1, 1);
                        graphics.drawLine(i20 + i29, i21 + c2, i20 + i29, i21 + c2);
                        Code(graphics, i20 + i29, i21 + c2, 1, 1);
                    }
                    if (this.f415aG == i6 && (Code3 = m168Code(b2)) != null) {
                        a(this.f400U + Code3[0], Code3[1] + this.f393N);
                    }
                    if (z2 && this.f415aG * 10 == i6 && !this.f426aT && (Code2 = m169Code(i6, b2)) != null) {
                        a(this.f400U + Code2[0], Code2[1] + this.f393N);
                    }
                }
                if (this.f426aT) {
                    if (this.f415aG >= 0) {
                        if (this.f367Code != null) {
                            Vector Code8 = this.f367Code.m33Code();
                            int i30 = this.f415aG - b2;
                            if (i30 >= 0 && Code8 != null && Code8.size() > 0 && i30 < Code8.size()) {
                                this.f367Code.m32Code(i30);
                            }
                        }
                        int[] Code9 = m168Code(b2);
                        Z(false);
                        if (Code9 != null) {
                            I(this.f400U + Code9[0], this.f393N + Code9[1]);
                            Z(this.f400U + Code9[0], Code9[1] + this.f393N);
                        }
                    }
                    Z(false);
                    if (R) {
                        I.Code();
                    } else {
                        Code.f89Code.repaint();
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:50:0x029b */
    static synchronized void C(boolean z2) {
        Object[] objArr;
        synchronized (e.class) {
            Object[] objArr2 = null;
            int i2 = 0;
            while (true) {
                if (objArr2 != null) {
                    if (i2 >= 2) {
                        break;
                    }
                } else if (i2 > 0) {
                    break;
                }
                J j2 = new J();
                try {
                    DataOutputStream dataOutputStream = new DataOutputStream(j2);
                    dataOutputStream.write(9);
                    dataOutputStream.writeUTF(m194Z(1));
                    dataOutputStream.writeUTF(":");
                    dataOutputStream.write((aA ? 1 : 0) << 1);
                    dataOutputStream.writeBoolean(H >= 160);
                    dataOutputStream.write(new byte[14]);
                    dataOutputStream.write(59);
                    dataOutputStream.writeBoolean(aq);
                    dataOutputStream.writeInt(l);
                    dataOutputStream.writeBoolean(ap);
                    dataOutputStream.writeBoolean(az);
                    dataOutputStream.writeBoolean(av);
                    dataOutputStream.writeBoolean(aw);
                    dataOutputStream.writeInt(o);
                    dataOutputStream.writeInt(p);
                    dataOutputStream.writeInt(i);
                    dataOutputStream.writeInt(k);
                    dataOutputStream.writeLong(f257I);
                    dataOutputStream.writeLong(f227B);
                    dataOutputStream.writeUTF(f342q);
                    dataOutputStream.writeInt(q);
                    dataOutputStream.writeInt(aM);
                    dataOutputStream.writeInt(m);
                    dataOutputStream.writeBoolean(false);
                    dataOutputStream.write((!aB ? 1 : 0) << 1);
                    dataOutputStream.writeInt(r);
                    dataOutputStream.writeBoolean(aB);
                    dataOutputStream.writeUTF(f325i);
                    dataOutputStream.writeBoolean(ao);
                    dataOutputStream.write((ae ? 1 : 0) << 1);
                    dataOutputStream.write(-1);
                    dataOutputStream.writeBoolean(true);
                    byte[] bArr = new byte[32];
                    f258I.m149Code(bArr);
                    f258I.m151Code(bArr, 0, 32);
                    dataOutputStream.write(bArr);
                    dataOutputStream.writeLong(0);
                    dataOutputStream.writeLong(0);
                    dataOutputStream.write(0);
                    dataOutputStream.writeShort(0);
                    dataOutputStream.writeShort(0);
                    dataOutputStream.writeBoolean(bm);
                    dataOutputStream.writeBoolean(ar);
                    dataOutputStream.writeBoolean(ax);
                    dataOutputStream.writeBoolean(f273K);
                    dataOutputStream.writeBoolean(M && !bj);
                    dataOutputStream.writeBoolean(f274L);
                    dataOutputStream.writeUTF(Code.f111J);
                    dataOutputStream.writeInt(Code.f88Code);
                    dataOutputStream.writeInt(Code.I);
                    dataOutputStream.writeBoolean(Code.f85B);
                    dataOutputStream.writeBoolean(Code.f120Z);
                    dataOutputStream.writeUTF(Code.f117Z);
                    dataOutputStream.writeUTF(Code.f102I);
                    dataOutputStream.write(Code.J);
                    dataOutputStream.writeBoolean(false);
                    dataOutputStream.writeBoolean(false);
                    int size = Code.f93Code.size();
                    dataOutputStream.write(size);
                    for (int i3 = 0; i3 < size; i3++) {
                        dataOutputStream.writeUTF((String) Code.f93Code.elementAt(i3));
                    }
                    dataOutputStream.writeBoolean(false);
                    dataOutputStream.writeBoolean(false);
                    dataOutputStream.writeBoolean(false);
                    dataOutputStream.writeBoolean(false);
                    dataOutputStream.writeInt(f);
                    dataOutputStream.writeUTF(f340p);
                    dataOutputStream.writeBoolean(false);
                    dataOutputStream.writeByte(f287a.size());
                    for (int i4 = 0; i4 < f287a.size(); i4++) {
                        Object[] objArr3 = (Object[]) f287a.elementAt(i4);
                        dataOutputStream.writeUTF((String) objArr3[0]);
                        dataOutputStream.writeUTF((String) objArr3[1]);
                        byte[] bArr2 = (byte[]) objArr3[2];
                        dataOutputStream.writeShort(bArr2.length);
                        dataOutputStream.write(bArr2);
                    }
                    dataOutputStream.writeBoolean(false);
                    dataOutputStream.writeBoolean(false);
                    dataOutputStream.writeInt(s);
                    dataOutputStream.writeUTF(f328j != null ? f328j : "");
                    dataOutputStream.writeByte(ay ? 1 : 0);
                    dataOutputStream.writeInt(t);
                    Code(dataOutputStream, f261I);
                    dataOutputStream.writeInt(0);
                    dataOutputStream.writeBoolean(false);
                    dataOutputStream.writeByte(0);
                    dataOutputStream.writeByte(aD ? 1 : 0);
                    dataOutputStream.writeInt(A);
                    Code(dataOutputStream, f230B);
                    I(dataOutputStream);
                    Code(dataOutputStream);
                    dataOutputStream.writeInt(0);
                    dataOutputStream.writeBoolean(au);
                    dataOutputStream.writeInt(z);
                    dataOutputStream.writeBoolean(bp);
                    dataOutputStream.writeInt(u);
                    dataOutputStream.writeInt(v);
                    dataOutputStream.write(Code.f121Z);
                    dataOutputStream.writeInt(w);
                    dataOutputStream.writeUTF(f330k);
                    dataOutputStream.writeUTF(f332l);
                    dataOutputStream.writeUTF(f334m);
                    dataOutputStream.writeUTF(f336n);
                    dataOutputStream.writeUTF(f338o);
                    dataOutputStream.writeBoolean(aG);
                    dataOutputStream.writeLong(f310d);
                    dataOutputStream.writeLong(C);
                    dataOutputStream.writeLong(f285a);
                    dataOutputStream.writeLong(f317g);
                    dataOutputStream.writeInt(x);
                    dataOutputStream.writeInt(y);
                    dataOutputStream.writeInt(Code.m);
                } catch (IOException e2) {
                }
                if (!Code("s", j2.toByteArray(), (Vector) null, z2)) {
                    Code.f89Code.B(((z2 ? 1 : 0) << 1) + 1);
                    Code.f93Code.removeAllElements();
                    try {
                        RecordStore.deleteRecordStore("h1");
                    } catch (RecordStoreException e3) {
                    }
                    m142Code(v, "b");
                    v = -1;
                    objArr = 1;
                } else {
                    objArr = objArr2;
                }
                objArr2 = objArr;
                i2++;
            }
        }
    }

    private void C(byte[] bArr, int i2, int i3) {
        this.f358B = bArr;
        this.f395P = i2;
        this.f415aG = i2 + i3;
    }

    private static int Code(char c2) {
        return Code(I(0), c2);
    }

    static int Code(char c2, int i2) {
        int i3 = 0;
        switch (c2) {
            case 8592:
                i3 = 3;
                break;
            case 8594:
                i3 = 1;
                break;
            case 8595:
                i3 = 2;
                break;
        }
        return (((((i2 >> 16) & 255) * 30) + (((i2 >> 8) & 255) * 59)) + ((i2 & 255) * 11)) / 100 < 128 ? i3 : i3 + 4;
    }

    public static int Code(int i2) {
        switch (i2) {
            case 1:
                return 8593;
            case 2:
                return 8592;
            case 3:
            case 4:
            default:
                return i2;
            case 5:
                return 8594;
            case 6:
                return 8595;
        }
    }

    private static int Code(int i2, char c2) {
        int i3;
        if (!bq || c2 == ' ' || c2 > 2047) {
            return f248Code[i2].charWidth(c2);
        }
        if (f249Code[i2][c2] != -1) {
            return f249Code[i2][c2];
        }
        int height = f248Code[f248Code.length - 1].getHeight();
        if (f231B == null) {
            f231B = Image.createImage(32, height);
        }
        Graphics graphics = f231B.getGraphics();
        graphics.setColor(-1);
        graphics.fillRect(0, 0, 32, height);
        graphics.setColor(0);
        graphics.setFont(f248Code[i2]);
        graphics.drawChar(c2, 0, 0, 20);
        int[] iArr = new int[(height << 5)];
        f231B.getRGB(iArr, 0, 32, 0, 0, 32, height);
        int i4 = iArr[iArr.length - 1];
        int i5 = (height << 5) - 1;
        int i6 = 0;
        while (i5 >= 0) {
            if (iArr[i5] != i4) {
                i6 = Math.max(i5 & 31, i6);
                i3 = i5 & -32;
            } else {
                i3 = i5;
            }
            i5 = i3 - 1;
        }
        byte b2 = (byte) (i6 + 2);
        f249Code[i2][c2] = b2;
        return b2;
    }

    public static int Code(int i2, int i3, int i4) {
        return Math.max(Math.min(i2, i4), i3);
    }

    static int Code(int i2, int i3, boolean z2) {
        if (f250Code != null) {
            for (int length = f250Code.length - 1; length > 0; length--) {
                if (f250Code[length][0] == ((char) i2)) {
                    int length2 = f250Code[length].length - 1;
                    if (z2 && length2 > 1) {
                        return f250Code[length][length2];
                    }
                    for (int i4 = 1; i4 < length2 && i3 != -1; i4++) {
                        if (f250Code[length][i4] == ((char) i3)) {
                            return f250Code[length][i4 + 1];
                        }
                    }
                    if (length2 > 0) {
                        return f250Code[length][1];
                    }
                    return -1;
                }
            }
            if ((f250Code[0][0] & 1) != 0) {
                if (i2 == 8) {
                    return i2;
                }
                if (i2 >= 32 && i2 <= 255) {
                    return i2;
                }
            }
            if ((f250Code[0][0] & 2) == 0 && i2 >= 32) {
                try {
                    String keyName = Code.f89Code.getKeyName(i2);
                    if (keyName.length() == 1 && Character.toLowerCase(keyName.charAt(0)) == Character.toLowerCase((char) i2)) {
                        return i2;
                    }
                    if (i2 == 32 && keyName.toLowerCase().equals("space")) {
                        return i2;
                    }
                } catch (Throwable th) {
                }
            }
        }
        return -1;
    }

    private static int Code(int i2, DataInputStream dataInputStream) {
        Code(dataInputStream, (long) ((i2 & 63) * 4));
        int readInt = dataInputStream.readInt();
        int readInt2 = (dataInputStream.readInt() + 4) - readInt;
        Code(dataInputStream, (long) readInt);
        return readInt2;
    }

    static int Code(int i2, String str) {
        int I2 = I(i2);
        return !bq ? f248Code[I2].stringWidth(str) : Z(I2, str.toCharArray(), 0, str.length());
    }

    private static int Code(int i2, byte[] bArr, int i3) {
        if (i2 <= 127) {
            bArr[i3] = (byte) i2;
            return 1;
        } else if (i2 <= 2047) {
            bArr[i3] = (byte) ((i2 >> 6) | 192);
            bArr[i3 + 1] = (byte) ((i2 & 63) | 128);
            return 2;
        } else {
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i2 >> 12) | 224);
            bArr[i4] = (byte) (((i2 >> 6) & 63) | 128);
            bArr[i4 + 1] = (byte) ((i2 & 63) | 128);
            return 3;
        }
    }

    static synchronized int Code(int i2, byte[] bArr, String str) {
        synchronized (e.class) {
            RecordStore recordStore = null;
            try {
                RecordStore openRecordStore = RecordStore.openRecordStore(str, true);
                if (i2 == -1) {
                    i2 = Code(openRecordStore, bArr);
                    try {
                        openRecordStore.closeRecordStore();
                    } catch (Throwable th) {
                    }
                } else {
                    byte[] Code2 = m165Code(bArr);
                    openRecordStore.setRecord(i2, Code2, 0, Code2.length);
                    openRecordStore.closeRecordStore();
                }
            } catch (Throwable th2) {
                i2 = -1;
            }
        }
        return i2;
    }

    static int Code(int i2, char[] cArr, int i3, int i4) {
        int I2 = I(i2);
        return !bq ? f248Code[I2].charsWidth(cArr, i3, i4) : Z(I2, cArr, i3, i4);
    }

    private static int Code(int i2, int[] iArr) {
        while (iArr[i2] == 0) {
            i2++;
            if (i2 == iArr.length) {
                return 0;
            }
        }
        return iArr.length - i2;
    }

    private synchronized int Code(e eVar) {
        int i2;
        if (this.f385I == null) {
            i2 = -1;
        } else {
            byte[] bArr = eVar.f358B;
            bArr[0] = (byte) (this.f401V >> 16);
            bArr[1] = (byte) this.f401V;
            this.f403Z.m198Z(bArr, 2);
            this.f403Z.m192J(bArr, 0);
            eVar.f356B = new e(bArr, 0);
            eVar.f356B.I(this.f390J, 0, 8);
            this.f403Z.m192J(bArr, 0);
            eVar.f459d = new e(bArr, 0);
            eVar.f459d.I(this.f390J, 0, 8);
            this.f403Z.m192J(bArr, 0);
            eVar.f464e = new e(bArr, (byte) 0);
            eVar.f464e.B(bArr, 0, 1024);
            this.f403Z.m192J(bArr, 0);
            eVar.f468f = new e(bArr, (byte) 0);
            eVar.f468f.B(bArr, 0, 1024);
            i2 = this.f401V;
            this.f401V = i2 + 1;
        }
        return i2;
    }

    static int Code(String str) {
        String I2 = m181I(str);
        int indexOf = I2.indexOf(58);
        if (indexOf != -1) {
            I2 = I2.substring(0, indexOf);
        }
        return Integer.parseInt(I2);
    }

    public static int Code(String str, String str2) {
        try {
            Object[] Code2 = m175Code(str, true);
            for (int i2 = 0; i2 < f246Code.length; i2++) {
                e eVar = f246Code[i2];
                String str3 = (String) Code2[1];
                int intValue = ((Integer) Code2[2]).intValue();
                String str4 = (String) Code2[3];
                if (J(eVar.f475r, (String) Code2[0]) && J(eVar.f372Code, str3) && ((eVar.f396Q == 0 || intValue == eVar.f396Q) && J(eVar.f460d, str4))) {
                    return f246Code[i2].f393N == 255 ? Code(str2, (String) null) : f246Code[i2].f393N;
                }
            }
            return 0;
        } catch (Throwable th) {
            return 0;
        }
    }

    private static int Code(Hashtable hashtable) {
        if (hashtable == null) {
            return 0;
        }
        int i2 = 7;
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            Object[] objArr = (Object[]) hashtable.get(str);
            i2 = ((Integer) objArr[1]).intValue() + 4 + i2 + Z(str) + 2 + Z((String) objArr[0]) + 2;
        }
        return i2;
    }

    private static int Code(Vector vector, String str) {
        for (int i2 = 0; i2 < vector.size(); i2++) {
            Object[] Code2 = Code(vector, i2);
            if (!I(Code2, 1) && str.equals(Code2[1])) {
                return i2;
            }
        }
        return -1;
    }

    static int Code(Vector vector, byte[] bArr, boolean z2) {
        for (int i2 = 0; i2 < vector.size(); i2++) {
            if (Code(bArr, (byte[]) ((Object[]) vector.elementAt(i2))[(z2 ? 1 : 0) + 7])) {
                return i2;
            }
        }
        return -1;
    }

    private static int Code(RecordStore recordStore, byte[] bArr) {
        byte[] Code2 = m165Code(bArr);
        return recordStore.addRecord(Code2, 0, Code2.length);
    }

    private int Code(boolean z2) {
        if (!z2) {
            return (this.f429aa * (m235I() - I(false))) / Math.max(Math.max(this.f367Code.b(), m235I()) - m235I(), 1);
        }
        int i2 = this.f454az + 1;
        return this.f438aj < 0 ? i2 : i2 + (((this.f450av - I(true)) * this.f438aj) / (this.f458c.size() - this.f449au));
    }

    public static int Code(byte[] bArr, int i2) {
        return (bArr[i2] << 8) + (bArr[i2 + 1] & 255);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0033 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0033 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x002b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int Code(byte[] r9, int r10, int r11) {
        /*
        // Method dump skipped, instructions count: 364
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.Code(byte[], int, int):int");
    }

    public static int Code(byte[] bArr, int i2, char[] cArr, int i3, int i4) {
        while (i4 > 0) {
            int B2 = B(bArr, i2);
            int a2 = a((int) bArr[i2]);
            i4 -= a2;
            i2 += a2;
            if (B2 <= 65535) {
                cArr[i3] = (char) B2;
                i3++;
            } else {
                int i5 = i3 + 1;
                cArr[i3] = (char) (55296 | ((B2 - 65536) >> 10));
                i3 = i5 + 1;
                cArr[i5] = (B2 & 1023) | 56320;
            }
        }
        return i3;
    }

    static int Code(Object[] objArr, int i2) {
        if (i2 < objArr.length) {
            return ((Integer) objArr[i2]).intValue();
        }
        return 0;
    }

    private int Code(short[] sArr) {
        short s2 = 0;
        while (s2 >= 0) {
            if (this.f431ac == 0) {
                this.f394O = g();
                this.f431ac = 8;
            }
            s2 = sArr[s2 + (this.f394O & 1)];
            this.f394O >>>= 1;
            this.f431ac--;
        }
        return s2 & 4095;
    }

    static long Code(boolean z2, boolean z3) {
        long currentTimeMillis = System.currentTimeMillis();
        if (z3) {
            currentTimeMillis += (long) ((o * 60 * 60 * 1000) + (p * 60 * 1000));
        }
        return z2 ? currentTimeMillis + 1800000 : currentTimeMillis;
    }

    /* renamed from: Code  reason: collision with other method in class */
    private static e m118Code(int i2) {
        e eVar;
        String Code2;
        String str;
        String str2;
        e[] eVarArr = new e[3];
        eVarArr[0] = f324i;
        eVarArr[1] = f327j;
        int i3 = 0;
        while (true) {
            if (i3 >= f263I.length) {
                eVar = null;
                break;
            } else if (f263I[i3].f401V == i2) {
                eVar = f263I[i3];
                break;
            } else {
                i3++;
            }
        }
        eVarArr[2] = eVar;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        String str3 = null;
        int i8 = 0;
        String str4 = null;
        String str5 = null;
        while (i4 < 3) {
            e eVar2 = eVarArr[i4];
            if (eVar2 != null) {
                if (eVar2.f475r.length() != 0) {
                    String str6 = eVar2.f475r;
                    i5 = i4;
                    str = str6;
                    str2 = str6;
                } else {
                    str = str4;
                    str2 = str5;
                }
                if (eVar2.f372Code.length() != 0) {
                    str3 = eVar2.f372Code;
                }
                i8 = eVar2.f397R;
                i7 = eVar2.f398S;
                i6 = eVar2.f393N;
            } else {
                str = str4;
                str2 = str5;
            }
            i4++;
            str4 = str;
            str5 = str2;
        }
        if (i5 == 2) {
            str4 = B(str4);
            Code2 = str5;
        } else {
            Code2 = i2 != 0 ? Code(str5, i2) : str5;
        }
        return new e(i2, i8, Code2, i7, i6, str3, str4);
    }

    private static e Code(int i2, byte b2, boolean z2) {
        e eVar;
        synchronized (f239Code) {
            if (f300b.size() <= i2 || f300b.elementAt(i2) == null) {
                eVar = new e(i2, b2, z2);
                Code((Runnable) eVar);
            } else {
                eVar = (e) f300b.elementAt(i2);
                Code(f239Code);
            }
        }
        return eVar;
    }

    static synchronized e Code(byte[] bArr) {
        e eVar;
        synchronized (e.class) {
            int i2 = aY;
            aY = i2 + 1;
            m191J(i2);
            f258I.m149Code(bArr);
            f258I.m151Code(bArr, 0, 32);
            eVar = new e((char) 0);
            eVar.m186I(bArr, 0);
            byte[] bArr2 = f236C;
            eVar.m198Z(bArr2, bArr2.length);
            eVar.m192J(bArr, 0);
        }
        return eVar;
    }

    private g Code() {
        synchronized (f239Code) {
            if (!m211i() && this == f300b.elementAt(this.f396Q)) {
                f300b.setElementAt(null, this.f396Q);
            }
            do {
                if (f237Code == null || !(f237Code == null || this.f396Q == f237Code.Code())) {
                    if (this.f362C) {
                        for (int i2 = 0; i2 < this.f374Code.size(); i2++) {
                            g gVar = (g) this.f374Code.elementAt(i2);
                            if (gVar.B() != 0) {
                                return gVar;
                            }
                        }
                    }
                    this.f362C = false;
                    Code(f239Code, 0);
                } else if (this.f357B) {
                    A();
                    return null;
                } else {
                    g gVar2 = f237Code;
                    f237Code = gVar2.m257Code();
                    int i3 = 1;
                    while (m119Code(i3) != null) {
                        i3++;
                    }
                    this.f374Code.addElement(gVar2);
                    gVar2.Code(this, i3);
                    A();
                    return gVar2;
                }
            } while (!this.f357B);
            A();
            return null;
        }
    }

    /* renamed from: Code  reason: collision with other method in class */
    private synchronized g m119Code(int i2) {
        g gVar;
        int i3 = 0;
        while (true) {
            if (i3 >= this.f374Code.size()) {
                gVar = null;
                break;
            }
            gVar = (g) this.f374Code.elementAt(i3);
            if (gVar.I() == i2) {
                break;
            }
            i3++;
        }
        return gVar;
    }

    static g Code(Object[] objArr, int[] iArr, int i2) {
        g gVar = new g(objArr, iArr, i2);
        I(gVar);
        A();
        return gVar;
    }

    /* renamed from: Code  reason: collision with other method in class */
    static DataInputStream m120Code(int i2) {
        DataInputStream dataInputStream = new DataInputStream(m121Code((i2 & 64) == 0 ? "/t" : "/v"));
        Code(i2, dataInputStream);
        return dataInputStream;
    }

    /* renamed from: Code  reason: collision with other method in class */
    private static InputStream m121Code(String str) {
        return Runtime.getRuntime().getClass().getResourceAsStream(str);
    }

    /* renamed from: Code  reason: collision with other method in class */
    static String m122Code(int i2) {
        if (f272J == null) {
            DataInputStream dataInputStream = null;
            try {
                dataInputStream = m120Code(65);
                if (dataInputStream.readByte() != 1) {
                    try {
                        dataInputStream.close();
                    } catch (Throwable th) {
                    }
                } else {
                    f342q = dataInputStream.readUTF();
                    f272J = new String[(dataInputStream.readShort() - 1)];
                    dataInputStream.readUTF();
                    try {
                        f351w = dataInputStream.readUTF();
                        for (int i3 = 0; i3 < f272J.length; i3++) {
                            f272J[i3] = dataInputStream.readUTF();
                        }
                        try {
                            dataInputStream.close();
                        } catch (Throwable th2) {
                        }
                    } catch (Throwable th3) {
                    }
                }
            } catch (IOException e2) {
                dataInputStream.close();
            } catch (Throwable th4) {
            }
        }
        return (f272J == null || i2 >= f272J.length || f272J[i2] == null) ? "" : f272J[i2];
        throw th;
    }

    private static String Code(int i2, int i3) {
        return new StringBuffer().append(i2 == 0 ? "" : new StringBuffer().append((char) i2).toString()).append((char) i3).toString();
    }

    /* renamed from: Code  reason: collision with other method in class */
    static String m123Code(int i2, int i3, boolean z2) {
        String Code2 = Code(i2, i3);
        if (f260I.containsKey(Code2)) {
            return Code(((Integer) f260I.get(Code2)).intValue(), z2);
        }
        return null;
    }

    /* renamed from: Code  reason: collision with other method in class */
    static String m124Code(int i2, String str) {
        return Code(m122Code(i2), "%s", str);
    }

    static String Code(int i2, String str, int i3, String str2) {
        if (str2 == null) {
            str2 = "...";
        }
        String substring = str.substring(0, Math.min(str.length(), 4096));
        if (Code(i2, substring) <= i3) {
            return substring;
        }
        char[] charArray = substring.toCharArray();
        return new StringBuffer().append(substring.substring(0, I(i2, charArray, charArray.length, i3 - Code(i2, str2)))).append(str2).toString();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    static String Code(int i2, boolean z2) {
        String I2;
        String str;
        switch (i2) {
            case 0:
                I2 = m180I(80);
                str = m122Code(24);
                break;
            case 1:
                I2 = m180I(90);
                str = m122Code(7);
                break;
            case 2:
            default:
                str = null;
                I2 = null;
                break;
            case 3:
                I2 = m180I(119);
                str = m122Code(52);
                break;
            case 4:
                I2 = m180I(65);
                str = m122Code(42);
                break;
            case 5:
                I2 = m180I(86);
                str = m122Code(16);
                break;
            case 6:
                I2 = new StringBuffer().append("nint:").append(m180I(77)).toString();
                str = m122Code(49);
                break;
            case 7:
                I2 = new StringBuffer().append("nint:dialog:").append(m180I(89)).toString();
                str = m122Code(105);
                break;
            case 8:
                I2 = m180I(73);
                str = m122Code(9);
                break;
            case 9:
                I2 = m180I(109);
                str = m122Code(47);
                break;
            case 10:
                I2 = m180I(83);
                str = m122Code(5);
                break;
            case 11:
                I2 = m180I(82);
                str = m122Code(32);
                break;
            case 12:
                I2 = m180I(127);
                str = m122Code(141);
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
                Object[] Code2 = Code(f269J, i2 - 13);
                if (Code2 != null && !m159Code(Code2)) {
                    I2 = new StringBuffer().append("ext:").append(Code2[0]).toString();
                    String str2 = (String) Code2[1];
                    if (str2 == null || str2.length() == 0) {
                        str2 = I2;
                    }
                    if (str2.startsWith("http://")) {
                        str2 = str2.substring(7);
                    } else if (str2.startsWith("https://")) {
                        str2 = str2.substring(8);
                    }
                    if (str2.startsWith("www.")) {
                        str2 = str2.substring(4);
                    }
                    str = str2;
                    break;
                }
                str = null;
                I2 = null;
                break;
            case 22:
                I2 = new StringBuffer().append("feed:start//").append(System.currentTimeMillis()).toString();
                str = m122Code(34);
                break;
            case 23:
                if (!aj) {
                    I2 = m180I(39);
                    str = m122Code(176);
                    break;
                } else {
                    return null;
                }
            case 24:
                I2 = m180I(120);
                str = m122Code(51);
                break;
            case 25:
                String Code3 = m122Code(226);
                I2 = m180I(153);
                str = Code3;
                break;
            case 26:
                String Code4 = m122Code(227);
                I2 = m180I(154);
                str = Code4;
                break;
            case 27:
                String Code5 = m122Code(231);
                I2 = m180I(158);
                str = Code5;
                break;
            case 28:
                String Code6 = m122Code(229);
                I2 = m180I(156);
                str = Code6;
                break;
            case 29:
                String Code7 = m122Code(236);
                I2 = m180I(159);
                str = Code7;
                break;
            case 30:
                String Code8 = m122Code(230);
                I2 = m180I(157);
                str = Code8;
                break;
            case 31:
                String Code9 = m122Code(13);
                I2 = m180I(162);
                str = Code9;
                break;
            case 32:
                String Code10 = m122Code(228);
                I2 = m180I(155);
                str = Code10;
                break;
            case 33:
                String Code11 = m122Code(89);
                I2 = m180I(161);
                str = Code11;
                break;
            case 34:
                String Code12 = m122Code(232);
                I2 = m180I(81);
                str = Code12;
                break;
            case 35:
                if (z >= 0) {
                    String Code13 = m122Code(233);
                    I2 = m180I(151);
                    str = Code13;
                    break;
                } else {
                    return null;
                }
            case 36:
                if (n > 0) {
                    String Code14 = m122Code(234);
                    I2 = m180I(150);
                    str = Code14;
                    break;
                } else {
                    return null;
                }
            case 37:
                String Code15 = m122Code(235);
                I2 = m180I(152);
                str = Code15;
                break;
            case 38:
                String Code16 = m122Code(97);
                I2 = new StringBuffer().append("dialog:").append(m180I(33)).toString();
                str = Code16;
                break;
            case 39:
                String Code17 = m122Code(225);
                I2 = m180I(160);
                str = Code17;
                break;
            case 40:
                I2 = new StringBuffer().append("bottomOverlay:").append(m180I(165)).toString();
                str = m122Code(256);
                break;
            case 41:
                I2 = "addTab:";
                str = m122Code(248);
                break;
            case 42:
                I2 = new StringBuffer().append("closeTab:").append(Code.Z()).toString();
                str = m122Code(250);
                break;
            case 43:
                I2 = "moveToLeftTab:";
                str = m122Code(253);
                break;
            case 44:
                I2 = "moveToRightTab:";
                str = m122Code(254);
                break;
        }
        return z2 ? str : I2;
    }

    static String Code(long j2) {
        if (j2 < 1024) {
            return new StringBuffer().append(j2).append(" B").toString();
        }
        return new StringBuffer().append(j2 / 1024).append(" kB").toString();
    }

    /* renamed from: Code  reason: collision with other method in class */
    static String m125Code(String str) {
        String property = System.getProperty(str);
        if (property != null) {
            I(property.getBytes());
        }
        return property;
    }

    private static String Code(String str, int i2) {
        int indexOf = str.indexOf(46);
        return indexOf > 0 ? new StringBuffer().append(str.substring(0, indexOf)).append('-').append(i2).append(str.substring(indexOf)).toString() : str;
    }

    /* renamed from: Code  reason: collision with other method in class */
    static String m126Code(String str, String str2) {
        if (!(str == null || str2 == null)) {
            String stringBuffer = new StringBuffer().append('&').append(str).append('&').toString();
            if (stringBuffer.indexOf(new StringBuffer().append('&').append(str2).append('&').toString()) >= 0) {
                return "";
            }
            int indexOf = stringBuffer.indexOf(new StringBuffer().append('&').append(str2).append('=').toString());
            if (indexOf >= 0) {
                int length = indexOf + str2.length() + 2;
                return C(stringBuffer.substring(length, stringBuffer.indexOf(38, length)));
            }
        }
        return null;
    }

    static String Code(String str, String str2, String str3) {
        int indexOf = str.indexOf(str2);
        return indexOf < 0 ? str : new StringBuffer().append(str.substring(0, indexOf)).append(str3).append(str.substring(indexOf + str2.length())).toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    static String Code(String str, boolean z2) {
        if (str == null) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str.length());
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt > 127) {
                if (charAt > 2047) {
                    Code(stringBuffer, (((charAt >> '\f') & 15) | 224) == 1 ? (char) 1 : 0);
                    Code(stringBuffer, (((charAt >> 6) & 63) | 128) == 1 ? (char) 1 : 0);
                } else {
                    Code(stringBuffer, (((charAt >> 6) & 31) | 192) == 1 ? (char) 1 : 0);
                }
                Code(stringBuffer, (charAt & '?') | 128 ? (char) 1 : 0);
                i2++;
            } else if (z2 && charAt == ' ') {
                stringBuffer.append('+');
                i2++;
            } else if (charAt == '%' || charAt <= ' ') {
                Code(stringBuffer, charAt);
                i2++;
            } else if (!z2 || "&=?#:".indexOf(charAt) < 0) {
                stringBuffer.append(charAt);
                i2++;
            } else {
                Code(stringBuffer, charAt);
                i2++;
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: Code  reason: collision with other method in class */
    public static String m127Code(byte[] bArr, int i2) {
        int i3 = i2 + 2;
        return m128Code(bArr, i3, I(bArr, i2) + i3);
    }

    /* renamed from: Code  reason: collision with other method in class */
    private static String m128Code(byte[] bArr, int i2, int i3) {
        StringBuffer stringBuffer = new StringBuffer(i3 - i2);
        while (i2 < i3) {
            int B2 = B(bArr, i2);
            if (B2 <= 65535) {
                stringBuffer.append((char) B2);
            } else {
                stringBuffer.append((char) (55296 | ((B2 - 65536) >> 10)));
                stringBuffer.append(((B2 & 1023) | 56320) == 1 ? (char) 1 : 0);
            }
            i2 += a((int) bArr[i2]);
        }
        return stringBuffer.toString();
    }

    /* renamed from: Code  reason: collision with other method in class */
    static Calendar m129Code(boolean z2, boolean z3) {
        Calendar instance = Calendar.getInstance(TimeZone.getDefault());
        instance.setTime(new Date(Code(z2, z3)));
        return instance;
    }

    /* renamed from: Code  reason: collision with other method in class */
    static Vector m130Code(int i2) {
        switch (i2) {
            case 52:
                return f269J;
            case 101:
                return f282Z;
            case 141:
                return f287a;
            default:
                return f234C;
        }
    }

    private static Vector Code(DataInputStream dataInputStream) {
        byte readByte = dataInputStream.readByte();
        Vector vector = new Vector(readByte);
        for (int i2 = 0; i2 < readByte; i2++) {
            Object[] objArr = new Object[4];
            objArr[1] = dataInputStream.readUTF();
            objArr[0] = dataInputStream.readUTF();
            int readShort = dataInputStream.readShort();
            if (readShort > 0) {
                byte[] bArr = new byte[readShort];
                dataInputStream.readFully(bArr, 0, readShort);
                objArr[2] = bArr;
            }
            vector.addElement(objArr);
        }
        return vector;
    }

    /* renamed from: Code  reason: collision with other method in class */
    private static synchronized Vector m131Code(String str) {
        Vector vector;
        RecordStore recordStore = null;
        synchronized (e.class) {
            Vector vector2 = new Vector();
            try {
                recordStore = RecordStore.openRecordStore(str, false);
                recordStore.getSizeAvailable();
                if ("s".equals(str)) {
                    RecordEnumeration enumerateRecords = recordStore.enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
                    int i2 = -1;
                    int numRecords = enumerateRecords.numRecords();
                    for (int i3 = 0; i3 < numRecords; i3++) {
                        i2 = Math.max(i2, enumerateRecords.nextRecordId());
                    }
                    vector2.addElement(recordStore.getRecord(i2));
                } else {
                    int numRecords2 = recordStore.getNumRecords();
                    int i4 = 1;
                    while (i4 <= numRecords2) {
                        try {
                            vector2.addElement(recordStore.getRecord(i4));
                            i4++;
                        } catch (RecordStoreException e2) {
                            i4++;
                        }
                    }
                }
            } catch (Throwable th) {
            }
            try {
                recordStore.closeRecordStore();
                vector = vector2;
            } catch (Throwable th2) {
                vector = vector2;
            }
        }
        return vector;
    }

    static Vector Code(boolean z2, String str, int i2) {
        DataInputStream dataInputStream;
        int readUnsignedByte;
        Vector vector;
        Vector vector2 = null;
        boolean z3 = false;
        if (z2) {
            try {
                Vector Code2 = m131Code(str);
                int size = Code2.size();
                if (size == 0) {
                    InputStream inputStream = null;
                    try {
                        inputStream.close();
                        return null;
                    } catch (Throwable th) {
                        return null;
                    }
                } else {
                    z3 = str.equals("h1");
                    readUnsignedByte = size;
                    vector = Code2;
                    dataInputStream = null;
                }
            } catch (Throwable th2) {
                dataInputStream = null;
                try {
                    dataInputStream.close();
                    return vector2;
                } catch (Throwable th3) {
                    return vector2;
                }
            }
        } else {
            DataInputStream Code3 = m120Code(i2);
            try {
                readUnsignedByte = Code3.readUnsignedByte();
                vector = null;
                dataInputStream = Code3;
            } catch (Throwable th4) {
                dataInputStream = Code3;
                dataInputStream.close();
                return vector2;
            }
        }
        try {
            Vector vector3 = new Vector(readUnsignedByte);
            int i3 = 0;
            DataInputStream dataInputStream2 = dataInputStream;
            while (i3 < readUnsignedByte) {
                if (z2) {
                    try {
                        dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) vector.elementAt(i3)));
                    } catch (Throwable th5) {
                        dataInputStream = dataInputStream2;
                        vector2 = vector3;
                        dataInputStream.close();
                        return vector2;
                    }
                    try {
                        dataInputStream.read();
                    } catch (Throwable th6) {
                        vector2 = vector3;
                        dataInputStream.close();
                        return vector2;
                    }
                } else {
                    dataInputStream = dataInputStream2;
                }
                Object[] objArr = new Object[11];
                objArr[0] = dataInputStream.readUTF();
                objArr[1] = dataInputStream.readUTF();
                int readShort = dataInputStream.readShort();
                if (readShort > 0) {
                    byte[] bArr = new byte[readShort];
                    dataInputStream.readFully(bArr);
                    objArr[2] = bArr;
                }
                if (z3) {
                    objArr[3] = dataInputStream.readUTF();
                } else if (str == null || !str.equals("u")) {
                    int i4 = i2 - 66;
                    int i5 = ((i4 | (-i4)) >>> 31) ^ 1;
                    byte readByte = dataInputStream.readByte();
                    objArr[3] = new Integer(readByte);
                    byte[] bArr2 = new byte[16];
                    byte[] bArr3 = new byte[16];
                    for (int i6 = 0; i6 < 16; i6++) {
                        bArr3[i6] = -1;
                    }
                    if ((readByte & 8) != 0) {
                        byte readByte2 = dataInputStream.readByte();
                        objArr[5] = new Integer(dataInputStream.readByte());
                        objArr[6] = new Integer(dataInputStream.readByte());
                        dataInputStream.readFully(bArr2);
                        if (readByte2 > 1) {
                            dataInputStream.readFully(bArr3);
                        }
                        if (readByte2 > 2) {
                            objArr[9] = new Integer(dataInputStream.readByte());
                            objArr[10] = new Integer(dataInputStream.readInt());
                            i5 = 0;
                        } else {
                            i5 = 1;
                        }
                    } else {
                        objArr[5] = new Integer(97);
                        objArr[6] = new Integer(0);
                        for (int i7 = 0; i7 < 16; i7++) {
                            bArr2[i7] = (byte) f241Code.nextInt();
                        }
                    }
                    objArr[4] = new Integer(3);
                    objArr[7] = bArr2;
                    objArr[8] = bArr3;
                    if (i5 != 0 && (("sp".equals(str) || m160Code(objArr, 1)) && !m159Code(objArr))) {
                        objArr[9] = new Integer(4);
                        StringBuffer append = new StringBuffer().append((String) objArr[1]);
                        String str2 = (String) objArr[0];
                        if (str2.length() > 2 && str2.indexOf(47) == 1) {
                            str2 = str2.substring(2);
                        }
                        objArr[10] = new Integer(J(append.append(str2).toString()));
                    } else if (i5 != 0) {
                        objArr[9] = new Integer(0);
                        objArr[10] = new Integer(0);
                    }
                } else {
                    byte readByte3 = dataInputStream.readByte();
                    objArr[3] = new Integer(readByte3);
                    if ((readByte3 & 8) != 0 && dataInputStream.readByte() > 0) {
                        objArr[9] = new Integer(dataInputStream.readByte());
                    }
                    byte[] bArr4 = new byte[16];
                    byte[] bArr5 = new byte[16];
                    for (int i8 = 0; i8 < 16; i8++) {
                        bArr5[i8] = -1;
                    }
                    objArr[5] = new Integer(97);
                    objArr[6] = new Integer(0);
                    for (int i9 = 0; i9 < 16; i9++) {
                        bArr4[i9] = (byte) f241Code.nextInt();
                    }
                    objArr[7] = bArr4;
                    objArr[8] = bArr5;
                }
                if (objArr[1].equals("o:X")) {
                    i3++;
                    dataInputStream2 = dataInputStream;
                } else if (objArr[0].equals("o:u")) {
                    i3++;
                    dataInputStream2 = dataInputStream;
                } else {
                    vector3.addElement(objArr);
                    i3++;
                    dataInputStream2 = dataInputStream;
                }
            }
            try {
                dataInputStream2.close();
                return vector3;
            } catch (Throwable th7) {
                return vector3;
            }
        } catch (Throwable th8) {
            dataInputStream.close();
            return vector2;
        }
    }

    /* renamed from: Code  reason: collision with other method in class */
    static Image m132Code() {
        return m135Code((aX % 3) + 92, aX / 3, Code.d);
    }

    /* renamed from: Code  reason: collision with other method in class */
    static Image m133Code(char c2, int i2) {
        return m136Code(Code(c2, i2), false);
    }

    /* renamed from: Code  reason: collision with other method in class */
    static Image m134Code(int i2) {
        return m135Code(i2, 0, Code.d);
    }

    /* renamed from: Code  reason: collision with other method in class */
    static Image m135Code(int i2, int i3, int i4) {
        return Code(G + i2, i3, (i2 - 89) + (i3 * 3), i2 - 89, i4);
    }

    private static Image Code(int i2, int i3, int i4, int i5, int i6) {
        Image Code2;
        if (!f331k || f315f == null || (Code2 = (Image) f315f.elementAt(i4)) == null) {
            if (i3 == 0) {
                Code2 = m184I(i2);
                if (Code2.getHeight() != i6) {
                    Code2 = Code(Code2, 0, i6, 1, true);
                }
            } else {
                int i7 = f326i[i3];
                Code2 = Code(i2, 0, i5, i5, i6);
                if (i7 != 0) {
                    int width = Code2.getWidth();
                    int height = Code2.getHeight();
                    int[] iArr = new int[width];
                    int[] iArr2 = new int[(width * height)];
                    for (int i8 = 0; i8 < height; i8++) {
                        Code2.getRGB(iArr, 0, width, 0, i8, width, 1);
                        for (int i9 = 0; i9 < width; i9++) {
                            iArr2[i7 == 5 ? ((height - i8) - 1) + (i9 * height) : i7 == 6 ? (((width - i9) - 1) * height) + i8 : ((width * height) - ((i8 * width) + i9)) - 1] = iArr[i9];
                        }
                    }
                    Code2 = (i7 == 5 || i7 == 6) ? Image.createRGBImage(iArr2, height, width, true) : Image.createRGBImage(iArr2, width, height, true);
                }
            }
            if (f331k) {
                if (f315f == null) {
                    Vector vector = new Vector(23);
                    f315f = vector;
                    vector.setSize(23);
                }
                f315f.setElementAt(Code2, i4);
            }
        }
        return Code2;
    }

    /* renamed from: Code  reason: collision with other method in class */
    static Image m136Code(int i2, boolean z2) {
        int i3 = 0;
        if (z2) {
            i2 = i2 < 4 ? i2 + 4 : i2 - 4;
        }
        int i4 = (-(i2 < 4 ? 1 : 0)) + 102;
        int i5 = i2 % 4;
        int i6 = i2 + 15;
        if (i2 >= 4) {
            i3 = 4;
        }
        return Code(i4, i5, i6, i3 + 15, Code.d);
    }

    private static Image Code(int i2, boolean z2, int i3) {
        Object[] objArr = z2 ? Code.f99Code : Code.f108I;
        int max = Math.max(Math.min(i2, Code.l), Code.k) - Code.k;
        int i4 = max;
        Image[] imageArr = (Image[]) objArr[max];
        int i5 = max;
        while (imageArr == null) {
            if (i5 < objArr.length - 1) {
                i5++;
            }
            if (i4 > 0) {
                i4--;
            }
            if (objArr[i5] != null) {
                imageArr = (Image[]) objArr[i5];
            } else if (objArr[i4] != null) {
                imageArr = (Image[]) objArr[i4];
            }
        }
        return imageArr[i3];
    }

    /* renamed from: Code  reason: collision with other method in class */
    public static Image m137Code(DataInputStream dataInputStream) {
        Image image = null;
        K = -1;
        L = -1;
        ba = -1;
        aZ = -1;
        try {
            if (dataInputStream.readUnsignedShort() == 65496) {
                boolean z2 = false;
                while (!z2) {
                    int readUnsignedShort = dataInputStream.readUnsignedShort();
                    if ((readUnsignedShort & 65280) == 65280) {
                        switch (readUnsignedShort & 255) {
                            case 0:
                            case 255:
                                break;
                            case 192:
                            case 193:
                            case 194:
                            case 195:
                                dataInputStream.readUnsignedShort();
                                dataInputStream.readByte();
                                L = dataInputStream.readUnsignedShort();
                                K = dataInputStream.readUnsignedShort();
                                z2 = true;
                                continue;
                            case 217:
                                z2 = true;
                                continue;
                            case 225:
                                int readUnsignedShort2 = dataInputStream.readUnsignedShort();
                                StringBuffer stringBuffer = new StringBuffer();
                                while (true) {
                                    char readUnsignedByte = (char) dataInputStream.readUnsignedByte();
                                    if (readUnsignedByte == 0) {
                                        if (!"Exif".equals(stringBuffer.toString())) {
                                            Code(dataInputStream, (long) (readUnsignedShort2 - ((stringBuffer.length() + 2) + 1)));
                                            break;
                                        } else {
                                            dataInputStream.readByte();
                                            byte[] bArr = new byte[(readUnsignedShort2 - 8)];
                                            dataInputStream.readFully(bArr);
                                            Z(bArr);
                                            if (aZ >= 0) {
                                                image = Image.createImage(bArr, aZ, ba);
                                                break;
                                            } else {
                                                continue;
                                            }
                                        }
                                    } else {
                                        stringBuffer.append(readUnsignedByte);
                                    }
                                }
                            default:
                                Code(dataInputStream, (long) (dataInputStream.readUnsignedShort() - 2));
                                continue;
                        }
                    }
                }
                try {
                    dataInputStream.close();
                } catch (Throwable th) {
                }
            }
        } catch (Exception e2) {
        }
        return image;
    }

    static Image Code(Image image, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if (bc) {
            return Image.createImage(image, i2, i3, i4, i5, i6);
        }
        int[] iArr = new int[(i4 * i5)];
        image.getRGB(iArr, 0, i4, i2, i3, i4, i5);
        if (i6 == 6) {
            i7 = i4;
            i8 = i5;
        } else {
            i7 = i5;
            i8 = i4;
        }
        if (!f344r) {
            for (int i9 = 0; i9 < iArr.length; i9++) {
                if ((iArr[i9] >>> 24) != 255) {
                    iArr[i9] = iArr[i9] & 16777215;
                }
            }
        }
        return Image.createRGBImage(iArr, i8, i7, true);
    }

    static Image Code(Image image, int i2, int i3, int i4, boolean z2) {
        int height = image.getHeight() - i2;
        int width = image.getWidth();
        int[] iArr = new int[(width * height)];
        image.getRGB(iArr, 0, width, 0, 0, width, height);
        int[] Code2 = Code(iArr, width, height, i3, i4, z2);
        return Image.createRGBImage(Code2, Code2.length / i3, i3, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4 = r1[r2 + 1];
        r5 = r1[r2 + 2];
        r6 = new int[(r4 * r5)];
        r3 = r2 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r1[r2] != 82) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r0 = 0;
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r0 >= (r4 * r5)) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        r6[r0] = ((((r1[r2] & 255) << 24) + ((r1[r2 + 1] & 255) << 16)) + ((r1[r2 + 2] & 255) << 8)) + (r1[r2 + 3] & 255);
        r0 = r0 + 1;
        r2 = r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        r3 = new byte[((r4 * r5) << 1)];
        r0 = new defpackage.e(r3);
        r0.C(r1, r2 + 3, r13 - 3);
        r0.Code((byte[]) null, 0, r3.length);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
        if (r0 >= ((r4 * r5) << 1)) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        r1 = ((r3[r0] & 240) >>> 4) | (r3[r0] & 240);
        r2 = ((r3[r0] & 15) << 4) | (r3[r0] & 15);
        r0 = r0 + 1;
        r6[r0 >> 1] = (((r1 << 24) + (r2 << 16)) + ((((r3[r0] & 240) >>> 4) | (r3[r0] & 240)) << 8)) + (((r3[r0] & 15) << 4) | (r3[r0] & 15));
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bb, code lost:
        if (r15 == null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bf, code lost:
        if (r15.length != 3) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c1, code lost:
        r15[0] = r6;
        r15[1] = new java.lang.Integer(r4);
        r15[2] = new java.lang.Integer(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dd, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        return javax.microedition.lcdui.Image.createRGBImage(r6, r4, r5, true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static javax.microedition.lcdui.Image Code(byte[] r11, int r12, int r13, int r14, java.lang.Object[] r15) {
        /*
        // Method dump skipped, instructions count: 452
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.Code(byte[], int, int, int, java.lang.Object[]):javax.microedition.lcdui.Image");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static javax.microedition.lcdui.Image Code(byte[] r10, java.lang.Object r11) {
        /*
        // Method dump skipped, instructions count: 219
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.Code(byte[], java.lang.Object):javax.microedition.lcdui.Image");
    }

    /* renamed from: Code  reason: collision with other method in class */
    public static Image m138Code(Object[] objArr, int[] iArr, int i2) {
        if (objArr.length != 3) {
            return null;
        }
        int intValue = ((Integer) objArr[1]).intValue();
        int intValue2 = ((Integer) objArr[2]).intValue();
        int[] iArr2 = (int[]) objArr[0];
        int[] iArr3 = new int[(intValue * intValue2)];
        for (int i3 = 0; i3 < intValue2; i3++) {
            int Code2 = Code((((i3 + i2) + iArr.length) - intValue2) - 1, 0, iArr.length - 1);
            int i4 = 0;
            while (i4 < intValue) {
                int i5 = (i3 * intValue) + i4;
                int i6 = (iArr2[i5] >>> 24) + 1;
                int i7 = 16711680;
                if (i6 > 4) {
                    for (int i8 = 0; i8 < 3; i8++) {
                        iArr3[i5] = iArr3[i5] | (((((iArr2[i5] & i7) * i6) + ((256 - i6) * (iArr[Code2] & i7))) >>> 8) & i7);
                        i7 >>= 8;
                    }
                    i4++;
                } else if (i6 > 252) {
                    iArr3[i5] = iArr2[i5];
                    i4++;
                } else {
                    iArr3[i5] = iArr[Code2];
                    i4++;
                }
            }
        }
        return Image.createRGBImage(iArr3, intValue, intValue2, false);
    }

    /* renamed from: Code  reason: collision with other method in class */
    public static void m139Code() {
        synchronized (f239Code) {
            if (!f292aK) {
                Code((byte) -1, (String) null);
                I((byte) -1, (String) null);
                X++;
                f243Code = true;
                int size = f300b.size();
                int i2 = 0;
                while (i2 < size) {
                    try {
                        e eVar = (e) f300b.elementAt(i2);
                        if (eVar != null) {
                            eVar.f384I |= true;
                            eVar.Code(false, 0);
                        }
                        i2++;
                    } catch (Throwable th) {
                        i2++;
                    }
                }
            }
        }
    }

    private void Code(byte b2) {
        byte[] bArr = this.f385I;
        int i2 = this.f400U;
        this.f400U = i2 + 1;
        bArr[i2] = b2;
        if (this.f400U == this.f385I.length) {
            m150Code(this.f385I, 0);
            this.f400U = 0;
        }
        this.f365Code++;
    }

    private static void Code(byte b2, String str) {
        Z = b2;
        f345s = str;
    }

    /* renamed from: Code  reason: collision with other method in class */
    public static void m140Code(int i2) {
        if (i2 != W) {
            m202b(0);
            W = i2;
            aI = true;
        }
    }

    /* renamed from: Code  reason: collision with other method in class */
    static void m141Code(int i2, int i3, int i4) {
        if ((i2 == 0 && i3 >= 48 && i3 <= 57 && "0".indexOf((char) i3) == -1) || ("#*".indexOf(i2) != -1 && "1234567890#*↑↓←→".indexOf(i3) != -1)) {
            m146Code(Code(i2, i3), i4);
        }
    }

    private static synchronized void Code(int i2, DataInputStream dataInputStream, boolean z2) {
        e[] eVarArr;
        int i3;
        synchronized (e.class) {
            try {
                T();
                e eVar = null;
                int readUnsignedByte = dataInputStream.readUnsignedByte();
                e[] eVarArr2 = new e[readUnsignedByte];
                int i4 = 0;
                while (i4 < readUnsignedByte) {
                    int readUnsignedByte2 = dataInputStream.readUnsignedByte();
                    int readUnsignedByte3 = dataInputStream.readUnsignedByte();
                    String readUTF = dataInputStream.readUTF();
                    eVarArr2[i4] = new e(readUnsignedByte2, readUnsignedByte3, readUTF, dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), dataInputStream.readUTF(), readUTF);
                    e eVar2 = eVarArr2[i4].f401V == 255 ? eVarArr2[i4] : eVar;
                    i4++;
                    eVar = eVar2;
                }
                int readUnsignedByte4 = dataInputStream.readUnsignedByte();
                if (z2) {
                    i3 = 0;
                    eVarArr = new e[readUnsignedByte4];
                } else {
                    e[] eVarArr3 = new e[(readUnsignedByte4 + 2)];
                    eVarArr3[0] = f321h;
                    eVarArr3[readUnsignedByte4 + 1] = f318g;
                    i3 = 0;
                    eVarArr = eVarArr3;
                }
                while (i3 < readUnsignedByte4) {
                    eVarArr[i3 + (!z2 ? 1 : 0)] = new e(dataInputStream.readUTF(), dataInputStream.readUTF(), dataInputStream.readUnsignedShort(), dataInputStream.readUTF(), dataInputStream.readUnsignedByte());
                    i3++;
                }
                f327j = eVar;
                f263I = eVarArr2;
                f246Code = eVarArr;
                a = i2;
            } catch (IOException e2) {
                throw e2;
            }
        }
    }

    /* renamed from: Code  reason: collision with other method in class */
    static void m142Code(int i2, String str) {
        RecordStore recordStore = null;
        try {
            recordStore = RecordStore.openRecordStore(str, false);
            recordStore.deleteRecord(i2);
            recordStore.closeRecordStore();
        } catch (Throwable th) {
        }
    }

    static void Code(int i2, String str, boolean z2) {
        if (f264I[i2] == null || !f264I[i2].equals(str)) {
            f264I[i2] = str;
            if (i2 == 1 && z2) {
                C(false);
            }
        }
    }

    static synchronized void Code(int i2, byte[] bArr) {
        synchronized (e.class) {
            try {
                Code(i2, new DataInputStream(new ByteArrayInputStream(bArr)), false);
                C(false);
            } catch (Throwable th) {
            }
        }
    }

    /* renamed from: Code  reason: collision with other method in class */
    public static void m143Code(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) (i2 >> 8);
        bArr[i3 + 1] = (byte) i2;
    }

    static void Code(long j2, long j3, long j4) {
        C += j2;
        f285a += j3;
        f317g += j4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010c, code lost:
        if (r2[0].equals(r0[0]) != false) goto L_0x010e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Code(defpackage.B r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 476
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.Code(B, boolean):void");
    }

    private static void Code(J j2, int i2, int i3, int i4) {
        j2.Code(j2.size() + 8);
        Code(j2.Code(), j2.size() - 8, i2, i3, i4);
    }

    /* renamed from: Code  reason: collision with other method in class */
    static void m144Code(e eVar) {
        I i2 = new I(42);
        i2.f189Code = eVar;
        Code.f89Code.f150Code.schedule(i2, 100, 100);
    }

    static void Code(g gVar, boolean z2) {
        synchronized (f239Code) {
            if (!gVar.m270Z()) {
                gVar.I(0);
                e Code2 = gVar.m256Code();
                if (Code2 != null) {
                    if (Code2.m211i()) {
                        Code2.f362C = true;
                        gVar.Z((z2 ? 1 : 0) + 6);
                        Code(f239Code);
                    }
                } else if (f237Code != null) {
                    f237Code = f237Code.Code(gVar);
                }
            }
        }
    }

    private void Code(g gVar, byte[] bArr) {
        String str;
        String str2;
        String str3;
        String headerField;
        String str4 = this.f407Z[this.f364Code];
        int indexOf = str4.indexOf(59);
        if (indexOf >= 0) {
            String substring = str4.substring(indexOf);
            String substring2 = str4.substring(0, indexOf);
            str = substring;
            str2 = substring2;
        } else {
            str = "";
            str2 = str4;
        }
        Y = this.f396Q;
        f293aM = this.f456b;
        if (m211i()) {
            if (this.f371Code == null) {
                SocketConnection open = Connector.open(new StringBuffer().append(str2).append(str).toString(), 3, !bi);
                this.f375Code = open;
                if (bk) {
                    open.setSocketOption((byte) 1, 0);
                }
                this.f371Code = open.openDataOutputStream();
                this.f382I = this.f371Code;
                this.f370Code = open.openDataInputStream();
                this.f381I = this.f370Code;
            }
            m115B(bArr, bArr.length);
            B(gVar);
            return;
        }
        String str5 = "";
        if (gVar != null) {
            Object[] Code2 = gVar.m263Code();
            str3 = (String) Code2[53];
            str5 = (String) Code2[42];
        } else {
            str3 = "server:test";
        }
        if ((this.f361C.f397R & 2) != 0) {
            String I2 = m182I(str3, str5);
            if (str3 != null && (str3.startsWith("b:") || str3.startsWith("javascript:"))) {
                str3 = m182I((String) gVar.m263Code()[38], (String) null);
            } else if (!"".equals(I2)) {
                str3 = I2;
            } else if (str3 == null) {
                str3 = "internal";
            }
            str2 = new StringBuffer().append(str2).append(str3).toString();
        }
        HttpConnection open2 = Connector.open(new StringBuffer().append(str2).append(str).toString(), 3, !bi);
        this.f375Code = open2;
        open2.setRequestMethod("POST");
        if (str2.startsWith("http://10.0.0.172")) {
            open2.setRequestProperty("X-Online-Host", m177Code(Z())[0]);
        }
        open2.setRequestProperty("Content-Type", "application/xml");
        this.f371Code = open2.openDataOutputStream();
        this.f382I = this.f371Code;
        m115B(bArr, bArr.length);
        B(gVar);
        this.f371Code.close();
        this.f371Code = null;
        this.f370Code = open2.openDataInputStream();
        this.f381I = this.f370Code;
        int responseCode = open2.getResponseCode();
        if (responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307) {
            this.f401V = 1;
            if (gVar != null && this.f361C.m207e() && (headerField = open2.getHeaderField("Location")) != null && headerField.length() > 0) {
                if (gVar.Code(headerField)) {
                    J(gVar);
                    A();
                } else {
                    gVar.close();
                }
            }
            e(false);
        } else if (responseCode == 403) {
            this.f401V = 2;
            try {
                StringBuffer stringBuffer = new StringBuffer();
                int i2 = 0;
                while (true) {
                    int read = this.f370Code.read();
                    if (read <= 32 || (i2 = i2 + 1) > 256) {
                        break;
                    }
                    stringBuffer.append((char) read);
                    if (i2 == 4 && !stringBuffer.toString().toLowerCase().equals("http")) {
                        stringBuffer.setLength(0);
                        break;
                    }
                }
                if (stringBuffer.length() > 0) {
                    f312e = stringBuffer.toString();
                } else {
                    f312e = null;
                }
            } catch (Throwable th) {
            }
            Code(false, 4);
            Code.f89Code.Code((gVar.m255Code() == null || gVar.m255Code().m30Code() == null) ? null : gVar.m255Code().m30Code(), m180I(62));
        }
    }

    /* renamed from: Code  reason: collision with other method in class */
    static void m145Code(DataInputStream dataInputStream) {
        f330k = dataInputStream.readUTF();
        f332l = dataInputStream.readUTF();
        f334m = dataInputStream.readUTF();
        f336n = dataInputStream.readUTF();
        f338o = dataInputStream.readUTF();
    }

    private static void Code(DataInputStream dataInputStream, int i2) {
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                m191J(dataInputStream.readInt());
                i2 = i3;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void Code(java.io.DataInputStream r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.Code(java.io.DataInputStream, boolean):void");
    }

    private static synchronized void Code(DataOutputStream dataOutputStream) {
        synchronized (e.class) {
            dataOutputStream.writeBoolean(f243Code);
            dataOutputStream.writeByte(Z);
            dataOutputStream.writeByte(J);
            dataOutputStream.writeUTF(f347t == null ? "" : f347t);
            dataOutputStream.writeUTF(f345s == null ? "" : f345s);
            dataOutputStream.writeByte(f256I);
            dataOutputStream.writeByte(f240Code.size());
            Enumeration keys = f240Code.keys();
            while (keys.hasMoreElements()) {
                String str = (String) keys.nextElement();
                dataOutputStream.writeUTF(str);
                e eVar = (e) ((Object[]) f240Code.get(str))[0];
                Code(dataOutputStream, eVar.f391J);
                dataOutputStream.writeLong(eVar.f366Code);
                dataOutputStream.write(eVar.f390J);
                dataOutputStream.write(eVar.f406Z.length);
                dataOutputStream.write(eVar.f406Z);
                if (f264I[1] == null) {
                    dataOutputStream.writeInt(0);
                } else {
                    Code(dataOutputStream, eVar.f359B);
                    Code(dataOutputStream, eVar.f363C);
                }
            }
        }
    }

    static void Code(DataOutputStream dataOutputStream, int i2) {
        dataOutputStream.writeShort(i2 >> 8);
        dataOutputStream.write(i2);
    }

    private static void Code(DataOutputStream dataOutputStream, Vector vector) {
        int size = vector != null ? vector.size() : 0;
        dataOutputStream.writeByte(size);
        int i2 = 0;
        while (i2 < size) {
            Object[] Code2 = Code(vector, i2);
            dataOutputStream.writeUTF((String) Code2[1]);
            dataOutputStream.writeUTF((String) Code2[0]);
            byte[] bArr = (byte[]) Code2[2];
            if (bArr != null) {
                dataOutputStream.writeShort(bArr.length);
                dataOutputStream.write(bArr);
                i2++;
            } else {
                dataOutputStream.writeShort(0);
                i2++;
            }
        }
    }

    private static void Code(DataOutputStream dataOutputStream, int[] iArr) {
        if (iArr != null) {
            dataOutputStream.writeShort(iArr.length);
            dataOutputStream.write(Code(iArr));
            return;
        }
        dataOutputStream.writeShort(0);
    }

    public static void Code(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (Throwable th) {
        }
    }

    static void Code(InputStream inputStream, long j2) {
        while (j2 > 0) {
            j2 -= inputStream.skip(j2);
        }
    }

    public static void Code(OutputStream outputStream) {
        try {
            outputStream.close();
        } catch (Throwable th) {
        }
    }

    static void Code(Object obj) {
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void Code(java.lang.Object r2, int r3) {
        /*
            monitor-enter(r2)
            long r0 = (long) r3
            r2.wait(r0)     // Catch:{ InterruptedException -> 0x000a, all -> 0x0007 }
        L_0x0005:
            monitor-exit(r2)
            return
        L_0x0007:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x000a:
            r0 = move-exception
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.Code(java.lang.Object, int):void");
    }

    static void Code(Runnable runnable) {
        new Thread(runnable).start();
    }

    /* renamed from: Code  reason: collision with other method in class */
    static void m146Code(String str, int i2) {
        Object obj;
        Object obj2 = null;
        if (aE) {
            Integer num = new Integer(i2);
            if (!f268J.containsKey(num) || str != f268J.get(num)) {
                if (f268J.containsKey(num)) {
                    obj = f268J.get(num);
                    f281Z.remove(obj);
                    f268J.remove(num);
                } else {
                    obj = null;
                }
                if (str != null) {
                    if (f281Z.containsKey(str)) {
                        obj2 = f281Z.get(str);
                        f281Z.remove(str);
                        f268J.remove(obj2);
                    }
                    f281Z.put(str, num);
                    f268J.put(num, str);
                    if (obj != null && obj2 != null) {
                        f281Z.put(obj, obj2);
                        f268J.put(obj2, obj);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0151 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Code(java.lang.String r12, java.util.Vector r13) {
        /*
        // Method dump skipped, instructions count: 349
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.Code(java.lang.String, java.util.Vector):void");
    }

    private static void Code(StringBuffer stringBuffer, char c2) {
        stringBuffer.append('%');
        if (c2 < 16) {
            stringBuffer.append('0');
        }
        stringBuffer.append(Integer.toHexString(c2));
    }

    static void Code(StringBuffer stringBuffer, char c2, char c3) {
        int i2 = 0;
        while (i2 < stringBuffer.length()) {
            if (stringBuffer.charAt(i2) == c2) {
                if (c3 == 0) {
                    stringBuffer.deleteCharAt(i2);
                    i2--;
                } else {
                    stringBuffer.setCharAt(i2, c3);
                }
            }
            i2++;
        }
    }

    static void Code(StringBuffer stringBuffer, String str) {
        stringBuffer.ensureCapacity(stringBuffer.length() + str.length());
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt == 0) {
                stringBuffer.append("%00");
                i2++;
            } else if ("%&=".indexOf(charAt) >= 0) {
                stringBuffer.append('%').append(Integer.toString(charAt, 16));
                i2++;
            } else {
                stringBuffer.append(charAt);
                i2++;
            }
        }
    }

    /* renamed from: Code  reason: collision with other method in class */
    private static void m147Code(Hashtable hashtable) {
        String[] strArr = {Code(35, 8595), "5", Code(42, 8593), Code(42, 8595), Code(42, 8592), Code(42, 8594)};
        int[] iArr = {29, 40, 41, 42, 43, 44};
        for (int i2 = 0; i2 < strArr.length; i2++) {
            hashtable.put(strArr[i2], new Integer(iArr[i2]));
        }
    }

    public static void Code(Vector vector) {
        if (vector.size() > 0) {
            byte[] bArr = new byte[16];
            for (int i2 = 0; i2 < vector.size(); i2++) {
                if (Code((Object[]) vector.elementAt(i2), 5) != 82) {
                    if (!Code(bArr, (byte[]) ((Object[]) vector.elementAt(i2))[8])) {
                        ((Object[]) vector.elementAt(i2))[8] = bArr;
                    }
                    bArr = (byte[]) ((Object[]) vector.elementAt(i2))[7];
                }
            }
        }
    }

    private static void Code(Vector vector, int i2, int i3) {
        if (vector != null) {
            Object elementAt = vector.elementAt(i2);
            Object elementAt2 = vector.elementAt(i3);
            vector.setElementAt(elementAt, i3);
            vector.setElementAt(elementAt2, i2);
            Code(vector, true);
            Code.f89Code.Code(vector);
        }
    }

    public static void Code(Vector vector, boolean z2) {
        if (vector == f287a) {
            C(false);
            return;
        }
        if (z2 && (vector == f282Z || vector == f269J)) {
            if (!Code.f120Z || ((vector == f282Z && (Code.J & 2) != 0) || (vector == f269J && (Code.J & 1) != 0))) {
                Code.f88Code++;
            }
            C(false);
        }
        m157Code(vector == f282Z ? "b1" : vector == f234C ? "u" : "sp", vector);
        if (vector == f269J) {
            Code.f106I = true;
        }
    }

    static void Code(Vector vector, Object[] objArr) {
        if (vector != null && objArr != null) {
            if (vector == f234C) {
                Code(objArr);
            }
            vector.addElement(objArr);
            Code(vector, true);
            Code.f89Code.Code(vector);
        }
    }

    static void Code(Vector vector, Object[] objArr, int i2) {
        if (vector != null) {
            if (vector == f269J) {
                if ((Code(objArr, 9) & 2) != 0) {
                    Code.Code((Integer) objArr[10], true);
                }
                objArr[9] = new Integer(1);
                objArr[10] = new Integer(0);
            }
            if (vector == f234C) {
                Code(objArr);
            }
            if (i2 + 1 > vector.size()) {
                vector.setSize(i2 + 1);
            }
            vector.setElementAt(objArr, i2);
            Code(vector, true);
            Code.f89Code.Code(vector);
        }
    }

    public static void Code(Connection connection) {
        try {
            connection.close();
        } catch (Throwable th) {
        }
    }

    static void Code(Graphics graphics, int i2, int i3, int i4, int i5) {
        if (z > 0 && i4 > 0 && i5 > 0) {
            Code(graphics, i2, i3, i4, i5, f245Code[z - 1], false);
        }
    }

    static void Code(Graphics graphics, int i2, int i3, int i4, int i5, int i6) {
        graphics.setColor(i6);
        if (bd) {
            I(graphics, i2, i3, i4, i5);
            int clipX = graphics.getClipX();
            int clipY = graphics.getClipY();
            int clipWidth = graphics.getClipWidth();
            int clipHeight = graphics.getClipHeight();
            if (clipHeight > 0 && clipWidth > 0) {
                graphics.fillRect(clipX, clipY, clipWidth, clipHeight);
                graphics.drawLine(clipX, (clipY + clipHeight) - 1, (clipWidth + clipX) - 1, (clipY + clipHeight) - 1);
            }
            Z(graphics);
            return;
        }
        graphics.fillRect(i2, i3, i4, i5);
    }

    static void Code(Graphics graphics, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i4 > 0 && i5 > 0) {
            int i8 = 65280 & (i6 >> 8);
            int i9 = 65280 & i6;
            int i10 = (i6 << 8) & 65280;
            int i11 = (((i7 >> 8) & 65280) - i8) / i5;
            int i12 = ((65280 & i7) - i9) / i5;
            int i13 = (((i7 << 8) & 65280) - i10) / i5;
            int i14 = (i2 + i4) - 1;
            int i15 = (i3 + i5) - 1;
            while (i3 < i15) {
                graphics.setColor(((65280 & i8) << 8) | (65280 & i9) | (i10 >> 8));
                graphics.drawLine(i2, i3, i14, i3);
                i8 += i11;
                i9 += i12;
                i10 += i13;
                i3++;
            }
        }
    }

    static void Code(Graphics graphics, int i2, int i3, int i4, int i5, int i6, boolean z2) {
        int i7 = i6 >>> 24;
        if (i7 != 0) {
            if (i7 >= 254) {
                Code(graphics, i2, i3, i4, i5, i6);
            } else if (f344r) {
                if (!(aV == i6 && aW == i7)) {
                    for (int i8 = 0; i8 < f309c.length; i8++) {
                        f309c[i8] = i6;
                    }
                    if (f355z) {
                        if (f311d == null || f311d.length != 64) {
                            f311d = new int[64];
                            for (int i9 = 0; i9 < f311d.length; i9++) {
                                f311d[i9] = -1;
                            }
                        }
                        Image.createRGBImage(f311d, 8, 8, false);
                    }
                    if (!f354y) {
                        f235C = Image.createRGBImage(f309c, 8, 8, true);
                    }
                    aV = i6;
                    aW = i7;
                    if (z2) {
                        f313e = new int[]{i7, i7, i7, i7, (i7 << 1) / 3, i7, i7, i7, i7, i7 / 3, i7, i7, i7, (i7 << 1) / 3, 0, i7, i7, (i7 << 1) / 3, 0, 0, (i7 << 1) / 3, i7 / 3, 0, 0, 0};
                        for (int i10 = 0; i10 < f313e.length; i10++) {
                            f313e[i10] = (16777215 & i6) | (f313e[i10] << 24);
                        }
                        if (f354y) {
                            f323h = new int[25];
                            f316f = new int[25];
                            f320g = new int[25];
                            int i11 = 0;
                            for (int i12 = 0; i12 < 5; i12++) {
                                int i13 = 0;
                                while (i13 < 5) {
                                    f323h[i11] = f313e[((4 - i12) * 5) + (4 - i13)];
                                    f320g[i11] = f313e[((4 - i12) * 5) + i13];
                                    f316f[i11] = f313e[(i12 * 5) + (4 - i13)];
                                    i13++;
                                    i11++;
                                }
                            }
                        } else {
                            f288a = Image.createRGBImage(f313e, 5, 5, true);
                        }
                    }
                }
                if (z2) {
                    i4 -= 10;
                    i2 += 5;
                }
                I(graphics, i2, i3, i4, i5);
                for (int i14 = i2; i14 < i2 + i4; i14 += 8) {
                    int i15 = i3;
                    while (i15 < i3 + i5) {
                        if (f354y) {
                            graphics.drawRGB(f309c, 0, 8, i14, i15, 8, 8, true);
                            i15 += 8;
                        } else {
                            graphics.drawImage(f235C, i14, i15, 20);
                            i15 += 8;
                        }
                    }
                }
                Z(graphics);
                if (z2) {
                    int i16 = i4 + 10;
                    int i17 = i2 - 5;
                    int i18 = i5 - 10;
                    int i19 = i3 + 5;
                    I(graphics, i17, i19, i16, i18);
                    int i20 = i19;
                    while (i20 < i19 + i18) {
                        if (f354y) {
                            graphics.drawRGB(f309c, 0, 8, i17 - 3, i20, 8, 8, true);
                            graphics.drawRGB(f309c, 0, 8, (i17 + i16) - 5, i20, 8, 8, true);
                            i20 += 8;
                        } else {
                            graphics.drawImage(f235C, i17 - 3, i20, 20);
                            graphics.drawImage(f235C, (i17 + i16) - 5, i20, 20);
                            i20 += 8;
                        }
                    }
                    Z(graphics);
                    int i21 = i18 + 10;
                    int i22 = i19 - 5;
                    I(graphics, i17, i22, i16, i21);
                    if (f354y) {
                        graphics.drawRGB(f320g, 0, 5, (i17 + i16) - 5, i22, 5, 5, true);
                        graphics.drawRGB(f313e, 0, 5, (i17 + i16) - 5, (i22 + i21) - 5, 5, 5, true);
                        graphics.drawRGB(f323h, 0, 5, i17, i22, 5, 5, true);
                        graphics.drawRGB(f316f, 0, 5, i17, (i22 + i21) - 5, 5, 5, true);
                    } else {
                        graphics.drawRegion(f288a, 0, 0, 5, 5, 3, i17, i22, 20);
                        graphics.drawRegion(f288a, 0, 0, 5, 5, 6, (i17 + i16) - 5, i22, 20);
                        graphics.drawRegion(f288a, 0, 0, 5, 5, 5, i17, (i22 + i21) - 5, 20);
                        graphics.drawRegion(f288a, 0, 0, 5, 5, 0, (i17 + i16) - 5, (i22 + i21) - 5, 20);
                    }
                    Z(graphics);
                }
            }
        }
    }

    private static void Code(Graphics graphics, int i2, int i3, int i4, int i5, boolean z2) {
        graphics.setColor(f262I[18]);
        graphics.drawLine(i2 + 2, i3 + 1, i2 + i4, i3 + 1);
        graphics.drawLine(i2 + 1, i3 + 1, i2 + 1, (i3 + i5) - 1);
        Code(graphics, i2 + 2, i3 + 2, i4 - 1, i5 - 2, f262I[19]);
        graphics.setColor(f262I[17]);
        if (z2) {
            graphics.setColor(f262I[17]);
            graphics.drawLine(i2, i3, i2, i3 + i5);
            graphics.drawLine(i2 + i4, i3, i2 + i4, i3 + i5);
            return;
        }
        graphics.drawLine(i2 + 1, i3, i2 + i4, i3);
        graphics.drawLine(i2 + 1, i3 + i5, i2 + i4, i3 + i5);
    }

    static void Code(Graphics graphics, int i2, String str, int i3, int i4, int i5) {
        int I2 = I(i2);
        graphics.setFont(f248Code[I2]);
        graphics.drawString(str, i3, f244Code[I2] + i4, i5);
    }

    static void Code(Graphics graphics, int i2, char[] cArr, int i3, int i4, int i5, int i6) {
        int I2 = I(i2);
        graphics.setFont(f248Code[I2]);
        if (be) {
            graphics.drawString(new String(cArr, i3, i4), i5, f244Code[I2] + i6, 20);
        } else {
            graphics.drawChars(cArr, i3, i4, i5, i6 + f244Code[I2], 20);
        }
    }

    /* renamed from: Code  reason: collision with other method in class */
    public static void m148Code(boolean z2) {
        synchronized (f239Code) {
            if (ae != z2) {
                ae = z2;
                m139Code();
            }
        }
    }

    private void Code(boolean z2, int i2) {
        if (!m193J(i2)) {
            return;
        }
        if (z2) {
            run();
        } else {
            Code((Runnable) this);
        }
    }

    /* renamed from: Code  reason: collision with other method in class */
    private void m149Code(byte[] bArr) {
        int i2 = this.f365Code << 3;
        Code(Byte.MIN_VALUE);
        while (this.f400U != 0) {
            Code((byte) 0);
        }
        if (this.f401V > 14) {
            w();
        }
        this.f391J[15] = i2;
        w();
        J(this.f392M, bArr, 0);
        J(this.f393N, bArr, 4);
        J(this.f394O, bArr, 8);
        J(this.f395P, bArr, 12);
        J(this.f396Q, bArr, 16);
        J(this.f397R, bArr, 20);
        J(this.f398S, bArr, 24);
        J(this.f399T, bArr, 28);
        v();
    }

    /* renamed from: Code  reason: collision with other method in class */
    private void m150Code(byte[] bArr, int i2) {
        int[] iArr = this.f391J;
        int i3 = this.f401V;
        this.f401V = i3 + 1;
        iArr[i3] = ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8) | (bArr[i2 + 3] & 255);
        if (this.f401V == 16) {
            w();
        }
    }

    /* renamed from: Code  reason: collision with other method in class */
    private void m151Code(byte[] bArr, int i2, int i3) {
        while (this.f400U != 0 && i3 > 0) {
            Code(bArr[i2]);
            i2++;
            i3--;
        }
        while (i3 > this.f385I.length) {
            m150Code(bArr, i2);
            i2 += this.f385I.length;
            i3 -= this.f385I.length;
            this.f365Code += this.f385I.length;
        }
        while (i3 > 0) {
            Code(bArr[i2]);
            i2++;
            i3--;
        }
    }

    private static void Code(byte[] bArr, int i2, int i3, int i4, int i5) {
        bArr[i2 + 4] = (byte) ((i5 + 2) >> 8);
        bArr[i2 + 4 + 1] = (byte) (i5 + 2);
        bArr[i2 + 4 + 2] = (byte) i3;
        bArr[i2 + 4 + 3] = (byte) i4;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:31:0x001c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x001c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [short[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [short] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [short] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void Code(byte[] r9, int r10, short[] r11) {
        /*
            r8 = 1
            r1 = 0
            r0 = r1
        L_0x0003:
            int r2 = r11.length
            if (r0 >= r2) goto L_0x000b
            r11[r0] = r1
            int r0 = r0 + 1
            goto L_0x0003
        L_0x000b:
            r3 = 2
            r7 = r8
            r2 = r1
        L_0x000e:
            r0 = 16
            if (r7 > r0) goto L_0x004f
            r6 = r1
        L_0x0013:
            if (r6 >= r10) goto L_0x0049
            byte r0 = r9[r6]
            if (r0 != r7) goto L_0x0050
            int r4 = r7 + -1
            r0 = r1
        L_0x001c:
            if (r4 < 0) goto L_0x003a
            int r5 = r8 << r4
            r5 = r5 & r2
            if (r5 == 0) goto L_0x0025
            int r0 = r0 + 1
        L_0x0025:
            if (r4 == 0) goto L_0x003a
            short r5 = r11[r0]
            if (r5 != 0) goto L_0x0035
            r11[r0] = r3
            int r0 = r3 + 2
            short r5 = (short) r0
            int r4 = r4 + -1
            r0 = r3
            r3 = r5
            goto L_0x001c
        L_0x0035:
            short r0 = r11[r0]
            int r4 = r4 + -1
            goto L_0x001c
        L_0x003a:
            r4 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 | r6
            short r4 = (short) r4
            r11[r0] = r4
            int r0 = r2 + 1
        L_0x0043:
            int r2 = r6 + 1
            short r4 = (short) r2
            r6 = r4
            r2 = r0
            goto L_0x0013
        L_0x0049:
            int r2 = r2 << 1
            int r0 = r7 + 1
            r7 = r0
            goto L_0x000e
        L_0x004f:
            return
        L_0x0050:
            r0 = r2
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.Code(byte[], int, short[]):void");
    }

    private static void Code(int[] iArr, int[] iArr2) {
        int i2;
        long j2;
        int i3;
        int length = iArr.length - Code(0, iArr);
        int length2 = iArr2.length - Code(0, iArr2);
        int length3 = (iArr.length - length) - (iArr2.length - length2);
        int[] iArr3 = new int[((iArr2.length - length2) + length3)];
        for (int i4 = length3 << 5; i4 >= 0; i4--) {
            int i5 = i4 >>> 5;
            int i6 = i4 & 31;
            int length4 = iArr2.length - length2;
            if (i6 == 0) {
                System.arraycopy(iArr2, length2, iArr3, (iArr3.length - length4) - i5, length4);
            } else {
                int i7 = 32 - i6;
                int i8 = iArr2[length2] >>> i7;
                if (i8 != 0) {
                    i5++;
                }
                int length5 = (iArr3.length - length4) - i5;
                if (i8 != 0) {
                    i2 = length5 + 1;
                    iArr3[length5] = i8;
                } else {
                    i2 = length5;
                }
                int i9 = length2 + 1;
                int i10 = i2;
                int i11 = iArr2[length2];
                while (i9 < length4) {
                    int i12 = iArr2[i9];
                    iArr3[i10] = (i11 << i6) | (i12 >>> i7);
                    i9++;
                    i10++;
                    i11 = i12;
                }
                iArr3[i10] = iArr2[(length4 + length2) - 1] << i6;
            }
            int length6 = (iArr3.length - length4) - i5;
            while (true) {
                int length7 = iArr.length - Code(length, iArr);
                int length8 = iArr3.length - Code(length6, iArr3);
                if (iArr.length - length7 != iArr3.length - length8) {
                    if ((iArr.length - length7) - (iArr3.length - length8) < 0) {
                        break;
                    }
                } else {
                    while (length7 < iArr.length - 1 && iArr[length7] == iArr3[length8]) {
                        length7++;
                        length8++;
                    }
                    if (((int) (((((long) iArr[length7]) & 4294967295L) - (((long) iArr3[length8]) & 4294967295L)) >> 63)) < 0) {
                        break;
                    }
                }
                int length9 = iArr.length - 1;
                int length10 = iArr3.length - 1;
                int i13 = 0;
                int i14 = length9;
                while (true) {
                    int i15 = length10 - 1;
                    j2 = ((((long) iArr[i14]) & 4294967295L) - (((long) iArr3[length10]) & 4294967295L)) + ((long) i13);
                    i3 = i14 - 1;
                    iArr[i14] = (int) j2;
                    i13 = (int) (j2 >> 63);
                    if (i15 < length6) {
                        break;
                    }
                    length10 = i15;
                    i14 = i3;
                }
                long j3 = j2;
                while (i3 >= length && j3 < 0) {
                    j3 = (((long) iArr[i3]) & 4294967295L) + ((long) i13);
                    iArr[i3] = (int) j3;
                    i3--;
                }
            }
        }
    }

    private static void Code(Object[] objArr) {
        objArr[3] = new Integer((objArr[3] != null ? Code(objArr, 3) : 0) | 8);
        objArr[9] = new Integer(1);
    }

    private void Code(Object[] objArr, String str, boolean z2, boolean z3, Hashtable hashtable, String str2) {
        this.f380I = new B(this);
        this.f380I.f24Code = z3;
        if (objArr != null) {
            this.f380I.m40Code(objArr);
        }
        if (hashtable != null) {
            this.f380I.f22Code = hashtable;
        }
        if (str2 != null) {
            this.f380I.f21Code = str2;
        }
        this.f380I.f35I = z2;
        this.f380I.Code(str, z3);
    }

    private void Code(Object[] objArr, String str, boolean z2, boolean z3, boolean z4, boolean z5, Hashtable hashtable) {
        Object[] objArr2;
        N();
        this.f419aL = false;
        B Code2 = B.Code(objArr);
        if (Code2 == null || !Code2.m41Code() || Code2.m30Code() == this) {
            objArr2 = objArr;
        } else {
            Code2 = null;
            objArr2 = B.m4Code(objArr);
        }
        if (z2 || Code2 == null) {
            Code(objArr2, str, z3, z4, hashtable, (String) null);
            return;
        }
        Code2.Code(this);
        Code2.m40Code(objArr2);
        Code(Code2, z5);
        this.f419aL = true;
        Code(Code2);
    }

    /* renamed from: Code  reason: collision with other method in class */
    public static boolean m152Code() {
        return aH;
    }

    /* renamed from: Code  reason: collision with other method in class */
    static boolean m153Code(char c2) {
        switch (c2) {
            case 8592:
            case 8593:
            case 8594:
            case 8595:
                return false;
            default:
                return true;
        }
    }

    static boolean Code(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        return i2 < i6 + i8 && i2 + i4 > i6 && i3 < i7 + i9 && i3 + i5 > i7;
    }

    /* renamed from: Code  reason: collision with other method in class */
    private boolean m154Code(long j2) {
        return this.f366Code < j2 || this.f366Code - 1814400000 > j2;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Throwable] */
    private boolean Code(g gVar) {
        e eVar = null;
        String str = null;
        eVar = null;
        if (!(this.f358B[0] == 72 && this.f358B[1] == 84 && this.f358B[2] == 84 && this.f358B[3] == 80)) {
            return false;
        }
        B(5, 7);
        if (this.f361C.m207e() && this.f358B[8] == 32 && this.f358B[9] == 51 && this.f358B[10] == 48 && (this.f358B[11] == 49 || this.f358B[11] == 50 || this.f358B[11] == 51 || this.f358B[11] == 55)) {
            this.f401V = 1;
            try {
                str = m195Z("location");
            } catch (Throwable th) {
            }
            if (str == null || str.length() == 0) {
                return false;
            }
            if (gVar != null) {
                if (gVar.Code(str)) {
                    J(gVar);
                    A();
                } else {
                    gVar.close();
                }
            }
            synchronized (f239Code) {
                for (g gVar2 = f237Code; gVar2 != null; gVar2 = gVar2.m257Code()) {
                    if (gVar2.Code() == this.f396Q && !gVar2.m270Z() && gVar2 != gVar) {
                        if (gVar2.Code(str)) {
                            A();
                        } else {
                            gVar2.close();
                        }
                    }
                }
            }
            Code(false, 0);
            return true;
        } else if (this.f358B[8] != 32 || this.f358B[9] != 52 || this.f358B[10] != 48 || this.f358B[11] != 51) {
            return false;
        } else {
            this.f401V = 2;
            StringBuffer stringBuffer = new StringBuffer();
            try {
                m195Z((String) null);
                int i2 = 0;
                while (true) {
                    i2++;
                    if (i2 > 256) {
                        break;
                    }
                    B(0, 1);
                    if (this.f358B[0] <= 32) {
                        break;
                    }
                    stringBuffer.append((char) this.f358B[0]);
                    if (i2 == 4 && !stringBuffer.toString().toLowerCase().equals("http")) {
                        stringBuffer.setLength(0);
                        break;
                    }
                }
            } catch (Throwable th2) {
            }
            f312e = stringBuffer.length() > 4 ? stringBuffer.toString() : null;
            Code(false, 4);
            if (!(gVar.m255Code() == null || gVar.m255Code().m30Code() == null)) {
                eVar = gVar.m255Code().m30Code();
            }
            Code.f89Code.Code(eVar, m180I(62));
            return true;
        }
    }

    /* renamed from: Code  reason: collision with other method in class */
    private static boolean m155Code(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    /* renamed from: Code  reason: collision with other method in class */
    static boolean m156Code(String str, String str2) {
        String appProperty = Browser.browser.getAppProperty(str);
        return (appProperty == null || appProperty.toLowerCase().indexOf(str2.toLowerCase()) == -1) ? false : true;
    }

    private static boolean Code(String str, String str2, int i2) {
        if (i2 < 0 || i2 > str.length() - str2.length()) {
            return false;
        }
        for (int length = str2.length() - 1; length >= 0; length--) {
            if (Character.toLowerCase(str.charAt(length + i2)) != Character.toLowerCase(str2.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Code  reason: collision with other method in class */
    static boolean m157Code(String str, Vector vector) {
        boolean z2;
        if (vector == null) {
            return false;
        }
        Vector vector2 = new Vector(vector.size());
        int i2 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            if (!z3) {
                if (i2 > 0) {
                    break;
                }
            } else if (i2 >= 2) {
                break;
            }
            Vector vector3 = vector;
            int i3 = 0;
            int i4 = 0;
            while (i3 < vector3.size()) {
                try {
                    J j2 = new J();
                    DataOutputStream dataOutputStream = new DataOutputStream(j2);
                    Object[] objArr = (Object[]) vector.elementAt(i4);
                    dataOutputStream.write(i4);
                    dataOutputStream.writeUTF((String) objArr[0]);
                    dataOutputStream.writeUTF(((String) objArr[1]) != null ? (String) objArr[1] : (String) objArr[0]);
                    byte[] bArr = (byte[]) objArr[2];
                    if (bArr == null || (f333l && "h1".equals(str) && i4 < vector.size() - 3)) {
                        dataOutputStream.writeShort(0);
                    } else {
                        dataOutputStream.writeShort(bArr.length);
                        dataOutputStream.write(bArr);
                    }
                    if (objArr[3] == null) {
                        dataOutputStream.writeUTF("");
                    } else if (objArr[3] instanceof String) {
                        dataOutputStream.writeUTF((String) objArr[3]);
                    } else if (str.equals("b1") || str.equals("sp")) {
                        dataOutputStream.write(Code(objArr, 3) | 8);
                        dataOutputStream.write(3);
                        dataOutputStream.write(Code(objArr, 5));
                        dataOutputStream.write(Code(objArr, 6));
                        dataOutputStream.write((byte[]) objArr[7]);
                        dataOutputStream.write((byte[]) objArr[8]);
                        dataOutputStream.writeByte((byte) Code(objArr, 9));
                        dataOutputStream.writeInt(Code(objArr, 10));
                    } else if (str.equals("u")) {
                        dataOutputStream.write(Code(objArr, 3));
                        if ((Code(objArr, 3) & 8) != 0) {
                            dataOutputStream.write(1);
                            dataOutputStream.writeByte((byte) Code(objArr, 9));
                        }
                    } else {
                        dataOutputStream.write(Code(objArr, 3));
                    }
                    vector2.addElement(j2.toByteArray());
                    int i5 = i4 + 1;
                    vector3 = vector;
                    i3 = i5;
                    i4 = i5;
                } catch (IOException e2) {
                    i2++;
                    z3 = true;
                }
            }
            z4 = Code(str, (byte[]) null, vector2, false);
            if (!z4) {
                Code.f89Code.B(1);
                z2 = true;
            } else {
                z2 = z3;
            }
            i2++;
            z3 = z2;
        }
        return z4;
    }

    private static synchronized boolean Code(String str, byte[] bArr, Vector vector, boolean z2) {
        RecordStore recordStore;
        boolean z3;
        RecordStore recordStore2;
        synchronized (e.class) {
            try {
                if (!"s".equals(str) || (f296aY && !z2)) {
                    try {
                        RecordStore.deleteRecordStore(str);
                    } catch (RecordStoreException e2) {
                    }
                    recordStore2 = RecordStore.openRecordStore(str, true);
                    if (bArr != null) {
                        Code(recordStore2, bArr);
                        z3 = true;
                        recordStore2.closeRecordStore();
                    } else if (vector != null) {
                        for (int i2 = 0; i2 < vector.size(); i2++) {
                            Code(recordStore2, (byte[]) vector.elementAt(i2));
                        }
                    }
                } else {
                    recordStore2 = RecordStore.openRecordStore(str, true);
                    try {
                        int Code2 = Code(recordStore2, bArr);
                        RecordEnumeration enumerateRecords = recordStore2.enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
                        int numRecords = enumerateRecords.numRecords();
                        for (int i3 = 0; i3 < numRecords; i3++) {
                            int nextRecordId = enumerateRecords.nextRecordId();
                            if (nextRecordId != Code2) {
                                recordStore2.deleteRecord(nextRecordId);
                            }
                        }
                    } catch (Throwable th) {
                        recordStore = recordStore2;
                        z3 = false;
                        recordStore2 = recordStore;
                        recordStore2.closeRecordStore();
                        return z3;
                    }
                }
                z3 = true;
            } catch (Throwable th2) {
                recordStore = null;
                z3 = false;
                recordStore2 = recordStore;
                recordStore2.closeRecordStore();
                return z3;
            }
            try {
                recordStore2.closeRecordStore();
            } catch (Throwable th3) {
                z3 = false;
            }
        }
        return z3;
    }

    /* renamed from: Code  reason: collision with other method in class */
    public static boolean m158Code(Vector vector) {
        int Code2 = Code(vector, new byte[16], true);
        for (int i2 = 0; i2 < vector.size(); i2++) {
            if (Code2 == -1) {
                return false;
            }
            Object elementAt = vector.elementAt(Code2);
            if (i2 != Code2) {
                vector.setElementAt(vector.elementAt(i2), Code2);
                vector.setElementAt(elementAt, i2);
            }
            Code2 = Code(vector, (byte[]) ((Object[]) elementAt)[7], true);
        }
        return true;
    }

    private static boolean Code(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return false;
        }
        for (int i2 = 0; i2 < 16; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static boolean Code(char[] cArr) {
        String str = new String(cArr);
        char c2 = cArr[0];
        Font defaultFont = Font.getDefaultFont();
        Image createImage = Image.createImage(Math.max(defaultFont.charWidth(c2), 1), defaultFont.getHeight());
        Graphics graphics = createImage.getGraphics();
        int[] iArr = new int[(createImage.getWidth() * createImage.getHeight())];
        int[] iArr2 = new int[(createImage.getWidth() * createImage.getHeight())];
        graphics.setColor(16777215);
        graphics.fillRect(0, 0, createImage.getWidth(), createImage.getHeight());
        graphics.setColor(0);
        graphics.drawChar(c2, 0, 0, 20);
        createImage.getRGB(iArr, 0, createImage.getWidth(), 0, 0, createImage.getWidth(), createImage.getHeight());
        graphics.setColor(16777215);
        graphics.fillRect(0, 0, createImage.getWidth(), createImage.getHeight());
        graphics.setColor(0);
        graphics.drawString(str, 0, 0, 20);
        createImage.getRGB(iArr2, 0, createImage.getWidth(), 0, 0, createImage.getWidth(), createImage.getHeight());
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            if (iArr2[i2] != iArr[i2]) {
                return true;
            }
        }
        return false;
    }

    static boolean Code(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Code  reason: collision with other method in class */
    static boolean m159Code(Object[] objArr) {
        return (objArr[0].equals("www.") || objArr[0].equals("")) && objArr[1].equals("");
    }

    /* renamed from: Code  reason: collision with other method in class */
    static boolean m160Code(Object[] objArr, int i2) {
        return (Code(objArr, 3) & i2) != 0;
    }

    private static boolean Code(Object[] objArr, Vector vector) {
        String str = (String) objArr[0];
        for (int i2 = 0; i2 < vector.size(); i2++) {
            if (((String) ((Object[]) vector.elementAt(i2))[0]).equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Code  reason: collision with other method in class */
    private static byte[] m161Code() {
        if (f290a == null) {
            f290a = new byte[16];
            for (int i2 = 0; i2 < 16; i2++) {
                f290a[i2] = -1;
            }
        }
        return f290a;
    }

    /* renamed from: Code  reason: collision with other method in class */
    static byte[] m162Code(int i2) {
        Throwable th;
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(m121Code((i2 & 64) == 0 ? "/t" : "/v"));
            try {
                int Code2 = Code(i2, dataInputStream3);
                byte[] bArr = new byte[Code2];
                dataInputStream3.readFully(bArr, 0, Code2);
                try {
                    dataInputStream3.close();
                    return bArr;
                } catch (Throwable th2) {
                    return bArr;
                }
            } catch (Exception e2) {
                dataInputStream = dataInputStream3;
                try {
                    dataInputStream.close();
                    return null;
                } catch (Throwable th3) {
                    return null;
                }
            } catch (Throwable th4) {
                th = th4;
                dataInputStream2 = dataInputStream3;
                try {
                    dataInputStream2.close();
                } catch (Throwable th5) {
                }
                throw th;
            }
        } catch (Exception e3) {
            dataInputStream = null;
            dataInputStream.close();
            return null;
        } catch (Throwable th6) {
            th = th6;
            dataInputStream2.close();
            throw th;
        }
    }

    /* renamed from: Code  reason: collision with other method in class */
    static byte[] m163Code(int i2, String str) {
        RecordStore recordStore;
        byte[] bArr = null;
        try {
            recordStore = RecordStore.openRecordStore(str, true);
            try {
                bArr = recordStore.getRecord(i2);
                try {
                    recordStore.closeRecordStore();
                } catch (Throwable th) {
                }
            } catch (Throwable th2) {
                try {
                    recordStore.closeRecordStore();
                } catch (Throwable th3) {
                }
                return bArr;
            }
        } catch (Throwable th4) {
            recordStore = null;
            recordStore.closeRecordStore();
            return bArr;
        }
        return bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r4v104, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x064e A[LOOP:7: B:215:0x0649->B:217:0x064e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x018e  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] Code(defpackage.g r25, int r26) {
        /*
        // Method dump skipped, instructions count: 1705
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.Code(g, int):byte[]");
    }

    /* renamed from: Code  reason: collision with other method in class */
    private static byte[] m164Code(String str) {
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = (byte) Integer.parseInt(str.substring(i2 << 1, (i2 << 1) + 2), 16);
        }
        return bArr;
    }

    /* renamed from: Code  reason: collision with other method in class */
    private static byte[] m165Code(byte[] bArr) {
        if (bArr.length >= aL) {
            return bArr;
        }
        byte[] bArr2 = new byte[aL];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static byte[] Code(int[] iArr) {
        byte[] bArr = new byte[(iArr.length << 2)];
        int length = bArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return bArr;
            }
            bArr[length] = (byte) (iArr[length / 4] >> ((3 - (length % 4)) * 8));
        }
    }

    private byte[] Code(short[] sArr, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int Code2 = Code(sArr);
            if (Code2 >= 16) {
                int d2 = d(Code2 == 18 ? 7 : Code2 - 14) + 3;
                if (Code2 == 18) {
                    d2 += 8;
                }
                byte b2 = Code2 > 16 ? 0 : bArr[i3 - 1];
                while (true) {
                    int i4 = d2 - 1;
                    if (d2 <= 0) {
                        break;
                    }
                    bArr[i3] = b2;
                    d2 = i4;
                    i3++;
                }
            } else {
                bArr[i3] = (byte) Code2;
                i3++;
            }
        }
        return bArr;
    }

    /* renamed from: Code  reason: collision with other method in class */
    static char[] m166Code(int i2) {
        if (f268J == null) {
            return null;
        }
        String str = (String) f268J.get(new Integer(i2));
        if (str == null) {
            return null;
        }
        return str.toCharArray();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d3, code lost:
        r0[0] = r4;
        r0[1] = r5;
     */
    /* renamed from: Code  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static char[] m167Code(java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.m167Code(java.lang.String):char[]");
    }

    /* renamed from: Code  reason: collision with other method in class */
    private int[] m168Code(int i2) {
        return m169Code(this.f415aG, i2);
    }

    /* renamed from: Code  reason: collision with other method in class */
    private int[] m169Code(int i2, int i3) {
        Vector Code2 = this.f367Code.m33Code();
        int i4 = i2 - i3;
        if (i4 >= 0 && Code2 != null && Code2.size() > 0 && i4 < Code2.size()) {
            Enumeration elements = Code2.elements();
            while (elements.hasMoreElements()) {
                int[] iArr = (int[]) elements.nextElement();
                if (i4 == iArr[4]) {
                    int[] iArr2 = new int[2];
                    int i5 = iArr[0] < 0 ? 0 : iArr[0];
                    int i6 = iArr[1] < 0 ? 0 : iArr[1];
                    int i7 = iArr[0] < 0 ? iArr[2] + iArr[0] : iArr[2];
                    int i8 = iArr[1] < 0 ? iArr[3] + iArr[1] : iArr[3];
                    iArr2[0] = iArr[0] < 0 ? 0 : (Math.min(Code.j, i7) / 2) + i5;
                    iArr2[1] = iArr[1] < 0 ? 0 : (Math.min(Code.i, i8) / 2) + i6;
                    if (iArr2[0] >= this.f401V) {
                        iArr2[0] = i5 + 1;
                    }
                    if (iArr2[1] >= m235I()) {
                        iArr2[1] = i6 + 1;
                    }
                    return iArr2;
                }
            }
        }
        return null;
    }

    /* renamed from: Code  reason: collision with other method in class */
    private static int[] m170Code(DataInputStream dataInputStream) {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        if (readUnsignedShort == 0) {
            return null;
        }
        byte[] bArr = new byte[(readUnsignedShort << 2)];
        dataInputStream.readFully(bArr);
        return m171Code(bArr, 0, bArr.length);
    }

    static int[] Code(Image image) {
        int height = image.getHeight();
        int width = image.getWidth();
        int[] iArr = new int[(height * width)];
        image.getRGB(iArr, 0, width, 0, 0, width, height);
        return iArr;
    }

    /* renamed from: Code  reason: collision with other method in class */
    private static int[] m171Code(byte[] bArr, int i2, int i3) {
        int[] iArr = new int[(i3 / 4)];
        int length = iArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return iArr;
            }
            iArr[length] = (bArr[(length << 2) + i2] << 24) | ((bArr[((length << 2) + i2) + 1] & 255) << 16) | ((bArr[((length << 2) + i2) + 2] & 255) << 8) | (bArr[(length << 2) + i2 + 3] & 255);
        }
    }

    /* renamed from: Code  reason: collision with other method in class */
    static int[] m172Code(int[] iArr, int i2) {
        int i3 = i2 & 16777215;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if ((iArr[i4] & 16777215) == 16777215) {
                iArr[i4] = (iArr[i4] & -16777216) | i3;
            }
        }
        return iArr;
    }

    static int[] Code(int[] iArr, int i2, int i3, int i4, int i5, boolean z2) {
        int max = Math.max(1, (i2 * i4) / i3);
        int i6 = (i3 << 8) / i4;
        int[] iArr2 = new int[(max * i4)];
        for (int i7 = 0; i7 < i4; i7++) {
            int min = Math.min((i7 * i6) / 256, i3);
            int i8 = (i7 * i6) - (min << 8);
            for (int i9 = 0; i9 < max; i9++) {
                int min2 = Math.min((i9 * i6) / 256, i2);
                int i10 = (max * i7) + i9;
                if (i5 == 1) {
                    int i11 = (i9 * i6) - (min2 << 8);
                    int min3 = Math.min(min2 + 1, i2 - 1);
                    int min4 = Math.min(min + 1, i3 - 1);
                    int i12 = iArr[(i2 * min) + min2];
                    int i13 = iArr[(i2 * min) + min3];
                    int i14 = iArr[min2 + (i2 * min4)];
                    int i15 = iArr[(i2 * min4) + min3];
                    iArr2[i10] = 0;
                    for (int i16 = z2 ? 24 : 16; i16 >= 0; i16 -= 8) {
                        iArr2[i10] = iArr2[i10] + (((((((((i12 >> i16) & 255) * (255 - i11)) * (255 - i8)) + ((((i13 >> i16) & 255) * i11) * (255 - i8))) + ((((i14 >> i16) & 255) * (255 - i11)) * i8)) + ((((i15 >> i16) & 255) * i11) * i8)) / 65025) << i16);
                    }
                } else {
                    iArr2[i10] = iArr[min2 + (i2 * min)];
                }
                if (!z2) {
                    iArr2[i10] = iArr2[i10] | -16777216;
                }
            }
        }
        return iArr2;
    }

    /* renamed from: Code  reason: collision with other method in class */
    private static int[] m173Code(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[iArr2.length];
        int[] iArr4 = new int[(iArr2.length << 1)];
        Code(iArr4, iArr, iArr);
        Code(iArr4, iArr2);
        System.arraycopy(iArr4, iArr4.length - iArr3.length, iArr3, 0, iArr3.length);
        for (int i2 = 0; i2 < iArr4.length; i2++) {
            iArr4[i2] = 0;
        }
        Code(iArr4, iArr3, iArr);
        Code(iArr4, iArr2);
        System.arraycopy(iArr4, iArr4.length - iArr3.length, iArr3, 0, iArr3.length);
        return iArr3;
    }

    private static int[] Code(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int length = iArr3.length - 1; length >= 0; length--) {
            long j2 = ((long) iArr3[length]) & 4294967295L;
            long j3 = 0;
            for (int length2 = iArr2.length - 1; length2 >= 0; length2--) {
                long j4 = j3 + ((((long) iArr2[length2]) & 4294967295L) * j2) + (((long) iArr[length + length2 + 1]) & 4294967295L);
                iArr[length + length2 + 1] = (int) j4;
                j3 = j4 >>> 32;
            }
            iArr[length] = (int) j3;
        }
        return iArr;
    }

    /* renamed from: Code  reason: collision with other method in class */
    static Object[] m174Code() {
        Object[] objArr = new Object[11];
        objArr[0] = "www.";
        objArr[1] = "";
        objArr[3] = new Integer(0);
        objArr[4] = new Integer(3);
        objArr[5] = new Integer(97);
        objArr[6] = new Integer(0);
        objArr[7] = m189I();
        objArr[8] = m161Code();
        objArr[9] = new Integer(0);
        objArr[10] = new Integer(0);
        return objArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* renamed from: Code  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object[] m175Code(java.lang.String r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.m175Code(java.lang.String, boolean):java.lang.Object[]");
    }

    static Object[] Code(Vector vector, int i2) {
        if (vector != null) {
            return (Object[]) vector.elementAt(i2);
        }
        return null;
    }

    /* renamed from: Code  reason: collision with other method in class */
    static Object[] m176Code(Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        return objArr2;
    }

    /* renamed from: Code  reason: collision with other method in class */
    static String[] m177Code(String str) {
        Object[] Code2 = m175Code(str, false);
        return new String[]{new StringBuffer().append((String) Code2[1]).append(':').append(Code2[2]).toString(), new StringBuffer().append("http://10.0.0.172:80").append((String) Code2[3]).append((String) Code2[4]).toString()};
    }

    /* renamed from: Code  reason: collision with other method in class */
    private static char[][] m178Code(String str) {
        char[][] cArr;
        int i2 = 2;
        switch (str.charAt(0)) {
            case 1:
                cArr = m178Code("\u0000\f\u00020+0\u00171./:_-~%$?=&!+#*@,;\\'()1\u00042abc2\u00043def3\u00044ghi4\u00045jkl5\u00046mno6\u00057pqrs7\u00048tuv8\u00059wxyz9\u0000*\u0003# *#");
                break;
            case 2:
                cArr = (char[][]) Array.newInstance(Character.TYPE, 1, 1);
                cArr[0][0] = 1;
                break;
            case 3:
                cArr = new char[25][];
                cArr[0] = new char[1];
                cArr[0][0] = 1;
                String stringBuffer = new StringBuffer().append("QWERTYUIOPASDFGHJKZXCVBN").append("QWERTYUIOPASDFGHJKZXCVBN".toLowerCase()).toString();
                for (int i3 = 1; i3 <= 24; i3++) {
                    cArr[i3] = new char[3];
                    char[] cArr2 = cArr[i3];
                    char[] cArr3 = cArr[i3];
                    char charAt = stringBuffer.charAt((i3 - 1) * 2);
                    cArr3[1] = charAt;
                    cArr2[0] = charAt;
                    cArr[i3][2] = stringBuffer.charAt(((i3 - 1) * 2) + 1);
                }
                break;
            default:
                cArr = (char[][]) Array.newInstance(Character.TYPE, 1, 1);
                break;
        }
        char charAt2 = str.charAt(1);
        char[][] cArr4 = new char[(cArr.length + charAt2)][];
        System.arraycopy(cArr, 0, cArr4, 0, cArr.length);
        for (int i4 = 0; i4 < charAt2; i4++) {
            int i5 = i2 + 1;
            int charAt3 = str.charAt(i2) + 1;
            cArr4[cArr.length + i4] = new char[charAt3];
            str.getChars(i5, i5 + charAt3, cArr4[cArr.length + i4], 0);
            i2 = charAt3 + i5;
        }
        return cArr4;
    }

    private synchronized void D() {
        E();
        this.f393N = 0;
    }

    private synchronized void E() {
        if (this.f357B) {
            throw new IOException();
        }
        this.f366Code = System.currentTimeMillis();
    }

    private static void F() {
        m202b(0);
        Code((byte) -2, (String) null);
        I((byte) -2, (String) null);
        I = -1;
        C(false);
    }

    private void G() {
        if (aH) {
            try {
                String[] Code2 = m177Code(this.f372Code);
                this.f475r = Code2[0];
                this.f372Code = Code2[1];
            } catch (Throwable th) {
                return;
            }
        }
        HttpConnection open = Connector.open(this.f372Code, 3, false);
        if (f289a) {
            open.setRequestProperty("Test-Header", "debug");
        }
        if (this.f475r != null) {
            open.setRequestProperty("X-Online-Host", this.f475r);
        }
        open.openDataInputStream().close();
        int responseCode = open.getResponseCode();
        if ((responseCode >= 301 && responseCode <= 303) || responseCode == 307) {
            this.f372Code = open.getHeaderField("Location");
            run();
        }
        open.close();
    }

    private void H() {
        E();
        this.f457c.x();
        int i2 = ((this.f358B[1] & 255) << 2) + 128;
        int i3 = this.f358B[2] & 255;
        B(5, i3 + 166 + i2);
        D();
        this.f457c.f406Z = new byte[(i3 + 1)];
        f236C = this.f457c.f406Z;
        System.arraycopy(this.f358B, 2, this.f457c.f406Z, 0, i3 + 1);
        int[] Code2 = m171Code(this.f358B, i3 + 3, 160);
        int[] Code3 = m171Code(this.f358B, i3 + 163, i2);
        e eVar = this.f457c;
        byte[] bArr = this.f358B;
        int i4 = i2 + i3 + 163;
        eVar.f366Code = (((long) Z(bArr, i4 + 4)) & 4294967295L) | (((long) Z(bArr, i4)) << 32);
        this.f457c.f359B = Code2;
        this.f457c.f363C = Code3;
        if (!aG) {
            f310d = System.currentTimeMillis() - (this.f457c.f366Code - 1209600000);
            aG = true;
        }
    }

    static int I(int i2) {
        return (Code((m << 1) + i2, 0, ((f304bb ? 1 : 0) * -2) + 6) & -2) + (i2 & 1);
    }

    private static int I(int i2, int i3, int i4) {
        return ((((i2 >>> 6) | (i2 << 26)) ^ ((i2 >>> 11) | (i2 << 21))) ^ ((i2 >>> 25) | (i2 << 7))) + ((i2 & i3) ^ ((i2 ^ -1) & i4));
    }

    static int I(int i2, char[] cArr, int i3, int i4) {
        if (Code(i2, cArr, 0, i3) <= i4) {
            return i3;
        }
        int i5 = 0;
        int i6 = 0;
        while (i3 - i6 > 1) {
            int i7 = (i3 + i6) / 2;
            if (Code(i2, cArr, 0, i7) >= i4) {
                i5 = i7;
                i3 = i7;
            } else {
                i5 = i7;
                i6 = i7;
            }
        }
        if (Code(i2, cArr, 0, i5) <= i4) {
            i6 = i5;
        }
        return i6;
    }

    static int I(String str) {
        if (str == null || !str.startsWith("o:")) {
            return -1;
        }
        return str.charAt(2);
    }

    private static int I(String str, String str2) {
        if (str == null || str.indexOf(47) == -1 || str2.indexOf(47) == -1) {
            return 0;
        }
        return str.substring(str.indexOf(47)).compareTo(str2.substring(str2.indexOf(47)));
    }

    private int I(boolean z2) {
        int i2 = 5;
        if (z2) {
            int size = (this.f450av * this.f449au) / this.f458c.size();
            if (f339o) {
                i2 = Math.max(this.f450av >> 3, 5);
            }
            return Math.max(size, i2);
        }
        int I2 = (m235I() * m235I()) / Math.max(this.f367Code.b(), m235I());
        if (f339o) {
            i2 = Math.max(m235I() >> 3, 5);
        }
        return Math.max(I2, i2);
    }

    public static int I(byte[] bArr, int i2) {
        return ((bArr[i2] & 255) << 8) + (bArr[i2 + 1] & 255);
    }

    /* renamed from: I  reason: collision with other method in class */
    private static e m179I(int i2) {
        return new e(i2, f324i.f397R, Code(f324i.f475r, 1), f324i.f398S, f324i.f393N, f324i.f372Code, f324i.f475r);
    }

    static String I() {
        if (!f289a) {
            return null;
        }
        return new StringBuffer().append(f293aM ? "*" : "").append(Y).toString();
    }

    /* renamed from: I  reason: collision with other method in class */
    static String m180I(int i2) {
        return new StringBuffer().append("o:").append((char) i2).toString();
    }

    /* renamed from: I  reason: collision with other method in class */
    static String m181I(String str) {
        return str.substring(str.indexOf(58) + 1);
    }

    /* renamed from: I  reason: collision with other method in class */
    private static String m182I(String str, String str2) {
        char charAt;
        if (str == null) {
            str = null;
        } else {
            int length = str.length();
            int indexOf = str.indexOf(":/");
            int indexOf2 = str.indexOf(58);
            if ((indexOf < 0 || indexOf > 10) && (indexOf2 == -1 || indexOf != -1 || (indexOf2 + 1 != length && (charAt = str.charAt(indexOf2 + 1)) >= '0' && charAt <= '9'))) {
                str = new StringBuffer().append("http://").append(str).toString();
            }
        }
        if (str == null) {
            return "";
        }
        int indexOf3 = str.indexOf("https://");
        int indexOf4 = str.indexOf(47, indexOf3 + 8);
        StringBuffer stringBuffer = new StringBuffer(str);
        if (str2 != null && str2.length() > 0 && indexOf3 == -1) {
            int indexOf5 = str2.indexOf("={\"c\":");
            if (indexOf5 != -1) {
                str2 = str2.substring(0, indexOf5);
            }
            stringBuffer.append('?').append(m190J(str2));
        }
        if (!(indexOf3 == -1 || indexOf4 == -1)) {
            stringBuffer.delete(indexOf4, stringBuffer.length());
        }
        boolean z2 = false;
        boolean z3 = false;
        for (int length2 = stringBuffer.length() - 1; length2 >= 0; length2--) {
            char charAt2 = stringBuffer.charAt(length2);
            if (charAt2 < '!' || charAt2 > '~' || "\"#;<>[]^`{|}~\\".indexOf(charAt2) >= 0) {
                stringBuffer.deleteCharAt(length2);
            } else {
                if (charAt2 == '=') {
                    z3 = true;
                } else if (charAt2 == '&') {
                    z2 = false;
                    z3 = false;
                } else if (charAt2 == '.') {
                    z2 = true;
                }
                if (length2 > str.length() && z3 && z2) {
                    stringBuffer.deleteCharAt(length2);
                }
            }
        }
        stringBuffer.setLength(127);
        if (stringBuffer.charAt(126) == '%') {
            stringBuffer.setLength(126);
        } else if (stringBuffer.charAt(125) == '%') {
            stringBuffer.setLength(125);
        }
        return stringBuffer.toString().trim();
    }

    /* renamed from: I  reason: collision with other method in class */
    static String m183I(byte[] bArr, int i2) {
        int min = Math.min(i2, 128);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < min; i3++) {
            if ((bArr[i3] & 255) < 16) {
                stringBuffer.append('0');
            }
            stringBuffer.append(Integer.toString(bArr[i3] & 255, 16));
        }
        return stringBuffer.toString();
    }

    /* renamed from: I  reason: collision with other method in class */
    static Image m184I(int i2) {
        try {
            byte[] Code2 = m162Code(i2);
            if (Code2.length == 0) {
                return null;
            }
            return Code2[0] == 67 ? Code(Code2, 0, Code2.length, 256, (Object[]) null) : Image.createImage(Code2, 0, Code2.length);
        } catch (Exception e2) {
            return null;
        }
    }

    private static void I(byte b2, String str) {
        J = b2;
        f347t = str;
    }

    private static void I(int i2, String str) {
        if (str.length() != 0 && i2 < 6) {
            Font font = f248Code[i2];
            int stringWidth = font.stringWidth(str);
            int charWidth = font.charWidth(str.charAt(0));
            int height = font.getHeight() + 10;
            Image createImage = Image.createImage(stringWidth, height);
            Graphics graphics = createImage.getGraphics();
            int[] iArr = new int[stringWidth];
            Code(graphics, 0, 0, stringWidth, height, 16777215);
            createImage.getRGB(iArr, 0, 1, 0, 0, 1, 1);
            int i3 = iArr[0];
            graphics.setColor(0);
            graphics.setFont(font);
            graphics.drawString(str, 0, 10, 0);
            int i4 = 0;
            int i5 = 0;
            boolean z2 = false;
            boolean z3 = false;
            int i6 = height - 1;
            while (i6 >= 0) {
                createImage.getRGB(iArr, 0, stringWidth, 0, i6, stringWidth, 1);
                int i7 = 0;
                int i8 = i4;
                while (i7 < stringWidth) {
                    if (iArr[i7] != i3) {
                        if (!z2) {
                            z2 = true;
                            i5 = (i6 + 1) - height;
                        }
                        z3 = i7 >= charWidth;
                        i8 = -i6;
                    }
                    i7++;
                }
                i6--;
                i4 = i8;
            }
            f244Code[i2] = (byte) Math.max((int) f244Code[i2], (z3 ? i4 + 1 : i4) + 10);
            f301b[i2] = (byte) Math.max((int) f301b[i2], i5);
        }
    }

    public static void I(int i2, byte[] bArr, int i3) {
        bArr[i3] = i2 >> 24;
        bArr[i3 + 1] = (byte) (i2 >> 16);
        bArr[i3 + 2] = (byte) (i2 >> 8);
        bArr[i3 + 3] = (byte) i2;
    }

    private static void I(g gVar) {
        synchronized (f239Code) {
            gVar.m259Code(f237Code);
            f237Code = gVar;
        }
    }

    private static synchronized void I(DataInputStream dataInputStream) {
        String str = null;
        synchronized (e.class) {
            f243Code = dataInputStream.readBoolean();
            Z = dataInputStream.readByte();
            J = dataInputStream.readByte();
            String readUTF = dataInputStream.readUTF();
            if (readUTF.length() == 0) {
                readUTF = null;
            }
            f347t = readUTF;
            String readUTF2 = dataInputStream.readUTF();
            if (readUTF2.length() != 0) {
                str = readUTF2;
            }
            f345s = str;
            f256I = dataInputStream.readByte();
            byte readByte = dataInputStream.readByte();
            for (int i2 = 0; i2 < readByte; i2++) {
                String readUTF3 = dataInputStream.readUTF();
                e eVar = new e(m170Code(dataInputStream));
                eVar.f366Code = dataInputStream.readLong();
                dataInputStream.readFully(eVar.f390J);
                int readUnsignedByte = dataInputStream.readUnsignedByte();
                if (readUnsignedByte != 0) {
                    byte[] bArr = new byte[readUnsignedByte];
                    eVar.f406Z = bArr;
                    dataInputStream.readFully(bArr);
                    f236C = eVar.f406Z;
                }
                eVar.f359B = m170Code(dataInputStream);
                eVar.f363C = m170Code(dataInputStream);
                if (!eVar.m205d()) {
                    f240Code.put(readUTF3, new Object[]{eVar, ""});
                }
            }
        }
    }

    private static synchronized void I(DataOutputStream dataOutputStream) {
        synchronized (e.class) {
            dataOutputStream.writeInt("mini4cn.opera-mini.net".hashCode());
            dataOutputStream.writeInt(a);
            dataOutputStream.writeByte(f263I.length);
            for (int i2 = 0; i2 < f263I.length; i2++) {
                e eVar = f263I[i2];
                dataOutputStream.writeByte(eVar.f401V);
                dataOutputStream.writeByte(eVar.f397R);
                dataOutputStream.writeUTF(eVar.f475r);
                dataOutputStream.writeShort(eVar.f398S);
                dataOutputStream.writeShort(eVar.f393N);
                dataOutputStream.writeUTF(eVar.f372Code);
            }
            dataOutputStream.writeByte(f246Code.length);
            for (int i3 = 0; i3 < f246Code.length; i3++) {
                e eVar2 = f246Code[i3];
                dataOutputStream.writeUTF(eVar2.f475r);
                dataOutputStream.writeUTF(eVar2.f372Code);
                dataOutputStream.writeShort(eVar2.f396Q);
                dataOutputStream.writeUTF(eVar2.f460d);
                dataOutputStream.writeByte(eVar2.f393N);
            }
        }
    }

    /* renamed from: I  reason: collision with other method in class */
    static void m185I(String str) {
        try {
            RecordStore.deleteRecordStore(str);
        } catch (RecordStoreException e2) {
        }
    }

    private static void I(Vector vector, int i2) {
        if (vector != null) {
            Object[] Code2 = Code(vector, i2);
            boolean z2 = vector == f269J;
            if (z2 && (Code(Code2, 9) & 2) != 0) {
                Code.Code((Integer) Code2[10], true);
            }
            Code2[1] = "";
            Code2[0] = z2 ? "www." : "";
            Code2[2] = null;
            if (z2) {
                Code2[10] = new Integer(0);
                Code2[9] = new Integer(0);
            }
            if (Code(Code2, 5) == 97) {
                if (!z2) {
                    vector.removeElementAt(i2);
                } else {
                    Code2[5] = new Integer(83);
                }
            } else if (vector == f287a) {
                vector.removeElementAt(i2);
            } else {
                Code2[5] = new Integer(82);
            }
            Code(vector, true);
            Code.f89Code.Code(vector);
        }
    }

    static void I(Graphics graphics, int i2, int i3, int i4, int i5) {
        if (br) {
            f242Code.push(new int[]{aR, aS, aT, aU});
        }
        br = true;
        aR = graphics.getClipX();
        aS = graphics.getClipY();
        aT = graphics.getClipWidth();
        aU = graphics.getClipHeight();
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        if (Code(i2, i3, i4, i5, clipX, clipY, clipWidth, clipHeight)) {
            int max = Math.max(i2, clipX);
            int max2 = Math.max(i3, clipY);
            if (i2 >= clipX) {
                clipWidth = clipX + clipWidth > i2 + i4 ? i4 : (clipX + clipWidth) - i2;
            } else if (i2 + i4 <= clipX + clipWidth) {
                clipWidth = (i2 + i4) - clipX;
            }
            if (i3 >= clipY) {
                clipHeight = clipY + clipHeight > i3 + i5 ? i5 : (clipY + clipHeight) - i3;
            } else if (i3 + i5 <= clipY + clipHeight) {
                clipHeight = (i3 + i5) - clipY;
            }
            graphics.setClip(max, max2, clipWidth, clipHeight);
            return;
        }
        graphics.setClip(0, 0, 0, 0);
    }

    private static void I(Graphics graphics, int i2, int i3, int i4, int i5, int i6) {
        I(graphics, i2, i3, i4, i5);
        Code(graphics, i2, i3 + 5, i4, i5 - 10, i6);
        int i7 = 20;
        for (int i8 = 0; i8 < 5; i8++) {
            i7 = (i7 / 2) + 1;
            graphics.drawLine((i7 >> 1) + i2, i3 + i8, ((i2 + i4) - (i7 >> 1)) - 1, i3 + i8);
            graphics.drawLine((i7 >> 1) + i2, ((i3 + i5) - i8) - 1, ((i2 + i4) - (i7 >> 1)) - 1, ((i3 + i5) - i8) - 1);
        }
        Z(graphics);
    }

    private static void I(Graphics graphics, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i4 > 0 && i5 > 0) {
            int i8 = (i6 >>> 16) & 65280;
            int i9 = (i6 >> 8) & 65280;
            int i10 = i6 & 65280;
            int i11 = 65280 & (i6 << 8);
            int i12 = (((i7 >>> 16) & 65280) - i8) / i5;
            int i13 = (((i7 >> 8) & 65280) - i9) / i5;
            int i14 = ((65280 & i7) - i10) / i5;
            int i15 = (((i7 << 8) & 65280) - i11) / i5;
            int[] iArr = new int[i5];
            for (int i16 = 0; i16 < i5; i16++) {
                iArr[i16] = ((65280 & i8) << 16) | ((65280 & i9) << 8) | (65280 & i10) | (i11 >> 8);
                i8 += i12;
                i9 += i13;
                i10 += i14;
                i11 += i15;
            }
            Image createRGBImage = Image.createRGBImage(iArr, 1, i5, true);
            int i17 = i2 + i4;
            while (i2 < i17) {
                graphics.drawImage(createRGBImage, i2, i3, 20);
                i2++;
            }
        }
    }

    private static synchronized void I(byte[] bArr) {
        synchronized (e.class) {
            f258I.m151Code(bArr, 0, bArr.length);
        }
    }

    /* renamed from: I  reason: collision with other method in class */
    private void m186I(byte[] bArr, int i2) {
        this.f356B = new e(bArr, i2);
    }

    private void I(byte[] bArr, int i2, int i3) {
        this.f389J.m151Code(bArr, i2, i3);
    }

    /* renamed from: I  reason: collision with other method in class */
    public static boolean m187I() {
        return f292aK;
    }

    static boolean I(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        return i2 <= i6 && i2 + i4 >= i6 + i8 && i3 <= i7 && i3 + i5 >= i7 + i9;
    }

    /* renamed from: I  reason: collision with other method in class */
    static boolean m188I(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }

    private static boolean I(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static boolean I(Object[] objArr, int i2) {
        return (objArr == null || objArr[9] == null || (Code(objArr, 9) & i2) == 0) ? false : true;
    }

    /* renamed from: I  reason: collision with other method in class */
    private static byte[] m189I() {
        byte[] bArr = new byte[16];
        for (int i2 = 0; i2 < 16; i2++) {
            bArr[i2] = (byte) f241Code.nextInt();
        }
        return bArr;
    }

    static int J(int i2) {
        return B(i2) + f244Code[i2 + 6] + f301b[i2 + 6];
    }

    private static int J(String str) {
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            i2 = (i2 * 31) + str.charAt(i3);
        }
        return i2;
    }

    public static int J(byte[] bArr, int i2) {
        return ((bArr[i2] & 255) << 16) + ((bArr[i2 + 1] & 255) << 8) + (bArr[i2 + 2] & 255);
    }

    private String J() {
        return (String) this.f386I[1];
    }

    /* renamed from: J  reason: collision with other method in class */
    private static String m190J(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if ((charAt <= '/' || charAt >= ':') && ((charAt <= '@' || charAt >= '[') && ((charAt <= '`' || charAt >= '{') && "-_.~".indexOf(charAt) == -1 && "%&=".indexOf(charAt) == -1))) {
                stringBuffer.append('%').append(Integer.toString(charAt, 16));
                i2++;
            } else {
                stringBuffer.append(charAt);
                i2++;
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: J  reason: collision with other method in class */
    static synchronized void m191J(int i2) {
        synchronized (e.class) {
            f258I.m114B(i2);
        }
    }

    private static void J(int i2, byte[] bArr, int i3) {
        bArr[i3] = i2 >> 24;
        bArr[i3 + 1] = (byte) (i2 >>> 16);
        bArr[i3 + 2] = (byte) (i2 >>> 8);
        bArr[i3 + 3] = (byte) i2;
    }

    private synchronized void J(g gVar) {
        Z(gVar);
        gVar.m258Code();
        I(gVar);
    }

    private void J(Graphics graphics) {
        if (this.f367Code != null) {
            boolean k2 = m213k();
            int d2 = (this.f393N + 4) - this.f367Code.d();
            int b2 = this.f367Code.b() - 8;
            Code(graphics, this.f400U, d2, this.f397R, b2, f262I[3]);
            if (!k2 || !N) {
                if (d2 > 0) {
                    if (f346s) {
                        int i2 = this.f400U;
                        int i3 = (d2 - 4) - 6;
                        int i4 = (this.f400U + this.f397R) - 4;
                        if (!k2) {
                            i2 += 4;
                            graphics.drawImage(Code.f119Z, this.f400U - 6, i3, 0);
                        }
                        while (i2 < i4) {
                            graphics.drawImage(Code.f113J, i2, i3, 0);
                            i2++;
                        }
                        graphics.drawImage(Code.f84B, i4, i3, 0);
                    } else {
                        Z(graphics, this.f400U, (this.f400U + this.f397R) - 1, this.f393N + 3, -1);
                        if (k2) {
                            Code(graphics, this.f400U, this.f393N, 4, 4, f262I[3]);
                            graphics.setColor(f262I[20]);
                            graphics.drawLine(this.f400U, this.f393N - 1, this.f400U + 3, this.f393N - 1);
                        }
                    }
                }
                if (f346s) {
                    for (int i5 = d2; i5 < d2 + b2; i5++) {
                        graphics.drawImage(Code.f124a, this.f400U + this.f397R, i5, 0);
                    }
                } else {
                    graphics.setColor(f262I[20]);
                    graphics.drawLine(this.f400U + this.f397R, d2, this.f400U + this.f397R, (d2 + b2) - 1);
                }
            }
            if (!k2 || N) {
                int i6 = d2 + b2;
                if (f346s) {
                    int i7 = this.f400U + this.f397R;
                    if (!k2) {
                        i7 -= 4;
                        graphics.drawImage(Code.f127b, i7, i6, 0);
                    }
                    for (int i8 = this.f400U + 4; i8 < i7; i8++) {
                        graphics.drawImage(Code.f130c, i8, i6, 0);
                    }
                    graphics.drawImage(Code.f133d, this.f400U - 6, i6, 0);
                } else {
                    Z(graphics, this.f400U, (this.f400U + this.f397R) - 1, i6, 1);
                    if (k2) {
                        Code(graphics, (this.f400U + this.f397R) - 4, i6, 4, 4, f262I[3]);
                        graphics.setColor(f262I[20]);
                        graphics.drawLine((this.f400U + this.f397R) - 4, i6 + 4, this.f400U + this.f397R + 1, i6 + 4);
                    }
                }
                if (f346s) {
                    for (int i9 = d2; i9 < d2 + b2; i9++) {
                        graphics.drawImage(Code.f86C, this.f400U - 6, i9, 0);
                    }
                    return;
                }
                graphics.setColor(f262I[20]);
                graphics.drawLine(this.f400U - 1, d2, this.f400U - 1, i6 - 1);
            }
        }
    }

    private void J(Graphics graphics, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (i2 < 0) {
            i6 = i4 + i2;
            i2 = 0;
        } else {
            i6 = i4;
        }
        if (i3 < 0) {
            i5 += i3;
            i3 = 0;
        }
        int i11 = i2 + this.f431ac;
        int i12 = i3 + this.f432ad;
        int i13 = this.f431ac;
        int i14 = this.f432ad;
        if (i11 >= this.f376Code.getWidth()) {
            i11 -= this.f376Code.getWidth();
            i7 = i13 - this.f376Code.getWidth();
            i8 = Math.min(i6 + i11, this.f431ac) - i11;
        } else {
            i7 = i13;
            i8 = i6;
        }
        if (i12 >= this.f376Code.getHeight()) {
            int height = i12 - this.f376Code.getHeight();
            int height2 = i14 - this.f376Code.getHeight();
            i5 = Math.min(height + i5, this.f432ad) - height;
            i9 = height2;
            i10 = height;
        } else {
            i9 = i14;
            i10 = i12;
        }
        int max = Math.max(i11, -this.f430ab);
        graphics.setClip(max, i10, i8, i5);
        if (graphics.getClipWidth() > 0 && graphics.getClipHeight() > 0) {
            Code(graphics, 0, 0, this.f376Code.getWidth(), this.f376Code.getHeight(), 16777215);
            this.f367Code.Z(graphics, (this.f430ab + i7) - this.f395P, i9 - this.f429aa);
            if (this.f425aS) {
                Code(graphics, 0, 0, this.f376Code.getWidth(), this.f376Code.getHeight(), 553648128, false);
            }
        }
        Code(graphics, max, i10, i8, i5);
    }

    /* renamed from: J  reason: collision with other method in class */
    private void m192J(byte[] bArr, int i2) {
        this.f356B.I(this.f406Z, 0, 32);
        this.f356B.I(this.f390J, 0, 64);
        this.f356B.Z(bArr, i2, 32);
        this.f356B.I(this.f406Z, 0, 32);
        this.f356B.Z(this.f406Z, 0, 32);
    }

    private void J(byte[] bArr, int i2, int i3) {
        int i4 = i2;
        while (i4 < i3) {
            int I2 = I(bArr, i4 + 4);
            e eVar = this.f356B;
            int i5 = this.f400U;
            this.f400U = i5 + 1;
            eVar.m117C(i5);
            this.f356B.I(bArr, i4 + 4, I2 + 2);
            this.f356B.Z(bArr, i4, 4);
            i4 += I2 + 6;
        }
        this.f464e.B(bArr, i2, i3 - i2);
    }

    /* renamed from: J  reason: collision with other method in class */
    private boolean m193J(int i2) {
        synchronized (f239Code) {
            if (f300b.elementAt(this.f396Q) == this) {
                f300b.setElementAt(null, this.f396Q);
            }
            boolean z2 = f243Code || this.f384I;
            int i3 = 0;
            while (i3 < this.f374Code.size()) {
                g gVar = (g) this.f374Code.elementAt(i3);
                if (gVar.m270Z() || gVar.m260Code() || (!z2 && gVar.m266I())) {
                    gVar.I(i2);
                    i3++;
                } else {
                    if (!z2) {
                        gVar.m269Z();
                    }
                    J(gVar);
                    i3++;
                }
            }
            this.f374Code.removeAllElements();
            if (this.f357B) {
                return false;
            }
            this.f357B = true;
            this.f371Code = null;
            this.f370Code = null;
            A();
            Code(f239Code);
            return true;
        }
    }

    private static boolean J(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int i2 = 0;
        while (length != i2) {
            char charAt = str.charAt(i2);
            if (charAt == '*') {
                String substring = str.substring(i2 + 1);
                String substring2 = str2.substring(i2);
                int length3 = substring2.length();
                int i3 = 0;
                while (!J(substring, substring2.substring(i3))) {
                    int i4 = i3 + 1;
                    if (length3 <= i3) {
                        return false;
                    }
                    i3 = i4;
                }
                return true;
            } else if (i2 >= length2) {
                return false;
            } else {
                int i5 = i2 + 1;
                if (charAt != str2.charAt(i2)) {
                    return false;
                }
                i2 = i5;
            }
        }
        return length2 == i2;
    }

    private void K() {
        if (this.f428aV && m231Code(1)) {
            if (this.f376Code == null && f270J != null) {
                this.f376Code = f270J;
                f270J = null;
            }
            if (this.f376Code == null || this.f401V != this.f376Code.getWidth() || this.f398S != this.f376Code.getHeight()) {
                this.f376Code = null;
                try {
                    this.f376Code = Image.createImage(this.f401V, this.f398S);
                    this.f420aN = true;
                } catch (Throwable th) {
                }
            }
        }
    }

    private void L() {
        O();
        R();
    }

    private void M() {
        this.f367Code.f22Code.put("s", "1");
        Code(this.f367Code.f21Code, this.f367Code.f21Code, this.f367Code.m31Code(), this.f367Code.f33I);
    }

    private void N() {
        O();
        if (this.f367Code != null) {
            this.f367Code.m70i();
        }
    }

    private void O() {
        if (!f277Y || Code.f91Code.f198Code < 0) {
            B Code2 = m223Code();
            if (Code2 != null && Code2.f8C != 5 && !Code2.m49I()) {
                Code2.m28C();
                return;
            }
            return;
        }
        Code.f91Code.f200Code = true;
        a.m104Code();
    }

    private void P() {
        if (z > 0 && this.f376Code != null && this.f424aR) {
            Code(this.f376Code.getGraphics(), 0, 0, this.f376Code.getWidth(), this.f376Code.getHeight());
            this.f424aR = false;
        }
    }

    private void Q() {
        if (this.f425aS) {
            this.f425aS = false;
            m250b();
        }
    }

    private void R() {
        if (this.f402Z != null) {
            if (!at && this.f402Z.f8C < 5) {
                this.f402Z.m28C();
            }
            this.f402Z = null;
            at = false;
        }
    }

    private void S() {
        if (this.f402Z != null) {
            this.f402Z.f59c = false;
            this.f357B = false;
            Code(this.f402Z, false);
            Code(this.f402Z);
        }
    }

    private static void T() {
        f246Code = new e[]{f318g, f321h};
        f263I = new e[0];
        f327j = null;
        a = 0;
    }

    private static void U() {
        f330k = "";
        f332l = "";
        f334m = "";
        f336n = "";
        f338o = "";
        aC = false;
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
            z = (z + 1) % (f245Code.length + 1);
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

    static int Z(int i2) {
        return i2 - (m << 1);
    }

    private static int Z(int i2, int i3, int i4) {
        return ((((i2 >>> 2) | (i2 << 30)) ^ ((i2 >>> 13) | (i2 << 19))) ^ ((i2 >>> 22) | (i2 << 10))) + (((i2 & i3) ^ (i2 & i4)) ^ (i3 & i4));
    }

    private static int Z(int i2, char[] cArr, int i3, int i4) {
        int i5 = 0;
        for (int i6 = i3; i6 < i3 + i4; i6++) {
            i5 += Code(i2, cArr[i6]);
        }
        return i5;
    }

    private static int Z(String str) {
        int i2 = 0;
        int i3 = 0;
        while (i3 < str.length()) {
            char charAt = str.charAt(i3);
            if (charAt > 0 && charAt <= 127) {
                i2++;
                i3++;
            } else if (charAt > 2047) {
                i2 += 3;
                i3++;
            } else {
                i2 += 2;
                i3++;
            }
        }
        return i2;
    }

    private static int Z(String str, String str2) {
        int max = Math.max(0, 0);
        if (str2.length() == 0) {
            return max;
        }
        if (max <= str.length() - str2.length()) {
            for (int i2 = max; i2 <= str.length() - str2.length(); i2++) {
                if (Code(str, str2, max)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static int Z(byte[] bArr, int i2) {
        return (bArr[i2] << 24) + ((bArr[i2 + 1] & 255) << 16) + ((bArr[i2 + 2] & 255) << 8) + (bArr[i2 + 3] & 255);
    }

    private String Z() {
        return new StringBuffer().append("http://").append(this.f361C.f475r).append(":").append(this.f361C.f398S).append("/").toString();
    }

    /* renamed from: Z  reason: collision with other method in class */
    private static String m194Z(int i2) {
        return f264I[i2] != null ? f264I[i2] : "";
    }

    /* renamed from: Z  reason: collision with other method in class */
    private String m195Z(String str) {
        String stringBuffer;
        int indexOf;
        StringBuffer stringBuffer2 = new StringBuffer();
        while (true) {
            B(0, 1);
            if (this.f358B[0] == 13) {
                B(0, 1);
            }
            if (this.f358B[0] != 10) {
                stringBuffer2.append((char) this.f358B[0]);
            } else if (stringBuffer2.length() == 0) {
                if (str != null) {
                }
                return null;
            } else if (str != null && (indexOf = (stringBuffer = stringBuffer2.toString()).indexOf(58)) >= 0 && stringBuffer.toLowerCase().startsWith(str)) {
                return stringBuffer.substring(indexOf + 1).trim();
            } else {
                stringBuffer2.setLength(0);
            }
        }
    }

    /* renamed from: Z  reason: collision with other method in class */
    static void m196Z(int i2) {
        H += i2;
        if (aF) {
            Code.f89Code.m99b();
            if (H >= 160) {
                aF = false;
                C(false);
                Code((Object) f258I);
            }
        }
    }

    public static void Z(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) (i2 >> 16);
        bArr[i3 + 1] = (byte) (i2 >> 8);
        bArr[i3 + 2] = (byte) i2;
    }

    private synchronized void Z(g gVar) {
        if (gVar != null) {
            this.f374Code.removeElement(gVar);
        }
    }

    private static synchronized void Z(DataInputStream dataInputStream) {
        synchronized (e.class) {
            int readInt = dataInputStream.readInt();
            Code(dataInputStream.readInt(), dataInputStream, true);
            if (readInt != "mini4cn.opera-mini.net".hashCode()) {
                T();
            }
        }
    }

    /* renamed from: Z  reason: collision with other method in class */
    private void m197Z(String str) {
        boolean z2;
        String Z2;
        boolean z3;
        String I2 = m181I(str);
        boolean z4 = this.f367Code != null && I(this.f367Code.f21Code) == 165;
        if (!"".equals(I2)) {
            try {
                Code.f89Code.m90Code(Integer.parseInt(I2));
                z2 = true;
            } catch (NumberFormatException e2) {
                z2 = false;
            }
        } else {
            if (z4 && (Z2 = this.f367Code.m55Z()) != null) {
                if (Z2.startsWith("showTab:")) {
                    Z2 = Z2.substring(8);
                    z3 = true;
                } else if (Z2.startsWith("closeTab:")) {
                    Z2 = Z2.substring(9);
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    try {
                        Code.f89Code.m90Code(Integer.parseInt(Z2));
                        z2 = true;
                    } catch (NumberFormatException e3) {
                    }
                }
            }
            z2 = false;
        }
        if (z4 && z2) {
            Code(true, false, (Hashtable) null);
            m237I();
            a();
        }
    }

    static void Z(Graphics graphics) {
        if (br) {
            br = false;
            graphics.setClip(aR, aS, aT, aU);
            return;
        }
        int[] iArr = (int[]) f242Code.pop();
        graphics.setClip(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    private static void Z(Graphics graphics, int i2, int i3, int i4, int i5) {
        graphics.setColor(f262I[20]);
        graphics.drawLine(i2, i4, i3, i4);
        int i6 = i4 + i5;
        graphics.drawLine(i2, i6, i3, i6);
        int i7 = i6 + i5;
        graphics.drawLine(i2 + 1, i7, i3 - 1, i7);
        int i8 = i7 + i5;
        graphics.drawLine(i2 + 2, i8, i3 - 2, i8);
        int i9 = i8 + i5;
        graphics.drawLine(i2 + 4, i9, i3 - 4, i9);
        graphics.setColor(f262I[3]);
        graphics.drawLine(i2 + 1, i4, i3 - 1, i4);
        int i10 = i4 + i5;
        graphics.drawLine(i2 + 1, i10, i3 - 1, i10);
        int i11 = i10 + i5;
        graphics.drawLine(i2 + 2, i11, i3 - 2, i11);
        int i12 = i11 + i5;
        graphics.drawLine(i2 + 4, i12, i3 - 4, i12);
    }

    private static void Z(byte[] bArr) {
        int C2;
        int i2;
        boolean z2 = true;
        bb = 0;
        if (!(((char) bArr[0]) == 'M' && ((char) bArr[1]) == 'M')) {
            z2 = false;
        }
        bs = z2;
        bb += 4;
        bb = C(bArr, 4);
        do {
            int C3 = C(bArr, 2);
            int i3 = 0;
            while (i3 < C3) {
                int C4 = C(bArr, 2);
                int i4 = f329j[C(bArr, 2) - 1];
                int C5 = C(bArr, 4);
                int C6 = C(bArr, 4);
                int i5 = i4 * C5;
                int i6 = bb;
                if (i5 > 4) {
                    bb = C6;
                    i2 = 0;
                } else {
                    bb -= 4;
                    i2 = 0;
                }
                while (i2 < C5) {
                    int C7 = C(bArr, i4);
                    if (C4 != 259) {
                        if (C4 == 513) {
                            aZ = C7;
                        } else if (C4 == 514) {
                            ba = C7;
                        }
                    }
                    i2++;
                }
                if (i5 > 4) {
                    bb = i6;
                    i3++;
                } else {
                    bb += 4 - i5;
                    i3++;
                }
            }
            C2 = C(bArr, 4);
            bb = C2;
        } while (C2 != 0);
    }

    /* renamed from: Z  reason: collision with other method in class */
    private void m198Z(byte[] bArr, int i2) {
        for (int i3 = i2; i3 < 64; i3++) {
            this.f390J[i3] = 0;
        }
        System.arraycopy(bArr, 0, this.f390J, 0, Math.min(64, i2));
        this.f356B.I(this.f390J, 0, 64);
        this.f356B.Z(this.f406Z, 0, 32);
    }

    private void Z(byte[] bArr, int i2, int i3) {
        this.f389J.m149Code(this.f385I);
        this.f389J.m151Code(this.f406Z, 0, 64);
        this.f389J.m151Code(this.f385I, 0, 32);
        this.f389J.m149Code(this.f385I);
        System.arraycopy(this.f385I, 0, bArr, i2, i3);
        this.f389J.m151Code(this.f390J, 0, 64);
    }

    /* renamed from: Z  reason: collision with other method in class */
    static boolean m199Z(int i2) {
        return (i2 & 1) != 0;
    }

    /* renamed from: Z  reason: collision with other method in class */
    private static boolean m200Z(String str, String str2) {
        return m126Code(str, str2) != null;
    }

    private static int a(int i2) {
        switch ((i2 & 255) >> 4) {
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

    static void a() {
        if (R) {
            I.Code();
        } else {
            Code.f89Code.repaint();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private synchronized void m201a(int i2) {
        Z(m119Code(i2));
    }

    private void a(int i2, int i3) {
        I(i2, i3);
        this.f435ag = -1;
    }

    static void a(boolean z2) {
        Hashtable hashtable = new Hashtable();
        f281Z = hashtable;
        hashtable.put("#1", new Integer(0));
        f281Z.put("#2", new Integer(1));
        f281Z.put("#3", new Integer(3));
        f281Z.put("#4", new Integer(4));
        f281Z.put("#5", new Integer(5));
        f281Z.put("#6", new Integer(6));
        f281Z.put("#7", new Integer(7));
        f281Z.put("#8", new Integer(8));
        f281Z.put("#9", new Integer(9));
        f281Z.put("#0", new Integer(10));
        f281Z.put("##", new Integer(11));
        f281Z.put("#*", new Integer(12));
        f281Z.put("*1", new Integer(13));
        f281Z.put("*2", new Integer(14));
        f281Z.put("*3", new Integer(15));
        f281Z.put("*4", new Integer(16));
        f281Z.put("*5", new Integer(17));
        f281Z.put("*6", new Integer(18));
        f281Z.put("*7", new Integer(19));
        f281Z.put("*8", new Integer(20));
        f281Z.put("*9", new Integer(21));
        f281Z.put("*0", new Integer(22));
        f281Z.put("*#", new Integer(23));
        f281Z.put("**", new Integer(24));
        f281Z.put("1", new Integer(25));
        f281Z.put("2", new Integer(26));
        f281Z.put("3", new Integer(27));
        f281Z.put("4", new Integer(28));
        f281Z.put("5", new Integer(29));
        f281Z.put("6", new Integer(30));
        f281Z.put("7", new Integer(31));
        f281Z.put("8", new Integer(32));
        f281Z.put("9", new Integer(33));
        m147Code(f281Z);
        f281Z.put("0", new Integer(39));
        if (z2) {
            g(true);
            return;
        }
        f268J = new Hashtable();
        Enumeration keys = f281Z.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            f268J.put(f281Z.get(nextElement), nextElement);
        }
    }

    private static void aa() {
        if (!ar) {
            ar = true;
        } else {
            ar = false;
        }
    }

    private static synchronized void ab() {
        boolean z2;
        synchronized (e.class) {
            boolean z3 = false;
            int i2 = 0;
            while (true) {
                if (!z3) {
                    if (i2 > 0) {
                        break;
                    }
                } else if (i2 >= 2) {
                    break;
                }
                J j2 = new J();
                try {
                    DataOutputStream dataOutputStream = new DataOutputStream(j2);
                    dataOutputStream.write(2);
                    dataOutputStream.writeByte(f260I.size());
                    Enumeration keys = f260I.keys();
                    while (keys.hasMoreElements()) {
                        Object nextElement = keys.nextElement();
                        dataOutputStream.writeUTF((String) nextElement);
                        dataOutputStream.writeInt(((Integer) f260I.get(nextElement)).intValue());
                    }
                } catch (IOException e2) {
                }
                if (!Code("sh", j2.toByteArray(), (Vector) null, false)) {
                    Code.f89Code.B(1);
                    Code.f93Code.removeAllElements();
                    try {
                        RecordStore.deleteRecordStore("h1");
                        z2 = true;
                    } catch (RecordStoreException e3) {
                        z2 = true;
                    }
                } else {
                    z2 = z3;
                }
                z3 = z2;
                i2++;
            }
        }
    }

    private static int b(int i2) {
        int i3 = 0;
        if (i2 > 0) {
            i3 = 1;
        }
        if (i2 >= 10) {
            return ((i2 - 1) / 9) + 1;
        }
        if (i2 <= 0) {
            return i3;
        }
        return 1;
    }

    /* renamed from: b  reason: collision with other method in class */
    private static void m202b(int i2) {
        synchronized (f239Code) {
            while (f237Code != null) {
                f237Code.I(i2);
                f237Code = f237Code.m257Code();
            }
        }
    }

    private void b(int i2, int i3) {
        boolean z2;
        int i4;
        e eVar;
        String str;
        boolean z3 = true;
        if (f250Code != null && i2 != -6 && i2 != -7) {
            if (i2 == -11 && e == 2) {
                i2 = 49;
            }
            boolean Code2 = (this.f440al == -1 || (this.f440al != -1 && this.f439ak == i2 && ((System.currentTimeMillis() - this.f366Code) > 1000 ? 1 : ((System.currentTimeMillis() - this.f366Code) == 1000 ? 0 : -1)) < 0)) ? false : m234Code(true);
            switch (i2) {
                case -8:
                    if (this.f421aO) {
                        this.f373Code = new StringBuffer();
                    } else if ((Code2 || this.f437ai == -1) && this.f373Code.length() > 0 && this.f441am > 0) {
                        StringBuffer stringBuffer = this.f373Code;
                        int i5 = this.f441am - 1;
                        this.f441am = i5;
                        stringBuffer.deleteCharAt(i5);
                    }
                    this.f437ai = -1;
                    z2 = Code2;
                    break;
                case -5:
                    this.f368Code = null;
                    if (!Code2) {
                        if (this.f437ai == -1 || this.f437ai != this.f458c.size() - 1) {
                            Code.f89Code.I(this);
                            if (this.f437ai == -1 || this.f458c.size() == 0) {
                                Code code = Code.f89Code;
                                str = this.f476u;
                                code.Z(str);
                            } else if (this.f437ai == this.f458c.size() - 2) {
                                Code.f89Code.Z((String) Code(f234C, 0)[0], this.f476u);
                                str = this.f476u;
                            } else {
                                Code code2 = Code.f89Code;
                                str = (String) this.f458c.elementAt(this.f437ai);
                                code2.Z(str);
                            }
                            B b2 = this.f369Code.f367Code;
                            if (!(b2 == null || str == null || I(b2.f21Code) != 65)) {
                                b2.f22Code.put("o:a", str);
                            }
                        } else {
                            Code.f89Code.J(this.f476u);
                        }
                        z3 = false;
                        z2 = Code2;
                        break;
                    }
                    z2 = Code2;
                    break;
                case 1:
                    if (!Code2) {
                        if (this.f437ai < 0) {
                            i4 = this.f458c.size();
                            eVar = this;
                        } else {
                            i4 = this.f437ai;
                            eVar = this;
                        }
                        eVar.f437ai = i4 - 1;
                        if (this.f458c.size() != 0) {
                            z3 = false;
                            z2 = Code2;
                            break;
                        } else {
                            z2 = Code2;
                            break;
                        }
                    }
                    z2 = Code2;
                    break;
                case 2:
                    if (this.f437ai != -1 && this.f437ai < this.f458c.size() - 2) {
                        this.f373Code = new StringBuffer((String) this.f458c.elementAt(this.f437ai));
                        this.f437ai = -1;
                    }
                    this.f441am = Math.max(0, this.f441am - 1);
                    z2 = Code2;
                    break;
                case 5:
                    if (!this.f421aO) {
                        if (!Code2) {
                            if (this.f437ai != -1 && this.f437ai < this.f458c.size() - 2) {
                                this.f373Code = new StringBuffer((String) this.f458c.elementAt(this.f437ai));
                                this.f437ai = -1;
                                this.f441am = this.f373Code.length();
                                z2 = Code2;
                                break;
                            } else {
                                this.f441am = Math.min(this.f373Code.length(), this.f441am + 1);
                                z2 = Code2;
                                break;
                            }
                        }
                        z2 = Code2;
                        break;
                    } else {
                        this.f441am = this.f373Code.length();
                        z2 = Code2;
                        break;
                    }
                    break;
                case 6:
                    if (!Code2) {
                        if (this.f421aO) {
                            this.f441am = this.f373Code.length();
                        } else if (this.f437ai >= this.f458c.size() - 1) {
                            this.f437ai = -1;
                        } else {
                            this.f437ai++;
                        }
                        if (this.f458c.size() != 0) {
                            z3 = false;
                            z2 = Code2;
                            break;
                        } else {
                            z2 = Code2;
                            break;
                        }
                    }
                    z2 = Code2;
                    break;
                default:
                    int Code3 = Code(i2, this.f440al, i3 > 0);
                    if (Code3 != -1) {
                        if (this.f421aO) {
                            this.f373Code = new StringBuffer();
                        }
                        if (Code3 != 8 && Code3 != 127) {
                            this.f440al = (char) Code3;
                            if (m116B(i2)) {
                                z3 = false;
                                z2 = Code2;
                                break;
                            } else {
                                z2 = m234Code(true);
                                break;
                            }
                        } else {
                            if ((Code2 || this.f437ai == -1) && this.f373Code.length() > 0 && this.f441am > 0) {
                                StringBuffer stringBuffer2 = this.f373Code;
                                int i6 = this.f441am - 1;
                                this.f441am = i6;
                                stringBuffer2.deleteCharAt(i6);
                            }
                            this.f437ai = -1;
                            z2 = Code2;
                            break;
                        }
                    }
                    z2 = Code2;
                    break;
            }
            if (z3) {
                J(z2);
            }
            m253f();
            this.f421aO = false;
            this.f366Code = System.currentTimeMillis();
            this.f439ak = i2;
        }
    }

    static void b(boolean z2) {
        int i2;
        if (z2 || f308c == null || f308c.length != 32) {
            e eVar = new e((byte) 0);
            char[] cArr = {' ', 'm', 'i', '0', 229, 1575, 1503, 936, 1102, 1030, 12353, 19968, 13071};
            Code = new J(32);
            E = ((f304bb ? 1 : 0) * -55248) + 220991;
            for (int i3 = 0; i3 < 6; i3++) {
                Code.write(B(i3 - (m << 1)) - Math.max(0, (B(i3 - (m << 1)) - e(i3)) - f244Code[i3]));
                Code.write(B(i3 - (m << 1)));
                for (char c2 : cArr) {
                    Code.write(Code(i3, c2));
                }
                eVar.m151Code(Code.Code(), 0, Code.size());
                Code.reset();
            }
            Code.Code(32);
            eVar.m149Code(Code.Code());
            if (z2) {
                for (int i4 = 0; i4 < 6; i4++) {
                    int max = Math.max(0, (B(i4 - (m << 1)) - e(i4)) - f244Code[i4]);
                    Code.write(i4);
                    Code.write(B(i4 - (m << 1)) - max);
                    Code.write(max);
                    aN = 0;
                    aP = 4;
                    aQ = 1 << (aP - 1);
                    int[] iArr = {1, 31, 2043, 2303, 7037, 7423, 12353, 12543, 13312, 19903, 19968, 40895, 42183, 42751, 55296, 64255, 65536};
                    int i5 = 0;
                    int i6 = 0;
                    int i7 = Integer.MAX_VALUE;
                    int i8 = 0;
                    int i9 = 1;
                    while (i9 <= 65535) {
                        int i10 = i9 + 1;
                        int Code2 = Code(i4, (char) i9);
                        F++;
                        int i11 = Code2 - i8;
                        int abs = Math.abs(i11);
                        if (i11 != i7 || i10 - 1 == iArr[i5]) {
                            if (i6 > 0) {
                                if (i6 < 4) {
                                    for (int i12 = 0; i12 < i6; i12++) {
                                        c(i7, aP);
                                    }
                                    i6 = 0;
                                } else {
                                    c(aQ, aP);
                                    if (i6 <= (1 << ((aP << 1) - 1))) {
                                        c(i6, aP << 1);
                                        i6 = 0;
                                    } else {
                                        c(2, aP << 1);
                                        c(i6, 16);
                                        i6 = 0;
                                    }
                                }
                            }
                            while ((abs >>> (aP - 1)) != 0) {
                                c(aQ, aP);
                                c(1, aP << 1);
                                aP++;
                                aQ = 1 << (aP - 1);
                            }
                            c(i11, aP);
                            if (i10 - 1 == iArr[i5]) {
                                c(0, aP);
                                i2 = (iArr[i5 + 1] - iArr[i5]) - 1;
                                i10 = iArr[i5 + 1] + 1;
                                i11 = 0;
                                i5 += 2;
                            } else {
                                i2 = i6;
                            }
                            i6 = i2;
                            i7 = i11;
                            i8 = Code2;
                            i9 = i10;
                        } else {
                            i6++;
                            i8 = Code2;
                            i9 = i10;
                        }
                    }
                    if (i6 > 0) {
                        c(aQ, aP);
                        c(2, aP << 1);
                        c(i6, 16);
                    }
                    c(aQ, aP);
                    c(3, aP << 1);
                    if (aN != 0) {
                        Code.write(aO << (8 - aN));
                    }
                }
            }
            f308c = Code.toByteArray();
            Code = null;
            F = -1;
        }
    }

    static boolean b() {
        return g == 1;
    }

    static int c() {
        boolean z2 = bl && Code.g > Code.h;
        if (f != 0 || z2) {
            return 0;
        }
        return e;
    }

    private int c(int i2) {
        return (this.f417aI * i2) / 100;
    }

    /* renamed from: c  reason: collision with other method in class */
    private synchronized void m203c(int i2) {
        this.f467f = System.currentTimeMillis();
        this.f393N = i2;
    }

    private static void c(int i2, int i3) {
        int i4 = aO << i3;
        aO = i4;
        aO = i4 | (((1 << i3) - 1) & i2);
        aN += i3;
        while (aN >= 8) {
            aN -= 8;
            Code.write(aO >> aN);
        }
    }

    static void c(boolean z2) {
        if (z2) {
            aX = 0;
        } else {
            aX = (aX + 1) % 12;
        }
    }

    /* renamed from: c  reason: collision with other method in class */
    static boolean m204c() {
        return ((Integer) f260I.get("2")).intValue() == 26 && ((Integer) f260I.get("4")).intValue() == 28 && ((Integer) f260I.get("6")).intValue() == 30 && ((Integer) f260I.get("8")).intValue() == 32;
    }

    private static int d() {
        try {
            return Integer.parseInt(System.getProperty("com.sonyericsson.net.mcc"));
        } catch (Throwable th) {
            return -1;
        }
    }

    private int d(int i2) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f431ac == 0) {
                this.f394O = g();
                this.f431ac = 8;
            }
            int i5 = ((this.f394O & 1) << i3) | i4;
            this.f394O >>>= 1;
            this.f431ac--;
            i3++;
            i4 = i5;
        }
        return i4;
    }

    static void d(boolean z2) {
        if (!z2) {
            C = 0;
            f285a = 0;
            f317g = 0;
        }
        f298b = C;
        f305c = f285a;
    }

    /* renamed from: d  reason: collision with other method in class */
    private boolean m205d() {
        if (!aA) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return m154Code(currentTimeMillis) && m154Code(currentTimeMillis - f310d);
    }

    private int e() {
        return (this.f395P * (this.f401V - f())) / Math.max(Math.max(this.f367Code.a(), this.f401V) - this.f401V, 1);
    }

    private static int e(int i2) {
        return f248Code[i2].getBaselinePosition() > 0 ? f248Code[i2].getBaselinePosition() : f248Code[i2].getHeight() + f301b[i2];
    }

    /* renamed from: e  reason: collision with other method in class */
    static void m206e() {
        synchronized (Code.f89Code) {
            switch (c()) {
                case 2:
                    f250Code = m178Code("\u0001\u0004\u00020 0\u00171./:_-~%$?=&!+#*@,;\\'()1\u0001**\u0001##");
                    break;
                case 3:
                    f250Code = m178Code("\u0000\f\u00020+0\u00171./:_-~%$?=&!+#*@,;\\'()1\u00042abc2\u00043def3\u00044ghi4\u00045jkl5\u00046mno6\u00057pqrs7\u00048tuv8\u00059wxyz9\u0000*\u0003# *#");
                    break;
                case 4:
                    f250Code = m178Code("\u0001\u0002\u00020 0\u0000#");
                    break;
                case 5:
                    f250Code = m178Code("\u0001\u0003\u000100\u0001* \u0000#");
                    break;
                case 6:
                    f250Code = m178Code("\u0001\u0002\u00170./:_-~%$?=&!+#*@,;\\'()0\u0001# ");
                    break;
                case 7:
                    f250Code = m178Code("\u0001\u0003\u00170./:_-~%$?=&!+#*@,;\\'()0\u00021 1\u0000#");
                    break;
                case 8:
                    f250Code = m178Code("\u0001\u0002\u000100\u0001# ");
                    break;
                case 9:
                    f250Code = m178Code("\u0001\u0002\u000100\u0001# ");
                    break;
                case 10:
                    f250Code = m178Code("\u0002\u0000");
                    break;
                default:
                    f250Code = null;
                    break;
            }
        }
    }

    private void e(boolean z2) {
        Code(z2, 0);
    }

    /* renamed from: e  reason: collision with other method in class */
    private boolean m207e() {
        return (this.f397R & 1) != 0;
    }

    private int f() {
        return Math.max((this.f401V * this.f401V) / Math.max(this.f367Code.a(), this.f401V), 5);
    }

    private static int f(int i2) {
        Image createImage;
        if (!f344r || (createImage = Image.createImage(1, 1)) == null) {
            return -1;
        }
        Code(createImage.getGraphics(), 0, 0, 1, 1, -1);
        Code(createImage.getGraphics(), 0, 0, 1, 1, i2, false);
        int[] iArr = {-1};
        createImage.getRGB(iArr, 0, 1, 0, 0, 1, 1);
        return iArr[0];
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private void f(boolean z2) {
        int i2;
        while (true) {
            B(0, 6);
            this.f468f.B(this.f358B, 0, 6);
            int I2 = I(this.f358B, 4);
            if (I2 > 1014) {
                throw new IOException();
            }
            B(6, I2);
            this.f366Code = System.currentTimeMillis();
            this.f468f.B(this.f358B, 6, I2);
            e eVar = this.f459d;
            int i3 = this.f398S;
            this.f398S = i3 + 1;
            eVar.m117C(i3);
            this.f459d.I(this.f358B, 4, I2 + 2);
            this.f459d.Z(this.f358B, 1020, 4);
            if (this.f358B[1020] == this.f358B[0] && this.f358B[1021] == this.f358B[1] && this.f358B[1022] == this.f358B[2] && this.f358B[1023] == this.f358B[3]) {
                byte b2 = this.f358B[6];
                byte b3 = this.f358B[7];
                int i4 = I2 - 2;
                switch (b2) {
                    case 4:
                        e(true);
                        continue;
                    case 5:
                        byte b4 = this.f358B[8];
                        g gVar = new g();
                        this.f374Code.addElement(gVar);
                        gVar.Code(this, b3);
                        if (b4 == 1) {
                            I i5 = new I(30);
                            i5.f190Code = gVar;
                            Code((Runnable) i5);
                            continue;
                        } else {
                            gVar.close();
                        }
                    case 7:
                        m201a((int) b3);
                        continue;
                    case 9:
                        this.f397R = Math.max(this.f397R - 1, 0);
                        g Code2 = m119Code((int) b3);
                        if (Code2 != null) {
                            Code2.m265I();
                        }
                        b(false);
                        continue;
                    case 11:
                        this.f408a.f474k = this;
                        this.f408a.C(this.f358B, 8, i4);
                        if (z2) {
                            return;
                        }
                        break;
                    case 15:
                        if (!this.f405Z) {
                            continue;
                        } else if (this.f390J != null) {
                            System.arraycopy(this.f358B, 8, this.f390J, 0, 8);
                            this.f384I = true;
                            e(true);
                            return;
                        } else {
                            this.f390J = new byte[8];
                            System.arraycopy(this.f358B, 8, this.f390J, 0, 8);
                        }
                    case 17:
                        this.f408a = new e();
                        continue;
                    case 20:
                        Code((Runnable) new e(m128Code(this.f358B, 8, i4 + 8)));
                        continue;
                }
                g Code3 = m119Code((int) b3);
                int i6 = 0;
                int i7 = 8;
                while (true) {
                    if (Code3 != null) {
                        while (true) {
                            if (Code3.m261Code() != null) {
                                int min = Math.min(Code3.J(), i4);
                                switch (b2) {
                                    case 6:
                                        Code3.m267J();
                                        Code(Code3, true);
                                        if (this.f405Z && !m211i()) {
                                            this.f455b = this.f408a;
                                            break;
                                        }
                                    case 7:
                                    case 8:
                                    case 9:
                                    default:
                                        Code3.Code(min);
                                        i4 -= min;
                                        i2 = i7 + min;
                                        break;
                                    case 10:
                                        System.arraycopy(this.f358B, i7, Code3.m261Code(), Code3.Z(), min);
                                        int i8 = min - i4;
                                        i6 = ((i8 | (-i8)) >>> 31) ^ 1;
                                        Code3.J(min);
                                        Code3.Code(min);
                                        i4 -= min;
                                        i2 = i7 + min;
                                        break;
                                    case 11:
                                        min = this.f408a.Code(Code3.m261Code(), Code3.Z(), Code3.J());
                                        i6 = (((-min) | min) >>> 31) ^ 1;
                                        Code3.J(this.f408a.f400U);
                                        Code3.Code(min);
                                        i4 -= min;
                                        i2 = i7 + min;
                                        break;
                                }
                            } else if (Code3.m270Z()) {
                                Code3 = null;
                                i2 = i7;
                            } else {
                                Code((Object) Code3, 1000);
                            }
                        }
                        if (i6 == 0) {
                            i7 = i2;
                        }
                    } else if (b2 == 11) {
                        do {
                        } while (this.f408a.Code((byte[]) null, 0, 1024) > 0);
                    }
                }
            }
        }
        throw new IOException();
    }

    /* renamed from: f  reason: collision with other method in class */
    private boolean m208f() {
        return (this.f397R & 4) != 0;
    }

    private int g() {
        while (this.f395P >= this.f415aG) {
            this.f474k.f(true);
        }
        this.f400U++;
        byte[] bArr = this.f358B;
        int i2 = this.f395P;
        this.f395P = i2 + 1;
        return bArr[i2] & 255;
    }

    private static void g(boolean z2) {
        if (z2) {
            f260I = f281Z;
            ab();
            Code.f89Code.Code(f260I);
        }
        f268J = null;
        f281Z = null;
    }

    /* renamed from: g  reason: collision with other method in class */
    private boolean m209g() {
        return this.f393N == 0;
    }

    static void h() {
        if (f246Code == null) {
            T();
        }
    }

    /* renamed from: h  reason: collision with other method in class */
    private synchronized boolean m210h() {
        boolean z2;
        long max;
        if (this.f393N > 0) {
            if (this.f366Code >= this.f467f) {
                max = Math.max(this.f366Code, this.f463e) + 240000;
            } else {
                max = (m211i() ? this.f467f : Math.max(this.f467f, this.f463e)) + ((long) this.f393N);
            }
            if (max - System.currentTimeMillis() < 0) {
                z2 = true;
            }
        }
        z2 = false;
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:446:0x07f0, code lost:
        if (r10.startsWith("maui") == false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x08ee, code lost:
        if (defpackage.e.f339o != false) goto L_0x08f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0902, code lost:
        if (defpackage.e.f339o != false) goto L_0x08f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x09b9, code lost:
        if (r17 <= 128) goto L_0x0139;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void i() {
        /*
        // Method dump skipped, instructions count: 3204
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.i():void");
    }

    /* renamed from: i  reason: collision with other method in class */
    private boolean m211i() {
        return this.f407Z[this.f364Code].startsWith("socket://");
    }

    static void j() {
        if (!f303ba) {
            Image I2 = m184I(6);
            if (I2 == null || I2.getWidth() != 1) {
                f297aZ = false;
            } else {
                f297aZ = true;
            }
        }
    }

    /* renamed from: j  reason: collision with other method in class */
    private boolean m212j() {
        synchronized (f239Code) {
            if (!aJ) {
                return false;
            }
            int i2 = X;
            aJ = false;
            f292aK = true;
            try {
                if (I >= this.f407Z.length - 1) {
                    I = -1;
                }
                boolean z2 = false;
                boolean z3 = false;
                e eVar = this;
                while (true) {
                    if (!z3) {
                        I = (byte) (I + 1);
                    }
                    if (I >= this.f407Z.length) {
                        if (z2) {
                            F();
                            f292aK = false;
                            A();
                            return true;
                        }
                        e I2 = m179I(this.f396Q);
                        if (!this.f361C.f460d.equals(I2.f460d) || !this.f361C.f372Code.equals(I2.f372Code) || this.f361C.f398S != I2.f398S) {
                            Enumeration elements = f240Code.elements();
                            while (elements.hasMoreElements()) {
                                ((e) ((Object[]) elements.nextElement())[0]).x();
                            }
                            I = 0;
                            z2 = true;
                        } else {
                            F();
                            f292aK = false;
                            A();
                            return true;
                        }
                    }
                    if (!this.f407Z[I].startsWith("socket://") || (Z < 0 && !ae && !ad && !this.f361C.m209g())) {
                        this.f457c.x();
                        C(false);
                        if (eVar == null) {
                            eVar = Code(this.f396Q, I, z2);
                        } else {
                            eVar.f390J = null;
                            eVar.f455b = null;
                            eVar.f364Code = I;
                            Code((Runnable) eVar);
                        }
                        while (f243Code && !eVar.f357B && !eVar.m210h()) {
                            Code(f239Code, 1000);
                        }
                        if (!f243Code || i2 != X) {
                            f292aK = false;
                            A();
                        } else {
                            boolean z4 = eVar.f401V == 1 && !z3;
                            if (eVar.f401V == 2) {
                                m202b(4);
                                I = -1;
                                C(false);
                                f292aK = false;
                                A();
                                return true;
                            }
                            if (eVar.m211i() && !z4 && !this.f407Z[I + 1].startsWith("socket://")) {
                                Code((byte) -2, (String) null);
                            }
                            eVar.Code(false, 0);
                            z3 = z4;
                            eVar = null;
                        }
                    } else {
                        if (ae || ad) {
                            Code((byte) -2, (String) null);
                        }
                        z3 = false;
                    }
                }
                f292aK = false;
                A();
                return true;
            } catch (Throwable th) {
                f292aK = false;
                A();
                throw th;
            }
        }
    }

    static void k() {
        System.gc();
        if (f294aW) {
            f257I = (Runtime.getRuntime().freeMemory() * 10) / 8;
        } else if (!f295aX || f257I <= 0) {
            Vector vector = new Vector(aK);
            int i2 = 0;
            try {
                System.gc();
                while (vector.size() <= aK) {
                    vector.addElement(new byte[8192]);
                    i2++;
                }
            } catch (Throwable th) {
            }
            System.gc();
            f257I = (long) ((i2 << 13) + 4);
        }
    }

    /* renamed from: k  reason: collision with other method in class */
    private boolean m213k() {
        return (this.f369Code.m231Code(2) || this.f367Code == null || I(this.f367Code.f21Code) == 123) ? false : true;
    }

    static void l() {
        InputStream inputStream = null;
        try {
            DataInputStream Code2 = m120Code(64);
            f280Z = Code2.readUTF();
            String readUTF = Code2.readUTF();
            f267J = readUTF;
            if (!(readUTF == null || f267J.indexOf("-") == -1)) {
                f228B = f267J.substring(f267J.indexOf("-") + 1);
            }
            f259I = Code2.readUTF();
            Code2.readUTF();
            f299b = Code2.readUTF();
            f306c = Code2.readUTF();
            f232C = Code2.readUTF();
            f286a = Code2.readUTF();
            aq = Code2.readBoolean();
            l = Code2.readInt();
            Code2.readBoolean();
            ap = Code2.readBoolean();
            Code2.readBoolean();
            aw = Code2.readBoolean();
            f304bb = Code2.readBoolean();
            Code2.close();
        } catch (Throwable th) {
        }
    }

    /* renamed from: l  reason: collision with other method in class */
    private boolean m214l() {
        return this.f367Code != null && (m231Code(1) || I(this.f367Code.f21Code) == 165) && !this.f367Code.m58Z();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v37, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r0v67, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r0v76, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    static synchronized void m() {
        boolean z2 = true;
        synchronized (e.class) {
            try {
                byte[] bArr = (byte[]) m131Code("s").firstElement();
                if (bArr != null) {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
                    int readUnsignedByte = dataInputStream.readUnsignedByte();
                    bn = (readUnsignedByte < 9) | bn;
                    if (readUnsignedByte < 9) {
                        Code((InputStream) dataInputStream, 5L);
                        dataInputStream.readUTF();
                        Code((InputStream) dataInputStream, 6L);
                        String readUTF = dataInputStream.readUTF();
                        if (readUTF.length() == 64) {
                            f264I[1] = readUTF;
                        }
                        Code(dataInputStream, Integer.MAX_VALUE);
                    } else if (readUnsignedByte != 9) {
                        Code(dataInputStream, Integer.MAX_VALUE);
                    } else {
                        String readUTF2 = dataInputStream.readUTF();
                        if (readUTF2.length() >= 64) {
                            Code(1, readUTF2, false);
                        }
                        dataInputStream.readUTF();
                        aA = dataInputStream.readByte() >= 2;
                        H = (dataInputStream.readBoolean() ? 1 : 0) * 160;
                        Code((InputStream) dataInputStream, 14L);
                        int readUnsignedByte2 = dataInputStream.readUnsignedByte();
                        boolean z3 = bn;
                        if (readUnsignedByte2 >= 59) {
                            z2 = false;
                        }
                        bn = z2 | z3;
                        if (readUnsignedByte2 == 58) {
                            readUnsignedByte2 = 59;
                        }
                        if (readUnsignedByte2 != 59) {
                            Code(dataInputStream, Integer.MAX_VALUE);
                        } else {
                            aq = dataInputStream.readBoolean();
                            l = dataInputStream.readInt();
                            ap = dataInputStream.readBoolean();
                            az = dataInputStream.readBoolean();
                            av = dataInputStream.readBoolean();
                            aw = dataInputStream.readBoolean();
                            o = dataInputStream.readInt();
                            p = dataInputStream.readInt();
                            int readInt = dataInputStream.readInt();
                            i = readInt;
                            if (readInt < j) {
                                ah = true;
                            }
                            k = dataInputStream.readInt();
                            f257I = dataInputStream.readLong();
                            f227B = dataInputStream.readLong();
                            f342q = dataInputStream.readUTF();
                            q = dataInputStream.readInt();
                            q = 0;
                            aM = dataInputStream.readInt();
                            m = dataInputStream.readInt();
                            dataInputStream.readBoolean();
                            byte readByte = dataInputStream.readByte();
                            r = dataInputStream.readInt();
                            if (readByte == 2) {
                                aB = dataInputStream.readBoolean();
                                f325i = dataInputStream.readUTF();
                            } else {
                                dataInputStream.readBoolean();
                                dataInputStream.readUTF();
                            }
                            ao = dataInputStream.readBoolean();
                            int readByte2 = dataInputStream.readByte() - 2;
                            ae = ((readByte2 | (-readByte2)) >>> 31) ^ 1;
                            dataInputStream.readByte();
                            dataInputStream.readBoolean();
                            Code(dataInputStream, 8);
                            dataInputStream.readLong();
                            dataInputStream.readLong();
                            Code(dataInputStream, (long) dataInputStream.readUnsignedByte());
                            Code(dataInputStream, (long) (dataInputStream.readUnsignedShort() << 2));
                            Code(dataInputStream, (long) (dataInputStream.readUnsignedShort() << 2));
                            bm = dataInputStream.readBoolean();
                            ar = dataInputStream.readBoolean();
                            ax = dataInputStream.readBoolean();
                            f273K = dataInputStream.readBoolean();
                            M = dataInputStream.readBoolean();
                            f274L = dataInputStream.readBoolean();
                            Code.f111J = dataInputStream.readUTF();
                            Code.f88Code = dataInputStream.readInt();
                            Code.I = dataInputStream.readInt();
                            Code.f85B = dataInputStream.readBoolean();
                            Code.f120Z = dataInputStream.readBoolean();
                            Code.f117Z = dataInputStream.readUTF();
                            Code.f102I = dataInputStream.readUTF();
                            Code.J = dataInputStream.readUnsignedByte();
                            dataInputStream.readBoolean();
                            dataInputStream.readBoolean();
                            byte readByte3 = dataInputStream.readByte();
                            for (int i2 = 0; i2 < readByte3; i2++) {
                                Code.f93Code.addElement(dataInputStream.readUTF());
                            }
                            dataInputStream.readBoolean();
                            dataInputStream.readBoolean();
                            dataInputStream.readBoolean();
                            dataInputStream.readBoolean();
                            f = dataInputStream.readInt();
                            f340p = dataInputStream.readUTF();
                            dataInputStream.readBoolean();
                            byte readByte4 = dataInputStream.readByte();
                            for (int i3 = 0; i3 < readByte4; i3++) {
                                byte[] bArr2 = new byte[dataInputStream.readShort()];
                                dataInputStream.readFully(bArr2);
                                f287a.addElement(new Object[]{dataInputStream.readUTF(), dataInputStream.readUTF(), bArr2});
                            }
                            dataInputStream.readBoolean();
                            dataInputStream.readBoolean();
                            s = dataInputStream.readInt();
                            f328j = dataInputStream.readUTF();
                            ay = dataInputStream.readByte() & 1;
                            t = dataInputStream.readInt();
                            f261I = Code(dataInputStream);
                            dataInputStream.readInt();
                            dataInputStream.readBoolean();
                            int readUnsignedByte3 = dataInputStream.readUnsignedByte();
                            for (int i4 = 0; i4 < readUnsignedByte3; i4++) {
                                dataInputStream.readUTF();
                                dataInputStream.readUTF();
                                dataInputStream.readUTF();
                                dataInputStream.readUnsignedShort();
                                dataInputStream.readUnsignedShort();
                            }
                            int readByte5 = dataInputStream.readByte() - 1;
                            aD = ((readByte5 | (-readByte5)) >>> 31) ^ 1;
                            A = dataInputStream.readInt();
                            f230B = Code(dataInputStream);
                            Z(dataInputStream);
                            I(dataInputStream);
                            dataInputStream.readInt();
                            au = dataInputStream.readBoolean();
                            z = dataInputStream.readInt();
                            bp = dataInputStream.readBoolean();
                            u = dataInputStream.readInt();
                            v = dataInputStream.readInt();
                            int readByte6 = dataInputStream.readByte() & 255;
                            byte[] bArr3 = new byte[((readByte6 << 2) + 1)];
                            bArr3[0] = (byte) readByte6;
                            dataInputStream.readFully(bArr3, 1, readByte6 << 2);
                            Code.f121Z = bArr3;
                            w = dataInputStream.readInt();
                            m145Code(dataInputStream);
                            aG = dataInputStream.readBoolean();
                            f310d = dataInputStream.readLong();
                            long readLong = dataInputStream.readLong();
                            C = readLong;
                            f298b = readLong;
                            long readLong2 = dataInputStream.readLong();
                            f285a = readLong2;
                            f305c = readLong2;
                            f317g = dataInputStream.readLong();
                            x = dataInputStream.readInt();
                            y = dataInputStream.readInt();
                            Code.m = dataInputStream.readInt();
                        }
                    }
                }
            } catch (Throwable th) {
            }
        }
    }

    /* renamed from: m  reason: collision with other method in class */
    private static synchronized boolean m215m() {
        boolean z2 = false;
        synchronized (e.class) {
            if (a != 0) {
                T();
                C(false);
                z2 = true;
            }
        }
        return z2;
    }

    static void n() {
        boolean z2;
        int i2;
        f282Z = Code(true, "b1", 0);
        f269J = Code(true, "sp", 0);
        f234C = Code(true, "u", 0);
        if (f282Z == null) {
            f282Z = new Vector();
        }
        if (f269J == null) {
            f269J = new Vector();
            z2 = true;
        } else {
            z2 = false;
        }
        while (f269J.size() < 9) {
            Object[] Code2 = m174Code();
            Code2[5] = new Integer(83);
            f269J.addElement(Code2);
        }
        if (f234C == null) {
            f234C = Code(false, (String) null, 67);
        } else if (bn) {
            Vector Code3 = Code(false, (String) null, 67);
            if (Code3.size() > 0) {
                f234C.setElementAt(Code3.elementAt(0), 0);
                x = 0;
            }
            Code(f234C, false);
        }
        if (!bm) {
            Vector Code4 = Code(false, (String) null, 66);
            int i3 = 0;
            int i4 = 0;
            while (i3 < Code4.size()) {
                Object[] objArr = (Object[]) Code4.elementAt(i3);
                if (I((String) objArr[0]) == -1 && !Code(objArr, f282Z)) {
                    if (!m160Code(objArr, 1)) {
                        f282Z.addElement(objArr);
                    } else if (z2) {
                        i2 = i4 + 1;
                        f269J.setElementAt(objArr, i4);
                        i3++;
                        i4 = i2;
                    }
                }
                i2 = i4;
                i3++;
                i4 = i2;
            }
            Code(f282Z, true);
            Code(f269J, true);
        }
        bm = true;
        o();
        Code.f89Code.Code(f282Z);
        Code.f89Code.Code(f269J);
        Code.f89Code.Code(f234C);
    }

    /* renamed from: n  reason: collision with other method in class */
    private boolean m216n() {
        do {
            int i2 = this.f399T;
            this.f399T = i2 - 1;
            if (i2 <= 0) {
                return false;
            }
            byte[] bArr = this.f406Z;
            int i3 = this.f429aa;
            this.f429aa = i3 + 1;
            byte[] bArr2 = this.f406Z;
            int i4 = this.f436ah;
            this.f436ah = i4 + 1;
            bArr[i3] = bArr2[i4];
            if (this.f436ah == this.f434af) {
                this.f436ah = 0;
            }
        } while (this.f432ad != this.f429aa);
        return true;
    }

    static void o() {
        if (aD) {
            f230B.removeAllElements();
            return;
        }
        for (int i2 = 0; i2 < f230B.size(); i2++) {
            Object[] objArr = (Object[]) f230B.elementAt(i2);
            objArr[3] = Code(objArr, f269J) ? new Object() : null;
        }
    }

    /* renamed from: o  reason: collision with other method in class */
    private boolean m217o() {
        if (this.f399T > 0 && m216n()) {
            return true;
        }
        do {
            int Code2 = Code(this.f379Code);
            if (Code2 == 256) {
                return false;
            }
            if (Code2 > 256) {
                int i2 = Code2 - 257;
                this.f399T = f291a[i2];
                if (i2 > 7 && i2 != 28) {
                    this.f399T = d((i2 / 4) - 1) + this.f399T;
                }
                int Code3 = Code(this.f387I);
                int i3 = f302b[Code3];
                if (Code3 > 3) {
                    i3 += d((Code3 / 2) - 1);
                }
                this.f436ah = this.f429aa - i3;
                if (this.f436ah < 0) {
                    this.f436ah = this.f434af + this.f436ah;
                }
                if (m216n()) {
                    return true;
                }
            } else {
                byte[] bArr = this.f406Z;
                int i4 = this.f429aa;
                this.f429aa = i4 + 1;
                bArr[i4] = (byte) Code2;
            }
        } while (this.f432ad != this.f429aa);
        return true;
    }

    static void p() {
        String Code2 = m122Code(215);
        Vector vector = new Vector();
        int length = Code2.length();
        boolean z2 = false;
        int i2 = 0;
        while (!z2 && i2 < length - 1) {
            int indexOf = Code2.indexOf(44, i2);
            if (indexOf == -1 || indexOf >= length) {
                z2 = true;
            } else {
                vector.addElement(Code2.substring(i2, indexOf));
                i2 = indexOf + 1;
            }
        }
        int size = vector.size();
        if (size > 0) {
            f247Code = new String[size];
            for (int i3 = 0; i3 < size; i3++) {
                f247Code[i3] = (String) vector.elementAt(i3);
            }
        }
    }

    static void q() {
        if (f260I != null && f281Z == null) {
            f281Z = new Hashtable();
            f268J = new Hashtable();
            Enumeration keys = f260I.keys();
            while (keys.hasMoreElements()) {
                Object nextElement = keys.nextElement();
                Object obj = f260I.get(nextElement);
                f281Z.put(nextElement, obj);
                f268J.put(obj, nextElement);
            }
        }
    }

    static void r() {
        try {
            byte[] bArr = (byte[]) m131Code("sh").firstElement();
            if (bArr != null) {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
                int readUnsignedByte = dataInputStream.readUnsignedByte();
                bn = (readUnsignedByte < 2) | bn;
                byte readByte = dataInputStream.readByte();
                for (int i2 = 0; i2 < readByte; i2++) {
                    f260I.put(dataInputStream.readUTF(), new Integer(dataInputStream.readInt()));
                }
                if (readUnsignedByte < 2) {
                    m147Code(f260I);
                }
            }
        } catch (Throwable th) {
        }
    }

    static void s() {
        byte[] bArr = f244Code;
        int I2 = I(0);
        f301b[I(0)] = Byte.MIN_VALUE;
        bArr[I2] = Byte.MIN_VALUE;
        byte[] bArr2 = f244Code;
        int I3 = I(1);
        f301b[I(1)] = Byte.MIN_VALUE;
        bArr2[I3] = Byte.MIN_VALUE;
        for (int i2 = 0; i2 <= 14; i2++) {
            I(I(0), Code.f100Code[i2].getLabel());
            I(I(1), Code.f100Code[i2].getLabel());
        }
        for (int i3 = 20; i3 <= 23; i3++) {
            I(I(0), m122Code(i3));
            I(I(1), m122Code(i3));
        }
        f244Code[6] = f301b[I(0)];
        f244Code[7] = f301b[I(1)];
        f301b[6] = f301b[I(0)];
        f301b[7] = f301b[I(1)];
        for (int i4 = 0; i4 < 6; i4++) {
            byte[] bArr3 = f244Code;
            f301b[i4] = Byte.MIN_VALUE;
            bArr3[i4] = Byte.MIN_VALUE;
            I(i4, "Å认千I[jg");
        }
        byte[] bArr4 = f244Code;
        bArr4[6] = (byte) (bArr4[6] - f301b[I(0)]);
        byte[] bArr5 = f244Code;
        bArr5[7] = (byte) (bArr5[7] - f301b[I(1)]);
        byte[] bArr6 = f301b;
        bArr6[6] = (byte) (bArr6[6] - f301b[I(0)]);
        byte[] bArr7 = f301b;
        bArr7[7] = (byte) (bArr7[7] - f301b[I(1)]);
    }

    static void t() {
        if (f331k) {
            f229B = new Hashtable(20);
            f284Z = new Object[20];
            if (f315f != null) {
                f315f.removeAllElements();
                f315f.setSize(23);
                return;
            }
            return;
        }
        f229B = null;
        f284Z = null;
        f315f = null;
    }

    static void u() {
        m191J((int) System.currentTimeMillis());
    }

    private void v() {
        this.f365Code = 0;
        this.f400U = 0;
        for (int i2 = 0; i2 < this.f385I.length; i2++) {
            this.f385I[i2] = 0;
        }
        this.f401V = 0;
        for (int i3 = 0; i3 < this.f391J.length; i3++) {
            this.f391J[i3] = 0;
        }
        this.f392M = 1779033703;
        this.f393N = -1150833019;
        this.f394O = 1013904242;
        this.f395P = -1521486534;
        this.f396Q = 1359893119;
        this.f397R = -1694144372;
        this.f398S = 528734635;
        this.f399T = 1541459225;
    }

    private void w() {
        for (int i2 = 16; i2 <= 63; i2++) {
            int[] iArr = this.f391J;
            int i3 = this.f391J[i2 - 2];
            int i4 = ((i3 >>> 10) ^ (((i3 >>> 17) | (i3 << 15)) ^ ((i3 >>> 19) | (i3 << 13)))) + this.f391J[i2 - 7];
            int i5 = this.f391J[i2 - 15];
            iArr[i2] = i4 + ((i5 >>> 3) ^ (((i5 >>> 7) | (i5 << 25)) ^ ((i5 >>> 18) | (i5 << 14)))) + this.f391J[i2 - 16];
        }
        int i6 = this.f392M;
        int i7 = this.f393N;
        int i8 = this.f394O;
        int i9 = this.f395P;
        int i10 = this.f396Q;
        int i11 = this.f397R;
        int i12 = this.f398S;
        int i13 = this.f399T;
        int i14 = 0;
        for (int i15 = 0; i15 < 8; i15++) {
            int i16 = i14 + 1;
            int I2 = this.f391J[i14] + I(i10, i11, i12) + f283Z[i14] + i13;
            int i17 = i9 + I2;
            int Z2 = I2 + Z(i6, i7, i8);
            int i18 = i16 + 1;
            int I3 = i12 + I(i17, i10, i11) + f283Z[i16] + this.f391J[i16];
            int i19 = i8 + I3;
            int Z3 = I3 + Z(Z2, i6, i7);
            int i20 = i18 + 1;
            int I4 = i11 + I(i19, i17, i10) + f283Z[i18] + this.f391J[i18];
            int i21 = i7 + I4;
            int Z4 = I4 + Z(Z3, Z2, i6);
            int i22 = i20 + 1;
            int I5 = i10 + I(i21, i19, i17) + f283Z[i20] + this.f391J[i20];
            int i23 = i6 + I5;
            int Z5 = I5 + Z(Z4, Z3, Z2);
            int i24 = i22 + 1;
            int I6 = I(i23, i21, i19) + f283Z[i22] + this.f391J[i22] + i17;
            i13 = Z2 + I6;
            i9 = I6 + Z(Z5, Z4, Z3);
            int i25 = i24 + 1;
            int I7 = I(i13, i23, i21) + f283Z[i24] + this.f391J[i24] + i19;
            i12 = Z3 + I7;
            i8 = Z(i9, Z5, Z4) + I7;
            int i26 = i25 + 1;
            int I8 = I(i12, i13, i23) + f283Z[i25] + this.f391J[i25] + i21;
            i11 = Z4 + I8;
            i7 = Z(i8, i9, Z5) + I8;
            i14 = i26 + 1;
            int I9 = i23 + f283Z[i26] + I(i11, i12, i13) + this.f391J[i26];
            i10 = Z5 + I9;
            i6 = I9 + Z(i7, i8, i9);
        }
        this.f392M += i6;
        this.f393N += i7;
        this.f394O += i8;
        this.f395P += i9;
        this.f396Q += i10;
        this.f397R += i11;
        this.f398S += i12;
        this.f399T += i13;
        this.f401V = 0;
        for (int i27 = 0; i27 < 16; i27++) {
            this.f391J[i27] = 0;
        }
    }

    private synchronized void x() {
        this.f363C = null;
        this.f359B = null;
        this.f385I = null;
        System.arraycopy(this.f358B, 0, this.f390J, 0, 8);
    }

    private synchronized void y() {
        synchronized (this) {
            if (m205d() || this.f363C == null) {
                x();
            } else {
                if (this.f359B != null) {
                    e eVar = new e((byte) 0);
                    byte[] Code2 = Code(m173Code(this.f359B, this.f391J));
                    if (Code2[0] == 0 && Code2[1] == 1 && Code2[(Code2.length - 32) - 1] == 0) {
                        int i2 = 2;
                        while (true) {
                            if (i2 >= (Code2.length - 32) - 2) {
                                eVar.m114B((int) (this.f366Code >> 32));
                                eVar.m114B((int) this.f366Code);
                                eVar.m151Code(Code(this.f363C), 0, this.f363C.length << 2);
                                eVar.m149Code(Code2);
                                for (int i3 = 0; i3 < 32; i3++) {
                                    if (Code2[i3] != Code2[(Code2.length + i3) - 32]) {
                                        x();
                                        break;
                                    }
                                }
                                this.f359B = null;
                                if (f264I[1] != null) {
                                    C(false);
                                }
                            } else if (Code2[i2] != -1) {
                                x();
                                break;
                            } else {
                                i2++;
                            }
                        }
                    } else {
                        x();
                    }
                }
                if (this.f385I == null) {
                    e Code3 = Code(this.f358B);
                    byte[] bArr = new byte[(this.f363C.length << 2)];
                    for (int i4 = 2; i4 < bArr.length - 32; i4++) {
                        while (bArr[i4] == 0) {
                            Code3.m192J(bArr, i4);
                        }
                    }
                    bArr[0] = 0;
                    bArr[1] = 2;
                    bArr[(bArr.length - 32) - 1] = 0;
                    Code3.m192J(bArr, bArr.length - 32);
                    this.f403Z.m186I(bArr, bArr.length - 32);
                    Code3.m186I(bArr, bArr.length - 32);
                    this.f385I = Code(m173Code(m171Code(bArr, 0, bArr.length), this.f363C));
                    this.f401V = 0;
                }
            }
        }
    }

    private void z() {
        if (this.f407Z[this.f364Code].indexOf("10.0.0.172") != -1) {
            aH = true;
        } else {
            aH = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final int B() {
        String I2 = this.f367Code.m46I();
        if (m188I(I2, "bookmark:") || m188I(I2, "speeddial:") || m188I(I2, "search:") || m188I(I2, "open:")) {
            return Code(I2);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B  reason: collision with other method in class */
    public final void m218B() {
        if (this.f435ag == 0 && !m231Code(16)) {
            this.f367Code.m67f();
        }
    }

    /* access modifiers changed from: package-private */
    public final void B(boolean z2) {
        if (this.f428aV != z2) {
            this.f428aV = z2;
            if (!m231Code(1)) {
                return;
            }
            if (z2) {
                K();
                this.f420aN = true;
                if (this.f466e && this.f367Code == null) {
                    m229Code(m180I(169), (String) null, (String) null);
                    if (this.f378Code != null && this.f378Code[1] != null) {
                        this.f367Code.f32I = (String) this.f378Code[1];
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.f376Code != null) {
                f270J = this.f376Code;
                this.f376Code = null;
            }
            m238I(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B  reason: collision with other method in class */
    public final boolean m219B() {
        return m235I() != this.f398S;
    }

    /* access modifiers changed from: package-private */
    public final int C() {
        return Code(this.f367Code.e(), 0, this.f401V - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C  reason: collision with other method in class */
    public final void m220C() {
        if (m231Code(16)) {
            if (bh) {
                Code.B = 36;
                Code.C = 10;
            } else {
                Code.B = 25;
                if (this.f441am > 0 && this.f445aq > 0) {
                    Code.C = 26;
                }
            }
            Code.a = 23;
            return;
        }
        Code.B = 0;
        Code.C = ((m240I(-1) ? 1 : 0) * -19) + 23;
        Code.a = 23;
        if (this.f367Code != null) {
            if (this.f367Code.m26B()) {
                Code.a = 27;
            } else if (this.f367Code.m29C()) {
                Code.a = 29;
            } else if (this.f367Code.m62b() && !aE) {
                Code.a = 29;
            }
            if (this.f367Code.m54J()) {
                if (ax) {
                    Code.C = 12;
                } else if (this.f399T > 0 && ((Object[]) this.f374Code.elementAt(this.f399T - 1))[8] == this.f367Code) {
                    Code.C = 4;
                }
            }
            if (m180I(60).equals(this.f367Code.f21Code)) {
                String Z2 = this.f367Code.m55Z();
                if (m188I(Z2, "cwd:") || m188I(Z2, "get:")) {
                    this.f367Code.f14Code = 1;
                } else if (m188I(Z2, "put:")) {
                    this.f367Code.f14Code = 7;
                }
            }
            if (this.f367Code.f14Code >= 0) {
                Code.B = this.f367Code.f14Code;
            }
            if (this.f367Code.f29I >= 0) {
                Code.C = this.f367Code.f29I;
            }
            if (this.f367Code.f3B >= 0) {
                Code.a = this.f367Code.f3B;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C  reason: collision with other method in class */
    public final boolean m221C() {
        return this.f401V != this.f397R;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final int m222Code() {
        return this.f401V;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final B m223Code() {
        return (this.f367Code == null || this.f367Code.f8C > 4) ? this.f380I : this.f367Code;
    }

    /* renamed from: Code  reason: collision with other method in class */
    public final e m224Code() {
        return this.f361C;
    }

    /* renamed from: Code  reason: collision with other method in class */
    public final String m225Code() {
        return new StringBuffer().append(this.f460d).append(this.f372Code.substring(0, 8)).toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final void m226Code(int i2, int i3) {
        Vector Code2;
        if (m231Code(16)) {
            b(i2, i3);
        } else if (this.f367Code == null) {
        } else {
            if (!m231Code(2) || i2 <= 48 || i2 > 57) {
                if (!m248a() || i2 < 48 || i2 > 57) {
                    this.f367Code.g();
                    int h2 = this.f367Code.h();
                    switch (i2) {
                        case -10:
                            this.f367Code.Code(0, h2, true, true);
                            return;
                        case -9:
                            this.f367Code.Code(0, -h2, true, true);
                            return;
                        case -5:
                            this.f367Code.m64c();
                            return;
                        case 1:
                            this.f367Code.m38Code(0, -1, i3);
                            return;
                        case 2:
                            if (m231Code(2)) {
                                Code.f89Code.I(this);
                                return;
                            } else {
                                this.f367Code.m38Code(-1, 0, i3);
                                return;
                            }
                        case 5:
                            if (m231Code(2)) {
                                this.f367Code.m61b();
                                return;
                            } else {
                                this.f367Code.m38Code(1, 0, i3);
                                return;
                            }
                        case 6:
                            this.f367Code.m38Code(0, 1, i3);
                            return;
                        default:
                            return;
                    }
                } else if (!Code.a() && !this.f426aT) {
                    if (i2 >= 48 && i2 <= 57) {
                        int i4 = i2 - 48;
                        int size = (this.f367Code == null || (Code2 = this.f367Code.m33Code()) == null) ? 0 : Code2.size();
                        int b2 = b(size);
                        if (this.f415aG >= 0) {
                            int i5 = i4 + (this.f415aG * 10);
                            if (i5 - b2 < size) {
                                this.f415aG = i5;
                                if (this.f415aG - b2 >= size) {
                                    Z(false);
                                }
                                if (i5 - b2 >= 0) {
                                    this.f426aT = true;
                                    return;
                                }
                                return;
                            }
                            return;
                        } else if (i4 != 0) {
                            this.f415aG = i4;
                            int i6 = this.f415aG - b2;
                            if (i6 >= size) {
                                Z(false);
                            }
                            if (i6 < size && i6 >= 0) {
                                this.f426aT = true;
                                return;
                            }
                            return;
                        }
                    }
                    Z(false);
                }
            } else if (this.f367Code.m42Code((i2 - 48) - 1)) {
                this.f367Code.B(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void Code(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9 = this.f400U + i2;
        int i10 = this.f393N + i3;
        if (M) {
            i6 = (Code.f - i10) - i5;
            i10 = i9;
            i7 = i5;
            i8 = i4;
        } else {
            i6 = i9;
            i7 = i4;
            i8 = i5;
        }
        if (R) {
            I.Code(i6, i10, i7, i8);
        } else {
            Code.f89Code.repaint(i6, i10, i7, i8);
        }
    }

    /* access modifiers changed from: package-private */
    public final void Code(int i2, int i3, String str) {
        Object[] I2 = this.f367Code.m50I();
        int indexOf = ((String) I2[0]).indexOf(35);
        if (indexOf >= 0) {
            I2[0] = ((String) I2[0]).substring(0, indexOf);
        }
        I2[0] = new StringBuffer().append(I2[0]).append("#").append(str).toString();
        int[] iArr = (int[]) I2[7];
        iArr[2] = iArr[2] + (i2 - iArr[0]);
        iArr[3] = iArr[3] + (i3 - iArr[1]);
        iArr[0] = i2;
        iArr[1] = i3;
        Code(I2, (String) null, false, false, false, false, (Hashtable) null);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void Code(B b2) {
        String str;
        if (b2 == this.f367Code || b2 == this.f380I || b2.f59c || b2.f61d) {
            switch (b2.f8C) {
                case 1:
                    Code.f89Code.m100c();
                    break;
                case 2:
                    Code.f89Code.m99b();
                    break;
                case 4:
                    Code(this.f380I, false);
                    this.f380I = null;
                    if (!b2.f59c && !b2.f61d) {
                        R();
                        break;
                    }
                case 5:
                case 6:
                case 7:
                    boolean z2 = this.f380I == null;
                    this.f380I = null;
                    if (!b2.m49I()) {
                        Code.f89Code.m101d();
                    }
                    if (!bo && !b2.m49I() && !b2.f12C && !b2.f62e && !"server:setup".equals(b2.f21Code)) {
                        String Z2 = m194Z(1);
                        if (Z2 == null || Z2 == "") {
                            str = "0";
                        } else {
                            byte[] bytes = Z2.getBytes();
                            e eVar = new e((byte) 0);
                            eVar.m151Code(bytes, 0, bytes.length);
                            byte[] bArr = new byte[32];
                            eVar.m149Code(bArr);
                            str = m183I(bArr, bArr.length);
                        }
                        if (!bo && str != null && !str.equals("0")) {
                            String appProperty = Browser.browser.getAppProperty("Ping-CID");
                            String appProperty2 = Browser.browser.getAppProperty("OM-Campaign");
                            StringBuffer stringBuffer = new StringBuffer("http://union.oupeng.com/stat.php?");
                            stringBuffer.append(new StringBuffer().append("act=").append(bp ? "0" : "1").toString());
                            StringBuffer append = new StringBuffer().append("&f=");
                            if (appProperty == null) {
                                appProperty = "0";
                            }
                            stringBuffer.append(append.append(appProperty).toString());
                            stringBuffer.append(new StringBuffer().append("&uid=").append(str).toString());
                            stringBuffer.append(new StringBuffer().append("&platform=").append("j2me").toString());
                            stringBuffer.append("&version=4.6.32741");
                            StringBuffer append2 = new StringBuffer().append("&campaign=");
                            if (appProperty2 == null) {
                                appProperty2 = "0";
                            }
                            stringBuffer.append(append2.append(appProperty2).toString());
                            Object[] objArr = new Object[11];
                            objArr[0] = stringBuffer.toString();
                            B b3 = new B(this);
                            b3.f61d = true;
                            b3.m40Code(objArr);
                            Code((Runnable) b3);
                            bo = true;
                            if (!bp) {
                                bp = true;
                                C(false);
                            }
                        }
                    }
                    if (b2.f8C == 5 && m231Code(1)) {
                        if (b2.f59c && !at) {
                            at = true;
                            this.f420aN = true;
                            a();
                            break;
                        } else if (at) {
                            at = false;
                        }
                    }
                    a();
                    if (bg) {
                        Code.f89Code.f150Code.schedule(new I(12), 4000);
                    }
                    if (b2.f8C == 5 && !this.f419aL && b2.m60a()) {
                        synchronized (this.f367Code) {
                            this.f475r = b2.m51J();
                            if (!at && this.f475r != null) {
                                Object[] objArr2 = new Object[11];
                                objArr2[0] = this.f475r;
                                this.f402Z = new B(this);
                                this.f402Z.f59c = true;
                                this.f402Z.m40Code(objArr2);
                                at = false;
                                Code((Runnable) this.f402Z);
                            }
                        }
                    }
                    if (this.f462d) {
                        if (!z2) {
                            if (this == Code.m79I()) {
                                this.f462d = false;
                                if (this.f367Code != null) {
                                    Code(true, false, (Hashtable) null);
                                    break;
                                }
                            }
                        } else {
                            this.f462d = false;
                            break;
                        }
                    }
                    break;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final synchronized void m227Code(g gVar) {
        if (m210h()) {
            Code(false, 2);
            if (gVar.m270Z()) {
                throw new IOException();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final void m228Code(String str) {
        this.f373Code = new StringBuffer(str);
        J(true);
        this.f441am = this.f373Code.length();
        m253f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final synchronized void m229Code(String str, String str2, String str3) {
        Code(str, str2, str3, (Hashtable) null);
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [char, int] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0a60, code lost:
        if (r0.length() != 0) goto L_0x0a62;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void Code(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.util.Hashtable r14) {
        /*
        // Method dump skipped, instructions count: 3012
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.Code(java.lang.String, java.lang.String, java.lang.String, java.util.Hashtable):void");
    }

    /* access modifiers changed from: package-private */
    public final void Code(String str, Hashtable hashtable) {
        if (this.f367Code != null) {
            N();
            Code((Object[]) null, this.f367Code.f40J, false, true, hashtable, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final void m230Code(Vector vector, int i2) {
        int B2 = B();
        if (vector == f282Z) {
            Object[] objArr = (Object[]) f282Z.elementAt(B2);
            if (Code(objArr, 5) != 97) {
                objArr[5] = new Integer(77);
                objArr[6] = new Integer(Code(objArr, 6) | 2);
            }
            Code(vector, B2, B2 + i2);
            if (Code.f90Code != null) {
                Code.f90Code.f186Code = System.currentTimeMillis() + 10000;
            } else if (Code.f88Code != Code.I) {
                I.I();
            }
        } else {
            Code(vector, B2, B2 + i2);
        }
        m226Code(i2 > 0 ? 6 : 1, 0);
        this.f357B = true;
        Code(true, false, (Hashtable) null);
        Code.f89Code.Code(vector);
    }

    /* access modifiers changed from: package-private */
    public final void Code(Graphics graphics) {
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        int Z2;
        if (this.f365Code == 2) {
            J(graphics);
        }
        if (m231Code(32) && this.f367Code != null && I(this.f367Code.f21Code) == 165) {
            int B2 = B(1);
            int i5 = B2 + 10;
            int i6 = (this.f393N - i5) - 1;
            I(graphics, this.f400U, i6, this.f397R, i5 + 1);
            if (graphics.getClipWidth() > 0) {
                String Code2 = m122Code(256);
                I(graphics, this.f400U, i6, this.f397R, i5, Code.f98Code[73], Code.f98Code[74]);
                graphics.setColor(Code.f98Code[34]);
                Code(graphics, 1, Code2, (this.f397R - Code(1, Code2)) / 2, i6 + ((i5 - B2) / 2), 20);
                graphics.setColor(Code.f98Code[75]);
                graphics.fillRect(this.f400U, i6 + i5, this.f397R, 1);
            }
            if (z > 0) {
                Code(graphics, this.f400U, i6, this.f397R, i5 + 1, f245Code[z - 1], false);
            }
            Z(graphics);
        }
        if (this.f365Code == 16) {
            int i7 = this.f393N + this.f396Q;
            if (this.f368Code == null) {
                this.f368Code = new I(33);
                this.f368Code.f189Code = this;
                Code.f89Code.f150Code.schedule(this.f368Code, 100, 100);
            }
            if (this.f369Code.f367Code == null || I(this.f369Code.f367Code.f21Code) == 65) {
                Code(graphics, this.f400U, i7, this.f397R, this.f411aC + 9, f262I[61]);
            } else {
                Code(graphics, this.f400U, i7, this.f397R, this.f411aC + 10, f262I[59], f262I[60]);
                if (Code.f89Code.f157I != null) {
                    I(graphics, this.f400U, i7, this.f397R, this.f398S);
                    graphics.drawImage(Code.f89Code.f157I, this.f400U, this.f411aC + i7 + 9, 0);
                    Z(graphics);
                }
            }
            Code(graphics, this.f400U + 3, i7 + 5, this.f451aw + 4, this.f411aC, f262I[16]);
            graphics.setColor(f262I[7]);
            graphics.drawLine(this.f400U + 4, i7 + 5, this.f400U + 5 + this.f451aw, i7 + 5);
            graphics.drawLine(this.f400U + 4, i7 + 4 + this.f411aC, this.f400U + 5 + this.f451aw, i7 + 4 + this.f411aC);
            graphics.drawLine(this.f400U + 3, i7 + 5, this.f400U + 3, i7 + 4 + this.f411aC);
            graphics.drawLine(this.f400U + 6 + this.f451aw, i7 + 5, this.f400U + 6 + this.f451aw, i7 + 4 + this.f411aC);
            graphics.setColor(f262I[4]);
            graphics.drawLine(this.f400U + 4, i7 + 6, this.f400U + 3 + this.f451aw + 2, i7 + 6);
            graphics.setColor(f262I[5]);
            graphics.drawLine(this.f400U + 4, i7 + 7, this.f400U + 3 + this.f451aw + 2, i7 + 7);
            graphics.setColor(f262I[6]);
            graphics.drawLine(this.f400U + 4, i7 + 8, this.f400U + 3 + this.f451aw + 2, i7 + 8);
            int max = Math.max(0, ((this.f411aC - this.f383I.getHeight()) / 2) + 1);
            int width = (this.f404Z.getWidth() - this.f383I.getWidth()) / 2;
            if (this.f423aQ) {
                if (this.f383I == this.f404Z) {
                    graphics.drawImage(this.f383I, this.f400U + 6, max + i7 + 5, 20);
                } else {
                    graphics.drawImage(this.f383I, width + this.f400U + 6, max + i7 + 5, 20);
                }
            }
            if (this.f440al != -1) {
                graphics.setColor(f262I[62]);
                graphics.fillRect(this.f400U + 3 + this.f452ax + this.f442an + this.f447as, i7 + 8, this.f446ar + 2, this.f409aA);
                char[] cArr = {(char) this.f440al};
                graphics.setColor(-16777216);
                Code(graphics, 0, cArr, 0, 1, this.f447as + this.f400U + 4 + this.f452ax + this.f442an, i7 + 8);
                this.f445aq += this.f446ar;
            } else if (!this.f405Z && !this.f421aO && this.f437ai == -1) {
                graphics.setColor(f262I[63]);
                graphics.drawLine(this.f400U + 4 + this.f452ax + this.f442an + this.f447as, i7 + 8, this.f400U + 4 + this.f452ax + this.f442an + this.f447as, i7 + 7 + this.f409aA);
            }
            I(graphics, this.f400U + 4 + this.f452ax, i7 + 6, (this.f451aw - this.f452ax) + 2, this.f410aB + 2);
            graphics.setColor(-16777216);
            if (this.f446ar <= 0 || this.f441am >= this.f377Code.length) {
                if (this.f421aO) {
                    Code(graphics, this.f442an + this.f400U + 4 + this.f452ax, i7 + 8, this.f445aq, this.f409aA + 1, f262I[64]);
                    graphics.setColor(-16777216);
                }
                Code(graphics, 0, this.f377Code, 0, this.f377Code.length, this.f442an + this.f400U + 4 + this.f452ax, i7 + 8);
            } else {
                Code(graphics, 0, this.f377Code, 0, this.f441am, this.f442an + this.f400U + 4 + this.f452ax, i7 + 8);
                Code(graphics, 0, this.f377Code, this.f441am, this.f377Code.length - this.f441am, this.f446ar + this.f400U + 4 + this.f452ax + this.f442an + this.f447as, i7 + 8);
            }
            if (this.f440al == -1 && this.f437ai >= 0 && this.f437ai < this.f458c.size() - 2 && (Z2 = Z((str2 = (String) this.f458c.elementAt(this.f437ai)), this.f476u)) != -1) {
                Code(graphics, this.f445aq + this.f400U + 4 + this.f452ax + this.f442an, i7 + 8, Code(0, str2.substring(this.f373Code.length() + Z2)), this.f409aA + 1, f262I[64]);
                graphics.setColor(-16777216);
                Code(graphics, 0, str2.substring(this.f373Code.length() + Z2), this.f445aq + this.f400U + 4 + this.f452ax + this.f442an, i7 + 8, 20);
            }
            Z(graphics);
            Code(graphics, this.f400U, i7, this.f397R, this.f411aC + 9);
            if (this.f458c.size() > 0) {
                Code(graphics, this.f400U + 3, this.f454az + i7 + 1, this.f397R - 7, this.f450av - 1, f262I[16]);
                graphics.setColor(f262I[7]);
                graphics.drawRect(this.f400U + 3, this.f454az + i7, this.f397R - 7, this.f450av);
                if (f346s) {
                    int i8 = this.f400U + 3;
                    int i9 = i7 + this.f454az;
                    int i10 = (this.f400U + this.f397R) - 3;
                    int i11 = this.f450av + i9 + 1;
                    graphics.drawImage(Code.f134e, i10, i9, 0);
                    for (int i12 = i9 + 4; i12 < i11; i12++) {
                        graphics.drawImage(Code.f136f, i10, i12, 0);
                    }
                    graphics.drawImage(Code.f137g, i10, i11, 0);
                    for (int i13 = i8; i13 < i10; i13++) {
                        graphics.drawImage(Code.f138h, i13, i11, 0);
                    }
                    graphics.drawImage(Code.f140i, i8 - 4, i11, 0);
                    for (int i14 = i9 + 4; i14 < i11; i14++) {
                        graphics.drawImage(Code.f141j, i8 - 4, i14, 0);
                    }
                    graphics.drawImage(Code.f142k, i8 - 4, i9, 0);
                }
                int i15 = this.f397R - 8;
                if (this.f449au < this.f458c.size()) {
                    int i16 = i15 - B;
                    int i17 = this.f454az + i7 + 1;
                    int i18 = (this.f450av + i17) - 2;
                    int i19 = (this.f400U + this.f401V) - 4;
                    graphics.setColor(f262I[17]);
                    graphics.drawLine(i19, i17, i19, i18);
                    graphics.setColor(f262I[22]);
                    graphics.drawLine(i19 + 1, i17, i19 + 1, i18);
                    graphics.setColor(f262I[23]);
                    graphics.drawLine(i19 + 2, i17, i19 + 2, i18);
                    graphics.setColor(f262I[24]);
                    graphics.drawLine(i19 + 3, i17, i19 + 3, i18);
                    Code(graphics, i19 + 4, i17, B - 4, this.f450av - 1, f262I[25]);
                    Code(graphics, i19, i7 + Code(true), B - 1, I(true) - 2, false);
                    i15 = i16;
                }
                int min = Math.min(this.f449au, this.f458c.size());
                for (int i20 = 0; i20 < min; i20++) {
                    int i21 = this.f454az + i7 + 1 + (this.f410aB * i20);
                    int i22 = i21 + this.f410aB;
                    int i23 = this.f400U + 4;
                    int i24 = (i23 + i15) - 1;
                    if (this.f437ai == this.f438aj + i20) {
                        graphics.setColor(f262I[10]);
                        graphics.drawLine(i23, i21, i24, i21);
                        Code(graphics, i23, i21 + 1, i15, this.f410aB - 1, f262I[11], f262I[12]);
                        graphics.setColor(f262I[13]);
                        graphics.drawLine(i23, i22 - 1, i24, i22 - 1);
                        graphics.setColor(f262I[14]);
                        graphics.drawLine(i23, i22, i24, i22);
                        int i25 = f262I[34];
                        if ((Code.f98Code[36] & 255) > 127) {
                            i25 = 16777215 - (i25 & 16777215);
                        }
                        graphics.setColor(i25);
                    } else {
                        if (i20 + 1 < min) {
                            graphics.setColor(f262I[15]);
                            graphics.drawLine(i23, i22, i24, i22);
                        }
                        graphics.setColor(-16777216);
                    }
                    if (this.f461d.elementAt(this.f438aj + i20) == null) {
                        str = Code(0, (String) this.f458c.elementAt(this.f438aj + i20), i15 - 1, "...");
                        this.f461d.setElementAt(str, this.f438aj + i20);
                    } else {
                        str = (String) this.f461d.elementAt(this.f438aj + i20);
                    }
                    Code(graphics, 0, str, this.f400U + 6, i21 + ((this.f410aB - this.f409aA) / 2), 20);
                }
                Code(graphics, this.f400U + 3, this.f454az + i7, this.f397R - 6, this.f450av + 1);
            }
        } else if (this.f367Code != null && this.f367Code.f8C >= 4) {
            synchronized (this.f367Code) {
                int c2 = this.f367Code.m63c() - this.f395P;
                int d2 = this.f367Code.d() - this.f429aa;
                this.f395P += c2;
                this.f429aa += d2;
                B(graphics);
                I(graphics, this.f400U, this.f393N, m222Code(), m235I());
                if (graphics.getClipWidth() > 0 && graphics.getClipHeight() > 0) {
                    if (this.f376Code != null) {
                        Graphics graphics2 = this.f376Code.getGraphics();
                        this.f431ac = (this.f431ac + c2) % this.f376Code.getWidth();
                        if (this.f431ac < 0) {
                            this.f431ac += this.f376Code.getWidth();
                        }
                        this.f432ad = (this.f432ad + d2) % this.f376Code.getHeight();
                        if (this.f432ad < 0) {
                            this.f432ad += this.f376Code.getHeight();
                        }
                        if (this.f360C == 117) {
                            this.f420aN = true;
                        }
                        if (this.f420aN || !((c2 == 0 || d2 == 0) && ((d2 == 0 || this.f431ac == 0) && (c2 == 0 || this.f432ad == 0)))) {
                            this.f420aN = true;
                            this.f424aR = true;
                        } else {
                            this.f367Code.m37Code(this.f430ab - this.f395P, -this.f429aa);
                            int width2 = c2 > 0 ? this.f376Code.getWidth() - c2 : 0;
                            int height = d2 > 0 ? this.f376Code.getHeight() - d2 : 0;
                            int abs = d2 == 0 ? Math.abs(c2) : this.f376Code.getWidth();
                            int abs2 = c2 == 0 ? Math.abs(d2) : this.f376Code.getHeight();
                            if (abs == 0) {
                                i3 = this.f367Code.d;
                                i2 = this.f367Code.e;
                                abs = this.f367Code.f;
                                i4 = this.f367Code.g;
                            } else if (this.f367Code.f <= 0 || this.f367Code.g <= 0 || !Code(this.f367Code.d, this.f367Code.e, this.f367Code.f, this.f367Code.g, 0, 0, this.f376Code.getWidth(), this.f376Code.getHeight())) {
                                i2 = height;
                                i3 = width2;
                                i4 = abs2;
                            } else {
                                if (this.f367Code.d < width2) {
                                    abs += width2 - this.f367Code.d;
                                    i3 = this.f367Code.d;
                                } else {
                                    i3 = width2;
                                }
                                abs = Math.max(i3 + abs, this.f367Code.d + this.f367Code.f) - i3;
                                if (this.f367Code.e < height) {
                                    abs2 += height - this.f367Code.e;
                                    i2 = this.f367Code.e;
                                } else {
                                    i2 = height;
                                }
                                i4 = Math.max(i2 + abs2, this.f367Code.e + this.f367Code.g) - i2;
                            }
                            int width3 = this.f376Code.getWidth() - this.f431ac;
                            int height2 = this.f376Code.getHeight() - this.f432ad;
                            if (i3 >= width3 || i3 + abs <= width3) {
                                if (i2 >= height2 || i2 + i4 <= height2) {
                                    J(graphics2, i3, i2, abs, i4);
                                } else {
                                    J(graphics2, i3, i2, abs, height2 - i2);
                                    J(graphics2, i3, height2, abs, (i4 - height2) + i2);
                                }
                            } else if (i2 >= height2 || i2 + i4 <= height2) {
                                J(graphics2, i3, i2, width3 - i3, i4);
                                J(graphics2, width3, i2, (abs - width3) + i3, i4);
                            } else {
                                this.f420aN = true;
                                this.f424aR = true;
                            }
                        }
                        if (this.f420aN) {
                            this.f420aN = false;
                            if (this.f430ab > 0) {
                                this.f431ac = this.f376Code.getWidth() - this.f430ab;
                            } else {
                                this.f431ac = -this.f430ab;
                            }
                            this.f432ad = 0;
                            graphics2.setClip(Math.max(0, -this.f430ab), 0, Math.min(this.f376Code.getWidth(), this.f376Code.getWidth() - this.f430ab), this.f376Code.getHeight());
                            Code(graphics2, 0, 0, this.f376Code.getWidth(), this.f376Code.getHeight(), 16777215);
                            this.f367Code.Z(graphics2, -this.f395P, -this.f429aa);
                            Q();
                        }
                        P();
                        if (this.f431ac != 0) {
                            graphics.drawImage(this.f376Code, this.f400U - this.f431ac, this.f393N, 20);
                            I(graphics, (this.f400U + this.f376Code.getWidth()) - this.f431ac, this.f393N, this.f431ac, m235I());
                            graphics.drawImage(this.f376Code, (this.f400U + this.f376Code.getWidth()) - this.f431ac, this.f393N, 20);
                            Z(graphics);
                        } else {
                            graphics.drawImage(this.f376Code, this.f400U, this.f393N - this.f432ad, 20);
                            I(graphics, this.f400U, (this.f393N + this.f376Code.getHeight()) - this.f432ad, m222Code(), this.f432ad);
                            graphics.drawImage(this.f376Code, this.f400U, (this.f393N + this.f376Code.getHeight()) - this.f432ad, 20);
                            Z(graphics);
                        }
                    } else {
                        this.f430ab = 0;
                        if (m231Code(1) || m231Code(4)) {
                            Code(graphics, graphics.getClipX(), graphics.getClipY(), graphics.getClipWidth(), graphics.getClipHeight(), 16777215);
                        }
                        if (m231Code(40)) {
                            boolean z2 = true;
                            int i26 = -637534209 & f262I[42];
                            if (m231Code(32)) {
                                z2 = false;
                                i26 = f262I[72];
                            }
                            if (f344r) {
                                Code(graphics, this.f400U, this.f393N, m222Code(), this.f398S, i26, z2);
                            } else if (z2) {
                                I(graphics, this.f400U, this.f393N, m222Code(), this.f398S, f262I[43]);
                            } else {
                                Code(graphics, this.f400U, this.f393N, m222Code(), this.f398S, f262I[43]);
                            }
                        }
                        this.f367Code.Z(graphics, this.f400U - this.f395P, this.f393N - this.f429aa);
                        Q();
                        if (!m231Code(2)) {
                            Code(graphics, this.f400U, this.f393N, m222Code(), m235I());
                        }
                    }
                    C(graphics);
                    if (m231Code(2)) {
                        Code(graphics, this.f400U, this.f393N, m222Code(), m235I());
                    }
                    if ((this.f415aG >= 0 || !m248a()) && !m248a()) {
                        this.f367Code.Code(graphics, (this.f400U + this.f430ab) - this.f395P, this.f393N - this.f429aa);
                    }
                }
                Z(graphics);
            }
        } else if (z > 0) {
            Code(graphics, this.f400U, this.f393N, this.f397R, this.f398S, f(f245Code[z - 1]));
        } else {
            Code(graphics, this.f400U, this.f393N, this.f397R, this.f398S, 16777215);
        }
    }

    /* access modifiers changed from: package-private */
    public final void Code(boolean z2, String str, String str2) {
        I i2 = new I(38);
        i2.f189Code = this;
        i2.f194Z = str2;
        i2.f183B = str;
        String I2 = m180I(60);
        if (z2) {
            I2 = new StringBuffer().append("overlay:").append(I2).toString();
        }
        i2.f193J = I2;
        Code((Runnable) i2);
    }

    /* access modifiers changed from: package-private */
    public final void Code(boolean z2, boolean z3, Hashtable hashtable) {
        if (this.f466e) {
            if (this.f378Code != null && this.f378Code[0] != null) {
                Code(this.f378Code, this.f477v, false, false, false, false, (Hashtable) null);
                this.f378Code = null;
                this.f477v = null;
                this.f466e = false;
                a();
            }
        } else if (this.f367Code != null) {
            Code(this.f367Code.m45Code(), this.f367Code.f40J, true, z3, z2, false, hashtable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final boolean m231Code(int i2) {
        return (this.f365Code & i2) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final boolean m232Code(int i2, int i3) {
        return m231Code(16) ? i2 >= this.f400U && i2 <= this.f400U + this.f397R && i3 >= this.f393N && i3 <= (this.f393N + this.f454az) + this.f450av : i2 >= this.f400U && i2 <= this.f400U + this.f397R && i3 >= this.f393N && i3 <= this.f393N + this.f398S;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final boolean m233Code(e eVar) {
        return eVar.m232Code(this.f400U, this.f393N) && eVar.m232Code(this.f400U + this.f397R, this.f393N + this.f398S);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final boolean m234Code(boolean z2) {
        if (this.f440al == -1 || (!z2 && System.currentTimeMillis() - this.f366Code < 1000)) {
            return false;
        }
        this.f373Code.insert(this.f441am, (char) this.f440al);
        this.f441am++;
        this.f440al = -1;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I  reason: collision with other method in class */
    public final int m235I() {
        return (this.f397R == this.f401V || this.f367Code == null || this.f367Code.a() <= this.f401V) ? this.f398S : (!m231Code(5) || this.f400U + this.f398S >= Code.f) ? this.f398S - B : (this.f398S - B) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I  reason: collision with other method in class */
    public final e m236I() {
        return this.f369Code;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I  reason: collision with other method in class */
    public final void m237I() {
        int i2;
        int i3;
        int i4;
        int i5;
        this.f400U = 0;
        this.f393N = Code.f89Code.m96J() ? Code.c : 0;
        this.f397R = Code.e;
        this.f398S = (Code.f - (Code.f89Code.m86B() ? Code.b : 0)) - this.f393N;
        int i6 = this.f397R - B;
        this.f401V = i6;
        this.f392M = i6;
        if (this.f367Code != null) {
            i3 = this.f367Code.m24B();
            i2 = this.f367Code.m27C();
        } else {
            i2 = 0;
            i3 = 0;
        }
        if (m231Code(16)) {
            this.f397R = this.f369Code.f392M;
            int i7 = this.f397R - B;
            this.f401V = i7;
            this.f392M = i7;
            if (this.f458c.size() > 0) {
                J(false);
            }
            m253f();
        } else if (m231Code(2)) {
            int i8 = af ? 0 : Code.b;
            this.f392M = this.f397R;
            this.f401V = i3;
            this.f397R = i3;
            this.f398S = Math.min(i2, Code.f);
            if (this.f369Code.m231Code(2)) {
                int i9 = (this.f369Code.f400U + this.f369Code.f397R) - 6;
                if (this.f397R + i9 > Code.e && (this.f369Code.f400U - this.f397R) + 6 >= 0) {
                    i9 = (this.f369Code.f400U - this.f397R) + 6;
                }
                i4 = (this.f369Code.f393N + this.f369Code.m247a()) - 10;
                if (this.f398S + i4 > Code.f - i8) {
                    i4 += 20 - this.f398S;
                    i5 = i9;
                } else {
                    i5 = i9;
                }
            } else if (this.f367Code == null || I(this.f367Code.f21Code) != 123) {
                int i10 = N ? Code.e - this.f397R : 0;
                if (N) {
                    i4 = Code.c - 4;
                    i5 = i10;
                } else {
                    i4 = Code.f + 4;
                    i5 = i10;
                }
            } else {
                i5 = this.f369Code.f400U + this.f369Code.C();
                i4 = this.f369Code.f393N + this.f369Code.m247a();
            }
            this.f400U = Code(i5, 0, Code.e - this.f397R);
            if (!N || !m213k()) {
                i4 = Math.max(i4, this.f393N);
            }
            this.f393N = Code(i4, 0, ((Code.f - i8) - this.f398S) + 4);
        }
        if (m231Code(40)) {
            this.f392M = (Code.e * 9) / 10;
            int min = Math.min(i3, this.f392M);
            this.f401V = min;
            this.f397R = min;
            this.f398S = Math.min(i2, (Code.f << 3) / 10);
            if (i2 > this.f398S) {
                this.f397R += B;
            }
            this.f400U = (Code.e - this.f397R) / 2;
            this.f393N = (Code.f - this.f398S) / 2;
            if (this.f367Code != null) {
                this.f367Code.m48I(0, m235I() - I(false));
            }
        }
        if (m231Code(32)) {
            this.f400U = 0;
            int i11 = Code.e;
            this.f392M = i11;
            this.f401V = i11;
            this.f397R = i11;
            this.f398S = Math.min(i2, Code.f / 2);
            this.f393N = (Code.f - this.f398S) - (Code.f89Code.m86B() ? Code.b : 0);
        }
        K();
        if (this.f367Code != null) {
            this.f367Code.Code(0, 0, false, false);
            if (I(this.f367Code.f21Code) == 165) {
                this.f367Code.m25B();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I  reason: collision with other method in class */
    public final void m238I(int i2) {
        if (this.f367Code != null) {
            this.f367Code.m36Code(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void I(int i2, int i3) {
        if (this.f466e) {
            this.f435ag = -1;
            Code(false, false, (Hashtable) null);
            return;
        }
        boolean Code2 = m231Code(16);
        this.f422aP = false;
        if (this.f367Code != null || Code2) {
            int i4 = i2 - this.f400U;
            int i5 = i3 - this.f393N;
            if (Code2) {
                if (this.f440al != -1 && m234Code(true)) {
                    J(true);
                    m253f();
                    this.f435ag = -1;
                } else if (!Code2 || this.f449au >= this.f458c.size() || i4 < this.f401V - 4 || i4 > (this.f401V - 4) + B) {
                    this.f435ag = 0;
                    this.f443ao = i5;
                    this.f444ap = this.f438aj;
                } else if (i5 < Code(Code2)) {
                    this.f435ag = 1;
                    this.f438aj = Math.max(0, this.f438aj - (this.f448at - 1));
                } else {
                    if (i5 < I(Code2) + Code(Code2)) {
                        this.f435ag = 2;
                        this.f436ah = i5;
                        this.f444ap = this.f438aj;
                        return;
                    }
                    this.f435ag = 3;
                    this.f438aj = Math.min(this.f458c.size() - this.f449au, this.f438aj + (this.f448at - 1));
                }
            } else if (i4 >= this.f401V) {
                if (i5 < Code(Code2)) {
                    this.f435ag = 1;
                    this.f367Code.Code(0, -this.f367Code.h(), false, true);
                } else if (i5 < Code(Code2) + I(Code2)) {
                    this.f435ag = 2;
                    this.f436ah = i5 - Code(Code2);
                } else {
                    this.f435ag = 3;
                    this.f367Code.Code(0, this.f367Code.h(), false, true);
                }
            } else if (i5 < m235I()) {
                this.f435ag = 0;
                this.f367Code.m53J(i4, i5);
            } else if (i4 < e()) {
                this.f435ag = 4;
                this.f367Code.Code(-this.f367Code.g(), 0, true, true);
            } else if (i4 < e() + f()) {
                this.f435ag = 5;
                this.f436ah = i4 - e();
            } else {
                this.f435ag = 6;
                this.f367Code.Code(this.f367Code.g(), 0, true, true);
            }
        } else {
            this.f435ag = -1;
        }
    }

    /* access modifiers changed from: package-private */
    public final void I(Graphics graphics) {
        if (!m248a()) {
            I(graphics, this.f400U, this.f393N, this.f401V, m235I());
            this.f367Code.I(graphics, this.f400U, this.f393N);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I  reason: collision with other method in class */
    public final void m239I(boolean z2) {
        if (this.f365Code == 16) {
            this.f396Q = Code.Code(this.f396Q, 0, -this.f411aC, this.f434af);
            return;
        }
        if (this.f367Code != null) {
            this.f367Code.J(z2);
        }
        this.f395P -= this.f430ab;
        this.f430ab = Code.Code(this.f430ab, 0, this.f433ae, this.f434af);
        this.f395P += this.f430ab;
        if (m248a()) {
            this.f417aI = Code.Code(this.f418aJ, this.f434af);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I  reason: collision with other method in class */
    public final boolean m240I(int i2) {
        if (i2 == -1 && this.f367Code != null && this.f367Code.f7B) {
            i2 = 0;
        }
        return this.f399T + i2 >= 0 && this.f399T + i2 < this.f374Code.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J  reason: collision with other method in class */
    public final int m241J() {
        return this.f398S;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J  reason: collision with other method in class */
    public final void m242J() {
        Code(false, false, (Hashtable) null);
    }

    /* access modifiers changed from: package-private */
    public final void J(int i2, int i3) {
        this.f360C = -1;
        boolean Code2 = m231Code(16);
        int i4 = i2 - this.f400U;
        int i5 = i3 - this.f393N;
        if (Code2) {
            if (this.f435ag == 2) {
                this.f438aj = Code(this.f444ap + (((this.f458c.size() - this.f449au) * (i5 - this.f436ah)) / (this.f450av - I(true))), 0, this.f458c.size() - this.f449au);
            } else if (this.f435ag == 0 && i5 > this.f454az && Math.abs(i5 - this.f443ao) > 6) {
                this.f422aP = true;
                this.f438aj = Code(this.f444ap - (((i5 - this.f443ao) * 2) / this.f410aB), 0, this.f458c.size() - this.f449au);
            }
            a();
        } else if (this.f435ag == 2) {
            this.f367Code.m48I(i5 - this.f436ah, m235I() - I(false));
        } else if (this.f435ag == 5) {
            this.f367Code.m57Z(i4 - this.f436ah, this.f401V - f());
        } else if (this.f435ag == 0) {
            this.f367Code.B(i4, i5);
        }
    }

    /* access modifiers changed from: package-private */
    public final void J(boolean z2) {
        e eVar;
        int i2 = -1;
        this.f458c = new Vector();
        this.f465e = new Vector();
        String str = new String(this.f373Code);
        if (this.f373Code.length() > 0) {
            if (str.indexOf(32) < 0) {
                Code(str, Code.f93Code);
                Code(str, Code.f118Z);
                Code(str, f269J);
                Code(str, f282Z);
                if (this.f373Code.length() == 1 && this.f373Code.charAt(0) == 'w') {
                    this.f458c.insertElementAt("www.", 0);
                    this.f465e.insertElementAt(null, 0);
                }
                int indexOf = str.indexOf(46);
                int indexOf2 = str.indexOf("www.");
                if (f351w.length() > 0 && this.f373Code.charAt(this.f373Code.length() - 1) == '.' && ((indexOf != this.f373Code.length() - 1 || indexOf < 3 || indexOf2 == -1 || indexOf2 == indexOf - 4) && str.indexOf(47, indexOf) == -1 && str.indexOf(32) == -1)) {
                    int i3 = 0;
                    while (true) {
                        int indexOf3 = f351w.indexOf(44, i3);
                        if (indexOf3 == -1) {
                            break;
                        }
                        this.f458c.insertElementAt(new StringBuffer().append(str).append(f351w.substring(i3, indexOf3)).toString(), 0);
                        this.f465e.insertElementAt(null, 0);
                        i3 = indexOf3 + 1;
                    }
                }
            }
            this.f458c.addElement(m124Code(158, this.f373Code.toString()));
            this.f465e.addElement(Code(f234C, 0)[2]);
        }
        this.f458c.addElement(m122Code(159));
        this.f465e.addElement(null);
        if (this.f458c.size() == 0) {
            eVar = this;
        } else {
            if (z2) {
                if (this.f458c.size() > 2 || (this.f458c.size() == 2 && str.indexOf(32) >= 0)) {
                    i2 = 0;
                    eVar = this;
                } else {
                    eVar = this;
                }
            }
            this.f461d = new Vector();
            this.f461d.setSize(this.f458c.size());
        }
        eVar.f437ai = i2;
        this.f438aj = 0;
        this.f461d = new Vector();
        this.f461d.setSize(this.f458c.size());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J  reason: collision with other method in class */
    public final boolean m243J() {
        return m231Code(56);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z  reason: collision with other method in class */
    public final int m244Z() {
        return this.f392M;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z  reason: collision with other method in class */
    public final void m245Z() {
        L();
        Vector vector = Code.f118Z;
        if (vector != null) {
            for (int size = vector.size() - 1; size >= 0; size--) {
                B b2 = (B) ((Object[]) vector.elementAt(size))[8];
                if (b2 != null && b2.m30Code() == this) {
                    b2.Code((e) null);
                }
            }
        }
        this.f362C = true;
    }

    /* access modifiers changed from: package-private */
    public final void Z(int i2, int i3) {
        if (this.f435ag != 0) {
            return;
        }
        if (!m231Code(16)) {
            this.f367Code.m68g();
        } else if (i3 - this.f393N < this.f454az && this.f443ao < this.f454az) {
            if (this.f421aO || this.f458c.size() == 0) {
                this.f421aO = false;
                J(true);
                m253f();
            } else if (this.f437ai >= 0 && this.f437ai < this.f458c.size() - 2) {
                this.f373Code = new StringBuffer((String) this.f458c.elementAt(this.f437ai));
                J(true);
                m253f();
            }
            int i4 = this.f442an + this.f400U + 4 + this.f452ax;
            int i5 = 0;
            while (i5 < this.f377Code.length && Code(0, this.f377Code, 0, i5) + (Code(this.f377Code[i5]) / 2) + i4 < i2) {
                i5++;
            }
            this.f441am = i5;
            this.f437ai = -1;
            m253f();
            a();
        } else if (!this.f422aP) {
            int i6 = (this.f443ao - this.f454az) / this.f410aB;
            int i7 = ((i3 - this.f393N) - this.f454az) / this.f410aB;
            if (i6 == i7 && i7 >= 0 && i7 < this.f449au) {
                if (this.f437ai == this.f438aj + i7) {
                    b(-5, 0);
                } else {
                    this.f437ai = this.f438aj + i7;
                    m253f();
                }
            }
            a();
        }
    }

    public final void Z(boolean z2) {
        if (!m214l()) {
            this.f427aU = false;
        } else if (this.f427aU ^ z2) {
            if (z2) {
                if (Code.f89Code.m87C()) {
                    return;
                }
                if (this.f367Code != null && this.f367Code.f8C <= 4) {
                    return;
                }
                if (this.f380I != null && this.f380I.f8C <= 4) {
                    return;
                }
            }
            if (!this.f367Code.m58Z()) {
                this.f427aU = z2;
                this.f415aG = -1;
                this.f426aT = false;
                if (z2) {
                    if (this.f367Code != null) {
                        this.f412aD = this.f367Code.f14Code;
                        this.f413aE = this.f367Code.f29I;
                        this.f414aF = this.f367Code.f3B;
                    } else {
                        this.f412aD = Code.B;
                        this.f413aE = Code.C;
                        this.f414aF = Code.a;
                    }
                    this.f416aH = 255;
                    this.f418aJ = 50;
                    this.f417aI = 50;
                    this.f434af = (int) System.currentTimeMillis();
                    Code.e();
                } else if (this.f367Code != null) {
                    this.f367Code.f14Code = this.f412aD;
                    this.f367Code.f29I = this.f413aE;
                    this.f367Code.f3B = this.f414aF;
                } else {
                    Code.B = this.f412aD;
                    Code.C = this.f413aE;
                    Code.a = this.f414aF;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z  reason: collision with other method in class */
    public final boolean m246Z() {
        return this.f405Z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public final int m247a() {
        return Code(this.f367Code.f(), 0, m235I() - 1);
    }

    /* renamed from: a  reason: collision with other method in class */
    public final boolean m248a() {
        return this.f427aU && m214l();
    }

    /* renamed from: b  reason: collision with other method in class */
    public final int m249b() {
        return this.f415aG;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: collision with other method in class */
    public final void m250b() {
        if (this.f376Code != null && !this.f425aS) {
            Code(this.f376Code.getGraphics(), 0, 0, this.f376Code.getWidth(), this.f376Code.getHeight(), 553648128, false);
            this.f425aS = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: collision with other method in class */
    public final void m251c() {
        if (this.f425aS) {
            this.f420aN = true;
            this.f425aS = false;
        }
    }

    /* renamed from: d  reason: collision with other method in class */
    public final void m252d() {
        this.f426aT = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: collision with other method in class */
    public final void m253f() {
        this.f476u = this.f373Code.toString();
        this.f377Code = new char[this.f373Code.length()];
        this.f373Code.getChars(0, this.f373Code.length(), this.f377Code, 0);
        this.f441am = Math.min(this.f441am, this.f373Code.length());
        this.f445aq = Code(0, this.f476u);
        this.f446ar = this.f440al == -1 ? 0 : Code((char) this.f440al);
        this.f447as = Code(0, this.f377Code, 0, this.f441am);
        this.f454az = this.f411aC + 4;
        this.f448at = ((this.f398S - this.f454az) - 7) / this.f410aB;
        this.f449au = Math.min(this.f448at, this.f458c.size());
        this.f450av = (this.f449au * this.f410aB) + 2;
        byte[] bArr = (this.f437ai < 0 || this.f437ai >= this.f458c.size() + -1) ? null : (byte[]) this.f465e.elementAt(this.f437ai);
        if (bArr == null) {
            this.f383I = this.f404Z;
        } else {
            this.f383I = Code(bArr, (Object) bArr);
        }
        this.f451aw = this.f397R - 10;
        this.f452ax = this.f423aQ ? this.f404Z.getWidth() + 5 : 2;
        this.f453ay = Math.max(Code('M'), this.f451aw / 10) + 2;
        this.f442an = Code(this.f442an, -this.f447as, (((this.f451aw - this.f452ax) - this.f453ay) - this.f447as) - this.f446ar);
        this.f442an = Math.max(this.f442an, Math.min(0, ((this.f451aw - this.f452ax) - this.f453ay) - this.f445aq));
        this.f438aj = Code(this.f438aj, (this.f437ai - this.f449au) + 1, Code(this.f437ai, 0, this.f458c.size() - this.f449au));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: collision with other method in class */
    public final void m254g() {
        if (this.f466e) {
            this.f367Code = null;
            return;
        }
        B b2 = this.f367Code;
        if (this.f380I != null) {
            b2 = this.f380I;
        }
        if (b2 != null) {
            this.f378Code = b2.m45Code();
            this.f378Code[8] = null;
            this.f378Code[2] = null;
            this.f477v = b2.f40J;
        }
        L();
        for (int size = this.f374Code.size() - 1; size >= 0; size--) {
            ((Object[]) this.f374Code.elementAt(size))[8] = null;
        }
        this.f380I = null;
        this.f367Code = null;
        this.f388J = null;
        this.f376Code = null;
        this.f466e = true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        e(true);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:13:0x001b, B:20:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 652
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.run():void");
    }
}
