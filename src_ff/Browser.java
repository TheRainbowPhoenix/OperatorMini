//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class Browser extends MIDlet {
    private boolean paused;
    static Browser browser;
    private static boolean Z;
    static boolean isCode;
    static Display displayCode;

    static void Code() {
        browser.destroyApp(false);
        browser.notifyDestroyed();
    }

    public Browser() {
    }

    protected void startApp() {
        browser = this;
        displayCode = Display.getDisplay(this);
        if (this.paused) {
            this.paused = false;
        } else if (!Z) {
            Z = true;
            if (e.Code("OM-Campaign", "debug")) {
                e.a = true;
            }

            new Code();
        }
    }

    protected void destroyApp(boolean var1) {
        isCode = true;
        if (Code.Code != null) {
            e.C(true);
            e.Code("h1", Code.Z);
            if (!e.ag) {
                browser.Code.Code.cancel();
            }
        }

        Z = false;
    }

    protected void pauseApp() {
        this.paused = true;
    }
}
