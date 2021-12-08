package day1_prjt;

public class conditional_statement {

	public static void main(String[] args) {
		
		//check the no is even or odd
		int a=80;
		if (a%2==0) {
			System.out.print(a+" is an even number\n");
		}
		else {
			System.out.print(a+" is an odd number\n");
		}
	
	//check the no is +ve or -ve
	
	int a1=-11;
	if(a1>=0) {
		System.out.print(a1+" is a positive number\n");
	}
	else {
		System.out.print(a1+" is a negative number\n");
	}
	
	//check the greatest of 3 nos
	
	int x=8,y=2,z=3;
	if(x>y && x>z) {
		System.out.print(x+" is greater\n");
	}
	else if(y>x && y>z) {
		System.out.print(y+" is greater\n");
	}
	else{
		System.out.print(z+" is greater\n");
	}
	
	//check the grade of a student(a,b,c)
	
	int marka=78,markb=57,markc=30;
	if(marka>=80 && marka<=100) {
		System.out.print("Student 1 : S Grade\n");
	}
	else if(marka>=60 && marka<80) {
		System.out.print("Student 1 : A Grade\n");
	}
	else if(marka>=40 && marka<60) {
		System.out.print("Student 1 : B Grade\n");
	}
	else {
		System.out.print("Student 1 : Fail\n");
	}
	//mark b
	if(markb>=60 && markb<=100) {
		System.out.print("Student 2 : S Grade\n");
	}
	else if(markb>=60 && markb<80) {
		System.out.print("Student 2 : A Grade\n");
	}
	else if(markb>=40 && markb<60) {
		System.out.print("Student 2 : B Grade\n");
	}
	else {
		System.out.print("Student 2 : Fail\n");
	}
	//mark c
	if(markc>=60 && markc<=100) {
		System.out.print("Student 3 : S Grade\n");
	}
	else if(markc>=60 && markc<80) {
		System.out.print("Student 1 : A Grade\n");
	}
	else if(markc>=40 && markc<60) {
		System.out.print("Student 1 : B Grade\n");
	}
	else {
		System.out.print("Student 3 : Fail\n");
	}
	
	//Greatest of 4 numbers
	
	int num1=56,num2=62,num3=33,num4=44;
	if(num1>num2 && num1>num3 &&num1>num4) {
		System.out.print(num1+" is greater\n");
	}
	else if(num2>num1 && num2>num3 &&num2>num4) {
		System.out.print(num2+" is greater\n");
	}
	else if(num3>num1 && num3>num2 &&num3>num4) {
		System.out.print(num3+" is greater\n");
	}
	else{
		System.out.print(num4+" is greater\n");
	}
	
	//Generate bill of calls
	
	int calls=290, call_cost=0;
	if (calls>0 && calls<=100) {
		System.out.print("\nNo call charges/ The call cost is Rs."+call_cost);
	}
	else if (calls>100 && calls<=200) {
		System.out.print("\nCall charge : Rs.1/call");
		System.out.print("\nNumber of calls : "+calls);
		System.out.print("\nThe call cost is Rs."+(call_cost+calls-100));
	}
	else if (calls>200 && calls<=300) {
		System.out.print("\nCall charge : Rs.2/call");
		System.out.print("\nNumber of calls : "+calls);
		call_cost=100+(calls-200)*2;
		System.out.print("\nThe call cost is Rs."+call_cost);
	}
	else {
		System.out.print("\nCall charge : Rs.3/call");
		System.out.print("\nNumber of calls : "+calls);
		call_cost=300+(calls-300)*3;
		System.out.print("\nThe call cost is Rs."+call_cost);
	}
	System.out.print("\n");
	
	//Generate electricity bill
	

	int unit=101, unit_cost=0;
	if (unit>0 && unit<=50) {
		System.out.print("\nNo charges/ The cost is Rs."+unit_cost);
	}
	else if (unit>50 && unit<=100) {
		System.out.print("\nPer unit charge : Rs.6/unit");
		System.out.print("\nUnits consumed : "+unit);
		unit_cost=(unit-50)*6;
		System.out.print("\nThe cost is Rs."+unit_cost);
	}
	else if (unit>100 && unit<=150) {
		System.out.print("\nPer unit charge : Rs.8/unit");
		System.out.print("\nUnits consumed : "+unit);
		unit_cost=300+(unit-100)*8;
		System.out.print("\nThe cost is Rs."+unit_cost);
	}
	else {
		System.out.print("\nPer unit charge : Rs.9/unit");
		System.out.print("\nUnits consumed : "+unit);
		unit_cost=400+(unit-150)*9;
		System.out.print("\nThe cost is Rs."+unit_cost);
	}
	}}
