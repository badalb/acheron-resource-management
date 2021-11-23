package org.arm.resource.mngt.impl;

import java.util.List;

import org.arm.resource.mngt.entity.Availability;
import org.arm.resource.mngt.entity.Resource;

public interface IResourceService {

	public List<Resource> getAllResourceAvailableSlot();
}
