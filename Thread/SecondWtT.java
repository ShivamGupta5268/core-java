package Thread;

public class SecondWtT extends Thread {

	private String name = null;
	
	public SecondWtT(String fn) {
		name = fn;
	}
	public  void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println(i+" "+name);
		}
	}
	
	public static void main(String[] args) {
		
		SecondWtT t1 = new SecondWtT("Shivam");
		SecondWtT t2 = new SecondWtT("Monu");
		
		t1.start();
		t2.start();
	}
	
	
}
