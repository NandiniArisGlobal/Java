package day3_project;
import java.util.*;

public class Inheritance {
      public static void main(String[] args) {
    	  Result m=new Result();
    	  m.ReadDetails();
    	  m.ReadMarks();
    	  m.displayDetails();
    	  m.displayMarks();
    	  m.CalculateResult();
    	  m.DisplayResult();
      }
}

class Student1{
	int stuId;
	String stuName,phone;
	 void ReadDetails() {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter name : ");
		 String Name=s.nextLine();
		 stuName=Name;
		 System.out.println("Enter ID : ");
		 int Id=s.nextInt();
		 stuId=Id;
		 System.out.println("Enter phone number : ");
		 String phone=s.next();
		 this.phone=phone;
	 }
	 void displayDetails() {
		 System.out.println("......Student Details......\n");
		 System.out.println("NAME : "+stuName);
		 System.out.println("ID : "+stuId);
		 System.out.println("PHONE : "+phone);
	 }
}

class Marks extends Student1 {
	int m1,m2,m3;
	void ReadMarks() {
		
		Scanner s=new Scanner(System.in);
		 System.out.println("Enter test 1 marks : ");
		 int m1=s.nextInt();
		 this.m1=m1;
		 System.out.println("Enter test 2 marks : ");
		 int m2=s.nextInt();	
		 this.m2=m2;
		 System.out.println("Enter test 3 marks : ");
		 int m3=s.nextInt();
		 this.m3=m3;
		 
	}
	void displayMarks() {
		System.out.println("MARK 1 : "+m1);
		System.out.println("MARK 2 : "+m2);
		System.out.println("MARK 3 : "+m3);
	}
}

class Result extends Marks {
	
	double total,percent;
	String grade;
	void CalculateResult() {
		total=super.m1+super.m2+super.m3;
		percent=(total/150)*100;
	}
	void DisplayResult() {
		System.out.println("TOTAL MARKS : "+total+"/150");
		System.out.println("PECENTAGE : "+percent);
		if (percent>=80 && percent<=100) {
			System.out.println("GRADE : First Class");
		}
		else if (percent>=60 && percent<80) {
			System.out.println("GRADE : Second Class");
		}
		else if (percent>=40 && percent<60) {
			System.out.println("GRADE : Third Class");
		}
		else  {
			System.out.println("GRADE : Fail");
		}
	}
}
