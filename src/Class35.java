public class Class35 implements Interface3 {
	public static short[] aShortArray360;
	int anInt363 = 0;
	Class115 aClass115_361 = new Class115();
	double aDouble367 = 1.0D;
	int anInt364 = 128;
	Class100 aClass100_365;
	int anInt362;
	Class131_Sub8[] aClass131_Sub8Array366;

	@Override
	public int[] method10(final int var1, final int var2) {
		final Class131_Sub8 var3 = aClass131_Sub8Array366[var1];
		if (var3 != null) {
			if (var3.anIntArray1040 != null) {
				aClass115_361.method464(var3);
				var3.aBool1041 = true;
				return var3.anIntArray1040;
			}

			final boolean var4 = var3.method560(aDouble367, anInt364, aClass100_365);
			if (var4) {
				if (anInt363 == 0) {
					final Class131_Sub8 var5 = (Class131_Sub8) aClass115_361.method463();
					var5.method559();
				} else
					--anInt363;

				aClass115_361.method464(var3);
				var3.aBool1041 = true;
				return var3.anIntArray1040;
			}
		}

		return null;
	}

	@Override
	public int method7(final int var1, final int var2) {
		return aClass131_Sub8Array366[var1] == null ? 0 : aClass131_Sub8Array366[var1].anInt1033;
	}

	public void method201() {
		for (final Class131_Sub8 element : aClass131_Sub8Array366)
			if (null != element)
				element.method559();

		aClass115_361 = new Class115();
		anInt363 = anInt362;
	}

	public void method202(final int var1) {
		for (final Class131_Sub8 element : aClass131_Sub8Array366) {
			final Class131_Sub8 var3 = element;
			if ((var3 != null) && (var3.anInt1038 != 0) && var3.aBool1041) {
				var3.method561(var1);
				var3.aBool1041 = false;
			}
		}

	}

	public void method203(final double var1) {
		aDouble367 = var1;
		method201();
	}

	static final void method204(final DataBuffer var0, final int var1, final int var2, final int var3,
			final int var4, final int var5, final int var6) {
		int var8;
		if ((var2 >= 0) && (var2 < 104) && (var3 >= 0) && (var3 < 104)) {
			Class26.aByteArrayArrayArray225[var1][var2][var3] = 0;

			while (true) {
				var8 = var0.readUByte();
				if (var8 == 0) {
					if (var1 == 0)
						Class26.anIntArrayArrayArray239[0][var2][var3] = -Class106.method430(var4 + var2 + 932731,
								var3 + 556238 + var5) * 8;
					else
						Class26.anIntArrayArrayArray239[var1][var2][var3] = Class26.anIntArrayArrayArray239[var1
								- 1][var2][var3] - 240;
					break;
				}

				if (var8 == 1) {
					int var7 = var0.readUByte();
					if (var7 == 1)
						var7 = 0;

					if (var1 == 0)
						Class26.anIntArrayArrayArray239[0][var2][var3] = -var7 * 8;
					else
						Class26.anIntArrayArrayArray239[var1][var2][var3] = Class26.anIntArrayArrayArray239[var1
								- 1][var2][var3] - (8 * var7);
					break;
				}

				if (var8 <= 49) {
					Class136.aByteArrayArrayArray907[var1][var2][var3] = var0.readByte();
					Class26.aByteArrayArrayArray224[var1][var2][var3] = (byte) ((var8 - 2) / 4);
					Class26.aByteArrayArrayArray229[var1][var2][var3] = (byte) (((var8 - 2) + var6) & 3);
				} else if (var8 <= 81)
					Class26.aByteArrayArrayArray225[var1][var2][var3] = (byte) (var8 - 49);
				else
					Class26.aByteArrayArrayArray227[var1][var2][var3] = (byte) (var8 - 81);
			}
		} else
			while (true) {
				var8 = var0.readUByte();
				if (var8 == 0)
					break;

				if (var8 == 1) {
					var0.readUByte();
					break;
				}

				if (var8 <= 49)
					var0.readUByte();
			}

	}

	@Override
	public boolean method9(final int var1, final byte var2) {
		return anInt364 == 64;
	}

	public Class35(final Class100 var1, final Class100 var2, final int var3, final double var4, final int var6) {
		aClass100_365 = var2;
		anInt362 = var3;
		anInt363 = anInt362;
		aDouble367 = var4;
		anInt364 = var6;
		final int[] var7 = var1.method420(0);
		final int var8 = var7.length;
		aClass131_Sub8Array366 = new Class131_Sub8[var1.method417(0)];

		for (int var9 = 0; var9 < var8; ++var9) {
			final DataBuffer var10 = new DataBuffer(var1.method402(0, var7[var9]));
			aClass131_Sub8Array366[var7[var9]] = new Class131_Sub8(var10);
		}

	}

	@Override
	public boolean method8(final int var1, final int var2) {
		return aClass131_Sub8Array366[var1].aBool1034;
	}
}
