public class Class108 {
	static int[] anIntArray812;

	static final void method433(final String var0) {
		if (var0 != null)
			if (((client.anInt2290 < 200) || (client.anInt2149 == 1)) && (client.anInt2290 < 400)) {
				final String var4 = Class85.method371(var0, client.aClass142_2031);
				if (null != var4) {
					String var2;
					String var3;
					int var5;
					for (var5 = 0; var5 < client.anInt2290; ++var5) {
						final Class44 var1 = client.aClass44Array2292[var5];
						var2 = Class85.method371(var1.aString442, client.aClass142_2031);
						if ((var2 != null) && var2.equals(var4)) {
							Class131_Sub20_Sub15.method792(30, "", var0 + " is already on your friend list");
							return;
						}

						if (null != var1.aString437) {
							var3 = Class85.method371(var1.aString437, client.aClass142_2031);
							if ((null != var3) && var3.equals(var4)) {
								Class131_Sub20_Sub15.method792(30, "", var0 + " is already on your friend list");
								return;
							}
						}
					}

					for (var5 = 0; var5 < client.anInt2294; ++var5) {
						final Class36 var6 = client.aClass36Array2295[var5];
						var2 = Class85.method371(var6.aString369, client.aClass142_2031);
						if ((null != var2) && var2.equals(var4)) {
							Class131_Sub20_Sub15.method792(30, "",
									"Please remove " + var0 + " from your ignore list first");
							return;
						}

						if (var6.aString372 != null) {
							var3 = Class85.method371(var6.aString372, client.aClass142_2031);
							if ((null != var3) && var3.equals(var4)) {
								Class131_Sub20_Sub15.method792(30, "",
										"Please remove " + var0 + " from your ignore list first");
								return;
							}
						}
					}

					if (Class85.method371(Class131_Sub11.myPlayer.aString2004,
							client.aClass142_2031).equals(var4))
						Class131_Sub20_Sub15.method792(30, "", "You can\'t add yourself to your own friend list");
					else {
						client.secureBuffer.method871(251);
						client.secureBuffer.writeByte(Class131_Sub6.method554(var0));
						client.secureBuffer.writeStr(var0);
					}
				}
			} else
				Class131_Sub20_Sub15.method792(30, "",
						"Your friend list is full. Max of 200 for free users, and 400 for members");
	}

	static String method434(String var0, final Class131_Sub18 var1) {
		if (var0.indexOf("%") != -1) {
			int var2;
			for (var2 = 1; var2 <= 5; ++var2)
				while (true) {
					final int var3 = var0.indexOf("%" + var2);
					if (var3 == -1)
						break;

					var0 = var0.substring(0, var3)
							+ Class131_Sub20_Sub6.method735(Class131_Sub12.method578(var1, var2 - 1))
							+ var0.substring(var3 + 2);
				}

			while (true) {
				var2 = var0.indexOf("%dns");
				if (var2 == -1)
					break;

				String var4 = "";
				if (Class118.aClass87_856 != null) {
					final int var5 = Class118.aClass87_856.anInt712;
					final String var6 = ((var5 >> 24) & 255) + "." + ((var5 >> 16) & 255) + "." + ((var5 >> 8) & 255)
							+ "." + (var5 & 255);
					var4 = var6;
					if (null != Class118.aClass87_856.anObject716)
						var4 = (String) Class118.aClass87_856.anObject716;
				}

				var0 = var0.substring(0, var2) + var4 + var0.substring(var2 + 4);
			}
		}

		return var0;
	}

	static final void method435(final Class5 var0) {
		if ((client.anInt2218 == (Class131_Sub11.myPlayer.anInt1718 >> 7))
				&& (client.anInt2258 == (Class131_Sub11.myPlayer.anInt1759 >> 7)))
			client.anInt2218 = 0;

		final int var4 = GPI.localPlayers;
		final int[] var2 = GPI.localPlayerIndices;
		int var5 = var4;
		if ((var0 == Class5.aClass5_63) || (Class5.aClass5_58 == var0))
			var5 = 1;

		for (int var3 = 0; var3 < var5; ++var3) {
			Player var1;
			int var6;
			if (Class5.aClass5_63 == var0) {
				var1 = Class131_Sub11.myPlayer;
				var6 = Class131_Sub11.myPlayer.anInt1981 << 14;
			} else if (var0 == Class5.aClass5_58) {
				var1 = client.playerArray[client.anInt2200];
				var6 = client.anInt2200 << 14;
			} else {
				var1 = client.playerArray[var2[var3]];
				var6 = var2[var3] << 14;
				if ((Class5.aClass5_61 == var0) && (client.anInt2200 == var2[var3]))
					continue;
			}

			if ((var1 != null) && var1.method920(1658145806) && !var1.aBool1990) {
				var1.aBool1997 = false;
				if (((client.aBool2033 && (var4 > 50)) || (var4 > 200)) && (Class5.aClass5_63 != var0)
						&& (var1.anInt1707 == var1.anInt1729))
					var1.aBool1997 = true;

				final int var7 = var1.anInt1718 >> 7;
				final int var8 = var1.anInt1759 >> 7;
				if ((var7 >= 0) && (var7 < 104) && (var8 >= 0) && (var8 < 104))
					if ((var1.aClass131_Sub20_Sub19_Sub7_1987 != null) && (client.anInt2038 >= var1.anInt1998)
							&& (client.anInt2038 < var1.anInt1992)) {
						var1.aBool1997 = false;
						var1.anInt1986 = Class18.method88(var1.anInt1718, var1.anInt1759, Class39.anInt410);
						Class65.aClass33_595.method183(Class39.anInt410, var1.anInt1718, var1.anInt1759, var1.anInt1986,
								60, var1, var1.anInt1762, var6, var1.anInt1993, var1.anInt1994, var1.anInt1995,
								var1.anInt1996);
					} else {
						if (((var1.anInt1718 & 127) == 64) && ((var1.anInt1759 & 127) == 64)) {
							if (client.anInt2287 == client.anIntArrayArray2074[var7][var8])
								continue;

							client.anIntArrayArray2074[var7][var8] = client.anInt2287;
						}

						var1.anInt1986 = Class18.method88(var1.anInt1718, var1.anInt1759, Class39.anInt410);
						Class65.aClass33_595.method155(Class39.anInt410, var1.anInt1718, var1.anInt1759, var1.anInt1986,
								60, var1, var1.anInt1762, var6, var1.aBool1738);
					}
			}
		}

	}
}
