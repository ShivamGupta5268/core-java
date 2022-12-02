package practice;

public class Account2 {

	private double balance;
	
	public Account2 () {
		
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdrawal(int amount) throws Exception {
		double bal = getBalance()- amount;
		
		if(bal < 500) {
			throw new MyException();			
		}
		else {
			setBalance(bal);
			System.out.println("Total Balance After withdrawal: "+ getBalance());
		}
	}
}
