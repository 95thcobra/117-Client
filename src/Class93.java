import java.awt.Graphics;

public class Class93 {
	static Class131_Sub20_Sub17_Sub3[] aClass131_Sub20_Sub17_Sub3Array742;

	public static boolean method390(final CharSequence var0) {
		boolean var1 = false;
		boolean var7 = false;
		int var5 = 0;
		final int var3 = var0.length();
		int var4 = 0;

		boolean var6;
		while (true) {
			if (var4 >= var3) {
				var6 = var7;
				break;
			}

			label86: {
				final char var2 = var0.charAt(var4);
				if (var4 == 0) {
					if (var2 == 45) {
						var1 = true;
						break label86;
					}

					if (var2 == 43)
						break label86;
				}

				int var9;
				if ((var2 >= 48) && (var2 <= 57))
					var9 = var2 - 48;
				else if ((var2 >= 65) && (var2 <= 90))
					var9 = var2 - 55;
				else {
					if ((var2 < 97) || (var2 > 122)) {
						var6 = false;
						break;
					}

					var9 = var2 - 87;
				}

				if (var9 >= 10) {
					var6 = false;
					break;
				}

				if (var1)
					var9 = -var9;

				final int var8 = var9 + (var5 * 10);
				if (var5 != (var8 / 10)) {
					var6 = false;
					break;
				}

				var5 = var8;
				var7 = true;
			}

			++var4;
		}

		return var6;
	}

	static void method391(final int var0) {
		if (var0 != -1)
			if (Class77.method344(var0)) {
				final Class131_Sub18[] var3 = Class131_Sub18.aClass131_Sub18ArrayArray1174[var0];

				for (final Class131_Sub18 var2 : var3) {
					if (var2.anObjectArray1239 != null) {
						final Class131_Sub10 var1 = new Class131_Sub10();
						var1.aClass131_Sub18_1057 = var2;
						var1.anObjectArray1056 = var2.anObjectArray1239;
						NpcFlags.method24(var1, 2000000);
					}
				}

			}
	}

	static final void method392(final Class131_Sub18[] var0, final int var1, final int var2, final int var3,
			final int var4, final int var5, final int var6, final int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			final Class131_Sub18 var9 = var0[var8];
			if ((var9 != null)
					&& (!var9.aBool1263 || (var9.anInt1202 == 0) || var9.aBool1238 || (Class49.method254(var9) != 0)
							|| (client.aClass131_Sub18_2035 == var9) || (var9.anInt1162 == 1338))
					&& (var1 == var9.anInt1177) && (!var9.aBool1263 || !Class131_Sub20_Sub19_Sub4.method958(var9))) {
				final int var13 = var6 + var9.anInt1276;
				final int var19 = var7 + var9.anInt1211;
				int var15;
				int var16;
				int var17;
				int var18;
				int var20;
				int var22;
				if (var9.anInt1202 == 2) {
					var15 = var2;
					var16 = var3;
					var17 = var4;
					var22 = var5;
				} else if (var9.anInt1202 == 9) {
					var18 = var13;
					var20 = var19;
					int var14 = var13 + var9.anInt1173;
					int var10 = var9.anInt1291 + var19;
					if (var14 < var13) {
						var18 = var14;
						var14 = var13;
					}

					if (var10 < var19) {
						var20 = var10;
						var10 = var19;
					}

					++var14;
					++var10;
					var15 = var18 > var2 ? var18 : var2;
					var16 = var20 > var3 ? var20 : var3;
					var17 = var14 < var4 ? var14 : var4;
					var22 = var10 < var5 ? var10 : var5;
				} else {
					var18 = var13 + var9.anInt1173;
					var20 = var9.anInt1291 + var19;
					var15 = var13 > var2 ? var13 : var2;
					var16 = var19 > var3 ? var19 : var3;
					var17 = var18 < var4 ? var18 : var4;
					var22 = var20 < var5 ? var20 : var5;
				}

				if (client.aClass131_Sub18_2165 == var9) {
					client.aBool2204 = true;
					client.anInt2205 = var13;
					client.anInt2032 = var19;
				}

				if (!var9.aBool1263 || ((var15 < var17) && (var16 < var22))) {
					var18 = Class81.anInt668;
					var20 = Class81.anInt673;
					if (Class81.anInt678 != 0) {
						var18 = Class81.anInt682;
						var20 = Class81.anInt680;
					}

					if (var9.anInt1162 == 1337) {
						if (!client.aBool2037 && !client.aBool2047 && (var18 >= var15) && (var20 >= var16)
								&& (var18 < var17) && (var20 < var22))
							Class63_Sub1.method580(var18, var20, var15, var16);
					} else if (var9.anInt1162 == 1338)
						Class131_Sub20_Sub4.method717(var9, var13, var19);
					else {
						if (!client.aBool2047 && (var18 >= var15) && (var20 >= var16) && (var18 < var17)
								&& (var20 < var22))
							Class131_Sub20_Sub7.method744(var9, var18 - var13, var20 - var19);

						if (var9.anInt1202 == 0) {
							if (!var9.aBool1263 && Class131_Sub20_Sub19_Sub4.method958(var9)
									&& (Class21.aClass131_Sub18_199 != var9))
								continue;

							method392(var0, var9.anInt1272, var15, var16, var17, var22, var13 - var9.anInt1281,
									var19 - var9.anInt1180);
							if (null != var9.aClass131_Sub18Array1171)
								method392(var9.aClass131_Sub18Array1171, var9.anInt1272, var15, var16, var17, var22,
										var13 - var9.anInt1281, var19 - var9.anInt1180);

							final Class131_Sub7 var23 = (Class131_Sub7) client.aClass114_2184.method457(var9.anInt1272);
							if (var23 != null) {
								if ((var23.anInt1024 == 0) && (Class81.anInt668 >= var15) && (Class81.anInt673 >= var16)
										&& (Class81.anInt668 < var17) && (Class81.anInt673 < var22) && !client.aBool2047
										&& !client.aBool2269) {
									for (Class131_Sub10 var28 = (Class131_Sub10) client.aClass115_2222
											.method465(); null != var28; var28 = (Class131_Sub10) client.aClass115_2222
													.method468())
										if (var28.aBool1062) {
											var28.method501();
											var28.aClass131_Sub18_1057.aBool1282 = false;
										}

									if (Class12.anInt110 == 0) {
										client.aClass131_Sub18_2165 = null;
										client.aClass131_Sub18_2035 = null;
									}

									if (!client.aBool2047) {
										client.aStringArray2195[0] = "Cancel";
										client.aStringArray2172[0] = "";
										client.anIntArray2066[0] = 1006;
										client.anInt2166 = 1;
									}
								}

								Class7.method36(var23.anInt1025, var15, var16, var17, var22, var13, var19);
							}
						}

						if (var9.aBool1263) {
							Class131_Sub10 var31;
							if (!var9.aBool1290) {
								if (var9.aBool1252 && (Class81.anInt668 >= var15) && (Class81.anInt673 >= var16)
										&& (Class81.anInt668 < var17) && (Class81.anInt673 < var22))
									for (var31 = (Class131_Sub10) client.aClass115_2222
											.method465(); var31 != null; var31 = (Class131_Sub10) client.aClass115_2222
													.method468())
										if (var31.aBool1062
												&& (var31.aClass131_Sub18_1057.anObjectArray1258 == var31.anObjectArray1056))
											var31.method501();
							} else if ((Class81.anInt668 >= var15) && (Class81.anInt673 >= var16)
									&& (Class81.anInt668 < var17) && (Class81.anInt673 < var22)) {
								for (var31 = (Class131_Sub10) client.aClass115_2222
										.method465(); var31 != null; var31 = (Class131_Sub10) client.aClass115_2222
												.method468())
									if (var31.aBool1062) {
										var31.method501();
										var31.aClass131_Sub18_1057.aBool1282 = false;
									}

								if (Class12.anInt110 == 0) {
									client.aClass131_Sub18_2165 = null;
									client.aClass131_Sub18_2035 = null;
								}

								if (!client.aBool2047) {
									client.aStringArray2195[0] = "Cancel";
									client.aStringArray2172[0] = "";
									client.anIntArray2066[0] = 1006;
									client.anInt2166 = 1;
								}
							}

							boolean var30;
							if ((Class81.anInt668 >= var15) && (Class81.anInt673 >= var16) && (Class81.anInt668 < var17)
									&& (Class81.anInt673 < var22))
								var30 = true;
							else
								var30 = false;

							boolean var29 = false;
							if (((Class81.anInt666 == 1)
									|| (!RuntimeException_Sub1.aBool1954 && (Class81.anInt666 == 4))) && var30)
								var29 = true;

							boolean var21 = false;
							if (((Class81.anInt678 == 1)
									|| (!RuntimeException_Sub1.aBool1954 && (Class81.anInt678 == 4)))
									&& (Class81.anInt682 >= var15) && (Class81.anInt680 >= var16)
									&& (Class81.anInt682 < var17) && (Class81.anInt680 < var22))
								var21 = true;

							if (var21)
								Class49.method253(var9, Class81.anInt682 - var13, Class81.anInt680 - var19);

							if ((client.aClass131_Sub18_2165 != null) && (client.aClass131_Sub18_2165 != var9) && var30
									&& Class75.method340(Class49.method254(var9)))
								client.aClass131_Sub18_2136 = var9;

							if (var9 == client.aClass131_Sub18_2035) {
								client.aBool2201 = true;
								client.anInt2202 = var13;
								client.anInt2203 = var19;
							}

							if (var9.aBool1238) {
								Class131_Sub10 var12;
								if (var30 && (client.anInt2221 != 0) && (var9.anObjectArray1258 != null)) {
									var12 = new Class131_Sub10();
									var12.aBool1062 = true;
									var12.aClass131_Sub18_1057 = var9;
									var12.anInt1060 = client.anInt2221;
									var12.anObjectArray1056 = var9.anObjectArray1258;
									client.aClass115_2222.method471(var12);
								}

								if ((null != client.aClass131_Sub18_2165) || (Class100.aClass131_Sub18_786 != null)
										|| client.aBool2047) {
									var21 = false;
									var29 = false;
									var30 = false;
								}

								if (!var9.aBool1283 && var21) {
									var9.aBool1283 = true;
									if (var9.anObjectArray1240 != null) {
										var12 = new Class131_Sub10();
										var12.aBool1062 = true;
										var12.aClass131_Sub18_1057 = var9;
										var12.anInt1059 = Class81.anInt682 - var13;
										var12.anInt1060 = Class81.anInt680 - var19;
										var12.anObjectArray1056 = var9.anObjectArray1240;
										client.aClass115_2222.method471(var12);
									}
								}

								if (var9.aBool1283 && var29 && (null != var9.anObjectArray1275)) {
									var12 = new Class131_Sub10();
									var12.aBool1062 = true;
									var12.aClass131_Sub18_1057 = var9;
									var12.anInt1059 = Class81.anInt668 - var13;
									var12.anInt1060 = Class81.anInt673 - var19;
									var12.anObjectArray1056 = var9.anObjectArray1275;
									client.aClass115_2222.method471(var12);
								}

								if (var9.aBool1283 && !var29) {
									var9.aBool1283 = false;
									if (var9.anObjectArray1176 != null) {
										var12 = new Class131_Sub10();
										var12.aBool1062 = true;
										var12.aClass131_Sub18_1057 = var9;
										var12.anInt1059 = Class81.anInt668 - var13;
										var12.anInt1060 = Class81.anInt673 - var19;
										var12.anObjectArray1056 = var9.anObjectArray1176;
										client.aClass115_2224.method471(var12);
									}
								}

								if (var29 && (null != var9.anObjectArray1284)) {
									var12 = new Class131_Sub10();
									var12.aBool1062 = true;
									var12.aClass131_Sub18_1057 = var9;
									var12.anInt1059 = Class81.anInt668 - var13;
									var12.anInt1060 = Class81.anInt673 - var19;
									var12.anObjectArray1056 = var9.anObjectArray1284;
									client.aClass115_2222.method471(var12);
								}

								if (!var9.aBool1282 && var30) {
									var9.aBool1282 = true;
									if (var9.anObjectArray1244 != null) {
										var12 = new Class131_Sub10();
										var12.aBool1062 = true;
										var12.aClass131_Sub18_1057 = var9;
										var12.anInt1059 = Class81.anInt668 - var13;
										var12.anInt1060 = Class81.anInt673 - var19;
										var12.anObjectArray1056 = var9.anObjectArray1244;
										client.aClass115_2222.method471(var12);
									}
								}

								if (var9.aBool1282 && var30 && (var9.anObjectArray1169 != null)) {
									var12 = new Class131_Sub10();
									var12.aBool1062 = true;
									var12.aClass131_Sub18_1057 = var9;
									var12.anInt1059 = Class81.anInt668 - var13;
									var12.anInt1060 = Class81.anInt673 - var19;
									var12.anObjectArray1056 = var9.anObjectArray1169;
									client.aClass115_2222.method471(var12);
								}

								if (var9.aBool1282 && !var30) {
									var9.aBool1282 = false;
									if (null != var9.anObjectArray1278) {
										var12 = new Class131_Sub10();
										var12.aBool1062 = true;
										var12.aClass131_Sub18_1057 = var9;
										var12.anInt1059 = Class81.anInt668 - var13;
										var12.anInt1060 = Class81.anInt673 - var19;
										var12.anObjectArray1056 = var9.anObjectArray1278;
										client.aClass115_2224.method471(var12);
									}
								}

								if (var9.anObjectArray1256 != null) {
									var12 = new Class131_Sub10();
									var12.aClass131_Sub18_1057 = var9;
									var12.anObjectArray1056 = var9.anObjectArray1256;
									client.aClass115_2130.method471(var12);
								}

								Class131_Sub10 var11;
								int var25;
								int var26;
								int var27;
								if ((var9.anObjectArray1250 != null) && (client.anInt2027 > var9.anInt1190)) {
									if ((null != var9.anIntArray1251) && ((client.anInt2027 - var9.anInt1190) <= 32))
										label682: for (var25 = var9.anInt1190; var25 < client.anInt2027; ++var25) {
											var26 = client.anIntArray2145[var25 & 31];

											for (var27 = 0; var27 < var9.anIntArray1251.length; ++var27)
												if (var26 == var9.anIntArray1251[var27]) {
													var11 = new Class131_Sub10();
													var11.aClass131_Sub18_1057 = var9;
													var11.anObjectArray1056 = var9.anObjectArray1250;
													client.aClass115_2222.method471(var11);
													break label682;
												}
										}
									else {
										var12 = new Class131_Sub10();
										var12.aClass131_Sub18_1057 = var9;
										var12.anObjectArray1056 = var9.anObjectArray1250;
										client.aClass115_2222.method471(var12);
									}

									var9.anInt1190 = client.anInt2027;
								}

								if ((var9.anObjectArray1268 != null) && (client.anInt2212 > var9.anInt1286)) {
									if ((var9.anIntArray1253 != null) && ((client.anInt2212 - var9.anInt1286) <= 32))
										label658: for (var25 = var9.anInt1286; var25 < client.anInt2212; ++var25) {
											var26 = client.anIntArray2211[var25 & 31];

											for (var27 = 0; var27 < var9.anIntArray1253.length; ++var27)
												if (var9.anIntArray1253[var27] == var26) {
													var11 = new Class131_Sub10();
													var11.aClass131_Sub18_1057 = var9;
													var11.anObjectArray1056 = var9.anObjectArray1268;
													client.aClass115_2222.method471(var11);
													break label658;
												}
										}
									else {
										var12 = new Class131_Sub10();
										var12.aClass131_Sub18_1057 = var9;
										var12.anObjectArray1056 = var9.anObjectArray1268;
										client.aClass115_2222.method471(var12);
									}

									var9.anInt1286 = client.anInt2212;
								}

								if ((null != var9.anObjectArray1254) && (client.anInt2214 > var9.anInt1287)) {
									if ((var9.anIntArray1255 != null) && ((client.anInt2214 - var9.anInt1287) <= 32))
										label634: for (var25 = var9.anInt1287; var25 < client.anInt2214; ++var25) {
											var26 = client.anIntArray2213[var25 & 31];

											for (var27 = 0; var27 < var9.anIntArray1255.length; ++var27)
												if (var26 == var9.anIntArray1255[var27]) {
													var11 = new Class131_Sub10();
													var11.aClass131_Sub18_1057 = var9;
													var11.anObjectArray1056 = var9.anObjectArray1254;
													client.aClass115_2222.method471(var11);
													break label634;
												}
										}
									else {
										var12 = new Class131_Sub10();
										var12.aClass131_Sub18_1057 = var9;
										var12.anObjectArray1056 = var9.anObjectArray1254;
										client.aClass115_2222.method471(var12);
									}

									var9.anInt1287 = client.anInt2214;
								}

								if ((client.anInt2217 > var9.anInt1212) && (null != var9.anObjectArray1170)) {
									var12 = new Class131_Sub10();
									var12.aClass131_Sub18_1057 = var9;
									var12.anObjectArray1056 = var9.anObjectArray1170;
									client.aClass115_2222.method471(var12);
								}

								if ((client.anInt2216 > var9.anInt1212) && (null != var9.anObjectArray1149)) {
									var12 = new Class131_Sub10();
									var12.aClass131_Sub18_1057 = var9;
									var12.anObjectArray1056 = var9.anObjectArray1149;
									client.aClass115_2222.method471(var12);
								}

								if ((client.anInt2277 > var9.anInt1212) && (var9.anObjectArray1242 != null)) {
									var12 = new Class131_Sub10();
									var12.aClass131_Sub18_1057 = var9;
									var12.anObjectArray1056 = var9.anObjectArray1242;
									client.aClass115_2222.method471(var12);
								}

								if ((client.anInt2297 > var9.anInt1212) && (null != var9.anObjectArray1267)) {
									var12 = new Class131_Sub10();
									var12.aClass131_Sub18_1057 = var9;
									var12.anObjectArray1056 = var9.anObjectArray1267;
									client.aClass115_2222.method471(var12);
								}

								if ((client.anInt2270 > var9.anInt1212) && (var9.anObjectArray1195 != null)) {
									var12 = new Class131_Sub10();
									var12.aClass131_Sub18_1057 = var9;
									var12.anObjectArray1056 = var9.anObjectArray1195;
									client.aClass115_2222.method471(var12);
								}

								if ((client.anInt2263 > var9.anInt1212) && (var9.anObjectArray1155 != null)) {
									var12 = new Class131_Sub10();
									var12.aClass131_Sub18_1057 = var9;
									var12.anObjectArray1056 = var9.anObjectArray1155;
									client.aClass115_2222.method471(var12);
								}

								var9.anInt1212 = client.anInt2298;
								if (null != var9.anObjectArray1260)
									for (var25 = 0; var25 < client.anInt2246; ++var25) {
										final Class131_Sub10 var24 = new Class131_Sub10();
										var24.aClass131_Sub18_1057 = var9;
										var24.anInt1063 = client.anIntArray2248[var25];
										var24.anInt1064 = client.anIntArray2167[var25];
										var24.anObjectArray1056 = var9.anObjectArray1260;
										client.aClass115_2222.method471(var24);
									}
							}
						}

						if (!var9.aBool1263 && (client.aClass131_Sub18_2165 == null)
								&& (Class100.aClass131_Sub18_786 == null) && !client.aBool2047) {
							if (((var9.anInt1231 >= 0) || (var9.anInt1185 != 0)) && (Class81.anInt668 >= var15)
									&& (Class81.anInt673 >= var16) && (Class81.anInt668 < var17)
									&& (Class81.anInt673 < var22))
								if (var9.anInt1231 >= 0)
									Class21.aClass131_Sub18_199 = var0[var9.anInt1231];
								else
									Class21.aClass131_Sub18_199 = var9;

							if ((var9.anInt1202 == 8) && (Class81.anInt668 >= var15) && (Class81.anInt673 >= var16)
									&& (Class81.anInt668 < var17) && (Class81.anInt673 < var22))
								Class131_Sub20_Sub1.aClass131_Sub18_1356 = var9;

							if (var9.anInt1182 > var9.anInt1291)
								Class72.method333(var9, var13 + var9.anInt1173, var19, var9.anInt1291, var9.anInt1182,
										Class81.anInt668, Class81.anInt673);
						}
					}
				}
			}
		}

	}

	static void method393(final Class131_Sub20_Sub17_Sub4_Sub1 var0, final Class131_Sub20_Sub17_Sub4_Sub1 var1,
			final Class131_Sub20_Sub17_Sub4_Sub1 var2, final boolean var3) {
		if (var3) {
			NpcFlags.anInt36 = (Class2.anInt7 - client.anInt2238) / 2;
			NpcFlags.anInt42 = 202 + NpcFlags.anInt36;
		}

		if (NpcFlags.aBool33)
			Class82.method359(var0, var1);
		else {
			if (var3) {
				NpcFlags.aClass131_Sub20_Sub17_Sub3_28.method966(NpcFlags.anInt36, 0);
				Class131_Sub20_Sub20.aClass131_Sub20_Sub17_Sub3_1652.method966(382 + NpcFlags.anInt36, 0);
				Class97.aClass131_Sub20_Sub17_Sub2_775
						.method950((NpcFlags.anInt36 + 382) - (Class97.aClass131_Sub20_Sub17_Sub2_775.anInt1790 / 2), 18);
			}

			int var5;
			if ((client.anInt2036 == 0) || (client.anInt2036 == 5)) {
				final byte var4 = 20;
				var0.method1056("RuneScape is loading - please wait...", NpcFlags.anInt42 + 180, 245 - var4, 16777215,
						-1);
				var5 = 253 - var4;
				Class131_Sub20_Sub17.method854((NpcFlags.anInt42 + 180) - 152, var5, 304, 34, 9179409);
				Class131_Sub20_Sub17.method854((NpcFlags.anInt42 + 180) - 151, 1 + var5, 302, 32, 0);
				Class131_Sub20_Sub17.method850((180 + NpcFlags.anInt42) - 150, 2 + var5, NpcFlags.anInt39 * 3, 30, 9179409);
				Class131_Sub20_Sub17.method850((NpcFlags.anInt39 * 3) + ((NpcFlags.anInt42 + 180) - 150), var5 + 2,
						300 - (NpcFlags.anInt39 * 3), 30, 0);
				var0.method1056(NpcFlags.aString51, NpcFlags.anInt42 + 180, 276 - var4, 16777215, -1);
			}

			String var6;
			int var10;
			short var24;
			int var25;
			short var26;
			if (client.anInt2036 == 20) {
				NpcFlags.aClass131_Sub20_Sub17_Sub2_25.method950(
						(NpcFlags.anInt42 + 180) - (NpcFlags.aClass131_Sub20_Sub17_Sub2_25.anInt1790 / 2),
						271 - (NpcFlags.aClass131_Sub20_Sub17_Sub2_25.anInt1791 / 2));
				var24 = 211;
				var0.method1056(NpcFlags.aString41, 180 + NpcFlags.anInt42, var24, 16776960, 0);
				var25 = var24 + 15;
				var0.method1056(NpcFlags.aString44, NpcFlags.anInt42 + 180, var25, 16776960, 0);
				var25 += 15;
				var0.method1056(NpcFlags.aString45, 180 + NpcFlags.anInt42, var25, 16776960, 0);
				var25 += 15;
				var25 += 10;
				if (NpcFlags.anInt35 != 4) {
					var0.method1053("Login: ", (180 + NpcFlags.anInt42) - 110, var25, 16777215, 0);
					var26 = 200;

					for (var6 = NpcFlags.username; var0.method1037(var6) > var26; var6 = var6.substring(0,
							var6.length() - 1))
						;

					var0.method1053(Class131_Sub20_Sub17_Sub4.method1054(var6), (180 + NpcFlags.anInt42) - 70, var25,
							16777215, 0);
					var25 += 15;
					final String var8 = "Password: ";
					final String var9 = NpcFlags.password;
					var10 = var9.length();
					final char[] var11 = new char[var10];

					for (int var12 = 0; var12 < var10; ++var12)
						var11[var12] = 42;

					final String var13 = new String(var11);
					var0.method1053(var8 + var13, (NpcFlags.anInt42 + 180) - 108, var25, 16777215, 0);
					var25 += 15;
				}
			}

			int var16;
			int var27;
			int var28;
			if ((client.anInt2036 == 10) || (client.anInt2036 == 11)) {
				NpcFlags.aClass131_Sub20_Sub17_Sub2_25.method950(NpcFlags.anInt42, 171);
				short var15;
				if (NpcFlags.anInt35 == 0) {
					var24 = 251;
					var0.method1056("Welcome to RuneScape", NpcFlags.anInt42 + 180, var24, 16776960, 0);
					var25 = var24 + 30;
					var5 = (180 + NpcFlags.anInt42) - 80;
					var15 = 291;
					NpcFlags.aClass131_Sub20_Sub17_Sub2_27.method950(var5 - 73, var15 - 20);
					var0.method1041("New User", var5 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var5 = 180 + NpcFlags.anInt42 + 80;
					NpcFlags.aClass131_Sub20_Sub17_Sub2_27.method950(var5 - 73, var15 - 20);
					var0.method1041("Existing User", var5 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (NpcFlags.anInt35 == 1) {
					var0.method1056(NpcFlags.aString31, 180 + NpcFlags.anInt42, 211, 16776960, 0);
					var24 = 236;
					var0.method1056(NpcFlags.aString41, 180 + NpcFlags.anInt42, var24, 16777215, 0);
					var25 = var24 + 15;
					var0.method1056(NpcFlags.aString44, 180 + NpcFlags.anInt42, var25, 16777215, 0);
					var25 += 15;
					var0.method1056(NpcFlags.aString45, 180 + NpcFlags.anInt42, var25, 16777215, 0);
					var25 += 15;
					var5 = (NpcFlags.anInt42 + 180) - 80;
					var15 = 321;
					NpcFlags.aClass131_Sub20_Sub17_Sub2_27.method950(var5 - 73, var15 - 20);
					var0.method1056("Continue", var5, var15 + 5, 16777215, 0);
					var5 = NpcFlags.anInt42 + 180 + 80;
					NpcFlags.aClass131_Sub20_Sub17_Sub2_27.method950(var5 - 73, var15 - 20);
					var0.method1056("Cancel", var5, var15 + 5, 16777215, 0);
				} else {
					short var17;
					if (NpcFlags.anInt35 == 2) {
						var24 = 211;
						var0.method1056(NpcFlags.aString41, 180 + NpcFlags.anInt42, var24, 16776960, 0);
						var25 = var24 + 15;
						var0.method1056(NpcFlags.aString44, NpcFlags.anInt42 + 180, var25, 16776960, 0);
						var25 += 15;
						var0.method1056(NpcFlags.aString45, NpcFlags.anInt42 + 180, var25, 16776960, 0);
						var25 += 15;
						var25 += 10;
						var0.method1053("Login: ", (180 + NpcFlags.anInt42) - 110, var25, 16777215, 0);
						var26 = 200;

						for (var6 = NpcFlags.username; var0.method1037(var6) > var26; var6 = var6.substring(1))
							;

						var0.method1053(
								Class131_Sub20_Sub17_Sub4.method1054(var6)
										+ ((NpcFlags.anInt50 == 0) & ((client.anInt2038 % 40) < 20)
												? Class103.method427(16776960) + "|" : ""),
								(180 + NpcFlags.anInt42) - 70, var25, 16777215, 0);
						var25 += 15;
						var0.method1053(
								"Password: " + Class68.method319(NpcFlags.password)
										+ ((NpcFlags.anInt50 == 1) & ((client.anInt2038 % 40) < 20)
												? Class103.method427(16776960) + "|" : ""),
								(180 + NpcFlags.anInt42) - 108, var25, 16777215, 0);
						var25 += 15;
						var16 = (180 + NpcFlags.anInt42) - 80;
						var17 = 321;
						NpcFlags.aClass131_Sub20_Sub17_Sub2_27.method950(var16 - 73, var17 - 20);
						var0.method1056("Login", var16, var17 + 5, 16777215, 0);
						var16 = 80 + 180 + NpcFlags.anInt42;
						NpcFlags.aClass131_Sub20_Sub17_Sub2_27.method950(var16 - 73, var17 - 20);
						var0.method1056("Cancel", var16, var17 + 5, 16777215, 0);
						var24 = 357;
						var1.method1056("Forgotten your password? <col=ffffff>Click here.", 180 + NpcFlags.anInt42, var24,
								16776960, 0);
					} else if (NpcFlags.anInt35 == 3) {
						var24 = 201;
						var0.method1056("Invalid username or password.", NpcFlags.anInt42 + 180, var24, 16776960, 0);
						var25 = var24 + 20;
						var1.method1056("For accounts created after 24th November 2010, please use your",
								NpcFlags.anInt42 + 180, var25, 16776960, 0);
						var25 += 15;
						var1.method1056("email address to login. Otherwise please login with your username.",
								NpcFlags.anInt42 + 180, var25, 16776960, 0);
						var25 += 15;
						var5 = 180 + NpcFlags.anInt42;
						var15 = 276;
						NpcFlags.aClass131_Sub20_Sub17_Sub2_27.method950(var5 - 73, var15 - 20);
						var2.method1056("Try again", var5, 5 + var15, 16777215, 0);
						var5 = 180 + NpcFlags.anInt42;
						var15 = 326;
						NpcFlags.aClass131_Sub20_Sub17_Sub2_27.method950(var5 - 73, var15 - 20);
						var2.method1056("Forgotten password?", var5, var15 + 5, 16777215, 0);
					} else if (NpcFlags.anInt35 == 4) {
						var0.method1056("Authenticator", NpcFlags.anInt42 + 180, 211, 16776960, 0);
						var24 = 236;
						var0.method1056(NpcFlags.aString41, NpcFlags.anInt42 + 180, var24, 16777215, 0);
						var25 = var24 + 15;
						var0.method1056(NpcFlags.aString44, NpcFlags.anInt42 + 180, var25, 16777215, 0);
						var25 += 15;
						var0.method1056(NpcFlags.aString45, NpcFlags.anInt42 + 180, var25, 16777215, 0);
						var25 += 15;
						var0.method1053(
								"PIN: " + Class68.method319(Class58.aString566)
										+ ((client.anInt2038 % 40) < 20 ? Class103.method427(16776960) + "|" : ""),
								(180 + NpcFlags.anInt42) - 108, var25, 16777215, 0);
						var25 -= 8;
						var0.method1053("Trust this computer", (180 + NpcFlags.anInt42) - 9, var25, 16776960, 0);
						var25 += 15;
						var0.method1053("for 30 days: ", (NpcFlags.anInt42 + 180) - 9, var25, 16776960, 0);
						var5 = ((NpcFlags.anInt42 + 180) - 9) + var0.method1037("for 30 days: ") + 15;
						var27 = var25 - var0.anInt1962;
						Class131_Sub20_Sub17_Sub2 var7;
						if (NpcFlags.aBool49)
							var7 = NpcFlags.aClass131_Sub20_Sub17_Sub2_30;
						else
							var7 = NpcFlags.aClass131_Sub20_Sub17_Sub2_29;

						var7.method950(var5, var27);
						var25 += 15;
						var28 = (180 + NpcFlags.anInt42) - 80;
						final short var18 = 321;
						NpcFlags.aClass131_Sub20_Sub17_Sub2_27.method950(var28 - 73, var18 - 20);
						var0.method1056("Continue", var28, 5 + var18, 16777215, 0);
						var28 = 180 + NpcFlags.anInt42 + 80;
						NpcFlags.aClass131_Sub20_Sub17_Sub2_27.method950(var28 - 73, var18 - 20);
						var0.method1056("Cancel", var28, 5 + var18, 16777215, 0);
						var1.method1056("<u=ff>Can\'t Log In?</u>", 180 + NpcFlags.anInt42, var18 + 36, 255, 0);
					} else if (NpcFlags.anInt35 == 5) {
						var0.method1056("Forgotten your password?", 180 + NpcFlags.anInt42, 201, 16776960, 0);
						var24 = 221;
						var2.method1056(NpcFlags.aString41, 180 + NpcFlags.anInt42, var24, 16776960, 0);
						var25 = var24 + 15;
						var2.method1056(NpcFlags.aString44, 180 + NpcFlags.anInt42, var25, 16776960, 0);
						var25 += 15;
						var2.method1056(NpcFlags.aString45, 180 + NpcFlags.anInt42, var25, 16776960, 0);
						var25 += 15;
						var25 += 14;
						var0.method1053("Username/email: ", (180 + NpcFlags.anInt42) - 145, var25, 16777215, 0);
						var26 = 174;

						for (var6 = NpcFlags.username; var0.method1037(var6) > var26; var6 = var6.substring(1))
							;

						var0.method1053(
								Class131_Sub20_Sub17_Sub4.method1054(var6)
										+ ((client.anInt2038 % 40) < 20 ? Class103.method427(16776960) + "|" : ""),
								(NpcFlags.anInt42 + 180) - 34, var25, 16777215, 0);
						var25 += 15;
						var16 = (180 + NpcFlags.anInt42) - 80;
						var17 = 321;
						NpcFlags.aClass131_Sub20_Sub17_Sub2_27.method950(var16 - 73, var17 - 20);
						var0.method1056("Recover", var16, 5 + var17, 16777215, 0);
						var16 = NpcFlags.anInt42 + 180 + 80;
						NpcFlags.aClass131_Sub20_Sub17_Sub2_27.method950(var16 - 73, var17 - 20);
						var0.method1056("Back", var16, 5 + var17, 16777215, 0);
					} else if (NpcFlags.anInt35 == 6) {
						var24 = 211;
						var0.method1056(NpcFlags.aString41, 180 + NpcFlags.anInt42, var24, 16776960, 0);
						var25 = var24 + 15;
						var0.method1056(NpcFlags.aString44, 180 + NpcFlags.anInt42, var25, 16776960, 0);
						var25 += 15;
						var0.method1056(NpcFlags.aString45, NpcFlags.anInt42 + 180, var25, 16776960, 0);
						var25 += 15;
						var5 = NpcFlags.anInt42 + 180;
						var15 = 321;
						NpcFlags.aClass131_Sub20_Sub17_Sub2_27.method950(var5 - 73, var15 - 20);
						var0.method1056("Back", var5, 5 + var15, 16777215, 0);
					}
				}
			}

			if (NpcFlags.anInt37 > 0) {
				var25 = NpcFlags.anInt37;
				var26 = 256;
				NpcFlags.anInt46 += 128 * var25;
				if (NpcFlags.anInt46 > Class62.anIntArray581.length) {
					NpcFlags.anInt46 -= Class62.anIntArray581.length;
					var27 = (int) (Math.random() * 12.0D);
					Class30.method134(Class131_Sub20_Sub19_Sub3.aClass131_Sub20_Sub17_Sub2Array1765[var27]);
				}

				var27 = 0;
				var16 = 128 * var25;
				var28 = 128 * (var26 - var25);

				int var19;
				int var31;
				for (var31 = 0; var31 < var28; ++var31) {
					var19 = Class49.anIntArray485[var27 + var16] - ((var25
							* Class62.anIntArray581[(NpcFlags.anInt46 + var27) & (Class62.anIntArray581.length - 1)])
							/ 6);
					if (var19 < 0)
						var19 = 0;

					Class49.anIntArray485[var27++] = var19;
				}

				int var20;
				for (var31 = var26 - var25; var31 < var26; ++var31) {
					var19 = 128 * var31;

					for (var20 = 0; var20 < 128; ++var20) {
						var10 = (int) (Math.random() * 100.0D);
						if ((var10 < 50) && (var20 > 10) && (var20 < 118))
							Class49.anIntArray485[var19 + var20] = 255;
						else
							Class49.anIntArray485[var20 + var19] = 0;
					}
				}

				if (NpcFlags.anInt26 > 0)
					NpcFlags.anInt26 -= var25 * 4;

				if (NpcFlags.anInt34 > 0)
					NpcFlags.anInt34 -= var25 * 4;

				if ((NpcFlags.anInt26 == 0) && (NpcFlags.anInt34 == 0)) {
					var31 = (int) (Math.random() * (2000 / var25));
					if (var31 == 0)
						NpcFlags.anInt26 = 1024;

					if (var31 == 1)
						NpcFlags.anInt34 = 1024;
				}

				for (var31 = 0; var31 < (var26 - var25); ++var31)
					NpcFlags.anIntArray32[var31] = NpcFlags.anIntArray32[var25 + var31];

				for (var31 = var26 - var25; var31 < var26; ++var31) {
					NpcFlags.anIntArray32[var31] = (int) ((Math.sin(NpcFlags.anInt52 / 14.0D) * 16.0D)
							+ (Math.sin(NpcFlags.anInt52 / 15.0D) * 14.0D) + (Math.sin(NpcFlags.anInt52 / 16.0D) * 12.0D));
					++NpcFlags.anInt52;
				}

				NpcFlags.anInt56 += var25;
				var31 = (var25 + (client.anInt2038 & 1)) / 2;
				if (var31 > 0) {
					for (var19 = 0; var19 < (NpcFlags.anInt56 * 100); ++var19) {
						var20 = (int) (Math.random() * 124.0D) + 2;
						var10 = (int) (Math.random() * 128.0D) + 128;
						Class49.anIntArray485[var20 + (var10 << 7)] = 192;
					}

					NpcFlags.anInt56 = 0;
					var19 = 0;

					label228: while (true) {
						int var21;
						if (var19 >= var26) {
							var19 = 0;

							while (true) {
								if (var19 >= 128)
									break label228;

								var20 = 0;

								for (var10 = -var31; var10 < var26; ++var10) {
									var21 = var10 * 128;
									if ((var31 + var10) < var26)
										var20 += Class30.anIntArray280[var21 + var19 + (var31 * 128)];

									if ((var10 - (var31 + 1)) >= 0)
										var20 -= Class30.anIntArray280[(var21 + var19) - ((1 + var31) * 128)];

									if (var10 >= 0)
										Class49.anIntArray485[var21 + var19] = var20 / ((2 * var31) + 1);
								}

								++var19;
							}
						}

						var20 = 0;
						var10 = 128 * var19;

						for (var21 = -var31; var21 < 128; ++var21) {
							if ((var21 + var31) < 128)
								var20 += Class49.anIntArray485[var31 + var21 + var10];

							if ((var21 - (var31 + 1)) >= 0)
								var20 -= Class49.anIntArray485[(var21 + var10) - (1 + var31)];

							if (var21 >= 0)
								Class30.anIntArray280[var10 + var21] = var20 / ((var31 * 2) + 1);
						}

						++var19;
					}
				}

				NpcFlags.anInt37 = 0;
			}

			Class61.method299();
			Class96.aClass131_Sub20_Sub17_Sub2Array767[Class50.aClass28_494.aBool252 ? 1 : 0]
					.method950((NpcFlags.anInt36 + 765) - 40, 463);
			if ((client.anInt2036 > 5) && (client.anInt2034 == 0))
				if (Class131_Sub20_Sub15.aClass131_Sub20_Sub17_Sub2_1603 != null) {
					var25 = 5 + NpcFlags.anInt36;
					var26 = 463;
					final byte var30 = 100;
					final byte var29 = 35;
					Class131_Sub20_Sub15.aClass131_Sub20_Sub17_Sub2_1603.method950(var25, var26);
					var0.method1056("World" + " " + client.anInt2123, (var30 / 2) + var25, ((var29 / 2) + var26) - 2,
							16777215, 0);
					if (Class109.aClass49_813 != null)
						var1.method1056("Loading...", (var30 / 2) + var25, 12 + var26 + (var29 / 2), 16777215, 0);
					else
						var1.method1056("Click to switch", (var30 / 2) + var25, (var29 / 2) + var26 + 12, 16777215, 0);
				} else
					Class131_Sub20_Sub15.aClass131_Sub20_Sub17_Sub2_1603 = Class83.method360(Class51.aClass100_Sub1_502,
							"sl_button", "");

			try {
				final Graphics var22 = Class29.aCanvas271.getGraphics();
				Class131_Sub20_Sub19_Sub5.aClass16_1839.method61(var22, 0, 0, -97860839);
			} catch (final Exception var23) {
				Class29.aCanvas271.repaint();
			}

		}
	}
}
