package com.example.demo.AnimeList;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Anime_Complex")
public class Alist {
	@Id
	private int id;
	private String Aname;
	private String Bmcname;
	private String Ccreator;
	private String Dproname;
	private long Eyear;
	private int Fepisodes;
	private int Gtduration;
	private String Hstatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	public String getBmcname() {
		return Bmcname;
	}
	public void setBmcname(String bmcname) {
		Bmcname = bmcname;
	}
	public String getCcreator() {
		return Ccreator;
	}
	public void setCcreator(String ccreator) {
		Ccreator = ccreator;
	}
	public String getDproname() {
		return Dproname;
	}
	public void setDproname(String dproname) {
		Dproname = dproname;
	}
	public long getEyear() {
		return Eyear;
	}
	public void setEyear(long eyear) {
		Eyear = eyear;
	}
	public int getFepisodes() {
		return Fepisodes;
	}
	public void setFepisodes(int fepisodes) {
		Fepisodes = fepisodes;
	}
	public int getGtduration() {
		return Gtduration;
	}
	public void setGtduration(int gtduration) {
		Gtduration = gtduration;
	}
	public String getHstatus() {
		return Hstatus;
	}
	public void setHstatus(String hstatus) {
		Hstatus = hstatus;
	}
	
	
	
	

}
