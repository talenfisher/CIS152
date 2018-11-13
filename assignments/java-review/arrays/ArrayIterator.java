/**
 * This program creates an array of size 10, fills it with random numbers and prints each one. 
 * 
 * @author Talen Fisher
 */

public class ArrayIterator {
	
	/**
	 * Program entry point
	 * @param args command line arguments (if any)
	 */
	public static void main(String[] args) {
		
		// initialize needed variables
		final int SIZE = 10;
		int[] randomNumbers = new int[SIZE];
		int index = 0;
		
		for(int number : randomNumbers) {
			randomNumbers[index] = (int)(Math.random() * 25) + 1; // generate random number
			System.out.println("randomNumbers element at index["+index+"] = "+randomNumbers[index]); // print element
			index++;
		}
	}
}