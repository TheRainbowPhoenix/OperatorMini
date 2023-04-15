package p000;

import java.io.ByteArrayOutputStream;

/* renamed from: q */
public final class BufferedByteArrOutStream extends ByteArrayOutputStream {
    public BufferedByteArrOutStream() {
    }

    public BufferedByteArrOutStream(int i) {
        super(i);
    }

    /* renamed from: a */
    public final byte[] get_buffer() {
        return ((ByteArrayOutputStream) this).buf;
    }
}
