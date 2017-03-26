package ijavaadv;

import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.GregorianCalendar;

import ijavaadv.Person.Temper;

public class Human {
	

	public static void main(String[] args) {
		
		Person first = new Person("Pertov", "Shiskin", true, 
				new GregorianCalendar(1992, 9, 15), "258-45-69",Temper.SANGUINE);
	

		System.out.printf("%s %n",first);
	}

}
