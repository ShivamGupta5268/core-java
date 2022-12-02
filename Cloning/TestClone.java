package Cloning;

public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address a = new Address();
		a.setStreet("Utaily");
		a.setDistrict("Satna");
		a.setState("MP");
		
		Employee emp = new Employee();
		emp.setFname("Shivam");
		emp.setLname("Gupta");
		emp.setId(5);
		emp.setAdd(a);		
		
		System.out.println(emp.getFname());
		System.out.println(emp.getLname());
		System.out.println(emp.getId());
		System.out.println(emp.getAdd());
		
		Employee emp1 = (Employee) emp.clone();
		
		System.out.println(emp1.getFname());
		System.out.println(emp1.getLname());
		System.out.println(emp1.getId());
		System.out.println(emp1.getAdd());		
		
	}
}
