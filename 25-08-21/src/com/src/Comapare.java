package com.src;

import java.util.HashSet;
import java.util.Set;

public class Comapare {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Set<String> hs=new HashSet<>();
		hs.add("Meera");
		hs.add("Madhura");
		hs.add("sai");
		hs.add("ram");
		
	                 System.out.println("HashSet "+hs);
		Set<String> hs1=new HashSet<>();
		hs1.add("Meera");
		hs1.add("Madhura");
		hs1.add("sai");
		hs1.add("ram");
		
		System.out.println("TreeSet "+hs1);
		System.out.println(hs.equals(hs1));
		
		System.out.println();
		
		Set<String> hs2=new HashSet<>();
		hs2.add("Meera");
		hs2.add("Ashmia");
		hs2.add("sai");
		hs2.add("ram");
		
		System.out.println("HashSet "+hs2);
		Set<String> hs3=new HashSet<>();
		hs3.add("Meena");
		hs3.add("Ashima");
		hs3.add("sai");
		hs3.add("ram");
		
		System.out.println("TreeSet "+hs3);
		System.out.println(hs2.equals(hs3));
	}
}

