package arrayandstringpack;
public class CountVowels 
{
	public static void main(String args[])
	{
		String str ="Google";
		String str1=str.toLowerCase();
		char arr[]=str1.toCharArray();
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(arr[i]);
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')
			{
				count ++;
			}
		}
		System.out.println("Number of Vowels in "+str+ " is : " +count);
	}

}
