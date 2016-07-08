import java.util.Calendar;

public class Class7 {
	static int[] anIntArray68;
	static Class131_Sub18 aClass131_Sub18_69;
	static Class131_Sub18 aClass131_Sub18_78;
	static Class131_Sub20_Sub17_Sub4_Sub1 aClass131_Sub20_Sub17_Sub4_Sub1_79;
	static String[] aStringArray80;
	static int[] anIntArray70 = new int[5];
	static int[][] anIntArrayArray73 = new int[5][5000];
	static int[] anIntArray71 = new int[1000];
	static String[] aStringArray72 = new String[1000];
	static int anInt81 = 0;
	static Class39[] aClass39Array74 = new Class39[50];
	static Calendar aCalendar75 = Calendar.getInstance();
	static String[] aStringArray77 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
			"Oct", "Nov", "Dec" };
	static int anInt76 = 0;

	static final void method33(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final Class33 var6, final Class51 var7) {
		if (!client.aBool2033 || ((Class26.aByteArrayArrayArray225[0][var1][var2] & 2) != 0)
				|| ((Class26.aByteArrayArrayArray225[var0][var1][var2] & 16) == 0)) {
			if (var0 < Class26.anInt226)
				Class26.anInt226 = var0;

			final Class131_Sub20_Sub9 var8 = Class83.method362(var3);
			int var14;
			int var15;
			if ((var4 != 1) && (var4 != 3)) {
				var15 = var8.anInt1511;
				var14 = var8.anInt1503;
			} else {
				var15 = var8.anInt1503;
				var14 = var8.anInt1511;
			}

			int var16;
			int var17;
			if ((var1 + var15) <= 104) {
				var16 = var1 + (var15 >> 1);
				var17 = ((1 + var15) >> 1) + var1;
			} else {
				var16 = var1;
				var17 = 1 + var1;
			}

			int var18;
			int var19;
			if ((var2 + var14) <= 104) {
				var18 = (var14 >> 1) + var2;
				var19 = var2 + ((1 + var14) >> 1);
			} else {
				var18 = var2;
				var19 = 1 + var2;
			}

			final int[][] var20 = Class26.anIntArrayArrayArray239[var0];
			final int var9 = (var20[var17][var19] + var20[var16][var19] + var20[var17][var18]
					+ var20[var16][var18]) >> 2;
			final int var21 = (var15 << 6) + (var1 << 7);
			final int var22 = (var2 << 7) + (var14 << 6);
			int var12 = var1 + (var2 << 7) + (var3 << 14) + 1073741824;
			if (var8.anInt1521 == 0)
				var12 -= Integer.MIN_VALUE;

			int var13 = (var4 << 6) + var5;
			if (var8.anInt1542 == 1)
				var13 += 256;

			int var11;
			int var23;
			if (var8.method755()) {
				final Class131_Sub6 var10 = new Class131_Sub6();
				var10.anInt1009 = var0;
				var10.anInt1010 = var1 * 128;
				var10.anInt1011 = var2 * 128;
				var11 = var8.anInt1511;
				var23 = var8.anInt1503;
				if ((var4 == 1) || (var4 == 3)) {
					var11 = var8.anInt1503;
					var23 = var8.anInt1511;
				}

				var10.anInt1020 = (var1 + var11) * 128;
				var10.anInt1021 = (var23 + var2) * 128;
				var10.anInt1015 = var8.anInt1547;
				var10.anInt1008 = var8.anInt1501 * 128;
				var10.anInt1017 = var8.anInt1548;
				var10.anInt1018 = var8.anInt1549;
				var10.anIntArray1019 = var8.anIntArray1550;
				if (var8.anIntArray1513 != null) {
					var10.aClass131_Sub20_Sub9_1022 = var8;
					var10.method551();
				}

				Class131_Sub6.aClass115_1013.method471(var10);
				if (var10.anIntArray1019 != null)
					var10.anInt1014 = var10.anInt1017 + (int) (Math.random() * (var10.anInt1018 - var10.anInt1017));
			}

			Object var30;
			if (var5 == 22) {
				if (!client.aBool2033 || (var8.anInt1521 != 0) || (var8.anInt1519 == 1) || var8.aBool1543) {
					if ((var8.anInt1525 == -1) && (null == var8.anIntArray1513))
						var30 = var8.method758(22, var4, var20, var21, var9, var22);
					else
						var30 = new Class131_Sub20_Sub19_Sub5(var3, 22, var4, var0, var1, var2, var8.anInt1525, true,
								(Class131_Sub20_Sub19) null);

					var6.method151(var0, var1, var2, var9, (Class131_Sub20_Sub19) var30, var12, var13);
					if ((var8.anInt1519 == 1) && (var7 != null))
						var7.method261(var1, var2);

				}
			} else if ((var5 != 10) && (var5 != 11)) {
				if (var5 >= 12) {
					if ((var8.anInt1525 == -1) && (var8.anIntArray1513 == null))
						var30 = var8.method758(var5, var4, var20, var21, var9, var22);
					else
						var30 = new Class131_Sub20_Sub19_Sub5(var3, var5, var4, var0, var1, var2, var8.anInt1525, true,
								(Class131_Sub20_Sub19) null);

					var6.method195(var0, var1, var2, var9, 1, 1, (Class131_Sub20_Sub19) var30, 0, var12, var13);
					if ((var5 >= 12) && (var5 <= 17) && (var5 != 13) && (var0 > 0))
						Class48.anIntArrayArrayArray477[var0][var1][var2] |= 2340;

					if ((var8.anInt1519 != 0) && (var7 != null))
						var7.method268(var1, var2, var15, var14, var8.aBool1520);

				} else if (var5 == 0) {
					if ((var8.anInt1525 == -1) && (null == var8.anIntArray1513))
						var30 = var8.method758(0, var4, var20, var21, var9, var22);
					else
						var30 = new Class131_Sub20_Sub19_Sub5(var3, 0, var4, var0, var1, var2, var8.anInt1525, true,
								(Class131_Sub20_Sub19) null);

					var6.method185(var0, var1, var2, var9, (Class131_Sub20_Sub19) var30, (Class131_Sub20_Sub19) null,
							Class26.anIntArray232[var4], 0, var12, var13);
					if (var4 == 0) {
						if (var8.aBool1533) {
							Class139.aByteArrayArrayArray916[var0][var1][var2] = 50;
							Class139.aByteArrayArrayArray916[var0][var1][1 + var2] = 50;
						}

						if (var8.aBool1524)
							Class48.anIntArrayArrayArray477[var0][var1][var2] |= 585;
					} else if (var4 == 1) {
						if (var8.aBool1533) {
							Class139.aByteArrayArrayArray916[var0][var1][var2 + 1] = 50;
							Class139.aByteArrayArrayArray916[var0][1 + var1][var2 + 1] = 50;
						}

						if (var8.aBool1524)
							Class48.anIntArrayArrayArray477[var0][var1][var2 + 1] |= 1170;
					} else if (var4 == 2) {
						if (var8.aBool1533) {
							Class139.aByteArrayArrayArray916[var0][1 + var1][var2] = 50;
							Class139.aByteArrayArrayArray916[var0][var1 + 1][var2 + 1] = 50;
						}

						if (var8.aBool1524)
							Class48.anIntArrayArrayArray477[var0][var1 + 1][var2] |= 585;
					} else if (var4 == 3) {
						if (var8.aBool1533) {
							Class139.aByteArrayArrayArray916[var0][var1][var2] = 50;
							Class139.aByteArrayArrayArray916[var0][var1 + 1][var2] = 50;
						}

						if (var8.aBool1524)
							Class48.anIntArrayArrayArray477[var0][var1][var2] |= 1170;
					}

					if ((var8.anInt1519 != 0) && (null != var7))
						var7.method260(var1, var2, var5, var4, var8.aBool1520);

					if (var8.anInt1526 != 16)
						var6.method170(var0, var1, var2, var8.anInt1526);

				} else if (var5 == 1) {
					if ((var8.anInt1525 == -1) && (null == var8.anIntArray1513))
						var30 = var8.method758(1, var4, var20, var21, var9, var22);
					else
						var30 = new Class131_Sub20_Sub19_Sub5(var3, 1, var4, var0, var1, var2, var8.anInt1525, true,
								(Class131_Sub20_Sub19) null);

					var6.method185(var0, var1, var2, var9, (Class131_Sub20_Sub19) var30, (Class131_Sub20_Sub19) null,
							Class26.anIntArray233[var4], 0, var12, var13);
					if (var8.aBool1533)
						if (var4 == 0)
							Class139.aByteArrayArrayArray916[var0][var1][1 + var2] = 50;
						else if (var4 == 1)
							Class139.aByteArrayArrayArray916[var0][var1 + 1][var2 + 1] = 50;
						else if (var4 == 2)
							Class139.aByteArrayArrayArray916[var0][var1 + 1][var2] = 50;
						else if (var4 == 3)
							Class139.aByteArrayArrayArray916[var0][var1][var2] = 50;

					if ((var8.anInt1519 != 0) && (var7 != null))
						var7.method260(var1, var2, var5, var4, var8.aBool1520);

				} else {
					Object var26;
					int var27;
					if (var5 == 2) {
						var27 = (1 + var4) & 3;
						Object var29;
						if ((var8.anInt1525 == -1) && (null == var8.anIntArray1513)) {
							var29 = var8.method758(2, 4 + var4, var20, var21, var9, var22);
							var26 = var8.method758(2, var27, var20, var21, var9, var22);
						} else {
							var29 = new Class131_Sub20_Sub19_Sub5(var3, 2, 4 + var4, var0, var1, var2, var8.anInt1525,
									true, (Class131_Sub20_Sub19) null);
							var26 = new Class131_Sub20_Sub19_Sub5(var3, 2, var27, var0, var1, var2, var8.anInt1525,
									true, (Class131_Sub20_Sub19) null);
						}

						var6.method185(var0, var1, var2, var9, (Class131_Sub20_Sub19) var29,
								(Class131_Sub20_Sub19) var26, Class26.anIntArray232[var4], Class26.anIntArray232[var27],
								var12, var13);
						if (var8.aBool1524)
							if (var4 == 0) {
								Class48.anIntArrayArrayArray477[var0][var1][var2] |= 585;
								Class48.anIntArrayArrayArray477[var0][var1][var2 + 1] |= 1170;
							} else if (var4 == 1) {
								Class48.anIntArrayArrayArray477[var0][var1][1 + var2] |= 1170;
								Class48.anIntArrayArrayArray477[var0][var1 + 1][var2] |= 585;
							} else if (var4 == 2) {
								Class48.anIntArrayArrayArray477[var0][1 + var1][var2] |= 585;
								Class48.anIntArrayArrayArray477[var0][var1][var2] |= 1170;
							} else if (var4 == 3) {
								Class48.anIntArrayArrayArray477[var0][var1][var2] |= 1170;
								Class48.anIntArrayArrayArray477[var0][var1][var2] |= 585;
							}

						if ((var8.anInt1519 != 0) && (var7 != null))
							var7.method260(var1, var2, var5, var4, var8.aBool1520);

						if (var8.anInt1526 != 16)
							var6.method170(var0, var1, var2, var8.anInt1526);

					} else if (var5 == 3) {
						if ((var8.anInt1525 == -1) && (var8.anIntArray1513 == null))
							var30 = var8.method758(3, var4, var20, var21, var9, var22);
						else
							var30 = new Class131_Sub20_Sub19_Sub5(var3, 3, var4, var0, var1, var2, var8.anInt1525, true,
									(Class131_Sub20_Sub19) null);

						var6.method185(var0, var1, var2, var9, (Class131_Sub20_Sub19) var30,
								(Class131_Sub20_Sub19) null, Class26.anIntArray233[var4], 0, var12, var13);
						if (var8.aBool1533)
							if (var4 == 0)
								Class139.aByteArrayArrayArray916[var0][var1][1 + var2] = 50;
							else if (var4 == 1)
								Class139.aByteArrayArrayArray916[var0][1 + var1][1 + var2] = 50;
							else if (var4 == 2)
								Class139.aByteArrayArrayArray916[var0][var1 + 1][var2] = 50;
							else if (var4 == 3)
								Class139.aByteArrayArrayArray916[var0][var1][var2] = 50;

						if ((var8.anInt1519 != 0) && (null != var7))
							var7.method260(var1, var2, var5, var4, var8.aBool1520);

					} else if (var5 == 9) {
						if ((var8.anInt1525 == -1) && (null == var8.anIntArray1513))
							var30 = var8.method758(var5, var4, var20, var21, var9, var22);
						else
							var30 = new Class131_Sub20_Sub19_Sub5(var3, var5, var4, var0, var1, var2, var8.anInt1525,
									true, (Class131_Sub20_Sub19) null);

						var6.method195(var0, var1, var2, var9, 1, 1, (Class131_Sub20_Sub19) var30, 0, var12, var13);
						if ((var8.anInt1519 != 0) && (var7 != null))
							var7.method268(var1, var2, var15, var14, var8.aBool1520);

						if (var8.anInt1526 != 16)
							var6.method170(var0, var1, var2, var8.anInt1526);

					} else if (var5 == 4) {
						if ((var8.anInt1525 == -1) && (var8.anIntArray1513 == null))
							var30 = var8.method758(4, var4, var20, var21, var9, var22);
						else
							var30 = new Class131_Sub20_Sub19_Sub5(var3, 4, var4, var0, var1, var2, var8.anInt1525, true,
									(Class131_Sub20_Sub19) null);

						var6.method186(var0, var1, var2, var9, (Class131_Sub20_Sub19) var30,
								(Class131_Sub20_Sub19) null, Class26.anIntArray232[var4], 0, 0, 0, var12, var13);
					} else if (var5 == 5) {
						var27 = 16;
						var11 = var6.method167(var0, var1, var2);
						if (var11 != 0)
							var27 = Class83.method362((var11 >> 14) & 32767).anInt1526;

						if ((var8.anInt1525 == -1) && (var8.anIntArray1513 == null))
							var26 = var8.method758(4, var4, var20, var21, var9, var22);
						else
							var26 = new Class131_Sub20_Sub19_Sub5(var3, 4, var4, var0, var1, var2, var8.anInt1525, true,
									(Class131_Sub20_Sub19) null);

						var6.method186(var0, var1, var2, var9, (Class131_Sub20_Sub19) var26,
								(Class131_Sub20_Sub19) null, Class26.anIntArray232[var4], 0,
								var27 * Class26.anIntArray234[var4], var27 * Class26.anIntArray235[var4], var12, var13);
					} else if (var5 == 6) {
						var27 = 8;
						var11 = var6.method167(var0, var1, var2);
						if (var11 != 0)
							var27 = Class83.method362((var11 >> 14) & 32767).anInt1526 / 2;

						if ((var8.anInt1525 == -1) && (var8.anIntArray1513 == null))
							var26 = var8.method758(4, 4 + var4, var20, var21, var9, var22);
						else
							var26 = new Class131_Sub20_Sub19_Sub5(var3, 4, 4 + var4, var0, var1, var2, var8.anInt1525,
									true, (Class131_Sub20_Sub19) null);

						var6.method186(var0, var1, var2, var9, (Class131_Sub20_Sub19) var26,
								(Class131_Sub20_Sub19) null, 256, var4, Class26.anIntArray236[var4] * var27,
								var27 * Class26.anIntArray241[var4], var12, var13);
					} else if (var5 == 7) {
						var11 = (2 + var4) & 3;
						if ((var8.anInt1525 == -1) && (null == var8.anIntArray1513))
							var30 = var8.method758(4, 4 + var11, var20, var21, var9, var22);
						else
							var30 = new Class131_Sub20_Sub19_Sub5(var3, 4, 4 + var11, var0, var1, var2, var8.anInt1525,
									true, (Class131_Sub20_Sub19) null);

						var6.method186(var0, var1, var2, var9, (Class131_Sub20_Sub19) var30,
								(Class131_Sub20_Sub19) null, 256, var11, 0, 0, var12, var13);
					} else if (var5 == 8) {
						var27 = 8;
						var11 = var6.method167(var0, var1, var2);
						if (var11 != 0)
							var27 = Class83.method362((var11 >> 14) & 32767).anInt1526 / 2;

						final int var25 = (2 + var4) & 3;
						Object var28;
						if ((var8.anInt1525 == -1) && (var8.anIntArray1513 == null)) {
							var26 = var8.method758(4, var4 + 4, var20, var21, var9, var22);
							var28 = var8.method758(4, var25 + 4, var20, var21, var9, var22);
						} else {
							var26 = new Class131_Sub20_Sub19_Sub5(var3, 4, var4 + 4, var0, var1, var2, var8.anInt1525,
									true, (Class131_Sub20_Sub19) null);
							var28 = new Class131_Sub20_Sub19_Sub5(var3, 4, 4 + var25, var0, var1, var2, var8.anInt1525,
									true, (Class131_Sub20_Sub19) null);
						}

						var6.method186(var0, var1, var2, var9, (Class131_Sub20_Sub19) var26,
								(Class131_Sub20_Sub19) var28, 256, var4, var27 * Class26.anIntArray236[var4],
								Class26.anIntArray241[var4] * var27, var12, var13);
					}
				}
			} else {
				if ((var8.anInt1525 == -1) && (null == var8.anIntArray1513))
					var30 = var8.method758(10, var4, var20, var21, var9, var22);
				else
					var30 = new Class131_Sub20_Sub19_Sub5(var3, 10, var4, var0, var1, var2, var8.anInt1525, true,
							(Class131_Sub20_Sub19) null);

				if ((null != var30) && var6.method195(var0, var1, var2, var9, var15, var14,
						(Class131_Sub20_Sub19) var30, var5 == 11 ? 256 : 0, var12, var13) && var8.aBool1533) {
					var11 = 15;
					if (var30 instanceof Class131_Sub20_Sub19_Sub7) {
						var11 = ((Class131_Sub20_Sub19_Sub7) var30).method1017() / 4;
						if (var11 > 30)
							var11 = 30;
					}

					for (var23 = 0; var23 <= var15; ++var23)
						for (int var24 = 0; var24 <= var14; ++var24)
							if (var11 > Class139.aByteArrayArrayArray916[var0][var1 + var23][var2 + var24])
								Class139.aByteArrayArrayArray916[var0][var23 + var1][var2 + var24] = (byte) var11;
				}

				if ((var8.anInt1519 != 0) && (null != var7))
					var7.method268(var1, var2, var15, var14, var8.aBool1520);

			}
		}
	}

	public static Class131_Sub20_Sub3 method34(final int var0) {
		Class131_Sub20_Sub3 var1 = (Class131_Sub20_Sub3) Class131_Sub20_Sub3.aClass121_1428.method482(var0);
		if (null != var1)
			return var1;
		else {
			final byte[] var2 = Class131_Sub20_Sub3.aClass100_1425.method402(14, var0);
			var1 = new Class131_Sub20_Sub3();
			if (null != var2)
				var1.method709(new DataBuffer(var2));

			Class131_Sub20_Sub3.aClass121_1428.method479(var1, var0);
			return var1;
		}
	}

	static final void method35() {
		for (Class131_Sub9 var0 = (Class131_Sub9) client.aClass115_2158
				.method465(); var0 != null; var0 = (Class131_Sub9) client.aClass115_2158.method468()) {
			if (var0.anInt1050 > 0)
				--var0.anInt1050;

			int var1;
			int var2;
			Class131_Sub20_Sub9 var3;
			boolean var4;
			if (var0.anInt1050 == 0) {
				if (var0.anInt1046 >= 0) {
					var2 = var0.anInt1046;
					var1 = var0.anInt1055;
					var3 = Class83.method362(var2);
					if (var1 == 11)
						var1 = 10;

					if ((var1 >= 5) && (var1 <= 8))
						var1 = 4;

					var4 = var3.method760(var1);
					if (!var4)
						continue;
				}

				Class25.method118(var0.anInt1052, var0.anInt1053, var0.anInt1045, var0.anInt1043, var0.anInt1046,
						var0.anInt1047, var0.anInt1055);
				var0.method501();
			} else {
				if (var0.anInt1044 > 0)
					--var0.anInt1044;

				if ((var0.anInt1044 == 0) && (var0.anInt1045 >= 1) && (var0.anInt1043 >= 1) && (var0.anInt1045 <= 102)
						&& (var0.anInt1043 <= 102)) {
					if (var0.anInt1049 >= 0) {
						var2 = var0.anInt1049;
						var1 = var0.anInt1051;
						var3 = Class83.method362(var2);
						if (var1 == 11)
							var1 = 10;

						if ((var1 >= 5) && (var1 <= 8))
							var1 = 4;

						var4 = var3.method760(var1);
						if (!var4)
							continue;
					}

					Class25.method118(var0.anInt1052, var0.anInt1053, var0.anInt1045, var0.anInt1043, var0.anInt1049,
							var0.anInt1048, var0.anInt1051);
					var0.anInt1044 = -1;
					if ((var0.anInt1046 == var0.anInt1049) && (var0.anInt1046 == -1))
						var0.method501();
					else if ((var0.anInt1046 == var0.anInt1049) && (var0.anInt1047 == var0.anInt1048)
							&& (var0.anInt1051 == var0.anInt1055))
						var0.method501();
				}
			}
		}

	}

	static final void method36(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6) {
		if (Class77.method344(var0))
			Class93.method392(Class131_Sub18.aClass131_Sub18ArrayArray1174[var0], -1, var1, var2, var3, var4, var5,
					var6);
	}

	public static boolean method37(final char var0) {
		return (var0 >= 48) && (var0 <= 57);
	}
}
