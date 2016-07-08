public final class Class37 {
	boolean aBool383 = true;
	int anInt384;
	int anInt385;
	int anInt375;
	int anInt387;
	int[] anIntArray392;
	int[] anIntArray373;
	int[] anIntArray379;
	int[] anIntArray393;
	int[] anIntArray380;
	int[] anIntArray389;
	int[] anIntArray376;
	int[] anIntArray386;
	int[] anIntArray381;
	int[] anIntArray382;
	static int[] anIntArray388 = new int[6];
	static int[] anIntArray394 = new int[6];
	static int[] anIntArray390 = new int[6];
	static int[] anIntArray391 = new int[6];
	static int[] anIntArray374 = new int[6];
	static int[][] anIntArrayArray378 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 },
			{ 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 },
			{ 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };
	static int[][] anIntArrayArray377 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 },
			{ 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 },
			{ 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 },
			{ 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 },
			{ 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 },
			{ 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 },
			{ 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 },
			{ 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	Class37(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8, final int var9, final int var10, final int var11, final int var12,
			final int var13, final int var14, final int var15, final int var16, final int var17, final int var18,
			final int var19) {
		if ((var6 != var7) || (var6 != var8) || (var6 != var9))
			aBool383 = false;

		anInt384 = var1;
		anInt385 = var2;
		anInt375 = var18;
		anInt387 = var19;
		final short var20 = 128;
		final int var29 = var20 / 2;
		final int var30 = var20 / 4;
		final int var21 = (var20 * 3) / 4;
		final int[] var37 = anIntArrayArray378[var1];
		final int var34 = var37.length;
		anIntArray392 = new int[var34];
		anIntArray373 = new int[var34];
		anIntArray379 = new int[var34];
		final int[] var38 = new int[var34];
		final int[] var27 = new int[var34];
		final int var35 = var4 * var20;
		final int var22 = var5 * var20;

		int var23;
		int var24;
		int var25;
		int var26;
		int var32;
		int var33;
		for (int var36 = 0; var36 < var34; ++var36) {
			var26 = var37[var36];
			if (((var26 & 1) == 0) && (var26 <= 8))
				var26 = ((var26 - var2 - var2 - 1) & 7) + 1;

			if ((var26 > 8) && (var26 <= 12))
				var26 = ((var26 - 9 - var2) & 3) + 9;

			if ((var26 > 12) && (var26 <= 16))
				var26 = ((var26 - 13 - var2) & 3) + 13;

			if (var26 == 1) {
				var32 = var35;
				var23 = var22;
				var33 = var6;
				var24 = var10;
				var25 = var14;
			} else if (var26 == 2) {
				var32 = var35 + var29;
				var23 = var22;
				var33 = (var6 + var7) >> 1;
				var24 = (var10 + var11) >> 1;
				var25 = (var14 + var15) >> 1;
			} else if (var26 == 3) {
				var32 = var35 + var20;
				var23 = var22;
				var33 = var7;
				var24 = var11;
				var25 = var15;
			} else if (var26 == 4) {
				var32 = var35 + var20;
				var23 = var22 + var29;
				var33 = (var7 + var8) >> 1;
				var24 = (var11 + var12) >> 1;
				var25 = (var15 + var16) >> 1;
			} else if (var26 == 5) {
				var32 = var35 + var20;
				var23 = var22 + var20;
				var33 = var8;
				var24 = var12;
				var25 = var16;
			} else if (var26 == 6) {
				var32 = var35 + var29;
				var23 = var22 + var20;
				var33 = (var8 + var9) >> 1;
				var24 = (var12 + var13) >> 1;
				var25 = (var16 + var17) >> 1;
			} else if (var26 == 7) {
				var32 = var35;
				var23 = var22 + var20;
				var33 = var9;
				var24 = var13;
				var25 = var17;
			} else if (var26 == 8) {
				var32 = var35;
				var23 = var22 + var29;
				var33 = (var9 + var6) >> 1;
				var24 = (var13 + var10) >> 1;
				var25 = (var17 + var14) >> 1;
			} else if (var26 == 9) {
				var32 = var35 + var29;
				var23 = var22 + var30;
				var33 = (var6 + var7) >> 1;
				var24 = (var10 + var11) >> 1;
				var25 = (var14 + var15) >> 1;
			} else if (var26 == 10) {
				var32 = var35 + var21;
				var23 = var22 + var29;
				var33 = (var7 + var8) >> 1;
				var24 = (var11 + var12) >> 1;
				var25 = (var15 + var16) >> 1;
			} else if (var26 == 11) {
				var32 = var35 + var29;
				var23 = var22 + var21;
				var33 = (var8 + var9) >> 1;
				var24 = (var12 + var13) >> 1;
				var25 = (var16 + var17) >> 1;
			} else if (var26 == 12) {
				var32 = var35 + var30;
				var23 = var22 + var29;
				var33 = (var9 + var6) >> 1;
				var24 = (var13 + var10) >> 1;
				var25 = (var17 + var14) >> 1;
			} else if (var26 == 13) {
				var32 = var35 + var30;
				var23 = var22 + var30;
				var33 = var6;
				var24 = var10;
				var25 = var14;
			} else if (var26 == 14) {
				var32 = var35 + var21;
				var23 = var22 + var30;
				var33 = var7;
				var24 = var11;
				var25 = var15;
			} else if (var26 == 15) {
				var32 = var35 + var21;
				var23 = var22 + var21;
				var33 = var8;
				var24 = var12;
				var25 = var16;
			} else {
				var32 = var35 + var30;
				var23 = var22 + var21;
				var33 = var9;
				var24 = var13;
				var25 = var17;
			}

			anIntArray392[var36] = var32;
			anIntArray373[var36] = var33;
			anIntArray379[var36] = var23;
			var38[var36] = var24;
			var27[var36] = var25;
		}

		final int[] var31 = anIntArrayArray377[var1];
		var26 = var31.length / 4;
		anIntArray393 = new int[var26];
		anIntArray380 = new int[var26];
		anIntArray389 = new int[var26];
		anIntArray376 = new int[var26];
		anIntArray386 = new int[var26];
		anIntArray381 = new int[var26];
		if (var3 != -1)
			anIntArray382 = new int[var26];

		var32 = 0;

		for (var23 = 0; var23 < var26; ++var23) {
			var33 = var31[var32];
			var24 = var31[var32 + 1];
			var25 = var31[var32 + 2];
			int var28 = var31[var32 + 3];
			var32 += 4;
			if (var24 < 4)
				var24 = (var24 - var2) & 3;

			if (var25 < 4)
				var25 = (var25 - var2) & 3;

			if (var28 < 4)
				var28 = (var28 - var2) & 3;

			anIntArray393[var23] = var24;
			anIntArray380[var23] = var25;
			anIntArray389[var23] = var28;
			if (var33 == 0) {
				anIntArray376[var23] = var38[var24];
				anIntArray386[var23] = var38[var25];
				anIntArray381[var23] = var38[var28];
				if (anIntArray382 != null)
					anIntArray382[var23] = -1;
			} else {
				anIntArray376[var23] = var27[var24];
				anIntArray386[var23] = var27[var25];
				anIntArray381[var23] = var27[var28];
				if (anIntArray382 != null)
					anIntArray382[var23] = var3;
			}
		}

		var23 = var6;
		var33 = var7;
		if (var7 < var6)
			var23 = var7;

		if (var7 > var7)
			var33 = var7;

		if (var8 < var23)
			var23 = var8;

		if (var8 > var33)
			var33 = var8;

		if (var9 < var23)
			var23 = var9;

		if (var9 > var33)
			var33 = var9;

		var23 /= 14;
		var33 /= 14;
	}
}
