package com.BasicJavaPrograms;

import java.util.Arrays;

// import java.util.Arrays;

public class Array_Sort_Order {
	public static void main(String[] args) {

		int a[] = { 15, 20, 56, 25, 40 };
		int y = 'A';
		// Arrays.sort(a);
		// for(int b : a){
		// System.out.print(b+" ");
		// }
		int lengths = a.length;
		int x = a.length;

		System.out.println(x);
		int lastindex = lengths - 1;
		System.out.println(a[lastindex]);
		Arrays.sort(a);
		for (int b : a){
			System.out.print(b + " ");
			
		}System.out.println();
		System.out.println(y);
	}

}
