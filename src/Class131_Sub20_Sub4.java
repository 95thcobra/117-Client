public class Class131_Sub20_Sub4 extends Class131_Sub20 {
	public static Class100 aClass100_1440;
	static Class131_Sub19 myMachine;
	public static Class121 aClass121_1431 = new Class121(64);
	public int anInt1430 = 0;
	public int anInt1433 = -1;
	public boolean aBool1434 = true;
	public int anInt1441 = -1;
	public int anInt1435;
	public int anInt1436;
	public int anInt1437;
	public int anInt1438;
	public int anInt1432;
	public int anInt1439;

	public void method710(final DataBuffer var1, final int var2) {
		while (true) {
			final int var3 = var1.readUByte();
			if (var3 == 0)
				return;

			method711(var1, var3);
		}
	}

	void method711(final DataBuffer var1, final int var2) {
		if (var2 == 1)
			anInt1430 = var1.method598();
		else if (var2 == 2)
			anInt1433 = var1.readUByte();
		else if (var2 == 5)
			aBool1434 = false;
		else if (var2 == 7)
			anInt1441 = var1.method598();
		else if (var2 == 8)
			;

	}

	void method712(final int var1) {
		final double var2 = ((var1 >> 16) & 255) / 256.0D;
		final double var4 = ((var1 >> 8) & 255) / 256.0D;
		final double var8 = (var1 & 255) / 256.0D;
		double var6 = var2;
		if (var4 < var2)
			var6 = var4;

		if (var8 < var6)
			var6 = var8;

		double var10 = var2;
		if (var4 > var2)
			var10 = var4;

		if (var8 > var10)
			var10 = var8;

		double var16 = 0.0D;
		double var14 = 0.0D;
		final double var12 = (var10 + var6) / 2.0D;
		if (var6 != var10) {
			if (var12 < 0.5D)
				var14 = (var10 - var6) / (var6 + var10);

			if (var12 >= 0.5D)
				var14 = (var10 - var6) / (2.0D - var10 - var6);

			if (var2 == var10)
				var16 = (var4 - var8) / (var10 - var6);
			else if (var10 == var4)
				var16 = 2.0D + ((var8 - var2) / (var10 - var6));
			else if (var8 == var10)
				var16 = ((var2 - var4) / (var10 - var6)) + 4.0D;
		}

		var16 /= 6.0D;
		anInt1435 = (int) (256.0D * var16);
		anInt1436 = (int) (256.0D * var14);
		anInt1437 = (int) (var12 * 256.0D);
		if (anInt1436 < 0)
			anInt1436 = 0;
		else if (anInt1436 > 255)
			anInt1436 = 255;

		if (anInt1437 < 0)
			anInt1437 = 0;
		else if (anInt1437 > 255)
			anInt1437 = 255;

	}

	public static void method713(final Class100 var0, final Class100 var1, final Class100 var2, final Class100 var3) {
		Class131_Sub18.aClass100_1206 = var0;
		Class131_Sub18.aClass100_1285 = var1;
		Class131_Sub18.aClass100_1151 = var2;
		Class92.aClass100_741 = var3;
		Class131_Sub18.aClass131_Sub18ArrayArray1174 = new Class131_Sub18[Class131_Sub18.aClass100_1206.method408()][];
		Class131_Sub18.aBoolArray1148 = new boolean[Class131_Sub18.aClass100_1206.method408()];
	}

	public void method714() {
		if (anInt1441 != -1) {
			method712(anInt1441);
			anInt1438 = anInt1435;
			anInt1432 = anInt1436;
			anInt1439 = anInt1437;
		}

		method712(anInt1430);
	}

	static final void method715(final Class131_Sub20_Sub19_Sub2 var0, final int var1, final int var2, final int var3) {
		if ((null != var0) && var0.method920(302923530)) {
			if (var0 instanceof Class131_Sub20_Sub19_Sub2_Sub1) {
				Class131_Sub20_Sub6 var5 = ((Class131_Sub20_Sub19_Sub2_Sub1) var0).aClass131_Sub20_Sub6_1978;
				if (null != var5.anIntArray1468)
					var5 = var5.method731();

				if (var5 == null)
					return;
			}

			final int var6 = GPI.anInt11;
			final int[] var7 = GPI.anIntArray17;
			int var4;
			if (var1 < var6) {
				var4 = 30;
				final Player var8 = (Player) var0;
				if (var8.aBool1990)
					return;

				if ((var8.anInt2000 != -1) || (var8.anInt1982 != -1)) {
					Class117.method477(var0, var0.anInt1750 + 15);
					if (client.anInt2132 > -1) {
						if (var8.anInt2000 != -1) {
							Class93.aClass131_Sub20_Sub17_Sub3Array742[var8.anInt2000]
									.method968((client.anInt2132 + var2) - 12, (var3 + client.anInt2133) - var4);
							var4 += 25;
						}

						if (var8.anInt1982 != -1) {
							Class25.aClass131_Sub20_Sub17_Sub3Array221[var8.anInt1982]
									.method968((client.anInt2132 + var2) - 12, (var3 + client.anInt2133) - var4);
							var4 += 25;
						}
					}
				}

				if ((var1 >= 0) && (client.anInt2193 == 10) && (client.anInt2097 == var7[var1])) {
					Class117.method477(var0, 15 + var0.anInt1750);
					if (client.anInt2132 > -1)
						Class42.aClass131_Sub20_Sub17_Sub3Array424[1].method968((var2 + client.anInt2132) - 12,
								(client.anInt2133 + var3) - var4);
				}
			} else {
				Class131_Sub20_Sub6 var9 = ((Class131_Sub20_Sub19_Sub2_Sub1) var0).aClass131_Sub20_Sub6_1978;
				if (null != var9.anIntArray1468)
					var9 = var9.method731();

				if ((var9.anInt1478 >= 0) && (var9.anInt1478 < Class25.aClass131_Sub20_Sub17_Sub3Array221.length)) {
					Class117.method477(var0, var0.anInt1750 + 15);
					if (client.anInt2132 > -1)
						Class25.aClass131_Sub20_Sub17_Sub3Array221[var9.anInt1478]
								.method968((var2 + client.anInt2132) - 12, (client.anInt2133 + var3) - 30);
				}

				if ((client.anInt2193 == 1) && (client.anIntArray2067[var1 - var6] == client.anInt2048)
						&& ((client.anInt2038 % 20) < 10)) {
					Class117.method477(var0, 15 + var0.anInt1750);
					if (client.anInt2132 > -1)
						Class42.aClass131_Sub20_Sub17_Sub3Array424[0].method968((client.anInt2132 + var2) - 12,
								(var3 + client.anInt2133) - 28);
				}
			}

			if ((var0.aString1705 != null)
					&& ((var1 >= var6)
							|| (!var0.aBool1717
									&& ((client.anInt2241 == 4)
											|| (!var0.aBool1716 && ((client.anInt2241 == 0) || (client.anInt2241 == 3)
													|| ((client.anInt2241 == 1) && Class41.method219(
															((Player) var0).aString2004,
															false)))))))) {
				Class117.method477(var0, var0.anInt1750);
				if ((client.anInt2132 > -1) && (client.anInt2120 < client.anInt2121)) {
					client.anIntArray2125[client.anInt2120] = GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15
							.method1037(var0.aString1705) / 2;
					client.anIntArray2124[client.anInt2120] = GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15.anInt1962;
					client.anIntArray2122[client.anInt2120] = client.anInt2132;
					client.anIntArray2264[client.anInt2120] = client.anInt2133;
					client.anIntArray2126[client.anInt2120] = var0.anInt1732;
					client.anIntArray2127[client.anInt2120] = var0.anInt1757;
					client.anIntArray2223[client.anInt2120] = var0.anInt1761;
					client.aStringArray2071[client.anInt2120] = var0.aString1705;
					++client.anInt2120;
				}
			}

			if (var0.anInt1723 > client.anInt2038) {
				Class117.method477(var0, 15 + var0.anInt1750);
				if (client.anInt2132 > -1) {
					if (var1 < var6)
						var4 = 30;
					else {
						final Class131_Sub20_Sub6 var11 = ((Class131_Sub20_Sub19_Sub2_Sub1) var0).aClass131_Sub20_Sub6_1978;
						var4 = var11.anInt1472;
					}

					int var10 = (var0.anInt1741 * var4) / var0.anInt1715;
					if (var10 > var4)
						var10 = var4;
					else if ((var10 == 0) && (var0.anInt1741 > 0))
						var10 = 1;

					Class131_Sub20_Sub17.method850((client.anInt2132 + var2) - (var4 / 2),
							(client.anInt2133 + var3) - 3, var10, 5, '\uff00');
					Class131_Sub20_Sub17.method850(((client.anInt2132 + var2) - (var4 / 2)) + var10,
							(client.anInt2133 + var3) - 3, var4 - var10, 5, 16711680);
				}
			}

			for (var4 = 0; var4 < 4; ++var4)
				if (var0.anIntArray1749[var4] > client.anInt2038) {
					Class117.method477(var0, var0.anInt1750 / 2);
					if (client.anInt2132 > -1) {
						if (var4 == 1)
							client.anInt2133 -= 20;

						if (var4 == 2) {
							client.anInt2132 -= 15;
							client.anInt2133 -= 10;
						}

						if (var4 == 3) {
							client.anInt2132 += 15;
							client.anInt2133 -= 10;
						}

						Class85.aClass131_Sub20_Sub17_Sub3Array701[var0.anIntArray1721[var4]]
								.method968((var2 + client.anInt2132) - 12, (client.anInt2133 + var3) - 12);
						NpcFlags.aClass131_Sub20_Sub17_Sub4_Sub1_48.method1056(
								Integer.toString(var0.anIntArray1720[var4]), (client.anInt2132 + var2) - 1,
								3 + client.anInt2133 + var3, 16777215, 0);
					}
				}

		}
	}

	public static Class131_Sub20_Sub17_Sub3 method716(final Class100 var0, final int var1, final int var2) {
		return Class38.method210(var0, var1, var2) ? Class16.method64() : null;
	}

	static final void method717(final Class131_Sub18 var0, final int var1, final int var2) {
		if ((client.anInt2259 == 0) || (client.anInt2259 == 3))
			if ((Class81.anInt678 == 1) || (!RuntimeException_Sub1.aBool1954 && (Class81.anInt678 == 4))) {
				final Class131_Sub20_Sub21 var5 = var0.method670(true);
				if (var5 == null)
					return;

				int var8 = Class81.anInt682 - var1;
				int var9 = Class81.anInt680 - var2;
				if (var5.method881(var8, var9)) {
					var8 -= var5.anInt1658 / 2;
					var9 -= var5.anInt1659 / 2;
					final int var6 = (client.anInt2111 + client.anInt2236) & 2047;
					int var7 = Class131_Sub20_Sub17_Sub1.anIntArray1787[var6];
					int var10 = Class131_Sub20_Sub17_Sub1.anIntArray1770[var6];
					var7 = ((client.anInt2100 + 256) * var7) >> 8;
					var10 = (var10 * (client.anInt2100 + 256)) >> 8;
					final int var3 = ((var10 * var8) + (var7 * var9)) >> 11;
					final int var11 = ((var10 * var9) - (var8 * var7)) >> 11;
					final int var4 = (Class131_Sub11.myPlayer.anInt1718 + var3) >> 7;
					final int var12 = (Class131_Sub11.myPlayer.anInt1759 - var11) >> 7;
					client.secureBuffer.method871(9);
					client.secureBuffer.writeByte(18);
					client.secureBuffer
							.method612(Class80.aBoolArray652[82] ? (Class80.aBoolArray652[81] ? 2 : 1) : 0);
					client.secureBuffer.method618(var12 + Class50.anInt491);
					client.secureBuffer.method586(var4 + Class131_Sub20_Sub20.anInt1649);
					client.secureBuffer.writeByte(var8);
					client.secureBuffer.writeByte(var9);
					client.secureBuffer.method586(client.anInt2111);
					client.secureBuffer.writeByte(57);
					client.secureBuffer.writeByte(client.anInt2236);
					client.secureBuffer.writeByte(client.anInt2100);
					client.secureBuffer.writeByte(89);
					client.secureBuffer
							.method586(Class131_Sub11.myPlayer.anInt1718);
					client.secureBuffer
							.method586(Class131_Sub11.myPlayer.anInt1759);
					client.secureBuffer.writeByte(63);
					client.anInt2218 = var4;
					client.anInt2258 = var12;
				}
			}
	}

	static final void method718(final Class131_Sub18[] var0, final int var1, final int var2, final int var3,
			final int var4, final int var5, final int var6, final int var7, final int var8) {
		Class131_Sub20_Sub17.method845(var2, var3, var4, var5);
		Class131_Sub20_Sub17_Sub1.method934();

		for (int var10 = 0; var10 < var0.length; ++var10) {
			final Class131_Sub18 var12 = var0[var10];
			if ((var12 != null) && ((var12.anInt1177 == var1)
					|| ((var1 == -1412584499) && (var12 == client.aClass131_Sub18_2165)))) {
				int var15;
				if (var8 == -1) {
					client.anIntArray2231[client.anInt2226] = var6 + var12.anInt1276;
					client.anIntArray2232[client.anInt2226] = var7 + var12.anInt1211;
					client.anIntArray2233[client.anInt2226] = var12.anInt1173;
					client.anIntArray2234[client.anInt2226] = var12.anInt1291;
					var15 = ++client.anInt2226 - 1;
				} else
					var15 = var8;

				var12.anInt1288 = var15;
				var12.anInt1289 = client.anInt2038;
				if (!var12.aBool1263 || !Class131_Sub20_Sub19_Sub4.method958(var12)) {
					int var19;
					if (var12.anInt1162 > 0) {
						var19 = var12.anInt1162;
						if (var19 == 324) {
							if (client.anInt2040 == -1) {
								client.anInt2040 = var12.anInt1193;
								client.anInt2137 = var12.anInt1194;
							}

							if (client.aClass91_2296.aBool734)
								var12.anInt1193 = client.anInt2040;
							else
								var12.anInt1193 = client.anInt2137;
						} else if (var19 == 325) {
							if (client.anInt2040 == -1) {
								client.anInt2040 = var12.anInt1193;
								client.anInt2137 = var12.anInt1194;
							}

							if (client.aClass91_2296.aBool734)
								var12.anInt1193 = client.anInt2137;
							else
								var12.anInt1193 = client.anInt2040;
						} else if (var19 == 327) {
							var12.anInt1209 = 150;
							var12.anInt1210 = (int) (Math.sin(client.anInt2038 / 40.0D) * 256.0D) & 2047;
							var12.anInt1201 = 5;
							var12.anInt1172 = 0;
						} else if (var19 == 328) {
							var12.anInt1209 = 150;
							var12.anInt1210 = (int) (Math.sin(client.anInt2038 / 40.0D) * 256.0D) & 2047;
							var12.anInt1201 = 5;
							var12.anInt1172 = 1;
						}
					}

					var19 = var12.anInt1276 + var6;
					int var34 = var12.anInt1211 + var7;
					int var27 = var12.anInt1189;
					int var13;
					int var28;
					if (var12 == client.aClass131_Sub18_2165) {
						if ((var1 != -1412584499) && !var12.aBool1236) {
							Class131_Sub18.aClass131_Sub18Array1293 = var0;
							Class131_Sub20_Sub18.anInt1637 = var6;
							Class46.anInt453 = var7;
							continue;
						}

						if (client.aBool2106 && client.aBool2201) {
							var13 = Class81.anInt668;
							var28 = Class81.anInt673;
							var13 -= client.anInt2045;
							var28 -= client.anInt2280;
							if (var13 < client.anInt2202)
								var13 = client.anInt2202;

							if ((var13 + var12.anInt1173) > (client.aClass131_Sub18_2035.anInt1173 + client.anInt2202))
								var13 = (client.aClass131_Sub18_2035.anInt1173 + client.anInt2202) - var12.anInt1173;

							if (var28 < client.anInt2203)
								var28 = client.anInt2203;

							if ((var28 + var12.anInt1291) > (client.anInt2203 + client.aClass131_Sub18_2035.anInt1291))
								var28 = (client.aClass131_Sub18_2035.anInt1291 + client.anInt2203) - var12.anInt1291;

							var19 = var13;
							var34 = var28;
						}

						if (!var12.aBool1236)
							var27 = 128;
					}

					int var16;
					int var25;
					int var29;
					int var35;
					int var39;
					int var42;
					if (var12.anInt1202 == 2) {
						var13 = var2;
						var28 = var3;
						var35 = var4;
						var42 = var5;
					} else if (var12.anInt1202 == 9) {
						var29 = var19;
						var25 = var34;
						var16 = var19 + var12.anInt1173;
						var39 = var12.anInt1291 + var34;
						if (var16 < var19) {
							var29 = var16;
							var16 = var19;
						}

						if (var39 < var34) {
							var25 = var39;
							var39 = var34;
						}

						++var16;
						++var39;
						var13 = var29 > var2 ? var29 : var2;
						var28 = var25 > var3 ? var25 : var3;
						var35 = var16 < var4 ? var16 : var4;
						var42 = var39 < var5 ? var39 : var5;
					} else {
						var29 = var19 + var12.anInt1173;
						var25 = var34 + var12.anInt1291;
						var13 = var19 > var2 ? var19 : var2;
						var28 = var34 > var3 ? var34 : var3;
						var35 = var29 < var4 ? var29 : var4;
						var42 = var25 < var5 ? var25 : var5;
					}

					if (!var12.aBool1263 || ((var13 < var35) && (var28 < var42))) {
						int var9;
						int var17;
						int var18;
						int var22;
						int var31;
						int var33;
						int var36;
						int var38;
						int var44;
						int var45;
						int var49;
						int var53;
						if (var12.anInt1162 != 0) {
							if (var12.anInt1162 == 1336) {
								if (client.aBool2092) {
									var34 += 15;
									Class7.aClass131_Sub20_Sub17_Sub4_Sub1_79.method1057("Fps:" + Applet_Sub1.anInt2009,
											var19 + var12.anInt1173, var34, 16776960, -1);
									var34 += 15;
									final Runtime var61 = Runtime.getRuntime();
									var25 = (int) ((var61.totalMemory() - var61.freeMemory()) / 1024L);
									var16 = 16776960;
									if ((var25 > '\u8000') && client.aBool2033)
										var16 = 16711680;

									if ((var25 > 65536) && !client.aBool2033)
										var16 = 16711680;

									Class7.aClass131_Sub20_Sub17_Sub4_Sub1_79.method1057("Mem:" + var25 + "k",
											var12.anInt1173 + var19, var34, var16, -1);
									var34 += 15;
								}
								continue;
							}

							if (var12.anInt1162 == 1337) {
								client.anInt2303 = var19;
								client.anInt2197 = var34;
								var16 = var12.anInt1173;
								var39 = var12.anInt1291;
								++client.anInt2287;
								Class108.method435(Class5.aClass5_63);
								boolean var57 = false;
								if (client.anInt2200 >= 0) {
									var44 = GPI.anInt11;
									final int[] var47 = GPI.anIntArray17;

									for (var38 = 0; var38 < var44; ++var38)
										if (client.anInt2200 == var47[var38]) {
											var57 = true;
											break;
										}
								}

								if (var57)
									Class108.method435(Class5.aClass5_58);

								Class131_Sub20_Sub10.method763(true);
								Class108.method435(var57 ? Class5.aClass5_61 : Class5.aClass5_59);
								Class131_Sub20_Sub10.method763(false);
								LoginEncoder.method198();
								Class131_Sub9.method564();
								Class102.method426(var19, var34, var16, var39, true);
								var29 = client.anInt2199;
								var25 = client.anInt2286;
								var16 = client.anInt2169;
								var39 = client.anInt2288;
								Class131_Sub20_Sub17.method845(var29, var25, var29 + var16, var39 + var25);
								Class131_Sub20_Sub17_Sub1.method934();
								if (!client.aBool2271) {
									var44 = client.anInt2110;
									if ((client.anInt2291 / 256) > var44)
										var44 = client.anInt2291 / 256;

									if (client.aBoolArray2261[4] && ((128 + client.anIntArray2274[4]) > var44))
										var44 = 128 + client.anIntArray2274[4];

									var36 = (client.anInt2111 + client.anInt2095) & 2047;
									Class42.method220(Class26.anInt240,
											Class18.method88(
													Class131_Sub11.myPlayer.anInt1718,
													Class131_Sub11.myPlayer.anInt1759,
													Class39.anInt410) - client.anInt2116,
											Class42.anInt423, var44, var36, 600 + (3 * var44));
								}

								if (!client.aBool2271) {
									if (Class50.aClass28_494.aBool251)
										var36 = Class39.anInt410;
									else
										label1574: {
											var38 = 3;
											if (Class75.anInt633 < 310) {
												var9 = Class139.anInt917 >> 7;
												var17 = Class1.anInt1 >> 7;
												var33 = Class131_Sub11.myPlayer.anInt1718 >> 7;
												var18 = Class131_Sub11.myPlayer.anInt1759 >> 7;
												if ((var9 < 0) || (var17 < 0) || (var9 >= 104) || (var17 >= 104)) {
													var36 = Class39.anInt410;
													break label1574;
												}

												if ((Class26.aByteArrayArrayArray225[Class39.anInt410][var9][var17]
														& 4) != 0)
													var38 = Class39.anInt410;

												if (var33 > var9)
													var31 = var33 - var9;
												else
													var31 = var9 - var33;

												if (var18 > var17)
													var49 = var18 - var17;
												else
													var49 = var17 - var18;

												if (var31 > var49) {
													var22 = (var49 * 65536) / var31;
													var45 = '\u8000';

													while (var33 != var9) {
														if (var9 < var33)
															++var9;
														else if (var9 > var33)
															--var9;

														if ((Class26.aByteArrayArrayArray225[Class39.anInt410][var9][var17]
																& 4) != 0)
															var38 = Class39.anInt410;

														var45 += var22;
														if (var45 >= 65536) {
															var45 -= 65536;
															if (var17 < var18)
																++var17;
															else if (var17 > var18)
																--var17;

															if ((Class26.aByteArrayArrayArray225[Class39.anInt410][var9][var17]
																	& 4) != 0)
																var38 = Class39.anInt410;
														}
													}
												} else {
													var22 = (65536 * var31) / var49;
													var45 = '\u8000';

													while (var17 != var18) {
														if (var17 < var18)
															++var17;
														else if (var17 > var18)
															--var17;

														if ((Class26.aByteArrayArrayArray225[Class39.anInt410][var9][var17]
																& 4) != 0)
															var38 = Class39.anInt410;

														var45 += var22;
														if (var45 >= 65536) {
															var45 -= 65536;
															if (var9 < var33)
																++var9;
															else if (var9 > var33)
																--var9;

															if ((Class26.aByteArrayArrayArray225[Class39.anInt410][var9][var17]
																	& 4) != 0)
																var38 = Class39.anInt410;
														}
													}
												}
											}

											if ((Class131_Sub11.myPlayer.anInt1718 >= 0)
													&& (Class131_Sub11.myPlayer.anInt1759 >= 0)
													&& (Class131_Sub11.myPlayer.anInt1718 < 13312)
													&& (Class131_Sub11.myPlayer.anInt1759 < 13312)) {
												if ((Class26.aByteArrayArrayArray225[Class39.anInt410][Class131_Sub11.myPlayer.anInt1718 >> 7][Class131_Sub11.myPlayer.anInt1759 >> 7]
														& 4) != 0)
													var38 = Class39.anInt410;

												var36 = var38;
											} else
												var36 = Class39.anInt410;
										}

									var44 = var36;
								} else {
									if (Class50.aClass28_494.aBool251)
										var36 = Class39.anInt410;
									else {
										var38 = Class18.method88(Class139.anInt917, Class1.anInt1, Class39.anInt410);
										if (((var38 - Class46.anInt452) < 800)
												&& ((Class26.aByteArrayArrayArray225[Class39.anInt410][Class139.anInt917 >> 7][Class1.anInt1 >> 7]
														& 4) != 0))
											var36 = Class39.anInt410;
										else
											var36 = 3;
									}

									var44 = var36;
								}

								var36 = Class139.anInt917;
								var38 = Class46.anInt452;
								var9 = Class1.anInt1;
								var17 = Class75.anInt633;
								var33 = Class131_Sub20_Sub1.anInt1371;

								for (var18 = 0; var18 < 5; ++var18)
									if (client.aBoolArray2261[var18]) {
										var31 = (int) (((Math.random() * (1 + (client.anIntArray2273[var18] * 2)))
												- client.anIntArray2273[var18]) + (Math
														.sin((client.anIntArray2275[var18] / 100.0D)
																* client.anIntArray2276[var18])
														* client.anIntArray2274[var18]));
										if (var18 == 0)
											Class139.anInt917 += var31;

										if (var18 == 1)
											Class46.anInt452 += var31;

										if (var18 == 2)
											Class1.anInt1 += var31;

										if (var18 == 3)
											Class131_Sub20_Sub1.anInt1371 = (var31 + Class131_Sub20_Sub1.anInt1371)
													& 2047;

										if (var18 == 4) {
											Class75.anInt633 += var31;
											if (Class75.anInt633 < 128)
												Class75.anInt633 = 128;

											if (Class75.anInt633 > 383)
												Class75.anInt633 = 383;
										}
									}

								var18 = Class81.anInt668;
								var31 = Class81.anInt673;
								if (Class81.anInt678 != 0) {
									var18 = Class81.anInt682;
									var31 = Class81.anInt680;
								}

								if ((var18 >= var29) && (var18 < (var16 + var29)) && (var31 >= var25)
										&& (var31 < (var25 + var39))) {
									Class131_Sub20_Sub19_Sub7.aBool1941 = true;
									Class131_Sub20_Sub19_Sub7.anInt1944 = 0;
									Class131_Sub20_Sub19_Sub7.anInt1936 = var18 - var29;
									Class131_Sub20_Sub19_Sub7.anInt1943 = var31 - var25;
								} else {
									Class131_Sub20_Sub19_Sub7.aBool1941 = false;
									Class131_Sub20_Sub19_Sub7.anInt1944 = 0;
								}

								Class28.method123();
								Class131_Sub20_Sub17.method850(var29, var25, var16, var39, 0);
								Class28.method123();
								var49 = Class131_Sub20_Sub17_Sub1.anInt1774;
								Class131_Sub20_Sub17_Sub1.anInt1774 = client.anInt2283;
								Class65.aClass33_595.method184(Class139.anInt917, Class46.anInt452, Class1.anInt1,
										Class75.anInt633, Class131_Sub20_Sub1.anInt1371, var44);
								Class131_Sub20_Sub17_Sub1.anInt1774 = var49;
								Class28.method123();
								Class65.aClass33_595.method158();
								client.anInt2120 = 0;
								boolean var58 = false;
								var45 = -1;
								var53 = GPI.anInt11;
								final int[] var40 = GPI.anIntArray17;

								int var23;
								for (var23 = 0; var23 < (var53 + client.anInt2230); ++var23) {
									Object var54;
									if (var23 < var53) {
										var54 = client.playerArray[var40[var23]];
										if (client.anInt2200 == var40[var23]) {
											var58 = true;
											var45 = var23;
											continue;
										}
									} else
										var54 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[client.anIntArray2067[var23
												- var53]];

									method715((Class131_Sub20_Sub19_Sub2) var54, var23, var29, var25);
								}

								if (var58)
									method715(client.playerArray[client.anInt2200], var45,
											var29, var25);

								for (var23 = 0; var23 < client.anInt2120; ++var23) {
									final int var20 = client.anIntArray2122[var23];
									int var51 = client.anIntArray2264[var23];
									final int var21 = client.anIntArray2125[var23];
									final int var55 = client.anIntArray2124[var23];
									boolean var56 = true;

									while (var56) {
										var56 = false;

										for (int var14 = 0; var14 < var23; ++var14)
											if (((var51 + 2) > (client.anIntArray2264[var14]
													- client.anIntArray2124[var14]))
													&& ((var51 - var55) < (client.anIntArray2264[var14] + 2))
													&& ((var20 - var21) < (client.anIntArray2125[var14]
															+ client.anIntArray2122[var14]))
													&& ((var21 + var20) > (client.anIntArray2122[var14]
															- client.anIntArray2125[var14]))
													&& ((client.anIntArray2264[var14]
															- client.anIntArray2124[var14]) < var51)) {
												var51 = client.anIntArray2264[var14] - client.anIntArray2124[var14];
												var56 = true;
											}
									}

									client.anInt2132 = client.anIntArray2122[var23];
									client.anInt2133 = client.anIntArray2264[var23] = var51;
									final String var24 = client.aStringArray2071[var23];
									if (client.anInt2185 == 0) {
										int var30 = 16776960;
										if (client.anIntArray2126[var23] < 6)
											var30 = client.anIntArray2085[client.anIntArray2126[var23]];

										if (client.anIntArray2126[var23] == 6)
											var30 = (client.anInt2287 % 20) >= 10 ? 16776960 : 16711680;

										if (client.anIntArray2126[var23] == 7)
											var30 = (client.anInt2287 % 20) < 10 ? 255 : '\uffff';

										if (client.anIntArray2126[var23] == 8)
											var30 = (client.anInt2287 % 20) < 10 ? '\ub000' : 8454016;

										int var48;
										if (client.anIntArray2126[var23] == 9) {
											var48 = 150 - client.anIntArray2223[var23];
											if (var48 < 50)
												var30 = (var48 * 1280) + 16711680;
											else if (var48 < 100)
												var30 = 16776960 - ((var48 - 50) * 327680);
											else if (var48 < 150)
												var30 = '\uff00' + ((var48 - 100) * 5);
										}

										if (client.anIntArray2126[var23] == 10) {
											var48 = 150 - client.anIntArray2223[var23];
											if (var48 < 50)
												var30 = 16711680 + (5 * var48);
											else if (var48 < 100)
												var30 = 16711935 - (327680 * (var48 - 50));
											else if (var48 < 150)
												var30 = (255 + (327680 * (var48 - 100))) - ((var48 - 100) * 5);
										}

										if (client.anIntArray2126[var23] == 11) {
											var48 = 150 - client.anIntArray2223[var23];
											if (var48 < 50)
												var30 = 16777215 - (var48 * 327685);
											else if (var48 < 100)
												var30 = (327685 * (var48 - 50)) + '\uff00';
											else if (var48 < 150)
												var30 = 16777215 - (327680 * (var48 - 100));
										}

										if (client.anIntArray2127[var23] == 0)
											GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15.method1056(var24,
													var29 + client.anInt2132, var25 + client.anInt2133, var30, 0);

										if (client.anIntArray2127[var23] == 1)
											GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15.method1042(var24,
													var29 + client.anInt2132, client.anInt2133 + var25, var30, 0,
													client.anInt2287);

										if (client.anIntArray2127[var23] == 2)
											GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15.method1043(var24,
													var29 + client.anInt2132, var25 + client.anInt2133, var30, 0,
													client.anInt2287);

										if (client.anIntArray2127[var23] == 3)
											GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15.method1055(var24,
													var29 + client.anInt2132, var25 + client.anInt2133, var30, 0,
													client.anInt2287, 150 - client.anIntArray2223[var23]);

										if (client.anIntArray2127[var23] == 4) {
											var48 = ((150 - client.anIntArray2223[var23])
													* (GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15.method1037(var24)
															+ 100))
													/ 150;
											Class131_Sub20_Sub17.method846((var29 + client.anInt2132) - 50, var25,
													client.anInt2132 + var29 + 50, var39 + var25);
											GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15.method1053(var24,
													(50 + client.anInt2132 + var29) - var48, client.anInt2133 + var25,
													var30, 0);
											Class131_Sub20_Sub17.method845(var29, var25, var29 + var16, var25 + var39);
										}

										if (client.anIntArray2127[var23] == 5) {
											var48 = 150 - client.anIntArray2223[var23];
											int var52 = 0;
											if (var48 < 25)
												var52 = var48 - 25;
											else if (var48 > 125)
												var52 = var48 - 125;

											Class131_Sub20_Sub17.method846(var29,
													(var25 + client.anInt2133)
															- GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15.anInt1962 - 1,
													var16 + var29, 5 + client.anInt2133 + var25);
											GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15.method1056(var24,
													client.anInt2132 + var29, var52 + client.anInt2133 + var25, var30,
													0);
											Class131_Sub20_Sub17.method845(var29, var25, var16 + var29, var39 + var25);
										}
									} else
										GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15.method1056(var24,
												var29 + client.anInt2132, var25 + client.anInt2133, 16776960, 0);
								}

								Class103.method429(var29, var25);
								((Class35) Class131_Sub20_Sub17_Sub1.anInterface3_1784).method202(client.anInt2103);
								Class1.method16();
								Class139.anInt917 = var36;
								Class46.anInt452 = var38;
								Class1.anInt1 = var9;
								Class75.anInt633 = var17;
								Class131_Sub20_Sub1.anInt1371 = var33;
								if (client.aBool2037) {
									final byte var71 = 0;
									var45 = var71 + Class94.anInt761 + Class94.anInt746;
									if (var45 == 0)
										client.aBool2037 = false;
								}

								if (client.aBool2037) {
									Class131_Sub20_Sub17.method850(var29, var25, var16, var39, 0);
									Class5.method26("Loading - please wait.", false);
								}

								client.aBoolArray2252[var12.anInt1288] = true;
								Class131_Sub20_Sub17.method845(var2, var3, var4, var5);
								continue;
							}

							if (var12.anInt1162 == 1338) {
								Class131_Sub20_Sub14.method785(var12, var19, var34, var15);
								Class131_Sub20_Sub17.method845(var2, var3, var4, var5);
								continue;
							}

							if (var12.anInt1162 == 1339) {
								Class51.method269(var12, var19, var34);
								Class131_Sub20_Sub17.method845(var2, var3, var4, var5);
								continue;
							}
						}

						if (var12.anInt1202 == 0) {
							if (!var12.aBool1263 && Class131_Sub20_Sub19_Sub4.method958(var12)
									&& (var12 != Class21.aClass131_Sub18_199))
								continue;

							if (!var12.aBool1263) {
								if (var12.anInt1180 > (var12.anInt1182 - var12.anInt1291))
									var12.anInt1180 = var12.anInt1182 - var12.anInt1291;

								if (var12.anInt1180 < 0)
									var12.anInt1180 = 0;
							}

							method718(var0, var12.anInt1272, var13, var28, var35, var42, var19 - var12.anInt1281,
									var34 - var12.anInt1180, var15);
							if (null != var12.aClass131_Sub18Array1171)
								method718(var12.aClass131_Sub18Array1171, var12.anInt1272, var13, var28, var35, var42,
										var19 - var12.anInt1281, var34 - var12.anInt1180, var15);

							final Class131_Sub7 var26 = (Class131_Sub7) client.aClass114_2184
									.method457(var12.anInt1272);
							if (null != var26)
								Class45.method228(var26.anInt1025, var13, var28, var35, var42, var19, var34, var15);

							Class131_Sub20_Sub17.method845(var2, var3, var4, var5);
							Class131_Sub20_Sub17_Sub1.method934();
						}

						if (client.aBool2237 || client.aBoolArray2164[var15] || (client.anInt2073 > 1)) {
							if ((var12.anInt1202 == 0) && !var12.aBool1263 && (var12.anInt1182 > var12.anInt1291))
								Class131_Sub10.method569(var12.anInt1173 + var19, var34, var12.anInt1180,
										var12.anInt1291, var12.anInt1182);

							if (var12.anInt1202 != 1) {
								int var11;
								if (var12.anInt1202 == 2) {
									var29 = 0;

									for (var25 = 0; var25 < var12.anInt1266; ++var25)
										for (var16 = 0; var16 < var12.anInt1229; ++var16) {
											var39 = ((var12.anInt1224 + 32) * var16) + var19;
											var11 = var34 + (var25 * (32 + var12.anInt1225));
											if (var29 < 20) {
												var39 += var12.anIntArray1226[var29];
												var11 += var12.anIntArray1227[var29];
											}

											if (var12.anIntArray1292[var29] <= 0) {
												if ((var12.anIntArray1228 != null) && (var29 < 20)) {
													final Class131_Sub20_Sub17_Sub3 var70 = var12.method666(var29);
													if (null != var70)
														var70.method968(var39, var11);
													else if (Class131_Sub18.aBool1156)
														Class131_Sub20_Sub6.method734(var12);
												}
											} else {
												var38 = var12.anIntArray1292[var29] - 1;
												if ((((32 + var39) > var2) && (var39 < var4) && ((var11 + 32) > var3)
														&& (var11 < var5))
														|| ((var12 == Class100.aClass131_Sub18_786)
																&& (client.anInt2140 == var29))) {
													Class131_Sub20_Sub17_Sub3 var50;
													if ((client.anInt2090 == 1)
															&& (Class131_Sub20_Sub1.anInt1370 == var29)
															&& (var12.anInt1272 == PacketDecoder.anInt544))
														var50 = Class80.method356(var38, var12.anIntArray1154[var29], 2,
																0, 2, false);
													else
														var50 = Class80.method356(var38, var12.anIntArray1154[var29], 1,
																3153952, 2, false);

													if (var50 != null) {
														if ((Class100.aClass131_Sub18_786 == var12)
																&& (client.anInt2140 == var29)) {
															var44 = Class81.anInt668 - client.anInt2240;
															var36 = Class81.anInt673 - client.anInt2142;
															if ((var44 < 5) && (var44 > -5))
																var44 = 0;

															if ((var36 < 5) && (var36 > -5))
																var36 = 0;

															if (client.anInt2207 < 5) {
																var44 = 0;
																var36 = 0;
															}

															var50.method980(var44 + var39, var11 + var36, 128);
															if (var1 != -1) {
																final Class131_Sub18 var32 = var0[var1 & '\uffff'];
																if (((var36 + var11) < Class131_Sub20_Sub17.anInt1630)
																		&& (var32.anInt1180 > 0)) {
																	var33 = ((Class131_Sub20_Sub17.anInt1630 - var11
																			- var36) * client.anInt2103) / 3;
																	if (var33 > (client.anInt2103 * 10))
																		var33 = client.anInt2103 * 10;

																	if (var33 > var32.anInt1180)
																		var33 = var32.anInt1180;

																	var32.anInt1180 -= var33;
																	client.anInt2142 += var33;
																	Class131_Sub20_Sub6.method734(var32);
																}

																if (((var36 + var11
																		+ 32) > Class131_Sub20_Sub17.anInt1631)
																		&& (var32.anInt1180 < (var32.anInt1182
																				- var32.anInt1291))) {
																	var33 = (client.anInt2103 * ((32 + var36 + var11)
																			- Class131_Sub20_Sub17.anInt1631)) / 3;
																	if (var33 > (client.anInt2103 * 10))
																		var33 = client.anInt2103 * 10;

																	if (var33 > (var32.anInt1182 - var32.anInt1291
																			- var32.anInt1180))
																		var33 = var32.anInt1182 - var32.anInt1291
																				- var32.anInt1180;

																	var32.anInt1180 += var33;
																	client.anInt2142 -= var33;
																	Class131_Sub20_Sub6.method734(var32);
																}
															}
														} else if ((var12 == Class21.aClass131_Sub18_194)
																&& (client.anInt2139 == var29))
															var50.method980(var39, var11, 128);
														else
															var50.method968(var39, var11);
													} else
														Class131_Sub20_Sub6.method734(var12);
												}
											}

											++var29;
										}
								} else if (var12.anInt1202 == 3) {
									if (Class44.method222(var12)) {
										var29 = var12.anInt1184;
										if ((var12 == Class21.aClass131_Sub18_199) && (var12.anInt1186 != 0))
											var29 = var12.anInt1186;
									} else {
										var29 = var12.anInt1183;
										if ((Class21.aClass131_Sub18_199 == var12) && (var12.anInt1185 != 0))
											var29 = var12.anInt1185;
									}

									if (var12.aBool1245)
										switch (var12.aClass27_1188.anInt248) {
										case 1:
											Class131_Sub20_Sub17.method842(var19, var34, var12.anInt1173,
													var12.anInt1291, var12.anInt1183, var12.anInt1184,
													256 - (var12.anInt1189 & 255), 256 - (var12.anInt1243 & 255));
											break;
										case 2:
											Class131_Sub20_Sub17.method852(var19, var34, var12.anInt1173,
													var12.anInt1291, var12.anInt1183, var12.anInt1184,
													256 - (var12.anInt1189 & 255), 256 - (var12.anInt1243 & 255));
											break;
										case 3:
											Class131_Sub20_Sub17.method859(var19, var34, var12.anInt1173,
													var12.anInt1291, var12.anInt1183, var12.anInt1184,
													256 - (var12.anInt1189 & 255), 256 - (var12.anInt1243 & 255));
											break;
										case 4:
											Class131_Sub20_Sub17.method861(var19, var34, var12.anInt1173,
													var12.anInt1291, var12.anInt1183, var12.anInt1184,
													256 - (var12.anInt1189 & 255), 256 - (var12.anInt1243 & 255));
											break;
										default:
											if (var27 == 0)
												Class131_Sub20_Sub17.method850(var19, var34, var12.anInt1173,
														var12.anInt1291, var29);
											else
												Class131_Sub20_Sub17.method849(var19, var34, var12.anInt1173,
														var12.anInt1291, var29, 256 - (var27 & 255));
										}
									else if (var27 == 0)
										Class131_Sub20_Sub17.method854(var19, var34, var12.anInt1173, var12.anInt1291,
												var29);
									else
										Class131_Sub20_Sub17.method855(var19, var34, var12.anInt1173, var12.anInt1291,
												var29, 256 - (var27 & 255));
								} else {
									Class131_Sub20_Sub17_Sub4_Sub1 var59;
									if (var12.anInt1202 == 4) {
										var59 = var12.method665();
										if (var59 == null) {
											if (Class131_Sub18.aBool1156)
												Class131_Sub20_Sub6.method734(var12);
										} else {
											String var65 = var12.aString1218;
											if (Class44.method222(var12)) {
												var25 = var12.anInt1184;
												if ((Class21.aClass131_Sub18_199 == var12) && (var12.anInt1186 != 0))
													var25 = var12.anInt1186;

												if (var12.aString1219.length() > 0)
													var65 = var12.aString1219;
											} else {
												var25 = var12.anInt1183;
												if ((Class21.aClass131_Sub18_199 == var12) && (var12.anInt1185 != 0))
													var25 = var12.anInt1185;
											}

											if (var12.aBool1263 && (var12.anInt1168 != -1)) {
												final Class131_Sub20_Sub2 var68 = Class79_Sub1
														.method645(var12.anInt1168, (short) 6848);
												var65 = var68.aString1385;
												if (var65 == null)
													var65 = "null";

												if (((var68.anInt1408 == 1) || (var12.anInt1198 != 1))
														&& (var12.anInt1198 != -1))
													var65 = Class103.method427(16748608) + var65 + "</col>" + " "
															+ '\u0078' + Class23.method109(var12.anInt1198);
											}

											if (var12 == client.aClass131_Sub18_2049) {
												var65 = "Please wait...";
												var25 = var12.anInt1183;
											}

											if (!var12.aBool1263)
												var65 = Class108.method434(var65, var12);

											var59.method1041(var65, var19, var34, var12.anInt1173, var12.anInt1291,
													var25, var12.aBool1223 ? 0 : -1, var12.anInt1221, var12.anInt1222,
													var12.anInt1220);
										}
									} else if (var12.anInt1202 == 5) {
										Class131_Sub20_Sub17_Sub3 var60;
										if (!var12.aBool1263) {
											var60 = var12.method664(Class44.method222(var12));
											if (var60 != null)
												var60.method968(var19, var34);
											else if (Class131_Sub18.aBool1156)
												Class131_Sub20_Sub6.method734(var12);
										} else {
											if (var12.anInt1168 != -1)
												var60 = Class80.method356(var12.anInt1168, var12.anInt1198,
														var12.anInt1197, var12.anInt1205, var12.anInt1216, false);
											else
												var60 = var12.method664(false);

											if (var60 == null) {
												if (Class131_Sub18.aBool1156)
													Class131_Sub20_Sub6.method734(var12);
											} else {
												var25 = var60.anInt1826;
												var16 = var60.anInt1828;
												if (!var12.aBool1196) {
													var39 = (var12.anInt1173 * 4096) / var25;
													if (var12.anInt1280 != 0)
														var60.method976((var12.anInt1173 / 2) + var19,
																var34 + (var12.anInt1291 / 2), var12.anInt1280, var39);
													else if (var27 != 0)
														var60.method972(var19, var34, var12.anInt1173, var12.anInt1291,
																256 - (var27 & 255));
													else if ((var25 == var12.anInt1173) && (var12.anInt1291 == var16))
														var60.method968(var19, var34);
													else
														var60.method978(var19, var34, var12.anInt1173, var12.anInt1291);
												} else {
													Class131_Sub20_Sub17.method846(var19, var34,
															var12.anInt1173 + var19, var12.anInt1291 + var34);
													var39 = (var12.anInt1173 + (var25 - 1)) / var25;
													var11 = ((var16 - 1) + var12.anInt1291) / var16;

													for (var44 = 0; var44 < var39; ++var44)
														for (var36 = 0; var36 < var11; ++var36)
															if (var12.anInt1280 != 0)
																var60.method976(var19 + (var44 * var25) + (var25 / 2),
																		(var36 * var16) + var34 + (var16 / 2),
																		var12.anInt1280, 4096);
															else if (var27 != 0)
																var60.method980((var25 * var44) + var19,
																		(var16 * var36) + var34, 256 - (var27 & 255));
															else
																var60.method968((var44 * var25) + var19,
																		(var36 * var16) + var34);

													Class131_Sub20_Sub17.method845(var2, var3, var4, var5);
												}
											}
										}
									} else {
										Class131_Sub20_Sub2 var41;
										if (var12.anInt1202 == 6) {
											final boolean var62 = Class44.method222(var12);
											if (var62)
												var25 = var12.anInt1187;
											else
												var25 = var12.anInt1160;

											Class131_Sub20_Sub19_Sub7 var63 = null;
											var39 = 0;
											if (var12.anInt1168 != -1) {
												var41 = Class79_Sub1.method645(var12.anInt1168, (short) 12431);
												if (var41 != null) {
													var41 = var41.method697(var12.anInt1198);
													var63 = var41.method700(1);
													if (var63 != null) {
														var63.method1015();
														var39 = var63.anInt1643 / 2;
													} else
														Class131_Sub20_Sub6.method734(var12);
												}
											} else if (var12.anInt1201 == 5) {
												if (var12.anInt1172 == 0)
													var63 = client.aClass91_2296.method384((Class131_Sub20_Sub1) null,
															-1, (Class131_Sub20_Sub1) null, -1);
												else
													var63 = Class131_Sub11.myPlayer
															.method868((short) 1006);
											} else if (var25 == -1) {
												var63 = var12.method671((Class131_Sub20_Sub1) null, -1, var62,
														Class131_Sub11.myPlayer.aClass91_1980);
												if ((null == var63) && Class131_Sub18.aBool1156)
													Class131_Sub20_Sub6.method734(var12);
											} else {
												final Class131_Sub20_Sub1 var67 = Class131_Sub20_Sub19_Sub2_Sub1
														.method1066(var25);
												var63 = var12.method671(var67, var12.anInt1279, var62,
														Class131_Sub11.myPlayer.aClass91_1980);
												if ((var63 == null) && Class131_Sub18.aBool1156)
													Class131_Sub20_Sub6.method734(var12);
											}

											Class131_Sub20_Sub17_Sub1.method931(var19 + (var12.anInt1173 / 2),
													var34 + (var12.anInt1291 / 2));
											var11 = (var12.anInt1277
													* Class131_Sub20_Sub17_Sub1.anIntArray1787[var12.anInt1209]) >> 16;
											var44 = (Class131_Sub20_Sub17_Sub1.anIntArray1770[var12.anInt1209]
													* var12.anInt1277) >> 16;
											if (null != var63)
												if (!var12.aBool1263)
													var63.method1021(0, var12.anInt1210, 0, var12.anInt1209, 0, var11,
															var44);
												else {
													var63.method1015();
													if (var12.aBool1215)
														var63.method1022(0, var12.anInt1210, var12.anInt1150,
																var12.anInt1209, var12.anInt1207,
																var12.anInt1208 + var39 + var11,
																var44 + var12.anInt1208, var12.anInt1277);
													else
														var63.method1021(0, var12.anInt1210, var12.anInt1150,
																var12.anInt1209, var12.anInt1207,
																var39 + var11 + var12.anInt1208,
																var44 + var12.anInt1208);
												}

											Class131_Sub20_Sub17_Sub1.method942();
										} else {
											if (var12.anInt1202 == 7) {
												var59 = var12.method665();
												if (var59 == null) {
													if (Class131_Sub18.aBool1156)
														Class131_Sub20_Sub6.method734(var12);
													continue;
												}

												var25 = 0;

												for (var16 = 0; var16 < var12.anInt1266; ++var16)
													for (var39 = 0; var39 < var12.anInt1229; ++var39) {
														if (var12.anIntArray1292[var25] > 0) {
															var41 = Class79_Sub1.method645(
																	var12.anIntArray1292[var25] - 1, (short) 4421);
															String var46;
															if ((var41.anInt1408 != 1)
																	&& (var12.anIntArray1154[var25] == 1))
																var46 = Class103.method427(16748608) + var41.aString1385
																		+ "</col>";
															else
																var46 = Class103.method427(16748608) + var41.aString1385
																		+ "</col>" + " " + '\u0078' + Class23
																				.method109(var12.anIntArray1154[var25]);

															var36 = var19 + ((var12.anInt1224 + 115) * var39);
															var38 = ((var12.anInt1225 + 12) * var16) + var34;
															if (var12.anInt1221 == 0)
																var59.method1053(var46, var36, var38, var12.anInt1183,
																		var12.aBool1223 ? 0 : -1);
															else if (var12.anInt1221 == 1)
																var59.method1056(var46, (var12.anInt1173 / 2) + var36,
																		var38, var12.anInt1183,
																		var12.aBool1223 ? 0 : -1);
															else
																var59.method1057(var46, (var12.anInt1173 + var36) - 1,
																		var38, var12.anInt1183,
																		var12.aBool1223 ? 0 : -1);
														}

														++var25;
													}
											}

											if ((var12.anInt1202 == 8)
													&& (var12 == Class131_Sub20_Sub1.aClass131_Sub18_1356)
													&& (client.anInt2175 == client.anInt2174)) {
												var29 = 0;
												var25 = 0;
												final Class131_Sub20_Sub17_Sub4_Sub1 var37 = Class7.aClass131_Sub20_Sub17_Sub4_Sub1_79;
												String var43 = var12.aString1218;

												String var66;
												for (var43 = Class108.method434(var43, var12); var43
														.length() > 0; var25 += 1 + var37.anInt1962) {
													var44 = var43.indexOf("<br>");
													if (var44 != -1) {
														var66 = var43.substring(0, var44);
														var43 = var43.substring(var44 + 4);
													} else {
														var66 = var43;
														var43 = "";
													}

													var36 = var37.method1037(var66);
													if (var36 > var29)
														var29 = var36;
												}

												var29 += 6;
												var25 += 7;
												var44 = (var19 + var12.anInt1173) - 5 - var29;
												var36 = var34 + var12.anInt1291 + 5;
												if (var44 < (var19 + 5))
													var44 = 5 + var19;

												if ((var44 + var29) > var4)
													var44 = var4 - var29;

												if ((var36 + var25) > var5)
													var36 = var5 - var25;

												Class131_Sub20_Sub17.method850(var44, var36, var29, var25, 16777120);
												Class131_Sub20_Sub17.method854(var44, var36, var29, var25, 0);
												var43 = var12.aString1218;
												var38 = var36 + var37.anInt1962 + 2;

												for (var43 = Class108.method434(var43, var12); var43
														.length() > 0; var38 += var37.anInt1962 + 1) {
													var9 = var43.indexOf("<br>");
													if (var9 != -1) {
														var66 = var43.substring(0, var9);
														var43 = var43.substring(var9 + 4);
													} else {
														var66 = var43;
														var43 = "";
													}

													var37.method1053(var66, var44 + 3, var38, 0, -1);
												}
											}

											if (var12.anInt1202 == 9)
												if (var12.anInt1191 == 1) {
													if (var12.aBool1192) {
														var29 = var19;
														var25 = var34 + var12.anInt1291;
														var16 = var12.anInt1173 + var19;
														var39 = var34;
													} else {
														var29 = var19;
														var25 = var34;
														var16 = var19 + var12.anInt1173;
														var39 = var34 + var12.anInt1291;
													}

													Class131_Sub20_Sub17.method862(var29, var25, var16, var39,
															var12.anInt1183);
												} else {
													var29 = var12.anInt1173 >= 0 ? var12.anInt1173 : -var12.anInt1173;
													var25 = var12.anInt1291 >= 0 ? var12.anInt1291 : -var12.anInt1291;
													var16 = var29;
													if (var29 < var25)
														var16 = var25;

													if (var16 != 0) {
														var39 = (var12.anInt1173 << 16) / var16;
														var11 = (var12.anInt1291 << 16) / var16;
														if (var11 <= var39)
															var39 = -var39;
														else
															var11 = -var11;

														var44 = (var11 * var12.anInt1191) >> 17;
														var36 = ((var11 * var12.anInt1191) + 1) >> 17;
														var38 = (var12.anInt1191 * var39) >> 17;
														var9 = ((var12.anInt1191 * var39) + 1) >> 17;
														var17 = var19 + var44;
														var33 = var19 - var36;
														var18 = (var12.anInt1173 + var19) - var36;
														var31 = var44 + var12.anInt1173 + var19;
														var49 = var38 + var34;
														var22 = var34 - var9;
														var45 = (var12.anInt1291 + var34) - var9;
														var53 = var38 + var34 + var12.anInt1291;
														Class131_Sub20_Sub17_Sub1.method945(var17, var33, var18);
														Class131_Sub20_Sub17_Sub1.method936(var49, var22, var45, var17,
																var33, var18, var12.anInt1183);
														Class131_Sub20_Sub17_Sub1.method945(var17, var18, var31);
														Class131_Sub20_Sub17_Sub1.method936(var49, var45, var53, var17,
																var18, var31, var12.anInt1183);
													}
												}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

	public static Object method719(final byte[] var0, final boolean var1) {
		if (var0 == null)
			return null;
		else {
			if ((var0.length > 136) && !Class56.aBool505)
				try {
					final Class56_Sub1 var2 = new Class56_Sub1();
					var2.method276(var0, (byte) 101);
					return var2;
				} catch (final Throwable var3) {
					Class56.aBool505 = true;
				}

			return var0;
		}
	}
}
