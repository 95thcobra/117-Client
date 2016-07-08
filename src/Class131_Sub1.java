public class Class131_Sub1 extends Class131 {
	static int anInt964;
	static int anInt965;
	static float[] aFloatArray977;
	static Class19[] aClass19Array983;
	static Class20[] aClass20Array967;
	static Class15[] aClass15Array986;
	static Class9[] aClass9Array969;
	static boolean[] aBoolArray970;
	static int[] anIntArray971;
	static float[] aFloatArray978;
	static float[] aFloatArray979;
	static float[] aFloatArray980;
	static int[] anIntArray984;
	static float[] aFloatArray959;
	static float[] aFloatArray958;
	static float[] aFloatArray982;
	static int[] anIntArray985;
	static byte[] aByteArray981;
	static int anInt962;
	static int anInt963;
	int anInt956;
	int anInt957;
	int anInt955;
	int anInt961;
	boolean aBool960;
	byte[][] aByteArrayArray988;
	float[] aFloatArray973;
	int anInt974;
	int anInt975;
	boolean aBool976;
	static boolean aBool972 = false;
	byte[] aByteArray968;
	int anInt987;
	int anInt966;

	static void method525(final byte[] var0) {
		method526(var0, 0);
		anInt964 = 1 << method532(4);
		anInt965 = 1 << method532(4);
		aFloatArray977 = new float[anInt965];

		int var1;
		int var2;
		int var5;
		int var6;
		int var8;
		for (var1 = 0; var1 < 2; ++var1) {
			var5 = var1 != 0 ? anInt965 : anInt964;
			var6 = var5 >> 1;
			var8 = var5 >> 2;
			var2 = var5 >> 3;
			final float[] var7 = new float[var6];

			for (int var9 = 0; var9 < var8; ++var9) {
				var7[2 * var9] = (float) Math.cos((4 * var9 * 3.141592653589793D) / var5);
				var7[(2 * var9) + 1] = -((float) Math.sin((4 * var9 * 3.141592653589793D) / var5));
			}

			final float[] var11 = new float[var6];

			for (int var4 = 0; var4 < var8; ++var4) {
				var11[2 * var4] = (float) Math.cos((((2 * var4) + 1) * 3.141592653589793D) / (2 * var5));
				var11[(2 * var4) + 1] = (float) Math.sin((((2 * var4) + 1) * 3.141592653589793D) / (2 * var5));
			}

			final float[] var10 = new float[var8];

			for (int var12 = 0; var12 < var2; ++var12) {
				var10[2 * var12] = (float) Math.cos((((4 * var12) + 2) * 3.141592653589793D) / var5);
				var10[(2 * var12) + 1] = -((float) Math.sin((((4 * var12) + 2) * 3.141592653589793D) / var5));
			}

			final int[] var3 = new int[var2];
			final int var13 = Class131_Sub11.method576(var2 - 1);

			for (int var14 = 0; var14 < var2; ++var14)
				var3[var14] = Class131_Sub20_Sub19_Sub2_Sub1.method1064(var14, var13);

			if (var1 != 0) {
				aFloatArray959 = var7;
				aFloatArray958 = var11;
				aFloatArray982 = var10;
				anIntArray985 = var3;
			} else {
				aFloatArray978 = var7;
				aFloatArray979 = var11;
				aFloatArray980 = var10;
				anIntArray984 = var3;
			}
		}

		var1 = method532(8) + 1;
		aClass19Array983 = new Class19[var1];

		for (var5 = 0; var5 < var1; ++var5)
			aClass19Array983[var5] = new Class19();

		var5 = method532(6) + 1;

		for (var6 = 0; var6 < var5; ++var6)
			method532(16);

		var5 = method532(6) + 1;
		aClass20Array967 = new Class20[var5];

		for (var6 = 0; var6 < var5; ++var6)
			aClass20Array967[var6] = new Class20();

		var6 = method532(6) + 1;
		aClass15Array986 = new Class15[var6];

		for (var8 = 0; var8 < var6; ++var8)
			aClass15Array986[var8] = new Class15();

		var8 = method532(6) + 1;
		aClass9Array969 = new Class9[var8];

		for (var2 = 0; var2 < var8; ++var2)
			aClass9Array969[var2] = new Class9();

		var2 = method532(6) + 1;
		aBoolArray970 = new boolean[var2];
		anIntArray971 = new int[var2];

		for (int var15 = 0; var15 < var2; ++var15) {
			aBoolArray970[var15] = method527() != 0;
			method532(16);
			method532(16);
			anIntArray971[var15] = method532(8);
		}

	}

	static void method526(final byte[] var0, final int var1) {
		aByteArray981 = var0;
		anInt962 = var1;
		anInt963 = 0;
	}

	static int method527() {
		final int var0 = (aByteArray981[anInt962] >> anInt963) & 1;
		++anInt963;
		anInt962 += anInt963 >> 3;
		anInt963 &= 7;
		return var0;
	}

	void method528(final byte[] var1) {
		final DataBuffer var2 = new DataBuffer(var1);
		anInt956 = var2.readIntV1();
		anInt957 = var2.readIntV1();
		anInt955 = var2.readIntV1();
		anInt961 = var2.readIntV1();
		if (anInt961 < 0) {
			anInt961 = ~anInt961;
			aBool960 = true;
		}

		final int var6 = var2.readIntV1();
		aByteArrayArray988 = new byte[var6][];

		for (int var5 = 0; var5 < var6; ++var5) {
			int var4 = 0;

			int var7;
			do {
				var7 = var2.method595();
				var4 += var7;
			} while (var7 >= 255);

			final byte[] var3 = new byte[var4];
			var2.method604(var3, 0, var4);
			aByteArrayArray988[var5] = var3;
		}

	}

	float[] method529(final int var1) {
		method526(aByteArrayArray988[var1], 0);
		method527();
		final int var4 = method532(Class131_Sub11.method576(anIntArray971.length - 1));
		final boolean var8 = aBoolArray970[var4];
		final int var2 = var8 ? anInt965 : anInt964;
		boolean var11 = false;
		boolean var10 = false;
		if (var8) {
			var11 = method527() != 0;
			var10 = method527() != 0;
		}

		final int var17 = var2 >> 1;
		int var18;
		int var38;
		int var41;
		if (var8 && !var11) {
			var18 = (var2 >> 2) - (anInt964 >> 2);
			var38 = (var2 >> 2) + (anInt964 >> 2);
			var41 = anInt964 >> 1;
		} else {
			var18 = 0;
			var38 = var17;
			var41 = var2 >> 1;
		}

		int var3;
		int var30;
		int var31;
		if (var8 && !var10) {
			var30 = var2 - (var2 >> 2) - (anInt964 >> 2);
			var31 = (var2 - (var2 >> 2)) + (anInt964 >> 2);
			var3 = anInt964 >> 1;
		} else {
			var30 = var17;
			var31 = var2;
			var3 = var2 >> 1;
		}

		final Class9 var12 = aClass9Array969[anIntArray971[var4]];
		final int var32 = var12.anInt85;
		int var13 = var12.anIntArray87[var32];
		final boolean var33 = !aClass20Array967[var13].method99();
		final boolean var53 = var33;

		for (var13 = 0; var13 < var12.anInt86; ++var13) {
			final Class15 var14 = aClass15Array986[var12.anIntArray88[var13]];
			final float[] var34 = aFloatArray977;
			var14.method58(var34, var2 >> 1, var53);
		}

		int var37;
		if (!var33) {
			var13 = var12.anInt85;
			var37 = var12.anIntArray87[var13];
			aClass20Array967[var37].method97(aFloatArray977, var2 >> 1);
		}

		int var22;
		if (var33)
			for (var13 = var2 >> 1; var13 < var2; ++var13)
				aFloatArray977[var13] = 0.0F;
		else {
			var13 = var2 >> 1;
			var37 = var2 >> 2;
			var22 = var2 >> 3;
			final float[] var5 = aFloatArray977;

			int var36;
			for (var36 = 0; var36 < var13; ++var36)
				var5[var36] *= 0.5F;

			for (var36 = var13; var36 < var2; ++var36)
				var5[var36] = -var5[var2 - var36 - 1];

			final float[] var15 = var8 ? aFloatArray959 : aFloatArray978;
			final float[] var40 = var8 ? aFloatArray958 : aFloatArray979;
			final float[] var44 = var8 ? aFloatArray982 : aFloatArray980;
			final int[] var42 = var8 ? anIntArray985 : anIntArray984;

			float var6;
			float var7;
			int var16;
			float var19;
			float var21;
			for (var16 = 0; var16 < var37; ++var16) {
				var21 = var5[4 * var16] - var5[var2 - (4 * var16) - 1];
				var19 = var5[(4 * var16) + 2] - var5[var2 - (4 * var16) - 3];
				var6 = var15[2 * var16];
				var7 = var15[(2 * var16) + 1];
				var5[var2 - (4 * var16) - 1] = (var21 * var6) - (var19 * var7);
				var5[var2 - (4 * var16) - 3] = (var21 * var7) + (var19 * var6);
			}

			float var9;
			float var20;
			for (var16 = 0; var16 < var22; ++var16) {
				var21 = var5[var13 + 3 + (4 * var16)];
				var19 = var5[var13 + 1 + (4 * var16)];
				var6 = var5[(4 * var16) + 3];
				var7 = var5[(4 * var16) + 1];
				var5[var13 + 3 + (4 * var16)] = var21 + var6;
				var5[var13 + 1 + (4 * var16)] = var19 + var7;
				var9 = var15[var13 - 4 - (4 * var16)];
				var20 = var15[var13 - 3 - (4 * var16)];
				var5[(4 * var16) + 3] = ((var21 - var6) * var9) - ((var19 - var7) * var20);
				var5[(4 * var16) + 1] = ((var19 - var7) * var9) + ((var21 - var6) * var20);
			}

			var16 = Class131_Sub11.method576(var2 - 1);

			int var45;
			int var46;
			int var49;
			int var51;
			for (var51 = 0; var51 < (var16 - 3); ++var51) {
				var49 = var2 >> (var51 + 2);
				var45 = 8 << var51;

				for (var46 = 0; var46 < (2 << var51); ++var46) {
					final int var47 = var2 - (var49 * 2 * var46);
					final int var50 = var2 - (var49 * ((2 * var46) + 1));

					for (int var39 = 0; var39 < (var2 >> (var51 + 4)); ++var39) {
						final int var23 = 4 * var39;
						final float var28 = var5[var47 - 1 - var23];
						final float var25 = var5[var47 - 3 - var23];
						final float var24 = var5[var50 - 1 - var23];
						final float var26 = var5[var50 - 3 - var23];
						var5[var47 - 1 - var23] = var28 + var24;
						var5[var47 - 3 - var23] = var25 + var26;
						final float var27 = var15[var39 * var45];
						final float var29 = var15[(var39 * var45) + 1];
						var5[var50 - 1 - var23] = ((var28 - var24) * var27) - ((var25 - var26) * var29);
						var5[var50 - 3 - var23] = ((var25 - var26) * var27) + ((var28 - var24) * var29);
					}
				}
			}

			for (var51 = 1; var51 < (var22 - 1); ++var51) {
				var49 = var42[var51];
				if (var51 < var49) {
					var45 = 8 * var51;
					var46 = 8 * var49;
					var9 = var5[var45 + 1];
					var5[var45 + 1] = var5[var46 + 1];
					var5[var46 + 1] = var9;
					var9 = var5[var45 + 3];
					var5[var45 + 3] = var5[var46 + 3];
					var5[var46 + 3] = var9;
					var9 = var5[var45 + 5];
					var5[var45 + 5] = var5[var46 + 5];
					var5[var46 + 5] = var9;
					var9 = var5[var45 + 7];
					var5[var45 + 7] = var5[var46 + 7];
					var5[var46 + 7] = var9;
				}
			}

			for (var51 = 0; var51 < var13; ++var51)
				var5[var51] = var5[(2 * var51) + 1];

			for (var51 = 0; var51 < var22; ++var51) {
				var5[var2 - 1 - (2 * var51)] = var5[4 * var51];
				var5[var2 - 2 - (2 * var51)] = var5[(4 * var51) + 1];
				var5[var2 - var37 - 1 - (2 * var51)] = var5[(4 * var51) + 2];
				var5[var2 - var37 - 2 - (2 * var51)] = var5[(4 * var51) + 3];
			}

			for (var51 = 0; var51 < var22; ++var51) {
				var19 = var44[2 * var51];
				var6 = var44[(2 * var51) + 1];
				var7 = var5[var13 + (2 * var51)];
				var9 = var5[var13 + (2 * var51) + 1];
				var20 = var5[var2 - 2 - (2 * var51)];
				final float var54 = var5[var2 - 1 - (2 * var51)];
				float var52 = (var6 * (var7 - var20)) + (var19 * (var9 + var54));
				var5[var13 + (2 * var51)] = (var7 + var20 + var52) * 0.5F;
				var5[var2 - 2 - (2 * var51)] = ((var7 + var20) - var52) * 0.5F;
				var52 = (var6 * (var9 + var54)) - (var19 * (var7 - var20));
				var5[var13 + (2 * var51) + 1] = ((var9 - var54) + var52) * 0.5F;
				var5[var2 - 1 - (2 * var51)] = (-var9 + var54 + var52) * 0.5F;
			}

			for (var51 = 0; var51 < var37; ++var51) {
				var5[var51] = (var5[(2 * var51) + var13] * var40[2 * var51])
						+ (var5[(2 * var51) + 1 + var13] * var40[(2 * var51) + 1]);
				var5[var13 - 1 - var51] = (var5[(2 * var51) + var13] * var40[(2 * var51) + 1])
						- (var5[(2 * var51) + 1 + var13] * var40[2 * var51]);
			}

			for (var51 = 0; var51 < var37; ++var51)
				var5[(var2 - var37) + var51] = -var5[var51];

			for (var51 = 0; var51 < var37; ++var51)
				var5[var51] = var5[var37 + var51];

			for (var51 = 0; var51 < var37; ++var51)
				var5[var37 + var51] = -var5[var37 - var51 - 1];

			for (var51 = 0; var51 < var37; ++var51)
				var5[var13 + var51] = var5[var2 - var51 - 1];

			for (var51 = var18; var51 < var38; ++var51) {
				var19 = (float) Math.sin((((var51 - var18) + 0.5D) / var41) * 0.5D * 3.141592653589793D);
				aFloatArray977[var51] *= (float) Math.sin(1.5707963267948966D * var19 * var19);
			}

			for (var51 = var30; var51 < var31; ++var51) {
				var19 = (float) Math
						.sin(((((var51 - var30) + 0.5D) / var3) * 0.5D * 3.141592653589793D) + 1.5707963267948966D);
				aFloatArray977[var51] *= (float) Math.sin(1.5707963267948966D * var19 * var19);
			}
		}

		float[] var35 = null;
		if (anInt974 > 0) {
			var37 = (anInt974 + var2) >> 2;
			var35 = new float[var37];
			int var43;
			if (!aBool976)
				for (var22 = 0; var22 < anInt975; ++var22) {
					var43 = (anInt974 >> 1) + var22;
					var35[var22] += aFloatArray973[var43];
				}

			if (!var33)
				for (var22 = var18; var22 < (var2 >> 1); ++var22) {
					var43 = (var35.length - (var2 >> 1)) + var22;
					var35[var43] += aFloatArray977[var22];
				}
		}

		final float[] var48 = aFloatArray973;
		aFloatArray973 = aFloatArray977;
		aFloatArray977 = var48;
		anInt974 = var2;
		anInt975 = var31 - (var2 >> 1);
		aBool976 = var33;
		return var35;
	}

	static boolean method530(final Class100 var0) {
		if (!aBool972) {
			final byte[] var1 = var0.method402(0, 0);
			if (var1 == null)
				return false;

			method525(var1);
			aBool972 = true;
		}

		return true;
	}

	static Class131_Sub1 method531(final Class100 var0, final int var1, final int var2) {
		if (!method530(var0)) {
			var0.method404(var1, var2);
			return null;
		} else {
			final byte[] var3 = var0.method402(var1, var2);
			return var3 == null ? null : new Class131_Sub1(var3);
		}
	}

	static int method532(int var0) {
		int var1 = 0;

		int var2;
		int var4;
		for (var4 = 0; var0 >= (8 - anInt963); var0 -= var2) {
			var2 = 8 - anInt963;
			final int var3 = (1 << var2) - 1;
			var1 += ((aByteArray981[anInt962] >> anInt963) & var3) << var4;
			anInt963 = 0;
			++anInt962;
			var4 += var2;
		}

		if (var0 > 0) {
			var2 = (1 << var0) - 1;
			var1 += ((aByteArray981[anInt962] >> anInt963) & var2) << var4;
			anInt963 += var0;
		}

		return var1;
	}

	static float method533(final int var0) {
		int var1 = var0 & 2097151;
		final int var3 = var0 & Integer.MIN_VALUE;
		final int var2 = (var0 & 2145386496) >> 21;
		if (var3 != 0)
			var1 = -var1;

		return (float) (var1 * Math.pow(2.0D, var2 - 788));
	}

	Class131_Sub2_Sub1 method534(final int[] var1) {
		if ((var1 != null) && (var1[0] <= 0))
			return null;
		else {
			if (aByteArray968 == null) {
				anInt974 = 0;
				aFloatArray973 = new float[anInt965];
				aByteArray968 = new byte[anInt957];
				anInt987 = 0;
				anInt966 = 0;
			}

			for (; anInt966 < aByteArrayArray988.length; ++anInt966) {
				if ((var1 != null) && (var1[0] <= 0))
					return null;

				final float[] var2 = method529(anInt966);
				if (var2 != null) {
					int var5 = anInt987;
					int var6 = var2.length;
					if (var6 > (anInt957 - var5))
						var6 = anInt957 - var5;

					for (int var3 = 0; var3 < var6; ++var3) {
						int var4 = (int) (128.0F + (var2[var3] * 128.0F));
						if ((var4 & -256) != 0)
							var4 = ~var4 >> 31;

						aByteArray968[var5++] = (byte) (var4 - 128);
					}

					if (var1 != null)
						var1[0] -= var5 - anInt987;

					anInt987 = var5;
				}
			}

			aFloatArray973 = null;
			final byte[] var7 = aByteArray968;
			aByteArray968 = null;
			return new Class131_Sub2_Sub1(anInt956, var7, anInt955, anInt961, aBool960);
		}
	}

	Class131_Sub1(final byte[] var1) {
		method528(var1);
	}
}
