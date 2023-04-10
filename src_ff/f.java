//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

class f implements Runnable {
    private String Code;
    private String I;

    public f(String var1, String var2) {
        StringBuffer var3 = new StringBuffer();
        if (var1 != null) {
            for(int var4 = 0; var4 < var1.length(); ++var4) {
                if (Character.isDigit(var1.charAt(var4)) || var1.charAt(var4) == '+' && var4 == 0) {
                    var3.append(var1.charAt(var4));
                }
            }
        }

        var1 = var3.toString();
        this.Code = "sms://" + var1;
        this.I = var2;
    }

    public final void Code() {
        e.Code(this);
    }

    public void run() {
        MessageConnection var1 = null;
        String var10000 = this.Code;

        label84: {
            Throwable var13;
            label88: {
                boolean var10001;
                try {
                    try {
                        TextMessage var12;
                        (var12 = (TextMessage)(var1 = (MessageConnection)Connector.open(var10000)).newMessage("text")).setPayloadText(this.I);
                        var1.send(var12);
                        Code.Code.Code("SMS", e.Code(71));
                        break label84;
                    } catch (Exception var10) {
                    }
                } catch (Throwable var11) {
                    var13 = var11;
                    var10001 = false;
                    break label88;
                }

                Code var14 = Code.Code;
                String var15 = "SMS";
                byte var10002 = 55;

                try {
                    var14.Code(var15, e.Code(var10002));
                } catch (Throwable var9) {
                    var13 = var9;
                    var10001 = false;
                    break label88;
                }

                e.Code(var1);
                return;
            }

            Throwable var2 = var13;
            e.Code(var1);
            throw var2;
        }

        e.Code(var1);
    }
}
