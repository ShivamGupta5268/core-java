package exceptionHandling;

import java.util.Scanner;

public class TryCatchScanner {

	public static void main(String[] args) {
		
		int [] marks = new int[3];
		marks[0] = 7;
		marks[1] = 56;
		marks[2] = 9;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array index");
		int ind = sc.nextInt();
		
		System.out.println("Enter number you want to divide the value with");
		int number = sc.nextInt();
		
		try {
			System.out.println("Value at array index entered is: "+ marks[ind]);
			System.out.println("Value at array-value/number is: "+ marks[ind]/number);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException occured!");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occured!");
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("some other exception occured!");
			System.out.println(e);
		}
	}
}