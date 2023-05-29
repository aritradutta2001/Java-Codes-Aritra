package java8;

interface I
{
	void f();
}
public class AnonomousInnerClass {

	public static void main(String[] args) 
	{
		I r = new I()
				{
					public void f()
					{
						System.out.println("Hello World");
					}
				};
		r.f();
	}

}
