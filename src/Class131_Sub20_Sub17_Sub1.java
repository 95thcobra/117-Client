public class Class131_Sub20_Sub17_Sub1 extends Class131_Sub20_Sub17 {
	static int anInt1780;
	static int anInt1776;
	static int anInt1779;
	static int anInt1772;
	static int anInt1781;
	static int anInt1785;
	static boolean aBool1769 = false;
	static boolean aBool1768 = false;
	static boolean aBool1775 = false;
	public static boolean aBool1778 = true;
	static int anInt1771 = 0;
	public static int anInt1774 = 512;
	static int[] anIntArray1782 = new int[1024];
	public static int[] anIntArray1783 = new int[65536];
	static int[] anIntArray1767 = new int[512];
	static int[] anIntArray1786 = new int[2048];
	public static int[] anIntArray1787 = new int[2048];
	public static int[] anIntArray1770 = new int[2048];
	static int anInt1777;
	static int anInt1773;
	public static Interface3 anInterface3_1784;

	static final void method930(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, int var6,
			int var7, int var8, int var9, int var10, int var11, final int var12, final int var13, final int var14) {
		if (aBool1775) {
			if (var6 > anInt1777)
				var6 = anInt1777;

			if (var5 < 0)
				var5 = 0;
		}

		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var22 = var6 - var5;
			int var15;
			int var16;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var23;
			if (aBool1769) {
				var15 = var5 - anInt1780;
				var9 += var12 * var15;
				var10 += var13 * var15;
				var11 += var14 * var15;
				var17 = var11 >> 12;
				if (var17 != 0) {
					var20 = var9 / var17;
					var21 = var10 / var17;
				} else {
					var20 = 0;
					var21 = 0;
				}

				var9 += var12 * var22;
				var10 += var13 * var22;
				var11 += var14 * var22;
				var17 = var11 >> 12;
				if (var17 != 0) {
					var23 = var9 / var17;
					var19 = var10 / var17;
				} else {
					var23 = 0;
					var19 = 0;
				}

				var2 = (var20 << 20) + var21;
				var18 = (((var23 - var20) / var22) << 20) + ((var19 - var21) / var22);
				var22 >>= 3;
				var8 <<= 3;
				var16 = var7 >> 8;
				if (aBool1768) {
					if (var22 > 0)
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var7 += var8;
							var16 = var7 >> 8;
							--var22;
						} while (var22 > 0);

					var22 = (var6 - var5) & 7;
					if (var22 > 0)
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							--var22;
						} while (var22 > 0);
				} else {
					if (var22 > 0)
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							var7 += var8;
							var16 = var7 >> 8;
							--var22;
						} while (var22 > 0);

					var22 = (var6 - var5) & 7;
					if (var22 > 0)
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							--var22;
						} while (var22 > 0);
				}
			} else {
				var15 = var5 - anInt1780;
				var9 += var12 * var15;
				var10 += var13 * var15;
				var11 += var14 * var15;
				var17 = var11 >> 14;
				if (var17 != 0) {
					var20 = var9 / var17;
					var21 = var10 / var17;
				} else {
					var20 = 0;
					var21 = 0;
				}

				var9 += var12 * var22;
				var10 += var13 * var22;
				var11 += var14 * var22;
				var17 = var11 >> 14;
				if (var17 != 0) {
					var23 = var9 / var17;
					var19 = var10 / var17;
				} else {
					var23 = 0;
					var19 = 0;
				}

				var2 = (var20 << 18) + var21;
				var18 = (((var23 - var20) / var22) << 18) + ((var19 - var21) / var22);
				var22 >>= 3;
				var8 <<= 3;
				var16 = var7 >> 8;
				if (aBool1768) {
					if (var22 > 0)
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var7 += var8;
							var16 = var7 >> 8;
							--var22;
						} while (var22 > 0);

					var22 = (var6 - var5) & 7;
					if (var22 > 0)
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							--var22;
						} while (var22 > 0);
				} else {
					if (var22 > 0)
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							var7 += var8;
							var16 = var7 >> 8;
							--var22;
						} while (var22 > 0);

					var22 = (var6 - var5) & 7;
					if (var22 > 0)
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							--var22;
						} while (var22 > 0);
				}
			}

		}
	}

	public static final void method931(final int var0, final int var1) {
		final int var2 = anIntArray1782[0];
		final int var3 = var2 / anInt1627;
		final int var4 = var2 - (var3 * anInt1627);
		anInt1780 = var0 - var4;
		anInt1776 = var1 - var3;
		anInt1779 = -anInt1780;
		anInt1772 = anInt1777 - anInt1780;
		anInt1781 = -anInt1776;
		anInt1785 = anInt1773 - anInt1776;
	}

	static final int method932(final int var0, int var1) {
		var1 = (var1 * (var0 & 127)) >> 7;
		if (var1 < 2)
			var1 = 2;
		else if (var1 > 126)
			var1 = 126;

		return (var0 & '\uff80') + var1;
	}

	static final void method933(double var0, final int var2, final int var3) {
		var0 += (Math.random() * 0.03D) - 0.015D;
		int var27 = var2 * 128;

		for (int var12 = var2; var12 < var3; ++var12) {
			final double var7 = ((var12 >> 3) / 64.0D) + 0.0078125D;
			final double var13 = ((var12 & 7) / 8.0D) + 0.0625D;

			for (int var4 = 0; var4 < 128; ++var4) {
				final double var15 = var4 / 128.0D;
				double var17 = var15;
				double var21 = var15;
				double var31 = var15;
				if (var13 != 0.0D) {
					double var23;
					if (var15 < 0.5D)
						var23 = var15 * (1.0D + var13);
					else
						var23 = (var15 + var13) - (var15 * var13);

					final double var19 = (2.0D * var15) - var23;
					double var25 = var7 + 0.3333333333333333D;
					if (var25 > 1.0D)
						--var25;

					double var9 = var7 - 0.3333333333333333D;
					if (var9 < 0.0D)
						++var9;

					if ((6.0D * var25) < 1.0D)
						var17 = var19 + ((var23 - var19) * 6.0D * var25);
					else if ((2.0D * var25) < 1.0D)
						var17 = var23;
					else if ((3.0D * var25) < 2.0D)
						var17 = var19 + ((var23 - var19) * (0.6666666666666666D - var25) * 6.0D);
					else
						var17 = var19;

					if ((6.0D * var7) < 1.0D)
						var21 = var19 + ((var23 - var19) * 6.0D * var7);
					else if ((2.0D * var7) < 1.0D)
						var21 = var23;
					else if ((3.0D * var7) < 2.0D)
						var21 = var19 + ((var23 - var19) * (0.6666666666666666D - var7) * 6.0D);
					else
						var21 = var19;

					if ((6.0D * var9) < 1.0D)
						var31 = var19 + ((var23 - var19) * 6.0D * var9);
					else if ((2.0D * var9) < 1.0D)
						var31 = var23;
					else if ((3.0D * var9) < 2.0D)
						var31 = var19 + ((var23 - var19) * (0.6666666666666666D - var9) * 6.0D);
					else
						var31 = var19;
				}

				final int var28 = (int) (var17 * 256.0D);
				final int var29 = (int) (var21 * 256.0D);
				final int var30 = (int) (var31 * 256.0D);
				int var11 = (var28 << 16) + (var29 << 8) + var30;
				var11 = method941(var11, var0);
				if (var11 == 0)
					var11 = 1;

				anIntArray1783[var27++] = var11;
			}
		}

	}

	public static final void method934() {
		method946(anInt1632, anInt1630, anInt1628, anInt1631);
	}

	static final void method935(final int[] var0, int var1, int var2, int var3, int var4, int var5, int var6,
			int var7) {
		if (aBool1775) {
			if (var5 > anInt1777)
				var5 = anInt1777;

			if (var4 < 0)
				var4 = 0;
		}

		if (var4 < var5) {
			var1 += var4;
			var6 += var7 * var4;
			int var8;
			int var9;
			int var10;
			if (aBool1778) {
				var3 = (var5 - var4) >> 2;
				var7 <<= 2;
				if (anInt1771 == 0) {
					if (var3 > 0)
						do {
							var2 = anIntArray1783[var6 >> 8];
							var6 += var7;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							--var3;
						} while (var3 > 0);

					var3 = (var5 - var4) & 3;
					if (var3 > 0) {
						var2 = anIntArray1783[var6 >> 8];

						do {
							var0[var1++] = var2;
							--var3;
						} while (var3 > 0);
					}
				} else {
					var9 = anInt1771;
					var10 = 256 - anInt1771;
					if (var3 > 0)
						do {
							var2 = anIntArray1783[var6 >> 8];
							var6 += var7;
							var2 = ((((var2 & 16711935) * var10) >> 8) & 16711935)
									+ ((((var2 & '\uff00') * var10) >> 8) & '\uff00');
							var8 = var0[var1];
							var0[var1++] = var2 + ((((var8 & 16711935) * var9) >> 8) & 16711935)
									+ ((((var8 & '\uff00') * var9) >> 8) & '\uff00');
							var8 = var0[var1];
							var0[var1++] = var2 + ((((var8 & 16711935) * var9) >> 8) & 16711935)
									+ ((((var8 & '\uff00') * var9) >> 8) & '\uff00');
							var8 = var0[var1];
							var0[var1++] = var2 + ((((var8 & 16711935) * var9) >> 8) & 16711935)
									+ ((((var8 & '\uff00') * var9) >> 8) & '\uff00');
							var8 = var0[var1];
							var0[var1++] = var2 + ((((var8 & 16711935) * var9) >> 8) & 16711935)
									+ ((((var8 & '\uff00') * var9) >> 8) & '\uff00');
							--var3;
						} while (var3 > 0);

					var3 = (var5 - var4) & 3;
					if (var3 > 0) {
						var2 = anIntArray1783[var6 >> 8];
						var2 = ((((var2 & 16711935) * var10) >> 8) & 16711935)
								+ ((((var2 & '\uff00') * var10) >> 8) & '\uff00');

						do {
							var8 = var0[var1];
							var0[var1++] = var2 + ((((var8 & 16711935) * var9) >> 8) & 16711935)
									+ ((((var8 & '\uff00') * var9) >> 8) & '\uff00');
							--var3;
						} while (var3 > 0);
					}
				}

			} else {
				var3 = var5 - var4;
				if (anInt1771 == 0)
					do {
						var0[var1++] = anIntArray1783[var6 >> 8];
						var6 += var7;
						--var3;
					} while (var3 > 0);
				else {
					var9 = anInt1771;
					var10 = 256 - anInt1771;

					do {
						var2 = anIntArray1783[var6 >> 8];
						var6 += var7;
						var2 = ((((var2 & 16711935) * var10) >> 8) & 16711935)
								+ ((((var2 & '\uff00') * var10) >> 8) & '\uff00');
						var8 = var0[var1];
						var0[var1++] = var2 + ((((var8 & 16711935) * var9) >> 8) & 16711935)
								+ ((((var8 & '\uff00') * var9) >> 8) & '\uff00');
						--var3;
					} while (var3 > 0);
				}

			}
		}
	}

	public static final void method936(int var0, int var1, int var2, int var3, int var4, int var5, final int var6) {
		int var7 = 0;
		if (var1 != var0)
			var7 = ((var4 - var3) << 14) / (var1 - var0);

		int var9 = 0;
		if (var2 != var1)
			var9 = ((var5 - var4) << 14) / (var2 - var1);

		int var8 = 0;
		if (var2 != var0)
			var8 = ((var3 - var5) << 14) / (var0 - var2);

		if ((var0 <= var1) && (var0 <= var2)) {
			if (var0 < anInt1773) {
				if (var1 > anInt1773)
					var1 = anInt1773;

				if (var2 > anInt1773)
					var2 = anInt1773;

				if (var1 < var2) {
					var5 = var3 <<= 14;
					if (var0 < 0) {
						var5 -= var8 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var9 * var1;
						var1 = 0;
					}

					if (((var0 != var1) && (var8 < var7)) || ((var0 == var1) && (var8 > var9))) {
						var2 -= var1;
						var1 -= var0;
						var0 = anIntArray1782[var0];

						while (true) {
							--var1;
							if (var1 < 0)
								while (true) {
									--var2;
									if (var2 < 0)
										return;

									method937(anIntArray1629, var0, var6, 0, var5 >> 14, var4 >> 14);
									var5 += var8;
									var4 += var9;
									var0 += anInt1627;
								}

							method937(anIntArray1629, var0, var6, 0, var5 >> 14, var3 >> 14);
							var5 += var8;
							var3 += var7;
							var0 += anInt1627;
						}
					} else {
						var2 -= var1;
						var1 -= var0;
						var0 = anIntArray1782[var0];

						while (true) {
							--var1;
							if (var1 < 0)
								while (true) {
									--var2;
									if (var2 < 0)
										return;

									method937(anIntArray1629, var0, var6, 0, var4 >> 14, var5 >> 14);
									var5 += var8;
									var4 += var9;
									var0 += anInt1627;
								}

							method937(anIntArray1629, var0, var6, 0, var3 >> 14, var5 >> 14);
							var5 += var8;
							var3 += var7;
							var0 += anInt1627;
						}
					}
				} else {
					var4 = var3 <<= 14;
					if (var0 < 0) {
						var4 -= var8 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}

					var5 <<= 14;
					if (var2 < 0) {
						var5 -= var9 * var2;
						var2 = 0;
					}

					if (((var0 != var2) && (var8 < var7)) || ((var0 == var2) && (var9 > var7))) {
						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray1782[var0];

						while (true) {
							--var2;
							if (var2 < 0)
								while (true) {
									--var1;
									if (var1 < 0)
										return;

									method937(anIntArray1629, var0, var6, 0, var5 >> 14, var3 >> 14);
									var5 += var9;
									var3 += var7;
									var0 += anInt1627;
								}

							method937(anIntArray1629, var0, var6, 0, var4 >> 14, var3 >> 14);
							var4 += var8;
							var3 += var7;
							var0 += anInt1627;
						}
					} else {
						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray1782[var0];

						while (true) {
							--var2;
							if (var2 < 0)
								while (true) {
									--var1;
									if (var1 < 0)
										return;

									method937(anIntArray1629, var0, var6, 0, var3 >> 14, var5 >> 14);
									var5 += var9;
									var3 += var7;
									var0 += anInt1627;
								}

							method937(anIntArray1629, var0, var6, 0, var3 >> 14, var4 >> 14);
							var4 += var8;
							var3 += var7;
							var0 += anInt1627;
						}
					}
				}
			}
		} else if (var1 <= var2) {
			if (var1 < anInt1773) {
				if (var2 > anInt1773)
					var2 = anInt1773;

				if (var0 > anInt1773)
					var0 = anInt1773;

				if (var2 < var0) {
					var3 = var4 <<= 14;
					if (var1 < 0) {
						var3 -= var7 * var1;
						var4 -= var9 * var1;
						var1 = 0;
					}

					var5 <<= 14;
					if (var2 < 0) {
						var5 -= var8 * var2;
						var2 = 0;
					}

					if (((var1 != var2) && (var7 < var9)) || ((var1 == var2) && (var7 > var8))) {
						var0 -= var2;
						var2 -= var1;
						var1 = anIntArray1782[var1];

						while (true) {
							--var2;
							if (var2 < 0)
								while (true) {
									--var0;
									if (var0 < 0)
										return;

									method937(anIntArray1629, var1, var6, 0, var3 >> 14, var5 >> 14);
									var3 += var7;
									var5 += var8;
									var1 += anInt1627;
								}

							method937(anIntArray1629, var1, var6, 0, var3 >> 14, var4 >> 14);
							var3 += var7;
							var4 += var9;
							var1 += anInt1627;
						}
					} else {
						var0 -= var2;
						var2 -= var1;
						var1 = anIntArray1782[var1];

						while (true) {
							--var2;
							if (var2 < 0)
								while (true) {
									--var0;
									if (var0 < 0)
										return;

									method937(anIntArray1629, var1, var6, 0, var5 >> 14, var3 >> 14);
									var3 += var7;
									var5 += var8;
									var1 += anInt1627;
								}

							method937(anIntArray1629, var1, var6, 0, var4 >> 14, var3 >> 14);
							var3 += var7;
							var4 += var9;
							var1 += anInt1627;
						}
					}
				} else {
					var5 = var4 <<= 14;
					if (var1 < 0) {
						var5 -= var7 * var1;
						var4 -= var9 * var1;
						var1 = 0;
					}

					var3 <<= 14;
					if (var0 < 0) {
						var3 -= var8 * var0;
						var0 = 0;
					}

					if (var7 < var9) {
						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray1782[var1];

						while (true) {
							--var0;
							if (var0 < 0)
								while (true) {
									--var2;
									if (var2 < 0)
										return;

									method937(anIntArray1629, var1, var6, 0, var3 >> 14, var4 >> 14);
									var3 += var8;
									var4 += var9;
									var1 += anInt1627;
								}

							method937(anIntArray1629, var1, var6, 0, var5 >> 14, var4 >> 14);
							var5 += var7;
							var4 += var9;
							var1 += anInt1627;
						}
					} else {
						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray1782[var1];

						while (true) {
							--var0;
							if (var0 < 0)
								while (true) {
									--var2;
									if (var2 < 0)
										return;

									method937(anIntArray1629, var1, var6, 0, var4 >> 14, var3 >> 14);
									var3 += var8;
									var4 += var9;
									var1 += anInt1627;
								}

							method937(anIntArray1629, var1, var6, 0, var4 >> 14, var5 >> 14);
							var5 += var7;
							var4 += var9;
							var1 += anInt1627;
						}
					}
				}
			}
		} else if (var2 < anInt1773) {
			if (var0 > anInt1773)
				var0 = anInt1773;

			if (var1 > anInt1773)
				var1 = anInt1773;

			if (var0 < var1) {
				var4 = var5 <<= 14;
				if (var2 < 0) {
					var4 -= var9 * var2;
					var5 -= var8 * var2;
					var2 = 0;
				}

				var3 <<= 14;
				if (var0 < 0) {
					var3 -= var7 * var0;
					var0 = 0;
				}

				if (var9 < var8) {
					var1 -= var0;
					var0 -= var2;
					var2 = anIntArray1782[var2];

					while (true) {
						--var0;
						if (var0 < 0)
							while (true) {
								--var1;
								if (var1 < 0)
									return;

								method937(anIntArray1629, var2, var6, 0, var4 >> 14, var3 >> 14);
								var4 += var9;
								var3 += var7;
								var2 += anInt1627;
							}

						method937(anIntArray1629, var2, var6, 0, var4 >> 14, var5 >> 14);
						var4 += var9;
						var5 += var8;
						var2 += anInt1627;
					}
				} else {
					var1 -= var0;
					var0 -= var2;
					var2 = anIntArray1782[var2];

					while (true) {
						--var0;
						if (var0 < 0)
							while (true) {
								--var1;
								if (var1 < 0)
									return;

								method937(anIntArray1629, var2, var6, 0, var3 >> 14, var4 >> 14);
								var4 += var9;
								var3 += var7;
								var2 += anInt1627;
							}

						method937(anIntArray1629, var2, var6, 0, var5 >> 14, var4 >> 14);
						var4 += var9;
						var5 += var8;
						var2 += anInt1627;
					}
				}
			} else {
				var3 = var5 <<= 14;
				if (var2 < 0) {
					var3 -= var9 * var2;
					var5 -= var8 * var2;
					var2 = 0;
				}

				var4 <<= 14;
				if (var1 < 0) {
					var4 -= var7 * var1;
					var1 = 0;
				}

				if (var9 < var8) {
					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray1782[var2];

					while (true) {
						--var1;
						if (var1 < 0)
							while (true) {
								--var0;
								if (var0 < 0)
									return;

								method937(anIntArray1629, var2, var6, 0, var4 >> 14, var5 >> 14);
								var4 += var7;
								var5 += var8;
								var2 += anInt1627;
							}

						method937(anIntArray1629, var2, var6, 0, var3 >> 14, var5 >> 14);
						var3 += var9;
						var5 += var8;
						var2 += anInt1627;
					}
				} else {
					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray1782[var2];

					while (true) {
						--var1;
						if (var1 < 0)
							while (true) {
								--var0;
								if (var0 < 0)
									return;

								method937(anIntArray1629, var2, var6, 0, var5 >> 14, var4 >> 14);
								var4 += var7;
								var5 += var8;
								var2 += anInt1627;
							}

						method937(anIntArray1629, var2, var6, 0, var5 >> 14, var3 >> 14);
						var3 += var9;
						var5 += var8;
						var2 += anInt1627;
					}
				}
			}
		}
	}

	static final void method937(final int[] var0, int var1, int var2, int var3, int var4, int var5) {
		if (aBool1775) {
			if (var5 > anInt1777)
				var5 = anInt1777;

			if (var4 < 0)
				var4 = 0;
		}

		if (var4 < var5) {
			var1 += var4;
			var3 = (var5 - var4) >> 2;
			if (anInt1771 != 0) {
				if (anInt1771 == 254)
					while (true) {
						--var3;
						if (var3 < 0) {
							var3 = (var5 - var4) & 3;

							while (true) {
								--var3;
								if (var3 < 0)
									return;

								var0[var1++] = var0[var1];
							}
						}

						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
					}
				else {
					final int var7 = anInt1771;
					final int var8 = 256 - anInt1771;
					var2 = ((((var2 & 16711935) * var8) >> 8) & 16711935)
							+ ((((var2 & '\uff00') * var8) >> 8) & '\uff00');

					while (true) {
						--var3;
						int var6;
						if (var3 < 0) {
							var3 = (var5 - var4) & 3;

							while (true) {
								--var3;
								if (var3 < 0)
									return;

								var6 = var0[var1];
								var0[var1++] = var2 + ((((var6 & 16711935) * var7) >> 8) & 16711935)
										+ ((((var6 & '\uff00') * var7) >> 8) & '\uff00');
							}
						}

						var6 = var0[var1];
						var0[var1++] = var2 + ((((var6 & 16711935) * var7) >> 8) & 16711935)
								+ ((((var6 & '\uff00') * var7) >> 8) & '\uff00');
						var6 = var0[var1];
						var0[var1++] = var2 + ((((var6 & 16711935) * var7) >> 8) & 16711935)
								+ ((((var6 & '\uff00') * var7) >> 8) & '\uff00');
						var6 = var0[var1];
						var0[var1++] = var2 + ((((var6 & 16711935) * var7) >> 8) & 16711935)
								+ ((((var6 & '\uff00') * var7) >> 8) & '\uff00');
						var6 = var0[var1];
						var0[var1++] = var2 + ((((var6 & 16711935) * var7) >> 8) & 16711935)
								+ ((((var6 & '\uff00') * var7) >> 8) & '\uff00');
					}
				}
			} else
				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = (var5 - var4) & 3;

						while (true) {
							--var3;
							if (var3 < 0)
								return;

							var0[var1++] = var2;
						}
					}

					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
				}
		}
	}

	static final void method938(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, final int var9, int var10, int var11, final int var12, int var13, int var14, final int var15,
			int var16, int var17, final int var18) {
		final int[] var19 = anInterface3_1784.method10(var18, 2119212419);
		int var31;
		if (var19 == null) {
			var31 = anInterface3_1784.method7(var18, 1882836254);
			method943(var0, var1, var2, var3, var4, var5, method932(var31, var6), method932(var31, var7),
					method932(var31, var8));
		} else {
			aBool1769 = anInterface3_1784.method9(var18, (byte) 7);
			aBool1768 = anInterface3_1784.method8(var18, 399308164);
			var31 = var4 - var3;
			final int var32 = var1 - var0;
			final int var25 = var5 - var3;
			final int var26 = var2 - var0;
			final int var34 = var7 - var6;
			final int var27 = var8 - var6;
			int var30 = 0;
			if (var1 != var0)
				var30 = ((var4 - var3) << 14) / (var1 - var0);

			int var29 = 0;
			if (var2 != var1)
				var29 = ((var5 - var4) << 14) / (var2 - var1);

			int var23 = 0;
			if (var2 != var0)
				var23 = ((var3 - var5) << 14) / (var0 - var2);

			final int var33 = (var31 * var26) - (var25 * var32);
			if (var33 != 0) {
				final int var35 = (((var34 * var26) - (var27 * var32)) << 9) / var33;
				final int var36 = (((var27 * var31) - (var34 * var25)) << 9) / var33;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var38 = ((var11 * var12) - (var14 * var9)) << 14;
				final int var24 = (int) (((long) ((var14 * var15) - (var17 * var12)) << 3 << 14) / anInt1774);
				final int var41 = (int) (((long) ((var17 * var9) - (var11 * var15)) << 14) / anInt1774);
				int var28 = ((var10 * var12) - (var13 * var9)) << 14;
				final int var39 = (int) (((long) ((var13 * var15) - (var16 * var12)) << 3 << 14) / anInt1774);
				final int var37 = (int) (((long) ((var16 * var9) - (var10 * var15)) << 14) / anInt1774);
				int var20 = ((var13 * var11) - (var10 * var14)) << 14;
				final int var40 = (int) (((long) ((var16 * var14) - (var13 * var17)) << 3 << 14) / anInt1774);
				final int var21 = (int) (((long) ((var10 * var17) - (var16 * var11)) << 14) / anInt1774);
				int var22;
				if ((var0 <= var1) && (var0 <= var2)) {
					if (var0 < anInt1773) {
						if (var1 > anInt1773)
							var1 = anInt1773;

						if (var2 > anInt1773)
							var2 = anInt1773;

						var6 = ((var6 << 9) - (var35 * var3)) + var35;
						if (var1 < var2) {
							var5 = var3 <<= 14;
							if (var0 < 0) {
								var5 -= var23 * var0;
								var3 -= var30 * var0;
								var6 -= var36 * var0;
								var0 = 0;
							}

							var4 <<= 14;
							if (var1 < 0) {
								var4 -= var29 * var1;
								var1 = 0;
							}

							var22 = var0 - anInt1776;
							var38 += var41 * var22;
							var28 += var37 * var22;
							var20 += var21 * var22;
							if (((var0 == var1) || (var23 >= var30)) && ((var0 != var1) || (var23 <= var29))) {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray1782[var0];

								while (true) {
									--var1;
									if (var1 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method939(anIntArray1629, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6,
													var35, var38, var28, var20, var24, var39, var40);
											var5 += var23;
											var4 += var29;
											var6 += var36;
											var0 += anInt1627;
											var38 += var41;
											var28 += var37;
											var20 += var21;
										}

									method939(anIntArray1629, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var35,
											var38, var28, var20, var24, var39, var40);
									var5 += var23;
									var3 += var30;
									var6 += var36;
									var0 += anInt1627;
									var38 += var41;
									var28 += var37;
									var20 += var21;
								}
							} else {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray1782[var0];

								while (true) {
									--var1;
									if (var1 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method939(anIntArray1629, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6,
													var35, var38, var28, var20, var24, var39, var40);
											var5 += var23;
											var4 += var29;
											var6 += var36;
											var0 += anInt1627;
											var38 += var41;
											var28 += var37;
											var20 += var21;
										}

									method939(anIntArray1629, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var35,
											var38, var28, var20, var24, var39, var40);
									var5 += var23;
									var3 += var30;
									var6 += var36;
									var0 += anInt1627;
									var38 += var41;
									var28 += var37;
									var20 += var21;
								}
							}
						} else {
							var4 = var3 <<= 14;
							if (var0 < 0) {
								var4 -= var23 * var0;
								var3 -= var30 * var0;
								var6 -= var36 * var0;
								var0 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var29 * var2;
								var2 = 0;
							}

							var22 = var0 - anInt1776;
							var38 += var41 * var22;
							var28 += var37 * var22;
							var20 += var21 * var22;
							if (((var0 != var2) && (var23 < var30)) || ((var0 == var2) && (var29 > var30))) {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray1782[var0];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var1;
											if (var1 < 0)
												return;

											method939(anIntArray1629, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6,
													var35, var38, var28, var20, var24, var39, var40);
											var5 += var29;
											var3 += var30;
											var6 += var36;
											var0 += anInt1627;
											var38 += var41;
											var28 += var37;
											var20 += var21;
										}

									method939(anIntArray1629, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var35,
											var38, var28, var20, var24, var39, var40);
									var4 += var23;
									var3 += var30;
									var6 += var36;
									var0 += anInt1627;
									var38 += var41;
									var28 += var37;
									var20 += var21;
								}
							} else {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray1782[var0];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var1;
											if (var1 < 0)
												return;

											method939(anIntArray1629, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6,
													var35, var38, var28, var20, var24, var39, var40);
											var5 += var29;
											var3 += var30;
											var6 += var36;
											var0 += anInt1627;
											var38 += var41;
											var28 += var37;
											var20 += var21;
										}

									method939(anIntArray1629, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var35,
											var38, var28, var20, var24, var39, var40);
									var4 += var23;
									var3 += var30;
									var6 += var36;
									var0 += anInt1627;
									var38 += var41;
									var28 += var37;
									var20 += var21;
								}
							}
						}
					}
				} else if (var1 <= var2) {
					if (var1 < anInt1773) {
						if (var2 > anInt1773)
							var2 = anInt1773;

						if (var0 > anInt1773)
							var0 = anInt1773;

						var7 = ((var7 << 9) - (var35 * var4)) + var35;
						if (var2 < var0) {
							var3 = var4 <<= 14;
							if (var1 < 0) {
								var3 -= var30 * var1;
								var4 -= var29 * var1;
								var7 -= var36 * var1;
								var1 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var23 * var2;
								var2 = 0;
							}

							var22 = var1 - anInt1776;
							var38 += var41 * var22;
							var28 += var37 * var22;
							var20 += var21 * var22;
							if (((var1 == var2) || (var30 >= var29)) && ((var1 != var2) || (var30 <= var23))) {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray1782[var1];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var0;
											if (var0 < 0)
												return;

											method939(anIntArray1629, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7,
													var35, var38, var28, var20, var24, var39, var40);
											var3 += var30;
											var5 += var23;
											var7 += var36;
											var1 += anInt1627;
											var38 += var41;
											var28 += var37;
											var20 += var21;
										}

									method939(anIntArray1629, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var35,
											var38, var28, var20, var24, var39, var40);
									var3 += var30;
									var4 += var29;
									var7 += var36;
									var1 += anInt1627;
									var38 += var41;
									var28 += var37;
									var20 += var21;
								}
							} else {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray1782[var1];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var0;
											if (var0 < 0)
												return;

											method939(anIntArray1629, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7,
													var35, var38, var28, var20, var24, var39, var40);
											var3 += var30;
											var5 += var23;
											var7 += var36;
											var1 += anInt1627;
											var38 += var41;
											var28 += var37;
											var20 += var21;
										}

									method939(anIntArray1629, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var35,
											var38, var28, var20, var24, var39, var40);
									var3 += var30;
									var4 += var29;
									var7 += var36;
									var1 += anInt1627;
									var38 += var41;
									var28 += var37;
									var20 += var21;
								}
							}
						} else {
							var5 = var4 <<= 14;
							if (var1 < 0) {
								var5 -= var30 * var1;
								var4 -= var29 * var1;
								var7 -= var36 * var1;
								var1 = 0;
							}

							var3 <<= 14;
							if (var0 < 0) {
								var3 -= var23 * var0;
								var0 = 0;
							}

							var22 = var1 - anInt1776;
							var38 += var41 * var22;
							var28 += var37 * var22;
							var20 += var21 * var22;
							if (var30 < var29) {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray1782[var1];

								while (true) {
									--var0;
									if (var0 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method939(anIntArray1629, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7,
													var35, var38, var28, var20, var24, var39, var40);
											var3 += var23;
											var4 += var29;
											var7 += var36;
											var1 += anInt1627;
											var38 += var41;
											var28 += var37;
											var20 += var21;
										}

									method939(anIntArray1629, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var35,
											var38, var28, var20, var24, var39, var40);
									var5 += var30;
									var4 += var29;
									var7 += var36;
									var1 += anInt1627;
									var38 += var41;
									var28 += var37;
									var20 += var21;
								}
							} else {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray1782[var1];

								while (true) {
									--var0;
									if (var0 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method939(anIntArray1629, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7,
													var35, var38, var28, var20, var24, var39, var40);
											var3 += var23;
											var4 += var29;
											var7 += var36;
											var1 += anInt1627;
											var38 += var41;
											var28 += var37;
											var20 += var21;
										}

									method939(anIntArray1629, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var35,
											var38, var28, var20, var24, var39, var40);
									var5 += var30;
									var4 += var29;
									var7 += var36;
									var1 += anInt1627;
									var38 += var41;
									var28 += var37;
									var20 += var21;
								}
							}
						}
					}
				} else if (var2 < anInt1773) {
					if (var0 > anInt1773)
						var0 = anInt1773;

					if (var1 > anInt1773)
						var1 = anInt1773;

					var8 = ((var8 << 9) - (var35 * var5)) + var35;
					if (var0 < var1) {
						var4 = var5 <<= 14;
						if (var2 < 0) {
							var4 -= var29 * var2;
							var5 -= var23 * var2;
							var8 -= var36 * var2;
							var2 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var30 * var0;
							var0 = 0;
						}

						var22 = var2 - anInt1776;
						var38 += var41 * var22;
						var28 += var37 * var22;
						var20 += var21 * var22;
						if (var29 < var23) {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray1782[var2];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method939(anIntArray1629, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8,
												var35, var38, var28, var20, var24, var39, var40);
										var4 += var29;
										var3 += var30;
										var8 += var36;
										var2 += anInt1627;
										var38 += var41;
										var28 += var37;
										var20 += var21;
									}

								method939(anIntArray1629, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var35, var38,
										var28, var20, var24, var39, var40);
								var4 += var29;
								var5 += var23;
								var8 += var36;
								var2 += anInt1627;
								var38 += var41;
								var28 += var37;
								var20 += var21;
							}
						} else {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray1782[var2];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method939(anIntArray1629, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8,
												var35, var38, var28, var20, var24, var39, var40);
										var4 += var29;
										var3 += var30;
										var8 += var36;
										var2 += anInt1627;
										var38 += var41;
										var28 += var37;
										var20 += var21;
									}

								method939(anIntArray1629, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var35, var38,
										var28, var20, var24, var39, var40);
								var4 += var29;
								var5 += var23;
								var8 += var36;
								var2 += anInt1627;
								var38 += var41;
								var28 += var37;
								var20 += var21;
							}
						}
					} else {
						var3 = var5 <<= 14;
						if (var2 < 0) {
							var3 -= var29 * var2;
							var5 -= var23 * var2;
							var8 -= var36 * var2;
							var2 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var30 * var1;
							var1 = 0;
						}

						var22 = var2 - anInt1776;
						var38 += var41 * var22;
						var28 += var37 * var22;
						var20 += var21 * var22;
						if (var29 < var23) {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray1782[var2];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method939(anIntArray1629, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8,
												var35, var38, var28, var20, var24, var39, var40);
										var4 += var30;
										var5 += var23;
										var8 += var36;
										var2 += anInt1627;
										var38 += var41;
										var28 += var37;
										var20 += var21;
									}

								method939(anIntArray1629, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var35, var38,
										var28, var20, var24, var39, var40);
								var3 += var29;
								var5 += var23;
								var8 += var36;
								var2 += anInt1627;
								var38 += var41;
								var28 += var37;
								var20 += var21;
							}
						} else {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray1782[var2];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method939(anIntArray1629, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8,
												var35, var38, var28, var20, var24, var39, var40);
										var4 += var30;
										var5 += var23;
										var8 += var36;
										var2 += anInt1627;
										var38 += var41;
										var28 += var37;
										var20 += var21;
									}

								method939(anIntArray1629, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var35, var38,
										var28, var20, var24, var39, var40);
								var3 += var29;
								var5 += var23;
								var8 += var36;
								var2 += anInt1627;
								var38 += var41;
								var28 += var37;
								var20 += var21;
							}
						}
					}
				}
			}
		}
	}

	static final void method939(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, int var6,
			int var7, int var8, int var9, int var10, int var11, final int var12, final int var13, final int var14) {
		if (aBool1775) {
			if (var6 > anInt1777)
				var6 = anInt1777;

			if (var5 < 0)
				var5 = 0;
		}

		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var17 = var6 - var5;
			int var15;
			int var16;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (aBool1769) {
				var19 = var5 - anInt1780;
				var9 += (var12 >> 3) * var19;
				var10 += (var13 >> 3) * var19;
				var11 += (var14 >> 3) * var19;
				var16 = var11 >> 12;
				if (var16 != 0) {
					var21 = var9 / var16;
					var20 = var10 / var16;
					if (var21 < 0)
						var21 = 0;
					else if (var21 > 4032)
						var21 = 4032;
				} else {
					var21 = 0;
					var20 = 0;
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var16 = var11 >> 12;
				if (var16 != 0) {
					var18 = var9 / var16;
					var22 = var10 / var16;
					if (var18 < 0)
						var18 = 0;
					else if (var18 > 4032)
						var18 = 4032;
				} else {
					var18 = 0;
					var22 = 0;
				}

				var2 = (var21 << 20) + var20;
				var15 = (((var18 - var21) >> 3) << 20) + ((var22 - var20) >> 3);
				var17 >>= 3;
				var8 <<= 3;
				var23 = var7 >> 8;
				if (aBool1768) {
					if (var17 > 0)
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var21 = var18;
							var20 = var22;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var16 = var11 >> 12;
							if (var16 != 0) {
								var18 = var9 / var16;
								var22 = var10 / var16;
								if (var18 < 0)
									var18 = 0;
								else if (var18 > 4032)
									var18 = 4032;
							} else {
								var18 = 0;
								var22 = 0;
							}

							var2 = (var21 << 20) + var20;
							var15 = (((var18 - var21) >> 3) << 20) + ((var22 - var20) >> 3);
							var7 += var8;
							var23 = var7 >> 8;
							--var17;
						} while (var17 > 0);

					var17 = (var6 - var5) & 7;
					if (var17 > 0)
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var15;
							--var17;
						} while (var17 > 0);
				} else {
					if (var17 > 0)
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var21 = var18;
							var20 = var22;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var16 = var11 >> 12;
							if (var16 != 0) {
								var18 = var9 / var16;
								var22 = var10 / var16;
								if (var18 < 0)
									var18 = 0;
								else if (var18 > 4032)
									var18 = 4032;
							} else {
								var18 = 0;
								var22 = 0;
							}

							var2 = (var21 << 20) + var20;
							var15 = (((var18 - var21) >> 3) << 20) + ((var22 - var20) >> 3);
							var7 += var8;
							var23 = var7 >> 8;
							--var17;
						} while (var17 > 0);

					var17 = (var6 - var5) & 7;
					if (var17 > 0)
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var15;
							--var17;
						} while (var17 > 0);
				}
			} else {
				var19 = var5 - anInt1780;
				var9 += (var12 >> 3) * var19;
				var10 += (var13 >> 3) * var19;
				var11 += (var14 >> 3) * var19;
				var16 = var11 >> 14;
				if (var16 != 0) {
					var21 = var9 / var16;
					var20 = var10 / var16;
					if (var21 < 0)
						var21 = 0;
					else if (var21 > 16256)
						var21 = 16256;
				} else {
					var21 = 0;
					var20 = 0;
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var16 = var11 >> 14;
				if (var16 != 0) {
					var18 = var9 / var16;
					var22 = var10 / var16;
					if (var18 < 0)
						var18 = 0;
					else if (var18 > 16256)
						var18 = 16256;
				} else {
					var18 = 0;
					var22 = 0;
				}

				var2 = (var21 << 18) + var20;
				var15 = (((var18 - var21) >> 3) << 18) + ((var22 - var20) >> 3);
				var17 >>= 3;
				var8 <<= 3;
				var23 = var7 >> 8;
				if (aBool1768) {
					if (var17 > 0)
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var21 = var18;
							var20 = var22;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var16 = var11 >> 14;
							if (var16 != 0) {
								var18 = var9 / var16;
								var22 = var10 / var16;
								if (var18 < 0)
									var18 = 0;
								else if (var18 > 16256)
									var18 = 16256;
							} else {
								var18 = 0;
								var22 = 0;
							}

							var2 = (var21 << 18) + var20;
							var15 = (((var18 - var21) >> 3) << 18) + ((var22 - var20) >> 3);
							var7 += var8;
							var23 = var7 >> 8;
							--var17;
						} while (var17 > 0);

					var17 = (var6 - var5) & 7;
					if (var17 > 0)
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var15;
							--var17;
						} while (var17 > 0);
				} else {
					if (var17 > 0)
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var21 = var18;
							var20 = var22;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var16 = var11 >> 14;
							if (var16 != 0) {
								var18 = var9 / var16;
								var22 = var10 / var16;
								if (var18 < 0)
									var18 = 0;
								else if (var18 > 16256)
									var18 = 16256;
							} else {
								var18 = 0;
								var22 = 0;
							}

							var2 = (var21 << 18) + var20;
							var15 = (((var18 - var21) >> 3) << 18) + ((var22 - var20) >> 3);
							var7 += var8;
							var23 = var7 >> 8;
							--var17;
						} while (var17 > 0);

					var17 = (var6 - var5) & 7;
					if (var17 > 0)
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var15;
							--var17;
						} while (var17 > 0);
				}
			}

		}
	}

	static final void method940(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, final int var9, int var10, int var11, final int var12, int var13, int var14, final int var15,
			int var16, int var17, final int var18) {
		final int[] var19 = anInterface3_1784.method10(var18, 1968621716);
		int var21;
		if (var19 == null) {
			var21 = anInterface3_1784.method7(var18, 1882836254);
			method943(var0, var1, var2, var3, var4, var5, method932(var21, var6), method932(var21, var7),
					method932(var21, var8));
		} else {
			aBool1769 = anInterface3_1784.method9(var18, (byte) -37);
			aBool1768 = anInterface3_1784.method8(var18, 1565351386);
			var21 = var4 - var3;
			final int var22 = var1 - var0;
			final int var23 = var5 - var3;
			final int var24 = var2 - var0;
			final int var25 = var7 - var6;
			final int var26 = var8 - var6;
			int var27 = 0;
			if (var1 != var0)
				var27 = ((var4 - var3) << 14) / (var1 - var0);

			int var31 = 0;
			if (var2 != var1)
				var31 = ((var5 - var4) << 14) / (var2 - var1);

			int var39 = 0;
			if (var2 != var0)
				var39 = ((var3 - var5) << 14) / (var0 - var2);

			final int var30 = (var21 * var24) - (var23 * var22);
			if (var30 != 0) {
				final int var37 = (((var25 * var24) - (var26 * var22)) << 9) / var30;
				final int var20 = (((var26 * var21) - (var25 * var23)) << 9) / var30;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var28 = ((var11 * var12) - (var14 * var9)) << 14;
				final int var32 = (int) (((long) ((var14 * var15) - (var17 * var12)) << 14) / anInt1774);
				final int var29 = (int) (((long) ((var17 * var9) - (var11 * var15)) << 14) / anInt1774);
				int var38 = ((var10 * var12) - (var13 * var9)) << 14;
				final int var33 = (int) (((long) ((var13 * var15) - (var16 * var12)) << 14) / anInt1774);
				final int var34 = (int) (((long) ((var16 * var9) - (var10 * var15)) << 14) / anInt1774);
				int var35 = ((var13 * var11) - (var10 * var14)) << 14;
				final int var36 = (int) (((long) ((var16 * var14) - (var13 * var17)) << 14) / anInt1774);
				final int var41 = (int) (((long) ((var10 * var17) - (var16 * var11)) << 14) / anInt1774);
				int var40;
				if ((var0 <= var1) && (var0 <= var2)) {
					if (var0 < anInt1773) {
						if (var1 > anInt1773)
							var1 = anInt1773;

						if (var2 > anInt1773)
							var2 = anInt1773;

						var6 = ((var6 << 9) - (var37 * var3)) + var37;
						if (var1 < var2) {
							var5 = var3 <<= 14;
							if (var0 < 0) {
								var5 -= var39 * var0;
								var3 -= var27 * var0;
								var6 -= var20 * var0;
								var0 = 0;
							}

							var4 <<= 14;
							if (var1 < 0) {
								var4 -= var31 * var1;
								var1 = 0;
							}

							var40 = var0 - anInt1776;
							var28 += var29 * var40;
							var38 += var34 * var40;
							var35 += var41 * var40;
							if (((var0 != var1) && (var39 < var27)) || ((var0 == var1) && (var39 > var31))) {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray1782[var0];

								while (true) {
									--var1;
									if (var1 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method930(anIntArray1629, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6,
													var37, var28, var38, var35, var32, var33, var36);
											var5 += var39;
											var4 += var31;
											var6 += var20;
											var0 += anInt1627;
											var28 += var29;
											var38 += var34;
											var35 += var41;
										}

									method930(anIntArray1629, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var37,
											var28, var38, var35, var32, var33, var36);
									var5 += var39;
									var3 += var27;
									var6 += var20;
									var0 += anInt1627;
									var28 += var29;
									var38 += var34;
									var35 += var41;
								}
							} else {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray1782[var0];

								while (true) {
									--var1;
									if (var1 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method930(anIntArray1629, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6,
													var37, var28, var38, var35, var32, var33, var36);
											var5 += var39;
											var4 += var31;
											var6 += var20;
											var0 += anInt1627;
											var28 += var29;
											var38 += var34;
											var35 += var41;
										}

									method930(anIntArray1629, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var37,
											var28, var38, var35, var32, var33, var36);
									var5 += var39;
									var3 += var27;
									var6 += var20;
									var0 += anInt1627;
									var28 += var29;
									var38 += var34;
									var35 += var41;
								}
							}
						} else {
							var4 = var3 <<= 14;
							if (var0 < 0) {
								var4 -= var39 * var0;
								var3 -= var27 * var0;
								var6 -= var20 * var0;
								var0 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var31 * var2;
								var2 = 0;
							}

							var40 = var0 - anInt1776;
							var28 += var29 * var40;
							var38 += var34 * var40;
							var35 += var41 * var40;
							if (((var0 != var2) && (var39 < var27)) || ((var0 == var2) && (var31 > var27))) {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray1782[var0];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var1;
											if (var1 < 0)
												return;

											method930(anIntArray1629, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6,
													var37, var28, var38, var35, var32, var33, var36);
											var5 += var31;
											var3 += var27;
											var6 += var20;
											var0 += anInt1627;
											var28 += var29;
											var38 += var34;
											var35 += var41;
										}

									method930(anIntArray1629, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var37,
											var28, var38, var35, var32, var33, var36);
									var4 += var39;
									var3 += var27;
									var6 += var20;
									var0 += anInt1627;
									var28 += var29;
									var38 += var34;
									var35 += var41;
								}
							} else {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray1782[var0];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var1;
											if (var1 < 0)
												return;

											method930(anIntArray1629, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6,
													var37, var28, var38, var35, var32, var33, var36);
											var5 += var31;
											var3 += var27;
											var6 += var20;
											var0 += anInt1627;
											var28 += var29;
											var38 += var34;
											var35 += var41;
										}

									method930(anIntArray1629, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var37,
											var28, var38, var35, var32, var33, var36);
									var4 += var39;
									var3 += var27;
									var6 += var20;
									var0 += anInt1627;
									var28 += var29;
									var38 += var34;
									var35 += var41;
								}
							}
						}
					}
				} else if (var1 <= var2) {
					if (var1 < anInt1773) {
						if (var2 > anInt1773)
							var2 = anInt1773;

						if (var0 > anInt1773)
							var0 = anInt1773;

						var7 = ((var7 << 9) - (var37 * var4)) + var37;
						if (var2 < var0) {
							var3 = var4 <<= 14;
							if (var1 < 0) {
								var3 -= var27 * var1;
								var4 -= var31 * var1;
								var7 -= var20 * var1;
								var1 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var39 * var2;
								var2 = 0;
							}

							var40 = var1 - anInt1776;
							var28 += var29 * var40;
							var38 += var34 * var40;
							var35 += var41 * var40;
							if (((var1 != var2) && (var27 < var31)) || ((var1 == var2) && (var27 > var39))) {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray1782[var1];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var0;
											if (var0 < 0)
												return;

											method930(anIntArray1629, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7,
													var37, var28, var38, var35, var32, var33, var36);
											var3 += var27;
											var5 += var39;
											var7 += var20;
											var1 += anInt1627;
											var28 += var29;
											var38 += var34;
											var35 += var41;
										}

									method930(anIntArray1629, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var37,
											var28, var38, var35, var32, var33, var36);
									var3 += var27;
									var4 += var31;
									var7 += var20;
									var1 += anInt1627;
									var28 += var29;
									var38 += var34;
									var35 += var41;
								}
							} else {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray1782[var1];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var0;
											if (var0 < 0)
												return;

											method930(anIntArray1629, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7,
													var37, var28, var38, var35, var32, var33, var36);
											var3 += var27;
											var5 += var39;
											var7 += var20;
											var1 += anInt1627;
											var28 += var29;
											var38 += var34;
											var35 += var41;
										}

									method930(anIntArray1629, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var37,
											var28, var38, var35, var32, var33, var36);
									var3 += var27;
									var4 += var31;
									var7 += var20;
									var1 += anInt1627;
									var28 += var29;
									var38 += var34;
									var35 += var41;
								}
							}
						} else {
							var5 = var4 <<= 14;
							if (var1 < 0) {
								var5 -= var27 * var1;
								var4 -= var31 * var1;
								var7 -= var20 * var1;
								var1 = 0;
							}

							var3 <<= 14;
							if (var0 < 0) {
								var3 -= var39 * var0;
								var0 = 0;
							}

							var40 = var1 - anInt1776;
							var28 += var29 * var40;
							var38 += var34 * var40;
							var35 += var41 * var40;
							if (var27 < var31) {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray1782[var1];

								while (true) {
									--var0;
									if (var0 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method930(anIntArray1629, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7,
													var37, var28, var38, var35, var32, var33, var36);
											var3 += var39;
											var4 += var31;
											var7 += var20;
											var1 += anInt1627;
											var28 += var29;
											var38 += var34;
											var35 += var41;
										}

									method930(anIntArray1629, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var37,
											var28, var38, var35, var32, var33, var36);
									var5 += var27;
									var4 += var31;
									var7 += var20;
									var1 += anInt1627;
									var28 += var29;
									var38 += var34;
									var35 += var41;
								}
							} else {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray1782[var1];

								while (true) {
									--var0;
									if (var0 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method930(anIntArray1629, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7,
													var37, var28, var38, var35, var32, var33, var36);
											var3 += var39;
											var4 += var31;
											var7 += var20;
											var1 += anInt1627;
											var28 += var29;
											var38 += var34;
											var35 += var41;
										}

									method930(anIntArray1629, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var37,
											var28, var38, var35, var32, var33, var36);
									var5 += var27;
									var4 += var31;
									var7 += var20;
									var1 += anInt1627;
									var28 += var29;
									var38 += var34;
									var35 += var41;
								}
							}
						}
					}
				} else if (var2 < anInt1773) {
					if (var0 > anInt1773)
						var0 = anInt1773;

					if (var1 > anInt1773)
						var1 = anInt1773;

					var8 = ((var8 << 9) - (var37 * var5)) + var37;
					if (var0 < var1) {
						var4 = var5 <<= 14;
						if (var2 < 0) {
							var4 -= var31 * var2;
							var5 -= var39 * var2;
							var8 -= var20 * var2;
							var2 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var27 * var0;
							var0 = 0;
						}

						var40 = var2 - anInt1776;
						var28 += var29 * var40;
						var38 += var34 * var40;
						var35 += var41 * var40;
						if (var31 < var39) {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray1782[var2];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method930(anIntArray1629, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8,
												var37, var28, var38, var35, var32, var33, var36);
										var4 += var31;
										var3 += var27;
										var8 += var20;
										var2 += anInt1627;
										var28 += var29;
										var38 += var34;
										var35 += var41;
									}

								method930(anIntArray1629, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var37, var28,
										var38, var35, var32, var33, var36);
								var4 += var31;
								var5 += var39;
								var8 += var20;
								var2 += anInt1627;
								var28 += var29;
								var38 += var34;
								var35 += var41;
							}
						} else {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray1782[var2];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method930(anIntArray1629, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8,
												var37, var28, var38, var35, var32, var33, var36);
										var4 += var31;
										var3 += var27;
										var8 += var20;
										var2 += anInt1627;
										var28 += var29;
										var38 += var34;
										var35 += var41;
									}

								method930(anIntArray1629, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var37, var28,
										var38, var35, var32, var33, var36);
								var4 += var31;
								var5 += var39;
								var8 += var20;
								var2 += anInt1627;
								var28 += var29;
								var38 += var34;
								var35 += var41;
							}
						}
					} else {
						var3 = var5 <<= 14;
						if (var2 < 0) {
							var3 -= var31 * var2;
							var5 -= var39 * var2;
							var8 -= var20 * var2;
							var2 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var27 * var1;
							var1 = 0;
						}

						var40 = var2 - anInt1776;
						var28 += var29 * var40;
						var38 += var34 * var40;
						var35 += var41 * var40;
						if (var31 < var39) {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray1782[var2];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method930(anIntArray1629, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8,
												var37, var28, var38, var35, var32, var33, var36);
										var4 += var27;
										var5 += var39;
										var8 += var20;
										var2 += anInt1627;
										var28 += var29;
										var38 += var34;
										var35 += var41;
									}

								method930(anIntArray1629, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var37, var28,
										var38, var35, var32, var33, var36);
								var3 += var31;
								var5 += var39;
								var8 += var20;
								var2 += anInt1627;
								var28 += var29;
								var38 += var34;
								var35 += var41;
							}
						} else {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray1782[var2];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method930(anIntArray1629, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8,
												var37, var28, var38, var35, var32, var33, var36);
										var4 += var27;
										var5 += var39;
										var8 += var20;
										var2 += anInt1627;
										var28 += var29;
										var38 += var34;
										var35 += var41;
									}

								method930(anIntArray1629, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var37, var28,
										var38, var35, var32, var33, var36);
								var3 += var31;
								var5 += var39;
								var8 += var20;
								var2 += anInt1627;
								var28 += var29;
								var38 += var34;
								var35 += var41;
							}
						}
					}
				}
			}
		}
	}

	static int method941(final int var0, final double var1) {
		double var3 = (var0 >> 16) / 256.0D;
		double var5 = ((var0 >> 8) & 255) / 256.0D;
		double var7 = (var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		final int var10 = (int) (var3 * 256.0D);
		final int var11 = (int) (var5 * 256.0D);
		final int var9 = (int) (var7 * 256.0D);
		return (var10 << 16) + (var11 << 8) + var9;
	}

	public static final void method942() {
		anInt1780 = anInt1777 / 2;
		anInt1776 = anInt1773 / 2;
		anInt1779 = -anInt1780;
		anInt1772 = anInt1777 - anInt1780;
		anInt1781 = -anInt1776;
		anInt1785 = anInt1773 - anInt1776;
	}

	static final void method943(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8) {
		final int var9 = var4 - var3;
		final int var19 = var1 - var0;
		final int var11 = var5 - var3;
		final int var12 = var2 - var0;
		final int var13 = var7 - var6;
		final int var14 = var8 - var6;
		int var16;
		if (var2 != var1)
			var16 = ((var5 - var4) << 14) / (var2 - var1);
		else
			var16 = 0;

		int var10;
		if (var1 != var0)
			var10 = (var9 << 14) / var19;
		else
			var10 = 0;

		int var17;
		if (var2 != var0)
			var17 = (var11 << 14) / var12;
		else
			var17 = 0;

		final int var20 = (var9 * var12) - (var11 * var19);
		if (var20 != 0) {
			final int var18 = (((var13 * var12) - (var14 * var19)) << 8) / var20;
			final int var15 = (((var14 * var9) - (var13 * var11)) << 8) / var20;
			if ((var0 <= var1) && (var0 <= var2)) {
				if (var0 < anInt1773) {
					if (var1 > anInt1773)
						var1 = anInt1773;

					if (var2 > anInt1773)
						var2 = anInt1773;

					var6 = ((var6 << 8) - (var18 * var3)) + var18;
					if (var1 < var2) {
						var5 = var3 <<= 14;
						if (var0 < 0) {
							var5 -= var17 * var0;
							var3 -= var10 * var0;
							var6 -= var15 * var0;
							var0 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var16 * var1;
							var1 = 0;
						}

						if (((var0 == var1) || (var17 >= var10)) && ((var0 != var1) || (var17 <= var16))) {
							var2 -= var1;
							var1 -= var0;
							var0 = anIntArray1782[var0];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var2;
										if (var2 < 0)
											return;

										method935(anIntArray1629, var0, 0, 0, var4 >> 14, var5 >> 14, var6, var18);
										var5 += var17;
										var4 += var16;
										var6 += var15;
										var0 += anInt1627;
									}

								method935(anIntArray1629, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var18);
								var5 += var17;
								var3 += var10;
								var6 += var15;
								var0 += anInt1627;
							}
						} else {
							var2 -= var1;
							var1 -= var0;
							var0 = anIntArray1782[var0];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var2;
										if (var2 < 0)
											return;

										method935(anIntArray1629, var0, 0, 0, var5 >> 14, var4 >> 14, var6, var18);
										var5 += var17;
										var4 += var16;
										var6 += var15;
										var0 += anInt1627;
									}

								method935(anIntArray1629, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var18);
								var5 += var17;
								var3 += var10;
								var6 += var15;
								var0 += anInt1627;
							}
						}
					} else {
						var4 = var3 <<= 14;
						if (var0 < 0) {
							var4 -= var17 * var0;
							var3 -= var10 * var0;
							var6 -= var15 * var0;
							var0 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var16 * var2;
							var2 = 0;
						}

						if (((var0 != var2) && (var17 < var10)) || ((var0 == var2) && (var16 > var10))) {
							var1 -= var2;
							var2 -= var0;
							var0 = anIntArray1782[var0];

							while (true) {
								--var2;
								if (var2 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method935(anIntArray1629, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var18);
										var5 += var16;
										var3 += var10;
										var6 += var15;
										var0 += anInt1627;
									}

								method935(anIntArray1629, var0, 0, 0, var4 >> 14, var3 >> 14, var6, var18);
								var4 += var17;
								var3 += var10;
								var6 += var15;
								var0 += anInt1627;
							}
						} else {
							var1 -= var2;
							var2 -= var0;
							var0 = anIntArray1782[var0];

							while (true) {
								--var2;
								if (var2 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method935(anIntArray1629, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var18);
										var5 += var16;
										var3 += var10;
										var6 += var15;
										var0 += anInt1627;
									}

								method935(anIntArray1629, var0, 0, 0, var3 >> 14, var4 >> 14, var6, var18);
								var4 += var17;
								var3 += var10;
								var6 += var15;
								var0 += anInt1627;
							}
						}
					}
				}
			} else if (var1 <= var2) {
				if (var1 < anInt1773) {
					if (var2 > anInt1773)
						var2 = anInt1773;

					if (var0 > anInt1773)
						var0 = anInt1773;

					var7 = ((var7 << 8) - (var18 * var4)) + var18;
					if (var2 < var0) {
						var3 = var4 <<= 14;
						if (var1 < 0) {
							var3 -= var10 * var1;
							var4 -= var16 * var1;
							var7 -= var15 * var1;
							var1 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var17 * var2;
							var2 = 0;
						}

						if (((var1 == var2) || (var10 >= var16)) && ((var1 != var2) || (var10 <= var17))) {
							var0 -= var2;
							var2 -= var1;
							var1 = anIntArray1782[var1];

							while (true) {
								--var2;
								if (var2 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method935(anIntArray1629, var1, 0, 0, var5 >> 14, var3 >> 14, var7, var18);
										var3 += var10;
										var5 += var17;
										var7 += var15;
										var1 += anInt1627;
									}

								method935(anIntArray1629, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var18);
								var3 += var10;
								var4 += var16;
								var7 += var15;
								var1 += anInt1627;
							}
						} else {
							var0 -= var2;
							var2 -= var1;
							var1 = anIntArray1782[var1];

							while (true) {
								--var2;
								if (var2 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method935(anIntArray1629, var1, 0, 0, var3 >> 14, var5 >> 14, var7, var18);
										var3 += var10;
										var5 += var17;
										var7 += var15;
										var1 += anInt1627;
									}

								method935(anIntArray1629, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var18);
								var3 += var10;
								var4 += var16;
								var7 += var15;
								var1 += anInt1627;
							}
						}
					} else {
						var5 = var4 <<= 14;
						if (var1 < 0) {
							var5 -= var10 * var1;
							var4 -= var16 * var1;
							var7 -= var15 * var1;
							var1 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var17 * var0;
							var0 = 0;
						}

						if (var10 < var16) {
							var2 -= var0;
							var0 -= var1;
							var1 = anIntArray1782[var1];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var2;
										if (var2 < 0)
											return;

										method935(anIntArray1629, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var18);
										var3 += var17;
										var4 += var16;
										var7 += var15;
										var1 += anInt1627;
									}

								method935(anIntArray1629, var1, 0, 0, var5 >> 14, var4 >> 14, var7, var18);
								var5 += var10;
								var4 += var16;
								var7 += var15;
								var1 += anInt1627;
							}
						} else {
							var2 -= var0;
							var0 -= var1;
							var1 = anIntArray1782[var1];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var2;
										if (var2 < 0)
											return;

										method935(anIntArray1629, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var18);
										var3 += var17;
										var4 += var16;
										var7 += var15;
										var1 += anInt1627;
									}

								method935(anIntArray1629, var1, 0, 0, var4 >> 14, var5 >> 14, var7, var18);
								var5 += var10;
								var4 += var16;
								var7 += var15;
								var1 += anInt1627;
							}
						}
					}
				}
			} else if (var2 < anInt1773) {
				if (var0 > anInt1773)
					var0 = anInt1773;

				if (var1 > anInt1773)
					var1 = anInt1773;

				var8 = ((var8 << 8) - (var18 * var5)) + var18;
				if (var0 < var1) {
					var4 = var5 <<= 14;
					if (var2 < 0) {
						var4 -= var16 * var2;
						var5 -= var17 * var2;
						var8 -= var15 * var2;
						var2 = 0;
					}

					var3 <<= 14;
					if (var0 < 0) {
						var3 -= var10 * var0;
						var0 = 0;
					}

					if (var16 < var17) {
						var1 -= var0;
						var0 -= var2;
						var2 = anIntArray1782[var2];

						while (true) {
							--var0;
							if (var0 < 0)
								while (true) {
									--var1;
									if (var1 < 0)
										return;

									method935(anIntArray1629, var2, 0, 0, var4 >> 14, var3 >> 14, var8, var18);
									var4 += var16;
									var3 += var10;
									var8 += var15;
									var2 += anInt1627;
								}

							method935(anIntArray1629, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var18);
							var4 += var16;
							var5 += var17;
							var8 += var15;
							var2 += anInt1627;
						}
					} else {
						var1 -= var0;
						var0 -= var2;
						var2 = anIntArray1782[var2];

						while (true) {
							--var0;
							if (var0 < 0)
								while (true) {
									--var1;
									if (var1 < 0)
										return;

									method935(anIntArray1629, var2, 0, 0, var3 >> 14, var4 >> 14, var8, var18);
									var4 += var16;
									var3 += var10;
									var8 += var15;
									var2 += anInt1627;
								}

							method935(anIntArray1629, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var18);
							var4 += var16;
							var5 += var17;
							var8 += var15;
							var2 += anInt1627;
						}
					}
				} else {
					var3 = var5 <<= 14;
					if (var2 < 0) {
						var3 -= var16 * var2;
						var5 -= var17 * var2;
						var8 -= var15 * var2;
						var2 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var10 * var1;
						var1 = 0;
					}

					if (var16 < var17) {
						var0 -= var1;
						var1 -= var2;
						var2 = anIntArray1782[var2];

						while (true) {
							--var1;
							if (var1 < 0)
								while (true) {
									--var0;
									if (var0 < 0)
										return;

									method935(anIntArray1629, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var18);
									var4 += var10;
									var5 += var17;
									var8 += var15;
									var2 += anInt1627;
								}

							method935(anIntArray1629, var2, 0, 0, var3 >> 14, var5 >> 14, var8, var18);
							var3 += var16;
							var5 += var17;
							var8 += var15;
							var2 += anInt1627;
						}
					} else {
						var0 -= var1;
						var1 -= var2;
						var2 = anIntArray1782[var2];

						while (true) {
							--var1;
							if (var1 < 0)
								while (true) {
									--var0;
									if (var0 < 0)
										return;

									method935(anIntArray1629, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var18);
									var4 += var10;
									var5 += var17;
									var8 += var15;
									var2 += anInt1627;
								}

							method935(anIntArray1629, var2, 0, 0, var5 >> 14, var3 >> 14, var8, var18);
							var3 += var16;
							var5 += var17;
							var8 += var15;
							var2 += anInt1627;
						}
					}
				}
			}
		}
	}

	static {
		int var0;
		for (var0 = 1; var0 < 512; ++var0)
			anIntArray1767[var0] = '\u8000' / var0;

		for (var0 = 1; var0 < 2048; ++var0)
			anIntArray1786[var0] = 65536 / var0;

		for (var0 = 0; var0 < 2048; ++var0) {
			anIntArray1787[var0] = (int) (65536.0D * Math.sin(var0 * 0.0030679615D));
			anIntArray1770[var0] = (int) (65536.0D * Math.cos(var0 * 0.0030679615D));
		}

	}

	public static final void method944(final double var0) {
		method933(var0, 0, 512);
	}

	public static void method945(final int var0, final int var1, final int var2) {
		aBool1775 = (var0 < 0) || (var0 > anInt1777) || (var1 < 0) || (var1 > anInt1777) || (var2 < 0)
				|| (var2 > anInt1777);
	}

	static final void method946(final int var0, final int var1, final int var2, final int var3) {
		anInt1777 = var2 - var0;
		anInt1773 = var3 - var1;
		method942();
		int var4;
		int var5;
		if (anIntArray1782.length < anInt1773) {
			var5 = anInt1773;
			--var5;
			var5 |= var5 >>> 1;
			var5 |= var5 >>> 2;
			var5 |= var5 >>> 4;
			var5 |= var5 >>> 8;
			var5 |= var5 >>> 16;
			var4 = var5 + 1;
			anIntArray1782 = new int[var4];
		}

		var4 = (var1 * anInt1627) + var0;

		for (var5 = 0; var5 < anInt1773; ++var5) {
			anIntArray1782[var5] = var4;
			var4 += anInt1627;
		}

	}

	Class131_Sub20_Sub17_Sub1() throws Throwable {
		throw new Error();
	}

	public static final void method947(final Interface3 var0) {
		anInterface3_1784 = var0;
	}
}
