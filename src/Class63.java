public abstract class Class63 {
	static int anInt582;
	public int anInt583;
	public int anInt584;
	static Class79 aClass79_585;
	public int anInt586;
	public int anInt587;

	static final void method301(final Player var0, final int var1, final int var2,
			final int var3) {
		if (var0 != Class131_Sub11.myPlayer)
			if (client.anInt2166 < 400) {
				String var5;
				if (var0.anInt1985 == 0)
					var5 = var0.aStringArray1983[0] + var0.aString2004 + var0.aStringArray1983[1]
							+ Class40.method217(var0.anInt1984,
									Class131_Sub11.myPlayer.anInt1984)
							+ " " + " (" + "level-" + var0.anInt1984 + ")" + var0.aStringArray1983[2];
				else
					var5 = var0.aStringArray1983[0] + var0.aString2004 + var0.aStringArray1983[1] + " " + " ("
							+ "skill-" + var0.anInt1985 + ")" + var0.aStringArray1983[2];

				int var6;
				if (client.anInt2090 == 1)
					Class73.method334("Use",
							client.aString2177 + " " + "->" + " " + Class103.method427(16777215) + var5, 14, var1, var2,
							var3);
				else if (client.aBool2178) {
					if ((Class45.anInt451 & 8) == 8)
						Class73.method334(client.aString2181,
								client.aString2182 + " " + "->" + " " + Class103.method427(16777215) + var5, 15, var1,
								var2, var3);
				} else
					for (var6 = 7; var6 >= 0; --var6)
						if (null != client.aStringArray2153[var6]) {
							short var4 = 0;
							if (client.aStringArray2153[var6].equalsIgnoreCase("Attack")) {
								if (Class50.aClass50_490 == client.aClass50_2055)
									continue;

								if ((Class50.aClass50_489 == client.aClass50_2055)
										|| ((Class50.aClass50_488 == client.aClass50_2055)
												&& (var0.anInt1984 > Class131_Sub11.myPlayer.anInt1984)))
									var4 = 2000;

								if ((Class131_Sub11.myPlayer.anInt2001 != 0)
										&& (var0.anInt2001 != 0))
									if (Class131_Sub11.myPlayer.anInt2001 == var0.anInt2001)
										var4 = 2000;
									else
										var4 = 0;
							} else if (client.aBoolArray2113[var6])
								var4 = 2000;

							final int var8 = client.anIntArray2152[var6] + var4;
							Class73.method334(client.aStringArray2153[var6], Class103.method427(16777215) + var5, var8,
									var1, var2, var3);
						}

				for (var6 = 0; var6 < client.anInt2166; ++var6)
					if (client.anIntArray2066[var6] == 23) {
						client.aStringArray2172[var6] = Class103.method427(16777215) + var5;
						break;
					}

			}
	}

	protected abstract boolean method302(int var1, int var2, int var3, Class51 var4, byte var5);

	static int method303(final CharSequence var0, final int var1, final boolean var2) {
		if ((var1 >= 2) && (var1 <= 36)) {
			boolean var4 = false;
			boolean var5 = false;
			int var8 = 0;
			final int var7 = var0.length();

			for (int var6 = 0; var6 < var7; ++var6) {
				final char var3 = var0.charAt(var6);
				if (var6 == 0) {
					if (var3 == 45) {
						var4 = true;
						continue;
					}

					if (var3 == 43)
						continue;
				}

				int var10;
				if ((var3 >= 48) && (var3 <= 57))
					var10 = var3 - 48;
				else if ((var3 >= 65) && (var3 <= 90))
					var10 = var3 - 55;
				else {
					if ((var3 < 97) || (var3 > 122))
						throw new NumberFormatException();

					var10 = var3 - 87;
				}

				if (var10 >= var1)
					throw new NumberFormatException();

				if (var4)
					var10 = -var10;

				final int var9 = var10 + (var1 * var8);
				if (var8 != (var9 / var1))
					throw new NumberFormatException();

				var8 = var9;
				var5 = true;
			}

			if (!var5)
				throw new NumberFormatException();
			else
				return var8;
		} else
			throw new IllegalArgumentException("");
	}

	static void method304(final Class30 var0) {
		if (var0.method132() != client.aBool2147) {
			client.aBool2147 = var0.method132();
			final boolean var1 = var0.method132();
			if (Class71.aBool611 != var1) {
				Class131_Sub20_Sub1.method688();
				Class71.aBool611 = var1;
			}
		}

		Class131_Sub7.aString1027 = var0.aString281;
		client.anInt2123 = var0.anInt278;
		client.anInt2028 = var0.anInt279;
		Class140.anInt929 = client.anInt2030 == 0 ? '\uaa4a' : var0.anInt278 + '\u9c40';
		Class49.anInt478 = client.anInt2030 == 0 ? 443 : var0.anInt278 + '\uc350';
		Class131_Sub11.anInt1072 = Class140.anInt929;
	}
}
