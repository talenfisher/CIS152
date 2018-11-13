/**
 * Representation of socks.  Has size and color, and sometimes comes in pairs.
 * 
 * @author Talen Fisher
 */
public class Socks extends Clothing {

    /**
     * Whether or not this is a pair of socks
     */
    private boolean pair = true;

    /**
     * Default constructor, no args
     */
    public Socks() {
        super();
    }

    /**
     * Constructor that takes size and color
     * 
     * @param size
     * @param color
     */
    public Socks(String size, String color) {
        super(size, color);
    }

    /**
     * Full constructor, takes size, color and pair
     * 
     * @param size socks size
     * @param color socks color
     * @param pair whether or not this is a pair
     */
    public Socks(String size, String color, boolean pair) {
        super(size, color);
        this.pair = pair;
    }


    /**
     * Getter for pair property
     * 
     * @return whether or not this is a pair
     */
    public boolean getPair() {
        return pair;
    }

    /**
     * Setter for pair property
     * 
     * @param pair whether or not this is a pair
     */
    public void setPair(boolean pair) {
        this.pair = pair;
    }

    /**
     * Overridden version of toString to include the pair property
     * 
     * @return string representation of the object
     */
    public String toString() {
        return super.toString() + "[ pair = " + pair + " ]";
    }
}
