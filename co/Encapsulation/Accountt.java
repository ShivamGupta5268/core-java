package co.Encapsulation;

public class Accountt {
	
	private String number;
	private String accountNumber;
	private double balance = 0;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount){
		double bal = getBalance();
		setBalance(bal+amount);
		System.out.println(getBalance());
	}
	public void withdrawal(double money){
		double cash = getBalance();
		setBalance(cash-money);
		System.out.println(getBalance());
	}
	public void fundTransfer(double money) {
		double bal = getBalance();
		setBalance(bal-money);
		System.out.println(getBalance());
	}
	public void payBill(double pay) {
		double bal = getBalance();
		setBalance(bal-pay);
		System.out.println(getBalance());
	}	
}
