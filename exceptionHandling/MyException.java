package exceptionHandling;

public class MyException extends Exception{

		public MyException () {
			super("Insufficient balance.......");
		}	
		
		public class MyException2 extends Exception {
			
			public MyException2() {
				super("invalid user id......");
			}
		}		
	}

