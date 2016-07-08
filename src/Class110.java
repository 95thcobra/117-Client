import java.util.Iterator;

public class Class110 implements Iterator {
	Class131 aClass131_817;
	Class131 aClass131_815 = null;
	Class128 aClass128_816;

	@Override
	public Object next() {
		Class131 var1 = aClass131_817;
		if (var1 == aClass128_816.aClass131_892) {
			var1 = null;
			aClass131_817 = null;
		} else
			aClass131_817 = var1.aClass131_903;

		aClass131_815 = var1;
		return var1;
	}

	@Override
	public boolean hasNext() {
		return aClass131_817 != aClass128_816.aClass131_892;
	}

	@Override
	public void remove() {
		if (aClass131_815 == null)
			throw new IllegalStateException();
		else {
			aClass131_815.method501();
			aClass131_815 = null;
		}
	}

	Class110(final Class128 var1) {
		aClass128_816 = var1;
		aClass131_817 = aClass128_816.aClass131_892.aClass131_903;
		aClass131_815 = null;
	}
}
