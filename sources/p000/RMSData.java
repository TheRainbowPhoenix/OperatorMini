package p000;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: m */
public final class RMSData {

    /* renamed from: a */
    public byte f216a;

    /* renamed from: a */
    public int first_byte;

    /* renamed from: a */
    private DataInputStream data_is;

    /* renamed from: a */
    private InputStream input_stream;

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
    public int buff_size;

    /* renamed from: d */
    public int images_count;

    /* renamed from: e */
    public int f229e;

    /* renamed from: f */
    public int forms_count;

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

    public RMSData(InputStream inputStream, boolean z) throws IOException {
        this.input_stream = inputStream;
        this.data_is = new DataInputStream(inputStream);
        if (z) {
            this.first_byte = this.data_is.readUnsignedByte();
        }
    }

    /* renamed from: a */
    private int m129a(char[] cArr) throws IOException {
        int readUnsignedShort = this.data_is.readUnsignedShort();
        this.data_is.readFully(this.f226b, 0, readUnsignedShort);
        return DrawingUtils.m58a(this.f226b, 0, readUnsignedShort, cArr, 0);
    }

    /* renamed from: a */
    public final C0013n parse() throws IOException {
        boolean z = true;
        this.f221a.mo30a();
        try {
            char readUnsignedByte = (char) this.data_is.readUnsignedByte();
            this.f221a.field_type = readUnsignedByte;
            this.f221a.f239a = this.data_is;
            switch (readUnsignedByte) {
                case '+':
                    parse();
                    this.f221a.f253c = true;
                    break;
                case '0':
                    this.f221a.f250c = this.data_is.readUnsignedByte();
                    break;
                case '1':
                    this.f224b = this.data_is.readInt();
                    this.input_stream = new GZIPInputStream(this.input_stream, 512);
                    this.data_is = new DataInputStream(this.input_stream);
                    break;
                case '2':
                case '3':
                    this.f224b = this.data_is.readInt();
                    break;
                case 'A':
                    this.f221a.f247b = this.data_is.readUTF();
                    break;
                case 'C':
                    this.f225b = true;
                    break;
                case 'D':
                case 'R':
                    this.f221a.f241a = (short) this.data_is.readUnsignedShort();
                    break;
                case 'F':
                    this.f221a.f251c = this.data_is.readUTF();
                    this.f221a.f258f = this.data_is.readUnsignedByte();
                    this.f221a.f255d = this.data_is.readUTF();
                    if (this.f221a.f255d != null && this.f221a.f255d.length() == 0) {
                        this.f221a.f255d = null;
                        break;
                    }
                case 'I':
                    int readUnsignedShort = this.data_is.readUnsignedShort();
                    int readUnsignedShort2 = this.data_is.readUnsignedShort();
                    int readUnsignedShort3 = this.data_is.readUnsignedShort();
                    this.f221a.f246b = m129a(this.f221a.f244a);
                    this.f221a.f254d = readUnsignedShort;
                    this.f221a.f256e = readUnsignedShort2;
                    this.f221a.f238a = readUnsignedShort3;
                    break;
                case 'J':
                    this.f221a.f254d = this.data_is.readUnsignedShort();
                    this.f221a.f256e = this.data_is.readUnsignedShort();
                    break;
                case 'K':
                    this.f221a.f254d = this.data_is.readUnsignedShort();
                    this.f221a.f256e = this.data_is.readUnsignedShort();
                    this.f221a.f248b = (short) this.data_is.readUnsignedShort();
                    break;
                case 'L':
                case 'P':
                case 'T':
                case 'W':
                case 'm':
                    this.f221a.f246b = m129a(this.f221a.f244a);
                    break;
                case 'M':
                    this.f221a.f247b = this.data_is.readUTF();
                    this.f221a.f240a = this.data_is.readUTF();
                    break;
                case 'N':
                    this.f221a.f240a = this.data_is.readUTF();
                    break;
                case 'O':
                    this.f221a.f245b = (char) this.data_is.readUnsignedShort();
                    this.data_is.readUnsignedShort();
                    this.data_is.readUnsignedShort();
                    break;
                case 'Q':
                    this.f222a = false;
                    break;
                case 'S':
                    this.data_is.readFully(this.f223a);
                    this.f221a.f243a = this.f223a;
                    break;
                case 'X':
                    int readUnsignedByte2 = this.data_is.readUnsignedByte();
                    int readUnsignedByte3 = this.data_is.readUnsignedByte();
                    int readUnsignedShort4 = this.data_is.readUnsignedShort();
                    this.f221a.f254d = readUnsignedByte2;
                    this.f221a.f256e = readUnsignedByte3;
                    this.f221a.f238a = readUnsignedShort4;
                    break;
                case 'Y':
                    this.f221a.f248b = (short) this.data_is.readUnsignedByte();
                    break;
                case '\\':
                    this.data_is.readUnsignedShort();
                    int readUnsignedShort5 = this.data_is.readUnsignedShort();
                    if (this.data_is.skipBytes(readUnsignedShort5) < readUnsignedShort5) {
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
                            this.f221a.f257e = this.data_is.readUTF();
                            this.f221a.f259f = this.data_is.readUTF();
                            break;
                        case 'c':
                        case 'r':
                            this.f221a.f257e = this.data_is.readUTF();
                            this.f221a.f259f = this.data_is.readUTF();
                            C0013n nVar = this.f221a;
                            if (this.data_is.readByte() == 0) {
                                z = false;
                            }
                            nVar.f242a = z;
                            break;
                        case 'o':
                            this.f221a.f257e = this.data_is.readUTF();
                            this.f221a.f259f = this.data_is.readUTF();
                            C0013n nVar2 = this.f221a;
                            if (this.data_is.readByte() == 0) {
                                z = false;
                            }
                            nVar2.f242a = z;
                            break;
                        case 's':
                            this.f221a.f257e = this.data_is.readUTF();
                            C0013n nVar3 = this.f221a;
                            if (this.data_is.readByte() == 0) {
                                z = false;
                            }
                            nVar3.f242a = z;
                            this.f221a.f252c = this.data_is.readShort();
                            break;
                    }
                    this.f225b = false;
                    break;
                case 'k':
                    this.f221a.f245b = (char) this.data_is.readUnsignedByte();
                    this.f221a.f240a = this.data_is.readUTF();
                    break;
                case 't':
                    this.f221a.f238a = this.data_is.readInt();
                    break;
                case 'y':
                    this.f221a.f248b = (short) this.data_is.readUnsignedShort();
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
        this.buff_size = this.data_is.readInt();
        this.images_count = this.data_is.readUnsignedShort();
        this.data_is.readUnsignedShort();
        this.forms_count = this.data_is.readUnsignedShort();
        this.f231g = this.data_is.readUnsignedShort();
        this.data_is.readUnsignedShort();
        this.data_is.readInt();
        this.f233i = this.data_is.readUnsignedShort();
        this.f235k = this.data_is.readUnsignedShort();
        this.f229e = this.data_is.readUnsignedShort();
        this.data_is.readUnsignedShort();
        this.f234j = this.data_is.readUnsignedShort();
        if (this.first_byte > 4) {
            this.f232h = this.data_is.readUnsignedShort();
        }
        if (this.first_byte > 5) {
            this.f216a = this.data_is.readByte();
        }
        if (this.first_byte > 12) {
            this.f236l = this.data_is.readUnsignedShort();
        } else {
            this.f236l = 65535;
        }
        if (this.first_byte > 19) {
            this.data_is.readUnsignedShort();
        }
        this.f220a = this.data_is.readUTF();
    }
}
