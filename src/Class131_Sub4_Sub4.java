public class Class131_Sub4_Sub4 extends Class131_Sub4 {
	static Class100_Sub1 aClass100_Sub1_1689;
	Class115 aClass115_1690 = new Class115();
	Class131_Sub4_Sub2 aClass131_Sub4_Sub2_1687 = new Class131_Sub4_Sub2();
	Class131_Sub4_Sub3 aClass131_Sub4_Sub3_1688;

	void method913(final Class131_Sub22 var1, final int[] var2, int var3, int var4, final int var5) {
		if (((aClass131_Sub4_Sub3_1688.anIntArray1673[var1.anInt1332] & 4) != 0) && (var1.anInt1335 < 0)) {
			final int var6 = aClass131_Sub4_Sub3_1688.anIntArray1677[var1.anInt1332] / Class17.anInt162;

			while (true) {
				final int var7 = ((var6 + 1048575) - var1.anInt1338) / var6;
				if (var7 > var4) {
					var1.anInt1338 += var6 * var4;
					break;
				}

				var1.aClass131_Sub4_Sub1_1339.method541(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.anInt1338 += (var7 * var6) - 1048576;
				int var9 = Class17.anInt162 / 100;
				final int var8 = 262144 / var6;
				if (var8 < var9)
					var9 = var8;

				final Class131_Sub4_Sub1 var10 = var1.aClass131_Sub4_Sub1_1339;
				if (aClass131_Sub4_Sub3_1688.anIntArray1660[var1.anInt1332] == 0)
					var1.aClass131_Sub4_Sub1_1339 = Class131_Sub4_Sub1.method795(var1.aClass131_Sub2_Sub1_1323,
							var10.method818(), var10.method825(), var10.method797());
				else {
					var1.aClass131_Sub4_Sub1_1339 = Class131_Sub4_Sub1.method795(var1.aClass131_Sub2_Sub1_1323,
							var10.method818(), 0, var10.method797());
					aClass131_Sub4_Sub3_1688.method897(var1,
							var1.aClass131_Sub16_1322.aShortArray1138[var1.anInt1326] < 0);
					var1.aClass131_Sub4_Sub1_1339.method826(var9, var10.method825());
				}

				if (var1.aClass131_Sub16_1322.aShortArray1138[var1.anInt1326] < 0)
					var1.aClass131_Sub4_Sub1_1339.method802(-1);

				var10.method801(var9);
				var10.method541(var2, var3, var5 - var3);
				if (var10.method832())
					aClass131_Sub4_Sub2_1687.method839(var10);
			}
		}

		var1.aClass131_Sub4_Sub1_1339.method541(var2, var3, var4);
	}

	@Override
	protected Class131_Sub4 method543() {
		Class131_Sub22 var1;
		do {
			var1 = (Class131_Sub22) aClass115_1690.method468();
			if (null == var1)
				return null;
		} while (null == var1.aClass131_Sub4_Sub1_1339);

		return var1.aClass131_Sub4_Sub1_1339;
	}

	@Override
	protected int method538() {
		return 0;
	}

	@Override
	protected void method542(final int var1) {
		aClass131_Sub4_Sub2_1687.method542(var1);

		for (Class131_Sub22 var2 = (Class131_Sub22) aClass115_1690
				.method465(); null != var2; var2 = (Class131_Sub22) aClass115_1690.method468())
			if (!aClass131_Sub4_Sub3_1688.method909(var2)) {
				int var3 = var1;

				do {
					if (var3 <= var2.anInt1340) {
						method915(var2, var3);
						var2.anInt1340 -= var3;
						break;
					}

					method915(var2, var2.anInt1340);
					var3 -= var2.anInt1340;
				} while (!aClass131_Sub4_Sub3_1688.method904(var2, (int[]) null, 0, var3));
			}

	}

	static final byte[] method914(final byte[] var0) {
		final DataBuffer var1 = new DataBuffer(var0);
		final int var3 = var1.readUByte();
		final int var2 = var1.readIntV1();
		if ((var2 >= 0) && ((Class100.anInt792 == 0) || (var2 <= Class100.anInt792))) {
			if (var3 == 0) {
				final byte[] var4 = new byte[var2];
				var1.method604(var4, 0, var2);
				return var4;
			} else {
				final int var5 = var1.readIntV1();

				// Xtea crashpatch
				if (var5 > 1_000_000) {
					System.err.println("XTEA crash intercepted; returning null bytes");
					return new byte[100];
				}

				if ((var5 < 0) || ((Class100.anInt792 != 0) && (var5 > Class100.anInt792))) {
					
					// throw new RuntimeException(); // xtea crash patch
					return new byte[100]; // xtea crash patch
					
				} else {
					final byte[] var6 = new byte[var5];
					if (var3 == 1)
						Class59.method283(var6, var5, var0, var2, 9);
					else
						Class100.aClass66_788.method311(var1, var6);

					return var6;
				}
			}
		} else
			throw new RuntimeException();
	}

	void method915(final Class131_Sub22 var1, int var2) {
		if (((aClass131_Sub4_Sub3_1688.anIntArray1673[var1.anInt1332] & 4) != 0) && (var1.anInt1335 < 0)) {
			final int var3 = aClass131_Sub4_Sub3_1688.anIntArray1677[var1.anInt1332] / Class17.anInt162;
			final int var4 = ((var3 + 1048575) - var1.anInt1338) / var3;
			var1.anInt1338 = ((var2 * var3) + var1.anInt1338) & 1048575;
			if (var4 <= var2) {
				if (aClass131_Sub4_Sub3_1688.anIntArray1660[var1.anInt1332] == 0)
					var1.aClass131_Sub4_Sub1_1339 = Class131_Sub4_Sub1.method795(var1.aClass131_Sub2_Sub1_1323,
							var1.aClass131_Sub4_Sub1_1339.method818(), var1.aClass131_Sub4_Sub1_1339.method825(),
							var1.aClass131_Sub4_Sub1_1339.method797());
				else {
					var1.aClass131_Sub4_Sub1_1339 = Class131_Sub4_Sub1.method795(var1.aClass131_Sub2_Sub1_1323,
							var1.aClass131_Sub4_Sub1_1339.method818(), 0, var1.aClass131_Sub4_Sub1_1339.method797());
					aClass131_Sub4_Sub3_1688.method897(var1,
							var1.aClass131_Sub16_1322.aShortArray1138[var1.anInt1326] < 0);
				}

				if (var1.aClass131_Sub16_1322.aShortArray1138[var1.anInt1326] < 0)
					var1.aClass131_Sub4_Sub1_1339.method802(-1);

				var2 = var1.anInt1338 / var3;
			}
		}

		var1.aClass131_Sub4_Sub1_1339.method542(var2);
	}

	@Override
	protected Class131_Sub4 method539() {
		final Class131_Sub22 var1 = (Class131_Sub22) aClass115_1690.method465();
		return var1 == null ? null
				: (var1.aClass131_Sub4_Sub1_1339 != null ? var1.aClass131_Sub4_Sub1_1339 : method543());
	}

	@Override
	protected void method541(final int[] var1, final int var2, final int var3) {
		aClass131_Sub4_Sub2_1687.method541(var1, var2, var3);

		for (Class131_Sub22 var5 = (Class131_Sub22) aClass115_1690
				.method465(); null != var5; var5 = (Class131_Sub22) aClass115_1690.method468())
			if (!aClass131_Sub4_Sub3_1688.method909(var5)) {
				int var6 = var2;
				int var4 = var3;

				do {
					if (var4 <= var5.anInt1340) {
						method913(var5, var1, var6, var4, var6 + var4);
						var5.anInt1340 -= var4;
						break;
					}

					method913(var5, var1, var6, var5.anInt1340, var4 + var6);
					var6 += var5.anInt1340;
					var4 -= var5.anInt1340;
				} while (!aClass131_Sub4_Sub3_1688.method904(var5, var1, var6, var4));
			}

	}

	Class131_Sub4_Sub4(final Class131_Sub4_Sub3 var1) {
		aClass131_Sub4_Sub3_1688 = var1;
	}
}
