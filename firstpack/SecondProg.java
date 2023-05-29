package firstpack;

class B
{
	B()	// default cons
	{
		System.out.println("Super Class def Constructor ");
	}
	B(int a )
	{
		System.out.println("Super Class param Constructor ");
	}
}
class C extends B
{
	C(int a ) //parameterized cons
	{
		super(5);
		//new B();
		System.out.println("Sub Class Constructor ");
	}
}
public class SecondProg
{
	public static void main(String args[])
	{
		new C(5);
	}
}
