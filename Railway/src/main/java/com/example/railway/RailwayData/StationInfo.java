package com.example.railway.RailwayData;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Station_table")
public class StationInfo {
	@Id
	private int stnid;
	private String stname;
	private String stnplace;
	private int ptform;
	private String trname;
	private int trnum;
	private String trntype;
	public int getStnid() {
		return stnid;
	}
	public void setStnid(int stnid) {
		this.stnid = stnid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public String getStnplace() {
		return stnplace;
	}
	public void setStnplace(String stnplace) {
		this.stnplace = stnplace;
	}
	public int getPtform() {
		return ptform;
	}
	public void setPtform(int ptform) {
		this.ptform = ptform;
	}
	public String getTrname() {
		return trname;
	}
	public void setTrname(String trname) {
		this.trname = trname;
	}
	public int getTrnum() {
		return trnum;
	}
	public void setTrnum(int trnum) {
		this.trnum = trnum;
	}
	public String getTrntype() {
		return trntype;
	}
	public void setTrntype(String trntype) {
		this.trntype = trntype;
	}
	
	

}
