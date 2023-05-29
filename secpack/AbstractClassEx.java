package secpack;

abstract class C
{
	void x()//we can add method definition in abstract class
	{
		System.out.println("Hii");
	}
	abstract void f();//abstract method->Means Which Method Doesn't Have Any Body
}
class D extends C
{
	public void f()
	{
		x();
		System.out.println("Hello");
	}
}
public class AbstractClassEx 
{
	public static void main(String args[])
	{
		D r = new D();
		r.f();
	}

}
