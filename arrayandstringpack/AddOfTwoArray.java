package arrayandstringpack;

class Test
{
	Test()
	{
	
		int a[]={1,2,3,4,5};
		int b[]={1,2,3,4,5,6};
		int n=b.length;
		int c[] = new int[n];
		int i;
		

		for (i=0;i<n-1;i++)
		{
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
		}
	}
}
		
public class AddOfTwoArray
{
	public static void main(String args[])
	{
		Test t = new Test();
	}
}