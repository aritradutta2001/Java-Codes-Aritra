package firstpack;

class SumOfNatural
{
	public static int f(int n)
	{
		if(n>0)
		{
			return n+f(n-1);
		}
		else
		{
			return n;
		}
	}
}
public class SumOfNaturalNumbersUsingRecursion 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(SumOfNatural.f(10));
	}

}
