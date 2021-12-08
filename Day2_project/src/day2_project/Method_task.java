package day2_project;

public class Method_task {
	
     public static void main(String [] args) {
    	 Method_task m=new Method_task();
    	 int x=3;
    	 String num=m.number(x);
    	 System.out.println("The given number "+x+" is "+num);
    	 int y=-754;
    	 String num1=m.fun(y);
    	 System.out.println("The given number "+y+" is a "+num1);
    	 int sum=m.add();
    	 System.out.println("The sum of first 100 numbers is "+sum);
    	 int side=88;
    	 int a1=m.area(side);
    	 System.out.println("The area of square with side "+side+" is "+a1);
    	 int l=67,b=25;
    	 int a2=m.area(l,b);
    	 System.out.println("Area of rectangle with dimension l="+l+" and b="+b+" is "+a2);
    	 float pi=(22/7),r=36;
    	 float a3=m.area(pi,r);
    	 System.out.println("Area of the circle with radius "+r+" is "+a3);
    	 
    	 
     }
     
     
     
     // Even or odd
     String number(int x) {
    	 if(x%2==0) {
    		 return("even");
    	 }
    	 else {
    		 return("odd");
    	 }
     }
     
     //positive or negative
     String fun(int y) {
    	 if(y<0) {
    		 return("negative number");
    	 }
    	 else {
    		 return("positive number");
    	 }
     }
     
     //sum of first 100 numbers
     int add() {
    	 int sum=0;
    	 for(int i=1;i<=100;i++) {
    		 sum+=i;
    	 }
    	 return(sum);
     }
     
     //area
     int area(int side) {
    	 int a1=side*side;
    	 return(a1);
     }
     int area(int l,int b) {
    	 int a2=l*b;
    	 return(a2);
     }
     float area(float pi,float r) {
    	 float a3=2*pi*r;
    	 return(a3);
     }
}
