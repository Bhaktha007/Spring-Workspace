package com.example.demo.AnimeList;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Anime_Complex")
public class Alist {
	@Id
	private int id;
	private String A_name;
	private String B_mcname;
	private String C_creator;
	private String D_proname;
	private long E_year;
	private int F_episodes;
	private int G_tduration;
	private String H_status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getA_name() {
		return A_name;
	}
	public void setA_name(String a_name) {
		A_name = a_name;
	}
	public String getB_mcname() {
		return B_mcname;
	}
	public void setB_mcname(String b_mcname) {
		B_mcname = b_mcname;
	}
	public String getC_creator() {
		return C_creator;
	}
	public void setC_creator(String c_creator) {
		C_creator = c_creator;
	}
	public String getD_proname() {
		return D_proname;
	}
	public void setD_proname(String d_proname) {
		D_proname = d_proname;
	}
	public long getE_year() {
		return E_year;
	}
	public void setE_year(long e_year) {
		E_year = e_year;
	}
	public int getF_episodes() {
		return F_episodes;
	}
	public void setF_episodes(int f_episodes) {
		F_episodes = f_episodes;
	}
	public int getG_tduration() {
		return G_tduration;
	}
	public void setG_tduration(int g_tduration) {
		G_tduration = g_tduration;
	}
	public String getH_status() {
		return H_status;
	}
	public void setH_status(String h_status) {
		H_status = h_status;
	}
	
	
	

}
