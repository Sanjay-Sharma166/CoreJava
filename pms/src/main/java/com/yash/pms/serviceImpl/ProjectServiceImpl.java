package com.yash.pms.serviceImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.pms.domain.Project;
import com.yash.pms.exception.ProjectIDException;
import com.yash.pms.repository.ProjectRepository;
import com.yash.pms.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService
{
	static Logger logger = Logger.getLogger(ProjectService.class);

	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public Project saveOrUpdate(Project project) 
	{
	 try{
		 project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
		 logger.info("Project Id" +project.getId());
		 Long id = project.getId();
		 projectRepository.save(project);
		 Project savedProject = projectRepository.save(project);
		 return savedProject;
	 	}
	catch(Exception e)
		{
		e.printStackTrace();
		throw new ProjectIDException("Project Identifier" + project.getProjectIdentifier().toUpperCase() + "already exists");
		}
	}
	
	@Override
	public List<Project> getAllProject()
	{	
		return (List<Project>) projectRepository.findAll();
	}

	@Override
	public Project getProjectByProjectIdentifier(String projectIdentifier)
	{
		Project project = projectRepository.findByProjectIdentifier(projectIdentifier.toUpperCase());
		if(project == null)
		{
			throw new ProjectIDException("Project Identifier" + project.getProjectIdentifier().toUpperCase() + "not exists");
		}
		return project;
	}

	@Override
	public void deleteProjectByprojectIdentifier(String projectIdentifier)
	{
		Project project = projectRepository.findByProjectIdentifier(projectIdentifier.toUpperCase());
		if(project == null)
		{
			throw new ProjectIDException("Project Identifier" + project.getProjectIdentifier().toUpperCase() + "not exists");
	
		}
	}
}
