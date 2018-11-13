/**
 * Wrapper for each item inserted into a linkedlist
 * 
 * @author Talen Fisher
 */
public class Link {

    /**
     * The data stored in the link (can be anything)
     */
    private Object data;

    /**
     * The next link in the list
     */
    private Link next;

    /**
     * Constructor
     * 
     * @param data the object/data to store
     */
    public Link(Object data) {
        this.data = data;
    }

    /**
     * Getter for data - readonly after object creation
     * 
     * @return data property
     */
    public Object getData() {
        return data;
    }

    /**
     * Setter for next
     * 
     * @param next the next link in the list
     */
    public void setNext(Link next) {
        this.next = next;
    }

    /**
     * Getter for next
     * 
     * @return the next link in the list
     */
    public Link getNext() {
        return next;
    }

    /**
     * pass through to data's toString method
     */
    public String toString() {
        return getData().toString();
    }
}