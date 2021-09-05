package com.src;





import java.util.Scanner;

public class OpChoose{

public static void main(String...args){

int a,b,res;
char op;

Scanner sc=new Scanner(System.in);

System.out.println("Enter 2 numbers");

a=sc.nextInt();

b=sc.nextInt();

System.out.println("Choose Operands(+,-,*,/,%)");

op=sc.next().charAt(0);

res=0;

switch(op){

case '+': res=a+b; 
break;

case '-': res=a-b;
 break;

case '*': res=a*b;
 break;

case '/': res=a/b;
 break;

case '%': res=a%b;
 break;

default: System.out.println("Invalid");
 break;

}

System.out.println("Res "+res);

}

}