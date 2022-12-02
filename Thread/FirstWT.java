package Thread;

public class FirstWT {

	String name = null;
	
	public FirstWT(String fname) {
		name = fname;
	}
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(i+" "+ name);
		}
	}
	
	public static void main(String []args) {
		
		FirstWT obj1 = new FirstWT("Shivam");
		FirstWT obj2 = new FirstWT("Monu");
		
		obj1.run();
		obj2.run();
	}
}
