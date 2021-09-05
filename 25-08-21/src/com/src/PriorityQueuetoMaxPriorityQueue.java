package com.src;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueuetoMaxPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10, Collections.reverseOrder());
	     
		   pq.offer(10);
	   pq.offer(27);
	   pq.offer(78);
	   pq.offer(98);
	   pq.offer(49);
	   pq.offer(43);
                     pq.offer(10);
	   pq.offer(27);
	   pq.offer(87);
	   pq.offer(80);
	   
		  
		   System.out.println("Priority Queue: "+pq);
		   System.out.print("Maximum Priority Queue: ");
		   Integer val = null;
		   while( (val = pq.poll()) != null)
		   {
		       System.out.print(val+"  ");
		         
		   }
		     
	}

}
