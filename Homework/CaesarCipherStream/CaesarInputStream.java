package CaesarCipherStream;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CaesarInputStream extends FilterInputStream {
	private int shift=5;
	

	protected CaesarInputStream(InputStream in) {
		super(in);
	}


	@Override
	public int read() throws IOException {
		int value = in.read();
		if (value != -1) {
			return value + shift;
		} else
			return -1;
	}
}
