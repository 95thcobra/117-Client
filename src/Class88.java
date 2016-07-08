public class Class88 {
	public static int anInt723;
	static Class88 aClass88_722 = new Class88("LIVE", 0);
	static Class88 aClass88_719 = new Class88("BUILDLIVE", 3);
	static Class88 aClass88_720 = new Class88("RC", 1);
	static Class88 aClass88_718 = new Class88("WIP", 2);
	public String aString724;
	int anInt721;

	Class88(final String var1, final int var2) {
		aString724 = var1;
		anInt721 = var2;
	}

	public static Class131_Sub18 method377(final int var0) {
		final int var1 = var0 >> 16;
		final int var2 = var0 & '\uffff';
		if ((Class131_Sub18.aClass131_Sub18ArrayArray1174[var1] == null)
				|| (Class131_Sub18.aClass131_Sub18ArrayArray1174[var1][var2] == null)) {
			final boolean var3 = Class77.method344(var1);
			if (!var3)
				return null;
		}

		return Class131_Sub18.aClass131_Sub18ArrayArray1174[var1][var2];
	}
}
