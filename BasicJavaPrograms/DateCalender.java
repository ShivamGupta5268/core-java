package com.BasicJavaPrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalender {

	public static void main(String[] args) throws ParseException {
		String s = "22/01/2022";

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(s);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		for (int i = 1; i <= 12; i++) {
			cal.add(Calendar.DATE, 30);
			Date x = cal.getTime();
			String a = sdf.format(x);
			System.out.println(a);

			for (int j = 1; j <= 5; j++) {
				cal.add(Calendar.DATE, -1);
				Date y = cal.getTime();
				String b = sdf.format(y);
				System.out.println(b + " Recharge Your Mobile");
			}
			cal.add(Calendar.DATE, +5);

		}
	}
}
