package com.business;

import com.model.Student;
import com.studentdao.StudentDao;

public class StudentBusinessImpl implements Studentbusiness {

	private StudentDao dataAcessObject ;

	//StudentDao dap = new StudentDaoImpl();

	public void setDataAcessObject(StudentDao dataAcessObject) {
		this.dataAcessObject = dataAcessObject;
	}

	@Override
	public int createStudent(Student student) throws Exception {

		return dataAcessObject.save(student);
	}



}
