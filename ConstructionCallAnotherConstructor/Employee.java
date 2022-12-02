package ConstructionCallAnotherConstructor;

public class Employee extends Person {
	
	private int id;
	private String designation;
	
	public Employee() {
		System.out.println("im default constructor");
	}
	public Employee(int ids, String desi) {
		// super();
		id = ids;
		designation = desi;
		System.out.println(id + " "+ designation);		
	}
	public Employee(String fn, String ln, String desi) {
		super(fn,ln);
		designation = desi;
		System.out.println(fname+" "+ lname +" "+ designation);
	}
}
	

