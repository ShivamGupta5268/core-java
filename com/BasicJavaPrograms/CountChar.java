package com.BasicJavaPrograms;

public class CountChar {

	public static void main(String[] args) {
		String s = "my name is shivam gupta";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if (x == 'a') {
				count++;

			}
		}
		System.out.println(count);
	}
}
