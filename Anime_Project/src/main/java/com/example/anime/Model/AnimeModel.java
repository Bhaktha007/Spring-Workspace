package com.example.anime.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AnimeModel {
	
	@Id
	private int id;
	private String aname;
	private String mc;
	private String anicreator;
	private String prod;
	private int year;
	private int episodes;
	private int tduration;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getMc() {
		return mc;
	}
	public void setMc(String mc) {
		this.mc = mc;
	}
	public String getAnicreator() {
		return anicreator;
	}
	public void setAnicreator(String anicreator) {
		this.anicreator = anicreator;
	}
	public String getProd() {
		return prod;
	}
	public void setProd(String prod) {
		this.prod = prod;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getEpisodes() {
		return episodes;
	}
	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}
	public int getTduration() {
		return tduration;
	}
	public void setTduration(int tduration) {
		this.tduration = tduration;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
