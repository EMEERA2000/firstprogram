package com.src;



import java.util.Scanner;
public class Largno{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
          System.out.println("Entre a number");
          double n1=sc.nextDouble();
          double n2=sc.nextDouble();
        double n3=(n1>n2?n1:n2);
        System.out.println(n3+"is a bigger number");
}
}