import java.util.Comparator;

final class Class134 implements Comparator {
	int method503(final Class137 var1, final Class137 var2) {
		return var1.anInt912 < var2.anInt912 ? -1 : (var1.anInt912 == var2.anInt912 ? 0 : 1);
	}

	@Override
	public boolean equals(final Object var1) {
		return super.equals(var1);
	}

	@Override
	public int compare(final Object var1, final Object var2) {
		return method503((Class137) var1, (Class137) var2);
	}
}
