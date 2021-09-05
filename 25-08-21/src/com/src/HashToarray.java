package com.src;

import java.util.HashSet;

public class HashToarray {
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("Meera");
		hs.add("Madhura");
		hs.add("sai");
		hs.add("ram");
		
		System.out.println(hs);
		String s[]=new String[hs.size()];
        hs.toArray(s);
        for(String s1:s)
        {
        	System.out.println(s1);
        }
       
	}

}