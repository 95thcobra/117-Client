import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class Class131_Sub7 extends Class131 {
	int anInt1024;
	int anInt1025;
	static Class48 aClass48_1026;
	static String aString1027;
	public static File aFile1028;
	public static String aString1030;
	public static int anInt1031;
	boolean aBool1029 = false;

	public static int method555() {
		return ++Class81.anInt667 - 1;
	}

	static final void method556(final int var0, final int var1, final int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3)
			for (int var4 = 0; var4 < 8; ++var4)
				Class26.anIntArrayArrayArray239[var0][var1 + var3][var2 + var4] = 0;

		if (var1 > 0)
			for (var3 = 1; var3 < 8; ++var3)
				Class26.anIntArrayArrayArray239[var0][var1][var3
						+ var2] = Class26.anIntArrayArrayArray239[var0][var1 - 1][var3 + var2];

		if (var2 > 0)
			for (var3 = 1; var3 < 8; ++var3)
				Class26.anIntArrayArrayArray239[var0][var1 + var3][var2] = Class26.anIntArrayArrayArray239[var0][var3
						+ var1][var2 - 1];

		if ((var1 > 0) && (Class26.anIntArrayArrayArray239[var0][var1 - 1][var2] != 0))
			Class26.anIntArrayArrayArray239[var0][var1][var2] = Class26.anIntArrayArrayArray239[var0][var1 - 1][var2];
		else if ((var2 > 0) && (Class26.anIntArrayArrayArray239[var0][var1][var2 - 1] != 0))
			Class26.anIntArrayArrayArray239[var0][var1][var2] = Class26.anIntArrayArrayArray239[var0][var1][var2 - 1];
		else if ((var1 > 0) && (var2 > 0) && (Class26.anIntArrayArrayArray239[var0][var1 - 1][var2 - 1] != 0))
			Class26.anIntArrayArrayArray239[var0][var1][var2] = Class26.anIntArrayArrayArray239[var0][var1 - 1][var2
					- 1];

	}

	static final void method557() {
		if (client.anInt2046 > 1)
			--client.anInt2046;

		if (client.anInt2080 > 0)
			--client.anInt2080;

		if (client.aBool2098) {
			client.aBool2098 = false;
			if (client.anInt2080 > 0)
				Class26.method121();
			else {
				Class32.method142(40);
				Class42.aClass86_421 = Class131_Sub20_Sub20.loginConnection;
				Class131_Sub20_Sub20.loginConnection = null;
			}

		} else {
			if (!client.aBool2047) {
				client.aStringArray2195[0] = "Cancel";
				client.aStringArray2172[0] = "";
				client.anIntArray2066[0] = 1006;
				client.anInt2166 = 1;
			}

			int var0;
			for (var0 = 0; (var0 < 100) && PacketDecoder.method279(); ++var0)
				;

			if (client.anInt2036 == 30)
				while (true) {
					final Class131_Sub24 var1 = (Class131_Sub24) Class135.aClass128_906.method492();
					boolean var31;
					if (var1 == null)
						var31 = false;
					else
						var31 = true;

					int var2;
					if (!var31) {
						final Object var3 = client.aClass40_2209.anObject414;
						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						synchronized (var3) {
							if (!client.aBool2191)
								client.aClass40_2209.anInt415 = 0;
							else if ((Class81.anInt678 != 0) || (client.aClass40_2209.anInt415 >= 40)) {
								client.secureBuffer.method871(86);
								client.secureBuffer.writeByte(0);
								var2 = client.secureBuffer.pos;
								var4 = 0;

								for (var5 = 0; (var5 < client.aClass40_2209.anInt415)
										&& ((client.secureBuffer.pos - var2) < 240); ++var5) {
									++var4;
									var6 = client.aClass40_2209.anIntArray417[var5];
									if (var6 < 0)
										var6 = 0;
									else if (var6 > 502)
										var6 = 502;

									var7 = client.aClass40_2209.anIntArray416[var5];
									if (var7 < 0)
										var7 = 0;
									else if (var7 > 764)
										var7 = 764;

									var8 = (var6 * 765) + var7;
									if ((client.aClass40_2209.anIntArray417[var5] == -1)
											&& (client.aClass40_2209.anIntArray416[var5] == -1)) {
										var7 = -1;
										var6 = -1;
										var8 = 524287;
									}

									if ((client.anInt2091 == var7) && (var6 == client.anInt2042)) {
										if (client.anInt2043 < 2047)
											++client.anInt2043;
									} else {
										var9 = var7 - client.anInt2091;
										client.anInt2091 = var7;
										var10 = var6 - client.anInt2042;
										client.anInt2042 = var6;
										if ((client.anInt2043 < 8) && (var9 >= -32) && (var9 <= 31) && (var10 >= -32)
												&& (var10 <= 31)) {
											var9 += 32;
											var10 += 32;
											client.secureBuffer
													.method586(var10 + (client.anInt2043 << 12) + (var9 << 6));
											client.anInt2043 = 0;
										} else if (client.anInt2043 < 8) {
											client.secureBuffer
													.method587(var8 + (client.anInt2043 << 19) + 8388608);
											client.anInt2043 = 0;
										} else {
											client.secureBuffer
													.writeInt(var8 + (client.anInt2043 << 19) + -1073741824);
											client.anInt2043 = 0;
										}
									}
								}

								client.secureBuffer
										.method593(client.secureBuffer.pos - var2);
								if (var4 >= client.aClass40_2209.anInt415)
									client.aClass40_2209.anInt415 = 0;
								else {
									client.aClass40_2209.anInt415 -= var4;

									for (var5 = 0; var5 < client.aClass40_2209.anInt415; ++var5) {
										client.aClass40_2209.anIntArray416[var5] = client.aClass40_2209.anIntArray416[var5
												+ var4];
										client.aClass40_2209.anIntArray417[var5] = client.aClass40_2209.anIntArray417[var5
												+ var4];
									}
								}
							}
						}

						if ((Class81.anInt678 == 1) || (!RuntimeException_Sub1.aBool1954 && (Class81.anInt678 == 4))
								|| (Class81.anInt678 == 2)) {
							long var12 = (Class81.aLong681 - client.aLong2196) / 50L;
							if (var12 > 4095L)
								var12 = 4095L;

							client.aLong2196 = Class81.aLong681;
							var4 = Class81.anInt680;
							if (var4 < 0)
								var4 = 0;
							else if (var4 > Class88.anInt723)
								var4 = Class88.anInt723;

							var5 = Class81.anInt682;
							if (var5 < 0)
								var5 = 0;
							else if (var5 > Class2.anInt7)
								var5 = Class2.anInt7;

							var6 = (int) var12;
							client.secureBuffer.method871(4);
							client.secureBuffer.method586((Class81.anInt678 == 2 ? 1 : 0) + (var6 << 1));
							client.secureBuffer.method586(var5);
							client.secureBuffer.method586(var4);
						}

						if (Class80.anInt659 > 0) {
							client.secureBuffer.method871(236);
							client.secureBuffer.method586(0);
							var0 = client.secureBuffer.pos;
							final long var14 = Class84.method366(780546663);

							for (var5 = 0; var5 < Class80.anInt659; ++var5) {
								long var16 = var14 - client.aLong2249;
								if (var16 > 16777215L)
									var16 = 16777215L;

								client.aLong2249 = var14;
								client.secureBuffer.method624((int) var16);
								client.secureBuffer.method613(Class80.anIntArray654[var5]);
							}

							client.secureBuffer
									.writeShortSize(client.secureBuffer.pos - var0);
						}

						if (client.anInt2117 > 0)
							--client.anInt2117;

						if (Class80.aBoolArray652[96] || Class80.aBoolArray652[97] || Class80.aBoolArray652[98]
								|| Class80.aBoolArray652[99])
							client.aBool2077 = true;

						if (client.aBool2077 && (client.anInt2117 <= 0)) {
							client.anInt2117 = 20;
							client.aBool2077 = false;
							client.secureBuffer.method871(6);
							client.secureBuffer.method618(client.anInt2110);
							client.secureBuffer.method620(client.anInt2111);
						}

						if (Class2.aBool8 && !client.aBool2044) {
							client.aBool2044 = true;
							client.secureBuffer.method871(255);
							client.secureBuffer.writeByte(1);
						}

						if (!Class2.aBool8 && client.aBool2044) {
							client.aBool2044 = false;
							client.secureBuffer.method871(255);
							client.secureBuffer.writeByte(0);
						}

						int var18;
						int var19;
						int[] var32;
						if (client.anInt2159 != Class39.anInt410) {
							client.anInt2159 = Class39.anInt410;
							var0 = Class39.anInt410;
							var32 = Class95.aClass131_Sub20_Sub17_Sub3_763.anIntArray1823;
							var4 = var32.length;

							for (var5 = 0; var5 < var4; ++var5)
								var32[var5] = 0;

							for (var5 = 1; var5 < 103; ++var5) {
								var6 = 24628 + ((103 - var5) * 2048);

								for (var7 = 1; var7 < 103; ++var7) {
									if ((Class26.aByteArrayArrayArray225[var0][var7][var5] & 24) == 0)
										Class65.aClass33_595.method154(var32, var6, 512, var0, var7, var5);

									if ((var0 < 3)
											&& ((Class26.aByteArrayArrayArray225[1 + var0][var7][var5] & 8) != 0))
										Class65.aClass33_595.method154(var32, var6, 512, 1 + var0, var7, var5);

									var6 += 4;
								}
							}

							var5 = (((238 + (int) (Math.random() * 20.0D)) - 10) << 16)
									+ (((238 + (int) (Math.random() * 20.0D)) - 10) << 8)
									+ ((238 + (int) (Math.random() * 20.0D)) - 10);
							var6 = ((238 + (int) (Math.random() * 20.0D)) - 10) << 16;
							Class95.aClass131_Sub20_Sub17_Sub3_763.method962();

							for (var7 = 1; var7 < 103; ++var7)
								for (var8 = 1; var8 < 103; ++var8) {
									if ((Class26.aByteArrayArrayArray225[var0][var8][var7] & 24) == 0)
										Class100_Sub1.method657(var0, var8, var7, var5, var6);

									if ((var0 < 3)
											&& ((Class26.aByteArrayArrayArray225[var0 + 1][var8][var7] & 8) != 0))
										Class100_Sub1.method657(1 + var0, var8, var7, var5, var6);
								}

							client.anInt2253 = 0;

							for (var7 = 0; var7 < 104; ++var7)
								for (var8 = 0; var8 < 104; ++var8) {
									var9 = Class65.aClass33_595.method149(Class39.anInt410, var7, var8);
									if (var9 != 0) {
										var9 = (var9 >> 14) & 32767;
										var10 = Class83.method362(var9).anInt1530;
										if (var10 >= 0) {
											var18 = var7;
											var19 = var8;
											if ((var10 != 22) && (var10 != 29) && (var10 != 34) && (var10 != 36)
													&& (var10 != 46) && (var10 != 47) && (var10 != 48)) {
												final int[][] var20 = client.aClass51Array2087[Class39.anInt410].anIntArrayArray501;

												for (int var21 = 0; var21 < 10; ++var21) {
													final int var22 = (int) (Math.random() * 4.0D);
													if ((var22 == 0) && (var18 > 0) && (var18 > (var7 - 3))
															&& ((var20[var18 - 1][var19] & 19136776) == 0))
														--var18;

													if ((var22 == 1) && (var18 < 103) && (var18 < (var7 + 3))
															&& ((var20[1 + var18][var19] & 19136896) == 0))
														++var18;

													if ((var22 == 2) && (var19 > 0) && (var19 > (var8 - 3))
															&& ((var20[var18][var19 - 1] & 19136770) == 0))
														--var19;

													if ((var22 == 3) && (var19 < 103) && (var19 < (var8 + 3))
															&& ((var20[var18][var19 + 1] & 19136800) == 0))
														++var19;
												}
											}

											client.aClass131_Sub20_Sub17_Sub3Array2256[client.anInt2253] = Class28.aClass131_Sub20_Sub17_Sub3Array255[var10];
											client.anIntArray2254[client.anInt2253] = var18;
											client.anIntArray2255[client.anInt2253] = var19;
											++client.anInt2253;
										}
									}
								}

							Class131_Sub20_Sub19_Sub5.aClass16_1839.method60();
						}

						if (client.anInt2036 != 30)
							return;

						Class7.method35();
						Class113.method456();
						++client.anInt2075;
						if (client.anInt2075 > 750) {
							if (client.anInt2080 > 0)
								Class26.method121();
							else {
								Class32.method142(40);
								Class42.aClass86_421 = Class131_Sub20_Sub20.loginConnection;
								Class131_Sub20_Sub20.loginConnection = null;
							}

							return;
						}

						var0 = GPI.anInt11;
						var32 = GPI.anIntArray17;

						for (var4 = 0; var4 < var0; ++var4) {
							final Player var23 = client.playerArray[var32[var4]];
							if (null != var23)
								Class131_Sub20_Sub19_Sub4.method957(var23);
						}

						Class131_Sub20_Sub3.method707();
						Class5.method25();
						++client.anInt2103;
						if (client.anInt2131 != 0) {
							client.anInt2247 += 20;
							if (client.anInt2247 >= 400)
								client.anInt2131 = 0;
						}

						if (Class21.aClass131_Sub18_194 != null) {
							++client.anInt2138;
							if (client.anInt2138 >= 15) {
								Class131_Sub20_Sub6.method734(Class21.aClass131_Sub18_194);
								Class21.aClass131_Sub18_194 = null;
							}
						}

						final Class131_Sub18 var34 = Class21.aClass131_Sub18_199;
						final Class131_Sub18 var33 = Class131_Sub20_Sub1.aClass131_Sub18_1356;
						Class21.aClass131_Sub18_199 = null;
						Class131_Sub20_Sub1.aClass131_Sub18_1356 = null;
						client.aClass131_Sub18_2136 = null;
						client.aBool2204 = false;
						client.aBool2201 = false;
						client.anInt2246 = 0;

						while (Class45.method225() && (client.anInt2246 < 128))
							if ((client.playerRights >= 2) && Class80.aBoolArray652[82]
									&& (Class131_Sub12.anInt1095 == 66)) {
								String var37 = "";

								Class131_Sub20_Sub8 var25;
								for (final Iterator var24 = Class32.aClass125_301.iterator(); var24
										.hasNext(); var37 = var37 + var25.aString1495 + '\u003a' + var25.aString1497
												+ '\n')
									var25 = (Class131_Sub20_Sub8) var24.next();

								Class61.aClipboard575.setContents(new StringSelection(var37), (ClipboardOwner) null);
							} else {
								client.anIntArray2248[client.anInt2246] = Class131_Sub12.anInt1095;
								client.anIntArray2167[client.anInt2246] = Class40.aChar413;
								++client.anInt2246;
							}

						if (client.anInt2128 != -1)
							Class7.method36(client.anInt2128, 0, 0, Class2.anInt7, Class88.anInt723, 0, 0);

						++client.anInt2298;

						while (true) {
							Class131_Sub10 var26;
							Class131_Sub18 var38;
							Class131_Sub18 var39;
							do {
								var26 = (Class131_Sub10) client.aClass115_2130.method466();
								if (null == var26)
									while (true) {
										do {
											var26 = (Class131_Sub10) client.aClass115_2224.method466();
											if (null == var26)
												while (true) {
													do {
														var26 = (Class131_Sub10) client.aClass115_2222.method466();
														if (null == var26) {
															Class17.method82();
															if (client.aClass131_Sub18_2165 != null) {
																Class131_Sub20_Sub6
																		.method734(client.aClass131_Sub18_2165);
																++Class12.anInt110;
																if (client.aBool2204 && client.aBool2201) {
																	var4 = Class81.anInt668;
																	var5 = Class81.anInt673;
																	var4 -= client.anInt2045;
																	var5 -= client.anInt2280;
																	if (var4 < client.anInt2202)
																		var4 = client.anInt2202;

																	if ((client.aClass131_Sub18_2165.anInt1173
																			+ var4) > (client.aClass131_Sub18_2035.anInt1173
																					+ client.anInt2202))
																		var4 = (client.anInt2202
																				+ client.aClass131_Sub18_2035.anInt1173)
																				- client.aClass131_Sub18_2165.anInt1173;

																	if (var5 < client.anInt2203)
																		var5 = client.anInt2203;

																	if ((var5
																			+ client.aClass131_Sub18_2165.anInt1291) > (client.aClass131_Sub18_2035.anInt1291
																					+ client.anInt2203))
																		var5 = (client.anInt2203
																				+ client.aClass131_Sub18_2035.anInt1291)
																				- client.aClass131_Sub18_2165.anInt1291;

																	var6 = var4 - client.anInt2205;
																	var7 = var5 - client.anInt2032;
																	var8 = client.aClass131_Sub18_2165.anInt1234;
																	if ((Class12.anInt110 > client.aClass131_Sub18_2165.anInt1235)
																			&& ((var6 > var8) || (var6 < -var8)
																					|| (var7 > var8) || (var7 < -var8)))
																		client.aBool2106 = true;

																	var9 = (var4 - client.anInt2202)
																			+ client.aClass131_Sub18_2035.anInt1281;
																	var10 = client.aClass131_Sub18_2035.anInt1180
																			+ (var5 - client.anInt2203);
																	Class131_Sub10 var11;
																	if ((client.aClass131_Sub18_2165.anObjectArray1246 != null)
																			&& client.aBool2106) {
																		var11 = new Class131_Sub10();
																		var11.aClass131_Sub18_1057 = client.aClass131_Sub18_2165;
																		var11.anInt1059 = var9;
																		var11.anInt1060 = var10;
																		var11.anObjectArray1056 = client.aClass131_Sub18_2165.anObjectArray1246;
																		NpcFlags.method24(var11, 200000);
																	}

																	if (Class81.anInt666 == 0) {
																		if (client.aBool2106) {
																			if (null != client.aClass131_Sub18_2165.anObjectArray1247) {
																				var11 = new Class131_Sub10();
																				var11.aClass131_Sub18_1057 = client.aClass131_Sub18_2165;
																				var11.anInt1059 = var9;
																				var11.anInt1060 = var10;
																				var11.aClass131_Sub18_1068 = client.aClass131_Sub18_2136;
																				var11.anObjectArray1056 = client.aClass131_Sub18_2165.anObjectArray1247;
																				NpcFlags.method24(var11, 200000);
																			}

																			if ((null != client.aClass131_Sub18_2136)
																					&& (Class13.method52(
																							client.aClass131_Sub18_2165) != null)) {
																				client.secureBuffer
																						.method871(131);
																				client.secureBuffer
																						.method618(
																								client.aClass131_Sub18_2136.anInt1168);
																				client.secureBuffer
																						.method619(
																								client.aClass131_Sub18_2136.anInt1159);
																				client.secureBuffer
																						.method586(
																								client.aClass131_Sub18_2165.anInt1168);
																				client.secureBuffer
																						.method626(
																								client.aClass131_Sub18_2136.anInt1272);
																				client.secureBuffer
																						.method619(
																								client.aClass131_Sub18_2165.anInt1159);
																				client.secureBuffer
																						.method627(
																								client.aClass131_Sub18_2165.anInt1272);
																			}
																		} else if (((client.anInt2210 == 1)
																				|| Class131_Sub20_Sub19_Sub2.method922(
																						client.anInt2166 - 1))
																				&& (client.anInt2166 > 2))
																			RuntimeException_Sub1.method1033(
																					client.anInt2045 + client.anInt2205,
																					client.anInt2032
																							+ client.anInt2280);
																		else if (client.anInt2166 > 0) {
																			var18 = client.anInt2045 + client.anInt2205;
																			var19 = client.anInt2032 + client.anInt2280;
																			Class39.method213(Class40.aClass2_418,
																					var18, var19);
																			Class40.aClass2_418 = null;
																		}

																		client.aClass131_Sub18_2165 = null;
																	}
																} else if (Class12.anInt110 > 1)
																	client.aClass131_Sub18_2165 = null;
															}

															if (Class100.aClass131_Sub18_786 != null) {
																Class131_Sub20_Sub6
																		.method734(Class100.aClass131_Sub18_786);
																++client.anInt2207;
																if (Class81.anInt666 == 0) {
																	if (client.aBool2144) {
																		if ((Class100.aClass131_Sub18_786 == Class131_Sub20_Sub2.aClass131_Sub18_1422)
																				&& (client.anInt2143 != client.anInt2140)) {
																			final Class131_Sub18 var41 = Class100.aClass131_Sub18_786;
																			byte var36 = 0;
																			if ((client.anInt2186 == 1)
																					&& (var41.anInt1162 == 206))
																				var36 = 1;

																			if (var41.anIntArray1292[client.anInt2143] <= 0)
																				var36 = 0;

																			var7 = Class49.method254(var41);
																			final boolean var35 = ((var7 >> 29)
																					& 1) != 0;
																			if (var35) {
																				var8 = client.anInt2140;
																				var9 = client.anInt2143;
																				var41.anIntArray1292[var9] = var41.anIntArray1292[var8];
																				var41.anIntArray1154[var9] = var41.anIntArray1154[var8];
																				var41.anIntArray1292[var8] = -1;
																				var41.anIntArray1154[var8] = 0;
																			} else if (var36 == 1) {
																				var8 = client.anInt2140;
																				var9 = client.anInt2143;

																				while (var9 != var8)
																					if (var8 > var9) {
																						var41.method669(var8 - 1, var8);
																						--var8;
																					} else if (var8 < var9) {
																						var41.method669(1 + var8, var8);
																						++var8;
																					}
																			} else
																				var41.method669(client.anInt2143,
																						client.anInt2140);

																			client.secureBuffer
																					.method871(79);
																			client.secureBuffer
																					.method619(client.anInt2140);
																			client.secureBuffer
																					.writeByte(var36);
																			client.secureBuffer
																					.method619(client.anInt2143);
																			client.secureBuffer.writeInt(
																					Class100.aClass131_Sub18_786.anInt1272);
																		}
																	} else if (((client.anInt2210 == 1)
																			|| Class131_Sub20_Sub19_Sub2
																					.method922(client.anInt2166 - 1))
																			&& (client.anInt2166 > 2))
																		RuntimeException_Sub1.method1033(
																				client.anInt2240, client.anInt2142);
																	else if (client.anInt2166 > 0) {
																		var4 = client.anInt2240;
																		var5 = client.anInt2142;
																		Class39.method213(Class40.aClass2_418, var4,
																				var5);
																		Class40.aClass2_418 = null;
																	}

																	client.anInt2138 = 10;
																	Class81.anInt678 = 0;
																	Class100.aClass131_Sub18_786 = null;
																} else if ((client.anInt2207 >= 5)
																		&& ((Class81.anInt668 > (5 + client.anInt2240))
																				|| (Class81.anInt668 < (client.anInt2240
																						- 5))
																				|| (Class81.anInt673 > (5
																						+ client.anInt2142))
																				|| (Class81.anInt673 < (client.anInt2142
																						- 5))))
																	client.aBool2144 = true;
															}

															if (Class33.anInt302 != -1) {
																var4 = Class33.anInt302;
																var5 = Class33.anInt335;
																client.secureBuffer.method871(146);
																client.secureBuffer.writeByte(5);
																client.secureBuffer
																		.method612(Class80.aBoolArray652[82]
																				? (Class80.aBoolArray652[81] ? 2 : 1)
																				: 0);
																client.secureBuffer
																		.method618(Class50.anInt491 + var5);
																client.secureBuffer.method586(
																		Class131_Sub20_Sub20.anInt1649 + var4);
																Class33.anInt302 = -1;
																client.anInt2083 = Class81.anInt682;
																client.anInt2135 = Class81.anInt680;
																client.anInt2131 = 1;
																client.anInt2247 = 0;
																client.anInt2218 = var4;
																client.anInt2258 = var5;
															}

															if (Class21.aClass131_Sub18_199 != var34) {
																if (var34 != null)
																	Class131_Sub20_Sub6.method734(var34);

																if (null != Class21.aClass131_Sub18_199)
																	Class131_Sub20_Sub6
																			.method734(Class21.aClass131_Sub18_199);
															}

															if ((Class131_Sub20_Sub1.aClass131_Sub18_1356 != var33)
																	&& (client.anInt2174 == client.anInt2175)) {
																if (null != var33)
																	Class131_Sub20_Sub6.method734(var33);

																if (null != Class131_Sub20_Sub1.aClass131_Sub18_1356)
																	Class131_Sub20_Sub6.method734(
																			Class131_Sub20_Sub1.aClass131_Sub18_1356);
															}

															if (Class131_Sub20_Sub1.aClass131_Sub18_1356 != null) {
																if (client.anInt2174 < client.anInt2175) {
																	++client.anInt2174;
																	if (client.anInt2175 == client.anInt2174)
																		Class131_Sub20_Sub6.method734(
																				Class131_Sub20_Sub1.aClass131_Sub18_1356);
																}
															} else if (client.anInt2174 > 0)
																--client.anInt2174;

															var4 = Class131_Sub11.myPlayer.anInt1718
																	+ client.anInt2119;
															var5 = Class131_Sub11.myPlayer.anInt1759
																	+ client.anInt2093;
															if (((Class26.anInt240 - var4) < -500)
																	|| ((Class26.anInt240 - var4) > 500)
																	|| ((Class42.anInt423 - var5) < -500)
																	|| ((Class42.anInt423 - var5) > 500)) {
																Class26.anInt240 = var4;
																Class42.anInt423 = var5;
															}

															if (var4 != Class26.anInt240)
																Class26.anInt240 += (var4 - Class26.anInt240) / 16;

															if (Class42.anInt423 != var5)
																Class42.anInt423 += (var5 - Class42.anInt423) / 16;

															if ((Class81.anInt666 == 4)
																	&& RuntimeException_Sub1.aBool1954) {
																var6 = Class81.anInt673 - client.anInt2208;
																client.anInt2173 = var6 * 2;
																client.anInt2208 = (var6 != -1) && (var6 != 1)
																		? (Class81.anInt673 + client.anInt2208) / 2
																		: Class81.anInt673;
																var7 = client.anInt2108 - Class81.anInt668;
																client.anInt2112 = var7 * 2;
																client.anInt2108 = (var7 != -1) && (var7 != 1)
																		? (Class81.anInt668 + client.anInt2108) / 2
																		: Class81.anInt668;
															} else {
																if (Class80.aBoolArray652[96])
																	client.anInt2112 += (-24 - client.anInt2112) / 2;
																else if (Class80.aBoolArray652[97])
																	client.anInt2112 += (24 - client.anInt2112) / 2;
																else
																	client.anInt2112 /= 2;

																if (Class80.aBoolArray652[98])
																	client.anInt2173 += (12 - client.anInt2173) / 2;
																else if (Class80.aBoolArray652[99])
																	client.anInt2173 += (-12 - client.anInt2173) / 2;
																else
																	client.anInt2173 /= 2;

																client.anInt2208 = Class81.anInt673;
																client.anInt2108 = Class81.anInt668;
															}

															client.anInt2111 = (client.anInt2111
																	+ (client.anInt2112 / 2)) & 2047;
															client.anInt2110 += client.anInt2173 / 2;
															if (client.anInt2110 < 128)
																client.anInt2110 = 128;

															if (client.anInt2110 > 383)
																client.anInt2110 = 383;

															var6 = Class26.anInt240 >> 7;
															var7 = Class42.anInt423 >> 7;
															var8 = Class18.method88(Class26.anInt240, Class42.anInt423,
																	Class39.anInt410);
															var9 = 0;
															int var27;
															if ((var6 > 3) && (var7 > 3) && (var6 < 100)
																	&& (var7 < 100))
																for (var10 = var6 - 4; var10 <= (var6 + 4); ++var10)
																	for (var18 = var7
																			- 4; var18 <= (var7 + 4); ++var18) {
																		var19 = Class39.anInt410;
																		if ((var19 < 3)
																				&& ((Class26.aByteArrayArrayArray225[1][var10][var18]
																						& 2) == 2))
																			++var19;

																		var27 = var8
																				- Class26.anIntArrayArrayArray239[var19][var10][var18];
																		if (var27 > var9)
																			var9 = var27;
																	}

															var10 = var9 * 192;
															if (var10 > 98048)
																var10 = 98048;

															if (var10 < '\u8000')
																var10 = '\u8000';

															if (var10 > client.anInt2291)
																client.anInt2291 += (var10 - client.anInt2291) / 24;
															else if (var10 < client.anInt2291)
																client.anInt2291 += (var10 - client.anInt2291) / 80;

															if (client.aBool2271) {
																var4 = 64 + (client.anInt2305 * 128);
																var5 = 64 + (Class31.anInt296 * 128);
																var6 = Class18.method88(var4, var5, Class39.anInt410)
																		- Class131_Sub20_Sub7.anInt1493;
																if (Class139.anInt917 < var4) {
																	Class139.anInt917 += (((var4 - Class139.anInt917)
																			* Class131_Sub10.anInt1067) / 1000)
																			+ Class72.anInt618;
																	if (Class139.anInt917 > var4)
																		Class139.anInt917 = var4;
																}

																if (Class139.anInt917 > var4) {
																	Class139.anInt917 -= Class72.anInt618
																			+ (((Class139.anInt917 - var4)
																					* Class131_Sub10.anInt1067) / 1000);
																	if (Class139.anInt917 < var4)
																		Class139.anInt917 = var4;
																}

																if (Class46.anInt452 < var6) {
																	Class46.anInt452 += Class72.anInt618
																			+ ((Class131_Sub10.anInt1067
																					* (var6 - Class46.anInt452))
																					/ 1000);
																	if (Class46.anInt452 > var6)
																		Class46.anInt452 = var6;
																}

																if (Class46.anInt452 > var6) {
																	Class46.anInt452 -= Class72.anInt618
																			+ ((Class131_Sub10.anInt1067
																					* (Class46.anInt452 - var6))
																					/ 1000);
																	if (Class46.anInt452 < var6)
																		Class46.anInt452 = var6;
																}

																if (Class1.anInt1 < var5) {
																	Class1.anInt1 += Class72.anInt618
																			+ (((var5 - Class1.anInt1)
																					* Class131_Sub10.anInt1067) / 1000);
																	if (Class1.anInt1 > var5)
																		Class1.anInt1 = var5;
																}

																if (Class1.anInt1 > var5) {
																	Class1.anInt1 -= Class72.anInt618
																			+ (((Class1.anInt1 - var5)
																					* Class131_Sub10.anInt1067) / 1000);
																	if (Class1.anInt1 < var5)
																		Class1.anInt1 = var5;
																}

																var4 = (Class78.anInt640 * 128) + 64;
																var5 = (Class131_Sub20_Sub13.anInt1577 * 128) + 64;
																var6 = Class18.method88(var4, var5, Class39.anInt410)
																		- Class80.anInt664;
																var7 = var4 - Class139.anInt917;
																var8 = var6 - Class46.anInt452;
																var9 = var5 - Class1.anInt1;
																var10 = (int) Math.sqrt((var7 * var7) + (var9 * var9));
																var18 = (int) (Math.atan2(var8, var10) * 325.949D)
																		& 2047;
																var19 = (int) (Math.atan2(var7, var9) * -325.949D)
																		& 2047;
																if (var18 < 128)
																	var18 = 128;

																if (var18 > 383)
																	var18 = 383;

																if (Class75.anInt633 < var18) {
																	Class75.anInt633 += Class90.anInt729
																			+ (((var18 - Class75.anInt633)
																					* Class29.anInt263) / 1000);
																	if (Class75.anInt633 > var18)
																		Class75.anInt633 = var18;
																}

																if (Class75.anInt633 > var18) {
																	Class75.anInt633 -= Class90.anInt729
																			+ (((Class75.anInt633 - var18)
																					* Class29.anInt263) / 1000);
																	if (Class75.anInt633 < var18)
																		Class75.anInt633 = var18;
																}

																var27 = var19 - Class131_Sub20_Sub1.anInt1371;
																if (var27 > 1024)
																	var27 -= 2048;

																if (var27 < -1024)
																	var27 += 2048;

																if (var27 > 0) {
																	Class131_Sub20_Sub1.anInt1371 += ((var27
																			* Class29.anInt263) / 1000)
																			+ Class90.anInt729;
																	Class131_Sub20_Sub1.anInt1371 &= 2047;
																}

																if (var27 < 0) {
																	Class131_Sub20_Sub1.anInt1371 -= ((Class29.anInt263
																			* -var27) / 1000) + Class90.anInt729;
																	Class131_Sub20_Sub1.anInt1371 &= 2047;
																}

																int var28 = var19 - Class131_Sub20_Sub1.anInt1371;
																if (var28 > 1024)
																	var28 -= 2048;

																if (var28 < -1024)
																	var28 += 2048;

																if (((var28 < 0) && (var27 > 0))
																		|| ((var28 > 0) && (var27 < 0)))
																	Class131_Sub20_Sub1.anInt1371 = var19;
															}

															for (var4 = 0; var4 < 5; ++var4)
																++client.anIntArray2276[var4];

															aClass48_1026.method246();
															var4 = method555();
															var5 = Class80.anInt662;
															if ((var4 > 15000) && (var5 > 15000)) {
																client.anInt2080 = 250;
																Class81.anInt667 = 14500;
																client.secureBuffer.method871(74);
															}

															++client.anInt2082;
															if (client.anInt2082 > 500) {
																client.anInt2082 = 0;
																var7 = (int) (Math.random() * 8.0D);
																if ((var7 & 1) == 1)
																	client.anInt2119 += client.anInt2285;

																if ((var7 & 2) == 2)
																	client.anInt2093 += client.anInt2094;

																if ((var7 & 4) == 4)
																	client.anInt2095 += client.anInt2026;
															}

															if (client.anInt2119 < -50)
																client.anInt2285 = 2;

															if (client.anInt2119 > 50)
																client.anInt2285 = -2;

															if (client.anInt2093 < -55)
																client.anInt2094 = 2;

															if (client.anInt2093 > 55)
																client.anInt2094 = -2;

															if (client.anInt2095 < -40)
																client.anInt2026 = 1;

															if (client.anInt2095 > 40)
																client.anInt2026 = -1;

															++client.anInt2096;
															if (client.anInt2096 > 500) {
																client.anInt2096 = 0;
																var7 = (int) (Math.random() * 8.0D);
																if ((var7 & 1) == 1)
																	client.anInt2236 += client.anInt2099;

																if ((var7 & 2) == 2)
																	client.anInt2100 += client.anInt2239;
															}

															if (client.anInt2236 < -60)
																client.anInt2099 = 2;

															if (client.anInt2236 > 60)
																client.anInt2099 = -2;

															if (client.anInt2100 < -20)
																client.anInt2239 = 1;

															if (client.anInt2100 > 10)
																client.anInt2239 = -1;

															for (Class126_Sub1 var40 = (Class126_Sub1) client.aClass112_2293
																	.method453(); var40 != null; var40 = (Class126_Sub1) client.aClass112_2293
																			.method454())
																if (var40.anInt954 < ((Class84.method366(780546663)
																		/ 1000L) - 5L)) {
																	if (var40.aShort950 > 0)
																		Class131_Sub20_Sub15.method792(5, "",
																				var40.aString949 + " has logged in.");

																	if (var40.aShort950 == 0)
																		Class131_Sub20_Sub15.method792(5, "",
																				var40.aString949 + " has logged out.");

																	var40.method490();
																}

															++client.anInt2076;
															if (client.anInt2076 > 50)
																client.secureBuffer.method871(144);

															try {
																if ((Class131_Sub20_Sub20.loginConnection != null)
																		&& (client.secureBuffer.pos > 0)) {
																	Class131_Sub20_Sub20.loginConnection.write(
																			client.secureBuffer.data,
																			0,
																			client.secureBuffer.pos);
																	client.secureBuffer.pos = 0;
																	client.anInt2076 = 0;
																}
															} catch (final IOException var29) {
																if (client.anInt2080 > 0)
																	Class26.method121();
																else {
																	Class32.method142(40);
																	Class42.aClass86_421 = Class131_Sub20_Sub20.loginConnection;
																	Class131_Sub20_Sub20.loginConnection = null;
																}
															}

															return;
														}

														var38 = var26.aClass131_Sub18_1057;
														if (var38.anInt1159 < 0)
															break;

														var39 = Class88.method377(var38.anInt1177);
													} while ((null == var39) || (var39.aClass131_Sub18Array1171 == null)
															|| (var38.anInt1159 >= var39.aClass131_Sub18Array1171.length)
															|| (var39.aClass131_Sub18Array1171[var38.anInt1159] != var38));

													NpcFlags.method24(var26, 200000);
												}

											var38 = var26.aClass131_Sub18_1057;
											if (var38.anInt1159 < 0)
												break;

											var39 = Class88.method377(var38.anInt1177);
										} while ((var39 == null) || (var39.aClass131_Sub18Array1171 == null)
												|| (var38.anInt1159 >= var39.aClass131_Sub18Array1171.length)
												|| (var38 != var39.aClass131_Sub18Array1171[var38.anInt1159]));

										NpcFlags.method24(var26, 200000);
									}

								var38 = var26.aClass131_Sub18_1057;
								if (var38.anInt1159 < 0)
									break;

								var39 = Class88.method377(var38.anInt1177);
							} while ((var39 == null) || (null == var39.aClass131_Sub18Array1171)
									|| (var38.anInt1159 >= var39.aClass131_Sub18Array1171.length)
									|| (var38 != var39.aClass131_Sub18Array1171[var38.anInt1159]));

							NpcFlags.method24(var26, 200000);
						}
					}

					client.secureBuffer.method871(150);
					client.secureBuffer.writeByte(0);
					var2 = client.secureBuffer.pos;
					Class63_Sub1.method581(client.secureBuffer);
					client.secureBuffer.method593(client.secureBuffer.pos - var2);
				}
		}
	}

	static void method558() {
		Class131_Sub11.aClass114_1074 = new Class114(32);
	}
}
