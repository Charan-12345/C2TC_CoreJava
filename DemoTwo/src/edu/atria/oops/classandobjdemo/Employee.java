package edu.atria.oops.classandobjdemo;

public class Employee {

	private int id;
	private String name;
	private float salary;
	private String department;
		
	public Employee() {
		System.out.println("default constructor is called.....");
	}
     public Employee(int id,String name,float salary,String department) {
    	 System.out.println("parameterized constructor is called......");
    	 this.id=id;
    	 this.name=name;
    	 this.salary=salary;
    	 this.department=department;
    	 
     }
     //getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
	
	
	}


