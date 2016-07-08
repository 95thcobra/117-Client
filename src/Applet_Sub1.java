import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {
	/**
	 *
	 */
	private static final long serialVersionUID = 327069226425819438L;
	static Class100_Sub1 aClass100_Sub1_2023;
	static int anInt2006 = 0;
	static Applet_Sub1 anApplet_Sub1_2021 = null;
	public static volatile boolean aBool2011 = true;
	protected static volatile boolean aBool2013 = false;
	static volatile long aLong2012 = 0L;
	static int anInt2022 = 1;
	static boolean aBool2008 = false;
	static long aLong2007 = 0L;
	static volatile boolean aBool2017 = true;
	boolean aBool2020;
	static int anInt2010 = 20;
	protected static int anInt2009 = 0;
	static long[] aLongArray2016 = new long[32];
	static long[] aLongArray2014 = new long[32];
	protected static int anInt2015 = 0;
	protected static int anInt2005 = 0;
	static int anInt2018 = 500;
	protected static boolean aBool2019 = false;

	protected final void method1076(final int var1, final int var2, final int var3) {
		try {
			if (anApplet_Sub1_2021 != null) {
				++anInt2006;
				if (anInt2006 >= 3) {
					method1079("alreadyloaded");
					return;
				}

				getAppletContext().showDocument(getDocumentBase(), "_self");
				return;
			}

			anApplet_Sub1_2021 = this;
			Class2.anInt7 = var1;
			Class88.anInt723 = var2;
			RuntimeException_Sub1.anInt1955 = var3;
			RuntimeException_Sub1.anApplet1952 = this;
			if (Class36.aClass78_371 == null)
				Class36.aClass78_371 = new Class78();

			Class36.aClass78_371.method348(this, 1);
		} catch (final Exception var5) {
			Class131_Sub20_Sub7.method740((String) null, var5);
			method1079("crash");
		}

	}

	protected final synchronized void method1077() {
		final Container var1 = method1084();
		if (Class29.aCanvas271 != null) {
			Class29.aCanvas271.removeFocusListener(this);
			var1.remove(Class29.aCanvas271);
		}

		Class2.anInt7 = Math.max(var1.getWidth(), NpcFlags.anInt57);
		Class88.anInt723 = Math.max(var1.getHeight(), Class70.anInt609);
		Insets var2;
		if (Class131_Sub5.aFrame1003 != null) {
			var2 = Class131_Sub5.aFrame1003.getInsets();
			Class2.anInt7 -= var2.right + var2.left;
			Class88.anInt723 -= var2.bottom + var2.top;
		}

		Class29.aCanvas271 = new Canvas_Sub1(this);
		var1.add(Class29.aCanvas271);
		Class29.aCanvas271.setSize(Class2.anInt7, Class88.anInt723);
		Class29.aCanvas271.setVisible(true);
		if (var1 == Class131_Sub5.aFrame1003) {
			var2 = Class131_Sub5.aFrame1003.getInsets();
			Class29.aCanvas271.setLocation(var2.left + anInt2015, anInt2005 + var2.top);
		} else
			Class29.aCanvas271.setLocation(anInt2015, anInt2005);

		Class29.aCanvas271.addFocusListener(this);
		Class29.aCanvas271.requestFocus();
		aBool2011 = true;
		final int var3 = Class2.anInt7;
		final int var4 = Class88.anInt723;
		final Canvas var5 = Class29.aCanvas271;

		Object var9;
		try {
			final Class16_Sub2 var6 = new Class16_Sub2();
			var6.method59(var3, var4, var5, (byte) -41);
			var9 = var6;
		} catch (final Throwable var8) {
			final Class16_Sub1 var7 = new Class16_Sub1();
			var7.method59(var3, var4, var5, (byte) -15);
			var9 = var7;
		}

		if (null != Class131_Sub20_Sub19_Sub5.aClass16_1839)
			Class131_Sub20_Sub19_Sub5.aClass16_1839.method61(((Class16) var9).anImage152.getGraphics(), 0, 0,
					-1142358962);

		Class131_Sub20_Sub19_Sub5.aClass16_1839 = (Class16) var9;
		aBool2013 = false;
		aLong2012 = Class84.method366(780546663);
	}

	@Override
	public void run() {
		try {
			if (null != Class78.aString638) {
				final String var1 = Class78.aString638.toLowerCase();
				if ((var1.indexOf("sun") != -1) || (var1.indexOf("apple") != -1)) {
					final String var2 = Class78.aString639;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")
							|| var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4")
							|| var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.")
							|| var2.equals("1.6.0")) {
						method1079("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; (var3 < var2.length()) && Class7.method37(var2.charAt(var3)); ++var3)
							;

						final String var4 = var2.substring(6, var3);
						if (Class93.method390(var4) && (Class131_Sub20_Sub8.method746(var4) < 10)) {
							method1079("wrongjava");
							return;
						}
					}

					anInt2022 = 5;
				}
			}

			setFocusCycleRoot(true);
			method1077();
			method1080((byte) 10);
			Class63.aClass79_585 = Class67.method316();

			while ((0L == aLong2007) || (Class84.method366(780546663) < aLong2007)) {
				Class131_Sub20_Sub15.anInt1604 = Class63.aClass79_585.method355(anInt2010, anInt2022, -1829064411);

				for (int var5 = 0; var5 < Class131_Sub20_Sub15.anInt1604; ++var5)
					method1087();

				method1090();
				Class103.method428(Class36.aClass78_371, Class29.aCanvas271);
			}
		} catch (final Exception var6) {
			Class131_Sub20_Sub7.method740((String) null, var6);
			method1079("crash");
		}

		method1078();
	}

	final synchronized void method1078() {
		if (!aBool2008) {
			aBool2008 = true;

			try {
				Class29.aCanvas271.removeFocusListener(this);
			} catch (final Exception var5) {
				;
			}

			try {
				method1083(155077562);
			} catch (final Exception var4) {
				;
			}

			if (null != Class131_Sub5.aFrame1003)
				try {
					System.exit(0);
				} catch (final Throwable var3) {
					;
				}

			if (null != Class36.aClass78_371)
				try {
					Class36.aClass78_371.method345();
				} catch (final Exception var2) {
					;
				}

			method1086((byte) 48);
		}
	}

	@Override
	public void start() {
		if ((this == anApplet_Sub1_2021) && !aBool2008)
			aLong2007 = 0L;
	}

	@Override
	public final synchronized void paint(final Graphics var1) {
		if ((anApplet_Sub1_2021 == this) && !aBool2008) {
			aBool2011 = true;
			if ((null != Class78.aString639) && Class78.aString639.startsWith("1.5")
					&& ((Class84.method366(780546663) - aLong2012) > 1000L)) {
				final Rectangle var2 = var1.getClipBounds();
				if ((null == var2) || ((var2.width >= Class2.anInt7) && (var2.height >= Class88.anInt723)))
					aBool2013 = true;
			}

		}
	}

	@Override
	public final void focusGained(final FocusEvent var1) {
		aBool2017 = true;
		aBool2011 = true;
	}

	@Override
	public final void focusLost(final FocusEvent var1) {
		aBool2017 = false;
	}

	@Override
	public void stop() {
		if ((anApplet_Sub1_2021 == this) && !aBool2008)
			aLong2007 = Class84.method366(780546663) + 4000L;
	}

	@Override
	public final void windowClosing(final WindowEvent var1) {
		destroy();
	}

	protected void method1079(final String var1) {
		if (!aBool2020) {
			aBool2020 = true;
			System.out.println("error_game_" + var1);

			try {
				getAppletContext().showDocument(new URL(getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (final Exception var3) {
				;
			}

		}
	}

	@Override
	public final void windowIconified(final WindowEvent var1) {
	}

	@Override
	public final void windowOpened(final WindowEvent var1) {
	}

	@Override
	public abstract void init();

	protected abstract void method1080(byte var1);

	protected abstract void method1081(short var1);

	protected abstract void method1082(int var1);

	protected abstract void method1083(int var1);

	protected Container method1084() {
		return Class131_Sub5.aFrame1003 != null ? Class131_Sub5.aFrame1003 : this;
	}

	protected Dimension method1085() {
		final Container var1 = method1084();
		int var2 = Math.max(var1.getWidth(), NpcFlags.anInt57);
		int var3 = Math.max(var1.getHeight(), Class70.anInt609);
		if (Class131_Sub5.aFrame1003 != null) {
			final Insets var4 = Class131_Sub5.aFrame1003.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.top + var4.bottom;
		}

		return new Dimension(var2, var3);
	}

	protected abstract void method1086(byte var1);

	void method1087() {
		final long var1 = Class84.method366(780546663);
		final long var3 = aLongArray2014[Class6.anInt67];
		aLongArray2014[Class6.anInt67] = var1;
		Class6.anInt67 = (1 + Class6.anInt67) & 31;
		if ((0L != var3) && (var1 > var3))
			;

		synchronized (this) {
			Class2.aBool8 = aBool2017;
		}

		method1081((short) -25474);
	}

	static void method1088() {
		Class26.anInt226 = 99;
		Class26.aByteArrayArrayArray227 = new byte[4][104][104];
		Class136.aByteArrayArrayArray907 = new byte[4][104][104];
		Class26.aByteArrayArrayArray224 = new byte[4][104][104];
		Class26.aByteArrayArrayArray229 = new byte[4][104][104];
		Class48.anIntArrayArrayArray477 = new int[4][105][105];
		Class139.aByteArrayArrayArray916 = new byte[4][105][105];
		Class28.anIntArrayArray258 = new int[105][105];
		Class26.anIntArray242 = new int[104];
		Class26.anIntArray230 = new int[104];
		Class26.anIntArray228 = new int[104];
		Class26.anIntArray231 = new int[104];
		Class126_Sub1.anIntArray951 = new int[104];
	}

	@Override
	public final void windowDeactivated(final WindowEvent var1) {
	}

	@Override
	public final void windowDeiconified(final WindowEvent var1) {
	}

	@Override
	public void destroy() {
		if ((anApplet_Sub1_2021 == this) && !aBool2008) {
			aLong2007 = Class84.method366(780546663);
			Class47.method237(5000L);
			method1078();
		}
	}

	@Override
	public final void windowActivated(final WindowEvent var1) {
	}

	protected final boolean method1089() {
		String var1 = getDocumentBase().getHost().toLowerCase();
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
				if (!var1.equals("mechscape.com") && !var1.endsWith(".mechscape.com")) {
					if (var1.endsWith("127.0.0.1"))
						return true;
					else {
						while ((var1.length() > 0) && (var1.charAt(var1.length() - 1) >= 48)
								&& (var1.charAt(var1.length() - 1) <= 57))
							var1 = var1.substring(0, var1.length() - 1);

						if (var1.endsWith("192.168.1."))
							return true;
						else {
							method1079("invalidhost");
							return false;
						}
					}
				} else
					return true;
			} else
				return true;
		} else
			return true;
	}

	@Override
	public final void windowClosed(final WindowEvent var1) {
	}

	void method1090() {
		final Container var1 = method1084();
		final long var4 = Class84.method366(780546663);
		final long var2 = aLongArray2016[Class81.anInt670];
		aLongArray2016[Class81.anInt670] = var4;
		Class81.anInt670 = (1 + Class81.anInt670) & 31;
		if ((var2 != 0L) && (var4 > var2)) {
			final int var6 = (int) (var4 - var2);
			anInt2009 = ((var6 >> 1) + 32000) / var6;
		}

		if ((++anInt2018 - 1) > 50) {
			anInt2018 -= 50;
			aBool2011 = true;
			Class29.aCanvas271.setSize(Class2.anInt7, Class88.anInt723);
			Class29.aCanvas271.setVisible(true);
			if (Class131_Sub5.aFrame1003 == var1) {
				final Insets var7 = Class131_Sub5.aFrame1003.getInsets();
				Class29.aCanvas271.setLocation(anInt2015 + var7.left, anInt2005 + var7.top);
			} else
				Class29.aCanvas271.setLocation(anInt2015, anInt2005);
		}

		method1082(1927182290);
	}

	@Override
	public final void update(final Graphics var1) {
		paint(var1);
	}
}
