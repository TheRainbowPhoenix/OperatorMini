package p000;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: m */
public final class C0012m {

    /* renamed from: a */
    public byte f216a;

    /* renamed from: a */
    public int f217a;

    /* renamed from: a */
    private DataInputStream f218a;

    /* renamed from: a */
    private InputStream f219a;

    /* renamed from: a */
    public String f220a;

    /* renamed from: a */
    private C0013n f221a = new C0013n();

    /* renamed from: a */
    public boolean f222a = true;

    /* renamed from: a */
    private byte[] f223a = new byte[4];

    /* renamed from: b */
    public int f224b;

    /* renamed from: b */
    private boolean f225b = false;

    /* renamed from: b */
    private byte[] f226b = new byte[1536];

    /* renamed from: c */
    public int f227c;

    /* renamed from: d */
    public int f228d;

    /* renamed from: e */
    public int f229e;

    /* renamed from: f */
    public int f230f;

    /* renamed from: g */
    public int f231g;

    /* renamed from: h */
    public int f232h;

    /* renamed from: i */
    public int f233i;

    /* renamed from: j */
    public int f234j;

    /* renamed from: k */
    public int f235k;

    /* renamed from: l */
    public int f236l;

    public C0012m(InputStream inputStream, boolean z) throws IOException {
        this.f219a = inputStream;
        this.f218a = new DataInputStream(inputStream);
        if (z) {
            this.f217a = this.f218a.readUnsignedByte();
        }
    }

    /* renamed from: a */
    private int m129a(char[] cArr) throws IOException {
        int readUnsignedShort = this.f218a.readUnsignedShort();
        this.f218a.readFully(this.f226b, 0, readUnsignedShort);
        return C0010k.m58a(this.f226b, 0, readUnsignedShort, cArr, 0);
    }

    /* renamed from: a */
    public final C0013n mo29a() throws IOException {
        boolean z = true;
        this.f221a.mo30a();
        try {
            char readUnsignedByte = (char) this.f218a.readUnsignedByte();
            this.f221a.f237a = readUnsignedByte;
            this.f221a.f239a = this.f218a;
            switch (readUnsignedByte) {
                case '+':
                    mo29a();
                    this.f221a.f253c = true;
                    break;
                case '0':
                    this.f221a.f250c = this.f218a.readUnsignedByte();
                    break;
                case '1':
                    this.f224b = this.f218a.readInt();
                    this.f219a = new C0001b(this.f219a, 512);
                    this.f218a = new DataInputStream(this.f219a);
                    break;
                case '2':
                case '3':
                    this.f224b = this.f218a.readInt();
                    break;
                case 'A':
                    this.f221a.f247b = this.f218a.readUTF();
                    break;
                case 'C':
                    this.f225b = true;
                    break;
                case 'D':
                case 'R':
                    this.f221a.f241a = (short) this.f218a.readUnsignedShort();
                    break;
                case 'F':
                    this.f221a.f251c = this.f218a.readUTF();
                    this.f221a.f258f = this.f218a.readUnsignedByte();
                    this.f221a.f255d = this.f218a.readUTF();
                    if (this.f221a.f255d != null && this.f221a.f255d.length() == 0) {
                        this.f221a.f255d = null;
                        break;
                    }
                case 'I':
                    int readUnsignedShort = this.f218a.readUnsignedShort();
                    int readUnsignedShort2 = this.f218a.readUnsignedShort();
                    int readUnsignedShort3 = this.f218a.readUnsignedShort();
                    this.f221a.f246b = m129a(this.f221a.f244a);
                    this.f221a.f254d = readUnsignedShort;
                    this.f221a.f256e = readUnsignedShort2;
                    this.f221a.f238a = readUnsignedShort3;
                    break;
                case 'J':
                    this.f221a.f254d = this.f218a.readUnsignedShort();
                    this.f221a.f256e = this.f218a.readUnsignedShort();
                    break;
                case 'K':
                    this.f221a.f254d = this.f218a.readUnsignedShort();
                    this.f221a.f256e = this.f218a.readUnsignedShort();
                    this.f221a.f248b = (short) this.f218a.readUnsignedShort();
                    break;
                case 'L':
                case 'P':
                case 'T':
                case 'W':
                case 'm':
                    this.f221a.f246b = m129a(this.f221a.f244a);
                    break;
                case 'M':
                    this.f221a.f247b = this.f218a.readUTF();
                    this.f221a.f240a = this.f218a.readUTF();
                    break;
                case 'N':
                    this.f221a.f240a = this.f218a.readUTF();
                    break;
                case 'O':
                    this.f221a.f245b = (char) this.f218a.readUnsignedShort();
                    this.f218a.readUnsignedShort();
                    this.f218a.readUnsignedShort();
                    break;
                case 'Q':
                    this.f222a = false;
                    break;
                case 'S':
                    this.f218a.readFully(this.f223a);
                    this.f221a.f243a = this.f223a;
                    break;
                case 'X':
                    int readUnsignedByte2 = this.f218a.readUnsignedByte();
                    int readUnsignedByte3 = this.f218a.readUnsignedByte();
                    int readUnsignedShort4 = this.f218a.readUnsignedShort();
                    this.f221a.f254d = readUnsignedByte2;
                    this.f221a.f256e = readUnsignedByte3;
                    this.f221a.f238a = readUnsignedShort4;
                    break;
                case 'Y':
                    this.f221a.f248b = (short) this.f218a.readUnsignedByte();
                    break;
                case '\\':
                    this.f218a.readUnsignedShort();
                    int readUnsignedShort5 = this.f218a.readUnsignedShort();
                    if (this.f218a.skipBytes(readUnsignedShort5) < readUnsignedShort5) {
                        throw new IOException(new StringBuffer().append("couldn't skip ").append(readUnsignedShort5).append(" bytes when parsing extension").toString());
                    }
                    break;
                case 'a':
                case 'b':
                case 'c':
                case 'e':
                case 'h':
                case 'i':
                case 'o':
                case 'p':
                case 'r':
                case 's':
                case 'u':
                case 'x':
                    this.f221a.f249b = this.f225b;
                    switch (readUnsignedByte) {
                        case 'a':
                        case 'b':
                        case 'e':
                        case 'h':
                        case 'i':
                        case 'p':
                        case 'u':
                        case 'x':
                            this.f221a.f257e = this.f218a.readUTF();
                            this.f221a.f259f = this.f218a.readUTF();
                            break;
                        case 'c':
                        case 'r':
                            this.f221a.f257e = this.f218a.readUTF();
                            this.f221a.f259f = this.f218a.readUTF();
                            C0013n nVar = this.f221a;
                            if (this.f218a.readByte() == 0) {
                                z = false;
                            }
                            nVar.f242a = z;
                            break;
                        case 'o':
                            this.f221a.f257e = this.f218a.readUTF();
                            this.f221a.f259f = this.f218a.readUTF();
                            C0013n nVar2 = this.f221a;
                            if (this.f218a.readByte() == 0) {
                                z = false;
                            }
                            nVar2.f242a = z;
                            break;
                        case 's':
                            this.f221a.f257e = this.f218a.readUTF();
                            C0013n nVar3 = this.f221a;
                            if (this.f218a.readByte() == 0) {
                                z = false;
                            }
                            nVar3.f242a = z;
                            this.f221a.f252c = this.f218a.readShort();
                            break;
                    }
                    this.f225b = false;
                    break;
                case 'k':
                    this.f221a.f245b = (char) this.f218a.readUnsignedByte();
                    this.f221a.f240a = this.f218a.readUTF();
                    break;
                case 't':
                    this.f221a.f238a = this.f218a.readInt();
                    break;
                case 'y':
                    this.f221a.f248b = (short) this.f218a.readUnsignedShort();
                    break;
            }
            return this.f221a;
        } catch (IOException e) {
            this.f222a = false;
            return this.f221a;
        }
    }

    /* renamed from: a */
    public final void m131a() throws IOException {
        this.f227c = this.f218a.readInt();
        this.f228d = this.f218a.readUnsignedShort();
        this.f218a.readUnsignedShort();
        this.f230f = this.f218a.readUnsignedShort();
        this.f231g = this.f218a.readUnsignedShort();
        this.f218a.readUnsignedShort();
        this.f218a.readInt();
        this.f233i = this.f218a.readUnsignedShort();
        this.f235k = this.f218a.readUnsignedShort();
        this.f229e = this.f218a.readUnsignedShort();
        this.f218a.readUnsignedShort();
        this.f234j = this.f218a.readUnsignedShort();
        if (this.f217a > 4) {
            this.f232h = this.f218a.readUnsignedShort();
        }
        if (this.f217a > 5) {
            this.f216a = this.f218a.readByte();
        }
        if (this.f217a > 12) {
            this.f236l = this.f218a.readUnsignedShort();
        } else {
            this.f236l = 65535;
        }
        if (this.f217a > 19) {
            this.f218a.readUnsignedShort();
        }
        this.f220a = this.f218a.readUTF();
    }
}
