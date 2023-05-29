package secpack;
//Multiiple Inheritance , Which is not possible in Java Using Class
//It will give an error during compile time
class Test
{
	void f()
	{
		System.out.println("Hello");
	}
}
class Test1
{
	void f()
	{
		System.out.println("Hii");
	}
}
class Main extends Test,Test1
{
	public void f()//override
	{
		System.out.println("Ok");
	}
}
public class MultipleInheritanceUsingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main r = new Main();
		r.f();

	}
}
