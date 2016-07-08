public final class Class121 {
	int anInt876;
	Class131_Sub20 aClass131_Sub20_878 = new Class131_Sub20();
	Class116 aClass116_874 = new Class116();
	int anInt875;
	Class114 aClass114_877;

	public void method479(final Class131_Sub20 var1, final long var2) {
		if (anInt876 == 0) {
			Class131_Sub20 var4 = aClass116_874.method472();
			var4.method501();
			var4.method677();
			if (var4 == aClass131_Sub20_878) {
				var4 = aClass116_874.method472();
				var4.method501();
				var4.method677();
			}
		} else
			--anInt876;

		aClass114_877.method461(var1, var2);
		aClass116_874.method474(var1);
	}

	public void method480(final long var1) {
		final Class131_Sub20 var3 = (Class131_Sub20) aClass114_877.method457(var1);
		if (var3 != null) {
			var3.method501();
			var3.method677();
			++anInt876;
		}

	}

	public Class121(final int var1) {
		anInt875 = var1;
		anInt876 = var1;

		int var2;
		for (var2 = 1; (var2 + var2) < var1; var2 += var2)
			;

		aClass114_877 = new Class114(var2);
	}

	public void method481() {
		aClass116_874.method473();
		aClass114_877.method459();
		aClass131_Sub20_878 = new Class131_Sub20();
		anInt876 = anInt875;
	}

	public Class131_Sub20 method482(final long var1) {
		final Class131_Sub20 var3 = (Class131_Sub20) aClass114_877.method457(var1);
		if (var3 != null)
			aClass116_874.method474(var3);

		return var3;
	}
}
