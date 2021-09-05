package com.src;

import java.util.Scanner;
import java.util.TreeSet;
public class TreeSetLess {
		  public static void main(String[] args) {
			  System.out.println("Enter two numbers:");
		   Scanner sc=new Scanner(System.in);
		   int a=sc.nextInt();
		   int b=sc.nextInt();
		   TreeSet<Integer> ts = new TreeSet<Integer>();

		   ts.add(99);
		   ts.add(96);
		   ts.add(36);
		   ts.add(86);
		   ts.add(47);
		   ts.add(27);
		   ts.add(92);
		   ts.add(49);
		   ts.add(21);
		   System.out.println(ts);
		   System.out.println("Less than a : "+ts.floor(a));
		   System.out.println("Less than b : "+ts.floor(b));
		   }    
}

