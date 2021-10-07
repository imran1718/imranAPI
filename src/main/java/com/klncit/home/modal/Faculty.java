package com.klncit.home.modal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Faculty {	
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Id
		private int id;
		private String Facultyname;
		private String Qualification;
		private String Exprience;
		private String Skillset;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFacultyname() {
			return Facultyname;
		}
		public void setFacultyname(String facultyname) {
			Facultyname = facultyname;
		}
		public String getQualification() {
			return Qualification;
		}
		public void setQualification(String qualification) {
			Qualification = qualification;
		}
		public String getExprience() {
			return Exprience;
		}
		public void setExprience(String exprience) {
			Exprience = exprience;
		}
		public String getSkillset() {
			return Skillset;
		}
		public void setSkillset(String skillset) {
			Skillset = skillset;
		}
		
		
		
}
