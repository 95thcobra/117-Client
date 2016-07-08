import java.net.URL;

public final class Class131_Sub6 extends Class131 {
	int anInt1009;
	int anInt1010;
	int anInt1011;
	Class131_Sub4_Sub1 aClass131_Sub4_Sub1_1012;
	int anInt1014;
	int anInt1020;
	int anInt1021;
	Class131_Sub20_Sub9 aClass131_Sub20_Sub9_1022;
	static Class86 aClass86_1023;
	int anInt1015;
	int anInt1008;
	int anInt1017;
	int anInt1018;
	int[] anIntArray1019;
	Class131_Sub4_Sub1 aClass131_Sub4_Sub1_1016;
	static Class115 aClass115_1013 = new Class115();

	static boolean method550() {
		try {
			if (null == Class109.aClass49_813)
				Class109.aClass49_813 = new Class49(Class36.aClass78_371, new URL(Class21.aString200));
			else {
				final byte[] var0 = Class109.aClass49_813.method257();
				if (null != var0) {
					final DataBuffer var1 = new DataBuffer(var0);
					Class30.anInt274 = var1.readUShort();
					Class30.aClass30Array273 = new Class30[Class30.anInt274];

					Class30 var3;
					for (int var2 = 0; var2 < Class30.anInt274; var3.anInt283 = var2++) {
						var3 = Class30.aClass30Array273[var2] = new Class30();
						var3.anInt278 = var1.readUShort();
						var3.anInt279 = var1.readIntV1();
						var3.aString281 = var1.readString();
						var3.aString272 = var1.readString();
						var3.anInt286 = var1.readUByte();
						var3.anInt276 = var1.readShort();
					}

					Class137.method506(Class30.aClass30Array273, 0, Class30.aClass30Array273.length - 1,
							Class30.anIntArray277, Class30.anIntArray285);
					Class109.aClass49_813 = null;
					return true;
				}
			}
		} catch (final Exception var4) {
			var4.printStackTrace();
			Class109.aClass49_813 = null;
		}

		return false;
	}

	void method551() {
		final int var1 = anInt1015;
		final Class131_Sub20_Sub9 var2 = aClass131_Sub20_Sub9_1022.method754();
		if (null != var2) {
			anInt1015 = var2.anInt1547;
			anInt1008 = var2.anInt1501 * 128;
			anInt1017 = var2.anInt1548;
			anInt1018 = var2.anInt1549;
			anIntArray1019 = var2.anIntArray1550;
		} else {
			anInt1015 = -1;
			anInt1008 = 0;
			anInt1017 = 0;
			anInt1018 = 0;
			anIntArray1019 = null;
		}

		if ((var1 != anInt1015) && (aClass131_Sub4_Sub1_1016 != null)) {
			Class61.aClass131_Sub4_Sub2_578.method833(aClass131_Sub4_Sub1_1016);
			aClass131_Sub4_Sub1_1016 = null;
		}

	}

	static final void method552(final Class131_Sub9 var0) {
		int var1 = 0;
		int var2 = -1;
		int var4 = 0;
		int var3 = 0;
		if (var0.anInt1053 == 0)
			var1 = Class65.aClass33_595.method167(var0.anInt1052, var0.anInt1045, var0.anInt1043);

		if (var0.anInt1053 == 1)
			var1 = Class65.aClass33_595.method159(var0.anInt1052, var0.anInt1045, var0.anInt1043);

		if (var0.anInt1053 == 2)
			var1 = Class65.aClass33_595.method191(var0.anInt1052, var0.anInt1045, var0.anInt1043);

		if (var0.anInt1053 == 3)
			var1 = Class65.aClass33_595.method149(var0.anInt1052, var0.anInt1045, var0.anInt1043);

		if (var1 != 0) {
			final int var5 = Class65.aClass33_595.method187(var0.anInt1052, var0.anInt1045, var0.anInt1043, var1);
			var2 = (var1 >> 14) & 32767;
			var4 = var5 & 31;
			var3 = (var5 >> 6) & 3;
		}

		var0.anInt1046 = var2;
		var0.anInt1055 = var4;
		var0.anInt1047 = var3;
	}

	static final void method553(final Class131_Sub7 var0, final boolean var1) {
		final int var2 = var0.anInt1025;
		final int var3 = (int) var0.aLong902;
		var0.method501();
		if (var1 && (var2 != -1) && Class131_Sub18.aBoolArray1148[var2]) {
			Class131_Sub18.aClass100_1206.method410(var2);
			if (null != Class131_Sub18.aClass131_Sub18ArrayArray1174[var2]) {
				boolean var5 = true;

				for (int var6 = 0; var6 < Class131_Sub18.aClass131_Sub18ArrayArray1174[var2].length; ++var6)
					if (null != Class131_Sub18.aClass131_Sub18ArrayArray1174[var2][var6])
						if (Class131_Sub18.aClass131_Sub18ArrayArray1174[var2][var6].anInt1202 != 2)
							Class131_Sub18.aClass131_Sub18ArrayArray1174[var2][var6] = null;
						else
							var5 = false;

				if (var5)
					Class131_Sub18.aClass131_Sub18ArrayArray1174[var2] = null;

				Class131_Sub18.aBoolArray1148[var2] = false;
			}
		}

		for (InterfaceSetting var4 = (InterfaceSetting) client.aClass114_2225
				.method460(); var4 != null; var4 = (InterfaceSetting) client.aClass114_2225.method458())
			if (var2 == ((var4.aLong902 >> 48) & 65535L))
				var4.method501();

		final Class131_Sub18 var7 = Class88.method377(var3);
		if (null != var7)
			Class131_Sub20_Sub6.method734(var7);

		Class123.method484();
		if (client.anInt2128 != -1)
			Class131_Sub20_Sub19_Sub2_Sub1.method1065(client.anInt2128, 1);

	}

	public static int method554(final String var0) {
		return var0.length() + 1;
	}
}
