package com.opera.browser;


import javax.microedition.lui.Display;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public class Browser extends MIDlet {
    public Display display;
    public boolean paused;
    // public static n a;
    public static boolean b = true;

    public Browser() {
    }

    @Override
    protected void startApp() throws MIDletStateChangeException {
        this.display = (Display) Display.getDisplays(this.paused);
        if (this.paused) {
            this.paused = false;
        } else if (b) {
            b = false;

        }

    }

    @Override
    protected void destroyApp(boolean b) throws MIDletStateChangeException {

    }

    @Override
    protected void pauseApp() {
        super.pauseApp();
        this.paused = true;
    }
}
