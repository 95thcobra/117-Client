public class Class36 {
	public static Class21 aClass21_368;
	String aString369;
	public static int[] anIntArray370;
	public static Class78 aClass78_371;
	String aString372;

	static final int method205(final int var0, final int var1) {
		final int var2 = Class38.method211(var0 - 1, var1 - 1) + Class38.method211(1 + var0, var1 - 1)
				+ Class38.method211(var0 - 1, 1 + var1) + Class38.method211(1 + var0, var1 + 1);
		final int var3 = Class38.method211(var0 - 1, var1) + Class38.method211(var0 + 1, var1)
				+ Class38.method211(var0, var1 - 1) + Class38.method211(var0, var1 + 1);
		final int var4 = Class38.method211(var0, var1);
		return (var2 / 16) + (var3 / 8) + (var4 / 4);
	}

	static void method206(final Player var0, final int var1, final int var2) {
		if ((var1 == var0.anInt1703) && (var1 != -1)) {
			final int var3 = Class131_Sub20_Sub19_Sub2_Sub1.method1066(var1).anInt1369;
			if (var3 == 1) {
				var0.anInt1733 = 0;
				var0.anInt1734 = 0;
				var0.anInt1735 = var2;
				var0.anInt1736 = 0;
			}

			if (var3 == 2)
				var0.anInt1736 = 0;
		} else if ((var1 == -1) || (var0.anInt1703 == -1) || (Class131_Sub20_Sub19_Sub2_Sub1
				.method1066(var1).anInt1363 >= Class131_Sub20_Sub19_Sub2_Sub1.method1066(var0.anInt1703).anInt1363)) {
			var0.anInt1703 = var1;
			var0.anInt1733 = 0;
			var0.anInt1734 = 0;
			var0.anInt1735 = var2;
			var0.anInt1736 = 0;
			var0.anInt1758 = var0.anInt1754;
		}

	}

	public static void method207(final Class100 var0) {
		Class131_Sub20_Sub10.aClass100_1554 = var0;
	}

	static final void initializeGPI(final Class131_Sub14_Sub1 var0) {
		var0.bitAccess();
		final int myPlayerIndex = client.myPlayerIndex;
		final Player player = Class131_Sub11.myPlayer = client.playerArray[myPlayerIndex] = new Player();
		player.anInt1981 = myPlayerIndex;
		final int var6 = var0.readBits(30);
		final byte var9 = (byte) (var6 >> 28);
		final int var7 = (var6 >> 14) & 16383;
		final int var5 = var6 & 16383;
		player.anIntArray1755[0] = var7 - Class131_Sub20_Sub20.anInt1649;
		player.anInt1718 = (player.anIntArray1755[0] << 7) + (player.getSize() << 6);
		player.anIntArray1756[0] = var5 - Class50.anInt491;
		player.anInt1759 = (player.anIntArray1756[0] << 7) + (player.getSize() << 6);
		player.anInt1979 = var9 * 1840261741;
		Class39.anInt410 = var9;
		if (GPI.cachedAppearances[myPlayerIndex] != null)
			player.updateAppearance(GPI.cachedAppearances[myPlayerIndex]);

		GPI.localPlayers = 0;
		GPI.localPlayerIndices[++GPI.localPlayers - 1] = myPlayerIndex;
		GPI.skipFlags[myPlayerIndex] = 0;
		GPI.otherPlayers = 0;

		for (int playerIndex = 1; playerIndex < 2048; ++playerIndex) {
			//System.out.println(myPlayerIndex + " is not equal to ? " + playerIndex);
			if (myPlayerIndex != playerIndex) {
				final int var1 = var0.readBits(18);
				final int var10 = var1 >> 16;
				final int var11 = (var1 >> 8) & 255;
				final int var2 = var1 & 255;
				GPI.cachedRegions[playerIndex] = var2 + (var11 << 14) + (var10 << 28);
				GPI.cachedDirections[playerIndex] = 0;
				GPI.cachedIndices[playerIndex] = -1;
				GPI.globalPlayerIndices[++GPI.otherPlayers - 1] = playerIndex;
				GPI.skipFlags[playerIndex] = 0;
				//System.out.println("global player count incremented.");
			}
		}

		var0.byteAccess();
	}

	public static void method209() {
		Class135.aClass128_906 = new Class128();
	}
}
