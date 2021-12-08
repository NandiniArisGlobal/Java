package day2_project;
import java.util.Scanner;

public class Arithmetic_operations {
    public static void main(String a[]) {
//    	Scanner scan=new Scanner(System.in);  
//       System.out.print("Enter first no"); 
//        int num1= scan.nextInt();  
//        System.out.print("Enter second no");
//        int num2=scan.nextInt();
//        System.out.print("Addition :"+(num1+num2));
//        
//        System.out.print("\n");
//        System.out.print("\n");
        
      //Calculator
        
        Scanner s=new Scanner(System.in); 
        char ans;
        do {
        System.out.print("Enter first no:\n"); 
        int n1= s.nextInt(); 
        System.out.print("Enter second no:\n"); 
        int n2= s.nextInt();
        System.out.print("Select your operation\n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n"); 
        int select= s.nextInt();
        
        
        
        
        if(select==1) {
         System.out.println("Sum of two numbers is: "+(n1+n2) );
  
        }
        else if(select==2) {
        	System.out.println("Difference between two numbers is: "+(n1-n2) );
        }
        else if(select==3) {
        	System.out.println("Product of two numbers is: "+(n1*n2) );
        }
        else if(select==4) {
        	System.out.println("Quotient is: "+(n1/n2) );
        }
        else {
        	System.out.println("Enter valid options");}
        
        System.out.println("Do you want to continue?(y/n): ");
         ans= s.next().charAt(0);
        
        }
        while(ans=='y'|| ans=='Y') ;
        
        System.out.println("Thank You !!! ");
	
    }
}
