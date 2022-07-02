package com.flowcontrol.java;

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
	 }

}
