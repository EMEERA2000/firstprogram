package com.src;

import java.util.ArrayList;
import java.util.List;

public class Arrayspecific {
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(90);
		l.add(80);
		l.add(70);
		l.add(60);
		l.add(50);
		System.out.println(l);
		System.out.println(l.get(2));

	}

}
