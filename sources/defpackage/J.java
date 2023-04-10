package defpackage;

import java.io.ByteArrayOutputStream;

/* access modifiers changed from: package-private */
/* renamed from: J  reason: default package */
public final class J extends ByteArrayOutputStream {
    J() {
    }

    J(int i) {
        super(i);
    }

    /* access modifiers changed from: package-private */
    public final void Code(int i) {
        ((ByteArrayOutputStream) this).count = i;
    }

    /* access modifiers changed from: package-private */
    public final byte[] Code() {
        return ((ByteArrayOutputStream) this).buf;
    }
}
