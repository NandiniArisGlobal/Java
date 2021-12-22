package day7_project;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Books_list {
	 public static void main(String a[]) {
		    Scanner sc=new Scanner (System.in);
	    	HashMap<Integer,books> s=new HashMap<>();
	    	System.out.println("Enter the size of the list");
	    	int n=sc.nextInt();
	    	int key=1;
	    	for(int i=0;i<n;i++) {
		    	System.out.println("Enter the book name, id and price");
		    	
		    	String name=sc.next();
		    	int id=sc.nextInt();
		    	double price=sc.nextDouble();
		    	books b=new books(name,id,price);
		    	s.put(key, b);
		    	key++;
	    	}
	    	
	    	for (Map.Entry<Integer, books> c:s.entrySet()) {
	    		System.out.println(c.getKey()+".  "+c.getValue());
	    	}
	    	
	    }
}


class books{
	String name;
	int id;
	double price;
	public books(String name, int id, double price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}
	public String toString() {
		return("Book Name : "+name+"    Id : "+id+"    Salary : "+price);
	}
}

