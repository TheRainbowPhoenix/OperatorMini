package com.opera.android.turbo;

import android.os.ConditionVariable;
import com.opera.android.utilities.SystemUtil;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

@gyw
/* compiled from: OperaSrc */
public class TurboProxy implements dpx {
    public static volatile TurboProxy a;
    private static volatile gpa f;
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public boolean d;
    public boolean e;
    private int g = -1;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private boolean l;
    private final ConditionVariable m = new ConditionVariable();
    private final BlockingQueue n = new ArrayBlockingQueue(4);
    private final Runnable o = new goi(this);

    /* access modifiers changed from: private */
    public native boolean nativeControl(String str);

    /* access modifiers changed from: private */
    public native int nativeInit(String str, String str2, String str3, String str4, long j2, String str5, boolean z, boolean z2, String str6, String str7, String str8, String str9, int i2, String[] strArr, String[] strArr2);

    /* access modifiers changed from: private */
    public native boolean nativeInitSsl(byte[] bArr, byte[] bArr2);

    private native void nativePoke();

    /* access modifiers changed from: private */
    public native int nativePoll(long j2);

    /* access modifiers changed from: private */
    public native boolean nativeSendUsageStats(String str);

    /* access modifiers changed from: private */
    public native void nativeSetProxy(String str, int i2);

    /* access modifiers changed from: private */
    public native void nativeSetRoutingDebug(boolean z);

    /* access modifiers changed from: private */
    public native void nativeSslResponse(byte[] bArr, byte[] bArr2);

    public native void nativeSetErrorStrings(String str, String str2);

    public native int nativeSlotForURL(String str, String str2);

    public static /* synthetic */ void b(TurboProxy turboProxy, boolean z) {
        if (z) {
            turboProxy.b("NET UP");
            turboProxy.c();
            return;
        }
        turboProxy.b("NET DOWN");
    }

    public static /* synthetic */ void c(TurboProxy turboProxy, String str) {
        turboProxy.b("UPDATE_EXTRA phone_ua " + str);
        turboProxy.b.put("phone_ua", str);
    }

    public static /* synthetic */ void h(TurboProxy turboProxy) {
        while (true) {
            Runnable runnable = (Runnable) turboProxy.n.poll();
            if (runnable != null) {
                runnable.run();
            } else {
                return;
            }
        }
    }

    public static /* synthetic */ void k(TurboProxy turboProxy) {
        int i2;
        switch (gop.a[cky.J().s() - 1]) {
            case 1:
                i2 = 1;
                break;
            case 2:
            default:
                i2 = 0;
                break;
            case 3:
                i2 = 2;
                break;
        }
        turboProxy.b("COOKIE_MODE " + i2);
    }

    public static /* synthetic */ void l(TurboProxy turboProxy) {
        turboProxy.b("WEBP " + (SystemUtil.a ? "1" : "0"));
    }

    public static /* synthetic */ void m(TurboProxy turboProxy) {
        turboProxy.b("HTTPS " + (cky.J().d("https_compression") ? "1" : "0"));
    }

    public static /* synthetic */ void n(TurboProxy turboProxy) {
        int i2 = 0;
        if (cky.J().d("video_compression")) {
            i2 = 1;
        }
        if (SystemUtil.b) {
            i2 |= 2;
        }
        if (SystemUtil.c) {
            i2 |= 4;
        }
        if (cky.J().d("turbo_ad_blocking")) {
            i2 |= 4096;
        }
        turboProxy.b("FEATURES " + i2);
    }

    public static /* synthetic */ void o(TurboProxy turboProxy) {
        gue a2 = gud.a(bxn.d());
        if (a2 != null) {
            turboProxy.a(new gok(turboProxy, a2.a, a2.b));
        } else {
            turboProxy.a(new gol(turboProxy));
        }
    }

    public static /* synthetic */ void q(TurboProxy turboProxy) {
        turboProxy.b("UPDATE_EXTRA abgroup " + cti.a());
        turboProxy.b.put("abgroup", cti.a());
    }

    public static /* synthetic */ void s(TurboProxy turboProxy) {
        String b2 = dpp.b();
        turboProxy.b("UPDATE_EXTRA language " + b2);
        turboProxy.b.put("language", b2);
    }

    public TurboProxy() {
        byv.a(new got(this, (byte) 0), byy.Main);
        this.l = b(byd.a());
        this.h = new File(bxn.d().getFilesDir(), "turboproxy").toString();
        this.i = gog.a().c("user_id");
        this.j = gog.a().c("private_key");
        this.k = new File(bxn.d().getCacheDir(), "turboproxy").toString();
        gvk.a();
        this.b.put("phone_ua", e.H());
        this.b.put("form_factor", f.B() ? "t" : "m");
        this.b.put("language", dpp.b());
        this.b.put("campaign", dpp.g());
        this.b.put("install_referrer", e.i(guo.b));
        this.b.put("cookie", dpp.f());
        this.b.put("abgroup", cti.a());
        this.b.put("release_channel", "s");
        this.b.put("distribution_source", e.i(bxn.d()));
        gvk.a();
        this.c.put("X-OperaMini-FB", fjb.f());
        dpp.a(this);
    }

    public static String[] a(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                arrayList.add(entry.getKey());
                arrayList.add(entry.getValue());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // defpackage.dpx
    public final void a(String str, String str2, String str3) {
        if (str.equals("General") && str2.equals("Campaign")) {
            b("UPDATE_EXTRA campaign " + str3);
            this.b.put("campaign", str3);
        } else if (str.equals("Cookies") && str2.equals("Client")) {
            b("UPDATE_EXTRA cookie " + str3);
            this.b.put("cookie", str3);
        }
    }

    public final synchronized int a() {
        return this.g;
    }

    public static boolean a(URI uri) {
        return uri.getScheme() != null && uri.getScheme().startsWith("http");
    }

    public static String a(String str) {
        int i2 = 443;
        try {
            URI uri = new URI(str);
            if (!a(uri)) {
                return null;
            }
            String str2 = uri.getScheme() + "://" + uri.getHost();
            int port = uri.getPort();
            boolean d2 = cky.J().d("https_compression");
            boolean equals = uri.getScheme().equals("https");
            if (port < 0 && equals) {
                port = 443;
            }
            if (port >= 0) {
                if (!equals) {
                    i2 = 80;
                }
                if (port != i2) {
                    str2 = str2 + ":" + port;
                }
            }
            String rawPath = uri.getRawPath();
            if (rawPath.isEmpty()) {
                rawPath = "/";
            }
            if (!d2 && equals) {
                return str2;
            }
            String str3 = str2 + rawPath;
            if (uri.getRawQuery() != null) {
                return str3 + "?" + uri.getRawQuery();
            }
            return str3;
        } catch (URISyntaxException e2) {
            if (str.startsWith("http")) {
                return str;
            }
            return null;
        }
    }

    /* access modifiers changed from: private */
    public synchronized void a(int i2) {
        this.g = i2;
        TurboInterceptor.a(i2, this.h);
        gvk.a(this.o);
    }

    public final boolean b(String str) {
        if (a() < 0) {
            return false;
        }
        a(new goj(this, str));
        return true;
    }

    public final boolean c(String str) {
        Boolean bool;
        if (a() < 0) {
            return false;
        }
        if (f != null) {
            return false;
        }
        gvk.b();
        f = new gpa(this, str);
        a(f);
        try {
            bool = Boolean.valueOf(((Boolean) f.a.get(10, TimeUnit.SECONDS)).booleanValue());
        } catch (Exception e2) {
            bool = null;
        }
        f = null;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r2 = com.opera.android.turbo.TurboVideo.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        b("VIDEO " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return "http://127.0.0.1:" + r1 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (defpackage.cky.J().d("video_compression") == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String d(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            r2 = 0
            gpb r1 = new gpb
            r1.<init>(r5, r2, r2)
            defpackage.byv.a(r1)
            monitor-enter(r4)
            int r1 = r4.g     // Catch:{ all -> 0x004d }
            r2 = -1
            if (r1 != r2) goto L_0x0012
            monitor-exit(r4)     // Catch:{ all -> 0x004d }
        L_0x0011:
            return r0
        L_0x0012:
            int r1 = r4.g     // Catch:{ all -> 0x004d }
            monitor-exit(r4)     // Catch:{ all -> 0x004d }
            com.opera.android.settings.SettingsManager r2 = defpackage.cky.J()
            java.lang.String r3 = "video_compression"
            boolean r2 = r2.d(r3)
            if (r2 == 0) goto L_0x0011
            java.lang.String r2 = com.opera.android.turbo.TurboVideo.a(r5)
            if (r2 == 0) goto L_0x0011
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "VIDEO "
            r0.<init>(r3)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            r4.b(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "http://127.0.0.1:"
            r0.<init>(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L_0x0011
        L_0x004d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.turbo.TurboProxy.d(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: private */
    public void c() {
        int i2;
        bxn.n();
        switch (gop.b[eyp.c().g() - 1]) {
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 1;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 5;
                break;
            default:
                i2 = 0;
                break;
        }
        b("CTYPE " + i2);
    }

    /* access modifiers changed from: private */
    public static boolean b(byd byd) {
        return byd.a && byd.b && byd.c;
    }

    public final void a(Runnable runnable) {
        try {
            this.n.put(runnable);
            nativePoke();
        } catch (InterruptedException e2) {
        }
    }

    @gyu
    private static void statsCallback(long j2, long j3, int i2, int i3) {
        if ((j2 > 0 || j3 > 0 || i2 > 0 || i3 > 0) && a != null) {
            gvk.a(new gom(j2, j3, i2, i3));
        }
    }

    @gyu
    private static void trDebug(String str) {
        if (dpp.k()) {
            dpp.a(str);
        }
    }

    @gyu
    private static void videoCallback(String str, boolean z) {
        if (a != null) {
            gvk.a(new gpb(str, z, (byte) 0));
        }
    }

    @gyu
    private static void videoFiddlerCallback(String str, String str2) {
        TurboProxy turboProxy = a;
        if (turboProxy != null) {
            gvk.a(new gon(str, str2, turboProxy));
        }
    }

    @gyu
    private static void bypassCallback(String str, String str2, boolean z) {
    }

    @gyu
    private static void extraErrorCallback(int i2) {
    }

    @gyu
    private static void sslCallback(byte[] bArr, byte[] bArr2) {
        e.a(bxn.d(), bArr);
        e.b(bxn.d(), bArr2);
        TurboProxy turboProxy = a;
        if (turboProxy != null) {
            turboProxy.getClass();
            gvk.a(new goy(turboProxy, bArr, bArr2));
        }
    }

    @gyu
    private static void usageStatsSent(boolean z) {
        gpa gpa = f;
        if (gpa != null) {
            gpa.a(z);
        }
    }
}