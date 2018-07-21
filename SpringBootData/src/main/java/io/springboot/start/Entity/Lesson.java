package io.springboot.start.Entity;

public class Lesson {
	private String name;

	public Lesson(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Lesson [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
