public class Class19 {
	int anInt177;
	int anInt180;
	int[] anIntArray178;
	int[] anIntArray179;
	float[][] aFloatArrayArray176;
	int[] anIntArray181;

	int method89() {
		int var1;
		for (var1 = 0; anIntArray181[var1] >= 0; var1 = Class131_Sub1.method527() != 0 ? anIntArray181[var1] : var1 + 1)
			;

		return ~anIntArray181[var1];
	}

	Class19() {
		Class131_Sub1.method532(24);
		anInt177 = Class131_Sub1.method532(16);
		anInt180 = Class131_Sub1.method532(24);
		anIntArray178 = new int[anInt180];
		final boolean var6 = Class131_Sub1.method527() != 0;
		int var3;
		int var7;
		int var8;
		if (var6) {
			var7 = 0;

			for (var8 = Class131_Sub1.method532(5) + 1; var7 < anInt180; ++var8) {
				final int var10 = Class131_Sub1.method532(Class131_Sub11.method576(anInt180 - var7));

				for (var3 = 0; var3 < var10; ++var3)
					anIntArray178[var7++] = var8;
			}
		} else {
			final boolean var14 = Class131_Sub1.method527() != 0;

			for (var8 = 0; var8 < anInt180; ++var8)
				if (var14 && (Class131_Sub1.method527() == 0))
					anIntArray178[var8] = 0;
				else
					anIntArray178[var8] = Class131_Sub1.method532(5) + 1;
		}

		method90();
		var7 = Class131_Sub1.method532(4);
		if (var7 > 0) {
			final float var15 = Class131_Sub1.method533(Class131_Sub1.method532(32));
			final float var16 = Class131_Sub1.method533(Class131_Sub1.method532(32));
			var3 = Class131_Sub1.method532(4) + 1;
			final boolean var5 = Class131_Sub1.method527() != 0;
			int var13;
			if (var7 == 1)
				var13 = method92(anInt180, anInt177);
			else
				var13 = anInt180 * anInt177;

			anIntArray179 = new int[var13];

			int var2;
			for (var2 = 0; var2 < var13; ++var2)
				anIntArray179[var2] = Class131_Sub1.method532(var3);

			aFloatArrayArray176 = new float[anInt180][anInt177];
			int var1;
			float var4;
			int var9;
			if (var7 == 1)
				for (var2 = 0; var2 < anInt180; ++var2) {
					var4 = 0.0F;
					var9 = 1;

					for (var1 = 0; var1 < anInt177; ++var1) {
						final int var11 = (var2 / var9) % var13;
						final float var12 = (anIntArray179[var11] * var16) + var15 + var4;
						aFloatArrayArray176[var2][var1] = var12;
						if (var5)
							var4 = var12;

						var9 *= var13;
					}
				}
			else
				for (var2 = 0; var2 < anInt180; ++var2) {
					var4 = 0.0F;
					var9 = var2 * anInt177;

					for (var1 = 0; var1 < anInt177; ++var1) {
						final float var17 = (anIntArray179[var9] * var16) + var15 + var4;
						aFloatArrayArray176[var2][var1] = var17;
						if (var5)
							var4 = var17;

						++var9;
					}
				}
		}

	}

	void method90() {
		final int[] var1 = new int[anInt180];
		final int[] var2 = new int[33];

		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var10;
		for (var5 = 0; var5 < anInt180; ++var5) {
			var6 = anIntArray178[var5];
			if (var6 != 0) {
				var7 = 1 << (32 - var6);
				var8 = var2[var6];
				var1[var5] = var8;
				int var9;
				if ((var8 & var7) != 0)
					var4 = var2[var6 - 1];
				else {
					var4 = var8 | var7;

					for (var3 = var6 - 1; var3 >= 1; --var3) {
						var9 = var2[var3];
						if (var9 != var8)
							break;

						var10 = 1 << (32 - var3);
						if ((var9 & var10) != 0) {
							var2[var3] = var2[var3 - 1];
							break;
						}

						var2[var3] = var9 | var10;
					}
				}

				var2[var6] = var4;

				for (var3 = var6 + 1; var3 <= 32; ++var3) {
					var9 = var2[var3];
					if (var9 == var8)
						var2[var3] = var4;
				}
			}
		}

		anIntArray181 = new int[8];
		int var11 = 0;

		for (var5 = 0; var5 < anInt180; ++var5) {
			var6 = anIntArray178[var5];
			if (var6 != 0) {
				var7 = var1[var5];
				var8 = 0;

				for (var4 = 0; var4 < var6; ++var4) {
					var3 = Integer.MIN_VALUE >>> var4;
					if ((var7 & var3) != 0) {
						if (anIntArray181[var8] == 0)
							anIntArray181[var8] = var11;

						var8 = anIntArray181[var8];
					} else
						++var8;

					if (var8 >= anIntArray181.length) {
						final int[] var12 = new int[anIntArray181.length * 2];

						for (var10 = 0; var10 < anIntArray181.length; ++var10)
							var12[var10] = anIntArray181[var10];

						anIntArray181 = var12;
					}

					var3 >>>= 1;
				}

				anIntArray181[var8] = ~var5;
				if (var8 >= var11)
					var11 = var8 + 1;
			}
		}

	}

	float[] method91() {
		return aFloatArrayArray176[method89()];
	}

	static int method92(final int var0, final int var1) {
		int var2 = (int) Math.pow(var0, 1.0D / var1) + 1;

		while (true) {
			int var5 = var2;
			int var3 = var1;

			int var4;
			for (var4 = 1; var3 > 1; var3 >>= 1) {
				if ((var3 & 1) != 0)
					var4 *= var5;

				var5 *= var5;
			}

			int var6;
			if (var3 == 1)
				var6 = var4 * var5;
			else
				var6 = var4;

			if (var6 <= var0)
				return var2;

			--var2;
		}
	}
}
