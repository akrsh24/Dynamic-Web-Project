package com.sapient.model;

public class Student {

	private int rollno;
	private String name;
	private String country;
	private String dept;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Student(int rollno, String name, String dept) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", dept=" + dept + "]";
	}

	public Student() {
	}
}
