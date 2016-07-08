public class Class142 {
	public int anInt945;
	String aString944;
	public static Class142 aClass142_943 = new Class142(2, 0, "", "");
	static Class142 aClass142_936 = new Class142(1, 1, "", "");
	static Class142 aClass142_935 = new Class142(4, 2, "", "");
	static Class142 aClass142_937 = new Class142(0, 3, "", "");
	static Class142 aClass142_938 = new Class142(6, 4, "", "");
	static Class142 aClass142_939 = new Class142(3, 5, "", "");
	static Class142 aClass142_940 = new Class142(8, 6, "", "");
	static Class142 aClass142_941 = new Class142(7, 7, "", "");
	public static Class142 aClass142_942;

	@Override
	public String toString() {
		return aString944;
	}

	static int method518(final Class30 var0, final Class30 var1, final int var2, final boolean var3) {
		if (var2 == 1) {
			int var4 = var0.anInt276;
			int var5 = var1.anInt276;
			if (!var3) {
				if (var4 == -1)
					var4 = 2001;

				if (var5 == -1)
					var5 = 2001;
			}

			return var4 - var5;
		} else
			return var2 == 2 ? var0.anInt286 - var1.anInt286
					: (var2 == 3
							? (var0.aString272.equals("-") ? (var1.aString272.equals("-") ? 0 : (var3 ? -1 : 1))
									: (var1.aString272.equals("-") ? (var3 ? 1 : -1)
											: var0.aString272.compareTo(var1.aString272)))
							: (var2 == 4 ? (var0.method130() ? (var1.method130() ? 0 : 1) : (var1.method130() ? -1 : 0))
									: (var2 == 5
											? (var0.method129() ? (var1.method129() ? 0 : 1)
													: (var1.method129() ? -1 : 0))
											: (var2 == 6
													? (var0.method128() ? (var1.method128() ? 0 : 1)
															: (var1.method128() ? -1 : 0))
													: (var2 == 7
															? (var0.method132() ? (var1.method132() ? 0 : 1)
																	: (var1.method132() ? -1 : 0))
															: var0.anInt278 - var1.anInt278)))));
	}

	Class142(final int var1, final int var2, final String var3, final String var4) {
		anInt945 = var1;
		aString944 = var4;
	}

	static {
		aClass142_942 = new Class142(5, -1, "", "", true,
				new Class142[] { aClass142_943, aClass142_936, aClass142_935, aClass142_938, aClass142_937 });
	}

	Class142(final int var1, final int var2, final String var3, final String var4, final boolean var5,
			final Class142[] var6) {
		anInt945 = var1;
		aString944 = var4;
	}
}
