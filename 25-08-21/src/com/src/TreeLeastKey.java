package com.src;

import java.util.TreeMap;

public class TreeLeastKey {
	public static void main(String args[]) {
		 TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		  tm.put(1, "Red");		  
                                    tm.put(2, "Green");
		  tm.put(3, "Black");
		  tm.put(4, "White");
		  tm.put(5, "Blue");
		  System.out.println("TreeMap: "+tm);
		  
		  System.out.println("Keys are greater than or equal to 2: " + tm.ceilingKey(2));
		  System.out.println("Keys are greater than or equal to 4: " + tm.ceilingKey(4));
		  System.out.println("Keys are greater than or equal to 8: " + tm.ceilingKey(8));
	 }
}
