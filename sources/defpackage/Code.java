package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.Screen;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.game.Sprite;

/* access modifiers changed from: package-private */
/* renamed from: Code  reason: default package */
public final class Code extends Canvas implements Runnable, CommandListener {
    private static int A;
    static int B;

    /* renamed from: B  reason: collision with other field name */
    static Image f84B;

    /* renamed from: B  reason: collision with other field name */
    public static boolean f85B;
    static int C;

    /* renamed from: C  reason: collision with other field name */
    static Image f86C;

    /* renamed from: C  reason: collision with other field name */
    public static boolean f87C;
    private static byte Code = 1;

    /* renamed from: Code  reason: collision with other field name */
    public static int f88Code = 1;

    /* renamed from: Code  reason: collision with other field name */
    static Code f89Code;

    /* renamed from: Code  reason: collision with other field name */
    public static I f90Code;

    /* renamed from: Code  reason: collision with other field name */
    static a f91Code;

    /* renamed from: Code  reason: collision with other field name */
    static String f92Code;

    /* renamed from: Code  reason: collision with other field name */
    static Vector f93Code = new Vector();

    /* renamed from: Code  reason: collision with other field name */
    private static Graphics f94Code;

    /* renamed from: Code  reason: collision with other field name */
    private static Sprite f95Code;

    /* renamed from: Code  reason: collision with other field name */
    static boolean f96Code;

    /* renamed from: Code  reason: collision with other field name */
    static byte[] f97Code;

    /* renamed from: Code  reason: collision with other field name */
    static int[] f98Code;

    /* renamed from: Code  reason: collision with other field name */
    static Object[] f99Code;

    /* renamed from: Code  reason: collision with other field name */
    static final Command[] f100Code = new Command[43];
    public static int I;

    /* renamed from: I  reason: collision with other field name */
    private static long f101I = -1;

    /* renamed from: I  reason: collision with other field name */
    public static String f102I = "";

    /* renamed from: I  reason: collision with other field name */
    static Vector f103I = new Vector();

    /* renamed from: I  reason: collision with other field name */
    private static Graphics f104I;

    /* renamed from: I  reason: collision with other field name */
    private static TextBox f105I;

    /* renamed from: I  reason: collision with other field name */
    static boolean f106I = true;

    /* renamed from: I  reason: collision with other field name */
    static byte[] f107I;

    /* renamed from: I  reason: collision with other field name */
    static Object[] f108I;

    /* renamed from: I  reason: collision with other field name */
    private static Image[] f109I;
    public static int J = 3;

    /* renamed from: J  reason: collision with other field name */
    private static I f110J;

    /* renamed from: J  reason: collision with other field name */
    public static String f111J = "0";

    /* renamed from: J  reason: collision with other field name */
    private static Vector f112J = new Vector();

    /* renamed from: J  reason: collision with other field name */
    static Image f113J;

    /* renamed from: J  reason: collision with other field name */
    public static boolean f114J;

    /* renamed from: J  reason: collision with other field name */
    static byte[] f115J;
    public static int Z;

    /* renamed from: Z  reason: collision with other field name */
    private static long f116Z;

    /* renamed from: Z  reason: collision with other field name */
    public static String f117Z = "";

    /* renamed from: Z  reason: collision with other field name */
    static Vector f118Z;

    /* renamed from: Z  reason: collision with other field name */
    static Image f119Z;

    /* renamed from: Z  reason: collision with other field name */
    public static boolean f120Z;

    /* renamed from: Z  reason: collision with other field name */
    static byte[] f121Z = {0};

    /* renamed from: Z  reason: collision with other field name */
    private static final int[] f122Z = {1, 6, 2, 5, 50, 52, 54, 56};

    /* renamed from: Z  reason: collision with other field name */
    private static Image[] f123Z;
    static int a;

    /* renamed from: a  reason: collision with other field name */
    static Image f124a;

    /* renamed from: a  reason: collision with other field name */
    public static boolean f125a;

    /* renamed from: a  reason: collision with other field name */
    private static int[] f126a;
    static int b = 0;

    /* renamed from: b  reason: collision with other field name */
    static Image f127b;

    /* renamed from: b  reason: collision with other field name */
    static boolean f128b = true;

    /* renamed from: b  reason: collision with other field name */
    private static int[] f129b;
    static int c = 0;

    /* renamed from: c  reason: collision with other field name */
    static Image f130c;

    /* renamed from: c  reason: collision with other field name */
    static boolean f131c = false;

    /* renamed from: c  reason: collision with other field name */
    private static final int[] f132c = {-6, -7, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
    static int d = 0;

    /* renamed from: d  reason: collision with other field name */
    static Image f133d;
    public static int e;

    /* renamed from: e  reason: collision with other field name */
    static Image f134e;

    /* renamed from: e  reason: collision with other field name */
    private static boolean f135e;
    public static int f;

    /* renamed from: f  reason: collision with other field name */
    static Image f136f;
    static int g;

    /* renamed from: g  reason: collision with other field name */
    static Image f137g;
    static int h;

    /* renamed from: h  reason: collision with other field name */
    static Image f138h;

    /* renamed from: h  reason: collision with other field name */
    private static boolean f139h;
    static int i;

    /* renamed from: i  reason: collision with other field name */
    static Image f140i;
    static int j;

    /* renamed from: j  reason: collision with other field name */
    static Image f141j;
    static int k;

    /* renamed from: k  reason: collision with other field name */
    static Image f142k;

    /* renamed from: k  reason: collision with other field name */
    private static boolean f143k;
    static int l;

    /* renamed from: l  reason: collision with other field name */
    private static boolean f144l;
    static int m = -1;
    private static int p;
    private static int q;
    private static int r;
    private static Image t;
    private static int y;

    /* renamed from: B  reason: collision with other field name */
    private String f145B = "";

    /* renamed from: B  reason: collision with other field name */
    private int[] f146B;

    /* renamed from: C  reason: collision with other field name */
    private int[] f147C;

    /* renamed from: Code  reason: collision with other field name */
    private long f148Code;

    /* renamed from: Code  reason: collision with other field name */
    private Object f149Code;

    /* renamed from: Code  reason: collision with other field name */
    Timer f150Code = new Timer();

    /* renamed from: Code  reason: collision with other field name */
    private TimerTask f151Code;

    /* renamed from: Code  reason: collision with other field name */
    Image f152Code;

    /* renamed from: Code  reason: collision with other field name */
    private TextBox f153Code = null;

    /* renamed from: Code  reason: collision with other field name */
    private Image[] f154Code;

    /* renamed from: I  reason: collision with other field name */
    private I f155I;

    /* renamed from: I  reason: collision with other field name */
    private TimerTask f156I;

    /* renamed from: I  reason: collision with other field name */
    Image f157I;

    /* renamed from: I  reason: collision with other field name */
    int[] f158I;

    /* renamed from: J  reason: collision with other field name */
    private long f159J = 0;

    /* renamed from: J  reason: collision with other field name */
    private int[] f160J;

    /* renamed from: Z  reason: collision with other field name */
    private I f161Z;

    /* renamed from: d  reason: collision with other field name */
    private boolean f162d;

    /* renamed from: f  reason: collision with other field name */
    private boolean f163f = false;

    /* renamed from: g  reason: collision with other field name */
    private boolean f164g;

    /* renamed from: i  reason: collision with other field name */
    private boolean f165i;

    /* renamed from: j  reason: collision with other field name */
    private boolean f166j;

    /* renamed from: l  reason: collision with other field name */
    private Image f167l;

    /* renamed from: m  reason: collision with other field name */
    private Image f168m;
    private int n = 0;

    /* renamed from: n  reason: collision with other field name */
    private Image f169n;
    private int o = ((int) System.currentTimeMillis());

    /* renamed from: o  reason: collision with other field name */
    private Image f170o;

    /* renamed from: p  reason: collision with other field name */
    private Image f171p;

    /* renamed from: q  reason: collision with other field name */
    private Image f172q;

    /* renamed from: r  reason: collision with other field name */
    private Image f173r;
    private int s;

    /* renamed from: s  reason: collision with other field name */
    private Image f174s;

    /* renamed from: t  reason: collision with other field name */
    private int f175t;
    private int u = -1;
    private int v = 0;
    private int w;
    private int x;
    private int z;

    static {
        int[] iArr = {54, 54, 55, 55, 52, 55, 50, 55, 50, 52, 51};
    }

    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Throwable] */
    Code() {
        f89Code = this;
        e.m185I("r");
        e.l();
        e.i();
        e.m();
        e.p();
        e.h();
        m82Z();
        if (!e.az) {
            e.m185I("eurls");
            e.m185I("b");
            e.m185I("se");
        }
        if (e.f277Y) {
            try {
                f91Code = new a();
            } catch (Throwable th) {
                e.f277Y = false;
            }
        }
        new StringBuffer()
                .append(e.f259I)
                .append(" hifi")
                .append(e.f280Z.length() > 0 ? " " : "")
                .append(e.f280Z)
                .append(e.f267J.length() > 0 ? " " : "")
                .append(e.f267J)
                .append(" v. 4.6.32741, 20130109");

        f92Code = new StringBuffer()
                .append("Opera Mini/4.6.32741/hifi/")
                .append(e.f280Z)
                .append("/")
                .append(e.f267J)
                .toString();
        this.f166j = e.f339o;
        int i2 = !e.f337n ? 1 : 0;
        Font[] fontArr = new Font[6];
        e.f248Code = fontArr;
        fontArr[0] = Font.getFont(64, 0, 8);
        e.f248Code[1] = Font.getFont(64, i2, 8);
        e.f248Code[2] = Font.getFont(64, 0, 0);
        e.f248Code[3] = Font.getFont(64, i2, 0);
        e.f248Code[4] = Font.getFont(64, 0, 16);
        e.f248Code[5] = Font.getFont(64, i2, 16);
        if (!e.f254G && !e.af) {
            setFullScreenMode(true);
        }
        e.r();
        if (e.f260I.isEmpty()) {
            e.a(true);
        }
        Browser.display.setCurrent(this);
        new Thread(this).start();
    }

    static void B() {
        if (!f96Code) {
            f121Z = new byte[]{0};
        }
    }

    private int Code(int i2) {
        int indexOf;
        boolean d2 = d();
        if (d2 && e.Code(i2, -1, false) != -1) {
            return i2;
        }
        int i3 = e.M ? -6 : -7;
        int i4 = (B == 2 || d2) ? -8 : i3;
        String str = null;
        try {
            str = getKeyName(i2);
        } catch (Throwable th) {
        }
        if (e.f319g != null && (indexOf = e.f319g.indexOf((char) i2)) >= 0) {
            return e.f322h.charAt(indexOf);
        }
        if (e.b == 3) {
            if (i2 == -14) {
                return -6;
            }
            if (i2 == -13) {
                return -7;
            }
            if (i2 == -20 || i2 == -22) {
                return 0;
            }
            if (i2 == -11) {
                return (m72Code().f367Code == null || !m72Code().f367Code.f21Code.equals(e.m180I(60))) ? i3 : i2;
            }
        }
        if (str != null) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.equals("sk2(left)")) {
                return -6;
            }
            if (lowerCase.equals("sk1(right)")) {
                return -7;
            }
            if (e.f275W && i2 == -7) {
                return -6;
            }
            if (e.f275W && i2 == -6) {
                return -7;
            }
            if (i2 == 105) {
                return -6;
            }
            if (e.al && i2 == 42 && lowerCase.equals("start")) {
                return 42;
            }
            if (i2 == -20 && lowerCase.equals("symbol")) {
                return -11;
            }
            if (lowerCase.indexOf("soft") >= 0) {
                if (lowerCase.charAt(lowerCase.length() - 1) == '1' || lowerCase.startsWith("left")) {
                    return -6;
                }
                if (lowerCase.charAt(lowerCase.length() - 1) == '2' || lowerCase.charAt(lowerCase.length() - 1) == '4' || lowerCase.startsWith("right")) {
                    return -7;
                }
            }
            if (lowerCase.equals("clear") || lowerCase.equals("backspace") || lowerCase.equals("back")) {
                return i4;
            }
            if (lowerCase.equals("select") || lowerCase.equals("ok") || lowerCase.equals("send") || lowerCase.equals("fire") || lowerCase.equals("navi-center") || lowerCase.equals("start") || lowerCase.equals("enter")) {
                return -5;
            }
            if (lowerCase.equals("up") || lowerCase.equals("navi-up") || lowerCase.equals("up arrow")) {
                return 1;
            }
            if (lowerCase.equals("down") || lowerCase.equals("navi-down") || lowerCase.equals("down arrow")) {
                return 6;
            }
            if (lowerCase.equals("left") || lowerCase.equals("navi-left") || lowerCase.equals("left arrow")) {
                return 2;
            }
            if (lowerCase.equals("right") || lowerCase.equals("navi-right") || lowerCase.equals("right arrow")) {
                return 5;
            }
            if (lowerCase.equals("sidedown") || lowerCase.equals("vol. down")) {
                return -10;
            }
            if (lowerCase.equals("sideup") || lowerCase.equals("vol. up")) {
                return -9;
            }
            if (lowerCase.equals("q") || lowerCase.equals("w")) {
                return -6;
            }
            if (lowerCase.equals("o") || lowerCase.equals("p")) {
                return -7;
            }
        }
        if (i2 == -11 && e.b == 0) {
            return 0;
        }
        if (i2 == -22 && e.b == 2) {
            return 0;
        }
        if (i2 == -6 || i2 == -21 || i2 == 21 || i2 == 65 || i2 == 66 || i2 == -202 || i2 == 113 || i2 == 57345) {
            return -6;
        }
        if (i2 == -7 || i2 == -22 || i2 == 22 || i2 == 67 || i2 == 68 || i2 == 106 || i2 == -203 || i2 == 112 || i2 == 57346) {
            return -7;
        }
        if (i2 == -5 || i2 == -10 || i2 == -20 || i2 == 20 || i2 == 23 || i2 == -14 || i2 == -26 || i2 == -200 || i2 == 13) {
            return -5;
        }
        if (i2 == -8 || i2 == -11 || i2 == -16 || i2 == -19 || i2 == -204) {
            return i4;
        }
        switch (i2) {
            case 35:
            case 42:
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
                return i2;
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            default:
                try {
                    int gameAction = getGameAction(i2);
                    if (gameAction == 0) {
                        return i2;
                    }
                    if (gameAction == 8) {
                        return -5;
                    }
                    return gameAction;
                } catch (Throwable th2) {
                    return i2;
                }
        }
    }

    static int Code(int i2, int i3) {
        int max;
        if (!e.ap || (max = Math.max(0, y - i3)) >= 500) {
            return 100;
        }
        f143k = true;
        f144l = true;
        if (max < 150) {
            Code = 1;
            return I(max, 150, i2, 150);
        }
        Code = 1;
        return 150 - I(max - 150, 350, 0, 50);
    }

    private static int Code(int i2, int i3, int i4) {
        if (i2 < 1250 && i3 < 1250) {
            switch (Code) {
                case 0:
                    return (i3 * i2) / i4;
                case 1:
                    return (((i3 * i2) * i2) / i4) / i4;
            }
        }
        long j2 = (long) i2;
        long j3 = (long) i4;
        long j4 = (long) i3;
        switch (Code) {
            case 0:
                return (int) ((j2 * j4) / j3);
            case 1:
                return (int) (((j2 * (j4 * j2)) / j3) / j3);
            default:
                return i3;
        }
    }

    static int Code(int i2, int i3, int i4, int i5) {
        if (!e.ap) {
            return i3;
        }
        int max = Math.max(0, y - i5);
        if (i2 == i3 || max >= 160) {
            return i3;
        }
        f143k = true;
        f144l = true;
        return i4 + ((int) ((((long) (((max + 160) * 160) - (max * max))) * (((long) (i3 - i4)) * ((long) max))) / 4096000));
    }

    static int Code(Code code) {
        return code.w;
    }

    static B Code() {
        return m72Code().f367Code;
    }

    /* renamed from: Code  reason: collision with other method in class */
    static e m72Code() {
        if (f112J.isEmpty()) {
            return null;
        }
        return (e) f112J.lastElement();
    }

    /* renamed from: Code  reason: collision with other method in class */
    static e m73Code(int i2) {
        int size = f112J.size();
        while (true) {
            int i3 = size - 1;
            if (size <= 0) {
                return null;
            }
            e eVar = (e) f112J.elementAt(i3);
            if (eVar.m231Code(i2)) {
                return eVar;
            }
            size = i3;
        }
    }

    static e Code(String str) {
        int size = f112J.size();
        while (true) {
            int i2 = size - 1;
            if (size <= 0) {
                return null;
            }
            e eVar = (e) f112J.elementAt(i2);
            if (eVar.f367Code != null && str.equals(eVar.f367Code.f21Code)) {
                return eVar;
            }
            size = i2;
        }
    }

    private e Code(String str, String str2, String str3, int i2, e eVar, int i3) {
        int size = f103I.size();
        boolean z2 = i3 >= size;
        if (z2 && size > 0 && (i2 & 1) != 0) {
            m79I().B(false);
        }
        e eVar2 = new e(i2, eVar, z2);
        f112J.insertElementAt(eVar2, i3);
        if (eVar2.m231Code(1)) {
            f103I.addElement(eVar2);
        }
        eVar2.m229Code(str, str2, str3);
        eVar2.m237I();
        if (e.R) {
            I.Code();
        } else {
            repaint();
        }
        I.J();
        return eVar2;
    }

    /* renamed from: Code  reason: collision with other method in class */
    private Object m74Code(int i2, int i3) {
        int size = f112J.size();
        while (true) {
            int i4 = size - 1;
            if (size > 0) {
                e eVar = (e) f112J.elementAt(i4);
                if (eVar.m232Code(i2, i3)) {
                    return eVar;
                }
                size = i4;
            } else {
                m78Code((Graphics) null);
                if (m86B() && (i3 > f - b || (e.N && i3 < b))) {
                    int Code2 = e.Code(1, f100Code[B].getLabel()) + 4;
                    int Code3 = C == 12 ? ((e - e.Code(1, f100Code[C].getLabel())) - this.f173r.getWidth()) - 8 : (e - e.Code(1, f100Code[C].getLabel())) - 4;
                    if (Code2 < e / 3) {
                        Code2 = e / 3;
                    }
                    if (Code3 > ((e / 3) << 1)) {
                        Code3 = (e / 3) << 1;
                    }
                    if (e.N) {
                        if (i2 > Code3 && i3 > f - b) {
                            return f100Code[C];
                        }
                        if (i2 > e - Code2 && i3 < b) {
                            return f100Code[B];
                        }
                    } else if (i3 > f - b) {
                        if (i2 > Code3) {
                            return f100Code[C];
                        }
                        if (i2 >= Code2 && i2 <= Code3) {
                            return f100Code[a];
                        }
                        if (i2 < Code2) {
                            return f100Code[B];
                        }
                    }
                }
                return null;
            }
        }
    }

    static String Code(int i2, boolean z2, Calendar calendar) {
        boolean z3 = false;
        if (calendar == null) {
            calendar = e.m129Code(false, z2);
        }
        if (i2 < 0 || i2 > 23) {
            i2 = calendar.get(11);
        }
        int i3 = calendar.get(12);
        if (e.aw) {
            return new StringBuffer().append(i2 < 10 ? "0" : "").append(i2).append(":").append(i3 < 10 ? "0" : "").append(i3).toString();
        }
        if (i2 >= 12) {
            i2 -= 12;
        } else {
            z3 = true;
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (i2 == 0) {
            i2 = 12;
        }
        return stringBuffer.append(i2).append(":").append(i3 < 10 ? "0" : "").append(i3).append(z3 ? " AM" : " PM").toString();
    }

    private static String Code(Command command) {
        if (command == f100Code[0]) {
            return new StringBuffer().append("menu:").append(e.m180I(66)).toString();
        }
        if (command == f100Code[11]) {
            return new StringBuffer().append("dialog:").append(e.m180I(32)).toString();
        }
        if (command == f100Code[2]) {
            return new StringBuffer().append("menu:").append(e.m180I(68)).toString();
        }
        if (command == f100Code[4]) {
            return e.m180I(81);
        }
        if (command == f100Code[3]) {
            return e.m180I(110);
        }
        if (command == f100Code[9] || command == f100Code[36]) {
            return e.m180I(113);
        }
        if (command == f100Code[10]) {
            return e.m180I(114);
        }
        if (command == f100Code[1] || command == f100Code[29]) {
            return e.m180I(115);
        }
        if (command == f100Code[7]) {
            return e.m180I(116);
        }
        if (command == f100Code[5]) {
            return e.m180I(121);
        }
        if (command == f100Code[6]) {
            return e.m180I(122);
        }
        if (command == f100Code[12] || command == f100Code[38]) {
            return e.m180I(117);
        }
        if (command == f100Code[13]) {
            return e.f232C;
        }
        if (command == f100Code[20]) {
            return e.m180I(92);
        }
        if (command == f100Code[22]) {
            return e.m180I(96);
        }
        if (command == f100Code[8]) {
            return e.m180I(93);
        }
        if (command == f100Code[21]) {
            return e.m180I(94);
        }
        if (command == f100Code[17]) {
            return e.m180I(83);
        }
        if (command == f100Code[37]) {
            return new StringBuffer().append("openp:").append(e.f306c).toString();
        }
        if (command == f100Code[27]) {
            return e.m180I(59);
        }
        if (command == f100Code[24]) {
            return e.m180I(51);
        }
        if (command == f100Code[25]) {
            return new StringBuffer().append("menu:").append(e.m180I(128)).toString();
        }
        if (command == f100Code[26]) {
            return e.m180I(132);
        }
        if (command == f100Code[39]) {
            return e.m180I(146);
        }
        if (command == f100Code[40]) {
            return e.m180I(147);
        }
        if (command == f100Code[41]) {
            return "closeTab:";
        }
        if (command == f100Code[42]) {
            return new StringBuffer().append("bottomOverlay:").append(e.m180I(165)).toString();
        }
        return null;
    }

    /* renamed from: Code  reason: collision with other method in class */
    private static TextBox m75Code() {
        try {
            return new TextBox(e.m122Code(39), "www.", 400, 524292);
        } catch (IllegalArgumentException e2) {
            return new TextBox(e.m122Code(39), "www.", 200, 0);
        }
    }

    /* renamed from: Code  reason: collision with other method in class */
    private void m76Code(int i2, int i3) {
        int i4;
        String Code2;
        if (this.f162d && !f128b) {
            m78Code((Graphics) null);
            this.f166j = false;
            if (f110J != null) {
                f110J.cancel();
                f110J = null;
            }
            if (e.b == 3 && i2 == -11) {
                commandAction(f100Code[4], this);
                return;
            }
            e Code3 = m72Code();
            if (Code3 != null) {
                Code3.f360C = -1;
                if (!Code3.m248a() && !m84g() && (Code3.m231Code(1) || (Code3.m231Code(40) && Code3.f367Code != null && ((e.I(Code3.f367Code.f21Code) == 76 || (e.I(Code3.f367Code.f21Code) == 165 && (Code2 = e.m123Code(this.v, e.Code(i2), false)) != null && Code2.indexOf(e.m180I(160)) >= 0)) && ((!(i2 == 1 || i2 == 6) || !Code3.m221C()) && (!(i2 == 2 || i2 == 5) || !Code3.m219B())))))) {
                    int i5 = this.v;
                    if (i5 != 0 || "0123456789".indexOf(i2) != -1) {
                        B b2 = m72Code().f367Code;
                        if (e.aE && b2 != null) {
                            m92Code();
                            e.D = b2.i();
                            e.m141Code(i5, e.Code(i2), e.D);
                            b2.C(false);
                            return;
                        } else if (e.aA && !f128b) {
                            String Code4 = e.m123Code(i5, e.Code(i2), false);
                            m92Code();
                            if (Code4 != null) {
                                Code((e) null, Code4, (String) null);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else if (i2 == 35 || i2 == 42) {
                        B b3 = m72Code().f367Code;
                        String str = b3 != null ? b3.f21Code : null;
                        if (e.aA && !f128b && !m78Code((Graphics) null) && Code3.m231Code(1)) {
                            if (str == null || (e.I(str) != 73 && !str.startsWith("sk:"))) {
                                this.v = i2;
                                m99b();
                                if (!e.aE) {
                                    this.f161Z = new I(4);
                                    this.f150Code.schedule(this.f161Z, 1500);
                                }
                                B b4 = m72Code().f367Code;
                                if (e.aE && b4 != null) {
                                    e.D = b4.i();
                                    Code(148, false);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                if (i2 == -6) {
                    if (!e.af) {
                        commandAction(f100Code[B], this);
                    } else {
                        return;
                    }
                } else if (i2 == -7) {
                    if (!e.af) {
                        commandAction(f100Code[C], this);
                    } else {
                        return;
                    }
                } else if (i2 == -8 && Code3.f367Code != null && Code3.B() != -1) {
                    switch (e.I(Code3.f367Code.f21Code)) {
                        case 90:
                            i4 = 99;
                            break;
                        case 91:
                            i4 = 50;
                            break;
                        case 109:
                            if (Code3.B() <= 0) {
                                i4 = -1;
                                break;
                            } else {
                                i4 = 43;
                                break;
                            }
                        case 136:
                            i4 = 139;
                            break;
                        default:
                            i4 = -1;
                            break;
                    }
                    if (i4 != -1) {
                        Code((e) null, new StringBuffer().append("dialog:").append(e.m180I(i4)).toString(), (String) null);
                    }
                } else if (i2 == -5 && a > 0 && a != 23 && a != 29) {
                    if (a != 28 || B < 0) {
                        commandAction(f100Code[a], this);
                        return;
                    } else {
                        commandAction(f100Code[B], this);
                        return;
                    }
                }
                Code3.m226Code(i2, i3);
                if (e.R) {
                    I.Code();
                } else {
                    repaint();
                }
            }
        }
    }

    private static void Code(int i2, Vector vector, Vector vector2, Object[] objArr) {
        B b2 = (B) objArr[8];
        if (b2 != null && !vector2.contains(objArr) && !b2.m41Code()) {
            vector2.addElement(objArr);
            if (vector.contains(b2)) {
                return;
            }
            if (i2 < 0) {
                int i3 = 0;
                while (i3 < vector.size() && ((B) vector.elementAt(i3)).f15Code <= b2.f15Code) {
                    i3++;
                }
                vector.insertElementAt(b2, i3);
                if (vector.size() > 5) {
                    vector.removeElementAt(vector.size() - 1);
                    return;
                }
                return;
            }
            vector.addElement(b2);
        }
    }

    static void Code(Code code, int i2) {
        code.a(i2);
    }

    private void Code(e eVar) {
        int indexOf = f112J.indexOf(eVar);
        int size = f103I.size();
        if (size - 1 != indexOf) {
            ((e) f112J.elementAt(size - 1)).B(false);
            f112J.removeElementAt(indexOf);
            f112J.insertElementAt(eVar, size - 1);
            eVar.B(true);
            if (eVar.f462d && eVar.f380I == null) {
                eVar.f462d = false;
                if (eVar.f367Code != null) {
                    eVar.Code(true, false, (Hashtable) null);
                }
            }
            I.J();
            if (e.R) {
                I.Code();
            } else {
                repaint();
            }
        }
    }

    private synchronized void Code(e eVar, String str, String str2) {
        if (eVar == null) {
            eVar = m72Code();
        }
        if (str != null) {
            String I2 = e.m181I(str);
            if (I2.equals(e.m180I(66))) {
                f131c = false;
            } else if (I2.startsWith("rtsp://") || str.startsWith("rtsp://")) {
                I i2 = new I(6);
                if (!str.startsWith("rtsp://")) {
                    str = I2;
                }
                i2.f191Code = str;
                e.Code((Runnable) i2);
            }
            if (!e.aA && (str.equals(e.m180I(65)) || str.equals(e.f232C))) {
                e.aA = true;
                e.d(false);
                e.C(false);
            }
            eVar.m229Code(str, (String) null, str2);
        }
    }

    static void Code(Integer num, boolean z2) {
        if (num.intValue() != 0) {
            byte[] bArr = new byte[(f121Z.length + 4)];
            f121Z[0] = (byte) ((bArr.length - 1) / 4);
            System.arraycopy(f121Z, 0, bArr, 0, f121Z.length);
            e.I(num.intValue(), bArr, bArr.length - 4);
            f121Z = bArr;
            f96Code = true;
            if (z2) {
                e.C(false);
            }
        }
    }

    static void Code(String str, String str2, int i2, boolean z2) {
        String str3;
        int length = str2.length();
        B b2 = m72Code().f367Code;
        if (b2 != null) {
            b2.m70i();
        }
        int max = Math.max(5524, str2.length());
        if (e.c > 0) {
            max = e.c;
            str3 = str2;
        } else {
            str3 = str2;
        }
        while (max > 255) {
            if (str3.length() > max) {
                str3 = str3.substring(0, max);
            }
            try {
                TextBox textBox = new TextBox("", str3, max, i2);
                if (str == null) {
                    str = e.m122Code(40);
                }
                textBox.setTitle(new StringBuffer().append(str).append(" (").append(textBox.getMaxSize()).append(")").toString());
                textBox.addCommand(f100Code[9]);
                textBox.addCommand(f100Code[10]);
                if (z2) {
                    textBox.addCommand(f100Code[19]);
                }
                Code((Screen) textBox);
                f89Code.f163f = e.f350v;
                textBox.setCommandListener(f89Code);
                f105I = textBox;
                A = length;
                Z(true);
                return;
            } catch (Throwable th) {
                max -= max / 10;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0253  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Code(javax.microedition.lcdui.Graphics r17) {
        /*
        // Method dump skipped, instructions count: 864
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Code.Code(javax.microedition.lcdui.Graphics):void");
    }

    private static void Code(Graphics graphics, int i2, int i3, int i4, int i5, int i6, int i7, StringBuffer stringBuffer, int i8) {
        int Code2 = e.Code(i6, 0, i7);
        int i9 = i3 + 1;
        int i10 = i7 != 0 ? (int) ((((long) i4) * ((long) Code2)) / ((long) i7)) : 0;
        e.Code(graphics, i2, i9, i10, i5, f98Code[40], f98Code[41]);
        int i11 = i4 - i10;
        graphics.setColor(f98Code[51]);
        graphics.drawLine(i2 + i10, i9, (i2 + i4) - 1, i9);
        if (i11 >= 2) {
            e.Code(graphics, i2 + i10, i9 + 1, i11, i5 - 1, f98Code[30], f98Code[31]);
        }
        if (i10 > 0) {
            e.Code(graphics, (i2 + i10) - 1, i9 + 1, 1, i5 - 1, f98Code[48], f98Code[49]);
            graphics.setColor(f98Code[47]);
            graphics.drawLine(i2, i9, (i2 + i10) - 2, i9);
            graphics.setColor(f98Code[50]);
            graphics.drawLine((i2 + i10) - 1, i9, (i2 + i10) - 1, i9);
            if (i11 > 0) {
                graphics.setColor(f98Code[51]);
                graphics.drawLine(i2 + i10, i9 + 1, i10 + i2, (i9 + i5) - 2);
            }
        }
        graphics.setColor(f98Code[29]);
        if (i8 == 2) {
            stringBuffer.append(' ').append((Code2 * 100) / Math.max(i7, 1)).append('%');
        }
        int length = stringBuffer.length();
        int Code3 = e.Code(0, stringBuffer.toString());
        if (i8 == 1) {
            stringBuffer.append("...".substring(0, ((int) ((System.currentTimeMillis() - f116Z) >> 9)) & 3));
        }
        String stringBuffer2 = stringBuffer.toString();
        if (e.Code(0, stringBuffer2) + ((i4 - Code3) >> 1) > i4) {
            stringBuffer.delete(0, length);
            if (i8 != 1) {
                stringBuffer.insert(0, "...");
            }
            stringBuffer2 = e.Code(0, stringBuffer2, i4, stringBuffer.toString());
            Code3 = e.Code(0, stringBuffer2);
        }
        Code(graphics, 0, stringBuffer2, ((i4 / 2) + i2) - (Code3 / 2), 20);
    }

    private static void Code(Graphics graphics, int i2, String str, int i3, int i4) {
        e.Code(graphics, i2, str, i3, ((f - (b / 2)) - 1) - ((e.B(i2) + e.f244Code[i2 + 6]) / 2), i4);
    }

    private static void Code(Screen screen) {
        if (screen != null && e.f349u) {
            screen.addCommand(f100Code[14]);
        }
    }

    static void Code(Object[] objArr) {
        B b2 = (B) objArr[8];
        if (b2 != null && !b2.f43J) {
            int i2 = 0;
            while (true) {
                if (i2 >= f118Z.size()) {
                    break;
                } else if (objArr[0].equals(((Object[]) f118Z.elementAt(i2))[0])) {
                    f118Z.removeElementAt(i2);
                    break;
                } else {
                    i2++;
                }
            }
            if (f118Z.size() >= 30) {
                f118Z.removeElementAt(0);
            }
            f118Z.addElement(objArr);
            f89Code.Code(f118Z);
        }
    }

    /* renamed from: Code  reason: collision with other method in class */
    private static boolean m77Code(int i2) {
        return d() ? (i2 == -5 || i2 == -6 || (i2 == -7 && C != 26)) ? false : true : e.Code(f122Z, i2);
    }

    static boolean Code(int i2, boolean z2) {
        e Code2 = Code(e.m180I(i2));
        if (Code2 == null || (!z2 && Code2.f380I != null)) {
            return false;
        }
        Code2.f357B = true;
        Code2.m242J();
        return true;
    }

    static boolean Code(B b2) {
        return m72Code().f367Code == b2;
    }

    /* renamed from: Code  reason: collision with other method in class */
    private boolean m78Code(Graphics graphics) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        e Code2;
        int b2;
        int i7;
        String str;
        Graphics graphics2;
        String str2;
        String str3;
        int i8;
        StringBuffer stringBuffer = new StringBuffer();
        B = 23;
        C = 23;
        if (e.aF) {
            i2 = 0;
            i3 = e.H;
            i4 = 160;
            z2 = true;
        } else if (e.m187I()) {
            stringBuffer.append(e.m122Code(245));
            i2 = 1;
            i3 = 0;
            i4 = 0;
            z2 = true;
        } else if (e.F >= 0) {
            int i9 = e.E;
            i2 = 2;
            i3 = e.F;
            i4 = i9;
            z2 = true;
        } else if (e.f277Y && m84g()) {
            String Code3 = e.m122Code(173);
            C = 3;
            if (e.f265J > f91Code.f198Code) {
                i5 = e.f278Z;
                i6 = e.f265J;
                Code3 = e.m122Code(172);
            } else {
                i5 = f91Code.f201I;
                i6 = f91Code.f198Code;
            }
            stringBuffer.append(Code3).append(" ").append(i6 / 1000).append('/').append(i5 / 1000).append(" kB");
            i2 = 0;
            i3 = i6;
            i4 = i5;
            z2 = true;
        } else if (m73Code(1) == null) {
            return false;
        } else {
            B Code4 = m73Code(1).m223Code();
            if (Code4 == null && m73Code(4) != null) {
                Code4 = m73Code(4).m223Code();
            }
            if (Code4 != null && !Code4.f12C && Code4 != null) {
                B = 42;
                e Code5 = m73Code(40);
                if (Code5 != null && Code5.f367Code != null) {
                    B = Code5.f367Code.f14Code;
                    C = Code5.f367Code.f29I;
                } else if (!Code4.m54J() || !e.ax) {
                    C = 3;
                } else {
                    C = 38;
                }
                int Code6 = Code4.Code();
                int I2 = Code4.I();
                switch (Code4.f8C) {
                    case 1:
                        stringBuffer.append(e.m122Code(20));
                        i2 = 1;
                        i3 = I2;
                        i4 = Code6;
                        z2 = true;
                        break;
                    case 2:
                        stringBuffer.append(e.m122Code(22));
                        i2 = 1;
                        i3 = I2;
                        i4 = Code6;
                        z2 = true;
                        break;
                    case 3:
                    case 4:
                        stringBuffer.append(e.m122Code(23));
                        stringBuffer.append(' ').append(Code4.Z() / 1000).append('/').append(Code6 / 1000).append(" kB");
                        i2 = 0;
                        i3 = I2;
                        i4 = Code6;
                        z2 = true;
                        break;
                    default:
                        i2 = 0;
                        i3 = I2;
                        i4 = Code6;
                        z2 = true;
                        break;
                }
            } else {
                m72Code().m220C();
                i2 = 0;
                i3 = 0;
                i4 = 0;
                z2 = false;
            }
        }
        if (e.af) {
            if (!(B == p && C == q && a == r)) {
                k();
            }
            if (!z2) {
                return false;
            }
        }
        if (graphics == null) {
            return z2;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = f - b;
        int i13 = e;
        if (!e.af) {
            graphics.setColor(f98Code[27]);
            graphics.drawLine(0, i12, i13 - 1, i12);
            for (int i14 = 0; i14 < b; i14++) {
                graphics.setColor(this.f147C[i14]);
                graphics.drawLine(0, i12 + i14 + 1, i13 - 1, i12 + i14 + 1);
            }
            String label = f100Code[B].getLabel();
            if (B == 21 && f()) {
                label = "";
            }
            String label2 = f100Code[C].getLabel();
            String label3 = f100Code[a].getLabel();
            if (e.N) {
                label = "";
            }
            i10 = e.Code(0, label) + ((B == 23 || e.N) ? 0 : 4);
            int Code7 = e.Code(0, label2);
            int i15 = C - 23;
            int i16 = Code7 + (((i15 | (-i15)) >>> 31) << 2);
            int Code8 = e.Code(1, label3);
            int i17 = a - 23;
            int i18 = Code8 + (((i17 | (-i17)) >>> 31) << 2);
            if (i10 >= (i13 - i18) / 2 || i16 >= (i13 - i18) / 2) {
                String Code9 = e.Code(0, label, ((i13 - i18) / 2) - 1, ".");
                i10 = e.Code(0, Code9);
                String Code10 = e.Code(0, label2, ((i13 - i18) / 2) - 1, ".");
                str2 = Code10;
                str3 = Code9;
                i8 = e.Code(0, Code10);
            } else {
                str2 = label2;
                str3 = label;
                i8 = i16;
            }
            boolean z3 = C == 12 || C == 38 || (C == 3 && m72Code().m223Code() != null && m72Code().m223Code().m54J() && e.ax);
            boolean z4 = this.f173r != null ? (this.f173r.getWidth() + 3) + i8 < ((i13 - i18) / 2) + -1 ? z3 & true : false : z3;
            i11 = z4 ? i8 + this.f173r.getWidth() + 2 : i8;
            graphics.setColor(f98Code[1]);
            if (this.f149Code == f100Code[B] && f100Code[B] != f100Code[23]) {
                e.Code(graphics, 0, i12 + 2, i10, b - 1, f98Code[8], f98Code[9]);
                graphics.setColor(f98Code[2]);
            }
            Code(graphics, 0, str3, 2, 20);
            graphics.setColor(f98Code[1]);
            if (this.f149Code == f100Code[C] && f100Code[C] != f100Code[23]) {
                e.Code(graphics, i13 - i11, i12 + 2, i11, b - 1, f98Code[8], f98Code[9]);
                graphics.setColor(f98Code[2]);
                if (z4) {
                    graphics.drawImage(this.f173r, (i13 - i11) + 3, (f - this.f173r.getHeight()) - this.x, 20);
                }
            } else if (z4) {
                graphics.drawImage(this.f174s, (i13 - i11) + 3, (f - this.f173r.getHeight()) - this.x, 20);
            }
            Code(graphics, 0, str2, i13 - 2, 24);
            if (this.f149Code == f100Code[a] && f100Code[a] != f100Code[23]) {
                e.Code(graphics, (i13 / 2) - (i18 / 2), i12 + 2, i18, b - 1, f98Code[8], f98Code[9]);
            }
            graphics.setColor(f98Code[1]);
            if (!e.N) {
                Code(graphics, 1, label3, (i13 / 2) + 0, 17);
            }
        }
        if (z2) {
            Code(graphics, i10, f - b, (e - i11) - i10, b, i3, i4, stringBuffer, i2);
            return z2;
        } else if (a != 23) {
            return z2;
        } else {
            int Code11 = e.Code(0, this.f145B);
            if (i10 + (Code11 / 2) + 1 >= i13 / 2 || (Code11 / 2) + i11 + 1 >= i13 / 2) {
                return z2;
            }
            int i19 = this.v;
            char c2 = ' ';
            c2 = ' ';
            c2 = ' ';
            c2 = ' ';
            c2 = ' ';
            c2 = ' ';
            c2 = ' ';
            int i20 = i19;
            if (i19 == 0) {
                B b3 = m72Code().f367Code;
                i20 = i19;
                if (b3 != null) {
                    i20 = i19;
                    if (b3.m49I()) {
                        String I3 = m72Code().f367Code.m46I();
                        i20 = i19;
                        if (I3 != null) {
                            char[] Code12 = e.m167Code(I3);
                            if (!m72Code().m231Code(2) || f131c) {
                                char c3 = Code12[0];
                                c2 = Code12[1];
                                i20 = c3;
                            } else {
                                i20 = i19;
                                if (Code12[0] != 0) {
                                    i20 = i19;
                                    if (f110J == null) {
                                        f110J = new I(24);
                                        this.f150Code.schedule(f110J, 1500);
                                        i20 = i19;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i20 == 0) {
                graphics.setColor(f98Code[1]);
                if (m72Code().m249b() < 0) {
                    Code(graphics, 0, this.f145B, i13 / 2, 17);
                }
            } else if ("0123456789".indexOf(i20 == 1 ? 1 : 0) != -1) {
                graphics.drawImage(this.f152Code, i13 / 2, i12 + 1, 17);
                graphics.setColor(f98Code[32]);
                Code(graphics, 1, String.valueOf((char) i20), i13 / 2, 17);
            } else {
                graphics.drawImage(this.f152Code, (i13 / 2) - 1, i12 + 1, 24);
                graphics.drawImage(this.f152Code, i13 / 2, i12 + 1, 20);
                graphics.setColor(f98Code[32]);
                Code(graphics, 1, String.valueOf((char) i20), ((i13 - this.f152Code.getWidth()) / 2) - 1, 17);
                if (!e.m153Code(c2 == 1 ? (char) 1 : 0)) {
                    Image Code13 = e.m133Code(c2, f98Code[32]);
                    graphics.drawImage(Code13, (this.f152Code.getWidth() + i13) / 2, ((f - (b / 2)) - 1) - (Code13.getHeight() / 2), 17);
                } else {
                    Code(graphics, 1, String.valueOf(c2), (this.f152Code.getWidth() + i13) / 2, 17);
                }
            }
            if (!m85h() || (Code2 = m72Code()) == null || (b2 = Code2.m249b()) < 0 || b2 >= 1000) {
                return z2;
            }
            int[] iArr = new int[3];
            int i21 = 0;
            while (b2 > 0) {
                iArr[i21] = b2 % 10;
                b2 /= 10;
                i21++;
            }
            graphics.drawImage(this.f152Code, (i13 / 2) - 1, i12 + 1, 24);
            graphics.drawImage(this.f152Code, i13 / 2, i12 + 1, 20);
            graphics.setColor(f98Code[32]);
            if (i21 > 0) {
                i7 = 1;
                str = String.valueOf(iArr[i21 - 1]);
                graphics2 = graphics;
            } else {
                i7 = 1;
                str = "0";
                graphics2 = graphics;
            }
            Code(graphics2, i7, str, ((i13 - this.f152Code.getWidth()) / 2) - 1, 17);
            if (i21 <= 1) {
                return z2;
            }
            Code(graphics, 1, String.valueOf(iArr[i21 - 2]), (this.f152Code.getWidth() + i13) / 2, 17);
            return z2;
        }
    }

    static boolean Code(boolean[] zArr) {
        B Code2;
        boolean z2 = false;
        for (int i2 = 0; i2 < f103I.size(); i2++) {
            if (!zArr[i2] && ((Code2 = ((e) f103I.elementAt(i2)).m223Code()) == null || Code2.f8C >= 4)) {
                zArr[i2] = true;
                z2 = true;
            }
        }
        return z2;
    }

    static int I() {
        return f103I.size();
    }

    private int I(int i2) {
        if (d() && e.Code(i2, -1, false) != -1) {
            return i2;
        }
        if (!e.Q || g <= h) {
            if (!e.M) {
                return i2;
            }
            switch (i2) {
                case 1:
                    return 2;
                case 2:
                    return 6;
                case 3:
                case 4:
                default:
                    if (this.f161Z == null && m83e()) {
                        switch (i2) {
                            case 50:
                                return 52;
                            case 52:
                                return 56;
                            case 54:
                                return 50;
                            case 56:
                                return 54;
                        }
                    }
                    if (e.O && g > 300) {
                        return i2;
                    }
                    if (i2 == -6) {
                        return -7;
                    }
                    if (i2 == -7) {
                        return -6;
                    }
                    return i2;
                case 5:
                    return 1;
                case 6:
                    return 5;
            }
        } else if (i2 == -6) {
            return -7;
        } else {
            if (i2 == -7) {
                return -6;
            }
            if (this.f161Z != null || !m83e()) {
                return i2;
            }
            switch (i2) {
                case 50:
                    return 52;
                case 51:
                case 53:
                case 55:
                default:
                    return i2;
                case 52:
                    return 56;
                case 54:
                    return 50;
                case 56:
                    return 54;
            }
        }
    }

    private static int I(int i2, int i3) {
        return e.M ? i3 : i2;
    }

    private static int I(int i2, int i3, int i4, int i5) {
        if (i2 < 0) {
            return Code(i2, 0, 0) + i4;
        }
        return i5 - Code(i3 - i2, ((i5 - i4) * 100) / 100, (i3 * 100) / 100);
    }

    /* renamed from: I  reason: collision with other method in class */
    static e m79I() {
        return (e) f112J.elementAt(f103I.size() - 1);
    }

    /* renamed from: I  reason: collision with other method in class */
    private void m80I(int i2, int i3) {
        if (i2 >= 2) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f159J < 5000 && i2 == 2) {
                i2++;
                i3++;
            }
            this.f159J = currentTimeMillis;
        }
        if (i2 >= 2 || i2 < 0) {
            try {
                Vector vector = new Vector();
                Vector vector2 = new Vector();
                if (f118Z != null) {
                    for (int size = f118Z.size() - 1; size >= 0; size--) {
                        Code(i2, vector, vector2, (Object[]) f118Z.elementAt(size));
                    }
                }
                for (int i4 = 0; i4 < f112J.size(); i4++) {
                    e eVar = (e) f112J.elementAt(i4);
                    for (int size2 = eVar.f374Code.size() - 1; size2 >= 0; size2--) {
                        Code(i2, vector, vector2, (Object[]) eVar.f374Code.elementAt(size2));
                    }
                }
                int size3 = vector2.size() - 1;
                while (size3 >= 0) {
                    Object[] objArr = (Object[]) vector2.elementAt(size3);
                    B b2 = (B) objArr[8];
                    if (vector.contains(b2)) {
                        b2.m36Code(2);
                        objArr[8] = null;
                        size3--;
                    } else {
                        b2.m36Code(i3 + 1);
                        size3--;
                    }
                }
            } catch (OutOfMemoryError e2) {
                for (int i5 = 0; i5 < f118Z.size(); i5++) {
                    Object[] objArr2 = (Object[]) f118Z.elementAt(i5);
                    B b3 = (B) objArr2[8];
                    if (b3 != null && !b3.m41Code()) {
                        objArr2[8] = null;
                    }
                }
                for (int i6 = 0; i6 < f112J.size(); i6++) {
                    e eVar2 = (e) f112J.elementAt(i6);
                    for (int i7 = 0; i7 < eVar2.f374Code.size(); i7++) {
                        Object[] objArr3 = (Object[]) eVar2.f374Code.elementAt(i7);
                        B b4 = (B) objArr3[8];
                        if (b4 != null && !b4.m41Code()) {
                            objArr3[8] = null;
                        }
                    }
                }
            }
        }
        int size4 = f112J.size();
        while (true) {
            int i8 = size4 - 1;
            if (size4 <= 0) {
                break;
            }
            ((e) f112J.elementAt(i8)).m238I(i3);
            size4 = i8;
        }
        if (i3 > 0) {
            e.t();
        }
        if (i2 >= 3) {
            m();
        }
        System.gc();
    }

    /* renamed from: I  reason: collision with other method in class */
    static boolean m81I() {
        for (int i2 = 0; i2 < f112J.size(); i2++) {
            if (((e) f112J.elementAt(i2)).m223Code() != null) {
                return true;
            }
        }
        return false;
    }

    static void J() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        Vector vector = e.f269J;
        Vector vector2 = vector;
        int i2 = 0;
        int i3 = 0;
        while (i2 < vector2.size()) {
            try {
                Object[] Code2 = e.Code(vector, i3);
                int Code3 = e.Code(Code2, 9);
                int i4 = Code3 & 2;
                int i5 = Code3 & 4;
                int i6 = ((Code3 & 1) << 7) | (((i4 | (-i4)) >>> 31) << 6) | (((i5 | (-i5)) >>> 31) * 224);
                dataOutputStream.writeByte((byte) ((i3 + 1) | i6));
                if ((i6 & 64) != 0) {
                    dataOutputStream.writeInt(e.Code(Code2, 10));
                }
                int i7 = i3 + 1;
                vector2 = vector;
                i2 = i7;
                i3 = i7;
            } catch (IOException e2) {
            }
        }
        f107I = byteArrayOutputStream.toByteArray();
        f106I = false;
    }

    static void J(int i2) {
        e I2 = m79I();
        int size = f103I.size();
        for (int i3 = 0; i3 < size; i3++) {
            e eVar = (e) f103I.elementAt(i3);
            if (!(eVar == I2 || eVar.f367Code == null || e.I(eVar.f367Code.f21Code) != i2)) {
                eVar.f462d = true;
            }
        }
    }

    static int Z() {
        return f103I.indexOf(m79I());
    }

    private static int Z(int i2, int i3) {
        return e.M ? g - i2 : i3;
    }

    /* renamed from: Z  reason: collision with other method in class */
    static void m82Z() {
        int i2 = (!e.aD ? 1 : 0) + 5 + 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(i2);
            dataOutputStream.writeByte(4);
            dataOutputStream.writeInt(e.s);
            dataOutputStream.writeByte(17);
            dataOutputStream.writeInt(e.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeInt(e.t);
            if (!e.aD) {
                dataOutputStream.writeByte(15);
                dataOutputStream.writeInt(e.A);
            }
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(e.u);
            dataOutputStream.writeByte(31);
            dataOutputStream.writeInt(e.w);
            dataOutputStream.writeByte(1);
            dataOutputStream.writeInt(e.x);
            dataOutputStream.writeByte(2);
            dataOutputStream.writeInt(e.y);
        } catch (IOException e2) {
        }
        f97Code = byteArrayOutputStream.toByteArray();
    }

    static void Z(boolean z2) {
        if (f105I != null) {
            if (!z2 || A <= f105I.getMaxSize()) {
                Browser.display.setCurrent(f105I);
                if (!e.f274L) {
                    e.f274L = true;
                    e.C(false);
                    return;
                }
                return;
            }
            f89Code.Code((e) null, new StringBuffer().append("overlay:").append(e.m180I(144)).toString(), (String) null);
        }
    }

    private synchronized void a(int i2) {
        if (i2 == this.w && this.f149Code != null) {
            ((e) this.f149Code).m218B();
        }
    }

    static boolean a() {
        return f143k;
    }

    static boolean b() {
        for (int i2 = 0; i2 < f103I.size(); i2++) {
            if (((e) f103I.elementAt(i2)).m223Code() != null) {
                return true;
            }
        }
        return false;
    }

    private static boolean c() {
        return !e.aA && e.f286a.length() > 0;
    }

    private static boolean d() {
        e Code2 = m72Code();
        return Code2 != null && Code2.m231Code(16);
    }

    static void e() {
        if (!f143k) {
            f143k = true;
            f89Code.repaint();
        }
        f144l = true;
    }

    /* renamed from: e  reason: collision with other method in class */
    private static boolean m83e() {
        return !m72Code().m248a() && !e.aE && e.m204c() && !m72Code().m231Code(2);
    }

    private static boolean f() {
        String Z2;
        e Code2 = m73Code(1);
        return (Code2 == null || Code2.f367Code == null || ((Z2 = Code2.f367Code.m55Z()) != null && Z2.startsWith("myopera:///b/g/"))) ? false : true;
    }

    static void g() {
        for (int i2 = 0; i2 < f118Z.size(); i2++) {
            ((Object[]) f118Z.elementAt(i2))[8] = null;
        }
        int size = f103I.size();
        for (int i3 = 0; i3 < size; i3++) {
            e eVar = (e) f112J.elementAt(i3);
            for (int i4 = 0; i4 < eVar.f374Code.size(); i4++) {
                ((Object[]) eVar.f374Code.elementAt(i4))[8] = null;
            }
        }
    }

    /* renamed from: g  reason: collision with other method in class */
    private static boolean m84g() {
        return f91Code.f198Code >= 0 || e.f265J >= 0;
    }

    static void h() {
        for (int i2 = 0; i2 < f118Z.size(); i2++) {
            try {
                B b2 = (B) ((Object[]) f118Z.elementAt(i2))[8];
                if (b2 != null) {
                    b2.f23Code = null;
                }
            } catch (Throwable th) {
                return;
            }
        }
        int size = f103I.size();
        for (int i3 = 0; i3 < size; i3++) {
            e eVar = (e) f112J.elementAt(i3);
            if (!(eVar == null || eVar.f374Code == null)) {
                for (int i4 = 0; i4 < eVar.f374Code.size(); i4++) {
                    B b3 = (B) ((Object[]) eVar.f374Code.elementAt(i4))[8];
                    if (b3 != null) {
                        b3.f23Code = null;
                    }
                }
            }
        }
    }

    /* renamed from: h  reason: collision with other method in class */
    private static boolean m85h() {
        e Code2 = m72Code();
        if (Code2 != null) {
            return Code2.m248a();
        }
        return false;
    }

    private void j() {
        e Code2 = m73Code(1);
        if (Code2 != null && Code2.f367Code != null) {
            if (Code2.f367Code.f50Z) {
                if (Code2.f367Code.J() != e) {
                    Code2.f357B = true;
                    Code2.m242J();
                }
            } else if (Code2.f367Code.J() > e && e.am) {
                Code((e) null, new StringBuffer().append("overlay:").append(e.m180I(126)).toString(), (String) null);
            }
        }
    }

    private void k() {
        if (!f128b && e.af) {
            for (int i2 = 0; i2 < f100Code.length; i2++) {
                if (!(f100Code[i2] == null || i2 == 23 || i2 == 28)) {
                    removeCommand(f100Code[i2]);
                    if (B == i2 || C == i2 || a == i2) {
                        if (i2 == 1) {
                            if (i2 != a) {
                                addCommand(f100Code[i2]);
                            }
                        } else if (i2 != a) {
                            addCommand(f100Code[i2]);
                        }
                    }
                }
            }
            p = B;
            q = C;
            r = a;
        }
    }

    private static void l() {
        for (int i2 = 0; i2 < f112J.size(); i2++) {
            ((e) f112J.elementAt(i2)).m237I();
        }
    }

    private static void m() {
        e I2 = m79I();
        for (int i2 = 0; i2 < f103I.size(); i2++) {
            e eVar = (e) f103I.elementAt(i2);
            if (eVar != I2) {
                eVar.m254g();
            }
        }
    }

    private void n() {
        if (e.f226A) {
            setFullScreenMode(false);
        }
        List list = new List(e.m122Code(6), 3);
        for (int size = f93Code.size() - 1; size >= 0; size--) {
            list.append((String) f93Code.elementAt(size), (Image) null);
        }
        list.setSelectCommand(f100Code[9]);
        list.addCommand(f100Code[4]);
        Code((Screen) list);
        list.setCommandListener(this);
        Browser.display.setCurrent(list);
    }

    private static void o() {
        e Code2 = m72Code();
        if (Code2 != null) {
            Code2.Z(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void B(int i2) {
        m80I(i2, i2 - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B  reason: collision with other method in class */
    public final boolean m86B() {
        return ((!e.f273K || d() || (f112J.size() > 0 && (m72Code().f367Code.f14Code > 0 || m72Code().f367Code.f29I > 0))) && !e.af) || m78Code(null);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void C() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.u >= 0 && currentTimeMillis >= this.f148Code) {
            this.f148Code = currentTimeMillis + 40;
            this.f164g = true;
            e();
        } else if (currentTimeMillis >= this.f148Code + 20000) {
            this.f155I.cancel();
            this.f155I = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void C(int i2) {
        m80I(i2 - 1, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C  reason: collision with other method in class */
    public final boolean m87C() {
        return m78Code((Graphics) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final int m88Code() {
        return this.v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final void m89Code() {
        e.s();
        b = Math.max(e.J(0), e.J(1)) + 3;
        c = Math.max(10, e.B(1)) + 3;
        if (e.f339o) {
            b += 4;
        }
        b = Math.max(b, b < 16 ? 14 : 18);
        f98Code = new int[76];
        this.f158I = new int[c];
        this.f147C = new int[b];
        Image image = null;
        if (!e.aB) {
            byte[] Code2 = e.m163Code(e.r, "b");
            if (Code2 != null) {
                image = Image.createImage(Code2, 0, Code2.length);
            }
            if (image == null || image.getWidth() < 135) {
                image = null;
                e.aB = true;
            }
        }
        if (image == null) {
            image = e.m184I(68);
        }
        if (image != null) {
            image.getRGB(f98Code, 0, f98Code.length, 0, 21, f98Code.length, 1);
            if (B.I == null) {
                Image[] imageArr = new Image[2];
                B.I = imageArr;
                imageArr[0] = e.Code(image, 124, 0, 11, 10, 0);
                B.I[1] = e.Code(image, 124, 10, 11, 10, 0);
                if (e.f346s) {
                    f119Z = e.Code(image, 103, 0, 10, 10, 0);
                    f113J = e.Code(image, 113, 0, 1, 10, 0);
                    f84B = e.Code(image, 114, 0, 10, 10, 0);
                    f86C = e.Code(image, 103, 10, 6, 1, 0);
                    f124a = e.Code(image, 118, 10, 6, 1, 0);
                    f133d = e.Code(image, 103, 11, 10, 10, 0);
                    f130c = e.Code(image, 113, 11, 1, 10, 0);
                    f127b = e.Code(image, 114, 11, 10, 10, 0);
                }
            }
            this.f171p = e.Code(Image.createImage(image, 62, 0, 20, 22, 0), 1, c, 1, false);
            this.f172q = e.Code(Image.createImage(image, 82, 0, 20, 22, 0), 1, c, 1, false);
            this.f152Code = e.Code(Image.createImage(image, 42, 0, 20, 20, 0), 0, b - 1, 1, false);
            Image Code3 = e.Code(Image.createImage(image, 102, 0, 1, 22, 0), 1, b, 1, false);
            image = e.Code(Image.createImage(image, 0, 0, 42, 22, 0), 1, c, 1, false);
            Image.createImage(image, 0, 0, 1, c, 0).getRGB(this.f158I, 0, 1, 0, 0, 1, c);
            Image.createImage(Code3, 0, 0, 1, b, 0).getRGB(this.f147C, 0, 1, 0, 0, 1, b);
        }
        this.f170o = image;
        e.f262I = f98Code;
        if (e.f325i.equals("pink")) {
            f98Code[72] = -420071261;
            f98Code[73] = -419794495;
            f98Code[74] = -420205153;
            f98Code[75] = 13224393;
            e.G = 0;
        } else if (e.f325i.equals("snow")) {
            f98Code[72] = -203629348;
            f98Code[73] = -202247695;
            f98Code[74] = -206458447;
            f98Code[75] = 10066329;
            e.G = 6;
        } else {
            f98Code[72] = -855638016;
            f98Code[73] = -852348366;
            f98Code[74] = -855638016;
            f98Code[75] = 7895160;
            e.G = 0;
        }
        d = Math.min(16, c - 4);
        e.t();
        l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final void m90Code(int i2) {
        int size = f103I.size();
        if (i2 >= 0 && i2 < size) {
            e eVar = (e) f103I.elementAt(i2);
            if (size <= 1) {
                m102f();
            } else if (i2 == Z()) {
                if (i2 < size - 1) {
                    m95I(i2 + 1);
                } else {
                    m95I(i2 - 1);
                }
            }
            I(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void Code(e eVar, String str) {
        Code(eVar, str, (String) null);
    }

    /* access modifiers changed from: package-private */
    public final void Code(Object obj) {
        if (this.f162d) {
            if (obj == e.f234C || obj == e.f269J || ((obj == e.f287a && e.f277Y) || obj == e.f261I || (obj == e.f230B && e.ay))) {
                J(65);
            }
            if (obj == e.f234C) {
                J(109);
            } else if (obj == e.f269J) {
                J(91);
            } else if (obj == e.f282Z) {
                J(90);
            } else if (obj == e.f287a) {
                J(136);
            } else if (obj == f118Z) {
                J(86);
            } else if (obj == e.f260I) {
                J(148);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final void m91Code(String str) {
        Code(e.m122Code(37), str);
    }

    /* access modifiers changed from: package-private */
    public final void Code(String str, String str2) {
        e Code2 = m72Code();
        if (Code2.f367Code != null && Code2.f367Code.f21Code.equals(e.m180I(70))) {
            I(Code2);
        }
        StringBuffer stringBuffer = new StringBuffer();
        e.Code(stringBuffer.append("a="), str);
        if (str2 != null) {
            e.Code(stringBuffer.append("&b="), str2);
        }
        m72Code().m229Code(new StringBuffer().append("overlay:").append(e.m180I(70)).toString(), (String) null, stringBuffer.toString());
    }

    /* access modifiers changed from: package-private */
    public final void Code(String str, String str2, int i2, e eVar) {
        Code(str, null, str2, i2, eVar, f112J.size());
    }

    /* access modifiers changed from: package-private */
    public final void Code(String str, String str2, String str3, boolean z2) {
        if (m <= 0 || f103I.size() < m) {
            int size = f103I.size();
            if (z2 && size > 0) {
                size--;
            }
            if (e.I(str) != 65) {
                Code(e.m180I(168), null, null, 1, null, size).m229Code(str, str2, str3);
            } else {
                Code(str, str2, str3, 1, null, size);
            }
        } else {
            Code((e) null, new StringBuffer().append("overlay:").append(e.m180I(167)).toString(), (String) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final void Code(boolean z2) {
        boolean z3 = false;
        if (z2 != e.M) {
            e.M = z2;
            try {
                f89Code.m89Code();
                f89Code.sizeChanged(-1, -1);
                j();
            } catch (Throwable th) {
                if (((z2 && (!e.f339o || e.P)) ^ (e.O && g > 300)) || (e.Q && g > h)) {
                    z3 = true;
                }
                e.N = z3;
                throw th;
            }
        }
        if (((z2 && (!e.f339o || e.P)) ^ (e.O && g > 300)) || (e.Q && g > h)) {
            e.N = true;
        } else {
            e.N = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final boolean m92Code() {
        boolean z2 = false;
        this.v = 0;
        if (this.f161Z != null) {
            this.f161Z.cancel();
            this.f161Z = null;
        }
        if (m72Code().m231Code(40) && m72Code().f367Code.f21Code.equals(e.m180I(76))) {
            I(m72Code());
            z2 = true;
        }
        m99b();
        return z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final boolean m93Code(e eVar) {
        boolean z2 = false;
        if (e.F >= 0 || e.aC) {
            return false;
        }
        while (true) {
            e eVar2 = (e) f112J.elementAt(f112J.size() - 1);
            if (eVar2 == eVar) {
                return z2;
            }
            I(eVar2);
            z2 = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I  reason: collision with other method in class */
    public final void m94I() {
        Image[] imageArr;
        Image[] imageArr2;
        Image image;
        Image image2;
        Image I2;
        byte[] Code2 = e.m162Code(8);
        Object[] objArr = new Object[3];
        e.Code(Code2, 0, Code2.length, 256, objArr);
        objArr[0] = e.m172Code((int[]) objArr[0], f98Code[71]);
        if (b < 18) {
            objArr[0] = e.Code((int[]) objArr[0], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue(), 12, 1, true);
            objArr[1] = new Integer(((int[]) objArr[0]).length / 12);
            objArr[2] = new Integer(12);
        }
        this.f173r = Image.createRGBImage((int[]) objArr[0], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue(), true);
        this.x = ((b - this.f173r.getHeight()) / 2) - 1;
        this.f174s = e.m138Code(objArr, this.f147C, -this.x);
        if (f134e == null && e.f346s && (I2 = e.m184I(2)) != null) {
            f134e = e.Code(I2, 4, 0, 4, 4, 0);
            f136f = e.Code(I2, 4, 4, 4, 1, 0);
            f137g = e.Code(I2, 4, 5, 4, 4, 0);
            f138h = e.Code(I2, 4, 4, 4, 1, 6);
            f140i = e.Code(I2, 0, 5, 4, 4, 0);
            f141j = e.Code(I2, 0, 4, 4, 1, 0);
            f142k = e.Code(I2, 0, 0, 4, 4, 0);
        }
        if (B.f2Code == null) {
            B.f2Code = new Image[6];
            if (e.f348t) {
                int i2 = 0;
                while (true) {
                    if (e.f354y || e.f349u) {
                        if (i2 >= 5) {
                            break;
                        }
                    } else if (i2 >= 6) {
                        break;
                    }
                    B.f2Code[i2] = e.m184I(i2 + 71);
                    i2++;
                }
            } else {
                for (int i3 = 0; i3 < 5; i3++) {
                    B.f2Code[i3] = e.m184I(i3 + 77);
                }
            }
        }
        if (f115J == null) {
            f115J = e.m162Code(3);
        }
        int B2 = (e.B(0) << 1) / 3;
        Image image3 = null;
        if (f109I == null) {
            f109I = new Image[10];
            Image I3 = e.m184I(85);
            if (I3.getHeight() <= B2) {
                Image I4 = e.m184I(87);
                image2 = I4;
                image3 = I4;
            } else {
                image2 = I3;
                image3 = I3;
            }
            j = image2.getWidth() / 10;
            i = image2.getHeight();
            for (int i4 = 0; i4 < 10; i4++) {
                f109I[i4] = e.Code(image2, j * i4, 0, j, i, 0);
            }
        }
        Image image4 = null;
        if (f123Z == null) {
            f123Z = new Image[10];
            Image I5 = e.m184I(86);
            if (I5.getHeight() <= B2) {
                Image I6 = e.m184I(88);
                image = I6;
                image4 = I6;
            } else {
                image = I5;
                image4 = I5;
            }
            for (int i5 = 0; i5 < 10; i5++) {
                f123Z[i5] = e.Code(image, j * i5, 0, j, i, 0);
            }
        }
        if (i < B2) {
            j = f109I[0].getWidth();
        }
        if (e.f344r && f126a == null) {
            f126a = e.Code(image3);
            image3.getHeight();
            image3.getWidth();
        }
        if (e.f344r && f129b == null) {
            f129b = e.Code(image4);
        }
        if (f99Code == null || f108I == null) {
            int i6 = (i * 50) / 100;
            k = i6;
            int i7 = (i * 150) / 100;
            l = i7;
            int i8 = (i7 - i6) + 1;
            f99Code = new Object[i8];
            f108I = new Object[i8];
            boolean[] zArr = {true, false, false, false, false, true, true, true, false, true, false, true, false};
            boolean[] zArr2 = {true, false, false, false, true, false, true, false, true, true, true, false, true, false, false, true};
            int i9 = i6;
            while (i9 <= i7) {
                if (i8 == 13 && !zArr[i9 - i6]) {
                    i9++;
                } else if (i8 <= 13 || zArr2[i9 - i6]) {
                    if (i9 == i) {
                        imageArr = f109I;
                        imageArr2 = f123Z;
                    } else {
                        imageArr = new Image[10];
                        imageArr2 = new Image[10];
                        for (int i10 = 0; i10 < 10; i10++) {
                            imageArr[i10] = e.Code(f109I[i10], 0, i9, 1, true);
                            imageArr2[i10] = e.Code(f123Z[i10], 0, i9, 1, true);
                        }
                    }
                    f99Code[i9 - i6] = imageArr;
                    f108I[i9 - i6] = imageArr2;
                    i9++;
                } else {
                    i9++;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I  reason: collision with other method in class */
    public final void m95I(int i2) {
        if (i2 >= 0 && i2 < f103I.size()) {
            Code((e) f103I.elementAt(i2));
        }
    }

    /* access modifiers changed from: package-private */
    public final void I(String str) {
        Code((e) null, str, (String) null);
    }

    /* access modifiers changed from: package-private */
    public final void I(String str, String str2) {
        Code((e) null, str, str2);
    }

    /* access modifiers changed from: package-private */
    public final void I(boolean z2) {
        this.f166j = z2;
    }

    /* access modifiers changed from: package-private */
    public final boolean I(e eVar) {
        boolean z2 = true;
        if (eVar.m231Code(16)) {
            eVar.f369Code.m251c();
        }
        if (f112J.size() > 1) {
            eVar.m245Z();
            f112J.removeElement(eVar);
            if (eVar.m231Code(1)) {
                f103I.removeElement(eVar);
            }
            m92Code();
        } else {
            z2 = false;
        }
        repaint();
        I.J();
        return z2;
    }

    /* access modifiers changed from: package-private */
    public final void J(String str) {
        if (e.f226A) {
            setFullScreenMode(false);
        }
        if (e.f352w) {
            this.f153Code = m75Code();
        } else {
            this.f153Code.removeCommand(f100Code[9]);
            this.f153Code.removeCommand(f100Code[10]);
            this.f153Code.removeCommand(f100Code[15]);
            this.f153Code.removeCommand(f100Code[18]);
            this.f153Code.removeCommand(f100Code[14]);
            this.f153Code.removeCommand(f100Code[11]);
        }
        this.f153Code.addCommand(f100Code[9]);
        this.f153Code.addCommand(f100Code[10]);
        this.f153Code.addCommand(f100Code[11]);
        if (f93Code.size() > 0) {
            this.f153Code.addCommand(f100Code[15]);
        }
        if (e.I(m73Code(1).f367Code.f21Code) == -1) {
            this.f153Code.addCommand(f100Code[18]);
        }
        Code((Screen) this.f153Code);
        this.f153Code.setCommandListener(this);
        if (str == null) {
            this.f153Code.setString("www.");
        } else {
            this.f153Code.setString(str);
        }
        Browser.display.setCurrent(this.f153Code);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J  reason: collision with other method in class */
    public final boolean m96J() {
        return !e.f273K || (e.N && m86B());
    }

    /* access modifiers changed from: package-private */
    public final void Z(int i2) {
        int size = f103I.size();
        if (size >= 2) {
            Code((e) f103I.elementAt(((Z() + i2) + size) % size));
        }
    }

    /* access modifiers changed from: package-private */
    public final void Z(String str) {
        String trim = str.trim();
        if (!trim.equals("www.") && trim.length() > 0) {
            if (f93Code.contains(trim)) {
                f93Code.removeElement(trim);
            }
            if (f93Code.size() > 30) {
                f93Code.removeElement(f93Code.firstElement());
            }
            f93Code.addElement(trim);
            if ("debug:".equals(trim)) {
                f135e = true;
            }
            if (f135e && "opera:routing".equals(trim)) {
                if (!e.f289a) {
                    e.f289a = true;
                } else {
                    e.f289a = false;
                }
            }
            Code((e) null, new StringBuffer().append("ext:").append(trim).toString(), (String) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final void Z(String str, String str2) {
        if (str.startsWith("http://")) {
            str2 = e.Code(str2, true);
        }
        Code((e) null, new StringBuffer().append("ext:").append(e.Code(str, "%s", str2)).toString(), (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z  reason: collision with other method in class */
    public final boolean m97Z() {
        return this.f166j || m72Code().f367Code == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public final void m98a() {
        e.f273K = !e.f273K;
        l();
        repaint();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: collision with other method in class */
    public final void m99b() {
        if (e.f252E) {
            repaint();
            return;
        }
        int i2 = f - b;
        int i3 = e;
        int i4 = b;
        if (e.R) {
            I.Code();
        } else if (!this.f162d || f128b) {
            repaint();
        } else {
            int max = Math.max(0, 0);
            int max2 = Math.max(i2, 0);
            if (e.M) {
                repaint(max, 0, (i2 + i4) - max2, i3 - max);
            } else {
                repaint(max, max2, i3 - max, (i2 + i4) - max2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: collision with other method in class */
    public final void m100c() {
        if (this.f151Code == null) {
            f116Z = System.currentTimeMillis();
            this.f151Code = new I(1);
            this.f150Code.schedule(this.f151Code, 0, 500);
        }
    }

    public final synchronized void commandAction(Command command, Displayable displayable) {
        Code code;
        String str;
        if (this.f163f) {
            this.f163f = false;
        } else {
            if (m72Code().f367Code != null && m72Code().f367Code.m62b()) {
                if (e.aE && command == f100Code[11]) {
                    e.D = m72Code().f367Code.i();
                    e.m146Code((String) null, e.D);
                    m72Code().f367Code.C(false);
                } else if (command == f100Code[29]) {
                    m72Code().f367Code.C(true);
                }
            }
            if (m85h()) {
                if (command == f100Code[9]) {
                    m72Code().m252d();
                } else if (command == f100Code[10]) {
                    m72Code().m249b();
                    o();
                }
                if (e.R) {
                    I.Code();
                } else {
                    repaint();
                }
            } else if (command != f100Code[3] || !m72Code().f456b) {
                if (e.U && command == f100Code[4] && this.s == -11) {
                    this.f163f = true;
                }
                if (command == f100Code[14]) {
                    Browser.Code();
                } else if (!m92Code()) {
                    if (displayable == this) {
                        Code((e) null, Code(command), (String) null);
                    } else {
                        if (command == f100Code[4] || command == f100Code[10]) {
                            if (displayable instanceof List) {
                                code = this.f153Code;
                            }
                            code = this;
                        } else if (command == f100Code[9] || command == List.SELECT_COMMAND || command == f100Code[19]) {
                            if (displayable instanceof List) {
                                List list = (List) displayable;
                                int selectedIndex = list.getSelectedIndex();
                                if (selectedIndex >= 0) {
                                    this.f153Code.setString(list.getString(selectedIndex));
                                }
                                code = this.f153Code;
                            } else {
                                if (displayable instanceof TextBox) {
                                    String string = ((TextBox) displayable).getString();
                                    if ((m72Code().f367Code == null || m72Code().f367Code.b == 97 || string.indexOf(10) == -1) && string.indexOf(8232) == -1 && string.indexOf(8233) == -1) {
                                        str = string;
                                    } else {
                                        StringBuffer stringBuffer = new StringBuffer(string);
                                        e.Code(stringBuffer, (char) 8233, '\n');
                                        e.Code(stringBuffer, (char) 8232, '\n');
                                        if (m72Code().f367Code.b != 97) {
                                            e.Code(stringBuffer, '\n', displayable == this.f153Code ? 0 : ' ');
                                        }
                                        str = stringBuffer.toString();
                                    }
                                    if (command == f100Code[19]) {
                                        Code((e) null, e.m180I(47), (String) null);
                                    } else if (m72Code().m231Code(16)) {
                                        m72Code().m228Code(str);
                                    } else if (e.I(m72Code().f367Code.f21Code) == 109) {
                                        Z((String) e.Code(e.f234C, e.q)[0], str);
                                    } else if (m72Code().f360C == 127) {
                                        try {
                                            B b2 = m72Code().f367Code;
                                            e Code2 = m72Code();
                                            if (b2.Code(str) == 0) {
                                                Code2.m229Code(new StringBuffer().append("overlay:").append(e.m180I(46)).toString(), (String) null, (String) null);
                                            } else {
                                                b2.m69h();
                                                Code2.f456b = true;
                                                b2.Z = b2.f14Code;
                                                b2.J = b2.f29I;
                                                b2.f14Code = 24;
                                                b2.f29I = 3;
                                            }
                                        } catch (Throwable th) {
                                        }
                                    } else if (e.I(m72Code().f367Code.f21Code) == 60) {
                                        I i2 = new I(35);
                                        i2.f192I = str;
                                        i2.f189Code = m72Code();
                                        e.Code((Runnable) i2);
                                    } else if (!m72Code().f367Code.m43Code(str, false)) {
                                        Z(str);
                                    }
                                    if (e.f251D) {
                                        Alert alert = new Alert(e.f259I, e.m122Code(22), (Image) null, AlertType.INFO);
                                        alert.setTimeout(50);
                                        Browser.display.setCurrent(alert, this);
                                        code = null;
                                    }
                                }
                                code = this;
                            }
                        } else if (command == f100Code[15]) {
                            n();
                            code = null;
                        } else {
                            if (command == f100Code[18]) {
                                try {
                                    e Code3 = m73Code(1);
                                    if (e.I(Code3.f367Code.f21Code) == -1) {
                                        this.f153Code.setString(Code3.f367Code.f21Code);
                                        code = null;
                                    }
                                } catch (Throwable th2) {
                                    this.f153Code.setString("www.");
                                    code = null;
                                }
                            } else if (command == f100Code[11] && this.f153Code != null && Browser.display.getCurrent() == this.f153Code) {
                                this.f153Code.setString("www.");
                            }
                            code = null;
                        }
                        if (e.f226A && code == this) {
                            setFullScreenMode(true);
                        }
                        if (code != null) {
                            Browser.display.setCurrent(code);
                        }
                    }
                }
            } else {
                m72Code().f367Code.m70i();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: collision with other method in class */
    public final void m101d() {
        if (this.f151Code != null) {
            this.f151Code.cancel();
            this.f151Code = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: collision with other method in class */
    public final void m102f() {
        Code(e.m180I(65), (String) null, (String) null, false);
    }

    /* access modifiers changed from: protected */
    public final synchronized void hideNotify() {
        this.u = -1;
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        this.f145B = Code(-1, true, (Calendar) null);
    }

    /* access modifiers changed from: protected */
    public final synchronized void keyPressed(int i2) {
        try {
            e.u();
            e.m191J(i2);
            if ((!e.aF || m77Code(Code(i2))) && this.f149Code == null) {
                if (!e.f276X || i2 != -6 || f101I + 100 <= System.currentTimeMillis()) {
                    if (e.b == -1 && i2 == this.s + 100) {
                        getKeyName(i2);
                    }
                    if (!e.ag || i2 != 59440) {
                        this.s = i2;
                        if (i2 == -11 && e.b == 3) {
                            e.T = true;
                        }
                        int I2 = I(Code(i2));
                        this.u = -1;
                        if (!e.T || m77Code(I2)) {
                            if (m85h()) {
                                if (I2 == -5) {
                                    I2 = -6;
                                }
                                if (!e.Code(f132c, I2)) {
                                    o();
                                    if (e.R) {
                                        I.Code();
                                    } else {
                                        repaint();
                                    }
                                }
                            }
                            m76Code(I2, 0);
                            if (!m85h() && m77Code(I2)) {
                                this.f175t = I2;
                                this.u = 0;
                                this.f148Code = System.currentTimeMillis() + ((long) e.d);
                                if (!e.S && this.f155I == null) {
                                    this.f155I = new I(0);
                                    this.f150Code.schedule(this.f155I, 40, 40);
                                }
                            }
                        }
                    }
                } else {
                    f139h = true;
                }
            }
        } catch (Throwable th) {
            B(2);
        }
        return;
    }

    /* access modifiers changed from: protected */
    public final synchronized void keyReleased(int i2) {
        e.u();
        e.m191J(i2);
        e.m196Z(8);
        if ((!e.aF || m77Code(Code(i2))) && this.f149Code == null) {
            if (e.f276X) {
                f101I = -1;
                if (i2 == -6) {
                    if (f139h) {
                        f139h = false;
                    } else {
                        f101I = System.currentTimeMillis();
                    }
                }
                f139h = false;
            }
            if (i2 == this.s) {
                this.s = Integer.MAX_VALUE;
                this.u = -1;
                int I2 = I(Code(i2));
                if (e.T && !m77Code(I2)) {
                    m76Code(I2, 0);
                    if (I2 == -11 && e.b == 3) {
                        e.T = false;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void keyRepeated(int i2) {
        if (!e.aF && this.f149Code == null && e.S && m77Code(I(Code(i2)))) {
            this.f164g = true;
            e();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void paint(Graphics graphics) {
        StringBuffer stringBuffer;
        int i2;
        synchronized (this) {
            if (!this.f162d || f128b) {
                try {
                    e.Code(graphics, graphics.getClipX(), graphics.getClipY(), graphics.getClipWidth(), graphics.getClipHeight(), 16777215);
                    if (this.f168m == null) {
                        if (e.u == 0 || e.v == -1) {
                            this.f169n = e.m184I(84);
                        } else {
                            byte[] Code2 = e.m163Code(e.v, "b");
                            if (Code2 != null) {
                                this.f169n = Image.createImage(Code2, 0, Code2.length);
                            }
                        }
                        this.f168m = e.m184I(69);
                    }
                    if (this.f154Code == null) {
                        Image I2 = e.m184I(83);
                        int height = I2.getHeight();
                        this.f154Code = new Image[4];
                        this.f154Code[0] = Image.createImage(I2, 0, 0, 4, height, 0);
                        this.f154Code[1] = Image.createImage(I2, 5, 0, 4, height, 0);
                        this.f154Code[2] = Image.createImage(I2, 9, 0, 5, height, 0);
                        this.f154Code[3] = Image.createImage(I2, 15, 0, 5, height, 0);
                        this.f160J = new int[height];
                        this.f146B = new int[height];
                        I2.getRGB(this.f160J, 0, 1, 4, 0, 1, height);
                        I2.getRGB(this.f146B, 0, 1, 14, 0, 1, height);
                    }
                    int height2 = this.f154Code[0].getHeight();
                    int i3 = h > 225 ? (h * 80) / 100 : h - 45;
                    int min = Math.min((g << 2) / 5, 230);
                    int i4 = i3 - (height2 / 2);
                    int i5 = (i3 - (height2 / 2)) - 20;
                    int i6 = (height2 / 2) + i3;
                    int min2 = i6 + Math.min(15, ((h - i6) - e.f248Code[0].getHeight()) / 2);
                    if (!(this.f168m == null || this.f154Code == null || i3 <= 0)) {
                        int height3 = i5 - this.f168m.getHeight();
                        if (this.f169n != null) {
                            if (this.f169n.getHeight() <= height3) {
                                int Code3 = e.Code(((h * 40) / 100) - (this.f169n.getHeight() / 2), 0, (height3 - 15) - this.f169n.getHeight());
                                graphics.drawImage(this.f169n, g / 2, Code3, 17);
                                int height4 = (height3 - Code3) - this.f169n.getHeight();
                                if (height4 < 15) {
                                    height3 += (15 - height4) / 2;
                                }
                            } else {
                                e.m142Code(e.v, "b");
                                e.v = -1;
                                this.f169n = null;
                            }
                        }
                        graphics.drawImage(this.f168m, g / 2, height3, 17);
                        int i7 = 1024;
                        int i8 = (this.n + 1) * 256;
                        if (c()) {
                            StringBuffer stringBuffer2 = new StringBuffer(e.m122Code(113));
                            i8 += ((((int) System.currentTimeMillis()) - this.o) << 10) / (60000 * Math.max(1, e.f256I));
                            i7 = 2048;
                            stringBuffer = stringBuffer2;
                        } else {
                            stringBuffer = new StringBuffer(e.m122Code(134));
                        }
                        int i9 = (g - min) / 2;
                        int max = Math.max(this.z, (min * i8) / i7);
                        if (i8 != i7) {
                            if (max - this.f154Code[2].getWidth() < 0) {
                                graphics.drawImage(this.f154Code[2], i9, i4, 0);
                            }
                            int width = (i9 + min) - this.f154Code[3].getWidth();
                            int min3 = Math.min(Math.max(max, this.f154Code[2].getWidth()) + i9, width);
                            for (int i10 = 0; i10 < this.f146B.length; i10++) {
                                graphics.setColor(this.f146B[i10]);
                                graphics.drawLine(min3, i4 + i10, width, i4 + i10);
                            }
                            graphics.drawImage(this.f154Code[3], ((i9 + min) - this.f154Code[3].getWidth()) + 1, i4, 0);
                        }
                        if (max >= this.f154Code[0].getWidth()) {
                            graphics.drawImage(this.f154Code[0], i9, i4, 0);
                            int width2 = this.f154Code[0].getWidth() + i9;
                            int min4 = Math.min(i9 + max, i9 + min);
                            for (int i11 = 0; i11 < this.f160J.length; i11++) {
                                graphics.setColor(this.f160J[i11]);
                                graphics.drawLine(width2, i4 + i11, min4, i4 + i11);
                            }
                            if (max > min - this.f154Code[1].getWidth()) {
                                graphics.drawImage(this.f154Code[1], ((i9 + min) - this.f154Code[1].getWidth()) + 1, i4, 0);
                            }
                        }
                        graphics.setColor(0);
                        graphics.setFont(e.f248Code[0]);
                        graphics.drawString(stringBuffer.append("...").toString(), g / 2, min2, 17);
                        this.z = max;
                    }
                } catch (Throwable th) {
                    B(2);
                }
            } else {
                this.f168m = null;
                this.f169n = null;
                this.f154Code = null;
                this.f160J = null;
                this.f146B = null;
                if (e.f255H || e.M) {
                    if (t == null) {
                        int i12 = (g * h) << 1;
                        if (Browser.display.numColors() > 65536) {
                            i12 <<= 1;
                        }
                        if (e.M) {
                            t = Image.createImage(h, g);
                            Sprite sprite = new Sprite(t);
                            f95Code = sprite;
                            sprite.setTransform(5);
                            f95Code.setPosition(0, 0);
                        } else {
                            t = Image.createImage(g, h);
                        }
                        f94Code = t.getGraphics();
                        e.f279Z = ((long) i12) + e.f279Z;
                    }
                    f104I = graphics;
                    graphics = f94Code;
                    graphics.setClip(0, 0, t.getWidth(), t.getHeight());
                }
                f144l = false;
                if (this.f164g && this.u >= 0) {
                    int i13 = this.f175t;
                    int i14 = this.u + 1;
                    this.u = i14;
                    m76Code(i13, i14);
                }
                this.f164g = false;
                y = (int) System.currentTimeMillis();
                int i15 = 0;
                while (i15 < e) {
                    if (e.M) {
                        i2 = (i15 != 0 || e == t.getWidth()) ? t.getWidth() : e % t.getWidth();
                        graphics.translate((-i15) - graphics.getTranslateX(), -graphics.getTranslateY());
                        graphics.setClip(-graphics.getTranslateX(), 0, i2, t.getHeight());
                    } else {
                        i2 = e;
                    }
                    Code(graphics);
                    if (e.f255H || e.M) {
                        if (e.M) {
                            f104I.setClip(0, 0, g, h);
                            f95Code.setPosition(0, i15);
                            f95Code.paint(f104I);
                        } else {
                            f104I.drawImage(t, 0, 0, 20);
                        }
                    }
                    i15 = i2 + i15;
                }
                if (e.M) {
                    int clipX = (f104I.getClipX() + f104I.getClipWidth()) - 1;
                    int clipY = (f104I.getClipY() + f104I.getClipHeight()) - 1;
                    f104I.drawLine(clipX, clipY, clipX, clipY);
                }
                if (f144l) {
                    if (e.R) {
                        I.Code();
                    } else {
                        repaint();
                    }
                } else if (f143k) {
                    f143k = false;
                    I.f179I = false;
                    I.Code(m72Code().f367Code);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void pointerDragged(int i2, int i3) {
        e.u();
        e.m191J(i2);
        e.m191J(i3);
        e.m196Z(1);
        if (!e.aF) {
            int I2 = I(i2, i3);
            int Z2 = Z(i2, i3);
            Object obj = this.f149Code;
            boolean z2 = obj instanceof e;
            if (z2 && !((e) obj).f473j) {
                z2 = false;
            }
            if (z2 && ((e) obj).f472i) {
                z2 = false;
            }
            if (z2 && ((e) obj).f471h) {
                z2 = false;
            }
            boolean z3 = (!z2 || ((e) obj).f470g) ? z2 : false;
            if (z3 && !((e) obj).f469f) {
                z3 = false;
            }
            if (z3) {
                Object Code2 = m74Code(I2, Z2);
                boolean z4 = Code2 instanceof e;
                if (z4 && !((e) Code2).f473j) {
                    z4 = false;
                }
                if (z4 && ((e) Code2).f472i) {
                    z4 = false;
                }
                if (z4 && ((e) Code2).f471h) {
                    z4 = false;
                }
                if (z4 && !((e) Code2).f470g) {
                    z4 = false;
                }
                if (((!z4 || ((e) Code2).f469f) ? z4 : false) && ((e) Code2).m231Code(2)) {
                    this.f149Code = Code2;
                }
                ((e) this.f149Code).J(I2, Z2);
            } else if (m74Code(I2, Z2) != this.f149Code) {
                this.f149Code = null;
                m99b();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void pointerPressed(int i2, int i3) {
        this.u = -1;
        this.f166j = true;
        this.w++;
        e.u();
        e.m191J(i2);
        e.m191J(i3);
        e.m196Z(1);
        if (!e.aF) {
            int I2 = I(i2, i3);
            int Z2 = Z(i2, i3);
            this.f149Code = m74Code(I2, Z2);
            if (m85h() && !(this.f149Code instanceof Command)) {
                o();
                if (e.R) {
                    I.Code();
                } else {
                    repaint();
                }
            } else if (this.f149Code instanceof Command) {
                if (e.m188I(Code((Command) this.f149Code), "menu:")) {
                    pointerReleased(i2, i3);
                    this.f149Code = m72Code();
                }
                m99b();
            } else {
                Object obj = this.f149Code;
                boolean z2 = obj instanceof e;
                if (z2 && !((e) obj).f473j) {
                    z2 = false;
                }
                if (z2 && ((e) obj).f472i) {
                    z2 = false;
                }
                if (z2 && ((e) obj).f471h) {
                    z2 = false;
                }
                boolean z3 = (!z2 || ((e) obj).f470g) ? z2 : false;
                if (z3 && !((e) obj).f469f) {
                    z3 = false;
                }
                if (z3) {
                    if (!m93Code((e) this.f149Code) || ((e) this.f149Code).m231Code(2)) {
                        this.f150Code.schedule(new I(this), 1000);
                        ((e) this.f149Code).I(I2, Z2);
                    } else {
                        this.f149Code = null;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void pointerReleased(int i2, int i3) {
        e.u();
        e.m191J(i2);
        e.m191J(i3);
        e.m196Z(1);
        if (!e.aF) {
            int I2 = I(i2, i3);
            int Z2 = Z(i2, i3);
            pointerDragged(i2, i3);
            Object obj = this.f149Code;
            boolean z2 = obj instanceof e;
            if (z2 && !((e) obj).f473j) {
                z2 = false;
            }
            if (z2 && ((e) obj).f472i) {
                z2 = false;
            }
            if (z2 && ((e) obj).f471h) {
                z2 = false;
            }
            boolean z3 = (!z2 || ((e) obj).f470g) ? z2 : false;
            if (z3 && !((e) obj).f469f) {
                z3 = false;
            }
            if (z3) {
                ((e) this.f149Code).Z(I2, Z2);
            } else if (m74Code(I2, Z2) == this.f149Code && (this.f149Code instanceof Command)) {
                commandAction((Command) this.f149Code, this);
                m99b();
            }
            this.f149Code = null;
        }
    }

    public final void run() {
        int i2;
        String I2;
        Code code;
        setCommandListener(this);
        e.u();
        int width = getWidth();
        g = width;
        e = width;
        int height = getHeight();
        h = height;
        f = height;
        if (e.M) {
            e = h;
            f = g;
        }
        Code(e.M);
        if (e.av) {
            if (this.f156I == null) {
                this.f156I = new I(2);
                this.f150Code.scheduleAtFixedRate(this.f156I, (long) ((61 - Calendar.getInstance().get(13)) * 1000), 60000);
                i();
            }
        } else if (this.f156I != null) {
            this.f156I.cancel();
            this.f156I = null;
            m99b();
        }
        this.n++;
        if (e.i < 0) {
            this.f167l = Image.createImage(80, 80);
            if (!e.ai) {
                long currentTimeMillis = System.currentTimeMillis() + 1000;
                do {
                    this.f167l = e.Code(this.f167l, 0, 80 - (e.i << 1), 1, true);
                    e.i++;
                    if (System.currentTimeMillis() >= currentTimeMillis) {
                        break;
                    }
                } while (e.i < 10);
            } else {
                e.i = 3;
            }
            if (e.i < e.j) {
                e.ah = true;
                e.ap = false;
            }
        }
        if (e.k < 0) {
            this.f167l = Image.createImage(g, h);
            Graphics graphics = Image.createImage(g, h).getGraphics();
            long currentTimeMillis2 = System.currentTimeMillis() + 500;
            do {
                e.k++;
                graphics.drawImage(this.f167l, 0, 0, 20);
            } while (System.currentTimeMillis() < currentTimeMillis2);
            if (e.k < (e.b == 0 ? 87 : 10)) {
                e.ap = false;
            }
        }
        if (e.z == -2) {
            if (e.f344r) {
                this.f167l = Image.createImage(g, h);
                if (this.f167l != null) {
                    e.Code(this.f167l.getGraphics(), 0, 0, g, h, -1118482);
                    long currentTimeMillis3 = System.currentTimeMillis() + 500;
                    e.Code(this.f167l.getGraphics(), 0, 0, g, h, 1074934870, false);
                    if (currentTimeMillis3 >= System.currentTimeMillis()) {
                        e.z = 0;
                    }
                }
            }
            e.z = -1;
        }
        repaint();
        serviceRepaints();
        int i3 = 4;
        int i4 = 3;
        int i5 = 2;
        int i6 = 6;
        switch (e.b) {
            case 2:
                i4 = 8;
                break;
            case 3:
                i4 = 2;
                break;
        }
        if (e.af) {
            i2 = 1;
            i6 = 1;
            i5 = 1;
            i4 = 1;
            i3 = 8;
        } else {
            i2 = 8;
        }
        if (e.V) {
            i4 = 8;
        }
        f100Code[0] = new Command(e.m122Code(28), 1, 1);
        f100Code[1] = new Command(e.m122Code(43), 1, 1);
        f100Code[2] = new Command(e.m122Code(70), 1, 1);
        f100Code[10] = new Command(e.m122Code(1), i4, 10);
        f100Code[3] = new Command(e.m122Code(3), i6, 20);
        f100Code[15] = new Command(e.m122Code(6), 8, 20);
        f100Code[18] = new Command(e.m122Code(106), 8, 20);
        f100Code[11] = new Command(e.m122Code(19), i2, 20);
        f100Code[17] = new Command(e.m122Code(5), 1, 20);
        f100Code[12] = new Command(e.m122Code(4), i5, 10);
        f100Code[14] = new Command(e.m122Code(10), 7, 10);
        f100Code[4] = new Command(e.m122Code(4), i5, 10);
        f100Code[5] = new Command(e.m122Code(11), i3, 1);
        f100Code[6] = new Command(e.m122Code(12), i4, 10);
        f100Code[8] = new Command(e.m122Code(62), 1, 1);
        f100Code[9] = new Command(e.m122Code(0), i3, 1);
        f100Code[7] = new Command(e.m122Code(17), 1, 1);
        f100Code[16] = new Command(e.m122Code(66), 1, 10);
        f100Code[13] = new Command(e.m122Code(104), 1, 1);
        f100Code[19] = new Command(e.m122Code(108), 8, 20);
        f100Code[20] = new Command(e.m122Code(21), 1, 1);
        f100Code[21] = new Command(e.m122Code(109), 1, 1);
        f100Code[22] = new Command(e.m122Code(135), 1, 1);
        f100Code[37] = new Command(e.m122Code(35), 1, 1);
        f100Code[38] = new Command(e.m122Code(3), i5, 1);
        f100Code[39] = new Command(e.f334m, i3, 1);
        f100Code[40] = new Command(e.f336n, i4, 1);
        f100Code[27] = new Command(e.m122Code(174), 1, 1);
        f100Code[28] = new Command("", 1, 1);
        f100Code[29] = new Command(e.m122Code(15), i3, 1);
        f100Code[24] = new Command(e.m122Code(142), 1, 1);
        f100Code[25] = new Command(e.m122Code(28), 1, 1);
        f100Code[26] = new Command(e.m122Code(14), i4, 10);
        f100Code[36] = new Command(e.m122Code(160), i3, 1);
        f100Code[41] = new Command(e.m122Code(249), i3, 20);
        f100Code[42] = new Command(e.m122Code(255), i3, 20);
        if (f100Code[23] == null) {
            f100Code[23] = new Command("", 2, 1);
        }
        B = 23;
        C = 23;
        this.f153Code = m75Code();
        m89Code();
        e.m206e();
        if (e.f339o) {
            e.B = Math.max(6, Math.min(g, h) / 26);
        }
        e eVar = new e(1, (e) null, true);
        f103I.addElement(eVar);
        f112J.addElement(eVar);
        Vector Code2 = e.Code(true, "h1", 0);
        f118Z = Code2;
        if (Code2 == null) {
            f118Z = new Vector(30);
        }
        e.n();
        e.k();
        if (e.f257I > 200000) {
            e.f331k = true;
        }
        if (e.f257I < ((long) (((getWidth() * getHeight()) << 2) + 50000))) {
            e.aj = true;
        }
        if (e.f257I < 200000) {
            e.n = 0;
        } else {
            e.n = 1;
        }
        if (m <= 0) {
            m = Math.max(1, (int) ((e.f257I - e.f279Z) / 300000));
        }
        this.n++;
        repaint();
        serviceRepaints();
        e.j();
        m94I();
        this.n++;
        repaint();
        serviceRepaints();
        if (c()) {
            e.m139Code();
            I2 = e.f286a;
            code = this;
        } else if (!"".equals(e.f338o)) {
            I2 = new StringBuffer().append("overlay:").append(e.m180I(145)).toString();
            code = this;
        } else {
            I2 = e.m180I(65);
            code = this;
        }
        code.Code((e) null, I2, (String) null);
        this.f162d = true;
        repaint();
        serviceRepaints();
        e.C(false);
    }

    /* access modifiers changed from: protected */
    public final synchronized void showNotify() {
        this.u = -1;
        repaint();
    }

    /* access modifiers changed from: protected */
    public final synchronized void sizeChanged(int i2, int i3) {
        if (!(g == 0 || h == 0 || (i2 == g && i3 == h))) {
            int width = getWidth();
            int height = getHeight();
            if (e.M) {
                e = height;
                f = width;
            } else {
                f = height;
                e = width;
            }
            g = width;
            h = height;
            this.f157I = null;
            Code(e.M);
            for (int i4 = 0; i4 < f112J.size(); i4++) {
                e eVar = (e) f112J.elementAt(i4);
                if (eVar.f367Code != null) {
                    eVar.f367Code.m59a();
                }
            }
            l();
            if (e.ak) {
                j();
            }
            if (!(t == null || (t.getWidth() == e && t.getHeight() == f))) {
                int width2 = (t.getWidth() * t.getHeight()) << 1;
                if (Browser.display.numColors() > 65536) {
                    width2 <<= 1;
                }
                e.f279Z -= (long) width2;
                f95Code = null;
                t = null;
            }
            repaint();
        }
    }
}
