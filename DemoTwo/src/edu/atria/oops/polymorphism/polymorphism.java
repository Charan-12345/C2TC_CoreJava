package edu.atria.oops.polymorphism;

public class polymorphism extends Rbi{

	public static void main(String[] args) {
		Rbi bankOne = new Sbi();
		System.out.println(bankOne.getRI());
		
		
		Rbi bankTwo = new Icici();
		System.out.println(bankTwo.getRI());

	}

}
