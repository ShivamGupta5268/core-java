package com.BasicJavaPrograms;

import java.util.Arrays;

public class Array_Greatest_no {
	
	public static void main(String[] args){
		int a[] = {15,25,50,65,16,8};
		Arrays.sort(a);
		System.out.println(a[a.length-1]);
	}

}
