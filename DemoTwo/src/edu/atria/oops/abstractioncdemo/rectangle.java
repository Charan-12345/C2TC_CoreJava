package edu.atria.oops.abstractioncdemo;

public class rectangle extends Shape {
	float length;
	float breadth;
	public rectangle(float len, float brea) {
		super();
		this.length= len;
		this.breadth = brea;
	}
	
	public float calculateArea() {
	     return area=length*breadth;
	}
	

}
