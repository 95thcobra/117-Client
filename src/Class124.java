import java.util.Iterator;

public class Class124 implements Iterable {
	public Class131_Sub20 aClass131_Sub20_882 = new Class131_Sub20();

	public void method485() {
		while (aClass131_Sub20_882.aClass131_Sub20_1318 != aClass131_Sub20_882)
			aClass131_Sub20_882.aClass131_Sub20_1318.method677();

	}

	public void method486(final Class131_Sub20 var1) {
		if (var1.aClass131_Sub20_1319 != null)
			var1.method677();

		var1.aClass131_Sub20_1319 = aClass131_Sub20_882.aClass131_Sub20_1319;
		var1.aClass131_Sub20_1318 = aClass131_Sub20_882;
		var1.aClass131_Sub20_1319.aClass131_Sub20_1318 = var1;
		var1.aClass131_Sub20_1318.aClass131_Sub20_1319 = var1;
	}

	@Override
	public Iterator iterator() {
		return new Class122(this);
	}

	public Class124() {
		aClass131_Sub20_882.aClass131_Sub20_1318 = aClass131_Sub20_882;
		aClass131_Sub20_882.aClass131_Sub20_1319 = aClass131_Sub20_882;
	}
}
