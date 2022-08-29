package com.BasicJavaPrograms;

public class String_key_Method {
	public static void main(String[] agrs){
	String n = "Vijay Aloknath Chauhan";	
		System.out.println("String Length: "+n.length());
		System.out.println("7th Character: "+n.charAt(6));
		System.out.println("Index of Alok: "+n.indexOf("Alok"));
		System.out.println("index of A: "+n.indexOf("A"));
		System.out.println("Last position of i: "+n.lastIndexOf("i"));
		System.out.println("a is replaced by b: "+n.replace("a", "b"));
		System.out.println("Lower name: "+n.toLowerCase());
		System.out.println("Upper name:n "+n.toUpperCase());
		System.out.println("Starts with Vijay: "+n.startsWith("Vijay"));
		System.out.println("Dad's name: "+n.substring(6));
		
	}

}
