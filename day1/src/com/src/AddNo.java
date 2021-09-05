package com.src;

public class AddNo{
static int a=10;
int b=20;
public static void main(String...args){
int res;
AddNo o=new AddNo();
while(o.b!=0){
res=o.a & o.b;
o.a^=o.b;
o.b=res<<1;
}
System.out.println(a);
}
}