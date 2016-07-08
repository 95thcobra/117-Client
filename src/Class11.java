public class Class11 {
	int[] anIntArray105 = new int[2];
	int[][][] anIntArrayArrayArray101 = new int[2][2][4];
	int[][][] anIntArrayArrayArray107 = new int[2][2][4];
	int[] anIntArray103 = new int[2];
	static float aFloat100;
	static int anInt106;
	static float[][] aFloatArrayArray104 = new float[2][8];
	static int[][] anIntArrayArray102 = new int[2][8];

	float method46(final int var1, final int var2, final float var3) {
		float var4 = anIntArrayArrayArray107[var1][0][var2]
				+ (var3 * (anIntArrayArrayArray107[var1][1][var2] - anIntArrayArrayArray107[var1][0][var2]));
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	static float method47(final float var0) {
		final float var1 = 32.703197F * (float) Math.pow(2.0D, var0);
		return (var1 * 3.1415927F) / 11025.0F;
	}

	float method48(final int var1, final int var2, final float var3) {
		float var4 = anIntArrayArrayArray101[var1][0][var2]
				+ (var3 * (anIntArrayArrayArray101[var1][1][var2] - anIntArrayArrayArray101[var1][0][var2]));
		var4 *= 1.2207031E-4F;
		return method47(var4);
	}

	int method49(final int var1, final float var2) {
		float var4;
		if (var1 == 0) {
			var4 = anIntArray103[0] + ((anIntArray103[1] - anIntArray103[0]) * var2);
			var4 *= 0.0030517578F;
			aFloat100 = (float) Math.pow(0.1D, var4 / 20.0F);
			anInt106 = (int) (aFloat100 * 65536.0F);
		}

		if (anIntArray105[var1] == 0)
			return 0;
		else {
			var4 = method46(var1, 0, var2);
			aFloatArrayArray104[var1][0] = -2.0F * var4 * (float) Math.cos(method48(var1, 0, var2));
			aFloatArrayArray104[var1][1] = var4 * var4;

			int var3;
			for (var3 = 1; var3 < anIntArray105[var1]; ++var3) {
				var4 = method46(var1, var3, var2);
				final float var5 = -2.0F * var4 * (float) Math.cos(method48(var1, var3, var2));
				final float var6 = var4 * var4;
				aFloatArrayArray104[var1][(var3 * 2) + 1] = aFloatArrayArray104[var1][(var3 * 2) - 1] * var6;
				aFloatArrayArray104[var1][var3 * 2] = (aFloatArrayArray104[var1][(var3 * 2) - 1] * var5)
						+ (aFloatArrayArray104[var1][(var3 * 2) - 2] * var6);

				for (int var7 = (var3 * 2) - 1; var7 >= 2; --var7)
					aFloatArrayArray104[var1][var7] += (aFloatArrayArray104[var1][var7 - 1] * var5)
							+ (aFloatArrayArray104[var1][var7 - 2] * var6);

				aFloatArrayArray104[var1][1] += (aFloatArrayArray104[var1][0] * var5) + var6;
				aFloatArrayArray104[var1][0] += var5;
			}

			if (var1 == 0)
				for (var3 = 0; var3 < (anIntArray105[0] * 2); ++var3)
					aFloatArrayArray104[0][var3] *= aFloat100;

			for (var3 = 0; var3 < (anIntArray105[var1] * 2); ++var3)
				anIntArrayArray102[var1][var3] = (int) (aFloatArrayArray104[var1][var3] * 65536.0F);

			return anIntArray105[var1] * 2;
		}
	}

	final void method50(final DataBuffer var1, final Class10 var2) {
		final int var3 = var1.readUByte();
		anIntArray105[0] = var3 >> 4;
		anIntArray105[1] = var3 & 15;
		if (var3 != 0) {
			anIntArray103[0] = var1.readUShort();
			anIntArray103[1] = var1.readUShort();
			final int var7 = var1.readUByte();

			int var4;
			int var5;
			for (var5 = 0; var5 < 2; ++var5)
				for (var4 = 0; var4 < anIntArray105[var5]; ++var4) {
					anIntArrayArrayArray101[var5][0][var4] = var1.readUShort();
					anIntArrayArrayArray107[var5][0][var4] = var1.readUShort();
				}

			for (var5 = 0; var5 < 2; ++var5)
				for (var4 = 0; var4 < anIntArray105[var5]; ++var4)
					if ((var7 & (1 << (var5 * 4) << var4)) != 0) {
						anIntArrayArrayArray101[var5][1][var4] = var1.readUShort();
						anIntArrayArrayArray107[var5][1][var4] = var1.readUShort();
					} else {
						anIntArrayArrayArray101[var5][1][var4] = anIntArrayArrayArray101[var5][0][var4];
						anIntArrayArrayArray107[var5][1][var4] = anIntArrayArrayArray107[var5][0][var4];
					}

			if ((var7 != 0) || (anIntArray103[1] != anIntArray103[0]))
				var2.method45(var1);
		} else {
			final int[] var6 = anIntArray103;
			anIntArray103[1] = 0;
			var6[0] = 0;
		}

	}
}
