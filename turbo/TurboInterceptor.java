package com.opera.android.turbo;

import android.content.pm.PackageManager;
import android.os.Build;
import com.opera.android.utilities.SystemUtil;

@gyw
/* compiled from: OperaSrc */
public abstract class TurboInterceptor {
    private static boolean a;
    private static boolean b;

    private static native void nativeUpdate(int i, String str);

    private static native void setupX86();

    private TurboInterceptor() {
    }

    static void a(int i, String str) {
        nativeUpdate(i, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return (java.lang.String[]) r0.invoke(null, r2.invoke(null, new java.lang.Object[0]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        r0 = r2.getDeclaredMethod("getWebViewNativeLibraryPaths", android.content.pm.PackageInfo.class);
        r2 = r2.getDeclaredMethod("getLoadedPackageInfo", new java.lang.Class[0]);
        r2.setAccessible(true);
        r0.setAccessible(true);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x005f A[ExcHandler: ClassNotFoundException | IllegalAccessException | InvocationTargetException (e java.lang.Throwable), Splitter:B:3:0x0009] */
    @defpackage.gyu
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String[] getWebviewLibraryPaths() {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.turbo.TurboInterceptor.getWebviewLibraryPaths():java.lang.String[]");
    }

    @gyu
    public static int getTargetSdkVersion() {
        try {
            return bxn.d().getPackageManager().getApplicationInfo(bxn.d().getPackageName(), 0).targetSdkVersion;
        } catch (PackageManager.NameNotFoundException e) {
            return 0;
        }
    }

    @gyu
    private static synchronized void reportSuccess(boolean z, boolean z2) {
        boolean z3 = true;
        synchronized (TurboInterceptor.class) {
            if (Build.VERSION.SDK_INT >= 19) {
                if (!z || !z2) {
                    z3 = false;
                }
                a = z3;
            } else {
                a = z2;
            }
            if (!a && !b && SystemUtil.m()) {
                b = true;
                try {
                    System.loadLibrary("tix86");
                    setupX86();
                } catch (Throwable th) {
                }
            }
        }
    }

    public static synchronized boolean a() {
        boolean z;
        synchronized (TurboInterceptor.class) {
            z = a;
        }
        return z;
    }
}