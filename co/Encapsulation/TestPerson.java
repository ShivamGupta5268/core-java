package co.Encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException {

		Person s = new Person();

		s.setName("Shivam Gupta");
		s.setAddress("Priya Darshni Nagar Utaily Satna");
		s.setAGE_AVG(25);

		System.out.println(s.getName());
		System.out.println(s.getAddress());
		System.out.println(s.getAGE_AVG());

		String d = "22/01/1997";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf.parse(d);
		s.setDob(d1);

		Date d3 = s.getDob();
		System.out.println(d3);

	}

}
