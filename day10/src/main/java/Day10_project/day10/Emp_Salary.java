package Day10_project.day10;

import java.util.Scanner;

public class Emp_Salary {
	Scanner s=new Scanner(System.in);
double sal;
Emp_Salary(){
System.out.println("Enter Employee's monthly salary : Rs.");
sal=s.nextDouble();

}
void display() {
	System.out.println("Employee's salary per annum : Rs."+(sal*12));
}
}
