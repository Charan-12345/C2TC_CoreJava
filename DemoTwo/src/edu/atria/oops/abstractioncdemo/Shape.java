package edu.atria.oops.abstractioncdemo;

public abstract class Shape {    //abstract should be given for  class name because abstract method has declared
	//static float area;
	float area;
	
public abstract float calculateArea();         // return type float  // abstract method 

/*public static final void display() {   // non abstract method or concrete method
	System.out.println("area of the shape:"+area);*/
	public void display() {
	System.out.println("area of the shape:"+area);
	}
}

