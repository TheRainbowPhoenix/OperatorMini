//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

final class g extends InputStream {
    private e Code;
    private byte[] Code;
    private B Code;
    private g Code;
    private Object[] Code;
    private int[] Code;
    private boolean Code;
    private Hashtable Code;
    private int Code;
    private int I;
    private boolean I;
    private int Z;
    private int J;
    private int B;
    private int C;
    private int a;
    private int b = 0;
    private byte[] I = new byte[1];

    final void I() {
        this.Code = null;
        this.Code = null;
    }

    public final void close() {
        e.Code(this, false);
    }

    final Object[] Code() {
        return this.Code;
    }

    final g Code() {
        return this.Code;
    }

    final Hashtable Code(boolean var1) {
        Hashtable var2 = this.Code;
        if (var1) {
            this.Code = null;
        }

        return var2;
    }

    g() {
    }

    final boolean Code(String var1) {
        if (this.b >= 3) {
            return false;
        } else {
            ++this.b;
            int var2 = e.Code(var1, (String)null);
            this.a = var2;
            this.Code = null;
            if (this.b == 1) {
                this.Code[90] = this.Code[53];
            }

            this.Code[53] = var1;
            this.Code[46] = 0;
            return true;
        }
    }

    g(Object[] var1, int[] var2, int var3) {
        this.Code = var1;
        this.Code = var2;
        this.a = var3;
        var2[46] = 0;
        this.Code = (Hashtable)var1[9];
        var1[9] = null;
    }

    final void J(int var1) {
        this.C += var1;
    }

    final int J() {
        return this.B;
    }

    final int Code() {
        return this.a;
    }

    final e Code() {
        return this.Code;
    }

    final void Code(e var1, int var2) {
        this.Code = var1;
        this.Code = var2;
    }

    public final int read(byte[] var1, int var2, int var3) {
        label27:
        while(true) {
            this.J = var2;
            this.B = var3;
            this.Code = var1;
            e.Code(this);

            while(!this.Code) {
                e var4;
                if ((var4 = this.Code) != null) {
                    var4.Code(this);
                }

                if (this.Code == null) {
                    if (this.B == 0) {
                        continue label27;
                    }

                    return this.B;
                }

                e.Code(this, 1000);
            }

            if (this.I) {
                return -1;
            }

            throw new IOException();
        }
    }

    public final boolean Z() {
        return this.Code;
    }

    final void Code() {
        this.Code = null;
    }

    final void Code(B var1) {
        this.Code = var1;
    }

    final void Code(g var1) {
        this.Code = var1;
    }

    final g Code(g var1) {
        if (var1 == this) {
            var1 = this.Code;
            this.Code = null;
            return var1;
        } else {
            for(g var2 = this; var2.Code != null; var2 = var2.Code) {
                if (var2.Code == var1) {
                    var2.Code = var1.Code;
                    var1.Code = null;
                    break;
                }
            }

            return this;
        }
    }

    final synchronized void Code(int var1) {
        this.B = var1;
        this.Code = null;
        this.notifyAll();
    }

    final int I() {
        return this.Code;
    }

    final int[] Code() {
        return this.Code;
    }

    final byte[] Code() {
        return this.Code;
    }

    final int Z() {
        return this.J;
    }

    final boolean Code() {
        return this.Code == null;
    }

    final boolean I() {
        return this.Code[46] != 0;
    }

    final void Z() {
        this.Code[46] = 1;
    }

    final void J() {
        this.I = true;
        e.Code(this);
    }

    public final int read() {
        return this.read(this.I, 0, 1) < 0 ? -1 : this.I[0] & 255;
    }

    final void I(int var1) {
        this.Code = true;
        this.Z = var1;
        e.Code(this);
    }

    final void Z(int var1) {
        this.I = var1;
    }

    final int B() {
        return this.I;
    }

    public final int C() {
        return this.Z;
    }

    public final int a() {
        return this.C;
    }

    public final boolean J() {
        return this.Code == null ? false : this.Code.Z();
    }

    final e I() {
        return this.Code.Code();
    }

    final B Code() {
        return this.Code;
    }
}
