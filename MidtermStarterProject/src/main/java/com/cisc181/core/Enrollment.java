package com.cisc181.core;

import java.util.UUID;

public class Enrollment extends Course{
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	//No-Arg Constructor for Enrollment
	@SuppressWarnings("unused")
	private Enrollment(){
		
	}
	
	//Getter for SectionID
	public UUID getSectionID() {
		return SectionID;
	}

	//Getter for StudentID
	public UUID getStudentID() {
		return StudentID;
	}

	//Getter for EnrollmentID
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	//Getter for Grade
	public double getGrade() {
		return Grade;
	}


	//Two-arg constructor
	public Enrollment(UUID StudentID, UUID SectionID){
		
		this.SectionID=SectionID;
		this.StudentID=StudentID;
		EnrollmentID=getEnrollmentID();
		}
	
	public void SetGrade(double Grade){
		this.Grade=Grade;
		}

}
