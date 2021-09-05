package com.src;

public class SubNoSub{
static int a=30;
int b=10;
public static void main(String...args){
SubNoSub o=new SubNoSub();
while(o.b!=0){
int res=(~o.a)&o.b;
o.a^=o.b;
o.b=res<<1;
}
System.out.println(o.a);
}
}