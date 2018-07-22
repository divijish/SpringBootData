package io.springboot.start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.springboot.start.Repository.*;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;

	//private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic(1, "Maths"), new Topic(2, "English") ,new Topic(3,"Hindi"),
	//		new Topic(4,"Economics")));

	public List<Topic> getAllTopics(){

		List<Topic> topics = new ArrayList<>();
		topics = (List<Topic>) topicRepository.findAll();
		return topics;
	}

	public Topic getTopic(int id) {
		System.out.println("Inside topic service");
		return null;
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(int id, Topic topic) {
		Topic x = null;
	}

	public Topic deleteTopic(int id) {

		Topic x = null;
		return x;
	}

}
