package ijavaadv4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import sun.awt.windows.WLightweightFramePeer;

public class Task2 {

	public static void main(String[] args) {
		List<Integer> list  = new ArrayList<>();
		list.add(89);
		list.add(45);
		list.add(13);
		
		Iterator iter = list.iterator();
		
		
//		list.remove(0);
//		list.remove(list.size()-1);
		
/*		int i=0;
		for( Iterator iter1 = list.iterator() ; iter1.hasNext();){
			iter1.next();
			if(i == 0 || i==list.size()){
			iter1.remove();
			}
			i++;
		}
	
		
for(Iterator iter1 = list.iterator();iter1.hasNext();){
	System.out.print(iter1.next()+" ");	
	}
System.out.println();	
*/	
	int i=0;
for(ListIterator iter2 = list.listIterator();iter2.hasNext();){
	iter2.next();
	if(iter2.hasNext() == false){
			
		while (iter2.hasPrevious() ) {
			System.out.print(iter2.previous()+" ");
		}
		break;
		
	}
}	
		
System.out.println("\n"+"----------------------------");
int lenght = (int)(Math.random()*11+5);
List<Integer> array = new ArrayList();

for (int i1=0;i1 < lenght ;i1++ ){
	array.add((int)(Math.random()*100));
	
}
for(Object value : array){
	System.out.print(value+" ");
}


ListIterator iterArr = array.listIterator();
int max=(int)iterArr.next();
while( iterArr.hasNext()){
	int subVarible = (int)iterArr.next();
	if(subVarible > max ){
		max=subVarible;
	}
}
ListIterator iterArr1 = array.listIterator();
int count=0;
int mid=0;
while (iterArr1.hasNext()) {
	int subvalue=(int)iterArr1.next();
	count++;
	if(count==Math.ceil((float)lenght/2)){
		mid=subvalue;
		subvalue=max;
	}
	
}
array.add(mid);

System.out.println("\n"+array);


	}

}
