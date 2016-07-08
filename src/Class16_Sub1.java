import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

public final class Class16_Sub1 extends Class16 implements ImageProducer, ImageObserver {
	ColorModel aColorModel998;
	ImageConsumer anImageConsumer997;

	@Override
	public synchronized boolean isConsumer(final ImageConsumer var1) {
		return var1 == anImageConsumer997;
	}

	@Override
	public final void method59(final int var1, final int var2, final Component var3, final byte var4) {
		anInt150 = var1;
		anInt151 = var2;
		anIntArray153 = new int[1 + (var2 * var1)];
		aColorModel998 = new DirectColorModel(32, 16711680, '\uff00', 255);
		anImage152 = var3.createImage(this);
		method545();
		var3.prepareImage(anImage152, this);
		method545();
		var3.prepareImage(anImage152, this);
		method545();
		var3.prepareImage(anImage152, this);
		method60();
	}

	@Override
	public final void method61(final Graphics var1, final int var2, final int var3, final int var4) {
		method545();
		var1.drawImage(anImage152, var2, var3, this);
	}

	@Override
	public final void method62(final Graphics var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		method544(var2, var3, var4, var5);
		final Shape var7 = var1.getClip();
		var1.clipRect(var2, var3, var4, var5);
		var1.drawImage(anImage152, 0, 0, this);
		var1.setClip(var7);
	}

	@Override
	public synchronized void addConsumer(final ImageConsumer var1) {
		anImageConsumer997 = var1;
		var1.setDimensions(anInt150, anInt151);
		var1.setProperties((Hashtable) null);
		var1.setColorModel(aColorModel998);
		var1.setHints(14);
	}

	@Override
	public void requestTopDownLeftRightResend(final ImageConsumer var1) {
	}

	@Override
	public boolean imageUpdate(final Image var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		return true;
	}

	synchronized void method544(final int var1, final int var2, final int var3, final int var4) {
		if (null != anImageConsumer997) {
			anImageConsumer997.setPixels(var1, var2, var3, var4, aColorModel998, anIntArray153,
					var1 + (var2 * anInt150), anInt150);
			anImageConsumer997.imageComplete(2);
		}
	}

	@Override
	public void startProduction(final ImageConsumer var1) {
		addConsumer(var1);
	}

	@Override
	public synchronized void removeConsumer(final ImageConsumer var1) {
		if (var1 == anImageConsumer997)
			anImageConsumer997 = null;

	}

	synchronized void method545() {
		if (null != anImageConsumer997) {
			anImageConsumer997.setPixels(0, 0, anInt150, anInt151, aColorModel998, anIntArray153, 0, anInt150);
			anImageConsumer997.imageComplete(2);
		}
	}

	public static void method546(final Class100 var0) {
		Class138.aClass100_915 = var0;
		Class65.anInt594 = Class138.aClass100_915.method417(16);
	}

	static void method547(final Class131_Sub18[] var0, final Class131_Sub18 var1, final boolean var2) {
		final int var3 = var1.anInt1181 != 0 ? var1.anInt1181 : var1.anInt1173;
		final int var4 = var1.anInt1182 != 0 ? var1.anInt1182 : var1.anInt1291;
		Class113.method455(var0, var1.anInt1272, var3, var4, var2);
		if (null != var1.aClass131_Sub18Array1171)
			Class113.method455(var1.aClass131_Sub18Array1171, var1.anInt1272, var3, var4, var2);

		final Class131_Sub7 var6 = (Class131_Sub7) client.aClass114_2184.method457(var1.anInt1272);
		if (null != var6) {
			final int var5 = var6.anInt1025;
			if (Class77.method344(var5))
				Class113.method455(Class131_Sub18.aClass131_Sub18ArrayArray1174[var5], -1, var3, var4, var2);
		}

		if (var1.anInt1162 == 1337)
			;

	}

	static final int method548(final int var0, int var1) {
		if (var0 == -2)
			return 12345678;
		else if (var0 == -1) {
			if (var1 < 2)
				var1 = 2;
			else if (var1 > 126)
				var1 = 126;

			return var1;
		} else {
			var1 = (var1 * (var0 & 127)) / 128;
			if (var1 < 2)
				var1 = 2;
			else if (var1 > 126)
				var1 = 126;

			return var1 + (var0 & '\uff80');
		}
	}

	static Class100_Sub1 method549(final int var0, final boolean var1, final boolean var2, final boolean var3) {
		Class75 var4 = null;
		if (Class72.aClass140_614 != null)
			var4 = new Class75(var0, Class72.aClass140_614, Class44.aClass140Array444[var0], 1000000);

		return new Class100_Sub1(var4, client.aClass75_2301, var0, var1, var2, var3);
	}
}
