package p000;

import javax.microedition.lcdui.Font;

/* renamed from: c */
public final class C0002c {

    /* renamed from: a */
    public int f64a = 0;

    /* renamed from: a */
    public Font f65a = null;

    /* renamed from: b */
    public int f66b = 0;

    public C0002c() {
    }

	/**
		(int face, int style, int size, ... )
	*/
    public C0002c(int i, int i2, int i3, int i4, int i5) {
        this.f65a = Font.getFont(i, i2, i3);
        this.f64a = i4;
        this.f66b = i5;
    }
}
