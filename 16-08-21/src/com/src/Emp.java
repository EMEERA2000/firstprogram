package com.src;

public class Emp {
int eid;
    String name;
    String phno;
    static int totalnoemployee;
    void display()
{
System.out.println("ID:"+eid+"  NAME:"+name+"  PH NO:"+phno);
}
    static void total()
    {
    System.out.println("Total employees are: "+totalnoemployee);
    }

public static void main(String[] args) {
Emp e=new Emp();
e.eid=10;
e.name="Meera";
e.phno="9585968241";
e.display();
totalnoemployee++;
total();

}
}
