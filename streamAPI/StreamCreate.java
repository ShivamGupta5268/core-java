package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreate {
	
	public static void main(String[] args) {

	List<String> iteams = Arrays.asList("One","Two", "Three", "Four");
	
	// Creation of Stream

	Stream <String> stream = iteams.stream();
	
	// print all elements from Stream
	
	stream.forEach(e -> {
		System.out.println(e);
	});
	
	}

}
