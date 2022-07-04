package com.tns.flowcontrol;
//EVEN ODD PROGRAM
import java.util.Scanner;

public class If_Else {
     public static void main (String[] args)
     {
    	 int num;
    	 System.out.println("Enter your Number");
    	 Scanner input=new Scanner(System.in); // for taking the input from the user System.in is used
    			 // We create obj of Scanner class to take the input then call nextINT() method from SCANNER class to to take the  imp value
       num=input.nextInt(); //to call a method in scanner class, we use dot operatorS
       if(num%2==0)
    	   System.out.println("The entered num = "+num+"\n"+"It is Even");
       else
    	   System.out.printf("Given num = %d \nIt is odd num ",num);
    			 
     }
}
