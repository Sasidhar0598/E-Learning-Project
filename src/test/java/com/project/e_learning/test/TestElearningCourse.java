package com.project.e_learning.test;

import java.util.Map;

import org.openqa.selenium.NotFoundException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.project.e_learning.ELearningCourse;

public class TestElearningCourse {

	@Test
	public void findcourse() {

		String Topic = "Junit";

		int Expectedduration = 25;


		ELearningCourse cs = new ELearningCourse();

		// number of people in the city
		try {
			int count = cs.getcourse(Topic);

			System.out.println(count);

			 Assert.assertEquals(count, Expectedduration);

		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}

	}
	
	
	@Test
	public void findcourseSelenium() {

		String Topic = "Selenium";

		int Expectedduration = 10;


		ELearningCourse cs = new ELearningCourse();

		// number of people in the city
		try {
			int count = cs.getcourse(Topic);

			System.out.println(count);

			 Assert.assertEquals(count, Expectedduration);

		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}

	}
	
	
	@Test
	public void findcourseGit() {

		String Topic = "Git";

		int Expectedduration = 2;

		String expectedTitle = "";

		ELearningCourse cs = new ELearningCourse();

		// number of people in the city
		try {
			int count = cs.getcourse(Topic);

			System.out.println(count);

			 Assert.assertEquals(count, Expectedduration);

		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}

	}
	
	@Test
	public void findcourseTitle() {

		String Topic = "Junit";

		int Expectedduration = 25;


		ELearningCourse cs = new ELearningCourse();

		// number of people in the city
		try {
			String map = cs.getcourseTitle(Topic);

			System.out.println(map);

			 Assert.assertEquals(map, Topic);

		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void findEmptyInput() {

		try {
			String Topic = "";
			int Expectedduration = 0;
			ELearningCourse cs = new ELearningCourse();

			int count = cs.getcourse(Topic);

		} catch (NullPointerException e) {

			System.out.println("Topic name cannot be empty");
		}

	}
	
	

}
