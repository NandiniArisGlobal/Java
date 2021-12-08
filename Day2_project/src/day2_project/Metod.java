package day2_project;
import java.util.*;

public class Metod {
    public static void main(String[] args) {
    	
    	Metod m=new Metod();
    	m.factorial(8);
    	float n=m.sum(34.5f,665.76f);
    	System.out.println("The sum of the given numbers is "+n);
    	m.area();
    	m.area(14.3f);
    	m.area(5.6f,7.5f);
    }
    
    void factorial(int x) {
    	int i=1;
    	for (int y=x;y>=1;y--) {
    		i=i*y;
    	}
    	System.out.println("Factorial of "+x+" is "+i);
    }
    
    float sum(float a,float b) {
    	return(a+b);
    }
    
    void area() {
    	float pi=(22/7),r=3.14f;
    	float areac=2*pi*r;
    	System.out.println("Area of the circle with radius "+r+" is "+areac);
    }
    
    void area(float l, float b) {
    	System.out.println("Area of rectangle with dimension l="+l+" and b="+b+" is "+(l*b));
    }
    
    void area(float side) {
    	System.out.println("Area of square with given side "+side+" is "+(side*side));
    }
}
