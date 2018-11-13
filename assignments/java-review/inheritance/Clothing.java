/**
 * Representation of a piece of clothing, meant to be extended to other classes (shirt, pants, socks)
 * 
 * @author Talen Fisher
 */
public class Clothing {

    /**
     * Clothing size
     */
    private String size;
    
    /**
     * Clothing color
     */
	private String color;
	
	/**
	 * Default constructor, no args
	 */
	public Clothing() {}
	
	/**
	 * Full constructor, takes size and color
     * 
	 * @param size clothing size
	 * @param color color of the clothing
	 */
	public Clothing(String size, String color) {
		this.size = size;
		this.color = color;
	}
	
	/**
	 * Getter for the size property
     * 
	 * @return clothing size
	 */
	public String getSize() {
		return size;
	}
	
	/**
	 * Setter for the size property
     * 
	 * @param size clothing size
	 */
	public void setSize(String size) {
		size = size;
	}
	
	/**
	 * Getter for the color property
     * 
	 * @return clothing color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Setter for the color property
     * 
	 * @param color clothing color
	 */
	public void setColor(String color) {
		color = color;
	}
	
	/**
	 * Gracefully turns the object into a string
     * 
	 * @return string representation of the object
	 */
	public String toString() {
		return getClass().getName() + "[ size = " + size + ", color = " + color + " ]";
	}
}
