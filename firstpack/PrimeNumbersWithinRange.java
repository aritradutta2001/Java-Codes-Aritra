//Prime numbers within range 
package firstpack;
import java.util.*;

public class PrimeNumbersWithinRange {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,j,flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting pos : ");
		int s =sc.nextInt();
		System.out.println("Enter the Ending pos : ");
		int e =sc.nextInt();
		for(i=s;i<=e;i++)
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
