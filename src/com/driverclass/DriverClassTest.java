package com.driverclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.business.Studentbusiness;
import com.model.Student;

public class DriverClassTest {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/resources/text.xml");
		Studentbusiness bs = (Studentbusiness)context.getBean("studentBusinessImpl");
		int i=	bs.createStudent(new Student(4,"Kiran", "kiran.g1@gmail.com", 29));
		System.out.println(i);



	}

}
