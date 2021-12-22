package day7_project;

import java.util.HashMap;
import java.util.Map.Entry;

public class Teacher_list {
	 public static void main(String a[]) {
	    	HashMap<String,Teacher> s=new HashMap<>();
	    	      //(Key,value) pair
	    	Teacher s1=new Teacher("Nandini",18,5);
	    	Teacher s2=new Teacher("Sandhya",32,7);
	    	Teacher s3=new Teacher("Madhu",15,3);
	    	Teacher s4=new Teacher("Sadhu",30,8);
	    	s.put("Teacher1  ", s1);
	    	s.put("Teacher2  ", s2);
	    	s.put("Teacher3  ", s3);
	    	for (Entry<String, Teacher> c:s.entrySet()) {
	    		System.out.println(c.getKey()+" "+c.getValue());
	    	}
//	    	s.clear();
	    	int n=s.size();
	    	System.out.println("List size: "+n);
	    	boolean a1= s.isEmpty();
	    	System.out.println("List is empty: "+a1);
	    	s.replace("Teacher2", s4);
	    	for (Entry<String, Teacher> c:s.entrySet()) {
	    		System.out.println(c.getKey()+" "+c.getValue());
	    	}
	    	System.out.println("\n");
	    	s.remove(s1);
	    	for (Entry<String, Teacher> c:s.entrySet()) {
	    		System.out.println(c.getKey()+" "+c.getValue());
	    	}
	    	System.out.println(s.size());
	    }
}


class Teacher{
	String name;
	int id,clss;
	
	public Teacher(String name, int id, int clss) {
		super();
		this.name = name;
		this.id = id;
		this.clss = clss;
	}

	public String toString() {
		return("Name : "+name+"    Id : "+id+"    Class : "+clss);
	}
}

