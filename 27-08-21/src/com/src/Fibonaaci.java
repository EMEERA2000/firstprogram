package com.src;

import java.util.Scanner;
import java.util.function.IntFunction;

public class Fibonaaci {

	public static void main(String[] args) {
		IntFunction fi=(o1)->
		{
		 int a=0,b=1,c,sum=0;
		 for(int i=0;i<=o1;++i)
		 {    
		    c=a+b; 
		    if(c%2==0)
		    {
		    	sum=sum+c;
		    }
		    a=b;    
		    b=c;    
		 } 
		 return sum;
	  };
	  System.out.println("Enter a number:");
	  Scanner sc=new Scanner(System.in);
	  int d=sc.nextInt();
	  System.out.println("The even numbers until "+d+" element is:"+fi.apply(d));

	}

}
