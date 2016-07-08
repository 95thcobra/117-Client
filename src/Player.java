public final class Player extends Class131_Sub20_Sub19_Sub2 {
	int anInt1979;
	int anInt1981;
	int anInt1986;
	int anInt1988;
	int anInt1989;
	int anInt1991;
	int anInt1993;
	int anInt1994;
	int anInt1995;
	int anInt1996;
	int anInt1999;
	int anInt2003;
	int anInt2000 = -1;
	int anInt1982 = -1;
	int anInt2001;
	String aString2004;
	int anInt1984;
	int anInt1985;
	boolean aBool1990;
	Class91 aClass91_1980;
	Class131_Sub20_Sub19_Sub7 aClass131_Sub20_Sub19_Sub7_1987;
	String[] aStringArray1983 = new String[3];
	int anInt1998;
	int anInt1992;
	boolean aBool1997;
	boolean aBool2002;

	final void method1068(final DataBuffer var1) {
		var1.pos = 0;
		final int var8 = var1.method595();
		anInt2000 = var1.method584();
		anInt1982 = var1.method584();
		int var2 = -1;
		anInt2001 = 0;
		final int[] var4 = new int[12];

		int var6;
		int var7;
		for (int var5 = 0; var5 < 12; ++var5) {
			var6 = var1.method595();
			if (var6 == 0)
				var4[var5] = 0;
			else {
				var7 = var1.method595();
				var4[var5] = (var6 << 8) + var7;
				if ((var5 == 0) && (var4[0] == '\uffff')) {
					var2 = var1.readUShort();
					break;
				}

				if (var4[var5] >= 512) {
					final int var9 = Class79_Sub1.method645(var4[var5] - 512, (short) 32531).anInt1416;
					if (var9 != 0)
						anInt2001 = var9;
				}
			}
		}

		final int[] var3 = new int[5];

		for (var6 = 0; var6 < 5; ++var6) {
			var7 = var1.method595();
			if ((var7 < 0) || (var7 >= Class131_Sub17.aShortArrayArray1146[var6].length))
				var7 = 0;

			var3[var6] = var7;
		}

		anInt1707 = var1.readUShort();
		if (anInt1707 == '\uffff')
			anInt1707 = -1;

		anInt1708 = var1.readUShort();
		if (anInt1708 == '\uffff')
			anInt1708 = -1;

		anInt1725 = anInt1708;
		anInt1710 = var1.readUShort();
		if (anInt1710 == '\uffff')
			anInt1710 = -1;

		anInt1711 = var1.readUShort();
		if (anInt1711 == '\uffff')
			anInt1711 = -1;

		anInt1712 = var1.readUShort();
		if (anInt1712 == '\uffff')
			anInt1712 = -1;

		anInt1713 = var1.readUShort();
		if (anInt1713 == '\uffff')
			anInt1713 = -1;

		anInt1714 = var1.readUShort();
		if (anInt1714 == '\uffff')
			anInt1714 = -1;

		aString2004 = var1.method638();
		if (this == Class131_Sub11.myPlayer)
			RuntimeException_Sub1.aString1951 = aString2004;

		anInt1984 = var1.method595();
		anInt1985 = var1.readUShort();
		aBool1990 = var1.method595() == 1;
		if ((client.anInt2030 == 0) && (client.playerRights >= 2))
			aBool1990 = false;

		if (null == aClass91_1980)
			aClass91_1980 = new Class91();

		aClass91_1980.method380(var4, var3, var8 == 1, var2);
	}

	int getSize() {
		return (null != aClass91_1980) && (aClass91_1980.anInt733 != -1)
				? Class131_Sub20_Sub20.method879(aClass91_1980.anInt733).anInt1465 : 1;
	}

	final void method1070(final int var1, final int var2, final byte var3) {
		if ((anInt1703 != -1) && (Class131_Sub20_Sub19_Sub2_Sub1.method1066(anInt1703).anInt1351 == 1))
			anInt1703 = -1;

		anInt1728 = -1;
		if ((var1 >= 0) && (var1 < 104) && (var2 >= 0) && (var2 < 104)) {
			if ((anIntArray1755[0] >= 0) && (anIntArray1755[0] < 104) && (anIntArray1756[0] >= 0)
					&& (anIntArray1756[0] < 104)) {
				if (var3 == 2)
					Class5.method27(this, var1, var2, (byte) 2);

				method1072(var1, var2, var3);
			} else
				method1073(var1, var2);
		} else
			method1073(var1, var2);

	}

	static void method1071(final Applet_Sub1 var0) {
		if ((Class81.anInt678 == 1) || (!RuntimeException_Sub1.aBool1954 && (Class81.anInt678 == 4))) {
			final int var2 = 280 + NpcFlags.anInt36;
			if ((Class81.anInt682 >= var2) && (Class81.anInt682 <= (14 + var2)) && (Class81.anInt680 >= 4)
					&& (Class81.anInt680 <= 18)) {
				Class58.method282(0, 0);
				return;
			}

			if ((Class81.anInt682 >= (var2 + 15)) && (Class81.anInt682 <= (80 + var2)) && (Class81.anInt680 >= 4)
					&& (Class81.anInt680 <= 18)) {
				Class58.method282(0, 1);
				return;
			}

			final int var3 = 390 + NpcFlags.anInt36;
			if ((Class81.anInt682 >= var3) && (Class81.anInt682 <= (14 + var3)) && (Class81.anInt680 >= 4)
					&& (Class81.anInt680 <= 18)) {
				Class58.method282(1, 0);
				return;
			}

			if ((Class81.anInt682 >= (15 + var3)) && (Class81.anInt682 <= (80 + var3)) && (Class81.anInt680 >= 4)
					&& (Class81.anInt680 <= 18)) {
				Class58.method282(1, 1);
				return;
			}

			final int var1 = 500 + NpcFlags.anInt36;
			if ((Class81.anInt682 >= var1) && (Class81.anInt682 <= (14 + var1)) && (Class81.anInt680 >= 4)
					&& (Class81.anInt680 <= 18)) {
				Class58.method282(2, 0);
				return;
			}

			if ((Class81.anInt682 >= (15 + var1)) && (Class81.anInt682 <= (80 + var1)) && (Class81.anInt680 >= 4)
					&& (Class81.anInt680 <= 18)) {
				Class58.method282(2, 1);
				return;
			}

			final int var4 = 610 + NpcFlags.anInt36;
			if ((Class81.anInt682 >= var4) && (Class81.anInt682 <= (14 + var4)) && (Class81.anInt680 >= 4)
					&& (Class81.anInt680 <= 18)) {
				Class58.method282(3, 0);
				return;
			}

			if ((Class81.anInt682 >= (var4 + 15)) && (Class81.anInt682 <= (80 + var4)) && (Class81.anInt680 >= 4)
					&& (Class81.anInt680 <= 18)) {
				Class58.method282(3, 1);
				return;
			}

			if ((Class81.anInt682 >= (NpcFlags.anInt36 + 708)) && (Class81.anInt680 >= 4)
					&& (Class81.anInt682 <= (NpcFlags.anInt36 + 708 + 50)) && (Class81.anInt680 <= 20)) {
				NpcFlags.aBool33 = false;
				NpcFlags.aClass131_Sub20_Sub17_Sub3_28.method966(NpcFlags.anInt36, 0);
				Class131_Sub20_Sub20.aClass131_Sub20_Sub17_Sub3_1652.method966(382 + NpcFlags.anInt36, 0);
				Class97.aClass131_Sub20_Sub17_Sub2_775
						.method950((NpcFlags.anInt36 + 382) - (Class97.aClass131_Sub20_Sub17_Sub2_775.anInt1790 / 2), 18);
				return;
			}

			if (NpcFlags.anInt53 != -1) {
				final Class30 var5 = Class30.aClass30Array273[NpcFlags.anInt53];
				Class63.method304(var5);
				NpcFlags.aBool33 = false;
				NpcFlags.aClass131_Sub20_Sub17_Sub3_28.method966(NpcFlags.anInt36, 0);
				Class131_Sub20_Sub20.aClass131_Sub20_Sub17_Sub3_1652.method966(382 + NpcFlags.anInt36, 0);
				Class97.aClass131_Sub20_Sub17_Sub2_775
						.method950((382 + NpcFlags.anInt36) - (Class97.aClass131_Sub20_Sub17_Sub2_775.anInt1790 / 2), 18);
				return;
			}
		}

	}

	@Override
	final boolean method920(final int var1) {
		return null != aClass91_1980;
	}

	@Override
	protected final Class131_Sub20_Sub19_Sub7 method868(final short var1) {
		if (aClass91_1980 == null)
			return null;
		else {
			final Class131_Sub20_Sub1 var3 = (anInt1703 != -1) && (anInt1735 == 0)
					? Class131_Sub20_Sub19_Sub2_Sub1.method1066(anInt1703) : null;
			final Class131_Sub20_Sub1 var4 = (anInt1729 != -1) && !aBool1997
					&& ((anInt1707 != anInt1729) || (var3 == null))
							? Class131_Sub20_Sub19_Sub2_Sub1.method1066(anInt1729) : null;
			Class131_Sub20_Sub19_Sub7 var5 = aClass91_1980.method384(var3, anInt1733, var4, anInt1748);
			if (null == var5)
				return null;
			else {
				var5.method1015();
				anInt1750 = var5.anInt1643;
				Class131_Sub20_Sub19_Sub7 var2;
				Class131_Sub20_Sub19_Sub7[] var6;
				if (!aBool1997 && (anInt1737 != -1) && (anInt1702 != -1)) {
					var2 = Class46.method235(anInt1737).method786(anInt1702);
					if (null != var2) {
						var2.method1020(0, -anInt1722, 0);
						var6 = new Class131_Sub20_Sub19_Sub7[] { var5, var2 };
						var5 = new Class131_Sub20_Sub19_Sub7(var6, 2);
					}
				}

				if (!aBool1997 && (aClass131_Sub20_Sub19_Sub7_1987 != null)) {
					if (client.anInt2038 >= anInt1992)
						aClass131_Sub20_Sub19_Sub7_1987 = null;

					if ((client.anInt2038 >= anInt1998) && (client.anInt2038 < anInt1992)) {
						var2 = aClass131_Sub20_Sub19_Sub7_1987;
						var2.method1020(anInt1989 - anInt1718, anInt1988 - anInt1986, anInt1991 - anInt1759);
						if (anInt1751 == 512) {
							var2.method1028();
							var2.method1028();
							var2.method1028();
						} else if (anInt1751 == 1024) {
							var2.method1028();
							var2.method1028();
						} else if (anInt1751 == 1536)
							var2.method1028();

						var6 = new Class131_Sub20_Sub19_Sub7[] { var5, var2 };
						var5 = new Class131_Sub20_Sub19_Sub7(var6, 2);
						if (anInt1751 == 512)
							var2.method1028();
						else if (anInt1751 == 1024) {
							var2.method1028();
							var2.method1028();
						} else if (anInt1751 == 1536) {
							var2.method1028();
							var2.method1028();
							var2.method1028();
						}

						var2.method1020(anInt1718 - anInt1989, anInt1986 - anInt1988, anInt1759 - anInt1991);
					}
				}

				var5.aBool1912 = true;
				return var5;
			}
		}
	}

	final void method1072(final int var1, final int var2, final byte var3) {
		if (anInt1754 < 9)
			++anInt1754;

		for (int var4 = anInt1754; var4 > 0; --var4) {
			anIntArray1755[var4] = anIntArray1755[var4 - 1];
			anIntArray1756[var4] = anIntArray1756[var4 - 1];
			aByteArray1709[var4] = aByteArray1709[var4 - 1];
		}

		anIntArray1755[0] = var1;
		anIntArray1756[0] = var2;
		aByteArray1709[0] = var3;
	}

	Player() {
		for (int var1 = 0; var1 < 3; ++var1)
			aStringArray1983[var1] = "";

		anInt1984 = 0;
		anInt1985 = 0;
		anInt1998 = 0;
		anInt1992 = 0;
		aBool1997 = false;
		anInt2001 = 0;
		aBool1990 = false;
		aBool2002 = false;
	}

	void method1073(final int var1, final int var2) {
		anInt1754 = 0;
		anInt1758 = 0;
		anInt1745 = 0;
		anIntArray1755[0] = var1;
		anIntArray1756[0] = var2;
		final int var3 = getSize();
		anInt1718 = (128 * anIntArray1755[0]) + (64 * var3);
		anInt1759 = (anIntArray1756[0] * 128) + (var3 * 64);
	}

	static void method1074(final Class131_Sub18 var0, final int var1, final int var2, final boolean var3) {
		final int var4 = var0.anInt1173;
		final int var5 = var0.anInt1291;
		if (var0.anInt1165 == 0)
			var0.anInt1173 = var0.anInt1229;
		else if (var0.anInt1165 == 1)
			var0.anInt1173 = var1 - var0.anInt1229;
		else if (var0.anInt1165 == 2)
			var0.anInt1173 = (var1 * var0.anInt1229) >> 14;

		if (var0.anInt1166 == 0)
			var0.anInt1291 = var0.anInt1266;
		else if (var0.anInt1166 == 1)
			var0.anInt1291 = var2 - var0.anInt1266;
		else if (var0.anInt1166 == 2)
			var0.anInt1291 = (var2 * var0.anInt1266) >> 14;

		if (var0.anInt1165 == 4)
			var0.anInt1173 = (var0.anInt1291 * var0.anInt1179) / var0.anInt1175;

		if (var0.anInt1166 == 4)
			var0.anInt1291 = (var0.anInt1173 * var0.anInt1175) / var0.anInt1179;

		if (client.aBool2269 && (var0.anInt1202 == 0))
			if ((var0.anInt1291 < 5) && (var0.anInt1173 < 5)) {
				var0.anInt1291 = 5;
				var0.anInt1173 = 5;
			} else {
				if (var0.anInt1291 <= 0)
					var0.anInt1291 = 5;

				if (var0.anInt1173 <= 0)
					var0.anInt1173 = 5;
			}

		if (var0.anInt1162 == 1337)
			client.aClass131_Sub18_2198 = var0;

		if (var3 && (null != var0.anObjectArray1259) && ((var0.anInt1173 != var4) || (var0.anInt1291 != var5))) {
			final Class131_Sub10 var6 = new Class131_Sub10();
			var6.aClass131_Sub18_1057 = var0;
			var6.anObjectArray1056 = var0.anObjectArray1259;
			client.aClass115_2222.method471(var6);
		}

	}

	static boolean method1075(final String var0) {
		if (null == var0)
			return false;
		else {
			final String var3 = Class85.method371(var0, client.aClass142_2031);

			for (int var1 = 0; var1 < client.anInt2294; ++var1) {
				final Class36 var2 = client.aClass36Array2295[var1];
				if (var3.equalsIgnoreCase(Class85.method371(var2.aString369, client.aClass142_2031)))
					return true;

				if (var3.equalsIgnoreCase(Class85.method371(var2.aString372, client.aClass142_2031)))
					return true;
			}

			return false;
		}
	}
}
