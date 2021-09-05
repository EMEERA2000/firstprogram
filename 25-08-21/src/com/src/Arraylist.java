package com.src;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
     @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List al=new ArrayList();
		al.add(10);
		al.add("Meera");
		al.add(20);
		al.add("Madhura");
		al.add(30);
		al.add("Sriram");
		System.out.println(al);
		al.add(0,40);
		System.out.println(al);

	}

}
