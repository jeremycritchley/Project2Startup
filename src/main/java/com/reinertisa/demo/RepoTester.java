package com.reinertisa.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reinertisa.service.TaskService;
import com.reinertisa.service.UserService;

public class RepoTester {
	
	private static UserService userService;
	private static TaskService taskService;
	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		userService = appContext.getBean("userService", UserService.class);
		taskService = appContext.getBean("taskService", TaskService.class);
		
		getUsersByUsername();
	}
	
	private static void getUsersByUsername() {
		System.out.println(userService.getAllUsers());
	}

	private static void getTasksByStatus() {
		
	}
	
}
