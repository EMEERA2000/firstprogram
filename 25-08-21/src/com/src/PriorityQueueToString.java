package com.src;

import java.util.PriorityQueue;

public class PriorityQueueToString {

	public static void main(String[] args) {
PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.offer(10);
	   pq.offer(27);
	   pq.offer(78);
	   pq.offer(98);
	   pq.offer(49);
	   pq.offer(43);
		System.out.println("Priority Queue: "+ pq);
		String s=pq.toString();
		System.out.println("String is:"+s);

	}

}
