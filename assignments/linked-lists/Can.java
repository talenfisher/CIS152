/**
 * This class represents a can
 * it has a company, content, size and price.
 * 
 * @author Talen Fisher
 */
public class Can {

    /**
     * The Can's company/manufacturer
     */
    private String company;

    /**
     * The contents of the can
     */
    private String content;

    /**
     * The size of the can
     */
    private double size;

    /**
     * The price of the can
     */
    private double price;

    /**
     * Here we have a default constructor that takes no arguments..
     */
    public Can() {}

    /**
     * The constructor - initializes properties with custom values rather
     * than using the default values for a can
     * 
     * @param company the company the can was made for
     * @param content the contents of the can
     * @param size the size of the can in ounces
     * @param price the price of the can
     */
    public Can(String company, String content, double size, double price) {
        super();
        this.company = company;
        this.content = content;
        this.size = size;
        this.price = price;
    }

    /**
     * Getter for the company property
     * 
     * @return the can's company
     */
    public String getCompany() {
        return this.company;
    }

    /**
     * Setter for the company property
     * 
     * @param company the can's company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Getter for the content property
     * 
     * @return the can's contents
     */
    public String getContent() {
        return content;
    }

    /**
     * Setter for the content property
     * 
     * @param content the can's contents
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Getter for the size property
     * 
     * @return the can's size
     */
    public double getSize() {
        return size;
    }

    /**
     * Setter for the size property
     * 
     * @param size the can's size
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Getter for the price property
     * 
     * @return the can's price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setter for the price property
     * 
     * @param price the can's price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Implementation of the toString method on this class.
     * Gracefully turns the contents of the object into a readable string.
     * 
     * @return string representation of the can
     */
    public String toString() {
        String output = this.getClass().getName() + "[ ";

        output += "company = " + company + ", ";
        output += "content = " + content + ", ";
        output += "size = " + size + ", ";
        output += "price = " + price + " ]";

        return output;
    }
}
