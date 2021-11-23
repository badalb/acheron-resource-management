package org.arm.resource.mngt.entity;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ProjectDto {
private String campaignName;
private String projectName;
private Task task;
private Resource resource;
}
