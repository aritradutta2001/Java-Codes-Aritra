/*
 Count the digits in a String
 */
package arrayandstringpack;
import java.util.*;

public class CountDigitsInAString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String : ");
		String str=sc.nextLine();
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			
			char c=str.charAt(i);
			if(Character.isDigit(c))
			{
				count ++;
			}
		}
		System.out.println("The String Contains "+count+" Digits");
	}

}
