package pattern;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) throws SQLException, CloneNotSupportedException {
		Scanner in = new Scanner(System.in);
		 
		User user = new User();
		User userClone = user.clone();
		User userClone1 = user.clone();
		
		
		System.out.print(user.getClientname()+ " ");
		System.out.println(user.getAge());
		System.out.print(userClone.getClientname() + " ");
		System.out.println(userClone.getAge());
		
		System.out.println("***********************************************");
		
		System.out.println("Input NAME and AGE");
		String str = in.nextLine();
		String [] arrParams = str.split(" ");
		userClone.setAge(arrParams[1]);
		userClone.setClientname(arrParams[0]);
		
		System.out.print(user.getClientname()+ " "+user.getAge() +"\n");
		System.out.print(userClone.getClientname() + " " + userClone.getAge() +"\n");
		


	}

}
