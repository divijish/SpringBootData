package io.springboot.start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.springboot.start.Entity.Course;

@Service
public class CourseService {

	
	private List<Course> courses = Arrays.asList(new Course("course 1"), new Course("course 2"));

	public Course getCourse(String name) {
		return courses.stream().filter(x->x.getName().equals(name)).findFirst().get();
	}

}
