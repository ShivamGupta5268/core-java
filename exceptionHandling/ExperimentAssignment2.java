package exceptionHandling;

public class ExperimentAssignment2 {

	public static void main(String[] args) {
		
		try {
			double d = 10/0;			
			System.out.println(d);
		} 
		finally {
			System.out.println("you can not divide");
		}
	}
}	
	// finally chalega try bhale hi nhi chala exception aa gya.
	// agar try ko bhi chalana hai to exception handle karni hogi catch block bnakar.
