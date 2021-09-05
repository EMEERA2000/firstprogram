package com.src;

public class Cal {
static void EvenorOdd(int n)
{
if(n%2==0)
{
System.out.println(n+" is even");
}
else
{
System.out.println(n+" is odd");
}
}
static void PrimeorNot(int n)
{
int f=0;
for(int i=2;i<n/2;i++)
{
if(n%i==0)
{
System.out.println(n+" is not a prime number");
f=1;
break;
}
}
if(f==0)
{
System.out.println(n+" is a prime number");
}
}
static void PerfectorNot(int n) {
int rem,sum=0;
for(int i = 1; i < n; i++)  
        {  
                rem = n% i;  
                if (rem == 0)  
                {  
                   sum = sum + i;  
                }  
        }  
        if (sum == n)
        {
           System.out.println(n+" is a Perfect Number");  
        }
        else
        {
           System.out.println(n+" is not a Perfect Number");
        }
}
static void ArmstrongorNot(int n) {
int temp=n,sum=0;    
while(n>0)    
{    
  int rem=n%10;    
  sum=sum+(rem*rem*rem);    
  n=n/10;    
}    
if(temp==sum)
{
   System.out.println(temp+" armstrong  number ");
}
else
{
   System.out.println(temp+" not armstrong number");
}

}
    static void PalindromeorNot(int n) {

     int temp=n,sum=0;    
     while(n>0)
     {    
       int rem=n%10;  
       sum=(sum*10)+rem;    
       n=n/10;    
     }    
     if(temp==sum)
     {
        System.out.println(temp+" palindrome number ");
     }
     else
     {
        System.out.println(temp+" not palindrome");
     }
    }  
    public static void main(String[] args) {

    int a=Integer.parseInt(args[0]);
if(args.length>0)
{ System.out.println("Not valid");

}
else{
EvenorOdd(a);
PrimeorNot(a);
PalindromeorNot(a);
ArmstrongorNot(a);
PerfectorNot(a);
}
}
}

