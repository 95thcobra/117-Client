public class Class45 {
	int anInt447;
	int anInt448;
	int anInt449;
	static int[] anIntArray450;
	static int anInt451;

	public static final boolean method225() {
		final Class80 var0 = Class80.aClass80_655;
		synchronized (var0) {
			if (Class80.anInt663 == Class80.anInt653)
				return false;
			else {
				Class131_Sub12.anInt1095 = Class80.anIntArray657[Class80.anInt653];
				Class40.aChar413 = Class80.aCharArray656[Class80.anInt653];
				Class80.anInt653 = (1 + Class80.anInt653) & 127;
				return true;
			}
		}
	}

	static String method226(String var0, final boolean var1) {
		final String var2 = var1 ? "https://" : "http://";
		if (client.anInt2030 == 1)
			var0 = var0 + "-wtrc";
		else if (client.anInt2030 == 2)
			var0 = var0 + "-wtqa";
		else if (client.anInt2030 == 3)
			var0 = var0 + "-wtwip";
		else if (client.anInt2030 == 5)
			var0 = var0 + "-wti";
		else if (client.anInt2030 == 4)
			var0 = "local";

		String var3 = "";
		if (client.aString2150 != null)
			var3 = "/p=" + client.aString2150;

		final String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + client.anInt2034 + "/a=" + Class39.anInt412 + var3 + "/";
	}

	public static Class88 method227(final int var0) {
		final Class88[] var1 = Class24.method110();

		for (final Class88 var2 : var1) {
			if (var2.anInt721 == var0)
				return var2;
		}

		return null;
	}

	static final void method228(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6, final int var7) {
		if (Class77.method344(var0)) {
			Class131_Sub18.aClass131_Sub18Array1293 = null;
			Class131_Sub20_Sub4.method718(Class131_Sub18.aClass131_Sub18ArrayArray1174[var0], -1, var1, var2, var3,
					var4, var5, var6, var7);
			if (null != Class131_Sub18.aClass131_Sub18Array1293) {
				Class131_Sub20_Sub4.method718(Class131_Sub18.aClass131_Sub18Array1293, -1412584499, var1, var2, var3,
						var4, Player1.anInt1637, Class46.anInt453, var7);
				Class131_Sub18.aClass131_Sub18Array1293 = null;
			}

		} else if (var7 != -1)
			client.aBoolArray2252[var7] = true;
		else
			for (int var8 = 0; var8 < 100; ++var8)
				client.aBoolArray2252[var8] = true;
	}

	static void method229(final int var0, final Class75 var1, final Class100_Sub1 var2) {
		byte[] var3 = null;
		final Class115 var4 = Class105.aClass115_807;
		synchronized (var4) {
			for (Class131_Sub17 var5 = (Class131_Sub17) Class105.aClass115_807
					.method465(); null != var5; var5 = (Class131_Sub17) Class105.aClass115_807.method468())
				if ((var0 == var5.aLong902) && (var1 == var5.aClass75_1144) && (var5.anInt1143 == 0)) {
					var3 = var5.aByteArray1142;
					break;
				}
		}

		if (var3 != null)
			var2.method652(var1, var0, var3, true);
		else {
			final byte[] var8 = var1.method337(var0);
			var2.method652(var1, var0, var8, true);
		}
	}
}
