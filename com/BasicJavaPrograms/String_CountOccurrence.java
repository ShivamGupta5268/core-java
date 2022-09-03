package com.BasicJavaPrograms;

public class String_CountOccurrence {
	public static void main(String[] args) {
		String s = "Vijay Chauhan";
		int coun = 0;
		char x = 'j';
		for (int i = 0; i < s.length(); i++) {

			if (x == s.charAt(i)) {
				coun++;
			}
		}
		System.out.println(coun);

	}
}
