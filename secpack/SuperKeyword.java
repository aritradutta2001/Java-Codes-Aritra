package secpack;

class A
{
	A(int a)
	{
		System.out.println(a);
	}
	A(int a,int b)
	{
		this(6);
		System.out.println(a+b);
	}
}
class B extends A
{
	B(int a )
	{
		super(5,5);
		System.out.println("Hii");
	}
}
public class SuperKeyword 
{
	public static void main(String args[])
	{
		new B(5);
	}

}
