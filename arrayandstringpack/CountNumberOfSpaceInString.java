package arrayandstringpack;

public class CountNumberOfSpaceInString 
{
	public static void main(String args[])
	{
		String str="I Love Java";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char c= str.charAt(i);
			if(Character.isWhitespace(c))// Character is Wrapper Class
			{
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
