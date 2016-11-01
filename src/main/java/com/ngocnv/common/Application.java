package com.ngocnv.common;

import static java.util.Arrays.asList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Application {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Student student = (Student)context.getBean("student");
//		student.study();
//		System.out.println(student.getAge());
//		student.getCourses().forEach(System.out::println);

		List<Student>  list = new ArrayList<Student>() {{
			add(new Student("4", "B"));
			add(new Student("3", "B"));
			add(new Student("3", "A"));
			add(new Student("4", "A"));
			add(new Student("5", "A"));
			add(new Student("2", "A"));
			add(new Student("2", "A"));
			add(new Student("1", "A"));
			add(new Student("1", "B"));
			add(new Student("2", "B"));
		}};

		System.out.println(list.size());

		Map<String, List<Student>> map = list.stream().sorted((o1, o2) -> o1.getId().compareTo(o2.getId()))
				.collect(Collectors.groupingBy(Student::getId, Collectors.toList()));

//		map.forEach((k, v)-> {
//			v.stream().sorted((o1, o2) -> o2.getName().compareTo(o2.getName()));
//		});


		list = map.values().stream().flatMap(List::stream).collect(Collectors.toList());

		list.forEach(e -> {
			System.out.println(e.getId() + " " + e.getName());
		});

	}

}
