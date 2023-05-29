package java8;

interface I9
{
	void f(); // abstract method
}
public class EmptyLambdaExpression 
{

	public static void main(String[] args) 
	{
		// empty lambda expression 
		
		I9 r = ()->
		{
			// empty body 
		};
		r.f();
	}

}
