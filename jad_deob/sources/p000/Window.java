package p000;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Screen;

/* renamed from: p */
public final class Window {

    /* renamed from: A */
    private static int f285A = 1;

    /* renamed from: a */
    private static char[] f286a;

    /* renamed from: a */
    public static int[] SKIN_COLORS = null;

    /* renamed from: j */
    public static int f288j = 0;

    /* renamed from: k */
    public static int f289k = 1;

    /* renamed from: l */
    public static int f290l = 2;

    /* renamed from: m */
    public static int f291m = 3;

    /* renamed from: z */
    private static int f292z = 0;

    /* renamed from: B */
    private int f293B = -1;

    /* renamed from: C */
    private int barWidth;

    /* renamed from: D */
    private int barOffset;

    /* renamed from: E */
    private int f296E;

    /* renamed from: F */
    private int f297F;

    /* renamed from: G */
    private int f298G;

    /* renamed from: H */
    private int f299H;

    /* renamed from: a */
    public int f300a = -1;

    /* renamed from: a */
    public long f301a = 0;

    /* renamed from: a */
    public Vector f302a;

    /* renamed from: a */
    private C0014o f303a;

    /* renamed from: a */
    public RunnableC0018s f304a;

    /* renamed from: a */
    public PageDataRunnable pageImageData;

    /* renamed from: a */
    public boolean f306a = false;

    /* renamed from: a */
    public Object[] f307a = null;

    /* renamed from: b */
    public int f308b = -1;

    /* renamed from: b */
    private long f309b;

    /* renamed from: b */
    public Vector f310b;

    /* renamed from: b */
    public PageDataRunnable f311b;

    /* renamed from: b */
    public boolean f312b;

    /* renamed from: c */
    public int f313c = -1;

    /* renamed from: c */
    private Vector f314c = new Vector();

    /* renamed from: c */
    public boolean f315c = true;

    /* renamed from: d */
    public int f316d = -1;

    /* renamed from: d */
    public boolean f317d;

    /* renamed from: e */
    public int f318e;

    /* renamed from: e */
    private boolean f319e;

    /* renamed from: f */
    public int f320f;

    /* renamed from: f */
    private boolean isVisible;

    /* renamed from: g */
    public int offset;

    /* renamed from: g */
    private boolean f323g;

    /* renamed from: h */
    public int f324h = -1;

    /* renamed from: h */
    private boolean f325h;

    /* renamed from: i */
    public int f326i = 0;

    /* renamed from: i */
    private boolean f327i = false;

    /* renamed from: n */
    public int f328n;

    /* renamed from: o */
    public int f329o;

    /* renamed from: p */
    public int f330p;

    /* renamed from: q */
    public int width;

    /* renamed from: r */
    public int height;

    /* renamed from: s */
    public int x;

    /* renamed from: t */
    public int y;

    /* renamed from: u */
    public int f335u;

    /* renamed from: v */
    public int f336v = 29;

    /* renamed from: w */
    private int f337w;

    /* renamed from: x */
    private int f338x;

    /* renamed from: y */
    private int f339y;

    public Window(RunnableC0018s sVar, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f304a = sVar;
        this.width = i;
        m174a(i2);
        this.x = i3;
        this.y = i4;
        this.f329o = i5;
        this.f330p = i6;
        this.f328n = this.width - 6;
        if (f286a == null) {
            f286a = new char[512];
        }
    }

    /* renamed from: a */
    private int mo40a() {
        if (this.pageImageData == null || this.pageImageData.f454a == null) {
            return -1;
        }
        int c = this.pageImageData.m350c(this.offset);
        if (c >= this.pageImageData.f454a.length || c < 0) {
            return -1;
        }
        if (this.pageImageData.f466b[c] - this.pageImageData.f460a[c] >= (-this.offset) || (c = c + 1) < this.pageImageData.f454a.length) {
            return this.pageImageData.mo93a(this.pageImageData.f454a[c] - 1, this.f336v, this.pageImageData.f488f, true);
        }
        return -1;
    }

    /* renamed from: a */
    private int mo39a(int i) {
        if (i < 0 || i >= this.pageImageData.f453a.length) {
            return -1;
        }
        if (this.pageImageData.f453a[i] == 76 || this.pageImageData.f453a[i] == 87 || this.pageImageData.f453a[i] == 109) {
            int d = this.pageImageData.m353d(i);
            if (d < 0 || d >= this.pageImageData.f472c.length) {
                return -1;
            }
            return (this.pageImageData.f466b[this.pageImageData.f490f[d]] - this.pageImageData.f466b[this.pageImageData.f485e[d]]) + this.pageImageData.f460a[this.pageImageData.f485e[d]];
        }
        int f = this.pageImageData.m359f(i);
        if (f < 0 || f > this.pageImageData.f451a) {
            return -1;
        }
        return this.pageImageData.f460a[f];
    }

    /* renamed from: a */
    private int mo41a(int i, int i2) {
        try {
            byte[] bArr = (byte[]) this.f310b.elementAt(i2);
            if (i == 0) {
                return DrawingUtils.m74a(bArr, 0);
            }
            if (i == 1) {
                return DrawingUtils.m74a(bArr, 2);
            }
            return -1;
        } catch (Throwable th) {
        }
    }

    /* renamed from: a */
    private int m147a(String str) {
        if (this.f302a == null || str == null || str.length() == 0) {
            return -1;
        }
        int i = 0;
        while (i < this.f302a.size()) {
            Object[] objArr = (Object[]) this.f302a.elementAt(i);
            String str2 = (String) objArr[0];
            String str3 = (String) objArr[3];
            Object obj = (String) objArr[4];
            if (!(str2 == null || str3 == null)) {
                if (!str2.endsWith("/") && !str3.startsWith("/")) {
                    str2 = new StringBuffer().append(str2).append("/").toString();
                }
                str2 = new StringBuffer().append(str2).append(str3).toString();
            }
            if (str.equals(str2) || str.equals(obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    private void m148a(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1 && this.f304a.hasPointerEvents()) {
            this.f314c.addElement(new C0007h(i, i2, i3, i4, i5));
        }
    }

    /* renamed from: a */
    private void m149a(int i, Graphics graphics, int i2, int i3, int i4) {
        int i5 = this.width;
        if (this.isVisible) {
            i5 -= 6;
        }
        int min = Math.min((int) this.pageImageData.f460a[i4], (graphics.getClipY() + graphics.getClipHeight()) - i3);
        this.f335u = i;
        graphics.setColor(i);
        graphics.fillRect(i2, i3, i5, min);
    }

    /* renamed from: a */
    private void m150a(String str) {
        if (str != null) {
            if (this.pageImageData == null || this.pageImageData.f499j != 2) {
                if (this.f310b == null) {
                    this.f310b = new Vector(30);
                }
                if (this.f316d != -1 && (this.f316d < this.f313c || this.f316d > this.f313c)) {
                    this.f313c = this.f316d;
                } else if (this.f316d == this.f313c) {
                    String a = m171a(this.f313c);
                    if (a != null && str.equals(a)) {
                        m170j();
                    } else if (!this.f327i) {
                        m159b(str);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m151a(Graphics graphics, int i, int i2, int i3, boolean z, boolean z2) {
        PageFont cVar;
        if (this.pageImageData != null && this.pageImageData.f453a != null && this.pageImageData.f454a != null) {
            PageFont cVar2 = null;
            int i4 = this.pageImageData.f454a[i];
            if (!z && !this.pageImageData.f465b) {
                m149a(16777215, graphics, i2, i3, i);
            }
            int i5 = i2 + this.f329o + this.pageImageData.f467b[i];
            int i6 = i4;
            while (true) {
                char c = (char) this.pageImageData.f453a[i6];
                int i7 = i6 + 1;
                m164d(i7);
                switch (c) {
                    case 'B':
                        i6 = i7;
                        cVar = cVar2;
                        break;
                    case 'C':
                    case 'G':
                    case 'H':
                    case 'M':
                    case 'N':
                    case 'S':
                    case 'U':
                    case 'V':
                    case 'X':
                    case 'Z':
                    case '[':
                    case '\\':
                    case ']':
                    case '^':
                    case '_':
                    case '`':
                    case 'a':
                    case 'b':
                    case 'd':
                    case 'e':
                    case 'g':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'n':
                    case 'o':
                    case 'q':
                    case 't':
                    case 'v':
                    case 'w':
                    default:
                        i6 = i7;
                        cVar = cVar2;
                        break;
                    case 'D':
                        if (!z && !this.pageImageData.f465b) {
                            m149a(PageDataRunnable.m247a(DrawingUtils.m74a(this.pageImageData.f453a, i7)), graphics, this.x, i3, i);
                        }
                        i6 = i7 + 2;
                        cVar = cVar2;
                        break;
                    case 'E':
                        this.f319e = false;
                        this.f293B = -1;
                        i6 = i7;
                        cVar = cVar2;
                        break;
                    case 'F':
                        i6 = DrawingUtils.m74a(this.pageImageData.f453a, i7) + 2 + 1 + i7;
                        cVar = cVar2;
                        break;
                    case 'I':
                    case 'K':
                        int i8 = i7 + 2 + 2;
                        short a = DrawingUtils.m74a(this.pageImageData.f453a, i8);
                        int i9 = i8 + 2;
                        byte b = this.pageImageData.f453a[i9];
                        i6 = i9 + 1;
                        if (c == 'I') {
                            int a2 = i6 + 2 + DrawingUtils.m74a(this.pageImageData.f453a, i6);
                            i6 = a2 + 2 + DrawingUtils.m74a(this.pageImageData.f453a, a2);
                        }
                        Image a3 = this.pageImageData.m336a((int) a);
                        if (a3 != null) {
                            if ((b & 1) != 0) {
                                i5 = (this.f328n - a3.getWidth()) / 2;
                            } else if ((b & 2) != 0) {
                                i5 -= this.f329o;
                            }
                            if ((b & 4) == 0) {
                                if ((b & 8) != 0 && !this.f319e) {
                                    cVar = cVar2;
                                    break;
                                }
                            } else if (this.f319e) {
                                cVar = cVar2;
                                break;
                            }
                            int width2 = (b & 16) != 0 ? this.width - a3.getWidth() : (b & 32) != 0 ? this.f329o : i5;
                            int height2 = i3 + ((this.pageImageData.f460a[i] - a3.getHeight()) / 2);
                            if (!z || this.pageImageData.f465b) {
                                if (a3 != null) {
                                    graphics.drawImage(a3, width2, height2, 20);
                                }
                            } else if ((this.f319e && z2) || (z2 && this.f323g)) {
                                DrawingUtils.drawFocus(graphics, width2 - 1, height2 - 1, a3.getWidth() + 2, a3.getHeight() + 2);
                                this.f323g = false;
                            }
                            if (this.f303a != null) {
                                this.f319e = false;
                                m148a(width2, height2, this.f303a.mo32a(false), this.f303a.m135a(), this.pageImageData.f472c[this.f303a.f281f]);
                                this.f303a = null;
                            } else if (!this.pageImageData.f465b) {
                                m148a(width2, height2, a3.getWidth(), a3.getHeight(), this.f293B);
                            }
                            i5 = width2 + a3.getWidth();
                            cVar = cVar2;
                            break;
                        } else {
                            cVar = cVar2;
                            break;
                        }
                    case 'J':
                        short a4 = DrawingUtils.m74a(this.pageImageData.f453a, i7);
                        int i10 = i7 + 2;
                        short a5 = DrawingUtils.m74a(this.pageImageData.f453a, i10);
                        i6 = i10 + 2;
                        int i11 = (a4 > 38 || a5 > 38) ? (this.f328n - a4) / 2 : i5;
                        graphics.setColor(SKIN_COLORS[25]);
                        graphics.drawRect(i11, i3, a4 - 1, a5 - 1);
                        if (z && !this.pageImageData.f465b && ((this.f319e && z2) || (z2 && this.f323g))) {
                            DrawingUtils.drawFocus(graphics, i11 - 1, i3 - 1, a4 + 2, a5 + 2);
                            this.f323g = false;
                        }
                        if (this.f303a != null) {
                            this.f319e = false;
                            m148a(i11, i3, this.f303a.mo32a(false), this.f303a.m135a(), this.pageImageData.f472c[this.f303a.f281f]);
                            this.f303a = null;
                        } else if (!this.pageImageData.f465b) {
                            m148a(i11, i3, a4, a5, this.f293B);
                        }
                        i5 = i11 + a4;
                        cVar = cVar2;
                        break;
                    case 'L':
                    case 'P':
                    case 'W':
                    case 'm':
                        this.f293B = i7 - 1;
                        if (this.pageImageData.f465b) {
                            m148a(i5 - this.f329o, i3, this.width, this.pageImageData.f460a[i], this.f293B);
                            if (this.f319e) {
                                int i12 = i5 - this.f329o;
                                int i13 = this.width;
                                if (this.isVisible) {
                                    i13 -= 6;
                                }
                                DrawingUtils.makeGradient(graphics, i12, i3, i13, this.pageImageData.f460a[i], SKIN_COLORS[7], SKIN_COLORS[8]);
                            }
                        }
                        i6 = DrawingUtils.m74a(this.pageImageData.f453a, i7) + 2 + i7;
                        cVar = cVar2;
                        break;
                    case 'O':
                        i6 = i7 + 2;
                        cVar = cVar2;
                        break;
                    case 'Q':
                        i6 = i7;
                        cVar = cVar2;
                        break;
                    case 'R':
                        i6 = i7 + 2;
                        graphics.setColor(PageDataRunnable.m247a(DrawingUtils.m74a(this.pageImageData.f453a, i7)));
                        graphics.drawLine(i5, i3 + 1, (this.isVisible ? (this.width - 6) - 2 : this.width - 2) + DrawingUtils.f185g, i3 + 1);
                        cVar = cVar2;
                        break;
                    case 'T':
                        int i14 = this.pageImageData.f453a[i7] & 255;
                        int i15 = i7 + 1;
                        short a6 = DrawingUtils.m74a(this.pageImageData.f453a, i15);
                        int i16 = i15 + 2;
                        int a7 = DrawingUtils.m58a(this.pageImageData.f453a, i16, a6, f286a, 0);
                        i6 = i16 + a6;
                        if (!(cVar2 == null || cVar2.lcd_font == null)) {
                            graphics.setFont(cVar2.lcd_font);
                            graphics.setColor(cVar2.f64a);
                            short a8 = DrawingUtils.m73a(cVar2.lcd_font, this.pageImageData.f492g);
                            if (i14 >= 255) {
                                i14 = DrawingUtils.m57a(cVar2.lcd_font, f286a, 0, a7, this.pageImageData.f492g);
                            }
                            int i17 = i3 + ((this.pageImageData.f460a[i] - a8) / 2);
                            if ((z == this.f319e && !z2) || this.pageImageData.f465b) {
                                int i18 = this.f335u;
                                if (this.f319e) {
                                    if (this.pageImageData.f465b) {
                                        graphics.setColor(this.pageImageData.f480e);
                                    } else if (this.pageImageData.m356e(this.f300a) == 6) {
                                        this.f335u = SKIN_COLORS[11];
                                        graphics.setColor(SKIN_COLORS[11]);
                                        graphics.fillRect(i5 - 1, i17, i14 + 2, a8);
                                        graphics.setColor(SKIN_COLORS[12]);
                                    } else {
                                        this.f335u = SKIN_COLORS[10];
                                        graphics.setColor(SKIN_COLORS[10]);
                                        graphics.fillRect(i5 - 1, i17, i14 + 2, a8);
                                        graphics.setColor(SKIN_COLORS[12]);
                                    }
                                }
                                if (!DrawingUtils.f148L || this.pageImageData.f492g) {
                                    graphics.drawChars(f286a, 0, a7, i5, i17 + DrawingUtils.f193j, 20);
                                } else {
                                    DrawingUtils.m60a(cVar2.lcd_font).mo6a(graphics, f286a, 0, a7, i5, i17, this.f335u);
                                }
                                if (this.f319e) {
                                    this.f335u = i18;
                                }
                                if (!this.pageImageData.f465b) {
                                    m148a(i5, i17, i14, a8, this.f293B);
                                }
                            }
                            i5 += i14;
                            cVar = cVar2;
                            break;
                        }
                        cVar = cVar2;
                        break;
                    case 'Y':
                        cVar = this.pageImageData.page_fonts[this.pageImageData.f453a[i7] & 255];
                        i6 = i7 + 1;
                        break;
                    case 'c':
                    case 'i':
                    case 'p':
                    case 'r':
                    case 's':
                    case 'u':
                    case 'x':
                        i6 = i7 + 2;
                        C0014o oVar = this.pageImageData.f459a[DrawingUtils.m74a(this.pageImageData.f453a, i7)];
                        oVar.f279d = this.f319e;
                        if (!z) {
                            oVar.mo35a(graphics, i5, i3);
                            if (c != 'i') {
                                m148a(i5, i3, oVar.mo32a(false), oVar.m135a(), this.pageImageData.f472c[oVar.f281f]);
                            }
                        } else if (this.f319e && z2) {
                            if (c == 'i') {
                                this.f323g = true;
                            } else {
                                DrawingUtils.drawFocus(graphics, i5, i3, oVar.mo32a(true), oVar.m135a());
                            }
                        }
                        if (c != 'i') {
                            i5 += oVar.mo32a(false);
                            this.f319e = false;
                            cVar = cVar2;
                            break;
                        } else {
                            this.f303a = oVar;
                            cVar = cVar2;
                            break;
                        }
                    case 'f':
                        i6 = i7;
                        cVar = cVar2;
                        break;
                    case 'h':
                        i6 = i7 + 2;
                        cVar = cVar2;
                        break;
                    case 'y':
                        cVar = this.pageImageData.page_fonts[DrawingUtils.m74a(this.pageImageData.f453a, i7)];
                        i6 = i7 + 2;
                        break;
                    case 'z':
                        i5 += DrawingUtils.m74a(this.pageImageData.f453a, i7);
                        i6 = i7 + 2;
                        cVar = cVar2;
                        break;
                }
                if (this.pageImageData != null && this.pageImageData.f454a != null && i6 < this.pageImageData.f454a[i + 1]) {
                    cVar2 = cVar;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m152a(boolean z) {
        int i = 0;
        if (this.pageImageData != null && this.pageImageData.f460a != null && this.pageImageData.f466b != null) {
            if (z) {
                this.f304a.mo70c();
                return;
            }
            synchronized (this) {
                int d = this.pageImageData.m353d(this.f300a);
                int d2 = this.pageImageData.m353d(this.f308b);
                int min = Math.min(this.pageImageData.mo98b(d), this.pageImageData.mo98b(d2));
                int max = Math.max(this.pageImageData.m329a(d), this.pageImageData.m329a(d2));
                if (min < 0 || max < 0) {
                    this.f304a.mo70c();
                } else {
                    int i2 = this.pageImageData.f465b ? 0 : 3;
                    int i3 = (this.pageImageData.f466b[min] - this.pageImageData.f460a[min]) - i2;
                    int i4 = i2 + this.pageImageData.f466b[max];
                    int i5 = this.width;
                    if (this.isVisible) {
                        i = 6;
                    }
                    this.f304a.mo63a(this.x, this.y + i3 + this.offset, i5 - i, i4 - i3);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m153a(int i) {
        if (this.pageImageData == null || this.pageImageData.f453a == null || this.pageImageData.f460a == null || this.pageImageData.f466b == null || this.pageImageData.f454a == null || i < 0 || i > this.pageImageData.f453a.length) {
            return false;
        }
        int f = this.pageImageData.m359f(i);
        if (this.pageImageData.f453a[i] == 76 || this.pageImageData.f453a[i] == 87 || this.pageImageData.f453a[i] == 80 || this.pageImageData.f453a[i] == 109) {
            int a = DrawingUtils.m74a(this.pageImageData.f453a, i + 1) + i + 2;
            if (f < this.pageImageData.f451a && a == this.pageImageData.f454a[f + 1] - 1) {
                f++;
            }
        }
        if (f == -1) {
            return false;
        }
        int a2 = mo39a(i);
        int i2 = this.pageImageData.f466b[f] - this.pageImageData.f460a[f];
        int abs = Math.abs(this.offset);
        return a2 + i2 > abs && i2 < this.height + abs;
    }

    /* renamed from: a */
    private boolean m154a(int i, int i2, boolean z) {
        int i3 = this.offset;
        this.f315c = false;
        this.f320f = -2;
        if (this.pageImageData != null) {
            int i4 = this.pageImageData.width;
            if (i4 < this.height) {
                return false;
            }
            if (i == f292z) {
                if (this.offset == 0) {
                    return false;
                }
                if (this.offset + i2 <= 0) {
                    this.offset += i2;
                } else {
                    this.offset = 0;
                }
            } else if (this.offset == this.height - i4) {
                return false;
            } else {
                if (Math.abs(this.offset) + this.height + i2 < i4) {
                    this.offset -= i2;
                } else {
                    this.offset = this.height - i4;
                }
            }
        }
        this.f319e = false;
        if (!m153a(this.f300a)) {
            m183b(-2);
        }
        if (z) {
            this.f304a.mo70c();
        }
        return i3 != this.offset;
    }

    /* renamed from: a */
    private boolean mo42a(String str, boolean z, boolean z2, String str2, String str3) {
        PageDataRunnable a;
        try {
            m173a();
            if (DrawingUtils.f146J) {
                this.f304a.mo66a(this.pageImageData);
            }
            if (!DrawingUtils.f146J || z || str3 != null || (a = this.f304a.mo59a(str, str)) == null) {
                this.f311b = new PageDataRunnable(this.f304a, this, str, str2, str3);
                this.f311b.f512p = z2;
                this.f311b.m341a(z);
            } else {
                String a2 = this.pageImageData.mo95a(true);
                if (a2 == null) {
                    a2 = "";
                }
                a.m340a(str);
                this.pageImageData = a;
                this.f315c = true;
                if (this.pageImageData != null && this.f310b != null && !a2.equals(str) && !this.f327i) {
                    int i = 0;
                    while (true) {
                        if (i >= this.f310b.size()) {
                            break;
                        } else if (m171a(i).equals(this.pageImageData.mo95a(true))) {
                            this.f318e = mo41a(1, i);
                            this.offset = this.f318e;
                            this.f320f = mo41a(0, i);
                            break;
                        } else {
                            this.f318e = 0;
                            this.f320f = -1;
                            i++;
                        }
                    }
                }
                mo49c();
                this.f312b = true;
                mo54f();
            }
            return true;
        } catch (OutOfMemoryError e) {
            return false;
        } catch (Exception e2) {
            return false;
        }
    }

    /* renamed from: b */
    private int mo46b() {
        if (this.pageImageData == null || this.pageImageData.f454a == null) {
            return -1;
        }
        int c = this.pageImageData.m350c(Math.abs(this.offset) + this.height);
        if (c < 0) {
            c = this.pageImageData.f451a - 1;
        }
        int a = this.pageImageData.mo92a((c < 0 || c > this.pageImageData.f451a) ? this.pageImageData.f454a[this.pageImageData.f451a] : this.pageImageData.f454a[c + 1], this.f336v, this.pageImageData.f488f);
        int d = this.pageImageData.m353d(a);
        int abs = this.height + Math.abs(this.offset);
        while (a >= 0 && d >= 0 && this.pageImageData.f466b[this.pageImageData.f490f[d]] > abs) {
            a = this.pageImageData.mo92a(a - 1, this.f336v, false);
            d = this.pageImageData.m353d(a);
        }
        if (d < 0) {
            return -1;
        }
        return a;
    }

    /* renamed from: b */
    private int mo47b(int i) {
        if (this.pageImageData == null) {
            return -1;
        }
        this.f315c = false;
        this.f320f = -2;
        return i == f285A ? this.f300a == -1 ? mo40a() : this.pageImageData.mo93a(this.f300a, this.f336v, this.pageImageData.f488f, false) : this.f300a == -1 ? mo46b() : this.pageImageData.mo92a(this.f300a, this.f336v, this.pageImageData.f488f);
    }

    /* renamed from: b */
    private int mo48b(int i, int i2) {
        for (int i3 = 0; i3 < this.f314c.size(); i3++) {
            C0007h hVar = (C0007h) this.f314c.elementAt(i3);
            if (i2 >= hVar.f88b && i2 <= hVar.f88b + hVar.f90d && i >= hVar.f87a) {
                if (i <= hVar.f89c + hVar.f87a) {
                    return i3;
                }
            }
        }
        return -1;
    }

    /* renamed from: b */
    private void m159b(String str) {
        if (this.f310b == null) {
            this.f310b = new Vector(30);
        }
        this.f313c++;
        if (this.f313c >= 30 && this.f310b.size() > 0) {
            this.f310b.removeElementAt(0);
            this.f313c--;
        }
        char[] charArray = str.toCharArray();
        byte[] bArr = new byte[(DrawingUtils.m59a(charArray, 0, str.length(), (byte[]) null, 6, true) + 4 + 2)];
        DrawingUtils.m90a((short) this.f296E, bArr, 0);
        DrawingUtils.m90a((short) this.offset, bArr, 2);
        DrawingUtils.m59a(charArray, 0, str.length(), bArr, 6, false);
        DrawingUtils.m90a((short) str.length(), bArr, 4);
        if (this.f313c <= -1 || this.f313c >= this.f310b.size()) {
            this.f310b.addElement(bArr);
        } else {
            this.f310b.setElementAt(bArr, this.f313c);
        }
        int size = this.f310b.size();
        while (true) {
            size--;
            if (size > this.f313c) {
                this.f310b.removeElementAt(size);
            } else {
                this.f316d = this.f313c;
                return;
            }
        }
    }

    /* renamed from: b */
    private void drawProgressBar(Graphics graphics) {
        if (this.pageImageData == null || this.pageImageData.width <= this.height || this.pageImageData.width <= 0) {
            this.isVisible = false;
            return;
        }
        this.isVisible = true;
        int color = graphics.getColor();
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int i = this.height;
        int max = Math.max(clipX, (this.width + this.x) - 6);
        int max2 = Math.max(clipY, this.y);
        int i2 = i - 2;
        int i3 = ((((i * 1024) / this.pageImageData.width) * i2) / 1024) + 3;
        int min = Math.abs(this.offset) + this.height >= this.pageImageData.width ? (i2 - i3) + 1 : Math.min((((Math.abs(this.offset) * 1024) / this.pageImageData.width) * i) / 1024, (i2 - i3) + 1);
        graphics.setColor(SKIN_COLORS[16]);
        graphics.drawLine(max, max2, max, (max2 + i) - 1);
        graphics.drawLine((max + 6) - 1, max2, (max + 6) - 1, (max2 + i) - 1);
        int[] iArr = {0, 0, 0, 0};
        iArr[0] = SKIN_COLORS[21];
        iArr[1] = SKIN_COLORS[22];
        iArr[2] = SKIN_COLORS[23];
        iArr[3] = SKIN_COLORS[24];
        for (int i4 = 0; i4 < 4; i4++) {
            graphics.setColor(iArr[i4]);
            graphics.drawLine(max + 1 + i4, max2, max + 1 + i4, (max2 + i) - 1);
        }
        int i5 = max + 1;
        int i6 = this.y + min;
        int i7 = i5 + 3;
        int max3 = this.y + min + Math.max(i3, 4);
        graphics.setColor(SKIN_COLORS[16]);
        graphics.drawLine(i5 - 1, i6, i7 + 1 + DrawingUtils.f185g, i6);
        graphics.drawLine(i5 - 1, max3, i7 + 1, max3);
        graphics.setColor(SKIN_COLORS[17]);
        graphics.drawLine(i5, i6 + 1, i5, max3 - 1);
        graphics.drawLine(i5, i6 + 1, DrawingUtils.f185g + i7, i6 + 1);
        graphics.setColor(SKIN_COLORS[18]);
        graphics.drawLine(i5 + 1, max3 - 1, DrawingUtils.f185g + i7, max3 - 1);
        graphics.drawLine(i7, max3 - 1, i7, i6 + 2);
        graphics.setColor(SKIN_COLORS[19]);
        graphics.drawLine(i5 + 1, i6 + 2, i5 + 1, max3 - 2);
        graphics.drawLine(i5 + 1, i6 + 2, i5 + 2 + DrawingUtils.f185g, i6 + 2);
        graphics.setColor(SKIN_COLORS[20]);
        graphics.drawLine(i5 + 2, i6 + 3, i5 + 2, max3 - 2);
        graphics.setColor(color);
        this.barWidth = i3;
        this.barOffset = min;
    }

    /* renamed from: b */
    private void m161b(PageDataRunnable uVar) {
        if (uVar != null && uVar.f456a != null && uVar.m333a() != null) {
            if (this.f302a == null) {
                this.f302a = new Vector(30);
            }
            if (this.f302a.size() > 30) {
                this.f302a.removeElement(this.f302a.firstElement());
            }
            int a = m147a(uVar.mo95a(false));
            if (a == -1) {
                this.f302a.addElement(uVar.f456a);
                return;
            }
            this.f302a.removeElementAt(a);
            this.f302a.addElement((Object[]) this.f302a.elementAt(a));
        }
    }

    /* renamed from: c */
    private void m162c(int i) {
        this.f315c = false;
        if (this.pageImageData != null && this.f304a != null && this.pageImageData.width > this.height && this.pageImageData.f466b != null && i > 0 && i <= this.pageImageData.f451a) {
            this.offset = -this.pageImageData.f466b[i - 1];
            m183b(mo40a());
            this.f304a.mo70c();
        }
    }

    /* renamed from: c */
    private void m163c(Graphics graphics) {
        if (!(this.pageImageData == null || this.pageImageData.f453a == null || this.pageImageData.f460a == null || this.pageImageData.f466b == null || graphics == null || this.pageImageData.f451a <= 0 || this.f317d)) {
            int clipX = graphics.getClipX();
            int clipY = graphics.getClipY();
            int clipWidth = graphics.getClipWidth();
            int clipHeight = graphics.getClipHeight();
            if (this.pageImageData.width > this.height) {
                if (DrawingUtils.m95a(clipX, clipY, clipWidth, clipHeight, this.width - 6, 0, 6, this.height)) {
                    clipWidth = ((this.x + this.width) - clipX) - 6;
                }
                if (this.offset > 0) {
                    this.offset = 0;
                } else if (this.offset < this.height - this.pageImageData.width) {
                    this.offset = this.height - this.pageImageData.width;
                }
            }
            int c = this.pageImageData.m350c(this.offset - (clipY - this.y));
            int c2 = this.pageImageData.m350c((this.offset - (clipY - this.y)) - clipHeight);
            if (c != -1) {
                short s = c2 == -1 ? this.pageImageData.f451a : c2;
                int i = this.offset + 0;
                if (c > 0) {
                    i += this.pageImageData.f466b[c - 1];
                }
                this.f314c.removeAllElements();
                if (this.f300a == -1) {
                    m183b(mo40a());
                }
                graphics.setClip(clipX, clipY, clipWidth, clipHeight);
                int i2 = i + this.y;
                for (int i3 = c; i3 <= s; i3++) {
                    m151a(graphics, i3, this.x, i2, false, false);
                    i2 += this.pageImageData.f460a[i3];
                }
                if (i2 < clipHeight + clipY) {
                    graphics.setColor(16777215);
                    graphics.fillRect(0, i2, this.width, (clipY + clipHeight) - i2);
                }
                if (i2 > this.height) {
                    this.f317d = true;
                    this.f298G = this.offset;
                    this.f299H = this.f300a;
                }
                if (!(this.f336v == 0 || this.pageImageData.f465b || this.f296E == -1)) {
                    int max = Math.max(c, (int) this.pageImageData.f485e[this.f296E]);
                    int min = Math.min(s, (int) this.pageImageData.f490f[this.f296E]);
                    int i4 = this.offset + this.y;
                    int i5 = max > 0 ? i4 + this.pageImageData.f466b[max - 1] : i4;
                    int i6 = i5;
                    for (int i7 = max; i7 <= min; i7++) {
                        m151a(graphics, i7, this.x, i6, true, true);
                        i6 += this.pageImageData.f460a[i7];
                    }
                    int i8 = i5;
                    for (int i9 = max; i9 <= min; i9++) {
                        m151a(graphics, i9, this.x, i8, true, false);
                        i8 += this.pageImageData.f460a[i9];
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private void m164d(int i) {
        if (this.f296E < 0 || this.f296E >= this.pageImageData.f472c.length || i < this.pageImageData.f472c[this.f296E] || i > this.pageImageData.f478d[this.f296E]) {
            this.f319e = false;
        } else {
            this.f319e = true;
        }
    }

    /* renamed from: d */
    private void drawBG(Graphics graphics) {
        if ((this.pageImageData != null && graphics != null && this.f312b && !this.pageImageData.f500j) || (this.pageImageData == null && graphics != null && this.f312b)) {
            int clipX = graphics.getClipX();
            int clipY = graphics.getClipY();
            int clipWidth = graphics.getClipWidth();
            int clipHeight = graphics.getClipHeight();
            graphics.setClip(this.x, this.y, this.width, this.height);
            int color = graphics.getColor();
            graphics.setColor(16777215);
            graphics.fillRect(this.x, this.y, this.width, this.height);
            graphics.setColor(color);
            graphics.setClip(clipX, clipY, clipWidth, clipHeight);
            this.f317d = false;
        }
        this.f312b = false;
    }

    /* renamed from: d */
    private boolean mo51d() {
        int f;
        if (this.pageImageData == null || this.pageImageData.f460a == null || this.pageImageData.f466b == null || (f = this.pageImageData.m359f(this.f300a)) < 0 || f > this.pageImageData.f460a.length) {
            return false;
        }
        int a = mo39a(this.f300a);
        if (f == -1) {
            return false;
        }
        int i = this.pageImageData.f466b[f] - this.pageImageData.f460a[f];
        int i2 = a + i;
        int abs = Math.abs(this.offset);
        int i3 = this.offset;
        if (i < abs && f != -1) {
            this.offset = -i;
        } else if (i2 > this.height + abs && f != -1) {
            this.offset = -(i2 - this.height);
        }
        if (this.pageImageData.width > this.height) {
            if (this.offset > 0) {
                this.offset = 0;
            } else if (this.offset < this.height - this.pageImageData.width) {
                this.offset = this.height - this.pageImageData.width;
            }
        }
        return i3 != this.offset;
    }

    /* renamed from: e */
    private void m167e(int i, int i2) {
        if (DrawingUtils.f201p) {
            m154a(i, i2 / 6, true);
            this.f304a.serviceRepaints();
            m154a(i, i2 / 3, true);
            this.f304a.serviceRepaints();
            m154a(i, i2 / 6, true);
            this.f304a.serviceRepaints();
            m154a(i, i2 / 6, true);
            this.f304a.serviceRepaints();
            m154a(i, i2 / 12, true);
            this.f304a.serviceRepaints();
            m154a(i, i2 / 12, true);
            this.f304a.serviceRepaints();
            return;
        }
        m154a(i, i2 / 4, true);
        this.f304a.serviceRepaints();
        m154a(i, i2 / 3, true);
        this.f304a.serviceRepaints();
        m154a(i, i2 / 3, true);
        this.f304a.serviceRepaints();
        m154a(i, i2 / 12, true);
        this.f304a.serviceRepaints();
    }

    /* renamed from: f */
    private void m168f(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.pageImageData != null) {
            this.f315c = false;
            if (!m153a(this.f300a)) {
                this.f300a = -1;
            }
            int b = mo47b(i);
            if (!m153a(b)) {
                boolean a = m154a(i, i2, false);
                if (this.pageImageData.f488f && ((i == f292z && this.offset == 0) || (i == f285A && this.offset == this.height - this.pageImageData.width))) {
                    int i3 = i == f292z ? f285A : f292z;
                    while (!m153a(b)) {
                        m154a(i3, i2, false);
                    }
                }
                z = a;
            } else {
                z = false;
            }
            if (m153a(b)) {
                m183b(b);
                z2 = mo51d();
            } else {
                z2 = false;
            }
            if (z || z2) {
                z3 = true;
            }
            m152a(z3);
        }
    }

    /* renamed from: i */
    private void m169i() {
        this.f312b = true;
        this.f304a.mo70c();
    }

    /* renamed from: j */
    private void m170j() {
        String a;
        if (this.pageImageData != null && this.pageImageData.f499j != 2 && !this.f306a && this.f310b != null && this.f313c > -1 && this.f313c < this.f310b.size() && (a = this.pageImageData.mo95a(true)) != null) {
            char[] charArray = a.toCharArray();
            byte[] bArr = new byte[(DrawingUtils.m59a(charArray, 0, a.length(), (byte[]) null, 6, true) + 4 + 2)];
            if (bArr.length >= 4) {
                DrawingUtils.m90a((short) this.f296E, bArr, 0);
                DrawingUtils.m90a((short) this.offset, bArr, 2);
                DrawingUtils.m59a(charArray, 0, a.length(), bArr, 6, false);
                DrawingUtils.m90a((short) a.length(), bArr, 4);
                this.f310b.setElementAt(bArr, this.f313c);
            }
        }
    }

    /* renamed from: a */
    public final String m171a(int i) {
        try {
            if (this.f310b != null && i > -1 && i < this.f310b.size()) {
                byte[] bArr = (byte[]) this.f310b.elementAt(i);
                if (bArr == null) {
                    return null;
                }
                return DrawingUtils.m67a(bArr, 4);
            }
        } catch (Throwable th) {
        }
        return null;
    }

    /* renamed from: a */
    public final C0014o m172a(int i) {
        return this.pageImageData.f459a[DrawingUtils.m74a(this.pageImageData.f453a, i + 1)];
    }

    /* renamed from: a */
    public final void m173a() {
        if (!(this.f311b == null || this.f311b.f494h == 8)) {
            this.f311b.m338a();
            this.f311b = null;
        }
        if (!(this.pageImageData == null || this.pageImageData.f494h == 8)) {
            this.pageImageData.m338a();
        }
        if (this.f304a != null) {
            this.f304a.mo74f();
        }
    }

    /* renamed from: a */
    public final void m174a(int i) {
        if (i != this.height) {
            this.height = i;
            this.f337w = this.height / 8;
            this.f338x = this.height / 4;
            this.f339y = (this.height - DrawingUtils.m73a(RunnableC0018s.f345a, false)) - 4;
        }
    }

    /* renamed from: a */
    public final void m175a(int i, int i2) {
        C0014o a;
        C0008i iVar;
        boolean z;
        boolean z2 = i2 > 0;
        try {
            boolean z3 = i2 > DrawingUtils.f163b && !this.pageImageData.f488f;
            boolean z4 = false;
            if (this.f304a.f428i || (DrawingUtils.f137A && (i == 49 || i == 51 || i == 55 || i == 57 || i == 48 || i == 35))) {
                this.f304a.f428i = false;
                switch (i) {
                    case 35:
                        mo53e();
                        z = false;
                        break;
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
                    default:
                        z = true;
                        break;
                    case 48:
                        if (this.pageImageData != null && !this.f304a.window.pageImageData.m349b()) {
                            this.f304a.mo64a("opera:reload");
                            z = false;
                            break;
                        }
                        z = false;
                        break;
                    case 49:
                        this.f304a.mo73e();
                        z = false;
                        break;
                    case 50:
                        this.f304a.mo64a("opera:bookmarks");
                        z = false;
                        break;
                    case 51:
                        int abs = Math.abs(this.offset);
                        if (!(this.pageImageData == null || this.pageImageData.f466b == null)) {
                            int i3 = this.pageImageData.f474d;
                            if (abs == this.pageImageData.width - this.height) {
                                mo55g();
                            } else if (i3 > 0 && abs >= this.pageImageData.f466b[i3 - 1]) {
                                mo56h();
                            } else if (i3 > 0 && abs >= 0) {
                                m162c(i3);
                            } else if (i3 <= 0 && abs >= 0) {
                                mo56h();
                            }
                            z = false;
                            break;
                        }
                        z = false;
                        break;
                    case 52:
                        this.f304a.mo64a("opera:start");
                        z = false;
                        break;
                    case 53:
                        this.f304a.mo64a("opera:history");
                        z = false;
                        break;
                    case 54:
                        if (this.pageImageData != null && !this.f304a.window.pageImageData.m349b()) {
                            this.f304a.mo64a("opera:pageinfo");
                            z = false;
                            break;
                        }
                        z = false;
                        break;
                    case 55:
                        if (this.pageImageData != null && !this.f304a.window.pageImageData.m349b()) {
                            this.f304a.mo64a("opera:bookmark");
                            z = false;
                            break;
                        }
                        z = false;
                        break;
                    case 56:
                        this.f304a.mo64a("opera:settings");
                        z = false;
                        break;
                    case 57:
                        this.f304a.f394b = new C0014o('x', "q", "", "search:///", (String) null, 0, 0);
                        z4 = true;
                        z = false;
                        break;
                }
                if (!z && !z4) {
                    return;
                }
            }
            int i4 = z4 ? 8 : (DrawingUtils.f137A || i < 48 || i > 57 || this.pageImageData.m356e(this.f300a) != 2) ? i : 8;
            switch (i4) {
                case 1:
                    if (this.offset == 0) {
                        z3 = false;
                    }
                    if (z3) {
                        m154a(f292z, this.f337w, true);
                        return;
                    } else {
                        m168f(f292z, this.f338x);
                        return;
                    }
                case 2:
                    if (z2 || !DrawingUtils.f139C) {
                        m154a(f292z, this.f339y, true);
                        return;
                    } else {
                        m167e(f292z, this.f339y);
                        return;
                    }
                case 5:
                    if (z2 || !DrawingUtils.f139C) {
                        m154a(f285A, this.f339y, true);
                        return;
                    } else {
                        m167e(f285A, this.f339y);
                        return;
                    }
                case 6:
                    if ((this.pageImageData == null || this.pageImageData.width > Math.abs(this.offset) + this.height) ? z3 : false) {
                        m154a(f285A, this.f337w, true);
                        return;
                    } else {
                        m168f(f285A, this.f338x);
                        return;
                    }
                case 8:
                    if (this.pageImageData != null) {
                        int e = z4 ? 2 : this.pageImageData.m356e(this.f300a);
                        if (z4 || this.f300a >= 0) {
                            m173a();
                            if (e == 0) {
                                String a2 = this.pageImageData.m334a(this.f300a);
                                if (a2 != null) {
                                    String a3 = DrawingUtils.m104b(a2).startsWith("javascript:") ? PageDataRunnable.m251a(this.pageImageData.f459a, (C0014o) null) : null;
                                    if (this.f304a != null) {
                                        this.f304a.f423g = DrawingUtils.f200o && i4 == 8 && a2.equals("opera:openurl");
                                    }
                                    if (a2.startsWith("#")) {
                                        m170j();
                                        m162c(this.pageImageData.m332a(a2.substring(1)));
                                        m159b(this.pageImageData.m333a());
                                        return;
                                    }
                                    this.f304a.mo65a(a2, this.pageImageData.f443a, a3);
                                    return;
                                }
                                return;
                            } else if (e == 5) {
                                String a4 = this.pageImageData.m334a(this.f300a);
                                if (a4 != null && DrawingUtils.f168b) {
                                    this.f304a.f406d = a4;
                                    openUrl("opera:platformrequestdialog", false, false, (String) null, (String) null);
                                    return;
                                }
                                return;
                            } else if (e == 6) {
                                String a5 = this.pageImageData.m334a(this.f300a);
                                if (a5 == null) {
                                    return;
                                }
                                if (DrawingUtils.f174c) {
                                    this.f304a.f406d = a5;
                                    openUrl("opera:platformrequestdialog", false, false, (String) null, (String) null);
                                    return;
                                }
                                this.f304a.mo68b(DrawingUtils.m62a(73));
                                return;
                            } else if (e == 7) {
                                String a6 = this.pageImageData.m334a(this.f300a);
                                if (a6 == null) {
                                    return;
                                }
                                if (DrawingUtils.f178d) {
                                    this.f304a.f411e = a6.substring(0, a6.indexOf(0));
                                    String substring = a6.substring(this.f304a.f411e.length() + 1);
                                    this.f304a.f417f = substring.substring(0, substring.indexOf(0));
                                    this.f304a.f421g = substring.substring(this.f304a.f417f.length() + 1);
                                    openUrl("opera:sendsmsdialog", false, false, (String) null, (String) null);
                                    return;
                                }
                                this.f304a.mo68b(DrawingUtils.m62a(105));
                                return;
                            } else if (e == 1) {
                                C0014o a7 = m172a(this.f300a);
                                String str = null;
                                if (a7 != null) {
                                    str = a7.f278d;
                                }
                                String a8 = PageDataRunnable.m251a(this.pageImageData.f459a, a7);
                                if (str == null) {
                                    str = this.pageImageData.f443a;
                                }
                                openUrl(str, false, true, this.pageImageData.f443a, a8);
                                return;
                            } else if (e == 4) {
                                String b = this.pageImageData.m346b(this.f300a);
                                if (b.length() > 0) {
                                    this.f336v = 0;
                                    openUrl(b, false, true, (String) null, (String) null);
                                    return;
                                }
                                return;
                            } else if (e == 2) {
                                C0014o a9 = z4 ? this.f304a.f394b : m172a(this.f300a);
                                if (DrawingUtils.f203r) {
                                    this.f304a.setFullScreenMode(false);
                                }
                                int i5 = 400;
                                String a10 = this.pageImageData.m333a();
                                String str2 = a9.f265a;
                                if (a10.equals("opera:sendgratissms") && str2.equals("msg")) {
                                    i5 = 160;
                                }
                                int i6 = 0;
                                if ((a10.equals("opera:recommend") && str2.equals("tno")) || (a10.equals("opera:sendgratissms") && str2.equals("phone"))) {
                                    i6 = 3;
                                } else if (a9 != null && a9.f278d != null && a9.f278d.equals("goto:///")) {
                                    this.f304a.f423g = DrawingUtils.f200o && i4 == 8;
                                    this.f304a.f384a = a9;
                                    this.f304a.mo73e();
                                    return;
                                } else if (a9.f262a == 'p') {
                                    i6 = 65536;
                                }
                                String str3 = a9.f271b == null ? "" : a9.f271b;
                                if (str3.length() > i5) {
                                    i5 = str3.length() * 2;
                                }
                                String a11 = DrawingUtils.m62a((a9.f278d == null || !a9.f278d.equals("search:///")) ? 48 : 55);
                                try {
                                    iVar = new C0008i(a11, str3, i5, i6, a9);
                                } catch (IllegalArgumentException e2) {
                                    iVar = new C0008i(a11, "", i5, i6, a9);
                                }
                                iVar.addCommand(RunnableC0018s.f366m);
                                iVar.addCommand(RunnableC0018s.f352d);
                                RunnableC0018s.m204a((Screen) iVar);
                                this.f304a.f423g = DrawingUtils.f200o && i4 == 8;
                                iVar.setCommandListener(this.f304a);
                                this.f304a.f381a.setCurrent(iVar);
                                return;
                            } else if (e == 3) {
                                C0014o a12 = m172a(this.f300a);
                                if (this.pageImageData != null) {
                                    this.pageImageData.m348b(a12.f274c * 6);
                                }
                                a12.mo36a(this.f304a, i4);
                                return;
                            } else if (this.pageImageData.f453a != null) {
                                if ((this.pageImageData.f453a[this.f300a] == 114 || this.pageImageData.f453a[this.f300a] == 99) && (a = m172a(this.f300a)) != null) {
                                    if (a.f262a == 'c') {
                                        a.f267a = !a.f267a;
                                        this.f317d = false;
                                        this.f304a.mo70c();
                                    } else if (a.f262a == 'r' && !a.f267a) {
                                        a.f267a = true;
                                        if (!(this.pageImageData == null || this.pageImageData.f459a == null)) {
                                            int length = this.pageImageData.f459a.length;
                                            for (int i7 = 0; i7 < length; i7++) {
                                                C0014o oVar = this.pageImageData.f459a[i7];
                                                if ((oVar instanceof C0014o) && oVar != a) {
                                                    C0014o oVar2 = oVar;
                                                    if (oVar2.f262a == 'r' && oVar2.f265a.equals(a.f265a)) {
                                                        oVar2.f267a = false;
                                                    }
                                                }
                                            }
                                        }
                                        this.f317d = false;
                                        this.f304a.mo70c();
                                    }
                                    mo44a(a);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 42:
                    this.f304a.m234b();
                    return;
                default:
                    return;
            }
        } catch (Throwable th) {
            if (!(th instanceof OutOfMemoryError)) {
                this.f304a.mo68b(DrawingUtils.m62a(72));
                this.f304a.mo76h();
            } else if (this.f304a != null) {
                this.f304a.m227a(2);
            }
        }
    }

    /* renamed from: a */
    public final void openUrl(String str, boolean z, boolean z2, String str2, String str3) {
        if (str != null && str.startsWith("opera:") && !str.equals("opera:start")) {
            this.f326i = f288j;
        }
        m170j();
        boolean z3 = false;
        for (int i = 0; i <= 3 && !(z3 = mo42a(str, z, z2, str2, str3)) && this.f304a != null; i++) {
            this.f304a.m227a(i);
        }
        if (!z3) {
            throw new OutOfMemoryError("OOM error caused by Window#openUrl");
        }
    }

    /* renamed from: a */
    public final void paint(Graphics graphics) {
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        int i = clipX + clipWidth;
        int i2 = clipY + clipHeight;
        try {
            int max = Math.max(clipX, this.x);
            int max2 = Math.max(this.y, clipY);
            int min = Math.min(i, this.width + this.x);
            int min2 = Math.min(i2, this.height + this.y);
            if (max < min && max2 < min2) {
                graphics.setClip(max, max2, min - max, min2 - max2);
                drawBG(graphics);
                if (this.f315c && this.f324h > 1 && this.pageImageData != null && this.pageImageData.width > this.height && ((this.f326i == f289k && DrawingUtils.f144H) || this.f326i == f290l)) {
                    if (this.pageImageData.f466b[this.f324h - 1] > this.pageImageData.width - this.height) {
                        this.offset = this.height - this.pageImageData.width;
                    } else {
                        this.offset = -this.pageImageData.f466b[this.f324h - 1];
                    }
                    this.f315c = false;
                    this.f324h = -1;
                    this.f300a = -1;
                    this.f320f = -2;
                } else if (this.f315c && this.f326i == f291m && this.pageImageData != null && this.pageImageData.f472c != null) {
                    this.offset = this.f318e;
                    this.f315c = false;
                }
                drawProgressBar(graphics);
                if (this.pageImageData != null && (this.pageImageData.f496h || (this.pageImageData.m351c() != null && this.pageImageData.m351c().equals("opera:alert")))) {
                    this.f317d = false;
                } else if (this.f317d && this.f298G == this.offset && this.f299H == this.f300a) {
                    this.f317d = true;
                } else {
                    this.f317d = false;
                }
                m163c(graphics);
                graphics.setClip(clipX, clipY, clipWidth, clipHeight);
            }
        } catch (Throwable th) {
            if (th instanceof OutOfMemoryError) {
                throw new OutOfMemoryError("OOM error in Window#paint.");
            }
        } finally {
            graphics.setClip(clipX, clipY, clipWidth, clipHeight);
        }
    }

    /* renamed from: a */
    public final void mo44a(C0014o oVar) {
        String a;
        if (oVar != null) {
            if (this.pageImageData != null && this.pageImageData.f483e && oVar.f265a.equals("source") && (a = oVar.m137a()) != null) {
                DrawingUtils.google_string = a;
                DrawingUtils.m106b();
            }
            if (oVar.f276c) {
                this.f304a.mo65a(this.pageImageData.f443a, this.pageImageData.f443a, PageDataRunnable.m251a(this.pageImageData.f459a, oVar));
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo45a(PageDataRunnable uVar) {
        if (uVar != null) {
            switch (uVar.f494h) {
                case 1:
                    this.f301a = System.currentTimeMillis();
                    this.f304a.mo74f();
                    this.f304a.mo77i();
                    break;
                case 5:
                    this.pageImageData = this.f311b;
                    mo49c();
                    this.f300a = -1;
                    this.offset = 0;
                    break;
                case 8:
                    this.f304a.mo74f();
                    if (uVar.width <= this.height) {
                        this.f312b = true;
                    }
                    String a = uVar.m333a();
                    if (a != null) {
                        if (a.startsWith("opera:menu") || a.startsWith("opera:bookmarksmenu")) {
                            this.height = Math.min(uVar.width, (this.f304a.getHeight() - 4) - this.f304a.f388b);
                            this.y = ((this.f304a.getHeight() - this.height) - 2) - this.f304a.f388b;
                            this.width = uVar.f497i + this.f329o + this.f330p;
                            if (uVar.width > this.height) {
                                this.width += 9;
                            }
                            this.width = Math.min(this.width, this.f304a.getWidth() - 2);
                            this.x = 0;
                            this.f312b = false;
                            uVar.m358e();
                        } else if (a.startsWith("opera:submenu")) {
                            this.height = Math.min(uVar.width, (this.f304a.getHeight() - 4) - this.f304a.f388b);
                            this.y = Math.min(((this.f304a.f395b.y + this.f304a.f395b.height) - 14) - this.height, ((this.f304a.getHeight() - this.height) - 2) - this.f304a.f388b);
                            this.y = Math.max(this.y, 2);
                            this.width = uVar.f497i + this.f329o + this.f330p;
                            if (uVar.width > this.height) {
                                this.width += 9;
                            }
                            this.width = Math.min(this.width, this.f304a.getWidth() - 4);
                            this.x = Math.min(this.x, (this.f304a.getWidth() - this.width) - 10);
                            this.x = Math.max(this.x, 2);
                            this.f312b = true;
                        } else if (a.startsWith("opera:alert")) {
                            this.width = Math.max(64, uVar.f497i + this.f329o + this.f330p);
                            this.height = uVar.width;
                            this.x = (this.f304a.getWidth() - this.width) / 2;
                            this.y = (this.f304a.getHeight() - this.height) / 2;
                            this.f312b = true;
                        }
                    }
                    this.f304a.repaint();
                    break;
                case 9:
                    if (this.f304a != null) {
                        this.f304a.mo68b(DrawingUtils.m62a(69));
                        break;
                    }
                    break;
                case 10:
                    if (this.f304a != null) {
                        this.f304a.mo74f();
                    }
                    m169i();
                    if (this.f304a != null) {
                        this.f304a.repaint();
                        break;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public final boolean m180a() {
        return this.f310b != null && !this.f310b.isEmpty() && this.f313c > 0;
    }

    /* renamed from: a */
    public final boolean m181a(int i, int i2) {
        return i >= this.x && i <= this.x + this.width && i2 >= this.y && i2 <= this.y + this.height;
    }

    /* renamed from: b */
    public final void m182b() {
        if (this.pageImageData != null) {
            this.f315c = true;
            this.f326i = f291m;
            this.f318e = this.offset;
            this.f320f = this.f296E;
            openUrl(this.pageImageData.m333a(), true, false, this.pageImageData.f443a, this.pageImageData.m354d());
        }
    }

    /* renamed from: b */
    public final void m183b(int i) {
        this.f308b = this.f300a;
        this.f300a = i;
        if (this.pageImageData != null) {
            this.f296E = this.pageImageData.m353d(this.f300a);
        }
    }

    /* renamed from: b */
    public final void m184b(int i, int i2) {
        int i3 = 0;
        this.f325h = false;
        this.f297F = i2;
        int b = mo48b(i, i2);
        int i4 = this.x + this.width;
        if (this.isVisible) {
            i3 = 6;
        }
        if (i <= i4 - i3 || this.f304a == null) {
            if (b != -1) {
                m183b(((C0007h) this.f314c.elementAt(b)).f91e);
            } else {
                m183b(-2);
            }
            if (!DrawingUtils.f143G) {
                this.f304a.repaint();
                return;
            }
            return;
        }
        int i5 = this.f304a.f398c + this.barOffset;
        if (i2 > i5 && i2 < this.barWidth + i5) {
            this.f325h = true;
        } else if (i2 < i5) {
            m154a(f292z, this.f339y, true);
        } else if (i2 > i5 + this.barWidth) {
            m154a(f285A, this.f339y, true);
        }
    }

    /* renamed from: b */
    public final boolean m185b() {
        return this.f310b != null && !this.f310b.isEmpty() && this.f313c + 1 < this.f310b.size();
    }

    /* renamed from: c */
    public final void mo49c() {
        if (this.pageImageData != null && this.pageImageData.f512p && !this.pageImageData.f470c && this.pageImageData.m342a()) {
            m161b(this.pageImageData);
        }
        if (this.pageImageData != null && !this.f306a) {
            m150a(this.pageImageData.mo95a(true));
        }
        this.f306a = false;
        this.f327i = false;
    }

    /* renamed from: c */
    public final void mo50c(int i, int i2) {
        int b;
        int i3;
        if (!this.f325h && (b = mo48b(i, i2)) != -1 && (i3 = ((C0007h) this.f314c.elementAt(b)).f91e) == this.f300a) {
            m183b(i3);
            m175a(8, 0);
        }
    }

    /* renamed from: c */
    public final boolean m188c() {
        return this.f311b != null && (this.f311b.f494h == 1 || this.f311b.f494h == 2 || this.f311b.f494h == 3 || this.f311b.f494h == 5 || this.f311b.f494h == 6);
    }

    /* renamed from: d */
    public final void m189d() {
        String str;
        this.f316d = this.f313c;
        if (this.pageImageData != null && this.pageImageData.m333a() != null && this.pageImageData.m333a().startsWith("opera:bookmark-")) {
            str = "opera:bookmarks";
        } else if (this.pageImageData != null && this.pageImageData.f499j == 2) {
            this.f306a = true;
            str = m171a(this.f313c);
        } else if (this.f310b == null || this.f310b.size() <= 0) {
            str = null;
        } else {
            this.f316d--;
            str = m171a(this.f316d);
        }
        this.f327i = true;
        if (str != null) {
            this.f315c = true;
            this.f326i = f291m;
            this.f318e = mo41a(1, this.f316d);
            this.f320f = mo41a(0, this.f316d);
            openUrl(str, false, false, (String) null, (String) null);
            return;
        }
        openUrl("opera:start", false, false, (String) null, (String) null);
    }

    /* renamed from: d */
    public final void mo52d(int i, int i2) {
        int i3 = -2;
        if (this.f325h) {
            int i4 = i2 - this.f297F;
            if (i4 != 0) {
                int abs = Math.abs((i4 * this.pageImageData.width) / this.height);
                if (i2 > this.f297F) {
                    m154a(f285A, abs, false);
                } else {
                    m154a(f292z, abs, false);
                }
                this.f297F = i2;
                if (System.currentTimeMillis() - this.f309b > 100) {
                    this.f304a.mo70c();
                    this.f309b = System.currentTimeMillis();
                }
            }
        } else if (this.f300a == -2 && this.pageImageData != null && !this.pageImageData.f496h) {
            int abs2 = Math.abs(i2 - this.f297F);
            if (abs2 != 0) {
                if (i2 < this.f297F) {
                    m154a(f285A, abs2, false);
                } else {
                    m154a(f292z, abs2, false);
                }
                this.f297F = i2;
                if (System.currentTimeMillis() - this.f309b > 25) {
                    this.f304a.mo70c();
                    this.f309b = System.currentTimeMillis();
                }
            }
        } else if (this.pageImageData != null && this.pageImageData.f496h) {
            int b = mo48b(i, i2);
            if (b != -1) {
                i3 = ((C0007h) this.f314c.elementAt(b)).f91e;
            }
            if (i3 != this.f300a) {
                m184b(i, i2);
            }
        }
    }

    /* renamed from: e */
    public final void mo53e() {
        if (m185b() && this.f310b != null) {
            this.f316d = this.f313c;
            this.f316d++;
            this.f315c = true;
            this.f326i = f291m;
            this.f318e = mo41a(1, this.f316d);
            this.f320f = mo41a(0, this.f316d);
            this.f327i = true;
            openUrl(m171a(this.f316d), false, false, (String) null, (String) null);
        }
    }

    /* renamed from: f */
    public final void mo54f() {
        if (this.f304a != null) {
            this.f304a.mo74f();
        }
        if (!(this.pageImageData == null || this.pageImageData.f472c == null || this.f320f <= -1 || this.f320f >= this.pageImageData.f472c.length || this.f326i == f289k)) {
            m183b(this.pageImageData.f472c[this.f320f]);
        }
        if (this.f320f == -1) {
            m183b(-1);
        }
        this.f320f = -1;
        this.f317d = false;
        if (this.f304a != null) {
            this.f304a.repaint();
        }
        if (this.pageImageData != null && this.pageImageData.f470c) {
            openUrl(this.pageImageData.m333a(), true, this.pageImageData.f512p, this.pageImageData.f462b, this.pageImageData.m354d());
        }
    }

    /* renamed from: g */
    public final void mo55g() {
        this.f315c = false;
        if (this.f304a != null && this.pageImageData != null && this.pageImageData.width > this.height) {
            this.offset = 0;
            m183b(mo40a());
            this.f304a.mo70c();
        }
    }

    /* renamed from: h */
    public final void mo56h() {
        this.f315c = false;
        if (this.pageImageData != null && this.f304a != null && this.pageImageData.width > this.height) {
            this.offset = this.height - this.pageImageData.width;
            m183b(mo40a());
            this.f304a.mo70c();
        }
    }
}
