public class Class104 {
	static char[] aCharArray801 = new char[64];
	static char[] aCharArray803;
	static int[] anIntArray802;

	static {
		int var1;
		for (var1 = 0; var1 < 26; ++var1)
			aCharArray801[var1] = (char) (65 + var1);

		for (var1 = 26; var1 < 52; ++var1)
			aCharArray801[var1] = (char) ((97 + var1) - 26);

		for (var1 = 52; var1 < 62; ++var1)
			aCharArray801[var1] = (char) ((48 + var1) - 52);

		aCharArray801[62] = 43;
		aCharArray801[63] = 47;
		aCharArray803 = new char[64];

		for (var1 = 0; var1 < 26; ++var1)
			aCharArray803[var1] = (char) (65 + var1);

		for (var1 = 26; var1 < 52; ++var1)
			aCharArray803[var1] = (char) ((var1 + 97) - 26);

		for (var1 = 52; var1 < 62; ++var1)
			aCharArray803[var1] = (char) ((48 + var1) - 52);

		aCharArray803[62] = 42;
		aCharArray803[63] = 45;
		anIntArray802 = new int[128];

		for (var1 = 0; var1 < anIntArray802.length; ++var1)
			anIntArray802[var1] = -1;

		for (var1 = 65; var1 <= 90; ++var1)
			anIntArray802[var1] = var1 - 65;

		for (var1 = 97; var1 <= 122; ++var1)
			anIntArray802[var1] = 26 + (var1 - 97);

		for (var1 = 48; var1 <= 57; ++var1)
			anIntArray802[var1] = 52 + (var1 - 48);

		final int[] var2 = anIntArray802;
		anIntArray802[43] = 62;
		var2[42] = 62;
		final int[] var0 = anIntArray802;
		anIntArray802[47] = 63;
		var0[45] = 63;
	}
}
