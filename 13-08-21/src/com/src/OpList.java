package com.src;

import java.io.*;
import java.util.Scanner;
public class OpList{
public static void main(String...args){
int c1,c2,c3,c4;
int a,b; Scanner sc=new Scanner(System.in);
o:
do{
System.out.println("Choose 1\n\n1.Arithmetic\n2.Logical\n3.Relational");
c1=sc.nextInt();
System.out.println("Enter 2 numbers :");
a=sc.nextInt();
b=sc.nextInt();
switch(c1){
	case 1:
do{	
	System.out.println("Choose 1\n\n1.Add\n2.Sub\n3.Mul\n4.Div\n5.Mod\n6. Back");
	c2=sc.nextInt();
	switch(c2){
		case 1: System.out.println(a+b); break;
		case 2: System.out.println(a-b); break;
		case 3: System.out.println(a*b); break;
		case 4: System.out.println(a/b); break;
		case 5: System.out.println(a%b); break;
		case 6: continue o;
	}
}while(c2>=1&&c2<=5);
	break;
	case 2:
	do{	
	System.out.println("Choose 1\n\n1. And\n2. Or\n3. X-Or\n4. Back");
	c3=sc.nextInt();
	switch(c3){
		case 1: System.out.println(a&b); break;
		case 2: System.out.println(a|b); break;
		case 3: System.out.println(a^b); break;
		case 4: continue o;
	}
	}while(c3<=3&&c3>=1);
	break;
	case 3:
	do{	
	System.out.println("Choose 1\n\n1 = \n2 !=\n3 <=\n4 >=\n5 <\n6 >\n7 Back");
	c4=sc.nextInt();
	switch(c4){
		case 1: System.out.println(a==b); break;
		case 2: System.out.println(a!=b); break;
		case 3: System.out.println(a<=b); break;
		case 4: System.out.println(a>=b); break;
		case 5: System.out.println(a<b); break;
		case 6: System.out.println(a>b); break;
		case 7: continue o;
		}
	}while(c4<=6&&c4>=1);
	break;
	default: break;
}
}while(c1<=3&&c1>=1);
}
}

	