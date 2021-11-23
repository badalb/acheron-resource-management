package org.arm.resource.mngt.api;

import java.util.List;

import org.arm.resource.mngt.entity.Campaign;
import org.arm.resource.mngt.entity.Resource;
import org.arm.resource.mngt.impl.ICampaignService;
import org.arm.resource.mngt.impl.IProjectService;
import org.arm.resource.mngt.impl.IResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	
	@Autowired
	private IResourceService resourceService;
	@GetMapping("/resource/available")
	public List<Resource> getAllResourceAvailableSlot(){
		return resourceService.getAllResourceAvailableSlot();
		
	}
}
