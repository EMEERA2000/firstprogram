package com.src;

import java.util.ArrayList;

public class Arraysizeinc {
     public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>(4);
		al.add(90);
		al.add(80);
		al.add(70);
		al.add(60);
                                   al.add(50);
		System.out.println("Original arraylist "+al);
		al.ensureCapacity(6);
		al.add(40);
		System.out.println("new arraylist "+al);

	}

}
