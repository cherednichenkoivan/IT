package CaesarCipherStream;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CaesarOutpuStream extends FilterOutputStream {

	public CaesarOutpuStream(OutputStream out) {
		super(out);
		
	}
	@Override
	public void write(int b) throws IOException {
		
		System.out.println(b +" number");
	}
	

}
