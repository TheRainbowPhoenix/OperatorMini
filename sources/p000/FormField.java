package p000;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Screen;

/* renamed from: o */
public final class FormField {

    /* renamed from: a */
    public static Font font = null;

    /* renamed from: a */
    private static Image[] images_resources = new Image[5];

    /* renamed from: a */
    public char input_charcode;

    /* renamed from: a */
    public int f263a;

    /* renamed from: a */
    public C0006g f264a;

    /* renamed from: a */
    public String f265a;

    /* renamed from: a */
    public Image f266a;

    /* renamed from: a */
    public boolean checked;

    /* renamed from: a */
    public String[][] f268a;

    /* renamed from: a */
    public boolean[][] f269a;

    /* renamed from: b */
    public int f270b;

    /* renamed from: b */
    public String f271b;

    /* renamed from: b */
    public boolean f272b;

    /* renamed from: b */
    public String[][] f273b;

    /* renamed from: c */
    public int f274c;

    /* renamed from: c */
    public String f275c;

    /* renamed from: c */
    public boolean f276c;

    /* renamed from: d */
    public int f277d;

    /* renamed from: d */
    public String f278d;

    /* renamed from: d */
    public boolean f279d;

    /* renamed from: e */
    public int f280e;

    /* renamed from: f */
    public int f281f;

    /* renamed from: g */
    public int f282g;

    /* renamed from: h */
    public int f283h;

    /* renamed from: i */
    private int f284i;

    public FormField(char c, String str, String str2, String str3, int i, int i2, boolean z, int i3) {
        this(c, str, str2, str3, (String) null, i, i2);
        this.f272b = z;
        this.f270b = i3;
        int i4 = i3 / 50;
        int i5 = i3 % 50;
        this.f268a = new String[((i5 > 0 ? 1 : 0) + i4)][];
        this.f273b = new String[((i5 > 0 ? 1 : 0) + i4)][];
        this.f269a = new boolean[((i5 > 0 ? 1 : 0) + i4)][];
        int i6 = 0;
        while (true) {
            if (i6 < (i5 > 0 ? 1 : 0) + i4) {
                this.f268a[i6] = new String[(i6 == i4 ? i5 : 50)];
                this.f273b[i6] = new String[(i6 == i4 ? i5 : 50)];
                this.f269a[i6] = new boolean[(i6 == i4 ? i5 : 50)];
                i6++;
            } else {
                return;
            }
        }
    }

    public FormField(char c, String str, String str2, String str3, String str4, int i, int i2) {
        this.f275c = null;
        this.f263a = 0;
        this.f270b = 0;
        this.f274c = 0;
        this.f268a = null;
        this.f273b = null;
        this.f269a = null;
        this.f277d = 0;
        this.f281f = -1;
        this.input_charcode = c;
        this.f265a = str;
        this.f271b = str2;
        this.f278d = str3;
        this.checked = false;
        this.f272b = false;
        this.f280e = i;
        this.f284i = i2;
        if (str4 != null) {
            this.f266a = DrawingUtils.loadImageResource(str4);
        }
    }

    public FormField(char c, String str, String str2, String str3, boolean z, int i, int i2) {
        this(c, str, str2, str3, (String) null, i, i2);
        this.checked = z;
    }

    /* renamed from: a */
    private Image get_image() {
        if (this.input_charcode != 'c' || DrawingUtils.skip_input) {
            if (this.input_charcode != 'r' || DrawingUtils.skip_input) {
                if (this.input_charcode != 's') {
                    return null;
                }
                if (images_resources[4] == null) {
                    images_resources[4] = DrawingUtils.loadImageResource("/sa.png");
                }
                return images_resources[4];
            } else if (this.checked) {
                if (images_resources[2] == null) {
                    images_resources[2] = DrawingUtils.loadImageResource("/rbs.png");
                }
                return images_resources[2];
            } else {
                if (images_resources[3] == null) {
                    images_resources[3] = DrawingUtils.loadImageResource("/rbu.png");
                }
                return images_resources[3];
            }
        } else if (this.checked) {
            if (images_resources[0] == null) {
                images_resources[0] = DrawingUtils.loadImageResource("/cbs.png");
            }
            return images_resources[0];
        } else {
            if (images_resources[1] == null) {
                images_resources[1] = DrawingUtils.loadImageResource("/cbu.png");
            }
            return images_resources[1];
        }
    }

    /* renamed from: a */
    private static void paint_input(Graphics graphics, int i, int i2, int i3, int i4, int i5, Image image) {
        graphics.setColor(i);
        graphics.fillRect(i2, i3, i4, i5);
        graphics.setColor(6052956);
        if (image != null) {
            graphics.drawImage(image, i2 + 3, (i5 / 2) + i3 + 1, 6);
        }
        graphics.drawRect(i2, i3, i4, i5);
        graphics.setColor(13684944);
        graphics.drawLine(i2 + 1, i3 + 1, (i2 + i4) - 1, i3 + 1);
        graphics.drawLine(i2 + 1, i3 + 2, i2 + 1, (i3 + i5) - 1);
    }

    /* renamed from: a */
    public final int m135a() {
        if (this.input_charcode == 'h') {
            return 0;
        }
        if (this.input_charcode == 'i') {
            return this.f283h;
        }
        if (this.input_charcode == 'c' || this.input_charcode == 'r') {
            Image a = get_image();
            return a != null ? (short) (a.getHeight() + 2) : DrawingUtils.m73a(font, false);
        }
        short a2 = DrawingUtils.m73a(font, false);
        if (this.input_charcode == 'x' && this.f266a != null) {
            a2 = (short) Math.max(this.f266a.getHeight(), (int) a2);
        }
        return (short) (a2 + 8);
    }

    /* renamed from: a */
    public final int mo32a(boolean z) {
        if (this.input_charcode == 'h') {
            return 0;
        }
        if (this.input_charcode == 'i') {
            return this.f282g;
        }
        if (this.input_charcode == 'x' || this.input_charcode == 'p' || this.input_charcode == 'a') {
            return this.f284i;
        }
        if (this.input_charcode == 'c' || this.input_charcode == 'r') {
            Image a = get_image();
            if (a == null) {
                return DrawingUtils.m73a(font, false);
            }
            return (z ? 1 : 5) + a.getWidth();
        }
        String str = this.f271b;
        if (this.input_charcode == 's') {
            str = "X";
        }
        int a2 = DrawingUtils.m56a(font, str, false);
        if (this.input_charcode == 's') {
            a2 *= 13;
        }
        if (this.input_charcode == 's') {
            a2 += m135a();
        }
        int i = a2 + 9;
        return i >= this.f284i ? this.f284i : i;
    }

    /* renamed from: a */
    public final String m137a() {
        for (int i = 0; i < this.f270b; i++) {
            if (this.f269a[i / 50][i % 50]) {
                return this.f273b[i / 50][i % 50];
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo33a(int i) {
        if (this.input_charcode == 's' && this.f269a != null && i >= 0 && i < this.f269a[this.f263a].length) {
            for (int i2 = 0; i2 < this.f269a.length; i2++) {
                this.f269a[i2] = new boolean[this.f269a[i2].length];
            }
            if (this.f273b[this.f263a][i] != null) {
                this.f269a[this.f263a][i] = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo34a(String str, String str2, boolean z) {
        if (str != null && str2 != null && this.input_charcode == 's' && this.f268a != null && this.f273b != null && this.f269a != null && this.f277d < this.f270b) {
            int i = this.f277d / 50;
            int i2 = this.f277d % 50;
            this.f268a[i][i2] = str;
            this.f273b[i][i2] = str2;
            this.f269a[i][i2] = z;
            if (!this.f272b && z) {
                this.f263a = i;
            }
            this.f274c += str.length() * 2;
            this.f277d++;
        }
    }

    /* renamed from: a */
    public final void paint_at(Graphics graphics, int i, int i2) {
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.input_charcode != 'h' && this.input_charcode != 'i') {
            int i7 = i + 1;
            int i8 = i2 + 1;
            int a = (mo32a(false) - 1) - 2;
            int a2 = (m135a() - 1) - 2;
            int i9 = 0;
            int i10 = 16777215;
            if (this.input_charcode == 'b' || this.input_charcode == 'u' || this.input_charcode == 'e') {
                i10 = 15132390;
            }
            if (this.input_charcode == 's') {
                i9 = 5592405;
            }
            if (this.input_charcode == 'c') {
                Image a3 = get_image();
                if (a3 != null) {
                    graphics.setColor(i10);
                    graphics.fillRect(i7, i8, a, a2);
                    graphics.drawImage(a3, i7, i8, 20);
                    return;
                }
                paint_input(graphics, i10, i7, i8, a, a2, this.f266a);
                if (this.checked) {
                    int i11 = i7 + 2;
                    int i12 = i8 + 2;
                    int i13 = a - 4;
                    int i14 = a2 - 4;
                    graphics.setColor(2236962);
                    graphics.drawLine(i11, i12, i11 + i13 + DrawingUtils.f185g, i12 + i14 + DrawingUtils.f185g);
                    graphics.drawLine(i13 + i11, i12, i11 - DrawingUtils.f185g, i14 + i12 + DrawingUtils.f185g);
                }
            } else if (this.input_charcode == 'r') {
                Image a4 = get_image();
                if (a4 != null) {
                    graphics.drawImage(a4, i7, i8, 20);
                    return;
                }
                int i15 = (a - 8) / 2;
                graphics.setColor(i10);
                graphics.fillArc(i7 + i15, i8 + i15, DrawingUtils.f185g + 8, 8, 0, 360);
                graphics.setColor(i9);
                graphics.drawArc(i7 + i15, i8 + i15, 8, 8, 0, 360);
                if (this.checked) {
                    graphics.setColor(2236962);
                    graphics.fillArc(DrawingUtils.f185g + i7 + i15 + 1, DrawingUtils.f185g + i8 + i15 + 1, 6 - DrawingUtils.f185g, 6 - DrawingUtils.f185g, 0, 360);
                }
            } else {
                String str2 = this.f271b;
                if ((str2 == null || str2.length() == 0) && this.f278d != null && this.f278d.equals("search:///") && this.input_charcode == 'x') {
                    str2 = DrawingUtils.get_string_resource(103);
                }
                if (this.input_charcode == 'p') {
                    String str3 = "";
                    for (int i16 = 0; i16 < this.f271b.length(); i16++) {
                        str3 = new StringBuffer().append(str3).append("*").toString();
                    }
                    str = str3;
                } else {
                    str = str2;
                }
                if (this.input_charcode == 'x' || this.input_charcode == 'p' || this.input_charcode == 'a' || this.input_charcode == 's') {
                    paint_input(graphics, i10, i7, i8, a, a2, this.f266a);
                    if (this.input_charcode == 's') {
                        DrawingUtils.drawOnScreenSelection(graphics, ((i7 + a) - a2) + 1, i8, a2, a2, this.f279d);
                        graphics.setColor(0);
                        int i17 = ((i7 + a) - (a2 / 2)) - 3;
                        int i18 = ((a2 / 2) + i8) - 1;
                        for (int i19 = 6; i19 >= 0; i19 -= 2) {
                            graphics.drawLine(i17, i18, i17 + i19, i18);
                            i17++;
                            i18++;
                        }
                        a -= a2;
                    }
                    i5 = a2 - 6;
                    i6 = a - 6;
                    i4 = i8 + 3;
                    i3 = i7 + 3;
                } else {
                    i5 = a2;
                    i6 = a;
                    i4 = i8;
                    i3 = i7;
                }
                if (this.input_charcode == 'b' || this.input_charcode == 'u' || this.input_charcode == 'e') {
                    DrawingUtils.drawOnScreenSelection(graphics, i3, i4, i6 + 1, i5, false);
                    i3 += 3;
                    i4 += 3;
                    i6 -= 6;
                    i5 -= 6;
                }
                graphics.setColor(2236962);
                int clipX = graphics.getClipX();
                int clipY = graphics.getClipY();
                int clipWidth = graphics.getClipWidth();
                int clipHeight = graphics.getClipHeight();
                graphics.clipRect(i3, i4, i6 + 1, i5 + 1);
                if (this.input_charcode == 's' && this.f269a != null && this.f268a != null) {
                    boolean z = false;
                    int i20 = 0;
                    while (true) {
                        if (i20 >= this.f270b) {
                            break;
                        }
                        if (this.f269a[i20 / 50][i20 % 50] && this.f268a[i20 / 50][i20 % 50] != null) {
                            if (z) {
                                str = "...";
                                break;
                            } else {
                                z = true;
                                str = this.f268a[i20 / 50][i20 % 50];
                            }
                        }
                        i20++;
                    }
                }
                if (str != null) {
                    if (this.f275c == null) {
                        this.f275c = DrawingUtils.truncate_overflow(font, str, i6, false);
                    }
                    DrawingUtils.m85a(graphics, font, this.f275c, this.f266a != null ? this.f266a.getWidth() + i3 + 3 : i3, i4, 20, i10, false);
                }
                graphics.setClip(clipX, clipY, clipWidth, clipHeight);
            }
        }
    }

    /* renamed from: a */
    public final void callback(BrowserCanvas sVar, int i) {
        boolean z = true;
        if (DrawingUtils.f203r) {
            sVar.setFullScreenMode(false);
        }
        if (this.f264a == null) {
            if (this.input_charcode == 's' && this.f272b) {
                this.f264a = new C0006g(DrawingUtils.get_string_resource(49), 2, this);
            } else if (DrawingUtils.f170c == 1 || DrawingUtils.f170c == 3) {
                this.f264a = new C0006g(DrawingUtils.get_string_resource(49), 1, this);
            } else {
                this.f264a = new C0006g(DrawingUtils.get_string_resource(49), 3, this);
            }
            this.f264a.addCommand(BrowserCanvas.f366m);
            this.f264a.addCommand(BrowserCanvas.f360i);
            if (this.f270b > 50) {
                this.f264a.addCommand(BrowserCanvas.f368o);
            }
            BrowserCanvas.m204a((Screen) this.f264a);
            this.f264a.setCommandListener(sVar);
        }
        if (!DrawingUtils.f200o || i != 8) {
            z = false;
        }
        sVar.f423g = z;
        this.f264a.mo25a();
        sVar.display.setCurrent(this.f264a);
    }

    /* renamed from: a */
    public final void mo37a(boolean[] zArr) {
        if (this.input_charcode == 's' && this.f269a != null && zArr.length <= this.f277d && zArr.length <= this.f269a[this.f263a].length) {
            for (int i = 0; i < zArr.length; i++) {
                if (zArr[i] && this.f273b[this.f263a][i] == null) {
                    zArr[i] = false;
                }
            }
            this.f269a[this.f263a] = zArr;
        }
    }

    /* renamed from: b */
    public final String mo38b() {
        if (this.input_charcode != 's') {
            return (this.f265a == null || this.f271b == null || this.input_charcode == 'o') ? "" : new StringBuffer().append(DrawingUtils.url_encode(this.f265a, false, true)).append("=").append(DrawingUtils.url_encode(this.f271b, true, true)).toString();
        }
        String str = "";
        boolean z = true;
        for (int i = 0; i < this.f270b; i++) {
            String str2 = this.f273b[i / 50][i % 50];
            if (this.f269a[i / 50][i % 50]) {
                if (!z) {
                    str = new StringBuffer().append(str).append("&").toString();
                }
                str = new StringBuffer().append(str).append(DrawingUtils.url_encode(this.f265a, false, true)).append("=").append(DrawingUtils.url_encode(str2, true, true)).toString();
                z = false;
            }
        }
        return str;
    }
}
