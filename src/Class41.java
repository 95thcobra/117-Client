public class Class41 {
	static boolean method219(final String var0, final boolean var1) {
		if (null == var0)
			return false;
		else {
			final String var3 = Class85.method371(var0, client.aClass142_2031);

			for (int var2 = 0; var2 < client.anInt2290; ++var2)
				if (var3.equalsIgnoreCase(
						Class85.method371(client.aClass44Array2292[var2].aString442, client.aClass142_2031))
						&& (!var1 || (client.aClass44Array2292[var2].anInt438 != 0)))
					return true;

			if (var3.equalsIgnoreCase(Class85.method371(Class131_Sub11.myPlayer.aString2004,
					client.aClass142_2031)))
				return true;
			else
				return false;
		}
	}
}
