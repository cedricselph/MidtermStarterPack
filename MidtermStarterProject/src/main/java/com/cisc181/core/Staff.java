package com.cisc181.core;

import java.util.Date;
import com.cisc181.eNums.eTitle;

public class Staff extends Employee {
	 
		private eTitle Title;
	
			

	 
	 public eTitle getTitle() {
			return Title;
		}



		public void setTitle(eTitle title) {
			Title = title;
		}
	 

	public Staff(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Date hireDate, eTitle Title) 
	
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate);
		
		setTitle(Title);
	}

}