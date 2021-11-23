package org.arm.resource.mngt.entity;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Resource {

	@Id
	private int resourceId;
	private String resourceName;
	private String resourceType;
	private String availability;
	private Timestamp createDate;
	private Timestamp updateDate;
	private int isDeleted;
	
	@OneToMany(mappedBy = "resource",fetch = FetchType.EAGER)
	private Set<Availability> availibility;
}
