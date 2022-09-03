package com.BasicJavaPrograms;

public class Star_Piramid {
	public static void main(String[] args) {
		
		for (int i = 3; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 3; k >= i; k--) {
				System.out.print("* ");
			}System.out.println();
		}
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}for (int k = 2; k >= i; k--) {
				System.out.print("* ");
			}System.out.println();
		}
	}
}
