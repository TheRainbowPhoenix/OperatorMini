package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: f */
public final class C0005f extends InputStream {

    /* renamed from: a */
    public int f81a;

    /* renamed from: a */
    private InputStream f82a;

    /* renamed from: a */
    private byte[] f83a = new byte[512];

    /* renamed from: b */
    private int f84b = 0;

    /* renamed from: c */
    private int f85c;

    public C0005f(InputStream inputStream) throws IOException {
        this.f82a = inputStream;
        this.f81a = 0;
    }

    /* renamed from: a */
    private void m35a() throws IOException {
        this.f85c = 0;
        this.f84b = this.f82a.read(this.f83a, 0, 512);
        if (this.f84b > 0) {
            this.f81a += this.f84b;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() throws IOException {
        this.f82a.close();
    }

    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f84b < 1) {
            m35a();
            if (this.f84b < 0) {
                return -1;
            }
        }
        this.f84b--;
        byte[] bArr = this.f83a;
        int i = this.f85c;
        this.f85c = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (this.f84b > 0) {
            i3 = Math.min(this.f84b, i2);
            System.arraycopy(this.f83a, this.f85c, bArr, i, i3);
            this.f84b -= i3;
            this.f85c += i3;
            i += i3;
            i2 -= i3;
        }
        while (i2 > 0) {
            int read = this.f82a.read(bArr, i, i2);
            if (read >= 0) {
                this.f81a += read;
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
