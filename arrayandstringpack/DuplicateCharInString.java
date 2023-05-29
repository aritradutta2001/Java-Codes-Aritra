package arrayandstringpack;

public class DuplicateCharInString 
{
	public static void main(String args[])
	{
		String str="Google";
		char arr[]=str.toCharArray();
		int n=arr.length;
		System.out.println("Duplicate Characters Are : ");
		for(int i=0;i<n;i++)
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
