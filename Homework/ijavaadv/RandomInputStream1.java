package ijavaadv;


import java.io.IOException;
import java.io.InputStream;





public class RandomInputStream1 extends InputStream {
	int number;
	
	final int MIN_LENGTH = 5;
	final int MAX_LENGTH = 20;
	int lenght = (int)(Math.random()*MAX_LENGTH+MIN_LENGTH);
	int mark=lenght;
	public RandomInputStream1() {
		
	
	}
		
	

	@Override
	public int read() throws IOException {
		
		if(lenght != 0){
			lenght--;
			return  number = (int)(Math.random()*100);
			
		}else
		
		return -1;
	}
	@Override
	public boolean markSupported() {
		
		return true;
	}
	
	@Override
	public synchronized void mark(int readlimit) {
		if (mark>=readlimit) mark=readlimit;
		
	}
	
	@Override
	public synchronized void reset() throws IOException {
		lenght=mark;
	}
	
	
	

}
