public class Class79_Sub1 extends Class79 {
	int anInt1115 = 256;
	int anInt1114 = 1;
	long aLong1117 = Class84.method366(780546663);
	int anInt1116;
	int anInt1118 = 0;
	long[] aLongArray1119 = new long[10];

	public static Class131_Sub20_Sub2 method645(final int var0, final short var1) {
		Class131_Sub20_Sub2 var2 = (Class131_Sub20_Sub2) Class131_Sub20_Sub2.aClass121_1375.method482(var0);
		if (null != var2)
			return var2;
		else {
			final byte[] var3 = Class131_Sub20_Sub2.aClass100_1374.method402(10, var0);
			var2 = new Class131_Sub20_Sub2();
			var2.anInt1423 = var0;
			if (null != var3)
				var2.method691(new DataBuffer(var3));

			var2.method690();
			if (var2.anInt1410 != -1)
				var2.method693(method645(var2.anInt1410, (short) 15757), method645(var2.anInt1409, (short) 26763));

			if (var2.anInt1419 != -1)
				var2.method703(method645(var2.anInt1419, (short) 12394), method645(var2.anInt1418, (short) 29661));

			if (var2.anInt1421 != -1)
				var2.method694(method645(var2.anInt1421, (short) 13488), method645(var2.anInt1420, (short) 28933));

			if (!Class71.aBool611 && var2.aBool1403) {
				var2.aString1385 = "Members object";
				var2.aBool1417 = false;
				var2.aStringArray1393 = null;
				var2.aStringArray1406 = null;
				var2.anInt1416 = 0;
			}

			Class131_Sub20_Sub2.aClass121_1375.method479(var2, var0);
			return var2;
		}
	}

	@Override
	void method354(final int var1) {
		for (int var2 = 0; var2 < 10; ++var2)
			aLongArray1119[var2] = 0L;

	}

	@Override
	int method355(final int var1, final int var2, final int var3) {
		final int var4 = anInt1115;
		final int var6 = anInt1114;
		anInt1115 = 300;
		anInt1114 = 1;
		aLong1117 = Class84.method366(780546663);
		if (0L == aLongArray1119[anInt1116]) {
			anInt1115 = var4;
			anInt1114 = var6;
		} else if (aLong1117 > aLongArray1119[anInt1116])
			anInt1115 = (int) (var1 * 2560 / (aLong1117 - aLongArray1119[anInt1116]));

		if (anInt1115 < 25)
			anInt1115 = 25;

		if (anInt1115 > 256) {
			anInt1115 = 256;
			anInt1114 = (int) (var1 - ((aLong1117 - aLongArray1119[anInt1116]) / 10L));
		}

		if (anInt1114 > var1)
			anInt1114 = var1;

		aLongArray1119[anInt1116] = aLong1117;
		anInt1116 = (anInt1116 + 1) % 10;
		int var5;
		if (anInt1114 > 1)
			for (var5 = 0; var5 < 10; ++var5)
				if (0L != aLongArray1119[var5])
					aLongArray1119[var5] += anInt1114;

		if (anInt1114 < var2)
			anInt1114 = var2;

		Class47.method237(anInt1114);

		for (var5 = 0; anInt1118 < 256; anInt1118 += anInt1115)
			++var5;

		anInt1118 &= 255;
		return var5;
	}

	public static void method646() {
		Class131_Sub20_Sub3.aClass121_1428.method481();
	}

	Class79_Sub1() {
		for (int var1 = 0; var1 < 10; ++var1)
			aLongArray1119[var1] = aLong1117;

	}
}
