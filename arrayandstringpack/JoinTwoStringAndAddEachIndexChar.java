package arrayandstringpack;

public class JoinTwoStringAndAddEachIndexChar 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="Aritra";
		String str1="Aritra";
		str=str.toUpperCase();
		str1=str1.toUpperCase();
		StringBuilder sb = new StringBuilder();
		char arr[]=str.toCharArray();
		char arr1[]=str1.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			sb.append(arr[i]).append(arr1[i]);
		}
		String s1=sb.toString();
		System.out.println(s1);
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			System.out.println(c);
		}

	}

}
