public class Class131_Sub2_Sub1 extends Class131_Sub2 {
	public byte[] aByteArray1597;
	public int anInt1598;
	int anInt1599;
	public int anInt1596;
	public boolean aBool1600;

	public Class131_Sub2_Sub1 method788(final Class18 var1) {
		aByteArray1597 = var1.method84(aByteArray1597);
		anInt1598 = var1.method86(anInt1598);
		if (anInt1596 != anInt1599) {
			anInt1596 = var1.method85(anInt1596);
			anInt1599 = var1.method85(anInt1599);
			if (anInt1596 == anInt1599)
				--anInt1596;
		} else
			anInt1596 = anInt1599 = var1.method85(anInt1596);

		return this;
	}

	Class131_Sub2_Sub1(final int var1, final byte[] var2, final int var3, final int var4, final boolean var5) {
		anInt1598 = var1;
		aByteArray1597 = var2;
		anInt1596 = var3;
		anInt1599 = var4;
		aBool1600 = var5;
	}

	Class131_Sub2_Sub1(final int var1, final byte[] var2, final int var3, final int var4) {
		anInt1598 = var1;
		aByteArray1597 = var2;
		anInt1596 = var3;
		anInt1599 = var4;
	}
}
