package JavaS2;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

public static void main(String[] args) {
	
		PriorityQueue<Integer> pQueue= new PriorityQueue<Integer>(); 
		
		pQueue.add(56);
		pQueue.add(67);
		pQueue.add(89);
		pQueue.add(13);
		
		
		//print priority queue
		
		System.out.println(pQueue);
		
		
		//print the top element of priority queue
		System.out.println("Top Element: " + pQueue.peek());
		
		
		//printing the top element and removing it from the priority queue container
		System.out.println("Printing the top element and removing: "+pQueue.poll());
		System.out.println(pQueue);
		
		//print the top element of priority queue
		System.out.println("Top Element: " + pQueue.peek());
		
		
		//remove element from pqueue
		
		pQueue.remove(67);
	
		
		System.out.println("After Remove : "+pQueue);

	}

}
