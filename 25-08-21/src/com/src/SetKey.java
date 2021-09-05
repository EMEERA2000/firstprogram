package com.src;

import java.util.HashMap;
import java.util.Set;

public class SetKey {
	public static void main(String args[]) {
		  HashMap<Integer,String> hm = new HashMap<Integer,String>();
		  hm.put(1, "pink");
		  hm.put(2, "blue");
		  hm.put(3, "green");
		  hm.put(4, "black");
		  System.out.println("HashMap: "+hm);
		  
		  Set set = hm.keySet();
		  System.out.println("Set values of keys: " + set);
	}
}