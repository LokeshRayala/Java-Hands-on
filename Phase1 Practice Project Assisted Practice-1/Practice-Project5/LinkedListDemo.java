package JavaS2;

import java.util.LinkedList;

public class LinkedListDemo {
	
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list= new LinkedList<Integer>();
		
		list.add(56);
		list.add(67);
		list.add(89);
		list.add(13);
		
		System.out.println("Size: "+list.size());
		System.out.println(list);
		
		list.remove(3);
		
		System.out.println(list);
		
		System.out.println("Element 2: "+list.get(2));
		list.add(2,0);
		
		System.out.println(list);
		
		System.out.println("First Element: "+list.getFirst());
		
		System.out.println("Last Element: "+list.getLast());

	}

}