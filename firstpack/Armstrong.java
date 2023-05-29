package firstpack;
import java.util.*;
public class Armstrong 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n,temp,rem,res=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10;
			res=res+(rem*rem*rem);
			n=n/10;
		}
		if(temp==res)
		{
			System.out.println("The Number is Armstrong");
		}
		else
		{
			System.out.println("The Number is not Armstrong");
		}
	}

}
