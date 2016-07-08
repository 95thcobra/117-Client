import java.awt.event.ActionEvent;

public class Class103 {
	static int[] anIntArray798;
	static char[] aCharArray799 = new char[] { '\u0020', '\u00a0', '\u005f', '\u002d', '\u00e0', '\u00e1', '\u00e2',
			'\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea',
			'\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce',
			'\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6',
			'\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7',
			'\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df' };
	static char[] aCharArray800 = new char[] { '\u005b', '\u005d', '\u0023' };

	static String method427(final int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	public static void method428(final Class78 var0, final Object var1) {
		if (var0.anEventQueue645 != null) {
			for (int var2 = 0; (var2 < 50) && (var0.anEventQueue645.peekEvent() != null); ++var2)
				Class47.method237(1L);

			if (null != var1)
				var0.anEventQueue645.postEvent(new ActionEvent(var1, 1001, "dummy"));

		}
	}

	static final void method429(final int var0, final int var1) {
		if (client.anInt2193 == 2) {
			Class47.method236(client.anInt2053 + ((client.anInt2050 - Class131_Sub20_Sub20.anInt1649) << 7),
					((client.anInt2051 - Class50.anInt491) << 7) + client.anInt2054, client.anInt2176 * 2);
			if ((client.anInt2132 > -1) && ((client.anInt2038 % 20) < 10))
				Class42.aClass131_Sub20_Sub17_Sub3Array424[0].method968((client.anInt2132 + var0) - 12,
						(client.anInt2133 + var1) - 28);

		}
	}
}
