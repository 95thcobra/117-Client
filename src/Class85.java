import java.applet.Applet;

public class Class85 {
	static Class131_Sub20_Sub17_Sub3[] aClass131_Sub20_Sub17_Sub3Array701;
	static Applet anApplet700 = null;
	static String aString699 = null;

	public static String method371(final CharSequence var0, final Class142 var1) {
		if (null == var0)
			return null;
		else {
			int var5 = 0;

			int var4;
			char var6;
			boolean var11;
			for (var4 = var0.length(); var5 < var4; ++var5) {
				var6 = var0.charAt(var5);
				var11 = (var6 == 160) || (var6 == 32) || (var6 == 95) || (var6 == 45);
				if (!var11)
					break;
			}

			while (var4 > var5) {
				var6 = var0.charAt(var4 - 1);
				var11 = (var6 == 160) || (var6 == 32) || (var6 == 95) || (var6 == 45);
				if (!var11)
					break;

				--var4;
			}

			final int var14 = var4 - var5;
			if ((var14 >= 1) && (var14 <= Class30.method133(var1))) {
				final StringBuilder var12 = new StringBuilder(var14);

				for (int var3 = var5; var3 < var4; ++var3) {
					final char var7 = var0.charAt(var3);
					boolean var2;
					if (Character.isISOControl(var7))
						var2 = false;
					else {
						final boolean var13 = ((var7 >= 48) && (var7 <= 57)) || ((var7 >= 65) && (var7 <= 90))
								|| ((var7 >= 97) && (var7 <= 122));
						if (var13)
							var2 = true;
						else {
							char[] var8 = Class103.aCharArray799;
							int var9 = 0;

							label109: while (true) {
								char var10;
								if (var9 >= var8.length) {
									var8 = Class103.aCharArray800;

									for (var9 = 0; var9 < var8.length; ++var9) {
										var10 = var8[var9];
										if (var7 == var10) {
											var2 = true;
											break label109;
										}
									}

									var2 = false;
									break;
								}

								var10 = var8[var9];
								if (var7 == var10) {
									var2 = true;
									break;
								}

								++var9;
							}
						}
					}

					if (var2) {
						final char var15 = Class67.method318(var7);
						if (var15 != 0)
							var12.append(var15);
					}
				}

				if (var12.length() == 0)
					return null;
				else
					return var12.toString();
			} else
				return null;
		}
	}
}
