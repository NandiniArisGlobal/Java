package day4_project;
import java.util.*; 


public class Interface implements IVehicle{
   public static void main(String[] args) {
	   Interface i=new Interface();
	   int numPassengers=2;
	   String vehicleName="bike";
	   double cost=i.tuneUpCost(vehicleName);
	   System.out.println("The tune-up cost of "+vehicleName+ " is $"+cost);
	   boolean a=i.canCarry(numPassengers) ;
	   if (a==true) {
		   System.out.println("The vehicle can carry "+numPassengers +" passengers");
	   }
	   else {
		   System.out.println("Passenger Overload");
	   }
   }

@Override
public double tuneUpCost(String vehicleName) {
	// TODO Auto-generated method stub
	if (vehicleName=="car") {
		return 150;
	}
	else if (vehicleName=="bicycle") {
		return 50;
	}
	else if (vehicleName=="bike") {
		return 100;
	}
	else {
		return 0;
	}
	
}

@Override
public boolean canCarry(int numPassengers) {
	// TODO Auto-generated method stub
	if (numPassengers<=4) {
		return(true);
	}
	else {
		return false;
	}
	}
   }

interface IVehicle{
	double tuneUpCost(String vehicleName);
	public boolean canCarry(int numPassengers);
}



//
// interface IVehicle {
// indicate how much a basic tune-up costs
//public double tuneUpCost();
//
//determine whether vehicle can hold given num of passengers
//public boolean canCarry(int numPassengers);
//}


//Write a program to create interface A in this
//interface we have two method meth1 and meth2. Implements this
//interface in another class named MyClass

interface A{
	void method1() ;
	void method2();
}

 class MyClass implements A{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method 1");	
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method 2");
	}
	
	public static void main(String[] args) {
		MyClass m=new MyClass();
		m.method1();
		m.method2();
	}
	
}