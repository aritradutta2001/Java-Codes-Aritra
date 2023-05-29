package firstpack;
import java.util.*;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{  
		    int n,i,flag = 1;
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the number : ");
		    n=sc.nextInt();
			
		            if (n==0 || n==1)
					{
		            	 System.out.println(n+" is not a prime number.");
					}
					else
		            { 
						for(i=2;i<= n/2;i++)							
		   				{
		     	 	 			if(n%i==0)
		         	 			{
		     	 	 				System.out.println(n+" is not a prime number.");
		         	 				flag=0;
		        	 				break;
		      		 			}			
		  				}
		  		
		  	 			if(flag==1)
		   	    		{
		  	 				System.out.println(n+" is a prime number.");
			      		}
					}
		                

		     	 
		}

	}


