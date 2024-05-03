package edu.atria.inheritancedemo;

public class father extends grandfather { //inheritance means extends

		// TODO Auto-generated constructor stub
	
private int age;
private String name;
private String address;
private String occupation;
public father(int age, String name, String address, String occupation) {
	super(age, name, address, occupation);
	
}

public father(int age, String name, String address, String occupation, int age2, String name2, String address2,
		String occupation2) {
	super(age, name, address, occupation);
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
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
	return "father [age=" + age + ", name=" + name + ", address=" + address + ", occupation=" + occupation + super.toString();
}
}