package com.example.demo.AnimeList;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Anime_Complex")
public class Alist {
	@Id
		private int AnimeId;
		private String AnimeName;
		private String mcname;
		private String AnimeCreator;
		private String prod;
		private int year;
		private int episodes;
		private int tduration;
		private String Status;
		public int getAnimeId() {
			return AnimeId;
		}
		public void setAnimeId(int animeId) {
			AnimeId = animeId;
		}
		public String getAnimeName() {
			return AnimeName;
		}
		public void setAnimeName(String animeName) {
			AnimeName = animeName;
		}
		public String getMcname() {
			return mcname;
		}
		public void setMcname(String mcname) {
			this.mcname = mcname;
		}
		public String getAnimeCreator() {
			return AnimeCreator;
		}
		public void setAnimeCreator(String animeCreator) {
			AnimeCreator = animeCreator;
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
			return Status;
		}
		public void setStatus(String status) {
			Status = status;
		}
		
}
