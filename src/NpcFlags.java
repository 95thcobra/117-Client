import java.util.Date;

public class NpcFlags {
	static Class131_Sub20_Sub17_Sub2 aClass131_Sub20_Sub17_Sub2_25;
	static Class131_Sub20_Sub17_Sub2 aClass131_Sub20_Sub17_Sub2_27;
	static Class131_Sub20_Sub17_Sub3 aClass131_Sub20_Sub17_Sub3_28;
	static Class131_Sub20_Sub17_Sub2 aClass131_Sub20_Sub17_Sub2_29;
	static Class131_Sub20_Sub17_Sub2 aClass131_Sub20_Sub17_Sub2_30;
	static boolean aBool43;
	static Class131_Sub20_Sub17_Sub4_Sub1 aClass131_Sub20_Sub17_Sub4_Sub1_48;
	public static int[] anIntArray54;
	static Class100_Sub1 aClass100_Sub1_55;
	protected static int anInt57;
	static int anInt36 = 0;
	static int anInt42;
	static int[] anIntArray32;
	static int anInt26;
	static int anInt34;
	static int anInt46;
	static int anInt56;
	static int anInt37;
	static int anInt52;
	static int anInt39;
	static String aString51;
	static int anInt35;
	static String aString31;
	static String aString41;
	static String aString44;
	static String aString45;
	static String username;
	static String password;
	static Class97 aClass97_38;
	static boolean aBool49;
	static int anInt50;
	static boolean aBool33;
	static int anInt53;

	static {
		anInt42 = 202 + anInt36;
		anIntArray32 = new int[256];
		anInt26 = 0;
		anInt34 = 0;
		anInt46 = 0;
		anInt56 = 0;
		anInt37 = 0;
		anInt52 = 0;
		anInt39 = 10;
		aString51 = "";
		anInt35 = 0;
		aString31 = "";
		aString41 = "";
		aString44 = "";
		aString45 = "";
		username = "";
		password = "";
		aClass97_38 = Class97.aClass97_768;
		aBool49 = true;
		anInt50 = 0;
		aBool33 = false;
		anInt53 = -1;
	}

	static void method24(final Class131_Sub10 var0, final int var1) {
		final Object[] var2 = var0.anObjectArray1056;
		final int var3 = ((Integer) var2[0]).intValue();
		Player1 var4 = Class94.method394(var3);
		if (var4 != null) {
			int var5 = 0;
			int var6 = 0;
			int var7 = -1;
			int[] var8 = var4.anIntArray1635;
			int[] var9 = var4.anIntArray1636;
			final byte var10 = -1;
			Class7.anInt81 = 0;

			int var13;
			try {
				Class7.anIntArray68 = new int[var4.anInt1634];
				int var11 = 0;
				Class7.aStringArray80 = new String[var4.anInt1638];
				int var12 = 0;

				int var14;
				String var15;
				for (var13 = 1; var13 < var2.length; ++var13)
					if (var2[var13] instanceof Integer) {
						var14 = ((Integer) var2[var13]).intValue();
						if (var14 == -2147483647)
							var14 = var0.anInt1059;

						if (var14 == -2147483646)
							var14 = var0.anInt1060;

						if (var14 == -2147483645)
							var14 = var0.aClass131_Sub18_1057 != null ? var0.aClass131_Sub18_1057.anInt1272 : -1;

						if (var14 == -2147483644)
							var14 = var0.anInt1058;

						if (var14 == -2147483643)
							var14 = var0.aClass131_Sub18_1057 != null ? var0.aClass131_Sub18_1057.anInt1159 : -1;

						if (var14 == -2147483642)
							var14 = null != var0.aClass131_Sub18_1068 ? var0.aClass131_Sub18_1068.anInt1272 : -1;

						if (var14 == -2147483641)
							var14 = var0.aClass131_Sub18_1068 != null ? var0.aClass131_Sub18_1068.anInt1159 : -1;

						if (var14 == -2147483640)
							var14 = var0.anInt1063;

						if (var14 == -2147483639)
							var14 = var0.anInt1064;

						Class7.anIntArray68[var11++] = var14;
					} else if (var2[var13] instanceof String) {
						var15 = (String) var2[var13];
						if (var15.equals("event_opbase"))
							var15 = var0.aString1065;

						Class7.aStringArray80[var12++] = var15;
					}

				var13 = 0;
				Class7.anInt76 = var0.anInt1066;

				label2851: while (true) {
					++var13;
					if (var13 > var1)
						throw new RuntimeException();

					++var7;
					int var44 = var8[var7];
					int[] var16;
					int var10001;
					String var18;
					int var19;
					int var20;
					int var21;
					int var24;
					int var27;
					int var28;
					String[] var56;
					String var58;
					String var69;
					if (var44 < 100) {
						if (var44 == 0) {
							Class7.anIntArray71[var5++] = var9[var7];
							continue;
						}

						if (var44 == 1) {
							var14 = var9[var7];
							Class7.anIntArray71[var5++] = Class96.anIntArray766[var14];
							continue;
						}

						if (var44 == 2) {
							var14 = var9[var7];
							--var5;
							Class96.anIntArray766[var14] = Class7.anIntArray71[var5];
							Class24.method117(var14);
							continue;
						}

						if (var44 == 3) {
							Class7.aStringArray72[var6++] = var4.aStringArray1642[var7];
							continue;
						}

						if (var44 == 6) {
							var7 += var9[var7];
							continue;
						}

						if (var44 == 7) {
							var5 -= 2;
							if (Class7.anIntArray71[var5 + 1] != Class7.anIntArray71[var5])
								var7 += var9[var7];
							continue;
						}

						if (var44 == 8) {
							var5 -= 2;
							if (Class7.anIntArray71[var5 + 1] == Class7.anIntArray71[var5])
								var7 += var9[var7];
							continue;
						}

						if (var44 == 9) {
							var5 -= 2;
							if (Class7.anIntArray71[var5] < Class7.anIntArray71[var5 + 1])
								var7 += var9[var7];
							continue;
						}

						if (var44 == 10) {
							var5 -= 2;
							if (Class7.anIntArray71[var5] > Class7.anIntArray71[1 + var5])
								var7 += var9[var7];
							continue;
						}

						if (var44 == 21) {
							if (Class7.anInt81 == 0)
								return;

							final Class39 var47 = Class7.aClass39Array74[--Class7.anInt81];
							var4 = var47.aClass131_Sub20_Sub18_411;
							var8 = var4.anIntArray1635;
							var9 = var4.anIntArray1636;
							var7 = var47.anInt406;
							Class7.anIntArray68 = var47.anIntArray407;
							Class7.aStringArray80 = var47.aStringArray408;
							continue;
						}

						if (var44 == 25) {
							var14 = var9[var7];
							Class7.anIntArray71[var5++] = Class84.method369(var14, -618308885);
							continue;
						}

						if (var44 == 27) {
							var14 = var9[var7];
							--var5;
							Class131_Sub20_Sub19_Sub3.method927(var14, Class7.anIntArray71[var5]);
							continue;
						}

						if (var44 == 31) {
							var5 -= 2;
							if (Class7.anIntArray71[var5] <= Class7.anIntArray71[1 + var5])
								var7 += var9[var7];
							continue;
						}

						if (var44 == 32) {
							var5 -= 2;
							if (Class7.anIntArray71[var5] >= Class7.anIntArray71[var5 + 1])
								var7 += var9[var7];
							continue;
						}

						if (var44 == 33) {
							Class7.anIntArray71[var5++] = Class7.anIntArray68[var9[var7]];
							continue;
						}

						if (var44 == 34) {
							var10001 = var9[var7];
							--var5;
							Class7.anIntArray68[var10001] = Class7.anIntArray71[var5];
							continue;
						}

						if (var44 == 35) {
							Class7.aStringArray72[var6++] = Class7.aStringArray80[var9[var7]];
							continue;
						}

						if (var44 == 36) {
							var10001 = var9[var7];
							--var6;
							Class7.aStringArray80[var10001] = Class7.aStringArray72[var6];
							continue;
						}

						if (var44 == 37) {
							var14 = var9[var7];
							var6 -= var14;
							final String[] var96 = Class7.aStringArray72;
							if (var14 == 0)
								var58 = "";
							else if (var14 == 1) {
								var18 = var96[var6];
								if (null == var18)
									var58 = "null";
								else
									var58 = var18.toString();
							} else {
								var19 = var14 + var6;
								var20 = 0;

								for (var21 = var6; var21 < var19; ++var21) {
									var69 = var96[var21];
									if (var69 == null)
										var20 += 4;
									else
										var20 += var69.length();
								}

								final StringBuilder var85 = new StringBuilder(var20);

								for (var24 = var6; var24 < var19; ++var24) {
									final String var71 = var96[var24];
									if (var71 == null)
										var85.append("null");
									else
										var85.append(var71);
								}

								var58 = var85.toString();
							}

							Class7.aStringArray72[var6++] = var58;
							continue;
						}

						if (var44 == 38) {
							--var5;
							continue;
						}

						if (var44 == 39) {
							--var6;
							continue;
						}

						if (var44 == 40) {
							var14 = var9[var7];
							final Player1 var104 = Class94.method394(var14);
							var16 = new int[var104.anInt1634];
							var56 = new String[var104.anInt1638];

							for (var20 = 0; var20 < var104.anInt1639; ++var20)
								var16[var20] = Class7.anIntArray71[var20 + (var5 - var104.anInt1639)];

							for (var20 = 0; var20 < var104.anInt1640; ++var20)
								var56[var20] = Class7.aStringArray72[(var6 - var104.anInt1640) + var20];

							var5 -= var104.anInt1639;
							var6 -= var104.anInt1640;
							final Class39 var100 = new Class39();
							var100.aClass131_Sub20_Sub18_411 = var4;
							var100.anInt406 = var7;
							var100.anIntArray407 = Class7.anIntArray68;
							var100.aStringArray408 = Class7.aStringArray80;
							Class7.aClass39Array74[++Class7.anInt81 - 1] = var100;
							var4 = var104;
							var8 = var104.anIntArray1635;
							var9 = var104.anIntArray1636;
							var7 = -1;
							Class7.anIntArray68 = var16;
							Class7.aStringArray80 = var56;
							continue;
						}

						if (var44 == 42) {
							Class7.anIntArray71[var5++] = Class131_Sub7.aClass48_1026.method243(var9[var7]);
							continue;
						}

						if (var44 == 43) {
							var10001 = var9[var7];
							--var5;
							Class131_Sub7.aClass48_1026.method242(var10001, Class7.anIntArray71[var5]);
							continue;
						}

						if (var44 == 44) {
							var14 = var9[var7] >> 16;
							var27 = var9[var7] & '\uffff';
							--var5;
							var28 = Class7.anIntArray71[var5];
							if ((var28 >= 0) && (var28 <= 5000)) {
								Class7.anIntArray70[var14] = var28;
								byte var93 = -1;
								if (var27 == 105)
									var93 = 0;

								var20 = 0;

								while (true) {
									if (var20 >= var28)
										continue label2851;

									Class7.anIntArrayArray73[var14][var20] = var93;
									++var20;
								}
							}

							throw new RuntimeException();
						}

						if (var44 == 45) {
							var14 = var9[var7];
							--var5;
							var27 = Class7.anIntArray71[var5];
							if ((var27 >= 0) && (var27 < Class7.anIntArray70[var14])) {
								Class7.anIntArray71[var5++] = Class7.anIntArrayArray73[var14][var27];
								continue;
							}

							throw new RuntimeException();
						}

						if (var44 == 46) {
							var14 = var9[var7];
							var5 -= 2;
							var27 = Class7.anIntArray71[var5];
							if ((var27 >= 0) && (var27 < Class7.anIntArray70[var14])) {
								Class7.anIntArrayArray73[var14][var27] = Class7.anIntArray71[var5 + 1];
								continue;
							}

							throw new RuntimeException();
						}

						if (var44 == 47) {
							var15 = Class131_Sub7.aClass48_1026.method250(var9[var7]);
							if (null == var15)
								var15 = "null";

							Class7.aStringArray72[var6++] = var15;
							continue;
						}

						if (var44 == 48) {
							var10001 = var9[var7];
							--var6;
							Class131_Sub7.aClass48_1026.method249(var10001, Class7.aStringArray72[var6]);
							continue;
						}
					}

					boolean var55;
					if (var9[var7] == 1)
						var55 = true;
					else
						var55 = false;

					Class131_Sub18 var17;
					Class131_Sub18 var50;
					Class131_Sub18 var75;
					Class131_Sub18 var79;
					boolean var90;
					if (var44 < 1000) {
						if (var44 == 100) {
							var5 -= 3;
							var27 = Class7.anIntArray71[var5];
							var28 = Class7.anIntArray71[var5 + 1];
							var19 = Class7.anIntArray71[2 + var5];
							if (var28 == 0)
								throw new RuntimeException();

							var75 = Class88.method377(var27);
							if (var75.aClass131_Sub18Array1171 == null)
								var75.aClass131_Sub18Array1171 = new Class131_Sub18[var19 + 1];

							if (var75.aClass131_Sub18Array1171.length <= var19) {
								final Class131_Sub18[] var82 = new Class131_Sub18[var19 + 1];

								for (var24 = 0; var24 < var75.aClass131_Sub18Array1171.length; ++var24)
									var82[var24] = var75.aClass131_Sub18Array1171[var24];

								var75.aClass131_Sub18Array1171 = var82;
							}

							if ((var19 > 0) && (var75.aClass131_Sub18Array1171[var19 - 1] == null))
								throw new RuntimeException("" + (var19 - 1));

							final Class131_Sub18 var83 = new Class131_Sub18();
							var83.anInt1202 = var28;
							var10001 = var75.anInt1272;
							var83.anInt1272 = var75.anInt1272 * 595676643;
							var83.anInt1177 = var10001;
							var83.anInt1159 = var19;
							var83.aBool1263 = true;
							var75.aClass131_Sub18Array1171[var19] = var83;
							if (var55)
								Class7.aClass131_Sub18_69 = var83;
							else
								Class7.aClass131_Sub18_78 = var83;

							Class131_Sub20_Sub6.method734(var75);
							continue;
						}

						if (var44 == 101) {
							var17 = var55 ? Class7.aClass131_Sub18_69 : Class7.aClass131_Sub18_78;
							var79 = Class88.method377(var17.anInt1272);
							var79.aClass131_Sub18Array1171[var17.anInt1159] = null;
							Class131_Sub20_Sub6.method734(var79);
							continue;
						}

						if (var44 == 102) {
							--var5;
							var17 = Class88.method377(Class7.anIntArray71[var5]);
							var17.aClass131_Sub18Array1171 = null;
							Class131_Sub20_Sub6.method734(var17);
							continue;
						}

						if (var44 == 200) {
							var5 -= 2;
							var27 = Class7.anIntArray71[var5];
							var28 = Class7.anIntArray71[1 + var5];
							var50 = Class131_Sub20_Sub20.method880(var27, var28);
							if ((null != var50) && (var28 != -1)) {
								Class7.anIntArray71[var5++] = 1;
								if (var55)
									Class7.aClass131_Sub18_69 = var50;
								else
									Class7.aClass131_Sub18_78 = var50;
								continue;
							}

							Class7.anIntArray71[var5++] = 0;
							continue;
						}

						if (var44 == 201) {
							--var5;
							var17 = Class88.method377(Class7.anIntArray71[var5]);
							if (var17 != null) {
								Class7.anIntArray71[var5++] = 1;
								if (var55)
									Class7.aClass131_Sub18_69 = var17;
								else
									Class7.aClass131_Sub18_78 = var17;
							} else
								Class7.anIntArray71[var5++] = 0;
							continue;
						}
					} else {
						boolean var66;
						if (((var44 >= 1000) && (var44 < 1100)) || ((var44 >= 2000) && (var44 < 2100))) {
							var27 = -1;
							if (var44 >= 2000) {
								var44 -= 1000;
								--var5;
								var27 = Class7.anIntArray71[var5];
								var79 = Class88.method377(var27);
							} else
								var79 = var55 ? Class7.aClass131_Sub18_69 : Class7.aClass131_Sub18_78;

							if (var44 == 1000) {
								var5 -= 4;
								var79.anInt1167 = Class7.anIntArray71[var5];
								var79.anInt1157 = Class7.anIntArray71[var5 + 1];
								var79.anInt1163 = Class7.anIntArray71[var5 + 2];
								var79.anInt1261 = Class7.anIntArray71[3 + var5];
								Class131_Sub20_Sub6.method734(var79);
								Class131_Sub20_Sub3.method706(var79);
								if ((var27 != -1) && (var79.anInt1202 == 0))
									Class16_Sub1.method547(Class131_Sub18.aClass131_Sub18ArrayArray1174[var27 >> 16],
											var79, false);
								continue;
							}

							if (var44 == 1001) {
								var5 -= 4;
								var79.anInt1229 = Class7.anIntArray71[var5];
								var79.anInt1266 = Class7.anIntArray71[var5 + 1];
								var79.anInt1165 = Class7.anIntArray71[var5 + 2];
								var79.anInt1166 = Class7.anIntArray71[var5 + 3];
								Class131_Sub20_Sub6.method734(var79);
								Class131_Sub20_Sub3.method706(var79);
								if ((var27 != -1) && (var79.anInt1202 == 0))
									Class16_Sub1.method547(Class131_Sub18.aClass131_Sub18ArrayArray1174[var27 >> 16],
											var79, false);
								continue;
							}

							if (var44 == 1003) {
								--var5;
								var66 = Class7.anIntArray71[var5] == 1;
								if (var66 != var79.aBool1178) {
									var79.aBool1178 = var66;
									Class131_Sub20_Sub6.method734(var79);
								}
								continue;
							}

							if (var44 == 1005) {
								--var5;
								var79.aBool1290 = Class7.anIntArray71[var5] == 1;
								continue;
							}

							if (var44 == 1006) {
								--var5;
								var79.aBool1252 = Class7.anIntArray71[var5] == 1;
								continue;
							}
						} else if (((var44 >= 1100) && (var44 < 1200)) || ((var44 >= 2100) && (var44 < 2200))) {
							var28 = -1;
							if (var44 >= 2000) {
								var44 -= 1000;
								--var5;
								var28 = Class7.anIntArray71[var5];
								var17 = Class88.method377(var28);
							} else
								var17 = var55 ? Class7.aClass131_Sub18_69 : Class7.aClass131_Sub18_78;

							if (var44 == 1100) {
								var5 -= 2;
								var17.anInt1281 = Class7.anIntArray71[var5];
								if (var17.anInt1281 > (var17.anInt1181 - var17.anInt1173))
									var17.anInt1281 = var17.anInt1181 - var17.anInt1173;

								if (var17.anInt1281 < 0)
									var17.anInt1281 = 0;

								var17.anInt1180 = Class7.anIntArray71[1 + var5];
								if (var17.anInt1180 > (var17.anInt1182 - var17.anInt1291))
									var17.anInt1180 = var17.anInt1182 - var17.anInt1291;

								if (var17.anInt1180 < 0)
									var17.anInt1180 = 0;

								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1101) {
								--var5;
								var17.anInt1183 = Class7.anIntArray71[var5];
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1102) {
								--var5;
								var17.aBool1245 = Class7.anIntArray71[var5] == 1;
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1103) {
								--var5;
								var17.anInt1189 = Class7.anIntArray71[var5];
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1104) {
								--var5;
								var17.anInt1191 = Class7.anIntArray71[var5];
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1105) {
								--var5;
								var17.anInt1193 = Class7.anIntArray71[var5];
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1106) {
								--var5;
								var17.anInt1280 = Class7.anIntArray71[var5];
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1107) {
								--var5;
								var17.aBool1196 = Class7.anIntArray71[var5] == 1;
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1108) {
								var17.anInt1201 = 1;
								--var5;
								var17.anInt1172 = Class7.anIntArray71[var5];
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1109) {
								var5 -= 6;
								var17.anInt1207 = Class7.anIntArray71[var5];
								var17.anInt1208 = Class7.anIntArray71[var5 + 1];
								var17.anInt1209 = Class7.anIntArray71[2 + var5];
								var17.anInt1210 = Class7.anIntArray71[var5 + 3];
								var17.anInt1150 = Class7.anIntArray71[var5 + 4];
								var17.anInt1277 = Class7.anIntArray71[var5 + 5];
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1110) {
								--var5;
								var19 = Class7.anIntArray71[var5];
								if (var19 != var17.anInt1160) {
									var17.anInt1160 = var19;
									var17.anInt1279 = 0;
									var17.anInt1147 = 0;
									Class131_Sub20_Sub6.method734(var17);
								}
								continue;
							}

							if (var44 == 1111) {
								--var5;
								var17.aBool1215 = Class7.anIntArray71[var5] == 1;
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1112) {
								--var6;
								var18 = Class7.aStringArray72[var6];
								if (!var18.equals(var17.aString1218)) {
									var17.aString1218 = var18;
									Class131_Sub20_Sub6.method734(var17);
								}
								continue;
							}

							if (var44 == 1113) {
								--var5;
								var17.anInt1217 = Class7.anIntArray71[var5];
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1114) {
								var5 -= 3;
								var17.anInt1221 = Class7.anIntArray71[var5];
								var17.anInt1222 = Class7.anIntArray71[var5 + 1];
								var17.anInt1220 = Class7.anIntArray71[2 + var5];
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1115) {
								--var5;
								var17.aBool1223 = Class7.anIntArray71[var5] == 1;
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1116) {
								--var5;
								var17.anInt1197 = Class7.anIntArray71[var5];
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1117) {
								--var5;
								var17.anInt1205 = Class7.anIntArray71[var5];
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1118) {
								--var5;
								var17.aBool1158 = Class7.anIntArray71[var5] == 1;
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1119) {
								--var5;
								var17.aBool1241 = Class7.anIntArray71[var5] == 1;
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1120) {
								var5 -= 2;
								var17.anInt1181 = Class7.anIntArray71[var5];
								var17.anInt1182 = Class7.anIntArray71[var5 + 1];
								Class131_Sub20_Sub6.method734(var17);
								if ((var28 != -1) && (var17.anInt1202 == 0))
									Class16_Sub1.method547(Class131_Sub18.aClass131_Sub18ArrayArray1174[var28 >> 16],
											var17, false);
								continue;
							}

							if (var44 == 1121) {
								var19 = var17.anInt1272;
								var20 = var17.anInt1159;
								client.secureBuffer.method871(89);
								client.secureBuffer.method627(var19);
								client.secureBuffer.method586(var20);
								client.aClass131_Sub18_2049 = var17;
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1122) {
								--var5;
								var17.anInt1194 = Class7.anIntArray71[var5];
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1123) {
								--var5;
								var17.anInt1184 = Class7.anIntArray71[var5];
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1124) {
								--var5;
								var17.anInt1243 = Class7.anIntArray71[var5];
								Class131_Sub20_Sub6.method734(var17);
								continue;
							}

							if (var44 == 1125) {
								--var5;
								var19 = Class7.anIntArray71[var5];
								final Class27 var99 = (Class27) Class39.method214(Class39.method212(), var19);
								if (var99 != null) {
									var17.aClass27_1188 = var99;
									Class131_Sub20_Sub6.method734(var17);
								}
								continue;
							}
						} else if (((var44 < 1200) || (var44 >= 1300)) && ((var44 < 2200) || (var44 >= 2300))) {
							if (((var44 >= 1300) && (var44 < 1400)) || ((var44 >= 2300) && (var44 < 2400))) {
								if (var44 >= 2000) {
									var44 -= 1000;
									--var5;
									var17 = Class88.method377(Class7.anIntArray71[var5]);
								} else
									var17 = var55 ? Class7.aClass131_Sub18_69 : Class7.aClass131_Sub18_78;

								if (var44 == 1300) {
									--var5;
									var28 = Class7.anIntArray71[var5] - 1;
									if ((var28 >= 0) && (var28 <= 9)) {
										--var6;
										var17.method668(var28, Class7.aStringArray72[var6]);
										continue;
									}

									--var6;
									continue;
								}

								if (var44 == 1301) {
									var5 -= 2;
									var28 = Class7.anIntArray71[var5];
									var19 = Class7.anIntArray71[1 + var5];
									var17.aClass131_Sub18_1233 = Class131_Sub20_Sub20.method880(var28, var19);
									continue;
								}

								if (var44 == 1302) {
									--var5;
									var17.aBool1236 = Class7.anIntArray71[var5] == 1;
									continue;
								}

								if (var44 == 1303) {
									--var5;
									var17.anInt1234 = Class7.anIntArray71[var5];
									continue;
								}

								if (var44 == 1304) {
									--var5;
									var17.anInt1235 = Class7.anIntArray71[var5];
									continue;
								}

								if (var44 == 1305) {
									--var6;
									var17.aString1237 = Class7.aStringArray72[var6];
									continue;
								}

								if (var44 == 1306) {
									--var6;
									var17.aString1199 = Class7.aStringArray72[var6];
									continue;
								}

								if (var44 == 1307) {
									var17.aStringArray1257 = null;
									continue;
								}
							} else {
								String var48;
								int[] var52;
								if (((var44 >= 1400) && (var44 < 1500)) || ((var44 >= 2400) && (var44 < 2500))) {
									if (var44 >= 2000) {
										var44 -= 1000;
										--var5;
										var17 = Class88.method377(Class7.anIntArray71[var5]);
									} else
										var17 = var55 ? Class7.aClass131_Sub18_69 : Class7.aClass131_Sub18_78;

									--var6;
									var48 = Class7.aStringArray72[var6];
									var52 = null;
									if ((var48.length() > 0) && (var48.charAt(var48.length() - 1) == 89)) {
										--var5;
										var20 = Class7.anIntArray71[var5];
										if (var20 > 0)
											for (var52 = new int[var20]; var20-- > 0; var52[var20] = Class7.anIntArray71[var5])
												--var5;

										var48 = var48.substring(0, var48.length() - 1);
									}

									Object[] var95 = new Object[var48.length() + 1];

									for (var21 = var95.length - 1; var21 >= 1; --var21)
										if (var48.charAt(var21 - 1) == 115) {
											--var6;
											var95[var21] = Class7.aStringArray72[var6];
										} else {
											--var5;
											var95[var21] = new Integer(Class7.anIntArray71[var5]);
										}

									--var5;
									var21 = Class7.anIntArray71[var5];
									if (var21 != -1)
										var95[0] = new Integer(var21);
									else
										var95 = null;

									if (var44 == 1400)
										var17.anObjectArray1240 = var95;

									if (var44 == 1401)
										var17.anObjectArray1284 = var95;

									if (var44 == 1402)
										var17.anObjectArray1176 = var95;

									if (var44 == 1403)
										var17.anObjectArray1244 = var95;

									if (var44 == 1404)
										var17.anObjectArray1278 = var95;

									if (var44 == 1405)
										var17.anObjectArray1246 = var95;

									if (var44 == 1406)
										var17.anObjectArray1249 = var95;

									if (var44 == 1407) {
										var17.anObjectArray1250 = var95;
										var17.anIntArray1251 = var52;
									}

									if (var44 == 1408)
										var17.anObjectArray1256 = var95;

									if (var44 == 1409)
										var17.anObjectArray1262 = var95;

									if (var44 == 1410)
										var17.anObjectArray1247 = var95;

									if (var44 == 1411)
										var17.anObjectArray1275 = var95;

									if (var44 == 1412)
										var17.anObjectArray1169 = var95;

									if (var44 == 1414) {
										var17.anObjectArray1268 = var95;
										var17.anIntArray1253 = var52;
									}

									if (var44 == 1415) {
										var17.anObjectArray1254 = var95;
										var17.anIntArray1255 = var52;
									}

									if (var44 == 1416)
										var17.anObjectArray1248 = var95;

									if (var44 == 1417)
										var17.anObjectArray1258 = var95;

									if (var44 == 1418)
										var17.anObjectArray1170 = var95;

									if (var44 == 1419)
										var17.anObjectArray1260 = var95;

									if (var44 == 1420)
										var17.anObjectArray1149 = var95;

									if (var44 == 1421)
										var17.anObjectArray1242 = var95;

									if (var44 == 1422)
										var17.anObjectArray1155 = var95;

									if (var44 == 1423)
										var17.anObjectArray1232 = var95;

									if (var44 == 1424)
										var17.anObjectArray1265 = var95;

									if (var44 == 1425)
										var17.anObjectArray1267 = var95;

									if (var44 == 1426)
										var17.anObjectArray1195 = var95;

									if (var44 == 1427)
										var17.anObjectArray1259 = var95;

									var17.aBool1238 = true;
									continue;
								}

								if (var44 < 1600) {
									var17 = var55 ? Class7.aClass131_Sub18_69 : Class7.aClass131_Sub18_78;
									if (var44 == 1500) {
										Class7.anIntArray71[var5++] = var17.anInt1276;
										continue;
									}

									if (var44 == 1501) {
										Class7.anIntArray71[var5++] = var17.anInt1211;
										continue;
									}

									if (var44 == 1502) {
										Class7.anIntArray71[var5++] = var17.anInt1173;
										continue;
									}

									if (var44 == 1503) {
										Class7.anIntArray71[var5++] = var17.anInt1291;
										continue;
									}

									if (var44 == 1504) {
										Class7.anIntArray71[var5++] = var17.aBool1178 ? 1 : 0;
										continue;
									}

									if (var44 == 1505) {
										Class7.anIntArray71[var5++] = var17.anInt1177;
										continue;
									}
								} else if (var44 < 1700) {
									var17 = var55 ? Class7.aClass131_Sub18_69 : Class7.aClass131_Sub18_78;
									if (var44 == 1600) {
										Class7.anIntArray71[var5++] = var17.anInt1281;
										continue;
									}

									if (var44 == 1601) {
										Class7.anIntArray71[var5++] = var17.anInt1180;
										continue;
									}

									if (var44 == 1602) {
										Class7.aStringArray72[var6++] = var17.aString1218;
										continue;
									}

									if (var44 == 1603) {
										Class7.anIntArray71[var5++] = var17.anInt1181;
										continue;
									}

									if (var44 == 1604) {
										Class7.anIntArray71[var5++] = var17.anInt1182;
										continue;
									}

									if (var44 == 1605) {
										Class7.anIntArray71[var5++] = var17.anInt1277;
										continue;
									}

									if (var44 == 1606) {
										Class7.anIntArray71[var5++] = var17.anInt1209;
										continue;
									}

									if (var44 == 1607) {
										Class7.anIntArray71[var5++] = var17.anInt1150;
										continue;
									}

									if (var44 == 1608) {
										Class7.anIntArray71[var5++] = var17.anInt1210;
										continue;
									}

									if (var44 == 1609) {
										Class7.anIntArray71[var5++] = var17.anInt1189;
										continue;
									}

									if (var44 == 1610) {
										Class7.anIntArray71[var5++] = var17.anInt1243;
										continue;
									}

									if (var44 == 1611) {
										Class7.anIntArray71[var5++] = var17.anInt1183;
										continue;
									}

									if (var44 == 1612) {
										Class7.anIntArray71[var5++] = var17.anInt1184;
										continue;
									}

									if (var44 == 1613) {
										Class7.anIntArray71[var5++] = var17.aClass27_1188.method11((byte) -55);
										continue;
									}
								} else if (var44 < 1800) {
									var17 = var55 ? Class7.aClass131_Sub18_69 : Class7.aClass131_Sub18_78;
									if (var44 == 1700) {
										Class7.anIntArray71[var5++] = var17.anInt1168;
										continue;
									}

									if (var44 == 1701) {
										if (var17.anInt1168 != -1)
											Class7.anIntArray71[var5++] = var17.anInt1198;
										else
											Class7.anIntArray71[var5++] = 0;
										continue;
									}

									if (var44 == 1702) {
										Class7.anIntArray71[var5++] = var17.anInt1159;
										continue;
									}
								} else if (var44 < 1900) {
									var17 = var55 ? Class7.aClass131_Sub18_69 : Class7.aClass131_Sub18_78;
									if (var44 == 1800) {
										var16 = Class7.anIntArray71;
										var19 = var5++;
										var21 = Class49.method254(var17);
										var20 = (var21 >> 11) & 63;
										var16[var19] = var20;
										continue;
									}

									if (var44 == 1801) {
										--var5;
										var28 = Class7.anIntArray71[var5];
										--var28;
										if ((var17.aStringArray1257 != null) && (var28 < var17.aStringArray1257.length)
												&& (var17.aStringArray1257[var28] != null)) {
											Class7.aStringArray72[var6++] = var17.aStringArray1257[var28];
											continue;
										}

										Class7.aStringArray72[var6++] = "";
										continue;
									}

									if (var44 == 1802) {
										if (var17.aString1237 == null)
											Class7.aStringArray72[var6++] = "";
										else
											Class7.aStringArray72[var6++] = var17.aString1237;
										continue;
									}
								} else if (((var44 < 1900) || (var44 >= 2000)) && ((var44 < 2900) || (var44 >= 3000))) {
									if (var44 < 2600) {
										--var5;
										var17 = Class88.method377(Class7.anIntArray71[var5]);
										if (var44 == 2500) {
											Class7.anIntArray71[var5++] = var17.anInt1276;
											continue;
										}

										if (var44 == 2501) {
											Class7.anIntArray71[var5++] = var17.anInt1211;
											continue;
										}

										if (var44 == 2502) {
											Class7.anIntArray71[var5++] = var17.anInt1173;
											continue;
										}

										if (var44 == 2503) {
											Class7.anIntArray71[var5++] = var17.anInt1291;
											continue;
										}

										if (var44 == 2504) {
											Class7.anIntArray71[var5++] = var17.aBool1178 ? 1 : 0;
											continue;
										}

										if (var44 == 2505) {
											Class7.anIntArray71[var5++] = var17.anInt1177;
											continue;
										}
									} else if (var44 < 2700) {
										--var5;
										var17 = Class88.method377(Class7.anIntArray71[var5]);
										if (var44 == 2600) {
											Class7.anIntArray71[var5++] = var17.anInt1281;
											continue;
										}

										if (var44 == 2601) {
											Class7.anIntArray71[var5++] = var17.anInt1180;
											continue;
										}

										if (var44 == 2602) {
											Class7.aStringArray72[var6++] = var17.aString1218;
											continue;
										}

										if (var44 == 2603) {
											Class7.anIntArray71[var5++] = var17.anInt1181;
											continue;
										}

										if (var44 == 2604) {
											Class7.anIntArray71[var5++] = var17.anInt1182;
											continue;
										}

										if (var44 == 2605) {
											Class7.anIntArray71[var5++] = var17.anInt1277;
											continue;
										}

										if (var44 == 2606) {
											Class7.anIntArray71[var5++] = var17.anInt1209;
											continue;
										}

										if (var44 == 2607) {
											Class7.anIntArray71[var5++] = var17.anInt1150;
											continue;
										}

										if (var44 == 2608) {
											Class7.anIntArray71[var5++] = var17.anInt1210;
											continue;
										}

										if (var44 == 2609) {
											Class7.anIntArray71[var5++] = var17.anInt1189;
											continue;
										}

										if (var44 == 2610) {
											Class7.anIntArray71[var5++] = var17.anInt1243;
											continue;
										}

										if (var44 == 2611) {
											Class7.anIntArray71[var5++] = var17.anInt1183;
											continue;
										}

										if (var44 == 2612) {
											Class7.anIntArray71[var5++] = var17.anInt1184;
											continue;
										}

										if (var44 == 2613) {
											Class7.anIntArray71[var5++] = var17.aClass27_1188.method11((byte) 26);
											continue;
										}
									} else if (var44 < 2800) {
										if (var44 == 2700) {
											--var5;
											var17 = Class88.method377(Class7.anIntArray71[var5]);
											Class7.anIntArray71[var5++] = var17.anInt1168;
											continue;
										}

										if (var44 == 2701) {
											--var5;
											var17 = Class88.method377(Class7.anIntArray71[var5]);
											if (var17.anInt1168 != -1)
												Class7.anIntArray71[var5++] = var17.anInt1198;
											else
												Class7.anIntArray71[var5++] = 0;
											continue;
										}

										if (var44 == 2702) {
											--var5;
											var27 = Class7.anIntArray71[var5];
											final Class131_Sub7 var46 = (Class131_Sub7) client.aClass114_2184
													.method457(var27);
											if (null != var46)
												Class7.anIntArray71[var5++] = 1;
											else
												Class7.anIntArray71[var5++] = 0;
											continue;
										}

										if (var44 == 2706) {
											Class7.anIntArray71[var5++] = client.anInt2128;
											continue;
										}
									} else if (var44 < 2900) {
										--var5;
										var17 = Class88.method377(Class7.anIntArray71[var5]);
										if (var44 == 2800) {
											var16 = Class7.anIntArray71;
											var19 = var5++;
											var21 = Class49.method254(var17);
											var20 = (var21 >> 11) & 63;
											var16[var19] = var20;
											continue;
										}

										if (var44 == 2801) {
											--var5;
											var28 = Class7.anIntArray71[var5];
											--var28;
											if ((null != var17.aStringArray1257)
													&& (var28 < var17.aStringArray1257.length)
													&& (null != var17.aStringArray1257[var28])) {
												Class7.aStringArray72[var6++] = var17.aStringArray1257[var28];
												continue;
											}

											Class7.aStringArray72[var6++] = "";
											continue;
										}

										if (var44 == 2802) {
											if (null == var17.aString1237)
												Class7.aStringArray72[var6++] = "";
											else
												Class7.aStringArray72[var6++] = var17.aString1237;
											continue;
										}
									} else if (var44 < 3200) {
										if (var44 == 3100) {
											--var6;
											var58 = Class7.aStringArray72[var6];
											Class131_Sub20_Sub15.method792(0, "", var58);
											continue;
										}

										if (var44 == 3101) {
											var5 -= 2;
											Class36.method206(Class131_Sub11.myPlayer,
													Class7.anIntArray71[var5], Class7.anIntArray71[1 + var5]);
											continue;
										}

										if (var44 == 3103) {
											Class47.method240();
											continue;
										}

										if (var44 == 3104) {
											--var6;
											var58 = Class7.aStringArray72[var6];
											var28 = 0;
											if (Class93.method390(var58))
												var28 = Class131_Sub20_Sub8.method746(var58);

											client.secureBuffer.method871(90);
											client.secureBuffer.writeInt(var28);
											continue;
										}

										if (var44 == 3105) {
											--var6;
											var58 = Class7.aStringArray72[var6];
											client.secureBuffer.method871(234);
											client.secureBuffer.writeByte(var58.length() + 1);
											client.secureBuffer.writeStr(var58);
											continue;
										}

										if (var44 == 3106) {
											--var6;
											var58 = Class7.aStringArray72[var6];
											client.secureBuffer.method871(207);
											client.secureBuffer.writeByte(var58.length() + 1);
											client.secureBuffer.writeStr(var58);
											continue;
										}

										if (var44 == 3107) {
											--var5;
											var27 = Class7.anIntArray71[var5];
											--var6;
											var48 = Class7.aStringArray72[var6];
											Class78.method352(var27, var48);
											continue;
										}

										if (var44 == 3108) {
											var5 -= 3;
											var27 = Class7.anIntArray71[var5];
											var28 = Class7.anIntArray71[1 + var5];
											var19 = Class7.anIntArray71[var5 + 2];
											var75 = Class88.method377(var19);
											Class49.method253(var75, var27, var28);
											continue;
										}

										if (var44 == 3109) {
											var5 -= 2;
											var27 = Class7.anIntArray71[var5];
											var28 = Class7.anIntArray71[var5 + 1];
											var50 = var55 ? Class7.aClass131_Sub18_69 : Class7.aClass131_Sub18_78;
											Class49.method253(var50, var27, var28);
											continue;
										}

										if (var44 == 3110) {
											--var5;
											RuntimeException_Sub1.aBool1954 = Class7.anIntArray71[var5] == 1;
											continue;
										}

										if (var44 == 3111) {
											Class7.anIntArray71[var5++] = Class50.aClass28_494.aBool251 ? 1 : 0;
											continue;
										}

										if (var44 == 3112) {
											--var5;
											Class50.aClass28_494.aBool251 = Class7.anIntArray71[var5] == 1;
											Class24.method115();
											continue;
										}

										if (var44 == 3113) {
											--var6;
											var58 = Class7.aStringArray72[var6];
											--var5;
											var90 = Class7.anIntArray71[var5] == 1;
											Class131_Sub20_Sub19_Sub1.method918(var58, var90, false);
											continue;
										}

										if (var44 == 3115) {
											--var5;
											var27 = Class7.anIntArray71[var5];
											client.secureBuffer.method871(62);
											client.secureBuffer.method586(var27);
											continue;
										}

										if (var44 == 3116) {
											--var5;
											var27 = Class7.anIntArray71[var5];
											var6 -= 2;
											var48 = Class7.aStringArray72[var6];
											var18 = Class7.aStringArray72[1 + var6];
											if ((var48.length() <= 500) && (var18.length() <= 500)) {
												client.secureBuffer.method871(223);
												client.secureBuffer
														.method586(1 + Class131_Sub6.method554(var48)
																+ Class131_Sub6.method554(var18));
												client.secureBuffer.writeByte(var27);
												client.secureBuffer.writeStr(var48);
												client.secureBuffer.writeStr(var18);
											}
											continue;
										}
									} else if (var44 < 3300) {
										if (var44 == 3200) {
											var5 -= 3;
											Class25.method120(Class7.anIntArray71[var5], Class7.anIntArray71[1 + var5],
													Class7.anIntArray71[var5 + 2]);
											continue;
										}

										if (var44 == 3201) {
											--var5;
											var27 = Class7.anIntArray71[var5];
											if ((var27 == -1) && !client.aBool2262)
												Class126_Sub1.method524();
											else if ((var27 != -1) && (var27 != client.anInt2052)
													&& (client.anInt2260 != 0) && !client.aBool2262) {
												final Class100_Sub1 var49 = Class44.aClass100_Sub1_446;
												var19 = client.anInt2260;
												Class113.anInt830 = 1;
												Class50.aClass100_495 = var49;
												Class24.anInt213 = var27;
												Class130.anInt901 = 0;
												Class113.anInt833 = var19;
												Class50.aBool496 = false;
												Class113.anInt834 = 2;
											}

											client.anInt2052 = var27;
											continue;
										}

										if (var44 == 3202) {
											var5 -= 2;
											final int var10000 = Class7.anIntArray71[var5];
											var10001 = Class7.anIntArray71[1 + var5];
											Class123.method483(var10000);
											continue;
										}
									} else {
										int var29;
										int var30;
										byte[] var60;
										if (var44 < 3400) {
											if (var44 == 3300) {
												Class7.anIntArray71[var5++] = client.anInt2038;
												continue;
											}

											if (var44 == 3301) {
												var5 -= 2;
												var27 = Class7.anIntArray71[var5];
												var28 = Class7.anIntArray71[var5 + 1];
												Class7.anIntArray71[var5++] = Class16.method65(var27, var28);
												continue;
											}

											if (var44 == 3302) {
												var5 -= 2;
												var27 = Class7.anIntArray71[var5];
												var28 = Class7.anIntArray71[1 + var5];
												Class7.anIntArray71[var5++] = Class131_Sub20_Sub7.method743(var27,
														var28);
												continue;
											}

											Class131_Sub11 var22;
											if (var44 == 3303) {
												var5 -= 2;
												var27 = Class7.anIntArray71[var5];
												var28 = Class7.anIntArray71[var5 + 1];
												var52 = Class7.anIntArray71;
												var20 = var5++;
												var22 = (Class131_Sub11) Class131_Sub11.aClass114_1074.method457(var27);
												if (var22 == null)
													var21 = 0;
												else if (var28 == -1)
													var21 = 0;
												else {
													var29 = 0;

													for (var30 = 0; var30 < var22.anIntArray1071.length; ++var30)
														if (var28 == var22.anIntArray1070[var30])
															var29 += var22.anIntArray1071[var30];

													var21 = var29;
												}

												var52[var20] = var21;
												continue;
											}

											if (var44 == 3304) {
												--var5;
												var27 = Class7.anIntArray71[var5];
												var16 = Class7.anIntArray71;
												var19 = var5++;
												Class131_Sub20_Sub11 var23 = (Class131_Sub20_Sub11) Class131_Sub20_Sub11.aClass121_1556
														.method482(var27);
												Class131_Sub20_Sub11 var77;
												if (null != var23)
													var77 = var23;
												else {
													var60 = Class133.aClass100_905.method402(5, var27);
													var23 = new Class131_Sub20_Sub11();
													if (null != var60)
														var23.method767(new DataBuffer(var60));

													Class131_Sub20_Sub11.aClass121_1556.method479(var23, var27);
													var77 = var23;
												}

												var16[var19] = var77.anInt1555;
												continue;
											}

											if (var44 == 3305) {
												--var5;
												var27 = Class7.anIntArray71[var5];
												Class7.anIntArray71[var5++] = client.anIntArray2161[var27];
												continue;
											}

											if (var44 == 3306) {
												--var5;
												var27 = Class7.anIntArray71[var5];
												Class7.anIntArray71[var5++] = client.anIntArray2162[var27];
												continue;
											}

											if (var44 == 3307) {
												--var5;
												var27 = Class7.anIntArray71[var5];
												Class7.anIntArray71[var5++] = client.anIntArray2163[var27];
												continue;
											}

											if (var44 == 3308) {
												var27 = Class39.anInt410;
												var28 = Class131_Sub20_Sub20.anInt1649
														+ (Class131_Sub11.myPlayer.anInt1718 >> 7);
												var19 = (Class131_Sub11.myPlayer.anInt1759 >> 7)
														+ Class50.anInt491;
												Class7.anIntArray71[var5++] = (var28 << 14) + (var27 << 28) + var19;
												continue;
											}

											if (var44 == 3309) {
												--var5;
												var27 = Class7.anIntArray71[var5];
												Class7.anIntArray71[var5++] = (var27 >> 14) & 16383;
												continue;
											}

											if (var44 == 3310) {
												--var5;
												var27 = Class7.anIntArray71[var5];
												Class7.anIntArray71[var5++] = var27 >> 28;
												continue;
											}

											if (var44 == 3311) {
												--var5;
												var27 = Class7.anIntArray71[var5];
												Class7.anIntArray71[var5++] = var27 & 16383;
												continue;
											}

											if (var44 == 3312) {
												Class7.anIntArray71[var5++] = client.aBool2147 ? 1 : 0;
												continue;
											}

											if (var44 == 3313) {
												var5 -= 2;
												var27 = Class7.anIntArray71[var5] + '\u8000';
												var28 = Class7.anIntArray71[1 + var5];
												var52 = Class7.anIntArray71;
												var20 = var5++;
												var22 = (Class131_Sub11) Class131_Sub11.aClass114_1074.method457(var27);
												if (var22 == null)
													var21 = -1;
												else if ((var28 >= 0) && (var28 < var22.anIntArray1070.length))
													var21 = var22.anIntArray1070[var28];
												else
													var21 = -1;

												var52[var20] = var21;
												continue;
											}

											if (var44 == 3314) {
												var5 -= 2;
												var27 = '\u8000' + Class7.anIntArray71[var5];
												var28 = Class7.anIntArray71[var5 + 1];
												Class7.anIntArray71[var5++] = Class131_Sub20_Sub7.method743(var27,
														var28);
												continue;
											}

											if (var44 == 3315) {
												var5 -= 2;
												var27 = Class7.anIntArray71[var5] + '\u8000';
												var28 = Class7.anIntArray71[1 + var5];
												var52 = Class7.anIntArray71;
												var20 = var5++;
												var22 = (Class131_Sub11) Class131_Sub11.aClass114_1074.method457(var27);
												if (var22 == null)
													var21 = 0;
												else if (var28 == -1)
													var21 = 0;
												else {
													var29 = 0;

													for (var30 = 0; var30 < var22.anIntArray1071.length; ++var30)
														if (var28 == var22.anIntArray1070[var30])
															var29 += var22.anIntArray1071[var30];

													var21 = var29;
												}

												var52[var20] = var21;
												continue;
											}

											if (var44 == 3316) {
												if (client.playerRights >= 2)
													Class7.anIntArray71[var5++] = client.playerRights;
												else
													Class7.anIntArray71[var5++] = 0;
												continue;
											}

											if (var44 == 3317) {
												Class7.anIntArray71[var5++] = client.anInt2046;
												continue;
											}

											if (var44 == 3318) {
												Class7.anIntArray71[var5++] = client.anInt2123;
												continue;
											}

											if (var44 == 3321) {
												Class7.anIntArray71[var5++] = client.anInt2188;
												continue;
											}

											if (var44 == 3322) {
												Class7.anIntArray71[var5++] = client.anInt2189;
												continue;
											}

											if (var44 == 3323) {
												if (client.aBool2192)
													Class7.anIntArray71[var5++] = 1;
												else
													Class7.anIntArray71[var5++] = 0;
												continue;
											}

											if (var44 == 3324) {
												Class7.anIntArray71[var5++] = client.anInt2028;
												continue;
											}
										} else if (var44 < 3500) {
											if (var44 == 3400) {
												var5 -= 2;
												var27 = Class7.anIntArray71[var5];
												var28 = Class7.anIntArray71[var5 + 1];
												Class131_Sub20_Sub12 var84 = (Class131_Sub20_Sub12) Class131_Sub20_Sub12.aClass121_1557
														.method482(var27);
												Class131_Sub20_Sub12 var54;
												if (var84 != null)
													var54 = var84;
												else {
													final byte[] var67 = Class131_Sub20_Sub12.aClass100_1561
															.method402(8, var27);
													var84 = new Class131_Sub20_Sub12();
													if (null != var67)
														var84.method772(new DataBuffer(var67));

													Class131_Sub20_Sub12.aClass121_1557.method479(var84, var27);
													var54 = var84;
												}

												var84 = var54;
												if (var54.aChar1559 != 115)
													;

												for (var21 = 0; var21 < var84.anInt1562; ++var21)
													if (var84.anIntArray1563[var21] == var28) {
														Class7.aStringArray72[var6++] = var84.aStringArray1565[var21];
														var84 = null;
														break;
													}

												if (var84 != null)
													Class7.aStringArray72[var6++] = var84.aString1566;
												continue;
											}

											if (var44 == 3408) {
												var5 -= 4;
												var27 = Class7.anIntArray71[var5];
												var28 = Class7.anIntArray71[var5 + 1];
												var19 = Class7.anIntArray71[2 + var5];
												var20 = Class7.anIntArray71[3 + var5];
												Class131_Sub20_Sub12 var63 = (Class131_Sub20_Sub12) Class131_Sub20_Sub12.aClass121_1557
														.method482(var19);
												Class131_Sub20_Sub12 var65;
												if (null != var63)
													var65 = var63;
												else {
													final byte[] var25 = Class131_Sub20_Sub12.aClass100_1561
															.method402(8, var19);
													var63 = new Class131_Sub20_Sub12();
													if (null != var25)
														var63.method772(new DataBuffer(var25));

													Class131_Sub20_Sub12.aClass121_1557.method479(var63, var19);
													var65 = var63;
												}

												var63 = var65;
												if ((var27 == var65.aChar1558) && (var28 == var65.aChar1559)) {
													for (var29 = 0; var29 < var63.anInt1562; ++var29)
														if (var20 == var63.anIntArray1563[var29]) {
															if (var28 == 115)
																Class7.aStringArray72[var6++] = var63.aStringArray1565[var29];
															else
																Class7.anIntArray71[var5++] = var63.anIntArray1560[var29];

															var63 = null;
															break;
														}

													if (var63 != null)
														if (var28 == 115)
															Class7.aStringArray72[var6++] = var63.aString1566;
														else
															Class7.anIntArray71[var5++] = var63.anInt1564;
													continue;
												}

												if (var28 == 115)
													Class7.aStringArray72[var6++] = "null";
												else
													Class7.anIntArray71[var5++] = 0;
												continue;
											}
										} else if (var44 < 3700) {
											if (var44 == 3600) {
												if (client.anInt2134 == 0)
													Class7.anIntArray71[var5++] = -2;
												else if (client.anInt2134 == 1)
													Class7.anIntArray71[var5++] = -1;
												else
													Class7.anIntArray71[var5++] = client.anInt2290;
												continue;
											}

											if (var44 == 3601) {
												--var5;
												var27 = Class7.anIntArray71[var5];
												if ((client.anInt2134 == 2) && (var27 < client.anInt2290)) {
													Class7.aStringArray72[var6++] = client.aClass44Array2292[var27].aString442;
													Class7.aStringArray72[var6++] = client.aClass44Array2292[var27].aString437;
													continue;
												}

												Class7.aStringArray72[var6++] = "";
												Class7.aStringArray72[var6++] = "";
												continue;
											}

											if (var44 == 3602) {
												--var5;
												var27 = Class7.anIntArray71[var5];
												if ((client.anInt2134 == 2) && (var27 < client.anInt2290)) {
													Class7.anIntArray71[var5++] = client.aClass44Array2292[var27].anInt438;
													continue;
												}

												Class7.anIntArray71[var5++] = 0;
												continue;
											}

											if (var44 == 3603) {
												--var5;
												var27 = Class7.anIntArray71[var5];
												if ((client.anInt2134 == 2) && (var27 < client.anInt2290)) {
													Class7.anIntArray71[var5++] = client.aClass44Array2292[var27].anInt445;
													continue;
												}

												Class7.anIntArray71[var5++] = 0;
												continue;
											}

											if (var44 == 3604) {
												--var6;
												var58 = Class7.aStringArray72[var6];
												--var5;
												var28 = Class7.anIntArray71[var5];
												Class131_Sub20_Sub19_Sub2.method919(var58, var28);
												continue;
											}

											if (var44 == 3605) {
												--var6;
												var58 = Class7.aStringArray72[var6];
												Class108.method433(var58);
												continue;
											}

											if (var44 == 3606) {
												--var6;
												var58 = Class7.aStringArray72[var6];
												LoginEncoder.method196(var58);
												continue;
											}

											if (var44 == 3607) {
												--var6;
												var58 = Class7.aStringArray72[var6];
												Class18.method87(var58, false);
												continue;
											}

											String var68;
											if (var44 == 3608) {
												--var6;
												var58 = Class7.aStringArray72[var6];
												if (var58 == null)
													continue;

												var48 = Class85.method371(var58, client.aClass142_2031);
												if (var48 == null)
													continue;

												var19 = 0;

												while (true) {
													if (var19 >= client.anInt2294)
														continue label2851;

													final Class36 var89 = client.aClass36Array2295[var19];
													var68 = var89.aString369;
													var69 = Class85.method371(var68, client.aClass142_2031);
													if (Class1.method14(var58, var48, var68, var69)) {
														--client.anInt2294;

														for (var29 = var19; var29 < client.anInt2294; ++var29)
															client.aClass36Array2295[var29] = client.aClass36Array2295[var29
																	+ 1];

														client.anInt2216 = client.anInt2298;
														client.secureBuffer.method871(111);
														client.secureBuffer
																.writeByte(Class131_Sub6.method554(var58));
														client.secureBuffer.writeStr(var58);
														continue label2851;
													}

													++var19;
												}
											}

											if (var44 == 3609) {
												--var6;
												var58 = Class7.aStringArray72[var6];
												final Class82[] var51 = Class42.method221();

												for (var19 = 0; var19 < var51.length; ++var19) {
													final Class82 var88 = var51[var19];
													if (var88.anInt689 != -1) {
														var29 = var88.anInt689;
														var69 = "<img=" + var29 + ">";
														if (var58.startsWith(var69)) {
															var58 = var58.substring(
																	6 + Integer.toString(var88.anInt689).length());
															break;
														}
													}
												}

												Class7.anIntArray71[var5++] = Class41.method219(var58, false) ? 1 : 0;
												continue;
											}

											if (var44 == 3611) {
												if (null != client.aString2250)
													Class7.aStringArray72[var6++] = Class48
															.method252(client.aString2250);
												else
													Class7.aStringArray72[var6++] = "";
												continue;
											}

											if (var44 == 3612) {
												if (null != client.aString2250)
													Class7.anIntArray71[var5++] = Class23.anInt210;
												else
													Class7.anIntArray71[var5++] = 0;
												continue;
											}

											if (var44 == 3613) {
												--var5;
												var27 = Class7.anIntArray71[var5];
												if ((null != client.aString2250) && (var27 < Class23.anInt210)) {
													Class7.aStringArray72[var6++] = Class131_Sub20_Sub8.aClass131_Sub13Array1498[var27].aString1106;
													continue;
												}

												Class7.aStringArray72[var6++] = "";
												continue;
											}

											if (var44 == 3614) {
												--var5;
												var27 = Class7.anIntArray71[var5];
												if ((null != client.aString2250) && (var27 < Class23.anInt210)) {
													Class7.anIntArray71[var5++] = Class131_Sub20_Sub8.aClass131_Sub13Array1498[var27].anInt1102;
													continue;
												}

												Class7.anIntArray71[var5++] = 0;
												continue;
											}

											if (var44 == 3615) {
												--var5;
												var27 = Class7.anIntArray71[var5];
												if ((client.aString2250 != null) && (var27 < Class23.anInt210)) {
													Class7.anIntArray71[var5++] = Class131_Sub20_Sub8.aClass131_Sub13Array1498[var27].aByte1103;
													continue;
												}

												Class7.anIntArray71[var5++] = 0;
												continue;
											}

											if (var44 == 3616) {
												Class7.anIntArray71[var5++] = Class113.aByte836;
												continue;
											}

											if (var44 == 3617) {
												--var6;
												var58 = Class7.aStringArray72[var6];
												Class31.method137(var58);
												continue;
											}

											if (var44 == 3618) {
												Class7.anIntArray71[var5++] = Class28.aByte259;
												continue;
											}

											if (var44 == 3619) {
												--var6;
												var58 = Class7.aStringArray72[var6];
												Class74.method336(var58);
												continue;
											}

											if (var44 == 3620) {
												Class131_Sub20_Sub8.method748();
												continue;
											}

											if (var44 == 3621) {
												if (client.anInt2134 == 0)
													Class7.anIntArray71[var5++] = -1;
												else
													Class7.anIntArray71[var5++] = client.anInt2294;
												continue;
											}

											if (var44 == 3622) {
												--var5;
												var27 = Class7.anIntArray71[var5];
												if ((client.anInt2134 != 0) && (var27 < client.anInt2294)) {
													Class7.aStringArray72[var6++] = client.aClass36Array2295[var27].aString369;
													Class7.aStringArray72[var6++] = client.aClass36Array2295[var27].aString372;
													continue;
												}

												Class7.aStringArray72[var6++] = "";
												Class7.aStringArray72[var6++] = "";
												continue;
											}

											if (var44 == 3623) {
												label2634: {
													--var6;
													var58 = Class7.aStringArray72[var6];
													var18 = "<img=0>";
													if (!var58.startsWith(var18)) {
														var68 = "<img=1>";
														if (!var58.startsWith(var68))
															break label2634;
													}

													var58 = var58.substring(7);
												}

												Class7.anIntArray71[var5++] = Player
														.method1075(var58) ? 1 : 0;
												continue;
											}

											if (var44 == 3624) {
												--var5;
												var27 = Class7.anIntArray71[var5];
												if ((Class131_Sub20_Sub8.aClass131_Sub13Array1498 != null)
														&& (var27 < Class23.anInt210)
														&& Class131_Sub20_Sub8.aClass131_Sub13Array1498[var27].aString1106
																.equalsIgnoreCase(
																		Class131_Sub11.myPlayer.aString2004)) {
													Class7.anIntArray71[var5++] = 1;
													continue;
												}

												Class7.anIntArray71[var5++] = 0;
												continue;
											}

											if (var44 == 3625) {
												if (client.aString2251 != null)
													Class7.aStringArray72[var6++] = Class48
															.method252(client.aString2251);
												else
													Class7.aStringArray72[var6++] = "";
												continue;
											}
										} else {
											long var31;
											if (var44 < 4000) {
												if (var44 == 3903) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													Class7.anIntArray71[var5++] = client.grandExchangeOffers[var27]
															.method497();
													continue;
												}

												if (var44 == 3904) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													Class7.anIntArray71[var5++] = client.grandExchangeOffers[var27].anInt894;
													continue;
												}

												if (var44 == 3905) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													Class7.anIntArray71[var5++] = client.grandExchangeOffers[var27].anInt895;
													continue;
												}

												if (var44 == 3906) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													Class7.anIntArray71[var5++] = client.grandExchangeOffers[var27].anInt898;
													continue;
												}

												if (var44 == 3907) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													Class7.anIntArray71[var5++] = client.grandExchangeOffers[var27].anInt897;
													continue;
												}

												if (var44 == 3908) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													Class7.anIntArray71[var5++] = client.grandExchangeOffers[var27].anInt896;
													continue;
												}

												if (var44 == 3910) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													var28 = client.grandExchangeOffers[var27].method496();
													Class7.anIntArray71[var5++] = var28 == 0 ? 1 : 0;
													continue;
												}

												if (var44 == 3911) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													var28 = client.grandExchangeOffers[var27].method496();
													Class7.anIntArray71[var5++] = var28 == 2 ? 1 : 0;
													continue;
												}

												if (var44 == 3912) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													var28 = client.grandExchangeOffers[var27].method496();
													Class7.anIntArray71[var5++] = var28 == 5 ? 1 : 0;
													continue;
												}

												if (var44 == 3913) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													var28 = client.grandExchangeOffers[var27].method496();
													Class7.anIntArray71[var5++] = var28 == 1 ? 1 : 0;
													continue;
												}

												boolean var98;
												if (var44 == 3914) {
													--var5;
													var98 = Class7.anIntArray71[var5] == 1;
													if (null != Class78.aClass141_646)
														Class78.aClass141_646.method517(Class141.aComparator931, var98);
													continue;
												}

												if (var44 == 3915) {
													--var5;
													var98 = Class7.anIntArray71[var5] == 1;
													if (null != Class78.aClass141_646)
														Class78.aClass141_646.method517(Class141.aComparator933, var98);
													continue;
												}

												if (var44 == 3916) {
													var5 -= 2;
													var98 = Class7.anIntArray71[var5] == 1;
													var90 = Class7.anIntArray71[1 + var5] == 1;
													if (null != Class78.aClass141_646)
														Class78.aClass141_646.method517(new Class24(var90), var98);
													continue;
												}

												if (var44 == 3917) {
													--var5;
													var98 = Class7.anIntArray71[var5] == 1;
													if (null != Class78.aClass141_646)
														Class78.aClass141_646.method517(Class141.aComparator930, var98);
													continue;
												}

												if (var44 == 3918) {
													--var5;
													var98 = Class7.anIntArray71[var5] == 1;
													if (null != Class78.aClass141_646)
														Class78.aClass141_646.method517(Class141.aComparator934, var98);
													continue;
												}

												if (var44 == 3919) {
													Class7.anIntArray71[var5++] = Class78.aClass141_646 == null ? 0
															: Class78.aClass141_646.aList932.size();
													continue;
												}

												Class137 var53;
												if (var44 == 3920) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													var53 = (Class137) Class78.aClass141_646.aList932.get(var27);
													Class7.anIntArray71[var5++] = var53.anInt912;
													continue;
												}

												if (var44 == 3921) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													var53 = (Class137) Class78.aClass141_646.aList932.get(var27);
													Class7.aStringArray72[var6++] = var53.method504();
													continue;
												}

												if (var44 == 3922) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													var53 = (Class137) Class78.aClass141_646.aList932.get(var27);
													Class7.aStringArray72[var6++] = var53.method505();
													continue;
												}

												if (var44 == 3923) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													var53 = (Class137) Class78.aClass141_646.aList932.get(var27);
													var31 = Class84.method366(780546663) - Class28.aLong256
															- var53.aLong911;
													var21 = (int) (var31 / 3600000L);
													var24 = (int) ((var31 - var21 * 3600000) / 60000L);
													var29 = (int) ((var31 - 3600000 * var21 - '\uea60' * var24)
															/ 1000L);
													final String var33 = var21 + ":" + (var24 / 10) + (var24 % 10) + ":"
															+ (var29 / 10) + (var29 % 10);
													Class7.aStringArray72[var6++] = var33;
													continue;
												}

												if (var44 == 3924) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													var53 = (Class137) Class78.aClass141_646.aList932.get(var27);
													Class7.anIntArray71[var5++] = var53.aClass129_910.anInt898;
													continue;
												}

												if (var44 == 3925) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													var53 = (Class137) Class78.aClass141_646.aList932.get(var27);
													Class7.anIntArray71[var5++] = var53.aClass129_910.anInt895;
													continue;
												}

												if (var44 == 3926) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													var53 = (Class137) Class78.aClass141_646.aList932.get(var27);
													Class7.anIntArray71[var5++] = var53.aClass129_910.anInt894;
													continue;
												}
											} else if (var44 < 4100) {
												if (var44 == 4000) {
													var5 -= 2;
													var27 = Class7.anIntArray71[var5];
													var28 = Class7.anIntArray71[var5 + 1];
													Class7.anIntArray71[var5++] = var27 + var28;
													continue;
												}

												if (var44 == 4001) {
													var5 -= 2;
													var27 = Class7.anIntArray71[var5];
													var28 = Class7.anIntArray71[1 + var5];
													Class7.anIntArray71[var5++] = var27 - var28;
													continue;
												}

												if (var44 == 4002) {
													var5 -= 2;
													var27 = Class7.anIntArray71[var5];
													var28 = Class7.anIntArray71[var5 + 1];
													Class7.anIntArray71[var5++] = var28 * var27;
													continue;
												}

												if (var44 == 4003) {
													var5 -= 2;
													var27 = Class7.anIntArray71[var5];
													var28 = Class7.anIntArray71[1 + var5];
													Class7.anIntArray71[var5++] = var27 / var28;
													continue;
												}

												if (var44 == 4004) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													Class7.anIntArray71[var5++] = (int) (Math.random() * var27);
													continue;
												}

												if (var44 == 4005) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													Class7.anIntArray71[var5++] = (int) (Math.random() * (var27 + 1));
													continue;
												}

												if (var44 == 4006) {
													var5 -= 5;
													var27 = Class7.anIntArray71[var5];
													var28 = Class7.anIntArray71[var5 + 1];
													var19 = Class7.anIntArray71[2 + var5];
													var20 = Class7.anIntArray71[3 + var5];
													var21 = Class7.anIntArray71[4 + var5];
													Class7.anIntArray71[var5++] = (((var28 - var27) * (var21 - var19))
															/ (var20 - var19)) + var27;
													continue;
												}

												if (var44 == 4007) {
													var5 -= 2;
													var27 = Class7.anIntArray71[var5];
													var28 = Class7.anIntArray71[var5 + 1];
													Class7.anIntArray71[var5++] = ((var27 * var28) / 100) + var27;
													continue;
												}

												if (var44 == 4008) {
													var5 -= 2;
													var27 = Class7.anIntArray71[var5];
													var28 = Class7.anIntArray71[var5 + 1];
													Class7.anIntArray71[var5++] = var27 | (1 << var28);
													continue;
												}

												if (var44 == 4009) {
													var5 -= 2;
													var27 = Class7.anIntArray71[var5];
													var28 = Class7.anIntArray71[var5 + 1];
													Class7.anIntArray71[var5++] = var27 & (-1 - (1 << var28));
													continue;
												}

												if (var44 == 4010) {
													var5 -= 2;
													var27 = Class7.anIntArray71[var5];
													var28 = Class7.anIntArray71[var5 + 1];
													Class7.anIntArray71[var5++] = (var27 & (1 << var28)) != 0 ? 1 : 0;
													continue;
												}

												if (var44 == 4011) {
													var5 -= 2;
													var27 = Class7.anIntArray71[var5];
													var28 = Class7.anIntArray71[var5 + 1];
													Class7.anIntArray71[var5++] = var27 % var28;
													continue;
												}

												if (var44 == 4012) {
													var5 -= 2;
													var27 = Class7.anIntArray71[var5];
													var28 = Class7.anIntArray71[1 + var5];
													if (var27 == 0)
														Class7.anIntArray71[var5++] = 0;
													else
														Class7.anIntArray71[var5++] = (int) Math.pow(var27, var28);
													continue;
												}

												if (var44 == 4013) {
													var5 -= 2;
													var27 = Class7.anIntArray71[var5];
													var28 = Class7.anIntArray71[var5 + 1];
													if (var27 == 0)
														Class7.anIntArray71[var5++] = 0;
													else if (var28 == 0)
														Class7.anIntArray71[var5++] = Integer.MAX_VALUE;
													else
														Class7.anIntArray71[var5++] = (int) Math.pow(var27,
																1.0D / var28);
													continue;
												}

												if (var44 == 4014) {
													var5 -= 2;
													var27 = Class7.anIntArray71[var5];
													var28 = Class7.anIntArray71[var5 + 1];
													Class7.anIntArray71[var5++] = var27 & var28;
													continue;
												}

												if (var44 == 4015) {
													var5 -= 2;
													var27 = Class7.anIntArray71[var5];
													var28 = Class7.anIntArray71[1 + var5];
													Class7.anIntArray71[var5++] = var27 | var28;
													continue;
												}

												if (var44 == 4018) {
													var5 -= 3;
													final long var34 = Class7.anIntArray71[var5];
													var31 = Class7.anIntArray71[1 + var5];
													final long var36 = Class7.anIntArray71[var5 + 2];
													Class7.anIntArray71[var5++] = (int) ((var36 * var34) / var31);
													continue;
												}
											} else if (var44 < 4200) {
												if (var44 == 4100) {
													--var6;
													var58 = Class7.aStringArray72[var6];
													--var5;
													var28 = Class7.anIntArray71[var5];
													Class7.aStringArray72[var6++] = var58 + var28;
													continue;
												}

												if (var44 == 4101) {
													var6 -= 2;
													var58 = Class7.aStringArray72[var6];
													var48 = Class7.aStringArray72[var6 + 1];
													Class7.aStringArray72[var6++] = var58 + var48;
													continue;
												}

												if (var44 == 4102) {
													--var6;
													var58 = Class7.aStringArray72[var6];
													--var5;
													var28 = Class7.anIntArray71[var5];
													var56 = Class7.aStringArray72;
													var20 = var6++;
													if (var28 < 0)
														var69 = Integer.toString(var28);
													else
														var69 = Class13.method53(var28, 10, true);

													var56[var20] = var58 + var69;
													continue;
												}

												if (var44 == 4103) {
													--var6;
													var58 = Class7.aStringArray72[var6];
													Class7.aStringArray72[var6++] = var58.toLowerCase();
													continue;
												}

												if (var44 == 4104) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													final long var38 = 86400000L * (11745L + var27);
													Class7.aCalendar75.setTime(new Date(var38));
													var20 = Class7.aCalendar75.get(5);
													var21 = Class7.aCalendar75.get(2);
													var24 = Class7.aCalendar75.get(1);
													Class7.aStringArray72[var6++] = var20 + "-"
															+ Class7.aStringArray77[var21] + "-" + var24;
													continue;
												}

												if (var44 == 4105) {
													var6 -= 2;
													var58 = Class7.aStringArray72[var6];
													var48 = Class7.aStringArray72[var6 + 1];
													if ((null != Class131_Sub11.myPlayer.aClass91_1980)
															&& Class131_Sub11.myPlayer.aClass91_1980.aBool734) {
														Class7.aStringArray72[var6++] = var48;
														continue;
													}

													Class7.aStringArray72[var6++] = var58;
													continue;
												}

												if (var44 == 4106) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													Class7.aStringArray72[var6++] = Integer.toString(var27);
													continue;
												}

												if (var44 == 4107) {
													var6 -= 2;
													Class7.anIntArray71[var5++] = Class2
															.method21(Class61.method298(Class7.aStringArray72[var6],
																	Class7.aStringArray72[var6 + 1], client.anInt2034));
													continue;
												}

												Class131_Sub20_Sub17_Sub4_Sub1 var73;
												byte[] var91;
												if (var44 == 4108) {
													--var6;
													var58 = Class7.aStringArray72[var6];
													var5 -= 2;
													var28 = Class7.anIntArray71[var5];
													var19 = Class7.anIntArray71[1 + var5];
													var91 = Class131_Sub4_Sub4.aClass100_Sub1_1689.method402(var19, 0);
													var73 = new Class131_Sub20_Sub17_Sub4_Sub1(var91);
													Class7.anIntArray71[var5++] = var73.method1040(var58, var28);
													continue;
												}

												if (var44 == 4109) {
													--var6;
													var58 = Class7.aStringArray72[var6];
													var5 -= 2;
													var28 = Class7.anIntArray71[var5];
													var19 = Class7.anIntArray71[1 + var5];
													var91 = Class131_Sub4_Sub4.aClass100_Sub1_1689.method402(var19, 0);
													var73 = new Class131_Sub20_Sub17_Sub4_Sub1(var91);
													Class7.anIntArray71[var5++] = var73.method1039(var58, var28);
													continue;
												}

												if (var44 == 4110) {
													var6 -= 2;
													var58 = Class7.aStringArray72[var6];
													var48 = Class7.aStringArray72[var6 + 1];
													--var5;
													if (Class7.anIntArray71[var5] == 1)
														Class7.aStringArray72[var6++] = var58;
													else
														Class7.aStringArray72[var6++] = var48;
													continue;
												}

												if (var44 == 4111) {
													--var6;
													var58 = Class7.aStringArray72[var6];
													Class7.aStringArray72[var6++] = Class131_Sub20_Sub17_Sub4
															.method1054(var58);
													continue;
												}

												if (var44 == 4112) {
													--var6;
													var58 = Class7.aStringArray72[var6];
													--var5;
													var28 = Class7.anIntArray71[var5];
													Class7.aStringArray72[var6++] = var58 + (char) var28;
													continue;
												}

												if (var44 == 4113) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													Class7.anIntArray71[var5++] = Class69.method322((char) var27) ? 1
															: 0;
													continue;
												}

												if (var44 == 4114) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													Class7.anIntArray71[var5++] = Class30.method136((char) var27) ? 1
															: 0;
													continue;
												}

												if (var44 == 4115) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													Class7.anIntArray71[var5++] = Class131_Sub20_Sub5
															.method725((char) var27) ? 1 : 0;
													continue;
												}

												if (var44 == 4116) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													Class7.anIntArray71[var5++] = Class7.method37((char) var27) ? 1 : 0;
													continue;
												}

												if (var44 == 4117) {
													--var6;
													var58 = Class7.aStringArray72[var6];
													if (null != var58)
														Class7.anIntArray71[var5++] = var58.length();
													else
														Class7.anIntArray71[var5++] = 0;
													continue;
												}

												if (var44 == 4118) {
													--var6;
													var58 = Class7.aStringArray72[var6];
													var5 -= 2;
													var28 = Class7.anIntArray71[var5];
													var19 = Class7.anIntArray71[1 + var5];
													Class7.aStringArray72[var6++] = var58.substring(var28, var19);
													continue;
												}

												if (var44 == 4119) {
													--var6;
													var58 = Class7.aStringArray72[var6];
													final StringBuilder var59 = new StringBuilder(var58.length());
													var66 = false;

													for (var20 = 0; var20 < var58.length(); ++var20) {
														final char var81 = var58.charAt(var20);
														if (var81 == 60)
															var66 = true;
														else if (var81 == 62)
															var66 = false;
														else if (!var66)
															var59.append(var81);
													}

													Class7.aStringArray72[var6++] = var59.toString();
													continue;
												}

												if (var44 == 4120) {
													--var6;
													var58 = Class7.aStringArray72[var6];
													--var5;
													var28 = Class7.anIntArray71[var5];
													Class7.anIntArray71[var5++] = var58.indexOf(var28);
													continue;
												}

												if (var44 == 4121) {
													var6 -= 2;
													var58 = Class7.aStringArray72[var6];
													var48 = Class7.aStringArray72[var6 + 1];
													--var5;
													var19 = Class7.anIntArray71[var5];
													Class7.anIntArray71[var5++] = var58.indexOf(var48, var19);
													continue;
												}
											} else if (var44 < 4300) {
												if (var44 == 4200) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													Class7.aStringArray72[var6++] = Class79_Sub1.method645(var27,
															(short) 26629).aString1385;
													continue;
												}

												Class131_Sub20_Sub2 var57;
												if (var44 == 4201) {
													var5 -= 2;
													var27 = Class7.anIntArray71[var5];
													var28 = Class7.anIntArray71[var5 + 1];
													var57 = Class79_Sub1.method645(var27, (short) 23355);
													if ((var28 >= 1) && (var28 <= 5)
															&& (null != var57.aStringArray1393[var28 - 1])) {
														Class7.aStringArray72[var6++] = var57.aStringArray1393[var28
																- 1];
														continue;
													}

													Class7.aStringArray72[var6++] = "";
													continue;
												}

												if (var44 == 4202) {
													var5 -= 2;
													var27 = Class7.anIntArray71[var5];
													var28 = Class7.anIntArray71[var5 + 1];
													var57 = Class79_Sub1.method645(var27, (short) 3254);
													if ((var28 >= 1) && (var28 <= 5)
															&& (null != var57.aStringArray1406[var28 - 1])) {
														Class7.aStringArray72[var6++] = var57.aStringArray1406[var28
																- 1];
														continue;
													}

													Class7.aStringArray72[var6++] = "";
													continue;
												}

												if (var44 == 4203) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													Class7.anIntArray71[var5++] = Class79_Sub1.method645(var27,
															(short) 951).anInt1391;
													continue;
												}

												if (var44 == 4204) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													Class7.anIntArray71[var5++] = Class79_Sub1.method645(var27,
															(short) 648).anInt1408 == 1 ? 1 : 0;
													continue;
												}

												Class131_Sub20_Sub2 var64;
												if (var44 == 4205) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													var64 = Class79_Sub1.method645(var27, (short) 3522);
													if ((var64.anInt1410 == -1) && (var64.anInt1409 >= 0)) {
														Class7.anIntArray71[var5++] = var64.anInt1409;
														continue;
													}

													Class7.anIntArray71[var5++] = var27;
													continue;
												}

												if (var44 == 4206) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													var64 = Class79_Sub1.method645(var27, (short) 28016);
													if ((var64.anInt1410 >= 0) && (var64.anInt1409 >= 0)) {
														Class7.anIntArray71[var5++] = var64.anInt1409;
														continue;
													}

													Class7.anIntArray71[var5++] = var27;
													continue;
												}

												if (var44 == 4207) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													Class7.anIntArray71[var5++] = Class79_Sub1.method645(var27,
															(short) 19693).aBool1403 ? 1 : 0;
													continue;
												}

												if (var44 == 4208) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													var64 = Class79_Sub1.method645(var27, (short) 9947);
													if ((var64.anInt1421 == -1) && (var64.anInt1420 >= 0)) {
														Class7.anIntArray71[var5++] = var64.anInt1420;
														continue;
													}

													Class7.anIntArray71[var5++] = var27;
													continue;
												}

												if (var44 == 4209) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													var64 = Class79_Sub1.method645(var27, (short) 24827);
													if ((var64.anInt1421 >= 0) && (var64.anInt1420 >= 0)) {
														Class7.anIntArray71[var5++] = var64.anInt1420;
														continue;
													}

													Class7.anIntArray71[var5++] = var27;
													continue;
												}

												if (var44 == 4210) {
													--var6;
													var58 = Class7.aStringArray72[var6];
													--var5;
													var28 = Class7.anIntArray71[var5];
													Class12.method51(var58, var28 == 1);
													Class7.anIntArray71[var5++] = Class131_Sub13.anInt1105;
													continue;
												}

												if (var44 == 4211) {
													if ((Class67.aShortArray601 != null)
															&& (Class92.anInt740 < Class131_Sub13.anInt1105)) {
														Class7.anIntArray71[var5++] = Class67.aShortArray601[++Class92.anInt740
																- 1] & '\uffff';
														continue;
													}

													Class7.anIntArray71[var5++] = -1;
													continue;
												}

												if (var44 == 4212) {
													Class92.anInt740 = 0;
													continue;
												}
											} else if (var44 < 5100) {
												if (var44 == 5000) {
													Class7.anIntArray71[var5++] = client.anInt2241;
													continue;
												}

												if (var44 == 5001) {
													var5 -= 3;
													client.anInt2241 = Class7.anIntArray71[var5];
													var28 = Class7.anIntArray71[var5 + 1];
													final Class84[] var62 = Class60.method295(-1863110361);
													var20 = 0;

													Class84 var101;
													while (true) {
														if (var20 >= var62.length) {
															var101 = null;
															break;
														}

														final Class84 var80 = var62[var20];
														if (var80.anInt698 == var28) {
															var101 = var80;
															break;
														}

														++var20;
													}

													Class131_Sub20_Sub3.aClass84_1424 = var101;
													if (null == Class131_Sub20_Sub3.aClass84_1424)
														Class131_Sub20_Sub3.aClass84_1424 = Class84.aClass84_694;

													client.anInt2242 = Class7.anIntArray71[var5 + 2];
													client.secureBuffer.method871(129);
													client.secureBuffer.writeByte(client.anInt2241);
													client.secureBuffer
															.writeByte(Class131_Sub20_Sub3.aClass84_1424.anInt698);
													client.secureBuffer.writeByte(client.anInt2242);
													continue;
												}

												if (var44 == 5002) {
													--var6;
													var58 = Class7.aStringArray72[var6];
													var5 -= 2;
													var28 = Class7.anIntArray71[var5];
													var19 = Class7.anIntArray71[var5 + 1];
													client.secureBuffer.method871(135);
													client.secureBuffer
															.writeByte(Class131_Sub6.method554(var58) + 2);
													client.secureBuffer.writeStr(var58);
													client.secureBuffer.writeByte(var28 - 1);
													client.secureBuffer.writeByte(var19);
													continue;
												}

												if (var44 == 5003) {
													var5 -= 2;
													var27 = Class7.anIntArray71[var5];
													var28 = Class7.anIntArray71[1 + var5];
													final Class131_Sub20_Sub8 var61 = Class17.method81(var27, var28);
													if (null != var61) {
														Class7.anIntArray71[var5++] = var61.anInt1499;
														Class7.anIntArray71[var5++] = var61.anInt1494;
														Class7.aStringArray72[var6++] = null != var61.aString1495
																? var61.aString1495 : "";
														Class7.aStringArray72[var6++] = null != var61.aString1496
																? var61.aString1496 : "";
														Class7.aStringArray72[var6++] = var61.aString1497 != null
																? var61.aString1497 : "";
													} else {
														Class7.anIntArray71[var5++] = -1;
														Class7.anIntArray71[var5++] = 0;
														Class7.aStringArray72[var6++] = "";
														Class7.aStringArray72[var6++] = "";
														Class7.aStringArray72[var6++] = "";
													}
													continue;
												}

												if (var44 == 5004) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													final Class131_Sub20_Sub8 var72 = (Class131_Sub20_Sub8) Class32.aClass125_301
															.method487(var27);
													if (null != var72) {
														Class7.anIntArray71[var5++] = var72.anInt1500;
														Class7.anIntArray71[var5++] = var72.anInt1494;
														Class7.aStringArray72[var6++] = null != var72.aString1495
																? var72.aString1495 : "";
														Class7.aStringArray72[var6++] = null != var72.aString1496
																? var72.aString1496 : "";
														Class7.aStringArray72[var6++] = null != var72.aString1497
																? var72.aString1497 : "";
													} else {
														Class7.anIntArray71[var5++] = -1;
														Class7.anIntArray71[var5++] = 0;
														Class7.aStringArray72[var6++] = "";
														Class7.aStringArray72[var6++] = "";
														Class7.aStringArray72[var6++] = "";
													}
													continue;
												}

												if (var44 == 5005) {
													if (Class131_Sub20_Sub3.aClass84_1424 == null)
														Class7.anIntArray71[var5++] = -1;
													else
														Class7.anIntArray71[var5++] = Class131_Sub20_Sub3.aClass84_1424.anInt698;
													continue;
												}

												if (var44 == 5008) {
													--var6;
													var58 = Class7.aStringArray72[var6];
													--var5;
													var28 = Class7.anIntArray71[var5];
													var18 = var58.toLowerCase();
													byte var74 = 0;
													if (var18.startsWith("yellow:")) {
														var74 = 0;
														var58 = var58.substring("yellow:".length());
													} else if (var18.startsWith("red:")) {
														var74 = 1;
														var58 = var58.substring("red:".length());
													} else if (var18.startsWith("green:")) {
														var74 = 2;
														var58 = var58.substring("green:".length());
													} else if (var18.startsWith("cyan:")) {
														var74 = 3;
														var58 = var58.substring("cyan:".length());
													} else if (var18.startsWith("purple:")) {
														var74 = 4;
														var58 = var58.substring("purple:".length());
													} else if (var18.startsWith("white:")) {
														var74 = 5;
														var58 = var58.substring("white:".length());
													} else if (var18.startsWith("flash1:")) {
														var74 = 6;
														var58 = var58.substring("flash1:".length());
													} else if (var18.startsWith("flash2:")) {
														var74 = 7;
														var58 = var58.substring("flash2:".length());
													} else if (var18.startsWith("flash3:")) {
														var74 = 8;
														var58 = var58.substring("flash3:".length());
													} else if (var18.startsWith("glow1:")) {
														var74 = 9;
														var58 = var58.substring("glow1:".length());
													} else if (var18.startsWith("glow2:")) {
														var74 = 10;
														var58 = var58.substring("glow2:".length());
													} else if (var18.startsWith("glow3:")) {
														var74 = 11;
														var58 = var58.substring("glow3:".length());
													} else if (client.anInt2034 != 0)
														if (var18.startsWith("yellow:")) {
															var74 = 0;
															var58 = var58.substring("yellow:".length());
														} else if (var18.startsWith("red:")) {
															var74 = 1;
															var58 = var58.substring("red:".length());
														} else if (var18.startsWith("green:")) {
															var74 = 2;
															var58 = var58.substring("green:".length());
														} else if (var18.startsWith("cyan:")) {
															var74 = 3;
															var58 = var58.substring("cyan:".length());
														} else if (var18.startsWith("purple:")) {
															var74 = 4;
															var58 = var58.substring("purple:".length());
														} else if (var18.startsWith("white:")) {
															var74 = 5;
															var58 = var58.substring("white:".length());
														} else if (var18.startsWith("flash1:")) {
															var74 = 6;
															var58 = var58.substring("flash1:".length());
														} else if (var18.startsWith("flash2:")) {
															var74 = 7;
															var58 = var58.substring("flash2:".length());
														} else if (var18.startsWith("flash3:")) {
															var74 = 8;
															var58 = var58.substring("flash3:".length());
														} else if (var18.startsWith("glow1:")) {
															var74 = 9;
															var58 = var58.substring("glow1:".length());
														} else if (var18.startsWith("glow2:")) {
															var74 = 10;
															var58 = var58.substring("glow2:".length());
														} else if (var18.startsWith("glow3:")) {
															var74 = 11;
															var58 = var58.substring("glow3:".length());
														}

													var18 = var58.toLowerCase();
													byte var86 = 0;
													if (var18.startsWith("wave:")) {
														var86 = 1;
														var58 = var58.substring("wave:".length());
													} else if (var18.startsWith("wave2:")) {
														var86 = 2;
														var58 = var58.substring("wave2:".length());
													} else if (var18.startsWith("shake:")) {
														var86 = 3;
														var58 = var58.substring("shake:".length());
													} else if (var18.startsWith("scroll:")) {
														var86 = 4;
														var58 = var58.substring("scroll:".length());
													} else if (var18.startsWith("slide:")) {
														var86 = 5;
														var58 = var58.substring("slide:".length());
													} else if (client.anInt2034 != 0)
														if (var18.startsWith("wave:")) {
															var86 = 1;
															var58 = var58.substring("wave:".length());
														} else if (var18.startsWith("wave2:")) {
															var86 = 2;
															var58 = var58.substring("wave2:".length());
														} else if (var18.startsWith("shake:")) {
															var86 = 3;
															var58 = var58.substring("shake:".length());
														} else if (var18.startsWith("scroll:")) {
															var86 = 4;
															var58 = var58.substring("scroll:".length());
														} else if (var18.startsWith("slide:")) {
															var86 = 5;
															var58 = var58.substring("slide:".length());
														}

													client.secureBuffer.method871(57);
													client.secureBuffer.writeByte(0);
													var24 = client.secureBuffer.pos;
													client.secureBuffer.writeByte(var28);
													client.secureBuffer.writeByte(var74);
													client.secureBuffer.writeByte(var86);
													final Class131_Sub14_Sub1 var70 = client.secureBuffer;
													var30 = var70.pos;
													final byte[] var40 = Class84.method368(var58);
													var70.method631(var40.length);
													var70.pos += Class136.aClass60_908.method293(var40, 0,
															var40.length, var70.data, var70.pos);
													client.secureBuffer.method593(
															client.secureBuffer.pos - var24);
													continue;
												}

												if (var44 == 5009) {
													var6 -= 2;
													var58 = Class7.aStringArray72[var6];
													var48 = Class7.aStringArray72[var6 + 1];
													client.secureBuffer.method871(246);
													client.secureBuffer.method586(0);
													var19 = client.secureBuffer.pos;
													client.secureBuffer.writeStr(var58);
													final Class131_Sub14_Sub1 var94 = client.secureBuffer;
													var21 = var94.pos;
													var60 = Class84.method368(var48);
													var94.method631(var60.length);
													var94.pos += Class136.aClass60_908.method293(var60, 0,
															var60.length, var94.data, var94.pos);
													client.secureBuffer.writeShortSize(
															client.secureBuffer.pos - var19);
													continue;
												}

												if (var44 == 5015) {
													if ((Class131_Sub11.myPlayer != null)
															&& (Class131_Sub11.myPlayer.aString2004 != null))
														var58 = Class131_Sub11.myPlayer.aString2004;
													else
														var58 = "";

													Class7.aStringArray72[var6++] = var58;
													continue;
												}

												if (var44 == 5016) {
													Class7.anIntArray71[var5++] = client.anInt2242;
													continue;
												}

												if (var44 == 5017) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													var16 = Class7.anIntArray71;
													var19 = var5++;
													final Class6 var78 = (Class6) Class32.aMap298
															.get(Integer.valueOf(var27));
													if (null == var78)
														var20 = 0;
													else
														var20 = var78.method31();

													var16[var19] = var20;
													continue;
												}

												if (var44 == 5018) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													var16 = Class7.anIntArray71;
													var19 = var5++;
													final Class131_Sub20_Sub8 var76 = (Class131_Sub20_Sub8) Class32.aClass125_301
															.method487(var27);
													if (null == var76)
														var20 = -1;
													else if (var76.aClass131_Sub20_1318 == Class32.aClass124_299.aClass131_Sub20_882)
														var20 = -1;
													else
														var20 = ((Class131_Sub20_Sub8) var76.aClass131_Sub20_1318).anInt1499;

													var16[var19] = var20;
													continue;
												}

												if (var44 == 5019) {
													--var5;
													var27 = Class7.anIntArray71[var5];
													Class7.anIntArray71[var5++] = Class67.method315(var27);
													continue;
												}

												if (var44 == 5020) {
													--var6;
													var58 = Class7.aStringArray72[var6];
													Class63_Sub1.method579(var58);
													continue;
												}

												if (var44 == 5021) {
													--var6;
													client.aString2243 = Class7.aStringArray72[var6].toLowerCase()
															.trim();
													continue;
												}

												if (var44 == 5022) {
													Class7.aStringArray72[var6++] = client.aString2243;
													continue;
												}
											}
										}
									}
								} else {
									if (var44 >= 2000) {
										var44 -= 1000;
										--var5;
										var17 = Class88.method377(Class7.anIntArray71[var5]);
									} else
										var17 = var55 ? Class7.aClass131_Sub18_69 : Class7.aClass131_Sub18_78;

									if (var44 == 1927) {
										if (Class7.anInt76 >= 10)
											throw new RuntimeException();

										if (var17.anObjectArray1259 == null)
											return;

										final Class131_Sub10 var45 = new Class131_Sub10();
										var45.aClass131_Sub18_1057 = var17;
										var45.anObjectArray1056 = var17.anObjectArray1259;
										var45.anInt1066 = Class7.anInt76 + 1;
										client.aClass115_2222.method471(var0);
										continue;
									}
								}
							}
						} else {
							if (var44 >= 2000) {
								var44 -= 1000;
								--var5;
								var17 = Class88.method377(Class7.anIntArray71[var5]);
							} else
								var17 = var55 ? Class7.aClass131_Sub18_69 : Class7.aClass131_Sub18_78;

							Class131_Sub20_Sub6.method734(var17);
							if ((var44 == 1200) || (var44 == 1205) || (var44 == 1212)) {
								var5 -= 2;
								var28 = Class7.anIntArray71[var5];
								var19 = Class7.anIntArray71[1 + var5];
								var17.anInt1168 = var28;
								var17.anInt1198 = var19;
								final Class131_Sub20_Sub2 var26 = Class79_Sub1.method645(var28, (short) 23704);
								var17.anInt1209 = var26.anInt1376;
								var17.anInt1210 = var26.anInt1386;
								var17.anInt1150 = var26.anInt1388;
								var17.anInt1207 = var26.anInt1390;
								var17.anInt1208 = var26.anInt1389;
								var17.anInt1277 = var26.anInt1384;
								if (var44 == 1205)
									var17.anInt1216 = 0;
								else if ((var44 == 1212) | (var26.anInt1408 == 1))
									var17.anInt1216 = 1;
								else
									var17.anInt1216 = 2;

								if (var17.anInt1213 > 0)
									var17.anInt1277 = (var17.anInt1277 * 32) / var17.anInt1213;
								else if (var17.anInt1229 > 0)
									var17.anInt1277 = (var17.anInt1277 * 32) / var17.anInt1229;
								continue;
							}

							if (var44 == 1201) {
								var17.anInt1201 = 2;
								--var5;
								var17.anInt1172 = Class7.anIntArray71[var5];
								continue;
							}

							if (var44 == 1202) {
								var17.anInt1201 = 3;
								var17.anInt1172 = Class131_Sub11.myPlayer.aClass91_1980
										.method385();
								continue;
							}
						}
					}

					if (var44 < 5400) {
						if (var44 == 5306) {
							final int[] var103 = Class7.anIntArray71;
							var28 = var5++;
							var19 = client.aBool2237 ? 2 : 1;
							var103[var28] = var19;
							continue;
						}

						if (var44 == 5307) {
							--var5;
							var27 = Class7.anIntArray71[var5];
							if ((var27 != 1) && (var27 != 2))
								continue;

							client.aLong2029 = 0L;
							if (var27 >= 2)
								client.aBool2237 = true;
							else
								client.aBool2237 = false;

							Class97.method396();
							if (client.anInt2036 >= 25) {
								client.secureBuffer.method871(81);
								final Class131_Sub14_Sub1 var92 = client.secureBuffer;
								var19 = client.aBool2237 ? 2 : 1;
								var92.writeByte(var19);
								client.secureBuffer.method586(Class2.anInt7);
								client.secureBuffer.method586(Class88.anInt723);
							}

							Applet_Sub1.aBool2011 = true;
							continue;
						}

						if (var44 == 5308) {
							Class7.anIntArray71[var5++] = Class50.aClass28_494.anInt253;
							continue;
						}

						if (var44 == 5309) {
							--var5;
							var27 = Class7.anIntArray71[var5];
							if ((var27 == 1) || (var27 == 2)) {
								Class50.aClass28_494.anInt253 = var27;
								Class24.method115();
							}
							continue;
						}
					}

					if (var44 < 5600) {
						if (var44 == 5504) {
							var5 -= 2;
							var27 = Class7.anIntArray71[var5];
							var28 = Class7.anIntArray71[1 + var5];
							if (!client.aBool2271) {
								client.anInt2110 = var27;
								client.anInt2111 = var28;
							}
							continue;
						}

						if (var44 == 5505) {
							Class7.anIntArray71[var5++] = client.anInt2110;
							continue;
						}

						if (var44 == 5506) {
							Class7.anIntArray71[var5++] = client.anInt2111;
							continue;
						}

						if (var44 == 5530) {
							--var5;
							var27 = Class7.anIntArray71[var5];
							if (var27 < 0)
								var27 = 0;

							client.anInt2116 = var27;
							continue;
						}

						if (var44 == 5531) {
							Class7.anIntArray71[var5++] = client.anInt2116;
							continue;
						}
					}

					if ((var44 < 5700) && (var44 == 5630))
						client.anInt2080 = 250;
					else {
						if (var44 < 6300) {
							if (var44 == 6200) {
								var5 -= 2;
								client.aShort2081 = (short) Class7.anIntArray71[var5];
								if (client.aShort2081 <= 0)
									client.aShort2081 = 256;

								client.aShort2278 = (short) Class7.anIntArray71[1 + var5];
								if (client.aShort2278 <= 0)
									client.aShort2278 = 205;
								continue;
							}

							if (var44 == 6201) {
								var5 -= 2;
								client.aShort2279 = (short) Class7.anIntArray71[var5];
								if (client.aShort2279 <= 0)
									client.aShort2279 = 256;

								client.aShort2180 = (short) Class7.anIntArray71[var5 + 1];
								if (client.aShort2180 <= 0)
									client.aShort2180 = 320;
								continue;
							}

							if (var44 == 6202) {
								var5 -= 4;
								client.aShort2281 = (short) Class7.anIntArray71[var5];
								if (client.aShort2281 <= 0)
									client.aShort2281 = 1;

								client.aShort2282 = (short) Class7.anIntArray71[1 + var5];
								if (client.aShort2282 <= 0)
									client.aShort2282 = 32767;
								else if (client.aShort2282 < client.aShort2281)
									client.aShort2282 = client.aShort2281;

								client.aShort2157 = (short) Class7.anIntArray71[var5 + 2];
								if (client.aShort2157 <= 0)
									client.aShort2157 = 1;

								client.aShort2300 = (short) Class7.anIntArray71[var5 + 3];
								if (client.aShort2300 <= 0)
									client.aShort2300 = 32767;
								else if (client.aShort2300 < client.aShort2157)
									client.aShort2300 = client.aShort2157;
								continue;
							}

							if (var44 == 6203) {
								if (null != client.aClass131_Sub18_2198) {
									Class102.method426(0, 0, client.aClass131_Sub18_2198.anInt1173,
											client.aClass131_Sub18_2198.anInt1291, false);
									Class7.anIntArray71[var5++] = client.anInt2169;
									Class7.anIntArray71[var5++] = client.anInt2288;
								} else {
									Class7.anIntArray71[var5++] = -1;
									Class7.anIntArray71[var5++] = -1;
								}
								continue;
							}

							if (var44 == 6204) {
								Class7.anIntArray71[var5++] = client.aShort2279;
								Class7.anIntArray71[var5++] = client.aShort2180;
								continue;
							}

							if (var44 == 6205) {
								Class7.anIntArray71[var5++] = client.aShort2081;
								Class7.anIntArray71[var5++] = client.aShort2278;
								continue;
							}
						}

						if (var44 < 6600) {
							if (var44 == 6500) {
								Class7.anIntArray71[var5++] = Class131_Sub6.method550() ? 1 : 0;
								continue;
							}

							Class30 var102;
							if (var44 == 6501) {
								var102 = LoginEncoder.method197();
								if (var102 != null) {
									Class7.anIntArray71[var5++] = var102.anInt278;
									Class7.anIntArray71[var5++] = var102.anInt279;
									Class7.aStringArray72[var6++] = var102.aString272;
									Class7.anIntArray71[var5++] = var102.anInt286;
									Class7.anIntArray71[var5++] = var102.anInt276;
									Class7.aStringArray72[var6++] = var102.aString281;
								} else {
									Class7.anIntArray71[var5++] = -1;
									Class7.anIntArray71[var5++] = 0;
									Class7.aStringArray72[var6++] = "";
									Class7.anIntArray71[var5++] = 0;
									Class7.anIntArray71[var5++] = 0;
									Class7.aStringArray72[var6++] = "";
								}
								continue;
							}

							if (var44 == 6502) {
								if (Class30.anInt275 < Class30.anInt274)
									var102 = Class30.aClass30Array273[++Class30.anInt275 - 1];
								else
									var17 = null;

								Class7.anIntArray71[var5++] = -1;
								Class7.anIntArray71[var5++] = 0;
								Class7.aStringArray72[var6++] = "";
								Class7.anIntArray71[var5++] = 0;
								Class7.anIntArray71[var5++] = 0;
								Class7.aStringArray72[var6++] = "";
								continue;
							}

							Class30 var87;
							if (var44 == 6506) {
								--var5;
								var27 = Class7.anIntArray71[var5];
								var87 = null;

								for (var19 = 0; var19 < Class30.anInt274; ++var19)
									if (var27 == Class30.aClass30Array273[var19].anInt278) {
										var87 = Class30.aClass30Array273[var19];
										break;
									}

								if (null != var87) {
									Class7.anIntArray71[var5++] = var87.anInt278;
									Class7.anIntArray71[var5++] = var87.anInt279;
									Class7.aStringArray72[var6++] = var87.aString272;
									Class7.anIntArray71[var5++] = var87.anInt286;
									Class7.anIntArray71[var5++] = var87.anInt276;
									Class7.aStringArray72[var6++] = var87.aString281;
								} else {
									Class7.anIntArray71[var5++] = -1;
									Class7.anIntArray71[var5++] = 0;
									Class7.aStringArray72[var6++] = "";
									Class7.anIntArray71[var5++] = 0;
									Class7.anIntArray71[var5++] = 0;
									Class7.aStringArray72[var6++] = "";
								}
								continue;
							}

							if (var44 == 6507) {
								var5 -= 4;
								var27 = Class7.anIntArray71[var5];
								var90 = Class7.anIntArray71[var5 + 1] == 1;
								var19 = Class7.anIntArray71[2 + var5];
								final boolean var97 = Class7.anIntArray71[3 + var5] == 1;
								Class131_Sub13.method582(var27, var90, var19, var97);
								continue;
							}

							if (var44 == 6511) {
								--var5;
								var27 = Class7.anIntArray71[var5];
								if ((var27 >= 0) && (var27 < Class30.anInt274)) {
									var87 = Class30.aClass30Array273[var27];
									Class7.anIntArray71[var5++] = var87.anInt278;
									Class7.anIntArray71[var5++] = var87.anInt279;
									Class7.aStringArray72[var6++] = var87.aString272;
									Class7.anIntArray71[var5++] = var87.anInt286;
									Class7.anIntArray71[var5++] = var87.anInt276;
									Class7.aStringArray72[var6++] = var87.aString281;
									continue;
								}

								Class7.anIntArray71[var5++] = -1;
								Class7.anIntArray71[var5++] = 0;
								Class7.aStringArray72[var6++] = "";
								Class7.anIntArray71[var5++] = 0;
								Class7.anIntArray71[var5++] = 0;
								Class7.aStringArray72[var6++] = "";
								continue;
							}
						}

						throw new IllegalStateException();
					}
				}
			} catch (final Exception var43) {
				final StringBuilder var42 = new StringBuilder(30);
				var42.append("").append(var4.aLong902).append(" ");

				for (var13 = Class7.anInt81 - 1; var13 >= 0; --var13)
					var42.append("").append(Class7.aClass39Array74[var13].aClass131_Sub20_Sub18_411.aLong902)
							.append(" ");

				var42.append("").append(var10);
				Class131_Sub20_Sub7.method740(var42.toString(), var43);
			}
		}
	}
}
