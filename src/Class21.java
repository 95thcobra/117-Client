public class Class21 {
	static Class131_Sub18 aClass131_Sub18_194;
	static Class131_Sub18 aClass131_Sub18_199;
	static String aString200;
	Class114 aClass114_198 = new Class114(256);
	Class114 aClass114_196 = new Class114(256);
	Class100 aClass100_197;
	Class100 aClass100_195;

	Class131_Sub2_Sub1 method100(final int var1, final int var2, final int[] var3) {
		int var4 = var2 ^ (((var1 << 4) & '\uffff') | (var1 >>> 12));
		var4 |= var1 << 16;
		final long var7 = var4;
		Class131_Sub2_Sub1 var6 = (Class131_Sub2_Sub1) aClass114_196.method457(var7);
		if (var6 != null)
			return var6;
		else if ((null != var3) && (var3[0] <= 0))
			return null;
		else {
			final Class8 var5 = Class8.method41(aClass100_197, var1, var2);
			if (null == var5)
				return null;
			else {
				var6 = var5.method38();
				aClass114_196.method461(var6, var7);
				if (var3 != null)
					var3[0] -= var6.aByteArray1597.length;

				return var6;
			}
		}
	}

	public Class131_Sub2_Sub1 method101(final int var1, final int[] var2) {
		if (aClass100_197.method408() != 1) {
			if (aClass100_197.method417(var1) == 1)
				return method100(var1, 0, var2);
			else
				throw new RuntimeException();
		} else
			return method100(0, var1, var2);
	}

	Class131_Sub2_Sub1 method102(final int var1, final int var2, final int[] var3) {
		int var4 = var2 ^ (((var1 << 4) & '\uffff') | (var1 >>> 12));
		var4 |= var1 << 16;
		final long var6 = var4 ^ 4294967296L;
		Class131_Sub2_Sub1 var8 = (Class131_Sub2_Sub1) aClass114_196.method457(var6);
		if (var8 == null) {
			if ((var3 != null) && (var3[0] <= 0))
				return null;
			else {
				Class131_Sub1 var5 = (Class131_Sub1) aClass114_198.method457(var6);
				if (var5 == null) {
					var5 = Class131_Sub1.method531(aClass100_195, var1, var2);
					if (var5 == null)
						return null;

					aClass114_198.method461(var5, var6);
				}

				var8 = var5.method534(var3);
				if (null == var8)
					return null;
				else {
					var5.method501();
					aClass114_196.method461(var8, var6);
					return var8;
				}
			}
		} else
			return var8;
	}

	public Class131_Sub2_Sub1 method103(final int var1, final int[] var2) {
		if (aClass100_195.method408() == 1)
			return method102(0, var1, var2);
		else if (aClass100_195.method417(var1) == 1)
			return method102(var1, 0, var2);
		else
			throw new RuntimeException();
	}

	public Class21(final Class100 var1, final Class100 var2) {
		aClass100_197 = var1;
		aClass100_195 = var2;
	}

	public static int method104(final int var0, final int var1, final int var2, final Class63 var3, final Class51 var4,
			final boolean var5, final int[] var6, final int[] var7) {
		int var9;
		for (int var8 = 0; var8 < 128; ++var8)
			for (var9 = 0; var9 < 128; ++var9) {
				Class67.anIntArrayArray598[var8][var9] = 0;
				Class67.anIntArrayArray599[var8][var9] = 99999999;
			}

		byte var10;
		int var11;
		int var12;
		int var13;
		byte var14;
		int[][] var15;
		int var16;
		int var17;
		int var18;
		byte var19;
		int var20;
		int var21;
		int var22;
		boolean var28;
		boolean var29;
		int var30;
		int var31;
		int var32;
		if (var2 == 1) {
			var12 = var0;
			var13 = var1;
			var14 = 64;
			var19 = 64;
			var21 = var0 - var14;
			var20 = var1 - var19;
			Class67.anIntArrayArray598[var14][var19] = 99;
			Class67.anIntArrayArray599[var14][var19] = 0;
			var10 = 0;
			var11 = 0;
			Class67.anIntArray603[var10] = var0;
			var30 = var10 + 1;
			Class67.anIntArray597[var10] = var1;
			var15 = var4.anIntArrayArray501;

			while (true) {
				if (var11 == var30) {
					Class67.anInt600 = var12;
					Class67.anInt602 = var13;
					var29 = false;
					break;
				}

				var12 = Class67.anIntArray603[var11];
				var13 = Class67.anIntArray597[var11];
				var11 = (1 + var11) & 4095;
				var31 = var12 - var21;
				var32 = var13 - var20;
				var16 = var12 - var4.anInt498;
				var18 = var13 - var4.anInt499;
				if (var3.method302(1, var12, var13, var4, (byte) -45)) {
					Class67.anInt600 = var12;
					Class67.anInt602 = var13;
					var29 = true;
					break;
				}

				var22 = Class67.anIntArrayArray599[var31][var32] + 1;
				if ((var31 > 0) && (Class67.anIntArrayArray598[var31 - 1][var32] == 0)
						&& ((var15[var16 - 1][var18] & 19136776) == 0)) {
					Class67.anIntArray603[var30] = var12 - 1;
					Class67.anIntArray597[var30] = var13;
					var30 = (var30 + 1) & 4095;
					Class67.anIntArrayArray598[var31 - 1][var32] = 2;
					Class67.anIntArrayArray599[var31 - 1][var32] = var22;
				}

				if ((var31 < 127) && (Class67.anIntArrayArray598[1 + var31][var32] == 0)
						&& ((var15[1 + var16][var18] & 19136896) == 0)) {
					Class67.anIntArray603[var30] = var12 + 1;
					Class67.anIntArray597[var30] = var13;
					var30 = (1 + var30) & 4095;
					Class67.anIntArrayArray598[1 + var31][var32] = 8;
					Class67.anIntArrayArray599[1 + var31][var32] = var22;
				}

				if ((var32 > 0) && (Class67.anIntArrayArray598[var31][var32 - 1] == 0)
						&& ((var15[var16][var18 - 1] & 19136770) == 0)) {
					Class67.anIntArray603[var30] = var12;
					Class67.anIntArray597[var30] = var13 - 1;
					var30 = (var30 + 1) & 4095;
					Class67.anIntArrayArray598[var31][var32 - 1] = 1;
					Class67.anIntArrayArray599[var31][var32 - 1] = var22;
				}

				if ((var32 < 127) && (Class67.anIntArrayArray598[var31][var32 + 1] == 0)
						&& ((var15[var16][1 + var18] & 19136800) == 0)) {
					Class67.anIntArray603[var30] = var12;
					Class67.anIntArray597[var30] = 1 + var13;
					var30 = (var30 + 1) & 4095;
					Class67.anIntArrayArray598[var31][1 + var32] = 4;
					Class67.anIntArrayArray599[var31][1 + var32] = var22;
				}

				if ((var31 > 0) && (var32 > 0) && (Class67.anIntArrayArray598[var31 - 1][var32 - 1] == 0)
						&& ((var15[var16 - 1][var18 - 1] & 19136782) == 0)
						&& ((var15[var16 - 1][var18] & 19136776) == 0) && ((var15[var16][var18 - 1] & 19136770) == 0)) {
					Class67.anIntArray603[var30] = var12 - 1;
					Class67.anIntArray597[var30] = var13 - 1;
					var30 = (1 + var30) & 4095;
					Class67.anIntArrayArray598[var31 - 1][var32 - 1] = 3;
					Class67.anIntArrayArray599[var31 - 1][var32 - 1] = var22;
				}

				if ((var31 < 127) && (var32 > 0) && (Class67.anIntArrayArray598[1 + var31][var32 - 1] == 0)
						&& ((var15[var16 + 1][var18 - 1] & 19136899) == 0)
						&& ((var15[1 + var16][var18] & 19136896) == 0) && ((var15[var16][var18 - 1] & 19136770) == 0)) {
					Class67.anIntArray603[var30] = var12 + 1;
					Class67.anIntArray597[var30] = var13 - 1;
					var30 = (var30 + 1) & 4095;
					Class67.anIntArrayArray598[1 + var31][var32 - 1] = 9;
					Class67.anIntArrayArray599[1 + var31][var32 - 1] = var22;
				}

				if ((var31 > 0) && (var32 < 127) && (Class67.anIntArrayArray598[var31 - 1][var32 + 1] == 0)
						&& ((var15[var16 - 1][var18 + 1] & 19136824) == 0)
						&& ((var15[var16 - 1][var18] & 19136776) == 0) && ((var15[var16][var18 + 1] & 19136800) == 0)) {
					Class67.anIntArray603[var30] = var12 - 1;
					Class67.anIntArray597[var30] = 1 + var13;
					var30 = (var30 + 1) & 4095;
					Class67.anIntArrayArray598[var31 - 1][1 + var32] = 6;
					Class67.anIntArrayArray599[var31 - 1][var32 + 1] = var22;
				}

				if ((var31 < 127) && (var32 < 127) && (Class67.anIntArrayArray598[var31 + 1][1 + var32] == 0)
						&& ((var15[var16 + 1][1 + var18] & 19136992) == 0)
						&& ((var15[1 + var16][var18] & 19136896) == 0) && ((var15[var16][var18 + 1] & 19136800) == 0)) {
					Class67.anIntArray603[var30] = var12 + 1;
					Class67.anIntArray597[var30] = var13 + 1;
					var30 = (1 + var30) & 4095;
					Class67.anIntArrayArray598[1 + var31][1 + var32] = 12;
					Class67.anIntArrayArray599[var31 + 1][1 + var32] = var22;
				}
			}

			var28 = var29;
		} else if (var2 == 2) {
			var12 = var0;
			var13 = var1;
			var14 = 64;
			var19 = 64;
			var21 = var0 - var14;
			var20 = var1 - var19;
			Class67.anIntArrayArray598[var14][var19] = 99;
			Class67.anIntArrayArray599[var14][var19] = 0;
			var10 = 0;
			var11 = 0;
			Class67.anIntArray603[var10] = var0;
			var30 = var10 + 1;
			Class67.anIntArray597[var10] = var1;
			var15 = var4.anIntArrayArray501;

			while (true) {
				if (var11 == var30) {
					Class67.anInt600 = var12;
					Class67.anInt602 = var13;
					var29 = false;
					break;
				}

				var12 = Class67.anIntArray603[var11];
				var13 = Class67.anIntArray597[var11];
				var11 = (var11 + 1) & 4095;
				var31 = var12 - var21;
				var32 = var13 - var20;
				var16 = var12 - var4.anInt498;
				var18 = var13 - var4.anInt499;
				if (var3.method302(2, var12, var13, var4, (byte) -13)) {
					Class67.anInt600 = var12;
					Class67.anInt602 = var13;
					var29 = true;
					break;
				}

				var22 = Class67.anIntArrayArray599[var31][var32] + 1;
				if ((var31 > 0) && (Class67.anIntArrayArray598[var31 - 1][var32] == 0)
						&& ((var15[var16 - 1][var18] & 19136782) == 0)
						&& ((var15[var16 - 1][1 + var18] & 19136824) == 0)) {
					Class67.anIntArray603[var30] = var12 - 1;
					Class67.anIntArray597[var30] = var13;
					var30 = (1 + var30) & 4095;
					Class67.anIntArrayArray598[var31 - 1][var32] = 2;
					Class67.anIntArrayArray599[var31 - 1][var32] = var22;
				}

				if ((var31 < 126) && (Class67.anIntArrayArray598[1 + var31][var32] == 0)
						&& ((var15[var16 + 2][var18] & 19136899) == 0)
						&& ((var15[2 + var16][1 + var18] & 19136992) == 0)) {
					Class67.anIntArray603[var30] = var12 + 1;
					Class67.anIntArray597[var30] = var13;
					var30 = (1 + var30) & 4095;
					Class67.anIntArrayArray598[var31 + 1][var32] = 8;
					Class67.anIntArrayArray599[var31 + 1][var32] = var22;
				}

				if ((var32 > 0) && (Class67.anIntArrayArray598[var31][var32 - 1] == 0)
						&& ((var15[var16][var18 - 1] & 19136782) == 0)
						&& ((var15[var16 + 1][var18 - 1] & 19136899) == 0)) {
					Class67.anIntArray603[var30] = var12;
					Class67.anIntArray597[var30] = var13 - 1;
					var30 = (1 + var30) & 4095;
					Class67.anIntArrayArray598[var31][var32 - 1] = 1;
					Class67.anIntArrayArray599[var31][var32 - 1] = var22;
				}

				if ((var32 < 126) && (Class67.anIntArrayArray598[var31][var32 + 1] == 0)
						&& ((var15[var16][var18 + 2] & 19136824) == 0)
						&& ((var15[1 + var16][2 + var18] & 19136992) == 0)) {
					Class67.anIntArray603[var30] = var12;
					Class67.anIntArray597[var30] = 1 + var13;
					var30 = (var30 + 1) & 4095;
					Class67.anIntArrayArray598[var31][var32 + 1] = 4;
					Class67.anIntArrayArray599[var31][1 + var32] = var22;
				}

				if ((var31 > 0) && (var32 > 0) && (Class67.anIntArrayArray598[var31 - 1][var32 - 1] == 0)
						&& ((var15[var16 - 1][var18] & 19136830) == 0)
						&& ((var15[var16 - 1][var18 - 1] & 19136782) == 0)
						&& ((var15[var16][var18 - 1] & 19136911) == 0)) {
					Class67.anIntArray603[var30] = var12 - 1;
					Class67.anIntArray597[var30] = var13 - 1;
					var30 = (var30 + 1) & 4095;
					Class67.anIntArrayArray598[var31 - 1][var32 - 1] = 3;
					Class67.anIntArrayArray599[var31 - 1][var32 - 1] = var22;
				}

				if ((var31 < 126) && (var32 > 0) && (Class67.anIntArrayArray598[var31 + 1][var32 - 1] == 0)
						&& ((var15[1 + var16][var18 - 1] & 19136911) == 0)
						&& ((var15[2 + var16][var18 - 1] & 19136899) == 0)
						&& ((var15[2 + var16][var18] & 19136995) == 0)) {
					Class67.anIntArray603[var30] = var12 + 1;
					Class67.anIntArray597[var30] = var13 - 1;
					var30 = (var30 + 1) & 4095;
					Class67.anIntArrayArray598[1 + var31][var32 - 1] = 9;
					Class67.anIntArrayArray599[var31 + 1][var32 - 1] = var22;
				}

				if ((var31 > 0) && (var32 < 126) && (Class67.anIntArrayArray598[var31 - 1][var32 + 1] == 0)
						&& ((var15[var16 - 1][var18 + 1] & 19136830) == 0)
						&& ((var15[var16 - 1][var18 + 2] & 19136824) == 0)
						&& ((var15[var16][2 + var18] & 19137016) == 0)) {
					Class67.anIntArray603[var30] = var12 - 1;
					Class67.anIntArray597[var30] = 1 + var13;
					var30 = (var30 + 1) & 4095;
					Class67.anIntArrayArray598[var31 - 1][var32 + 1] = 6;
					Class67.anIntArrayArray599[var31 - 1][var32 + 1] = var22;
				}

				if ((var31 < 126) && (var32 < 126) && (Class67.anIntArrayArray598[1 + var31][var32 + 1] == 0)
						&& ((var15[1 + var16][2 + var18] & 19137016) == 0)
						&& ((var15[var16 + 2][2 + var18] & 19136992) == 0)
						&& ((var15[2 + var16][1 + var18] & 19136995) == 0)) {
					Class67.anIntArray603[var30] = var12 + 1;
					Class67.anIntArray597[var30] = 1 + var13;
					var30 = (var30 + 1) & 4095;
					Class67.anIntArrayArray598[var31 + 1][1 + var32] = 12;
					Class67.anIntArrayArray599[1 + var31][1 + var32] = var22;
				}
			}

			var28 = var29;
		} else {
			var12 = var0;
			var13 = var1;
			var14 = 64;
			var19 = 64;
			var21 = var0 - var14;
			var20 = var1 - var19;
			Class67.anIntArrayArray598[var14][var19] = 99;
			Class67.anIntArrayArray599[var14][var19] = 0;
			var10 = 0;
			var11 = 0;
			Class67.anIntArray603[var10] = var0;
			var30 = var10 + 1;
			Class67.anIntArray597[var10] = var1;
			var15 = var4.anIntArrayArray501;

			label774: while (true)
				label772: while (true) {
					do
						do
							do
								label749: do {
									if (var11 == var30) {
										Class67.anInt600 = var12;
										Class67.anInt602 = var13;
										var29 = false;
										break label774;
									}

									var12 = Class67.anIntArray603[var11];
									var13 = Class67.anIntArray597[var11];
									var11 = (1 + var11) & 4095;
									var31 = var12 - var21;
									var32 = var13 - var20;
									var16 = var12 - var4.anInt498;
									var18 = var13 - var4.anInt499;
									if (var3.method302(var2, var12, var13, var4, (byte) 98)) {
										Class67.anInt600 = var12;
										Class67.anInt602 = var13;
										var29 = true;
										break label774;
									}

									var22 = 1 + Class67.anIntArrayArray599[var31][var32];
									if ((var31 > 0) && (Class67.anIntArrayArray598[var31 - 1][var32] == 0)
											&& ((var15[var16 - 1][var18] & 19136782) == 0)
											&& ((var15[var16 - 1][(var2 + var18) - 1] & 19136824) == 0)) {
										var17 = 1;

										while (true) {
											if (var17 >= (var2 - 1)) {
												Class67.anIntArray603[var30] = var12 - 1;
												Class67.anIntArray597[var30] = var13;
												var30 = (var30 + 1) & 4095;
												Class67.anIntArrayArray598[var31 - 1][var32] = 2;
												Class67.anIntArrayArray599[var31 - 1][var32] = var22;
												break;
											}

											if ((var15[var16 - 1][var17 + var18] & 19136830) != 0)
												break;

											++var17;
										}
									}

									if ((var31 < (128 - var2)) && (Class67.anIntArrayArray598[var31 + 1][var32] == 0)
											&& ((var15[var2 + var16][var18] & 19136899) == 0)
											&& ((var15[var2 + var16][(var2 + var18) - 1] & 19136992) == 0)) {
										var17 = 1;

										while (true) {
											if (var17 >= (var2 - 1)) {
												Class67.anIntArray603[var30] = 1 + var12;
												Class67.anIntArray597[var30] = var13;
												var30 = (1 + var30) & 4095;
												Class67.anIntArrayArray598[var31 + 1][var32] = 8;
												Class67.anIntArrayArray599[1 + var31][var32] = var22;
												break;
											}

											if ((var15[var2 + var16][var17 + var18] & 19136995) != 0)
												break;

											++var17;
										}
									}

									if ((var32 > 0) && (Class67.anIntArrayArray598[var31][var32 - 1] == 0)
											&& ((var15[var16][var18 - 1] & 19136782) == 0)
											&& ((var15[(var2 + var16) - 1][var18 - 1] & 19136899) == 0)) {
										var17 = 1;

										while (true) {
											if (var17 >= (var2 - 1)) {
												Class67.anIntArray603[var30] = var12;
												Class67.anIntArray597[var30] = var13 - 1;
												var30 = (var30 + 1) & 4095;
												Class67.anIntArrayArray598[var31][var32 - 1] = 1;
												Class67.anIntArrayArray599[var31][var32 - 1] = var22;
												break;
											}

											if ((var15[var16 + var17][var18 - 1] & 19136911) != 0)
												break;

											++var17;
										}
									}

									if ((var32 < (128 - var2)) && (Class67.anIntArrayArray598[var31][1 + var32] == 0)
											&& ((var15[var16][var2 + var18] & 19136824) == 0)
											&& ((var15[(var2 + var16) - 1][var18 + var2] & 19136992) == 0)) {
										var17 = 1;

										while (true) {
											if (var17 >= (var2 - 1)) {
												Class67.anIntArray603[var30] = var12;
												Class67.anIntArray597[var30] = 1 + var13;
												var30 = (var30 + 1) & 4095;
												Class67.anIntArrayArray598[var31][var32 + 1] = 4;
												Class67.anIntArrayArray599[var31][var32 + 1] = var22;
												break;
											}

											if ((var15[var17 + var16][var18 + var2] & 19137016) != 0)
												break;

											++var17;
										}
									}

									if ((var31 > 0) && (var32 > 0)
											&& (Class67.anIntArrayArray598[var31 - 1][var32 - 1] == 0)
											&& ((var15[var16 - 1][var18 - 1] & 19136782) == 0)) {
										var17 = 1;

										while (true) {
											if (var17 >= var2) {
												Class67.anIntArray603[var30] = var12 - 1;
												Class67.anIntArray597[var30] = var13 - 1;
												var30 = (1 + var30) & 4095;
												Class67.anIntArrayArray598[var31 - 1][var32 - 1] = 3;
												Class67.anIntArrayArray599[var31 - 1][var32 - 1] = var22;
												break;
											}

											if (((var15[var16 - 1][var17 + (var18 - 1)] & 19136830) != 0)
													|| ((var15[var17 + (var16 - 1)][var18 - 1] & 19136911) != 0))
												break;

											++var17;
										}
									}

									if ((var31 < (128 - var2)) && (var32 > 0)
											&& (Class67.anIntArrayArray598[1 + var31][var32 - 1] == 0)
											&& ((var15[var16 + var2][var18 - 1] & 19136899) == 0)) {
										var17 = 1;

										while (true) {
											if (var17 >= var2) {
												Class67.anIntArray603[var30] = var12 + 1;
												Class67.anIntArray597[var30] = var13 - 1;
												var30 = (1 + var30) & 4095;
												Class67.anIntArrayArray598[1 + var31][var32 - 1] = 9;
												Class67.anIntArrayArray599[var31 + 1][var32 - 1] = var22;
												break;
											}

											if (((var15[var16 + var2][(var18 - 1) + var17] & 19136995) != 0)
													|| ((var15[var16 + var17][var18 - 1] & 19136911) != 0))
												break;

											++var17;
										}
									}

									if ((var31 > 0) && (var32 < (128 - var2))
											&& (Class67.anIntArrayArray598[var31 - 1][var32 + 1] == 0)
											&& ((var15[var16 - 1][var18 + var2] & 19136824) == 0)) {
										for (var17 = 1; var17 < var2; ++var17)
											if (((var15[var16 - 1][var18 + var17] & 19136830) != 0)
													|| ((var15[var17 + (var16 - 1)][var18 + var2] & 19137016) != 0))
												continue label749;

										Class67.anIntArray603[var30] = var12 - 1;
										Class67.anIntArray597[var30] = var13 + 1;
										var30 = (var30 + 1) & 4095;
										Class67.anIntArrayArray598[var31 - 1][var32 + 1] = 6;
										Class67.anIntArrayArray599[var31 - 1][1 + var32] = var22;
									}
								} while (var31 >= (128 - var2));
							while (var32 >= (128 - var2));
						while (Class67.anIntArrayArray598[var31 + 1][1 + var32] != 0);
					while ((var15[var2 + var16][var18 + var2] & 19136992) != 0);

					for (var17 = 1; var17 < var2; ++var17)
						if (((var15[var17 + var16][var18 + var2] & 19137016) != 0)
								|| ((var15[var16 + var2][var18 + var17] & 19136995) != 0))
							continue label772;

					Class67.anIntArray603[var30] = var12 + 1;
					Class67.anIntArray597[var30] = var13 + 1;
					var30 = (var30 + 1) & 4095;
					Class67.anIntArrayArray598[1 + var31][1 + var32] = 12;
					Class67.anIntArrayArray599[1 + var31][var32 + 1] = var22;
				}

			var28 = var29;
		}

		var9 = var0 - 64;
		var12 = var1 - 64;
		var13 = Class67.anInt600;
		var31 = Class67.anInt602;
		if (!var28) {
			var32 = Integer.MAX_VALUE;
			var21 = Integer.MAX_VALUE;
			final byte var33 = 10;
			var30 = var3.anInt587;
			var11 = var3.anInt583;
			final int var23 = var3.anInt586;
			var16 = var3.anInt584;

			for (var18 = var30 - var33; var18 <= (var30 + var33); ++var18)
				for (var22 = var11 - var33; var22 <= (var33 + var11); ++var22) {
					var17 = var18 - var9;
					final int var26 = var22 - var12;
					if ((var17 >= 0) && (var26 >= 0) && (var17 < 128) && (var26 < 128)
							&& (Class67.anIntArrayArray599[var17][var26] < 100)) {
						int var24 = 0;
						if (var18 < var30)
							var24 = var30 - var18;
						else if (var18 > ((var30 + var23) - 1))
							var24 = var18 - ((var30 + var23) - 1);

						int var27 = 0;
						if (var22 < var11)
							var27 = var11 - var22;
						else if (var22 > ((var11 + var16) - 1))
							var27 = var22 - ((var11 + var16) - 1);

						final int var25 = (var27 * var27) + (var24 * var24);
						if ((var25 < var32)
								|| ((var32 == var25) && (Class67.anIntArrayArray599[var17][var26] < var21))) {
							var32 = var25;
							var21 = Class67.anIntArrayArray599[var17][var26];
							var13 = var18;
							var31 = var22;
						}
					}
				}

			if (var32 == Integer.MAX_VALUE)
				return -1;
		}

		if ((var0 == var13) && (var31 == var1))
			return 0;
		else {
			var19 = 0;
			Class67.anIntArray603[var19] = var13;
			var32 = var19 + 1;
			Class67.anIntArray597[var19] = var31;

			for (var21 = var20 = Class67.anIntArrayArray598[var13 - var9][var31 - var12]; (var13 != var0)
					|| (var31 != var1); var21 = Class67.anIntArrayArray598[var13 - var9][var31 - var12]) {
				if (var21 != var20) {
					var20 = var21;
					Class67.anIntArray603[var32] = var13;
					Class67.anIntArray597[var32++] = var31;
				}

				if ((var21 & 2) != 0)
					++var13;
				else if ((var21 & 8) != 0)
					--var13;

				if ((var21 & 1) != 0)
					++var31;
				else if ((var21 & 4) != 0)
					--var31;
			}

			var30 = 0;

			while (var32-- > 0) {
				var6[var30] = Class67.anIntArray603[var32];
				var7[var30++] = Class67.anIntArray597[var32];
				if (var30 >= var6.length)
					break;
			}

			return var30;
		}
	}

	public static void method105(final Class100 var0) {
		Class133.aClass100_905 = var0;
	}
}
