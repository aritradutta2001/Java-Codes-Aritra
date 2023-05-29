package arrayandstringpack;
import java.util.*;
public class LargestElementOfAnArray 
{
		public static void main(String args[])
		{
			int i ,j;
			Scanner sc = new Scanner(System.in);
			System.out.println("How Many Elements You Want to Enter ? ");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter the Elements : ");
			for(i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int res = myFunc(n,arr);
			System.out.println("The largest element of the array is :"+res);
		}
		static int myFunc(int n,int arr[])
		{
			int i,j;
			System.out.println("The Elements are : ");
			for(i=0;i<n;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			for(i=0;i<n-1;i++)
			{
				
				for(j=0;j<n-i-1;j++)
				{
					if(arr[j]>arr[j+1])
					{
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			System.out.println("After Sorting the elements are : ");
			for(i=0;i<n;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			int large=arr[n-1];
			return large;
		}	
	}


