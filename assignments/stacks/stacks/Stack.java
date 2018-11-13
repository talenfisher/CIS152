/**
 * Implementation of a stack in Java
 * 
 * @author Talen Fisher
 */
public class Stack {

    /**
     * Position where the top is at if the stack is empty
     */
    private static final int EMPTY = -1;

    /**
     * Top of the stack
     */
    private int top = EMPTY;

    /**
     * Internal stacks array
     */
    private String[] stacks;

    /**
     * Constructor, creates a new stack of a specified size
     * 
     * @param size maximum size of the stack
     */
    public Stack(int size) {
        stacks = new String[size];
    }

    /**
     * Push an item to the end of the stack
     * 
     * @param item the item to add to the stack
     * @return the item added if successful, and null if not
     */
    public String push(String item) {
        // if storage isn't full, add item to storage and return it, otherwise return null
        return ((!isFull()) ? stacks[++top] = item : null); 
    }

    /**
     * Pop an item off the end of the stack and return it.  This modifies the stack.
     * 
     * @return the last item added to the stack
     */
    public String pop() { 
        String item = null; // default return value

        if(!isEmpty()) { // only return element if the stack is not empty
            item = stacks[top];
            stacks[top--] = null; // decrement counter after removing item from the stack
        }

        return item;
    }

    /**
     * Exactly like pop except the stack is not modified
     * 
     * @return the last item added to the stack, or null if empty
     */
    public String peek() {
        // if storage isn't empty, return top element, otherwise return null
        return (!isEmpty()) ? stacks[top] : null;
    }

    /**
     * Check if the stack is empty
     * 
     * @return true if the stack is empty, false if not
     */
    public boolean isEmpty() {
        return top == EMPTY;
    }

    /**
     * Check if the stack is full
     * 
     * @return true if the stack is full, false if not
     */
    public boolean isFull() {
        return size() == stacks.length;
    }

    /**
     * Get the current size of the stack
     * 
     * @return the size of the stack
     */
    public int size() {
        return this.top + 1; // add 1 because the storage is zero indexed
    }

    /**
     * Prints the result of peek() (which returns the top element)
     */
    public void top() {
        System.out.print(peek());
    }

    /**
     * Prints the stack (wrapper for toString)
     */
    public void print() {
        System.out.println(this);
    }


    /**
     * Helper for casting the stack to a string
     * 
     * @return string representation of the stack
     */
    public String toString() {
        String out = "[";

        for(int i = 0; i <= top; i++) {
            out += stacks[i];
            if(i != top) out += ", "; // only add a comma if on the last element 
        }

        out += "]";
        return out;
    }
}
