package collectionframework;
import java.util.Scanner;
import java.util.ArrayList;

public class UserInputArrayList
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("How Many Elements you want to add ? ");
		int n = sc.nextInt();
		System.out.println("Enter the elements");
		/*while(sc.hasNextInt(n))
		{
			list.add(sc.nextInt());
		}*/
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println(list);
	}
}