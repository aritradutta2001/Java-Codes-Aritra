package firstpack;
class Ex
{
	int a ; // Instance Variable
	
	Ex(int a)   // Local Variable 
	{
		a=a;
		System.out.println("The value of local variable is : " + a);
	}
	void f()
	{
		int n = a*a;
		System.out.println("The value of Instance variable is : " + a);
	}
}
public class FourthProg {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Ex r = new Ex(5);
		r.f();

	}

}
