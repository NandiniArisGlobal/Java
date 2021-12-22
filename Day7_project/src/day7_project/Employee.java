package day7_project;

import java.util.HashMap;
import java.util.Map.Entry;

public class Employee {
	 public static void main(String a[]) {
	    	HashMap<String,Employee_list> s=new HashMap<>();
	    	      //(Key,value) pair
	    	Employee_list s1=new Employee_list("Nandini",18,5000);
	    	Employee_list s2=new Employee_list("Sandhya",32,7000);
	    	Employee_list s3=new Employee_list("Madhu",15,3000);
	    	s.put("Employee1  ", s1);
	    	s.put("Employee2  ", s2);
	    	s.put("Employee3  ", s3);
	    	for (Entry<String, Employee_list> c:s.entrySet()) {
	    		System.out.println(c.getKey()+c.getValue());
	    	}
	    	
	    }
}


class Employee_list{
	String name;
	int id;
	double sal;
	public Employee_list(String name, int id, double sal) {
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	public String toString() {
		return("Name : "+name+"    Id : "+id+"    Salary : "+sal);
	}
}

