/*If We Declare a constructor as private and we want create object,
we can crate an object of a class which contains private constructor within same class.
But we can't create an object in another class.
So,if we want to display the private constructor message we have to follow the below 
code
*/
package firstpack;

class A1
{
	private A1() 
	{
		System.out.println("Private Const and Create Object in another Class");
	}
	static A1 getA1()
	{
		return new A1();
	}
}//class 

public class PrivateConsObject 
{
	private PrivateConsObject()
	{
		System.out.println("Private Const and create Object Within Same Class");
	}
	public static void main(String[] args) 
	{
		PrivateConsObject p = new PrivateConsObject();// we can create an Object within same class
		A1 a= A1.getA1();

	}

}
