import java.util.NoSuchElementException;
import java.util.Iterator;

/**
 * Iterator for traversing trees in-order
 * 
 * @author Talen Fisher
 */
public class InOrderTreeIterator implements Iterator {

    /**
     * The next node to iterate over
     */
	private Node next;
	
	/**
	 * Constructor.  Creates a new iterator and moves the pointer to the bottom of the tree
	 *  
	 * @param head node to start with
	 */
	public InOrderTreeIterator(Node head) {
		next = head;
		
		while(next.left != null) { // start with leftmost element at the bottom
			next = next.left;
		}
	}
	
	/**
	 * Checks to see if another node exists
     * 
	 * @return true if there is another node available and false if not
	 */
	public boolean hasNext() {
		return next != null;
	}
	
	/**
	 * Gets the next node
     * 
	 * @return the next node
	 * @throws NoSuchElementException
	 */
	public Node next() throws NoSuchElementException {
        if(!hasNext()) throw new NoSuchElementException(); // nothing to return
        
		Node returnNode = next; // we have the next element to return, now we just need to adjust which one we'll return next
        move(); // move to next one
        
		return returnNode;
	}
	
	/**
	 * Moves to the next node
	 */
	private void move() {
		if(next.right != null) {
			next = next.right;
            
            while(next.left != null) { // if it has children on the left, start there and at the bottom
				next = next.left;
            }

			return;
		}
		
		while(true) { 
			if(next.parent == null) { // this is the head, the iterator will end here
				next = null;
				break;
			}
			
			if(next.parent.left == next) { // if we're working on the left node, move to root element
				next = next.parent;
				break;
			}
			
			// on right element, move up to root (this will repeat until we're on a left node)
			next = next.parent;
		}
	}
}
