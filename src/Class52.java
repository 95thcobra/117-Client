public class Class52 {
	public static String method271(long var0) {
		if ((var0 > 0L) && (var0 < 6582952005840035281L)) {
			if ((var0 % 37L) == 0L)
				return null;
			else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L)
					++var2;

				final StringBuilder var5 = new StringBuilder(var2);

				while (var0 != 0L) {
					final long var6 = var0;
					var0 /= 37L;
					var5.append(Class106.aCharArray809[(int) (var6 - (37L * var0))]);
				}

				return var5.reverse().toString();
			}
		} else
			return null;
	}

	public static String method272(final CharSequence var0) {
		final int var1 = var0.length();
		final StringBuilder var4 = new StringBuilder(var1);

		for (int var2 = 0; var2 < var1; ++var2) {
			final char var3 = var0.charAt(var2);
			if (((var3 < 97) || (var3 > 122)) && ((var3 < 65) || (var3 > 90)) && ((var3 < 48) || (var3 > 57))
					&& (var3 != 46) && (var3 != 45) && (var3 != 42) && (var3 != 95)) {
				if (var3 == 32)
					var4.append('\u002b');
				else {
					final byte var6 = Class64.method310(var3);
					var4.append('\u0025');
					int var5 = (var6 >> 4) & 15;
					if (var5 >= 10)
						var4.append((char) (55 + var5));
					else
						var4.append((char) (var5 + 48));

					var5 = var6 & 15;
					if (var5 >= 10)
						var4.append((char) (55 + var5));
					else
						var4.append((char) (var5 + 48));
				}
			} else
				var4.append(var3);
		}

		return var4.toString();
	}
}
