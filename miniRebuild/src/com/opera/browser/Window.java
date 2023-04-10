package com.opera.browser;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import java.util.Vector;

public final class Window {

    public s a;
    public long a = 0L;
    public u a;
    private int w;
    private int x;
    private int y;
    private static int z = 0;
    private static int A = 1;
    public int a = -1;
    public int b = -1;
    public Vector a;
    public Vector b;
    public int c = -1;
    public int d = -1;
    public boolean a = false;
    public int e;
    public int f;
    public int g;
    private boolean e;
    public boolean b;
    private int B = -1;
    private Vector c = new Vector();
    private int C;
    private int D;
    private long b;
    private boolean f;
    public u b;
    public boolean c = true;
    public int h = -1;
    public int i = 0;
    public static int j = 0;
    public static int k = 1;
    public static int l = 2;
    public static int m = 3;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v = 29;
    private o a;
    private int E;
    private boolean g;
    private boolean h;
    private static char[] a;
    private int F;
    public Object[] a = null;
    public boolean d;
    private int G;
    private int H;
    private boolean i = false;
    public static int[] a = null;

    public Window(s var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        this.a = var1;
        this.q = var2;
        this.a(var3);
        this.s = var4;
        this.t = var5;
        this.o = var6;
        this.p = var7;
        this.n = this.q - 6;
        if (a == null) {
            a = new char[512];
        }

    }

    public final void a(int var1) {
        if (var1 != this.r) {
            this.r = var1;
            this.w = this.r / 8;
            this.x = this.r / 4;
            this.y = this.r - k.a(s.a, false) - 4;
        }

    }

    public final void a() {
        if (this.b != null && this.b.h != 8) {
            this.b.a();
            this.b = null;
        }

        if (this.a != null && this.a.h != 8) {
            this.a.a();
        }

        if (this.a != null) {
            this.a.f();
        }

    }

    public final void b() {
        if (this.a != null) {
            this.c = true;
            this.i = m;
            this.e = this.g;
            this.f = this.E;
            this.a(this.a.a(), true, false, this.a.a, this.a.d());
        }
    }

    public final void a(String var1, boolean var2, boolean var3, String var4, String var5) {
        if (var1 != null && var1.startsWith("opera:") && !var1.equals("opera:start")) {
            this.i = j;
        }

        this.j();
        boolean var7 = false;

        for(int var8 = 0; var8 <= 3 && !(var7 = this.a(var1, var2, var3, var4, var5)) && this.a != null; ++var8) {
            this.a.a(var8);
        }

        if (!var7) {
            throw new OutOfMemoryError("OOM error caused by Window#openUrl");
        }
    }

    private boolean a(String var1, boolean var2, boolean var3, String var4, String var5) {
        boolean var6 = false;

        try {
            this.a();
            if (k.J) {
                this.a.a(this.a);
            }

            u var7;
            if (k.J && !var2 && var5 == null && (var7 = this.a.a(var1, var1)) != null) {
                String var8;
                if ((var8 = this.a.a(true)) == null) {
                    var8 = "";
                }

                var7.a(var1);
                this.a = var7;
                this.c = true;
                if (this.a != null && this.b != null && !var8.equals(var1) && !this.i) {
                    for(int var9 = 0; var9 < this.b.size(); ++var9) {
                        if (this.a(var9).equals(this.a.a(true))) {
                            this.e = this.a(1, var9);
                            this.g = this.e;
                            this.f = this.a(0, var9);
                            break;
                        }

                        this.e = 0;
                        this.f = -1;
                    }
                }

                this.c();
                this.b = true;
                this.f();
            } else {
                this.b = new u(this.a, this, var1, var4, var5);
                this.b.p = var3;
                this.b.a(var2);
            }

            var6 = true;
        } catch (OutOfMemoryError var10) {
        } catch (Exception var11) {
        }

        return var6;
    }

    private void i() {
        this.b = true;
        this.a.c();
    }

    public final void c() {
        if (this.a != null && this.a.p && !this.a.c && this.a.a()) {
            this.b(this.a);
        }

        if (this.a != null && !this.a) {
            String var1 = this.a.a(true);
            this.a(var1);
        }

        this.a = false;
        this.i = false;
    }

    private void a(String var1) {
        if (var1 != null) {
            if (this.a == null || this.a.j != 2) {
                if (this.b == null) {
                    this.b = new Vector(30);
                }

                if (this.d == -1 || this.d >= this.c && this.d <= this.c) {
                    if (this.d == this.c) {
                        String var2;
                        if ((var2 = this.a(this.c)) != null && var1.equals(var2)) {
                            this.j();
                            return;
                        }

                        if (!this.i) {
                            this.b(var1);
                        }
                    }

                } else {
                    this.c = this.d;
                }
            }
        }
    }

    private void b(String var1) {
        if (this.b == null) {
            this.b = new Vector(30);
        }

        ++this.c;
        if (this.c >= 30 && this.b.size() > 0) {
            this.b.removeElementAt(0);
            --this.c;
        }

        char[] var2;
        int var3 = k.a(var2 = var1.toCharArray(), 0, var1.length(), (byte[])null, 6, true);
        byte[] var4 = new byte[4 + var3 + 2];
        k.a((short)this.E, var4, 0);
        k.a((short)this.g, var4, 2);
        k.a(var2, 0, var1.length(), var4, 6, false);
        k.a((short)var1.length(), var4, 4);
        if (this.c > -1 && this.c < this.b.size()) {
            this.b.setElementAt(var4, this.c);
        } else {
            this.b.addElement(var4);
        }

        for(int var6 = this.b.size() - 1; var6 > this.c; --var6) {
            this.b.removeElementAt(var6);
        }

        this.d = this.c;
    }

    private void j() {
        if (this.a != null && this.a.j != 2 && !this.a && this.b != null && this.c > -1 && this.c < this.b.size()) {
            String var1;
            if ((var1 = this.a.a(true)) == null) {
                return;
            }

            char[] var2;
            int var3 = k.a(var2 = var1.toCharArray(), 0, var1.length(), (byte[])null, 6, true);
            byte[] var4;
            if ((var4 = new byte[4 + var3 + 2]).length >= 4) {
                k.a((short)this.E, var4, 0);
                k.a((short)this.g, var4, 2);
                k.a(var2, 0, var1.length(), var4, 6, false);
                k.a((short)var1.length(), var4, 4);
                this.b.setElementAt(var4, this.c);
            }
        }

    }

    private void b(u var1) {
        if (var1 != null && var1.a != null && var1.a() != null) {
            if (this.a == null) {
                this.a = new Vector(30);
            }

            if (this.a.size() > 30) {
                this.a.removeElement(this.a.firstElement());
            }

            int var2;
            if ((var2 = this.a(var1.a(false))) == -1) {
                this.a.addElement(var1.a);
                return;
            }

            Object[] var3 = (Object[])((Object[])this.a.elementAt(var2));
            this.a.removeElementAt(var2);
            this.a.addElement(var3);
        }

    }

    private int a(String var1) {
        if (this.a != null && var1 != null && var1.length() != 0) {
            for(int var2 = 0; var2 < this.a.size(); ++var2) {
                Object[] var3;
                String var4 = (String)(var3 = (Object[])((Object[])this.a.elementAt(var2)))[0];
                String var5 = (String)var3[3];
                String var6 = (String)var3[4];
                if (var4 != null && var5 != null) {
                    if (!var4.endsWith("/") && !var5.startsWith("/")) {
                        var4 = var4 + "/";
                    }

                    var4 = var4 + var5;
                }

                if (var1.equals(var4) || var1.equals(var6)) {
                    return var2;
                }
            }

            return -1;
        } else {
            return -1;
        }
    }

    public final boolean a() {
        if (this.b == null) {
            return false;
        } else {
            return !this.b.isEmpty() && this.c > 0;
        }
    }

    public final boolean b() {
        if (this.b == null) {
            return false;
        } else {
            return !this.b.isEmpty() && this.c + 1 < this.b.size();
        }
    }

    public final void d() {
        String var1 = null;
        this.d = this.c;
        if (this.a != null && this.a.a() != null && this.a.a().startsWith("opera:bookmark-")) {
            var1 = "opera:bookmarks";
        } else if (this.a != null && this.a.j == 2) {
            this.a = true;
            var1 = this.a(this.c);
        } else if (this.b != null && this.b.size() > 0) {
            --this.d;
            var1 = this.a(this.d);
        }

        this.i = true;
        if (var1 != null) {
            this.c = true;
            this.i = m;
            this.e = this.a(1, this.d);
            this.f = this.a(0, this.d);
            this.a(var1, false, false, (String)null, (String)null);
        } else {
            this.a("opera:start", false, false, (String)null, (String)null);
        }
    }

    public final void e() {
        if (this.b()) {
            if (this.b != null) {
                this.d = this.c;
                ++this.d;
                this.c = true;
                this.i = m;
                this.e = this.a(1, this.d);
                this.f = this.a(0, this.d);
                this.i = true;
                String var1 = this.a(this.d);
                this.a(var1, false, false, (String)null, (String)null);
            }

        }
    }

    public final String a(int var1) {
        try {
            if (this.b != null && var1 > -1 && var1 < this.b.size()) {
                byte[] var2;
                if ((var2 = (byte[])((byte[])this.b.elementAt(var1))) == null) {
                    return null;
                }

                return k.a(var2, 4);
            }
        } catch (Throwable var3) {
        }

        return null;
    }

    private int a(int var1, int var2) {
        try {
            byte[] var3 = (byte[])((byte[])this.b.elementAt(var2));
            if (var1 == 0) {
                return k.a(var3, 0);
            }

            if (var1 == 1) {
                return k.a(var3, 2);
            }
        } catch (Throwable var4) {
        }

        return -1;
    }

    public final synchronized void a(u var1) {
        if (var1 != null) {
            switch(var1.h) {
                case 1:
                    this.a = System.currentTimeMillis();
                    this.a.f();
                    this.a.i();
                    return;
                case 2:
                    return;
                case 3:
                    return;
                case 4:
                case 7:
                default:
                    break;
                case 5:
                    this.a = this.b;
                    this.c();
                    this.a = -1;
                    this.g = 0;
                    return;
                case 6:
                    return;
                case 8:
                    this.a.f();
                    if (var1.b <= this.r) {
                        this.b = true;
                    }

                    String var2;
                    if ((var2 = var1.a()) != null) {
                        if (!var2.startsWith("opera:menu") && !var2.startsWith("opera:bookmarksmenu")) {
                            if (var2.startsWith("opera:submenu")) {
                                this.r = Math.min(var1.b, this.a.getHeight() - 4 - this.a.b);
                                this.t = Math.min(this.a.b.t + this.a.b.r - 14 - this.r, this.a.getHeight() - this.r - 2 - this.a.b);
                                this.t = Math.max(this.t, 2);
                                this.q = var1.i + this.o + this.p;
                                if (var1.b > this.r) {
                                    this.q += 9;
                                }

                                this.q = Math.min(this.q, this.a.getWidth() - 4);
                                this.s = Math.min(this.s, this.a.getWidth() - this.q - 10);
                                this.s = Math.max(this.s, 2);
                                this.b = true;
                            } else if (var2.startsWith("opera:alert")) {
                                this.q = Math.max(64, var1.i + this.o + this.p);
                                this.r = var1.b;
                                this.s = (this.a.getWidth() - this.q) / 2;
                                this.t = (this.a.getHeight() - this.r) / 2;
                                this.b = true;
                            }
                        } else {
                            this.r = Math.min(var1.b, this.a.getHeight() - 4 - this.a.b);
                            this.t = this.a.getHeight() - this.r - 2 - this.a.b;
                            this.q = var1.i + this.o + this.p;
                            if (var1.b > this.r) {
                                this.q += 9;
                            }

                            this.q = Math.min(this.q, this.a.getWidth() - 2);
                            this.s = 0;
                            this.b = false;
                            var1.e();
                        }
                    }

                    this.a.repaint();
                    return;
                case 9:
                    if (this.a != null) {
                        this.a.b(k.a(69));
                        return;
                    }
                    break;
                case 10:
                    if (this.a != null) {
                        this.a.f();
                    }

                    this.i();
                    if (this.a != null) {
                        this.a.repaint();
                    }
            }

        }
    }

    public final void f() {
        if (this.a != null) {
            this.a.f();
        }

        if (this.a != null && this.a.c != null && this.f > -1 && this.f < this.a.c.length && this.i != k) {
            this.b(this.a.c[this.f]);
        }

        if (this.f == -1) {
            this.b(-1);
        }

        this.f = -1;
        this.d = false;
        if (this.a != null) {
            this.a.repaint();
        }

        if (this.a != null && this.a.c) {
            this.a(this.a.a(), true, this.a.p, this.a.b, this.a.d());
        }

    }

    public final boolean c() {
        return this.b != null && (this.b.h == 1 || this.b.h == 2 || this.b.h == 3 || this.b.h == 5 || this.b.h == 6);
    }

    public final void g() {
        this.c = false;
        if (this.a != null && this.a != null && this.a.b > this.r) {
            this.g = 0;
            this.b(this.a());
            this.a.c();
        }

    }

    public final void h() {
        this.c = false;
        if (this.a != null && this.a != null && this.a.b > this.r) {
            this.g = this.r - this.a.b;
            int var1 = this.a();
            this.b(var1);
            this.a.c();
        }

    }

    private void c(int var1) {
        this.c = false;
        if (this.a != null && this.a != null && this.a.b > this.r && this.a.b != null && var1 > 0 && var1 <= this.a.a) {
            this.g = -this.a.b[var1 - 1];
            this.b(this.a());
            this.a.c();
        }

    }

    private boolean a(int var1, int var2, boolean var3) {
        int var4 = this.g;
        this.c = false;
        this.f = -2;
        if (this.a != null) {
            int var5;
            if ((var5 = this.a.b) < this.r) {
                return false;
            }

            if (var1 == z) {
                if (this.g == 0) {
                    return false;
                }

                if (this.g + var2 <= 0) {
                    this.g += var2;
                } else {
                    this.g = 0;
                }
            } else {
                if (this.g == this.r - var5) {
                    return false;
                }

                if (Math.abs(this.g) + this.r + var2 < var5) {
                    this.g -= var2;
                } else {
                    this.g = this.r - var5;
                }
            }
        }

        this.e = false;
        if (!this.a(this.a)) {
            this.b(-2);
        }

        if (var3) {
            this.a.c();
        }

        return var4 != this.g;
    }

    private boolean a(int var1) {
        if (this.a != null && this.a.a != null && this.a.a != null && this.a.b != null && this.a.a != null) {
            if (var1 >= 0 && var1 <= this.a.a.length) {
                int var2 = this.a.f(var1);
                int var3;
                if (this.a.a[var1] == 76 || this.a.a[var1] == 87 || this.a.a[var1] == 80 || this.a.a[var1] == 109) {
                    var3 = var1 + k.a(this.a.a, var1 + 1) + 2;
                    if (var2 < this.a.a && var3 == this.a.a[var2 + 1] - 1) {
                        ++var2;
                    }
                }

                if (var2 == -1) {
                    return false;
                } else {
                    var3 = this.a(var1);
                    int var4 = this.a.b[var2] - this.a.a[var2];
                    int var5 = Math.abs(this.g);
                    return var4 + var3 > var5 && var4 < var5 + this.r;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public final void b(int var1) {
        this.b = this.a;
        this.a = var1;
        if (this.a != null) {
            this.E = this.a.d(this.a);
        }

    }

    private int a() {
        if (this.a != null && this.a.a != null) {
            int var1;
            if ((var1 = this.a.c(this.g)) < this.a.a.length && var1 >= 0) {
                if (this.a.b[var1] - this.a.a[var1] < -this.g) {
                    ++var1;
                    if (var1 >= this.a.a.length) {
                        return -1;
                    }
                }

                return this.a.a(this.a.a[var1] - 1, this.v, this.a.f, true);
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    private int b() {
        if (this.a != null && this.a.a != null) {
            int var1;
            if ((var1 = this.a.c(Math.abs(this.g) + this.r)) < 0) {
                var1 = this.a.a - 1;
            }

            int var2;
            if (var1 >= 0 && var1 <= this.a.a) {
                var2 = this.a.a[var1 + 1];
            } else {
                var2 = this.a.a[this.a.a];
            }

            int var3 = this.a.a(var2, this.v, this.a.f);
            int var4 = this.a.d(var3);

            for(int var5 = this.r + Math.abs(this.g); var3 >= 0 && var4 >= 0 && this.a.b[this.a.f[var4]] > var5; var4 = this.a.d(var3)) {
                var3 = this.a.a(var3 - 1, this.v, false);
            }

            return var4 >= 0 ? var3 : -1;
        } else {
            return -1;
        }
    }

    private void a(boolean var1) {
        if (this.a != null && this.a.a != null && this.a.b != null) {
            if (var1) {
                this.a.c();
            } else {
                synchronized(this) {
                    int var3 = this.a.d(this.a);
                    int var4 = this.a.d(this.b);
                    int var5 = Math.min(this.a.b(var3), this.a.b(var4));
                    int var6 = Math.max(this.a.a(var3), this.a.a(var4));
                    if (var5 >= 0 && var6 >= 0) {
                        int var7 = this.a.b ? 0 : 3;
                        int var8 = this.a.b[var5] - this.a.a[var5] - var7;
                        int var9 = this.a.b[var6] + var7;
                        int var10 = this.q - (this.f ? 6 : 0);
                        this.a.a(this.s, this.t + var8 + this.g, var10, var9 - var8);
                    } else {
                        this.a.c();
                    }

                }
            }
        }
    }

    private boolean d() {
        if (this.a != null && this.a.a != null && this.a.b != null) {
            int var1;
            if ((var1 = this.a.f(this.a)) >= 0 && var1 <= this.a.a.length) {
                int var2 = this.a(this.a);
                if (var1 == -1) {
                    return false;
                } else {
                    int var3;
                    int var4 = (var3 = this.a.b[var1] - this.a.a[var1]) + var2;
                    int var5 = Math.abs(this.g);
                    int var6 = this.g;
                    if (var3 < var5 && var1 != -1) {
                        this.g = -var3;
                    } else if (var4 > var5 + this.r && var1 != -1) {
                        this.g = -(var4 - this.r);
                    }

                    if (this.a.b > this.r) {
                        if (this.g > 0) {
                            this.g = 0;
                        } else if (this.g < this.r - this.a.b) {
                            this.g = this.r - this.a.b;
                        }
                    }

                    return var6 != this.g;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private int a(int var1) {
        boolean var2 = false;
        if (var1 >= 0 && var1 < this.a.a.length) {
            int var3;
            if (this.a.a[var1] != 76 && this.a.a[var1] != 87 && this.a.a[var1] != 109) {
                return (var3 = this.a.f(var1)) >= 0 && var3 <= this.a.a ? this.a.a[var3] : -1;
            } else {
                return (var3 = this.a.d(var1)) >= 0 && var3 < this.a.c.length ? this.a.b[this.a.f[var3]] - this.a.b[this.a.e[var3]] + this.a.a[this.a.e[var3]] : -1;
            }
        } else {
            return -1;
        }
    }

    /**
     * Draw Progress Bar
     * @param var1
     */
    private void b_draw_progress_bar(Graphics var1) {
        if (this.a != null && this.a.b > this.r && this.a.b > 0) {
            this.f = true;
            int var2 = var1.getColor();
            int var3 = var1.getClipX();
            int var4 = var1.getClipY();
            int var5 = this.r;
            int var6 = Math.max(var3, this.q + this.s - 6);
            int var7 = Math.max(var4, this.t);
            int var8 = var5 - 2;
            int var9 = 1024 * var5 / this.a.b * var8 / 1024 + 3;
            int var10;
            if (Math.abs(this.g) + this.r >= this.a.b) {
                var10 = var8 - var9 + 1;
            } else {
                var10 = Math.min(1024 * Math.abs(this.g) / this.a.b * var5 / 1024, var8 - var9 + 1);
            }

            var1.setColor(a[16]);
            var1.drawLine(var6, var7, var6, var7 + var5 - 1);
            var1.drawLine(var6 + 6 - 1, var7, var6 + 6 - 1, var7 + var5 - 1);
            int[] var11;
            (var11 = new int[]{0, 0, 0, 0})[0] = a[21];
            var11[1] = a[22];
            var11[2] = a[23];
            var11[3] = a[24];

            int var12;
            for(var12 = 0; var12 < 4; ++var12) {
                var1.setColor(var11[var12]);
                var1.drawLine(var6 + 1 + var12, var7, var6 + 1 + var12, var7 + var5 - 1);
            }

            var12 = var6 + 1;
            int var13 = var10 + this.t;
            int var14 = var12 + 3;
            int var15 = var10 + this.t + Math.max(var9, 4);
            var1.setColor(a[16]);
            var1.drawLine(var12 - 1, var13, var14 + 1 + k.g, var13);
            var1.drawLine(var12 - 1, var15, var14 + 1, var15);
            var1.setColor(a[17]);
            var1.drawLine(var12, var13 + 1, var12, var15 - 1);
            var1.drawLine(var12, var13 + 1, var14 + k.g, var13 + 1);
            var1.setColor(a[18]);
            var1.drawLine(var12 + 1, var15 - 1, var14 + k.g, var15 - 1);
            var1.drawLine(var14, var15 - 1, var14, var13 + 2);
            var1.setColor(a[19]);
            var1.drawLine(var12 + 1, var13 + 2, var12 + 1, var15 - 2);
            var1.drawLine(var12 + 1, var13 + 2, var12 + 2 + k.g, var13 + 2);
            var1.setColor(a[20]);
            var1.drawLine(var12 + 2, var13 + 3, var12 + 2, var15 - 2);
            var1.setColor(var2);
            this.C = var9;
            this.D = var10;
        } else {
            this.f = false;
        }
    }

    private void c(Graphics var1) {
        boolean var2 = false;
        if (this.a != null && this.a.a != null && this.a.a != null && this.a.b != null && var1 != null && this.a.a > 0 && !this.d) {
            int var3 = var1.getClipX();
            int var4 = var1.getClipY();
            int var5 = var1.getClipWidth();
            int var6 = var1.getClipHeight();
            if (this.a.b > this.r) {
                if (k.a(var3, var4, var5, var6, this.q - 6, 0, 6, this.r)) {
                    var5 = this.s + this.q - var3 - 6;
                }

                if (this.g > 0) {
                    this.g = 0;
                } else if (this.g < this.r - this.a.b) {
                    this.g = this.r - this.a.b;
                }
            }

            int var7 = this.a.c(this.g - (var4 - this.t));
            int var8 = this.a.c(this.g - (var4 - this.t) - var6);
            if (var7 != -1) {
                if (var8 == -1) {
                    var8 = this.a.a;
                }

                int var11 = 0 + this.g;
                int var9;
                if (var7 > 0) {
                    var9 = this.a.b[var7 - 1];
                    var11 += var9;
                }

                this.c.removeAllElements();
                if (this.a == -1) {
                    this.b(this.a());
                }

                var1.setClip(var3, var4, var5, var6);
                var11 += this.t;

                for(var9 = var7; var9 <= var8; ++var9) {
                    this.a(var1, var9, this.s, var11, false, false);
                    var11 += this.a.a[var9];
                }

                if (var11 < var6 + var4) {
                    var1.setColor(16777215);
                    var1.fillRect(0, var11, this.q, var6 + var4 - var11);
                }

                if (var11 > this.r) {
                    this.d = true;
                    this.G = this.g;
                    this.H = this.a;
                }

                if (this.v != 0 && !this.a.b && this.E != -1) {
                    var7 = Math.max(var7, this.a.e[this.E]);
                    var8 = Math.min(var8, this.a.f[this.E]);
                    var9 = this.g + this.t;
                    if (var7 > 0) {
                        var9 += this.a.b[var7 - 1];
                    }

                    var11 = var9;

                    int var10;
                    for(var10 = var7; var10 <= var8; ++var10) {
                        this.a(var1, var10, this.s, var11, true, true);
                        var11 += this.a.a[var10];
                    }

                    var11 = var9;

                    for(var10 = var7; var10 <= var8; ++var10) {
                        this.a(var1, var10, this.s, var11, true, false);
                        var11 += this.a.a[var10];
                    }

                }
            }
        }
    }

    private void a(Graphics var1, int var2, int var3, int var4, boolean var5, boolean var6) {
        if (this.a != null && this.a.a != null && this.a.a != null) {
            c var8 = null;
            int var9 = this.a.a[var2];
            if (!var5 && !this.a.b) {
                this.a(16777215, var1, var3, var4, var2);
            }

            var3 += this.o + this.a.b[var2];

            do {
                char var11 = (char)this.a.a[var9];
                ++var9;
                this.d(var9);
                int var7;
                int var10;
                short var20;
                switch(var11) {
                    case 'B':
                    case 'C':
                    case 'G':
                    case 'H':
                    case 'M':
                    case 'N':
                    case 'Q':
                    case 'S':
                    case 'U':
                    case 'V':
                    case 'X':
                    case 'Z':
                    case '[':
                    case '\\':
                    case ']':
                    case '^':
                    case '_':
                    case '`':
                    case 'a':
                    case 'b':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'n':
                    case 'o':
                    case 'q':
                    case 't':
                    case 'v':
                    case 'w':
                    default:
                        break;
                    case 'D':
                        if (!var5 && !this.a.b) {
                            var7 = u.a(k.a(this.a.a, var9));
                            this.a(var7, var1, this.s, var4, var2);
                        }

                        var9 += 2;
                        break;
                    case 'E':
                        this.e = false;
                        this.B = -1;
                        break;
                    case 'F':
                        var9 += k.a(this.a.a, var9) + 2 + 1;
                        break;
                    case 'I':
                    case 'K':
                        var9 += 2;
                        var9 += 2;
                        short var17 = k.a(this.a.a, var9);
                        var9 += 2;
                        byte var18 = this.a.a[var9];
                        ++var9;
                        if (var11 == 'I') {
                            short var19 = k.a(this.a.a, var9);
                            var9 += 2;
                            var9 += var19;
                            var20 = k.a(this.a.a, var9);
                            var9 += 2;
                            var9 += var20;
                        }

                        Image var26;
                        if ((var26 = this.a.a(var17)) == null) {
                            break;
                        }

                        if ((var18 & 1) != 0) {
                            var3 = (this.n - var26.getWidth()) / 2;
                        } else if ((var18 & 2) != 0) {
                            var3 -= this.o;
                        }

                        if ((var18 & 4) != 0) {
                            if (this.e) {
                                break;
                            }
                        } else if ((var18 & 8) != 0 && !this.e) {
                            break;
                        }

                        if ((var18 & 16) != 0) {
                            var3 = this.q - var26.getWidth();
                        } else if ((var18 & 32) != 0) {
                            var3 = this.o;
                        }

                        var10 = var4;
                        var4 += (this.a.a[var2] - var26.getHeight()) / 2;
                        if (var5 && !this.a.b) {
                            if (this.e && var6 || var6 && this.g) {
                                k.a(var1, var3 - 1, var4 - 1, var26.getWidth() + 2, var26.getHeight() + 2);
                                this.g = false;
                            }
                        } else if (var26 != null) {
                            var1.drawImage(var26, var3, var4, 20);
                        }

                        if (this.a != null) {
                            this.e = false;
                            this.a(var3, var4, this.a.a(false), this.a.a(), this.a.c[this.a.f]);
                            this.a = null;
                        } else if (!this.a.b) {
                            this.a(var3, var4, var26.getWidth(), var26.getHeight(), this.B);
                        }

                        var3 += var26.getWidth();
                        var4 = var10;
                        break;
                    case 'J':
                        var20 = k.a(this.a.a, var9);
                        var9 += 2;
                        short var21 = k.a(this.a.a, var9);
                        var9 += 2;
                        if (var20 > 38 || var21 > 38) {
                            var3 = (this.n - var20) / 2;
                        }

                        var1.setColor(a[25]);
                        var1.drawRect(var3, var4, var20 - 1, var21 - 1);
                        if (var5 && !this.a.b && (this.e && var6 || var6 && this.g)) {
                            k.a(var1, var3 - 1, var4 - 1, var20 + 2, var21 + 2);
                            this.g = false;
                        }

                        if (this.a != null) {
                            this.e = false;
                            this.a(var3, var4, this.a.a(false), this.a.a(), this.a.c[this.a.f]);
                            this.a = null;
                        } else if (!this.a.b) {
                            this.a(var3, var4, var20, var21, this.B);
                        }

                        var3 += var20;
                        break;
                    case 'L':
                    case 'P':
                    case 'W':
                    case 'm':
                        this.B = var9 - 1;
                        if (this.a.b) {
                            this.a(var3 - this.o, var4, this.q, this.a.a[var2], this.B);
                            if (this.e) {
                                int var23 = var3 - this.o;
                                int var28 = this.q;
                                if (this.f) {
                                    var28 -= 6;
                                }

                                short var29 = this.a.a[var2];
                                k.a(var1, var23, var4, var28, var29, a[7], a[8]);
                            }
                        }

                        var9 += k.a(this.a.a, var9) + 2;
                        break;
                    case 'O':
                        var9 += 2;
                        break;
                    case 'R':
                        var7 = u.a(k.a(this.a.a, var9));
                        var9 += 2;
                        var1.setColor(var7);
                        var1.drawLine(var3, var4 + 1, (this.f ? this.q - 6 - 2 : this.q - 2) + k.g, var4 + 1);
                        break;
                    case 'T':
                        int var12 = this.a.a[var9] & 255;
                        ++var9;
                        short var13 = k.a(this.a.a, var9);
                        var9 += 2;
                        int var14 = k.a(this.a.a, var9, var13, a, 0);
                        var9 += var13;
                        if (var8 == null || var8.a == null) {
                            break;
                        }

                        var1.setFont(var8.a);
                        var1.setColor(var8.a);
                        short var15 = k.a(var8.a, this.a.g);
                        if (var12 >= 255) {
                            var12 = k.a(var8.a, a, 0, var14, this.a.g);
                        }

                        var10 = var4;
                        var4 += (this.a.a[var2] - var15) / 2;
                        if (var5 == this.e && !var6 || this.a.b) {
                            int var16 = this.u;
                            if (this.e) {
                                if (!this.a.b) {
                                    if (this.a.e(this.a) == 6) {
                                        this.u = a[11];
                                        var1.setColor(a[11]);
                                        var1.fillRect(var3 - 1, var4, var12 + 2, var15);
                                        var1.setColor(a[12]);
                                    } else {
                                        this.u = a[10];
                                        var1.setColor(a[10]);
                                        var1.fillRect(var3 - 1, var4, var12 + 2, var15);
                                        var1.setColor(a[12]);
                                    }
                                } else {
                                    var1.setColor(this.a.e);
                                }
                            }

                            if (k.L && !this.a.g) {
                                k.a(var8.a).a(var1, a, 0, var14, var3, var4, this.u);
                            } else {
                                var1.drawChars(a, 0, var14, var3, var4 + k.j, 20);
                            }

                            if (this.e) {
                                this.u = var16;
                            }

                            if (!this.a.b) {
                                this.a(var3, var4, var12, var15, this.B);
                            }
                        }

                        var3 += var12;
                        var4 = var10;
                        break;
                    case 'Y':
                        int var27 = this.a.a[var9] & 255;
                        var8 = this.a.a[var27];
                        ++var9;
                        break;
                    case 'c':
                    case 'i':
                    case 'p':
                    case 'r':
                    case 's':
                    case 'u':
                    case 'x':
                        short var24 = k.a(this.a.a, var9);
                        var9 += 2;
                        o var25;
                        (var25 = this.a.a[var24]).d = this.e;
                        if (var5) {
                            if (this.e && var6) {
                                if (var11 == 'i') {
                                    this.g = true;
                                } else {
                                    k.a(var1, var3, var4, var25.a(true), var25.a());
                                }
                            }
                        } else {
                            var25.a(var1, var3, var4);
                            if (var11 != 'i') {
                                this.a(var3, var4, var25.a(false), var25.a(), this.a.c[var25.f]);
                            }
                        }

                        if (var11 == 'i') {
                            this.a = var25;
                        } else {
                            var3 += var25.a(false);
                            this.e = false;
                        }
                        break;
                    case 'h':
                        var9 += 2;
                        break;
                    case 'y':
                        short var22 = k.a(this.a.a, var9);
                        var8 = this.a.a[var22];
                        var9 += 2;
                        break;
                    case 'z':
                        var3 += k.a(this.a.a, var9);
                        var9 += 2;
                }
            } while(this.a != null && this.a.a != null && var9 < this.a.a[var2 + 1]);

        }
    }

    private void a(int var1, Graphics var2, int var3, int var4, int var5) {
        int var6 = this.q;
        if (this.f) {
            var6 -= 6;
        }

        int var7 = Math.min(this.a.a[var5], var2.getClipY() + var2.getClipHeight() - var4);
        this.u = var1;
        var2.setColor(var1);
        var2.fillRect(var3, var4, var6, var7);
    }

    private void a(int var1, int var2, int var3, int var4, int var5) {
        if (var5 != -1 && this.a.hasPointerEvents()) {
            this.c.addElement(new h(var1, var2, var3, var4, var5));
        }

    }

    private void d(int var1) {
        if (this.E >= 0 && this.E < this.a.c.length && var1 >= this.a.c[this.E] && var1 <= this.a.d[this.E]) {
            this.e = true;
        } else {
            this.e = false;
        }
    }

    // Draw stuff and progress bar
    public final void paint(Graphics var1) {
        int var2 = var1.getClipX();
        int var3 = var1.getClipY();
        int var4 = var1.getClipWidth();
        int var5 = var1.getClipHeight();
        int var6 = var2 + var4;
        int var7 = var3 + var5;

        try {
            int var8 = Math.max(var2, this.s);
            int var9 = Math.max(this.t, var3);
            int var10 = Math.min(var6, this.q + this.s);
            int var11 = Math.min(var7, this.r + this.t);
            if (var8 >= var10 || var9 >= var11) {
                return;
            }

            var1.setClip(var8, var9, var10 - var8, var11 - var9);
            this.d(var1);
            if (this.c && this.h > 1 && this.a != null && this.a.b > this.r && (this.i == k && k.H || this.i == l)) {
                if (this.a.b[this.h - 1] > this.a.b - this.r) {
                    this.g = this.r - this.a.b;
                } else {
                    this.g = -this.a.b[this.h - 1];
                }

                this.c = false;
                this.h = -1;
                this.a = -1;
                this.f = -2;
            } else if (this.c && this.i == m && this.a != null && this.a.c != null) {
                this.g = this.e;
                this.c = false;
            }

            this.b_draw_progress_bar(var1);
            if (this.a == null || !this.a.h && (this.a.c() == null || !this.a.c().equals("opera:alert"))) {
                if (this.d && this.G == this.g && this.H == this.a) {
                    this.d = true;
                } else {
                    this.d = false;
                }
            } else {
                this.d = false;
            }

            this.c(var1);
        } catch (Throwable var15) {
            if (var15 instanceof OutOfMemoryError) {
                throw new OutOfMemoryError("OOM error in Window#paint.");
            }

            return;
        } finally {
            var1.setClip(var2, var3, var4, var5);
        }

    }

    private void d(Graphics var1) {
        if (this.a != null && var1 != null && this.b && !this.a.j || this.a == null && var1 != null && this.b) {
            int var2 = var1.getClipX();
            int var3 = var1.getClipY();
            int var4 = var1.getClipWidth();
            int var5 = var1.getClipHeight();
            var1.setClip(this.s, this.t, this.q, this.r);
            int var6 = var1.getColor();
            var1.setColor(16777215);
            var1.fillRect(this.s, this.t, this.q, this.r);
            var1.setColor(var6);
            var1.setClip(var2, var3, var4, var5);
            this.d = false;
        }

        this.b = false;
    }

    private void e(int var1, int var2) {
        if (k.p) {
            this.a(var1, var2 / 6, true);
            this.a.serviceRepaints();
            this.a(var1, var2 / 3, true);
            this.a.serviceRepaints();
            this.a(var1, var2 / 6, true);
            this.a.serviceRepaints();
            this.a(var1, var2 / 6, true);
            this.a.serviceRepaints();
            this.a(var1, var2 / 12, true);
            this.a.serviceRepaints();
            this.a(var1, var2 / 12, true);
            this.a.serviceRepaints();
        } else {
            this.a(var1, var2 / 4, true);
            this.a.serviceRepaints();
            this.a(var1, var2 / 3, true);
            this.a.serviceRepaints();
            this.a(var1, var2 / 3, true);
            this.a.serviceRepaints();
            this.a(var1, var2 / 12, true);
            this.a.serviceRepaints();
        }
    }

    public final void a(int var1, int var2) {
        boolean var3 = var2 > 0;

        try {
            boolean var4 = var2 > k.b && !this.a.f;
            boolean var5 = false;
            int var8;
            if (this.a.i || k.A && (var1 == 49 || var1 == 51 || var1 == 55 || var1 == 57 || var1 == 48 || var1 == 35)) {
                this.a.i = false;
                boolean var6 = false;
                switch(var1) {
                    case 35:
                        this.e();
                        break;
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    default:
                        var6 = true;
                        break;
                    case 48:
                        if (this.a != null && !this.a.a.a.b()) {
                            this.a.a("opera:reload");
                        }
                        break;
                    case 49:
                        this.a.e();
                        break;
                    case 50:
                        this.a.a("opera:bookmarks");
                        break;
                    case 51:
                        int var7 = Math.abs(this.g);
                        if (this.a == null || this.a.b == null) {
                            break;
                        }

                        var8 = this.a.d;
                        if (var7 == this.a.b - this.r) {
                            this.g();
                        } else if (var8 > 0 && var7 >= this.a.b[var8 - 1]) {
                            this.h();
                        } else if (var8 > 0 && var7 >= 0) {
                            this.c(var8);
                        } else if (var8 <= 0 && var7 >= 0) {
                            this.h();
                        }
                        break;
                    case 52:
                        this.a.a("opera:start");
                        break;
                    case 53:
                        this.a.a("opera:history");
                        break;
                    case 54:
                        if (this.a != null && !this.a.a.a.b()) {
                            this.a.a("opera:pageinfo");
                        }
                        break;
                    case 55:
                        if (this.a != null && !this.a.a.a.b()) {
                            this.a.a("opera:bookmark");
                        }
                        break;
                    case 56:
                        this.a.a("opera:settings");
                        break;
                    case 57:
                        this.a.b = new o('x', "q", "", "search:///", (String)null, 0, 0);
                        var5 = true;
                }

                if (!var6 && !var5) {
                    return;
                }
            }

            if (!k.A && var1 >= 48 && var1 <= 57 && this.a.e(this.a) == 2) {
                var1 = 8;
            }

            if (var5) {
                var1 = 8;
            }

            switch(var1) {
                case 1:
                    if (this.g == 0) {
                        var4 = false;
                    }

                    if (var4) {
                        this.a(z, this.w, true);
                    } else {
                        this.f(z, this.x);
                    }
                    break;
                case 2:
                    if (!var3 && k.C) {
                        this.e(z, this.y);
                    } else {
                        this.a(z, this.y, true);
                    }
                    break;
                case 5:
                    if (!var3 && k.C) {
                        this.e(A, this.y);
                    } else {
                        this.a(A, this.y, true);
                    }
                    break;
                case 6:
                    if (this.a != null && this.a.b <= Math.abs(this.g) + this.r) {
                        var4 = false;
                    }

                    if (var4) {
                        this.a(A, this.w, true);
                    } else {
                        this.f(A, this.x);
                    }
                    break;
                case 8:
                    if (this.a == null) {
                        return;
                    }

                    int var18 = var5 ? 2 : this.a.e(this.a);
                    if (var5 || this.a >= 0) {
                        this.a();
                        String var19;
                        String var20;
                        if (var18 == 0) {
                            var19 = this.a.a(this.a);
                            var20 = null;
                            if (var19 != null) {
                                if (k.b(var19).startsWith("javascript:")) {
                                    var20 = u.a(this.a.a, (o)null);
                                }

                                if (this.a != null) {
                                    this.a.g = k.o && var1 == 8 && var19.equals("opera:openurl");
                                }

                                if (var19.startsWith("#")) {
                                    this.j();
                                    this.c(this.a.a(var19.substring(1)));
                                    this.b(this.a.a());
                                } else {
                                    this.a.a(var19, this.a.a, var20);
                                }
                            }
                        } else if (var18 == 5) {
                            if ((var19 = this.a.a(this.a)) != null && k.b) {
                                this.a.d = var19;
                                this.a("opera:platformrequestdialog", false, false, (String)null, (String)null);
                            }
                        } else if (var18 == 6) {
                            if ((var19 = this.a.a(this.a)) != null) {
                                if (k.c) {
                                    this.a.d = var19;
                                    this.a("opera:platformrequestdialog", false, false, (String)null, (String)null);
                                } else {
                                    this.a.b(k.a(73));
                                }
                            }
                        } else if (var18 == 7) {
                            if ((var19 = this.a.a(this.a)) != null) {
                                if (k.d) {
                                    this.a.e = var19.substring(0, var19.indexOf(0));
                                    var19 = var19.substring(this.a.e.length() + 1);
                                    this.a.f = var19.substring(0, var19.indexOf(0));
                                    this.a.g = var19.substring(this.a.f.length() + 1);
                                    this.a("opera:sendsmsdialog", false, false, (String)null, (String)null);
                                } else {
                                    this.a.b(k.a(105));
                                }
                            }
                        } else {
                            o var21;
                            if (var18 == 1) {
                                var21 = this.a(this.a);
                                var20 = null;
                                if (var21 != null) {
                                    var20 = var21.d;
                                }

                                String var9 = null;
                                var9 = u.a(this.a.a, var21);
                                this.a(var20 != null ? var20 : this.a.a, false, true, this.a.a, var9);
                            } else if (var18 == 4) {
                                if ((var19 = this.a.b(this.a)).length() > 0) {
                                    this.v = 0;
                                    this.a(var19, false, true, (String)null, (String)null);
                                }
                            } else {
                                int var22;
                                if (var18 == 2) {
                                    var21 = var5 ? this.a.b : this.a(this.a);
                                    if (k.r) {
                                        this.a.setFullScreenMode(false);
                                    }

                                    var22 = 400;
                                    String var10 = this.a.a();
                                    String var11 = var21.a;
                                    if (var10.equals("opera:sendgratissms") && var11.equals("msg")) {
                                        var22 = 160;
                                    }

                                    int var12 = 0;
                                    if (var10.equals("opera:recommend") && var11.equals("tno") || var10.equals("opera:sendgratissms") && var11.equals("phone")) {
                                        var12 = 3;
                                    } else {
                                        if (var21 != null && var21.d != null && var21.d.equals("goto:///")) {
                                            this.a.g = k.o && var1 == 8;
                                            this.a.a = var21;
                                            this.a.e();
                                            break;
                                        }

                                        if (var21.a == 'p') {
                                            var12 = 65536;
                                        }
                                    }

                                    String var13;
                                    if ((var13 = var21.b == null ? "" : var21.b).length() > var22) {
                                        var22 = var13.length() * 2;
                                    }

                                    String var14 = k.a(var21.d != null && var21.d.equals("search:///") ? 55 : 48);

                                    i var23;
                                    try {
                                        var23 = new i(var14, var13, var22, var12, var21);
                                    } catch (IllegalArgumentException var16) {
                                        var23 = new i(var14, "", var22, var12, var21);
                                    }

                                    var23.addCommand(s.m);
                                    var23.addCommand(s.d);
                                    s.a(var23);
                                    this.a.g = k.o && var1 == 8;
                                    var23.setCommandListener(this.a);
                                    this.a.a.setCurrent(var23);
                                } else if (var18 == 3) {
                                    var21 = this.a(this.a);
                                    if (this.a != null) {
                                        this.a.b(var21.c * 6);
                                    }

                                    var21.a(this.a, var1);
                                } else if (this.a.a != null && (this.a.a[this.a] == 114 || this.a.a[this.a] == 99) && (var21 = this.a(this.a)) != null) {
                                    if (var21.a == 'c') {
                                        var21.a = !var21.a;
                                        this.d = false;
                                        this.a.c();
                                    } else if (var21.a == 'r' && !var21.a) {
                                        var21.a = true;
                                        if (this.a != null && this.a.a != null) {
                                            var8 = this.a.a.length;

                                            for(var22 = 0; var22 < var8; ++var22) {
                                                o var24;
                                                o var25;
                                                if ((var24 = this.a.a[var22]) instanceof o && var24 != var21 && (var25 = (o)var24).a == 'r' && var25.a.equals(var21.a)) {
                                                    var25.a = false;
                                                }
                                            }
                                        }

                                        this.d = false;
                                        this.a.c();
                                    }

                                    this.a(var21);
                                }
                            }
                        }
                    }
                    break;
                case 42:
                    this.a.b();
            }

        } catch (Throwable var17) {
            if (var17 instanceof OutOfMemoryError) {
                if (this.a != null) {
                    this.a.a(2);
                    return;
                }
            } else {
                this.a.b(k.a(72));
                this.a.h();
            }

        }
    }

    public final void a(o var1) {
        if (var1 != null) {
            String var2;
            if (this.a != null && this.a.e && var1.a.equals("source") && (var2 = var1.a()) != null) {
                k.f = var2;
                k.b();
            }

            if (var1.c) {
                var2 = u.a(this.a.a, var1);
                this.a.a(this.a.a, this.a.a, var2);
            }
        }
    }

    private void f(int var1, int var2) {
        if (this.a != null) {
            this.c = false;
            if (!this.a(this.a)) {
                this.a = -1;
            }

            int var3 = this.b(var1);
            boolean var4 = false;
            if (!this.a(var3)) {
                var4 = this.a(var1, var2, false);
                if (this.a.f && (var1 == z && this.g == 0 || var1 == A && this.g == this.r - this.a.b)) {
                    int var5 = var1 == z ? A : z;

                    while(!this.a(var3)) {
                        this.a(var5, var2, false);
                    }
                }
            }

            boolean var6 = false;
            if (this.a(var3)) {
                this.b(var3);
                var6 = this.d();
            }

            this.a(var4 || var6);
        }
    }

    private int b(int var1) {
        if (this.a == null) {
            return -1;
        } else {
            this.c = false;
            this.f = -2;
            int var2;
            if (var1 == A) {
                if (this.a == -1) {
                    var2 = this.a();
                } else {
                    var2 = this.a.a(this.a, this.v, this.a.f, false);
                }
            } else if (this.a == -1) {
                var2 = this.b();
            } else {
                var2 = this.a.a(this.a, this.v, this.a.f);
            }

            return var2;
        }
    }

    public final o a(int var1) {
        return this.a.a[k.a(this.a.a, var1 + 1)];
    }

    public final void b(int var1, int var2) {
        this.h = false;
        this.F = var2;
        int var3 = this.b(var1, var2);
        if (var1 > this.s + this.q - (this.f ? 6 : 0) && this.a != null) {
            int var4 = this.a.c + this.D;
            if (var2 > var4 && var2 < var4 + this.C) {
                this.h = true;
            } else if (var2 < var4) {
                this.a(z, this.y, true);
            } else if (var2 > var4 + this.C) {
                this.a(A, this.y, true);
            }

        } else {
            if (var3 != -1) {
                this.b(((h)this.c.elementAt(var3)).e);
            } else {
                this.b(-2);
            }

            if (!k.G) {
                this.a.repaint();
            }

        }
    }

    public final void c(int var1, int var2) {
        int var3;
        int var4;
        if (!this.h && (var3 = this.b(var1, var2)) != -1 && (var4 = ((h)this.c.elementAt(var3)).e) == this.a) {
            this.b(var4);
            this.a(8, 0);
        }

    }

    public final void d(int var1, int var2) {
        int var3;
        int var4;
        if (this.h) {
            if ((var3 = var2 - this.F) != 0) {
                var4 = Math.abs(var3 * this.a.b / this.r);
                if (var2 > this.F) {
                    this.a(A, var4, false);
                } else {
                    this.a(z, var4, false);
                }

                this.F = var2;
                if (System.currentTimeMillis() - this.b > 100L) {
                    this.a.c();
                    this.b = System.currentTimeMillis();
                }

            }
        } else if (this.a == -2 && this.a != null && !this.a.h) {
            if ((var3 = Math.abs(var2 - this.F)) != 0) {
                if (var2 < this.F) {
                    this.a(A, var3, false);
                } else {
                    this.a(z, var3, false);
                }

                this.F = var2;
                if (System.currentTimeMillis() - this.b > 25L) {
                    this.a.c();
                    this.b = System.currentTimeMillis();
                }

            }
        } else {
            if (this.a != null && this.a.h) {
                var3 = this.b(var1, var2);
                var4 = -2;
                if (var3 != -1) {
                    var4 = ((h)this.c.elementAt(var3)).e;
                }

                if (var4 != this.a) {
                    this.b(var1, var2);
                }
            }

        }
    }

    private int b(int var1, int var2) {
        for(int var3 = 0; var3 < this.c.size(); ++var3) {
            h var4 = (h)this.c.elementAt(var3);
            if (var2 >= var4.b && var2 <= var4.b + var4.d && var1 >= var4.a && var1 <= var4.a + var4.c) {
                return var3;
            }
        }

        return -1;
    }

    public final boolean a(int var1, int var2) {
        return var1 >= this.s && var1 <= this.s + this.q && var2 >= this.t && var2 <= this.t + this.r;
    }
}

