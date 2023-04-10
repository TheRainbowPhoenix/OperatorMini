package defpackage;

import java.io.InputStream;
import java.util.TimerTask;

/* access modifiers changed from: package-private */
/* renamed from: I  reason: default package */
public final class I extends TimerTask {
    private static int B;
    private static I Code;

    /* renamed from: Code  reason: collision with other field name */
    private static Object f176Code = new Object();

    /* renamed from: Code  reason: collision with other field name */
    static boolean f177Code;
    private static int I;

    /* renamed from: I  reason: collision with other field name */
    private static I f178I;

    /* renamed from: I  reason: collision with other field name */
    static boolean f179I;
    private static int J;

    /* renamed from: J  reason: collision with other field name */
    private static boolean f180J;
    private static int Z;

    /* renamed from: Z  reason: collision with other field name */
    private static I f181Z;

    /* renamed from: Z  reason: collision with other field name */
    private static boolean f182Z;

    /* renamed from: B  reason: collision with other field name */
    String f183B;

    /* renamed from: B  reason: collision with other field name */
    private boolean f184B;
    String C;

    /* renamed from: Code  reason: collision with other field name */
    private int f185Code;

    /* renamed from: Code  reason: collision with other field name */
    long f186Code;

    /* renamed from: Code  reason: collision with other field name */
    public B f187Code;

    /* renamed from: Code  reason: collision with other field name */
    private final Code f188Code;

    /* renamed from: Code  reason: collision with other field name */
    e f189Code;

    /* renamed from: Code  reason: collision with other field name */
    InputStream f190Code;

    /* renamed from: Code  reason: collision with other field name */
    String f191Code;

    /* renamed from: I  reason: collision with other field name */
    String f192I;

    /* renamed from: J  reason: collision with other field name */
    String f193J;

    /* renamed from: Z  reason: collision with other field name */
    String f194Z;

    I(int i) {
        this.f184B = true;
        this.f185Code = i;
    }

    I(Code code) {
        this.f188Code = code;
        this.f185Code = Code.Code(this.f188Code);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v62, types: [int] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void B() {
        /*
        // Method dump skipped, instructions count: 2138
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I.B():void");
    }

    static void Code() {
        Code(0, 0, Code.g, Code.h);
    }

    static synchronized void Code(int i, int i2, int i3, int i4) {
        synchronized (I.class) {
            if (f178I == null) {
                f178I = new I(27);
                new Thread(f178I).start();
            }
            synchronized (f178I) {
                if (J > 0) {
                    int i5 = I + J;
                    I = Math.min(I, i);
                    J = Math.max(i + i3, i5) - I;
                    int i6 = Z + B;
                    Z = Math.min(Z, i2);
                    B = Math.max(i2 + i4, i6) - Z;
                } else {
                    I = i;
                    Z = i2;
                    J = i3;
                    B = i4;
                }
                f180J = true;
                f178I.notify();
            }
        }
    }

    static synchronized void Code(B b) {
        synchronized (I.class) {
            if (!e.f335m) {
                if (Code == null) {
                    Code = new I(23);
                    Thread thread = new Thread(Code);
                    thread.setPriority(1);
                    thread.start();
                }
                synchronized (Code) {
                    Code.f187Code = b;
                    f182Z = true;
                    Code.notify();
                }
            }
        }
    }

    static void I() {
        I i = new I(32);
        Code.f90Code = i;
        i.f186Code = System.currentTimeMillis() + 10000;
        Code.f89Code.f150Code.schedule(Code.f90Code, 10000, 2000);
    }

    static void J() {
        B Code2 = Code.Code();
        if (f181Z != null) {
            if (f181Z.f187Code != Code2) {
                f181Z.cancel();
                f181Z = null;
            } else {
                return;
            }
        }
        if (Code2 != null && Code2.f53a != null) {
            I i = new I(34);
            f181Z = i;
            i.f187Code = Code2;
            Code.f89Code.f150Code.schedule(f181Z, (long) Code2.h, 2000);
        }
    }

    static void Z() {
        Code.f90Code = null;
    }

    public final void run() {
        if (this.f184B) {
            B();
        } else {
            Code.Code(this.f188Code, this.f185Code);
        }
    }
}
