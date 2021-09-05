package com.src;

import java.util.PriorityQueue;

public class PriorityQueuetoArray {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		 pq.offer(10);
	   pq.offer(27);
	   pq.offer(78);
	   pq.offer(98);
	   pq.offer(49);
	   pq.offer(43);
		  System.out.println("Priority Queue: "+pq);
		Integer arr[]=new Integer[pq.size()];
	    Integer b[]=pq.toArray(arr);
	    int j=0;
		for(int i:b)
		{
			System.out.println("Array of "+j+" is: "+i);
			j++;
		}
	}

}
