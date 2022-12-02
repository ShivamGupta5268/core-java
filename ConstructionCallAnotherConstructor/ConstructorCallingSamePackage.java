package ConstructionCallAnotherConstructor;

public class ConstructorCallingSamePackage {

	protected String fname;
	protected String lname;
	protected String address;
	
	ConstructorCallingSamePackage(){
		System.out.println("I'm default Constructor");
	}
	ConstructorCallingSamePackage(String fn, String ln){
		fname = fn;
		lname = ln;
		System.out.println(fname +" "+ lname);
	}	
	ConstructorCallingSamePackage(String fn, String ln, String ad){
		this(fn,ln);
		address = ad;
		System.out.println(fname+" "+ lname +" "+ ad);
	}
	
	public static void main(String[] args) {
		
		ConstructorCallingSamePackage p = new ConstructorCallingSamePackage("shivam", "Gupta", "Satna");
		
	}
}
