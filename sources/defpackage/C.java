package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: C  reason: default package */
public final class C extends Thread {
    private final B Code;

    /* renamed from: Code  reason: collision with other field name */
    private e f81Code;

    /* renamed from: Code  reason: collision with other field name */
    private String f82Code;

    /* renamed from: Code  reason: collision with other field name */
    private boolean f83Code;

    C(B b, String str) {
        this.Code = b;
        this.f82Code = str;
    }

    C(e eVar, String str) {
        this.f83Code = true;
        this.f81Code = eVar;
        this.f82Code = str;
    }

    public final void run() {
        if (this.f83Code) {
            Code.f89Code.I(this.f81Code);
            Code.f91Code.m110Code(this.f82Code);
            return;
        }
        if (a.Code(this.f82Code, this.Code.f9C)) {
            String substring = this.f82Code.substring(this.f82Code.lastIndexOf(47) + 1);
            int indexOf = substring.indexOf(63);
            if (indexOf > 0) {
                substring = substring.substring(0, indexOf);
            }
            B.Code(this.Code).m229Code(new StringBuffer().append("overlay:").append(e.m180I(60)).toString(), this.Code.f21Code, new StringBuffer().append("s=1&u=").append(substring).toString());
        }
        this.Code.f64g = false;
    }
}
