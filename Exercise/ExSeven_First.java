package com.Exercise;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ExSeven_First {
	
	public static void main(String[] args) {
		
		LocalDate birthday = LocalDate.of(1997, 01, 22); //Create birthday obj using LocalDate Class
		LocalDate today = LocalDate.now();
		
		long years = ChronoUnit.YEARS.between(birthday, today);
		
		Period p = Period.between(birthday, today);
		System.out.println("Year: "+ p.getYears()); 
		System.out.println("Months: "+ p.getMonths());
		System.out.println("Days: "+ p.getDays());
		
		/*	System.out.println("Age in Years: "+ years); 
		 		* if only Year has to print */
	}

}
