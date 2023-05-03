package com.example.demo.AnimeList;

import com.example.demo.AnimeList.Login;
	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name="login_check")
	public class Login {
		@Id
		private int ownerid;
		private String ownername;
		private String ownerpassword;
		public int getOwnerid() {
			return ownerid;
		}
		public void setOwnerid(int ownerid) {
			this.ownerid = ownerid;
		}
		public String getOwnername() {
			return ownername;
		}
		public void setOwnername(String ownername) {
			this.ownername = ownername;
		}
		public String getOwnerpassword() {
			return ownerpassword;
		}
		public void setOwnerpassword(String ownerpassword) {
			this.ownerpassword = ownerpassword;
		}
		
}