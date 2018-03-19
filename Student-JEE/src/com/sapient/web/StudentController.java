package com.sapient.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.model.Student;
import com.sapient.repository.StudentRepository;
import com.sapient.repository.StudentRepositoryImpl;

/**
 * Servlet implementation class WebController
 */
@WebServlet(urlPatterns = { "/add-students" })
public class StudentController extends HttpServlet {

	StudentRepository repository = new StudentRepositoryImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// String uri=request.getRequestURI();
		// String path=uri.substring(uri.lastIndexOf("/"));
		// if(path.equals("/))

		// String rollno = request.getParameter("rollno");
		// Student student = repository.findStudent(Integer.parseInt(rollno));

//		response.sendRedirect("add-students");

		// request.setAttribute("student", student);
		// request.getRequestDispatcher("form-student.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Student student = new Student();

		// INPUT
		String rollno = request.getParameter("rollno");
		String name = request.getParameter("name");
		String country = request.getParameter("country");
		String department = request.getParameter("department");

		// Mapping to object
		student.setRollno(Integer.parseInt(rollno));
		student.setName(name);
		student.setCountry(country);
		student.setDept(department);

		repository.addStudent(student);

//		response.sendRedirect("add-students");

	}

}
