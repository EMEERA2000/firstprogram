package com.src;

import java.util.ArrayList;

public class ArrayPosition {
     @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Meera");
		al.add("Ashmi");
		al.add("ram");
		al.add("Laksana");
		al.add("sai");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

	}

}
