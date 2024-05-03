package edu.atria.inheritancedemo;

public class mutlilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grandfather sOne = new father(70,"kumar","vyalikaval","business",50,"rock","vyalikaval","marketing");
		System.out.println(sOne);
		
		father fTwo = new son(50,"rock","vyalikaval","marketing",24,"richard","vyalikaval","developer");
		System.out.println(fTwo);

	}

}
