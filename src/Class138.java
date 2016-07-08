import java.util.Comparator;

final class Class138 implements Comparator {
	public static int anInt914;
	static Class100 aClass100_915;

	@Override
	public int compare(final Object var1, final Object var2) {
		return method507((Class137) var1, (Class137) var2);
	}

	@Override
	public boolean equals(final Object var1) {
		return super.equals(var1);
	}

	int method507(final Class137 var1, final Class137 var2) {
		return var1.aClass129_910.anInt895 < var2.aClass129_910.anInt895 ? -1
				: (var2.aClass129_910.anInt895 == var1.aClass129_910.anInt895 ? 0 : 1);
	}
}
