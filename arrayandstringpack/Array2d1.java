package arrayandstringpack;


public class Array2d1 {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//2d array declaration
		int arr[][]={{1,2,3},{4,5,6}};
		
		System.out.println("The Elements of array are : ");
		for(int i =0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;j++)	
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
		
	}

}

