package CaesarCipherStream;

import java.io.IOException;

import ijavaadv.RandomInputStream1;

public class Demo {
	public static void main(String[] args) throws IOException {
	CaesarInputStream caesIn = new CaesarInputStream(new RandomInputStream1());
	CaesarOutpuStream caesarOu = new CaesarOutpuStream(null);


		int value;
		while ( (value = caesIn.read()) != -1) {
			caesarOu.write(value);	
	  }
		
	}
}
