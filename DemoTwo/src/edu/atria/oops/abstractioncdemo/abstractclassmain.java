package edu.atria.oops.abstractioncdemo;

public class abstractclassmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* cannot instantiate abstract class shape
 * Shape sOne = new Shape();
 */
		// dynamic binding is parent class using child class
	Shape sOne = new square(2.5f);
	sOne.calculateArea();
	sOne.display();
	
	Shape sTwo = new rectangle(7,7.5f);
	sTwo.calculateArea();
	sTwo.display();
	}

}
