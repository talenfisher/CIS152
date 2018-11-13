/**
 * A program for testing binary search trees
 * 
 * @author Talen Fisher
 */
public class BinarySearchTreeDriver {
	public static void main(String args[]) {
		
		/* =========================
		 * BOYS TREE
		 */
		System.out.println("=======================================\nBoys Tree\n");
        
        String[] boyNames = {
			"Noah", 
			"Liam", 
			"Mason", 
			"Jacob", 
			"William", 
			"Ethan", 
			"James", 
			"Alexander", 
			"Michael", 
			"Benjamin"	
		};
		
		BinarySearchTree boysNameTree = new BinarySearchTree();
		
		// insert names into tree
		System.out.println("Inserting names into boysNameTree\n--------------");
		for(int i = 0; i < boyNames.length; i++) {
			// have to do i + 1 to fix zero indexes
			printCall("insert("+(i + 1)+", "+boyNames[i]+")", boysNameTree.insert(i + 1, boyNames[i]));
		}
		
		// search for all known names
		System.out.println("\nSearching for known names\n--------------");
		for(String name : boyNames) {
			printCall("search("+name+")", boysNameTree.search(name));
		}
		
		// search unknown names
		System.out.println("\nSearching for unknown names\n--------------");
		printCall("search(Talen)", boysNameTree.search("Talen"));
		printCall("search(Paul)", boysNameTree.search("Paul"));
		
		// play around with order
		System.out.println();
        boysNameTree.display();
        
		printCall("\ndelete(Ethan)", boysNameTree.delete("Ethan"));
        boysNameTree.display();
        
		printCall("\ninsert(3, Burt)", boysNameTree.insert(3, "Burt"));
		boysNameTree.display();
		
		 /* =========================
		 * GIRLS TREE
		 */
		System.out.println("\n\n=======================================\nGirls Tree\n");
        
        String[] girlNames = {
			"Emma",
			"Olivia",
			"Sophia",
			"Ava",
			"Isabella",
			"Mia",
			"Abigail",
			"Emily",
			"Charlotte",
			"Harper"
		};
		
		BinarySearchTree girlsNameTree = new BinarySearchTree();
		
		// insert names into tree
		System.out.println("Inserting names into girlsNameTree\n--------------");
		for(int i = 0; i < girlNames.length; i++) {
			// have to do i + 1 to fix zero indexes
			printCall("insert("+(i + 1)+", "+girlNames[i]+")", girlsNameTree.insert(i + 1, girlNames[i]));
		}
		
		// search for all known names
		System.out.println("\nSearching for known names\n--------------");
		for(String name : girlNames) {
			printCall("search("+name+")", girlsNameTree.search(name));
		}
		
		// search unknown names
		System.out.println("\nSearching for unknown names\n--------------");
		printCall("search(Talen)", girlsNameTree.search("Talen"));
		printCall("search(Sarah)", girlsNameTree.search("Sarah"));
		
		// play around with order
		System.out.println();
        girlsNameTree.display();
        
		printCall("\ndelete(Emily)", girlsNameTree.delete("Emily"));
        girlsNameTree.display();
        
		printCall("\ninsert(3, Talia)", girlsNameTree.insert(3, "Talia"));
		girlsNameTree.display();
	}
	
	/**
	 * Helper method for printing call results on trees
	 * 
	 * @param method the method called
	 * @param value the value returned by the method
	 */
	public static <Value> void printCall(String method, Value value) {
		System.out.printf("%-25s %20s\n", method+":", value);
	}
}
