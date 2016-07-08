public class Class131_Sub20_Sub19_Sub6 extends Class131_Sub20_Sub19 {
	static int[] anIntArray1883 = new int[10000];
	static int[] anIntArray1886 = new int[10000];
	static int anInt1885 = 0;
	static int[] anIntArray1875;
	static int[] anIntArray1887;
	int anInt1865 = 0;
	int anInt1843 = 0;
	byte aByte1876 = 0;
	boolean aBool1877 = false;
	byte[] aByteArray1871;
	int anInt1867;
	int[] anIntArray1850;
	int[] anIntArray1866;
	int[] anIntArray1844;
	int[] anIntArray1846;
	int[] anIntArray1847;
	int[] anIntArray1848;
	int[] anIntArray1868;
	byte[] aByteArray1849;
	byte[] aByteArray1874;
	byte[] aByteArray1851;
	int[] anIntArray1869;
	short[] aShortArray1854;
	short[] aShortArray1853;
	byte[] aByteArray1852;
	short[] aShortArray1858;
	short[] aShortArray1859;
	short[] aShortArray1860;
	short[] aShortArray1861;
	short[] aShortArray1845;
	short[] aShortArray1863;
	short[] aShortArray1864;
	byte[] aByteArray1857;
	short[] aShortArray1842;
	short[] aShortArray1856;
	int[][] anIntArrayArray1870;
	int[][] anIntArrayArray1855;
	Class23[] aClass23Array1873;
	Class45[] aClass45Array1872;
	Class23[] aClass23Array1884;
	public short aShort1862;
	public short aShort1841;
	int anInt1878;
	int anInt1879;
	int anInt1880;
	int anInt1881;
	int anInt1882;

	static {
		anIntArray1875 = Class131_Sub20_Sub17_Sub1.anIntArray1787;
		anIntArray1887 = Class131_Sub20_Sub17_Sub1.anIntArray1770;
	}

	Class131_Sub20_Sub19_Sub6(final byte[] var1) {
		if ((var1[var1.length - 1] == -1) && (var1[var1.length - 2] == -1))
			method988(var1);
		else
			method1007(var1);

	}

	void method988(final byte[] var1) {
		final DataBuffer var2 = new DataBuffer(var1);
		final DataBuffer var31 = new DataBuffer(var1);
		final DataBuffer var4 = new DataBuffer(var1);
		final DataBuffer var17 = new DataBuffer(var1);
		final DataBuffer var18 = new DataBuffer(var1);
		final DataBuffer var6 = new DataBuffer(var1);
		final DataBuffer var9 = new DataBuffer(var1);
		var2.pos = var1.length - 23;
		final int var38 = var2.readUShort();
		final int var11 = var2.readUShort();
		final int var25 = var2.method595();
		final int var12 = var2.method595();
		final int var13 = var2.method595();
		final int var14 = var2.method595();
		final int var5 = var2.method595();
		final int var7 = var2.method595();
		final int var20 = var2.method595();
		final int var51 = var2.readUShort();
		final int var15 = var2.readUShort();
		final int var21 = var2.readUShort();
		final int var22 = var2.readUShort();
		final int var56 = var2.readUShort();
		int var24 = 0;
		int var3 = 0;
		int var32 = 0;
		int var8;
		if (var25 > 0) {
			aByteArray1871 = new byte[var25];
			var2.pos = 0;

			for (var8 = 0; var8 < var25; ++var8) {
				final byte var28 = aByteArray1871[var8] = var2.method584();
				if (var28 == 0)
					++var24;

				if ((var28 >= 1) && (var28 <= 3))
					++var3;

				if (var28 == 2)
					++var32;
			}
		}

		var8 = var25 + var38;
		final int var55 = var8;
		if (var12 == 1)
			var8 += var11;

		final int var33 = var8;
		var8 += var11;
		final int var34 = var8;
		if (var13 == 255)
			var8 += var11;

		final int var35 = var8;
		if (var5 == 1)
			var8 += var11;

		final int var23 = var8;
		if (var20 == 1)
			var8 += var38;

		final int var39 = var8;
		if (var14 == 1)
			var8 += var11;

		final int var40 = var8;
		var8 += var22;
		final int var41 = var8;
		if (var7 == 1)
			var8 += var11 * 2;

		final int var10 = var8;
		var8 += var56;
		final int var42 = var8;
		var8 += var11 * 2;
		final int var43 = var8;
		var8 += var51;
		final int var52 = var8;
		var8 += var15;
		final int var47 = var8;
		var8 += var21;
		final int var54 = var8;
		var8 += var24 * 6;
		final int var46 = var8;
		var8 += var3 * 6;
		final int var26 = var8;
		var8 += var3 * 6;
		final int var57 = var8;
		var8 += var3 * 2;
		final int var19 = var8;
		var8 += var3;
		final int var27 = var8;
		var8 += (var3 * 2) + (var32 * 2);
		anInt1865 = var38;
		anInt1843 = var11;
		anInt1867 = var25;
		anIntArray1850 = new int[var38];
		anIntArray1866 = new int[var38];
		anIntArray1844 = new int[var38];
		anIntArray1846 = new int[var11];
		anIntArray1847 = new int[var11];
		anIntArray1848 = new int[var11];
		if (var20 == 1)
			anIntArray1868 = new int[var38];

		if (var12 == 1)
			aByteArray1849 = new byte[var11];

		if (var13 == 255)
			aByteArray1874 = new byte[var11];
		else
			aByte1876 = (byte) var13;

		if (var14 == 1)
			aByteArray1851 = new byte[var11];

		if (var5 == 1)
			anIntArray1869 = new int[var11];

		if (var7 == 1)
			aShortArray1854 = new short[var11];

		if ((var7 == 1) && (var25 > 0))
			aByteArray1852 = new byte[var11];

		aShortArray1853 = new short[var11];
		if (var25 > 0) {
			aShortArray1858 = new short[var25];
			aShortArray1859 = new short[var25];
			aShortArray1860 = new short[var25];
			if (var3 > 0) {
				aShortArray1861 = new short[var3];
				aShortArray1845 = new short[var3];
				aShortArray1863 = new short[var3];
				aShortArray1864 = new short[var3];
				aByteArray1857 = new byte[var3];
				aShortArray1842 = new short[var3];
			}

			if (var32 > 0)
				aShortArray1856 = new short[var32];
		}

		var2.pos = var25;
		var31.pos = var43;
		var4.pos = var52;
		var17.pos = var47;
		var18.pos = var23;
		int var49 = 0;
		int var44 = 0;
		int var53 = 0;

		int var16;
		int var30;
		int var37;
		int var45;
		int var48;
		for (var16 = 0; var16 < var38; ++var16) {
			var37 = var2.method595();
			var48 = 0;
			if ((var37 & 1) != 0)
				var48 = var31.method605();

			var45 = 0;
			if ((var37 & 2) != 0)
				var45 = var4.method605();

			var30 = 0;
			if ((var37 & 4) != 0)
				var30 = var17.method605();

			anIntArray1850[var16] = var49 + var48;
			anIntArray1866[var16] = var44 + var45;
			anIntArray1844[var16] = var53 + var30;
			var49 = anIntArray1850[var16];
			var44 = anIntArray1866[var16];
			var53 = anIntArray1844[var16];
			if (var20 == 1)
				anIntArray1868[var16] = var18.method595();
		}

		var2.pos = var42;
		var31.pos = var55;
		var4.pos = var34;
		var17.pos = var39;
		var18.pos = var35;
		var6.pos = var41;
		var9.pos = var10;

		for (var16 = 0; var16 < var11; ++var16) {
			aShortArray1853[var16] = (short) var2.readUShort();
			if (var12 == 1)
				aByteArray1849[var16] = var31.method584();

			if (var13 == 255)
				aByteArray1874[var16] = var4.method584();

			if (var14 == 1)
				aByteArray1851[var16] = var17.method584();

			if (var5 == 1)
				anIntArray1869[var16] = var18.method595();

			if (var7 == 1)
				aShortArray1854[var16] = (short) (var6.readUShort() - 1);

			if ((aByteArray1852 != null) && (aShortArray1854[var16] != -1))
				aByteArray1852[var16] = (byte) (var9.method595() - 1);
		}

		var2.pos = var40;
		var31.pos = var33;
		var16 = 0;
		var37 = 0;
		var48 = 0;
		var45 = 0;

		int var29;
		for (var30 = 0; var30 < var11; ++var30) {
			var29 = var31.method595();
			if (var29 == 1) {
				var16 = var2.method605() + var45;
				var37 = var2.method605() + var16;
				var48 = var2.method605() + var37;
				var45 = var48;
				anIntArray1846[var30] = var16;
				anIntArray1847[var30] = var37;
				anIntArray1848[var30] = var48;
			}

			if (var29 == 2) {
				var37 = var48;
				var48 = var2.method605() + var45;
				var45 = var48;
				anIntArray1846[var30] = var16;
				anIntArray1847[var30] = var37;
				anIntArray1848[var30] = var48;
			}

			if (var29 == 3) {
				var16 = var48;
				var48 = var2.method605() + var45;
				var45 = var48;
				anIntArray1846[var30] = var16;
				anIntArray1847[var30] = var37;
				anIntArray1848[var30] = var48;
			}

			if (var29 == 4) {
				final int var36 = var16;
				var16 = var37;
				var37 = var36;
				var48 = var2.method605() + var45;
				var45 = var48;
				anIntArray1846[var30] = var16;
				anIntArray1847[var30] = var36;
				anIntArray1848[var30] = var48;
			}
		}

		var2.pos = var54;
		var31.pos = var46;
		var4.pos = var26;
		var17.pos = var57;
		var18.pos = var19;
		var6.pos = var27;

		for (var30 = 0; var30 < var25; ++var30) {
			var29 = aByteArray1871[var30] & 255;
			if (var29 == 0) {
				aShortArray1858[var30] = (short) var2.readUShort();
				aShortArray1859[var30] = (short) var2.readUShort();
				aShortArray1860[var30] = (short) var2.readUShort();
			}

			if (var29 == 1) {
				aShortArray1858[var30] = (short) var31.readUShort();
				aShortArray1859[var30] = (short) var31.readUShort();
				aShortArray1860[var30] = (short) var31.readUShort();
				aShortArray1861[var30] = (short) var4.readUShort();
				aShortArray1845[var30] = (short) var4.readUShort();
				aShortArray1863[var30] = (short) var4.readUShort();
				aShortArray1864[var30] = (short) var17.readUShort();
				aByteArray1857[var30] = var18.method584();
				aShortArray1842[var30] = (short) var6.readUShort();
			}

			if (var29 == 2) {
				aShortArray1858[var30] = (short) var31.readUShort();
				aShortArray1859[var30] = (short) var31.readUShort();
				aShortArray1860[var30] = (short) var31.readUShort();
				aShortArray1861[var30] = (short) var4.readUShort();
				aShortArray1845[var30] = (short) var4.readUShort();
				aShortArray1863[var30] = (short) var4.readUShort();
				aShortArray1864[var30] = (short) var17.readUShort();
				aByteArray1857[var30] = var18.method584();
				aShortArray1842[var30] = (short) var6.readUShort();
				aShortArray1856[var30] = (short) var6.readUShort();
			}

			if (var29 == 3) {
				aShortArray1858[var30] = (short) var31.readUShort();
				aShortArray1859[var30] = (short) var31.readUShort();
				aShortArray1860[var30] = (short) var31.readUShort();
				aShortArray1861[var30] = (short) var4.readUShort();
				aShortArray1845[var30] = (short) var4.readUShort();
				aShortArray1863[var30] = (short) var4.readUShort();
				aShortArray1864[var30] = (short) var17.readUShort();
				aByteArray1857[var30] = var18.method584();
				aShortArray1842[var30] = (short) var6.readUShort();
			}
		}

		var2.pos = var8;
		var30 = var2.method595();
		if (var30 != 0) {
			new Class41();
			var2.readUShort();
			var2.readUShort();
			var2.readUShort();
			var2.readIntV1();
		}

	}

	final int method989(final Class131_Sub20_Sub19_Sub6 var1, final int var2) {
		int var3 = -1;
		final int var6 = var1.anIntArray1850[var2];
		final int var7 = var1.anIntArray1866[var2];
		final int var4 = var1.anIntArray1844[var2];

		for (int var5 = 0; var5 < anInt1865; ++var5)
			if ((var6 == anIntArray1850[var5]) && (var7 == anIntArray1866[var5]) && (var4 == anIntArray1844[var5])) {
				var3 = var5;
				break;
			}

		if (var3 == -1) {
			anIntArray1850[anInt1865] = var6;
			anIntArray1866[anInt1865] = var7;
			anIntArray1844[anInt1865] = var4;
			if (var1.anIntArray1868 != null)
				anIntArray1868[anInt1865] = var1.anIntArray1868[var2];

			var3 = anInt1865++;
		}

		return var3;
	}

	public Class131_Sub20_Sub19_Sub6(final Class131_Sub20_Sub19_Sub6 var1, final boolean var2, final boolean var3,
			final boolean var4, final boolean var5) {
		anInt1865 = var1.anInt1865;
		anInt1843 = var1.anInt1843;
		anInt1867 = var1.anInt1867;
		int var6;
		if (var2) {
			anIntArray1850 = var1.anIntArray1850;
			anIntArray1866 = var1.anIntArray1866;
			anIntArray1844 = var1.anIntArray1844;
		} else {
			anIntArray1850 = new int[anInt1865];
			anIntArray1866 = new int[anInt1865];
			anIntArray1844 = new int[anInt1865];

			for (var6 = 0; var6 < anInt1865; ++var6) {
				anIntArray1850[var6] = var1.anIntArray1850[var6];
				anIntArray1866[var6] = var1.anIntArray1866[var6];
				anIntArray1844[var6] = var1.anIntArray1844[var6];
			}
		}

		if (var3)
			aShortArray1853 = var1.aShortArray1853;
		else {
			aShortArray1853 = new short[anInt1843];

			for (var6 = 0; var6 < anInt1843; ++var6)
				aShortArray1853[var6] = var1.aShortArray1853[var6];
		}

		if (!var4 && (var1.aShortArray1854 != null)) {
			aShortArray1854 = new short[anInt1843];

			for (var6 = 0; var6 < anInt1843; ++var6)
				aShortArray1854[var6] = var1.aShortArray1854[var6];
		} else
			aShortArray1854 = var1.aShortArray1854;

		aByteArray1851 = var1.aByteArray1851;
		anIntArray1846 = var1.anIntArray1846;
		anIntArray1847 = var1.anIntArray1847;
		anIntArray1848 = var1.anIntArray1848;
		aByteArray1849 = var1.aByteArray1849;
		aByteArray1874 = var1.aByteArray1874;
		aByteArray1852 = var1.aByteArray1852;
		aByte1876 = var1.aByte1876;
		aByteArray1871 = var1.aByteArray1871;
		aShortArray1858 = var1.aShortArray1858;
		aShortArray1859 = var1.aShortArray1859;
		aShortArray1860 = var1.aShortArray1860;
		aShortArray1861 = var1.aShortArray1861;
		aShortArray1845 = var1.aShortArray1845;
		aShortArray1863 = var1.aShortArray1863;
		aShortArray1864 = var1.aShortArray1864;
		aByteArray1857 = var1.aByteArray1857;
		aShortArray1842 = var1.aShortArray1842;
		aShortArray1856 = var1.aShortArray1856;
		anIntArray1868 = var1.anIntArray1868;
		anIntArray1869 = var1.anIntArray1869;
		anIntArrayArray1870 = var1.anIntArrayArray1870;
		anIntArrayArray1855 = var1.anIntArrayArray1855;
		aClass23Array1873 = var1.aClass23Array1873;
		aClass45Array1872 = var1.aClass45Array1872;
		aClass23Array1884 = var1.aClass23Array1884;
		aShort1862 = var1.aShort1862;
		aShort1841 = var1.aShort1841;
	}

	void method990() {
		int var1;
		int var2;
		int[] var3;
		int var4;
		if (anIntArray1868 != null) {
			var3 = new int[256];
			var1 = 0;

			for (var2 = 0; var2 < anInt1865; ++var2) {
				var4 = anIntArray1868[var2];
				++var3[var4];
				if (var4 > var1)
					var1 = var4;
			}

			anIntArrayArray1870 = new int[var1 + 1][];

			for (var2 = 0; var2 <= var1; ++var2) {
				anIntArrayArray1870[var2] = new int[var3[var2]];
				var3[var2] = 0;
			}

			for (var2 = 0; var2 < anInt1865; anIntArrayArray1870[var4][var3[var4]++] = var2++)
				var4 = anIntArray1868[var2];

			anIntArray1868 = null;
		}

		if (anIntArray1869 != null) {
			var3 = new int[256];
			var1 = 0;

			for (var2 = 0; var2 < anInt1843; ++var2) {
				var4 = anIntArray1869[var2];
				++var3[var4];
				if (var4 > var1)
					var1 = var4;
			}

			anIntArrayArray1855 = new int[var1 + 1][];

			for (var2 = 0; var2 <= var1; ++var2) {
				anIntArrayArray1855[var2] = new int[var3[var2]];
				var3[var2] = 0;
			}

			for (var2 = 0; var2 < anInt1843; anIntArrayArray1855[var4][var3[var4]++] = var2++)
				var4 = anIntArray1869[var2];

			anIntArray1869 = null;
		}

	}

	public void method991() {
		for (int var1 = 0; var1 < anInt1865; ++var1) {
			final int var2 = anIntArray1850[var1];
			anIntArray1850[var1] = anIntArray1844[var1];
			anIntArray1844[var1] = -var2;
		}

		method999();
	}

	Class131_Sub20_Sub19_Sub6() {
	}

	public void method992() {
		for (int var1 = 0; var1 < anInt1865; ++var1) {
			final int var2 = anIntArray1844[var1];
			anIntArray1844[var1] = anIntArray1850[var1];
			anIntArray1850[var1] = -var2;
		}

		method999();
	}

	public static Class131_Sub20_Sub19_Sub6 method993(final Class100 var0, final int var1, final int var2) {
		final byte[] var3 = var0.method402(var1, var2);
		return var3 != null ? new Class131_Sub20_Sub19_Sub6(var3) : null;
	}

	static void method994(final Class131_Sub20_Sub19_Sub6 var0, final Class131_Sub20_Sub19_Sub6 var1, final int var2,
			final int var3, final int var4, final boolean var5) {
		var0.method1000();
		var0.method998();
		var1.method1000();
		var1.method998();
		++anInt1885;
		int var10 = 0;
		final int[] var13 = var1.anIntArray1850;
		final int var12 = var1.anInt1865;

		int var11;
		for (var11 = 0; var11 < var0.anInt1865; ++var11) {
			final Class23 var9 = var0.aClass23Array1873[var11];
			if (var9.anInt209 != 0) {
				final int var14 = var0.anIntArray1866[var11] - var3;
				if (var14 <= var1.anInt1878) {
					final int var15 = var0.anIntArray1850[var11] - var2;
					if ((var15 >= var1.anInt1879) && (var15 <= var1.anInt1880)) {
						final int var17 = var0.anIntArray1844[var11] - var4;
						if ((var17 >= var1.anInt1882) && (var17 <= var1.anInt1881))
							for (int var6 = 0; var6 < var12; ++var6) {
								final Class23 var7 = var1.aClass23Array1873[var6];
								if ((var15 == var13[var6]) && (var17 == var1.anIntArray1844[var6])
										&& (var14 == var1.anIntArray1866[var6]) && (var7.anInt209 != 0)) {
									if (var0.aClass23Array1884 == null)
										var0.aClass23Array1884 = new Class23[var0.anInt1865];

									if (var1.aClass23Array1884 == null)
										var1.aClass23Array1884 = new Class23[var12];

									Class23 var16 = var0.aClass23Array1884[var11];
									if (var16 == null)
										var16 = var0.aClass23Array1884[var11] = new Class23(var9);

									Class23 var8 = var1.aClass23Array1884[var6];
									if (var8 == null)
										var8 = var1.aClass23Array1884[var6] = new Class23(var7);

									var16.anInt208 += var7.anInt208;
									var16.anInt207 += var7.anInt207;
									var16.anInt211 += var7.anInt211;
									var16.anInt209 += var7.anInt209;
									var8.anInt208 += var9.anInt208;
									var8.anInt207 += var9.anInt207;
									var8.anInt211 += var9.anInt211;
									var8.anInt209 += var9.anInt209;
									++var10;
									anIntArray1883[var11] = anInt1885;
									anIntArray1886[var6] = anInt1885;
								}
							}
					}
				}
			}
		}

		if ((var10 >= 3) && var5) {
			for (var11 = 0; var11 < var0.anInt1843; ++var11)
				if ((anIntArray1883[var0.anIntArray1846[var11]] == anInt1885)
						&& (anIntArray1883[var0.anIntArray1847[var11]] == anInt1885)
						&& (anIntArray1883[var0.anIntArray1848[var11]] == anInt1885)) {
					if (var0.aByteArray1849 == null)
						var0.aByteArray1849 = new byte[var0.anInt1843];

					var0.aByteArray1849[var11] = 2;
				}

			for (var11 = 0; var11 < var1.anInt1843; ++var11)
				if ((anIntArray1886[var1.anIntArray1846[var11]] == anInt1885)
						&& (anIntArray1886[var1.anIntArray1847[var11]] == anInt1885)
						&& (anIntArray1886[var1.anIntArray1848[var11]] == anInt1885)) {
					if (var1.aByteArray1849 == null)
						var1.aByteArray1849 = new byte[var1.anInt1843];

					var1.aByteArray1849[var11] = 2;
				}

		}
	}

	public Class131_Sub20_Sub19_Sub6 method995(final int[][] var1, final int var2, final int var3, final int var4,
			final boolean var5, final int var6) {
		method1000();
		int var12 = var2 + anInt1879;
		int var8 = var2 + anInt1880;
		int var13 = var4 + anInt1882;
		int var11 = var4 + anInt1881;
		if ((var12 >= 0) && (((var8 + 128) >> 7) < var1.length) && (var13 >= 0)
				&& (((var11 + 128) >> 7) < var1[0].length)) {
			var12 >>= 7;
			var8 = (var8 + 127) >> 7;
			var13 >>= 7;
			var11 = (var11 + 127) >> 7;
			if ((var1[var12][var13] == var3) && (var1[var8][var13] == var3) && (var1[var12][var11] == var3)
					&& (var1[var8][var11] == var3))
				return this;
			else {
				final Class131_Sub20_Sub19_Sub6 var9 = new Class131_Sub20_Sub19_Sub6();
				var9.anInt1865 = anInt1865;
				var9.anInt1843 = anInt1843;
				var9.anInt1867 = anInt1867;
				var9.anIntArray1850 = anIntArray1850;
				var9.anIntArray1844 = anIntArray1844;
				var9.anIntArray1846 = anIntArray1846;
				var9.anIntArray1847 = anIntArray1847;
				var9.anIntArray1848 = anIntArray1848;
				var9.aByteArray1849 = aByteArray1849;
				var9.aByteArray1874 = aByteArray1874;
				var9.aByteArray1851 = aByteArray1851;
				var9.aByteArray1852 = aByteArray1852;
				var9.aShortArray1853 = aShortArray1853;
				var9.aShortArray1854 = aShortArray1854;
				var9.aByte1876 = aByte1876;
				var9.aByteArray1871 = aByteArray1871;
				var9.aShortArray1858 = aShortArray1858;
				var9.aShortArray1859 = aShortArray1859;
				var9.aShortArray1860 = aShortArray1860;
				var9.aShortArray1861 = aShortArray1861;
				var9.aShortArray1845 = aShortArray1845;
				var9.aShortArray1863 = aShortArray1863;
				var9.aShortArray1864 = aShortArray1864;
				var9.aByteArray1857 = aByteArray1857;
				var9.aShortArray1842 = aShortArray1842;
				var9.aShortArray1856 = aShortArray1856;
				var9.anIntArray1868 = anIntArray1868;
				var9.anIntArray1869 = anIntArray1869;
				var9.anIntArrayArray1870 = anIntArrayArray1870;
				var9.anIntArrayArray1855 = anIntArrayArray1855;
				var9.aShort1862 = aShort1862;
				var9.aShort1841 = aShort1841;
				var9.anIntArray1866 = new int[var9.anInt1865];
				int var7;
				int var10;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var22;
				if (var6 == 0)
					for (var7 = 0; var7 < var9.anInt1865; ++var7) {
						var16 = anIntArray1850[var7] + var2;
						var14 = anIntArray1844[var7] + var4;
						var18 = var16 & 127;
						var22 = var14 & 127;
						var17 = var16 >> 7;
						var15 = var14 >> 7;
						var19 = ((var1[var17][var15] * (128 - var18)) + (var1[var17 + 1][var15] * var18)) >> 7;
						var20 = ((var1[var17][var15 + 1] * (128 - var18)) + (var1[var17 + 1][var15 + 1] * var18)) >> 7;
						var10 = ((var19 * (128 - var22)) + (var20 * var22)) >> 7;
						var9.anIntArray1866[var7] = (anIntArray1866[var7] + var10) - var3;
					}
				else
					for (var7 = 0; var7 < var9.anInt1865; ++var7) {
						var16 = (-anIntArray1866[var7] << 16) / anInt1643;
						if (var16 < var6) {
							var14 = anIntArray1850[var7] + var2;
							var18 = anIntArray1844[var7] + var4;
							var22 = var14 & 127;
							var17 = var18 & 127;
							var15 = var14 >> 7;
							var19 = var18 >> 7;
							var20 = ((var1[var15][var19] * (128 - var22)) + (var1[var15 + 1][var19] * var22)) >> 7;
							var10 = ((var1[var15][var19 + 1] * (128 - var22))
									+ (var1[var15 + 1][var19 + 1] * var22)) >> 7;
							final int var21 = ((var20 * (128 - var17)) + (var10 * var17)) >> 7;
							var9.anIntArray1866[var7] = anIntArray1866[var7]
									+ (((var21 - var3) * (var6 - var16)) / var6);
						}
					}

				var9.method999();
				return var9;
			}
		} else
			return this;
	}

	public void method996() {
		int var1;
		for (var1 = 0; var1 < anInt1865; ++var1)
			anIntArray1844[var1] = -anIntArray1844[var1];

		for (var1 = 0; var1 < anInt1843; ++var1) {
			final int var2 = anIntArray1846[var1];
			anIntArray1846[var1] = anIntArray1848[var1];
			anIntArray1848[var1] = var2;
		}

		method999();
	}

	public void method997(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt1865; ++var4) {
			anIntArray1850[var4] = (anIntArray1850[var4] * var1) / 128;
			anIntArray1866[var4] = (anIntArray1866[var4] * var2) / 128;
			anIntArray1844[var4] = (anIntArray1844[var4] * var3) / 128;
		}

		method999();
	}

	public void method998() {
		if (aClass23Array1873 == null) {
			aClass23Array1873 = new Class23[anInt1865];

			int var4;
			for (var4 = 0; var4 < anInt1865; ++var4)
				aClass23Array1873[var4] = new Class23();

			for (var4 = 0; var4 < anInt1843; ++var4) {
				final int var2 = anIntArray1846[var4];
				final int var11 = anIntArray1847[var4];
				final int var1 = anIntArray1848[var4];
				final int var5 = anIntArray1850[var11] - anIntArray1850[var2];
				final int var7 = anIntArray1866[var11] - anIntArray1866[var2];
				final int var13 = anIntArray1844[var11] - anIntArray1844[var2];
				final int var6 = anIntArray1850[var1] - anIntArray1850[var2];
				final int var3 = anIntArray1866[var1] - anIntArray1866[var2];
				final int var12 = anIntArray1844[var1] - anIntArray1844[var2];
				int var14 = (var7 * var12) - (var3 * var13);
				int var9 = (var13 * var6) - (var12 * var5);

				int var8;
				for (var8 = (var5 * var3) - (var6 * var7); (var14 > 8192) || (var9 > 8192) || (var8 > 8192)
						|| (var14 < -8192) || (var9 < -8192) || (var8 < -8192); var8 >>= 1) {
					var14 >>= 1;
					var9 >>= 1;
				}

				int var15 = (int) Math.sqrt((var14 * var14) + (var9 * var9) + (var8 * var8));
				if (var15 <= 0)
					var15 = 1;

				var14 = (var14 * 256) / var15;
				var9 = (var9 * 256) / var15;
				var8 = (var8 * 256) / var15;
				byte var16;
				if (aByteArray1849 == null)
					var16 = 0;
				else
					var16 = aByteArray1849[var4];

				if (var16 == 0) {
					Class23 var10 = aClass23Array1873[var2];
					var10.anInt208 += var14;
					var10.anInt207 += var9;
					var10.anInt211 += var8;
					++var10.anInt209;
					var10 = aClass23Array1873[var11];
					var10.anInt208 += var14;
					var10.anInt207 += var9;
					var10.anInt211 += var8;
					++var10.anInt209;
					var10 = aClass23Array1873[var1];
					var10.anInt208 += var14;
					var10.anInt207 += var9;
					var10.anInt211 += var8;
					++var10.anInt209;
				} else if (var16 == 1) {
					if (aClass45Array1872 == null)
						aClass45Array1872 = new Class45[anInt1843];

					final Class45 var17 = aClass45Array1872[var4] = new Class45();
					var17.anInt447 = var14;
					var17.anInt448 = var9;
					var17.anInt449 = var8;
				}
			}

		}
	}

	void method999() {
		aClass23Array1873 = null;
		aClass23Array1884 = null;
		aClass45Array1872 = null;
		aBool1877 = false;
	}

	void method1000() {
		if (!aBool1877) {
			anInt1643 = 0;
			anInt1878 = 0;
			anInt1879 = 999999;
			anInt1880 = -999999;
			anInt1881 = -99999;
			anInt1882 = 99999;

			for (int var3 = 0; var3 < anInt1865; ++var3) {
				final int var2 = anIntArray1850[var3];
				final int var1 = anIntArray1866[var3];
				final int var4 = anIntArray1844[var3];
				if (var2 < anInt1879)
					anInt1879 = var2;

				if (var2 > anInt1880)
					anInt1880 = var2;

				if (var4 < anInt1882)
					anInt1882 = var4;

				if (var4 > anInt1881)
					anInt1881 = var4;

				if (-var1 > anInt1643)
					anInt1643 = -var1;

				if (var1 > anInt1878)
					anInt1878 = var1;
			}

			aBool1877 = true;
		}
	}

	public final Class131_Sub20_Sub19_Sub7 method1001(final int var1, final int var2, final int var3, final int var4,
			final int var5) {
		method998();
		final int var8 = (int) Math.sqrt((var3 * var3) + (var4 * var4) + (var5 * var5));
		final int var9 = (var2 * var8) >> 8;
		final Class131_Sub20_Sub19_Sub7 var10 = new Class131_Sub20_Sub19_Sub7();
		var10.anIntArray1902 = new int[anInt1843];
		var10.anIntArray1910 = new int[anInt1843];
		var10.anIntArray1900 = new int[anInt1843];
		if ((anInt1867 > 0) && (aByteArray1852 != null)) {
			final int[] var6 = new int[anInt1867];

			int var7;
			for (var7 = 0; var7 < anInt1843; ++var7)
				if (aByteArray1852[var7] != -1)
					++var6[aByteArray1852[var7] & 255];

			var10.anInt1906 = 0;

			for (var7 = 0; var7 < anInt1867; ++var7)
				if ((var6[var7] > 0) && (aByteArray1871[var7] == 0))
					++var10.anInt1906;

			var10.anIntArray1907 = new int[var10.anInt1906];
			var10.anIntArray1908 = new int[var10.anInt1906];
			var10.anIntArray1909 = new int[var10.anInt1906];
			var7 = 0;

			int var12;
			for (var12 = 0; var12 < anInt1867; ++var12)
				if ((var6[var12] > 0) && (aByteArray1871[var12] == 0)) {
					var10.anIntArray1907[var7] = aShortArray1858[var12] & '\uffff';
					var10.anIntArray1908[var7] = aShortArray1859[var12] & '\uffff';
					var10.anIntArray1909[var7] = aShortArray1860[var12] & '\uffff';
					var6[var12] = var7++;
				} else
					var6[var12] = -1;

			var10.aByteArray1903 = new byte[anInt1843];

			for (var12 = 0; var12 < anInt1843; ++var12)
				if (aByteArray1852[var12] != -1)
					var10.aByteArray1903[var12] = (byte) var6[aByteArray1852[var12] & 255];
				else
					var10.aByteArray1903[var12] = -1;
		}

		for (int var11 = 0; var11 < anInt1843; ++var11) {
			byte var17;
			if (aByteArray1849 == null)
				var17 = 0;
			else
				var17 = aByteArray1849[var11];

			byte var18;
			if (aByteArray1851 == null)
				var18 = 0;
			else
				var18 = aByteArray1851[var11];

			short var16;
			if (aShortArray1854 == null)
				var16 = -1;
			else
				var16 = aShortArray1854[var11];

			if (var18 == -2)
				var17 = 3;

			if (var18 == -1)
				var17 = 2;

			Class23 var13;
			int var14;
			Class45 var19;
			if (var16 == -1) {
				if (var17 != 0) {
					if (var17 == 1) {
						var19 = aClass45Array1872[var11];
						var14 = var1 + (((var3 * var19.anInt447) + (var4 * var19.anInt448) + (var5 * var19.anInt449))
								/ (var9 + (var9 / 2)));
						var10.anIntArray1902[var11] = method1002(aShortArray1853[var11] & '\uffff', var14);
						var10.anIntArray1900[var11] = -1;
					} else if (var17 == 3) {
						var10.anIntArray1902[var11] = 128;
						var10.anIntArray1900[var11] = -1;
					} else
						var10.anIntArray1900[var11] = -2;
				} else {
					final int var15 = aShortArray1853[var11] & '\uffff';
					if ((aClass23Array1884 != null) && (aClass23Array1884[anIntArray1846[var11]] != null))
						var13 = aClass23Array1884[anIntArray1846[var11]];
					else
						var13 = aClass23Array1873[anIntArray1846[var11]];

					var14 = var1 + (((var3 * var13.anInt208) + (var4 * var13.anInt207) + (var5 * var13.anInt211))
							/ (var9 * var13.anInt209));
					var10.anIntArray1902[var11] = method1002(var15, var14);
					if ((aClass23Array1884 != null) && (aClass23Array1884[anIntArray1847[var11]] != null))
						var13 = aClass23Array1884[anIntArray1847[var11]];
					else
						var13 = aClass23Array1873[anIntArray1847[var11]];

					var14 = var1 + (((var3 * var13.anInt208) + (var4 * var13.anInt207) + (var5 * var13.anInt211))
							/ (var9 * var13.anInt209));
					var10.anIntArray1910[var11] = method1002(var15, var14);
					if ((aClass23Array1884 != null) && (aClass23Array1884[anIntArray1848[var11]] != null))
						var13 = aClass23Array1884[anIntArray1848[var11]];
					else
						var13 = aClass23Array1873[anIntArray1848[var11]];

					var14 = var1 + (((var3 * var13.anInt208) + (var4 * var13.anInt207) + (var5 * var13.anInt211))
							/ (var9 * var13.anInt209));
					var10.anIntArray1900[var11] = method1002(var15, var14);
				}
			} else if (var17 != 0) {
				if (var17 != 1)
					var10.anIntArray1900[var11] = -2;
				else {
					var19 = aClass45Array1872[var11];
					var14 = var1 + (((var3 * var19.anInt447) + (var4 * var19.anInt448) + (var5 * var19.anInt449))
							/ (var9 + (var9 / 2)));
					var10.anIntArray1902[var11] = method1003(var14);
					var10.anIntArray1900[var11] = -1;
				}
			} else {
				if ((aClass23Array1884 != null) && (aClass23Array1884[anIntArray1846[var11]] != null))
					var13 = aClass23Array1884[anIntArray1846[var11]];
				else
					var13 = aClass23Array1873[anIntArray1846[var11]];

				var14 = var1 + (((var3 * var13.anInt208) + (var4 * var13.anInt207) + (var5 * var13.anInt211))
						/ (var9 * var13.anInt209));
				var10.anIntArray1902[var11] = method1003(var14);
				if ((aClass23Array1884 != null) && (aClass23Array1884[anIntArray1847[var11]] != null))
					var13 = aClass23Array1884[anIntArray1847[var11]];
				else
					var13 = aClass23Array1873[anIntArray1847[var11]];

				var14 = var1 + (((var3 * var13.anInt208) + (var4 * var13.anInt207) + (var5 * var13.anInt211))
						/ (var9 * var13.anInt209));
				var10.anIntArray1910[var11] = method1003(var14);
				if ((aClass23Array1884 != null) && (aClass23Array1884[anIntArray1848[var11]] != null))
					var13 = aClass23Array1884[anIntArray1848[var11]];
				else
					var13 = aClass23Array1873[anIntArray1848[var11]];

				var14 = var1 + (((var3 * var13.anInt208) + (var4 * var13.anInt207) + (var5 * var13.anInt211))
						/ (var9 * var13.anInt209));
				var10.anIntArray1900[var11] = method1003(var14);
			}
		}

		method990();
		var10.anInt1918 = anInt1865;
		var10.anIntArray1948 = anIntArray1850;
		var10.anIntArray1893 = anIntArray1866;
		var10.anIntArray1898 = anIntArray1844;
		var10.anInt1895 = anInt1843;
		var10.anIntArray1929 = anIntArray1846;
		var10.anIntArray1896 = anIntArray1847;
		var10.anIntArray1897 = anIntArray1848;
		var10.aByteArray1901 = aByteArray1874;
		var10.aByteArray1904 = aByteArray1851;
		var10.aByte1905 = aByte1876;
		var10.anIntArrayArray1932 = anIntArrayArray1870;
		var10.anIntArrayArray1911 = anIntArrayArray1855;
		var10.aShortArray1946 = aShortArray1854;
		return var10;
	}

	static final int method1002(final int var0, int var1) {
		var1 = (var1 * (var0 & 127)) >> 7;
		if (var1 < 2)
			var1 = 2;
		else if (var1 > 126)
			var1 = 126;

		return (var0 & '\uff80') + var1;
	}

	static final int method1003(int var0) {
		if (var0 < 2)
			var0 = 2;
		else if (var0 > 126)
			var0 = 126;

		return var0;
	}

	public void method1004(final short var1, final short var2) {
		if (aShortArray1854 != null)
			for (int var3 = 0; var3 < anInt1843; ++var3)
				if (aShortArray1854[var3] == var1)
					aShortArray1854[var3] = var2;
	}

	public Class131_Sub20_Sub19_Sub6 method1005() {
		final Class131_Sub20_Sub19_Sub6 var1 = new Class131_Sub20_Sub19_Sub6();
		if (aByteArray1849 != null) {
			var1.aByteArray1849 = new byte[anInt1843];

			for (int var2 = 0; var2 < anInt1843; ++var2)
				var1.aByteArray1849[var2] = aByteArray1849[var2];
		}

		var1.anInt1865 = anInt1865;
		var1.anInt1843 = anInt1843;
		var1.anInt1867 = anInt1867;
		var1.anIntArray1850 = anIntArray1850;
		var1.anIntArray1866 = anIntArray1866;
		var1.anIntArray1844 = anIntArray1844;
		var1.anIntArray1846 = anIntArray1846;
		var1.anIntArray1847 = anIntArray1847;
		var1.anIntArray1848 = anIntArray1848;
		var1.aByteArray1874 = aByteArray1874;
		var1.aByteArray1851 = aByteArray1851;
		var1.aByteArray1852 = aByteArray1852;
		var1.aShortArray1853 = aShortArray1853;
		var1.aShortArray1854 = aShortArray1854;
		var1.aByte1876 = aByte1876;
		var1.aByteArray1871 = aByteArray1871;
		var1.aShortArray1858 = aShortArray1858;
		var1.aShortArray1859 = aShortArray1859;
		var1.aShortArray1860 = aShortArray1860;
		var1.aShortArray1861 = aShortArray1861;
		var1.aShortArray1845 = aShortArray1845;
		var1.aShortArray1863 = aShortArray1863;
		var1.aShortArray1864 = aShortArray1864;
		var1.aByteArray1857 = aByteArray1857;
		var1.aShortArray1842 = aShortArray1842;
		var1.aShortArray1856 = aShortArray1856;
		var1.anIntArray1868 = anIntArray1868;
		var1.anIntArray1869 = anIntArray1869;
		var1.anIntArrayArray1870 = anIntArrayArray1870;
		var1.anIntArrayArray1855 = anIntArrayArray1855;
		var1.aClass23Array1873 = aClass23Array1873;
		var1.aClass45Array1872 = aClass45Array1872;
		var1.aShort1862 = aShort1862;
		var1.aShort1841 = aShort1841;
		return var1;
	}

	public void method1006() {
		for (int var1 = 0; var1 < anInt1865; ++var1) {
			anIntArray1850[var1] = -anIntArray1850[var1];
			anIntArray1844[var1] = -anIntArray1844[var1];
		}

		method999();
	}

	void method1007(final byte[] var1) {
		boolean var2 = false;
		boolean var43 = false;
		final DataBuffer var4 = new DataBuffer(var1);
		final DataBuffer var5 = new DataBuffer(var1);
		final DataBuffer var6 = new DataBuffer(var1);
		final DataBuffer var7 = new DataBuffer(var1);
		final DataBuffer var36 = new DataBuffer(var1);
		var4.pos = var1.length - 18;
		final int var10 = var4.readUShort();
		final int var9 = var4.readUShort();
		final int var19 = var4.method595();
		final int var12 = var4.method595();
		final int var13 = var4.method595();
		final int var29 = var4.method595();
		final int var15 = var4.method595();
		final int var35 = var4.method595();
		final int var17 = var4.readUShort();
		final int var18 = var4.readUShort();
		final int var34 = var4.readUShort();
		final int var20 = var4.readUShort();
		final byte var8 = 0;
		int var45 = var8 + var10;
		final int var21 = var45;
		var45 += var9;
		final int var23 = var45;
		if (var13 == 255)
			var45 += var9;

		final int var24 = var45;
		if (var15 == 1)
			var45 += var9;

		final int var22 = var45;
		if (var12 == 1)
			var45 += var9;

		final int var26 = var45;
		if (var35 == 1)
			var45 += var10;

		final int var28 = var45;
		if (var29 == 1)
			var45 += var9;

		final int var30 = var45;
		var45 += var20;
		final int var11 = var45;
		var45 += var9 * 2;
		final int var44 = var45;
		var45 += var19 * 6;
		final int var37 = var45;
		var45 += var17;
		final int var40 = var45;
		var45 += var18;
		anInt1865 = var10;
		anInt1843 = var9;
		anInt1867 = var19;
		anIntArray1850 = new int[var10];
		anIntArray1866 = new int[var10];
		anIntArray1844 = new int[var10];
		anIntArray1846 = new int[var9];
		anIntArray1847 = new int[var9];
		anIntArray1848 = new int[var9];
		if (var19 > 0) {
			aByteArray1871 = new byte[var19];
			aShortArray1858 = new short[var19];
			aShortArray1859 = new short[var19];
			aShortArray1860 = new short[var19];
		}

		if (var35 == 1)
			anIntArray1868 = new int[var10];

		if (var12 == 1) {
			aByteArray1849 = new byte[var9];
			aByteArray1852 = new byte[var9];
			aShortArray1854 = new short[var9];
		}

		if (var13 == 255)
			aByteArray1874 = new byte[var9];
		else
			aByte1876 = (byte) var13;

		if (var29 == 1)
			aByteArray1851 = new byte[var9];

		if (var15 == 1)
			anIntArray1869 = new int[var9];

		aShortArray1853 = new short[var9];
		var4.pos = var8;
		var5.pos = var37;
		var6.pos = var40;
		var7.pos = var45;
		var36.pos = var26;
		int var41 = 0;
		int var27 = 0;
		int var42 = 0;

		int var3;
		int var14;
		int var16;
		int var25;
		int var39;
		for (var3 = 0; var3 < var10; ++var3) {
			var39 = var4.method595();
			var14 = 0;
			if ((var39 & 1) != 0)
				var14 = var5.method605();

			var25 = 0;
			if ((var39 & 2) != 0)
				var25 = var6.method605();

			var16 = 0;
			if ((var39 & 4) != 0)
				var16 = var7.method605();

			anIntArray1850[var3] = var41 + var14;
			anIntArray1866[var3] = var27 + var25;
			anIntArray1844[var3] = var42 + var16;
			var41 = anIntArray1850[var3];
			var27 = anIntArray1866[var3];
			var42 = anIntArray1844[var3];
			if (var35 == 1)
				anIntArray1868[var3] = var36.method595();
		}

		var4.pos = var11;
		var5.pos = var22;
		var6.pos = var23;
		var7.pos = var28;
		var36.pos = var24;

		for (var3 = 0; var3 < var9; ++var3) {
			aShortArray1853[var3] = (short) var4.readUShort();
			if (var12 == 1) {
				var39 = var5.method595();
				if ((var39 & 1) == 1) {
					aByteArray1849[var3] = 1;
					var2 = true;
				} else
					aByteArray1849[var3] = 0;

				if ((var39 & 2) == 2) {
					aByteArray1852[var3] = (byte) (var39 >> 2);
					aShortArray1854[var3] = aShortArray1853[var3];
					aShortArray1853[var3] = 127;
					if (aShortArray1854[var3] != -1)
						var43 = true;
				} else {
					aByteArray1852[var3] = -1;
					aShortArray1854[var3] = -1;
				}
			}

			if (var13 == 255)
				aByteArray1874[var3] = var6.method584();

			if (var29 == 1)
				aByteArray1851[var3] = var7.method584();

			if (var15 == 1)
				anIntArray1869[var3] = var36.method595();
		}

		var4.pos = var30;
		var5.pos = var21;
		var3 = 0;
		var39 = 0;
		var14 = 0;
		var25 = 0;

		int var31;
		int var32;
		for (var16 = 0; var16 < var9; ++var16) {
			var31 = var5.method595();
			if (var31 == 1) {
				var3 = var4.method605() + var25;
				var39 = var4.method605() + var3;
				var14 = var4.method605() + var39;
				var25 = var14;
				anIntArray1846[var16] = var3;
				anIntArray1847[var16] = var39;
				anIntArray1848[var16] = var14;
			}

			if (var31 == 2) {
				var39 = var14;
				var14 = var4.method605() + var25;
				var25 = var14;
				anIntArray1846[var16] = var3;
				anIntArray1847[var16] = var39;
				anIntArray1848[var16] = var14;
			}

			if (var31 == 3) {
				var3 = var14;
				var14 = var4.method605() + var25;
				var25 = var14;
				anIntArray1846[var16] = var3;
				anIntArray1847[var16] = var39;
				anIntArray1848[var16] = var14;
			}

			if (var31 == 4) {
				var32 = var3;
				var3 = var39;
				var39 = var32;
				var14 = var4.method605() + var25;
				var25 = var14;
				anIntArray1846[var16] = var3;
				anIntArray1847[var16] = var32;
				anIntArray1848[var16] = var14;
			}
		}

		var4.pos = var44;

		for (var16 = 0; var16 < var19; ++var16) {
			aByteArray1871[var16] = 0;
			aShortArray1858[var16] = (short) var4.readUShort();
			aShortArray1859[var16] = (short) var4.readUShort();
			aShortArray1860[var16] = (short) var4.readUShort();
		}

		if (aByteArray1852 != null) {
			boolean var46 = false;

			for (var31 = 0; var31 < var9; ++var31) {
				var32 = aByteArray1852[var31] & 255;
				if (var32 != 255)
					if (((aShortArray1858[var32] & '\uffff') == anIntArray1846[var31])
							&& ((aShortArray1859[var32] & '\uffff') == anIntArray1847[var31])
							&& ((aShortArray1860[var32] & '\uffff') == anIntArray1848[var31]))
						aByteArray1852[var31] = -1;
					else
						var46 = true;
			}

			if (!var46)
				aByteArray1852 = null;
		}

		if (!var43)
			aShortArray1854 = null;

		if (!var2)
			aByteArray1849 = null;

	}

	public void method1008(final int var1) {
		final int var2 = anIntArray1875[var1];
		final int var4 = anIntArray1887[var1];

		for (int var3 = 0; var3 < anInt1865; ++var3) {
			final int var5 = ((anIntArray1844[var3] * var2) + (anIntArray1850[var3] * var4)) >> 16;
			anIntArray1844[var3] = ((anIntArray1844[var3] * var4) - (anIntArray1850[var3] * var2)) >> 16;
			anIntArray1850[var3] = var5;
		}

		method999();
	}

	public Class131_Sub20_Sub19_Sub6(final Class131_Sub20_Sub19_Sub6[] var1, final int var2) {
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var11 = false;
		boolean var6 = false;
		boolean var7 = false;
		anInt1865 = 0;
		anInt1843 = 0;
		anInt1867 = 0;
		aByte1876 = -1;

		int var8;
		Class131_Sub20_Sub19_Sub6 var9;
		for (var8 = 0; var8 < var2; ++var8) {
			var9 = var1[var8];
			if (var9 != null) {
				anInt1865 += var9.anInt1865;
				anInt1843 += var9.anInt1843;
				anInt1867 += var9.anInt1867;
				if (var9.aByteArray1874 != null)
					var4 = true;
				else {
					if (aByte1876 == -1)
						aByte1876 = var9.aByte1876;

					if (aByte1876 != var9.aByte1876)
						var4 = true;
				}

				var3 |= var9.aByteArray1849 != null;
				var5 |= var9.aByteArray1851 != null;
				var11 |= var9.anIntArray1869 != null;
				var6 |= var9.aShortArray1854 != null;
				var7 |= var9.aByteArray1852 != null;
			}
		}

		anIntArray1850 = new int[anInt1865];
		anIntArray1866 = new int[anInt1865];
		anIntArray1844 = new int[anInt1865];
		anIntArray1868 = new int[anInt1865];
		anIntArray1846 = new int[anInt1843];
		anIntArray1847 = new int[anInt1843];
		anIntArray1848 = new int[anInt1843];
		if (var3)
			aByteArray1849 = new byte[anInt1843];

		if (var4)
			aByteArray1874 = new byte[anInt1843];

		if (var5)
			aByteArray1851 = new byte[anInt1843];

		if (var11)
			anIntArray1869 = new int[anInt1843];

		if (var6)
			aShortArray1854 = new short[anInt1843];

		if (var7)
			aByteArray1852 = new byte[anInt1843];

		aShortArray1853 = new short[anInt1843];
		if (anInt1867 > 0) {
			aByteArray1871 = new byte[anInt1867];
			aShortArray1858 = new short[anInt1867];
			aShortArray1859 = new short[anInt1867];
			aShortArray1860 = new short[anInt1867];
			aShortArray1861 = new short[anInt1867];
			aShortArray1845 = new short[anInt1867];
			aShortArray1863 = new short[anInt1867];
			aShortArray1864 = new short[anInt1867];
			aByteArray1857 = new byte[anInt1867];
			aShortArray1842 = new short[anInt1867];
			aShortArray1856 = new short[anInt1867];
		}

		anInt1865 = 0;
		anInt1843 = 0;
		anInt1867 = 0;

		for (var8 = 0; var8 < var2; ++var8) {
			var9 = var1[var8];
			if (var9 != null) {
				int var10;
				for (var10 = 0; var10 < var9.anInt1843; ++var10) {
					if (var3 && (var9.aByteArray1849 != null))
						aByteArray1849[anInt1843] = var9.aByteArray1849[var10];

					if (var4)
						if (var9.aByteArray1874 != null)
							aByteArray1874[anInt1843] = var9.aByteArray1874[var10];
						else
							aByteArray1874[anInt1843] = var9.aByte1876;

					if (var5 && (var9.aByteArray1851 != null))
						aByteArray1851[anInt1843] = var9.aByteArray1851[var10];

					if (var11 && (var9.anIntArray1869 != null))
						anIntArray1869[anInt1843] = var9.anIntArray1869[var10];

					if (var6)
						if (var9.aShortArray1854 != null)
							aShortArray1854[anInt1843] = var9.aShortArray1854[var10];
						else
							aShortArray1854[anInt1843] = -1;

					if (var7)
						if ((var9.aByteArray1852 != null) && (var9.aByteArray1852[var10] != -1))
							aByteArray1852[anInt1843] = (byte) (var9.aByteArray1852[var10] + anInt1867);
						else
							aByteArray1852[anInt1843] = -1;

					aShortArray1853[anInt1843] = var9.aShortArray1853[var10];
					anIntArray1846[anInt1843] = method989(var9, var9.anIntArray1846[var10]);
					anIntArray1847[anInt1843] = method989(var9, var9.anIntArray1847[var10]);
					anIntArray1848[anInt1843] = method989(var9, var9.anIntArray1848[var10]);
					++anInt1843;
				}

				for (var10 = 0; var10 < var9.anInt1867; ++var10) {
					final byte var12 = aByteArray1871[anInt1867] = var9.aByteArray1871[var10];
					if (var12 == 0) {
						aShortArray1858[anInt1867] = (short) method989(var9, var9.aShortArray1858[var10]);
						aShortArray1859[anInt1867] = (short) method989(var9, var9.aShortArray1859[var10]);
						aShortArray1860[anInt1867] = (short) method989(var9, var9.aShortArray1860[var10]);
					}

					if ((var12 >= 1) && (var12 <= 3)) {
						aShortArray1858[anInt1867] = var9.aShortArray1858[var10];
						aShortArray1859[anInt1867] = var9.aShortArray1859[var10];
						aShortArray1860[anInt1867] = var9.aShortArray1860[var10];
						aShortArray1861[anInt1867] = var9.aShortArray1861[var10];
						aShortArray1845[anInt1867] = var9.aShortArray1845[var10];
						aShortArray1863[anInt1867] = var9.aShortArray1863[var10];
						aShortArray1864[anInt1867] = var9.aShortArray1864[var10];
						aByteArray1857[anInt1867] = var9.aByteArray1857[var10];
						aShortArray1842[anInt1867] = var9.aShortArray1842[var10];
					}

					if (var12 == 2)
						aShortArray1856[anInt1867] = var9.aShortArray1856[var10];

					++anInt1867;
				}
			}
		}

	}

	public void method1009(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt1865; ++var4) {
			anIntArray1850[var4] += var1;
			anIntArray1866[var4] += var2;
			anIntArray1844[var4] += var3;
		}

		method999();
	}

	public void method1010(final short var1, final short var2) {
		for (int var3 = 0; var3 < anInt1843; ++var3)
			if (aShortArray1853[var3] == var1)
				aShortArray1853[var3] = var2;

	}
}
