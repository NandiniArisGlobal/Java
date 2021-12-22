package demo;

public class Student {
String sname,roll;

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public String getRoll() {
	return roll;
}

public void setRoll(String roll) {
	this.roll = roll;
}
void display() {
	System.out.println("Name : "+sname+"   Roll no: "+roll);
}
}
