/**
 * Tester class for my implementation of a map
 * @author Talen Fisher
 */
public class MapDriver {
	public static void main(String args[]) {
		// create a map
		Map<String,String> map = new Map<>();
		
		// insert some key value pairs and display
		map.set("sarah@gmail.com", "Sarah");
		map.set("ben123@yahoo.com", "Ben");
		map.set("vdubz@msn.com", "Victoria");
        map.set("msn@aol.com", "Bill");
        
		System.out.println("Inserted 4 key:value pairs");
        
        map.display();
		System.out.println("\n");
		
		// test delete method, check size before and after
		System.out.println("size(): " + map.size());
		System.out.println("delete(vdubz@msn.com): " + map.delete("vdubz@msn.com"));
        System.out.println("size(): " + map.size());
        
		map.display();
		System.out.println("\n");
		
		// set another entry, check size, if empty, find a couple keys and get the value of a key
		System.out.println("set(apple@hotmail.com, Megan): " + map.set("apple@hotmail.com", "Megan"));
		System.out.println("isEmpty(): " + map.isEmpty());
		System.out.println("size(): " + map.size());
		System.out.println("findKey(vdubz@msn.com): " + map.findKey("vdubz@msn.com"));
		System.out.println("findKey(apple@hotmail.com): " + map.findKey("apple@hotmail.com"));
		System.out.println("getValue(ben123@yahoo.com): " + map.getValue("ben123@yahoo.com"));
        
        map.display();
		System.out.println("\n");
		
		// iterate through each entry and print it
		System.out.println("Iterating through each entry and printing them:");
        
        for(Entry<String,String> entry : map) {
			System.out.println(entry);
        }
        
		System.out.println("\n");
		
		// delete all entries, check size and if empty
		System.out.println("Deleting all entries...");
        
        for(Entry<String,String> entry : map) {
			map.delete(entry.getKey());
        }
        
		System.out.println(map);
		System.out.println("size(): " + map.size());
		System.out.println("isEmpty(): " + map.isEmpty());
	}
}
