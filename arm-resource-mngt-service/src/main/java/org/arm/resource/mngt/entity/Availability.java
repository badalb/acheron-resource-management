package org.arm.resource.mngt.entity;

import java.sql.Timestamp;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Availability {
	@Id
	private int id;

	private Timestamp startDate;
	private Timestamp endDate;
	private float customhours;
	private int leaveCount;
	@Enumerated(EnumType.STRING)
	private AvailabilityStatus availableStatus;
	
	private Timestamp createDate;
	
	private Timestamp updateDate;
	
	private int isDeleted;
	@ManyToOne
	@JoinColumn(name="resource_id")
	private Resource resource;
}
