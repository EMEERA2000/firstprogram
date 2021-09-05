package com.src;

import java.util.TreeMap;

public class KeysGreateroeEqual {
	public static void main(String args[]) {
		 TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		  tm.put(1, "pink");
		  tm.put(2, "blue");
		  tm.put(3, "orange");
		  tm.put(4, "violet");
		  tm.put(5, "black");
		  System.out.println("TreeMap: "+tm);
		  
		  System.out.println("Keys are greater than or equal to 2: " + tm.tailMap(2));
	 }
}

