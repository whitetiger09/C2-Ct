package oopsInJAVA.copy;



public class Method_OverRiding {

	public static void main(String[] args) {
		Child a=new Child();
		a.marry();
		a.property();
		a.marry();

	}

}
class Parent
{
	void property()
	{
		System.out.println("house...money...jwellery");
	}
	void marry()
	{
		System.out.println("Sri Latha");
	}
}
class Child extends Parent
{
	void marry()
	{
		System.out.println("Katrina");
	}
}
