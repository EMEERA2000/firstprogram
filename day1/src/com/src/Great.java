package com.src;

public class Great{
public static int a=10;
int b=20;
public static void main(String args[]){
	Great g=new Great();
System.out.println((a>g.b)? a:g.b);
}
}
