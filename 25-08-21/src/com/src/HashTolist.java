package com.src;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class HashTolist {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Set hs=new HashSet();
		hs.add("Meera");
		hs.add("Madhura");
		hs.add("sai");
		hs.add("ram");
		
		System.out.println("HashSet "+hs);
		List li=new ArrayList(hs);
		System.out.println("List "+li);
	}
}