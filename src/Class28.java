import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Class28 {
	static Class100_Sub1 aClass100_Sub1_254;
	static Class131_Sub20_Sub17_Sub3[] aClass131_Sub20_Sub17_Sub3Array255;
	static long aLong256;
	static int[][] anIntArrayArray258;
	static byte aByte259;
	static byte[][] aByteArrayArray261;
	int anInt253 = 1;
	LinkedHashMap aLinkedHashMap257 = new LinkedHashMap();
	static int anInt260 = 4;
	boolean aBool251;
	boolean aBool252;

	Class28() {
		method124(true);
	}

	static final void method123() {
		if (Class131_Sub20_Sub19_Sub4.aClass17_1817 != null)
			Class131_Sub20_Sub19_Sub4.aClass17_1817.method75();

		if (Class131_Sub20_Sub6.aClass17_1480 != null)
			Class131_Sub20_Sub6.aClass17_1480.method75();

	}

	void method124(final boolean var1) {
	}

	DataBuffer method125() {
		final DataBuffer var1 = new DataBuffer(100);
		var1.writeByte(anInt260);
		var1.writeByte(aBool251 ? 1 : 0);
		var1.writeByte(aBool252 ? 1 : 0);
		var1.writeByte(anInt253);
		var1.writeByte(aLinkedHashMap257.size());
		final Iterator var2 = aLinkedHashMap257.entrySet().iterator();

		while (var2.hasNext()) {
			final Entry var3 = (Entry) var2.next();
			var1.writeInt(((Integer) var3.getKey()).intValue());
			var1.writeInt(((Integer) var3.getValue()).intValue());
		}

		return var1;
	}

	protected static final void method126() {
		Class63.aClass79_585.method354(-1973561307);

		int var0;
		for (var0 = 0; var0 < 32; ++var0)
			Applet_Sub1.aLongArray2016[var0] = 0L;

		for (var0 = 0; var0 < 32; ++var0)
			Applet_Sub1.aLongArray2014[var0] = 0L;

		Class131_Sub20_Sub15.anInt1604 = 0;
	}

	Class28(final DataBuffer var1) {
		if ((var1 != null) && (null != var1.data)) {
			final int var4 = var1.method595();
			if ((var4 >= 0) && (var4 <= anInt260)) {
				if (var1.method595() == 1)
					aBool251 = true;

				if (var4 > 1)
					aBool252 = var1.method595() == 1;

				if (var4 > 3)
					anInt253 = var1.method595();

				if (var4 > 2) {
					final int var3 = var1.method595();

					for (int var2 = 0; var2 < var3; ++var2) {
						final int var5 = var1.readIntV1();
						final int var6 = var1.readIntV1();
						aLinkedHashMap257.put(Integer.valueOf(var5), Integer.valueOf(var6));
					}
				}
			} else
				method124(true);
		} else
			method124(true);

	}

	public static Class131_Sub20_Sub17_Sub3[] method127(final Class100 var0, final String var1, final String var2) {
		final int var3 = var0.method413(var1);
		final int var5 = var0.method414(var3, var2);
		Class131_Sub20_Sub17_Sub3[] var4;
		if (Class38.method210(var0, var3, var5))
			var4 = LoginEncoder.method200();
		else
			var4 = null;

		return var4;
	}
}
