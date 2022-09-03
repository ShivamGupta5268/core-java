package com.BasicJavaPrograms;

import java.util.Arrays;

public class Array_3D {
	public static void main(String[] args){
		int studentmarks [] [] [] = new int [3] [3] [3];
				
				studentmarks [0] [0] [0] = 90;
				studentmarks [0] [1] [1] = 70;
				studentmarks [0] [2] [2] = 80;
				
				studentmarks [1] [0] [0]= 85;
				studentmarks [1] [1] [1]= 75;
				studentmarks [1] [2] [2]= 100;
				
				studentmarks [2] [0] [0]= 90;
				studentmarks [2] [1] [1]= 50;
				studentmarks [2] [2] [2]= 60;
				
				System.out.println(Arrays.deepToString(studentmarks));
	}

}


