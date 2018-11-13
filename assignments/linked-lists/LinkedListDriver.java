/**
 * Program to test my implementation of a LinkedList.  Declares
 * a linkedlist and inserts a number of different cans.
 * 
 * @author Talen Fisher
 *
 */
public class LinkedListDriver {
	
	public static void main(String[] args) {
		// initialize needed variables
		LinkedList canList = new LinkedList();
		
		// Instructions: You need to create a driver that makes several cans and places them in alphabetical order in a list.
		
		// make cans
		Can soup = new Can("alphonse, inc.", "soup", 13, 14);
		Can corn = new Can("beta, llc", "corn", 13, 15);
		Can carrot = new Can("carrot corp", "carrots", 13, 16);
		
		
		// place them in alphabetical order in a list (by company name)
		canList.insert(carrot);
		canList.insert(corn);
		canList.insert(soup);
		canList.display();
		
		
		// show reverse method, this reverses the list and is no longer in alphabetical order
		canList.reverse();
		System.out.print("\nreverse(): ");
		canList.display();
		
		// delete one
		canList.delete();
		System.out.print("\ndelete(): ");
		canList.display();
		
		// test peek and getNext
		Link next = canList.peek();
		System.out.println("\npeek(): " + next);
		System.out.println("\npeek().getNext(): " + next.getNext());
	}

}
