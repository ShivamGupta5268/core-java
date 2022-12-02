package exceptionHandling;

public class Account1 {

	private double balance;
	
	public Account1() {
		
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdrawal(double amount) throws Exception{
		double total = getBalance() - amount;
		
		if(total < 500) {
			throw new MyException();
		}
		else {
			setBalance(total);
			System.out.println("Balance after withdrawal: "+ getBalance());
		}
	}
	
	
}
