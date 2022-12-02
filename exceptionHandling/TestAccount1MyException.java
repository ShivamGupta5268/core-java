package exceptionHandling;

public class TestAccount1MyException {

	public static void main(String[] args) throws Exception {
		
		Account1 a = new Account1();
		
		a.setBalance(1000);
		try {
			a.withdrawal(600);
		}
		catch (MyException e) {
			System.err.println(e.getMessage());
		}
	}
}
