package com.cisc181.core;

import java.util.Date;

public class Staff extends Employee {

	 private static Object eTitle;
	 
	 public static Object Title(){
			return Staff.eTitle;
			}

	 public static Object geteTitle() {
		return eTitle;
	}

	 
	 public static void setTitle(Object eTitle) {
		Staff.eTitle = eTitle;
	}



	public Staff(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Date hireDate,
			String Title) 
	
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate);
		
		Staff.setTitle(eTitle);
	}

}