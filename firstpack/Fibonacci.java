package firstpack;
import java.util.*;
public class Fibonacci 
{
	public static void main(String args[])
	{
		int n1=0,n2=1,n3,i,number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		number = sc.nextInt();
		System.out.println("Fibonacci Series :");
		System.out.print(n1+" "+n2);
		for(i=2;i<number;++i)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
