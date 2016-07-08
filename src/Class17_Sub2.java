import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Class17_Sub2 extends Class17 {
	SourceDataLine aSourceDataLine1000;
	int anInt999;
	AudioFormat anAudioFormat1001;
	byte[] aByteArray1002;

	@Override
	void method78() {
		aSourceDataLine1000.flush();
	}

	@Override
	void method73() {
		int var1 = 256;
		if (aBool166)
			var1 <<= 1;

		for (int var3 = 0; var3 < var1; ++var3) {
			int var2 = anIntArray158[var3];
			if (((var2 + 8388608) & -16777216) != 0)
				var2 = 8388607 ^ (var2 >> 31);

			aByteArray1002[2 * var3] = (byte) (var2 >> 8);
			aByteArray1002[(var3 * 2) + 1] = (byte) (var2 >> 16);
		}

		aSourceDataLine1000.write(aByteArray1002, 0, var1 << 1);
	}

	@Override
	void method79() {
		if (null != aSourceDataLine1000) {
			aSourceDataLine1000.close();
			aSourceDataLine1000 = null;
		}

	}

	@Override
	void method72(final int var1) throws LineUnavailableException {
		try {
			final Info var2 = new Info(SourceDataLine.class, anAudioFormat1001, var1 << (aBool166 ? 2 : 1));
			aSourceDataLine1000 = (SourceDataLine) AudioSystem.getLine(var2);
			aSourceDataLine1000.open();
			aSourceDataLine1000.start();
			anInt999 = var1;
		} catch (final LineUnavailableException var7) {
			int var3 = (var1 & 1431655765) + ((var1 >>> 1) & 1431655765);
			var3 = ((var3 >>> 2) & 858993459) + (var3 & 858993459);
			var3 = (var3 + (var3 >>> 4)) & 252645135;
			var3 += var3 >>> 8;
			var3 += var3 >>> 16;
			final int var4 = var3 & 255;
			if (var4 != 1) {
				int var5 = var1 - 1;
				var5 |= var5 >>> 1;
				var5 |= var5 >>> 2;
				var5 |= var5 >>> 4;
				var5 |= var5 >>> 8;
				var5 |= var5 >>> 16;
				final int var6 = var5 + 1;
				method72(var6);
			} else {
				aSourceDataLine1000 = null;
				throw var7;
			}
		}
	}

	@Override
	void method71(final Component var1) {
		anAudioFormat1001 = new AudioFormat(anInt162, 16, aBool166 ? 2 : 1, true, false);
		aByteArray1002 = new byte[256 << (aBool166 ? 2 : 1)];
	}

	@Override
	int method80() {
		return anInt999 - (aSourceDataLine1000.available() >> (!aBool166 ? 1 : 2));
	}
}
