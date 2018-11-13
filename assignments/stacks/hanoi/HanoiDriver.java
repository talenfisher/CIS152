import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * "Shall we play a game?" - Joshua (WarGames)
 *
 * Driver class for my java implementation of Towers of Hanoi.  This accepts a certain number
 * of disks from the user and makes moves accordingly to move a stack of disks from one peg to another.
 * 
 * @author Talen Fisher
 */
public class HanoiDriver {

    public static void main(String args[]) {

        // initialize needed variables
        Hanoi hanoi = new Hanoi();
        Scanner in = new Scanner(System.in);
        int disks = 0;

        // print intro and get number of disks
        System.out.println("Welcome to Towers of Hanoi.  \nPlease note that entering >20 disks may take a while to compute depending on your computer's processing power.");

        while(disks <= 0) {
            System.out.print("Please enter the number of discs to play: ");

            try {
                disks = in.nextInt();

                if(disks <= 0) { // disks entered wasn't a positive number
                    System.out.println("Please enter a number greater than 0\n");
                }

            } catch(InputMismatchException exception) { // disks entered wasn't a number at all
                System.out.println("Please enter a number greater than 0.\n");
                in.next();
            }
        }

        // make the first move to start the game
        hanoi.move(disks, "A", "B", "C");

        System.out.println("Expected number of moves: " + (int)(Math.pow(2, disks) - 1)); // calculate expected number of moves (2^n - 1)
        System.out.println("Actual number of moves: " + hanoi.getMoves()); // get actual number of moves

        in.close(); // close input
    }
}
