package day6_project;

import java.util.ArrayList;

public class Marks {
    public static void main(String a[]) {
    	ArrayList<stu> s=new ArrayList<>();
    	stu s1=new stu("Nandini",430,482,453);
    	stu s2=new stu("Madhu",450,389,490);
    	stu s3=new stu("Sandhya",480,462,400);
    	s.add(s1);
    	s.add(s2);
    	s.add(s3);
    	for(stu ss:s) {
    		System.out.println("Student name: "+ss.name+"   Mark1: "+ss.mark1+"   Mark2: "
    				+ss.mark2+"   Mark3: "+ss.mark3);
    	}
    }
}

class stu{
	String name;
	int mark1,mark2,mark3;
	public stu(String name, int mark1, int mark2, int mark3) {
		super();
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
}