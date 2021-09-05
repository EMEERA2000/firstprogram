package com.src;

import java.util.Scanner;
import java.util.function.IntFunction;

public class FibonacciSeries{

	public static void main(String[] args) {
		IntFunction fi=(o1)->
		{
			 int a=0,b=1,c=0;
			 if(o1==0)
			 {
				 return a;
			 }
			 else if(o1==1)
			 {
				 return b;
			 }
			 for(int i=2;i<=o1;++i)
			 {    
			    c=a+b;        
			    a=b;    
			    b=c;    
			 } 
			 return c;
		};
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		System.out.println("The "+d+" element of a fibonacci series is:"+fi.apply(d));

	}

}
