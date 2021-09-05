package com.src;

import java.util.Scanner;
public class Reverse {

	static void reverseWords(String str)
	{
		int k=0;
		
        for (int l= k; l < str.length(); l++) 
        {
        	if(l==str.length()-1)
        	{
        		for(int h=l;h>=k;h--)
                {
               	 System.out.print(str.charAt(h));
                }
        		System.out.print(" ");
        	}
        	else if (str.charAt(l) == ' ')
            {
                for(int h=l-1;h>=k;h--)
                {
            	 System.out.print(str.charAt(h));
                }
                System.out.print(" ");
                k=l+1;
            }
        }
 }

 public static void main(String[] args)
 {
	    System.out.println("Enter a String:");
	 	Scanner sc=new Scanner(System.in);
	 	String s1 = sc.nextLine();
        reverseWords(s1);

 }
}

