package p000;

import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.UTFDataFormatException;
import java.io.UnsupportedEncodingException;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/* renamed from: u */
public final class RunnableC0020u extends OutputStream implements Runnable {

    /* renamed from: a */
    private static char[] f432a = new char[512];

    /* renamed from: b */
    public static byte[] f433b = null;

    /* renamed from: c */
    public static final String f434c = new StringBuffer().append("Opera Mini hifi").append("norrisbrage".length() > 0 ? " " : "").append("norrisbrage").append("us".length() > 0 ? " " : "").append("us").append(" v. ").append("1.2.2960").append(", built ").append("20060124").toString();

    /* renamed from: g */
    private static String f435g = "";

    /* renamed from: a */
    private byte f436a;

    /* renamed from: a */
    public int f437a;

    /* renamed from: a */
    private long f438a;

    /* renamed from: a */
    private C0002c f439a;

    /* renamed from: a */
    private C0005f f440a;

    /* renamed from: a */
    private DataOutputStream f441a;

    /* renamed from: a */
    private InputStream f442a;

    /* renamed from: a */
    public String f443a;

    /* renamed from: a */
    private HttpConnection f444a;

    /* renamed from: a */
    public Image f445a = null;

    /* renamed from: a */
    private C0014o f446a;

    /* renamed from: a */
    private Window f447a;

    /* renamed from: a */
    private C0016q f448a;

    /* renamed from: a */
    public C0017r f449a = RunnableC0018s.f372s;

    /* renamed from: a */
    private RunnableC0018s f450a;

    /* renamed from: a */
    public short f451a;

    /* renamed from: a */
    public boolean f452a;

    /* renamed from: a */
    public byte[] f453a = null;

    /* renamed from: a */
    public int[] f454a;

    /* renamed from: a */
    public C0002c[] f455a;

    /* renamed from: a */
    public Object[] f456a = new Object[5];

    /* renamed from: a */
    public String[] f457a;

    /* renamed from: a */
    public Image[] f458a;

    /* renamed from: a */
    public C0014o[] f459a;

    /* renamed from: a */
    public short[] f460a;

    /* renamed from: b */
    public int width;

    /* renamed from: b */
    public String f462b;

    /* renamed from: b */
    public C0017r f463b = RunnableC0018s.f372s;

    /* renamed from: b */
    private short f464b = -1;

    /* renamed from: b */
    public boolean f465b;

    /* renamed from: b */
    public int[] f466b;

    /* renamed from: b */
    public short[] f467b;

    /* renamed from: c */
    public int f468c = 0;

    /* renamed from: c */
    private short f469c;

    /* renamed from: c */
    public boolean f470c;

    /* renamed from: c */
    private byte[] f471c;

    /* renamed from: c */
    public int[] f472c;

    /* renamed from: c */
    public short[] f473c;

    /* renamed from: d */
    public int f474d;

    /* renamed from: d */
    private String f475d;

    /* renamed from: d */
    private short f476d;

    /* renamed from: d */
    public boolean f477d;

    /* renamed from: d */
    public int[] f478d;

    /* renamed from: d */
    public short[] f479d;

    /* renamed from: e */
    public int f480e;

    /* renamed from: e */
    private String f481e;

    /* renamed from: e */
    private short f482e;

    /* renamed from: e */
    public boolean f483e = false;

    /* renamed from: e */
    private int[] f484e;

    /* renamed from: e */
    public short[] f485e;

    /* renamed from: f */
    public int f486f;

    /* renamed from: f */
    private String f487f;

    /* renamed from: f */
    public boolean f488f = false;

    /* renamed from: f */
    private int[] f489f;

    /* renamed from: f */
    public short[] f490f;

    /* renamed from: g */
    public int f491g;

    /* renamed from: g */
    public boolean f492g = false;

    /* renamed from: g */
    private int[] f493g = new int[20];

    /* renamed from: h */
    public int f494h = 0;

    /* renamed from: h */
    private String f495h = null;

    /* renamed from: h */
    public boolean f496h = false;

    /* renamed from: i */
    public int f497i;

    /* renamed from: i */
    public boolean f498i = false;

    /* renamed from: j */
    public int f499j;

    /* renamed from: j */
    public boolean f500j = false;

    /* renamed from: k */
    public int f501k = 0;

    /* renamed from: k */
    public boolean f502k = false;

    /* renamed from: l */
    public int f503l;

    /* renamed from: l */
    public boolean f504l = false;

    /* renamed from: m */
    private int f505m = 0;

    /* renamed from: m */
    public boolean f506m = false;

    /* renamed from: n */
    private int f507n = -1;

    /* renamed from: n */
    public boolean f508n = false;

    /* renamed from: o */
    private int f509o;

    /* renamed from: o */
    public boolean f510o;

    /* renamed from: p */
    private int f511p = 0;

    /* renamed from: p */
    public boolean f512p;

    /* renamed from: q */
    private int f513q;

    /* renamed from: q */
    public boolean f514q;

    /* renamed from: r */
    private int f515r;

    /* renamed from: r */
    private boolean f516r = false;

    /* renamed from: s */
    private int f517s;

    /* renamed from: s */
    private boolean f518s;

    /* renamed from: t */
    private int f519t;

    /* renamed from: t */
    private boolean f520t;

    /* renamed from: u */
    private int f521u = -1;

    /* renamed from: v */
    private int f522v;

    /* renamed from: w */
    private int f523w = 0;

    /* renamed from: x */
    private int f524x = -1;

    /* renamed from: y */
    private int f525y;

    public RunnableC0020u(RunnableC0018s sVar, Window pVar, String str, String str2, String str3) {
        mo103e(8);
        this.f450a = sVar;
        this.f447a = pVar;
        m279b(str);
        this.f452a = false;
        this.f442a = null;
        this.f462b = str2;
        this.f510o = true;
        this.f456a[0] = str;
        this.f456a[3] = str3;
        this.f522v = ((pVar.f331q - pVar.f329o) - pVar.f330p) - 6;
        this.f514q = false;
    }

    /* renamed from: a */
    private static int m246a(int i, int i2, int i3) {
        return ((i * i2) + ((255 - i) * i3)) >> 8;
    }

    /* renamed from: a */
    public static int m247a(short s) {
        int i = s >> 5;
        return ((((s & 31) * 255) / 31) << 16) | ((((i & 63) * 255) / 63) << 8) | ((((i >> 6) & 31) * 255) / 31);
    }

    /* renamed from: a */
    private int m248a(char[] cArr, int i, int i2) {
        if (this.f439a == null || this.f439a.f65a == null) {
            return 0;
        }
        return C0010k.m57a(this.f439a.f65a, cArr, i, i2, this.f492g);
    }

    /* renamed from: a */
    private static int m249a(int[] iArr, int i, int i2) {
        int i3 = -1;
        while (i - i3 > 1) {
            int i4 = (i + i3) / 2;
            if (iArr[i4] > i2) {
                i = i4;
            } else {
                i3 = i4;
            }
        }
        if (i3 == -1 || iArr[i3] != i2) {
            return -1;
        }
        return i3;
    }

    /* renamed from: a */
    private static C0002c m250a(byte[] bArr) {
        int i = 1;
        byte b = bArr[0];
        short a = C0010k.m74a(bArr, 1);
        int i2 = (b & 64) != 0 ? 32 : 64;
        int i3 = C0010k.f176d;
        int i4 = (b & 1) != 0 ? 2 : 0;
        if ((b & 2) != 0) {
            i4 |= 1;
        }
        if ((b & 16) == 0) {
            i = (b & 32) != 0 ? 2 : 0;
        }
        return new C0002c(i2, i4, i3, m247a(a), i);
    }

    /* renamed from: a */
    public static String m251a(C0014o[] oVarArr, C0014o oVar) {
        String str = "";
        boolean z = true;
        for (C0014o oVar2 : oVarArr) {
            if (oVar2 != null && ((oVar == null || oVar2.f280e == oVar.f280e) && ((!(oVar2.f262a == 'b' || oVar2.f262a == 'u' || oVar2.f262a == 'e' || oVar2.f262a == 'i') || oVar2 == oVar) && ((oVar2.f262a != 'c' || oVar2.f267a) && (oVar2.f262a != 'r' || oVar2.f267a))))) {
                if (!z) {
                    str = new StringBuffer().append(str).append("&").toString();
                }
                str = new StringBuffer().append(str).append(oVar2.mo38b()).toString();
                z = false;
            }
        }
        return str;
    }

    /* renamed from: a */
    private C0012m mo90a() throws IOException {
        if (this.f450a.f386a != null) {
            return new C0012m(new ByteArrayInputStream(this.f450a.f386a.mo57a(), 0, this.f450a.f386a.mo57a().length), true);
        }
        return null;
    }

    /* renamed from: a */
    private static C0012m mo91a(int i) throws RecordStoreException, IOException {
        if (i < 0 || i > 65536) {
            throw new IllegalArgumentException(new StringBuffer().append("Id out-of-range (0-65536) when loading document from RMS: ").append(i).toString());
        }
        RecordStore openRecordStore = RecordStore.openRecordStore("d", false);
        byte[] record = openRecordStore.getRecord(1);
        openRecordStore.closeRecordStore();
        if (record != null) {
            return new C0012m(new ByteArrayInputStream(record), true);
        }
        throw new IOException("prob. reading id 1 from rms.");
    }

    /* renamed from: a */
    private static C0012m mo94a(String str) throws IOException {
        InputStream a = C0010k.m61a(str);
        if (a == null) {
            return null;
        }
        return new C0012m(a, true);
    }

    /* renamed from: a */
    private C0012m m255a(Object[] objArr) throws IOException {
        return m256a(objArr, -1);
    }

    /* renamed from: a */
    private C0012m m256a(Object[] objArr, int i) throws IOException {
        byte[] bArr = null;
        int i2 = 1;
        byte b = 0;
        this.f499j = 2;
        this.f449a = RunnableC0018s.f367n;
        this.f463b = RunnableC0018s.f352d;
        String d = m354d();
        if (d != null) {
            int indexOf = d.indexOf("i=");
            int indexOf2 = d.indexOf("t=");
            int indexOf3 = d.indexOf("u=");
            int indexOf4 = d.indexOf("f=");
            if (indexOf != -1) {
                indexOf = Integer.parseInt(d.substring(indexOf + 2, indexOf2 - 1));
            }
            String substring = d.substring(indexOf2 + 2, indexOf3 - 1);
            String substring2 = d.substring(indexOf3 + 2, indexOf4 == -1 ? d.length() : indexOf4 - 1);
            boolean z = indexOf4 != -1;
            String a = C0010k.m65a(substring, true, false);
            String a2 = C0010k.m65a(substring2, true, false);
            if (a2 == null || a2.length() == 0) {
                this.f450a.mo69b("notice", C0010k.m62a(98), C0010k.m62a(97));
            } else {
                if (a == null || a.length() == 0) {
                    a = "<no title>";
                }
                Object[] objArr2 = new Object[4];
                objArr2[0] = a2;
                objArr2[1] = a;
                objArr2[2] = f433b;
                if (z) {
                    b = 1;
                }
                objArr2[3] = new Byte(b);
                f433b = null;
                if (C0010k.f159a == null) {
                    C0010k.m118d();
                }
                if (indexOf != -1) {
                    C0010k.m92a(objArr2, indexOf, true);
                } else {
                    C0010k.m93a(objArr2, true);
                }
            }
            this.f447a.m189d();
            return null;
        }
        m281b(false);
        m296e(C0010k.m62a(99));
        String str = (objArr == null || objArr[1] == null) ? "" : (String) objArr[1];
        String b2 = (objArr == null || objArr[0] == null) ? "www." : C0010k.m104b((String) objArr[0]);
        if (!(objArr == null || objArr[2] == null)) {
            bArr = (byte[]) objArr[2];
        }
        boolean a3 = (objArr == null || objArr[3] == null || i == -1) ? false : C0010k.m97a(objArr);
        m302f(C0010k.m62a(100));
        mo101d(70);
        m291d("opera:bookmark-add");
        mo101d(0);
        m291d("");
        if (i != -1) {
            mo101d(104);
            m291d("i");
            m291d(String.valueOf(i));
        }
        mo101d(120);
        m291d("t");
        m291d(str);
        m302f(C0010k.m62a(93));
        mo101d(120);
        m291d("u");
        m291d(b2);
        m300f();
        m260a(new StringBuffer().append(C0010k.m62a(102)).append(": ").toString(), 1);
        mo101d(99);
        m291d("f");
        m291d("1");
        if (!a3) {
            i2 = 0;
        }
        mo101d(i2);
        mo101d(102);
        m300f();
        f433b = bArr;
        if (bArr != null && bArr.length > 0) {
            m267a(C0010k.m62a(85), bArr);
        }
        return mo97b();
    }

    /* renamed from: a */
    private static short m257a(int i) {
        return (short) (((((i >> 16) & 255) & 248) >> 3) | ((((i >> 8) & 255) & 252) << 3) | ((i & 248) << 8));
    }

    /* renamed from: a */
    private void m258a(char c, char[] cArr, int i, int i2, boolean z) throws IOException {
        int i3;
        int i4;
        if (this.f509o == 0 && cArr[i] == ' ') {
            i2--;
            i3 = i + 1;
        } else {
            i3 = i;
        }
        int b = m277b(cArr, i3, i2);
        int i5 = (-this.f509o) + this.f509o;
        if (b == 0) {
            m324q();
            i4 = i3;
        } else {
            if (!(this.f439a == null || this.f439a.f65a == null)) {
                mo105f((int) C0010k.m73a(this.f439a.f65a, this.f492g));
                this.f511p = this.f439a.f66b;
            }
            if (z) {
                m322p();
            }
            this.f441a.write(c);
            int a = C0010k.m59a(cArr, i3, b, this.f471c, 3, false);
            this.f471c[0] = (byte) Math.min(i5, 255);
            C0010k.m90a((short) a, this.f471c, 1);
            this.f441a.write(this.f471c, 0, a + 3);
            i4 = i3 + b;
        }
        if (b < i2) {
            m258a(c, cArr, i4, i2 - b, false);
        }
    }

    /* renamed from: a */
    private void m259a(int i, int i2) {
        if (this.f469c >= this.f484e.length) {
            this.f484e = C0010k.m99a(this.f484e, this.f484e.length + 10);
        }
        if (this.f469c >= this.f472c.length) {
            this.f472c = C0010k.m99a(this.f472c, this.f472c.length + 10);
        }
        if (this.f469c >= this.f485e.length) {
            this.f485e = C0010k.m102a(this.f485e, this.f485e.length + 10);
        }
        if (this.f469c >= this.f490f.length) {
            this.f490f = C0010k.m102a(this.f490f, this.f490f.length + 10);
        }
        if (this.f469c >= this.f478d.length) {
            this.f478d = C0010k.m99a(this.f478d, this.f478d.length + 10);
        }
        this.f484e[this.f469c] = i;
        this.f472c[this.f469c] = i2;
        this.f485e[this.f469c] = this.f451a;
        this.f490f[this.f469c] = this.f451a;
        this.f476d = this.f469c;
        this.f469c = (short) (this.f469c + 1);
    }

    /* renamed from: a */
    private void m260a(String str, int i) throws IOException {
        this.f441a.write(89);
        this.f441a.write(this.f525y + i);
        this.f441a.write(84);
        if (str == null) {
            str = "null";
        }
        this.f441a.writeUTF(str);
    }

    /* renamed from: a */
    private void m261a(String str, int i, int i2, int i3) throws IOException {
        m262a(str, i, i2, i3, 0);
    }

    /* renamed from: a */
    private void m262a(String str, int i, int i2, int i3, int i4) throws IOException {
        InputStream a = C0010k.m61a(str);
        if (a != null) {
            this.f441a.write(73);
            this.f441a.writeShort(i);
            this.f441a.writeShort(i2);
            this.f441a.writeShort(i3);
            this.f441a.writeShort(0);
            this.f441a.writeByte(i4);
            for (int i5 = 0; i5 < i3; i5++) {
                this.f441a.write(a.read());
            }
        }
    }

    /* renamed from: a */
    private void m263a(String str, int i, boolean z) throws IOException {
        mo101d(99);
        m291d(str);
        m291d("1");
        mo101d(z ? 1 : 0);
        m260a(C0010k.m62a(i), 0);
        m300f();
    }

    /* renamed from: a */
    private void m264a(String str, String str2) throws IOException {
        mo101d(76);
        m291d(str);
        m260a(str2, 7);
        mo101d(69);
    }

    /* renamed from: a */
    private void m265a(String str, String str2, boolean z) throws IOException {
        if (!z) {
            mo101d(76);
            m291d(str);
        }
        m260a(str2, z ? 5 : 2);
        if (str.startsWith("opera:submenu-")) {
            m262a("/ea.png", 4, 7, 87, 20);
            m262a("/ea_i.png", 4, 7, 105, 24);
        }
        if (!z) {
            mo101d(69);
        }
        m300f();
    }

    /* renamed from: a */
    private void m266a(String str, boolean z) throws IOException {
        m286c(str, z ? C0010k.m62a(11) : C0010k.m62a(12));
    }

    /* renamed from: a */
    private void m267a(String str, byte[] bArr) throws IOException {
        m260a(new StringBuffer().append(str).append(": ").toString(), 1);
        if (bArr != null) {
            m273a(bArr, 12, 12);
        } else {
            m260a("-", 0);
        }
        m300f();
    }

    /* renamed from: a */
    private void m268a(C0012m mVar, boolean z) {
        this.f477d = z;
        if (mVar == null) {
            try {
                m338a();
            } catch (Throwable th) {
                if (th instanceof OutOfMemoryError) {
                    System.gc();
                    throw ((OutOfMemoryError) th);
                } else if (!(th instanceof IOException) || th.getMessage() == null || th.getMessage().indexOf("SymbianOS") == -1) {
                    this.f450a.mo68b(C0010k.m62a(72));
                } else {
                    this.f450a.mo68b(C0010k.m62a(72));
                    m347b();
                    run();
                }
            } finally {
                m347b();
            }
        } else {
            m269a(mVar, false, false);
            if (this.f443a != null && this.f443a.length() > 0) {
                this.f456a[4] = this.f456a[0];
                this.f456a[0] = this.f443a;
                this.f456a[3] = null;
            }
            if (this.f491g > 1 && this.f456a[1] != null) {
                this.f456a[1] = new StringBuffer().append(this.f456a[1]).append(" (").append(this.f486f).append("/").append(this.f491g).append(")").toString();
            }
            if (this.f452a) {
                m347b();
                return;
            }
            if (this.f440a != null) {
                this.f440a.close();
            }
            if (this.f442a != null) {
                this.f442a.close();
            }
            if (this.f444a != null) {
                this.f444a.close();
            }
            if (this.f447a != null) {
                this.f447a.mo54f();
            }
            m347b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m269a(p000.C0012m r9, boolean r10, boolean r11) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 472
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC0020u.m269a(m, boolean, boolean):void");
    }

    /* renamed from: a */
    private void m270a(C0013n nVar) throws IOException {
        int i = 2;
        int i2 = 1;
        int i3 = 0;
        if (Runtime.getRuntime().freeMemory() < 15000 && this.f447a != null) {
            String a = m333a();
            if (a == null) {
                a = "";
            }
            if (!this.f477d || a.equals(f435g)) {
                m348b(15000);
            } else {
                f435g = a;
                System.gc();
            }
        }
        if (!this.f514q) {
            if (this.f448a != null && this.f441a != null && nVar != null) {
                this.f473c[this.f451a] = this.f464b;
            } else {
                return;
            }
        }
        if (nVar != null && nVar.f253c) {
            this.f441a.write(43);
        }
        switch (nVar.f237a) {
            case '$':
                if (!this.f514q) {
                    this.f474d = this.f451a;
                    if (!(this.f447a == null || this.f447a.f326i == Window.f290l)) {
                        this.f447a.f326i = Window.f289k;
                        this.f447a.f315c = true;
                        return;
                    }
                    return;
                }
                return;
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
            case '0':
            case '1':
            case '2':
            case '3':
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
            case 'C':
            case 'G':
            case 'H':
            case 'U':
            case 'Z':
            case '[':
            case '\\':
            case ']':
            case '^':
            case '_':
            case '`':
            case 'a':
            case 'b':
            case 'd':
            case 'e':
            case 'g':
            case 'j':
            case 'l':
            case 'n':
            case 'q':
            case 't':
            case 'v':
            case 'w':
            default:
                return;
            case 'A':
                if (!this.f514q) {
                    this.f479d[this.f482e] = this.f451a;
                    this.f457a[this.f482e] = nVar.f247b;
                    if (!(nVar.f247b == null || this.f447a == null || !nVar.f247b.equals(this.f487f))) {
                        this.f521u = this.f451a;
                        this.f447a.f326i = Window.f290l;
                    }
                    this.f482e = (short) (this.f482e + 1);
                    return;
                }
                return;
            case 'B':
                this.f441a.write(66);
                m324q();
                return;
            case 'D':
                this.f441a.write(68);
                this.f441a.writeShort(nVar.f241a);
                this.f464b = nVar.f241a;
                return;
            case 'E':
                if (!this.f514q) {
                    this.f441a.write(69);
                    if (this.f524x >= 0 && this.f524x < this.f493g.length) {
                        int i4 = this.f493g[this.f524x];
                        this.f524x--;
                        this.f490f[i4] = this.f451a;
                        this.f478d[i4] = this.f448a.size();
                        return;
                    }
                    return;
                }
                return;
            case 'F':
                this.f475d = nVar.f251c;
                this.f515r = nVar.f258f;
                this.f481e = nVar.f255d;
                this.f517s++;
                m298e(true);
                return;
            case 'I':
            case 'J':
                try {
                    boolean a2 = m275a(nVar.f256e, nVar.f254d);
                    boolean z = this.f509o == 0 && this.f524x < 0;
                    if (this.f446a != null) {
                        this.f446a.f282g = nVar.f254d;
                        this.f446a.f283h = nVar.f256e;
                        this.f490f[this.f446a.f281f] = this.f451a;
                        this.f478d[this.f446a.f281f] = this.f448a.size();
                        this.f446a = null;
                    }
                    if (nVar.f237a == 'I') {
                        String a3 = m333a();
                        byte readByte = (a3 == null || !a3.startsWith("opera:")) ? 0 : nVar.f239a.readByte();
                        if (this.f519t >= this.f458a.length) {
                            Image[] imageArr = new Image[(this.f458a.length + 10)];
                            System.arraycopy(this.f458a, 0, imageArr, 0, this.f458a.length);
                            this.f458a = imageArr;
                        }
                        if (this.f519t >= this.f489f.length) {
                            this.f489f = C0010k.m99a(this.f489f, this.f489f.length + 10);
                        }
                        this.f489f[this.f519t] = this.f448a.size();
                        if (!nVar.f253c) {
                            this.f441a.write(73);
                            this.f441a.writeShort(nVar.f254d);
                            this.f441a.writeShort(nVar.f256e);
                            this.f441a.writeShort(this.f519t);
                            DataOutputStream dataOutputStream = this.f441a;
                            if (!a2) {
                                i2 = 0;
                            }
                            if (!z) {
                                i = 0;
                            }
                            dataOutputStream.write(readByte | i2 | i);
                            C0010k.m90a((short) 0, this.f471c, 0);
                            this.f441a.write(this.f471c, 0, 2);
                            this.f441a.writeShort(nVar.f238a);
                        }
                        if (nVar.f253c) {
                            byte[] bArr = new byte[nVar.f238a];
                            int i5 = nVar.f238a;
                            while (i5 > 0) {
                                int read = nVar.f239a.read(bArr, i3, i5);
                                i3 += read;
                                i5 -= read;
                            }
                            m272a(bArr);
                            this.f519t++;
                            return;
                        }
                        int i6 = nVar.f238a;
                        while (i6 > 0) {
                            int read2 = nVar.f239a.read(this.f471c, 0, i6 < this.f471c.length ? i6 : this.f471c.length);
                            this.f441a.write(this.f471c, 0, read2);
                            i6 -= read2;
                        }
                        this.f519t++;
                    } else {
                        this.f441a.write(74);
                        this.f441a.writeShort(nVar.f254d);
                        this.f441a.writeShort(nVar.f256e);
                    }
                    mo105f((int) ((short) nVar.f256e));
                    int i7 = this.f509o;
                    int i8 = nVar.f254d;
                    if (z) {
                        i3 = this.f447a.f329o;
                    }
                    this.f509o = i7 + (i8 - i3);
                    if (a2) {
                        m324q();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (th instanceof OutOfMemoryError) {
                        this.f450a.m232a();
                        return;
                    }
                    return;
                }
            case 'K':
                boolean a4 = m275a(nVar.f256e, nVar.f254d);
                this.f448a.size();
                this.f441a.write(75);
                this.f441a.writeShort(nVar.f254d);
                this.f441a.writeShort(nVar.f256e);
                this.f441a.writeShort(nVar.f248b);
                boolean z2 = this.f509o == 0 && this.f524x < 0;
                mo105f((int) ((short) nVar.f256e));
                this.f509o = (z2 ? -4 : 0) + nVar.f254d + 4 + this.f509o;
                DataOutputStream dataOutputStream2 = this.f441a;
                if (!a4) {
                    i2 = 0;
                }
                if (!z2) {
                    i = 0;
                }
                dataOutputStream2.write(i2 | i);
                if (a4) {
                    m324q();
                    return;
                }
                return;
            case 'L':
            case 'P':
            case 'W':
            case 'm':
                if (!this.f514q) {
                    this.f524x++;
                    if (this.f524x >= 0 && this.f524x < this.f493g.length) {
                        this.f493g[this.f524x] = this.f469c;
                    }
                    if (nVar.f237a == 'L') {
                        m259a(1, this.f448a.size());
                    } else if (nVar.f237a == 'P') {
                        m259a(4, this.f448a.size());
                    } else if (nVar.f237a == 'm') {
                        m259a(1, this.f448a.size());
                    } else {
                        m259a(16, this.f448a.size());
                    }
                    this.f441a.write(nVar.f237a);
                    int a5 = C0010k.m59a(nVar.f244a, 0, nVar.f246b, this.f471c, 2, false);
                    C0010k.m90a((short) a5, this.f471c, 0);
                    this.f441a.write(this.f471c, 0, a5 + 2);
                    return;
                }
                return;
            case 'M':
                this.f450a.mo69b("ecma", nVar.f240a, nVar.f247b);
                return;
            case 'N':
                this.f470c = true;
                C0010k.f186g = nVar.f240a;
                C0010k.m106b();
                return;
            case 'O':
                m324q();
                C0016q qVar = new C0016q(C0010k.m54a(6000));
                DataOutputStream dataOutputStream3 = this.f441a;
                this.f441a = new DataOutputStream(qVar);
                switch (nVar.f245b) {
                    case 'L':
                        m287c(true);
                        break;
                    case 'b':
                        m293d(true);
                        break;
                    case 'l':
                        m306h();
                        break;
                    case 's':
                        m308i();
                        break;
                }
                C0012m mVar = new C0012m(new ByteArrayInputStream(qVar.mo57a(), 0, qVar.size()), false);
                while (mVar.f222a) {
                    try {
                        C0013n a6 = mVar.mo29a();
                        if (a6.f237a == 'O') {
                            this.f441a = dataOutputStream3;
                            return;
                        }
                        m270a(a6);
                    } catch (IOException e) {
                    }
                }
                this.f441a = dataOutputStream3;
                return;
            case 'Q':
                this.f441a.write(81);
                return;
            case 'R':
                m324q();
                this.f441a.write(82);
                this.f441a.writeShort(nVar.f241a);
                this.f509o++;
                mo105f(3);
                m324q();
                return;
            case 'S':
                this.f439a = m250a(nVar.f243a);
                if (!(this.f455a == null || this.f505m >= this.f455a.length || this.f439a == null)) {
                    this.f455a[this.f505m] = this.f439a;
                }
                this.f507n = this.f505m;
                this.f516r = false;
                this.f505m++;
                return;
            case 'T':
                m258a('T', nVar.f244a, 0, nVar.f246b, true);
                return;
            case 'V':
                m324q();
                this.f509o++;
                mo105f(5);
                m324q();
                return;
            case 'X':
                try {
                    byte[] bArr2 = new byte[nVar.f238a];
                    int i9 = nVar.f238a;
                    int i10 = 0;
                    while (i9 > 0) {
                        int read3 = nVar.f239a.read(bArr2, i10, i9);
                        i10 += read3;
                        i9 -= read3;
                    }
                    int[] iArr = new int[144];
                    int i11 = (this.f450a.f398c - 12) / 2;
                    int i12 = nVar.f254d * nVar.f256e;
                    int i13 = 0;
                    for (int i14 = 0; i14 < i12; i14++) {
                        int i15 = this.f450a.f397b[(i14 / 12) + i11];
                        iArr[i14] = m246a(bArr2[i13] & 255, bArr2[i13 + 3] & 255, i15 & 255) | (m246a(bArr2[i13] & 255, bArr2[i13 + 1] & 255, (i15 >> 16) & 255) << 16) | (m246a(bArr2[i13] & 255, bArr2[i13 + 2] & 255, (i15 >> 8) & 255) << 8);
                        i13 += 4;
                    }
                    this.f445a = Image.createRGBImage(iArr, nVar.f254d, nVar.f256e, false);
                    return;
                } catch (Throwable th2) {
                    return;
                }
            case 'Y':
            case 'y':
                if (nVar.f248b < this.f455a.length) {
                    this.f507n = nVar.f248b;
                    this.f439a = this.f455a[this.f507n];
                    this.f516r = false;
                    return;
                }
                return;
            case 'c':
            case 'h':
            case 'i':
            case 'p':
            case 'r':
            case 's':
            case 'u':
            case 'x':
                if (nVar.f237a == 'x' || nVar.f237a == 's') {
                    m324q();
                }
                if (nVar.f237a == 'x' || nVar.f237a == 'u') {
                    Font font = C0014o.f260a;
                    int stringWidth = (font == null || nVar == null || nVar.f259f == null) ? 0 : font.stringWidth(nVar.f259f);
                    if (this.f509o + stringWidth <= this.f522v) {
                        this.f509o = stringWidth + this.f509o;
                    } else {
                        m324q();
                    }
                }
                C0014o oVar = (nVar.f237a == 'c' || nVar.f237a == 'r') ? new C0014o(nVar.f237a, nVar.f257e, nVar.f259f, this.f475d, nVar.f242a, this.f517s, this.f522v) : nVar.f237a == 's' ? new C0014o(nVar.f237a, nVar.f257e, nVar.f259f, this.f475d, this.f517s, this.f522v, nVar.f242a, nVar.f252c) : new C0014o(nVar.f237a, nVar.f257e, nVar.f259f, this.f475d, this.f481e, this.f517s, this.f522v);
                oVar.f276c = nVar.f249b;
                if (this.f509o + oVar.mo32a(false) > this.f522v && this.f509o > 0) {
                    m324q();
                }
                if (nVar.f237a == 'i') {
                    this.f446a = oVar;
                }
                if (oVar.f262a != 'h') {
                    oVar.f281f = this.f469c;
                    m259a(8, this.f448a.size());
                }
                if (this.f513q >= this.f459a.length) {
                    C0014o[] oVarArr = new C0014o[(this.f459a.length + 10)];
                    System.arraycopy(this.f459a, 0, oVarArr, 0, this.f459a.length);
                    this.f459a = oVarArr;
                }
                this.f459a[this.f513q] = oVar;
                this.f441a.write(nVar.f237a);
                this.f441a.writeShort(this.f513q);
                this.f513q++;
                mo105f(oVar.m135a());
                this.f509o += oVar.mo32a(false);
                if (nVar.f237a == 'x') {
                    m324q();
                }
                if (oVar.f262a != 'h') {
                    this.f490f[this.f476d] = this.f451a;
                    this.f478d[this.f476d] = this.f448a.size();
                    return;
                }
                return;
            case 'f':
                m298e(false);
                return;
            case 'k':
                if (nVar.f245b == 0) {
                    C0010k.m107b(nVar.f240a);
                } else if (nVar.f245b == 1) {
                    C0010k.m78a(nVar.f240a);
                } else if (nVar.f245b == 2) {
                    C0010k.m116c(nVar.f240a);
                }
                if (!this.f477d && this.f499j == 2 && C0010k.f166b != null && C0010k.f166b.length() > 0) {
                    this.f499j = 0;
                    this.f456a[4] = this.f443a;
                    this.f456a[0] = this.f443a;
                    this.f456a[3] = null;
                    this.f447a.mo49c();
                    return;
                }
                return;
            case 'o':
                this.f459a[this.f513q - 1].mo34a(nVar.f257e, nVar.f259f, nVar.f242a);
                return;
        }
    }

    /* renamed from: a */
    private void m271a(short s) throws IOException {
        this.f441a.writeShort(s);
    }

    /* renamed from: a */
    private void m272a(byte[] bArr) {
        this.f456a[2] = bArr;
    }

    /* renamed from: a */
    private void m273a(byte[] bArr, int i, int i2) throws IOException {
        this.f441a.write(73);
        this.f441a.writeShort(i);
        this.f441a.writeShort(i2);
        this.f441a.writeShort(bArr.length);
        this.f441a.writeShort(0);
        this.f441a.writeByte(0);
        this.f441a.write(bArr);
    }

    /* renamed from: a */
    private void m274a(Object[] objArr, boolean z) throws IOException {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        if (str != null && str2 != null) {
            m260a("» ", 0);
            byte[] bArr = (byte[]) objArr[2];
            if (str != null && str.startsWith("opera:")) {
                bArr = C0010k.m98a();
            } else if (bArr == null || bArr.length == 0) {
                bArr = C0010k.m113b();
            }
            if (bArr != null) {
                m273a(bArr, 12, 12);
            }
            m260a(" ", 0);
            mo101d(76);
            m291d(str);
            Font font = this.f455a[this.f525y + 7].f65a;
            if (str2 == null) {
                str2 = str;
            }
            m260a(C0010k.m66a(font, C0010k.m114c(str2), (this.f522v - 12) - C0010k.m56a(this.f455a[this.f525y + 0].f65a, "MM  ", false), false), 7);
            mo101d(69);
            if (this.f447a.f331q > 128) {
                m300f();
                if (z && str != null && this.f450a.mo59a((String) null, str) != null) {
                    m260a(C0010k.m62a(25), 4);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m275a(int i, int i2) throws IOException {
        boolean z = i > 38 || i2 > 38;
        if (this.f509o + i2 > this.f522v || z) {
            m324q();
        }
        return z;
    }

    /* renamed from: a */
    private boolean m276a(C0012m mVar) {
        if (mVar == null) {
            return false;
        }
        try {
            this.f448a = new C0016q(C0010k.m54a(mVar.f227c));
            this.f441a = new DataOutputStream(this.f448a);
            int i = mVar.f231g + mVar.f230f;
            this.f484e = new int[i];
            this.f472c = new int[i];
            this.f478d = new int[i];
            this.f485e = new short[i];
            this.f490f = new short[i];
            this.f436a = mVar.f216a;
            this.f459a = new C0014o[mVar.f230f];
            this.f458a = new Image[mVar.f228d];
            this.f489f = new int[mVar.f228d];
            this.f457a = new String[mVar.f232h];
            this.f479d = new short[mVar.f232h];
            this.f454a = new int[mVar.f233i];
            this.f460a = new short[mVar.f233i];
            this.f467b = new short[mVar.f233i];
            this.f473c = new short[mVar.f233i];
            this.f466b = new int[mVar.f233i];
            this.f486f = mVar.f235k;
            this.f491g = mVar.f229e;
            this.f525y = mVar.f234j;
            mo103e(mVar.f234j + 8);
            if (mVar.f234j > 0) {
                this.f505m = 0;
            } else {
                this.f505m = 8;
            }
            this.f454a[0] = this.f448a.size();
            this.f464b = -1;
            this.f473c[0] = this.f464b;
            this.f471c = new byte[1536];
            return true;
        } catch (OutOfMemoryError e) {
            if (this.f450a == null) {
                return false;
            }
            this.f450a.m227a(0);
            return false;
        }
    }

    /* renamed from: b */
    private int m277b(char[] cArr, int i, int i2) {
        if (this.f509o > this.f522v) {
            return 0;
        }
        int i3 = i2;
        while (i3 > 0) {
            int i4 = cArr[i] == ' ' ? 1 : 0;
            while (true) {
                if (i4 >= i3 || cArr[i + i4] == ' ') {
                    break;
                } else if (cArr[i + i4] == '-') {
                    i4++;
                    break;
                } else {
                    i4++;
                }
            }
            int a = m248a(cArr, i, i4);
            this.f509o += a;
            if (this.f509o <= this.f522v) {
                i3 -= i4;
                i += i4;
            } else if (this.f509o == a) {
                this.f509o -= a;
                int i5 = (i4 * ((this.f522v * 100) / a)) / 100;
                int a2 = m248a(cArr, i, i5);
                if (a2 >= this.f509o) {
                    while (true) {
                        i5--;
                        if (a2 < this.f522v) {
                            break;
                        }
                        a2 -= m248a(cArr, (i + i5) + 1, 1);
                    }
                } else {
                    while (true) {
                        i5++;
                        if (a2 >= this.f522v) {
                            break;
                        }
                        a2 += m248a(cArr, (i + i5) - 1, 1);
                    }
                }
                this.f509o = a2 + this.f509o;
                return i5 - 1;
            } else {
                this.f509o -= a;
                return i2 - i3;
            }
        }
        return i2;
    }

    /* renamed from: b */
    private C0012m mo97b() throws IOException {
        mo101d(81);
        return new C0012m(new ByteArrayInputStream(this.f448a.mo57a(), 0, this.f448a.size()), true);
    }

    /* renamed from: b */
    private void m279b(String str) {
        this.f456a[0] = str;
    }

    /* renamed from: b */
    private void m280b(String str, String str2) throws IOException {
        m265a(str, str2, false);
    }

    /* renamed from: b */
    private void m281b(boolean z) throws IOException {
        int i = 30;
        this.f448a = new C0016q(C0010k.m54a(6000));
        this.f441a = new DataOutputStream(this.f448a);
        this.f441a.write(13);
        this.f441a.write(51);
        this.f441a.writeInt(10000);
        this.f441a.writeInt(3000);
        if (z) {
            this.f441a.writeShort(30);
            this.f441a.writeShort(0);
            this.f441a.writeShort(0);
            this.f441a.writeShort(20);
            this.f441a.writeShort(3000);
            this.f441a.writeInt(15000);
            this.f441a.writeShort(20);
        } else {
            if (C0010k.f159a == null) {
                C0010k.m118d();
            }
            String a = m333a();
            if (a == null) {
                a = "";
            }
            if (a.equals("opera:bookmarks")) {
                i = C0010k.f159a.size();
            }
            int i2 = a.equals("opera:settings") ? 25 : 20;
            this.f441a.writeShort(i);
            this.f441a.writeShort(5);
            this.f441a.writeShort(i2);
            this.f441a.writeShort(i);
            this.f441a.writeShort(3000);
            this.f441a.writeInt(15000);
            this.f441a.writeShort(200);
        }
        this.f441a.writeShort(1);
        this.f441a.writeShort(1);
        this.f441a.writeShort(0);
        this.f441a.writeShort(0);
        this.f441a.writeShort(0);
        this.f441a.write(0);
        this.f441a.writeShort(0);
        this.f441a.writeShort(0);
    }

    /* renamed from: c */
    private int mo100c() {
        if (this.f440a != null) {
            return this.f440a.f81a;
        }
        return 0;
    }

    /* renamed from: c */
    private C0012m m283c() throws IOException {
        String substring;
        this.f449a = RunnableC0018s.f365l;
        this.f463b = RunnableC0018s.f360i;
        String a = C0010k.m65a(m354d(), true, false);
        if (a != null) {
            int indexOf = a.indexOf("tno=");
            if (!(indexOf == -1 || (substring = a.substring(indexOf + 4)) == null || substring.length() <= 2)) {
                new RunnableC0003d(this.f450a, substring, C0010k.m62a(120), false).mo19a();
            }
            this.f447a.m189d();
            return null;
        }
        m281b(false);
        m296e(C0010k.m62a(119));
        m260a(C0010k.m62a(121), 0);
        mo101d(70);
        m291d("opera:recommend");
        mo101d(0);
        m291d("");
        m300f();
        m260a(new StringBuffer().append(C0010k.m62a(122)).append(": ").toString(), 2);
        mo101d(120);
        m291d("tno");
        m291d("");
        mo101d(102);
        m300f();
        return mo97b();
    }

    /* renamed from: c */
    private void mo99c(int i) throws IOException {
        this.f441a.write(68);
        this.f441a.writeShort(m257a(i));
    }

    /* renamed from: c */
    private void m285c(String str) {
        this.f456a[1] = str;
    }

    /* renamed from: c */
    private void m286c(String str, String str2) throws IOException {
        m260a(new StringBuffer().append(str).append(": ").toString(), 1);
        m260a(str2, 0);
        m300f();
    }

    /* renamed from: c */
    private void m287c(boolean z) throws IOException {
        if (C0010k.f162a == null) {
            C0010k.m91a(false);
        }
        if (C0010k.f162a != null) {
            m302f(C0010k.m62a(71));
            if (!z) {
                for (int i = 0; i < C0010k.f162a.length; i++) {
                    m274a(C0010k.f162a[i], false);
                    m300f();
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m288c() {
        if (!this.f452a) {
            return false;
        }
        m347b();
        return true;
    }

    /* renamed from: d */
    private C0012m mo102d() throws IOException {
        this.f449a = RunnableC0018s.f372s;
        this.f463b = RunnableC0018s.f360i;
        m281b(false);
        m296e(C0010k.m62a(39));
        m260a("» ", 0);
        m264a("opera:helpintro", C0010k.m62a(68));
        m300f();
        m260a("» ", 0);
        m264a("opera:helpshortcuts", C0010k.m62a(32));
        m300f();
        m260a("» ", 0);
        m264a("http://help.opera.com/mini/", C0010k.m62a(19));
        m300f();
        m260a("» ", 0);
        m264a(new StringBuffer().append("http://mini.bugs.opera.com/?w=").append(this.f450a.getWidth()).append("&h=").append(this.f450a.getHeight()).append("&m=").append(C0010k.f156a).append("&ma=").append(C0010k.f170c).append("&pl=").append(C0010k.m65a(C0010k.f158a, true, true)).append("&url=").append(C0010k.m65a(this.f447a.m171a(this.f447a.f313c), true, true)).toString(), C0010k.m62a(90));
        m300f();
        m260a("» ", 0);
        m264a("opera:about", C0010k.m62a(2));
        return mo97b();
    }

    /* renamed from: d */
    private void mo101d(int i) throws IOException {
        this.f441a.write(i);
    }

    /* renamed from: d */
    private void m291d(String str) throws IOException {
        this.f441a.writeUTF(str);
    }

    /* renamed from: d */
    private void m292d(String str, String str2) {
        if (str != null && str2 != null && str2.length() != 0) {
            if (this.f495h == null) {
                this.f495h = new StringBuffer().append(str).append("=").append(str2).toString();
            } else {
                this.f495h = new StringBuffer().append(this.f495h).append("\u0000").append(str).append("=").append(str2).toString();
            }
        }
    }

    /* renamed from: d */
    private void m293d(boolean z) throws IOException {
        if (C0010k.f159a == null) {
            C0010k.m118d();
        }
        if (C0010k.f159a != null) {
            if (z) {
                m302f(C0010k.m62a(7));
            }
            m300f();
            int i = 0;
            for (int i2 = 0; i2 < C0010k.f159a.size(); i2++) {
                Object[] a = C0010k.m100a(i2);
                boolean a2 = C0010k.m97a(a);
                if (!z || (z && a2)) {
                    m274a(a, false);
                    i++;
                    m300f();
                }
            }
            if (i < C0010k.f159a.size() && z) {
                m264a("opera:bookmarks", new StringBuffer().append(C0010k.m62a(117)).append("...").toString());
            }
        }
    }

    /* renamed from: e */
    private C0012m mo104e() throws IOException {
        this.f449a = RunnableC0018s.f372s;
        this.f463b = RunnableC0018s.f360i;
        m281b(false);
        m296e(C0010k.m62a(32));
        m260a("#, 1: ", 3);
        m260a(C0010k.m62a(47), 0);
        m300f();
        m260a("#, 2: ", 3);
        m260a(C0010k.m62a(7), 0);
        m300f();
        m260a("#, 3: ", 3);
        m260a(C0010k.m62a(67), 0);
        m300f();
        m260a("#, 4: ", 3);
        m260a(C0010k.m62a(54), 0);
        m300f();
        m260a("#, 5: ", 3);
        m260a(C0010k.m62a(17), 0);
        m300f();
        m260a("#, 6: ", 3);
        m260a(C0010k.m62a(53), 0);
        m300f();
        m260a("#, 7: ", 3);
        m260a(C0010k.m62a(8), 0);
        m300f();
        m260a("#, 8: ", 3);
        m260a(C0010k.m62a(9), 0);
        m300f();
        m260a("#, 9: ", 3);
        m260a(C0010k.m62a(38), 0);
        m300f();
        m260a("#, 0: ", 3);
        m260a(C0010k.m62a(5), 0);
        m300f();
        m260a("#, #: ", 3);
        m260a(C0010k.m62a(35), 0);
        m300f();
        m260a("*: ", 3);
        m260a(C0010k.m62a(66), 0);
        return mo97b();
    }

    /* renamed from: e */
    private void mo103e(int i) {
        this.f455a = new C0002c[i];
        int i2 = C0010k.f176d;
        this.f455a[this.f525y + 0] = new C0002c(64, 0, i2, 0, 0);
        this.f455a[this.f525y + 1] = new C0002c(64, 1, i2, 0, 0);
        this.f455a[this.f525y + 2] = new C0002c(64, 0, i2, 0, 0);
        this.f455a[this.f525y + 3] = new C0002c(64, 1, i2, 0, 0);
        this.f455a[this.f525y + 4] = new C0002c(64, 0, i2, 8421504, 0);
        this.f455a[this.f525y + 5] = new C0002c(64, 0, i2, 10066329, 0);
        this.f455a[this.f525y + 6] = new C0002c(64, 1, i2, 16777215, 0);
        this.f455a[this.f525y + 7] = new C0002c(64, 0, i2, 18858, 0);
    }

    /* renamed from: e */
    private void m296e(String str) throws IOException {
        mo101d(43);
        this.f441a.write(84);
        this.f441a.writeUTF(str);
    }

    /* renamed from: e */
    private void m297e(String str, String str2) {
        String a;
        if (str != null && str2 != null && (a = C0010k.m64a(str2)) != null && a.length() != 0) {
            m292d(str, a);
        }
    }

    /* renamed from: e */
    private void m298e(boolean z) throws IOException {
        if (z && this.f475d != null) {
            this.f441a.write(70);
            this.f441a.writeUTF(this.f475d);
            this.f441a.write(this.f515r);
        } else if (!z && this.f475d != null) {
            this.f441a.write(102);
            this.f475d = null;
            this.f481e = null;
        }
    }

    /* renamed from: f */
    private C0012m mo106f() throws IOException {
        this.f449a = RunnableC0018s.f372s;
        this.f463b = RunnableC0018s.f360i;
        m281b(false);
        m296e(C0010k.m62a(68));
        m316m();
        return mo97b();
    }

    /* renamed from: f */
    private void m300f() throws IOException {
        mo101d(66);
    }

    /* renamed from: f */
    private void mo105f(int i) {
        if (!this.f514q && this.f460a[this.f451a] < i) {
            this.f460a[this.f451a] = (short) i;
        }
    }

    /* renamed from: f */
    private void m302f(String str) throws IOException {
        mo101d(86);
        m300f();
        mo99c(15658734);
        m260a(str, 1);
        mo101d(82);
        this.f441a.writeShort(m257a(11184810));
        mo99c(16777215);
    }

    /* renamed from: g */
    private C0012m m303g() throws IOException {
        m281b(false);
        m296e("Opera Mini");
        m308i();
        m293d(true);
        m300f();
        if (C0010k.f178d) {
            m302f(C0010k.m62a(70));
        }
        if (C0010k.f178d) {
            m260a("» ", 0);
            m264a("opera:recommend", C0010k.m62a(119));
            m300f();
        }
        if (!(this.f447a == null || this.f447a.f302a == null)) {
            m306h();
        }
        return mo97b();
    }

    /* renamed from: g */
    private void m304g() throws IOException {
        m260a(new StringBuffer().append(C0010k.m62a(113)).append(" ").toString(), 1);
        m260a(Long.toString(C0010k.f164b / 1000), 0);
        m260a(" kb ", 0);
        m264a("opera:clearbytes", new StringBuffer().append("[").append(C0010k.m62a(20)).append("]").toString());
        m300f();
        m260a(new StringBuffer().append(C0010k.m62a(114)).append(" ").toString(), 1);
        m260a(Long.toString(C0010k.f171c / 1000), 0);
        m260a(" kb ", 0);
        m264a("opera:cleartotal", new StringBuffer().append("[").append(C0010k.m62a(20)).append("]").toString());
        m300f();
    }

    /* renamed from: h */
    private C0012m m305h() throws IOException {
        m310j();
        if (this.f450a.f385a.m185b()) {
            m280b("opera:forward", C0010k.m62a(35));
        }
        if (!(this.f450a == null || this.f450a.f385a == null || this.f450a.f385a.pageImageData == null || this.f450a.f385a.pageImageData.m349b())) {
            m265a("opera:pageinfo", C0010k.m62a(53), this.f450a.f385a.pageImageData.m349b());
            m280b("opera:bookmark", C0010k.m62a(8));
            m280b("opera:reload", C0010k.m62a(5));
        }
        m280b("opera:history", C0010k.m62a(17));
        m280b("opera:settings", C0010k.m62a(9));
        m280b("opera:help", C0010k.m62a(39));
        return mo97b();
    }

    /* renamed from: h */
    private void m306h() throws IOException {
        int size = this.f447a.f302a.size();
        int min = Math.min(3, size);
        if (size > 0) {
            m302f(C0010k.m62a(57));
            for (int i = size - 1; i >= size - min; i--) {
                m274a((Object[]) this.f447a.f302a.elementAt(i), false);
                m300f();
            }
            if (size > min) {
                m264a("opera:history", new StringBuffer().append(C0010k.m62a(41)).append("...").toString());
            }
            m300f();
        }
    }

    /* renamed from: i */
    private C0012m m307i() throws IOException {
        m310j();
        m280b("opera:openurl", C0010k.m62a(47));
        m280b("opera:bookmarks", C0010k.m62a(7));
        m280b("opera:start", C0010k.m62a(54));
        m280b("opera:submenu-tools", C0010k.m62a(40));
        m280b("opera:exit", C0010k.m62a(10));
        return mo97b();
    }

    /* renamed from: i */
    private void m308i() throws IOException {
        short s = 16;
        m300f();
        mo99c(15658734);
        m260a(C0010k.m62a(115), 1);
        mo101d(82);
        this.f441a.writeShort(m257a(11184810));
        mo99c(16777215);
        mo101d(70);
        m291d("goto:///");
        mo101d(0);
        m291d("");
        mo101d(120);
        m291d("q");
        m291d("www.");
        mo101d(102);
        m300f();
        mo101d(86);
        m300f();
        mo99c(15658734);
        short a = C0010k.m73a(RunnableC0018s.f345a, this.f492g);
        String str = "/g_p2.png";
        int i = 816;
        int i2 = 33;
        if (a > 16) {
            str = "/g_p5.png";
            i = 1286;
            i2 = 44;
        } else {
            s = 13;
        }
        if (a <= s) {
            a = s;
        }
        m262a(str, i2, a, i, 32);
        mo101d(82);
        this.f441a.writeShort(m257a(11184810));
        mo99c(16777215);
        m300f();
        mo101d(70);
        m291d("search:///");
        mo101d(0);
        m291d("");
        mo101d(120);
        m291d("q");
        m291d("");
        mo101d(102);
        m300f();
    }

    /* renamed from: j */
    private C0012m m309j() throws IOException {
        boolean z = true;
        m310j();
        m280b("opera:bookmark-add", C0010k.m62a(52));
        int d = this.f450a.f385a.pageImageData.m353d(this.f450a.f385a.f300a);
        m265a("opera:bookmark-edit", C0010k.m62a(16), d == -1);
        m265a("opera:bookmark-delete", C0010k.m62a(15), d == -1);
        m265a("opera:bookmark-up", C0010k.m62a(33), d == 0 || d == -1);
        String a = C0010k.m62a(34);
        if ((C0010k.f159a == null || d != C0010k.f159a.size() - 1) && d != -1) {
            z = false;
        }
        m265a("opera:bookmark-down", a, z);
        return mo97b();
    }

    /* renamed from: j */
    private void m310j() throws IOException {
        m281b(true);
        this.f465b = true;
        this.f492g = true;
        this.f496h = true;
        this.f480e = RunnableC0018s.f351c[9];
        this.f523w = 4;
        this.f500j = true;
        this.f488f = true;
        mo99c(15132390);
    }

    /* renamed from: k */
    private C0012m m311k() throws IOException {
        m281b(false);
        mo99c(RunnableC0018s.f351c[7]);
        if (this.f450a.f400c != null) {
            m260a(this.f450a.f400c, 6);
            m300f();
        } else {
            mo101d(86);
            mo101d(86);
        }
        mo99c(15132390);
        if (this.f450a.f390b != null) {
            m260a(this.f450a.f390b, 3);
        }
        m300f();
        return mo97b();
    }

    /* renamed from: k */
    private void m312k() throws IOException {
        mo101d(82);
        this.f441a.writeShort(m257a(11184810));
    }

    /* renamed from: l */
    private C0012m m313l() throws IOException {
        this.f499j = 2;
        this.f449a = RunnableC0018s.f371r;
        this.f463b = RunnableC0018s.f360i;
        this.f488f = true;
        m281b(false);
        m296e(C0010k.m62a(17));
        if (!(this.f447a == null || this.f447a.f302a == null)) {
            for (int size = this.f447a.f302a.size() - 1; size >= 0; size--) {
                m274a((Object[]) this.f447a.f302a.elementAt(size), true);
                m300f();
            }
        }
        return mo97b();
    }

    /* renamed from: l */
    private void m314l() throws IOException {
        m302f(C0010k.m62a(77));
        if (!C0010k.f187g) {
            m260a(C0010k.m62a(62), 0);
        }
        mo101d(86);
        m264a("opera:testconnection", C0010k.m62a(110));
    }

    /* renamed from: m */
    private C0012m m315m() throws IOException {
        this.f499j = 2;
        this.f449a = RunnableC0018s.f361j;
        this.f463b = RunnableC0018s.f363k;
        m281b(false);
        if (this.f506m) {
            m296e(C0010k.m62a(64));
            m302f(C0010k.m62a(65));
        } else if (this.f508n) {
            m296e(C0010k.m62a(29));
            m302f(C0010k.m62a(30));
        }
        m300f();
        return mo97b();
    }

    /* renamed from: m */
    private void m316m() throws IOException {
        mo101d(86);
        m314l();
        mo101d(86);
        m302f(C0010k.m62a(78));
        m260a(new StringBuffer().append(C0010k.m62a(79)).append(" ").append(C0010k.m62a(80)).toString(), 0);
        mo101d(86);
        m260a(C0010k.m62a(63), 0);
        mo101d(86);
        m260a(C0010k.m63a(76, "http://help.opera.com/mini/"), 0);
    }

    /* renamed from: n */
    private C0012m m317n() throws IOException {
        this.f523w = 1;
        this.f499j = 2;
        if (this.f447a.pageImageData == null || this.f447a.pageImageData.m349b()) {
            this.f447a.f307a = null;
        } else {
            this.f447a.f307a = this.f447a.pageImageData.f456a;
        }
        this.f449a = RunnableC0018s.f350c;
        this.f463b = RunnableC0018s.f360i;
        m281b(false);
        m296e(C0010k.m62a(7));
        m293d(false);
        this.f488f = true;
        return mo97b();
    }

    /* renamed from: n */
    private void m318n() {
        m339a(8);
        if (!this.f477d) {
            C0010k.f171c += (long) this.f437a;
            C0010k.f164b += (long) this.f437a;
            C0010k.m106b();
        }
    }

    /* renamed from: o */
    private C0012m m319o() throws IOException {
        this.f502k = true;
        this.f449a = RunnableC0018s.f361j;
        this.f463b = RunnableC0018s.f363k;
        m281b(false);
        m296e("Platform request");
        if (this.f450a.f406d.substring(0, 4).equals("tel:")) {
            m260a(C0010k.m63a(92, this.f450a.f406d.substring(this.f450a.f406d.indexOf(58) + 1)), 0);
        } else {
            m260a(C0010k.m62a(101), 0);
        }
        m300f();
        return mo97b();
    }

    /* renamed from: o */
    private void m320o() {
        int i = 0;
        for (int i2 = 0; i2 <= this.f451a; i2++) {
            i = this.f460a[i2] + i;
            this.f466b[i2] = i;
        }
        this.width = this.f466b[this.f451a];
        this.f453a = this.f448a.mo57a();
        if (this.f447a != null && this.f447a.f326i == Window.f289k) {
            this.f447a.f324h = this.f474d;
        } else if (this.f447a != null && this.f447a.f326i == Window.f290l) {
            this.f447a.f324h = this.f521u;
        }
        if (this.f450a != null) {
            this.f450a.repaint();
        }
        this.f438a = System.currentTimeMillis();
    }

    /* renamed from: p */
    private C0012m m321p() throws IOException {
        this.f504l = true;
        this.f449a = RunnableC0018s.f361j;
        this.f463b = RunnableC0018s.f363k;
        m281b(false);
        m296e("SMS");
        m302f("SMS");
        m260a(this.f450a.f421g, 0);
        m300f();
        return mo97b();
    }

    /* renamed from: p */
    private void m322p() throws IOException {
        if (this.f507n != -1 && !this.f516r) {
            if (this.f507n <= 255) {
                this.f441a.write(89);
                this.f441a.writeByte(this.f507n);
            } else {
                this.f441a.write(121);
                this.f441a.writeShort(this.f507n);
            }
            this.f516r = true;
        }
    }

    /* renamed from: q */
    private C0012m m323q() throws IOException {
        boolean z = true;
        this.f499j = 2;
        this.f449a = RunnableC0018s.f367n;
        this.f463b = RunnableC0018s.f352d;
        this.f488f = true;
        String d = m354d();
        if (d != null) {
            C0010k.f145I = d.indexOf("images") != -1;
            C0010k.f144H = d.indexOf("contentmagic") != -1;
            boolean z2 = d.indexOf("use_bitmap_font") != -1;
            boolean z3 = z2 != C0010k.f148L;
            C0010k.f148L = z2;
            C0010k.f150N = d.indexOf("use_24h") != -1;
            if (C0010k.f198m && d.indexOf("clockadjustment") != -1) {
                int indexOf = d.indexOf("clockadjustment") + 16;
                int indexOf2 = d.indexOf(38, indexOf);
                String substring = indexOf2 == -1 ? d.substring(indexOf) : d.substring(indexOf, indexOf2);
                try {
                    C0010k.f188h = 0;
                    C0010k.f188h = Integer.parseInt(substring) - C0010k.m68a().get(11);
                } catch (NumberFormatException e) {
                }
            }
            C0010k.f153Q = d.indexOf("highimagequality") != -1;
            C0010k.m124f();
            if (d.indexOf("use_smooth_scroll") == -1) {
                z = false;
            }
            C0010k.f139C = z;
            C0010k.m106b();
            this.f450a.m226a();
            if (z3) {
                this.f450a.mo79k();
                this.f447a.f313c = 0;
                this.f447a.f316d = 0;
                this.f450a.mo64a("opera:start");
            } else {
                this.f447a.m189d();
            }
            return null;
        }
        m281b(false);
        m296e(C0010k.m62a(9));
        mo101d(70);
        m291d("opera:settings");
        mo101d(0);
        m291d("");
        m263a("images", 14, C0010k.f145I);
        m312k();
        m263a("highimagequality", 94, C0010k.f153Q);
        m260a(C0010k.m62a(95), 4);
        m312k();
        m263a("contentmagic", 13, C0010k.f144H);
        if (!C0010k.f142F) {
            m312k();
            m263a("use_bitmap_font", 26, C0010k.f148L);
            m260a(C0010k.m62a(27), 4);
        }
        m312k();
        m263a("use_smooth_scroll", 112, C0010k.f139C);
        m312k();
        m263a("use_24h", 28, C0010k.f150N);
        if (C0010k.f198m) {
            m312k();
            m260a(C0010k.m62a(96), 0);
            mo101d(115);
            m291d("clockadjustment");
            mo101d(0);
            m271a((short) 24);
            String a = RunnableC0018s.m198a(-1);
            for (int i = 0; i < 24; i++) {
                String a2 = RunnableC0018s.m198a(i);
                mo101d(111);
                m291d(a2);
                m291d(String.valueOf(i));
                mo101d(a2.equals(a) ? 1 : 0);
            }
        }
        mo101d(102);
        m300f();
        return mo97b();
    }

    /* renamed from: q */
    private void m324q() throws IOException {
        if (this.f509o != 0) {
            if (this.f509o > this.f497i) {
                this.f497i = this.f509o;
            }
            this.f516r = false;
            if (this.f514q) {
                this.f509o = 0;
                return;
            }
            short[] sArr = this.f460a;
            short s = this.f451a;
            sArr[s] = (short) (sArr[s] + this.f523w);
            switch (this.f511p) {
                case 0:
                    this.f467b[this.f451a] = 0;
                    break;
                case 1:
                    this.f467b[this.f451a] = (short) ((this.f522v - this.f509o) / 2);
                    break;
                case 2:
                    this.f467b[this.f451a] = (short) (this.f522v - this.f509o);
                    break;
            }
            this.f451a = (short) (this.f451a + 1);
            this.f454a[this.f451a] = this.f448a.size();
            this.f509o = 0;
            m322p();
            if (this.f441a != null) {
                this.f441a.write(68);
                this.f441a.writeShort(this.f464b);
            }
        }
    }

    /* renamed from: r */
    private C0012m m325r() throws IOException {
        this.f499j = 2;
        this.f449a = RunnableC0018s.f369p;
        m281b(false);
        m296e("Opera Mini");
        mo101d(86);
        m260a(C0010k.m62a(60), 0);
        m316m();
        return mo97b();
    }

    /* renamed from: s */
    private C0012m m326s() throws IOException {
        this.f449a = RunnableC0018s.f372s;
        this.f463b = RunnableC0018s.f360i;
        m281b(false);
        m296e(C0010k.m62a(2));
        m300f();
        if (this.f450a.f381a.numColors() > 2) {
            m261a("/om100.png", 98, 24, 745);
        }
        m300f();
        mo101d(86);
        m260a(f434c, 0);
        m260a(new StringBuffer().append(" (").append(C0010k.m64a("microedition.configuration")).append(", ").append(C0010k.m64a("microedition.profiles")).append(", ").append(C0010k.f158a).append(")").toString(), 0);
        m300f();
        mo101d(86);
        m260a("Copyright (c) 2005-2006 ", 0);
        m264a("http://www.opera.com/", "Opera Software ASA ");
        m260a(". All rights reserved.", 0);
        m300f();
        mo101d(86);
        m260a("This product includes TinyLine software (GZIP decoder) developed by Andrew Girow. ", 0);
        m264a("http://www.tinyline.com/", "http://www.tinyline.com/");
        m300f();
        if (C0010k.f147K) {
            m260a(new StringBuffer().append("Proxy URL: ").append(C0010k.f186g).toString(), 0);
            m300f();
        }
        mo101d(86);
        m304g();
        m300f();
        return mo97b();
    }

    /* renamed from: t */
    private C0012m m327t() throws IOException {
        this.f499j = 2;
        this.f449a = RunnableC0018s.f372s;
        this.f463b = RunnableC0018s.f360i;
        m281b(false);
        m296e(C0010k.m62a(53));
        m302f(C0010k.m62a(84));
        m286c(C0010k.m62a(100), (String) this.f447a.pageImageData.f456a[1]);
        m286c(C0010k.m62a(93), this.f447a.pageImageData.m351c());
        m267a(C0010k.m62a(85), (byte[]) this.f447a.pageImageData.f456a[2]);
        m286c(C0010k.m62a(86), C0010k.m103b(this.f447a.pageImageData.f437a));
        m286c(C0010k.m62a(87), new StringBuffer().append("").append(this.f447a.pageImageData.f486f).append("/").append(this.f447a.pageImageData.f491g).toString());
        m302f(C0010k.m62a(88));
        m266a(C0010k.m62a(89), false);
        return mo97b();
    }

    /* renamed from: a */
    public final int m328a() {
        if (this.f494h == 3) {
            return 100;
        }
        if (this.f494h == 6) {
            return this.f437a;
        }
        return 0;
    }

    /* renamed from: a */
    public final int m329a(int i) {
        if (i > this.f490f.length || i < 0) {
            return -1;
        }
        return this.f490f[i];
    }

    /* renamed from: a */
    public final int mo92a(int i, int i2, boolean z) {
        for (int length = this.f472c.length - 1; length >= 0; length--) {
            int i3 = this.f472c[length];
            if ((this.f484e[length] & i2) != 0 && i3 < i) {
                return i3;
            }
        }
        if (!z || this.f453a == null) {
            return -1;
        }
        return mo92a(this.f453a.length, i2, false);
    }

    /* renamed from: a */
    public final int mo93a(int i, int i2, boolean z, boolean z2) {
        if (this.f478d == null) {
            return -1;
        }
        int length = this.f472c.length;
        for (byte b = 0; b < length; b++) {
            int i3 = this.f472c[b];
            if ((this.f484e[b] & i2) != 0 && i3 > i && (!z2 || b >= this.f436a)) {
                return i3;
            }
        }
        if (z) {
            return mo93a(0, i2, false, z2);
        }
        return -1;
    }

    /* renamed from: a */
    public final int m332a(String str) {
        if (!(str == null || str.length() <= 0 || this.f457a == null || this.f479d == null)) {
            for (int i = 0; i < this.f457a.length; i++) {
                if (this.f457a[i].equals(str)) {
                    return this.f479d[i];
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final String m333a() {
        return (String) this.f456a[0];
    }

    /* renamed from: a */
    public final String m334a(int i) throws UTFDataFormatException, UnsupportedEncodingException {
        String str;
        if (i < 0 || i >= this.f453a.length || (this.f453a[i] != 76 && this.f453a[i] != 87 && this.f453a[i] != 80 && this.f453a[i] != 109)) {
            return null;
        }
        short a = C0010k.m74a(this.f453a, i + 1);
        synchronized (f432a) {
            str = new String(f432a, 0, C0010k.m58a(this.f453a, i + 3, a, f432a, 0));
        }
        return str;
    }

    /* renamed from: a */
    public final String mo95a(boolean z) {
        String a = m333a();
        if (!(!z || this.f487f == null || a == null)) {
            a = new StringBuffer().append(a).append("#").append(this.f487f).toString();
        }
        String d = m354d();
        if (a == null || d == null) {
            return a;
        }
        if (!a.endsWith("/") && !d.startsWith("/")) {
            a = new StringBuffer().append(a).append("/").toString();
        }
        return new StringBuffer().append(a).append(d).toString();
    }

    /* renamed from: a */
    public final Image m336a(int i) {
        if (this.f458a == null || i < 0 || i >= this.f458a.length || i >= this.f489f.length) {
            return null;
        }
        if (this.f458a[i] != null) {
            return this.f458a[i];
        }
        try {
            short a = C0010k.m74a(this.f453a, this.f489f[i] + 1 + 7);
            short a2 = C0010k.m74a(this.f453a, this.f489f[i] + 1 + 7 + 2 + a);
            int i2 = a + this.f489f[i] + 1 + 7 + 2 + 2;
            if (i2 < 0 || a2 < 1 || i2 + a2 >= this.f453a.length) {
                return null;
            }
            this.f458a[i] = C0010k.m72a(this.f453a, i2, a2);
            return this.f458a[i];
        } catch (Throwable th) {
            if (!(th instanceof OutOfMemoryError) || this.f450a == null) {
                return null;
            }
            this.f450a.m232a();
            return null;
        }
    }

    /* renamed from: a */
    public final C0012m mo96a(String str, boolean z, boolean z2, String str2) throws IOException {
        byte[] bytes;
        try {
            this.f444a = Connector.open(str2, 3, !C0010k.f138B);
            if (z2) {
                m339a(1);
            }
            try {
                this.f495h = null;
                this.f444a.setRequestMethod("POST");
                try {
                    boolean z3 = !C0010k.f141E;
                    if (C0010k.f211z || z3) {
                        m292d("x-ac", "image/jpeg");
                    }
                    this.f444a.setRequestProperty("Connection", "close");
                    this.f444a.setRequestProperty("Content-Type", "application/xml");
                    if (this.f518s) {
                        this.f444a.setRequestProperty("Pragma", "No-cache");
                    }
                    m292d("x-o", Integer.toString(13));
                    m292d("x-u", C0010k.m65a(new StringBuffer().append("/obml/").append(str).toString(), false, true));
                    m292d("x-l", C0010k.f180e);
                    m292d("x-v", "Opera Mini/1.2.2960/hifi/norrisbrage/us");
                    m292d("x-ua", C0010k.f189h);
                    m292d("x-si", String.valueOf(C0010k.f191i));
                    if (C0010k.f196k) {
                        m292d("x-np", "foo");
                    }
                    if (C0010k.f147K) {
                        m292d("x-d-m", "1");
                    }
                    m297e("x-m-c", "microedition.configuration");
                    m297e("x-m-ps", "microedition.profiles");
                    m297e("x-m-pm", "microedition.platform");
                    m297e("x-m-l", "microedition.locale");
                    m297e("x-m-e", "microedition.encoding");
                    if (C0010k.f179e != 0) {
                        m292d("x-ps", String.valueOf(C0010k.f179e));
                    }
                    m292d("x-dp", new StringBuffer().append("w:").append(this.f450a.getWidth()).append(";h:").append(this.f450a.getHeight()).append(";c:").append(this.f450a.f381a.numColors()).append(";m:").append(C0010k.f156a).append(";i:").append(C0010k.f145I ? 1 : 2).append(";q:").append(C0010k.f153Q ? 1 : 0).append(";f:").append(C0010k.f148L ? 1 : 0).append(";j:").append(C0010k.f144H ? 1 : 0).append(";l:").append(this.f450a.f381a.numAlphaLevels()).toString());
                    m292d("x-c", C0010k.f166b);
                    m292d("x-h", C0010k.f172c);
                    m292d("x-sc", C0010k.f177d);
                    m292d("x-rr", this.f462b);
                    m292d("x-var", m354d());
                    m292d("x-ug", "1");
                    m292d("x-b", "norrisbrage");
                    m292d("x-co", "us");
                    m292d("x-mf", String.valueOf(C0010k.f170c));
                    m292d("x-sn", new StringBuffer().append(C0010k.f151O ? "1" : "0").append(";").append(C0010k.f152P ? "1" : "0").toString());
                    if (C0010k.f154R) {
                        m292d("x-r", "1");
                        C0010k.f154R = false;
                    }
                    if (!C0010k.f208w) {
                        m292d("x-e", "gzip");
                    }
                    if (m288c()) {
                        return null;
                    }
                    try {
                        DataOutputStream openDataOutputStream = this.f444a.openDataOutputStream();
                        for (byte b : this.f495h.getBytes()) {
                            openDataOutputStream.writeByte(b);
                        }
                        openDataOutputStream.close();
                    } catch (Exception e) {
                        this.f501k = 3;
                    } finally {
                        this.f495h = null;
                    }
                    try {
                        this.f442a = this.f444a.openInputStream();
                        try {
                            this.f503l = this.f444a.getResponseCode();
                            this.f444a.getType();
                            C0010k.f152P = true;
                            if (!C0010k.f151O) {
                                C0010k.f151O = true;
                                C0010k.m106b();
                            }
                            if (m288c()) {
                                return null;
                            }
                            if (z2) {
                                m339a(2);
                            }
                            this.f440a = new C0005f(this.f442a);
                            try {
                                C0012m mVar = new C0012m(this.f440a, true);
                                if (m288c()) {
                                    return null;
                                }
                                if (!z2) {
                                    return mVar;
                                }
                                m339a(3);
                                return mVar;
                            } catch (IOException e2) {
                                this.f501k = 3;
                                throw e2;
                            }
                        } catch (IOException e3) {
                            this.f501k = 9;
                            throw e3;
                        }
                    } catch (InterruptedIOException e4) {
                        this.f501k = 8;
                        m347b();
                        return null;
                    } catch (IOException e5) {
                        this.f501k = 3;
                        if (z) {
                            m347b();
                            return mo96a(str, false, z2, str2);
                        }
                        throw e5;
                    }
                } catch (IOException e6) {
                    this.f501k = 7;
                    throw e6;
                }
            } catch (IOException e7) {
                this.f501k = 6;
                throw e7;
            }
        } catch (SecurityException e8) {
            this.f501k = 1;
            throw e8;
        } catch (ConnectionNotFoundException e9) {
            this.f501k = 2;
            throw e9;
        } catch (IOException e10) {
            this.f501k = 3;
            throw e10;
        } catch (IllegalArgumentException e11) {
            this.f501k = 4;
            throw e11;
        } catch (Throwable th) {
            this.f501k = 5;
            return null;
        }
    }

    /* renamed from: a */
    public final void m338a() {
        this.f452a = true;
        m339a(10);
    }

    /* renamed from: a */
    public final void m339a(int i) {
        this.f494h = i;
        if (this.f447a != null) {
            this.f447a.mo45a(this);
        }
    }

    /* renamed from: a */
    public final void m340a(String str) {
        int indexOf;
        if (str != null && (indexOf = str.indexOf(35)) != -1 && str.length() > indexOf + 1) {
            this.f487f = str.substring(indexOf + 1);
            if (this.f447a != null) {
                this.f447a.f326i = Window.f290l;
            }
        }
    }

    /* renamed from: a */
    public final void m341a(boolean z) throws Exception {
        C0012m a;
        this.f518s = z;
        String a2 = m333a();
        if (a2 == null || a2.length() == 0) {
            a2 = "opera:start";
        }
        if (a2.startsWith("opera:") || a2.startsWith("rms:")) {
            try {
                this.f477d = true;
                this.f510o = false;
                if (a2.equals("opera:start") && C0010k.f191i > -1) {
                    try {
                        a = mo91a(C0010k.f191i);
                    } catch (Throwable th) {
                        C0010k.f191i = -2;
                        C0010k.m106b();
                        try {
                            RecordStore openRecordStore = RecordStore.openRecordStore("d", false);
                            byte[] bArr = new byte[0];
                            if (openRecordStore.getNextRecordID() > 1) {
                                openRecordStore.setRecord(1, bArr, 0, 0);
                            }
                            openRecordStore.closeRecordStore();
                        } catch (RecordStoreException e) {
                        }
                        throw new Exception("RMS error for start.");
                    }
                } else if (a2.equals("opera:start")) {
                    a = m303g();
                } else if (a2.equals("opera:menu")) {
                    a = m307i();
                } else if (a2.equals("opera:bookmarksmenu")) {
                    a = m309j();
                } else if (a2.equals("opera:submenu-tools")) {
                    a = m305h();
                } else if (a2.equals("opera:alert")) {
                    a = m311k();
                } else {
                    this.f498i = true;
                    if (a2.equals("opera:about")) {
                        a = m326s();
                    } else if (a2.equals("opera:recommend")) {
                        a = m283c();
                    } else if (a2.equals("opera:help")) {
                        a = mo102d();
                    } else if (a2.equals("opera:helpintro")) {
                        a = mo106f();
                    } else if (a2.equals("opera:helpshortcuts")) {
                        a = mo104e();
                    } else if (a2.equals("opera:pageinfo")) {
                        a = m327t();
                    } else if (a2.equals("opera:bookmarks")) {
                        a = m317n();
                    } else if (a2.equals("opera:bookmark")) {
                        a = m255a(this.f447a.pageImageData.f456a);
                    } else if (a2.equals("opera:bookmark-add")) {
                        Object[] objArr = null;
                        if (!(this.f447a.pageImageData == null || this.f447a.f307a == null)) {
                            objArr = this.f447a.f307a;
                        }
                        a = m255a(objArr);
                    } else if (a2.equals("opera:bookmark-edit")) {
                        int d = this.f447a.pageImageData.m353d(this.f447a.f300a);
                        a = m256a(C0010k.m100a(d), d);
                    } else if (a2.equals("opera:history")) {
                        a = m313l();
                    } else if (a2.equals("opera:settings")) {
                        a = m323q();
                    } else if (a2.startsWith("opera:debugcache")) {
                        a = mo90a();
                    } else if (a2.equals("opera:clearhistorydialog")) {
                        this.f506m = true;
                        a = m315m();
                    } else if (a2.equals("opera:deletebookmarkdialog")) {
                        this.f508n = true;
                        a = m315m();
                    } else if (a2.equals("opera:platformrequestdialog")) {
                        a = m319o();
                    } else if (a2.equals("opera:sendsmsdialog")) {
                        a = m321p();
                    } else if (a2.equals("opera:firsttime")) {
                        a = m325r();
                    } else if (a2.equals("opera:clearbytes")) {
                        C0010k.f164b = 0;
                        a = m326s();
                    } else if (a2.equals("opera:cleartotal")) {
                        C0010k.f171c = 0;
                        C0010k.f164b = 0;
                        C0010k.m106b();
                        a = m326s();
                    } else {
                        a = mo94a(a2);
                    }
                }
                try {
                    m268a(a, this.f477d);
                } catch (OutOfMemoryError e2) {
                    m339a(9);
                    this.f450a.mo79k();
                    m355d();
                    m338a();
                    m347b();
                    System.gc();
                }
            } catch (IOException e3) {
            }
        } else {
            Thread thread = new Thread(this);
            thread.setPriority(10);
            thread.start();
        }
    }

    /* renamed from: a */
    public final boolean m342a() {
        String a = m333a();
        if (a == null) {
            a = "";
        }
        return a.startsWith("opera:start") || a.equals("opera:help") || !(m349b() || C0010k.f166b == null || C0010k.f166b.length() == 0);
    }

    /* renamed from: b */
    public final int m343b() {
        if (this.f494h == 3) {
            return this.f468c;
        }
        if (this.f494h == 6) {
            return mo100c();
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo98b(int i) {
        if (i > this.f485e.length || i < 0) {
            return -1;
        }
        return this.f485e[i];
    }

    /* renamed from: b */
    public final String m345b() {
        return (String) this.f456a[4];
    }

    /* renamed from: b */
    public final String m346b(int i) {
        String str;
        if (i < 0 || i >= this.f453a.length - 1) {
            return "";
        }
        if (((char) this.f453a[i]) == 'K') {
            i = this.f489f[C0010k.m74a(this.f453a, i + 1 + 4)];
        }
        short a = C0010k.m74a(this.f453a, i + 1 + 7);
        if (a < 0) {
            return "";
        }
        synchronized (f432a) {
            str = new String(f432a, 0, C0010k.m58a(this.f453a, i + 1 + 7 + 2, a, f432a, 0));
        }
        return str;
    }

    /* renamed from: b */
    public final void m347b() {
        try {
            if (this.f442a != null) {
                this.f442a.close();
                this.f442a = null;
            }
        } catch (Throwable th) {
        }
        try {
            if (this.f440a != null) {
                this.f440a.close();
                this.f440a = null;
            }
        } catch (Throwable th2) {
        }
        try {
            if (this.f444a != null) {
                this.f444a.close();
                this.f444a = null;
            }
        } catch (Throwable th3) {
        }
        this.f471c = null;
    }

    /* renamed from: b */
    public final void m348b(int i) {
        System.gc();
        long freeMemory = Runtime.getRuntime().freeMemory();
        boolean z = true;
        while (z && freeMemory < ((long) i)) {
            z = this.f450a.m232a();
            freeMemory = Runtime.getRuntime().freeMemory();
        }
    }

    /* renamed from: b */
    public final boolean m349b() {
        if (this.f477d) {
            return true;
        }
        if (this.f443a == null || this.f443a.length() <= 0 || !C0010k.m96a(this.f443a)) {
            return m333a() != null && C0010k.m96a(m333a());
        }
        return true;
    }

    /* renamed from: c */
    public final int m350c(int i) {
        int i2 = 0;
        int abs = Math.abs(i);
        for (int i3 = 0; i3 <= this.f451a; i3++) {
            i2 = this.f466b[i3];
            if (abs >= i2 && abs <= i2) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final String m351c() {
        return C0010k.m104b((this.f443a == null || this.f443a.length() <= 0) ? m333a() : this.f443a);
    }

    /* renamed from: c */
    public final void m352c() {
        if (!(this.f459a == null || this.f459a.length == 0)) {
            for (int i = 0; i < this.f459a.length; i++) {
                if (this.f459a[i] != null && this.f459a[i].f265a != null && this.f459a[i].f265a.equals("clockadjustment") && this.f459a[i].f277d == 24 && this.f450a != null) {
                    C0014o oVar = this.f459a[i];
                    String a = RunnableC0018s.m198a(-1);
                    for (int i2 = 0; i2 < 24; i2++) {
                        String a2 = RunnableC0018s.m198a(i2);
                        oVar.f268a[0][i2] = a2;
                        oVar.f273b[0][i2] = String.valueOf(i2);
                        oVar.f269a[0][i2] = a2.equals(a);
                    }
                    oVar.f275c = null;
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public final int m353d(int i) {
        if (this.f453a == null || i < 0 || i > this.f453a.length) {
            return -1;
        }
        return m249a(this.f472c, this.f469c, i);
    }

    /* renamed from: d */
    public final String m354d() {
        return (String) this.f456a[3];
    }

    /* renamed from: d */
    public final void m355d() {
        this.f448a = null;
        this.f441a = null;
        this.f484e = null;
        this.f478d = null;
        this.f485e = null;
        this.f490f = null;
        this.f457a = null;
        this.f479d = null;
        this.f459a = null;
        this.f458a = null;
        this.f489f = null;
        this.f454a = null;
        this.f460a = null;
        this.f473c = null;
        this.f466b = null;
        System.gc();
    }

    /* renamed from: e */
    public final int m356e(int i) {
        if (this.f453a == null || i < 0 || i >= this.f453a.length) {
            return -1;
        }
        switch ((char) this.f453a[i]) {
            case 'I':
            case 'K':
                return 4;
            case 'L':
                return 0;
            case 'P':
                return 6;
            case 'W':
                return 5;
            case 'i':
            case 'u':
                return 1;
            case 'm':
                return 7;
            case 'p':
                return 2;
            case 's':
                return 3;
            case 'x':
                return 2;
            default:
                return -1;
        }
    }

    /* renamed from: e */
    public final String m357e() {
        return (String) this.f456a[1];
    }

    /* renamed from: e */
    public final void m358e() {
        for (int i = 0; i < this.f519t; i++) {
            m336a(i);
        }
    }

    /* renamed from: f */
    public final int m359f(int i) {
        int i2 = 0;
        int i3 = this.f451a;
        while (i3 - i2 > 1) {
            int i4 = (i3 + i2) / 2;
            if (this.f454a[i4] < i) {
                i2 = i4;
            } else {
                i3 = i4;
            }
        }
        return this.f454a[i3] < i ? i3 : i2;
    }

    /* renamed from: f */
    public final String m360f() {
        if (C0010k.f186g == null || C0010k.f186g.length() <= 0) {
            return "no url proxy";
        }
        int lastIndexOf = C0010k.f186g.lastIndexOf(46);
        return new StringBuffer().append("(error: ").append(this.f501k).append(".").append(this.f503l).append(".").append(C0010k.f186g.substring(lastIndexOf > -1 ? lastIndexOf + 1 : 0, C0010k.f186g.length())).append("). ").toString();
    }

    public final void run() {
        try {
            if (!m288c()) {
                String a = m333a();
                if (C0010k.f166b == null || C0010k.f166b.length() == 0) {
                    this.f499j = 2;
                }
                try {
                    RunnableC0018s.f362j = false;
                    m268a(mo96a(a, C0010k.f197l, true, C0010k.f186g), false);
                } catch (OutOfMemoryError e) {
                    m339a(9);
                    if (this.f450a != null) {
                        this.f450a.m227a(1);
                    }
                    m338a();
                    m347b();
                    System.gc();
                    if (this.f450a != null) {
                        this.f450a.repaint();
                    }
                }
                if (m288c()) {
                    m339a(10);
                }
            } else if (m288c()) {
                m339a(10);
            }
        } catch (Exception e2) {
            String f = m360f();
            switch (this.f501k) {
                case 0:
                case 8:
                    break;
                case 1:
                    this.f450a.mo68b(C0010k.m62a(43));
                    break;
                case 2:
                    this.f450a.mo68b(new StringBuffer().append(C0010k.m62a(74)).append(" ").append(f).toString());
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 10:
                case 13:
                case 14:
                default:
                    this.f450a.mo68b(new StringBuffer().append(C0010k.m63a(116, new StringBuffer().append(C0010k.m62a(40)).append(" > ").append(C0010k.m62a(39)).append(" > ").append(C0010k.m62a(68)).toString())).append(" ").append(f).toString());
                    break;
                case 9:
                case 11:
                case 12:
                    this.f450a.mo68b(new StringBuffer().append("You need to setup your device with an internet profile ").append(f).toString());
                    break;
                case 15:
                    this.f450a.mo68b(new StringBuffer().append(C0010k.m62a(75)).append(" ").append(f).toString());
                    break;
            }
            m338a();
            C0010k.f186g = "http://80.232.117.10:80/";
            C0010k.m106b();
            if (m288c()) {
                m339a(10);
            }
        } catch (Throwable th) {
            if (m288c()) {
                m339a(10);
            }
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }
}
