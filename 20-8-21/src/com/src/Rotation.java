package com.src;

public class Rotation {

	public static void main(String[] args) {
		String s1="Meera";
		StringBuilder s2=new StringBuilder("areeM");
		String s3=s2.reverse().toString();
		if(s1.equals(s3))
		{
			System.out.println("Two String are rotation of each other");
		}
		else 
		{
			System.out.println("Two String are not a rotation of each other");
		}

	}

}