package pattern;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Magazine implements Observable {
	private Scanner in;
	private List<Observer> observers;
	private String str;
	
	
 public Magazine() {
	 observers = new LinkedList<>();
	
 }
	@Override
	public void AddReader(Observer o) {
		observers.add(o);
		
		
	}

	@Override
	public void removeReader(Observer o) {
		
		observers.remove(o);
	}

	@Override
	public void notifyReader() {
	
			for (Observer observer : observers)
	            observer.outPut(str);
	} 
	
	
	
	
	public void setCommand(){
		NoCommand();
		while (true) {
			in = new Scanner(System.in);
			if (in.hasNext()){
				this.str = (String) in.next();
				notifyReader();
			}
		}
		
				
	}
	
	private  void NoCommand(){
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {
				str = " ";
				notifyReader();
			}

		}, 0, 4, TimeUnit.SECONDS);
	}
	
	
	
	
	
	
	
	

}
