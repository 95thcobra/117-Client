public class GrandExchangeOffer {
	byte aByte893;
	public int anInt894;
	public int anInt895;
	public int anInt898;
	public int anInt897;
	public int anInt896;

	void method495(final int var1) {
		aByte893 &= -8;
		aByte893 = (byte) (aByte893 | (var1 & 7));
	}

	public int method496() {
		return aByte893 & 7;
	}

	public int method497() {
		return (aByte893 & 8) == 8 ? 1 : 0;
	}

	public GrandExchangeOffer(final DataBuffer var1, final boolean var2) {
		aByte893 = var1.method584();
		anInt894 = var1.readUShort();
		anInt895 = var1.readIntV1();
		anInt898 = var1.readIntV1();
		anInt897 = var1.readIntV1();
		anInt896 = var1.readIntV1();
	}

	public GrandExchangeOffer() {
	}

	void method498(final int var1) {
		aByte893 &= -9;
		if (var1 == 1)
			aByte893 = (byte) (aByte893 | 8);

	}
}
