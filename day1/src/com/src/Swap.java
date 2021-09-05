package com.src;

public class Swap{
static int a=10;
int b=20;
public static void main(String...args)
{
Swap s=new Swap();
s.a+=s.b;
s.b=s.a-s.b;
s.a-=s.b;
System.out.println(s.a);
System.out.println(s.b);
}
}

