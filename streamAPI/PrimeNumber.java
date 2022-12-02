package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PrimeNumber {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(10,15,23,27,41);		
		
		Stream<Integer> s = l.stream();		
		
		l.stream().forEach(e -> {
			int count = 0;
			for(int i = 2; i < e; i++) {
				if(e % i == 0) {
					count++;
				}				
			} if(count == 0) {
				System.out.println(e);			
			}
		});		
	}
}
