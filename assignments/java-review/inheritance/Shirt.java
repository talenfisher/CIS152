import java.util.Arrays;
import java.lang.IllegalArgumentException;

/**
 * Representation of a shirt: has size, and color.
 * 
 * @author Talen Fisher
 */
public class Shirt extends Clothing {

    /**
     * Allowed shirt sizess
     */
    private static final String[] ALLOWED_SIZES = {"S", "M", "L", "XL"}; 

    /**
     * Default constructor, no args
     */
    public Shirt() {
        super();
    }

    /**
     * Full constructor, takes size and color
     * 
     * @param size shirt size
     * @param color color of the shirt
     * @throws IllegalArgumentException
     */
    public Shirt(String size, String color) throws IllegalArgumentException {
        super(); // use the default constructor so we can validate size on this class
        setSize(size);
        setColor(color);
    }

    /**
     * Overridden version of setSize to only accept S, M, L, and XL
     * 
     * @param size shirt size
     * @throws IllegalArgumentException
     */
    public void setSize(String size) throws IllegalArgumentException {
        if(!Arrays.asList(ALLOWED_SIZES).contains(size)) {
            throw new IllegalArgumentException("Size should be S, M, L, or XL");
        }

        super.setSize(size);
    }
}
