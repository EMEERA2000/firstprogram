package com.src;

import java.util.Scanner;

public class Login{

public static void main(String[] args) {
Login up=new Login();
up.username();
up.password();

}
Scanner s=new Scanner(System.in);

public void username()
{

System.out.println("Enter username");
String str=s.nextLine();
System.out.println("The username is :" +str);

}
public void password()
{
System.out.println("Enter the password");
String password=s.nextLine();
if(password.matches(".[0-9]{1,}.") && password.matches(".[@#$]{1,}.") && password.length()>=6 && password.length()<=20)
                   {
                        System.out.println("the valid password");
                   }
                   else
                   {
                         System.out.println("not a valid password");
                   }
      }
}
