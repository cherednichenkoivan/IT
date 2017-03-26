package pattern;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Show implements Observer {
	private Magazine magazine;
	
	public Show(Magazine magazine) {
		this.magazine = magazine;
		magazine.AddReader(this);
		
	}

	@Override
	public void outPut(String str) {
		if(str.equals("show"))
		System.out.println("First reader");
	}



}
