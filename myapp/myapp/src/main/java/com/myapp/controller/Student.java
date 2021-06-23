package com.myapp.controller;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Table(name = "STUDENT")
@Entity
public class Student {
	
	@Id
	@GeneratedValue
	@Range(max = 100)
	private int id;
	
	@Size(min = 2,message = "Name size should be greater than 2 characters")
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
