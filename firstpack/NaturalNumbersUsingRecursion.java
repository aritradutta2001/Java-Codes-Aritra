package firstpack;

class N
{
	public static void f(int n)
	{
		if(n>0)
		{
			f(n-1);
			System.out.println(n+" ");
		}
	}
}
public class NaturalNumbersUsingRecursion 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		N.f(10);
	}

}
