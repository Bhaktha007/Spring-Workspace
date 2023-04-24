package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="carmodel")
public class modelcar {
	@Id
	@Column(name="id")
	private int id;
	private String name;
	private int cmodel;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCmodel() {
		return cmodel;
	}
	public void setCmodel(int cmodel) {
		this.cmodel = cmodel;
	}

}
