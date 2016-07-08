public final class Class131_Sub20_Sub17_Sub2 extends Class131_Sub20_Sub17 {
	public int anInt1788;
	public int[] anIntArray1789;
	public int anInt1794;
	public byte[] aByteArray1792;
	public int anInt1790;
	public int anInt1791;
	public int anInt1795;
	public int anInt1793;

	public void method948(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anIntArray1789.length; ++var4) {
			int var5 = (anIntArray1789[var4] >> 16) & 255;
			var5 += var1;
			if (var5 < 0)
				var5 = 0;
			else if (var5 > 255)
				var5 = 255;

			int var6 = (anIntArray1789[var4] >> 8) & 255;
			var6 += var2;
			if (var6 < 0)
				var6 = 0;
			else if (var6 > 255)
				var6 = 255;

			int var7 = anIntArray1789[var4] & 255;
			var7 += var3;
			if (var7 < 0)
				var7 = 0;
			else if (var7 > 255)
				var7 = 255;

			anIntArray1789[var4] = (var5 << 16) + (var6 << 8) + var7;
		}

	}

	static void method949(final int[] var0, final byte[] var1, final int[] var2, int var3, int var4, int var5,
			final int var6, final int var7, final int var8) {
		final int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			byte var12;
			for (var11 = var9; var11 < 0; ++var11) {
				var12 = var1[var3++];
				if (var12 != 0)
					var0[var4++] = var2[var12 & 255];
				else
					++var4;

				var12 = var1[var3++];
				if (var12 != 0)
					var0[var4++] = var2[var12 & 255];
				else
					++var4;

				var12 = var1[var3++];
				if (var12 != 0)
					var0[var4++] = var2[var12 & 255];
				else
					++var4;

				var12 = var1[var3++];
				if (var12 != 0)
					var0[var4++] = var2[var12 & 255];
				else
					++var4;
			}

			for (var11 = var5; var11 < 0; ++var11) {
				var12 = var1[var3++];
				if (var12 != 0)
					var0[var4++] = var2[var12 & 255];
				else
					++var4;
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method950(int var1, int var2) {
		var1 += anInt1795;
		var2 += anInt1793;
		int var3 = var1 + (var2 * anInt1627);
		int var4 = 0;
		int var5 = anInt1791;
		int var6 = anInt1790;
		int var8 = anInt1627 - var6;
		int var9 = 0;
		int var7;
		if (var2 < anInt1630) {
			var7 = anInt1630 - var2;
			var5 -= var7;
			var2 = anInt1630;
			var4 += var7 * var6;
			var3 += var7 * anInt1627;
		}

		if ((var2 + var5) > anInt1631)
			var5 -= (var2 + var5) - anInt1631;

		if (var1 < anInt1632) {
			var7 = anInt1632 - var1;
			var6 -= var7;
			var1 = anInt1632;
			var4 += var7;
			var3 += var7;
			var9 += var7;
			var8 += var7;
		}

		if ((var1 + var6) > anInt1628) {
			var7 = (var1 + var6) - anInt1628;
			var6 -= var7;
			var9 += var7;
			var8 += var7;
		}

		if ((var6 > 0) && (var5 > 0))
			method949(anIntArray1629, aByteArray1792, anIntArray1789, var4, var3, var6, var5, var8, var9);
	}

	public void method951() {
		if ((anInt1790 != anInt1788) || (anInt1791 != anInt1794)) {
			final byte[] var2 = new byte[anInt1788 * anInt1794];
			int var3 = 0;

			for (int var4 = 0; var4 < anInt1791; ++var4)
				for (int var1 = 0; var1 < anInt1790; ++var1)
					var2[var1 + anInt1795 + ((var4 + anInt1793) * anInt1788)] = aByteArray1792[var3++];

			aByteArray1792 = var2;
			anInt1790 = anInt1788;
			anInt1791 = anInt1794;
			anInt1795 = 0;
			anInt1793 = 0;
		}
	}
}
