package com.Exercise;

public class ExFour_FifteenCurrect {
	
	public static void main(String[] args) {
	
	int [] a = {44,62,95,74,33,21,57}; 
	int temp;
	
	for (int i = 0; i < a.length; i++) {
		
		for (int j = i + 1 ; j < a.length; j++) {
			
			if(a[i] > a[j]) {
				
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}			
		}		
	}	System.out.println("Second Largest Number: "+ a[a.length -2]);
}	
}
