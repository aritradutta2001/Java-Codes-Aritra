package firstpack;
import java.util.*;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String str,nstr="",temp="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		str= sc.next();
		//System.out.println(str.length());
		for (int i=0; i<str.length();i++)
		{
			nstr=str.charAt(i)+nstr;
		}
		System.out.println("Reverse Of The String is : " + nstr);
		 
	}

}
