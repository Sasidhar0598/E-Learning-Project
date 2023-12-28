package com.project.e_learning;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.NotFoundException;

public class ELearningCourse {
	
	private Map<String, Integer> getcourse() {

		Map<String, Integer> getcourse = new HashMap<>();

		//Map<String, Integer> course1 = new HashMap<>();
		//course1.put("Selenium", 10);
		//Map<String, Integer> course2 = new HashMap<>();
		//course2.put("Junit", 25);
		//Map<String, Integer> course3 = new HashMap<>();
		//course3.put("Git", 2);
		getcourse.put("Selenium", 10);
		getcourse.put("Junit", 25);
		getcourse.put("Git", 2);
		
		
		return getcourse;

	}
	public int getcourse(String Topic) {

		

		Map<String, Integer> courseMap = null;
		int count = 0;

		if (Topic.isEmpty()) {
			throw new NullPointerException("Topic Name cannot be empty..");
		}

		courseMap = getcourse();

		if (!courseMap.containsKey(Topic)) {
			throw new NotFoundException("Topic Name does not exist");
		} else {
			//count = courseMap.get(Topic);
			count = courseMap.get(Topic);
		}

		return count;
	}
	
	
	public String getcourseTitle(String Topic) {
		
		Map<String, Integer> courseMap = null;
		String title = "";

		if (Topic.isEmpty()) {
			throw new NullPointerException("Topic Name cannot be empty..");
		}

		courseMap = getcourse();

		if (!courseMap.containsKey(Topic)) {
			throw new NotFoundException("Topic Name does not exist");
		} else {
			title = Topic;
		}
		return title;
	}

}
