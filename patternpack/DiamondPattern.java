/*
Pattern

 	* 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
 */

package patternpack;
import java.util.*;

public class DiamondPattern {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i,j,k,n;
		System.out.println("Enter Number of Rows : ");
		n= sc.nextInt();
		for(i=0;i<n;i++)
		{
			//System.out.println(i);
			for(j=0;j<n-i-1;j++)
			{
				System.out.print(" "); 
			}
			for(k=0;k<i+1;k++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		n=n-1;
		for(i=0;i<n;i++)
		{
			//System.out.println(i);
			for(j=0;j<i+1;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<n-i;k++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}

	}

}
