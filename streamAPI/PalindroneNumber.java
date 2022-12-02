package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PalindroneNumber {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(1212, 121, 23432, 142141);
		
		Stream <Integer> s = l.stream();
		
		l.stream().forEach(e -> {
			int a = e;
			int sum = 0;
			while(e > 0) {
				int rem = e % 10;
				sum = sum*10 + rem;
				e = e / 10;
			}System.out.print(sum);			
			if(a == sum) {
				System.out.println(" :- This is palindrone Number");
			}
			System.out.println();
		});
		
		
	}
}
