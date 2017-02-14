package lesson1;

import java.util.Date;
import java.util.Locale;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.printf("%s %n",new Date());
        System.out.printf("%h %n",'h');
        System.out.println((int)'h');
        double real = Math.PI;
        System.out.format(new Locale("uk","uk"),"%-20.10f  %n",real);
        System.out.printf("%tc",new Date(-(1900+100-1),3,1));
        System.out.println("hello");
    }
}
