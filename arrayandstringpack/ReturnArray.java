package arrayandstringpack;

public class ReturnArray {
	public static void main(String args[])
	{
		int arr[]= {1,2,3};
		myFunc(arr);
	}
	static int[] myFunc(int arr[])
	{
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		return arr;
	}
}
