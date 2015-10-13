package com.cisc181.core;

import java.util.UUID;
import java.util.Date;

public class Semester {
	
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	//gets UUID, start date and end date
	public UUID getSemesterID() {
		return SemesterID;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	
	//Sets the dates
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	
	
	

}
