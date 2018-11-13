import java.util.Iterator;

/**
 * An iterable binary search tree implementation
 * 
 * @author Talen Fisher
 */
public class BinarySearchTree implements Iterable<Node> {
    /**
     * The head node of the tree
     */
    private Node head;
    
    /**
     * The size of the tree
     */
	private int size = 0;
	
	/**
	 * Make the object iterable
	 */
	public Iterator<Node> iterator() {
		return new InOrderTreeIterator(head);
	}
	
	
	/**
	 * Insert a new node into the tree
     * 
	 * @param iData integer data
	 * @param sData string data
	 * @return the node inserted
	 */
	public Node insert(int iData, String sData) {
		Node node = new Node(iData, sData);
		size++;
		
		// no node exists yet
		if(head == null) return head = node;
        
        Node current = head;
        Node parent;
        
		while(true) {
			parent = current;
			
			if(iData < current.iData) { 
				current = current.left;
				if(current == null) { // insert on the left
					node.parent = parent;
					return parent.left = node;
				}
				
			} else { 
				current = current.right;
				if(current == null) { // insert on the right
					node.parent = parent;
					return parent.right = node;
				}
			}
		}
	}
	
	/**
	 * Search by iData
     * 
	 * @param iData the key to search for
	 * @return the node associated with the iData or null if none found
	 */
	public Node search(int iData) {
		for(Node node : this) {
			if(node.iData == iData) return node;
		}
		
		return null; // no node found
	}
	
	/**
	 * Search by sData
     * 
 	 * @param sData the key to search for
	 * @return the node associated with the sData or null if none found
	 */
	public Node search(String sData) {
		for(Node node : this) {
			if(node.sData.equals(sData)) return node;
		}
		
		return null;
	}
	
	/**
	 * Remove a node from the tree by iData
     * 
	 * @param iData the key to delete
	 * @return the deleted node
	 */
	public Node delete(int iData) {
		for(Node node : this) {
			if(node.iData == iData) {

				// no children
				if(node.left == null && node.right == null) replaceWithChild(node, null);
				
				// has left child, move left child up
				else if(node.right == null) replaceWithChild(node, node.left);
				
				// has right child, move right child up
				else if(node.left == null) replaceWithChild(node, node.right);
				
				// has two children, find successor and move that up
				else {
                    Node successor = getSuccessor(node);
                    successor.left = node.left;
					replaceWithChild(node, successor);
				}
				
				size--; 
				return node;
			}
		}
		
		// node not found
		return null;
    }

    /**
     * Replaces a node with its child.
     * 
     * @param node the node to replace
     * @param child the child to replace the node with
     */
    private void replaceWithChild(Node node, Node child) {
        if(node == head) head = child;
        else if(node == node.parent.left) node.parent.left = child;
        else node.parent.right = child;
    }
	
	/**
	 * Delete by sData.  This is a wrapper for delete by iData so that code doesnt have to be rewritten
     * 
	 * @param sData the string key
	 * @return the deleted node if found and null if none found
	 */
	public Node delete(String sData) {
		for(Node node : this) {
			if(node.sData.equals(sData)) return delete(node.iData);
		}
		
		// node not found
		return null;
	}
	
	/**
	 * getSuccessor helper method for when deleting and both children exist
     * 
	 * @param node the node to get the successor for
	 * @return the successor
	 */
	private Node getSuccessor(Node node) {
		Node successor = node, 
		     successorParent = node,
		     current = node.right;
		
		while(current != null) { // move to bottom of tree
			successorParent = successor;
			successor = current;
			current = current.left;
		}
		
		if(successor != node.right) {
			successorParent.left = successor.right;
			successor.right = node.right;
		}
		
		return successor;
	}
	
	/**
	 * Get the size of the tree (how many nodes)
     * 
	 * @return size of the tree
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Convert the tree to a string
	 */
	public String toString() {
		String out = "[";
		int iteration = 0;
		
		for(Node node : this) {
			out += node;
			if(++iteration != this.size) out += ", "; // only add comma if not on last node
		}
		
		return out + "]";
	}
	
	/**
	 * displays the tree (wrapper for toString)
	 */
	public void display() {
		System.out.println(this);
	}
}
