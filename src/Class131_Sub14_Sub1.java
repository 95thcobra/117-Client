public final class Class131_Sub14_Sub1 extends DataBuffer {
	static Class71 aClass71_1644;
	Class70 aClass70_1645;
	int anInt1646;
	static int[] anIntArray1647 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383,
			32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863,
			134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	public void setIsaacSeed(final int[] var1) {
		aClass70_1645 = new Class70(var1);
	}

	public void method871(final int var1) {
		data[++pos - 1] = (byte) (var1 + aClass70_1645.method325());
	}

	public void bitAccess() {
		anInt1646 = pos * 8;
	}

	public int getBits(int var1) {
		int var2 = anInt1646 >> 3;
		int var3 = 8 - (anInt1646 & 7);
		int var4 = 0;

		for (anInt1646 += var1; var1 > var3; var3 = 8) {
			var4 += (data[var2++] & anIntArray1647[var3]) << (var1 - var3);
			var1 -= var3;
		}

		if (var1 == var3)
			var4 += data[var2] & anIntArray1647[var3];
		else
			var4 += (data[var2] >> (var3 - var1)) & anIntArray1647[var1];

		return var4;
	}

	public int method874(final int var1) {
		return (8 * var1) - anInt1646;
	}

	public int readOpcode() {
		return (data[++pos - 1] - aClass70_1645.method325()) & 255;
	}

	public void method876() {
		pos = (anInt1646 + 7) / 8;
	}

	public Class131_Sub14_Sub1(final int var1) {
		super(var1);
	}

	static void method877(final int var0, final String var1, final String var2, final String var3) {
		Class6 var4 = (Class6) Class32.aMap298.get(Integer.valueOf(var0));
		if (var4 == null) {
			var4 = new Class6();
			Class32.aMap298.put(Integer.valueOf(var0), var4);
		}

		final Class131_Sub20_Sub8 var5 = var4.method32(var0, var1, var2, var3);
		Class32.aClass125_301.method488(var5, var5.anInt1499);
		Class32.aClass124_299.method486(var5);
		client.anInt2217 = client.anInt2298;
	}
}
