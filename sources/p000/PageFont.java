package p000;

import javax.microedition.lcdui.Font;

/* renamed from: c */
public final class PageFont {

    /* renamed from: a */
    public int f64a = 0;

    /* renamed from: a */
    public Font lcd_font = null;

    /* renamed from: b */
    public int f66b = 0;

    public PageFont() {
    }

    public PageFont(int i, int i2, int i3, int i4, int i5) {
        this.lcd_font = Font.getFont(i, i2, i3);
        this.f64a = i4;
        this.f66b = i5;
    }
}
