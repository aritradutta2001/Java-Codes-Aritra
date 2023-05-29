package firstpack;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem,res=0,temp=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number :");
		int n= sc.nextInt();
		temp=n;
		while (n>0)
		{
			rem = n%10;
			res = res*10+rem;
			n=n/10;
		}
		if(temp==res)
		{
			System.out.println(temp+" is Palindrome ");
		}
		else
		{
			System.out.println(temp+" is not Palindrome");
		}
		
	}

}
