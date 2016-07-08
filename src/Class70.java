public final class Class70 {
	protected static int anInt609;
	int anInt604;
	int anInt608;
	int anInt606;
	int anInt607;
	int[] anIntArray610 = new int[256];
	int[] anIntArray605 = new int[256];

	final int method325() {
		if ((--anInt604 + 1) == 0) {
			method328();
			anInt604 = 255;
		}

		return anIntArray605[anInt604];
	}

	static void method326(final int var0, final byte[] var1, final Class75 var2) {
		final Class131_Sub17 var3 = new Class131_Sub17();
		var3.anInt1143 = 0;
		var3.aLong902 = var0;
		var3.aByteArray1142 = var1;
		var3.aClass75_1144 = var2;
		final Class115 var4 = Class105.aClass115_807;
		synchronized (var4) {
			Class105.aClass115_807.method471(var3);
		}

		final Object var9 = Class105.anObject806;
		synchronized (var9) {
			if (Class105.anInt804 == 0)
				Class36.aClass78_371.method348(new Class105(), 5);

			Class105.anInt804 = 600;
		}
	}

	final void method327() {
		int var1 = -1640531527;
		int var5 = -1640531527;
		int var9 = -1640531527;
		int var8 = -1640531527;
		int var3 = -1640531527;
		int var2 = -1640531527;
		int var4 = -1640531527;
		int var6 = -1640531527;

		int var7;
		for (var7 = 0; var7 < 4; ++var7) {
			var6 ^= var4 << 11;
			var3 += var6;
			var4 += var2;
			var4 ^= var2 >>> 2;
			var8 += var4;
			var2 += var3;
			var2 ^= var3 << 8;
			var9 += var2;
			var3 += var8;
			var3 ^= var8 >>> 16;
			var5 += var3;
			var8 += var9;
			var8 ^= var9 << 10;
			var1 += var8;
			var9 += var5;
			var9 ^= var5 >>> 4;
			var6 += var9;
			var5 += var1;
			var5 ^= var1 << 8;
			var4 += var5;
			var1 += var6;
			var1 ^= var6 >>> 9;
			var2 += var1;
			var6 += var4;
		}

		for (var7 = 0; var7 < 256; var7 += 8) {
			var6 += anIntArray605[var7];
			var4 += anIntArray605[var7 + 1];
			var2 += anIntArray605[2 + var7];
			var3 += anIntArray605[var7 + 3];
			var8 += anIntArray605[var7 + 4];
			var9 += anIntArray605[var7 + 5];
			var5 += anIntArray605[var7 + 6];
			var1 += anIntArray605[7 + var7];
			var6 ^= var4 << 11;
			var3 += var6;
			var4 += var2;
			var4 ^= var2 >>> 2;
			var8 += var4;
			var2 += var3;
			var2 ^= var3 << 8;
			var9 += var2;
			var3 += var8;
			var3 ^= var8 >>> 16;
			var5 += var3;
			var8 += var9;
			var8 ^= var9 << 10;
			var1 += var8;
			var9 += var5;
			var9 ^= var5 >>> 4;
			var6 += var9;
			var5 += var1;
			var5 ^= var1 << 8;
			var4 += var5;
			var1 += var6;
			var1 ^= var6 >>> 9;
			var2 += var1;
			var6 += var4;
			anIntArray610[var7] = var6;
			anIntArray610[var7 + 1] = var4;
			anIntArray610[2 + var7] = var2;
			anIntArray610[3 + var7] = var3;
			anIntArray610[var7 + 4] = var8;
			anIntArray610[5 + var7] = var9;
			anIntArray610[6 + var7] = var5;
			anIntArray610[var7 + 7] = var1;
		}

		for (var7 = 0; var7 < 256; var7 += 8) {
			var6 += anIntArray610[var7];
			var4 += anIntArray610[1 + var7];
			var2 += anIntArray610[2 + var7];
			var3 += anIntArray610[3 + var7];
			var8 += anIntArray610[var7 + 4];
			var9 += anIntArray610[var7 + 5];
			var5 += anIntArray610[var7 + 6];
			var1 += anIntArray610[var7 + 7];
			var6 ^= var4 << 11;
			var3 += var6;
			var4 += var2;
			var4 ^= var2 >>> 2;
			var8 += var4;
			var2 += var3;
			var2 ^= var3 << 8;
			var9 += var2;
			var3 += var8;
			var3 ^= var8 >>> 16;
			var5 += var3;
			var8 += var9;
			var8 ^= var9 << 10;
			var1 += var8;
			var9 += var5;
			var9 ^= var5 >>> 4;
			var6 += var9;
			var5 += var1;
			var5 ^= var1 << 8;
			var4 += var5;
			var1 += var6;
			var1 ^= var6 >>> 9;
			var2 += var1;
			var6 += var4;
			anIntArray610[var7] = var6;
			anIntArray610[var7 + 1] = var4;
			anIntArray610[2 + var7] = var2;
			anIntArray610[3 + var7] = var3;
			anIntArray610[4 + var7] = var8;
			anIntArray610[var7 + 5] = var9;
			anIntArray610[6 + var7] = var5;
			anIntArray610[var7 + 7] = var1;
		}

		method328();
		anInt604 = 256;
	}

	final void method328() {
		anInt606 += ++anInt608;

		for (int var1 = 0; var1 < 256; ++var1) {
			final int var2 = anIntArray610[var1];
			if ((var1 & 2) == 0) {
				if ((var1 & 1) == 0)
					anInt607 ^= anInt607 << 13;
				else
					anInt607 ^= anInt607 >>> 6;
			} else if ((var1 & 1) == 0)
				anInt607 ^= anInt607 << 2;
			else
				anInt607 ^= anInt607 >>> 16;

			anInt607 += anIntArray610[(128 + var1) & 255];
			int var3;
			anIntArray610[var1] = var3 = anIntArray610[(var2 & 1020) >> 2] + anInt607 + anInt606;
			anIntArray605[var1] = anInt606 = anIntArray610[((var3 >> 8) & 1020) >> 2] + var2;
		}

	}

	Class70(final int[] var1) {
		for (int var2 = 0; var2 < var1.length; ++var2)
			anIntArray605[var2] = var1[var2];

		method327();
	}
}
