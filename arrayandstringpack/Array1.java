//1d array 
//input from user
package arrayandstringpack;
import java.util.*;

public class Array1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Elements :");
		for (int i =0 ; i< n ;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for (int i =0 ; i< n ;i++)
		{ 
			System.out.println("The Elements of arr["+i+"] index is : " +arr[i]);
			
		}
	}

}
