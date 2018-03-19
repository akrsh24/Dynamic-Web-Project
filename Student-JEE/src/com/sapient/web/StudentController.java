package com.sapient.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.model.Student;
import com.sapient.repository.StudentRepository;

/**
 * Servlet implementation class WebController
 */
@WebServlet({ "/load-students", "/add-students" })
public class StudentController extends HttpServlet {

	StudentRepository repository = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// String uri=request.getRequestURI();
		// String path=uri.substring(uri.lastIndexOf("/"));
		// if(path.equals("/))

		String rollno = request.getParameter("rollno");
		Student student = repository.findStudent(Integer.parseInt(rollno));

		request.setAttribute("student", student);
		request.getRequestDispatcher("SM.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Student student = new Student();

		// INPUT
		String name = request.getParameter("name");
		String department = request.getParameter("department");
		System.out.println(name+department);
		// Mapping to object

		student.setName(name);
		student.setDept(department);

		repository.addStudent(student);

		response.sendRedirect("load-students");

	}

}
