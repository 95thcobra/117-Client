public final class Class38 {
	public Class131_Sub20_Sub19 aClass131_Sub20_Sub19_395;
	int anInt396;
	int anInt397;
	int anInt398;
	int anInt399;
	int anInt400;
	int anInt401;
	public Class131_Sub20_Sub19 aClass131_Sub20_Sub19_402;
	int anInt404;
	public int anInt403 = 0;
	int anInt405 = 0;

	static boolean method210(final Class100 var0, final int var1, final int var2) {
		final byte[] var3 = var0.method402(var1, var2);
		if (null == var3)
			return false;
		else {
			Class84.method370(var3);
			return true;
		}
	}

	static final int method211(final int var0, final int var1) {
		int var2 = (57 * var1) + var0;
		var2 ^= var2 << 13;
		final int var3 = (1376312589 + (var2 * ((15731 * var2 * var2) + 789221))) & Integer.MAX_VALUE;
		return (var3 >> 19) & 255;
	}
}
