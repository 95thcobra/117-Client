import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class141 {
	public List aList932;
	public static Comparator aComparator930 = new Class132();
	public static Comparator aComparator933;
	public static Comparator aComparator931;
	public static Comparator aComparator934;

	public Class141(final DataBuffer var1, final boolean var2) {
		final int var4 = var1.readUShort();
		final boolean var3 = var1.method595() == 1;
		byte var6;
		if (var3)
			var6 = 1;
		else
			var6 = 0;

		final int var7 = var1.readUShort();
		aList932 = new ArrayList(var7);

		for (int var5 = 0; var5 < var7; ++var5)
			aList932.add(new Class137(var1, var6, var4));

	}

	static {
		new Class134();
		aComparator933 = new Class138();
		aComparator931 = new Class130();
		aComparator934 = new Class139();
	}

	public void method517(final Comparator var1, final boolean var2) {
		if (!var2)
			Collections.sort(aList932, Collections.reverseOrder(var1));
		else
			Collections.sort(aList932, var1);

	}
}
