package com.src;



import java.util.Scanner;

public class Division1 {
public static void main(String[] args) {
    
Scanner sc=new Scanner(System.in);
     
 System.out.println("Enter a number:"); 
 
int  a=sc.nextInt();
   
 int c=a%10;
   
 if(c%3==0)
  
 System.out.println(c+"is divisible by 3");
  
else if(c%5==0)
{
System.out.println(c+"is divisible by 5");
 
System.out.println(c+"is divisible by 3");
}

 else {
   
System.out.println(c+"is not  divisible by 3");
   
 }
 }
}
 


   
     
    