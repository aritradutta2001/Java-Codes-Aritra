/*We Know that interfaces and all the method of interfaces are internally abstract 
that means we can't method definition(method body).
But in java 8 compiler it introduce default and static keywords,
by which we can write method definition(method body).
We know that we can't create object of an Interface because interfaces are internally abstract
but we can create reference.
*/
package java8;

interface I1
{
	void f(); //abstract method
	
	default void g() //default method 
	{
		System.out.println("Hello World");
	}
	
	/*default void h(); //We can't write this when we use default keyword*/
	
	static void h() //static method
	{
		System.out.println("Power Of Java");
	}
	
}
class A implements I1
{
	public void f() // override abstract method
	{
		
		System.out.println("Hello User");
	}
}
public class DefaultMethodInInterface
{
	public static void main(String args[])
	{
		A r = new A();
		r.f();
		r.g();
		I1.h();
		
	}
}
