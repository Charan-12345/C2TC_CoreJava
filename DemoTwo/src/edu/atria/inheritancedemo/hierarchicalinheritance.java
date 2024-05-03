package edu.atria.inheritancedemo;

public class hierarchicalinheritance {

	public static void main(String[] args) {
		Mp mone=new Mp(98767483543423L,"Indian","bangalore","2000-09-20",'M',45,"shivakumar",235,"bjp","bangalore");
		// we are printing dynamic binding using parent class while creating object in case if we print Citizen
System.out.println(mone);
  
student sone = new student(98767483543423L,"Indian","bangalore","2000-09-20",'M',101,"rahul","MCA");
System.out.println(sone);
	}

}
