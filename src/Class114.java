public final class Class114 {
	Class131 aClass131_837;
	Class131 aClass131_839;
	int anInt840 = 0;
	int anInt841;
	Class131[] aClass131Array838;

	public Class131 method457(final long var1) {
		final Class131 var3 = aClass131Array838[(int) (var1 & anInt841 - 1)];

		for (aClass131_837 = var3.aClass131_903; aClass131_837 != var3; aClass131_837 = aClass131_837.aClass131_903)
			if (aClass131_837.aLong902 == var1) {
				final Class131 var4 = aClass131_837;
				aClass131_837 = aClass131_837.aClass131_903;
				return var4;
			}

		aClass131_837 = null;
		return null;
	}

	public Class131 method458() {
		Class131 var1;
		if ((anInt840 > 0) && (aClass131_839 != aClass131Array838[anInt840 - 1])) {
			var1 = aClass131_839;
			aClass131_839 = var1.aClass131_903;
			return var1;
		} else {
			do {
				if (anInt840 >= anInt841)
					return null;

				var1 = aClass131Array838[anInt840++].aClass131_903;
			} while (var1 == aClass131Array838[anInt840 - 1]);

			aClass131_839 = var1.aClass131_903;
			return var1;
		}
	}

	void method459() {
		for (int var1 = 0; var1 < anInt841; ++var1) {
			final Class131 var2 = aClass131Array838[var1];

			while (true) {
				final Class131 var3 = var2.aClass131_903;
				if (var3 == var2)
					break;

				var3.method501();
			}
		}

		aClass131_837 = null;
		aClass131_839 = null;
	}

	public Class131 method460() {
		anInt840 = 0;
		return method458();
	}

	public void method461(final Class131 var1, final long var2) {
		if (var1.aClass131_904 != null)
			var1.method501();

		final Class131 var4 = aClass131Array838[(int) (var2 & anInt841 - 1)];
		var1.aClass131_904 = var4.aClass131_904;
		var1.aClass131_903 = var4;
		var1.aClass131_904.aClass131_903 = var1;
		var1.aClass131_903.aClass131_904 = var1;
		var1.aLong902 = var2;
	}

	public Class114(final int var1) {
		anInt841 = var1;
		aClass131Array838 = new Class131[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			final Class131 var3 = aClass131Array838[var2] = new Class131();
			var3.aClass131_903 = var3;
			var3.aClass131_904 = var3;
		}

	}
}
