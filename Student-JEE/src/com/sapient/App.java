package com.sapient;

import com.sapient.model.Student;
import com.sapient.repository.StudentRepository;
import com.sapient.repository.StudentRepositoryImpl;

public class App {

	public static void main(String[] args) {
		StudentRepository repository = new StudentRepositoryImpl();

		// ------------------------------------------------------------------------------------

		Student student = new Student();
		student.setName("Akarsh");
		student.setDept("CSE");
		
		repository.addStudent(student);

		// ------------------------------------------------------------------------------------
	}
}
