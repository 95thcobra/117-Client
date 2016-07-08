public class Class131_Sub4_Sub1 extends Class131_Sub4 {
	int anInt1614;
	int anInt1608;
	boolean aBool1616;
	int anInt1607;
	int anInt1606;
	int anInt1609;
	int anInt1610;
	int anInt1617;
	int anInt1615;
	int anInt1618;
	int anInt1619;
	int anInt1620;
	int anInt1613;
	int anInt1611;
	int anInt1612;

	static int method793(final int var0, final int var1) {
		return var1 < 0 ? -var0 : (int) ((var0 * Math.sqrt(var1 * 1.220703125E-4D)) + 0.5D);
	}

	@Override
	int method537() {
		int var1 = (anInt1615 * 3) >> 6;
		var1 = (var1 ^ (var1 >> 31)) + (var1 >>> 31);
		if (anInt1613 == 0)
			var1 -= (var1 * anInt1610) / (((Class131_Sub2_Sub1) aClass131_Sub2_995).aByteArray1597.length << 8);
		else if (anInt1613 >= 0)
			var1 -= (var1 * anInt1614) / ((Class131_Sub2_Sub1) aClass131_Sub2_995).aByteArray1597.length;

		return var1 > 255 ? 255 : var1;
	}

	Class131_Sub4_Sub1(final Class131_Sub2_Sub1 var1, final int var2, final int var3) {
		aClass131_Sub2_995 = var1;
		anInt1614 = var1.anInt1596;
		anInt1608 = var1.anInt1599;
		aBool1616 = var1.aBool1600;
		anInt1607 = var2;
		anInt1606 = var3;
		anInt1609 = 8192;
		anInt1610 = 0;
		method821();
	}

	public static Class131_Sub4_Sub1 method794(final Class131_Sub2_Sub1 var0, final int var1, final int var2) {
		return (var0.aByteArray1597 != null) && (var0.aByteArray1597.length != 0) ? new Class131_Sub4_Sub1(var0,
				(int) ((var0.anInt1598 * 256L * var1) / (Class17.anInt162 * 100)), var2 << 6) : null;
	}

	public static Class131_Sub4_Sub1 method795(final Class131_Sub2_Sub1 var0, final int var1, final int var2,
			final int var3) {
		return (var0.aByteArray1597 != null) && (var0.aByteArray1597.length != 0)
				? new Class131_Sub4_Sub1(var0, var1, var2, var3) : null;
	}

	public synchronized void method796(final int var1) {
		method824(var1 << 6, method797());
	}

	public synchronized int method797() {
		return anInt1609 < 0 ? -1 : anInt1609;
	}

	public synchronized void method798(int var1) {
		final int var2 = ((Class131_Sub2_Sub1) aClass131_Sub2_995).aByteArray1597.length << 8;
		if (var1 < -1)
			var1 = -1;

		if (var1 > var2)
			var1 = var2;

		anInt1610 = var1;
	}

	public synchronized void method799(final boolean var1) {
		anInt1607 = (anInt1607 ^ (anInt1607 >> 31)) + (anInt1607 >>> 31);
		anInt1607 = -anInt1607;
	}

	void method800() {
		if (anInt1617 != 0) {
			if (anInt1606 == Integer.MIN_VALUE)
				anInt1606 = 0;

			anInt1617 = 0;
			method821();
		}

	}

	public synchronized void method801(int var1) {
		if (var1 == 0) {
			method814(0);
			method501();
		} else if ((anInt1611 == 0) && (anInt1612 == 0)) {
			anInt1617 = 0;
			anInt1606 = 0;
			anInt1615 = 0;
			method501();
		} else {
			int var2 = -anInt1615;
			if (anInt1615 > var2)
				var2 = anInt1615;

			if (-anInt1611 > var2)
				var2 = -anInt1611;

			if (anInt1611 > var2)
				var2 = anInt1611;

			if (-anInt1612 > var2)
				var2 = -anInt1612;

			if (anInt1612 > var2)
				var2 = anInt1612;

			if (var1 > var2)
				var1 = var2;

			anInt1617 = var1;
			anInt1606 = Integer.MIN_VALUE;
			anInt1618 = -anInt1615 / var1;
			anInt1619 = -anInt1611 / var1;
			anInt1620 = -anInt1612 / var1;
		}
	}

	@Override
	protected Class131_Sub4 method539() {
		return null;
	}

	@Override
	protected Class131_Sub4 method543() {
		return null;
	}

	@Override
	protected int method538() {
		return (anInt1606 == 0) && (anInt1617 == 0) ? 0 : 1;
	}

	public synchronized void method802(final int var1) {
		anInt1613 = var1;
	}

	@Override
	public synchronized void method542(int var1) {
		if (anInt1617 > 0)
			if (var1 >= anInt1617) {
				if (anInt1606 == Integer.MIN_VALUE) {
					anInt1606 = 0;
					anInt1612 = 0;
					anInt1611 = 0;
					anInt1615 = 0;
					method501();
					var1 = anInt1617;
				}

				anInt1617 = 0;
				method821();
			} else {
				anInt1615 += anInt1618 * var1;
				anInt1611 += anInt1619 * var1;
				anInt1612 += anInt1620 * var1;
				anInt1617 -= var1;
			}

		final Class131_Sub2_Sub1 var3 = (Class131_Sub2_Sub1) aClass131_Sub2_995;
		final int var6 = anInt1614 << 8;
		final int var5 = anInt1608 << 8;
		final int var4 = var3.aByteArray1597.length << 8;
		final int var7 = var5 - var6;
		if (var7 <= 0)
			anInt1613 = 0;

		if (anInt1610 < 0) {
			if (anInt1607 <= 0) {
				method800();
				method501();
				return;
			}

			anInt1610 = 0;
		}

		if (anInt1610 >= var4) {
			if (anInt1607 >= 0) {
				method800();
				method501();
				return;
			}

			anInt1610 = var4 - 1;
		}

		anInt1610 += anInt1607 * var1;
		if (anInt1613 < 0) {
			if (!aBool1616) {
				if (anInt1607 < 0) {
					if (anInt1610 >= var6)
						return;

					anInt1610 = var5 - 1 - ((var5 - 1 - anInt1610) % var7);
				} else {
					if (anInt1610 < var5)
						return;

					anInt1610 = var6 + ((anInt1610 - var6) % var7);
				}

			} else {
				if (anInt1607 < 0) {
					if (anInt1610 >= var6)
						return;

					anInt1610 = (var6 + var6) - 1 - anInt1610;
					anInt1607 = -anInt1607;
				}

				while (anInt1610 >= var5) {
					anInt1610 = (var5 + var5) - 1 - anInt1610;
					anInt1607 = -anInt1607;
					if (anInt1610 >= var6)
						return;

					anInt1610 = (var6 + var6) - 1 - anInt1610;
					anInt1607 = -anInt1607;
				}

			}
		} else {
			if (anInt1613 > 0)
				if (!aBool1616) {
					int var2;
					if (anInt1607 < 0) {
						if (anInt1610 >= var6)
							return;

						var2 = (var5 - 1 - anInt1610) / var7;
						if (var2 < anInt1613) {
							anInt1610 += var7 * var2;
							anInt1613 -= var2;
							return;
						}

						anInt1610 += var7 * anInt1613;
						anInt1613 = 0;
					} else {
						if (anInt1610 < var5)
							return;

						var2 = (anInt1610 - var6) / var7;
						if (var2 < anInt1613) {
							anInt1610 -= var7 * var2;
							anInt1613 -= var2;
							return;
						}

						anInt1610 -= var7 * anInt1613;
						anInt1613 = 0;
					}
				} else
					label166: {
						if (anInt1607 < 0) {
							if (anInt1610 >= var6)
								return;

							anInt1610 = (var6 + var6) - 1 - anInt1610;
							anInt1607 = -anInt1607;
							if (--anInt1613 == 0)
								break label166;
						}

						do {
							if (anInt1610 < var5)
								return;

							anInt1610 = (var5 + var5) - 1 - anInt1610;
							anInt1607 = -anInt1607;
							if (--anInt1613 == 0)
								break;

							if (anInt1610 >= var6)
								return;

							anInt1610 = (var6 + var6) - 1 - anInt1610;
							anInt1607 = -anInt1607;
						} while (--anInt1613 != 0);
					}

			if (anInt1607 < 0) {
				if (anInt1610 < 0) {
					anInt1610 = -1;
					method800();
					method501();
				}
			} else if (anInt1610 >= var4) {
				anInt1610 = var4;
				method800();
				method501();
			}

		}
	}

	int method803(final int[] var1, int var2, final int var3, final int var4, final int var5) {
		while (true) {
			if (anInt1617 > 0) {
				int var6 = var2 + anInt1617;
				if (var6 > var4)
					var6 = var4;

				anInt1617 += var2;
				if ((anInt1607 == 256) && ((anInt1610 & 255) == 0)) {
					if (Class17.aBool166)
						var2 = method822(0, ((Class131_Sub2_Sub1) aClass131_Sub2_995).aByteArray1597, var1, anInt1610,
								var2, anInt1611, anInt1612, anInt1619, anInt1620, 0, var6, var3, this);
					else
						var2 = method813(((Class131_Sub2_Sub1) aClass131_Sub2_995).aByteArray1597, var1, anInt1610,
								var2, anInt1615, anInt1618, 0, var6, var3, this);
				} else if (Class17.aBool166)
					var2 = method828(0, 0, ((Class131_Sub2_Sub1) aClass131_Sub2_995).aByteArray1597, var1, anInt1610,
							var2, anInt1611, anInt1612, anInt1619, anInt1620, 0, var6, var3, this, anInt1607, var5);
				else
					var2 = method815(0, 0, ((Class131_Sub2_Sub1) aClass131_Sub2_995).aByteArray1597, var1, anInt1610,
							var2, anInt1615, anInt1618, 0, var6, var3, this, anInt1607, var5);

				anInt1617 -= var2;
				if (anInt1617 != 0)
					return var2;

				if (!method805())
					continue;

				return var4;
			}

			if ((anInt1607 == 256) && ((anInt1610 & 255) == 0)) {
				if (Class17.aBool166)
					return method806(0, ((Class131_Sub2_Sub1) aClass131_Sub2_995).aByteArray1597, var1, anInt1610, var2,
							anInt1611, anInt1612, 0, var4, var3, this);

				return method827(((Class131_Sub2_Sub1) aClass131_Sub2_995).aByteArray1597, var1, anInt1610, var2,
						anInt1615, 0, var4, var3, this);
			}

			if (Class17.aBool166)
				return method810(0, 0, ((Class131_Sub2_Sub1) aClass131_Sub2_995).aByteArray1597, var1, anInt1610, var2,
						anInt1611, anInt1612, 0, var4, var3, this, anInt1607, var5);

			return method809(0, 0, ((Class131_Sub2_Sub1) aClass131_Sub2_995).aByteArray1597, var1, anInt1610, var2,
					anInt1615, 0, var4, var3, this, anInt1607, var5);
		}
	}

	int method804(final int[] var1, int var2, final int var3, final int var4, final int var5) {
		while (true) {
			if (anInt1617 > 0) {
				int var6 = var2 + anInt1617;
				if (var6 > var4)
					var6 = var4;

				anInt1617 += var2;
				if ((anInt1607 == -256) && ((anInt1610 & 255) == 0)) {
					if (Class17.aBool166)
						var2 = method823(0, ((Class131_Sub2_Sub1) aClass131_Sub2_995).aByteArray1597, var1, anInt1610,
								var2, anInt1611, anInt1612, anInt1619, anInt1620, 0, var6, var3, this);
					else
						var2 = method830(((Class131_Sub2_Sub1) aClass131_Sub2_995).aByteArray1597, var1, anInt1610,
								var2, anInt1615, anInt1618, 0, var6, var3, this);
				} else if (Class17.aBool166)
					var2 = method817(0, 0, ((Class131_Sub2_Sub1) aClass131_Sub2_995).aByteArray1597, var1, anInt1610,
							var2, anInt1611, anInt1612, anInt1619, anInt1620, 0, var6, var3, this, anInt1607, var5);
				else
					var2 = method816(0, 0, ((Class131_Sub2_Sub1) aClass131_Sub2_995).aByteArray1597, var1, anInt1610,
							var2, anInt1615, anInt1618, 0, var6, var3, this, anInt1607, var5);

				anInt1617 -= var2;
				if (anInt1617 != 0)
					return var2;

				if (!method805())
					continue;

				return var4;
			}

			if ((anInt1607 == -256) && ((anInt1610 & 255) == 0)) {
				if (Class17.aBool166)
					return method808(0, ((Class131_Sub2_Sub1) aClass131_Sub2_995).aByteArray1597, var1, anInt1610, var2,
							anInt1611, anInt1612, 0, var4, var3, this);

				return method807(((Class131_Sub2_Sub1) aClass131_Sub2_995).aByteArray1597, var1, anInt1610, var2,
						anInt1615, 0, var4, var3, this);
			}

			if (Class17.aBool166)
				return method812(0, 0, ((Class131_Sub2_Sub1) aClass131_Sub2_995).aByteArray1597, var1, anInt1610, var2,
						anInt1611, anInt1612, 0, var4, var3, this, anInt1607, var5);

			return method811(0, 0, ((Class131_Sub2_Sub1) aClass131_Sub2_995).aByteArray1597, var1, anInt1610, var2,
					anInt1615, 0, var4, var3, this, anInt1607, var5);
		}
	}

	boolean method805() {
		int var1 = anInt1606;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method831(var1, anInt1609);
			var3 = method793(var1, anInt1609);
		}

		if ((anInt1615 == var1) && (anInt1611 == var2) && (anInt1612 == var3)) {
			if (anInt1606 == Integer.MIN_VALUE) {
				anInt1606 = 0;
				anInt1612 = 0;
				anInt1611 = 0;
				anInt1615 = 0;
				method501();
				return true;
			} else {
				method821();
				return false;
			}
		} else {
			if (anInt1615 < var1) {
				anInt1618 = 1;
				anInt1617 = var1 - anInt1615;
			} else if (anInt1615 > var1) {
				anInt1618 = -1;
				anInt1617 = anInt1615 - var1;
			} else
				anInt1618 = 0;

			if (anInt1611 < var2) {
				anInt1619 = 1;
				if ((anInt1617 == 0) || (anInt1617 > (var2 - anInt1611)))
					anInt1617 = var2 - anInt1611;
			} else if (anInt1611 > var2) {
				anInt1619 = -1;
				if ((anInt1617 == 0) || (anInt1617 > (anInt1611 - var2)))
					anInt1617 = anInt1611 - var2;
			} else
				anInt1619 = 0;

			if (anInt1612 < var3) {
				anInt1620 = 1;
				if ((anInt1617 == 0) || (anInt1617 > (var3 - anInt1612)))
					anInt1617 = var3 - anInt1612;
			} else if (anInt1612 > var3) {
				anInt1620 = -1;
				if ((anInt1617 == 0) || (anInt1617 > (anInt1612 - var3)))
					anInt1617 = anInt1612 - var3;
			} else
				anInt1620 = 0;

			return false;
		}
	}

	static int method806(final int var0, final byte[] var1, final int[] var2, int var3, int var4, int var5, int var6,
			int var7, final int var8, int var9, final Class131_Sub4_Sub1 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = (var4 + var9) - var3) > var8)
			var7 = var8;

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.anInt1610 = var3 << 8;
		return var4 >> 1;
	}

	static int method807(final byte[] var0, final int[] var1, int var2, int var3, int var4, int var5, final int var6,
			int var7, final Class131_Sub4_Sub1 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = (var3 + var2) - (var7 - 1)) > var6)
			var5 = var6;

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4)
			var10001 = var3++;

		var8.anInt1610 = var2 << 8;
		return var3;
	}

	static int method808(final int var0, final byte[] var1, final int[] var2, int var3, int var4, int var5, int var6,
			int var7, final int var8, int var9, final Class131_Sub4_Sub1 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = (var4 + var3) - (var9 - 1)) > var8)
			var7 = var8;

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.anInt1610 = var3 << 8;
		return var4 >> 1;
	}

	static int method809(final int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5,
			final int var6, int var7, final int var8, final int var9, final Class131_Sub4_Sub1 var10, final int var11,
			final int var12) {
		if ((var11 == 0) || ((var7 = var5 + ((((var9 - var4) + var11) - 257) / var11)) > var8))
			var7 = var8;

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += (((var13 << 8) + ((var2[var1 + 1] - var13) * (var4 & 255))) * var6) >> 6;
			var4 += var11;
		}

		if ((var11 == 0) || ((var7 = var5 + ((((var9 - var4) + var11) - 1) / var11)) > var8))
			var7 = var8;

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += (((var13 << 8) + ((var1 - var13) * (var4 & 255))) * var6) >> 6;
		}

		var10.anInt1610 = var4;
		return var5;
	}

	static int method810(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, final int var6,
			final int var7, int var8, final int var9, final int var10, final Class131_Sub4_Sub1 var11, final int var12,
			final int var13) {
		if ((var12 == 0) || ((var8 = var5 + ((((var10 - var4) + var12) - 257) / var12)) > var9))
			var8 = var9;

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + ((var2[var1 + 1] - var14) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
		}

		if ((var12 == 0) || ((var8 = (var5 >> 1) + ((((var10 - var4) + var12) - 1) / var12)) > var9))
			var8 = var9;

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + ((var1 - var14) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
		}

		var11.anInt1610 = var4;
		return var5 >> 1;
	}

	static int method811(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, final int var6,
			int var7, final int var8, final int var9, final Class131_Sub4_Sub1 var10, final int var11,
			final int var12) {
		if ((var11 == 0) || ((var7 = var5 + ((((var9 + 256) - var4) + var11) / var11)) > var8))
			var7 = var8;

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			final byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += (((var13 << 8) + ((var2[var1] - var13) * (var4 & 255))) * var6) >> 6;
			var4 += var11;
		}

		if ((var11 == 0) || ((var7 = var5 + (((var9 - var4) + var11) / var11)) > var8))
			var7 = var8;

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += (((var0 << 8) + ((var2[var4 >> 8] - var0) * (var4 & 255))) * var6) >> 6;
		}

		var10.anInt1610 = var4;
		return var5;
	}

	static int method812(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, final int var6,
			final int var7, int var8, final int var9, final int var10, final Class131_Sub4_Sub1 var11, final int var12,
			final int var13) {
		if ((var12 == 0) || ((var8 = var5 + ((((var10 + 256) - var4) + var12) / var12)) > var9))
			var8 = var9;

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			final byte var14 = var2[var1 - 1];
			var0 = (var14 << 8) + ((var2[var1] - var14) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
		}

		if ((var12 == 0) || ((var8 = (var5 >> 1) + (((var10 - var4) + var12) / var12)) > var9))
			var8 = var9;

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + ((var2[var4 >> 8] - var1) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
		}

		var11.anInt1610 = var4;
		return var5 >> 1;
	}

	static int method813(final byte[] var0, final int[] var1, int var2, int var3, int var4, int var5, int var6,
			final int var7, int var8, final Class131_Sub4_Sub1 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = (var3 + var8) - var2) > var7)
			var6 = var7;

		var9.anInt1611 += var9.anInt1619 * (var6 - var3);
		var9.anInt1612 += var9.anInt1620 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.anInt1615 = var4 >> 2;
		var9.anInt1610 = var2 << 8;
		return var3;
	}

	synchronized void method814(final int var1) {
		method824(var1, method797());
	}

	static int method815(final int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, int var6,
			final int var7, int var8, final int var9, final int var10, final Class131_Sub4_Sub1 var11, final int var12,
			final int var13) {
		var11.anInt1611 -= var11.anInt1619 * var5;
		var11.anInt1612 -= var11.anInt1620 * var5;
		if ((var12 == 0) || ((var8 = var5 + ((((var10 - var4) + var12) - 257) / var12)) > var9))
			var8 = var9;

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += (((var14 << 8) + ((var2[var1 + 1] - var14) * (var4 & 255))) * var6) >> 6;
			var6 += var7;
			var4 += var12;
		}

		if ((var12 == 0) || ((var8 = var5 + ((((var10 - var4) + var12) - 1) / var12)) > var9))
			var8 = var9;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += (((var14 << 8) + ((var1 - var14) * (var4 & 255))) * var6) >> 6;
			var6 += var7;
		}

		var11.anInt1611 += var11.anInt1619 * var5;
		var11.anInt1612 += var11.anInt1620 * var5;
		var11.anInt1615 = var6;
		var11.anInt1610 = var4;
		return var5;
	}

	static int method816(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, int var6,
			final int var7, int var8, final int var9, final int var10, final Class131_Sub4_Sub1 var11, final int var12,
			final int var13) {
		var11.anInt1611 -= var11.anInt1619 * var5;
		var11.anInt1612 -= var11.anInt1620 * var5;
		if ((var12 == 0) || ((var8 = var5 + ((((var10 + 256) - var4) + var12) / var12)) > var9))
			var8 = var9;

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			final byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += (((var14 << 8) + ((var2[var1] - var14) * (var4 & 255))) * var6) >> 6;
			var6 += var7;
			var4 += var12;
		}

		if ((var12 == 0) || ((var8 = var5 + (((var10 - var4) + var12) / var12)) > var9))
			var8 = var9;

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += (((var0 << 8) + ((var2[var4 >> 8] - var0) * (var4 & 255))) * var6) >> 6;
			var6 += var7;
		}

		var11.anInt1611 += var11.anInt1619 * var5;
		var11.anInt1612 += var11.anInt1620 * var5;
		var11.anInt1615 = var6;
		var11.anInt1610 = var4;
		return var5;
	}

	static int method817(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, int var6,
			int var7, final int var8, final int var9, int var10, final int var11, final int var12,
			final Class131_Sub4_Sub1 var13, final int var14, final int var15) {
		var13.anInt1615 -= var13.anInt1618 * var5;
		if ((var14 == 0) || ((var10 = var5 + ((((var12 + 256) - var4) + var14) / var14)) > var11))
			var10 = var11;

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			final byte var16 = var2[var1 - 1];
			var0 = (var16 << 8) + ((var2[var1] - var16) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
			var7 += var9;
		}

		if ((var14 == 0) || ((var10 = (var5 >> 1) + (((var12 - var4) + var14) / var14)) > var11))
			var10 = var11;

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + ((var2[var4 >> 8] - var1) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.anInt1615 += var13.anInt1618 * var5;
		var13.anInt1611 = var6;
		var13.anInt1612 = var7;
		var13.anInt1610 = var4;
		return var5;
	}

	public synchronized int method818() {
		return anInt1607 >= 0 ? anInt1607 : -anInt1607;
	}

	public boolean method819() {
		return (anInt1610 < 0) || (anInt1610 >= (((Class131_Sub2_Sub1) aClass131_Sub2_995).aByteArray1597.length << 8));
	}

	public synchronized void method820(int var1, final int var2, final int var3) {
		if (var1 == 0)
			method824(var2, var3);
		else {
			final int var4 = method831(var2, var3);
			final int var6 = method793(var2, var3);
			if ((anInt1611 == var4) && (anInt1612 == var6))
				anInt1617 = 0;
			else {
				int var5 = var2 - anInt1615;
				if ((anInt1615 - var2) > var5)
					var5 = anInt1615 - var2;

				if ((var4 - anInt1611) > var5)
					var5 = var4 - anInt1611;

				if ((anInt1611 - var4) > var5)
					var5 = anInt1611 - var4;

				if ((var6 - anInt1612) > var5)
					var5 = var6 - anInt1612;

				if ((anInt1612 - var6) > var5)
					var5 = anInt1612 - var6;

				if (var1 > var5)
					var1 = var5;

				anInt1617 = var1;
				anInt1606 = var2;
				anInt1609 = var3;
				anInt1618 = (var2 - anInt1615) / var1;
				anInt1619 = (var4 - anInt1611) / var1;
				anInt1620 = (var6 - anInt1612) / var1;
			}
		}
	}

	void method821() {
		anInt1615 = anInt1606;
		anInt1611 = method831(anInt1606, anInt1609);
		anInt1612 = method793(anInt1606, anInt1609);
	}

	static int method822(final int var0, final byte[] var1, final int[] var2, int var3, int var4, int var5, int var6,
			int var7, int var8, int var9, final int var10, int var11, final Class131_Sub4_Sub1 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = (var4 + var11) - var3) > var10)
			var9 = var10;

		var12.anInt1615 += var12.anInt1618 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.anInt1611 = var5 >> 2;
		var12.anInt1612 = var6 >> 2;
		var12.anInt1610 = var3 << 8;
		return var4 >> 1;
	}

	Class131_Sub4_Sub1(final Class131_Sub2_Sub1 var1, final int var2, final int var3, final int var4) {
		aClass131_Sub2_995 = var1;
		anInt1614 = var1.anInt1596;
		anInt1608 = var1.anInt1599;
		aBool1616 = var1.aBool1600;
		anInt1607 = var2;
		anInt1606 = var3;
		anInt1609 = var4;
		anInt1610 = 0;
		method821();
	}

	static int method823(final int var0, final byte[] var1, final int[] var2, int var3, int var4, int var5, int var6,
			int var7, int var8, int var9, final int var10, int var11, final Class131_Sub4_Sub1 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = (var4 + var3) - (var11 - 1)) > var10)
			var9 = var10;

		var12.anInt1615 += var12.anInt1618 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.anInt1611 = var5 >> 2;
		var12.anInt1612 = var6 >> 2;
		var12.anInt1610 = var3 << 8;
		return var4 >> 1;
	}

	synchronized void method824(final int var1, final int var2) {
		anInt1606 = var1;
		anInt1609 = var2;
		anInt1617 = 0;
		method821();
	}

	public synchronized int method825() {
		return anInt1606 == Integer.MIN_VALUE ? 0 : anInt1606;
	}

	public synchronized void method826(final int var1, final int var2) {
		method820(var1, var2, method797());
	}

	static int method827(final byte[] var0, final int[] var1, int var2, int var3, int var4, int var5, final int var6,
			int var7, final Class131_Sub4_Sub1 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = (var3 + var7) - var2) > var6)
			var5 = var6;

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4)
			var10001 = var3++;

		var8.anInt1610 = var2 << 8;
		return var3;
	}

	static int method828(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, int var6,
			int var7, final int var8, final int var9, int var10, final int var11, final int var12,
			final Class131_Sub4_Sub1 var13, final int var14, final int var15) {
		var13.anInt1615 -= var13.anInt1618 * var5;
		if ((var14 == 0) || ((var10 = var5 + ((((var12 - var4) + var14) - 257) / var14)) > var11))
			var10 = var11;

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + ((var2[var1 + 1] - var16) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
			var7 += var9;
		}

		if ((var14 == 0) || ((var10 = (var5 >> 1) + ((((var12 - var4) + var14) - 1) / var14)) > var11))
			var10 = var11;

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + ((var1 - var16) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.anInt1615 += var13.anInt1618 * var5;
		var13.anInt1611 = var6;
		var13.anInt1612 = var7;
		var13.anInt1610 = var4;
		return var5;
	}

	@Override
	public synchronized void method541(final int[] var1, final int var2, int var3) {
		if ((anInt1606 == 0) && (anInt1617 == 0))
			method542(var3);
		else {
			final Class131_Sub2_Sub1 var7 = (Class131_Sub2_Sub1) aClass131_Sub2_995;
			final int var6 = anInt1614 << 8;
			final int var4 = anInt1608 << 8;
			final int var5 = var7.aByteArray1597.length << 8;
			final int var8 = var4 - var6;
			if (var8 <= 0)
				anInt1613 = 0;

			int var9 = var2;
			var3 += var2;
			if (anInt1610 < 0) {
				if (anInt1607 <= 0) {
					method800();
					method501();
					return;
				}

				anInt1610 = 0;
			}

			if (anInt1610 >= var5) {
				if (anInt1607 >= 0) {
					method800();
					method501();
					return;
				}

				anInt1610 = var5 - 1;
			}

			if (anInt1613 < 0) {
				if (aBool1616) {
					if (anInt1607 < 0) {
						var9 = method804(var1, var2, var6, var3, var7.aByteArray1597[anInt1614]);
						if (anInt1610 >= var6)
							return;

						anInt1610 = (var6 + var6) - 1 - anInt1610;
						anInt1607 = -anInt1607;
					}

					while (true) {
						var9 = method803(var1, var9, var4, var3, var7.aByteArray1597[anInt1608 - 1]);
						if (anInt1610 < var4)
							return;

						anInt1610 = (var4 + var4) - 1 - anInt1610;
						anInt1607 = -anInt1607;
						var9 = method804(var1, var9, var6, var3, var7.aByteArray1597[anInt1614]);
						if (anInt1610 >= var6)
							return;

						anInt1610 = (var6 + var6) - 1 - anInt1610;
						anInt1607 = -anInt1607;
					}
				} else if (anInt1607 < 0)
					while (true) {
						var9 = method804(var1, var9, var6, var3, var7.aByteArray1597[anInt1608 - 1]);
						if (anInt1610 >= var6)
							return;

						anInt1610 = var4 - 1 - ((var4 - 1 - anInt1610) % var8);
					}
				else
					while (true) {
						var9 = method803(var1, var9, var4, var3, var7.aByteArray1597[anInt1614]);
						if (anInt1610 < var4)
							return;

						anInt1610 = var6 + ((anInt1610 - var6) % var8);
					}
			} else {
				if (anInt1613 > 0)
					if (aBool1616)
						label178: {
							if (anInt1607 < 0) {
								var9 = method804(var1, var2, var6, var3, var7.aByteArray1597[anInt1614]);
								if (anInt1610 >= var6)
									return;

								anInt1610 = (var6 + var6) - 1 - anInt1610;
								anInt1607 = -anInt1607;
								if (--anInt1613 == 0)
									break label178;
							}

							do {
								var9 = method803(var1, var9, var4, var3, var7.aByteArray1597[anInt1608 - 1]);
								if (anInt1610 < var4)
									return;

								anInt1610 = (var4 + var4) - 1 - anInt1610;
								anInt1607 = -anInt1607;
								if (--anInt1613 == 0)
									break;

								var9 = method804(var1, var9, var6, var3, var7.aByteArray1597[anInt1614]);
								if (anInt1610 >= var6)
									return;

								anInt1610 = (var6 + var6) - 1 - anInt1610;
								anInt1607 = -anInt1607;
							} while (--anInt1613 != 0);
						}
					else {
						int var10;
						if (anInt1607 < 0)
							while (true) {
								var9 = method804(var1, var9, var6, var3, var7.aByteArray1597[anInt1608 - 1]);
								if (anInt1610 >= var6)
									return;

								var10 = (var4 - 1 - anInt1610) / var8;
								if (var10 >= anInt1613) {
									anInt1610 += var8 * anInt1613;
									anInt1613 = 0;
									break;
								}

								anInt1610 += var8 * var10;
								anInt1613 -= var10;
							}
						else
							while (true) {
								var9 = method803(var1, var9, var4, var3, var7.aByteArray1597[anInt1614]);
								if (anInt1610 < var4)
									return;

								var10 = (anInt1610 - var6) / var8;
								if (var10 >= anInt1613) {
									anInt1610 -= var8 * anInt1613;
									anInt1613 = 0;
									break;
								}

								anInt1610 -= var8 * var10;
								anInt1613 -= var10;
							}
					}

				if (anInt1607 < 0) {
					method804(var1, var9, 0, var3, 0);
					if (anInt1610 < 0) {
						anInt1610 = -1;
						method800();
						method501();
					}
				} else {
					method803(var1, var9, var5, var3, 0);
					if (anInt1610 >= var5) {
						anInt1610 = var5;
						method800();
						method501();
					}
				}

			}
		}
	}

	public synchronized void method829(final int var1) {
		if (anInt1607 < 0)
			anInt1607 = -var1;
		else
			anInt1607 = var1;

	}

	static int method830(final byte[] var0, final int[] var1, int var2, int var3, int var4, int var5, int var6,
			final int var7, int var8, final Class131_Sub4_Sub1 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = (var3 + var2) - (var8 - 1)) > var7)
			var6 = var7;

		var9.anInt1611 += var9.anInt1619 * (var6 - var3);
		var9.anInt1612 += var9.anInt1620 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.anInt1615 = var4 >> 2;
		var9.anInt1610 = var2 << 8;
		return var3;
	}

	static int method831(final int var0, final int var1) {
		return var1 < 0 ? var0 : (int) ((var0 * Math.sqrt((16384 - var1) * 1.220703125E-4D)) + 0.5D);
	}

	public boolean method832() {
		return anInt1617 != 0;
	}
}
