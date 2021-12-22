package day6_project;

import java.util.ArrayList;

public class Books {
    public static void main(String a[]) {
    	ArrayList<book_details> b=new ArrayList<>();
    	book_details b1=new book_details("Wings",430,"Nandini",600);
    	book_details b2=new book_details("Sky",450,"Jaya",850);
    	book_details b3=new book_details("Harsh",480,"Madhu",700);
    	b.add(b1);
    	b.add(b2);
    	b.add(b3);
    	
    	for(book_details s:b) {
    		System.out.println("Book Name: "+s.bookname+"   Book Id: "+s.id+"   Author Name: "
    				+s.author+"   Price: "+s.price);
    	}
//    	b.clear();
//    	for(book_details s:b) {
//    		System.out.println("Book Name: "+s.bookname+"   Book Id: "+s.id+"   Author Name: "
//    				+s.author+"   Price: "+s.price);
//    	}
 	
    	System.out.println("\n");
    	b.remove(b1);
    	for(book_details s:b) {
    		System.out.println("Book Name: "+s.bookname+"   Book Id: "+s.id+"   Author Name: "
    				+s.author+"   Price: "+s.price);
    	}
    	System.out.println("\n");
    	b.remove(b2);
    	for(book_details s:b) {
    		System.out.println("Book Name: "+s.bookname+"   Book Id: "+s.id+"   Author Name: "
    				+s.author+"   Price: "+s.price);
    	}
    	System.out.println("\n");
    	b.add(b1);
    	b.add(b2);
    	for(book_details s:b) {
    		System.out.println("Book Name: "+s.bookname+"   Book Id: "+s.id+"   Author Name: "
    				+s.author+"   Price: "+s.price);
    	}
    	System.out.println("\n");
    	b.removeAll(b);
    	for(book_details s:b) {
    		System.out.println("Book Name: "+s.bookname+"   Book Id: "+s.id+"   Author Name: "
    				+s.author+"   Price: "+s.price);
    	}
    	System.out.println("\n");
    	
    	for(book_details s:b) {
    		System.out.println("Book Name: "+s.bookname+"   Book Id: "+s.id+"   Author Name: "
    				+s.author+"   Price: "+s.price);
    	}
    }
    
}


class book_details{
	String bookname;
	int id;
	String author;
	int price;
	public book_details(String bookname, int id, String author, int price) {
		this.bookname = bookname;
		this.id = id;
		this.author = author;
		this.price = price;
	}
	
	
}