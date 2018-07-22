package io.springboot.start.Controller;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.springboot.start.CourseService;
import io.springboot.start.Topic;
import io.springboot.start.TopicService;
import io.springboot.start.Entity.*;

@Controller
@RestController
public class HelloController {

	@Autowired
	private TopicService topicService;

	@Autowired
	private CourseService courseService;

	@RequestMapping("/hi")
	public String sayHi() {
		return "Hello";
	}

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		System.out.println("Getting topics");
		return topicService.getAllTopics();
	}

	@RequestMapping("/courses")
	public List<Course> getAllCourses() 
	{
		return Arrays.asList(new Course("Course1"), new Course("Course2"));
	}

	@RequestMapping("/lessons")
	public String getAllLessons() 
	{
		return null;
	}

	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable int id) 	//@PathVariable is used to define that {name} is variable
	{
		return topicService.getTopic(id);
	}

	@RequestMapping("/courses/{name}")
	public Course getCourse(@PathVariable String name) 	//@PathVariable is used to define that {name} is variable
	{
		return courseService.getCourse(name);
	}

	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic topic)
	{
		System.out.println("Adding topic");
		topicService.addTopic(topic);
	}

	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@PathVariable("id") int id, @RequestBody Topic topic)
	{
		System.out.println("updating topic");
		topicService.updateTopic(id, topic);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public Topic deleteTopic(@PathVariable("id") int id) {
		
		System.out.println("Deleting topic ");
	return topicService.deleteTopic(id);
	}
	

}
