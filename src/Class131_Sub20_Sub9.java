public class Class131_Sub20_Sub9 extends Class131_Sub20 {
	public int anInt1509;
	static Class100 aClass100_1517;
	static Class100 aClass100_1535;
	public String aString1528 = "null";
	int[] anIntArray1505;
	int[] anIntArray1507;
	public int anInt1511 = 1;
	public int anInt1503 = 1;
	public int anInt1519 = 2;
	public boolean aBool1520 = true;
	public int anInt1521 = -1;
	int anInt1522 = -1;
	boolean aBool1523 = false;
	public boolean aBool1524 = false;
	public int anInt1525 = -1;
	public int anInt1526 = 16;
	int anInt1527 = 0;
	int anInt1510 = 0;
	short[] aShortArray1541;
	short[] aShortArray1514;
	short[] aShortArray1515;
	short[] aShortArray1512;
	public int anInt1530 = -1;
	boolean aBool1518 = false;
	public boolean aBool1533 = true;
	int anInt1534 = 128;
	int anInt1546 = 128;
	int anInt1536 = 128;
	public int anInt1531 = -1;
	int anInt1502 = 0;
	int anInt1538 = 0;
	int anInt1539 = 0;
	public boolean aBool1543 = false;
	boolean aBool1537 = false;
	public int anInt1542 = -1;
	int anInt1544 = -1;
	public int anInt1547 = -1;
	public int anInt1501 = 0;
	int anInt1545 = -1;
	public int anInt1548 = 0;
	public int anInt1549 = 0;
	public int[] anIntArray1550;
	public int[] anIntArray1513;
	static boolean aBool1540 = false;
	public static Class121 aClass121_1504 = new Class121(64);
	public static Class121 aClass121_1532 = new Class121(500);
	public static Class121 aClass121_1506 = new Class121(30);
	public static Class121 aClass121_1516 = new Class121(30);
	static Class131_Sub20_Sub19_Sub6[] aClass131_Sub20_Sub19_Sub6Array1508 = new Class131_Sub20_Sub19_Sub6[4];
	public String[] aStringArray1529 = new String[5];

	void method750(final DataBuffer var1, final int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.method595();
			if (var3 > 0)
				if ((anIntArray1507 != null) && !aBool1540)
					var1.pos += 3 * var3;
				else {
					anIntArray1505 = new int[var3];
					anIntArray1507 = new int[var3];

					for (var4 = 0; var4 < var3; ++var4) {
						anIntArray1507[var4] = var1.readUShort();
						anIntArray1505[var4] = var1.method595();
					}
				}
		} else if (var2 == 2)
			aString1528 = var1.method638();
		else if (var2 == 5) {
			var3 = var1.method595();
			if (var3 > 0)
				if ((null != anIntArray1507) && !aBool1540)
					var1.pos += 2 * var3;
				else {
					anIntArray1505 = null;
					anIntArray1507 = new int[var3];

					for (var4 = 0; var4 < var3; ++var4)
						anIntArray1507[var4] = var1.readUShort();
				}
		} else if (var2 == 14)
			anInt1511 = var1.method595();
		else if (var2 == 15)
			anInt1503 = var1.method595();
		else if (var2 == 17) {
			anInt1519 = 0;
			aBool1520 = false;
		} else if (var2 == 18)
			aBool1520 = false;
		else if (var2 == 19)
			anInt1521 = var1.method595();
		else if (var2 == 21)
			anInt1522 = 0;
		else if (var2 == 22)
			aBool1523 = true;
		else if (var2 == 23)
			aBool1524 = true;
		else if (var2 == 24) {
			anInt1525 = var1.readUShort();
			if (anInt1525 == '\uffff')
				anInt1525 = -1;
		} else if (var2 == 27)
			anInt1519 = 1;
		else if (var2 == 28)
			anInt1526 = var1.method595();
		else if (var2 == 29)
			anInt1527 = var1.method584();
		else if (var2 == 39)
			anInt1510 = var1.method584() * 25;
		else if ((var2 >= 30) && (var2 < 35)) {
			aStringArray1529[var2 - 30] = var1.method638();
			if (aStringArray1529[var2 - 30].equalsIgnoreCase("Hidden"))
				aStringArray1529[var2 - 30] = null;
		} else if (var2 == 40) {
			var3 = var1.method595();
			aShortArray1541 = new short[var3];
			aShortArray1514 = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				aShortArray1541[var4] = (short) var1.readUShort();
				aShortArray1514[var4] = (short) var1.readUShort();
			}
		} else if (var2 == 41) {
			var3 = var1.method595();
			aShortArray1515 = new short[var3];
			aShortArray1512 = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				aShortArray1515[var4] = (short) var1.readUShort();
				aShortArray1512[var4] = (short) var1.readUShort();
			}
		} else if (var2 == 60)
			anInt1530 = var1.readUShort();
		else if (var2 == 62)
			aBool1518 = true;
		else if (var2 == 64)
			aBool1533 = false;
		else if (var2 == 65)
			anInt1534 = var1.readUShort();
		else if (var2 == 66)
			anInt1546 = var1.readUShort();
		else if (var2 == 67)
			anInt1536 = var1.readUShort();
		else if (var2 == 68)
			anInt1531 = var1.readUShort();
		else if (var2 == 69)
			var1.method595();
		else if (var2 == 70)
			anInt1502 = var1.readShort();
		else if (var2 == 71)
			anInt1538 = var1.readShort();
		else if (var2 == 72)
			anInt1539 = var1.readShort();
		else if (var2 == 73)
			aBool1543 = true;
		else if (var2 == 74)
			aBool1537 = true;
		else if (var2 == 75)
			anInt1542 = var1.method595();
		else if (var2 == 77) {
			anInt1544 = var1.readUShort();
			if (anInt1544 == '\uffff')
				anInt1544 = -1;

			anInt1545 = var1.readUShort();
			if (anInt1545 == '\uffff')
				anInt1545 = -1;

			var3 = var1.method595();
			anIntArray1513 = new int[var3 + 1];

			for (var4 = 0; var4 <= var3; ++var4) {
				anIntArray1513[var4] = var1.readUShort();
				if (anIntArray1513[var4] == '\uffff')
					anIntArray1513[var4] = -1;
			}
		} else if (var2 == 78) {
			anInt1547 = var1.readUShort();
			anInt1501 = var1.method595();
		} else if (var2 == 79) {
			anInt1548 = var1.readUShort();
			anInt1549 = var1.readUShort();
			anInt1501 = var1.method595();
			var3 = var1.method595();
			anIntArray1550 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1550[var4] = var1.readUShort();
		} else if (var2 == 81)
			anInt1522 = var1.method595() * 256;

	}

	public final boolean method751() {
		if (null == anIntArray1507)
			return true;
		else {
			boolean var2 = true;

			for (final int element : anIntArray1507)
				var2 &= aClass100_1517.method404(element & '\uffff', 0);

			return var2;
		}
	}

	public final Class131_Sub20_Sub19_Sub7 method752(final int var1, final int var2, final int[][] var3, final int var4,
			final int var5, final int var6) {
		long var7;
		if (anIntArray1505 != null)
			var7 = var2 + (var1 << 3) + (anInt1509 << 10);
		else
			var7 = (anInt1509 << 10) + var2;

		Class131_Sub20_Sub19_Sub7 var9 = (Class131_Sub20_Sub19_Sub7) aClass121_1516.method482(var7);
		if (null == var9) {
			final Class131_Sub20_Sub19_Sub6 var10 = method756(var1, var2);
			if (var10 == null)
				return null;

			var9 = var10.method1001(anInt1527 + 64, anInt1510 + 768, -50, -10, -50);
			aClass121_1516.method479(var9, var7);
		}

		if (anInt1522 >= 0)
			var9 = var9.method1025(var3, var4, var5, var6, true, anInt1522);

		return var9;
	}

	public final Class131_Sub20_Sub19_Sub7 method753(final int var1, final int var2, final int[][] var3, final int var4,
			final int var5, final int var6, final Class131_Sub20_Sub1 var7, final int var8) {
		long var11;
		if (anIntArray1505 == null)
			var11 = (anInt1509 << 10) + var2;
		else
			var11 = var2 + (var1 << 3) + (anInt1509 << 10);

		Class131_Sub20_Sub19_Sub7 var10 = (Class131_Sub20_Sub19_Sub7) aClass121_1516.method482(var11);
		if (var10 == null) {
			final Class131_Sub20_Sub19_Sub6 var9 = method756(var1, var2);
			if (null == var9)
				return null;

			var10 = var9.method1001(anInt1527 + 64, anInt1510 + 768, -50, -10, -50);
			aClass121_1516.method479(var10, var11);
		}

		if ((var7 == null) && (anInt1522 == -1))
			return var10;
		else {
			if (null != var7)
				var10 = var7.method682(var10, var8, var2);
			else
				var10 = var10.method1012(true);

			if (anInt1522 >= 0)
				var10 = var10.method1025(var3, var4, var5, var6, false, anInt1522);

			return var10;
		}
	}

	public final Class131_Sub20_Sub9 method754() {
		int var1 = -1;
		if (anInt1544 != -1)
			var1 = Class84.method369(anInt1544, 221835116);
		else if (anInt1545 != -1)
			var1 = Class96.anIntArray766[anInt1545];

		return (var1 >= 0) && (var1 < anIntArray1513.length) && (anIntArray1513[var1] != -1)
				? Class83.method362(anIntArray1513[var1]) : null;
	}

	public boolean method755() {
		if (null == anIntArray1513)
			return (anInt1547 != -1) || (null != anIntArray1550);
		else {
			for (final int element : anIntArray1513)
				if (element != -1) {
					final Class131_Sub20_Sub9 var1 = Class83.method362(element);
					if ((var1.anInt1547 != -1) || (null != var1.anIntArray1550))
						return true;
				}

			return false;
		}
	}

	final Class131_Sub20_Sub19_Sub6 method756(final int var1, int var2) {
		Class131_Sub20_Sub19_Sub6 var3 = null;
		int var4;
		int var5;
		boolean var7;
		if (null == anIntArray1505) {
			if (var1 != 10)
				return null;

			if (anIntArray1507 == null)
				return null;

			var7 = aBool1518;
			if ((var1 == 2) && (var2 > 3))
				var7 = !var7;

			var4 = anIntArray1507.length;

			for (int var8 = 0; var8 < var4; ++var8) {
				var5 = anIntArray1507[var8];
				if (var7)
					var5 += 65536;

				var3 = (Class131_Sub20_Sub19_Sub6) aClass121_1532.method482(var5);
				if (var3 == null) {
					var3 = Class131_Sub20_Sub19_Sub6.method993(aClass100_1517, var5 & '\uffff', 0);
					if (var3 == null)
						return null;

					if (var7)
						var3.method996();

					aClass121_1532.method479(var3, var5);
				}

				if (var4 > 1)
					aClass131_Sub20_Sub19_Sub6Array1508[var8] = var3;
			}

			if (var4 > 1)
				var3 = new Class131_Sub20_Sub19_Sub6(aClass131_Sub20_Sub19_Sub6Array1508, var4);
		} else {
			int var10 = -1;

			for (var4 = 0; var4 < anIntArray1505.length; ++var4)
				if (anIntArray1505[var4] == var1) {
					var10 = var4;
					break;
				}

			if (var10 == -1)
				return null;

			var4 = anIntArray1507[var10];
			final boolean var11 = aBool1518 ^ (var2 > 3);
			if (var11)
				var4 += 65536;

			var3 = (Class131_Sub20_Sub19_Sub6) aClass121_1532.method482(var4);
			if (var3 == null) {
				var3 = Class131_Sub20_Sub19_Sub6.method993(aClass100_1517, var4 & '\uffff', 0);
				if (null == var3)
					return null;

				if (var11)
					var3.method996();

				aClass121_1532.method479(var3, var4);
			}
		}

		if ((anInt1534 == 128) && (anInt1546 == 128) && (anInt1536 == 128))
			var7 = false;
		else
			var7 = true;

		boolean var9;
		if ((anInt1502 == 0) && (anInt1538 == 0) && (anInt1539 == 0))
			var9 = false;
		else
			var9 = true;

		final Class131_Sub20_Sub19_Sub6 var6 = new Class131_Sub20_Sub19_Sub6(var3, (var2 == 0) && !var7 && !var9,
				null == aShortArray1541, null == aShortArray1515, true);
		if ((var1 == 4) && (var2 > 3)) {
			var6.method1008(256);
			var6.method1009(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1)
			var6.method991();
		else if (var2 == 2)
			var6.method1006();
		else if (var2 == 3)
			var6.method992();

		if (null != aShortArray1541)
			for (var5 = 0; var5 < aShortArray1541.length; ++var5)
				var6.method1010(aShortArray1541[var5], aShortArray1514[var5]);

		if (null != aShortArray1515)
			for (var5 = 0; var5 < aShortArray1515.length; ++var5)
				var6.method1004(aShortArray1515[var5], aShortArray1512[var5]);

		if (var7)
			var6.method997(anInt1534, anInt1546, anInt1536);

		if (var9)
			var6.method1009(anInt1502, anInt1538, anInt1539);

		return var6;
	}

	void method757(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.method595();
			if (var2 == 0)
				return;

			method750(var1, var2);
		}
	}

	public final Class131_Sub20_Sub19 method758(final int var1, final int var2, final int[][] var3, final int var4,
			final int var5, final int var6) {
		long var8;
		if (null == anIntArray1505)
			var8 = var2 + (anInt1509 << 10);
		else
			var8 = (anInt1509 << 10) + (var1 << 3) + var2;

		Object var10 = aClass121_1506.method482(var8);
		if (var10 == null) {
			final Class131_Sub20_Sub19_Sub6 var7 = method756(var1, var2);
			if (null == var7)
				return null;

			if (!aBool1523)
				var10 = var7.method1001(anInt1527 + 64, 768 + anInt1510, -50, -10, -50);
			else {
				var7.aShort1862 = (short) (64 + anInt1527);
				var7.aShort1841 = (short) (anInt1510 + 768);
				var7.method998();
				var10 = var7;
			}

			aClass121_1506.method479((Class131_Sub20) var10, var8);
		}

		if (aBool1523)
			var10 = ((Class131_Sub20_Sub19_Sub6) var10).method1005();

		if (anInt1522 >= 0)
			if (var10 instanceof Class131_Sub20_Sub19_Sub7)
				var10 = ((Class131_Sub20_Sub19_Sub7) var10).method1025(var3, var4, var5, var6, true, anInt1522);
			else if (var10 instanceof Class131_Sub20_Sub19_Sub6)
				var10 = ((Class131_Sub20_Sub19_Sub6) var10).method995(var3, var4, var5, var6, true, anInt1522);

		return (Class131_Sub20_Sub19) var10;
	}

	void method759() {
		if (anInt1521 == -1) {
			anInt1521 = 0;
			if ((null != anIntArray1507) && ((anIntArray1505 == null) || (anIntArray1505[0] == 10)))
				anInt1521 = 1;

			for (int var1 = 0; var1 < 5; ++var1)
				if (null != aStringArray1529[var1])
					anInt1521 = 1;
		}

		if (anInt1542 == -1)
			anInt1542 = anInt1519 != 0 ? 1 : 0;

	}

	public final boolean method760(final int var1) {
		if (anIntArray1505 != null) {
			for (int var4 = 0; var4 < anIntArray1505.length; ++var4)
				if (anIntArray1505[var4] == var1)
					return aClass100_1517.method404(anIntArray1507[var4] & '\uffff', 0);

			return true;
		} else if (anIntArray1507 == null)
			return true;
		else if (var1 != 10)
			return true;
		else {
			boolean var2 = true;

			for (final int element : anIntArray1507)
				var2 &= aClass100_1517.method404(element & '\uffff', 0);

			return var2;
		}
	}

	static final void method761(final Class131_Sub4 var0) {
		var0.aBool996 = false;
		if (null != var0.aClass131_Sub2_995)
			var0.aClass131_Sub2_995.anInt991 = 0;

		for (Class131_Sub4 var1 = var0.method539(); null != var1; var1 = var0.method543())
			method761(var1);

	}
}
