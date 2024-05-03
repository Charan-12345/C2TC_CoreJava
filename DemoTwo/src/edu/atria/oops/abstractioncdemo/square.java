package edu.atria.oops.abstractioncdemo;

public class square extends Shape {
float side;

	
	public square(float side) {
	super();
	this.side = side;
}



	public float calculateArea() {
		// TODO Auto-generated method stub
		return area=side*side;
	}

}
