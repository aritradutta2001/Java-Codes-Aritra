package arrayandstringpack;

public class DuplicateNumbers 
{

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,1,3,4,5,4};
		int n=arr.length;
		System.out.println("Duplicate Numbers are : ");
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
