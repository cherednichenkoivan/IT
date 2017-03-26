package pattern;

public class Exit implements Observer {
	private Magazine magazine;
	
	public Exit(Magazine magazine) {
		this.magazine = magazine;
		magazine.AddReader(this);
		
	}


	@Override
	public void outPut(String str) {
		
		if(str.equals("exit")){
		System.out.println("Exit");
		System.exit(0);
		}
		
	}
}
