package day7_project;

import java.util.HashMap;
import java.util.Map.Entry;

public class Object {
	 public static void main(String a[]) {
	    	HashMap<String,Student> s=new HashMap<>();
	    	      //(Key,value) pair
	    	Student s1=new Student("Nandini",18);
	    	Student s2=new Student("Sandhya",32);
	    	Student s3=new Student("Madhu",15);
	    	s.put("Student1  ", s1);
	    	s.put("Student2  ", s2);
	    	s.put("Student3  ", s3);
	    	for (Entry<String, Student> c:s.entrySet()) {
	    		System.out.println(c.getKey()+c.getValue());
	    	}
	    	
	    }
}


class Student{
	String name;
	int id;
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String toString() {
		return("Name : "+name+" Id : "+id);
	}
}