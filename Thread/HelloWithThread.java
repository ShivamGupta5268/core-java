package Thread;

public class HelloWithThread extends Thread {

	private String name = null;
	
	public HelloWithThread(String threadName) {
		name = threadName;
	}
	
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i +"Hello Thread "+ name);
		}
	}
	
	public static void main(String[] args) {
		
		HelloWithThread t1 = new HelloWithThread("Shivam");
		HelloWithThread t2 = new HelloWithThread("Gupta");
		
		t1.start();
		t2.start();
	}
}
