package com.tns.constructor;

public class Paramterized_Constructor {
	String name; //Instance Variable
	int age,rollno; // ""
	public Paramterized_Constructor(String name,int age,int rollno)
	
	{
		this.name=name;
		this.age=age;
		this.rollno=rollno;
	}
	public static void main(String args[])
	{
		System.out.println("lets invoke the constructor");
		Paramterized_Constructor s1=new Paramterized_Constructor("Darshan",20,15);
		Paramterized_Constructor s2=new Paramterized_Constructor("Abhishek",66,25);
	
		System.out.println("name ="+s1.name+"\n"+"age ="+s1.age+"\n"+"roll no ="+s1.rollno);
		System.out.println("name ="+s2.name+"\n"+ "age ="+s2.age+"\n"+"roll no ="+s2.rollno);
	}
	

}
