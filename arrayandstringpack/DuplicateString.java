package arrayandstringpack;

public class DuplicateString 
{
	public static void main(String args[])
	{
		String arr[]= {"Apple","Mango","Apple","Banana","Mango"}; 
		int n=arr.length;
		System.out.println("Duplicate Elements are : ");
		for (int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
	}
}
