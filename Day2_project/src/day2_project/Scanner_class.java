package day2_project;
import java.util.*;

public class Scanner_class {
	 public static void main(String[] args)
	    {
 
		 // Bill for order
		 Scanner sc=new Scanner(System.in); 
		 char ans1;
		 int order,n;
		 int total=0,tea=8,idly=25,dosa=20,meals=100,rice_bath=30;
		 int veg=200,non_veg=300,sweet=50;
		 do {
		 System.out.println("What do you want to have?");
		 System.out.println("\n 1.Breakfast\n 2.Lunch\n 3.Dinner\n");
		 int opt=sc.nextInt();
		 
		 if (opt==1) {
			 do {
			 System.out.println("Breakfast Menu:\n1.Tea: Rs.8\n2.Idly: Rs.25/plate\n3.Dosa: Rs.20/plate");
			 order=sc.nextInt();
			 System.out.println("How many? ");
			 n=sc.nextInt();
			 if(order==1) {
				 total=total+(tea*n);
			 }
			 else if(order==2) {
				 total=total+(idly*n);
			 }
			 else if(order==3) {
				 total=total+(dosa*n);
			 }
			 else {
				 System.out.println("Enter a valid item from the menu");
			 }
			 System.out.println("Do you want to order something more in breakfast menu?(y/n) ");
			 ans1=sc.next().charAt(0);
		 }while(ans1=='y'|| ans1=='Y');}
		 else if (opt==2) {
			 do {
			 System.out.println("Lunch Menu:\n1.Meals: Rs.100\n2.Rice Bath: Rs.30\n");
			 order=sc.nextInt();
			 System.out.println("How many? ");
			 n=sc.nextInt();
			 if(order==1) {
				 total=total+(meals*n);
			 }
			 else if(order==2) {
				 total=total+(rice_bath*n);
			 }
			 else {
				 System.out.println("Enter a valid item from the menu");
			 }
			 System.out.println("Do you want to order something more in lunch menu?(y/n) ");
			 ans1=sc.next().charAt(0);
			 }
			 while(ans1=='y'|| ans1=='Y');
		 }
		 else if (opt==3) {
			 do {
			 System.out.println("Dinner Menu:\n1.Veg Thaali: Rs.200\n2.Non Veg Thaali: Rs.300\n3.Sweet: Rs.50");
			 order=sc.nextInt();
			 System.out.println("How many? ");
			 n=sc.nextInt();
			 if(order==1) {
				 total=total+(veg*n);
			 }
			 else if(order==2) {
				 total=total+(non_veg*n);
			 }
			 else if(order==3) {
				 total=total+(sweet*n);
			 }
			 else {
				 System.out.println("Enter a valid item from the menu");
			 }
			 System.out.println("Do you want to order something more in dinner menu?(y/n) ");
			 ans1=sc.next().charAt(0);
			 }
			 while(ans1=='y'|| ans1=='Y');	 
		 }
		 else {
			 System.out.println("Enter a valid input");
			 break;	 
		 }
		 System.out.println("Do you want to order something more?(y/n) ");
		 ans1=sc.next().charAt(0);
		 }while(ans1=='y'|| ans1=='Y'); 
		 System.out.println("Total Bill: Rs."+total);
		 System.out.println("Thank you !!!");
	}
	}





