package com.src;

public class Stringsex {

	public static void main(String[] args) {
		String s=new String();
		System.out.println(s);
		System.out.println();
		
		String s1=new String("Meera");
		System.out.println(s1);
		System.out.println();
		
		char a[]= {'c','f','g'};
		String s2=new String(a);
		System.out.println(s2);
		System.out.println();
		
		char b[]= {'a','m','e','e','o','r'};
        String s3=new String(b,0,4);
        System.out.println(s3);
        System.out.println();
        
        byte m[]= {35,28,48,90,10};
        String s4=new String(m);
        System.out.println(s4);
        System.out.println();
        
        byte n[]= {36,63,89,98,20};
        String s5=new String(n,1,3);
        System.out.println(s5);
        System.out.println();
	}

}
