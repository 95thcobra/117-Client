public abstract class Class131_Sub20_Sub19_Sub2 extends Class131_Sub20_Sub19 {
	int anInt1704;
	int anInt1715;
	boolean aBool1716;
	int anInt1718;
	int anInt1719;
	int anInt1722;
	int anInt1724;
	int anInt1730;
	int anInt1740;
	int anInt1741;
	int anInt1742;
	static int[][] anIntArrayArray1743;
	int anInt1744;
	int anInt1746;
	int anInt1751;
	int anInt1759;
	static int anInt1760;
	int anInt1762;
	boolean aBool1738 = false;
	int anInt1706 = 1;
	int anInt1707 = -1;
	int anInt1708 = -1;
	int anInt1725 = -1;
	int anInt1710 = -1;
	int anInt1711 = -1;
	int anInt1712 = -1;
	int anInt1713 = -1;
	int anInt1714 = -1;
	String aString1705 = null;
	boolean aBool1717 = false;
	int anInt1761 = 100;
	int anInt1732 = 0;
	int anInt1757 = 0;
	int[] anIntArray1720 = new int[4];
	int[] anIntArray1721 = new int[4];
	int[] anIntArray1749 = new int[4];
	int anInt1723 = -1000;
	int anInt1726 = -1;
	boolean aBool1727 = false;
	int anInt1728 = -1;
	int anInt1729 = -1;
	int anInt1748 = 0;
	int anInt1731 = 0;
	int anInt1703 = -1;
	int anInt1733 = 0;
	int anInt1734 = 0;
	int anInt1735 = 0;
	int anInt1736 = 0;
	int anInt1737 = -1;
	int anInt1702 = 0;
	int anInt1739 = 0;
	int anInt1747 = 0;
	int anInt1750 = 200;
	int anInt1752 = 0;
	int anInt1753 = 32;
	int anInt1754 = 0;
	int[] anIntArray1755 = new int[10];
	int[] anIntArray1756 = new int[10];
	byte[] aByteArray1709 = new byte[10];
	int anInt1745 = 0;
	int anInt1758 = 0;

	static final void method919(final String var0, final int var1) {
		client.secureBuffer.method871(205);
		client.secureBuffer.writeByte(Class131_Sub6.method554(var0) + 1);
		client.secureBuffer.writeStr(var0);
		client.secureBuffer.method591(var1);
	}

	boolean method920(final int var1) {
		return false;
	}

	final void method921() {
		anInt1754 = 0;
		anInt1758 = 0;
	}

	static final boolean method922(final int var0) {
		if (var0 >= 0) {
			int var1 = client.anIntArray2066[var0];
			if (var1 >= 2000)
				var1 -= 2000;

			return var1 == 1007;
		} else
			return false;
	}

	public static void method923(final Class100 var0) {
		Class130.aClass100_900 = var0;
	}

	public static void method924() {
		Class131_Sub20_Sub2.aClass121_1377.method481();
	}

	static final void method925(final boolean var0) {
		final int var1 = client.anInt2128;
		final int var2 = Class2.anInt7;
		final int var3 = Class88.anInt723;
		if (Class77.method344(var1))
			Class113.method455(Class131_Sub18.aClass131_Sub18ArrayArray1174[var1], -1, var2, var3, var0);

	}

	final void method926(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < 4; ++var4)
			if (anIntArray1749[var4] <= var3) {
				anIntArray1720[var4] = var1;
				anIntArray1721[var4] = var2;
				anIntArray1749[var4] = 70 + var3;
				return;
			}

	}
}
