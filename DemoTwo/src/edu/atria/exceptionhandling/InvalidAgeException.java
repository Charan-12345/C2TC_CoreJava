package edu.atria.exceptionhandling;
// program to demonstrate custom exception
public class InvalidAgeException extends Exception{
//public InvalidAgeException() {
//	super("invalid age");
//}
public InvalidAgeException(String message) {
	super(message);
}
}
