package org.arm.resource.mngt.api;

import java.util.List;

import org.arm.resource.mngt.entity.Campaign;
import org.arm.resource.mngt.impl.ICampaignService;
import org.arm.resource.mngt.impl.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CampaignController {
	@Autowired
	private ICampaignService campaignService;
	
	@GetMapping("/campaign")
	public List<Campaign> allCampaign(){
		return campaignService.getAllCampaign();
	}
}
