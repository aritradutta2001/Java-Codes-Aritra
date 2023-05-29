/*Lambda associated with Functional Interface ,It means Lambda only works with the interface 
which has Single Abstract Method(SAM).
Functional Interface : An interface that have only one abstract method .
It can have any number of default,static methods but only one abstract method.
*/
package java8;

interface I2
{
	void f(); // abstract method 
}

public class LambdaExample1 
{

	public static void main(String[] args) 
	{
		// single statement lambda
		
		I2 r = ()->System.out.println("Hello"); 
		r.f();
		

	}

}
