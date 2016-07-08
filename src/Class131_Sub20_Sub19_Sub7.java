public class Class131_Sub20_Sub19_Sub7 extends Class131_Sub20_Sub19 {
	int anInt1913;
	static byte[] aByteArray1889 = new byte[1];
	static byte[] aByteArray1899 = new byte[1];
	int anInt1918 = 0;
	int anInt1895 = 0;
	int anInt1906 = 0;
	int[] anIntArray1948;
	int[] anIntArray1893;
	int[] anIntArray1898;
	byte[] aByteArray1904;
	int[] anIntArray1929;
	int[] anIntArray1896;
	int[] anIntArray1897;
	int[] anIntArray1902;
	int[] anIntArray1910;
	int[] anIntArray1900;
	byte[] aByteArray1901;
	byte[] aByteArray1903;
	short[] aShortArray1946;
	byte aByte1905 = 0;
	int[] anIntArray1907;
	int[] anIntArray1908;
	int[] anIntArray1909;
	int[][] anIntArrayArray1932;
	int[][] anIntArrayArray1911;
	public boolean aBool1912 = false;
	int anInt1914;
	int anInt1915;
	int anInt1917;
	int anInt1938;
	static int anInt1927;
	static int anInt1939;
	static int anInt1940;
	public static int anInt1944 = 0;
	static Class131_Sub20_Sub19_Sub7 aClass131_Sub20_Sub19_Sub7_1916 = new Class131_Sub20_Sub19_Sub7();
	static Class131_Sub20_Sub19_Sub7 aClass131_Sub20_Sub19_Sub7_1937 = new Class131_Sub20_Sub19_Sub7();
	static boolean[] aBoolArray1919 = new boolean[4700];
	static boolean[] aBoolArray1920 = new boolean[4700];
	static int[] anIntArray1921 = new int[4700];
	static int[] anIntArray1922 = new int[4700];
	static int[] anIntArray1923 = new int[4700];
	static int[] anIntArray1924 = new int[4700];
	static int[] anIntArray1925 = new int[4700];
	static int[] anIntArray1890 = new int[4700];
	static int[] anIntArray1928 = new int[1600];
	static int[][] anIntArrayArray1888 = new int[1600][512];
	static int[] anIntArray1930 = new int[12];
	static int[][] anIntArrayArray1931 = new int[12][2000];
	static int[] anIntArray1894 = new int[2000];
	static int[] anIntArray1926 = new int[2000];
	static int[] anIntArray1934 = new int[12];
	static int[] anIntArray1935 = new int[10];
	static int[] anIntArray1942 = new int[10];
	static int[] anIntArray1892 = new int[10];
	public static boolean aBool1941 = false;
	public static int anInt1936 = 0;
	public static int anInt1943 = 0;
	public static int[] anIntArray1945 = new int[1000];
	static int[] anIntArray1891;
	static int[] anIntArray1947;
	static int[] anIntArray1933;
	static int[] anIntArray1949;

	public void method1011(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt1918; ++var4) {
			anIntArray1948[var4] = (anIntArray1948[var4] * var1) / 128;
			anIntArray1893[var4] = (anIntArray1893[var4] * var2) / 128;
			anIntArray1898[var4] = (anIntArray1898[var4] * var3) / 128;
		}

		anInt1913 = 0;
	}

	public Class131_Sub20_Sub19_Sub7 method1012(final boolean var1) {
		if (!var1 && (aByteArray1889.length < anInt1895))
			aByteArray1889 = new byte[anInt1895 + 100];

		return method1014(var1, aClass131_Sub20_Sub19_Sub7_1916, aByteArray1889);
	}

	public Class131_Sub20_Sub19_Sub7 method1013(final boolean var1) {
		if (!var1 && (aByteArray1899.length < anInt1895))
			aByteArray1899 = new byte[anInt1895 + 100];

		return method1014(var1, aClass131_Sub20_Sub19_Sub7_1937, aByteArray1899);
	}

	Class131_Sub20_Sub19_Sub7 method1014(final boolean var1, final Class131_Sub20_Sub19_Sub7 var2, final byte[] var3) {
		var2.anInt1918 = anInt1918;
		var2.anInt1895 = anInt1895;
		var2.anInt1906 = anInt1906;
		if ((var2.anIntArray1948 == null) || (var2.anIntArray1948.length < anInt1918)) {
			var2.anIntArray1948 = new int[anInt1918 + 100];
			var2.anIntArray1893 = new int[anInt1918 + 100];
			var2.anIntArray1898 = new int[anInt1918 + 100];
		}

		int var4;
		for (var4 = 0; var4 < anInt1918; ++var4) {
			var2.anIntArray1948[var4] = anIntArray1948[var4];
			var2.anIntArray1893[var4] = anIntArray1893[var4];
			var2.anIntArray1898[var4] = anIntArray1898[var4];
		}

		if (var1)
			var2.aByteArray1904 = aByteArray1904;
		else {
			var2.aByteArray1904 = var3;
			if (aByteArray1904 == null)
				for (var4 = 0; var4 < anInt1895; ++var4)
					var2.aByteArray1904[var4] = 0;
			else
				for (var4 = 0; var4 < anInt1895; ++var4)
					var2.aByteArray1904[var4] = aByteArray1904[var4];
		}

		var2.anIntArray1929 = anIntArray1929;
		var2.anIntArray1896 = anIntArray1896;
		var2.anIntArray1897 = anIntArray1897;
		var2.anIntArray1902 = anIntArray1902;
		var2.anIntArray1910 = anIntArray1910;
		var2.anIntArray1900 = anIntArray1900;
		var2.aByteArray1901 = aByteArray1901;
		var2.aByteArray1903 = aByteArray1903;
		var2.aShortArray1946 = aShortArray1946;
		var2.aByte1905 = aByte1905;
		var2.anIntArray1907 = anIntArray1907;
		var2.anIntArray1908 = anIntArray1908;
		var2.anIntArray1909 = anIntArray1909;
		var2.anIntArrayArray1932 = anIntArrayArray1932;
		var2.anIntArrayArray1911 = anIntArrayArray1911;
		var2.aBool1912 = aBool1912;
		var2.anInt1913 = 0;
		return var2;
	}

	public void method1015() {
		if (anInt1913 != 1) {
			anInt1913 = 1;
			anInt1643 = 0;
			anInt1914 = 0;
			anInt1915 = 0;

			for (int var1 = 0; var1 < anInt1918; ++var1) {
				final int var4 = anIntArray1948[var1];
				final int var5 = anIntArray1893[var1];
				final int var2 = anIntArray1898[var1];
				if (-var5 > anInt1643)
					anInt1643 = -var5;

				if (var5 > anInt1914)
					anInt1914 = var5;

				final int var3 = (var4 * var4) + (var2 * var2);
				if (var3 > anInt1915)
					anInt1915 = var3;
			}

			anInt1915 = (int) (Math.sqrt(anInt1915) + 0.99D);
			anInt1917 = (int) (Math.sqrt((anInt1915 * anInt1915) + (anInt1643 * anInt1643)) + 0.99D);
			anInt1938 = anInt1917 + (int) (Math.sqrt((anInt1915 * anInt1915) + (anInt1914 * anInt1914)) + 0.99D);
		}
	}

	void method1016() {
		if (anInt1913 != 2) {
			anInt1913 = 2;
			anInt1915 = 0;

			for (int var2 = 0; var2 < anInt1918; ++var2) {
				final int var3 = anIntArray1948[var2];
				final int var4 = anIntArray1893[var2];
				final int var5 = anIntArray1898[var2];
				final int var1 = (var3 * var3) + (var5 * var5) + (var4 * var4);
				if (var1 > anInt1915)
					anInt1915 = var1;
			}

			anInt1915 = (int) (Math.sqrt(anInt1915) + 0.99D);
			anInt1917 = anInt1915;
			anInt1938 = anInt1915 + anInt1915;
		}
	}

	public int method1017() {
		method1015();
		return anInt1915;
	}

	public void method1018(final Class131_Sub20_Sub16 var1, final int var2, final Class131_Sub20_Sub16 var3,
			final int var4, final int[] var5) {
		if (var2 != -1)
			if ((var5 != null) && (var4 != -1)) {
				final Class43 var8 = var1.aClass43Array1626[var2];
				final Class43 var9 = var3.aClass43Array1626[var4];
				final Class131_Sub5 var12 = var8.aClass131_Sub5_426;
				anInt1927 = 0;
				anInt1939 = 0;
				anInt1940 = 0;
				byte var6 = 0;
				int var13 = var6 + 1;
				int var7 = var5[var6];

				int var10;
				int var11;
				for (var10 = 0; var10 < var8.anInt431; ++var10) {
					for (var11 = var8.anIntArray432[var10]; var11 > var7; var7 = var5[var13++])
						;

					if ((var11 != var7) || (var12.anIntArray1007[var11] == 0))
						method1030(var12.anIntArray1007[var11], var12.anIntArrayArray1006[var11],
								var8.anIntArray433[var10], var8.anIntArray427[var10], var8.anIntArray430[var10]);
				}

				anInt1927 = 0;
				anInt1939 = 0;
				anInt1940 = 0;
				var6 = 0;
				var13 = var6 + 1;
				var7 = var5[var6];

				for (var10 = 0; var10 < var9.anInt431; ++var10) {
					for (var11 = var9.anIntArray432[var10]; var11 > var7; var7 = var5[var13++])
						;

					if ((var11 == var7) || (var12.anIntArray1007[var11] == 0))
						method1030(var12.anIntArray1007[var11], var12.anIntArrayArray1006[var11],
								var9.anIntArray433[var10], var9.anIntArray427[var10], var9.anIntArray430[var10]);
				}

				anInt1913 = 0;
			} else
				method1027(var1, var2);
	}

	public Class131_Sub20_Sub19_Sub7(final Class131_Sub20_Sub19_Sub7[] var1, final int var2) {
		boolean var4 = false;
		boolean var9 = false;
		boolean var7 = false;
		boolean var8 = false;
		anInt1918 = 0;
		anInt1895 = 0;
		anInt1906 = 0;
		aByte1905 = -1;

		int var5;
		Class131_Sub20_Sub19_Sub7 var6;
		for (var5 = 0; var5 < var2; ++var5) {
			var6 = var1[var5];
			if (var6 != null) {
				anInt1918 += var6.anInt1918;
				anInt1895 += var6.anInt1895;
				anInt1906 += var6.anInt1906;
				if (var6.aByteArray1901 != null)
					var4 = true;
				else {
					if (aByte1905 == -1)
						aByte1905 = var6.aByte1905;

					if (aByte1905 != var6.aByte1905)
						var4 = true;
				}

				var9 |= var6.aByteArray1904 != null;
				var7 |= var6.aShortArray1946 != null;
				var8 |= var6.aByteArray1903 != null;
			}
		}

		anIntArray1948 = new int[anInt1918];
		anIntArray1893 = new int[anInt1918];
		anIntArray1898 = new int[anInt1918];
		anIntArray1929 = new int[anInt1895];
		anIntArray1896 = new int[anInt1895];
		anIntArray1897 = new int[anInt1895];
		anIntArray1902 = new int[anInt1895];
		anIntArray1910 = new int[anInt1895];
		anIntArray1900 = new int[anInt1895];
		if (var4)
			aByteArray1901 = new byte[anInt1895];

		if (var9)
			aByteArray1904 = new byte[anInt1895];

		if (var7)
			aShortArray1946 = new short[anInt1895];

		if (var8)
			aByteArray1903 = new byte[anInt1895];

		if (anInt1906 > 0) {
			anIntArray1907 = new int[anInt1906];
			anIntArray1908 = new int[anInt1906];
			anIntArray1909 = new int[anInt1906];
		}

		anInt1918 = 0;
		anInt1895 = 0;
		anInt1906 = 0;

		for (var5 = 0; var5 < var2; ++var5) {
			var6 = var1[var5];
			if (var6 != null) {
				int var3;
				for (var3 = 0; var3 < var6.anInt1895; ++var3) {
					anIntArray1929[anInt1895] = var6.anIntArray1929[var3] + anInt1918;
					anIntArray1896[anInt1895] = var6.anIntArray1896[var3] + anInt1918;
					anIntArray1897[anInt1895] = var6.anIntArray1897[var3] + anInt1918;
					anIntArray1902[anInt1895] = var6.anIntArray1902[var3];
					anIntArray1910[anInt1895] = var6.anIntArray1910[var3];
					anIntArray1900[anInt1895] = var6.anIntArray1900[var3];
					if (var4)
						if (var6.aByteArray1901 != null)
							aByteArray1901[anInt1895] = var6.aByteArray1901[var3];
						else
							aByteArray1901[anInt1895] = var6.aByte1905;

					if (var9 && (var6.aByteArray1904 != null))
						aByteArray1904[anInt1895] = var6.aByteArray1904[var3];

					if (var7)
						if (var6.aShortArray1946 != null)
							aShortArray1946[anInt1895] = var6.aShortArray1946[var3];
						else
							aShortArray1946[anInt1895] = -1;

					if (var8)
						if ((var6.aByteArray1903 != null) && (var6.aByteArray1903[var3] != -1))
							aByteArray1903[anInt1895] = (byte) (var6.aByteArray1903[var3] + anInt1906);
						else
							aByteArray1903[anInt1895] = -1;

					++anInt1895;
				}

				for (var3 = 0; var3 < var6.anInt1906; ++var3) {
					anIntArray1907[anInt1906] = var6.anIntArray1907[var3] + anInt1918;
					anIntArray1908[anInt1906] = var6.anIntArray1908[var3] + anInt1918;
					anIntArray1909[anInt1906] = var6.anIntArray1909[var3] + anInt1918;
					++anInt1906;
				}

				for (var3 = 0; var3 < var6.anInt1918; ++var3) {
					anIntArray1948[anInt1918] = var6.anIntArray1948[var3];
					anIntArray1893[anInt1918] = var6.anIntArray1893[var3];
					anIntArray1898[anInt1918] = var6.anIntArray1898[var3];
					++anInt1918;
				}
			}
		}

	}

	Class131_Sub20_Sub19_Sub7() {
	}

	public void method1019() {
		for (int var1 = 0; var1 < anInt1918; ++var1) {
			final int var2 = anIntArray1898[var1];
			anIntArray1898[var1] = anIntArray1948[var1];
			anIntArray1948[var1] = -var2;
		}

		anInt1913 = 0;
	}

	public void method1020(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt1918; ++var4) {
			anIntArray1948[var4] += var1;
			anIntArray1893[var4] += var2;
			anIntArray1898[var4] += var3;
		}

		anInt1913 = 0;
	}

	public final void method1021(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7) {
		anIntArray1928[0] = -1;
		if ((anInt1913 != 2) && (anInt1913 != 1))
			method1016();

		final int var8 = Class131_Sub20_Sub17_Sub1.anInt1780;
		final int var9 = Class131_Sub20_Sub17_Sub1.anInt1776;
		final int var12 = anIntArray1891[var2];
		final int var13 = anIntArray1947[var2];
		final int var14 = anIntArray1891[var3];
		final int var15 = anIntArray1947[var3];
		final int var16 = anIntArray1891[var4];
		final int var17 = anIntArray1947[var4];
		final int var18 = ((var6 * var16) + (var7 * var17)) >> 16;

		for (int var19 = 0; var19 < anInt1918; ++var19) {
			int var20 = anIntArray1948[var19];
			int var21 = anIntArray1893[var19];
			int var22 = anIntArray1898[var19];
			int var23;
			if (var3 != 0) {
				var23 = ((var21 * var14) + (var20 * var15)) >> 16;
				var21 = ((var21 * var15) - (var20 * var14)) >> 16;
				var20 = var23;
			}

			if (var2 != 0) {
				var23 = ((var22 * var12) + (var20 * var13)) >> 16;
				var22 = ((var22 * var13) - (var20 * var12)) >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = ((var21 * var17) - (var22 * var16)) >> 16;
			var22 = ((var21 * var16) + (var22 * var17)) >> 16;
			anIntArray1923[var19] = var22 - var18;
			anIntArray1921[var19] = var8 + ((var20 * Class131_Sub20_Sub17_Sub1.anInt1774) / var22);
			anIntArray1922[var19] = var9 + ((var23 * Class131_Sub20_Sub17_Sub1.anInt1774) / var22);
			if (anInt1906 > 0) {
				anIntArray1924[var19] = var20;
				anIntArray1925[var19] = var23;
				anIntArray1890[var19] = var22;
			}
		}

		try {
			method1024(false, false, 0);
		} catch (final Exception var25) {
			;
		}

	}

	public final void method1022(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final int var8) {
		anIntArray1928[0] = -1;
		if ((anInt1913 != 2) && (anInt1913 != 1))
			method1016();

		final int var9 = Class131_Sub20_Sub17_Sub1.anInt1780;
		final int var10 = Class131_Sub20_Sub17_Sub1.anInt1776;
		final int var13 = anIntArray1891[var2];
		final int var14 = anIntArray1947[var2];
		final int var15 = anIntArray1891[var3];
		final int var16 = anIntArray1947[var3];
		final int var17 = anIntArray1891[var4];
		final int var18 = anIntArray1947[var4];
		final int var19 = ((var6 * var17) + (var7 * var18)) >> 16;

		for (int var20 = 0; var20 < anInt1918; ++var20) {
			int var21 = anIntArray1948[var20];
			int var22 = anIntArray1893[var20];
			int var23 = anIntArray1898[var20];
			int var24;
			if (var3 != 0) {
				var24 = ((var22 * var15) + (var21 * var16)) >> 16;
				var22 = ((var22 * var16) - (var21 * var15)) >> 16;
				var21 = var24;
			}

			if (var2 != 0) {
				var24 = ((var23 * var13) + (var21 * var14)) >> 16;
				var23 = ((var23 * var14) - (var21 * var13)) >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = ((var22 * var18) - (var23 * var17)) >> 16;
			var23 = ((var22 * var17) + (var23 * var18)) >> 16;
			anIntArray1923[var20] = var23 - var19;
			anIntArray1921[var20] = var9 + ((var21 * Class131_Sub20_Sub17_Sub1.anInt1774) / var8);
			anIntArray1922[var20] = var10 + ((var24 * Class131_Sub20_Sub17_Sub1.anInt1774) / var8);
			if (anInt1906 > 0) {
				anIntArray1924[var20] = var21;
				anIntArray1925[var20] = var24;
				anIntArray1890[var20] = var23;
			}
		}

		try {
			method1024(false, false, 0);
		} catch (final Exception var26) {
			;
		}

	}

	final void method1023(final int var1) {
		final int var2 = Class131_Sub20_Sub17_Sub1.anInt1780;
		final int var19 = Class131_Sub20_Sub17_Sub1.anInt1776;
		int var3 = 0;
		final int var4 = anIntArray1929[var1];
		final int var5 = anIntArray1896[var1];
		final int var7 = anIntArray1897[var1];
		final int var17 = anIntArray1890[var4];
		final int var18 = anIntArray1890[var5];
		final int var9 = anIntArray1890[var7];
		if (aByteArray1904 == null)
			Class131_Sub20_Sub17_Sub1.anInt1771 = 0;
		else
			Class131_Sub20_Sub17_Sub1.anInt1771 = aByteArray1904[var1] & 255;

		int var8;
		int var10;
		int var11;
		int var12;
		if (var17 >= 50) {
			anIntArray1935[var3] = anIntArray1921[var4];
			anIntArray1942[var3] = anIntArray1922[var4];
			anIntArray1892[var3++] = anIntArray1902[var1];
		} else {
			var10 = anIntArray1924[var4];
			var12 = anIntArray1925[var4];
			var8 = anIntArray1902[var1];
			if (var9 >= 50) {
				var11 = (50 - var17) * anIntArray1949[var9 - var17];
				anIntArray1935[var3] = var2 + (((var10 + (((anIntArray1924[var7] - var10) * var11) >> 16))
						* Class131_Sub20_Sub17_Sub1.anInt1774) / 50);
				anIntArray1942[var3] = var19 + (((var12 + (((anIntArray1925[var7] - var12) * var11) >> 16))
						* Class131_Sub20_Sub17_Sub1.anInt1774) / 50);
				anIntArray1892[var3++] = var8 + (((anIntArray1900[var1] - var8) * var11) >> 16);
			}

			if (var18 >= 50) {
				var11 = (50 - var17) * anIntArray1949[var18 - var17];
				anIntArray1935[var3] = var2 + (((var10 + (((anIntArray1924[var5] - var10) * var11) >> 16))
						* Class131_Sub20_Sub17_Sub1.anInt1774) / 50);
				anIntArray1942[var3] = var19 + (((var12 + (((anIntArray1925[var5] - var12) * var11) >> 16))
						* Class131_Sub20_Sub17_Sub1.anInt1774) / 50);
				anIntArray1892[var3++] = var8 + (((anIntArray1910[var1] - var8) * var11) >> 16);
			}
		}

		if (var18 >= 50) {
			anIntArray1935[var3] = anIntArray1921[var5];
			anIntArray1942[var3] = anIntArray1922[var5];
			anIntArray1892[var3++] = anIntArray1910[var1];
		} else {
			var10 = anIntArray1924[var5];
			var12 = anIntArray1925[var5];
			var8 = anIntArray1910[var1];
			if (var17 >= 50) {
				var11 = (50 - var18) * anIntArray1949[var17 - var18];
				anIntArray1935[var3] = var2 + (((var10 + (((anIntArray1924[var4] - var10) * var11) >> 16))
						* Class131_Sub20_Sub17_Sub1.anInt1774) / 50);
				anIntArray1942[var3] = var19 + (((var12 + (((anIntArray1925[var4] - var12) * var11) >> 16))
						* Class131_Sub20_Sub17_Sub1.anInt1774) / 50);
				anIntArray1892[var3++] = var8 + (((anIntArray1902[var1] - var8) * var11) >> 16);
			}

			if (var9 >= 50) {
				var11 = (50 - var18) * anIntArray1949[var9 - var18];
				anIntArray1935[var3] = var2 + (((var10 + (((anIntArray1924[var7] - var10) * var11) >> 16))
						* Class131_Sub20_Sub17_Sub1.anInt1774) / 50);
				anIntArray1942[var3] = var19 + (((var12 + (((anIntArray1925[var7] - var12) * var11) >> 16))
						* Class131_Sub20_Sub17_Sub1.anInt1774) / 50);
				anIntArray1892[var3++] = var8 + (((anIntArray1900[var1] - var8) * var11) >> 16);
			}
		}

		if (var9 >= 50) {
			anIntArray1935[var3] = anIntArray1921[var7];
			anIntArray1942[var3] = anIntArray1922[var7];
			anIntArray1892[var3++] = anIntArray1900[var1];
		} else {
			var10 = anIntArray1924[var7];
			var12 = anIntArray1925[var7];
			var8 = anIntArray1900[var1];
			if (var18 >= 50) {
				var11 = (50 - var9) * anIntArray1949[var18 - var9];
				anIntArray1935[var3] = var2 + (((var10 + (((anIntArray1924[var5] - var10) * var11) >> 16))
						* Class131_Sub20_Sub17_Sub1.anInt1774) / 50);
				anIntArray1942[var3] = var19 + (((var12 + (((anIntArray1925[var5] - var12) * var11) >> 16))
						* Class131_Sub20_Sub17_Sub1.anInt1774) / 50);
				anIntArray1892[var3++] = var8 + (((anIntArray1910[var1] - var8) * var11) >> 16);
			}

			if (var17 >= 50) {
				var11 = (50 - var9) * anIntArray1949[var17 - var9];
				anIntArray1935[var3] = var2 + (((var10 + (((anIntArray1924[var4] - var10) * var11) >> 16))
						* Class131_Sub20_Sub17_Sub1.anInt1774) / 50);
				anIntArray1942[var3] = var19 + (((var12 + (((anIntArray1925[var4] - var12) * var11) >> 16))
						* Class131_Sub20_Sub17_Sub1.anInt1774) / 50);
				anIntArray1892[var3++] = var8 + (((anIntArray1902[var1] - var8) * var11) >> 16);
			}
		}

		var10 = anIntArray1935[0];
		var12 = anIntArray1935[1];
		var8 = anIntArray1935[2];
		var11 = anIntArray1942[0];
		final int var20 = anIntArray1942[1];
		final int var13 = anIntArray1942[2];
		Class131_Sub20_Sub17_Sub1.aBool1775 = false;
		int var6;
		int var14;
		int var15;
		int var16;
		if (var3 == 3) {
			if ((var10 < 0) || (var12 < 0) || (var8 < 0) || (var10 > Class131_Sub20_Sub17_Sub1.anInt1777)
					|| (var12 > Class131_Sub20_Sub17_Sub1.anInt1777) || (var8 > Class131_Sub20_Sub17_Sub1.anInt1777))
				Class131_Sub20_Sub17_Sub1.aBool1775 = true;

			if ((aShortArray1946 != null) && (aShortArray1946[var1] != -1)) {
				if ((aByteArray1903 != null) && (aByteArray1903[var1] != -1)) {
					var16 = aByteArray1903[var1] & 255;
					var14 = anIntArray1907[var16];
					var6 = anIntArray1908[var16];
					var15 = anIntArray1909[var16];
				} else {
					var14 = var4;
					var6 = var5;
					var15 = var7;
				}

				if (anIntArray1900[var1] == -1)
					Class131_Sub20_Sub17_Sub1.method938(var11, var20, var13, var10, var12, var8, anIntArray1902[var1],
							anIntArray1902[var1], anIntArray1902[var1], anIntArray1924[var14], anIntArray1924[var6],
							anIntArray1924[var15], anIntArray1925[var14], anIntArray1925[var6], anIntArray1925[var15],
							anIntArray1890[var14], anIntArray1890[var6], anIntArray1890[var15], aShortArray1946[var1]);
				else
					Class131_Sub20_Sub17_Sub1.method938(var11, var20, var13, var10, var12, var8, anIntArray1892[0],
							anIntArray1892[1], anIntArray1892[2], anIntArray1924[var14], anIntArray1924[var6],
							anIntArray1924[var15], anIntArray1925[var14], anIntArray1925[var6], anIntArray1925[var15],
							anIntArray1890[var14], anIntArray1890[var6], anIntArray1890[var15], aShortArray1946[var1]);
			} else if (anIntArray1900[var1] == -1)
				Class131_Sub20_Sub17_Sub1.method936(var11, var20, var13, var10, var12, var8,
						anIntArray1933[anIntArray1902[var1]]);
			else
				Class131_Sub20_Sub17_Sub1.method943(var11, var20, var13, var10, var12, var8, anIntArray1892[0],
						anIntArray1892[1], anIntArray1892[2]);
		}

		if (var3 == 4) {
			if ((var10 < 0) || (var12 < 0) || (var8 < 0) || (var10 > Class131_Sub20_Sub17_Sub1.anInt1777)
					|| (var12 > Class131_Sub20_Sub17_Sub1.anInt1777) || (var8 > Class131_Sub20_Sub17_Sub1.anInt1777)
					|| (anIntArray1935[3] < 0) || (anIntArray1935[3] > Class131_Sub20_Sub17_Sub1.anInt1777))
				Class131_Sub20_Sub17_Sub1.aBool1775 = true;

			if ((aShortArray1946 != null) && (aShortArray1946[var1] != -1)) {
				if ((aByteArray1903 != null) && (aByteArray1903[var1] != -1)) {
					var16 = aByteArray1903[var1] & 255;
					var14 = anIntArray1907[var16];
					var6 = anIntArray1908[var16];
					var15 = anIntArray1909[var16];
				} else {
					var14 = var4;
					var6 = var5;
					var15 = var7;
				}

				final short var21 = aShortArray1946[var1];
				if (anIntArray1900[var1] == -1) {
					Class131_Sub20_Sub17_Sub1.method938(var11, var20, var13, var10, var12, var8, anIntArray1902[var1],
							anIntArray1902[var1], anIntArray1902[var1], anIntArray1924[var14], anIntArray1924[var6],
							anIntArray1924[var15], anIntArray1925[var14], anIntArray1925[var6], anIntArray1925[var15],
							anIntArray1890[var14], anIntArray1890[var6], anIntArray1890[var15], var21);
					Class131_Sub20_Sub17_Sub1.method938(var11, var13, anIntArray1942[3], var10, var8, anIntArray1935[3],
							anIntArray1902[var1], anIntArray1902[var1], anIntArray1902[var1], anIntArray1924[var14],
							anIntArray1924[var6], anIntArray1924[var15], anIntArray1925[var14], anIntArray1925[var6],
							anIntArray1925[var15], anIntArray1890[var14], anIntArray1890[var6], anIntArray1890[var15],
							var21);
				} else {
					Class131_Sub20_Sub17_Sub1.method938(var11, var20, var13, var10, var12, var8, anIntArray1892[0],
							anIntArray1892[1], anIntArray1892[2], anIntArray1924[var14], anIntArray1924[var6],
							anIntArray1924[var15], anIntArray1925[var14], anIntArray1925[var6], anIntArray1925[var15],
							anIntArray1890[var14], anIntArray1890[var6], anIntArray1890[var15], var21);
					Class131_Sub20_Sub17_Sub1.method938(var11, var13, anIntArray1942[3], var10, var8, anIntArray1935[3],
							anIntArray1892[0], anIntArray1892[2], anIntArray1892[3], anIntArray1924[var14],
							anIntArray1924[var6], anIntArray1924[var15], anIntArray1925[var14], anIntArray1925[var6],
							anIntArray1925[var15], anIntArray1890[var14], anIntArray1890[var6], anIntArray1890[var15],
							var21);
				}
			} else if (anIntArray1900[var1] == -1) {
				var14 = anIntArray1933[anIntArray1902[var1]];
				Class131_Sub20_Sub17_Sub1.method936(var11, var20, var13, var10, var12, var8, var14);
				Class131_Sub20_Sub17_Sub1.method936(var11, var13, anIntArray1942[3], var10, var8, anIntArray1935[3],
						var14);
			} else {
				Class131_Sub20_Sub17_Sub1.method943(var11, var20, var13, var10, var12, var8, anIntArray1892[0],
						anIntArray1892[1], anIntArray1892[2]);
				Class131_Sub20_Sub17_Sub1.method943(var11, var13, anIntArray1942[3], var10, var8, anIntArray1935[3],
						anIntArray1892[0], anIntArray1892[2], anIntArray1892[3]);
			}
		}

	}

	final void method1024(final boolean var1, boolean var2, final int var3) {
		if (anInt1938 < 1600) {
			int var5;
			for (var5 = 0; var5 < anInt1938; ++var5)
				anIntArray1928[var5] = 0;

			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			int var15;
			for (var5 = 0; var5 < anInt1895; ++var5)
				if (anIntArray1900[var5] != -2) {
					var6 = anIntArray1929[var5];
					var10 = anIntArray1896[var5];
					var9 = anIntArray1897[var5];
					var7 = anIntArray1921[var6];
					var8 = anIntArray1921[var10];
					var11 = anIntArray1921[var9];
					int var19;
					if (var1 && ((var7 == -5000) || (var8 == -5000) || (var11 == -5000))) {
						var19 = anIntArray1924[var6];
						var12 = anIntArray1924[var10];
						var13 = anIntArray1924[var9];
						int var14 = anIntArray1925[var6];
						var15 = anIntArray1925[var10];
						int var16 = anIntArray1925[var9];
						int var20 = anIntArray1890[var6];
						final int var18 = anIntArray1890[var10];
						int var21 = anIntArray1890[var9];
						var19 -= var12;
						var13 -= var12;
						var14 -= var15;
						var16 -= var15;
						var20 -= var18;
						var21 -= var18;
						final int var24 = (var14 * var21) - (var20 * var16);
						final int var22 = (var20 * var13) - (var19 * var21);
						final int var23 = (var19 * var16) - (var14 * var13);
						if (((var12 * var24) + (var15 * var22) + (var18 * var23)) > 0) {
							aBoolArray1920[var5] = true;
							final int var25 = ((anIntArray1923[var6] + anIntArray1923[var10] + anIntArray1923[var9])
									/ 3) + anInt1917;
							anIntArrayArray1888[var25][anIntArray1928[var25]++] = var5;
						}
					} else {
						if (var2 && method1031(anInt1936, anInt1943, anIntArray1922[var6], anIntArray1922[var10],
								anIntArray1922[var9], var7, var8, var11)) {
							anIntArray1945[anInt1944++] = var3;
							var2 = false;
						}

						if ((((var7 - var8) * (anIntArray1922[var9] - anIntArray1922[var10]))
								- ((anIntArray1922[var6] - anIntArray1922[var10]) * (var11 - var8))) > 0) {
							aBoolArray1920[var5] = false;
							if ((var7 >= 0) && (var8 >= 0) && (var11 >= 0)
									&& (var7 <= Class131_Sub20_Sub17_Sub1.anInt1777)
									&& (var8 <= Class131_Sub20_Sub17_Sub1.anInt1777)
									&& (var11 <= Class131_Sub20_Sub17_Sub1.anInt1777))
								aBoolArray1919[var5] = false;
							else
								aBoolArray1919[var5] = true;

							var19 = ((anIntArray1923[var6] + anIntArray1923[var10] + anIntArray1923[var9]) / 3)
									+ anInt1917;
							anIntArrayArray1888[var19][anIntArray1928[var19]++] = var5;
						}
					}
				}

			int[] var26;
			if (aByteArray1901 == null)
				for (var5 = anInt1938 - 1; var5 >= 0; --var5) {
					var6 = anIntArray1928[var5];
					if (var6 > 0) {
						var26 = anIntArrayArray1888[var5];

						for (var9 = 0; var9 < var6; ++var9)
							method1029(var26[var9]);
					}
				}
			else {
				for (var5 = 0; var5 < 12; ++var5) {
					anIntArray1930[var5] = 0;
					anIntArray1934[var5] = 0;
				}

				for (var5 = anInt1938 - 1; var5 >= 0; --var5) {
					var6 = anIntArray1928[var5];
					if (var6 > 0) {
						var26 = anIntArrayArray1888[var5];

						for (var9 = 0; var9 < var6; ++var9) {
							var7 = var26[var9];
							final byte var28 = aByteArray1901[var7];
							var11 = anIntArray1930[var28]++;
							anIntArrayArray1931[var28][var11] = var7;
							if (var28 < 10)
								anIntArray1934[var28] += var5;
							else if (var28 == 10)
								anIntArray1894[var11] = var5;
							else
								anIntArray1926[var11] = var5;
						}
					}
				}

				var5 = 0;
				if ((anIntArray1930[1] > 0) || (anIntArray1930[2] > 0))
					var5 = (anIntArray1934[1] + anIntArray1934[2]) / (anIntArray1930[1] + anIntArray1930[2]);

				var6 = 0;
				if ((anIntArray1930[3] > 0) || (anIntArray1930[4] > 0))
					var6 = (anIntArray1934[3] + anIntArray1934[4]) / (anIntArray1930[3] + anIntArray1930[4]);

				var10 = 0;
				if ((anIntArray1930[6] > 0) || (anIntArray1930[8] > 0))
					var10 = (anIntArray1934[6] + anIntArray1934[8]) / (anIntArray1930[6] + anIntArray1930[8]);

				var7 = 0;
				var8 = anIntArray1930[10];
				int[] var4 = anIntArrayArray1931[10];
				int[] var17 = anIntArray1894;
				if (var7 == var8) {
					var7 = 0;
					var8 = anIntArray1930[11];
					var4 = anIntArrayArray1931[11];
					var17 = anIntArray1926;
				}

				if (var7 < var8)
					var9 = var17[var7];
				else
					var9 = -1000;

				for (var12 = 0; var12 < 10; ++var12) {
					while ((var12 == 0) && (var9 > var5)) {
						method1029(var4[var7++]);
						if ((var7 == var8) && (var4 != anIntArrayArray1931[11])) {
							var7 = 0;
							var8 = anIntArray1930[11];
							var4 = anIntArrayArray1931[11];
							var17 = anIntArray1926;
						}

						if (var7 < var8)
							var9 = var17[var7];
						else
							var9 = -1000;
					}

					while ((var12 == 3) && (var9 > var6)) {
						method1029(var4[var7++]);
						if ((var7 == var8) && (var4 != anIntArrayArray1931[11])) {
							var7 = 0;
							var8 = anIntArray1930[11];
							var4 = anIntArrayArray1931[11];
							var17 = anIntArray1926;
						}

						if (var7 < var8)
							var9 = var17[var7];
						else
							var9 = -1000;
					}

					while ((var12 == 5) && (var9 > var10)) {
						method1029(var4[var7++]);
						if ((var7 == var8) && (var4 != anIntArrayArray1931[11])) {
							var7 = 0;
							var8 = anIntArray1930[11];
							var4 = anIntArrayArray1931[11];
							var17 = anIntArray1926;
						}

						if (var7 < var8)
							var9 = var17[var7];
						else
							var9 = -1000;
					}

					var13 = anIntArray1930[var12];
					final int[] var27 = anIntArrayArray1931[var12];

					for (var15 = 0; var15 < var13; ++var15)
						method1029(var27[var15]);
				}

				while (var9 != -1000) {
					method1029(var4[var7++]);
					if ((var7 == var8) && (var4 != anIntArrayArray1931[11])) {
						var7 = 0;
						var4 = anIntArrayArray1931[11];
						var8 = anIntArray1930[11];
						var17 = anIntArray1926;
					}

					if (var7 < var8)
						var9 = var17[var7];
					else
						var9 = -1000;
				}

			}
		}
	}

	public Class131_Sub20_Sub19_Sub7 method1025(final int[][] var1, final int var2, final int var3, final int var4,
			final boolean var5, final int var6) {
		method1015();
		int var13 = var2 - anInt1915;
		int var9 = var2 + anInt1915;
		int var11 = var4 - anInt1915;
		int var12 = var4 + anInt1915;
		if ((var13 >= 0) && (((var9 + 128) >> 7) < var1.length) && (var11 >= 0)
				&& (((var12 + 128) >> 7) < var1[0].length)) {
			var13 >>= 7;
			var9 = (var9 + 127) >> 7;
			var11 >>= 7;
			var12 = (var12 + 127) >> 7;
			if ((var1[var13][var11] == var3) && (var1[var9][var11] == var3) && (var1[var13][var12] == var3)
					&& (var1[var9][var12] == var3))
				return this;
			else {
				Class131_Sub20_Sub19_Sub7 var10;
				if (var5) {
					var10 = new Class131_Sub20_Sub19_Sub7();
					var10.anInt1918 = anInt1918;
					var10.anInt1895 = anInt1895;
					var10.anInt1906 = anInt1906;
					var10.anIntArray1948 = anIntArray1948;
					var10.anIntArray1898 = anIntArray1898;
					var10.anIntArray1929 = anIntArray1929;
					var10.anIntArray1896 = anIntArray1896;
					var10.anIntArray1897 = anIntArray1897;
					var10.anIntArray1902 = anIntArray1902;
					var10.anIntArray1910 = anIntArray1910;
					var10.anIntArray1900 = anIntArray1900;
					var10.aByteArray1901 = aByteArray1901;
					var10.aByteArray1904 = aByteArray1904;
					var10.aByteArray1903 = aByteArray1903;
					var10.aShortArray1946 = aShortArray1946;
					var10.aByte1905 = aByte1905;
					var10.anIntArray1907 = anIntArray1907;
					var10.anIntArray1908 = anIntArray1908;
					var10.anIntArray1909 = anIntArray1909;
					var10.anIntArrayArray1932 = anIntArrayArray1932;
					var10.anIntArrayArray1911 = anIntArrayArray1911;
					var10.aBool1912 = aBool1912;
					var10.anIntArray1893 = new int[var10.anInt1918];
				} else
					var10 = this;

				int var7;
				int var8;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var22;
				if (var6 == 0)
					for (var14 = 0; var14 < var10.anInt1918; ++var14) {
						var7 = anIntArray1948[var14] + var2;
						var22 = anIntArray1898[var14] + var4;
						var16 = var7 & 127;
						var19 = var22 & 127;
						var8 = var7 >> 7;
						var15 = var22 >> 7;
						var18 = ((var1[var8][var15] * (128 - var16)) + (var1[var8 + 1][var15] * var16)) >> 7;
						var17 = ((var1[var8][var15 + 1] * (128 - var16)) + (var1[var8 + 1][var15 + 1] * var16)) >> 7;
						var20 = ((var18 * (128 - var19)) + (var17 * var19)) >> 7;
						var10.anIntArray1893[var14] = (anIntArray1893[var14] + var20) - var3;
					}
				else
					for (var14 = 0; var14 < var10.anInt1918; ++var14) {
						var7 = (-anIntArray1893[var14] << 16) / anInt1643;
						if (var7 < var6) {
							var22 = anIntArray1948[var14] + var2;
							var16 = anIntArray1898[var14] + var4;
							var19 = var22 & 127;
							var8 = var16 & 127;
							var15 = var22 >> 7;
							var18 = var16 >> 7;
							var17 = ((var1[var15][var18] * (128 - var19)) + (var1[var15 + 1][var18] * var19)) >> 7;
							var20 = ((var1[var15][var18 + 1] * (128 - var19))
									+ (var1[var15 + 1][var18 + 1] * var19)) >> 7;
							final int var21 = ((var17 * (128 - var8)) + (var20 * var8)) >> 7;
							var10.anIntArray1893[var14] = anIntArray1893[var14]
									+ (((var21 - var3) * (var6 - var7)) / var6);
						}
					}

				var10.anInt1913 = 0;
				return var10;
			}
		} else
			return this;
	}

	public void method1026(final int var1) {
		final int var2 = anIntArray1891[var1];
		final int var4 = anIntArray1947[var1];

		for (int var3 = 0; var3 < anInt1918; ++var3) {
			final int var5 = ((anIntArray1893[var3] * var4) - (anIntArray1898[var3] * var2)) >> 16;
			anIntArray1898[var3] = ((anIntArray1893[var3] * var2) + (anIntArray1898[var3] * var4)) >> 16;
			anIntArray1893[var3] = var5;
		}

		anInt1913 = 0;
	}

	public void method1027(final Class131_Sub20_Sub16 var1, final int var2) {
		if (anIntArrayArray1932 != null)
			if (var2 != -1) {
				final Class43 var3 = var1.aClass43Array1626[var2];
				final Class131_Sub5 var6 = var3.aClass131_Sub5_426;
				anInt1927 = 0;
				anInt1939 = 0;
				anInt1940 = 0;

				for (int var4 = 0; var4 < var3.anInt431; ++var4) {
					final int var5 = var3.anIntArray432[var4];
					method1030(var6.anIntArray1007[var5], var6.anIntArrayArray1006[var5], var3.anIntArray433[var4],
							var3.anIntArray427[var4], var3.anIntArray430[var4]);
				}

				anInt1913 = 0;
			}
	}

	static {
		anIntArray1891 = Class131_Sub20_Sub17_Sub1.anIntArray1787;
		anIntArray1947 = Class131_Sub20_Sub17_Sub1.anIntArray1770;
		anIntArray1933 = Class131_Sub20_Sub17_Sub1.anIntArray1783;
		anIntArray1949 = Class131_Sub20_Sub17_Sub1.anIntArray1786;
	}

	public void method1028() {
		for (int var1 = 0; var1 < anInt1918; ++var1) {
			final int var2 = anIntArray1948[var1];
			anIntArray1948[var1] = anIntArray1898[var1];
			anIntArray1898[var1] = -var2;
		}

		anInt1913 = 0;
	}

	@Override
	void method869(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8, final int var9) {
		anIntArray1928[0] = -1;
		if (anInt1913 != 1)
			method1015();

		final int var10 = ((var8 * var5) - (var6 * var4)) >> 16;
		final int var11 = ((var7 * var2) + (var10 * var3)) >> 16;
		final int var12 = (anInt1915 * var3) >> 16;
		final int var13 = var11 + var12;
		if ((var13 > 50) && (var11 < 3500)) {
			final int var14 = ((var8 * var4) + (var6 * var5)) >> 16;
			int var15 = (var14 - anInt1915) * Class131_Sub20_Sub17_Sub1.anInt1774;
			if ((var15 / var13) < Class131_Sub20_Sub17_Sub1.anInt1772) {
				int var16 = (var14 + anInt1915) * Class131_Sub20_Sub17_Sub1.anInt1774;
				if ((var16 / var13) > Class131_Sub20_Sub17_Sub1.anInt1779) {
					final int var17 = ((var7 * var3) - (var10 * var2)) >> 16;
					final int var18 = (anInt1915 * var2) >> 16;
					int var19 = (var17 + var18) * Class131_Sub20_Sub17_Sub1.anInt1774;
					if ((var19 / var13) > Class131_Sub20_Sub17_Sub1.anInt1781) {
						final int var20 = var18 + ((anInt1643 * var3) >> 16);
						int var21 = (var17 - var20) * Class131_Sub20_Sub17_Sub1.anInt1774;
						if ((var21 / var13) < Class131_Sub20_Sub17_Sub1.anInt1785) {
							final int var22 = var12 + ((anInt1643 * var2) >> 16);
							boolean var23 = false;
							boolean var24 = false;
							if ((var11 - var22) <= 50)
								var24 = true;

							final boolean var25 = var24 || (anInt1906 > 0);
							boolean var26 = false;
							int var27;
							int var28;
							int var29;
							if ((var9 > 0) && aBool1941) {
								var27 = var11 - var12;
								if (var27 <= 50)
									var27 = 50;

								if (var14 > 0) {
									var15 /= var13;
									var16 /= var27;
								} else {
									var16 /= var13;
									var15 /= var27;
								}

								if (var17 > 0) {
									var21 /= var13;
									var19 /= var27;
								} else {
									var19 /= var13;
									var21 /= var27;
								}

								var28 = anInt1936 - Class131_Sub20_Sub17_Sub1.anInt1780;
								var29 = anInt1943 - Class131_Sub20_Sub17_Sub1.anInt1776;
								if ((var28 > var15) && (var28 < var16) && (var29 > var21) && (var29 < var19))
									if (aBool1912)
										anIntArray1945[anInt1944++] = var9;
									else
										var26 = true;
							}

							var27 = Class131_Sub20_Sub17_Sub1.anInt1780;
							var28 = Class131_Sub20_Sub17_Sub1.anInt1776;
							var29 = 0;
							int var30 = 0;
							if (var1 != 0) {
								var29 = anIntArray1891[var1];
								var30 = anIntArray1947[var1];
							}

							for (int var31 = 0; var31 < anInt1918; ++var31) {
								int var32 = anIntArray1948[var31];
								int var33 = anIntArray1893[var31];
								int var34 = anIntArray1898[var31];
								int var35;
								if (var1 != 0) {
									var35 = ((var34 * var29) + (var32 * var30)) >> 16;
									var34 = ((var34 * var30) - (var32 * var29)) >> 16;
									var32 = var35;
								}

								var32 += var6;
								var33 += var7;
								var34 += var8;
								var35 = ((var34 * var4) + (var32 * var5)) >> 16;
								var34 = ((var34 * var5) - (var32 * var4)) >> 16;
								var32 = var35;
								var35 = ((var33 * var3) - (var34 * var2)) >> 16;
								var34 = ((var33 * var2) + (var34 * var3)) >> 16;
								anIntArray1923[var31] = var34 - var11;
								if (var34 >= 50) {
									anIntArray1921[var31] = var27
											+ ((var32 * Class131_Sub20_Sub17_Sub1.anInt1774) / var34);
									anIntArray1922[var31] = var28
											+ ((var35 * Class131_Sub20_Sub17_Sub1.anInt1774) / var34);
								} else {
									anIntArray1921[var31] = -5000;
									var23 = true;
								}

								if (var25) {
									anIntArray1924[var31] = var32;
									anIntArray1925[var31] = var35;
									anIntArray1890[var31] = var34;
								}
							}

							try {
								method1024(var23, var26, var9);
							} catch (final Exception var37) {
								;
							}

						}
					}
				}
			}
		}
	}

	final void method1029(final int var1) {
		if (aBoolArray1920[var1])
			method1023(var1);
		else {
			final int var4 = anIntArray1929[var1];
			final int var5 = anIntArray1896[var1];
			final int var2 = anIntArray1897[var1];
			Class131_Sub20_Sub17_Sub1.aBool1775 = aBoolArray1919[var1];
			if (aByteArray1904 == null)
				Class131_Sub20_Sub17_Sub1.anInt1771 = 0;
			else
				Class131_Sub20_Sub17_Sub1.anInt1771 = aByteArray1904[var1] & 255;

			if ((aShortArray1946 != null) && (aShortArray1946[var1] != -1)) {
				int var3;
				int var6;
				int var7;
				if ((aByteArray1903 != null) && (aByteArray1903[var1] != -1)) {
					final int var8 = aByteArray1903[var1] & 255;
					var6 = anIntArray1907[var8];
					var7 = anIntArray1908[var8];
					var3 = anIntArray1909[var8];
				} else {
					var6 = var4;
					var7 = var5;
					var3 = var2;
				}

				if (anIntArray1900[var1] == -1)
					Class131_Sub20_Sub17_Sub1.method938(anIntArray1922[var4], anIntArray1922[var5],
							anIntArray1922[var2], anIntArray1921[var4], anIntArray1921[var5], anIntArray1921[var2],
							anIntArray1902[var1], anIntArray1902[var1], anIntArray1902[var1], anIntArray1924[var6],
							anIntArray1924[var7], anIntArray1924[var3], anIntArray1925[var6], anIntArray1925[var7],
							anIntArray1925[var3], anIntArray1890[var6], anIntArray1890[var7], anIntArray1890[var3],
							aShortArray1946[var1]);
				else
					Class131_Sub20_Sub17_Sub1.method938(anIntArray1922[var4], anIntArray1922[var5],
							anIntArray1922[var2], anIntArray1921[var4], anIntArray1921[var5], anIntArray1921[var2],
							anIntArray1902[var1], anIntArray1910[var1], anIntArray1900[var1], anIntArray1924[var6],
							anIntArray1924[var7], anIntArray1924[var3], anIntArray1925[var6], anIntArray1925[var7],
							anIntArray1925[var3], anIntArray1890[var6], anIntArray1890[var7], anIntArray1890[var3],
							aShortArray1946[var1]);
			} else if (anIntArray1900[var1] == -1)
				Class131_Sub20_Sub17_Sub1.method936(anIntArray1922[var4], anIntArray1922[var5], anIntArray1922[var2],
						anIntArray1921[var4], anIntArray1921[var5], anIntArray1921[var2],
						anIntArray1933[anIntArray1902[var1]]);
			else
				Class131_Sub20_Sub17_Sub1.method943(anIntArray1922[var4], anIntArray1922[var5], anIntArray1922[var2],
						anIntArray1921[var4], anIntArray1921[var5], anIntArray1921[var2], anIntArray1902[var1],
						anIntArray1910[var1], anIntArray1900[var1]);

		}
	}

	void method1030(final int var1, final int[] var2, final int var3, final int var4, final int var5) {
		final int var6 = var2.length;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var1 == 0) {
			var8 = 0;
			anInt1927 = 0;
			anInt1939 = 0;
			anInt1940 = 0;

			for (var9 = 0; var9 < var6; ++var9) {
				final int var11 = var2[var9];
				if (var11 < anIntArrayArray1932.length) {
					final int[] var12 = anIntArrayArray1932[var11];

					for (var10 = 0; var10 < var12.length; ++var10) {
						var7 = var12[var10];
						anInt1927 += anIntArray1948[var7];
						anInt1939 += anIntArray1893[var7];
						anInt1940 += anIntArray1898[var7];
						++var8;
					}
				}
			}

			if (var8 > 0) {
				anInt1927 = (anInt1927 / var8) + var3;
				anInt1939 = (anInt1939 / var8) + var4;
				anInt1940 = (anInt1940 / var8) + var5;
			} else {
				anInt1927 = var3;
				anInt1939 = var4;
				anInt1940 = var5;
			}

		} else {
			int var13;
			int[] var15;
			if (var1 == 1)
				for (var8 = 0; var8 < var6; ++var8) {
					var9 = var2[var8];
					if (var9 < anIntArrayArray1932.length) {
						var15 = anIntArrayArray1932[var9];

						for (var13 = 0; var13 < var15.length; ++var13) {
							var10 = var15[var13];
							anIntArray1948[var10] += var3;
							anIntArray1893[var10] += var4;
							anIntArray1898[var10] += var5;
						}
					}
				}
			else if (var1 == 2)
				for (var8 = 0; var8 < var6; ++var8) {
					var9 = var2[var8];
					if (var9 < anIntArrayArray1932.length) {
						var15 = anIntArrayArray1932[var9];

						for (var13 = 0; var13 < var15.length; ++var13) {
							var10 = var15[var13];
							anIntArray1948[var10] -= anInt1927;
							anIntArray1893[var10] -= anInt1939;
							anIntArray1898[var10] -= anInt1940;
							var7 = (var3 & 255) * 8;
							final int var14 = (var4 & 255) * 8;
							final int var19 = (var5 & 255) * 8;
							int var16;
							int var17;
							int var18;
							if (var19 != 0) {
								var16 = anIntArray1891[var19];
								var17 = anIntArray1947[var19];
								var18 = ((anIntArray1893[var10] * var16) + (anIntArray1948[var10] * var17)) >> 16;
								anIntArray1893[var10] = ((anIntArray1893[var10] * var17)
										- (anIntArray1948[var10] * var16)) >> 16;
								anIntArray1948[var10] = var18;
							}

							if (var7 != 0) {
								var16 = anIntArray1891[var7];
								var17 = anIntArray1947[var7];
								var18 = ((anIntArray1893[var10] * var17) - (anIntArray1898[var10] * var16)) >> 16;
								anIntArray1898[var10] = ((anIntArray1893[var10] * var16)
										+ (anIntArray1898[var10] * var17)) >> 16;
								anIntArray1893[var10] = var18;
							}

							if (var14 != 0) {
								var16 = anIntArray1891[var14];
								var17 = anIntArray1947[var14];
								var18 = ((anIntArray1898[var10] * var16) + (anIntArray1948[var10] * var17)) >> 16;
								anIntArray1898[var10] = ((anIntArray1898[var10] * var17)
										- (anIntArray1948[var10] * var16)) >> 16;
								anIntArray1948[var10] = var18;
							}

							anIntArray1948[var10] += anInt1927;
							anIntArray1893[var10] += anInt1939;
							anIntArray1898[var10] += anInt1940;
						}
					}
				}
			else if (var1 == 3)
				for (var8 = 0; var8 < var6; ++var8) {
					var9 = var2[var8];
					if (var9 < anIntArrayArray1932.length) {
						var15 = anIntArrayArray1932[var9];

						for (var13 = 0; var13 < var15.length; ++var13) {
							var10 = var15[var13];
							anIntArray1948[var10] -= anInt1927;
							anIntArray1893[var10] -= anInt1939;
							anIntArray1898[var10] -= anInt1940;
							anIntArray1948[var10] = (anIntArray1948[var10] * var3) / 128;
							anIntArray1893[var10] = (anIntArray1893[var10] * var4) / 128;
							anIntArray1898[var10] = (anIntArray1898[var10] * var5) / 128;
							anIntArray1948[var10] += anInt1927;
							anIntArray1893[var10] += anInt1939;
							anIntArray1898[var10] += anInt1940;
						}
					}
				}
			else if (var1 == 5)
				if ((anIntArrayArray1911 != null) && (aByteArray1904 != null))
					for (var8 = 0; var8 < var6; ++var8) {
						var9 = var2[var8];
						if (var9 < anIntArrayArray1911.length) {
							var15 = anIntArrayArray1911[var9];

							for (var13 = 0; var13 < var15.length; ++var13) {
								var10 = var15[var13];
								var7 = (aByteArray1904[var10] & 255) + (var3 * 8);
								if (var7 < 0)
									var7 = 0;
								else if (var7 > 255)
									var7 = 255;

								aByteArray1904[var10] = (byte) var7;
							}
						}
					}
		}
	}

	final boolean method1031(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final int var8) {
		return (var2 < var3) && (var2 < var4) && (var2 < var5) ? false
				: ((var2 > var3) && (var2 > var4) && (var2 > var5) ? false
						: ((var1 < var6) && (var1 < var7) && (var1 < var8) ? false
								: (var1 <= var6) || (var1 <= var7) || (var1 <= var8)));
	}

	public void method1032() {
		for (int var1 = 0; var1 < anInt1918; ++var1) {
			anIntArray1948[var1] = -anIntArray1948[var1];
			anIntArray1898[var1] = -anIntArray1898[var1];
		}

		anInt1913 = 0;
	}
}
