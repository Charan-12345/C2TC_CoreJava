package edu.atria.inheritancedemo;

public class Mp extends Citizen {
	private int age;
	 private String name;
	 private int mpId;
	 private String party;
	 private String locality;
	public Mp(long addharNumber, String nationality, String address, String dob, char gender, int age, String name,
			int mpId, String party, String locality) {
		super(addharNumber, nationality, address, dob, gender);
		this.age = age;
		this.name = name;
		this.mpId = mpId;
		this.party = party;
		this.locality = locality;
		
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
	public int getMpId() {
		return mpId;
	}
	public void setMpId(int mpId) {
		this.mpId = mpId;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String toString() {
		return "Mp [age=" + age + ", name=" + name + ", mpId=" + mpId + ", party=" + party + ", locality=" + locality
				+ ", getAddharNumber()=" + getAddharNumber() + ", getNationality()=" + getNationality()
				+ ", getAddress()=" + getAddress() + ", getDob()=" + getDob() + ", getGender()=" + getGender()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	
	}

}