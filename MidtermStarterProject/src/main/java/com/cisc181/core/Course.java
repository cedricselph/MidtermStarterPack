package com.cisc181.core;

import java.util.UUID;

public abstract class Course {
	
	private static String CourseName;
	protected static int GradePoints;
	private static UUID CourseID;
	private static Object eMajor;
	
	//gets course name and grade points
	public String getCourseName() {
		return CourseName;
	}
	//getter for gradepoints
	public static int getGradePoints() {
		return GradePoints;
	}
	//sets course ID 
	public static UUID setCourseID() {
		return CourseID;
	}
	
	public static Object Major(){
		return Course.eMajor;
		
	}
}
