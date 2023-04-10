package p000;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Screen;

/* renamed from: o */
public final class C0014o {

    /* renamed from: a */
    public static Font f260a = null;

    /* renamed from: a */
    private static Image[] f261a = new Image[5];

    /* renamed from: a */
    public char f262a;

    /* renamed from: a */
    public int f263a;

    /* renamed from: a */
    public C0006g f264a;

    /* renamed from: a */
    public String f265a;

    /* renamed from: a */
    public Image f266a;

    /* renamed from: a */
    public boolean f267a;

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

    public C0014o(char c, String str, String str2, String str3, int i, int i2, boolean z, int i3) {
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

    public C0014o(char c, String str, String str2, String str3, String str4, int i, int i2) {
        this.f275c = null;
        this.f263a = 0;
        this.f270b = 0;
        this.f274c = 0;
        this.f268a = null;
        this.f273b = null;
        this.f269a = null;
        this.f277d = 0;
        this.f281f = -1;
        this.f262a = c;
        this.f265a = str;
        this.f271b = str2;
        this.f278d = str3;
        this.f267a = false;
        this.f272b = false;
        this.f280e = i;
        this.f284i = i2;
        if (str4 != null) {
            this.f266a = C0010k.m70a(str4);
        }
    }

    public C0014o(char c, String str, String str2, String str3, boolean z, int i, int i2) {
        this(c, str, str2, str3, (String) null, i, i2);
        this.f267a = z;
    }

    /* renamed from: a */
    private Image mo31a() {
        if (this.f262a != 'c' || C0010k.f205t) {
            if (this.f262a != 'r' || C0010k.f205t) {
                if (this.f262a != 's') {
                    return null;
                }
                if (f261a[4] == null) {
                    f261a[4] = C0010k.m70a("/sa.png");
                }
                return f261a[4];
            } else if (this.f267a) {
                if (f261a[2] == null) {
                    f261a[2] = C0010k.m70a("/rbs.png");
                }
                return f261a[2];
            } else {
                if (f261a[3] == null) {
                    f261a[3] = C0010k.m70a("/rbu.png");
                }
                return f261a[3];
            }
        } else if (this.f267a) {
            if (f261a[0] == null) {
                f261a[0] = C0010k.m70a("/cbs.png");
            }
            return f261a[0];
        } else {
            if (f261a[1] == null) {
                f261a[1] = C0010k.m70a("/cbu.png");
            }
            return f261a[1];
        }
    }

    /* renamed from: a */
    private static void m134a(Graphics graphics, int i, int i2, int i3, int i4, int i5, Image image) {
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
        if (this.f262a == 'h') {
            return 0;
        }
        if (this.f262a == 'i') {
            return this.f283h;
        }
        if (this.f262a == 'c' || this.f262a == 'r') {
            Image a = mo31a();
            return a != null ? (short) (a.getHeight() + 2) : C0010k.m73a(f260a, false);
        }
        short a2 = C0010k.m73a(f260a, false);
        if (this.f262a == 'x' && this.f266a != null) {
            a2 = (short) Math.max(this.f266a.getHeight(), (int) a2);
        }
        return (short) (a2 + 8);
    }

    /* renamed from: a */
    public final int mo32a(boolean z) {
        if (this.f262a == 'h') {
            return 0;
        }
        if (this.f262a == 'i') {
            return this.f282g;
        }
        if (this.f262a == 'x' || this.f262a == 'p' || this.f262a == 'a') {
            return this.f284i;
        }
        if (this.f262a == 'c' || this.f262a == 'r') {
            Image a = mo31a();
            if (a == null) {
                return C0010k.m73a(f260a, false);
            }
            return (z ? 1 : 5) + a.getWidth();
        }
        String str = this.f271b;
        if (this.f262a == 's') {
            str = "X";
        }
        int a2 = C0010k.m56a(f260a, str, false);
        if (this.f262a == 's') {
            a2 *= 13;
        }
        if (this.f262a == 's') {
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
        if (this.f262a == 's' && this.f269a != null && i >= 0 && i < this.f269a[this.f263a].length) {
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
        if (str != null && str2 != null && this.f262a == 's' && this.f268a != null && this.f273b != null && this.f269a != null && this.f277d < this.f270b) {
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
    public final void mo35a(Graphics graphics, int i, int i2) {
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f262a != 'h' && this.f262a != 'i') {
            int i7 = i + 1;
            int i8 = i2 + 1;
            int a = (mo32a(false) - 1) - 2;
            int a2 = (m135a() - 1) - 2;
            int i9 = 0;
            int i10 = 16777215;
            if (this.f262a == 'b' || this.f262a == 'u' || this.f262a == 'e') {
                i10 = 15132390;
            }
            if (this.f262a == 's') {
                i9 = 5592405;
            }
            if (this.f262a == 'c') {
                Image a3 = mo31a();
                if (a3 != null) {
                    graphics.setColor(i10);
                    graphics.fillRect(i7, i8, a, a2);
                    graphics.drawImage(a3, i7, i8, 20);
                    return;
                }
                m134a(graphics, i10, i7, i8, a, a2, this.f266a);
                if (this.f267a) {
                    int i11 = i7 + 2;
                    int i12 = i8 + 2;
                    int i13 = a - 4;
                    int i14 = a2 - 4;
                    graphics.setColor(2236962);
                    graphics.drawLine(i11, i12, i11 + i13 + C0010k.f185g, i12 + i14 + C0010k.f185g);
                    graphics.drawLine(i13 + i11, i12, i11 - C0010k.f185g, i14 + i12 + C0010k.f185g);
                }
            } else if (this.f262a == 'r') {
                Image a4 = mo31a();
                if (a4 != null) {
                    graphics.drawImage(a4, i7, i8, 20);
                    return;
                }
                int i15 = (a - 8) / 2;
                graphics.setColor(i10);
                graphics.fillArc(i7 + i15, i8 + i15, C0010k.f185g + 8, 8, 0, 360);
                graphics.setColor(i9);
                graphics.drawArc(i7 + i15, i8 + i15, 8, 8, 0, 360);
                if (this.f267a) {
                    graphics.setColor(2236962);
                    graphics.fillArc(C0010k.f185g + i7 + i15 + 1, C0010k.f185g + i8 + i15 + 1, 6 - C0010k.f185g, 6 - C0010k.f185g, 0, 360);
                }
            } else {
                String str2 = this.f271b;
                if ((str2 == null || str2.length() == 0) && this.f278d != null && this.f278d.equals("search:///") && this.f262a == 'x') {
                    str2 = C0010k.m62a(103);
                }
                if (this.f262a == 'p') {
                    String str3 = "";
                    for (int i16 = 0; i16 < this.f271b.length(); i16++) {
                        str3 = new StringBuffer().append(str3).append("*").toString();
                    }
                    str = str3;
                } else {
                    str = str2;
                }
                if (this.f262a == 'x' || this.f262a == 'p' || this.f262a == 'a' || this.f262a == 's') {
                    m134a(graphics, i10, i7, i8, a, a2, this.f266a);
                    if (this.f262a == 's') {
                        C0010k.m83a(graphics, ((i7 + a) - a2) + 1, i8, a2, a2, this.f279d);
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
                if (this.f262a == 'b' || this.f262a == 'u' || this.f262a == 'e') {
                    C0010k.m83a(graphics, i3, i4, i6 + 1, i5, false);
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
                if (this.f262a == 's' && this.f269a != null && this.f268a != null) {
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
                        this.f275c = C0010k.m66a(f260a, str, i6, false);
                    }
                    C0010k.m85a(graphics, f260a, this.f275c, this.f266a != null ? this.f266a.getWidth() + i3 + 3 : i3, i4, 20, i10, false);
                }
                graphics.setClip(clipX, clipY, clipWidth, clipHeight);
            }
        }
    }

    /* renamed from: a */
    public final void mo36a(RunnableC0018s sVar, int i) {
        boolean z = true;
        if (C0010k.f203r) {
            sVar.setFullScreenMode(false);
        }
        if (this.f264a == null) {
            if (this.f262a == 's' && this.f272b) {
                this.f264a = new C0006g(C0010k.m62a(49), 2, this);
            } else if (C0010k.f170c == 1 || C0010k.f170c == 3) {
                this.f264a = new C0006g(C0010k.m62a(49), 1, this);
            } else {
                this.f264a = new C0006g(C0010k.m62a(49), 3, this);
            }
            this.f264a.addCommand(RunnableC0018s.f366m);
            this.f264a.addCommand(RunnableC0018s.f360i);
            if (this.f270b > 50) {
                this.f264a.addCommand(RunnableC0018s.f368o);
            }
            RunnableC0018s.m204a((Screen) this.f264a);
            this.f264a.setCommandListener(sVar);
        }
        if (!C0010k.f200o || i != 8) {
            z = false;
        }
        sVar.f423g = z;
        this.f264a.mo25a();
        sVar.f381a.setCurrent(this.f264a);
    }

    /* renamed from: a */
    public final void mo37a(boolean[] zArr) {
        if (this.f262a == 's' && this.f269a != null && zArr.length <= this.f277d && zArr.length <= this.f269a[this.f263a].length) {
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
        if (this.f262a != 's') {
            return (this.f265a == null || this.f271b == null || this.f262a == 'o') ? "" : new StringBuffer().append(C0010k.m65a(this.f265a, false, true)).append("=").append(C0010k.m65a(this.f271b, true, true)).toString();
        }
        String str = "";
        boolean z = true;
        for (int i = 0; i < this.f270b; i++) {
            String str2 = this.f273b[i / 50][i % 50];
            if (this.f269a[i / 50][i % 50]) {
                if (!z) {
                    str = new StringBuffer().append(str).append("&").toString();
                }
                str = new StringBuffer().append(str).append(C0010k.m65a(this.f265a, false, true)).append("=").append(C0010k.m65a(str2, true, true)).toString();
                z = false;
            }
        }
        return str;
    }
}
