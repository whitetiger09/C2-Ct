package oopsInJAVA.copy;



public class Method_Overloading {

	public static void main(String[] args) {
		Test t=new Test();
		t.m();
		t.m(56); 
		t.m(67.87f);
		t.m('a');
		t.m(100L);

	}

}
class Test
{
	public void m()
	{
		System.out.println("No Arguments");
	}
	public void m(long d)
	{
		System.out.println("Double Arguments");
	}
	public void m(float i)
	{
		System.out.println("flaot Arguments");
	}
	public void m(int i)
	{
		System.out.println("Integer Arguments");
	}
	
}