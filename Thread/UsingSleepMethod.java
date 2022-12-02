package Thread;

public class UsingSleepMethod {
	
	private int balance;

	public int getBalance() {
		try {
			Thread.sleep(500);
		}catch(InterruptedException e){}
		
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		int bal = getBalance();
		setBalance(bal + amount);
		System.out.println("New balance after deposit: "+ getBalance());
	}
	
	public void widthdrawal(int amount) {
		int bal = getBalance();
		if(bal > 500) {
			setBalance(bal - amount);
			System.out.println("New balance after widthdrawal: "+ getBalance());
		}
		else {
			System.out.println("Low balance");
		}
	}
	
	public static void main(String[] args) {
		
		UsingSleepMethod sl = new UsingSleepMethod();
		
		sl.setBalance(1000);
		sl.deposit(500);
		sl.deposit(200);
		sl.deposit(500);
		sl.deposit(200);
		System.out.println("total balance: "+sl.getBalance());
		sl.widthdrawal(2000);
		sl.widthdrawal(200);
	}

}
