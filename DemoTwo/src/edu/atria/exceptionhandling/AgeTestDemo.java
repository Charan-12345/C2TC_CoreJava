package edu.atria.exceptionhandling;

import java.util.Scanner;

public class AgeTestDemo {   //static  no need to call objects
	static void validate(int age) throws InvalidAgeException {
		if(age<18) {
		throw new InvalidAgeException("invalid age!,you are not eligible to vote");
	} else {
		System.out.println("you are eligible to vote");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc=new Scanner(System.in);
System.out.println("enter your age");
age=sc.nextInt();
try {
	validate(age);
}catch(InvalidAgeException i) {
	System.out.println("exception caught..."+i.getMessage());
	}
sc.close();

	}

}
