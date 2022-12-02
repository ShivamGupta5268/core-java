package ConstructionCallAnotherConstructor;

public class Person {

	protected String fname;
	protected String lname;
	protected String address;
	
	public Person(){
		System.out.println("im default Constructor");
	}
	Person(String fn, String ln){
		this();
		fname = fn;
		lname = ln;
		System.out.println(fname+" "+ lname);
	}
	Person(String fn, String ln, String add){
		this(fn,ln);
		address = add;
		System.out.println(fname + " "+ lname +" "+ address);
	}
}
