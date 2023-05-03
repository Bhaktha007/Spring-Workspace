package com.example.demo.AnimeList;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Anime_Complex")
public class Alist {
	@Id
	private int AnimeId;
	private String Aname;
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	private String mcname;
	private String AniCreator;
	private String prod;
	private int year;
	private int episodes;
	private int tduration;
	private String status;
	private String username;
	private int userid;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUesrname() {
		return username;
	}
	public void setUesrname(String username) {
		this.username = username;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getAnimeId() {
		return AnimeId;
	}
	public void setAnimeId(int animeId) {
		AnimeId = animeId;
	}
	public String getMcname() {
		return mcname;
	}
	public void setMcname(String mcname) {
		this.mcname = mcname;
	}
	public String getAniCreator() {
		return AniCreator;
	}
	public void setAniCreator(String aniCreator) {
		AniCreator = aniCreator;
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
