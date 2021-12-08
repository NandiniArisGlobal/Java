package day3_project;

public class Constructor {
	public static void main(String[] args) {
		Employee e=new Employee("12","35000");
		System.out.println(e.getDetails());
		Car c=new Car("Honda Odyssey","Honda");
		System.out.println(c.getDetails());
		Area a=new Area(3.8f);
		System.out.println("Area of circle is "+(a.getAreac()));
		Area a1=new Area(34,7);
		System.out.println("Area of rectangle is "+(a1.getArear()));
		Area a2=new Area(52);
		System.out.println("Area of square is "+(a2.getAreas()));
		Triangle t=new Triangle();
		System.out.println("Perimeter of the triangle is "+(t.getp()));
		System.out.println("Area of the triangle is "+(t.geta()));
		Student s=new Student("Nandini S");
		Student s1=new Student();
	}

}
class Employee{
	String id,salary;
	Employee(String x,String sal){
		id=x;
		salary=sal;
	}
	String getDetails() {
		return(id+" "+salary);
	}
}

class Car{
	String car_name,car_brand;
	
	Car(String name,String brand ){
		car_name=name;
		car_brand=brand;
	}
	String getDetails() {
		return (car_name+"- "+car_brand);
	}
}


class Area{
	float r;
	int l,b,a;
	Area (float rad){
		r=rad;
	}
	float getAreac() {
		float pi=(22/7);
		return (2*pi*r);
	}
	
	Area (int a,int b ){
		l=a;
		this.b=b;
	}
	int getArear() {
		return(l*b);
	}
	Area (int side ){
		 this.a=side;
	}
	int getAreas() {
		return(a*a);
	}
}

class Triangle{
	int a=3,b=4,c=5;
	double p,s,area;
	
	Triangle(){
		p=a+b+c;
		s=p/2;       //semi-primeter
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	double getp() {
		return (p);
		
	}
	double geta() {
		
		return(area);
	}
}

class Student{
	String name;
	Student(String n){
		name=n;
		System.out.println("Student Name : "+name);
	}
	Student(){
		System.out.println("The name is unknown");
	}
}


