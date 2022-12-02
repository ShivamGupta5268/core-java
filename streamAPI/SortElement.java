package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortElement {

	public static void main(String[] args) {
		
		List<String> iteams = Arrays.asList("One","Two", "Three", "Four");
		
		// creation of Stream
		
		Stream <String> stream = iteams.stream();		
		
		  // Sort the element & print		  
		  iteams.stream().sorted().forEach(e -> { 
		  				System.out.println(e);
		  });		  
		  System.out.println();	
		  
		
		// Convert each element into UpperCase		
		iteams.stream().map(e -> e.toUpperCase()).forEach(e -> { 
						System.out.println(e);				
		});
		System.out.println();
		
		// Filter elements starting with "T"
		iteams.stream().filter(e -> e.startsWith("T")).map(e -> e.toUpperCase()).
			forEach(e -> {System.out.println(e);}
		);
		System.out.println();
		
		// All together => filter,remove,duplicate,uppercase,sort & print
		
		iteams.stream().filter(e -> e.startsWith("T")).map(e -> e.toUpperCase()).distinct().
			sorted().forEach(e -> {System.out.println(e);
		});
		
		// get collection from Stream
		
		List<String> l = iteams.stream().filter(e -> e.startsWith("T")).map(e -> e.toUpperCase()).distinct().
				sorted().collect(Collectors.toList());
	}
}
