//ArrayList class
package collectionframework;
import java.util.*;
public class ArrayListExample
{
public static void main(String args[])
{
ArrayList<Integer> list = new ArrayList<Integer>();  //Integer --> Wrapper Class
ArrayList<String> list1 = new ArrayList<String>();
/*ArrayList list2 = new ArrayList();*/

//Add elements in ArrayList
//Integer
System.out.println("-----For Integer-----");

list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
list.add(60);
list.add(70);
list.add(80);

System.out.println(list);

//Insert an element in any position
list.add(2,15);//2 is index and 15 is element
System.out.println("\nAppend 15 in 2 pos");
System.out.println(list);

//Update an element at any pos
list.set(3,20); // 3 is index and 20 is element
System.out.println("\nUpdate the element at 3 pos by 20");
System.out.println(list);

//Remove an element from any position
System.out.println("\nRemove the element of index 1");
list.remove(1); // index 1
System.out.println(list);

//Iterating By For-Each Loop
System.out.println("\nIterating By For-Each Loop");
for(int al : list)
System.out.println(al);

// Displayed by Iterator interface
System.out.println("\nDisplayed by Iterator interface");
Iterator<Integer> i = list.iterator();
while(i.hasNext())
{
	System.out.println(i.next()+" ");
}

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


//Add elements in ArrayList
//String
System.out.println("-----For String-----");
list1.add("Orange");
list1.add("Banana");
list1.add("Guava");
list1.add("Apple");
list1.add("Chicken");
System.out.println(list1);

/*// Remove all The Elements lies within the given position
System.out.println("Remove all The Elements lies within the position 2 to 4");
list1.removeRange(2,4);
System.out.println(list1);*/

/*
//Add elements in ArrayList
//For All String,int,char etc
System.out.println("\n-----For All String,int,char-----");
list2.add("Orange");
list2.add(1);
list2.add('A');
System.out.println(list2);
*/
}
}
