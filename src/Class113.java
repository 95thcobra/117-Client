public class Class113 {
	public static Class100 aClass100_829;
	public static Class100 aClass100_831;
	public static Class131_Sub4_Sub3 aClass131_Sub4_Sub3_832;
	public static int anInt833;
	public static int anInt834;
	public static Class100 aClass100_835;
	static byte aByte836;
	public static int anInt830 = 0;

	static void method455(final Class131_Sub18[] var0, final int var1, final int var2, final int var3,
			final boolean var4) {
		for (final Class131_Sub18 element : var0) {
			final Class131_Sub18 var6 = element;
			if ((var6 != null) && (var1 == var6.anInt1177)) {
				Player.method1074(var6, var2, var3, var4);
				Class47.method238(var6, var2, var3);
				if (var6.anInt1281 > (var6.anInt1181 - var6.anInt1173))
					var6.anInt1281 = var6.anInt1181 - var6.anInt1173;

				if (var6.anInt1281 < 0)
					var6.anInt1281 = 0;

				if (var6.anInt1180 > (var6.anInt1182 - var6.anInt1291))
					var6.anInt1180 = var6.anInt1182 - var6.anInt1291;

				if (var6.anInt1180 < 0)
					var6.anInt1180 = 0;

				if (var6.anInt1202 == 0)
					Class16_Sub1.method547(var0, var6, var4);
			}
		}

	}

	static final void method456() {
		for (int var0 = 0; var0 < client.anInt2289; ++var0) {
			--client.anIntArray2268[var0];
			if (client.anIntArray2268[var0] >= -10) {
				Class8 var8 = client.aClass8Array2129[var0];
				if (var8 == null) {
					var8 = Class8.method41(Class78.aClass100_Sub1_648, client.anIntArray2266[var0], 0);
					if (null == var8)
						continue;

					client.anIntArray2268[var0] += var8.method39();
					client.aClass8Array2129[var0] = var8;
				}

				if (client.anIntArray2268[var0] < 0) {
					int var10;
					if (client.anIntArray2257[var0] != 0) {
						final int var2 = (client.anIntArray2257[var0] & 255) * 128;
						final int var6 = (client.anIntArray2257[var0] >> 16) & 255;
						int var7 = (64 + (var6 * 128)) - Class131_Sub11.myPlayer.anInt1718;
						if (var7 < 0)
							var7 = -var7;

						final int var3 = (client.anIntArray2257[var0] >> 8) & 255;
						int var4 = ((128 * var3) + 64) - Class131_Sub11.myPlayer.anInt1759;
						if (var4 < 0)
							var4 = -var4;

						int var1 = (var4 + var7) - 128;
						if (var1 > var2) {
							client.anIntArray2268[var0] = -100;
							continue;
						}

						if (var1 < 0)
							var1 = 0;

						var10 = ((var2 - var1) * client.anInt2086) / var2;
					} else
						var10 = client.anInt2228;

					if (var10 > 0) {
						final Class131_Sub2_Sub1 var11 = var8.method38()
								.method788(Class131_Sub20_Sub19_Sub5.aClass18_1837);
						final Class131_Sub4_Sub1 var9 = Class131_Sub4_Sub1.method794(var11, 100, var10);
						var9.method802(client.anIntArray2267[var0] - 1);
						Class61.aClass131_Sub4_Sub2_578.method839(var9);
					}

					client.anIntArray2268[var0] = -100;
				}
			} else {
				--client.anInt2289;

				for (int var5 = var0; var5 < client.anInt2289; ++var5) {
					client.anIntArray2266[var5] = client.anIntArray2266[var5 + 1];
					client.aClass8Array2129[var5] = client.aClass8Array2129[1 + var5];
					client.anIntArray2267[var5] = client.anIntArray2267[1 + var5];
					client.anIntArray2268[var5] = client.anIntArray2268[var5 + 1];
					client.anIntArray2257[var5] = client.anIntArray2257[1 + var5];
				}

				--var0;
			}
		}

		if (client.aBool2262) {
			boolean var12;
			if (anInt830 != 0)
				var12 = true;
			else
				var12 = aClass131_Sub4_Sub3_832.method889();

			if (!var12) {
				if ((client.anInt2260 != 0) && (client.anInt2052 != -1))
					Class23.method108(Class44.aClass100_Sub1_446, client.anInt2052, 0, client.anInt2260, false);

				client.aBool2262 = false;
			}
		}

	}
}
