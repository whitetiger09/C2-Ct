package com.tns.static1;


public class StaticOuter {
	int x=10;
	
	static class Inner
	{
		public void demo()
		{
			System.out.println("I am Inner class");
		}
	}

	public static void main(String[] args) {
		StaticOuter.Inner obj=new StaticOuter.Inner();
		obj.demo();
	}

}