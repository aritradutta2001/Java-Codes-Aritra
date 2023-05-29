package arrayandstringpack;
import java.util.*;
class Add
{
	static void f()
	{
		String arr[]= {"Apple","Mango","Apple","Banana","Mango"}; 
		String arr1[]= {"Apple","Mango","Apple","Banana","Mango"};
		int n=arr.length;
		//System.out.println(n);
		String res []= new String[n];
		for(int i=0;i<n;i++)
		{
			res[i]=arr[i]+" ,"+arr1[i];
		}
		List<String> list = Arrays.asList(res);
		System.out.println(list);
	}
}
public class AddTwoStringByEachIndex {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Add.f();	
	}

}
