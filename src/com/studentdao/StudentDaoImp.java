package com.studentdao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

import com.model.Student;

public class StudentDaoImp implements StudentDao {
	private DataSource ds;



	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int save(Student student)  throws Exception{
		BasicDataSource bs = new BasicDataSource();
		Connection connect=ds.getConnection();
		PreparedStatement ps = connect.prepareStatement("insert into student values (?,?,?,?) ");
		ps.setInt(1, student.getId());
		ps.setString(2, student.getName());
		ps.setString(3, student.getEmail());
		ps.setInt(4, student.getAge());

		int i =ps.executeUpdate();
		connect.close();
		return i;
	}



}
