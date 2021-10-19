package com.yash.pms.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.pms.domain.Project;
import com.yash.pms.service.MapValidationErrorService;
import com.yash.pms.service.ProjectService;

@RestController
@RequestMapping("/api/project")
@CrossOrigin
public class ProjectController 
{
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;

	
	@PostMapping
	public ResponseEntity<?> createNewProject(@Valid @RequestBody Project project, BindingResult result)
	{
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
		if(errorMap != null)
			return errorMap;
		Project savedProject = projectService.saveOrUpdate(project);
		return new ResponseEntity<Project>(savedProject, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<?> updateProject(@Valid @RequestBody Project project, BindingResult result)
	{
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
		if(errorMap != null)
			return errorMap;
		Project savedProject = projectService.saveOrUpdate(project);
		return new ResponseEntity<Project>(savedProject, HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> findAll()
	{
		List<Project> projects = projectService.getAllProject();
		return new ResponseEntity<List<Project>>(projects, HttpStatus.OK);
	}
	
	@GetMapping("/{projectIdentifier}")
	public ResponseEntity<?> findByProjectIdentifier(@PathVariable String projectIdentifier)
	{
		Project projects = projectService.getProjectByProjectIdentifier(projectIdentifier);
		return new ResponseEntity<Project>(projects, HttpStatus.OK);
	}
	
	@DeleteMapping("/{projectIdentifier}")
	public ResponseEntity<?> deleteById(@PathVariable String projectIdentifier)
	{
		projectService.deleteProjectByprojectIdentifier(projectIdentifier);
		return new ResponseEntity<String>("Project with" +projectIdentifier.toUpperCase() + " is successfully deleted", HttpStatus.OK);
	}
}
