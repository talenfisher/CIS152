/**
 * My implementation of a queue class in java using a circular array
 * 
 * @author Talen Fisher
 */
public class Queue {

    /**
     * Psuedo circular array for the queue
     */
    private String[] queue;

    /**
     * Front pointer
     * This can never be -1
     */
    private int front = 0; // front can never be -1

    /**
     * Rear pointer
     * No elements added so far, has to be -1 initially
     */
    private int rear = -1; 

    /**
     * Constructor, creates a new queue of a specified size
     * @param size the maximum size of the queue
     */
    public Queue(int size) {
        queue = new String[size];
    }

    /**
     * Helper method for determining real pointers. The pointers
     * keep incrementing beyond the array size so this method gets
     * the real position of the pointer in the array.
     * 
     * @param pointer the pointer to reference
     * @return the real position in the array
     */
    private int getRealPointer(int pointer) {
        // modulus calculation is only performed if pointer is at or beyond array size
        return (pointer >= queue.length) ? pointer % queue.length : pointer;
    }

    /**
     * Add an item to the end of the queue if the queue is
     * not full.
     * 
     * @param item the item to add
     * @return the item added if successful and null if not
     */
    public String enqueue(String item) {
        return (!isFull()) ? queue[getRealPointer(++rear)] = item : null;
    }

    /**
     * Remove an item from the beginning of the queue.
     * 
     * @return the item at the beginning of the queue or null if empty
     */
    public String dequeue() {
        // there is no point in nulling the element since it will get reassigned later
        return (!isEmpty()) ? queue[getRealPointer(front++)] : null;
    }

    /**
     * Return the item at the beginning of the queue
     * but does not modify the queue
     * 
     * @return the item at the beginning of the queue or null if empty
     */
    public String peek() {
        return (!isEmpty()) ? queue[getRealPointer(front)] : null;
    }

    /**
     * Check to see if the queue is full
     * 
     * @return true if full and false if empty
     */
    public boolean isFull() {
        return size() == queue.length;
    }


    /**
     * Check to see if the queue is empty
     * 
     * @return true if empty and false if not
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Get the size of the queue
     * 
     * @return the current amount of elements in the queue
     */
    public int size() {
        return (rear - front) + 1; // add 1 because the storage is zero indexed
    }

    /**
     * Print the queue
     */
    public void print() {
        System.out.print(this);
    }

    /**
     * Convert the queue to a string
     */
    public String toString() {
        String out = "[";

        for(int i = front; index <= rear; i++) {
            out += queue[getRealPointer(i)];
            if(i != rear) out += ", "; // only add a comma if not on the last element 
        }

        out += "]";
        return out;
    }
}
