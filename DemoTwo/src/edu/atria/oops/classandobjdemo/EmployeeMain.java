package edu.atria.oops.classandobjdemo;
import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the employee details....");
		int id=sc.nextInt();
		String name=sc.next();
		float salary=sc.nextFloat();
		String department=sc.next();
		
		Employee eone = new Employee();
		eone.setId(id);
		eone.setName(name);
		eone.setSalary(salary);
		eone.setDepartment(department);
		System.out.println(eone);
		
		Employee etwo = new Employee(id,name,salary,department);
		System.out.println(etwo);
		

	}

}
