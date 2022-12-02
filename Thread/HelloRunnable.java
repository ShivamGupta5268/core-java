package Thread;

public class HelloRunnable implements Runnable{

	private String name = null;
	
	public HelloRunnable(String fn) {
		name = fn;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + name);
		}
	}

	public static void main(String[] args) {
		
		HelloRunnable hr1 = new HelloRunnable("Shivam");
		HelloRunnable hr2 = new HelloRunnable("Monu");
		
		Thread t1 = new Thread(hr1);
		Thread t2 =new Thread(hr2);
		
		t1.start();
		t2.start();
	}

}
