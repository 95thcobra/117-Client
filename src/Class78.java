import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class Class78 implements Runnable {
	static int anInt640;
	Interface2 anInterface2_644;
	static Class141 aClass141_646;
	static Class100_Sub1 aClass100_Sub1_648;
	boolean aBool643 = false;
	Class87 aClass87_641 = null;
	Class87 aClass87_642 = null;
	public static String aString638;
	static String aString639;
	EventQueue anEventQueue645;
	Thread aThread647;

	final void method345() {
		synchronized (this) {
			aBool643 = true;
			notifyAll();
		}

		try {
			aThread647.join();
		} catch (final InterruptedException var3) {
			;
		}

	}

	final Class87 method346(final int var1, final int var2, final int var3, final Object var4) {
		final Class87 var5 = new Class87();
		var5.anInt715 = var1;
		var5.anInt712 = var2;
		var5.anObject717 = var4;
		synchronized (this) {
			if (aClass87_642 != null) {
				aClass87_642.aClass87_713 = var5;
				aClass87_642 = var5;
			} else
				aClass87_642 = aClass87_641 = var5;

			notify();
			return var5;
		}
	}

	public final Class87 method347(final String var1, final int var2) {
		return method346(1, var2, 0, var1);
	}

	public final Class87 method348(final Runnable var1, final int var2) {
		return method346(2, var2, 0, var1);
	}

	public final Class87 method349(final URL var1) {
		return method346(4, 0, 0, var1);
	}

	public final Interface2 method350() {
		return anInterface2_644;
	}

	public final Class87 method351(final int var1) {
		return method346(3, var1, 0, (Object) null);
	}

	static void method352(final int var0, final String var1) {
		final int var2 = GPI.anInt11;
		final int[] var3 = GPI.anIntArray17;
		boolean var4 = false;

		for (int var6 = 0; var6 < var2; ++var6) {
			final Player var5 = client.playerArray[var3[var6]];
			if ((var5 != null) && (Class131_Sub11.myPlayer != var5)
					&& (null != var5.aString2004) && var5.aString2004.equalsIgnoreCase(var1)) {
				if (var0 != 1) {
					if (var0 == 4) {
						client.secureBuffer.method871(221);
						client.secureBuffer.method591(0);
						client.secureBuffer.method620(var3[var6]);
					} else if (var0 == 6) {
						client.secureBuffer.method871(91);
						client.secureBuffer.method620(var3[var6]);
						client.secureBuffer.method612(0);
					} else if (var0 == 7) {
						client.secureBuffer.method871(8);
						client.secureBuffer.method620(var3[var6]);
						client.secureBuffer.method613(0);
					}
				} else {
					client.secureBuffer.method871(241);
					client.secureBuffer.method591(0);
					client.secureBuffer.method620(var3[var6]);
				}

				var4 = true;
				break;
			}
		}

		if (!var4)
			Class131_Sub20_Sub15.method792(4, "", "Unable to find " + var1);

	}

	Class78() {
		aString638 = "Unknown";
		aString639 = "1.1";

		try {
			aString638 = System.getProperty("java.vendor");
			aString639 = System.getProperty("java.version");
		} catch (final Exception var3) {
			;
		}

		try {
			anEventQueue645 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (final Throwable var2) {
			;
		}

		aBool643 = false;
		aThread647 = new Thread(this);
		aThread647.setPriority(10);
		aThread647.setDaemon(true);
		aThread647.start();
	}

	// Map region
	static final void playerSyncMaybe(final boolean notsureyet) {
		client.anInt2061 = 0;
		client.anInt2068 = 0;
		client.gameBuffer.bitAccess();
		int var5 = client.gameBuffer.readBits(8);
		System.out.println("var5:"+var5);
		int var4;
		if (var5 < client.anInt2230)
			for (var4 = var5; var4 < client.anInt2230; ++var4)
				client.anIntArray2151[++client.anInt2061 - 1] = client.anIntArray2067[var4];

		if (var5 > client.anInt2230)
			throw new RuntimeException("");
		else {
			client.anInt2230 = 0;

			int var3;
			int var8;
			int var9;
			int var10;
			for (var4 = 0; var4 < var5; ++var4) {
				final int var6 = client.anIntArray2067[var4];
				final Class131_Sub20_Sub19_Sub2_Sub1 var7 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var6];
				var3 = client.gameBuffer.readBits(1);
				if (var3 == 0) {
					client.anIntArray2067[++client.anInt2230 - 1] = var6;
					var7.anInt1747 = client.anInt2038;
				} else {
					var9 = client.gameBuffer.readBits(2);
					if (var9 == 0) {
						client.anIntArray2067[++client.anInt2230 - 1] = var6;
						var7.anInt1747 = client.anInt2038;
						client.anIntArray2025[++client.anInt2068 - 1] = var6;
					} else if (var9 == 1) {
						client.anIntArray2067[++client.anInt2230 - 1] = var6;
						var7.anInt1747 = client.anInt2038;
						var8 = client.gameBuffer.readBits(3);
						var7.method1062(var8, (byte) 1);
						var10 = client.gameBuffer.readBits(1);
						if (var10 == 1)
							client.anIntArray2025[++client.anInt2068 - 1] = var6;
					} else if (var9 == 2) {
						client.anIntArray2067[++client.anInt2230 - 1] = var6;
						var7.anInt1747 = client.anInt2038;
						var8 = client.gameBuffer.readBits(3);
						var7.method1062(var8, (byte) 2);
						var10 = client.gameBuffer.readBits(3);
						var7.method1062(var10, (byte) 2);
						final int var11 = client.gameBuffer.readBits(1);
						if (var11 == 1)
							client.anIntArray2025[++client.anInt2068 - 1] = var6;
					} else if (var9 == 3)
						client.anIntArray2151[++client.anInt2061 - 1] = var6;
				}
			}

			int var1;
			Class131_Sub20_Sub19_Sub2_Sub1 var2;
			while (client.gameBuffer.method874(client.messageSize) >= 27) {
				var5 = client.gameBuffer.readBits(15);
				if (var5 == 32767)
					break;

				boolean var12 = false;
				if (client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var5] == null) {
					client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var5] = new Class131_Sub20_Sub19_Sub2_Sub1();
					var12 = true;
				}

				var2 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var5];
				client.anIntArray2067[++client.anInt2230 - 1] = var5;
				var2.anInt1747 = client.anInt2038;
				if (notsureyet) {
					var1 = client.gameBuffer.readBits(8);
					if (var1 > 127)
						var1 -= 256;
				} else {
					var1 = client.gameBuffer.readBits(5);
					if (var1 > 15)
						var1 -= 32;
				}

				var3 = client.anIntArray2155[client.gameBuffer.readBits(3)];
				if (var12) {
					var2.anInt1762 = var3 * 762366543;
					var2.anInt1751 = var3;
				}

				if (notsureyet) {
					var9 = client.gameBuffer.readBits(8);
					if (var9 > 127)
						var9 -= 256;
				} else {
					var9 = client.gameBuffer.readBits(5);
					if (var9 > 15)
						var9 -= 32;
				}

				var2.aClass131_Sub20_Sub6_1978 = Class131_Sub20_Sub20
						.method879(client.gameBuffer.readBits(14));
				var8 = client.gameBuffer.readBits(1);
				var10 = client.gameBuffer.readBits(1);
				if (var10 == 1)
					client.anIntArray2025[++client.anInt2068 - 1] = var5;

				var2.anInt1706 = var2.aClass131_Sub20_Sub6_1978.anInt1465;
				var2.anInt1753 = var2.aClass131_Sub20_Sub6_1978.anInt1479;
				if (var2.anInt1753 == 0)
					var2.anInt1762 = 0;

				var2.anInt1710 = var2.aClass131_Sub20_Sub6_1978.anInt1471;
				var2.anInt1711 = var2.aClass131_Sub20_Sub6_1978.anInt1464;
				var2.anInt1712 = var2.aClass131_Sub20_Sub6_1978.anInt1484;
				var2.anInt1713 = var2.aClass131_Sub20_Sub6_1978.anInt1466;
				var2.anInt1707 = var2.aClass131_Sub20_Sub6_1978.anInt1460;
				var2.anInt1708 = var2.aClass131_Sub20_Sub6_1978.anInt1461;
				var2.anInt1725 = var2.aClass131_Sub20_Sub6_1978.anInt1486;
				var2.method1061(Class131_Sub11.myPlayer.anIntArray1755[0] + var9,
						var1 + Class131_Sub11.myPlayer.anIntArray1756[0], var8 == 1);
			}

			client.gameBuffer.method876();

			for (var5 = 0; var5 < client.anInt2068; ++var5) {
				var4 = client.anIntArray2025[var5];
				var2 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var4];
				var1 = client.gameBuffer.readUByte();
				if ((var1 & 16) != 0) {
					var2.aClass131_Sub20_Sub6_1978 = Class131_Sub20_Sub20
							.method879(client.gameBuffer.readULEShortA());
					var2.anInt1706 = var2.aClass131_Sub20_Sub6_1978.anInt1465;
					var2.anInt1753 = var2.aClass131_Sub20_Sub6_1978.anInt1479;
					var2.anInt1710 = var2.aClass131_Sub20_Sub6_1978.anInt1471;
					var2.anInt1711 = var2.aClass131_Sub20_Sub6_1978.anInt1464;
					var2.anInt1712 = var2.aClass131_Sub20_Sub6_1978.anInt1484;
					var2.anInt1713 = var2.aClass131_Sub20_Sub6_1978.anInt1466;
					var2.anInt1707 = var2.aClass131_Sub20_Sub6_1978.anInt1460;
					var2.anInt1708 = var2.aClass131_Sub20_Sub6_1978.anInt1461;
					var2.anInt1725 = var2.aClass131_Sub20_Sub6_1978.anInt1486;
				}

				if ((var1 & 4) != 0) {
					var2.anInt1726 = client.gameBuffer.readUshortA();
					if (var2.anInt1726 == '\uffff')
						var2.anInt1726 = -1;
				}

				if ((var1 & 64) != 0) {
					var2.anInt1737 = client.gameBuffer.readUShort();
					var3 = client.gameBuffer.readIntV1();
					var2.anInt1722 = var3 >> 16;
					var2.anInt1740 = client.anInt2038 + (var3 & '\uffff');
					var2.anInt1702 = 0;
					var2.anInt1739 = 0;
					if (var2.anInt1740 > client.anInt2038)
						var2.anInt1702 = -1;

					if (var2.anInt1737 == '\uffff')
						var2.anInt1737 = -1;
				}

				if ((var1 & 32) != 0) {
					var3 = client.gameBuffer.readULEShort();
					if (var3 == '\uffff')
						var3 = -1;

					var9 = client.gameBuffer.getUByteA();
					if ((var2.anInt1703 == var3) && (var3 != -1)) {
						var8 = Class131_Sub20_Sub19_Sub2_Sub1.method1066(var3).anInt1369;
						if (var8 == 1) {
							var2.anInt1733 = 0;
							var2.anInt1734 = 0;
							var2.anInt1735 = var9;
							var2.anInt1736 = 0;
						}

						if (var8 == 2)
							var2.anInt1736 = 0;
					} else if ((var3 == -1) || (var2.anInt1703 == -1) || (Class131_Sub20_Sub19_Sub2_Sub1.method1066(
							var3).anInt1363 >= Class131_Sub20_Sub19_Sub2_Sub1.method1066(var2.anInt1703).anInt1363)) {
						var2.anInt1703 = var3;
						var2.anInt1733 = 0;
						var2.anInt1734 = 0;
						var2.anInt1735 = var9;
						var2.anInt1736 = 0;
						var2.anInt1758 = var2.anInt1754;
					}
				}

				if ((var1 & 128) != 0) {
					var3 = client.gameBuffer.getUByteA();
					var9 = client.gameBuffer.getUByteC();
					var2.method926(var3, var9, client.anInt2038);
					var2.anInt1723 = 300 + client.anInt2038;
					var2.anInt1741 = client.gameBuffer.readUshortA();
					var2.anInt1715 = client.gameBuffer.readULEShort();
				}

				if ((var1 & 1) != 0) {
					var3 = client.gameBuffer.getUByteC();
					var9 = client.gameBuffer.getUByteC();
					var2.method926(var3, var9, client.anInt2038);
					var2.anInt1723 = client.anInt2038 + 300;
					var2.anInt1741 = client.gameBuffer.readULEShort();
					var2.anInt1715 = client.gameBuffer.readULEShortA();
				}

				if ((var1 & 2) != 0) {
					var2.aString1705 = client.gameBuffer.readString();
					var2.anInt1761 = 100;
				}

				if ((var1 & 8) != 0) {
					var3 = client.gameBuffer.readULEShortA();
					var9 = client.gameBuffer.readUshortA();
					var8 = var2.anInt1718
							- (64 * (var3 - Class131_Sub20_Sub20.anInt1649 - Class131_Sub20_Sub20.anInt1649));
					var10 = var2.anInt1759 - (64 * (var9 - Class50.anInt491 - Class50.anInt491));
					if ((var8 != 0) || (var10 != 0))
						var2.anInt1728 = (int) (Math.atan2(var8, var10) * 325.949D) & 2047;
				}
			}

			for (var5 = 0; var5 < client.anInt2061; ++var5) {
				var4 = client.anIntArray2151[var5];
				if (client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var4].anInt1747 != client.anInt2038) {
					client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var4].aClass131_Sub20_Sub6_1978 = null;
					client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var4] = null;
				}
			}

			if (client.gameBuffer.pos != client.messageSize)
				throw new RuntimeException(client.gameBuffer.pos + "," + client.messageSize);
			else
				for (var5 = 0; var5 < client.anInt2230; ++var5)
					if (client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[client.anIntArray2067[var5]] == null)
						throw new RuntimeException(var5 + "," + client.anInt2230);
		}
	}

	@Override
	public final void run() {
		while (true) {
			Class87 var2;
			synchronized (this) {
				while (true) {
					if (aBool643)
						return;

					if (aClass87_641 != null) {
						var2 = aClass87_641;
						aClass87_641 = aClass87_641.aClass87_713;
						if (aClass87_641 == null)
							aClass87_642 = null;
						break;
					}

					try {
						this.wait();
					} catch (final InterruptedException var8) {
						;
					}
				}
			}

			try {
				final int var5 = var2.anInt715;
				if (var5 == 1)
					var2.anObject716 = new Socket(InetAddress.getByName((String) var2.anObject717), var2.anInt712);
				else if (var5 == 2) {
					final Thread var3 = new Thread((Runnable) var2.anObject717);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var2.anInt712);
					var2.anObject716 = var3;
				} else if (var5 == 4)
					var2.anObject716 = new DataInputStream(((URL) var2.anObject717).openStream());
				else if (var5 == 3) {
					final String var10 = ((var2.anInt712 >> 24) & 255) + "." + ((var2.anInt712 >> 16) & 255) + "."
							+ ((var2.anInt712 >> 8) & 255) + "." + (var2.anInt712 & 255);
					var2.anObject716 = InetAddress.getByName(var10).getHostName();
				}

				var2.anInt714 = 1;
			} catch (final ThreadDeath var6) {
				throw var6;
			} catch (final Throwable var7) {
				var2.anInt714 = 2;
			}
		}
	}
}
