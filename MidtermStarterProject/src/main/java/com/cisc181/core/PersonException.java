package com.cisc181.core;


import java.util.Calendar;
import java.util.Date;



public class PersonException extends Person{

	public PersonException(String FirstName, String MiddleName, String LastName, Date DOB, String Address,
			String Phone_number, String Email){
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
	}
			
			
			
			
	
	//getter that returns boolean for testing
	public boolean getAge(){
		Calendar today = Calendar.getInstance();
		Calendar birthDate = Calendar.getInstance();

		int age = 0;
		birthDate.setTime(this.DOB);
		if (birthDate.after(today)) {
			throw new IllegalArgumentException("Can't be born in the future");
		}
		age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

		// If birth date is greater than todays date (after 2 days adjustment of
		// leap year) then decrement age one year
		if ((birthDate.get(Calendar.DAY_OF_YEAR)
				- today.get(Calendar.DAY_OF_YEAR) > 3)
				|| (birthDate.get(Calendar.MONTH) > today.get(Calendar.MONTH))) {
			age--;

			// If birth date and todays date are of same month and birth day of
			// month is greater than todays day of month then decrement age
		} else if ((birthDate.get(Calendar.MONTH) == today.get(Calendar.MONTH))
				&& (birthDate.get(Calendar.DAY_OF_MONTH) > today
						.get(Calendar.DAY_OF_MONTH))) {
			age--;
		}
	if(age>100){
		return false;

	}else{
		return true;}
	}
}
	

/**
 * Wasnt sure how to formulate the tests for age. But getAge returns boolean for testing. based on boolean value
 * determines if an exception is thrown. If age is greater than 100 than the test will throw the message
 * "Age can't be greater than 100", if true is passed than the exception is bypassed.
 * 
 * I also got lost with the regex coding. Tried to use it and i got a ton of red.
 */

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			


