package io.springboot.start.Entity;

public class Course {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + "]";
	}

	public Course(String name) {
		super();
		this.name = name;
	}
	
	
}
