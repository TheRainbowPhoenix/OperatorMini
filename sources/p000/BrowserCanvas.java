package p000;

import com.opera.browser.Browser;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.Screen;
import javax.microedition.lcdui.TextBox;
import javax.microedition.midlet.MIDlet;

/* renamed from: s */
public final class BrowserCanvas extends Canvas implements CommandListener, Runnable {

    /* renamed from: a */
    public static Font f345a = Font.getFont(64, 1, DrawingUtils.font_size);

    /* renamed from: a */
    public static C0017r f346a;

    /* renamed from: a */
    public static final int[] f347a = {52, 52, 52, 54, 54, 54, 56, 50};

    /* renamed from: b */
    public static Font f348b = Font.getFont(64, 0, DrawingUtils.font_size);

    /* renamed from: b */
    public static C0017r f349b;

    /* renamed from: c */
    public static C0017r f350c;

    /* renamed from: c */
    public static int[] skin_colors;

    /* renamed from: d */
    public static C0017r f352d;

    /* renamed from: e */
    public static int f353e = 0;

    /* renamed from: e */
    public static C0017r f354e;

    /* renamed from: f */
    public static C0017r f355f;

    /* renamed from: g */
    public static int f356g = 0;

    /* renamed from: g */
    public static C0017r f357g;

    /* renamed from: h */
    private static int f358h;

    /* renamed from: h */
    public static C0017r f359h;

    /* renamed from: i */
    public static C0017r f360i;

    /* renamed from: j */
    public static C0017r f361j;

    /* renamed from: j */
    public static boolean f362j = false;

    /* renamed from: k */
    public static C0017r f363k;

    /* renamed from: k */
    public static boolean f364k = false;

    /* renamed from: l */
    public static C0017r f365l;

    /* renamed from: m */
    public static C0017r f366m;

    /* renamed from: n */
    public static C0017r f367n;

    /* renamed from: o */
    public static C0017r f368o;

    /* renamed from: p */
    public static C0017r f369p;

    /* renamed from: q */
    public static C0017r f370q;

    /* renamed from: r */
    public static C0017r f371r;

    /* renamed from: s */
    public static C0017r f372s;

    /* renamed from: a */
    public int f373a;

    /* renamed from: a */
    public long f374a;

    /* renamed from: a */
    public Browser browser;

    /* renamed from: a */
    public String f376a = "";

    /* renamed from: a */
    private StringBuffer f377a = new StringBuffer();

    /* renamed from: a */
    public Timer f378a;

    /* renamed from: a */
    public TimerTask f379a;

    /* renamed from: a */
    public Vector f380a = new Vector(20);

    /* renamed from: a */
    public Display display;

    /* renamed from: a */
    public Image skin_image;

    /* renamed from: a */
    private TextBox f383a = null;

    /* renamed from: a */
    public FormField f384a = null;

    /* renamed from: a */
    public Window window;

    /* renamed from: a */
    public BufferedByteArrOutStream f386a = new BufferedByteArrOutStream();

    /* renamed from: a */
    public boolean f387a;

    /* renamed from: b */
    public int f388b = 0;

    /* renamed from: b */
    public long f389b;

    /* renamed from: b */
    public String f390b;

    /* renamed from: b */
    public TimerTask f391b;

    /* renamed from: b */
    private Vector f392b = new Vector();

    /* renamed from: b */
    public Image f393b = null;

    /* renamed from: b */
    public FormField search_field = null;

    /* renamed from: b */
    public Window f395b;

    /* renamed from: b */
    public boolean f396b;

    /* renamed from: b */
    public int[] f397b;

    /* renamed from: c */
    public int f398c = 0;

    /* renamed from: c */
    public long f399c;

    /* renamed from: c */
    public String f400c;

    /* renamed from: c */
    private TimerTask f401c;

    /* renamed from: c */
    public Image f402c = null;

    /* renamed from: c */
    public Window f403c;

    /* renamed from: c */
    public boolean f404c = false;

    /* renamed from: d */
    public int f405d = -1;

    /* renamed from: d */
    public String f406d = null;

    /* renamed from: d */
    public Image f407d = null;

    /* renamed from: d */
    public Window f408d;

    /* renamed from: d */
    public boolean f409d = true;

    /* renamed from: d */
    private int[] f410d = {1, 6, 2, 5};

    /* renamed from: e */
    public String f411e;

    /* renamed from: e */
    public Image f412e = null;

    /* renamed from: e */
    private Window f413e;

    /* renamed from: e */
    public boolean f414e = false;

    /* renamed from: e */
    private int[] f415e = new int[f347a.length];

    /* renamed from: f */
    public int f416f = 2;

    /* renamed from: f */
    public String f417f;

    /* renamed from: f */
    public Image f418f = null;

    /* renamed from: f */
    private Window f419f;

    /* renamed from: f */
    public boolean f420f = false;

    /* renamed from: g */
    public String f421g;

    /* renamed from: g */
    public Image f422g = null;

    /* renamed from: g */
    public boolean f423g = false;

    /* renamed from: h */
    public Image f424h = null;

    /* renamed from: h */
    public boolean f425h;

    /* renamed from: i */
    private int f426i;

    /* renamed from: i */
    private Image f427i;

    /* renamed from: i */
    public boolean f428i = false;

    /* renamed from: l */
    private boolean f429l = false;

    /* renamed from: t */
    private C0017r f430t;

    /* renamed from: u */
    private C0017r f431u;

    public BrowserCanvas(Browser browser2) {
        DrawingUtils.m87a((MIDlet) browser2, (Canvas) this);
        skin_colors = new int[32];
        this.f398c = Math.max(10, (int) DrawingUtils.m73a(f345a, true)) + 3;
        this.f388b = this.f398c;
        if (hasPointerEvents()) {
            this.f388b += 4;
        }
        DrawingUtils.m124f();
        this.skin_image = DrawingUtils.loadImageResource("/skin.png");
        if (this.skin_image != null) {
            this.skin_image.getRGB(skin_colors, 0, 32, 0, 21, 32, 1);
            for (int i = 0; i < 32; i++) {
                skin_colors[i] = skin_colors[i] & 16777215;
            }
        }
        this.skin_image = DrawingUtils.m71a(this.skin_image, 1, this.f398c);
        this.f397b = new int[this.f398c];
        if (this.skin_image != null) {
            this.skin_image.getRGB(this.f397b, 0, 1, 0, 0, 1, this.f398c);
        }
        Window.SKIN_COLORS = skin_colors;
        m218m();
        this.browser = browser2;
        this.display = browser2.f69a;
        if (!DrawingUtils.f207v) {
            setFullScreenMode(true);
        }
        this.display.setCurrent(this);
        if (DrawingUtils.f181e) {
            BrowserCanvas.super.addCommand(f359h);
        }
        DrawingUtils.f164b = 0;
        this.f426i = getWidth();
        repaint();
        f353e = 0;
    }

    /* renamed from: a */
    private int mo61a(int i) {
        String str;
        int i2 = 0;
        try {
            i2 = getGameAction(i);
        } catch (IllegalArgumentException e) {
        }
        try {
            str = getKeyName(i);
        } catch (IllegalArgumentException e2) {
            str = null;
        }
        if (str != null) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.equals("soft1") || lowerCase.equals("soft 1") || lowerCase.equals("soft_1") || lowerCase.equals("softkey 1") || lowerCase.startsWith("left soft")) {
                return -6;
            }
            if (lowerCase.equals("soft2") || lowerCase.equals("soft 2") || lowerCase.equals("soft_2") || lowerCase.equals("softkey 4") || lowerCase.startsWith("right soft")) {
                return -7;
            }
            if (lowerCase.equals("clear") || lowerCase.equals("back")) {
                return -7;
            }
            if (lowerCase.equals("select") || lowerCase.equals("ok") || lowerCase.equals("send") || lowerCase.equals("fire") || lowerCase.equals("navi-center") || lowerCase.equals("start")) {
                return 8;
            }
            if (lowerCase.equals("up") || lowerCase.equals("navi-up") || lowerCase.equals("up arrow")) {
                return 1;
            }
            if (lowerCase.equals("down") || lowerCase.equals("navi-down") || lowerCase.equals("down arrow")) {
                return 6;
            }
            if (lowerCase.equals("left") || lowerCase.equals("navi-left") || lowerCase.equals("left arrow") || lowerCase.equals("sideup")) {
                return 2;
            }
            if (lowerCase.equals("right") || lowerCase.equals("navi-right") || lowerCase.equals("right arrow") || lowerCase.equals("sidedown")) {
                return 5;
            }
            if (lowerCase.equals("q") || lowerCase.equals("w")) {
                return -6;
            }
            if (lowerCase.equals("o") || lowerCase.equals("p")) {
                return -7;
            }
            if (lowerCase.equals("escape")) {
                return 8;
            }
        }
        if (i == -6 || i == -21 || i == 21 || i == 105 || i == -202 || i == 112 || i == 57345) {
            return -6;
        }
        if (i == -7 || i == -22 || i == 22 || i == 106 || i == -203 || i == 113 || i == 57346) {
            return -7;
        }
        if (i == -5 || i == -10 || i == -20 || i == 20 || i == 23 || i == -14 || i == -26 || i == -200 || i == 10 || i == 13) {
            return 8;
        }
        if (i == -8 || i == -11 || i == -16 || i == -19 || i == -204) {
            return -7;
        }
        if (DrawingUtils.f137A) {
            switch (i) {
                case 50:
                    return 1;
                case 52:
                    return 2;
                case 53:
                    return 8;
                case 54:
                    return 5;
                case 56:
                    return 6;
            }
        }
        switch (i) {
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
                return i;
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
                return i2 != 0 ? i2 : i;
        }
    }

    /* renamed from: a */
    public static String m198a(int i) {
        Calendar a = DrawingUtils.m68a();
        int i2 = a.get(12);
        if (i < 0 || i > 23) {
            i = a.get(11);
        }
        if (DrawingUtils.use_24h) {
            return new StringBuffer().append(i < 10 ? "0" : "").append(i).append(":").append(i2 < 10 ? "0" : "").append(i2).toString();
        }
        boolean z = true;
        if (i >= 12) {
            z = false;
            i -= 12;
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (i == 0) {
            i = 12;
        }
        return stringBuffer.append(i).append(":").append(i2 < 10 ? "0" : "").append(i2).append(z ? " AM" : " PM").toString();
    }

    /* renamed from: a */
    private static TextBox mo60a() {
        return new TextBox(DrawingUtils.get_string_resource(47), "www.", 512, 4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e A[LOOP:0: B:26:0x008a->B:28:0x008e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m200a(javax.microedition.lcdui.Graphics r15) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.BrowserCanvas.m200a(javax.microedition.lcdui.Graphics):void");
    }

    /* renamed from: a */
    private void m201a(Graphics graphics, int i, int i2) {
        if (DrawingUtils.f160a) {
            int[] iArr = new int[(getWidth() * 8)];
            int i3 = i | (i2 << 24);
            int length = iArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = i3;
            }
            Image createRGBImage = Image.createRGBImage(iArr, getWidth(), 8, true);
            int height = getHeight();
            for (int i5 = 0; i5 < height; i5 += 8) {
                graphics.drawImage(createRGBImage, 0, i5, 0);
            }
        }
    }

    /* renamed from: a */
    private void m202a(Graphics graphics, int i, int i2, int i3, int i4) {
        String a;
        PageDataRunnable uVar = this.window.f311b;
        if (this.window.m188c() && uVar != null) {
            graphics.setColor(skin_colors[26]);
            graphics.drawRect(i, i2, i3 - 1, i4);
            int i5 = i + 1;
            int i6 = i2 + 1;
            int i7 = i3 - 2;
            int i8 = i4 - 1;
            int a2 = uVar.m328a();
            int b = uVar.m343b();
            int i9 = a2 != 0 ? (i7 * b) / a2 : 0;
            int i10 = skin_colors[27];
            int i11 = (i10 >> 16) & 255;
            int i12 = 0;
            int i13 = i10 & 255;
            int i14 = (i10 >> 8) & 255;
            while (i12 < i8) {
                graphics.setColor(i11, i14, i13);
                graphics.drawLine(i5, i6 + i12, i5 + i9, i6 + i12);
                int i15 = i11 - i12;
                int i16 = i14 - i12;
                int i17 = i13 - i12;
                if (i15 < 0 || i16 < 0 || i17 < 0) {
                    i15 = 0;
                    i16 = 0;
                    i17 = 0;
                }
                i12++;
                i13 = i17;
                i14 = i16;
                i11 = i15;
            }
            int i18 = i7 - i9;
            DrawingUtils.makeGradient(graphics, i5 + i9, i6, i7 - i9, i8 + 1, skin_colors[29], skin_colors[30]);
            if (i18 >= 1) {
                graphics.setColor(skin_colors[21]);
                graphics.drawLine(i5 + i9, i6, i5 + i9, (i6 + i8) - 1);
            }
            if (i18 >= 2) {
                graphics.setColor(skin_colors[22]);
                graphics.drawLine(i5 + i9 + 1, i6, i5 + i9 + 1, (i6 + i8) - 1);
                graphics.drawLine(i5 + i9 + 1, i6, i7, i6);
            }
            if (i18 >= 3) {
                graphics.setColor(skin_colors[23]);
                graphics.drawLine(i5 + i9 + 2, i6 + 1, i5 + i9 + 2, (i6 + i8) - 1);
                graphics.drawLine(i5 + i9 + 2, i6 + 1, i7, i6 + 1);
            }
            graphics.setColor(skin_colors[28]);
            if (this.f377a == null) {
                this.f377a = new StringBuffer();
            }
            this.f377a.delete(0, this.f377a.length());
            char c = 1;
            if (!f362j) {
                switch (uVar.f494h) {
                    case 1:
                        a = DrawingUtils.get_string_resource(21);
                        if (DrawingUtils.f196k) {
                            a = DrawingUtils.get_string_resource(23);
                            break;
                        }
                        break;
                    case 2:
                        a = DrawingUtils.get_string_resource(22);
                        if (DrawingUtils.f196k) {
                            a = DrawingUtils.get_string_resource(23);
                            break;
                        }
                        break;
                    case 3:
                        a = DrawingUtils.get_string_resource(23);
                        break;
                    case 4:
                    default:
                        a = "";
                        break;
                    case 5:
                    case 6:
                        a = DrawingUtils.get_string_resource(24);
                        c = 2;
                        break;
                }
            } else {
                a = DrawingUtils.get_string_resource(107);
            }
            this.f377a.append(a);
            int a3 = DrawingUtils.m56a(f348b, this.f377a.toString(), true);
            if (c == 1) {
                int currentTimeMillis = ((int) ((System.currentTimeMillis() - this.window.f301a) / 500)) % 4;
                for (int i19 = 0; i19 < currentTimeMillis; i19++) {
                    this.f377a.append(".");
                }
            } else if (c == 2 && a2 > 0) {
                this.f377a.append(" ");
                this.f377a.append(b / 1024);
                this.f377a.append("/");
                this.f377a.append(a2 / 1024);
                this.f377a.append(" kB");
            }
            String stringBuffer = this.f377a.toString();
            int a4 = DrawingUtils.m56a(f348b, stringBuffer, true);
            if (c == 2) {
                a3 = a4;
            }
            if (a4 > i7) {
                this.f377a.delete(0, a.length());
                if (c != 1) {
                    this.f377a.insert(0, "...");
                }
                String stringBuffer2 = this.f377a.toString();
                int a5 = DrawingUtils.m56a(f348b, stringBuffer2, true);
                int clipX = graphics.getClipX();
                int clipY = graphics.getClipY();
                int clipWidth = graphics.getClipWidth();
                int clipHeight = graphics.getClipHeight();
                graphics.setClip(clipX, clipY, Math.min(clipWidth, (i7 - a5) - clipX), clipHeight);
                DrawingUtils.m84a(graphics, f348b, a, i5, i6 + 1, 20, 0, i9, 16777215, true);
                graphics.setClip(clipX, clipY, clipWidth, clipHeight);
                DrawingUtils.m84a(graphics, f348b, stringBuffer2, i7, i6 + 1, 24, 0, i9, 16777215, true);
                return;
            }
            DrawingUtils.m84a(graphics, f348b, stringBuffer, ((i7 / 2) + i5) - (a3 / 2), i6 + 1, 20, 0, i9, 16777215, true);
        }
    }

    /* renamed from: a */
    private void m203a(Graphics graphics, Window pVar, boolean z) {
        if (!(graphics == null || pVar == null)) {
            graphics.setColor(skin_colors[3]);
            graphics.drawRect(pVar.x - 1, pVar.y - 3, pVar.width + 1, pVar.height + 4);
            DrawingUtils.makeGradient(graphics, pVar.x + 2, pVar.y - 1, pVar.width - 4, pVar.height + 2, skin_colors[6], skin_colors[4]);
            graphics.setColor(skin_colors[4]);
            graphics.drawLine(pVar.x, pVar.y - 1, pVar.x, pVar.y + pVar.height);
            graphics.drawLine((pVar.x + pVar.width) - 1, pVar.y - 1, (pVar.x + pVar.width) - 1, pVar.y + pVar.height);
            graphics.drawLine(pVar.x, pVar.y + pVar.height, (pVar.x + pVar.width) - 1, pVar.y + pVar.height);
            graphics.drawLine(pVar.x, pVar.y - 2, (pVar.x + pVar.width) - 1, pVar.y - 2);
            graphics.setColor(skin_colors[5]);
            graphics.drawLine(pVar.x + 1, pVar.y - 1, pVar.x + 1, pVar.y + pVar.height);
            graphics.drawLine((pVar.x + pVar.width) - 2, pVar.y - 1, (pVar.x + pVar.width) - 2, pVar.y + pVar.height);
            if (DrawingUtils.f160a) {
                int i = pVar.x + pVar.width + 1;
                if (this.f407d != null) {
                    graphics.drawImage(this.f407d, i, pVar.y - 3, 0);
                }
                int i2 = pVar.y + 1;
                int i3 = pVar.height + i2 + 1;
                if (this.f412e != null) {
                    while (i2 < i3) {
                        graphics.drawImage(this.f412e, i, i2, 0);
                        i2++;
                    }
                }
                if (!(!z || this.f418f == null || this.f422g == null || this.f424h == null)) {
                    graphics.drawImage(this.f418f, i, i3, 0);
                    for (int i4 = pVar.x + 4; i4 < i; i4++) {
                        graphics.drawImage(this.f422g, i4, i3, 0);
                    }
                    graphics.drawImage(this.f424h, pVar.x, i3, 0);
                }
            }
            pVar.paint(graphics);
        }
    }

    /* renamed from: a */
    public static void m204a(Screen screen) {
        if (screen != null && DrawingUtils.f181e) {
            screen.addCommand(f359h);
        }
    }

    /* renamed from: a */
    private void m205a(boolean z) {
        if (z) {
            if (this.f379a == null) {
                this.f379a = new C0011l(this, 3);
                this.f378a.scheduleAtFixedRate(this.f379a, (long) ((61 - Calendar.getInstance().get(13)) * 1000), 60000);
                m226a();
            }
        } else if (this.f379a != null) {
            this.f379a.cancel();
            this.f379a = null;
            mo72d();
        }
    }

    /* renamed from: a */
    private boolean m206a(int i) {
        for (int length = this.f410d.length - 1; length >= 0; length--) {
            if (i == this.f410d[length]) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m207b(int i) {
        int d = this.window.pageImageData.m353d(this.window.f300a);
        DrawingUtils.m77a(d, d + i);
        mo62a(i > 0 ? 6 : 1, 0);
        commandAction(f355f, this);
    }

    /* renamed from: b */
    private void drawFooterNavGradient(Graphics graphics) {
        int height = getHeight() - this.f388b;
        int width = getWidth();
        int i = this.f388b;
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        int i2 = i - this.f398c;
        graphics.setColor(skin_colors[26]);
        graphics.drawLine(0, height, width - 1, height);
        if (i2 > 0) {
            graphics.setColor(this.f397b[0]);
            graphics.fillRect(0, height + 1, getWidth(), i2);
        } else if (i2 < 0) {
            i2 = 0;
        }
        int i3 = i2 + 1;
        for (int i4 = 0; i4 < this.f398c; i4++) {
            graphics.setColor(this.f397b[i4]);
            graphics.drawLine(0, height + i4 + i3, width - 1, height + i4 + i3);
        }
        int i5 = this.window.width;
        if (this.window.m188c()) {
            this.f430t = f372s;
            this.f431u = f354e;
            m202a(graphics, 0, getHeight() - this.f388b, i5 - (this.f431u.f343b + 6), this.f388b);
        } else if (DrawingUtils.f149M) {
            int i6 = this.f430t.f343b;
            int i7 = this.f431u.f343b;
            int a = DrawingUtils.m56a(f348b, this.f376a, true);
            if (i6 + (a / 2) + 1 < width / 2 && (a / 2) + i7 + 1 < width / 2) {
                graphics.setColor(skin_colors[1]);
                DrawingUtils.m85a(graphics, f348b, this.f376a, width / 2, height + 2, 17, 0, true);
            }
        }
        if (this.f430t.f342a) {
            DrawingUtils.drawOnScreenSelection(graphics, 0, height, this.f430t.f343b, this.f388b, false);
        } else if (this.f431u.f342a) {
            DrawingUtils.drawOnScreenSelection(graphics, ((width + 0) - this.f431u.f343b) - 6, height, this.f431u.f343b + 6, this.f388b, false);
        }
        graphics.setClip(clipX, clipY, clipWidth, Math.min(((height + i) - 1) - clipY, clipHeight));
        graphics.setColor(this.f430t.f342a ? skin_colors[2] : skin_colors[1]);
        DrawingUtils.m85a(graphics, f345a, this.f430t.getLabel(), 2, height + 2, 20, 0, true);
        graphics.setColor(this.f431u.f342a ? skin_colors[2] : skin_colors[1]);
        DrawingUtils.m85a(graphics, f345a, this.f431u.getLabel(), (width + 0) - this.f431u.f343b, height + 2, 20, 0, true);
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }

    /* renamed from: b */
    private void m209b(boolean z) {
        this.f429l = z;
        if (this.f403c == null || this.f403c.pageImageData == null || this.f403c.pageImageData.f472c == null) {
            this.f403c = new Window(this, 200, 80, 2, ((getHeight() - 80) - 2) - this.f388b, 8, 8);
            this.f403c.openUrl("opera:menu", false, false, (String) null, (String) null);
        } else {
            this.f403c.mo45a(this.f403c.pageImageData);
            this.f403c.m183b(this.f403c.pageImageData.f472c[0]);
            repaint();
        }
        if (z) {
            this.f395b = this.f403c;
        }
    }

    /* renamed from: b */
    private boolean mo67b() {
        return this.f409d || this.f429l || this.window.m188c() || (this.window.pageImageData != null && this.window.pageImageData.f498i);
    }

    /* renamed from: c */
    private void m211c(int i) {
        this.f396b = true;
        this.f389b = System.currentTimeMillis();
        this.f373a = i;
        this.f387a = true;
        if (this.f391b == null && !DrawingUtils.f209x) {
            this.f391b = new C0011l(this, 2);
            if (this.f378a != null) {
                this.f378a.schedule(this.f391b, (long) DrawingUtils.f155a, 50);
            }
        }
    }

    /* renamed from: c */
    private void m212c(String str) {
        if (this.f392b == null) {
            this.f392b = new Vector();
        }
        if (this.f392b.size() > 30) {
            this.f392b.removeElement(this.f392b.firstElement());
        }
        if (this.f392b.contains(str)) {
            this.f392b.removeElement(str);
        }
        this.f392b.addElement(str);
        DrawingUtils.m108b(this.f392b);
    }

    /* renamed from: c */
    private void m213c(Graphics graphics) {
        graphics.setColor(16777215);
        graphics.fillRect(graphics.getClipX(), graphics.getClipY(), graphics.getClipWidth(), graphics.getClipHeight());
        if (this.f427i == null) {
            this.f427i = DrawingUtils.loadImageResource("/om100.png");
        }
        if (this.f427i != null) {
            graphics.drawImage(this.f427i, getWidth() / 2, getHeight() / 2, 3);
        }
        graphics.setColor(0);
        Font font = Font.getFont(64, 0, 8);
        graphics.setFont(font);
        String a = DrawingUtils.get_string_resource(56);
        int width = (getWidth() / 2) - (DrawingUtils.m56a(font, a, true) / 2);
        for (int i = 0; i < f353e; i++) {
            a = new StringBuffer().append(a).append(".").toString();
        }
        graphics.drawString(a, width, (getHeight() - 20) + DrawingUtils.m73a(font, true), 36);
    }

    /* renamed from: c */
    private void m214c(boolean z) {
        this.f429l = z;
        this.f408d = new Window(this, 200, 80, 2, ((getHeight() - 80) - 2) - this.f388b, 8, 8);
        this.f408d.openUrl("opera:bookmarksmenu", false, false, (String) null, (String) null);
        if (z) {
            this.f395b = this.f408d;
        }
    }

    /* renamed from: d */
    private void m215d(int i) {
        for (int i2 = 1; i2 < this.f415e.length; i2++) {
            this.f415e[i2 - 1] = this.f415e[i2];
        }
        this.f415e[this.f415e.length - 1] = i;
        int i3 = 0;
        while (i3 < this.f415e.length && this.f415e[i3] == f347a[i3]) {
            if (i3 == this.f415e.length - 1) {
                DrawingUtils.use_smooth_scroll = !DrawingUtils.use_smooth_scroll;
                DrawingUtils.f147K = !DrawingUtils.f147K;
                this.display.vibrate(500);
            }
            i3++;
        }
    }

    /* renamed from: d */
    private void m216d(String str) {
        this.f413e = new Window(this, 200, 55, this.f395b.width - 12, (((getHeight() - 80) - 2) - this.f388b) - 14, 8, 8);
        this.f413e.openUrl(str, false, false, (String) null, (String) null);
    }

    /* renamed from: l */
    private void m217l() {
        this.f392b = DrawingUtils.m105b();
        if (this.window != null) {
            this.window.f302a = DrawingUtils.m69a();
        }
    }

    /* renamed from: m */
    private void m218m() {
        int i = DrawingUtils.f170c == 3 ? 2 : 3;
        switch (DrawingUtils.f170c) {
            case 2:
                i = 8;
                break;
        }
        f346a = new C0017r(this, DrawingUtils.get_string_resource(31), 1, 1);
        f349b = new C0017r(this, DrawingUtils.get_string_resource(51), 1, 1);
        f350c = new C0017r(this, DrawingUtils.get_string_resource(118), 1, 1);
        f352d = new C0017r(this, DrawingUtils.get_string_resource(1), i, 2);
        f354e = new C0017r(this, DrawingUtils.get_string_resource(3), 6, 2);
        f357g = new C0017r(this, DrawingUtils.get_string_resource(6), 8, 2);
        f370q = new C0017r(this, DrawingUtils.get_string_resource(20), 8, 1);
        f371r = new C0017r(this, DrawingUtils.get_string_resource(50), 8, 1);
        f355f = new C0017r(this, DrawingUtils.get_string_resource(5), 2);
        f359h = new C0017r(this, DrawingUtils.get_string_resource(10), 7, 2);
        f360i = new C0017r(this, DrawingUtils.get_string_resource(4), 2, 2);
        f361j = new C0017r(this, DrawingUtils.get_string_resource(11), 4, 1);
        f363k = new C0017r(this, DrawingUtils.get_string_resource(12), i, 2);
        f365l = new C0017r(this, DrawingUtils.get_string_resource(91), 1);
        f366m = new C0017r(this, DrawingUtils.get_string_resource(0), 4, 1);
        f367n = new C0017r(this, DrawingUtils.get_string_resource(18), 1);
        f368o = new C0017r(this, DrawingUtils.get_string_resource(104), 2);
        f369p = new C0017r(this, DrawingUtils.get_string_resource(106), 4, 1);
        if (f372s == null) {
            f372s = new C0017r(this, "", 2, 2);
        }
        this.f430t = f372s;
        this.f431u = f372s;
        this.f383a = mo60a();
        this.f403c = null;
    }

    /* renamed from: n */
    private void m219n() {
        if (DrawingUtils.f203r) {
            setFullScreenMode(false);
        }
        List list = new List(DrawingUtils.get_string_resource(6), 3);
        if (this.f392b != null) {
            for (int size = this.f392b.size() - 1; size >= 0; size--) {
                list.append((String) this.f392b.elementAt(size), (Image) null);
            }
            list.setSelectCommand(f366m);
            list.addCommand(f360i);
            m204a((Screen) list);
            list.setCommandListener(this);
            this.display.setCurrent(list);
        }
    }

    /* renamed from: o */
    private void m220o() {
        this.f429l = false;
        this.f408d = null;
        this.f413e = null;
        if (this.window != null) {
            this.window.f312b = true;
        }
        mo74f();
        repaint();
    }

    /* renamed from: p */
    private void m221p() {
        this.f413e = null;
        this.window.f312b = true;
        repaint();
    }

    /* renamed from: q */
    private void m222q() {
        if (this.window != null) {
            if (this.window.f302a != null) {
                this.window.f302a.removeAllElements();
            }
            if (this.window.f310b != null) {
                this.window.f310b.removeAllElements();
            }
            this.window.f313c = -1;
            this.window.f316d = -1;
            mo79k();
        }
        if (this.f392b != null) {
            this.f392b.removeAllElements();
        }
        DrawingUtils.m119d("eurls");
        DrawingUtils.m119d("h");
        DrawingUtils.f154R = true;
    }

    /* renamed from: r */
    private void m223r() {
        Image a;
        if (DrawingUtils.f160a && (a = DrawingUtils.loadImageResource("/sh.png")) != null) {
            this.f407d = Image.createImage(a, 0, 0, 4, 4, 0);
            this.f424h = Image.createImage(a, 4, 0, 4, 4, 0);
            this.f418f = Image.createImage(a, 8, 0, 4, 4, 0);
            this.f422g = Image.createImage(a, 12, 0, 1, 4, 0);
            this.f412e = Image.createImage(a, 12, 0, 1, 4, 6);
        }
    }

    /* renamed from: s */
    private void m224s() {
        if (this.f429l) {
            m220o();
            m221p();
        }
        this.f395b = null;
        this.f413e = null;
        this.f403c = null;
        this.f408d = null;
    }

    /* renamed from: a */
    public final PageDataRunnable mo59a(String str, String str2) {
        String str3 = str == null ? "" : str;
        if (str2 == null) {
            str2 = "";
        }
        int indexOf = str3.indexOf(35);
        String substring = indexOf != -1 ? str3.substring(0, indexOf) : str3;
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            str2 = str2.substring(0, indexOf2);
        }
        PageDataRunnable uVar = null;
        int i = 0;
        while (i < this.f380a.size()) {
            PageDataRunnable uVar2 = (PageDataRunnable) this.f380a.elementAt(i);
            String a = uVar2.mo95a(false);
            String b = uVar2.m345b();
            if (substring.equals(a)) {
                return uVar2;
            }
            if (!str2.equals(b) || uVar != null || substring.length() != 0) {
                uVar2 = uVar;
            }
            i++;
            uVar = uVar2;
        }
        return uVar;
    }

    /* renamed from: a */
    public final void m226a() {
        this.f376a = m198a(-1);
        if (this.window != null && this.window.pageImageData != null) {
            PageDataRunnable uVar = this.window.pageImageData;
            if (uVar.m333a().equals("opera:settings")) {
                uVar.m352c();
                if (!DrawingUtils.f143G) {
                    repaint();
                }
            }
        }
    }

    /* renamed from: a */
    public final void m227a(int i) {
        switch (i) {
            case 0:
                if (this.window != null) {
                    m232a();
                    DrawingUtils.f159a = null;
                    break;
                }
                break;
            case 1:
                if (!(this.window == null || this.window.pageImageData == null || this.window.pageImageData.page_images == null)) {
                    this.window.pageImageData.page_images = null;
                }
                if (this.window != null) {
                    mo79k();
                    DrawingUtils.f159a = null;
                    break;
                }
                break;
            case 2:
                if (this.window != null) {
                    this.window.pageImageData = null;
                    mo79k();
                    DrawingUtils.f159a = null;
                    break;
                }
                break;
            case 3:
                if (DrawingUtils.use_bitmap_font) {
                    DrawingUtils.use_bitmap_font = false;
                    mo79k();
                    break;
                }
                break;
        }
        System.gc();
    }

    /* renamed from: a */
    public final void mo62a(int i, int i2) {
        if (!DrawingUtils.f137A && i == 35 && !this.f428i) {
            this.f428i = true;
        } else if (this.f419f != null) {
            mo75g();
        } else {
            if (i == -6 && this.f430t != null) {
                commandAction(this.f430t, this);
            } else if (i != -7 || this.f431u == null) {
                if (this.f429l) {
                    if (i == 5 || i == 54) {
                        try {
                            if (this.f413e == null && this.f395b.pageImageData.m334a(this.f395b.f300a).startsWith("opera:submenu")) {
                                i = 8;
                            }
                        } catch (Exception e) {
                        }
                    }
                    if (i == 2 || i == 52) {
                        if (this.f413e != null) {
                            m221p();
                            return;
                        } else {
                            m220o();
                            return;
                        }
                    }
                }
            } else if (!f364k) {
                commandAction(this.f431u, this);
                return;
            } else if (this.f430t == f371r) {
                commandAction(this.f430t, this);
                return;
            } else if (this.f430t == f350c) {
                mo64a("opera:bookmark-delete");
                return;
            } else {
                return;
            }
            if (this.f413e != null) {
                this.f413e.m175a(i, i2);
            } else if (this.f429l && this.f395b != null) {
                this.f395b.m175a(i, i2);
            } else if (this.window != null) {
                this.window.m175a(i, i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo63a(int i, int i2, int i3, int i4) {
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (i2 + i4 == DrawingUtils.f182f) {
            i4++;
        }
        repaint(max, max2, (i + i3) - max, (i2 + i4) - max2);
    }

    /* renamed from: a */
    public final void mo64a(String str) {
        mo65a(str, (String) null, (String) null);
    }

    /* renamed from: a */
    public final void mo65a(String str, String str2, String str3) {
        String str4 = (str == null || str.length() < 3) ? "opera:start" : str;
        if (str4.startsWith("opera:submenu-")) {
            m216d(str4);
        } else if (str4.equals("opera:exit")) {
            commandAction(f359h, this);
        } else if (str4.equals("opera:testconnection")) {
            new Thread(new C0011l(this, 9)).start();
        } else {
            if (this.f413e != null || this.f429l) {
                m220o();
            }
            if (this.display != null) {
                this.display.setCurrent(this);
            }
            if (str4.equals("opera:openurl")) {
                mo73e();
            } else if (str4.equals("opera:back")) {
                commandAction(f360i, this);
            } else if (str4.equals("opera:forward")) {
                this.window.mo53e();
            } else if (str4.equals("opera:bookmark-up")) {
                m207b(-1);
            } else if (str4.equals("opera:bookmark-down")) {
                m207b(1);
            } else if (str4.equals("opera:bookmark-delete")) {
                this.f405d = this.window.pageImageData.m353d(this.window.f300a);
                if (this.f405d != -1) {
                    this.window.openUrl("opera:deletebookmarkdialog", false, false, str2, str3);
                }
            } else if (str4.equals("opera:reload")) {
                commandAction(f355f, this);
            } else if (str4.equals("opera:top")) {
                this.window.mo55g();
            } else if (str4.equals("opera:bottom")) {
                this.window.mo56h();
            } else {
                this.window.openUrl(str4, false, true, str2, str3);
            }
        }
    }

    /* renamed from: a */
    public final boolean m232a() {
        if (this.f380a == null || this.f380a.isEmpty()) {
            return false;
        }
        PageDataRunnable uVar = (PageDataRunnable) this.f380a.firstElement();
        uVar.m355d();
        return this.f380a.removeElement(uVar);
    }

    /* renamed from: a */
    public final boolean mo66a(PageDataRunnable uVar) {
        if (uVar == null || uVar.imageData == null || !uVar.f510o) {
            return false;
        }
        try {
            PageDataRunnable a = mo59a(uVar.mo95a(false), uVar.m345b());
            if (a != null) {
                this.f380a.removeElement(a);
            }
            this.f380a.addElement(uVar);
            return true;
        } catch (Throwable th) {
            this.f386a = null;
            this.f380a.removeAllElements();
            return false;
        }
    }

    /* renamed from: b */
    public final void m234b() {
        switch (this.f416f) {
            case 0:
                this.f420f = true;
                if (!(this.window == null || this.window.pageImageData == null || !this.window.pageImageData.m349b())) {
                    this.f416f++;
                }
            case 1:
                this.f409d = false;
                this.f414e = false;
                break;
            case 2:
                this.f409d = true;
                this.f414e = true;
                this.f420f = false;
                this.f416f = -1;
                break;
        }
        this.f416f++;
        if (this.window != null) {
            this.window.f317d = false;
        }
        repaint();
    }

    /* renamed from: b */
    public final void mo68b(String str) {
        Alert alert = new Alert(DrawingUtils.get_string_resource(42), str, (Image) null, AlertType.INFO);
        alert.setTimeout(-2);
        this.display.setCurrent(alert, this);
    }

    /* renamed from: b */
    public final void mo69b(String str, String str2, String str3) {
        this.f390b = str2;
        this.f400c = str3;
        this.f419f = new Window(this, getWidth() - 40, getHeight() - 80, 0, 0, 8, 8);
        this.f419f.openUrl("opera:alert", false, false, (String) null, (String) null);
        C0011l lVar = new C0011l(this, 1);
        if (!str.equals("ecma")) {
            this.f378a.schedule(lVar, 2500);
        }
    }

    /* renamed from: c */
    public final void mo70c() {
        int i;
        int width = getWidth();
        int height = getHeight();
        if (!this.f414e || this.f429l) {
            i = 0;
        } else {
            i = this.f398c + 0;
            height -= this.f398c;
        }
        if (this.f409d) {
            height -= this.f388b;
        }
        repaint(0, i, width, height);
    }

    public final void commandAction(Command command, Displayable displayable) {
        BrowserCanvas sVar;
        if (this.f423g) {
            this.f423g = false;
            return;
        }
        PageDataRunnable uVar = this.window != null ? this.window.pageImageData : null;
        if (command == f346a || command == f350c) {
            if (this.f429l) {
                commandAction(f352d, displayable);
            } else {
                if (command == f346a) {
                    m209b(true);
                } else {
                    m214c(true);
                }
                this.f431u = f352d;
            }
        } else if (command == f349b) {
            if (this.f413e != null) {
                this.f413e.m175a(8, 0);
            } else if (this.f395b != null) {
                this.f395b.m175a(8, 0);
            }
        } else if (command == f367n && this.window != null && uVar != null) {
            this.window.f306a = true;
            this.window.openUrl(uVar.m333a(), false, false, (String) null, PageDataRunnable.m251a(uVar.page_forms, (FormField) null));
        } else if (command == f361j) {
            if (!(uVar == null || this.window == null)) {
                if (uVar.f506m) {
                    m222q();
                    mo64a("opera:start");
                } else if (uVar.f508n) {
                    DrawingUtils.m76a(this.f405d);
                    mo64a("opera:bookmarks");
                } else if (uVar.f502k) {
                    if (this.window != null) {
                        this.window.m189d();
                    }
                    new Thread(new C0011l(this, 7)).start();
                } else if (uVar.f504l) {
                    if (this.window != null) {
                        this.window.m189d();
                    }
                    new RunnableC0003d(this, this.f411e, this.f417f, true).mo19a();
                }
            }
        } else if (command != f363k || this.window == null) {
            if (command == f365l && this.window != null && uVar != null) {
                FormField a = this.window.m172a(this.window.f300a);
                if (a != null) {
                    String str = a.f278d;
                    String a2 = PageDataRunnable.m251a(uVar.page_forms, a);
                    Window pVar = this.window;
                    if (str == null) {
                        str = uVar.f443a;
                    }
                    pVar.openUrl(str, false, true, uVar.f443a, a2);
                } else {
                    return;
                }
            } else if (command == f354e && this.window != null) {
                this.window.m173a();
                mo72d();
                mo70c();
            } else if (command == f360i || (command == f352d && (displayable instanceof TextBox))) {
                if ((displayable instanceof TextBox) || (displayable instanceof C0006g)) {
                    if (DrawingUtils.f203r) {
                        setFullScreenMode(true);
                    }
                    if (this.display != null) {
                        this.display.setCurrent(this);
                    }
                } else if ((displayable instanceof List) && this.display != null) {
                    this.display.setCurrent(this.f383a);
                } else if (this.window != null) {
                    this.window.m189d();
                }
            } else if (command == f359h && this.browser != null) {
                this.browser.destroyApp(false);
                this.browser.notifyDestroyed();
                return;
            } else if (command == f355f && this.window != null) {
                this.window.m182b();
            } else if (command == f366m || command == List.SELECT_COMMAND || command == f368o || command == f369p) {
                if ((displayable instanceof C0008i) && this.window != null) {
                    C0008i iVar = (C0008i) displayable;
                    if (iVar != null && iVar.f92a != null) {
                        iVar.f92a.f271b = iVar.getString();
                        iVar.f92a.f275c = null;
                        if (iVar.f92a.f278d != null && iVar.f92a.f278d.equals("search:///")) {
                            this.search_field = iVar.f92a;
                            this.window.openUrl("search:///", false, true, (String) null, new StringBuffer().append(PageDataRunnable.m251a(new FormField[]{this.search_field}, (FormField) null)).append("&source=").append(DrawingUtils.google_string).toString());
                        }
                        if (DrawingUtils.f204s) {
                            Alert alert = new Alert("Opera Mini", "Processing", (Image) null, AlertType.INFO);
                            alert.setTimeout(100);
                            this.display.setCurrent(alert, this);
                            C0011l lVar = new C0011l(this, 4);
                            lVar.f213a = iVar;
                            this.f378a.schedule(lVar, 50);
                            return;
                        }
                        this.window.mo44a(iVar.f92a);
                        sVar = this;
                    } else {
                        return;
                    }
                } else if (displayable instanceof C0006g) {
                    C0006g gVar = (C0006g) displayable;
                    if (gVar.f86a.input_charcode == 's' && gVar.f86a.f272b) {
                        boolean[] zArr = new boolean[gVar.size()];
                        gVar.getSelectedFlags(zArr);
                        gVar.f86a.mo37a(zArr);
                    } else if (!gVar.f86a.f272b && gVar.f86a.f270b > 50 && gVar.getSelectedIndex() == gVar.size() - 1) {
                        command = f368o;
                    } else if (command != f368o) {
                        gVar.f86a.mo33a(gVar.getSelectedIndex());
                    }
                    gVar.f86a.f275c = null;
                    if (command == f368o) {
                        FormField oVar = gVar.f86a;
                        oVar.f263a = (oVar.f263a + 1) % oVar.f268a.length;
                        oVar.callback(this, 0);
                        return;
                    }
                    if (!(this.window == null || gVar == null)) {
                        this.window.mo44a(gVar.f86a);
                    }
                    sVar = this;
                } else if (displayable instanceof List) {
                    List list = (List) displayable;
                    if (list != null) {
                        int selectedIndex = list.getSelectedIndex();
                        if (!(selectedIndex == -1 || this.f383a == null)) {
                            this.f383a.setString(list.getString(selectedIndex));
                        }
                        sVar = this.f383a;
                    } else {
                        return;
                    }
                } else if (displayable instanceof TextBox) {
                    TextBox textBox = (TextBox) displayable;
                    if (textBox != null) {
                        String string = textBox.getString();
                        if (!string.equals("www.") && string.length() >= 4) {
                            m212c(string);
                            if (this.f384a != null) {
                                this.f384a.f271b = string;
                                this.f384a.f275c = null;
                            }
                            mo64a(new StringBuffer().append("0/").append(string).toString());
                        }
                        if (DrawingUtils.f204s) {
                            Alert alert2 = new Alert("Opera Mini", "Processing", (Image) null, AlertType.INFO);
                            alert2.setTimeout(50);
                            this.display.setCurrent(alert2, this);
                            return;
                        }
                        sVar = this;
                    } else {
                        return;
                    }
                } else {
                    if (!(this.window == null || uVar == null || !uVar.f498i)) {
                        this.window.m189d();
                    }
                    sVar = this;
                }
                if (DrawingUtils.f203r) {
                    setFullScreenMode(true);
                }
                if (this.display != null) {
                    this.display.setCurrent(sVar);
                }
            } else if (command == f352d) {
                if (uVar != null && this.window != null && uVar.f498i && !this.f429l) {
                    this.window.m189d();
                } else if (this.f429l) {
                    m220o();
                } else {
                    if (DrawingUtils.f203r) {
                        setFullScreenMode(true);
                    }
                    if (this.display != null) {
                        this.display.setCurrent(this);
                    }
                }
            } else if (command == f357g) {
                m219n();
            } else if (command == f370q) {
                if (!(this.f383a == null || this.display == null || this.display.getCurrent() != this.f383a)) {
                    this.f383a.setString("www.");
                }
            } else if (command == f371r && this.window != null) {
                this.window.openUrl("opera:clearhistorydialog", false, false, (String) null, (String) null);
            }
        } else if (this.window != null && this.window.pageImageData != null && this.window.pageImageData.f506m) {
            mo64a("opera:history");
        } else if (this.window == null || this.window.pageImageData == null || !this.window.pageImageData.f508n) {
            this.window.m189d();
        } else {
            mo64a("opera:bookmarks");
        }
        mo74f();
    }

    /* renamed from: d */
    public final void mo72d() {
        repaint(0, getHeight() - this.f388b, getWidth(), this.f388b);
    }

    /* renamed from: e */
    public final void mo73e() {
        if (DrawingUtils.f203r) {
            setFullScreenMode(false);
        }
        if (DrawingUtils.f202q) {
            this.f383a = mo60a();
        } else {
            this.f383a.removeCommand(f366m);
            this.f383a.removeCommand(f352d);
            this.f383a.removeCommand(f357g);
            this.f383a.removeCommand(f359h);
            this.f383a.removeCommand(f370q);
        }
        this.f383a.addCommand(f366m);
        this.f383a.addCommand(f352d);
        this.f383a.addCommand(f370q);
        if (this.f392b != null && this.f392b.size() > 0) {
            this.f383a.addCommand(f357g);
        }
        m204a((Screen) this.f383a);
        this.f383a.setCommandListener(this);
        this.f383a.setString("www.");
        this.display.setCurrent(this.f383a);
    }

    /* renamed from: f */
    public final void mo74f() {
        boolean z;
        boolean z2;
        Window pVar = this.window;
        PageDataRunnable uVar = null;
        if (pVar != null) {
            uVar = pVar.pageImageData;
            z2 = pVar.m188c();
            z = uVar != null ? uVar.f498i : false;
        } else {
            z = false;
            z2 = false;
        }
        if (!z || z2 || uVar == null || uVar.f449a != f350c) {
            this.f430t = f346a;
        } else {
            this.f430t = f350c;
        }
        this.f431u = f372s;
        if (this.f429l) {
            if (hasPointerEvents()) {
                this.f430t = f346a;
                this.f431u = f372s;
                return;
            }
            this.f431u = f352d;
            this.f430t = f349b;
        } else if (pVar == null) {
        } else {
            if (z && !z2 && uVar != null) {
                this.f430t = uVar.f449a;
                this.f431u = uVar.f463b;
            } else if (z2) {
                this.f431u = f354e;
                this.f430t = f372s;
            } else if (!z2 && pVar != null && pVar.m180a() && !z) {
                this.f431u = f360i;
            }
        }
    }

    /* renamed from: g */
    public final void mo75g() {
        this.f419f = null;
        this.window.f312b = true;
        repaint();
    }

    /* renamed from: h */
    public final void mo76h() {
        this.f387a = false;
    }

    /* renamed from: i */
    public final void mo77i() {
        if (this.f401c == null) {
            this.f401c = new C0011l(this, 0);
            this.f378a.schedule(this.f401c, 0, 200);
        }
    }

    /* renamed from: j */
    public final void mo78j() {
        if (this.f401c != null) {
            this.f401c.cancel();
            this.f401c = null;
        }
    }

    /* renamed from: k */
    public final void mo79k() {
        this.f386a = null;
        if (this.f380a != null) {
            this.f380a.removeAllElements();
        }
        System.gc();
    }

    public final void keyPressed(int i) {
        f364k = i == -8 && DrawingUtils.f170c == 3;
        int a = mo61a(i);
        mo76h();
        if (!DrawingUtils.f210y || m206a(a)) {
            m215d(a);
            mo62a(a, 0);
            this.f374a = System.currentTimeMillis();
            if (m206a(a)) {
                m211c(a);
            }
        }
    }

    public final void keyReleased(int i) {
        int a = mo61a(i);
        if (DrawingUtils.f210y && !m206a(a)) {
            m215d(a);
            mo62a(a, 0);
        } else if (a == this.f373a) {
            mo76h();
        }
        this.f374a = System.currentTimeMillis();
    }

    public final void keyRepeated(int i) {
        if (DrawingUtils.f209x) {
            int a = mo61a(i);
            if (m206a(a)) {
                mo62a(a, (int) (System.currentTimeMillis() - this.f389b));
            }
        }
    }

    public final void paint(Graphics graphics) {
        if (DrawingUtils.f207v) {
            setFullScreenMode(true);
            DrawingUtils.f207v = false;
        }
        this.f404c = true;
        try {
            if (!this.f425h) {
                m213c(graphics);
                return;
            }
            this.f427i = null;
            if (this.f403c == null) {
                m209b(false);
                m223r();
            }
            if (this.window != null) {
                this.window.y = 0;
                if (this.f414e) {
                    this.window.y = this.f398c;
                    if (graphics.getClipY() < this.f398c) {
                        this.window.f317d = false;
                        m200a(graphics);
                    }
                }
                int height = getHeight() - this.window.y;
                if (mo67b()) {
                    height -= this.f388b;
                    if (graphics.getClipY() + graphics.getClipHeight() > getHeight() - this.f388b) {
                        drawFooterNavGradient(graphics);
                    }
                }
                this.window.m174a(height);
            }
            if (this.window != null) {
                this.window.paint(graphics);
            }
            if (this.f414e && graphics.getClipY() < this.f398c + 4 && DrawingUtils.f160a) {
                if (this.f393b == null) {
                    int width = getWidth();
                    int[] iArr = new int[(width * 4)];
                    for (int i = 0; i < width; i++) {
                        iArr[i] = -1291845632;
                        iArr[i + width] = 1929379840;
                        iArr[(width * 2) + i] = 855638016;
                        iArr[(width * 3) + i] = 436207616;
                    }
                    this.f393b = Image.createRGBImage(iArr, getWidth(), 4, true);
                }
                graphics.drawImage(this.f393b, 0, this.f398c, 20);
            }
            if (mo67b() && graphics.getClipY() + graphics.getClipHeight() > (getHeight() - this.f388b) - 1 && DrawingUtils.f160a) {
                if (this.f402c == null) {
                    int width2 = getWidth();
                    int[] iArr2 = new int[width2];
                    for (int i2 = 0; i2 < width2; i2++) {
                        iArr2[i2] = 1929379840;
                    }
                    this.f402c = Image.createRGBImage(iArr2, getWidth(), 1, true);
                }
                graphics.drawImage(this.f402c, 0, (getHeight() - this.f388b) - 1, 20);
            }
            if (this.f419f != null) {
                m201a(graphics, 16777215, 150);
                m203a(graphics, this.f419f, true);
            }
            if (this.f429l) {
                m203a(graphics, this.f395b, true);
            }
            if (this.f413e != null) {
                m203a(graphics, this.f413e, true);
            }
            this.f399c = System.currentTimeMillis();
            this.f404c = false;
        } catch (Throwable th) {
        } finally {
            this.f399c = System.currentTimeMillis();
            this.f404c = false;
        }
    }

    public final void pointerDragged(int i, int i2) {
        if (this.f413e != null) {
            if (f356g == 3) {
                this.f413e.mo52d(i, i2);
            }
        } else if (this.f429l) {
            if (f356g == 2) {
                this.f395b.mo52d(i, i2);
            }
        } else if (this.window != null && f356g == 1) {
            this.window.mo52d(i, i2);
        }
        if (f356g == 4) {
            this.f430t.f342a = this.f430t.mo58a(i, i2);
        }
        if (f356g == 5) {
            this.f431u.f342a = this.f431u.mo58a(i, i2);
        }
        mo72d();
    }

    public final void pointerPressed(int i, int i2) {
        this.f430t.f342a = false;
        this.f431u.f342a = false;
        if (this.f419f != null) {
            f356g = 6;
            mo75g();
        } else if (this.f413e != null && this.f413e.m181a(i, i2)) {
            f356g = 3;
            this.f413e.m184b(i, i2);
        } else if (!this.f429l || !this.f395b.m181a(i, i2)) {
            boolean a = this.f430t.mo58a(i, i2);
            boolean a2 = this.f431u.mo58a(i, i2);
            if (a) {
                f356g = 4;
                this.f430t.f342a = true;
            } else if (a2) {
                f356g = 5;
                this.f431u.f342a = true;
            } else if (this.window != null) {
                f356g = 1;
                this.window.m184b(i, i2);
            } else {
                f356g = 0;
            }
        } else {
            f356g = 2;
            this.f395b.m184b(i, i2);
        }
        if (!DrawingUtils.f143G) {
            repaint();
        }
    }

    public final void pointerReleased(int i, int i2) {
        boolean z = this.f413e != null && this.f413e.m181a(i, i2);
        boolean z2 = !z && this.f429l && this.f395b.m181a(i, i2);
        boolean z3 = z2 || z;
        boolean a = this.f430t.mo58a(i, i2);
        boolean a2 = this.f431u.mo58a(i, i2);
        if (f356g != 6) {
            if (this.f429l && !z3 && !a && !a2) {
                m220o();
                m221p();
            } else if (z) {
                if (f356g == 3) {
                    this.f413e.mo50c(i, i2);
                }
            } else if (z2) {
                if (f356g == 2) {
                    this.f395b.mo50c(i, i2);
                }
            } else if (a) {
                if (f356g == 4) {
                    mo62a(-6, 0);
                }
            } else if (a2) {
                if (f356g == 5) {
                    mo62a(-7, 0);
                }
            } else if (f356g == 1 && this.window != null) {
                this.window.mo50c(i, i2);
            }
        }
        this.f430t.f342a = false;
        this.f431u.f342a = false;
        f356g = 0;
        if (!DrawingUtils.f143G) {
            repaint();
        }
    }

    public final void run() {
        try {
            switch (f353e) {
                case 0:
                    m234b();
                    this.window = new Window(this, getWidth(), getHeight(), 0, this.f398c, 4, 4);
                    m217l();
                    f353e++;
                    break;
                case 1:
                    DrawingUtils.m121e();
                    FormField.font = Font.getFont(64, 0, DrawingUtils.font_size);
                    setCommandListener(this);
                    this.f378a = new Timer();
                    m205a(DrawingUtils.f149M);
                    mo64a("opera:start");
                    f353e++;
                    break;
                case 2:
                    if (!DrawingUtils.f151O) {
                        mo64a("opera:firsttime");
                    }
                    f353e++;
                    break;
                case 3:
                    DrawingUtils.m75a();
                    f353e++;
                    break;
                case 4:
                    mo74f();
                    this.f425h = true;
                    repaint();
                    if (DrawingUtils.f184f) {
                        long freeMemory = Runtime.getRuntime().freeMemory();
                        if (DrawingUtils.run_freeMemory > freeMemory) {
                            DrawingUtils.run_freeMemory = freeMemory + ((DrawingUtils.run_freeMemory - freeMemory) / 2);
                        }
                    }
                    f353e++;
                    DrawingUtils.m106b();
                    break;
                case 5:
                    f353e++;
                    break;
            }
            repaint();
            if (f353e >= 0 && f353e <= 4) {
                if (DrawingUtils.f199n) {
                    run();
                } else {
                    this.display.callSerially(this);
                }
            }
        } catch (Throwable th) {
        }
    }

    public final void showNotify() {
        if (this.window != null) {
            this.window.f312b = true;
        }
        repaint();
    }

    public final void sizeChanged(int i, int i2) {
        if (this.f425h) {
            this.window.width = i;
        }
        m224s();
        if (!(this.f426i == i || this.window == null)) {
            this.f426i = i;
            this.window.m182b();
        }
        repaint();
    }
}
