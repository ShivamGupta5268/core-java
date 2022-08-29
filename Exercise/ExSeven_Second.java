package com.Exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExSeven_Second {
	
	public static void main(String[] args) throws ParseException {
		
		String s = "22/01/2022";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(s);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		for (int i = 1; i < 12; i++) {
			
			cal.add(Calendar.DATE, 30);
			
			Date t = cal.getTime();
			String s1 = sdf.format(t);
			System.out.println(s1);			
		}
	}
}
