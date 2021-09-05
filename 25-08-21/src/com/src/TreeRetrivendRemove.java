package com.src;

import java.util.TreeSet;
public class TreeRetrivendRemove {
	
		  public static void main(String[] args) {
		   TreeSet<Integer> ts = new TreeSet<Integer>();
		     
                   ts.add(10);
	   ts.add(27);
	   ts.add(78);
	   ts.add(67);
	   ts.add(49);
	   ts.add(43);
		   System.out.println("Original tree set: "+ts);
		   System.out.println("Removes the first element: "+ts.pollLast());
		   System.out.println("Tree set after removing first element: "+ts);
		   }    
}
