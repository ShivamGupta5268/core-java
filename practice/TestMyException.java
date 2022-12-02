package practice;

public class TestMyException {

	public static void main(String[] args) throws Exception {
		
		Account2 acc = new Account2();
		
		acc.setBalance(2000);
		try {
			acc.withdrawal(1600);
	}	catch (Exception e) {
			System.err.println(e.getMessage());
	}
		
	}
}
