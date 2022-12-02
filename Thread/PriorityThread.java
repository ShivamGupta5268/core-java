package Thread;

public class PriorityThread extends Thread{

	private String name = null;
	
	public PriorityThread(String fn) {
		name = fn;
	}
	
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(name +" P= "+ getPriority());
		}
	}
	
	public static void main(String[] args) {
	
		PriorityThread t1 = new PriorityThread("Shivam");
		PriorityThread t2 = new PriorityThread("Monu");
		PriorityThread t3 = new PriorityThread("Gupta");
		
		t1.setPriority(6);
		t2.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
