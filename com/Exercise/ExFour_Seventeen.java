package com.Exercise;

public class ExFour_Seventeen {
	public static void main(String[] args) {
		
	int [] a = {1,2,3,4,5,6,7};
	int [] b = {1,2,3,4,6,7};
	
	int sum1 = 0;
	int sum2 = 0;
	
	for(int i = 0; i < a.length ; i++) {
		sum1 = sum1 + a[i];
	}//System.out.println(sum1);
	
	for (int j = 0; j < b.length; j++) {
		sum2 = sum2 + b[j];
	}//System.out.println(sum2);
	
	System.out.println("Missing Elements : "+ (sum1 - sum2));
}
}
