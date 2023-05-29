//List interface
//The ArrayList and LinkedList classes provide the implementation of List interface.
package collectionframework;
import java.util.List;
import java.util.ArrayList;

public class ListExample
{
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<Integer>();
	
		//Add elements in ArrayList
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);

		//Insert an element in any position
		list.add(2,10);//2 is index and 10 is element
		System.out.println("\nInsert element in 2 pos");
		System.out.println(list);

		//Update an element in any pos
		list.set(3,20); // 3 is index and 20 is element
		System.out.println("\nUpdate the element at 3 pos by 20");
		System.out.println(list);

		//Remove an element from a pos
		System.out.println("\nRemove the element of index 1");
		list.remove(1);//index 1
		System.out.println(list);

		//Iterating By For-Each Loop
		System.out.println("\nIterating By For-Each Loop");
		for(int i : list)
		System.out.println(i);
		
		// Size 
		System.out.println("\n---Size---");
		System.out.println("Size ="+list.size());

		// Display the particular element with respect to index number
		System.out.println("\nDisplay index 3 element");
		System.out.println(list.get(3));

		/*// Remove all The Elements lies within the given position
		System.out.println("Remove all The Elements lies within the position 2 to 4");
		list.removeRange(2,4);
		System.out.println(list);*/

		// Remove all the elements
		System.out.println("\nRemove all The Elements ");
		list.clear();
		System.out.println(list);

	}
}
