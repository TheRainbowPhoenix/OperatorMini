package defpackage;

import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

/* access modifiers changed from: package-private */
/* renamed from: f  reason: default package */
public class f implements Runnable {
    private String Code;
    private String I;

    public f(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i)) || (str.charAt(i) == '+' && i == 0)) {
                    stringBuffer.append(str.charAt(i));
                }
            }
        }
        this.Code = new StringBuffer().append("sms://").append(stringBuffer.toString()).toString();
        this.I = str2;
    }

    public final void Code() {
        e.Code((Runnable) this);
    }

    public void run() {
        Connection connection;
        Throwable th;
        Connection connection2;
        try {
            connection2 = (MessageConnection) Connector.open(this.Code);
            try {
                TextMessage newMessage = connection2.newMessage("text");
                newMessage.setPayloadText(this.I);
                connection2.send(newMessage);
                Code.f89Code.Code("SMS", e.m122Code(71));
                e.Code(connection2);
            } catch (Exception e) {
                try {
                    Code.f89Code.Code("SMS", e.m122Code(55));
                    e.Code(connection2);
                } catch (Throwable th2) {
                    th = th2;
                    connection = connection2;
                    e.Code(connection);
                    throw th;
                }
            }
        } catch (Exception e2) {
            connection2 = null;
            Code.f89Code.Code("SMS", e.m122Code(55));
            e.Code(connection2);
        } catch (Throwable th3) {
            th = th3;
            connection = null;
            e.Code(connection);
            throw th;
        }
    }
}
