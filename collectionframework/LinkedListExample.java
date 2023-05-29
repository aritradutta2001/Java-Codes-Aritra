package collectionframework;
import java.util.*;  
public class LinkedListExample
{  
	public static void main(String args[])
	{  
		LinkedList<String> al=new LinkedList<String>();  
		LinkedList<String> al1=new LinkedList<String>();  

		//Add an Element in LinkedList

		al.add("Orange");  
		al.add("Apple");  
		al.add("Banana");  
		al.add("Guava");   
		al.add("Chicken");

		System.out.println(al);

		//Add an Element in LinkedList
		
		al1.add("cat");
		al1.add("dog");
		al1.add("cow");
		al1.add("goat");

		System.out.println(al1);


		//Append all of the elements in the specified collection to the end of this list
		System.out.println("\nAdding new elements to the end of the Linkedlist");
		al.addAll(al1);
		System.out.println(al);

		//Insert an element at the specified position
		System.out.println("\nInsert Tommato at the position 2");
		al.add(2,"Tommato");//2 is the position and Tommato is the element
		System.out.println(al);

		//Update an element at any pos
		al.set(3,"Hello"); // 3 is index and Hello is element
		System.out.println("\nUpdate the element at 3 pos by Hello");
		System.out.println(al);


		//Insert an element at the beginning of the list
		System.out.println("\nInsert Carrot at the beginning of the list");
		al.addFirst("Carrot");
		System.out.println(al);
	
		//Append the element to the end of the list
		System.out.println("\nAppend Bread to the end of the list");
		al.addLast("Bread");
		System.out.println(al);


		//It is used to retrieve and removes the first element of a list
   		System.out.println("\nRemoves the first element of a list");
   		al.remove();
   		System.out.println(al); 

		//Remove the 2 position element
		System.out.println("\nRemove the 2 position element");
		al.remove(2);
		System.out.println(al);
   
		//It removes and returns the first element from a list.
		System.out.println("\nRemoves the first element from a list");
		al.removeFirst();
		System.out.println(al); 

		//It removes and returns the last element from a list.
   		System.out.println("\nRemoves the last element from a list");
   		al.removeLast();
   		System.out.println(al); 
  
		//Displayed by Iterator interface
		System.out.println("\nDisplayed by Iterator interface");
		Iterator<String> itr=al.iterator();  
  		while(itr.hasNext())
		{  
   			System.out.println(itr.next()); 
		}

		//Display by For-Each Loop
		System.out.println("\nDisplay by For-Each Loop");
		for (String i : al)
		{  
			System.out.println(i);  
		}  
	}  
}  
