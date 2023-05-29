package firstpack;

public class SwapWithOutUsingTemp {
	public static void main(String args[])
	{
		int a=5,b=6;
		System.out.println("The value of a is :" +a);
		System.out.println("The value of b is :" +b);
		a=a+b; //a=5+6=11
		b=a-b; //b=11-6=5
		a=a-b; //a=11-5=6
		System.out.println("-----After Swapping-----");
		System.out.println("The value of a is :" +a);
		System.out.println("The value of b is :" +b);
	}

}
