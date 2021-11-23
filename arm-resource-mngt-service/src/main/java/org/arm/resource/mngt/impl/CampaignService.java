package org.arm.resource.mngt.impl;

import java.util.List;

import org.arm.resource.mngt.dataaccess.CampaignRepository;
import org.arm.resource.mngt.entity.Campaign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampaignService implements ICampaignService {
@Autowired
CampaignRepository campaignRepository;

public List<Campaign> getAllCampaign() {
	
	return campaignRepository.findAll();

}

}
