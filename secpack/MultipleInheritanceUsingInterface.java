package secpack;

interface X
{
	void f();
}
interface Y
{
	void f();
}
class Z implements X,Y
{
	public void f()
	{
		System.out.println("Hello");
	}
}
public class MultipleInheritanceUsingInterface  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z r = new Z();
		r.f();

	}

}
