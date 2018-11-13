/**
 * Representation of pants, has size and color
 * 
 * @author Talen Fisher
 */
public class Pants extends Clothing {
	
	/**
	 * Default constructor, no args
	 */
	public Pants() {
		super();
	}
	
	/**
	 * Full constructor, takes size and color
     * 
	 * @param size pants size
	 * @param color pants color
	 */
	public Pants(String size, String color) {
		super(size, color);
	}
}
