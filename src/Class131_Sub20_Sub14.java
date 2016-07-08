public class Class131_Sub20_Sub14 extends Class131_Sub20 {
	public static Class100 aClass100_1580;
	int anInt1583;
	static int anInt1594;
	public static Class100 aClass100_1595;
	static Class121 aClass121_1584 = new Class121(64);
	static Class121 aClass121_1585 = new Class121(30);
	public int anInt1579 = -1;
	int anInt1588 = 128;
	int anInt1586 = 128;
	int anInt1591 = 0;
	int anInt1592 = 0;
	int anInt1593 = 0;
	int anInt1582;
	short[] aShortArray1590;
	short[] aShortArray1587;
	short[] aShortArray1581;
	short[] aShortArray1589;

	void method784(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.readUByte();
			if (var2 == 0)
				return;

			method787(var1, var2);
		}
	}

	static final void method785(final Class131_Sub18 var0, final int var1, final int var2, final int var3) {
		Class28.method123();
		final Class131_Sub20_Sub21 var8 = var0.method670(false);
		if (var8 != null) {
			Class131_Sub20_Sub17.method845(var1, var2, var1 + var8.anInt1658, var2 + var8.anInt1659);
			if ((client.anInt2259 != 2) && (client.anInt2259 != 5)) {
				final int var9 = (client.anInt2236 + client.anInt2111) & 2047;
				final int var11 = 48 + (Class131_Sub11.myPlayer.anInt1718 / 32);
				final int var10 = 464 - (Class131_Sub11.myPlayer.anInt1759 / 32);
				Class95.aClass131_Sub20_Sub17_Sub3_763.method975(var1, var2, var8.anInt1658, var8.anInt1659, var11,
						var10, var9, 256 + client.anInt2100, var8.anIntArray1656, var8.anIntArray1657);

				int var4;
				int var5;
				int var14;
				for (var4 = 0; var4 < client.anInt2253; ++var4) {
					var14 = (2 + (4 * client.anIntArray2254[var4]))
							- (Class131_Sub11.myPlayer.anInt1718 / 32);
					var5 = (2 + (4 * client.anIntArray2255[var4]))
							- (Class131_Sub11.myPlayer.anInt1759 / 32);
					Class131_Sub19.method673(var1, var2, var14, var5, client.aClass131_Sub20_Sub17_Sub3Array2256[var4],
							var8);
				}

				int var12;
				int var15;
				for (var4 = 0; var4 < 104; ++var4)
					for (var14 = 0; var14 < 104; ++var14) {
						final Class115 var7 = client.aClass115ArrayArrayArray2306[Class39.anInt410][var4][var14];
						if (var7 != null) {
							var15 = ((var4 * 4) + 2)
									- (Class131_Sub11.myPlayer.anInt1718 / 32);
							var12 = ((4 * var14) + 2)
									- (Class131_Sub11.myPlayer.anInt1759 / 32);
							Class131_Sub19.method673(var1, var2, var15, var12,
									Class64.aClass131_Sub20_Sub17_Sub3Array588[0], var8);
						}
					}

				for (var4 = 0; var4 < client.anInt2230; ++var4) {
					final Class131_Sub20_Sub19_Sub2_Sub1 var6 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[client.anIntArray2067[var4]];
					if ((null != var6) && var6.method920(356082159)) {
						Class131_Sub20_Sub6 var21 = var6.aClass131_Sub20_Sub6_1978;
						if ((var21 != null) && (var21.anIntArray1468 != null))
							var21 = var21.method731();

						if ((null != var21) && var21.aBool1455 && var21.aBool1483) {
							var15 = (var6.anInt1718 / 32)
									- (Class131_Sub11.myPlayer.anInt1718 / 32);
							var12 = (var6.anInt1759 / 32)
									- (Class131_Sub11.myPlayer.anInt1759 / 32);
							Class131_Sub19.method673(var1, var2, var15, var12,
									Class64.aClass131_Sub20_Sub17_Sub3Array588[1], var8);
						}
					}
				}

				var4 = GPI.anInt11;
				final int[] var20 = GPI.anIntArray17;

				for (var5 = 0; var5 < var4; ++var5) {
					final Player var16 = client.playerArray[var20[var5]];
					if ((null != var16) && var16.method920(1669597157) && !var16.aBool1990
							&& (var16 != Class131_Sub11.myPlayer)) {
						var12 = (var16.anInt1718 / 32)
								- (Class131_Sub11.myPlayer.anInt1718 / 32);
						final int var13 = (var16.anInt1759 / 32)
								- (Class131_Sub11.myPlayer.anInt1759 / 32);
						boolean var19 = false;
						if (Class41.method219(var16.aString2004, true))
							var19 = true;

						boolean var17 = false;

						for (int var18 = 0; var18 < Class23.anInt210; ++var18)
							if (var16.aString2004
									.equals(Class131_Sub20_Sub8.aClass131_Sub13Array1498[var18].aString1106)) {
								var17 = true;
								break;
							}

						boolean var24 = false;
						if ((Class131_Sub11.myPlayer.anInt2001 != 0)
								&& (var16.anInt2001 != 0)
								&& (Class131_Sub11.myPlayer.anInt2001 == var16.anInt2001))
							var24 = true;

						if (var19)
							Class131_Sub19.method673(var1, var2, var12, var13,
									Class64.aClass131_Sub20_Sub17_Sub3Array588[3], var8);
						else if (var24)
							Class131_Sub19.method673(var1, var2, var12, var13,
									Class64.aClass131_Sub20_Sub17_Sub3Array588[4], var8);
						else if (var17)
							Class131_Sub19.method673(var1, var2, var12, var13,
									Class64.aClass131_Sub20_Sub17_Sub3Array588[5], var8);
						else
							Class131_Sub19.method673(var1, var2, var12, var13,
									Class64.aClass131_Sub20_Sub17_Sub3Array588[2], var8);
					}
				}

				if ((client.anInt2193 != 0) && ((client.anInt2038 % 20) < 10)) {
					if ((client.anInt2193 == 1) && (client.anInt2048 >= 0)
							&& (client.anInt2048 < client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065.length)) {
						final Class131_Sub20_Sub19_Sub2_Sub1 var22 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[client.anInt2048];
						if (null != var22) {
							var15 = (var22.anInt1718 / 32)
									- (Class131_Sub11.myPlayer.anInt1718 / 32);
							var12 = (var22.anInt1759 / 32)
									- (Class131_Sub11.myPlayer.anInt1759 / 32);
							Class131_Sub20_Sub13.method782(var1, var2, var15, var12,
									Class26.aClass131_Sub20_Sub17_Sub3Array243[1], var8);
						}
					}

					if (client.anInt2193 == 2) {
						var5 = (((client.anInt2050 * 4) - (Class131_Sub20_Sub20.anInt1649 * 4)) + 2)
								- (Class131_Sub11.myPlayer.anInt1718 / 32);
						var15 = (((client.anInt2051 * 4) - (Class50.anInt491 * 4)) + 2)
								- (Class131_Sub11.myPlayer.anInt1759 / 32);
						Class131_Sub20_Sub13.method782(var1, var2, var5, var15,
								Class26.aClass131_Sub20_Sub17_Sub3Array243[1], var8);
					}

					if ((client.anInt2193 == 10) && (client.anInt2097 >= 0)
							&& (client.anInt2097 < client.playerArray.length)) {
						final Player var23 = client.playerArray[client.anInt2097];
						if (null != var23) {
							var15 = (var23.anInt1718 / 32)
									- (Class131_Sub11.myPlayer.anInt1718 / 32);
							var12 = (var23.anInt1759 / 32)
									- (Class131_Sub11.myPlayer.anInt1759 / 32);
							Class131_Sub20_Sub13.method782(var1, var2, var15, var12,
									Class26.aClass131_Sub20_Sub17_Sub3Array243[1], var8);
						}
					}
				}

				if (client.anInt2218 != 0) {
					var5 = ((client.anInt2218 * 4) + 2)
							- (Class131_Sub11.myPlayer.anInt1718 / 32);
					var15 = (2 + (client.anInt2258 * 4))
							- (Class131_Sub11.myPlayer.anInt1759 / 32);
					Class131_Sub19.method673(var1, var2, var5, var15, Class26.aClass131_Sub20_Sub17_Sub3Array243[0],
							var8);
				}

				if (!Class131_Sub11.myPlayer.aBool1990)
					Class131_Sub20_Sub17.method850((var1 + (var8.anInt1658 / 2)) - 1, (var2 + (var8.anInt1659 / 2)) - 1,
							3, 3, 16777215);
			} else
				Class131_Sub20_Sub17.method858(var1, var2, 0, var8.anIntArray1656, var8.anIntArray1657);

			client.aBoolArray2229[var3] = true;
		}
	}

	public final Class131_Sub20_Sub19_Sub7 method786(final int var1) {
		Class131_Sub20_Sub19_Sub7 var2 = (Class131_Sub20_Sub19_Sub7) aClass121_1585.method482(anInt1583);
		if (var2 == null) {
			final Class131_Sub20_Sub19_Sub6 var3 = Class131_Sub20_Sub19_Sub6.method993(aClass100_1580, anInt1582, 0);
			if (var3 == null)
				return null;

			int var4;
			if (null != aShortArray1590)
				for (var4 = 0; var4 < aShortArray1590.length; ++var4)
					var3.method1010(aShortArray1590[var4], aShortArray1587[var4]);

			if (null != aShortArray1581)
				for (var4 = 0; var4 < aShortArray1581.length; ++var4)
					var3.method1004(aShortArray1581[var4], aShortArray1589[var4]);

			var2 = var3.method1001(anInt1592 + 64, 850 + anInt1593, -30, -50, -30);
			aClass121_1585.method479(var2, anInt1583);
		}

		Class131_Sub20_Sub19_Sub7 var5;
		if ((anInt1579 != -1) && (var1 != -1))
			var5 = Class131_Sub20_Sub19_Sub2_Sub1.method1066(anInt1579).method685(var2, var1);
		else
			var5 = var2.method1013(true);

		if ((anInt1588 != 128) || (anInt1586 != 128))
			var5.method1011(anInt1588, anInt1586, anInt1588);

		if (anInt1591 != 0) {
			if (anInt1591 == 90)
				var5.method1028();

			if (anInt1591 == 180) {
				var5.method1028();
				var5.method1028();
			}

			if (anInt1591 == 270) {
				var5.method1028();
				var5.method1028();
				var5.method1028();
			}
		}

		return var5;
	}

	void method787(final DataBuffer var1, final int var2) {
		if (var2 == 1)
			anInt1582 = var1.readUShort();
		else if (var2 == 2)
			anInt1579 = var1.readUShort();
		else if (var2 == 4)
			anInt1588 = var1.readUShort();
		else if (var2 == 5)
			anInt1586 = var1.readUShort();
		else if (var2 == 6)
			anInt1591 = var1.readUShort();
		else if (var2 == 7)
			anInt1592 = var1.readUByte();
		else if (var2 == 8)
			anInt1593 = var1.readUByte();
		else {
			int var3;
			int var4;
			if (var2 == 40) {
				var4 = var1.readUByte();
				aShortArray1590 = new short[var4];
				aShortArray1587 = new short[var4];

				for (var3 = 0; var3 < var4; ++var3) {
					aShortArray1590[var3] = (short) var1.readUShort();
					aShortArray1587[var3] = (short) var1.readUShort();
				}
			} else if (var2 == 41) {
				var4 = var1.readUByte();
				aShortArray1581 = new short[var4];
				aShortArray1589 = new short[var4];

				for (var3 = 0; var3 < var4; ++var3) {
					aShortArray1581[var3] = (short) var1.readUShort();
					aShortArray1589[var3] = (short) var1.readUShort();
				}
			}
		}

	}
}
