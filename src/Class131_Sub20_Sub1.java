public class Class131_Sub20_Sub1 extends Class131_Sub20 {
	public static Class100 aClass100_1352;
	public static Class100 aClass100_1354;
	static Class131_Sub18 aClass131_Sub18_1356;
	public static Class100 aClass100_1365;
	static int anInt1370;
	static int anInt1371;
	public int[] anIntArray1358;
	public int anInt1368 = -1;
	int[] anIntArray1361;
	public int[] anIntArray1353;
	public boolean aBool1372 = false;
	public int anInt1363 = 5;
	public int anInt1364 = -1;
	public int anInt1360 = -1;
	public int anInt1366 = 99;
	public int anInt1362 = -1;
	public int anInt1351 = -1;
	public int anInt1369 = 2;
	int[] anIntArray1357;
	public int[] anIntArray1359;
	public static Class121 aClass121_1367 = new Class121(64);
	public static Class121 aClass121_1355 = new Class121(100);

	void method680(final DataBuffer var1, final int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var4 = var1.readUShort();
			anIntArray1358 = new int[var4];

			for (var3 = 0; var3 < var4; ++var3)
				anIntArray1358[var3] = var1.readUShort();

			anIntArray1353 = new int[var4];

			for (var3 = 0; var3 < var4; ++var3)
				anIntArray1353[var3] = var1.readUShort();

			for (var3 = 0; var3 < var4; ++var3)
				anIntArray1353[var3] += var1.readUShort() << 16;
		} else if (var2 == 2)
			anInt1368 = var1.readUShort();
		else if (var2 == 3) {
			var4 = var1.readUByte();
			anIntArray1361 = new int[1 + var4];

			for (var3 = 0; var3 < var4; ++var3)
				anIntArray1361[var3] = var1.readUByte();

			anIntArray1361[var4] = 9999999;
		} else if (var2 == 4)
			aBool1372 = true;
		else if (var2 == 5)
			anInt1363 = var1.readUByte();
		else if (var2 == 6)
			anInt1364 = var1.readUShort();
		else if (var2 == 7)
			anInt1360 = var1.readUShort();
		else if (var2 == 8)
			anInt1366 = var1.readUByte();
		else if (var2 == 9)
			anInt1362 = var1.readUByte();
		else if (var2 == 10)
			anInt1351 = var1.readUByte();
		else if (var2 == 11)
			anInt1369 = var1.readUByte();
		else if (var2 == 12) {
			var4 = var1.readUByte();
			anIntArray1357 = new int[var4];

			for (var3 = 0; var3 < var4; ++var3)
				anIntArray1357[var3] = var1.readUShort();

			for (var3 = 0; var3 < var4; ++var3)
				anIntArray1357[var3] += var1.readUShort() << 16;
		} else if (var2 == 13) {
			var4 = var1.readUByte();
			anIntArray1359 = new int[var4];

			for (var3 = 0; var3 < var4; ++var3)
				anIntArray1359[var3] = var1.method598();
		}

	}

	void method681() {
		if (anInt1362 == -1)
			if (null != anIntArray1361)
				anInt1362 = 2;
			else
				anInt1362 = 0;

		if (anInt1351 == -1)
			if (null != anIntArray1361)
				anInt1351 = 2;
			else
				anInt1351 = 0;

	}

	Class131_Sub20_Sub19_Sub7 method682(final Class131_Sub20_Sub19_Sub7 var1, int var2, int var3) {
		var2 = anIntArray1353[var2];
		final Class131_Sub20_Sub16 var5 = Class67.method314(var2 >> 16);
		var2 &= '\uffff';
		if (var5 == null)
			return var1.method1012(true);
		else {
			final Class131_Sub20_Sub19_Sub7 var4 = var1.method1012(!var5.method841(var2));
			var3 &= 3;
			if (var3 == 1)
				var4.method1019();
			else if (var3 == 2)
				var4.method1032();
			else if (var3 == 3)
				var4.method1028();

			var4.method1027(var5, var2);
			if (var3 == 1)
				var4.method1028();
			else if (var3 == 2)
				var4.method1032();
			else if (var3 == 3)
				var4.method1019();

			return var4;
		}
	}

	public Class131_Sub20_Sub19_Sub7 method683(final Class131_Sub20_Sub19_Sub7 var1, int var2,
			final Class131_Sub20_Sub1 var3, int var4) {
		var2 = anIntArray1353[var2];
		final Class131_Sub20_Sub16 var6 = Class67.method314(var2 >> 16);
		var2 &= '\uffff';
		if (var6 == null)
			return var3.method686(var1, var4);
		else {
			var4 = var3.anIntArray1353[var4];
			final Class131_Sub20_Sub16 var7 = Class67.method314(var4 >> 16);
			var4 &= '\uffff';
			Class131_Sub20_Sub19_Sub7 var5;
			if (var7 == null) {
				var5 = var1.method1012(!var6.method841(var2));
				var5.method1027(var6, var2);
				return var5;
			} else {
				var5 = var1.method1012(!var6.method841(var2) & !var7.method841(var4));
				var5.method1018(var6, var2, var7, var4, anIntArray1361);
				return var5;
			}
		}
	}

	public Class131_Sub20_Sub19_Sub7 method684(final Class131_Sub20_Sub19_Sub7 var1, final int var2) {
		int var3 = anIntArray1353[var2];
		final Class131_Sub20_Sub16 var5 = Class67.method314(var3 >> 16);
		var3 &= '\uffff';
		if (null == var5)
			return var1.method1012(true);
		else {
			Class131_Sub20_Sub16 var7 = null;
			int var6 = 0;
			if ((anIntArray1357 != null) && (var2 < anIntArray1357.length)) {
				var6 = anIntArray1357[var2];
				var7 = Class67.method314(var6 >> 16);
				var6 &= '\uffff';
			}

			Class131_Sub20_Sub19_Sub7 var4;
			if ((null != var7) && (var6 != '\uffff')) {
				var4 = var1.method1012(!var5.method841(var3) & !var7.method841(var6));
				var4.method1027(var5, var3);
				var4.method1027(var7, var6);
				return var4;
			} else {
				var4 = var1.method1012(!var5.method841(var3));
				var4.method1027(var5, var3);
				return var4;
			}
		}
	}

	Class131_Sub20_Sub19_Sub7 method685(final Class131_Sub20_Sub19_Sub7 var1, int var2) {
		var2 = anIntArray1353[var2];
		final Class131_Sub20_Sub16 var3 = Class67.method314(var2 >> 16);
		var2 &= '\uffff';
		if (null == var3)
			return var1.method1013(true);
		else {
			final Class131_Sub20_Sub19_Sub7 var4 = var1.method1013(!var3.method841(var2));
			var4.method1027(var3, var2);
			return var4;
		}
	}

	public Class131_Sub20_Sub19_Sub7 method686(final Class131_Sub20_Sub19_Sub7 var1, int var2) {
		var2 = anIntArray1353[var2];
		final Class131_Sub20_Sub16 var3 = Class67.method314(var2 >> 16);
		var2 &= '\uffff';
		if (null == var3)
			return var1.method1012(true);
		else {
			final Class131_Sub20_Sub19_Sub7 var4 = var1.method1012(!var3.method841(var2));
			var4.method1027(var3, var2);
			return var4;
		}
	}

	void method687(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.readUByte();
			if (var2 == 0)
				return;

			method680(var1, var2);
		}
	}

	public static void method688() {
		Class131_Sub20_Sub2.aClass121_1375.method481();
		Class131_Sub20_Sub2.aClass121_1404.method481();
		Class131_Sub20_Sub2.aClass121_1377.method481();
	}

	static void method689() {
		for (Class131_Sub6 var0 = (Class131_Sub6) Class131_Sub6.aClass115_1013
				.method465(); null != var0; var0 = (Class131_Sub6) Class131_Sub6.aClass115_1013.method468()) {
			if (null != var0.aClass131_Sub4_Sub1_1016) {
				Class61.aClass131_Sub4_Sub2_578.method833(var0.aClass131_Sub4_Sub1_1016);
				var0.aClass131_Sub4_Sub1_1016 = null;
			}

			if (null != var0.aClass131_Sub4_Sub1_1012) {
				Class61.aClass131_Sub4_Sub2_578.method833(var0.aClass131_Sub4_Sub1_1012);
				var0.aClass131_Sub4_Sub1_1012 = null;
			}
		}

		Class131_Sub6.aClass115_1013.method462();
	}
}
