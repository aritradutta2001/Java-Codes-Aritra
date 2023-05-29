package firstpack;

class Xyz
{
	//Method Overloading 
	void f() // Instance Method 
	{
		System.out.println("This is f() method of Super class");
	}
	void f(int a ) // Instance Method 
	{
		System.out.println("This is f() method of Super class but one arg is present");
	}
}
class Yz extends Xyz
{
	Yz() //default cons
	{
		f();
	}
	//Method Overriding
	public void f(int a)
	{
		//super.f(5);
		System.out.println("This is f() method of Sub class but one arg is present");
	}
}
public class ThirdProg {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Yz r = new Yz();
		r.f(5);
	}

}
