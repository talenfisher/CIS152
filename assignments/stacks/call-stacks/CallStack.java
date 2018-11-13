/**
 * This class contains 4 static methods to be used in the call stack experiment.
 * 
 * @author Talen Fisher
 */
public class CallStack {
	
	/**
	 * First method
	 */
	public static void method1() {
		System.out.println("In method1");
		System.out.println("Exiting method1");
	}
	
	/**
	 * Second method
	 */
	public static void method2() {
		System.out.println("In method2");
		System.out.println("Exiting method2");
	}
	
	/**
	 * Third method
	 */
	public static void method3() {
		System.out.println("In method3");
		System.out.println("Exiting method3");
	}
	
	/**
	 * Fourth method
	 */
	public static void method4() {
		System.out.println("In method4");
		System.out.println("Exiting method4");
	}
}
