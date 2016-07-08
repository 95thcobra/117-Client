import java.applet.Applet;

public class RuntimeException_Sub1 extends RuntimeException {
	/**
	 *
	 */
	private static final long serialVersionUID = -6173996975610487958L;
	Throwable aThrowable1950;
	public static String aString1951;
	static Applet anApplet1952;
	String aString1953;
	static boolean aBool1954;
	static int anInt1955;

	static final void method1033(final int var0, final int var1) {
		int var2 = GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15.method1037("Choose Option");

		int var3;
		for (var3 = 0; var3 < client.anInt2166; ++var3) {
			final Class131_Sub20_Sub17_Sub4_Sub1 var6 = GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15;
			String var4;
			if (client.aStringArray2172[var3].length() > 0)
				var4 = client.aStringArray2195[var3] + " " + client.aStringArray2172[var3];
			else
				var4 = client.aStringArray2195[var3];

			final int var7 = var6.method1037(var4);
			if (var7 > var2)
				var2 = var7;
		}

		var2 += 8;
		var3 = 22 + (client.anInt2166 * 15);
		int var5 = var0 - (var2 / 2);
		if ((var2 + var5) > Class2.anInt7)
			var5 = Class2.anInt7 - var2;

		if (var5 < 0)
			var5 = 0;

		int var8 = var1;
		if ((var1 + var3) > Class88.anInt723)
			var8 = Class88.anInt723 - var3;

		if (var8 < 0)
			var8 = 0;

		client.aBool2047 = true;
		Class131_Sub20_Sub19_Sub2.anInt1760 = var5;
		Class48.anInt476 = var8;
		Class131_Sub20_Sub6.anInt1488 = var2;
		Class5.anInt60 = (client.anInt2166 * 15) + 22;
	}
}
