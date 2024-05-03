package edu.atria.inheritancedemo;

import java.util.*;

public class Citizen {
      private long addharNumber;
      private String nationality;
      private String address;
      private String dob;
      private char gender;
	public Citizen(long addharNumber, String nationality, String address, String dob, char gender) {
		super();
		this.addharNumber = addharNumber;
		this.nationality = nationality;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
	}
	public long getAddharNumber() {
		return addharNumber;
	}
	public void setAddharNumber(long addharNumber) {
		this.addharNumber = addharNumber;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
		
	}
	public String toString() {
		return "Citizen [addharNumber=" + addharNumber + ", nationality=" + nationality + ", address=" + address
				+ ", dob=" + dob + ", gender=" + gender + "]";
	}
      

}
