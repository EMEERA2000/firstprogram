package com.src;

public class Fish extends Animal implements Pet{
String s;
Fish() {
	super(0);
}

@Override
public void getName(String s) {
	this.s=s;
	
}

public String setName() {
	return s;
}

@Override
public void play() {
	System.out.println("Playing....");
	
}

@Override
void eat() {
	System.out.println("Eating....");
	
}
void walk()
{
	System.out.println("Fish cannot walk");
}

}
