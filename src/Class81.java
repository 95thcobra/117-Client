import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Class81 implements MouseListener, MouseMotionListener, FocusListener {
	static int anInt670;
	public static volatile int anInt667 = 0;
	public static volatile int anInt675 = 0;
	public static volatile int anInt679 = 0;
	public static volatile long aLong677 = 0L;
	public static volatile int anInt674 = 0;
	public static volatile int anInt676 = 0;
	public static volatile int anInt671 = -1;
	public static volatile int anInt672 = -1;
	public static Class81 aClass81_669 = new Class81();
	public static int anInt666 = 0;
	public static int anInt668 = 0;
	public static int anInt673 = 0;
	public static int anInt678 = 0;
	public static int anInt682 = 0;
	public static int anInt680 = 0;
	public static long aLong681 = 0L;

	@Override
	public final synchronized void mousePressed(final MouseEvent var1) {
		if (null != aClass81_669) {
			anInt667 = 0;
			anInt675 = var1.getX();
			anInt679 = var1.getY();
			aLong677 = Class84.method366(780546663);
			if (var1.isAltDown()) {
				anInt674 = 4;
				anInt676 = 4;
			} else if (var1.isMetaDown()) {
				anInt674 = 2;
				anInt676 = 2;
			} else {
				anInt674 = 1;
				anInt676 = 1;
			}
		}

		if (var1.isPopupTrigger())
			var1.consume();

	}

	@Override
	public final synchronized void mouseReleased(final MouseEvent var1) {
		if (aClass81_669 != null) {
			anInt667 = 0;
			anInt676 = 0;
		}

		if (var1.isPopupTrigger())
			var1.consume();

	}

	@Override
	public final synchronized void mouseEntered(final MouseEvent var1) {
		if (aClass81_669 != null) {
			anInt667 = 0;
			anInt671 = var1.getX();
			anInt672 = var1.getY();
		}

	}

	@Override
	public final synchronized void mouseExited(final MouseEvent var1) {
		if (aClass81_669 != null) {
			anInt667 = 0;
			anInt671 = -1;
			anInt672 = -1;
		}

	}

	@Override
	public final synchronized void mouseMoved(final MouseEvent var1) {
		if (aClass81_669 != null) {
			anInt667 = 0;
			anInt671 = var1.getX();
			anInt672 = var1.getY();
		}

	}

	@Override
	public final void mouseClicked(final MouseEvent var1) {
		if (var1.isPopupTrigger())
			var1.consume();

	}

	@Override
	public final void focusGained(final FocusEvent var1) {
	}

	@Override
	public final synchronized void focusLost(final FocusEvent var1) {
		if (null != aClass81_669)
			anInt676 = 0;

	}

	@Override
	public final synchronized void mouseDragged(final MouseEvent var1) {
		if (null != aClass81_669) {
			anInt667 = 0;
			anInt671 = var1.getX();
			anInt672 = var1.getY();
		}

	}

	static char method358(final char var0) {
		if ((var0 >= 192) && (var0 <= 255)) {
			if ((var0 >= 192) && (var0 <= 198))
				return '\u0041';

			if (var0 == 199)
				return '\u0043';

			if ((var0 >= 200) && (var0 <= 203))
				return '\u0045';

			if ((var0 >= 204) && (var0 <= 207))
				return '\u0049';

			if ((var0 >= 210) && (var0 <= 214))
				return '\u004f';

			if ((var0 >= 217) && (var0 <= 220))
				return '\u0055';

			if (var0 == 221)
				return '\u0059';

			if (var0 == 223)
				return '\u0073';

			if ((var0 >= 224) && (var0 <= 230))
				return '\u0061';

			if (var0 == 231)
				return '\u0063';

			if ((var0 >= 232) && (var0 <= 235))
				return '\u0065';

			if ((var0 >= 236) && (var0 <= 239))
				return '\u0069';

			if ((var0 >= 242) && (var0 <= 246))
				return '\u006f';

			if ((var0 >= 249) && (var0 <= 252))
				return '\u0075';

			if ((var0 == 253) || (var0 == 255))
				return '\u0079';
		}

		if (var0 == 338)
			return '\u004f';
		else if (var0 == 339)
			return '\u006f';
		else if (var0 == 376)
			return '\u0059';
		else
			return var0;
	}
}
