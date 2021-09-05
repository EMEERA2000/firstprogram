package com.src;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashtoTree{
		@SuppressWarnings("unchecked")
		public static void main(String[] args) {
			Set hs=new HashSet();
			hs.add("Meera");
			hs.add("Madhura");
			hs.add("sai");
		                 hs.add("ram");
		                System.out.println("HashSet "+hs);
			Set ts=new TreeSet(hs);
			System.out.println("TreeSet "+ts);
			
			

	}

}