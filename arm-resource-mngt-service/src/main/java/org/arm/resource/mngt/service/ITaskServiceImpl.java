package org.arm.resource.mngt.service;

import java.util.List;

import org.arm.resource.mngt.entity.Task;
import org.arm.resource.mngt.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ITaskServiceImpl implements ITaskService {

	@Autowired
	TaskRepository taskRepository;

	@Override
	public List<Task> getAllTask() {
		// TODO Auto-generated method stub
		return taskRepository.findAll();
	}

	@Override
	public List<Task> getByProjectProjectId(int projectId) {
		return taskRepository.findByProjectProjectId(projectId);
	}

	


		// TODO Auto-generated method stub
	//	return taskRepository.getAllTaskoFCompany();
//		private int projectId;
//		private String projectName;
//		private String projectOwner;
//		private Timestamp startDate;
	//	return null;
	//	List<ProjectDto> projectDto= new ArrayList<>();
//	List<Task> alltask=	taskRepository.findAll();
//	for(int i=0;i<alltask.size();i++) {
//		
//		Project p= alltask.get(i).getProject();
	//	ProjectDto d= new ProjectDto(p.getProjectId(), p.getProjectName(), p.getProjectOwner(), p.getStartDate());
		//alltask.get(i).setProject(p);
	//}
//	//
//		return taskRepository.findAll();
//	}
//}

	}

