public class Class91 {
	public static short[] aShortArray736;
	public static short[][] aShortArrayArray737;
	long aLong738;
	int[] anIntArray730;
	int[] anIntArray731;
	public boolean aBool734;
	public int anInt733;
	long aLong732;
	static int[] anIntArray735 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
	static Class121 aClass121_739 = new Class121(260);

	void method379() {
		final long var1 = aLong738;
		final int var4 = anIntArray730[5];
		final int var5 = anIntArray730[9];
		anIntArray730[5] = var5;
		anIntArray730[9] = var4;
		aLong738 = 0L;

		int var3;
		for (var3 = 0; var3 < 12; ++var3) {
			aLong738 <<= 4;
			if (anIntArray730[var3] >= 256)
				aLong738 += anIntArray730[var3] - 256;
		}

		if (anIntArray730[0] >= 256)
			aLong738 += (anIntArray730[0] - 256) >> 4;

		if (anIntArray730[1] >= 256)
			aLong738 += (anIntArray730[1] - 256) >> 8;

		for (var3 = 0; var3 < 5; ++var3) {
			aLong738 <<= 3;
			aLong738 += anIntArray731[var3];
		}

		aLong738 <<= 1;
		aLong738 += aBool734 ? 1 : 0;
		anIntArray730[5] = var4;
		anIntArray730[9] = var5;
		if ((0L != var1) && (aLong738 != var1))
			aClass121_739.method480(var1);

	}

	public void method380(int[] var1, final int[] var2, final boolean var3, final int var4) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var5 = 0; var5 < 7; ++var5)
				for (int var7 = 0; var7 < Class138.anInt914; ++var7) {
					final Class131_Sub20_Sub13 var6 = Class131_Sub20_Sub19_Sub3.method928(var7);
					if ((var6 != null) && !var6.aBool1576 && (var6.anInt1569 == (var5 + (var3 ? 7 : 0)))) {
						var1[anIntArray735[var5]] = 256 + var7;
						break;
					}
				}
		}

		anIntArray730 = var1;
		anIntArray731 = var2;
		aBool734 = var3;
		anInt733 = var4;
		method379();
	}

	public void method381(final int var1, final boolean var2) {
		int var3 = anIntArray731[var1];
		if (!var2)
			do {
				--var3;
				if (var3 < 0)
					var3 = Class131_Sub17.aShortArrayArray1146[var1].length - 1;
			} while (!Class22.method106(var1, var3));
		else
			do {
				++var3;
				if (var3 >= Class131_Sub17.aShortArrayArray1146[var1].length)
					var3 = 0;
			} while (!Class22.method106(var1, var3));

		anIntArray731[var1] = var3;
		method379();
	}

	public void method382(final boolean var1) {
		if (var1 != aBool734)
			method380((int[]) null, anIntArray731, var1, -1);
	}

	public void method383(final DataBuffer var1) {
		var1.writeByte(aBool734 ? 1 : 0);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			final int var3 = anIntArray730[anIntArray735[var2]];
			if (var3 == 0)
				var1.writeByte(-1);
			else
				var1.writeByte(var3 - 256);
		}

		for (var2 = 0; var2 < 5; ++var2)
			var1.writeByte(anIntArray731[var2]);

	}

	public Class131_Sub20_Sub19_Sub7 method384(final Class131_Sub20_Sub1 var1, final int var2,
			final Class131_Sub20_Sub1 var3, final int var4) {
		if (anInt733 != -1)
			return Class131_Sub20_Sub20.method879(anInt733).method729(var1, var2, var3, var4);
		else {
			long var6 = aLong738;
			int[] var9 = anIntArray730;
			if ((null != var1) && ((var1.anInt1364 >= 0) || (var1.anInt1360 >= 0))) {
				var9 = new int[12];

				for (int var12 = 0; var12 < 12; ++var12)
					var9[var12] = anIntArray730[var12];

				if (var1.anInt1364 >= 0) {
					var6 += (var1.anInt1364 - anIntArray730[5]) << 8;
					var9[5] = var1.anInt1364;
				}

				if (var1.anInt1360 >= 0) {
					var6 += (var1.anInt1360 - anIntArray730[3]) << 16;
					var9[3] = var1.anInt1360;
				}
			}

			Class131_Sub20_Sub19_Sub7 var11 = (Class131_Sub20_Sub19_Sub7) aClass121_739.method482(var6);
			if (null == var11) {
				boolean var15 = false;

				int var16;
				for (int var13 = 0; var13 < 12; ++var13) {
					var16 = var9[var13];
					if ((var16 >= 256) && (var16 < 512)
							&& !Class131_Sub20_Sub19_Sub3.method928(var16 - 256).method781())
						var15 = true;

					if ((var16 >= 512) && !Class79_Sub1.method645(var16 - 512, (short) 27442).method696(aBool734))
						var15 = true;
				}

				if (var15) {
					if (aLong732 != -1L)
						var11 = (Class131_Sub20_Sub19_Sub7) aClass121_739.method482(aLong732);

					if (var11 == null)
						return null;
				}

				if (null == var11) {
					final Class131_Sub20_Sub19_Sub6[] var17 = new Class131_Sub20_Sub19_Sub6[12];
					var16 = 0;

					int var5;
					for (int var8 = 0; var8 < 12; ++var8) {
						var5 = var9[var8];
						Class131_Sub20_Sub19_Sub6 var10;
						if ((var5 >= 256) && (var5 < 512)) {
							var10 = Class131_Sub20_Sub19_Sub3.method928(var5 - 256).method778();
							if (var10 != null)
								var17[var16++] = var10;
						}

						if (var5 >= 512) {
							var10 = Class79_Sub1.method645(var5 - 512, (short) 9475).method701(aBool734);
							if (var10 != null)
								var17[var16++] = var10;
						}
					}

					final Class131_Sub20_Sub19_Sub6 var18 = new Class131_Sub20_Sub19_Sub6(var17, var16);

					for (var5 = 0; var5 < 5; ++var5) {
						if (anIntArray731[var5] < Class131_Sub17.aShortArrayArray1146[var5].length)
							var18.method1010(aShortArray736[var5],
									Class131_Sub17.aShortArrayArray1146[var5][anIntArray731[var5]]);

						if (anIntArray731[var5] < aShortArrayArray737[var5].length)
							var18.method1010(Class35.aShortArray360[var5],
									aShortArrayArray737[var5][anIntArray731[var5]]);
					}

					var11 = var18.method1001(64, 850, -30, -50, -30);
					aClass121_739.method479(var11, var6);
					aLong732 = var6;
				}
			}

			if ((var1 == null) && (null == var3))
				return var11;
			else {
				Class131_Sub20_Sub19_Sub7 var14;
				if ((var1 != null) && (null != var3))
					var14 = var1.method683(var11, var2, var3, var4);
				else if (null != var1)
					var14 = var1.method686(var11, var2);
				else
					var14 = var3.method686(var11, var4);

				return var14;
			}
		}
	}

	public int method385() {
		return anInt733 != -1 ? 305419896 + Class131_Sub20_Sub20.method879(anInt733).anInt1457
				: (anIntArray730[8] << 10) + (anIntArray730[0] << 15) + (anIntArray731[4] << 20)
						+ (anIntArray731[0] << 25) + (anIntArray730[11] << 5) + anIntArray730[1];
	}

	public void method386(final int var1, final boolean var2) {
		if ((var1 != 1) || !aBool734) {
			int var4 = anIntArray730[anIntArray735[var1]];
			if (var4 != 0) {
				var4 -= 256;

				Class131_Sub20_Sub13 var3;
				do {
					if (!var2) {
						--var4;
						if (var4 < 0)
							var4 = Class138.anInt914 - 1;
					} else {
						++var4;
						if (var4 >= Class138.anInt914)
							var4 = 0;
					}

					var3 = Class131_Sub20_Sub19_Sub3.method928(var4);
				} while ((var3 == null) || var3.aBool1576 || (((aBool734 ? 7 : 0) + var1) != var3.anInt1569));

				anIntArray730[anIntArray735[var1]] = var4 + 256;
				method379();
			}
		}
	}

	Class131_Sub20_Sub19_Sub6 method387() {
		if (anInt733 != -1)
			return Class131_Sub20_Sub20.method879(anInt733).method730();
		else {
			boolean var5 = false;

			int var2;
			for (int var3 = 0; var3 < 12; ++var3) {
				var2 = anIntArray730[var3];
				if ((var2 >= 256) && (var2 < 512) && !Class131_Sub20_Sub19_Sub3.method928(var2 - 256).method780())
					var5 = true;

				if ((var2 >= 512) && !Class79_Sub1.method645(var2 - 512, (short) 14442).method699(aBool734))
					var5 = true;
			}

			if (var5)
				return null;
			else {
				final Class131_Sub20_Sub19_Sub6[] var7 = new Class131_Sub20_Sub19_Sub6[12];
				var2 = 0;

				int var1;
				for (int var8 = 0; var8 < 12; ++var8) {
					var1 = anIntArray730[var8];
					Class131_Sub20_Sub19_Sub6 var6;
					if ((var1 >= 256) && (var1 < 512)) {
						var6 = Class131_Sub20_Sub19_Sub3.method928(var1 - 256).method779();
						if (var6 != null)
							var7[var2++] = var6;
					}

					if (var1 >= 512) {
						var6 = Class79_Sub1.method645(var1 - 512, (short) 32492).method698(aBool734);
						if (var6 != null)
							var7[var2++] = var6;
					}
				}

				final Class131_Sub20_Sub19_Sub6 var4 = new Class131_Sub20_Sub19_Sub6(var7, var2);

				for (var1 = 0; var1 < 5; ++var1) {
					if (anIntArray731[var1] < Class131_Sub17.aShortArrayArray1146[var1].length)
						var4.method1010(aShortArray736[var1],
								Class131_Sub17.aShortArrayArray1146[var1][anIntArray731[var1]]);

					if (anIntArray731[var1] < aShortArrayArray737[var1].length)
						var4.method1010(Class35.aShortArray360[var1], aShortArrayArray737[var1][anIntArray731[var1]]);
				}

				return var4;
			}
		}
	}

	public static Class131_Sub20_Sub10 method388(final int var0) {
		Class131_Sub20_Sub10 var1 = (Class131_Sub20_Sub10) Class131_Sub20_Sub10.aClass121_1551.method482(var0);
		if (null != var1)
			return var1;
		else {
			final byte[] var2 = Class131_Sub20_Sub10.aClass100_1554.method402(15, var0);
			var1 = new Class131_Sub20_Sub10();
			if (null != var2)
				var1.method764(new DataBuffer(var2));

			Class131_Sub20_Sub10.aClass121_1551.method479(var1, var0);
			return var1;
		}
	}
}
