package com.maps;

import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		
		// Hashmap
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		
		  System.out.println("Initial Size: "+hm.size());
		  
	      hm.put(1,"Arjun");    
	      hm.put(2,"Bill");    
	      hm.put(3,"Chloe");
	      hm.put(4,"Denver");    
	      hm.put(5,"Ergon");
	      
	      
	      System.out.println();
	      System.out.println("Get element at key 2: "+hm.get(2));
		
	      System.out.println("Get element at key 3: "+hm.get(3));
			
	      System.out.println("Get element at key 5: "+hm.get(5));
	      System.out.println();
	      
	      System.out.println("Size After adding elements: "+hm.size());
	      
	      hm.remove(5);
	      
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	       
	      }
	      
	  }
}
