package com.src;

import java.util.HashSet;
public class RemoveElement {

	    public static void main(String args[])
	    {
	        
	        HashSet<String> set = new HashSet<String>();
	        set.add("I");
                          set.add("am");
	        set.add("Meera");
	        set.add("B.TECH");
	        
	        System.out.println("HashSet: " + set);
	  
	        set.clear();
	  
	        System.out.println("The final set: " + set);
	    }

}
