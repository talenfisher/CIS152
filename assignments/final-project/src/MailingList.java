import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/**
 * A Mailing List.
 * 
 * Commands:
 * a for adding an email
 * r for removing an email
 * s for showing the list
 * q for sending an email to the list
 * e for exit
 * 
 * @author Talen Fisher
 *
 */
public class MailingList {

    /**
     * Regex for matching an email address
     */
    private static final String EMAIL_REGEX = "^([^@]+)@([^@]+)$";

    /**
     * Variable for storing people
     */
    private static Map<String,Person> storage = new Map<>();

    /**
     * Program loop control variable
     */
    private static boolean run = true;

    /**
     * Random
     */
    private static Random random = new Random();

    /**
     * Scanner
     */
    private static Scanner in = new Scanner(System.in);
	
	/**
	 * Program entry point
	 * @param args
	 */
	public static void main(String[] args) {
		
		// program loop
		while(run) {
			try {
				// display commands
				System.out.print("Choose one: a (add), r (remove), s (show), q (queue email), e (exit): ");
				String option = in.nextLine();
				
				switch(option) {
					case "a": add(); break;
					case "s": show(); break;
					case "r": remove(); break;
					case "q": queue(); break;
					case "e": run = false; break;
					default: System.out.println("Invalid command.\n"); break;
				}
				
			} catch(Exception e) { // bad email
				if(e.getMessage().equals("bad email")) System.out.println("Please enter a valid email\n");
				else System.out.println("Invalid option\n");
			}
		}
		
		// exit program
		System.out.println("Goodbye!");
		in.close();
    }
    
    /**
     * a(dd) subcommand, adds a new person to the mailing list
     */
    private static void add() throws Exception {
        System.out.print("Enter email: ");
        String email = in.nextLine().trim();
        if(!email.matches(EMAIL_REGEX)) throw new Exception("bad email"); // check to see if email was entered
        
        // get firstname
        System.out.print("Enter first name: ");
        String firstname = in.nextLine();
        
        // get lastname
        System.out.print("Enter last name: ");
        String lastname = in.nextLine();
        
        // create person, enter it into the map
        Person person = new Person(firstname, lastname);
        storage.set(email, person);
        System.out.println();
    }

    /**
     * s(how) subcommand, shows all the entries in the mailing list
     */
    private static void show() {
        for(Entry<String,Person> entry : storage) {
            System.out.println(entry);
        }
        
        System.out.println();
    }

    /**
     * r(emove) subcommand, removes an entry from the mailing list
     */
    private static void remove() {
        System.out.print("Enter the email to delete: ");
        Entry<String,Person> deleted = storage.delete(in.nextLine().trim()); // delete it
        System.out.println("Deleted "+ ((deleted == null) ? "nothing" : deleted) + "\n");
    }

    /**
     * q(ueue) subcommand, simulates sending out an email and having multiple people click on it
     */
    private static void queue() {
        System.out.print("Enter a message to send:");
        in.nextLine();
        
        // convert map to queue
        Queue<Entry<String,Person>> queue = storage.toQueue(); 
        
        // dequeue until empty
        while(!queue.isEmpty()) {
            
            Entry<String,Person> entry = queue.dequeue();
            Person value = entry.getValue();

            if(random.nextBoolean()) {
                value.setClicks(value.getClicks() + 1);
            }

            storage.set(entry.getKey(), value);
            System.out.println("Sent message to " + value);
        }
        
        System.out.println("Sent messages to everyone in mailing list.\n");
    }
}