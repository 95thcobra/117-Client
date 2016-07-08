import java.awt.Component;
import java.io.File;
import java.io.IOException;

public class Class131_Sub20_Sub5 extends Class131_Sub20 {
	public static Class100 aClass100_1448;
	protected static int anInt1450;
	int anInt1444 = 0;
	public static Class121 aClass121_1443 = new Class121(64);
	public int anInt1446;
	public int anInt1449;
	public int anInt1447;
	public int anInt1445;

	public void method720() {
		method727(anInt1444);
	}

	public void method721(final DataBuffer var1, final int var2) {
		while (true) {
			final int var3 = var1.readUByte();
			if (var3 == 0)
				return;

			method723(var1, var3);
		}
	}

	static void method722(final Component var0, final Class100 var1, final Class100 var2, final boolean var3,
			final int var4) {
		if (NpcFlags.aBool43) {
			if (var4 == 4)
				NpcFlags.anInt35 = 4;

		} else {
			NpcFlags.anInt35 = var4;
			Class131_Sub20_Sub17.method848();
			final byte[] var9 = var1.method415("title.jpg", "");
			NpcFlags.aClass131_Sub20_Sub17_Sub3_28 = new Class131_Sub20_Sub17_Sub3(var9, var0);
			Class131_Sub20_Sub20.aClass131_Sub20_Sub17_Sub3_1652 = NpcFlags.aClass131_Sub20_Sub17_Sub3_28.method960();
			if ((client.anInt2028 & 536870912) != 0)
				Class97.aClass131_Sub20_Sub17_Sub2_775 = Class83.method360(var2, "logo_deadman_mode", "");
			else
				Class97.aClass131_Sub20_Sub17_Sub2_775 = Class83.method360(var2, "logo", "");

			NpcFlags.aClass131_Sub20_Sub17_Sub2_25 = Class83.method360(var2, "titlebox", "");
			NpcFlags.aClass131_Sub20_Sub17_Sub2_27 = Class83.method360(var2, "titlebutton", "");
			Class131_Sub20_Sub19_Sub3.aClass131_Sub20_Sub17_Sub2Array1765 = client.method1095(var2, "runes", "");
			Class96.aClass131_Sub20_Sub17_Sub2Array767 = client.method1095(var2, "title_mute", "");
			NpcFlags.aClass131_Sub20_Sub17_Sub2_29 = Class83.method360(var2, "options_radio_buttons,0", "");
			NpcFlags.aClass131_Sub20_Sub17_Sub2_30 = Class83.method360(var2, "options_radio_buttons,2", "");
			Class74.anIntArray627 = new int[256];

			int var8;
			for (var8 = 0; var8 < 64; ++var8)
				Class74.anIntArray627[var8] = var8 * 262144;

			for (var8 = 0; var8 < 64; ++var8)
				Class74.anIntArray627[var8 + 64] = (var8 * 1024) + 16711680;

			for (var8 = 0; var8 < 64; ++var8)
				Class74.anIntArray627[var8 + 128] = (4 * var8) + 16776960;

			for (var8 = 0; var8 < 64; ++var8)
				Class74.anIntArray627[var8 + 192] = 16777215;

			Class30.anIntArray282 = new int[256];

			for (var8 = 0; var8 < 64; ++var8)
				Class30.anIntArray282[var8] = 1024 * var8;

			for (var8 = 0; var8 < 64; ++var8)
				Class30.anIntArray282[64 + var8] = (var8 * 4) + '\uff00';

			for (var8 = 0; var8 < 64; ++var8)
				Class30.anIntArray282[var8 + 128] = '\uffff' + (var8 * 262144);

			for (var8 = 0; var8 < 64; ++var8)
				Class30.anIntArray282[var8 + 192] = 16777215;

			Class63_Sub1.anIntArray1100 = new int[256];

			for (var8 = 0; var8 < 64; ++var8)
				Class63_Sub1.anIntArray1100[var8] = var8 * 4;

			for (var8 = 0; var8 < 64; ++var8)
				Class63_Sub1.anIntArray1100[var8 + 64] = 255 + (var8 * 262144);

			for (var8 = 0; var8 < 64; ++var8)
				Class63_Sub1.anIntArray1100[128 + var8] = (var8 * 1024) + 16711935;

			for (var8 = 0; var8 < 64; ++var8)
				Class63_Sub1.anIntArray1100[var8 + 192] = 16777215;

			Class45.anIntArray450 = new int[256];
			Class62.anIntArray581 = new int['\u8000'];
			Class84.anIntArray697 = new int['\u8000'];
			Class30.method134((Class131_Sub20_Sub17_Sub2) null);
			Class49.anIntArray485 = new int['\u8000'];
			Class30.anIntArray280 = new int['\u8000'];
			if (var3) {
				NpcFlags.username = "";
				NpcFlags.password = "";
			}

			Class63.anInt582 = 0;
			Class58.aString566 = "";
			NpcFlags.aBool49 = true;
			NpcFlags.aBool33 = false;
			if (Class50.aClass28_494.aBool252)
				Class46.method230(2);
			else {
				final Class100_Sub1 var5 = Class44.aClass100_Sub1_446;
				final int var6 = var5.method413("scape main");
				final int var7 = var5.method414(var6, "");
				Class113.anInt830 = 1;
				Class50.aClass100_495 = var5;
				Class24.anInt213 = var6;
				Class130.anInt901 = var7;
				Class113.anInt833 = 255;
				Class50.aBool496 = false;
				Class113.anInt834 = 2;
			}

			Class92.method389(false);
			NpcFlags.aBool43 = true;
			NpcFlags.anInt36 = (Class2.anInt7 - client.anInt2238) / 2;
			NpcFlags.anInt42 = 202 + NpcFlags.anInt36;
			NpcFlags.aClass131_Sub20_Sub17_Sub3_28.method966(NpcFlags.anInt36, 0);
			Class131_Sub20_Sub20.aClass131_Sub20_Sub17_Sub3_1652.method966(382 + NpcFlags.anInt36, 0);
			Class97.aClass131_Sub20_Sub17_Sub2_775
					.method950((382 + NpcFlags.anInt36) - (Class97.aClass131_Sub20_Sub17_Sub2_775.anInt1790 / 2), 18);
		}
	}

	void method723(final DataBuffer var1, final int var2) {
		if (var2 == 1)
			anInt1444 = var1.method598();

	}

	public static String method724(long var0) {
		if ((var0 > 0L) && (var0 < 6582952005840035281L)) {
			if ((var0 % 37L) == 0L)
				return null;
			else {
				int var4 = 0;

				for (long var2 = var0; 0L != var2; var2 /= 37L)
					++var4;

				StringBuilder var5;
				char var9;
				for (var5 = new StringBuilder(var4); 0L != var0; var5.append(var9)) {
					final long var6 = var0;
					var0 /= 37L;
					var9 = Class106.aCharArray809[(int) (var6 - (var0 * 37L))];
					if (var9 == 95) {
						final int var8 = var5.length() - 1;
						var5.setCharAt(var8, Character.toUpperCase(var5.charAt(var8)));
						var9 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else
			return null;
	}

	public static boolean method725(final char var0) {
		return ((var0 >= 65) && (var0 <= 90)) || ((var0 >= 97) && (var0 <= 122));
	}

	public static Class143 method726(final String var0, final String var1, final boolean var2) {
		final File var3 = new File(Class6.aFile66, "preferences" + var0 + ".dat");
		if (var3.exists())
			try {
				final Class143 var10 = new Class143(var3, "rw", 10000L);
				return var10;
			} catch (final IOException var9) {
				;
			}

		String var4 = "";
		if (Class47.anInt467 == 33)
			var4 = "_rc";
		else if (Class47.anInt467 == 34)
			var4 = "_wip";

		final File var5 = new File(Class72.aString616, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		Class143 var6;
		if (!var2 && var5.exists())
			try {
				var6 = new Class143(var5, "rw", 10000L);
				return var6;
			} catch (final IOException var8) {
				;
			}

		try {
			var6 = new Class143(var3, "rw", 10000L);
			return var6;
		} catch (final IOException var7) {
			throw new RuntimeException();
		}
	}

	void method727(final int var1) {
		final double var2 = ((var1 >> 16) & 255) / 256.0D;
		final double var10 = ((var1 >> 8) & 255) / 256.0D;
		final double var4 = (var1 & 255) / 256.0D;
		double var6 = var2;
		if (var10 < var2)
			var6 = var10;

		if (var4 < var6)
			var6 = var4;

		double var8 = var2;
		if (var10 > var2)
			var8 = var10;

		if (var4 > var8)
			var8 = var4;

		double var12 = 0.0D;
		double var14 = 0.0D;
		final double var16 = (var6 + var8) / 2.0D;
		if (var6 != var8) {
			if (var16 < 0.5D)
				var14 = (var8 - var6) / (var6 + var8);

			if (var16 >= 0.5D)
				var14 = (var8 - var6) / (2.0D - var8 - var6);

			if (var2 == var8)
				var12 = (var10 - var4) / (var8 - var6);
			else if (var8 == var10)
				var12 = ((var4 - var2) / (var8 - var6)) + 2.0D;
			else if (var8 == var4)
				var12 = 4.0D + ((var2 - var10) / (var8 - var6));
		}

		var12 /= 6.0D;
		anInt1446 = (int) (256.0D * var14);
		anInt1449 = (int) (256.0D * var16);
		if (anInt1446 < 0)
			anInt1446 = 0;
		else if (anInt1446 > 255)
			anInt1446 = 255;

		if (anInt1449 < 0)
			anInt1449 = 0;
		else if (anInt1449 > 255)
			anInt1449 = 255;

		if (var16 > 0.5D)
			anInt1447 = (int) (var14 * (1.0D - var16) * 512.0D);
		else
			anInt1447 = (int) (512.0D * var16 * var14);

		if (anInt1447 < 1)
			anInt1447 = 1;

		anInt1445 = (int) (var12 * anInt1447);
	}
}
