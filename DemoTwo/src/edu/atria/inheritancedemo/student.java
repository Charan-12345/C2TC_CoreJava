package edu.atria.inheritancedemo;

import java.util.Date;

public class student extends Citizen {
	
	private int id;
	private String name;
	private String department;
	
	public student(long addharNumber, String nationality, String address, String dob, char gender,
			int id,String name,String department) {
		super(addharNumber, nationality, address, dob, gender);
		this.id=id;
		this.name=name;
		this.department=department;
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
		
	}

	public String toString() {
		return "student [id=" + id + ", name=" + name + ", department=" + department + ", getAddharNumber()="
				+ getAddharNumber() + ", getNationality()=" + getNationality() + ", getAddress()=" + getAddress()
				+ ", getDob()=" + getDob() + ", getGender()=" + getGender() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
