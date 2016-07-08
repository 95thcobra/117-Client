import java.util.Random;

public abstract class Class131_Sub20_Sub17_Sub4 extends Class131_Sub20_Sub17 {
	public static Class131_Sub20_Sub17_Sub2[] aClass131_Sub20_Sub17_Sub2Array1965;
	byte[][] aByteArrayArray1960 = new byte[256][];
	public int anInt1962 = 0;
	int[] anIntArray1974;
	byte[] aByteArray1963;
	static int anInt1970 = 0;
	static int anInt1967 = -1;
	static int anInt1957 = -1;
	static int anInt1969 = -1;
	static int anInt1977 = -1;
	static int anInt1956 = 0;
	static int anInt1971 = 0;
	static int anInt1973 = 256;
	static int anInt1975 = 0;
	int[] anIntArray1972;
	int[] anIntArray1961;
	int[] anIntArray1958;
	int[] anIntArray1959;
	int anInt1968;
	int anInt1964;
	static Random aRandom1976 = new Random();
	static String[] aStringArray1966 = new String[100];

	Class131_Sub20_Sub17_Sub4(final byte[] var1) {
		method1034(var1);
	}

	void method1034(final byte[] var1) {
		anIntArray1974 = new int[256];
		int var3;
		if (var1.length == 257) {
			for (var3 = 0; var3 < anIntArray1974.length; ++var3)
				anIntArray1974[var3] = var1[var3] & 255;

			anInt1962 = var1[256] & 255;
		} else {
			var3 = 0;

			for (int var8 = 0; var8 < 256; ++var8)
				anIntArray1974[var8] = var1[var3++] & 255;

			final int[] var7 = new int[256];
			final int[] var9 = new int[256];

			int var10;
			for (var10 = 0; var10 < 256; ++var10)
				var7[var10] = var1[var3++] & 255;

			for (var10 = 0; var10 < 256; ++var10)
				var9[var10] = var1[var3++] & 255;

			final byte[][] var5 = new byte[256][];

			int var4;
			for (int var6 = 0; var6 < 256; ++var6) {
				var5[var6] = new byte[var7[var6]];
				byte var2 = 0;

				for (var4 = 0; var4 < var5[var6].length; ++var4) {
					var2 += var1[var3++];
					var5[var6][var4] = var2;
				}
			}

			final byte[][] var12 = new byte[256][];

			int var13;
			for (var13 = 0; var13 < 256; ++var13) {
				var12[var13] = new byte[var7[var13]];
				byte var14 = 0;

				for (int var11 = 0; var11 < var12[var13].length; ++var11) {
					var14 += var1[var3++];
					var12[var13][var11] = var14;
				}
			}

			aByteArray1963 = new byte[65536];

			for (var13 = 0; var13 < 256; ++var13)
				if ((var13 != 32) && (var13 != 160))
					for (var4 = 0; var4 < 256; ++var4)
						if ((var4 != 32) && (var4 != 160))
							aByteArray1963[(var13 << 8) + var4] = (byte) method1035(var5, var12, var9, anIntArray1974,
									var7, var13, var4);

			anInt1962 = var9[32] + var7[32];
		}

	}

	static int method1035(final byte[][] var0, final byte[][] var1, final int[] var2, final int[] var3,
			final int[] var4, final int var5, final int var6) {
		final int var7 = var2[var5];
		final int var19 = var7 + var4[var5];
		final int var10 = var2[var6];
		final int var11 = var10 + var4[var6];
		int var12 = var7;
		if (var10 > var7)
			var12 = var10;

		int var9 = var19;
		if (var11 < var19)
			var9 = var11;

		int var16 = var3[var5];
		if (var3[var6] < var16)
			var16 = var3[var6];

		final byte[] var14 = var1[var5];
		final byte[] var15 = var0[var6];
		int var13 = var12 - var7;
		int var17 = var12 - var10;

		for (int var8 = var12; var8 < var9; ++var8) {
			final int var18 = var14[var13++] + var15[var17++];
			if (var18 < var16)
				var16 = var18;
		}

		return -var16;
	}

	int method1036(char var1) {
		if (var1 == 160)
			var1 = 32;

		return anIntArray1974[Class64.method310(var1) & 255];
	}

	public int method1037(final String var1) {
		if (var1 == null)
			return 0;
		else {
			int var2 = -1;
			int var3 = -1;
			int var4 = 0;

			for (int var5 = 0; var5 < var1.length(); ++var5) {
				char var6 = var1.charAt(var5);
				if (var6 == 60)
					var2 = var5;
				else {
					if ((var6 == 62) && (var2 != -1)) {
						final String var7 = var1.substring(var2 + 1, var5);
						var2 = -1;
						if (var7.equals("lt"))
							var6 = 60;
						else {
							if (!var7.equals("gt")) {
								if (var7.startsWith("img="))
									try {
										final int var8 = Class131_Sub20_Sub8.method746(var7.substring(4));
										var4 += aClass131_Sub20_Sub17_Sub2Array1965[var8].anInt1788;
										var3 = -1;
									} catch (final Exception var10) {
										;
									}
								continue;
							}

							var6 = 62;
						}
					}

					if (var6 == 160)
						var6 = 32;

					if (var2 == -1) {
						var4 += anIntArray1974[(char) (Class64.method310(var6) & 255)];
						if ((aByteArray1963 != null) && (var3 != -1))
							var4 += aByteArray1963[(var3 << 8) + var6];

						var3 = var6;
					}
				}
			}

			return var4;
		}
	}

	int method1038(final String var1, final int[] var2, final String[] var3) {
		if (var1 == null)
			return 0;
		else {
			int var4 = 0;
			int var5 = 0;
			final StringBuilder var6 = new StringBuilder(100);
			int var7 = -1;
			int var8 = 0;
			byte var9 = 0;
			int var10 = -1;
			char var11 = 0;
			int var12 = 0;
			final int var13 = var1.length();

			for (int var14 = 0; var14 < var13; ++var14) {
				char var15 = var1.charAt(var14);
				if (var15 == 60)
					var10 = var14;
				else {
					if ((var15 == 62) && (var10 != -1)) {
						final String var16 = var1.substring(var10 + 1, var14);
						var10 = -1;
						var6.append('\u003c');
						var6.append(var16);
						var6.append('\u003e');
						if (var16.equals("br")) {
							var3[var12] = var6.toString().substring(var5, var6.length());
							++var12;
							var5 = var6.length();
							var4 = 0;
							var7 = -1;
							var11 = 0;
						} else if (var16.equals("lt")) {
							var4 += method1036('\u003c');
							if ((aByteArray1963 != null) && (var11 != -1))
								var4 += aByteArray1963[(var11 << 8) + 60];

							var11 = 60;
						} else if (var16.equals("gt")) {
							var4 += method1036('\u003e');
							if ((aByteArray1963 != null) && (var11 != -1))
								var4 += aByteArray1963[(var11 << 8) + 62];

							var11 = 62;
						} else if (var16.startsWith("img="))
							try {
								final int var17 = Class131_Sub20_Sub8.method746(var16.substring(4));
								var4 += aClass131_Sub20_Sub17_Sub2Array1965[var17].anInt1788;
								var11 = 0;
							} catch (final Exception var20) {
								;
							}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += method1036(var15);
							if ((aByteArray1963 != null) && (var11 != -1))
								var4 += aByteArray1963[(var11 << 8) + var15];

							var11 = var15;
						}

						if (var15 == 32) {
							var7 = var6.length();
							var8 = var4;
							var9 = 1;
						}

						if ((var2 != null) && (var4 > var2[var12 < var2.length ? var12 : var2.length - 1])
								&& (var7 >= 0)) {
							var3[var12] = var6.toString().substring(var5, var7 - var9);
							++var12;
							var5 = var7;
							var7 = -1;
							var4 -= var8;
							var11 = 0;
						}

						if (var15 == 45) {
							var7 = var6.length();
							var8 = var4;
							var9 = 0;
						}
					}
				}
			}

			final String var19 = var6.toString();
			if (var19.length() > var5)
				var3[var12++] = var19.substring(var5, var19.length());

			return var12;
		}
	}

	public int method1039(final String var1, final int var2) {
		final int var3 = method1038(var1, new int[] { var2 }, aStringArray1966);
		int var4 = 0;

		for (int var5 = 0; var5 < var3; ++var5) {
			final int var6 = method1037(aStringArray1966[var5]);
			if (var6 > var4)
				var4 = var6;
		}

		return var4;
	}

	public int method1040(final String var1, final int var2) {
		return method1038(var1, new int[] { var2 }, aStringArray1966);
	}

	public int method1041(final String var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final int var8, int var9, int var10) {
		if (var1 == null)
			return 0;
		else {
			method1045(var6, var7);
			if (var10 == 0)
				var10 = anInt1962;

			int[] var12 = new int[] { var4 };
			if ((var5 < (anInt1968 + anInt1964 + var10)) && (var5 < (var10 + var10)))
				var12 = null;

			final int var13 = method1038(var1, var12, aStringArray1966);
			if ((var9 == 3) && (var13 == 1))
				var9 = 1;

			int var11;
			int var14;
			if (var9 == 0)
				var14 = var3 + anInt1968;
			else if (var9 == 1)
				var14 = var3 + anInt1968 + ((var5 - anInt1968 - anInt1964 - ((var13 - 1) * var10)) / 2);
			else if (var9 == 2)
				var14 = (var3 + var5) - anInt1964 - ((var13 - 1) * var10);
			else {
				var11 = (var5 - anInt1968 - anInt1964 - ((var13 - 1) * var10)) / (var13 + 1);
				if (var11 < 0)
					var11 = 0;

				var14 = var3 + anInt1968 + var11;
				var10 += var11;
			}

			for (var11 = 0; var11 < var13; ++var11) {
				if (var8 == 0)
					method1048(aStringArray1966[var11], var2, var14);
				else if (var8 == 1)
					method1048(aStringArray1966[var11], var2 + ((var4 - method1037(aStringArray1966[var11])) / 2),
							var14);
				else if (var8 == 2)
					method1048(aStringArray1966[var11], (var2 + var4) - method1037(aStringArray1966[var11]), var14);
				else if (var11 == (var13 - 1))
					method1048(aStringArray1966[var11], var2, var14);
				else {
					method1047(aStringArray1966[var11], var4);
					method1048(aStringArray1966[var11], var2, var14);
					anInt1970 = 0;
				}

				var14 += var10;
			}

			return var13;
		}
	}

	public void method1042(final String var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		if (var1 != null) {
			method1045(var4, var5);
			final int[] var7 = new int[var1.length()];

			for (int var8 = 0; var8 < var1.length(); ++var8)
				var7[var8] = (int) (Math.sin((var8 / 2.0D) + (var6 / 5.0D)) * 5.0D);

			method1049(var1, var2 - (method1037(var1) / 2), var3, (int[]) null, var7);
		}
	}

	public void method1043(final String var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		if (var1 != null) {
			method1045(var4, var5);
			final int[] var7 = new int[var1.length()];
			final int[] var9 = new int[var1.length()];

			for (int var8 = 0; var8 < var1.length(); ++var8) {
				var7[var8] = (int) (Math.sin((var8 / 5.0D) + (var6 / 5.0D)) * 5.0D);
				var9[var8] = (int) (Math.sin((var8 / 3.0D) + (var6 / 5.0D)) * 5.0D);
			}

			method1049(var1, var2 - (method1037(var1) / 2), var3, var7, var9);
		}
	}

	static void method1044(final int[] var0, final byte[] var1, int var2, int var3, int var4, final int var5,
			final int var6, final int var7, final int var8, int var9) {
		var2 = ((((var2 & 16711935) * var9) & -16711936) + (((var2 & '\uff00') * var9) & 16711680)) >> 8;
		var9 = 256 - var9;

		for (int var10 = -var6; var10 < 0; ++var10) {
			for (int var11 = -var5; var11 < 0; ++var11)
				if (var1[var3++] != 0) {
					final int var12 = var0[var4];
					var0[var4++] = (((((var12 & 16711935) * var9) & -16711936)
							+ (((var12 & '\uff00') * var9) & 16711680)) >> 8) + var2;
				} else
					++var4;

			var4 += var7;
			var3 += var8;
		}

	}

	void method1045(final int var1, final int var2) {
		anInt1967 = -1;
		anInt1957 = -1;
		anInt1969 = var2;
		anInt1977 = var2;
		anInt1956 = var1;
		anInt1971 = var1;
		anInt1973 = 256;
		anInt1970 = 0;
		anInt1975 = 0;
	}

	void method1046(final String var1) {
		try {
			if (var1.startsWith("col="))
				anInt1971 = Class131_Sub17.method660(var1.substring(4), 16);
			else if (var1.equals("/col"))
				anInt1971 = anInt1956;
			else if (var1.startsWith("str="))
				anInt1967 = Class131_Sub17.method660(var1.substring(4), 16);
			else if (var1.equals("str"))
				anInt1967 = 8388608;
			else if (var1.equals("/str"))
				anInt1967 = -1;
			else if (var1.startsWith("u="))
				anInt1957 = Class131_Sub17.method660(var1.substring(2), 16);
			else if (var1.equals("u"))
				anInt1957 = 0;
			else if (var1.equals("/u"))
				anInt1957 = -1;
			else if (var1.startsWith("shad="))
				anInt1977 = Class131_Sub17.method660(var1.substring(5), 16);
			else if (var1.equals("shad"))
				anInt1977 = 0;
			else if (var1.equals("/shad"))
				anInt1977 = anInt1969;
			else if (var1.equals("br"))
				method1045(anInt1956, anInt1969);
		} catch (final Exception var3) {
			;
		}

	}

	void method1047(final String var1, final int var2) {
		int var3 = 0;
		boolean var4 = false;

		for (int var6 = 0; var6 < var1.length(); ++var6) {
			final char var5 = var1.charAt(var6);
			if (var5 == 60)
				var4 = true;
			else if (var5 == 62)
				var4 = false;
			else if (!var4 && (var5 == 32))
				++var3;
		}

		if (var3 > 0)
			anInt1970 = ((var2 - method1037(var1)) << 8) / var3;

	}

	void method1048(final String var1, int var2, int var3) {
		var3 -= anInt1962;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); ++var6)
			if (var1.charAt(var6) != 0) {
				char var7 = (char) (Class64.method310(var1.charAt(var6)) & 255);
				if (var7 == 60)
					var4 = var6;
				else {
					int var9;
					if ((var7 == 62) && (var4 != -1)) {
						final String var8 = var1.substring(var4 + 1, var6);
						var4 = -1;
						if (var8.equals("lt"))
							var7 = 60;
						else {
							if (!var8.equals("gt")) {
								if (var8.startsWith("img="))
									try {
										var9 = Class131_Sub20_Sub8.method746(var8.substring(4));
										final Class131_Sub20_Sub17_Sub2 var10 = aClass131_Sub20_Sub17_Sub2Array1965[var9];
										var10.method950(var2, (var3 + anInt1962) - var10.anInt1794);
										var2 += var10.anInt1788;
										var5 = -1;
									} catch (final Exception var14) {
										;
									}
								else
									method1046(var8);
								continue;
							}

							var7 = 62;
						}
					}

					if (var7 == 160)
						var7 = 32;

					if (var4 == -1) {
						if ((aByteArray1963 != null) && (var5 != -1))
							var2 += aByteArray1963[(var5 << 8) + var7];

						final int var12 = anIntArray1958[var7];
						var9 = anIntArray1959[var7];
						if (var7 != 32) {
							if (anInt1973 == 256) {
								if (anInt1977 != -1)
									method1060(aByteArrayArray1960[var7], var2 + anIntArray1972[var7] + 1,
											var3 + anIntArray1961[var7] + 1, var12, var9, anInt1977);

								method1050(aByteArrayArray1960[var7], var2 + anIntArray1972[var7],
										var3 + anIntArray1961[var7], var12, var9, anInt1971);
							} else {
								if (anInt1977 != -1)
									method1052(aByteArrayArray1960[var7], var2 + anIntArray1972[var7] + 1,
											var3 + anIntArray1961[var7] + 1, var12, var9, anInt1977, anInt1973);

								method1059(aByteArrayArray1960[var7], var2 + anIntArray1972[var7],
										var3 + anIntArray1961[var7], var12, var9, anInt1971, anInt1973);
							}
						} else if (anInt1970 > 0) {
							anInt1975 += anInt1970;
							var2 += anInt1975 >> 8;
							anInt1975 &= 255;
						}

						final int var13 = anIntArray1974[var7];
						if (anInt1967 != -1)
							method860(var2, var3 + (int) (anInt1962 * 0.7D), var13, anInt1967);

						if (anInt1957 != -1)
							method860(var2, var3 + anInt1962 + 1, var13, anInt1957);

						var2 += var13;
						var5 = var7;
					}
				}
			}

	}

	void method1049(final String var1, int var2, int var3, final int[] var4, final int[] var5) {
		var3 -= anInt1962;
		int var6 = -1;
		int var7 = -1;
		int var8 = 0;

		for (int var9 = 0; var9 < var1.length(); ++var9)
			if (var1.charAt(var9) != 0) {
				char var10 = (char) (Class64.method310(var1.charAt(var9)) & 255);
				if (var10 == 60)
					var6 = var9;
				else {
					int var12;
					int var13;
					int var14;
					if ((var10 == 62) && (var6 != -1)) {
						final String var11 = var1.substring(var6 + 1, var9);
						var6 = -1;
						if (var11.equals("lt"))
							var10 = 60;
						else {
							if (!var11.equals("gt")) {
								if (var11.startsWith("img="))
									try {
										if (var4 != null)
											var12 = var4[var8];
										else
											var12 = 0;

										if (var5 != null)
											var13 = var5[var8];
										else
											var13 = 0;

										++var8;
										var14 = Class131_Sub20_Sub8.method746(var11.substring(4));
										final Class131_Sub20_Sub17_Sub2 var15 = aClass131_Sub20_Sub17_Sub2Array1965[var14];
										var15.method950(var2 + var12, ((var3 + anInt1962) - var15.anInt1794) + var13);
										var2 += var15.anInt1788;
										var7 = -1;
									} catch (final Exception var19) {
										;
									}
								else
									method1046(var11);
								continue;
							}

							var10 = 62;
						}
					}

					if (var10 == 160)
						var10 = 32;

					if (var6 == -1) {
						if ((aByteArray1963 != null) && (var7 != -1))
							var2 += aByteArray1963[(var7 << 8) + var10];

						final int var17 = anIntArray1958[var10];
						var12 = anIntArray1959[var10];
						if (var4 != null)
							var13 = var4[var8];
						else
							var13 = 0;

						if (var5 != null)
							var14 = var5[var8];
						else
							var14 = 0;

						++var8;
						if (var10 != 32) {
							if (anInt1973 == 256) {
								if (anInt1977 != -1)
									method1060(aByteArrayArray1960[var10], var2 + anIntArray1972[var10] + 1 + var13,
											var3 + anIntArray1961[var10] + 1 + var14, var17, var12, anInt1977);

								method1050(aByteArrayArray1960[var10], var2 + anIntArray1972[var10] + var13,
										var3 + anIntArray1961[var10] + var14, var17, var12, anInt1971);
							} else {
								if (anInt1977 != -1)
									method1052(aByteArrayArray1960[var10], var2 + anIntArray1972[var10] + 1 + var13,
											var3 + anIntArray1961[var10] + 1 + var14, var17, var12, anInt1977,
											anInt1973);

								method1059(aByteArrayArray1960[var10], var2 + anIntArray1972[var10] + var13,
										var3 + anIntArray1961[var10] + var14, var17, var12, anInt1971, anInt1973);
							}
						} else if (anInt1970 > 0) {
							anInt1975 += anInt1970;
							var2 += anInt1975 >> 8;
							anInt1975 &= 255;
						}

						final int var18 = anIntArray1974[var10];
						if (anInt1967 != -1)
							method860(var2, var3 + (int) (anInt1962 * 0.7D), var18, anInt1967);

						if (anInt1957 != -1)
							method860(var2, var3 + anInt1962, var18, anInt1957);

						var2 += var18;
						var7 = var10;
					}
				}
			}

	}

	abstract void method1050(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	static void method1051(final int[] var0, final byte[] var1, final int var2, int var3, int var4, int var5,
			final int var6, final int var7, final int var8) {
		final int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var11 = -var6; var11 < 0; ++var11) {
			int var10;
			for (var10 = var9; var10 < 0; ++var10) {
				if (var1[var3++] != 0)
					var0[var4++] = var2;
				else
					++var4;

				if (var1[var3++] != 0)
					var0[var4++] = var2;
				else
					++var4;

				if (var1[var3++] != 0)
					var0[var4++] = var2;
				else
					++var4;

				if (var1[var3++] != 0)
					var0[var4++] = var2;
				else
					++var4;
			}

			for (var10 = var5; var10 < 0; ++var10)
				if (var1[var3++] != 0)
					var0[var4++] = var2;
				else
					++var4;

			var4 += var7;
			var3 += var8;
		}

	}

	static void method1052(final byte[] var0, int var1, int var2, int var3, int var4, final int var5, final int var6) {
		int var7 = var1 + (var2 * anInt1627);
		int var9 = anInt1627 - var3;
		int var8 = 0;
		int var10 = 0;
		int var11;
		if (var2 < anInt1630) {
			var11 = anInt1630 - var2;
			var4 -= var11;
			var2 = anInt1630;
			var10 += var11 * var3;
			var7 += var11 * anInt1627;
		}

		if ((var2 + var4) > anInt1631)
			var4 -= (var2 + var4) - anInt1631;

		if (var1 < anInt1632) {
			var11 = anInt1632 - var1;
			var3 -= var11;
			var1 = anInt1632;
			var10 += var11;
			var7 += var11;
			var8 += var11;
			var9 += var11;
		}

		if ((var1 + var3) > anInt1628) {
			var11 = (var1 + var3) - anInt1628;
			var3 -= var11;
			var8 += var11;
			var9 += var11;
		}

		if ((var3 > 0) && (var4 > 0))
			method1044(anIntArray1629, var0, var5, var10, var7, var3, var4, var9, var8, var6);
	}

	public void method1053(final String var1, final int var2, final int var3, final int var4, final int var5) {
		if (var1 != null) {
			method1045(var4, var5);
			method1048(var1, var2, var3);
		}
	}

	public static String method1054(final String var0) {
		final int var1 = var0.length();
		int var5 = 0;

		for (int var4 = 0; var4 < var1; ++var4) {
			final char var3 = var0.charAt(var4);
			if ((var3 == 60) || (var3 == 62))
				var5 += 3;
		}

		final StringBuilder var2 = new StringBuilder(var1 + var5);

		for (int var7 = 0; var7 < var1; ++var7) {
			final char var6 = var0.charAt(var7);
			if (var6 == 60)
				var2.append("<lt>");
			else if (var6 == 62)
				var2.append("<gt>");
			else
				var2.append(var6);
		}

		return var2.toString();
	}

	public void method1055(final String var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7) {
		if (var1 != null) {
			method1045(var4, var5);
			double var9 = 7.0D - (var7 / 8.0D);
			if (var9 < 0.0D)
				var9 = 0.0D;

			final int[] var11 = new int[var1.length()];

			for (int var8 = 0; var8 < var1.length(); ++var8)
				var11[var8] = (int) (Math.sin((var8 / 1.5D) + (var6 / 1.0D)) * var9);

			method1049(var1, var2 - (method1037(var1) / 2), var3, (int[]) null, var11);
		}
	}

	public void method1056(final String var1, final int var2, final int var3, final int var4, final int var5) {
		if (var1 != null) {
			method1045(var4, var5);
			method1048(var1, var2 - (method1037(var1) / 2), var3);
		}
	}

	Class131_Sub20_Sub17_Sub4(final byte[] var1, final int[] var2, final int[] var3, final int[] var4, final int[] var5,
			final int[] var6, final byte[][] var7) {
		anIntArray1972 = var2;
		anIntArray1961 = var3;
		anIntArray1958 = var4;
		anIntArray1959 = var5;
		method1034(var1);
		aByteArrayArray1960 = var7;
		int var10 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;

		for (int var8 = 0; var8 < 256; ++var8) {
			if ((anIntArray1961[var8] < var10) && (anIntArray1959[var8] != 0))
				var10 = anIntArray1961[var8];

			if ((anIntArray1961[var8] + anIntArray1959[var8]) > var9)
				var9 = anIntArray1961[var8] + anIntArray1959[var8];
		}

		anInt1968 = anInt1962 - var10;
		anInt1964 = var9 - anInt1962;
	}

	public void method1057(final String var1, final int var2, final int var3, final int var4, final int var5) {
		if (var1 != null) {
			method1045(var4, var5);
			method1048(var1, var2 - method1037(var1), var3);
		}
	}

	public void method1058(final String var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		if (var1 != null) {
			method1045(var4, var5);
			aRandom1976.setSeed(var6);
			anInt1973 = 192 + (aRandom1976.nextInt() & 31);
			final int[] var9 = new int[var1.length()];
			int var8 = 0;

			for (int var7 = 0; var7 < var1.length(); ++var7) {
				var9[var7] = var8;
				if ((aRandom1976.nextInt() & 3) == 0)
					++var8;
			}

			method1049(var1, var2, var3, var9, (int[]) null);
		}
	}

	abstract void method1059(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	static void method1060(final byte[] var0, int var1, int var2, int var3, int var4, final int var5) {
		int var6 = var1 + (var2 * anInt1627);
		int var9 = anInt1627 - var3;
		int var7 = 0;
		int var10 = 0;
		int var8;
		if (var2 < anInt1630) {
			var8 = anInt1630 - var2;
			var4 -= var8;
			var2 = anInt1630;
			var10 += var8 * var3;
			var6 += var8 * anInt1627;
		}

		if ((var2 + var4) > anInt1631)
			var4 -= (var2 + var4) - anInt1631;

		if (var1 < anInt1632) {
			var8 = anInt1632 - var1;
			var3 -= var8;
			var1 = anInt1632;
			var10 += var8;
			var6 += var8;
			var7 += var8;
			var9 += var8;
		}

		if ((var1 + var3) > anInt1628) {
			var8 = (var1 + var3) - anInt1628;
			var3 -= var8;
			var7 += var8;
			var9 += var8;
		}

		if ((var3 > 0) && (var4 > 0))
			method1051(anIntArray1629, var0, var5, var10, var6, var3, var4, var9, var7);
	}
}
