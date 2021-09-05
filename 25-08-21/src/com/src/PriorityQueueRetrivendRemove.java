package com.src;

import java.util.PriorityQueue;

public class PriorityQueueRetrivendRemove {
	
		  public static void main(String[] args) {
			 
		   PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		     
                    pq.offer(10);
	   pq.offer(27);
	   pq.offer(78);
	   pq.offer(98);
	   pq.offer(49);
	   pq.offer(43);
		  
		   System.out.println("Original PriorityQueue: "+pq);
		   System.out.println("Retrived element: "+pq.peek());
		   pq.remove();
		   System.out.println("After element removed in priorityQueue: "+pq);
		   }    

}