package co.Encapsulation;

public class Test_Encapsulation {
	public static void main(String[] args) {

		SetterGetter sg = new SetterGetter();

		sg.setFname("Shivam");
		sg.setLname("Gupta");
		sg.setid(1);
		String Fname = sg.getFname();
		System.out.println(Fname);

		String Lname = sg.getLname();
		System.out.println(Lname);

		System.out.println(sg.getid());

	}

}
