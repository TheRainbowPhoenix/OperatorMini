//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.ContentConnection;
import javax.microedition.io.HttpConnection;
import javax.microedition.io.InputConnection;
import javax.microedition.io.file.FileConnection;
import javax.microedition.io.file.FileSystemRegistry;
import javax.microedition.lcdui.Image;

public class a {
    public static boolean I;
    private static ContentConnection Code;
    static String Code;
    private static String I;
    private static String Z;
    private static String J;
    int I;
    int Code = -1;
    boolean Code;
    private Image Code;
    private static Vector Code;

    public static InputConnection Code(String var0) {
        try {
            return (InputConnection)Connector.open("file:///" + var0, 1);
        } catch (Exception var1) {
            Code((Throwable)var1);
            return null;
        }
    }

    static boolean Code() {
        return Code == null && Z == null;
    }

    public a() {
    }

    public final Vector Code(boolean var1) {
        Exception var10000;
        label145: {
            Code = new Vector();
            I = false;
            int var3;
            String var4;
            Enumeration var13;
            boolean var10001;
            if (Z != null) {
                Vector var15 = Code;
                byte var16 = 4;

                try {
                    Object[] var17 = new Object[var16];
                    var17[0] = "/";
                    var17[1] = new Integer(5);
                    var17[2] = e.Code(162);
                    var17[3] = null;
                    var15.addElement(var17);
                } catch (Exception var8) {
                    var10000 = var8;
                    var10001 = false;
                    break label145;
                }
            } else {
                try {
                    if (Code == null) {
                        String[] var2 = new String[]{"photos", "graphics", "videos", "music", "tones"};
                        var3 = 0;

                        while(true) {
                            String var5;
                            int var6;
                            if (var3 >= var2.length) {
                                String var10 = System.getProperty("fileconn.dir.roots.names");
                                if (!(var13 = FileSystemRegistry.listRoots()).hasMoreElements()) {
                                    throw new IOException(e.Code(163));
                                }

                                for(; var13.hasMoreElements(); Code.addElement(new Object[]{var4, new Integer(5), var5, null})) {
                                    var5 = var4 = (String)var13.nextElement();
                                    if (var10 != null && var10.length() > 0) {
                                        if ((var6 = var10.indexOf(59)) != -1) {
                                            var5 = var10.substring(0, var6);
                                            var10 = var10.substring(var6 + 1);
                                        } else {
                                            var5 = var10;
                                        }
                                    }
                                }

                                if (Code.size() == 1) {
                                    Code = I = (String)((Object[])Code.firstElement())[0];
                                    Code = new Vector();
                                }
                                break;
                            }

                            if ((var4 = System.getProperty("fileconn.dir." + var2[var3])) != null && var4.startsWith("file:///")) {
                                if ((var5 = System.getProperty("fileconn.dir." + var2[var3] + ".name")) == null || var5.length() == 1) {
                                    var5 = var4.substring(8);
                                }

                                if ((var6 = var5.lastIndexOf(47, var5.length() - 2)) >= 0) {
                                    var5 = var5.substring(var6 + 1);
                                }

                                Code.addElement(new Object[]{var4.substring(8), new Integer(5), var5, null});
                            }

                            ++var3;
                        }
                    }
                } catch (Exception var9) {
                    var10000 = var9;
                    var10001 = false;
                    break label145;
                }
            }

            try {
                if (Code.size() == 0) {
                    FileConnection var11;
                    var13 = (var11 = (FileConnection)Connector.open("file:///" + Code, 1)).list();
                    e.Code(var11);
                    this.Code = this.Code();
                    Vector var12 = new Vector();

                    while(true) {
                        int var14;
                        while(true) {
                            if (!var13.hasMoreElements()) {
                                for(var3 = 0; var3 < Code.size(); ++var3) {
                                    var12.addElement(Code.elementAt(var3));
                                }

                                Code = var12;
                                if (Code() || Z != null) {
                                    return Code;
                                }

                                if (var1 && !e.aa) {
                                    Code.insertElementAt(new Object[]{"+", new Integer(5), "<" + e.Code(171) + ">", null}, 0);
                                }

                                if (I == null || !I.equals(Code)) {
                                    Code.insertElementAt(new Object[]{"..", new Integer(5), "..", null}, 0);
                                }

                                return Code;
                            }

                            var4 = (String)var13.nextElement();
                            if (((var14 = 3 | var4.endsWith("/") << 2) & 4) != 0) {
                                break;
                            }

                            if (!var1) {
                                I = true;
                                break;
                            }
                        }

                        Code((Vector)((var14 & 4) == 0 ? Code : var12), (Object)(new Object[]{Code + var4, new Integer(var14), var4, null}));
                    }
                }

                return Code;
            } catch (Exception var7) {
                var10000 = var7;
                var10001 = false;
            }
        }

        Code((Throwable)var10000);
        return Code;
    }

    static boolean Code(boolean var0) {
        String var1 = null;
        if (!var0 && e.p != null && e.p.length() > 0) {
            return true;
        } else {
            if (var0 && Code != null && Code.length() > 0) {
                var1 = Code;
            }

            if (var1 != null) {
                if (var1.startsWith("file:///")) {
                    var1 = var1.substring(8);
                }

                if (var1.endsWith("/")) {
                    var1 = var1.substring(0, var1.length() - 1);
                }

                e.p = var1;
                e.C(false);
            }

            return e.p.length() > 0;
        }
    }

    private static String Code(boolean var0) {
        if (Code != null && J != null) {
            String var1 = var0 ? ".name" : "";
            if (J.startsWith("image")) {
                var1 = "fileconn.dir.photos" + var1;
            } else if (J.startsWith("video")) {
                var1 = "fileconn.dir.videos" + var1;
            } else if (J.startsWith("audio")) {
                var1 = "fileconn.dir.music" + var1;
            }

            if (var1.length() == 0) {
                return null;
            } else {
                var1 = System.getProperty(var1);
                if (var0 && (var1 == null || var1.equals("null")) && Z != null && (var1 = Z.substring(Z.lastIndexOf(47, Z.length() - 2))).endsWith("/")) {
                    var1 = var1.substring(0, var1.length() - 1);
                }

                return var1;
            }
        } else {
            return null;
        }
    }

    private static void Code(Throwable var0) {
        e var1;
        if ((var1 = Code.Code(40)) != null) {
            Code.Code.I(var1);
        }

        Code.Code.Code(var0.getMessage());
        Code = null;
    }

    private static void Code(Vector var0, Object var1) {
        String var2 = ((String)((Object[])var1)[2]).toLowerCase();
        int var3;
        if ((var3 = var0.size() - 1) >= 0 && var2.compareTo(((String)((Object[])var0.lastElement())[2]).toLowerCase()) < 0) {
            while(var3 > 0 && var2.compareTo(((String)((Object[])var0.elementAt(var3 - 1))[2]).toLowerCase()) < 0) {
                --var3;
            }

            var0.insertElementAt(var1, var3);
        } else {
            var0.addElement(var1);
        }
    }

    public static boolean Code(String var0, String var1) {
        String var2 = null;

        String var10000;
        try {
            if (e.Code()) {
                String[] var4;
                var2 = (var4 = e.Code(var0))[0];
                var0 = var4[1];
            }

            Code();
            J = var1;
            Code = (ContentConnection)Connector.open(e.Code(var0, false));
            if (var2 != null) {
                ((HttpConnection)Code).setRequestProperty("X-Online-Host", var2);
            }

            var10000 = Code(false);
        } catch (Exception var3) {
            Code((Throwable)var3);
            return false;
        }

        Z = var10000;
        return true;
    }

    public static void Code(String var0) {
        if ("/".equals(var0)) {
            Z = null;
            Code = null;
        } else if ("..".equals(var0)) {
            int var1;
            if ((var1 = Code.lastIndexOf(47, Code.length() - 2)) > 0) {
                Code = Code.substring(0, var1 + 1);
            } else {
                Code = null;
            }
        } else {
            Code = var0;
        }
    }

    final Image Code() {
        int var1 = e.B(0) + e.B(1);
        if (this.Code == null || this.Code.getHeight() != var1) {
            this.Code = e.Code(e.I(82), 0, var1, 0, true);
        }

        return this.Code;
    }

    public static String Code() {
        if (Z != null) {
            return e.Code(164, Code(true));
        } else {
            return Code == null ? "/" : Code;
        }
    }

    public static int Code(String var0) {
        FileConnection var1 = null;
        boolean var4 = false;

        long var10000;
        label35: {
            try {
                var4 = true;
                var10000 = (var1 = (FileConnection)Connector.open("file:///" + var0, 1)).fileSize();
                var4 = false;
                break label35;
            } catch (Exception var5) {
                Code((Throwable)var5);
                var4 = false;
            } finally {
                if (var4) {
                    e.Code(var1);
                }
            }

            e.Code(var1);
            return -1;
        }

        int var7 = (int)var10000;
        e.Code(var1);
        return var7;
    }

    static void I(String var0) {
        FileConnection var1 = null;
        String var10000 = var0;
        String var10001 = "/";

        try {
            if (!var10000.endsWith(var10001)) {
                var0 = var0 + "/";
            }

            if (!(var1 = (FileConnection)Connector.open("file:///" + Code + var0, 3)).exists()) {
                var1.mkdir();
            }

            return;
        } catch (Exception var4) {
            Code((Throwable)var4);
        } finally {
            e.Code(var1);
        }

    }

    static void Z(String var0) {
        FileConnection var1 = null;
        if (var0 != null) {
            String var10000 = var0;

            try {
                if (var10000.length() > 0) {
                    (var1 = (FileConnection)Connector.open("file:///" + var0, 2)).delete();
                }
            } finally {
                e.Code(var1);
                return;
            }
        }
    }

    static void J(String param0) {
        // $FF: Couldn't be decompiled
    }

    static int Code(B var0, String var1, int var2, String var3) {
        FileConnection var4 = null;
        DataOutputStream var5 = null;
        if (var0 != null && var0.I != null && var1 != null) {
            int var6 = 0;

            while(true) {
                ++var6;
                String var10000 = var0.Code;

                try {
                    int var7 = var10000.hashCode() ^ (new Long(System.currentTimeMillis())).hashCode();
                    String var20 = Integer.toHexString(var7) + ".obml";
                    String var8;
                    FileConnection var23 = var4 = (FileConnection)Connector.open(var8 = "file:///" + var1 + "/" + var20, 2);

                    try {
                        var23.create();
                    } catch (IOException var17) {
                        var4.close();
                        var8 = null;
                    }

                    if (var8 != null || var6 >= 5) {
                        (var5 = var4.openDataOutputStream()).writeByte(var0.I.length >> 16);
                        var5.writeShort(var0.I.length);
                        var5.write(var0.I);
                        var5.flush();
                        Object[] var19 = new Object[]{var1 + "/" + var20, var3 != null ? var3 : (var0.I != null ? var0.I : ""), var0.Code != null ? var0.Code : new byte[0]};
                        if (var2 == -1) {
                            e.a.addElement(var19);
                        } else {
                            e.a.insertElementAt(var19, var2);
                        }

                        Code.Code.Code(e.a);
                        break;
                    }
                } catch (Throwable var18) {
                    e.p = "";
                    Throwable var21 = var18;
                    boolean var12 = false;

                    boolean var22;
                    try {
                        var12 = true;
                        var22 = var21 instanceof SecurityException;
                        var12 = false;
                    } finally {
                        if (var12) {
                            e.Code(var5);
                            e.Code(var4);
                            e.C(false);
                        }
                    }

                    if (var22) {
                        e.Code(var5);
                        e.Code(var4);
                        e.C(false);
                        return 2;
                    }

                    e.Code(var5);
                    e.Code(var4);
                    e.C(false);
                    return 1;
                }
            }
        }

        Code = null;
        e.Code(var5);
        e.Code(var4);
        e.C(false);
        return 0;
    }

    public final Image Code(Object[] var1) {
        String var2 = (String)var1[0];
        FileConnection var3 = null;
        String var4 = null;
        Image var5 = this.Code();
        boolean var8 = false;

        label58: {
            String var10000;
            try {
                var8 = true;
                var3 = (FileConnection)Connector.open("file:///" + var2, 1);
                var4 = (var3.fileSize() + 1023L) / 1024L + " kB";
                if (var3.fileSize() <= 0L) {
                    var8 = false;
                    break label58;
                }

                Image var11;
                if ((var11 = e.Code(var3.openDataInputStream())) != null) {
                    var11 = e.Code(var11, 0, this.Code.getHeight(), 0, false);
                    (var5 = Image.createImage(var5.getWidth(), var5.getHeight())).getGraphics().fillRect(0, 0, var5.getWidth(), var5.getHeight());
                    var5.getGraphics().drawImage(var11, var5.getWidth() - var11.getWidth() >> 1, 0, 20);
                }

                if (e.K == -1) {
                    var8 = false;
                    break label58;
                }

                var10000 = e.K + "x" + e.L + ", " + var4;
                var8 = false;
            } catch (Exception var9) {
                var8 = false;
                break label58;
            } finally {
                if (var8) {
                    e.Code(var3);
                }
            }

            var4 = var10000;
        }

        e.Code(var3);
        var1[3] = var4;
        return var5;
    }

    public static void Code() {
        Z = null;
        e.Code(Code);
        Code = null;
        J = null;
    }

    public final boolean Code(String var1) {
        if (var1.length() == 0) {
            var1 = "unnamed";
        }

        if (Code == null) {
            return false;
        } else {
            InputStream var2 = null;
            FileConnection var3 = null;
            OutputStream var4 = null;
            this.I = 0;
            this.Code = 0;
            Code var10000 = Code.Code;

            label386: {
                Throwable var29;
                label393: {
                    Exception var5;
                    boolean var10001;
                    try {
                        try {
                            var10000.c();
                            if (Code instanceof HttpConnection && ((HttpConnection)Code).getResponseCode() != 200) {
                                throw new Exception(e.Code(165));
                            }

                            this.I = (int)Code.getLength();
                            if (this.I == -1) {
                                throw new Exception(e.Code(165));
                            }

                            String var27;
                            if ((var27 = Code.getType()) != null && !var27.equals(J) && var27.indexOf("text/vnd.wap.wml") != -1) {
                                throw new Exception(e.Code(247));
                            }

                            var2 = Code.openInputStream();
                            var3 = (FileConnection)Connector.open((Z != null ? Z : "file:///" + Code) + var1, 3);
                            byte[] var28 = new byte[512];
                            int var6 = 1;
                            String var7 = var1;
                            String var8 = "";
                            int var9;
                            if ((var9 = var1.lastIndexOf(46)) > 0) {
                                var7 = var1.substring(0, var9);
                                var8 = var1.substring(var9);
                            }

                            while(var3.exists()) {
                                e.Code(var3);
                                var1 = var7 + "-" + var6++ + var8;
                                var3 = (FileConnection)Connector.open((Z != null ? Z : "file:///" + Code) + var1, 3);
                            }

                            var3.create();
                            var4 = var3.openOutputStream();

                            while(!this.Code && (var6 = var2.read(var28)) != -1) {
                                this.Code += var6;
                                var4.write(var28, 0, var6);
                            }

                            if (this.Code) {
                                Code.Code.Code(e.Code(166), var1 + " (" + (this.Code + 1023) / 1024 + " kB)");
                            } else {
                                Code.Code.Code(e.Code(167), var1 + " (" + (this.Code + 1023) / 1024 + " kB)");
                            }
                            break label386;
                        } catch (Exception var24) {
                            var5 = var24;
                        }
                    } catch (Throwable var25) {
                        var29 = var25;
                        var10001 = false;
                        break label393;
                    }

                    if (this.Code) {
                        var10000 = Code.Code;
                        short var30 = 166;

                        try {
                            var10000.Code(e.Code(var30), var1 + " (" + (this.Code + 1023) / 1024 + " kB)");
                        } catch (Throwable var23) {
                            var29 = var23;
                            var10001 = false;
                            break label393;
                        }
                    } else {
                        try {
                            Code((Throwable)var5);
                        } catch (Throwable var22) {
                            var29 = var22;
                            var10001 = false;
                            break label393;
                        }
                    }

                    e.J += (long)this.Code;
                    e.B += (long)this.Code;
                    e.Code((long)this.Code, (long)this.Code, (long)this.Code);
                    this.Code = -1;
                    this.Code = false;
                    e.Code(var4);
                    e.Code(var3);
                    e.Code(var2);
                    Code();
                    Code.Code.d();
                    Code.Code.b();
                    return false;
                }

                Throwable var26 = var29;
                e.J += (long)this.Code;
                e.B += (long)this.Code;
                e.Code((long)this.Code, (long)this.Code, (long)this.Code);
                this.Code = -1;
                this.Code = false;
                e.Code(var4);
                e.Code(var3);
                e.Code(var2);
                Code();
                Code.Code.d();
                Code.Code.b();
                throw var26;
            }

            e.J += (long)this.Code;
            e.B += (long)this.Code;
            e.Code((long)this.Code, (long)this.Code, (long)this.Code);
            this.Code = -1;
            this.Code = false;
            e.Code(var4);
            e.Code(var3);
            e.Code(var2);
            Code();
            Code.Code.d();
            Code.Code.b();
            return true;
        }
    }
}
