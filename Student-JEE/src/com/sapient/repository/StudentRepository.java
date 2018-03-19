package com.sapient.repository;

import com.sapient.model.Student;

public interface StudentRepository {
	
	public void addStudent(Student student);
	public Student findStudent(int rollno);

}
