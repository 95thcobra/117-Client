import java.nio.ByteBuffer;

public class Class56_Sub1 extends Class56 {
	ByteBuffer aByteBuffer1112;

	@Override
	byte[] method277(final int var1) {
		final byte[] var2 = new byte[aByteBuffer1112.capacity()];
		aByteBuffer1112.position(0);
		aByteBuffer1112.get(var2);
		return var2;
	}

	@Override
	void method276(final byte[] var1, final byte var2) {
		aByteBuffer1112 = ByteBuffer.allocateDirect(var1.length);
		aByteBuffer1112.position(0);
		aByteBuffer1112.put(var1);
	}
}
