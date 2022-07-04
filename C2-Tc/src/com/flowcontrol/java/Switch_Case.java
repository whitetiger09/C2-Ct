package com.flowcontrol.java;

import java.util.*;
public class Switch_Case {

	public static void main(String[] args)
	{
	 byte  x=127; //If value exceeds ,it will throw an error
//	 float y=2.2f; // float is not allowed in java
	 final int z=10;
//	 long A=51L; //Switch dont allow long statement
	 char my='b';
	switch(x) // switch(my)
		{
		   case 'a':
		
		   {
			   // f=10;declrative sentences are not allowed
			   System.out.println("Switch case ");
			   break;
		   }
		   case 5:
				
		   {
			   System.out.println("My style ");
			   break;// IF break is not used..further statement will also get executed
		   }
		   case 127:
				
		   {
			   System.out.println("your style");
			   break;
		   }
		   default:
		   {
			   System.out.println("Executed");
		   }
		
		
		}
		  System.out.println("Empty Switch is Also valid ");
		
//		Calculator code by using switch
		
//		String choice=null;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter ur choice");
//		choice= sc.nextLine();
//		System.out.println("enter no: ");
//		int a= sc.nextInt();
//		int b= sc.nextInt();
//		switch(choice) {
//		
//		case "Add":
//			System.out.println(a+b);
//			break;
//		case "sub":
//			System.out.println(a-b);
//			break;
//		case "mul":
//				System.out.println(a*b);
//				break;
//		case "div":
//				System.out.println(a/b);
//				break;
//		default:
//			System.out.println("invalid input");	
//		}
	 
	//print month with help of switch
//		Scanner sc = new Scanner(System.in);
//	System.out.println("enter month no: ");
//		int b= sc.nextInt();
//		switch(b) {
//		
//		case 1:
//			System.out.println("jan");
//			break;
//		case 2:
//			System.out.println("feb");
//			break;
//		case 3:
//				System.out.println("mar");
//				break;
//		case 4:
//				System.out.println("apr");
//				break;
//		case 5:
//			System.out.println("may");
//			break;
//		case 6:
//			System.out.println("jun");
//			break;
//					
//		default:
//			System.out.println("invalid input");	
//		}
//	}
//
//}
