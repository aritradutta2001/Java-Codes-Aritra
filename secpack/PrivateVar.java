package secpack;

class Test3
{
	private int a=10;
	private Test3()
	{
		System.out.println("Hello World");
		
	}
	void f()
	{
		System.out.println(a);
	}
}
public class PrivateVar 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Test3 r = new Test3();// // we can't create an object of another class within a class which contains protected constructor
		
		//System.out.println(r.a); // private variable can't visible to another class

	}

}
