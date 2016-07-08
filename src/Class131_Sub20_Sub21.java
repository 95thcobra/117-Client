public class Class131_Sub20_Sub21 extends Class131_Sub20 {
	static int[] anIntArray1655;
	public int anInt1658;
	public int anInt1659;
	public int[] anIntArray1657;
	public int[] anIntArray1656;

	Class131_Sub20_Sub21(final int var1, final int var2, final int[] var3, final int[] var4, final int var5) {
		anInt1658 = var1;
		anInt1659 = var2;
		anIntArray1657 = var3;
		anIntArray1656 = var4;
	}

	public boolean method881(final int var1, final int var2) {
		if ((var2 >= 0) && (var2 < anIntArray1656.length)) {
			final int var3 = anIntArray1656[var2];
			if ((var1 >= var3) && (var1 <= (var3 + anIntArray1657[var2])))
				return true;
		}

		return false;
	}
}
