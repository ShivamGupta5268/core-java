package lambdaFunction;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Shivam");
		list.add("Gupta");
		list.add("Lives");
		list.add("Indore");
		
		list.forEach(li -> System.out.println(li));
		
	}
}
