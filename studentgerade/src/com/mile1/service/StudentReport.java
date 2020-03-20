package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {

	public String findGrade(Student studentObject) {
		// write code here
		int total = 0;
		String grade = null;

		for (int mark : studentObject.getMarks()) {
			if (mark < 35)
				return "F";
			else
				total = total + mark;
		}

		if (total <= 150)
			grade = "D";
		else if (total > 150 && total <= 200)
			grade = "C";
		else if (total > 200 && total <= 250)
			grade = "B";
		else if (total > 250 && total <= 300)
			grade = "A";

		return grade;
	}

	public String validate(Student studentObject)
			throws NullStudentException, NullNameException, NullMarksArrayException {

		// write code here
		if (studentObject == null)
			throw new NullStudentException();
		else {
			if (studentObject.getName() == null)
				throw new NullNameException();
			else if (studentObject.getMarks() == null)
				throw new NullMarksArrayException();
			else
				return findGrade(studentObject);
		}
	}

}
