package firstpack;
import java.util.Scanner;

public class Lcm {
	public static void main(String args[])
	{
		int n1, n2, i, gcd=1, lcm;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two positive integers: ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		for (i = 1; i <= n1 && i <= n2; ++i)
		{
			if (n1 % i == 0 && n2 % i == 0)
			{
				gcd = i;
			}
		}
		lcm = (n1 * n2) / gcd;
		System.out.println("The LCM of two numbers "+n1+" "+n2+" is : "+lcm);
		
	}
}
