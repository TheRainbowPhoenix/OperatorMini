package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordComparator;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordFilter;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;

/* renamed from: k */
public final class DrawingUtils {

    /* renamed from: A */
    public static boolean f137A = false;

    /* renamed from: B */
    public static boolean noTimeoutsException = false;

    /* renamed from: C */
    public static boolean use_smooth_scroll = true;

    /* renamed from: D */
    public static boolean f140D = false;

    /* renamed from: E */
    public static boolean f141E = false;

    /* renamed from: F */
    public static boolean f142F = false;

    /* renamed from: G */
    public static boolean f143G = false;

    /* renamed from: H */
    public static boolean contentmagic = false;

    /* renamed from: I */
    public static boolean enable_images = true;

    /* renamed from: J */
    public static boolean f146J = true;

    /* renamed from: K */
    public static boolean f147K = false;

    /* renamed from: L */
    public static boolean use_bitmap_font = false;

    /* renamed from: M */
    public static boolean f149M = true;

    /* renamed from: N */
    public static boolean use_24h = false;

    /* renamed from: O */
    public static boolean f151O = false;

    /* renamed from: P */
    public static boolean f152P = false;

    /* renamed from: Q */
    public static boolean highimagequality = false;

    /* renamed from: R */
    public static boolean f154R = false;

    /* renamed from: a */
    public static int f155a = 400;

    /* renamed from: a */
    public static long run_freeMemory = 0;

    /* renamed from: a */
    public static BitmapFont f157a = null;

    /* renamed from: a */
    public static String f158a = null;

    /* renamed from: a */
    public static Vector f159a = null;

    /* renamed from: a */
    public static boolean f160a;

    /* renamed from: a */
    public static String[] available_locales_codes;

    /* renamed from: a */
    public static Object[][] f162a = null;

    /* renamed from: b */
    public static int f163b = 1000;

    /* renamed from: b */
    public static long f164b = 0;

    /* renamed from: b */
    public static BitmapFont f165b = null;

    /* renamed from: b */
    public static String f166b;

    /* renamed from: b */
    private static Vector f167b;

    /* renamed from: b */
    public static boolean f168b = true;

    /* renamed from: b */
    public static String[] avail_locales_names;

    /* renamed from: c */
    public static int f170c = -1;

    /* renamed from: c */
    public static long f171c = 0;

    /* renamed from: c */
    public static String f172c;

    /* renamed from: c */
    private static Vector f173c;

    /* renamed from: c */
    public static boolean f174c = true;

    /* renamed from: c */
    private static String[] translations_resources = null;

    /* renamed from: d */
    public static int font_size = 8;

    /* renamed from: d */
    public static String f177d;

    /* renamed from: d */
    public static boolean f178d = false;

    /* renamed from: e */
    public static int f179e = 0;

    /* renamed from: e */
    public static String current_locale = "";

    /* renamed from: e */
    public static boolean f181e = false;

    /* renamed from: f */
    public static int f182f = -2;

    /* renamed from: f */
    public static String google_string = "google";

    /* renamed from: f */
    public static boolean f184f = false;

    /* renamed from: g */
    public static int f185g = 0;

    /* renamed from: g */
    public static String http_ip_proxy = "http://80.232.117.10:80/";

    /* renamed from: g */
    public static boolean f187g = false;

    /* renamed from: h */
    public static int f188h = 0;

    /* renamed from: h */
    public static String f189h = null;

    /* renamed from: h */
    public static boolean f190h = false;

    /* renamed from: i */
    public static int f191i = -1;

    /* renamed from: i */
    public static boolean f192i = false;

    /* renamed from: j */
    public static int f193j;

    /* renamed from: j */
    public static boolean f194j = false;

    /* renamed from: k */
    public static int f195k;

    /* renamed from: k */
    public static boolean f196k = true;

    /* renamed from: l */
    public static boolean f197l = false;

    /* renamed from: m */
    public static boolean f198m = false;

    /* renamed from: n */
    public static boolean f199n = false;

    /* renamed from: o */
    public static boolean f200o = false;

    /* renamed from: p */
    public static boolean f201p = false;

    /* renamed from: q */
    public static boolean f202q = false;

    /* renamed from: r */
    public static boolean f203r = false;

    /* renamed from: s */
    public static boolean f204s = false;

    /* renamed from: t */
    public static boolean skip_input = false;

    /* renamed from: u */
    public static boolean f206u = false;

    /* renamed from: v */
    public static boolean f207v = false;

    /* renamed from: w */
    public static boolean f208w = false;

    /* renamed from: x */
    public static boolean f209x = false;

    /* renamed from: y */
    public static boolean f210y = false;

    /* renamed from: z */
    public static boolean f211z;

    /* renamed from: a */
    private static byte m53a(Object[] objArr) {
        return ((Byte) objArr[3]).byteValue();
    }

    /* renamed from: a */
    public static int to_int(int i) {
        return i;
    }

    /* renamed from: a */
    private static int m55a(int i, int i2) {
        return (i >> i2) & 255;
    }

    /* renamed from: a */
    public static int m56a(Font font, String str, boolean z) {
        return (!use_bitmap_font || z) ? font.stringWidth(str) : m60a(font).strFontLengthThing(str);
    }

    /* renamed from: a */
    public static int m57a(Font font, char[] cArr, int i, int i2, boolean z) {
        return (!use_bitmap_font || z) ? font.charsWidth(cArr, i, i2) : m60a(font).mo2a(cArr, i, i2);
    }

    /* renamed from: a */
    public static int m58a(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        int i4 = i2 + i;
        int i5 = i3;
        while (i < i4) {
            int i6 = bArr[i] & 255;
            switch (i6 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    i++;
                    cArr[i5] = (char) i6;
                    i5++;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    return i5 - i3;
                case 12:
                case 13:
                    i += 2;
                    if (i <= i4) {
                        byte b = bArr[i - 1];
                        if ((b & 192) == 128) {
                            cArr[i5] = (char) (((i6 & 31) << 6) | (b & 63));
                            i5++;
                            break;
                        } else {
                            return i5 - i3;
                        }
                    } else {
                        return i5 - i3;
                    }
                case 14:
                    i += 3;
                    if (i <= i4) {
                        byte b2 = bArr[i - 2];
                        byte b3 = bArr[i - 1];
                        if ((b2 & 192) == 128 && (b3 & 192) == 128) {
                            cArr[i5] = (char) (((i6 & 15) << 12) | ((b2 & 63) << 6) | ((b3 & 63) << 0));
                            i5++;
                            break;
                        } else {
                            return i5 - i3;
                        }
                    } else {
                        return i5 - i3;
                    }
            }
        }
        return i5 - i3;
    }

    /* renamed from: a */
    public static int m59a(char[] cArr, int i, int i2, byte[] bArr, int i3, boolean z) {
        int i4;
        int i5 = i;
        int i6 = i3;
        while (i5 < i + i2) {
            char c = cArr[i5];
            if (c < 1 || c > 127) {
                if (c > 2047) {
                    if (z) {
                        i4 = i6 + 3;
                    } else {
                        int i7 = i6 + 1;
                        bArr[i6] = (byte) (((c >> '\f') & 15) | 224);
                        int i8 = i7 + 1;
                        bArr[i7] = (byte) (((c >> 6) & 63) | 128);
                        i4 = i8 + 1;
                        bArr[i8] = (byte) (((c >> 0) & 63) | 128);
                    }
                } else if (z) {
                    i4 = i6 + 2;
                } else {
                    int i9 = i6 + 1;
                    bArr[i6] = (byte) (((c >> 6) & 31) | 192);
                    i4 = i9 + 1;
                    bArr[i9] = (byte) (((c >> 0) & 63) | 128);
                }
            } else if (z) {
                i4 = i6 + 1;
            } else {
                i4 = i6 + 1;
                bArr[i6] = (byte) c;
            }
            i5++;
            i6 = i4;
        }
        return i6 - i3;
    }

    /* renamed from: a */
    public static BitmapFont m60a(Font font) {
        return font.isBold() ? f165b : f157a;
    }

    /* renamed from: a */
    public static final InputStream loadResourceByName(String str) {
        Class<?> cls = Runtime.getRuntime().getClass();
        InputStream resourceAsStream = cls.getResourceAsStream(str);
        return resourceAsStream == null ? cls.getResourceAsStream(new StringBuffer().append("/res").append(str).toString()) : resourceAsStream;
    }

    /* renamed from: a */
    public static final String get_string_resource(int i) {
        if (translations_resources == null) {
            init_string_resources();
        }
        return (translations_resources == null || i < 0 || i >= translations_resources.length || translations_resources[i] == null) ? "?" : translations_resources[i];
    }

    /* renamed from: a */
    public static final String format_string_resource(int i, String str) {
        String a = get_string_resource(i);
        int indexOf = a.indexOf("%s");
        return indexOf < 0 ? a : new StringBuffer().append(a.substring(0, indexOf)).append(str).append(a.substring(indexOf + 2)).toString();
    }

    /* renamed from: a */
    public static final String getSystemProperty(String str) {
        try {
            return System.getProperty(str);
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    public static String url_encode(String str, boolean z, boolean z2) {
        if (str == null) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < 1 || charAt > 127) {
                if (charAt > 2047) {
                    stringBuffer.append('%');
                    stringBuffer.append(Integer.toHexString(((charAt >> '\f') & 15) | 224));
                    stringBuffer.append('%');
                    stringBuffer.append(Integer.toHexString(((charAt >> 6) & 63) | 128));
                    stringBuffer.append('%');
                    stringBuffer.append(Integer.toHexString(((charAt >> 0) & 63) | 128));
                } else {
                    stringBuffer.append('%');
                    stringBuffer.append(Integer.toHexString(((charAt >> 6) & 31) | 192));
                    stringBuffer.append('%');
                    stringBuffer.append(Integer.toHexString(((charAt >> 0) & 63) | 128));
                }
            } else if (charAt == '%' && z2) {
                stringBuffer.append('%');
                stringBuffer.append('2');
                stringBuffer.append('5');
            } else if (charAt == '%') {
                int parseInt = Integer.parseInt(str.substring(i + 1, i + 3), 16);
                if (parseInt < 32) {
                    stringBuffer.append(charAt);
                } else if (parseInt <= 127) {
                    stringBuffer.append((char) parseInt);
                    i += 2;
                } else if (parseInt <= 223) {
                    stringBuffer.append((char) ((Integer.parseInt(str.substring(i + 4, i + 6), 16) & 63) | ((parseInt & 31) << 6)));
                    i += 5;
                } else if (parseInt <= 239) {
                    stringBuffer.append((char) (((Integer.parseInt(str.substring(i + 4, i + 6), 16) & 63) << 6) | ((parseInt & 15) << 12) | ((Integer.parseInt(str.substring(i + 7, i + 9), 16) & 63) << 0)));
                    i += 8;
                }
            } else if (z2 && z && (charAt == '$' || charAt == '&' || charAt == '+' || charAt == ',' || charAt == '/' || charAt == ':' || charAt == ';' || charAt == '=' || charAt == '?' || charAt == '@' || charAt == '#' || charAt == '~')) {
                stringBuffer.append('%');
                stringBuffer.append(Integer.toHexString(charAt));
            } else if (!z2 || charAt > ' ') {
                stringBuffer.append(charAt);
            } else {
                stringBuffer.append('%');
                if (charAt < 16) {
                    stringBuffer.append('0');
                }
                stringBuffer.append(Integer.toHexString(charAt));
            }
            i++;
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String truncate_overflow(Font font, String str, int i, boolean z) {
        if (m56a(font, str, z) <= i) {
            return str;
        }
        int a = i - m56a(font, "...", z);
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = 0;
        int i3 = -1;
        while (length - i3 > 1) {
            int i4 = (length + i3) / 2;
            if (m57a(font, charArray, 0, i4, z) > a) {
                i2 = i4;
                length = i4;
            } else {
                i2 = i4;
                i3 = i4;
            }
        }
        return new StringBuffer().append(str.substring(0, i2)).append("...").toString();
    }

    /* renamed from: a */
    public static String m67a(byte[] bArr, int i) {
        try {
            char[] cArr = new char[m74a(bArr, i)];
            m58a(bArr, i + 2, bArr.length - (i + 2), cArr, 0);
            return new String(cArr);
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    public static final Calendar m68a() {
        Date date = new Date();
        date.setTime(date.getTime() + ((long) (f188h * 60 * 60 * 1000)));
        Calendar instance = Calendar.getInstance(TimeZone.getDefault());
        instance.setTime(date);
        return instance;
    }

    /* renamed from: a */
    public static final Vector m69a() {
        m122e("h");
        return f167b;
    }

    /* renamed from: a */
    public static final Image loadImageResource(String str) {
        Image image = null;
        try {
            image = Image.createImage(str);
        } catch (Throwable th) {
        }
        if (image != null) {
            return image;
        }
        try {
            return Image.createImage(new StringBuffer().append("/res").append(str).toString());
        } catch (Throwable th2) {
            return image;
        }
    }

    /* renamed from: a */
    public static Image m71a(Image image, int i, int i2) {
        int height = image.getHeight() - i;
        int width = image.getWidth();
        int i3 = (width * i2) / height;
        int i4 = (height * 256) / i2;
        int[] iArr = new int[(width * height)];
        int[] iArr2 = new int[(i3 * i2)];
        image.getRGB(iArr, 0, width, 0, 0, width, height);
        for (int i5 = 0; i5 < i2; i5++) {
            try {
                int min = Math.min((i5 * i4) / 256, height);
                int i6 = (i5 * i4) - (min * 256);
                for (int i7 = 0; i7 < i3; i7++) {
                    int min2 = Math.min((i7 * i4) / 256, width);
                    int i8 = (i7 * i4) - (min2 * 256);
                    int min3 = Math.min(min2 + 1, width - 1);
                    int min4 = Math.min(min + 1, height - 1);
                    int i9 = iArr[(width * min) + min2];
                    int i10 = iArr[(width * min) + min3];
                    int i11 = iArr[min2 + (width * min4)];
                    int i12 = iArr[(width * min4) + min3];
                    int i13 = (i3 * i5) + i7;
                    iArr2[i13] = 0;
                    for (int i14 = 0; i14 <= 16; i14 += 8) {
                        iArr2[i13] = iArr2[i13] + (((((((m55a(i9, i14) * (255 - i8)) * (255 - i6)) + ((m55a(i10, i14) * i8) * (255 - i6))) + ((m55a(i11, i14) * (255 - i8)) * i6)) + ((m55a(i12, i14) * i8) * i6)) / 65025) << i14);
                    }
                }
            } catch (Exception e) {
            }
        }
        return Image.createRGBImage(iArr2, i3, i2, false);
    }

    /* renamed from: a */
    public static Image createImage(byte[] bArr, int i, int i2) {
        if (f206u && i != 0) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            i = 0;
            bArr = bArr2;
        }
        if ((bArr[i + 1] == 80 && bArr[i + 2] == 78 && bArr[i + 3] == 71) || f211z) {
            return Image.createImage(bArr, i, i2);
        }
        C0009j jVar = new C0009j();
        if (jVar.mo27a(bArr, i, i2) == -1 || jVar.width <= 0 || jVar.height <= 0) {
            return null;
        }
        return Image.createRGBImage(jVar.rgb, jVar.width, jVar.height, false);
    }

    /* renamed from: a */
    public static short m73a(Font font, boolean z) {
        return (!use_bitmap_font || z) ? (short) (font.getHeight() + f193j + f195k) : m60a(font).mo3a();
    }

    /* renamed from: a */
    public static short m74a(byte[] bArr, int i) {
        return (short) (((bArr[i] & 255) << 8) + ((bArr[i + 1] & 255) << 0));
    }

    /* renamed from: a */
    public static void m75a() {
        System.gc();
        if (f192i) {
            run_freeMemory = (Runtime.getRuntime().freeMemory() * 10) / 8;
        } else if (!f194j || run_freeMemory <= 0) {
            Vector vector = new Vector(256);
            int i = 0;
            try {
                while (vector.size() <= 256) {
                    vector.addElement(new byte[8192]);
                    i++;
                }
                System.gc();
            } catch (Throwable th) {
            } finally {
                System.gc();
            }
            run_freeMemory = (long) ((i * 8192) + 4);
        }
    }

    /* renamed from: a */
    public static final void m76a(int i) {
        if (f159a != null) {
            f159a.removeElementAt(i);
            m127i();
        }
    }

    /* renamed from: a */
    public static final void m77a(int i, int i2) {
        if (f159a != null) {
            Object elementAt = f159a.elementAt(i);
            Object elementAt2 = f159a.elementAt(i2);
            f159a.setElementAt(elementAt, i2);
            f159a.setElementAt(elementAt2, i);
            m127i();
        }
    }

    /* renamed from: a */
    public static void m78a(String str) {
        if (f166b == null || (str != null && !f166b.equals(str))) {
            f166b = str;
            m106b();
        }
    }

    /* renamed from: a */
    private static void m79a(String str, boolean z) {
        RecordStore recordStore = null;
        if (z) {
            try {
                RecordStore.deleteRecordStore(str);
            } catch (RecordStoreException | RecordStoreNotFoundException e) {
            }
        }
        try {
            RecordStore openRecordStore = RecordStore.openRecordStore(str, true);
            if (openRecordStore != null) {
                if (str.equals("s")) {
                    m88a(openRecordStore);
                } else if (str.equals("b1")) {
                    m117c(openRecordStore);
                } else if (str.equals("h")) {
                    m89a(openRecordStore, f167b);
                } else if (str.equals("eurls")) {
                    m110b(openRecordStore, f173c);
                }
                if (openRecordStore != null) {
                    try {
                        openRecordStore.closeRecordStore();
                    } catch (Exception e2) {
                    }
                }
            } else if (openRecordStore != null) {
                try {
                    openRecordStore.closeRecordStore();
                } catch (Exception e3) {
                }
            }
        } catch (IOException e4) {
            if (0 != 0) {
                try {
                    recordStore.closeRecordStore();
                } catch (Exception e5) {
                }
            }
        } catch (RecordStoreException e6) {
            if (0 != 0) {
                try {
                    recordStore.closeRecordStore();
                } catch (Exception e7) {
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    recordStore.closeRecordStore();
                } catch (Exception e8) {
                }
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static final void m80a(Vector vector) {
        if (vector != null && vector.size() != 0) {
            f167b = vector;
            m79a("h", true);
        }
    }

    /* renamed from: a */
    public static void drawFocus(Graphics graphics, int i, int i2, int i3, int i4) {
        graphics.setColor(BrowserCanvas.skin_colors[13]);
        graphics.drawLine(i - 2, i2 - 2, i - 2, i2 - 2);
        graphics.drawLine(i - 2, i2 + i4 + 1, i - 2, i2 + i4 + 1);
        graphics.drawLine(i + i3 + 1, i2 - 2, i + i3 + 1, i2 - 2);
        graphics.drawLine(i + i3 + 1, i2 + i4 + 1, i + i3 + 1, i2 + i4 + 1);
        graphics.drawLine(i - 1, i2 + i4, i + i3 + f185g, i2 + i4);
        graphics.drawLine(i + i3, i2 + i4, i + i3, i2 - 1);
        graphics.setColor(BrowserCanvas.skin_colors[14]);
        graphics.drawLine(i - 2, i2 + i4, i - 2, i2 - 1);
        graphics.drawLine(i - 1, i2 - 2, i + i3 + f185g, i2 - 2);
        graphics.setColor(BrowserCanvas.skin_colors[15]);
        graphics.drawLine(i - 1, i2 + i4 + 1, i + i3 + f185g, i2 + i4 + 1);
        graphics.drawLine(i + i3 + 1, i2 + i4, i + i3 + 1, i2 - 1);
        graphics.drawLine(i - 1, (i2 + i4) - 1, i - 1, i2 - 1);
        graphics.drawLine(i, i2 - 1, ((i + i3) - 1) + f185g, i2 - 1);
    }

    /* renamed from: a */
    public static void makeGradient(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (i5 >> 16) << 8;
        int i8 = ((i5 >> 8) & 255) << 8;
        int i9 = (i5 & 255) << 8;
        int i10 = (((i6 >> 16) << 8) - i7) / i4;
        int i11 = ((((i6 >> 8) & 255) << 8) - i8) / i4;
        int i12 = (((i6 & 255) << 8) - i9) / i4;
        int i13 = (i + i3) - 1;
        int i14 = (i2 + i4) - 1;
        while (i2 < i14) {
            graphics.setColor(i7 >> 8, i8 >> 8, i9 >> 8);
            graphics.drawLine(i, i2, i13, i2);
            i7 += i10;
            i8 += i11;
            i9 += i12;
            i2++;
        }
    }

    /* renamed from: a */
    public static void drawOnScreenSelection(Graphics graphics, int i, int i2, int i3, int i4, boolean z) {
        graphics.setColor(z ? 16777215 : 15132390);
        graphics.fillRect(i + 2, i2 + 2, i3 - 3, i4 - 3);
        graphics.setColor(6052956);
        graphics.drawRect(i, i2, i3 - 1, i4);
        graphics.setColor(16777215);
        graphics.drawLine(i + 1, i2 + 1, ((i + i3) - 2) + f185g, i2 + 1);
        graphics.drawLine(i + 1, i2 + 2, i + 1, (i2 + i4) - 1);
        graphics.setColor(13553358);
        graphics.drawLine(i + 2, (i2 + i4) - 1, ((i + i3) - 2) + f185g, (i2 + i4) - 1);
        graphics.drawLine((i + i3) - 2, i2 + 2, (i + i3) - 2, (i2 + i4) - 1);
    }

    /* renamed from: a */
    public static void m84a(Graphics graphics, Font font, String str, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        if (!use_bitmap_font || z) {
            m85a(graphics, font, str, i, i2, i3, i4, z);
        } else {
            m60a(font).mo5a(graphics, str, i, i2, i3, i4, i5, i6);
        }
    }

    /* renamed from: a */
    public static void m85a(Graphics graphics, Font font, String str, int i, int i2, int i3, int i4, boolean z) {
        if (!use_bitmap_font || z) {
            graphics.setFont(font);
            graphics.drawString(str, i, f193j + i2, i3);
            return;
        }
        m60a(font).mo4a(graphics, str, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static final void m86a(MIDlet mIDlet) {
        f158a = getSystemProperty("microedition.platform");
        f158a = f158a == null ? "" : f158a.toLowerCase();
        f189h = mIDlet.getAppProperty("Operette-UA");
        f170c = -1;
        if (f158a.indexOf("nokia") != -1 || f158a.equals("siemens_sx1") || f158a.equals("sendo x")) {
            f170c = 0;
        }
        if (f158a.indexOf("palm") != -1) {
            f170c = 7;
        } else if (m111b("com.siemens.mp.lcdui.Image")) {
            f170c = 2;
        } else if (f158a.indexOf("sonyericsson") != -1 || f158a.equals("symbian os") || getSystemProperty("com.sonyericsson.IMEI") != null || getSystemProperty("com.sonyericsson.imei") != null) {
            f170c = 3;
        } else if (m111b("com.motorola.phonebook.PhoneBookRecord") || m111b("com.motorola.Dialer") || m111b("com.motorola.phone.Dialer") || m111b("com.motorola.graphics.j3d.Light") || m111b("com.motorola.lwt.ComponentScreen") || m111b("com.motorola.game.GameScreen") || m111b("com.motorola.funlight.FunLight") || m111b("com.motorola.multimedia.Lighting") || m111b("com.motorola.io.ConnectorEvent") || m111b("com.motorola.extensions.ScalableJPGImage") || getSystemProperty("batterylevel") != null || getSystemProperty("BatteryLevel") != null) {
            f170c = 1;
        } else if (m111b("com.samsung.util.AudioClip") || m111b("com.samsung.util.LCDLight") || m111b("com.samsung.util.SM") || m111b("com.samsung.util.SMS") || m111b("com.samsung.util.Vibration")) {
            f170c = 4;
        }
        f160a = Display.getDisplay(mIDlet).numAlphaLevels() > 2;
        if ((f170c == 0 && f158a.indexOf("3220") != -1) || f170c == 7) {
            f142F = true;
        }
        if (f170c == 1) {
            f210y = true;
        }
        String a = getSystemProperty("microedition.profiles");
        if (m111b("com.sprintpcs.util.System") || !(a == null || a.indexOf("SPRINTPCS-1.0") == -1)) {
            f187g = true;
            f190h = true;
        }
        if (!f190h) {
            f178d = m111b("javax.wireless.messaging.MessageConnection") && m111b("javax.wireless.messaging.TextMessage");
        }
        if (f170c == 7) {
            noTimeoutsException = true;
        }
        if (f158a.startsWith("sonyericssonp910")) {
            f207v = true;
        }
        if (f170c == 7) {
            f155a = 1000;
            f163b = 2000;
        }
        if (f158a.startsWith("nokia6600/")) {
            f202q = true;
        }
        if (f158a.startsWith("nokia6600/") || f158a.startsWith("nokia7610/") || f158a.startsWith("nokia3230/")) {
            f203r = true;
        }
        if (f158a.startsWith("nokia6630/")) {
            f204s = true;
        }
        if (f158a.startsWith("nokia6630/") || f158a.startsWith("nokia6280/")) {
            f201p = true;
        }
        if (f158a.equals("symbian os")) {
            f181e = true;
        }
        if (f158a.trim().equals("nokia6600/3.42.1")) {
            f168b = false;
        }
        if (f158a.trim().equals("Nokia6600/3.42.1")) {
            f174c = false;
        }
        f198m = true;
        f196k = true;
    }

    /* renamed from: a */
    public static final void m87a(MIDlet mIDlet, Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Display.getDisplay(mIDlet).numColors();
        int numAlphaLevels = Display.getDisplay(mIDlet).numAlphaLevels();
        boolean hasRepeatEvents = canvas.hasRepeatEvents();
        if ((f170c == 2 && width < 176) || ((f170c == 0 && width < 176) || (f170c == 3 && width <= 176))) {
            f194j = true;
        }
        if (f170c == -1 && f187g) {
            if (hasRepeatEvents && numAlphaLevels == 256) {
                f209x = true;
            } else if (hasRepeatEvents) {
                f209x = true;
            }
        }
        if (f170c == 4) {
            f182f = 197;
            if ((width == 128 && height == 144) || (width == 176 && height == 204)) {
                f192i = true;
            }
        }
        if (f170c == 5 || (f170c == -1 && f158a.equals("jbed"))) {
            f206u = true;
            f197l = true;
            if (f158a.equals("jbed") && width == 128 && (height == 110 || height == 142)) {
                f200o = true;
            }
            f208w = true;
        }
        if (f170c == -1 && f158a.equals("j2me")) {
            f140D = true;
        }
        f158a = getSystemProperty("microedition.platform");
        f158a = f158a == null ? "" : f158a.toLowerCase();
    }

    /* renamed from: a */
    private static void m88a(RecordStore recordStore) throws IOException, RecordStoreException {
        if (recordStore != null) {
            BufferedByteArrOutStream qVar = new BufferedByteArrOutStream();
            DataOutputStream dataOutputStream = new DataOutputStream(qVar);
            dataOutputStream.writeByte(8);
            dataOutputStream.writeBoolean(contentmagic);
            dataOutputStream.writeBoolean(enable_images);
            dataOutputStream.writeBoolean(f146J);
            dataOutputStream.writeBoolean(!f151O);
            dataOutputStream.writeBoolean(use_bitmap_font);
            dataOutputStream.writeUTF(current_locale == null ? "" : current_locale);
            dataOutputStream.writeBoolean(f149M);
            dataOutputStream.writeInt(f188h);
            dataOutputStream.writeBoolean(highimagequality);
            dataOutputStream.writeUTF(f166b == null ? "" : f166b);
            dataOutputStream.writeLong(run_freeMemory);
            dataOutputStream.writeUTF(google_string == null ? "" : google_string);
            if (http_ip_proxy.equals("http://80.232.117.10:80/")) {
                dataOutputStream.writeUTF("");
            } else {
                dataOutputStream.writeUTF(http_ip_proxy);
            }
            dataOutputStream.writeInt(f191i);
            dataOutputStream.writeUTF(f172c == null ? "" : f172c);
            dataOutputStream.writeBoolean(use_smooth_scroll);
            dataOutputStream.writeLong(f171c);
            dataOutputStream.writeBoolean(use_24h);
            dataOutputStream.writeUTF(f177d == null ? "" : f177d);
            recordStore.addRecord(qVar.get_buffer(), 0, qVar.size());
        }
    }

    /* renamed from: a */
    private static void m89a(RecordStore recordStore, Vector vector) throws IOException, RecordStoreException {
        if (!(recordStore == null || vector == null)) {
            BufferedByteArrOutStream qVar = new BufferedByteArrOutStream();
            DataOutputStream dataOutputStream = new DataOutputStream(qVar);
            dataOutputStream.writeByte(0);
            int size = vector.size();
            dataOutputStream.writeInt(size);
            for (int i = 0; i < size; i++) {
                Object[] objArr = (Object[]) vector.elementAt(i);
                byte[] bArr = (byte[]) objArr[2];
                dataOutputStream.writeUTF(objArr[0] == null ? "" : (String) objArr[0]);
                dataOutputStream.writeUTF(objArr[1] == null ? "" : (String) objArr[1]);
                dataOutputStream.writeInt(bArr == null ? 0 : bArr.length);
                if (bArr != null && bArr.length > 0) {
                    dataOutputStream.write(bArr);
                }
                dataOutputStream.writeUTF(objArr[3] == null ? "" : (String) objArr[3]);
            }
            recordStore.addRecord(qVar.get_buffer(), 0, qVar.size());
            dataOutputStream.close();
            qVar.close();
        }
    }

    /* renamed from: a */
    public static void m90a(short s, byte[] bArr, int i) {
        bArr[i] = (byte) ((s >>> 8) & 255);
        bArr[i + 1] = (byte) ((s >>> 0) & 255);
    }

    /* renamed from: a */
    public static final void m91a(boolean z) {
        int i;
        try {
            InputStream a = loadResourceByName("/b");
            if (a != null) {
                DataInputStream dataInputStream = new DataInputStream(a);
                byte readByte = dataInputStream.readByte();
                byte b = 0;
                int i2 = 0;
                while (b < readByte) {
                    Object[] a2 = m101a(dataInputStream);
                    if (a2 != null) {
                        if (z) {
                            m93a(a2, false);
                        }
                        if (f162a == null) {
                            f162a = (Object[][]) Array.newInstance(Object.class, 4, 3);
                        }
                        if (m112b(a2) && i2 < f162a.length) {
                            f162a[i2] = new Object[4];
                            f162a[i2][1] = new String((String) a2[1]);
                            f162a[i2][0] = new String((String) a2[0]);
                            f162a[i2][2] = a2[2];
                            i = i2 + 1;
                            b = (byte) (b + 1);
                            i2 = i;
                        }
                    }
                    i = i2;
                    b = (byte) (b + 1);
                    i2 = i;
                }
            }
        } catch (IOException | OutOfMemoryError e) {
        }
    }

    /* renamed from: a */
    public static final void m92a(Object[] objArr, int i, boolean z) {
        if (f159a != null) {
            if (i + 1 > f159a.size()) {
                f159a.setSize(i + 1);
            }
            f159a.setElementAt(objArr, i);
            if (z) {
                m127i();
            }
        }
    }

    /* renamed from: a */
    public static void m93a(Object[] objArr, boolean z) {
        if (objArr != null) {
            f159a.addElement(objArr);
            if (z) {
                m127i();
            }
        }
    }

    /* renamed from: a */
    private static boolean m94a() {
        RecordStore recordStore = null;
        try {
            RecordStore openRecordStore = RecordStore.openRecordStore("b1", false);
            if (openRecordStore != null) {
                RecordEnumeration enumerateRecords = openRecordStore.enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
                while (enumerateRecords.hasNextElement()) {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(enumerateRecords.nextRecord()));
                    int read = dataInputStream.read();
                    Object[] a = m101a(dataInputStream);
                    if (a != null) {
                        m92a(a, read, false);
                    }
                }
                if (openRecordStore == null) {
                    return false;
                }
                try {
                    openRecordStore.closeRecordStore();
                } catch (Exception e) {
                }
                return true;
            } else if (openRecordStore == null) {
                return false;
            } else {
                try {
                    openRecordStore.closeRecordStore();
                    return false;
                } catch (Exception e2) {
                    return false;
                }
            }
        } catch (IOException e3) {
            if (0 == 0) {
                return false;
            }
            try {
                recordStore.closeRecordStore();
            } catch (Exception e4) {
            }
            return true;
        } catch (RuntimeException e5) {
            if (0 == 0) {
                return false;
            }
            try {
                recordStore.closeRecordStore();
            } catch (Exception e6) {
            }
            return true;
        } catch (RecordStoreException e7) {
            if (0 == 0) {
                return false;
            }
            try {
                recordStore.closeRecordStore();
            } catch (Exception e8) {
            }
            return true;
        } catch (OutOfMemoryError e9) {
            if (0 == 0) {
                return false;
            }
            try {
                recordStore.closeRecordStore();
            } catch (Exception e10) {
            }
            return true;
        } catch (Throwable th) {
            if (0 == 0) {
                return false;
            }
            try {
                recordStore.closeRecordStore();
            } catch (Exception e11) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static final boolean m95a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return i + i3 >= i5 && i2 + i4 >= i6 && i5 + i7 >= i && i6 + i8 >= i2;
    }

    /* renamed from: a */
    public static final boolean m96a(String str) {
        String b = m104b(str);
        return b.startsWith("operette:") || b.startsWith("opera:");
    }

    /* renamed from: a */
    public static final boolean m97a(Object[] objArr) {
        return (m53a(objArr) & 1) != 0;
    }

    /* renamed from: a */
    public static byte[] m98a() {
        byte[] bArr;
        try {
            InputStream a = loadResourceByName("/b");
            if (a == null) {
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(a);
            byte readByte = dataInputStream.readByte();
            byte b = 0;
            while (true) {
                if (b >= readByte) {
                    bArr = null;
                    break;
                }
                Object[] a2 = m101a(dataInputStream);
                if (((String) a2[1]).startsWith("Opera Mini")) {
                    bArr = (byte[]) a2[2];
                    break;
                }
                b = (byte) (b + 1);
            }
            try {
                a.close();
                return bArr;
            } catch (IOException | OutOfMemoryError e) {
                return bArr;
            }
        } catch (IOException e2) {
            return null;
        } catch (OutOfMemoryError e3) {
            return null;
        }
    }

    /* renamed from: a */
    public static int[] m99a(int[] iArr, int i) {
        if (iArr == null || i < 0) {
            return iArr;
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* renamed from: a */
    public static final Object[] m100a(int i) {
        if (f159a != null) {
            return (Object[]) f159a.elementAt(i);
        }
        return null;
    }

    /* renamed from: a */
    private static Object[] m101a(DataInputStream dataInputStream) throws IOException {
        Object[] objArr = new Object[4];
        objArr[0] = dataInputStream.readUTF();
        objArr[1] = dataInputStream.readUTF();
        objArr[2] = null;
        byte[] bArr = new byte[dataInputStream.readShort()];
        dataInputStream.readFully(bArr);
        objArr[2] = bArr;
        objArr[3] = new Byte(dataInputStream.readByte());
        return objArr;
    }

    /* renamed from: a */
    public static short[] m102a(short[] sArr, int i) {
        if (sArr == null || i < 0) {
            return sArr;
        }
        short[] sArr2 = new short[i];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        return sArr2;
    }

    /* renamed from: b */
    public static final String m103b(int i) {
        if (i < 1024) {
            return new StringBuffer().append(i).append(" bytes").toString();
        }
        int i2 = i / 1024;
        if (i2 < 1024) {
            return new StringBuffer().append(i2).append(" KB").toString();
        }
        int i3 = i2 / 1024;
        if (i3 < 1024) {
            return new StringBuffer().append(i3).append(" MB").toString();
        }
        return new StringBuffer().append(i3 / 1024).append(" GB").toString();
    }

    /* renamed from: b */
    public static String m104b(String str) {
        int indexOf;
        return (str == null || (indexOf = str.indexOf(47)) == -1 || !Character.isDigit(str.charAt(0))) ? str : str.substring(indexOf + 1);
    }

    /* renamed from: b */
    public static final Vector m105b() {
        m122e("eurls");
        return f173c;
    }

    /* renamed from: b */
    public static final void m106b() {
        m79a("s", true);
    }

    /* renamed from: b */
    public static void m107b(String str) {
        if (f172c == null || (str != null && !f172c.equals(str))) {
            f172c = str;
            m106b();
        }
    }

    /* renamed from: b */
    public static final void m108b(Vector vector) {
        if (vector != null && vector.size() != 0) {
            f173c = vector;
            m79a("eurls", true);
        }
    }

    /* renamed from: b */
    private static void m109b(RecordStore recordStore) throws RecordStoreException, InvalidRecordIDException, IOException {
        boolean z = false;
        if (recordStore != null) {
            RecordEnumeration enumerateRecords = recordStore.enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
            if (enumerateRecords.hasNextElement()) {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(enumerateRecords.nextRecord()));
                if (dataInputStream.readUnsignedByte() == 8) {
                    contentmagic = dataInputStream.readBoolean();
                    enable_images = dataInputStream.readBoolean();
                    f146J = dataInputStream.readBoolean();
                    if (!dataInputStream.readBoolean()) {
                        z = true;
                    }
                    f151O = z;
                    use_bitmap_font = dataInputStream.readBoolean();
                    current_locale = dataInputStream.readUTF();
                    f149M = dataInputStream.readBoolean();
                    f188h = dataInputStream.readInt();
                    highimagequality = dataInputStream.readBoolean();
                    f166b = dataInputStream.readUTF();
                    run_freeMemory = dataInputStream.readLong();
                    String readUTF = dataInputStream.readUTF();
                    if (readUTF != null) {
                        google_string = readUTF;
                    }
                    http_ip_proxy = dataInputStream.readUTF();
                    if (http_ip_proxy == null || http_ip_proxy.length() == 0) {
                        http_ip_proxy = "http://80.232.117.10:80/";
                    }
                    f191i = dataInputStream.readInt();
                    f172c = dataInputStream.readUTF();
                    use_smooth_scroll = dataInputStream.readBoolean();
                    f171c = dataInputStream.readLong();
                    use_24h = dataInputStream.readBoolean();
                    f177d = dataInputStream.readUTF();
                }
            }
        }
    }

    /* renamed from: b */
    private static void m110b(RecordStore recordStore, Vector vector) throws IOException, RecordStoreException {
        if (!(recordStore == null || vector == null)) {
            BufferedByteArrOutStream qVar = new BufferedByteArrOutStream();
            DataOutputStream dataOutputStream = new DataOutputStream(qVar);
            int size = vector.size();
            dataOutputStream.writeInt(size);
            for (int i = 0; i < size; i++) {
                dataOutputStream.writeUTF((String) vector.elementAt(i));
            }
            recordStore.addRecord(qVar.get_buffer(), 0, qVar.size());
        }
    }

    /* renamed from: b */
    private static boolean m111b(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m112b(Object[] objArr) {
        return (m53a(objArr) & 2) != 0;
    }

    /* renamed from: b */
    public static byte[] m113b() {
        byte[] bArr = null;
        try {
            bArr = new byte[395];
            InputStream a = loadResourceByName("/defaultfavicon.png");
            if (a != null) {
                new DataInputStream(a).readFully(bArr);
            }
        } catch (Throwable th) {
        }
        return bArr;
    }

    /* renamed from: c */
    public static String m114c(String str) {
        if (str.startsWith("http://")) {
            str = str.substring(7);
        }
        if (str.startsWith("https://")) {
            str = str.substring(8);
        }
        return str.startsWith("www.") ? str.substring(4) : str;
    }

    /* renamed from: c */
    public static final void m115c() {
        m122e("s");
        if (f142F) {
            use_bitmap_font = false;
        }
    }

    /* renamed from: c */
    public static void m116c(String str) {
        if (f177d == null || (str != null && !f177d.equals(str))) {
            f177d = str;
            m106b();
        }
    }

    /* renamed from: c */
    private static void m117c(RecordStore recordStore) throws IOException, RecordStoreException {
        if (!(recordStore == null || f159a == null)) {
            for (int i = 0; i < f159a.size(); i++) {
                BufferedByteArrOutStream qVar = new BufferedByteArrOutStream();
                DataOutputStream dataOutputStream = new DataOutputStream(qVar);
                Object[] objArr = (Object[]) f159a.elementAt(i);
                String str = (String) objArr[0];
                String str2 = (String) objArr[1];
                byte[] bArr = (byte[]) objArr[2];
                byte byteValue = ((Byte) objArr[3]).byteValue();
                dataOutputStream.write(i);
                dataOutputStream.writeUTF(str);
                if (str2 == null) {
                    str2 = str;
                }
                dataOutputStream.writeUTF(str2);
                if (bArr == null) {
                    dataOutputStream.writeShort(0);
                } else {
                    dataOutputStream.writeShort(bArr.length);
                    dataOutputStream.write(bArr);
                }
                dataOutputStream.writeByte(byteValue);
                recordStore.addRecord(qVar.get_buffer(), 0, qVar.size());
            }
        }
    }

    /* renamed from: d */
    public static final void m118d() {
        f159a = new Vector();
        if (!m94a()) {
            m91a(true);
        }
    }

    /* renamed from: d */
    public static final void m119d(String str) {
        try {
            RecordStore.deleteRecordStore(str);
        } catch (RecordStoreException e) {
        }
    }

    /* renamed from: d */
    private static void m120d(RecordStore recordStore) throws RecordStoreException, InvalidRecordIDException, IOException {
        f167b = new Vector();
        if (recordStore != null) {
            RecordEnumeration enumerateRecords = recordStore.enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
            if (enumerateRecords.hasNextElement()) {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(enumerateRecords.nextRecord()));
                if (dataInputStream.readUnsignedByte() == 0) {
                    int readInt = dataInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        Object[] objArr = new Object[5];
                        objArr[0] = dataInputStream.readUTF();
                        objArr[1] = dataInputStream.readUTF();
                        int readInt2 = dataInputStream.readInt();
                        byte[] bArr = new byte[readInt2];
                        dataInputStream.readFully(bArr);
                        if (readInt2 > 0) {
                            objArr[2] = bArr;
                        }
                        String readUTF = dataInputStream.readUTF();
                        if (readUTF != null && readUTF.length() > 0) {
                            objArr[3] = readUTF;
                        }
                        f167b.addElement(objArr);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public static final void m121e() {
        boolean z = true;
        f211z = false;
        if (!f140D) {
            try {
                Image a = loadImageResource("/mini.jpg");
                if (a == null || a.getWidth() != 1) {
                    z = false;
                }
                f211z = z;
            } catch (Error | Exception e) {
            }
        }
    }

    /* renamed from: e */
    private static void m122e(String str) {
        if (str == null) {
            throw new IllegalArgumentException("RMS name cannot be null.");
        }
        RecordStore recordStore = null;
        try {
            RecordStore openRecordStore = RecordStore.openRecordStore(str, false);
            openRecordStore.getSizeAvailable();
            if (str.equals("s")) {
                m109b(openRecordStore);
            } else if (str.equals("h")) {
                m120d(openRecordStore);
            } else if (str.equals("eurls")) {
                m123e(openRecordStore);
            }
            if (openRecordStore != null) {
                try {
                    openRecordStore.closeRecordStore();
                } catch (Exception e) {
                }
            }
        } catch (IOException e2) {
            if (0 != 0) {
                try {
                    recordStore.closeRecordStore();
                } catch (Exception e3) {
                }
            }
        } catch (RuntimeException e4) {
            if (0 != 0) {
                try {
                    recordStore.closeRecordStore();
                } catch (Exception e5) {
                }
            }
        } catch (RecordStoreException e6) {
            if (0 != 0) {
                try {
                    recordStore.closeRecordStore();
                } catch (Exception e7) {
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    recordStore.closeRecordStore();
                } catch (Exception e8) {
                }
                throw th;
            }
        }
    }

    /* renamed from: e */
    private static void m123e(RecordStore recordStore) throws RecordStoreException, InvalidRecordIDException, IOException {
        f173c = new Vector();
        if (recordStore != null) {
            RecordEnumeration enumerateRecords = recordStore.enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
            if (enumerateRecords.hasNextElement()) {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(enumerateRecords.nextRecord()));
                int readInt = dataInputStream.readInt();
                for (int i = 0; i < readInt; i++) {
                    f173c.addElement(dataInputStream.readUTF());
                }
            }
        }
    }

    /* renamed from: f */
    public static void m124f() {
        if (use_bitmap_font) {
            try {
                if (f157a == null) {
                    f157a = new BitmapFont(false);
                }
                if (f165b == null) {
                    f165b = new BitmapFont(true);
                }
            } catch (OutOfMemoryError e) {
                System.gc();
                use_bitmap_font = false;
            }
        }
    }

    /* renamed from: g */
    public static void m125g() {
        Font font = Font.getFont(64, 0, font_size);
        int stringWidth = font.stringWidth("Ã…Ij");
        int charWidth = font.charWidth("Ã…Ij".charAt(0));
        int height = font.getHeight();
        Image createImage = Image.createImage(stringWidth, height);
        Graphics graphics = createImage.getGraphics();
        int[] iArr = new int[stringWidth];
        graphics.setColor(16777215);
        graphics.fillRect(0, 0, stringWidth, height);
        createImage.getRGB(iArr, 0, 1, 0, 0, 1, 1);
        int i = iArr[0];
        graphics.setColor(0);
        graphics.setFont(font);
        graphics.drawString("Ã…Ij", 0, 0, 0);
        f193j = 0;
        int i2 = 0;
        f195k = 0;
        boolean z = false;
        int i3 = height - 1;
        while (i3 >= 0) {
            createImage.getRGB(iArr, 0, stringWidth, 0, i3, stringWidth, 1);
            boolean z2 = z;
            int i4 = i2;
            for (int i5 = 0; i5 < stringWidth; i5++) {
                if (iArr[i5] != i) {
                    if (!z2) {
                        z2 = true;
                        f195k = (i3 + 1) - height;
                    }
                    i4 = -i3;
                    if (i5 >= charWidth) {
                        f193j = -i3;
                    }
                }
            }
            i3--;
            z = z2;
            i2 = i4;
        }
        if (i2 == f193j) {
            f193j++;
        } else {
            f193j = i2;
        }
    }

    /* renamed from: h */
    private static void init_string_resources() {
        byte b;
        if (current_locale.length() == 0) {
            current_locale = getSystemProperty("microedition.locale");
            if (current_locale != null) {
                if (current_locale.startsWith("no")) {
                    current_locale = "nb-NO";
                } else if (current_locale.startsWith("sv")) {
                    current_locale = "sv-SE";
                } else if (current_locale.startsWith("da")) {
                    current_locale = "da-DK";
                } else if (current_locale.startsWith("fi")) {
                    current_locale = "fi-FI";
                } else if (current_locale.startsWith("is")) {
                    current_locale = "nb-NO";
                } else if (current_locale.startsWith("de")) {
                    current_locale = "de-DE";
                } else if (current_locale.startsWith("nl")) {
                    current_locale = "nl-NL";
                } else if (current_locale.startsWith("bg")) {
                    current_locale = "bg-BG";
                }
            }
        }
        if (current_locale == null || current_locale.length() == 0) {
            current_locale = "en-US";
        }
        InputStream a = loadResourceByName("/l");
        if (a != null) {
            try {
                DataInputStream dataInputStream = new DataInputStream(a);
                if (3 == dataInputStream.readShort()) {
                    int readByte = dataInputStream.readByte();
                    available_locales_codes = new String[readByte];
                    avail_locales_names = new String[readByte];
                    byte b2 = -1;
                    for (byte b3 = 0; b3 < readByte; b3 = (byte) (b3 + 1)) {
                        String readUTF = dataInputStream.readUTF();
                        if (current_locale != null && readUTF.startsWith(current_locale)) {
                            current_locale = readUTF;
                            b2 = b3;
                        }
                        available_locales_codes[b3] = readUTF;
                    }
                    if (b2 == -1) {
                        current_locale = available_locales_codes[0];
                        b = 0;
                    } else {
                        b = b2;
                    }
                    int readShort = (short) (dataInputStream.readShort() - 1);
                    translations_resources = new String[readShort];
                    for (byte b4 = 0; b4 < readByte; b4++) {
                        avail_locales_names[b4] = dataInputStream.readUTF();
                        for (int i = 0; i < readShort; i++) {
                            String readUTF2 = dataInputStream.readUTF();
                            if (b4 == b) {
                                translations_resources[i] = readUTF2;
                            }
                        }
                    }
                }
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: i */
    private static void m127i() {
        if (f159a != null) {
            m79a("b1", true);
        }
    }
}
