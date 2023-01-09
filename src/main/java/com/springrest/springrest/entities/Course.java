package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	private long id;
	private String title;
	private String discription;
	
	public Course(long id, String title, String discription) {
		super();
		this.id = id;
		this.title = title;
		this.discription = discription;
	}

	public Course() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	@Override
	public String toString() {
		return "course [id=" + id + ", title=" + title + ", discription=" + discription + "]";
	}
}
