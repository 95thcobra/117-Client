public class Class12 implements Runnable {
	static int anInt110;
	Class78 aClass78_112;
	volatile boolean aBool111 = false;
	volatile Class17[] aClass17Array108 = new Class17[2];
	volatile boolean aBool109 = false;

	@Override
	public void run() {
		aBool111 = true;

		try {
			try {
				while (!aBool109) {
					for (int var1 = 0; var1 < 2; ++var1) {
						final Class17 var2 = aClass17Array108[var1];
						if (null != var2)
							var2.method75();
					}

					Class47.method237(10L);
					Class103.method428(aClass78_112, (Object) null);
				}
			} catch (final Exception var7) {
				Class131_Sub20_Sub7.method740((String) null, var7);
				aBool111 = false;
				return;
			}

			aBool111 = false;
		} finally {
			aBool111 = false;
		}
	}

	static void method51(String var0, final boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var6 = 0;

		for (int var3 = 0; var3 < Class131_Sub7.anInt1031; ++var3) {
			final Class131_Sub20_Sub2 var4 = Class79_Sub1.method645(var3, (short) 11705);
			if ((!var1 || var4.aBool1417) && (var4.anInt1410 == -1)
					&& (var4.aString1385.toLowerCase().indexOf(var0) != -1)) {
				if (var6 >= 250) {
					Class131_Sub13.anInt1105 = -1;
					Class67.aShortArray601 = null;
					return;
				}

				if (var6 >= var2.length) {
					final short[] var5 = new short[2 * var2.length];

					for (int var8 = 0; var8 < var6; ++var8)
						var5[var8] = var2[var8];

					var2 = var5;
				}

				var2[var6++] = (short) var3;
			}
		}

		Class67.aShortArray601 = var2;
		Class92.anInt740 = 0;
		Class131_Sub13.anInt1105 = var6;
		final String[] var7 = new String[Class131_Sub13.anInt1105];

		for (int var9 = 0; var9 < Class131_Sub13.anInt1105; ++var9)
			var7[var9] = Class79_Sub1.method645(var2[var9], (short) 1523).aString1385;

		Class131_Sub9.method562(var7, Class67.aShortArray601);
	}
}
