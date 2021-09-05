package com.src;

import java.util.HashMap;
public class MapValue 
{
	public static void main(String args[]) {
		  HashMap<Integer,String> hm = new HashMap<Integer,String>();
		  hm.put(1, "pink");
		  hm.put(2, "orange");
		  hm.put(3, "Blue");
		  hm.put(4, "White");
		  hm.put(5, "Black");
		  System.out.println("The Original map: " + hm);
          
		  System.out.println("1.white");
		  if (hm.containsValue("white")) 
		  {
		    System.out.println("Yes!");
		  } 
		  else
		  {
		    System.out.println("No!");
		  }
		  
          System.out.println("--------------------------------------------------");
          
		  System.out.println("2.violet");
		  if (hm.containsValue("violet"))
		  {
			System.out.println("Yes!");
		  }
		  else
		  {
			  System.out.println("No!");
		  }

	}
}