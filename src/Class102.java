public class Class102 {
	static char method425(final char var0) {
		return var0 == 198 ? '\u0045'
				: (var0 == 230 ? '\u0065'
						: (var0 == 223 ? '\u0073' : (var0 == 338 ? '\u0045' : (var0 == 339 ? '\u0065' : '\u0000'))));
	}

	static final void method426(int var0, int var1, int var2, int var3, final boolean var4) {
		if (var2 < 1)
			var2 = 1;

		if (var3 < 1)
			var3 = 1;

		int var6 = var3 - 334;
		if (var6 < 0)
			var6 = 0;
		else if (var6 > 100)
			var6 = 100;

		int var9 = ((var6 * (client.aShort2278 - client.aShort2081)) / 100) + client.aShort2081;
		final int var10 = (var3 * var9 * 512) / (334 * var2);
		int var5;
		int var11;
		short var15;
		if (var10 < client.aShort2157) {
			var15 = client.aShort2157;
			var9 = (334 * var2 * var15) / (512 * var3);
			if (var9 > client.aShort2282) {
				var9 = client.aShort2282;
				var11 = (512 * var3 * var9) / (var15 * 334);
				var5 = (var2 - var11) / 2;
				if (var4) {
					Class131_Sub20_Sub17.method844();
					Class131_Sub20_Sub17.method850(var0, var1, var5, var3, -16777216);
					Class131_Sub20_Sub17.method850((var2 + var0) - var5, var1, var5, var3, -16777216);
				}

				var0 += var5;
				var2 -= 2 * var5;
			}
		} else if (var10 > client.aShort2300) {
			var15 = client.aShort2300;
			var9 = (334 * var15 * var2) / (512 * var3);
			if (var9 < client.aShort2281) {
				var9 = client.aShort2281;
				var11 = (var2 * var15 * 334) / (512 * var9);
				var5 = (var3 - var11) / 2;
				if (var4) {
					Class131_Sub20_Sub17.method844();
					Class131_Sub20_Sub17.method850(var0, var1, var2, var5, -16777216);
					Class131_Sub20_Sub17.method850(var0, (var1 + var3) - var5, var2, var5, -16777216);
				}

				var1 += var5;
				var3 -= 2 * var5;
			}
		}

		var11 = ((var6 * (client.aShort2180 - client.aShort2279)) / 100) + client.aShort2279;
		client.anInt2283 = ((var3 * var9 * var11) / 85504) << 1;
		if ((client.anInt2169 != var2) || (client.anInt2288 != var3)) {
			final int[] var12 = new int[9];

			for (int var13 = 0; var13 < 9; ++var13) {
				final int var7 = 15 + (var13 * 32) + 128;
				final int var14 = (var7 * 3) + 600;
				final int var8 = Class131_Sub20_Sub17_Sub1.anIntArray1787[var7];
				var12[var13] = (var8 * var14) >> 16;
			}

			Class33.method153(var12, 500, 800, var2, var3);
		}

		client.anInt2199 = var0;
		client.anInt2286 = var1;
		client.anInt2169 = var2;
		client.anInt2288 = var3;
	}
}
