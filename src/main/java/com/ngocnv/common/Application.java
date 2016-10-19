package com.ngocnv.common;

import static java.util.Arrays.asList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.util.Arrays.asList;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Student student = (Student)context.getBean("student");
		student.study();
		System.out.println(student.getAge());
		student.getCourses().forEach(System.out::println);
	}
}
