package JavaS2;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>(); 
		
		set.add("NewYork");
		set.add("Dallas");
		set.add("Spring Field");
		set.add("California");

		
		System.out.println(set);
		
		System.out.println("Size: "+set.size());
		
		System.out.println("Contains: "+ set.contains("Dallas"));
		
		
	}

}
