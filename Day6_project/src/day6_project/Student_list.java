package day6_project;

import java.util.ArrayList;

public class Student_list {
    public static void main(String a[]) {
    	ArrayList<student> l=new ArrayList<>();
    	student s1=new student("nandini","34");
    	student s2=new student("sandhya","45");
    	student s3=new student("madhu","23");
    	l.add(s1);
    	l.add(s2);
    	l.add(s3);
    	for (student s:l) {
    		System.out.println("Student name: "+s.name+" Id: "+s.id);
    	}
    }
}

class student{
	String name;
	String id;
	public student(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
}

