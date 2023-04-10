//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Enumeration;
import javax.microedition.pim.Contact;
import javax.microedition.pim.PIM;
import javax.microedition.pim.PIMList;

class Z {
    private static String Code(String var0) {
        StringBuffer var1 = new StringBuffer(var0.length());
        int var2 = 0;

        while(true) {
            while(var2 < var0.length()) {
                char var3;
                if ((var3 = var0.charAt(var2)) >= ' ' && var3 != '"' && var3 != '\\') {
                    var1.append(var3);
                    ++var2;
                } else {
                    var1.append("\\u").append(var3 < 16 ? "000" : "00").append(Integer.toHexString(var3));
                    ++var2;
                }
            }

            return var1.toString();
        }
    }

    Z() {
    }

    static String Code() {
        PIM var0 = PIM.getInstance();
        int var1 = 0;
        String[] var2 = var0.listPIMLists(1);
        StringBuffer var3 = new StringBuffer(512);
        StringBuffer var4 = new StringBuffer(128);
        int var5 = 0;

        while(true) {
            label934:
            while(var5 < var2.length) {
                int var6 = 0;

                while(true) {
                    int var10001;
                    boolean var54;
                    if (var6 < var5) {
                        String[] var10000 = var2;
                        var10001 = var5;

                        label874:
                        try {
                            if (var10000[var10001].equals(var2[var6])) {
                                ++var5;
                                break;
                            }

                            ++var6;
                            continue;
                        } catch (Throwable var45) {
                            var54 = false;
                            break label874;
                        }
                    } else {
                        label929: {
                            Enumeration var7;
                            PIMList var50;
                            try {
                                var7 = (var50 = var0.openPIMList(1, 1, var2[var5])).items();
                            } catch (Throwable var49) {
                                var54 = false;
                                break label929;
                            }

                            while(true) {
                                boolean var51;
                                try {
                                    var51 = var7.hasMoreElements();
                                } catch (Throwable var46) {
                                    var54 = false;
                                    break;
                                }

                                if (!var51) {
                                    ++var5;
                                    continue label934;
                                }

                                Enumeration var52 = var7;

                                try {
                                    Contact var8;
                                    int[] var9 = (var8 = (Contact)var52.nextElement()).getFields();

                                    for(int var10 = 0; var10 < var9.length; ++var10) {
                                        int[] var53 = var9;
                                        var10001 = var10;
                                        boolean var29 = false;

                                        try {
                                            var29 = true;
                                            int var11;
                                            if ((var11 = var53[var10001]) < 100) {
                                                var29 = false;
                                            } else if (var11 > 118) {
                                                var29 = false;
                                            } else if (var11 == 108) {
                                                var29 = false;
                                            } else if (var11 == 113) {
                                                var29 = false;
                                            } else if (var11 == 117) {
                                                var29 = false;
                                            } else {
                                                int var12 = var8.countValues(var11);
                                                int var13 = var50.getFieldDataType(var11);
                                                StringBuffer var14 = new StringBuffer("[");

                                                for(int var15 = 0; var15 < var12; ++var15) {
                                                    StringBuffer var16 = new StringBuffer();
                                                    if (var13 == 4) {
                                                        String var55;
                                                        if ((var55 = var8.getString(var11, var15)) != null) {
                                                            var16.append('"').append(Code(var55)).append('"');
                                                        }
                                                    } else if (var13 == 5) {
                                                        var16.append("[");
                                                        String[] var17 = var8.getStringArray(var11, var15);

                                                        for(int var18 = 0; var18 < var17.length; ++var18) {
                                                            if (var17[var18] != null && var17[var18].length() > 0) {
                                                                var16.append('"').append(Code(var17[var18])).append("\",");
                                                            }
                                                        }

                                                        var16.setCharAt(var16.length() - 1, ']');
                                                    }

                                                    if (var16.length() > 2) {
                                                        var14.append(var16).append(',');
                                                    }
                                                }

                                                var14.setCharAt(var14.length() - 1, ']');
                                                if (var14.length() <= 1) {
                                                    var29 = false;
                                                } else {
                                                    if (var4.length() > 0) {
                                                        var4.append(',');
                                                    }

                                                    var4.append('"').append((char)var11).append("\":").append(var14);
                                                    var29 = false;
                                                }
                                            }
                                        } finally {
                                            if (var29) {
                                                ++var10;
                                            }
                                        }
                                    }

                                    if (var1 > 0) {
                                        var3.append(',');
                                    }

                                    var3.append('{').append(var4.toString()).append('}');
                                    var4.setLength(0);
                                } finally {
                                    ;
                                }

                                ++var1;
                            }
                        }
                    }

                    ++var5;
                    break;
                }
            }

            if (var1 > 0) {
                return var3.insert(0, "{\"c\":[").append("]}").toString();
            }

            return "{\"c\":[]}";
        }
    }
}
