package p000;

import javax.microedition.lcdui.TextBox;

/* renamed from: i */
public final class C0008i extends TextBox {

    /* renamed from: a */
    public C0014o f92a;

    public C0008i(String str, String str2, int i, int i2, C0014o oVar) {
        super(str, str2, i, i2);
        this.f92a = oVar;
    }

    public final String getString() {
        String string = C0008i.super.getString();
        if (string == null || string.length() == 0 || getConstraints() != 3) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer(string);
        int i = 0;
        while (i < stringBuffer.length()) {
            char charAt = stringBuffer.charAt(i);
            if (Character.isDigit(charAt) || charAt == '(' || charAt == ')' || charAt == '-' || charAt == '+' || charAt == ' ') {
                i++;
            } else {
                stringBuffer.deleteCharAt(i);
            }
        }
        return new String(stringBuffer);
    }
}
