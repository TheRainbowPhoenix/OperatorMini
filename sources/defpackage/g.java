package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

/* access modifiers changed from: package-private */
/* renamed from: g  reason: default package */
public final class g extends InputStream {
    private int B;
    private int C;
    private int Code;

    /* renamed from: Code  reason: collision with other field name */
    private B f478Code;

    /* renamed from: Code  reason: collision with other field name */
    private e f479Code;

    /* renamed from: Code  reason: collision with other field name */
    private g f480Code;

    /* renamed from: Code  reason: collision with other field name */
    private Hashtable f481Code;

    /* renamed from: Code  reason: collision with other field name */
    private boolean f482Code;

    /* renamed from: Code  reason: collision with other field name */
    private byte[] f483Code;

    /* renamed from: Code  reason: collision with other field name */
    private int[] f484Code;

    /* renamed from: Code  reason: collision with other field name */
    private Object[] f485Code;
    private int I;

    /* renamed from: I  reason: collision with other field name */
    private boolean f486I;

    /* renamed from: I  reason: collision with other field name */
    private byte[] f487I;
    private int J;
    private int Z;
    private int a;
    private int b;

    g() {
        this.b = 0;
        this.f487I = new byte[1];
    }

    g(Object[] objArr, int[] iArr, int i) {
        this.b = 0;
        this.f487I = new byte[1];
        this.f485Code = objArr;
        this.f484Code = iArr;
        this.a = i;
        iArr[46] = 0;
        this.f481Code = (Hashtable) objArr[9];
        objArr[9] = null;
    }

    /* access modifiers changed from: package-private */
    public final int B() {
        return this.I;
    }

    public final int C() {
        return this.Z;
    }

    /* access modifiers changed from: package-private */
    public final int Code() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final B m255Code() {
        return this.f478Code;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final e m256Code() {
        return this.f479Code;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final g m257Code() {
        return this.f480Code;
    }

    /* access modifiers changed from: package-private */
    public final g Code(g gVar) {
        if (gVar == this) {
            g gVar2 = this.f480Code;
            this.f480Code = null;
            return gVar2;
        }
        for (g gVar3 = this; gVar3.f480Code != null; gVar3 = gVar3.f480Code) {
            if (gVar3.f480Code == gVar) {
                gVar3.f480Code = gVar.f480Code;
                gVar.f480Code = null;
                return this;
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final Hashtable Code(boolean z) {
        Hashtable hashtable = this.f481Code;
        if (z) {
            this.f481Code = null;
        }
        return hashtable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final void m258Code() {
        this.f479Code = null;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void Code(int i) {
        this.B = i;
        this.f483Code = null;
        notifyAll();
    }

    /* access modifiers changed from: package-private */
    public final void Code(B b2) {
        this.f478Code = b2;
    }

    /* access modifiers changed from: package-private */
    public final void Code(e eVar, int i) {
        this.f479Code = eVar;
        this.Code = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final void m259Code(g gVar) {
        this.f480Code = gVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final boolean m260Code() {
        return this.f485Code == null;
    }

    /* access modifiers changed from: package-private */
    public final boolean Code(String str) {
        if (this.b >= 3) {
            return false;
        }
        this.b++;
        this.a = e.Code(str, (String) null);
        this.f479Code = null;
        if (this.b == 1) {
            this.f485Code[90] = this.f485Code[53];
        }
        this.f485Code[53] = str;
        this.f484Code[46] = 0;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final byte[] m261Code() {
        return this.f483Code;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final int[] m262Code() {
        return this.f484Code;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final Object[] m263Code() {
        return this.f485Code;
    }

    /* access modifiers changed from: package-private */
    public final int I() {
        return this.Code;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I  reason: collision with other method in class */
    public final e m264I() {
        return this.f479Code.m224Code();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I  reason: collision with other method in class */
    public final void m265I() {
        this.f485Code = null;
        this.f484Code = null;
    }

    /* access modifiers changed from: package-private */
    public final void I(int i) {
        this.f482Code = true;
        this.Z = i;
        e.Code((Object) this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I  reason: collision with other method in class */
    public final boolean m266I() {
        return this.f484Code[46] != 0;
    }

    /* access modifiers changed from: package-private */
    public final int J() {
        return this.B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J  reason: collision with other method in class */
    public final void m267J() {
        this.f486I = true;
        e.Code((Object) this);
    }

    /* access modifiers changed from: package-private */
    public final void J(int i) {
        this.C += i;
    }

    /* renamed from: J  reason: collision with other method in class */
    public final boolean m268J() {
        if (this.f479Code == null) {
            return false;
        }
        return this.f479Code.m246Z();
    }

    /* access modifiers changed from: package-private */
    public final int Z() {
        return this.J;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z  reason: collision with other method in class */
    public final void m269Z() {
        this.f484Code[46] = 1;
    }

    /* access modifiers changed from: package-private */
    public final void Z(int i) {
        this.I = i;
    }

    /* renamed from: Z  reason: collision with other method in class */
    public final boolean m270Z() {
        return this.f482Code;
    }

    public final int a() {
        return this.C;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        e.Code(this, false);
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.f487I, 0, 1) < 0) {
            return -1;
        }
        return this.f487I[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        do {
            this.J = i;
            this.B = i2;
            this.f483Code = bArr;
            e.Code((Object) this);
            while (!this.f482Code) {
                e eVar = this.f479Code;
                if (eVar != null) {
                    eVar.m227Code(this);
                }
                if (this.f483Code != null) {
                    e.Code((Object) this, 1000);
                }
            }
            if (this.f486I) {
                return -1;
            }
            throw new IOException();
        } while (this.B == 0);
        return this.B;
    }
}
