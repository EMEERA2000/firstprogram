package com.src;

import java.util.Scanner;

public class Palindrome {
    static void PalindromeorNot(String s)
    {
    	int a=s.length();
    	int temp=a-1,r=0;
    	for(int i=0;i<a/2;i++)
    	{
    		if(s.charAt(i)!=s.charAt(temp))
    		{
    			System.out.println("It is not a palindrome");
    			r=1;
    			break;
    		}
    		temp--;
    	}
    	if(r==0)
    	{
    		System.out.println("It is a palindrome ");
    	}
    }
	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		PalindromeorNot(s);
		

	}

}
