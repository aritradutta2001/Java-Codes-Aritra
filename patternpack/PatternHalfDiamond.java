package patternpack;

public class PatternHalfDiamond 
{
	public static void main(String args[])
	{
		int n=3;
		for(int i = 0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" "); 
			}
			for (int k = 0;k<i+1;k++)
			{  
				System.out.print("*");
			}
			System.out.print("\n");

		}
		n=n-1;
		for(int i = 0;i<n;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print(" "); 
			}
			for (int k = 0;k<n-i;k++)
			{  
				System.out.print("*");
			}
			System.out.print("\n");

		}
		
	}

}
