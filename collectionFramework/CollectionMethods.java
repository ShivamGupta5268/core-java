package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();		// Create a collection
		
		// Add Elements into Collection
		
		c.add(5);			// Index at 0
		c.add(6.2);			// Index at 1
		c.add(54);			// Index at 2
		c.add("Shivam");	// Index at 3
		c.add("Gupta");		// Index at 4
		c.add('S');			// Index at 5
		c.add(50);			// Index at 6
		
		System.out.println(c);
		System.out.println(c.size());
		
//		c.clear();
//		System.out.println(c.isEmpty());
//		System.out.println(c);		
//		System.out.println(c.size());
		
		System.out.println(c.contains(54));
		
//		c.remove(6.2);
//		System.out.println(c);
//		c.removeAll(c);
//		System.out.println(c);
		
		System.out.println(c.retainAll(c));
		
		
		
	}

	}
