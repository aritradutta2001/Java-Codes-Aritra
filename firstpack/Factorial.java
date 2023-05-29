package firstpack;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		n=sc.nextInt();
		for(int i = n;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial of "+n+" is "+fact);
	}

}
