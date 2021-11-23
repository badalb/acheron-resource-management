package org.arm.resource.mngt.api;

import java.util.List;

import org.arm.resource.mngt.entity.Project;
import org.arm.resource.mngt.impl.ICampaignService;
import org.arm.resource.mngt.impl.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
	
	@Autowired
	private IProjectService projectService;
	
	@GetMapping("/project")
	public List<Project> allProject(){
		return projectService.getAllProject();
	}
	
	@GetMapping("/project/campaignId/{campaignId}")
	public List<Project> getProjectListByCampaignId(@PathVariable("campaignId")int campaignId){
		return projectService.getAllProjectListByCampaignId(campaignId);
		
	}
}
