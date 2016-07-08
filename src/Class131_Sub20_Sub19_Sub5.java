public class Class131_Sub20_Sub19_Sub5 extends Class131_Sub20_Sub19 {
	static int anInt1832;
	static Class18 aClass18_1837;
	public static Class16 aClass16_1839;
	int anInt1838;
	int anInt1834;
	int anInt1830;
	int anInt1831;
	int anInt1840;
	int anInt1833;
	Class131_Sub20_Sub1 aClass131_Sub20_Sub1_1829;
	int anInt1835;
	int anInt1836;

	Class131_Sub20_Sub19_Sub5(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final boolean var8, final Class131_Sub20_Sub19 var9) {
		anInt1838 = var1;
		anInt1834 = var2;
		anInt1830 = var3;
		anInt1831 = var4;
		anInt1840 = var5;
		anInt1833 = var6;
		if (var7 != -1) {
			aClass131_Sub20_Sub1_1829 = Class131_Sub20_Sub19_Sub2_Sub1.method1066(var7);
			anInt1835 = 0;
			anInt1836 = client.anInt2038 - 1;
			if ((aClass131_Sub20_Sub1_1829.anInt1369 == 0) && (var9 != null)
					&& (var9 instanceof Class131_Sub20_Sub19_Sub5)) {
				final Class131_Sub20_Sub19_Sub5 var10 = (Class131_Sub20_Sub19_Sub5) var9;
				if (aClass131_Sub20_Sub1_1829 == var10.aClass131_Sub20_Sub1_1829) {
					anInt1835 = var10.anInt1835;
					anInt1836 = var10.anInt1836;
					return;
				}
			}

			if (var8 && (aClass131_Sub20_Sub1_1829.anInt1368 != -1)) {
				anInt1835 = (int) (Math.random() * aClass131_Sub20_Sub1_1829.anIntArray1353.length);
				anInt1836 -= (int) (Math.random() * aClass131_Sub20_Sub1_1829.anIntArray1358[anInt1835]);
			}
		}

	}

	@Override
	protected final Class131_Sub20_Sub19_Sub7 method868(final short var1) {
		if (null != aClass131_Sub20_Sub1_1829) {
			int var6 = client.anInt2038 - anInt1836;
			if ((var6 > 100) && (aClass131_Sub20_Sub1_1829.anInt1368 > 0))
				var6 = 100;

			label61: {
				do {
					do {
						if (var6 <= aClass131_Sub20_Sub1_1829.anIntArray1358[anInt1835])
							break label61;

						var6 -= aClass131_Sub20_Sub1_1829.anIntArray1358[anInt1835];
						++anInt1835;
					} while (anInt1835 < aClass131_Sub20_Sub1_1829.anIntArray1353.length);

					anInt1835 -= aClass131_Sub20_Sub1_1829.anInt1368;
				} while ((anInt1835 >= 0) && (anInt1835 < aClass131_Sub20_Sub1_1829.anIntArray1353.length));

				aClass131_Sub20_Sub1_1829 = null;
			}

			anInt1836 = client.anInt2038 - var6;
		}

		Class131_Sub20_Sub9 var4 = Class83.method362(anInt1838);
		if (var4.anIntArray1513 != null)
			var4 = var4.method754();

		if (null == var4)
			return null;
		else {
			int var2;
			int var5;
			if ((anInt1830 != 1) && (anInt1830 != 3)) {
				var5 = var4.anInt1511;
				var2 = var4.anInt1503;
			} else {
				var5 = var4.anInt1503;
				var2 = var4.anInt1511;
			}

			final int var13 = (var5 >> 1) + anInt1840;
			final int var11 = ((var5 + 1) >> 1) + anInt1840;
			final int var12 = anInt1833 + (var2 >> 1);
			final int var3 = ((1 + var2) >> 1) + anInt1833;
			final int[][] var7 = Class26.anIntArrayArrayArray239[anInt1831];
			final int var9 = (var7[var11][var3] + var7[var13][var12] + var7[var11][var12] + var7[var13][var3]) >> 2;
			final int var8 = (var5 << 6) + (anInt1840 << 7);
			final int var10 = (var2 << 6) + (anInt1833 << 7);
			return var4.method753(anInt1834, anInt1830, var7, var8, var9, var10, aClass131_Sub20_Sub1_1829, anInt1835);
		}
	}

	static void method986() {
		if (client.aBool2178) {
			final Class131_Sub18 var0 = Class131_Sub20_Sub20.method880(Class44.anInt441, client.anInt2179);
			if ((var0 != null) && (null != var0.anObjectArray1249)) {
				final Class131_Sub10 var1 = new Class131_Sub10();
				var1.aClass131_Sub18_1057 = var0;
				var1.anObjectArray1056 = var0.anObjectArray1249;
				NpcFlags.method24(var1, 200000);
			}

			client.aBool2178 = false;
			Class131_Sub20_Sub6.method734(var0);
		}
	}

	public static void method987(final Class100 var0) {
		Class131_Sub20_Sub4.aClass100_1440 = var0;
	}
}
