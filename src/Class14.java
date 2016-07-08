import java.util.Random;

public class Class14 {
	int[] anIntArray126 = new int[] { 0, 0, 0, 0, 0 };
	int[] anIntArray135 = new int[] { 0, 0, 0, 0, 0 };
	int[] anIntArray137 = new int[] { 0, 0, 0, 0, 0 };
	int anInt129 = 0;
	int anInt132 = 100;
	int anInt138 = 500;
	int anInt134 = 0;
	Class10 aClass10_142;
	Class10 aClass10_119;
	Class10 aClass10_133;
	Class10 aClass10_121;
	Class10 aClass10_122;
	Class10 aClass10_130;
	Class10 aClass10_124;
	Class10 aClass10_125;
	Class11 aClass11_131;
	Class10 aClass10_136;
	static int[] anIntArray128 = new int['\u8000'];
	static int[] anIntArray123;
	static int[] anIntArray118;
	static int[] anIntArray139;
	static int[] anIntArray127;
	static int[] anIntArray140;
	static int[] anIntArray141;
	static int[] anIntArray120;

	final int method55(final int var1, final int var2, final int var3) {
		return var3 != 1
				? (var3 == 2 ? (anIntArray123[var1 & 32767] * var2) >> 14
						: (var3 == 3 ? (((var1 & 32767) * var2) >> 14) - var2
								: (var3 == 4 ? anIntArray128[(var1 / 2607) & 32767] * var2 : 0)))
				: ((var1 & 32767) >= 16384 ? -var2 : var2);
	}

	final void method56(final DataBuffer var1) {
		aClass10_142 = new Class10();
		aClass10_142.method42(var1);
		aClass10_119 = new Class10();
		aClass10_119.method42(var1);
		int var3 = var1.readUByte();
		if (var3 != 0) {
			--var1.pos;
			aClass10_133 = new Class10();
			aClass10_133.method42(var1);
			aClass10_121 = new Class10();
			aClass10_121.method42(var1);
		}

		var3 = var1.readUByte();
		if (var3 != 0) {
			--var1.pos;
			aClass10_122 = new Class10();
			aClass10_122.method42(var1);
			aClass10_130 = new Class10();
			aClass10_130.method42(var1);
		}

		var3 = var1.readUByte();
		if (var3 != 0) {
			--var1.pos;
			aClass10_124 = new Class10();
			aClass10_124.method42(var1);
			aClass10_125 = new Class10();
			aClass10_125.method42(var1);
		}

		for (int var2 = 0; var2 < 10; ++var2) {
			final int var4 = var1.readCompact();
			if (var4 == 0)
				break;

			anIntArray126[var2] = var4;
			anIntArray135[var2] = var1.method605();
			anIntArray137[var2] = var1.readCompact();
		}

		anInt129 = var1.readCompact();
		anInt132 = var1.readCompact();
		anInt138 = var1.readUShort();
		anInt134 = var1.readUShort();
		aClass11_131 = new Class11();
		aClass10_136 = new Class10();
		aClass11_131.method50(var1, aClass10_136);
	}

	static {
		final Random var0 = new Random(0L);

		int var1;
		for (var1 = 0; var1 < '\u8000'; ++var1)
			anIntArray128[var1] = (var0.nextInt() & 2) - 1;

		anIntArray123 = new int['\u8000'];

		for (var1 = 0; var1 < '\u8000'; ++var1)
			anIntArray123[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);

		anIntArray118 = new int[220500];
		anIntArray139 = new int[5];
		anIntArray127 = new int[5];
		anIntArray140 = new int[5];
		anIntArray141 = new int[5];
		anIntArray120 = new int[5];
	}

	final int[] method57(final int var1, final int var2) {
		Class55.method275(anIntArray118, 0, var1);
		if (var2 < 10)
			return anIntArray118;
		else {
			final double var8 = var1 / (var2 + 0.0D);
			aClass10_142.method43();
			aClass10_119.method43();
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			if (aClass10_133 != null) {
				aClass10_133.method43();
				aClass10_121.method43();
				var5 = (int) (((aClass10_133.anInt93 - aClass10_133.anInt92) * 32.768D) / var8);
				var6 = (int) ((aClass10_133.anInt92 * 32.768D) / var8);
			}

			int var10 = 0;
			int var17 = 0;
			int var16 = 0;
			if (aClass10_122 != null) {
				aClass10_122.method43();
				aClass10_130.method43();
				var10 = (int) (((aClass10_122.anInt93 - aClass10_122.anInt92) * 32.768D) / var8);
				var17 = (int) ((aClass10_122.anInt92 * 32.768D) / var8);
			}

			int var4;
			for (var4 = 0; var4 < 5; ++var4)
				if (anIntArray126[var4] != 0) {
					anIntArray139[var4] = 0;
					anIntArray127[var4] = (int) (anIntArray137[var4] * var8);
					anIntArray140[var4] = (anIntArray126[var4] << 14) / 100;
					anIntArray141[var4] = (int) (((aClass10_142.anInt93 - aClass10_142.anInt92) * 32.768D
							* Math.pow(1.0057929410678534D, anIntArray135[var4])) / var8);
					anIntArray120[var4] = (int) ((aClass10_142.anInt92 * 32.768D) / var8);
				}

			int var3;
			int var11;
			int var14;
			int var15;
			for (var4 = 0; var4 < var1; ++var4) {
				var11 = aClass10_142.method44(var1);
				var14 = aClass10_119.method44(var1);
				if (aClass10_133 != null) {
					var3 = aClass10_133.method44(var1);
					var15 = aClass10_121.method44(var1);
					var11 += method55(var7, var15, aClass10_133.anInt89) >> 1;
					var7 += ((var3 * var5) >> 16) + var6;
				}

				if (aClass10_122 != null) {
					var3 = aClass10_122.method44(var1);
					var15 = aClass10_130.method44(var1);
					var14 = (var14 * ((method55(var16, var15, aClass10_122.anInt89) >> 1) + '\u8000')) >> 15;
					var16 += ((var3 * var10) >> 16) + var17;
				}

				for (var3 = 0; var3 < 5; ++var3)
					if (anIntArray126[var3] != 0) {
						var15 = var4 + anIntArray127[var3];
						if (var15 < var1) {
							anIntArray118[var15] += method55(anIntArray139[var3], (var14 * anIntArray140[var3]) >> 15,
									aClass10_142.anInt89);
							anIntArray139[var3] += ((var11 * anIntArray141[var3]) >> 16) + anIntArray120[var3];
						}
					}
			}

			int var18;
			if (aClass10_124 != null) {
				aClass10_124.method43();
				aClass10_125.method43();
				var4 = 0;
				boolean var20 = true;

				for (var3 = 0; var3 < var1; ++var3) {
					var15 = aClass10_124.method44(var1);
					var18 = aClass10_125.method44(var1);
					if (var20)
						var11 = aClass10_124.anInt92 + (((aClass10_124.anInt93 - aClass10_124.anInt92) * var15) >> 8);
					else
						var11 = aClass10_124.anInt92 + (((aClass10_124.anInt93 - aClass10_124.anInt92) * var18) >> 8);

					var4 += 256;
					if (var4 >= var11) {
						var4 = 0;
						var20 = !var20;
					}

					if (var20)
						anIntArray118[var3] = 0;
				}
			}

			if ((anInt129 > 0) && (anInt132 > 0)) {
				var4 = (int) (anInt129 * var8);

				for (var11 = var4; var11 < var1; ++var11)
					anIntArray118[var11] += (anIntArray118[var11 - var4] * anInt132) / 100;
			}

			if ((aClass11_131.anIntArray105[0] > 0) || (aClass11_131.anIntArray105[1] > 0)) {
				aClass10_136.method43();
				var4 = aClass10_136.method44(var1 + 1);
				var11 = aClass11_131.method49(0, var4 / 65536.0F);
				var14 = aClass11_131.method49(1, var4 / 65536.0F);
				if (var1 >= (var11 + var14)) {
					var3 = 0;
					var15 = var14;
					if (var14 > (var1 - var11))
						var15 = var1 - var11;

					int var13;
					while (var3 < var15) {
						var18 = (int) (((long) anIntArray118[var3 + var11] * (long) Class11.anInt106) >> 16);

						for (var13 = 0; var13 < var11; ++var13)
							var18 += (int) (((long) anIntArray118[(var3 + var11) - 1 - var13]
									* (long) Class11.anIntArrayArray102[0][var13]) >> 16);

						for (var13 = 0; var13 < var3; ++var13)
							var18 -= (int) (((long) anIntArray118[var3 - 1 - var13]
									* (long) Class11.anIntArrayArray102[1][var13]) >> 16);

						anIntArray118[var3] = var18;
						var4 = aClass10_136.method44(var1 + 1);
						++var3;
					}

					var15 = 128;

					while (true) {
						if (var15 > (var1 - var11))
							var15 = var1 - var11;

						int var12;
						while (var3 < var15) {
							var13 = (int) (((long) anIntArray118[var3 + var11] * (long) Class11.anInt106) >> 16);

							for (var12 = 0; var12 < var11; ++var12)
								var13 += (int) (((long) anIntArray118[(var3 + var11) - 1 - var12]
										* (long) Class11.anIntArrayArray102[0][var12]) >> 16);

							for (var12 = 0; var12 < var14; ++var12)
								var13 -= (int) (((long) anIntArray118[var3 - 1 - var12]
										* (long) Class11.anIntArrayArray102[1][var12]) >> 16);

							anIntArray118[var3] = var13;
							var4 = aClass10_136.method44(var1 + 1);
							++var3;
						}

						if (var3 >= (var1 - var11)) {
							while (var3 < var1) {
								var13 = 0;

								for (var12 = (var3 + var11) - var1; var12 < var11; ++var12)
									var13 += (int) (((long) anIntArray118[(var3 + var11) - 1 - var12]
											* (long) Class11.anIntArrayArray102[0][var12]) >> 16);

								for (var12 = 0; var12 < var14; ++var12)
									var13 -= (int) (((long) anIntArray118[var3 - 1 - var12]
											* (long) Class11.anIntArrayArray102[1][var12]) >> 16);

								anIntArray118[var3] = var13;
								aClass10_136.method44(var1 + 1);
								++var3;
							}
							break;
						}

						var11 = aClass11_131.method49(0, var4 / 65536.0F);
						var14 = aClass11_131.method49(1, var4 / 65536.0F);
						var15 += 128;
					}
				}
			}

			for (var4 = 0; var4 < var1; ++var4) {
				if (anIntArray118[var4] < -32768)
					anIntArray118[var4] = -32768;

				if (anIntArray118[var4] > 32767)
					anIntArray118[var4] = 32767;
			}

			return anIntArray118;
		}
	}
}
