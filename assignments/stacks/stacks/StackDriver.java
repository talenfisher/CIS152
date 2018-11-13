/**
 * This program creates a stack and tests different operations on it, and
 * prints each operation out so that you may see each test and how it affects
 * the stack.
 *
 * @author Talen Fisher
 */
public class StackDriver {
	
	/**
	 * program entry point
	 * @param args command line args if any
	 */
	public static void main(String[] args) {
		// create a new stack with a max size of 5
		Stack clothing = new Stack(5);
		
		// run some tests
		printStackAction("push(redShirt)", clothing.push("redShirt"), clothing);
		printStackAction("push(greenShirt)", clothing.push("greenShirt"), clothing);
		printStackAction("push(yellowPants)", clothing.push("yellowPants"), clothing);
		printStackAction("push(purpleSock)", clothing.push("purpleSock"), clothing);
		printStackAction("push(pinkSocks)", clothing.push("pinkSocks"), clothing);
		printStackAction("size()", clothing.size(), clothing);
		printStackAction("push(blueShirt)", clothing.push("blueShirt"), clothing);
		printStackAction("size()", clothing.size(), clothing);
		printStackAction("pop()", clothing.pop(), clothing);
		printStackAction("pop()", clothing.pop(), clothing);
		printStackAction("size()", clothing.size(), clothing);
		printStackAction("pop()", clothing.pop(), clothing);
		
		// testing the output of top() (which prints peek()) so some formatting magic is needed here
		System.out.printf("%-30s ", "top():");
		clothing.top();
		System.out.print(" ");
		clothing.print();
		System.out.println();
		
		// run the rest of the required tests
		printStackAction("pop()", clothing.pop(), clothing);
		printStackAction("pop()", clothing.pop(), clothing);
		printStackAction("size()", clothing.size(), clothing);
		printStackAction("isEmpty()", clothing.isEmpty(), clothing);
		
		// some additional tests
		printStackAction("isFull()", clothing.isFull(), clothing);
		printStackAction("peek()", clothing.peek(), clothing);
		printStackAction("pop()", clothing.pop(), clothing);
	}
	
	/**
	 * Function for printing out stack tests/actions in a uniform format.
	 * Example output:
	 * pop():                        yellowPants [redShirt, greenShirt]
	 * 
	 * @todo use reflection to dynamically call each method  
	 * @param key the test key/name (string representation of the method call)
	 * 
	 * Lets say the pointer is at 6 but you have an array size of 5 and you have elements
	 * in the front of the array.  The real position in the array for the pointer is actually 1
	 * This is calculated by pointer % size
	 * @param value the value returned from the method that was called (this can be anything)
	 * @param stack the stack used for the test
	 */
	public static <Value> void printStackAction(String key, Value value, Stack stack) {
		// used a generic for the action parameter because the methods tested can return either a string or int
		System.out.printf("%-20s %20s ", key+":", value);
		stack.print(); // output stack contents
		System.out.println();
	}
}
