package pattern;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Now implements Observer {
private Magazine magazine;
	
	public Now(Magazine magazine) {
		this.magazine = magazine;
		magazine.AddReader(this);
		
	}

	@Override
	public void outPut(String str) {
		if(str.equals("now")){
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd  'at' HH:mm:ss");
	        System.out.println("date: " + dateFormat.format( new Date() ) );
		}else if (str.equals(" ")){
			 SimpleDateFormat dateFormat = new SimpleDateFormat("'Time :' HH:mm:ss");
		        System.out.println("Date: " + dateFormat.format( new Date() ) );
		}
		
	}

}
