package com.src;

import java.util.Scanner;

public class NumCal {
	static void EvenorOdd(int a)
	{
		if(a%2==0)
		{
			System.out.println(a+" is even");
		}
		else
		{
			System.out.println(a+" is odd");
		}
	}
	static void PrimeorNot(int a)
	{
		int k=0;
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0)
			{
				System.out.println(a+" is not a prime number");
				k=1;
				break;
			}
		}
		if(k==0)
		{
			System.out.println(a+" is a prime number");
		}
	}
	static void PerfectorNot(int a) {
		int rem,sum=0;
		for(int i = 1; i < a; i++)  
        {  
                rem = a % i;  
                if (rem == 0)  
                {  
                   sum = sum + i;  
                }  
        }  
        if (sum == a)
        {
           System.out.println(a+" is a Perfect Number");  
        }
        else
        {
           System.out.println(a+" is not a Perfect Number"); 
        }
	}
	static void ArmstrongorNot(int a) {
		int temp=a,sum=0;    
		while(a>0)    
		{    
		   int rem=a%10;    
		   sum=sum+(rem*rem*rem);    
		   a=a/10;    
		}    
		if(temp==sum)
		{
		    System.out.println(temp+" armstrong  number "); 
		}
		else 
		{
		    System.out.println(temp+" not armstrong number"); 
		}
		
	}
    static void PalindromeorNot(int a) {
		
    	  int temp=a,sum=0;    
    	  while(a>0)
    	  {    
    	    int rem=a%10;  
    	    sum=(sum*10)+rem;    
    	    a=a/10;    
    	  }    
    	  if(temp==sum)
    	  {
    	     System.out.println(temp+" palindrome number ");
    	  }
    	  else
    	  {
    	     System.out.println(temp+" not palindrome"); 
    	  }
    }  
    public static void main(String[] args) {
    	System.out.println("1. even or odd");
    	System.out.println("2. prime or not");
    	System.out.println("3. palindrome or not");
    	System.out.println("4. armstrong or not");
    	System.out.println("5. perfect or not");
    	System.out.println("6. exit");
    	
    	System.out.println("Enter a number:");
    	Scanner sc=new Scanner(System.in);
    	int c=sc.nextInt();
    	int d=sc.nextInt();
    	if(c==1)
    	{
    		EvenorOdd(d);
    	}
    	else if(c==2)
    	{
    		PrimeorNot(d);
    	}
    	else if(c==3)
    	{
    		PalindromeorNot(d);
    	}
    	else if(c==4)
    	{
    		ArmstrongorNot(d);
    	}
    	else if(c==5)
    	{
    		PerfectorNot(d);
    	}
    	else
    	{
    		System.exit(0);
    	}

	}

}