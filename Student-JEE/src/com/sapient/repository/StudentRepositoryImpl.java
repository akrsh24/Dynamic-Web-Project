package com.sapient.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sapient.db.MySQLConnectionFactory;
import com.sapient.model.Student;

public class StudentRepositoryImpl implements StudentRepository {

	@Override
	public void addStudent(Student student) {

		Connection connection = null;

		try {
			connection = MySQLConnectionFactory.getConnection();
			String sql = "insert into student.STUDENTS(rollno,name,country,department) values(?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setInt(1, student.getRollno());
			ps.setString(2, student.getName());
			ps.setString(3, student.getCountry());
			ps.setString(4, student.getDept());
			
			int count = ps.executeUpdate();

			if (count == 1) {
				System.out.println("New Student Info added");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public Student findStudent(int rollno) {
		Connection connection = null;
		Student student = null;

		try {
			connection = MySQLConnectionFactory.getConnection();
			String sql = "select * from student.STUDENTS where rollno=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, rollno);

			ResultSet rs = ps.executeQuery();
			rs.next();

			student = new Student();
			student.setRollno(Integer.parseInt(rs.getString(1)));
			student.setName(rs.getString(2));
			student.setCountry(rs.getString(3));
			student.setDept(rs.getString(4));
			

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return student;

	}
}