package com.maps;


import java.util.*;

public class HashTableDemo {
	public static void main(String[] args) {
		
	Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	
	System.out.println("Initial Size: "+ht.size());
    
    ht.put(1,"Duke");  
    ht.put(2,"Eoin");  
    ht.put(3,"Fred");  
    ht.put(4,"George");  
    
    System.out.println();
    System.out.println("Get element at key 2: "+ht.get(2));
	
    System.out.println("Get element at key 3: "+ht.get(3));
		
    System.out.println("Get element at key 5: "+ht.get(4));
    System.out.println();
    
    System.out.println();
    System.out.println("Size After adding elements: "+ht.size());
    
    
    ht.remove(2);
    System.out.println("\nThe elements of HashTable are ");  
    for(Map.Entry n:ht.entrySet()){    
     System.out.println(n.getKey()+" "+n.getValue());    
    }
    
  }
}
