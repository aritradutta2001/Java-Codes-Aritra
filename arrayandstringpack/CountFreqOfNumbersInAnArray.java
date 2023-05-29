package arrayandstringpack;

public class CountFreqOfNumbersInAnArray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,1,3,4,5,4};
		int n=arr.length;
		int freq[]=new int[n];
		int count=0,visited=-1;
		 
		System.out.println("Frequency Of Each Numbers Are : ");
		for (int i=0;i<n;i++)
		{
			count=1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					freq[j]=visited;
					//System.out.println(freq[j]);
				}
			}
			if(freq[i]!=visited)
			{
				freq[i]=count;
				System.out.println(arr[i]+" -> "+freq[i]);
			}
		}

	}

}
