package com.yash.SpringCoreLYF;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Book(String subject) {
		super();
		this.subject = subject;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [subject=" + subject + "]";
	}
	@PostConstruct
	public void start()
	{
		System.out.println("Starting method");
	}
	@PreDestroy
	public void end()
	{
		System.out.println("Ending method");
	}
}
