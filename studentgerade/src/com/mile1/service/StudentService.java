package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {

	public int findNumberOfNullMarks(Student data[]) {

		// write code here
		int count = 0;
		if (data != null)
			for (Student student : data) {
				if (student != null) {
					if (student.getMarks() == null)
						count++;
				}
			}
		return count;
	}

	public int findNumberOfNullNames(Student data[]) {

		// write code here
		int count = 0;
		if (data != null)
			for (Student student : data) {
				if (student != null) {
					if (student.getName() == null)
						count++;
				}
			}
		return count;
	}

	public int findNumberOfNullObjects(Student data[]) {
		// write code here
		int count = 0;
		if (data != null)
			for (Student student : data) {
				if (student == null)
					count++;
			}
		return count;
	}
}
