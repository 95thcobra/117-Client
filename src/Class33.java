public class Class33 {
	int anInt312 = 0;
	static int anInt355;
	static int anInt356;
	static int anInt349;
	static int anInt357;
	static int anInt353;
	static int anInt325;
	static int anInt334;
	static int anInt338;
	static int anInt327;
	static int anInt320;
	int anInt319 = 0;
	public static boolean aBool328 = true;
	static int anInt313 = 0;
	static int anInt314 = 0;
	static Class47[] aClass47Array329 = new Class47[100];
	static boolean aBool326 = false;
	static int anInt307 = 0;
	static int anInt332 = 0;
	static int anInt333 = 0;
	public static int anInt302 = -1;
	public static int anInt335 = -1;
	static int anInt336 = 4;
	static int[] anIntArray337;
	static Class58[][] aClass58ArrayArray305;
	static int anInt339;
	static Class58[] aClass58Array340;
	static Class115 aClass115_341;
	static int[] anIntArray309;
	static int[] anIntArray352;
	static int[] anIntArray323;
	static int[] anIntArray345;
	static int[] anIntArray346;
	static int[] anIntArray343;
	static int[] anIntArray348;
	static boolean[][][][] aBoolArrayArrayArrayArray351;
	Class47[] aClass47Array310 = new Class47[5000];
	int[][] anIntArrayArray342 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 },
			{ 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
	int[][] anIntArrayArray344 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 },
			{ 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 },
			{ 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 },
			{ 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
	int anInt303;
	int anInt304;
	int anInt354;
	Class131_Sub12[][][] aClass131_Sub12ArrayArrayArray308;
	int[][][] anIntArrayArrayArray311;
	int[][][] anIntArrayArrayArray306;
	static int anInt315;
	static boolean[][] aBoolArrayArray347;
	static int anInt322;
	static int anInt331;
	static int anInt324;
	static int anInt350;
	static int anInt321;
	static int anInt316;
	static int anInt318;
	static int anInt317;
	static int anInt330;

	public void method146(final int var1) {
		anInt312 = var1;

		for (int var2 = 0; var2 < anInt304; ++var2)
			for (int var3 = 0; var3 < anInt354; ++var3)
				if (aClass131_Sub12ArrayArrayArray308[var1][var2][var3] == null)
					aClass131_Sub12ArrayArrayArray308[var1][var2][var3] = new Class131_Sub12(var1, var2, var3);

	}

	public void method147(final int var1, final int var2) {
		final Class131_Sub12 var3 = aClass131_Sub12ArrayArrayArray308[0][var1][var2];

		for (int var5 = 0; var5 < 3; ++var5) {
			final Class131_Sub12 var6 = aClass131_Sub12ArrayArrayArray308[var5][var1][var2] = aClass131_Sub12ArrayArrayArray308[var5
					+ 1][var1][var2];
			if (var6 != null) {
				--var6.anInt1077;

				for (int var4 = 0; var4 < var6.anInt1075; ++var4) {
					final Class47 var7 = var6.aClass47Array1086[var4];
					if ((((var7.anInt465 >> 29) & 3) == 2) && (var7.anInt459 == var1) && (var7.anInt454 == var2))
						--var7.anInt461;
				}
			}
		}

		if (aClass131_Sub12ArrayArrayArray308[0][var1][var2] == null)
			aClass131_Sub12ArrayArrayArray308[0][var1][var2] = new Class131_Sub12(0, var1, var2);

		aClass131_Sub12ArrayArrayArray308[0][var1][var2].aClass131_Sub12_1076 = var3;
		aClass131_Sub12ArrayArrayArray308[3][var1][var2] = null;
	}

	public void method148(final int var1, final int var2, final int var3) {
		final Class131_Sub12 var4 = aClass131_Sub12ArrayArrayArray308[var1][var2][var3];
		if (var4 != null)
			var4.aClass22_1085 = null;
	}

	public int method149(final int var1, final int var2, final int var3) {
		final Class131_Sub12 var4 = aClass131_Sub12ArrayArrayArray308[var1][var2][var3];
		return (var4 != null) && (var4.aClass22_1085 != null) ? var4.aClass22_1085.anInt204 : 0;
	}

	public void method150(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final int var8, final int var9, final int var10, final int var11,
			final int var12, final int var13, final int var14, final int var15, final int var16, final int var17,
			final int var18, final int var19, final int var20) {
		int var21;
		Class29 var22;
		if (var4 != 0) {
			if (var4 != 1) {
				final Class37 var23 = new Class37(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12,
						var13, var14, var15, var16, var17, var18, var19, var20);

				for (var21 = var1; var21 >= 0; --var21)
					if (aClass131_Sub12ArrayArrayArray308[var21][var2][var3] == null)
						aClass131_Sub12ArrayArrayArray308[var21][var2][var3] = new Class131_Sub12(var21, var2, var3);

				aClass131_Sub12ArrayArrayArray308[var1][var2][var3].aClass37_1080 = var23;
			} else {
				var22 = new Class29(var15, var16, var17, var18, var6, var20,
						(var7 == var8) && (var7 == var9) && (var7 == var10));

				for (var21 = var1; var21 >= 0; --var21)
					if (aClass131_Sub12ArrayArrayArray308[var21][var2][var3] == null)
						aClass131_Sub12ArrayArrayArray308[var21][var2][var3] = new Class131_Sub12(var21, var2, var3);

				aClass131_Sub12ArrayArrayArray308[var1][var2][var3].aClass29_1089 = var22;
			}
		} else {
			var22 = new Class29(var11, var12, var13, var14, -1, var19, false);

			for (var21 = var1; var21 >= 0; --var21)
				if (aClass131_Sub12ArrayArrayArray308[var21][var2][var3] == null)
					aClass131_Sub12ArrayArrayArray308[var21][var2][var3] = new Class131_Sub12(var21, var2, var3);

			aClass131_Sub12ArrayArrayArray308[var1][var2][var3].aClass29_1089 = var22;
		}
	}

	public void method151(final int var1, final int var2, final int var3, final int var4,
			final Class131_Sub20_Sub19 var5, final int var6, final int var7) {
		if (var5 != null) {
			final Class22 var8 = new Class22();
			var8.aClass131_Sub20_Sub19_205 = var5;
			var8.anInt201 = (var2 * 128) + 64;
			var8.anInt202 = (var3 * 128) + 64;
			var8.anInt206 = var4;
			var8.anInt204 = var6;
			var8.anInt203 = var7;
			if (aClass131_Sub12ArrayArrayArray308[var1][var2][var3] == null)
				aClass131_Sub12ArrayArrayArray308[var1][var2][var3] = new Class131_Sub12(var1, var2, var3);

			aClass131_Sub12ArrayArrayArray308[var1][var2][var3].aClass22_1085 = var8;
		}
	}

	public void method152(final int var1, final int var2, final int var3, final int var4,
			final Class131_Sub20_Sub19 var5, final int var6, final Class131_Sub20_Sub19 var7,
			final Class131_Sub20_Sub19 var8) {
		final Class31 var9 = new Class31();
		var9.aClass131_Sub20_Sub19_291 = var5;
		var9.anInt289 = (var2 * 128) + 64;
		var9.anInt294 = (var3 * 128) + 64;
		var9.anInt292 = var4;
		var9.anInt288 = var6;
		var9.aClass131_Sub20_Sub19_290 = var7;
		var9.aClass131_Sub20_Sub19_293 = var8;
		int var11 = 0;
		final Class131_Sub12 var12 = aClass131_Sub12ArrayArrayArray308[var1][var2][var3];
		if (var12 != null)
			for (int var13 = 0; var13 < var12.anInt1075; ++var13)
				if (((var12.aClass47Array1086[var13].anInt466 & 256) == 256)
						&& (var12.aClass47Array1086[var13].aClass131_Sub20_Sub19_457 instanceof Class131_Sub20_Sub19_Sub7)) {
					final Class131_Sub20_Sub19_Sub7 var10 = (Class131_Sub20_Sub19_Sub7) var12.aClass47Array1086[var13].aClass131_Sub20_Sub19_457;
					var10.method1015();
					if (var10.anInt1643 > var11)
						var11 = var10.anInt1643;
				}

		var9.anInt295 = var11;
		if (aClass131_Sub12ArrayArrayArray308[var1][var2][var3] == null)
			aClass131_Sub12ArrayArrayArray308[var1][var2][var3] = new Class131_Sub12(var1, var2, var3);

		aClass131_Sub12ArrayArrayArray308[var1][var2][var3].aClass31_1084 = var9;
	}

	public static void method153(final int[] var0, final int var1, final int var2, final int var3, final int var4) {
		anInt355 = 0;
		anInt356 = 0;
		anInt349 = var3;
		anInt357 = var4;
		anInt353 = var3 / 2;
		anInt325 = var4 / 2;
		final boolean[][][][] var8 = new boolean[9][32][53][53];

		int var5;
		int var7;
		int var9;
		int var10;
		int var11;
		int var12;
		for (var7 = 128; var7 <= 384; var7 += 32)
			for (var9 = 0; var9 < 2048; var9 += 64) {
				anInt334 = Class131_Sub20_Sub17_Sub1.anIntArray1787[var7];
				anInt338 = Class131_Sub20_Sub17_Sub1.anIntArray1770[var7];
				anInt327 = Class131_Sub20_Sub17_Sub1.anIntArray1787[var9];
				anInt320 = Class131_Sub20_Sub17_Sub1.anIntArray1770[var9];
				var10 = (var7 - 128) / 32;
				var11 = var9 / 64;

				for (int var13 = -26; var13 <= 26; ++var13)
					for (var5 = -26; var5 <= 26; ++var5) {
						var12 = var13 * 128;
						final int var6 = var5 * 128;
						boolean var14 = false;

						for (int var15 = -var1; var15 <= var2; var15 += 128)
							if (method172(var12, var0[var10] + var15, var6)) {
								var14 = true;
								break;
							}

						var8[var10][var11][var13 + 25 + 1][var5 + 25 + 1] = var14;
					}
			}

		for (var7 = 0; var7 < 8; ++var7)
			for (var9 = 0; var9 < 32; ++var9)
				for (var10 = -25; var10 < 25; ++var10)
					for (var11 = -25; var11 < 25; ++var11) {
						boolean var16 = false;

						label95: for (var5 = -1; var5 <= 1; ++var5)
							for (var12 = -1; var12 <= 1; ++var12) {
								if (var8[var7][var9][var10 + var5 + 25 + 1][var11 + var12 + 25 + 1]) {
									var16 = true;
									break label95;
								}

								if (var8[var7][(var9 + 1) % 31][var10 + var5 + 25 + 1][var11 + var12 + 25 + 1]) {
									var16 = true;
									break label95;
								}

								if (var8[var7 + 1][var9][var10 + var5 + 25 + 1][var11 + var12 + 25 + 1]) {
									var16 = true;
									break label95;
								}

								if (var8[var7 + 1][(var9 + 1) % 31][var10 + var5 + 25 + 1][var11 + var12 + 25 + 1]) {
									var16 = true;
									break label95;
								}
							}

						aBoolArrayArrayArrayArray351[var7][var9][var10 + 25][var11 + 25] = var16;
					}

	}

	public void method154(final int[] var1, int var2, final int var3, final int var4, final int var5, final int var6) {
		final Class131_Sub12 var7 = aClass131_Sub12ArrayArrayArray308[var4][var5][var6];
		if (var7 != null) {
			final Class29 var9 = var7.aClass29_1089;
			int var12;
			if (var9 != null) {
				final int var11 = var9.anInt269;
				if (var11 != 0)
					for (var12 = 0; var12 < 4; ++var12) {
						var1[var2] = var11;
						var1[var2 + 1] = var11;
						var1[var2 + 2] = var11;
						var1[var2 + 3] = var11;
						var2 += var3;
					}
			} else {
				final Class37 var14 = var7.aClass37_1080;
				if (var14 != null) {
					var12 = var14.anInt384;
					final int var18 = var14.anInt385;
					final int var15 = var14.anInt375;
					final int var10 = var14.anInt387;
					final int[] var13 = anIntArrayArray342[var12];
					final int[] var16 = anIntArrayArray344[var18];
					int var17 = 0;
					int var8;
					if (var15 != 0)
						for (var8 = 0; var8 < 4; ++var8) {
							var1[var2] = var13[var16[var17++]] == 0 ? var15 : var10;
							var1[var2 + 1] = var13[var16[var17++]] == 0 ? var15 : var10;
							var1[var2 + 2] = var13[var16[var17++]] == 0 ? var15 : var10;
							var1[var2 + 3] = var13[var16[var17++]] == 0 ? var15 : var10;
							var2 += var3;
						}
					else
						for (var8 = 0; var8 < 4; ++var8) {
							if (var13[var16[var17++]] != 0)
								var1[var2] = var10;

							if (var13[var16[var17++]] != 0)
								var1[var2 + 1] = var10;

							if (var13[var16[var17++]] != 0)
								var1[var2 + 2] = var10;

							if (var13[var16[var17++]] != 0)
								var1[var2 + 3] = var10;

							var2 += var3;
						}

				}
			}
		}
	}

	public boolean method155(final int var1, final int var2, final int var3, final int var4, final int var5,
			final Class131_Sub20_Sub19 var6, final int var7, final int var8, final boolean var9) {
		if (var6 == null)
			return true;
		else {
			int var11 = var2 - var5;
			int var12 = var3 - var5;
			int var10 = var2 + var5;
			int var13 = var3 + var5;
			if (var9) {
				if ((var7 > 640) && (var7 < 1408))
					var13 += 128;

				if ((var7 > 1152) && (var7 < 1920))
					var10 += 128;

				if ((var7 > 1664) || (var7 < 384))
					var12 -= 128;

				if ((var7 > 128) && (var7 < 896))
					var11 -= 128;
			}

			var11 /= 128;
			var12 /= 128;
			var10 /= 128;
			var13 /= 128;
			return method157(var1, var11, var12, (var10 - var11) + 1, (var13 - var12) + 1, var2, var3, var4, var6, var7,
					true, var8, 0);
		}
	}

	boolean method156(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6) {
		int var10;
		int var11;
		if ((var2 == var3) && (var4 == var5)) {
			if (!method177(var1, var2, var4))
				return false;
			else {
				var11 = var2 << 7;
				var10 = var4 << 7;
				return method180(var11 + 1, anIntArrayArrayArray306[var1][var2][var4] - var6, var10 + 1)
						&& method180((var11 + 128) - 1, anIntArrayArrayArray306[var1][var2 + 1][var4] - var6, var10 + 1)
						&& method180((var11 + 128) - 1, anIntArrayArrayArray306[var1][var2 + 1][var4 + 1] - var6,
								(var10 + 128) - 1)
						&& method180(var11 + 1, anIntArrayArrayArray306[var1][var2][var4 + 1] - var6,
								(var10 + 128) - 1);
			}
		} else {
			for (var11 = var2; var11 <= var3; ++var11)
				for (var10 = var4; var10 <= var5; ++var10)
					if (anIntArrayArrayArray311[var1][var11][var10] == -anInt315)
						return false;

			var11 = (var2 << 7) + 1;
			var10 = (var4 << 7) + 2;
			final int var8 = anIntArrayArrayArray306[var1][var2][var4] - var6;
			if (!method180(var11, var8, var10))
				return false;
			else {
				final int var7 = (var3 << 7) - 1;
				if (!method180(var7, var8, var10))
					return false;
				else {
					final int var9 = (var5 << 7) - 1;
					if (!method180(var11, var8, var9))
						return false;
					else if (!method180(var7, var8, var9))
						return false;
					else
						return true;
				}
			}
		}
	}

	boolean method157(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8, final Class131_Sub20_Sub19 var9, final int var10, final boolean var11,
			final int var12, final int var13) {
		int var17;
		for (int var14 = var2; var14 < (var2 + var4); ++var14)
			for (var17 = var3; var17 < (var3 + var5); ++var17) {
				if ((var14 < 0) || (var17 < 0) || (var14 >= anInt304) || (var17 >= anInt354))
					return false;

				final Class131_Sub12 var15 = aClass131_Sub12ArrayArrayArray308[var1][var14][var17];
				if ((var15 != null) && (var15.anInt1075 >= 5))
					return false;
			}

		final Class47 var20 = new Class47();
		var20.anInt465 = var12;
		var20.anInt466 = var13;
		var20.anInt461 = var1;
		var20.anInt464 = var6;
		var20.anInt456 = var7;
		var20.anInt455 = var8;
		var20.aClass131_Sub20_Sub19_457 = var9;
		var20.anInt458 = var10;
		var20.anInt459 = var2;
		var20.anInt454 = var3;
		var20.anInt460 = (var2 + var4) - 1;
		var20.anInt462 = (var3 + var5) - 1;

		for (var17 = var2; var17 < (var2 + var4); ++var17)
			for (int var18 = var3; var18 < (var3 + var5); ++var18) {
				int var19 = 0;
				if (var17 > var2)
					++var19;

				if (var17 < ((var2 + var4) - 1))
					var19 += 4;

				if (var18 > var3)
					var19 += 8;

				if (var18 < ((var3 + var5) - 1))
					var19 += 2;

				for (int var16 = var1; var16 >= 0; --var16)
					if (aClass131_Sub12ArrayArrayArray308[var16][var17][var18] == null)
						aClass131_Sub12ArrayArrayArray308[var16][var17][var18] = new Class131_Sub12(var16, var17,
								var18);

				final Class131_Sub12 var21 = aClass131_Sub12ArrayArrayArray308[var1][var17][var18];
				var21.aClass47Array1086[var21.anInt1075] = var20;
				var21.anIntArray1087[var21.anInt1075] = var19;
				var21.anInt1088 |= var19;
				++var21.anInt1075;
			}

		if (var11)
			aClass47Array310[anInt319++] = var20;

		return true;
	}

	public void method158() {
		for (int var1 = 0; var1 < anInt319; ++var1) {
			final Class47 var2 = aClass47Array310[var1];
			method181(var2);
			aClass47Array310[var1] = null;
		}

		anInt319 = 0;
	}

	public int method159(final int var1, final int var2, final int var3) {
		final Class131_Sub12 var4 = aClass131_Sub12ArrayArrayArray308[var1][var2][var3];
		return (var4 != null) && (var4.aClass38_1082 != null) ? var4.aClass38_1082.anInt403 : 0;
	}

	public void method160(final int var1, final int var2, final int var3) {
		final Class131_Sub12 var4 = aClass131_Sub12ArrayArrayArray308[var1][var2][var3];
		if (var4 != null)
			var4.aClass25_1081 = null;
	}

	public void method161(final int var1, final int var2, final int var3) {
		final Class131_Sub12 var4 = aClass131_Sub12ArrayArrayArray308[var1][var2][var3];
		if (var4 != null)
			var4.aClass38_1082 = null;
	}

	public void method162(final int var1, final int var2, final int var3) {
		final Class131_Sub12 var4 = aClass131_Sub12ArrayArrayArray308[var1][var2][var3];
		if (var4 != null)
			for (int var6 = 0; var6 < var4.anInt1075; ++var6) {
				final Class47 var5 = var4.aClass47Array1086[var6];
				if ((((var5.anInt465 >> 29) & 3) == 2) && (var5.anInt459 == var2) && (var5.anInt454 == var3)) {
					method181(var5);
					return;
				}
			}
	}

	public void method163(final int var1, final int var2, final int var3) {
		final Class131_Sub12 var4 = aClass131_Sub12ArrayArrayArray308[var1][var2][var3];
		if (var4 != null)
			var4.aClass31_1084 = null;
	}

	public Class25 method164(final int var1, final int var2, final int var3) {
		final Class131_Sub12 var4 = aClass131_Sub12ArrayArrayArray308[var1][var2][var3];
		return var4 != null ? var4.aClass25_1081 : null;
	}

	public Class47 method165(final int var1, final int var2, final int var3) {
		final Class131_Sub12 var4 = aClass131_Sub12ArrayArrayArray308[var1][var2][var3];
		if (var4 != null) {
			for (int var6 = 0; var6 < var4.anInt1075; ++var6) {
				final Class47 var5 = var4.aClass47Array1086[var6];
				if ((((var5.anInt465 >> 29) & 3) == 2) && (var5.anInt459 == var2) && (var5.anInt454 == var3))
					return var5;
			}

			return null;
		} else
			return null;
	}

	public Class22 method166(final int var1, final int var2, final int var3) {
		final Class131_Sub12 var4 = aClass131_Sub12ArrayArrayArray308[var1][var2][var3];
		return (var4 != null) && (var4.aClass22_1085 != null) ? var4.aClass22_1085 : null;
	}

	public int method167(final int var1, final int var2, final int var3) {
		final Class131_Sub12 var4 = aClass131_Sub12ArrayArrayArray308[var1][var2][var3];
		return (var4 != null) && (var4.aClass25_1081 != null) ? var4.aClass25_1081.anInt223 : 0;
	}

	public void method168(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt303; ++var4)
			for (int var6 = 0; var6 < anInt304; ++var6)
				for (int var5 = 0; var5 < anInt354; ++var5) {
					final Class131_Sub12 var8 = aClass131_Sub12ArrayArrayArray308[var4][var6][var5];
					if (var8 != null) {
						final Class25 var10 = var8.aClass25_1081;
						Class131_Sub20_Sub19_Sub6 var7;
						if ((var10 != null) && (var10.aClass131_Sub20_Sub19_218 instanceof Class131_Sub20_Sub19_Sub6)) {
							final Class131_Sub20_Sub19_Sub6 var11 = (Class131_Sub20_Sub19_Sub6) var10.aClass131_Sub20_Sub19_218;
							method193(var11, var4, var6, var5, 1, 1);
							if (var10.aClass131_Sub20_Sub19_220 instanceof Class131_Sub20_Sub19_Sub6) {
								var7 = (Class131_Sub20_Sub19_Sub6) var10.aClass131_Sub20_Sub19_220;
								method193(var7, var4, var6, var5, 1, 1);
								Class131_Sub20_Sub19_Sub6.method994(var11, var7, 0, 0, 0, false);
								var10.aClass131_Sub20_Sub19_220 = var7.method1001(var7.aShort1862, var7.aShort1841,
										var1, var2, var3);
							}

							var10.aClass131_Sub20_Sub19_218 = var11.method1001(var11.aShort1862, var11.aShort1841, var1,
									var2, var3);
						}

						for (int var12 = 0; var12 < var8.anInt1075; ++var12) {
							final Class47 var13 = var8.aClass47Array1086[var12];
							if ((var13 != null)
									&& (var13.aClass131_Sub20_Sub19_457 instanceof Class131_Sub20_Sub19_Sub6)) {
								final Class131_Sub20_Sub19_Sub6 var9 = (Class131_Sub20_Sub19_Sub6) var13.aClass131_Sub20_Sub19_457;
								method193(var9, var4, var6, var5, (var13.anInt460 - var13.anInt459) + 1,
										(var13.anInt462 - var13.anInt454) + 1);
								var13.aClass131_Sub20_Sub19_457 = var9.method1001(var9.aShort1862, var9.aShort1841,
										var1, var2, var3);
							}
						}

						final Class22 var14 = var8.aClass22_1085;
						if ((var14 != null) && (var14.aClass131_Sub20_Sub19_205 instanceof Class131_Sub20_Sub19_Sub6)) {
							var7 = (Class131_Sub20_Sub19_Sub6) var14.aClass131_Sub20_Sub19_205;
							method169(var7, var4, var6, var5);
							var14.aClass131_Sub20_Sub19_205 = var7.method1001(var7.aShort1862, var7.aShort1841, var1,
									var2, var3);
						}
					}
				}

	}

	void method169(final Class131_Sub20_Sub19_Sub6 var1, final int var2, final int var3, final int var4) {
		Class131_Sub12 var5;
		Class131_Sub20_Sub19_Sub6 var6;
		if (var3 < anInt304) {
			var5 = aClass131_Sub12ArrayArrayArray308[var2][var3 + 1][var4];
			if ((var5 != null) && (var5.aClass22_1085 != null)
					&& (var5.aClass22_1085.aClass131_Sub20_Sub19_205 instanceof Class131_Sub20_Sub19_Sub6)) {
				var6 = (Class131_Sub20_Sub19_Sub6) var5.aClass22_1085.aClass131_Sub20_Sub19_205;
				Class131_Sub20_Sub19_Sub6.method994(var1, var6, 128, 0, 0, true);
			}
		}

		if (var4 < anInt304) {
			var5 = aClass131_Sub12ArrayArrayArray308[var2][var3][var4 + 1];
			if ((var5 != null) && (var5.aClass22_1085 != null)
					&& (var5.aClass22_1085.aClass131_Sub20_Sub19_205 instanceof Class131_Sub20_Sub19_Sub6)) {
				var6 = (Class131_Sub20_Sub19_Sub6) var5.aClass22_1085.aClass131_Sub20_Sub19_205;
				Class131_Sub20_Sub19_Sub6.method994(var1, var6, 0, 0, 128, true);
			}
		}

		if ((var3 < anInt304) && (var4 < anInt354)) {
			var5 = aClass131_Sub12ArrayArrayArray308[var2][var3 + 1][var4 + 1];
			if ((var5 != null) && (var5.aClass22_1085 != null)
					&& (var5.aClass22_1085.aClass131_Sub20_Sub19_205 instanceof Class131_Sub20_Sub19_Sub6)) {
				var6 = (Class131_Sub20_Sub19_Sub6) var5.aClass22_1085.aClass131_Sub20_Sub19_205;
				Class131_Sub20_Sub19_Sub6.method994(var1, var6, 128, 0, 128, true);
			}
		}

		if ((var3 < anInt304) && (var4 > 0)) {
			var5 = aClass131_Sub12ArrayArrayArray308[var2][var3 + 1][var4 - 1];
			if ((var5 != null) && (var5.aClass22_1085 != null)
					&& (var5.aClass22_1085.aClass131_Sub20_Sub19_205 instanceof Class131_Sub20_Sub19_Sub6)) {
				var6 = (Class131_Sub20_Sub19_Sub6) var5.aClass22_1085.aClass131_Sub20_Sub19_205;
				Class131_Sub20_Sub19_Sub6.method994(var1, var6, 128, 0, -128, true);
			}
		}

	}

	public void method170(final int var1, final int var2, final int var3, final int var4) {
		final Class131_Sub12 var5 = aClass131_Sub12ArrayArrayArray308[var1][var2][var3];
		if (var5 != null) {
			final Class38 var6 = var5.aClass38_1082;
			if (var6 != null) {
				var6.anInt404 = (var6.anInt404 * var4) / 16;
				var6.anInt401 = (var6.anInt401 * var4) / 16;
			}
		}
	}

	boolean method171(final int var1, final int var2, final int var3, final int var4) {
		if (method177(var1, var2, var3)) {
			final int var5 = var2 << 7;
			final int var6 = var3 << 7;
			return method180(var5 + 1, anIntArrayArrayArray306[var1][var2][var3] - var4, var6 + 1)
					&& method180((var5 + 128) - 1, anIntArrayArrayArray306[var1][var2 + 1][var3] - var4, var6 + 1)
					&& method180((var5 + 128) - 1, anIntArrayArrayArray306[var1][var2 + 1][var3 + 1] - var4,
							(var6 + 128) - 1)
					&& method180(var5 + 1, anIntArrayArrayArray306[var1][var2][var3 + 1] - var4, (var6 + 128) - 1);
		} else
			return false;
	}

	static boolean method172(final int var0, final int var1, final int var2) {
		final int var3 = ((var2 * anInt327) + (var0 * anInt320)) >> 16;
		final int var4 = ((var2 * anInt320) - (var0 * anInt327)) >> 16;
		final int var5 = ((var1 * anInt334) + (var4 * anInt338)) >> 16;
		final int var6 = ((var1 * anInt338) - (var4 * anInt334)) >> 16;
		if ((var5 >= 50) && (var5 <= 3500)) {
			final int var8 = anInt353 + ((var3 * Class131_Sub20_Sub17_Sub1.anInt1774) / var5);
			final int var7 = anInt325 + ((var6 * Class131_Sub20_Sub17_Sub1.anInt1774) / var5);
			return (var8 >= anInt355) && (var8 <= anInt349) && (var7 >= anInt356) && (var7 <= anInt357);
		} else
			return false;
	}

	static {
		anIntArray337 = new int[anInt336];
		aClass58ArrayArray305 = new Class58[anInt336][500];
		anInt339 = 0;
		aClass58Array340 = new Class58[500];
		aClass115_341 = new Class115();
		anIntArray309 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
		anIntArray352 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
		anIntArray323 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
		anIntArray345 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
		anIntArray346 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
		anIntArray343 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
		anIntArray348 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
		aBoolArrayArrayArrayArray351 = new boolean[8][32][51][51];
	}

	void method173(final Class131_Sub12 var1, boolean var2) {
		aClass115_341.method471(var1);

		while (true) {
			Class131_Sub12 var3;
			int var4;
			int var5;
			int var6;
			int var7;
			Class131_Sub12[][] var8;
			Class131_Sub12 var9;
			int var11;
			int var16;
			int var17;
			int var18;
			int var24;
			int var25;
			do {
				do {
					do {
						do {
							do
								do
									while (true) {
										Class25 var10;
										Class47 var12;
										boolean var13;
										int var14;
										int var19;
										int var20;
										Class131_Sub12 var36;
										while (true) {
											do {
												var3 = (Class131_Sub12) aClass115_341.method466();
												if (var3 == null)
													return;
											} while (!var3.aBool1091);

											var4 = var3.anInt1098;
											var5 = var3.anInt1096;
											var6 = var3.anInt1077;
											var7 = var3.anInt1078;
											var8 = aClass131_Sub12ArrayArrayArray308[var6];
											if (!var3.aBool1090)
												break;

											if (var2) {
												if (var6 > 0) {
													var9 = aClass131_Sub12ArrayArrayArray308[var6 - 1][var4][var5];
													if ((var9 != null) && var9.aBool1091)
														continue;
												}

												if ((var4 <= anInt350) && (var4 > anInt316)) {
													var9 = var8[var4 - 1][var5];
													if ((var9 != null) && var9.aBool1091
															&& (var9.aBool1090 || ((var3.anInt1088 & 1) == 0)))
														continue;
												}

												if ((var4 >= anInt350) && (var4 < (anInt317 - 1))) {
													var9 = var8[var4 + 1][var5];
													if ((var9 != null) && var9.aBool1091
															&& (var9.aBool1090 || ((var3.anInt1088 & 4) == 0)))
														continue;
												}

												if ((var5 <= anInt321) && (var5 > anInt318)) {
													var9 = var8[var4][var5 - 1];
													if ((var9 != null) && var9.aBool1091
															&& (var9.aBool1090 || ((var3.anInt1088 & 8) == 0)))
														continue;
												}

												if ((var5 >= anInt321) && (var5 < (anInt330 - 1))) {
													var9 = var8[var4][var5 + 1];
													if ((var9 != null) && var9.aBool1091
															&& (var9.aBool1090 || ((var3.anInt1088 & 2) == 0)))
														continue;
												}
											} else
												var2 = true;

											var3.aBool1090 = false;
											if (var3.aClass131_Sub12_1076 != null) {
												var9 = var3.aClass131_Sub12_1076;
												if (var9.aClass29_1089 != null) {
													if (!method177(0, var4, var5))
														method174(var9.aClass29_1089, 0, anInt334, anInt338, anInt327,
																anInt320, var4, var5);
												} else if ((var9.aClass37_1080 != null) && !method177(0, var4, var5))
													method175(var9.aClass37_1080, anInt334, anInt338, anInt327,
															anInt320, var4, var5);

												var10 = var9.aClass25_1081;
												if (var10 != null)
													var10.aClass131_Sub20_Sub19_218.method869(0, anInt334, anInt338,
															anInt327, anInt320, var10.anInt214 - anInt322,
															var10.anInt219 - anInt331, var10.anInt215 - anInt324,
															var10.anInt223);

												for (var11 = 0; var11 < var9.anInt1075; ++var11) {
													var12 = var9.aClass47Array1086[var11];
													if (var12 != null)
														var12.aClass131_Sub20_Sub19_457.method869(var12.anInt458,
																anInt334, anInt338, anInt327, anInt320,
																var12.anInt464 - anInt322, var12.anInt455 - anInt331,
																var12.anInt456 - anInt324, var12.anInt465);
												}
											}

											var13 = false;
											if (var3.aClass29_1089 != null) {
												if (!method177(var7, var4, var5)) {
													var13 = true;
													if ((var3.aClass29_1089.anInt264 != 12345678)
															|| (aBool326 && (var6 <= anInt307)))
														method174(var3.aClass29_1089, var7, anInt334, anInt338,
																anInt327, anInt320, var4, var5);
												}
											} else if ((var3.aClass37_1080 != null) && !method177(var7, var4, var5)) {
												var13 = true;
												method175(var3.aClass37_1080, anInt334, anInt338, anInt327, anInt320,
														var4, var5);
											}

											var14 = 0;
											var11 = 0;
											final Class25 var31 = var3.aClass25_1081;
											final Class38 var15 = var3.aClass38_1082;
											if ((var31 != null) || (var15 != null)) {
												if (anInt350 == var4)
													++var14;
												else if (anInt350 < var4)
													var14 += 2;

												if (anInt321 == var5)
													var14 += 3;
												else if (anInt321 > var5)
													var14 += 6;

												var11 = anIntArray309[var14];
												var3.anInt1083 = anIntArray323[var14];
											}

											if (var31 != null) {
												if ((var31.anInt216 & anIntArray352[var14]) != 0) {
													if (var31.anInt216 == 16) {
														var3.anInt1092 = 3;
														var3.anInt1093 = anIntArray345[var14];
														var3.anInt1094 = 3 - var3.anInt1093;
													} else if (var31.anInt216 == 32) {
														var3.anInt1092 = 6;
														var3.anInt1093 = anIntArray346[var14];
														var3.anInt1094 = 6 - var3.anInt1093;
													} else if (var31.anInt216 == 64) {
														var3.anInt1092 = 12;
														var3.anInt1093 = anIntArray343[var14];
														var3.anInt1094 = 12 - var3.anInt1093;
													} else {
														var3.anInt1092 = 9;
														var3.anInt1093 = anIntArray348[var14];
														var3.anInt1094 = 9 - var3.anInt1093;
													}
												} else
													var3.anInt1092 = 0;

												if (((var31.anInt216 & var11) != 0)
														&& !method178(var7, var4, var5, var31.anInt216))
													var31.aClass131_Sub20_Sub19_218.method869(0, anInt334, anInt338,
															anInt327, anInt320, var31.anInt214 - anInt322,
															var31.anInt219 - anInt331, var31.anInt215 - anInt324,
															var31.anInt223);

												if (((var31.anInt217 & var11) != 0)
														&& !method178(var7, var4, var5, var31.anInt217))
													var31.aClass131_Sub20_Sub19_220.method869(0, anInt334, anInt338,
															anInt327, anInt320, var31.anInt214 - anInt322,
															var31.anInt219 - anInt331, var31.anInt215 - anInt324,
															var31.anInt223);
											}

											if ((var15 != null) && !method171(var7, var4, var5,
													var15.aClass131_Sub20_Sub19_402.anInt1643))
												if ((var15.anInt400 & var11) != 0)
													var15.aClass131_Sub20_Sub19_402.method869(0, anInt334, anInt338,
															anInt327, anInt320,
															(var15.anInt398 - anInt322) + var15.anInt404,
															var15.anInt399 - anInt331,
															(var15.anInt397 - anInt324) + var15.anInt401,
															var15.anInt403);
												else if (var15.anInt400 == 256) {
													var16 = var15.anInt398 - anInt322;
													var17 = var15.anInt399 - anInt331;
													var18 = var15.anInt397 - anInt324;
													var19 = var15.anInt396;
													if ((var19 != 1) && (var19 != 2))
														var20 = var16;
													else
														var20 = -var16;

													int var21;
													if ((var19 != 2) && (var19 != 3))
														var21 = var18;
													else
														var21 = -var18;

													if (var21 < var20)
														var15.aClass131_Sub20_Sub19_402.method869(0, anInt334, anInt338,
																anInt327, anInt320, var16 + var15.anInt404, var17,
																var18 + var15.anInt401, var15.anInt403);
													else if (var15.aClass131_Sub20_Sub19_395 != null)
														var15.aClass131_Sub20_Sub19_395.method869(0, anInt334, anInt338,
																anInt327, anInt320, var16, var17, var18,
																var15.anInt403);
												}

											if (var13) {
												final Class22 var22 = var3.aClass22_1085;
												if (var22 != null)
													var22.aClass131_Sub20_Sub19_205.method869(0, anInt334, anInt338,
															anInt327, anInt320, var22.anInt201 - anInt322,
															var22.anInt206 - anInt331, var22.anInt202 - anInt324,
															var22.anInt204);

												final Class31 var23 = var3.aClass31_1084;
												if ((var23 != null) && (var23.anInt295 == 0)) {
													if (var23.aClass131_Sub20_Sub19_290 != null)
														var23.aClass131_Sub20_Sub19_290.method869(0, anInt334, anInt338,
																anInt327, anInt320, var23.anInt289 - anInt322,
																var23.anInt292 - anInt331, var23.anInt294 - anInt324,
																var23.anInt288);

													if (var23.aClass131_Sub20_Sub19_293 != null)
														var23.aClass131_Sub20_Sub19_293.method869(0, anInt334, anInt338,
																anInt327, anInt320, var23.anInt289 - anInt322,
																var23.anInt292 - anInt331, var23.anInt294 - anInt324,
																var23.anInt288);

													if (var23.aClass131_Sub20_Sub19_291 != null)
														var23.aClass131_Sub20_Sub19_291.method869(0, anInt334, anInt338,
																anInt327, anInt320, var23.anInt289 - anInt322,
																var23.anInt292 - anInt331, var23.anInt294 - anInt324,
																var23.anInt288);
												}
											}

											var16 = var3.anInt1088;
											if (var16 != 0) {
												if ((var4 < anInt350) && ((var16 & 4) != 0)) {
													var36 = var8[var4 + 1][var5];
													if ((var36 != null) && var36.aBool1091)
														aClass115_341.method471(var36);
												}

												if ((var5 < anInt321) && ((var16 & 2) != 0)) {
													var36 = var8[var4][var5 + 1];
													if ((var36 != null) && var36.aBool1091)
														aClass115_341.method471(var36);
												}

												if ((var4 > anInt350) && ((var16 & 1) != 0)) {
													var36 = var8[var4 - 1][var5];
													if ((var36 != null) && var36.aBool1091)
														aClass115_341.method471(var36);
												}

												if ((var5 > anInt321) && ((var16 & 8) != 0)) {
													var36 = var8[var4][var5 - 1];
													if ((var36 != null) && var36.aBool1091)
														aClass115_341.method471(var36);
												}
											}
											break;
										}

										if (var3.anInt1092 != 0) {
											var13 = true;

											for (var14 = 0; var14 < var3.anInt1075; ++var14)
												if ((var3.aClass47Array1086[var14].anInt468 != anInt315)
														&& ((var3.anIntArray1087[var14]
																& var3.anInt1092) == var3.anInt1093)) {
													var13 = false;
													break;
												}

											if (var13) {
												var10 = var3.aClass25_1081;
												if (!method178(var7, var4, var5, var10.anInt216))
													var10.aClass131_Sub20_Sub19_218.method869(0, anInt334, anInt338,
															anInt327, anInt320, var10.anInt214 - anInt322,
															var10.anInt219 - anInt331, var10.anInt215 - anInt324,
															var10.anInt223);

												var3.anInt1092 = 0;
											}
										}

										if (!var3.aBool1079)
											break;

										try {
											final int var33 = var3.anInt1075;
											var3.aBool1079 = false;
											var14 = 0;

											label561: for (var11 = 0; var11 < var33; ++var11) {
												var12 = var3.aClass47Array1086[var11];
												if (var12.anInt468 != anInt315) {
													for (var24 = var12.anInt459; var24 <= var12.anInt460; ++var24)
														for (var16 = var12.anInt454; var16 <= var12.anInt462; ++var16) {
															var36 = var8[var24][var16];
															if (var36.aBool1090) {
																var3.aBool1079 = true;
																continue label561;
															}

															if (var36.anInt1092 != 0) {
																var18 = 0;
																if (var24 > var12.anInt459)
																	++var18;

																if (var24 < var12.anInt460)
																	var18 += 4;

																if (var16 > var12.anInt454)
																	var18 += 8;

																if (var16 < var12.anInt462)
																	var18 += 2;

																if ((var18 & var36.anInt1092) == var3.anInt1094) {
																	var3.aBool1079 = true;
																	continue label561;
																}
															}
														}

													aClass47Array329[var14++] = var12;
													var24 = anInt350 - var12.anInt459;
													var16 = var12.anInt460 - anInt350;
													if (var16 > var24)
														var24 = var16;

													var17 = anInt321 - var12.anInt454;
													var18 = var12.anInt462 - anInt321;
													if (var18 > var17)
														var12.anInt463 = var24 + var18;
													else
														var12.anInt463 = var24 + var17;
												}
											}

											while (var14 > 0) {
												var11 = -50;
												var25 = -1;

												for (var24 = 0; var24 < var14; ++var24) {
													final Class47 var35 = aClass47Array329[var24];
													if (var35.anInt468 != anInt315)
														if (var35.anInt463 > var11) {
															var11 = var35.anInt463;
															var25 = var24;
														} else if (var35.anInt463 == var11) {
															var17 = var35.anInt464 - anInt322;
															var18 = var35.anInt456 - anInt324;
															var19 = aClass47Array329[var25].anInt464 - anInt322;
															var20 = aClass47Array329[var25].anInt456 - anInt324;
															if (((var17 * var17) + (var18 * var18)) > ((var19 * var19)
																	+ (var20 * var20)))
																var25 = var24;
														}
												}

												if (var25 == -1)
													break;

												final Class47 var34 = aClass47Array329[var25];
												var34.anInt468 = anInt315;
												if (!method156(var7, var34.anInt459, var34.anInt460, var34.anInt454,
														var34.anInt462, var34.aClass131_Sub20_Sub19_457.anInt1643))
													var34.aClass131_Sub20_Sub19_457.method869(var34.anInt458, anInt334,
															anInt338, anInt327, anInt320, var34.anInt464 - anInt322,
															var34.anInt455 - anInt331, var34.anInt456 - anInt324,
															var34.anInt465);

												for (var16 = var34.anInt459; var16 <= var34.anInt460; ++var16)
													for (var17 = var34.anInt454; var17 <= var34.anInt462; ++var17) {
														final Class131_Sub12 var26 = var8[var16][var17];
														if (var26.anInt1092 != 0)
															aClass115_341.method471(var26);
														else if (((var16 != var4) || (var17 != var5))
																&& var26.aBool1091)
															aClass115_341.method471(var26);
													}
											}

											if (!var3.aBool1079)
												break;
										} catch (final Exception var28) {
											var3.aBool1079 = false;
											break;
										}
									}
								while (!var3.aBool1091);
							while (var3.anInt1092 != 0);

							if ((var4 > anInt350) || (var4 <= anInt316))
								break;

							var9 = var8[var4 - 1][var5];
						} while ((var9 != null) && var9.aBool1091);

						if ((var4 < anInt350) || (var4 >= (anInt317 - 1)))
							break;

						var9 = var8[var4 + 1][var5];
					} while ((var9 != null) && var9.aBool1091);

					if ((var5 > anInt321) || (var5 <= anInt318))
						break;

					var9 = var8[var4][var5 - 1];
				} while ((var9 != null) && var9.aBool1091);

				if ((var5 < anInt321) || (var5 >= (anInt330 - 1)))
					break;

				var9 = var8[var4][var5 + 1];
			} while ((var9 != null) && var9.aBool1091);

			var3.aBool1091 = false;
			--anInt313;
			final Class31 var32 = var3.aClass31_1084;
			if ((var32 != null) && (var32.anInt295 != 0)) {
				if (var32.aClass131_Sub20_Sub19_290 != null)
					var32.aClass131_Sub20_Sub19_290.method869(0, anInt334, anInt338, anInt327, anInt320,
							var32.anInt289 - anInt322, var32.anInt292 - anInt331 - var32.anInt295,
							var32.anInt294 - anInt324, var32.anInt288);

				if (var32.aClass131_Sub20_Sub19_293 != null)
					var32.aClass131_Sub20_Sub19_293.method869(0, anInt334, anInt338, anInt327, anInt320,
							var32.anInt289 - anInt322, var32.anInt292 - anInt331 - var32.anInt295,
							var32.anInt294 - anInt324, var32.anInt288);

				if (var32.aClass131_Sub20_Sub19_291 != null)
					var32.aClass131_Sub20_Sub19_291.method869(0, anInt334, anInt338, anInt327, anInt320,
							var32.anInt289 - anInt322, var32.anInt292 - anInt331 - var32.anInt295,
							var32.anInt294 - anInt324, var32.anInt288);
			}

			if (var3.anInt1083 != 0) {
				final Class38 var29 = var3.aClass38_1082;
				if ((var29 != null) && !method171(var7, var4, var5, var29.aClass131_Sub20_Sub19_402.anInt1643))
					if ((var29.anInt400 & var3.anInt1083) != 0)
						var29.aClass131_Sub20_Sub19_402.method869(0, anInt334, anInt338, anInt327, anInt320,
								(var29.anInt398 - anInt322) + var29.anInt404, var29.anInt399 - anInt331,
								(var29.anInt397 - anInt324) + var29.anInt401, var29.anInt403);
					else if (var29.anInt400 == 256) {
						var11 = var29.anInt398 - anInt322;
						var25 = var29.anInt399 - anInt331;
						var24 = var29.anInt397 - anInt324;
						var16 = var29.anInt396;
						if ((var16 != 1) && (var16 != 2))
							var17 = var11;
						else
							var17 = -var11;

						if ((var16 != 2) && (var16 != 3))
							var18 = var24;
						else
							var18 = -var24;

						if (var18 >= var17)
							var29.aClass131_Sub20_Sub19_402.method869(0, anInt334, anInt338, anInt327, anInt320,
									var11 + var29.anInt404, var25, var24 + var29.anInt401, var29.anInt403);
						else if (var29.aClass131_Sub20_Sub19_395 != null)
							var29.aClass131_Sub20_Sub19_395.method869(0, anInt334, anInt338, anInt327, anInt320, var11,
									var25, var24, var29.anInt403);
					}

				final Class25 var27 = var3.aClass25_1081;
				if (var27 != null) {
					if (((var27.anInt217 & var3.anInt1083) != 0) && !method178(var7, var4, var5, var27.anInt217))
						var27.aClass131_Sub20_Sub19_220.method869(0, anInt334, anInt338, anInt327, anInt320,
								var27.anInt214 - anInt322, var27.anInt219 - anInt331, var27.anInt215 - anInt324,
								var27.anInt223);

					if (((var27.anInt216 & var3.anInt1083) != 0) && !method178(var7, var4, var5, var27.anInt216))
						var27.aClass131_Sub20_Sub19_218.method869(0, anInt334, anInt338, anInt327, anInt320,
								var27.anInt214 - anInt322, var27.anInt219 - anInt331, var27.anInt215 - anInt324,
								var27.anInt223);
				}
			}

			Class131_Sub12 var30;
			if (var6 < (anInt303 - 1)) {
				var30 = aClass131_Sub12ArrayArrayArray308[var6 + 1][var4][var5];
				if ((var30 != null) && var30.aBool1091)
					aClass115_341.method471(var30);
			}

			if (var4 < anInt350) {
				var30 = var8[var4 + 1][var5];
				if ((var30 != null) && var30.aBool1091)
					aClass115_341.method471(var30);
			}

			if (var5 < anInt321) {
				var30 = var8[var4][var5 + 1];
				if ((var30 != null) && var30.aBool1091)
					aClass115_341.method471(var30);
			}

			if (var4 > anInt350) {
				var30 = var8[var4 - 1][var5];
				if ((var30 != null) && var30.aBool1091)
					aClass115_341.method471(var30);
			}

			if (var5 > anInt321) {
				var30 = var8[var4][var5 - 1];
				if ((var30 != null) && var30.aBool1091)
					aClass115_341.method471(var30);
			}
		}
	}

	void method174(final Class29 var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - anInt322;
		int var14;
		int var15 = var14 = (var8 << 7) - anInt324;
		int var12;
		int var13 = var12 = var10 + 128;
		int var20;
		int var17 = var20 = var15 + 128;
		int var22 = anIntArrayArrayArray306[var2][var7][var8] - anInt331;
		int var19 = anIntArrayArrayArray306[var2][var7 + 1][var8] - anInt331;
		int var16 = anIntArrayArrayArray306[var2][var7 + 1][var8 + 1] - anInt331;
		final int var21 = anIntArrayArrayArray306[var2][var7][var8 + 1] - anInt331;
		int var18 = ((var15 * var5) + (var10 * var6)) >> 16;
		var15 = ((var15 * var6) - (var10 * var5)) >> 16;
		var10 = var18;
		var18 = ((var22 * var4) - (var15 * var3)) >> 16;
		var15 = ((var22 * var3) + (var15 * var4)) >> 16;
		var22 = var18;
		if (var15 >= 50) {
			var18 = ((var14 * var5) + (var13 * var6)) >> 16;
			var14 = ((var14 * var6) - (var13 * var5)) >> 16;
			var13 = var18;
			var18 = ((var19 * var4) - (var14 * var3)) >> 16;
			var14 = ((var19 * var3) + (var14 * var4)) >> 16;
			var19 = var18;
			if (var14 >= 50) {
				var18 = ((var17 * var5) + (var12 * var6)) >> 16;
				var17 = ((var17 * var6) - (var12 * var5)) >> 16;
				var12 = var18;
				var18 = ((var16 * var4) - (var17 * var3)) >> 16;
				var17 = ((var16 * var3) + (var17 * var4)) >> 16;
				var16 = var18;
				if (var17 >= 50) {
					var18 = ((var20 * var5) + (var9 * var6)) >> 16;
					var20 = ((var20 * var6) - (var9 * var5)) >> 16;
					var9 = var18;
					var18 = ((var21 * var4) - (var20 * var3)) >> 16;
					var20 = ((var21 * var3) + (var20 * var4)) >> 16;
					if (var20 >= 50) {
						final int var27 = Class131_Sub20_Sub17_Sub1.anInt1780
								+ ((var10 * Class131_Sub20_Sub17_Sub1.anInt1774) / var15);
						final int var23 = Class131_Sub20_Sub17_Sub1.anInt1776
								+ ((var22 * Class131_Sub20_Sub17_Sub1.anInt1774) / var15);
						final int var25 = Class131_Sub20_Sub17_Sub1.anInt1780
								+ ((var13 * Class131_Sub20_Sub17_Sub1.anInt1774) / var14);
						final int var26 = Class131_Sub20_Sub17_Sub1.anInt1776
								+ ((var19 * Class131_Sub20_Sub17_Sub1.anInt1774) / var14);
						final int var28 = Class131_Sub20_Sub17_Sub1.anInt1780
								+ ((var12 * Class131_Sub20_Sub17_Sub1.anInt1774) / var17);
						final int var29 = Class131_Sub20_Sub17_Sub1.anInt1776
								+ ((var16 * Class131_Sub20_Sub17_Sub1.anInt1774) / var17);
						final int var11 = Class131_Sub20_Sub17_Sub1.anInt1780
								+ ((var9 * Class131_Sub20_Sub17_Sub1.anInt1774) / var20);
						final int var30 = Class131_Sub20_Sub17_Sub1.anInt1776
								+ ((var18 * Class131_Sub20_Sub17_Sub1.anInt1774) / var20);
						Class131_Sub20_Sub17_Sub1.anInt1771 = 0;
						int var24;
						if ((((var28 - var11) * (var26 - var30)) - ((var29 - var30) * (var25 - var11))) > 0) {
							Class131_Sub20_Sub17_Sub1.aBool1775 = false;
							if ((var28 < 0) || (var11 < 0) || (var25 < 0)
									|| (var28 > Class131_Sub20_Sub17_Sub1.anInt1777)
									|| (var11 > Class131_Sub20_Sub17_Sub1.anInt1777)
									|| (var25 > Class131_Sub20_Sub17_Sub1.anInt1777))
								Class131_Sub20_Sub17_Sub1.aBool1775 = true;

							if (aBool326 && method179(anInt332, anInt333, var29, var30, var26, var28, var11, var25)) {
								anInt302 = var7;
								anInt335 = var8;
							}

							if (var1.anInt266 == -1) {
								if (var1.anInt264 != 12345678)
									Class131_Sub20_Sub17_Sub1.method943(var29, var30, var26, var28, var11, var25,
											var1.anInt264, var1.anInt265, var1.anInt270);
							} else if (!aBool328) {
								if (var1.aBool267)
									Class131_Sub20_Sub17_Sub1.method940(var29, var30, var26, var28, var11, var25,
											var1.anInt264, var1.anInt265, var1.anInt270, var10, var13, var9, var22,
											var19, var18, var15, var14, var20, var1.anInt266);
								else
									Class131_Sub20_Sub17_Sub1.method940(var29, var30, var26, var28, var11, var25,
											var1.anInt264, var1.anInt265, var1.anInt270, var12, var9, var13, var16,
											var18, var19, var17, var20, var14, var1.anInt266);
							} else {
								var24 = Class131_Sub20_Sub17_Sub1.anInterface3_1784.method7(var1.anInt266, 1882836254);
								Class131_Sub20_Sub17_Sub1.method943(var29, var30, var26, var28, var11, var25,
										method189(var24, var1.anInt264), method189(var24, var1.anInt265),
										method189(var24, var1.anInt270));
							}
						}

						if ((((var27 - var25) * (var30 - var26)) - ((var23 - var26) * (var11 - var25))) > 0) {
							Class131_Sub20_Sub17_Sub1.aBool1775 = false;
							if ((var27 < 0) || (var25 < 0) || (var11 < 0)
									|| (var27 > Class131_Sub20_Sub17_Sub1.anInt1777)
									|| (var25 > Class131_Sub20_Sub17_Sub1.anInt1777)
									|| (var11 > Class131_Sub20_Sub17_Sub1.anInt1777))
								Class131_Sub20_Sub17_Sub1.aBool1775 = true;

							if (aBool326 && method179(anInt332, anInt333, var23, var26, var30, var27, var25, var11)) {
								anInt302 = var7;
								anInt335 = var8;
							}

							if (var1.anInt266 == -1) {
								if (var1.anInt262 != 12345678)
									Class131_Sub20_Sub17_Sub1.method943(var23, var26, var30, var27, var25, var11,
											var1.anInt262, var1.anInt270, var1.anInt265);
							} else if (!aBool328)
								Class131_Sub20_Sub17_Sub1.method940(var23, var26, var30, var27, var25, var11,
										var1.anInt262, var1.anInt270, var1.anInt265, var10, var13, var9, var22, var19,
										var18, var15, var14, var20, var1.anInt266);
							else {
								var24 = Class131_Sub20_Sub17_Sub1.anInterface3_1784.method7(var1.anInt266, 1882836254);
								Class131_Sub20_Sub17_Sub1.method943(var23, var26, var30, var27, var25, var11,
										method189(var24, var1.anInt262), method189(var24, var1.anInt270),
										method189(var24, var1.anInt265));
							}
						}

					}
				}
			}
		}
	}

	void method175(final Class37 var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7) {
		int var8 = var1.anIntArray392.length;

		int var9;
		int var11;
		int var12;
		int var13;
		int var15;
		for (var11 = 0; var11 < var8; ++var11) {
			var12 = var1.anIntArray392[var11] - anInt322;
			var13 = var1.anIntArray373[var11] - anInt331;
			var9 = var1.anIntArray379[var11] - anInt324;
			var15 = ((var9 * var4) + (var12 * var5)) >> 16;
			var9 = ((var9 * var5) - (var12 * var4)) >> 16;
			var12 = var15;
			var15 = ((var13 * var3) - (var9 * var2)) >> 16;
			var9 = ((var13 * var2) + (var9 * var3)) >> 16;
			if (var9 < 50)
				return;

			if (var1.anIntArray382 != null) {
				Class37.anIntArray390[var11] = var12;
				Class37.anIntArray391[var11] = var15;
				Class37.anIntArray374[var11] = var9;
			}

			Class37.anIntArray388[var11] = Class131_Sub20_Sub17_Sub1.anInt1780
					+ ((var12 * Class131_Sub20_Sub17_Sub1.anInt1774) / var9);
			Class37.anIntArray394[var11] = Class131_Sub20_Sub17_Sub1.anInt1776
					+ ((var15 * Class131_Sub20_Sub17_Sub1.anInt1774) / var9);
		}

		Class131_Sub20_Sub17_Sub1.anInt1771 = 0;
		var8 = var1.anIntArray393.length;

		for (var11 = 0; var11 < var8; ++var11) {
			var12 = var1.anIntArray393[var11];
			var13 = var1.anIntArray380[var11];
			var9 = var1.anIntArray389[var11];
			var15 = Class37.anIntArray388[var12];
			final int var14 = Class37.anIntArray388[var13];
			final int var18 = Class37.anIntArray388[var9];
			final int var16 = Class37.anIntArray394[var12];
			final int var17 = Class37.anIntArray394[var13];
			final int var10 = Class37.anIntArray394[var9];
			if ((((var15 - var14) * (var10 - var17)) - ((var16 - var17) * (var18 - var14))) > 0) {
				Class131_Sub20_Sub17_Sub1.aBool1775 = false;
				if ((var15 < 0) || (var14 < 0) || (var18 < 0) || (var15 > Class131_Sub20_Sub17_Sub1.anInt1777)
						|| (var14 > Class131_Sub20_Sub17_Sub1.anInt1777)
						|| (var18 > Class131_Sub20_Sub17_Sub1.anInt1777))
					Class131_Sub20_Sub17_Sub1.aBool1775 = true;

				if (aBool326 && method179(anInt332, anInt333, var16, var17, var10, var15, var14, var18)) {
					anInt302 = var6;
					anInt335 = var7;
				}

				if ((var1.anIntArray382 != null) && (var1.anIntArray382[var11] != -1)) {
					if (!aBool328) {
						if (var1.aBool383)
							Class131_Sub20_Sub17_Sub1.method940(var16, var17, var10, var15, var14, var18,
									var1.anIntArray376[var11], var1.anIntArray386[var11], var1.anIntArray381[var11],
									Class37.anIntArray390[0], Class37.anIntArray390[1], Class37.anIntArray390[3],
									Class37.anIntArray391[0], Class37.anIntArray391[1], Class37.anIntArray391[3],
									Class37.anIntArray374[0], Class37.anIntArray374[1], Class37.anIntArray374[3],
									var1.anIntArray382[var11]);
						else
							Class131_Sub20_Sub17_Sub1.method940(var16, var17, var10, var15, var14, var18,
									var1.anIntArray376[var11], var1.anIntArray386[var11], var1.anIntArray381[var11],
									Class37.anIntArray390[var12], Class37.anIntArray390[var13],
									Class37.anIntArray390[var9], Class37.anIntArray391[var12],
									Class37.anIntArray391[var13], Class37.anIntArray391[var9],
									Class37.anIntArray374[var12], Class37.anIntArray374[var13],
									Class37.anIntArray374[var9], var1.anIntArray382[var11]);
					} else {
						final int var19 = Class131_Sub20_Sub17_Sub1.anInterface3_1784.method7(var1.anIntArray382[var11],
								1882836254);
						Class131_Sub20_Sub17_Sub1.method943(var16, var17, var10, var15, var14, var18,
								method189(var19, var1.anIntArray376[var11]),
								method189(var19, var1.anIntArray386[var11]),
								method189(var19, var1.anIntArray381[var11]));
					}
				} else if (var1.anIntArray376[var11] != 12345678)
					Class131_Sub20_Sub17_Sub1.method943(var16, var17, var10, var15, var14, var18,
							var1.anIntArray376[var11], var1.anIntArray386[var11], var1.anIntArray381[var11]);
			}
		}

	}

	void method176() {
		final int var1 = anIntArray337[anInt314];
		final Class58[] var5 = aClass58ArrayArray305[anInt314];
		anInt339 = 0;

		for (int var4 = 0; var4 < var1; ++var4) {
			final Class58 var2 = var5[var4];
			int var3;
			int var6;
			int var7;
			int var8;
			boolean var13;
			if (var2.anInt550 == 1) {
				var3 = (var2.anInt562 - anInt350) + 25;
				if ((var3 >= 0) && (var3 <= 50)) {
					var7 = (var2.anInt549 - anInt321) + 25;
					if (var7 < 0)
						var7 = 0;

					var8 = (var2.anInt559 - anInt321) + 25;
					if (var8 > 50)
						var8 = 50;

					var13 = false;

					while (var7 <= var8)
						if (aBoolArrayArray347[var3][var7++]) {
							var13 = true;
							break;
						}

					if (var13) {
						var6 = anInt322 - var2.anInt554;
						if (var6 > 32)
							var2.anInt555 = 1;
						else {
							if (var6 >= -32)
								continue;

							var2.anInt555 = 2;
							var6 = -var6;
						}

						var2.anInt551 = ((var2.anInt553 - anInt324) << 8) / var6;
						var2.anInt561 = ((var2.anInt556 - anInt324) << 8) / var6;
						var2.anInt547 = ((var2.anInt560 - anInt331) << 8) / var6;
						var2.anInt563 = ((var2.anInt548 - anInt331) << 8) / var6;
						aClass58Array340[anInt339++] = var2;
					}
				}
			} else if (var2.anInt550 == 2) {
				var3 = (var2.anInt549 - anInt321) + 25;
				if ((var3 >= 0) && (var3 <= 50)) {
					var7 = (var2.anInt562 - anInt350) + 25;
					if (var7 < 0)
						var7 = 0;

					var8 = (var2.anInt564 - anInt350) + 25;
					if (var8 > 50)
						var8 = 50;

					var13 = false;

					while (var7 <= var8)
						if (aBoolArrayArray347[var7++][var3]) {
							var13 = true;
							break;
						}

					if (var13) {
						var6 = anInt324 - var2.anInt553;
						if (var6 > 32)
							var2.anInt555 = 3;
						else {
							if (var6 >= -32)
								continue;

							var2.anInt555 = 4;
							var6 = -var6;
						}

						var2.anInt558 = ((var2.anInt554 - anInt322) << 8) / var6;
						var2.anInt557 = ((var2.anInt552 - anInt322) << 8) / var6;
						var2.anInt547 = ((var2.anInt560 - anInt331) << 8) / var6;
						var2.anInt563 = ((var2.anInt548 - anInt331) << 8) / var6;
						aClass58Array340[anInt339++] = var2;
					}
				}
			} else if (var2.anInt550 == 4) {
				var3 = var2.anInt560 - anInt331;
				if (var3 > 128) {
					var7 = (var2.anInt549 - anInt321) + 25;
					if (var7 < 0)
						var7 = 0;

					var8 = (var2.anInt559 - anInt321) + 25;
					if (var8 > 50)
						var8 = 50;

					if (var7 <= var8) {
						int var9 = (var2.anInt562 - anInt350) + 25;
						if (var9 < 0)
							var9 = 0;

						var6 = (var2.anInt564 - anInt350) + 25;
						if (var6 > 50)
							var6 = 50;

						boolean var11 = false;

						label171: for (int var12 = var9; var12 <= var6; ++var12)
							for (int var10 = var7; var10 <= var8; ++var10)
								if (aBoolArrayArray347[var12][var10]) {
									var11 = true;
									break label171;
								}

						if (var11) {
							var2.anInt555 = 5;
							var2.anInt558 = ((var2.anInt554 - anInt322) << 8) / var3;
							var2.anInt557 = ((var2.anInt552 - anInt322) << 8) / var3;
							var2.anInt551 = ((var2.anInt553 - anInt324) << 8) / var3;
							var2.anInt561 = ((var2.anInt556 - anInt324) << 8) / var3;
							aClass58Array340[anInt339++] = var2;
						}
					}
				}
			}
		}

	}

	boolean method177(final int var1, final int var2, final int var3) {
		final int var4 = anIntArrayArrayArray311[var1][var2][var3];
		if (var4 == -anInt315)
			return false;
		else if (var4 == anInt315)
			return true;
		else {
			final int var5 = var2 << 7;
			final int var6 = var3 << 7;
			if (method180(var5 + 1, anIntArrayArrayArray306[var1][var2][var3], var6 + 1)
					&& method180((var5 + 128) - 1, anIntArrayArrayArray306[var1][var2 + 1][var3], var6 + 1)
					&& method180((var5 + 128) - 1, anIntArrayArrayArray306[var1][var2 + 1][var3 + 1], (var6 + 128) - 1)
					&& method180(var5 + 1, anIntArrayArrayArray306[var1][var2][var3 + 1], (var6 + 128) - 1)) {
				anIntArrayArrayArray311[var1][var2][var3] = anInt315;
				return true;
			} else {
				anIntArrayArrayArray311[var1][var2][var3] = -anInt315;
				return false;
			}
		}
	}

	boolean method178(final int var1, final int var2, final int var3, final int var4) {
		if (!method177(var1, var2, var3))
			return false;
		else {
			final int var5 = var2 << 7;
			final int var7 = var3 << 7;
			final int var9 = anIntArrayArrayArray306[var1][var2][var3] - 1;
			final int var6 = var9 - 120;
			final int var8 = var9 - 230;
			final int var10 = var9 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > anInt322) {
						if (!method180(var5, var9, var7))
							return false;

						if (!method180(var5, var9, var7 + 128))
							return false;
					}

					if (var1 > 0) {
						if (!method180(var5, var6, var7))
							return false;

						if (!method180(var5, var6, var7 + 128))
							return false;
					}

					if (!method180(var5, var8, var7))
						return false;

					if (!method180(var5, var8, var7 + 128))
						return false;

					return true;
				}

				if (var4 == 2) {
					if (var7 < anInt324) {
						if (!method180(var5, var9, var7 + 128))
							return false;

						if (!method180(var5 + 128, var9, var7 + 128))
							return false;
					}

					if (var1 > 0) {
						if (!method180(var5, var6, var7 + 128))
							return false;

						if (!method180(var5 + 128, var6, var7 + 128))
							return false;
					}

					if (!method180(var5, var8, var7 + 128))
						return false;

					if (!method180(var5 + 128, var8, var7 + 128))
						return false;

					return true;
				}

				if (var4 == 4) {
					if (var5 < anInt322) {
						if (!method180(var5 + 128, var9, var7))
							return false;

						if (!method180(var5 + 128, var9, var7 + 128))
							return false;
					}

					if (var1 > 0) {
						if (!method180(var5 + 128, var6, var7))
							return false;

						if (!method180(var5 + 128, var6, var7 + 128))
							return false;
					}

					if (!method180(var5 + 128, var8, var7))
						return false;

					if (!method180(var5 + 128, var8, var7 + 128))
						return false;

					return true;
				}

				if (var4 == 8) {
					if (var7 > anInt324) {
						if (!method180(var5, var9, var7))
							return false;

						if (!method180(var5 + 128, var9, var7))
							return false;
					}

					if (var1 > 0) {
						if (!method180(var5, var6, var7))
							return false;

						if (!method180(var5 + 128, var6, var7))
							return false;
					}

					if (!method180(var5, var8, var7))
						return false;

					if (!method180(var5 + 128, var8, var7))
						return false;

					return true;
				}
			}

			return !method180(var5 + 64, var10, var7 + 64) ? false
					: (var4 == 16 ? method180(var5, var8, var7 + 128)
							: (var4 == 32 ? method180(var5 + 128, var8, var7 + 128)
									: (var4 == 64 ? method180(var5 + 128, var8, var7)
											: (var4 == 128 ? method180(var5, var8, var7) : true))));
		}
	}

	boolean method179(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8) {
		if ((var2 < var3) && (var2 < var4) && (var2 < var5))
			return false;
		else if ((var2 > var3) && (var2 > var4) && (var2 > var5))
			return false;
		else if ((var1 < var6) && (var1 < var7) && (var1 < var8))
			return false;
		else if ((var1 > var6) && (var1 > var7) && (var1 > var8))
			return false;
		else {
			final int var9 = ((var2 - var3) * (var7 - var6)) - ((var1 - var6) * (var4 - var3));
			final int var11 = ((var2 - var5) * (var6 - var8)) - ((var1 - var8) * (var3 - var5));
			final int var10 = ((var2 - var4) * (var8 - var7)) - ((var1 - var7) * (var5 - var4));
			return ((var9 * var10) > 0) && ((var10 * var11) > 0);
		}
	}

	boolean method180(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt339; ++var4) {
			final Class58 var6 = aClass58Array340[var4];
			int var5;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var6.anInt555 == 1) {
				var7 = var6.anInt554 - var1;
				if (var7 > 0) {
					var8 = var6.anInt553 + ((var6.anInt551 * var7) >> 8);
					var10 = var6.anInt556 + ((var6.anInt561 * var7) >> 8);
					var5 = var6.anInt560 + ((var6.anInt547 * var7) >> 8);
					var9 = var6.anInt548 + ((var6.anInt563 * var7) >> 8);
					if ((var3 >= var8) && (var3 <= var10) && (var2 >= var5) && (var2 <= var9))
						return true;
				}
			} else if (var6.anInt555 == 2) {
				var7 = var1 - var6.anInt554;
				if (var7 > 0) {
					var8 = var6.anInt553 + ((var6.anInt551 * var7) >> 8);
					var10 = var6.anInt556 + ((var6.anInt561 * var7) >> 8);
					var5 = var6.anInt560 + ((var6.anInt547 * var7) >> 8);
					var9 = var6.anInt548 + ((var6.anInt563 * var7) >> 8);
					if ((var3 >= var8) && (var3 <= var10) && (var2 >= var5) && (var2 <= var9))
						return true;
				}
			} else if (var6.anInt555 == 3) {
				var7 = var6.anInt553 - var3;
				if (var7 > 0) {
					var8 = var6.anInt554 + ((var6.anInt558 * var7) >> 8);
					var10 = var6.anInt552 + ((var6.anInt557 * var7) >> 8);
					var5 = var6.anInt560 + ((var6.anInt547 * var7) >> 8);
					var9 = var6.anInt548 + ((var6.anInt563 * var7) >> 8);
					if ((var1 >= var8) && (var1 <= var10) && (var2 >= var5) && (var2 <= var9))
						return true;
				}
			} else if (var6.anInt555 == 4) {
				var7 = var3 - var6.anInt553;
				if (var7 > 0) {
					var8 = var6.anInt554 + ((var6.anInt558 * var7) >> 8);
					var10 = var6.anInt552 + ((var6.anInt557 * var7) >> 8);
					var5 = var6.anInt560 + ((var6.anInt547 * var7) >> 8);
					var9 = var6.anInt548 + ((var6.anInt563 * var7) >> 8);
					if ((var1 >= var8) && (var1 <= var10) && (var2 >= var5) && (var2 <= var9))
						return true;
				}
			} else if (var6.anInt555 == 5) {
				var7 = var2 - var6.anInt560;
				if (var7 > 0) {
					var8 = var6.anInt554 + ((var6.anInt558 * var7) >> 8);
					var10 = var6.anInt552 + ((var6.anInt557 * var7) >> 8);
					var5 = var6.anInt553 + ((var6.anInt551 * var7) >> 8);
					var9 = var6.anInt556 + ((var6.anInt561 * var7) >> 8);
					if ((var1 >= var8) && (var1 <= var10) && (var3 >= var5) && (var3 <= var9))
						return true;
				}
			}
		}

		return false;
	}

	void method181(final Class47 var1) {
		for (int var2 = var1.anInt459; var2 <= var1.anInt460; ++var2)
			for (int var5 = var1.anInt454; var5 <= var1.anInt462; ++var5) {
				final Class131_Sub12 var3 = aClass131_Sub12ArrayArrayArray308[var1.anInt461][var2][var5];
				if (var3 != null) {
					int var4;
					for (var4 = 0; var4 < var3.anInt1075; ++var4)
						if (var3.aClass47Array1086[var4] == var1) {
							--var3.anInt1075;

							for (int var6 = var4; var6 < var3.anInt1075; ++var6) {
								var3.aClass47Array1086[var6] = var3.aClass47Array1086[var6 + 1];
								var3.anIntArray1087[var6] = var3.anIntArray1087[var6 + 1];
							}

							var3.aClass47Array1086[var3.anInt1075] = null;
							break;
						}

					var3.anInt1088 = 0;

					for (var4 = 0; var4 < var3.anInt1075; ++var4)
						var3.anInt1088 |= var3.anIntArray1087[var4];
				}
			}

	}

	public Class33(final int var1, final int var2, final int var3, final int[][][] var4) {
		anInt303 = var1;
		anInt304 = var2;
		anInt354 = var3;
		aClass131_Sub12ArrayArrayArray308 = new Class131_Sub12[var1][var2][var3];
		anIntArrayArrayArray311 = new int[var1][var2 + 1][var3 + 1];
		anIntArrayArrayArray306 = var4;
		method190();
	}

	public void method182(final int var1, final int var2, final int var3, final int var4) {
		final Class131_Sub12 var5 = aClass131_Sub12ArrayArrayArray308[var1][var2][var3];
		if (var5 != null)
			aClass131_Sub12ArrayArrayArray308[var1][var2][var3].anInt1097 = var4;
	}

	public boolean method183(final int var1, final int var2, final int var3, final int var4, final int var5,
			final Class131_Sub20_Sub19 var6, final int var7, final int var8, final int var9, final int var10,
			final int var11, final int var12) {
		return var6 == null ? true
				: method157(var1, var9, var10, (var11 - var9) + 1, (var12 - var10) + 1, var2, var3, var4, var6, var7,
						true, var8, 0);
	}

	public void method184(int var1, final int var2, int var3, final int var4, final int var5, final int var6) {
		if (var1 < 0)
			var1 = 0;
		else if (var1 >= (anInt304 * 128))
			var1 = (anInt304 * 128) - 1;

		if (var3 < 0)
			var3 = 0;
		else if (var3 >= (anInt354 * 128))
			var3 = (anInt354 * 128) - 1;

		++anInt315;
		anInt334 = Class131_Sub20_Sub17_Sub1.anIntArray1787[var4];
		anInt338 = Class131_Sub20_Sub17_Sub1.anIntArray1770[var4];
		anInt327 = Class131_Sub20_Sub17_Sub1.anIntArray1787[var5];
		anInt320 = Class131_Sub20_Sub17_Sub1.anIntArray1770[var5];
		aBoolArrayArray347 = aBoolArrayArrayArrayArray351[(var4 - 128) / 32][var5 / 64];
		anInt322 = var1;
		anInt331 = var2;
		anInt324 = var3;
		anInt350 = var1 / 128;
		anInt321 = var3 / 128;
		anInt314 = var6;
		anInt316 = anInt350 - 25;
		if (anInt316 < 0)
			anInt316 = 0;

		anInt318 = anInt321 - 25;
		if (anInt318 < 0)
			anInt318 = 0;

		anInt317 = anInt350 + 25;
		if (anInt317 > anInt304)
			anInt317 = anInt304;

		anInt330 = anInt321 + 25;
		if (anInt330 > anInt354)
			anInt330 = anInt354;

		method176();
		anInt313 = 0;

		Class131_Sub12[][] var8;
		int var12;
		int var13;
		int var15;
		for (var12 = anInt312; var12 < anInt303; ++var12) {
			var8 = aClass131_Sub12ArrayArrayArray308[var12];

			for (var15 = anInt316; var15 < anInt317; ++var15)
				for (var13 = anInt318; var13 < anInt330; ++var13) {
					final Class131_Sub12 var7 = var8[var15][var13];
					if (var7 != null)
						if ((var7.anInt1097 > var6)
								|| (!aBoolArrayArray347[(var15 - anInt350) + 25][(var13 - anInt321) + 25]
										&& ((anIntArrayArrayArray306[var12][var15][var13] - var2) < 2000))) {
							var7.aBool1090 = false;
							var7.aBool1091 = false;
							var7.anInt1092 = 0;
						} else {
							var7.aBool1090 = true;
							var7.aBool1091 = true;
							if (var7.anInt1075 > 0)
								var7.aBool1079 = true;
							else
								var7.aBool1079 = false;

							++anInt313;
						}
				}
		}

		int var9;
		int var10;
		Class131_Sub12 var11;
		int var14;
		int var16;
		for (var12 = anInt312; var12 < anInt303; ++var12) {
			var8 = aClass131_Sub12ArrayArrayArray308[var12];

			for (var15 = -25; var15 <= 0; ++var15) {
				var13 = anInt350 + var15;
				var9 = anInt350 - var15;
				if ((var13 >= anInt316) || (var9 < anInt317))
					for (var14 = -25; var14 <= 0; ++var14) {
						var10 = anInt321 + var14;
						var16 = anInt321 - var14;
						if (var13 >= anInt316) {
							if (var10 >= anInt318) {
								var11 = var8[var13][var10];
								if ((var11 != null) && var11.aBool1090)
									method173(var11, true);
							}

							if (var16 < anInt330) {
								var11 = var8[var13][var16];
								if ((var11 != null) && var11.aBool1090)
									method173(var11, true);
							}
						}

						if (var9 < anInt317) {
							if (var10 >= anInt318) {
								var11 = var8[var9][var10];
								if ((var11 != null) && var11.aBool1090)
									method173(var11, true);
							}

							if (var16 < anInt330) {
								var11 = var8[var9][var16];
								if ((var11 != null) && var11.aBool1090)
									method173(var11, true);
							}
						}

						if (anInt313 == 0) {
							aBool326 = false;
							return;
						}
					}
			}
		}

		for (var12 = anInt312; var12 < anInt303; ++var12) {
			var8 = aClass131_Sub12ArrayArrayArray308[var12];

			for (var15 = -25; var15 <= 0; ++var15) {
				var13 = anInt350 + var15;
				var9 = anInt350 - var15;
				if ((var13 >= anInt316) || (var9 < anInt317))
					for (var14 = -25; var14 <= 0; ++var14) {
						var10 = anInt321 + var14;
						var16 = anInt321 - var14;
						if (var13 >= anInt316) {
							if (var10 >= anInt318) {
								var11 = var8[var13][var10];
								if ((var11 != null) && var11.aBool1090)
									method173(var11, false);
							}

							if (var16 < anInt330) {
								var11 = var8[var13][var16];
								if ((var11 != null) && var11.aBool1090)
									method173(var11, false);
							}
						}

						if (var9 < anInt317) {
							if (var10 >= anInt318) {
								var11 = var8[var9][var10];
								if ((var11 != null) && var11.aBool1090)
									method173(var11, false);
							}

							if (var16 < anInt330) {
								var11 = var8[var9][var16];
								if ((var11 != null) && var11.aBool1090)
									method173(var11, false);
							}
						}

						if (anInt313 == 0) {
							aBool326 = false;
							return;
						}
					}
			}
		}

		aBool326 = false;
	}

	public void method185(final int var1, final int var2, final int var3, final int var4,
			final Class131_Sub20_Sub19 var5, final Class131_Sub20_Sub19 var6, final int var7, final int var8,
			final int var9, final int var10) {
		if ((var5 != null) || (var6 != null)) {
			final Class25 var11 = new Class25();
			var11.anInt223 = var9;
			var11.anInt222 = var10;
			var11.anInt214 = (var2 * 128) + 64;
			var11.anInt215 = (var3 * 128) + 64;
			var11.anInt219 = var4;
			var11.aClass131_Sub20_Sub19_218 = var5;
			var11.aClass131_Sub20_Sub19_220 = var6;
			var11.anInt216 = var7;
			var11.anInt217 = var8;

			for (int var12 = var1; var12 >= 0; --var12)
				if (aClass131_Sub12ArrayArrayArray308[var12][var2][var3] == null)
					aClass131_Sub12ArrayArrayArray308[var12][var2][var3] = new Class131_Sub12(var12, var2, var3);

			aClass131_Sub12ArrayArrayArray308[var1][var2][var3].aClass25_1081 = var11;
		}
	}

	public void method186(final int var1, final int var2, final int var3, final int var4,
			final Class131_Sub20_Sub19 var5, final Class131_Sub20_Sub19 var6, final int var7, final int var8,
			final int var9, final int var10, final int var11, final int var12) {
		if (var5 != null) {
			final Class38 var14 = new Class38();
			var14.anInt403 = var11;
			var14.anInt405 = var12;
			var14.anInt398 = (var2 * 128) + 64;
			var14.anInt397 = (var3 * 128) + 64;
			var14.anInt399 = var4;
			var14.aClass131_Sub20_Sub19_402 = var5;
			var14.aClass131_Sub20_Sub19_395 = var6;
			var14.anInt400 = var7;
			var14.anInt396 = var8;
			var14.anInt404 = var9;
			var14.anInt401 = var10;

			for (int var13 = var1; var13 >= 0; --var13)
				if (aClass131_Sub12ArrayArrayArray308[var13][var2][var3] == null)
					aClass131_Sub12ArrayArrayArray308[var13][var2][var3] = new Class131_Sub12(var13, var2, var3);

			aClass131_Sub12ArrayArrayArray308[var1][var2][var3].aClass38_1082 = var14;
		}
	}

	public int method187(final int var1, final int var2, final int var3, final int var4) {
		final Class131_Sub12 var5 = aClass131_Sub12ArrayArrayArray308[var1][var2][var3];
		if (var5 == null)
			return -1;
		else if ((var5.aClass25_1081 != null) && (var5.aClass25_1081.anInt223 == var4))
			return var5.aClass25_1081.anInt222 & 255;
		else if ((var5.aClass38_1082 != null) && (var5.aClass38_1082.anInt403 == var4))
			return var5.aClass38_1082.anInt405 & 255;
		else if ((var5.aClass22_1085 != null) && (var5.aClass22_1085.anInt204 == var4))
			return var5.aClass22_1085.anInt203 & 255;
		else {
			for (int var6 = 0; var6 < var5.anInt1075; ++var6)
				if (var5.aClass47Array1086[var6].anInt465 == var4)
					return var5.aClass47Array1086[var6].anInt466 & 255;

			return -1;
		}
	}

	public static void method188(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6, final int var7) {
		final Class58 var8 = new Class58();
		var8.anInt562 = var2 / 128;
		var8.anInt564 = var3 / 128;
		var8.anInt549 = var4 / 128;
		var8.anInt559 = var5 / 128;
		var8.anInt550 = var1;
		var8.anInt554 = var2;
		var8.anInt552 = var3;
		var8.anInt553 = var4;
		var8.anInt556 = var5;
		var8.anInt560 = var6;
		var8.anInt548 = var7;
		aClass58ArrayArray305[var0][anIntArray337[var0]++] = var8;
	}

	static final int method189(final int var0, int var1) {
		var1 = (var1 * (var0 & 127)) >> 7;
		if (var1 < 2)
			var1 = 2;
		else if (var1 > 126)
			var1 = 126;

		return (var0 & '\uff80') + var1;
	}

	public void method190() {
		int var1;
		int var2;
		for (var1 = 0; var1 < anInt303; ++var1)
			for (var2 = 0; var2 < anInt304; ++var2)
				for (int var3 = 0; var3 < anInt354; ++var3)
					aClass131_Sub12ArrayArrayArray308[var1][var2][var3] = null;

		for (var1 = 0; var1 < anInt336; ++var1) {
			for (var2 = 0; var2 < anIntArray337[var1]; ++var2)
				aClass58ArrayArray305[var1][var2] = null;

			anIntArray337[var1] = 0;
		}

		for (var1 = 0; var1 < anInt319; ++var1)
			aClass47Array310[var1] = null;

		anInt319 = 0;

		for (var1 = 0; var1 < aClass47Array329.length; ++var1)
			aClass47Array329[var1] = null;

	}

	public int method191(final int var1, final int var2, final int var3) {
		final Class131_Sub12 var4 = aClass131_Sub12ArrayArrayArray308[var1][var2][var3];
		if (var4 == null)
			return 0;
		else {
			for (int var5 = 0; var5 < var4.anInt1075; ++var5) {
				final Class47 var6 = var4.aClass47Array1086[var5];
				if ((((var6.anInt465 >> 29) & 3) == 2) && (var6.anInt459 == var2) && (var6.anInt454 == var3))
					return var6.anInt465;
			}

			return 0;
		}
	}

	public Class38 method192(final int var1, final int var2, final int var3) {
		final Class131_Sub12 var4 = aClass131_Sub12ArrayArrayArray308[var1][var2][var3];
		return var4 == null ? null : var4.aClass38_1082;
	}

	void method193(final Class131_Sub20_Sub19_Sub6 var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		boolean var7 = true;
		int var21 = var3;
		final int var16 = var3 + var5;
		final int var14 = var4 - 1;
		final int var15 = var4 + var6;

		for (int var8 = var2; var8 <= (var2 + 1); ++var8)
			if (var8 != anInt303) {
				for (int var9 = var21; var9 <= var16; ++var9)
					if ((var9 >= 0) && (var9 < anInt304))
						for (int var10 = var14; var10 <= var15; ++var10)
							if ((var10 >= 0) && (var10 < anInt354) && (!var7 || (var9 >= var16) || (var10 >= var15)
									|| ((var10 < var4) && (var9 != var3)))) {
								final Class131_Sub12 var11 = aClass131_Sub12ArrayArrayArray308[var8][var9][var10];
								if (var11 != null) {
									final int var13 = ((anIntArrayArrayArray306[var8][var9][var10]
											+ anIntArrayArrayArray306[var8][var9 + 1][var10]
											+ anIntArrayArrayArray306[var8][var9][var10 + 1]
											+ anIntArrayArrayArray306[var8][var9 + 1][var10 + 1]) / 4)
											- ((anIntArrayArrayArray306[var2][var3][var4]
													+ anIntArrayArrayArray306[var2][var3 + 1][var4]
													+ anIntArrayArrayArray306[var2][var3][var4 + 1]
													+ anIntArrayArrayArray306[var2][var3 + 1][var4 + 1]) / 4);
									final Class25 var18 = var11.aClass25_1081;
									if (var18 != null) {
										Class131_Sub20_Sub19_Sub6 var12;
										if (var18.aClass131_Sub20_Sub19_218 instanceof Class131_Sub20_Sub19_Sub6) {
											var12 = (Class131_Sub20_Sub19_Sub6) var18.aClass131_Sub20_Sub19_218;
											Class131_Sub20_Sub19_Sub6.method994(var1, var12,
													((var9 - var3) * 128) + ((1 - var5) * 64), var13,
													((var10 - var4) * 128) + ((1 - var6) * 64), var7);
										}

										if (var18.aClass131_Sub20_Sub19_220 instanceof Class131_Sub20_Sub19_Sub6) {
											var12 = (Class131_Sub20_Sub19_Sub6) var18.aClass131_Sub20_Sub19_220;
											Class131_Sub20_Sub19_Sub6.method994(var1, var12,
													((var9 - var3) * 128) + ((1 - var5) * 64), var13,
													((var10 - var4) * 128) + ((1 - var6) * 64), var7);
										}
									}

									for (int var17 = 0; var17 < var11.anInt1075; ++var17) {
										final Class47 var19 = var11.aClass47Array1086[var17];
										if ((var19 != null)
												&& (var19.aClass131_Sub20_Sub19_457 instanceof Class131_Sub20_Sub19_Sub6)) {
											final Class131_Sub20_Sub19_Sub6 var20 = (Class131_Sub20_Sub19_Sub6) var19.aClass131_Sub20_Sub19_457;
											final int var22 = (var19.anInt460 - var19.anInt459) + 1;
											final int var23 = (var19.anInt462 - var19.anInt454) + 1;
											Class131_Sub20_Sub19_Sub6.method994(var1, var20,
													((var19.anInt459 - var3) * 128) + ((var22 - var5) * 64), var13,
													((var19.anInt454 - var4) * 128) + ((var23 - var6) * 64), var7);
										}
									}
								}
							}

				--var21;
				var7 = false;
			}

	}

	public void method194(final int var1, final int var2, final int var3) {
		aBool326 = true;
		anInt307 = var1;
		anInt332 = var2;
		anInt333 = var3;
		anInt302 = -1;
		anInt335 = -1;
	}

	public boolean method195(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final Class131_Sub20_Sub19 var7, final int var8, final int var9, final int var10) {
		if (var7 != null) {
			final int var11 = (var2 * 128) + (64 * var5);
			final int var12 = (var3 * 128) + (64 * var6);
			return method157(var1, var2, var3, var5, var6, var11, var12, var4, var7, var8, false, var9, var10);
		} else
			return true;
	}
}
