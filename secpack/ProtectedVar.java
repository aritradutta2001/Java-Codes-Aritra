package secpack;

class Test2
{
	protected Test2()
	{
		System.out.println("Hello");
	}
	protected int a=20;
	void f()
	{
		System.out.println(a);
	}
}
public class ProtectedVar {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Test2 r = new Test2(); // we can create an object of another class within a class which contains protected constructor
		r.f();
		System.out.println(r.a); // protected variable can access from another class
	}

}
