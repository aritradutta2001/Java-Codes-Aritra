package firstpack;
import java.util.*;


public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,nstr="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		str= sc.next();
		String str1=str.toUpperCase();
		//System.out.println(str.length());
		for (int i=0; i<str1.length(); i++)
		{
			nstr=str1.charAt(i)+nstr;
		}
		
		if(str1.equals(nstr))
		{
			System.out.println("The String is Palindrome");
		}
		else
		{
			System.out.println("The String is not Palindrome");
		}
		
	}

}
