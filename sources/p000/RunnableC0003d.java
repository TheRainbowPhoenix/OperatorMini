package p000;

/* renamed from: d */
public final class RunnableC0003d implements Runnable {

    /* renamed from: a */
    private String f71a = null;

    /* renamed from: a */
    private BrowserCanvas f72a = null;

    /* renamed from: a */
    private boolean f73a = false;

    /* renamed from: b */
    private String f74b = null;

    public RunnableC0003d(BrowserCanvas sVar, String str, String str2, boolean z) {
        this.f72a = sVar;
        this.f73a = z;
        this.f71a = new StringBuffer().append("sms://").append(str).append(":5000").toString();
        this.f74b = str2;
    }

    /* renamed from: a */
    public final void mo19a() {
        new Thread(this).start();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c A[SYNTHETIC, Splitter:B:18:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057 A[SYNTHETIC, Splitter:B:24:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC0003d.run():void");
    }
}
