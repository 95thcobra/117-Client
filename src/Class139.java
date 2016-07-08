import java.util.Comparator;

final class Class139 implements Comparator {
	static byte[][][] aByteArrayArrayArray916;
	static int anInt917;

	int method508(final Class137 var1, final Class137 var2) {
		return var1.aClass129_910.anInt898 < var2.aClass129_910.anInt898 ? -1
				: (var2.aClass129_910.anInt898 == var1.aClass129_910.anInt898 ? 0 : 1);
	}

	@Override
	public int compare(final Object var1, final Object var2) {
		return method508((Class137) var1, (Class137) var2);
	}

	@Override
	public boolean equals(final Object var1) {
		return super.equals(var1);
	}
}
