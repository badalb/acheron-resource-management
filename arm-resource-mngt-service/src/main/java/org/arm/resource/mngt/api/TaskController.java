package org.arm.resource.mngt.api;

import java.util.List;

import org.arm.resource.mngt.entity.Availability;
import org.arm.resource.mngt.entity.Resource;
import org.arm.resource.mngt.entity.Task;
import org.arm.resource.mngt.impl.IResourceService;
import org.arm.resource.mngt.impl.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
	@Autowired
	private ITaskService taskService;
	
	
	
	@GetMapping("/task")
	public List<Task> allTask(){
		return taskService.getAllTask();
	}
	
	@GetMapping("/task/projectId/{projectId}")
	public List<Task> getTaskListByProjectId(@PathVariable("projectId")int projectId){
		return taskService.getAllTaskListByProjectId(projectId);
		
	}
	
}
