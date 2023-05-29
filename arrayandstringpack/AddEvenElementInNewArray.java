//Print only the even elements in the new array from an array
package arrayandstringpack;

public class AddEvenElementInNewArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		
		System.out.println("Array Elements : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nNew Array Elements : ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				int arr1[]= arr;
				System.out.println(arr1[i]);
			}
		}

	}

}
