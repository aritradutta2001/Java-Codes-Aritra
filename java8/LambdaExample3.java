package java8;

interface I4
{
	void f(); // abstract method
}
public class LambdaExample3 {

	public static void main(String[] args) 
	{
		// multiple statement lambda with no parameter 
		I4 r = ()->
		{
			System.out.println("Hello");
			System.out.println("Hii");
		};
		r.f();
	}

}
