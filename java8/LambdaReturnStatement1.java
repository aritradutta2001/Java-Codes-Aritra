package java8;

interface I8
{
	int f(int a,int b);
}
public class LambdaReturnStatement1 
{

	public static void main(String[] args) 
	{
		// return statement 
		I8 r = (a,b)->
		{
			if(a>b)
			{
				return a;
			}
			else
			{
				return b;
			}
		};
		System.out.println("Max Number is : "+r.f(10,8));

	}

}
