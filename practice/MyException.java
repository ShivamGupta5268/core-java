package practice;

public class MyException extends Exception {

	public MyException() {
		super("Insufficient fund......");
	}

	public class MyException2 extends Exception {
		public MyException2() {
			super("Invalid user id");
		}
	}
}
