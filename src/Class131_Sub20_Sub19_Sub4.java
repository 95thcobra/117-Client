public final class Class131_Sub20_Sub19_Sub4 extends Class131_Sub20_Sub19 {
	static Class17 aClass17_1817;
	double aDouble1808;
	double aDouble1809;
	double aDouble1810;
	double aDouble1811;
	double aDouble1812;
	double aDouble1805;
	double aDouble1813;
	double aDouble1820;
	boolean aBool1807 = false;
	int anInt1816;
	int anInt1800;
	int anInt1814 = 0;
	int anInt1819 = 0;
	int anInt1821;
	int anInt1797;
	int anInt1798;
	int anInt1799;
	int anInt1815;
	int anInt1802;
	int anInt1803;
	int anInt1804;
	int anInt1818;
	int anInt1806;
	int anInt1801;
	Class131_Sub20_Sub1 aClass131_Sub20_Sub1_1796;

	static int method952(final int var0, final int var1) {
		final long var2 = var1 + (var0 << 16);
		return (Class89.aClass131_Sub20_Sub20_725 != null) && (Class89.aClass131_Sub20_Sub20_725.aLong902 == var2)
				? 1 + ((Class94.aClass131_Sub14_744.pos * 99) / (Class94.aClass131_Sub14_744.data.length
						- Class89.aClass131_Sub20_Sub20_725.aByte1651))
				: 0;
	}

	static Class131_Sub20_Sub17_Sub2 method953(final Class100 var0, final int var1, final int var2) {
		return Class38.method210(var0, var1, var2) ? Class99.method400() : null;
	}

	@Override
	protected final Class131_Sub20_Sub19_Sub7 method868(final short var1) {
		final Class131_Sub20_Sub14 var2 = Class46.method235(anInt1821);
		final Class131_Sub20_Sub19_Sub7 var3 = var2.method786(anInt1819);
		if (var3 == null)
			return null;
		else {
			var3.method1026(anInt1800);
			return var3;
		}
	}

	final void method954(final int var1, final int var2, final int var3, final int var4) {
		double var9;
		if (!aBool1807) {
			var9 = var1 - anInt1798;
			final double var5 = var2 - anInt1799;
			final double var7 = Math.sqrt((var5 * var5) + (var9 * var9));
			aDouble1808 = ((anInt1818 * var9) / var7) + anInt1798;
			aDouble1809 = ((var5 * anInt1818) / var7) + anInt1799;
			aDouble1810 = anInt1815;
		}

		var9 = (1 + anInt1803) - var4;
		aDouble1811 = (var1 - aDouble1808) / var9;
		aDouble1812 = (var2 - aDouble1809) / var9;
		aDouble1805 = Math.sqrt((aDouble1811 * aDouble1811) + (aDouble1812 * aDouble1812));
		if (!aBool1807)
			aDouble1813 = -aDouble1805 * Math.tan(anInt1804 * 0.02454369D);

		aDouble1820 = ((var3 - aDouble1810 - (var9 * aDouble1813)) * 2.0D) / (var9 * var9);
	}

	public static void method955() {
		Class131_Sub18.aClass121_1152.method481();
		Class131_Sub18.aClass121_1153.method481();
		Class131_Sub18.aClass121_1164.method481();
		Class131_Sub18.aClass121_1264.method481();
	}

	final void method956(final int var1) {
		aBool1807 = true;
		aDouble1808 += var1 * aDouble1811;
		aDouble1809 += var1 * aDouble1812;
		aDouble1810 += (aDouble1813 * var1) + (var1 * 0.5D * aDouble1820 * var1);
		aDouble1813 += aDouble1820 * var1;
		anInt1816 = ((int) (Math.atan2(aDouble1811, aDouble1812) * 325.949D) + 1024) & 2047;
		anInt1800 = (int) (Math.atan2(aDouble1813, aDouble1805) * 325.949D) & 2047;
		if (null != aClass131_Sub20_Sub1_1796) {
			anInt1814 += var1;

			while (true) {
				do {
					do {
						if (anInt1814 <= aClass131_Sub20_Sub1_1796.anIntArray1358[anInt1819])
							return;

						anInt1814 -= aClass131_Sub20_Sub1_1796.anIntArray1358[anInt1819];
						++anInt1819;
					} while (anInt1819 < aClass131_Sub20_Sub1_1796.anIntArray1353.length);

					anInt1819 -= aClass131_Sub20_Sub1_1796.anInt1368;
				} while ((anInt1819 >= 0) && (anInt1819 < aClass131_Sub20_Sub1_1796.anIntArray1353.length));

				anInt1819 = 0;
			}
		}
	}

	Class131_Sub20_Sub19_Sub4(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final int var8, final int var9, final int var10, final int var11) {
		anInt1821 = var1;
		anInt1797 = var2;
		anInt1798 = var3;
		anInt1799 = var4;
		anInt1815 = var5;
		anInt1802 = var6;
		anInt1803 = var7;
		anInt1804 = var8;
		anInt1818 = var9;
		anInt1806 = var10;
		anInt1801 = var11;
		aBool1807 = false;
		final int var12 = Class46.method235(anInt1821).anInt1579;
		if (var12 != -1)
			aClass131_Sub20_Sub1_1796 = Class131_Sub20_Sub19_Sub2_Sub1.method1066(var12);
		else
			aClass131_Sub20_Sub1_1796 = null;

	}

	static final void method957(final Class131_Sub20_Sub19_Sub2 var0) {
		int var2;
		int var3;
		int var7;
		if (var0.anInt1704 > client.anInt2038)
			Class32.method145(var0);
		else if (var0.anInt1746 >= client.anInt2038) {
			if ((var0.anInt1746 == client.anInt2038) || (var0.anInt1703 == -1) || (var0.anInt1735 != 0)
					|| ((var0.anInt1734 + 1) > Class131_Sub20_Sub19_Sub2_Sub1
							.method1066(var0.anInt1703).anIntArray1358[var0.anInt1733])) {
				var2 = var0.anInt1746 - var0.anInt1704;
				var7 = client.anInt2038 - var0.anInt1704;
				var3 = (var0.anInt1742 * 128) + (var0.anInt1706 * 64);
				final int var4 = (var0.anInt1744 * 128) + (var0.anInt1706 * 64);
				final int var5 = (var0.anInt1706 * 64) + (var0.anInt1719 * 128);
				final int var6 = (var0.anInt1706 * 64) + (var0.anInt1724 * 128);
				var0.anInt1718 = (((var2 - var7) * var3) + (var5 * var7)) / var2;
				var0.anInt1759 = (((var2 - var7) * var4) + (var7 * var6)) / var2;
			}

			var0.anInt1745 = 0;
			var0.anInt1751 = var0.anInt1730;
			var0.anInt1762 = var0.anInt1751;
		} else
			Class44.method223(var0);

		if ((var0.anInt1718 < 128) || (var0.anInt1759 < 128) || (var0.anInt1718 >= 13184)
				|| (var0.anInt1759 >= 13184)) {
			var0.anInt1703 = -1;
			var0.anInt1737 = -1;
			var0.anInt1704 = 0;
			var0.anInt1746 = 0;
			var0.anInt1718 = (128 * var0.anIntArray1755[0]) + (var0.anInt1706 * 64);
			var0.anInt1759 = (var0.anInt1706 * 64) + (128 * var0.anIntArray1756[0]);
			var0.method921();
		}

		if ((var0 == Class131_Sub11.myPlayer) && ((var0.anInt1718 < 1536)
				|| (var0.anInt1759 < 1536) || (var0.anInt1718 >= 11776) || (var0.anInt1759 >= 11776))) {
			var0.anInt1703 = -1;
			var0.anInt1737 = -1;
			var0.anInt1704 = 0;
			var0.anInt1746 = 0;
			var0.anInt1718 = (var0.anInt1706 * 64) + (var0.anIntArray1755[0] * 128);
			var0.anInt1759 = (var0.anIntArray1756[0] * 128) + (var0.anInt1706 * 64);
			var0.method921();
		}

		if (var0.anInt1753 != 0) {
			if (var0.anInt1726 != -1) {
				Object var1 = null;
				if (var0.anInt1726 < '\u8000')
					var1 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var0.anInt1726];
				else if (var0.anInt1726 >= '\u8000')
					var1 = client.playerArray[var0.anInt1726 - '\u8000'];

				if (null != var1) {
					var7 = var0.anInt1718 - ((Class131_Sub20_Sub19_Sub2) var1).anInt1718;
					var3 = var0.anInt1759 - ((Class131_Sub20_Sub19_Sub2) var1).anInt1759;
					if ((var7 != 0) || (var3 != 0))
						var0.anInt1751 = (int) (Math.atan2(var7, var3) * 325.949D) & 2047;
				} else if (var0.aBool1727) {
					var0.anInt1726 = -1;
					var0.aBool1727 = false;
				}
			}

			if ((var0.anInt1728 != -1) && ((var0.anInt1754 == 0) || (var0.anInt1745 > 0))) {
				var0.anInt1751 = var0.anInt1728;
				var0.anInt1728 = -1;
			}

			var2 = (var0.anInt1751 - var0.anInt1762) & 2047;
			if ((var2 == 0) && var0.aBool1727) {
				var0.anInt1726 = -1;
				var0.aBool1727 = false;
			}

			if (var2 != 0) {
				++var0.anInt1752;
				boolean var10;
				if (var2 > 1024) {
					var0.anInt1762 -= var0.anInt1753;
					var10 = true;
					if ((var2 < var0.anInt1753) || (var2 > (2048 - var0.anInt1753))) {
						var0.anInt1762 = var0.anInt1751;
						var10 = false;
					}

					if ((var0.anInt1707 == var0.anInt1729) && ((var0.anInt1752 > 25) || var10))
						if (var0.anInt1708 != -1)
							var0.anInt1729 = var0.anInt1708;
						else
							var0.anInt1729 = var0.anInt1710;
				} else {
					var0.anInt1762 += var0.anInt1753;
					var10 = true;
					if ((var2 < var0.anInt1753) || (var2 > (2048 - var0.anInt1753))) {
						var0.anInt1762 = var0.anInt1751;
						var10 = false;
					}

					if ((var0.anInt1707 == var0.anInt1729) && ((var0.anInt1752 > 25) || var10))
						if (var0.anInt1725 != -1)
							var0.anInt1729 = var0.anInt1725;
						else
							var0.anInt1729 = var0.anInt1710;
				}

				var0.anInt1762 &= 2047;
			} else
				var0.anInt1752 = 0;
		}

		var0.aBool1738 = false;
		Class131_Sub20_Sub1 var9;
		if (var0.anInt1729 != -1) {
			var9 = Class131_Sub20_Sub19_Sub2_Sub1.method1066(var0.anInt1729);
			if ((var9 != null) && (var9.anIntArray1353 != null)) {
				++var0.anInt1731;
				if ((var0.anInt1748 < var9.anIntArray1353.length)
						&& (var0.anInt1731 > var9.anIntArray1358[var0.anInt1748])) {
					var0.anInt1731 = 1;
					++var0.anInt1748;
					Class5.method29(var9, var0.anInt1748, var0.anInt1718, var0.anInt1759);
				}

				if (var0.anInt1748 >= var9.anIntArray1353.length) {
					var0.anInt1731 = 0;
					var0.anInt1748 = 0;
					Class5.method29(var9, var0.anInt1748, var0.anInt1718, var0.anInt1759);
				}
			} else
				var0.anInt1729 = -1;
		}

		if ((var0.anInt1737 != -1) && (client.anInt2038 >= var0.anInt1740)) {
			if (var0.anInt1702 < 0)
				var0.anInt1702 = 0;

			var2 = Class46.method235(var0.anInt1737).anInt1579;
			if (var2 != -1) {
				final Class131_Sub20_Sub1 var8 = Class131_Sub20_Sub19_Sub2_Sub1.method1066(var2);
				if ((var8 != null) && (var8.anIntArray1353 != null)) {
					++var0.anInt1739;
					if ((var0.anInt1702 < var8.anIntArray1353.length)
							&& (var0.anInt1739 > var8.anIntArray1358[var0.anInt1702])) {
						var0.anInt1739 = 1;
						++var0.anInt1702;
						Class5.method29(var8, var0.anInt1702, var0.anInt1718, var0.anInt1759);
					}

					if ((var0.anInt1702 >= var8.anIntArray1353.length)
							&& ((var0.anInt1702 < 0) || (var0.anInt1702 >= var8.anIntArray1353.length)))
						var0.anInt1737 = -1;
				} else
					var0.anInt1737 = -1;
			} else
				var0.anInt1737 = -1;
		}

		if ((var0.anInt1703 != -1) && (var0.anInt1735 <= 1)) {
			var9 = Class131_Sub20_Sub19_Sub2_Sub1.method1066(var0.anInt1703);
			if ((var9.anInt1362 == 1) && (var0.anInt1758 > 0) && (var0.anInt1704 <= client.anInt2038)
					&& (var0.anInt1746 < client.anInt2038)) {
				var0.anInt1735 = 1;
				return;
			}
		}

		if ((var0.anInt1703 != -1) && (var0.anInt1735 == 0)) {
			var9 = Class131_Sub20_Sub19_Sub2_Sub1.method1066(var0.anInt1703);
			if ((var9 != null) && (var9.anIntArray1353 != null)) {
				++var0.anInt1734;
				if ((var0.anInt1733 < var9.anIntArray1353.length)
						&& (var0.anInt1734 > var9.anIntArray1358[var0.anInt1733])) {
					var0.anInt1734 = 1;
					++var0.anInt1733;
					Class5.method29(var9, var0.anInt1733, var0.anInt1718, var0.anInt1759);
				}

				if (var0.anInt1733 >= var9.anIntArray1353.length) {
					var0.anInt1733 -= var9.anInt1368;
					++var0.anInt1736;
					if (var0.anInt1736 >= var9.anInt1366)
						var0.anInt1703 = -1;
					else if ((var0.anInt1733 >= 0) && (var0.anInt1733 < var9.anIntArray1353.length))
						Class5.method29(var9, var0.anInt1733, var0.anInt1718, var0.anInt1759);
					else
						var0.anInt1703 = -1;
				}

				var0.aBool1738 = var9.aBool1372;
			} else
				var0.anInt1703 = -1;
		}

		if (var0.anInt1735 > 0)
			--var0.anInt1735;

	}

	static boolean method958(final Class131_Sub18 var0) {
		if (client.aBool2269) {
			if (Class49.method254(var0) != 0)
				return false;

			if (var0.anInt1202 == 0)
				return false;
		}

		return var0.aBool1178;
	}
}
