package firstpack;

import java.util.Scanner;

public class PrimeNumbersInAnArray 
{

	public static void main(String[] args) 
	{
		
		int i,j,flag;
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int n=arr.length;
		
		for(i=arr[0];i<arr[n-1];i++)
		{
			
			if(i==0 || i == 1)//0 and 1 is not prime so skip  them
			{
				continue;
			}
			else
            { 
				flag=1;
				for(j=2;j<= i/2 ;j++)							
   				{
     	 	 			if(i%j==0)
         	 			{
         	 				flag=0;
        	 				break;
      		 			}			
  				}
  		
  	 			if(flag==1)//flag= 1 means i is prime and flag = 0 means i is not prime
   	    		{
  	 				System.out.println(i);
	      		}
			} 
			
		}
	}

}
