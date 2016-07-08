import java.awt.Font;
import java.awt.FontMetrics;

public class Class30 {
	String aString272;
	static Class30[] aClass30Array273;
	int anInt276;
	int anInt278;
	int anInt279;
	static int[] anIntArray280;
	String aString281;
	static int[] anIntArray282;
	int anInt283;
	static Font aFont284;
	int anInt286;
	static FontMetrics aFontMetrics287;
	static int anInt274 = 0;
	static int anInt275 = 0;
	static int[] anIntArray285 = new int[] { 1, 1, 1, 1 };
	static int[] anIntArray277 = new int[] { 0, 1, 2, 3 };

	boolean method128() {
		return (4 & anInt279) != 0;
	}

	boolean method129() {
		return (2 & anInt279) != 0;
	}

	boolean method130() {
		return (8 & anInt279) != 0;
	}

	boolean method131() {
		return (536870912 & anInt279) != 0;
	}

	boolean method132() {
		return (1 & anInt279) != 0;
	}

	static final int method133(final Class142 var0) {
		if (var0 == null)
			return 12;
		else
			switch (var0.anInt945) {
			case 3:
				return 20;
			default:
				return 12;
			}
	}

	static final void method134(final Class131_Sub20_Sub17_Sub2 var0) {
		final short var1 = 256;

		int var3;
		for (var3 = 0; var3 < Class62.anIntArray581.length; ++var3)
			Class62.anIntArray581[var3] = 0;

		int var4;
		for (var3 = 0; var3 < 5000; ++var3) {
			var4 = (int) (Math.random() * 128.0D * var1);
			Class62.anIntArray581[var4] = (int) (Math.random() * 256.0D);
		}

		int var2;
		int var6;
		for (var3 = 0; var3 < 20; ++var3) {
			for (var4 = 1; var4 < (var1 - 1); ++var4)
				for (var2 = 1; var2 < 127; ++var2) {
					var6 = var2 + (var4 << 7);
					Class84.anIntArray697[var6] = (Class62.anIntArray581[var6 - 1] + Class62.anIntArray581[var6 + 1]
							+ Class62.anIntArray581[var6 - 128] + Class62.anIntArray581[var6 + 128]) / 4;
				}

			final int[] var7 = Class62.anIntArray581;
			Class62.anIntArray581 = Class84.anIntArray697;
			Class84.anIntArray697 = var7;
		}

		if (var0 != null) {
			var3 = 0;

			for (var4 = 0; var4 < var0.anInt1791; ++var4)
				for (var2 = 0; var2 < var0.anInt1790; ++var2)
					if (var0.aByteArray1792[var3++] != 0) {
						var6 = var0.anInt1795 + 16 + var2;
						final int var5 = var0.anInt1793 + 16 + var4;
						final int var8 = (var5 << 7) + var6;
						Class62.anIntArray581[var8] = 0;
					}
		}

	}

	boolean method135() {
		return (33554432 & anInt279) != 0;
	}

	public static boolean method136(final char var0) {
		return ((var0 >= 48) && (var0 <= 57)) || ((var0 >= 65) && (var0 <= 90)) || ((var0 >= 97) && (var0 <= 122));
	}
}
