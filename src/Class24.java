import java.awt.Component;
import java.util.Comparator;

final class Class24 implements Comparator {
	protected static String aString212;
	public static int anInt213;
	// $FF: synthetic field
	boolean val$preferOwnWorld;

	static Class88[] method110() {
		return new Class88[] { Class88.aClass88_719, Class88.aClass88_718, Class88.aClass88_720, Class88.aClass88_722 };
	}

	int method111(final Class137 var1, final Class137 var2) {
		if (var2.anInt912 == var1.anInt912)
			return 0;
		else {
			if (val$preferOwnWorld) {
				if (var1.anInt912 == client.anInt2123)
					return -1;

				if (var2.anInt912 == client.anInt2123)
					return 1;
			}

			return var1.anInt912 >= var2.anInt912 ? 1 : -1;
		}
	}

	@Override
	public int compare(final Object var1, final Object var2) {
		return method111((Class137) var1, (Class137) var2);
	}

	@Override
	public boolean equals(final Object var1) {
		return super.equals(var1);
	}

	static final void method112(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6, final int var7, final int var8) {
		Class131_Sub9 var9 = null;

		for (Class131_Sub9 var10 = (Class131_Sub9) client.aClass115_2158
				.method465(); null != var10; var10 = (Class131_Sub9) client.aClass115_2158.method468())
			if ((var10.anInt1052 == var0) && (var10.anInt1045 == var1) && (var10.anInt1043 == var2)
					&& (var3 == var10.anInt1053)) {
				var9 = var10;
				break;
			}

		if (var9 == null) {
			var9 = new Class131_Sub9();
			var9.anInt1052 = var0;
			var9.anInt1053 = var3;
			var9.anInt1045 = var1;
			var9.anInt1043 = var2;
			Class131_Sub6.method552(var9);
			client.aClass115_2158.method471(var9);
		}

		var9.anInt1049 = var4;
		var9.anInt1051 = var5;
		var9.anInt1048 = var6;
		var9.anInt1044 = var7;
		var9.anInt1050 = var8;
	}

	static void method113(final String[] var0, final short[] var1, final int var2, final int var3) {
		if (var2 < var3) {
			final int var6 = (var2 + var3) / 2;
			int var5 = var2;
			final String var4 = var0[var6];
			var0[var6] = var0[var3];
			var0[var3] = var4;
			final short var8 = var1[var6];
			var1[var6] = var1[var3];
			var1[var3] = var8;

			for (int var7 = var2; var7 < var3; ++var7)
				if ((null == var4) || ((var0[var7] != null) && (var0[var7].compareTo(var4) < (var7 & 1)))) {
					final String var9 = var0[var7];
					var0[var7] = var0[var5];
					var0[var5] = var9;
					final short var10 = var1[var7];
					var1[var7] = var1[var5];
					var1[var5++] = var10;
				}

			var0[var3] = var0[var5];
			var0[var5] = var4;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			method113(var0, var1, var2, var5 - 1);
			method113(var0, var1, var5 + 1, var3);
		}

	}

	public static void method114(final Component var0) {
		var0.addMouseListener(Class81.aClass81_669);
		var0.addMouseMotionListener(Class81.aClass81_669);
		var0.addFocusListener(Class81.aClass81_669);
	}

	Class24(final boolean var1) {
		val$preferOwnWorld = var1;
	}

	static void method115() {
		Class143 var0 = null;

		try {
			var0 = Class131_Sub20_Sub5.method726("", Class80.aClass73_665.aString623, true);
			final DataBuffer var1 = Class50.aClass28_494.method125();
			var0.method523(var1.data, 0, var1.pos);
		} catch (final Exception var3) {
			;
		}

		try {
			if (var0 != null)
				var0.method521();
		} catch (final Exception var2) {
			;
		}

	}

	static void method116() {
		if (NpcFlags.aBool43) {
			NpcFlags.aClass131_Sub20_Sub17_Sub2_25 = null;
			NpcFlags.aClass131_Sub20_Sub17_Sub2_27 = null;
			Class131_Sub20_Sub19_Sub3.aClass131_Sub20_Sub17_Sub2Array1765 = null;
			NpcFlags.aClass131_Sub20_Sub17_Sub3_28 = null;
			Class131_Sub20_Sub20.aClass131_Sub20_Sub17_Sub3_1652 = null;
			Class97.aClass131_Sub20_Sub17_Sub2_775 = null;
			Class96.aClass131_Sub20_Sub17_Sub2Array767 = null;
			NpcFlags.aClass131_Sub20_Sub17_Sub2_29 = null;
			NpcFlags.aClass131_Sub20_Sub17_Sub2_30 = null;
			Class100_Sub1.aClass131_Sub20_Sub17_Sub3Array1128 = null;
			Class131_Sub10.aClass131_Sub20_Sub17_Sub2Array1069 = null;
			Class90.aClass131_Sub20_Sub17_Sub2Array726 = null;
			Class1.aClass131_Sub20_Sub17_Sub2Array2 = null;
			Class131_Sub20_Sub15.aClass131_Sub20_Sub17_Sub2_1603 = null;
			Class74.anIntArray627 = null;
			Class30.anIntArray282 = null;
			Class63_Sub1.anIntArray1100 = null;
			Class45.anIntArray450 = null;
			Class62.anIntArray581 = null;
			Class84.anIntArray697 = null;
			Class49.anIntArray485 = null;
			Class30.anIntArray280 = null;
			Class46.method230(2);
			Class92.method389(true);
			NpcFlags.aBool43 = false;
		}
	}

	static final void method117(final int var0) {
		Class84.method367();

		for (Class131_Sub6 var3 = (Class131_Sub6) Class131_Sub6.aClass115_1013
				.method465(); var3 != null; var3 = (Class131_Sub6) Class131_Sub6.aClass115_1013.method468())
			if (null != var3.aClass131_Sub20_Sub9_1022)
				var3.method551();

		final int var1 = Class99.method399(var0).anInt1602;
		if (var1 != 0) {
			final int var2 = Class96.anIntArray766[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					Class131_Sub20_Sub17_Sub1.method944(0.9D);
					((Class35) Class131_Sub20_Sub17_Sub1.anInterface3_1784).method203(0.9D);
				}

				if (var2 == 2) {
					Class131_Sub20_Sub17_Sub1.method944(0.8D);
					((Class35) Class131_Sub20_Sub17_Sub1.anInterface3_1784).method203(0.8D);
				}

				if (var2 == 3) {
					Class131_Sub20_Sub17_Sub1.method944(0.7D);
					((Class35) Class131_Sub20_Sub17_Sub1.anInterface3_1784).method203(0.7D);
				}

				if (var2 == 4) {
					Class131_Sub20_Sub17_Sub1.method944(0.6D);
					((Class35) Class131_Sub20_Sub17_Sub1.anInterface3_1784).method203(0.6D);
				}

				Class131_Sub20_Sub19_Sub2.method924();
			}

			if (var1 == 3) {
				short var4 = 0;
				if (var2 == 0)
					var4 = 255;

				if (var2 == 1)
					var4 = 192;

				if (var2 == 2)
					var4 = 128;

				if (var2 == 3)
					var4 = 64;

				if (var2 == 4)
					var4 = 0;

				if (var4 != client.anInt2260) {
					if ((client.anInt2260 == 0) && (client.anInt2052 != -1)) {
						Class23.method108(Class44.aClass100_Sub1_446, client.anInt2052, 0, var4, false);
						client.aBool2262 = false;
					} else if (var4 == 0) {
						Class126_Sub1.method524();
						client.aBool2262 = false;
					} else if (Class113.anInt830 == 0)
						Class113.aClass131_Sub4_Sub3_832.method883(var4);
					else
						Class113.anInt833 = var4;

					client.anInt2260 = var4;
				}
			}

			if (var1 == 4) {
				if (var2 == 0)
					client.anInt2228 = 127;

				if (var2 == 1)
					client.anInt2228 = 96;

				if (var2 == 2)
					client.anInt2228 = 64;

				if (var2 == 3)
					client.anInt2228 = 32;

				if (var2 == 4)
					client.anInt2228 = 0;
			}

			if (var1 == 5)
				client.anInt2210 = var2;

			if (var1 == 6)
				client.anInt2185 = var2;

			if (var1 == 9)
				client.anInt2186 = var2;

			if (var1 == 10) {
				if (var2 == 0)
					client.anInt2086 = 127;

				if (var2 == 1)
					client.anInt2086 = 96;

				if (var2 == 2)
					client.anInt2086 = 64;

				if (var2 == 3)
					client.anInt2086 = 32;

				if (var2 == 4)
					client.anInt2086 = 0;
			}

			if (var1 == 17)
				client.anInt2069 = var2 & '\uffff';

			if (var1 == 18) {
				client.aClass50_2055 = (Class50) Class39.method214(Class131_Sub20_Sub10.method765(), var2);
				if (client.aClass50_2055 == null)
					client.aClass50_2055 = Class50.aClass50_488;
			}

			if (var1 == 19)
				if (var2 == -1)
					client.anInt2200 = -1;
				else
					client.anInt2200 = var2 & 2047;

			if (var1 == 22) {
				client.aClass50_2056 = (Class50) Class39.method214(Class131_Sub20_Sub10.method765(), var2);
				if (null == client.aClass50_2056)
					client.aClass50_2056 = Class50.aClass50_488;
			}

		}
	}
}
