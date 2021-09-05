package com.src;

import java.util.Scanner;
public class Day{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
          System.out.println("Entre a Day");
        String s=sc.nextLine();
    switch (s)
  {
  	case "Monday" :
  		System.out.println("\n Today is Monday");
		  break;
  	case "Tuesday":
  		System.out.println("\n Today is Tuesday");
		  break;
  	case "Wednesday":
  	                 System.out.println("\n Today is Wednesday"); 
		  break;
  	case "Thursday":
  		System.out.println("\n Today is Thursday"); 
		  break;
  	case "Friday":
  		System.out.println("\n Today is Friday"); 
		  break;
  	case "Saturday":
  		System.out.println("\n Today is Saturday");
		  break;
  	case "Sunday":
  		System.out.println("\n Today is Sunday");
		  break;
	default:
		System.out.println("\n Please enter Valid Day");
  }
}
}
