//Rules :
//1. Both matrices are of same size then only we can add 
//2. We know that matrix means that have row and column so we have to use 2d array
package arrayandstringpack;

public class MatrixSub 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr1[][]= {{4,5,6},{7,8,9}};
		int arr2[][]= {{1,2,3},{4,5,6}};
		int r=arr1.length; 
		int c=arr1[0].length;
		System.out.println("The size of the row is :" +r);
		System.out.println("The size of the column is :" +c);
		int res[][]=new int[r][c];
		System.out.println("Elements of the first matrix are : ");
		for (int i = 0;i<arr1.length;i++)
		{
			for (int j = 0;j<arr1[i].length;j++)
			{
				System.out.print(arr1[i][j]+"  ");
			}
		System.out.println();
		}
		System.out.println("Elements of the second matrix are : ");
		for (int i = 0;i<arr2.length;i++)
		{
			//System.out.println(arr2[i].length);
			for (int j = 0;j<arr2[i].length;j++)
			{
				System.out.print(arr2[i][j]+"  ");
			}
		System.out.println();
		}
		System.out.println("Subtraction of two matrix is : ");
		for (int i = 0;i<r;i++)
		{
			for (int j = 0;j<c;j++)
			{
				res[i][j]=arr1[i][j]-arr2[i][j];
				System.out.print(res[i][j]+"  ");
			}
		System.out.println();
		}

	}


}
