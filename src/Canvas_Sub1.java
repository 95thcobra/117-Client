import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class Canvas_Sub1 extends Canvas {
	/**
	 *
	 */
	private static final long serialVersionUID = 4548191742110175539L;
	Component aComponent1648;

	Canvas_Sub1(final Component var1) {
		aComponent1648 = var1;
	}

	@Override
	public final void paint(final Graphics var1) {
		aComponent1648.paint(var1);
	}

	public static int method878(final CharSequence var0, final int var1, final int var2, final byte[] var3,
			final int var4) {
		final int var5 = var2 - var1;

		for (int var7 = 0; var7 < var5; ++var7) {
			final char var6 = var0.charAt(var1 + var7);
			if (((var6 > 0) && (var6 < 128)) || ((var6 >= 160) && (var6 <= 255)))
				var3[var7 + var4] = (byte) var6;
			else if (var6 == 8364)
				var3[var7 + var4] = -128;
			else if (var6 == 8218)
				var3[var4 + var7] = -126;
			else if (var6 == 402)
				var3[var7 + var4] = -125;
			else if (var6 == 8222)
				var3[var7 + var4] = -124;
			else if (var6 == 8230)
				var3[var7 + var4] = -123;
			else if (var6 == 8224)
				var3[var4 + var7] = -122;
			else if (var6 == 8225)
				var3[var7 + var4] = -121;
			else if (var6 == 710)
				var3[var4 + var7] = -120;
			else if (var6 == 8240)
				var3[var4 + var7] = -119;
			else if (var6 == 352)
				var3[var7 + var4] = -118;
			else if (var6 == 8249)
				var3[var7 + var4] = -117;
			else if (var6 == 338)
				var3[var4 + var7] = -116;
			else if (var6 == 381)
				var3[var7 + var4] = -114;
			else if (var6 == 8216)
				var3[var4 + var7] = -111;
			else if (var6 == 8217)
				var3[var7 + var4] = -110;
			else if (var6 == 8220)
				var3[var4 + var7] = -109;
			else if (var6 == 8221)
				var3[var4 + var7] = -108;
			else if (var6 == 8226)
				var3[var7 + var4] = -107;
			else if (var6 == 8211)
				var3[var7 + var4] = -106;
			else if (var6 != 8212) {
				if (var6 == 732)
					var3[var7 + var4] = -104;
				else if (var6 == 8482)
					var3[var7 + var4] = -103;
				else if (var6 == 353)
					var3[var7 + var4] = -102;
				else if (var6 == 8250)
					var3[var7 + var4] = -101;
				else if (var6 == 339)
					var3[var7 + var4] = -100;
				else if (var6 != 382) {
					if (var6 == 376)
						var3[var7 + var4] = -97;
					else
						var3[var4 + var7] = 63;
				} else
					var3[var7 + var4] = -98;
			} else
				var3[var7 + var4] = -105;
		}

		return var5;
	}

	@Override
	public final void update(final Graphics var1) {
		aComponent1648.update(var1);
	}
}
