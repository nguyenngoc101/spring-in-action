package com.ngocnv.common;

public class Student {
	
	public String id;
	public String name;
	public String age;
	
	
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
