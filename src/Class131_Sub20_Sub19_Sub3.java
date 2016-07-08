public final class Class131_Sub20_Sub19_Sub3 extends Class131_Sub20_Sub19 {
	int anInt1763;
	int anInt1764;
	static Class131_Sub20_Sub17_Sub2[] aClass131_Sub20_Sub17_Sub2Array1765;
	public static int[] anIntArray1766;

	@Override
	protected final Class131_Sub20_Sub19_Sub7 method868(final short var1) {
		return Class79_Sub1.method645(anInt1764, (short) 23053).method700(anInt1763);
	}

	public static void method927(final int var0, int var1) {
		final Class131_Sub20_Sub3 var2 = Class7.method34(var0);
		final int var3 = var2.anInt1429;
		final int var4 = var2.anInt1426;
		final int var5 = var2.anInt1427;
		int var6 = Class96.anIntArray765[var5 - var4];
		if ((var1 < 0) || (var1 > var6))
			var1 = 0;

		var6 <<= var4;
		Class96.anIntArray766[var3] = (Class96.anIntArray766[var3] & ~var6) | ((var1 << var4) & var6);
	}

	public static Class131_Sub20_Sub13 method928(final int var0) {
		Class131_Sub20_Sub13 var1 = (Class131_Sub20_Sub13) Class131_Sub20_Sub13.aClass121_1574.method482(var0);
		if (null != var1)
			return var1;
		else {
			final byte[] var2 = Class131_Sub20_Sub13.aClass100_1578.method402(3, var0);
			var1 = new Class131_Sub20_Sub13();
			if (null != var2)
				var1.method776(new DataBuffer(var2));

			Class131_Sub20_Sub13.aClass121_1574.method479(var1, var0);
			return var1;
		}
	}

	static Class63 method929(final int var0, final int var1) {
		client.aClass63_Sub1_2302.anInt587 = var0;
		client.aClass63_Sub1_2302.anInt583 = var1;
		client.aClass63_Sub1_2302.anInt586 = 1;
		client.aClass63_Sub1_2302.anInt584 = 1;
		return client.aClass63_Sub1_2302;
	}
}
