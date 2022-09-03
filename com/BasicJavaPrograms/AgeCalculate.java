package com.BasicJavaPrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AgeCalculate {

	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		
		String s = "22/01/1997";
		int a = Integer.parseInt(s);
		
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); Date s1 =
		 * sdf.parse(s);
		 */
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.DATE, -a);
		System.out.println(cal.getTime());
	}
}
