package com.opera.browser;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class Browser extends MIDlet {

    /* renamed from: a */
    public static RunnableC0018s f67a;

    /* renamed from: b */
    public static boolean f68b = true;

    /* renamed from: a */
    public Display f69a;

    /* renamed from: a */
    public boolean f70a;

    public final void destroyApp(boolean z) {
        if (!(f67a == null || f67a.f385a == null)) {
            C0010k.m80a(f67a.f385a.f302a);
        }
        C0010k.f143G = true;
        f68b = true;
    }

    public final void pauseApp() {
        this.f70a = true;
    }

    public final void startApp() {
        this.f69a = Display.getDisplay(this);
        if (this.f70a) {
            this.f70a = false;
        } else if (f68b) {
            f68b = false;
            C0010k.m86a((MIDlet) this);
            C0010k.m125g();
            C0010k.m115c();
            f67a = new RunnableC0018s(this);
            f67a.repaint();
            if (C0010k.f199n) {
                new Thread(f67a).run();
            } else {
                this.f69a.callSerially(f67a);
            }
        }
    }
}
