package com.ngocnv.common;

import java.util.List;

public class Student {
	
	public String id;
	public String name;
	public String age;

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	private List<String> courses;
	

	public Student(Address address) {
		this.name = address.getCity();
	};

	public Student(String id, String name, String age, List<String> courses) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.courses = courses;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public void study() {
		System.out.println("I'm studying!" + this.name);
	}
	

}
