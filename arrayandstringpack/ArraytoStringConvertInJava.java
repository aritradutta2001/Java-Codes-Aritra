/* We can create a String from an array using two ways
 * i)We can use Arrays.toString() method
 * ii)We can create a string using append() method of StringBuilder class 
 */
package arrayandstringpack;

import java.util.Arrays;

public class ArraytoStringConvertInJava 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char arr[]= {'T','i','g','e','r'};
		String str=Arrays.toString(arr);    // Using Arrays.toString() method
		System.out.println(str);
		StringBuilder sb = new StringBuilder(); // Using StringBuilder Class
		for(int i=0;i<arr.length;i++)
		{
			sb.append(arr[i]);
		}
		System.out.println(sb.toString());
	}

}
