public class Class131_Sub20_Sub12 extends Class131_Sub20 {
	public static Class100 aClass100_1561;
	public String aString1566 = "null";
	public int anInt1562 = 0;
	public char aChar1558;
	public char aChar1559;
	public int anInt1564;
	public int[] anIntArray1563;
	public String[] aStringArray1565;
	public int[] anIntArray1560;
	public static Class121 aClass121_1557 = new Class121(64);

	public void method772(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.readUByte();
			if (var2 == 0)
				return;

			method773(var1, var2);
		}
	}

	void method773(final DataBuffer var1, final int var2) {
		if (var2 == 1)
			aChar1558 = (char) var1.readUByte();
		else if (var2 == 2)
			aChar1559 = (char) var1.readUByte();
		else if (var2 == 3)
			aString1566 = var1.readString();
		else if (var2 == 4)
			anInt1564 = var1.readIntV1();
		else {
			int var3;
			if (var2 == 5) {
				anInt1562 = var1.readUShort();
				anIntArray1563 = new int[anInt1562];
				aStringArray1565 = new String[anInt1562];

				for (var3 = 0; var3 < anInt1562; ++var3) {
					anIntArray1563[var3] = var1.readIntV1();
					aStringArray1565[var3] = var1.readString();
				}
			} else if (var2 == 6) {
				anInt1562 = var1.readUShort();
				anIntArray1563 = new int[anInt1562];
				anIntArray1560 = new int[anInt1562];

				for (var3 = 0; var3 < anInt1562; ++var3) {
					anIntArray1563[var3] = var1.readIntV1();
					anIntArray1560[var3] = var1.readIntV1();
				}
			}
		}

	}

	public static final void method774(final int var0, final boolean var1, final int var2) {
		if ((var0 >= 8000) && (var0 <= '\ubb80')) {
			Class17.anInt162 = var0;
			Class17.aBool166 = var1;
			Class17.anInt156 = var2;
		} else
			throw new IllegalArgumentException();
	}

	public static int method775(final int var0, final int var1, int var2, int var3, int var4, final int var5) {
		if ((var5 & 1) == 1) {
			final int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		return var2 == 0 ? var0 : (var2 == 1 ? var1 : (var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1)));
	}
}
