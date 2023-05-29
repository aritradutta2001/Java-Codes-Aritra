package arrayandstringpack;

public class CountNumberOfCharInString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="I Love Java";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(Character.isLetter(c)) 
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
