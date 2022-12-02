package Thread;

public class HelloWithoutThread {
	
	String name = null; // keeps thread name
	
	public HelloWithoutThread(String threadName) {
		name = threadName;
	}
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(i +"Hello Thread "+ name);
		}
	}
	
	public static void main(String[] args) {
		
		HelloWithoutThread t1 = new HelloWithoutThread("Shivam");
		HelloWithoutThread t2 = new HelloWithoutThread("Gupta");
		
		t1.run();
		t2.run();
	}
}


