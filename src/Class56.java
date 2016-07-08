public abstract class Class56 {
	public static String[] aStringArray506;
	public static long aLong507;
	static boolean aBool505 = false;

	abstract void method276(byte[] var1, byte var2);

	abstract byte[] method277(int var1);

	static final void method278(final Class33 var0, final Class51[] var1) {
		int var2;
		int var5;
		int var9;
		int var16;
		for (var2 = 0; var2 < 4; ++var2)
			for (var5 = 0; var5 < 104; ++var5)
				for (var9 = 0; var9 < 104; ++var9)
					if ((Class26.aByteArrayArrayArray225[var2][var5][var9] & 1) == 1) {
						var16 = var2;
						if ((Class26.aByteArrayArrayArray225[1][var5][var9] & 2) == 2)
							var16 = var2 - 1;

						if (var16 >= 0)
							var1[var16].method262(var5, var9);
					}

		Class26.anInt237 += (int) (Math.random() * 5.0D) - 2;
		if (Class26.anInt237 < -8)
			Class26.anInt237 = -8;

		if (Class26.anInt237 > 8)
			Class26.anInt237 = 8;

		Class26.anInt238 += (int) (Math.random() * 5.0D) - 2;
		if (Class26.anInt238 < -16)
			Class26.anInt238 = -16;

		if (Class26.anInt238 > 16)
			Class26.anInt238 = 16;

		int var10;
		int var12;
		int var13;
		int var14;
		int var15;
		int var17;
		int var21;
		int var22;
		int var24;
		int var25;
		for (var2 = 0; var2 < 4; ++var2) {
			final byte[][] var23 = Class139.aByteArrayArrayArray916[var2];
			var21 = (int) Math.sqrt(5100.0D);
			var22 = (var21 * 768) >> 8;

			int var27;
			int var28;
			for (var17 = 1; var17 < 103; ++var17)
				for (var10 = 1; var10 < 103; ++var10) {
					var24 = Class26.anIntArrayArrayArray239[var2][var10 + 1][var17]
							- Class26.anIntArrayArrayArray239[var2][var10 - 1][var17];
					var12 = Class26.anIntArrayArrayArray239[var2][var10][var17 + 1]
							- Class26.anIntArrayArrayArray239[var2][var10][var17 - 1];
					var13 = (int) Math.sqrt((var12 * var12) + 65536 + (var24 * var24));
					var14 = (var24 << 8) / var13;
					var15 = 65536 / var13;
					var25 = (var12 << 8) / var13;
					var28 = (((-50 * var14) + (-10 * var15) + (var25 * -50)) / var22) + 96;
					var27 = (var23[var10][1 + var17] >> 3) + (var23[var10][var17 - 1] >> 2)
							+ (var23[1 + var10][var17] >> 3) + (var23[var10 - 1][var17] >> 2)
							+ (var23[var10][var17] >> 1);
					Class28.anIntArrayArray258[var10][var17] = var28 - var27;
				}

			for (var17 = 0; var17 < 104; ++var17) {
				Class26.anIntArray242[var17] = 0;
				Class26.anIntArray230[var17] = 0;
				Class26.anIntArray228[var17] = 0;
				Class26.anIntArray231[var17] = 0;
				Class126_Sub1.anIntArray951[var17] = 0;
			}

			for (var17 = -5; var17 < 109; ++var17) {
				for (var10 = 0; var10 < 104; ++var10) {
					var24 = 5 + var17;
					if ((var24 >= 0) && (var24 < 104)) {
						var12 = Class26.aByteArrayArrayArray227[var2][var24][var10] & 255;
						if (var12 > 0) {
							var14 = var12 - 1;
							Class131_Sub20_Sub5 var36 = (Class131_Sub20_Sub5) Class131_Sub20_Sub5.aClass121_1443
									.method482(var14);
							Class131_Sub20_Sub5 var37;
							if (var36 != null)
								var37 = var36;
							else {
								final byte[] var34 = Class131_Sub20_Sub5.aClass100_1448.method402(1, var14);
								var36 = new Class131_Sub20_Sub5();
								if (var34 != null)
									var36.method721(new DataBuffer(var34), var14);

								var36.method720();
								Class131_Sub20_Sub5.aClass121_1443.method479(var36, var14);
								var37 = var36;
							}

							Class26.anIntArray242[var10] += var37.anInt1445;
							Class26.anIntArray230[var10] += var37.anInt1446;
							Class26.anIntArray228[var10] += var37.anInt1449;
							Class26.anIntArray231[var10] += var37.anInt1447;
							++Class126_Sub1.anIntArray951[var10];
						}
					}

					var12 = var17 - 5;
					if ((var12 >= 0) && (var12 < 104)) {
						var13 = Class26.aByteArrayArrayArray227[var2][var12][var10] & 255;
						if (var13 > 0) {
							var15 = var13 - 1;
							Class131_Sub20_Sub5 var57 = (Class131_Sub20_Sub5) Class131_Sub20_Sub5.aClass121_1443
									.method482(var15);
							Class131_Sub20_Sub5 var35;
							if (null != var57)
								var35 = var57;
							else {
								final byte[] var40 = Class131_Sub20_Sub5.aClass100_1448.method402(1, var15);
								var57 = new Class131_Sub20_Sub5();
								if (null != var40)
									var57.method721(new DataBuffer(var40), var15);

								var57.method720();
								Class131_Sub20_Sub5.aClass121_1443.method479(var57, var15);
								var35 = var57;
							}

							Class26.anIntArray242[var10] -= var35.anInt1445;
							Class26.anIntArray230[var10] -= var35.anInt1446;
							Class26.anIntArray228[var10] -= var35.anInt1449;
							Class26.anIntArray231[var10] -= var35.anInt1447;
							--Class126_Sub1.anIntArray951[var10];
						}
					}
				}

				if ((var17 >= 1) && (var17 < 103)) {
					var10 = 0;
					var24 = 0;
					var12 = 0;
					var13 = 0;
					var14 = 0;

					for (var15 = -5; var15 < 109; ++var15) {
						var25 = var15 + 5;
						if ((var25 >= 0) && (var25 < 104)) {
							var10 += Class26.anIntArray242[var25];
							var24 += Class26.anIntArray230[var25];
							var12 += Class26.anIntArray228[var25];
							var13 += Class26.anIntArray231[var25];
							var14 += Class126_Sub1.anIntArray951[var25];
						}

						var28 = var15 - 5;
						if ((var28 >= 0) && (var28 < 104)) {
							var10 -= Class26.anIntArray242[var28];
							var24 -= Class26.anIntArray230[var28];
							var12 -= Class26.anIntArray228[var28];
							var13 -= Class26.anIntArray231[var28];
							var14 -= Class126_Sub1.anIntArray951[var28];
						}

						if ((var15 >= 1) && (var15 < 103)
								&& (!client.aBool2033 || ((Class26.aByteArrayArrayArray225[0][var17][var15] & 2) != 0)
										|| ((Class26.aByteArrayArrayArray225[var2][var17][var15] & 16) == 0))) {
							if (var2 < Class26.anInt226)
								Class26.anInt226 = var2;

							var27 = Class26.aByteArrayArrayArray227[var2][var17][var15] & 255;
							final int var20 = Class136.aByteArrayArrayArray907[var2][var17][var15] & 255;
							if ((var27 > 0) || (var20 > 0)) {
								final int var42 = Class26.anIntArrayArrayArray239[var2][var17][var15];
								final int var43 = Class26.anIntArrayArrayArray239[var2][1 + var17][var15];
								final int var44 = Class26.anIntArrayArrayArray239[var2][1 + var17][1 + var15];
								final int var45 = Class26.anIntArrayArrayArray239[var2][var17][1 + var15];
								final int var51 = Class28.anIntArrayArray258[var17][var15];
								final int var49 = Class28.anIntArrayArray258[var17 + 1][var15];
								final int var46 = Class28.anIntArrayArray258[1 + var17][var15 + 1];
								final int var52 = Class28.anIntArrayArray258[var17][1 + var15];
								int var48 = -1;
								int var18 = -1;
								int var19;
								int var30;
								int var41;
								if (var27 > 0) {
									var30 = (256 * var10) / var13;
									var41 = var24 / var14;
									var19 = var12 / var14;
									var48 = Class83.method364(var30, var41, var19);
									var30 = (var30 + Class26.anInt237) & 255;
									var19 += Class26.anInt238;
									if (var19 < 0)
										var19 = 0;
									else if (var19 > 255)
										var19 = 255;

									var18 = Class83.method364(var30, var41, var19);
								}

								Class131_Sub20_Sub4 var38;
								if (var2 > 0) {
									boolean var56 = true;
									if ((var27 == 0) && (Class26.aByteArrayArrayArray224[var2][var17][var15] != 0))
										var56 = false;

									if (var20 > 0) {
										var19 = var20 - 1;
										var38 = (Class131_Sub20_Sub4) Class131_Sub20_Sub4.aClass121_1431
												.method482(var19);
										Class131_Sub20_Sub4 var39;
										if (var38 != null)
											var39 = var38;
										else {
											final byte[] var50 = Class131_Sub20_Sub4.aClass100_1440.method402(4, var19);
											var38 = new Class131_Sub20_Sub4();
											if (var50 != null)
												var38.method710(new DataBuffer(var50), var19);

											var38.method714();
											Class131_Sub20_Sub4.aClass121_1431.method479(var38, var19);
											var39 = var38;
										}

										if (!var39.aBool1434)
											var56 = false;
									}

									if (var56 && (var42 == var43) && (var44 == var42) && (var42 == var45))
										Class48.anIntArrayArrayArray477[var2][var17][var15] |= 2340;
								}

								var30 = 0;
								if (var18 != -1)
									var30 = Class131_Sub20_Sub17_Sub1.anIntArray1783[Class17.method77(var18, 96)];

								if (var20 == 0)
									var0.method150(var2, var17, var15, 0, 0, -1, var42, var43, var44, var45,
											Class17.method77(var48, var51), Class17.method77(var48, var49),
											Class17.method77(var48, var46), Class17.method77(var48, var52), 0, 0, 0, 0,
											var30, 0);
								else {
									var41 = 1 + Class26.aByteArrayArrayArray224[var2][var17][var15];
									final byte var55 = Class26.aByteArrayArrayArray229[var2][var17][var15];
									final int var26 = var20 - 1;
									Class131_Sub20_Sub4 var3 = (Class131_Sub20_Sub4) Class131_Sub20_Sub4.aClass121_1431
											.method482(var26);
									if (var3 != null)
										var38 = var3;
									else {
										final byte[] var29 = Class131_Sub20_Sub4.aClass100_1440.method402(4, var26);
										var3 = new Class131_Sub20_Sub4();
										if (null != var29)
											var3.method710(new DataBuffer(var29), var26);

										var3.method714();
										Class131_Sub20_Sub4.aClass121_1431.method479(var3, var26);
										var38 = var3;
									}

									int var33 = var38.anInt1433;
									int var31;
									int var32;
									int var47;
									int var53;
									if (var33 >= 0) {
										var31 = Class131_Sub20_Sub17_Sub1.anInterface3_1784.method7(var33, 1882836254);
										var53 = -1;
									} else if (var38.anInt1430 == 16711935) {
										var53 = -2;
										var33 = -1;
										var31 = -2;
									} else {
										var53 = Class83.method364(var38.anInt1435, var38.anInt1436, var38.anInt1437);
										var32 = (var38.anInt1435 + Class26.anInt237) & 255;
										var47 = var38.anInt1437 + Class26.anInt238;
										if (var47 < 0)
											var47 = 0;
										else if (var47 > 255)
											var47 = 255;

										var31 = Class83.method364(var32, var38.anInt1436, var47);
									}

									var32 = 0;
									if (var31 != -2)
										var32 = Class131_Sub20_Sub17_Sub1.anIntArray1783[Class16_Sub1.method548(var31,
												96)];

									if (var38.anInt1441 != -1) {
										var47 = (var38.anInt1438 + Class26.anInt237) & 255;
										int var4 = var38.anInt1439 + Class26.anInt238;
										if (var4 < 0)
											var4 = 0;
										else if (var4 > 255)
											var4 = 255;

										var31 = Class83.method364(var47, var38.anInt1432, var4);
										var32 = Class131_Sub20_Sub17_Sub1.anIntArray1783[Class16_Sub1.method548(var31,
												96)];
									}

									var0.method150(var2, var17, var15, var41, var55, var33, var42, var43, var44, var45,
											Class17.method77(var48, var51), Class17.method77(var48, var49),
											Class17.method77(var48, var46), Class17.method77(var48, var52),
											Class16_Sub1.method548(var53, var51), Class16_Sub1.method548(var53, var49),
											Class16_Sub1.method548(var53, var46), Class16_Sub1.method548(var53, var52),
											var30, var32);
								}
							}
						}
					}
				}
			}

			for (var17 = 1; var17 < 103; ++var17)
				for (var10 = 1; var10 < 103; ++var10) {
					if ((Class26.aByteArrayArrayArray225[var2][var10][var17] & 8) != 0)
						var15 = 0;
					else if ((var2 > 0) && ((Class26.aByteArrayArrayArray225[1][var10][var17] & 2) != 0))
						var15 = var2 - 1;
					else
						var15 = var2;

					var0.method182(var2, var10, var17, var15);
				}

			Class26.aByteArrayArrayArray227[var2] = null;
			Class136.aByteArrayArrayArray907[var2] = null;
			Class26.aByteArrayArrayArray224[var2] = null;
			Class26.aByteArrayArrayArray229[var2] = null;
			Class139.aByteArrayArrayArray916[var2] = null;
		}

		var0.method168(-50, -10, -50);

		for (var2 = 0; var2 < 104; ++var2)
			for (var5 = 0; var5 < 104; ++var5)
				if ((Class26.aByteArrayArrayArray225[1][var2][var5] & 2) == 2)
					var0.method147(var2, var5);

		var2 = 1;
		var5 = 2;
		var9 = 4;

		for (var16 = 0; var16 < 4; ++var16) {
			if (var16 > 0) {
				var2 <<= 3;
				var5 <<= 3;
				var9 <<= 3;
			}

			for (int var6 = 0; var6 <= var16; ++var6)
				for (int var8 = 0; var8 <= 104; ++var8)
					for (int var7 = 0; var7 <= 104; ++var7) {
						short var54;
						if ((Class48.anIntArrayArrayArray477[var6][var7][var8] & var2) != 0) {
							var21 = var8;
							var22 = var8;
							var17 = var6;

							for (var10 = var6; (var21 > 0)
									&& ((Class48.anIntArrayArrayArray477[var6][var7][var21 - 1] & var2) != 0); --var21)
								;

							while ((var22 < 104)
									&& ((Class48.anIntArrayArrayArray477[var6][var7][1 + var22] & var2) != 0))
								++var22;

							label535: while (var17 > 0) {
								for (var24 = var21; var24 <= var22; ++var24)
									if ((Class48.anIntArrayArrayArray477[var17 - 1][var7][var24] & var2) == 0)
										break label535;

								--var17;
							}

							label524: while (var10 < var16) {
								for (var24 = var21; var24 <= var22; ++var24)
									if ((Class48.anIntArrayArrayArray477[1 + var10][var7][var24] & var2) == 0)
										break label524;

								++var10;
							}

							var24 = (1 + (var22 - var21)) * ((1 + var10) - var17);
							if (var24 >= 8) {
								var54 = 240;
								var13 = Class26.anIntArrayArrayArray239[var10][var7][var21] - var54;
								var14 = Class26.anIntArrayArrayArray239[var17][var7][var21];
								Class33.method188(var16, 1, var7 * 128, 128 * var7, var21 * 128, (128 * var22) + 128,
										var13, var14);

								for (var15 = var17; var15 <= var10; ++var15)
									for (var25 = var21; var25 <= var22; ++var25)
										Class48.anIntArrayArrayArray477[var15][var7][var25] &= ~var2;
							}
						}

						if ((Class48.anIntArrayArrayArray477[var6][var7][var8] & var5) != 0) {
							var21 = var7;
							var22 = var7;
							var17 = var6;

							for (var10 = var6; (var21 > 0)
									&& ((Class48.anIntArrayArrayArray477[var6][var21 - 1][var8] & var5) != 0); --var21)
								;

							while ((var22 < 104)
									&& ((Class48.anIntArrayArrayArray477[var6][1 + var22][var8] & var5) != 0))
								++var22;

							label588: while (var17 > 0) {
								for (var24 = var21; var24 <= var22; ++var24)
									if ((Class48.anIntArrayArrayArray477[var17 - 1][var24][var8] & var5) == 0)
										break label588;

								--var17;
							}

							label577: while (var10 < var16) {
								for (var24 = var21; var24 <= var22; ++var24)
									if ((Class48.anIntArrayArrayArray477[1 + var10][var24][var8] & var5) == 0)
										break label577;

								++var10;
							}

							var24 = ((var10 + 1) - var17) * ((var22 - var21) + 1);
							if (var24 >= 8) {
								var54 = 240;
								var13 = Class26.anIntArrayArrayArray239[var10][var21][var8] - var54;
								var14 = Class26.anIntArrayArrayArray239[var17][var21][var8];
								Class33.method188(var16, 2, 128 * var21, (var22 * 128) + 128, var8 * 128, var8 * 128,
										var13, var14);

								for (var15 = var17; var15 <= var10; ++var15)
									for (var25 = var21; var25 <= var22; ++var25)
										Class48.anIntArrayArrayArray477[var15][var25][var8] &= ~var5;
							}
						}

						if ((Class48.anIntArrayArrayArray477[var6][var7][var8] & var9) != 0) {
							var21 = var7;
							var22 = var7;
							var17 = var8;

							for (var10 = var8; (var17 > 0)
									&& ((Class48.anIntArrayArrayArray477[var6][var7][var17 - 1] & var9) != 0); --var17)
								;

							while ((var10 < 104)
									&& ((Class48.anIntArrayArrayArray477[var6][var7][1 + var10] & var9) != 0))
								++var10;

							label641: while (var21 > 0) {
								for (var24 = var17; var24 <= var10; ++var24)
									if ((Class48.anIntArrayArrayArray477[var6][var21 - 1][var24] & var9) == 0)
										break label641;

								--var21;
							}

							label630: while (var22 < 104) {
								for (var24 = var17; var24 <= var10; ++var24)
									if ((Class48.anIntArrayArrayArray477[var6][1 + var22][var24] & var9) == 0)
										break label630;

								++var22;
							}

							if (((1 + (var22 - var21)) * (1 + (var10 - var17))) >= 4) {
								var24 = Class26.anIntArrayArrayArray239[var6][var21][var17];
								Class33.method188(var16, 4, var21 * 128, 128 + (var22 * 128), var17 * 128,
										(128 * var10) + 128, var24, var24);

								for (var12 = var21; var12 <= var22; ++var12)
									for (var13 = var17; var13 <= var10; ++var13)
										Class48.anIntArrayArrayArray477[var6][var12][var13] &= ~var9;
							}
						}
					}
		}

	}
}
