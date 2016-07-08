public class Class107 {
	static Class87 aClass87_811;
	static char[] aCharArray810 = new char[] { '\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020',
			'\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0000', '\u017d', '\u0000', '\u0000',
			'\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161',
			'\u203a', '\u0153', '\u0000', '\u017e', '\u0178' };

	public static int method432(final CharSequence var0) {
		final int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3)
			var2 = ((var2 << 5) - var2) + Class64.method310(var0.charAt(var3));

		return var2;
	}
}
