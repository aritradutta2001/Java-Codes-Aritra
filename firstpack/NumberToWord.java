package firstpack;
import java.util.Scanner;
public class NumberToWord 
{

		public static void main(String args[])
		{
			Scanner sc=new Scanner (System.in);
			int rem,rev=0,n;
			int rem1;
			System.out.println("Enter The value : ");
			n=sc.nextInt();
			
			while(n>0)
			{
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			while(rev>0)
			{
				rem1=rev%10;
				
				switch(rem1)
				{
				case 1:
						System.out.print("One ");
						break;

				case 2:
						System.out.print("Two ");
							break;

				case 3:
						System.out.print("Three ");
						break;

				case 4:
						System.out.print("Four ");
						break;

				case 5:
						System.out.print("Five ");
						break;

				case 6:
						System.out.print("Six ");
						break;

				case 7:
						System.out.print("Seven ");
						break;

				case 8:
						System.out.print("Eight ");
						break;

				case 9:
						System.out.print("Nine ");
						break;
				default:
						System.out.print("You have entered wrong choice!");
				}
				rev=rev/10;
			}


		}
}


