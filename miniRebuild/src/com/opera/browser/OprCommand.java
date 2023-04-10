package com.opera.browser;

import javax.microedition.lcdui.Command;


public class OprCommand extends Command {
    public int xPosition;  // a
    public int yPosition;  // b
    public int width;  // c
    public boolean isEnabled;  // a
    private final WebCanvas screen;  // s

    public OprCommand(WebCanvas screen, String shortLabel, int commandType) {
        this(screen, shortLabel, commandType, 1);
    }

    public OprCommand(WebCanvas screen, String shortLabel, int commandType, int priority) {
        super(shortLabel, commandType, priority);
        this.screen = screen;
        this.width = 2;
        this.isEnabled = false;
        this.xPosition = priority;
//        this.yPosition = k.a(screen.a, shortLabel, true) + this.width * 2;
//        k.a(screen.a, true);
    }

    public final boolean contains(int x, int y) {
//        int heightOffset = this.screen.getHeight() - this.screen.b;
        int widthOffset = 0;
//        if (this.screen.a != null && this != s.s) {
//            if (this.width == 2) {
//                widthOffset = this.screen.getWidth() - this.yPosition;
//            }
//
//            return x > widthOffset && x < widthOffset + this.yPosition && y > heightOffset && y < heightOffset + this.screen.b;
//        } else {
            return false;
//        }
    }
}
