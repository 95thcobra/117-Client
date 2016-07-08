import java.applet.Applet;

import netscape.javascript.JSObject;

public class Class76 {
	public static void method341(final Applet var0, final String var1) throws Throwable {
		JSObject.getWindow(var0).eval(var1);
	}

	public static Object method342(final Applet var0, final String var1) throws Throwable {
		return JSObject.getWindow(var0).call(var1, (Object[]) null);
	}

	public static Object method343(final Applet var0, final String var1, final Object[] var2) throws Throwable {
		return JSObject.getWindow(var0).call(var1, var2);
	}
}
