//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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

final class Code extends Canvas implements Runnable, CommandListener {
    static byte[] Z = new byte[]{0};
    private static Vector J;
    static int[] Code;
    static byte[] Code;
    static Object[] Code;
    static Code Code;
    private int z;
    private int s;
    private int n = 0;
    private Object Code;
    private boolean d;
    private static boolean e;
    private int o = (int)System.currentTimeMillis();
    static byte[] I;
    Image Code;
    static Vector Code;
    public static int Z;
    static Object[] I;
    static boolean Code;
    static boolean I = true;
    private Image l;
    static a Code;
    static Image B;
    static String Code;
    public static boolean Z;
    private I I;
    private static int y;
    public static String I = "";
    public static String Z = "";
    public static int J = 3;
    public static String J = "0";
    public static boolean J;
    public static int Code = 1;
    public static int I;
    static boolean c;
    public static boolean B;
    public static boolean C;
    public static boolean a;
    public static I Code;
    static final Command[] Code = new Command[43];
    static int B;
    static int C;
    private Image[] Code;
    static int a;
    private boolean f = false;
    private static int p;
    private static int q;
    private static int r;
    private static final int[] Z = new int[]{1, 6, 2, 5, 50, 52, 54, 56};
    private boolean j;
    private int t;
    private long Code;
    private int u = -1;
    private int[] J;
    private boolean g;
    private int v = 0;
    static Vector I;
    private I Z;
    private static long I;
    private static boolean h;
    private int w;
    private static final int[] c;
    private boolean i;
    static int b;
    static int c;
    static Image J;
    static int d;
    public static int e;
    public static int f;
    static int g;
    static int h;
    static Image h;
    private Image n;
    private Image m;
    private int[] B;
    static boolean b;
    private Image o;
    private Image p;
    private Image q;
    private Image r;
    private Image s;
    private int x;
    static byte[] J;
    int[] I;
    private int[] C;
    Image I;
    static Image Z;
    static Image C;
    static Image a;
    static Image b;
    static Vector Z;
    static Image c;
    static Image d;
    static Image e;
    static Image f;
    static int i;
    static Image g;
    static Image i;
    private static int[] a;
    static Image j;
    static Image k;
    private static I J;
    private static Image[] I;
    private static Image[] Z;
    private static int[] b;
    static int j;
    static int k;
    static int l;
    private TimerTask Code;
    private static long Z;
    private static boolean k;
    private static boolean l;
    private static Image t;
    private static Graphics Code;
    private static Sprite Code;
    private static Graphics I;
    private static byte Code;
    private TextBox Code = null;
    private static TextBox I;
    private static int A;
    static int m;
    private long J = 0L;
    private TimerTask I;
    private String B = "";
    Timer Code = new Timer();

    static String Code(int var0, boolean var1, Calendar var2) {
        Calendar var3 = var2 != null ? var2 : e.Code(false, var1);
        if (var0 < 0 || var0 > 23) {
            var0 = var3.get(11);
        }

        int var4 = var3.get(12);
        if (e.aw) {
            return (var0 < 10 ? "0" : "") + var0 + ":" + (var4 < 10 ? "0" : "") + var4;
        } else {
            boolean var5 = true;
            if (var0 >= 12) {
                var5 = false;
                var0 -= 12;
            }

            return (var0 == 0 ? 12 : var0) + ":" + (var4 < 10 ? "0" : "") + var4 + (var5 ? " AM" : " PM");
        }
    }

    protected final synchronized void sizeChanged(int var1, int var2) {
        if (g != 0 && h != 0 && (var1 != g || var2 != h)) {
            var1 = this.getWidth();
            var2 = this.getHeight();
            if (e.M) {
                e = var2;
                f = var1;
            } else {
                f = var2;
                e = var1;
            }

            g = var1;
            h = var2;
            this.I = null;
            this.Code(e.M);

            for(var1 = 0; var1 < J.size(); ++var1) {
                e var3;
                if ((var3 = (e)J.elementAt(var1)).Code != null) {
                    var3.Code.a();
                }
            }

            l();
            if (e.ak) {
                this.j();
            }

            if (t != null && (t.getWidth() != e || t.getHeight() != f)) {
                var1 = t.getWidth() * t.getHeight() << 1;
                if (Browser.Code.numColors() > 65536) {
                    var1 <<= 1;
                }

                e.Z -= (long)var1;
                Code = null;
                t = null;
            }

            this.repaint();
        }
    }

    protected final synchronized void paint(Graphics var1) {
        int var21;
        boolean var24;
        if (this.d && !b) {
            label564:
            try {
                this.m = null;
                this.n = null;
                this.Code = null;
                this.J = null;
                this.B = null;
                int var18;
                if (e.H || e.M) {
                    if (t == null) {
                        var18 = g * h << 1;
                        if (Browser.Code.numColors() > 65536) {
                            var18 <<= 1;
                        }

                        if (e.M) {
                            t = Image.createImage(h, g);
                            (Code = new Sprite(t)).setTransform(5);
                            Code.setPosition(0, 0);
                        } else {
                            t = Image.createImage(g, h);
                        }

                        Code = t.getGraphics();
                        e.Z += (long)var18;
                    }

                    I = var1;
                    (var1 = Code).setClip(0, 0, t.getWidth(), t.getHeight());
                }

                l = false;
                if (this.g && this.u >= 0) {
                    this.Code(this.t, ++this.u);
                }

                this.g = false;
                y = (int)System.currentTimeMillis();

                for(var18 = 0; var18 < e; var18 += var21) {
                    if (!e.M) {
                        var21 = e;
                    } else {
                        var21 = var18 == 0 && e != t.getWidth() ? e % t.getWidth() : t.getWidth();
                        var1.translate(-var18 - var1.getTranslateX(), -var1.getTranslateY());
                        var1.setClip(-var1.getTranslateX(), 0, var21, t.getHeight());
                    }

                    this.Code(var1);
                    if (e.H || e.M) {
                        if (e.M) {
                            I.setClip(0, 0, g, h);
                            Code.setPosition(0, var18);
                            Code.paint(I);
                        } else {
                            I.drawImage(t, 0, 0, 20);
                        }
                    }
                }

                if (e.M) {
                    int var19 = I.getClipX() + I.getClipWidth() - 1;
                    var18 = I.getClipY() + I.getClipHeight() - 1;
                    I.drawLine(var19, var18, var19, var18);
                }

                if (l) {
                    if (e.R) {
                        I.Code();
                        return;
                    }

                    this.repaint();
                    return;
                }

                if (k) {
                    k = false;
                    I.I = false;
                    I.Code(Code().Code);
                }

                return;
            } catch (Throwable var16) {
                var24 = false;
                break label564;
            }
        } else {
            Code var2 = this;
            Graphics var10000 = var1;
            Graphics var10001 = var1;

            label566:
            try {
                e.Code(var10000, var10001.getClipX(), var1.getClipY(), var1.getClipWidth(), var1.getClipHeight(), 16777215);
                if (var2.m == null) {
                    if (e.u != 0 && e.v != -1) {
                        byte[] var3;
                        if ((var3 = e.Code(e.v, "b")) != null) {
                            var2.n = Image.createImage(var3, 0, var3.length);
                        }
                    } else {
                        var2.n = e.I(84);
                    }

                    var2.m = e.I(69);
                }

                int var4;
                if (var2.Code == null) {
                    Image var20;
                    var4 = (var20 = e.I(83)).getHeight();
                    var2.Code = new Image[4];
                    var2.Code[0] = Image.createImage(var20, 0, 0, 4, var4, 0);
                    var2.Code[1] = Image.createImage(var20, 5, 0, 4, var4, 0);
                    var2.Code[2] = Image.createImage(var20, 9, 0, 5, var4, 0);
                    var2.Code[3] = Image.createImage(var20, 15, 0, 5, var4, 0);
                    var2.J = new int[var4];
                    var2.B = new int[var4];
                    var20.getRGB(var2.J, 0, 1, 4, 0, 1, var4);
                    var20.getRGB(var2.B, 0, 1, 14, 0, 1, var4);
                }

                var21 = var2.Code[0].getHeight();
                var4 = h > 225 ? h * 80 / 100 : h - 45;
                int var5 = Math.min((g << 2) / 5, 230);
                int var6 = var4 - var21 / 2;
                int var7 = var4 - var21 / 2 - 20;
                int var8 = e.Code[0].getHeight();
                var21 = (var21 = var4 + var21 / 2) + Math.min(15, (h - var21 - var8) / 2);
                if (var2.m != null && var2.Code != null && var4 > 0) {
                    var4 = var7 - var2.m.getHeight();
                    if (var2.n != null) {
                        if (var2.n.getHeight() <= var4) {
                            var7 = e.Code(h * 40 / 100 - var2.n.getHeight() / 2, 0, var4 - 15 - var2.n.getHeight());
                            var1.drawImage(var2.n, g / 2, var7, 17);
                            if ((var7 = var4 - var7 - var2.n.getHeight()) < 15) {
                                var4 += (15 - var7) / 2;
                            }
                        } else {
                            e.Code(e.v, "b");
                            e.v = -1;
                            var2.n = null;
                        }
                    }

                    var1.drawImage(var2.m, g / 2, var4, 17);
                    var4 = 1024;
                    var7 = 256 * (1 + var2.n);
                    StringBuffer var23;
                    if (c()) {
                        var23 = new StringBuffer(e.Code(113));
                        var7 += ((int)System.currentTimeMillis() - var2.o << 10) / ('\uea60' * Math.max(1, e.I));
                        var4 += 1024;
                    } else {
                        var23 = new StringBuffer(e.Code(134));
                    }

                    int var9 = (g - var5) / 2;
                    int var10 = var5 * var7 / var4;
                    var10 = Math.max(var2.z, var10);
                    int var11;
                    if (var7 != var4) {
                        if (var10 - var2.Code[2].getWidth() < 0) {
                            var1.drawImage(var2.Code[2], var9, var6, 0);
                        }

                        var4 = var9 + Math.max(var10, var2.Code[2].getWidth());
                        var7 = var9 + var5 - var2.Code[3].getWidth();
                        var4 = Math.min(var4, var7);

                        for(var11 = 0; var11 < var2.B.length; ++var11) {
                            var1.setColor(var2.B[var11]);
                            var1.drawLine(var4, var6 + var11, var7, var6 + var11);
                        }

                        var1.drawImage(var2.Code[3], var9 + var5 - var2.Code[3].getWidth() + 1, var6, 0);
                    }

                    if (var10 >= var2.Code[0].getWidth()) {
                        var1.drawImage(var2.Code[0], var9, var6, 0);
                        var4 = var9 + var2.Code[0].getWidth();
                        var7 = Math.min(var9 + var10, var9 + var5);

                        for(var11 = 0; var11 < var2.J.length; ++var11) {
                            var1.setColor(var2.J[var11]);
                            var1.drawLine(var4, var6 + var11, var7, var6 + var11);
                        }

                        if (var10 > var5 - var2.Code[1].getWidth()) {
                            var1.drawImage(var2.Code[1], var9 + var5 - var2.Code[1].getWidth() + 1, var6, 0);
                        }
                    }

                    var1.setColor(0);
                    var1.setFont(e.Code[0]);
                    String var22 = var23.append("...").toString();
                    var1.drawString(var22, g / 2, var21, 17);
                    var2.z = var10;
                    return;
                }

                return;
            } catch (Throwable var17) {
                var24 = false;
                break label566;
            }
        }

        this.B(2);
    }

    private e Code(String var1, String var2, String var3, int var4, e var5, int var6) {
        int var7 = I.size();
        boolean var8;
        if ((var8 = var6 >= var7) && var7 > 0 && (var4 & 1) != 0) {
            I().B(false);
        }

        e var9 = new e(var4, var5, var8);
        J.insertElementAt(var9, var6);
        if (var9.Code(1)) {
            I.addElement(var9);
        }

        var9.Code(var1, var2, var3);
        var9.I();
        if (e.R) {
            I.Code();
        } else {
            this.repaint();
        }

        I.J();
        return var9;
    }

    final void Code(String var1, String var2, String var3, boolean var4) {
        if (m > 0 && I.size() >= m) {
            var1 = "overlay:" + e.I(167);
            this.Code((e)null, var1, (String)null);
        } else {
            int var5 = I.size();
            if (var4 && var5 > 0) {
                --var5;
            }

            if (e.I(var1) != 65) {
                this.Code(e.I(168), (String)null, (String)null, 1, (e)null, var5).Code(var1, var2, var3);
            } else {
                this.Code(var1, var2, var3, 1, (e)null, var5);
            }
        }
    }

    final boolean I(e var1) {
        boolean var2 = false;
        if (var1.Code(16)) {
            var1.Code.c();
        }

        if (J.size() > 1) {
            var1.Z();
            J.removeElement(var1);
            if (var1.Code(1)) {
                I.removeElement(var1);
            }

            this.Code();
            var2 = true;
        }

        this.repaint();
        I.J();
        return var2;
    }

    private synchronized void Code(e var1, String var2, String var3) {
        if (var1 == null) {
            var1 = Code();
        }

        if (var2 != null) {
            String var4;
            if ((var4 = e.I(var2)).equals(e.I(66))) {
                c = false;
            } else if (var4.startsWith("rtsp://") || var2.startsWith("rtsp://")) {
                I var5;
                (var5 = new I(6)).Code = var2.startsWith("rtsp://") ? var2 : var4;
                e.Code(var5);
                return;
            }

            if (!e.aA && (var2.equals(e.I(65)) || var2.equals(e.C))) {
                e.aA = true;
                e.d(false);
                e.C(false);
            }

            var1.Code(var2, (String)null, var3);
        }

    }

    static void Z(boolean var0) {
        if (I != null) {
            if (var0 && A > I.getMaxSize()) {
                Code var10000 = Code;
                String var1 = "overlay:" + e.I(144);
                var10000.Code((e)null, var1, (String)null);
            } else {
                Browser.Code.setCurrent(I);
                if (!e.L) {
                    e.L = true;
                    e.C(false);
                }

            }
        }
    }

    private static boolean c() {
        return !e.aA && e.a.length() > 0;
    }

    final void Code(boolean var1) {
        if (var1 != e.M) {
            e.M = var1;
            Code var10000 = Code;

            try {
                var10000.Code();
                Code.sizeChanged(-1, -1);
                this.j();
            } finally {
                e.N = (var1 && (!e.o || e.P)) ^ (e.O && g > 300) || e.Q && g > h;
            }
        }

    }

    private static void m() {
        e var0 = I();

        for(int var1 = 0; var1 < I.size(); ++var1) {
            e var2;
            if ((var2 = (e)I.elementAt(var1)) != var0) {
                var2.g();
            }
        }

    }

    private static boolean d() {
        e var0;
        return (var0 = Code()) != null && var0.Code(16);
    }

    static boolean Code(int var0, boolean var1) {
        e var2;
        if ((var2 = Code(e.I(var0))) == null || !var1 && var2.I != null) {
            return false;
        } else {
            var2.B = true;
            var2.J();
            return true;
        }
    }

    static B Code() {
        return Code().Code;
    }

    static e Code() {
        return J.isEmpty() ? null : (e)J.lastElement();
    }

    Code() {
        Code = this;
        e.I("r");
        e.l();
        e.i();
        e.m();
        e.p();
        e.h();
        Z();
        if (!e.az) {
            e.I("eurls");
            e.I("b");
            e.I("se");
        }

        if (e.Y) {
            boolean var3 = false;

            a var10000;
            try {
                var3 = true;
                var10000 = new a();
                var3 = false;
            } finally {
                if (var3) {
                    e.Y = false;
                }
            }

            Code = var10000;
        }

        (new StringBuffer()).append(e.I).append(" hifi").append(e.Z.length() > 0 ? " " : "").append(e.Z).append(e.J.length() > 0 ? " " : "").append(e.J).append(" v. 4.6.32741, 20130109");
        Code = "Opera Mini/4.6.32741/hifi/" + e.Z + "/" + e.J;
        this.j = e.o;
        int var1 = e.n ^ 1;
        (e.Code = new Font[6])[0] = Font.getFont(64, 0, 8);
        e.Code[1] = Font.getFont(64, var1, 8);
        e.Code[2] = Font.getFont(64, 0, 0);
        e.Code[3] = Font.getFont(64, var1, 0);
        e.Code[4] = Font.getFont(64, 0, 16);
        e.Code[5] = Font.getFont(64, var1, 16);
        if (!e.G && !e.af) {
            this.setFullScreenMode(true);
        }

        e.r();
        if (e.I.isEmpty()) {
            e.a(true);
        }

        Browser.Code.setCurrent(this);
        (new Thread(this)).start();
    }

    private void k() {
        if (!b) {
            if (e.af) {
                for(int var1 = 0; var1 < Code.length; ++var1) {
                    if (Code[var1] != null && var1 != 23 && var1 != 28) {
                        this.removeCommand(Code[var1]);
                        if (B == var1 || C == var1 || a == var1) {
                            if (var1 == 1) {
                                if (var1 != a) {
                                    this.addCommand(Code[var1]);
                                }
                            } else if (var1 != a) {
                                this.addCommand(Code[var1]);
                            }
                        }
                    }
                }

                p = B;
                q = C;
                r = a;
            }

        }
    }

    private int I(int var1) {
        if (d() && e.Code(var1, -1, false) != -1) {
            return var1;
        } else {
            if (e.Q && g > h) {
                if (var1 == -6) {
                    return -7;
                }

                if (var1 == -7) {
                    return -6;
                }

                if (this.Z == null && e()) {
                    switch(var1) {
                        case 50:
                            return 52;
                        case 51:
                        case 53:
                        case 55:
                        default:
                            break;
                        case 52:
                            return 56;
                        case 54:
                            return 50;
                        case 56:
                            return 54;
                    }
                }
            } else if (e.M) {
                switch(var1) {
                    case 1:
                        return 2;
                    case 2:
                        return 6;
                    case 3:
                    case 4:
                    default:
                        if (this.Z == null && e()) {
                            switch(var1) {
                                case 50:
                                    return 52;
                                case 51:
                                case 53:
                                case 55:
                                default:
                                    break;
                                case 52:
                                    return 56;
                                case 54:
                                    return 50;
                                case 56:
                                    return 54;
                            }
                        }

                        if (!e.O || g <= 300) {
                            if (var1 == -6) {
                                return -7;
                            }

                            if (var1 == -7) {
                                return -6;
                            }
                        }
                        break;
                    case 5:
                        return 1;
                    case 6:
                        return 5;
                }
            }

            return var1;
        }
    }

    final void Z(String var1, String var2) {
        if (var1.startsWith("http://")) {
            var2 = e.Code(var2, true);
        }

        var1 = "ext:" + e.Code(var1, "%s", var2);
        this.Code((e)null, var1, (String)null);
    }

    public final void run() {
        this.setCommandListener(this);
        e.u();
        e = g = this.getWidth();
        f = h = this.getHeight();
        if (e.M) {
            e = h;
            f = g;
        }

        this.Code(e.M);
        boolean var1 = e.av;
        if (var1) {
            if (this.I == null) {
                this.I = new I(2);
                int var7 = Calendar.getInstance().get(13);
                this.Code.scheduleAtFixedRate(this.I, (long)((61 - var7) * 1000), 60000L);
                this.i();
            }
        } else if (this.I != null) {
            this.I.cancel();
            this.I = null;
            this.b();
        }

        ++this.n;
        long var8;
        if (e.i < 0) {
            this.l = Image.createImage(80, 80);
            if (e.ai) {
                e.i = 3;
            } else {
                var8 = System.currentTimeMillis() + 1000L;

                do {
                    this.l = e.Code(this.l, 0, 80 - (e.i << 1), 1, true);
                    ++e.i;
                } while(System.currentTimeMillis() < var8 && e.i < 10);
            }

            if (e.i < e.j) {
                e.ah = true;
                e.ap = false;
            }
        }

        if (e.k < 0) {
            this.l = Image.createImage(g, h);
            Graphics var9 = Image.createImage(g, h).getGraphics();
            long var2 = System.currentTimeMillis() + 500L;

            do {
                ++e.k;
                var9.drawImage(this.l, 0, 0, 20);
            } while(System.currentTimeMillis() < var2);

            byte var11 = 10;
            if (e.b == 0) {
                var11 = 87;
            }

            if (e.k < var11) {
                e.ap = false;
            }
        }

        if (e.z == -2) {
            label97: {
                if (e.r) {
                    this.l = Image.createImage(g, h);
                    if (this.l == null) {
                        break label97;
                    }

                    e.Code(this.l.getGraphics(), 0, 0, g, h, -1118482);
                    var8 = System.currentTimeMillis() + 500L;
                    e.Code(this.l.getGraphics(), 0, 0, g, h, 1074934870, false);
                    if (var8 >= System.currentTimeMillis()) {
                        e.z = 0;
                        break label97;
                    }
                }

                e.z = -1;
            }
        }

        this.repaint();
        this.serviceRepaints();
        byte var10 = 4;
        byte var3 = 3;
        byte var4 = 2;
        byte var5 = 6;
        byte var6 = 8;
        switch(e.b) {
            case 2:
                var3 = 8;
                break;
            case 3:
                var3 = 2;
        }

        if (e.af) {
            var6 = 1;
            var4 = 1;
            var5 = 1;
            var3 = 1;
            var10 = 8;
        }

        if (e.V) {
            var3 = 8;
        }

        Code[0] = new Command(e.Code(28), 1, 1);
        Code[1] = new Command(e.Code(43), 1, 1);
        Code[2] = new Command(e.Code(70), 1, 1);
        Code[10] = new Command(e.Code(1), var3, 10);
        Code[3] = new Command(e.Code(3), var5, 20);
        Code[15] = new Command(e.Code(6), 8, 20);
        Code[18] = new Command(e.Code(106), 8, 20);
        Code[11] = new Command(e.Code(19), var6, 20);
        Code[17] = new Command(e.Code(5), 1, 20);
        Code[12] = new Command(e.Code(4), var4, 10);
        Code[14] = new Command(e.Code(10), 7, 10);
        Code[4] = new Command(e.Code(4), var4, 10);
        Code[5] = new Command(e.Code(11), var10, 1);
        Code[6] = new Command(e.Code(12), var3, 10);
        Code[8] = new Command(e.Code(62), 1, 1);
        Code[9] = new Command(e.Code(0), var10, 1);
        Code[7] = new Command(e.Code(17), 1, 1);
        Code[16] = new Command(e.Code(66), 1, 10);
        Code[13] = new Command(e.Code(104), 1, 1);
        Code[19] = new Command(e.Code(108), 8, 20);
        Code[20] = new Command(e.Code(21), 1, 1);
        Code[21] = new Command(e.Code(109), 1, 1);
        Code[22] = new Command(e.Code(135), 1, 1);
        Code[37] = new Command(e.Code(35), 1, 1);
        Code[38] = new Command(e.Code(3), var4, 1);
        Code[39] = new Command(e.m, var10, 1);
        Code[40] = new Command(e.n, var3, 1);
        Code[27] = new Command(e.Code(174), 1, 1);
        Code[28] = new Command("", 1, 1);
        Code[29] = new Command(e.Code(15), var10, 1);
        Code[24] = new Command(e.Code(142), 1, 1);
        Code[25] = new Command(e.Code(28), 1, 1);
        Code[26] = new Command(e.Code(14), var3, 10);
        Code[36] = new Command(e.Code(160), var10, 1);
        Code[41] = new Command(e.Code(249), var10, 20);
        Code[42] = new Command(e.Code(255), var10, 20);
        if (Code[23] == null) {
            Code[23] = new Command("", 2, 1);
        }

        B = 23;
        C = 23;
        this.Code = Code();
        this.Code();
        e.e();
        if (e.o) {
            e.B = Math.max(6, Math.min(g, h) / 26);
        }

        e var12 = new e(1, (e)null, true);
        I.addElement(var12);
        J.addElement(var12);
        if ((Z = e.Code(true, "h1", 0)) == null) {
            Z = new Vector(30);
        }

        e.n();
        e.k();
        if (e.I > 200000L) {
            e.k = true;
        }

        if (e.I < (long)((this.getWidth() * this.getHeight() << 2) + '썐')) {
            e.aj = true;
        }

        if (e.I < 200000L) {
            e.n = 0;
        } else {
            e.n = 1;
        }

        if (m <= 0) {
            m = Math.max(1, (int)((e.I - e.Z) / 300000L));
        }

        ++this.n;
        this.repaint();
        this.serviceRepaints();
        e.j();
        this.I();
        ++this.n;
        this.repaint();
        this.serviceRepaints();
        Code var10000;
        String var10001;
        if (c()) {
            e.Code();
            var10000 = this;
            var10001 = e.a;
        } else if (!"".equals(e.o)) {
            var10000 = this;
            var10001 = "overlay:" + e.I(145);
        } else {
            var10000 = this;
            var10001 = e.I(65);
        }

        String var13 = var10001;
        var10000.Code((e)null, var13, (String)null);
        this.d = true;
        this.repaint();
        this.serviceRepaints();
        e.C(false);
    }

    static void Code(Object[] var0) {
        B var1;
        if ((var1 = (B)var0[8]) != null && !var1.J) {
            for(int var2 = 0; var2 < Z.size(); ++var2) {
                if (var0[0].equals(((Object[])Z.elementAt(var2))[0])) {
                    Z.removeElementAt(var2);
                    break;
                }
            }

            if (Z.size() >= 30) {
                Z.removeElementAt(0);
            }

            Z.addElement(var0);
            Code.Code((Object)Z);
        }

    }

    static {
        int[] var10000 = new int[]{54, 54, 55, 55, 52, 55, 50, 55, 50, 52, 51};
        I = -1L;
        J = new Vector();
        b = 0;
        c = 0;
        d = 0;
        b = true;
        Code = 1;
        c = false;
        Code = new Vector();
        I = new Vector();
        m = -1;
        c = new int[]{-6, -7, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
    }

    final void Z(String var1) {
        if (!(var1 = var1.trim()).equals("www.") && var1.length() > 0) {
            if (Code.contains(var1)) {
                Code.removeElement(var1);
            }

            if (Code.size() > 30) {
                Code.removeElement(Code.firstElement());
            }

            Code.addElement(var1);
            if ("debug:".equals(var1)) {
                e = true;
            }

            if (e && "opera:routing".equals(var1)) {
                if (!e.a) {
                    e.a = true;
                } else {
                    e.a = false;
                }
            }

            var1 = "ext:" + var1;
            this.Code((e)null, var1, (String)null);
        }

    }

    final void d() {
        if (this.Code != null) {
            this.Code.cancel();
            this.Code = null;
        }

    }

    final void c() {
        if (this.Code == null) {
            Z = System.currentTimeMillis();
            this.Code = new I(1);
            this.Code.schedule(this.Code, 0L, 500L);
        }

    }

    private static void Code(Screen var0) {
        if (var0 != null && e.u) {
            var0.addCommand(Code[14]);
        }

    }

    final void Code() {
        e.s();
        b = Math.max(e.J(0), e.J(1)) + 3;
        c = Math.max(10, e.B(1)) + 3;
        if (e.o) {
            b += 4;
        }

        b = Math.max(b, b < 16 ? 14 : 18);
        Code = new int[76];
        this.I = new int[c];
        this.C = new int[b];
        Image var1 = null;
        if (!e.aB) {
            byte[] var2;
            if ((var2 = e.Code(e.r, "b")) != null) {
                var1 = Image.createImage(var2, 0, var2.length);
            }

            if (var1 == null || var1.getWidth() < 135) {
                var1 = null;
                e.aB = true;
            }
        }

        if (var1 == null) {
            var1 = e.I(68);
        }

        if (var1 != null) {
            var1.getRGB(Code, 0, Code.length, 0, 21, Code.length, 1);
            if (B.I == null) {
                (B.I = new Image[2])[0] = e.Code(var1, 124, 0, 11, 10, 0);
                B.I[1] = e.Code(var1, 124, 10, 11, 10, 0);
                if (e.s) {
                    Z = e.Code(var1, 103, 0, 10, 10, 0);
                    J = e.Code(var1, 113, 0, 1, 10, 0);
                    B = e.Code(var1, 114, 0, 10, 10, 0);
                    C = e.Code(var1, 103, 10, 6, 1, 0);
                    a = e.Code(var1, 118, 10, 6, 1, 0);
                    d = e.Code(var1, 103, 11, 10, 10, 0);
                    c = e.Code(var1, 113, 11, 1, 10, 0);
                    b = e.Code(var1, 114, 11, 10, 10, 0);
                }
            }

            this.p = e.Code(Image.createImage(var1, 62, 0, 20, 22, 0), 1, c, 1, false);
            this.q = e.Code(Image.createImage(var1, 82, 0, 20, 22, 0), 1, c, 1, false);
            this.Code = e.Code(Image.createImage(var1, 42, 0, 20, 20, 0), 0, b - 1, 1, false);
            Image var3 = e.Code(Image.createImage(var1, 102, 0, 1, 22, 0), 1, b, 1, false);
            Image.createImage(var1 = e.Code(Image.createImage(var1, 0, 0, 42, 22, 0), 1, c, 1, false), 0, 0, 1, c, 0).getRGB(this.I, 0, 1, 0, 0, 1, c);
            Image.createImage(var3, 0, 0, 1, b, 0).getRGB(this.C, 0, 1, 0, 0, 1, b);
        }

        this.o = var1;
        e.I = Code;
        if (e.i.equals("pink")) {
            Code[72] = -420071261;
            Code[73] = -419794495;
            Code[74] = -420205153;
            Code[75] = 13224393;
            e.G = 0;
        } else if (e.i.equals("snow")) {
            Code[72] = -203629348;
            Code[73] = -202247695;
            Code[74] = -206458447;
            Code[75] = 10066329;
            e.G = 6;
        } else {
            Code[72] = -855638016;
            Code[73] = -852348366;
            Code[74] = -855638016;
            Code[75] = 7895160;
            e.G = 0;
        }

        d = Math.min(16, c - 4);
        e.t();
        l();
    }

    static void Code(Integer var0, boolean var1) {
        if (var0 != 0) {
            byte[] var2 = new byte[Z.length + 4];
            Z[0] = (byte)((var2.length - 1) / 4);
            System.arraycopy(Z, 0, var2, 0, Z.length);
            e.I(var0, var2, var2.length - 4);
            Z = var2;
            Code = true;
            if (var1) {
                e.C(false);
            }
        }

    }

    final void Code(Object var1) {
        if (this.d) {
            if (var1 == e.C || var1 == e.J || var1 == e.a && e.Y || var1 == e.I || var1 == e.B && e.ay) {
                J(65);
            }

            if (var1 == e.C) {
                J(109);
            } else if (var1 == e.J) {
                J(91);
            } else if (var1 == e.Z) {
                J(90);
            } else if (var1 == e.a) {
                J(136);
            } else if (var1 == Z) {
                J(86);
            } else {
                if (var1 == e.I) {
                    J(148);
                }

            }
        }
    }

    private void j() {
        e var1;
        if ((var1 = Code(1)) != null && var1.Code != null) {
            if (var1.Code.Z) {
                if (var1.Code.J() != e) {
                    var1.B = true;
                    var1.J();
                    return;
                }
            } else if (var1.Code.J() > e && e.am) {
                String var2 = "overlay:" + e.I(126);
                this.Code((e)null, var2, (String)null);
            }
        }

    }

    final void I() {
        byte[] var1 = e.Code(8);
        Object[] var2 = new Object[3];
        e.Code(var1, 0, var1.length, 256, var2);
        var2[0] = e.Code((int[])var2[0], Code[71]);
        if (b < 18) {
            var2[0] = e.Code((int[])var2[0], (Integer)var2[1], (Integer)var2[2], 12, 1, true);
            var2[1] = new Integer(((int[])var2[0]).length / 12);
            var2[2] = new Integer(12);
        }

        this.r = Image.createRGBImage((int[])var2[0], (Integer)var2[1], (Integer)var2[2], true);
        this.x = (b - this.r.getHeight()) / 2 - 1;
        this.s = e.Code(var2, this.C, -this.x);
        Image var10;
        if (e == null && e.s && (var10 = e.I(2)) != null) {
            e = e.Code(var10, 4, 0, 4, 4, 0);
            f = e.Code(var10, 4, 4, 4, 1, 0);
            g = e.Code(var10, 4, 5, 4, 4, 0);
            h = e.Code(var10, 4, 4, 4, 1, 6);
            i = e.Code(var10, 0, 5, 4, 4, 0);
            j = e.Code(var10, 0, 4, 4, 1, 0);
            k = e.Code(var10, 0, 0, 4, 4, 0);
        }

        int var11;
        if (B.Code == null) {
            B.Code = new Image[6];
            if (e.t) {
                var11 = 0;

                while(true) {
                    if (!e.y && !e.u) {
                        if (var11 >= 6) {
                            break;
                        }
                    } else if (var11 >= 5) {
                        break;
                    }

                    B.Code[var11] = e.I(var11 + 71);
                    ++var11;
                }
            } else {
                for(var11 = 0; var11 < 5; ++var11) {
                    B.Code[var11] = e.I(var11 + 77);
                }
            }
        }

        if (J == null) {
            J = e.Code(3);
        }

        var11 = (e.B(0) << 1) / 3;
        Image var12 = null;
        Image var3;
        if (I == null) {
            I = new Image[10];
            if ((var3 = var12 = e.I(85)).getHeight() <= var11) {
                var3 = var12 = e.I(87);
            }

            j = var3.getWidth() / 10;
            i = var3.getHeight();

            for(int var4 = 0; var4 < 10; ++var4) {
                I[var4] = e.Code(var3, j * var4, 0, j, i, 0);
            }
        }

        var3 = null;
        if (Z == null) {
            Z = new Image[10];
            Image var14;
            if ((var14 = var3 = e.I(86)).getHeight() <= var11) {
                var14 = var3 = e.I(88);
            }

            for(int var5 = 0; var5 < 10; ++var5) {
                Z[var5] = e.Code(var14, j * var5, 0, j, i, 0);
            }
        }

        if (i < var11) {
            j = I[0].getWidth();
        }

        if (e.r && a == null) {
            a = e.Code(var12);
            var12.getHeight();
            var12.getWidth();
        }

        if (e.r && b == null) {
            b = e.Code(var3);
        }

        if (Code == null || I == null) {
            var11 = k = i * 50 / 100;
            int var13;
            int var15;
            Code = new Object[var15 = (var13 = l = i * 150 / 100) - var11 + 1];
            I = new Object[var15];
            boolean[] var16 = new boolean[]{true, false, false, false, false, true, true, true, false, true, false, true, false};
            boolean[] var17 = new boolean[]{true, false, false, false, true, false, true, false, true, true, true, false, true, false, false, true};
            int var6 = var11;

            while(true) {
                while(var6 <= var13) {
                    if (var15 == 13 && !var16[var6 - var11]) {
                        ++var6;
                    } else if (var15 > 13 && !var17[var6 - var11]) {
                        ++var6;
                    } else {
                        Image[] var7;
                        Image[] var8;
                        if (var6 == i) {
                            var7 = I;
                            var8 = Z;
                        } else {
                            var7 = new Image[10];
                            var8 = new Image[10];

                            for(int var9 = 0; var9 < 10; ++var9) {
                                var7[var9] = e.Code(I[var9], 0, var6, 1, true);
                                var8[var9] = e.Code(Z[var9], 0, var6, 1, true);
                            }
                        }

                        Code[var6 - var11] = var7;
                        I[var6 - var11] = var8;
                        ++var6;
                    }
                }

                return;
            }
        }
    }

    static void J() {
        ByteArrayOutputStream var0 = new ByteArrayOutputStream();
        DataOutputStream var1 = new DataOutputStream(var0);
        Vector var2 = e.J;
        int var3;
        int var10000 = var3 = 0;
        Vector var10001 = var2;

        while(true) {
            try {
                if (var10000 >= var10001.size()) {
                    break;
                }

                Object[] var4;
                int var5;
                var10000 = var5 = e.Code(var4 = e.Code(var2, var3), 9);
                var5 = (var10000 & 2 | -(var10000 & 2)) >>> 31 << 6 | ((var5 & 4 | -(var5 & 4)) >>> 31) * 224 | (var5 & 1) << 7;
                var1.writeByte((byte)(var3 + 1 | var5));
                if ((var5 & 64) != 0) {
                    var1.writeInt(e.Code(var4, 10));
                }
            } catch (IOException var6) {
                break;
            }

            ++var3;
            var10000 = var3;
            var10001 = var2;
        }

        I = var0.toByteArray();
        I = false;
    }

    static void B() {
        if (!Code) {
            Z = new byte[]{0};
        }

    }

    static void Z() {
        int var0 = 5 + (e.aD ^ 1) + 2;
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        DataOutputStream var2;
        DataOutputStream var10000 = var2 = new DataOutputStream(var1);
        int var10001 = var0;

        try {
            var10000.writeByte(var10001);
            var2.writeByte(4);
            var2.writeInt(e.s);
            var2.writeByte(17);
            var2.writeInt(e.a);
            var2.writeByte(0);
            var2.writeInt(e.t);
            if (!e.aD) {
                var2.writeByte(15);
                var2.writeInt(e.A);
            }

            var2.writeByte(3);
            var2.writeInt(e.u);
            var2.writeByte(31);
            var2.writeInt(e.w);
            var2.writeByte(1);
            var2.writeInt(e.x);
            var2.writeByte(2);
            var2.writeInt(e.y);
        } catch (IOException var3) {
        }

        Code = var1.toByteArray();
    }

    private static String Code(Command var0) {
        if (var0 == Code[0]) {
            return "menu:" + e.I(66);
        } else if (var0 == Code[11]) {
            return "dialog:" + e.I(32);
        } else if (var0 == Code[2]) {
            return "menu:" + e.I(68);
        } else if (var0 == Code[4]) {
            return e.I(81);
        } else if (var0 == Code[3]) {
            return e.I(110);
        } else if (var0 != Code[9] && var0 != Code[36]) {
            if (var0 == Code[10]) {
                return e.I(114);
            } else if (var0 != Code[1] && var0 != Code[29]) {
                if (var0 == Code[7]) {
                    return e.I(116);
                } else if (var0 == Code[5]) {
                    return e.I(121);
                } else if (var0 == Code[6]) {
                    return e.I(122);
                } else if (var0 != Code[12] && var0 != Code[38]) {
                    if (var0 == Code[13]) {
                        return e.C;
                    } else if (var0 == Code[20]) {
                        return e.I(92);
                    } else if (var0 == Code[22]) {
                        return e.I(96);
                    } else if (var0 == Code[8]) {
                        return e.I(93);
                    } else if (var0 == Code[21]) {
                        return e.I(94);
                    } else if (var0 == Code[17]) {
                        return e.I(83);
                    } else if (var0 == Code[37]) {
                        return "openp:" + e.c;
                    } else if (var0 == Code[27]) {
                        return e.I(59);
                    } else if (var0 == Code[24]) {
                        return e.I(51);
                    } else if (var0 == Code[25]) {
                        return "menu:" + e.I(128);
                    } else if (var0 == Code[26]) {
                        return e.I(132);
                    } else if (var0 == Code[39]) {
                        return e.I(146);
                    } else if (var0 == Code[40]) {
                        return e.I(147);
                    } else if (var0 == Code[41]) {
                        return "closeTab:";
                    } else {
                        return var0 == Code[42] ? "bottomOverlay:" + e.I(165) : null;
                    }
                } else {
                    return e.I(117);
                }
            } else {
                return e.I(115);
            }
        } else {
            return e.I(113);
        }
    }

    public final synchronized void commandAction(Command var1, Displayable var2) {
        if (this.f) {
            this.f = false;
        } else {
            if (Code().Code != null && Code().Code.b()) {
                if (e.aE && var1 == Code[11]) {
                    e.D = Code().Code.i();
                    e.Code((String)null, e.D);
                    Code().Code.C(false);
                    return;
                }

                if (var1 == Code[29]) {
                    Code().Code.C(true);
                    return;
                }
            }

            if (h()) {
                if (var1 == Code[9]) {
                    Code().d();
                } else if (var1 == Code[10]) {
                    Code().b();
                    o();
                }

                if (e.R) {
                    I.Code();
                } else {
                    this.repaint();
                }
            } else if (var1 == Code[3] && Code().b) {
                Code().Code.i();
            } else {
                if (e.U && var1 == Code[4] && this.s == -11) {
                    this.f = true;
                }

                if (var1 == Code[14]) {
                    Browser.Code();
                } else if (!this.Code()) {
                    String var15;
                    if (var2 == this) {
                        var15 = Code(var1);
                        this.Code((e)null, var15, (String)null);
                    } else {
                        Object var3 = this;
                        if (var1 != Code[4] && var1 != Code[10]) {
                            e var14;
                            if (var1 != Code[9] && var1 != List.SELECT_COMMAND && var1 != Code[19]) {
                                var3 = null;
                                if (var1 == Code[15]) {
                                    this.n();
                                } else if (var1 == Code[18]) {
                                    byte var10000 = 1;
                                    boolean var10 = false;

                                    try {
                                        var10 = true;
                                        if (e.I((var14 = Code(var10000)).Code.Code) == -1) {
                                            this.Code.setString(var14.Code.Code);
                                            var10 = false;
                                        } else {
                                            var10 = false;
                                        }
                                    } finally {
                                        if (var10) {
                                            this.Code.setString("www.");
                                        }
                                    }
                                } else if (var1 == Code[11] && this.Code != null && Browser.Code.getCurrent() == this.Code) {
                                    this.Code.setString("www.");
                                }
                            } else if (var2 instanceof List) {
                                List var13;
                                int var16;
                                if ((var16 = (var13 = (List)var2).getSelectedIndex()) >= 0) {
                                    this.Code.setString(var13.getString(var16));
                                }

                                var3 = this.Code;
                            } else if (var2 instanceof TextBox) {
                                String var4 = ((TextBox)var2).getString();
                                if (Code().Code != null && Code().Code.b != 97 && var4.indexOf(10) != -1 || var4.indexOf(8232) != -1 || var4.indexOf(8233) != -1) {
                                    StringBuffer var5;
                                    e.Code(var5 = new StringBuffer(var4), '\u2029', '\n');
                                    e.Code(var5, '\u2028', '\n');
                                    if (Code().Code.b != 97) {
                                        e.Code(var5, '\n', (char)(var2 == this.Code ? '\u0000' : ' '));
                                    }

                                    var4 = var5.toString();
                                }

                                if (var1 == Code[19]) {
                                    var15 = e.I(47);
                                    this.Code((e)null, var15, (String)null);
                                } else if (Code().Code(16)) {
                                    Code().Code(var4);
                                } else if (e.I(Code().Code.Code) == 109) {
                                    this.Z((String)e.Code(e.C, e.q)[0], var4);
                                } else if (Code().C != 127) {
                                    if (e.I(Code().Code.Code) == 60) {
                                        I var19;
                                        (var19 = new I(35)).I = var4;
                                        var19.Code = Code();
                                        e.Code(var19);
                                    } else if (!Code().Code.Code(var4, false)) {
                                        this.Z(var4);
                                    }
                                } else {
                                    label576: {
                                        B var18;
                                        try {
                                            var18 = Code().Code;
                                            var14 = Code();
                                            if (var18.Code(var4) == 0) {
                                                var14.Code("overlay:" + e.I(46), (String)null, (String)null);
                                                break label576;
                                            }

                                            var18.h();
                                        } finally {
                                            ;
                                        }

                                        var14.b = true;
                                        var18.Z = var18.Code;
                                        var18.J = var18.I;
                                        var18.Code = 24;
                                        var18.I = 3;
                                    }
                                }

                                if (e.D) {
                                    Alert var17;
                                    (var17 = new Alert(e.I, e.Code(22), (Image)null, AlertType.INFO)).setTimeout(50);
                                    Browser.Code.setCurrent(var17, this);
                                    var3 = null;
                                }
                            }
                        } else if (var2 instanceof List) {
                            var3 = this.Code;
                        }

                        if (e.A && var3 == this) {
                            this.setFullScreenMode(true);
                        }

                        if (var3 != null) {
                            Browser.Code.setCurrent((Displayable)var3);
                        }

                    }
                }
            }
        }
    }

    private int Code(int var1) {
        boolean var2;
        if ((var2 = d()) && e.Code(var1, -1, false) != -1) {
            return var1;
        } else {
            byte var3 = -7;
            if (e.M) {
                var3 = -6;
            }

            if (B == 2 || var2) {
                var3 = -8;
            }

            String var13 = null;
            Code var10000 = this;
            int var10001 = var1;

            String var15;
            try {
                var15 = var10000.getKeyName(var10001);
            } finally {
                ;
            }

            var13 = var15;
            int var5;
            if (e.g != null && (var5 = e.g.indexOf((char)var1)) >= 0) {
                return e.h.charAt(var5);
            } else {
                if (e.b == 3) {
                    if (var1 == -14) {
                        return -6;
                    }

                    if (var1 == -13) {
                        return -7;
                    }

                    if (var1 == -20 || var1 == -22) {
                        return 0;
                    }

                    if (var1 == -11) {
                        if (Code().Code != null && Code().Code.Code.equals(e.I(60))) {
                            return var1;
                        }

                        return var3;
                    }
                }

                if (var13 != null) {
                    label1053: {
                        if ((var13 = var13.toLowerCase()).equals("sk2(left)")) {
                            return -6;
                        }

                        if (var13.equals("sk1(right)")) {
                            return -7;
                        }

                        if (e.W && var1 == -7) {
                            return -6;
                        }

                        if (e.W && var1 == -6) {
                            return -7;
                        }

                        if (var1 == 105) {
                            return -6;
                        }

                        if (e.al && var1 == 42 && var13.equals("start")) {
                            return 42;
                        }

                        if (var1 == -20 && var13.equals("symbol")) {
                            return -11;
                        }

                        if (var13.indexOf("soft") >= 0) {
                            if (var13.charAt(var13.length() - 1) == '1' || var13.startsWith("left")) {
                                return -6;
                            }

                            if (var13.charAt(var13.length() - 1) == '2' || var13.charAt(var13.length() - 1) == '4' || var13.startsWith("right")) {
                                return -7;
                            }
                        }

                        if (!var13.equals("clear") && !var13.equals("backspace") && !var13.equals("back")) {
                            if (var13.equals("select") || var13.equals("ok") || var13.equals("send") || var13.equals("fire") || var13.equals("navi-center") || var13.equals("start") || var13.equals("enter")) {
                                return -5;
                            }

                            if (var13.equals("up") || var13.equals("navi-up") || var13.equals("up arrow")) {
                                return 1;
                            }

                            if (var13.equals("down") || var13.equals("navi-down") || var13.equals("down arrow")) {
                                return 6;
                            }

                            if (var13.equals("left") || var13.equals("navi-left") || var13.equals("left arrow")) {
                                return 2;
                            }

                            if (var13.equals("right") || var13.equals("navi-right") || var13.equals("right arrow")) {
                                return 5;
                            }

                            if (!var13.equals("sidedown") && !var13.equals("vol. down")) {
                                if (!var13.equals("sideup") && !var13.equals("vol. up")) {
                                    if (!var13.equals("q") && !var13.equals("w")) {
                                        if (var13.equals("o") || var13.equals("p")) {
                                            return -7;
                                        }
                                        break label1053;
                                    }

                                    return -6;
                                }

                                return -9;
                            }

                            return -10;
                        }

                        return var3;
                    }
                }

                if (var1 == -11 && e.b == 0) {
                    return 0;
                } else if (var1 == -22 && e.b == 2) {
                    return 0;
                } else if (var1 != -6 && var1 != -21 && var1 != 21 && var1 != 65 && var1 != 66 && var1 != -202 && var1 != 113 && var1 != 57345) {
                    if (var1 != -7 && var1 != -22 && var1 != 22 && var1 != 67 && var1 != 68 && var1 != 106 && var1 != -203 && var1 != 112 && var1 != 57346) {
                        if (var1 != -5 && var1 != -10 && var1 != -20 && var1 != 20 && var1 != 23 && var1 != -14 && var1 != -26 && var1 != -200 && var1 != 13) {
                            if (var1 != -8 && var1 != -11 && var1 != -16 && var1 != -19 && var1 != -204) {
                                switch(var1) {
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
                                        return var1;
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
                                        var10000 = this;
                                        var10001 = var1;
                                        boolean var8 = false;

                                        int var16;
                                        try {
                                            var8 = true;
                                            var16 = var10000.getGameAction(var10001);
                                            var8 = false;
                                        } finally {
                                            if (var8) {
                                                return var1;
                                            }
                                        }

                                        int var14 = var16;
                                        if (var16 != 0) {
                                            if (var14 == 8) {
                                                return -5;
                                            } else {
                                                return var14;
                                            }
                                        } else {
                                            return var1;
                                        }
                                }
                            } else {
                                return var3;
                            }
                        } else {
                            return -5;
                        }
                    } else {
                        return -7;
                    }
                } else {
                    return -6;
                }
            }
        }
    }

    private static boolean e() {
        return !Code().a() && !e.aE && e.c() && !Code().Code(2);
    }

    final boolean Code() {
        boolean var1 = false;
        this.v = 0;
        if (this.Z != null) {
            this.Z.cancel();
            this.Z = null;
        }

        if (Code().Code(40) && Code().Code.Code.equals(e.I(76))) {
            this.I(Code());
            var1 = true;
        }

        this.b();
        return var1;
    }

    final int Code() {
        return this.v;
    }

    private void Code(int var1, int var2) {
        if (this.d && !b) {
            this.Code((Graphics)null);
            this.j = false;
            if (J != null) {
                J.cancel();
                J = null;
            }

            if (e.b == 3 && var1 == -11) {
                this.commandAction(Code[4], this);
            } else {
                e var3;
                if ((var3 = Code()) != null) {
                    var3.C = -1;
                    String var4;
                    int var10;
                    if (!var3.a() && !g() && (var3.Code(1) || var3.Code(40) && var3.Code != null && (e.I(var3.Code.Code) == 76 || e.I(var3.Code.Code) == 165 && (var4 = e.Code(this.v, e.Code(var1), false)) != null && var4.indexOf(e.I(160)) >= 0) && (var1 != 1 && var1 != 6 || !var3.C()) && (var1 != 2 && var1 != 5 || !var3.B()))) {
                        B var8;
                        if ((var10 = this.v) != 0 || "0123456789".indexOf(var1) != -1) {
                            var8 = Code().Code;
                            if (e.aE && var8 != null) {
                                this.Code();
                                e.D = var8.i();
                                e.Code(var10, e.Code(var1), e.D);
                                var8.C(false);
                                return;
                            } else {
                                if (e.aA && !b) {
                                    String var7 = e.Code(var10, e.Code(var1), false);
                                    this.Code();
                                    if (var7 != null) {
                                        this.Code((e)null, var7, (String)null);
                                    }
                                }

                                return;
                            }
                        }

                        if (var1 == 35 || var1 == 42) {
                            String var9 = (var8 = Code().Code) != null ? var8.Code : null;
                            if (e.aA && !b && !this.Code((Graphics)null) && var3.Code(1) && (var9 == null || e.I(var9) != 73 && !var9.startsWith("sk:"))) {
                                this.v = var1;
                                this.b();
                                if (!e.aE) {
                                    this.Z = new I(4);
                                    this.Code.schedule(this.Z, 1500L);
                                }

                                B var6 = Code().Code;
                                if (e.aE && var6 != null) {
                                    e.D = var6.i();
                                    Code(148, false);
                                }
                            }

                            return;
                        }
                    }

                    if (var1 == -6) {
                        if (e.af) {
                            return;
                        }

                        this.commandAction(Code[B], this);
                    } else if (var1 == -7) {
                        if (e.af) {
                            return;
                        }

                        this.commandAction(Code[C], this);
                    } else if (var1 == -8 && var3.Code != null && var3.B() != -1) {
                        var10 = e.I(var3.Code.Code);
                        short var5 = -1;
                        switch(var10) {
                            case 90:
                                var5 = 99;
                                break;
                            case 91:
                                var5 = 50;
                                break;
                            case 109:
                                if (var3.B() > 0) {
                                    var5 = 43;
                                } else {
                                    var5 = -1;
                                }
                                break;
                            case 136:
                                var5 = 139;
                        }

                        if (var5 != -1) {
                            var4 = "dialog:" + e.I(var5);
                            this.Code((e)null, var4, (String)null);
                        }
                    } else if (var1 == -5 && a > 0 && a != 23 && a != 29) {
                        if (a == 28 && B >= 0) {
                            this.commandAction(Code[B], this);
                            return;
                        }

                        this.commandAction(Code[a], this);
                        return;
                    }

                    var3.Code(var1, var2);
                    if (e.R) {
                        I.Code();
                    } else {
                        this.repaint();
                    }
                }
            }
        }
    }

    protected final synchronized void keyRepeated(int var1) {
        if (!e.aF) {
            if (this.Code == null) {
                if (e.S && Code(this.I(this.Code(var1)))) {
                    this.g = true;
                    e();
                }

            }
        }
    }

    final void J(String var1) {
        if (e.A) {
            this.setFullScreenMode(false);
        }

        if (e.w) {
            this.Code = Code();
        } else {
            this.Code.removeCommand(Code[9]);
            this.Code.removeCommand(Code[10]);
            this.Code.removeCommand(Code[15]);
            this.Code.removeCommand(Code[18]);
            this.Code.removeCommand(Code[14]);
            this.Code.removeCommand(Code[11]);
        }

        this.Code.addCommand(Code[9]);
        this.Code.addCommand(Code[10]);
        this.Code.addCommand(Code[11]);
        if (Code.size() > 0) {
            this.Code.addCommand(Code[15]);
        }

        if (e.I(Code(1).Code.Code) == -1) {
            this.Code.addCommand(Code[18]);
        }

        Code((Screen)this.Code);
        this.Code.setCommandListener(this);
        if (var1 == null) {
            this.Code.setString("www.");
        } else {
            this.Code.setString(var1);
        }

        Browser.Code.setCurrent(this.Code);
    }

    final synchronized void C() {
        long var1 = System.currentTimeMillis();
        if (this.u >= 0 && var1 >= this.Code) {
            this.Code = var1 + 40L;
            this.g = true;
            e();
        } else {
            if (var1 >= this.Code + 20000L) {
                this.I.cancel();
                this.I = null;
            }

        }
    }

    static boolean Code(B var0) {
        return Code().Code == var0;
    }

    static int Code(Code var0) {
        return var0.w;
    }

    static void Code(Code var0, int var1) {
        var0.a(var1);
    }

    private synchronized void a(int var1) {
        if (var1 == this.w && this.Code != null) {
            ((e)this.Code).B();
        }

    }

    final void I(boolean var1) {
        this.j = var1;
    }

    final void i() {
        this.B = Code(-1, true, (Calendar)null);
    }

    private static boolean Code(int var0) {
        if (!d()) {
            return e.Code(Z, var0);
        } else {
            return var0 != -5 && var0 != -6 && (var0 != -7 || C == 26);
        }
    }

    private static boolean f() {
        e var0;
        String var1;
        return (var0 = Code(1)) != null && var0.Code != null && ((var1 = var0.Code.Z()) == null || !var1.startsWith("myopera:///b/g/"));
    }

    protected final synchronized void keyPressed(int var1) {
        try {
            e.u();
            e.J(var1);
            if (!e.aF || Code(this.Code(var1))) {
                if (this.Code == null) {
                    if (e.X && var1 == -6 && I + 100L > System.currentTimeMillis()) {
                        h = true;
                    } else {
                        if (e.b == -1 && var1 == this.s + 100) {
                            this.getKeyName(var1);
                        }

                        if (!e.ag || var1 != 59440) {
                            this.s = var1;
                            if (var1 == -11 && e.b == 3) {
                                e.T = true;
                            }

                            var1 = this.I(this.Code(var1));
                            this.u = -1;
                            if (!e.T || Code(var1)) {
                                if (h()) {
                                    if (var1 == -5) {
                                        var1 = -6;
                                    }

                                    if (!e.Code(c, var1)) {
                                        o();
                                        if (e.R) {
                                            I.Code();
                                        } else {
                                            this.repaint();
                                        }
                                    }
                                }

                                this.Code(var1, 0);
                                if (!h() && Code(var1)) {
                                    this.t = var1;
                                    this.u = 0;
                                    this.Code = System.currentTimeMillis() + (long)e.d;
                                    if (!e.S && this.I == null) {
                                        this.I = new I(0);
                                        this.Code.schedule(this.I, 40L, 40L);
                                    }
                                }
                            }

                        }
                    }
                }
            }
        } finally {
            this.B(2);
            return;
        }
    }

    private Object Code(int var1, int var2) {
        int var3 = J.size();

        while(var3-- > 0) {
            e var4;
            if ((var4 = (e)J.elementAt(var3)).Code(var1, var2)) {
                return var4;
            }
        }

        this.Code((Graphics)null);
        if (this.B() && (var2 > f - b || e.N && var2 < b)) {
            var3 = e.Code(1, Code[B].getLabel()) + 4;
            int var5 = C == 12 ? e - e.Code(1, Code[C].getLabel()) - this.r.getWidth() - 8 : e - e.Code(1, Code[C].getLabel()) - 4;
            if (var3 < e / 3) {
                var3 = e / 3;
            }

            if (var5 > e / 3 << 1) {
                var5 = e / 3 << 1;
            }

            if (e.N) {
                if (var1 > var5 && var2 > f - b) {
                    return Code[C];
                }

                if (var1 > e - var3 && var2 < b) {
                    return Code[B];
                }
            } else if (var2 > f - b) {
                if (var1 > var5) {
                    return Code[C];
                }

                if (var1 >= var3 && var1 <= var5) {
                    return Code[a];
                }

                if (var1 < var3) {
                    return Code[B];
                }
            }
        }

        return null;
    }

    protected final synchronized void keyReleased(int var1) {
        e.u();
        e.J(var1);
        e.Z(8);
        if (!e.aF || Code(this.Code(var1))) {
            if (this.Code == null) {
                if (e.X) {
                    I = -1L;
                    if (var1 == -6) {
                        if (h) {
                            h = false;
                            return;
                        }

                        I = System.currentTimeMillis();
                    }

                    h = false;
                }

                if (var1 == this.s) {
                    this.s = 2147483647;
                    this.u = -1;
                    var1 = this.I(this.Code(var1));
                    if (e.T && !Code(var1)) {
                        this.Code(var1, 0);
                        if (var1 == -11 && e.b == 3) {
                            e.T = false;
                        }
                    }

                }
            }
        }
    }

    final boolean Code(e var1) {
        if (e.F < 0 && !e.aC) {
            boolean var2;
            e var3;
            for(var2 = false; (var3 = (e)J.elementAt(J.size() - 1)) != var1; var2 = true) {
                this.I(var3);
            }

            return var2;
        } else {
            return false;
        }
    }

    private static int I(int var0, int var1) {
        return e.M ? var1 : var0;
    }

    private static int Z(int var0, int var1) {
        return e.M ? g - var0 : var1;
    }

    protected final synchronized void pointerPressed(int var1, int var2) {
        this.u = -1;
        this.j = true;
        ++this.w;
        e.u();
        e.J(var1);
        e.J(var2);
        e.Z(1);
        if (!e.aF) {
            int var3 = var1;
            int var4 = var2;
            var1 = I(var1, var2);
            var2 = Z(var3, var2);
            this.Code = this.Code(var1, var2);
            if (h() && !(this.Code instanceof Command)) {
                o();
                if (e.R) {
                    I.Code();
                } else {
                    this.repaint();
                }
            } else if (this.Code instanceof Command) {
                if (e.I(Code((Command)this.Code), "menu:")) {
                    this.pointerReleased(var3, var4);
                    this.Code = Code();
                }

                this.b();
            } else {
                Object var10000 = this.Code;
                boolean var10005 = var10000 instanceof e;
                if (var10000 instanceof e && !((e)var10000).j) {
                    var10005 = false;
                }

                boolean var10004 = var10005;
                if (var10005 && ((e)var10000).i) {
                    var10004 = false;
                }

                boolean var10003 = var10004;
                if (var10004 && ((e)var10000).h) {
                    var10003 = false;
                }

                boolean var10002 = var10003;
                if (var10003 && !((e)var10000).g) {
                    var10002 = false;
                }

                boolean var10001 = var10002;
                if (var10002 && !((e)var10000).f) {
                    var10001 = false;
                }

                if (var10001) {
                    if (!this.Code((e)this.Code) || ((e)this.Code).Code(2)) {
                        this.Code.schedule(new I(this), 1000L);
                        ((e)this.Code).I(var1, var2);
                        return;
                    }

                    this.Code = null;
                }

            }
        }
    }

    protected final synchronized void pointerReleased(int var1, int var2) {
        e.u();
        e.J(var1);
        e.J(var2);
        e.Z(1);
        if (!e.aF) {
            int var3 = var1;
            int var4 = var2;
            var1 = I(var1, var2);
            var2 = Z(var3, var2);
            this.pointerDragged(var3, var4);
            Object var10000 = this.Code;
            boolean var10005 = var10000 instanceof e;
            if (var10000 instanceof e && !((e)var10000).j) {
                var10005 = false;
            }

            boolean var10004 = var10005;
            if (var10005 && ((e)var10000).i) {
                var10004 = false;
            }

            boolean var10003 = var10004;
            if (var10004 && ((e)var10000).h) {
                var10003 = false;
            }

            boolean var10002 = var10003;
            if (var10003 && !((e)var10000).g) {
                var10002 = false;
            }

            boolean var10001 = var10002;
            if (var10002 && !((e)var10000).f) {
                var10001 = false;
            }

            if (var10001) {
                ((e)this.Code).Z(var1, var2);
            } else if (this.Code(var1, var2) == this.Code && this.Code instanceof Command) {
                this.commandAction((Command)this.Code, this);
                this.b();
            }

            this.Code = null;
        }
    }

    protected final synchronized void pointerDragged(int var1, int var2) {
        e.u();
        e.J(var1);
        e.J(var2);
        e.Z(1);
        if (!e.aF) {
            int var3 = var1;
            var1 = I(var1, var2);
            var2 = Z(var3, var2);
            Object var10000 = this.Code;
            boolean var10005 = var10000 instanceof e;
            if (var10000 instanceof e && !((e)var10000).j) {
                var10005 = false;
            }

            boolean var10004 = var10005;
            if (var10005 && ((e)var10000).i) {
                var10004 = false;
            }

            boolean var10003 = var10004;
            if (var10004 && ((e)var10000).h) {
                var10003 = false;
            }

            boolean var10002 = var10003;
            if (var10003 && !((e)var10000).g) {
                var10002 = false;
            }

            boolean var10001 = var10002;
            if (var10002 && !((e)var10000).f) {
                var10001 = false;
            }

            if (var10001) {
                Object var4;
                var10000 = var4 = this.Code(var1, var2);
                var10005 = var10000 instanceof e;
                if (var10000 instanceof e && !((e)var10000).j) {
                    var10005 = false;
                }

                var10004 = var10005;
                if (var10005 && ((e)var10000).i) {
                    var10004 = false;
                }

                var10003 = var10004;
                if (var10004 && ((e)var10000).h) {
                    var10003 = false;
                }

                var10002 = var10003;
                if (var10003 && !((e)var10000).g) {
                    var10002 = false;
                }

                var10001 = var10002;
                if (var10002 && !((e)var10000).f) {
                    var10001 = false;
                }

                if (var10001 && ((e)var4).Code(2)) {
                    this.Code = var4;
                }

                ((e)this.Code).J(var1, var2);
            } else {
                if (this.Code(var1, var2) != this.Code) {
                    this.Code = null;
                    this.b();
                }

            }
        }
    }

    static e I() {
        return (e)J.elementAt(I.size() - 1);
    }

    static int I() {
        return I.size();
    }

    static int Z() {
        return I.indexOf(I());
    }

    static e Code(int var0) {
        int var1 = J.size();

        e var2;
        do {
            if (var1-- <= 0) {
                return null;
            }
        } while(!(var2 = (e)J.elementAt(var1)).Code(var0));

        return var2;
    }

    private static void o() {
        e var0;
        if ((var0 = Code()) != null) {
            var0.Z(false);
        }

    }

    static e Code(String var0) {
        int var1 = J.size();

        e var2;
        do {
            if (var1-- <= 0) {
                return null;
            }
        } while((var2 = (e)J.elementAt(var1)).Code == null || !var0.equals(var2.Code.Code));

        return var2;
    }

    private static void l() {
        for(int var0 = 0; var0 < J.size(); ++var0) {
            ((e)J.elementAt(var0)).I();
        }

    }

    final void Code(String var1, String var2) {
        e var3;
        if ((var3 = Code()).Code != null && var3.Code.Code.equals(e.I(70))) {
            this.I(var3);
        }

        StringBuffer var4;
        e.Code((var4 = new StringBuffer()).append("a="), var1);
        if (var2 != null) {
            e.Code(var4.append("&b="), var2);
        }

        Code().Code("overlay:" + e.I(70), (String)null, var4.toString());
    }

    private static boolean h() {
        e var0;
        return (var0 = Code()) != null ? var0.a() : false;
    }

    static boolean I() {
        for(int var0 = 0; var0 < J.size(); ++var0) {
            if (((e)J.elementAt(var0)).Code() != null) {
                return true;
            }
        }

        return false;
    }

    final void Code(String var1, String var2, int var3, e var4) {
        this.Code(var1, (String)null, var2, var3, var4, J.size());
    }

    final void Code(String var1) {
        this.Code(e.Code(37), var1);
    }

    private static int Code(int var0, int var1, int var2) {
        if (var0 < 1250 && var1 < 1250) {
            switch(Code) {
                case 0:
                    return var1 * var0 / var2;
                case 1:
                    return var1 * var0 * var0 / var2 / var2;
            }
        }

        long var3 = (long)var0;
        long var5 = (long)var2;
        long var7 = (long)var1;
        switch(Code) {
            case 0:
                return (int)(var7 * var3 / var5);
            case 1:
                return (int)(var7 * var3 * var3 / var5 / var5);
            default:
                return var1;
        }
    }

    final boolean Z() {
        return this.j || Code().Code == null;
    }

    static boolean Code(boolean[] var0) {
        boolean var1 = false;

        for(int var2 = 0; var2 < I.size(); ++var2) {
            B var3;
            if (!var0[var2] && ((var3 = ((e)I.elementAt(var2)).Code()) == null || var3.C >= 4)) {
                var0[var2] = true;
                var1 = true;
            }
        }

        return var1;
    }

    final boolean C() {
        return this.Code((Graphics)null);
    }

    final boolean J() {
        return !e.K || e.N && this.B();
    }

    final boolean B() {
        return (!e.K || d() || J.size() > 0 && (Code().Code.Code > 0 || Code().Code.I > 0)) && !e.af || this.Code((Graphics)null);
    }

    final void a() {
        e.K ^= true;
        l();
        this.repaint();
    }

    protected final synchronized void showNotify() {
        this.u = -1;
        this.repaint();
    }

    protected final synchronized void hideNotify() {
        this.u = -1;
    }

    final void b() {
        if (e.E) {
            this.repaint();
        } else {
            int var1 = f - b;
            int var2 = e;
            int var3 = b;
            if (e.R) {
                I.Code();
            } else if (this.d && !b) {
                int var4 = Math.max(0, 0);
                int var5 = Math.max(var1, 0);
                if (e.M) {
                    this.repaint(var4, 0, var1 + var3 - var5, var2 - var4);
                } else {
                    this.repaint(var4, var5, var2 - var4, var1 + var3 - var5);
                }
            } else {
                this.repaint();
            }
        }
    }

    static void e() {
        if (!k) {
            k = true;
            Code.repaint();
        }

        l = true;
    }

    static boolean a() {
        return k;
    }

    static int Code(int var0, int var1, int var2, int var3) {
        if (!e.ap) {
            return var1;
        } else {
            var3 = Math.max(0, y - var3);
            if (var0 != var1 && var3 < 160) {
                k = true;
                l = true;
                return var2 + (int)((long)(var1 - var2) * (long)var3 * (long)(160 * (var3 + 160) - var3 * var3) / 4096000L);
            } else {
                return var1;
            }
        }
    }

    static int Code(int var0, int var1) {
        if (!e.ap) {
            return 100;
        } else if ((var1 = Math.max(0, y - var1)) >= 500) {
            return 100;
        } else {
            k = true;
            l = true;
            int var10000 = var0;
            var0 = var1;
            var1 = var10000;
            if (var0 < 150) {
                Code = 1;
                return I(var0, 150, var1, 150);
            } else {
                Code = 1;
                return 150 - I(var0 - 150, 350, 0, 50);
            }
        }
    }

    private static int I(int var0, int var1, int var2, int var3) {
        if (var0 < 0) {
            return var2 + Code(var0, 0, 0);
        } else {
            int var4 = var1 * 100 / 100;
            var2 = (var3 - var2) * 100 / 100;
            return var3 - Code(var1 - var0, var2, var4);
        }
    }

    private static void Code(Graphics var0, int var1, String var2, int var3, int var4) {
        int var5 = f - b / 2 - 1 - (e.B(var1) + e.Code[var1 + 6]) / 2;
        e.Code(var0, var1, var2, var3, var5, var4);
    }

    private static boolean g() {
        return Code.Code >= 0 || e.J >= 0;
    }

    static void Code(String var0, String var1, int var2, boolean var3) {
        int var4 = var1.length();
        B var5;
        if ((var5 = Code().Code) != null) {
            var5.i();
        }

        int var10 = Math.max(5524, var1.length());
        if (e.c > 0) {
            var10 = e.c;
        }

        if (var10 > 255) {
            if (var1.length() > var10) {
                var1 = var1.substring(0, var10);
            }

            boolean var7 = false;

            TextBox var10000;
            try {
                var7 = true;
                var10000 = new TextBox("", var1, var10, var2);
                var7 = false;
            } finally {
                if (var7) {
                    var10 -= var10 / 10;
                }
            }

            TextBox var9 = var10000;
            if (var0 == null) {
                var0 = e.Code(40);
            }

            var9.setTitle(var0 + " (" + var9.getMaxSize() + ")");
            var9.addCommand(Code[9]);
            var9.addCommand(Code[10]);
            if (var3) {
                var9.addCommand(Code[19]);
            }

            Code((Screen)var9);
            Code.f = e.v;
            var9.setCommandListener(Code);
            I = var9;
            A = var4;
            Z(true);
        }
    }

    private boolean Code(Graphics var1) {
        boolean var2 = true;
        int var3 = 0;
        int var4 = 0;
        StringBuffer var5 = new StringBuffer();
        byte var6 = 0;
        B = 23;
        C = 23;
        e var16;
        if (e.aF) {
            var3 = 160;
            var4 = e.H;
        } else if (e.I()) {
            var5.append(e.Code(245));
            var6 = 1;
        } else if (e.F >= 0) {
            var3 = e.E;
            var4 = e.F;
            var6 = 2;
        } else if (e.Y && g()) {
            String var23 = e.Code(173);
            C = 3;
            if (e.J > Code.Code) {
                var3 = e.Z;
                var4 = e.J;
                var23 = e.Code(172);
            } else {
                var3 = Code.I;
                var4 = Code.Code;
            }

            var5.append(var23).append(" ").append(var4 / 1000).append('/').append(var3 / 1000).append(" kB");
        } else {
            if (Code(1) == null) {
                return false;
            }

            B var7;
            if ((var7 = Code(1).Code()) == null && Code(4) != null) {
                var7 = Code(4).Code();
            }

            if (var7 != null && !var7.C && var7 != null) {
                B = 42;
                if ((var16 = Code(40)) != null && var16.Code != null) {
                    B = var16.Code.Code;
                    C = var16.Code.I;
                } else if (var7.J() && e.ax) {
                    C = 38;
                } else {
                    C = 3;
                }

                var3 = var7.Code();
                var4 = var7.I();
                switch(var7.C) {
                    case 1:
                        var5.append(e.Code(20));
                        var6 = 1;
                        break;
                    case 2:
                        var5.append(e.Code(22));
                        var6 = 1;
                        break;
                    case 3:
                    case 4:
                        var5.append(e.Code(23));
                        var5.append(' ').append(var7.Z() / 1000).append('/').append(var3 / 1000).append(" kB");
                }
            } else {
                var2 = false;
                Code().C();
            }
        }

        if (e.af) {
            if (B != p || C != q || a != r) {
                this.k();
            }

            if (!var2) {
                return false;
            }
        }

        if (var1 == null) {
            return var2;
        } else {
            int var25 = 0;
            int var8 = 0;
            int var9 = f - b;
            int var10 = e;
            if (!e.af) {
                var1.setColor(Code[27]);
                var1.drawLine(0, var9, var10 - 1, var9);

                for(var25 = 0; var25 < b; ++var25) {
                    var1.setColor(this.C[var25]);
                    var1.drawLine(0, var9 + var25 + 1, var10 - 1, var9 + var25 + 1);
                }

                String var11 = Code[B].getLabel();
                if (B == 21 && f()) {
                    var11 = "";
                }

                String var12 = Code[C].getLabel();
                String var13 = Code[a].getLabel();
                if (e.N) {
                    var11 = "";
                }

                var25 = e.Code(0, var11) + (B != 23 && !e.N ? 4 : 0);
                int var10000 = e.Code(0, var12);
                int var10001 = C - 23;
                var8 = var10000 + ((var10001 | -var10001) >>> 31 << 2);
                var10000 = e.Code(1, var13);
                var10001 = a - 23;
                int var14 = var10000 + ((var10001 | -var10001) >>> 31 << 2);
                if (var25 >= (var10 - var14) / 2 || var8 >= (var10 - var14) / 2) {
                    var11 = e.Code(0, var11, (var10 - var14) / 2 - 1, ".");
                    var25 = e.Code(0, var11);
                    var12 = e.Code(0, var12, (var10 - var14) / 2 - 1, ".");
                    var8 = e.Code(0, var12);
                }

                boolean var15 = C == 12 || C == 38 || C == 3 && Code().Code() != null && Code().Code().J() && e.ax;
                if (this.r != null) {
                    if (this.r.getWidth() + 3 + var8 < (var10 - var14) / 2 - 1) {
                        var15 &= true;
                    } else {
                        var15 = false;
                    }
                }

                if (var15) {
                    var8 += this.r.getWidth() + 2;
                }

                var1.setColor(Code[1]);
                if (this.Code == Code[B] && Code[B] != Code[23]) {
                    e.Code(var1, 0, var9 + 2, var25, b - 1, Code[8], Code[9]);
                    var1.setColor(Code[2]);
                }

                Code(var1, 0, var11, 2, 20);
                var1.setColor(Code[1]);
                if (this.Code == Code[C] && Code[C] != Code[23]) {
                    e.Code(var1, var10 - var8, var9 + 2, var8, b - 1, Code[8], Code[9]);
                    var1.setColor(Code[2]);
                    if (var15) {
                        var1.drawImage(this.r, var10 - var8 + 3, f - this.r.getHeight() - this.x, 20);
                    }
                } else if (var15) {
                    var1.drawImage(this.s, var10 - var8 + 3, f - this.r.getHeight() - this.x, 20);
                }

                Code(var1, 0, var12, var10 - 2, 24);
                if (this.Code == Code[a] && Code[a] != Code[23]) {
                    e.Code(var1, var10 / 2 - var14 / 2, var9 + 2, var14, b - 1, Code[8], Code[9]);
                }

                var1.setColor(Code[1]);
                if (!e.N) {
                    Code(var1, 1, var13, 0 + var10 / 2, 17);
                }
            }

            if (var2) {
                Code(var1, var25, f - b, e - var8 - var25, b, var4, var3, var5, var6);
            } else if (a == 23) {
                var3 = e.Code(0, this.B);
                if (var25 + var3 / 2 + 1 < var10 / 2 && var8 + var3 / 2 + 1 < var10 / 2) {
                    var3 = this.v;
                    char var21 = ' ';
                    B var17;
                    String var18;
                    if (var3 == 0 && (var17 = Code().Code) != null && var17.I() && (var18 = Code().Code.I()) != null) {
                        char[] var19 = e.Code(var18);
                        if (Code().Code(2) && !c) {
                            if (var19[0] != 0 && J == null) {
                                J = new I(24);
                                this.Code.schedule(J, 1500L);
                            }
                        } else {
                            var3 = var19[0];
                            var21 = var19[1];
                        }
                    }

                    if (var3 != 0) {
                        if ("0123456789".indexOf(var3) != -1) {
                            var1.drawImage(this.Code, var10 / 2, var9 + 1, 17);
                            var1.setColor(Code[32]);
                            Code(var1, 1, String.valueOf((char)var3), var10 / 2, 17);
                        } else {
                            var1.drawImage(this.Code, var10 / 2 - 1, var9 + 1, 24);
                            var1.drawImage(this.Code, var10 / 2, var9 + 1, 20);
                            var1.setColor(Code[32]);
                            Code(var1, 1, String.valueOf((char)var3), (var10 - this.Code.getWidth()) / 2 - 1, 17);
                            if (!e.Code(var21)) {
                                Image var22 = e.Code(var21, Code[32]);
                                var4 = f - b / 2 - 1 - var22.getHeight() / 2;
                                var1.drawImage(var22, (var10 + this.Code.getWidth()) / 2, var4, 17);
                            } else {
                                Code(var1, 1, String.valueOf(var21), (var10 + this.Code.getWidth()) / 2, 17);
                            }
                        }
                    } else {
                        var1.setColor(Code[1]);
                        if (Code().b() < 0) {
                            Code(var1, 0, this.B, var10 / 2, 17);
                        }
                    }

                    if (h() && (var16 = Code()) != null && (var3 = var16.b()) >= 0 && var3 < 1000) {
                        int[] var24 = new int[3];

                        int var20;
                        for(var20 = 0; var3 > 0; ++var20) {
                            var24[var20] = var3 % 10;
                            var3 /= 10;
                        }

                        var1.drawImage(this.Code, var10 / 2 - 1, var9 + 1, 24);
                        var1.drawImage(this.Code, var10 / 2, var9 + 1, 20);
                        var1.setColor(Code[32]);
                        String var10002;
                        Graphics var26;
                        byte var27;
                        if (var20 > 0) {
                            var26 = var1;
                            var27 = 1;
                            var10002 = String.valueOf(var24[var20 - 1]);
                        } else {
                            var26 = var1;
                            var27 = 1;
                            var10002 = "0";
                        }

                        Code(var26, var27, var10002, (var10 - this.Code.getWidth()) / 2 - 1, 17);
                        if (var20 > 1) {
                            Code(var1, 1, String.valueOf(var24[var20 - 2]), (var10 + this.Code.getWidth()) / 2, 17);
                        }
                    }
                }
            }

            return var2;
        }
    }

    private static void Code(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, StringBuffer var7, int var8) {
        var5 = e.Code(var5, 0, var6);
        ++var2;
        int var9 = var6 != 0 ? (int)((long)var3 * (long)var5 / (long)var6) : 0;
        e.Code(var0, var1, var2, var9, var4, Code[40], Code[41]);
        int var10 = var3 - var9;
        var0.setColor(Code[51]);
        var0.drawLine(var1 + var9, var2, var1 + var3 - 1, var2);
        if (var10 >= 2) {
            e.Code(var0, var1 + var9, var2 + 1, var10, var4 - 1, Code[30], Code[31]);
        }

        if (var9 > 0) {
            e.Code(var0, var1 + var9 - 1, var2 + 1, 1, var4 - 1, Code[48], Code[49]);
            var0.setColor(Code[47]);
            var0.drawLine(var1, var2, var1 + var9 - 2, var2);
            var0.setColor(Code[50]);
            var0.drawLine(var1 + var9 - 1, var2, var1 + var9 - 1, var2);
            if (var10 > 0) {
                var0.setColor(Code[51]);
                var0.drawLine(var1 + var9, var2 + 1, var1 + var9, var2 + var4 - 2);
            }
        }

        var0.setColor(Code[29]);
        if (var8 == 2) {
            var7.append(' ').append(var5 * 100 / Math.max(var6, 1)).append('%');
        }

        var2 = var7.length();
        var4 = e.Code(0, var7.toString());
        if (var8 == 1) {
            var5 = (int)(System.currentTimeMillis() - Z >> 9) & 3;
            var7.append("...".substring(0, var5));
        }

        String var11 = var7.toString();
        var6 = e.Code(0, var11);
        if ((var3 - var4 >> 1) + var6 > var3) {
            var7.delete(0, var2);
            if (var8 != 1) {
                var7.insert(0, "...");
            }

            var11 = e.Code(0, var11, var3, var7.toString());
            var4 = e.Code(0, var11);
        }

        Code(var0, 0, var11, var1 + var3 / 2 - var4 / 2, 20);
    }

    private void Code(Graphics var1) {
        if (this.i != this.B()) {
            this.i ^= true;
            l();
        }

        int var2 = -1;
        int var3 = 0;
        e var4 = null;

        int var5;
        for(var5 = J.size() - 1; var5 >= 0; --var5) {
            e var6 = (e)J.elementAt(var5);
            if (var2 < 0 && var6.Code(21)) {
                var2 = var5;
            }

            var6.I(this.u >= 0);
            if (var4 == null || !var6.Code(var4) || var4.J()) {
                var3 = var5;
                var4 = var6;
            }
        }

        for(; var3 < J.size(); ++var3) {
            ((e)J.elementAt(var3)).Code(var1);
            if (var2 == var3) {
                if (this.i && var1.getClipY() + var1.getClipHeight() > f - b) {
                    this.Code(var1);
                    if (e.z > 0) {
                        e.Code(var1, 0, f - b, e, b, e.Code[e.z - 1], false);
                    }
                }

                if (this.J()) {
                    int var24;
                    if (var1.getClipY() < c) {
                        Graphics var17 = var1;
                        Code var18 = this;
                        Image var20 = null;
                        String var7 = null;
                        byte var8 = 0;
                        int var9 = 2;
                        int var10 = 0;
                        B var11 = Code(5).Code;
                        int var12 = e;

                        int var13;
                        for(var13 = 0; var13 < c; ++var13) {
                            var17.setColor(var18.I[var13]);
                            var17.drawLine(0, var13, var12, var13);
                        }

                        if (e.N && !e.af) {
                            String var27 = Code[B].getLabel();
                            if (B == 21 && f()) {
                                var27 = "";
                            }

                            var17.setColor(Code[1]);
                            e.Code(var17, 1, var27, var12 - 2, 1, 24);
                            var12 -= e.Code(1, var27) + 4;
                        }

                        if (var11 != null) {
                            var7 = var11.I;
                            var20 = var11.Code();
                            var10 = var11.a;
                            if (var20 != null) {
                                var9 = 2 + 4 + d;
                            }
                        }

                        if (!e.M && e.b == 0) {
                            switch(var18.getHeight()) {
                                case 160:
                                    var8 = 13;
                                    break;
                                case 208:
                                    var8 = 17;
                                    break;
                                case 320:
                                    var8 = 22;
                                    break;
                                case 416:
                                    var8 = 28;
                            }
                        }

                        var9 += var8;
                        if (var18.o != null) {
                            var13 = var17.getClipX();
                            int var14 = var17.getClipY();
                            int var15 = var17.getClipWidth();
                            e.I(var17, var13, var14, var15, c);
                            if (!e.N) {
                                var17.drawImage(var18.o, var12, 0, 24);
                                var12 -= var18.o.getWidth();
                            }

                            if (var10 == 3) {
                                var17.drawImage(var18.p, var12, (c - var18.p.getHeight()) / 2, 24);
                                var12 -= var18.p.getWidth();
                            }

                            e.Z(var17);
                        }

                        if (a || C) {
                            var17.drawImage(var18.q, var12, (c - var18.q.getHeight()) / 2, 24);
                            var12 -= var18.q.getWidth();
                        }

                        if (var7 != null) {
                            String var19 = e.Code(1, var7, var12 - var9, (String)null);
                            var17.setColor(Code[0]);
                            e.Code(var17, 1, var19, var9, 1, 20);
                            if ((var11 == null || e.I(var11.Code) != -1) && var19.equals(e.I) && (var24 = var19.indexOf(32)) != -1) {
                                var17.setColor(Code[39]);
                                e.Code(var17, 1, var19.substring(0, var24), var9, 1, 20);
                            }
                        }

                        if (var20 != null) {
                            var17.drawImage(var20, var8 + 2, (c - d - 1) / 2, 20);
                        }

                        if (e.z > 0) {
                            e.Code(var1, 0, 0, e, c, e.Code[e.z - 1], false);
                        }
                    }

                    if (var1.getClipY() < c + 3 && e.r) {
                        if (this.I == null) {
                            var5 = e;
                            if (e.z) {
                                int var22;
                                int[] var25 = new int[var22 = var5 * 10];

                                for(int var26 = 0; var26 < var22; ++var26) {
                                    var25[var26] = -1;
                                }

                                Image.createRGBImage(var25, var5, 10, false);
                            }

                            int[] var23 = new int[var5 * 3];

                            for(var24 = 0; var24 < var5; ++var24) {
                                var23[var24] = -1291845632;
                                var23[var24 + var5] = 1929379840;
                                var23[var24 + (var5 << 1)] = 855638016;
                            }

                            this.I = Image.createRGBImage(var23, var5, 3, true);
                        }

                        e var21 = (var4 = Code(16)) != null ? var4.I() : null;
                        if (var4 != null && var21 != null && var21.Code != null && e.I(var21.Code.Code) != 65) {
                            var1.drawImage(this.I, e - e.B, c, 20);
                        } else {
                            var1.drawImage(this.I, 0, c, 20);
                        }
                    }
                }
            }
        }

        if (!this.Z()) {
            Code().I(var1);
        }

        String var16;
        if ((var16 = e.I()) != null) {
            var3 = (e - e.Code(0, var16)) / 2;
            var1.setColor(16777215);
            var1.fillRect(0, 1, e, e.B(0));
            var1.setColor(0);
            e.Code(var1, 0, var16, var3, 1, 20);
        }

    }

    final void I(String var1, String var2) {
        this.Code((e)null, var1, var2);
    }

    final void I(String var1) {
        this.Code((e)null, var1, (String)null);
    }

    final void I(int var1) {
        if (var1 >= 0 && var1 < I.size()) {
            e var2 = (e)I.elementAt(var1);
            this.Code(var2);
        }

    }

    final void Code(int var1) {
        int var2 = I.size();
        if (var1 >= 0 && var1 < var2) {
            e var3 = (e)I.elementAt(var1);
            if (var2 <= 1) {
                this.f();
            } else if (var1 == Z()) {
                if (var1 < var2 - 1) {
                    this.I(var1 + 1);
                } else {
                    this.I(var1 - 1);
                }
            }

            this.I(var3);
        }

    }

    final void Code(e var1, String var2) {
        this.Code(var1, var2, (String)null);
    }

    final void f() {
        this.Code(e.I(65), (String)null, (String)null, false);
    }

    private void Code(e var1) {
        int var2 = J.indexOf(var1);
        int var3;
        if ((var3 = I.size()) - 1 != var2) {
            ((e)J.elementAt(var3 - 1)).B(false);
            J.removeElementAt(var2);
            J.insertElementAt(var1, var3 - 1);
            var1.B(true);
            if (var1.d && var1.I == null) {
                var1.d = false;
                if (var1.Code != null) {
                    var1.Code(true, false, (Hashtable)null);
                }
            }

            I.J();
            if (e.R) {
                I.Code();
                return;
            }

            this.repaint();
        }

    }

    static boolean b() {
        for(int var0 = 0; var0 < I.size(); ++var0) {
            if (((e)I.elementAt(var0)).Code() != null) {
                return true;
            }
        }

        return false;
    }

    final void Z(int var1) {
        int var2;
        if ((var2 = I.size()) >= 2) {
            int var3 = Z();
            this.Code((e)I.elementAt((var3 + var1 + var2) % var2));
        }
    }

    private void n() {
        if (e.A) {
            this.setFullScreenMode(false);
        }

        List var1 = new List(e.Code(6), 3);

        for(int var2 = Code.size() - 1; var2 >= 0; --var2) {
            String var3 = (String)Code.elementAt(var2);
            var1.append(var3, (Image)null);
        }

        var1.setSelectCommand(Code[9]);
        var1.addCommand(Code[4]);
        Code((Screen)var1);
        var1.setCommandListener(this);
        Browser.Code.setCurrent(var1);
    }

    static void J(int var0) {
        e var1 = I();
        int var2 = 0;

        for(int var3 = I.size(); var2 < var3; ++var2) {
            e var4;
            if ((var4 = (e)I.elementAt(var2)) != var1 && var4.Code != null && e.I(var4.Code.Code) == var0) {
                var4.d = true;
            }
        }

    }

    final void B(int var1) {
        this.I(var1, var1 - 1);
    }

    private static TextBox Code() {
        try {
            return new TextBox(e.Code(39), "www.", 400, 524292);
        } catch (IllegalArgumentException var0) {
            return new TextBox(e.Code(39), "www.", 200, 0);
        }
    }

    final void C(int var1) {
        this.I(var1 - 1, var1);
    }

    private static void Code(int var0, Vector var1, Vector var2, Object[] var3) {
        B var4;
        if ((var4 = (B)var3[8]) != null && !var2.contains(var3) && !var4.Code()) {
            var2.addElement(var3);
            if (!var1.contains(var4)) {
                if (var0 < 0) {
                    for(var0 = 0; var0 < var1.size() && ((B)var1.elementAt(var0)).Code <= var4.Code; ++var0) {
                    }

                    var1.insertElementAt(var4, var0);
                    if (var1.size() > 5) {
                        var1.removeElementAt(var1.size() - 1);
                        return;
                    }
                } else {
                    var1.addElement(var4);
                }
            }
        }

    }

    private void I(int var1, int var2) {
        if (var1 >= 2) {
            long var3;
            if ((var3 = System.currentTimeMillis()) - this.J < 5000L && var1 == 2) {
                ++var1;
                ++var2;
            }

            this.J = var3;
        }

        label125: {
            label132: {
                boolean var10001;
                if (var1 >= 2 || var1 < 0) {
                    try {
                        Vector var10 = new Vector();
                        Vector var4 = new Vector();
                        int var5;
                        if (Z != null) {
                            for(var5 = Z.size() - 1; var5 >= 0; --var5) {
                                Code(var1, var10, var4, (Object[])Z.elementAt(var5));
                            }
                        }

                        var5 = 0;

                        label109:
                        while(true) {
                            if (var5 >= J.size()) {
                                var5 = var4.size() - 1;

                                while(true) {
                                    if (var5 < 0) {
                                        break label109;
                                    }

                                    Object[] var16;
                                    B var19 = (B)(var16 = (Object[])var4.elementAt(var5))[8];
                                    if (var10.contains(var19)) {
                                        var19.Code(2);
                                        var16[8] = null;
                                        --var5;
                                    } else {
                                        var19.Code(var2 + 1);
                                        --var5;
                                    }
                                }
                            }

                            e var6;
                            for(int var7 = (var6 = (e)J.elementAt(var5)).Code.size() - 1; var7 >= 0; --var7) {
                                Code(var1, var10, var4, (Object[])var6.Code.elementAt(var7));
                            }

                            ++var5;
                        }
                    } catch (OutOfMemoryError var9) {
                        var10001 = false;
                        break label132;
                    }
                }

                try {
                    int var13 = J.size();

                    while(var13-- > 0) {
                        ((e)J.elementAt(var13)).I(var2);
                    }

                    if (var2 > 0) {
                        e.t();
                    }
                    break label125;
                } catch (OutOfMemoryError var8) {
                    var10001 = false;
                }
            }

            for(var2 = 0; var2 < Z.size(); ++var2) {
                Object[] var11;
                B var14;
                if ((var14 = (B)(var11 = (Object[])Z.elementAt(var2))[8]) != null && !var14.Code()) {
                    var11[8] = null;
                }
            }

            for(var2 = 0; var2 < J.size(); ++var2) {
                e var12 = (e)J.elementAt(var2);

                for(int var15 = 0; var15 < var12.Code.size(); ++var15) {
                    B var17;
                    Object[] var18;
                    if ((var17 = (B)(var18 = (Object[])var12.Code.elementAt(var15))[8]) != null && !var17.Code()) {
                        var18[8] = null;
                    }
                }
            }
        }

        if (var1 >= 3) {
            m();
        }

        System.gc();
    }

    static void g() {
        int var0;
        for(var0 = 0; var0 < Z.size(); ++var0) {
            ((Object[])Z.elementAt(var0))[8] = null;
        }

        var0 = 0;

        for(int var1 = I.size(); var0 < var1; ++var0) {
            e var2 = (e)J.elementAt(var0);

            for(int var3 = 0; var3 < var2.Code.size(); ++var3) {
                ((Object[])var2.Code.elementAt(var3))[8] = null;
            }
        }

    }

    static void h() {
        int var0 = 0;

        while(true) {
            int var10000 = var0;
            Vector var10001 = Z;

            int var1;
            boolean var19;
            try {
                if (var10000 < var10001.size()) {
                    B var17;
                    if ((var17 = (B)((Object[])Z.elementAt(var0))[8]) != null) {
                        var17.Code = null;
                    }

                    ++var0;
                    continue;
                }

                var0 = 0;
                var1 = I.size();
            } catch (Throwable var16) {
                var19 = false;
                return;
            }

            while(true) {
                label230: {
                    e var2;
                    int var3;
                    try {
                        if (var0 >= var1) {
                            return;
                        }

                        if ((var2 = (e)J.elementAt(var0)) == null || var2.Code == null) {
                            break label230;
                        }

                        var3 = 0;
                    } catch (Throwable var15) {
                        var19 = false;
                        return;
                    }

                    while(true) {
                        B var18;
                        try {
                            if (var3 >= var2.Code.size()) {
                                break;
                            }

                            var18 = (B)((Object[])var2.Code.elementAt(var3))[8];
                        } catch (Throwable var14) {
                            var19 = false;
                            return;
                        }

                        B var4 = var18;
                        if (var18 != null) {
                            var4.Code = null;
                        }

                        ++var3;
                    }
                }

                ++var0;
            }
        }
    }
}
