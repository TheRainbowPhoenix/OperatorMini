package com.opera.browser;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class m_reader {
    public int maybe_size;  // a
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public byte a;
    public int i;
    public int j;
    public int k;
    public int l;
    public String read_utf_string; // a
    private n_DataInputStream n_das = new n_DataInputStream(); // a
    public boolean a_bool = true;
    private DataInputStream das;
    private InputStream inputStream; // a
    private byte[] a_byte_arr = new byte[4];
    private byte[] large_bytes_buff = new byte[1536]; // b
    private boolean b_bool = false;

    public m_reader(InputStream var1, boolean read_first_byte) throws IOException {
        this.inputStream = var1;
        this.das = new DataInputStream(var1);
        if (read_first_byte) {
            this.maybe_size = this.das.readUnsignedByte();
        }

    }

    public final void a_read_obml() throws IOException {
        this.c = this.das.readInt(); // 4
        this.d = this.das.readUnsignedShort();  // 2
        this.das.readUnsignedShort();  // 2
        this.f = this.das.readUnsignedShort();  // 2
        this.g = this.das.readUnsignedShort();  // 2
        this.das.readUnsignedShort();  // 2
        this.das.readInt(); // 4
        this.i = this.das.readUnsignedShort();  // 2
        this.k = this.das.readUnsignedShort();  // 2
        this.e = this.das.readUnsignedShort();  // 2
        this.das.readUnsignedShort();  // 2
        this.j = this.das.readUnsignedShort();  // 2
        if (this.maybe_size > 4) {
            this.h = this.das.readUnsignedShort();  // 2
        }

        if (this.maybe_size > 5) {
            this.maybe_size = this.das.readByte(); // 1  TODO: this.a is unsure here
        }

        if (this.maybe_size > 12) {
            this.l = this.das.readUnsignedShort(); // 2
        } else {
            this.l = 65535; // USHRT_MAX
        }

        if (this.maybe_size > 19) {
            this.das.readUnsignedShort(); // 2
        }

        this.read_utf_string = this.das.readUTF(); // STR : Title ?
    }

    private int a_return_int(char[] var1) throws IOException {
        int var2 = this.das.readUnsignedShort();
        this.das.readFully(this.large_bytes_buff, 0, var2);
//        return k.a(this.b, 0, var2, var1, 0);
        return 0; // TODO
    }

    public final n_DataInputStream a_read_das() throws IOException {
        this.n_das.create();
        boolean var1 = false;

        char var9;
        try {
            var9 = (char)this.das.readUnsignedByte();
            this.n_das.a_char = var9;
        } catch (IOException var8) {
            this.a_bool = false;
            return this.n_das;
        }

//        this.n_das.a = this.a; // TODO ??
        int var4;
        int var5;
        int var6;
        switch(var9) {
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case ',':
            case '-':
            case '.':
            case '/':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case ':':
            case ';':
            case '<':
            case '=':
            case '>':
            case '?':
            case '@':
            case 'B':
            case 'E':
            case 'G':
            case 'H':
            case 'U':
            case 'V':
            case 'Z':
            case '[':
            case ']':
            case '^':
            case '_':
            case '`':
            case 'd':
            case 'f':
            case 'g':
            case 'j':
            case 'l':
            case 'n':
            case 'q':
            case 'v':
            case 'w':
            default:
                break;
            case '+':
//                this.a();
                this.n_das.c_bool = true;
                break;
            case '0':
                this.n_das.c_int = this.das.readUnsignedByte();
                break;
            case '1':
                this.b = this.das.readInt();
//                this.a = new b(this.a, 512);
                this.das = new DataInputStream(this.inputStream);
                break;
            case '2':
            case '3':
                this.b = this.das.readInt();
                break;
            case 'A':
                this.n_das.b_string = this.das.readUTF();
                break;
            case 'C':
                this.b_bool = true;
                break;
            case 'D':
            case 'R':
                this.n_das.a_int = (short)this.das.readUnsignedShort();
                break;
            case 'F':
                this.n_das.c_string = this.das.readUTF();
                this.n_das.f_int = this.das.readUnsignedByte();
                this.n_das.d_string = this.das.readUTF();
                if (this.n_das.d_string != null && this.n_das.d_string.length() == 0) {
                    this.n_das.d_string = null;
                }
                break;
            case 'I':
                // COLOR ?
                var4 = this.das.readUnsignedShort();
                var5 = this.das.readUnsignedShort();
                var6 = this.das.readUnsignedShort();
//                this.n_das.b = this.a(this.n_das.a);
                this.n_das.d_int = var4;
                this.n_das.e_int = var5;
                this.n_das.a_int = var6;
                break;
            case 'J':
                this.n_das.d_int = this.das.readUnsignedShort();
                this.n_das.e_int = this.das.readUnsignedShort();
                break;
            case 'K':
                this.n_das.d_int = this.das.readUnsignedShort();
                this.n_das.e_int = this.das.readUnsignedShort();
                this.n_das.b_short = (short)this.das.readUnsignedShort();
                break;
            case 'L':
            case 'P':
            case 'T':
            case 'W':
            case 'm':
//                this.n_das.b = this.a(this.n_das.a);
                break;
            case 'M':
                this.n_das.a_string = this.das.readUTF();
                this.n_das.a_string = this.das.readUTF();
                break;
            case 'N':
                this.n_das.a_string = this.das.readUTF();
                break;
            case 'O':
                this.n_das.b_char = (char)this.das.readUnsignedShort();
                this.das.readUnsignedShort();
                this.das.readUnsignedShort();
                break;
            case 'Q':
                this.a_bool = false;
                break;
            case 'S':
                this.das.readFully(this.a_byte_arr);
//                this.n_das.a = this.a;
                break;
            case 'X':
                var4 = this.das.readUnsignedByte();
                var5 = this.das.readUnsignedByte();
                var6 = this.das.readUnsignedShort();
                this.n_das.d_int = var4;
                this.n_das.e_int = var5;
                this.n_das.a_int = var6;
                break;
            case 'Y':
                this.n_das.b_short = (short)this.das.readUnsignedByte();
                break;
            case '\\':
                this.das.readUnsignedShort();
                int var3 = this.das.readUnsignedShort();
//                if (this.n_das.skipBytes(var3) < var3) {
//                    throw new IOException("couldn't skip " + var3 + " bytes when parsing extension");
//                }
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
//                this.n_das.b = this.b;
                switch(var9) {
                    case 'a':
                    case 'b':
                    case 'e':
                    case 'h':
                    case 'i':
                    case 'p':
                    case 'u':
                    case 'x':
                        this.n_das.e_string = this.das.readUTF();
                        this.n_das.f_string = this.das.readUTF();
                        break;
                    case 'c':
                    case 'r':
                        this.n_das.e_string = this.das.readUTF();
                        this.n_das.f_string = this.das.readUTF();
                        this.n_das.a_bool = this.das.readByte() != 0;
                    case 'd':
                    case 'f':
                    case 'g':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'q':
                    case 't':
                    case 'v':
                    case 'w':
                    default:
                        break;
                    case 'o':
                        this.n_das.e_string = this.das.readUTF();
                        this.n_das.f_string = this.das.readUTF();
                        this.n_das.a_bool = this.das.readByte() != 0;
                        break;
                    case 's':
                        this.n_das.e_string = this.das.readUTF();
                        this.n_das.a_bool = this.das.readByte() != 0;
                        this.n_das.c_short = this.das.readShort();
                }

                this.b_bool = false;
                break;
            case 'k':
                // Read String !
                this.n_das.b_char = (char)this.das.readUnsignedByte();
                this.n_das.a_string = this.das.readUTF();
                break;
            case 't':
                this.n_das.a_int = this.das.readInt();
                break;
            case 'y':
                this.n_das.b_short = (short)this.das.readUnsignedShort();
        }

        return this.n_das;
    }
}
