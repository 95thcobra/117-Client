import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.net.URL;

public final class client extends Applet_Sub1 {
	/**
	 *
	 */
	private static final long serialVersionUID = 1418518212584391257L;
	static int anInt2305;
	static int anInt2038 = 0;
	static int anInt2221;
	static int anInt2114;
	static int anInt2084;
	static int anInt2235;
	static long aLong2029;
	static boolean aBool2237;
	static int anInt2215;
	static int anInt2141;
	static int anInt2227;
	static int anInt2303;
	static int anInt2197;
	static int anInt2226;
	static int anInt2103;
	static int anInt2036 = 0;
	static int anInt2059;
	static int anInt2078;
	static int anInt2060;
	static boolean aBool2191 = true;
	static int anInt2123 = 1;
	static int anInt2028 = 0;
	static int anInt2030 = 0;
	static boolean aBool2147 = false;
	static boolean aBool2033 = false;
	static int anInt2034 = 0;
	static boolean aBool2037 = true;
	static long aLong2196 = -1L;
	static int anInt2091 = -1;
	static int anInt2042 = -1;
	static int anInt2043 = -1;
	static boolean aBool2044 = true;
	static boolean aBool2092 = false;
	static int anInt2046 = 0;
	static int anInt2193 = 0;
	static int anInt2048 = 0;
	static int anInt2097 = 0;
	static int anInt2050 = 0;
	static int anInt2051 = 0;
	static int anInt2176 = 0;
	static int anInt2053 = 0;
	static int anInt2054 = 0;
	static Class50 aClass50_2055;
	static Class50 aClass50_2056;
	static int anInt2057;
	static int loginStage;
	static int anInt2079;
	static int anInt2063;
	static int anInt2064;
	static Class131_Sub20_Sub19_Sub2_Sub1[] aClass131_Sub20_Sub19_Sub2_Sub1Array2065;
	static int anInt2230;
	static int[] anIntArray2067;
	static int anInt2068;
	static int[] anIntArray2025;
	static Class131_Sub14_Sub1 secureBuffer;
	static Class131_Sub14_Sub1 loginBuffer;
	static Class131_Sub14_Sub1 gameBuffer;
	static int messageSize;
	static int incomingPacket;
	static int anInt2075;
	static int anInt2076;
	static int anInt2041;
	static int anInt2219;
	static int anInt2154;
	static int anInt2080;
	static boolean aBool2098;
	static Class51[] aClass51Array2087;
	static boolean aBool2088;
	static int[][][] anIntArrayArrayArray2089;
	static int[] anIntArray2024;
	static int anInt2119;
	static int anInt2285;
	static int anInt2093;
	static int anInt2094;
	static int anInt2095;
	static int anInt2026;
	static int anInt2082;
	static int anInt2236;
	static int anInt2099;
	static int anInt2100;
	static int anInt2239;
	static int anInt2096;
	static int anInt2104;
	static int anInt2105;
	static int anInt2101;
	static int anInt2107;
	static boolean aBool2272;
	static int anInt2109;
	static int anInt2110;
	static int anInt2111;
	static int anInt2112;
	static int anInt2173;
	static int anInt2108;
	static int anInt2208;
	static int anInt2116;
	static int anInt2117;
	static boolean aBool2077;
	static int anInt2291;
	static int anInt2120;
	static int anInt2121;
	static int[] anIntArray2122;
	static int[] anIntArray2264;
	static int[] anIntArray2124;
	static int[] anIntArray2125;
	static int[] anIntArray2126;
	static int[] anIntArray2127;
	static int[] anIntArray2223;
	static String[] aStringArray2071;
	static int[][] anIntArrayArray2074;
	static int anInt2287;
	static int anInt2132;
	static int anInt2133;
	static int anInt2083;
	static int anInt2135;
	static int anInt2247;
	static int anInt2131;
	static int anInt2138;
	static int anInt2139;
	static int anInt2140;
	static int anInt2240;
	static int anInt2142;
	static int anInt2143;
	static boolean aBool2144;
	static int anInt2207;
	static int anInt2146;
	static Player[] playerArray;
	static int myPlayerIndex;
	static int anInt2149;
	static int anInt2061;
	static int[] anIntArray2151;
	static int[] anIntArray2152;
	static String[] aStringArray2153;
	static boolean[] aBoolArray2113;
	static int[] anIntArray2155;
	static int anInt2200;
	static Class115[][][] aClass115ArrayArrayArray2306;
	static Class115 aClass115_2158;
	static Class115 aClass115_2284;
	static Class115 aClass115_2160;
	static int[] anIntArray2161;
	static int[] anIntArray2162;
	static int[] anIntArray2163;
	static int anInt2210;
	static boolean aBool2047;
	static int anInt2166;
	static int[] anIntArray2171;
	static int[] anIntArray2168;
	static int[] anIntArray2066;
	static int[] anIntArray2170;
	static String[] aStringArray2195;
	static String[] aStringArray2172;
	static int anInt2174;
	static int anInt2175;
	static int anInt2090;
	static String aString2177;
	static boolean aBool2178;
	static int anInt2179;
	static int anInt2206;
	static String aString2181;
	static String aString2182;
	static int anInt2128;
	static Class114 aClass114_2184;
	static int anInt2185;
	static int anInt2186;
	static Class131_Sub18 aClass131_Sub18_2049;
	static int anInt2188;
	static int anInt2189;
	static int playerRights;
	static int anInt2069;
	static boolean aBool2192;
	static boolean aBool2269;
	static boolean aBool2194;
	static Class131_Sub18 aClass131_Sub18_2198;
	static Class131_Sub18 aClass131_Sub18_2165;
	static Class131_Sub18 aClass131_Sub18_2035;
	static int anInt2045;
	static int anInt2280;
	static Class131_Sub18 aClass131_Sub18_2136;
	static boolean aBool2201;
	static int anInt2202;
	static int anInt2203;
	static boolean aBool2204;
	static int anInt2205;
	static int anInt2032;
	static boolean aBool2106;
	static int anInt2298;
	static int[] anIntArray2145;
	static int anInt2027;
	static int[] anIntArray2211;
	static int anInt2212;
	static int[] anIntArray2213;
	static int anInt2214;
	static int anInt2217;
	static int anInt2216;
	static int anInt2277;
	static int anInt2297;
	static int anInt2270;
	static int anInt2263;
	static Class115 aClass115_2222;
	static Class115 aClass115_2130;
	static Class115 aClass115_2224;
	static Class114 aClass114_2225;
	static boolean[] aBoolArray2252;
	static boolean[] aBoolArray2229;
	static boolean[] aBoolArray2164;
	static int[] anIntArray2231;
	static int[] anIntArray2232;
	static int[] anIntArray2233;
	static int[] anIntArray2234;
	static int anInt2073;
	static int anInt2238;
	static int anInt2118;
	static int[] anIntArray2085;
	static int anInt2241;
	static int anInt2242;
	static String aString2243;
	static long[] aLongArray2244;
	static int anInt2245;
	static int anInt2246;
	static int[] anIntArray2167;
	static int[] anIntArray2248;
	static long aLong2249;
	static String aString2250;
	static String aString2251;
	static int anInt2159;
	static int anInt2253;
	static int[] anIntArray2254;
	static int[] anIntArray2255;
	static Class131_Sub20_Sub17_Sub3[] aClass131_Sub20_Sub17_Sub3Array2256;
	static int anInt2218;
	static int anInt2258;
	static int anInt2259;
	static int anInt2260;
	static int anInt2052;
	static boolean aBool2262;
	static int anInt2228;
	static int anInt2086;
	static int anInt2289;
	static int[] anIntArray2266;
	static int[] anIntArray2267;
	static int[] anIntArray2268;
	static int[] anIntArray2257;
	static Class8[] aClass8Array2129;
	static boolean aBool2271;
	static boolean[] aBoolArray2261;
	static int[] anIntArray2273;
	static int[] anIntArray2274;
	static int[] anIntArray2275;
	static int[] anIntArray2276;
	static short aShort2081;
	static short aShort2278;
	static short aShort2279;
	static short aShort2180;
	static short aShort2281;
	static short aShort2282;
	static short aShort2157;
	static short aShort2300;
	static int anInt2199;
	static int anInt2286;
	static int anInt2169;
	static int anInt2288;
	static int anInt2283;
	static int anInt2290;
	static int anInt2134;
	static Class44[] aClass44Array2292;
	static Class112 aClass112_2293;
	static int anInt2294;
	static Class36[] aClass36Array2295;
	static Class91 aClass91_2296;
	static int anInt2040;
	static int anInt2137;
	static GrandExchangeOffer[] grandExchangeOffers;
	static long aLong2102;
	static long aLong2220;
	static Class63_Sub1 aClass63_Sub1_2302;
	static int[] anIntArray2058;
	static int[] anIntArray2304;
	static Class88 aClass88_2183;
	static String aString2150;
	static client aclient2265;
	static Class142 aClass142_2031;
	static Class75 aClass75_2301;
	static Class40 aClass40_2209;

	@Override
	protected final void method1081(final short var1) {
		++anInt2038;
		method1093();
		Class84.method365();
		Class98.method398();
		Class28.method123();
		final Class80 var2 = Class80.aClass80_655;
		int var3;
		synchronized (var2) {
			++Class80.anInt662;
			Class80.anInt653 = Class80.anInt663;
			Class80.anInt659 = 0;
			if (Class80.anInt651 >= 0)
				while (Class80.anInt651 != Class80.anInt661) {
					var3 = Class80.anIntArray658[Class80.anInt661];
					Class80.anInt661 = (1 + Class80.anInt661) & 127;
					if (var3 < 0)
						Class80.aBoolArray652[~var3] = false;
					else {
						if (!Class80.aBoolArray652[var3] && (Class80.anInt659 < (Class80.anIntArray654.length - 1)))
							Class80.anIntArray654[++Class80.anInt659 - 1] = var3;

						Class80.aBoolArray652[var3] = true;
					}
				}
			else {
				for (var3 = 0; var3 < 112; ++var3)
					Class80.aBoolArray652[var3] = false;

				Class80.anInt651 = Class80.anInt661;
			}

			Class80.anInt663 = Class80.anInt660;
		}

		final Class81 var59 = Class81.aClass81_669;
		synchronized (var59) {
			Class81.anInt666 = Class81.anInt676;
			Class81.anInt668 = Class81.anInt671;
			Class81.anInt673 = Class81.anInt672;
			Class81.anInt678 = Class81.anInt674;
			Class81.anInt682 = Class81.anInt675;
			Class81.anInt680 = Class81.anInt679;
			Class81.aLong681 = Class81.aLong677;
			Class81.anInt674 = 0;
		}

		if (Class131_Sub14_Sub1.aClass71_1644 != null) {
			final int var6 = Class131_Sub14_Sub1.aClass71_1644.method330(305248911);
			anInt2221 = var6;
		}

		if (anInt2036 == 0) {
			Class44.method224();
			Class28.method126();
		} else if (anInt2036 == 5) {
			Class58.method280(this);
			Class44.method224();
			Class28.method126();
		} else if ((anInt2036 != 10) && (anInt2036 != 11)) {
			if (anInt2036 == 20) {
				Class58.method280(this);
				LoginEncoder.method199();
			} else if (anInt2036 == 25) {
				Class131_Sub20_Sub11.method771(false);
				anInt2114 = 0;
				boolean var60 = true;

				for (var3 = 0; var3 < Class77.aByteArrayArray636.length; ++var3) {
					if ((Class103.anIntArray798[var3] != -1) && (null == Class77.aByteArrayArray636[var3])) {
						Class77.aByteArrayArray636[var3] = Class29.aClass100_Sub1_268
								.method402(Class103.anIntArray798[var3], 0);
						if (Class77.aByteArrayArray636[var3] == null) {
							var60 = false;
							++anInt2114;
						}
					}

					if ((Class131_Sub20_Sub21.anIntArray1655[var3] != -1)
							&& (Class28.aByteArrayArray261[var3] == null)) {
						Class28.aByteArrayArray261[var3] = Class29.aClass100_Sub1_268.method403(
								Class131_Sub20_Sub21.anIntArray1655[var3], 0,
								Class131_Sub20_Sub19_Sub2.anIntArrayArray1743[var3]);
						if (null == Class28.aByteArrayArray261[var3]) {
							var60 = false;
							++anInt2114;
						}
					}
				}

				if (!var60)
					anInt2235 = 1;
				else {
					anInt2084 = 0;
					var60 = true;

					int var7;
					int var8;
					for (var3 = 0; var3 < Class77.aByteArrayArray636.length; ++var3) {
						final byte[] var4 = Class28.aByteArrayArray261[var3];
						if (var4 != null) {
							var7 = (64 * (Class131_Sub9.anIntArray1054[var3] >> 8)) - Class131_Sub20_Sub20.anInt1649;
							var8 = (64 * (Class131_Sub9.anIntArray1054[var3] & 255)) - Class50.anInt491;
							if (aBool2088) {
								var7 = 10;
								var8 = 10;
							}

							var60 &= Class46.method232(var4, var7, var8);
						}
					}

					if (!var60)
						anInt2235 = 2;
					else {
						if (anInt2235 != 0)
							Class5.method26("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);

						Class28.method123();
						Class32.method139();
						Class28.method123();
						Class65.aClass33_595.method190();
						Class28.method123();
						System.gc();

						for (var3 = 0; var3 < 4; ++var3)
							aClass51Array2087[var3].method259();

						int var9;
						for (var3 = 0; var3 < 4; ++var3)
							for (var9 = 0; var9 < 104; ++var9)
								for (var7 = 0; var7 < 104; ++var7)
									Class26.aByteArrayArrayArray225[var3][var9][var7] = 0;

						Class28.method123();
						Applet_Sub1.method1088();
						var3 = Class77.aByteArrayArray636.length;
						Class131_Sub20_Sub1.method689();
						Class131_Sub20_Sub11.method771(true);
						int var11;
						int var12;
						int var14;
						int var15;
						int var16;
						int var18;
						int var19;
						int var22;
						int var23;
						int var24;
						int var25;
						int var29;
						int var30;
						if (!aBool2088) {
							var9 = 0;

							label483: while (true) {
								byte[] var10;
								if (var9 >= var3) {
									for (var9 = 0; var9 < var3; ++var9) {
										var7 = ((Class131_Sub9.anIntArray1054[var9] >> 8) * 64)
												- Class131_Sub20_Sub20.anInt1649;
										var8 = ((Class131_Sub9.anIntArray1054[var9] & 255) * 64) - Class50.anInt491;
										var10 = Class77.aByteArrayArray636[var9];
										if ((var10 == null) && (Class131_Sub10.anInt1061 < 800)) {
											Class28.method123();
											Class62.method300(var7, var8, 64, 64);
										}
									}

									Class131_Sub20_Sub11.method771(true);
									var9 = 0;

									while (true) {
										if (var9 >= var3)
											break label483;

										final byte[] var5 = Class28.aByteArrayArray261[var9];
										if (var5 != null) {
											var8 = (64 * (Class131_Sub9.anIntArray1054[var9] >> 8))
													- Class131_Sub20_Sub20.anInt1649;
											var19 = (64 * (Class131_Sub9.anIntArray1054[var9] & 255))
													- Class50.anInt491;
											Class28.method123();
											final Class33 var20 = Class65.aClass33_595;
											final Class51[] var21 = aClass51Array2087;
											final DataBuffer var61 = new DataBuffer(var5);
											var14 = -1;

											while (true) {
												var15 = var61.method606();
												if (var15 == 0)
													break;

												var14 += var15;
												var16 = 0;

												while (true) {
													var18 = var61.method606();
													if (var18 == 0)
														break;

													var16 += var18 - 1;
													var22 = var16 & 63;
													var23 = (var16 >> 6) & 63;
													var24 = var16 >> 12;
													var25 = var61.method595();
													final int var26 = var25 >> 2;
													final int var27 = var25 & 3;
													final int var28 = var8 + var23;
													var29 = var19 + var22;
													if ((var28 > 0) && (var29 > 0) && (var28 < 103) && (var29 < 103)) {
														var30 = var24;
														if ((Class26.aByteArrayArrayArray225[1][var28][var29] & 2) == 2)
															var30 = var24 - 1;

														Class51 var31 = null;
														if (var30 >= 0)
															var31 = var21[var30];

														Class7.method33(var24, var28, var29, var14, var27, var26, var20,
																var31);
													}
												}
											}
										}

										++var9;
									}
								}

								var7 = (64 * (Class131_Sub9.anIntArray1054[var9] >> 8))
										- Class131_Sub20_Sub20.anInt1649;
								var8 = (64 * (Class131_Sub9.anIntArray1054[var9] & 255)) - Class50.anInt491;
								var10 = Class77.aByteArrayArray636[var9];
								if (null != var10) {
									Class28.method123();
									var11 = (Class105.anInt808 * 8) - 48;
									var12 = (Class131_Sub10.anInt1061 * 8) - 48;
									final Class51[] var13 = aClass51Array2087;
									var14 = 0;

									label480: while (true) {
										if (var14 >= 4) {
											final DataBuffer var17 = new DataBuffer(var10);
											var15 = 0;

											while (true) {
												if (var15 >= 4)
													break label480;

												for (var16 = 0; var16 < 64; ++var16)
													for (var18 = 0; var18 < 64; ++var18)
														Class35.method204(var17, var15, var16 + var7, var8 + var18,
																var11, var12, 0);

												++var15;
											}
										}

										for (var15 = 0; var15 < 64; ++var15)
											for (var16 = 0; var16 < 64; ++var16)
												if (((var7 + var15) > 0) && ((var7 + var15) < 103)
														&& ((var8 + var16) > 0) && ((var8 + var16) < 103))
													var13[var14].anIntArrayArray501[var7 + var15][var16
															+ var8] &= -16777217;

										++var14;
									}
								}

								++var9;
							}
						}

						int var32;
						if (aBool2088) {
							var9 = 0;

							label416: while (true) {
								if (var9 >= 4) {
									for (var9 = 0; var9 < 13; ++var9)
										for (var7 = 0; var7 < 13; ++var7) {
											var8 = anIntArrayArrayArray2089[0][var9][var7];
											if (var8 == -1)
												Class62.method300(8 * var9, 8 * var7, 8, 8);
										}

									Class131_Sub20_Sub11.method771(true);
									var9 = 0;

									while (true) {
										if (var9 >= 4)
											break label416;

										Class28.method123();

										for (var7 = 0; var7 < 13; ++var7)
											label373: for (var8 = 0; var8 < 13; ++var8) {
												var19 = anIntArrayArrayArray2089[var9][var7][var8];
												if (var19 != -1) {
													var11 = (var19 >> 24) & 3;
													var12 = (var19 >> 1) & 3;
													var32 = (var19 >> 14) & 1023;
													var14 = (var19 >> 3) & 2047;
													var15 = (var14 / 8) + ((var32 / 8) << 8);

													for (var16 = 0; var16 < Class131_Sub9.anIntArray1054.length; ++var16)
														if ((Class131_Sub9.anIntArray1054[var16] == var15)
																&& (null != Class28.aByteArrayArray261[var16])) {
															final byte[] var33 = Class28.aByteArrayArray261[var16];
															var22 = var7 * 8;
															var23 = var8 * 8;
															var24 = (var32 & 7) * 8;
															var25 = 8 * (var14 & 7);
															final Class33 var34 = Class65.aClass33_595;
															final Class51[] var35 = aClass51Array2087;
															final DataBuffer var36 = new DataBuffer(var33);
															var29 = -1;

															while (true) {
																var30 = var36.method606();
																if (var30 == 0)
																	continue label373;

																var29 += var30;
																int var37 = 0;

																while (true) {
																	final int var38 = var36.method606();
																	if (var38 == 0)
																		break;

																	var37 += var38 - 1;
																	final int var39 = var37 & 63;
																	final int var40 = (var37 >> 6) & 63;
																	final int var41 = var37 >> 12;
																	final int var42 = var36.method595();
																	final int var43 = var42 >> 2;
																	final int var44 = var42 & 3;
																	if ((var11 == var41) && (var40 >= var24)
																			&& (var40 < (var24 + 8)) && (var39 >= var25)
																			&& (var39 < (var25 + 8))) {
																		final Class131_Sub20_Sub9 var45 = Class83
																				.method362(var29);
																		final int var46 = var22 + Class131_Sub20_Sub12
																				.method775(var40 & 7, var39 & 7, var12,
																						var45.anInt1511,
																						var45.anInt1503, var44);
																		final int var48 = var40 & 7;
																		final int var49 = var39 & 7;
																		int var51 = var45.anInt1511;
																		int var52 = var45.anInt1503;
																		int var53;
																		if ((var44 & 1) == 1) {
																			var53 = var51;
																			var51 = var52;
																			var52 = var53;
																		}

																		final int var50 = var12 & 3;
																		int var54;
																		if (var50 == 0)
																			var54 = var49;
																		else if (var50 == 1)
																			var54 = 7 - var48 - (var51 - 1);
																		else if (var50 == 2)
																			var54 = 7 - var49 - (var52 - 1);
																		else
																			var54 = var48;

																		var53 = var23 + var54;
																		if ((var46 > 0) && (var53 > 0) && (var46 < 103)
																				&& (var53 < 103)) {
																			int var55 = var9;
																			if ((Class26.aByteArrayArrayArray225[1][var46][var53]
																					& 2) == 2)
																				var55 = var9 - 1;

																			Class51 var56 = null;
																			if (var55 >= 0)
																				var56 = var35[var55];

																			Class7.method33(var9, var46, var53, var29,
																					(var12 + var44) & 3, var43, var34,
																					var56);
																		}
																	}
																}
															}
														}
												}
											}

										++var9;
									}
								}

								Class28.method123();

								for (var7 = 0; var7 < 13; ++var7)
									for (var8 = 0; var8 < 13; ++var8) {
										boolean var62 = false;
										var11 = anIntArrayArrayArray2089[var9][var7][var8];
										if (var11 != -1) {
											var12 = (var11 >> 24) & 3;
											var32 = (var11 >> 1) & 3;
											var14 = (var11 >> 14) & 1023;
											var15 = (var11 >> 3) & 2047;
											var16 = ((var14 / 8) << 8) + (var15 / 8);

											for (var18 = 0; var18 < Class131_Sub9.anIntArray1054.length; ++var18)
												if ((Class131_Sub9.anIntArray1054[var18] == var16)
														&& (null != Class77.aByteArrayArray636[var18])) {
													Class69.method323(Class77.aByteArrayArray636[var18], var9, 8 * var7,
															var8 * 8, var12, (var14 & 7) * 8, 8 * (var15 & 7), var32,
															aClass51Array2087);
													var62 = true;
													break;
												}
										}

										if (!var62)
											Class131_Sub7.method556(var9, var7 * 8, 8 * var8);
									}

								++var9;
							}
						}

						Class131_Sub20_Sub11.method771(true);
						Class32.method139();
						Class28.method123();
						Class56.method278(Class65.aClass33_595, aClass51Array2087);
						Class131_Sub20_Sub11.method771(true);
						var9 = Class26.anInt226;
						if (var9 > Class39.anInt410)
							var9 = Class39.anInt410;

						if (var9 < (Class39.anInt410 - 1))
							var9 = Class39.anInt410 - 1;

						if (aBool2033)
							Class65.aClass33_595.method146(Class26.anInt226);
						else
							Class65.aClass33_595.method146(0);

						for (var7 = 0; var7 < 104; ++var7)
							for (var8 = 0; var8 < 104; ++var8)
								Class131_Sub19.method676(var7, var8);

						Class28.method123();
						Class72.method332();
						Class131_Sub20_Sub9.aClass121_1532.method481();
						if (null != Class131_Sub5.aFrame1003) {
							secureBuffer.method871(180);
							secureBuffer.writeInt(1057001181);
						}

						if (!aBool2088) {
							var7 = (Class105.anInt808 - 6) / 8;
							var8 = (6 + Class105.anInt808) / 8;
							var19 = (Class131_Sub10.anInt1061 - 6) / 8;
							var11 = (Class131_Sub10.anInt1061 + 6) / 8;

							for (var12 = var7 - 1; var12 <= (var8 + 1); ++var12)
								for (var32 = var19 - 1; var32 <= (var11 + 1); ++var32)
									if ((var12 < var7) || (var12 > var8) || (var32 < var19) || (var32 > var11)) {
										Class29.aClass100_Sub1_268.method416("m" + var12 + "_" + var32);
										Class29.aClass100_Sub1_268.method416("l" + var12 + "_" + var32);
									}
						}

						Class32.method142(30);
						Class28.method123();
						Class26.aByteArrayArrayArray227 = null;
						Class136.aByteArrayArrayArray907 = null;
						Class26.aByteArrayArrayArray224 = null;
						Class26.aByteArrayArrayArray229 = null;
						Class48.anIntArrayArrayArray477 = null;
						Class139.aByteArrayArrayArray916 = null;
						Class28.anIntArrayArray258 = null;
						Class26.anIntArray242 = null;
						Class26.anIntArray230 = null;
						Class26.anIntArray228 = null;
						Class26.anIntArray231 = null;
						Class126_Sub1.anIntArray951 = null;
						secureBuffer.method871(116);
						Class28.method126();
					}
				}
			}
		} else
			Class58.method280(this);

		if (anInt2036 == 30)
			Class131_Sub7.method557();
		else if ((anInt2036 == 40) || (anInt2036 == 45))
			LoginEncoder.method199();

	}

	@Override
	protected final void method1082(final int var1) {
		boolean var2;
		label259: {
			try {
				if (Class113.anInt830 == 2) {
					if (null == Class79.aClass131_Sub15_649) {
						Class79.aClass131_Sub15_649 = Class131_Sub15.method649(Class50.aClass100_495, Class24.anInt213,
								Class130.anInt901);
						if (Class79.aClass131_Sub15_649 == null) {
							var2 = false;
							break label259;
						}
					}

					if (Class36.aClass21_368 == null)
						Class36.aClass21_368 = new Class21(Class113.aClass100_831, Class113.aClass100_829);

					if (Class113.aClass131_Sub4_Sub3_832.method884(Class79.aClass131_Sub15_649, Class113.aClass100_835,
							Class36.aClass21_368, 22050)) {
						Class113.aClass131_Sub4_Sub3_832.method885();
						Class113.aClass131_Sub4_Sub3_832.method883(Class113.anInt833);
						Class113.aClass131_Sub4_Sub3_832.method887(Class79.aClass131_Sub15_649, Class50.aBool496);
						Class113.anInt830 = 0;
						Class79.aClass131_Sub15_649 = null;
						Class36.aClass21_368 = null;
						Class50.aClass100_495 = null;
						var2 = true;
						break label259;
					}
				}
			} catch (final Exception var17) {
				var17.printStackTrace();
				Class113.aClass131_Sub4_Sub3_832.method888();
				Class113.anInt830 = 0;
				Class79.aClass131_Sub15_649 = null;
				Class36.aClass21_368 = null;
				Class50.aClass100_495 = null;
			}

			var2 = false;
		}

		if (var2 && aBool2262 && (null != Class131_Sub20_Sub6.aClass17_1480))
			Class131_Sub20_Sub6.aClass17_1480.method68();

		int var7;
		if ((anInt2036 == 10) || (anInt2036 == 20) || (anInt2036 == 30))
			if ((aLong2029 != 0L) && (Class84.method366(780546663) > aLong2029)) {
				final int var5 = aBool2237 ? 2 : 1;
				aLong2029 = 0L;
				if (var5 >= 2)
					aBool2237 = true;
				else
					aBool2237 = false;

				Class97.method396();
				if (anInt2036 >= 25) {
					secureBuffer.method871(81);
					final Class131_Sub14_Sub1 var6 = secureBuffer;
					var7 = aBool2237 ? 2 : 1;
					var6.writeByte(var7);
					secureBuffer.method586(Class2.anInt7);
					secureBuffer.method586(Class88.anInt723);
				}

				aBool2011 = true;
			} else if (aBool2013)
				Class131_Sub20_Sub2.method704();

		final Dimension var8 = method1085();
		if ((Class131_Sub20_Sub5.anInt1450 != var8.width) || (Class131_Sub20_Sub7.anInt1491 != var8.height)
				|| aBool2019) {
			Class97.method396();
			aLong2029 = Class84.method366(780546663) + 500L;
			aBool2019 = false;
		}

		boolean var9 = false;
		if (aBool2011) {
			aBool2011 = false;
			var9 = true;

			for (var7 = 0; var7 < 100; ++var7)
				aBoolArray2252[var7] = true;
		}

		if (var9)
			Class131_Sub10.method571();

		int var10;
		if (anInt2036 == 0)
			Class89.method378(NpcFlags.anInt39, NpcFlags.aString51, (Color) null, var9);
		else if (anInt2036 == 5)
			Class93.method393(GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15, NpcFlags.aClass131_Sub20_Sub17_Sub4_Sub1_48,
					Class7.aClass131_Sub20_Sub17_Sub4_Sub1_79, var9);
		else if ((anInt2036 != 10) && (anInt2036 != 11)) {
			if (anInt2036 == 20)
				Class93.method393(GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15, NpcFlags.aClass131_Sub20_Sub17_Sub4_Sub1_48,
						Class7.aClass131_Sub20_Sub17_Sub4_Sub1_79, var9);
			else if (anInt2036 == 25) {
				if (anInt2235 == 1) {
					if (anInt2114 > anInt2215)
						anInt2215 = anInt2114;

					var7 = ((anInt2215 * 50) - (anInt2114 * 50)) / anInt2215;
					Class5.method26("Loading - please wait." + "<br>" + " (" + var7 + "%" + ")", false);
				} else if (anInt2235 == 2) {
					if (anInt2084 > anInt2141)
						anInt2141 = anInt2084;

					var7 = 50 + (((anInt2141 * 50) - (anInt2084 * 50)) / anInt2141);
					Class5.method26("Loading - please wait." + "<br>" + " (" + var7 + "%" + ")", false);
				} else
					Class5.method26("Loading - please wait.", false);
			} else if (anInt2036 == 30) {
				if (anInt2128 != -1)
					Class131_Sub13.method583(anInt2128);

				for (var7 = 0; var7 < anInt2226; ++var7) {
					if (aBoolArray2252[var7])
						aBoolArray2229[var7] = true;

					aBoolArray2164[var7] = aBoolArray2252[var7];
					aBoolArray2252[var7] = false;
				}

				anInt2227 = anInt2038;
				anInt2303 = -1;
				anInt2197 = -1;
				Class131_Sub20_Sub2.aClass131_Sub18_1422 = null;
				if (anInt2128 != -1) {
					anInt2226 = 0;
					Class45.method228(anInt2128, 0, 0, Class2.anInt7, Class88.anInt723, 0, 0, -1);
				}

				Class131_Sub20_Sub17.method844();
				if (!aBool2047) {
					if (anInt2303 != -1) {
						var7 = anInt2303;
						var10 = anInt2197;
						if ((anInt2166 >= 2) || (anInt2090 != 0) || aBool2178) {
							String var11;
							if ((anInt2090 == 1) && (anInt2166 < 2))
								var11 = "Use" + " " + aString2177 + " " + "->";
							else if (aBool2178 && (anInt2166 < 2))
								var11 = aString2181 + " " + aString2182 + " " + "->";
							else {
								final int var12 = anInt2166 - 1;
								String var13;
								if (aStringArray2172[var12].length() > 0)
									var13 = aStringArray2195[var12] + " " + aStringArray2172[var12];
								else
									var13 = aStringArray2195[var12];

								var11 = var13;
							}

							if (anInt2166 > 2)
								var11 = var11 + Class103.method427(16777215) + " " + '\u002f' + " " + (anInt2166 - 2)
										+ " more options";

							GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15.method1058(var11, var7 + 4, var10 + 15, 16777215,
									0, anInt2038 / 1000);
						}
					}
				} else
					Class39.method215();

				if (anInt2073 == 3)
					for (var7 = 0; var7 < anInt2226; ++var7)
						if (aBoolArray2164[var7])
							Class131_Sub20_Sub17.method849(anIntArray2231[var7], anIntArray2232[var7],
									anIntArray2233[var7], anIntArray2234[var7], 16711935, 128);
						else if (aBoolArray2229[var7])
							Class131_Sub20_Sub17.method849(anIntArray2231[var7], anIntArray2232[var7],
									anIntArray2233[var7], anIntArray2234[var7], 16711680, 128);

				Class66.method312(Class39.anInt410, Class131_Sub11.myPlayer.anInt1718,
						Class131_Sub11.myPlayer.anInt1759, anInt2103);
				anInt2103 = 0;
			} else if (anInt2036 == 40)
				Class5.method26("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			else if (anInt2036 == 45)
				Class5.method26("Please wait...", false);
		} else
			Class93.method393(GPI.aClass131_Sub20_Sub17_Sub4_Sub1_15, NpcFlags.aClass131_Sub20_Sub17_Sub4_Sub1_48,
					Class7.aClass131_Sub20_Sub17_Sub4_Sub1_79, var9);

		Graphics var14;
		if ((anInt2036 == 30) && (anInt2073 == 0) && !var9)
			try {
				var14 = Class29.aCanvas271.getGraphics();

				for (var10 = 0; var10 < anInt2226; ++var10)
					if (aBoolArray2229[var10]) {
						Class131_Sub20_Sub19_Sub5.aClass16_1839.method62(var14, anIntArray2231[var10],
								anIntArray2232[var10], anIntArray2233[var10], anIntArray2234[var10], -1276226507);
						aBoolArray2229[var10] = false;
					}
			} catch (final Exception var16) {
				Class29.aCanvas271.repaint();
			}
		else if (anInt2036 > 0)
			try {
				var14 = Class29.aCanvas271.getGraphics();
				Class131_Sub20_Sub19_Sub5.aClass16_1839.method61(var14, 0, 0, 147535070);

				for (var10 = 0; var10 < anInt2226; ++var10)
					aBoolArray2229[var10] = false;
			} catch (final Exception var15) {
				Class29.aCanvas271.repaint();
			}

	}

	void method1091() {
		if (Class94.anInt762 >= 4) {
			method1079("js5crc");
			anInt2036 = 1000;
		} else {
			if (Class94.anInt748 >= 4) {
				if (anInt2036 <= 5) {
					method1079("js5io");
					anInt2036 = 1000;
					return;
				}

				anInt2059 = 3000;
				Class94.anInt748 = 3;
			}

			if ((--anInt2059 + 1) <= 0)
				try {
					if (anInt2078 == 0) {
						Class5.aClass87_62 = Class36.aClass78_371.method347(Class131_Sub7.aString1027,
								Class131_Sub11.anInt1072);
						++anInt2078;
					}

					if (anInt2078 == 1) {
						if (Class5.aClass87_62.anInt714 == 2) {
							method1092(-1);
							return;
						}

						if (Class5.aClass87_62.anInt714 == 1)
							++anInt2078;
					}

					if (anInt2078 == 2) {
						Class131_Sub6.aClass86_1023 = new Class86((Socket) Class5.aClass87_62.anObject716,
								Class36.aClass78_371);
						final DataBuffer var1 = new DataBuffer(5);
						var1.writeByte(15);
						var1.writeInt(117);
						Class131_Sub6.aClass86_1023.write(var1.data, 0, 5);
						++anInt2078;
						DataBuffer.aLong1110 = Class84.method366(780546663);
					}

					if (anInt2078 == 3)
						if ((anInt2036 > 5) && (Class131_Sub6.aClass86_1023.available() <= 0)) {
							if ((Class84.method366(780546663) - DataBuffer.aLong1110) > 30000L) {
								method1092(-2);
								return;
							}
						} else {
							final int var2 = Class131_Sub6.aClass86_1023.read();
							if (var2 != 0) {
								method1092(var2);
								return;
							}

							++anInt2078;
						}

					if (anInt2078 == 4) {
						Class80.method357(Class131_Sub6.aClass86_1023, anInt2036 > 20);
						Class5.aClass87_62 = null;
						Class131_Sub6.aClass86_1023 = null;
						anInt2078 = 0;
						anInt2060 = 0;
					}
				} catch (final IOException var3) {
					method1092(-3);
				}
		}
	}

	void method1092(final int var1) {
		Class5.aClass87_62 = null;
		Class131_Sub6.aClass86_1023 = null;
		anInt2078 = 0;
		if (Class140.anInt929 == Class131_Sub11.anInt1072)
			Class131_Sub11.anInt1072 = Class49.anInt478;
		else
			Class131_Sub11.anInt1072 = Class140.anInt929;

		++anInt2060;
		if ((anInt2060 < 2) || ((var1 != 7) && (var1 != 9))) {
			if ((anInt2060 >= 2) && (var1 == 6)) {
				method1079("js5connect_outofdate");
				anInt2036 = 1000;
			} else if (anInt2060 >= 4)
				if (anInt2036 <= 5) {
					method1079("js5connect");
					anInt2036 = 1000;
				} else
					anInt2059 = 3000;
		} else if (anInt2036 <= 5) {
			method1079("js5connect_full");
			anInt2036 = 1000;
		} else
			anInt2059 = 3000;

	}

	static {
		aClass50_2055 = Class50.aClass50_490;
		aClass50_2056 = Class50.aClass50_490;
		anInt2057 = 0;
		anInt2078 = 0;
		anInt2059 = 0;
		anInt2060 = 0;
		loginStage = 0;
		anInt2079 = 0;
		anInt2063 = 0;
		anInt2064 = 0;
		aClass131_Sub20_Sub19_Sub2_Sub1Array2065 = new Class131_Sub20_Sub19_Sub2_Sub1['\u8000'];
		anInt2230 = 0;
		anIntArray2067 = new int['\u8000'];
		anInt2068 = 0;
		anIntArray2025 = new int[250];
		secureBuffer = new Class131_Sub14_Sub1(5000);
		loginBuffer = new Class131_Sub14_Sub1(5000);
		gameBuffer = new Class131_Sub14_Sub1(15000);
		messageSize = 0;
		incomingPacket = 0;
		anInt2075 = 0;
		anInt2076 = 0;
		anInt2041 = 0;
		anInt2219 = 0;
		anInt2154 = 0;
		anInt2080 = 0;
		aBool2098 = false;
		anInt2114 = 0;
		anInt2215 = 1;
		anInt2084 = 0;
		anInt2141 = 1;
		anInt2235 = 0;
		aClass51Array2087 = new Class51[4];
		aBool2088 = false;
		anIntArrayArrayArray2089 = new int[4][13][13];
		anIntArray2024 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
		anInt2119 = 0;
		anInt2285 = 2;
		anInt2093 = 0;
		anInt2094 = 2;
		anInt2095 = 0;
		anInt2026 = 1;
		anInt2082 = 0;
		anInt2236 = 0;
		anInt2099 = 2;
		anInt2100 = 0;
		anInt2239 = 1;
		anInt2096 = 0;
		anInt2103 = 0;
		anInt2104 = 2301979;
		anInt2105 = 5063219;
		anInt2101 = 3353893;
		anInt2107 = 7759444;
		aBool2272 = false;
		anInt2109 = 0;
		anInt2110 = 128;
		anInt2111 = 0;
		anInt2112 = 0;
		anInt2173 = 0;
		anInt2108 = 0;
		anInt2208 = 0;
		anInt2116 = 50;
		anInt2117 = 0;
		aBool2077 = false;
		anInt2291 = 0;
		anInt2120 = 0;
		anInt2121 = 50;
		anIntArray2122 = new int[anInt2121];
		anIntArray2264 = new int[anInt2121];
		anIntArray2124 = new int[anInt2121];
		anIntArray2125 = new int[anInt2121];
		anIntArray2126 = new int[anInt2121];
		anIntArray2127 = new int[anInt2121];
		anIntArray2223 = new int[anInt2121];
		aStringArray2071 = new String[anInt2121];
		anIntArrayArray2074 = new int[104][104];
		anInt2287 = 0;
		anInt2132 = -1;
		anInt2133 = -1;
		anInt2083 = 0;
		anInt2135 = 0;
		anInt2247 = 0;
		anInt2131 = 0;
		anInt2138 = 0;
		anInt2139 = 0;
		anInt2140 = 0;
		anInt2240 = 0;
		anInt2142 = 0;
		anInt2143 = 0;
		aBool2144 = false;
		anInt2207 = 0;
		anInt2146 = 0;
		playerArray = new Player[2048];
		myPlayerIndex = -1;
		anInt2149 = 0;
		anInt2061 = 0;
		anIntArray2151 = new int[1000];
		anIntArray2152 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
		aStringArray2153 = new String[8];
		aBoolArray2113 = new boolean[8];
		anIntArray2155 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
		anInt2200 = -1;
		aClass115ArrayArrayArray2306 = new Class115[4][104][104];
		aClass115_2158 = new Class115();
		aClass115_2284 = new Class115();
		aClass115_2160 = new Class115();
		anIntArray2161 = new int[25];
		anIntArray2162 = new int[25];
		anIntArray2163 = new int[25];
		anInt2210 = 0;
		aBool2047 = false;
		anInt2166 = 0;
		anIntArray2171 = new int[500];
		anIntArray2168 = new int[500];
		anIntArray2066 = new int[500];
		anIntArray2170 = new int[500];
		aStringArray2195 = new String[500];
		aStringArray2172 = new String[500];
		anInt2303 = -1;
		anInt2197 = -1;
		anInt2174 = 0;
		anInt2175 = 50;
		anInt2090 = 0;
		aString2177 = null;
		aBool2178 = false;
		anInt2179 = -1;
		anInt2206 = -1;
		aString2181 = null;
		aString2182 = null;
		anInt2128 = -1;
		aClass114_2184 = new Class114(8);
		anInt2185 = 0;
		anInt2186 = 0;
		aClass131_Sub18_2049 = null;
		anInt2188 = 0;
		anInt2189 = 0;
		playerRights = 0;
		anInt2069 = -1;
		aBool2192 = false;
		aBool2269 = false;
		aBool2194 = false;
		aClass131_Sub18_2198 = null;
		aClass131_Sub18_2165 = null;
		aClass131_Sub18_2035 = null;
		anInt2045 = 0;
		anInt2280 = 0;
		aClass131_Sub18_2136 = null;
		aBool2201 = false;
		anInt2202 = -1;
		anInt2203 = -1;
		aBool2204 = false;
		anInt2205 = -1;
		anInt2032 = -1;
		aBool2106 = false;
		anInt2298 = 1;
		anIntArray2145 = new int[32];
		anInt2027 = 0;
		anIntArray2211 = new int[32];
		anInt2212 = 0;
		anIntArray2213 = new int[32];
		anInt2214 = 0;
		anInt2217 = 0;
		anInt2216 = 0;
		anInt2277 = 0;
		anInt2297 = 0;
		anInt2270 = 0;
		anInt2263 = 0;
		anInt2221 = 0;
		aClass115_2222 = new Class115();
		aClass115_2130 = new Class115();
		aClass115_2224 = new Class115();
		aClass114_2225 = new Class114(512);
		anInt2226 = 0;
		anInt2227 = -2;
		aBoolArray2252 = new boolean[100];
		aBoolArray2229 = new boolean[100];
		aBoolArray2164 = new boolean[100];
		anIntArray2231 = new int[100];
		anIntArray2232 = new int[100];
		anIntArray2233 = new int[100];
		anIntArray2234 = new int[100];
		anInt2073 = 0;
		aLong2029 = 0L;
		aBool2237 = true;
		anInt2238 = 765;
		anInt2118 = 503;
		anIntArray2085 = new int[] { 16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215 };
		anInt2241 = 0;
		anInt2242 = 0;
		aString2243 = "";
		aLongArray2244 = new long[100];
		anInt2245 = 0;
		anInt2246 = 0;
		anIntArray2167 = new int[128];
		anIntArray2248 = new int[128];
		aLong2249 = -1L;
		aString2250 = null;
		aString2251 = null;
		anInt2159 = -1;
		anInt2253 = 0;
		anIntArray2254 = new int[1000];
		anIntArray2255 = new int[1000];
		aClass131_Sub20_Sub17_Sub3Array2256 = new Class131_Sub20_Sub17_Sub3[1000];
		anInt2218 = 0;
		anInt2258 = 0;
		anInt2259 = 0;
		anInt2260 = 255;
		anInt2052 = -1;
		aBool2262 = false;
		anInt2228 = 127;
		anInt2086 = 127;
		anInt2289 = 0;
		anIntArray2266 = new int[50];
		anIntArray2267 = new int[50];
		anIntArray2268 = new int[50];
		anIntArray2257 = new int[50];
		aClass8Array2129 = new Class8[50];
		aBool2271 = false;
		aBoolArray2261 = new boolean[5];
		anIntArray2273 = new int[5];
		anIntArray2274 = new int[5];
		anIntArray2275 = new int[5];
		anIntArray2276 = new int[5];
		aShort2081 = 256;
		aShort2278 = 205;
		aShort2279 = 256;
		aShort2180 = 320;
		aShort2281 = 1;
		aShort2282 = 32767;
		aShort2157 = 1;
		aShort2300 = 32767;
		anInt2199 = 0;
		anInt2286 = 0;
		anInt2169 = 0;
		anInt2288 = 0;
		anInt2283 = 0;
		anInt2290 = 0;
		anInt2134 = 0;
		aClass44Array2292 = new Class44[400];
		aClass112_2293 = new Class112();
		anInt2294 = 0;
		aClass36Array2295 = new Class36[400];
		aClass91_2296 = new Class91();
		anInt2040 = -1;
		anInt2137 = -1;
		grandExchangeOffers = new GrandExchangeOffer[8];
		aLong2102 = -1L;
		aLong2220 = -1L;
		aClass63_Sub1_2302 = new Class63_Sub1();
		anIntArray2058 = new int[50];
		anIntArray2304 = new int[50];
	}

	@Override
	public final void init() {
		if (method1089()) {
			final Class119[] var1 = new Class119[] { Class119.aClass119_870, Class119.aClass119_860,
					Class119.aClass119_866, Class119.aClass119_865, Class119.aClass119_867, Class119.aClass119_863,
					Class119.aClass119_858, Class119.aClass119_871, Class119.aClass119_868, Class119.aClass119_861,
					Class119.aClass119_864, Class119.aClass119_862, Class119.aClass119_869, Class119.aClass119_859,
					Class119.aClass119_857 };
			final Class119[] var2 = var1;

			int var3;
			String var5;
			for (var3 = 0; var3 < var2.length; ++var3) {
				final Class119 var4 = var2[var3];
				var5 = getParameter(var4.aString872);
				if (null != var5)
					switch (Integer.parseInt(var4.aString872)) {
					case 1:
						anInt2028 = Integer.parseInt(var5);
						break;
					case 2:
						aClass88_2183 = Class45.method227(Integer.parseInt(var5));
						break;
					case 3:
						Class21.aString200 = var5;
						break;
					case 4:
						Class39.anInt412 = Integer.parseInt(var5);
						break;
					case 5:
						anInt2030 = Integer.parseInt(var5);
						break;
					case 6:
						Class131_Sub20_Sub14.anInt1594 = Integer.parseInt(var5);
						break;
					case 7:
						if (var5.equalsIgnoreCase("true"))
							aBool2147 = true;
						else
							aBool2147 = false;
						break;
					case 8:
						anInt2034 = Integer.parseInt(var5);
						break;
					case 9:
						if (var5.equalsIgnoreCase("true"))
							;
						break;
					case 10:
						anInt2123 = Integer.parseInt(var5);
					case 11:
					case 12:
					case 14:
					default:
						break;
					case 13:
						aString2150 = var5;
						break;
					case 15:
						final Class73[] var6 = new Class73[] { Class73.aClass73_619, Class73.aClass73_625,
								Class73.aClass73_624, Class73.aClass73_622, Class73.aClass73_620,
								Class73.aClass73_621 };
						Class80.aClass73_665 = (Class73) Class39.method214(var6, Integer.parseInt(var5));
						if (Class73.aClass73_619 == Class80.aClass73_665)
							aClass142_2031 = Class142.aClass142_943;
						else
							aClass142_2031 = Class142.aClass142_942;
					}
			}

			Class33.aBool328 = false;
			aBool2033 = false;
			Class131_Sub7.aString1027 = getCodeBase().getHost();
			final String var36 = aClass88_2183.aString724;
			final byte var7 = 0;

			try {
				Class131_Sub20_Sub10.anInt1553 = 16;
				Class47.anInt467 = var7;

				try {
					Class131_Sub7.aString1030 = System.getProperty("os.name");
				} catch (final Exception var31) {
					Class131_Sub7.aString1030 = "Unknown";
				}

				Class48.aString469 = Class131_Sub7.aString1030.toLowerCase();

				try {
					Class72.aString616 = System.getProperty("user.home");
					if (null != Class72.aString616)
						Class72.aString616 = Class72.aString616 + "/";
				} catch (final Exception var30) {
					;
				}

				try {
					if (Class48.aString469.startsWith("win")) {
						if (Class72.aString616 == null)
							Class72.aString616 = System.getenv("USERPROFILE");
					} else if (null == Class72.aString616)
						Class72.aString616 = System.getenv("HOME");

					if (Class72.aString616 != null)
						Class72.aString616 = Class72.aString616 + "/";
				} catch (final Exception var29) {
					;
				}

				if (Class72.aString616 == null)
					Class72.aString616 = "~/";

				Class56.aStringArray506 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/",
						Class72.aString616, "/tmp/", "" };
				Class72.aStringArray615 = new String[] { ".jagex_cache_" + Class47.anInt467,
						".file_store_" + Class47.anInt467 };
				var3 = 0;

				File var37;
				label290: while (var3 < 4) {
					var5 = var3 == 0 ? "" : "" + var3;
					Class131_Sub7.aFile1028 = new File(Class72.aString616,
							"jagex_cl_oldschool_" + var36 + var5 + ".dat");
					String var40 = null;
					String var9 = null;
					boolean var10 = false;
					DataBuffer var12;
					File var44;
					if (Class131_Sub7.aFile1028.exists()) {
						try {
							final Class143 var11 = new Class143(Class131_Sub7.aFile1028, "rw", 10000L);

							int var13;
							for (var12 = new DataBuffer((int) var11
									.method522()); var12.pos < var12.data.length; var12.pos += var13) {
								var13 = var11.method519(var12.data, var12.pos,
										var12.data.length - var12.pos);
								if (var13 == -1)
									throw new IOException();
							}

							var12.pos = 0;
							var13 = var12.method595();
							if ((var13 < 1) || (var13 > 3))
								throw new IOException("" + var13);

							int var14 = 0;
							if (var13 > 1)
								var14 = var12.method595();

							if (var13 <= 2) {
								var40 = var12.method602();
								if (var14 == 1)
									var9 = var12.method602();
							} else {
								var40 = var12.method633();
								if (var14 == 1)
									var9 = var12.method633();
							}

							var11.method521();
						} catch (final IOException var34) {
							var34.printStackTrace();
						}

						if (var40 != null) {
							var44 = new File(var40);
							if (!var44.exists())
								var40 = null;
						}

						if (null != var40) {
							var44 = new File(var40, "test.dat");
							if (!Class131_Sub20_Sub18.method864(var44, true))
								var40 = null;
						}
					}

					if ((var40 == null) && (var3 == 0))
						label264: for (int var15 = 0; var15 < Class72.aStringArray615.length; ++var15)
							for (int var16 = 0; var16 < Class56.aStringArray506.length; ++var16) {
								final File var17 = new File(
										Class56.aStringArray506[var16] + Class72.aStringArray615[var15]
												+ File.separatorChar + "oldschool" + File.separatorChar);
								if (var17.exists()
										&& Class131_Sub20_Sub18.method864(new File(var17, "test.dat"), true)) {
									var40 = var17.toString();
									var10 = true;
									break label264;
								}
							}

					if (null == var40) {
						var40 = Class72.aString616 + File.separatorChar + "jagexcache" + var5 + File.separatorChar
								+ "oldschool" + File.separatorChar + var36 + File.separatorChar;
						var10 = true;
					}

					File var43;
					if (null != var9) {
						var43 = new File(var9);
						var44 = new File(var40);

						try {
							final File[] var45 = var43.listFiles();
							final File[] var18 = var45;

							for (final File var20 : var18) {
								final File var21 = new File(var44, var20.getName());
								final boolean var22 = var20.renameTo(var21);
								if (!var22)
									throw new IOException();
							}
						} catch (final Exception var33) {
							var33.printStackTrace();
						}

						var10 = true;
					}

					if (var10) {
						var43 = new File(var40);
						var12 = null;

						try {
							final Class143 var46 = new Class143(Class131_Sub7.aFile1028, "rw", 10000L);
							final DataBuffer var47 = new DataBuffer(500);
							var47.writeByte(3);
							var47.writeByte(0);
							var47.method634(var43.getPath());
							var46.method523(var47.data, 0, var47.pos);
							var46.method521();
						} catch (final IOException var28) {
							var28.printStackTrace();
						}
					}

					var37 = new File(var40);
					Class6.aFile66 = var37;
					if (!Class6.aFile66.exists())
						Class6.aFile66.mkdirs();

					final File[] var38 = Class6.aFile66.listFiles();
					if (var38 != null) {
						final File[] var42 = var38;

						for (int var23 = 0; var23 < var42.length; ++var23) {
							final File var24 = var42[var23];
							if (!Class131_Sub20_Sub18.method864(var24, false)) {
								++var3;
								continue label290;
							}
						}
					}
					break;
				}

				final File var8 = Class6.aFile66;
				Class77.aFile635 = var8;
				if (!Class77.aFile635.exists())
					throw new RuntimeException("");

				Class77.aBool637 = true;

				try {
					var37 = new File(Class72.aString616, "random.dat");
					int var26;
					if (var37.exists())
						Class72.aClass140_617 = new Class140(new Class143(var37, "rw", 25L), 24, 0);
					else
						label213: for (int var25 = 0; var25 < Class72.aStringArray615.length; ++var25)
							for (var26 = 0; var26 < Class56.aStringArray506.length; ++var26) {
								final File var41 = new File(Class56.aStringArray506[var26]
										+ Class72.aStringArray615[var25] + File.separatorChar + "random.dat");
								if (var41.exists()) {
									Class72.aClass140_617 = new Class140(new Class143(var41, "rw", 25L), 24, 0);
									break label213;
								}
							}

					if (Class72.aClass140_617 == null) {
						final RandomAccessFile var39 = new RandomAccessFile(var37, "rw");
						var26 = var39.read();
						var39.seek(0L);
						var39.write(var26);
						var39.seek(0L);
						var39.close();
						Class72.aClass140_617 = new Class140(new Class143(var37, "rw", 25L), 24, 0);
					}
				} catch (final IOException var32) {
					;
				}

				Class72.aClass140_614 = new Class140(
						new Class143(Class131_Sub9.method563("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
				Class72.aClass140_613 = new Class140(
						new Class143(Class131_Sub9.method563("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
				Class44.aClass140Array444 = new Class140[Class131_Sub20_Sub10.anInt1553];

				for (int var27 = 0; var27 < Class131_Sub20_Sub10.anInt1553; ++var27)
					Class44.aClass140Array444[var27] = new Class140(
							new Class143(Class131_Sub9.method563("main_file_cache.idx" + var27), "rw", 1048576L), 6000,
							0);
			} catch (final Exception var35) {
				Class131_Sub20_Sub7.method740((String) null, var35);
			}

			aclient2265 = this;
			method1076(765, 503, 117);
		}
	}

	@Override
	protected final void method1080(final byte var1) {
		Class140.anInt929 = anInt2030 == 0 ? '\uaa4a' : '\u9c40' + anInt2123;
		Class49.anInt478 = anInt2030 == 0 ? 443 : '\uc350' + anInt2123;
		Class131_Sub11.anInt1072 = Class140.anInt929;
		Class91.aShortArray736 = Class101.aShortArray797;
		Class131_Sub17.aShortArrayArray1146 = Class101.aShortArrayArray795;
		Class35.aShortArray360 = Class101.aShortArray794;
		Class91.aShortArrayArray737 = Class101.aShortArrayArray796;
		if (Class78.aString638.toLowerCase().indexOf("microsoft") != -1) {
			Class80.anIntArray650[186] = 57;
			Class80.anIntArray650[187] = 27;
			Class80.anIntArray650[188] = 71;
			Class80.anIntArray650[189] = 26;
			Class80.anIntArray650[190] = 72;
			Class80.anIntArray650[191] = 73;
			Class80.anIntArray650[192] = 58;
			Class80.anIntArray650[219] = 42;
			Class80.anIntArray650[220] = 74;
			Class80.anIntArray650[221] = 43;
			Class80.anIntArray650[222] = 59;
			Class80.anIntArray650[223] = 28;
		} else {
			Class80.anIntArray650[44] = 71;
			Class80.anIntArray650[45] = 26;
			Class80.anIntArray650[46] = 72;
			Class80.anIntArray650[47] = 73;
			Class80.anIntArray650[59] = 57;
			Class80.anIntArray650[61] = 27;
			Class80.anIntArray650[91] = 42;
			Class80.anIntArray650[92] = 74;
			Class80.anIntArray650[93] = 43;
			Class80.anIntArray650[192] = 28;
			Class80.anIntArray650[222] = 58;
			Class80.anIntArray650[520] = 59;
		}

		Class131_Sub20_Sub18.method865(Class29.aCanvas271);
		Class24.method114(Class29.aCanvas271);

		Class71_Sub1 var2;
		try {
			var2 = new Class71_Sub1();
		} catch (final Throwable var7) {
			var2 = null;
		}

		Class131_Sub14_Sub1.aClass71_1644 = var2;
		if (Class131_Sub14_Sub1.aClass71_1644 != null)
			Class131_Sub14_Sub1.aClass71_1644.method331(Class29.aCanvas271, (byte) 8);

		aClass75_2301 = new Class75(255, Class72.aClass140_614, Class72.aClass140_613, 500000);
		Class50.aClass28_494 = Class131_Sub9.method568();
		Class61.aClipboard575 = getToolkit().getSystemClipboard();
		Class1.method15(this, Class24.aString212);
		if (anInt2030 != 0)
			aBool2092 = true;

		final int var4 = Class50.aClass28_494.anInt253;
		aLong2029 = 0L;
		if (var4 >= 2)
			aBool2237 = true;
		else
			aBool2237 = false;

		Class97.method396();
		if (anInt2036 >= 25) {
			secureBuffer.method871(81);
			final Class131_Sub14_Sub1 var5 = secureBuffer;
			final int var6 = aBool2237 ? 2 : 1;
			var5.writeByte(var6);
			secureBuffer.method586(Class2.anInt7);
			secureBuffer.method586(Class88.anInt723);
		}

		aBool2011 = true;
	}

	void method1093() {
		if (anInt2036 != 1000) {
			final long var1 = Class84.method366(780546663);
			int var3 = (int) (var1 - Class56.aLong507);
			Class56.aLong507 = var1;
			if (var3 > 200)
				var3 = 200;

			Class94.anInt756 += var3;
			boolean var4;
			if ((Class94.anInt753 == 0) && (Class94.anInt746 == 0) && (Class94.anInt751 == 0)
					&& (Class94.anInt761 == 0))
				var4 = true;
			else if (Class94.aClass86_754 == null)
				var4 = false;
			else
				try {
					label205: {
						if (Class94.anInt756 > 30000)
							throw new IOException();

						Class131_Sub20_Sub20 var5;
						DataBuffer var6;
						while ((Class94.anInt746 < 20) && (Class94.anInt761 > 0)) {
							var5 = (Class131_Sub20_Sub20) Class94.aClass114_745.method460();
							var6 = new DataBuffer(4);
							var6.writeByte(1);
							var6.method587((int) var5.aLong902);
							Class94.aClass86_754.write(var6.data, 0, 4);
							Class94.aClass114_747.method461(var5, var5.aLong902);
							--Class94.anInt761;
							++Class94.anInt746;
						}

						while ((Class94.anInt753 < 20) && (Class94.anInt751 > 0)) {
							var5 = (Class131_Sub20_Sub20) Class94.aClass116_749.method476();
							var6 = new DataBuffer(4);
							var6.writeByte(0);
							var6.method587((int) var5.aLong902);
							Class94.aClass86_754.write(var6.data, 0, 4);
							var5.method677();
							Class94.aClass114_752.method461(var5, var5.aLong902);
							--Class94.anInt751;
							++Class94.anInt753;
						}

						for (int var7 = 0; var7 < 100; ++var7) {
							final int var8 = Class94.aClass86_754.available();
							if (var8 < 0)
								throw new IOException();

							if (var8 == 0)
								break;

							Class94.anInt756 = 0;
							byte var9 = 0;
							if (null == Class89.aClass131_Sub20_Sub20_725)
								var9 = 8;
							else if (Class94.anInt743 == 0)
								var9 = 1;

							int var10;
							int var11;
							int var12;
							int var14;
							if (var9 > 0) {
								var10 = var9 - Class94.aClass131_Sub14_755.pos;
								if (var10 > var8)
									var10 = var8;

								Class94.aClass86_754.read(Class94.aClass131_Sub14_755.data,
										Class94.aClass131_Sub14_755.pos, var10);
								if (Class94.aByte760 != 0)
									for (var11 = 0; var11 < var10; ++var11)
										Class94.aClass131_Sub14_755.data[Class94.aClass131_Sub14_755.pos
												+ var11] ^= Class94.aByte760;

								Class94.aClass131_Sub14_755.pos += var10;
								if (Class94.aClass131_Sub14_755.pos < var9)
									break;

								if (null == Class89.aClass131_Sub20_Sub20_725) {
									Class94.aClass131_Sub14_755.pos = 0;
									var11 = Class94.aClass131_Sub14_755.method595();
									var12 = Class94.aClass131_Sub14_755.readUShort();
									final int var13 = Class94.aClass131_Sub14_755.method595();
									var14 = Class94.aClass131_Sub14_755.readIntV1();
									final long var15 = (var11 << 16) + var12;
									Class131_Sub20_Sub20 var17 = (Class131_Sub20_Sub20) Class94.aClass114_747
											.method457(var15);
									Class60.aBool568 = true;
									if (var17 == null) {
										var17 = (Class131_Sub20_Sub20) Class94.aClass114_752.method457(var15);
										Class60.aBool568 = false;
									}

									if (null == var17)
										throw new IOException();

									final int var18 = var13 == 0 ? 5 : 9;
									Class89.aClass131_Sub20_Sub20_725 = var17;
									Class94.aClass131_Sub14_744 = new DataBuffer(
											var18 + var14 + Class89.aClass131_Sub20_Sub20_725.aByte1651);
									Class94.aClass131_Sub14_744.writeByte(var13);
									Class94.aClass131_Sub14_744.writeInt(var14);
									Class94.anInt743 = 8;
									Class94.aClass131_Sub14_755.pos = 0;
								} else if (Class94.anInt743 == 0)
									if (Class94.aClass131_Sub14_755.data[0] == -1) {
										Class94.anInt743 = 1;
										Class94.aClass131_Sub14_755.pos = 0;
									} else
										Class89.aClass131_Sub20_Sub20_725 = null;
							} else {
								var10 = Class94.aClass131_Sub14_744.data.length
										- Class89.aClass131_Sub20_Sub20_725.aByte1651;
								var11 = 512 - Class94.anInt743;
								if (var11 > (var10 - Class94.aClass131_Sub14_744.pos))
									var11 = var10 - Class94.aClass131_Sub14_744.pos;

								if (var11 > var8)
									var11 = var8;

								Class94.aClass86_754.read(Class94.aClass131_Sub14_744.data,
										Class94.aClass131_Sub14_744.pos, var11);
								if (Class94.aByte760 != 0)
									for (var12 = 0; var12 < var11; ++var12)
										Class94.aClass131_Sub14_744.data[var12
												+ Class94.aClass131_Sub14_744.pos] ^= Class94.aByte760;

								Class94.aClass131_Sub14_744.pos += var11;
								Class94.anInt743 += var11;
								if (Class94.aClass131_Sub14_744.pos == var10) {
									if (Class89.aClass131_Sub20_Sub20_725.aLong902 == 16711935L) {
										Class94.aClass131_Sub14_758 = Class94.aClass131_Sub14_744;

										for (var12 = 0; var12 < 256; ++var12) {
											final Class100_Sub1 var19 = Class94.aClass100_Sub1Array759[var12];
											if (var19 != null) {
												Class94.aClass131_Sub14_758.pos = 5 + (8 * var12);
												var14 = Class94.aClass131_Sub14_758.readIntV1();
												final int var20 = Class94.aClass131_Sub14_758.readIntV1();
												var19.method654(var14, var20);
											}
										}
									} else {
										Class94.aCRC32_757.reset();
										Class94.aCRC32_757.update(Class94.aClass131_Sub14_744.data, 0, var10);
										var12 = (int) Class94.aCRC32_757.getValue();
										if (Class89.aClass131_Sub20_Sub20_725.anInt1650 != var12) {
											try {
												Class94.aClass86_754.method373();
											} catch (final Exception var23) {
												;
											}

											++Class94.anInt762;
											Class94.aClass86_754 = null;
											Class94.aByte760 = (byte) ((int) ((Math.random() * 255.0D) + 1.0D));
											var4 = false;
											break label205;
										}

										Class94.anInt762 = 0;
										Class94.anInt748 = 0;
										Class89.aClass131_Sub20_Sub20_725.aClass100_Sub1_1653.method656(
												(int) (Class89.aClass131_Sub20_Sub20_725.aLong902 & 65535L),
												Class94.aClass131_Sub14_744.data,
												16711680L == (Class89.aClass131_Sub20_Sub20_725.aLong902 & 16711680L),
												Class60.aBool568);
									}

									Class89.aClass131_Sub20_Sub20_725.method501();
									if (Class60.aBool568)
										--Class94.anInt746;
									else
										--Class94.anInt753;

									Class94.anInt743 = 0;
									Class89.aClass131_Sub20_Sub20_725 = null;
									Class94.aClass131_Sub14_744 = null;
								} else {
									if (Class94.anInt743 != 512)
										break;

									Class94.anInt743 = 0;
								}
							}
						}

						var4 = true;
					}
				} catch (final IOException var24) {
					try {
						Class94.aClass86_754.method373();
					} catch (final Exception var22) {
						;
					}

					++Class94.anInt748;
					Class94.aClass86_754 = null;
					var4 = false;
				}

			if (!var4)
				method1091();

		}
	}

	static boolean method1094(final String var0, final int var1, final String var2) {
		if (var1 == 0)
			try {
				if (!Class85.aString699.startsWith("win"))
					throw new Exception();
				else if (!var0.startsWith("http://") && !var0.startsWith("https://"))
					throw new Exception();
				else {
					final String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4)
						if (var10.indexOf(var0.charAt(var4)) == -1)
							throw new Exception();

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (final Throwable var5) {
				return false;
			}
		else if (var1 == 1)
			try {
				final Object var3 = Class76.method343(Class85.anApplet700, var2,
						new Object[] { (new URL(Class85.anApplet700.getCodeBase(), var0)).toString() });
				return null != var3;
			} catch (final Throwable var6) {
				return false;
			}
		else if (var1 == 2)
			try {
				Class85.anApplet700.getAppletContext().showDocument(new URL(Class85.anApplet700.getCodeBase(), var0),
						"_blank");
				return true;
			} catch (final Exception var7) {
				return false;
			}
		else if (var1 == 3) {
			try {
				Class76.method342(Class85.anApplet700, "loggedout");
			} catch (final Throwable var9) {
				;
			}

			try {
				Class85.anApplet700.getAppletContext().showDocument(new URL(Class85.anApplet700.getCodeBase(), var0),
						"_top");
				return true;
			} catch (final Exception var8) {
				return false;
			}
		} else
			throw new IllegalArgumentException();
	}

	@Override
	protected final void method1083(final int var1) {
		if (Class131_Sub7.aClass48_1026.method247())
			Class131_Sub7.aClass48_1026.method248();

		if (aClass40_2209 != null)
			aClass40_2209.aBool419 = false;

		aClass40_2209 = null;
		if (null != Class131_Sub20_Sub20.loginConnection) {
			Class131_Sub20_Sub20.loginConnection.method373();
			Class131_Sub20_Sub20.loginConnection = null;
		}

		Class131_Sub20_Sub6.method738((byte) 38);
		if (Class81.aClass81_669 != null) {
			final Class81 var2 = Class81.aClass81_669;
			synchronized (var2) {
				Class81.aClass81_669 = null;
			}
		}

		Class131_Sub14_Sub1.aClass71_1644 = null;
		if (null != Class131_Sub20_Sub6.aClass17_1480)
			Class131_Sub20_Sub6.aClass17_1480.method76();

		if (Class131_Sub20_Sub19_Sub4.aClass17_1817 != null)
			Class131_Sub20_Sub19_Sub4.aClass17_1817.method76();

		Class60.method294();
		final Object var10 = Class105.anObject806;
		synchronized (var10) {
			if (Class105.anInt804 != 0) {
				Class105.anInt804 = 1;

				try {
					Class105.anObject806.wait();
				} catch (final InterruptedException var6) {
					;
				}
			}
		}

		try {
			Class72.aClass140_614.method514();

			for (int var5 = 0; var5 < Class131_Sub20_Sub10.anInt1553; ++var5)
				Class44.aClass140Array444[var5].method514();

			Class72.aClass140_613.method514();
			Class72.aClass140_617.method514();
		} catch (final Exception var8) {
			;
		}

	}

	@Override
	protected final void method1086(final byte var1) {
	}

	public static Class131_Sub20_Sub17_Sub2[] method1095(final Class100 var0, final String var1, final String var2) {
		final int var3 = var0.method413(var1);
		final int var6 = var0.method414(var3, var2);
		Class131_Sub20_Sub17_Sub2[] var7;
		if (!Class38.method210(var0, var3, var6))
			var7 = null;
		else {
			final Class131_Sub20_Sub17_Sub2[] var8 = new Class131_Sub20_Sub17_Sub2[Class13.anInt116];

			for (int var5 = 0; var5 < Class13.anInt116; ++var5) {
				final Class131_Sub20_Sub17_Sub2 var4 = var8[var5] = new Class131_Sub20_Sub17_Sub2();
				var4.anInt1788 = Class13.anInt113;
				var4.anInt1794 = Class13.anInt115;
				var4.anInt1795 = Class13.anIntArray114[var5];
				var4.anInt1793 = Class131_Sub20_Sub15.anIntArray1605[var5];
				var4.anInt1790 = Class131_Sub20_Sub19_Sub3.anIntArray1766[var5];
				var4.anInt1791 = NpcFlags.anIntArray54[var5];
				var4.anIntArray1789 = Class36.anIntArray370;
				var4.aByteArray1792 = Class13.aByteArrayArray117[var5];
			}

			Class5.method28();
			var7 = var8;
		}

		return var7;
	}
}
