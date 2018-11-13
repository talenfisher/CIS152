/**
 * Call stack lab.  This calls 4 methods in different orders to see how Java's call stack
 * behaves.
 * 
 * After running this, I find that the methods are executed as expected (in the order in which they are called)
 * 
 * @author Talen Fisher
 *
 */
public class CallStackDriver {
	public static void main(String args[]) {
		System.out.println("In main method\n");
		
		// try sequentially 1-4
		CallStack.method1();
		CallStack.method2();
		CallStack.method3();
		CallStack.method4();
		
		System.out.println();
		
		// try reverse
		CallStack.method4();
		CallStack.method3();
		CallStack.method2();
		CallStack.method1();
		
		System.out.println();
		
		// try out of order
		CallStack.method2();
		CallStack.method4();
		CallStack.method3();
		CallStack.method1();
		
		System.out.println();
		System.out.println("Exiting main");
	}
}
