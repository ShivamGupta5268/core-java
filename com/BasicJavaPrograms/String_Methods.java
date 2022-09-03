package com.BasicJavaPrograms;

public class String_Methods {
	public static void main(String[] args) {
		String str = "I am Shivam Gupta";
		System.out.println("String Length - " + str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("hivam"));
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("a"));
		System.out.println(str.lastIndexOf("i"));
		System.out.println(str.replace("a", "b"));
		System.out.println(str.replaceAll("a", "b"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.startsWith("I"));
		System.out.println(str.endsWith("Gupta"));
		System.out.println(str.substring(6));

	}

}
