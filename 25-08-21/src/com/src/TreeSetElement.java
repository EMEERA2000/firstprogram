package com.src;

import java.util.Scanner;
import java.util.TreeSet;
public class TreeSetElement {
		
			  public static void main(String[] args) {
				  System.out.println("Enter a number:");
				  Scanner sc=new Scanner(System.in);
				  int a=sc.nextInt();
			   TreeSet<Integer> ts = new TreeSet<Integer>();
			     
			   ts.add(10);
	   ts.add(27);
	   ts.add(78);
	   ts.add(98);
	   ts.add(49);
	   ts.add(43);
			   System.out.println("Original tree set: "+ts);
			   System.out.println("Removed element: "+ts.remove(a));
			   System.out.println("Tree set after removing one element: "+ts);
			   }    
}

