public class Class131_Sub20_Sub6 extends Class131_Sub20 {
	static Class100 aClass100_1451;
	public int anInt1457;
	static Class100 aClass100_1462;
	static Class17 aClass17_1480;
	static int anInt1488;
	public String aString1463 = "null";
	public int anInt1465 = 1;
	public int anInt1460 = -1;
	public int anInt1461 = -1;
	public int anInt1486 = -1;
	public int anInt1471 = -1;
	public int anInt1464 = -1;
	public int anInt1484 = -1;
	public int anInt1466 = -1;
	public String[] aStringArray1452 = new String[5];
	public boolean aBool1455 = true;
	public int anInt1487 = -1;
	int anInt1473 = 128;
	int anInt1474 = 128;
	public boolean aBool1456 = false;
	int anInt1476 = 0;
	int anInt1477 = 0;
	public int anInt1478 = -1;
	public int anInt1479 = 32;
	int anInt1481 = -1;
	int anInt1482 = -1;
	public boolean aBool1483 = true;
	public boolean aBool1489 = true;
	public boolean aBool1485 = false;
	public int anInt1472 = 30;
	static Class121 aClass121_1453 = new Class121(64);
	static Class121 aClass121_1454 = new Class121(50);
	int[] anIntArray1458;
	short[] aShortArray1467;
	short[] aShortArray1475;
	short[] aShortArray1469;
	short[] aShortArray1470;
	int[] anIntArray1459;
	public int[] anIntArray1468;

	void method728(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.method595();
			if (var2 == 0)
				return;

			method739(var1, var2);
		}
	}

	public final Class131_Sub20_Sub19_Sub7 method729(final Class131_Sub20_Sub1 var1, final int var2,
			final Class131_Sub20_Sub1 var3, final int var4) {
		if (anIntArray1468 != null) {
			final Class131_Sub20_Sub6 var12 = method731();
			return null == var12 ? null : var12.method729(var1, var2, var3, var4);
		} else {
			Class131_Sub20_Sub19_Sub7 var7 = (Class131_Sub20_Sub19_Sub7) aClass121_1454.method482(anInt1457);
			if (null == var7) {
				boolean var8 = false;

				for (int var9 = 0; var9 < anIntArray1458.length; ++var9)
					if (!aClass100_1462.method404(anIntArray1458[var9], 0))
						var8 = true;

				if (var8)
					return null;

				final Class131_Sub20_Sub19_Sub6[] var11 = new Class131_Sub20_Sub19_Sub6[anIntArray1458.length];

				int var6;
				for (var6 = 0; var6 < anIntArray1458.length; ++var6)
					var11[var6] = Class131_Sub20_Sub19_Sub6.method993(aClass100_1462, anIntArray1458[var6], 0);

				Class131_Sub20_Sub19_Sub6 var5;
				if (var11.length == 1)
					var5 = var11[0];
				else
					var5 = new Class131_Sub20_Sub19_Sub6(var11, var11.length);

				if (aShortArray1467 != null)
					for (var6 = 0; var6 < aShortArray1467.length; ++var6)
						var5.method1010(aShortArray1467[var6], aShortArray1475[var6]);

				if (aShortArray1469 != null)
					for (var6 = 0; var6 < aShortArray1469.length; ++var6)
						var5.method1004(aShortArray1469[var6], aShortArray1470[var6]);

				var7 = var5.method1001(64 + anInt1476, 850 + anInt1477, -30, -50, -30);
				aClass121_1454.method479(var7, anInt1457);
			}

			Class131_Sub20_Sub19_Sub7 var10;
			if ((var1 != null) && (var3 != null))
				var10 = var1.method683(var7, var2, var3, var4);
			else if (null != var1)
				var10 = var1.method686(var7, var2);
			else if (null != var3)
				var10 = var3.method686(var7, var4);
			else
				var10 = var7.method1012(true);

			if ((anInt1473 != 128) || (anInt1474 != 128))
				var10.method1011(anInt1473, anInt1474, anInt1473);

			return var10;
		}
	}

	public final Class131_Sub20_Sub19_Sub6 method730() {
		if (null != anIntArray1468) {
			final Class131_Sub20_Sub6 var2 = method731();
			return null == var2 ? null : var2.method730();
		} else if (null == anIntArray1459)
			return null;
		else {
			boolean var4 = false;

			for (int var5 = 0; var5 < anIntArray1459.length; ++var5)
				if (!aClass100_1462.method404(anIntArray1459[var5], 0))
					var4 = true;

			if (var4)
				return null;
			else {
				final Class131_Sub20_Sub19_Sub6[] var6 = new Class131_Sub20_Sub19_Sub6[anIntArray1459.length];

				for (int var7 = 0; var7 < anIntArray1459.length; ++var7)
					var6[var7] = Class131_Sub20_Sub19_Sub6.method993(aClass100_1462, anIntArray1459[var7], 0);

				Class131_Sub20_Sub19_Sub6 var3;
				if (var6.length == 1)
					var3 = var6[0];
				else
					var3 = new Class131_Sub20_Sub19_Sub6(var6, var6.length);

				int var1;
				if (aShortArray1467 != null)
					for (var1 = 0; var1 < aShortArray1467.length; ++var1)
						var3.method1010(aShortArray1467[var1], aShortArray1475[var1]);

				if (aShortArray1469 != null)
					for (var1 = 0; var1 < aShortArray1469.length; ++var1)
						var3.method1004(aShortArray1469[var1], aShortArray1470[var1]);

				return var3;
			}
		}
	}

	public final Class131_Sub20_Sub6 method731() {
		int var1 = -1;
		if (anInt1481 == -1) {
			if (anInt1482 != -1)
				var1 = Class96.anIntArray766[anInt1482];
		} else
			var1 = Class84.method369(anInt1481, -1220919536);

		return (var1 >= 0) && (var1 < anIntArray1468.length) && (anIntArray1468[var1] != -1)
				? Class131_Sub20_Sub20.method879(anIntArray1468[var1]) : null;
	}

	public boolean method732() {
		if (null == anIntArray1468)
			return true;
		else {
			int var1 = -1;
			if (anInt1481 != -1)
				var1 = Class84.method369(anInt1481, -1155624095);
			else if (anInt1482 != -1)
				var1 = Class96.anIntArray766[anInt1482];

			return (var1 >= 0) && (var1 < anIntArray1468.length) && (anIntArray1468[var1] != -1);
		}
	}

	void method733(final int var1) {
	}

	static void method734(final Class131_Sub18 var0) {
		if (client.anInt2227 == var0.anInt1289)
			client.aBoolArray2252[var0.anInt1288] = true;

	}

	static final String method735(final int var0) {
		return var0 >= 999999999 ? "*" : Integer.toString(var0);
	}

	static Class method736(final String var0) throws ClassNotFoundException {
		return var0.equals("B") ? Byte.TYPE
				: (var0.equals("I") ? Integer.TYPE
						: (var0.equals("S") ? Short.TYPE
								: (var0.equals("J") ? Long.TYPE
										: (var0.equals("Z") ? Boolean.TYPE
												: (var0.equals("F") ? Float.TYPE
														: (var0.equals("D") ? Double.TYPE
																: (var0.equals("C") ? Character.TYPE
																		: (var0.equals("void") ? Void.TYPE
																				: Class.forName(var0)))))))));
	}

	public static void method737() {
		Class131_Sub20_Sub14.aClass121_1584.method481();
		Class131_Sub20_Sub14.aClass121_1585.method481();
	}

	public static void method738(final byte var0) {
		if (null != Class80.aClass80_655) {
			final Class80 var1 = Class80.aClass80_655;
			synchronized (var1) {
				Class80.aClass80_655 = null;
			}
		}

	}

	void method739(final DataBuffer var1, final int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var4 = var1.method595();
			anIntArray1458 = new int[var4];

			for (var3 = 0; var3 < var4; ++var3)
				anIntArray1458[var3] = var1.readUShort();
		} else if (var2 == 2)
			aString1463 = var1.method638();
		else if (var2 == 12)
			anInt1465 = var1.method595();
		else if (var2 == 13)
			anInt1460 = var1.readUShort();
		else if (var2 == 14)
			anInt1471 = var1.readUShort();
		else if (var2 == 15)
			anInt1461 = var1.readUShort();
		else if (var2 == 16)
			anInt1486 = var1.readUShort();
		else if (var2 == 17) {
			anInt1471 = var1.readUShort();
			anInt1464 = var1.readUShort();
			anInt1484 = var1.readUShort();
			anInt1466 = var1.readUShort();
		} else if ((var2 >= 30) && (var2 < 35)) {
			aStringArray1452[var2 - 30] = var1.method638();
			if (aStringArray1452[var2 - 30].equalsIgnoreCase("Hidden"))
				aStringArray1452[var2 - 30] = null;
		} else if (var2 == 40) {
			var4 = var1.method595();
			aShortArray1467 = new short[var4];
			aShortArray1475 = new short[var4];

			for (var3 = 0; var3 < var4; ++var3) {
				aShortArray1467[var3] = (short) var1.readUShort();
				aShortArray1475[var3] = (short) var1.readUShort();
			}
		} else if (var2 != 41) {
			if (var2 == 60) {
				var4 = var1.method595();
				anIntArray1459 = new int[var4];

				for (var3 = 0; var3 < var4; ++var3)
					anIntArray1459[var3] = var1.readUShort();
			} else if (var2 == 93)
				aBool1455 = false;
			else if (var2 == 95)
				anInt1487 = var1.readUShort();
			else if (var2 == 97)
				anInt1473 = var1.readUShort();
			else if (var2 == 98)
				anInt1474 = var1.readUShort();
			else if (var2 == 99)
				aBool1456 = true;
			else if (var2 == 100)
				anInt1476 = var1.method584();
			else if (var2 == 101)
				anInt1477 = var1.method584() * 5;
			else if (var2 == 102)
				anInt1478 = var1.readUShort();
			else if (var2 == 103)
				anInt1479 = var1.readUShort();
			else if (var2 == 106) {
				anInt1481 = var1.readUShort();
				if (anInt1481 == '\uffff')
					anInt1481 = -1;

				anInt1482 = var1.readUShort();
				if (anInt1482 == '\uffff')
					anInt1482 = -1;

				var4 = var1.method595();
				anIntArray1468 = new int[1 + var4];

				for (var3 = 0; var3 <= var4; ++var3) {
					anIntArray1468[var3] = var1.readUShort();
					if (anIntArray1468[var3] == '\uffff')
						anIntArray1468[var3] = -1;
				}
			} else if (var2 == 107)
				aBool1483 = false;
			else if (var2 == 109)
				aBool1489 = false;
			else if (var2 == 111)
				aBool1485 = true;
			else if (var2 == 112)
				anInt1472 = var1.method595();
		} else {
			var4 = var1.method595();
			aShortArray1469 = new short[var4];
			aShortArray1470 = new short[var4];

			for (var3 = 0; var3 < var4; ++var3) {
				aShortArray1469[var3] = (short) var1.readUShort();
				aShortArray1470[var3] = (short) var1.readUShort();
			}
		}

	}
}
