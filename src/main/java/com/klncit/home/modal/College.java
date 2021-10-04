package com.klncit.home.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String Collegename;
	private String Username;
	private String Password;
	private long Collegenumber;
	private String Collegeaddress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollegename() {
		return Collegename;
	}
	public void setCollegename(String collegename) {
		Collegename = collegename;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public long getCollegenumber() {
		return Collegenumber;
	}
	public void setCollegenumber(long collegenumber) {
		Collegenumber = collegenumber;
	}
	public String getCollegeaddress() {
		return Collegeaddress;
	}
	public void setCollegeaddress(String collegeaddress) {
		Collegeaddress = collegeaddress;
	}
	
	
	
}
