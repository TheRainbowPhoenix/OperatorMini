package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.microedition.io.ContentConnection;
import javax.microedition.io.InputConnection;
import javax.microedition.io.file.FileConnection;
import javax.microedition.io.file.FileSystemRegistry;
import javax.microedition.lcdui.Image;

/* renamed from: a  reason: default package */
public class a {
    static String Code;

    /* renamed from: Code  reason: collision with other field name */
    private static Vector f195Code;

    /* renamed from: Code  reason: collision with other field name */
    private static ContentConnection f196Code;
    private static String I;

    /* renamed from: I  reason: collision with other field name */
    public static boolean f197I;
    private static String J;
    private static String Z;

    /* renamed from: Code  reason: collision with other field name */
    int f198Code = -1;

    /* renamed from: Code  reason: collision with other field name */
    private Image f199Code;

    /* renamed from: Code  reason: collision with other field name */
    boolean f200Code;

    /* renamed from: I  reason: collision with other field name */
    int f201I;

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1 = r0.openDataOutputStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r1.writeByte(r11.f36I.length >> 16);
        r1.writeShort(r11.f36I.length);
        r1.write(r11.f36I);
        r1.flush();
        r7 = new java.lang.Object[3];
        r7[0] = new java.lang.StringBuffer().append(r12).append("/").append(r8).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a0, code lost:
        if (r14 == null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a2, code lost:
        r7[1] = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a7, code lost:
        if (r11.f25Code == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a9, code lost:
        r3 = r11.f25Code;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ab, code lost:
        r7[2] = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ae, code lost:
        if (r13 != -1) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b0, code lost:
        defpackage.e.f287a.addElement(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b5, code lost:
        defpackage.Code.f89Code.Code(defpackage.e.f287a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d0, code lost:
        if (r11.f32I == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d2, code lost:
        r14 = r11.f32I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d5, code lost:
        r14 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d8, code lost:
        r3 = new byte[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dc, code lost:
        defpackage.e.f287a.insertElementAt(r7, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e2, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e3, code lost:
        r7 = r3;
        r4 = r1;
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f9, code lost:
        defpackage.e.Code((java.io.OutputStream) r4);
        defpackage.e.Code(r8);
        defpackage.e.C(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ee A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int Code(defpackage.B r11, java.lang.String r12, int r13, java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 285
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a.Code(B, java.lang.String, int, java.lang.String):int");
    }

    public static int Code(String str) {
        Throwable th;
        Exception e;
        Connection connection = null;
        try {
            Connection connection2 = (FileConnection) Connector.open(new StringBuffer().append("file:///").append(str).toString(), 1);
            try {
                int fileSize = (int) connection2.fileSize();
                e.Code(connection2);
                return fileSize;
            } catch (Exception e2) {
                e = e2;
                connection = connection2;
                try {
                    Code(e);
                    e.Code(connection);
                    return -1;
                } catch (Throwable th2) {
                    th = th2;
                    e.Code(connection);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                connection = connection2;
                e.Code(connection);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            Code(e);
            e.Code(connection);
            return -1;
        }
    }

    public static String Code() {
        return Z != null ? e.m124Code(164, Code(true)) : Code == null ? "/" : Code;
    }

    private static String Code(boolean z) {
        if (f196Code == null || J == null) {
            return null;
        }
        String str = z ? ".name" : "";
        if (J.startsWith("image")) {
            str = new StringBuffer().append("fileconn.dir.photos").append(str).toString();
        } else if (J.startsWith("video")) {
            str = new StringBuffer().append("fileconn.dir.videos").append(str).toString();
        } else if (J.startsWith("audio")) {
            str = new StringBuffer().append("fileconn.dir.music").append(str).toString();
        }
        if (str.length() == 0) {
            return null;
        }
        String property = System.getProperty(str);
        if (!z) {
            return property;
        }
        if ((property != null && !property.equals("null")) || Z == null) {
            return property;
        }
        String substring = Z.substring(Z.lastIndexOf(47, Z.length() - 2));
        return substring.endsWith("/") ? substring.substring(0, substring.length() - 1) : substring;
    }

    /* renamed from: Code  reason: collision with other method in class */
    public static InputConnection m103Code(String str) {
        try {
            return Connector.open(new StringBuffer().append("file:///").append(str).toString(), 1);
        } catch (Exception e) {
            Code(e);
            return null;
        }
    }

    /* renamed from: Code  reason: collision with other method in class */
    public static void m104Code() {
        Z = null;
        e.Code((Connection) f196Code);
        f196Code = null;
        J = null;
    }

    /* renamed from: Code  reason: collision with other method in class */
    public static void m105Code(String str) {
        if ("/".equals(str)) {
            Z = null;
            Code = null;
        } else if ("..".equals(str)) {
            int lastIndexOf = Code.lastIndexOf(47, Code.length() - 2);
            if (lastIndexOf > 0) {
                Code = Code.substring(0, lastIndexOf + 1);
            } else {
                Code = null;
            }
        } else {
            Code = str;
        }
    }

    private static void Code(Throwable th) {
        e Code2 = Code.m73Code(40);
        if (Code2 != null) {
            Code.f89Code.I(Code2);
        }
        Code.f89Code.m91Code(th.getMessage());
        Code = null;
    }

    private static void Code(Vector vector, Object obj) {
        String lowerCase = ((String) ((Object[]) obj)[2]).toLowerCase();
        int size = vector.size() - 1;
        if (size < 0 || lowerCase.compareTo(((String) ((Object[]) vector.lastElement())[2]).toLowerCase()) >= 0) {
            vector.addElement(obj);
            return;
        }
        while (size > 0 && lowerCase.compareTo(((String) ((Object[]) vector.elementAt(size - 1))[2]).toLowerCase()) < 0) {
            size--;
        }
        vector.insertElementAt(obj, size);
    }

    /* renamed from: Code  reason: collision with other method in class */
    static boolean m106Code() {
        return Code == null && Z == null;
    }

    public static boolean Code(String str, String str2) {
        String str3;
        try {
            if (e.m152Code()) {
                String[] Code2 = e.m177Code(str);
                String str4 = Code2[0];
                str = Code2[1];
                str3 = str4;
            } else {
                str3 = null;
            }
            m104Code();
            J = str2;
            f196Code = Connector.open(e.Code(str, false));
            if (str3 != null) {
                f196Code.setRequestProperty("X-Online-Host", str3);
            }
            Z = Code(false);
            return true;
        } catch (Exception e) {
            Code(e);
            return false;
        }
    }

    /* renamed from: Code  reason: collision with other method in class */
    static boolean m107Code(boolean z) {
        String str = null;
        if (!z && e.f340p != null && e.f340p.length() > 0) {
            return true;
        }
        if (z && Code != null && Code.length() > 0) {
            str = Code;
        }
        if (str != null) {
            if (str.startsWith("file:///")) {
                str = str.substring(8);
            }
            if (str.endsWith("/")) {
                str = str.substring(0, str.length() - 1);
            }
            e.f340p = str;
            e.C(false);
        }
        return e.f340p.length() > 0;
    }

    static void I(String str) {
        Throwable th;
        Exception e;
        Connection connection = null;
        try {
            if (!str.endsWith("/")) {
                str = new StringBuffer().append(str).append("/").toString();
            }
            Connection connection2 = (FileConnection) Connector.open(new StringBuffer().append("file:///").append(Code).append(str).toString(), 3);
            try {
                if (!connection2.exists()) {
                    connection2.mkdir();
                }
                e.Code(connection2);
            } catch (Exception e2) {
                e = e2;
                connection = connection2;
                try {
                    Code(e);
                    e.Code(connection);
                } catch (Throwable th2) {
                    th = th2;
                    e.Code(connection);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                connection = connection2;
                e.Code(connection);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            Code(e);
            e.Code(connection);
        }
    }

    static void J(String str) {
        Connection connection;
        DataInputStream dataInputStream;
        Connection connection2;
        try {
            Connection connection3 = (FileConnection) Connector.open(new StringBuffer().append("file:///").append(str).append("/").toString(), 1);
            try {
                Enumeration list = connection3.list("*.obml", false);
                connection3.close();
                e.f287a.removeAllElements();
                DataInputStream dataInputStream2 = null;
                connection = connection3;
                while (list.hasMoreElements()) {
                    try {
                        String str2 = (String) list.nextElement();
                        try {
                            connection2 = (FileConnection) Connector.open(new StringBuffer().append("file:///").append(new StringBuffer().append(str).append("/").append(str2).toString()).toString(), 1);
                            try {
                                dataInputStream2 = connection2.openDataInputStream();
                                e.Code((InputStream) dataInputStream2, 14L);
                                String readUTF = dataInputStream2.readUTF();
                                int readShort = dataInputStream2.readShort();
                                byte[] bArr = new byte[readShort];
                                dataInputStream2.readFully(bArr, 0, readShort);
                                Vector vector = e.f287a;
                                Object[] objArr = new Object[3];
                                objArr[0] = new StringBuffer().append(str).append("/").append(str2).toString();
                                objArr[1] = readUTF != null ? readUTF : "";
                                objArr[2] = bArr;
                                vector.addElement(objArr);
                            } catch (Throwable th) {
                                dataInputStream = dataInputStream2;
                                e.Code(connection2);
                                e.Code((InputStream) dataInputStream);
                                dataInputStream2 = dataInputStream;
                                connection = connection2;
                            }
                        } catch (Throwable th2) {
                            dataInputStream = dataInputStream2;
                            connection2 = connection;
                            e.Code(connection2);
                            e.Code((InputStream) dataInputStream);
                            dataInputStream2 = dataInputStream;
                            connection = connection2;
                        }
                    } catch (Throwable th3) {
                        e.Code(connection);
                    }
                    try {
                        e.Code(connection2);
                        e.Code((InputStream) dataInputStream2);
                        connection = connection2;
                    } catch (Throwable th4) {
                        connection = connection2;
                        e.Code(connection);
                    }
                }
                e.Code(connection);
            } catch (Throwable th5) {
                connection = connection3;
                e.Code(connection);
            }
        } catch (Throwable th6) {
            connection = null;
            e.Code(connection);
        }
    }

    static void Z(String str) {
        Connection connection;
        Connection connection2 = null;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    connection = (FileConnection) Connector.open(new StringBuffer().append("file:///").append(str).toString(), 2);
                    try {
                        connection.delete();
                        e.Code(connection);
                    } catch (Throwable th) {
                        connection2 = connection;
                        e.Code(connection2);
                        return;
                    }
                }
            } catch (Throwable th2) {
                e.Code(connection2);
                return;
            }
        }
        connection = null;
        e.Code(connection);
    }

    /* renamed from: Code  reason: collision with other method in class */
    public final Vector m108Code(boolean z) {
        String str;
        f195Code = new Vector();
        f197I = false;
        if (Z != null) {
            try {
                f195Code.addElement(new Object[]{"/", new Integer(5), e.m122Code(162), null});
            } catch (Exception e) {
                Code(e);
                return f195Code;
            }
        } else if (Code == null) {
            String[] strArr = {"photos", "graphics", "videos", "music", "tones"};
            for (int i = 0; i < strArr.length; i++) {
                String property = System.getProperty(new StringBuffer().append("fileconn.dir.").append(strArr[i]).toString());
                if (property != null && property.startsWith("file:///")) {
                    String property2 = System.getProperty(new StringBuffer().append("fileconn.dir.").append(strArr[i]).append(".name").toString());
                    if (property2 == null || property2.length() == 1) {
                        property2 = property.substring(8);
                    }
                    int lastIndexOf = property2.lastIndexOf(47, property2.length() - 2);
                    if (lastIndexOf >= 0) {
                        property2 = property2.substring(lastIndexOf + 1);
                    }
                    f195Code.addElement(new Object[]{property.substring(8), new Integer(5), property2, null});
                }
            }
            String property3 = System.getProperty("fileconn.dir.roots.names");
            Enumeration listRoots = FileSystemRegistry.listRoots();
            if (!listRoots.hasMoreElements()) {
                throw new IOException(e.m122Code(163));
            }
            while (listRoots.hasMoreElements()) {
                String str2 = (String) listRoots.nextElement();
                if (property3 == null || property3.length() <= 0) {
                    str = str2;
                } else {
                    int indexOf = property3.indexOf(59);
                    if (indexOf != -1) {
                        str = property3.substring(0, indexOf);
                        property3 = property3.substring(indexOf + 1);
                    } else {
                        str = property3;
                    }
                }
                f195Code.addElement(new Object[]{str2, new Integer(5), str, null});
                property3 = property3;
            }
            if (f195Code.size() == 1) {
                String str3 = (String) ((Object[]) f195Code.firstElement())[0];
                I = str3;
                Code = str3;
                f195Code = new Vector();
            }
        }
        if (f195Code.size() == 0) {
            FileConnection open = Connector.open(new StringBuffer().append("file:///").append(Code).toString(), 1);
            Enumeration list = open.list();
            e.Code((Connection) open);
            this.f199Code = m109Code();
            Vector vector = new Vector();
            while (list.hasMoreElements()) {
                String str4 = (String) list.nextElement();
                int i2 = ((str4.endsWith("/") ? 1 : 0) << 2) | 3;
                if ((i2 & 4) == 0) {
                    if (!z) {
                        f197I = true;
                    }
                }
                Code((i2 & 4) == 0 ? f195Code : vector, new Object[]{new StringBuffer().append(Code).append(str4).toString(), new Integer(i2), str4, null});
            }
            for (int i3 = 0; i3 < f195Code.size(); i3++) {
                vector.addElement(f195Code.elementAt(i3));
            }
            f195Code = vector;
            if (!m106Code() && Z == null) {
                if (z && !e.aa) {
                    f195Code.insertElementAt(new Object[]{"+", new Integer(5), new StringBuffer().append("<").append(e.m122Code(171)).append(">").toString(), null}, 0);
                }
                if (I == null || !I.equals(Code)) {
                    f195Code.insertElementAt(new Object[]{"..", new Integer(5), "..", null}, 0);
                }
            }
        }
        return f195Code;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Code  reason: collision with other method in class */
    public final Image m109Code() {
        int B = e.B(0) + e.B(1);
        if (this.f199Code == null || this.f199Code.getHeight() != B) {
            this.f199Code = e.Code(e.m184I(82), 0, B, 0, true);
        }
        return this.f199Code;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00cb, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00cc, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00cb A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0024] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final javax.microedition.lcdui.Image Code(java.lang.Object[] r10) {
        /*
        // Method dump skipped, instructions count: 215
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a.Code(java.lang.Object[]):javax.microedition.lcdui.Image");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02ab, code lost:
        r11 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02c0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02c1, code lost:
        r1 = r0;
        r7 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02aa A[ExcHandler: all (r0v49 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:50:0x0160] */
    /* renamed from: Code  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m110Code(java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 715
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a.m110Code(java.lang.String):boolean");
    }
}
