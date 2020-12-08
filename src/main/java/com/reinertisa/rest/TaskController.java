package com.reinertisa.rest;

import java.util.List;

import com.reinertisa.model.Task;

public interface TaskController {
	
	public boolean createTask(Task task);
	public List<Task> getAllTasks();
	public List<Task> getTaskByEmployeeId(int employeeId);
	public List<Task> getTaskByManagerId(int managerId);
	public Task getTask(int task_id);
	
}
