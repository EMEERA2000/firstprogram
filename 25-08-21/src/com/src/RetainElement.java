package com.src;

import java.util.HashSet;
public class RetainElement {
	  public static void main(String[] args) {
	
	        HashSet<String> hs1 = new HashSet<String>();
	     
	          hs1.add("pink");
	          hs1.add("red");
	          hs1.add("black");
	          hs1.add("white");
	          System.out.println("Frist Set : "+hs1);
	          
	          HashSet<String>hs2 = new HashSet<String>();
	          hs2.add("pink");
	          hs2.add("orange");
	          hs2.add("black");
	          hs2.add("brown");
	          System.out.println("Second Set : "+hs2);
	          hs1.retainAll(hs2);
	          System.out.println("Both Set :");
	          System.out.println(hs1);
	     }
	
}