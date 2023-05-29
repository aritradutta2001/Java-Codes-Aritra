package arrayandstringpack;

public class CountNumberOfSpaceInString1 {

	public static void main(String[] args)
	{
		String str="I Love Java";
		char arr[]=str.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==' ')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
