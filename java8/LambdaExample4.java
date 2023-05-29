package java8;

interface I5
{
	void f(int a); // abstract method
}
public class LambdaExample4 {

	public static void main(String[] args) 
	{
		// One Parameter
		I5 r =(a)->
		{
			int s=a*a;
			System.out.println(s);
		};
		r.f(5);

	}

}
