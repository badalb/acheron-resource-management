package org.arm.resource.mngt;

import java.util.List;

import org.arm.resource.mngt.entity.Campaign;
import org.arm.resource.mngt.service.CampaignService;
import org.arm.resource.mngt.service.IProjectService;
import org.arm.resource.mngt.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class ArmRMSApplication implements CommandLineRunner {

	public static void main(String[] args) {
		
		SpringApplication.run(ArmRMSApplication.class, args);
	}

	@Autowired
	CampaignService cmpService;
	
	@Autowired
	IProjectService projectService;
	
	@Autowired
	ITaskService taskService;
	
	
	@Override
	public void run(String... args) throws Exception {
	
		cmpService.getAllCampaign().forEach(System.out:: println);
		List<Campaign> campaignList= cmpService.getAllCampaign();
		for(int i=0; i<campaignList.size();i++) {
			//System.out.println(campaignList.get(i).getProjectList().toString());
		}
		taskService.getAllTask().forEach(System.out:: println);
	}
}
