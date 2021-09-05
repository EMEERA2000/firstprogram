package com.src;

abstract class Animal {
    protected int leg=0;
    protected Animal(int leg)
    {
  	  this.leg=leg;
    }
    abstract void eat();
    void walk()
    {
  	  System.out.println("Number of legs:"+leg);
    }
}

class Spider extends Animal{

Spider() {
	super(8);
}

@Override
void eat() {
	System.out.println("Eating....");
	
}

}






