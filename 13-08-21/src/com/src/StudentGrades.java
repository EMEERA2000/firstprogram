package com.src;

import java.util.Scanner;
class Student{
	int rno;
	String name;
		int age;
	int math,phy,chem;
	double avg;
	char g;
	public Student(int rno, String name, int age, int math, int phy, int chem){
		this.rno=rno;
		this.name=name;
		this.age=age;
		this.math=math;
		this.phy=phy;
		this.chem=chem;
	}
	public void Cal(){
		int tot=math+phy+chem;
		avg=tot/3;
		if(avg>75) g='a';
		else if(avg<=75 && avg>65) g='b';
		else if(avg<=65 && avg>35) g='c';
		else g='d';
	}
	public void display(){
		System.out.println("Roll no :"+rno+"\nName :"+name+"\nAge :"+age+"\nMath :"+math+"\nPhysics :"+phy+"\nChemistry :"+chem+"\nAverage :"+avg+"\nGrade :"+g);
	}
}
public class StudentGrades{
	public static void main(String...args){
		Student s1=new Student(101,"Sarvesh",22,90,95,50);
		s1.Cal();
		s1.display();
	}
}
