package day6_project;

import java.util.ArrayList;

public class Employee_list {
    public static void main(String a[]) {
    	ArrayList<Employee> e=new ArrayList<>();
    	Employee e1=new Employee("Nethra",3758);
    	Employee e2= new Employee("Gokul",6675);
    	Employee e3=new Employee("Sukanya",7534);
    	e.add(e1);
    	e.add(e2);
    	e.add(new Employee("Sagar",6513));
    	e.add(e3);
    	
    	for (Employee ee:e) {
    		System.out.println("Employee name: "+ee.name+" Salary: "+ee.salary);
    	}
    }
}

class Employee{
	String name;
	int salary;
	public Employee(String name, int salary) {
//		super();
		this.name = name;
		this.salary = salary;
	}
	
}