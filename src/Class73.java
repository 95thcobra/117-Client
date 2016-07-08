public class Class73 implements Interface4 {
	public String aString623;
	int anInt626;
	public static Class73 aClass73_620 = new Class73("runescape", "RuneScape", 0);
	public static Class73 aClass73_625 = new Class73("stellardawn", "Stellar Dawn", 1);
	public static Class73 aClass73_621 = new Class73("game3", "Game 3", 2);
	public static Class73 aClass73_622 = new Class73("game4", "Game 4", 3);
	public static Class73 aClass73_624 = new Class73("game5", "Game 5", 4);
	public static Class73 aClass73_619 = new Class73("oldscape", "RuneScape 2007", 5);

	@Override
	public int method11(final byte var1) {
		return anInt626;
	}

	Class73(final String var1, final String var2, final int var3) {
		aString623 = var1;
		anInt626 = var3;
	}

	static final void method334(final String var0, final String var1, final int var2, final int var3, final int var4,
			final int var5) {
		if (!client.aBool2047)
			if (client.anInt2166 < 500) {
				client.aStringArray2195[client.anInt2166] = var0;
				client.aStringArray2172[client.anInt2166] = var1;
				client.anIntArray2066[client.anInt2166] = var2;
				client.anIntArray2170[client.anInt2166] = var3;
				client.anIntArray2171[client.anInt2166] = var4;
				client.anIntArray2168[client.anInt2166] = var5;
				++client.anInt2166;
			}
	}

	static final int method335(final int var0, final int var1, final int var2) {
		final int var3 = var0 / var2;
		final int var6 = var0 & (var2 - 1);
		final int var4 = var1 / var2;
		final int var7 = var1 & (var2 - 1);
		final int var5 = Class36.method205(var3, var4);
		final int var11 = Class36.method205(var3 + 1, var4);
		final int var8 = Class36.method205(var3, var4 + 1);
		final int var9 = Class36.method205(var3 + 1, var4 + 1);
		final int var13 = Class1.method19(var5, var11, var6, var2);
		final int var10 = Class1.method19(var8, var9, var6, var2);
		final int var12 = (65536 - Class131_Sub20_Sub17_Sub1.anIntArray1770[(var7 * 1024) / var2]) >> 1;
		final int var14 = ((var10 * var12) >> 16) + (((65536 - var12) * var13) >> 16);
		return var14;
	}
}
