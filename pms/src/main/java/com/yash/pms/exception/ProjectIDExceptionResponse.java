package com.yash.pms.exception;

public class ProjectIDExceptionResponse
{
	private String projectIdentifier;
	
	public String getProjectIdentifier()
	{
		return projectIdentifier;	
	}

	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}
	
	public ProjectIDExceptionResponse(String projectIdentifier)
	{
		this.projectIdentifier = projectIdentifier;
	}

}
