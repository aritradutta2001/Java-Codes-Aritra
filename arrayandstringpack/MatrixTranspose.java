package arrayandstringpack;
import java.util.*;
public class MatrixTranspose {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size :");
		int r = sc.nextInt();
		System.out.println("Enter the column size :");
		int c = sc.nextInt();
		
		//In java Variable must provide either dimension expression or an array initialization
		//But we can't set dimension of an array during initialization in java
		//It means in an array initialization and dimension set is not possible at same time in java 
		//So either we have to initialize or we have to set the dimension of an array,otherwise compiler will give an error
	
		int arr[][]=new int[r][c];
		int trans[][]= new int[c][r];
		
		System.out.println("Enter Array Elements : ");
		for (int i = 0;i<r;i++)
		{
			for(int j = 0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array Elements are : ");
		for (int i = 0;i<r;i++)
		{
			for(int j = 0;j<c;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
		for (int i = 0;i<r;i++)
		{
			for(int j = 0;j<c;j++)
			{
				trans[j][i]=arr[i][j];
			}
		}
		System.out.println("After Transpose Array Elements are : ");
		for (int i = 0;i<c;i++)
		{
			for(int j = 0;j<r;j++)
			{
				System.out.print(trans[i][j]+"  ");
			}
			System.out.println();
		}
		
		
	}

}
