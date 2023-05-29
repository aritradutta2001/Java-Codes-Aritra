//Input from user
package collectionframework;
import java.util.*;

public class VectorExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("How Many Elements you want to add ? ");
		int n = sc.nextInt();
		System.out.println("Enter Elements : ");
		for(int i=0;i<n;i++)
		{
			v.add(sc.nextInt());
		}
		System.out.println(v);
	}

}
