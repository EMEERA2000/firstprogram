package com.src;

import java.util.ArrayList;

public class ArrayEmpty {
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(90);
		al.add(80);
		al.add(70);
		al.add(60);
		al.add(50);
		System.out.println(al);
		System.out.println(al.isEmpty());
		al.removeAll(al);
		System.out.println(al.isEmpty());

	}

}
