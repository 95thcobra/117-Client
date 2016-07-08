import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class Class16_Sub2 extends Class16 {
	Component aComponent1101;

	@Override
	public final void method59(final int var1, final int var2, final Component var3, final byte var4) {
		anInt150 = var1;
		anInt151 = var2;
		anIntArray153 = new int[1 + (var2 * var1)];
		final DataBufferInt var5 = new DataBufferInt(anIntArray153, anIntArray153.length);
		final DirectColorModel var6 = new DirectColorModel(32, 16711680, '\uff00', 255);
		final WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(anInt150, anInt151),
				var5, (Point) null);
		anImage152 = new BufferedImage(var6, var7, false, new Hashtable());
		aComponent1101 = var3;
		method60();
	}

	@Override
	public final void method62(final Graphics var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		final Shape var7 = var1.getClip();
		var1.clipRect(var2, var3, var4, var5);
		var1.drawImage(anImage152, 0, 0, aComponent1101);
		var1.setClip(var7);
	}

	@Override
	public final void method61(final Graphics var1, final int var2, final int var3, final int var4) {
		var1.drawImage(anImage152, var2, var3, aComponent1101);
	}
}
