public class Class131_Sub19 extends Class131 {
	int anInt1295;
	int anInt1304;
	int anInt1309;
	int anInt1310;
	int anInt1312;
	int anInt1316;
	String aString1305;
	String aString1296;
	String aString1317;
	String aString1308;
	int[] anIntArray1315 = new int[3];
	int anInt1294;
	boolean aBool1311;
	int anInt1297;
	int anInt1302;
	int anInt1307;
	int anInt1299;
	int anInt1300;
	boolean aBool1301;
	int anInt1306;
	int anInt1298;
	int anInt1303;
	String aString1313;
	String aString1314;

	void method672() {
		if (aString1305.length() > 40)
			aString1305 = aString1305.substring(0, 40);

		if (aString1296.length() > 40)
			aString1296 = aString1296.substring(0, 40);

		if (aString1317.length() > 10)
			aString1317 = aString1317.substring(0, 10);

		if (aString1308.length() > 10)
			aString1308 = aString1308.substring(0, 10);

	}

	static final void method673(final int var0, final int var1, final int var2, final int var3,
			final Class131_Sub20_Sub17_Sub3 var4, final Class131_Sub20_Sub21 var5) {
		if (null != var4) {
			final int var6 = (client.anInt2236 + client.anInt2111) & 2047;
			final int var7 = (var3 * var3) + (var2 * var2);
			if (var7 <= 6400) {
				int var9 = Class131_Sub20_Sub17_Sub1.anIntArray1787[var6];
				int var8 = Class131_Sub20_Sub17_Sub1.anIntArray1770[var6];
				var9 = (var9 * 256) / (client.anInt2100 + 256);
				var8 = (256 * var8) / (256 + client.anInt2100);
				final int var10 = ((var3 * var9) + (var2 * var8)) >> 16;
				final int var11 = ((var8 * var3) - (var9 * var2)) >> 16;
				if (var7 > 2500)
					var4.method959(((var5.anInt1658 / 2) + var10) - (var4.anInt1826 / 2),
							(var5.anInt1659 / 2) - var11 - (var4.anInt1828 / 2), var0, var1, var5.anInt1658,
							var5.anInt1659, var5.anIntArray1656, var5.anIntArray1657);
				else
					var4.method968((var10 + (var5.anInt1658 / 2) + var0) - (var4.anInt1826 / 2),
							(var1 + (var5.anInt1659 / 2)) - var11 - (var4.anInt1828 / 2));

			}
		}
	}

	public Class131_Sub19(final boolean var1) {
		if (Class48.aString469.startsWith("win"))
			anInt1294 = 1;
		else if (Class48.aString469.startsWith("mac"))
			anInt1294 = 2;
		else if (Class48.aString469.startsWith("linux"))
			anInt1294 = 3;
		else
			anInt1294 = 4;

		String var2;
		try {
			var2 = System.getProperty("os.arch").toLowerCase();
		} catch (final Exception var13) {
			var2 = "";
		}

		String var4;
		try {
			var4 = System.getProperty("os.version").toLowerCase();
		} catch (final Exception var12) {
			var4 = "";
		}

		String var3 = "Unknown";
		String var5 = "1.1";

		try {
			var3 = System.getProperty("java.vendor");
			var5 = System.getProperty("java.version");
		} catch (final Exception var11) {
			;
		}

		if (!var2.startsWith("amd64") && !var2.startsWith("x86_64"))
			aBool1311 = false;
		else
			aBool1311 = true;

		if (anInt1294 == 1) {
			if (var4.indexOf("4.0") != -1)
				anInt1297 = 1;
			else if (var4.indexOf("4.1") != -1)
				anInt1297 = 2;
			else if (var4.indexOf("4.9") != -1)
				anInt1297 = 3;
			else if (var4.indexOf("5.0") != -1)
				anInt1297 = 4;
			else if (var4.indexOf("5.1") != -1)
				anInt1297 = 5;
			else if (var4.indexOf("5.2") != -1)
				anInt1297 = 8;
			else if (var4.indexOf("6.0") != -1)
				anInt1297 = 6;
			else if (var4.indexOf("6.1") != -1)
				anInt1297 = 7;
			else if (var4.indexOf("6.2") != -1)
				anInt1297 = 9;
			else if (var4.indexOf("6.3") != -1)
				anInt1297 = 10;
		} else if (anInt1294 == 2)
			if (var4.indexOf("10.4") != -1)
				anInt1297 = 20;
			else if (var4.indexOf("10.5") != -1)
				anInt1297 = 21;
			else if (var4.indexOf("10.6") != -1)
				anInt1297 = 22;
			else if (var4.indexOf("10.7") != -1)
				anInt1297 = 23;
			else if (var4.indexOf("10.8") != -1)
				anInt1297 = 24;
			else if (var4.indexOf("10.9") != -1)
				anInt1297 = 25;
			else if (var4.indexOf("10.10") != -1)
				anInt1297 = 26;

		if (var3.toLowerCase().indexOf("sun") != -1)
			anInt1302 = 1;
		else if (var3.toLowerCase().indexOf("microsoft") != -1)
			anInt1302 = 2;
		else if (var3.toLowerCase().indexOf("apple") != -1)
			anInt1302 = 3;
		else if (var3.toLowerCase().indexOf("oracle") != -1)
			anInt1302 = 5;
		else
			anInt1302 = 4;

		int var7 = 2;
		int var8 = 0;

		char var9;
		try {
			while (var7 < var5.length()) {
				var9 = var5.charAt(var7);
				if ((var9 < 48) || (var9 > 57))
					break;

				var8 = (var9 - 48) + (10 * var8);
				++var7;
			}
		} catch (final Exception var16) {
			;
		}

		anInt1307 = var8;
		var7 = var5.indexOf(46, 2) + 1;
		var8 = 0;

		try {
			while (var7 < var5.length()) {
				var9 = var5.charAt(var7);
				if ((var9 < 48) || (var9 > 57))
					break;

				var8 = (var8 * 10) + (var9 - 48);
				++var7;
			}
		} catch (final Exception var15) {
			;
		}

		anInt1299 = var8;
		var7 = var5.indexOf(95, 4) + 1;
		var8 = 0;

		try {
			while (var7 < var5.length()) {
				var9 = var5.charAt(var7);
				if ((var9 < 48) || (var9 > 57))
					break;

				var8 = (10 * var8) + (var9 - 48);
				++var7;
			}
		} catch (final Exception var14) {
			;
		}

		anInt1300 = var8;
		aBool1301 = false;
		anInt1306 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
		if (anInt1307 > 3)
			anInt1298 = Runtime.getRuntime().availableProcessors();
		else
			anInt1298 = 0;

		anInt1303 = 0;
		if (aString1305 == null)
			aString1305 = "";

		if (null == aString1296)
			aString1296 = "";

		if (aString1317 == null)
			aString1317 = "";

		if (aString1308 == null)
			aString1308 = "";

		if (null == aString1313)
			aString1313 = "";

		if (aString1314 == null)
			aString1314 = "";

		method672();
	}

	public int method674() {
		final byte var1 = 38;
		int var2 = var1 + Class131_Sub20_Sub8.method745(aString1305);
		var2 += Class131_Sub20_Sub8.method745(aString1296);
		var2 += Class131_Sub20_Sub8.method745(aString1317);
		var2 += Class131_Sub20_Sub8.method745(aString1308);
		var2 += Class131_Sub20_Sub8.method745(aString1313);
		var2 += Class131_Sub20_Sub8.method745(aString1314);
		return var2;
	}

	public void method675(final DataBuffer var1) {
		var1.writeByte(6);
		var1.writeByte(anInt1294);
		var1.writeByte(aBool1311 ? 1 : 0);
		var1.writeByte(anInt1297);
		var1.writeByte(anInt1302);
		var1.writeByte(anInt1307);
		var1.writeByte(anInt1299);
		var1.writeByte(anInt1300);
		var1.writeByte(aBool1301 ? 1 : 0);
		var1.method586(anInt1306);
		var1.writeByte(anInt1298);
		var1.method587(anInt1303);
		var1.method586(anInt1304 * 147255);
		var1.method590(aString1305);
		var1.method590(aString1296);
		var1.method590(aString1317);
		var1.method590(aString1308);
		var1.writeByte(anInt1310);
		var1.method586(anInt1309);
		var1.method590(aString1313);
		var1.method590(aString1314);
		var1.writeByte(anInt1295);
		var1.writeByte(anInt1312);

		for (final int element : anIntArray1315)
			var1.writeInt(element);

		var1.writeInt(anInt1316);
	}

	static final void method676(final int var0, final int var1) {
		final Class115 var2 = client.aClass115ArrayArrayArray2306[Class39.anInt410][var0][var1];
		if (var2 == null)
			Class65.aClass33_595.method163(Class39.anInt410, var0, var1);
		else {
			long var4 = -99999999L;
			Class131_Sub20_Sub19_Sub3 var6 = null;

			Class131_Sub20_Sub19_Sub3 var7;
			for (var7 = (Class131_Sub20_Sub19_Sub3) var2
					.method465(); var7 != null; var7 = (Class131_Sub20_Sub19_Sub3) var2.method468()) {
				final Class131_Sub20_Sub2 var3 = Class79_Sub1.method645(var7.anInt1764, (short) 23633);
				long var9 = var3.anInt1391;
				if (var3.anInt1408 == 1)
					var9 *= 1 + var7.anInt1763;

				if (var9 > var4) {
					var4 = var9;
					var6 = var7;
				}
			}

			if (null == var6)
				Class65.aClass33_595.method163(Class39.anInt410, var0, var1);
			else {
				var2.method464(var6);
				Class131_Sub20_Sub19_Sub3 var12 = null;
				Class131_Sub20_Sub19_Sub3 var8 = null;

				for (var7 = (Class131_Sub20_Sub19_Sub3) var2
						.method465(); null != var7; var7 = (Class131_Sub20_Sub19_Sub3) var2.method468())
					if (var7.anInt1764 != var6.anInt1764) {
						if (null == var12)
							var12 = var7;

						if ((var12.anInt1764 != var7.anInt1764) && (null == var8))
							var8 = var7;
					}

				final int var11 = (var1 << 7) + var0 + 1610612736;
				Class65.aClass33_595.method152(Class39.anInt410, var0, var1,
						Class18.method88(64 + (var0 * 128), (128 * var1) + 64, Class39.anInt410), var6, var11, var12,
						var8);
			}
		}
	}
}
