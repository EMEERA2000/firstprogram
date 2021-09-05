package com.src;




import java.util.Scanner;

public class Division {

    
public static void main(String[] args) {
    
Scanner sc=new Scanner(System.in);
     
String a=sc.nextLine();
     
System.out.println("Enter a number:"); 
    
 char s1=a.charAt(0);
     
int i=Character.getNumericValue(s1);
   
 if(i%2==0)
  
 System.out.println(i+"is divisible by 2");
   
else
   
System.out.println(i+"is not  divisible by 2");
   
 }

}
   
     
    
