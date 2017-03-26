package ijavaadv4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TryingOutList {
	List<?> list = new ArrayList<>();

	public void asList(Integer [] myarray ){
		
		list = Arrays.asList(myarray);
		
		for (Object value : list){
			System.out.print(value+" ");
		}
		System.out.println();
	
	}
	
	public void printRm(){
		List <Integer> myArra = new ArrayList<>();
		
		for(int i=0; i < 10;i++){
			myArra.add(i);
		}
		
		for(int i=0; i < 3; i++){
		myArra.remove(0);
		myArra.remove(myArra.size()-1);
	}
	
	for(Object value : myArra ){
	System.out.print(value+" ");	
	}
	
	}
	
	
}
