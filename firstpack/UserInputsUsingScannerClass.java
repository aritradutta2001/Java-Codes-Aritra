package firstpack;
import java.util.*;
public class UserInputsUsingScannerClass {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Input Any Number : ");
		int a=sc.nextInt();
		System.out.println("Number is : "+a);
		System.out.println("Please Input Any char : ");
		char b=sc.next().charAt(0);
		System.out.println("Char is : "+b);
		System.out.println("Please Input Any Number in Double : ");
		double d=sc.nextDouble();
		System.out.println("Number in Double is : "+d);
		System.out.println("Please Input Any Number in Float : ");
		float f= sc.nextFloat();
		System.out.println("Number in Float is : "+f);
		System.out.println("Please Input Any String : ");
		String str=sc.nextLine();
		System.out.println("String is : "+str);

	}

}
