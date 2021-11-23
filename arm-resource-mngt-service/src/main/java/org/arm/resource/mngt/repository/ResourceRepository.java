package org.arm.resource.mngt.repository;

import org.arm.resource.mngt.entity.Availability;
import org.arm.resource.mngt.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ResourceRepository extends JpaRepository<Resource, Integer> {

	

	
}
