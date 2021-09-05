package com.src;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIteration {
       @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(90);
		al.add(80);
		al.add(70);
		al.add(60);
		al.add(50);
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
