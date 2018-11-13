/**
 * Represents a node in the Binary Search Tree.  
 * 
 * @author Talen Fisher
 *
 */
public class Node {
    /**
     * Integer data
     */
    int iData;
    
    /**
     * String data
     */
    String sData;
    
    /**
     * Left, right and parent node pointers
     */
	Node left, right, parent;
	
	/**
	 * Constructor.  creates a new node
     * 
	 * @param iData integer data
	 * @param sData string data
	 */
	public Node(int iData, String sData) {
		this.iData = iData;
		this.sData = sData;
	}
	
	/**
	 * Converts the node to a string
	 */
	public String toString() {
		return iData + ": " + sData;
	}
}