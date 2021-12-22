package Day10_project.day10;
import java.util.Scanner;

public class Student_address {
	Scanner s=new Scanner(System.in);
    String add;
    Student_address(){
    	System.out.println("Enter the address :");
		add=s.next();
		
    }
    void display() {
    	System.out.println("Address of the student : "+add);
    }
}
