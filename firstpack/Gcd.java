package firstpack;
import java.util.*;
public class Gcd {
	public static void main(String args[])
	{
		int n1, n2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two positive integers: ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		while(n1!=n2)
		{
			if(n1 > n2)
			{
				n1 = n1-n2;
			}
			else
			{
				n2 = n2-n1;
			}
		}
		System.out.println("GCD of Two Numbers : "+n1);
	
	}
}
