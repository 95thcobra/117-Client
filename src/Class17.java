import java.awt.Component;

public class Class17 {
	static int anInt156;
	public static int anInt162;
	int anInt163;
	static boolean aBool166;
	boolean aBool169 = true;
	Class131_Sub4 aClass131_Sub4_159;
	long aLong164 = 0L;
	int anInt170 = 0;
	long aLong157 = Class84.method366(780546663);
	int anInt165 = 0;
	int anInt168;
	int anInt154;
	int anInt167 = 0;
	long aLong161 = 0L;
	int anInt171 = 0;
	int[] anIntArray158;
	int anInt160 = 32;
	Class131_Sub4[] aClass131_Sub4Array155 = new Class131_Sub4[8];
	Class131_Sub4[] aClass131_Sub4Array172 = new Class131_Sub4[8];

	public final void method66() {
		aBool169 = true;
	}

	public final synchronized void method67(final Class131_Sub4 var1) {
		aClass131_Sub4_159 = var1;
	}

	public final synchronized void method68() {
		aBool169 = true;

		try {
			method78();
		} catch (final Exception var2) {
			method79();
			aLong164 = Class84.method366(780546663) + 2000L;
		}

	}

	final void method69(final int[] var1, final int var2) {
		int var3 = var2;
		if (aBool166)
			var3 = var2 << 1;

		Class55.method275(var1, 0, var3);
		anInt170 -= var2;
		if ((aClass131_Sub4_159 != null) && (anInt170 <= 0)) {
			anInt170 += anInt162 >> 4;
			Class131_Sub20_Sub9.method761(aClass131_Sub4_159);
			method70(aClass131_Sub4_159, aClass131_Sub4_159.method537());
			int var6 = 0;
			int var7 = 255;

			int var8;
			Class131_Sub4 var13;
			label143: for (var8 = 7; var7 != 0; --var8) {
				int var9;
				int var10;
				if (var8 < 0) {
					var10 = var8 & 3;
					var9 = -(var8 >> 2);
				} else {
					var10 = var8;
					var9 = 0;
				}

				for (int var12 = (var7 >>> var10) & 286331153; var12 != 0; var12 >>>= 4) {
					if ((var12 & 1) != 0) {
						var7 &= ~(1 << var10);
						var13 = null;
						Class131_Sub4 var4 = aClass131_Sub4Array155[var10];

						label137: while (true)
							while (true) {
								if (var4 == null)
									break label137;

								final Class131_Sub2 var5 = var4.aClass131_Sub2_995;
								if ((null != var5) && (var5.anInt991 > var9)) {
									var7 |= 1 << var10;
									var13 = var4;
									var4 = var4.aClass131_Sub4_994;
								} else {
									var4.aBool996 = true;
									final int var14 = var4.method538();
									var6 += var14;
									if (null != var5)
										var5.anInt991 += var14;

									if (var6 >= anInt160)
										break label143;

									Class131_Sub4 var11 = var4.method539();
									if (var11 != null)
										for (final int var16 = var4.anInt993; null != var11; var11 = var4.method543())
											method70(var11, (var16 * var11.method537()) >> 8);

									final Class131_Sub4 var17 = var4.aClass131_Sub4_994;
									var4.aClass131_Sub4_994 = null;
									if (null == var13)
										aClass131_Sub4Array155[var10] = var17;
									else
										var13.aClass131_Sub4_994 = var17;

									if (var17 == null)
										aClass131_Sub4Array172[var10] = var13;

									var4 = var17;
								}
							}
					}

					var10 += 4;
					++var9;
				}
			}

			for (var8 = 0; var8 < 8; ++var8) {
				Class131_Sub4 var15 = aClass131_Sub4Array155[var8];
				final Class131_Sub4[] var18 = aClass131_Sub4Array155;
				aClass131_Sub4Array172[var8] = null;

				for (var18[var8] = null; var15 != null; var15 = var13) {
					var13 = var15.aClass131_Sub4_994;
					var15.aClass131_Sub4_994 = null;
				}
			}
		}

		if (anInt170 < 0)
			anInt170 = 0;

		if (null != aClass131_Sub4_159)
			aClass131_Sub4_159.method541(var1, 0, var2);

		aLong157 = Class84.method366(780546663);
	}

	final void method70(final Class131_Sub4 var1, final int var2) {
		final int var3 = var2 >> 5;
		final Class131_Sub4 var4 = aClass131_Sub4Array172[var3];
		if (var4 == null)
			aClass131_Sub4Array155[var3] = var1;
		else
			var4.aClass131_Sub4_994 = var1;

		aClass131_Sub4Array172[var3] = var1;
		var1.anInt993 = var2;
	}

	void method71(final Component var1) throws Exception {
	}

	void method72(final int var1) throws Exception {
	}

	void method73() throws Exception {
	}

	final void method74(final int var1) {
		anInt170 -= var1;
		if (anInt170 < 0)
			anInt170 = 0;

		if (aClass131_Sub4_159 != null)
			aClass131_Sub4_159.method542(var1);

	}

	public final synchronized void method75() {
		if (anIntArray158 != null) {
			long var1 = Class84.method366(780546663);

			try {
				if (0L != aLong164) {
					if (var1 < aLong164)
						return;

					method72(anInt168);
					aLong164 = 0L;
					aBool169 = true;
				}

				int var3 = method80();
				if ((anInt167 - var3) > anInt165)
					anInt165 = anInt167 - var3;

				int var4 = anInt163 + anInt154;
				if ((256 + var4) > 16384)
					var4 = 16128;

				if ((256 + var4) > anInt168) {
					anInt168 += 1024;
					if (anInt168 > 16384)
						anInt168 = 16384;

					method79();
					method72(anInt168);
					var3 = 0;
					aBool169 = true;
					if ((256 + var4) > anInt168) {
						var4 = anInt168 - 256;
						anInt154 = var4 - anInt163;
					}
				}

				while (var3 < var4) {
					method69(anIntArray158, 256);
					method73();
					var3 += 256;
				}

				if (var1 > aLong161) {
					if (!aBool169) {
						if ((anInt165 == 0) && (anInt171 == 0)) {
							method79();
							aLong164 = var1 + 2000L;
							return;
						}

						anInt154 = Math.min(anInt171, anInt165);
						anInt171 = anInt165;
					} else
						aBool169 = false;

					anInt165 = 0;
					aLong161 = var1 + 2000L;
				}

				anInt167 = var3;
			} catch (final Exception var7) {
				method79();
				aLong164 = 2000L + var1;
			}

			try {
				if (var1 > (aLong157 + 500000L))
					var1 = aLong157;

				while (var1 > (aLong157 + 5000L)) {
					method74(256);
					aLong157 += 256000 / anInt162;
				}
			} catch (final Exception var6) {
				aLong157 = var1;
			}

		}
	}

	public final synchronized void method76() {
		if (null != Class126_Sub1.aClass12_952) {
			boolean var2 = true;

			for (int var1 = 0; var1 < 2; ++var1) {
				if (this == Class126_Sub1.aClass12_952.aClass17Array108[var1])
					Class126_Sub1.aClass12_952.aClass17Array108[var1] = null;

				if (null != Class126_Sub1.aClass12_952.aClass17Array108[var1])
					var2 = false;
			}

			if (var2) {
				Class126_Sub1.aClass12_952.aBool109 = true;

				while (Class126_Sub1.aClass12_952.aBool111)
					Class47.method237(50L);

				Class126_Sub1.aClass12_952 = null;
			}
		}

		method79();
		anIntArray158 = null;
	}

	static final int method77(final int var0, int var1) {
		if (var0 == -1)
			return 12345678;
		else {
			var1 = ((var0 & 127) * var1) / 128;
			if (var1 < 2)
				var1 = 2;
			else if (var1 > 126)
				var1 = 126;

			return var1 + (var0 & '\uff80');
		}
	}

	void method78() throws Exception {
	}

	void method79() {
	}

	int method80() throws Exception {
		return anInt168;
	}

	static Class131_Sub20_Sub8 method81(final int var0, final int var1) {
		final Class6 var2 = (Class6) Class32.aMap298.get(Integer.valueOf(var0));
		return var2.method30(var1);
	}

	static final void method82() {
		boolean var0 = false;

		int var4;
		int var8;
		while (!var0) {
			var0 = true;

			for (var4 = 0; var4 < (client.anInt2166 - 1); ++var4)
				if ((client.anIntArray2066[var4] < 1000) && (client.anIntArray2066[var4 + 1] > 1000)) {
					final String var5 = client.aStringArray2172[var4];
					client.aStringArray2172[var4] = client.aStringArray2172[var4 + 1];
					client.aStringArray2172[1 + var4] = var5;
					final String var6 = client.aStringArray2195[var4];
					client.aStringArray2195[var4] = client.aStringArray2195[1 + var4];
					client.aStringArray2195[1 + var4] = var6;
					var8 = client.anIntArray2066[var4];
					client.anIntArray2066[var4] = client.anIntArray2066[1 + var4];
					client.anIntArray2066[1 + var4] = var8;
					var8 = client.anIntArray2171[var4];
					client.anIntArray2171[var4] = client.anIntArray2171[var4 + 1];
					client.anIntArray2171[1 + var4] = var8;
					var8 = client.anIntArray2168[var4];
					client.anIntArray2168[var4] = client.anIntArray2168[1 + var4];
					client.anIntArray2168[1 + var4] = var8;
					var8 = client.anIntArray2170[var4];
					client.anIntArray2170[var4] = client.anIntArray2170[var4 + 1];
					client.anIntArray2170[1 + var4] = var8;
					var0 = false;
				}
		}

		if (Class100.aClass131_Sub18_786 == null)
			if (client.aClass131_Sub18_2165 == null) {
				int var12 = Class81.anInt678;
				int var2;
				int var7;
				int var9;
				int var13;
				if (client.aBool2047) {
					if ((var12 != 1) && (RuntimeException_Sub1.aBool1954 || (var12 != 4))) {
						var4 = Class81.anInt668;
						var9 = Class81.anInt673;
						if ((var4 < (Class131_Sub20_Sub19_Sub2.anInt1760 - 10))
								|| (var4 > (10 + Class131_Sub20_Sub19_Sub2.anInt1760 + Class131_Sub20_Sub6.anInt1488))
								|| (var9 < (Class48.anInt476 - 10))
								|| (var9 > (Class48.anInt476 + Class5.anInt60 + 10))) {
							client.aBool2047 = false;
							Class1.method12(Class131_Sub20_Sub19_Sub2.anInt1760, Class48.anInt476,
									Class131_Sub20_Sub6.anInt1488, Class5.anInt60);
						}
					}

					if ((var12 == 1) || (!RuntimeException_Sub1.aBool1954 && (var12 == 4))) {
						var4 = Class131_Sub20_Sub19_Sub2.anInt1760;
						var9 = Class48.anInt476;
						var2 = Class131_Sub20_Sub6.anInt1488;
						var8 = Class81.anInt682;
						var13 = Class81.anInt680;
						var7 = -1;

						for (int var10 = 0; var10 < client.anInt2166; ++var10) {
							final int var11 = var9 + 31 + (15 * (client.anInt2166 - 1 - var10));
							if ((var8 > var4) && (var8 < (var2 + var4)) && (var13 > (var11 - 13))
									&& (var13 < (var11 + 3)))
								var7 = var10;
						}

						if (var7 != -1)
							Class32.method143(var7);

						client.aBool2047 = false;
						Class1.method12(Class131_Sub20_Sub19_Sub2.anInt1760, Class48.anInt476,
								Class131_Sub20_Sub6.anInt1488, Class5.anInt60);
					}
				} else {
					if (((var12 == 1) || (!RuntimeException_Sub1.aBool1954 && (var12 == 4)))
							&& (client.anInt2166 > 0)) {
						var4 = client.anIntArray2066[client.anInt2166 - 1];
						if ((var4 == 39) || (var4 == 40) || (var4 == 41) || (var4 == 42) || (var4 == 43) || (var4 == 33)
								|| (var4 == 34) || (var4 == 35) || (var4 == 36) || (var4 == 37) || (var4 == 38)
								|| (var4 == 1005))
							label291: {
								var9 = client.anIntArray2171[client.anInt2166 - 1];
								var2 = client.anIntArray2168[client.anInt2166 - 1];
								final Class131_Sub18 var3 = Class88.method377(var2);
								if (!Class131_Sub10.method570(Class49.method254(var3))) {
									var7 = Class49.method254(var3);
									final boolean var1 = ((var7 >> 29) & 1) != 0;
									if (!var1)
										break label291;
								}

								if ((null != Class100.aClass131_Sub18_786) && !client.aBool2144
										&& (client.anInt2210 != 1)
										&& !Class131_Sub20_Sub19_Sub2.method922(client.anInt2166 - 1)
										&& (client.anInt2166 > 0)) {
									var13 = client.anInt2240;
									var7 = client.anInt2142;
									Class39.method213(Class40.aClass2_418, var13, var7);
									Class40.aClass2_418 = null;
								}

								client.aBool2144 = false;
								client.anInt2207 = 0;
								if (Class100.aClass131_Sub18_786 != null)
									Class131_Sub20_Sub6.method734(Class100.aClass131_Sub18_786);

								Class100.aClass131_Sub18_786 = Class88.method377(var2);
								client.anInt2140 = var9;
								client.anInt2240 = Class81.anInt682;
								client.anInt2142 = Class81.anInt680;
								if (client.anInt2166 > 0) {
									var13 = client.anInt2166 - 1;
									Class40.aClass2_418 = new Class2();
									Class40.aClass2_418.anInt10 = client.anIntArray2171[var13];
									Class40.aClass2_418.anInt4 = client.anIntArray2168[var13];
									Class40.aClass2_418.anInt5 = client.anIntArray2066[var13];
									Class40.aClass2_418.anInt3 = client.anIntArray2170[var13];
									Class40.aClass2_418.aString6 = client.aStringArray2195[var13];
								}

								Class131_Sub20_Sub6.method734(Class100.aClass131_Sub18_786);
								return;
							}
					}

					if (((var12 == 1) || (!RuntimeException_Sub1.aBool1954 && (var12 == 4)))
							&& (((client.anInt2210 == 1) && (client.anInt2166 > 2))
									|| Class131_Sub20_Sub19_Sub2.method922(client.anInt2166 - 1)))
						var12 = 2;

					if (((var12 == 1) || (!RuntimeException_Sub1.aBool1954 && (var12 == 4))) && (client.anInt2166 > 0))
						Class32.method143(client.anInt2166 - 1);

					if ((var12 == 2) && (client.anInt2166 > 0))
						RuntimeException_Sub1.method1033(Class81.anInt682, Class81.anInt680);
				}

			}
	}
}
