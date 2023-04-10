//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.InputStream;
import java.util.TimerTask;

final class I extends TimerTask {
    static boolean Code;
    private static I Z;
    private static int Z;
    private static boolean J;
    private boolean B;
    private int Code;
    public B Code;
    private final Code Code;
    private static I Code;
    private static boolean Z;
    static boolean I;
    private static I I;
    String Code;
    InputStream Code;
    private static Object Code = new Object();
    long Code;
    String I;
    String Z;
    String J;
    String B;
    String C;
    e Code;
    private static int I;
    private static int J;
    private static int B;

    private void B() {
        // $FF: Couldn't be decompiled
    }

    I(int var1) {
        this.B = true;
        super();
        this.Code = var1;
    }

    static void J() {
        B var0 = Code.Code();
        if (Z != null) {
            if (Z.Code == var0) {
                return;
            }

            Z.cancel();
            Z = null;
        }

        if (var0 != null && var0.a != null) {
            (Z = new I(34)).Code = var0;
            Code.Code.Code.schedule(Z, (long)var0.h, 2000L);
        }

    }

    static void Code() {
        Code(0, 0, Code.g, Code.h);
    }

    I(Code var1) {
        this.Code = var1;
        this.Code = Code.Code(this.Code);
    }

    public final void run() {
        if (this.B) {
            this.B();
        } else {
            Code.Code(this.Code, this.Code);
        }
    }

    static synchronized void Code(int var0, int var1, int var2, int var3) {
        if (I == null) {
            I = new I(27);
            (new Thread(I)).start();
        }

        Throwable var19;
        label114: {
            I var4;
            synchronized(var4 = I){}
            boolean var20;
            if (J > 0) {
                int var5 = I + J;
                int var10000 = I;
                int var10001 = var0;

                try {
                    I = Math.min(var10000, var10001);
                    J = Math.max(var0 + var2, var5) - I;
                    var0 = Z + B;
                    Z = Math.min(Z, var1);
                    B = Math.max(var1 + var3, var0) - Z;
                } catch (Throwable var17) {
                    var19 = var17;
                    var20 = false;
                    break label114;
                }
            } else {
                try {
                    I = var0;
                    Z = var1;
                    J = var2;
                    B = var3;
                } catch (Throwable var16) {
                    var19 = var16;
                    var20 = false;
                    break label114;
                }
            }

            label108:
            try {
                J = true;
                I.notify();
                return;
            } catch (Throwable var15) {
                var19 = var15;
                var20 = false;
                break label108;
            }
        }

        Throwable var18 = var19;
        throw var18;
    }

    static synchronized void Code(B var0) {
        if (!e.m) {
            if (Code == null) {
                Code = new I(23);
                Thread var1;
                (var1 = new Thread(Code)).setPriority(1);
                var1.start();
            }

            I var4;
            synchronized(var4 = Code){}
            Code.Code = var0;
            Z = true;
            I var10000 = Code;

            try {
                var10000.notify();
            } finally {
                ;
            }

        }
    }

    static void I() {
        (Code.Code = new I(32)).Code = System.currentTimeMillis() + 10000L;
        Code.Code.Code.schedule(Code.Code, 10000L, 2000L);
    }

    static void Z() {
        Code.Code = null;
    }
}
