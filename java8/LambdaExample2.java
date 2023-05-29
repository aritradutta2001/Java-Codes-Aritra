package java8;

interface I3
{
	void f(); // abstract method 
}

public class LambdaExample2 
{

	public static void main(String[] args) 
	{
		// single statement Lambda
		
		I3 r = ()->System.out.println("Hello");  
				   System.out.println("Hii"); // main 
		r.f();

	}

}
