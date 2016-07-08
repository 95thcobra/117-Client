public class Class8 {
	Class14[] aClass14Array82 = new Class14[10];
	int anInt84;
	int anInt83;

	Class8(final DataBuffer var1) {
		for (int var2 = 0; var2 < 10; ++var2) {
			final int var3 = var1.readUByte();
			if (var3 != 0) {
				--var1.pos;
				aClass14Array82[var2] = new Class14();
				aClass14Array82[var2].method56(var1);
			}
		}

		anInt84 = var1.readUShort();
		anInt83 = var1.readUShort();
	}

	public Class131_Sub2_Sub1 method38() {
		final byte[] var1 = method40();
		return new Class131_Sub2_Sub1(22050, var1, (22050 * anInt84) / 1000, (22050 * anInt83) / 1000);
	}

	public final int method39() {
		int var1 = 9999999;

		int var2;
		for (var2 = 0; var2 < 10; ++var2)
			if ((aClass14Array82[var2] != null) && ((aClass14Array82[var2].anInt134 / 20) < var1))
				var1 = aClass14Array82[var2].anInt134 / 20;

		if ((anInt84 < anInt83) && ((anInt84 / 20) < var1))
			var1 = anInt84 / 20;

		if ((var1 != 9999999) && (var1 != 0)) {
			for (var2 = 0; var2 < 10; ++var2)
				if (aClass14Array82[var2] != null)
					aClass14Array82[var2].anInt134 -= var1 * 20;

			if (anInt84 < anInt83) {
				anInt84 -= var1 * 20;
				anInt83 -= var1 * 20;
			}

			return var1;
		} else
			return 0;
	}

	final byte[] method40() {
		int var1 = 0;

		int var6;
		for (var6 = 0; var6 < 10; ++var6)
			if ((aClass14Array82[var6] != null)
					&& ((aClass14Array82[var6].anInt138 + aClass14Array82[var6].anInt134) > var1))
				var1 = aClass14Array82[var6].anInt138 + aClass14Array82[var6].anInt134;

		if (var1 == 0)
			return new byte[0];
		else {
			var6 = (22050 * var1) / 1000;
			final byte[] var2 = new byte[var6];

			for (int var7 = 0; var7 < 10; ++var7)
				if (aClass14Array82[var7] != null) {
					final int var8 = (aClass14Array82[var7].anInt138 * 22050) / 1000;
					final int var4 = (aClass14Array82[var7].anInt134 * 22050) / 1000;
					final int[] var9 = aClass14Array82[var7].method57(var8, aClass14Array82[var7].anInt138);

					for (int var3 = 0; var3 < var8; ++var3) {
						int var5 = var2[var3 + var4] + (var9[var3] >> 8);
						if (((var5 + 128) & -256) != 0)
							var5 = (var5 >> 31) ^ 127;

						var2[var3 + var4] = (byte) var5;
					}
				}

			return var2;
		}
	}

	public static Class8 method41(final Class100 var0, final int var1, final int var2) {
		final byte[] var3 = var0.method402(var1, var2);
		return var3 != null ? new Class8(new DataBuffer(var3)) : null;
	}
}
