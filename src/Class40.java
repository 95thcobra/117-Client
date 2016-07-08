public class Class40 implements Runnable {
	public static char aChar413;
	static Class2 aClass2_418;
	int anInt415 = 0;
	boolean aBool419 = true;
	Object anObject414 = new Object();
	int[] anIntArray416 = new int[500];
	int[] anIntArray417 = new int[500];

	@Override
	public void run() {
		for (; aBool419; Class47.method237(50L)) {
			final Object var1 = anObject414;
			synchronized (var1) {
				if (anInt415 < 500) {
					anIntArray416[anInt415] = Class81.anInt668;
					anIntArray417[anInt415] = Class81.anInt673;
					++anInt415;
				}
			}
		}

	}

	static final void method216(final int var0) {
		if (Class77.method344(var0)) {
			final Class131_Sub18[] var3 = Class131_Sub18.aClass131_Sub18ArrayArray1174[var0];

			for (final Class131_Sub18 element : var3) {
				final Class131_Sub18 var2 = element;
				if (null != var2) {
					var2.anInt1279 = 0;
					var2.anInt1147 = 0;
				}
			}

		}
	}

	static final String method217(final int var0, final int var1) {
		final int var2 = var1 - var0;
		return var2 < -9 ? Class103.method427(16711680)
				: (var2 < -6 ? Class103.method427(16723968)
						: (var2 < -3 ? Class103.method427(16740352)
								: (var2 < 0 ? Class103.method427(16756736)
										: (var2 > 9 ? Class103.method427('\uff00')
												: (var2 > 6 ? Class103.method427(4259584)
														: (var2 > 3 ? Class103.method427(8453888)
																: (var2 > 0 ? Class103.method427(12648192)
																		: Class103.method427(16776960))))))));
	}

	static void method218(final int var0, final int var1, final int var2, final int var3) {
		final Class131_Sub18 var4 = Class131_Sub20_Sub20.method880(var0, var1);
		if ((null != var4) && (null != var4.anObjectArray1248)) {
			final Class131_Sub10 var5 = new Class131_Sub10();
			var5.aClass131_Sub18_1057 = var4;
			var5.anObjectArray1056 = var4.anObjectArray1248;
			NpcFlags.method24(var5, 200000);
		}

		client.anInt2206 = var3;
		client.aBool2178 = true;
		Class44.anInt441 = var0;
		client.anInt2179 = var1;
		Class45.anInt451 = var2;
		Class131_Sub20_Sub6.method734(var4);
	}
}
