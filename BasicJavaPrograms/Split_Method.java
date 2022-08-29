package com.BasicJavaPrograms;

public class Split_Method {

	public static void main(String[] args) {
		String s = "This is java program";
		String[] s1 = s.split(" ");

		for (String s2 : s1) {
			System.out.print(s2 + " ");
		}
		           System.out.println();

		System.out.println("Last value of sentence: " + s1[s1.length - 1]);
	}

}
