package com.shashank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="certificate")
public class Certificate {
	@Id
	private int id;
	private int year;
	private String college;
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(int id, int year, String college) {
		super();
		this.id = id;
		this.year = year;
		this.college = college;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	
}