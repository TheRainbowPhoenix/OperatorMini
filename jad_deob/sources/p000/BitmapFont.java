package p000;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* renamed from: a */
public final class BitmapFont {

    /* renamed from: a */
    private static int[] f0a = null;

    /* renamed from: e */
    private static byte[] f1e = null;

    /* renamed from: f */
    private static byte[] f2f = null;

    /* renamed from: a */
    private byte fontHeight;

    /* renamed from: a */
    private int bmpWidth;

    /* renamed from: a */
    private C0004e f5a;

    /* renamed from: a */
    private byte[] f6a;

    /* renamed from: a */
    private C0004e[] f7a;

    /* renamed from: b */
    private byte f8b = 1;

    /* renamed from: b */
    private int bmpHeight;

    /* renamed from: b */
    private byte[] f10b;

    /* renamed from: c */
    private int f11c;

    /* renamed from: c */
    private byte[] f12c;

    /* renamed from: d */
    private int f13d;

    /* renamed from: d */
    private byte[] f14d;

    public BitmapFont(boolean z) {
        String str;
        if (f1e == null) {
            DataInputStream dataInputStream = new DataInputStream(DrawingUtils.loadResourceByName("/t"));
            f1e = new byte[225];
            f2f = new byte[225];
            short s = 0;
            for (int i = 0; i < 225; i++) {
                try {
                    byte[] bArr = f1e;
                    s = (short) (s + dataInputStream.readShort());
                    bArr[i] = (byte) s;
                } catch (IOException e) {
                    return;
                }
            }
            short s2 = 0;
            for (int i2 = 0; i2 < 225; i2++) {
                byte[] bArr2 = f2f;
                s2 = (short) (s2 + dataInputStream.readShort());
                bArr2[i2] = (byte) s2;
            }
        }
        if (z) {
            str = "/sans80b.png";
            this.f6a = f2f;
            this.f8b = 0;
            this.f11c = 4;
        } else {
            str = "/sans80r.png";
            this.f6a = f1e;
            this.f8b = 1;
            this.f11c = 7;
        }
        Image a = DrawingUtils.loadImageResource(str);
        if (a != null) {
            this.fontHeight = 11;
            this.bmpWidth = a.getWidth();
            this.bmpHeight = a.getHeight();
            this.f7a = new C0004e[this.f11c];
            for (int i3 = 0; i3 < this.f11c; i3++) {
                this.f7a[i3] = new C0004e(null);
            }
            this.f13d = 0;
            int[] iArr = new int[(this.bmpWidth * this.bmpHeight)];
            a.getRGB(iArr, 0, this.bmpWidth, 0, 0, this.bmpWidth, this.bmpHeight);
            this.f14d = new byte[(this.bmpWidth * this.bmpHeight)];
            int length = iArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                this.f14d[i4] = (byte) (7 - ((iArr[i4] & 255) >> 5));
            }
            this.f10b = new byte[225];
            this.f12c = new byte[225];
            byte b = 0;
            byte b2 = 0;
            for (int i5 = 0; i5 < 225; i5++) {
                if (this.f6a[i5] + b2 >= this.bmpWidth) {
                    b = (byte) (b + 1);
                    b2 = 0;
                }
                this.f10b[i5] = b2;
                this.f12c[i5] = b;
                b2 = (byte) (b2 + this.f6a[i5]);
            }
            byte[] bArr3 = this.f6a;
            bArr3[0] = (byte) (bArr3[0] - this.f8b);
        }
    }

    /* renamed from: a */
    private static char convertCharToFontIndex(char c) {
        if (c >= ' ' && c <= 255) {
            return (char) (c - ' ');
        }
        switch (c) {
            case 8211:
                return 'v';
            case 8212:
                return 'w';
            case 8216:
                return 'q';
            case 8217:
                return 'r';
            case 8220:
                return 's';
            case 8221:
                return 't';
            case 8226:
                return 'u';
            case 8230:
                return 'e';
            default:
                return 224;
        }
    }

    /* renamed from: a */
    private int m1a(String str, int i, int i2) {
        int i3 = 0;
        int i4 = i + i2;
        if (i4 > str.length()) {
            i4 = str.length();
        }
        while (i < i4) {
            i3 += this.f6a[convertCharToFontIndex(str.charAt(i))] + this.f8b;
            i++;
        }
        return i3;
    }

    /* renamed from: a */
    private int m2a(Graphics graphics, char c, int i, int i2) {
        char a = convertCharToFontIndex(c);
        if (a != 0) {
            if (this.f5a.f78a != null) {
                graphics.drawRegion(m3a(this.f12c[a]), this.f10b[a], 0, this.f6a[a], this.fontHeight, 0, i, i2, 0);
            } else {
                graphics.drawRGB(m5a(this.f12c[a]), this.f10b[a], this.bmpWidth, i, i2, this.f6a[a], this.fontHeight, false);
            }
        }
        return this.f6a[a] + this.f8b;
    }

    /* renamed from: a */
    private Image m3a(byte b) {
        if (this.f5a.f78a[b] == null) {
            int i = this.bmpWidth * this.fontHeight;
            int i2 = b * i;
            for (int i3 = 0; i3 < i; i3++) {
                f0a[i3] = this.f5a.f76a[this.f14d[i3 + i2]];
            }
            this.f5a.f78a[b] = Image.createRGBImage(f0a, this.bmpWidth, this.fontHeight, false);
        }
        return this.f5a.f78a[b];
    }

    /* renamed from: a */
    private void m4a(int i, int i2) {
        if (!(this.f5a != null && this.f5a.f75a == i && this.f5a.f80b == i2)) {
            for (int i3 = 0; i3 < this.f11c; i3++) {
                if (i == this.f7a[i3].f75a && i2 == this.f7a[i3].f80b) {
                    this.f5a = this.f7a[i3];
                    return;
                }
            }
            this.f13d = (this.f13d + 1) % this.f11c;
            this.f5a = this.f7a[this.f13d];
            this.f5a.f78a = new Image[10];
            if (f0a == null || f0a.length < this.bmpWidth * this.fontHeight) {
                f0a = new int[(this.bmpWidth * this.fontHeight)];
            }
            this.f5a.f75a = i;
            this.f5a.f80b = i2;
            this.f5a.f76a = m6a(i, i2);
        }
    }

    /* renamed from: a */
    private int[] m5a(byte b) {
        if (!this.f5a.f79a[b]) {
            this.f5a.f79a[b] = true;
            int i = this.fontHeight * this.bmpWidth;
            int i2 = b * i;
            if (this.f5a.f77a[b] == null) {
                this.f5a.f77a[b] = new int[(this.bmpWidth * this.fontHeight)];
            }
            int[] iArr = (int[]) this.f5a.f77a[b];
            int[] iArr2 = this.f5a.f76a;
            for (int i3 = 0; i3 < i; i3++) {
                iArr[i3] = iArr2[this.f14d[i3 + i2]];
            }
        }
        return (int[]) this.f5a.f77a[b];
    }

    /* renamed from: a */
    private static int[] m6a(int i, int i2) {
        int[] iArr = new int[8];
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 8) & 255;
        int i5 = (i >> 0) & 255;
        int i6 = (i2 >> 16) & 255;
        int i7 = (i2 >> 8) & 255;
        int i8 = (i2 >> 0) & 255;
        iArr[0] = i2;
        for (int i9 = 1; i9 < 7; i9++) {
            iArr[i9] = (((((8 - i9) * i6) + (i3 * i9)) >> 3) << 16) | (((((8 - i9) * i7) + (i4 * i9)) >> 3) << 8) | (((((8 - i9) * i8) + (i5 * i9)) >> 3) << 0);
        }
        iArr[7] = i;
        return iArr;
    }

    /* renamed from: a */
    public final int strFontLengthThing(String str) {
        return m1a(str, 0, str.length());
    }

    /* renamed from: a */
    public final int mo2a(char[] cArr, int i, int i2) {
        int i3 = 0;
        int i4 = i + i2;
        while (i < i4) {
            i3 += this.f6a[convertCharToFontIndex(cArr[i])] + this.f8b;
            i++;
        }
        return i3;
    }

    /* renamed from: a */
    public final short mo3a() {
        return (short) this.fontHeight;
    }

    /* renamed from: a */
    public final void mo4a(Graphics graphics, String str, int i, int i2, int i3, int i4) {
        mo5a(graphics, str, i, i2, i3, i4, Integer.MAX_VALUE, i4);
    }

    /* renamed from: a */
    public final void mo5a(Graphics graphics, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        int length = str.length();
        if (length != 0) {
            int a = (i3 & 1) != 0 ? i - (strFontLengthThing(str) / 2) : (i3 & 8) != 0 ? i - strFontLengthThing(str) : i;
            if ((i3 & 32) != 0) {
                i2 -= this.fontHeight;
            }
            int clipX = graphics.getClipX();
            int clipY = graphics.getClipY();
            int clipWidth = graphics.getClipWidth();
            int clipHeight = graphics.getClipHeight();
            m4a(graphics.getColor(), i4);
            int i7 = 0;
            int i8 = i5;
            while (i7 < length) {
                int a2 = m2a(graphics, str.charAt(i7), a, i2);
                if (a + a2 > i8) {
                    m4a(graphics.getColor(), i6);
                    int max = Math.max(i8, clipX);
                    graphics.setClip(max, clipY, (clipWidth + clipX) - max, clipHeight);
                    i8 = Integer.MAX_VALUE;
                    i7--;
                } else {
                    a += a2;
                }
                i7++;
            }
            graphics.setClip(clipX, clipY, clipWidth, clipHeight);
        }
    }

    /* renamed from: a */
    public final void mo6a(Graphics graphics, char[] cArr, int i, int i2, int i3, int i4, int i5) {
        int i6 = i + i2;
        m4a(graphics.getColor(), i5);
        while (i < i6) {
            i3 += m2a(graphics, cArr[i], i3, i4);
            i++;
        }
    }
}
