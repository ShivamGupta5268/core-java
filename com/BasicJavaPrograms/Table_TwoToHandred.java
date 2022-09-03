package com.BasicJavaPrograms;

public class Table_TwoToHandred {
	public static void main(String[] args) {

		int[][] a = new int[101][101];
		for (int i = 1; i < a.length; i++) {

			for (int j = 1; j <= 10; j++) {
				a[i][j] = i * j;
				System.out.print(a[i][j] + "\t");

			}System.out.println();
		}

	}

}
