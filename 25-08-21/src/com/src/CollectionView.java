package com.src;

import java.util.Collection;
import java.util.HashMap;

public class CollectionView {
	public static void main(String args[]) {
		  HashMap<Integer,String> hm = new HashMap<Integer,String>();
		  hm.put(1, "pink");
		  hm.put(2, "white");
		  hm.put(3, "baby pink");
		  hm.put(4, "orange");
		  hm.put(5, "yellow");
		  System.out.println("HashMap: "+hm);
		  
		  Collection c=hm.values();
		  System.out.println("Collection view of map: "+c);
	}
}
