package defpackage;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

/* renamed from: Browser  reason: default package */
public class Browser extends MIDlet {
    static Browser browser;

    /* renamed from: Code  reason: collision with other field name */
    static Display display;

    /* renamed from: Code  reason: collision with other field name */
    static boolean destroying;
    private static boolean running;
    private boolean I;

    static void Code() {
        browser.destroyApp(false);
        browser.notifyDestroyed();
    }

    /* access modifiers changed from: protected */
    public void destroyApp(boolean z) {
        destroying = true;
        if (browser.f89Code != null) {
            e.C(true);
            e.m157Code("h1", browser.f118Z);
            if (!e.ag) {
                browser.f89Code.f150Code.cancel();
            }
        }
        running = false;
    }

    /* access modifiers changed from: protected */
    public void pauseApp() {
        this.I = true;
    }

    /* access modifiers changed from: protected */
    public void startApp() {
        browser = this;
        display = Display.getDisplay(this);
        if (this.I) {
            this.I = false;
        } else if (!running) {
            running = true;
            if (e.m156Code("OM-Campaign", "debug")) {
                e.f289a = true;
            }
            new Code();
        }
    }
}
