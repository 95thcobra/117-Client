public class Class131_Sub11 extends Class131 {
	static int anInt1072;
	static Player myPlayer;
	static Class114 aClass114_1074 = new Class114(32);
	int[] anIntArray1070 = new int[] { -1 };
	int[] anIntArray1071 = new int[] { 0 };

	static final int method573(final int var0, final int var1, final int var2) {
		final int var3 = 256 - var2;
		return (((((var0 & '\uff00') * var3) + (var2 * (var1 & '\uff00'))) & 16711680)
				+ ((((var0 & 16711935) * var3) + ((var1 & 16711935) * var2)) & -16711936)) >> 8;
	}

	protected static final void method574() {
		Class64.anImage592 = null;
		Class30.aFont284 = null;
		Class30.aFontMetrics287 = null;
	}

	public static String method575(final String var0) {
		final int var1 = var0.length();
		final char[] var6 = new char[var1];
		byte var5 = 2;

		for (int var4 = 0; var4 < var1; ++var4) {
			char var2 = var0.charAt(var4);
			if (var5 == 0)
				var2 = Character.toLowerCase(var2);
			else if ((var5 == 2) || Character.isUpperCase(var2)) {
				char var3;
				if ((var2 != 181) && (var2 != 402))
					var3 = Character.toTitleCase(var2);
				else
					var3 = var2;

				var2 = var3;
			}

			if (Character.isLetter(var2))
				var5 = 0;
			else if ((var2 != 46) && (var2 != 63) && (var2 != 33)) {
				if (Character.isSpaceChar(var2)) {
					if (var5 != 2)
						var5 = 1;
				} else
					var5 = 1;
			} else
				var5 = 2;

			var6[var4] = var2;
		}

		return new String(var6);
	}

	public static int method576(int var0) {
		int var1 = 0;
		if ((var0 < 0) || (var0 >= 65536)) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var1 + var0;
	}
}
