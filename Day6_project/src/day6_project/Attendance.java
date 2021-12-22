package day6_project;

import java.util.ArrayList;

public class Attendance {
    public static void main(String a[]) {
    	ArrayList<Student1> s=new ArrayList<>();
    	Student1 s1=new Student1("Shakthi","present");
    	Student1 s2=new Student1("Vinitha","present");
    	Student1 s3=new Student1("Dinesh","pressent");
    	Student1 s4=new Student1("Nandini","absent");
    	s.add(s1);
    	s.add(s2);
    	s.add(s3);
    	s.add(s4);
    	for (Student1 ss:s) {
    		System.out.println("Student name: "+ss.name+"   Attendance: "+ss.attendance);
    	}
    }
}


class Student1{
	String name;
	String attendance;
	public Student1(String name, String attendance) {
		
		this.name = name;
		this.attendance = attendance;
	}
}

