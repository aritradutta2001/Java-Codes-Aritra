package arrayandstringpack;
//StrintBuilder Class is use to build String From any datatypes like int,char etc.
public class StringBuilderClassExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char arr[]={'G','o','o','g','l','e'};
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<arr.length;i++)
		{
			sb.append(arr[i]);
		}
		System.out.println(sb.toString());
	}

}
