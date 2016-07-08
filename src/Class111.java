public class Class111 {
	int anInt825;
	int anInt821;
	int[] anIntArray818;
	long aLong822;
	int[] anIntArray819;
	int[] anIntArray824;
	int[] anIntArray820;
	DataBuffer aClass131_Sub14_826 = new DataBuffer((byte[]) null);
	static byte[] aByteArray823 = new byte[] { (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1,
			(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
			(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
			(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0,
			(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
			(byte) 0 };

	void method437(final byte[] var1) {
		aClass131_Sub14_826.data = var1;
		aClass131_Sub14_826.pos = 10;
		final int var2 = aClass131_Sub14_826.readUShort();
		anInt825 = aClass131_Sub14_826.readUShort();
		anInt821 = 500000;
		anIntArray818 = new int[var2];

		int var3;
		int var5;
		for (var3 = 0; var3 < var2; aClass131_Sub14_826.pos += var5) {
			final int var4 = aClass131_Sub14_826.readIntV1();
			var5 = aClass131_Sub14_826.readIntV1();
			if (var4 == 1297379947) {
				anIntArray818[var3] = aClass131_Sub14_826.pos;
				++var3;
			}
		}

		aLong822 = 0L;
		anIntArray819 = new int[var2];

		for (var3 = 0; var3 < var2; ++var3)
			anIntArray819[var3] = anIntArray818[var3];

		anIntArray824 = new int[var2];
		anIntArray820 = new int[var2];
	}

	Class111(final byte[] var1) {
		method437(var1);
	}

	void method438(final int var1) {
		anIntArray819[var1] = aClass131_Sub14_826.pos;
	}

	void method439() {
		aClass131_Sub14_826.pos = -1;
	}

	void method440(final int var1) {
		final int var2 = aClass131_Sub14_826.method607();
		anIntArray824[var1] += var2;
	}

	int method441(final int var1) {
		final int var2 = method443(var1);
		return var2;
	}

	int method442() {
		return anIntArray819.length;
	}

	int method443(final int var1) {
		final byte var2 = aClass131_Sub14_826.data[aClass131_Sub14_826.pos];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			anIntArray820[var1] = var5;
			++aClass131_Sub14_826.pos;
		} else
			var5 = anIntArray820[var1];

		if ((var5 != 240) && (var5 != 247))
			return method448(var1, var5);
		else {
			final int var4 = aClass131_Sub14_826.method607();
			if ((var5 == 247) && (var4 > 0)) {
				final int var3 = aClass131_Sub14_826.data[aClass131_Sub14_826.pos] & 255;
				if (((var3 >= 241) && (var3 <= 243)) || (var3 == 246) || (var3 == 248)
						|| ((var3 >= 250) && (var3 <= 252)) || (var3 == 254)) {
					++aClass131_Sub14_826.pos;
					anIntArray820[var1] = var3;
					return method448(var1, var3);
				}
			}

			aClass131_Sub14_826.pos += var4;
			return 0;
		}
	}

	boolean method444() {
		final int var1 = anIntArray819.length;

		for (int var2 = 0; var2 < var1; ++var2)
			if (anIntArray819[var2] >= 0)
				return false;

		return true;
	}

	void method445(final long var1) {
		aLong822 = var1;
		final int var3 = anIntArray819.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			anIntArray824[var4] = 0;
			anIntArray820[var4] = 0;
			aClass131_Sub14_826.pos = anIntArray818[var4];
			method440(var4);
			anIntArray819[var4] = aClass131_Sub14_826.pos;
		}

	}

	void method446(final int var1) {
		aClass131_Sub14_826.pos = anIntArray819[var1];
	}

	Class111() {
	}

	void method447() {
		aClass131_Sub14_826.data = null;
		anIntArray818 = null;
		anIntArray819 = null;
		anIntArray824 = null;
		anIntArray820 = null;
	}

	int method448(final int var1, final int var2) {
		int var3;
		if (var2 == 255) {
			final int var7 = aClass131_Sub14_826.method595();
			var3 = aClass131_Sub14_826.method607();
			if (var7 == 47) {
				aClass131_Sub14_826.pos += var3;
				return 1;
			} else if (var7 == 81) {
				final int var6 = aClass131_Sub14_826.method598();
				var3 -= 3;
				final int var5 = anIntArray824[var1];
				aLong822 += (long) var5 * (long) (anInt821 - var6);
				anInt821 = var6;
				aClass131_Sub14_826.pos += var3;
				return 2;
			} else {
				aClass131_Sub14_826.pos += var3;
				return 3;
			}
		} else {
			final byte var4 = aByteArray823[var2 - 128];
			var3 = var2;
			if (var4 >= 1)
				var3 = var2 | (aClass131_Sub14_826.method595() << 8);

			if (var4 >= 2)
				var3 |= aClass131_Sub14_826.method595() << 16;

			return var3;
		}
	}

	long method449(final int var1) {
		return aLong822 + ((long) var1 * (long) anInt821);
	}

	int method450() {
		final int var1 = anIntArray819.length;
		int var3 = -1;
		int var4 = Integer.MAX_VALUE;

		for (int var2 = 0; var2 < var1; ++var2)
			if ((anIntArray819[var2] >= 0) && (anIntArray824[var2] < var4)) {
				var3 = var2;
				var4 = anIntArray824[var2];
			}

		return var3;
	}

	boolean method451() {
		return aClass131_Sub14_826.data != null;
	}
}
