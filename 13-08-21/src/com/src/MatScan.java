package com.src;

//write a program to accept values in the form of rows and cols, find out each digit is even or odd. 
import java.util.Scanner;
class Matnum{
	//int r,c;
	int a[][]=new int[2][2];
/*	public MatNum(int a, int b){
		this.r=a;
		this.c=b;
		this.a=new int[a][b];
		return ;
	}*/
	public void matScan(){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				a[i][j]=sc.nextInt();
			}
		}
	}
	public void dispmat(){
		for(int i=0;i<2;i++){
			System.out.print("|");
			for(int j=0;j<2;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println("|");
		}
	}
	public void OddEvenCalc(){
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				if(a[i][j]%2==0){
					System.out.println("a["+ i+1 +"]["+j+1 +"] is Even");
				}
				else { System.out.println("a["+ i+1 +"]["+j+1 +"] is Odd");
				}
			}
		}
	}
}
public class MatScan{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		Matnum m=new Matnum();
		System.out.println("Enter the 2x2 matrix");
		m.matScan();
		System.out.println("The Matrix");
		m.dispmat();
		m.OddEvenCalc();
	}
}