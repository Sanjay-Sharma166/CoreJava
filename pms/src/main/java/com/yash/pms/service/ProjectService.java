package com.yash.pms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yash.pms.domain.Project;

public interface ProjectService 
{
	public Project saveOrUpdate(Project project);
	public List<Project> getAllProject();
	public Project getProjectByProjectIdentifier(String projectIdentifier);
	public void deleteProjectByprojectIdentifier(String projectIdentifier);
}
