package io.springboot.start.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.springboot.start.Entity.Topic;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic(1, "Maths"), new Topic(2, "English") ,new Topic(3,"Hindi"),
			new Topic(4,"Economics")));

	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(int id) {
		System.out.println("Inside topic service");
		return topics.stream().filter(x->x.getId()==id).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(int id, Topic topic) {
		Topic x = null;
		for(int i=0;i<topics.size();i++) {
			
			if(topics.get(i).getId()==id) {
				topics.set(id, topic);
				x = topic;
				break;
			}
		}
	}

	public Topic deleteTopic(int id) {
		
		Topic x = null;
		
		for(int i=0; i<topics.size();i++) {
			if(topics.get(i).getId()==id) {
				x = topics.get(i);
				topics.remove(i);
			}
		}
		
		return x;
	}

}
