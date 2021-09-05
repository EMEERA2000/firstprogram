package com.src;

import java.util.TreeMap;
public class LeastKey {
	
		public static void main(String args[]) {
			 TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
			  tm.put(1, "pink");
			  tm.put(2, "blue");
			  tm.put(3, "green");
			  tm.put(4, "White");
			  tm.put(5, "Black");
			  System.out.println("TreeMap: "+tm);
			  
			  System.out.println("Keys are greater than or equal to 3: " + tm.ceilingEntry(3));
			  System.out.println("Keys are greater than or equal to 2: " + tm.ceilingEntry(2));
			  System.out.println("Keys are greater than or equal to 7: " + tm.ceilingEntry(7));
		 }
}