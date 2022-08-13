package com.tns.exphandlingg;


public class Exp {

	public static void main(String[] args) {
	
		try
		{
			System.out.println(1);
			System.out.println(15/0);
			System.out.println(3);// cant be executed
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println(5);
		}
		
		
		System.out.println(6);

	}
	
	
}