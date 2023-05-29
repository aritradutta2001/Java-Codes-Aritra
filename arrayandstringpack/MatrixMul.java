//Important Rules:
//If we have two matrices A and B of dimensions m*n and p*q respectively
//1.The number of columns of first matrix must be equal to the number of rows of second matrix.That means n=p must be hold true.
//2.Resultant matrix has the dimension : m*q

package arrayandstringpack;
import java.util.*;
public class MatrixMul {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row of first matrix:");
		int m=sc.nextInt();
		System.out.println("Enter the col of first matrix:");
		int n=sc.nextInt();
		System.out.println("Enter the row of second matrix:");
		int p=sc.nextInt();
		System.out.println("Enter the col of second matrix:");
		int q=sc.nextInt();
		int a[][]= new int[m][n];
		int b[][]= new int[p][q];
		int res[][]=new int [m][q];
		if(n!=p)
		{
			System.out.println("Multiplication can't possible because the col of first matrix and the row of second matrix is not same");
		}
		else
		{
			System.out.println("Enter first matrix Elements : ");
			for(int i = 0;i<m;i++)
			{
				for(int j = 0;j<n;j++)
				{
					a[i][j]=sc.nextInt();
				}
					
			}
			System.out.println("Enter second matrix Elements : ");
			for(int i = 0;i<p;i++)
			{
				for(int j = 0;j<q;j++)
				{
					b[i][j]=sc.nextInt();
				}
					
			}
			System.out.println("Elements of first matrix are :");
			for(int i = 0;i<m;i++)
			{
				for(int j = 0;j<n;j++)
				{
					System.out.print(a[i][j]+"  ");
				}
				System.out.println();	
			}
			System.out.println("Elements of second matrix are :");
			for(int i = 0;i<p;i++)
			{
				for(int j = 0;j<q;j++)
				{
					System.out.print(b[i][j]+"  ");
				}
				System.out.println();
					
			}
			System.out.println("Result is :");
			for(int i = 0;i<m;i++)
			{
				for(int j = 0;j<q;j++)
				{
					res[i][j]=0;
					for(int k = 0;k<n;k++)
					{
						res[i][j]=res[i][j]+(a[i][k]*b[k][j]);
					}
					System.out.print(res[i][j]+"  ");
				}
				System.out.println();
					
			}
		}
		
		
		
	}

}
