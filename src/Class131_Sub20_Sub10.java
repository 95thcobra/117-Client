public class Class131_Sub20_Sub10 extends Class131_Sub20 {
	public static int anInt1553;
	static Class100 aClass100_1554;
	static Class121 aClass121_1551 = new Class121(64);
	public boolean aBool1552 = false;

	void method762(final DataBuffer var1, final int var2) {
		if (var2 == 2)
			aBool1552 = true;

	}

	static final void method763(final boolean var0) {
		for (int var1 = 0; var1 < client.anInt2230; ++var1) {
			final Class131_Sub20_Sub19_Sub2_Sub1 var2 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[client.anIntArray2067[var1]];
			int var5 = (client.anIntArray2067[var1] << 14) + 536870912;
			if ((var2 != null) && var2.method920(1754687886) && (var0 == var2.aClass131_Sub20_Sub6_1978.aBool1456)
					&& var2.aClass131_Sub20_Sub6_1978.method732()) {
				final int var3 = var2.anInt1718 >> 7;
				final int var4 = var2.anInt1759 >> 7;
				if ((var3 >= 0) && (var3 < 104) && (var4 >= 0) && (var4 < 104)) {
					if ((var2.anInt1706 == 1) && ((var2.anInt1718 & 127) == 64) && ((var2.anInt1759 & 127) == 64)) {
						if (client.anIntArrayArray2074[var3][var4] == client.anInt2287)
							continue;

						client.anIntArrayArray2074[var3][var4] = client.anInt2287;
					}

					if (!var2.aClass131_Sub20_Sub6_1978.aBool1483)
						var5 -= Integer.MIN_VALUE;

					Class65.aClass33_595.method155(Class39.anInt410, var2.anInt1718, var2.anInt1759,
							Class18.method88(var2.anInt1718 + ((var2.anInt1706 * 64) - 64),
									var2.anInt1759 + ((var2.anInt1706 * 64) - 64), Class39.anInt410),
							((var2.anInt1706 * 64) - 64) + 60, var2, var2.anInt1762, var5, var2.aBool1738);
				}
			}
		}

	}

	void method764(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.readUByte();
			if (var2 == 0)
				return;

			method762(var1, var2);
		}
	}

	static Class50[] method765() {
		return new Class50[] { Class50.aClass50_493, Class50.aClass50_489, Class50.aClass50_488, Class50.aClass50_490 };
	}
}
