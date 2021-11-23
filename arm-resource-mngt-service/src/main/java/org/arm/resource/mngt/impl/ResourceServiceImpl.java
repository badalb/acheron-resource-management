package org.arm.resource.mngt.impl;

import java.util.List;

import org.arm.resource.mngt.dataaccess.CampaignRepository;
import org.arm.resource.mngt.dataaccess.ResourceRepository;
import org.arm.resource.mngt.entity.Availability;
import org.arm.resource.mngt.entity.Campaign;
import org.arm.resource.mngt.entity.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl implements IResourceService {
	@Autowired
	ResourceRepository resourceRepository;

	@Override
	public List<Resource> getAllResourceAvailableSlot() {
		return resourceRepository.findAll();
	}

}
