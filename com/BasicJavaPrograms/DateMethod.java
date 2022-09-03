package com.BasicJavaPrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMethod {

	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);

		Date a = sdf.parse(s);
		System.out.println(a);

		/*
		 * String s = "20/01/2002";
		 * 
		 * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); Date d =
		 * sdf.parse(s); System.out.println(d);
		 * 
		 * String a = sdf.format(d); System.out.println(a);
		 */

	}

}
