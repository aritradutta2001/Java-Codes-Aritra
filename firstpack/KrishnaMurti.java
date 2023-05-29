package firstpack;

import java.util.Scanner;

public class KrishnaMurti {
	
	static int fact(int n)
	{
		int f=1;
		for (int i=n;i>0;i--)
		{
			f=f*i;
		}
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp,rem,res=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10;
			res=res+fact(rem);
			n=n/10;
		}
		if(temp==res)
		{
			System.out.println("The Number is Krishna Murti");
		}
		else
		{
			System.out.println("The Number is not Krishna Murti");
		}

	}

}
