//print 1,3,5,7,9 from the Given array
//int arr[]= {1,2,3,4,5,6,7,8,9,10};

package arrayandstringpack;

public class Array {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("The length of the array is : "+arr.length);
		System.out.println("The Array elements are :");
		for(int i =0;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
		}
		
	}

}
