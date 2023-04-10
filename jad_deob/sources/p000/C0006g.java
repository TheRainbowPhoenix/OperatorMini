package p000;

import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;

/* renamed from: g */
public final class C0006g extends List {

    /* renamed from: a */
    public C0014o f86a;

    public C0006g(String str, int i, C0014o oVar) {
        super(str, i);
        this.f86a = oVar;
    }

    /* renamed from: a */
    public final void mo25a() {
        if (!(this.f86a == null || this.f86a.f268a == null)) {
            for (int size = size() - 1; size >= 0; size--) {
                delete(size);
            }
            int length = this.f86a.f269a[this.f86a.f263a].length;
            for (int i = 0; i < length; i++) {
                String str = this.f86a.f268a[this.f86a.f263a][i];
                if (str != null) {
                    int append = append(str, (Image) null);
                    if (this.f86a.f272b || this.f86a.f269a[this.f86a.f263a][i]) {
                        setSelectedIndex(append, this.f86a.f269a[this.f86a.f263a][i]);
                    }
                }
            }
            if (!this.f86a.f272b && this.f86a.f270b > 50) {
                append(new StringBuffer().append(C0010k.m62a(104)).append("...").toString(), (Image) null);
            }
        }
    }
}
