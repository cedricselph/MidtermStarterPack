package com.cisc181.core;

import java.util.UUID;

public class Section {
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	//Getter for CourseID
	public UUID getCourseID() {
		return CourseID;
	}
	
	//Getter for SemesterID
	public UUID getSemesterID() {
		return SemesterID;
	}
	
	//Getter for SectionID
	public UUID getSectionID() {
		return SectionID;
	}
	
	//Getter fort RoomID
	public int getRoomID() {
		return RoomID;
	}
	
	

}
