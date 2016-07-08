public class Class39 {
	int[] anIntArray407;
	String[] aStringArray408;
	static Class131_Sub20_Sub17_Sub2[] aClass131_Sub20_Sub17_Sub2Array409;
	static int anInt410;
	Class131_Sub20_Sub18 aClass131_Sub20_Sub18_411;
	static int anInt412;
	int anInt406 = -1;

	public static Class27[] method212() {
		return new Class27[] { Class27.aClass27_247, Class27.aClass27_244, Class27.aClass27_246, Class27.aClass27_250,
				Class27.aClass27_249 };
	}

	static final void method213(final Class2 var0, final int var1, final int var2) {
		Class131_Sub20_Sub19_Sub2_Sub1.method1063(var0.anInt10, var0.anInt4, var0.anInt5, var0.anInt3, var0.aString6,
				var0.aString6, var1, var2);
	}

	public static Interface4 method214(final Interface4[] var0, final int var1) {
		final Interface4[] var2 = var0;

		for (final Interface4 var4 : var2) {
			if (var1 == var4.method11((byte) 69))
				return var4;
		}

		return null;
	}

	static final void method215() {
		final int var0 = Class131_Sub20_Sub19_Sub2.anInt1760;
		final int var6 = Class48.anInt476;
		final int var2 = Class131_Sub20_Sub6.anInt1488;
		final int var7 = Class5.anInt60;
		final int var8 = 6116423;
		Class131_Sub20_Sub17.method850(var0, var6, var2, var7, var8);
		Class131_Sub20_Sub17.method850(1 + var0, 1 + var6, var2 - 2, 16, 0);
		Class131_Sub20_Sub17.method854(var0 + 1, var6 + 18, var2 - 2, var7 - 19, 0);
		GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15.method1053("Choose Option", var0 + 3, 14 + var6, var8, -1);
		final int var10 = Class81.anInt668;
		final int var9 = Class81.anInt673;

		int var4;
		int var5;
		int var11;
		for (var5 = 0; var5 < client.anInt2166; ++var5) {
			var4 = (15 * (client.anInt2166 - 1 - var5)) + 31 + var6;
			var11 = 16777215;
			if ((var10 > var0) && (var10 < (var2 + var0)) && (var9 > (var4 - 13)) && (var9 < (var4 + 3)))
				var11 = 16776960;

			final Class131_Sub20_Sub17_Sub4_Sub1 var3 = GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15;
			String var12;
			if (client.aStringArray2172[var5].length() > 0)
				var12 = client.aStringArray2195[var5] + " " + client.aStringArray2172[var5];
			else
				var12 = client.aStringArray2195[var5];

			var3.method1053(var12, var0 + 3, var4, var11, 0);
		}

		var5 = Class131_Sub20_Sub19_Sub2.anInt1760;
		var4 = Class48.anInt476;
		var11 = Class131_Sub20_Sub6.anInt1488;
		final int var13 = Class5.anInt60;

		for (int var1 = 0; var1 < client.anInt2226; ++var1)
			if (((client.anIntArray2233[var1] + client.anIntArray2231[var1]) > var5)
					&& (client.anIntArray2231[var1] < (var11 + var5))
					&& ((client.anIntArray2234[var1] + client.anIntArray2232[var1]) > var4)
					&& (client.anIntArray2232[var1] < (var13 + var4)))
				client.aBoolArray2229[var1] = true;

	}
}
