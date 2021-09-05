package com.src;

public class StringBufferex {

	public static void main(String[] args) {
           StringBuffer s = new StringBuffer();
        System.out.println(s);
        System.out.println();
        
      StringBuffer s1 = new StringBuffer("Meera");
        int a = s1.length();
        int  b= s1.capacity();
        System.out.println("Length of string =" + a);
        System.out.println("Capacity of string =" + b);
        System.out.println();
        
        StringBuffer s2 = new StringBuffer("Meera");
        s2.append("Elangovan");
        System.out.println(s2);
        s2.append(2000);
        System.out.println(s2);
        System.out.println();
        
        StringBuffer s3 = new StringBuffer("Meera Elangovan");
        s3.insert(5, 2000);
        System.out.println(s3);
        System.out.println();
        
        StringBuffer s4 = new StringBuffer("Meera");
        s4.replace(1, 4, "ab");
        System.out.println(s4);
        System.out.println();
        
        StringBuffer s5 = new StringBuffer("MeeraElangovan2000");
        s5.delete(0, 7);
        System.out.println(s5);
        s5.deleteCharAt(9);
        System.out.println(s5); 
        System.out.println();
        
        StringBuffer s6 = new StringBuffer("Meera Elangovan");
        s6.reverse();
        System.out.println(s6); 
        System.out.println();

	}

}