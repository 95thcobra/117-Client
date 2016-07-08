public class Class60 {
	public static boolean aBool568;
	static Class100_Sub1 aClass100_Sub1_571;
	int[] anIntArray572;
	byte[] aByteArray569;
	int[] anIntArray570;

	static String method291(final int var0, final byte var1) {
		return "<img=" + var0 + ">";
	}

	public int method292(final byte[] var1, final int var2, final byte[] var3, int var4, int var5) {
		if (var5 == 0)
			return 0;
		else {
			int var7 = 0;
			var5 += var4;
			int var8 = var2;

			while (true) {
				final byte var9 = var1[var8];
				if (var9 < 0)
					var7 = anIntArray570[var7];
				else
					++var7;

				int var6;
				if ((var6 = anIntArray570[var7]) < 0) {
					var3[var4++] = (byte) (~var6);
					if (var4 >= var5)
						break;

					var7 = 0;
				}

				if ((var9 & 64) != 0)
					var7 = anIntArray570[var7];
				else
					++var7;

				if ((var6 = anIntArray570[var7]) < 0) {
					var3[var4++] = (byte) (~var6);
					if (var4 >= var5)
						break;

					var7 = 0;
				}

				if ((var9 & 32) != 0)
					var7 = anIntArray570[var7];
				else
					++var7;

				if ((var6 = anIntArray570[var7]) < 0) {
					var3[var4++] = (byte) (~var6);
					if (var4 >= var5)
						break;

					var7 = 0;
				}

				if ((var9 & 16) != 0)
					var7 = anIntArray570[var7];
				else
					++var7;

				if ((var6 = anIntArray570[var7]) < 0) {
					var3[var4++] = (byte) (~var6);
					if (var4 >= var5)
						break;

					var7 = 0;
				}

				if ((var9 & 8) != 0)
					var7 = anIntArray570[var7];
				else
					++var7;

				if ((var6 = anIntArray570[var7]) < 0) {
					var3[var4++] = (byte) (~var6);
					if (var4 >= var5)
						break;

					var7 = 0;
				}

				if ((var9 & 4) != 0)
					var7 = anIntArray570[var7];
				else
					++var7;

				if ((var6 = anIntArray570[var7]) < 0) {
					var3[var4++] = (byte) (~var6);
					if (var4 >= var5)
						break;

					var7 = 0;
				}

				if ((var9 & 2) != 0)
					var7 = anIntArray570[var7];
				else
					++var7;

				if ((var6 = anIntArray570[var7]) < 0) {
					var3[var4++] = (byte) (~var6);
					if (var4 >= var5)
						break;

					var7 = 0;
				}

				if ((var9 & 1) != 0)
					var7 = anIntArray570[var7];
				else
					++var7;

				if ((var6 = anIntArray570[var7]) < 0) {
					var3[var4++] = (byte) (~var6);
					if (var4 >= var5)
						break;

					var7 = 0;
				}

				++var8;
			}

			return (1 + var8) - var2;
		}
	}

	public int method293(final byte[] var1, int var2, int var3, final byte[] var4, final int var5) {
		int var6 = 0;
		int var13 = var5 << 3;

		for (var3 += var2; var2 < var3; ++var2) {
			final int var11 = var1[var2] & 255;
			final int var9 = anIntArray572[var11];
			final byte var12 = aByteArray569[var11];
			if (var12 == 0)
				throw new RuntimeException("");

			int var7 = var13 >> 3;
			int var10 = var13 & 7;
			var6 &= -var10 >> 31;
			final int var8 = var7 + (((var12 + var10) - 1) >> 3);
			var10 += 24;
			var4[var7] = (byte) (var6 |= var9 >>> var10);
			if (var7 < var8) {
				++var7;
				var10 -= 8;
				var4[var7] = (byte) (var6 = var9 >>> var10);
				if (var7 < var8) {
					++var7;
					var10 -= 8;
					var4[var7] = (byte) (var6 = var9 >>> var10);
					if (var7 < var8) {
						++var7;
						var10 -= 8;
						var4[var7] = (byte) (var6 = var9 >>> var10);
						if (var7 < var8) {
							++var7;
							var10 -= 8;
							var4[var7] = (byte) (var6 = var9 << -var10);
						}
					}
				}
			}

			var13 += var12;
		}

		return ((7 + var13) >> 3) - var5;
	}

	public Class60(final byte[] var1) {
		final int var3 = var1.length;
		anIntArray572 = new int[var3];
		aByteArray569 = var1;
		final int[] var4 = new int[33];
		anIntArray570 = new int[8];
		int var7 = 0;

		for (int var5 = 0; var5 < var3; ++var5) {
			final byte var8 = var1[var5];
			if (var8 != 0) {
				final int var9 = 1 << (32 - var8);
				final int var10 = var4[var8];
				anIntArray572[var5] = var10;
				int var6;
				int var11;
				int var12;
				int var13;
				if ((var10 & var9) != 0)
					var12 = var4[var8 - 1];
				else {
					var12 = var10 | var9;

					for (var6 = var8 - 1; var6 >= 1; --var6) {
						var13 = var4[var6];
						if (var10 != var13)
							break;

						var11 = 1 << (32 - var6);
						if ((var13 & var11) != 0) {
							var4[var6] = var4[var6 - 1];
							break;
						}

						var4[var6] = var13 | var11;
					}
				}

				var4[var8] = var12;

				for (var6 = var8 + 1; var6 <= 32; ++var6)
					if (var4[var6] == var10)
						var4[var6] = var12;

				var6 = 0;

				for (var13 = 0; var13 < var8; ++var13) {
					var11 = Integer.MIN_VALUE >>> var13;
					if ((var10 & var11) != 0) {
						if (anIntArray570[var6] == 0)
							anIntArray570[var6] = var7;

						var6 = anIntArray570[var6];
					} else
						++var6;

					if (var6 >= anIntArray570.length) {
						final int[] var2 = new int[2 * anIntArray570.length];

						for (int var14 = 0; var14 < anIntArray570.length; ++var14)
							var2[var14] = anIntArray570[var14];

						anIntArray570 = var2;
					}

					var11 >>>= 1;
				}

				anIntArray570[var6] = ~var5;
				if (var6 >= var7)
					var7 = 1 + var6;
			}
		}

	}

	public static void method294() {
		if (null != Class94.aClass86_754)
			Class94.aClass86_754.method373();

	}

	public static Class84[] method295(final int var0) {
		return new Class84[] { Class84.aClass84_693, Class84.aClass84_694, Class84.aClass84_695 };
	}
}
