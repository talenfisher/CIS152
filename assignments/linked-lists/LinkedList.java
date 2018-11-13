/**
 * My implementation of a linkedlist in java.
 * This is a normal linkedlist, and only has forward iteration.
 * 
 * @author Talen Fisher
 *
 */
public class LinkedList {

    /**
     * Index where the LinkedList is empty
     */
	private static final int EMPTY = 0; 
    
    /**
     * Head / first link
     */
    private Link head; 
    
    /**
     * The current size of the LinkedList
     */
	private int size = EMPTY;
	
	/**
	 * Default constructor
	 */
	public LinkedList() {}
	
	/**
	 * Inserts a new item into the list.  The item becomes the 
	 * new head.
	 * 
	 * @param item the item to be inserted at the head
	 * @return the inserted item
	 */
	public Link insert(Can item) {
        Link link = new Link(item);
        
		if(!isEmpty()) link.setNext(head);
		size++;
		
		return head = link;
	}
	
	/**
	 * Deletes the first item.  The next item becomes the new
	 * head.
	 * 
	 * @return the item that was deleted
	 */
	public Link delete() {
		Link link = head;
		if(!isEmpty()) head = link.getNext();
		size--;
		
		return link;
	}
	
	/**
	 * Reverses the list
	 */
	public void reverse() {
		Link previous = null;
		Link current = head;
		Link next = null;
		
		while(current != null) {
			next = current.getNext(); 
			current.setNext(previous); // current > previous
			previous = current; // previous > current
			current = next; // current > next
		}
		
		head = previous;
	}
	
	/**
	 * Get the first item without modifying the list
	 * 
	 * @return the head item
	 */
	public Link peek() {
		return head;
	}
	
	/**
	 * Find out if the list is empty or not
	 * 
	 * @return true if empty and false if not
	 */
	public boolean isEmpty() {
		return size == EMPTY;
	}
	
	/**
	 * Get the size of the list
	 * 
	 * @return the list size
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Prints the list to the console
	 */
	public void display() {
		System.out.println(this);
	}
	
	/**
	 * Converts the list to a string
	 */
	public String toString() {
		Link link = this.head;
		String out = "[";
		
		do {
			out += "\n\t" + link;
		} while((link = link.getNext()) != null);
		
		out += "\n]";
		return out;
	}
}
