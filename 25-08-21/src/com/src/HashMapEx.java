package com.src;

import java.util.HashMap;
import java.util.Set; 
public class HashMapEx {
	     public static void main(String args[]) {
	  HashMap<Integer,String> hm = new HashMap<Integer,String>();
	  hm.put(1, "pink");
	  hm.put(2, "black");
	  hm.put(3, "green");
	  hm.put(4, "orange");
	  System.out.println("HashMap: "+hm);
	  
	  Set set = hm.entrySet();
	  System.out.println("Set values: " + set);
	 }
}