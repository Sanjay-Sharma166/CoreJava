package com.yash.pms.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="projects")
/**
 * Model class for project
 * @author sanjay.sharma
 *
 */
public class Project 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/**
	 * Id of Project
	 */
	private long id;
	
	@NotBlank(message = "Project Name is required")
	@Size(min = 4, max = 255, message = "Please use 4 to 255 characters for Project Name")
	/**
	 * Name of projects
	 */
	private String projectName;
	
	@Column(updatable = false, unique = true) //This field in db will not be updatable for that paticular id
											  // this field will be unique
	@NotBlank(message = "Project Identifier is required")
	@Size(min = 4, max = 5, message = "Project identifier must be in between 4 to 5 characters")
	/**
	 * unique identifier for project
	 */
	private String projectIdentifier;
	
	@NotBlank(message = "Project description is required")
	/**
	 * Description of project  
	 */
	private String description;
	
	@Column(updatable = false)
	@JsonFormat(pattern = "yyyy-MM-dd")
	/**
	 * Date of creation of project
	 */
	private Date created_At;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	/**
	 * Date of project when it is updated
	 */
	private Date updated_At;
	
	@Future
	@JsonFormat(pattern = "yyyy-MM-dd")
	/**
	 * Expected end Date of project
	 */
	private Date end_Date;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	/**
	 * Start Date of project
	 */
	private Date start_Date;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectIdentifier() {
		return projectIdentifier;
	}

	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreated_At() {
		return created_At;
	}

	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}

	public Date getUpdated_At() {
		return updated_At;
	}

	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}

	public Date getEnd_Date() {
		return end_Date;
	}

	public void setEnd_Date(Date end_Date) {
		this.end_Date = end_Date;
	}

	public Date getStart_Date() {
		return start_Date;
	}

	public void setStart_Date(Date start_Date) {
		this.start_Date = start_Date;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", projectName=" + projectName + ", projectIdentifier=" + projectIdentifier
				+ ", description=" + description + ", created_At=" + created_At + ", updated_At=" + updated_At
				+ ", end_Date=" + end_Date + ", start_Date=" + start_Date + "]";
	}
	
	
}
