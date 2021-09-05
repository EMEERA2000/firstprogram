package com.src;

import java.util.Scanner;
public class Small 
{  
public static void main(String[] args)   
{  

         Scanner sc=new Scanner(System.in);
          System.out.println("Entre a number");
          int a=sc.nextInt();
          int b=sc.nextInt();
          int c=sc.nextInt();
if(a<b && a<c)  
System.out.println(a+" is the smallest number");  
  else if (b<a && b<c)  
System.out.println(b+" is the smallest number");  
else  
  System.out.println(c+" is the smallest number");  
}  
}  