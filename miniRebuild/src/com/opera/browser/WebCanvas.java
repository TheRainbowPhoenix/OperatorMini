package com.opera.browser;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.Screen;
import javax.microedition.lcdui.TextBox;

public class WebCanvas extends Canvas implements CommandListener, Runnable {

    public WebCanvas(Browser var1) {
        // this.a = k.a("/skin.png");
    }

    private static TextBox a() {
        return new TextBox("k.a(47)", "www.", 512, 4);
    }

    @Override
    public void run() {

    }

    @Override
    protected void paint(Graphics graphics) {

    }

    @Override
    public void commandAction(Command command, Displayable displayable) {

    }

    private void a(Graphics var1, p var2, boolean var3) {
        if (var1 != null && var2 != null) {
            var1.setColor(c[3]);
            var1.drawRect(var2.s - 1, var2.t - 3, var2.q + 1, var2.r + 4);
            k.a(var1, var2.s + 2, var2.t - 1, var2.q - 4, var2.r + 2, c[6], c[4]);
            var1.setColor(c[4]);
            var1.drawLine(var2.s, var2.t - 1, var2.s, var2.t + var2.r);
            var1.drawLine(var2.s + var2.q - 1, var2.t - 1, var2.s + var2.q - 1, var2.t + var2.r);
            var1.drawLine(var2.s, var2.t + var2.r, var2.s + var2.q - 1, var2.t + var2.r);
            var1.drawLine(var2.s, var2.t - 2, var2.s + var2.q - 1, var2.t - 2);
            var1.setColor(c[5]);
            var1.drawLine(var2.s + 1, var2.t - 1, var2.s + 1, var2.t + var2.r);
            var1.drawLine(var2.s + var2.q - 2, var2.t - 1, var2.s + var2.q - 2, var2.t + var2.r);
            if (k.a) {
                int var4 = var2.s + var2.q + 1;
                if (this.d != null) {
                    var1.drawImage(this.d, var4, var2.t - 3, 0);
                }

                int var5;
                int var6 = (var5 = var2.t + 1) + var2.r + 1;
                int var7;
                if (this.e != null) {
                    for(var7 = var5; var7 < var6; ++var7) {
                        var1.drawImage(this.e, var4, var7, 0);
                    }
                }

                if (var3 && this.f != null && this.g != null && this.h != null) {
                    var1.drawImage(this.f, var4, var6, 0);

                    for(var7 = var2.s + 4; var7 < var4; ++var7) {
                        var1.drawImage(this.g, var7, var6, 0);
                    }

                    var1.drawImage(this.h, var2.s, var6, 0);
                }
            }

            // Window.paint
            var2.paint(var1);
        }
    }

}
