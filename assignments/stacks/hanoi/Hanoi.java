/**
 * Hanoi game implementation.  Takes a certain number of disks and outputs the moves 
 * needed to solve the game (move all the disks from peg a to b)
 * 
 * @author Talen Fisher
 */
public class Hanoi {

    /**
     * Number of moves made
     */
	private int moves = 0;
	
	/**
	 * Default constructor
	 */
	public Hanoi() {}
	
	/**
	 * Recursive function for making a move in hanoi. Calling this 
	 * will make subsequent calls to itself to continue the process until the game
	 * has been solved.
	 * 
	 * @param disk the disk number
	 * @param source the source peg
	 * @param destination the destination peg
	 * @param auxiliary the auxiliary peg
	 */
	public void move(int disk, String source, String destination, String auxiliary) {
		moves++;
		
		if(disk == 1) { // if this were 0 we would be adding an extra step (2^(n+1) - 1)
			System.out.println("Move disk " + disk +" from " + source + " to " + destination);
		} else {
			move(disk - 1, source, auxiliary, destination); // first move
			System.out.println("Move disk " + disk + " from " + source + " to " + destination); // second move 
			move(disk - 1, auxiliary, destination, source); // third move
		}
	}
	
	/**
	 * Getter for moves.  Moves is a readonly property, so it has no setter
	 * @return total number of moves made
	 */
	public int getMoves() {
		return moves;
	}
}
