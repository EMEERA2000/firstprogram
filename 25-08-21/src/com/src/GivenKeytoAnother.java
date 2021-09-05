package com.src;

import java.util.SortedMap;
import java.util.TreeMap;

public class GivenKeytoAnother {
	 public static void main(String args[]) {
		 TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		  SortedMap<Integer,String> sm = new TreeMap<Integer,String>();
		  tm.put(10, "pink");
	                     tm.put(2, "blue");
	                      tm.put(3, "orange"); 
                                     tm.put(4, "voilet");
	                     tm.put(5, "Black");
		  System.out.println("TreeMap: "+tm);
		  
		  sm=tm.subMap(20,50);
		  System.out.println("Sub map: "+sm);
	 }
}
