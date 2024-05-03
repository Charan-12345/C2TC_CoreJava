package edu.atria.inheritancedemo;

public class grandfather {
private int age;
private String name;
private String address;
private String occupation;
public grandfather(int age, String name, String address, String occupation) {
	super();
	this.age = age;
	this.name = name;
	this.address = address;
	this.occupation = occupation;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return name;
}
public void setGender(String gender) {
	this.name = gender;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getOccupation() {
	return occupation;
}
public void setOccupation(String occupation) {
	this.occupation = occupation;
}
public String toString() {
	return "grandfather [age=" + age + ", gender=" + name + ", address=" + address + ", occupation=" + occupation
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
