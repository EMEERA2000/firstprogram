package com.src;

public class StringBuilderex {

	public static void main(String[] args) {
		StringBuilder b=new StringBuilder("Meera ");
		b.append("Elangovan");
		System.out.println(b);
		System.out.println();
		
		StringBuilder b1=new StringBuilder("EMeera");  
		b1.insert(1,"langovan");
		System.out.println(b1);
		System.out.println();
		
		StringBuilder b2=new StringBuilder("Meera");  
		b2.replace(1,3,"Elango");  
		System.out.println(b2);
		System.out.println();
		
		StringBuilder b3=new StringBuilder("Meera Elangovan");  
		b3.delete(6,9);  
		System.out.println(b3);
		System.out.println();
		
		StringBuilder b4=new StringBuilder("Rain");  
		b4.reverse();  
		System.out.println(b4);
		System.out.println();
		
		StringBuilder b5=new StringBuilder("Rainbow");    
		System.out.println(b5.capacity());
		System.out.println();
		
		StringBuilder b6=new StringBuilder();    
		System.out.println(b6.capacity());    
		b6.append("Meera");    
		System.out.println(b6.capacity());   
		b6.append("I Like rain");    
		System.out.println(b6.capacity());
		System.out.println();
	}

}