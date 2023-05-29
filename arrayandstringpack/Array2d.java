
package arrayandstringpack;
import java.util.*;

public class Array2d {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the row size: ");
		int x= sc.nextInt();
		System.out.println("Enter the column size: ");
		int y=sc.nextInt();
		int arr[][]= new int [x][y];
		System.out.println("Enter the elements : ");
		for(int i =0;i<x;i++)
		{
			for (int j=0;j<y;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Elements are :");
		for(int i =0;i<x;i++)
		{
			for (int j=0;j<y;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
		
	}

}
