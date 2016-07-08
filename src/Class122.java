import java.util.Iterator;

public class Class122 implements Iterator {
	Class131_Sub20 aClass131_Sub20_880;
	Class131_Sub20 aClass131_Sub20_881 = null;
	Class124 aClass124_879;

	@Override
	public Object next() {
		Class131_Sub20 var1 = aClass131_Sub20_880;
		if (var1 != aClass124_879.aClass131_Sub20_882)
			aClass131_Sub20_880 = var1.aClass131_Sub20_1318;
		else {
			var1 = null;
			aClass131_Sub20_880 = null;
		}

		aClass131_Sub20_881 = var1;
		return var1;
	}

	@Override
	public boolean hasNext() {
		return aClass131_Sub20_880 != aClass124_879.aClass131_Sub20_882;
	}

	@Override
	public void remove() {
		if (aClass131_Sub20_881 == null)
			throw new IllegalStateException();
		else {
			aClass131_Sub20_881.method677();
			aClass131_Sub20_881 = null;
		}
	}

	Class122(final Class124 var1) {
		aClass124_879 = var1;
		aClass131_Sub20_880 = aClass124_879.aClass131_Sub20_882.aClass131_Sub20_1318;
		aClass131_Sub20_881 = null;
	}
}
