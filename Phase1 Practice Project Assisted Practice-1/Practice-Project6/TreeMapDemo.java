package com.maps;

import java.util.*;


public class TreeMapDemo {
	public static void main(String[] args) {
		 TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		 
		 System.out.println("Initial Size: "+map.size());
		 
	      map.put(1,"Holland");    
	      map.put(2,"Iris");    
	      map.put(3,"Jelly");
	      map.put(4,"King");    
	      map.put(5,"Luthor");
	      
	      
	      System.out.println();
	      System.out.println("Get element at key 2: "+map.get(2));
	  	
	      System.out.println("Get element at key 3: "+map.get(3));
	  		
	      System.out.println("Get element at key 5: "+map.get(4));
	      System.out.println();
	      
	      
	      System.out.println();
	      System.out.println("Size After adding elements: "+map.size());
	      
	      map.remove(3);
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue()); 
	       
	      }
	}
}
