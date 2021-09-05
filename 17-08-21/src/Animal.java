

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

public interface Pet {
public void getName(String s);
public String setName();
public void play();
}

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