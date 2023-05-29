package java8;

interface I7
{
	int f(int a,int b);// abstract method 
}
public class LambdaReturnStatement 
{
	public static void main(String[] args) 
	{
		// return statement 
		
		I7 r = (a,b)->
		{
			int c = a*b;
			return c;
		};
		System.out.println(r.f(5, 10));

	}

}
