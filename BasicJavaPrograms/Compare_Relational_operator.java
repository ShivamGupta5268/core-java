package com.BasicJavaPrograms;

public class Compare_Relational_operator {
	
	public static void main(String[] args){
		String str = "Shivam";
		String str2 = new String("Shivam");
		if(str.equals(str2)){
			System.out.println("Both are Same");
		} else {
			System.out.println("Both are not Equal");
		}
	}

}
