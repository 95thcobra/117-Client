public class Class67 {
	static int anInt600;
	static short[] aShortArray601;
	static int anInt602;
	static int[][] anIntArrayArray598 = new int[128][128];
	static int[][] anIntArrayArray599 = new int[128][128];
	static int[] anIntArray603 = new int[4096];
	static int[] anIntArray597 = new int[4096];

	public static void method313(final Class100 var0, final Class100 var1) {
		Class131_Sub20_Sub6.aClass100_1451 = var0;
		Class131_Sub20_Sub6.aClass100_1462 = var1;
	}

	static Class131_Sub20_Sub16 method314(final int var0) {
		final Class131_Sub20_Sub16 var1 = (Class131_Sub20_Sub16) Class131_Sub20_Sub1.aClass121_1355.method482(var0);
		if (var1 != null)
			return var1;
		else {
			final Class100 var2 = Class131_Sub20_Sub1.aClass100_1352;
			final Class100 var3 = Class131_Sub20_Sub1.aClass100_1354;
			boolean var4 = true;
			final int[] var5 = var2.method420(var0);

			for (final int element : var5) {
				final byte[] var7 = var2.method409(var0, element);
				if (null == var7)
					var4 = false;
				else {
					final int var8 = ((var7[0] & 255) << 8) | (var7[1] & 255);
					final byte[] var9 = var3.method409(var8, 0);
					if (null == var9)
						var4 = false;
				}
			}

			Class131_Sub20_Sub16 var10;
			if (!var4)
				var10 = null;
			else
				try {
					var10 = new Class131_Sub20_Sub16(var2, var3, var0, false);
				} catch (final Exception var12) {
					var10 = null;
				}

			return var10;
		}
	}

	static int method315(final int var0) {
		final Class131_Sub20_Sub8 var1 = (Class131_Sub20_Sub8) Class32.aClass125_301.method487(var0);
		return var1 == null ? -1
				: (var1.aClass131_Sub20_1319 == Class32.aClass124_299.aClass131_Sub20_882 ? -1
						: ((Class131_Sub20_Sub8) var1.aClass131_Sub20_1319).anInt1499);
	}

	static Class79 method316() {
		try {
			return new Class79_Sub2();
		} catch (final Throwable var1) {
			return new Class79_Sub1();
		}
	}

	static void method317() {
		client.aLong2196 = -1L;
		client.anInt2043 = -1;
		client.aClass40_2209.anInt415 = 0;
		Class2.aBool8 = true;
		client.aBool2044 = true;
		client.aLong2249 = -1L;
		Class36.method209();
		client.secureBuffer.pos = 0;
		client.gameBuffer.pos = 0;
		client.incomingPacket = -1;
		client.anInt2041 = 1;
		client.anInt2219 = -1;
		client.anInt2154 = -1;
		client.anInt2075 = 0;
		client.anInt2046 = 0;
		client.anInt2080 = 0;
		client.anInt2193 = 0;
		client.anInt2166 = 0;
		client.aBool2047 = false;
		Class81.anInt667 = 0;
		Class46.method233();
		client.anInt2090 = 0;
		client.aBool2178 = false;
		client.anInt2289 = 0;
		client.anInt2119 = (int) (Math.random() * 100.0D) - 50;
		client.anInt2093 = (int) (Math.random() * 110.0D) - 55;
		client.anInt2095 = (int) (Math.random() * 80.0D) - 40;
		client.anInt2236 = (int) (Math.random() * 120.0D) - 60;
		client.anInt2100 = (int) (Math.random() * 30.0D) - 20;
		client.anInt2111 = ((int) (Math.random() * 20.0D) - 10) & 2047;
		client.anInt2259 = 0;
		client.anInt2159 = -1;
		client.anInt2218 = 0;
		client.anInt2258 = 0;
		client.aClass50_2055 = Class50.aClass50_490;
		client.aClass50_2056 = Class50.aClass50_490;
		client.anInt2230 = 0;
		GPI.localPlayers = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			GPI.cachedAppearances[var0] = null;
			GPI.aByteArray22[var0] = 1;
		}

		for (var0 = 0; var0 < 2048; ++var0)
			client.playerArray[var0] = null;

		for (var0 = 0; var0 < '\u8000'; ++var0)
			client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var0] = null;

		client.anInt2200 = -1;
		client.aClass115_2284.method462();
		client.aClass115_2160.method462();

		int var1;
		int var3;
		for (var0 = 0; var0 < 4; ++var0)
			for (var3 = 0; var3 < 104; ++var3)
				for (var1 = 0; var1 < 104; ++var1)
					client.aClass115ArrayArrayArray2306[var0][var3][var1] = null;

		client.aClass115_2158 = new Class115();
		client.anInt2134 = 0;
		client.anInt2290 = 0;
		client.anInt2294 = 0;

		for (var0 = 0; var0 < Class65.anInt594; ++var0) {
			final Class131_Sub20_Sub15 var4 = Class99.method399(var0);
			if (null != var4) {
				Class96.anIntArray764[var0] = 0;
				Class96.anIntArray766[var0] = 0;
			}
		}

		Class131_Sub7.aClass48_1026.method241();
		client.anInt2069 = -1;
		if (client.anInt2128 != -1) {
			var0 = client.anInt2128;
			if ((var0 != -1) && Class131_Sub18.aBoolArray1148[var0]) {
				Class131_Sub18.aClass100_1206.method410(var0);
				if (Class131_Sub18.aClass131_Sub18ArrayArray1174[var0] != null) {
					boolean var6 = true;

					for (var1 = 0; var1 < Class131_Sub18.aClass131_Sub18ArrayArray1174[var0].length; ++var1)
						if (Class131_Sub18.aClass131_Sub18ArrayArray1174[var0][var1] != null)
							if (Class131_Sub18.aClass131_Sub18ArrayArray1174[var0][var1].anInt1202 != 2)
								Class131_Sub18.aClass131_Sub18ArrayArray1174[var0][var1] = null;
							else
								var6 = false;

					if (var6)
						Class131_Sub18.aClass131_Sub18ArrayArray1174[var0] = null;

					Class131_Sub18.aBoolArray1148[var0] = false;
				}
			}
		}

		for (Class131_Sub7 var2 = (Class131_Sub7) client.aClass114_2184
				.method460(); null != var2; var2 = (Class131_Sub7) client.aClass114_2184.method458())
			Class131_Sub6.method553(var2, true);

		client.anInt2128 = -1;
		client.aClass114_2184 = new Class114(8);
		client.aClass131_Sub18_2049 = null;
		client.aBool2047 = false;
		client.anInt2166 = 0;
		client.aClass91_2296.method380((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			client.aStringArray2153[var0] = null;
			client.aBoolArray2113[var0] = false;
		}

		Class131_Sub7.method558();
		client.aBool2037 = true;

		for (var0 = 0; var0 < 100; ++var0)
			client.aBoolArray2252[var0] = true;

		client.secureBuffer.method871(81);
		final Class131_Sub14_Sub1 var5 = client.secureBuffer;
		var3 = client.aBool2237 ? 2 : 1;
		var5.writeByte(var3);
		client.secureBuffer.method586(Class2.anInt7);
		client.secureBuffer.method586(Class88.anInt723);
		client.aString2250 = null;
		Class23.anInt210 = 0;
		Class131_Sub20_Sub8.aClass131_Sub13Array1498 = null;

		for (var0 = 0; var0 < 8; ++var0)
			client.grandExchangeOffers[var0] = new GrandExchangeOffer();

		Class78.aClass141_646 = null;
	}

	static char method318(final char var0) {
		switch (var0) {
		case '\u0020':
		case '\u002d':
		case '\u005f':
		case '\u00a0':
			return '\u005f';
		case '\u0023':
		case '\u005b':
		case '\u005d':
			return var0;
		case '\u00c0':
		case '\u00c1':
		case '\u00c2':
		case '\u00c3':
		case '\u00c4':
		case '\u00e0':
		case '\u00e1':
		case '\u00e2':
		case '\u00e3':
		case '\u00e4':
			return '\u0061';
		case '\u00c7':
		case '\u00e7':
			return '\u0063';
		case '\u00c8':
		case '\u00c9':
		case '\u00ca':
		case '\u00cb':
		case '\u00e8':
		case '\u00e9':
		case '\u00ea':
		case '\u00eb':
			return '\u0065';
		case '\u00cd':
		case '\u00ce':
		case '\u00cf':
		case '\u00ed':
		case '\u00ee':
		case '\u00ef':
			return '\u0069';
		case '\u00d1':
		case '\u00f1':
			return '\u006e';
		case '\u00d2':
		case '\u00d3':
		case '\u00d4':
		case '\u00d5':
		case '\u00d6':
		case '\u00f2':
		case '\u00f3':
		case '\u00f4':
		case '\u00f5':
		case '\u00f6':
			return '\u006f';
		case '\u00d9':
		case '\u00da':
		case '\u00db':
		case '\u00dc':
		case '\u00f9':
		case '\u00fa':
		case '\u00fb':
		case '\u00fc':
			return '\u0075';
		case '\u00df':
			return '\u0062';
		case '\u00ff':
		case '\u0178':
			return '\u0079';
		default:
			return Character.toLowerCase(var0);
		}
	}
}
