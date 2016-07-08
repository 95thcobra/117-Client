public final class Class131_Sub20_Sub17_Sub4_Sub1 extends Class131_Sub20_Sub17_Sub4 {
	@Override
	final void method1059(final byte[] var1, int var2, int var3, int var4, int var5, final int var6, final int var7) {
		int var8 = var2 + (var3 * anInt1627);
		int var12 = anInt1627 - var4;
		int var9 = 0;
		int var11 = 0;
		int var10;
		if (var3 < anInt1630) {
			var10 = anInt1630 - var3;
			var5 -= var10;
			var3 = anInt1630;
			var11 += var10 * var4;
			var8 += var10 * anInt1627;
		}

		if ((var3 + var5) > anInt1631)
			var5 -= (var3 + var5) - anInt1631;

		if (var2 < anInt1632) {
			var10 = anInt1632 - var2;
			var4 -= var10;
			var2 = anInt1632;
			var11 += var10;
			var8 += var10;
			var9 += var10;
			var12 += var10;
		}

		if ((var2 + var4) > anInt1628) {
			var10 = (var2 + var4) - anInt1628;
			var4 -= var10;
			var9 += var10;
			var12 += var10;
		}

		if ((var4 > 0) && (var5 > 0))
			method1044(anIntArray1629, var1, var6, var11, var8, var4, var5, var12, var9, var7);
	}

	public Class131_Sub20_Sub17_Sub4_Sub1(final byte[] var1) {
		super(var1);
	}

	@Override
	final void method1050(final byte[] var1, int var2, int var3, int var4, int var5, final int var6) {
		int var7 = var2 + (var3 * anInt1627);
		int var11 = anInt1627 - var4;
		int var8 = 0;
		int var10 = 0;
		int var9;
		if (var3 < anInt1630) {
			var9 = anInt1630 - var3;
			var5 -= var9;
			var3 = anInt1630;
			var10 += var9 * var4;
			var7 += var9 * anInt1627;
		}

		if ((var3 + var5) > anInt1631)
			var5 -= (var3 + var5) - anInt1631;

		if (var2 < anInt1632) {
			var9 = anInt1632 - var2;
			var4 -= var9;
			var2 = anInt1632;
			var10 += var9;
			var7 += var9;
			var8 += var9;
			var11 += var9;
		}

		if ((var2 + var4) > anInt1628) {
			var9 = (var2 + var4) - anInt1628;
			var4 -= var9;
			var8 += var9;
			var11 += var9;
		}

		if ((var4 > 0) && (var5 > 0))
			method1051(anIntArray1629, var1, var6, var10, var7, var4, var5, var11, var8);
	}

	public Class131_Sub20_Sub17_Sub4_Sub1(final byte[] var1, final int[] var2, final int[] var3, final int[] var4,
			final int[] var5, final int[] var6, final byte[][] var7) {
		super(var1, var2, var3, var4, var5, var6, var7);
	}
}
