import java.util.Iterator;

public final class Class125 implements Iterable {
	Class131 aClass131_885;
	int anInt884;
	Class131[] aClass131Array883;

	public Class131 method487(final long var1) {
		final Class131 var3 = aClass131Array883[(int) (var1 & anInt884 - 1)];

		for (aClass131_885 = var3.aClass131_903; aClass131_885 != var3; aClass131_885 = aClass131_885.aClass131_903)
			if (aClass131_885.aLong902 == var1) {
				final Class131 var4 = aClass131_885;
				aClass131_885 = aClass131_885.aClass131_903;
				return var4;
			}

		aClass131_885 = null;
		return null;
	}

	public void method488(final Class131 var1, final long var2) {
		if (var1.aClass131_904 != null)
			var1.method501();

		final Class131 var4 = aClass131Array883[(int) (var2 & anInt884 - 1)];
		var1.aClass131_904 = var4.aClass131_904;
		var1.aClass131_903 = var4;
		var1.aClass131_904.aClass131_903 = var1;
		var1.aClass131_903.aClass131_904 = var1;
		var1.aLong902 = var2;
	}

	public void method489() {
		for (int var1 = 0; var1 < anInt884; ++var1) {
			final Class131 var2 = aClass131Array883[var1];

			while (true) {
				final Class131 var3 = var2.aClass131_903;
				if (var3 == var2)
					break;

				var3.method501();
			}
		}

		aClass131_885 = null;
	}

	@Override
	public Iterator iterator() {
		return new Class127(this);
	}

	public Class125(final int var1) {
		anInt884 = var1;
		aClass131Array883 = new Class131[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			final Class131 var3 = aClass131Array883[var2] = new Class131();
			var3.aClass131_903 = var3;
			var3.aClass131_904 = var3;
		}

	}
}
