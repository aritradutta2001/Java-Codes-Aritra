package arrayandstringpack;

public class ReverseAnArrayInJava {

	public static void main(String[] args) 
	{
	
		        int arr[] = {1, 2, 3, 4, 5};
		        
		        // Reversing the array using a for loop
		        int n = arr.length;
		        for (int i = 0; i < n / 2; i++)
		        {
		            int temp = arr[i];
		            arr[i] = arr[n - 1 - i];
		            arr[n - 1 - i] = temp;
		        }
		        
		        // Printing the reversed array
		        for (int i = 0; i < n; i++) 
		        {
		            System.out.println(arr[i]);
		        }
	}
}
