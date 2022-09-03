package co.Encapsulation;

public class Encapsulation_Test {
	public static void main(String[] args) {
		SetGet st = new SetGet();

		st.setName("Shivam");
		st.setSurname("Gupta");
		st.setAge(25.6);

		String name = st.getName();
		String Surname = st.getSurname();
		double Age = st.getAge();

		System.out.println(name);
		System.out.println(Surname);
		System.out.println(Age);
	}

}
