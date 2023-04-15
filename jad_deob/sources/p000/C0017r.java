package p000;

import javax.microedition.lcdui.Command;

/* access modifiers changed from: package-private */
/* renamed from: r */
public class C0017r extends Command {

    /* renamed from: a */
    public int f340a;

    /* renamed from: a */
    private final RunnableC0018s f341a;

    /* renamed from: a */
    public boolean f342a;

    /* renamed from: b */
    public int f343b;

    /* renamed from: c */
    public int f344c;

    public C0017r(RunnableC0018s sVar, String str, int i) {
        this(sVar, str, 1, i);
    }

    public C0017r(RunnableC0018s sVar, String str, int i, int i2) {
        super(str, i, 1);
        this.f341a = sVar;
        this.f344c = 2;
        this.f342a = false;
        this.f340a = i2;
        this.f343b = DrawingUtils.m56a(RunnableC0018s.f345a, str, true) + (this.f344c * 2);
        DrawingUtils.m73a(RunnableC0018s.f345a, true);
    }

    /* renamed from: a */
    public final boolean mo58a(int i, int i2) {
        int height = this.f341a.getHeight() - this.f341a.f388b;
        if (this.f341a.window == null || this == RunnableC0018s.f372s) {
            return false;
        }
        int width = this.f340a == 2 ? this.f341a.getWidth() - this.f343b : 0;
        return i > width && i < width + this.f343b && i2 > height && i2 < this.f341a.f388b + height;
    }
}
