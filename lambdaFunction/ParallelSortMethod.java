package lambdaFunction;

import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;

public class ParallelSortMethod {
	

	public static void main(String[] args) {
		
		int[] a = {4,75,3,54,36,73,46};
		
		// Arrays.sort(i);
		
		Arrays.parallelSort(a);
		
		System.out.println(Arrays.toString(a));	
		
		
		/*for(int j : a) {
			System.out.println(j);*/
		
		}
	}

