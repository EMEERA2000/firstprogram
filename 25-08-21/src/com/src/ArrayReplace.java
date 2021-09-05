package com.src;

import java.util.ArrayList;

public class ArrayReplace {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(90);
		al.add(80);
		al.add(70);
		al.add(60);
		al.add(50);
		System.out.println(al);
		al.set(1, 100);
		System.out.println(al);
	}

}

