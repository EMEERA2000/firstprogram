package com.src;

import java.util.HashMap;

public class SpecificKey {
	public static void main(String args[]) {
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	  hm.put(1, "pink");
	  hm.put(2, "blue");
	  hm.put(3, "orange");
	  hm.put(4, "voilet");
	  hm.put(5, "Black");
	  System.out.println("Hashmap: " + hm);
	  
	  System.out.println("Specific Key: "+hm.get(2));
	  
}
}

