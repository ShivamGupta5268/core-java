package com.Exercise;

public class ExSix_Three {

	public static void main(String[] args) {

		String s1 = "My name is shivam";
		char c = 'a';
		int count = 0;

		for (int i = 0; i < s1.length(); i++) {

			char x = s1.charAt(i);

			if (x == c ) {
				count++;
			}

		}
		System.out.println(count);
	}

}
