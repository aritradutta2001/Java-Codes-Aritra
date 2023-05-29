/*
 Given a String "I Love Java" we have to break this string from space and store into an array
 
 Example:
 Input : I Love Java
 Output:
 I
 Love
 Java
 */
/*
 ---Used For String---
 next() method -> Present in Scanner class.This method can read the input only until a space(" ").
 Example : I Love Java
 Output : I
 Because It can only read the input until space
 */
/*
 ---Used For String---
 nextLine() method -> Present in Scanner Class.This Method can read the input till the end of the Line.
 Example:
 Input : I Love Java
 Output: I Love Java
 */
package arrayandstringpack;
import java.util.*;
public class BreakStringFromSpaceAndStoreIntoArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=sc.nextLine();
		String str1[]=str.split(" ");
		
		System.out.println("Output : ");
		for(int i=0;i<str1.length;i++)
		{
			System.out.println(str1[i]);
		}
		

	}

}
