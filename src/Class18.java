public class Class18 {
	int anInt175;
	int anInt174;
	int[][] anIntArrayArray173;

	static int method83() {
		return ++Class32.anInt300 - 1;
	}

	byte[] method84(byte[] var1) {
		if (null != anIntArrayArray173) {
			final int var4 = 14 + (int) (((long) var1.length * (long) anInt174) / anInt175);
			final int[] var5 = new int[var4];
			int var6 = 0;
			int var7 = 0;

			int var2;
			for (var2 = 0; var2 < var1.length; ++var2) {
				final byte var3 = var1[var2];
				final int[] var9 = anIntArrayArray173[var7];

				int var8;
				for (var8 = 0; var8 < 14; ++var8)
					var5[var6 + var8] += var9[var8] * var3;

				var7 += anInt174;
				var8 = var7 / anInt175;
				var6 += var8;
				var7 -= anInt175 * var8;
			}

			var1 = new byte[var4];

			for (var2 = 0; var2 < var4; ++var2) {
				final int var10 = (var5[var2] + '\u8000') >> 16;
				if (var10 < -128)
					var1[var2] = -128;
				else if (var10 > 127)
					var1[var2] = 127;
				else
					var1[var2] = (byte) var10;
			}
		}

		return var1;
	}

	int method85(int var1) {
		if (anIntArrayArray173 != null)
			var1 = 6 + (int) (((long) var1 * (long) anInt174) / anInt175);

		return var1;
	}

	int method86(int var1) {
		if (anIntArrayArray173 != null)
			var1 = (int) (((long) var1 * (long) anInt174) / anInt175);

		return var1;
	}

	public Class18(int var1, int var2) {
		if (var1 != var2) {
			int var3 = var1;
			int var5 = var2;
			if (var2 > var1) {
				var3 = var2;
				var5 = var1;
			}

			while (var5 != 0) {
				final int var4 = var3 % var5;
				var3 = var5;
				var5 = var4;
			}

			var1 /= var3;
			var2 /= var3;
			anInt175 = var1;
			anInt174 = var2;
			anIntArrayArray173 = new int[var1][14];

			for (int var10 = 0; var10 < var1; ++var10) {
				final int[] var14 = anIntArrayArray173[var10];
				final double var12 = 6.0D + ((double) var10 / (double) var1);
				int var11 = (int) Math.floor((var12 - 7.0D) + 1.0D);
				if (var11 < 0)
					var11 = 0;

				int var15 = (int) Math.ceil(var12 + 7.0D);
				if (var15 > 14)
					var15 = 14;

				for (final double var17 = (double) var2 / (double) var1; var11 < var15; ++var11) {
					final double var8 = (var11 - var12) * 3.141592653589793D;
					double var6 = var17;
					if ((var8 < -1.0E-4D) || (var8 > 1.0E-4D))
						var6 = var17 * (Math.sin(var8) / var8);

					var6 *= 0.54D + (0.46D * Math.cos((var11 - var12) * 0.2243994752564138D));
					var14[var11] = (int) Math.floor((var6 * 65536.0D) + 0.5D);
				}
			}

		}
	}

	static final void method87(final String var0, final boolean var1) {
		if (var0 != null)
			if (((client.anInt2294 < 100) || (client.anInt2149 == 1)) && (client.anInt2294 < 400)) {
				final String var4 = Class85.method371(var0, client.aClass142_2031);
				if (null != var4) {
					int var2;
					String var3;
					String var6;
					for (var2 = 0; var2 < client.anInt2294; ++var2) {
						final Class36 var5 = client.aClass36Array2295[var2];
						var6 = Class85.method371(var5.aString369, client.aClass142_2031);
						if ((var6 != null) && var6.equals(var4)) {
							Class131_Sub20_Sub15.method792(31, "", var0 + " is already on your ignore list");
							return;
						}

						if (null != var5.aString372) {
							var3 = Class85.method371(var5.aString372, client.aClass142_2031);
							if ((null != var3) && var3.equals(var4)) {
								Class131_Sub20_Sub15.method792(31, "", var0 + " is already on your ignore list");
								return;
							}
						}
					}

					for (var2 = 0; var2 < client.anInt2290; ++var2) {
						final Class44 var7 = client.aClass44Array2292[var2];
						var6 = Class85.method371(var7.aString442, client.aClass142_2031);
						if ((null != var6) && var6.equals(var4)) {
							Class131_Sub20_Sub15.method792(31, "",
									"Please remove " + var0 + " from your friend list first");
							return;
						}

						if (null != var7.aString437) {
							var3 = Class85.method371(var7.aString437, client.aClass142_2031);
							if ((null != var3) && var3.equals(var4)) {
								Class131_Sub20_Sub15.method792(31, "",
										"Please remove " + var0 + " from your friend list first");
								return;
							}
						}
					}

					if (Class85.method371(Class131_Sub11.myPlayer.aString2004,
							client.aClass142_2031).equals(var4))
						Class131_Sub20_Sub15.method792(31, "", "You can\'t add yourself to your own ignore list");
					else {
						client.secureBuffer.method871(48);
						client.secureBuffer.writeByte(Class131_Sub6.method554(var0));
						client.secureBuffer.writeStr(var0);
					}
				}
			} else
				Class131_Sub20_Sub15.method792(31, "",
						"Your ignore list is full. Max of 100 for free users, and 400 for members");
	}

	static final int method88(final int var0, final int var1, final int var2) {
		final int var3 = var0 >> 7;
		final int var5 = var1 >> 7;
		if ((var3 >= 0) && (var5 >= 0) && (var3 <= 103) && (var5 <= 103)) {
			int var6 = var2;
			if ((var2 < 3) && ((Class26.aByteArrayArrayArray225[1][var3][var5] & 2) == 2))
				var6 = var2 + 1;

			final int var7 = var0 & 127;
			final int var4 = var1 & 127;
			final int var8 = ((var7 * Class26.anIntArrayArrayArray239[var6][var3 + 1][var5])
					+ ((128 - var7) * Class26.anIntArrayArrayArray239[var6][var3][var5])) >> 7;
			final int var9 = ((var7 * Class26.anIntArrayArrayArray239[var6][1 + var3][1 + var5])
					+ ((128 - var7) * Class26.anIntArrayArrayArray239[var6][var3][1 + var5])) >> 7;
			return ((var8 * (128 - var4)) + (var4 * var9)) >> 7;
		} else
			return 0;
	}
}
