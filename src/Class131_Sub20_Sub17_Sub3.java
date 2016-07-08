import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public final class Class131_Sub20_Sub17_Sub3 extends Class131_Sub20_Sub17 {
	public int[] anIntArray1823;
	public int anInt1826;
	public int anInt1822;
	public int anInt1828;
	public int anInt1827;
	int anInt1825;
	int anInt1824;

	public void method959(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int[] var7, final int[] var8) {
		final int var11 = var2 < 0 ? -var2 : 0;
		final int var13 = (var2 + anInt1827) <= var6 ? anInt1827 : var6 - var2;
		final int var15 = var1 < 0 ? -var1 : 0;
		if ((var1 + anInt1822) <= var5) {
		} else {
		}

		int var12 = var3 + var1 + var15 + ((var4 + var2 + var11) * anInt1627);
		int var18 = var2 + var11;

		for (int var21 = var11; var21 < var13; ++var21) {
			final int var16 = var7[var18];
			final int var17 = var8[var18++];
			int var9 = var12;
			int var20;
			if (var1 < var16) {
				var20 = var16 - var1;
				var9 = var12 + (var20 - var15);
			} else
				var20 = var15;

			int var14;
			if ((var1 + anInt1822) <= (var16 + var17))
				var14 = anInt1822;
			else
				var14 = (var16 + var17) - var1;

			for (int var19 = var20; var19 < var14; ++var19) {
				final int var10 = anIntArray1823[var19 + (var21 * anInt1822)];
				if (var10 != 0)
					anIntArray1629[var9++] = var10;
				else
					++var9;
			}

			var12 += anInt1627;
		}

	}

	public Class131_Sub20_Sub17_Sub3(final int var1, final int var2) {
		anIntArray1823 = new int[var1 * var2];
		anInt1822 = anInt1826 = var1;
		anInt1827 = anInt1828 = var2;
		anInt1825 = 0;
		anInt1824 = 0;
	}

	public Class131_Sub20_Sub17_Sub3(final byte[] var1, final Component var2) {
		try {
			final Image var3 = Toolkit.getDefaultToolkit().createImage(var1);
			final MediaTracker var4 = new MediaTracker(var2);
			var4.addImage(var3, 0);
			var4.waitForAll();
			anInt1822 = var3.getWidth(var2);
			anInt1827 = var3.getHeight(var2);
			anInt1826 = anInt1822;
			anInt1828 = anInt1827;
			anInt1824 = 0;
			anInt1825 = 0;
			anIntArray1823 = new int[anInt1822 * anInt1827];
			final PixelGrabber var5 = new PixelGrabber(var3, 0, 0, anInt1822, anInt1827, anIntArray1823, 0, anInt1822);
			var5.grabPixels();
		} catch (final InterruptedException var6) {
			;
		}

	}

	public Class131_Sub20_Sub17_Sub3 method960() {
		final Class131_Sub20_Sub17_Sub3 var1 = new Class131_Sub20_Sub17_Sub3(anInt1822, anInt1827);
		var1.anInt1826 = anInt1826;
		var1.anInt1828 = anInt1828;
		var1.anInt1824 = anInt1826 - anInt1822 - anInt1824;
		var1.anInt1825 = anInt1825;

		for (int var2 = 0; var2 < anInt1827; ++var2)
			for (int var3 = 0; var3 < anInt1822; ++var3)
				var1.anIntArray1823[(var2 * anInt1822) + var3] = anIntArray1823[((var2 * anInt1822) + anInt1822) - 1
						- var3];

		return var1;
	}

	public Class131_Sub20_Sub17_Sub3 method961() {
		final Class131_Sub20_Sub17_Sub3 var1 = new Class131_Sub20_Sub17_Sub3(anInt1826, anInt1828);

		for (int var2 = 0; var2 < anInt1827; ++var2)
			for (int var3 = 0; var3 < anInt1822; ++var3)
				var1.anIntArray1823[((var2 + anInt1825) * anInt1826) + var3
						+ anInt1824] = anIntArray1823[(var2 * anInt1822) + var3];

		return var1;
	}

	public void method962() {
		method843(anIntArray1823, anInt1822, anInt1827);
	}

	public void method963(final int var1) {
		if ((anInt1822 != anInt1826) || (anInt1827 != anInt1828)) {
			int var3 = var1;
			if (var1 > anInt1824)
				var3 = anInt1824;

			int var4 = var1;
			if ((var1 + anInt1824 + anInt1822) > anInt1826)
				var4 = anInt1826 - anInt1824 - anInt1822;

			int var5 = var1;
			if (var1 > anInt1825)
				var5 = anInt1825;

			int var7 = var1;
			if ((var1 + anInt1825 + anInt1827) > anInt1828)
				var7 = anInt1828 - anInt1825 - anInt1827;

			final int var2 = anInt1822 + var3 + var4;
			final int var6 = anInt1827 + var5 + var7;
			final int[] var9 = new int[var2 * var6];

			for (int var8 = 0; var8 < anInt1827; ++var8)
				for (int var10 = 0; var10 < anInt1822; ++var10)
					var9[((var8 + var5) * var2) + var10 + var3] = anIntArray1823[(var8 * anInt1822) + var10];

			anIntArray1823 = var9;
			anInt1822 = var2;
			anInt1827 = var6;
			anInt1824 -= var3;
			anInt1825 -= var5;
		}
	}

	public void method964() {
		final int[] var1 = new int[anInt1822 * anInt1827];
		int var3 = 0;

		for (int var2 = 0; var2 < anInt1827; ++var2)
			for (int var4 = anInt1822 - 1; var4 >= 0; --var4)
				var1[var3++] = anIntArray1823[var4 + (var2 * anInt1822)];

		anIntArray1823 = var1;
		anInt1824 = anInt1826 - anInt1822 - anInt1824;
	}

	public void method965(final int var1) {
		for (int var2 = anInt1827 - 1; var2 > 0; --var2) {
			final int var4 = var2 * anInt1822;

			for (int var3 = anInt1822 - 1; var3 > 0; --var3)
				if ((anIntArray1823[var3 + var4] == 0) && (anIntArray1823[(var3 + var4) - 1 - anInt1822] != 0))
					anIntArray1823[var3 + var4] = var1;
		}

	}

	public void method966(int var1, int var2) {
		var1 += anInt1824;
		var2 += anInt1825;
		int var4 = var1 + (var2 * anInt1627);
		int var3 = 0;
		int var6 = anInt1827;
		int var5 = anInt1822;
		int var7 = anInt1627 - var5;
		int var8 = 0;
		int var9;
		if (var2 < anInt1630) {
			var9 = anInt1630 - var2;
			var6 -= var9;
			var2 = anInt1630;
			var3 += var9 * var5;
			var4 += var9 * anInt1627;
		}

		if ((var2 + var6) > anInt1631)
			var6 -= (var2 + var6) - anInt1631;

		if (var1 < anInt1632) {
			var9 = anInt1632 - var1;
			var5 -= var9;
			var1 = anInt1632;
			var3 += var9;
			var4 += var9;
			var8 += var9;
			var7 += var9;
		}

		if ((var1 + var5) > anInt1628) {
			var9 = (var1 + var5) - anInt1628;
			var5 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if ((var5 > 0) && (var6 > 0))
			method967(anIntArray1629, anIntArray1823, var3, var4, var5, var6, var7, var8);
	}

	static void method967(final int[] var0, final int[] var1, int var2, int var3, final int var4, final int var5,
			final int var6, final int var7) {
		for (int var8 = -var5; var8 < 0; ++var8) {
			int var9;
			for (var9 = (var3 + var4) - 3; var3 < var9; var0[var3++] = var1[var2++]) {
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
			}

			for (var9 += 3; var3 < var9; var0[var3++] = var1[var2++])
				;

			var3 += var6;
			var2 += var7;
		}

	}

	public void method968(int var1, int var2) {
		var1 += anInt1824;
		var2 += anInt1825;
		int var6 = var1 + (var2 * anInt1627);
		int var4 = 0;
		int var7 = anInt1827;
		int var3 = anInt1822;
		int var8 = anInt1627 - var3;
		int var9 = 0;
		int var5;
		if (var2 < anInt1630) {
			var5 = anInt1630 - var2;
			var7 -= var5;
			var2 = anInt1630;
			var4 += var5 * var3;
			var6 += var5 * anInt1627;
		}

		if ((var2 + var7) > anInt1631)
			var7 -= (var2 + var7) - anInt1631;

		if (var1 < anInt1632) {
			var5 = anInt1632 - var1;
			var3 -= var5;
			var1 = anInt1632;
			var4 += var5;
			var6 += var5;
			var9 += var5;
			var8 += var5;
		}

		if ((var1 + var3) > anInt1628) {
			var5 = (var1 + var3) - anInt1628;
			var3 -= var5;
			var9 += var5;
			var8 += var5;
		}

		if ((var3 > 0) && (var7 > 0))
			method983(anIntArray1629, anIntArray1823, 0, var4, var6, var3, var7, var8, var9);
	}

	static void method969(final int[] var0, final int[] var1, int var2, int var3, int var4, final int var5,
			final int var6, final int var7, final int var8, final int var9, int var10) {
		final int var11 = 256 - var9;
		int var13 = ((var10 & 16711935) * var11) & -16711936;
		int var14 = ((var10 & '\uff00') * var11) & 16711680;
		var10 = (var13 | var14) >>> 8;

		for (int var12 = -var6; var12 < 0; ++var12) {
			for (int var15 = -var5; var15 < 0; ++var15) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var13 = ((var2 & 16711935) * var9) & -16711936;
					var14 = ((var2 & '\uff00') * var9) & 16711680;
					var0[var4++] = ((var13 | var14) >>> 8) + var10;
				} else
					++var4;
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method970(final int var1) {
		final int[] var2 = new int[anInt1822 * anInt1827];
		int var4 = 0;

		for (int var3 = 0; var3 < anInt1827; ++var3)
			for (int var5 = 0; var5 < anInt1822; ++var5) {
				int var6 = anIntArray1823[var4];
				if (var6 == 0)
					if ((var5 > 0) && (anIntArray1823[var4 - 1] != 0))
						var6 = var1;
					else if ((var3 > 0) && (anIntArray1823[var4 - anInt1822] != 0))
						var6 = var1;
					else if ((var5 < (anInt1822 - 1)) && (anIntArray1823[var4 + 1] != 0))
						var6 = var1;
					else if ((var3 < (anInt1827 - 1)) && (anIntArray1823[var4 + anInt1822] != 0))
						var6 = var1;

				var2[var4++] = var6;
			}

		anIntArray1823 = var2;
	}

	static void method971(final int[] var0, final int[] var1, int var2, int var3, int var4, final int var5,
			final int var6, final int var7, final int var8, final int var9) {
		final int var10 = 256 - var9;

		for (int var11 = -var6; var11 < 0; ++var11) {
			for (int var12 = -var5; var12 < 0; ++var12) {
				var2 = var1[var3++];
				if (var2 != 0) {
					final int var13 = var0[var4];
					var0[var4++] = (((((var2 & 16711935) * var9) + ((var13 & 16711935) * var10)) & -16711936)
							+ ((((var2 & '\uff00') * var9) + ((var13 & '\uff00') * var10)) & 16711680)) >> 8;
				} else
					++var4;
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method972(int var1, int var2, int var3, int var4, final int var5) {
		if ((var3 > 0) && (var4 > 0)) {
			final int var15 = anInt1822;
			final int var8 = anInt1827;
			int var9 = 0;
			int var10 = 0;
			final int var12 = anInt1826;
			final int var13 = anInt1828;
			final int var11 = (var12 << 16) / var3;
			final int var14 = (var13 << 16) / var4;
			int var7;
			if (anInt1824 > 0) {
				var7 = (((anInt1824 << 16) + var11) - 1) / var11;
				var1 += var7;
				var9 += (var7 * var11) - (anInt1824 << 16);
			}

			if (anInt1825 > 0) {
				var7 = (((anInt1825 << 16) + var14) - 1) / var14;
				var2 += var7;
				var10 += (var7 * var14) - (anInt1825 << 16);
			}

			if (var15 < var12)
				var3 = ((((var15 << 16) - var9) + var11) - 1) / var11;

			if (var8 < var13)
				var4 = ((((var8 << 16) - var10) + var14) - 1) / var14;

			var7 = var1 + (var2 * anInt1627);
			int var16 = anInt1627 - var3;
			if ((var2 + var4) > anInt1631)
				var4 -= (var2 + var4) - anInt1631;

			int var6;
			if (var2 < anInt1630) {
				var6 = anInt1630 - var2;
				var4 -= var6;
				var7 += var6 * anInt1627;
				var10 += var14 * var6;
			}

			if ((var1 + var3) > anInt1628) {
				var6 = (var1 + var3) - anInt1628;
				var3 -= var6;
				var16 += var6;
			}

			if (var1 < anInt1632) {
				var6 = anInt1632 - var1;
				var3 -= var6;
				var7 += var6;
				var9 += var11 * var6;
				var16 += var6;
			}

			method973(anIntArray1629, anIntArray1823, 0, var9, var10, var7, var16, var3, var4, var11, var14, var15,
					var5);
		}
	}

	static void method973(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, final int var6,
			final int var7, final int var8, final int var9, final int var10, final int var11, final int var12) {
		final int var13 = 256 - var12;
		final int var16 = var3;

		for (int var15 = -var8; var15 < 0; ++var15) {
			final int var18 = (var4 >> 16) * var11;

			for (int var17 = -var7; var17 < 0; ++var17) {
				var2 = var1[(var3 >> 16) + var18];
				if (var2 != 0) {
					final int var14 = var0[var5];
					var0[var5++] = (((((var2 & 16711935) * var12) + ((var14 & 16711935) * var13)) & -16711936)
							+ ((((var2 & '\uff00') * var12) + ((var14 & '\uff00') * var13)) & 16711680)) >> 8;
				} else
					++var5;

				var3 += var9;
			}

			var4 += var10;
			var3 = var16;
			var5 += var6;
		}

	}

	public void method974() {
		final int[] var1 = new int[anInt1822 * anInt1827];
		int var3 = 0;

		for (int var2 = anInt1827 - 1; var2 >= 0; --var2)
			for (int var4 = 0; var4 < anInt1822; ++var4)
				var1[var3++] = anIntArray1823[var4 + (var2 * anInt1822)];

		anIntArray1823 = var1;
		anInt1825 = anInt1828 - anInt1827 - anInt1825;
	}

	public void method975(int var1, int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8, final int[] var9, final int[] var10) {
		try {
			final int var11 = -var3 / 2;
			final int var12 = -var4 / 2;
			int var13 = (int) (Math.sin(var7 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(var7 / 326.11D) * 65536.0D);
			var13 = (var13 * var8) >> 8;
			var14 = (var14 * var8) >> 8;
			int var15 = (var5 << 16) + (var12 * var13) + (var11 * var14);
			int var16 = (var6 << 16) + ((var12 * var14) - (var11 * var13));
			int var17 = var1 + (var2 * anInt1627);

			for (var2 = 0; var2 < var4; ++var2) {
				final int var18 = var9[var2];
				int var19 = var17 + var18;
				int var20 = var15 + (var14 * var18);
				int var21 = var16 - (var13 * var18);

				for (var1 = -var10[var2]; var1 < 0; ++var1) {
					anIntArray1629[var19++] = anIntArray1823[(var20 >> 16) + ((var21 >> 16) * anInt1822)];
					var20 += var14;
					var21 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += anInt1627;
			}
		} catch (final Exception var23) {
			;
		}

	}

	public void method976(final int var1, final int var2, final int var3, final int var4) {
		method977(anInt1826 << 3, anInt1828 << 3, var1 << 4, var2 << 4, var3, var4);
	}

	void method977(int var1, int var2, final int var3, final int var4, final int var5, final int var6) {
		if (var6 != 0) {
			var1 -= anInt1824 << 4;
			var2 -= anInt1825 << 4;
			final double var10 = (var5 & '\uffff') * 9.587379924285257E-5D;
			final int var17 = (int) Math.floor((Math.sin(var10) * var6) + 0.5D);
			final int var14 = (int) Math.floor((Math.cos(var10) * var6) + 0.5D);
			final int var23 = (-var1 * var14) + (-var2 * var17);
			final int var29 = (-(-var1) * var17) + (-var2 * var14);
			final int var18 = (((anInt1822 << 4) - var1) * var14) + (-var2 * var17);
			final int var28 = (-((anInt1822 << 4) - var1) * var17) + (-var2 * var14);
			final int var20 = (-var1 * var14) + (((anInt1827 << 4) - var2) * var17);
			final int var15 = (-(-var1) * var17) + (((anInt1827 << 4) - var2) * var14);
			final int var21 = (((anInt1822 << 4) - var1) * var14) + (((anInt1827 << 4) - var2) * var17);
			final int var22 = (-((anInt1822 << 4) - var1) * var17) + (((anInt1827 << 4) - var2) * var14);
			int var9;
			int var24;
			if (var23 < var18) {
				var24 = var23;
				var9 = var18;
			} else {
				var24 = var18;
				var9 = var23;
			}

			if (var20 < var24)
				var24 = var20;

			if (var21 < var24)
				var24 = var21;

			if (var20 > var9)
				var9 = var20;

			if (var21 > var9)
				var9 = var21;

			int var16;
			int var30;
			if (var29 < var28) {
				var30 = var29;
				var16 = var28;
			} else {
				var30 = var28;
				var16 = var29;
			}

			if (var15 < var30)
				var30 = var15;

			if (var22 < var30)
				var30 = var22;

			if (var15 > var16)
				var16 = var15;

			if (var22 > var16)
				var16 = var22;

			var24 >>= 12;
			var9 = (var9 + 4095) >> 12;
			var30 >>= 12;
			var16 = (var16 + 4095) >> 12;
			var24 += var3;
			var9 += var3;
			var30 += var4;
			var16 += var4;
			var24 >>= 4;
			var9 = (var9 + 15) >> 4;
			var30 >>= 4;
			var16 = (var16 + 15) >> 4;
			if (var24 < anInt1632)
				var24 = anInt1632;

			if (var9 > anInt1628)
				var9 = anInt1628;

			if (var30 < anInt1630)
				var30 = anInt1630;

			if (var16 > anInt1631)
				var16 = anInt1631;

			var9 = var24 - var9;
			if (var9 < 0) {
				var16 = var30 - var16;
				if (var16 < 0) {
					int var27 = (var30 * anInt1627) + var24;
					final double var36 = 1.6777216E7D / var6;
					final int var35 = (int) Math.floor((Math.sin(var10) * var36) + 0.5D);
					final int var32 = (int) Math.floor((Math.cos(var10) * var36) + 0.5D);
					final int var34 = ((var24 << 4) + 8) - var3;
					final int var38 = ((var30 << 4) + 8) - var4;
					int var33 = (var1 << 8) - ((var38 * var35) >> 4);
					int var12 = (var2 << 8) + ((var38 * var32) >> 4);
					int var7;
					int var8;
					int var13;
					int var19;
					int var25;
					int var26;
					int var31;
					if (var32 == 0) {
						if (var35 == 0)
							for (var26 = var16; var26 < 0; var27 += anInt1627) {
								var7 = var27;
								var25 = var33;
								var13 = var12;
								var19 = var9;
								if ((var33 >= 0) && (var12 >= 0) && ((var33 - (anInt1822 << 12)) < 0)
										&& ((var12 - (anInt1827 << 12)) < 0))
									for (; var19 < 0; ++var19) {
										var8 = anIntArray1823[((var13 >> 12) * anInt1822) + (var25 >> 12)];
										if (var8 != 0)
											anIntArray1629[var7++] = var8;
										else
											++var7;
									}

								++var26;
							}
						else if (var35 < 0)
							for (var26 = var16; var26 < 0; var27 += anInt1627) {
								var7 = var27;
								var25 = var33;
								var13 = var12 + ((var34 * var35) >> 4);
								var19 = var9;
								if ((var33 >= 0) && ((var33 - (anInt1822 << 12)) < 0)) {
									if ((var31 = var13 - (anInt1827 << 12)) >= 0) {
										var31 = (var35 - var31) / var35;
										var19 = var9 + var31;
										var13 += var35 * var31;
										var7 = var27 + var31;
									}

									if ((var31 = (var13 - var35) / var35) > var19)
										var19 = var31;

									while (var19 < 0) {
										var8 = anIntArray1823[((var13 >> 12) * anInt1822) + (var25 >> 12)];
										if (var8 != 0)
											anIntArray1629[var7++] = var8;
										else
											++var7;

										var13 += var35;
										++var19;
									}
								}

								++var26;
								var33 -= var35;
							}
						else
							for (var26 = var16; var26 < 0; var27 += anInt1627) {
								var7 = var27;
								var25 = var33;
								var13 = var12 + ((var34 * var35) >> 4);
								var19 = var9;
								if ((var33 >= 0) && ((var33 - (anInt1822 << 12)) < 0)) {
									if (var13 < 0) {
										var31 = (var35 - 1 - var13) / var35;
										var19 = var9 + var31;
										var13 += var35 * var31;
										var7 = var27 + var31;
									}

									if ((var31 = ((1 + var13) - (anInt1827 << 12) - var35) / var35) > var19)
										var19 = var31;

									while (var19 < 0) {
										var8 = anIntArray1823[((var13 >> 12) * anInt1822) + (var25 >> 12)];
										if (var8 != 0)
											anIntArray1629[var7++] = var8;
										else
											++var7;

										var13 += var35;
										++var19;
									}
								}

								++var26;
								var33 -= var35;
							}
					} else if (var32 < 0) {
						if (var35 == 0)
							for (var26 = var16; var26 < 0; var27 += anInt1627) {
								var7 = var27;
								var25 = var33 + ((var34 * var32) >> 4);
								var13 = var12;
								var19 = var9;
								if ((var12 >= 0) && ((var12 - (anInt1827 << 12)) < 0)) {
									if ((var31 = var25 - (anInt1822 << 12)) >= 0) {
										var31 = (var32 - var31) / var32;
										var19 = var9 + var31;
										var25 += var32 * var31;
										var7 = var27 + var31;
									}

									if ((var31 = (var25 - var32) / var32) > var19)
										var19 = var31;

									while (var19 < 0) {
										var8 = anIntArray1823[((var13 >> 12) * anInt1822) + (var25 >> 12)];
										if (var8 != 0)
											anIntArray1629[var7++] = var8;
										else
											++var7;

										var25 += var32;
										++var19;
									}
								}

								++var26;
								var12 += var32;
							}
						else if (var35 < 0)
							for (var26 = var16; var26 < 0; var27 += anInt1627) {
								var7 = var27;
								var25 = var33 + ((var34 * var32) >> 4);
								var13 = var12 + ((var34 * var35) >> 4);
								var19 = var9;
								if ((var31 = var25 - (anInt1822 << 12)) >= 0) {
									var31 = (var32 - var31) / var32;
									var19 = var9 + var31;
									var25 += var32 * var31;
									var13 += var35 * var31;
									var7 = var27 + var31;
								}

								if ((var31 = (var25 - var32) / var32) > var19)
									var19 = var31;

								if ((var31 = var13 - (anInt1827 << 12)) >= 0) {
									var31 = (var35 - var31) / var35;
									var19 += var31;
									var25 += var32 * var31;
									var13 += var35 * var31;
									var7 += var31;
								}

								if ((var31 = (var13 - var35) / var35) > var19)
									var19 = var31;

								while (var19 < 0) {
									var8 = anIntArray1823[((var13 >> 12) * anInt1822) + (var25 >> 12)];
									if (var8 != 0)
										anIntArray1629[var7++] = var8;
									else
										++var7;

									var25 += var32;
									var13 += var35;
									++var19;
								}

								++var26;
								var33 -= var35;
								var12 += var32;
							}
						else
							for (var26 = var16; var26 < 0; var27 += anInt1627) {
								var7 = var27;
								var25 = var33 + ((var34 * var32) >> 4);
								var13 = var12 + ((var34 * var35) >> 4);
								var19 = var9;
								if ((var31 = var25 - (anInt1822 << 12)) >= 0) {
									var31 = (var32 - var31) / var32;
									var19 = var9 + var31;
									var25 += var32 * var31;
									var13 += var35 * var31;
									var7 = var27 + var31;
								}

								if ((var31 = (var25 - var32) / var32) > var19)
									var19 = var31;

								if (var13 < 0) {
									var31 = (var35 - 1 - var13) / var35;
									var19 += var31;
									var25 += var32 * var31;
									var13 += var35 * var31;
									var7 += var31;
								}

								if ((var31 = ((1 + var13) - (anInt1827 << 12) - var35) / var35) > var19)
									var19 = var31;

								while (var19 < 0) {
									var8 = anIntArray1823[((var13 >> 12) * anInt1822) + (var25 >> 12)];
									if (var8 != 0)
										anIntArray1629[var7++] = var8;
									else
										++var7;

									var25 += var32;
									var13 += var35;
									++var19;
								}

								++var26;
								var33 -= var35;
								var12 += var32;
							}
					} else if (var35 == 0)
						for (var26 = var16; var26 < 0; var27 += anInt1627) {
							var7 = var27;
							var25 = var33 + ((var34 * var32) >> 4);
							var13 = var12;
							var19 = var9;
							if ((var12 >= 0) && ((var12 - (anInt1827 << 12)) < 0)) {
								if (var25 < 0) {
									var31 = (var32 - 1 - var25) / var32;
									var19 = var9 + var31;
									var25 += var32 * var31;
									var7 = var27 + var31;
								}

								if ((var31 = ((1 + var25) - (anInt1822 << 12) - var32) / var32) > var19)
									var19 = var31;

								while (var19 < 0) {
									var8 = anIntArray1823[((var13 >> 12) * anInt1822) + (var25 >> 12)];
									if (var8 != 0)
										anIntArray1629[var7++] = var8;
									else
										++var7;

									var25 += var32;
									++var19;
								}
							}

							++var26;
							var12 += var32;
						}
					else if (var35 < 0)
						for (var26 = var16; var26 < 0; var27 += anInt1627) {
							var7 = var27;
							var25 = var33 + ((var34 * var32) >> 4);
							var13 = var12 + ((var34 * var35) >> 4);
							var19 = var9;
							if (var25 < 0) {
								var31 = (var32 - 1 - var25) / var32;
								var19 = var9 + var31;
								var25 += var32 * var31;
								var13 += var35 * var31;
								var7 = var27 + var31;
							}

							if ((var31 = ((1 + var25) - (anInt1822 << 12) - var32) / var32) > var19)
								var19 = var31;

							if ((var31 = var13 - (anInt1827 << 12)) >= 0) {
								var31 = (var35 - var31) / var35;
								var19 += var31;
								var25 += var32 * var31;
								var13 += var35 * var31;
								var7 += var31;
							}

							if ((var31 = (var13 - var35) / var35) > var19)
								var19 = var31;

							while (var19 < 0) {
								var8 = anIntArray1823[((var13 >> 12) * anInt1822) + (var25 >> 12)];
								if (var8 != 0)
									anIntArray1629[var7++] = var8;
								else
									++var7;

								var25 += var32;
								var13 += var35;
								++var19;
							}

							++var26;
							var33 -= var35;
							var12 += var32;
						}
					else
						for (var26 = var16; var26 < 0; var27 += anInt1627) {
							var7 = var27;
							var25 = var33 + ((var34 * var32) >> 4);
							var13 = var12 + ((var34 * var35) >> 4);
							var19 = var9;
							if (var25 < 0) {
								var31 = (var32 - 1 - var25) / var32;
								var19 = var9 + var31;
								var25 += var32 * var31;
								var13 += var35 * var31;
								var7 = var27 + var31;
							}

							if ((var31 = ((1 + var25) - (anInt1822 << 12) - var32) / var32) > var19)
								var19 = var31;

							if (var13 < 0) {
								var31 = (var35 - 1 - var13) / var35;
								var19 += var31;
								var25 += var32 * var31;
								var13 += var35 * var31;
								var7 += var31;
							}

							if ((var31 = ((1 + var13) - (anInt1827 << 12) - var35) / var35) > var19)
								var19 = var31;

							while (var19 < 0) {
								var8 = anIntArray1823[((var13 >> 12) * anInt1822) + (var25 >> 12)];
								if (var8 != 0)
									anIntArray1629[var7++] = var8;
								else
									++var7;

								var25 += var32;
								var13 += var35;
								++var19;
							}

							++var26;
							var33 -= var35;
							var12 += var32;
						}

				}
			}
		}
	}

	public void method978(int var1, int var2, int var3, int var4) {
		if ((var3 > 0) && (var4 > 0)) {
			final int var6 = anInt1822;
			final int var7 = anInt1827;
			int var8 = 0;
			int var9 = 0;
			final int var10 = anInt1826;
			final int var11 = anInt1828;
			final int var14 = (var10 << 16) / var3;
			final int var12 = (var11 << 16) / var4;
			int var5;
			if (anInt1824 > 0) {
				var5 = (((anInt1824 << 16) + var14) - 1) / var14;
				var1 += var5;
				var8 += (var5 * var14) - (anInt1824 << 16);
			}

			if (anInt1825 > 0) {
				var5 = (((anInt1825 << 16) + var12) - 1) / var12;
				var2 += var5;
				var9 += (var5 * var12) - (anInt1825 << 16);
			}

			if (var6 < var10)
				var3 = ((((var6 << 16) - var8) + var14) - 1) / var14;

			if (var7 < var11)
				var4 = ((((var7 << 16) - var9) + var12) - 1) / var12;

			var5 = var1 + (var2 * anInt1627);
			int var15 = anInt1627 - var3;
			if ((var2 + var4) > anInt1631)
				var4 -= (var2 + var4) - anInt1631;

			int var13;
			if (var2 < anInt1630) {
				var13 = anInt1630 - var2;
				var4 -= var13;
				var5 += var13 * anInt1627;
				var9 += var12 * var13;
			}

			if ((var1 + var3) > anInt1628) {
				var13 = (var1 + var3) - anInt1628;
				var3 -= var13;
				var15 += var13;
			}

			if (var1 < anInt1632) {
				var13 = anInt1632 - var1;
				var3 -= var13;
				var5 += var13;
				var8 += var14 * var13;
				var15 += var13;
			}

			method982(anIntArray1629, anIntArray1823, 0, var8, var9, var5, var15, var3, var4, var14, var12, var6);
		}
	}

	public void method979() {
		if ((anInt1822 != anInt1826) || (anInt1827 != anInt1828)) {
			final int[] var2 = new int[anInt1826 * anInt1828];

			for (int var1 = 0; var1 < anInt1827; ++var1)
				for (int var3 = 0; var3 < anInt1822; ++var3)
					var2[((var1 + anInt1825) * anInt1826) + var3 + anInt1824] = anIntArray1823[(var1 * anInt1822)
							+ var3];

			anIntArray1823 = var2;
			anInt1822 = anInt1826;
			anInt1827 = anInt1828;
			anInt1824 = 0;
			anInt1825 = 0;
		}
	}

	public void method980(int var1, int var2, final int var3) {
		var1 += anInt1824;
		var2 += anInt1825;
		int var4 = var1 + (var2 * anInt1627);
		int var6 = 0;
		int var8 = anInt1827;
		int var7 = anInt1822;
		int var10 = anInt1627 - var7;
		int var9 = 0;
		int var5;
		if (var2 < anInt1630) {
			var5 = anInt1630 - var2;
			var8 -= var5;
			var2 = anInt1630;
			var6 += var5 * var7;
			var4 += var5 * anInt1627;
		}

		if ((var2 + var8) > anInt1631)
			var8 -= (var2 + var8) - anInt1631;

		if (var1 < anInt1632) {
			var5 = anInt1632 - var1;
			var7 -= var5;
			var1 = anInt1632;
			var6 += var5;
			var4 += var5;
			var9 += var5;
			var10 += var5;
		}

		if ((var1 + var7) > anInt1628) {
			var5 = (var1 + var7) - anInt1628;
			var7 -= var5;
			var9 += var5;
			var10 += var5;
		}

		if ((var7 > 0) && (var8 > 0))
			method971(anIntArray1629, anIntArray1823, 0, var6, var4, var7, var8, var10, var9, var3);
	}

	public void method981(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anIntArray1823.length; ++var4) {
			final int var6 = anIntArray1823[var4];
			if (var6 != 0) {
				int var5 = (var6 >> 16) & 255;
				var5 += var1;
				if (var5 < 1)
					var5 = 1;
				else if (var5 > 255)
					var5 = 255;

				int var8 = (var6 >> 8) & 255;
				var8 += var2;
				if (var8 < 1)
					var8 = 1;
				else if (var8 > 255)
					var8 = 255;

				int var7 = var6 & 255;
				var7 += var3;
				if (var7 < 1)
					var7 = 1;
				else if (var7 > 255)
					var7 = 255;

				anIntArray1823[var4] = (var5 << 16) + (var8 << 8) + var7;
			}
		}

	}

	static void method982(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, final int var6,
			final int var7, final int var8, final int var9, final int var10, final int var11) {
		final int var12 = var3;

		for (int var15 = -var8; var15 < 0; ++var15) {
			final int var14 = (var4 >> 16) * var11;

			for (int var13 = -var7; var13 < 0; ++var13) {
				var2 = var1[(var3 >> 16) + var14];
				if (var2 != 0)
					var0[var5++] = var2;
				else
					++var5;

				var3 += var9;
			}

			var4 += var10;
			var3 = var12;
			var5 += var6;
		}

	}

	Class131_Sub20_Sub17_Sub3() {
	}

	static void method983(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, final int var6,
			final int var7, final int var8) {
		final int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			for (var11 = var9; var11 < 0; ++var11) {
				var2 = var1[var3++];
				if (var2 != 0)
					var0[var4++] = var2;
				else
					++var4;

				var2 = var1[var3++];
				if (var2 != 0)
					var0[var4++] = var2;
				else
					++var4;

				var2 = var1[var3++];
				if (var2 != 0)
					var0[var4++] = var2;
				else
					++var4;

				var2 = var1[var3++];
				if (var2 != 0)
					var0[var4++] = var2;
				else
					++var4;
			}

			for (var11 = var5; var11 < 0; ++var11) {
				var2 = var1[var3++];
				if (var2 != 0)
					var0[var4++] = var2;
				else
					++var4;
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method984(int var1, int var2, final int var3, final int var4, final int var5, final int var6,
			final double var7, final int var9) {
		try {
			final int var10 = -var3 / 2;
			final int var11 = -var4 / 2;
			int var12 = (int) (Math.sin(var7) * 65536.0D);
			int var13 = (int) (Math.cos(var7) * 65536.0D);
			var12 = (var12 * var9) >> 8;
			var13 = (var13 * var9) >> 8;
			int var14 = (var5 << 16) + (var11 * var12) + (var10 * var13);
			int var15 = (var6 << 16) + ((var11 * var13) - (var10 * var12));
			int var16 = var1 + (var2 * anInt1627);

			for (var2 = 0; var2 < var4; ++var2) {
				int var17 = var16;
				int var18 = var14;
				int var19 = var15;

				for (var1 = -var3; var1 < 0; ++var1) {
					final int var20 = anIntArray1823[(var18 >> 16) + ((var19 >> 16) * anInt1822)];
					if (var20 != 0)
						anIntArray1629[var17++] = var20;
					else
						++var17;

					var18 += var13;
					var19 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += anInt1627;
			}
		} catch (final Exception var22) {
			;
		}

	}

	public void method985(int var1, int var2, final int var3, final int var4) {
		var1 += anInt1824;
		var2 += anInt1825;
		int var10 = var1 + (var2 * anInt1627);
		int var8 = 0;
		int var9 = anInt1827;
		int var7 = anInt1822;
		int var5 = anInt1627 - var7;
		int var11 = 0;
		int var6;
		if (var2 < anInt1630) {
			var6 = anInt1630 - var2;
			var9 -= var6;
			var2 = anInt1630;
			var8 += var6 * var7;
			var10 += var6 * anInt1627;
		}

		if ((var2 + var9) > anInt1631)
			var9 -= (var2 + var9) - anInt1631;

		if (var1 < anInt1632) {
			var6 = anInt1632 - var1;
			var7 -= var6;
			var1 = anInt1632;
			var8 += var6;
			var10 += var6;
			var11 += var6;
			var5 += var6;
		}

		if ((var1 + var7) > anInt1628) {
			var6 = (var1 + var7) - anInt1628;
			var7 -= var6;
			var11 += var6;
			var5 += var6;
		}

		if ((var7 > 0) && (var9 > 0))
			method969(anIntArray1629, anIntArray1823, 0, var8, var10, var7, var9, var5, var11, var3, var4);
	}
}
