package firstpack;
import java.util.*;

class A
{
	int a;  // Instance variable 
	A(int a )  // Local Variable
	{
		this.a=a;
	}
	void f()
	{
		int mul=a*a;
		System.out.println("The Result is :" +mul);
	}
}
public class FirstProg {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		A r = new A (n);
		r.f();
	}
}


