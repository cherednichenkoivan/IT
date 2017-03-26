package ijavaadv;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		RandomInputStream1 methodRead = new RandomInputStream1();
		
		while(methodRead.read() != -1){
			System.out.println(methodRead.read());
		}
		
		System.out.println(methodRead.markSupported());
		
		
		

	}

}
