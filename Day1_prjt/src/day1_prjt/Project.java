package day1_prjt;

public class Project {
	public static void main (String a[])
	{
    String name="Nandini S";
    String course="Java";
    int age=22;
	System.out.print("Hello\n");
	System.out.print("My Details.....\n");
	System.out.print("My name is "+name);
	System.out.print("\nI am learning "+course);
	System.out.print("\nMy age is "+age);
	
    //Simple interest
	float si,p=530, r=3.5f,t=2;
	si=(p*r*t)/100;
	System.out.print("\nThe simple interest is "+si);
	
	//Average of 5numbers
	float avg,n1=29,n2=56.3f,n3=73,n4=36,n5=46.3f;
	avg=(n1+n2+n3+n4+n5)/5;
	System.out.print("\nThe average of 5 numbers is "+avg);
	
	//Area of rectangle
	float rect,l=52,b=86;
	rect=l*b;
	System.out.print("\nThe area of the rectangle is "+rect);
	
	//Area of circle
	float circle,rad=5,pi=(22/7);
	circle=2*pi*rad;
	System.out.print("\nThe area of the circle is "+circle);
	
	//Area of square
	double square,side=78.43;
	square=side*side;
	System.out.print("\nThe area of the square is "+square);
	}

}
