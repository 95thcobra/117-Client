public class Class15 {
	int anInt143 = Class131_Sub1.method532(16);
	int anInt148 = Class131_Sub1.method532(24);
	int anInt145 = Class131_Sub1.method532(24);
	int anInt146 = Class131_Sub1.method532(24) + 1;
	int anInt147 = Class131_Sub1.method532(6) + 1;
	int anInt144 = Class131_Sub1.method532(8);
	int[] anIntArray149;

	void method58(final float[] var1, final int var2, final boolean var3) {
		int var4;
		for (var4 = 0; var4 < var2; ++var4)
			var1[var4] = 0.0F;

		if (!var3) {
			var4 = Class131_Sub1.aClass19Array983[anInt144].anInt177;
			final int var9 = anInt145 - anInt148;
			final int var6 = var9 / anInt146;
			final int[] var7 = new int[var6];

			for (int var8 = 0; var8 < 8; ++var8) {
				int var10 = 0;

				while (var10 < var6) {
					int var5;
					int var12;
					if (var8 == 0) {
						var5 = Class131_Sub1.aClass19Array983[anInt144].method89();

						for (var12 = var4 - 1; var12 >= 0; --var12) {
							if ((var10 + var12) < var6)
								var7[var10 + var12] = var5 % anInt147;

							var5 /= anInt147;
						}
					}

					for (var5 = 0; var5 < var4; ++var5) {
						var12 = var7[var10];
						final int var18 = anIntArray149[(var12 * 8) + var8];
						if (var18 >= 0) {
							final int var13 = anInt148 + (var10 * anInt146);
							final Class19 var19 = Class131_Sub1.aClass19Array983[var18];
							int var16;
							if (anInt143 == 0) {
								var16 = anInt146 / var19.anInt177;

								for (int var14 = 0; var14 < var16; ++var14) {
									final float[] var17 = var19.method91();

									for (int var15 = 0; var15 < var19.anInt177; ++var15)
										var1[var13 + var14 + (var15 * var16)] += var17[var15];
								}
							} else {
								var16 = 0;

								while (var16 < anInt146) {
									final float[] var20 = var19.method91();

									for (int var11 = 0; var11 < var19.anInt177; ++var11) {
										var1[var13 + var16] += var20[var11];
										++var16;
									}
								}
							}
						}

						++var10;
						if (var10 >= var6)
							break;
					}
				}
			}

		}
	}

	Class15() {
		final int[] var2 = new int[anInt147];

		int var1;
		for (var1 = 0; var1 < anInt147; ++var1) {
			int var3 = 0;
			final int var4 = Class131_Sub1.method532(3);
			final boolean var5 = Class131_Sub1.method527() != 0;
			if (var5)
				var3 = Class131_Sub1.method532(5);

			var2[var1] = (var3 << 3) | var4;
		}

		anIntArray149 = new int[anInt147 * 8];

		for (var1 = 0; var1 < (anInt147 * 8); ++var1)
			anIntArray149[var1] = (var2[var1 >> 3] & (1 << (var1 & 7))) != 0 ? Class131_Sub1.method532(8) : -1;

	}
}
