import java.util.Comparator;

final class Class132 implements Comparator {
	int method502(final Class137 var1, final Class137 var2) {
		return var1.aLong911 < var2.aLong911 ? -1 : (var1.aLong911 != var2.aLong911 ? 1 : 0);
	}

	@Override
	public int compare(final Object var1, final Object var2) {
		return method502((Class137) var1, (Class137) var2);
	}

	@Override
	public boolean equals(final Object var1) {
		return super.equals(var1);
	}
}
