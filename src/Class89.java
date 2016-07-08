import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;

public class Class89 {
	public static Class131_Sub20_Sub20 aClass131_Sub20_Sub20_725;

	protected static final void method378(final int var0, final String var1, Color var2, final boolean var3) {
		try {
			final Graphics var4 = Class29.aCanvas271.getGraphics();
			if (Class30.aFont284 == null) {
				Class30.aFont284 = new Font("Helvetica", 1, 13);
				Class30.aFontMetrics287 = Class29.aCanvas271.getFontMetrics(Class30.aFont284);
			}

			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, Class2.anInt7, Class88.anInt723);
			}

			if (var2 == null)
				var2 = new Color(140, 17, 17);

			try {
				if (Class64.anImage592 == null)
					Class64.anImage592 = Class29.aCanvas271.createImage(304, 34);

				final Graphics var5 = Class64.anImage592.getGraphics();
				var5.setColor(var2);
				var5.drawRect(0, 0, 303, 33);
				var5.fillRect(2, 2, 3 * var0, 30);
				var5.setColor(Color.black);
				var5.drawRect(1, 1, 301, 31);
				var5.fillRect(2 + (3 * var0), 2, 300 - (var0 * 3), 30);
				var5.setFont(Class30.aFont284);
				var5.setColor(Color.white);
				var5.drawString(var1, (304 - Class30.aFontMetrics287.stringWidth(var1)) / 2, 22);
				var4.drawImage(Class64.anImage592, (Class2.anInt7 / 2) - 152, (Class88.anInt723 / 2) - 18,
						(ImageObserver) null);
			} catch (final Exception var8) {
				final int var6 = (Class2.anInt7 / 2) - 152;
				final int var7 = (Class88.anInt723 / 2) - 18;
				var4.setColor(var2);
				var4.drawRect(var6, var7, 303, 33);
				var4.fillRect(var6 + 2, 2 + var7, 3 * var0, 30);
				var4.setColor(Color.black);
				var4.drawRect(1 + var6, 1 + var7, 301, 31);
				var4.fillRect((3 * var0) + var6 + 2, var7 + 2, 300 - (var0 * 3), 30);
				var4.setFont(Class30.aFont284);
				var4.setColor(Color.white);
				var4.drawString(var1, var6 + ((304 - Class30.aFontMetrics287.stringWidth(var1)) / 2), var7 + 22);
			}
		} catch (final Exception var9) {
			Class29.aCanvas271.repaint();
		}

	}
}
