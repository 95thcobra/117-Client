public class Class115 {
	Class131 aClass131_842;
	public Class131 aClass131_843 = new Class131();

	public void method462() {
		while (true) {
			final Class131 var1 = aClass131_843.aClass131_903;
			if (var1 == aClass131_843) {
				aClass131_842 = null;
				return;
			}

			var1.method501();
		}
	}

	public Class131 method463() {
		final Class131 var1 = aClass131_843.aClass131_904;
		if (var1 == aClass131_843)
			return null;
		else {
			var1.method501();
			return var1;
		}
	}

	public void method464(final Class131 var1) {
		if (var1.aClass131_904 != null)
			var1.method501();

		var1.aClass131_904 = aClass131_843;
		var1.aClass131_903 = aClass131_843.aClass131_903;
		var1.aClass131_904.aClass131_903 = var1;
		var1.aClass131_903.aClass131_904 = var1;
	}

	public Class131 method465() {
		final Class131 var1 = aClass131_843.aClass131_903;
		if (var1 == aClass131_843) {
			aClass131_842 = null;
			return null;
		} else {
			aClass131_842 = var1.aClass131_903;
			return var1;
		}
	}

	public Class131 method466() {
		final Class131 var1 = aClass131_843.aClass131_903;
		if (var1 != aClass131_843) {
			var1.method501();
			return var1;
		} else
			return null;
	}

	public Class131 method467() {
		final Class131 var1 = aClass131_843.aClass131_904;
		if (var1 == aClass131_843) {
			aClass131_842 = null;
			return null;
		} else {
			aClass131_842 = var1.aClass131_904;
			return var1;
		}
	}

	public Class131 method468() {
		final Class131 var1 = aClass131_842;
		if (var1 == aClass131_843) {
			aClass131_842 = null;
			return null;
		} else {
			aClass131_842 = var1.aClass131_903;
			return var1;
		}
	}

	public Class131 method469() {
		final Class131 var1 = aClass131_842;
		if (var1 == aClass131_843) {
			aClass131_842 = null;
			return null;
		} else {
			aClass131_842 = var1.aClass131_904;
			return var1;
		}
	}

	public Class115() {
		aClass131_843.aClass131_903 = aClass131_843;
		aClass131_843.aClass131_904 = aClass131_843;
	}

	public static void method470(final Class131 var0, final Class131 var1) {
		if (var0.aClass131_904 != null)
			var0.method501();

		var0.aClass131_904 = var1.aClass131_904;
		var0.aClass131_903 = var1;
		var0.aClass131_904.aClass131_903 = var0;
		var0.aClass131_903.aClass131_904 = var0;
	}

	public void method471(final Class131 var1) {
		if (var1.aClass131_904 != null)
			var1.method501();

		var1.aClass131_904 = aClass131_843.aClass131_904;
		var1.aClass131_903 = aClass131_843;
		var1.aClass131_904.aClass131_903 = var1;
		var1.aClass131_903.aClass131_904 = var1;
	}
}
