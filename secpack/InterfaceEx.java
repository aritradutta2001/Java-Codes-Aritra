package secpack;

class E
{
	void f()
	{
		System.out.println("Hello");
	}
}
interface I1
{
	void g();//All The Methods Of An Interface are Implicitly abstract
}
interface I2 
{
	void h();
}
class F extends E implements I1,I2
{
	
	public void g()
	{
		f();
		System.out.println("Hii");
	}
	public void h()
	{
		System.out.println("Ok");
	}
}
public class InterfaceEx 
{
	public static void main(String args[])
	{
		F r = new F();
		r.g();
		r.h();
	}
}
