package com.src;

public class Cat extends Animal implements Pet
{
String s;
protected Cat(String s) {
	super(4);
	this.s=s;
}
Cat()
{
	this(null);
}
@Override
void eat() {
	System.out.println("Eating...");
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



}
