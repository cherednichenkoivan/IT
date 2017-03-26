package pattern;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main2 {

	public static void main(String[] args) {
		Magazine magazine = new Magazine();
		Show show = new Show(magazine);
		Now now = new Now(magazine);
		Exit exit = new Exit(magazine);
		magazine.setCommand();

	}

}
