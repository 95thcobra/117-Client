public final class Class25 {
	int anInt214;
	int anInt215;
	int anInt216;
	int anInt217;
	public Class131_Sub20_Sub19 aClass131_Sub20_Sub19_218;
	int anInt219;
	public Class131_Sub20_Sub19 aClass131_Sub20_Sub19_220;
	static Class131_Sub20_Sub17_Sub3[] aClass131_Sub20_Sub17_Sub3Array221;
	public int anInt223 = 0;
	int anInt222 = 0;

	static final void method118(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6) {
		if ((var2 >= 1) && (var3 >= 1) && (var2 <= 102) && (var3 <= 102)) {
			if (client.aBool2033 && (var0 != Class39.anInt410))
				return;

			int var8 = 0;
			if (var1 == 0)
				var8 = Class65.aClass33_595.method167(var0, var2, var3);

			if (var1 == 1)
				var8 = Class65.aClass33_595.method159(var0, var2, var3);

			if (var1 == 2)
				var8 = Class65.aClass33_595.method191(var0, var2, var3);

			if (var1 == 3)
				var8 = Class65.aClass33_595.method149(var0, var2, var3);

			int var11;
			if (var8 != 0) {
				var11 = Class65.aClass33_595.method187(var0, var2, var3, var8);
				final int var15 = (var8 >> 14) & 32767;
				final int var13 = var11 & 31;
				final int var14 = (var11 >> 6) & 3;
				Class131_Sub20_Sub9 var7;
				if (var1 == 0) {
					Class65.aClass33_595.method160(var0, var2, var3);
					var7 = Class83.method362(var15);
					if (var7.anInt1519 != 0)
						client.aClass51Array2087[var0].method265(var2, var3, var13, var14, var7.aBool1520);
				}

				if (var1 == 1)
					Class65.aClass33_595.method161(var0, var2, var3);

				if (var1 == 2) {
					Class65.aClass33_595.method162(var0, var2, var3);
					var7 = Class83.method362(var15);
					if (((var2 + var7.anInt1511) > 103) || ((var3 + var7.anInt1511) > 103)
							|| ((var2 + var7.anInt1503) > 103) || ((var7.anInt1503 + var3) > 103))
						return;

					if (var7.anInt1519 != 0)
						client.aClass51Array2087[var0].method266(var2, var3, var7.anInt1511, var7.anInt1503, var14,
								var7.aBool1520);
				}

				if (var1 == 3) {
					Class65.aClass33_595.method148(var0, var2, var3);
					var7 = Class83.method362(var15);
					if (var7.anInt1519 == 1)
						client.aClass51Array2087[var0].method264(var2, var3);
				}
			}

			if (var4 >= 0) {
				var11 = var0;
				if ((var0 < 3) && ((Class26.aByteArrayArrayArray225[1][var2][var3] & 2) == 2))
					var11 = var0 + 1;

				Class131_Sub20_Sub3.method708(var0, var11, var2, var3, var4, var5, var6, Class65.aClass33_595,
						client.aClass51Array2087[var0]);
			}
		}

	}

	static final void method119(Class131_Sub20_Sub6 var0, final int var1, final int var2, final int var3) {
		if (client.anInt2166 < 400) {
			if (var0.anIntArray1468 != null)
				var0 = var0.method731();

			if (var0 != null)
				if (var0.aBool1483)
					if (!var0.aBool1485 || (client.anInt2069 == var1)) {
						String var8 = var0.aString1463;
						if (var0.anInt1487 != 0)
							var8 = var8
									+ Class40.method217(var0.anInt1487,
											Class131_Sub11.myPlayer.anInt1984)
									+ " " + " (" + "level-" + var0.anInt1487 + ")";

						if (client.anInt2090 == 1)
							Class73.method334("Use",
									client.aString2177 + " " + "->" + " " + Class103.method427(16776960) + var8, 7,
									var1, var2, var3);
						else if (client.aBool2178) {
							if ((Class45.anInt451 & 2) == 2)
								Class73.method334(client.aString2181,
										client.aString2182 + " " + "->" + " " + Class103.method427(16776960) + var8, 8,
										var1, var2, var3);
						} else {
							String[] var4 = var0.aStringArray1452;
							if (client.aBool2194)
								var4 = Class49.method255(var4);

							int var5;
							if (null != var4)
								for (var5 = 4; var5 >= 0; --var5)
									if ((null != var4[var5]) && !var4[var5].equalsIgnoreCase("Attack")) {
										byte var7 = 0;
										if (var5 == 0)
											var7 = 9;

										if (var5 == 1)
											var7 = 10;

										if (var5 == 2)
											var7 = 11;

										if (var5 == 3)
											var7 = 12;

										if (var5 == 4)
											var7 = 13;

										Class73.method334(var4[var5], Class103.method427(16776960) + var8, var7, var1,
												var2, var3);
									}

							if (null != var4)
								for (var5 = 4; var5 >= 0; --var5)
									if ((null != var4[var5]) && var4[var5].equalsIgnoreCase("Attack")) {
										short var9 = 0;
										if (client.aClass50_2056 != Class50.aClass50_490) {
											if ((client.aClass50_2056 == Class50.aClass50_489)
													|| ((client.aClass50_2056 == Class50.aClass50_488)
															&& (var0.anInt1487 > Class131_Sub11.myPlayer.anInt1984)))
												var9 = 2000;

											int var6 = 0;
											if (var5 == 0)
												var6 = var9 + 9;

											if (var5 == 1)
												var6 = var9 + 10;

											if (var5 == 2)
												var6 = var9 + 11;

											if (var5 == 3)
												var6 = 12 + var9;

											if (var5 == 4)
												var6 = var9 + 13;

											Class73.method334(var4[var5], Class103.method427(16776960) + var8, var6,
													var1, var2, var3);
										}
									}

							Class73.method334("Examine", Class103.method427(16776960) + var8, 1003, var1, var2, var3);
						}

					}
		}
	}

	static void method120(final int var0, final int var1, final int var2) {
		if ((client.anInt2228 != 0) && (var1 != 0) && (client.anInt2289 < 50)) {
			client.anIntArray2266[client.anInt2289] = var0;
			client.anIntArray2267[client.anInt2289] = var1;
			client.anIntArray2268[client.anInt2289] = var2;
			client.aClass8Array2129[client.anInt2289] = null;
			client.anIntArray2257[client.anInt2289] = 0;
			++client.anInt2289;
		}

	}
}
