package arrayandstringpack;

public class BuildStringFromCharacterArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char arr[]= {'G','O','O','G','L','E'};
		String str="";
		for(int i=0;i<arr.length;i++)
		{
			str=str+arr[i];
		}
		System.out.println(str);

	}

}
