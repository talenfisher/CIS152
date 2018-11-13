/**
 * Person class, holds info about people (firstname, lastname, clicks)
 * @author talen
 *
 */
public class Person {

    /**
     * A person's first name.
     */
    private String firstname;

    /**
     * A person's last name.
     */
    private String lastname;

    /**
     * Number of times they have clicked on emails.
     */
    private int clicks = 0;

    /**
     * Constructs a new Person object
     * 
     * @param firstname A Person's first name
     * @param lastname A Person's last name
     */
    Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * convert person to string
     */
    public String toString() {
        return firstname + " " + lastname + " (" + clicks + " clicks)";
    }

    /**
     * Getter for firstname
     * @return firstname the first name of the person
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Setter for firstname
     * @param firstname the first name of the person
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Getter for lastname
     * @return lastname the last name of a person
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Setter for lastname
     * @param lastname the last name of a person
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Getter for clicks
     * @return number of times this person has clicked on emails
     */
    public int getClicks() {
        return clicks;
    }

    /**
     * Setter for clicks
     * @param clicks number of clicks to set it to
     */
    public void setClicks(int clicks) {
        this.clicks = clicks;
    }
}
