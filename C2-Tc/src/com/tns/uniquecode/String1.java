package com.tns.uniquecode;



public class String1 {

	public static void main(String[] args) {
		
		String s=new String("DARSHAN");   //create string object
//		s.concat("choudhary");
//		System.out.println(s);
//		
//		StringBuffer s1=new StringBuffer("Darshan");  //mutable
//		s1.append(" darashu");
//		System.out.println(s1);
		
		
		System.out.println(s.length());
		
		String lower=s.toLowerCase();
		System.out.println(lower);
		
		String upper=s.toUpperCase();
		System.out.println(upper);
		
		System.out.println(s.trim());
		System.out.println(s.substring(2,6));
		System.out.println(s.substring(2));
		
		
		String s1=new String("JOHN"); 
		System.out.println(s1.equals("darshan"));
		System.out.println(s1.equalsIgnoreCase("darshan"));
		System.out.println(s1.replace('A','h'));

	}

}
