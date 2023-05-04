package com.example.railway.RailwayData;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_table")
public class CustomerInfo {
	@Id
	private int cusid;
	private String cusname;
	private String cusgen;
	private int cusnum;
	private int cusage;
	private String trnticket;
	private int trnid;
	private int compt;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn
	public List<StationInfo> additional;
	public int getCusid() {
		return cusid;
	}
	public void setCusid(int cusid) {
		this.cusid = cusid;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public String getCusgender() {
		return cusgen;
	}
	public void setCusgen(String cusgen) {
		this.cusgen = cusgen;
	}
	public int getCusnum() {
		return cusnum;
	}
	public void setCusnum(int cusnum) {
		this.cusnum = cusnum;
	}
	public int getCusage() {
		return cusage;
	}
	public void setCusage(int cusage) {
		this.cusage = cusage;
	}
	public String getTrnticket() {
		return trnticket;
	}
	public void setTrnticket(String trnticket) {
		this.trnticket = trnticket;
	}
	public int getTrnid() {
		return trnid;
	}
	public void setTrnid(int trnid) {
		this.trnid = trnid;
	}
	public int getCompt() {
		return compt;
	}
	public void setCompt(int compt) {
		this.compt = compt;
	}
	

}
