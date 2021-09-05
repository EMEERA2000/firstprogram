package com.src;

import java.util.Scanner;
public class Posnev {

    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("Entre a number");
           int a=sc.nextInt();
         if(a>0)
        {
               System.out.println(a +"is positive");
          } 
          else
        {
               System.out.println(a +"is Negative");
          } 
        if(a%2==0)
        {
               System.out.println(a +"is Even number");
          } 
          else
        {
               System.out.println(a +"is Odd number");
          } 
}
}