public class Class131_Sub20_Sub17 extends Class131_Sub20 {
	public static int[] anIntArray1629;
	public static int anInt1627;
	public static int anInt1633;
	protected static int anInt1632 = 0;
	public static int anInt1630 = 0;
	protected static int anInt1628 = 0;
	public static int anInt1631 = 0;

	public static void method842(int var0, int var1, int var2, int var3, final int var4, final int var5, final int var6,
			final int var7) {
		int var8 = 0;
		final int var9 = (var4 == var5) && (var6 == var7) ? -1 : 65536 / var3;
		int var10 = var6;
		int var11 = 256 - var6;
		int var17 = var4;
		if (var0 < anInt1632) {
			var2 -= anInt1632 - var0;
			var0 = anInt1632;
		}

		if (var1 < anInt1630) {
			var8 += (anInt1630 - var1) * var9;
			var3 -= anInt1630 - var1;
			var1 = anInt1630;
		}

		if ((var0 + var2) > anInt1628)
			var2 = anInt1628 - var0;

		if ((var1 + var3) > anInt1631)
			var3 = anInt1631 - var1;

		final int var13 = anInt1627 - var2;
		int var12 = var0 + (var1 * anInt1627);

		for (int var14 = -var3; var14 < 0; ++var14) {
			int var15;
			int var16;
			for (var15 = -var2; var15 < 0; ++var15) {
				var16 = anIntArray1629[var12];
				final int var19 = var17 + var16;
				final int var18 = (var17 & 16711935) + (var16 & 16711935);
				final int var20 = (var18 & 16777472) + ((var19 - var18) & 65536);
				if (var11 == 0)
					anIntArray1629[var12++] = (var19 - var20) | (var20 - (var20 >>> 8));
				else {
					final int var21 = (var19 - var20) | (var20 - (var20 >>> 8));
					anIntArray1629[var12++] = ((((var21 & 16711935) * var10) >> 8) & 16711935)
							+ ((((var21 & '\uff00') * var10) >> 8) & '\uff00')
							+ ((((var16 & 16711935) * var11) >> 8) & 16711935)
							+ ((((var16 & '\uff00') * var11) >> 8) & '\uff00');
				}
			}

			if (var9 > 0) {
				var8 += var9;
				var15 = (65536 - var8) >> 8;
				var16 = var8 >> 8;
				if (var6 != var7) {
					var10 = ((var6 * (65536 - var8)) + (var7 * var8)) >> 16;
					var11 = 256 - var10;
				}

				if (var4 != var5)
					var17 = (((((var4 & 16711935) * var15) + ((var5 & 16711935) * var16)) & -16711936)
							+ ((((var4 & '\uff00') * var15) + ((var5 & '\uff00') * var16)) & 16711680)) >>> 8;
			}

			var12 += var13;
		}

	}

	public static void method843(final int[] var0, final int var1, final int var2) {
		anIntArray1629 = var0;
		anInt1627 = var1;
		anInt1633 = var2;
		method845(0, 0, var1, var2);
	}

	public static void method844() {
		anInt1632 = 0;
		anInt1630 = 0;
		anInt1628 = anInt1627;
		anInt1631 = anInt1633;
	}

	public static void method845(int var0, int var1, int var2, int var3) {
		if (var0 < 0)
			var0 = 0;

		if (var1 < 0)
			var1 = 0;

		if (var2 > anInt1627)
			var2 = anInt1627;

		if (var3 > anInt1633)
			var3 = anInt1633;

		anInt1632 = var0;
		anInt1630 = var1;
		anInt1628 = var2;
		anInt1631 = var3;
	}

	public static void method846(final int var0, final int var1, final int var2, final int var3) {
		if (anInt1632 < var0)
			anInt1632 = var0;

		if (anInt1630 < var1)
			anInt1630 = var1;

		if (anInt1628 > var2)
			anInt1628 = var2;

		if (anInt1631 > var3)
			anInt1631 = var3;

	}

	public static void method847(final int[] var0) {
		var0[0] = anInt1632;
		var0[1] = anInt1630;
		var0[2] = anInt1628;
		var0[3] = anInt1631;
	}

	public static void method848() {
		int var0 = 0;

		int var1;
		for (var1 = (anInt1627 * anInt1633) - 7; var0 < var1; anIntArray1629[var0++] = 0) {
			anIntArray1629[var0++] = 0;
			anIntArray1629[var0++] = 0;
			anIntArray1629[var0++] = 0;
			anIntArray1629[var0++] = 0;
			anIntArray1629[var0++] = 0;
			anIntArray1629[var0++] = 0;
			anIntArray1629[var0++] = 0;
		}

		for (var1 += 7; var0 < var1; anIntArray1629[var0++] = 0)
			;

	}

	public static void method849(int var0, int var1, int var2, int var3, int var4, final int var5) {
		if (var0 < anInt1632) {
			var2 -= anInt1632 - var0;
			var0 = anInt1632;
		}

		if (var1 < anInt1630) {
			var3 -= anInt1630 - var1;
			var1 = anInt1630;
		}

		if ((var0 + var2) > anInt1628)
			var2 = anInt1628 - var0;

		if ((var1 + var3) > anInt1631)
			var3 = anInt1631 - var1;

		var4 = ((((var4 & 16711935) * var5) >> 8) & 16711935) + ((((var4 & '\uff00') * var5) >> 8) & '\uff00');
		final int var9 = 256 - var5;
		final int var10 = anInt1627 - var2;
		int var7 = var0 + (var1 * anInt1627);

		for (int var6 = 0; var6 < var3; ++var6) {
			for (int var11 = -var2; var11 < 0; ++var11) {
				int var8 = anIntArray1629[var7];
				var8 = ((((var8 & 16711935) * var9) >> 8) & 16711935) + ((((var8 & '\uff00') * var9) >> 8) & '\uff00');
				anIntArray1629[var7++] = var4 + var8;
			}

			var7 += var10;
		}

	}

	public static void method850(int var0, int var1, int var2, int var3, final int var4) {
		if (var0 < anInt1632) {
			var2 -= anInt1632 - var0;
			var0 = anInt1632;
		}

		if (var1 < anInt1630) {
			var3 -= anInt1630 - var1;
			var1 = anInt1630;
		}

		if ((var0 + var2) > anInt1628)
			var2 = anInt1628 - var0;

		if ((var1 + var3) > anInt1631)
			var3 = anInt1631 - var1;

		final int var5 = anInt1627 - var2;
		int var6 = var0 + (var1 * anInt1627);

		for (int var8 = -var3; var8 < 0; ++var8) {
			for (int var7 = -var2; var7 < 0; ++var7)
				anIntArray1629[var6++] = var4;

			var6 += var5;
		}

	}

	public static void method851(final int[] var0) {
		anInt1632 = var0[0];
		anInt1630 = var0[1];
		anInt1628 = var0[2];
		anInt1631 = var0[3];
	}

	public static void method852(int var0, int var1, int var2, int var3, final int var4, final int var5, final int var6,
			final int var7) {
		int var8 = 0;
		final int var14 = (var4 == var5) && (var6 == var7) ? -1 : 65536 / var3;
		int var12 = var6;
		int var13 = 256 - var6;
		if (var0 < anInt1632) {
			var2 -= anInt1632 - var0;
			var0 = anInt1632;
		}

		if (var1 < anInt1630) {
			var8 += (anInt1630 - var1) * var14;
			var3 -= anInt1630 - var1;
			var1 = anInt1630;
		}

		if ((var0 + var2) > anInt1628)
			var2 = anInt1628 - var0;

		if ((var1 + var3) > anInt1631)
			var3 = anInt1631 - var1;

		int var15 = var4 >> 16;
		int var10 = (var4 & '\uff00') >> 8;
		int var21 = var4 & 255;
		final int var17 = anInt1627 - var2;
		int var18 = var0 + (var1 * anInt1627);

		for (int var19 = 0; var19 < var3; ++var19) {
			int var9;
			int var20;
			int var23;
			for (var20 = -var2; var20 < 0; ++var20) {
				var23 = anIntArray1629[var18];
				var9 = var23 >> 16;
				final int var11 = (var23 & '\uff00') >> 8;
				final int var22 = var23 & 255;
				int var16;
				int var24;
				int var25;
				if (var13 == 0) {
					var24 = var9 < 127 ? (var15 * var9) >> 7 : 255 - (((255 - var15) * (255 - var9)) >> 7);
					var25 = var11 < 127 ? (var10 * var11) >> 7 : 255 - (((255 - var10) * (255 - var11)) >> 7);
					var16 = var22 < 127 ? (var21 * var22) >> 7 : 255 - (((255 - var21) * (255 - var22)) >> 7);
				} else {
					var24 = var9 < 127 ? (((var15 * var9 * var12) >> 7) + (var9 * var13)) >> 8
							: (((255 - (((255 - var15) * (255 - var9)) >> 7)) * var12) + (var9 * var13)) >> 8;
					var25 = var11 < 127 ? (((var10 * var11 * var12) >> 7) + (var11 * var13)) >> 8
							: (((255 - (((255 - var10) * (255 - var11)) >> 7)) * var12) + (var11 * var13)) >> 8;
					var16 = var22 < 127 ? (((var21 * var22 * var12) >> 7) + (var22 * var13)) >> 8
							: (((255 - (((255 - var21) * (255 - var22)) >> 7)) * var12) + (var22 * var13)) >> 8;
				}

				anIntArray1629[var18++] = (var24 << 16) + (var25 << 8) + var16;
			}

			if (var14 > 0) {
				var8 += var14;
				var20 = (65536 - var8) >> 8;
				var23 = var8 >> 8;
				if (var6 != var7) {
					var12 = ((var6 * (65536 - var8)) + (var7 * var8)) >> 16;
					var13 = 256 - var12;
				}

				if (var4 != var5) {
					var9 = (((((var4 & 16711935) * var20) + ((var5 & 16711935) * var23)) & -16711936)
							+ ((((var4 & '\uff00') * var20) + ((var5 & '\uff00') * var23)) & 16711680)) >>> 8;
					var15 = var9 >> 16;
					var10 = (var9 & '\uff00') >> 8;
					var21 = var9 & 255;
				}
			}

			var18 += var17;
		}

	}

	public static void method853(int var0, int var1, int var2, int var3, final int var4, final int var5) {
		int var6 = 0;
		final int var7 = 65536 / var3;
		if (var0 < anInt1632) {
			var2 -= anInt1632 - var0;
			var0 = anInt1632;
		}

		if (var1 < anInt1630) {
			var6 += (anInt1630 - var1) * var7;
			var3 -= anInt1630 - var1;
			var1 = anInt1630;
		}

		if ((var0 + var2) > anInt1628)
			var2 = anInt1628 - var0;

		if ((var1 + var3) > anInt1631)
			var3 = anInt1631 - var1;

		final int var12 = anInt1627 - var2;
		int var10 = var0 + (var1 * anInt1627);

		for (int var9 = -var3; var9 < 0; ++var9) {
			final int var13 = (65536 - var6) >> 8;
			final int var8 = var6 >> 8;
			final int var11 = (((((var4 & 16711935) * var13) + ((var5 & 16711935) * var8)) & -16711936)
					+ ((((var4 & '\uff00') * var13) + ((var5 & '\uff00') * var8)) & 16711680)) >>> 8;

			for (int var14 = -var2; var14 < 0; ++var14)
				anIntArray1629[var10++] = var11;

			var10 += var12;
			var6 += var7;
		}

	}

	public static void method854(final int var0, final int var1, final int var2, final int var3, final int var4) {
		method860(var0, var1, var2, var4);
		method860(var0, (var1 + var3) - 1, var2, var4);
		method863(var0, var1, var3, var4);
		method863((var0 + var2) - 1, var1, var3, var4);
	}

	public static void method855(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5) {
		method856(var0, var1, var2, var4, var5);
		method856(var0, (var1 + var3) - 1, var2, var4, var5);
		if (var3 >= 3) {
			method857(var0, var1 + 1, var3 - 2, var4, var5);
			method857((var0 + var2) - 1, var1 + 1, var3 - 2, var4, var5);
		}

	}

	static void method856(int var0, final int var1, int var2, final int var3, final int var4) {
		if ((var1 >= anInt1630) && (var1 < anInt1631)) {
			if (var0 < anInt1632) {
				var2 -= anInt1632 - var0;
				var0 = anInt1632;
			}

			if ((var0 + var2) > anInt1628)
				var2 = anInt1628 - var0;

			final int var6 = 256 - var4;
			final int var11 = ((var3 >> 16) & 255) * var4;
			final int var10 = ((var3 >> 8) & 255) * var4;
			final int var9 = (var3 & 255) * var4;
			int var5 = var0 + (var1 * anInt1627);

			for (int var12 = 0; var12 < var2; ++var12) {
				final int var8 = ((anIntArray1629[var5] >> 16) & 255) * var6;
				final int var13 = ((anIntArray1629[var5] >> 8) & 255) * var6;
				final int var7 = (anIntArray1629[var5] & 255) * var6;
				final int var14 = (((var11 + var8) >> 8) << 16) + (((var10 + var13) >> 8) << 8) + ((var9 + var7) >> 8);
				anIntArray1629[var5++] = var14;
			}

		}
	}

	static void method857(final int var0, int var1, int var2, final int var3, final int var4) {
		if ((var0 >= anInt1632) && (var0 < anInt1628)) {
			if (var1 < anInt1630) {
				var2 -= anInt1630 - var1;
				var1 = anInt1630;
			}

			if ((var1 + var2) > anInt1631)
				var2 = anInt1631 - var1;

			final int var8 = 256 - var4;
			final int var14 = ((var3 >> 16) & 255) * var4;
			final int var9 = ((var3 >> 8) & 255) * var4;
			final int var10 = (var3 & 255) * var4;
			int var5 = var0 + (var1 * anInt1627);

			for (int var7 = 0; var7 < var2; ++var7) {
				final int var11 = ((anIntArray1629[var5] >> 16) & 255) * var8;
				final int var12 = ((anIntArray1629[var5] >> 8) & 255) * var8;
				final int var13 = (anIntArray1629[var5] & 255) * var8;
				final int var6 = (((var14 + var11) >> 8) << 16) + (((var9 + var12) >> 8) << 8) + ((var10 + var13) >> 8);
				anIntArray1629[var5] = var6;
				var5 += anInt1627;
			}

		}
	}

	public static void method858(int var0, int var1, final int var2, final int[] var3, final int[] var4) {
		int var5 = var0 + (var1 * anInt1627);

		for (var1 = 0; var1 < var3.length; ++var1) {
			int var6 = var5 + var3[var1];

			for (var0 = -var4[var1]; var0 < 0; ++var0)
				anIntArray1629[var6++] = var2;

			var5 += anInt1627;
		}

	}

	public static void method859(int var0, int var1, int var2, int var3, final int var4, final int var5, final int var6,
			final int var7) {
		int var8 = 0;
		final int var13 = 65536 / var3;
		int var10 = var6;
		int var11 = 256 - var6;
		if (var0 < anInt1632) {
			var2 -= anInt1632 - var0;
			var0 = anInt1632;
		}

		if (var1 < anInt1630) {
			var8 += (anInt1630 - var1) * var13;
			var3 -= anInt1630 - var1;
			var1 = anInt1630;
		}

		if ((var0 + var2) > anInt1628)
			var2 = anInt1628 - var0;

		if ((var1 + var3) > anInt1631)
			var3 = anInt1631 - var1;

		int var14 = var4 & 16711680;
		int var9 = var4 & '\uff00';
		int var17 = var4 & 255;
		int var15 = (var14 * var6) >> 8;
		int var18 = (var9 * var6) >> 8;
		int var26 = (var17 * var6) >> 8;
		final int var19 = anInt1627 - var2;
		int var28 = var0 + (var1 * anInt1627);

		for (int var23 = 0; var23 < var3; ++var23) {
			int var20;
			int var21;
			int var22;
			for (var20 = -var2; var20 < 0; ++var20) {
				var21 = anIntArray1629[var28];
				var22 = var21 & 16711680;
				final int var24 = var22 <= var14 ? var22
						: (var11 == 0 ? var14 : (var15 + ((var22 * var11) >> 8)) & 16711680);
				final int var12 = var21 & '\uff00';
				final int var25 = var12 <= var9 ? var12
						: (var11 == 0 ? var9 : (var18 + ((var12 * var11) >> 8)) & '\uff00');
				final int var16 = var21 & 255;
				final int var27 = var16 <= var17 ? var16 : (var11 == 0 ? var17 : var26 + ((var16 * var11) >> 8));
				anIntArray1629[var28++] = var24 + var25 + var27;
			}

			if (var13 > 0) {
				var8 += var13;
				var20 = (65536 - var8) >> 8;
				var21 = var8 >> 8;
				if (var6 != var7) {
					var10 = ((var6 * (65536 - var8)) + (var7 * var8)) >> 16;
					var11 = 256 - var10;
				}

				if (var4 != var5) {
					var22 = (((((var4 & 16711935) * var20) + ((var5 & 16711935) * var21)) & -16711936)
							+ ((((var4 & '\uff00') * var20) + ((var5 & '\uff00') * var21)) & 16711680)) >>> 8;
					var14 = var22 & 16711680;
					var9 = var22 & '\uff00';
					var17 = var22 & 255;
					var15 = (var14 * var10) >> 8;
					var18 = (var9 * var10) >> 8;
					var26 = (var17 * var10) >> 8;
				}
			}

			var28 += var19;
		}

	}

	public static void method860(int var0, final int var1, int var2, final int var3) {
		if ((var1 >= anInt1630) && (var1 < anInt1631)) {
			if (var0 < anInt1632) {
				var2 -= anInt1632 - var0;
				var0 = anInt1632;
			}

			if ((var0 + var2) > anInt1628)
				var2 = anInt1628 - var0;

			final int var4 = var0 + (var1 * anInt1627);

			for (int var5 = 0; var5 < var2; ++var5)
				anIntArray1629[var4 + var5] = var3;

		}
	}

	public static void method861(int var0, int var1, int var2, int var3, final int var4, final int var5, final int var6,
			final int var7) {
		int var8 = 0;
		final int var28 = 65536 / var3;
		int var9 = var6;
		int var10 = 256 - var6;
		if (var0 < anInt1632) {
			var2 -= anInt1632 - var0;
			var0 = anInt1632;
		}

		if (var1 < anInt1630) {
			var8 += (anInt1630 - var1) * var28;
			var3 -= anInt1630 - var1;
			var1 = anInt1630;
		}

		if ((var0 + var2) > anInt1628)
			var2 = anInt1628 - var0;

		if ((var1 + var3) > anInt1631)
			var3 = anInt1631 - var1;

		int var16 = var4 & 16711680;
		int var24 = var4 & '\uff00';
		int var14 = var4 & 255;
		int var17 = (var16 * var6) >> 8;
		int var26 = (var24 * var6) >> 8;
		int var18 = (var14 * var6) >> 8;
		final int var19 = anInt1627 - var2;
		int var22 = var0 + (var1 * anInt1627);

		for (int var20 = 0; var20 < var3; ++var20) {
			int var11;
			int var12;
			int var21;
			for (var21 = -var2; var21 < 0; ++var21) {
				var11 = anIntArray1629[var22];
				var12 = var11 & 16711680;
				final int var15 = var12 >= var16 ? var12
						: (var10 == 0 ? var16 : (var17 + ((var12 * var10) >> 8)) & 16711680);
				final int var25 = var11 & '\uff00';
				final int var27 = var25 >= var24 ? var25
						: (var10 == 0 ? var24 : (var26 + ((var25 * var10) >> 8)) & '\uff00');
				final int var13 = var11 & 255;
				final int var23 = var13 >= var14 ? var13 : (var10 == 0 ? var14 : var18 + ((var13 * var10) >> 8));
				anIntArray1629[var22++] = var15 + var27 + var23;
			}

			if (var28 > 0) {
				var8 += var28;
				var21 = (65536 - var8) >> 8;
				var11 = var8 >> 8;
				if (var6 != var7) {
					var9 = ((var6 * (65536 - var8)) + (var7 * var8)) >> 16;
					var10 = 256 - var9;
				}

				if (var4 != var5) {
					var12 = (((((var4 & 16711935) * var21) + ((var5 & 16711935) * var11)) & -16711936)
							+ ((((var4 & '\uff00') * var21) + ((var5 & '\uff00') * var11)) & 16711680)) >>> 8;
					var16 = var12 & 16711680;
					var24 = var12 & '\uff00';
					var14 = var12 & 255;
					var17 = (var16 * var9) >> 8;
					var26 = (var24 * var9) >> 8;
					var18 = (var14 * var9) >> 8;
				}
			}

			var22 += var19;
		}

	}

	public static void method862(int var0, int var1, int var2, int var3, final int var4) {
		var2 -= var0;
		var3 -= var1;
		if (var3 == 0) {
			if (var2 >= 0)
				method860(var0, var1, var2 + 1, var4);
			else
				method860(var0 + var2, var1, -var2 + 1, var4);

		} else if (var2 == 0) {
			if (var3 >= 0)
				method863(var0, var1, var3 + 1, var4);
			else
				method863(var0, var1 + var3, -var3 + 1, var4);

		} else {
			if ((var2 + var3) < 0) {
				var0 += var2;
				var2 = -var2;
				var1 += var3;
				var3 = -var3;
			}

			int var5;
			int var6;
			if (var2 > var3) {
				var1 <<= 16;
				var1 += '\u8000';
				var3 <<= 16;
				var5 = (int) Math.floor(((double) var3 / (double) var2) + 0.5D);
				var2 += var0;
				if (var0 < anInt1632) {
					var1 += var5 * (anInt1632 - var0);
					var0 = anInt1632;
				}

				if (var2 >= anInt1628)
					var2 = anInt1628 - 1;

				while (var0 <= var2) {
					var6 = var1 >> 16;
					if ((var6 >= anInt1630) && (var6 < anInt1631))
						anIntArray1629[var0 + (var6 * anInt1627)] = var4;

					var1 += var5;
					++var0;
				}
			} else {
				var0 <<= 16;
				var0 += '\u8000';
				var2 <<= 16;
				var5 = (int) Math.floor(((double) var2 / (double) var3) + 0.5D);
				var3 += var1;
				if (var1 < anInt1630) {
					var0 += var5 * (anInt1630 - var1);
					var1 = anInt1630;
				}

				if (var3 >= anInt1631)
					var3 = anInt1631 - 1;

				while (var1 <= var3) {
					var6 = var0 >> 16;
					if ((var6 >= anInt1632) && (var6 < anInt1628))
						anIntArray1629[var6 + (var1 * anInt1627)] = var4;

					var0 += var5;
					++var1;
				}
			}

		}
	}

	public static void method863(final int var0, int var1, int var2, final int var3) {
		if ((var0 >= anInt1632) && (var0 < anInt1628)) {
			if (var1 < anInt1630) {
				var2 -= anInt1630 - var1;
				var1 = anInt1630;
			}

			if ((var1 + var2) > anInt1631)
				var2 = anInt1631 - var1;

			final int var5 = var0 + (var1 * anInt1627);

			for (int var4 = 0; var4 < var2; ++var4)
				anIntArray1629[var5 + (var4 * anInt1627)] = var3;

		}
	}
}
