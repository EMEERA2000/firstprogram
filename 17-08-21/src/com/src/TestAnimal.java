package com.src;

public class TestAnimal {

public static void main(String[] args) {
	Fish f=new Fish();
	Cat c=new Cat("Fluffy");
	Animal a=new Fish();
	Animal e=new Spider();
	Pet p=new Cat();
	f.getName("Goldfish");
	System.out.println(f.setName());
	f.play();
	f.eat();
	f.walk();
	System.out.println();
	c.getName("Tom");
	System.out.println(c.setName());
	c.eat();
	c.play();
	c.walk();
	System.out.println();
	a.eat();
	a.walk();
	System.out.println();
	e.eat();
	e.walk();
	System.out.println();
	p.getName("Leo");
	System.out.println(p.setName());
	p.play();
	System.out.println();

}

}
