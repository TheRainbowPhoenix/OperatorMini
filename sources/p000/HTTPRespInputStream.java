package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: f */
public final class HTTPRespInputStream extends InputStream {

    /* renamed from: a */
    public int read_index;

    /* renamed from: a */
    private InputStream input_stream;

    /* renamed from: a */
    private byte[] buffer = new byte[512];

    /* renamed from: b */
    private int unread_size = 0;

    /* renamed from: c */
    private int f85c;

    public HTTPRespInputStream(InputStream inputStream) throws IOException {
        this.input_stream = inputStream;
        this.read_index = 0;
    }

    /* renamed from: a */
    private void readChunk() throws IOException {
        this.f85c = 0;
        this.unread_size = this.input_stream.read(this.buffer, 0, 512);
        if (this.unread_size > 0) {
            this.read_index += this.unread_size;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() throws IOException {
        this.input_stream.close();
    }

    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.unread_size < 1) {
            readChunk();
            if (this.unread_size < 0) {
                return -1;
            }
        }
        this.unread_size--;
        byte[] bArr = this.buffer;
        int i = this.f85c;
        this.f85c = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (this.unread_size > 0) {
            i3 = Math.min(this.unread_size, i2);
            System.arraycopy(this.buffer, this.f85c, bArr, i, i3);
            this.unread_size -= i3;
            this.f85c += i3;
            i += i3;
            i2 -= i3;
        }
        while (i2 > 0) {
            int read = this.input_stream.read(bArr, i, i2);
            if (read >= 0) {
                this.read_index += read;
                i3 += read;
                i += read;
                i2 -= read;
            } else if (i3 == 0) {
                return -1;
            } else {
                return i3;
            }
        }
        return i3;
    }
}
