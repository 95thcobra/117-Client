public class Class131_Sub20_Sub13 extends Class131_Sub20 {
	static Class100 aClass100_1570;
	static int anInt1577;
	static Class100 aClass100_1578;
	public int anInt1569 = -1;
	int[] anIntArray1567;
	public boolean aBool1576 = false;
	short[] aShortArray1571;
	short[] aShortArray1572;
	short[] aShortArray1573;
	short[] aShortArray1568;
	public static Class121 aClass121_1574 = new Class121(64);
	int[] anIntArray1575 = new int[] { -1, -1, -1, -1, -1 };

	void method776(final DataBuffer var1) {
		while (true) {
			final int var2 = var1.method595();
			if (var2 == 0)
				return;

			method777(var1, var2);
		}
	}

	void method777(final DataBuffer var1, final int var2) {
		if (var2 == 1)
			anInt1569 = var1.method595();
		else {
			int var3;
			int var4;
			if (var2 == 2) {
				var4 = var1.method595();
				anIntArray1567 = new int[var4];

				for (var3 = 0; var3 < var4; ++var3)
					anIntArray1567[var3] = var1.readUShort();
			} else if (var2 == 3)
				aBool1576 = true;
			else if (var2 == 40) {
				var4 = var1.method595();
				aShortArray1571 = new short[var4];
				aShortArray1572 = new short[var4];

				for (var3 = 0; var3 < var4; ++var3) {
					aShortArray1571[var3] = (short) var1.readUShort();
					aShortArray1572[var3] = (short) var1.readUShort();
				}
			} else if (var2 == 41) {
				var4 = var1.method595();
				aShortArray1573 = new short[var4];
				aShortArray1568 = new short[var4];

				for (var3 = 0; var3 < var4; ++var3) {
					aShortArray1573[var3] = (short) var1.readUShort();
					aShortArray1568[var3] = (short) var1.readUShort();
				}
			} else if ((var2 >= 60) && (var2 < 70))
				anIntArray1575[var2 - 60] = var1.readUShort();
		}

	}

	public Class131_Sub20_Sub19_Sub6 method778() {
		if (null == anIntArray1567)
			return null;
		else {
			final Class131_Sub20_Sub19_Sub6[] var1 = new Class131_Sub20_Sub19_Sub6[anIntArray1567.length];

			for (int var2 = 0; var2 < anIntArray1567.length; ++var2)
				var1[var2] = Class131_Sub20_Sub19_Sub6.method993(aClass100_1570, anIntArray1567[var2], 0);

			Class131_Sub20_Sub19_Sub6 var4;
			if (var1.length == 1)
				var4 = var1[0];
			else
				var4 = new Class131_Sub20_Sub19_Sub6(var1, var1.length);

			int var3;
			if (aShortArray1571 != null)
				for (var3 = 0; var3 < aShortArray1571.length; ++var3)
					var4.method1010(aShortArray1571[var3], aShortArray1572[var3]);

			if (aShortArray1573 != null)
				for (var3 = 0; var3 < aShortArray1573.length; ++var3)
					var4.method1004(aShortArray1573[var3], aShortArray1568[var3]);

			return var4;
		}
	}

	public Class131_Sub20_Sub19_Sub6 method779() {
		final Class131_Sub20_Sub19_Sub6[] var1 = new Class131_Sub20_Sub19_Sub6[5];
		int var2 = 0;

		for (int var4 = 0; var4 < 5; ++var4)
			if (anIntArray1575[var4] != -1)
				var1[var2++] = Class131_Sub20_Sub19_Sub6.method993(aClass100_1570, anIntArray1575[var4], 0);

		final Class131_Sub20_Sub19_Sub6 var3 = new Class131_Sub20_Sub19_Sub6(var1, var2);
		int var5;
		if (aShortArray1571 != null)
			for (var5 = 0; var5 < aShortArray1571.length; ++var5)
				var3.method1010(aShortArray1571[var5], aShortArray1572[var5]);

		if (aShortArray1573 != null)
			for (var5 = 0; var5 < aShortArray1573.length; ++var5)
				var3.method1004(aShortArray1573[var5], aShortArray1568[var5]);

		return var3;
	}

	public boolean method780() {
		boolean var1 = true;

		for (int var2 = 0; var2 < 5; ++var2)
			if ((anIntArray1575[var2] != -1) && !aClass100_1570.method404(anIntArray1575[var2], 0))
				var1 = false;

		return var1;
	}

	public boolean method781() {
		if (anIntArray1567 == null)
			return true;
		else {
			boolean var2 = true;

			for (int var1 = 0; var1 < anIntArray1567.length; ++var1)
				if (!aClass100_1570.method404(anIntArray1567[var1], 0))
					var2 = false;

			return var2;
		}
	}

	static final void method782(final int var0, final int var1, final int var2, final int var3,
			final Class131_Sub20_Sub17_Sub3 var4, final Class131_Sub20_Sub21 var5) {
		final int var6 = (var2 * var2) + (var3 * var3);
		if ((var6 > 4225) && (var6 < 90000)) {
			final int var7 = (client.anInt2236 + client.anInt2111) & 2047;
			int var8 = Class131_Sub20_Sub17_Sub1.anIntArray1787[var7];
			int var9 = Class131_Sub20_Sub17_Sub1.anIntArray1770[var7];
			var8 = (256 * var8) / (256 + client.anInt2100);
			var9 = (256 * var9) / (256 + client.anInt2100);
			final int var10 = ((var9 * var2) + (var8 * var3)) >> 16;
			final int var11 = ((var9 * var3) - (var8 * var2)) >> 16;
			final double var12 = Math.atan2(var10, var11);
			final int var14 = (int) (Math.sin(var12) * 63.0D);
			final int var15 = (int) (Math.cos(var12) * 57.0D);
			Class109.aClass131_Sub20_Sub17_Sub3_814.method984((94 + var0 + var14 + 4) - 10, (83 + var1) - var15 - 20,
					20, 20, 15, 15, var12, 256);
		} else
			Class131_Sub19.method673(var0, var1, var2, var3, var4, var5);

	}

	static void method783(final int var0) {
		if (var0 == -3)
			Class64.method306("Connection timed out.", "Please try using a different world.", "");
		else if (var0 == -2)
			Class64.method306("", "Error connecting to server.", "");
		else if (var0 == -1)
			Class64.method306("No response from server.", "Please try using a different world.", "");
		else if (var0 == 3)
			NpcFlags.anInt35 = 3;
		else if (var0 == 4)
			Class64.method306("Your account has been disabled.", "Please check your message-centre for details.", "");
		else if (var0 == 5)
			Class64.method306("Your account is already logged in.", "Try again in 60 secs...", "");
		else if (var0 == 6)
			Class64.method306("RuneScape has been updated!", "Please reload this page.", "");
		else if (var0 == 7)
			Class64.method306("This world is full.", "Please use a different world.", "");
		else if (var0 == 8)
			Class64.method306("Unable to connect.", "Login server offline.", "");
		else if (var0 == 9)
			Class64.method306("Login limit exceeded.", "Too many connections from your address.", "");
		else if (var0 == 10)
			Class64.method306("Unable to connect.", "Bad session id.", "");
		else if (var0 == 11)
			Class64.method306("We suspect someone knows your password.",
					"Press \'change your password\' on front page.", "");
		else if (var0 == 12)
			Class64.method306("You need a members account to login to this world.",
					"Please subscribe, or use a different world.", "");
		else if (var0 != 13) {
			if (var0 == 14)
				Class64.method306("The server is being updated.", "Please wait 1 minute and try again.", "");
			else if (var0 == 16)
				Class64.method306("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			else if (var0 == 17)
				Class64.method306("You are standing in a members-only area.",
						"To play on this world move to a free area first", "");
			else if (var0 == 18)
				Class64.method306("Account locked as we suspect it has been stolen.",
						"Press \'recover a locked account\' on front page.", "");
			else if (var0 == 19)
				Class64.method306("This world is running a closed Beta.", "Sorry invited players only.",
						"Please use a different world.");
			else if (var0 == 20)
				Class64.method306("Invalid loginserver requested.", "Please try using a different world.", "");
			else if (var0 == 22)
				Class64.method306("Malformed login packet.", "Please try again.", "");
			else if (var0 == 23)
				Class64.method306("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			else if (var0 == 24)
				Class64.method306("Error loading your profile.", "Please contact customer support.", "");
			else if (var0 == 25)
				Class64.method306("Unexpected loginserver response.", "Please try using a different world.", "");
			else if (var0 == 26)
				Class64.method306("This computers address has been blocked", "as it was used to break our rules.", "");
			else if (var0 == 27)
				Class64.method306("", "Service unavailable.", "");
			else if (var0 != 31) {
				if (var0 == 32)
					Class64.method306("Your attempt to log into your account was",
							"unsuccessful.  Don\'t worry, you can sort", "this out by visiting the billing system.");
				else if (var0 == 37)
					Class64.method306("Your account is currently inaccessible.", "Please try again in a few minutes.",
							"");
				else if (var0 == 38)
					Class64.method306("You need to vote to play!", "Visit runescape.com and vote,",
							"and then come back here!");
				else if (var0 == 55)
					Class64.method306("Sorry, but your account is not eligible to",
							"play this version of the game.  Please try", "playing the main game instead!");
				else {
					if (var0 == 56) {
						Class64.method306("Enter the 6-digit code generated by your", "authenticator app.", "");
						Class32.method142(11);
						return;
					}

					if (var0 == 57) {
						Class64.method306("The code you entered was incorrect.", "Please try again.", "");
						Class32.method142(11);
						return;
					}

					Class64.method306("Unexpected server response", "Please try using a different world.", "");
				}
			} else
				Class64.method306("Your account must have a displayname set",
						"in order to play the game.  Please set it", "via the website, or the main game.");
		} else
			Class64.method306("Could not complete login.", "Please try using a different world.", "");

		Class32.method142(10);
	}
}
