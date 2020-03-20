package com.mile1.bean;

public class Student {

	String name;
	int marks[];

	public Student() {

	}

	public Student(String name, int... marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public void setMarks(int... marks) {
		this.marks = marks;
	}

	public int[] getMarks() {
		return marks;
	}
}
