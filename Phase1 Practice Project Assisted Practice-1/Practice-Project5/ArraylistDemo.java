package JavaS2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {
public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>();
		
		System.out.println("Initial Size:"+list.size());
		
		list.add("Apple");
		list.add("Berry");
		list.add("Cashew");
		list.add("Apple");// duplicate value are allowed in list
		list.add(null);// list contains null value
		
		System.out.println("After Adding an Elements :"+list.size());
		System.out.println(list);
		
		System.out.println("Element at index 3: "+list.get(3));
		list.add("Pizza");
		
		System.out.println(list);
		
		System.out.println("List Contains Apple? :"+list.contains("Apple"));
		
		
		list.remove(0);
		list.remove(null);
		
		System.out.println(list);
		
		
		//iterate using iterator
		Iterator<String> itr= list.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Using Iterator: "+itr.next());
		}
	
	}


}
