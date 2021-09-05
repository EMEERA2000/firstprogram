package com.src;



public class Racing {

public static void main(String[] args) {

                                 
Car a = new Car();
Thread t1 = new Thread( new Runnable() {
public void run() {
a.racing();}
}
);
                
t1.start();

}
}

class Car{
static int c=1;
void racing() {
String ThreadName=Thread.currentThread().getName();
for (int i = 0; i <= 100; i++) {
System.out.println(ThreadName+" : "+i);
if(i==25 && c==1)
{c++;
System.out.println(ThreadName+": Petrol pump First");}
if(i==50 && c==2)
{c++;
System.out.println(ThreadName+": ...Half Lap First...");}
if(i==75 && c==3)
{c++;
System.out.println(ThreadName+": Pit Stop First");}
if(i==100 && c==4)
{c++;
System.out.println(ThreadName+": ..Winner......");
break;
}
if(i==100 && c==5)
{c++;
System.out.println(ThreadName+": ...Runner.....");
break;
}
}
}
}
