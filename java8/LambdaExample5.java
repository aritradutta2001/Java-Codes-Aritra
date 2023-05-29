package java8;

interface I6
{
	void f(int a,int b); // abstract method
}
public class LambdaExample5 {

	public static void main(String[] args) 
	{
		// Two parameter
		I6 r = (a,b)->
		{
			int c = a+b;
			System.out.println(c);
		};
		r.f(10, 25);
	}

}
