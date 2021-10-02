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
	private String CollegeName;
	private String Username;
	private String Password;
	private int CollegePhoneNumber;
	private String CollegePostalAddress;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
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
	public int getCollegePhoneNumber() {
		return CollegePhoneNumber;
	}
	public void setCollegePhoneNumber(int collegePhoneNumber) {
		CollegePhoneNumber = collegePhoneNumber;
	}
	public String getCollegePostalAddress() {
		return CollegePostalAddress;
	}
	public void setCollegePostalAddress(String collegePostalAddress) {
		CollegePostalAddress = collegePostalAddress;
	}
	

}
