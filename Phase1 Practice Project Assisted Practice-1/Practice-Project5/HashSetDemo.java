package JavaS2;

import java.util.HashSet;

	public class HashSetDemo {
		
		public static void main(String[] args) {
	
			
			HashSet<Integer> set= new HashSet<Integer>();
			
			set.add(10);
			set.add(20);
			set.add(30);
			set.add(40);
			set.add(50);
			set.add(60);
			set.add(null);
			
			System.out.println("Size: "+set.size());
			
			System.out.println(set);
			
			System.out.println("Contains: "+ set.contains(50));
			
			set.remove(null);

		}

	}

