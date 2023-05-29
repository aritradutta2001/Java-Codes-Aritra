package arrayandstringpack;

import java.util.*;

public class UpdateArrayElementFromUserInput {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Element You Want to Change : ");
		int u=sc.nextInt();
		System.out.println("Enter The New Element You Want to Change : ");
		int ne=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==u)
			{
				arr[i]=ne;
			}
			System.out.println(arr[i]);
		}
		

	}

}
