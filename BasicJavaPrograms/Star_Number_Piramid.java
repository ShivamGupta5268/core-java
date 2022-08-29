package com.BasicJavaPrograms;

public class Star_Number_Piramid {

	public static void main(String[] args) {
		
		for (int i = 5; i > 2; i--) {
			for (int j = 3; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print(i +" ");
			}System.out.println();
		}
		for (int i = 2; i > 0; i--) {
			for (int j = 2; j >= i; j--) {
				System.out.print(" ");
			}for (int k = 1; k <= i; k++) {
				System.out.print(i +" ");
			}System.out.println();
		}
			
	}
}
