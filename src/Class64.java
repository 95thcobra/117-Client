import java.awt.Image;
import java.util.Calendar;
import java.util.TimeZone;

public class Class64 {
	static Class131_Sub20_Sub17_Sub3[] aClass131_Sub20_Sub17_Sub3Array588;
	static Class131_Sub20_Sub17_Sub2[] aClass131_Sub20_Sub17_Sub2Array590;
	static Image anImage592;
	static String[][] aStringArrayArray593 = new String[][] {
			{ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" },
			{ "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };
	static String[] aStringArray589 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
	static Calendar aCalendar591;

	public static void method305(final Class100 var0, final Class100 var1, final boolean var2) {
		Class131_Sub20_Sub9.aClass100_1535 = var0;
		Class131_Sub20_Sub9.aClass100_1517 = var1;
		Class131_Sub20_Sub9.aBool1540 = var2;
	}

	static {
		Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
		aCalendar591 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	static void method306(final String var0, final String var1, final String var2) {
		NpcFlags.aString41 = var0;
		NpcFlags.aString44 = var1;
		NpcFlags.aString45 = var2;
	}

	public static boolean method307(final char var0) {
		if (((var0 <= 0) || (var0 >= 128)) && ((var0 < 160) || (var0 > 255))) {
			if (var0 != 0) {
				final char[] var2 = Class107.aCharArray810;

				for (final char var3 : var2) {
					if (var3 == var0)
						return true;
				}
			}

			return false;
		} else
			return true;
	}

	static int method308(char var0) {
		int var1 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var1 = 1 + (var0 << 4);
		}

		return var1;
	}

	static void method309(final Class100_Sub1 var0, final int var1) {
		if (Class94.aClass131_Sub14_758 != null) {
			Class94.aClass131_Sub14_758.pos = 5 + (8 * var1);
			final int var2 = Class94.aClass131_Sub14_758.readIntV1();
			final int var3 = Class94.aClass131_Sub14_758.readIntV1();
			var0.method654(var2, var3);
		} else {
			Class131_Sub20_Sub11.method770((Class100_Sub1) null, 255, 255, 0, (byte) 0, true);
			Class94.aClass100_Sub1Array759[var1] = var0;
		}
	}

	public static byte method310(final char var0) {
		byte var1;
		if (((var0 > 0) && (var0 < 128)) || ((var0 >= 160) && (var0 <= 255)))
			var1 = (byte) var0;
		else if (var0 == 8364)
			var1 = -128;
		else if (var0 == 8218)
			var1 = -126;
		else if (var0 == 402)
			var1 = -125;
		else if (var0 == 8222)
			var1 = -124;
		else if (var0 == 8230)
			var1 = -123;
		else if (var0 == 8224)
			var1 = -122;
		else if (var0 == 8225)
			var1 = -121;
		else if (var0 == 710)
			var1 = -120;
		else if (var0 == 8240)
			var1 = -119;
		else if (var0 == 352)
			var1 = -118;
		else if (var0 != 8249) {
			if (var0 == 338)
				var1 = -116;
			else if (var0 == 381)
				var1 = -114;
			else if (var0 == 8216)
				var1 = -111;
			else if (var0 == 8217)
				var1 = -110;
			else if (var0 == 8220)
				var1 = -109;
			else if (var0 == 8221)
				var1 = -108;
			else if (var0 == 8226)
				var1 = -107;
			else if (var0 == 8211)
				var1 = -106;
			else if (var0 == 8212)
				var1 = -105;
			else if (var0 == 732)
				var1 = -104;
			else if (var0 == 8482)
				var1 = -103;
			else if (var0 == 353)
				var1 = -102;
			else if (var0 == 8250)
				var1 = -101;
			else if (var0 == 339)
				var1 = -100;
			else if (var0 == 382)
				var1 = -98;
			else if (var0 == 376)
				var1 = -97;
			else
				var1 = 63;
		} else
			var1 = -117;

		return var1;
	}
}
