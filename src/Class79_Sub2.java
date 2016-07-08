public class Class79_Sub2 extends Class79 {
	long aLong1120 = System.nanoTime();

	@Override
	void method354(final int var1) {
		aLong1120 = System.nanoTime();
	}

	@Override
	int method355(final int var1, final int var2, final int var3) {
		final long var4 = var2 * 1000000L;
		long var7 = aLong1120 - System.nanoTime();
		if (var7 < var4)
			var7 = var4;

		Class47.method237(var7 / 1000000L);
		final long var9 = System.nanoTime();

		int var6;
		for (var6 = 0; (var6 < 10) && ((var6 < 1) || (aLong1120 < var9)); aLong1120 += 1000000L * var1)
			++var6;

		if (aLong1120 < var9)
			aLong1120 = var9;

		return var6;
	}
}
