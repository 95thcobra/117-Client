import java.awt.Graphics;

public class Class82 implements Interface4 {
	static Class100_Sub1 aClass100_Sub1_686;
	static Class82 aClass82_687 = new Class82(0, -1, true, false, true);
	static Class82 aClass82_684 = new Class82(1, 0, true, true, true);
	static Class82 aClass82_685 = new Class82(2, 1, true, true, false);
	static Class82 aClass82_692 = new Class82(3, 2, false, false, true);
	static Class82 aClass82_683 = new Class82(4, 3, false, false, true);
	int anInt688;
	public int anInt689;
	public boolean aBool690;
	public boolean aBool691;

	Class82(final int var1, final int var2, final boolean var3, final boolean var4, final boolean var5) {
		anInt688 = var1;
		anInt689 = var2;
		aBool690 = var4;
		aBool691 = var5;
	}

	@Override
	public int method11(final byte var1) {
		return anInt688;
	}

	static void method359(final Class131_Sub20_Sub17_Sub4_Sub1 var0, final Class131_Sub20_Sub17_Sub4_Sub1 var1) {
		if (Class100_Sub1.aClass131_Sub20_Sub17_Sub3Array1128 == null)
			Class100_Sub1.aClass131_Sub20_Sub17_Sub3Array1128 = Class28.method127(Class51.aClass100_Sub1_502, "sl_back",
					"");

		if (Class131_Sub10.aClass131_Sub20_Sub17_Sub2Array1069 == null)
			Class131_Sub10.aClass131_Sub20_Sub17_Sub2Array1069 = client.method1095(Class51.aClass100_Sub1_502,
					"sl_flags", "");

		if (Class90.aClass131_Sub20_Sub17_Sub2Array726 == null)
			Class90.aClass131_Sub20_Sub17_Sub2Array726 = client.method1095(Class51.aClass100_Sub1_502, "sl_arrows", "");

		if (Class1.aClass131_Sub20_Sub17_Sub2Array2 == null)
			Class1.aClass131_Sub20_Sub17_Sub2Array2 = client.method1095(Class51.aClass100_Sub1_502, "sl_stars", "");

		Class131_Sub20_Sub17.method850(NpcFlags.anInt36, 23, 765, 480, 0);
		Class131_Sub20_Sub17.method853(NpcFlags.anInt36, 0, 125, 23, 12425273, 9135624);
		Class131_Sub20_Sub17.method853(125 + NpcFlags.anInt36, 0, 640, 23, 5197647, 2697513);
		var0.method1056("Select a world", 62 + NpcFlags.anInt36, 15, 0, -1);
		if (Class1.aClass131_Sub20_Sub17_Sub2Array2 != null) {
			Class1.aClass131_Sub20_Sub17_Sub2Array2[1].method950(140 + NpcFlags.anInt36, 1);
			var1.method1053("Members only world", 152 + NpcFlags.anInt36, 10, 16777215, -1);
			Class1.aClass131_Sub20_Sub17_Sub2Array2[0].method950(140 + NpcFlags.anInt36, 12);
			var1.method1053("Free world", NpcFlags.anInt36 + 152, 21, 16777215, -1);
		}

		int var4;
		int var5;
		if (null != Class90.aClass131_Sub20_Sub17_Sub2Array726) {
			final int var2 = 280 + NpcFlags.anInt36;
			if ((Class30.anIntArray277[0] == 0) && (Class30.anIntArray285[0] == 0))
				Class90.aClass131_Sub20_Sub17_Sub2Array726[2].method950(var2, 4);
			else
				Class90.aClass131_Sub20_Sub17_Sub2Array726[0].method950(var2, 4);

			if ((Class30.anIntArray277[0] == 0) && (Class30.anIntArray285[0] == 1))
				Class90.aClass131_Sub20_Sub17_Sub2Array726[3].method950(var2 + 15, 4);
			else
				Class90.aClass131_Sub20_Sub17_Sub2Array726[1].method950(var2 + 15, 4);

			var0.method1053("World", 32 + var2, 17, 16777215, -1);
			final int var3 = NpcFlags.anInt36 + 390;
			if ((Class30.anIntArray277[0] == 1) && (Class30.anIntArray285[0] == 0))
				Class90.aClass131_Sub20_Sub17_Sub2Array726[2].method950(var3, 4);
			else
				Class90.aClass131_Sub20_Sub17_Sub2Array726[0].method950(var3, 4);

			if ((Class30.anIntArray277[0] == 1) && (Class30.anIntArray285[0] == 1))
				Class90.aClass131_Sub20_Sub17_Sub2Array726[3].method950(15 + var3, 4);
			else
				Class90.aClass131_Sub20_Sub17_Sub2Array726[1].method950(15 + var3, 4);

			var0.method1053("Players", var3 + 32, 17, 16777215, -1);
			var4 = 500 + NpcFlags.anInt36;
			if ((Class30.anIntArray277[0] == 2) && (Class30.anIntArray285[0] == 0))
				Class90.aClass131_Sub20_Sub17_Sub2Array726[2].method950(var4, 4);
			else
				Class90.aClass131_Sub20_Sub17_Sub2Array726[0].method950(var4, 4);

			if ((Class30.anIntArray277[0] == 2) && (Class30.anIntArray285[0] == 1))
				Class90.aClass131_Sub20_Sub17_Sub2Array726[3].method950(15 + var4, 4);
			else
				Class90.aClass131_Sub20_Sub17_Sub2Array726[1].method950(var4 + 15, 4);

			var0.method1053("Location", var4 + 32, 17, 16777215, -1);
			var5 = 610 + NpcFlags.anInt36;
			if ((Class30.anIntArray277[0] == 3) && (Class30.anIntArray285[0] == 0))
				Class90.aClass131_Sub20_Sub17_Sub2Array726[2].method950(var5, 4);
			else
				Class90.aClass131_Sub20_Sub17_Sub2Array726[0].method950(var5, 4);

			if ((Class30.anIntArray277[0] == 3) && (Class30.anIntArray285[0] == 1))
				Class90.aClass131_Sub20_Sub17_Sub2Array726[3].method950(var5 + 15, 4);
			else
				Class90.aClass131_Sub20_Sub17_Sub2Array726[1].method950(var5 + 15, 4);

			var0.method1053("Type", 32 + var5, 17, 16777215, -1);
		}

		Class131_Sub20_Sub17.method850(NpcFlags.anInt36 + 708, 4, 50, 16, 0);
		var1.method1056("Cancel", 708 + NpcFlags.anInt36 + 25, 16, 16777215, -1);
		NpcFlags.anInt53 = -1;
		if (null != Class100_Sub1.aClass131_Sub20_Sub17_Sub3Array1128) {
			final byte var23 = 88;
			final byte var24 = 19;
			var4 = 765 / (1 + var23);
			var5 = 480 / (var24 + 1);

			int var6;
			int var7;
			do {
				var6 = var5;
				var7 = var4;
				if ((var5 * (var4 - 1)) >= Class30.anInt274)
					--var4;

				if ((var4 * (var5 - 1)) >= Class30.anInt274)
					--var5;

				if (((var5 - 1) * var4) >= Class30.anInt274)
					--var5;
			} while ((var5 != var6) || (var4 != var7));

			var6 = (765 - (var23 * var4)) / (var4 + 1);
			if (var6 > 5)
				var6 = 5;

			var7 = (480 - (var24 * var5)) / (var5 + 1);
			if (var7 > 5)
				var7 = 5;

			final int var8 = (765 - (var4 * var23) - ((var4 - 1) * var6)) / 2;
			final int var9 = (480 - (var5 * var24) - (var7 * (var5 - 1))) / 2;
			int var10 = 23 + var9;
			int var11 = NpcFlags.anInt36 + var8;
			int var12 = 0;
			boolean var13 = false;

			int var14;
			for (var14 = 0; var14 < Class30.anInt274; ++var14) {
				final Class30 var15 = Class30.aClass30Array273[var14];
				boolean var16 = true;
				String var17 = Integer.toString(var15.anInt276);
				if (var15.anInt276 == -1) {
					var17 = "OFF";
					var16 = false;
				} else if (var15.anInt276 > 1980) {
					var17 = "FULL";
					var16 = false;
				}

				int var18 = 0;
				byte var19;
				if (var15.method135()) {
					if (var15.method132())
						var19 = 7;
					else
						var19 = 6;
				} else if (var15.method131()) {
					var18 = 16711680;
					if (var15.method132())
						var19 = 5;
					else
						var19 = 4;
				} else if (var15.method128()) {
					if (var15.method132())
						var19 = 3;
					else
						var19 = 2;
				} else if (var15.method132())
					var19 = 1;
				else
					var19 = 0;

				if ((Class81.anInt668 >= var11) && (Class81.anInt673 >= var10) && (Class81.anInt668 < (var23 + var11))
						&& (Class81.anInt673 < (var10 + var24)) && var16) {
					NpcFlags.anInt53 = var14;
					Class100_Sub1.aClass131_Sub20_Sub17_Sub3Array1128[var19].method985(var11, var10, 128, 16777215);
					var13 = true;
				} else
					Class100_Sub1.aClass131_Sub20_Sub17_Sub3Array1128[var19].method966(var11, var10);

				if (null != Class131_Sub10.aClass131_Sub20_Sub17_Sub2Array1069)
					Class131_Sub10.aClass131_Sub20_Sub17_Sub2Array1069[(var15.method132() ? 8 : 0) + var15.anInt286]
							.method950(var11 + 29, var10);

				var0.method1056(Integer.toString(var15.anInt278), 15 + var11, var10 + (var24 / 2) + 5, var18, -1);
				var1.method1056(var17, var11 + 60, 5 + var10 + (var24 / 2), 268435455, -1);
				var10 += var7 + var24;
				++var12;
				if (var12 >= var5) {
					var10 = 23 + var9;
					var11 += var6 + var23;
					var12 = 0;
				}
			}

			if (var13) {
				var14 = var1.method1037(Class30.aClass30Array273[NpcFlags.anInt53].aString272) + 6;
				final int var20 = var1.anInt1962 + 8;
				Class131_Sub20_Sub17.method850(Class81.anInt668 - (var14 / 2), Class81.anInt673 + 20 + 5, var14, var20,
						16777120);
				Class131_Sub20_Sub17.method854(Class81.anInt668 - (var14 / 2), 5 + Class81.anInt673 + 20, var14, var20,
						0);
				var1.method1056(Class30.aClass30Array273[NpcFlags.anInt53].aString272, Class81.anInt668,
						4 + 5 + Class81.anInt673 + 20 + var1.anInt1962, 0, -1);
			}
		}

		try {
			final Graphics var21 = Class29.aCanvas271.getGraphics();
			Class131_Sub20_Sub19_Sub5.aClass16_1839.method61(var21, 0, 0, -563138410);
		} catch (final Exception var22) {
			Class29.aCanvas271.repaint();
		}

	}
}
