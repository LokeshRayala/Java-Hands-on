package JavaS2;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		
		LinkedHashSet<String> linkedset= new LinkedHashSet<String>();
		
		linkedset.add("A");
		linkedset.add("B");
		linkedset.add("C");
		linkedset.add("D");
		
		linkedset.add("A");
		linkedset.add("E");
		linkedset.add(null);
		
		System.out.println("Size: "+linkedset.size());
		
		System.out.println(linkedset);
		
		
		System.out.println("Contains E: "+linkedset.contains("E"));
		
		System.out.println("Contains G: "+linkedset.contains("G"));
		
		linkedset.remove(null);
		
		System.out.println("After Remove: "+linkedset);

	}


}
