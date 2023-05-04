package com.example.ques.QuestionAnswer;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class Questionmodel {

		@Id
		private int qno;
		private String qname;
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn
		private Answermodel ans;

		public int getQno() {
			return qno;
		}

		public void setQno(int qno) {
			this.qno = qno;
		}

		public String getQname() {
			return qname;
		}

		public void setQname(String qname) {
			this.qname = qname;
		}

		public Answermodel getAns() {
			return ans;
		}

		public void setAns(Answermodel ans) {
			this.ans = ans;
		}
}
