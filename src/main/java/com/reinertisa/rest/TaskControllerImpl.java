package com.reinertisa.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reinertisa.model.Task;
import com.reinertisa.service.TaskService;

@CrossOrigin(origins="http://localhost:4200")
@RestController("taskController")
public class TaskControllerImpl implements TaskController {

	
	@Autowired
	private TaskService taskService;
	
	
	@PostMapping("/tasks")
	public boolean createTask(Task task) {
		// TODO Auto-generated method stub
		return false;
	}

	
	@GetMapping("/tasks")
	public List<Task> getAllTasks() {
		return taskService.getAllTasks();
	}

	@Override
	public List<Task> getTaskByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> getTaskByManagerId(int managerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task getTask(int task_id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
