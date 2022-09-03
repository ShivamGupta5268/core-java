package co.Encapsulation;

public class TestAccountt {

	public static void main(String[] args) {
		
		Accountt acc = new Accountt();
		acc.setAccountNumber("213735806775");
		acc.setNumber("9996179200");
		acc.setBalance(2000);
		acc.setBalance(1000);
		System.out.println(acc.getBalance());
		acc.deposit(15);
		acc.deposit(30);
		acc.withdrawal(500);
		acc.payBill(50);
		//System.out.println(acc.getBalance());
		System.out.println(acc.getAccountNumber());
		System.out.println(acc.getNumber());
		System.out.println(acc.getBalance());
		
		
	}
}
