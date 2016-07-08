public class Class131_Sub20_Sub15 extends Class131_Sub20 {
	static Class131_Sub20_Sub17_Sub2 aClass131_Sub20_Sub17_Sub2_1603;
	static int anInt1604;
	public static int[] anIntArray1605;
	public int anInt1602 = 0;
	public static Class121 aClass121_1601 = new Class121(64);

	void method789(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.method595();
			if (var2 == 0)
				return;

			method790(var1, var2);
		}
	}

	void method790(final DataBuffer var1, final int var2) {
		if (var2 == 5)
			anInt1602 = var1.readUShort();

	}

	public static Class131_Sub20_Sub17_Sub4_Sub1 method791(final Class100 var0, final Class100 var1, final String var2,
			final String var3) {
		final int var4 = var0.method413(var2);
		final int var5 = var0.method414(var4, var3);
		return Class68.method321(var0, var1, var4, var5);
	}

	static void method792(final int var0, final String var1, final String var2) {
		Class131_Sub14_Sub1.method877(var0, var1, var2, (String) null);
	}
}
