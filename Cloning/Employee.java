package Cloning;

public class Employee implements Cloneable{

	protected int id;
	private String fname;
	private String lname;
	private Address add;	// this is called Association
	
	public Employee() {
		System.out.println("Im default of Employee");
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Object clone() throws CloneNotSupportedException{
	Employee em = (Employee) super.clone();
	return em;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public Address getAdd() {
		return add;
	}	
}
