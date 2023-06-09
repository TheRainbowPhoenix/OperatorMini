package p000;

import java.util.TimerTask;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Image;

/* renamed from: l */
public final class C0011l extends TimerTask {

    /* renamed from: a */
    public int f212a;

    /* renamed from: a */
    public C0008i f213a;

    /* renamed from: a */
    public Alert f214a = null;

    /* renamed from: a */
    public BrowserCanvas f215a;

    public C0011l(BrowserCanvas sVar, int i) {
        this.f215a = sVar;
        this.f212a = i;
    }

    /* renamed from: a */
    private static int open_url(PageDataRunnable uVar, String str) {
        int i = 1;
        if (uVar == null || str == null) {
            return 0;
        }
        BrowserCanvas.f362j = true;
        try {
            uVar.get_data_from_url("", false, true, str);
            if (uVar.f452a) {
                i = 2;
            }
            return i;
        } catch (Throwable th) {
            return 0;
        } finally {
            BrowserCanvas.f362j = false;
            uVar.close_http_stream_and_con();
        }
    }

    public final void run() {
        switch (this.f212a) {
            case 0:
                if (!this.f215a.window.m188c()) {
                    this.f215a.mo78j();
                    return;
                } else {
                    this.f215a.mo72d();
                    return;
                }
            case 1:
                this.f215a.mo75g();
                return;
            case 2:
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f215a.f387a) {
                    if (this.f215a.display.getCurrent() != this.f215a) {
                        this.f215a.f387a = false;
                        return;
                    } else if (!this.f215a.f396b || this.f215a.f374a < currentTimeMillis - ((long) DrawingUtils.f155a)) {
                        this.f215a.f396b = false;
                        if (!this.f215a.f404c && currentTimeMillis - this.f215a.f399c > 50) {
                            this.f215a.mo62a(this.f215a.f373a, (int) (currentTimeMillis - this.f215a.f389b));
                        }
                        this.f215a.f374a = currentTimeMillis;
                        return;
                    } else {
                        return;
                    }
                } else if (this.f215a.f374a < currentTimeMillis - 20000) {
                    this.f215a.f391b = null;
                    cancel();
                    return;
                } else {
                    return;
                }
            case 3:
                this.f215a.m226a();
                this.f215a.mo72d();
                return;
            case 4:
                this.f215a.display.setCurrent(this.f215a);
                this.f212a = 5;
                C0011l lVar = new C0011l(this.f215a, 5);
                lVar.f213a = this.f213a;
                this.f215a.f378a.schedule(lVar, 50);
                return;
            case 5:
                this.f215a.window.mo44a(this.f213a.f92a);
                return;
            case 6:
            case 8:
            default:
                return;
            case 7:
                try {
                    if (this.f215a.browser.platformRequest(this.f215a.f406d) || this.f215a.f406d.indexOf(".jad") != -1 || this.f215a.f406d.indexOf(".jar") != -1) {
                        this.f215a.browser.destroyApp(true);
                        this.f215a.browser.notifyDestroyed();
                        return;
                    }
                    return;
                } catch (ConnectionNotFoundException e) {
                    this.f215a.mo68b(new StringBuffer().append("Platform requests of this kind are not supported. (Reason: ").append(e.getMessage()).append(")").toString());
                    return;
                } catch (SecurityException e2) {
                    return;
                }
            case 9:
                if (this.f215a != null) {
                    this.f214a = new Alert((String) null, (String) null, (Image) null, AlertType.INFO);
                    this.f214a.setTimeout(-2);
                    PageDataRunnable uVar = new PageDataRunnable(this.f215a, this.f215a.window, null, null, null);
                    if (this.f215a.window != null) {
                        this.f215a.window.f311b = uVar;
                    }
                    int a = open_url(uVar, DrawingUtils.http_ip_proxy);
                    if (a != 2) {
                        if (a == 1) {
                            uVar.m339a(8);
                            this.f214a.setString(DrawingUtils.get_string_resource(108));
                        } else {
                            uVar.m339a(8);
                            this.f214a.setString(new StringBuffer().append(DrawingUtils.format_string_resource(109, "http://help.opera.com/mini/")).append(uVar.m360f()).toString());
                        }
                        if (this.f215a.browser != null && this.f215a.browser.f69a != null) {
                            this.f215a.browser.f69a.setCurrent(this.f214a, this.f215a);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
