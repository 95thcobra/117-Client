import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class71_Sub1 extends Class71 implements MouseWheelListener {
	int anInt1113 = 0;

	@Override
	public void method331(final Component var1, final byte var2) {
		var1.addMouseWheelListener(this);
	}

	@Override
	public void method329(final Component var1, final int var2) {
		var1.removeMouseWheelListener(this);
	}

	@Override
	public synchronized void mouseWheelMoved(final MouseWheelEvent var1) {
		anInt1113 += var1.getWheelRotation();
	}

	@Override
	public synchronized int method330(final int var1) {
		final int var2 = anInt1113;
		anInt1113 = 0;
		return var2;
	}
}
