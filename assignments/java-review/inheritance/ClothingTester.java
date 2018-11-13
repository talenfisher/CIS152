/**
 * A class for testing multiple types of clothing
 * 
 * @author Talen Fisher
 */
public class ClothingTester {
	
	/**
	 * program entry point
     * 
	 * @param args command line arguments (if any)
	 */
	public static void main(String[] args) {
		// test clothing
		Clothing gloves = new Clothing();
        Clothing mittens = new Clothing("M", "black");
        
		System.out.println("gloves: " + gloves);
		System.out.println("mittens: " + mittens + "\n");
		
		// test shirts
		Shirt tshirt = new Shirt(); // test default first
        Shirt polo = new Shirt("M", "blue");
        
		tshirt.setSize("M");
        tshirt.setColor("black");
        
		System.out.println("t-shirt: " + tshirt);
		System.out.println("polo: " + polo);
		
		// try making a shirt with an invalid size
		try {
			Shirt tanktop = new Shirt("XS", "red");
		} catch(IllegalArgumentException e) {
			System.out.println("tanktop: " + e.getMessage() + "\n");
		}
		
		// test pants
		Pants jeans = new Pants(); // test default first
		Pants sweatpants = new Pants("S", "red");
        
        jeans.setColor("purple");
		jeans.setSize("10");
        
        System.out.println("jeans: " + jeans);
		System.out.println("sweatpants: " + sweatpants + "\n");
		
		// test socks
		Socks normalSocks = new Socks();
		Socks stripedSock = new Socks("10", "black", false);
        
        normalSocks.setColor("red");
		normalSocks.setSize("7");
        
        System.out.println("normal socks: " + normalSocks);
		System.out.println("striped sock: " + stripedSock);
		
	}
}
